package com.entity.view;

import com.entity.BanzhurenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班主任
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 10:40:53
 */
@TableName("banzhuren")
public class BanzhurenView  extends BanzhurenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanzhurenView(){
	}
 
 	public BanzhurenView(BanzhurenEntity banzhurenEntity){
 	try {
			BeanUtils.copyProperties(this, banzhurenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
