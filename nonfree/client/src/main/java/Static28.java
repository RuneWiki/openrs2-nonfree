import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public static int anInt802;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt797 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_386 = Static56.method816("title_mute");

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array14 = new Class8_Sub1_Sub3_Sub3[1000];

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_387 = Static56.method816("headicons_prayer");

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!ic;")
	public static Class34 aClass34_388 = Static56.method816("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!ic;")
	private static Class34 aClass34_389 = Static56.method816("shake:");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_390 = aClass34_389;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public static int anInt803 = 0;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_391 = Static56.method816(" is already on your friend list)3");

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!ic;")
	public static Class34 aClass34_392 = aClass34_391;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_393 = aClass34_389;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public static void method499(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static21.anIntArray71[arg0];
		@Pc(14) int local14 = Static104.anIntArray328[arg0];
		@Pc(18) int local18 = Static50.anIntArray166[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(26) int local26 = Static117.anIntArray363[arg0];
		@Pc(33) Class8_Sub1_Sub1_Sub4_Sub1 local33;
		if (local18 == 25) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(19);
				Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			}
		}
		@Pc(110) boolean local110;
		if (local18 == 6) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static133.anInt3067 = 0;
			Static132.anInt2817 = Static3.anInt51;
			Static106.aClass8_Sub20_Sub1_3.method1907(136);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static82.anInt1959 + local14);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static64.anInt2062 + local10);
		}
		if (local18 == 48) {
			Static106.aClass8_Sub20_Sub1_3.method1907(96);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14);
			Static106.aClass8_Sub20_Sub1_3.method1876(local10);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 17) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static132.anInt2817 = Static3.anInt51;
			Static133.anInt3067 = 0;
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static106.aClass8_Sub20_Sub1_3.method1907(220);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1843(Static2.anInt32);
			Static106.aClass8_Sub20_Sub1_3.method1869(Static64.anInt2062 + local10);
			Static106.aClass8_Sub20_Sub1_3.method1881(Static23.anInt712);
			Static106.aClass8_Sub20_Sub1_3.method1876(Static120.anInt2878);
		}
		if (local18 == 47) {
			Static3.method24(local10, local26, local14);
			Static106.aClass8_Sub20_Sub1_3.method1907(249);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1881(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 5 && Static126.aClass8_Sub24_8 == null) {
			Static109.method1533(local14, local10);
			Static126.aClass8_Sub24_8 = Static69.method1044(local10, local14);
			Static40.method608(Static126.aClass8_Sub24_8);
		}
		@Pc(362) Class8_Sub24 local362;
		if (local18 == 51) {
			Static67.method1012();
			local362 = Static113.method1614(local10);
			Static2.anInt32 = local26;
			Static120.anInt2878 = local10;
			Static88.anInt2340 = 1;
			Static23.anInt712 = local14;
			Static40.method608(local362);
			Static88.aClass34_1100 = Static44.method669(new Class34[] { Static111.aClass34_1398, Static7.method49(local26).aClass34_812, Static81.aClass34_889 });
			if (Static88.aClass34_1100 == null) {
				Static88.aClass34_1100 = Static97.aClass34_1056;
			}
			return;
		}
		if (local18 == 34) {
			Static106.aClass8_Sub20_Sub1_3.method1907(108);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			Static106.aClass8_Sub20_Sub1_3.method1867(local10);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 41 || local18 == 1004) {
			Static84.method1251(local10, Static6.aClass34Array3[arg0], local26, local14);
		}
		if (local18 == 45) {
			Static3.aClass64_1.method1413(Static42.anInt1024, local14, local10);
		}
		if (local18 == 29) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static81.anInt1954 = Static74.anInt1781;
				Static16.anInt393 = 2;
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static106.aClass8_Sub20_Sub1_3.method1907(29);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			}
		}
		if (local18 == 44) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static81.anInt1954 = Static74.anInt1781;
			Static132.anInt2817 = Static3.anInt51;
			Static16.anInt393 = 2;
			Static133.anInt3067 = 0;
			Static106.aClass8_Sub20_Sub1_3.method1907(100);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1869(Static64.anInt2062 + local10);
		}
		if (local18 == 35) {
			Static106.aClass8_Sub20_Sub1_3.method1907(86);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static125.anInt3001);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14);
			Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			Static106.aClass8_Sub20_Sub1_3.method1873(Static2.anInt29);
		}
		if (local18 == 21 && Static3.method24(local10, local26, local14)) {
			Static106.aClass8_Sub20_Sub1_3.method1907(101);
			Static106.aClass8_Sub20_Sub1_3.method1869(Static125.anInt3001);
			Static106.aClass8_Sub20_Sub1_3.method1841(Static2.anInt29);
			Static106.aClass8_Sub20_Sub1_3.method1881(Static64.anInt2062 + local10);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26 >> 14 & 0x7FFF);
			Static106.aClass8_Sub20_Sub1_3.method1884(local14 + Static82.anInt1959);
		}
		@Pc(717) int local717;
		if (local18 == 12) {
			Static106.aClass8_Sub20_Sub1_3.method1907(158);
			Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			local362 = Static113.method1614(local10);
			if (local362.anIntArrayArray29 != null && local362.anIntArrayArray29[0][0] == 5) {
				local717 = local362.anIntArrayArray29[0][1];
				Static78.anIntArray238[local717] = 1 - Static78.anIntArray238[local717];
				Static15.method237(local717);
			}
		}
		if (local18 == 15) {
			local362 = Static69.method1044(local10, local14);
			if (local362 != null) {
				Static67.method1012();
				Static109.method1534(local10, Static47.method735(Static99.method1445(local362)), local14);
				Static88.anInt2340 = 0;
				Static49.aClass34_652 = Static38.method590(local362);
				if (Static49.aClass34_652 == null) {
					Static49.aClass34_652 = Static13.aClass34_196;
				}
				if (local362.aBoolean117) {
					Static120.aClass34_1321 = Static44.method669(new Class34[] { local362.aClass34_1435, Static81.aClass34_889 });
					return;
				}
				Static120.aClass34_1321 = Static44.method669(new Class34[] { Static96.aClass34_279, local362.aClass34_1433, Static81.aClass34_889 });
			}
			return;
		}
		if (local18 == 7) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static133.anInt3067 = 0;
			Static132.anInt2817 = Static3.anInt51;
			Static16.anInt393 = 2;
			Static81.anInt1954 = Static74.anInt1781;
			Static106.aClass8_Sub20_Sub1_3.method1907(31);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static106.aClass8_Sub20_Sub1_3.method1843(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static82.anInt1959 + local14);
		}
		@Pc(891) Class8_Sub1_Sub1_Sub4_Sub2 local891;
		if (local18 == 57) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(166);
				Static106.aClass8_Sub20_Sub1_3.method1869(local26);
				Static106.aClass8_Sub20_Sub1_3.method1881(Static23.anInt712);
				Static106.aClass8_Sub20_Sub1_3.method1843(Static2.anInt32);
				Static106.aClass8_Sub20_Sub1_3.method1876(Static120.anInt2878);
			}
		}
		if (local18 == 9) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static132.anInt2817 = Static3.anInt51;
			Static81.anInt1954 = Static74.anInt1781;
			Static133.anInt3067 = 0;
			Static16.anInt393 = 2;
			Static106.aClass8_Sub20_Sub1_3.method1907(124);
			Static106.aClass8_Sub20_Sub1_3.method1881(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static82.anInt1959 + local14);
			Static106.aClass8_Sub20_Sub1_3.method1873(Static2.anInt29);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			Static106.aClass8_Sub20_Sub1_3.method1881(Static125.anInt3001);
		}
		if (local18 == 49) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static132.anInt2817 = Static3.anInt51;
				Static81.anInt1954 = Static74.anInt1781;
				Static133.anInt3067 = 0;
				Static16.anInt393 = 2;
				Static106.aClass8_Sub20_Sub1_3.method1907(11);
				Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			}
		}
		if (local18 == 24) {
			Static106.aClass8_Sub20_Sub1_3.method1907(103);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14);
			Static106.aClass8_Sub20_Sub1_3.method1841(local10);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 30) {
			Static106.aClass8_Sub20_Sub1_3.method1907(76);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14);
			Static106.aClass8_Sub20_Sub1_3.method1867(local10);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 14) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static133.anInt3067 = 0;
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static132.anInt2817 = Static3.anInt51;
			Static106.aClass8_Sub20_Sub1_3.method1907(0);
			Static106.aClass8_Sub20_Sub1_3.method1884(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1881(local26);
		}
		if (local18 == 32) {
			Static106.aClass8_Sub20_Sub1_3.method1907(223);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14);
			Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 22) {
			Static3.method24(local10, local26, local14);
			Static106.aClass8_Sub20_Sub1_3.method1907(51);
			Static106.aClass8_Sub20_Sub1_3.method1843(Static64.anInt2062 + local10);
			Static106.aClass8_Sub20_Sub1_3.method1869(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 13) {
			Static3.method24(local10, local26, local14);
			Static106.aClass8_Sub20_Sub1_3.method1907(57);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26 >> 14 & 0x7FFF);
			Static106.aClass8_Sub20_Sub1_3.method1884(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1843(Static82.anInt1959 + local14);
		}
		if (local18 == 1003) {
			Static3.method24(local10, local26, local14);
			Static106.aClass8_Sub20_Sub1_3.method1907(135);
			Static106.aClass8_Sub20_Sub1_3.method1881(Static64.anInt2062 + local10);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26 >> 14 & 0x7FFF);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static82.anInt1959 + local14);
		}
		if (local18 == 46) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static81.anInt1954 = Static74.anInt1781;
				Static16.anInt393 = 2;
				Static106.aClass8_Sub20_Sub1_3.method1907(115);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			}
		}
		if (local18 == 3) {
			Static106.aClass8_Sub20_Sub1_3.method1907(172);
			Static106.aClass8_Sub20_Sub1_3.method1876(local10);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 1005) {
			Static132.anInt2817 = Static3.anInt51;
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static133.anInt3067 = 0;
			Static106.aClass8_Sub20_Sub1_3.method1907(95);
			Static106.aClass8_Sub20_Sub1_3.method1881(local26);
		}
		if (local18 == 10) {
			Static54.method782();
		}
		if (local18 == 39) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(88);
				Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			}
		}
		if (local18 == 11) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static81.anInt1954 = Static74.anInt1781;
				Static133.anInt3067 = 0;
				Static106.aClass8_Sub20_Sub1_3.method1907(5);
				Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			}
		}
		if (local18 == 37) {
			Static106.aClass8_Sub20_Sub1_3.method1907(244);
			Static106.aClass8_Sub20_Sub1_3.method1869(Static125.anInt3001);
			Static106.aClass8_Sub20_Sub1_3.method1841(local10);
			Static106.aClass8_Sub20_Sub1_3.method1876(Static2.anInt29);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 43) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static16.anInt393 = 2;
				Static132.anInt2817 = Static3.anInt51;
				Static106.aClass8_Sub20_Sub1_3.method1907(9);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			}
		}
		if (local18 == 4) {
			Static3.method24(local10, local26, local14);
			Static106.aClass8_Sub20_Sub1_3.method1907(210);
			Static106.aClass8_Sub20_Sub1_3.method1869(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1881(local26 >> 14 & 0x7FFF);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static64.anInt2062 + local10);
		}
		if (local18 == 20) {
			local110 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local14, local10, 0, false);
			if (!local110) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local14, local10, 1, false);
			}
			Static132.anInt2817 = Static3.anInt51;
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static133.anInt3067 = 0;
			Static106.aClass8_Sub20_Sub1_3.method1907(237);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static82.anInt1959 + local14);
			Static106.aClass8_Sub20_Sub1_3.method1843(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26);
		}
		if (local18 == 28) {
			Static106.aClass8_Sub20_Sub1_3.method1907(112);
			Static106.aClass8_Sub20_Sub1_3.method1869(local14);
			Static106.aClass8_Sub20_Sub1_3.method1867(local10);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static23.anInt712);
			Static106.aClass8_Sub20_Sub1_3.method1873(Static120.anInt2878);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static2.anInt32);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 31) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static81.anInt1954 = Static74.anInt1781;
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static106.aClass8_Sub20_Sub1_3.method1907(235);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			}
		}
		if (local18 == 23) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(137);
				Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			}
		}
		if (local18 == 40) {
			local362 = Static113.method1614(local10);
			@Pc(2029) boolean local2029 = true;
			if (local362.anInt3143 > 0) {
				local2029 = Static124.method1960(local362);
			}
			if (local2029) {
				Static106.aClass8_Sub20_Sub1_3.method1907(158);
				Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			}
		}
		if (local18 == 16) {
			Static106.aClass8_Sub20_Sub1_3.method1907(37);
			Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			Static106.aClass8_Sub20_Sub1_3.method1843(local26);
			Static106.aClass8_Sub20_Sub1_3.method1881(local14);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 38 && Static3.method24(local10, local26, local14)) {
			Static106.aClass8_Sub20_Sub1_3.method1907(200);
			Static106.aClass8_Sub20_Sub1_3.method1884(Static23.anInt712);
			Static106.aClass8_Sub20_Sub1_3.method1843(Static2.anInt32);
			Static106.aClass8_Sub20_Sub1_3.method1843(local10 + Static64.anInt2062);
			Static106.aClass8_Sub20_Sub1_3.method1869(local14 + Static82.anInt1959);
			Static106.aClass8_Sub20_Sub1_3.method1884(local26 >> 14 & 0x7FFF);
			Static106.aClass8_Sub20_Sub1_3.method1876(Static120.anInt2878);
		}
		if (local18 == 36) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static132.anInt2817 = Static3.anInt51;
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static16.anInt393 = 2;
				Static106.aClass8_Sub20_Sub1_3.method1907(24);
				Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			}
		}
		if (local18 == 2) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static16.anInt393 = 2;
				Static132.anInt2817 = Static3.anInt51;
				Static81.anInt1954 = Static74.anInt1781;
				Static133.anInt3067 = 0;
				Static106.aClass8_Sub20_Sub1_3.method1907(153);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
				Static106.aClass8_Sub20_Sub1_3.method1873(Static2.anInt29);
				Static106.aClass8_Sub20_Sub1_3.method1884(Static125.anInt3001);
			}
		}
		if (local18 == 26) {
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local891.anIntArray262[0], local891.anIntArray260[0], 1, false);
				Static16.anInt393 = 2;
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(133);
				Static106.aClass8_Sub20_Sub1_3.method1881(Static125.anInt3001);
				Static106.aClass8_Sub20_Sub1_3.method1867(Static2.anInt29);
				Static106.aClass8_Sub20_Sub1_3.method1884(local26);
			}
		}
		if (local18 == 19) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static16.anInt393 = 2;
				Static133.anInt3067 = 0;
				Static132.anInt2817 = Static3.anInt51;
				Static81.anInt1954 = Static74.anInt1781;
				Static106.aClass8_Sub20_Sub1_3.method1907(161);
				Static106.aClass8_Sub20_Sub1_3.method1843(local26);
				Static106.aClass8_Sub20_Sub1_3.method1873(Static120.anInt2878);
				Static106.aClass8_Sub20_Sub1_3.method1869(Static2.anInt32);
				Static106.aClass8_Sub20_Sub1_3.method1881(Static23.anInt712);
			}
		}
		if (local18 == 42) {
			Static106.aClass8_Sub20_Sub1_3.method1907(151);
			Static106.aClass8_Sub20_Sub1_3.method1841(local10);
			Static106.aClass8_Sub20_Sub1_3.method1869(local14);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 8) {
			Static106.aClass8_Sub20_Sub1_3.method1907(70);
			Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			Static106.aClass8_Sub20_Sub1_3.method1867(local10);
			Static106.aClass8_Sub20_Sub1_3.method1843(local14);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 1) {
			Static106.aClass8_Sub20_Sub1_3.method1907(47);
			Static106.aClass8_Sub20_Sub1_3.method1884(local14);
			Static106.aClass8_Sub20_Sub1_3.method1841(local10);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 1001) {
			Static132.anInt2817 = Static3.anInt51;
			Static16.anInt393 = 2;
			Static133.anInt3067 = 0;
			Static81.anInt1954 = Static74.anInt1781;
			local891 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local26];
			if (local891 != null) {
				@Pc(2518) Class8_Sub1_Sub16 local2518 = local891.aClass8_Sub1_Sub16_1;
				if (local2518.anIntArray331 != null) {
					local2518 = local2518.method1503();
				}
				if (local2518 != null) {
					Static106.aClass8_Sub20_Sub1_3.method1907(168);
					Static106.aClass8_Sub20_Sub1_3.method1869(local2518.anInt2428);
				}
			}
		}
		if (local18 == 18) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static16.anInt393 = 2;
				Static81.anInt1954 = Static74.anInt1781;
				Static132.anInt2817 = Static3.anInt51;
				Static106.aClass8_Sub20_Sub1_3.method1907(202);
				Static106.aClass8_Sub20_Sub1_3.method1869(local26);
			}
		}
		if (local18 == 1007) {
			local362 = Static113.method1614(local10);
			if (local362 == null || local362.anIntArray410[local14] < 100000) {
				Static106.aClass8_Sub20_Sub1_3.method1907(95);
				Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			} else {
				Static108.method1530(Static44.method669(new Class34[] { Static44.method672(local362.anIntArray410[local14]), Static93.aClass34_1025, Static7.method49(local26).aClass34_812 }), Static36.aClass34_504, 0);
			}
			Static44.anInt1059 = 0;
			Static123.aClass8_Sub24_15 = Static113.method1614(local10);
			Static75.anInt1806 = local14;
		}
		if (local18 == 50) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static132.anInt2817 = Static3.anInt51;
				Static16.anInt393 = 2;
				Static106.aClass8_Sub20_Sub1_3.method1907(25);
				Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			}
		}
		if (local18 == 1002) {
			Static133.anInt3067 = 0;
			Static81.anInt1954 = Static74.anInt1781;
			Static16.anInt393 = 2;
			Static132.anInt2817 = Static3.anInt51;
			Static106.aClass8_Sub20_Sub1_3.method1907(194);
			Static106.aClass8_Sub20_Sub1_3.method1869(local26 >> 14 & 0x7FFF);
		}
		if (local18 == 33) {
			Static106.aClass8_Sub20_Sub1_3.method1907(158);
			Static106.aClass8_Sub20_Sub1_3.method1873(local10);
			local362 = Static113.method1614(local10);
			if (local362.anIntArrayArray29 != null && local362.anIntArrayArray29[0][0] == 5) {
				local717 = local362.anIntArrayArray29[0][1];
				if (Static78.anIntArray238[local717] != local362.anIntArray416[0]) {
					Static78.anIntArray238[local717] = local362.anIntArray416[0];
					Static15.method237(local717);
				}
			}
		}
		if (local18 == 58) {
			local33 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local26];
			if (local33 != null) {
				Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 1, local33.anIntArray262[0], local33.anIntArray260[0], 1, false);
				Static133.anInt3067 = 0;
				Static81.anInt1954 = Static74.anInt1781;
				Static16.anInt393 = 2;
				Static132.anInt2817 = Static3.anInt51;
				Static106.aClass8_Sub20_Sub1_3.method1907(187);
				Static106.aClass8_Sub20_Sub1_3.method1881(local26);
			}
		}
		if (Static88.anInt2340 != 0) {
			Static88.anInt2340 = 0;
			Static40.method608(Static113.method1614(Static120.anInt2878));
		}
		if (Static32.aBoolean41) {
			Static67.method1012();
		}
		if (Static123.aClass8_Sub24_15 != null && Static44.anInt1059 == 0) {
			Static40.method608(Static123.aClass8_Sub24_15);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!dd;)[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] method500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14 arg2) {
		return Static134.method2026(arg0, arg1, arg2) ? Static36.method570() : null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!wf;B)Lclient!ic;")
	public static Class34 method501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub24 arg1) {
		if (!Static120.method1900(Static99.method1445(arg1), arg0) && arg1.anObjectArray10 == null) {
			return null;
		} else if (arg1.aClass34Array25 == null || arg1.aClass34Array25.length <= arg0 || arg1.aClass34Array25[arg0] == null || arg1.aClass34Array25[arg0].method812().method820() == 0) {
			return Static33.aBoolean42 ? Static44.method669(new Class34[] { Static44.aClass34_562, Static44.method672(arg0) }) : null;
		} else {
			return arg1.aClass34Array25[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public static void method502(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static94.anInt2223; local7++) {
			@Pc(15) Class8_Sub1_Sub1_Sub4_Sub2 local15 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local7]];
			@Pc(24) int local24 = (Static50.anIntArray164[local7] << 14) + 536870912;
			if (local15 != null && local15.method1221() && arg0 == local15.aClass8_Sub1_Sub16_1.aBoolean94 && local15.aClass8_Sub1_Sub16_1.method1504()) {
				@Pc(55) int local55 = local15.anInt2043 >> 7;
				@Pc(60) int local60 = local15.anInt2059 >> 7;
				if (local55 >= 0 && local55 < 104 && local60 >= 0 && local60 < 104) {
					if (local15.anInt2030 == 1 && (local15.anInt2043 & 0x7F) == 64 && (local15.anInt2059 & 0x7F) == 64) {
						if (Static51.anIntArrayArray10[local55][local60] == Static48.anInt2953) {
							continue;
						}
						Static51.anIntArrayArray10[local55][local60] = Static48.anInt2953;
					}
					if (!local15.aClass8_Sub1_Sub16_1.aBoolean95) {
						local24 += Integer.MIN_VALUE;
					}
					Static3.aClass64_1.method1419(Static42.anInt1024, local15.anInt2043, local15.anInt2059, Static123.method1945(local15.anInt2059 + (local15.anInt2030 - 1) * 64, Static42.anInt1024, local15.anInt2043 + local15.anInt2030 * 64 - 64), (local15.anInt2030 - 1) * 64 + 60, local15, local15.anInt2038, local24, local15.aBoolean78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method503() {
		aClass34_390 = null;
		aClass8_Sub1_Sub3_Sub3Array14 = null;
		aClass34_389 = null;
		aClass34_386 = null;
		aClass34_388 = null;
		aClass34_392 = null;
		aClass34_393 = null;
		aClass34_387 = null;
		anIntArray104 = null;
		aClass34_391 = null;
	}
}
