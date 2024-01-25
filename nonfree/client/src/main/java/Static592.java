import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wt", name = "I", descriptor = "Lclient!bda;")
	public static Class27 aClass27_9;

	@OriginalMember(owner = "client!wt", name = "M", descriptor = "Lclient!ff;")
	public static Class98 aClass98_2;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "Lclient!uda;")
	public static final Class325 aClass325_8 = new Class325();

	@OriginalMember(owner = "client!wt", name = "H", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_59 = new Class326(64);

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_173 = new Class319(43, 3);

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "I")
	public static int anInt9557 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!ge;BII)J")
	public static long method7892(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class306 local19 = Static146.aClass214_1.method4897(arg0.method7276());
		@Pc(40) long local40 = (long) (arg1 | 0x40000000 | arg2 << 7 | arg0.method7279() << 14 | arg0.method7278() << 20);
		if (local19.anInt8387 == 0) {
			local40 |= local12;
		}
		if (local19.anInt8401 == 1) {
			local40 |= local10;
		}
		return local40 | (long) arg0.method7276() << 32;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)V")
	public static void method7893() {
		if (Static562.anInt9131 > 1) {
			Static562.anInt9131--;
			Static384.anInt7194 = Static274.anInt5077;
		}
		if (Static533.aBoolean650) {
			Static533.aBoolean650 = false;
			Static509.method7019();
			return;
		}
		if (!Static294.aBoolean407) {
			Static593.method7895();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static568.method7663(); local29++) {
		}
		if (Static177.anInt2101 != 10) {
			return;
		}
		@Pc(51) Class1_Sub48 local51;
		@Pc(60) int local60;
		while (Static237.method3849()) {
			local51 = Static320.method4867(Static442.aClass170_2, Static94.aClass319_41);
			local51.aClass1_Sub20_Sub1_2.method4378(0);
			local60 = local51.aClass1_Sub20_Sub1_2.anInt5238;
			Static422.method5907(local51.aClass1_Sub20_Sub1_2);
			local51.aClass1_Sub20_Sub1_2.method4411(local51.aClass1_Sub20_Sub1_2.anInt5238 - local60);
			Static34.method813(local51);
		}
		if (Static299.aClass1_Sub45_2 == null) {
			if (Static255.method4035() >= Static473.aLong357) {
				Static299.aClass1_Sub45_2 = Static103.aClass308_1.method6990(Static137.aClass174_1.aString46);
			}
		} else if (Static299.aClass1_Sub45_2.anInt8349 != -1) {
			local51 = Static320.method4867(Static442.aClass170_2, Static573.aClass319_168);
			local51.aClass1_Sub20_Sub1_2.method4381(Static299.aClass1_Sub45_2.anInt8349);
			Static34.method813(local51);
			Static299.aClass1_Sub45_2 = null;
			Static473.aLong357 = Static255.method4035() + 30000L;
		}
		@Pc(125) Class1_Sub13 local125 = (Class1_Sub13) Static270.aClass361_55.method7854();
		@Pc(142) int local142;
		@Pc(167) int local167;
		@Pc(186) int local186;
		@Pc(233) int local233;
		@Pc(240) int local240;
		@Pc(251) int local251;
		@Pc(140) Class1_Sub48 local140;
		if (local125 != null || Static168.aLong146 < Static255.method4035() - 2000L) {
			local140 = null;
			local142 = 0;
			for (@Pc(147) Class1_Sub13 local147 = (Class1_Sub13) Static13.aClass361_4.method7854(); local147 != null && (local140 == null || local140.aClass1_Sub20_Sub1_2.anInt5238 - local142 < 240); local147 = (Class1_Sub13) Static13.aClass361_4.method7853()) {
				local147.method7878();
				local167 = local147.method2537();
				if (local167 < -1) {
					local167 = -1;
				} else if (local167 > 65534) {
					local167 = 65534;
				}
				local186 = local147.method2536();
				if (local186 < -1) {
					local186 = -1;
				} else if (local186 > 65534) {
					local186 = 65534;
				}
				if (local186 != Static147.anInt2829 || Static164.anInt2988 != local167) {
					if (local140 == null) {
						local140 = Static320.method4867(Static442.aClass170_2, Static203.aClass319_74);
						local140.aClass1_Sub20_Sub1_2.method4378(0);
						local142 = local140.aClass1_Sub20_Sub1_2.anInt5238;
					}
					local233 = local186 - Static147.anInt2829;
					Static147.anInt2829 = local186;
					local240 = local167 - Static164.anInt2988;
					Static164.anInt2988 = local167;
					local251 = (int) ((local147.method2538() - Static168.aLong146) / 20L);
					if (local251 < 8 && local233 >= -32 && local233 <= 31 && local240 >= -32 && local240 <= 31) {
						local233 += 32;
						local240 += 32;
						local140.aClass1_Sub20_Sub1_2.method4381(local240 + (local233 << 6) + (local251 << 12));
					} else if (local251 < 32 && local233 >= -128 && local233 <= 127 && local240 >= -128 && local240 <= 127) {
						local233 += 128;
						local140.aClass1_Sub20_Sub1_2.method4378(local251 + 128);
						local240 += 128;
						local140.aClass1_Sub20_Sub1_2.method4381(local240 + (local233 << 8));
					} else if (local251 < 32) {
						local140.aClass1_Sub20_Sub1_2.method4378(local251 + 192);
						if (local186 == 1 || local167 == -1) {
							local140.aClass1_Sub20_Sub1_2.method4421(Integer.MIN_VALUE);
						} else {
							local140.aClass1_Sub20_Sub1_2.method4421(local186 | local167 << 16);
						}
					} else {
						local140.aClass1_Sub20_Sub1_2.method4381(local251 + 57344);
						if (local186 == 1 || local167 == -1) {
							local140.aClass1_Sub20_Sub1_2.method4421(Integer.MIN_VALUE);
						} else {
							local140.aClass1_Sub20_Sub1_2.method4421(local167 << 16 | local186);
						}
					}
					Static168.aLong146 = local147.method2538();
				}
			}
			if (local140 != null) {
				local140.aClass1_Sub20_Sub1_2.method4411(local140.aClass1_Sub20_Sub1_2.anInt5238 - local142);
				Static34.method813(local140);
			}
		}
		@Pc(452) int local452;
		if (local125 != null) {
			@Pc(436) long local436 = (local125.method2538() - Static229.aLong386) / 50L;
			Static229.aLong386 = local125.method2538();
			if (local436 > 32767L) {
				local436 = 32767L;
			}
			local452 = local125.method2537();
			if (local452 < 0) {
				local452 = 0;
			} else if (local452 > 65535) {
				local452 = 65535;
			}
			local167 = local125.method2536();
			if (local167 < 0) {
				local167 = 0;
			} else if (local167 > 65535) {
				local167 = 65535;
			}
			@Pc(487) byte local487 = 0;
			if (local125.method2533() == 2) {
				local487 = 1;
			}
			local233 = (int) local436;
			@Pc(508) Class1_Sub48 local508 = Static320.method4867(Static442.aClass170_2, Static80.aClass319_166);
			local508.aClass1_Sub20_Sub1_2.method4420(local167 | local452 << 16);
			local508.aClass1_Sub20_Sub1_2.method4402(local487 << 15 | local233);
			Static34.method813(local508);
		}
		if (anInt9557 > 0) {
			local140 = Static320.method4867(Static442.aClass170_2, Static12.aClass319_5);
			local140.aClass1_Sub20_Sub1_2.method4378(anInt9557 * 3);
			for (local142 = 0; local142 < anInt9557; local142++) {
				@Pc(555) Interface21 local555 = Static195.anInterface21Array1[local142];
				@Pc(563) long local563 = (local555.method6534() - Static146.aLong134) / 50L;
				Static146.aLong134 = local555.method6534();
				if (local563 > 65535L) {
					local563 = 65535L;
				}
				local140.aClass1_Sub20_Sub1_2.method4378(local555.method6535());
				local140.aClass1_Sub20_Sub1_2.method4381((int) local563);
			}
			Static34.method813(local140);
		}
		if (Static132.anInt2638 > 0) {
			Static132.anInt2638--;
		}
		if (Static459.aBoolean567 && Static132.anInt2638 <= 0) {
			Static132.anInt2638 = 20;
			Static459.aBoolean567 = false;
			local140 = Static320.method4867(Static442.aClass170_2, Static456.aClass319_144);
			local140.aClass1_Sub20_Sub1_2.method4381((int) Static143.aFloat61 >> 3);
			local140.aClass1_Sub20_Sub1_2.method4409((int) Static79.aFloat37 >> 3);
			Static34.method813(local140);
		}
		if (Static578.aBoolean689 != Static81.aBoolean154) {
			Static578.aBoolean689 = Static81.aBoolean154;
			local140 = Static320.method4867(Static442.aClass170_2, Static187.aClass319_122);
			local140.aClass1_Sub20_Sub1_2.method4378(Static81.aBoolean154 ? 1 : 0);
			Static34.method813(local140);
		}
		if (!Static392.aBoolean493) {
			local140 = Static320.method4867(Static442.aClass170_2, Static43.aClass319_25);
			local140.aClass1_Sub20_Sub1_2.method4378(0);
			local142 = local140.aClass1_Sub20_Sub1_2.anInt5238;
			@Pc(689) Class1_Sub20 local689 = new Class1_Sub20(Static578.method7769());
			Static479.aClass1_Sub7_Sub1_1.method2619(local689);
			local140.aClass1_Sub20_Sub1_2.method4412(local689.aByteArray52, local689.anInt5238);
			local140.aClass1_Sub20_Sub1_2.method4411(local140.aClass1_Sub20_Sub1_2.anInt5238 - local142);
			Static34.method813(local140);
			Static392.aBoolean493 = true;
		}
		if (Static118.aClass293ArrayArrayArray14 != null) {
			if (Static585.anInt9461 == 2) {
				Static207.method6647();
			} else if (Static585.anInt9461 == 3) {
				Static337.method5031();
			}
		}
		if (Static359.aBoolean443) {
			Static359.aBoolean443 = false;
		} else {
			Static257.aFloat111 /= 2.0F;
		}
		if (Static373.aBoolean467) {
			Static373.aBoolean467 = false;
		} else {
			Static327.aFloat150 /= 2.0F;
		}
		Static89.method1754();
		if (Static177.anInt2101 != 10) {
			return;
		}
		Static340.method5069();
		Static167.method2560();
		Static47.method1134();
		Static401.anInt6897++;
		if (Static401.anInt6897 > 750) {
			Static509.method7019();
			return;
		}
		Static537.method7481();
		Static291.method4573();
		Static480.method6734();
		for (local60 = Static121.aClass148_1.method3536(true); local60 != -1; local60 = Static121.aClass148_1.method3536(false)) {
			Static392.method5598(local60);
			Static118.anIntArray144[Static34.anInt924++ & 0x1F] = local60;
		}
		@Pc(868) Class365 local868;
		for (@Pc(815) Class1_Sub3_Sub1 local815 = Static585.method7823(); local815 != null; local815 = Static585.method7823()) {
			local452 = local815.method492();
			local167 = local815.method489();
			if (local452 == 1) {
				Static475.anIntArray530[local167] = local815.anInt548;
				Static43.aBoolean89 |= Static412.aBooleanArray23[local167];
				Static170.anIntArray182[Static117.anInt2342++ & 0x1F] = local167;
			} else if (local452 == 2) {
				Static111.aStringArray11[local167] = local815.aString11;
				Static505.anIntArray579[Static151.anInt2851++ & 0x1F] = local167;
			} else if (local452 == 3) {
				local868 = Static374.method5437(local167);
				if (!local815.aString11.equals(local868.aString99)) {
					local868.aString99 = local815.aString11;
					Static201.method5537(local868);
				}
			} else if (local452 == 4) {
				local868 = Static374.method5437(local167);
				local233 = local815.anInt548;
				local240 = local815.anInt545;
				local251 = local815.anInt549;
				if (local868.anInt9576 != local233 || local868.anInt9620 != local240 || local251 != local868.anInt9572) {
					local868.anInt9572 = local251;
					local868.anInt9576 = local233;
					local868.anInt9620 = local240;
					Static201.method5537(local868);
				}
			} else if (local452 == 5) {
				local868 = Static374.method5437(local167);
				if (local868.anInt9611 != local815.anInt548 || local815.anInt548 == -1) {
					local868.anInt9583 = 0;
					local868.anInt9643 = 0;
					local868.anInt9574 = 1;
					local868.anInt9611 = local815.anInt548;
					@Pc(958) Class131 local958 = local868.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(local868.anInt9611);
					if (local958 != null) {
						Static416.method5833(local868.anInt9583, local958);
					}
					Static201.method5537(local868);
				}
			} else if (local452 == 6) {
				local186 = local815.anInt548;
				local233 = local186 >> 10 & 0x1F;
				local240 = local186 >> 5 & 0x1F;
				local251 = local186 & 0x1F;
				@Pc(1006) int local1006 = (local240 << 11) + (local233 << 19) + (local251 << 3);
				@Pc(1010) Class365 local1010 = Static374.method5437(local167);
				if (local1006 != local1010.anInt9633) {
					local1010.anInt9633 = local1006;
					Static201.method5537(local1010);
				}
			} else if (local452 == 7) {
				local868 = Static374.method5437(local167);
				@Pc(1338) boolean local1338 = local815.anInt548 == 1;
				if (local868.aBoolean711 != local1338) {
					local868.aBoolean711 = local1338;
					Static201.method5537(local868);
				}
			} else if (local452 == 8) {
				local868 = Static374.method5437(local167);
				if (local868.anInt9660 != local815.anInt548 || local815.anInt545 != local868.anInt9612 || local815.anInt549 != local868.anInt9608) {
					local868.anInt9660 = local815.anInt548;
					local868.anInt9612 = local815.anInt545;
					local868.anInt9608 = local815.anInt549;
					if (local868.anInt9573 != -1) {
						if (local868.anInt9615 > 0) {
							local868.anInt9608 = local868.anInt9608 * 32 / local868.anInt9615;
						} else if (local868.anInt9627 > 0) {
							local868.anInt9608 = local868.anInt9608 * 32 / local868.anInt9627;
						}
					}
					Static201.method5537(local868);
				}
			} else if (local452 == 9) {
				local868 = Static374.method5437(local167);
				if (local868.anInt9573 != local815.anInt548 || local868.anInt9575 != local815.anInt545) {
					local868.anInt9573 = local815.anInt548;
					local868.anInt9575 = local815.anInt545;
					Static201.method5537(local868);
				}
			} else if (local452 == 10) {
				local868 = Static374.method5437(local167);
				if (local868.anInt9623 != local815.anInt548 || local815.anInt545 != local868.anInt9651 || local868.anInt9622 != local815.anInt549) {
					local868.anInt9623 = local815.anInt548;
					local868.anInt9651 = local815.anInt545;
					local868.anInt9622 = local815.anInt549;
					Static201.method5537(local868);
				}
			} else if (local452 == 11) {
				local868 = Static374.method5437(local167);
				local868.anInt9625 = local868.anInt9604 = local815.anInt545;
				local868.anInt9581 = local868.anInt9644 = local815.anInt548;
				local868.aByte127 = 0;
				local868.aByte125 = 0;
				Static201.method5537(local868);
			} else if (local452 == 12) {
				local868 = Static374.method5437(local167);
				local233 = local815.anInt548;
				if (local868 != null && local868.anInt9595 == 0) {
					if (local868.anInt9599 - local868.anInt9638 < local233) {
						local233 = local868.anInt9599 - local868.anInt9638;
					}
					if (local233 < 0) {
						local233 = 0;
					}
					if (local868.anInt9617 != local233) {
						local868.anInt9617 = local233;
						Static201.method5537(local868);
					}
				}
			} else if (local452 == 14) {
				local868 = Static374.method5437(local167);
				local868.anInt9602 = local815.anInt548;
			} else if (local452 == 15) {
				Static90.anInt1998 = local815.anInt548;
				Static328.anInt5893 = local815.anInt545;
				Static275.aBoolean387 = true;
			} else if (local452 == 16) {
				local868 = Static374.method5437(local167);
				local868.anInt9568 = local815.anInt548;
			}
		}
		if (Static393.anInt6806 != 0) {
			Static414.anInt7055 += 20;
			if (Static414.anInt7055 >= 400) {
				Static393.anInt6806 = 0;
			}
		}
		Static236.anInt4451++;
		if (Static309.aClass365_9 != null) {
			Static452.anInt7759++;
			if (Static452.anInt7759 >= 15) {
				Static201.method5537(Static309.aClass365_9);
				Static309.aClass365_9 = null;
			}
		}
		Static204.aBoolean333 = false;
		Static559.aClass365_16 = null;
		Static484.aBoolean580 = false;
		Static310.aClass365_13 = null;
		Static356.method5847(-1, null, -1);
		Static456.method6393(null, -1, -1);
		if (!Static22.aBoolean43) {
			Static325.anInt9473 = -1;
		}
		Static239.method3926();
		Static274.anInt5077++;
		if (Static93.aBoolean163) {
			@Pc(1462) Class1_Sub48 local1462 = Static320.method4867(Static442.aClass170_2, Static513.aClass319_151);
			local1462.aClass1_Sub20_Sub1_2.method4379(Static376.anInt6634 << 14 | Static426.anInt7215 << 28 | Static530.anInt8762);
			Static34.method813(local1462);
			Static93.aBoolean163 = false;
		}
		while (true) {
			@Pc(1485) Class1_Sub2 local1485;
			@Pc(1490) Class365 local1490;
			do {
				local1485 = (Class1_Sub2) Static92.aClass361_28.method7850();
				if (local1485 == null) {
					while (true) {
						do {
							local1485 = (Class1_Sub2) Static292.aClass361_59.method7850();
							if (local1485 == null) {
								while (true) {
									do {
										local1485 = (Class1_Sub2) Static215.aClass361_44.method7850();
										if (local1485 == null) {
											if (Static559.aClass365_16 == null) {
												Static347.anInt9410 = 0;
											}
											if (Static363.aClass365_14 != null) {
												Static123.method2121();
											}
											if (Static276.anInt5092 > 0 && Static595.aClass31_1.method985(82) && Static595.aClass31_1.method985(81) && Static184.anInt5415 != 0) {
												local452 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116 - Static184.anInt5415;
												if (local452 < 0) {
													local452 = 0;
												} else if (local452 > 3) {
													local452 = 3;
												}
												Static120.method2034(local452, Static376.anInt6631 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0], Static24.anInt674 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0]);
											}
											Static69.method1446();
											for (local452 = 0; local452 < 5; local452++) {
												@Pc(1681) int local1681 = Static435.anIntArray505[local452]++;
											}
											if (Static43.aBoolean89 && Static566.aLong406 < Static255.method4035() - 60000L) {
												Static561.method5044();
											}
											for (@Pc(1708) Class20_Sub1_Sub2 local1708 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7653(); local1708 != null; local1708 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7660()) {
												if ((long) local1708.anInt2275 < Static255.method4035() / 1000L - 5L) {
													if (local1708.aShort26 > 0) {
														Static114.method1983("", "", "", 0, local1708.aString24 + Static103.aClass77_21.method1864(Static562.anInt9127), 5);
													}
													if (local1708.aShort26 == 0) {
														Static114.method1983("", "", "", 0, local1708.aString24 + Static103.aClass77_22.method1864(Static562.anInt9127), 5);
													}
													local1708.method7704();
												}
											}
											Static473.anInt8025++;
											if (Static473.anInt8025 > 500) {
												Static473.anInt8025 = 0;
												local186 = (int) (Math.random() * 8.0D);
												if ((local186 & 0x2) == 2) {
													Static388.anInt6771 += Static63.anInt1540;
												}
												if ((local186 & 0x4) == 4) {
													Static474.anInt1076 += Static390.anInt6784;
												}
												if ((local186 & 0x1) == 1) {
													Static120.anInt2411 += Static82.anInt9172;
												}
											}
											if (Static120.anInt2411 < -50) {
												Static82.anInt9172 = 2;
											}
											if (Static388.anInt6771 < -55) {
												Static63.anInt1540 = 2;
											}
											if (Static120.anInt2411 > 50) {
												Static82.anInt9172 = -2;
											}
											if (Static474.anInt1076 < -40) {
												Static390.anInt6784 = 1;
											}
											if (Static388.anInt6771 > 55) {
												Static63.anInt1540 = -2;
											}
											if (Static474.anInt1076 > 40) {
												Static390.anInt6784 = -1;
											}
											Static99.anInt2074++;
											if (Static99.anInt2074 > 500) {
												Static99.anInt2074 = 0;
												local186 = (int) (Math.random() * 8.0D);
												if ((local186 & 0x2) == 2) {
													Static536.anInt8845 += Static277.anInt5098;
												}
												if ((local186 & 0x1) == 1) {
													Static368.anInt6520 += Static369.anInt6535;
												}
											}
											if (Static368.anInt6520 < -60) {
												Static369.anInt6535 = 2;
											}
											if (Static536.anInt8845 < -20) {
												Static277.anInt5098 = 1;
											}
											if (Static368.anInt6520 > 60) {
												Static369.anInt6535 = -2;
											}
											if (Static536.anInt8845 > 10) {
												Static277.anInt5098 = -1;
											}
											Static314.anInt5650++;
											if (Static314.anInt5650 > 50) {
												@Pc(1941) Class1_Sub48 local1941 = Static320.method4867(Static442.aClass170_2, Static143.aClass319_57);
												Static34.method813(local1941);
											}
											if (Static168.aBoolean217) {
												Static427.method5987();
												Static168.aBoolean217 = false;
											}
											try {
												Static364.method5312();
												return;
											} catch (@Pc(1954) IOException local1954) {
												Static509.method7019();
												return;
											}
										}
										local1490 = local1485.aClass365_1;
										if (local1490.anInt9603 < 0) {
											break;
										}
										local868 = Static374.method5437(local1490.anInt9590);
									} while (local868 == null || local868.aClass365Array2 == null || local1490.anInt9603 >= local868.aClass365Array2.length || local1490 != local868.aClass365Array2[local1490.anInt9603]);
									Static145.method2353(local1485);
								}
							}
							local1490 = local1485.aClass365_1;
							if (local1490.anInt9603 < 0) {
								break;
							}
							local868 = Static374.method5437(local1490.anInt9590);
						} while (local868 == null || local868.aClass365Array2 == null || local1490.anInt9603 >= local868.aClass365Array2.length || local1490 != local868.aClass365Array2[local1490.anInt9603]);
						Static145.method2353(local1485);
					}
				}
				local1490 = local1485.aClass365_1;
				if (local1490.anInt9603 < 0) {
					break;
				}
				local868 = Static374.method5437(local1490.anInt9590);
			} while (local868 == null || local868.aClass365Array2 == null || local1490.anInt9603 >= local868.aClass365Array2.length || local1490 != local868.aClass365Array2[local1490.anInt9603]);
			Static145.method2353(local1485);
		}
	}
}
