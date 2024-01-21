import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!sc;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!cd;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ae;")
	private static Class5 aClass5_329 = Static56.method972("Please try again)3");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_328 = aClass5_329;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_330 = Static56.method972("(U2");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt740 = 0;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_331 = Static56.method972("@or1@");

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[[[Lclient!p;")
	public static Class51[][][] aClass51ArrayArrayArray1 = new Class51[4][104][104];

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public static int anInt741 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(JB)V")
	public static void method460(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static5.anInt346; local14++) {
			if (Static94.aLongArray2[local14] == arg0) {
				Static116.aBoolean157 = true;
				Static5.anInt346--;
				for (@Pc(38) int local38 = local14; local38 < Static5.anInt346; local38++) {
					Static34.aClass5Array8[local38] = Static34.aClass5Array8[local38 + 1];
					Static57.anIntArray183[local38] = Static57.anIntArray183[local38 + 1];
					Static94.aLongArray2[local38] = Static94.aLongArray2[local38 + 1];
				}
				Static95.aClass3_Sub6_Sub1_3.method1645(159);
				Static95.aClass3_Sub6_Sub1_3.method1606(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method461() {
		aClass15_1 = null;
		aClass5_328 = null;
		aClass3_Sub1_Sub2_Sub3Array1 = null;
		aClass58_2 = null;
		aClass5_329 = null;
		aClass5_331 = null;
		aClass5_330 = null;
		anIntArrayArray7 = null;
		aClass51ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lclient!te;IIIIIIIII)Z")
	public static boolean method462(@OriginalArg(0) Class3_Sub1_Sub17[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static66.method1847(arg8, arg4, arg6, arg7);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class3_Sub1_Sub17 local20 = arg0[local14];
			if (local20 != null && local20.anInt2621 == arg3) {
				if (local20.anInt2646 > 0) {
					Static7.method196(local20);
				}
				@Pc(45) int local45 = arg8 + local20.anInt2655 - arg5;
				@Pc(53) int local53 = local20.anInt2603 + arg4 - arg2;
				@Pc(56) int local56 = local20.anInt2609;
				@Pc(94) int local94;
				@Pc(89) int local89;
				@Pc(170) int local170;
				@Pc(152) int local152;
				if (Static87.aClass3_Sub1_Sub17_3 == local20) {
					@Pc(63) Class3_Sub1_Sub17 local63 = Static73.method1217(local20);
					if (local63 == null) {
						Static87.aClass3_Sub1_Sub17_3 = null;
					} else {
						@Pc(73) int[] local73 = Static109.method1898(local63);
						@Pc(79) int[] local79 = Static109.method1898(local20);
						if (!local20.aBoolean138) {
							local56 = 128;
						}
						local89 = Static49.anInt1325 - Static108.anInt2861;
						local94 = Static100.anInt2512 - Static19.anInt694;
						if (local94 <= local20.anInt2627 && -local20.anInt2627 <= local94 && local89 <= local20.anInt2627 && local89 >= -local20.anInt2627 && !Static58.aBoolean74) {
							local94 = 0;
							local89 = 0;
						} else if (local20.anInt2593 < Static94.anInt594 || Static58.aBoolean74) {
							Static58.aBoolean74 = true;
						} else {
							local89 = 0;
							local94 = 0;
						}
						local152 = local79[1] + local89 - local73[1];
						if (local152 < 0) {
							local152 = 0;
						}
						local170 = local94 + local79[0] - local73[0];
						if (local170 < 0) {
							local170 = 0;
						}
						if (local20.anInt2667 + local170 > local63.anInt2667) {
							local170 = local63.anInt2667 - local20.anInt2667;
						}
						if (local63.anInt2600 < local152 + local20.anInt2600) {
							local152 = local63.anInt2600 - local20.anInt2600;
						}
						local45 = local170 + local73[0];
						local53 = local152 + local73[1];
					}
				}
				if ((!local20.aBoolean127 || local45 <= Static66.anInt2806 && local53 <= Static66.anInt2802 && Static66.anInt2807 <= local45 + local20.anInt2667 && Static66.anInt2803 <= local53 + local20.anInt2600) && (!local20.aBoolean127 || !local20.method1713(Static23.aBoolean33))) {
					if (local20.anInt2658 == 0) {
						if (!local20.aBoolean127 && local20.method1713(Static23.aBoolean33) && !Static19.method430(arg1, local14)) {
							continue;
						}
						if (!local20.aBoolean127) {
							if (local20.anInt2583 > local20.anInt2659 - local20.anInt2600) {
								local20.anInt2583 = local20.anInt2659 - local20.anInt2600;
							}
							if (local20.anInt2583 < 0) {
								local20.anInt2583 = 0;
							}
						}
						local12 &= method462(arg0, arg1, local20.anInt2583, local20.anInt2651, local53, local20.anInt2636, local45 + local20.anInt2667, local20.anInt2600 + local53, local45);
						if (local20.aClass3_Sub1_Sub17Array1 != null) {
							local12 &= method462(local20.aClass3_Sub1_Sub17Array1, arg1, local20.anInt2583, local20.anInt2651, local53, local20.anInt2636, local20.anInt2667 + local45, local53 + local20.anInt2600, local45);
						}
						Static66.method1847(arg8, arg4, arg6, arg7);
						if (local20.anInt2600 < local20.anInt2659 && !local20.aBoolean127) {
							Static5.method175(local20.anInt2667 + local45, local20.anInt2583, local20.anInt2659, local53, local20.anInt2600);
						}
					}
					if (local20.anInt2658 != 1) {
						@Pc(453) int local453;
						@Pc(649) int local649;
						@Pc(395) int local395;
						@Pc(397) int local397;
						@Pc(401) int local401;
						if (local20.anInt2658 == 2) {
							local395 = 0;
							for (local397 = 0; local397 < local20.anInt2600; local397++) {
								for (local401 = 0; local401 < local20.anInt2667; local401++) {
									local94 = local45 + (local20.anInt2589 + 32) * local401;
									local89 = (local20.anInt2596 + 32) * local397 + local53;
									if (local395 < 20) {
										local89 += local20.anIntArray306[local395];
										local94 += local20.anIntArray305[local395];
									}
									if (local20.anIntArray309[local395] > 0) {
										local453 = local20.anIntArray309[local395] - 1;
										if (Static66.anInt2807 - 32 < local94 && Static66.anInt2806 > local94 && local89 > Static66.anInt2803 - 32 && Static66.anInt2802 > local89 || Static46.anInt1278 != 0 && local395 == Static78.anInt1952) {
											@Pc(526) Class3_Sub1_Sub2_Sub3 local526;
											if (Static14.anInt2886 == 1 && local395 == Static32.anInt920 && local20.anInt2651 == Static85.anInt2106) {
												local526 = Static95.method1644(local453, 0, false, local20.anIntArray308[local395], 2);
											} else {
												local526 = Static95.method1644(local453, 3153952, false, local20.anIntArray308[local395], 1);
											}
											if (local526 == null) {
												local12 = false;
											} else if (Static46.anInt1278 != 0 && Static78.anInt1952 == local395 && Static115.anInt2975 == local20.anInt2651) {
												local152 = Static49.anInt1325 - Static30.anInt880;
												if (local152 < 5 && local152 > -5) {
													local152 = 0;
												}
												local170 = Static100.anInt2512 - Static27.anInt817;
												if (local170 < 5 && local170 > -5) {
													local170 = 0;
												}
												if (Static102.anInt2610 < 5) {
													local170 = 0;
													local152 = 0;
												}
												local526.method1443(local170 + local94, local152 + local89, 128);
												if (arg3 != -1) {
													@Pc(622) Class3_Sub1_Sub17 local622 = arg0[arg3 & 0xFFFF];
													if (Static66.anInt2803 > local152 + local89 && local622.anInt2583 > 0) {
														local649 = (Static66.anInt2803 - local152 - local89) * Static74.anInt1893 / 3;
														if (local649 > Static74.anInt1893 * 10) {
															local649 = Static74.anInt1893 * 10;
														}
														if (local622.anInt2583 < local649) {
															local649 = local622.anInt2583;
														}
														Static30.anInt880 += local649;
														local622.anInt2583 -= local649;
													}
													if (Static66.anInt2802 < local89 + local152 + 32 && local622.anInt2583 < local622.anInt2659 - local622.anInt2600) {
														local649 = (local152 + local89 + 32 - Static66.anInt2802) * Static74.anInt1893 / 3;
														if (local649 > Static74.anInt1893 * 10) {
															local649 = Static74.anInt1893 * 10;
														}
														if (local622.anInt2659 - local622.anInt2583 - local622.anInt2600 < local649) {
															local649 = local622.anInt2659 - local622.anInt2600 - local622.anInt2583;
														}
														Static30.anInt880 -= local649;
														local622.anInt2583 += local649;
													}
												}
											} else if (Static35.anInt1005 != 0 && local395 == Static43.anInt1217 && Static109.anInt2868 == local20.anInt2651) {
												local526.method1443(local94, local89, 128);
											} else {
												local526.method1437(local94, local89);
											}
										}
									} else if (local20.anIntArray307 != null && local395 < 20) {
										@Pc(790) Class3_Sub1_Sub2_Sub3 local790 = local20.method1718(local395);
										if (local790 != null) {
											local790.method1437(local94, local89);
										} else if (Static80.aBoolean96) {
											local12 = false;
										}
									}
									local395++;
								}
							}
						} else if (local20.anInt2658 == 3) {
							if (Static61.method1065(local20)) {
								local395 = local20.anInt2637;
								if (Static19.method430(arg1, local14) && local20.anInt2652 != 0) {
									local395 = local20.anInt2652;
								}
							} else {
								local395 = local20.anInt2645;
								if (Static19.method430(arg1, local14) && local20.anInt2618 != 0) {
									local395 = local20.anInt2618;
								}
							}
							if (local56 == 0) {
								if (local20.aBoolean134) {
									Static66.method1839(local45, local53, local20.anInt2667, local20.anInt2600, local395);
								} else {
									Static66.method1842(local45, local53, local20.anInt2667, local20.anInt2600, local395);
								}
							} else if (local20.aBoolean134) {
								Static66.method1852(local45, local53, local20.anInt2667, local20.anInt2600, local395, 256 - (local56 & 0xFF));
							} else {
								Static66.method1848(local45, local53, local20.anInt2667, local20.anInt2600, local395, 256 - (local56 & 0xFF));
							}
						} else {
							@Pc(933) Class3_Sub1_Sub2_Sub1 local933;
							if (local20.anInt2658 == 4) {
								local933 = local20.method1711();
								if (local933 != null) {
									@Pc(944) Class5 local944 = local20.aClass5_1183;
									if (Static61.method1065(local20)) {
										local397 = local20.anInt2637;
										if (Static19.method430(arg1, local14) && local20.anInt2652 != 0) {
											local397 = local20.anInt2652;
										}
										if (local20.aClass5_1185.method144() > 0) {
											local944 = local20.aClass5_1185;
										}
									} else {
										local397 = local20.anInt2645;
										if (Static19.method430(arg1, local14) && local20.anInt2618 != 0) {
											local397 = local20.anInt2618;
										}
									}
									if (local20.aBoolean127 && local20.anInt2586 != -1) {
										@Pc(998) Class3_Sub1_Sub3 local998 = Static37.method694(local20.anInt2586);
										local944 = local998.aClass5_300;
										if (local944 == null) {
											local944 = Static54.aClass5_704;
										}
										if ((local998.anInt676 == 1 || local20.anInt2660 != 1) && local20.anInt2660 != -1) {
											local944 = Static75.method1261(new Class5[] { local944, Static17.aClass5_277, Static67.method1173(local20.anInt2660) });
										}
									}
									if (local20.anInt2651 == Static85.anInt2100 && Static4.anInt323 == local20.anInt2663) {
										local944 = Static40.aClass5_515;
										local397 = local20.anInt2645;
									}
									if (Static66.anInt2804 == 479) {
										if (local397 == 16776960) {
											local397 = 255;
										}
										if (local397 == 49152) {
											local397 = 16777215;
										}
									}
									local944 = Static84.method1335(local20, local944);
									local933.method255(local944, local45, local53, local20.anInt2667, local20.anInt2600, local397, local20.aBoolean133, local20.anInt2613, local20.anInt2585, local20.anInt2616);
								} else if (Static80.aBoolean96) {
									local12 = false;
								}
							} else {
								@Pc(1337) int local1337;
								@Pc(1327) int local1327;
								@Pc(1343) int local1343;
								if (local20.anInt2658 == 5) {
									@Pc(1118) Class3_Sub1_Sub2_Sub3 local1118;
									if (local20.aBoolean127) {
										if (local20.anInt2586 == -1) {
											local1118 = local20.method1733(false);
										} else {
											local1118 = Static95.method1644(local20.anInt2586, local20.anInt2591, false, local20.anInt2660, local20.anInt2605);
										}
										if (local1118 != null) {
											local397 = local1118.anInt2170;
											local401 = local1118.anInt2171;
											if (local20.aBoolean128) {
												local89 = local45;
												@Pc(1254) int[] local1254 = new int[4];
												Static66.method1851(local1254);
												if (local45 < local1254[0]) {
													local89 = local1254[0];
												}
												local170 = local53;
												if (local53 < local1254[1]) {
													local170 = local1254[1];
												}
												local152 = local20.anInt2667 + local45;
												local453 = local20.anInt2600 + local53;
												if (local1254[3] < local453) {
													local453 = local1254[3];
												}
												if (local1254[2] < local152) {
													local152 = local1254[2];
												}
												Static66.method1847(local89, local170, local152, local453);
												local1327 = (local20.anInt2600 + local401 - 1) / local401;
												local1337 = (local20.anInt2667 + local397 - 1) / local397;
												for (local649 = 0; local649 < local1337; local649++) {
													for (local1343 = 0; local1343 < local1327; local1343++) {
														if (local20.anInt2622 != 0) {
															local1118.method1451(local649 * local397 + local45 + local397 / 2, local53 - -(local401 * local1343) + local401 / 2, local20.anInt2622, 4096);
														} else if (local56 == 0) {
															local1118.method1437(local649 * local397 + local45, local1343 * local401 + local53);
														} else {
															local1118.method1443(local45 + local649 * local397, local401 * local1343 + local53, 256 - (local56 & 0xFF));
														}
													}
												}
												Static66.method1849(local1254);
											} else {
												local94 = local20.anInt2667 * 4096 / local397;
												if (local20.anInt2622 != 0) {
													local1118.method1451(local45 + local20.anInt2667 / 2, local20.anInt2600 / 2 + local53, local20.anInt2622, local94);
												} else if (local56 != 0) {
													local1118.method1447(local45, local53, local20.anInt2667, local20.anInt2600, 256 - (local56 & 0xFF));
												} else if (local20.anInt2667 == local397 && local20.anInt2600 == local401) {
													local1118.method1437(local45, local53);
												} else {
													local1118.method1454(local45, local53, local20.anInt2667, local20.anInt2600);
												}
											}
										} else if (Static80.aBoolean96) {
											local12 = false;
										}
									} else {
										local1118 = local20.method1733(Static61.method1065(local20));
										if (local1118 != null) {
											local1118.method1437(local45, local53);
										} else if (Static80.aBoolean96) {
											local12 = false;
										}
									}
								} else if (local20.anInt2658 == 6) {
									@Pc(1440) boolean local1440 = Static61.method1065(local20);
									if (local1440) {
										local397 = local20.anInt2623;
									} else {
										local397 = local20.anInt2666;
									}
									@Pc(1472) Class3_Sub1_Sub1_Sub6 local1472;
									if (local20.anInt2594 == 5) {
										if (local20.anInt2608 == 0) {
											local1472 = Static27.aClass48_1.method1225(null, null, -1, -1);
										} else {
											local1472 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1792();
										}
									} else if (local397 == -1) {
										local1472 = local20.method1734(-1, local1440, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass48_2, null);
										if (local1472 == null && Static80.aBoolean96) {
											local12 = false;
										}
									} else {
										@Pc(1504) Class3_Sub1_Sub11 local1504 = Static31.method778(local397);
										local1472 = local20.method1734(local20.anInt2588, local1440, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass48_2, local1504);
										if (local1472 == null && Static80.aBoolean96) {
											local12 = false;
										}
									}
									local94 = local20.anInt2661;
									local89 = local20.anInt2598;
									local170 = local20.anInt2592;
									local152 = local20.anInt2640;
									local453 = local20.anInt2631;
									local1337 = local20.anInt2642;
									if (local20.anInt2586 != -1) {
										@Pc(1548) Class3_Sub1_Sub3 local1548 = Static37.method694(local20.anInt2586);
										if (local1548 != null) {
											local1548 = local1548.method433(local20.anInt2660);
											local1472 = local1548.method425(1, true);
											local152 = local1548.anInt685;
											local1337 = local1548.anInt664;
											local94 = local1548.anInt683;
											local170 = local1548.anInt670;
											local453 = local1548.anInt668;
											if (local20.anInt2667 > 0) {
												local1337 = local1337 * 32 / local20.anInt2667;
											}
											local89 = local1548.anInt689;
										}
									}
									Static25.method509(local45 + local20.anInt2667 / 2, local53 - -(local20.anInt2600 / 2));
									local649 = Class3_Sub1_Sub2_Sub2.anIntArray98[local94] * local1337 >> 16;
									local1327 = Class3_Sub1_Sub2_Sub2.anIntArray101[local94] * local1337 >> 16;
									if (local1472 != null) {
										if (local20.aBoolean127) {
											local1472.method1800();
											if (local20.aBoolean135) {
												local1472.method1798(local89, local170, local94, local152, local1472.anInt2758 / 2 + local1327 + local453, local649 - -local453, local1337);
											} else {
												local1472.method1807(local89, local170, local94, local152, local453 + local1472.anInt2758 / 2 + local1327, local649 - -local453);
											}
										} else {
											local1472.method1807(local89, 0, local94, 0, local1327, local649);
										}
									}
									Static25.method504();
								} else {
									if (local20.anInt2658 == 7) {
										local933 = local20.method1711();
										if (local933 == null) {
											if (Static80.aBoolean96) {
												local12 = false;
											}
											continue;
										}
										local397 = 0;
										for (local401 = 0; local401 < local20.anInt2600; local401++) {
											for (local94 = 0; local94 < local20.anInt2667; local94++) {
												if (local20.anIntArray309[local397] > 0) {
													@Pc(1729) Class3_Sub1_Sub3 local1729 = Static37.method694(local20.anIntArray309[local397] - 1);
													@Pc(1732) Class5 local1732 = local1729.aClass5_300;
													if (local1732 == null) {
														local1732 = Static54.aClass5_704;
													}
													if (local1729.anInt676 == 1 || local20.anIntArray308[local397] != 1) {
														local1732 = Static75.method1261(new Class5[] { local1732, Static17.aClass5_277, Static67.method1173(local20.anIntArray308[local397]) });
													}
													local152 = local94 * (local20.anInt2589 + 115) + local45;
													local453 = local401 * (local20.anInt2596 + 12) + local53;
													if (local20.anInt2613 == 0) {
														local933.method265(local1732, local152, local453, local20.anInt2645, local20.aBoolean133);
													} else if (local20.anInt2613 == 1) {
														local933.method266(local1732, local152 + local20.anInt2667 / 2, local453, local20.anInt2645, local20.aBoolean133);
													} else {
														local933.method257(local1732, local152 + local20.anInt2667 - 1, local453, local20.anInt2645, local20.aBoolean133);
													}
												}
												local397++;
											}
										}
									}
									if (local20.anInt2658 == 8 && Static91.method1536(local14, arg1) && Static46.anInt1286 == Static95.anInt2470) {
										local397 = 0;
										local395 = 0;
										@Pc(1889) Class5 local1889 = local20.aClass5_1183;
										@Pc(1891) Class3_Sub1_Sub2_Sub1 local1891 = Static88.aClass3_Sub1_Sub2_Sub1_3;
										local1889 = Static84.method1335(local20, local1889);
										@Pc(1913) Class5 local1913;
										while (local1889.method144() > 0) {
											local170 = local1889.method154(Static56.aClass5_738);
											if (local170 == -1) {
												local1913 = local1889;
												local1889 = Static110.aClass5_1307;
											} else {
												local1913 = local1889.method133(0, local170);
												local1889 = local1889.method159(local170 + 2);
											}
											local152 = local1891.method276(local1913);
											if (local152 > local395) {
												local395 = local152;
											}
											local397 += local1891.anInt417 + 1;
										}
										local395 += 6;
										local170 = local20.anInt2667 + local45 - local395 - 5;
										local397 += 7;
										local152 = local20.anInt2600 + local53 + 5;
										if (arg7 < local152 + local397) {
											local152 = arg7 - local397;
										}
										if (local45 + 5 > local170) {
											local170 = local45 + 5;
										}
										if (arg6 < local170 + local395) {
											local170 = arg6 - local395;
										}
										Static66.method1839(local170, local152, local395, local397, 16777120);
										Static66.method1842(local170, local152, local395, local397, 0);
										local1889 = local20.aClass5_1183;
										local453 = local1891.anInt417 + local152 + 2;
										local1889 = Static84.method1335(local20, local1889);
										while (local1889.method144() > 0) {
											local1337 = local1889.method154(Static56.aClass5_738);
											if (local1337 == -1) {
												local1913 = local1889;
												local1889 = Static110.aClass5_1307;
											} else {
												local1913 = local1889.method133(0, local1337);
												local1889 = local1889.method159(local1337 + 2);
											}
											local1891.method265(local1913, local170 + 3, local453, 0, false);
											local453 += local1891.anInt417 + 1;
										}
									}
									if (local20.anInt2658 == 9) {
										if (local20.anInt2650 == 1) {
											Static66.method1840(local45, local53, local20.anInt2667 + local45, local53 + local20.anInt2600, local20.anInt2645);
										} else {
											local395 = local20.anInt2667 >= 0 ? local20.anInt2667 : -local20.anInt2667;
											local397 = local20.anInt2600 >= 0 ? local20.anInt2600 : -local20.anInt2600;
											local401 = local395;
											if (local395 < local397) {
												local401 = local397;
											}
											if (local401 != 0) {
												local94 = (local20.anInt2667 << 16) / local401;
												local89 = (local20.anInt2600 << 16) / local401;
												if (local89 <= local94) {
													local94 = -local94;
												} else {
													local89 = -local89;
												}
												local170 = local20.anInt2650 * local89 >> 17;
												local152 = local89 * local20.anInt2650 + 1 >> 17;
												local453 = local20.anInt2650 * local94 >> 17;
												local1337 = local20.anInt2650 * local94 + 1 >> 17;
												local1327 = local170 + local45;
												local1343 = local20.anInt2667 + local45 - local152;
												@Pc(2216) int local2216 = local53 + local20.anInt2600 - local1337;
												@Pc(2221) int local2221 = local53 - local1337;
												local649 = local45 - local152;
												@Pc(2234) int local2234 = local45 + local20.anInt2667 + local170;
												@Pc(2241) int local2241 = local453 + local53 + local20.anInt2600;
												Static25.method516(local1327, local649, local1343);
												@Pc(2249) int local2249 = local453 + local53;
												Static25.method512(local2249, local2221, local2216, local1327, local649, local1343, local20.anInt2645);
												Static25.method516(local1327, local1343, local2234);
												Static25.method512(local2249, local2216, local2241, local1327, local1343, local2234, local20.anInt2645);
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
		return local12;
	}
}
