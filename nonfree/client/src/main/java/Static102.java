import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!te", name = "tc", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_97;

	@OriginalMember(owner = "client!te", name = "yc", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!te", name = "Bd", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!te", name = "Fd", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!te", name = "Gd", descriptor = "Lclient!sd;")
	public static Class2 aClass2_21;

	@OriginalMember(owner = "client!te", name = "Hd", descriptor = "Lclient!sd;")
	public static Class2 aClass2_22;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!bd;")
	public static Class9 aClass9_25 = new Class9(64);

	@OriginalMember(owner = "client!te", name = "Zb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1184 = Static56.method972("Accept challenge");

	@OriginalMember(owner = "client!te", name = "X", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1181 = aClass5_1184;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "[I")
	public static int[] anIntArray302 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!te", name = "Gb", descriptor = "I")
	public static int anInt2610 = 0;

	@OriginalMember(owner = "client!te", name = "Fc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1189 = Static56.method972("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!te", name = "Gc", descriptor = "I")
	public static int anInt2639 = -1;

	@OriginalMember(owner = "client!te", name = "Cd", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1190 = Static56.method972(" )2> @whi@");

	@OriginalMember(owner = "client!te", name = "Dd", descriptor = "[I")
	public static int[] anIntArray311 = new int[1000];

	@OriginalMember(owner = "client!te", name = "Ed", descriptor = "[I")
	public static int[] anIntArray312 = new int[4000];

	@OriginalMember(owner = "client!te", name = "Id", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!te", name = "Jd", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1191 = Static56.method972("(U3");

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	public static void method1720() {
		Static55.method953();
		@Pc(23) int local23;
		@Pc(27) int local27;
		if (Static53.anInt1403 == 2) {
			@Pc(20) byte[] local20 = Static79.aClass3_Sub1_Sub2_Sub4_8.aByteArray24;
			local23 = local20.length;
			@Pc(25) int[] local25 = Static66.anIntArray363;
			for (local27 = 0; local27 < local23; local27++) {
				if (local20[local27] == 0) {
					local25[local27] = 0;
				}
			}
			Static10.aClass3_Sub1_Sub2_Sub3_7.method1455(0, 0, 33, 33, 25, 25, Static51.anInt2380, 256, Static50.anIntArray161, anIntArray310);
			Static110.method1916();
			return;
		}
		@Pc(69) int local69 = Static51.anInt2380 + Static78.anInt1951 & 0x7FF;
		local23 = 464 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
		@Pc(84) int local84 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32 + 48;
		Static40.aClass3_Sub1_Sub2_Sub3_3.method1455(25, 5, 146, 151, local84, local23, local69, Static69.anInt1824 + 256, Static22.anIntArray91, Static48.anIntArray153);
		for (local27 = 0; local27 < Static82.anInt2015; local27++) {
			local84 = Static50.anIntArray158[local27] * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
			local23 = anIntArray311[local27] * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
			Static57.method1003(local23, Static47.aClass3_Sub1_Sub2_Sub3Array7[local27], local84);
		}
		@Pc(147) int local147;
		for (@Pc(143) int local143 = 0; local143 < 104; local143++) {
			for (local147 = 0; local147 < 104; local147++) {
				@Pc(157) Class51 local157 = Static24.aClass51ArrayArrayArray1[Static12.anInt480][local143][local147];
				if (local157 != null) {
					local84 = local143 * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
					local23 = local147 * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
					Static57.method1003(local23, Static101.aClass3_Sub1_Sub2_Sub3Array12[0], local84);
				}
			}
		}
		for (local147 = 0; local147 < Static115.anInt2977; local147++) {
			@Pc(208) Class3_Sub1_Sub1_Sub1_Sub1 local208 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static36.anIntArray320[local147]];
			if (local208 != null && local208.method993()) {
				@Pc(217) Class3_Sub1_Sub13 local217 = local208.aClass3_Sub1_Sub13_1;
				if (local217.anIntArray251 != null) {
					local217 = local217.method1480();
				}
				if (local217 != null && local217.aBoolean107 && local217.aBoolean106) {
					local84 = local208.anInt1567 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
					local23 = local208.anInt1543 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
					Static57.method1003(local23, Static101.aClass3_Sub1_Sub2_Sub3Array12[1], local84);
				}
			}
		}
		@Pc(275) Class3_Sub1_Sub1_Sub1_Sub2 local275;
		for (@Pc(267) int local267 = 0; local267 < Static38.anInt1056; local267++) {
			local275 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local267]];
			if (local275 != null && local275.method993()) {
				local84 = local275.anInt1567 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
				local23 = local275.anInt1543 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
				@Pc(303) boolean local303 = false;
				@Pc(308) long local308 = local275.aClass5_765.method146();
				for (@Pc(310) int local310 = 0; local310 < Static5.anInt346; local310++) {
					if (Static94.aLongArray2[local310] == local308 && Static57.anIntArray183[local310] != 0) {
						local303 = true;
						break;
					}
				}
				@Pc(336) boolean local336 = false;
				if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1602 != 0 && local275.anInt1602 != 0 && Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1602 == local275.anInt1602) {
					local336 = true;
				}
				if (local303) {
					Static57.method1003(local23, Static101.aClass3_Sub1_Sub2_Sub3Array12[3], local84);
				} else if (local336) {
					Static57.method1003(local23, Static101.aClass3_Sub1_Sub2_Sub3Array12[4], local84);
				} else {
					Static57.method1003(local23, Static101.aClass3_Sub1_Sub2_Sub3Array12[2], local84);
				}
			}
		}
		if (Static64.anInt1692 != 0 && Static3.anInt289 % 20 < 10) {
			if (Static64.anInt1692 == 1 && Static46.anInt1283 >= 0 && Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1.length > Static46.anInt1283) {
				@Pc(424) Class3_Sub1_Sub1_Sub1_Sub1 local424 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[Static46.anInt1283];
				if (local424 != null) {
					local23 = local424.anInt1543 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
					local84 = local424.anInt1567 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
					Static34.method671(Static54.aClass3_Sub1_Sub2_Sub3Array9[1], local84, local23);
				}
			}
			if (Static64.anInt1692 == 2) {
				local23 = (Static35.anInt1011 - Static52.anInt1378) * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
				local84 = (Static4.anInt316 - Static109.anInt2875) * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
				Static34.method671(Static54.aClass3_Sub1_Sub2_Sub3Array9[1], local84, local23);
			}
			if (Static64.anInt1692 == 10 && Static51.anInt2382 >= 0 && Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1.length > Static51.anInt2382) {
				local275 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static51.anInt2382];
				if (local275 != null) {
					local84 = local275.anInt1567 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
					local23 = local275.anInt1543 / 32 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
					Static34.method671(Static54.aClass3_Sub1_Sub2_Sub3Array9[1], local84, local23);
				}
			}
		}
		if (Static46.anInt1284 != 0) {
			local84 = Static46.anInt1284 * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 / 32;
			local23 = Static78.anInt1956 * 4 + 2 - Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 / 32;
			Static57.method1003(local23, Static54.aClass3_Sub1_Sub2_Sub3Array9[0], local84);
		}
		Static66.method1839(97, 78, 3, 3, 16777215);
		Static10.aClass3_Sub1_Sub2_Sub3_7.method1455(0, 0, 33, 33, 25, 25, Static51.anInt2380, 256, Static50.anIntArray161, anIntArray310);
		Static110.method1916();
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
	public static void method1722() {
		for (@Pc(11) int local11 = 0; local11 < Static83.anInt2051; local11++) {
			@Pc(17) int local17 = Static78.anIntArray224[local11];
			@Pc(21) Class3_Sub1_Sub1_Sub1_Sub1 local21 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local17];
			@Pc(25) int local25 = Static75.aClass3_Sub6_Sub1_2.method1587();
			if ((local25 & 0x2) != 0) {
				local21.anInt1578 = Static75.aClass3_Sub6_Sub1_2.method1603();
				local21.anInt1565 = Static75.aClass3_Sub6_Sub1_2.method1604();
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			if ((local25 & 0x20) != 0) {
				local52 = Static75.aClass3_Sub6_Sub1_2.method1636();
				local56 = Static75.aClass3_Sub6_Sub1_2.method1591();
				if (local52 == 65535) {
					local52 = -1;
				}
				if (local21.anInt1536 == local52 && local52 != -1) {
					@Pc(76) int local76 = Static31.method778(local52).anInt1924;
					if (local76 == 1) {
						local21.anInt1557 = 0;
						local21.anInt1570 = local56;
						local21.anInt1532 = 0;
						local21.anInt1573 = 0;
					}
					if (local76 == 2) {
						local21.anInt1557 = 0;
					}
				} else if (local52 == -1 || local21.anInt1536 == -1 || Static31.method778(local52).anInt1918 >= Static31.method778(local21.anInt1536).anInt1918) {
					local21.anInt1570 = local56;
					local21.anInt1573 = 0;
					local21.anInt1557 = 0;
					local21.anInt1519 = local21.anInt1574;
					local21.anInt1532 = 0;
					local21.anInt1536 = local52;
				}
			}
			if ((local25 & 0x40) != 0) {
				local52 = Static75.aClass3_Sub6_Sub1_2.method1591();
				local56 = Static75.aClass3_Sub6_Sub1_2.method1591();
				local21.method996(Static3.anInt289, local52, local56);
				local21.anInt1518 = Static3.anInt289 + 300;
				local21.anInt1580 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local21.anInt1537 = Static75.aClass3_Sub6_Sub1_2.method1618();
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt1538 = Static75.aClass3_Sub6_Sub1_2.method1636();
				local52 = Static75.aClass3_Sub6_Sub1_2.method1615();
				local21.anInt1555 = local52 >> 16;
				local21.anInt1545 = 0;
				if (local21.anInt1538 == 65535) {
					local21.anInt1538 = -1;
				}
				local21.anInt1569 = 0;
				local21.anInt1540 = (local52 & 0xFFFF) + Static3.anInt289;
				if (Static3.anInt289 < local21.anInt1540) {
					local21.anInt1545 = -1;
				}
			}
			if ((local25 & 0x10) != 0) {
				local21.anInt1525 = Static75.aClass3_Sub6_Sub1_2.method1604();
				if (local21.anInt1525 == 65535) {
					local21.anInt1525 = -1;
				}
			}
			if ((local25 & 0x80) != 0) {
				local52 = Static75.aClass3_Sub6_Sub1_2.method1607();
				local56 = Static75.aClass3_Sub6_Sub1_2.method1607();
				local21.method996(Static3.anInt289, local52, local56);
				local21.anInt1518 = Static3.anInt289 + 300;
				local21.anInt1580 = Static75.aClass3_Sub6_Sub1_2.method1587();
				local21.anInt1537 = Static75.aClass3_Sub6_Sub1_2.method1607();
			}
			if ((local25 & 0x1) != 0) {
				local21.aClass3_Sub1_Sub13_1 = Static115.method1958(Static75.aClass3_Sub6_Sub1_2.method1604());
				local21.anInt1579 = local21.aClass3_Sub1_Sub13_1.anInt2221;
				local21.anInt1549 = local21.aClass3_Sub1_Sub13_1.anInt2213;
				local21.anInt1550 = local21.aClass3_Sub1_Sub13_1.anInt2216;
				local21.anInt1531 = local21.aClass3_Sub1_Sub13_1.anInt2196;
				local21.anInt1529 = local21.aClass3_Sub1_Sub13_1.anInt2215;
				local21.anInt1530 = local21.aClass3_Sub1_Sub13_1.anInt2209;
				local21.anInt1516 = local21.aClass3_Sub1_Sub13_1.anInt2218;
				local21.anInt1521 = local21.aClass3_Sub1_Sub13_1.anInt2201;
				local21.anInt1562 = local21.aClass3_Sub1_Sub13_1.anInt2203;
			}
			if ((local25 & 0x8) != 0) {
				local21.aClass5_758 = Static75.aClass3_Sub6_Sub1_2.method1627();
				local21.anInt1522 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] method1723() {
		@Pc(4) Class3_Sub1_Sub2_Sub3[] local4 = new Class3_Sub1_Sub2_Sub3[Static18.anInt630];
		for (@Pc(6) int local6 = 0; local6 < Static18.anInt630; local6++) {
			@Pc(21) Class3_Sub1_Sub2_Sub3 local21 = local4[local6] = new Class3_Sub1_Sub2_Sub3();
			local21.anInt2170 = Static14.anInt2882;
			local21.anInt2171 = Static80.anInt1994;
			local21.anInt2168 = Static50.anIntArray157[local6];
			local21.anInt2167 = Static63.anIntArray375[local6];
			local21.anInt2172 = Static56.anIntArray170[local6];
			local21.anInt2169 = Static116.anIntArray382[local6];
			@Pc(53) int local53 = local21.anInt2169 * local21.anInt2172;
			@Pc(57) byte[] local57 = Static38.aByteArrayArray6[local6];
			local21.anIntArray237 = new int[local53];
			for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
				local21.anIntArray237[local63] = Static89.anIntArray256[local57[local63] & 0xFF];
			}
		}
		Static21.method436();
		return local4;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	public static void method1724() {
		aClass2_22 = null;
		aClass11_Sub1_97 = null;
		anIntArray310 = null;
		anIntArray303 = null;
		aClass5_1189 = null;
		anIntArray311 = null;
		aClass5_1191 = null;
		anIntArray302 = null;
		aClass5_1190 = null;
		aClass2_21 = null;
		aClass9_25 = null;
		aClass5_1184 = null;
		anIntArray312 = null;
		aClass5_1181 = null;
		aClass3_Sub1_Sub2_Sub3_6 = null;
	}
}
