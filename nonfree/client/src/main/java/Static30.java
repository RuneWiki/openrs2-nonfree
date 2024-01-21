import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt908;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	public static int anInt911;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!uc;")
	public static Class1_Sub4_Sub4 aClass1_Sub4_Sub4_2;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!id;")
	private static Class34 aClass34_446 = Static9.method266("Cancel");

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array5 = new Class34[100];

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	public static int anInt913 = 0;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
	public static int[] anIntArray89 = new int[5];

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "[I")
	public static int[] anIntArray90 = new int[50];

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!id;")
	public static Class34 aClass34_447 = aClass34_446;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_448 = Static9.method266("blinken3:");

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_449 = Static9.method266("<col=00ff00>");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method557() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static71.anInt1876 - 1; local17++) {
				if (Static78.anIntArray245[local17] < 1000 && Static78.anIntArray245[local17 + 1] > 1000) {
					local11 = false;
					@Pc(39) Class34 local39 = Static71.aClass34Array16[local17];
					Static71.aClass34Array16[local17] = Static71.aClass34Array16[local17 + 1];
					Static71.aClass34Array16[local17 + 1] = local39;
					@Pc(57) Class34 local57 = Static59.aClass34Array12[local17];
					Static59.aClass34Array12[local17] = Static59.aClass34Array12[local17 + 1];
					Static59.aClass34Array12[local17 + 1] = local57;
					@Pc(75) int local75 = Static78.anIntArray245[local17];
					Static78.anIntArray245[local17] = Static78.anIntArray245[local17 + 1];
					Static78.anIntArray245[local17 + 1] = local75;
					@Pc(93) int local93 = Static51.anIntArray155[local17];
					Static51.anIntArray155[local17] = Static51.anIntArray155[local17 + 1];
					Static51.anIntArray155[local17 + 1] = local93;
					@Pc(111) int local111 = Static62.anIntArray178[local17];
					Static62.anIntArray178[local17] = Static62.anIntArray178[local17 + 1];
					Static62.anIntArray178[local17 + 1] = local111;
					@Pc(129) int local129 = Static126.anIntArray368[local17];
					Static126.anIntArray368[local17] = Static126.anIntArray368[local17 + 1];
					Static126.anIntArray368[local17 + 1] = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ie;Lclient!ie;ZI)V")
	public static void method558(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) boolean arg2) {
		Static86.aClass35_23 = arg1;
		Static80.aClass35_22 = arg0;
		Static23.aBoolean40 = arg2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIILclient!ie;II)V")
	public static void method559(@OriginalArg(3) int arg0, @OriginalArg(4) Class35 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static21.anInt756 = arg2;
		Static37.anInt1103 = arg0;
		Static76.aBoolean109 = false;
		Static93.anInt2429 = 1;
		Static98.aClass35_25 = arg1;
		Static76.anInt2063 = 2;
		Static12.anInt540 = arg3;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILclient!id;)V")
	public static void method560(@OriginalArg(1) int arg0, @OriginalArg(2) Class34 arg1) {
		Static21.aClass1_Sub19_Sub1_1.method2105(9);
		Static21.aClass1_Sub19_Sub1_1.method2073(arg1.method965());
		Static21.aClass1_Sub19_Sub1_1.method2070(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)I")
	public static int method561() {
		@Pc(14) int local14 = Static45.method1845(Static42.anInt1208, Static109.anInt3091, Static119.anInt2839);
		return local14 - Static88.anInt2285 >= 800 || (Static105.aByteArrayArrayArray9[Static42.anInt1208][Static119.anInt2839 >> 7][Static109.anInt3091 >> 7] & 0x4) == 0 ? 3 : Static42.anInt1208;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[Lclient!fd;IIIIIIII)V")
	public static void method562(@OriginalArg(1) Class1_Sub9[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static111.method1753(arg5, arg1, arg3, arg6);
		Static108.method1775();
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(24) Class1_Sub9 local24 = arg0[local18];
			if (local24 != null && (local24.anInt1062 == arg2 || arg2 == -1412584499 && local24 == Static129.aClass1_Sub9_15)) {
				@Pc(75) int local75;
				if (arg8 == -1) {
					Static17.anIntArray64[Static76.anInt2054] = arg4 + local24.anInt1066;
					Static12.anIntArray39[Static76.anInt2054] = local24.anInt1085 + arg7;
					Static34.anIntArray99[Static76.anInt2054] = local24.anInt1067;
					Static32.anIntArray151[Static76.anInt2054] = local24.anInt1053;
					local75 = Static76.anInt2054++;
				} else {
					local75 = arg8;
				}
				local24.anInt1051 = Static73.anInt1947;
				local24.anInt1061 = local75;
				if (!local24.aBoolean57 || !Static41.method698(local24)) {
					if (local24.anInt1030 > 0) {
						Static64.method1105(local24);
					}
					@Pc(104) int local104 = local24.anInt1066 + arg4;
					@Pc(110) int local110 = local24.anInt1085 + arg7;
					@Pc(113) int local113 = local24.anInt1031;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (Static129.aClass1_Sub9_15 == local24) {
						if (arg2 != -1412584499 && !local24.aBoolean61) {
							Static34.anInt995 = arg4;
							Static10.anInt485 = arg7;
							Static35.aClass1_Sub9Array1 = arg0;
							continue;
						}
						if (!local24.aBoolean61) {
							local113 = 128;
						}
						if (Static46.aBoolean77 && Static112.aBoolean152) {
							local141 = Static39.anInt1143;
							local143 = Static19.anInt658;
							local143 -= Static6.anInt393;
							if (local143 < Static76.anInt2064) {
								local143 = Static76.anInt2064;
							}
							local141 -= Static47.anInt1347;
							if (Static7.anInt425 > local141) {
								local141 = Static7.anInt425;
							}
							if (Static76.anInt2064 + Static69.aClass1_Sub9_10.anInt1053 < local143 + local24.anInt1053) {
								local143 = Static69.aClass1_Sub9_10.anInt1053 + Static76.anInt2064 - local24.anInt1053;
							}
							local110 = local143;
							if (Static69.aClass1_Sub9_10.anInt1067 + Static7.anInt425 < local24.anInt1067 + local141) {
								local141 = Static69.aClass1_Sub9_10.anInt1067 + Static7.anInt425 - local24.anInt1067;
							}
							local104 = local141;
						}
					}
					@Pc(219) int local219;
					@Pc(221) int local221;
					@Pc(231) int local231;
					@Pc(238) int local238;
					@Pc(236) int local236;
					@Pc(268) int local268;
					if (local24.anInt1013 == 2) {
						local143 = arg1;
						local219 = arg3;
						local221 = arg6;
						local141 = arg5;
					} else if (local24.anInt1013 == 9) {
						local231 = local104;
						local236 = local104 + local24.anInt1067;
						local238 = local110;
						if (local236 < local104) {
							local231 = local236;
							local236 = local104;
						}
						local141 = arg5 < local231 ? local231 : arg5;
						local236++;
						local268 = local110 + local24.anInt1053;
						if (local268 < local110) {
							local238 = local268;
							local268 = local110;
						}
						local219 = arg3 <= local236 ? arg3 : local236;
						local268++;
						local143 = arg1 < local238 ? local238 : arg1;
						local221 = arg6 <= local268 ? arg6 : local268;
					} else {
						local141 = arg5 >= local104 ? arg5 : local104;
						local143 = arg1 < local110 ? local110 : arg1;
						local238 = local110 + local24.anInt1053;
						local221 = arg6 <= local238 ? arg6 : local238;
						local231 = local24.anInt1067 + local104;
						local219 = arg3 <= local231 ? arg3 : local231;
					}
					if (!local24.aBoolean57 || local219 > local141 && local143 < local221) {
						if (local24.anInt1030 != 0) {
							if (local24.anInt1030 == 1337) {
								Static67.anInt1768 = local110;
								Static46.anInt1323 = local104;
								Static105.method1719(local110, local24.anInt1067, local24.anInt1053, local104);
								Static111.method1753(arg5, arg1, arg3, arg6);
								continue;
							}
							if (local24.anInt1030 == 1338) {
								Static17.method387(local75, local110, local104);
								Static111.method1753(arg5, arg1, arg3, arg6);
								continue;
							}
						}
						local231 = Static39.anInt1143;
						local238 = Static19.anInt658;
						if (!Static115.aBoolean158 && local231 >= local141 && local143 <= local238 && local231 < local219 && local221 > local238) {
							Static78.method1369(local24, local231 - local104, local238 + -local110);
						}
						if (local24.anInt1013 == 0) {
							if (!local24.aBoolean57 && Static41.method698(local24) && Static61.aClass1_Sub9_9 != local24) {
								continue;
							}
							if (!local24.aBoolean57) {
								if (local24.anInt1084 - local24.anInt1053 < local24.anInt1064) {
									local24.anInt1064 = local24.anInt1084 - local24.anInt1053;
								}
								if (local24.anInt1064 < 0) {
									local24.anInt1064 = 0;
								}
							}
							method562(arg0, local143, local24.anInt1050, local219, local104 - local24.anInt1046, local141, local221, local110 - local24.anInt1064, local75);
							if (local24.aClass1_Sub9Array2 != null) {
								method562(local24.aClass1_Sub9Array2, local143, local24.anInt1050, local219, local104 - local24.anInt1046, local141, local221, local110 - local24.anInt1064, local75);
							}
							@Pc(544) Class1_Sub16 local544 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local24.anInt1050);
							if (local544 != null) {
								if (local544.anInt1897 == 0 && local141 <= Static39.anInt1143 && Static19.anInt658 >= local143 && Static39.anInt1143 < local219 && Static19.anInt658 < local221 && !Static115.aBoolean158 && !Static36.aBoolean60) {
									Static59.aClass34Array12[0] = aClass34_447;
									Static71.aClass34Array16[0] = Static81.aClass34_1058;
									Static78.anIntArray245[0] = 1006;
									Static71.anInt1876 = 1;
								}
								Static13.method342(local104, local221, local75, local143, local544.anInt1893, local110, local219, local141);
							}
							Static111.method1753(arg5, arg1, arg3, arg6);
							Static108.method1775();
						}
						if (Static29.aBooleanArray6[local75] || Static59.anInt1635 > 1) {
							if (local24.anInt1013 == 0 && !local24.aBoolean57 && local24.anInt1053 < local24.anInt1084) {
								Static57.method1022(local24.anInt1053, local110, local24.anInt1084, local24.anInt1067 + local104, local24.anInt1064);
							}
							if (local24.anInt1013 != 1) {
								@Pc(653) int local653;
								@Pc(664) int local664;
								@Pc(846) int local846;
								@Pc(734) int local734;
								@Pc(904) int local904;
								@Pc(674) int local674;
								@Pc(833) int local833;
								if (local24.anInt1013 == 2) {
									local236 = 0;
									for (local268 = 0; local268 < local24.anInt1053; local268++) {
										for (local653 = 0; local653 < local24.anInt1067; local653++) {
											local664 = (local24.anInt1070 + 32) * local653 + local104;
											local674 = local110 + local268 * (local24.anInt1079 + 32);
											if (local236 < 20) {
												local664 += local24.anIntArray110[local236];
												local674 += local24.anIntArray101[local236];
											}
											if (local24.anIntArray108[local236] > 0) {
												local734 = local24.anIntArray108[local236] - 1;
												if (arg5 < local664 + 32 && arg3 > local664 && local674 + 32 > arg1 && local674 < arg6 || Static23.aClass1_Sub9_6 == local24 && Static55.anInt1554 == local236) {
													@Pc(799) Class1_Sub1_Sub2_Sub1 local799;
													if (Static130.anInt1509 == 1 && local236 == Static22.anInt779 && local24.anInt1050 == Static94.anInt2436) {
														local799 = Static28.method2006(local734, 2, false, 0, local24.anIntArray104[local236]);
													} else {
														local799 = Static28.method2006(local734, 1, false, 3153952, local24.anIntArray104[local236]);
													}
													if (local799 == null) {
														Static10.method277(local24);
													} else if (Static23.aClass1_Sub9_6 == local24 && local236 == Static55.anInt1554) {
														local833 = Static39.anInt1143 - Static45.anInt2766;
														if (local833 < 5 && local833 > -5) {
															local833 = 0;
														}
														local846 = Static19.anInt658 - Static26.anInt849;
														if (local846 < 5 && local846 > -5) {
															local846 = 0;
														}
														if (Static67.anInt1765 < 5) {
															local833 = 0;
															local846 = 0;
														}
														local799.method190(local664 + local833, local846 + local674, 128);
														if (arg2 != -1) {
															@Pc(884) Class1_Sub9 local884 = arg0[arg2 & 0xFFFF];
															if (local846 + local674 < Static111.anInt2641 && local884.anInt1064 > 0) {
																local904 = (Static111.anInt2641 - local846 - local674) * Static67.anInt1767 / 3;
																if (local904 > Static67.anInt1767 * 10) {
																	local904 = Static67.anInt1767 * 10;
																}
																if (local904 > local884.anInt1064) {
																	local904 = local884.anInt1064;
																}
																local884.anInt1064 -= local904;
																Static26.anInt849 += local904;
																Static10.method277(local884);
															}
															if (local674 + local846 + 32 > Static111.anInt2640 && local884.anInt1084 - local884.anInt1053 > local884.anInt1064) {
																local904 = (local674 + local846 + 32 - Static111.anInt2640) * Static67.anInt1767 / 3;
																if (local904 > Static67.anInt1767 * 10) {
																	local904 = Static67.anInt1767 * 10;
																}
																if (local904 > local884.anInt1084 - local884.anInt1064 - local884.anInt1053) {
																	local904 = local884.anInt1084 - local884.anInt1064 - local884.anInt1053;
																}
																local884.anInt1064 += local904;
																Static26.anInt849 -= local904;
																Static10.method277(local884);
															}
														}
													} else if (Static132.aClass1_Sub9_16 == local24 && local236 == Static21.anInt769) {
														local799.method190(local664, local674, 128);
													} else {
														local799.method182(local664, local674);
													}
												}
											} else if (local24.anIntArray102 != null && local236 < 20) {
												@Pc(712) Class1_Sub1_Sub2_Sub1 local712 = local24.method650(local236);
												if (local712 != null) {
													local712.method182(local664, local674);
												} else if (Static58.aBoolean88) {
													Static10.method277(local24);
												}
											}
											local236++;
										}
									}
								} else if (local24.anInt1013 == 3) {
									if (Static34.method626(local24)) {
										local236 = local24.anInt1055;
										if (local24 == Static61.aClass1_Sub9_9 && local24.anInt1018 != 0) {
											local236 = local24.anInt1018;
										}
									} else {
										local236 = local24.anInt1034;
										if (local24 == Static61.aClass1_Sub9_9 && local24.anInt1033 != 0) {
											local236 = local24.anInt1033;
										}
									}
									if (local113 == 0) {
										if (local24.aBoolean51) {
											Static111.method1747(local104, local110, local24.anInt1067, local24.anInt1053, local236);
										} else {
											Static111.method1751(local104, local110, local24.anInt1067, local24.anInt1053, local236);
										}
									} else if (local24.aBoolean51) {
										Static111.method1759(local104, local110, local24.anInt1067, local24.anInt1053, local236, 256 - (local113 & 0xFF));
									} else {
										Static111.method1763(local104, local110, local24.anInt1067, local24.anInt1053, local236, 256 - (local113 & 0xFF));
									}
								} else {
									@Pc(1160) Class1_Sub1_Sub2_Sub3_Sub1 local1160;
									if (local24.anInt1013 == 4) {
										local1160 = local24.method643();
										if (local1160 != null) {
											@Pc(1174) Class34 local1174 = local24.aClass34_492;
											if (Static34.method626(local24)) {
												local268 = local24.anInt1055;
												if (local24 == Static61.aClass1_Sub9_9 && local24.anInt1018 != 0) {
													local268 = local24.anInt1018;
												}
												if (local24.aClass34_491.method982() > 0) {
													local1174 = local24.aClass34_491;
												}
											} else {
												local268 = local24.anInt1034;
												if (Static61.aClass1_Sub9_9 == local24 && local24.anInt1033 != 0) {
													local268 = local24.anInt1033;
												}
											}
											if (local24.aBoolean57 && local24.anInt1024 != -1) {
												@Pc(1224) Class1_Sub1_Sub8 local1224 = Static74.method1334(local24.anInt1024);
												local1174 = local1224.aClass34_1002;
												if (local1174 == null) {
													local1174 = Static37.aClass34_510;
												}
												if ((local1224.anInt2012 == 1 || local24.anInt1075 != 1) && local24.anInt1075 != -1) {
													local1174 = Static91.method1554(new Class34[] { Static112.aClass34_1353, local1174, Static109.aClass34_1574, Static42.method717(local24.anInt1075) });
												}
											}
											if (local24 == Static105.aClass1_Sub9_13) {
												local1174 = Static123.aClass34_1502;
												local268 = local24.anInt1034;
											}
											if (!local24.aBoolean57) {
												local1174 = Static99.method1661(local24, local1174);
											}
											local1160.method845(local1174, local104, local110, local24.anInt1067, local24.anInt1053, local268, local24.aBoolean54 ? 0 : -1, local24.anInt1063, local24.anInt1060, local24.anInt1041);
										} else if (Static58.aBoolean88) {
											Static10.method277(local24);
										}
									} else if (local24.anInt1013 == 5) {
										@Pc(1334) Class1_Sub1_Sub2_Sub1 local1334;
										if (local24.aBoolean57) {
											if (local24.anInt1024 == -1) {
												local1334 = local24.method648(false);
											} else {
												local1334 = Static28.method2006(local24.anInt1024, local24.anInt1037, false, local24.anInt1032, local24.anInt1075);
											}
											if (local1334 != null) {
												local268 = local1334.anInt333;
												local653 = local1334.anInt337;
												if (local24.aBoolean62) {
													Static111.method1762(local104, local110, local24.anInt1067 + local104, local110 - -local24.anInt1053);
													local674 = (local24.anInt1053 + local653 - 1) / local653;
													local664 = (local24.anInt1067 + local268 - 1) / local268;
													for (local833 = 0; local833 < local664; local833++) {
														for (local846 = 0; local846 < local674; local846++) {
															if (local24.anInt1065 != 0) {
																local1334.method181(local104 + local268 * local833 + local268 / 2, local110 + local846 * local653 + local653 / 2, local24.anInt1065, 4096);
															} else if (local113 == 0) {
																local1334.method182(local833 * local268 + local104, local653 * local846 + local110);
															} else {
																local1334.method190(local104 + local833 * local268, local110 + local846 * local653, 256 - (local113 & 0xFF));
															}
														}
													}
													Static111.method1753(arg5, arg1, arg3, arg6);
												} else {
													local664 = local24.anInt1067 * 4096 / local268;
													if (local24.anInt1065 != 0) {
														local1334.method181(local104 + local24.anInt1067 / 2, local110 + local24.anInt1053 / 2, local24.anInt1065, local664);
													} else if (local113 != 0) {
														local1334.method186(local104, local110, local24.anInt1067, local24.anInt1053, 256 - (local113 & 0xFF));
													} else if (local268 == local24.anInt1067 && local653 == local24.anInt1053) {
														local1334.method182(local104, local110);
													} else {
														local1334.method178(local104, local110, local24.anInt1067, local24.anInt1053);
													}
												}
											} else if (Static58.aBoolean88) {
												Static10.method277(local24);
											}
										} else {
											local1334 = local24.method648(Static34.method626(local24));
											if (local1334 != null) {
												local1334.method182(local104, local110);
											} else if (Static58.aBoolean88) {
												Static10.method277(local24);
											}
										}
									} else {
										@Pc(1690) Class1_Sub1_Sub8 local1690;
										if (local24.anInt1013 == 6) {
											@Pc(1594) boolean local1594 = Static34.method626(local24);
											if (local1594) {
												local268 = local24.anInt1058;
											} else {
												local268 = local24.anInt1014;
											}
											@Pc(1606) Class1_Sub1_Sub1_Sub2 local1606 = null;
											local664 = 0;
											if (local24.anInt1024 != -1) {
												local1690 = Static74.method1334(local24.anInt1024);
												if (local1690 != null) {
													local1690 = local1690.method1326(local24.anInt1075);
													local1606 = local1690.method1333(1);
													if (local1606 == null) {
														Static10.method277(local24);
													} else {
														local1606.method1103();
														local664 = local1606.anInt2759 / 2;
													}
												}
											} else if (local24.anInt1040 == 5) {
												if (local24.anInt1027 == 0) {
													local1606 = Static62.aClass10_2.method355(null, -1, null, -1);
												} else {
													local1606 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.method1842();
												}
											} else if (local268 == -1) {
												local1606 = local24.method654(null, local1594, -1, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1);
												if (local1606 == null && Static58.aBoolean88) {
													Static10.method277(local24);
												}
											} else {
												@Pc(1626) Class1_Sub1_Sub6 local1626 = Static40.method687(local268);
												local1606 = local24.method654(local1626, local1594, local24.anInt1082, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1);
												if (local1606 == null && Static58.aBoolean88) {
													Static10.method277(local24);
												}
											}
											Static108.method1767(local104 + local24.anInt1067 / 2, local24.anInt1053 / 2 + local110);
											local674 = Class1_Sub1_Sub2_Sub4.anIntArray335[local24.anInt1022] * local24.anInt1080 >> 16;
											local833 = Class1_Sub1_Sub2_Sub4.anIntArray334[local24.anInt1022] * local24.anInt1080 >> 16;
											if (local1606 != null) {
												if (local24.aBoolean57) {
													local1606.method1103();
													if (local24.aBoolean55) {
														local1606.method1083(local24.anInt1039, local24.anInt1048, local24.anInt1022, local24.anInt1019, local24.anInt1086 + local664 + local674, local833 - -local24.anInt1086, local24.anInt1080);
													} else {
														local1606.method1082(local24.anInt1039, local24.anInt1048, local24.anInt1022, local24.anInt1019, local24.anInt1086 + local674 + local664, local833 - -local24.anInt1086);
													}
												} else {
													local1606.method1082(local24.anInt1039, 0, local24.anInt1022, 0, local674, local833);
												}
											}
											Static108.method1773();
										} else {
											if (local24.anInt1013 == 7) {
												local1160 = local24.method643();
												if (local1160 == null) {
													if (Static58.aBoolean88) {
														Static10.method277(local24);
													}
													continue;
												}
												local268 = 0;
												for (local653 = 0; local653 < local24.anInt1053; local653++) {
													for (local664 = 0; local664 < local24.anInt1067; local664++) {
														if (local24.anIntArray108[local268] > 0) {
															local1690 = Static74.method1334(local24.anIntArray108[local268] - 1);
															@Pc(1915) Class34 local1915;
															if (local1690.anInt2012 != 1 && local24.anIntArray104[local268] == 1) {
																local1915 = Static91.method1554(new Class34[] { Static112.aClass34_1353, local1690.aClass34_1002, Static87.aClass34_1154 });
															} else {
																local1915 = Static91.method1554(new Class34[] { Static112.aClass34_1353, local1690.aClass34_1002, Static109.aClass34_1574, Static42.method717(local24.anIntArray104[local268]) });
															}
															local846 = local104 + local664 * (local24.anInt1070 + 115);
															local734 = (local24.anInt1079 + 12) * local653 + local110;
															if (local24.anInt1063 == 0) {
																local1160.method839(local1915, local846, local734, local24.anInt1034, local24.aBoolean54 ? 0 : -1);
															} else if (local24.anInt1063 == 1) {
																local1160.method848(local1915, local24.anInt1067 / 2 + local846, local734, local24.anInt1034, local24.aBoolean54 ? 0 : -1);
															} else {
																local1160.method860(local1915, local846 + local24.anInt1067 - 1, local734, local24.anInt1034, local24.aBoolean54 ? 0 : -1);
															}
														}
														local268++;
													}
												}
											}
											@Pc(2212) int local2212;
											if (local24.anInt1013 == 8 && Static77.aClass1_Sub9_12 == local24 && Static42.anInt1199 == Static56.anInt2388) {
												local236 = 0;
												local268 = 0;
												@Pc(2057) Class34 local2057 = local24.aClass34_492;
												@Pc(2059) Class1_Sub1_Sub2_Sub3_Sub1 local2059 = Static62.aClass1_Sub1_Sub2_Sub3_Sub1_4;
												local2057 = Static99.method1661(local24, local2057);
												@Pc(2079) Class34 local2079;
												while (local2057.method982() > 0) {
													local833 = local2057.method981(Static91.aClass34_1175);
													if (local833 == -1) {
														local2079 = local2057;
														local2057 = Static81.aClass34_1058;
													} else {
														local2079 = local2057.method962(local833, 0);
														local2057 = local2057.method956(local833 + 4);
													}
													local846 = local2059.method838(local2079);
													if (local846 > local236) {
														local236 = local846;
													}
													local268 += local2059.anInt1315 + 1;
												}
												local236 += 6;
												local268 += 7;
												local833 = local24.anInt1067 + local104 - local236 - 5;
												if (local104 + 5 > local833) {
													local833 = local104 + 5;
												}
												if (arg3 < local236 + local833) {
													local833 = arg3 - local236;
												}
												local846 = local24.anInt1053 + local110 + 5;
												if (arg6 < local268 + local846) {
													local846 = arg6 - local268;
												}
												Static111.method1747(local833, local846, local236, local268, 16777120);
												Static111.method1751(local833, local846, local236, local268, 0);
												local2057 = local24.aClass34_492;
												local734 = local2059.anInt1315 + local846 + 2;
												local2057 = Static99.method1661(local24, local2057);
												while (local2057.method982() > 0) {
													local2212 = local2057.method981(Static91.aClass34_1175);
													if (local2212 == -1) {
														local2079 = local2057;
														local2057 = Static81.aClass34_1058;
													} else {
														local2079 = local2057.method962(local2212, 0);
														local2057 = local2057.method956(local2212 + 4);
													}
													local2059.method839(local2079, local833 + 3, local734, 0, -1);
													local734 += local2059.anInt1315 + 1;
												}
											}
											if (local24.anInt1013 == 9) {
												if (local24.anInt1047 == 1) {
													Static111.method1750(local104, local110, local24.anInt1067 + local104, local110 - -local24.anInt1053, local24.anInt1034);
												} else {
													local268 = local24.anInt1053 < 0 ? -local24.anInt1053 : local24.anInt1053;
													local236 = local24.anInt1067 < 0 ? -local24.anInt1067 : local24.anInt1067;
													local653 = local236;
													if (local236 < local268) {
														local653 = local268;
													}
													if (local653 != 0) {
														local664 = (local24.anInt1067 << 16) / local653;
														local674 = (local24.anInt1053 << 16) / local653;
														if (local664 < local674) {
															local674 = -local674;
														} else {
															local664 = -local664;
														}
														local2212 = local664 * local24.anInt1047 + 1 >> 17;
														local734 = local24.anInt1047 * local664 >> 17;
														local833 = local24.anInt1047 * local674 >> 17;
														@Pc(2378) int local2378 = local104 + local833;
														local846 = local674 * local24.anInt1047 + 1 >> 17;
														@Pc(2396) int local2396 = local104 + local24.anInt1067 - local846;
														@Pc(2404) int local2404 = local833 + local104 + local24.anInt1067;
														@Pc(2408) int local2408 = local110 + local734;
														local904 = local104 - local846;
														@Pc(2417) int local2417 = local110 - local2212;
														@Pc(2424) int local2424 = local24.anInt1053 + local110 - local2212;
														@Pc(2431) int local2431 = local24.anInt1053 + local110 + local734;
														Static108.method1777(local2378, local904, local2396);
														Static108.method1779(local2408, local2417, local2424, local2378, local904, local2396, local24.anInt1034);
														Static108.method1777(local2378, local2396, local2404);
														Static108.method1779(local2408, local2424, local2431, local2378, local2396, local2404, local24.anInt1034);
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

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method563() {
		aClass34_446 = null;
		aShortArrayArray4 = null;
		aClass1_Sub4_Sub4_2 = null;
		anIntArray90 = null;
		anIntArray89 = null;
		aClass34_448 = null;
		aClass34Array5 = null;
		aClass34_449 = null;
		aClass34_447 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)I")
	public static int method564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub7 local6 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && local6.anIntArray78.length > arg1) {
			return local6.anIntArray78[arg1];
		} else {
			return 0;
		}
	}
}
