package com.msb.mall.product.dao;

import com.msb.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xnxdtm
 * @email xnxdtm@163.com
 * @date 2023-03-21 06:22:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
