import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_13 = new Class213("", 10);

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "[I")
	public static final int[] anIntArray420 = new int[250];

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIIBI[Lclient!je;I)V")
	public static void method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class117[] arg7, @OriginalArg(9) int arg8) {
		Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
		for (@Pc(27) int local27 = 0; local27 < arg7.length; local27++) {
			@Pc(33) Class117 local33 = arg7[local27];
			if (local33 != null && (local33.anInt3066 == arg2 || arg2 == -1412584499 && Static227.aClass117_14 == local33)) {
				@Pc(79) int local79;
				if (arg0 == -1) {
					Class198.aRectangleArray1[Static75.anInt1459].setBounds(local33.anInt3072 + arg6, arg5 + local33.anInt3104, local33.anInt3074, local33.anInt3071);
					local79 = Static75.anInt1459++;
				} else {
					local79 = arg0;
				}
				local33.anInt3102 = Static366.anInt5883;
				local33.anInt3038 = local79;
				if (!Static50.method804(local33)) {
					if (local33.anInt3064 != 0) {
						Static197.method2851(local33);
					}
					@Pc(103) int local103 = local33.anInt3072 + arg6;
					@Pc(109) int local109 = local33.anInt3104 + arg5;
					@Pc(112) int local112 = local33.anInt3105;
					if (Static274.aBoolean463 && (Static50.method810(local33).anInt3451 != 0 || local33.anInt3108 == 0) && local112 > 127) {
						local112 = 127;
					}
					@Pc(160) int local160;
					@Pc(164) int local164;
					if (Static227.aClass117_14 == local33) {
						if (arg2 != -1412584499 && (Static295.anInt5082 == local33.anInt3047 || local33.anInt3047 == Static192.anInt3398)) {
							Static35.anInt681 = arg5;
							Static103.anInt1814 = arg6;
							Static382.aClass117Array2 = arg7;
							continue;
						}
						if (Static40.aBoolean70 && Static192.aBoolean335) {
							local160 = Static300.aClass182_1.method4112();
							local164 = Static300.aClass182_1.method4121();
							local160 -= Static211.anInt3646;
							local164 -= Static252.anInt4375;
							if (Static276.anInt5132 > local160) {
								local160 = Static276.anInt5132;
							}
							if (local33.anInt3074 + local160 > Static197.aClass117_8.anInt3074 + Static276.anInt5132) {
								local160 = Static276.anInt5132 + Static197.aClass117_8.anInt3074 - local33.anInt3074;
							}
							if (Static120.anInt2162 > local164) {
								local164 = Static120.anInt2162;
							}
							if (Static197.aClass117_8.anInt3071 + Static120.anInt2162 < local33.anInt3071 + local164) {
								local164 = Static197.aClass117_8.anInt3071 + Static120.anInt2162 - local33.anInt3071;
							}
							local103 = local160;
							local109 = local164;
						}
						if (local33.anInt3047 == Static192.anInt3398) {
							local112 = 128;
						}
					}
					@Pc(257) int local257;
					@Pc(253) int local253;
					@Pc(264) int local264;
					@Pc(269) int local269;
					if (local33.anInt3108 == 2) {
						local164 = arg4;
						local253 = arg1;
						local160 = arg8;
						local257 = arg3;
					} else {
						local264 = local33.anInt3074 + local103;
						local269 = local33.anInt3071 + local109;
						if (local33.anInt3108 == 9) {
							local264++;
							local269++;
						}
						local164 = arg4 >= local109 ? arg4 : local109;
						local160 = arg8 < local103 ? local103 : arg8;
						local257 = local264 < arg3 ? local264 : arg3;
						local253 = arg1 <= local269 ? arg1 : local269;
					}
					if (local160 < local257 && local253 > local164) {
						@Pc(602) int local602;
						@Pc(626) int local626;
						@Pc(628) int local628;
						@Pc(550) int local550;
						@Pc(552) int local552;
						if (local33.anInt3064 != 0) {
							if (Static313.anInt5341 == local33.anInt3064 || Static287.anInt4935 == local33.anInt3064) {
								Static176.method2584(local109, local33.anInt3064 == Static287.anInt4935, local33.anInt3074, local33.anInt3071, local103);
								Static96.aBooleanArray9[local79] = true;
								Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
								continue;
							}
							if (local33.anInt3064 == Static300.anInt5108) {
								if (local33.method2511(Static66.aClass164_2) != null) {
									Static44.method683();
									Static202.method2875(Static66.aClass164_2, local109, local33, local103);
									Static277.aBooleanArray26[local79] = true;
									Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
								}
								continue;
							}
							if (local33.anInt3064 == Static86.anInt1592) {
								if (local33.method2511(Static66.aClass164_2) != null) {
									Static192.method2754(local33, local109, local103);
									Static277.aBooleanArray26[local79] = true;
									Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
								}
								continue;
							}
							if (local33.anInt3064 == Static248.anInt4156) {
								Static354.method4949(local33.anInt3074, local33.anInt3071, local109, Static16.anInterface2_1, Static66.aClass164_2, local103);
								Static96.aBooleanArray9[local79] = true;
								Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
								continue;
							}
							if (local33.anInt3064 == Static5.anInt63) {
								Static326.method4738(local33.anInt3071, local103, local33.anInt3074, Static66.aClass164_2, local109);
								Static96.aBooleanArray9[local79] = true;
								Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
								continue;
							}
							if (Static158.anInt2660 == local33.anInt3064) {
								if (!Static260.aBoolean445 && !Static229.aBoolean379) {
									continue;
								}
								local264 = local33.anInt3074 + local103;
								local269 = local109 + 15;
								if (Static260.aBoolean445) {
									Static334.aClass137_7.method5094("Fps:" + Static37.anInt718, -256, local264, local269);
									local269 += 15;
									@Pc(540) Runtime local540 = Runtime.getRuntime();
									local550 = (int) ((local540.totalMemory() - local540.freeMemory()) / 1024L);
									local552 = -256;
									if (local550 > 65536) {
										local552 = -65536;
									}
									Static334.aClass137_7.method5094("Mem:" + local550 + "k", local552, local264, local269);
									local269 += 15;
									Static334.aClass137_7.method5094("In:" + Static328.anInt5513 + "B/s Out:" + Static136.anInt6305 + "B/s", -256, local264, local269);
									local269 += 15;
									local602 = Static66.aClass164_2.method5323() / 1024;
									Static334.aClass137_7.method5094("Offheap:" + local602 + "k", local602 <= 65536 ? -256 : -65536, local264, local269);
									local269 += 15;
									local626 = 0;
									local628 = 0;
									@Pc(630) int local630 = 0;
									for (@Pc(632) int local632 = 0; local632 < 29; local632++) {
										local626 += Static104.aClass56_Sub1Array1[local632].method3302();
										local628 += Static104.aClass56_Sub1Array1[local632].method3300();
										local630 += Static104.aClass56_Sub1Array1[local632].method3303();
									}
									@Pc(670) int local670 = local630 * 100 / local626;
									@Pc(676) int local676 = local628 * 10000 / local626;
									@Pc(696) String local696 = "Cache:" + Static289.method4387(2, 0, true, (long) local676) + "% (" + local670 + "%)";
									Static227.aClass137_6.method5094(local696, -256, local264, local269);
									local269 += 12;
								}
								if (Static288.anInt4961 > 0) {
									Static227.aClass137_6.method5094("Particles: " + Static103.anInt1816 + " / " + Static288.anInt4961, -256, local264, local269);
								}
								local269 += 12;
								if (Static229.aBoolean379) {
									Static227.aClass137_6.method5094("Polys: " + Static66.aClass164_2.method5375() + " Models: " + Static66.aClass164_2.method5372(), -256, local264, local269);
									local269 += 12;
									Static227.aClass137_6.method5094("Ls: " + Static153.anInt2824 + " La: " + Static222.anInt4508 + " NPC: " + Static60.anInt1202 + " Pl: " + Static291.anInt5039, -256, local264, local269);
									Static53.method871();
									local269 += 12;
								}
								Static96.aBooleanArray9[local79] = true;
								continue;
							}
						}
						if (local33.anInt3108 == 0) {
							if (Static69.anInt1387 == local33.anInt3064 && Static66.aClass164_2.method5317()) {
								Static66.aClass164_2.method5334(local103, local109, local33.anInt3074, local33.anInt3071);
							}
							method2861(local79, local253, local33.anInt3093, local257, local164, local109 - local33.anInt3089, -local33.anInt3040 + local103, arg7, local160);
							if (local33.aClass117Array1 != null) {
								method2861(local79, local253, local33.anInt3093, local257, local164, local109 - local33.anInt3089, -local33.anInt3040 + local103, local33.aClass117Array1, local160);
							}
							@Pc(861) Class1_Sub38 local861 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local33.anInt3093);
							if (local861 != null) {
								Static6.method60(local164, local103, local257, local160, local109, local253, local861.anInt5050, local79);
							}
							if (local33.anInt3064 == Static69.anInt1387 && Static66.aClass164_2.method5317()) {
								Static66.aClass164_2.method5386();
								Static17.aBoolean28 = true;
							}
							Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
						}
						if (Static227.aBooleanArray23[local79] || Static394.anInt6421 > 1) {
							if (local33.anInt3108 == 3) {
								if (local112 == 0) {
									if (local33.aBoolean269) {
										Static66.aClass164_2.method5321(local103, local109, local33.anInt3074, local33.anInt3071, local33.anInt3091, 0);
									} else {
										Static66.aClass164_2.method5382(local103, local109, local33.anInt3074, local33.anInt3071, local33.anInt3091, 0);
									}
								} else if (local33.aBoolean269) {
									Static66.aClass164_2.method5321(local103, local109, local33.anInt3074, local33.anInt3071, 255 - (local112 & 0xFF) << 24 | local33.anInt3091 & 0xFFFFFF, 1);
								} else {
									Static66.aClass164_2.method5382(local103, local109, local33.anInt3074, local33.anInt3071, 255 - (local112 & 0xFF) << 24 | local33.anInt3091 & 0xFFFFFF, 1);
								}
							} else if (local33.anInt3108 == 4) {
								@Pc(996) Class137 local996 = local33.method2513(Static66.aClass164_2);
								if (local996 != null) {
									local269 = local33.anInt3091;
									@Pc(1011) String local1011 = local33.aString30;
									if (local33.anInt3080 != -1) {
										@Pc(1022) Class88 local1022 = Static263.aClass102_2.method2172(local33.anInt3080);
										local1011 = local1022.aString17;
										if (local1011 == null) {
											local1011 = "null";
										}
										if ((local1022.anInt2018 == 1 || local33.anInt3107 != 1) && local33.anInt3107 != -1) {
											local1011 = "<col=ff9040>" + local1011 + "</col> x" + Static39.method586(local33.anInt3107);
										}
									}
									if (Static363.aClass117_17 == local33) {
										local1011 = Static247.aClass169_222.method3680(Static48.anInt952);
										local269 = local33.anInt3091;
									}
									if (Static359.aBoolean584) {
										Static66.aClass164_2.method5385(local103, local109, local103 + local33.anInt3074, local33.anInt3071 + local109);
									}
									local996.method5096(local33.anInt3071, local33.anInt3074, 0, local1011, 0, local33.aBoolean268 ? 255 - (local112 & 0xFF) << 24 : -1, null, null, local103, local33.anInt3082, local33.anInt3051, Static215.aClass51Array14, local33.anInt3113, local269 | 255 - (local112 & 0xFF) << 24, local109);
									if (Static359.aBoolean584) {
										Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
									}
								} else if (Static256.aBoolean438) {
									Static312.method4635(local33);
								}
							} else {
								@Pc(1228) int local1228;
								if (local33.anInt3108 == 5) {
									if (local33.anInt3097 >= 0) {
										local33.method2505(Static274.aClass63_1, Static301.aClass31_1).method562(local103, Static66.aClass164_2, 0, local33.anInt3041 << 3, local109, 0, local33.anInt3074, local33.anInt3069 << 3, local33.anInt3071);
									} else {
										@Pc(1185) Class51 local1185;
										if (local33.anInt3080 == -1) {
											local1185 = local33.method2507(Static66.aClass164_2);
										} else {
											@Pc(1195) Class49 local1195 = local33.aBoolean267 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null;
											local1185 = Static263.aClass102_2.method2173(Static66.aClass164_2, local33.anInt3103, local33.anInt3107, local33.anInt3063, local33.anInt3080, local33.anInt3084 | 0xFF000000, local1195);
										}
										if (local1185 != null) {
											local269 = local1185.method4682();
											local1228 = local1185.method4673();
											if (local33.aBoolean273) {
												Static66.aClass164_2.method5385(local103, local109, local33.anInt3074 + local103, local109 + local33.anInt3071);
												if (local33.anInt3086 != 0) {
													local550 = (local269 + local33.anInt3074 - 1) / local269;
													local552 = (local33.anInt3071 + local1228 - 1) / local1228;
													for (local602 = 0; local602 < local550; local602++) {
														for (local626 = 0; local626 < local552; local626++) {
															local1185.method4678((float) (local103 + local602 * local269) + (float) local269 / 2.0F, (float) (local109 - -(local626 * local1228)) + (float) local1228 / 2.0F, 4096, local33.anInt3086);
														}
													}
												} else if (local112 == 0) {
													local1185.method4666(local103, local109, local33.anInt3074, local33.anInt3071, 0, 0);
												} else {
													local1185.method4666(local103, local109, local33.anInt3074, local33.anInt3071, 1, 255 - (local112 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
											} else if (local112 != 0) {
												local550 = 255 - (local112 & 0xFF) << 24 | 0xFFFFFF;
												if (local33.anInt3086 != 0) {
													local1185.method4683((float) local33.anInt3074 / 2.0F + (float) local103, (float) local109 + (float) local33.anInt3071 / 2.0F, local33.anInt3074 * 4096 / local269, local33.anInt3086, local550);
												} else if (local33.anInt3074 == local269 && local33.anInt3071 == local1228) {
													local1185.method4671(local103, local109, 1, local550);
												} else {
													local1185.method4677(local103, local109, local33.anInt3074, local33.anInt3071, 1, local550, 1);
												}
											} else if (local33.anInt3086 != 0) {
												local1185.method4678((float) local33.anInt3074 / 2.0F + (float) local103, (float) local109 + (float) local33.anInt3071 / 2.0F, local33.anInt3074 * 4096 / local269, local33.anInt3086);
											} else if (local269 == local33.anInt3074 && local1228 == local33.anInt3071) {
												local1185.method4669(local103, local109);
											} else {
												local1185.method4679(local103, local109, local33.anInt3074, local33.anInt3071);
											}
										} else if (Static256.aBoolean438) {
											Static312.method4635(local33);
										}
									}
								} else if (local33.anInt3108 == 6) {
									Static163.method2416();
									@Pc(1526) Class22 local1526 = null;
									local269 = 0;
									@Pc(1559) Class185 local1559;
									@Pc(1567) Class49 local1567;
									if (local33.anInt3080 != -1) {
										@Pc(1539) Class88 local1539 = Static263.aClass102_2.method2172(local33.anInt3080);
										if (local1539 != null) {
											local1539 = local1539.method1658(local33.anInt3107);
											local1559 = local33.anInt3088 == -1 ? null : Static25.aClass67_1.method1227(local33.anInt3088);
											local1567 = local33.aBoolean267 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null;
											local1526 = local1539.method1654(local33.anInt3059, 1, Static66.aClass164_2, local33.anInt3057, local33.anInt3044, 1024, local1559, local1567);
											if (local1526 == null) {
												Static312.method4635(local33);
											} else {
												local269 = -local1526.method1561() / 2;
											}
										}
									} else if (local33.anInt3068 == 5) {
										local1228 = local33.lb;
										if (local1228 >= 0 && local1228 < 2048) {
											@Pc(1742) Class25_Sub1_Sub1_Sub1 local1742 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local1228];
											@Pc(1754) Class185 local1754 = local33.anInt3088 == -1 ? null : Static25.aClass67_1.method1227(local33.anInt3088);
											if (local1742 != null && (Static43.anInt861 == local1228 || Static309.method4596(local1742.aString6) == local33.anInt3058)) {
												local1526 = local1742.aClass49_1.method911(local33.anInt3044, 0, Static25.aClass67_1, null, Static230.aClass72_3, local1754, 0, local33.anInt3059, 1024, -1, Static168.aClass196_2, Static66.aClass164_2, Static183.aClass146_2, null, Static160.aClass163_1, Static263.aClass102_2, local33.anInt3057);
											}
										}
									} else if (local33.anInt3068 == 8 || local33.anInt3068 == 9) {
										@Pc(1616) Class1_Sub37 local1616 = Static367.method5078(false, local33.lb);
										local1559 = local33.anInt3088 == -1 ? null : Static25.aClass67_1.method1227(local33.anInt3088);
										if (local1616 != null) {
											local1567 = local33.aBoolean267 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null;
											local1526 = local1616.method4286(local33.anInt3068 == 9, local1559, local33.anInt3057, local1567, local33.anInt3059, local33.anInt3058, Static66.aClass164_2, local33.anInt3044);
										}
									} else if (local33.anInt3088 == -1) {
										local1526 = local33.method2508(Static230.aClass72_3, -1, Static25.aClass67_1, Static66.aClass164_2, 1024, Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1, Static263.aClass102_2, null, Static168.aClass196_2, 0, -1, Static183.aClass146_2, Static160.aClass163_1);
										if (local1526 == null && Static256.aBoolean438) {
											Static312.method4635(local33);
										}
									} else {
										@Pc(1698) Class185 local1698 = Static25.aClass67_1.method1227(local33.anInt3088);
										local1526 = local33.method2508(Static230.aClass72_3, local33.anInt3057, Static25.aClass67_1, Static66.aClass164_2, 1024, Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1, Static263.aClass102_2, local1698, Static168.aClass196_2, local33.anInt3044, local33.anInt3059, Static183.aClass146_2, Static160.aClass163_1);
										if (local1526 == null && Static256.aBoolean438) {
											Static312.method4635(local33);
										}
									}
									if (local1526 != null) {
										if (local33.anInt3075 > 0) {
											local1228 = (local33.anInt3074 << 9) / local33.anInt3075;
										} else {
											local1228 = 512;
										}
										if (local33.anInt3062 > 0) {
											local550 = (local33.anInt3071 << 9) / local33.anInt3062;
										} else {
											local550 = 512;
										}
										local552 = (local33.anInt3115 * local1228 >> 9) + local103 + local33.anInt3074 / 2;
										local602 = local33.anInt3071 / 2 + local109 + (local33.anInt3052 * local550 >> 9);
										Static112.aClass127_3.method5268();
										Static66.aClass164_2.method5357(Static112.aClass127_3);
										local626 = Class13.anIntArray20[local33.anInt3036 << 3] * local33.anInt3067 >> 15;
										local628 = Class13.anIntArray21[local33.anInt3036 << 3] * local33.anInt3067 >> 15;
										Static66.aClass164_2.method5329(local552, local602, local1228, local550);
										Static66.aClass164_2.method5314((float) local33.aShort55, local33.aBoolean262 ? (float) local33.aShort56 : (float) local33.aShort56 * 1.5F);
										if (arg2 == -1412584499 || Static17.aBoolean28) {
											Static66.aClass164_2.method5306();
											Static66.aClass164_2.method5376();
											Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
											Static17.aBoolean28 = false;
										}
										if (local33.aBoolean261) {
											Static66.aClass164_2.method5307(false);
										}
										Static43.aClass127_2.method5262(-local33.anInt3116 << 3);
										Static43.aClass127_2.method5276(local33.anInt3109 << 3);
										Static43.aClass127_2.method5260(local33.anInt3106, local33.anInt3035 + local269 + local626, local33.anInt3035 + local628);
										Static43.aClass127_2.method5271(local33.anInt3036 << 3);
										if (Static359.aBoolean584) {
											Static66.aClass164_2.method5385(local103, local109, local103 + local33.anInt3074, local33.anInt3071 + local109);
										}
										if (local33.aBoolean262) {
											local1526.method1566(Static43.aClass127_2, null, local33.anInt3067);
										} else {
											local1526.method1565(Static43.aClass127_2, null, 1);
										}
										if (Static359.aBoolean584) {
											Static66.aClass164_2.method5313(arg8, arg4, arg3, arg1);
										}
										if (local33.aBoolean261) {
											Static66.aClass164_2.method5307(true);
										}
									}
								} else if (local33.anInt3108 == 9) {
									if (local33.aBoolean276) {
										local1228 = local33.anInt3074 + local103;
										local269 = local33.anInt3071 + local109;
										local550 = local109;
									} else {
										local1228 = local33.anInt3074 + local103;
										local550 = local109 + local33.anInt3071;
										local269 = local109;
									}
									if (local33.anInt3112 == 1) {
										Static66.aClass164_2.method5364(local103, local269, local1228, local550, local33.anInt3091, 0);
									} else {
										Static66.aClass164_2.method5351(local103, local269, local1228, local550, local33.anInt3091, local33.anInt3112);
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
