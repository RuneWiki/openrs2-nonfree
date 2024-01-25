import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!rg;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
	public static int anInt1376 = 0;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)V")
	public static void method1143(@OriginalArg(1) int arg0) {
		if (arg0 == Static203.anInt3962) {
			return;
		}
		Static89.anInt1891 = Static85.anInt1839 = Static218.anIntArray321[arg0];
		Static383.aClass48_9.method2492(50, (int) ((double) Static89.anInt1891 * 34.46D));
		Static6.anIntArrayArray1 = new int[Static89.anInt1891][Static85.anInt1839];
		Static321.anIntArrayArrayArray9 = new int[4][Static89.anInt1891 >> 3][Static85.anInt1839 >> 3];
		Static250.anIntArrayArray33 = new int[Static89.anInt1891][Static85.anInt1839];
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			Static165.aClass178Array1[local46] = Static348.method5548(Static89.anInt1891, Static85.anInt1839);
		}
		Static116.aByteArrayArrayArray2 = new byte[4][Static89.anInt1891][Static85.anInt1839];
		Static168.method2963(Static89.anInt1891, Static85.anInt1839);
		Static310.method5031(Static85.anInt1839 >> 3, Static89.anInt1891 >> 3, Static383.aClass48_9);
		Static203.anInt3962 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[Lclient!ab;IIIIIII)V")
	public static void method1144(@OriginalArg(1) int arg0, @OriginalArg(2) Class3[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
		for (@Pc(18) int local18 = 0; local18 < arg1.length; local18++) {
			@Pc(24) Class3 local24 = arg1[local18];
			if (local24 != null && (local24.anInt87 == arg8 || arg8 == -1412584499 && local24 == Static268.aClass3_13)) {
				@Pc(72) int local72;
				if (arg2 == -1) {
					Class196.aRectangleArray1[Static198.anInt4111].setBounds(local24.anInt114 + arg6, local24.anInt50 - -arg3, local24.anInt64, local24.anInt116);
					local72 = Static198.anInt4111++;
				} else {
					local72 = arg2;
				}
				local24.anInt61 = local72;
				local24.anInt39 = Static339.anInt6265;
				if (!Static51.method790(local24)) {
					if (local24.anInt59 != 0) {
						Static158.method2790(local24);
					}
					@Pc(100) int local100 = local24.anInt114 + arg6;
					@Pc(105) int local105 = local24.anInt50 + arg3;
					@Pc(108) int local108 = local24.anInt85;
					if (Static119.aBoolean188 && (Static51.method778(local24).anInt4220 != 0 || local24.anInt91 == 0) && local108 > 127) {
						local108 = 127;
					}
					@Pc(163) int local163;
					@Pc(167) int local167;
					if (local24 == Static268.aClass3_13) {
						if (arg8 != -1412584499 && (local24.anInt53 == Static7.anInt143 || Static197.anInt4107 == local24.anInt53)) {
							Static372.aClass3Array2 = arg1;
							Static300.anInt5585 = arg3;
							Static293.anInt1093 = arg6;
							continue;
						}
						if (Static191.aBoolean362 && Static302.aBoolean412) {
							local163 = Static136.aClass91_2.method5223();
							local167 = Static136.aClass91_2.method5224();
							local167 -= Static334.anInt6175;
							local163 -= Static180.anInt3782;
							if (Static181.anInt3816 > local163) {
								local163 = Static181.anInt3816;
							}
							if (Static181.anInt3816 + Static220.aClass3_10.anInt64 < local24.anInt64 + local163) {
								local163 = Static220.aClass3_10.anInt64 + Static181.anInt3816 - local24.anInt64;
							}
							if (Static385.anInt7008 > local167) {
								local167 = Static385.anInt7008;
							}
							local100 = local163;
							if (local24.anInt116 + local167 > Static385.anInt7008 - -Static220.aClass3_10.anInt116) {
								local167 = Static385.anInt7008 + Static220.aClass3_10.anInt116 - local24.anInt116;
							}
							local105 = local167;
						}
						if (Static197.anInt4107 == local24.anInt53) {
							local108 = 128;
						}
					}
					@Pc(255) int local255;
					@Pc(249) int local249;
					@Pc(263) int local263;
					@Pc(268) int local268;
					if (local24.anInt91 == 2) {
						local249 = arg5;
						local167 = arg0;
						local163 = arg7;
						local255 = arg4;
					} else {
						local263 = local100 + local24.anInt64;
						local268 = local24.anInt116 + local105;
						local167 = arg0 >= local105 ? arg0 : local105;
						if (local24.anInt91 == 9) {
							local268++;
							local263++;
						}
						local163 = arg7 < local100 ? local100 : arg7;
						local249 = arg5 <= local268 ? arg5 : local268;
						local255 = local263 < arg4 ? local263 : arg4;
					}
					if (local255 > local163 && local167 < local249) {
						@Pc(583) int local583;
						@Pc(609) int local609;
						@Pc(611) int local611;
						@Pc(533) int local533;
						@Pc(535) int local535;
						if (local24.anInt59 != 0) {
							if (Static168.anInt3459 == local24.anInt59 || Static349.anInt6414 == local24.anInt59) {
								Static206.method3767(local24.anInt59 == Static349.anInt6414, local24.anInt64, local100, local24.anInt116, local105);
								Static93.aBooleanArray10[local72] = true;
								Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
								continue;
							}
							if (Static278.anInt5165 == local24.anInt59) {
								if (local24.method45(Static383.aClass48_9) != null) {
									Static131.method2293();
									Static174.method3094(local24, Static383.aClass48_9, local105, local100);
									Static71.aBooleanArray8[local72] = true;
									Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
								}
								continue;
							}
							if (Static118.anInt5428 == local24.anInt59) {
								if (local24.method45(Static383.aClass48_9) != null) {
									Static73.method1287(local24, local105, local100);
									Static71.aBooleanArray8[local72] = true;
									Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
								}
								continue;
							}
							if (local24.anInt59 == Static99.anInt2181) {
								Static228.method4136(local105, local24.anInt64, Static332.anInterface3_7, Static383.aClass48_9, local24.anInt116, local100);
								Static93.aBooleanArray10[local72] = true;
								Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
								continue;
							}
							if (local24.anInt59 == Static203.anInt3954) {
								Static71.method1270(local24.anInt64, local105, Static383.aClass48_9, local100, local24.anInt116);
								Static93.aBooleanArray10[local72] = true;
								Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
								continue;
							}
							if (local24.anInt59 == Static148.anInt3150) {
								if (!Static25.aBoolean303 && !Static42.aBoolean52) {
									continue;
								}
								local263 = local24.anInt64 + local100;
								local268 = local105 + 15;
								if (Static25.aBoolean303) {
									Static31.aClass44_1.method4645("Fps:" + Static147.anInt3136, local263, -256, local268);
									local268 += 15;
									@Pc(524) Runtime local524 = Runtime.getRuntime();
									local533 = (int) ((local524.totalMemory() - local524.freeMemory()) / 1024L);
									local535 = -256;
									if (local533 > 65536) {
										local535 = -65536;
									}
									Static31.aClass44_1.method4645("Mem:" + local533 + "k", local263, local535, local268);
									local268 += 15;
									Static31.aClass44_1.method4645("In:" + Static71.anInt1602 + "B/s Out:" + Static328.anInt6050 + "B/s", local263, -256, local268);
									local268 += 15;
									local583 = Static383.aClass48_9.method2546() / 1024;
									Static31.aClass44_1.method4645("Offheap:" + local583 + "k", local263, local583 <= 65536 ? -256 : -65536, local268);
									local268 += 15;
									local609 = 0;
									local611 = 0;
									@Pc(613) int local613 = 0;
									for (@Pc(615) int local615 = 0; local615 < 29; local615++) {
										local609 += Static378.aClass135_Sub1Array6[local615].method4412();
										local611 += Static378.aClass135_Sub1Array6[local615].method4417();
										local613 += Static378.aClass135_Sub1Array6[local615].method4416();
									}
									@Pc(653) int local653 = local613 * 100 / local609;
									@Pc(659) int local659 = local611 * 10000 / local609;
									@Pc(679) String local679 = "Cache:" + Static69.method1258((long) local659, 2, true, 0) + "% (" + local653 + "%)";
									Static135.aClass44_3.method4645(local679, local263, -256, local268);
									local268 += 12;
								}
								if (Static300.anInt5587 > 0) {
									Static135.aClass44_3.method4645("Particles: " + Static334.anInt6174 + " / " + Static300.anInt5587, local263, -256, local268);
								}
								local268 += 12;
								if (Static42.aBoolean52) {
									Static135.aClass44_3.method4645("Polys: " + Static383.aClass48_9.method2523() + " Models: " + Static383.aClass48_9.method2528(), local263, -256, local268);
									local268 += 12;
									Static135.aClass44_3.method4645("Ls: " + Static241.anInt2712 + " La: " + Static291.anInt5452 + " NPC: " + Static93.anInt1979 + " Pl: " + Static306.anInt5654, local263, -256, local268);
									local268 += 12;
									Static189.method508();
								}
								Static93.aBooleanArray10[local72] = true;
								continue;
							}
						}
						if (local24.anInt91 == 0) {
							if (Static16.anInt284 == local24.anInt59 && Static383.aClass48_9.method2542()) {
								Static383.aClass48_9.method2464(local100, local105, local24.anInt64, local24.anInt116);
							}
							method1144(local167, arg1, local72, local105 - local24.anInt93, local255, local249, local100 - local24.anInt81, local163, local24.anInt94);
							if (local24.aClass3Array1 != null) {
								method1144(local167, local24.aClass3Array1, local72, local105 - local24.anInt93, local255, local249, local100 - local24.anInt81, local163, local24.anInt94);
							}
							@Pc(842) Class2_Sub26 local842 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local24.anInt94);
							if (local842 != null) {
								Static87.method1485(local249, local100, local167, local842.anInt4145, local163, local105, local72, local255);
							}
							if (Static16.anInt284 == local24.anInt59 && Static383.aClass48_9.method2542()) {
								Static383.aClass48_9.method2537();
								Static383.aBoolean488 = true;
							}
							Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
						}
						if (Static52.aBooleanArray13[local72] || Static208.anInt4248 > 1) {
							if (local24.anInt91 == 3) {
								if (local108 == 0) {
									if (local24.aBoolean10) {
										Static383.aClass48_9.method2470(local100, local105, local24.anInt64, local24.anInt116, local24.anInt103, 0);
									} else {
										Static383.aClass48_9.method2534(local100, local105, local24.anInt64, local24.anInt116, local24.anInt103, 0);
									}
								} else if (local24.aBoolean10) {
									Static383.aClass48_9.method2470(local100, local105, local24.anInt64, local24.anInt116, local24.anInt103 & 0xFFFFFF | 255 - (local108 & 0xFF) << 24, 1);
								} else {
									Static383.aClass48_9.method2534(local100, local105, local24.anInt64, local24.anInt116, 255 - (local108 & 0xFF) << 24 | local24.anInt103 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt91 == 4) {
								@Pc(981) Class44 local981 = local24.method50(Static383.aClass48_9);
								if (local981 != null) {
									local268 = local24.anInt103;
									@Pc(996) String local996 = local24.aString4;
									if (local24.anInt56 != -1) {
										@Pc(1006) Class152 local1006 = Static57.aClass196_1.method4827(local24.anInt56);
										local996 = local1006.aString35;
										if (local996 == null) {
											local996 = "null";
										}
										if ((local1006.anInt4358 == 1 || local24.anInt92 != 1) && local24.anInt92 != -1) {
											local996 = "<col=ff9040>" + local996 + "</col> x" + Static29.method340(local24.anInt92);
										}
									}
									if (local24 == Static392.aClass3_19) {
										local996 = Static181.aClass62_131.method1389(Static200.anInt4144);
										local268 = local24.anInt103;
									}
									if (Static233.aBoolean335) {
										Static383.aClass48_9.method2452(local100, local105, local100 + local24.anInt64, local24.anInt116 + local105);
									}
									local981.method4660(local24.anInt96, null, local105, null, local24.anInt74, 0, local24.anInt64, 0, Static221.aClass27Array60, local100, local996, local24.aBoolean7 ? 255 - (local108 & 0xFF) << 24 : -1, local24.anInt43, local24.anInt116, 255 - (local108 & 0xFF) << 24 | local268);
									if (Static233.aBoolean335) {
										Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
									}
								} else if (Static100.aBoolean164) {
									Static128.method2229(local24);
								}
							} else {
								@Pc(1215) int local1215;
								if (local24.anInt91 == 5) {
									if (local24.anInt83 >= 0) {
										local24.method42(Static371.aClass162_1, Static194.aClass52_1).method1290(local24.anInt99 << 3, local24.anInt116, 0, local100, local24.anInt64, Static383.aClass48_9, 0, local24.anInt79 << 3, local105);
									} else {
										@Pc(1170) Class27 local1170;
										if (local24.anInt56 == -1) {
											local1170 = local24.method46(Static383.aClass48_9);
										} else {
											@Pc(1180) Class158 local1180 = local24.aBoolean6 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null;
											local1170 = Static57.aClass196_1.method4821(local24.anInt92, local24.anInt56, local24.anInt71, local1180, local24.anInt110, Static383.aClass48_9, local24.anInt113 | 0xFF000000);
										}
										if (local1170 != null) {
											local268 = local1170.method5317();
											local1215 = local1170.method5328();
											if (local24.aBoolean18) {
												Static383.aClass48_9.method2452(local100, local105, local100 + local24.anInt64, local105 + local24.anInt116);
												if (local24.anInt100 != 0) {
													local533 = (local268 + local24.anInt64 - 1) / local268;
													local535 = (local24.anInt116 + local1215 - 1) / local1215;
													for (local583 = 0; local583 < local533; local583++) {
														for (local609 = 0; local609 < local535; local609++) {
															local1170.method5329((float) (local583 * local268 + local100) + (float) local268 / 2.0F, (float) local1215 / 2.0F + (float) (local105 + local609 * local1215), 4096, local24.anInt100);
														}
													}
												} else if (local108 == 0) {
													local1170.method5331(local100, local105, local24.anInt64, local24.anInt116, 0, 0);
												} else {
													local1170.method5331(local100, local105, local24.anInt64, local24.anInt116, 1, 255 - (local108 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
											} else if (local108 != 0) {
												local533 = 255 - (local108 & 0xFF) << 24 | 0xFFFFFF;
												if (local24.anInt100 != 0) {
													local1170.method5316((float) local100 + (float) local24.anInt64 / 2.0F, (float) local105 + (float) local24.anInt116 / 2.0F, local24.anInt64 * 4096 / local268, local24.anInt100, local533);
												} else if (local24.anInt64 == local268 && local24.anInt116 == local1215) {
													local1170.method5319(local100, local105, 1, local533);
												} else {
													local1170.method5334(local100, local105, local24.anInt64, local24.anInt116, 1, local533, 1);
												}
											} else if (local24.anInt100 != 0) {
												local1170.method5329((float) local100 + (float) local24.anInt64 / 2.0F, (float) local24.anInt116 / 2.0F + (float) local105, local24.anInt64 * 4096 / local268, local24.anInt100);
											} else if (local24.anInt64 == local268 && local24.anInt116 == local1215) {
												local1170.method5318(local100, local105);
											} else {
												local1170.method5321(local100, local105, local24.anInt64, local24.anInt116);
											}
										} else if (Static100.aBoolean164) {
											Static128.method2229(local24);
										}
									}
								} else if (local24.anInt91 == 6) {
									Static181.method3328();
									@Pc(1502) Class159 local1502 = null;
									local268 = 0;
									@Pc(1537) Class102 local1537;
									@Pc(1545) Class158 local1545;
									if (local24.anInt56 != -1) {
										@Pc(1515) Class152 local1515 = Static57.aClass196_1.method4827(local24.anInt56);
										if (local1515 != null) {
											local1515 = local1515.method3834(local24.anInt92);
											local1537 = local24.anInt48 == -1 ? null : Static333.aClass50_2.method1175(local24.anInt48);
											local1545 = local24.aBoolean6 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null;
											local1502 = local1515.method3842(local24.anInt80, 1024, local1537, local1545, local24.anInt112, 1, local24.anInt82, Static383.aClass48_9);
											if (local1502 == null) {
												Static128.method2229(local24);
											} else {
												local268 = -local1502.method4941() / 2;
											}
										}
									} else if (local24.anInt63 == 5) {
										local1215 = local24.anInt101;
										if (local1215 >= 0 && local1215 < 2048) {
											@Pc(1595) Class1_Sub2_Sub1_Sub1 local1595 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local1215];
											@Pc(1607) Class102 local1607 = local24.anInt48 == -1 ? null : Static333.aClass50_2.method1175(local24.anInt48);
											if (local1595 != null && (Static93.anInt1976 == local1215 || Static318.method5138(local1595.aString12) == local24.anInt69)) {
												local1502 = local1595.aClass158_1.method3948(null, Static59.aClass194_1, 0, Static182.aClass170_2, Static383.aClass48_9, 1024, 0, local24.anInt80, null, -1, Static57.aClass196_1, local24.anInt112, Static333.aClass50_2, local1607, local24.anInt82, Static179.aClass115_1, Static207.aClass32_1);
											}
										}
									} else if (local24.anInt63 == 8 || local24.anInt63 == 9) {
										@Pc(1668) Class2_Sub32 local1668 = Static76.method1317(false, local24.anInt101);
										local1537 = local24.anInt48 == -1 ? null : Static333.aClass50_2.method1175(local24.anInt48);
										if (local1668 != null) {
											local1545 = local24.aBoolean6 ? Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1 : null;
											local1502 = local1668.method4862(Static383.aClass48_9, local24.anInt63 == 9, local24.anInt112, local24.anInt69, local1537, local24.anInt82, local24.anInt80, local1545);
										}
									} else if (local24.anInt48 == -1) {
										local1502 = local24.method49(Static182.aClass170_2, Static57.aClass196_1, 0, -1, Static179.aClass115_1, -1, Static333.aClass50_2, Static207.aClass32_1, Static383.aClass48_9, Static59.aClass194_1, 1024, Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1, null);
										if (local1502 == null && Static100.aBoolean164) {
											Static128.method2229(local24);
										}
									} else {
										@Pc(1725) Class102 local1725 = Static333.aClass50_2.method1175(local24.anInt48);
										local1502 = local24.method49(Static182.aClass170_2, Static57.aClass196_1, local24.anInt112, local24.anInt82, Static179.aClass115_1, local24.anInt80, Static333.aClass50_2, Static207.aClass32_1, Static383.aClass48_9, Static59.aClass194_1, 1024, Static182.aClass1_Sub2_Sub1_Sub1_1.aClass158_1, local1725);
										if (local1502 == null && Static100.aBoolean164) {
											Static128.method2229(local24);
										}
									}
									if (local1502 != null) {
										if (local24.anInt70 <= 0) {
											local1215 = 512;
										} else {
											local1215 = (local24.anInt64 << 9) / local24.anInt70;
										}
										if (local24.anInt97 > 0) {
											local533 = (local24.anInt116 << 9) / local24.anInt97;
										} else {
											local533 = 512;
										}
										local535 = local24.anInt64 / 2 + local100 + (local1215 * local24.anInt88 >> 9);
										local583 = local24.anInt116 / 2 + local105 + (local24.anInt109 * local533 >> 9);
										Static61.aClass21_4.method3699();
										Static383.aClass48_9.method2482(Static61.aClass21_4);
										local609 = Class106.anIntArray240[local24.anInt44 << 3] * local24.anInt68 >> 15;
										local611 = Class106.anIntArray242[local24.anInt44 << 3] * local24.anInt68 >> 15;
										Static383.aClass48_9.method2469(local535, local583, local1215, local533);
										Static383.aClass48_9.method2460((float) local24.aShort1, local24.aBoolean15 ? (float) local24.aShort2 : (float) local24.aShort2 * 1.5F);
										if (arg8 == -1412584499 || Static383.aBoolean488) {
											Static383.aClass48_9.method2505();
											Static383.aClass48_9.method2503();
											Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
											Static383.aBoolean488 = false;
										}
										if (local24.aBoolean8) {
											Static383.aClass48_9.method2487(false);
										}
										Static172.aClass21_8.method3709(-local24.anInt102 << 3);
										Static172.aClass21_8.method3706(local24.anInt105 << 3);
										Static172.aClass21_8.method3701(local24.anInt57, local24.anInt117 + local609 + local268, local24.anInt117 + local611);
										Static172.aClass21_8.method3703(local24.anInt44 << 3);
										if (Static233.aBoolean335) {
											Static383.aClass48_9.method2452(local100, local105, local24.anInt64 + local100, local24.anInt116 + local105);
										}
										if (local24.aBoolean15) {
											local1502.method4933(Static172.aClass21_8, null, local24.anInt68);
										} else {
											local1502.method4952(Static172.aClass21_8, null, 1);
										}
										if (Static233.aBoolean335) {
											Static383.aClass48_9.method2496(arg7, arg0, arg4, arg5);
										}
										if (local24.aBoolean8) {
											Static383.aClass48_9.method2487(true);
										}
									}
								} else if (local24.anInt91 == 9) {
									if (local24.aBoolean13) {
										local268 = local105 + local24.anInt116;
										local1215 = local100 + local24.anInt64;
										local533 = local105;
									} else {
										local268 = local105;
										local533 = local24.anInt116 + local105;
										local1215 = local24.anInt64 + local100;
									}
									if (local24.anInt55 == 1) {
										Static383.aClass48_9.method2490(local100, local268, local1215, local533, local24.anInt103, 0);
									} else {
										Static383.aClass48_9.method2455(local100, local268, local1215, local533, local24.anInt103, local24.anInt55);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZIZI)V")
	public static void method1145(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static193.method3520(arg3, arg1, arg0, arg2, 0, Static222.aClass35_Sub1Array1.length - 1);
		Static73.aClass2_Sub22_1 = null;
		Static301.anInt5601 = 0;
	}
}
