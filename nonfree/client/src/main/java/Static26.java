import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Lclient!ve;")
	public static Class69 aClass69_4;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array6;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "Lclient!jj;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public static int anInt679 = 0;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIII[Lclient!vc;III)V")
	public static void method518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class98[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static90.method3501(arg3, arg8, arg0, arg6);
		Static182.method3156();
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(21) Class98 local21 = arg5[local13];
			if (local21 != null && (local21.anInt4424 == arg1 || arg1 == -1412584499 && local21 == Static208.aClass98_21)) {
				@Pc(45) int local45;
				if (arg2 == -1) {
					Static150.anIntArray283[anInt679] = arg4 + local21.anInt4356;
					Static145.anIntArray274[anInt679] = arg7 + local21.anInt4358;
					Static114.anIntArray203[anInt679] = local21.anInt4400;
					Static138.anIntArray253[anInt679] = local21.anInt4403;
					local45 = anInt679++;
				} else {
					local45 = arg2;
				}
				local21.anInt4414 = Static42.anInt1100;
				local21.anInt4416 = local45;
				if (!local21.aBoolean211 || !Static49.method906(local21)) {
					if (local21.anInt4351 > 0) {
						Static24.method504(local21);
					}
					@Pc(101) int local101 = arg7 + local21.anInt4358;
					@Pc(104) int local104 = local21.anInt4387;
					@Pc(109) int local109 = local21.anInt4356 + arg4;
					if (Static134.aBoolean140 && (Static105.method1831(local21) != 0 || local21.anInt4373 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(157) int local157;
					@Pc(168) int local168;
					if (Static208.aClass98_21 == local21) {
						if (arg1 != -1412584499 && !local21.aBoolean210) {
							Static199.aClass98Array2 = arg5;
							Static12.anInt303 = arg7;
							Static77.anInt1822 = arg4;
							continue;
						}
						if (!local21.aBoolean210) {
							local104 = 128;
						}
						if (Static101.aBoolean108 && Static149.aBoolean154) {
							local157 = Static24.anInt661;
							local157 -= Static188.anInt4178;
							if (Static188.anInt4179 > local157) {
								local157 = Static188.anInt4179;
							}
							local168 = Static7.anInt174;
							if (Static56.aClass98_8.anInt4400 + Static188.anInt4179 < local21.anInt4400 + local157) {
								local157 = Static188.anInt4179 + Static56.aClass98_8.anInt4400 - local21.anInt4400;
							}
							local168 -= Static190.anInt4266;
							local109 = local157;
							if (Static63.anInt1594 > local168) {
								local168 = Static63.anInt1594;
							}
							if (Static63.anInt1594 + Static56.aClass98_8.anInt4403 < local21.anInt4403 + local168) {
								local168 = Static56.aClass98_8.anInt4403 + Static63.anInt1594 - local21.anInt4403;
							}
							local101 = local168;
						}
					}
					@Pc(230) int local230;
					@Pc(232) int local232;
					@Pc(252) int local252;
					@Pc(257) int local257;
					if (local21.anInt4373 == 2) {
						local168 = arg8;
						local230 = arg0;
						local232 = arg6;
						local157 = arg3;
					} else {
						local157 = arg3 < local109 ? local109 : arg3;
						local252 = local21.anInt4400 + local109;
						local257 = local21.anInt4403 + local101;
						local168 = arg8 >= local101 ? arg8 : local101;
						if (local21.anInt4373 == 9) {
							local257++;
							local252++;
						}
						local230 = arg0 <= local252 ? arg0 : local252;
						local232 = arg6 > local257 ? local257 : arg6;
					}
					if (!local21.aBoolean211 || local230 > local157 && local168 < local232) {
						if (local21.anInt4351 != 0) {
							if (local21.anInt4351 == 1337) {
								Static108.anInt2435 = local101;
								Static121.anInt2692 = local109;
								Static135.method2292(local101, local21.anInt4403, local21.anInt4400, local109);
								Static90.method3501(arg3, arg8, arg0, arg6);
								continue;
							}
							if (local21.anInt4351 == 1338) {
								if (local21.method3338()) {
									Static37.method703(local45, local21, local101, local109);
									Static90.method3501(arg3, arg8, arg0, arg6);
								}
								continue;
							}
							if (local21.anInt4351 == 1339) {
								if (local21.method3338()) {
									Static119.method2025(local21, local45, local109, local101);
									Static90.method3501(arg3, arg8, arg0, arg6);
								}
								continue;
							}
							if (local21.anInt4351 == 1400) {
								Static134.method2288(local21.anInt4400, local109, local101, local21.anInt4403);
								Static62.aBooleanArray7[local45] = true;
								Static163.aBooleanArray17[local45] = true;
								Static90.method3501(arg3, arg8, arg0, arg6);
								continue;
							}
							if (local21.anInt4351 == 1401) {
								Static19.method430(local21.anInt4403, local101, local21.anInt4400, local109);
								Static62.aBooleanArray7[local45] = true;
								Static163.aBooleanArray17[local45] = true;
								Static90.method3501(arg3, arg8, arg0, arg6);
								continue;
							}
						}
						if (local21.anInt4373 == 0 && local21.aBoolean208 && Static24.anInt661 >= local157 && Static7.anInt174 >= local168 && local230 > Static24.anInt661 && local232 > Static7.anInt174 && !Static53.aBoolean73 && !Static134.aBoolean140) {
							Static27.aClass24Array4[0] = Static95.aClass24_649;
							Static66.aClass24Array11[0] = Static85.aClass24_1000;
							Static98.aShortArray28[0] = 1003;
							Static156.anInt3437 = 1;
						}
						local252 = Static24.anInt661;
						local257 = Static7.anInt174;
						if (!Static53.aBoolean73 && local157 <= local252 && local168 <= local257 && local230 > local252 && local257 < local232) {
							Static114.method1975(local257 - local101, local21, local252 - local109);
						}
						if (local21.anInt4373 == 0) {
							if (!local21.aBoolean211 && Static49.method906(local21) && Static200.aClass98_20 != local21) {
								continue;
							}
							if (!local21.aBoolean211) {
								if (local21.anInt4348 > local21.anInt4347 - local21.anInt4403) {
									local21.anInt4348 = local21.anInt4347 - local21.anInt4403;
								}
								if (local21.anInt4348 < 0) {
									local21.anInt4348 = 0;
								}
							}
							method518(local230, local21.anInt4357, local45, local157, local109 - local21.anInt4401, arg5, local232, local101 - local21.anInt4348, local168);
							if (local21.aClass98Array3 != null) {
								method518(local230, local21.anInt4357, local45, local157, local109 - local21.anInt4401, local21.aClass98Array3, local232, local101 - local21.anInt4348, local168);
							}
							@Pc(616) Class1_Sub11 local616 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local21.anInt4357);
							if (local616 != null) {
								if (local616.anInt2168 == 0 && Static24.anInt661 >= local157 && Static7.anInt174 >= local168 && local230 > Static24.anInt661 && local232 > Static7.anInt174 && !Static53.aBoolean73 && !Static134.aBoolean140) {
									Static156.anInt3437 = 1;
									Static98.aShortArray28[0] = 1003;
									Static27.aClass24Array4[0] = Static95.aClass24_649;
									Static66.aClass24Array11[0] = Static85.aClass24_1000;
								}
								Static28.method550(local232, local616.anInt2169, local109, local230, local157, local168, local45, local101);
							}
							Static90.method3501(arg3, arg8, arg0, arg6);
							Static182.method3156();
						}
						if (Static185.aBooleanArray18[local45] || Static93.anInt2158 > 1) {
							if (local21.anInt4373 == 0 && !local21.aBoolean211 && local21.anInt4347 > local21.anInt4403) {
								Static201.method3405(local21.anInt4347, local21.anInt4348, local21.anInt4403, local101, local21.anInt4400 + local109);
							}
							if (local21.anInt4373 != 1) {
								@Pc(717) int local717;
								@Pc(721) int local721;
								@Pc(733) int local733;
								@Pc(882) int local882;
								@Pc(778) int local778;
								@Pc(715) int local715;
								@Pc(887) int local887;
								@Pc(742) int local742;
								if (local21.anInt4373 == 2) {
									local715 = 0;
									for (local717 = 0; local717 < local21.anInt4417; local717++) {
										for (local721 = 0; local721 < local21.anInt4405; local721++) {
											local733 = local109 + (local21.anInt4410 + 32) * local721;
											local742 = local101 + local717 * (local21.anInt4392 + 32);
											if (local715 < 20) {
												local733 += local21.anIntArray390[local715];
												local742 += local21.anIntArray391[local715];
											}
											if (local21.anIntArray393[local715] > 0) {
												local778 = local21.anIntArray393[local715] - 1;
												if (arg3 < local733 + 32 && arg0 > local733 && local742 + 32 > arg8 && arg6 > local742 || local21 == Static194.aClass98_17 && local715 == Static73.anInt1769) {
													@Pc(832) Class1_Sub2_Sub8_Sub3 local832;
													if (Static36.anInt973 == 1 && local715 == Static115.anInt2585 && Static150.anInt3363 == local21.anInt4357) {
														local832 = Static167.method2846(local778, 0, 2, local21.anIntArray386[local715], local21.aBoolean216);
													} else {
														local832 = Static167.method2846(local778, 3153952, 1, local21.anIntArray386[local715], local21.aBoolean216);
													}
													if (local832 == null) {
														Static199.method2199(local21);
													} else if (local21 == Static194.aClass98_17 && local715 == Static73.anInt1769) {
														local882 = Static7.anInt174 - Static54.anInt3866;
														local887 = Static24.anInt661 - Static4.anInt4611;
														if (local887 < 5 && local887 > -5) {
															local887 = 0;
														}
														if (local882 < 5 && local882 > -5) {
															local882 = 0;
														}
														if (Static60.anInt3652 < 5) {
															local882 = 0;
															local887 = 0;
														}
														local832.method2357(local887 + local733, local742 - -local882, 128);
														if (arg1 != -1) {
															@Pc(932) int local932 = Static90.anInt4603;
															@Pc(934) int local934 = Static90.anInt4604;
															@Pc(940) Class98 local940 = arg5[arg1 & 0xFFFF];
															@Pc(961) int local961;
															if (local742 + local882 < local934 && local940.anInt4348 > 0) {
																local961 = Static92.anInt2138 * (local934 - local882 - local742) / 3;
																if (local961 > Static92.anInt2138 * 10) {
																	local961 = Static92.anInt2138 * 10;
																}
																if (local961 > local940.anInt4348) {
																	local961 = local940.anInt4348;
																}
																local940.anInt4348 -= local961;
																Static54.anInt3866 += local961;
																Static199.method2199(local940);
															}
															if (local742 + local882 + 32 > local932 && local940.anInt4348 < local940.anInt4347 - local940.anInt4403) {
																local961 = (local742 + local882 + 32 - local932) * Static92.anInt2138 / 3;
																if (Static92.anInt2138 * 10 < local961) {
																	local961 = Static92.anInt2138 * 10;
																}
																if (local940.anInt4347 - local940.anInt4403 - local940.anInt4348 < local961) {
																	local961 = local940.anInt4347 - local940.anInt4348 - local940.anInt4403;
																}
																local940.anInt4348 += local961;
																Static54.anInt3866 -= local961;
																Static199.method2199(local940);
															}
														}
													} else if (Static32.aClass98_3 == local21 && Static126.anInt2764 == local715) {
														local832.method2357(local733, local742, 128);
													} else {
														local832.method2347(local733, local742);
													}
												}
											} else if (local21.anIntArray383 != null && local715 < 20) {
												@Pc(1100) Class1_Sub2_Sub8_Sub3 local1100 = local21.method3336(local715);
												if (local1100 != null) {
													local1100.method2347(local733, local742);
												} else if (Static52.aBoolean71) {
													Static199.method2199(local21);
												}
											}
											local715++;
										}
									}
								} else if (local21.anInt4373 == 3) {
									if (Static17.method391(local21)) {
										local715 = local21.anInt4381;
										if (Static200.aClass98_20 == local21 && local21.anInt4368 != 0) {
											local715 = local21.anInt4368;
										}
									} else {
										local715 = local21.anInt4377;
										if (local21 == Static200.aClass98_20 && local21.anInt4396 != 0) {
											local715 = local21.anInt4396;
										}
									}
									if (local104 == 0) {
										if (local21.aBoolean209) {
											Static90.method3482(local109, local101, local21.anInt4400, local21.anInt4403, local715);
										} else {
											Static90.method3490(local109, local101, local21.anInt4400, local21.anInt4403, local715);
										}
									} else if (local21.aBoolean209) {
										Static90.method3488(local109, local101, local21.anInt4400, local21.anInt4403, local715, 256 - (local104 & 0xFF));
									} else {
										Static90.method3480(local109, local101, local21.anInt4400, local21.anInt4403, local715, 256 - (local104 & 0xFF));
									}
								} else {
									@Pc(1238) Class1_Sub2_Sub8_Sub1_Sub1 local1238;
									if (local21.anInt4373 == 4) {
										local1238 = local21.method3333(Static33.aClass1_Sub2_Sub8_Sub2Array3);
										if (local1238 != null) {
											@Pc(1250) Class24 local1250 = local21.aClass24_1260;
											if (Static17.method391(local21)) {
												local717 = local21.anInt4381;
												if (local21 == Static200.aClass98_20 && local21.anInt4368 != 0) {
													local717 = local21.anInt4368;
												}
												if (local21.aClass24_1261.method781() > 0) {
													local1250 = local21.aClass24_1261;
												}
											} else {
												local717 = local21.anInt4377;
												if (local21 == Static200.aClass98_20 && local21.anInt4396 != 0) {
													local717 = local21.anInt4396;
												}
											}
											if (local21.aBoolean211 && local21.anInt4375 != -1) {
												@Pc(1304) Class1_Sub2_Sub23 local1304 = Static168.method2886(local21.anInt4375);
												local1250 = local1304.aClass24_1214;
												if (local1250 == null) {
													local1250 = Static145.aClass24_965;
												}
												if ((local1304.anInt4214 == 1 || local21.anInt4346 != 1) && local21.anInt4346 != -1) {
													local1250 = Static63.method1281(new Class24[] { Static71.aClass24_526, local1250, Static194.aClass24_1246, Static199.method2198(local21.anInt4346) });
												}
											}
											if (local21 == Static10.aClass98_10) {
												local1250 = Static10.aClass24_408;
												local717 = local21.anInt4377;
											}
											if (!local21.aBoolean211) {
												local1250 = Static64.method1305(local21, local1250);
											}
											local1238.method1248(local1250, local109, local101, local21.anInt4400, local21.anInt4403, local717, local21.aBoolean212 ? 0 : -1, local21.anInt4386, local21.anInt4344, local21.anInt4371);
										} else if (Static52.aBoolean71) {
											Static199.method2199(local21);
										}
									} else if (local21.anInt4373 == 5) {
										@Pc(1409) Class1_Sub2_Sub8_Sub3 local1409;
										if (local21.aBoolean211) {
											if (local21.anInt4375 == -1) {
												local1409 = local21.method3340(false);
											} else {
												local1409 = Static167.method2846(local21.anInt4375, local21.anInt4397, local21.anInt4389, local21.anInt4346, local21.aBoolean216);
											}
											if (local1409 != null) {
												local717 = local1409.anInt3019;
												local721 = local1409.anInt3021;
												if (local21.aBoolean217) {
													local733 = (local717 + local21.anInt4400 - 1) / local717;
													local742 = (local721 + local21.anInt4403 - 1) / local721;
													Static90.method3492(local109, local101, local109 + local21.anInt4400, local101 + local21.anInt4403);
													for (local887 = 0; local887 < local733; local887++) {
														for (local882 = 0; local882 < local742; local882++) {
															if (local21.anInt4376 != 0) {
																local1409.method2340(local717 * local887 + local109 + local717 / 2, local882 * local721 + (local101 - -(local721 / 2)), local21.anInt4376, 4096);
															} else if (local104 == 0) {
																local1409.method2347(local887 * local717 + local109, local101 - -(local721 * local882));
															} else {
																local1409.method2357(local887 * local717 + local109, local882 * local721 + local101, 256 - (local104 & 0xFF));
															}
														}
													}
													Static90.method3501(arg3, arg8, arg0, arg6);
												} else {
													local733 = local21.anInt4400 * 4096 / local717;
													if (local21.anInt4376 != 0) {
														local1409.method2340(local21.anInt4400 / 2 + local109, local21.anInt4403 / 2 + local101, local21.anInt4376, local733);
													} else if (local104 != 0) {
														local1409.method2343(local109, local101, local21.anInt4400, local21.anInt4403, 256 - (local104 & 0xFF));
													} else if (local717 == local21.anInt4400 && local21.anInt4403 == local721) {
														local1409.method2347(local109, local101);
													} else {
														local1409.method2361(local109, local101, local21.anInt4400, local21.anInt4403);
													}
												}
											} else if (Static52.aBoolean71) {
												Static199.method2199(local21);
											}
										} else {
											local1409 = local21.method3340(Static17.method391(local21));
											if (local1409 != null) {
												local1409.method2347(local109, local101);
											} else if (Static52.aBoolean71) {
												Static199.method2199(local21);
											}
										}
									} else {
										@Pc(1809) Class1_Sub2_Sub23 local1809;
										@Pc(1913) int local1913;
										if (local21.anInt4373 == 6) {
											@Pc(1672) boolean local1672 = Static17.method391(local21);
											@Pc(1674) Class5_Sub1 local1674 = null;
											local733 = 0;
											if (local1672) {
												local717 = local21.anInt4411;
											} else {
												local717 = local21.anInt4390;
											}
											if (local21.anInt4375 != -1) {
												local1809 = Static168.method2886(local21.anInt4375);
												if (local1809 != null) {
													local1809 = local1809.method3252(local21.anInt4346);
													local1674 = local1809.method3247(1, 0, null);
													if (local1674 == null) {
														Static199.method2199(local21);
													} else {
														local733 = -local1674.method3163() / 2;
													}
												}
											} else if (local21.anInt4363 == 5) {
												if (local21.anInt4362 == -1) {
													local1674 = Static69.aClass21_2.method633(-1, null, -1, null);
												} else {
													local742 = local21.anInt4362 & 0x7FF;
													if (Static111.anInt2534 == local742) {
														local742 = 2047;
													}
													@Pc(1769) Class5_Sub2_Sub1 local1769 = Static110.aClass5_Sub2_Sub1Array1[local742];
													@Pc(1779) Class1_Sub2_Sub22 local1779 = local717 == -1 ? null : Static85.method2622(local717);
													if (local1769 != null && (int) local1769.aClass24_173.method747() << 11 == (local21.anInt4362 & 0xFFFFF800)) {
														local1674 = local1769.aClass21_1.method633(local21.anInt4359, null, 0, local1779);
													}
												}
											} else if (local717 == -1) {
												local1674 = local21.method3342(null, local1672, Static87.aClass5_Sub2_Sub1_1.aClass21_1, -1);
												if (local1674 == null && Static52.aBoolean71) {
													Static199.method2199(local21);
												}
											} else {
												@Pc(1720) Class1_Sub2_Sub22 local1720 = Static85.method2622(local717);
												local1674 = local21.method3342(local1720, local1672, Static87.aClass5_Sub2_Sub1_1.aClass21_1, local21.anInt4359);
												if (local1674 == null && Static52.aBoolean71) {
													Static199.method2199(local21);
												}
											}
											if (local1674 != null) {
												if (local21.anInt4354 > 0) {
													local742 = (local21.anInt4400 << 8) / local21.anInt4354;
												} else {
													local742 = 256;
												}
												if (local21.anInt4409 > 0) {
													local887 = (local21.anInt4403 << 8) / local21.anInt4409;
												} else {
													local887 = 256;
												}
												local882 = (local742 * local21.anInt4385 >> 8) + local109 + local21.anInt4400 / 2;
												local778 = (local21.anInt4345 * local887 >> 8) + local21.anInt4403 / 2 + local101;
												Static182.method3139(local882, local778);
												local1913 = Class1_Sub2_Sub8_Sub4.anIntArray350[local21.anInt4353] * local21.anInt4404 >> 16;
												@Pc(1923) int local1923 = Class1_Sub2_Sub8_Sub4.anIntArray355[local21.anInt4353] * local21.anInt4404 >> 16;
												if (!local21.aBoolean211) {
													local1674.method167(local21.anInt4378, 0, local21.anInt4353, 0, local1913, local1923);
												} else if (local21.aBoolean205) {
													((Class5_Sub1_Sub1) local1674).method172(local21.anInt4378, local21.anInt4402, local21.anInt4353, local21.anInt4383, local1913 + local733 + local21.anInt4374, local1923 - -local21.anInt4374, local21.anInt4404);
												} else {
													local1674.method167(local21.anInt4378, local21.anInt4402, local21.anInt4353, local21.anInt4383, local21.anInt4374 + local733 + local1913, local21.anInt4374 + local1923);
												}
												Static182.method3142();
											}
										} else {
											if (local21.anInt4373 == 7) {
												local1238 = local21.method3333(Static33.aClass1_Sub2_Sub8_Sub2Array3);
												if (local1238 == null) {
													if (Static52.aBoolean71) {
														Static199.method2199(local21);
													}
													continue;
												}
												local717 = 0;
												for (local721 = 0; local721 < local21.anInt4417; local721++) {
													for (local733 = 0; local733 < local21.anInt4405; local733++) {
														if (local21.anIntArray393[local717] > 0) {
															local1809 = Static168.method2886(local21.anIntArray393[local717] - 1);
															@Pc(2078) Class24 local2078;
															if (local1809.anInt4214 != 1 && local21.anIntArray386[local717] == 1) {
																local2078 = Static63.method1281(new Class24[] { Static71.aClass24_526, local1809.aClass24_1214, Static40.aClass24_250 });
															} else {
																local2078 = Static63.method1281(new Class24[] { Static71.aClass24_526, local1809.aClass24_1214, Static194.aClass24_1246, Static199.method2198(local21.anIntArray386[local717]) });
															}
															local778 = local101 + local721 * (local21.anInt4392 + 12);
															local882 = local733 * (local21.anInt4410 + 115) + local109;
															if (local21.anInt4386 == 0) {
																local1238.method1273(local2078, local882, local778, local21.anInt4377, local21.aBoolean212 ? 0 : -1);
															} else if (local21.anInt4386 == 1) {
																local1238.method1246(local2078, local882 + 57, local778, local21.anInt4377, local21.aBoolean212 ? 0 : -1);
															} else {
																local1238.method1271(local2078, local882 + 114, local778, local21.anInt4377, local21.aBoolean212 ? 0 : -1);
															}
														}
														local717++;
													}
												}
											}
											if (local21.anInt4373 == 8 && Static44.aClass98_6 == local21 && Static158.anInt3507 == Static143.anInt3199) {
												local715 = 0;
												local717 = 0;
												@Pc(2204) Class1_Sub2_Sub8_Sub1_Sub1 local2204 = Static67.aClass1_Sub2_Sub8_Sub1_Sub1_2;
												@Pc(2207) Class24 local2207 = local21.aClass24_1260;
												local2207 = Static64.method1305(local21, local2207);
												@Pc(2229) Class24 local2229;
												while (local2207.method781() > 0) {
													local887 = local2207.method738(Static76.aClass24_558);
													if (local887 == -1) {
														local2229 = local2207;
														local2207 = Static85.aClass24_1000;
													} else {
														local2229 = local2207.method759(local887, 0);
														local2207 = local2207.method773(local887 + 4);
													}
													local882 = local2204.method1269(local2229);
													local717 += local2204.anInt1588 + 1;
													if (local715 < local882) {
														local715 = local882;
													}
												}
												local717 += 7;
												local715 += 6;
												local882 = local21.anInt4403 + local101 + 5;
												if (local882 + local717 > arg6) {
													local882 = arg6 - local717;
												}
												local887 = local109 + local21.anInt4400 - local715 - 5;
												if (local887 < local109 + 5) {
													local887 = local109 + 5;
												}
												if (arg0 < local887 + local715) {
													local887 = arg0 - local715;
												}
												Static90.method3482(local887, local882, local715, local717, 16777120);
												Static90.method3490(local887, local882, local715, local717, 0);
												local778 = local2204.anInt1588 + local882 + 2;
												local2207 = local21.aClass24_1260;
												local2207 = Static64.method1305(local21, local2207);
												while (local2207.method781() > 0) {
													local1913 = local2207.method738(Static76.aClass24_558);
													if (local1913 == -1) {
														local2229 = local2207;
														local2207 = Static85.aClass24_1000;
													} else {
														local2229 = local2207.method759(local1913, 0);
														local2207 = local2207.method773(local1913 + 4);
													}
													local2204.method1273(local2229, local887 + 3, local778, 0, -1);
													local778 += local2204.anInt1588 + 1;
												}
											}
											if (local21.anInt4373 == 9) {
												if (local21.aBoolean214) {
													local717 = local21.anInt4403 + local101;
													local721 = local109 + local21.anInt4400;
													local733 = local101;
												} else {
													local721 = local21.anInt4400 + local109;
													local717 = local101;
													local733 = local21.anInt4403 + local101;
												}
												if (local21.anInt4408 == 1) {
													Static90.method3491(local109, local717, local721, local733, local21.anInt4377);
												} else {
													Static90.method3483(local109, local717, local721, local733, local21.anInt4377, local21.anInt4408);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZI)Lclient!dj;")
	public static Class24 method520(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(31) int local31 = 1;
		for (@Pc(35) int local35 = arg0 / 10; local35 != 0; local35 /= 10) {
			local31++;
		}
		@Pc(48) int local48 = local31;
		if (arg0 < 0 || arg1) {
			local48 = local31 + 1;
		}
		@Pc(56) byte[] local56 = new byte[local48];
		if (arg0 < 0) {
			local56[0] = 45;
		} else if (arg1) {
			local56[0] = 43;
		}
		for (@Pc(74) int local74 = 0; local74 < local31; local74++) {
			@Pc(79) int local79 = arg0 % 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			arg0 /= 10;
			if (local79 > 9) {
				local79 += 39;
			}
			local56[local48 - local74 - 1] = (byte) (local79 + 48);
		}
		@Pc(117) Class24 local117 = new Class24();
		local117.anInt1084 = local48;
		local117.aByteArray13 = local56;
		return local117;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!nf;Lclient!af;II)V")
	public static void method522(@OriginalArg(0) Class69_Sub1 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class87 local5 = Static12.aClass87_6;
		synchronized (Static12.aClass87_6) {
			for (@Pc(12) Class1_Sub25 local12 = (Class1_Sub25) Static12.aClass87_6.method2827(); local12 != null; local12 = (Class1_Sub25) Static12.aClass87_6.method2830()) {
				if ((long) arg2 == local12.aLong149 && local12.aClass6_4 == arg1 && local12.anInt4438 == 0) {
					local3 = local12.aByteArray55;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(68) byte[] local68 = arg1.method189(arg2);
			arg0.method2229(arg2, true, local68, arg1);
		} else {
			arg0.method2229(arg2, true, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt1550; local12++) {
			@Pc(18) Class51 local18 = local7.aClass51Array1[local12];
			if ((local18.aLong68 >> 29 & 0x3L) == 2L && local18.anInt2213 == arg1 && local18.anInt2218 == arg2) {
				Static162.method2730(local18);
				return;
			}
		}
	}
}
