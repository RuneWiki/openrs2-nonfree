import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Lclient!g;")
	public static Class26 aClass26_26;

	@OriginalMember(owner = "client!rb", name = "tb", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array15;

	@OriginalMember(owner = "client!rb", name = "Tb", descriptor = "Lclient!g;")
	public static Class26 aClass26_27;

	@OriginalMember(owner = "client!rb", name = "sc", descriptor = "Lclient!u;")
	private static Class74 aClass74_1462 = Static72.method1077("Continue");

	@OriginalMember(owner = "client!rb", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1455 = aClass74_1462;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lclient!ve;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_3 = null;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	public static int anInt2238 = 0;

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!rb", name = "Bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1456 = Static72.method1077("runes");

	@OriginalMember(owner = "client!rb", name = "Ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_1457 = Static72.method1077("Mitteilung");

	@OriginalMember(owner = "client!rb", name = "Rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1458 = Static72.method1077(")2");

	@OriginalMember(owner = "client!rb", name = "cc", descriptor = "[I")
	public static int[] anIntArray321 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!rb", name = "ic", descriptor = "Lclient!u;")
	private static Class74 aClass74_1459 = Static72.method1077("Select a world");

	@OriginalMember(owner = "client!rb", name = "nc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1460 = aClass74_1459;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lclient!u;")
	public static Class74 method1550(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static56.method940(arg0) : Static93.aClass74_1332;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] method1552() {
		@Pc(8) Class2_Sub2_Sub1_Sub2[] local8 = new Class2_Sub2_Sub1_Sub2[Static46.anInt1064];
		for (@Pc(10) int local10 = 0; local10 < Static46.anInt1064; local10++) {
			@Pc(20) Class2_Sub2_Sub1_Sub2 local20 = local8[local10] = new Class2_Sub2_Sub1_Sub2();
			local20.anInt288 = Static66.anInt1466;
			local20.anInt291 = Static41.anInt966;
			local20.anInt290 = Static51.anIntArray312[local10];
			local20.anInt286 = Static91.anIntArray265[local10];
			local20.anInt289 = Static71.anIntArray194[local10];
			local20.anInt287 = Static17.anIntArray54[local10];
			@Pc(50) byte[] local50 = Static24.aByteArrayArray3[local10];
			@Pc(56) int local56 = local20.anInt287 * local20.anInt289;
			local20.anIntArray31 = new int[local56];
			for (@Pc(62) int local62 = 0; local62 < local56; local62++) {
				local20.anIntArray31[local62] = Static57.anIntArray156[local50[local62] & 0xFF];
			}
		}
		Static37.method1354();
		return local8;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
	public static void method1557() {
		Static27.aClass16_27.method485();
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V")
	public static void method1559() {
		@Pc(7) Class74 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static112.anInt2421; local9++) {
			if (Static92.aClass74Array14[local9].method1722(Static55.aClass74_432) != -1) {
				local7 = Static92.aClass74Array14[local9].method1697(Static92.aClass74Array14[local9].method1722(Static55.aClass74_432));
				break;
			}
		}
		if (local7 == null) {
			Static52.method877();
			return;
		}
		@Pc(47) int local47 = Static10.anInt321;
		@Pc(49) int local49 = Static66.anInt1462;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(60) int local60 = Static9.anInt299;
		if (local60 > 190) {
			local60 = 190;
		}
		@Pc(67) int local67 = Static23.anInt642;
		Static58.method702(local49, local47, local60, local67, 6116423);
		Static58.method702(local49 + 1, local47 - -1, local60 - 2, 16, 0);
		Static58.method712(local49 + 1, local47 + 18, local60 - 2, local67 + -19, 0);
		Static54.aClass2_Sub2_Sub1_Sub3_7.method324(local7, local49 + 3, local47 + 14, 6116423, false);
		@Pc(112) int local112 = Static46.anInt1062;
		@Pc(114) int local114 = Static62.anInt1414;
		if (Static78.anInt1701 == 0) {
			local114 -= 4;
			local112 -= 4;
		}
		if (Static78.anInt1701 == 1) {
			local112 -= 553;
			local114 -= 205;
		}
		if (Static78.anInt1701 == 2) {
			local112 -= 17;
			local114 -= 357;
		}
		for (@Pc(135) int local135 = 0; local135 < Static112.anInt2421; local135++) {
			@Pc(139) int local139 = 16777215;
			@Pc(152) int local152 = (Static112.anInt2421 - local135 - 1) * 15 + local47 + 31;
			@Pc(156) Class74 local156 = Static92.aClass74Array14[local135];
			if (local156.method1724(local7)) {
				local156 = local156.method1706(0, local156.method1695() - local7.method1695());
				if (local156.method1724(Static48.aClass74_834)) {
					local156 = local156.method1706(0, local156.method1695() - Static48.aClass74_834.method1695());
				}
			}
			if (local49 < local112 && local49 + local60 > local112 && local114 > local152 - 13 && local152 + 3 > local114) {
				local139 = 16776960;
			}
			Static54.aClass2_Sub2_Sub1_Sub3_7.method324(local156, local49 + 3, local152, local139, true);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!bc;I)V")
	public static void method1561(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 <= 4225 || local11 >= 90000) {
			Static51.method1483(arg0, arg1, arg2);
			return;
		}
		@Pc(27) int local27 = Static18.anInt562 + Static5.anInt62 & 0x7FF;
		@Pc(31) int local31 = Class2_Sub2_Sub1_Sub4.anIntArray122[local27];
		@Pc(39) int local39 = local31 * 256 / (Static41.anInt968 + 256);
		@Pc(43) int local43 = Class2_Sub2_Sub1_Sub4.anIntArray119[local27];
		@Pc(51) int local51 = local43 * 256 / (Static41.anInt968 + 256);
		@Pc(61) int local61 = local51 * arg0 + arg2 * local39 >> 16;
		@Pc(71) int local71 = arg2 * local51 - local39 * arg0 >> 16;
		@Pc(77) double local77 = Math.atan2((double) local61, (double) local71);
		@Pc(83) int local83 = (int) (Math.sin(local77) * 63.0D);
		@Pc(89) int local89 = (int) (Math.cos(local77) * 57.0D);
		Static71.aClass2_Sub2_Sub1_Sub2_4.method221(local83 + 98 - 10, -local89 + 63, local77);
	}

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "(I)V")
	public static void method1565() {
		Static106.aLong83 = 0L;
		Static80.aBoolean72 = true;
		Static70.anInt1546 = 0;
		Static39.aClass43_1.anInt1448 = 0;
		Static21.aBoolean21 = true;
		Static19.method416();
		Static109.aBoolean103 = false;
		Static54.anInt1332 = 0;
		Static21.anInt619 = 0;
		Static30.anInt720 = 0;
		Static81.anInt1790 = -1;
		Static52.anInt1251 = 0;
		Static112.anInt2421 = 0;
		Static128.aClass2_Sub10_Sub1_3.anInt2187 = 0;
		Static97.anInt2894 = -1;
		Static5.anInt61 = -1;
		Static35.anInt2888 = -1;
		Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
		Static95.method1447(0);
		for (@Pc(1967) int local1967 = 0; local1967 < 100; local1967++) {
			Static106.aClass74Array17[local1967] = null;
		}
		Static29.anInt686 = 0;
		Static53.anInt1291 = 0;
		Static109.anInt2398 = 0;
		Static41.anInt968 = (int) (Math.random() * 30.0D) - 20;
		Static48.anInt1157 = 0;
		Static10.anInt320 = 0;
		Static99.anInt2136 = -1;
		Static5.anInt63 = (int) (Math.random() * 100.0D) - 50;
		Static18.anInt562 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static40.anInt960 = 0;
		Static6.aBoolean7 = false;
		Static5.anInt62 = (int) (Math.random() * 120.0D) - 60;
		Static39.anInt948 = (int) (Math.random() * 110.0D) - 55;
		Static71.anInt1556 = 0;
		Static40.anInt957 = (int) (Math.random() * 80.0D) - 40;
		for (@Pc(2048) int local2048 = 0; local2048 < 2048; local2048++) {
			Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local2048] = null;
			Static64.aClass2_Sub10Array1[local2048] = null;
		}
		for (@Pc(2064) int local2064 = 0; local2064 < 32768; local2064++) {
			Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local2064] = null;
		}
		Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[2047] = new Class2_Sub2_Sub2_Sub1_Sub2();
		Static5.aClass13_4.method421();
		Static113.aClass13_58.method421();
		@Pc(2096) int local2096;
		@Pc(2100) int local2100;
		for (@Pc(2092) int local2092 = 0; local2092 < 4; local2092++) {
			for (local2096 = 0; local2096 < 104; local2096++) {
				for (local2100 = 0; local2100 < 104; local2100++) {
					Static41.aClass13ArrayArrayArray1[local2092][local2096][local2100] = null;
				}
			}
		}
		Static104.aClass13_66 = new Class13();
		Static54.anInt1325 = 0;
		Static65.anInt1450 = 0;
		for (local2096 = 0; local2096 < Static52.anInt1261; local2096++) {
			@Pc(2142) Class2_Sub2_Sub8 local2142 = Static36.method619(local2096);
			if (local2142 != null && local2142.anInt1052 == 0) {
				Static45.anIntArray125[local2096] = 0;
				Static88.anIntArray260[local2096] = 0;
			}
		}
		for (local2100 = 0; local2100 < Static65.anIntArray178.length; local2100++) {
			Static65.anIntArray178[local2100] = -1;
		}
		for (@Pc(2177) int local2177 = 0; local2177 < Static16.anIntArray49.length; local2177++) {
			if (Static16.anIntArray49[local2177] != -1) {
				Static126.method1922(Static16.anIntArray49[local2177]);
				Static16.anIntArray49[local2177] = -1;
			}
		}
		Static126.method1922(Static83.anInt1804);
		Static83.anInt1804 = -1;
		Static126.method1922(Static42.anInt982);
		Static42.anInt982 = -1;
		Static126.method1922(Static90.anInt1905);
		Static90.anInt1905 = -1;
		Static126.method1922(Static14.anInt401);
		Static14.anInt401 = -1;
		Static126.method1922(Static98.anInt2115);
		Static98.anInt2115 = -1;
		Static126.method1922(Static66.anInt1458);
		Static66.anInt1458 = -1;
		Static126.method1922(Static79.anInt1754);
		Static109.aBoolean103 = false;
		Static16.aClass74_411 = null;
		Static88.anInt1857 = -1;
		Static46.anInt1049 = -1;
		Static42.anInt980 = 3;
		Static36.anInt869 = 0;
		Static29.aBoolean25 = false;
		Static119.anInt2548 = 0;
		Static79.anInt1754 = -1;
		Static109.aClass14_1.method438(-1, false, new int[5], null);
		for (@Pc(2264) int local2264 = 0; local2264 < 5; local2264++) {
			Static63.aClass74Array9[local2264] = null;
			Static62.aBooleanArray2[local2264] = false;
		}
		Static87.method927();
		Static105.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "(I)V")
	public static void method1567() {
		aClass74_1457 = null;
		aClass74_1460 = null;
		aClass26_27 = null;
		aClass74_1455 = null;
		aClass74Array15 = null;
		anIntArray321 = null;
		aClass74_1459 = null;
		aClass74_1456 = null;
		aClass74_1462 = null;
		aClass26_26 = null;
		aClass2_Sub2_Sub17_3 = null;
		aClass74_1458 = null;
	}
}
