import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_74 = new Class187(50, -1);

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method6956() {
		if (Static563.anInt9175 > 1) {
			Static563.anInt9175--;
			Static658.anInt9448 = Static293.anInt4549;
		}
		if (Static396.aBoolean496) {
			Static396.aBoolean496 = false;
			Static360.method5289();
			return;
		}
		if (!Static423.aBoolean549) {
			Static301.method4088();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static125.method1953(); local27++) {
		}
		if (Static539.anInt8853 != 10) {
			return;
		}
		@Pc(53) Class5_Sub16 local53;
		@Pc(62) int local62;
		while (Static358.method5283()) {
			local53 = Static455.method6717(Static474.aClass187_76, Static16.aClass332_8);
			local53.aClass5_Sub15_Sub2_1.method3651(0);
			local62 = local53.aClass5_Sub15_Sub2_1.anInt4144;
			Static75.method1103(local53.aClass5_Sub15_Sub2_1);
			local53.aClass5_Sub15_Sub2_1.method3649(local53.aClass5_Sub15_Sub2_1.anInt4144 - local62);
			Static479.method7038(local53);
		}
		if (Static584.aClass5_Sub33_2 == null) {
			if (Static452.aLong241 <= Static124.method1947()) {
				Static584.aClass5_Sub33_2 = Static548.aClass231_1.method5373(Static6.aClass365_1.aString112);
			}
		} else if (Static584.aClass5_Sub33_2.anInt5994 != -1) {
			local53 = Static455.method6717(Static571.aClass187_92, Static16.aClass332_8);
			local53.aClass5_Sub15_Sub2_1.method3660(Static584.aClass5_Sub33_2.anInt5994);
			Static479.method7038(local53);
			Static584.aClass5_Sub33_2 = null;
			Static452.aLong241 = Static124.method1947() + 30000L;
		}
		@Pc(133) Class5_Sub25 local133 = (Class5_Sub25) Static598.aClass124_96.method2572();
		@Pc(150) int local150;
		@Pc(175) int local175;
		@Pc(191) int local191;
		@Pc(242) int local242;
		@Pc(249) int local249;
		@Pc(261) int local261;
		@Pc(148) Class5_Sub16 local148;
		if (local133 != null || Static124.method1947() - 2000L > Static548.aLong274) {
			local148 = null;
			local150 = 0;
			for (@Pc(155) Class5_Sub25 local155 = (Class5_Sub25) Static364.aClass124_62.method2572(); local155 != null && (local148 == null || local148.aClass5_Sub15_Sub2_1.anInt4144 - local150 < 240); local155 = (Class5_Sub25) Static364.aClass124_62.method2569()) {
				local155.method8829();
				local175 = local155.method3313();
				if (local175 < -1) {
					local175 = -1;
				} else if (local175 > 65534) {
					local175 = 65534;
				}
				local191 = local155.method3315();
				if (local191 < -1) {
					local191 = -1;
				} else if (local191 > 65534) {
					local191 = 65534;
				}
				if (local191 != Static400.anInt6919 || Static662.anInt10351 != local175) {
					if (local148 == null) {
						local148 = Static455.method6717(Static224.aClass187_47, Static16.aClass332_8);
						local148.aClass5_Sub15_Sub2_1.method3651(0);
						local150 = local148.aClass5_Sub15_Sub2_1.anInt4144;
					}
					local242 = local191 - Static400.anInt6919;
					Static400.anInt6919 = local191;
					local249 = local175 - Static662.anInt10351;
					Static662.anInt10351 = local175;
					local261 = (int) ((local155.method3314() - Static548.aLong274) / 20L);
					if (local261 < 8 && local242 >= -32 && local242 <= 31 && local249 >= -32 && local249 <= 31) {
						local249 += 32;
						local242 += 32;
						local148.aClass5_Sub15_Sub2_1.method3660((local242 << 6) + (local261 << 12) + local249);
					} else if (local261 < 32 && local242 >= -128 && local242 <= 127 && local249 >= -128 && local249 <= 127) {
						local242 += 128;
						local148.aClass5_Sub15_Sub2_1.method3651(local261 + 128);
						local249 += 128;
						local148.aClass5_Sub15_Sub2_1.method3660((local242 << 8) + local249);
					} else if (local261 >= 32) {
						local148.aClass5_Sub15_Sub2_1.method3660(local261 + 57344);
						if (local191 == 1 || local175 == -1) {
							local148.aClass5_Sub15_Sub2_1.method3679(Integer.MIN_VALUE);
						} else {
							local148.aClass5_Sub15_Sub2_1.method3679(local175 << 16 | local191);
						}
					} else {
						local148.aClass5_Sub15_Sub2_1.method3651(local261 + 192);
						if (local191 == 1 || local175 == -1) {
							local148.aClass5_Sub15_Sub2_1.method3679(Integer.MIN_VALUE);
						} else {
							local148.aClass5_Sub15_Sub2_1.method3679(local191 | local175 << 16);
						}
					}
					Static548.aLong274 = local155.method3314();
				}
			}
			if (local148 != null) {
				local148.aClass5_Sub15_Sub2_1.method3649(local148.aClass5_Sub15_Sub2_1.anInt4144 - local150);
				Static479.method7038(local148);
			}
		}
		@Pc(463) int local463;
		if (local133 != null) {
			@Pc(447) long local447 = (local133.method3314() - Static291.aLong328) / 50L;
			Static291.aLong328 = local133.method3314();
			if (local447 > 32767L) {
				local447 = 32767L;
			}
			local463 = local133.method3313();
			if (local463 < 0) {
				local463 = 0;
			} else if (local463 > 65535) {
				local463 = 65535;
			}
			local175 = local133.method3315();
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 65535) {
				local175 = 65535;
			}
			@Pc(499) byte local499 = 0;
			if (local133.method3318() == 2) {
				local499 = 1;
			}
			local242 = (int) local447;
			@Pc(520) Class5_Sub16 local520 = Static455.method6717(Static544.aClass187_82, Static16.aClass332_8);
			local520.aClass5_Sub15_Sub2_1.method3696(local499 << 15 | local242);
			local520.aClass5_Sub15_Sub2_1.method3697(local463 << 16 | local175);
			Static479.method7038(local520);
		}
		@Pc(579) long local579;
		if (Static225.anInt3592 > 0) {
			local148 = Static455.method6717(Static112.aClass187_33, Static16.aClass332_8);
			local148.aClass5_Sub15_Sub2_1.method3651(Static225.anInt3592 * 3);
			for (local150 = 0; local150 < Static225.anInt3592; local150++) {
				@Pc(570) Interface18 local570 = Static421.anInterface18Array2[local150];
				local579 = (local570.method5310() - Static390.aLong320) / 50L;
				Static390.aLong320 = local570.method5310();
				if (local579 > 65535L) {
					local579 = 65535L;
				}
				local148.aClass5_Sub15_Sub2_1.method3651(local570.method5314());
				local148.aClass5_Sub15_Sub2_1.method3660((int) local579);
			}
			Static479.method7038(local148);
		}
		if (Static130.anInt2219 > 0) {
			Static130.anInt2219--;
		}
		if (Static550.aBoolean649 && Static130.anInt2219 <= 0) {
			Static550.aBoolean649 = false;
			Static130.anInt2219 = 20;
			local148 = Static455.method6717(Static518.aClass187_89, Static16.aClass332_8);
			local148.aClass5_Sub15_Sub2_1.method3696((int) Static329.aFloat117 >> 3);
			local148.aClass5_Sub15_Sub2_1.method3660((int) Static495.aFloat161 >> 3);
			Static479.method7038(local148);
		}
		if (Static269.aBoolean284 != Static324.aBoolean434) {
			Static269.aBoolean284 = Static324.aBoolean434;
			local148 = Static455.method6717(Static531.aClass187_81, Static16.aClass332_8);
			local148.aClass5_Sub15_Sub2_1.method3651(Static324.aBoolean434 ? 1 : 0);
			Static479.method7038(local148);
		}
		if (!Static97.aBoolean118) {
			local148 = Static455.method6717(Static57.aClass187_19, Static16.aClass332_8);
			local148.aClass5_Sub15_Sub2_1.method3651(0);
			local150 = local148.aClass5_Sub15_Sub2_1.anInt4144;
			@Pc(712) Class5_Sub15 local712 = Static655.aClass5_Sub36_29.method5352();
			local148.aClass5_Sub15_Sub2_1.method3685(local712.aByteArray45, local712.anInt4144, 0);
			local148.aClass5_Sub15_Sub2_1.method3649(local148.aClass5_Sub15_Sub2_1.anInt4144 - local150);
			Static479.method7038(local148);
			Static97.aBoolean118 = true;
		}
		if (Static129.aClass313ArrayArrayArray7 != null) {
			if (Static133.anInt2254 == 2) {
				Static516.method3867();
			} else if (Static133.anInt2254 == 3) {
				Static362.method5336();
			}
		}
		if (Static19.aBoolean7) {
			Static19.aBoolean7 = false;
		} else {
			Static644.aFloat196 /= 2.0F;
		}
		if (Static479.aBoolean593) {
			Static479.aBoolean593 = false;
		} else {
			Static147.aFloat198 /= 2.0F;
		}
		Static605.method8130();
		if (Static539.anInt8853 != 10) {
			return;
		}
		Static194.method8417();
		Static97.method1622();
		Static67.method958();
		Static554.anInt3890++;
		if (Static554.anInt3890 > 750) {
			Static360.method5289();
			return;
		}
		Static642.method8488();
		Static184.method2683();
		Static112.method1812();
		for (local62 = Static413.aClass63_1.method1217(true); local62 != -1; local62 = Static413.aClass63_1.method1217(false)) {
			Static619.method8292(local62);
			Static259.anIntArray251[Static599.anInt9730++ & 0x1F] = local62;
		}
		for (@Pc(836) Class5_Sub2_Sub4 local836 = Static373.method5517(); local836 != null; local836 = Static373.method5517()) {
			local463 = local836.method2437();
			local579 = local836.method2441();
			if (local463 == 1) {
				Static205.anIntArray184[(int) local579] = local836.anInt2749;
				Static439.aBoolean565 |= Static155.aBooleanArray3[(int) local579];
				Static244.anIntArray241[Static10.anInt179++ & 0x1F] = (int) local579;
			} else if (local463 == 2) {
				Static401.aStringArray26[(int) local579] = local836.aString26;
				Static566.anIntArray509[Static624.anInt10014++ & 0x1F] = (int) local579;
			} else {
				@Pc(886) Class394 local886;
				if (local463 == 3) {
					local886 = Static238.method3422((int) local579);
					if (!local836.aString26.equals(local886.aString118)) {
						local886.aString118 = local836.aString26;
						Static609.method8190(local886);
					}
				} else {
					@Pc(895) int local895;
					if (local463 == 4) {
						local886 = Static238.method3422((int) local579);
						local249 = local836.anInt2749;
						local261 = local836.anInt2740;
						local895 = local836.anInt2751;
						if (local249 != local886.anInt10482 || local261 != local886.anInt10528 || local886.anInt10459 != local895) {
							local886.anInt10459 = local895;
							local886.anInt10482 = local249;
							local886.anInt10528 = local261;
							Static609.method8190(local886);
						}
					} else if (local463 == 5) {
						local886 = Static238.method3422((int) local579);
						if (local886.anInt10499 != local836.anInt2749 || local836.anInt2749 == -1) {
							local886.anInt10534 = 0;
							local886.anInt10535 = 1;
							local886.anInt10447 = 0;
							local886.anInt10499 = local836.anInt2749;
							@Pc(982) Class65 local982 = local886.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(local886.anInt10499);
							if (local982 != null) {
								Static375.method5527(local982, local886.anInt10447);
							}
							Static609.method8190(local886);
						}
					} else if (local463 == 6) {
						local242 = local836.anInt2749;
						local249 = local242 >> 10 & 0x1F;
						local261 = local242 >> 5 & 0x1F;
						local895 = local242 & 0x1F;
						@Pc(1432) int local1432 = (local895 << 3) + (local249 << 19) + (local261 << 11);
						@Pc(1437) Class394 local1437 = Static238.method3422((int) local579);
						if (local1437.anInt10483 != local1432) {
							local1437.anInt10483 = local1432;
							Static609.method8190(local1437);
						}
					} else if (local463 == 7) {
						local886 = Static238.method3422((int) local579);
						@Pc(1381) boolean local1381 = local836.anInt2749 == 1;
						if (local1381 != local886.aBoolean780) {
							local886.aBoolean780 = local1381;
							Static609.method8190(local886);
						}
					} else if (local463 == 8) {
						local886 = Static238.method3422((int) local579);
						if (local886.anInt10493 != local836.anInt2749 || local886.anInt10455 != local836.anInt2740 || local836.anInt2751 != local886.anInt10515) {
							local886.anInt10455 = local836.anInt2740;
							local886.anInt10493 = local836.anInt2749;
							local886.anInt10515 = local836.anInt2751;
							if (local886.anInt10469 != -1) {
								if (local886.anInt10451 > 0) {
									local886.anInt10515 = local886.anInt10515 * 32 / local886.anInt10451;
								} else if (local886.anInt10463 > 0) {
									local886.anInt10515 = local886.anInt10515 * 32 / local886.anInt10463;
								}
							}
							Static609.method8190(local886);
						}
					} else if (local463 == 9) {
						local886 = Static238.method3422((int) local579);
						if (local886.anInt10469 != local836.anInt2749 || local836.anInt2740 != local886.anInt10522) {
							local886.anInt10469 = local836.anInt2749;
							local886.anInt10522 = local836.anInt2740;
							Static609.method8190(local886);
						}
					} else if (local463 == 10) {
						local886 = Static238.method3422((int) local579);
						if (local886.anInt10474 != local836.anInt2749 || local886.anInt10473 != local836.anInt2740 || local836.anInt2751 != local886.anInt10513) {
							local886.anInt10474 = local836.anInt2749;
							local886.anInt10473 = local836.anInt2740;
							local886.anInt10513 = local836.anInt2751;
							Static609.method8190(local886);
						}
					} else if (local463 == 11) {
						local886 = Static238.method3422((int) local579);
						local886.aByte153 = 0;
						local886.anInt10486 = local886.anInt10491 = local836.anInt2740;
						local886.anInt10494 = local886.anInt10495 = local836.anInt2749;
						local886.aByte151 = 0;
						Static609.method8190(local886);
					} else if (local463 == 12) {
						local886 = Static238.method3422((int) local579);
						local249 = local836.anInt2749;
						if (local886 != null && local886.anInt10479 == 0) {
							if (local886.anInt10470 - local886.anInt10532 < local249) {
								local249 = local886.anInt10470 - local886.anInt10532;
							}
							if (local249 < 0) {
								local249 = 0;
							}
							if (local249 != local886.anInt10448) {
								local886.anInt10448 = local249;
								Static609.method8190(local886);
							}
						}
					} else if (local463 == 14) {
						local886 = Static238.method3422((int) local579);
						local886.anInt10517 = local836.anInt2749;
					} else if (local463 == 15) {
						Static390.aBoolean744 = true;
						Static154.anInt2536 = local836.anInt2740;
						Static443.anInt7790 = local836.anInt2749;
					} else if (local463 == 16) {
						local886 = Static238.method3422((int) local579);
						local886.anInt10527 = local836.anInt2749;
					} else if (local463 == 17) {
						local886 = Static238.method3422((int) local579);
						local886.anInt10492 = local836.anInt2749;
					} else if (local463 == 18) {
						local886 = Static238.method3422((int) local579);
						local249 = (int) (local579 >> 32);
						local886.method8730((short) local836.anInt2749, (short) local836.anInt2740, local249);
					} else if (local463 == 19) {
						local886 = Static238.method3422((int) local579);
						local249 = (int) (local579 >> 32);
						local886.method8723((short) local836.anInt2749, (short) local836.anInt2740, local249);
					}
				}
			}
		}
		Static648.anInt10220++;
		if (Static399.anInt6910 != 0) {
			Static269.anInt4253 += 20;
			if (Static269.anInt4253 >= 400) {
				Static399.anInt6910 = 0;
			}
		}
		if (Static545.aClass394_10 != null) {
			Static388.anInt6737++;
			if (Static388.anInt6737 >= 15) {
				Static609.method8190(Static545.aClass394_10);
				Static545.aClass394_10 = null;
			}
		}
		Static522.aClass394_9 = null;
		Static335.aBoolean440 = false;
		Static413.aClass394_4 = null;
		Static254.aBoolean280 = false;
		Static655.method8587((Class394) null, -1, -1);
		Static178.method2615(-1, (Class394) null, -1);
		if (!Static386.aBoolean482) {
			Static54.anInt8558 = -1;
		}
		Static621.method8304();
		Static293.anInt4549++;
		if (Static275.aBoolean285) {
			@Pc(1568) Class5_Sub16 local1568 = Static455.method6717(Static206.aClass187_42, Static16.aClass332_8);
			local1568.aClass5_Sub15_Sub2_1.method3679(Static459.anInt7993 << 14 | Static363.anInt6348 << 28 | Static434.anInt7656);
			Static479.method7038(local1568);
			Static275.aBoolean285 = false;
		}
		while (true) {
			@Pc(1593) Class5_Sub28 local1593;
			@Pc(1606) Class394 local1606;
			@Pc(1598) Class394 local1598;
			do {
				local1593 = (Class5_Sub28) Static102.aClass124_14.method2571();
				if (local1593 == null) {
					while (true) {
						do {
							local1593 = (Class5_Sub28) Static311.aClass124_49.method2571();
							if (local1593 == null) {
								while (true) {
									do {
										local1593 = (Class5_Sub28) Static259.aClass124_40.method2571();
										if (local1593 == null) {
											if (Static413.aClass394_4 == null) {
												Static429.anInt7587 = 0;
											}
											if (Static610.aClass394_12 != null) {
												Static305.method4160();
											}
											if (Static281.anInt4403 > 0 && Static176.aClass157_1.method3300(82) && Static176.aClass157_1.method3300(81) && Static145.anInt2413 != 0) {
												local463 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 - Static145.anInt2413;
												if (local463 < 0) {
													local463 = 0;
												} else if (local463 > 3) {
													local463 = 3;
												}
												Static319.method4827(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] + Static454.anInt7910, local463, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] + Static48.anInt750);
											}
											Static543.method7515();
											for (local463 = 0; local463 < 5; local463++) {
												@Pc(1793) int local1793 = Static118.anIntArray106[local463]++;
											}
											if (Static439.aBoolean565 && Static3.aLong1 < Static124.method1947() - 60000L) {
												Static267.method3773();
											}
											for (@Pc(1820) Class41_Sub4_Sub2 local1820 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2062(); local1820 != null; local1820 = (Class41_Sub4_Sub2) Static508.aClass102_8.method2054()) {
												if (Static124.method1947() / 1000L - 5L > (long) local1820.anInt7654) {
													if (local1820.aShort90 > 0) {
														Static423.method6423(5, 0, local1820.aString74 + Static49.aClass42_19.method730(Static259.anInt4113), "", "", "");
													}
													if (local1820.aShort90 == 0) {
														Static423.method6423(5, 0, local1820.aString74 + Static49.aClass42_20.method730(Static259.anInt4113), "", "", "");
													}
													local1820.method8644();
												}
											}
											Static654.anInt10026++;
											if (Static654.anInt10026 > 500) {
												Static654.anInt10026 = 0;
												local191 = (int) (Math.random() * 8.0D);
												if ((local191 & 0x4) == 4) {
													Static312.anInt5536 += Static19.anInt267;
												}
												if ((local191 & 0x2) == 2) {
													Static368.anInt6448 += Static656.anInt10301;
												}
												if ((local191 & 0x1) == 1) {
													Static188.anInt3090 += Static121.anInt2110;
												}
											}
											if (Static188.anInt3090 < -50) {
												Static121.anInt2110 = 2;
											}
											if (Static188.anInt3090 > 50) {
												Static121.anInt2110 = -2;
											}
											if (Static368.anInt6448 < -55) {
												Static656.anInt10301 = 2;
											}
											if (Static368.anInt6448 > 55) {
												Static656.anInt10301 = -2;
											}
											if (Static312.anInt5536 < -40) {
												Static19.anInt267 = 1;
											}
											if (Static312.anInt5536 > 40) {
												Static19.anInt267 = -1;
											}
											Static559.anInt9137++;
											if (Static559.anInt9137 > 500) {
												Static559.anInt9137 = 0;
												local191 = (int) (Math.random() * 8.0D);
												if ((local191 & 0x1) == 1) {
													Static538.anInt8846 += Static327.anInt5974;
												}
												if ((local191 & 0x2) == 2) {
													Static342.anInt6178 += Static311.anInt5527;
												}
											}
											if (Static538.anInt8846 < -60) {
												Static327.anInt5974 = 2;
											}
											if (Static342.anInt6178 < -20) {
												Static311.anInt5527 = 1;
											}
											if (Static538.anInt8846 > 60) {
												Static327.anInt5974 = -2;
											}
											if (Static342.anInt6178 > 10) {
												Static311.anInt5527 = -1;
											}
											Static53.anInt4077++;
											if (Static53.anInt4077 > 50) {
												@Pc(2050) Class5_Sub16 local2050 = Static455.method6717(Static544.aClass187_83, Static16.aClass332_8);
												Static479.method7038(local2050);
											}
											if (Static120.aBoolean146) {
												Static322.method5019();
												Static120.aBoolean146 = false;
											}
											try {
												Static652.method8576();
												return;
											} catch (@Pc(2063) IOException local2063) {
												Static360.method5289();
												return;
											}
										}
										local1598 = local1593.aClass394_2;
										if (local1598.anInt10502 < 0) {
											break;
										}
										local1606 = Static238.method3422(local1598.anInt10530);
									} while (local1606 == null || local1606.aClass394Array2 == null || local1606.aClass394Array2.length <= local1598.anInt10502 || local1598 != local1606.aClass394Array2[local1598.anInt10502]);
									Static497.method7205(local1593);
								}
							}
							local1598 = local1593.aClass394_2;
							if (local1598.anInt10502 < 0) {
								break;
							}
							local1606 = Static238.method3422(local1598.anInt10530);
						} while (local1606 == null || local1606.aClass394Array2 == null || local1606.aClass394Array2.length <= local1598.anInt10502 || local1598 != local1606.aClass394Array2[local1598.anInt10502]);
						Static497.method7205(local1593);
					}
				}
				local1598 = local1593.aClass394_2;
				if (local1598.anInt10502 < 0) {
					break;
				}
				local1606 = Static238.method3422(local1598.anInt10530);
			} while (local1606 == null || local1606.aClass394Array2 == null || local1598.anInt10502 >= local1606.aClass394Array2.length || local1606.aClass394Array2[local1598.anInt10502] != local1598);
			Static497.method7205(local1593);
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
	public static void method6957() {
		Static277.aClass265_27.method6568();
	}
}
