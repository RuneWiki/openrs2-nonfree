import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "Lclient!bc;")
	public static Class1 aClass1_25;

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "[I")
	public static final int[] anIntArray411 = new int[50];

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1254 = Static120.method1824(":assistreq:");

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	public static int anInt3182 = 0;

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1255 = Static120.method1824("sl_arrows");

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Lclient!af;")
	public static final Class5 aClass5_43 = new Class5(64);

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	public static int anInt3190 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!t;)V")
	public static void method2316(@OriginalArg(1) Class3_Sub22 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt3772 == 0) {
			local5 = Static11.method218(arg0.anInt3769, arg0.anInt3780, arg0.anInt3764);
		}
		if (arg0.anInt3772 == 1) {
			local5 = Static32.method3055(arg0.anInt3769, arg0.anInt3780, arg0.anInt3764);
		}
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		if (arg0.anInt3772 == 2) {
			local5 = Static56.method822(arg0.anInt3769, arg0.anInt3780, arg0.anInt3764);
		}
		if (arg0.anInt3772 == 3) {
			local5 = Static31.method496(arg0.anInt3769, arg0.anInt3780, arg0.anInt3764);
		}
		if (local5 != 0L) {
			local35 = (int) local5 >> 14 & 0x1F;
			local33 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local37 = (int) local5 >> 20 & 0x3;
		}
		arg0.anInt3774 = local33;
		arg0.anInt3766 = local37;
		arg0.anInt3767 = local35;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qf;ILclient!rd;)Lclient!rd;")
	private static Class80 method2317(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class80 arg1) {
		if (arg1.method2460(Static19.aClass80_145) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method2460(Static156.aClass80_1357);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method2460(Static174.aClass80_1511);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method2460(Static103.aClass80_877);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method2460(Static154.aClass80_1336);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method2460(Static52.aClass80_436);
											if (local13 == -1) {
												while (true) {
													local13 = arg1.method2460(Static23.aClass80_177);
													if (local13 == -1) {
														return arg1;
													}
													@Pc(227) Class80 local227 = Static185.aClass80_1637;
													if (Static163.aClass94_7 != null) {
														local227 = Static132.method2020(Static163.aClass94_7.anInt4474);
														try {
															if (Static163.aClass94_7.anObject3 != null) {
																@Pc(243) byte[] local243 = ((String) Static163.aClass94_7.anObject3).getBytes("ISO-8859-1");
																local227 = Static95.method2641(0, local243, local243.length);
															}
														} catch (@Pc(252) UnsupportedEncodingException local252) {
														}
													}
													arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), local227, arg1.method2449(local13 + 4) });
												}
											}
											arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), Static126.method1868(Static133.method2039(arg0, 4)), arg1.method2449(local13 + 2) });
										}
									}
									arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), Static126.method1868(Static133.method2039(arg0, 3)), arg1.method2449(local13 + 2) });
								}
							}
							arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), Static126.method1868(Static133.method2039(arg0, 2)), arg1.method2449(local13 + 2) });
						}
					}
					arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), Static126.method1868(Static133.method2039(arg0, 1)), arg1.method2449(local13 + 2) });
				}
			}
			arg1 = Static154.method2467(new Class80[] { arg1.method2464(0, local13), Static126.method1868(Static133.method2039(arg0, 0)), arg1.method2449(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII[Lclient!qf;II)V")
	public static void method2318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class77[] arg7, @OriginalArg(9) int arg8) {
		Static24.method2569(arg4, arg3, arg5, arg1);
		Static65.method964();
		for (@Pc(13) int local13 = 0; local13 < arg7.length; local13++) {
			@Pc(19) Class77 local19 = arg7[local13];
			if (local19 != null && (arg0 == local19.anInt3201 || arg0 == -1412584499 && local19 == Static64.aClass77_2)) {
				@Pc(42) int local42;
				if (arg6 == -1) {
					Static160.anIntArray444[Static60.anInt1321] = arg2 + local19.anInt3229;
					Static33.anIntArray99[Static60.anInt1321] = local19.anInt3259 + arg8;
					Static148.anIntArray427[Static60.anInt1321] = local19.anInt3251;
					Static130.anIntArray379[Static60.anInt1321] = local19.anInt3221;
					local42 = Static60.anInt1321++;
				} else {
					local42 = arg6;
				}
				local19.anInt3262 = local42;
				local19.anInt3228 = Static193.anInt4411;
				if (!local19.aBoolean127 || !Static75.method1107(local19)) {
					if (local19.anInt3256 > 0) {
						Static116.method3158(local19);
					}
					@Pc(105) int local105 = local19.anInt3229 + arg2;
					@Pc(111) int local111 = local19.anInt3259 + arg8;
					@Pc(114) int local114 = local19.anInt3204;
					@Pc(144) int local144;
					@Pc(155) int local155;
					if (Static64.aClass77_2 == local19) {
						if (arg0 != -1412584499 && !local19.aBoolean126) {
							Static150.anInt3388 = arg8;
							Static144.anInt3152 = arg2;
							Static157.aClass77Array2 = arg7;
							continue;
						}
						if (!local19.aBoolean126) {
							local114 = 128;
						}
						if (Static95.aBoolean148 && Static155.aBoolean142) {
							local144 = Static190.anInt4379;
							local144 -= Static132.anInt2830;
							if (local144 < Static148.anInt3315) {
								local144 = Static148.anInt3315;
							}
							local155 = Static3.anInt153;
							local155 -= Static100.anInt2097;
							if (local155 < Static46.anInt1057) {
								local155 = Static46.anInt1057;
							}
							if (Static46.anInt1057 + Static23.aClass77_1.anInt3221 < local155 - -local19.anInt3221) {
								local155 = Static23.aClass77_1.anInt3221 + Static46.anInt1057 - local19.anInt3221;
							}
							local111 = local155;
							if (Static148.anInt3315 + Static23.aClass77_1.anInt3251 < local19.anInt3251 + local144) {
								local144 = Static23.aClass77_1.anInt3251 + Static148.anInt3315 - local19.anInt3251;
							}
							local105 = local144;
						}
					}
					@Pc(288) int local288;
					@Pc(270) int local270;
					@Pc(220) int local220;
					@Pc(222) int local222;
					@Pc(232) int local232;
					@Pc(227) int local227;
					if (local19.anInt3206 == 2) {
						local270 = arg1;
						local288 = arg5;
						local155 = arg3;
						local144 = arg4;
					} else if (local19.anInt3206 == 9) {
						local220 = local105;
						local222 = local111;
						local227 = local111 + local19.anInt3221;
						local232 = local19.anInt3251 + local105;
						if (local105 > local232) {
							local220 = local232;
							local232 = local105;
						}
						local232++;
						if (local111 > local227) {
							local222 = local227;
							local227 = local111;
						}
						local227++;
						local144 = local220 > arg4 ? local220 : arg4;
						local270 = arg1 <= local227 ? arg1 : local227;
						local155 = local222 <= arg3 ? arg3 : local222;
						local288 = arg5 > local232 ? local232 : arg5;
					} else {
						local144 = arg4 < local105 ? local105 : arg4;
						local155 = arg3 >= local111 ? arg3 : local111;
						local220 = local105 + local19.anInt3251;
						local288 = local220 < arg5 ? local220 : arg5;
						local222 = local19.anInt3221 + local111;
						local270 = arg1 > local222 ? local222 : arg1;
					}
					if (!local19.aBoolean127 || local144 < local288 && local270 > local155) {
						if (local19.anInt3256 != 0) {
							if (local19.anInt3256 == 1337) {
								Static175.anInt3956 = local111;
								Static25.anInt576 = local105;
								Static166.method2680(local105, local111, local19.anInt3221, local19.anInt3251);
								Static24.method2569(arg4, arg3, arg5, arg1);
								continue;
							}
							if (local19.anInt3256 == 1338) {
								if (local19.method2323()) {
									Static194.method3136(local42, local19, local105, local111);
									Static24.method2569(arg4, arg3, arg5, arg1);
								}
								continue;
							}
							if (local19.anInt3256 == 1339) {
								if (local19.method2323()) {
									Static63.method920(local105, local19, local42, local111);
									Static24.method2569(arg4, arg3, arg5, arg1);
								}
								continue;
							}
						}
						local222 = Static3.anInt153;
						local220 = Static190.anInt4379;
						if (!Static148.aBoolean134 && local144 <= local220 && local222 >= local155 && local288 > local220 && local222 < local270) {
							Static109.method1693(local220 - local105, -local111 + local222, local19);
						}
						if (local19.anInt3206 == 0) {
							if (!local19.aBoolean127 && Static75.method1107(local19) && Static85.aClass77_5 != local19) {
								continue;
							}
							if (!local19.aBoolean127) {
								if (local19.anInt3249 - local19.anInt3221 < local19.anInt3213) {
									local19.anInt3213 = local19.anInt3249 - local19.anInt3221;
								}
								if (local19.anInt3213 < 0) {
									local19.anInt3213 = 0;
								}
							}
							method2318(local19.anInt3237, local270, local105 - local19.anInt3222, local155, local144, local288, local42, arg7, local111 - local19.anInt3213);
							if (local19.aClass77Array1 != null) {
								method2318(local19.anInt3237, local270, local105 - local19.anInt3222, local155, local144, local288, local42, local19.aClass77Array1, local111 - local19.anInt3213);
							}
							@Pc(562) Class3_Sub20 local562 = (Class3_Sub20) Static28.aClass54_4.method1496((long) local19.anInt3237);
							if (local562 != null) {
								if (local562.anInt2999 == 0 && Static190.anInt4379 >= local144 && local155 <= Static3.anInt153 && Static190.anInt4379 < local288 && local270 > Static3.anInt153 && !Static148.aBoolean134 && !Static106.aBoolean90) {
									Static173.anInt3892 = 1;
									Static160.aShortArray46[0] = 1005;
									Static148.aClass80Array25[0] = Static181.aClass80_1571;
									Static18.aClass80Array5[0] = Static185.aClass80_1637;
								}
								Static174.method2815(local155, local42, local105, local288, local144, local562.anInt2996, local111, local270);
							}
							Static24.method2569(arg4, arg3, arg5, arg1);
							Static65.method964();
						}
						if (Static62.aBooleanArray5[local42] || Static102.anInt2141 > 1) {
							if (local19.anInt3206 == 0 && !local19.aBoolean127 && local19.anInt3249 > local19.anInt3221) {
								Static93.method1423(local19.anInt3213, local19.anInt3249, local105 + local19.anInt3251, local19.anInt3221, local111);
							}
							if (local19.anInt3206 != 1) {
								@Pc(674) int local674;
								@Pc(687) int local687;
								@Pc(853) int local853;
								@Pc(731) int local731;
								@Pc(891) int local891;
								@Pc(893) int local893;
								@Pc(915) int local915;
								@Pc(696) int local696;
								@Pc(836) int local836;
								if (local19.anInt3206 == 2) {
									local232 = 0;
									for (local227 = 0; local227 < local19.anInt3221; local227++) {
										for (local674 = 0; local674 < local19.anInt3251; local674++) {
											local687 = local105 + (local19.anInt3263 + 32) * local674;
											local696 = local227 * (local19.anInt3264 + 32) + local111;
											if (local232 < 20) {
												local687 += local19.anIntArray420[local232];
												local696 += local19.anIntArray419[local232];
											}
											if (local19.anIntArray418[local232] > 0) {
												local731 = local19.anIntArray418[local232] - 1;
												if (local687 + 32 > arg4 && arg5 > local687 && arg3 < local696 + 32 && local696 < arg1 || Static158.aClass77_14 == local19 && local232 == Static153.anInt657) {
													@Pc(786) Class3_Sub1_Sub4_Sub4 local786;
													if (Static7.anInt221 == 1 && local232 == Static18.anInt461 && local19.anInt3237 == Static129.anInt2788) {
														local786 = Static163.method2632(local731, local19.anIntArray417[local232], 0, 2, false);
													} else {
														local786 = Static163.method2632(local731, local19.anIntArray417[local232], 3153952, 1, false);
													}
													if (local786 == null) {
														Static186.method3014(local19);
													} else if (local19 == Static158.aClass77_14 && local232 == Static153.anInt657) {
														local836 = Static190.anInt4379 - Static157.anInt3506;
														if (local836 < 5 && local836 > -5) {
															local836 = 0;
														}
														local853 = Static3.anInt153 - Static175.anInt3944;
														if (local853 < 5 && local853 > -5) {
															local853 = 0;
														}
														if (Static159.anInt3558 < 5) {
															local853 = 0;
															local836 = 0;
														}
														local786.method2582(local836 + local687, local696 - -local853, 128);
														if (arg0 != -1) {
															@Pc(889) Class77 local889 = arg7[arg0 & 0xFFFF];
															local891 = Static24.anInt3594;
															local893 = Static24.anInt3595;
															if (local891 > local853 + local696 && local889.anInt3213 > 0) {
																local915 = Static152.anInt3407 * (local891 - local696 - local853) / 3;
																if (local915 > Static152.anInt3407 * 10) {
																	local915 = Static152.anInt3407 * 10;
																}
																if (local889.anInt3213 < local915) {
																	local915 = local889.anInt3213;
																}
																Static175.anInt3944 += local915;
																local889.anInt3213 -= local915;
																Static186.method3014(local889);
															}
															if (local853 + local696 + 32 > local893 && local889.anInt3213 < local889.anInt3249 - local889.anInt3221) {
																local915 = Static152.anInt3407 * (local696 + local853 + 32 - local893) / 3;
																if (Static152.anInt3407 * 10 < local915) {
																	local915 = Static152.anInt3407 * 10;
																}
																if (local889.anInt3249 - local889.anInt3221 - local889.anInt3213 < local915) {
																	local915 = local889.anInt3249 - local889.anInt3213 - local889.anInt3221;
																}
																Static175.anInt3944 -= local915;
																local889.anInt3213 += local915;
																Static186.method3014(local889);
															}
														}
													} else if (local19 == Static68.aClass77_3 && Static190.anInt4383 == local232) {
														local786.method2582(local687, local696, 128);
													} else {
														local786.method2595(local687, local696);
													}
												}
											} else if (local19.anIntArray416 != null && local232 < 20) {
												@Pc(1043) Class3_Sub1_Sub4_Sub4 local1043 = local19.method2332(local232);
												if (local1043 != null) {
													local1043.method2595(local687, local696);
												} else if (Static192.aBoolean173) {
													Static186.method3014(local19);
												}
											}
											local232++;
										}
									}
								} else if (local19.anInt3206 == 3) {
									if (Static195.method3154(local19)) {
										local232 = local19.anInt3205;
										if (Static85.aClass77_5 == local19 && local19.anInt3214 != 0) {
											local232 = local19.anInt3214;
										}
									} else {
										local232 = local19.anInt3198;
										if (local19 == Static85.aClass77_5 && local19.anInt3199 != 0) {
											local232 = local19.anInt3199;
										}
									}
									if (local114 == 0) {
										if (local19.aBoolean124) {
											Static24.method2576(local105, local111, local19.anInt3251, local19.anInt3221, local232);
										} else {
											Static24.method2564(local105, local111, local19.anInt3251, local19.anInt3221, local232);
										}
									} else if (local19.aBoolean124) {
										Static24.method2575(local105, local111, local19.anInt3251, local19.anInt3221, local232, 256 - (local114 & 0xFF));
									} else {
										Static24.method2577(local105, local111, local19.anInt3251, local19.anInt3221, local232, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1186) Class3_Sub1_Sub4_Sub3_Sub1 local1186;
									if (local19.anInt3206 == 4) {
										local1186 = local19.method2334(Static44.aClass3_Sub1_Sub4_Sub1Array1);
										if (local1186 != null) {
											@Pc(1198) Class80 local1198 = local19.aClass80_1260;
											if (Static195.method3154(local19)) {
												local227 = local19.anInt3205;
												if (Static85.aClass77_5 == local19 && local19.anInt3214 != 0) {
													local227 = local19.anInt3214;
												}
												if (local19.aClass80_1262.method2462() > 0) {
													local1198 = local19.aClass80_1262;
												}
											} else {
												local227 = local19.anInt3198;
												if (Static85.aClass77_5 == local19 && local19.anInt3199 != 0) {
													local227 = local19.anInt3199;
												}
											}
											if (local19.aBoolean127 && local19.anInt3233 != -1) {
												@Pc(1255) Class3_Sub1_Sub2 local1255 = Static173.method2793(local19.anInt3233);
												local1198 = local1255.aClass80_116;
												if (local1198 == null) {
													local1198 = Static139.aClass80_1170;
												}
												if ((local1255.anInt389 == 1 || local19.anInt3245 != 1) && local19.anInt3245 != -1) {
													local1198 = Static154.method2467(new Class80[] { Static190.aClass80_1700, local1198, Static1.aClass80_7, Static41.method625(local19.anInt3245) });
												}
											}
											if (Static83.aClass77_4 == local19) {
												local1198 = Static27.aClass80_1731;
												local227 = local19.anInt3198;
											}
											if (!local19.aBoolean127) {
												local1198 = method2317(local19, local1198);
											}
											local1186.method2247(local1198, local105, local111, local19.anInt3251, local19.anInt3221, local227, local19.aBoolean128 ? 0 : -1, local19.anInt3257, local19.anInt3255, local19.anInt3231);
										} else if (Static192.aBoolean173) {
											Static186.method3014(local19);
										}
									} else if (local19.anInt3206 == 5) {
										@Pc(1370) Class3_Sub1_Sub4_Sub4 local1370;
										if (local19.aBoolean127) {
											if (local19.anInt3233 == -1) {
												local1370 = local19.method2327(false);
											} else {
												local1370 = Static163.method2632(local19.anInt3233, local19.anInt3245, local19.anInt3217, local19.anInt3234, false);
											}
											if (local1370 != null) {
												local227 = local1370.anInt3603;
												local674 = local1370.anInt3598;
												if (local19.aBoolean125) {
													Static24.method2570(local105, local111, local19.anInt3251 + local105, local111 + local19.anInt3221);
													local696 = (local674 + local19.anInt3221 - 1) / local674;
													local687 = (local227 + local19.anInt3251 - 1) / local227;
													for (local836 = 0; local836 < local687; local836++) {
														for (local853 = 0; local853 < local696; local853++) {
															if (local19.anInt3203 != 0) {
																local1370.method2601(local227 * local836 + local105 + local227 / 2, local674 * local853 + local111 - -(local674 / 2), local19.anInt3203, 4096);
															} else if (local114 == 0) {
																local1370.method2595(local105 + local227 * local836, local853 * local674 + local111);
															} else {
																local1370.method2582(local227 * local836 + local105, local111 + local674 * local853, 256 - (local114 & 0xFF));
															}
														}
													}
													Static24.method2569(arg4, arg3, arg5, arg1);
												} else {
													local687 = local19.anInt3251 * 4096 / local227;
													if (local19.anInt3203 != 0) {
														local1370.method2601(local19.anInt3251 / 2 + local105, local19.anInt3221 / 2 + local111, local19.anInt3203, local687);
													} else if (local114 != 0) {
														local1370.method2594(local105, local111, local19.anInt3251, local19.anInt3221, 256 - (local114 & 0xFF));
													} else if (local19.anInt3251 == local227 && local674 == local19.anInt3221) {
														local1370.method2595(local105, local111);
													} else {
														local1370.method2580(local105, local111, local19.anInt3251, local19.anInt3221);
													}
												}
											} else if (Static192.aBoolean173) {
												Static186.method3014(local19);
											}
										} else {
											local1370 = local19.method2327(Static195.method3154(local19));
											if (local1370 != null) {
												local1370.method2595(local105, local111);
											} else if (Static192.aBoolean173) {
												Static186.method3014(local19);
											}
										}
									} else {
										@Pc(1650) Class3_Sub1_Sub2 local1650;
										if (local19.anInt3206 == 6) {
											@Pc(1625) boolean local1625 = Static195.method3154(local19);
											if (local1625) {
												local227 = local19.anInt3192;
											} else {
												local227 = local19.anInt3250;
											}
											@Pc(1637) Class3_Sub1_Sub5_Sub3 local1637 = null;
											local687 = 0;
											if (local19.anInt3233 != -1) {
												local1650 = Static173.method2793(local19.anInt3233);
												if (local1650 != null) {
													local1650 = local1650.method271(local19.anInt3245);
													local1637 = local1650.method262(null, 1, 0);
													if (local1637 == null) {
														Static186.method3014(local19);
													} else {
														local1637.method1385();
														local687 = -local1637.aShort34 / 2;
													}
												}
											} else if (local19.anInt3212 == 5) {
												if (local19.anInt3253 == -1) {
													local1637 = Static171.aClass55_1.method1532(-1, null, -1, null);
												} else {
													local696 = local19.anInt3253 & 0x7FF;
													if (local696 == Static30.anInt4494) {
														local696 = 2047;
													}
													@Pc(1710) Class3_Sub1_Sub5_Sub4_Sub2 local1710 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local696];
													@Pc(1720) Class3_Sub1_Sub15 local1720 = local227 == -1 ? null : Static148.method2368(local227);
													if (local1710 != null && (int) local1710.aClass80_1689.method2441() << 11 == (local19.anInt3253 & 0xFFFFF800)) {
														local1637 = local1710.aClass55_2.method1532(local19.anInt3211, null, 0, local1720);
													}
												}
											} else if (local227 == -1) {
												local1637 = local19.method2326(-1, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass55_2, local1625, null);
												if (local1637 == null && Static192.aBoolean173) {
													Static186.method3014(local19);
												}
											} else {
												@Pc(1766) Class3_Sub1_Sub15 local1766 = Static148.method2368(local227);
												local1637 = local19.method2326(local19.anInt3211, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass55_2, local1625, local1766);
												if (local1637 == null && Static192.aBoolean173) {
													Static186.method3014(local19);
												}
											}
											if (local1637 != null) {
												Static65.method958(local19.anInt3252 + local19.anInt3251 / 2 + local105, local111 - -(local19.anInt3221 / 2) + local19.anInt3238);
												local836 = local19.anInt3242 * Class3_Sub1_Sub4_Sub2.anIntArray190[local19.anInt3232] >> 16;
												local696 = Class3_Sub1_Sub4_Sub2.anIntArray188[local19.anInt3232] * local19.anInt3242 >> 16;
												if (!local19.aBoolean127) {
													local1637.method1382(local19.anInt3225, 0, local19.anInt3232, 0, local696, local836);
												} else if (local19.aBoolean131) {
													local1637.method1372(local19.anInt3225, local19.anInt3200, local19.anInt3232, local19.anInt3194, local19.anInt3244 + local696 + local687, local19.anInt3244 + local836, local19.anInt3242);
												} else {
													local1637.method1382(local19.anInt3225, local19.anInt3200, local19.anInt3232, local19.anInt3194, local19.anInt3244 + local696 + local687, local836 - -local19.anInt3244);
												}
												Static65.method970();
											}
										} else {
											if (local19.anInt3206 == 7) {
												local1186 = local19.method2334(Static44.aClass3_Sub1_Sub4_Sub1Array1);
												if (local1186 == null) {
													if (Static192.aBoolean173) {
														Static186.method3014(local19);
													}
													continue;
												}
												local227 = 0;
												for (local674 = 0; local674 < local19.anInt3221; local674++) {
													for (local687 = 0; local687 < local19.anInt3251; local687++) {
														if (local19.anIntArray418[local227] > 0) {
															local1650 = Static173.method2793(local19.anIntArray418[local227] - 1);
															@Pc(1994) Class80 local1994;
															if (local1650.anInt389 != 1 && local19.anIntArray417[local227] == 1) {
																local1994 = Static154.method2467(new Class80[] { Static190.aClass80_1700, local1650.aClass80_116, Static132.aClass80_1122 });
															} else {
																local1994 = Static154.method2467(new Class80[] { Static190.aClass80_1700, local1650.aClass80_116, Static1.aClass80_7, Static41.method625(local19.anIntArray417[local227]) });
															}
															local731 = (local19.anInt3264 + 12) * local674 + local111;
															local853 = local687 * (local19.anInt3263 + 115) + local105;
															if (local19.anInt3257 == 0) {
																local1186.method2264(local1994, local853, local731, local19.anInt3198, local19.aBoolean128 ? 0 : -1);
															} else if (local19.anInt3257 == 1) {
																local1186.method2273(local1994, local19.anInt3251 / 2 + local853, local731, local19.anInt3198, local19.aBoolean128 ? 0 : -1);
															} else {
																local1186.method2249(local1994, local19.anInt3251 + local853 - 1, local731, local19.anInt3198, local19.aBoolean128 ? 0 : -1);
															}
														}
														local227++;
													}
												}
											}
											@Pc(2295) int local2295;
											if (local19.anInt3206 == 8 && local19 == Static93.aClass77_7 && Static168.anInt3768 == Static50.anInt1092) {
												local232 = 0;
												@Pc(2143) Class3_Sub1_Sub4_Sub3_Sub1 local2143 = Static134.aClass3_Sub1_Sub4_Sub3_Sub1_7;
												@Pc(2146) Class80 local2146 = local19.aClass80_1260;
												local2146 = method2317(local19, local2146);
												local227 = 0;
												@Pc(2171) Class80 local2171;
												while (local2146.method2462() > 0) {
													local836 = local2146.method2460(Static104.aClass80_887);
													if (local836 == -1) {
														local2171 = local2146;
														local2146 = Static185.aClass80_1637;
													} else {
														local2171 = local2146.method2464(0, local836);
														local2146 = local2146.method2449(local836 + 4);
													}
													local853 = local2143.method2269(local2171);
													if (local853 > local232) {
														local232 = local853;
													}
													local227 += local2143.anInt3104 + 1;
												}
												local227 += 7;
												local232 += 6;
												local836 = local19.anInt3251 + local105 - local232 - 5;
												if (local836 < local105 + 5) {
													local836 = local105 + 5;
												}
												if (local232 + local836 > arg5) {
													local836 = arg5 - local232;
												}
												local853 = local111 + local19.anInt3221 + 5;
												if (arg1 < local227 + local853) {
													local853 = arg1 - local227;
												}
												Static24.method2576(local836, local853, local232, local227, 16777120);
												Static24.method2564(local836, local853, local232, local227, 0);
												local731 = local853 + local2143.anInt3104 + 2;
												local2146 = local19.aClass80_1260;
												local2146 = method2317(local19, local2146);
												while (local2146.method2462() > 0) {
													local2295 = local2146.method2460(Static104.aClass80_887);
													if (local2295 == -1) {
														local2171 = local2146;
														local2146 = Static185.aClass80_1637;
													} else {
														local2171 = local2146.method2464(0, local2295);
														local2146 = local2146.method2449(local2295 + 4);
													}
													local2143.method2264(local2171, local836 + 3, local731, 0, -1);
													local731 += local2143.anInt3104 + 1;
												}
											}
											if (local19.anInt3206 == 9) {
												if (local19.anInt3236 == 1) {
													Static24.method2568(local105, local111, local19.anInt3251 + local105, local111 + local19.anInt3221, local19.anInt3198);
												} else {
													local232 = local19.anInt3251 >= 0 ? local19.anInt3251 : -local19.anInt3251;
													local227 = local19.anInt3221 >= 0 ? local19.anInt3221 : -local19.anInt3221;
													local674 = local232;
													if (local232 < local227) {
														local674 = local227;
													}
													if (local674 != 0) {
														local687 = (local19.anInt3251 << 16) / local674;
														local696 = (local19.anInt3221 << 16) / local674;
														if (local687 >= local696) {
															local687 = -local687;
														} else {
															local696 = -local696;
														}
														local836 = local696 * local19.anInt3236 >> 17;
														local731 = local687 * local19.anInt3236 >> 17;
														local853 = local19.anInt3236 * local696 + 1 >> 17;
														local2295 = local19.anInt3236 * local687 + 1 >> 17;
														@Pc(2452) int local2452 = local105 - arg4;
														local891 = local111 - arg3;
														local893 = local836 + local2452;
														local915 = local2452 - local853;
														@Pc(2474) int local2474 = local2452 + local19.anInt3251 - local853;
														@Pc(2478) int local2478 = local731 + local891;
														@Pc(2486) int local2486 = local19.anInt3251 + local2452 + local836;
														@Pc(2491) int local2491 = local891 - local2295;
														@Pc(2499) int local2499 = local19.anInt3221 + local891 - local2295;
														@Pc(2506) int local2506 = local19.anInt3221 + local891 + local731;
														Static65.method972(local893, local915, local2474);
														Static65.method971(local2478, local2491, local2499, local893, local915, local2474, local19.anInt3198);
														Static65.method972(local893, local2474, local2486);
														Static65.method971(local2478, local2499, local2506, local893, local2474, local2486, local19.anInt3198);
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

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1 method2319() {
		@Pc(15) Class3_Sub1_Sub4_Sub1 local15 = new Class3_Sub1_Sub4_Sub1();
		local15.anInt817 = Static49.anIntArray152[0];
		local15.anInt818 = Static27.anIntArray523[0];
		local15.anInt821 = Static17.anIntArray64[0];
		local15.anInt822 = Static175.anInt3951;
		local15.anIntArray108 = Static101.anIntArray288;
		local15.anInt820 = Static147.anInt3287;
		local15.aByteArray2 = Static167.aByteArrayArray10[0];
		local15.anInt819 = Static86.anIntArray220[0];
		Static164.method2645();
		return local15;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!a;Lclient!lb;B)V")
	public static void method2320(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) Class53 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class70 local9 = Static118.aClass70_14;
		synchronized (Static118.aClass70_14) {
			for (@Pc(16) Class3_Sub12 local16 = (Class3_Sub12) Static118.aClass70_14.method1953(); local16 != null; local16 = (Class3_Sub12) Static118.aClass70_14.method1948()) {
				if (local16.aLong154 == (long) arg0 && arg2 == local16.aClass53_3 && local16.anInt1546 == 0) {
					local7 = local16.aByteArray12;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg2.method1488(arg0);
			arg1.method67(arg0, local71, arg2, true);
		} else {
			arg1.method67(arg0, local7, arg2, true);
		}
	}
}
