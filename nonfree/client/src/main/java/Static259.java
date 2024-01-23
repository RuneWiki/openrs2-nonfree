import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "J")
	public static volatile long aLong173 = 0L;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public static void method4090() {
		Static130.method2234();
		Static228.method3535();
		Static172.method2908();
		Static222.method3453();
		Static151.method2555();
		Static190.method3096();
		Static24.method383();
		Static278.method4289();
		Static262.method4140();
		Static171.method2900();
		Static146.method2486();
		Static4.method23();
		Static248.method3927();
		Static47.method899();
		Static3.method21();
		Static190.method3091();
		Static23.method374();
		Static314.method761();
		Static258.method4088();
		if (Static31.anInt552 != 0) {
			for (@Pc(51) int local51 = 0; local51 < Static282.aByteArrayArray16.length; local51++) {
				Static282.aByteArrayArray16[local51] = null;
			}
			Static24.anInt404 = 0;
		}
		Static268.method4200();
		Static166.method2835();
		Static96.method1763();
		Static292.method4460();
		Static311.aClass187_157.method4530();
		if (!Static156.aBoolean211) {
			((Class30_Sub1) Static215.anInterface5_1).method797();
		}
		Static268.aClass148_11.method3605();
		Static152.aClass121_23.method3136();
		Static210.aClass121_91.method3136();
		Static239.aClass121_103.method3136();
		Static15.aClass121_12.method3136();
		Static313.aClass121_73.method3136();
		Static308.aClass121_135.method3136();
		Static3.aClass121_1.method3136();
		Static258.aClass121_114.method3136();
		Static208.aClass121_89.method3136();
		Static32.aClass121_68.method3136();
		Static162.aClass121_77.method3136();
		Static244.aClass187_124.method4530();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIII)V")
	public static void method4091(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static117.aLong88 = 0L;
		@Pc(15) boolean local15 = false;
		@Pc(18) int local18 = Static228.method3541();
		if (arg1 <= 0 != local18 <= 0) {
			local15 = true;
		}
		if (arg1 == 3 || local18 == 3) {
			arg0 = true;
		}
		if (Static246.aString266.startsWith("mac") && arg1 > 0) {
			arg0 = true;
		}
		if (arg0 && arg1 > 0) {
			local15 = true;
		}
		Static2.method16(arg1, local18, arg2, local15, arg0, arg3);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!wk;Z)V")
	public static void method4092(@OriginalArg(0) Class1_Sub33 arg0, @OriginalArg(1) boolean arg1) {
		Static124.aClass59_40.method1706(arg0);
		while (true) {
			@Pc(8) Class1_Sub33 local8;
			@Pc(18) int local18;
			@Pc(21) int local21;
			@Pc(24) int local24;
			@Pc(27) int local27;
			@Pc(31) Class1_Sub33[][] local31;
			@Pc(65) int local65;
			@Pc(115) int local115;
			@Pc(894) int local894;
			@Pc(899) int local899;
			@Pc(904) int local904;
			@Pc(153) Class1_Sub33 local153;
			@Pc(1332) int local1332;
			do {
				do {
					do {
						do {
							do {
								do {
									@Pc(33) float var8;
									@Pc(44) int var9;
									@Pc(48) int var10;
									@Pc(907) int var17;
									@Pc(916) int var18;
									@Pc(928) int var19;
									while (true) {
										@Pc(363) Class160 var30;
										@Pc(469) boolean var32;
										@Pc(425) Class161 var33;
										@Pc(1179) Class1_Sub33 var39;
										while (true) {
											do {
												local8 = (Class1_Sub33) Static124.aClass59_40.method1700();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean392);
											local18 = local8.anInt5737;
											local21 = local8.anInt5736;
											local24 = local8.anInt5738;
											local27 = local8.anInt5739;
											local31 = Static105.aClass1_Sub33ArrayArrayArray2[local24];
											var8 = 0.0F;
											if (Static156.aBoolean211) {
												if (Static257.anIntArrayArrayArray15 == Static24.anIntArrayArrayArray2) {
													var9 = Static41.anIntArrayArray5[local18][local21];
													var10 = var9 & 0xFFFFFF;
													if (var10 != Static207.anInt3962) {
														Static207.anInt3962 = var10;
														Static179.method2977(var10);
														Static283.method4360(Static234.method3636());
													}
													local65 = var9 >>> 24 << 3;
													if (local65 != Static61.anInt1169) {
														Static61.anInt1169 = local65;
														Static159.method2738(local65);
													}
													local115 = Static95.anIntArrayArrayArray5[0][local18][local21] + Static95.anIntArrayArrayArray5[0][local18 + 1][local21] + Static95.anIntArrayArrayArray5[0][local18][local21 + 1] + Static95.anIntArrayArrayArray5[0][local18 + 1][local21 + 1] >> 2;
													Static90.method1648(-local115, 3);
													var8 = 201.5F;
													Static156.method2658(var8);
												} else {
													var8 = 201.5F - (float) (local27 + 1) * 50.0F;
													Static156.method2658(var8);
												}
											}
											if (!local8.aBoolean390) {
												break;
											}
											if (arg1) {
												if (local24 > 0) {
													local153 = Static105.aClass1_Sub33ArrayArrayArray2[local24 - 1][local18][local21];
													if (local153 != null && local153.aBoolean392) {
														continue;
													}
												}
												if (local18 <= Static13.anInt184 && local18 > Static47.anInt952) {
													local153 = local31[local18 - 1][local21];
													if (local153 != null && local153.aBoolean392 && (local153.aBoolean390 || (local8.anInt5735 & 0x1) == 0)) {
														continue;
													}
												}
												if (local18 >= Static13.anInt184 && local18 < Static310.anInt5666 - 1) {
													local153 = local31[local18 + 1][local21];
													if (local153 != null && local153.aBoolean392 && (local153.aBoolean390 || (local8.anInt5735 & 0x4) == 0)) {
														continue;
													}
												}
												if (local21 <= Static84.anInt1660 && local21 > Static236.anInt4291) {
													local153 = local31[local18][local21 - 1];
													if (local153 != null && local153.aBoolean392 && (local153.aBoolean390 || (local8.anInt5735 & 0x8) == 0)) {
														continue;
													}
												}
												if (local21 >= Static84.anInt1660 && local21 < Static124.anInt5504 - 1) {
													local153 = local31[local18][local21 + 1];
													if (local153 != null && local153.aBoolean392 && (local153.aBoolean390 || (local8.anInt5735 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean390 = false;
											if (local8.aClass1_Sub33_1 != null) {
												local153 = local8.aClass1_Sub33_1;
												if (Static156.aBoolean211) {
													Static156.method2658(201.5F - (float) (local153.anInt5739 + 1) * 50.0F);
												}
												if (local153.aClass159_1 == null) {
													if (local153.aClass133_1 != null) {
														if (Static12.method165(0, local18, local21)) {
															Static203.method3257(local153.aClass133_1, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, true);
														} else {
															Static203.method3257(local153.aClass133_1, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, false);
														}
													}
												} else if (Static12.method165(0, local18, local21)) {
													Static228.method3538(local153.aClass159_1, 0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, true);
												} else {
													Static228.method3538(local153.aClass159_1, 0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, false);
												}
												var30 = local153.aClass160_1;
												if (var30 != null) {
													if (Static156.aBoolean211) {
														if ((var30.anInt4621 & local8.anInt5734) == 0) {
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
														} else {
															Static101.method1828(var30.anInt4621, Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local27, local18, local21);
														}
													}
													var30.aClass15_7.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, var30.anInt4619 - Static160.anInt3163, var30.anInt4626 - Static193.anInt3671, var30.anInt4624 - Static100.anInt2013, var30.aLong170, local24, null);
												}
												for (local65 = 0; local65 < local153.anInt5733; local65++) {
													var33 = local153.aClass161Array3[local65];
													if (var33 != null) {
														if (Static156.aBoolean211) {
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
														}
														var33.aClass15_9.method4678(var33.anInt4635, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, var33.anInt4640 - Static160.anInt3163, var33.anInt4638 - Static193.anInt3671, var33.anInt4645 - Static100.anInt2013, var33.aLong171, local24, null);
													}
												}
												if (Static156.aBoolean211) {
													Static156.method2658(var8);
												}
											}
											var32 = false;
											if (local8.aClass159_1 == null) {
												if (local8.aClass133_1 != null) {
													if (Static12.method165(local27, local18, local21)) {
														Static203.method3257(local8.aClass133_1, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, true);
													} else {
														var32 = true;
														Static203.method3257(local8.aClass133_1, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, false);
													}
												}
											} else if (Static12.method165(local27, local18, local21)) {
												Static228.method3538(local8.aClass159_1, local27, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, true);
											} else {
												var32 = true;
												if (local8.aClass159_1.anInt4610 != 12345678 || Static218.aBoolean71 && local24 <= Static187.anInt3573) {
													Static228.method3538(local8.aClass159_1, local27, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local18, local21, false);
												}
											}
											if (var32) {
												@Pc(549) Class36 local549 = local8.aClass36_1;
												if (local549 != null && (local549.aLong44 & 0x80000000L) != 0L) {
													if (Static156.aBoolean211 && local549.aBoolean55) {
														Static156.method2658(var8 + 50.0F - 1.5F);
													}
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													local549.aClass15_1.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local549.anInt1014 - Static160.anInt3163, local549.anInt1015 - Static193.anInt3671, local549.anInt1012 - Static100.anInt2013, local549.aLong44, local24, null);
													if (Static156.aBoolean211 && local549.aBoolean55) {
														Static156.method2658(var8);
													}
												}
											}
											var10 = 0;
											local65 = 0;
											@Pc(616) Class160 local616 = local8.aClass160_1;
											@Pc(619) Class52 local619 = local8.aClass52_1;
											if (local616 != null || local619 != null) {
												if (Static13.anInt184 == local18) {
													var10++;
												} else if (Static13.anInt184 < local18) {
													var10 += 2;
												}
												if (Static84.anInt1660 == local21) {
													var10 += 3;
												} else if (Static84.anInt1660 > local21) {
													var10 += 6;
												}
												local65 = Static165.anIntArray278[var10];
												local8.anInt5734 = Static110.anIntArray202[var10];
											}
											if (local616 != null) {
												if ((local616.anInt4621 & Static82.anIntArray141[var10]) == 0) {
													local8.anInt5743 = 0;
												} else if (local616.anInt4621 == 16) {
													local8.anInt5743 = 3;
													local8.anInt5741 = Static175.anIntArray286[var10];
													local8.anInt5740 = 3 - local8.anInt5741;
												} else if (local616.anInt4621 == 32) {
													local8.anInt5743 = 6;
													local8.anInt5741 = Static288.anIntArray460[var10];
													local8.anInt5740 = 6 - local8.anInt5741;
												} else if (local616.anInt4621 == 64) {
													local8.anInt5743 = 12;
													local8.anInt5741 = Static1.anIntArray1[var10];
													local8.anInt5740 = 12 - local8.anInt5741;
												} else {
													local8.anInt5743 = 9;
													local8.anInt5741 = Static257.anIntArray415[var10];
													local8.anInt5740 = 9 - local8.anInt5741;
												}
												if ((local616.anInt4621 & local65) != 0 && !Static115.method2069(local27, local18, local21, local616.anInt4621)) {
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													local616.aClass15_7.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local616.anInt4619 - Static160.anInt3163, local616.anInt4626 - Static193.anInt3671, local616.anInt4624 - Static100.anInt2013, local616.aLong170, local24, null);
												}
												if ((local616.anInt4620 & local65) != 0 && !Static115.method2069(local27, local18, local21, local616.anInt4620)) {
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													local616.aClass15_8.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local616.anInt4619 - Static160.anInt3163, local616.anInt4626 - Static193.anInt3671, local616.anInt4624 - Static100.anInt2013, local616.aLong170, local24, null);
												}
											}
											if (local619 != null && !Static307.method4665(local27, local18, local21, local619.aClass15_2.method4676())) {
												if (Static156.aBoolean211) {
													Static156.method2658(var8 - 0.5F);
												}
												if ((local619.anInt1640 & local65) != 0) {
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													local619.aClass15_2.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local619.anInt1642 + local619.anInt1638 - Static160.anInt3163, local619.anInt1643 - Static193.anInt3671, local619.anInt1641 + local619.anInt1646 - Static100.anInt2013, local619.aLong63, local24, null);
												} else if (local619.anInt1640 == 256) {
													local894 = local619.anInt1642 - Static160.anInt3163;
													local899 = local619.anInt1643 - Static193.anInt3671;
													local904 = local619.anInt1641 - Static100.anInt2013;
													var17 = local619.anInt1645;
													if (var17 == 1 || var17 == 2) {
														var18 = -local894;
													} else {
														var18 = local894;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local904;
													} else {
														var19 = local904;
													}
													if (var19 < var18) {
														if (Static156.aBoolean211) {
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
														}
														local619.aClass15_2.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local894 + local619.anInt1638, local899, local904 + local619.anInt1646, local619.aLong63, local24, null);
													} else if (local619.aClass15_3 != null) {
														if (Static156.aBoolean211) {
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
														}
														local619.aClass15_3.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local894, local899, local904, local619.aLong63, local24, null);
													}
												}
												if (Static156.aBoolean211) {
													Static156.method2658(var8);
												}
											}
											if (var32) {
												@Pc(1001) Class36 local1001 = local8.aClass36_1;
												if (local1001 != null && (local1001.aLong44 & 0x80000000L) == 0L) {
													if (Static156.aBoolean211 && local1001.aBoolean55) {
														Static156.method2658(var8 + 50.0F - 1.5F);
													}
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													local1001.aClass15_1.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local1001.anInt1014 - Static160.anInt3163, local1001.anInt1015 - Static193.anInt3671, local1001.anInt1012 - Static100.anInt2013, local1001.aLong44, local24, null);
													if (Static156.aBoolean211 && local1001.aBoolean55) {
														Static156.method2658(var8);
													}
												}
												@Pc(1064) Class151 local1064 = local8.aClass151_1;
												if (local1064 != null && local1064.anInt4335 == 0) {
													if (Static156.aBoolean211) {
														Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
													}
													if (local1064.aClass15_6 != null) {
														local1064.aClass15_6.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local1064.anInt4328 - Static160.anInt3163, local1064.anInt4331 - Static193.anInt3671, local1064.anInt4329 - Static100.anInt2013, local1064.aLong155, local24, null);
													}
													if (local1064.aClass15_4 != null) {
														local1064.aClass15_4.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local1064.anInt4328 - Static160.anInt3163, local1064.anInt4331 - Static193.anInt3671, local1064.anInt4329 - Static100.anInt2013, local1064.aLong155, local24, null);
													}
													if (local1064.aClass15_5 != null) {
														local1064.aClass15_5.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local1064.anInt4328 - Static160.anInt3163, local1064.anInt4331 - Static193.anInt3671, local1064.anInt4329 - Static100.anInt2013, local1064.aLong155, local24, null);
													}
												}
											}
											local894 = local8.anInt5735;
											if (local894 != 0) {
												if (local18 < Static13.anInt184 && (local894 & 0x4) != 0) {
													var39 = local31[local18 + 1][local21];
													if (var39 != null && var39.aBoolean392) {
														Static124.aClass59_40.method1706(var39);
													}
												}
												if (local21 < Static84.anInt1660 && (local894 & 0x2) != 0) {
													var39 = local31[local18][local21 + 1];
													if (var39 != null && var39.aBoolean392) {
														Static124.aClass59_40.method1706(var39);
													}
												}
												if (local18 > Static13.anInt184 && (local894 & 0x1) != 0) {
													var39 = local31[local18 - 1][local21];
													if (var39 != null && var39.aBoolean392) {
														Static124.aClass59_40.method1706(var39);
													}
												}
												if (local21 > Static84.anInt1660 && (local894 & 0x8) != 0) {
													var39 = local31[local18][local21 - 1];
													if (var39 != null && var39.aBoolean392) {
														Static124.aClass59_40.method1706(var39);
													}
												}
											}
											break;
										}
										if (local8.anInt5743 != 0) {
											var32 = true;
											for (var10 = 0; var10 < local8.anInt5733; var10++) {
												if (local8.aClass161Array3[var10].anInt4634 != Static186.anInt3555 && (local8.anIntArray508[var10] & local8.anInt5743) == local8.anInt5741) {
													var32 = false;
													break;
												}
											}
											if (var32) {
												var30 = local8.aClass160_1;
												if (!Static115.method2069(local27, local18, local21, var30.anInt4621)) {
													if (Static156.aBoolean211) {
														label1037: {
															if ((var30.aLong170 & 0xFC000L) == 16384L) {
																local65 = var30.anInt4619 - Static160.anInt3163;
																local115 = var30.anInt4624 - Static100.anInt2013;
																local1332 = (int) (var30.aLong170 >> 20 & 0x3L);
																if (local1332 == 0) {
																	local65 -= 64;
																	local115 += 64;
																	if (local115 < local65 && local18 > 0 && local21 < Static285.anInt5122 - 1) {
																		Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18 - 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 1) {
																	local65 += 64;
																	local115 += 64;
																	if (local115 < -local65 && local18 < Static153.anInt3006 - 1 && local21 < Static285.anInt5122 - 1) {
																		Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18 + 1, local21 + 1);
																		break label1037;
																	}
																} else if (local1332 == 2) {
																	local65 += 64;
																	local115 -= 64;
																	if (local115 > local65 && local18 < Static153.anInt3006 - 1 && local21 > 0) {
																		Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18 + 1, local21 - 1);
																		break label1037;
																	}
																} else if (local1332 == 3) {
																	local65 -= 64;
																	local115 -= 64;
																	if (local115 > -local65 && local18 > 0 && local21 > 0) {
																		Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18 - 1, local21 - 1);
																		break label1037;
																	}
																}
															}
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
														}
													}
													var30.aClass15_7.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, var30.anInt4619 - Static160.anInt3163, var30.anInt4626 - Static193.anInt3671, var30.anInt4624 - Static100.anInt2013, var30.aLong170, local24, null);
												}
												local8.anInt5743 = 0;
											}
										}
										if (!local8.aBoolean391) {
											break;
										}
										try {
											var9 = local8.anInt5733;
											local8.aBoolean391 = false;
											var10 = 0;
											label844: for (local65 = 0; local65 < var9; local65++) {
												var33 = local8.aClass161Array3[local65];
												if (var33.anInt4634 != Static186.anInt3555) {
													for (local1332 = var33.anInt4641; local1332 <= var33.anInt4639; local1332++) {
														for (local894 = var33.anInt4636; local894 <= var33.anInt4637; local894++) {
															var39 = local31[local1332][local894];
															if (var39.aBoolean390) {
																local8.aBoolean391 = true;
																continue label844;
															}
															if (var39.anInt5743 != 0) {
																local904 = 0;
																if (local1332 > var33.anInt4641) {
																	local904++;
																}
																if (local1332 < var33.anInt4639) {
																	local904 += 4;
																}
																if (local894 > var33.anInt4636) {
																	local904 += 8;
																}
																if (local894 < var33.anInt4637) {
																	local904 += 2;
																}
																if ((local904 & var39.anInt5743) == local8.anInt5740) {
																	local8.aBoolean391 = true;
																	continue label844;
																}
															}
														}
													}
													Static238.aClass161Array2[var10++] = var33;
													local1332 = Static13.anInt184 - var33.anInt4641;
													local894 = var33.anInt4639 - Static13.anInt184;
													if (local894 > local1332) {
														local1332 = local894;
													}
													local899 = Static84.anInt1660 - var33.anInt4636;
													local904 = var33.anInt4637 - Static84.anInt1660;
													if (local904 > local899) {
														var33.anInt4644 = local1332 + local904;
													} else {
														var33.anInt4644 = local1332 + local899;
													}
												}
											}
											while (var10 > 0) {
												local65 = -50;
												local115 = -1;
												for (local1332 = 0; local1332 < var10; local1332++) {
													@Pc(1628) Class161 local1628 = Static238.aClass161Array2[local1332];
													if (local1628.anInt4634 != Static186.anInt3555) {
														if (local1628.anInt4644 > local65) {
															local65 = local1628.anInt4644;
															local115 = local1332;
														} else if (local1628.anInt4644 == local65) {
															local899 = local1628.anInt4640 - Static160.anInt3163;
															local904 = local1628.anInt4645 - Static100.anInt2013;
															var17 = Static238.aClass161Array2[local115].anInt4640 - Static160.anInt3163;
															var18 = Static238.aClass161Array2[local115].anInt4645 - Static100.anInt2013;
															if (local899 * local899 + local904 * local904 > var17 * var17 + var18 * var18) {
																local115 = local1332;
															}
														}
													}
												}
												if (local115 == -1) {
													break;
												}
												@Pc(1697) Class161 local1697 = Static238.aClass161Array2[local115];
												local1697.anInt4634 = Static186.anInt3555;
												if (!Static134.method4725(local27, local1697.anInt4641, local1697.anInt4639, local1697.anInt4636, local1697.anInt4637, local1697.aClass15_9.method4676())) {
													if (Static156.aBoolean211) {
														if ((local1697.aLong171 & 0xFC000L) == 147456L) {
															Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
															local894 = local1697.anInt4640 - Static160.anInt3163;
															local899 = local1697.anInt4645 - Static100.anInt2013;
															local904 = (int) (local1697.aLong171 >> 20 & 0x3L);
															if (local904 == 1 || local904 == 3) {
																if (local899 > -local894) {
																	Static101.method1831(local24, local18, local21 - 1, local18 - 1, local21);
																} else {
																	Static101.method1831(local24, local18, local21 + 1, local18 + 1, local21);
																}
															} else if (local899 > local894) {
																Static101.method1831(local24, local18, local21 - 1, local18 + 1, local21);
															} else {
																Static101.method1831(local24, local18, local21 + 1, local18 - 1, local21);
															}
														} else {
															Static101.method1834(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local1697.anInt4641, local1697.anInt4636, local1697.anInt4639, local1697.anInt4637);
														}
													}
													local1697.aClass15_9.method4678(local1697.anInt4635, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local1697.anInt4640 - Static160.anInt3163, local1697.anInt4638 - Static193.anInt3671, local1697.anInt4645 - Static100.anInt2013, local1697.aLong171, local24, null);
												}
												for (local894 = local1697.anInt4641; local894 <= local1697.anInt4639; local894++) {
													for (local899 = local1697.anInt4636; local899 <= local1697.anInt4637; local899++) {
														@Pc(1863) Class1_Sub33 local1863 = local31[local894][local899];
														if (local1863.anInt5743 != 0) {
															Static124.aClass59_40.method1706(local1863);
														} else if ((local894 != local18 || local899 != local21) && local1863.aBoolean392) {
															Static124.aClass59_40.method1706(local1863);
														}
													}
												}
											}
											if (!local8.aBoolean391) {
												break;
											}
										} catch (@Pc(1895) Exception local1895) {
											local8.aBoolean391 = false;
											break;
										}
									}
									if (local8.aClass166_1 != null) {
										if (Static156.aBoolean211) {
											@Pc(1905) GL local1905 = Static156.aGL1;
											Static156.method2658(var8);
											Static158.method2725(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013);
											var10 = local8.anInt5737 * 128 + 64 - Static160.anInt3163;
											local65 = Static24.anIntArrayArrayArray2[local24][local8.anInt5737][local8.anInt5736] - Static193.anInt3671;
											local115 = local8.anInt5736 * 128 + 64 - Static100.anInt2013;
											if (local24 < 3) {
												local1332 = Static24.anIntArrayArrayArray2[local24][local8.anInt5737][local8.anInt5736] - Static24.anIntArrayArrayArray2[local24 + 1][local8.anInt5737][local8.anInt5736];
											} else {
												local1332 = 1024;
											}
											local894 = local115 * Static83.anInt1651 - var10 * Static170.anInt3350 >> 16;
											local899 = local65 * Static163.anInt3252 + local894 * Static165.anInt3265 >> 16;
											local904 = local899 + (Static165.anInt3265 * 91 + Static163.anInt3252 * 0 >> 16);
											var17 = local899 + (Static165.anInt3265 * -91 - local1332 * Static163.anInt3252 >> 16);
											if (var17 < local904 - 1597) {
												var17 = local904 - 1597;
											}
											var18 = local904 + 2 - var17;
											@Pc(2030) Class87_Sub1_Sub1 local2030 = null;
											@Pc(2032) Class87_Sub3 local2032 = null;
											@Pc(2034) int local2034 = -1;
											@Pc(2040) Class87_Sub1_Sub1 local2040 = (Class87_Sub1_Sub1) local8.aClass166_1.method4161();
											while (true) {
												label1054: {
													if (local2040 != null) {
														if (local2040.aClass87_Sub3_1 == null || local2040.aClass87_Sub3_1.aClass87_Sub2_6.aBoolean213) {
															local2040.method4455();
															break label1054;
														}
														if ((byte) (local2040.aClass87_Sub3_1.aClass87_Sub2_6.aLong111 & 0xFFL) != local8.aByte28) {
															local8.aClass166_1 = null;
															break;
														}
														if (local2030 == null) {
															local2030 = local2040;
															local2032 = local2040.aClass87_Sub3_1;
															local2034 = local2032.aClass165_2.anInt4790;
															break label1054;
														}
													}
													if (local2030 != null && (local2040 == null || local2040.aClass87_Sub3_1 != local2032 || local2040.aClass87_Sub3_1.aClass165_2.anInt4790 != local2034)) {
														@Pc(2097) int local2097;
														for (local2097 = 0; local2097 < var18; local2097++) {
															Static158.anIntArray260[local2097] = 0;
														}
														for (local2097 = 0; local2097 < 32; local2097++) {
															Static158.anIntArray259[local2097] = 0;
														}
														Static158.anInt3117 = 0;
														for (@Pc(2121) Class87_Sub1_Sub1 local2121 = local2030; local2121 != local2040; local2121 = (Class87_Sub1_Sub1) local2121.aClass87_Sub1_6) {
															if (local2121.aClass87_Sub3_1 != null) {
																@Pc(2134) int local2134 = (local2121.anInt5211 >> 12) - Static160.anInt3163;
																@Pc(2141) int local2141 = (local2121.anInt5210 >> 12) - Static193.anInt3671;
																@Pc(2148) int local2148 = (local2121.anInt5214 >> 12) - Static100.anInt2013;
																@Pc(2158) int local2158 = local2148 * Static83.anInt1651 - local2134 * Static170.anInt3350 >> 16;
																@Pc(2170) int local2170 = (local2141 * Static163.anInt3252 + local2158 * Static165.anInt3265 >> 16) - var17;
																if (Static158.anIntArray260[local2170] < 32) {
																	Static158.aShortArrayArray4[local2170][Static158.anIntArray260[local2170]++] = local2121.aShort48;
																} else {
																	if (Static158.anIntArray260[local2170] == 32) {
																		if (Static158.anInt3117 == 32) {
																			if (Static158.aBoolean215) {
																				System.out.println("Overflowed world-based radix sort");
																			}
																			break;
																		}
																		Static158.anIntArray260[local2170] += Static158.anInt3117++ + 1;
																	}
																	@Pc(2227) int local2227 = Static158.anIntArray259[Static158.anIntArray260[local2170] - 32 - 1];
																	if (local2227 < 768) {
																		@Pc(2239) short[] local2239 = Static158.aShortArrayArray3[Static158.anIntArray260[local2170] - 32 - 1];
																		@Pc(2247) int local2247 = Static158.anIntArray260[local2170] - 32 - 1;
																		@Pc(2249) int local2249 = Static158.anIntArray259[Static158.anIntArray260[local2170] - 32 - 1];
																		Static158.anIntArray259[local2247] = Static158.anIntArray259[Static158.anIntArray260[local2170] - 32 - 1] + 1;
																		local2239[local2249] = local2121.aShort48;
																	}
																}
															}
															if (local2121.aClass87_Sub1_6 == local8.aClass166_1.aClass87_Sub1_3) {
																break;
															}
														}
														@Pc(2270) boolean local2270 = false;
														if (Static158.aBoolean214 && local2032.aClass165_2.anInt4822 != -1) {
															Static215.anInterface5_1.method782(local2032.aClass165_2.anInt4822);
															local2270 = true;
														} else {
															Static156.method2699(-1);
														}
														@Pc(2293) float local2293 = (float) local2034 * Static158.aFloat93;
														if (local2293 > 64.0F) {
															local2293 = 64.0F;
														}
														local1905.glPointSize(local2293);
														local2032.aClass87_Sub2_6.method2708(local1905, var18, local2270, local2032.aClass165_2.aBoolean329);
														if (local2040 != null) {
															local2030 = local2040;
															local2032 = local2040.aClass87_Sub3_1;
															local2034 = local2040.aClass87_Sub3_1.aClass165_2.anInt4790;
														}
													}
													if (local2040 == null) {
														break;
													}
												}
												local2040 = (Class87_Sub1_Sub1) local8.aClass166_1.method4157();
											}
											Static158.method2706();
										} else {
											var9 = Static158.anInt3113 + Static215.anInt4020;
											var10 = Static158.anInt3112 + Static215.anInt4021;
											@Pc(2347) Class87_Sub1 local2347 = local8.aClass166_1.aClass87_Sub1_3;
											for (@Pc(2350) Class87_Sub1 local2350 = local2347.aClass87_Sub1_6; local2350 != local2347; local2350 = local2350.aClass87_Sub1_6) {
												@Pc(2356) Class87_Sub1_Sub1 local2356 = (Class87_Sub1_Sub1) local2350;
												if (local2356.aClass87_Sub3_1 != null && !local2356.aClass87_Sub3_1.aClass87_Sub2_6.aBoolean213) {
													if ((byte) (local2356.aClass87_Sub3_1.aClass87_Sub2_6.aLong111 & 0xFFL) != local8.aByte28) {
														local8.aClass166_1 = null;
														break;
													}
													local894 = (local2356.anInt5211 >> 12) - Static160.anInt3163;
													local899 = (local2356.anInt5210 >> 12) - Static193.anInt3671;
													local904 = (local2356.anInt5214 >> 12) - Static100.anInt2013;
													var17 = local904 * Static170.anInt3350 + local894 * Static83.anInt1651 >> 16;
													local904 = local904 * Static83.anInt1651 - local894 * Static170.anInt3350 >> 16;
													local894 = var17;
													var17 = local899 * Static165.anInt3265 - local904 * Static163.anInt3252 >> 16;
													local904 = local899 * Static163.anInt3252 + local904 * Static165.anInt3265 >> 16;
													if (local904 >= 50) {
														var18 = var9 + (local894 << 9) / local904;
														var19 = var10 + (var17 << 9) / local904;
														@Pc(2468) int local2468 = local904 * 400;
														if (local2468 == 0) {
															local2468 = 1;
														}
														Static25.method391(var18, var19, (local2356.aClass87_Sub3_1.aClass165_2.anInt4790 << 16) / local2468, local2356.anInt5215, local2356.anInt5215 >> 24 & 0xFF);
													}
												}
											}
										}
									}
								} while (!local8.aBoolean392);
							} while (local8.anInt5743 != 0);
							if (local18 > Static13.anInt184 || local18 <= Static47.anInt952) {
								break;
							}
							local153 = local31[local18 - 1][local21];
						} while (local153 != null && local153.aBoolean392);
						if (local18 < Static13.anInt184 || local18 >= Static310.anInt5666 - 1) {
							break;
						}
						local153 = local31[local18 + 1][local21];
					} while (local153 != null && local153.aBoolean392);
					if (local21 > Static84.anInt1660 || local21 <= Static236.anInt4291) {
						break;
					}
					local153 = local31[local18][local21 - 1];
				} while (local153 != null && local153.aBoolean392);
				if (local21 < Static84.anInt1660 || local21 >= Static124.anInt5504 - 1) {
					break;
				}
				local153 = local31[local18][local21 + 1];
			} while (local153 != null && local153.aBoolean392);
			local8.aBoolean392 = false;
			Static214.anInt4009--;
			@Pc(2596) Class151 local2596 = local8.aClass151_1;
			if (local2596 != null && local2596.anInt4335 != 0) {
				if (Static156.aBoolean211) {
					Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
				}
				if (local2596.aClass15_6 != null) {
					local2596.aClass15_6.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2596.anInt4328 - Static160.anInt3163, local2596.anInt4331 - Static193.anInt3671 - local2596.anInt4335, local2596.anInt4329 - Static100.anInt2013, local2596.aLong155, local24, null);
				}
				if (local2596.aClass15_4 != null) {
					local2596.aClass15_4.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2596.anInt4328 - Static160.anInt3163, local2596.anInt4331 - Static193.anInt3671 - local2596.anInt4335, local2596.anInt4329 - Static100.anInt2013, local2596.aLong155, local24, null);
				}
				if (local2596.aClass15_5 != null) {
					local2596.aClass15_5.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2596.anInt4328 - Static160.anInt3163, local2596.anInt4331 - Static193.anInt3671 - local2596.anInt4335, local2596.anInt4329 - Static100.anInt2013, local2596.aLong155, local24, null);
				}
			}
			if (local8.anInt5734 != 0) {
				@Pc(2706) Class52 local2706 = local8.aClass52_1;
				if (local2706 != null && !Static307.method4665(local27, local18, local21, local2706.aClass15_2.method4676())) {
					if ((local2706.anInt1640 & local8.anInt5734) != 0) {
						if (Static156.aBoolean211) {
							Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
						}
						local2706.aClass15_2.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2706.anInt1642 + local2706.anInt1638 - Static160.anInt3163, local2706.anInt1643 - Static193.anInt3671, local2706.anInt1641 + local2706.anInt1646 - Static100.anInt2013, local2706.aLong63, local24, null);
					} else if (local2706.anInt1640 == 256) {
						local65 = local2706.anInt1642 - Static160.anInt3163;
						local115 = local2706.anInt1643 - Static193.anInt3671;
						local1332 = local2706.anInt1641 - Static100.anInt2013;
						local894 = local2706.anInt1645;
						if (local894 == 1 || local894 == 2) {
							local899 = -local65;
						} else {
							local899 = local65;
						}
						if (local894 == 2 || local894 == 3) {
							local904 = -local1332;
						} else {
							local904 = local1332;
						}
						if (local904 >= local899) {
							if (Static156.aBoolean211) {
								Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
							}
							local2706.aClass15_2.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local65 + local2706.anInt1638, local115, local1332 + local2706.anInt1646, local2706.aLong63, local24, null);
						} else if (local2706.aClass15_3 != null) {
							if (Static156.aBoolean211) {
								Static101.method1821(Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local24, local18, local21);
							}
							local2706.aClass15_3.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local65, local115, local1332, local2706.aLong63, local24, null);
						}
					}
				}
				@Pc(2872) Class160 local2872 = local8.aClass160_1;
				if (local2872 != null) {
					if ((local2872.anInt4620 & local8.anInt5734) != 0 && !Static115.method2069(local27, local18, local21, local2872.anInt4620)) {
						if (Static156.aBoolean211) {
							Static101.method1828(local2872.anInt4620, Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local27, local18, local21);
						}
						local2872.aClass15_8.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2872.anInt4619 - Static160.anInt3163, local2872.anInt4626 - Static193.anInt3671, local2872.anInt4624 - Static100.anInt2013, local2872.aLong170, local24, null);
					}
					if ((local2872.anInt4621 & local8.anInt5734) != 0 && !Static115.method2069(local27, local18, local21, local2872.anInt4621)) {
						if (Static156.aBoolean211) {
							Static101.method1828(local2872.anInt4621, Static160.anInt3163, Static193.anInt3671, Static100.anInt2013, local27, local18, local21);
						}
						local2872.aClass15_7.method4678(0, Static163.anInt3252, Static165.anInt3265, Static170.anInt3350, Static83.anInt1651, local2872.anInt4619 - Static160.anInt3163, local2872.anInt4626 - Static193.anInt3671, local2872.anInt4624 - Static100.anInt2013, local2872.aLong170, local24, null);
					}
				}
			}
			@Pc(2985) Class1_Sub33 local2985;
			if (local24 < Static312.anInt5729 - 1) {
				local2985 = Static105.aClass1_Sub33ArrayArrayArray2[local24 + 1][local18][local21];
				if (local2985 != null && local2985.aBoolean392) {
					Static124.aClass59_40.method1706(local2985);
				}
			}
			if (local18 < Static13.anInt184) {
				local2985 = local31[local18 + 1][local21];
				if (local2985 != null && local2985.aBoolean392) {
					Static124.aClass59_40.method1706(local2985);
				}
			}
			if (local21 < Static84.anInt1660) {
				local2985 = local31[local18][local21 + 1];
				if (local2985 != null && local2985.aBoolean392) {
					Static124.aClass59_40.method1706(local2985);
				}
			}
			if (local18 > Static13.anInt184) {
				local2985 = local31[local18 - 1][local21];
				if (local2985 != null && local2985.aBoolean392) {
					Static124.aClass59_40.method1706(local2985);
				}
			}
			if (local21 > Static84.anInt1660) {
				local2985 = local31[local18][local21 - 1];
				if (local2985 != null && local2985.aBoolean392) {
					Static124.aClass59_40.method1706(local2985);
				}
			}
		}
	}
}
