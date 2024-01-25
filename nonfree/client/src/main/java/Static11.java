import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
	public static int anInt160;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "J")
	public static long aLong6 = -1L;

	@OriginalMember(owner = "client!ag", name = "y", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_4 = new Class71(63, 0);

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
	public static int method157() {
		return Static34.anInt8129++;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)I")
	public static int method158() {
		return Static322.anInt6494;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method159() {
		if (Static128.anInt3427 > 1) {
			Static128.anInt3427--;
			Static409.anInt7812 = Static75.anInt2309;
		}
		if (Static306.aBoolean441) {
			Static306.aBoolean441 = false;
			Static428.method6640();
			return;
		}
		if (!Static211.aBoolean370) {
			Static16.method768();
		}
		for (@Pc(31) int local31 = 0; local31 < 100 && Static181.method3456(); local31++) {
		}
		if (Static435.anInt8191 != 10) {
			return;
		}
		@Pc(53) Class8_Sub31 local53;
		@Pc(64) int local64;
		while (Static14.method6447()) {
			local53 = Static51.method1418(Static309.aClass257_59, Static608.aClass336_1);
			local53.aClass8_Sub8_Sub2_1.method8562(0);
			local64 = local53.aClass8_Sub8_Sub2_1.anInt10588;
			Static224.method4179(local53.aClass8_Sub8_Sub2_1);
			local53.aClass8_Sub8_Sub2_1.method8536(local53.aClass8_Sub8_Sub2_1.anInt10588 - local64);
			Static262.method4604(local53);
		}
		if (Static246.aClass8_Sub48_2 == null) {
			if (Static342.method5463() >= Static18.aLong10) {
				Static246.aClass8_Sub48_2 = Static62.aClass182_1.method4826(Static471.aClass280_2.aString87);
			}
		} else if (Static246.aClass8_Sub48_2.anInt10047 != -1) {
			local53 = Static51.method1418(Static320.aClass257_61, Static608.aClass336_1);
			local53.aClass8_Sub8_Sub2_1.method8548(Static246.aClass8_Sub48_2.anInt10047);
			Static262.method4604(local53);
			Static246.aClass8_Sub48_2 = null;
			Static18.aLong10 = Static342.method5463() + 30000L;
		}
		@Pc(131) Class8_Sub33 local131 = (Class8_Sub33) Static188.aClass43_24.method1422();
		@Pc(146) int local146;
		@Pc(168) int local168;
		@Pc(187) int local187;
		@Pc(240) int local240;
		@Pc(247) int local247;
		@Pc(258) int local258;
		@Pc(144) Class8_Sub31 local144;
		if (local131 != null || Static141.aLong87 < Static342.method5463() - 2000L) {
			local144 = null;
			local146 = 0;
			for (@Pc(151) Class8_Sub33 local151 = (Class8_Sub33) Static140.aClass43_23.method1422(); local151 != null && (local144 == null || local144.aClass8_Sub8_Sub2_1.anInt10588 - local146 < 240); local151 = (Class8_Sub33) Static140.aClass43_23.method1426()) {
				local151.method8640();
				local168 = local151.method7207();
				if (local168 < -1) {
					local168 = -1;
				} else if (local168 > 65534) {
					local168 = 65534;
				}
				local187 = local151.method7202();
				if (local187 < -1) {
					local187 = -1;
				} else if (local187 > 65534) {
					local187 = 65534;
				}
				if (Static148.anInt6593 != local187 || Static569.anInt9789 != local168) {
					if (local144 == null) {
						local144 = Static51.method1418(Static440.aClass257_84, Static608.aClass336_1);
						local144.aClass8_Sub8_Sub2_1.method8562(0);
						local146 = local144.aClass8_Sub8_Sub2_1.anInt10588;
					}
					local240 = local187 - Static148.anInt6593;
					Static148.anInt6593 = local187;
					local247 = local168 - Static569.anInt9789;
					Static569.anInt9789 = local168;
					local258 = (int) ((local151.method7206() - Static141.aLong87) / 20L);
					if (local258 < 8 && local240 >= -32 && local240 <= 31 && local247 >= -32 && local247 <= 31) {
						local240 += 32;
						local247 += 32;
						local144.aClass8_Sub8_Sub2_1.method8548(local247 + (local258 << 12) + (local240 << 6));
					} else if (local258 < 32 && local240 >= -128 && local240 <= 127 && local247 >= -128 && local247 <= 127) {
						local247 += 128;
						local240 += 128;
						local144.aClass8_Sub8_Sub2_1.method8562(local258 + 128);
						local144.aClass8_Sub8_Sub2_1.method8548((local240 << 8) + local247);
					} else if (local258 >= 32) {
						local144.aClass8_Sub8_Sub2_1.method8548(local258 + 57344);
						if (local187 == 1 || local168 == -1) {
							local144.aClass8_Sub8_Sub2_1.method8523(Integer.MIN_VALUE);
						} else {
							local144.aClass8_Sub8_Sub2_1.method8523(local187 | local168 << 16);
						}
					} else {
						local144.aClass8_Sub8_Sub2_1.method8562(local258 + 192);
						if (local187 == 1 || local168 == -1) {
							local144.aClass8_Sub8_Sub2_1.method8523(Integer.MIN_VALUE);
						} else {
							local144.aClass8_Sub8_Sub2_1.method8523(local187 | local168 << 16);
						}
					}
					Static141.aLong87 = local151.method7206();
				}
			}
			if (local144 != null) {
				local144.aClass8_Sub8_Sub2_1.method8536(local144.aClass8_Sub8_Sub2_1.anInt10588 - local146);
				Static262.method4604(local144);
			}
		}
		@Pc(467) int local467;
		if (local131 != null) {
			@Pc(453) long local453 = (local131.method7206() - Static484.aLong224) / 50L;
			Static484.aLong224 = local131.method7206();
			if (local453 > 32767L) {
				local453 = 32767L;
			}
			local467 = local131.method7207();
			if (local467 < 0) {
				local467 = 0;
			} else if (local467 > 65535) {
				local467 = 65535;
			}
			local168 = local131.method7202();
			if (local168 < 0) {
				local168 = 0;
			} else if (local168 > 65535) {
				local168 = 65535;
			}
			@Pc(500) byte local500 = 0;
			if (local131.method7204() == 2) {
				local500 = 1;
			}
			local240 = (int) local453;
			@Pc(523) Class8_Sub31 local523 = Static51.method1418(Static418.aClass257_81, Static608.aClass336_1);
			local523.aClass8_Sub8_Sub2_1.method8572(local500 << 15 | local240);
			local523.aClass8_Sub8_Sub2_1.method8547(local168 | local467 << 16);
			Static262.method4604(local523);
		}
		if (Static349.anInt6741 > 0) {
			local144 = Static51.method1418(Static189.aClass257_39, Static608.aClass336_1);
			local144.aClass8_Sub8_Sub2_1.method8562(Static349.anInt6741 * 3);
			for (local146 = 0; local146 < Static349.anInt6741; local146++) {
				@Pc(572) Interface21 local572 = Static198.anInterface21Array1[local146];
				@Pc(580) long local580 = (local572.method3236() - Static52.aLong40) / 50L;
				if (local580 > 65535L) {
					local580 = 65535L;
				}
				Static52.aLong40 = local572.method3236();
				local144.aClass8_Sub8_Sub2_1.method8562(local572.method3240());
				local144.aClass8_Sub8_Sub2_1.method8548((int) local580);
			}
			Static262.method4604(local144);
		}
		if (Static15.anInt701 > 0) {
			Static15.anInt701--;
		}
		if (Static69.aBoolean558 && Static15.anInt701 <= 0) {
			Static15.anInt701 = 20;
			Static69.aBoolean558 = false;
			local144 = Static51.method1418(Static107.aClass257_22, Static608.aClass336_1);
			local144.aClass8_Sub8_Sub2_1.method8548((int) Static64.aFloat44 >> 3);
			local144.aClass8_Sub8_Sub2_1.method8546((int) Static499.aFloat185 >> 3);
			Static262.method4604(local144);
		}
		if (Static269.aBoolean407 != Static216.aBoolean372) {
			Static269.aBoolean407 = Static216.aBoolean372;
			local144 = Static51.method1418(Static5.aClass257_3, Static608.aClass336_1);
			local144.aClass8_Sub8_Sub2_1.method8562(Static216.aBoolean372 ? 1 : 0);
			Static262.method4604(local144);
		}
		if (!Static497.aBoolean740) {
			local144 = Static51.method1418(Static563.aClass257_106, Static608.aClass336_1);
			local144.aClass8_Sub8_Sub2_1.method8562(0);
			local146 = local144.aClass8_Sub8_Sub2_1.anInt10588;
			@Pc(717) Class8_Sub8 local717 = Static155.aClass8_Sub25_6.method3476();
			local144.aClass8_Sub8_Sub2_1.method8532(local717.anInt10588, 0, local717.aByteArray107);
			local144.aClass8_Sub8_Sub2_1.method8536(local144.aClass8_Sub8_Sub2_1.anInt10588 - local146);
			Static262.method4604(local144);
			Static497.aBoolean740 = true;
		}
		if (Static405.aClass56ArrayArrayArray2 != null) {
			if (Static427.anInt8005 == 2) {
				Static33.method1197();
			} else if (Static427.anInt8005 == 3) {
				Static54.method1597();
			}
		}
		if (Static78.aBoolean179) {
			Static78.aBoolean179 = false;
		} else {
			Static462.aFloat183 /= 2.0F;
		}
		if (Static317.aBoolean656) {
			Static317.aBoolean656 = false;
		} else {
			Static146.aFloat76 /= 2.0F;
		}
		Static119.method2633();
		if (Static435.anInt8191 != 10) {
			return;
		}
		Static623.method5387();
		Static464.method6970();
		Static111.method2527();
		Static602.anInt10248++;
		if (Static602.anInt10248 > 750) {
			Static428.method6640();
			return;
		}
		Static114.method2595();
		Static102.method2344();
		Static212.method4040();
		for (local64 = Static420.aClass77_1.method2389(true); local64 != -1; local64 = Static420.aClass77_1.method2389(false)) {
			Static437.method6742(local64);
			Static15.anIntArray15[Static240.anInt5377++ & 0x1F] = local64;
		}
		@Pc(890) Class331 local890;
		for (@Pc(841) Class8_Sub5_Sub8 local841 = Static569.method7908(); local841 != null; local841 = Static569.method7908()) {
			local467 = local841.method3514();
			local168 = local841.method3513();
			if (local467 == 1) {
				Static69.anIntArray417[local168] = local841.anInt4321;
				Static359.aBoolean485 |= Static378.aBooleanArray19[local168];
				Static160.anIntArray213[Static90.anInt2540++ & 0x1F] = local168;
			} else if (local467 == 2) {
				Static2.aStringArray12[local168] = local841.aString55;
				Static504.anIntArray496[Static32.anInt1304++ & 0x1F] = local168;
			} else if (local467 == 3) {
				local890 = Static178.method3435(local168);
				if (!local841.aString55.equals(local890.aString100)) {
					local890.aString100 = local841.aString55;
					Static86.method2113(local890);
				}
			} else if (local467 == 4) {
				local890 = Static178.method3435(local168);
				local240 = local841.anInt4321;
				local247 = local841.anInt4324;
				local258 = local841.anInt4329;
				if (local890.anInt9566 != local240 || local247 != local890.anInt9518 || local258 != local890.anInt9495) {
					local890.anInt9566 = local240;
					local890.anInt9495 = local258;
					local890.anInt9518 = local247;
					Static86.method2113(local890);
				}
			} else if (local467 == 5) {
				local890 = Static178.method3435(local168);
				if (local890.anInt9579 != local841.anInt4321 || local841.anInt4321 == -1) {
					local890.anInt9579 = local841.anInt4321;
					local890.anInt9538 = 0;
					local890.anInt9493 = 0;
					local890.anInt9573 = 1;
					@Pc(1366) Class97 local1366 = local890.anInt9579 == -1 ? null : Static28.aClass220_1.method5670(local890.anInt9579);
					if (local1366 != null) {
						Static168.method3340(local1366, local890.anInt9493);
					}
					Static86.method2113(local890);
				}
			} else if (local467 == 6) {
				local187 = local841.anInt4321;
				local240 = local187 >> 10 & 0x1F;
				local247 = local187 >> 5 & 0x1F;
				local258 = local187 & 0x1F;
				@Pc(1303) int local1303 = (local258 << 3) + (local247 << 11) + (local240 << 19);
				@Pc(1307) Class331 local1307 = Static178.method3435(local168);
				if (local1303 != local1307.anInt9572) {
					local1307.anInt9572 = local1303;
					Static86.method2113(local1307);
				}
			} else if (local467 == 7) {
				local890 = Static178.method3435(local168);
				@Pc(1260) boolean local1260 = local841.anInt4321 == 1;
				if (local890.aBoolean681 != local1260) {
					local890.aBoolean681 = local1260;
					Static86.method2113(local890);
				}
			} else if (local467 == 8) {
				local890 = Static178.method3435(local168);
				if (local890.anInt9517 != local841.anInt4321 || local890.anInt9550 != local841.anInt4324 || local890.anInt9552 != local841.anInt4329) {
					local890.anInt9550 = local841.anInt4324;
					local890.anInt9552 = local841.anInt4329;
					local890.anInt9517 = local841.anInt4321;
					if (local890.anInt9570 != -1) {
						if (local890.anInt9549 > 0) {
							local890.anInt9552 = local890.anInt9552 * 32 / local890.anInt9549;
						} else if (local890.anInt9504 > 0) {
							local890.anInt9552 = local890.anInt9552 * 32 / local890.anInt9504;
						}
					}
					Static86.method2113(local890);
				}
			} else if (local467 == 9) {
				local890 = Static178.method3435(local168);
				if (local890.anInt9570 != local841.anInt4321 || local890.anInt9516 != local841.anInt4324) {
					local890.anInt9516 = local841.anInt4324;
					local890.anInt9570 = local841.anInt4321;
					Static86.method2113(local890);
				}
			} else if (local467 == 10) {
				local890 = Static178.method3435(local168);
				if (local841.anInt4321 != local890.anInt9500 || local841.anInt4324 != local890.anInt9524 || local841.anInt4329 != local890.anInt9492) {
					local890.anInt9524 = local841.anInt4324;
					local890.anInt9492 = local841.anInt4329;
					local890.anInt9500 = local841.anInt4321;
					Static86.method2113(local890);
				}
			} else if (local467 == 11) {
				local890 = Static178.method3435(local168);
				local890.aByte110 = 0;
				local890.anInt9541 = local890.anInt9510 = local841.anInt4324;
				local890.anInt9528 = local890.anInt9533 = local841.anInt4321;
				local890.aByte107 = 0;
				Static86.method2113(local890);
			} else if (local467 == 12) {
				local890 = Static178.method3435(local168);
				local240 = local841.anInt4321;
				if (local890 != null && local890.anInt9490 == 0) {
					if (local890.anInt9575 - local890.anInt9505 < local240) {
						local240 = local890.anInt9575 - local890.anInt9505;
					}
					if (local240 < 0) {
						local240 = 0;
					}
					if (local890.anInt9503 != local240) {
						local890.anInt9503 = local240;
						Static86.method2113(local890);
					}
				}
			} else if (local467 == 14) {
				local890 = Static178.method3435(local168);
				local890.anInt9577 = local841.anInt4321;
			} else if (local467 == 15) {
				Static29.anInt1137 = local841.anInt4324;
				Static447.aBoolean310 = true;
				Static370.anInt7031 = local841.anInt4321;
			} else if (local467 == 16) {
				local890 = Static178.method3435(local168);
				local890.anInt9523 = local841.anInt4321;
			} else if (local467 == 17) {
				local890 = Static178.method3435(local168);
				local890.anInt9567 = local841.anInt4321;
			}
		}
		if (Static85.anInt8479 != 0) {
			Static459.anInt8403 += 20;
			if (Static459.anInt8403 >= 400) {
				Static85.anInt8479 = 0;
			}
		}
		Static77.anInt2367++;
		if (Static69.aClass331_12 != null) {
			Static398.anInt7663++;
			if (Static398.anInt7663 >= 15) {
				Static86.method2113(Static69.aClass331_12);
				Static69.aClass331_12 = null;
			}
		}
		Static228.aBoolean388 = false;
		Static261.aClass331_8 = null;
		Static367.aClass331_11 = null;
		Static205.aBoolean341 = false;
		Static385.method8094(-1, -1, null);
		Static570.method7927(null, -1, -1);
		if (!Static147.aBoolean270) {
			Static341.anInt6662 = -1;
		}
		Static103.method2359();
		Static75.anInt2309++;
		if (Static201.aBoolean337) {
			@Pc(1495) Class8_Sub31 local1495 = Static51.method1418(Static123.aClass257_27, Static608.aClass336_1);
			local1495.aClass8_Sub8_Sub2_1.method8567(Static500.anInt8807 << 14 | Static262.anInt5627 << 28 | Static204.anInt4698);
			Static262.method4604(local1495);
			Static201.aBoolean337 = false;
		}
		while (true) {
			@Pc(1520) Class8_Sub40 local1520;
			@Pc(1525) Class331 local1525;
			do {
				local1520 = (Class8_Sub40) Static148.aClass43_34.method1432();
				if (local1520 == null) {
					while (true) {
						do {
							local1520 = (Class8_Sub40) Static471.aClass43_55.method1432();
							if (local1520 == null) {
								while (true) {
									do {
										local1520 = (Class8_Sub40) Static203.aClass43_28.method1432();
										if (local1520 == null) {
											if (Static261.aClass331_8 == null) {
												Static88.anInt2513 = 0;
											}
											if (Static10.aClass331_3 != null) {
												Static137.method2950();
											}
											if (Static190.anInt7431 > 0 && Static295.aClass209_1.method5482(82) && Static295.aClass209_1.method5482(81) && Static92.anInt2553 != 0) {
												local467 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 - Static92.anInt2553;
												if (local467 < 0) {
													local467 = 0;
												} else if (local467 > 3) {
													local467 = 3;
												}
												Static165.method3305(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] + Static594.anInt10160, Static628.anInt10493 - -Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0], local467);
											}
											Static264.method4609();
											for (local467 = 0; local467 < 5; local467++) {
												@Pc(1732) int local1732 = Static626.anIntArray615[local467]++;
											}
											if (Static359.aBoolean485 && aLong6 < Static342.method5463() - 60000L) {
												Static579.method8093();
											}
											for (@Pc(1761) Class15_Sub5_Sub2 local1761 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3537(); local1761 != null; local1761 = (Class15_Sub5_Sub2) Static51.aClass123_2.method3541()) {
												if ((long) local1761.anInt10147 < Static342.method5463() / 1000L - 5L) {
													if (local1761.aShort118 > 0) {
														Static170.method3363(local1761.aString108 + Static121.aClass84_19.method2710(Static372.anInt7083), "", 5, 0, "", "");
													}
													if (local1761.aShort118 == 0) {
														Static170.method3363(local1761.aString108 + Static121.aClass84_20.method2710(Static372.anInt7083), "", 5, 0, "", "");
													}
													local1761.method8314();
												}
											}
											Static493.anInt8727++;
											if (Static493.anInt8727 > 500) {
												Static493.anInt8727 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x1) == 1) {
													Static291.anInt5939 += Static312.anInt6339;
												}
												if ((local187 & 0x2) == 2) {
													Static598.anInt2012 += Static96.anInt2618;
												}
												if ((local187 & 0x4) == 4) {
													Static425.anInt6305 += Static640.anInt10680;
												}
											}
											if (Static291.anInt5939 < -50) {
												Static312.anInt6339 = 2;
											}
											if (Static598.anInt2012 < -55) {
												Static96.anInt2618 = 2;
											}
											if (Static291.anInt5939 > 50) {
												Static312.anInt6339 = -2;
											}
											if (Static598.anInt2012 > 55) {
												Static96.anInt2618 = -2;
											}
											if (Static425.anInt6305 < -40) {
												Static640.anInt10680 = 1;
											}
											if (Static425.anInt6305 > 40) {
												Static640.anInt10680 = -1;
											}
											Static36.anInt1457++;
											if (Static36.anInt1457 > 500) {
												Static36.anInt1457 = 0;
												local187 = (int) (Math.random() * 8.0D);
												if ((local187 & 0x1) == 1) {
													Static642.anInt10689 += Static82.anInt2451;
												}
												if ((local187 & 0x2) == 2) {
													Static423.anInt7961 += Static542.anInt9407;
												}
											}
											if (Static642.anInt10689 < -60) {
												Static82.anInt2451 = 2;
											}
											if (Static642.anInt10689 > 60) {
												Static82.anInt2451 = -2;
											}
											if (Static423.anInt7961 < -20) {
												Static542.anInt9407 = 1;
											}
											Static271.anInt5723++;
											if (Static423.anInt7961 > 10) {
												Static542.anInt9407 = -1;
											}
											if (Static271.anInt5723 > 50) {
												@Pc(1988) Class8_Sub31 local1988 = Static51.method1418(Static8.aClass257_4, Static608.aClass336_1);
												Static262.method4604(local1988);
											}
											if (Static284.aBoolean423) {
												Static186.method3532();
												Static284.aBoolean423 = false;
											}
											try {
												Static441.method6809();
												return;
											} catch (@Pc(2001) IOException local2001) {
												Static428.method6640();
												return;
											}
										}
										local1525 = local1520.aClass331_14;
										if (local1525.anInt9535 < 0) {
											break;
										}
										local890 = Static178.method3435(local1525.anInt9509);
									} while (local890 == null || local890.aClass331Array2 == null || local1525.anInt9535 >= local890.aClass331Array2.length || local890.aClass331Array2[local1525.anInt9535] != local1525);
									Static273.method4698(local1520);
								}
							}
							local1525 = local1520.aClass331_14;
							if (local1525.anInt9535 < 0) {
								break;
							}
							local890 = Static178.method3435(local1525.anInt9509);
						} while (local890 == null || local890.aClass331Array2 == null || local890.aClass331Array2.length <= local1525.anInt9535 || local1525 != local890.aClass331Array2[local1525.anInt9535]);
						Static273.method4698(local1520);
					}
				}
				local1525 = local1520.aClass331_14;
				if (local1525.anInt9535 < 0) {
					break;
				}
				local890 = Static178.method3435(local1525.anInt9509);
			} while (local890 == null || local890.aClass331Array2 == null || local1525.anInt9535 >= local890.aClass331Array2.length || local890.aClass331Array2[local1525.anInt9535] != local1525);
			Static273.method4698(local1520);
		}
	}
}
