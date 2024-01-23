import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!me;")
	public static Class71 aClass71_21;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!ie;")
	public static Class53 aClass53_18 = new Class53(64);

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_752 = Static64.method1101(" has logged out)3");

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!ia;")
	public static Class51 aClass51_751 = aClass51_752;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[I")
	public static int[] anIntArray139 = new int[25];

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!me;")
	public static Class71 aClass71_20 = null;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "Lclient!of;")
	public static Applet_Sub1 anApplet_Sub1_5 = null;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "Lclient!ia;")
	public static Class51 aClass51_753 = Static64.method1101("(U3");

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZ)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static84.anInt1961 == 0 || arg1 == 0 || Static161.anInt3459 >= 50 || arg2 == -1) {
			return;
		}
		Static225.anIntArray375[Static161.anInt3459] = arg2;
		Static66.anIntArray99[Static161.anInt3459] = arg1;
		Static123.anIntArray162[Static161.anInt3459] = arg0;
		Static141.aClass91Array2[Static161.anInt3459] = null;
		Static129.anIntArray189[Static161.anInt3459] = 0;
		Static161.anInt3459++;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
	public static boolean method1759() {
		return Static198.anInt4222 == 0 ? Static225.aClass1_Sub4_Sub1_3.method385() : true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)I")
	public static int method1761(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
			return arg0 - 32;
		} else if (arg0 == 255) {
			return 159;
		} else if (arg0 == 156) {
			return 140;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[Lclient!me;II)V")
	public static void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class71[] arg7, @OriginalArg(8) int arg8) {
		Static96.method1612(arg3, arg8, arg4, arg2);
		Static171.method2965();
		for (@Pc(18) int local18 = 0; local18 < arg7.length; local18++) {
			@Pc(24) Class71 local24 = arg7[local18];
			if (local24 != null && (arg5 == local24.anInt2785 || arg5 == -1412584499 && Static111.aClass71_22 == local24)) {
				@Pc(50) int local50;
				if (arg6 == -1) {
					Static33.anIntArray48[Static127.anInt2862] = arg1 + local24.anInt2858;
					Static62.anIntArray93[Static127.anInt2862] = arg0 + local24.anInt2804;
					Static187.anIntArray305[Static127.anInt2862] = local24.anInt2802;
					Static164.anIntArray239[Static127.anInt2862] = local24.anInt2835;
					local50 = Static127.anInt2862++;
				} else {
					local50 = arg6;
				}
				local24.anInt2832 = local50;
				local24.anInt2817 = Static109.anInt2430;
				if (!local24.aBoolean122 || !Static33.method583(local24)) {
					if (local24.anInt2815 > 0) {
						Static93.method1546(local24);
					}
					@Pc(109) int local109 = local24.anInt2804 + arg0;
					@Pc(112) int local112 = local24.anInt2810;
					@Pc(117) int local117 = arg1 + local24.anInt2858;
					if (Static135.aBoolean135 && (Static33.method587(local24) != 0 || local24.anInt2777 == 0) && local112 > 127) {
						local112 = 127;
					}
					@Pc(161) int local161;
					@Pc(163) int local163;
					if (local24 == Static111.aClass71_22) {
						if (arg5 != -1412584499 && !local24.aBoolean125) {
							Static224.anInt4694 = arg1;
							Static108.aClass71Array1 = arg7;
							Static227.anInt4778 = arg0;
							continue;
						}
						if (!local24.aBoolean125) {
							local112 = 128;
						}
						if (Static33.aBoolean35 && Static32.aBoolean27) {
							local161 = Static205.anInt4361;
							local163 = Static15.anInt373;
							local163 -= Static167.anInt3761;
							local161 -= Static222.anInt4666;
							if (local161 < Static118.anInt2543) {
								local161 = Static118.anInt2543;
							}
							if (aClass71_20.anInt2802 + Static118.anInt2543 < local24.anInt2802 + local161) {
								local161 = aClass71_20.anInt2802 + Static118.anInt2543 - local24.anInt2802;
							}
							if (local163 < Static168.anInt3765) {
								local163 = Static168.anInt3765;
							}
							local117 = local161;
							if (local163 + local24.anInt2835 > Static168.anInt3765 - -aClass71_20.anInt2835) {
								local163 = aClass71_20.anInt2835 + Static168.anInt3765 - local24.anInt2835;
							}
							local109 = local163;
						}
					}
					@Pc(284) int local284;
					@Pc(273) int local273;
					@Pc(252) int local252;
					@Pc(258) int local258;
					if (local24.anInt2777 == 2) {
						local163 = arg8;
						local273 = arg2;
						local284 = arg4;
						local161 = arg3;
					} else {
						local161 = local117 > arg3 ? local117 : arg3;
						local163 = arg8 >= local109 ? arg8 : local109;
						local252 = local24.anInt2802 + local117;
						local258 = local109 + local24.anInt2835;
						if (local24.anInt2777 == 9) {
							local258++;
							local252++;
						}
						local273 = local258 < arg2 ? local258 : arg2;
						local284 = arg4 <= local252 ? arg4 : local252;
					}
					if (!local24.aBoolean122 || local284 > local161 && local163 < local273) {
						@Pc(548) int local548;
						@Pc(550) int local550;
						if (local24.anInt2815 != 0) {
							if (local24.anInt2815 == 1337) {
								Static20.aClass71_6 = local24;
								Static138.anInt3088 = local109;
								Static164.anInt3641 = local117;
								Static178.method3027(local109, local117, local24.anInt2835, local24.anInt2815 == 1403, local24.anInt2802);
								Static96.method1612(arg3, arg8, arg4, arg2);
								continue;
							}
							if (local24.anInt2815 == 1338) {
								if (local24.method2202()) {
									Static41.method721(local50, local109, local117, local24);
									Static96.method1612(arg3, arg8, arg4, arg2);
								}
								continue;
							}
							if (local24.anInt2815 == 1339) {
								if (local24.method2202()) {
									Static65.method1114(local109, local117, local50, local24);
									Static96.method1612(arg3, arg8, arg4, arg2);
								}
								continue;
							}
							if (local24.anInt2815 == 1400) {
								Static67.method1161(local24.anInt2835, local117, local109, local24.anInt2802);
								Static73.aBooleanArray10[local50] = true;
								Static22.aBooleanArray8[local50] = true;
								Static96.method1612(arg3, arg8, arg4, arg2);
								continue;
							}
							if (local24.anInt2815 == 1401) {
								Static119.method3319(local24.anInt2835, local109, local117, local24.anInt2802);
								Static73.aBooleanArray10[local50] = true;
								Static22.aBooleanArray8[local50] = true;
								Static96.method1612(arg3, arg8, arg4, arg2);
								continue;
							}
							if (local24.anInt2815 == 1402) {
								Static142.method2484(local109, local117);
								Static73.aBooleanArray10[local50] = true;
								Static22.aBooleanArray8[local50] = true;
								continue;
							}
							if (local24.anInt2815 == 1404) {
								Static229.method3821(Static80.aClass1_Sub2_Sub11_2, local24, Static165.aClass1_Sub2_Sub11_3, local24.anInt2802, local117, local24.anInt2835, local109);
								Static73.aBooleanArray10[local50] = true;
								Static22.aBooleanArray8[local50] = true;
								continue;
							}
							if (local24.anInt2815 == 1405) {
								if (Static48.aBoolean56) {
									local252 = local24.anInt2802 + local117;
									local258 = local109 + 15;
									Static52.aClass1_Sub2_Sub11_1.method2021(Static150.method2574(new Class51[] { Static199.aClass51_1456, Static27.method511(Static132.anInt2984) }), local252, local258, 16776960, -1);
									local258 += 15;
									@Pc(538) Runtime local538 = Runtime.getRuntime();
									local548 = (int) ((local538.totalMemory() - local538.freeMemory()) / 1024L);
									local550 = 16776960;
									if (local548 > 65536) {
										local550 = 16711680;
									}
									Static52.aClass1_Sub2_Sub11_1.method2021(Static150.method2574(new Class51[] { Static114.aClass51_835, Static27.method511(local548), Static230.aClass51_1662 }), local252, local258, local550, -1);
									local258 += 15;
									Static73.aBooleanArray10[local50] = true;
									Static22.aBooleanArray8[local50] = true;
								}
								continue;
							}
						}
						local252 = Static205.anInt4361;
						if (local24.anInt2777 == 0 && local24.aBoolean118 && Static205.anInt4361 >= local161 && local163 <= Static15.anInt373 && Static205.anInt4361 < local284 && Static15.anInt373 < local273 && !Static156.aBoolean164 && !Static135.aBoolean135) {
							Static202.anInt4289 = 1;
							Static227.aShortArray59[0] = 1001;
							Static21.aClass51Array3[0] = Static93.aClass51_670;
							Static168.aClass51Array27[0] = Static81.aClass51_607;
						}
						local258 = Static15.anInt373;
						if (!Static156.aBoolean164 && local252 >= local161 && local258 >= local163 && local252 < local284 && local273 > local258) {
							Static224.method3675(local258 - local109, local24, local252 - local117);
						}
						if (local24.anInt2777 == 0) {
							if (!local24.aBoolean122 && Static33.method583(local24) && local24 != Static86.aClass71_18) {
								continue;
							}
							if (!local24.aBoolean122) {
								if (local24.anInt2813 - local24.anInt2835 < local24.anInt2779) {
									local24.anInt2779 = local24.anInt2813 - local24.anInt2835;
								}
								if (local24.anInt2779 < 0) {
									local24.anInt2779 = 0;
								}
							}
							method1762(local109 - local24.anInt2779, local117 - local24.anInt2842, local273, local161, local284, local24.anInt2807, local50, arg7, local163);
							if (local24.aClass71Array2 != null) {
								method1762(local109 - local24.anInt2779, local117 - local24.anInt2842, local273, local161, local284, local24.anInt2807, local50, local24.aClass71Array2, local163);
							}
							@Pc(763) Class1_Sub13 local763 = (Class1_Sub13) Static120.aClass102_14.method3093((long) local24.anInt2807);
							if (local763 != null) {
								if (local763.anInt1675 == 0 && Static205.anInt4361 >= local161 && Static15.anInt373 >= local163 && local284 > Static205.anInt4361 && Static15.anInt373 < local273 && !Static156.aBoolean164 && !Static135.aBoolean135) {
									Static202.anInt4289 = 1;
									Static227.aShortArray59[0] = 1001;
									Static21.aClass51Array3[0] = Static93.aClass51_670;
									Static168.aClass51Array27[0] = Static81.aClass51_607;
								}
								Static119.method3321(local117, local763.anInt1677, local284, local50, local163, local273, local109, local161);
							}
							Static96.method1612(arg3, arg8, arg4, arg2);
							Static171.method2965();
						}
						if (Static74.aBooleanArray11[local50] || Static36.anInt871 > 1) {
							if (local24.anInt2777 == 0 && !local24.aBoolean122 && local24.anInt2835 < local24.anInt2813) {
								Static160.method2702(local24.anInt2813, local24.anInt2779, local24.anInt2835, local109, local117 + local24.anInt2802);
							}
							if (local24.anInt2777 != 1) {
								@Pc(902) int local902;
								@Pc(1039) int local1039;
								@Pc(935) int local935;
								@Pc(875) int local875;
								@Pc(1044) int local1044;
								@Pc(893) int local893;
								if (local24.anInt2777 == 2) {
									local875 = 0;
									for (local548 = 0; local548 < local24.anInt2797; local548++) {
										for (local550 = 0; local550 < local24.anInt2855; local550++) {
											local893 = (local24.anInt2826 + 32) * local548 + local109;
											local902 = local117 + local550 * (local24.anInt2803 + 32);
											if (local875 < 20) {
												local893 += local24.anIntArray181[local875];
												local902 += local24.anIntArray175[local875];
											}
											if (local24.anIntArray177[local875] > 0) {
												local935 = local24.anIntArray177[local875] - 1;
												if (local902 + 32 > arg3 && local902 < arg4 && arg8 < local893 + 32 && local893 < arg2 || local24 == Static229.aClass71_31 && local875 == Static46.anInt1132) {
													@Pc(997) Class1_Sub2_Sub1 local997;
													if (Static54.anInt1264 == 1 && local875 == Static52.anInt1233 && Static143.anInt3141 == local24.anInt2807) {
														local997 = Static187.method3121(local24.aBoolean116, local24.anIntArray184[local875], 2, 0, local935);
													} else {
														local997 = Static187.method3121(local24.aBoolean116, local24.anIntArray184[local875], 1, 3153952, local935);
													}
													if (Static171.aBoolean176) {
														Static73.aBooleanArray10[local50] = true;
													}
													if (local997 == null) {
														Static82.method1438(local24);
													} else if (local24 == Static229.aClass71_31 && local875 == Static46.anInt1132) {
														local1039 = Static15.anInt373 - Static36.anInt866;
														local1044 = Static205.anInt4361 - Static169.anInt3805;
														if (local1044 < 5 && local1044 > -5) {
															local1044 = 0;
														}
														if (local1039 < 5 && local1039 > -5) {
															local1039 = 0;
														}
														if (Static151.anInt3327 < 5) {
															local1044 = 0;
															local1039 = 0;
														}
														local997.method2071(local1044 + local902, local1039 + local893, 128);
														if (arg5 != -1) {
															@Pc(1094) Class71 local1094 = arg7[arg5 & 0xFFFF];
															@Pc(1096) int local1096 = Static96.anInt2124;
															@Pc(1098) int local1098 = Static96.anInt2125;
															@Pc(1121) int local1121;
															if (local1096 > local1039 + local893 && local1094.anInt2779 > 0) {
																local1121 = Static48.anInt1156 * (local1096 - local1039 - local893) / 3;
																if (Static48.anInt1156 * 10 < local1121) {
																	local1121 = Static48.anInt1156 * 10;
																}
																if (local1094.anInt2779 < local1121) {
																	local1121 = local1094.anInt2779;
																}
																Static36.anInt866 += local1121;
																local1094.anInt2779 -= local1121;
																Static82.method1438(local1094);
															}
															if (local893 + local1039 + 32 > local1098 && local1094.anInt2779 < local1094.anInt2813 - local1094.anInt2835) {
																local1121 = Static48.anInt1156 * (local893 + local1039 + 32 - local1098) / 3;
																if (Static48.anInt1156 * 10 < local1121) {
																	local1121 = Static48.anInt1156 * 10;
																}
																if (local1094.anInt2813 - local1094.anInt2835 - local1094.anInt2779 < local1121) {
																	local1121 = local1094.anInt2813 - local1094.anInt2835 - local1094.anInt2779;
																}
																local1094.anInt2779 += local1121;
																Static36.anInt866 -= local1121;
																Static82.method1438(local1094);
															}
														}
													} else if (local24 == Static61.aClass71_13 && local875 == Static202.anInt4286) {
														local997.method2071(local902, local893, 128);
													} else {
														local997.method2064(local902, local893);
													}
												}
											} else if (local24.anIntArray180 != null && local875 < 20) {
												@Pc(1266) Class1_Sub2_Sub1 local1266 = local24.method2212(local875);
												if (local1266 != null) {
													local1266.method2064(local902, local893);
												} else if (Static34.aBoolean37) {
													Static82.method1438(local24);
												}
											}
											local875++;
										}
									}
								} else if (local24.anInt2777 == 3) {
									if (Static194.method3244(local24)) {
										local875 = local24.anInt2798;
										if (Static86.aClass71_18 == local24 && local24.anInt2794 != 0) {
											local875 = local24.anInt2794;
										}
									} else {
										local875 = local24.anInt2854;
										if (Static86.aClass71_18 == local24 && local24.anInt2829 != 0) {
											local875 = local24.anInt2829;
										}
									}
									if (local112 == 0) {
										if (local24.aBoolean119) {
											Static96.method1623(local117, local109, local24.anInt2802, local24.anInt2835, local875);
										} else {
											Static96.method1633(local117, local109, local24.anInt2802, local24.anInt2835, local875);
										}
									} else if (local24.aBoolean119) {
										Static96.method1621(local117, local109, local24.anInt2802, local24.anInt2835, local875, 256 - (local112 & 0xFF));
									} else {
										Static96.method1629(local117, local109, local24.anInt2802, local24.anInt2835, local875, 256 - (local112 & 0xFF));
									}
								} else {
									@Pc(1406) Class1_Sub2_Sub11 local1406;
									if (local24.anInt2777 == 4) {
										local1406 = local24.method2204(Static141.aClass41Array7);
										if (local1406 != null) {
											@Pc(1418) Class51 local1418 = local24.aClass51_985;
											if (Static194.method3244(local24)) {
												local548 = local24.anInt2798;
												if (Static86.aClass71_18 == local24 && local24.anInt2794 != 0) {
													local548 = local24.anInt2794;
												}
												if (local24.aClass51_988.method1399() > 0) {
													local1418 = local24.aClass51_988;
												}
											} else {
												local548 = local24.anInt2854;
												if (Static86.aClass71_18 == local24 && local24.anInt2829 != 0) {
													local548 = local24.anInt2829;
												}
											}
											if (local24.aBoolean122 && local24.anInt2806 != -1) {
												@Pc(1478) Class92 local1478 = Static36.method637(local24.anInt2806);
												local1418 = local1478.aClass51_1254;
												if (local1418 == null) {
													local1418 = Static110.aClass51_423;
												}
												if ((local1478.anInt3644 == 1 || local24.anInt2823 != 1) && local24.anInt2823 != -1) {
													local1418 = Static150.method2574(new Class51[] { Static134.aClass51_1061, local1418, Static109.aClass51_791, Static228.method3747(local24.anInt2823) });
												}
											}
											if (Static172.aClass71_30 == local24) {
												local1418 = Static79.aClass51_603;
												local548 = local24.anInt2854;
											}
											if (!local24.aBoolean122) {
												local1418 = Static135.method2409(local24, local1418);
											}
											local1406.method2023(local1418, local117, local109, local24.anInt2802, local24.anInt2835, local548, local24.aBoolean115 ? 0 : -1, local24.anInt2780, local24.anInt2837, local24.anInt2775);
										} else if (Static34.aBoolean37) {
											Static82.method1438(local24);
										}
									} else if (local24.anInt2777 == 5) {
										@Pc(1582) Class1_Sub2_Sub1 local1582;
										if (local24.aBoolean122) {
											if (local24.anInt2806 == -1) {
												local1582 = local24.method2207(false);
											} else {
												local1582 = Static187.method3121(local24.aBoolean116, local24.anInt2823, local24.anInt2861, local24.anInt2824, local24.anInt2806);
											}
											if (local1582 != null) {
												local548 = local1582.anInt2635;
												local550 = local1582.anInt2638;
												if (local24.aBoolean117) {
													local902 = (local24.anInt2802 + local548 - 1) / local548;
													local893 = (local24.anInt2835 + local550 - 1) / local550;
													Static96.method1614(local117, local109, local117 + local24.anInt2802, local109 + local24.anInt2835);
													for (local1044 = 0; local1044 < local902; local1044++) {
														for (local1039 = 0; local1039 < local893; local1039++) {
															if (local24.anInt2850 != 0) {
																local1582.method2068(local24.anInt2850, 4096, local548 / 2 + local117 + local548 * local1044, local550 / 2 + local1039 * local550 + local109);
															} else if (local112 == 0) {
																local1582.method2064(local548 * local1044 + local117, local109 - -(local550 * local1039));
															} else {
																local1582.method2071(local117 + local1044 * local548, local1039 * local550 + local109, 256 - (local112 & 0xFF));
															}
														}
													}
													Static96.method1612(arg3, arg8, arg4, arg2);
												} else {
													local902 = local24.anInt2802 * 4096 / local548;
													if (local24.anInt2850 != 0) {
														local1582.method2068(local24.anInt2850, local902, local117 + local24.anInt2802 / 2, local109 + local24.anInt2835 / 2);
													} else if (local112 != 0) {
														local1582.method2065(local117, local109, local24.anInt2802, local24.anInt2835, 256 - (local112 & 0xFF));
													} else if (local548 == local24.anInt2802 && local550 == local24.anInt2835) {
														local1582.method2064(local117, local109);
													} else {
														local1582.method2066(local117, local109, local24.anInt2802, local24.anInt2835);
													}
												}
											} else if (Static34.aBoolean37) {
												Static82.method1438(local24);
											}
										} else {
											local1582 = local24.method2207(Static194.method3244(local24));
											if (local1582 != null) {
												local1582.method2064(local117, local109);
											} else if (Static34.aBoolean37) {
												Static82.method1438(local24);
											}
										}
									} else {
										@Pc(1880) Class92 local1880;
										@Pc(2118) int local2118;
										if (local24.anInt2777 == 6) {
											@Pc(1856) boolean local1856 = Static194.method3244(local24);
											if (local1856) {
												local548 = local24.anInt2795;
											} else {
												local548 = local24.anInt2782;
											}
											local902 = 0;
											@Pc(1870) Class5_Sub2 local1870 = null;
											if (local24.anInt2806 != -1) {
												local1880 = Static36.method637(local24.anInt2806);
												if (local1880 != null) {
													local1880 = local1880.method2806(local24.anInt2823);
													@Pc(1898) Class40 local1898 = local548 == -1 ? null : Static32.method546(local548);
													local1870 = local1880.method2810(1, local24.anInt2793, local1898);
													if (local1870 == null) {
														Static82.method1438(local24);
													} else {
														local902 = -local1870.method3680() / 2;
													}
												}
											} else if (local24.anInt2821 == 5) {
												if (local24.anInt2805 == -1) {
													local1870 = Static17.aClass111_1.method3278(-1, null, -1, null);
												} else {
													local893 = local24.anInt2805 & 0x7FF;
													if (Static228.anInt4794 == local893) {
														local893 = 2047;
													}
													@Pc(1958) Class5_Sub1_Sub1 local1958 = Static191.aClass5_Sub1_Sub1Array1[local893];
													@Pc(1968) Class40 local1968 = local548 == -1 ? null : Static32.method546(local548);
													if (local1958 != null && (int) local1958.aClass51_619.method1388() << 11 == (local24.anInt2805 & 0xFFFFF800)) {
														local1870 = local1958.aClass111_2.method3278(local24.anInt2793, null, 0, local1968);
													}
												}
											} else if (local548 == -1) {
												local1870 = local24.method2211(local1856, Static73.aClass5_Sub1_Sub1_1.aClass111_2, null, -1);
												if (local1870 == null && Static34.aBoolean37) {
													Static82.method1438(local24);
												}
											} else {
												@Pc(2003) Class40 local2003 = Static32.method546(local548);
												local1870 = local24.method2211(local1856, Static73.aClass5_Sub1_Sub1_1.aClass111_2, local2003, local24.anInt2793);
												if (local1870 == null && Static34.aBoolean37) {
													Static82.method1438(local24);
												}
											}
											if (local1870 != null) {
												if (local24.anInt2839 <= 0) {
													local893 = 256;
												} else {
													local893 = (local24.anInt2802 << 8) / local24.anInt2839;
												}
												if (local24.anInt2784 > 0) {
													local1044 = (local24.anInt2835 << 8) / local24.anInt2784;
												} else {
													local1044 = 256;
												}
												local1039 = (local893 * local24.anInt2816 >> 8) + local117 + local24.anInt2802 / 2;
												local935 = (local1044 * local24.anInt2860 >> 8) + local109 + local24.anInt2835 / 2;
												Static171.method2958(local1039, local935);
												local2118 = local24.anInt2844 * Class94.anIntArray278[local24.anInt2776] >> 16;
												@Pc(2128) int local2128 = local24.anInt2844 * Class94.anIntArray277[local24.anInt2776] >> 16;
												if (!local24.aBoolean122) {
													local1870.method2917(local24.anInt2825, 0, local24.anInt2776, 0, local2118, local2128);
												} else if (local24.aBoolean126) {
													((Class5_Sub2_Sub1) local1870).method2941(local24.anInt2825, local24.anInt2827, local24.anInt2776, local24.anInt2792, local902 + local2118 + local24.anInt2822, local24.anInt2822 + local2128, local24.anInt2844);
												} else {
													local1870.method2917(local24.anInt2825, local24.anInt2827, local24.anInt2776, local24.anInt2792, local24.anInt2822 + local902 + local2118, local24.anInt2822 + local2128);
												}
												Static171.method2956();
											}
										} else {
											if (local24.anInt2777 == 7) {
												local1406 = local24.method2204(Static141.aClass41Array7);
												if (local1406 == null) {
													if (Static34.aBoolean37) {
														Static82.method1438(local24);
													}
													continue;
												}
												local548 = 0;
												for (local550 = 0; local550 < local24.anInt2797; local550++) {
													for (local902 = 0; local902 < local24.anInt2855; local902++) {
														if (local24.anIntArray177[local548] > 0) {
															local1880 = Static36.method637(local24.anIntArray177[local548] - 1);
															@Pc(2281) Class51 local2281;
															if (local1880.anInt3644 != 1 && local24.anIntArray184[local548] == 1) {
																local2281 = Static150.method2574(new Class51[] { Static134.aClass51_1061, local1880.aClass51_1254, Static14.aClass51_111 });
															} else {
																local2281 = Static150.method2574(new Class51[] { Static134.aClass51_1061, local1880.aClass51_1254, Static109.aClass51_791, Static228.method3747(local24.anIntArray184[local548]) });
															}
															local1039 = (local24.anInt2803 + 115) * local902 + local117;
															local935 = local109 + (local24.anInt2826 + 12) * local550;
															if (local24.anInt2780 == 0) {
																local1406.method2038(local2281, local1039, local935, local24.anInt2854, local24.aBoolean115 ? 0 : -1);
															} else if (local24.anInt2780 == 1) {
																local1406.method2042(local2281, local1039 + 57, local935, local24.anInt2854, local24.aBoolean115 ? 0 : -1);
															} else {
																local1406.method2021(local2281, local1039 + 115 - 1, local935, local24.anInt2854, local24.aBoolean115 ? 0 : -1);
															}
														}
														local548++;
													}
												}
											}
											if (local24.anInt2777 == 8 && Static93.aClass71_19 == local24 && Static46.anInt1125 == Static158.anInt3439) {
												local548 = 0;
												@Pc(2418) Class51 local2418 = local24.aClass51_985;
												@Pc(2420) Class1_Sub2_Sub11 local2420 = Static52.aClass1_Sub2_Sub11_1;
												local2418 = Static135.method2409(local24, local2418);
												local875 = 0;
												@Pc(2439) Class51 local2439;
												while (local2418.method1399() > 0) {
													local1044 = local2418.method1403(Static147.aClass51_1127);
													if (local1044 == -1) {
														local2439 = local2418;
														local2418 = Static81.aClass51_607;
													} else {
														local2439 = local2418.method1433(0, local1044);
														local2418 = local2418.method1394(local1044 + 4);
													}
													local1039 = local2420.method2040(local2439);
													local548 += local2420.anInt2600 + 1;
													if (local875 < local1039) {
														local875 = local1039;
													}
												}
												local875 += 6;
												local1039 = local24.anInt2835 + local109 + 5;
												local1044 = local117 + local24.anInt2802 - local875 - 5;
												local548 += 7;
												if (local117 + 5 > local1044) {
													local1044 = local117 + 5;
												}
												if (arg2 < local548 + local1039) {
													local1039 = arg2 - local548;
												}
												if (local875 + local1044 > arg4) {
													local1044 = arg4 - local875;
												}
												Static96.method1623(local1044, local1039, local875, local548, 16777120);
												Static96.method1633(local1044, local1039, local875, local548, 0);
												local2418 = local24.aClass51_985;
												local935 = local2420.anInt2600 + local1039 + 2;
												local2418 = Static135.method2409(local24, local2418);
												while (local2418.method1399() > 0) {
													local2118 = local2418.method1403(Static147.aClass51_1127);
													if (local2118 == -1) {
														local2439 = local2418;
														local2418 = Static81.aClass51_607;
													} else {
														local2439 = local2418.method1433(0, local2118);
														local2418 = local2418.method1394(local2118 + 4);
													}
													local2420.method2038(local2439, local1044 + 3, local935, 0, -1);
													local935 += local2420.anInt2600 + 1;
												}
											}
											if (local24.anInt2777 == 9) {
												if (local24.aBoolean112) {
													local548 = local24.anInt2835 + local109;
													local902 = local109;
													local550 = local117 + local24.anInt2802;
												} else {
													local902 = local24.anInt2835 + local109;
													local550 = local24.anInt2802 + local117;
													local548 = local109;
												}
												if (local24.anInt2808 == 1) {
													Static96.method1615(local117, local548, local550, local902, local24.anInt2854);
												} else {
													Static96.method1613(local117, local548, local550, local902, local24.anInt2854, local24.anInt2808);
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

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
	public static void method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(8) int local8 = arg0; local8 <= arg4; local8++) {
			Static71.method1261(Static113.anIntArrayArray10[local8], arg3, arg2, arg1);
		}
	}
}
