import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "Lclient!fg;")
	public static Class70 aClass70_22 = new Class70(64);

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
	public static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	public static int anInt865 = 0;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "[[S")
	public static final short[][] aShortArrayArray13 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString35 = "Loaded interfaces";

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method745() {
		@Pc(14) boolean local14 = Static172.anInt3235 == 1 && Static200.anInt3712 > 200 || Static172.anInt3235 == 0 && Static200.anInt3712 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static200.anInt3712; local16++) {
			@Pc(23) Class44_Sub4_Sub4_Sub1 local23 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local16]];
			if (local23.method4476()) {
				local23.method5789();
				if (local23.aShort90 >= 0 && local23.aShort89 >= 0 && local23.aShort87 < Static153.anInt2883 && local23.aShort88 < Static246.anInt4606) {
					local23.aBoolean347 = local23.aBoolean358 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean359) {
						local62++;
					}
					if (local23.anInt5136 > Static76.anInt2853) {
						local62 += 2;
					}
					local62 += 5 - local23.method4714() << 2;
					if (Static81.anInt1466 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5151 = local62 + 1;
				} else {
					local23.anInt5151 = -1;
				}
			} else {
				local23.anInt5151 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static149.anInt2759; local98++) {
			@Pc(105) Class44_Sub4_Sub4_Sub2 local105 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local98]];
			if (local105.method4728() && local105.aClass18_1.method363()) {
				local105.method5789();
				if (local105.aShort90 >= 0 && local105.aShort89 >= 0 && local105.aShort87 < Static153.anInt2883 && local105.aShort88 < Static246.anInt4606) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean359) {
						local141++;
					}
					if (local105.anInt5136 > Static76.anInt2853) {
						local141 += 2;
					}
					local141 += 5 - local105.method4714() << 2;
					if (Static81.anInt1466 == 0) {
						if (local105.aClass18_1.aBoolean31) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static81.anInt1466 == 1) {
						if (local105.aClass18_1.aBoolean31) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass18_1.aBoolean33) {
						local141 += 512;
					} else if (!local105.aClass18_1.aBoolean30) {
						local141 += 256;
					}
					local105.anInt5151 = local141 + 1;
				} else {
					local105.anInt5151 = -1;
				}
			} else {
				local105.anInt5151 = -1;
			}
		}
		for (local62 = 0; local62 < Static330.aClass154Array1.length; local62++) {
			@Pc(207) Class154 local207 = Static330.aClass154Array1[local62];
			if (local207 != null) {
				if (local207.anInt4211 == 1) {
					@Pc(218) Class44_Sub4_Sub4_Sub2 local218 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local207.anInt4206];
					if (local218 != null && local218.anInt5151 >= 0) {
						local218.anInt5151 += 1024;
					}
				} else if (local207.anInt4211 == 10) {
					@Pc(239) Class44_Sub4_Sub4_Sub1 local239 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local207.anInt4206];
					if (local239 != null && local239.anInt5151 >= 0) {
						local239.anInt5151 += 1024;
					}
				}
			}
		}
		Static253.aClass44_Sub4_Sub4_Sub1_1.anInt5151 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mb;IIIIIII)V")
	public static void method746(@OriginalArg(0) Class132[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class132 local6 = arg0[local1];
			if (local6 != null && local6.anInt3500 == arg1) {
				@Pc(17) int local17 = local6.anInt3498 + arg6;
				@Pc(22) int local22 = local6.anInt3581 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3524 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3507;
					@Pc(45) int local45 = local22 + local6.anInt3503;
					if (local6.anInt3524 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean261 || local6.anInt3524 == 0 || local6.aBoolean262 || method751(local6).anInt5011 != 0 || local6 == Static214.aClass132_14 || local6.anInt3539 == 1338) {
					if (!local6.aBoolean261 || !method759(local6)) {
						if (local6 == Static350.aClass132_20) {
							Static346.aBoolean419 = true;
							Static339.anInt6180 = local17;
							Static323.anInt5958 = local22;
						}
						if (!local6.aBoolean261 || local6.aBoolean260 || local28 < local32 && local30 < local34) {
							if (local6.anInt3524 == 0) {
								if (!local6.aBoolean261 && method759(local6) && Static153.aClass132_11 != local6) {
									continue;
								}
								if (local6.aBoolean255 && Static7.anInt149 >= local28 && Static79.anInt1449 >= local30 && Static7.anInt149 < local32 && Static79.anInt1449 < local34) {
									for (@Pc(175) Class6_Sub15 local175 = (Class6_Sub15) Static116.aClass211_18.method5594(); local175 != null; local175 = (Class6_Sub15) Static116.aClass211_18.method5582()) {
										if (local175.aBoolean168) {
											local175.method5756();
											local175.aClass132_5.aBoolean268 = false;
										}
									}
									if (Static296.anInt5972 == 0) {
										Static350.aClass132_20 = null;
										Static214.aClass132_14 = null;
									}
									Static301.anInt5701 = 0;
									Static343.aBoolean414 = false;
									Static259.aBoolean338 = false;
									if (!Static201.aBoolean284) {
										Static49.method844();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static7.anInt149 >= local28 && Static79.anInt1449 >= local30 && Static7.anInt149 < local32 && Static79.anInt1449 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static201.aBoolean284 && local223) {
								Static279.method4824(Static79.anInt1449 - local22, Static7.anInt149 - local17, local6);
							}
							if (local6.aBoolean261) {
								@Pc(244) boolean local244 = false;
								if (Static193.anInt3653 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static118.anInt2240 == 1 && Static182.anInt3425 >= local28 && Static198.anInt3691 >= local30 && Static182.anInt3425 < local32 && Static198.anInt3691 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray55 != null) {
									for (local275 = 0; local275 < local6.aByteArray55.length; local275++) {
										if (Static354.aBooleanArray30[local6.aByteArray55[local275]]) {
											if (local6.anIntArray420 == null || Static76.anInt2853 >= local6.anIntArray420[local275]) {
												@Pc(306) byte local306 = local6.aByteArray56[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static354.aBooleanArray30[86] && !Static354.aBooleanArray30[82] && !Static354.aBooleanArray30[81]) && ((local306 & 0x2) == 0 || Static354.aBooleanArray30[86]) && ((local306 & 0x1) == 0 || Static354.aBooleanArray30[82]) && ((local306 & 0x4) == 0 || Static354.aBooleanArray30[81])) {
													Static28.method474(-1, "", local275 + 1, local6.anInt3551);
													local364 = local6.anIntArray419[local275];
													if (local6.anIntArray420 == null) {
														local6.anIntArray420 = new int[local6.aByteArray55.length];
													}
													if (local364 == 0) {
														local6.anIntArray420[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray420[local275] = Static76.anInt2853 + local364;
													}
												}
											}
										} else if (local6.anIntArray420 != null) {
											local6.anIntArray420[local275] = 0;
										}
									}
								}
								if (local253) {
									Static142.method2687(local6, Static182.anInt3425 - local17, Static198.anInt3691 - local22);
								}
								if (Static350.aClass132_20 != null && Static350.aClass132_20 != local6 && local223 && method751(local6).method4578()) {
									Static296.aClass132_19 = local6;
								}
								if (local6 == Static214.aClass132_14) {
									Static95.aBoolean127 = true;
									Static265.anInt4935 = local17;
									Static175.anInt3297 = local22;
								}
								if (local6.aBoolean262 || local6.anInt3539 != 0) {
									@Pc(445) Class6_Sub15 local445;
									if (local223 && Static346.anInt6269 != 0 && local6.anObjectArray31 != null) {
										local445 = new Class6_Sub15();
										local445.aBoolean168 = true;
										local445.aClass132_5 = local6;
										local445.anInt1916 = Static346.anInt6269;
										local445.anObjectArray2 = local6.anObjectArray31;
										Static116.aClass211_18.method5585(local445);
									}
									if (Static350.aClass132_20 != null || Static313.aClass132_18 != null || Static201.aBoolean284 || local6.anInt3539 != 1400 && Static301.anInt5701 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt3539 != 0) {
										if (local6.anInt3539 == 1337 || local6.anInt3539 == 1403) {
											Static79.aClass132_4 = local6;
											if (Static309.aClass125_1 != null) {
												Static309.aClass125_1.method3403(local6.anInt3503, Static289.aClass81_7);
											}
											if (local6.anInt3539 == 1337) {
												if (!Static201.aBoolean284 && local223) {
													Static20.method298(Static289.aClass81_7);
													for (@Pc(518) Class20_Sub5 local518 = (Class20_Sub5) Static126.aClass109_3.method2948(); local518 != null; local518 = (Class20_Sub5) Static126.aClass109_3.method2939()) {
														if (Static7.anInt149 >= local518.anInt2536 && Static7.anInt149 < local518.anInt2538 && Static79.anInt1449 >= local518.anInt2537 && Static79.anInt1449 < local518.anInt2535) {
															Static49.method844();
															Static50.method847(local518.aClass44_Sub4_Sub4_1);
														}
													}
												}
												Static44.method765(local6, local17, local22);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt3539 == 1338) {
											if (local6.method3534(Static289.aClass81_7) == null || Static340.anInt657 != 0 && Static340.anInt657 != 3 || Static201.aBoolean284 || !local223) {
												continue;
											}
											local275 = Static7.anInt149 - local17;
											local580 = Static79.anInt1449 - local22;
											local364 = local6.anIntArray408[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray405[local580]) {
												continue;
											}
											local275 -= local6.anInt3507 / 2;
											local580 -= local6.anInt3503 / 2;
											if (Static334.anInt6112 == 4) {
												local619 = (int) Static117.aFloat58 & 0x3FFF;
											} else {
												local619 = (int) Static117.aFloat58 + Static345.anInt6260 & 0x3FFF;
											}
											@Pc(631) int local631 = Class207.anIntArray697[local619];
											@Pc(635) int local635 = Class207.anIntArray698[local619];
											if (Static334.anInt6112 != 4) {
												local631 = local631 * (Static279.anInt5302 + 256) >> 8;
												local635 = local635 * (Static279.anInt5302 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static334.anInt6112 == 4) {
												local685 = (Static10.anInt187 >> 7) + (local664 >> 2);
												local693 = (Static277.anInt5293 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() - 1) * 64;
												local685 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 - local702 >> 7) + (local664 >> 2);
												local693 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 - local702 >> 7) - (local674 >> 2);
											}
											if (Static79.aBoolean97 && (Static288.anInt5432 & 0x40) != 0) {
												@Pc(735) Class132 local735 = Static6.method131(Static30.anInt572, Static252.anInt4705);
												if (local735 == null) {
													Static346.method5704();
												} else {
													Static52.method870(local685, Static312.aString270, 18, local693, Static1.anInt38, " ->", 1L);
												}
												continue;
											}
											if (Static105.anInt1941 == 1) {
												Static52.method870(local685, Static1.aString1, 39, local693, -1, "", 1L);
											}
											Static52.method870(local685, Static171.aString132, 15, local693, -1, "", 1L);
											continue;
										}
										if (local6.anInt3539 == 1400) {
											Static285.aClass132_16 = local6;
											if (local223) {
												Static343.aBoolean414 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static182.anInt3425 - local17 - local6.anInt3507 / 2) * 2.0D / (double) Static307.aFloat17);
												local580 = (int) -((double) (Static198.anInt3691 - local22 - local6.anInt3503 / 2) * 2.0D / (double) Static307.aFloat17);
												local364 = Static61.anInt1126 + local275 + Static307.anInt1200;
												local619 = Static23.anInt371 + local580 + Static307.anInt1195;
												@Pc(832) Class6_Sub2_Sub19 local832 = Static152.method3078();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method5153(local364, local837, local619);
												if (local837 != null) {
													if (Static354.aBooleanArray30[82] && Static115.anInt2157 > 0) {
														Static294.method5028(local837[1], local837[0], local837[2]);
														continue;
													}
													Static259.aBoolean338 = true;
													Static135.anInt5752 = local837[0];
													Static226.anInt4221 = local837[1];
													Static284.anInt5373 = local837[2];
												}
												Static301.anInt5701 = 1;
												Static99.aBoolean409 = false;
												Static63.anInt1136 = Static7.anInt149;
												Static336.anInt6135 = Static79.anInt1449;
												continue;
											}
											if (local244 && Static301.anInt5701 > 0) {
												if (Static301.anInt5701 == 1 && (Static63.anInt1136 != Static7.anInt149 || Static336.anInt6135 != Static79.anInt1449)) {
													Static242.anInt4535 = Static61.anInt1126;
													Static163.anInt3089 = Static23.anInt371;
													Static301.anInt5701 = 2;
												}
												if (Static301.anInt5701 == 2) {
													Static99.aBoolean409 = true;
													Static247.method4073(Static242.anInt4535 + (int) ((double) (Static63.anInt1136 - Static7.anInt149) * 2.0D / (double) Static307.aFloat18));
													Static281.method4845(Static163.anInt3089 - (int) ((double) (Static336.anInt6135 - Static79.anInt1449) * 2.0D / (double) Static307.aFloat18));
												}
												continue;
											}
											if (Static301.anInt5701 > 0 && !Static99.aBoolean409) {
												if ((Static118.anInt2251 == 1 || Static313.method5292()) && Static256.anInt4749 > 2) {
													Static282.method4847(2);
												} else if (Static165.method5485()) {
													Static282.method4847(1);
												}
											}
											Static301.anInt5701 = 0;
											continue;
										}
										if (local6.anInt3539 == 1401) {
											if (local244) {
												Static209.method3739(Static79.anInt1449 - local22, Static7.anInt149 - local17, local6.anInt3507, local6.anInt3503);
											}
											continue;
										}
										if (local6.anInt3539 == 1402) {
											Static298.method5108(local6);
											continue;
										}
										if (local6.anInt3539 == 1406) {
											Static187.method3524(local22, local6, local17);
											continue;
										}
									}
									if (!local6.aBoolean254 && local253) {
										local6.aBoolean254 = true;
										if (local6.anObjectArray25 != null) {
											local445 = new Class6_Sub15();
											local445.aBoolean168 = true;
											local445.aClass132_5 = local6;
											local445.anInt1907 = Static182.anInt3425 - local17;
											local445.anInt1916 = Static198.anInt3691 - local22;
											local445.anObjectArray2 = local6.anObjectArray25;
											Static116.aClass211_18.method5585(local445);
										}
									}
									if (local6.aBoolean254 && local244 && local6.anObjectArray13 != null) {
										local445 = new Class6_Sub15();
										local445.aBoolean168 = true;
										local445.aClass132_5 = local6;
										local445.anInt1907 = Static7.anInt149 - local17;
										local445.anInt1916 = Static79.anInt1449 - local22;
										local445.anObjectArray2 = local6.anObjectArray13;
										Static116.aClass211_18.method5585(local445);
									}
									if (local6.aBoolean254 && !local244) {
										local6.aBoolean254 = false;
										if (local6.anObjectArray28 != null) {
											local445 = new Class6_Sub15();
											local445.aBoolean168 = true;
											local445.aClass132_5 = local6;
											local445.anInt1907 = Static7.anInt149 - local17;
											local445.anInt1916 = Static79.anInt1449 - local22;
											local445.anObjectArray2 = local6.anObjectArray28;
											Static84.aClass211_8.method5585(local445);
										}
									}
									if (local244 && local6.anObjectArray26 != null) {
										local445 = new Class6_Sub15();
										local445.aBoolean168 = true;
										local445.aClass132_5 = local6;
										local445.anInt1907 = Static7.anInt149 - local17;
										local445.anInt1916 = Static79.anInt1449 - local22;
										local445.anObjectArray2 = local6.anObjectArray26;
										Static116.aClass211_18.method5585(local445);
									}
									if (!local6.aBoolean268 && local223) {
										local6.aBoolean268 = true;
										if (local6.anObjectArray24 != null) {
											local445 = new Class6_Sub15();
											local445.aBoolean168 = true;
											local445.aClass132_5 = local6;
											local445.anInt1907 = Static7.anInt149 - local17;
											local445.anInt1916 = Static79.anInt1449 - local22;
											local445.anObjectArray2 = local6.anObjectArray24;
											Static116.aClass211_18.method5585(local445);
										}
									}
									if (local6.aBoolean268 && local223 && local6.anObjectArray3 != null) {
										local445 = new Class6_Sub15();
										local445.aBoolean168 = true;
										local445.aClass132_5 = local6;
										local445.anInt1907 = Static7.anInt149 - local17;
										local445.anInt1916 = Static79.anInt1449 - local22;
										local445.anObjectArray2 = local6.anObjectArray3;
										Static116.aClass211_18.method5585(local445);
									}
									if (local6.aBoolean268 && !local223) {
										local6.aBoolean268 = false;
										if (local6.anObjectArray4 != null) {
											local445 = new Class6_Sub15();
											local445.aBoolean168 = true;
											local445.aClass132_5 = local6;
											local445.anInt1907 = Static7.anInt149 - local17;
											local445.anInt1916 = Static79.anInt1449 - local22;
											local445.anObjectArray2 = local6.anObjectArray4;
											Static84.aClass211_8.method5585(local445);
										}
									}
									if (local6.anObjectArray18 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray18;
										Static252.aClass211_28.method5585(local445);
									}
									@Pc(1337) Class6_Sub15 local1337;
									if (local6.anObjectArray6 != null && Static215.anInt3938 > local6.anInt3502) {
										if (local6.anIntArray409 == null || Static215.anInt3938 - local6.anInt3502 > 32) {
											local445 = new Class6_Sub15();
											local445.aClass132_5 = local6;
											local445.anObjectArray2 = local6.anObjectArray6;
											Static116.aClass211_18.method5585(local445);
										} else {
											label675: for (local275 = local6.anInt3502; local275 < Static215.anInt3938; local275++) {
												local580 = Static210.anIntArray450[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray409.length; local364++) {
													if (local6.anIntArray409[local364] == local580) {
														local1337 = new Class6_Sub15();
														local1337.aClass132_5 = local6;
														local1337.anObjectArray2 = local6.anObjectArray6;
														Static116.aClass211_18.method5585(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt3502 = Static215.anInt3938;
									}
									if (local6.anObjectArray29 != null && Static316.anInt5862 > local6.anInt3505) {
										if (local6.anIntArray415 == null || Static316.anInt5862 - local6.anInt3505 > 32) {
											local445 = new Class6_Sub15();
											local445.aClass132_5 = local6;
											local445.anObjectArray2 = local6.anObjectArray29;
											Static116.aClass211_18.method5585(local445);
										} else {
											label655: for (local275 = local6.anInt3505; local275 < Static316.anInt5862; local275++) {
												local580 = Static346.anIntArray713[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray415.length; local364++) {
													if (local6.anIntArray415[local364] == local580) {
														local1337 = new Class6_Sub15();
														local1337.aClass132_5 = local6;
														local1337.anObjectArray2 = local6.anObjectArray29;
														Static116.aClass211_18.method5585(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt3505 = Static316.anInt5862;
									}
									if (local6.anObjectArray22 != null && Static318.anInt5889 > local6.anInt3571) {
										if (local6.anIntArray417 == null || Static318.anInt5889 - local6.anInt3571 > 32) {
											local445 = new Class6_Sub15();
											local445.aClass132_5 = local6;
											local445.anObjectArray2 = local6.anObjectArray22;
											Static116.aClass211_18.method5585(local445);
										} else {
											label635: for (local275 = local6.anInt3571; local275 < Static318.anInt5889; local275++) {
												local580 = Static308.anIntArray654[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray417.length; local364++) {
													if (local6.anIntArray417[local364] == local580) {
														local1337 = new Class6_Sub15();
														local1337.aClass132_5 = local6;
														local1337.anObjectArray2 = local6.anObjectArray22;
														Static116.aClass211_18.method5585(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt3571 = Static318.anInt5889;
									}
									if (local6.anObjectArray30 != null && Static94.anInt1733 > local6.anInt3489) {
										if (local6.anIntArray416 == null || Static94.anInt1733 - local6.anInt3489 > 32) {
											local445 = new Class6_Sub15();
											local445.aClass132_5 = local6;
											local445.anObjectArray2 = local6.anObjectArray30;
											Static116.aClass211_18.method5585(local445);
										} else {
											label615: for (local275 = local6.anInt3489; local275 < Static94.anInt1733; local275++) {
												local580 = Static221.anIntArray471[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray416.length; local364++) {
													if (local6.anIntArray416[local364] == local580) {
														local1337 = new Class6_Sub15();
														local1337.aClass132_5 = local6;
														local1337.anObjectArray2 = local6.anObjectArray30;
														Static116.aClass211_18.method5585(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt3489 = Static94.anInt1733;
									}
									if (local6.anObjectArray15 != null && Static59.anInt1109 > local6.anInt3532) {
										if (local6.anIntArray421 == null || Static59.anInt1109 - local6.anInt3532 > 32) {
											local445 = new Class6_Sub15();
											local445.aClass132_5 = local6;
											local445.anObjectArray2 = local6.anObjectArray15;
											Static116.aClass211_18.method5585(local445);
										} else {
											label595: for (local275 = local6.anInt3532; local275 < Static59.anInt1109; local275++) {
												local580 = Static39.anIntArray94[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray421.length; local364++) {
													if (local6.anIntArray421[local364] == local580) {
														local1337 = new Class6_Sub15();
														local1337.aClass132_5 = local6;
														local1337.anObjectArray2 = local6.anObjectArray15;
														Static116.aClass211_18.method5585(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt3532 = Static59.anInt1109;
									}
									if (Static88.anInt1622 > local6.anInt3565 && local6.anObjectArray20 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray20;
										Static116.aClass211_18.method5585(local445);
									}
									if (Static138.anInt4574 > local6.anInt3565 && local6.anObjectArray11 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray11;
										Static116.aClass211_18.method5585(local445);
									}
									if (Static255.anInt4732 > local6.anInt3565 && local6.anObjectArray32 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray32;
										Static116.aClass211_18.method5585(local445);
									}
									if (Static168.anInt841 > local6.anInt3565 && local6.anObjectArray10 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray10;
										Static116.aClass211_18.method5585(local445);
									}
									if (Static107.anInt1992 > local6.anInt3565 && local6.anObjectArray8 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray8;
										Static116.aClass211_18.method5585(local445);
									}
									local6.anInt3565 = Static234.anInt36;
									if (local6.anObjectArray14 != null) {
										for (local275 = 0; local275 < Static210.anInt3833; local275++) {
											@Pc(1805) Class6_Sub15 local1805 = new Class6_Sub15();
											local1805.aClass132_5 = local6;
											local1805.anInt1914 = Static60.anIntArray125[local275];
											local1805.anInt1913 = Static323.anIntArray680[local275];
											local1805.anObjectArray2 = local6.anObjectArray14;
											Static116.aClass211_18.method5585(local1805);
										}
									}
									if (Static148.aBoolean218 && local6.anObjectArray16 != null) {
										local445 = new Class6_Sub15();
										local445.aClass132_5 = local6;
										local445.anObjectArray2 = local6.anObjectArray16;
										Static116.aClass211_18.method5585(local445);
									}
								}
								if (local6.anInt3524 == 5 && local6.anInt3572 != -1) {
									local6.method3521().method3403(local6.anInt3503, Static289.aClass81_7);
								}
							}
							if (!local6.aBoolean261 && Static350.aClass132_20 == null && Static313.aClass132_18 == null && !Static201.aBoolean284) {
								if ((local6.anInt3542 >= 0 || local6.anInt3552 != 0) && Static7.anInt149 >= local28 && Static79.anInt1449 >= local30 && Static7.anInt149 < local32 && Static79.anInt1449 < local34) {
									if (local6.anInt3542 >= 0) {
										Static153.aClass132_11 = arg0[local6.anInt3542];
									} else {
										Static153.aClass132_11 = local6;
									}
								}
								if (local6.anInt3524 == 8 && Static7.anInt149 >= local28 && Static79.anInt1449 >= local30 && Static7.anInt149 < local32 && Static79.anInt1449 < local34) {
									Static32.aClass132_15 = local6;
								}
								if (local6.anInt3566 > local6.anInt3503) {
									Static131.method2541(local6, Static79.anInt1449, local17 + local6.anInt3507, local6.anInt3503, Static7.anInt149, local22, local6.anInt3566);
								}
							}
							Static149.method2908(local22, local6, arg4, local17, arg2, arg5, arg3);
							if (local6.anInt3524 == 0) {
								method746(arg0, local6.anInt3551, local28, local30, local32, local34, local17 - local6.anInt3522, local22 - local6.anInt3578);
								if (local6.aClass132Array2 != null) {
									method746(local6.aClass132Array2, local6.anInt3551, local28, local30, local32, local34, local17 - local6.anInt3522, local22 - local6.anInt3578);
								}
								@Pc(1998) Class6_Sub30 local1998 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local6.anInt3551);
								if (local1998 != null) {
									if (local1998.anInt4314 == 0 && !Static201.aBoolean284 && local223 && !Static249.aBoolean326) {
										Static49.method844();
									}
									Static98.method2028(local22, local30, local17, local32, local34, local28, local1998.anInt4313);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static149.method2908(local22, local6, arg4, local17, arg2, arg5, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method748() {
		Static40.anInt760 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static149.anInt2759; local3++) {
			@Pc(10) Class44_Sub4_Sub4_Sub2 local10 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local3]];
			if (local10.aBoolean359 && local10.method4709() != -1) {
				@Pc(28) int local28 = (local10.method4714() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6340 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6339 - local28 >> 7;
				@Pc(48) Class44_Sub4_Sub4 local48 = Static116.method2348(local35, Static343.anInt6225, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5127;
					if (local48 instanceof Class44_Sub4_Sub4_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt5132 == 0 && local48.method4709() != -1) {
						Static215.anIntArray461[Static40.anInt760] = local53;
						Static14.anIntArray25[Static40.anInt760] = local53;
						Static40.anInt760++;
						local48.anInt5132++;
					}
					Static215.anIntArray461[Static40.anInt760] = local53;
					Static14.anIntArray25[Static40.anInt760] = local10.anInt5127 + 2048;
					Static40.anInt760++;
					local48.anInt5132++;
				}
			}
		}
		Static156.method5554(Static14.anIntArray25, 0, Static40.anInt760 - 1, Static215.anIntArray461);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method749() {
		for (@Pc(1) int local1 = -1; local1 < Static200.anInt3712 + Static149.anInt2759; local1++) {
			@Pc(6) Class44_Sub4_Sub4 local6;
			if (local1 < 0) {
				local6 = Static253.aClass44_Sub4_Sub4_Sub1_1;
			} else if (local1 < Static200.anInt3712) {
				local6 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local1]];
			} else {
				local6 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local1 - Static200.anInt3712]];
			}
			if (local6.anInt5151 >= 0) {
				@Pc(32) int local32 = local6.method4714();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6340 & 0x7F) != 0 || (local6.anInt6339 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6340 & 0x7F) != 64 || (local6.anInt6339 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6340 >> 7;
					local73 = local6.anInt6339 >> 7;
					if (local6.anInt5151 > Static280.anIntArrayArray175[local68][local73]) {
						Static280.anIntArrayArray175[local68][local73] = local6.anInt5151;
						Static215.anIntArrayArray145[local68][local73] = 1;
					} else if (local6.anInt5151 == Static280.anIntArrayArray175[local68][local73]) {
						local109 = Static215.anIntArrayArray145[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6340 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6339 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6340 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6339 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5151 > Static280.anIntArrayArray175[local151][local154]) {
								Static280.anIntArrayArray175[local151][local154] = local6.anInt5151;
								Static215.anIntArrayArray145[local151][local154] = 1;
							} else if (local6.anInt5151 == Static280.anIntArrayArray175[local151][local154]) {
								local109 = Static215.anIntArrayArray145[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mb;)Lclient!rd;")
	public static Class6_Sub34 method751(@OriginalArg(0) Class132 arg0) {
		@Pc(13) Class6_Sub34 local13 = (Class6_Sub34) Static126.aClass108_18.method2900(((long) arg0.anInt3551 << 32) + (long) arg0.anInt3555);
		return local13 == null ? arg0.aClass6_Sub34_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method752() {
		for (@Pc(1) int local1 = 0; local1 < Static153.anInt2883; local1++) {
			@Pc(6) int[] local6 = Static280.anIntArrayArray175[local1];
			for (@Pc(8) int local8 = 0; local8 < Static246.anInt4606; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method754() {
		@Pc(7) int local7 = Static72.aBoolean91 ? Static200.anInt3712 : Static200.anInt3712 + Static149.anInt2759;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class44_Sub4_Sub4 local14;
			if (local9 < 0) {
				local14 = Static253.aClass44_Sub4_Sub4_Sub1_1;
			} else if (local9 < Static200.anInt3712) {
				local14 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local9]];
			} else {
				local14 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local9 - Static200.anInt3712]];
			}
			if (local14.anInt5151 >= 0) {
				@Pc(40) int local40 = local14.method4714();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6340 & 0x7F) == 0 && (local14.anInt6339 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6340 & 0x7F) == 64 && (local14.anInt6339 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class44_Sub4_Sub4_Sub1 && local14.anInterface7_3 != null && Static76.anInt2853 >= local14.anInt5163 && Static76.anInt2853 < local14.anInt5165) {
					((Class44_Sub4_Sub4_Sub1) local14).aBoolean347 = false;
				}
				local14.anInt6335 = Static306.method5249(local14.anInt6339, local14.anInt6340, Static343.anInt6225);
				Static73.method1271(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mb;)Lclient!mb;")
	public static Class132 method755(@OriginalArg(0) Class132 arg0) {
		@Pc(4) int local4 = method751(arg0).method4568();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static249.method4316(arg0.anInt3500);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method757() {
		@Pc(7) int local7 = Static72.aBoolean91 ? Static200.anInt3712 : Static200.anInt3712 + Static149.anInt2759;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class44_Sub4_Sub4 local14;
			if (local9 < 0) {
				local14 = Static253.aClass44_Sub4_Sub4_Sub1_1;
			} else if (local9 < Static200.anInt3712) {
				local14 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local9]];
			} else {
				local14 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local9 - Static200.anInt3712]];
			}
			local14.anInt5132 = 0;
			if (local14.anInt5151 < 0) {
				local14.aBoolean359 = false;
			} else {
				@Pc(47) int local47 = local14.method4714();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6340 & 0x7F) != 0 || (local14.anInt6339 & 0x7F) != 0) {
						local14.aBoolean359 = false;
						continue;
					}
				} else if ((local14.anInt6340 & 0x7F) != 64 || (local14.anInt6339 & 0x7F) != 64) {
					local14.aBoolean359 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6340 >> 7;
					local94 = local14.anInt6339 >> 7;
					if (local14.anInt5151 != Static280.anIntArrayArray175[local89][local94]) {
						local14.aBoolean359 = true;
						continue;
					}
					if (Static215.anIntArrayArray145[local89][local94] > 1) {
						local119 = Static215.anIntArrayArray145[local89][local94]--;
						local14.aBoolean359 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6340 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6339 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6340 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6339 + local89 >> 7;
					if (!Static152.method3076(local94, local155, local148, local162, local14.anInt5151)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5151 == Static280.anIntArrayArray175[local173][local176]) {
									local119 = Static215.anIntArrayArray145[local173][local176]--;
								}
							}
						}
						local14.aBoolean359 = true;
						continue;
					}
				}
				if (local14 instanceof Class44_Sub4_Sub4_Sub1 && local14.anInterface7_3 != null && Static76.anInt2853 >= local14.anInt5163 && Static76.anInt2853 < local14.anInt5165) {
					((Class44_Sub4_Sub4_Sub1) local14).aBoolean347 = false;
				}
				local14.aBoolean359 = false;
				local14.anInt6335 = Static306.method5249(local14.anInt6339, local14.anInt6340, Static343.anInt6225);
				Static73.method1271(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mb;)Z")
	public static boolean method759(@OriginalArg(0) Class132 arg0) {
		if (Static249.aBoolean326) {
			if (method751(arg0).anInt5011 != 0) {
				return false;
			}
			if (arg0.anInt3524 == 0) {
				return false;
			}
		}
		return arg0.aBoolean265;
	}
}
