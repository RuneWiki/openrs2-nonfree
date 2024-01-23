import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1221 = Static186.method3527("Okay");

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1222 = Static186.method3527("gleiten:");

	@OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1223 = Static186.method3527("www");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([Lclient!qh;IIIIIIBII)V")
	public static void method2962(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static29.method406(arg2, arg8, arg5, arg6);
		Static215.method3355();
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(24) Class93 local24 = arg0[local18];
			if (local24 != null && (local24.anInt3660 == arg7 || arg7 == -1412584499 && Static54.aClass93_35 == local24)) {
				@Pc(73) int local73;
				if (arg3 == -1) {
					Static118.anIntArray258[Static42.anInt924] = arg1 + local24.anInt3631;
					Static75.anIntArray124[Static42.anInt924] = arg4 + local24.anInt3619;
					Static135.anIntArray296[Static42.anInt924] = local24.anInt3600;
					Static189.anIntArray440[Static42.anInt924] = local24.anInt3620;
					local73 = Static42.anInt924++;
				} else {
					local73 = arg3;
				}
				local24.anInt3599 = local73;
				local24.anInt3609 = Static107.anInt2132;
				if (!local24.aBoolean156 || !Static35.method561(local24)) {
					if (local24.anInt3618 > 0) {
						Static1.method34(local24);
					}
					@Pc(103) int local103 = arg4 + local24.anInt3619;
					@Pc(108) int local108 = arg1 + local24.anInt3631;
					@Pc(111) int local111 = local24.anInt3610;
					if (Static131.aBoolean115 && (Static35.method552(local24) != 0 || local24.anInt3656 == 0) && local111 > 127) {
						local111 = 127;
					}
					@Pc(153) int local153;
					@Pc(155) int local155;
					if (local24 == Static54.aClass93_35) {
						if (arg7 != -1412584499 && !local24.aBoolean158) {
							Static55.anInt1089 = arg4;
							Static32.anInt603 = arg1;
							Static214.aClass93Array2 = arg0;
							continue;
						}
						if (Static200.aBoolean189 && Static10.aBoolean9) {
							local153 = Static117.anInt2301;
							local155 = Static110.anInt2205;
							local153 -= Static27.anInt540;
							if (local153 < Static33.anInt627) {
								local153 = Static33.anInt627;
							}
							local155 -= Static155.anInt3202;
							if (local153 + local24.anInt3600 > Static53.aClass93_34.anInt3600 + Static33.anInt627) {
								local153 = Static33.anInt627 + Static53.aClass93_34.anInt3600 - local24.anInt3600;
							}
							if (local155 < Static165.anInt2676) {
								local155 = Static165.anInt2676;
							}
							if (Static53.aClass93_34.anInt3620 + Static165.anInt2676 < local155 - -local24.anInt3620) {
								local155 = Static53.aClass93_34.anInt3620 + Static165.anInt2676 - local24.anInt3620;
							}
							local108 = local153;
							local103 = local155;
						}
						if (!local24.aBoolean158) {
							local111 = 128;
						}
					}
					@Pc(241) int local241;
					@Pc(237) int local237;
					@Pc(266) int local266;
					@Pc(272) int local272;
					if (local24.anInt3656 == 2) {
						local153 = arg2;
						local237 = arg6;
						local155 = arg8;
						local241 = arg5;
					} else {
						local155 = arg8 >= local103 ? arg8 : local103;
						local153 = arg2 >= local108 ? arg2 : local108;
						local266 = local24.anInt3600 + local108;
						local272 = local103 + local24.anInt3620;
						if (local24.anInt3656 == 9) {
							local266++;
							local272++;
						}
						local237 = arg6 <= local272 ? arg6 : local272;
						local241 = arg5 <= local266 ? arg5 : local266;
					}
					if (!local24.aBoolean156 || local153 < local241 && local155 < local237) {
						@Pc(548) int local548;
						@Pc(539) int local539;
						if (local24.anInt3618 != 0) {
							if (local24.anInt3618 == 1337) {
								Static186.aClass93_126 = local24;
								Static217.anInt4283 = local108;
								Static106.anInt2130 = local103;
								Static121.method1933(local24.anInt3600, local108, local103, local24.anInt3620, local24.anInt3618 == 1403);
								Static29.method406(arg2, arg8, arg5, arg6);
								continue;
							}
							if (local24.anInt3618 == 1338) {
								if (local24.method2909()) {
									Static123.method1272(local103, local24, local108, local73);
									Static29.method406(arg2, arg8, arg5, arg6);
								}
								continue;
							}
							if (local24.anInt3618 == 1339) {
								if (local24.method2909()) {
									Static101.method1576(local73, local103, local108, local24);
									Static29.method406(arg2, arg8, arg5, arg6);
								}
								continue;
							}
							if (local24.anInt3618 == 1400) {
								Static220.method3394(local24.anInt3600, local103, local24.anInt3620, local108);
								Static98.aBooleanArray5[local73] = true;
								Static222.aBooleanArray28[local73] = true;
								Static29.method406(arg2, arg8, arg5, arg6);
								continue;
							}
							if (local24.anInt3618 == 1401) {
								Static103.method1592(local103, local108, local24.anInt3620, local24.anInt3600);
								Static98.aBooleanArray5[local73] = true;
								Static222.aBooleanArray28[local73] = true;
								Static29.method406(arg2, arg8, arg5, arg6);
								continue;
							}
							if (local24.anInt3618 == 1402) {
								Static234.method3538(local108, local103);
								Static98.aBooleanArray5[local73] = true;
								Static222.aBooleanArray28[local73] = true;
								continue;
							}
							if (local24.anInt3618 == 1404) {
								Static125.method2003(local103, local24.anInt3600, Static5.aClass1_Sub1_Sub10_1, local24, local108, Static187.aClass1_Sub1_Sub10_3, local24.anInt3620);
								Static98.aBooleanArray5[local73] = true;
								Static222.aBooleanArray28[local73] = true;
								continue;
							}
							if (local24.anInt3618 == 1405) {
								if (Static229.aBoolean214) {
									local266 = local24.anInt3600 + local108;
									local272 = local103 + 15;
									Static130.aClass1_Sub1_Sub10_2.method1820(Static17.method257(new Class50[] { Static137.aClass50_943, Static160.method2684(Static42.anInt923) }), local266, local272, 16776960, -1);
									@Pc(536) Runtime local536 = Runtime.getRuntime();
									local272 += 15;
									local539 = 16776960;
									local548 = (int) ((local536.totalMemory() - local536.freeMemory()) / 1024L);
									if (local548 > 65536) {
										local539 = 16711680;
									}
									Static130.aClass1_Sub1_Sub10_2.method1820(Static17.method257(new Class50[] { Static110.aClass50_712, Static160.method2684(local548), Static216.aClass50_1346 }), local266, local272, local539, -1);
									local272 += 15;
									Static98.aBooleanArray5[local73] = true;
									Static222.aBooleanArray28[local73] = true;
								}
								continue;
							}
						}
						if (local24.anInt3656 == 0 && local24.aBoolean152 && local153 <= Static117.anInt2301 && Static110.anInt2205 >= local155 && Static117.anInt2301 < local241 && local237 > Static110.anInt2205 && !Static40.aBoolean44 && !Static131.aBoolean115) {
							Static91.aClass50Array78[0] = Static163.aClass50_1092;
							Static193.anInt3035 = 1;
							Static211.aClass50Array80[0] = Static7.aClass50_69;
							Static27.aShortArray4[0] = 1006;
						}
						local266 = Static117.anInt2301;
						local272 = Static110.anInt2205;
						if (!Static40.aBoolean44 && local266 >= local153 && local272 >= local155 && local266 < local241 && local237 > local272) {
							Static135.method2281(local266 - local108, -local103 + local272, local24);
						}
						if (local24.anInt3656 == 0) {
							if (!local24.aBoolean156 && Static35.method561(local24) && local24 != Static147.aClass93_91) {
								continue;
							}
							if (!local24.aBoolean156) {
								if (local24.anInt3587 - local24.anInt3620 < local24.anInt3608) {
									local24.anInt3608 = local24.anInt3587 - local24.anInt3620;
								}
								if (local24.anInt3608 < 0) {
									local24.anInt3608 = 0;
								}
							}
							method2962(arg0, local108 - local24.anInt3653, local153, local73, local103 - local24.anInt3608, local241, local237, local24.anInt3603, local155);
							if (local24.aClass93Array1 != null) {
								method2962(local24.aClass93Array1, local108 - local24.anInt3653, local153, local73, local103 - local24.anInt3608, local241, local237, local24.anInt3603, local155);
							}
							@Pc(773) Class1_Sub13 local773 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local24.anInt3603);
							if (local773 != null) {
								if (local773.anInt1587 == 0 && Static117.anInt2301 >= local153 && Static110.anInt2205 >= local155 && Static117.anInt2301 < local241 && local237 > Static110.anInt2205 && !Static40.aBoolean44 && !Static131.aBoolean115) {
									Static27.aShortArray4[0] = 1006;
									Static193.anInt3035 = 1;
									Static91.aClass50Array78[0] = Static163.aClass50_1092;
									Static211.aClass50Array80[0] = Static7.aClass50_69;
								}
								Static156.method2583(local241, local108, local153, local155, local773.anInt1588, local237, local73, local103);
							}
							Static29.method406(arg2, arg8, arg5, arg6);
							Static215.method3355();
						}
						if (Static124.aBooleanArray9[local73] || Static20.anInt418 > 1) {
							if (local24.anInt3656 == 0 && !local24.aBoolean156 && local24.anInt3587 > local24.anInt3620) {
								Static177.method2917(local24.anInt3587, local24.anInt3620, local24.anInt3608, local108 + local24.anInt3600, local103);
							}
							if (local24.anInt3656 != 1) {
								@Pc(904) int local904;
								@Pc(1056) int local1056;
								@Pc(949) int local949;
								@Pc(886) int local886;
								@Pc(1051) int local1051;
								@Pc(913) int local913;
								if (local24.anInt3656 == 2) {
									local886 = 0;
									for (local548 = 0; local548 < local24.anInt3640; local548++) {
										for (local539 = 0; local539 < local24.anInt3669; local539++) {
											local904 = local108 + (local24.anInt3655 + 32) * local539;
											local913 = (local24.anInt3641 + 32) * local548 + local103;
											if (local886 < 20) {
												local913 += local24.anIntArray395[local886];
												local904 += local24.anIntArray389[local886];
											}
											if (local24.anIntArray392[local886] > 0) {
												local949 = local24.anIntArray392[local886] - 1;
												if (arg2 < local904 + 32 && arg5 > local904 && local913 + 32 > arg8 && arg6 > local913 || local24 == Static9.aClass93_9 && local886 == Static58.anInt1155) {
													@Pc(1013) Class1_Sub1_Sub8 local1013;
													if (Static123.anInt1750 == 1 && Static165.anInt2639 == local886 && Static110.anInt2200 == local24.anInt3603) {
														local1013 = Static66.method1000(0, local24.aBoolean161, local949, local24.anIntArray401[local886], 2);
													} else {
														local1013 = Static66.method1000(3153952, local24.aBoolean161, local949, local24.anIntArray401[local886], 1);
													}
													if (Static215.aBoolean205) {
														Static98.aBooleanArray5[local73] = true;
													}
													if (local1013 == null) {
														Static66.method999(local24);
													} else if (local24 == Static9.aClass93_9 && Static58.anInt1155 == local886) {
														local1051 = Static117.anInt2301 - Static45.anInt940;
														local1056 = Static110.anInt2205 - Static196.anInt3982;
														if (local1056 < 5 && local1056 > -5) {
															local1056 = 0;
														}
														if (local1051 < 5 && local1051 > -5) {
															local1051 = 0;
														}
														if (Static63.anInt1260 < 5) {
															local1051 = 0;
															local1056 = 0;
														}
														local1013.method2425(local904 + local1051, local913 + local1056, 128);
														if (arg7 != -1) {
															@Pc(1106) Class93 local1106 = arg0[arg7 & 0xFFFF];
															@Pc(1108) int local1108 = Static29.anInt550;
															@Pc(1110) int local1110 = Static29.anInt548;
															@Pc(1133) int local1133;
															if (local913 + local1056 < local1110 && local1106.anInt3608 > 0) {
																local1133 = Static42.anInt921 * (local1110 - local913 - local1056) / 3;
																if (Static42.anInt921 * 10 < local1133) {
																	local1133 = Static42.anInt921 * 10;
																}
																if (local1106.anInt3608 < local1133) {
																	local1133 = local1106.anInt3608;
																}
																Static196.anInt3982 += local1133;
																local1106.anInt3608 -= local1133;
																Static66.method999(local1106);
															}
															if (local1056 + local913 + 32 > local1108 && local1106.anInt3587 - local1106.anInt3620 > local1106.anInt3608) {
																local1133 = Static42.anInt921 * (local1056 + local913 + 32 - local1108) / 3;
																if (Static42.anInt921 * 10 < local1133) {
																	local1133 = Static42.anInt921 * 10;
																}
																if (local1106.anInt3587 - local1106.anInt3620 - local1106.anInt3608 < local1133) {
																	local1133 = local1106.anInt3587 - local1106.anInt3620 - local1106.anInt3608;
																}
																Static196.anInt3982 -= local1133;
																local1106.anInt3608 += local1133;
																Static66.method999(local1106);
															}
														}
													} else if (Static66.aClass93_44 == local24 && Static182.anInt3776 == local886) {
														local1013.method2425(local904, local913, 128);
													} else {
														local1013.method2417(local904, local913);
													}
												}
											} else if (local24.anIntArray397 != null && local886 < 20) {
												@Pc(1276) Class1_Sub1_Sub8 local1276 = local24.method2898(local886);
												if (local1276 != null) {
													local1276.method2417(local904, local913);
												} else if (Static142.aBoolean124) {
													Static66.method999(local24);
												}
											}
											local886++;
										}
									}
								} else if (local24.anInt3656 == 3) {
									if (Static31.method461(local24)) {
										local886 = local24.anInt3605;
										if (local24 == Static147.aClass93_91 && local24.anInt3593 != 0) {
											local886 = local24.anInt3593;
										}
									} else {
										local886 = local24.anInt3591;
										if (Static147.aClass93_91 == local24 && local24.anInt3646 != 0) {
											local886 = local24.anInt3646;
										}
									}
									if (local111 == 0) {
										if (local24.aBoolean164) {
											Static29.method423(local108, local103, local24.anInt3600, local24.anInt3620, local886);
										} else {
											Static29.method411(local108, local103, local24.anInt3600, local24.anInt3620, local886);
										}
									} else if (local24.aBoolean164) {
										Static29.method401(local108, local103, local24.anInt3600, local24.anInt3620, local886, 256 - (local111 & 0xFF));
									} else {
										Static29.method409(local108, local103, local24.anInt3600, local24.anInt3620, local886, 256 - (local111 & 0xFF));
									}
								} else {
									@Pc(1419) Class1_Sub1_Sub10 local1419;
									if (local24.anInt3656 == 4) {
										local1419 = local24.method2906(Static208.aClass78Array7);
										if (local1419 != null) {
											@Pc(1431) Class50 local1431 = local24.aClass50_1188;
											if (Static31.method461(local24)) {
												local548 = local24.anInt3605;
												if (local24 == Static147.aClass93_91 && local24.anInt3593 != 0) {
													local548 = local24.anInt3593;
												}
												if (local24.aClass50_1189.method1249() > 0) {
													local1431 = local24.aClass50_1189;
												}
											} else {
												local548 = local24.anInt3591;
												if (local24 == Static147.aClass93_91 && local24.anInt3646 != 0) {
													local548 = local24.anInt3646;
												}
											}
											if (local24.aBoolean156 && local24.anInt3595 != -1) {
												@Pc(1488) Class70 local1488 = Static16.method227(local24.anInt3595);
												local1431 = local1488.aClass50_833;
												if (local1431 == null) {
													local1431 = Static216.aClass50_1347;
												}
												if ((local1488.anInt2430 == 1 || local24.anInt3623 != 1) && local24.anInt3623 != -1) {
													local1431 = Static17.method257(new Class50[] { Static80.aClass50_529, local1431, Static24.aClass50_189, Static37.method608(local24.anInt3623) });
												}
											}
											if (Static199.aClass93_112 == local24) {
												local548 = local24.anInt3591;
												local1431 = Static149.aClass50_1026;
											}
											if (!local24.aBoolean156) {
												local1431 = Static134.method2265(local1431, local24);
											}
											local1419.method1818(local1431, local108, local103, local24.anInt3600, local24.anInt3620, local548, local24.aBoolean157 ? 0 : -1, local24.anInt3616, local24.anInt3617, local24.anInt3625);
										} else if (Static142.aBoolean124) {
											Static66.method999(local24);
										}
									} else if (local24.anInt3656 == 5) {
										@Pc(1592) Class1_Sub1_Sub8 local1592;
										if (local24.aBoolean156) {
											if (local24.anInt3595 == -1) {
												local1592 = local24.method2896(false);
											} else {
												local1592 = Static66.method1000(local24.anInt3659, local24.aBoolean161, local24.anInt3595, local24.anInt3623, local24.anInt3651);
											}
											if (local1592 != null) {
												local548 = local1592.anInt2986;
												local539 = local1592.anInt2992;
												if (local24.aBoolean162) {
													local904 = (local24.anInt3600 + local548 - 1) / local548;
													local913 = (local539 + local24.anInt3620 - 1) / local539;
													Static29.method412(local108, local103, local108 + local24.anInt3600, local24.anInt3620 + local103);
													for (local1051 = 0; local1051 < local904; local1051++) {
														for (local1056 = 0; local1056 < local913; local1056++) {
															if (local24.anInt3652 != 0) {
																local1592.method2421(local108 + local548 * local1051 + local548 / 2, local539 / 2 + local539 * local1056 + local103, 4096, local24.anInt3652);
															} else if (local111 == 0) {
																local1592.method2417(local1051 * local548 + local108, local103 + local539 * local1056);
															} else {
																local1592.method2425(local108 + local1051 * local548, local1056 * local539 + local103, 256 - (local111 & 0xFF));
															}
														}
													}
													Static29.method406(arg2, arg8, arg5, arg6);
												} else {
													local904 = local24.anInt3600 * 4096 / local548;
													if (local24.anInt3652 != 0) {
														local1592.method2421(local24.anInt3600 / 2 + local108, local24.anInt3620 / 2 + local103, local904, local24.anInt3652);
													} else if (local111 != 0) {
														local1592.method2428(local108, local103, local24.anInt3600, local24.anInt3620, 256 - (local111 & 0xFF));
													} else if (local24.anInt3600 == local548 && local24.anInt3620 == local539) {
														local1592.method2417(local108, local103);
													} else {
														local1592.method2420(local108, local103, local24.anInt3600, local24.anInt3620);
													}
												}
											} else if (Static142.aBoolean124) {
												Static66.method999(local24);
											}
										} else {
											local1592 = local24.method2896(Static31.method461(local24));
											if (local1592 != null) {
												local1592.method2417(local108, local103);
											} else if (Static142.aBoolean124) {
												Static66.method999(local24);
											}
										}
									} else {
										@Pc(1889) Class70 local1889;
										@Pc(2127) int local2127;
										if (local24.anInt3656 == 6) {
											@Pc(1865) boolean local1865 = Static31.method461(local24);
											@Pc(1867) Class20_Sub5 local1867 = null;
											local904 = 0;
											if (local1865) {
												local548 = local24.anInt3642;
											} else {
												local548 = local24.anInt3606;
											}
											if (local24.anInt3595 != -1) {
												local1889 = Static16.method227(local24.anInt3595);
												if (local1889 != null) {
													local1889 = local1889.method1946(local24.anInt3623);
													@Pc(1907) Class110 local1907 = local548 == -1 ? null : Static200.method3204(local548);
													local1867 = local1889.method1957(local1907, local24.anInt3636, 1);
													if (local1867 == null) {
														Static66.method999(local24);
													} else {
														local904 = -local1867.method3494() / 2;
													}
												}
											} else if (local24.anInt3615 == 5) {
												if (local24.anInt3632 == -1) {
													local1867 = Static16.aClass25_1.method764(-1, -1, null, null);
												} else {
													local913 = local24.anInt3632 & 0x7FF;
													if (local913 == Static20.anInt417) {
														local913 = 2047;
													}
													@Pc(2013) Class20_Sub3_Sub1 local2013 = Static232.aClass20_Sub3_Sub1Array1[local913];
													@Pc(2022) Class110 local2022 = local548 == -1 ? null : Static200.method3204(local548);
													if (local2013 != null && (int) local2013.aClass50_493.method1221() << 11 == (local24.anInt3632 & 0xFFFFF800)) {
														local1867 = local2013.aClass25_2.method764(0, local24.anInt3636, local2022, null);
													}
												}
											} else if (local548 == -1) {
												local1867 = local24.method2891(local1865, null, Static230.aClass20_Sub3_Sub1_3.aClass25_2, -1);
												if (local1867 == null && Static142.aBoolean124) {
													Static66.method999(local24);
												}
											} else {
												@Pc(1945) Class110 local1945 = Static200.method3204(local548);
												local1867 = local24.method2891(local1865, local1945, Static230.aClass20_Sub3_Sub1_3.aClass25_2, local24.anInt3636);
												if (local1867 == null && Static142.aBoolean124) {
													Static66.method999(local24);
												}
											}
											if (local1867 != null) {
												if (local24.anInt3604 <= 0) {
													local913 = 256;
												} else {
													local913 = (local24.anInt3600 << 8) / local24.anInt3604;
												}
												if (local24.anInt3664 > 0) {
													local1051 = (local24.anInt3620 << 8) / local24.anInt3664;
												} else {
													local1051 = 256;
												}
												local1056 = (local24.anInt3677 * local913 >> 8) + local108 + local24.anInt3600 / 2;
												local949 = local24.anInt3620 / 2 + local103 + (local1051 * local24.anInt3672 >> 8);
												Static215.method3369(local1056, local949);
												local2127 = local24.anInt3627 * Class120.anIntArray491[local24.anInt3607] >> 16;
												@Pc(2137) int local2137 = local24.anInt3627 * Class120.anIntArray492[local24.anInt3607] >> 16;
												if (!local24.aBoolean156) {
													local1867.method1694(local24.anInt3624, 0, local24.anInt3607, 0, local2127, local2137);
												} else if (local24.aBoolean159) {
													((Class20_Sub5_Sub1) local1867).method1711(local24.anInt3624, local24.anInt3674, local24.anInt3607, local24.anInt3612, local24.anInt3665 + local904 + local2127, local2137 - -local24.anInt3665, local24.anInt3627);
												} else {
													local1867.method1694(local24.anInt3624, local24.anInt3674, local24.anInt3607, local24.anInt3612, local24.anInt3665 + local904 + local2127, local24.anInt3665 + local2137);
												}
												Static215.method3359();
											}
										} else {
											if (local24.anInt3656 == 7) {
												local1419 = local24.method2906(Static208.aClass78Array7);
												if (local1419 == null) {
													if (Static142.aBoolean124) {
														Static66.method999(local24);
													}
													continue;
												}
												local548 = 0;
												for (local539 = 0; local539 < local24.anInt3640; local539++) {
													for (local904 = 0; local904 < local24.anInt3669; local904++) {
														if (local24.anIntArray392[local548] > 0) {
															local1889 = Static16.method227(local24.anIntArray392[local548] - 1);
															@Pc(2284) Class50 local2284;
															if (local1889.anInt2430 != 1 && local24.anIntArray401[local548] == 1) {
																local2284 = Static17.method257(new Class50[] { Static80.aClass50_529, local1889.aClass50_833, Static223.aClass50_1371 });
															} else {
																local2284 = Static17.method257(new Class50[] { Static80.aClass50_529, local1889.aClass50_833, Static24.aClass50_189, Static37.method608(local24.anIntArray401[local548]) });
															}
															local949 = (local24.anInt3641 + 12) * local539 + local103;
															local1056 = local108 + (local24.anInt3655 + 115) * local904;
															if (local24.anInt3616 == 0) {
																local1419.method1834(local2284, local1056, local949, local24.anInt3591, local24.aBoolean157 ? 0 : -1);
															} else if (local24.anInt3616 == 1) {
																local1419.method1826(local2284, local1056 + 57, local949, local24.anInt3591, local24.aBoolean157 ? 0 : -1);
															} else {
																local1419.method1820(local2284, local1056 + 115 - 1, local949, local24.anInt3591, local24.aBoolean157 ? 0 : -1);
															}
														}
														local548++;
													}
												}
											}
											if (local24.anInt3656 == 8 && local24 == Static146.aClass93_90 && Static54.anInt1079 == Static65.anInt4129) {
												local886 = 0;
												@Pc(2426) Class1_Sub1_Sub10 local2426 = Static130.aClass1_Sub1_Sub10_2;
												@Pc(2429) Class50 local2429 = local24.aClass50_1188;
												local548 = 0;
												local2429 = Static134.method2265(local2429, local24);
												@Pc(2452) Class50 local2452;
												while (local2429.method1249() > 0) {
													local1051 = local2429.method1257(Static234.aClass50_1438);
													if (local1051 == -1) {
														local2452 = local2429;
														local2429 = Static7.aClass50_69;
													} else {
														local2452 = local2429.method1216(local1051, 0);
														local2429 = local2429.method1244(local1051 + 4);
													}
													local1056 = local2426.method1810(local2452);
													local548 += local2426.anInt2264 + 1;
													if (local886 < local1056) {
														local886 = local1056;
													}
												}
												local548 += 7;
												local886 += 6;
												local1051 = local108 + local24.anInt3600 - local886 - 5;
												local1056 = local24.anInt3620 + local103 + 5;
												if (local548 + local1056 > arg6) {
													local1056 = arg6 - local548;
												}
												if (local108 + 5 > local1051) {
													local1051 = local108 + 5;
												}
												if (arg5 < local886 + local1051) {
													local1051 = arg5 - local886;
												}
												Static29.method423(local1051, local1056, local886, local548, 16777120);
												Static29.method411(local1051, local1056, local886, local548, 0);
												local949 = local1056 + local2426.anInt2264 + 2;
												local2429 = local24.aClass50_1188;
												local2429 = Static134.method2265(local2429, local24);
												while (local2429.method1249() > 0) {
													local2127 = local2429.method1257(Static234.aClass50_1438);
													if (local2127 == -1) {
														local2452 = local2429;
														local2429 = Static7.aClass50_69;
													} else {
														local2452 = local2429.method1216(local2127, 0);
														local2429 = local2429.method1244(local2127 + 4);
													}
													local2426.method1834(local2452, local1051 + 3, local949, 0, -1);
													local949 += local2426.anInt2264 + 1;
												}
											}
											if (local24.anInt3656 == 9) {
												if (local24.aBoolean154) {
													local904 = local103;
													local548 = local24.anInt3620 + local103;
													local539 = local108 + local24.anInt3600;
												} else {
													local539 = local24.anInt3600 + local108;
													local548 = local103;
													local904 = local24.anInt3620 + local103;
												}
												if (local24.anInt3675 == 1) {
													Static29.method404(local108, local548, local539, local904, local24.anInt3591);
												} else {
													Static29.method400(local108, local548, local539, local904, local24.anInt3591, local24.anInt3675);
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

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZZ)V")
	public static void method2963(@OriginalArg(0) boolean arg0) {
		for (@Pc(11) Class1_Sub16 local11 = (Class1_Sub16) Static198.aClass75_20.method2239(); local11 != null; local11 = (Class1_Sub16) Static198.aClass75_20.method2238()) {
			if (local11.aClass1_Sub12_Sub4_2 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(local11.aClass1_Sub12_Sub4_2);
				local11.aClass1_Sub12_Sub4_2 = null;
			}
			if (local11.aClass1_Sub12_Sub4_1 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(local11.aClass1_Sub12_Sub4_1);
				local11.aClass1_Sub12_Sub4_1 = null;
			}
			local11.method3525();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub16 local54 = (Class1_Sub16) Static158.aClass75_17.method2239(); local54 != null; local54 = (Class1_Sub16) Static158.aClass75_17.method2238()) {
			if (local54.aClass1_Sub12_Sub4_2 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(local54.aClass1_Sub12_Sub4_2);
				local54.aClass1_Sub12_Sub4_2 = null;
			}
			local54.method3525();
		}
		for (@Pc(81) Class1_Sub16 local81 = (Class1_Sub16) Static153.aClass90_16.method2823(); local81 != null; local81 = (Class1_Sub16) Static153.aClass90_16.method2821()) {
			if (local81.aClass1_Sub12_Sub4_2 != null) {
				Static226.aClass1_Sub12_Sub1_2.method894(local81.aClass1_Sub12_Sub4_2);
				local81.aClass1_Sub12_Sub4_2 = null;
			}
			local81.method3525();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!hh;ILclient!hh;ZILclient!hh;)V")
	public static void method2964(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class50 arg4) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static158.anIntArray349[local3] = Static158.anIntArray349[local3 - 1];
			Static187.aClass50Array73[local3] = Static187.aClass50Array73[local3 - 1];
			Static8.aClass50Array12[local3] = Static8.aClass50Array12[local3 - 1];
			Static132.aClass50Array52[local3] = Static132.aClass50Array52[local3 - 1];
			Static199.anIntArray462[local3] = Static199.anIntArray462[local3 - 1];
		}
		Static158.anIntArray349[0] = arg3;
		Static187.aClass50Array73[0] = arg2;
		Static199.anIntArray462[0] = arg1;
		Static8.aClass50Array12[0] = arg0;
		Static38.anInt832 = Static31.anInt594;
		Static68.anInt1303++;
		Static132.aClass50Array52[0] = arg4;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!pg;I)Lclient!j;")
	public static Class1_Sub3 method2965(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.method2142();
		@Pc(13) int local13 = arg0.method2142();
		@Pc(17) Class1_Sub3 local17 = Static95.method1493(local13);
		local17.anInt4405 = arg0.method2142();
		@Pc(26) int local26 = arg0.method2142();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method2142();
			local17.method3466(local34, arg0);
		}
		local17.method3474();
		return local17;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z")
	public static boolean method2967(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Lclient!qd;")
	public static Class91 method2968(@OriginalArg(1) int arg0) {
		@Pc(18) Class91 local18 = (Class91) Static10.aClass84_9.method2579((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static196.aClass86_74.method3325(Static98.method1550(arg0), Static115.method1852(arg0));
		local18 = new Class91();
		if (local32 != null) {
			local18.method2827(new Class1_Sub17(local32));
		}
		Static10.aClass84_9.method2582(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)V")
	public static void method2969() {
		for (@Pc(6) Class1_Sub13 local6 = (Class1_Sub13) Static157.aClass90_19.method2823(); local6 != null; local6 = (Class1_Sub13) Static157.aClass90_19.method2821()) {
			@Pc(11) int local11 = local6.anInt1588;
			if (Static1.method31(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class93[] local21 = Static54.aClass93ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean156;
						break;
					}
				}
				if (!local17) {
					@Pc(51) int local51 = (int) local6.aLong173;
					@Pc(55) Class93 local55 = Static164.method2725(local51);
					if (local55 != null) {
						Static66.method999(local55);
					}
				}
			}
		}
	}
}
