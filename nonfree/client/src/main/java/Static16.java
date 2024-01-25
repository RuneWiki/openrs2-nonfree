import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt6421;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!c;")
	public static Class33 aClass33_10;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_145 = new Class253(53, 11);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method5101() {
		Static108.aClass7_Sub8_Sub3_1.method4501();
		Static351.anInt5638 = 1;
		Static126.aClass178_41 = null;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
	public static void method5104() {
		if (Static37.anInt654 > 1) {
			Static302.anInt5112 = Static90.anInt1865;
			Static37.anInt654--;
		}
		if (Static59.anInt1060 > 0) {
			Static59.anInt1060--;
		}
		if (Static28.aBoolean13) {
			Static28.aBoolean13 = false;
			method5106();
			return;
		}
		if (!Static331.aBoolean372) {
			Static27.method307();
		}
		for (@Pc(33) int local33 = 0; local33 < 100 && Static94.method1665(); local33++) {
		}
		if (Static206.anInt3642 != 9) {
			return;
		}
		Static88.method1556(Static315.aClass2_83.method6(), Static255.aClass7_Sub14_Sub1_2);
		if (Static4.aClass7_Sub29_3 == null) {
			if (Static158.method2342() >= Static18.aLong17) {
				Static4.aClass7_Sub29_3 = Static39.aClass198_1.method4089(Static393.aClass124_5.aString37);
			}
		} else if (Static4.aClass7_Sub29_3.anInt3815 != -1) {
			Static81.method1414(Static445.aClass2_21);
			Static255.aClass7_Sub14_Sub1_2.method3993(Static4.aClass7_Sub29_3.anInt3815);
			Static4.aClass7_Sub29_3 = null;
			Static18.aLong17 = Static158.method2342() + 30000L;
		}
		@Pc(99) Class7_Sub12 local99 = (Class7_Sub12) Static204.aClass85_37.method2010();
		@Pc(113) int local113;
		@Pc(135) int local135;
		@Pc(150) int local150;
		@Pc(163) boolean local163;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(227) int local227;
		if (local99 != null || Static158.method2342() - 2000L > Static149.aLong168) {
			@Pc(110) boolean local110 = false;
			local113 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
			for (@Pc(118) Class7_Sub12 local118 = (Class7_Sub12) Static57.aClass85_5.method2010(); local118 != null && Static255.aClass7_Sub14_Sub1_2.anInt4989 - local113 < 240; local118 = (Class7_Sub12) Static57.aClass85_5.method2000()) {
				local118.method5802();
				local135 = local118.method943();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local150 = local118.method942();
				if (local150 < 0) {
					local150 = 0;
				} else if (local150 > 65534) {
					local150 = 65534;
				}
				local163 = false;
				if (local118.method943() == -1 && local118.method942() == -1) {
					local163 = true;
					local150 = -1;
					local135 = -1;
				}
				if (local150 != Static212.anInt3805 || local135 != Static183.anInt3294) {
					if (!local110) {
						Static81.method1414(Static46.aClass2_15);
						Static255.aClass7_Sub14_Sub1_2.method3970(0);
						local110 = true;
						local113 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
					}
					local209 = local150 - Static212.anInt3805;
					Static212.anInt3805 = local150;
					local216 = local135 - Static183.anInt3294;
					Static183.anInt3294 = local135;
					local227 = (int) ((local118.method939() - Static149.aLong168) / 20L);
					if (local227 < 8 && local209 >= -32 && local209 <= 31 && local216 >= -32 && local216 <= 31) {
						local216 += 32;
						local209 += 32;
						Static255.aClass7_Sub14_Sub1_2.method3993((local209 << 6) + (local227 << 12) + local216);
					} else if (local227 < 32 && local209 >= -128 && local209 <= 127 && local216 >= -128 && local216 <= 127) {
						local216 += 128;
						local209 += 128;
						Static255.aClass7_Sub14_Sub1_2.method3970(local227 + 128);
						Static255.aClass7_Sub14_Sub1_2.method3993((local209 << 8) + local216);
					} else if (local227 < 32) {
						Static255.aClass7_Sub14_Sub1_2.method3970(local227 + 192);
						if (local163) {
							Static255.aClass7_Sub14_Sub1_2.method3933(Integer.MIN_VALUE);
						} else {
							Static255.aClass7_Sub14_Sub1_2.method3933(local135 << 16 | local150);
						}
					} else {
						Static255.aClass7_Sub14_Sub1_2.method3993(local227 + 57344);
						if (local163) {
							Static255.aClass7_Sub14_Sub1_2.method3933(Integer.MIN_VALUE);
						} else {
							Static255.aClass7_Sub14_Sub1_2.method3933(local135 << 16 | local150);
						}
					}
					Static149.aLong168 = local118.method939();
				}
			}
			if (local110) {
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local113);
			}
		}
		@Pc(397) int local397;
		@Pc(450) int local450;
		if (local99 != null) {
			@Pc(383) long local383 = (local99.method939() - Static119.aLong63) / 50L;
			Static119.aLong63 = local99.method939();
			if (local383 > 32767L) {
				local383 = 32767L;
			}
			local397 = local99.method943();
			if (local397 < 0) {
				local397 = 0;
			} else if (local397 > 65535) {
				local397 = 65535;
			}
			local135 = local99.method942();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(435) byte local435 = 0;
			if (local99.method940() == 2) {
				local435 = 1;
			}
			Static81.method1414(Static138.aClass2_47);
			local450 = (int) local383;
			Static255.aClass7_Sub14_Sub1_2.method3955(local450 | local435 << 15);
			Static255.aClass7_Sub14_Sub1_2.method3964(local135 | local397 << 16);
		}
		@Pc(477) int local477;
		if (Static425.anInt7000 > 0) {
			local477 = 0;
			for (local113 = 0; local113 < Static425.anInt7000; local113++) {
				if (Static42.aClass16Array1[local113].method5099()) {
					local477++;
				}
			}
			if (local477 > 0) {
				Static81.method1414(Class95.lb);
				if (local477 > 75) {
					local477 = 75;
				}
				Static255.aClass7_Sub14_Sub1_2.method3970(local477 * 3);
				for (local397 = 0; local397 < Static425.anInt7000; local397++) {
					@Pc(526) Class16 local526 = Static42.aClass16Array1[local397];
					if (local526.method5099()) {
						@Pc(539) long local539 = (local526.method5103() - Static187.aLong117) / 50L;
						Static187.aLong117 = local526.method5103();
						if (local539 > 65535L) {
							local539 = 65535L;
						}
						Static255.aClass7_Sub14_Sub1_2.method3970(local526.method5108());
						Static255.aClass7_Sub14_Sub1_2.method3993((int) local539);
					}
				}
			}
		}
		if (Static238.anInt4079 > 0) {
			Static238.anInt4079--;
		}
		if (Static213.aBoolean230 && Static238.anInt4079 <= 0) {
			Static213.aBoolean230 = false;
			Static238.anInt4079 = 20;
			Static81.method1414(Static193.aClass2_58);
			Static255.aClass7_Sub14_Sub1_2.method3993((int) Static67.aFloat36 >> 3);
			Static255.aClass7_Sub14_Sub1_2.method3993((int) Static97.aFloat52 >> 3);
		}
		if (Static173.aBoolean186 && !Static257.aBoolean276) {
			Static257.aBoolean276 = true;
			Static81.method1414(Static146.aClass2_102);
			Static255.aClass7_Sub14_Sub1_2.method3970(1);
		}
		if (!Static173.aBoolean186 && Static257.aBoolean276) {
			Static257.aBoolean276 = false;
			Static81.method1414(Static146.aClass2_102);
			Static255.aClass7_Sub14_Sub1_2.method3970(0);
		}
		if (!Static169.aBoolean182) {
			Static81.method1414(Static26.aClass2_10);
			Static255.aClass7_Sub14_Sub1_2.method3970(0);
			local477 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
			@Pc(665) Class7_Sub14 local665 = Static130.aClass153_Sub1_1.method4225();
			Static255.aClass7_Sub14_Sub1_2.method3952(local665.anInt4989, local665.aByteArray75);
			Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local477);
			Static169.aBoolean182 = true;
		}
		if (Static19.aClass223ArrayArrayArray1 != null) {
			if (Static9.anInt60 == 2) {
				Static329.method4323();
			} else if (Static9.anInt60 == 3) {
				Static376.method4835();
			}
		}
		if (Static277.aBoolean293) {
			Static277.aBoolean293 = false;
		} else {
			Static218.aFloat108 /= 2.0F;
		}
		if (Static213.aBoolean229) {
			Static213.aBoolean229 = false;
		} else {
			Static323.aFloat154 /= 2.0F;
		}
		Static350.method4522();
		if (Static206.anInt3642 != 9) {
			return;
		}
		Static422.method5410();
		Static252.method3361();
		Static43.method588();
		Static446.method5668();
		Static376.anInt6106++;
		if (Static376.anInt6106 > 750) {
			method5106();
			return;
		}
		Static423.method5442();
		Static418.method5230();
		Static214.method2088();
		for (local477 = Static224.aClass239_7.method4997(true); local477 != -1; local477 = Static224.aClass239_7.method4997(false)) {
			Static59.method822(local477);
			Static360.anIntArray529[Static294.anInt4904++ & 0x1F] = local477;
		}
		@Pc(837) Class95 local837;
		for (@Pc(784) Class7_Sub4_Sub14 local784 = Static353.method4544(); local784 != null; local784 = Static353.method4544()) {
			local397 = local784.method4714();
			local135 = local784.method4715();
			if (local397 == 1) {
				Static101.anIntArray136[local135] = local784.anInt5868;
				Static351.aBoolean381 |= Static196.aBooleanArray18[local135];
				Static335.anIntArray495[Static82.anInt1668++ & 0x1F] = local135;
			} else if (local397 == 2) {
				Static91.aStringArray13[local135] = local784.aString57;
				Static237.anIntArray357[Static206.anInt3644++ & 0x1F] = local135;
			} else if (local397 == 3) {
				local837 = Static313.method4088(local135);
				if (!local784.aString57.equals(local837.aString28)) {
					local837.aString28 = local784.aString57;
					Static413.method5189(local837);
				}
			} else if (local397 == 4) {
				local837 = Static313.method4088(local135);
				local450 = local784.anInt5868;
				local209 = local784.anInt5867;
				local216 = local784.anInt5870;
				if (local450 != local837.anInt2673 || local837.anInt2665 != local209 || local837.anInt2626 != local216) {
					local837.anInt2665 = local209;
					local837.anInt2626 = local216;
					local837.anInt2673 = local450;
					Static413.method5189(local837);
				}
			} else if (local397 == 5) {
				local837 = Static313.method4088(local135);
				if (local837.anInt2659 != local784.anInt5868 || local784.anInt5868 == -1) {
					local837.anInt2582 = 0;
					local837.anInt2659 = local784.anInt5868;
					local837.anInt2639 = 1;
					local837.anInt2621 = 0;
					Static413.method5189(local837);
				}
			} else if (local397 == 6) {
				local150 = local784.anInt5868;
				local450 = local150 >> 10 & 0x1F;
				local209 = local150 >> 5 & 0x1F;
				local216 = local150 & 0x1F;
				local227 = (local209 << 11) + (local450 << 19) + (local216 << 3);
				@Pc(1277) Class95 local1277 = Static313.method4088(local135);
				if (local227 != local1277.anInt2653) {
					local1277.anInt2653 = local227;
					Static413.method5189(local1277);
				}
			} else if (local397 == 7) {
				local837 = Static313.method4088(local135);
				local163 = local784.anInt5868 == 1;
				if (local837.aBoolean164 != local163) {
					local837.aBoolean164 = local163;
					Static413.method5189(local837);
				}
			} else if (local397 == 8) {
				local837 = Static313.method4088(local135);
				if (local837.anInt2670 != local784.anInt5868 || local784.anInt5867 != local837.anInt2618 || local784.anInt5870 != local837.anInt2667) {
					local837.anInt2670 = local784.anInt5868;
					local837.anInt2667 = local784.anInt5870;
					local837.anInt2618 = local784.anInt5867;
					if (local837.anInt2599 != -1) {
						if (local837.anInt2635 > 0) {
							local837.anInt2667 = local837.anInt2667 * 32 / local837.anInt2635;
						} else if (local837.anInt2598 > 0) {
							local837.anInt2667 = local837.anInt2667 * 32 / local837.anInt2598;
						}
					}
					Static413.method5189(local837);
				}
			} else if (local397 == 9) {
				local837 = Static313.method4088(local135);
				if (local784.anInt5868 != local837.anInt2599 || local837.anInt2604 != local784.anInt5867) {
					local837.anInt2604 = local784.anInt5867;
					local837.anInt2599 = local784.anInt5868;
					Static413.method5189(local837);
				}
			} else if (local397 == 10) {
				local837 = Static313.method4088(local135);
				if (local784.anInt5868 != local837.anInt2650 || local784.anInt5867 != local837.anInt2631 || local784.anInt5870 != local837.anInt2625) {
					local837.anInt2625 = local784.anInt5870;
					local837.anInt2631 = local784.anInt5867;
					local837.anInt2650 = local784.anInt5868;
					Static413.method5189(local837);
				}
			} else if (local397 == 11) {
				local837 = Static313.method4088(local135);
				local837.aByte25 = 0;
				local837.anInt2601 = local837.anInt2675 = local784.anInt5868;
				local837.anInt2584 = local837.anInt2586 = local784.anInt5867;
				local837.aByte26 = 0;
				Static413.method5189(local837);
			} else if (local397 == 12) {
				local837 = Static313.method4088(local135);
				local450 = local784.anInt5868;
				if (local837 != null && local837.anInt2616 == 0) {
					if (local837.anInt2645 - local837.anInt2638 < local450) {
						local450 = local837.anInt2645 - local837.anInt2638;
					}
					if (local450 < 0) {
						local450 = 0;
					}
					if (local450 != local837.anInt2585) {
						local837.anInt2585 = local450;
						Static413.method5189(local837);
					}
				}
			} else if (local397 == 14) {
				local837 = Static313.method4088(local135);
				local837.anInt2636 = local784.anInt5868;
			} else if (local397 == 15) {
				Static89.anInt1837 = local784.anInt5867;
				Static153.anInt5631 = local784.anInt5868;
				Static404.aBoolean507 = true;
			} else if (local397 == 16) {
				local837 = Static313.method4088(local135);
				local837.anInt2649 = local784.anInt5868;
			}
		}
		if (Static80.anInt1631 != 0) {
			Static339.anInt5511 += 20;
			if (Static339.anInt5511 >= 400) {
				Static80.anInt1631 = 0;
			}
		}
		Static436.anInt7296++;
		if (Static293.aClass95_12 != null) {
			Static74.anInt1409++;
			if (Static74.anInt1409 >= 15) {
				Static413.method5189(Static293.aClass95_12);
				Static293.aClass95_12 = null;
			}
		}
		Static342.aClass95_14 = null;
		Static51.aBoolean46 = false;
		Static129.aBoolean141 = false;
		Static282.aClass95_11 = null;
		Static299.method3998(-1, null, -1);
		Static79.method1388(-1, -1, null);
		if (!Static402.aBoolean412) {
			Static194.anInt3446 = -1;
		}
		Static391.method4976();
		Static90.anInt1865++;
		if (Static17.aBoolean7) {
			Static81.method1414(Static294.aClass2_75);
			Static255.aClass7_Sub14_Sub1_2.method3964(Static400.anInt5906 | Static294.anInt4906 << 14 | Static90.anInt1868 << 28);
			Static17.aBoolean7 = false;
		}
		while (true) {
			@Pc(1417) Class7_Sub18 local1417;
			@Pc(1422) Class95 local1422;
			do {
				local1417 = (Class7_Sub18) Static459.aClass85_38.method2004();
				if (local1417 == null) {
					while (true) {
						do {
							local1417 = (Class7_Sub18) Static205.aClass85_22.method2004();
							if (local1417 == null) {
								while (true) {
									do {
										local1417 = (Class7_Sub18) Static451.aClass85_48.method2004();
										if (local1417 == null) {
											if (Static282.aClass95_11 == null) {
												Static168.anInt3037 = 0;
											}
											if (Static191.aClass95_9 != null) {
												Static40.method2439();
											}
											if (Static157.anInt2920 > 0 && Static310.aClass130_1.method5069(82) && Static310.aClass130_1.method5069(81) && Static217.anInt3861 != 0) {
												local397 = Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 - Static217.anInt3861;
												if (local397 < 0) {
													local397 = 0;
												} else if (local397 > 3) {
													local397 = 3;
												}
												Static114.method1941(local397, Static314.anInt5181 + Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0], Static359.anInt5713 + Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0]);
											}
											Static428.method5535();
											for (local397 = 0; local397 < 5; local397++) {
												@Pc(1620) int local1620 = Static356.anIntArray523[local397]++;
											}
											if (Static351.aBoolean381 && Static44.aLong33 < Static158.method2342() - 60000L) {
												Static157.method2340();
											}
											for (@Pc(1643) Class28_Sub1_Sub2 local1643 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3598(); local1643 != null; local1643 = (Class28_Sub1_Sub2) Static45.aClass169_2.method3597()) {
												if ((long) local1643.anInt7352 < Static158.method2342() / 1000L - 5L) {
													if (local1643.aShort101 > 0) {
														Static336.method4383(5, 0, "", local1643.aString71 + Static128.aClass55_58.method1205(Static5.anInt20), "");
													}
													if (local1643.aShort101 == 0) {
														Static336.method4383(5, 0, "", local1643.aString71 + Static355.aClass55_78.method1205(Static5.anInt20), "");
													}
													local1643.method5642();
												}
											}
											Static356.anInt5681++;
											if (Static356.anInt5681 > 500) {
												Static356.anInt5681 = 0;
												local150 = (int) (Math.random() * 8.0D);
												if ((local150 & 0x4) == 4) {
													Static243.anInt4160 += Static354.anInt5669;
												}
												if ((local150 & 0x1) == 1) {
													Static31.anInt520 += Static172.anInt3086;
												}
												if ((local150 & 0x2) == 2) {
													Static436.anInt7299 += Static455.anInt6332;
												}
											}
											if (Static31.anInt520 < -50) {
												Static172.anInt3086 = 2;
											}
											if (Static436.anInt7299 < -55) {
												Static455.anInt6332 = 2;
											}
											if (Static31.anInt520 > 50) {
												Static172.anInt3086 = -2;
											}
											if (Static436.anInt7299 > 55) {
												Static455.anInt6332 = -2;
											}
											if (Static243.anInt4160 < -40) {
												Static354.anInt5669 = 1;
											}
											if (Static243.anInt4160 > 40) {
												Static354.anInt5669 = -1;
											}
											Static250.anInt4249++;
											if (Static250.anInt4249 > 500) {
												Static250.anInt4249 = 0;
												local150 = (int) (Math.random() * 8.0D);
												if ((local150 & 0x1) == 1) {
													Static436.anInt7298 += Static207.anInt3651;
												}
												if ((local150 & 0x2) == 2) {
													Static3.anInt11 += Static69.anInt1363;
												}
											}
											if (Static436.anInt7298 < -60) {
												Static207.anInt3651 = 2;
											}
											if (Static436.anInt7298 > 60) {
												Static207.anInt3651 = -2;
											}
											if (Static3.anInt11 < -20) {
												Static69.anInt1363 = 1;
											}
											if (Static3.anInt11 > 10) {
												Static69.anInt1363 = -1;
											}
											Static48.anInt748++;
											if (Static48.anInt748 > 50) {
												Static81.method1414(Static407.aClass2_101);
											}
											if (Static453.aBoolean504) {
												Static24.method251();
												Static453.aBoolean504 = false;
											}
											try {
												if (Static211.aClass247_4 != null && Static255.aClass7_Sub14_Sub1_2.anInt4989 > 0) {
													Static209.anInt3682 += Static255.aClass7_Sub14_Sub1_2.anInt4989;
													Static211.aClass247_4.method5151(Static255.aClass7_Sub14_Sub1_2.anInt4989, Static255.aClass7_Sub14_Sub1_2.aByteArray75);
													Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
													Static48.anInt748 = 0;
													return;
												}
												return;
											} catch (@Pc(1903) IOException local1903) {
												method5106();
												return;
											}
										}
										local1422 = local1417.aClass95_5;
										if (local1422.anInt2602 < 0) {
											break;
										}
										local837 = Static313.method4088(local1422.anInt2646);
									} while (local837 == null || local837.aClass95Array1 == null || local1422.anInt2602 >= local837.aClass95Array1.length || local837.aClass95Array1[local1422.anInt2602] != local1422);
									Static159.method2352(local1417);
								}
							}
							local1422 = local1417.aClass95_5;
							if (local1422.anInt2602 < 0) {
								break;
							}
							local837 = Static313.method4088(local1422.anInt2646);
						} while (local837 == null || local837.aClass95Array1 == null || local837.aClass95Array1.length <= local1422.anInt2602 || local837.aClass95Array1[local1422.anInt2602] != local1422);
						Static159.method2352(local1417);
					}
				}
				local1422 = local1417.aClass95_5;
				if (local1422.anInt2602 < 0) {
					break;
				}
				local837 = Static313.method4088(local1422.anInt2646);
			} while (local837 == null || local837.aClass95Array1 == null || local837.aClass95Array1.length <= local1422.anInt2602 || local837.aClass95Array1[local1422.anInt2602] != local1422);
			Static159.method2352(local1417);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)I")
	public static int method5105(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
	public static void method5106() {
		if (Static206.anInt3642 == 6) {
			Static362.method4646(false);
		} else if (Static59.anInt1060 > 0) {
			Static362.method4646(Static385.aBoolean406);
		} else {
			Static355.aClass247_3 = Static211.aClass247_4;
			Static211.aClass247_4 = null;
			Static138.method2151(12);
		}
	}
}
