import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!ft;")
	public static Class109 aClass109_12;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
	public static int anInt7999 = 0;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public static int anInt8002 = 1;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public static void method6434() {
		if (Static388.anInt6676 > 1) {
			Static127.anInt2535 = anInt8002;
			Static388.anInt6676--;
		}
		if (Static90.aBoolean154) {
			Static90.aBoolean154 = false;
			Static590.method7839();
			return;
		}
		if (!Static554.aBoolean708) {
			Static434.method6067();
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static308.method4289(); local29++) {
		}
		if (Static216.anInt4135 != 10) {
			return;
		}
		@Pc(49) Class1_Sub11 local49;
		@Pc(58) int local58;
		while (Static214.method3337()) {
			local49 = Static276.method3885(Static48.aClass70_13, Static481.aClass276_2);
			local49.aClass1_Sub35_Sub2_1.method5777(0);
			local58 = local49.aClass1_Sub35_Sub2_1.anInt7214;
			Static511.method7103(local49.aClass1_Sub35_Sub2_1);
			local49.aClass1_Sub35_Sub2_1.method5791(local49.aClass1_Sub35_Sub2_1.anInt7214 - local58);
			Static48.method743(local49);
		}
		if (Static250.aClass1_Sub34_1 == null) {
			if (Static366.aLong200 <= Static413.method5668()) {
				Static250.aClass1_Sub34_1 = Static102.aClass216_1.method4340(Static382.aClass227_2.aString53);
			}
		} else if (Static250.aClass1_Sub34_1.anInt5530 != -1) {
			local49 = Static276.method3885(Static29.aClass70_7, Static481.aClass276_2);
			local49.aClass1_Sub35_Sub2_1.method5776(Static250.aClass1_Sub34_1.anInt5530);
			Static48.method743(local49);
			Static250.aClass1_Sub34_1 = null;
			Static366.aLong200 = Static413.method5668() + 30000L;
		}
		@Pc(124) Class1_Sub16 local124 = (Class1_Sub16) Static587.aClass353_67.method7677();
		@Pc(137) int local137;
		@Pc(164) int local164;
		@Pc(180) int local180;
		@Pc(223) int local223;
		@Pc(229) int local229;
		@Pc(240) int local240;
		@Pc(135) Class1_Sub11 local135;
		if (local124 != null || Static413.method5668() - 2000L > Static197.aLong203) {
			local135 = null;
			local137 = 0;
			for (@Pc(142) Class1_Sub16 local142 = (Class1_Sub16) Static167.aClass353_13.method7677(); local142 != null && (local135 == null || local135.aClass1_Sub35_Sub2_1.anInt7214 - local137 < 240); local142 = (Class1_Sub16) Static167.aClass353_13.method7687()) {
				local142.method7859();
				local164 = local142.method3650();
				if (local164 < -1) {
					local164 = -1;
				} else if (local164 > 65534) {
					local164 = 65534;
				}
				local180 = local142.method3652();
				if (local180 < -1) {
					local180 = -1;
				} else if (local180 > 65534) {
					local180 = 65534;
				}
				if (local180 != Static543.anInt9077 || Static561.anInt9345 != local164) {
					if (local135 == null) {
						local135 = Static276.method3885(Static11.aClass70_4, Static481.aClass276_2);
						local135.aClass1_Sub35_Sub2_1.method5777(0);
						local137 = local135.aClass1_Sub35_Sub2_1.anInt7214;
					}
					local223 = local180 - Static543.anInt9077;
					Static543.anInt9077 = local180;
					local229 = local164 - Static561.anInt9345;
					Static561.anInt9345 = local164;
					local240 = (int) ((local142.method3649() - Static197.aLong203) / 20L);
					if (local240 < 8 && local223 >= -32 && local223 <= 31 && local229 >= -32 && local229 <= 31) {
						local223 += 32;
						local229 += 32;
						local135.aClass1_Sub35_Sub2_1.method5776(local229 + (local223 << 6) + (local240 << 12));
					} else if (local240 < 32 && local223 >= -128 && local223 <= 127 && local229 >= -128 && local229 <= 127) {
						local229 += 128;
						local223 += 128;
						local135.aClass1_Sub35_Sub2_1.method5777(local240 + 128);
						local135.aClass1_Sub35_Sub2_1.method5776(local229 + (local223 << 8));
					} else if (local240 >= 32) {
						local135.aClass1_Sub35_Sub2_1.method5776(local240 + 57344);
						if (local180 == 1 || local164 == -1) {
							local135.aClass1_Sub35_Sub2_1.method5792(Integer.MIN_VALUE);
						} else {
							local135.aClass1_Sub35_Sub2_1.method5792(local164 << 16 | local180);
						}
					} else {
						local135.aClass1_Sub35_Sub2_1.method5777(local240 + 192);
						if (local180 == 1 || local164 == -1) {
							local135.aClass1_Sub35_Sub2_1.method5792(Integer.MIN_VALUE);
						} else {
							local135.aClass1_Sub35_Sub2_1.method5792(local164 << 16 | local180);
						}
					}
					Static197.aLong203 = local142.method3649();
				}
			}
			if (local135 != null) {
				local135.aClass1_Sub35_Sub2_1.method5791(local135.aClass1_Sub35_Sub2_1.anInt7214 - local137);
				Static48.method743(local135);
			}
		}
		@Pc(441) int local441;
		if (local124 != null) {
			@Pc(425) long local425 = (local124.method3649() - Static77.aLong49) / 50L;
			Static77.aLong49 = local124.method3649();
			if (local425 > 32767L) {
				local425 = 32767L;
			}
			local441 = local124.method3650();
			if (local441 < 0) {
				local441 = 0;
			} else if (local441 > 65535) {
				local441 = 65535;
			}
			local164 = local124.method3652();
			if (local164 < 0) {
				local164 = 0;
			} else if (local164 > 65535) {
				local164 = 65535;
			}
			@Pc(471) byte local471 = 0;
			if (local124.method3646() == 2) {
				local471 = 1;
			}
			local223 = (int) local425;
			@Pc(494) Class1_Sub11 local494 = Static276.method3885(Static526.aClass70_96, Static481.aClass276_2);
			local494.aClass1_Sub35_Sub2_1.method5740(local223 | local471 << 15);
			local494.aClass1_Sub35_Sub2_1.method5773(local441 << 16 | local164);
			Static48.method743(local494);
		}
		if (Static19.anInt242 > 0) {
			local135 = Static276.method3885(Static477.aClass70_83, Static481.aClass276_2);
			local135.aClass1_Sub35_Sub2_1.method5777(Static19.anInt242 * 3);
			for (local137 = 0; local137 < Static19.anInt242; local137++) {
				@Pc(541) Interface22 local541 = Static425.anInterface22Array2[local137];
				@Pc(549) long local549 = (local541.method4452() - Static28.aLong21) / 50L;
				Static28.aLong21 = local541.method4452();
				if (local549 > 65535L) {
					local549 = 65535L;
				}
				local135.aClass1_Sub35_Sub2_1.method5777(local541.method4450());
				local135.aClass1_Sub35_Sub2_1.method5776((int) local549);
			}
			Static48.method743(local135);
		}
		if (Static192.anInt3567 > 0) {
			Static192.anInt3567--;
		}
		if (Static305.aBoolean423 && Static192.anInt3567 <= 0) {
			Static192.anInt3567 = 20;
			Static305.aBoolean423 = false;
			local135 = Static276.method3885(Static468.aClass70_81, Static481.aClass276_2);
			local135.aClass1_Sub35_Sub2_1.method5789((int) Static167.aFloat59 >> 3);
			local135.aClass1_Sub35_Sub2_1.method5776((int) Static287.aFloat117 >> 3);
			Static48.method743(local135);
		}
		if (Static161.aBoolean224 != Static534.aBoolean695) {
			Static534.aBoolean695 = Static161.aBoolean224;
			local135 = Static276.method3885(Static368.aClass70_64, Static481.aClass276_2);
			local135.aClass1_Sub35_Sub2_1.method5777(Static161.aBoolean224 ? 1 : 0);
			Static48.method743(local135);
		}
		if (!Static266.aBoolean354) {
			local135 = Static276.method3885(Static574.aClass70_101, Static481.aClass276_2);
			local135.aClass1_Sub35_Sub2_1.method5777(0);
			local137 = local135.aClass1_Sub35_Sub2_1.anInt7214;
			@Pc(688) Class1_Sub35 local688 = new Class1_Sub35(Static316.method4384());
			Static348.aClass1_Sub30_Sub1_1.method3902(local688);
			local135.aClass1_Sub35_Sub2_1.method5781(local688.anInt7214, local688.aByteArray85);
			local135.aClass1_Sub35_Sub2_1.method5791(local135.aClass1_Sub35_Sub2_1.anInt7214 - local137);
			Static48.method743(local135);
			Static266.aBoolean354 = true;
		}
		if (Static292.aClass39ArrayArrayArray2 != null) {
			if (Static340.anInt5707 == 2) {
				Static329.method4512();
			} else if (Static340.anInt5707 == 3) {
				Static554.method7559();
			}
		}
		if (Static169.aBoolean229) {
			Static169.aBoolean229 = false;
		} else {
			Static85.aFloat17 /= 2.0F;
		}
		if (Static375.aBoolean492) {
			Static375.aBoolean492 = false;
		} else {
			Static333.aFloat127 /= 2.0F;
		}
		Static579.method7401();
		if (Static216.anInt4135 != 10) {
			return;
		}
		Static360.method4786();
		Static549.method6483();
		Static368.method4956();
		Static5.anInt62++;
		if (Static5.anInt62 > 750) {
			Static590.method7839();
			return;
		}
		Static48.method740();
		Static557.method7584();
		Static283.method3950();
		for (local58 = Static430.aClass321_1.method7087(true); local58 != -1; local58 = Static430.aClass321_1.method7087(false)) {
			Static465.method6404(local58);
			Static275.anIntArray371[Static66.anInt1328++ & 0x1F] = local58;
		}
		@Pc(867) Class341 local867;
		for (@Pc(819) Class1_Sub6_Sub16 local819 = Static246.method3674(); local819 != null; local819 = Static246.method3674()) {
			local441 = local819.method6595();
			local164 = local819.method6599();
			if (local441 == 1) {
				Static257.anIntArray365[local164] = local819.anInt8204;
				Static151.aBoolean207 |= Static574.aBooleanArray27[local164];
				Static418.anIntArray560[Static341.anInt3224++ & 0x1F] = local164;
			} else if (local441 == 2) {
				Static317.aStringArray25[local164] = local819.aString85;
				Static240.anIntArray346[Static492.anInt9042++ & 0x1F] = local164;
			} else if (local441 == 3) {
				local867 = Static350.method4758(local164);
				if (!local819.aString85.equals(local867.aString95)) {
					local867.aString95 = local819.aString85;
					Static442.method6111(local867);
				}
			} else if (local441 == 4) {
				local867 = Static350.method4758(local164);
				local223 = local819.anInt8204;
				local229 = local819.anInt8208;
				local240 = local819.anInt8205;
				if (local223 != local867.anInt9280 || local867.anInt9322 != local229 || local240 != local867.anInt9261) {
					local867.anInt9261 = local240;
					local867.anInt9280 = local223;
					local867.anInt9322 = local229;
					Static442.method6111(local867);
				}
			} else if (local441 == 5) {
				local867 = Static350.method4758(local164);
				if (local867.anInt9259 != local819.anInt8204 || local819.anInt8204 == -1) {
					local867.anInt9246 = 0;
					local867.anInt9288 = 1;
					local867.anInt9253 = 0;
					local867.anInt9259 = local819.anInt8204;
					@Pc(936) Class290 local936 = local867.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(local867.anInt9259);
					if (local936 != null) {
						Static236.method3580(local936, local867.anInt9253);
					}
					Static442.method6111(local867);
				}
			} else if (local441 == 6) {
				local180 = local819.anInt8204;
				local223 = local180 >> 10 & 0x1F;
				local229 = local180 >> 5 & 0x1F;
				local240 = local180 & 0x1F;
				@Pc(982) int local982 = (local240 << 3) + (local229 << 11) + (local223 << 19);
				@Pc(986) Class341 local986 = Static350.method4758(local164);
				if (local982 != local986.anInt9303) {
					local986.anInt9303 = local982;
					Static442.method6111(local986);
				}
			} else if (local441 == 7) {
				local867 = Static350.method4758(local164);
				@Pc(1017) boolean local1017 = local819.anInt8204 == 1;
				if (local1017 != local867.aBoolean717) {
					local867.aBoolean717 = local1017;
					Static442.method6111(local867);
				}
			} else if (local441 == 8) {
				local867 = Static350.method4758(local164);
				if (local819.anInt8204 != local867.anInt9269 || local819.anInt8208 != local867.anInt9323 || local867.anInt9276 != local819.anInt8205) {
					local867.anInt9323 = local819.anInt8208;
					local867.anInt9269 = local819.anInt8204;
					local867.anInt9276 = local819.anInt8205;
					if (local867.anInt9328 != -1) {
						if (local867.anInt9285 > 0) {
							local867.anInt9276 = local867.anInt9276 * 32 / local867.anInt9285;
						} else if (local867.anInt9305 > 0) {
							local867.anInt9276 = local867.anInt9276 * 32 / local867.anInt9305;
						}
					}
					Static442.method6111(local867);
				}
			} else if (local441 == 9) {
				local867 = Static350.method4758(local164);
				if (local819.anInt8204 != local867.anInt9328 || local867.anInt9324 != local819.anInt8208) {
					local867.anInt9328 = local819.anInt8204;
					local867.anInt9324 = local819.anInt8208;
					Static442.method6111(local867);
				}
			} else if (local441 == 10) {
				local867 = Static350.method4758(local164);
				if (local867.anInt9291 != local819.anInt8204 || local819.anInt8208 != local867.anInt9239 || local819.anInt8205 != local867.anInt9238) {
					local867.anInt9238 = local819.anInt8205;
					local867.anInt9239 = local819.anInt8208;
					local867.anInt9291 = local819.anInt8204;
					Static442.method6111(local867);
				}
			} else if (local441 == 11) {
				local867 = Static350.method4758(local164);
				local867.aByte117 = 0;
				local867.aByte119 = 0;
				local867.anInt9293 = local867.anInt9245 = local819.anInt8204;
				local867.lb = local867.anInt9279 = local819.anInt8208;
				Static442.method6111(local867);
			} else if (local441 == 12) {
				local867 = Static350.method4758(local164);
				local223 = local819.anInt8204;
				if (local867 != null && local867.anInt9309 == 0) {
					if (local223 > local867.anInt9274 - local867.anInt9248) {
						local223 = local867.anInt9274 - local867.anInt9248;
					}
					if (local223 < 0) {
						local223 = 0;
					}
					if (local867.anInt9256 != local223) {
						local867.anInt9256 = local223;
						Static442.method6111(local867);
					}
				}
			} else if (local441 == 14) {
				local867 = Static350.method4758(local164);
				local867.anInt9266 = local819.anInt8204;
			} else if (local441 == 15) {
				Static66.anInt1351 = local819.anInt8208;
				Static309.aBoolean425 = true;
				Static228.anInt4297 = local819.anInt8204;
			} else if (local441 == 16) {
				local867 = Static350.method4758(local164);
				local867.anInt9255 = local819.anInt8204;
			}
		}
		if (Static505.anInt8616 != 0) {
			Static576.anInt9487 += 20;
			if (Static576.anInt9487 >= 400) {
				Static505.anInt8616 = 0;
			}
		}
		Static504.anInt5717++;
		if (Static470.aClass341_19 != null) {
			Static170.anInt3017++;
			if (Static170.anInt3017 >= 15) {
				Static442.method6111(Static470.aClass341_19);
				Static470.aClass341_19 = null;
			}
		}
		Static490.aBoolean630 = false;
		Static323.aClass341_14 = null;
		Static519.aClass341_20 = null;
		Static388.aBoolean537 = false;
		Static195.method2979(null, -1, -1);
		Static265.method3804(-1, null, -1);
		if (!Static573.aBoolean740) {
			Static447.anInt7729 = -1;
		}
		Static275.method3877();
		anInt8002++;
		if (Static139.aBoolean197) {
			@Pc(1465) Class1_Sub11 local1465 = Static276.method3885(Static170.aClass70_27, Static481.aClass276_2);
			local1465.aClass1_Sub35_Sub2_1.method5773(Static235.anInt4389 | Static232.anInt4336 << 14 | Static579.anInt9073 << 28);
			Static48.method743(local1465);
			Static139.aBoolean197 = false;
		}
		while (true) {
			@Pc(1488) Class1_Sub15 local1488;
			@Pc(1493) Class341 local1493;
			do {
				local1488 = (Class1_Sub15) Static373.aClass353_45.method7688();
				if (local1488 == null) {
					while (true) {
						do {
							local1488 = (Class1_Sub15) Static173.aClass353_14.method7688();
							if (local1488 == null) {
								while (true) {
									do {
										local1488 = (Class1_Sub15) Static567.aClass353_64.method7688();
										if (local1488 == null) {
											if (Static323.aClass341_14 == null) {
												Static229.anInt4305 = 0;
											}
											if (Static93.aClass341_8 != null) {
												Static25.method274();
											}
											if (Static267.anInt4711 > 0 && Static137.aClass295_1.method7719(82) && Static137.aClass295_1.method7719(81) && Static587.anInt9589 != 0) {
												local441 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 - Static587.anInt9589;
												if (local441 < 0) {
													local441 = 0;
												} else if (local441 > 3) {
													local441 = 3;
												}
												Static17.method165(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray534[0] + Static541.anInt9058, local441, Static116.anInt2289 + Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anIntArray533[0]);
											}
											Static243.method3639();
											for (local441 = 0; local441 < 5; local441++) {
												@Pc(1698) int local1698 = Static342.anIntArray465[local441]++;
											}
											if (Static151.aBoolean207 && Static172.aLong98 < Static413.method5668() - 60000L) {
												Static356.method4864();
											}
											for (@Pc(1727) Class8_Sub2_Sub2 local1727 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4194(); local1727 != null; local1727 = (Class8_Sub2_Sub2) Static378.aClass209_4.method4191()) {
												if (Static413.method5668() / 1000L - 5L > (long) local1727.anInt9076) {
													if (local1727.aShort124 > 0) {
														Static83.method1476(5, 0, "", "", "", local1727.aString89 + Static568.aClass351_23.method7651(Static307.anInt5279));
													}
													if (local1727.aShort124 == 0) {
														Static83.method1476(5, 0, "", "", "", local1727.aString89 + Static568.aClass351_24.method7651(Static307.anInt5279));
													}
													local1727.method7615();
												}
											}
											Static107.anInt1782++;
											if (Static107.anInt1782 > 500) {
												Static107.anInt1782 = 0;
												local180 = (int) (Math.random() * 8.0D);
												if ((local180 & 0x1) == 1) {
													Static427.anInt7451 += Static424.anInt7340;
												}
												if ((local180 & 0x2) == 2) {
													Static451.anInt7767 += Static29.anInt424;
												}
												if ((local180 & 0x4) == 4) {
													Static482.anInt8102 += Static331.anInt5552;
												}
											}
											if (Static427.anInt7451 < -50) {
												Static424.anInt7340 = 2;
											}
											if (Static427.anInt7451 > 50) {
												Static424.anInt7340 = -2;
											}
											if (Static451.anInt7767 < -55) {
												Static29.anInt424 = 2;
											}
											if (Static451.anInt7767 > 55) {
												Static29.anInt424 = -2;
											}
											if (Static482.anInt8102 < -40) {
												Static331.anInt5552 = 1;
											}
											if (Static482.anInt8102 > 40) {
												Static331.anInt5552 = -1;
											}
											Static25.anInt356++;
											if (Static25.anInt356 > 500) {
												Static25.anInt356 = 0;
												local180 = (int) (Math.random() * 8.0D);
												if ((local180 & 0x1) == 1) {
													Static548.anInt8574 += Static269.anInt4735;
												}
												if ((local180 & 0x2) == 2) {
													Static348.anInt5786 += Static79.anInt1724;
												}
											}
											if (Static548.anInt8574 < -60) {
												Static269.anInt4735 = 2;
											}
											if (Static548.anInt8574 > 60) {
												Static269.anInt4735 = -2;
											}
											if (Static348.anInt5786 < -20) {
												Static79.anInt1724 = 1;
											}
											if (Static348.anInt5786 > 10) {
												Static79.anInt1724 = -1;
											}
											Static516.anInt8761++;
											if (Static516.anInt8761 > 50) {
												@Pc(1954) Class1_Sub11 local1954 = Static276.method3885(Static28.aClass70_6, Static481.aClass276_2);
												Static48.method743(local1954);
											}
											if (Static543.aBoolean700) {
												Static124.method5296();
												Static543.aBoolean700 = false;
											}
											try {
												Static173.method2438();
												return;
											} catch (@Pc(1967) IOException local1967) {
												Static590.method7839();
												return;
											}
										}
										local1493 = local1488.aClass341_10;
										if (local1493.anInt9270 < 0) {
											break;
										}
										local867 = Static350.method4758(local1493.anInt9252);
									} while (local867 == null || local867.aClass341Array2 == null || local1493.anInt9270 >= local867.aClass341Array2.length || local867.aClass341Array2[local1493.anInt9270] != local1493);
									Static80.method1451(local1488);
								}
							}
							local1493 = local1488.aClass341_10;
							if (local1493.anInt9270 < 0) {
								break;
							}
							local867 = Static350.method4758(local1493.anInt9252);
						} while (local867 == null || local867.aClass341Array2 == null || local1493.anInt9270 >= local867.aClass341Array2.length || local867.aClass341Array2[local1493.anInt9270] != local1493);
						Static80.method1451(local1488);
					}
				}
				local1493 = local1488.aClass341_10;
				if (local1493.anInt9270 < 0) {
					break;
				}
				local867 = Static350.method4758(local1493.anInt9252);
			} while (local867 == null || local867.aClass341Array2 == null || local1493.anInt9270 >= local867.aClass341Array2.length || local1493 != local867.aClass341Array2[local1493.anInt9270]);
			Static80.method1451(local1488);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BI)V")
	public static void method6436(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub6_Sub16 local13 = Static212.method3332(4, arg0);
		local13.method6593();
	}
}
