import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
	public static int anInt1891;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt1887 = 16777215;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1751() {
		for (@Pc(1) int local1 = 0; local1 < Static251.anInt4680; local1++) {
			@Pc(6) int[] local6 = Static657.anIntArrayArray109[local1];
			for (@Pc(8) int local8 = 0; local8 < Static406.anInt6924; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!kh;IIIIIIIIIII)V")
	public static void method1752(@OriginalArg(0) Class208[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class208 local6 = arg0[local1];
			if (local6 != null && local6.anInt5634 == arg1) {
				@Pc(17) int local17 = local6.anInt5592 + arg6;
				@Pc(22) int local22 = local6.anInt5680 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt5643 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt5639;
					local45 = local22 + local6.anInt5630;
					if (local6.anInt5643 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt5643 == 0 || local6.aBoolean432 || method1754(local6).anInt19 != 0 || local6 == Static526.aClass208_10 || local6.anInt5659 == Static656.anInt1400 || local6.anInt5659 == Static300.anInt5498) {
					if (!method1768(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static649.aBoolean735) {
							local40 = Static359.method5380();
							local45 = Static265.method7952();
						}
						if (local6 == Static503.aClass208_9 && Static475.method7527(Static503.aClass208_9) != null) {
							Static303.aBoolean731 = true;
							Static96.anInt2065 = local17;
							Static344.anInt6204 = local22;
						}
						if (local6.aBoolean438 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean434 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub13 local168 = (Class3_Sub13) Static257.aClass193_27.method4457(); local168 != null; local168 = (Class3_Sub13) Static257.aClass193_27.method4459()) {
									if (local168.aBoolean194) {
										local168.method8770();
										local168.aClass208_2.aBoolean443 = false;
									}
								}
								if (Static149.anInt2809 == 0) {
									Static503.aClass208_9 = null;
									Static526.aClass208_10 = null;
								}
								Static523.anInt5720 = 0;
								Static28.aBoolean84 = false;
								Static321.aBoolean465 = false;
								if (!Static463.aBoolean600) {
									Static551.method7575();
								}
							}
							@Pc(232) boolean local232;
							if (Static542.aClass75_1.method8412() + local40 >= local28 && Static542.aClass75_1.method8405() + local45 >= local30 && Static542.aClass75_1.method8412() + local40 < local32 && Static542.aClass75_1.method8405() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static329.aBoolean166 && local232) {
								if (local6.anInt5629 >= 0) {
									Static267.anInt5035 = local6.anInt5629;
								} else if (local6.aBoolean434) {
									Static267.anInt5035 = -1;
								}
							}
							if (!Static463.aBoolean600 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static564.method8415(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static542.aClass75_1.method8408() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub21 local291 = (Class3_Sub21) Static565.aClass193_55.method4457();
							if (local291 != null && local291.method7983() == 0 && local291.method7977() + local40 >= local28 && local291.method7981() + local45 >= local30 && local291.method7977() + local40 < local32 && local291.method7981() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray58 != null && !Static255.method4048()) {
								for (local335 = 0; local335 < local6.aByteArray58.length; local335++) {
									if (Static530.aClass284_1.method7637(local6.aByteArray58[local335])) {
										if (local6.anIntArray366 == null || Static621.anInt9665 >= local6.anIntArray366[local335]) {
											@Pc(367) byte local367 = local6.aByteArray57[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static530.aClass284_1.method7637(86) && !Static530.aClass284_1.method7637(82) && !Static530.aClass284_1.method7637(81)) && ((local367 & 0x2) == 0 || Static530.aClass284_1.method7637(86)) && ((local367 & 0x1) == 0 || Static530.aClass284_1.method7637(82)) && ((local367 & 0x4) == 0 || Static530.aClass284_1.method7637(81))) {
												if (local335 < 10) {
													Static261.method4118(local6.anInt5653, -1, "", local335 + 1);
												} else if (local335 == 10) {
													Static61.method1523();
													@Pc(438) Class3_Sub1 local438 = method1754(local6);
													Static433.method6368(local438.anInt22, local438.method40(), local6);
													Static46.aString12 = Static630.method8308(local6);
													if (Static46.aString12 == null) {
														Static46.aString12 = "Null";
													}
													Static542.aString107 = local6.aString70 + "<col=ffffff>";
												}
												local469 = local6.anIntArray371[local335];
												if (local6.anIntArray366 == null) {
													local6.anIntArray366 = new int[local6.aByteArray58.length];
												}
												if (local469 == 0) {
													local6.anIntArray366[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray366[local335] = Static621.anInt9665 + local469;
												}
											}
										}
									} else if (local6.anIntArray366 != null) {
										local6.anIntArray366[local335] = 0;
									}
								}
							}
							if (local286) {
								Static677.method8740(local45 + local291.method7981() - local22, local40 + local291.method7977() - local17, local6);
							}
							if (Static503.aClass208_9 != null && Static503.aClass208_9 != local6 && local232 && method1754(local6).method39()) {
								Static267.aClass208_5 = local6;
							}
							if (local6 == Static526.aClass208_10) {
								Static363.aBoolean495 = true;
								Static216.anInt3996 = local17;
								Static551.anInt8933 = local22;
							}
							if (local6.aBoolean432 || local6.anInt5659 != 0) {
								@Pc(558) Class3_Sub13 local558;
								if (local232 && Static480.anInt8123 != 0 && local6.anObjectArray27 != null) {
									local558 = new Class3_Sub13();
									local558.aBoolean194 = true;
									local558.aClass208_2 = local6;
									local558.anInt2327 = Static480.anInt8123;
									local558.anObjectArray1 = local6.anObjectArray27;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static503.aClass208_9 != null || Static463.aBoolean600 || local6.anInt5659 != Static422.anInt7132 && Static523.anInt5720 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt5659 != 0) {
									if (local6.anInt5659 == Static62.anInt1560 || local6.anInt5659 == Static517.anInt8661) {
										Static663.aClass208_14 = local6;
										if (Static578.aClass10_1 != null) {
											Static578.aClass10_1.method91(Static582.aClass16_12, local6.anInt5630);
										}
										if (local6.anInt5659 == Static62.anInt1560) {
											if (Static463.aBoolean600 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static461.method6626(arg8, Static582.aClass16_12, arg9);
											@Pc(641) Class23_Sub8 local641 = (Class23_Sub8) Static57.aClass105_10.method2444();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt6306 && arg10 < local641.anInt6304 && arg11 >= local641.anInt6308 && arg11 < local641.anInt6305) {
													Static551.method7575();
													Static662.method8646(local641.aClass23_Sub2_Sub1_Sub2_1);
												}
												local641 = (Class23_Sub8) Static57.aClass105_10.method2448();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt5659 == Static656.anInt1400) {
										if (local6.method4715(Static582.aClass16_12) == null || Static364.anInt6467 != 0 && Static364.anInt6467 != 3 || Static463.aBoolean600 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray363[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray365[local708]) {
											continue;
										}
										local335 -= local6.anInt5639 / 2;
										local708 -= local6.anInt5630 / 2;
										if (Static378.anInt6662 == 4) {
											local747 = (int) Static204.aFloat82 & 0x3FFF;
										} else {
											local747 = (int) Static204.aFloat82 + Static56.anInt1426 & 0x3FFF;
										}
										@Pc(759) int local759 = Class3_Sub7_Sub2.anIntArray171[local747];
										@Pc(763) int local763 = Class3_Sub7_Sub2.anIntArray170[local747];
										if (Static378.anInt6662 != 4) {
											local759 = local759 * (Static433.anInt7606 + 256) >> 8;
											local763 = local763 * (Static433.anInt7606 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static378.anInt6662 == 4) {
											local813 = (Static140.anInt2658 >> 9) + (local792 >> 2);
											local821 = (Static276.anInt5174 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.method8625() - 1) * 256;
											local813 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 - local830 >> 9) + (local792 >> 2);
											local821 = (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 - local830 >> 9) - (local802 >> 2);
										}
										if (Static329.aBoolean166 && (Static7.anInt94 & 0x40) != 0) {
											@Pc(863) Class208 local863 = Static108.method2085(Static452.anInt7746, Static395.anInt6819);
											if (local863 == null) {
												Static61.method1523();
											} else {
												Static225.method3514(true, true, local6.anInt5645, Static158.anInt2968, local821, 1L, " ->", 20, Static46.aString12, (long) (local6.anInt5608 << 0 | local6.anInt5653), false, local813);
											}
											continue;
										}
										if (Static102.aClass181_38 == Static14.aClass181_5) {
											Static225.method3514(true, true, -1, -1, local821, 1L, "", 50, Static569.aClass335_28.method7694(Static319.anInt5939), 0L, false, local813);
										}
										Static225.method3514(true, true, -1, Static276.anInt5163, local821, 1L, "", 16, Static602.aString119, 0L, false, local813);
										continue;
									}
									if (local6.anInt5659 == Static422.anInt7132) {
										Static647.aClass208_13 = local6;
										if (local232) {
											Static28.aBoolean84 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7977() - local17 - local6.anInt5639 / 2) * 2.0D / (double) Static574.aFloat183);
											local708 = (int) -((double) (local45 + local291.method7981() - local22 - local6.anInt5630 / 2) * 2.0D / (double) Static574.aFloat183);
											local469 = Static176.anInt3320 + local335 + Static574.anInt8361;
											local747 = Static462.anInt7931 + local708 + Static574.anInt8366;
											@Pc(994) Class3_Sub6_Sub13 local994 = Static610.method8050();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method4387(local469, local999, local747);
											if (local999 != null) {
												if (Static530.aClass284_1.method7637(82) && Static13.anInt164 > 0) {
													Static106.method2058(local999[1], local999[0], local999[2]);
													continue;
												}
												Static321.aBoolean465 = true;
												Static638.anInt9839 = local999[0];
												Static435.anInt7628 = local999[1];
												Static36.anInt10061 = local999[2];
											}
											Static523.anInt5720 = 1;
											Static609.aBoolean493 = false;
											Static67.anInt9111 = Static542.aClass75_1.method8412();
											Static595.anInt9374 = Static542.aClass75_1.method8405();
											continue;
										}
										if (local276 && Static523.anInt5720 > 0) {
											if (Static523.anInt5720 == 1 && (Static67.anInt9111 != Static542.aClass75_1.method8412() || Static595.anInt9374 != Static542.aClass75_1.method8405())) {
												Static325.anInt6035 = Static176.anInt3320;
												Static122.anInt2392 = Static462.anInt7931;
												Static523.anInt5720 = 2;
											}
											if (Static523.anInt5720 == 2) {
												Static609.aBoolean493 = true;
												Static621.method8230(Static325.anInt6035 + (int) ((double) (Static67.anInt9111 - Static542.aClass75_1.method8412()) * 2.0D / (double) Static574.aFloat182));
												Static426.method6083(Static122.anInt2392 - (int) ((double) (Static595.anInt9374 - Static542.aClass75_1.method8405()) * 2.0D / (double) Static574.aFloat182));
											}
											continue;
										}
										if (Static523.anInt5720 > 0 && !Static609.aBoolean493) {
											if ((Static516.anInt8103 == 1 || Static101.method1997()) && Static37.anInt1104 > 2) {
												Static603.method8017(Static595.anInt9374, Static67.anInt9111);
											} else if (Static61.method1521()) {
												Static603.method8017(Static595.anInt9374, Static67.anInt9111);
											}
										}
										Static523.anInt5720 = 0;
										continue;
									}
									if (local6.anInt5659 == Static73.anInt1677) {
										if (local276) {
											Static424.method6043(local6.anInt5630, local40 + Static542.aClass75_1.method8412() - local17, local45 + Static542.aClass75_1.method8405() - local22, local6.anInt5639);
										}
										continue;
									}
									if (local6.anInt5659 == Static300.anInt5498) {
										Static488.method7009(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean439 && local286) {
									local6.aBoolean439 = true;
									if (local6.anObjectArray12 != null) {
										local558 = new Class3_Sub13();
										local558.aBoolean194 = true;
										local558.aClass208_2 = local6;
										local558.anInt2330 = local40 + local291.method7977() - local17;
										local558.anInt2327 = local45 + local291.method7981() - local22;
										local558.anObjectArray1 = local6.anObjectArray12;
										Static257.aClass193_27.method4462(local558);
									}
								}
								if (local6.aBoolean439 && local276 && local6.anObjectArray9 != null) {
									local558 = new Class3_Sub13();
									local558.aBoolean194 = true;
									local558.aClass208_2 = local6;
									local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
									local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
									local558.anObjectArray1 = local6.anObjectArray9;
									Static257.aClass193_27.method4462(local558);
								}
								if (local6.aBoolean439 && !local276) {
									local6.aBoolean439 = false;
									if (local6.anObjectArray10 != null) {
										local558 = new Class3_Sub13();
										local558.aBoolean194 = true;
										local558.aClass208_2 = local6;
										local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
										local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
										local558.anObjectArray1 = local6.anObjectArray10;
										Static459.aClass193_47.method4462(local558);
									}
								}
								if (local276 && local6.anObjectArray34 != null) {
									local558 = new Class3_Sub13();
									local558.aBoolean194 = true;
									local558.aClass208_2 = local6;
									local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
									local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
									local558.anObjectArray1 = local6.anObjectArray34;
									Static257.aClass193_27.method4462(local558);
								}
								if (!local6.aBoolean443 && local232) {
									local6.aBoolean443 = true;
									if (local6.anObjectArray16 != null) {
										local558 = new Class3_Sub13();
										local558.aBoolean194 = true;
										local558.aClass208_2 = local6;
										local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
										local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
										local558.anObjectArray1 = local6.anObjectArray16;
										Static257.aClass193_27.method4462(local558);
									}
								}
								if (local6.aBoolean443 && local232 && local6.anObjectArray21 != null) {
									local558 = new Class3_Sub13();
									local558.aBoolean194 = true;
									local558.aClass208_2 = local6;
									local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
									local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
									local558.anObjectArray1 = local6.anObjectArray21;
									Static257.aClass193_27.method4462(local558);
								}
								if (local6.aBoolean443 && !local232) {
									local6.aBoolean443 = false;
									if (local6.anObjectArray17 != null) {
										local558 = new Class3_Sub13();
										local558.aBoolean194 = true;
										local558.aClass208_2 = local6;
										local558.anInt2330 = local40 + Static542.aClass75_1.method8412() - local17;
										local558.anInt2327 = local45 + Static542.aClass75_1.method8405() - local22;
										local558.anObjectArray1 = local6.anObjectArray17;
										Static459.aClass193_47.method4462(local558);
									}
								}
								if (local6.anObjectArray25 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray25;
									Static68.aClass193_9.method4462(local558);
								}
								@Pc(1570) Class3_Sub13 local1570;
								if (local6.anObjectArray6 != null && Static331.anInt9794 > local6.anInt5631) {
									if (local6.anIntArray368 == null || Static331.anInt9794 - local6.anInt5631 > 32) {
										local558 = new Class3_Sub13();
										local558.aClass208_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray6;
										Static257.aClass193_27.method4462(local558);
									} else {
										label699: for (local335 = local6.anInt5631; local335 < Static331.anInt9794; local335++) {
											local708 = Static287.anIntArray345[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray368.length; local469++) {
												if (local6.anIntArray368[local469] == local708) {
													local1570 = new Class3_Sub13();
													local1570.aClass208_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray6;
													Static257.aClass193_27.method4462(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt5631 = Static331.anInt9794;
								}
								if (local6.anObjectArray28 != null && Static506.anInt8470 > local6.anInt5632) {
									if (local6.anIntArray369 == null || Static506.anInt8470 - local6.anInt5632 > 32) {
										local558 = new Class3_Sub13();
										local558.aClass208_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray28;
										Static257.aClass193_27.method4462(local558);
									} else {
										label675: for (local335 = local6.anInt5632; local335 < Static506.anInt8470; local335++) {
											local708 = Static646.anIntArray641[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray369.length; local469++) {
												if (local6.anIntArray369[local469] == local708) {
													local1570 = new Class3_Sub13();
													local1570.aClass208_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray28;
													Static257.aClass193_27.method4462(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt5632 = Static506.anInt8470;
								}
								if (local6.anObjectArray5 != null && Static166.anInt3025 > local6.anInt5669) {
									if (local6.anIntArray370 == null || Static166.anInt3025 - local6.anInt5669 > 32) {
										local558 = new Class3_Sub13();
										local558.aClass208_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray5;
										Static257.aClass193_27.method4462(local558);
									} else {
										label651: for (local335 = local6.anInt5669; local335 < Static166.anInt3025; local335++) {
											local708 = Static126.anIntArray160[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray370.length; local469++) {
												if (local6.anIntArray370[local469] == local708) {
													local1570 = new Class3_Sub13();
													local1570.aClass208_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray5;
													Static257.aClass193_27.method4462(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt5669 = Static166.anInt3025;
								}
								if (local6.anObjectArray35 != null && Static235.anInt4463 > local6.anInt5662) {
									if (local6.anIntArray367 == null || Static235.anInt4463 - local6.anInt5662 > 32) {
										local558 = new Class3_Sub13();
										local558.aClass208_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray35;
										Static257.aClass193_27.method4462(local558);
									} else {
										label627: for (local335 = local6.anInt5662; local335 < Static235.anInt4463; local335++) {
											local708 = Static32.anIntArray32[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray367.length; local469++) {
												if (local6.anIntArray367[local469] == local708) {
													local1570 = new Class3_Sub13();
													local1570.aClass208_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray35;
													Static257.aClass193_27.method4462(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt5662 = Static235.anInt4463;
								}
								if (local6.anObjectArray31 != null && Static254.anInt4807 > local6.anInt5635) {
									if (local6.anIntArray364 == null || Static254.anInt4807 - local6.anInt5635 > 32) {
										local558 = new Class3_Sub13();
										local558.aClass208_2 = local6;
										local558.anObjectArray1 = local6.anObjectArray31;
										Static257.aClass193_27.method4462(local558);
									} else {
										label603: for (local335 = local6.anInt5635; local335 < Static254.anInt4807; local335++) {
											local708 = Static427.anIntArray453[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray364.length; local469++) {
												if (local6.anIntArray364[local469] == local708) {
													local1570 = new Class3_Sub13();
													local1570.aClass208_2 = local6;
													local1570.anObjectArray1 = local6.anObjectArray31;
													Static257.aClass193_27.method4462(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt5635 = Static254.anInt4807;
								}
								if (Static23.anInt722 > local6.anInt5597 && local6.anObjectArray26 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray26;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static221.anInt4055 > local6.anInt5597 && local6.anObjectArray4 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static162.anInt2990 > local6.anInt5597 && local6.anObjectArray30 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray30;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static426.anInt7214 > local6.anInt5597 && local6.anObjectArray18 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray18;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static229.anInt9434 > local6.anInt5597 && local6.anObjectArray33 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray33;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static5.anInt41 > local6.anInt5597 && local6.anObjectArray24 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray24;
									Static257.aClass193_27.method4462(local558);
								}
								if (Static431.anInt7596 > local6.anInt5597 && local6.anObjectArray23 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray23;
									Static257.aClass193_27.method4462(local558);
								}
								local6.anInt5597 = Static373.anInt6615;
								if (local6.anObjectArray14 != null) {
									for (local335 = 0; local335 < Static29.anInt896; local335++) {
										@Pc(2082) Class3_Sub13 local2082 = new Class3_Sub13();
										local2082.aClass208_2 = local6;
										local2082.anInt2324 = Static48.anInterface18Array1[local335].method5673();
										local2082.anInt2322 = Static48.anInterface18Array1[local335].method5676();
										local2082.anObjectArray1 = local6.anObjectArray14;
										Static257.aClass193_27.method4462(local2082);
									}
								}
								if (Static236.aBoolean348 && local6.anObjectArray13 != null) {
									local558 = new Class3_Sub13();
									local558.aClass208_2 = local6;
									local558.anObjectArray1 = local6.anObjectArray13;
									Static257.aClass193_27.method4462(local558);
								}
							}
							if (local6.anInt5643 == 5 && local6.anInt5644 != -1) {
								local6.method4731(Static357.aClass322_4, Static377.aClass222_1).method91(Static582.aClass16_12, local6.anInt5630);
							}
							Static329.method1745(local6);
							if (local6.anInt5643 == 0) {
								method1752(arg0, local6.anInt5653, local28, local30, local32, local34, local17 - local6.anInt5594, local22 - local6.anInt5648, arg8, arg9, arg10, arg11);
								if (local6.aClass208Array20 != null) {
									method1752(local6.aClass208Array20, local6.anInt5653, local28, local30, local32, local34, local17 - local6.anInt5594, local22 - local6.anInt5648, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class3_Sub28 local2208 = (Class3_Sub28) Static222.aClass62_21.method1682((long) local6.anInt5653);
								if (local2208 != null) {
									if (Static102.aClass181_38 == Static341.aClass181_93 && local2208.anInt5253 == 0 && !Static463.aBoolean600 && local232 && !Static605.aBoolean708) {
										Static551.method7575();
									}
									Static512.method7237(local28, arg10, local2208.anInt5252, arg11, arg9, local32, local17, arg8, local30, local22, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static329.method1745(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1753() {
		@Pc(1) int local1 = Static187.anInt3432;
		@Pc(3) int[] local3 = Static668.anIntArray664;
		@Pc(8) int local8 = Static227.aClass3_Sub15_11.aClass17_Sub24_1.method7387();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class23_Sub2_Sub1_Sub2_Sub1 local32 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local3[local25]];
			if (!local32.method2907()) {
				local32.anInt10170 = -1;
			} else if (local32.aBoolean259) {
				local32.anInt10170 = -1;
			} else {
				local32.method8612();
				if (local32.aShort123 >= 0 && local32.aShort124 >= 0 && local32.aShort125 < Static251.anInt4680 && local32.aShort122 < Static406.anInt6924) {
					local32.aBoolean263 = local32.aBoolean748 ? local23 : false;
					if (local32 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2) {
						local32.anInt10170 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean747) {
							local85++;
						}
						if (local32.anInt10136 > Static621.anInt9665) {
							local85 += 2;
						}
						local85 += 5 - local32.method8625() << 2;
						if (local32.aBoolean262 || local32.aBoolean261) {
							local85 += 512;
						} else {
							if (Static380.anInt6677 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt10170 = local85 + 1;
					}
				} else {
					local32.anInt10170 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static308.anInt5687; local129++) {
			@Pc(140) Class23_Sub2_Sub1_Sub2_Sub2 local140 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local129])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (local140.method8632() && local140.aClass5_1.method52(Static592.aClass47_2)) {
				local140.method8612();
				if (local140.aShort123 >= 0 && local140.aShort124 >= 0 && local140.aShort125 < Static251.anInt4680 && local140.aShort122 < Static406.anInt6924) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean747) {
						local177++;
					}
					if (local140.anInt10136 > Static621.anInt9665) {
						local177 += 2;
					}
					local177 += 5 - local140.method8625() << 2;
					if (Static380.anInt6677 == 0) {
						if (local140.aClass5_1.aBoolean4) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static380.anInt6677 == 1) {
						if (local140.aClass5_1.aBoolean4) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass5_1.aBoolean6) {
						local177 += 1024;
					} else if (!local140.aClass5_1.aBoolean2) {
						local177 += 256;
					}
					local140.anInt10170 = local177 + 1;
				} else {
					local140.anInt10170 = -1;
				}
			} else {
				local140.anInt10170 = -1;
			}
		}
		for (local85 = 0; local85 < Static110.aClass70Array1.length; local85++) {
			@Pc(243) Class70 local243 = Static110.aClass70Array1[local85];
			if (local243 != null) {
				if (local243.anInt2023 == 1) {
					@Pc(257) Class3_Sub11 local257 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local243.anInt2021);
					if (local257 != null) {
						@Pc(262) Class23_Sub2_Sub1_Sub2_Sub2 local262 = local257.aClass23_Sub2_Sub1_Sub2_Sub2_1;
						if (local262.anInt10170 >= 0) {
							local262.anInt10170 += 2048;
						}
					}
				} else if (local243.anInt2023 == 10) {
					@Pc(281) Class23_Sub2_Sub1_Sub2_Sub1 local281 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local243.anInt2021];
					if (local281 != null && local281 != Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 && local281.anInt10170 >= 0) {
						local281.anInt10170 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kh;)Lclient!ab;")
	public static Class3_Sub1 method1754(@OriginalArg(0) Class208 arg0) {
		@Pc(13) Class3_Sub1 local13 = (Class3_Sub1) Static382.aClass62_30.method1682(((long) arg0.anInt5653 << 32) + (long) arg0.anInt5608);
		return local13 == null ? arg0.aClass3_Sub1_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!v;)V")
	public static void method1755(@OriginalArg(1) Class3_Sub6_Sub20 arg0) {
		arg0.method8342();
		@Pc(10) boolean local10 = false;
		for (@Pc(15) Class3_Sub6_Sub20 local15 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local15 != null; local15 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
			if (Static331.method8340(arg0.method8245(), local15.method8245())) {
				Static550.method7561(arg0, local15);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static239.aClass258_3.method5936(arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1758(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static187.anInt3432;
		@Pc(3) int[] local3 = Static668.anIntArray664;
		@Pc(11) int local11 = Static592.aBoolean196 ? local1 : local1 + Static308.anInt5687;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class23_Sub2_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local13 - local1])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			}
			if (local23.aByte142 == arg0) {
				local23.anInt10123 = 0;
				if (local23.anInt10170 < 0) {
					local23.aBoolean747 = false;
				} else {
					@Pc(54) int local54 = local23.method8625();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10108 & 0x1FF) != 0 || (local23.anInt10109 & 0x1FF) != 0) {
							local23.aBoolean747 = false;
							continue;
						}
					} else if ((local23.anInt10108 & 0x1FF) != 256 || (local23.anInt10109 & 0x1FF) != 256) {
						local23.aBoolean747 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10108 >> 9;
						local101 = local23.anInt10109 >> 9;
						if (local23.anInt10170 != Static657.anIntArrayArray109[local96][local101]) {
							local23.aBoolean747 = true;
							continue;
						}
						if (Static470.anIntArrayArray79[local96][local101] > 1) {
							local126 = Static470.anIntArrayArray79[local96][local101]--;
							local23.aBoolean747 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10108 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10109 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10108 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10109 + local96 >> 9;
						if (!Static363.method5415(local169, local101, local162, local155, local23.anInt10170)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt10170 == Static657.anIntArrayArray109[local180][local183]) {
										local126 = Static470.anIntArrayArray79[local180][local183]--;
									}
								}
							}
							local23.aBoolean747 = true;
							continue;
						}
					}
					local23.aBoolean747 = false;
					local23.anInt10114 = Static194.method5133(local23.anInt10108, local23.anInt10109, local23.aByte142);
					Static309.method4748(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1759() {
		Static324.anInt6012 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static308.anInt5687; local3++) {
			@Pc(14) Class23_Sub2_Sub1_Sub2_Sub2 local14 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local3])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			if (local14.aBoolean747 && local14.method8614() != -1) {
				@Pc(32) int local32 = (local14.method8625() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10108 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10109 - local32 >> 9;
				@Pc(53) Class23_Sub2_Sub1_Sub2 local53 = Static318.method4998(local39, local14.aByte142, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt10180;
					if (local53 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt10123 == 0 && local53.method8614() != -1) {
						Static80.anIntArray666[Static324.anInt6012] = local58;
						Static173.anIntArray225[Static324.anInt6012] = local58;
						Static324.anInt6012++;
						local53.anInt10123++;
					}
					Static80.anIntArray666[Static324.anInt6012] = local58;
					Static173.anIntArray225[Static324.anInt6012] = local14.anInt10180 + 2048;
					Static324.anInt6012++;
					local53.anInt10123++;
				}
			}
		}
		Static268.method4279(Static80.anIntArray666, Static173.anIntArray225, Static324.anInt6012 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZLclient!ha;Lclient!c;Lclient!ka;IIIIIIII)Lclient!ka;")
	public static Class28 method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2, @OriginalArg(4) Class48 arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg4 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method1520(arg7, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(55) long local55 = (long) (arg9 + (arg5 << 16) + (arg10 << 24)) + ((long) arg12 << 32) + ((long) arg6 << 48);
		@Pc(57) Class279 local57 = Static415.aClass279_37;
		@Pc(65) Class28 local65;
		synchronized (Static415.aClass279_37) {
			local65 = (Class28) Static415.aClass279_37.method6631(local55);
		}
		if (local65 == null || arg2.method8122(local65.ua(), local11) != 0) {
			if (local65 != null) {
				local11 = arg2.method8198(local11, local65.ua());
			}
			@Pc(97) byte local97;
			if (arg9 == 1) {
				local97 = 9;
			} else if (arg9 == 2) {
				local97 = 12;
			} else if (arg9 == 3) {
				local97 = 15;
			} else if (arg9 == 4) {
				local97 = 18;
			} else {
				local97 = 21;
			}
			@Pc(139) int[] local139 = new int[] { 64, 96, 128 };
			@Pc(157) Class73 local157 = new Class73(local97 * 3 + 1, -local97 + local97 * 6, 0);
			@Pc(164) int local164 = local157.method1896(0, 0, 0);
			@Pc(168) int[][] local168 = new int[3][local97];
			@Pc(176) int local176;
			@Pc(180) int local180;
			@Pc(182) int local182;
			@Pc(206) int local206;
			for (@Pc(170) int local170 = 0; local170 < 3; local170++) {
				local176 = local139[local170];
				local180 = local139[local170];
				for (local182 = 0; local182 < local97; local182++) {
					@Pc(190) int local190 = (local182 << 14) / local97;
					@Pc(198) int local198 = Class3_Sub7_Sub2.anIntArray171[local190] * local176 >> 14;
					local206 = local180 * Class3_Sub7_Sub2.anIntArray170[local190] >> 14;
					local168[local170][local182] = local157.method1896(local198, 0, local206);
				}
			}
			for (local176 = 0; local176 < 3; local176++) {
				local180 = (local176 * 256 + 128) / 3;
				local182 = 256 - local180;
				@Pc(256) byte local256 = (byte) (local180 * arg10 + arg5 * local182 >> 8);
				@Pc(301) short local301 = (short) (((arg6 & 0xFC00) * local180 + (arg12 & 0xFC00) * local182 & 0xFC0000) + ((arg12 & 0x380) * local182 + local180 * (arg6 & 0x380) & 0x38000) + ((arg12 & 0x7F) * local182 + local180 * (arg6 & 0x7F) & 0x7F00) >> 8);
				for (local206 = 0; local206 < local97; local206++) {
					if (local176 == 0) {
						local157.method1897((byte) -1, (byte) 1, (short) -1, local256, local168[0][local206], local301, local168[0][(local206 + 1) % local97], local164);
					} else {
						local157.method1897((byte) -1, (byte) 1, (short) -1, local256, local168[local176][(local206 + 1) % local97], local301, local168[local176 - 1][(local206 + 1) % local97], local168[local176 - 1][local206]);
						local157.method1897((byte) -1, (byte) 1, (short) -1, local256, local168[local176][local206], local301, local168[local176][(local206 + 1) % local97], local168[local176 - 1][local206]);
					}
				}
			}
			local65 = arg2.method8137(local157, local11, Static405.anInt6913, 64, 768);
			@Pc(420) Class279 local420 = Static415.aClass279_37;
			synchronized (Static415.aClass279_37) {
				Static415.aClass279_37.method6635(local65, local55);
			}
		}
		@Pc(436) int local436 = arg4.V();
		@Pc(439) int local439 = arg4.RA();
		@Pc(442) int local442 = arg4.HA();
		@Pc(445) int local445 = arg4.G();
		@Pc(447) Class3_Sub6_Sub11 local447 = null;
		if (arg3 != null) {
			@Pc(454) int local454 = arg3.anIntArray72[arg7];
			local447 = Static483.aClass373_2.method8321(local454 >> 16);
			arg7 = local454 & 0xFFFF;
		}
		if (local447 == null) {
			local65 = local65.method6900((byte) 3, local11, true);
			local65.O(local439 - local436 >> 1, 128, local445 - local442 >> 1);
			local65.H(local439 + local436 >> 1, 0, local445 + local442 >> 1);
		} else {
			local65 = local65.method6900((byte) 3, local11, true);
			local65.O(local439 - local436 >> 1, 128, local445 - local442 >> 1);
			local65.H(local436 + local439 >> 1, 0, local445 + local442 >> 1);
			local65.method6890(arg7, local447);
		}
		if (arg11 != 0) {
			local65.FA(arg11);
		}
		if (arg0 != 0) {
			local65.VA(arg0);
		}
		if (arg1 != 0) {
			local65.H(0, arg1, 0);
		}
		return local65;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1764(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static187.anInt3432;
		@Pc(3) int[] local3 = Static668.anIntArray664;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static308.anInt5687; local5++) {
			@Pc(15) Class23_Sub2_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local5 - local1])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			}
			if (local15.aByte142 == arg0 && local15.anInt10170 >= 0) {
				@Pc(39) int local39 = local15.method8625();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10108 & 0x1FF) != 0 || (local15.anInt10109 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10108 & 0x1FF) != 256 || (local15.anInt10109 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10108 >> 9;
					local80 = local15.anInt10109 >> 9;
					if (local15.anInt10170 > Static657.anIntArrayArray109[local75][local80]) {
						Static657.anIntArrayArray109[local75][local80] = local15.anInt10170;
						Static470.anIntArrayArray79[local75][local80] = 1;
					} else if (local15.anInt10170 == Static657.anIntArrayArray109[local75][local80]) {
						local116 = Static470.anIntArrayArray79[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10108 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10109 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10108 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10109 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt10170 > Static657.anIntArrayArray109[local158][local161]) {
								Static657.anIntArrayArray109[local158][local161] = local15.anInt10170;
								Static470.anIntArrayArray79[local158][local161] = 1;
							} else if (local15.anInt10170 == Static657.anIntArrayArray109[local158][local161]) {
								local116 = Static470.anIntArrayArray79[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1765() {
		@Pc(1) int local1 = Static187.anInt3432;
		@Pc(3) int[] local3 = Static668.anIntArray664;
		@Pc(11) int local11 = Static592.aBoolean196 ? local1 : local1 + Static308.anInt5687;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class23_Sub2_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local13 - local1])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			}
			if (local23.anInt10170 >= 0) {
				@Pc(43) int local43 = local23.method8625();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10108 & 0x1FF) == 0 && (local23.anInt10109 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10108 & 0x1FF) == 256 && (local23.anInt10109 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10114 = Static194.method5133(local23.anInt10108, local23.anInt10109, local23.aByte142);
				Static309.method4748(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kh;)Lclient!kh;")
	public static Class208 method1766(@OriginalArg(0) Class208 arg0) {
		@Pc(4) int local4 = method1754(arg0).method36();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static676.method8728(arg0.anInt5634);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kh;)Z")
	public static boolean method1768(@OriginalArg(0) Class208 arg0) {
		if (Static605.aBoolean708) {
			if (method1754(arg0).anInt19 != 0) {
				return false;
			}
			if (arg0.anInt5643 == 0) {
				return false;
			}
		}
		return arg0.aBoolean445;
	}
}
