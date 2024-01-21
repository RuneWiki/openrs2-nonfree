import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt2512;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "J")
	public static long aLong84;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!kb;")
	private static Class46 aClass46_834 = Static65.method1172("Your account is already logged in)3");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!kb;")
	public static Class46 aClass46_833 = aClass46_834;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_835 = Static65.method1172("<)4col>");

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt2516 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[B)Z")
	public static boolean method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub4 local17 = new Class3_Sub4(arg2);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method209();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method209();
					if (local42 == 0) {
						continue label56;
					}
					local34 += local42 - 1;
					@Pc(68) int local68 = local34 & 0x3F;
					@Pc(74) int local74 = local17.method191() >> 2;
					@Pc(80) int local80 = local34 >> 6 & 0x3F;
					@Pc(84) int local84 = arg0 + local68;
					@Pc(88) int local88 = arg1 + local80;
					if (local88 > 0 && local84 > 0 && local88 < 103 && local84 < 103) {
						@Pc(110) Class3_Sub2_Sub9 local110 = Static136.method2319(local19);
						if (local74 != 22 || !Static71.aBoolean76 || local110.anInt1818 != 0 || local110.anInt1820 == 1 || local110.aBoolean74) {
							if (!local110.method1212()) {
								local12 = false;
								Static74.anInt1886++;
							}
							local36 = true;
						}
					}
				}
				local42 = local17.method209();
				if (local42 == 0) {
					break;
				}
				local17.method191();
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[Lclient!h;IIIIIZ)V")
	public static void method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static103.method2215(arg4, arg0, arg6, arg5);
		Static132.method2230();
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class33 local23 = arg3[local17];
			if (local23 != null && (arg2 == local23.anInt1479 || arg2 == -1412584499 && Static63.aClass33_5 == local23)) {
				@Pc(71) int local71;
				if (arg7 == -1) {
					Static119.anIntArray326[Static21.anInt3036] = arg8 + local23.anInt1461;
					Static33.anIntArray68[Static21.anInt3036] = arg1 + local23.anInt1449;
					Static42.anIntArray104[Static21.anInt3036] = local23.anInt1424;
					Static54.anIntArray133[Static21.anInt3036] = local23.anInt1428;
					local71 = Static21.anInt3036++;
				} else {
					local71 = arg7;
				}
				local23.anInt1459 = Static20.anInt512;
				local23.anInt1474 = local71;
				if (!local23.aBoolean50 || !Static114.method1917(local23)) {
					if (local23.anInt1432 > 0) {
						Static59.method1101(local23);
					}
					@Pc(100) int local100 = local23.anInt1492;
					@Pc(105) int local105 = arg8 + local23.anInt1461;
					@Pc(110) int local110 = arg1 + local23.anInt1449;
					@Pc(144) int local144;
					@Pc(138) int local138;
					if (Static63.aClass33_5 == local23) {
						if (arg2 != -1412584499 && !local23.aBoolean53) {
							Static106.anInt2533 = arg1;
							Static24.aClass33Array1 = arg3;
							anInt2514 = arg8;
							continue;
						}
						if (!local23.aBoolean53) {
							local100 = 128;
						}
						if (Static28.aBoolean25 && Static64.aBoolean63) {
							local138 = Static149.anInt3582;
							local138 -= Static163.anInt3627;
							local144 = Static85.anInt676;
							if (Static122.anInt2904 > local138) {
								local138 = Static122.anInt2904;
							}
							local144 -= Static1.anInt15;
							if (local138 + local23.anInt1428 > Static30.aClass33_2.anInt1428 + Static122.anInt2904) {
								local138 = Static122.anInt2904 + Static30.aClass33_2.anInt1428 - local23.anInt1428;
							}
							if (local144 < Static29.anInt698) {
								local144 = Static29.anInt698;
							}
							if (Static29.anInt698 + Static30.aClass33_2.anInt1424 < local23.anInt1424 + local144) {
								local144 = Static29.anInt698 + Static30.aClass33_2.anInt1424 - local23.anInt1424;
							}
							local110 = local138;
							local105 = local144;
						}
					}
					@Pc(259) int local259;
					@Pc(292) int local292;
					@Pc(224) int local224;
					@Pc(226) int local226;
					@Pc(231) int local231;
					@Pc(264) int local264;
					if (local23.anInt1441 == 2) {
						local144 = arg4;
						local259 = arg6;
						local138 = arg0;
						local292 = arg5;
					} else if (local23.anInt1441 == 9) {
						local224 = local105;
						local226 = local110;
						local231 = local23.anInt1424 + local105;
						if (local105 > local231) {
							local224 = local231;
							local231 = local105;
						}
						local144 = local224 > arg4 ? local224 : arg4;
						local231++;
						local259 = local231 >= arg6 ? arg6 : local231;
						local264 = local23.anInt1428 + local110;
						if (local264 < local110) {
							local226 = local264;
							local264 = local110;
						}
						local138 = local226 <= arg0 ? arg0 : local226;
						local264++;
						local292 = local264 >= arg5 ? arg5 : local264;
					} else {
						local144 = local105 <= arg4 ? arg4 : local105;
						local138 = arg0 >= local110 ? arg0 : local110;
						local224 = local105 + local23.anInt1424;
						local259 = local224 < arg6 ? local224 : arg6;
						local226 = local110 + local23.anInt1428;
						local292 = local226 < arg5 ? local226 : arg5;
					}
					if (!local23.aBoolean50 || local144 < local259 && local138 < local292) {
						if (local23.anInt1432 != 0) {
							if (local23.anInt1432 == 1337) {
								Static54.anInt1412 = local110;
								Static89.anInt2175 = local105;
								Static99.method1644(local110, local105, local23.anInt1424, local23.anInt1428);
								Static103.method2215(arg4, arg0, arg6, arg5);
								continue;
							}
							if (local23.anInt1432 == 1338) {
								Static134.method2268(local110, local71, local105);
								Static103.method2215(arg4, arg0, arg6, arg5);
								continue;
							}
						}
						local226 = Static149.anInt3582;
						local224 = Static85.anInt676;
						if (!aBoolean103 && local224 >= local144 && local226 >= local138 && local259 > local224 && local292 > local226) {
							Static42.method852(local23, local224 - local105, -local110 + local226);
						}
						if (local23.anInt1441 == 0) {
							if (!local23.aBoolean50 && Static114.method1917(local23) && local23 != Static69.aClass33_6) {
								continue;
							}
							if (!local23.aBoolean50) {
								if (local23.anInt1486 > local23.anInt1455 - local23.anInt1428) {
									local23.anInt1486 = local23.anInt1455 - local23.anInt1428;
								}
								if (local23.anInt1486 < 0) {
									local23.anInt1486 = 0;
								}
							}
							method1724(local138, local110 - local23.anInt1486, local23.anInt1434, arg3, local144, local292, local259, local71, local105 - local23.anInt1465);
							if (local23.aClass33Array2 != null) {
								method1724(local138, local110 - local23.anInt1486, local23.anInt1434, local23.aClass33Array2, local144, local292, local259, local71, local105 - local23.anInt1465);
							}
							@Pc(544) Class3_Sub12 local544 = (Class3_Sub12) Static129.aClass54_10.method1602((long) local23.anInt1434);
							if (local544 != null) {
								if (local544.anInt1763 == 0 && Static85.anInt676 >= local144 && local138 <= Static149.anInt3582 && local259 > Static85.anInt676 && Static149.anInt3582 < local292 && !aBoolean103 && !Static118.aBoolean118) {
									Static150.aClass46Array22[0] = Static30.aClass46_185;
									Static32.aClass46Array5[0] = Static38.aClass46_298;
									Static87.anInt2129 = 1;
									Static134.anIntArray352[0] = 1003;
								}
								Static111.method1822(local138, local259, local105, local71, local544.anInt1766, local144, local110, local292);
							}
							Static103.method2215(arg4, arg0, arg6, arg5);
							Static132.method2230();
						}
						if (Static133.aBooleanArray18[local71] || Static127.anInt3012 > 1) {
							if (local23.anInt1441 == 0 && !local23.aBoolean50 && local23.anInt1455 > local23.anInt1428) {
								Static74.method1249(local23.anInt1428, local23.anInt1486, local110, local105 + local23.anInt1424, local23.anInt1455);
							}
							if (local23.anInt1441 != 1) {
								@Pc(657) int local657;
								@Pc(678) int local678;
								@Pc(812) int local812;
								@Pc(716) int local716;
								@Pc(865) int local865;
								@Pc(863) int local863;
								@Pc(895) int local895;
								@Pc(668) int local668;
								@Pc(827) int local827;
								if (local23.anInt1441 == 2) {
									local231 = 0;
									for (local264 = 0; local264 < local23.anInt1428; local264++) {
										for (local657 = 0; local657 < local23.anInt1424; local657++) {
											local668 = (local23.anInt1440 + 32) * local264 + local110;
											local678 = local105 + local657 * (local23.anInt1489 + 32);
											if (local231 < 20) {
												local678 += local23.anIntArray141[local231];
												local668 += local23.anIntArray145[local231];
											}
											if (local23.anIntArray142[local231] > 0) {
												local716 = local23.anIntArray142[local231] - 1;
												if (local678 + 32 > arg4 && local678 < arg6 && local668 + 32 > arg0 && local668 < arg5 || local23 == Static135.aClass33_13 && local231 == Static53.anInt1393) {
													@Pc(767) Class3_Sub2_Sub3_Sub3 local767;
													if (Static127.anInt3014 == 1 && local231 == Static130.anInt3066 && local23.anInt1434 == Static124.anInt2959) {
														local767 = Static165.method2652(0, local716, 2, false, local23.anIntArray138[local231]);
													} else {
														local767 = Static165.method2652(3153952, local716, 1, false, local23.anIntArray138[local231]);
													}
													if (local767 == null) {
														Static142.method2373(local23);
													} else if (Static135.aClass33_13 == local23 && Static53.anInt1393 == local231) {
														local812 = Static149.anInt3582 - Static96.anInt2348;
														if (local812 < 5 && local812 > -5) {
															local812 = 0;
														}
														local827 = Static85.anInt676 - Static58.anInt1579;
														if (local827 < 5 && local827 > -5) {
															local827 = 0;
														}
														if (Static21.anInt3035 < 5) {
															local812 = 0;
															local827 = 0;
														}
														local767.method1885(local678 + local827, local668 - -local812, 128);
														if (arg2 != -1) {
															local863 = Static103.anInt3087;
															local865 = Static103.anInt3090;
															@Pc(871) Class33 local871 = arg3[arg2 & 0xFFFF];
															if (local865 > local668 + local812 && local871.anInt1486 > 0) {
																local895 = Static22.anInt526 * (local865 - local812 - local668) / 3;
																if (local895 > Static22.anInt526 * 10) {
																	local895 = Static22.anInt526 * 10;
																}
																if (local871.anInt1486 < local895) {
																	local895 = local871.anInt1486;
																}
																local871.anInt1486 -= local895;
																Static96.anInt2348 += local895;
																Static142.method2373(local871);
															}
															if (local668 + local812 + 32 > local863 && local871.anInt1486 < local871.anInt1455 - local871.anInt1428) {
																local895 = (local668 + local812 + 32 - local863) * Static22.anInt526 / 3;
																if (Static22.anInt526 * 10 < local895) {
																	local895 = Static22.anInt526 * 10;
																}
																if (local871.anInt1455 - local871.anInt1486 - local871.anInt1428 < local895) {
																	local895 = local871.anInt1455 - local871.anInt1486 - local871.anInt1428;
																}
																Static96.anInt2348 -= local895;
																local871.anInt1486 += local895;
																Static142.method2373(local871);
															}
														}
													} else if (Static93.aClass33_11 == local23 && local231 == Static178.anInt3923) {
														local767.method1885(local678, local668, 128);
													} else {
														local767.method1880(local678, local668);
													}
												}
											} else if (local23.anIntArray144 != null && local231 < 20) {
												@Pc(1035) Class3_Sub2_Sub3_Sub3 local1035 = local23.method1031(local231);
												if (local1035 != null) {
													local1035.method1880(local678, local668);
												} else if (Static64.aBoolean64) {
													Static142.method2373(local23);
												}
											}
											local231++;
										}
									}
								} else if (local23.anInt1441 == 3) {
									if (Static120.method2039(local23)) {
										local231 = local23.anInt1421;
										if (Static69.aClass33_6 == local23 && local23.anInt1464 != 0) {
											local231 = local23.anInt1464;
										}
									} else {
										local231 = local23.anInt1488;
										if (Static69.aClass33_6 == local23 && local23.anInt1473 != 0) {
											local231 = local23.anInt1473;
										}
									}
									if (local100 == 0) {
										if (local23.aBoolean47) {
											Static103.method2210(local105, local110, local23.anInt1424, local23.anInt1428, local231);
										} else {
											Static103.method2228(local105, local110, local23.anInt1424, local23.anInt1428, local231);
										}
									} else if (local23.aBoolean47) {
										Static103.method2213(local105, local110, local23.anInt1424, local23.anInt1428, local231, 256 - (local100 & 0xFF));
									} else {
										Static103.method2212(local105, local110, local23.anInt1424, local23.anInt1428, local231, 256 - (local100 & 0xFF));
									}
								} else {
									@Pc(1175) Class3_Sub2_Sub3_Sub1_Sub1 local1175;
									if (local23.anInt1441 == 4) {
										local1175 = local23.method1036();
										if (local1175 != null) {
											@Pc(1187) Class46 local1187 = local23.aClass46_486;
											if (Static120.method2039(local23)) {
												local264 = local23.anInt1421;
												if (Static69.aClass33_6 == local23 && local23.anInt1464 != 0) {
													local264 = local23.anInt1464;
												}
												if (local23.aClass46_483.method1376() > 0) {
													local1187 = local23.aClass46_483;
												}
											} else {
												local264 = local23.anInt1488;
												if (Static69.aClass33_6 == local23 && local23.anInt1473 != 0) {
													local264 = local23.anInt1473;
												}
											}
											if (local23.aBoolean50 && local23.anInt1419 != -1) {
												@Pc(1243) Class3_Sub2_Sub14 local1243 = Static146.method2432(local23.anInt1419);
												local1187 = local1243.aClass46_1163;
												if (local1187 == null) {
													local1187 = Static63.aClass46_566;
												}
												if ((local1243.anInt3324 == 1 || local23.anInt1471 != 1) && local23.anInt1471 != -1) {
													local1187 = Static178.method2860(new Class46[] { Static54.aClass46_475, local1187, Static27.aClass46_166, Static133.method2255(local23.anInt1471) });
												}
											}
											if (local23 == Static71.aClass33_7) {
												local1187 = Static133.aClass46_1075;
												local264 = local23.anInt1488;
											}
											if (!local23.aBoolean50) {
												local1187 = Static63.method1141(local1187, local23);
											}
											local1175.method819(local1187, local105, local110, local23.anInt1424, local23.anInt1428, local264, local23.aBoolean44 ? 0 : -1, local23.anInt1454, local23.anInt1478, local23.anInt1452);
										} else if (Static64.aBoolean64) {
											Static142.method2373(local23);
										}
									} else if (local23.anInt1441 == 5) {
										@Pc(1347) Class3_Sub2_Sub3_Sub3 local1347;
										if (local23.aBoolean50) {
											if (local23.anInt1419 == -1) {
												local1347 = local23.method1034(false);
											} else {
												local1347 = Static165.method2652(local23.anInt1482, local23.anInt1419, local23.anInt1426, false, local23.anInt1471);
											}
											if (local1347 != null) {
												local657 = local1347.anInt2695;
												local264 = local1347.anInt2696;
												if (local23.aBoolean45) {
													Static103.method2217(local105, local110, local23.anInt1424 + local105, local23.anInt1428 + local110);
													local678 = (local23.anInt1424 + local264 - 1) / local264;
													local668 = (local657 + local23.anInt1428 - 1) / local657;
													for (local827 = 0; local827 < local678; local827++) {
														for (local812 = 0; local812 < local668; local812++) {
															if (local23.anInt1475 != 0) {
																local1347.method1883(local264 * local827 + local105 + local264 / 2, local657 / 2 + (local110 - -(local657 * local812)), local23.anInt1475, 4096);
															} else if (local100 == 0) {
																local1347.method1880(local264 * local827 + local105, local110 - -(local657 * local812));
															} else {
																local1347.method1885(local105 + local264 * local827, local812 * local657 + local110, 256 - (local100 & 0xFF));
															}
														}
													}
													Static103.method2215(arg4, arg0, arg6, arg5);
												} else {
													local678 = local23.anInt1424 * 4096 / local264;
													if (local23.anInt1475 != 0) {
														local1347.method1883(local23.anInt1424 / 2 + local105, local110 + local23.anInt1428 / 2, local23.anInt1475, local678);
													} else if (local100 != 0) {
														local1347.method1891(local105, local110, local23.anInt1424, local23.anInt1428, 256 - (local100 & 0xFF));
													} else if (local264 == local23.anInt1424 && local23.anInt1428 == local657) {
														local1347.method1880(local105, local110);
													} else {
														local1347.method1887(local105, local110, local23.anInt1424, local23.anInt1428);
													}
												}
											} else if (Static64.aBoolean64) {
												Static142.method2373(local23);
											}
										} else {
											local1347 = local23.method1034(Static120.method2039(local23));
											if (local1347 != null) {
												local1347.method1880(local105, local110);
											} else if (Static64.aBoolean64) {
												Static142.method2373(local23);
											}
										}
									} else {
										@Pc(1751) Class3_Sub2_Sub14 local1751;
										if (local23.anInt1441 == 6) {
											@Pc(1610) boolean local1610 = Static120.method2039(local23);
											if (local1610) {
												local264 = local23.anInt1491;
											} else {
												local264 = local23.anInt1493;
											}
											@Pc(1622) Class3_Sub2_Sub1_Sub2 local1622 = null;
											local678 = 0;
											if (local23.anInt1419 != -1) {
												local1751 = Static146.method2432(local23.anInt1419);
												if (local1751 != null) {
													local1751 = local1751.method2423(local23.anInt1471);
													local1622 = local1751.method2427(null, 1, 0);
													if (local1622 == null) {
														Static142.method2373(local23);
													} else {
														local1622.method1785();
														local678 = -local1622.aShort34 / 2;
													}
												}
											} else if (local23.anInt1494 == 5) {
												if (local23.anInt1418 == -1) {
													local1622 = Static70.aClass64_2.method2116(-1, -1, null, null);
												} else {
													local668 = local23.anInt1418 & 0x7FF;
													if (Static6.anInt137 == local668) {
														local668 = 2047;
													}
													@Pc(1698) Class3_Sub2_Sub1_Sub1_Sub1 local1698 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local668];
													@Pc(1708) Class3_Sub2_Sub2 local1708 = local264 == -1 ? null : Static35.method628(local264);
													if (local1698 != null && (int) local1698.aClass46_233.method1348() << 11 == (local23.anInt1418 & 0xFFFFF800)) {
														local1622 = local1698.aClass64_1.method2116(local23.anInt1423, 0, null, local1708);
													}
												}
											} else if (local264 == -1) {
												local1622 = local23.method1029(local1610, -1, null, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1);
												if (local1622 == null && Static64.aBoolean64) {
													Static142.method2373(local23);
												}
											} else {
												@Pc(1641) Class3_Sub2_Sub2 local1641 = Static35.method628(local264);
												local1622 = local23.method1029(local1610, local23.anInt1423, local1641, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass64_1);
												if (local1622 == null && Static64.aBoolean64) {
													Static142.method2373(local23);
												}
											}
											if (local1622 != null) {
												Static132.method2233(local23.anInt1495 + local23.anInt1424 / 2 + local105, local23.anInt1428 / 2 + (local110 - -local23.anInt1490));
												local668 = Class3_Sub2_Sub3_Sub4.anIntArray347[local23.anInt1460] * local23.anInt1444 >> 16;
												local827 = Class3_Sub2_Sub3_Sub4.anIntArray346[local23.anInt1460] * local23.anInt1444 >> 16;
												if (!local23.aBoolean50) {
													local1622.method1788(local23.anInt1485, 0, local23.anInt1460, 0, local668, local827);
												} else if (local23.aBoolean51) {
													local1622.method1794(local23.anInt1485, local23.anInt1496, local23.anInt1460, local23.anInt1477, local668 + local678 + local23.anInt1430, local23.anInt1430 + local827, local23.anInt1444);
												} else {
													local1622.method1788(local23.anInt1485, local23.anInt1496, local23.anInt1460, local23.anInt1477, local23.anInt1430 + local668 + local678, local827 - -local23.anInt1430);
												}
												Static132.method2234();
											}
										} else {
											if (local23.anInt1441 == 7) {
												local1175 = local23.method1036();
												if (local1175 == null) {
													if (Static64.aBoolean64) {
														Static142.method2373(local23);
													}
													continue;
												}
												local264 = 0;
												for (local657 = 0; local657 < local23.anInt1428; local657++) {
													for (local678 = 0; local678 < local23.anInt1424; local678++) {
														if (local23.anIntArray142[local264] > 0) {
															local1751 = Static146.method2432(local23.anIntArray142[local264] - 1);
															@Pc(1971) Class46 local1971;
															if (local1751.anInt3324 != 1 && local23.anIntArray138[local264] == 1) {
																local1971 = Static178.method2860(new Class46[] { Static54.aClass46_475, local1751.aClass46_1163, aClass46_835 });
															} else {
																local1971 = Static178.method2860(new Class46[] { Static54.aClass46_475, local1751.aClass46_1163, Static27.aClass46_166, Static133.method2255(local23.anIntArray138[local264]) });
															}
															local716 = local110 + (local23.anInt1440 + 12) * local657;
															local812 = local105 + local678 * (local23.anInt1489 + 115);
															if (local23.anInt1454 == 0) {
																local1175.method821(local1971, local812, local716, local23.anInt1488, local23.aBoolean44 ? 0 : -1);
															} else if (local23.anInt1454 == 1) {
																local1175.method805(local1971, local23.anInt1424 / 2 + local812, local716, local23.anInt1488, local23.aBoolean44 ? 0 : -1);
															} else {
																local1175.method812(local1971, local812 + local23.anInt1424 - 1, local716, local23.anInt1488, local23.aBoolean44 ? 0 : -1);
															}
														}
														local264++;
													}
												}
											}
											@Pc(2264) int local2264;
											if (local23.anInt1441 == 8 && Static128.aClass33_12 == local23 && Static19.anInt445 == Static98.anInt2375) {
												local231 = 0;
												local264 = 0;
												@Pc(2113) Class3_Sub2_Sub3_Sub1_Sub1 local2113 = Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2;
												@Pc(2116) Class46 local2116 = local23.aClass46_486;
												local2116 = Static63.method1141(local2116, local23);
												@Pc(2133) Class46 local2133;
												while (local2116.method1376() > 0) {
													local827 = local2116.method1355(Static112.aClass46_907);
													if (local827 == -1) {
														local2133 = local2116;
														local2116 = Static38.aClass46_298;
													} else {
														local2133 = local2116.method1363(local827, 0);
														local2116 = local2116.method1380(local827 + 4);
													}
													local812 = local2113.method813(local2133);
													local264 += local2113.anInt1152 + 1;
													if (local812 > local231) {
														local231 = local812;
													}
												}
												local812 = local110 + local23.anInt1428 + 5;
												local231 += 6;
												local264 += 7;
												local827 = local105 + local23.anInt1424 - local231 - 5;
												if (arg5 < local264 + local812) {
													local812 = arg5 - local264;
												}
												if (local105 + 5 > local827) {
													local827 = local105 + 5;
												}
												if (local231 + local827 > arg6) {
													local827 = arg6 - local231;
												}
												Static103.method2210(local827, local812, local231, local264, 16777120);
												Static103.method2228(local827, local812, local231, local264, 0);
												local2116 = local23.aClass46_486;
												local716 = local2113.anInt1152 + local812 + 2;
												local2116 = Static63.method1141(local2116, local23);
												while (local2116.method1376() > 0) {
													local2264 = local2116.method1355(Static112.aClass46_907);
													if (local2264 == -1) {
														local2133 = local2116;
														local2116 = Static38.aClass46_298;
													} else {
														local2133 = local2116.method1363(local2264, 0);
														local2116 = local2116.method1380(local2264 + 4);
													}
													local2113.method821(local2133, local827 + 3, local716, 0, -1);
													local716 += local2113.anInt1152 + 1;
												}
											}
											if (local23.anInt1441 == 9) {
												if (local23.anInt1439 == 1) {
													Static103.method2227(local105, local110, local23.anInt1424 + local105, local110 + local23.anInt1428, local23.anInt1488);
												} else {
													local231 = local23.anInt1424 >= 0 ? local23.anInt1424 : -local23.anInt1424;
													local264 = local23.anInt1428 >= 0 ? local23.anInt1428 : -local23.anInt1428;
													local657 = local231;
													if (local264 > local231) {
														local657 = local264;
													}
													if (local657 != 0) {
														local678 = (local23.anInt1424 << 16) / local657;
														local668 = (local23.anInt1428 << 16) / local657;
														if (local668 <= local678) {
															local678 = -local678;
														} else {
															local668 = -local668;
														}
														local812 = local23.anInt1439 * local668 + 1 >> 17;
														local827 = local668 * local23.anInt1439 >> 17;
														local2264 = local678 * local23.anInt1439 + 1 >> 17;
														local716 = local678 * local23.anInt1439 >> 17;
														@Pc(2435) int local2435 = local105 - arg4;
														local865 = local110 - arg0;
														local863 = local2435 + local827;
														local895 = local2435 - local812;
														@Pc(2456) int local2456 = local23.anInt1424 + local2435 - local812;
														@Pc(2460) int local2460 = local865 + local716;
														@Pc(2467) int local2467 = local23.anInt1424 + local2435 + local827;
														@Pc(2475) int local2475 = local865 + local23.anInt1428 - local2264;
														@Pc(2483) int local2483 = local716 + local865 + local23.anInt1428;
														@Pc(2488) int local2488 = local865 - local2264;
														Static132.method2242(local863, local895, local2456);
														Static132.method2239(local2460, local2488, local2475, local863, local895, local2456, local23.anInt1488);
														Static132.method2242(local863, local2456, local2467);
														Static132.method2239(local2460, local2475, local2483, local863, local2456, local2467, local23.anInt1488);
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
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1725() {
		aClass46_833 = null;
		aClass46_835 = null;
		aClass46_834 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Z")
	public static boolean method1727() {
		@Pc(4) long local4 = Static150.method2481();
		@Pc(14) int local14 = (int) (local4 - aLong84);
		if (local14 > 200) {
			local14 = 200;
		}
		Static154.anInt3473 += local14;
		aLong84 = local4;
		if (Static15.anInt408 == 0 && Static23.anInt531 == 0 && Static74.anInt1883 == 0 && Static137.anInt3204 == 0) {
			return true;
		} else if (Static52.aClass1_1 == null) {
			return false;
		} else {
			try {
				if (Static154.anInt3473 > 30000) {
					throw new IOException();
				}
				@Pc(68) Class3_Sub2_Sub13 local68;
				@Pc(73) Class3_Sub4 local73;
				while (Static23.anInt531 < 20 && Static137.anInt3204 > 0) {
					local68 = (Class3_Sub2_Sub13) Static182.aClass54_13.method1598();
					local73 = new Class3_Sub4(4);
					local73.method206(1);
					local73.method187((int) local68.aLong143);
					Static52.aClass1_1.method6(local73.aByteArray5, 4);
					Static9.aClass54_1.method1603(local68.aLong143, local68);
					Static137.anInt3204--;
					Static23.anInt531++;
				}
				while (Static15.anInt408 < 20 && Static74.anInt1883 > 0) {
					local68 = (Class3_Sub2_Sub13) Static80.aClass7_1.method297();
					local73 = new Class3_Sub4(4);
					local73.method206(0);
					local73.method187((int) local68.aLong143);
					Static52.aClass1_1.method6(local73.aByteArray5, 4);
					local68.method2886();
					Static110.aClass54_7.method1603(local68.aLong143, local68);
					Static15.anInt408++;
					Static74.anInt1883--;
				}
				for (@Pc(169) int local169 = 0; local169 < 100; local169++) {
					@Pc(177) int local177 = Static52.aClass1_1.method4();
					if (local177 < 0) {
						throw new IOException();
					}
					if (local177 == 0) {
						break;
					}
					Static154.anInt3473 = 0;
					@Pc(195) byte local195 = 0;
					if (Static170.aClass3_Sub2_Sub13_1 == null) {
						local195 = 8;
					} else if (Static51.anInt1389 == 0) {
						local195 = 1;
					}
					@Pc(213) int local213;
					@Pc(230) int local230;
					@Pc(286) int local286;
					@Pc(303) int local303;
					if (local195 > 0) {
						local213 = local195 - Static92.aClass3_Sub4_4.anInt232;
						if (local177 < local213) {
							local213 = local177;
						}
						Static52.aClass1_1.method3(Static92.aClass3_Sub4_4.aByteArray5, local213, Static92.aClass3_Sub4_4.anInt232);
						if (Static58.aByte3 != 0) {
							for (local230 = 0; local230 < local213; local230++) {
								Static92.aClass3_Sub4_4.aByteArray5[local230 + Static92.aClass3_Sub4_4.anInt232] ^= Static58.aByte3;
							}
						}
						Static92.aClass3_Sub4_4.anInt232 += local213;
						if (local195 > Static92.aClass3_Sub4_4.anInt232) {
							break;
						}
						if (Static170.aClass3_Sub2_Sub13_1 == null) {
							Static92.aClass3_Sub4_4.anInt232 = 0;
							local230 = Static92.aClass3_Sub4_4.method191();
							local286 = Static92.aClass3_Sub4_4.method208();
							@Pc(293) long local293 = (long) (local286 + (local230 << 16));
							@Pc(299) int local299 = Static92.aClass3_Sub4_4.method191();
							local303 = Static92.aClass3_Sub4_4.method213();
							@Pc(309) Class3_Sub2_Sub13 local309 = (Class3_Sub2_Sub13) Static9.aClass54_1.method1602(local293);
							Static114.aBoolean113 = true;
							if (local309 == null) {
								local309 = (Class3_Sub2_Sub13) Static110.aClass54_7.method1602(local293);
								Static114.aBoolean113 = false;
							}
							if (local309 == null) {
								throw new IOException();
							}
							Static170.aClass3_Sub2_Sub13_1 = local309;
							@Pc(338) int local338 = local299 == 0 ? 5 : 9;
							Static68.aClass3_Sub4_2 = new Class3_Sub4(Static170.aClass3_Sub2_Sub13_1.aByte8 + local338 + local303);
							Static68.aClass3_Sub4_2.method206(local299);
							Static68.aClass3_Sub4_2.method188(local303);
							Static51.anInt1389 = 8;
							Static92.aClass3_Sub4_4.anInt232 = 0;
						} else if (Static51.anInt1389 == 0) {
							if (Static92.aClass3_Sub4_4.aByteArray5[0] == -1) {
								Static51.anInt1389 = 1;
								Static92.aClass3_Sub4_4.anInt232 = 0;
							} else {
								Static170.aClass3_Sub2_Sub13_1 = null;
							}
						}
					} else {
						local213 = Static68.aClass3_Sub4_2.aByteArray5.length - Static170.aClass3_Sub2_Sub13_1.aByte8;
						local230 = 512 - Static51.anInt1389;
						if (local230 > local213 - Static68.aClass3_Sub4_2.anInt232) {
							local230 = local213 - Static68.aClass3_Sub4_2.anInt232;
						}
						if (local230 > local177) {
							local230 = local177;
						}
						Static52.aClass1_1.method3(Static68.aClass3_Sub4_2.aByteArray5, local230, Static68.aClass3_Sub4_2.anInt232);
						if (Static58.aByte3 != 0) {
							for (local286 = 0; local286 < local230; local286++) {
								Static68.aClass3_Sub4_2.aByteArray5[local286 + Static68.aClass3_Sub4_2.anInt232] ^= Static58.aByte3;
							}
						}
						Static68.aClass3_Sub4_2.anInt232 += local230;
						Static51.anInt1389 += local230;
						if (local213 == Static68.aClass3_Sub4_2.anInt232) {
							if (Static170.aClass3_Sub2_Sub13_1.aLong143 == 16711935L) {
								Static58.aClass3_Sub4_1 = Static68.aClass3_Sub4_2;
								for (local286 = 0; local286 < 256; local286++) {
									@Pc(557) Class44_Sub1 local557 = Static135.aClass44_Sub1Array1[local286];
									if (local557 != null) {
										Static58.aClass3_Sub4_1.anInt232 = local286 * 8 + 5;
										local303 = Static58.aClass3_Sub4_1.method213();
										@Pc(576) int local576 = Static58.aClass3_Sub4_1.method213();
										local557.method1639(local576, local303);
									}
								}
							} else {
								Static97.aCRC32_5.reset();
								Static97.aCRC32_5.update(Static68.aClass3_Sub4_2.aByteArray5, 0, local213);
								local286 = (int) Static97.aCRC32_5.getValue();
								if (local286 != Static170.aClass3_Sub2_Sub13_1.anInt3281) {
									try {
										Static52.aClass1_1.method10();
									} catch (@Pc(501) Exception local501) {
									}
									Static52.aClass1_1 = null;
									Static160.anInt3564++;
									Static58.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static2.anInt22 = 0;
								Static160.anInt3564 = 0;
								Static170.aClass3_Sub2_Sub13_1.aClass44_Sub1_13.method1640((Static170.aClass3_Sub2_Sub13_1.aLong143 & 0xFF0000L) == 16711680L, Static68.aClass3_Sub4_2.aByteArray5, Static114.aBoolean113, (int) (Static170.aClass3_Sub2_Sub13_1.aLong143 & 0xFFFFL));
							}
							Static170.aClass3_Sub2_Sub13_1.method2900();
							Static68.aClass3_Sub4_2 = null;
							if (Static114.aBoolean113) {
								Static23.anInt531--;
							} else {
								Static15.anInt408--;
							}
							Static170.aClass3_Sub2_Sub13_1 = null;
							Static51.anInt1389 = 0;
						} else {
							if (Static51.anInt1389 != 512) {
								break;
							}
							Static51.anInt1389 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(623) IOException local623) {
				try {
					Static52.aClass1_1.method10();
				} catch (@Pc(628) Exception local628) {
				}
				Static52.aClass1_1 = null;
				Static2.anInt22++;
				return false;
			}
		}
	}
}
