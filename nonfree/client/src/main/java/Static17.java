import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ce", name = "ab", descriptor = "[S")
	public static short[] aShortArray12;

	@OriginalMember(owner = "client!ce", name = "nb", descriptor = "Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4 aClass5_Sub2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[B")
	public static byte[] aByteArray15 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ce", name = "hb", descriptor = "Lclient!r;")
	private static Class61 aClass61_171 = Static129.method2060("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "Lclient!r;")
	public static Class61 aClass61_165 = aClass61_171;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Lclient!r;")
	private static Class61 aClass61_166 = Static129.method2060(":chalreq:");

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!r;")
	public static Class61 aClass61_167 = Static129.method2060("Angreifen");

	@OriginalMember(owner = "client!ce", name = "W", descriptor = "Lclient!r;")
	public static Class61 aClass61_168 = Static129.method2060("mn");

	@OriginalMember(owner = "client!ce", name = "mb", descriptor = "Lclient!r;")
	private static Class61 aClass61_174 = Static129.method2060("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ce", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_169 = aClass61_174;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
	public static int anInt525 = 0;

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "Lclient!r;")
	public static Class61 aClass61_170 = Static129.method2060(" <col=00ff80>");

	@OriginalMember(owner = "client!ce", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_172 = Static129.method2060("Passwort: ");

	@OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lclient!r;")
	public static Class61 aClass61_173 = Static129.method2060("<col=ffffff>");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBIII)V")
	private static void method394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class5_Sub15 local17 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg2);
		if (local17 == null) {
			local17 = new Class5_Sub15();
			Static57.aClass20_6.method647(local17, (long) arg2);
		}
		if (arg1 >= local17.anIntArray296.length) {
			@Pc(43) int[] local43 = new int[arg1 + 1];
			@Pc(48) int[] local48 = new int[arg1 + 1];
			for (@Pc(50) int local50 = 0; local50 < local17.anIntArray296.length; local50++) {
				local43[local50] = local17.anIntArray296[local50];
				local48[local50] = local17.anIntArray297[local50];
			}
			for (@Pc(80) int local80 = local17.anIntArray296.length; local80 < arg1; local80++) {
				local43[local80] = -1;
				local48[local80] = 0;
			}
			local17.anIntArray296 = local43;
			local17.anIntArray297 = local48;
		}
		local17.anIntArray296[arg1] = arg0;
		local17.anIntArray297[arg1] = arg3;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	public static void method395() {
		aClass61_165 = null;
		aClass61_171 = null;
		aClass61_169 = null;
		aClass61_173 = null;
		aShortArray12 = null;
		aClass5_Sub2_Sub1_Sub4_1 = null;
		aClass61_167 = null;
		aClass61_172 = null;
		aClass61_168 = null;
		aByteArray15 = null;
		aClass61_166 = null;
		aClass61_170 = null;
		aClass61_174 = null;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Z")
	public static boolean method396() {
		if (Static108.aClass30_2 == null) {
			return false;
		}
		@Pc(163) int local163;
		try {
			@Pc(13) int local13 = Static108.aClass30_2.method777();
			if (local13 == 0) {
				return false;
			}
			if (Static73.anInt1747 == -1) {
				local13--;
				Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, 1);
				Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
				Static73.anInt1747 = Static47.aClass5_Sub14_Sub1_2.method1491();
				Static80.anInt2057 = Static34.anIntArray159[Static73.anInt1747];
			}
			if (Static80.anInt2057 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, 1);
				Static80.anInt2057 = Static47.aClass5_Sub14_Sub1_2.aByteArray33[0] & 0xFF;
			}
			if (Static80.anInt2057 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, 2);
				Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
				Static80.anInt2057 = Static47.aClass5_Sub14_Sub1_2.method1478();
			}
			if (Static80.anInt2057 > local13) {
				return false;
			}
			Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
			Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, Static80.anInt2057);
			Static30.anInt918 = Static126.anInt3161;
			Static10.anInt232 = 0;
			Static126.anInt3161 = Static88.anInt3389;
			Static88.anInt3389 = Static73.anInt1747;
			if (Static73.anInt1747 == 97) {
				Static54.method987(Static47.aClass5_Sub14_Sub1_2);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 143) {
				Static133.method2193(false);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 217) {
				Static20.method457();
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(167) int local167;
			@Pc(181) int local181;
			@Pc(159) int local159;
			if (Static73.anInt1747 == 34) {
				Static75.method1198();
				local159 = Static47.aClass5_Sub14_Sub1_2.method1443();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1429();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1452();
				Static100.anIntArray328[local163] = local167;
				Static118.anIntArray361[local163] = local159;
				Static23.anIntArray125[local163] = 1;
				for (local181 = 0; local181 < 98; local181++) {
					if (local167 >= Class5_Sub2_Sub6.anIntArray179[local181]) {
						Static23.anIntArray125[local163] = local181 + 2;
					}
				}
				Static74.anIntArray257[Static101.anInt2695++ & 0x1F] = local163;
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(241) int local241;
			@Pc(389) int local389;
			@Pc(443) int local443;
			@Pc(225) long local225;
			@Pc(359) int local359;
			@Pc(352) int local352;
			if (Static73.anInt1747 == 117) {
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local181 = Static47.aClass5_Sub14_Sub1_2.method1471();
				@Pc(239) Class61 local239 = Static111.method1831(local225).method1701();
				for (local241 = 0; local241 < Static45.anInt1203; local241++) {
					if (local225 == Static70.aLongArray4[local241]) {
						if (local167 != Static109.anIntArray339[local241]) {
							Static109.anIntArray339[local241] = local167;
							if (local167 > 0) {
								Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { local239, Static63.aClass61_482 }), 5);
							}
							if (local167 == 0) {
								Static91.method1596(Static96.aClass61_746, Static123.method1929(new Class61[] { local239, Static52.aClass61_430 }), 5);
							}
						}
						Static99.anIntArray327[local241] = local181;
						local239 = null;
						break;
					}
				}
				if (local239 != null && Static45.anInt1203 < 200) {
					Static70.aLongArray4[Static45.anInt1203] = local225;
					Static1.aClass61Array1[Static45.anInt1203] = local239;
					Static109.anIntArray339[Static45.anInt1203] = local167;
					Static99.anIntArray327[Static45.anInt1203] = local181;
					Static45.anInt1203++;
				}
				Static95.anInt2443 = Static66.anInt1592;
				local352 = Static45.anInt1203;
				while (local352 > 0) {
					local352--;
					@Pc(357) boolean local357 = true;
					for (local359 = 0; local359 < local352; local359++) {
						if (Static67.anInt1683 != Static109.anIntArray339[local359] && Static109.anIntArray339[local359 + 1] == Static67.anInt1683 || Static109.anIntArray339[local359] == 0 && Static109.anIntArray339[local359 + 1] != 0) {
							local357 = false;
							local389 = Static109.anIntArray339[local359];
							Static109.anIntArray339[local359] = Static109.anIntArray339[local359 + 1];
							Static109.anIntArray339[local359 + 1] = local389;
							@Pc(407) Class61 local407 = Static1.aClass61Array1[local359];
							Static1.aClass61Array1[local359] = Static1.aClass61Array1[local359 + 1];
							Static1.aClass61Array1[local359 + 1] = local407;
							@Pc(425) long local425 = Static70.aLongArray4[local359];
							Static70.aLongArray4[local359] = Static70.aLongArray4[local359 + 1];
							Static70.aLongArray4[local359 + 1] = local425;
							local443 = Static99.anIntArray327[local359];
							Static99.anIntArray327[local359] = Static99.anIntArray327[local359 + 1];
							Static99.anIntArray327[local359 + 1] = local443;
						}
					}
					if (local357) {
						break;
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 189) {
				Static67.method1123();
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 125) {
				Static2.anInt23 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 47) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1472();
				Static9.method182(local159);
				Static13.anIntArray74[Static24.anInt725++ & 0x1F] = local159 & 0x7FFF;
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(534) Class61 local534;
			@Pc(546) Class5_Sub11 local546;
			if (Static73.anInt1747 == 154) {
				local534 = Static47.aClass5_Sub14_Sub1_2.method1450();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local546 = Static88.method2191(local163);
				if (!local534.method1736(local546.aClass61_506)) {
					local546.aClass61_506 = local534;
					Static24.method505(local546);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 248) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local546 = Static88.method2191(local159);
				if (local546.anInt1649 != 2 || local163 != local546.anInt1679) {
					local546.anInt1649 = 2;
					local546.anInt1679 = local163;
					Static24.method505(local546);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 46) {
				Static88.anInt3387 = Static47.aClass5_Sub14_Sub1_2.method1478() * 30;
				Static77.anInt1910 = Static66.anInt1592;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 130) {
				Static22.aBoolean22 = true;
				Static68.anInt1692 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static44.anInt1142 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static80.anInt2044 = Static47.aClass5_Sub14_Sub1_2.method1478();
				Static98.anInt2562 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static87.anInt2340 = Static47.aClass5_Sub14_Sub1_2.method1471();
				if (Static87.anInt2340 >= 100) {
					Static40.anInt1074 = Static44.anInt1142 * 128 + 64;
					Static22.anInt683 = Static68.anInt1692 * 128 + 64;
					Static78.anInt1986 = Static42.method757(Static93.anInt2428, Static22.anInt683, Static40.anInt1074) - Static80.anInt2044;
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 163) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1472();
				if (local159 == 65535) {
					local159 = -1;
				}
				Static78.method1268(local159);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 19) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1466();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1472();
				if (local163 == 65535) {
					local163 = -1;
				}
				Static45.method853(local163, local159);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 76) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1474();
				Static100.aClass10_5 = Static86.aClass80_2.method2035(local159);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 205) {
				Static97.anInt2547 = Static47.aClass5_Sub14_Sub1_2.method1471();
				if (Static97.anInt2547 == 1) {
					Static12.anInt302 = Static47.aClass5_Sub14_Sub1_2.method1478();
				}
				if (Static97.anInt2547 >= 2 && Static97.anInt2547 <= 6) {
					if (Static97.anInt2547 == 2) {
						Static100.anInt2584 = 64;
						Static48.anInt1243 = 64;
					}
					if (Static97.anInt2547 == 3) {
						Static100.anInt2584 = 64;
						Static48.anInt1243 = 0;
					}
					if (Static97.anInt2547 == 4) {
						Static48.anInt1243 = 128;
						Static100.anInt2584 = 64;
					}
					if (Static97.anInt2547 == 5) {
						Static100.anInt2584 = 0;
						Static48.anInt1243 = 64;
					}
					if (Static97.anInt2547 == 6) {
						Static48.anInt1243 = 64;
						Static100.anInt2584 = 128;
					}
					Static97.anInt2547 = 2;
					Static1.anInt16 = Static47.aClass5_Sub14_Sub1_2.method1478();
					Static33.anInt998 = Static47.aClass5_Sub14_Sub1_2.method1478();
					Static88.anInt3388 = Static47.aClass5_Sub14_Sub1_2.method1471();
				}
				if (Static97.anInt2547 == 10) {
					Static22.anInt697 = Static47.aClass5_Sub14_Sub1_2.method1478();
				}
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(870) int local870;
			@Pc(958) int local958;
			@Pc(918) Class5_Sub13 local918;
			@Pc(974) long local974;
			if (Static73.anInt1747 == 136) {
				local159 = Static47.aClass5_Sub14_Sub1_2.anInt2199 + Static80.anInt2057;
				local163 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1478();
				if (local163 != Static44.anInt1133) {
					Static44.anInt1133 = local163;
					Static110.method1825(Static44.anInt1133);
					Static68.method1132(Static44.anInt1133);
					for (local181 = 0; local181 < 100; local181++) {
						Static48.aBooleanArray5[local181] = true;
					}
				}
				while (local167-- > 0) {
					local181 = Static47.aClass5_Sub14_Sub1_2.method1461();
					local870 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local241 = Static47.aClass5_Sub14_Sub1_2.method1471();
					@Pc(881) Class5_Sub13 local881 = (Class5_Sub13) Static28.aClass20_3.method656((long) local181);
					if (local881 != null && local870 != local881.anInt2013) {
						Static123.method1930(local881, true);
						local881 = null;
					}
					if (local881 == null) {
						local881 = Static119.method1898(local870, local181, local241);
					}
					local881.aBoolean76 = true;
				}
				for (local918 = (Class5_Sub13) Static28.aClass20_3.method655(); local918 != null; local918 = (Class5_Sub13) Static28.aClass20_3.method649()) {
					if (local918.aBoolean76) {
						local918.aBoolean76 = false;
					} else {
						Static123.method1930(local918, true);
					}
				}
				Static97.aClass20_9 = new Class20(512);
				while (local159 > Static47.aClass5_Sub14_Sub1_2.anInt2199) {
					local870 = Static47.aClass5_Sub14_Sub1_2.method1461();
					local241 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local958 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local352 = Static47.aClass5_Sub14_Sub1_2.method1461();
					for (local359 = local241; local359 <= local958; local359++) {
						local974 = (long) local359 + ((long) local870 << 32);
						Static97.aClass20_9.method647(new Class5_Sub6(local352), local974);
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 99) {
				if (Static44.anInt1133 != -1) {
					Static98.method1662(0, Static44.anInt1133);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 21) {
				Static75.method1198();
				Static102.anInt2696 = Static47.aClass5_Sub14_Sub1_2.method1430();
				Static73.anInt1747 = -1;
				Static77.anInt1910 = Static66.anInt1592;
				return true;
			}
			@Pc(1059) Class5_Sub11 local1059;
			if (Static73.anInt1747 == 90) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1452();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1472();
				if (local163 == 65535) {
					local163 = -1;
				}
				local167 = Static47.aClass5_Sub14_Sub1_2.method1452();
				local1059 = Static88.method2191(local159);
				@Pc(1074) Class5_Sub2_Sub11 local1074;
				if (local1059.aBoolean66) {
					local1059.anInt1618 = local163;
					local1059.anInt1630 = local167;
					local1074 = Static111.method1830(local163);
					local1059.anInt1670 = local1074.anInt1954;
					local1059.anInt1664 = local1074.anInt1956;
					local1059.anInt1668 = local1074.anInt1960;
					if (local1059.anInt1653 > 0) {
						local1059.anInt1668 = local1059.anInt1668 * 32 / local1059.anInt1653;
					}
					local1059.anInt1673 = local1074.anInt1959;
					local1059.anInt1647 = local1074.anInt1950;
					local1059.anInt1671 = local1074.anInt1967;
					Static24.method505(local1059);
				} else if (local163 == -1) {
					Static73.anInt1747 = -1;
					local1059.anInt1649 = 0;
					return true;
				} else {
					local1074 = Static111.method1830(local163);
					local1059.anInt1679 = local163;
					local1059.anInt1647 = local1074.anInt1950;
					local1059.anInt1649 = 4;
					local1059.anInt1668 = local1074.anInt1960 * 100 / local167;
					local1059.anInt1671 = local1074.anInt1967;
					Static24.method505(local1059);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(1180) long local1180;
			@Pc(1185) long local1185;
			if (Static73.anInt1747 == 67) {
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				Static47.aClass5_Sub14_Sub1_2.method1447();
				local1180 = Static47.aClass5_Sub14_Sub1_2.method1432();
				local1185 = Static47.aClass5_Sub14_Sub1_2.method1478();
				@Pc(1190) long local1190 = (long) Static47.aClass5_Sub14_Sub1_2.method1439();
				local359 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local974 = (local1185 << 32) + local1190;
				@Pc(1202) boolean local1202 = false;
				for (@Pc(1204) int local1204 = 0; local1204 < 100; local1204++) {
					if (Static29.aLongArray1[local1204] == local974) {
						local1202 = true;
						break;
					}
				}
				if (local359 <= 1) {
					for (local443 = 0; local443 < Static114.anInt2962; local443++) {
						if (Static68.aLongArray3[local443] == local225) {
							local1202 = true;
							break;
						}
					}
				}
				if (!local1202 && Static8.anInt187 == 0) {
					Static29.aLongArray1[Static25.anInt732] = local974;
					Static25.anInt732 = (Static25.anInt732 + 1) % 100;
					@Pc(1271) Class61 local1271 = Static7.method570(Static43.method760(Static47.aClass5_Sub14_Sub1_2).method1737());
					if (local359 == 2 || local359 == 3) {
						Static47.method857(Static111.method1831(local1180).method1701(), 9, Static123.method1929(new Class61[] { Static73.aClass61_538, Static111.method1831(local225).method1701() }), local1271);
					} else if (local359 == 1) {
						Static47.method857(Static111.method1831(local1180).method1701(), 9, Static123.method1929(new Class61[] { Static120.aClass61_949, Static111.method1831(local225).method1701() }), local1271);
					} else {
						Static47.method857(Static111.method1831(local1180).method1701(), 9, Static111.method1831(local225).method1701(), local1271);
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 2) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1478();
				if (local159 >= 0) {
					local546 = Static88.method2191(local159);
				} else {
					local546 = null;
				}
				if (local546 != null) {
					for (local181 = 0; local181 < local546.anIntArray246.length; local181++) {
						local546.anIntArray246[local181] = 0;
						local546.anIntArray241[local181] = 0;
					}
				}
				if (local159 < -70000) {
					local163 += 32768;
				}
				Static100.method1677(local163);
				local181 = Static47.aClass5_Sub14_Sub1_2.method1478();
				for (local870 = 0; local870 < local181; local870++) {
					local241 = Static47.aClass5_Sub14_Sub1_2.method1437();
					local958 = Static47.aClass5_Sub14_Sub1_2.method1429();
					if (local958 == 255) {
						local958 = Static47.aClass5_Sub14_Sub1_2.method1461();
					}
					if (local546 != null && local870 < local546.anIntArray246.length) {
						local546.anIntArray246[local870] = local241;
						local546.anIntArray241[local870] = local958;
					}
					method394(local241 - 1, local870, local163, local958);
				}
				if (local546 != null) {
					Static24.method505(local546);
				}
				Static75.method1198();
				Static13.anIntArray74[Static24.anInt725++ & 0x1F] = local163 & 0x7FFF;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 61) {
				Static50.method890(Static47.aClass5_Sub14_Sub1_2, Static86.aClass80_2, Static80.anInt2057);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 252) {
				Static118.method1891();
				Static73.anInt1747 = -1;
				return false;
			}
			if (Static73.anInt1747 == 208) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1430();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1462();
				local1059 = Static88.method2191(local163);
				local870 = local167 + local1059.anInt1615;
				local241 = local1059.anInt1628 + local159;
				if (local870 != local1059.anInt1665 || local241 != local1059.anInt1661) {
					local1059.anInt1665 = local870;
					local1059.anInt1661 = local241;
					Static24.method505(local1059);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 4) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1437();
				local181 = Static47.aClass5_Sub14_Sub1_2.method1461();
				@Pc(1606) Class5_Sub11 local1606 = Static88.method2191(local181);
				if (local1606.anInt1647 != local167 || local1606.anInt1671 != local159 || local1606.anInt1668 != local163) {
					local1606.anInt1668 = local163;
					local1606.anInt1647 = local167;
					local1606.anInt1671 = local159;
					Static24.method505(local1606);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 5) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local181 = local159 >> 5 & 0x1F;
				local163 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local167 = local159 >> 10 & 0x1F;
				@Pc(1675) Class5_Sub11 local1675 = Static88.method2191(local163);
				local870 = local159 & 0x1F;
				local241 = (local181 << 11) + (local167 << 19) + (local870 << 3);
				if (local1675.anInt1611 != local241) {
					local1675.anInt1611 = local241;
					Static24.method505(local1675);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 176) {
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				@Pc(1726) Class61 local1726 = Static7.method570(Static43.method760(Static47.aClass5_Sub14_Sub1_2).method1737());
				Static91.method1596(Static111.method1831(local225).method1701(), local1726, 6);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 164) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1463();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1452();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local918 = (Class5_Sub13) Static28.aClass20_3.method656((long) local163);
				if (local918 != null) {
					Static123.method1930(local918, local918.anInt2013 != local167);
				}
				Static119.method1898(local167, local163, local159);
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(1804) boolean local1804;
			if (Static73.anInt1747 == 20) {
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				local1804 = false;
				local167 = Static47.aClass5_Sub14_Sub1_2.method1478();
				if ((Long.MIN_VALUE & local225) != 0L) {
					local1804 = true;
				}
				@Pc(1820) byte local1820 = Static47.aClass5_Sub14_Sub1_2.method1447();
				if (local1804) {
					if (Static92.anInt2213 == 0) {
						Static73.anInt1747 = -1;
						return true;
					}
					local225 &= Long.MAX_VALUE;
					for (local241 = 0; Static92.anInt2213 > local241 && (Static88.aClass5_Sub12Array62[local241].aLong100 != local225 || Static88.aClass5_Sub12Array62[local241].anInt1768 != local167); local241++) {
					}
					if (Static92.anInt2213 > local241) {
						while (local241 < Static92.anInt2213 - 1) {
							Static88.aClass5_Sub12Array62[local241] = Static88.aClass5_Sub12Array62[local241 + 1];
							local241++;
						}
						Static92.anInt2213--;
						Static88.aClass5_Sub12Array62[Static92.anInt2213] = null;
					}
				} else {
					@Pc(1826) Class5_Sub12 local1826 = new Class5_Sub12();
					local1826.aLong100 = local225;
					local1826.aClass61_549 = Static111.method1831(local1826.aLong100);
					local1826.anInt1768 = local167;
					local1826.aByte6 = local1820;
					for (local958 = Static92.anInt2213 - 1; local958 >= 0; local958--) {
						local352 = Static88.aClass5_Sub12Array62[local958].aClass61_549.method1708(local1826.aClass61_549);
						if (local352 == 0) {
							Static88.aClass5_Sub12Array62[local958].anInt1768 = local167;
							Static88.aClass5_Sub12Array62[local958].aByte6 = local1820;
							Static45.anInt1202 = Static66.anInt1592;
							Static73.anInt1747 = -1;
							if (Static31.aLong37 == local225) {
								Static45.aByte3 = local1820;
							}
							return true;
						}
						if (local352 < 0) {
							break;
						}
					}
					if (Static88.aClass5_Sub12Array62.length <= Static92.anInt2213) {
						Static73.anInt1747 = -1;
						return true;
					}
					for (local352 = Static92.anInt2213 - 1; local352 > local958; local352--) {
						Static88.aClass5_Sub12Array62[local352 + 1] = Static88.aClass5_Sub12Array62[local352];
					}
					if (Static92.anInt2213 == 0) {
						Static88.aClass5_Sub12Array62 = new Class5_Sub12[100];
					}
					Static88.aClass5_Sub12Array62[local958 + 1] = local1826;
					if (local225 == Static31.aLong37) {
						Static45.aByte3 = local1820;
					}
					Static92.anInt2213++;
				}
				Static73.anInt1747 = -1;
				Static45.anInt1202 = Static66.anInt1592;
				return true;
			}
			if (Static73.anInt1747 == 218) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1443();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static93.anInt2428 = local163 >> 1;
				Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.method1857(local167, local159, (local163 & 0x1) == 1);
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(2103) int local2103;
			if (Static73.anInt1747 == 158) {
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				local1180 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local1185 = Static47.aClass5_Sub14_Sub1_2.method1439();
				local958 = Static47.aClass5_Sub14_Sub1_2.method1471();
				@Pc(2099) long local2099 = (local1180 << 32) + local1185;
				@Pc(2101) boolean local2101 = false;
				for (local2103 = 0; local2103 < 100; local2103++) {
					if (local2099 == Static29.aLongArray1[local2103]) {
						local2101 = true;
						break;
					}
				}
				if (local958 <= 1) {
					for (@Pc(2124) int local2124 = 0; local2124 < Static114.anInt2962; local2124++) {
						if (Static68.aLongArray3[local2124] == local225) {
							local2101 = true;
							break;
						}
					}
				}
				if (!local2101 && Static8.anInt187 == 0) {
					Static29.aLongArray1[Static25.anInt732] = local2099;
					Static25.anInt732 = (Static25.anInt732 + 1) % 100;
					@Pc(2164) Class61 local2164 = Static7.method570(Static43.method760(Static47.aClass5_Sub14_Sub1_2).method1737());
					if (local958 == 2 || local958 == 3) {
						Static91.method1596(Static123.method1929(new Class61[] { Static73.aClass61_538, Static111.method1831(local225).method1701() }), local2164, 7);
					} else if (local958 == 1) {
						Static91.method1596(Static123.method1929(new Class61[] { Static120.aClass61_949, Static111.method1831(local225).method1701() }), local2164, 7);
					} else {
						Static91.method1596(Static111.method1831(local225).method1701(), local2164, 3);
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			@Pc(2247) Class5_Sub11 local2247;
			if (Static73.anInt1747 == 62) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1474();
				local2247 = Static88.method2191(local159);
				local2247.anInt1649 = 3;
				local2247.anInt1679 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass37_2.method998();
				Static24.method505(local2247);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 195) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local181 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static96.aBooleanArray12[local159] = true;
				Static41.anIntArray291[local159] = local163;
				Static76.anIntArray268[local159] = local167;
				Static67.anIntArray248[local159] = local181;
				Static32.anIntArray152[local159] = 0;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 165) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1474();
				Static25.anIntArray128[local159] = local163;
				if (Static83.anIntArray289[local159] != local163) {
					Static83.anIntArray289[local159] = local163;
					Static29.method631(local159);
				}
				Static65.anIntArray235[Static89.anInt2365++ & 0x1F] = local159;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 27) {
				Static126.anInt3158 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static95.anInt2443 = Static66.anInt1592;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 33) {
				for (local159 = 0; local159 < Static83.anIntArray289.length; local159++) {
					if (Static83.anIntArray289[local159] != Static25.anIntArray128[local159]) {
						Static83.anIntArray289[local159] = Static25.anIntArray128[local159];
						Static29.method631(local159);
						Static65.anIntArray235[Static89.anInt2365++ & 0x1F] = local159;
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 184) {
				local534 = Static47.aClass5_Sub14_Sub1_2.method1450();
				@Pc(2443) Class61 local2443;
				if (local534.method1710(Static110.aClass61_858)) {
					local2443 = local534.method1730(local534.method1731(Static74.aClass61_548), 0);
					local1180 = local2443.method1723();
					local1804 = false;
					for (local241 = 0; local241 < Static114.anInt2962; local241++) {
						if (Static68.aLongArray3[local241] == local1180) {
							local1804 = true;
							break;
						}
					}
					if (!local1804 && Static8.anInt187 == 0) {
						Static91.method1596(local2443, Static12.aClass61_107, 4);
					}
				} else if (local534.method1710(Static114.aClass61_900)) {
					local1804 = false;
					local2443 = local534.method1730(local534.method1731(Static74.aClass61_548), 0);
					local1180 = local2443.method1723();
					for (local241 = 0; local241 < Static114.anInt2962; local241++) {
						if (Static68.aLongArray3[local241] == local1180) {
							local1804 = true;
							break;
						}
					}
					if (!local1804 && Static8.anInt187 == 0) {
						Static91.method1596(local2443, Static125.aClass61_996, 8);
					}
				} else if (local534.method1710(aClass61_166)) {
					local2443 = local534.method1730(local534.method1731(Static74.aClass61_548), 0);
					local1180 = local2443.method1723();
					local1804 = false;
					for (local241 = 0; local241 < Static114.anInt2962; local241++) {
						if (local1180 == Static68.aLongArray3[local241]) {
							local1804 = true;
							break;
						}
					}
					if (!local1804 && Static8.anInt187 == 0) {
						@Pc(2736) Class61 local2736 = local534.method1730(local534.method1733() - 9, local534.method1731(Static74.aClass61_548) - -1);
						Static91.method1596(local2443, local2736, 8);
					}
				} else if (local534.method1710(Static97.aClass61_757)) {
					local2443 = local534.method1730(local534.method1731(Static74.aClass61_548), 0);
					local1180 = local2443.method1723();
					local1804 = false;
					for (local241 = 0; local241 < Static114.anInt2962; local241++) {
						if (local1180 == Static68.aLongArray3[local241]) {
							local1804 = true;
							break;
						}
					}
					if (!local1804 && Static8.anInt187 == 0) {
						Static91.method1596(local2443, Static96.aClass61_746, 10);
					}
				} else if (local534.method1710(Static118.aClass61_941)) {
					local2443 = local534.method1730(local534.method1731(Static118.aClass61_941), 0);
					Static91.method1596(Static96.aClass61_746, local2443, 11);
				} else if (local534.method1710(Static85.aClass61_671)) {
					local2443 = local534.method1730(local534.method1731(Static85.aClass61_671), 0);
					if (Static8.anInt187 == 0) {
						Static91.method1596(Static96.aClass61_746, local2443, 12);
					}
				} else if (local534.method1710(Static117.aClass61_935)) {
					local2443 = local534.method1730(local534.method1731(Static117.aClass61_935), 0);
					if (Static8.anInt187 == 0) {
						Static91.method1596(Static96.aClass61_746, local2443, 13);
					}
				} else {
					Static91.method1596(Static96.aClass61_746, local534, 0);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 57) {
				Static124.anInt3090 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static73.anInt1740 = Static47.aClass5_Sub14_Sub1_2.method1471();
				anInt525 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 213) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1452();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1437();
				if (local167 == 65535) {
					local167 = -1;
				}
				local181 = Static47.aClass5_Sub14_Sub1_2.method1437();
				if (local181 == 65535) {
					local181 = -1;
				}
				for (local870 = local181; local870 <= local167; local870++) {
					@Pc(2815) long local2815 = (long) local870 + ((long) local159 << 32);
					@Pc(2822) Class5 local2822 = Static97.aClass20_9.method656(local2815);
					if (local2822 != null) {
						local2822.method2189();
					}
					Static97.aClass20_9.method647(new Class5_Sub6(local163), local2815);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 177) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1474();
				local546 = Static88.method2191(local163);
				if (local546 != null && local546.anInt1669 == 0) {
					if (local159 > local546.anInt1662 - local546.anInt1636) {
						local159 = local546.anInt1662 - local546.anInt1636;
					}
					if (local159 < 0) {
						local159 = 0;
					}
					if (local159 != local546.anInt1660) {
						local546.anInt1660 = local159;
						Static24.method505(local546);
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 132) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1459();
				Static44.anInt1133 = local159;
				Static110.method1825(local159);
				Static68.method1132(Static44.anInt1133);
				for (local163 = 0; local163 < 100; local163++) {
					Static48.aBooleanArray5[local163] = true;
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 60) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1437();
				local546 = Static88.method2191(local159);
				if (local546.anInt1649 != 1 || local163 != local546.anInt1679) {
					local546.anInt1649 = 1;
					local546.anInt1679 = local163;
					Static24.method505(local546);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 28) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1478();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1478();
				Static105.method2174(local167, local159, local163);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 224) {
				for (local159 = 0; local159 < Static109.anInt2799; local159++) {
					@Pc(3016) Class5_Sub2_Sub14 local3016 = Static82.method1498(local159);
					if (local3016 != null && local3016.anInt2828 == 0) {
						Static25.anIntArray128[local159] = 0;
						Static83.anIntArray289[local159] = 0;
					}
				}
				Static75.method1198();
				Static73.anInt1747 = -1;
				Static89.anInt2365 += 32;
				return true;
			}
			if (Static73.anInt1747 == 145 || Static73.anInt1747 == 242 || Static73.anInt1747 == 100 || Static73.anInt1747 == 167 || Static73.anInt1747 == 175 || Static73.anInt1747 == 209 || Static73.anInt1747 == 116 || Static73.anInt1747 == 146 || Static73.anInt1747 == 230 || Static73.anInt1747 == 178 || Static73.anInt1747 == 92) {
				Static108.method51();
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 169) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1454();
				local546 = Static88.method2191(local159);
				if (local163 != local546.anInt1625 || local163 == -1) {
					local546.anInt1617 = 0;
					local546.anInt1625 = local163;
					local546.anInt1672 = 0;
					Static24.method505(local546);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 198) {
				Static96.anInt2502 = 0;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 87) {
				local534 = Static47.aClass5_Sub14_Sub1_2.method1450();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1471();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1443();
				if (local163 >= 1 && local163 <= 8) {
					if (local534.method1709(Static121.aClass61_962)) {
						local534 = null;
					}
					Static77.aClass61Array13[local163 - 1] = local534;
					Static91.aBooleanArray11[local163 - 1] = local167 == 0;
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 204) {
				Static82.anInt2265 = Static47.aClass5_Sub14_Sub1_2.method1443();
				Static12.anInt336 = Static47.aClass5_Sub14_Sub1_2.method1443();
				for (local159 = Static12.anInt336; local159 < Static12.anInt336 + 8; local159++) {
					for (local163 = Static82.anInt2265; local163 < Static82.anInt2265 + 8; local163++) {
						if (Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local159][local163] != null) {
							Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local159][local163] = null;
							Static32.method648(local163, local159);
						}
					}
				}
				for (@Pc(3265) Class5_Sub4 local3265 = (Class5_Sub4) Static97.aClass58_57.method1669(); local3265 != null; local3265 = (Class5_Sub4) Static97.aClass58_57.method1664()) {
					if (Static12.anInt336 <= local3265.anInt263 && local3265.anInt263 < Static12.anInt336 + 8 && local3265.anInt260 >= Static82.anInt2265 && Static82.anInt2265 + 8 > local3265.anInt260 && local3265.anInt261 == Static93.anInt2428) {
						local3265.anInt257 = 0;
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 80) {
				Static22.aBoolean22 = false;
				for (local159 = 0; local159 < 5; local159++) {
					Static96.aBooleanArray12[local159] = false;
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 6) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1478();
				@Pc(3347) byte local3347 = Static47.aClass5_Sub14_Sub1_2.method1487();
				Static25.anIntArray128[local159] = local3347;
				if (local3347 != Static83.anIntArray289[local159]) {
					Static83.anIntArray289[local159] = local3347;
					Static29.method631(local159);
				}
				Static65.anIntArray235[Static89.anInt2365++ & 0x1F] = local159;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 142) {
				Static12.anInt336 = Static47.aClass5_Sub14_Sub1_2.method1463();
				Static82.anInt2265 = Static47.aClass5_Sub14_Sub1_2.method1429();
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 110) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1478();
				if (local159 < 0) {
					local546 = null;
				} else {
					local546 = Static88.method2191(local159);
				}
				if (local159 < -70000) {
					local163 += 32768;
				}
				while (Static80.anInt2057 > Static47.aClass5_Sub14_Sub1_2.anInt2199) {
					local181 = Static47.aClass5_Sub14_Sub1_2.method1455();
					local870 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local241 = 0;
					if (local870 != 0) {
						local241 = Static47.aClass5_Sub14_Sub1_2.method1471();
						if (local241 == 255) {
							local241 = Static47.aClass5_Sub14_Sub1_2.method1461();
						}
					}
					if (local546 != null && local181 >= 0 && local546.anIntArray246.length > local181) {
						local546.anIntArray246[local181] = local870;
						local546.anIntArray241[local181] = local241;
					}
					method394(local870 - 1, local181, local163, local241);
				}
				if (local546 != null) {
					Static24.method505(local546);
				}
				Static75.method1198();
				Static13.anIntArray74[Static24.anInt725++ & 0x1F] = local163 & 0x7FFF;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 232) {
				Static75.method1198();
				Static28.anInt901 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static73.anInt1747 = -1;
				Static77.anInt1910 = Static66.anInt1592;
				return true;
			}
			if (Static73.anInt1747 == 220) {
				@Pc(3539) boolean local3539 = Static47.aClass5_Sub14_Sub1_2.method1429() == 1;
				local163 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local546 = Static88.method2191(local163);
				if (local546.aBoolean71 != local3539) {
					local546.aBoolean71 = local3539;
					Static24.method505(local546);
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 187) {
				Static133.method2193(true);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 38) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				local2247 = Static88.method2191(local159);
				for (local167 = 0; local167 < local2247.anIntArray246.length; local167++) {
					local2247.anIntArray246[local167] = -1;
					local2247.anIntArray246[local167] = 0;
				}
				Static24.method505(local2247);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 39) {
				Static114.anInt2962 = Static80.anInt2057 / 8;
				for (local159 = 0; local159 < Static114.anInt2962; local159++) {
					Static68.aLongArray3[local159] = Static47.aClass5_Sub14_Sub1_2.method1432();
					Static104.aClass61Array18[local159] = Static111.method1831(Static68.aLongArray3[local159]);
				}
				Static95.anInt2443 = Static66.anInt1592;
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 3) {
				for (local159 = 0; local159 < Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1.length; local159++) {
					if (Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local159] != null) {
						Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local159].anInt2903 = -1;
					}
				}
				for (local163 = 0; local163 < Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1.length; local163++) {
					if (Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local163] != null) {
						Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local163].anInt2903 = -1;
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 112) {
				local534 = Static47.aClass5_Sub14_Sub1_2.method1450();
				@Pc(3723) Object[] local3723 = new Object[local534.method1733() + 1];
				for (local167 = local534.method1733() - 1; local167 >= 0; local167--) {
					if (local534.method1714(local167) == 115) {
						local3723[local167 + 1] = Static47.aClass5_Sub14_Sub1_2.method1450();
					} else {
						local3723[local167 + 1] = Integer.valueOf(Static47.aClass5_Sub14_Sub1_2.method1461());
					}
				}
				local3723[0] = Integer.valueOf(Static47.aClass5_Sub14_Sub1_2.method1461());
				@Pc(3783) Class5_Sub22 local3783 = new Class5_Sub22();
				local3783.anObjectArray28 = local3723;
				Static76.method1228(local3783);
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 113) {
				Static45.anInt1202 = Static66.anInt1592;
				local225 = Static47.aClass5_Sub14_Sub1_2.method1432();
				if (local225 == 0L) {
					Static73.anInt1747 = -1;
					Static85.aClass61_670 = null;
					Static88.aClass5_Sub12Array62 = null;
					Static65.aClass61_492 = null;
					Static92.anInt2213 = 0;
					return true;
				}
				local1180 = Static47.aClass5_Sub14_Sub1_2.method1432();
				Static85.aClass61_670 = Static111.method1831(local1180);
				Static65.aClass61_492 = Static111.method1831(local225);
				Static134.aByte8 = Static47.aClass5_Sub14_Sub1_2.method1447();
				local870 = Static47.aClass5_Sub14_Sub1_2.method1471();
				if (local870 == 255) {
					Static73.anInt1747 = -1;
					return true;
				}
				Static92.anInt2213 = local870;
				@Pc(3856) Class5_Sub12[] local3856 = new Class5_Sub12[100];
				for (local958 = 0; local958 < Static92.anInt2213; local958++) {
					local3856[local958] = new Class5_Sub12();
					local3856[local958].aLong100 = Static47.aClass5_Sub14_Sub1_2.method1432();
					local3856[local958].aClass61_549 = Static111.method1831(local3856[local958].aLong100);
					local3856[local958].anInt1768 = Static47.aClass5_Sub14_Sub1_2.method1478();
					local3856[local958].aByte6 = Static47.aClass5_Sub14_Sub1_2.method1447();
					if (local3856[local958].aLong100 == Static31.aLong37) {
						Static45.aByte3 = local3856[local958].aByte6;
					}
				}
				local389 = Static92.anInt2213;
				while (local389 > 0) {
					local389--;
					@Pc(3928) boolean local3928 = true;
					for (local2103 = 0; local2103 < local389; local2103++) {
						if (local3856[local2103].aClass61_549.method1708(local3856[local2103 + 1].aClass61_549) > 0) {
							@Pc(3949) Class5_Sub12 local3949 = local3856[local2103];
							local3856[local2103] = local3856[local2103 + 1];
							local3928 = false;
							local3856[local2103 + 1] = local3949;
						}
					}
					if (local3928) {
						break;
					}
				}
				Static73.anInt1747 = -1;
				Static88.aClass5_Sub12Array62 = local3856;
				return true;
			}
			if (Static73.anInt1747 == 159) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1459();
				local163 = Static47.aClass5_Sub14_Sub1_2.method1472();
				local167 = Static47.aClass5_Sub14_Sub1_2.method1453();
				local1059 = Static88.method2191(local167);
				Static73.anInt1747 = -1;
				local1059.anInt1677 = (local163 << 16) + local159;
				return true;
			}
			if (Static73.anInt1747 == 196) {
				Static22.aBoolean22 = true;
				Static100.anInt2601 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static16.anInt492 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static9.anInt225 = Static47.aClass5_Sub14_Sub1_2.method1478();
				Static57.anInt1413 = Static47.aClass5_Sub14_Sub1_2.method1471();
				Static30.anInt923 = Static47.aClass5_Sub14_Sub1_2.method1471();
				if (Static30.anInt923 >= 100) {
					local159 = Static100.anInt2601 * 128 + 64;
					local163 = Static16.anInt492 * 128 + 64;
					local167 = Static42.method757(Static93.anInt2428, local159, local163) - Static9.anInt225;
					local181 = local159 - Static22.anInt683;
					local870 = local167 - Static78.anInt1986;
					local241 = local163 - Static40.anInt1074;
					local958 = (int) Math.sqrt((double) (local181 * local181 + local241 * local241));
					Static78.anInt1985 = (int) (Math.atan2((double) local870, (double) local958) * 325.949D) & 0x7FF;
					Static1.anInt15 = (int) (Math.atan2((double) local181, (double) local241) * -325.949D) & 0x7FF;
					if (Static78.anInt1985 < 128) {
						Static78.anInt1985 = 128;
					}
					if (Static78.anInt1985 > 383) {
						Static78.anInt1985 = 383;
					}
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 14) {
				local159 = Static47.aClass5_Sub14_Sub1_2.method1461();
				@Pc(4144) Class5_Sub13 local4144 = (Class5_Sub13) Static28.aClass20_3.method656((long) local159);
				if (local4144 != null) {
					Static123.method1930(local4144, true);
				}
				if (Static90.aClass5_Sub11_9 != null) {
					Static24.method505(Static90.aClass5_Sub11_9);
					Static90.aClass5_Sub11_9 = null;
				}
				Static73.anInt1747 = -1;
				return true;
			}
			if (Static73.anInt1747 == 134) {
				Static12.anInt336 = Static47.aClass5_Sub14_Sub1_2.method1429();
				Static82.anInt2265 = Static47.aClass5_Sub14_Sub1_2.method1471();
				while (Static47.aClass5_Sub14_Sub1_2.anInt2199 < Static80.anInt2057) {
					Static73.anInt1747 = Static47.aClass5_Sub14_Sub1_2.method1471();
					Static108.method51();
				}
				Static73.anInt1747 = -1;
				return true;
			}
			Static21.method462("T1 - " + Static73.anInt1747 + "," + Static126.anInt3161 + "," + Static30.anInt918 + " - " + Static80.anInt2057, null);
			Static118.method1891();
		} catch (@Pc(4214) IOException local4214) {
			Static1.method7();
		} catch (@Pc(4218) Exception local4218) {
			@Pc(4259) String local4259 = "T2 - " + Static73.anInt1747 + "," + Static126.anInt3161 + "," + Static30.anInt918 + " - " + Static80.anInt2057 + "," + (Static19.anInt623 + Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0]) + "," + (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0] + Static25.anInt730) + " - ";
			for (local163 = 0; Static80.anInt2057 > local163 && local163 < 50; local163++) {
				local4259 = local4259 + Static47.aClass5_Sub14_Sub1_2.aByteArray33[local163] + ",";
			}
			Static21.method462(local4259, local4218);
			Static118.method1891();
		}
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)V")
	public static void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static48.method879();
		Static46.method1989(arg0, arg2, arg0 + Static79.aClass5_Sub2_Sub1_Sub3_4.anInt2091, Static79.aClass5_Sub2_Sub1_Sub3_4.anInt2090 + arg2);
		if (Static2.anInt23 == 2 || Static2.anInt23 == 5) {
			Static46.method1995(arg0 + 25, arg2 + 5, Static98.anIntArray324, Static34.anIntArray158);
		} else {
			@Pc(38) int local38 = Static129.anInt3240 + Static91.anInt2422 & 0x7FF;
			@Pc(45) int local45 = 464 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
			@Pc(52) int local52 = Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32 + 48;
			Static89.aClass5_Sub2_Sub1_Sub4_5.method2031(arg0 + 25, arg2 + 5, 146, 151, local52, local45, local38, Static129.anInt3235 + 256, Static98.anIntArray324, Static34.anIntArray158);
			@Pc(101) int local101;
			@Pc(88) int local88;
			for (@Pc(72) int local72 = 0; local72 < Static113.anInt2955; local72++) {
				local88 = Static72.anIntArray277[local72] * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
				local101 = Static129.anIntArray392[local72] * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
				Static83.method1502(local101, local88, Static90.aClass5_Sub2_Sub1_Sub4Array6[local72], arg0, arg2);
			}
			@Pc(148) int local148;
			@Pc(160) int local160;
			for (local101 = 0; local101 < 104; local101++) {
				for (local88 = 0; local88 < 104; local88++) {
					@Pc(134) Class58 local134 = Static77.aClass58ArrayArrayArray1[Static93.anInt2428][local101][local88];
					if (local134 != null) {
						local148 = local101 * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
						local160 = local88 * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
						Static83.method1502(local148, local160, Static115.aClass5_Sub2_Sub1_Sub4Array9[0], arg0, arg2);
					}
				}
			}
			@Pc(234) int local234;
			for (local88 = 0; local88 < Static100.anInt2607; local88++) {
				@Pc(187) Class5_Sub2_Sub2_Sub3_Sub1 local187 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local88]];
				if (local187 != null && local187.method1855()) {
					@Pc(196) Class5_Sub2_Sub12 local196 = local187.aClass5_Sub2_Sub12_1;
					if (local196 != null && local196.anIntArray318 != null) {
						local196 = local196.method1632();
					}
					if (local196 != null && local196.aBoolean89 && local196.aBoolean91) {
						local160 = local187.anInt2912 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
						local234 = local187.anInt2875 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
						Static83.method1502(local160, local234, Static115.aClass5_Sub2_Sub1_Sub4Array9[1], arg0, arg2);
					}
				}
			}
			@Pc(261) Class5_Sub2_Sub2_Sub3_Sub2 local261;
			for (@Pc(253) int local253 = 0; local253 < Static92.anInt2219; local253++) {
				local261 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local253]];
				if (local261 != null && local261.method1855()) {
					local160 = local261.anInt2912 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
					local234 = local261.anInt2875 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
					@Pc(290) boolean local290 = false;
					@Pc(295) long local295 = local261.aClass61_877.method1723();
					for (@Pc(297) int local297 = 0; local297 < Static45.anInt1203; local297++) {
						if (local295 == Static70.aLongArray4[local297] && Static109.anIntArray339[local297] != 0) {
							local290 = true;
							break;
						}
					}
					@Pc(330) boolean local330 = false;
					if (Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2938 != 0 && local261.anInt2938 != 0 && Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2938 == local261.anInt2938) {
						local330 = true;
					}
					if (local290) {
						Static83.method1502(local160, local234, Static115.aClass5_Sub2_Sub1_Sub4Array9[3], arg0, arg2);
					} else if (local330) {
						Static83.method1502(local160, local234, Static115.aClass5_Sub2_Sub1_Sub4Array9[4], arg0, arg2);
					} else {
						Static83.method1502(local160, local234, Static115.aClass5_Sub2_Sub1_Sub4Array9[2], arg0, arg2);
					}
				}
			}
			if (Static97.anInt2547 != 0 && Static58.anInt1422 % 20 < 10) {
				if (Static97.anInt2547 == 1 && Static12.anInt302 >= 0 && Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1.length > Static12.anInt302) {
					@Pc(412) Class5_Sub2_Sub2_Sub3_Sub1 local412 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static12.anInt302];
					if (local412 != null) {
						local234 = local412.anInt2875 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
						local160 = local412.anInt2912 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
						Static34.method679(Static75.aClass5_Sub2_Sub1_Sub4Array5[1], arg2, local234, arg0, local160);
					}
				}
				if (Static97.anInt2547 == 2) {
					local148 = (Static1.anInt16 - Static19.anInt623) * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
					local160 = (Static33.anInt998 - Static25.anInt730) * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
					Static34.method679(Static75.aClass5_Sub2_Sub1_Sub4Array5[1], arg2, local160, arg0, local148);
				}
				if (Static97.anInt2547 == 10 && Static22.anInt697 >= 0 && Static22.anInt697 < Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1.length) {
					local261 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static22.anInt697];
					if (local261 != null) {
						local160 = local261.anInt2912 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
						local234 = local261.anInt2875 / 32 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
						Static34.method679(Static75.aClass5_Sub2_Sub1_Sub4Array5[1], arg2, local234, arg0, local160);
					}
				}
			}
			if (Static96.anInt2502 != 0) {
				local148 = Static96.anInt2502 * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2912 / 32;
				local160 = Static104.anInt2719 * 4 + 2 - Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anInt2875 / 32;
				Static83.method1502(local148, local160, Static75.aClass5_Sub2_Sub1_Sub4Array5[0], arg0, arg2);
			}
			Static46.method2001(arg0 + 97, arg2 - 4 + 82, 3, 3, 16777215);
		}
		if (Static2.anInt23 < 3) {
			aClass5_Sub2_Sub1_Sub4_1.method2031(arg0, arg2, 33, 33, 25, 25, Static91.anInt2422, 256, Static55.anIntArray207, Static110.anIntArray342);
		} else {
			Static46.method1995(arg0, arg2, Static55.anIntArray207, Static110.anIntArray342);
		}
		if (Static36.aBooleanArray4[arg1]) {
			Static79.aClass5_Sub2_Sub1_Sub3_4.method1354(arg0, arg2);
		}
		Static60.aBooleanArray8[arg1] = true;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IIII)I")
	public static int method398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * arg1 + local16 * (arg0 & 0xFF00FF) & 0xFF00FF00) + (arg1 * (arg2 & 0xFF00) + (arg0 & 0xFF00) * local16 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	public static void method399() {
		if (Static128.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static88.anIntArray446[188] = 71;
			Static88.anIntArray446[221] = 43;
			Static88.anIntArray446[219] = 42;
			Static88.anIntArray446[220] = 74;
			Static88.anIntArray446[190] = 72;
			Static88.anIntArray446[186] = 57;
			Static88.anIntArray446[187] = 27;
			Static88.anIntArray446[223] = 28;
			Static88.anIntArray446[222] = 59;
			Static88.anIntArray446[189] = 26;
			Static88.anIntArray446[192] = 58;
			Static88.anIntArray446[191] = 73;
			return;
		}
		Static88.anIntArray446[61] = 27;
		Static88.anIntArray446[47] = 73;
		Static88.anIntArray446[45] = 26;
		Static88.anIntArray446[44] = 71;
		Static88.anIntArray446[91] = 42;
		Static88.anIntArray446[59] = 57;
		Static88.anIntArray446[46] = 72;
		if (Static128.aMethod1 == null) {
			Static88.anIntArray446[192] = 58;
			Static88.anIntArray446[222] = 59;
		} else {
			Static88.anIntArray446[520] = 59;
			Static88.anIntArray446[192] = 28;
			Static88.anIntArray446[222] = 58;
		}
		Static88.anIntArray446[93] = 43;
		Static88.anIntArray446[92] = 74;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
	public static void method400() {
		@Pc(5) Class34 local5 = Static4.aClass34_2;
		synchronized (Static4.aClass34_2) {
			Static8.anInt190 = Static133.anInt3391;
			Static30.anInt917 = Static31.anInt943;
			Static40.anInt1073 = Static73.anInt1737;
			Static75.anInt1772 = Static1.anInt8;
			Static26.anInt613 = Static30.anInt922;
			Static12.anInt308 = Static107.anInt2767;
			Static34.aLong40 = Static29.aLong35;
			Static1.anInt8 = 0;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)Z")
	public static boolean method402() {
		try {
			if (Static58.anInt1425 == 2) {
				if (Static32.aClass5_Sub18_1 == null) {
					Static32.aClass5_Sub18_1 = Static139.method1617(Static97.aClass26_21, Static79.anInt2014, Static119.anInt3027);
					if (Static32.aClass5_Sub18_1 == null) {
						return false;
					}
				}
				if (Static93.aClass65_1 == null) {
					Static93.aClass65_1 = new Class65(Static132.aClass26_33, Static83.aClass26_19);
				}
				if (Static111.aClass5_Sub5_Sub1_2.method255(Static62.aClass26_9, Static93.aClass65_1, Static32.aClass5_Sub18_1)) {
					Static111.aClass5_Sub5_Sub1_2.method258();
					Static111.aClass5_Sub5_Sub1_2.method249(Static62.anInt1526);
					Static111.aClass5_Sub5_Sub1_2.method232(Static32.aClass5_Sub18_1, Static93.aBoolean85);
					Static32.aClass5_Sub18_1 = null;
					Static97.aClass26_21 = null;
					Static93.aClass65_1 = null;
					Static58.anInt1425 = 0;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static111.aClass5_Sub5_Sub1_2.method244();
			Static97.aClass26_21 = null;
			Static93.aClass65_1 = null;
			Static32.aClass5_Sub18_1 = null;
			Static58.anInt1425 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static21.method461(arg0)) {
			Static47.method860(-1, arg4, arg2, arg5, arg6, Static56.aClass5_Sub11ArrayArray1[arg0], arg1, arg3);
		}
	}
}
