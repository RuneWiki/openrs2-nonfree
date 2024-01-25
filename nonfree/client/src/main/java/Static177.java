import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Z")
	public static boolean aBoolean317;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "[I")
	public static final int[] anIntArray236 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
	public static void method2568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static427.method5426(arg0, 16);
		local13.method384();
		local13.anInt381 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IJ)V")
	public static void method2570(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BIII)Z")
	public static boolean method2571(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface7 local9 = (Interface7) Static464.method5366(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static265.method3664(local9) & true;
		}
		local9 = (Interface7) Static423.method5398(arg0, arg2, arg1, nc.class);
		if (local9 != null) {
			local11 &= Static265.method3664(local9);
		}
		local9 = (Interface7) Static168.method2856(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static265.method3664(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	public static void method2572() {
		Static426.aClass1_Sub19_Sub2_2.method2912(Static408.aClass185_75.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static367.aClass185_96.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static98.aClass185_30.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static456.aClass185_58.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static84.aClass185_26.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static210.aClass185_119.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static355.aClass185_89.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static412.aClass185_111.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static178.aClass185_49.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static222.aClass185_62.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static434.aClass185_115.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static153.aClass185_42.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static377.aClass185_99.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static386.aClass185_118.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static429.aClass185_114.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static317.aClass185_84.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static92.aClass185_65.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static192.aClass185_57.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static417.aClass185_112.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static350.aClass185_88.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static313.aClass185_81.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static267.aClass185_72.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static44.aClass185_9.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static465.aClass185_117.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static407.aClass185_107.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static208.aClass185_60.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static246.aClass185_68.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static367.aClass185_95.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static98.aClass185_31.method4014());
		Static426.aClass1_Sub19_Sub2_2.method2912(Static389.aClass185_102.method4014());
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method2573() {
		if (Static175.anInt3046 > 1) {
			Static175.anInt3046--;
			Static356.anInt5794 = Static163.anInt5780;
		}
		if (Static106.aBoolean649) {
			Static106.aBoolean649 = false;
			Static75.method935();
			return;
		}
		if (!Static170.aBoolean282) {
			Static447.method5754();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static135.method1730(); local27++) {
		}
		if (Static135.anInt2114 != 9) {
			return;
		}
		Static50.method670(Static426.aClass1_Sub19_Sub2_2, Static242.aClass242_73.method5144());
		if (Static374.aClass1_Sub17_5 == null) {
			if (Static183.method2674() >= Static116.aLong97) {
				Static374.aClass1_Sub17_5 = Static93.aClass217_1.method4582(Static440.aClass112_6.aString28);
			}
		} else if (Static374.aClass1_Sub17_5.anInt2301 != -1) {
			Static178.method2589(Static235.aClass242_67);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static374.aClass1_Sub17_5.anInt2301);
			Static374.aClass1_Sub17_5 = null;
			Static116.aLong97 = Static183.method2674() + 30000L;
		}
		@Pc(97) Class1_Sub22 local97 = (Class1_Sub22) Static378.aClass14_45.method203();
		@Pc(136) int local136;
		@Pc(153) int local153;
		@Pc(166) boolean local166;
		@Pc(217) int local217;
		@Pc(224) int local224;
		@Pc(237) int local237;
		if (local97 != null || Static183.method2674() - 2000L > Static18.aLong142) {
			@Pc(108) boolean local108 = false;
			@Pc(111) int local111 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
			for (@Pc(116) Class1_Sub22 local116 = (Class1_Sub22) Static296.aClass14_32.method203(); local116 != null && Static426.aClass1_Sub19_Sub2_2.anInt3698 - local111 < 240; local116 = (Class1_Sub22) Static296.aClass14_32.method208()) {
				local116.method5953();
				local136 = local116.method4161();
				if (local136 < 0) {
					local136 = 0;
				} else if (local136 > 65534) {
					local136 = 65534;
				}
				local153 = local116.method4162();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local166 = false;
				if (local116.method4161() == -1 && local116.method4162() == -1) {
					local153 = -1;
					local136 = -1;
					local166 = true;
				}
				if (Static426.anInt6830 != local153 || local136 != Static320.anInt5282) {
					if (!local108) {
						Static178.method2589(Static102.aClass242_30);
						Static426.aClass1_Sub19_Sub2_2.method2934(0);
						local111 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
						local108 = true;
					}
					local217 = local153 - Static426.anInt6830;
					Static426.anInt6830 = local153;
					local224 = local136 - Static320.anInt5282;
					Static320.anInt5282 = local136;
					local237 = (int) ((local116.method4157() - Static18.aLong142) / 20L);
					if (local237 < 8 && local217 >= -32 && local217 <= 31 && local224 >= -32 && local224 <= 31) {
						local217 += 32;
						local224 += 32;
						Static426.aClass1_Sub19_Sub2_2.method2930(local224 + (local217 << 6) + (local237 << 12));
					} else if (local237 < 32 && local217 >= -128 && local217 <= 127 && local224 >= -128 && local224 <= 127) {
						local224 += 128;
						local217 += 128;
						Static426.aClass1_Sub19_Sub2_2.method2934(local237 + 128);
						Static426.aClass1_Sub19_Sub2_2.method2930((local217 << 8) + local224);
					} else if (local237 < 32) {
						Static426.aClass1_Sub19_Sub2_2.method2934(local237 + 192);
						if (local166) {
							Static426.aClass1_Sub19_Sub2_2.method2912(Integer.MIN_VALUE);
						} else {
							Static426.aClass1_Sub19_Sub2_2.method2912(local153 | local136 << 16);
						}
					} else {
						Static426.aClass1_Sub19_Sub2_2.method2930(local237 + 57344);
						if (local166) {
							Static426.aClass1_Sub19_Sub2_2.method2912(Integer.MIN_VALUE);
						} else {
							Static426.aClass1_Sub19_Sub2_2.method2912(local136 << 16 | local153);
						}
					}
					Static18.aLong142 = local116.method4157();
				}
			}
			if (local108) {
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local111);
			}
		}
		@Pc(404) int local404;
		@Pc(453) int local453;
		if (local97 != null) {
			@Pc(390) long local390 = (local97.method4157() - Static250.aLong155) / 50L;
			if (local390 > 32767L) {
				local390 = 32767L;
			}
			Static250.aLong155 = local97.method4157();
			local404 = local97.method4161();
			if (local404 < 0) {
				local404 = 0;
			} else if (local404 > 65535) {
				local404 = 65535;
			}
			local136 = local97.method4162();
			if (local136 < 0) {
				local136 = 0;
			} else if (local136 > 65535) {
				local136 = 65535;
			}
			@Pc(434) byte local434 = 0;
			if (local97.method4156() == 2) {
				local434 = 1;
			}
			Static178.method2589(Static176.aClass242_47);
			local453 = (int) local390;
			Static426.aClass1_Sub19_Sub2_2.method2930(local434 << 15 | local453);
			Static426.aClass1_Sub19_Sub2_2.method2887(local136 | local404 << 16);
		}
		@Pc(491) int local491;
		if (Static407.anInt6525 > 0) {
			Static178.method2589(Static339.aClass242_90);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static407.anInt6525 * 3);
			for (local491 = 0; local491 < Static407.anInt6525; local491++) {
				@Pc(497) Interface13 local497 = Static443.anInterface13Array2[local491];
				@Pc(505) long local505 = (local497.method4456() - Static394.aLong212) / 50L;
				Static394.aLong212 = local497.method4456();
				if (local505 > 65535L) {
					local505 = 65535L;
				}
				Static426.aClass1_Sub19_Sub2_2.method2934(local497.method4455());
				Static426.aClass1_Sub19_Sub2_2.method2930((int) local505);
			}
		}
		if (Static434.anInt6897 > 0) {
			Static434.anInt6897--;
		}
		if (Static413.aBoolean582 && Static434.anInt6897 <= 0) {
			Static413.aBoolean582 = false;
			Static434.anInt6897 = 20;
			Static178.method2589(Static212.aClass242_57);
			Static426.aClass1_Sub19_Sub2_2.method2930((int) Static99.aFloat9 >> 3);
			Static426.aClass1_Sub19_Sub2_2.method2894((int) Static336.aFloat72 >> 3);
		}
		if (Static397.aBoolean556 && !Static247.aBoolean409) {
			Static247.aBoolean409 = true;
			Static178.method2589(Static120.aClass242_34);
			Static426.aClass1_Sub19_Sub2_2.method2934(1);
		}
		if (!Static397.aBoolean556 && Static247.aBoolean409) {
			Static247.aBoolean409 = false;
			Static178.method2589(Static120.aClass242_34);
			Static426.aClass1_Sub19_Sub2_2.method2934(0);
		}
		if (!Static355.aBoolean515) {
			Static178.method2589(Static19.aClass242_1);
			Static426.aClass1_Sub19_Sub2_2.method2934(0);
			local491 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
			@Pc(650) Class1_Sub19 local650 = Static126.aClass19_Sub1_1.method3345();
			Static426.aClass1_Sub19_Sub2_2.method2921(local650.aByteArray38, local650.anInt3698);
			Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local491);
			Static355.aBoolean515 = true;
		}
		if (Static259.aClass216ArrayArrayArray3 != null) {
			if (Static139.anInt2147 == 2) {
				Static375.method4863();
			} else if (Static139.anInt2147 == 3) {
				Static391.method5084();
			}
		}
		if (Static397.aBoolean557) {
			Static397.aBoolean557 = false;
		} else {
			Static392.aFloat81 /= 2.0F;
		}
		if (Static224.aBoolean370) {
			Static224.aBoolean370 = false;
		} else {
			Static286.aFloat68 /= 2.0F;
		}
		Static92.method3328();
		if (Static135.anInt2114 != 9) {
			return;
		}
		Static436.method5492();
		Static152.method1917();
		Static440.method2583();
		Static345.method4491();
		Static417.anInt6744++;
		if (Static417.anInt6744 > 750) {
			Static75.method935();
			return;
		}
		Static238.method3396();
		Static17.method3341();
		Static133.method1699();
		for (local491 = Static32.aClass4_1.method36(true); local491 != -1; local491 = Static32.aClass4_1.method36(false)) {
			Static220.method3162(local491);
			Static465.anIntArray520[Static46.anInt5440++ & 0x1F] = local491;
		}
		@Pc(811) Class107 local811;
		for (@Pc(769) Class1_Sub3_Sub1 local769 = Static423.method5400(); local769 != null; local769 = Static423.method5400()) {
			local404 = local769.method387();
			local136 = local769.method382();
			if (local404 == 1) {
				Static136.anIntArray184[local136] = local769.anInt381;
				Static57.aBoolean116 |= Static173.aBooleanArray67[local136];
				Static139.anIntArray186[Static128.anInt1969++ & 0x1F] = local136;
			} else if (local404 == 2) {
				Static244.aStringArray3[local136] = local769.aString4;
				Static288.anIntArray366[Static455.anInt7243++ & 0x1F] = local136;
			} else if (local404 == 3) {
				local811 = Static55.method754(local136);
				if (!local769.aString4.equals(local811.aString26)) {
					local811.aString26 = local769.aString4;
					Static260.method3633(local811);
				}
			} else if (local404 == 4) {
				local811 = Static55.method754(local136);
				local453 = local769.anInt381;
				local217 = local769.anInt387;
				local224 = local769.anInt384;
				if (local453 != local811.anInt2615 || local217 != local811.anInt2596 || local224 != local811.anInt2652) {
					local811.anInt2652 = local224;
					local811.anInt2615 = local453;
					local811.anInt2596 = local217;
					Static260.method3633(local811);
				}
			} else if (local404 == 5) {
				local811 = Static55.method754(local136);
				if (local769.anInt381 != local811.anInt2647 || local769.anInt381 == -1) {
					local811.anInt2590 = 0;
					local811.anInt2647 = local769.anInt381;
					local811.anInt2662 = 1;
					local811.anInt2619 = 0;
					Static260.method3633(local811);
				}
			} else if (local404 == 6) {
				local153 = local769.anInt381;
				local453 = local153 >> 10 & 0x1F;
				local217 = local153 >> 5 & 0x1F;
				local224 = local153 & 0x1F;
				local237 = (local217 << 11) + (local453 << 19) + (local224 << 3);
				@Pc(1199) Class107 local1199 = Static55.method754(local136);
				if (local1199.anInt2584 != local237) {
					local1199.anInt2584 = local237;
					Static260.method3633(local1199);
				}
			} else if (local404 == 7) {
				local811 = Static55.method754(local136);
				local166 = local769.anInt381 == 1;
				if (local811.aBoolean267 != local166) {
					local811.aBoolean267 = local166;
					Static260.method3633(local811);
				}
			} else if (local404 == 8) {
				local811 = Static55.method754(local136);
				if (local811.anInt2599 != local769.anInt381 || local769.anInt387 != local811.anInt2659 || local811.anInt2592 != local769.anInt384) {
					local811.anInt2592 = local769.anInt384;
					local811.anInt2599 = local769.anInt381;
					local811.anInt2659 = local769.anInt387;
					if (local811.anInt2631 != -1) {
						if (local811.anInt2602 > 0) {
							local811.anInt2592 = local811.anInt2592 * 32 / local811.anInt2602;
						} else if (local811.anInt2630 > 0) {
							local811.anInt2592 = local811.anInt2592 * 32 / local811.anInt2630;
						}
					}
					Static260.method3633(local811);
				}
			} else if (local404 == 9) {
				local811 = Static55.method754(local136);
				if (local769.anInt381 != local811.anInt2631 || local769.anInt387 != local811.anInt2586) {
					local811.anInt2586 = local769.anInt387;
					local811.anInt2631 = local769.anInt381;
					Static260.method3633(local811);
				}
			} else if (local404 == 10) {
				local811 = Static55.method754(local136);
				if (local769.anInt381 != local811.anInt2608 || local769.anInt387 != local811.anInt2627 || local769.anInt384 != local811.anInt2644) {
					local811.anInt2644 = local769.anInt384;
					local811.anInt2627 = local769.anInt387;
					local811.anInt2608 = local769.anInt381;
					Static260.method3633(local811);
				}
			} else if (local404 == 11) {
				local811 = Static55.method754(local136);
				local811.aByte45 = 0;
				local811.anInt2618 = local811.anInt2582 = local769.anInt387;
				local811.aByte46 = 0;
				local811.anInt2594 = local811.anInt2611 = local769.anInt381;
				Static260.method3633(local811);
			} else if (local404 == 12) {
				local811 = Static55.method754(local136);
				local453 = local769.anInt381;
				if (local811 != null && local811.anInt2598 == 0) {
					if (local811.anInt2597 - local811.anInt2606 < local453) {
						local453 = local811.anInt2597 - local811.anInt2606;
					}
					if (local453 < 0) {
						local453 = 0;
					}
					if (local453 != local811.anInt2646) {
						local811.anInt2646 = local453;
						Static260.method3633(local811);
					}
				}
			} else if (local404 == 14) {
				local811 = Static55.method754(local136);
				local811.anInt2656 = local769.anInt381;
			} else if (local404 == 15) {
				Static288.anInt4834 = local769.anInt387;
				Static207.aBoolean358 = true;
				Static460.anInt7364 = local769.anInt381;
			} else if (local404 == 16) {
				local811 = Static55.method754(local136);
				local811.anInt2666 = local769.anInt381;
			}
		}
		if (Static40.anInt598 != 0) {
			Static344.anInt5674 += 20;
			if (Static344.anInt5674 >= 400) {
				Static40.anInt598 = 0;
			}
		}
		Static71.anInt1041++;
		if (Static184.aClass107_8 != null) {
			Static83.anInt1148++;
			if (Static83.anInt1148 >= 15) {
				Static260.method3633(Static184.aClass107_8);
				Static184.aClass107_8 = null;
			}
		}
		Static399.aClass107_14 = null;
		Static333.aBoolean496 = false;
		Static180.aBoolean320 = false;
		Static35.aClass107_1 = null;
		Static357.method4687(null, -1, -1);
		Static255.method3575(-1, null, -1);
		if (!Static290.aBoolean449) {
			Static211.anInt5191 = -1;
		}
		Static5.method50();
		Static163.anInt5780++;
		if (Static282.aBoolean431) {
			Static178.method2589(Static49.aClass242_11);
			Static426.aClass1_Sub19_Sub2_2.method2887(Static383.anInt6138 << 14 | Static250.anInt4448 << 28 | Static59.anInt945);
			Static282.aBoolean431 = false;
		}
		while (true) {
			@Pc(1408) Class1_Sub11 local1408;
			@Pc(1413) Class107 local1413;
			do {
				local1408 = (Class1_Sub11) Static322.aClass14_34.method202();
				if (local1408 == null) {
					while (true) {
						do {
							local1408 = (Class1_Sub11) Static449.aClass14_51.method202();
							if (local1408 == null) {
								while (true) {
									do {
										local1408 = (Class1_Sub11) Static328.aClass14_38.method202();
										if (local1408 == null) {
											if (Static399.aClass107_14 == null) {
												Static302.anInt5060 = 0;
											}
											if (Static364.aClass107_13 != null) {
												Static108.method1348();
											}
											if (Static435.anInt6026 > 0 && Static269.aClass53_1.method3910(82) && Static269.aClass53_1.method3910(81) && Static426.anInt6829 != 0) {
												local404 = Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 - Static426.anInt6829;
												if (local404 < 0) {
													local404 = 0;
												} else if (local404 > 3) {
													local404 = 3;
												}
												Static290.method3881(Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray247[0] + Static47.anInt676, Static94.aClass11_Sub1_Sub3_Sub2_1.anIntArray246[0] + Static315.anInt5207, local404);
											}
											Static139.method1755();
											for (local404 = 0; local404 < 5; local404++) {
												@Pc(1619) int local1619 = Static215.anIntArray71[local404]++;
											}
											if (Static57.aBoolean116 && Static46.aLong180 < Static183.method2674() - 60000L) {
												Static317.method4196();
											}
											for (@Pc(1646) Class111_Sub1_Sub1 local1646 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1019(); local1646 != null; local1646 = (Class111_Sub1_Sub1) Static230.aClass63_3.method1022()) {
												if ((long) local1646.anInt4273 < Static183.method2674() / 1000L - 5L) {
													if (local1646.aShort60 > 0) {
														Static439.method5510(local1646.aString43 + Static431.aClass142_111.method3118(Static63.anInt981), "", "", 5, 0);
													}
													if (local1646.aShort60 == 0) {
														Static439.method5510(local1646.aString43 + Static307.aClass142_78.method3118(Static63.anInt981), "", "", 5, 0);
													}
													local1646.method5886();
												}
											}
											Static432.anInt6886++;
											if (Static432.anInt6886 > 500) {
												Static432.anInt6886 = 0;
												local153 = (int) (Math.random() * 8.0D);
												if ((local153 & 0x4) == 4) {
													Static232.anInt4194 += Static387.anInt6226;
												}
												if ((local153 & 0x2) == 2) {
													Static102.anInt1386 += Static209.anInt3893;
												}
												if ((local153 & 0x1) == 1) {
													Static75.anInt1063 += Static90.anInt1210;
												}
											}
											if (Static75.anInt1063 < -50) {
												Static90.anInt1210 = 2;
											}
											if (Static75.anInt1063 > 50) {
												Static90.anInt1210 = -2;
											}
											if (Static102.anInt1386 < -55) {
												Static209.anInt3893 = 2;
											}
											if (Static102.anInt1386 > 55) {
												Static209.anInt3893 = -2;
											}
											if (Static232.anInt4194 < -40) {
												Static387.anInt6226 = 1;
											}
											Static244.anInt209++;
											if (Static232.anInt4194 > 40) {
												Static387.anInt6226 = -1;
											}
											if (Static244.anInt209 > 500) {
												Static244.anInt209 = 0;
												local153 = (int) (Math.random() * 8.0D);
												if ((local153 & 0x1) == 1) {
													Static20.anInt301 += Static197.anInt3608;
												}
												if ((local153 & 0x2) == 2) {
													Static265.anInt4616 += Static317.anInt5241;
												}
											}
											if (Static20.anInt301 < -60) {
												Static197.anInt3608 = 2;
											}
											if (Static265.anInt4616 < -20) {
												Static317.anInt5241 = 1;
											}
											if (Static20.anInt301 > 60) {
												Static197.anInt3608 = -2;
											}
											Static133.anInt2068++;
											if (Static265.anInt4616 > 10) {
												Static317.anInt5241 = -1;
											}
											if (Static133.anInt2068 > 50) {
												Static178.method2589(Static407.aClass242_110);
											}
											if (Static101.aBoolean155) {
												Static99.method1164();
												Static101.aBoolean155 = false;
											}
											try {
												if (Static337.aClass110_2 != null && Static426.aClass1_Sub19_Sub2_2.anInt3698 > 0) {
													Static238.anInt4297 += Static426.aClass1_Sub19_Sub2_2.anInt3698;
													Static337.aClass110_2.method3778(Static426.aClass1_Sub19_Sub2_2.aByteArray38, Static426.aClass1_Sub19_Sub2_2.anInt3698);
													Static133.anInt2068 = 0;
													Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
													return;
												}
												return;
											} catch (@Pc(1896) IOException local1896) {
												Static75.method935();
												return;
											}
										}
										local1413 = local1408.aClass107_2;
										if (local1413.anInt2643 < 0) {
											break;
										}
										local811 = Static55.method754(local1413.anInt2624);
									} while (local811 == null || local811.aClass107Array2 == null || local1413.anInt2643 >= local811.aClass107Array2.length || local811.aClass107Array2[local1413.anInt2643] != local1413);
									Static198.method2834(local1408);
								}
							}
							local1413 = local1408.aClass107_2;
							if (local1413.anInt2643 < 0) {
								break;
							}
							local811 = Static55.method754(local1413.anInt2624);
						} while (local811 == null || local811.aClass107Array2 == null || local1413.anInt2643 >= local811.aClass107Array2.length || local811.aClass107Array2[local1413.anInt2643] != local1413);
						Static198.method2834(local1408);
					}
				}
				local1413 = local1408.aClass107_2;
				if (local1413.anInt2643 < 0) {
					break;
				}
				local811 = Static55.method754(local1413.anInt2624);
			} while (local811 == null || local811.aClass107Array2 == null || local811.aClass107Array2.length <= local1413.anInt2643 || local811.aClass107Array2[local1413.anInt2643] != local1413);
			Static198.method2834(local1408);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!oi;)V")
	public static void method2574(@OriginalArg(1) Class185 arg0) {
		Static277.aClass185_73 = arg0;
	}
}
