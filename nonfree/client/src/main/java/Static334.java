import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "[I")
	public static int[] anIntArray437;

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
	public static final int anInt5455 = 50;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
	public static final int[] anIntArray433 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "[I")
	public static final int[] anIntArray434 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "[I")
	public static final int[] anIntArray435 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "[I")
	public static final int[] anIntArray436 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[anInt5455];

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "[I")
	public static final int[] anIntArray438 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "[I")
	public static final int[] anIntArray439 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "[I")
	public static final int[] anIntArray440 = new int[anInt5455];

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBLclient!id;IZII)V")
	public static void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static418.anInt7061 >= 50 || (arg1 == null || arg1.anIntArrayArray36 == null || arg4 >= arg1.anIntArrayArray36.length || arg1.anIntArrayArray36[arg4] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray36[arg4][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray36[arg4].length > 1) {
			local59 = (int) (Math.random() * (double) arg1.anIntArrayArray36[arg4].length);
			if (local59 > 0) {
				local36 = arg1.anIntArrayArray36[arg4][local59];
			}
		}
		@Pc(75) int local75 = local32 & 0x1F;
		if (local75 == 0) {
			if (arg3) {
				Static341.method4516(0, local42, local36, 255);
			}
		} else if (Static413.aClass49_Sub1_1.anInt3204 != 0) {
			local59 = arg0 - 64 >> 7;
			@Pc(116) int local116 = arg5 - 64 >> 7;
			Static246.aClass46Array1[Static418.anInt7061++] = new Class46((byte) 1, local36, local42, 0, 255, (local59 << 16) + (arg2 << 24) + (local116 << 8) + local75);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!fh;I)Ljava/lang/String;")
	public static String method4420(@OriginalArg(0) Class4_Sub9 arg0) {
		return Static308.method4032(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIII[Lclient!hd;I)V")
	public static void method4422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class110[] arg7, @OriginalArg(9) int arg8) {
		Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
		for (@Pc(27) int local27 = 0; local27 < arg7.length; local27++) {
			@Pc(33) Class110 local33 = arg7[local27];
			if (local33 != null && (arg3 == local33.anInt2649 || arg3 == -1412584499 && local33 == Static11.aClass110_1)) {
				@Pc(57) int local57;
				if (arg6 == -1) {
					Class4_Sub9.aRectangleArray3[Static177.anInt3224].setBounds(local33.anInt2622 + arg4, arg1 + local33.anInt2643, local33.anInt2617, local33.anInt2590);
					local57 = Static177.anInt3224++;
				} else {
					local57 = arg6;
				}
				local33.anInt2623 = Static265.anInt4371;
				local33.anInt2620 = local57;
				if (!Static55.method760(local33)) {
					if (local33.anInt2638 != 0) {
						Static185.method2558(local33);
					}
					@Pc(105) int local105 = arg4 + local33.anInt2622;
					@Pc(110) int local110 = arg1 + local33.anInt2643;
					@Pc(113) int local113 = local33.anInt2651;
					if (Static37.aBoolean35 && (Static55.method752(local33).anInt3514 != 0 || local33.anInt2627 == 0) && local113 > 127) {
						local113 = 127;
					}
					@Pc(175) int local175;
					@Pc(179) int local179;
					if (local33 == Static11.aClass110_1) {
						if (arg3 != -1412584499 && (Static377.anInt3940 == local33.anInt2647 || local33.anInt2647 == Static189.anInt3488)) {
							Static13.anInt192 = arg1;
							Static271.aClass110Array2 = arg7;
							Static20.anInt1662 = arg4;
							continue;
						}
						if (Static188.aBoolean268 && Static240.aBoolean299) {
							local175 = Static455.aClass48_1.method1138();
							local179 = Static455.aClass48_1.method1142();
							local175 -= Static337.anInt5501;
							local179 -= Static204.anInt3612;
							if (local175 < Static105.anInt1944) {
								local175 = Static105.anInt1944;
							}
							if (Static105.anInt1944 + Static216.aClass110_9.anInt2617 < local33.anInt2617 + local175) {
								local175 = Static216.aClass110_9.anInt2617 + Static105.anInt1944 - local33.anInt2617;
							}
							if (local179 < Static389.anInt6348) {
								local179 = Static389.anInt6348;
							}
							local105 = local175;
							if (Static389.anInt6348 + Static216.aClass110_9.anInt2590 < local179 + local33.anInt2590) {
								local179 = Static216.aClass110_9.anInt2590 + Static389.anInt6348 - local33.anInt2590;
							}
							local110 = local179;
						}
						if (local33.anInt2647 == Static189.anInt3488) {
							local113 = 128;
						}
					}
					@Pc(310) int local310;
					@Pc(317) int local317;
					@Pc(268) int local268;
					@Pc(273) int local273;
					if (local33.anInt2627 == 2) {
						local317 = arg2;
						local175 = arg0;
						local179 = arg8;
						local310 = arg5;
					} else {
						local268 = local105 + local33.anInt2617;
						local273 = local33.anInt2590 + local110;
						local179 = local110 > arg8 ? local110 : arg8;
						local175 = local105 <= arg0 ? arg0 : local105;
						if (local33.anInt2627 == 9) {
							local268++;
							local273++;
						}
						local310 = local268 < arg5 ? local268 : arg5;
						local317 = arg2 > local273 ? local273 : arg2;
					}
					if (local175 < local310 && local179 < local317) {
						@Pc(600) int local600;
						@Pc(624) int local624;
						@Pc(626) int local626;
						@Pc(550) int local550;
						@Pc(552) int local552;
						if (local33.anInt2638 != 0) {
							if (Static215.anInt5488 == local33.anInt2638 || Static436.anInt7237 == local33.anInt2638) {
								Static406.method5512(local105, local110, local33.anInt2638 == Static436.anInt7237, local33.anInt2590, local33.anInt2617);
								Static72.aBooleanArray7[local57] = true;
								Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
								continue;
							}
							if (Static270.anInt4513 == local33.anInt2638) {
								if (local33.method2064(Static39.aClass135_1) != null) {
									Static150.method2112();
									Static357.method4710(Static39.aClass135_1, local33, local110, local105);
									Static324.aBooleanArray26[local57] = true;
									Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
								}
								continue;
							}
							if (Static4.anInt88 == local33.anInt2638) {
								if (local33.method2064(Static39.aClass135_1) != null) {
									Static435.method5782(local105, local33, local110);
									Static324.aBooleanArray26[local57] = true;
									Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
								}
								continue;
							}
							if (local33.anInt2638 == Static76.anInt1526) {
								Static171.method2387(Static91.anInterface5_2, Static39.aClass135_1, local33.anInt2590, local33.anInt2617, local110, local105);
								Static72.aBooleanArray7[local57] = true;
								Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
								continue;
							}
							if (Static272.anInt4522 == local33.anInt2638) {
								Static139.method1979(Static39.aClass135_1, local105, local110, local33.anInt2590, local33.anInt2617);
								Static72.aBooleanArray7[local57] = true;
								Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
								continue;
							}
							if (Static76.anInt1532 == local33.anInt2638) {
								if (!Static397.aBoolean449 && !Static170.aBoolean514) {
									continue;
								}
								local268 = local105 + local33.anInt2617;
								local273 = local110 + 15;
								if (Static397.aBoolean449) {
									Static283.aClass123_6.method5799("Fps:" + Static418.anInt7060, local273, -256, local268);
									local273 += 15;
									@Pc(541) Runtime local541 = Runtime.getRuntime();
									local550 = (int) ((local541.totalMemory() - local541.freeMemory()) / 1024L);
									local552 = -256;
									if (local550 > 65536) {
										local552 = -65536;
									}
									Static283.aClass123_6.method5799("Mem:" + local550 + "k", local273, local552, local268);
									local273 += 15;
									Static283.aClass123_6.method5799("In:" + Static347.anInt5756 + "B/s Out:" + Static449.anInt7510 + "B/s", local273, -256, local268);
									local273 += 15;
									local600 = Static39.aClass135_1.IA() / 1024;
									Static283.aClass123_6.method5799("Offheap:" + local600 + "k", local273, local600 > 65536 ? -65536 : -256, local268);
									local273 += 15;
									local624 = 0;
									local626 = 0;
									@Pc(628) int local628 = 0;
									for (@Pc(630) int local630 = 0; local630 < 30; local630++) {
										local624 += Static339.aClass124_Sub1Array2[local630].method5843();
										local626 += Static339.aClass124_Sub1Array2[local630].method5846();
										local628 += Static339.aClass124_Sub1Array2[local630].method5842();
									}
									@Pc(670) int local670 = local628 * 100 / local624;
									@Pc(676) int local676 = local626 * 10000 / local624;
									@Pc(696) String local696 = "Cache:" + Static125.method1759((long) local676, 0, 2, true) + "% (" + local670 + "%)";
									Static378.aClass123_7.method5799(local696, local273, -256, local268);
									local273 += 12;
								}
								if (Static226.anInt3895 > 0) {
									Static378.aClass123_7.method5799("Particles: " + Static294.anInt4827 + " / " + Static226.anInt3895, local273, -256, local268);
								}
								local273 += 12;
								if (Static170.aBoolean514) {
									Static378.aClass123_7.method5799("Polys: " + Static39.aClass135_1.ZA() + " Models: " + Static39.aClass135_1.w(), local273, -256, local268);
									local273 += 12;
									Static378.aClass123_7.method5799("Ls: " + Static62.anInt1112 + " La: " + Static100.anInt1833 + " NPC: " + Static182.anInt3339 + " Pl: " + Static308.anInt5041, local273, -256, local268);
									local273 += 12;
									Static453.method6003();
								}
								Static72.aBooleanArray7[local57] = true;
								continue;
							}
						}
						if (local33.anInt2627 == 0) {
							if (local33.anInt2638 == Static157.anInt2962 && Static39.aClass135_1.method5355()) {
								Static39.aClass135_1.method5404(local105, local110, local33.anInt2617, local33.anInt2590);
							}
							method4422(local175, local110 - local33.anInt2642, local317, local33.anInt2675, local105 - local33.anInt2630, local310, local57, arg7, local179);
							if (local33.aClass110Array1 != null) {
								method4422(local175, local110 - local33.anInt2642, local317, local33.anInt2675, local105 - local33.anInt2630, local310, local57, local33.aClass110Array1, local179);
							}
							@Pc(858) Class4_Sub8 local858 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local33.anInt2675);
							if (local858 != null) {
								Static84.method4134(local179, local317, local858.anInt861, local110, local310, local57, local175, local105);
							}
							if (local33.anInt2638 == Static157.anInt2962 && Static39.aClass135_1.method5355()) {
								Static39.aClass135_1.method5330();
								Static50.aBoolean47 = true;
							}
							Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
						}
						if (Static154.aBooleanArray15[local57] || Static271.anInt4516 > 1) {
							if (local33.anInt2627 == 3) {
								if (local113 == 0) {
									if (local33.aBoolean182) {
										Static39.aClass135_1.O(local105, local110, local33.anInt2617, local33.anInt2590, local33.anInt2665, 0);
									} else {
										Static39.aClass135_1.method5354(local105, local110, local33.anInt2617, local33.anInt2590, local33.anInt2665, 0);
									}
								} else if (local33.aBoolean182) {
									Static39.aClass135_1.O(local105, local110, local33.anInt2617, local33.anInt2590, local33.anInt2665 & 0xFFFFFF | 255 - (local113 & 0xFF) << 24, 1);
								} else {
									Static39.aClass135_1.method5354(local105, local110, local33.anInt2617, local33.anInt2590, 255 - (local113 & 0xFF) << 24 | local33.anInt2665 & 0xFFFFFF, 1);
								}
							} else if (local33.anInt2627 == 4) {
								@Pc(995) Class123 local995 = local33.method2057(Static39.aClass135_1);
								if (local995 != null) {
									local273 = local33.anInt2665;
									@Pc(1010) String local1010 = local33.aString19;
									if (local33.anInt2588 != -1) {
										@Pc(1020) Class80 local1020 = Static416.aClass64_2.method1372(local33.anInt2588);
										local1010 = local1020.aString10;
										if (local1010 == null) {
											local1010 = "null";
										}
										if ((local1020.anInt2005 == 1 || local33.anInt2610 != 1) && local33.anInt2610 != -1) {
											local1010 = "<col=ff9040>" + local1010 + "</col> x" + Static338.method4460(local33.anInt2610);
										}
									}
									if (Static246.aClass110_11 == local33) {
										local1010 = Static368.aClass15_110.method180(Static429.anInt6999);
										local273 = local33.anInt2665;
									}
									if (Static111.aBoolean145) {
										Static39.aClass135_1.fa(local105, local110, local105 + local33.anInt2617, local110 - -local33.anInt2590);
									}
									local995.method5790(local105, local33.aBoolean172 ? 255 - (local113 & 0xFF) << 24 : -1, null, local33.anInt2617, local33.anInt2600, 0, local33.anInt2592, 255 - (local113 & 0xFF) << 24 | local273, local33.anInt2631, 0, local33.anInt2590, null, local1010, local110, local33.anInt2654, Static164.aClass95Array6);
									if (Static111.aBoolean145) {
										Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
									}
								} else if (Static261.aBoolean315) {
									Static118.method1693(local33);
								}
							} else {
								@Pc(1218) int local1218;
								if (local33.anInt2627 == 5) {
									if (local33.anInt2677 >= 0) {
										local33.method2054(Static344.aClass263_1, Static28.aClass129_3).method4302(Static39.aClass135_1, local33.anInt2653 << 3, local33.anInt2590, local105, 0, local110, local33.anInt2617, local33.anInt2666 << 3, 0);
									} else {
										@Pc(1203) Class95 local1203;
										if (local33.anInt2588 == -1) {
											local1203 = local33.method2060(Static39.aClass135_1);
										} else {
											@Pc(1185) Class60 local1185 = local33.aBoolean183 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null;
											local1203 = Static416.aClass64_2.method1364(local33.anInt2661 | 0xFF000000, local33.anInt2610, local33.anInt2616, local1185, Static39.aClass135_1, local33.anInt2588, local33.anInt2628);
										}
										if (local1203 != null) {
											local273 = local1203.j();
											local1218 = local1203.T();
											local550 = 255 - (local113 & 0xFF) << 24 | (local33.anInt2665 == 0 ? 16777215 : local33.anInt2665 & 0xFFFFFF);
											if (local33.aBoolean185) {
												Static39.aClass135_1.fa(local105, local110, local105 + local33.anInt2617, local33.anInt2590 + local110);
												if (local33.anInt2604 != 0) {
													local552 = (local33.anInt2617 + local273 - 1) / local273;
													local600 = (local1218 + local33.anInt2590 - 1) / local1218;
													for (local624 = 0; local624 < local552; local624++) {
														for (local626 = 0; local626 < local600; local626++) {
															if (local33.anInt2665 == 0) {
																local1203.method5824((float) (local105 + local624 * local273) + (float) local273 / 2.0F, (float) (local110 - -(local626 * local1218)) + (float) local1218 / 2.0F, 4096, local33.anInt2604);
															} else {
																local1203.method5825((float) local273 / 2.0F + (float) (local105 + local273 * local624), (float) local1218 / 2.0F + (float) (local110 - -(local626 * local1218)), 4096, local33.anInt2604, local550);
															}
														}
													}
												} else if (local33.anInt2665 == 0 && local113 == 0) {
													local1203.method5826(local105, local110, local33.anInt2617, local33.anInt2590);
												} else {
													local1203.JA(local105, local110, local33.anInt2617, local33.anInt2590, 0, local550, 1);
												}
												Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
											} else if (local33.anInt2665 == 0 && local113 == 0) {
												if (local33.anInt2604 != 0) {
													local1203.method5824((float) local105 + (float) local33.anInt2617 / 2.0F, (float) local110 + (float) local33.anInt2590 / 2.0F, local33.anInt2617 * 4096 / local273, local33.anInt2604);
												} else if (local273 == local33.anInt2617 && local33.anInt2590 == local1218) {
													local1203.method5821(local105, local110);
												} else {
													local1203.method5819(local105, local110, local33.anInt2617, local33.anInt2590);
												}
											} else if (local33.anInt2604 != 0) {
												local1203.method5825((float) local105 + (float) local33.anInt2617 / 2.0F, (float) local110 + (float) local33.anInt2590 / 2.0F, local33.anInt2617 * 4096 / local273, local33.anInt2604, local550);
											} else if (local33.anInt2617 == local273 && local1218 == local33.anInt2590) {
												local1203.r(local105, local110, 0, local550, 1);
											} else {
												local1203.s(local105, local110, local33.anInt2617, local33.anInt2590, 0, local550, 1);
											}
										} else if (Static261.aBoolean315) {
											Static118.method1693(local33);
										}
									}
								} else if (local33.anInt2627 == 6) {
									Static98.method1496();
									@Pc(1573) Class116 local1573 = null;
									local273 = 0;
									@Pc(1607) Class119 local1607;
									@Pc(1615) Class60 local1615;
									if (local33.anInt2588 != -1) {
										@Pc(1586) Class80 local1586 = Static416.aClass64_2.method1372(local33.anInt2588);
										if (local1586 != null) {
											local1586 = local1586.method1592(local33.anInt2610);
											local1607 = local33.anInt2667 == -1 ? null : Static170.aClass125_3.method2389(local33.anInt2667);
											local1615 = local33.aBoolean183 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null;
											local1573 = local1586.method1589(Static39.aClass135_1, local33.anInt2624, 2048, local33.anInt2660, local1607, local33.anInt2664, local1615, 1);
											if (local1573 == null) {
												Static118.method1693(local33);
											} else {
												local273 = -local1573.MA() >> 1;
											}
										}
									} else if (local33.anInt2593 == 5) {
										local1218 = local33.anInt2658;
										if (local1218 >= 0 && local1218 < 2048) {
											@Pc(1796) Class8_Sub3_Sub1_Sub1 local1796 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local1218];
											@Pc(1809) Class119 local1809 = local33.anInt2667 == -1 ? null : Static170.aClass125_3.method2389(local33.anInt2667);
											if (local1796 != null && (Static12.anInt187 == local1218 || Static429.method5630(local1796.aString60) == local33.anInt2599)) {
												local1573 = local1796.aClass60_1.method1326(-1, local33.anInt2664, 2048, null, null, local33.anInt2660, Static39.aClass135_1, 0, local1809, 0, Static52.aClass81_1, Static120.aClass115_2, local33.anInt2624, Static445.aClass1_1, Static170.aClass125_3, Static416.aClass64_2, Static116.aClass101_2);
											}
										}
									} else if (local33.anInt2593 == 8 || local33.anInt2593 == 9) {
										@Pc(1733) Class4_Sub25 local1733 = Static242.method3222(false, local33.anInt2658);
										local1607 = local33.anInt2667 == -1 ? null : Static170.aClass125_3.method2389(local33.anInt2667);
										if (local1733 != null) {
											local1615 = local33.aBoolean183 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null;
											local1573 = local1733.method3314(local33.anInt2599, local1615, local33.anInt2624, Static39.aClass135_1, local33.anInt2593 == 9, local33.anInt2660, local33.anInt2664, local1607);
										}
									} else if (local33.anInt2667 == -1) {
										local1573 = local33.method2061(Static170.aClass125_3, -1, Static445.aClass1_1, Static52.aClass81_1, Static39.aClass135_1, Static116.aClass101_2, Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1, 2048, -1, Static416.aClass64_2, 0, null, Static120.aClass115_2);
										if (local1573 == null && Static261.aBoolean315) {
											Static118.method1693(local33);
										}
									} else {
										@Pc(1672) Class119 local1672 = Static170.aClass125_3.method2389(local33.anInt2667);
										local1573 = local33.method2061(Static170.aClass125_3, local33.anInt2660, Static445.aClass1_1, Static52.aClass81_1, Static39.aClass135_1, Static116.aClass101_2, Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1, 2048, local33.anInt2664, Static416.aClass64_2, local33.anInt2624, local1672, Static120.aClass115_2);
										if (local1573 == null && Static261.aBoolean315) {
											Static118.method1693(local33);
										}
									}
									if (local1573 != null) {
										if (local33.anInt2621 <= 0) {
											local1218 = 512;
										} else {
											local1218 = (local33.anInt2617 << 9) / local33.anInt2621;
										}
										if (local33.anInt2632 <= 0) {
											local550 = 512;
										} else {
											local550 = (local33.anInt2590 << 9) / local33.anInt2632;
										}
										local552 = (local1218 * local33.anInt2635 >> 9) + local105 + local33.anInt2617 / 2;
										local600 = (local33.anInt2646 * local550 >> 9) + local33.anInt2590 / 2 + local110;
										Static423.aClass35_5.xa();
										Static39.aClass135_1.ea(Static423.aClass35_5);
										Static39.aClass135_1.H(local552, local600, local1218, local550);
										Static39.aClass135_1.g((float) (local33.anInt2655 << 0), local33.aBoolean174 ? (float) (local33.anInt2587 << 0) : (float) (local33.anInt2587 << 0) * 1.5F);
										if (arg3 == -1412584499 || Static50.aBoolean47) {
											Static39.aClass135_1.e();
											Static39.aClass135_1.method5395();
											Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
											Static50.aBoolean47 = false;
										}
										if (local33.aBoolean175) {
											Static39.aClass135_1.method5336(false);
										}
										local624 = (local33.anInt2650 << 0) * Class100.anIntArray206[local33.anInt2619 << 3] >> 15;
										local626 = Class100.anIntArray208[local33.anInt2619 << 3] * (local33.anInt2650 << 0) >> 15;
										Static412.aClass35_4.O(-local33.anInt2659 << 3);
										Static412.aClass35_4.ja(local33.anInt2597 << 3);
										Static412.aClass35_4.o(local33.anInt2607 << 0, local273 + (local33.anInt2657 << 0) + local624, local626 - -(local33.anInt2657 << 0));
										Static412.aClass35_4.ka(local33.anInt2619 << 3);
										if (Static111.aBoolean145) {
											Static39.aClass135_1.fa(local105, local110, local105 + local33.anInt2617, local110 + local33.anInt2590);
										}
										if (local33.aBoolean174) {
											local1573.method3104(Static412.aClass35_4, null, local33.anInt2650 << 0);
										} else {
											local1573.method3117(Static412.aClass35_4, null, 1);
										}
										if (Static111.aBoolean145) {
											Static39.aClass135_1.OA(arg0, arg8, arg5, arg2);
										}
										if (local33.aBoolean175) {
											Static39.aClass135_1.method5336(true);
										}
										Static39.aClass135_1.g(0.0F, 0.0F);
									}
								} else if (local33.anInt2627 == 9) {
									if (local33.aBoolean173) {
										local550 = local110;
										local1218 = local105 + local33.anInt2617;
										local273 = local33.anInt2590 + local110;
									} else {
										local1218 = local105 + local33.anInt2617;
										local273 = local110;
										local550 = local33.anInt2590 + local110;
									}
									if (local33.anInt2648 == 1) {
										Static39.aClass135_1.method5328(local105, local273, local1218, local550, local33.anInt2665, 0);
									} else {
										Static39.aClass135_1.method5374(local105, local273, local1218, local550, local33.anInt2665, local33.anInt2648);
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
