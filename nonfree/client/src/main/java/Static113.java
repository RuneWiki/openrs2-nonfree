import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_68;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1551 = Static33.method650("scrollbar");

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1552 = Static33.method650("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1562 = Static33.method650("Members object");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1553 = aClass56_1562;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1554 = Static33.method650("Existing User");

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1555 = Static33.method650("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1556 = aClass56_1554;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1557 = Static33.method650("Registrierter Benutzer");

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
	public static int[] anIntArray287 = new int[25];

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1558 = Static33.method650("white:");

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public static int anInt2871 = 1;

	@OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
	public static int[] anIntArray288 = new int[50];

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1559 = aClass56_1558;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1560 = aClass56_1558;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1561 = Static33.method650("(X");

	@OriginalMember(owner = "client!u", name = "J", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array15 = new Class56[200];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)V")
	public static void method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class3_Sub1_Sub13 local11 = Static83.method1508(arg1);
		@Pc(14) int local14 = local11.anInt2462;
		@Pc(17) int local17 = local11.anInt2466;
		@Pc(20) int local20 = local11.anInt2468;
		@Pc(27) int local27 = client.anIntArray33[local17 - local20];
		if (arg0 < 0 || arg0 > local27) {
			arg0 = 0;
		}
		local27 <<= local20;
		Static115.anIntArray292[local14] = arg0 << local20 & local27 | ~local27 & Static115.anIntArray292[local14];
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method1864() {
		Static28.aClass52_17.method1346();
		Static15.aClass52_7.method1346();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1865() {
		Static17.aClass36_1.anInt1503 = 0;
		Static82.aBoolean101 = true;
		Static98.aBoolean119 = true;
		Static75.aLong55 = 0L;
		Static104.anInt2594 = 0;
		Static127.method2045();
		Static43.anInt1142 = -1;
		Static8.anInt210 = 0;
		Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
		Static61.anInt1799 = 0;
		Static86.anInt2355 = 0;
		Static106.anInt2633 = 0;
		Static99.anInt895 = -1;
		Static31.aClass3_Sub2_Sub1_3.anInt413 = 0;
		Static122.aBoolean163 = false;
		Static48.anInt1395 = -1;
		Static66.anInt559 = 0;
		Static122.anInt3002 = -1;
		Static18.method350(0);
		for (@Pc(1965) int local1965 = 0; local1965 < 100; local1965++) {
			Static119.aClass56Array19[local1965] = null;
		}
		Static119.anInt2986 = 0;
		Static103.anInt2583 = (int) (Math.random() * 100.0D) - 50;
		Static93.aBoolean114 = false;
		Static98.anInt2560 = 0;
		Static92.anInt2425 = (int) (Math.random() * 80.0D) - 40;
		Static15.anInt434 = (int) (Math.random() * 110.0D) - 55;
		Static110.anInt2767 = 0;
		Static62.anInt1804 = (int) (Math.random() * 30.0D) - 20;
		Static109.anInt1678 = 0;
		Static18.anInt493 = (int) (Math.random() * 120.0D) - 60;
		Static38.anInt1028 = 0;
		Static106.anInt2625 = 0;
		Static75.anInt2022 = 0;
		Static22.anInt686 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static93.anInt2441 = -1;
		for (@Pc(2045) int local2045 = 0; local2045 < 2048; local2045++) {
			Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local2045] = null;
			Static94.aClass3_Sub2Array1[local2045] = null;
		}
		for (@Pc(2061) int local2061 = 0; local2061 < 32768; local2061++) {
			Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local2061] = null;
		}
		Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[2047] = new Class3_Sub1_Sub2_Sub4_Sub1();
		Static21.aClass37_4.method996();
		Static82.aClass37_10.method996();
		@Pc(2093) int local2093;
		@Pc(2097) int local2097;
		for (@Pc(2089) int local2089 = 0; local2089 < 4; local2089++) {
			for (local2093 = 0; local2093 < 104; local2093++) {
				for (local2097 = 0; local2097 < 104; local2097++) {
					Static8.aClass37ArrayArrayArray1[local2089][local2093][local2097] = null;
				}
			}
		}
		Static67.aClass37_11 = new Class37();
		Static24.anInt707 = 0;
		Static42.anInt1124 = 0;
		for (local2093 = 0; local2093 < Static106.anInt2626; local2093++) {
			@Pc(2139) Class3_Sub1_Sub6 local2139 = Static119.method1924(local2093);
			if (local2139 != null && local2139.anInt1123 == 0) {
				Static87.anIntArray199[local2093] = 0;
				Static115.anIntArray292[local2093] = 0;
			}
		}
		for (local2097 = 0; local2097 < Static119.anIntArray309.length; local2097++) {
			Static119.anIntArray309[local2097] = -1;
		}
		for (@Pc(2182) int local2182 = 0; local2182 < Static44.anIntArray79.length; local2182++) {
			if (Static44.anIntArray79[local2182] != -1) {
				Static25.method532(Static44.anIntArray79[local2182]);
				Static44.anIntArray79[local2182] = -1;
			}
		}
		Static25.method532(Static69.anInt1918);
		Static69.anInt1918 = -1;
		Static25.method532(Static57.anInt1609);
		Static57.anInt1609 = -1;
		Static25.method532(Static57.anInt1607);
		Static57.anInt1607 = -1;
		Static25.method532(Static63.anInt1818);
		Static63.anInt1818 = -1;
		Static25.method532(Static88.anInt2370);
		Static88.anInt2370 = -1;
		Static25.method532(Static111.anInt2804);
		Static111.anInt2804 = -1;
		Static25.method532(Static109.anInt1693);
		Static27.anInt798 = 3;
		Static34.aClass56_531 = null;
		Static102.anInt3225 = 0;
		Static105.aBoolean121 = false;
		Static79.anInt2107 = -1;
		Static126.anInt3105 = 0;
		Static122.aBoolean163 = false;
		Static34.anInt966 = -1;
		Static109.anInt1693 = -1;
		Static76.aClass42_2.method1077(null, new int[5], -1, false);
		for (@Pc(2264) int local2264 = 0; local2264 < 5; local2264++) {
			Static108.aClass56Array11[local2264] = null;
			Static118.aBooleanArray14[local2264] = false;
		}
		Static118.method1920();
		Static40.aBoolean52 = true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!tb;Lclient!tb;)I")
	public static int method1866(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1141(Static66.aClass56_266, Static11.aClass56_172)) {
			local5++;
		}
		if (arg1.method1141(Static66.aClass56_266, Static80.aClass56_1158)) {
			local5++;
		}
		if (arg1.method1141(Static66.aClass56_266, Static40.aClass56_616)) {
			local5++;
		}
		if (arg1.method1141(Static66.aClass56_266, Static42.aClass56_676)) {
			local5++;
		}
		if (arg1.method1141(Static66.aClass56_266, Static23.aClass56_344)) {
			local5++;
		}
		if (arg1.method1141(Static66.aClass56_266, Static105.aClass56_1434)) {
			local5++;
		}
		arg1.method1141(Static66.aClass56_266, Static12.aClass56_175);
		arg1.method1141(Static66.aClass56_266, Static21.aClass56_297);
		arg1.method1141(Static66.aClass56_266, Static127.aClass56_1733);
		arg1.method1141(Static66.aClass56_266, Static115.aClass56_1592);
		arg1.method1141(Static66.aClass56_266, Static114.aClass56_1567);
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	public static boolean method1867(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method1868() {
		if (Static31.anInt920 != 0 || Static13.aClass3_Sub1_Sub16_1 != null) {
			return;
		}
		@Pc(20) int local20 = Static36.anInt1014;
		if (Static93.aBoolean114 && Static127.anInt3209 >= 516 && Static71.anInt1970 >= 160 && Static127.anInt3209 <= 765 && Static71.anInt1970 <= 205) {
			local20 = 0;
		}
		@Pc(55) int local55;
		@Pc(115) int local115;
		@Pc(121) int local121;
		if (!Static122.aBoolean163) {
			if (local20 == 1 && Static66.anInt559 > 0) {
				local55 = Static9.anIntArray9[Static66.anInt559 - 1];
				if (local55 == 44 || local55 == 45 || local55 == 6 || local55 == 23 || local55 == 53 || local55 == 12 || local55 == 29 || local55 == 36 || local55 == 16 || local55 == 14 || local55 == 46 || local55 == 1003) {
					local115 = Static117.anIntArray303[Static66.anInt559 - 1];
					local121 = Static93.anIntArray219[Static66.anInt559 - 1];
					@Pc(125) Class3_Sub1_Sub16 local125 = Static96.method1688(local121);
					if (Static84.method1527(Static34.method652(local125)) || Static97.method1705(Static34.method652(local125))) {
						Static2.aBoolean3 = false;
						Static100.anInt2570 = local121;
						Static17.anInt473 = 0;
						Static31.anInt920 = 2;
						Static94.anInt2471 = Static71.anInt1970;
						if (Static57.anInt1607 == local121 >> 16) {
							Static31.anInt920 = 1;
						}
						Static97.anInt2548 = Static127.anInt3209;
						Static110.anInt2762 = local115;
						if (local121 >> 16 == Static57.anInt1609) {
							Static31.anInt920 = 3;
						}
						return;
					}
				}
			}
			if (local20 == 1 && (Static92.anInt2426 == 1 || Static81.method1452(Static66.anInt559 - 1)) && Static66.anInt559 > 2) {
				local20 = 2;
			}
			if (local20 == 1 && Static66.anInt559 > 0) {
				Static18.method354(Static66.anInt559 - 1);
			}
			if (local20 == 2 && Static66.anInt559 > 0) {
				Static25.method534();
			}
			return;
		}
		if (local20 != 1) {
			local115 = Static102.anInt3222;
			local55 = Static36.anInt1021;
			if (Static42.anInt1117 == 0) {
				local55 -= 4;
				local115 -= 4;
			}
			if (Static42.anInt1117 == 1) {
				local55 -= 553;
				local115 -= 205;
			}
			if (Static42.anInt1117 == 2) {
				local55 -= 17;
				local115 -= 357;
			}
			if (Static115.anInt2940 - 10 > local55 || local55 > Static115.anInt2940 + Static14.anInt319 + 10 || local115 < Static23.anInt690 - 10 || local115 > Static57.anInt1610 + Static23.anInt690 + 10) {
				if (Static42.anInt1117 == 2) {
					Static12.aBoolean17 = true;
				}
				Static122.aBoolean163 = false;
				if (Static42.anInt1117 == 1) {
					Static115.aBoolean157 = true;
				}
			}
		}
		if (local20 != 1) {
			return;
		}
		local55 = Static115.anInt2940;
		local121 = Static14.anInt319;
		local115 = Static23.anInt690;
		@Pc(296) int local296 = Static71.anInt1970;
		@Pc(298) int local298 = Static127.anInt3209;
		if (Static42.anInt1117 == 0) {
			local296 -= 4;
			local298 -= 4;
		}
		if (Static42.anInt1117 == 1) {
			local298 -= 553;
			local296 -= 205;
		}
		if (Static42.anInt1117 == 2) {
			local298 -= 17;
			local296 -= 357;
		}
		@Pc(316) int local316 = -1;
		for (@Pc(318) int local318 = 0; local318 < Static66.anInt559; local318++) {
			@Pc(333) int local333 = local115 + (-local318 + Static66.anInt559 - 1) * 15 + 31;
			if (local55 < local298 && local121 + local55 > local298 && local296 > local333 - 13 && local296 < local333 + 3) {
				local316 = local318;
			}
		}
		if (local316 != -1) {
			Static18.method354(local316);
		}
		Static122.aBoolean163 = false;
		if (Static42.anInt1117 == 2) {
			Static12.aBoolean17 = true;
		}
		if (Static42.anInt1117 == 1) {
			Static115.aBoolean157 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!oa;")
	public static Class56 method1869(@OriginalArg(0) int arg0) {
		@Pc(16) Class56 local16 = Static111.method1851(arg0);
		for (@Pc(22) int local22 = local16.method1426() - 3; local22 > 0; local22 -= 3) {
			local16 = Static84.method1524(new Class56[] { local16.method1451(local22, 0), Static67.aClass56_1223, local16.method1417(local22) });
		}
		if (local16.method1426() > 8) {
			local16 = Static84.method1524(new Class56[] { Static50.aClass56_803, local16.method1451(local16.method1426() - 8, 0), Static110.aClass56_1511, Static34.aClass56_532, local16, Static79.aClass56_1135 });
		} else if (local16.method1426() > 4) {
			local16 = Static84.method1524(new Class56[] { Static88.aClass56_1257, local16.method1451(local16.method1426() - 4, 0), Static40.aClass56_621, Static34.aClass56_532, local16, Static79.aClass56_1135 });
		}
		return Static84.method1524(new Class56[] { Static31.aClass56_507, local16 });
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method1870() {
		aClass56_1555 = null;
		aClass56_1554 = null;
		aClass56_1560 = null;
		aClass56_1553 = null;
		anIntArray287 = null;
		aClass56_1558 = null;
		aClass56_1552 = null;
		aClass56_1556 = null;
		aClass56_1561 = null;
		anIntArray288 = null;
		aClass3_Sub1_Sub1_Sub4_68 = null;
		aClass56_1562 = null;
		aClass56Array15 = null;
		aClass56_1551 = null;
		aClass56_1557 = null;
		aClass56_1559 = null;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BZZ)I")
	public static int method1871() {
		return Static50.anInt1438 + Static19.anInt591;
	}
}
