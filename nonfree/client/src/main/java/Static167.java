import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
	public static int anInt3743;

	@OriginalMember(owner = "client!uf", name = "lb", descriptor = "[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] aClass2_Sub4_Sub3_Sub3Array10;

	@OriginalMember(owner = "client!uf", name = "sb", descriptor = "I")
	public static int anInt3751;

	@OriginalMember(owner = "client!uf", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2221 = Static107.method1838("<img=0>");

	@OriginalMember(owner = "client!uf", name = "ib", descriptor = "I")
	public static int anInt3744 = -1;

	@OriginalMember(owner = "client!uf", name = "ob", descriptor = "[I")
	public static int[] anIntArray351 = new int[] { 6, 0, 6, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, -2, 7, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 3, 0, -2, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 6, 24, 0, 0, 0, 0, 11, 0, 2, 6, 10, 2, 3, -2, -1, -1, 0, 0, 4, 0, 2, 3, -2, 4, 0, -2, 0, 0, 0, 0, 5, 6, 2, 0, 6, 0, 6, 1, 0, 20, 14, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, 5, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 0, 6, 0, -2, 0, 10, -2, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, -2, 0, 0, 0, 8, 0, 0, 12, 0, 0, 0, 0, 0, 7, 11, 0, 5, -2, 0, 0, 0, 0, 0, 5, 6, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0 };

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)I")
	public static int method2617(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
	public static void method2619() {
		@Pc(9) int local9 = Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2475(Static122.aClass28_1714);
		for (@Pc(11) int local11 = 0; local11 < Static150.anInt3365; local11++) {
			@Pc(19) int local19 = Static29.aClass2_Sub4_Sub3_Sub2_Sub1_2.method2475(Static136.method2141(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		local9 += 8;
		Static169.aBoolean165 = true;
		Static158.anInt3508 = Static150.anInt3365 * 15 + 22;
		Static100.anInt2501 = local9;
		@Pc(53) int local53 = Static150.anInt3365 * 15 + 21;
		@Pc(60) int local60 = Static101.anInt449 - local9 / 2;
		@Pc(62) int local62 = Static130.anInt3042;
		if (local60 + local9 > 765) {
			local60 = 765 - local9;
		}
		if (local62 + local53 > 503) {
			local62 = 503 - local53;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		Static40.anInt1059 = local60;
		Static136.anInt3117 = local62;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[Lclient!ff;IIIIIIII)V")
	public static void method2620(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static161.method2805(arg5, arg3, arg0, arg6);
		Static25.method543();
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(19) Class24 local19 = arg1[local13];
			if (local19 != null && (arg2 == local19.anInt1382 || arg2 == -1412584499 && Static177.aClass24_13 == local19)) {
				@Pc(73) int local73;
				if (arg7 == -1) {
					Static27.anIntArray264[Static179.anInt4042] = local19.anInt1373 + arg4;
					Static101.anIntArray29[Static179.anInt4042] = arg8 + local19.anInt1358;
					Static90.anIntArray221[Static179.anInt4042] = local19.anInt1357;
					Static91.anIntArray223[Static179.anInt4042] = local19.anInt1427;
					local73 = Static179.anInt4042++;
				} else {
					local73 = arg7;
				}
				local19.anInt1397 = local73;
				local19.anInt1369 = Static156.anInt3491;
				if (!local19.aBoolean63 || !Static165.method2570(local19)) {
					if (local19.anInt1388 > 0) {
						Static87.method1569(local19);
					}
					@Pc(104) int local104 = arg4 + local19.anInt1373;
					@Pc(110) int local110 = local19.anInt1358 + arg8;
					@Pc(113) int local113 = local19.anInt1370;
					@Pc(144) int local144;
					@Pc(138) int local138;
					if (Static177.aClass24_13 == local19) {
						if (arg2 != -1412584499 && !local19.aBoolean67) {
							Static107.anInt2616 = arg4;
							Static162.anInt3577 = arg8;
							Static135.aClass24Array2 = arg1;
							continue;
						}
						if (Static96.aBoolean116 && Static129.aBoolean136) {
							local138 = Static169.anInt3798;
							local138 -= Static46.anInt1237;
							local144 = Static93.anInt2353;
							if (local138 < Static28.anInt855) {
								local138 = Static28.anInt855;
							}
							local144 -= Static35.anInt971;
							if (local138 + local19.anInt1427 > Static157.aClass24_11.anInt1427 + Static28.anInt855) {
								local138 = Static28.anInt855 + Static157.aClass24_11.anInt1427 - local19.anInt1427;
							}
							local110 = local138;
							if (local144 < Static95.anInt2365) {
								local144 = Static95.anInt2365;
							}
							if (Static95.anInt2365 + Static157.aClass24_11.anInt1357 < local19.anInt1357 + local144) {
								local144 = Static95.anInt2365 + Static157.aClass24_11.anInt1357 - local19.anInt1357;
							}
							local104 = local144;
						}
						if (!local19.aBoolean67) {
							local113 = 128;
						}
					}
					@Pc(264) int local264;
					@Pc(281) int local281;
					@Pc(226) int local226;
					@Pc(224) int local224;
					@Pc(231) int local231;
					@Pc(236) int local236;
					if (local19.anInt1425 == 2) {
						local138 = arg3;
						local281 = arg6;
						local144 = arg5;
						local264 = arg0;
					} else if (local19.anInt1425 == 9) {
						local224 = local110;
						local226 = local104;
						local231 = local19.anInt1357 + local104;
						local236 = local110 + local19.anInt1427;
						if (local231 < local104) {
							local226 = local231;
							local231 = local104;
						}
						local144 = arg5 < local226 ? local226 : arg5;
						local231++;
						local264 = local231 < arg0 ? local231 : arg0;
						if (local110 > local236) {
							local224 = local236;
							local236 = local110;
						}
						local236++;
						local281 = arg6 <= local236 ? arg6 : local236;
						local138 = local224 <= arg3 ? arg3 : local224;
					} else {
						local144 = local104 <= arg5 ? arg5 : local104;
						local138 = local110 <= arg3 ? arg3 : local110;
						local226 = local104 + local19.anInt1357;
						local264 = arg0 <= local226 ? arg0 : local226;
						local224 = local19.anInt1427 + local110;
						local281 = local224 < arg6 ? local224 : arg6;
					}
					if (!local19.aBoolean63 || local144 < local264 && local281 > local138) {
						if (local19.anInt1388 != 0) {
							if (local19.anInt1388 == 1337) {
								Static151.anInt3392 = local104;
								Static44.anInt1155 = local110;
								Static114.method1901(local110, local19.anInt1427, local19.anInt1357, local104);
								Static161.method2805(arg5, arg3, arg0, arg6);
								continue;
							}
							if (local19.anInt1388 == 1338) {
								if (local19.method984()) {
									Static142.method2250(local19, local104, local110, local73);
									Static161.method2805(arg5, arg3, arg0, arg6);
								}
								continue;
							}
							if (local19.anInt1388 == 1339) {
								if (local19.method984()) {
									Static151.method2336(local19, local73, local104, local110);
									Static161.method2805(arg5, arg3, arg0, arg6);
								}
								continue;
							}
						}
						local226 = Static93.anInt2353;
						local224 = Static169.anInt3798;
						if (!Static169.aBoolean165 && local226 >= local144 && local224 >= local138 && local264 > local226 && local224 < local281) {
							Static67.method1221(local226 - local104, local19, local224 - local110);
						}
						if (local19.anInt1425 == 0) {
							if (!local19.aBoolean63 && Static165.method2570(local19) && local19 != Static11.aClass24_1) {
								continue;
							}
							if (!local19.aBoolean63) {
								if (local19.anInt1406 > local19.anInt1389 - local19.anInt1427) {
									local19.anInt1406 = local19.anInt1389 - local19.anInt1427;
								}
								if (local19.anInt1406 < 0) {
									local19.anInt1406 = 0;
								}
							}
							method2620(local264, arg1, local19.anInt1367, local138, local104 - local19.anInt1398, local144, local281, local73, local110 - local19.anInt1406);
							if (local19.aClass24Array1 != null) {
								method2620(local264, local19.aClass24Array1, local19.anInt1367, local138, local104 - local19.anInt1398, local144, local281, local73, local110 - local19.anInt1406);
							}
							@Pc(574) Class2_Sub22 local574 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local19.anInt1367);
							if (local574 != null) {
								if (local574.anInt2872 == 0 && local144 <= Static93.anInt2353 && Static169.anInt3798 >= local138 && local264 > Static93.anInt2353 && Static169.anInt3798 < local281 && !Static169.aBoolean165 && !Static29.aBoolean34) {
									Static150.anInt3365 = 1;
									Static98.aClass28Array34[0] = Static95.aClass28_1404;
									Static80.aClass28Array29[0] = Static136.aClass28_1828;
									Static176.aShortArray41[0] = 1004;
								}
								Static162.method2501(local281, local138, local264, local73, local144, local104, local110, local574.anInt2866);
							}
							Static161.method2805(arg5, arg3, arg0, arg6);
							Static25.method543();
						}
						if (Static11.aBooleanArray7[local73] || Static12.anInt554 > 1) {
							if (local19.anInt1425 == 0 && !local19.aBoolean63 && local19.anInt1389 > local19.anInt1427) {
								Static125.method2036(local19.anInt1406, local110, local19.anInt1389, local19.anInt1427, local104 + local19.anInt1357);
							}
							if (local19.anInt1425 != 1) {
								@Pc(685) int local685;
								@Pc(696) int local696;
								@Pc(841) int local841;
								@Pc(741) int local741;
								@Pc(903) int local903;
								@Pc(901) int local901;
								@Pc(926) int local926;
								@Pc(705) int local705;
								@Pc(858) int local858;
								if (local19.anInt1425 == 2) {
									local231 = 0;
									for (local236 = 0; local236 < local19.anInt1427; local236++) {
										for (local685 = 0; local685 < local19.anInt1357; local685++) {
											local696 = (local19.anInt1368 + 32) * local685 + local104;
											local705 = local110 + local236 * (local19.anInt1371 + 32);
											if (local231 < 20) {
												local696 += local19.anIntArray121[local231];
												local705 += local19.anIntArray128[local231];
											}
											if (local19.anIntArray120[local231] > 0) {
												local741 = local19.anIntArray120[local231] - 1;
												if (arg5 < local696 + 32 && local696 < arg0 && local705 + 32 > arg3 && arg6 > local705 || Static83.aClass24_4 == local19 && local231 == Static149.anInt3355) {
													@Pc(796) Class2_Sub4_Sub3_Sub4 local796;
													if (Static166.anInt3704 == 1 && local231 == Static84.anInt2127 && local19.anInt1367 == Static112.anInt2709) {
														local796 = Static76.method1372(2, false, local741, local19.anIntArray119[local231], 0);
													} else {
														local796 = Static76.method1372(1, false, local741, local19.anIntArray119[local231], 3153952);
													}
													if (local796 == null) {
														Static104.method1828(local19);
													} else if (Static83.aClass24_4 == local19 && Static149.anInt3355 == local231) {
														local841 = Static169.anInt3798 - Static82.anInt2099;
														if (local841 < 5 && local841 > -5) {
															local841 = 0;
														}
														local858 = Static93.anInt2353 - Static164.anInt3642;
														if (local858 < 5 && local858 > -5) {
															local858 = 0;
														}
														if (Static69.anInt1837 < 5) {
															local858 = 0;
															local841 = 0;
														}
														local796.method2837(local696 + local858, local841 + local705, 128);
														if (arg2 != -1) {
															@Pc(899) Class24 local899 = arg1[arg2 & 0xFFFF];
															local901 = Static161.anInt3977;
															local903 = Static161.anInt3979;
															if (local903 > local841 + local705 && local899.anInt1406 > 0) {
																local926 = Static119.anInt2853 * (local903 - local841 - local705) / 3;
																if (Static119.anInt2853 * 10 < local926) {
																	local926 = Static119.anInt2853 * 10;
																}
																if (local926 > local899.anInt1406) {
																	local926 = local899.anInt1406;
																}
																local899.anInt1406 -= local926;
																Static82.anInt2099 += local926;
																Static104.method1828(local899);
															}
															if (local705 + local841 + 32 > local901 && local899.anInt1406 < local899.anInt1389 - local899.anInt1427) {
																local926 = Static119.anInt2853 * (local841 + local705 + 32 - local901) / 3;
																if (Static119.anInt2853 * 10 < local926) {
																	local926 = Static119.anInt2853 * 10;
																}
																if (local926 > local899.anInt1389 - local899.anInt1427 - local899.anInt1406) {
																	local926 = local899.anInt1389 - local899.anInt1427 - local899.anInt1406;
																}
																Static82.anInt2099 -= local926;
																local899.anInt1406 += local926;
																Static104.method1828(local899);
															}
														}
													} else if (local19 == Static146.aClass24_10 && local231 == Static95.anInt2368) {
														local796.method2837(local696, local705, 128);
													} else {
														local796.method2829(local696, local705);
													}
												}
											} else if (local19.anIntArray125 != null && local231 < 20) {
												@Pc(1062) Class2_Sub4_Sub3_Sub4 local1062 = local19.method982(local231);
												if (local1062 != null) {
													local1062.method2829(local696, local705);
												} else if (Static61.aBoolean84) {
													Static104.method1828(local19);
												}
											}
											local231++;
										}
									}
								} else if (local19.anInt1425 == 3) {
									if (Static89.method1596(local19)) {
										local231 = local19.anInt1394;
										if (local19 == Static11.aClass24_1 && local19.anInt1413 != 0) {
											local231 = local19.anInt1413;
										}
									} else {
										local231 = local19.anInt1384;
										if (local19 == Static11.aClass24_1 && local19.anInt1387 != 0) {
											local231 = local19.anInt1387;
										}
									}
									if (local113 == 0) {
										if (local19.aBoolean61) {
											Static161.method2809(local104, local110, local19.anInt1357, local19.anInt1427, local231);
										} else {
											Static161.method2804(local104, local110, local19.anInt1357, local19.anInt1427, local231);
										}
									} else if (local19.aBoolean61) {
										Static161.method2811(local104, local110, local19.anInt1357, local19.anInt1427, local231, 256 - (local113 & 0xFF));
									} else {
										Static161.method2803(local104, local110, local19.anInt1357, local19.anInt1427, local231, 256 - (local113 & 0xFF));
									}
								} else {
									@Pc(1199) Class2_Sub4_Sub3_Sub2_Sub1 local1199;
									if (local19.anInt1425 == 4) {
										local1199 = local19.method983();
										if (local1199 != null) {
											@Pc(1213) Class28 local1213 = local19.aClass28_812;
											if (Static89.method1596(local19)) {
												local236 = local19.anInt1394;
												if (local19 == Static11.aClass24_1 && local19.anInt1413 != 0) {
													local236 = local19.anInt1413;
												}
												if (local19.aClass28_813.method1121() > 0) {
													local1213 = local19.aClass28_813;
												}
											} else {
												local236 = local19.anInt1384;
												if (Static11.aClass24_1 == local19 && local19.anInt1387 != 0) {
													local236 = local19.anInt1387;
												}
											}
											if (local19.aBoolean63 && local19.anInt1408 != -1) {
												@Pc(1269) Class2_Sub4_Sub12 local1269 = Static58.method1034(local19.anInt1408);
												local1213 = local1269.aClass28_1344;
												if (local1213 == null) {
													local1213 = Static102.aClass28_1468;
												}
												if ((local1269.anInt2237 == 1 || local19.anInt1363 != 1) && local19.anInt1363 != -1) {
													local1213 = Static83.method1481(new Class28[] { Static95.aClass28_1407, local1213, Static58.aClass28_860, Static162.method2500(local19.anInt1363) });
												}
											}
											if (Static177.aClass24_14 == local19) {
												local1213 = Static12.aClass28_373;
												local236 = local19.anInt1384;
											}
											if (!local19.aBoolean63) {
												local1213 = Static121.method1999(local1213, local19);
											}
											local1199.method2458(local1213, local104, local110, local19.anInt1357, local19.anInt1427, local236, local19.aBoolean62 ? 0 : -1, local19.anInt1417, local19.anInt1419, local19.anInt1432);
										} else if (Static61.aBoolean84) {
											Static104.method1828(local19);
										}
									} else if (local19.anInt1425 == 5) {
										@Pc(1370) Class2_Sub4_Sub3_Sub4 local1370;
										if (local19.aBoolean63) {
											if (local19.anInt1408 == -1) {
												local1370 = local19.method979(false);
											} else {
												local1370 = Static76.method1372(local19.anInt1407, false, local19.anInt1408, local19.anInt1363, local19.anInt1393);
											}
											if (local1370 != null) {
												local236 = local1370.anInt3984;
												local685 = local1370.anInt3982;
												if (local19.aBoolean70) {
													Static161.method2799(local104, local110, local104 + local19.anInt1357, local19.anInt1427 + local110);
													local705 = (local685 + local19.anInt1427 - 1) / local685;
													local696 = (local19.anInt1357 + local236 - 1) / local236;
													for (local858 = 0; local858 < local696; local858++) {
														for (local841 = 0; local841 < local705; local841++) {
															if (local19.anInt1390 != 0) {
																local1370.method2816(local236 / 2 + local236 * local858 + local104, local685 * local841 + (local110 - -(local685 / 2)), local19.anInt1390, 4096);
															} else if (local113 == 0) {
																local1370.method2829(local236 * local858 + local104, local685 * local841 + local110);
															} else {
																local1370.method2837(local104 + local236 * local858, local841 * local685 + local110, 256 - (local113 & 0xFF));
															}
														}
													}
													Static161.method2805(arg5, arg3, arg0, arg6);
												} else {
													local696 = local19.anInt1357 * 4096 / local236;
													if (local19.anInt1390 != 0) {
														local1370.method2816(local104 + local19.anInt1357 / 2, local110 - -(local19.anInt1427 / 2), local19.anInt1390, local696);
													} else if (local113 != 0) {
														local1370.method2818(local104, local110, local19.anInt1357, local19.anInt1427, 256 - (local113 & 0xFF));
													} else if (local19.anInt1357 == local236 && local19.anInt1427 == local685) {
														local1370.method2829(local104, local110);
													} else {
														local1370.method2833(local104, local110, local19.anInt1357, local19.anInt1427);
													}
												}
											} else if (Static61.aBoolean84) {
												Static104.method1828(local19);
											}
										} else {
											local1370 = local19.method979(Static89.method1596(local19));
											if (local1370 != null) {
												local1370.method2829(local104, local110);
											} else if (Static61.aBoolean84) {
												Static104.method1828(local19);
											}
										}
									} else {
										@Pc(1770) Class2_Sub4_Sub12 local1770;
										if (local19.anInt1425 == 6) {
											@Pc(1634) boolean local1634 = Static89.method1596(local19);
											local696 = 0;
											@Pc(1638) Class2_Sub4_Sub1_Sub3 local1638 = null;
											if (local1634) {
												local236 = local19.anInt1415;
											} else {
												local236 = local19.anInt1385;
											}
											if (local19.anInt1408 != -1) {
												local1770 = Static58.method1034(local19.anInt1408);
												if (local1770 != null) {
													local1770 = local1770.method1561(local19.anInt1363);
													local1638 = local1770.method1557(0, null, 1);
													if (local1638 == null) {
														Static104.method1828(local19);
													} else {
														local1638.method1193();
														local696 = -local1638.aShort36 / 2;
													}
												}
											} else if (local19.anInt1405 == 5) {
												if (local19.anInt1433 == -1) {
													local1638 = Static29.aClass6_1.method419(null, -1, null, -1);
												} else {
													local705 = local19.anInt1433 & 0x7FF;
													if (Static50.anInt1313 == local705) {
														local705 = 2047;
													}
													@Pc(1683) Class2_Sub4_Sub1_Sub1_Sub2 local1683 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local705];
													@Pc(1693) Class2_Sub4_Sub2 local1693 = local236 == -1 ? null : Static49.method926(local236);
													if (local1683 != null && (int) local1683.aClass28_953.method1129() << 11 == (local19.anInt1433 & 0xFFFFF800)) {
														local1638 = local1683.aClass6_2.method419(null, local19.anInt1359, local1693, 0);
													}
												}
											} else if (local236 == -1) {
												local1638 = local19.method990(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2, local1634, null, -1);
												if (local1638 == null && Static61.aBoolean84) {
													Static104.method1828(local19);
												}
											} else {
												@Pc(1745) Class2_Sub4_Sub2 local1745 = Static49.method926(local236);
												local1638 = local19.method990(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2, local1634, local1745, local19.anInt1359);
												if (local1638 == null && Static61.aBoolean84) {
													Static104.method1828(local19);
												}
											}
											if (local1638 != null) {
												Static25.method545(local104 + local19.anInt1357 / 2 + local19.anInt1430, local19.anInt1427 / 2 + local110 + local19.anInt1401);
												local705 = Class2_Sub4_Sub3_Sub1.anIntArray58[local19.anInt1416] * local19.anInt1364 >> 16;
												local858 = Class2_Sub4_Sub3_Sub1.anIntArray60[local19.anInt1416] * local19.anInt1364 >> 16;
												if (!local19.aBoolean63) {
													local1638.method1188(local19.anInt1418, 0, local19.anInt1416, 0, local705, local858);
												} else if (local19.aBoolean64) {
													local1638.method1204(local19.anInt1418, local19.anInt1365, local19.anInt1416, local19.anInt1424, local19.anInt1414 + local705 + local696, local19.anInt1414 + local858, local19.anInt1364);
												} else {
													local1638.method1188(local19.anInt1418, local19.anInt1365, local19.anInt1416, local19.anInt1424, local19.anInt1414 + local705 + local696, local858 - -local19.anInt1414);
												}
												Static25.method539();
											}
										} else {
											if (local19.anInt1425 == 7) {
												local1199 = local19.method983();
												if (local1199 == null) {
													if (Static61.aBoolean84) {
														Static104.method1828(local19);
													}
													continue;
												}
												local236 = 0;
												for (local685 = 0; local685 < local19.anInt1427; local685++) {
													for (local696 = 0; local696 < local19.anInt1357; local696++) {
														if (local19.anIntArray120[local236] > 0) {
															local1770 = Static58.method1034(local19.anIntArray120[local236] - 1);
															@Pc(1987) Class28 local1987;
															if (local1770.anInt2237 != 1 && local19.anIntArray119[local236] == 1) {
																local1987 = Static83.method1481(new Class28[] { Static95.aClass28_1407, local1770.aClass28_1344, Static17.aClass28_424 });
															} else {
																local1987 = Static83.method1481(new Class28[] { Static95.aClass28_1407, local1770.aClass28_1344, Static58.aClass28_860, Static162.method2500(local19.anIntArray119[local236]) });
															}
															local841 = local696 * (local19.anInt1368 + 115) + local104;
															local741 = local685 * (local19.anInt1371 + 12) + local110;
															if (local19.anInt1417 == 0) {
																local1199.method2454(local1987, local841, local741, local19.anInt1384, local19.aBoolean62 ? 0 : -1);
															} else if (local19.anInt1417 == 1) {
																local1199.method2457(local1987, local19.anInt1357 / 2 + local841, local741, local19.anInt1384, local19.aBoolean62 ? 0 : -1);
															} else {
																local1199.method2472(local1987, local19.anInt1357 + local841 - 1, local741, local19.anInt1384, local19.aBoolean62 ? 0 : -1);
															}
														}
														local236++;
													}
												}
											}
											@Pc(2286) int local2286;
											if (local19.anInt1425 == 8 && local19 == Static105.aClass24_6 && Static42.anInt1090 == Static149.anInt3356) {
												local231 = 0;
												local236 = 0;
												@Pc(2127) Class2_Sub4_Sub3_Sub2_Sub1 local2127 = Static61.aClass2_Sub4_Sub3_Sub2_Sub1_3;
												@Pc(2130) Class28 local2130 = local19.aClass28_812;
												local2130 = Static121.method1999(local2130, local19);
												@Pc(2149) Class28 local2149;
												while (local2130.method1121() > 0) {
													local858 = local2130.method1124(Static132.aClass28_1819);
													if (local858 == -1) {
														local2149 = local2130;
														local2130 = Static136.aClass28_1828;
													} else {
														local2149 = local2130.method1135(0, local858);
														local2130 = local2130.method1131(local858 + 4);
													}
													local841 = local2127.method2475(local2149);
													local236 += local2127.anInt3536 + 1;
													if (local841 > local231) {
														local231 = local841;
													}
												}
												local841 = local110 + local19.anInt1427 + 5;
												local231 += 6;
												local858 = local104 + local19.anInt1357 - local231 - 5;
												local236 += 7;
												if (local858 < local104 + 5) {
													local858 = local104 + 5;
												}
												if (local858 + local231 > arg0) {
													local858 = arg0 - local231;
												}
												if (arg6 < local236 + local841) {
													local841 = arg6 - local236;
												}
												Static161.method2809(local858, local841, local231, local236, 16777120);
												Static161.method2804(local858, local841, local231, local236, 0);
												local2130 = local19.aClass28_812;
												local741 = local841 + local2127.anInt3536 + 2;
												local2130 = Static121.method1999(local2130, local19);
												while (local2130.method1121() > 0) {
													local2286 = local2130.method1124(Static132.aClass28_1819);
													if (local2286 == -1) {
														local2149 = local2130;
														local2130 = Static136.aClass28_1828;
													} else {
														local2149 = local2130.method1135(0, local2286);
														local2130 = local2130.method1131(local2286 + 4);
													}
													local2127.method2454(local2149, local858 + 3, local741, 0, -1);
													local741 += local2127.anInt3536 + 1;
												}
											}
											if (local19.anInt1425 == 9) {
												if (local19.anInt1356 == 1) {
													Static161.method2801(local104, local110, local104 + local19.anInt1357, local110 - -local19.anInt1427, local19.anInt1384);
												} else {
													local231 = local19.anInt1357 < 0 ? -local19.anInt1357 : local19.anInt1357;
													local236 = local19.anInt1427 >= 0 ? local19.anInt1427 : -local19.anInt1427;
													local685 = local231;
													if (local231 < local236) {
														local685 = local236;
													}
													if (local685 != 0) {
														local696 = (local19.anInt1357 << 16) / local685;
														local705 = (local19.anInt1427 << 16) / local685;
														if (local696 >= local705) {
															local696 = -local696;
														} else {
															local705 = -local705;
														}
														local841 = local705 * local19.anInt1356 + 1 >> 17;
														local2286 = local19.anInt1356 * local696 + 1 >> 17;
														local903 = local110 - arg3;
														@Pc(2438) int local2438 = local104 - arg5;
														local858 = local19.anInt1356 * local705 >> 17;
														local741 = local696 * local19.anInt1356 >> 17;
														local901 = local858 + local2438;
														local926 = local2438 - local841;
														@Pc(2468) int local2468 = local19.anInt1357 + local2438 - local841;
														@Pc(2475) int local2475 = local858 + local2438 + local19.anInt1357;
														@Pc(2479) int local2479 = local903 + local741;
														@Pc(2483) int local2483 = local903 - local2286;
														@Pc(2491) int local2491 = local903 + local19.anInt1427 + local741;
														@Pc(2499) int local2499 = local19.anInt1427 + local903 - local2286;
														Static25.method544(local901, local926, local2468);
														Static25.method553(local2479, local2483, local2499, local901, local926, local2468, local19.anInt1384);
														Static25.method544(local901, local2468, local2475);
														Static25.method553(local2479, local2499, local2491, local901, local2468, local2475, local19.anInt1384);
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

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(Z)V")
	public static void method2621() {
		aClass28_2221 = null;
		anIntArray351 = null;
		aClass2_Sub4_Sub3_Sub3Array10 = null;
	}
}
