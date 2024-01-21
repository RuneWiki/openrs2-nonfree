import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt2759 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1934() {
		aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
	public static boolean method1935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(27) Class4_Sub4_Sub8 local27 = Static104.method1600(arg1);
		return local27.method996(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public static void method1936(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static35.anIntArray108[arg0];
		@Pc(17) int local17 = Static26.anIntArray83[arg0];
		@Pc(21) int local21 = Static95.anIntArray311[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(29) int local29 = Static33.anIntArray106[arg0];
		@Pc(38) Class4_Sub4_Sub3_Sub1_Sub2 local38;
		if (local21 == 41) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static60.anInt1572 = Static20.anInt427;
				Static69.aClass4_Sub10_Sub1_2.method611(119);
				Static69.aClass4_Sub10_Sub1_2.method566(local29);
			}
		}
		@Pc(115) boolean local115;
		if (local21 == 24) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1572 = Static20.anInt427;
			Static60.anInt1573 = 0;
			Static10.anInt204 = Static75.anInt1928;
			Static118.anInt2555 = 2;
			Static69.aClass4_Sub10_Sub1_2.method611(234);
			Static69.aClass4_Sub10_Sub1_2.method565(local17 + Static64.anInt1649);
			Static69.aClass4_Sub10_Sub1_2.method575(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
		}
		@Pc(205) int local205;
		@Pc(187) Class4_Sub8 local187;
		if (local21 == 20) {
			Static69.aClass4_Sub10_Sub1_2.method611(232);
			Static69.aClass4_Sub10_Sub1_2.method597(local17);
			local187 = Static52.method946(local17);
			if (local187.anIntArrayArray6 != null && local187.anIntArrayArray6[0][0] == 5) {
				local205 = local187.anIntArrayArray6[0][1];
				if (local187.anIntArray67[0] != Static124.anIntArray393[local205]) {
					Static124.anIntArray393[local205] = local187.anIntArray67[0];
					Static98.method1575(local205);
				}
			}
		}
		@Pc(232) Class4_Sub4_Sub3_Sub1_Sub1 local232;
		if (local21 == 35) {
			local232 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local232 != null) {
				Static68.method1136(0, 0, local232.anIntArray184[0], 0, 1, false, local232.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static60.anInt1572 = Static20.anInt427;
				Static69.aClass4_Sub10_Sub1_2.method611(217);
				Static69.aClass4_Sub10_Sub1_2.method603(local29);
			}
		}
		if (local21 == 47) {
			Static69.aClass4_Sub10_Sub1_2.method611(53);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
			Static69.aClass4_Sub10_Sub1_2.method603(local29);
			Static69.aClass4_Sub10_Sub1_2.method590(local17);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 26) {
			Static69.aClass4_Sub10_Sub1_2.method611(252);
			Static69.aClass4_Sub10_Sub1_2.method582(local17);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 5) {
			local232 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local232 != null) {
				Static68.method1136(0, 0, local232.anIntArray184[0], 0, 1, false, local232.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static69.aClass4_Sub10_Sub1_2.method611(137);
				Static69.aClass4_Sub10_Sub1_2.method603(local29);
			}
		}
		if (local21 == 4) {
			Static19.method791(local13, local29, local17);
			Static69.aClass4_Sub10_Sub1_2.method611(41);
			Static69.aClass4_Sub10_Sub1_2.method565(local17 + Static64.anInt1649);
			Static69.aClass4_Sub10_Sub1_2.method575(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method565(local29 >> 14 & 0x7FFF);
		}
		if (local21 == 44) {
			Static69.aClass4_Sub10_Sub1_2.method611(232);
			Static69.aClass4_Sub10_Sub1_2.method597(local17);
			local187 = Static52.method946(local17);
			if (local187.anIntArrayArray6 != null && local187.anIntArrayArray6[0][0] == 5) {
				local205 = local187.anIntArrayArray6[0][1];
				Static124.anIntArray393[local205] = 1 - Static124.anIntArray393[local205];
				Static98.method1575(local205);
			}
		}
		if (local21 == 1003) {
			Static60.anInt1572 = Static20.anInt427;
			Static10.anInt204 = Static75.anInt1928;
			Static60.anInt1573 = 0;
			Static118.anInt2555 = 2;
			local232 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local232 != null) {
				@Pc(509) Class4_Sub4_Sub10 local509 = local232.aClass4_Sub4_Sub10_1;
				if (local509.anIntArray231 != null) {
					local509 = local509.method1124();
				}
				if (local509 != null) {
					Static69.aClass4_Sub10_Sub1_2.method611(247);
					Static69.aClass4_Sub10_Sub1_2.method575(local509.anInt1709);
				}
			}
		}
		if (local21 == 34) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static10.anInt204 = Static75.anInt1928;
				Static69.aClass4_Sub10_Sub1_2.method611(245);
				Static69.aClass4_Sub10_Sub1_2.method603(Static9.anInt174);
				Static69.aClass4_Sub10_Sub1_2.method603(local29);
				Static69.aClass4_Sub10_Sub1_2.method603(Static56.anInt1471);
				Static69.aClass4_Sub10_Sub1_2.method586(Static130.anInt2777);
			}
		}
		if (local21 == 14) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1572 = Static20.anInt427;
				Static10.anInt204 = Static75.anInt1928;
				Static118.anInt2555 = 2;
				Static60.anInt1573 = 0;
				Static69.aClass4_Sub10_Sub1_2.method611(43);
				Static69.aClass4_Sub10_Sub1_2.method603(local29);
			}
		}
		if (local21 == 7) {
			Static69.aClass4_Sub10_Sub1_2.method611(62);
			Static69.aClass4_Sub10_Sub1_2.method603(local13);
			Static69.aClass4_Sub10_Sub1_2.method582(local17);
			Static69.aClass4_Sub10_Sub1_2.method565(local29);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 3) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static69.aClass4_Sub10_Sub1_2.method611(236);
				Static69.aClass4_Sub10_Sub1_2.method565(local29);
			}
		}
		if (local21 == 40) {
			local232 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local232 != null) {
				Static68.method1136(0, 0, local232.anIntArray184[0], 0, 1, false, local232.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static69.aClass4_Sub10_Sub1_2.method611(196);
				Static69.aClass4_Sub10_Sub1_2.method565(local29);
			}
		}
		if (local21 == 36) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1572 = Static20.anInt427;
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static69.aClass4_Sub10_Sub1_2.method611(172);
				Static69.aClass4_Sub10_Sub1_2.method575(local29);
			}
		}
		if (local21 == 38) {
			Static19.method791(local13, local29, local17);
			Static69.aClass4_Sub10_Sub1_2.method611(76);
			Static69.aClass4_Sub10_Sub1_2.method566(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method575(Static64.anInt1649 + local17);
			Static69.aClass4_Sub10_Sub1_2.method566(Static51.anInt2080 + local13);
		}
		if (local21 == 23) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static69.aClass4_Sub10_Sub1_2.method611(100);
				Static69.aClass4_Sub10_Sub1_2.method575(local29);
				Static69.aClass4_Sub10_Sub1_2.method566(Static92.anInt2152);
				Static69.aClass4_Sub10_Sub1_2.method590(Static90.anInt2117);
			}
		}
		if (local21 == 18) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1573 = 0;
			Static60.anInt1572 = Static20.anInt427;
			Static10.anInt204 = Static75.anInt1928;
			Static118.anInt2555 = 2;
			Static69.aClass4_Sub10_Sub1_2.method611(98);
			Static69.aClass4_Sub10_Sub1_2.method575(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
			Static69.aClass4_Sub10_Sub1_2.method603(local17 + Static64.anInt1649);
		}
		if (local21 == 51) {
			Static69.aClass4_Sub10_Sub1_2.method611(181);
			Static69.aClass4_Sub10_Sub1_2.method603(local29);
			Static69.aClass4_Sub10_Sub1_2.method566(local13);
			Static69.aClass4_Sub10_Sub1_2.method590(local17);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 42 && Static19.method791(local13, local29, local17)) {
			Static69.aClass4_Sub10_Sub1_2.method611(163);
			Static69.aClass4_Sub10_Sub1_2.method566(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method603(Static92.anInt2152);
			Static69.aClass4_Sub10_Sub1_2.method575(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method597(Static90.anInt2117);
			Static69.aClass4_Sub10_Sub1_2.method566(local17 + Static64.anInt1649);
		}
		if (local21 == 9) {
			Static54.aClass81_10.method1974(Static124.anInt2712, local13, local17);
		}
		if (local21 == 1001) {
			Static19.method791(local13, local29, local17);
			Static69.aClass4_Sub10_Sub1_2.method611(148);
			Static69.aClass4_Sub10_Sub1_2.method566(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method565(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method566(Static64.anInt1649 + local17);
		}
		if (local21 == 29) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1573 = 0;
				Static60.anInt1572 = Static20.anInt427;
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static69.aClass4_Sub10_Sub1_2.method611(51);
				Static69.aClass4_Sub10_Sub1_2.method565(local29);
			}
		}
		if (local21 == 39) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1572 = Static20.anInt427;
			Static60.anInt1573 = 0;
			Static10.anInt204 = Static75.anInt1928;
			Static118.anInt2555 = 2;
			Static69.aClass4_Sub10_Sub1_2.method611(173);
			Static69.aClass4_Sub10_Sub1_2.method575(Static56.anInt1471);
			Static69.aClass4_Sub10_Sub1_2.method575(Static64.anInt1649 + local17);
			Static69.aClass4_Sub10_Sub1_2.method603(local29);
			Static69.aClass4_Sub10_Sub1_2.method565(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method582(Static130.anInt2777);
			Static69.aClass4_Sub10_Sub1_2.method565(Static9.anInt174);
		}
		if (local21 == 1006) {
			Static118.anInt2555 = 2;
			Static60.anInt1573 = 0;
			Static10.anInt204 = Static75.anInt1928;
			Static60.anInt1572 = Static20.anInt427;
			Static69.aClass4_Sub10_Sub1_2.method611(183);
			Static69.aClass4_Sub10_Sub1_2.method575(local29 >> 14 & 0x7FFF);
		}
		if (local21 == 43) {
			Static69.aClass4_Sub10_Sub1_2.method611(64);
			Static69.aClass4_Sub10_Sub1_2.method590(local17);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
			Static69.aClass4_Sub10_Sub1_2.method603(local13);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 25) {
			Static69.aClass4_Sub10_Sub1_2.method611(94);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
			Static69.aClass4_Sub10_Sub1_2.method590(local17);
			Static69.aClass4_Sub10_Sub1_2.method603(local13);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 49) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1573 = 0;
			Static60.anInt1572 = Static20.anInt427;
			Static118.anInt2555 = 2;
			Static10.anInt204 = Static75.anInt1928;
			Static69.aClass4_Sub10_Sub1_2.method611(165);
			Static69.aClass4_Sub10_Sub1_2.method603(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method565(local29);
			Static69.aClass4_Sub10_Sub1_2.method566(local17 + Static64.anInt1649);
		}
		if (local21 == 8) {
			Static19.method791(local13, local29, local17);
			Static69.aClass4_Sub10_Sub1_2.method611(95);
			Static69.aClass4_Sub10_Sub1_2.method575(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method575(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method565(Static64.anInt1649 + local17);
		}
		if (local21 == 6) {
			local187 = Static52.method946(local17);
			@Pc(1524) boolean local1524 = true;
			if (local187.anInt458 > 0) {
				local1524 = Static78.method1406(local187);
			}
			if (local1524) {
				Static69.aClass4_Sub10_Sub1_2.method611(232);
				Static69.aClass4_Sub10_Sub1_2.method597(local17);
			}
		}
		if (local21 == 1) {
			local232 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local232 != null) {
				Static68.method1136(0, 0, local232.anIntArray184[0], 0, 1, false, local232.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static10.anInt204 = Static75.anInt1928;
				Static69.aClass4_Sub10_Sub1_2.method611(13);
				Static69.aClass4_Sub10_Sub1_2.method575(local29);
				Static69.aClass4_Sub10_Sub1_2.method597(Static90.anInt2117);
				Static69.aClass4_Sub10_Sub1_2.method566(Static92.anInt2152);
			}
		}
		if (local21 == 45) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1573 = 0;
			Static60.anInt1572 = Static20.anInt427;
			Static118.anInt2555 = 2;
			Static10.anInt204 = Static75.anInt1928;
			Static69.aClass4_Sub10_Sub1_2.method611(222);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
			Static69.aClass4_Sub10_Sub1_2.method590(Static90.anInt2117);
			Static69.aClass4_Sub10_Sub1_2.method566(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method603(Static64.anInt1649 + local17);
			Static69.aClass4_Sub10_Sub1_2.method566(Static92.anInt2152);
		}
		if (local21 == 33) {
			Static111.method1714();
			local187 = Static52.method946(local17);
			Static9.anInt174 = local13;
			Static130.anInt2777 = local17;
			Static39.anInt1125 = 1;
			Static56.anInt1471 = local29;
			Static63.method1095(local187);
			Static49.aClass76_557 = Static59.method1017(new Class76[] { Static54.aClass76_1195, Static61.method1040(local29).aClass76_556, Static81.aClass76_880 });
			if (Static49.aClass76_557 == null) {
				Static49.aClass76_557 = Static107.aClass76_1111;
			}
			return;
		}
		if (local21 == 28) {
			Static69.aClass4_Sub10_Sub1_2.method611(186);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
			Static69.aClass4_Sub10_Sub1_2.method590(local17);
			Static69.aClass4_Sub10_Sub1_2.method566(local13);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 13 || local21 == 1004) {
			Static77.method1397(local13, local17, local29, Static62.aClass76Array14[arg0]);
		}
		if (local21 == 32) {
			local38 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local38 != null) {
				Static68.method1136(0, 0, local38.anIntArray184[0], 0, 1, false, local38.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static118.anInt2555 = 2;
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static69.aClass4_Sub10_Sub1_2.method611(124);
				Static69.aClass4_Sub10_Sub1_2.method565(local29);
			}
		}
		if (local21 == 15 && Static19.method791(local13, local29, local17)) {
			Static69.aClass4_Sub10_Sub1_2.method611(185);
			Static69.aClass4_Sub10_Sub1_2.method575(Static64.anInt1649 + local17);
			Static69.aClass4_Sub10_Sub1_2.method582(Static130.anInt2777);
			Static69.aClass4_Sub10_Sub1_2.method603(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method566(Static56.anInt1471);
			Static69.aClass4_Sub10_Sub1_2.method603(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method603(Static9.anInt174);
		}
		if (local21 == 48 && Static65.aClass4_Sub8_5 == null) {
			Static10.method141(local17, local13);
			Static65.aClass4_Sub8_5 = Static62.method1079(local13, local17);
			Static63.method1095(Static65.aClass4_Sub8_5);
		}
		if (local21 == 1007) {
			Static60.anInt1573 = 0;
			Static60.anInt1572 = Static20.anInt427;
			Static10.anInt204 = Static75.anInt1928;
			Static118.anInt2555 = 2;
			Static69.aClass4_Sub10_Sub1_2.method611(93);
			Static69.aClass4_Sub10_Sub1_2.method565(local29);
		}
		if (local21 == 22) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static10.anInt204 = Static75.anInt1928;
			Static60.anInt1573 = 0;
			Static118.anInt2555 = 2;
			Static60.anInt1572 = Static20.anInt427;
			Static69.aClass4_Sub10_Sub1_2.method611(49);
			Static69.aClass4_Sub10_Sub1_2.method565(Static64.anInt1649 + local17);
			Static69.aClass4_Sub10_Sub1_2.method566(Static51.anInt2080 + local13);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
		}
		if (local21 == 50) {
			Static69.aClass4_Sub10_Sub1_2.method611(105);
			Static69.aClass4_Sub10_Sub1_2.method575(local29);
			Static69.aClass4_Sub10_Sub1_2.method575(Static92.anInt2152);
			Static69.aClass4_Sub10_Sub1_2.method565(local13);
			Static69.aClass4_Sub10_Sub1_2.method586(local17);
			Static69.aClass4_Sub10_Sub1_2.method586(Static90.anInt2117);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 2) {
			local187 = Static62.method1079(local13, local17);
			if (local187 != null) {
				Static111.method1714();
				Static54.method1751(local17, local13, Static122.method1889(Static35.method627(local187)));
				Static39.anInt1125 = 0;
				Static102.aClass76_1086 = Static43.method217(local187);
				if (Static102.aClass76_1086 == null) {
					Static102.aClass76_1086 = Static118.aClass76_1217;
				}
				if (!local187.aBoolean37) {
					Static117.aClass76_1203 = Static59.method1017(new Class76[] { Static50.aClass76_566, local187.aClass76_202, Static81.aClass76_880 });
					return;
				}
				Static117.aClass76_1203 = Static59.method1017(new Class76[] { local187.aClass76_200, Static81.aClass76_880 });
			}
			return;
		}
		if (local21 == 12) {
			local115 = Static68.method1136(0, 0, local13, 0, 0, false, local17, 0, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			if (!local115) {
				Static68.method1136(0, 0, local13, 0, 1, false, local17, 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
			}
			Static60.anInt1573 = 0;
			Static60.anInt1572 = Static20.anInt427;
			Static118.anInt2555 = 2;
			Static10.anInt204 = Static75.anInt1928;
			Static69.aClass4_Sub10_Sub1_2.method611(34);
			Static69.aClass4_Sub10_Sub1_2.method566(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
			Static69.aClass4_Sub10_Sub1_2.method566(local17 + Static64.anInt1649);
		}
		if (local21 == 1005) {
			local187 = Static52.method946(local17);
			if (local187 == null || local187.anIntArray66[local13] < 100000) {
				Static69.aClass4_Sub10_Sub1_2.method611(93);
				Static69.aClass4_Sub10_Sub1_2.method565(local29);
			} else {
				Static21.method328(0, Static133.aClass76_1322, Static59.method1017(new Class76[] { Static63.method1092(local187.anIntArray66[local13]), Static124.aClass76_1267, Static61.method1040(local29).aClass76_556 }));
			}
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 19) {
			Static62.method1078();
		}
		if (local21 == 10) {
			Static69.aClass4_Sub10_Sub1_2.method611(79);
			Static69.aClass4_Sub10_Sub1_2.method566(Static92.anInt2152);
			Static69.aClass4_Sub10_Sub1_2.method597(Static90.anInt2117);
			Static69.aClass4_Sub10_Sub1_2.method586(local17);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
		}
		if (local21 == 31) {
			Static69.aClass4_Sub10_Sub1_2.method611(201);
			Static69.aClass4_Sub10_Sub1_2.method582(local17);
			Static69.aClass4_Sub10_Sub1_2.method603(local29);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 57) {
			Static69.aClass4_Sub10_Sub1_2.method611(254);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
			Static69.aClass4_Sub10_Sub1_2.method565(local13);
			Static69.aClass4_Sub10_Sub1_2.method597(local17);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		@Pc(2379) Class4_Sub4_Sub3_Sub1_Sub1 local2379;
		if (local21 == 21) {
			local2379 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local2379 != null) {
				Static68.method1136(0, 0, local2379.anIntArray184[0], 0, 1, false, local2379.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1573 = 0;
				Static60.anInt1572 = Static20.anInt427;
				Static118.anInt2555 = 2;
				Static69.aClass4_Sub10_Sub1_2.method611(54);
				Static69.aClass4_Sub10_Sub1_2.method566(local29);
			}
		}
		if (local21 == 58) {
			Static69.aClass4_Sub10_Sub1_2.method611(96);
			Static69.aClass4_Sub10_Sub1_2.method603(local29);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
			Static69.aClass4_Sub10_Sub1_2.method597(local17);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 46) {
			Static69.aClass4_Sub10_Sub1_2.method611(190);
			Static69.aClass4_Sub10_Sub1_2.method565(Static9.anInt174);
			Static69.aClass4_Sub10_Sub1_2.method586(Static130.anInt2777);
			Static69.aClass4_Sub10_Sub1_2.method566(local29);
			Static69.aClass4_Sub10_Sub1_2.method575(local13);
			Static69.aClass4_Sub10_Sub1_2.method582(local17);
			Static69.aClass4_Sub10_Sub1_2.method566(Static56.anInt1471);
			Static3.anInt2204 = 0;
			Static123.aClass4_Sub8_15 = Static52.method946(local17);
			Static105.anInt2346 = local13;
		}
		if (local21 == 30) {
			Static19.method791(local13, local29, local17);
			Static69.aClass4_Sub10_Sub1_2.method611(66);
			Static69.aClass4_Sub10_Sub1_2.method566(local13 + Static51.anInt2080);
			Static69.aClass4_Sub10_Sub1_2.method603(local29 >> 14 & 0x7FFF);
			Static69.aClass4_Sub10_Sub1_2.method565(local17 + Static64.anInt1649);
		}
		@Pc(2549) Class4_Sub4_Sub3_Sub1_Sub2 local2549;
		if (local21 == 17) {
			local2549 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local2549 != null) {
				Static68.method1136(0, 0, local2549.anIntArray184[0], 0, 1, false, local2549.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1572 = Static20.anInt427;
				Static118.anInt2555 = 2;
				Static60.anInt1573 = 0;
				Static69.aClass4_Sub10_Sub1_2.method611(184);
				Static69.aClass4_Sub10_Sub1_2.method566(local29);
			}
		}
		if (local21 == 11) {
			local2549 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local29];
			if (local2549 != null) {
				Static68.method1136(0, 0, local2549.anIntArray184[0], 0, 1, false, local2549.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static10.anInt204 = Static75.anInt1928;
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static69.aClass4_Sub10_Sub1_2.method611(241);
				Static69.aClass4_Sub10_Sub1_2.method603(local29);
			}
		}
		if (local21 == 16) {
			local2379 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local2379 != null) {
				Static68.method1136(0, 0, local2379.anIntArray184[0], 0, 1, false, local2379.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static10.anInt204 = Static75.anInt1928;
				Static118.anInt2555 = 2;
				Static69.aClass4_Sub10_Sub1_2.method611(138);
				Static69.aClass4_Sub10_Sub1_2.method603(Static9.anInt174);
				Static69.aClass4_Sub10_Sub1_2.method575(local29);
				Static69.aClass4_Sub10_Sub1_2.method603(Static56.anInt1471);
				Static69.aClass4_Sub10_Sub1_2.method597(Static130.anInt2777);
			}
		}
		if (local21 == 37) {
			local2379 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local29];
			if (local2379 != null) {
				Static68.method1136(0, 0, local2379.anIntArray184[0], 0, 1, false, local2379.anIntArray180[0], 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], 2, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0]);
				Static60.anInt1572 = Static20.anInt427;
				Static60.anInt1573 = 0;
				Static118.anInt2555 = 2;
				Static10.anInt204 = Static75.anInt1928;
				Static69.aClass4_Sub10_Sub1_2.method611(57);
				Static69.aClass4_Sub10_Sub1_2.method566(local29);
			}
		}
		if (Static39.anInt1125 != 0) {
			Static39.anInt1125 = 0;
			Static63.method1095(Static52.method946(Static130.anInt2777));
		}
		if (Static18.aBoolean21) {
			Static111.method1714();
		}
		if (Static123.aClass4_Sub8_15 != null && Static3.anInt2204 == 0) {
			Static63.method1095(Static123.aClass4_Sub8_15);
		}
	}
}
