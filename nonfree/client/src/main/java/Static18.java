import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!gf;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!jb;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public static int anInt555 = -1;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!u;")
	private static Class74 aClass74_443 = Static72.method1077("Loading)3)3)3");

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_441 = aClass74_443;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_442 = Static72.method1077("mod_icons");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public static int anInt558 = 0;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public static int anInt562 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
	public static void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		@Pc(15) int[] local15 = new int[4];
		local15[0] = arg1;
		local4[0] = arg0;
		@Pc(25) int local25 = 1;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			if (Static101.anIntArray321[local27] != arg1) {
				local15[local25] = Static101.anIntArray321[local27];
				local4[local25] = Static35.anIntArray413[local27];
				local25++;
			}
		}
		Static35.anIntArray413 = local4;
		Static101.anIntArray321 = local15;
		Static97.method1937(Static83.aClass32Array1.length - 1, 0, Static83.aClass32Array1, Static101.anIntArray321, Static35.anIntArray413);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)V")
	public static void method408(@OriginalArg(0) boolean arg0) {
		if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 >> 7 == Static71.anInt1556 && Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 >> 7 == Static109.anInt2398) {
			Static71.anInt1556 = 0;
		}
		@Pc(25) int local25 = Static10.anInt320;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(41) Class2_Sub2_Sub2_Sub1_Sub2 local41;
			@Pc(47) int local47;
			if (arg0) {
				local41 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1;
				local47 = 33538048;
			} else {
				local41 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local31]];
				local47 = Static92.anIntArray267[local31] << 14;
			}
			if (local41 != null && local41.method1861()) {
				local41.aBoolean117 = false;
				if ((Static84.aBoolean73 && Static10.anInt320 > 50 || Static10.anInt320 > 200) && !arg0 && local41.anInt2722 == local41.anInt2663) {
					local41.aBoolean117 = true;
				}
				@Pc(85) int local85 = local41.anInt2673 >> 7;
				@Pc(90) int local90 = local41.anInt2672 >> 7;
				if (local85 >= 0 && local85 < 104 && local90 >= 0 && local90 < 104) {
					if (local41.aClass2_Sub2_Sub2_Sub5_3 == null || Static107.anInt2338 < local41.anInt2733 || Static107.anInt2338 >= local41.anInt2732) {
						if ((local41.anInt2673 & 0x7F) == 64 && (local41.anInt2672 & 0x7F) == 64) {
							if (Static57.anInt1378 == Static55.anIntArrayArray4[local85][local90]) {
								continue;
							}
							Static55.anIntArrayArray4[local85][local90] = Static57.anInt1378;
						}
						local41.anInt2724 = Static15.method348(local41.anInt2673, local41.anInt2672, Static117.anInt2529);
						Static84.aClass69_1.method1637(Static117.anInt2529, local41.anInt2673, local41.anInt2672, local41.anInt2724, 60, local41, local41.anInt2720, local47, local41.aBoolean116);
					} else {
						local41.aBoolean117 = false;
						local41.anInt2724 = Static15.method348(local41.anInt2673, local41.anInt2672, Static117.anInt2529);
						Static84.aClass69_1.method1627(Static117.anInt2529, local41.anInt2673, local41.anInt2672, local41.anInt2724, local41, local41.anInt2720, local47, local41.anInt2743, local41.anInt2730, local41.anInt2745, local41.anInt2731);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method409() {
		aClass74_441 = null;
		aClass37_1 = null;
		aClass74_443 = null;
		aClass30_1 = null;
		aClass74_442 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	private static void method410() {
		Static78.aClass9_38.method1589();
		Static83.aClass2_Sub2_Sub1_Sub1_36.method97(0, 0);
		Static44.method728();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ve;I)V")
	public static void method411(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		@Pc(4) int local4 = arg0.anInt2796;
		@Pc(92) int local92;
		if (local4 >= 1 && local4 <= 100 || !(local4 < 701 || local4 > 800)) {
			if (Static54.anInt1325 == 0) {
				if (local4 == 1) {
					arg0.anInt2828 = 0;
					arg0.aClass74_1690 = Static120.aClass74_1607;
					return;
				}
				if (local4 == 2) {
					arg0.anInt2828 = 0;
					arg0.aClass74_1690 = Static127.aClass74_1715;
					return;
				}
			}
			if (Static54.anInt1325 == 1) {
				if (local4 == 1) {
					arg0.aClass74_1690 = Static56.aClass74_950;
					arg0.anInt2828 = 0;
					return;
				}
				if (local4 == 2) {
					arg0.aClass74_1690 = Static127.aClass74_1713;
					arg0.anInt2828 = 0;
					return;
				}
				if (local4 == 3) {
					arg0.aClass74_1690 = Static10.aClass74_276;
					arg0.anInt2828 = 0;
					return;
				}
			}
			local92 = Static65.anInt1450;
			if (Static54.anInt1325 != 2) {
				local92 = 0;
			}
			if (local4 <= 700) {
				local4--;
			} else {
				local4 -= 601;
			}
			if (local4 >= local92) {
				arg0.aClass74_1690 = Static97.aClass74_1736;
				arg0.anInt2828 = 0;
			} else {
				arg0.aClass74_1690 = Static19.aClass74Array2[local4];
				arg0.anInt2828 = 1;
			}
		} else if (local4 >= 101 && local4 <= 200 || local4 >= 801 && local4 <= 900) {
			if (local4 > 800) {
				local4 -= 701;
			} else {
				local4 -= 101;
			}
			local92 = Static65.anInt1450;
			if (Static54.anInt1325 != 2) {
				local92 = 0;
			}
			if (local4 >= local92) {
				arg0.aClass74_1690 = Static97.aClass74_1736;
				arg0.anInt2828 = 0;
			} else {
				if (Static78.anIntArray251[local4] == 0) {
					arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static98.aClass74_1414, Static66.aClass74_1025 });
				} else if (Static78.anIntArray251[local4] < 5000) {
					if (Static45.anInt1033 == Static78.anIntArray251[local4]) {
						arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static70.aClass74_1086, Static126.aClass74_1704, Static56.method940(Static78.anIntArray251[local4]) });
					} else {
						arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static20.aClass74_469, Static126.aClass74_1704, Static56.method940(Static78.anIntArray251[local4]) });
					}
				} else if (Static45.anInt1033 == Static78.anIntArray251[local4]) {
					arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static70.aClass74_1086, Static62.aClass74_991, Static56.method940(Static78.anIntArray251[local4] - 5000) });
				} else {
					arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static20.aClass74_469, Static62.aClass74_991, Static56.method940(Static78.anIntArray251[local4] - 5000) });
				}
				arg0.anInt2828 = 1;
			}
		} else if (local4 == 203) {
			local92 = Static65.anInt1450;
			if (Static54.anInt1325 != 2) {
				local92 = 0;
			}
			arg0.anInt2807 = local92 * 15 + 20;
			if (arg0.anInt2829 >= arg0.anInt2807) {
				arg0.anInt2807 = arg0.anInt2829 + 1;
			}
		} else if (local4 >= 401 && local4 <= 500) {
			local4 -= 401;
			if (local4 == 0 && Static54.anInt1325 == 0) {
				arg0.aClass74_1690 = Static34.aClass74_622;
				arg0.anInt2828 = 0;
			} else if (local4 == 1 && Static54.anInt1325 == 0) {
				arg0.anInt2828 = 0;
				arg0.aClass74_1690 = Static127.aClass74_1715;
			} else {
				local92 = Static101.anInt2247;
				if (Static54.anInt1325 == 0) {
					local92 = 0;
				}
				if (local4 >= local92) {
					arg0.aClass74_1690 = Static97.aClass74_1736;
					arg0.anInt2828 = 0;
				} else {
					arg0.aClass74_1690 = Static112.method1686(Static10.aLongArray6[local4]).method1720();
					arg0.anInt2828 = 1;
				}
			}
		} else if (local4 == 503) {
			arg0.anInt2807 = Static101.anInt2247 * 15 + 20;
			if (arg0.anInt2807 <= arg0.anInt2829) {
				arg0.anInt2807 = arg0.anInt2829 + 1;
			}
		} else if (local4 == 324) {
			if (Static127.anInt2879 == -1) {
				Static127.anInt2879 = arg0.anInt2826;
				Static100.anInt2220 = arg0.anInt2827;
			}
			if (Static109.aClass14_1.aBoolean20) {
				arg0.anInt2826 = Static127.anInt2879;
			} else {
				arg0.anInt2826 = Static100.anInt2220;
			}
		} else if (local4 == 325) {
			if (Static127.anInt2879 == -1) {
				Static100.anInt2220 = arg0.anInt2827;
				Static127.anInt2879 = arg0.anInt2826;
			}
			if (Static109.aClass14_1.aBoolean20) {
				arg0.anInt2826 = Static100.anInt2220;
			} else {
				arg0.anInt2826 = Static127.anInt2879;
			}
		} else if (local4 == 327) {
			arg0.anInt2824 = 150;
			arg0.anInt2793 = (int) (Math.sin((double) Static107.anInt2338 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2767 = 5;
			arg0.anInt2812 = 0;
		} else if (local4 == 328) {
			arg0.anInt2824 = 150;
			arg0.anInt2793 = (int) (Math.sin((double) Static107.anInt2338 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2812 = 1;
			arg0.anInt2767 = 5;
		} else if (local4 == 600) {
			arg0.aClass74_1690 = Static91.method1340(new Class74[] { Static97.aClass74_1722, Static5.aClass74_47 });
		} else if (local4 == 620) {
			if (Static5.anInt64 < 1) {
				arg0.aClass74_1690 = Static97.aClass74_1736;
			} else if (Static105.aBoolean98) {
				arg0.aClass74_1690 = Static3.aClass74_33;
				arg0.anInt2818 = 16711680;
			} else {
				arg0.anInt2818 = 16777215;
				arg0.aClass74_1690 = Static93.aClass74_1329;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!ud;ILclient!pe;)V")
	public static void method412(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(3) Class26_Sub1 arg2) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.aLong96 = arg0;
		local7.aClass26_Sub1_68 = arg2;
		local7.anInt2409 = 1;
		local7.aClass77_4 = arg1;
		@Pc(22) Class13 local22 = Static19.aClass13_17;
		synchronized (Static19.aClass13_17) {
			Static19.aClass13_17.method418(local7);
		}
		Static110.method1674();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method413() {
		Static31.method574();
		Static107.aBoolean100 = true;
		method410();
		@Pc(31) boolean local31;
		if (Static66.anInt1458 != -1) {
			local31 = Static85.method1295(1, 261, 190, Static66.anInt1458);
			if (!local31) {
				Static116.aBoolean107 = true;
			}
		} else if (Static16.anIntArray49[Static42.anInt980] != -1) {
			local31 = Static85.method1295(1, 261, 190, Static16.anIntArray49[Static42.anInt980]);
			if (!local31) {
				Static116.aBoolean107 = true;
			}
		}
		if (Static109.aBoolean103 && Static78.anInt1701 == 1) {
			if (Static95.anInt2095 == 1) {
				Static101.method1559();
			} else {
				Static52.method877();
			}
		}
		Static68.method1035();
	}
}
