import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	public static int anInt10523;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public static int anInt10522 = 0;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt10524 = -1;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public static void method8646() {
		Static281.aClass3_Sub15_Sub1_4.method2438();
		@Pc(15) int local15 = Static281.aClass3_Sub15_Sub1_4.method2432(8);
		@Pc(20) int local20;
		if (local15 < Static377.anInt7132) {
			for (local20 = local15; local20 < Static377.anInt7132; local20++) {
				Static489.anIntArray546[Static333.anInt5422++] = Static176.anIntArray229[local20];
			}
		}
		if (local15 > Static377.anInt7132) {
			throw new RuntimeException("gnpov1");
		}
		Static377.anInt7132 = 0;
		for (local20 = 0; local20 < local15; local20++) {
			@Pc(66) int local66 = Static176.anIntArray229[local20];
			@Pc(76) Class2_Sub3_Sub1_Sub2_Sub1 local76 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) local66)).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			@Pc(83) int local83 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
			if (local83 == 0) {
				Static176.anIntArray229[Static377.anInt7132++] = local66;
				local76.anInt6288 = Static364.anInt7008;
			} else {
				@Pc(103) int local103 = Static281.aClass3_Sub15_Sub1_4.method2432(2);
				if (local103 == 0) {
					Static176.anIntArray229[Static377.anInt7132++] = local66;
					local76.anInt6288 = Static364.anInt7008;
					Static480.anIntArray536[Static111.anInt2930++] = local66;
				} else {
					@Pc(147) int local147;
					@Pc(157) int local157;
					if (local103 == 1) {
						Static176.anIntArray229[Static377.anInt7132++] = local66;
						local76.anInt6288 = Static364.anInt7008;
						local147 = Static281.aClass3_Sub15_Sub1_4.method2432(3);
						local76.method2684(1, local147);
						local157 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
						if (local157 == 1) {
							Static480.anIntArray536[Static111.anInt2930++] = local66;
						}
					} else if (local103 == 2) {
						Static176.anIntArray229[Static377.anInt7132++] = local66;
						local76.anInt6288 = Static364.anInt7008;
						if (Static281.aClass3_Sub15_Sub1_4.method2432(1) == 1) {
							local147 = Static281.aClass3_Sub15_Sub1_4.method2432(3);
							local76.method2684(2, local147);
							local157 = Static281.aClass3_Sub15_Sub1_4.method2432(3);
							local76.method2684(2, local157);
						} else {
							local147 = Static281.aClass3_Sub15_Sub1_4.method2432(3);
							local76.method2684(0, local147);
						}
						local147 = Static281.aClass3_Sub15_Sub1_4.method2432(1);
						if (local147 == 1) {
							Static480.anIntArray536[Static111.anInt2930++] = local66;
						}
					} else if (local103 == 3) {
						Static489.anIntArray546[Static333.anInt5422++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!tn;I)Lclient!jh;")
	public static Class159 method8647(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(12) Class159 local12 = new Class159();
		local12.anInt5734 = arg0.method8414();
		local12.aClass3_Sub1_Sub19_1 = Static221.aClass136_1.method4290(local12.anInt5734);
		return local12;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII[Lclient!gaa;ZIIB)V")
	public static void method8648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class108[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
		for (@Pc(18) int local18 = 0; local18 < arg6.length; local18++) {
			@Pc(24) Class108 local24 = arg6[local18];
			if (local24 != null && (local24.anInt4046 == arg8 || arg8 == -1412584499 && Static233.aClass108_7 == local24)) {
				@Pc(49) int local49 = arg5 + local24.anInt4070;
				@Pc(54) int local54 = local24.anInt4053 + arg1;
				@Pc(61) int local61 = local24.anInt4067 + local49 + 1;
				@Pc(69) int local69 = local54 + local24.anInt4037 + 1;
				@Pc(75) int local75;
				if (arg9 == -1) {
					Class160.aRectangleArray2[Static457.anInt8300].setBounds(arg5 + local24.anInt4070, arg1 + local24.anInt4053, local24.anInt4067, local24.anInt4037);
					local75 = Static457.anInt8300++;
				} else {
					local75 = arg9;
				}
				local24.anInt4023 = Static251.anInt5580;
				local24.anInt4060 = local75;
				if (!Static71.method1825(local24)) {
					if (local24.anInt4031 != 0) {
						Static228.method4367(local24);
					}
					@Pc(122) int local122 = local24.anInt4070 + arg5;
					@Pc(128) int local128 = local24.anInt4053 + arg1;
					@Pc(130) int local130 = 0;
					@Pc(132) int local132 = 0;
					if (Static349.aBoolean590) {
						local130 = Static477.method7033();
						local132 = Static10.method114();
					}
					@Pc(143) int local143 = local24.anInt4022;
					if (Static401.aBoolean650 && (Static71.method1836(local24).anInt1134 != 0 || local24.anInt4018 == 0) && local143 > 127) {
						local143 = 127;
					}
					@Pc(198) int local198;
					@Pc(205) int local205;
					if (Static233.aClass108_7 == local24) {
						if (arg8 != -1412584499 && (Static338.anInt6675 == local24.lb || local24.lb == Static255.anInt5650)) {
							Static344.anInt6764 = arg1;
							Static220.aClass108Array2 = arg6;
							Static28.anInt484 = arg5;
							continue;
						}
						if (Static60.aBoolean100 && Static638.aBoolean885) {
							local198 = Static501.aClass59_5.method4107() + local130;
							local205 = Static501.aClass59_5.method4106() + local132;
							local205 -= Static28.anInt483;
							local198 -= Static77.anInt3994;
							if (Static413.anInt7711 > local198) {
								local198 = Static413.anInt7711;
							}
							if (Static408.anInt7678 > local205) {
								local205 = Static408.anInt7678;
							}
							if (local24.anInt4067 + local198 > Static326.aClass108_8.anInt4067 + Static413.anInt7711) {
								local198 = Static326.aClass108_8.anInt4067 + Static413.anInt7711 - local24.anInt4067;
							}
							if (Static408.anInt7678 + Static326.aClass108_8.anInt4037 < local24.anInt4037 + local205) {
								local205 = Static408.anInt7678 + Static326.aClass108_8.anInt4037 - local24.anInt4037;
							}
							local122 = local198;
							local128 = local205;
						}
						if (Static255.anInt5650 == local24.lb) {
							local143 = 128;
						}
					}
					@Pc(331) int local331;
					@Pc(324) int local324;
					@Pc(287) int local287;
					@Pc(293) int local293;
					if (local24.anInt4018 == 2) {
						local324 = arg2;
						local205 = arg3;
						local331 = arg0;
						local198 = arg4;
					} else {
						local287 = local122 + local24.anInt4067;
						local293 = local128 + local24.anInt4037;
						local198 = arg4 >= local122 ? arg4 : local122;
						if (local24.anInt4018 == 9) {
							local287++;
							local293++;
						}
						local205 = arg3 >= local128 ? arg3 : local128;
						local324 = local293 < arg2 ? local293 : arg2;
						local331 = arg0 <= local287 ? arg0 : local287;
					}
					if (local198 < local331 && local324 > local205) {
						@Pc(639) int local639;
						@Pc(652) int local652;
						@Pc(745) int local745;
						@Pc(603) int local603;
						@Pc(637) int local637;
						if (local24.anInt4031 != 0) {
							if (Static527.anInt9098 == local24.anInt4031 || local24.anInt4031 == Static463.anInt8397) {
								Static484.method7112(local24, local122, local128);
								if (!Static349.aBoolean590) {
									Static19.method263(local122, local24.anInt4067, Static463.anInt8397 == local24.anInt4031, local24.anInt4037, local128);
									Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
								}
								Static178.aBooleanArray12[local75] = true;
								continue;
							}
							if (Static113.anInt10084 == local24.anInt4031) {
								if (local24.method3526(Static47.aClass33_3) != null) {
									Static14.method8598();
									Static243.method4639(local24, local128, Static47.aClass33_3, local122);
									Static441.aBooleanArray17[local75] = true;
									Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
									if (Static349.aBoolean590) {
										if (arg7) {
											Static241.method4616(local69, local54, local61, local49);
										} else {
											Static197.method3930(local49, local61, local54, local69);
										}
									}
								}
								continue;
							}
							if (local24.anInt4031 == Static458.anInt8342) {
								if (local24.method3526(Static47.aClass33_3) != null) {
									Static116.method2765(local24, local122, local128);
									Static441.aBooleanArray17[local75] = true;
									Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
									if (Static349.aBoolean590) {
										if (arg7) {
											Static241.method4616(local69, local54, local61, local49);
										} else {
											Static197.method3930(local49, local61, local54, local69);
										}
									}
								}
								continue;
							}
							if (Static251.anInt5587 == local24.anInt4031) {
								Static254.method4791(local24.anInt4067, local128, Static641.anInterface5_12, Static47.aClass33_3, local122, local24.anInt4037);
								Static178.aBooleanArray12[local75] = true;
								Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
								continue;
							}
							if (local24.anInt4031 == Static487.anInt8648) {
								Static439.method6677(Static47.aClass33_3, local24.anInt4067, local24.anInt4037, local128, local122);
								Static178.aBooleanArray12[local75] = true;
								Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
								continue;
							}
							if (local24.anInt4031 == Static519.anInt9057) {
								if (!Static264.aBoolean502 && !Static197.aBoolean392) {
									continue;
								}
								local287 = local24.anInt4067 + local122;
								if (Static349.aBoolean590) {
									if (arg7) {
										Static241.method4616(local69, local54, local61, local49);
									} else {
										Static197.method3930(local49, local61, local54, local69);
									}
								}
								local293 = local128 + 15;
								if (Static264.aBoolean502) {
									local603 = -256;
									if (Static83.anInt6968 < 20) {
										local603 = -65536;
									}
									Static528.aClass25_7.method5856(local287, "Fps:" + Static83.anInt6968, -1, local293, local603);
									local293 += 15;
									@Pc(627) Runtime local627 = Runtime.getRuntime();
									local637 = (int) ((local627.totalMemory() - local627.freeMemory()) / 1024L);
									local639 = -256;
									if (local637 > 98304) {
										local639 = -65536;
										if (Static486.aBoolean732) {
											Static471.method6999();
											for (local652 = 0; local652 < 10; local652++) {
												System.gc();
											}
											local637 = (int) ((local627.totalMemory() - local627.freeMemory()) / 1024L);
											if (local637 > 65536) {
												Static496.method7251("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static528.aClass25_7.method5856(local287, "Mem:" + local637 + "k", -1, local293, local639);
									local293 += 15;
									Static528.aClass25_7.method5856(local287, "In:" + Static419.anInt7812 + "B/s Out:" + Static73.anInt1918 + "B/s", -1, local293, -256);
									local293 += 15;
									local652 = Static47.aClass33_3.E() / 1024;
									Static528.aClass25_7.method5856(local287, "Offheap:" + local652 + "k", -1, local293, local652 <= 65536 ? -256 : -65536);
									local293 += 15;
									local745 = 0;
									@Pc(747) int local747 = 0;
									@Pc(749) int local749 = 0;
									for (@Pc(751) int local751 = 0; local751 < 37; local751++) {
										if (Static215.aClass120_Sub1Array1[local751] != null) {
											local745 += Static215.aClass120_Sub1Array1[local751].method3834();
											local747 += Static215.aClass120_Sub1Array1[local751].method3841();
											local749 += Static215.aClass120_Sub1Array1[local751].method3838();
										}
									}
									@Pc(793) int local793 = local749 * 100 / local745;
									@Pc(799) int local799 = local747 * 10000 / local745;
									@Pc(819) String local819 = "Cache:" + Static328.method5505(2, 0, true, (long) local799) + "% (" + local793 + "%)";
									Static641.aClass25_14.method5856(local287, local819, -1, local293, -256);
									local293 += 12;
								}
								if (Static342.anInt6740 > 0) {
									Static641.aClass25_14.method5856(local287, "Particles: " + anInt10522 + " / " + Static342.anInt6740, -1, local293, -256);
								}
								local293 += 12;
								if (Static197.aBoolean392) {
									Static641.aClass25_14.method5856(local287, "Polys: " + Static47.aClass33_3.I() + " Models: " + Static47.aClass33_3.M(), -1, local293, -256);
									local293 += 12;
									Static641.aClass25_14.method5856(local287, "Ls: " + Static434.anInt7938 + " La: " + Static328.anInt6576 + " NPC: " + Static426.anInt7833 + " Pl: " + Static73.anInt1921, -1, local293, -256);
									Static93.method2465();
									local293 += 12;
								}
								Static178.aBooleanArray12[local75] = true;
								continue;
							}
						}
						if (local24.anInt4018 == 0) {
							if (Static98.anInt2574 == local24.anInt4031 && Static47.aClass33_3.method6185()) {
								Static47.aClass33_3.method6175(local122, local128, local24.anInt4067, local24.anInt4037);
							}
							method8648(local331, local128 - local24.anInt4009, local324, local205, local198, local122 - local24.anInt4056, arg6, arg7, local24.anInt4043, local75);
							if (local24.aClass108Array1 != null) {
								method8648(local331, local128 - local24.anInt4009, local324, local205, local198, local122 - local24.anInt4056, local24.aClass108Array1, arg7, local24.anInt4043, local75);
							}
							@Pc(982) Class3_Sub50 local982 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local24.anInt4043);
							if (local982 != null) {
								Static500.method7313(local128, local982.anInt9575, local324, local205, local331, local122, local75, local198);
							}
							if (Static98.anInt2574 == local24.anInt4031 && Static47.aClass33_3.method6185()) {
								Static47.aClass33_3.method6173();
							}
							Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
						}
						if (Static73.aBooleanArray3[local75] || Static94.anInt2529 > 1) {
							if (local24.anInt4018 == 3) {
								if (local143 == 0) {
									if (local24.aBoolean343) {
										Static47.aClass33_3.aa(local122, local128, local24.anInt4067, local24.anInt4037, local24.anInt4069, 0);
									} else {
										Static47.aClass33_3.method6174(local122, local128, local24.anInt4067, local24.anInt4037, local24.anInt4069, 0);
									}
								} else if (local24.aBoolean343) {
									Static47.aClass33_3.aa(local122, local128, local24.anInt4067, local24.anInt4037, 255 - (local143 & 0xFF) << 24 | local24.anInt4069 & 0xFFFFFF, 1);
								} else {
									Static47.aClass33_3.method6174(local122, local128, local24.anInt4067, local24.anInt4037, local24.anInt4069 & 0xFFFFFF | 255 - (local143 & 0xFF) << 24, 1);
								}
								if (Static349.aBoolean590) {
									if (arg7) {
										Static241.method4616(local69, local54, local61, local49);
									} else {
										Static197.method3930(local49, local61, local54, local69);
									}
								}
							} else if (local24.anInt4018 == 4) {
								@Pc(1138) Class25 local1138 = local24.method3528(Static47.aClass33_3);
								if (local1138 != null) {
									local293 = local24.anInt4069;
									@Pc(1153) String local1153 = local24.aString39;
									if (local24.anInt4059 != -1) {
										@Pc(1164) Class237 local1164 = Static367.aClass281_1.method6975(local24.anInt4059);
										local1153 = local1164.aString84;
										if (local1153 == null) {
											local1153 = "null";
										}
										if ((local1164.anInt7293 == 1 || local24.anInt4012 != 1) && local24.anInt4012 != -1) {
											local1153 = "<col=ff9040>" + local1153 + "</col> x" + Static66.method1486(local24.anInt4012);
										}
									}
									if (local24.anInt4040 != -1) {
										local1153 = Static269.method4908(local24.anInt4040);
										if (local1153 == null) {
											local1153 = "";
										}
									}
									if (local24 == Static529.aClass108_11) {
										local1153 = Static287.aClass176_31.method4986(Static380.anInt7247);
										local293 = local24.anInt4069;
									}
									if (Static231.aBoolean458) {
										Static47.aClass33_3.T(local122, local128, local122 + local24.anInt4067, local128 - -local24.anInt4037);
									}
									local1138.method5852(0, local24.anInt4045, 255 - (local143 & 0xFF) << 24 | local293, 0, local128, Static583.aClass5Array19, local24.anInt4073, local24.anInt4067, local24.aBoolean348 ? 255 - (local143 & 0xFF) << 24 : -1, local24.anInt4013, null, local122, local24.anInt4094, null, local24.anInt4037, local1153);
									if (Static231.aBoolean458) {
										Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
									}
									if (local1153.trim().length() > 0) {
										if (!Static231.aBoolean458) {
											@Pc(1312) Class315 local1312 = Static56.method8352(local24.anInt4101, Static47.aClass33_3);
											local637 = local1312.method7566(Static583.aClass5Array19, local24.anInt4067, local1153);
											local639 = local1312.method7569(Static583.aClass5Array19, local1153, local24.anInt4067, local24.anInt4013);
											if (Static349.aBoolean590) {
												if (arg7) {
													Static241.method4616(local128 + local639, local128, local122 + local637, local122);
												} else {
													Static197.method3930(local122, local637 + local122, local128, local128 + local639);
												}
											}
										} else if (Static349.aBoolean590) {
											if (arg7) {
												Static241.method4616(local69, local54, local61, local49);
											} else {
												Static197.method3930(local49, local61, local54, local69);
											}
										}
									}
								} else if (Static624.aBoolean868) {
									Static139.method3135(local24);
								}
							} else {
								@Pc(1474) int local1474;
								if (local24.anInt4018 == 5) {
									if (local24.anInt4062 < 0) {
										@Pc(1405) Class5 local1405;
										if (local24.anInt4059 != -1) {
											@Pc(1423) Class352 local1423 = local24.aBoolean350 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null;
											local1405 = Static367.aClass281_1.method6979(local24.anInt4012, local24.anInt4090, local24.anInt4059, local24.anInt4026 | 0xFF000000, local1423, local24.anInt4068, Static47.aClass33_3);
										} else if (local24.anInt4040 == -1) {
											local1405 = local24.method3525(Static47.aClass33_3);
										} else {
											local1405 = Static593.method8114(Static47.aClass33_3, local24.anInt4040);
										}
										if (local1405 != null) {
											local293 = local1405.method7589();
											local603 = local1405.method7585();
											local1474 = 255 - (local143 & 0xFF) << 24 | (local24.anInt4069 == 0 ? 16777215 : local24.anInt4069 & 0xFFFFFF);
											if (local24.aBoolean345) {
												Static47.aClass33_3.T(local122, local128, local24.anInt4067 + local122, local128 - -local24.anInt4037);
												if (local24.anInt4092 != 0) {
													local637 = (local24.anInt4067 + local293 - 1) / local293;
													local639 = (local24.anInt4037 + local603 - 1) / local603;
													for (local652 = 0; local652 < local637; local652++) {
														for (local745 = 0; local745 < local639; local745++) {
															if (local24.anInt4069 == 0) {
																local1405.method7579((float) local293 / 2.0F + (float) (local122 + local652 * local293), (float) local603 / 2.0F + (float) (local128 + local745 * local603), 4096, local24.anInt4092);
															} else {
																local1405.method7591((float) (local122 + local652 * local293) + (float) local293 / 2.0F, (float) local603 / 2.0F + (float) (local745 * local603 + local128), 4096, local24.anInt4092, local1474);
															}
														}
													}
												} else if (local24.anInt4069 == 0 && local143 == 0) {
													local1405.method7598(local122, local128, local24.anInt4067, local24.anInt4037);
												} else {
													local1405.method7594(local122, local128, local24.anInt4067, local24.anInt4037, 0, local1474, 1);
												}
												Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
											} else if (local24.anInt4069 == 0 && local143 == 0) {
												if (local24.anInt4092 != 0) {
													local1405.method7579((float) local24.anInt4067 / 2.0F + (float) local122, (float) local24.anInt4037 / 2.0F + (float) local128, local24.anInt4067 * 4096 / local293, local24.anInt4092);
												} else if (local24.anInt4067 == local293 && local603 == local24.anInt4037) {
													local1405.method7577(local122, local128);
												} else {
													local1405.method7590(local122, local128, local24.anInt4067, local24.anInt4037);
												}
											} else if (local24.anInt4092 != 0) {
												local1405.method7591((float) local24.anInt4067 / 2.0F + (float) local122, (float) local24.anInt4037 / 2.0F + (float) local128, local24.anInt4067 * 4096 / local293, local24.anInt4092, local1474);
											} else if (local24.anInt4067 == local293 && local603 == local24.anInt4037) {
												local1405.method7595(local122, local128, 0, local1474, 1);
											} else {
												local1405.method7596(local122, local128, local24.anInt4067, local24.anInt4037, 0, local1474, 1);
											}
										} else if (Static624.aBoolean868) {
											Static139.method3135(local24);
										}
									} else {
										local24.method3520(Static20.aClass202_1, Static57.aClass265_33).method4612(0, local24.anInt4100 << 3, local24.anInt4037, local122, local24.anInt4067, local24.anInt4082 << 3, Static47.aClass33_3, local128, 0);
									}
									if (Static349.aBoolean590) {
										if (arg7) {
											Static241.method4616(local69, local54, local61, local49);
										} else {
											Static197.method3930(local49, local61, local54, local69);
										}
									}
								} else if (local24.anInt4018 == 6) {
									Static141.method3161();
									@Pc(1827) Class128 local1827 = null;
									local293 = 0;
									@Pc(1931) Class290 local1931;
									@Pc(1941) Class352 local1941;
									if (local24.anInt4059 != -1) {
										@Pc(2044) Class237 local2044 = Static367.aClass281_1.method6975(local24.anInt4059);
										if (local2044 != null) {
											local2044 = local2044.method6064(local24.anInt4012);
											local1931 = local24.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(local24.anInt4015);
											local1941 = local24.aBoolean350 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null;
											local1827 = local2044.method6070(1, local1941, local1931, local24.anInt4025, Static47.aClass33_3, local24.anInt4095, 2048, local24.anInt4065);
											if (local1827 == null) {
												Static139.method3135(local24);
											} else {
												local293 = -local1827.fa() >> 1;
											}
										}
									} else if (local24.anInt4044 == 5) {
										local603 = local24.anInt4097;
										if (local603 >= 0 && local603 < 2048) {
											@Pc(1979) Class2_Sub3_Sub1_Sub2_Sub2 local1979 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local603];
											@Pc(1991) Class290 local1991 = local24.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(local24.anInt4015);
											if (local1979 != null && (local603 == Static399.anInt7626 || Static254.method4792(local1979.aString68) == local24.anInt4016)) {
												local1827 = local1979.aClass352_1.method8179(Static510.aClass97_2, 2048, local1991, null, -1, 0, null, Static47.aClass33_3, Static618.aClass222_2, Static604.aClass139_2, null, 0, Static367.aClass281_1, local24.anInt4095, Static514.aClass166_1, Static367.aClass285_1, local24.anInt4025, 0, local24.anInt4065);
											}
										}
									} else if (local24.anInt4044 == 8 || local24.anInt4044 == 9) {
										@Pc(1919) Class3_Sub17 local1919 = Static77.method3511(false, local24.anInt4097);
										local1931 = local24.anInt4015 == -1 ? null : Static618.aClass222_2.method5867(local24.anInt4015);
										if (local1919 != null) {
											local1941 = local24.aBoolean350 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null;
											local1827 = local1919.method2487(local24.anInt4016, local1941, local24.anInt4065, local24.anInt4044 == 9, local24.anInt4025, local1931, local24.anInt4095, Static47.aClass33_3);
										}
									} else if (local24.anInt4015 == -1) {
										local1827 = local24.method3533(Static604.aClass139_2, Static367.aClass281_1, Static510.aClass97_2, Static367.aClass285_1, Static514.aClass166_1, 0, Static47.aClass33_3, -1, Static618.aClass222_2, -1, null, 2048, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1);
										if (local1827 == null && Static624.aBoolean868) {
											Static139.method3135(local24);
										}
									} else {
										@Pc(1858) Class290 local1858 = Static618.aClass222_2.method5867(local24.anInt4015);
										local1827 = local24.method3533(Static604.aClass139_2, Static367.aClass281_1, Static510.aClass97_2, Static367.aClass285_1, Static514.aClass166_1, local24.anInt4065, Static47.aClass33_3, local24.anInt4025, Static618.aClass222_2, local24.anInt4095, local1858, 2048, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1);
										if (local1827 == null && Static624.aBoolean868) {
											Static139.method3135(local24);
										}
									}
									if (local1827 != null) {
										if (local24.anInt4088 <= 0) {
											local603 = 512;
										} else {
											local603 = (local24.anInt4067 << 9) / local24.anInt4088;
										}
										if (local24.anInt4099 > 0) {
											local1474 = (local24.anInt4037 << 9) / local24.anInt4099;
										} else {
											local1474 = 512;
										}
										local637 = local24.anInt4067 / 2 + local122;
										local639 = local128 + local24.anInt4037 / 2;
										if (!local24.aBoolean344) {
											local637 += local24.anInt4036 * local603 >> 9;
											local639 += local1474 * local24.anInt4079 >> 9;
										}
										Static39.aClass47_1.method7878();
										Static47.aClass33_3.method6233(Static39.aClass47_1);
										Static47.aClass33_3.DA(local637, local639, local603, local1474);
										Static47.aClass33_3.ya();
										if (local24.aBoolean341) {
											Static47.aClass33_3.C(false);
										}
										if (local24.aBoolean344) {
											Static456.aClass47_9.method7866(local24.anInt4063);
											Static456.aClass47_9.method7871(local24.anInt4085);
											Static456.aClass47_9.method7861(local24.anInt4064);
											Static456.aClass47_9.method7876(local24.anInt4036, local24.anInt4079, local24.anInt4093);
										} else {
											local652 = (local24.anInt4071 << 2) * Class3_Sub1_Sub2.anIntArray84[local24.anInt4063 << 3] >> 14;
											local745 = Class3_Sub1_Sub2.anIntArray85[local24.anInt4063 << 3] * (local24.anInt4071 << 2) >> 14;
											Static456.aClass47_9.method7870(-local24.anInt4064 << 3);
											Static456.aClass47_9.method7871(local24.anInt4085 << 3);
											Static456.aClass47_9.method7876(local24.anInt4032 << 2, local293 + local652 + (local24.anInt4011 << 2), local745 - -(local24.anInt4011 << 2));
											Static456.aClass47_9.method7858(local24.anInt4063 << 3);
										}
										local24.method3531(Static251.anInt5580, local1827, Static456.aClass47_9, Static47.aClass33_3);
										if (Static231.aBoolean458) {
											Static47.aClass33_3.T(local122, local128, local122 + local24.anInt4067, local24.anInt4037 + local128);
										}
										if (local24.aBoolean344) {
											if (local24.aBoolean337) {
												local1827.method6294(Static456.aClass47_9, null, local24.anInt4071, 1);
											} else {
												local1827.method6281(Static456.aClass47_9, null, 1);
												if (local24.aClass2_Sub2_4 != null) {
													Static47.aClass33_3.method6160(local24.aClass2_Sub2_4.method227());
												}
											}
										} else if (local24.aBoolean337) {
											local1827.method6294(Static456.aClass47_9, null, local24.anInt4071 << 2, 1);
										} else {
											local1827.method6281(Static456.aClass47_9, null, 1);
											if (local24.aClass2_Sub2_4 != null) {
												Static47.aClass33_3.method6160(local24.aClass2_Sub2_4.method227());
											}
										}
										if (Static231.aBoolean458) {
											Static47.aClass33_3.KA(arg4, arg3, arg0, arg2);
										}
										if (local24.aBoolean341) {
											Static47.aClass33_3.C(true);
										}
									}
									if (Static349.aBoolean590) {
										if (arg7) {
											Static241.method4616(local69, local54, local61, local49);
										} else {
											Static197.method3930(local49, local61, local54, local69);
										}
									}
								} else if (local24.anInt4018 == 9) {
									if (local24.aBoolean342) {
										local603 = local122 + local24.anInt4067;
										local1474 = local128;
										local293 = local24.anInt4037 + local128;
									} else {
										local603 = local24.anInt4067 + local122;
										local1474 = local128 + local24.anInt4037;
										local293 = local128;
									}
									if (local24.anInt4049 == 1) {
										Static47.aClass33_3.method6168(local122, local293, local603, local1474, local24.anInt4069, 0);
									} else {
										Static47.aClass33_3.method6231(local122, local293, local603, local1474, local24.anInt4069, local24.anInt4049);
									}
									if (Static349.aBoolean590) {
										if (arg7) {
											Static241.method4616(local69, local54, local61, local49);
										} else {
											Static197.method3930(local49, local61, local54, local69);
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
