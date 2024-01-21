import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
	public static int anInt1083;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!jd;")
	public static Class37 aClass37_15;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_8;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!md;")
	public static Class50 aClass50_5 = new Class50();

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!rd;")
	public static Class64 aClass64_712 = Static69.method1153("Okay");

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array3 = new Class1_Sub1_Sub5_Sub2[1000];

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[50][];

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public static int anInt1085 = 0;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_713 = Static69.method1153("titlebox");

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public static int anInt1086 = 127;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method821() {
		aClass50_5 = null;
		aClass1_Sub1_Sub5_Sub2Array3 = null;
		aByteArrayArray4 = null;
		aClass64_712 = null;
		aClass37_15 = null;
		aClass64_713 = null;
		aClass1_Sub1_Sub5_Sub3_8 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
	public static boolean method822() {
		if (Static14.aClass27_1 == null) {
			return false;
		}
		@Pc(448) int local448;
		try {
			@Pc(13) int local13 = Static14.aClass27_1.method559();
			if (local13 == 0) {
				return false;
			}
			if (Static54.anInt2055 == -1) {
				Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, 1);
				local13--;
				Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
				Static54.anInt2055 = Static64.aClass1_Sub6_Sub1_2.method1874();
				Static62.anInt1454 = Static45.anIntArray158[Static54.anInt2055];
			}
			if (Static62.anInt1454 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, 1);
				Static62.anInt1454 = Static64.aClass1_Sub6_Sub1_2.aByteArray27[0] & 0xFF;
			}
			if (Static62.anInt1454 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, 2);
				local13 -= 2;
				Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
				Static62.anInt1454 = Static64.aClass1_Sub6_Sub1_2.method1842();
			}
			if (Static62.anInt1454 > local13) {
				return false;
			}
			Static64.aClass1_Sub6_Sub1_2.anInt2574 = 0;
			Static14.aClass27_1.method563(0, Static64.aClass1_Sub6_Sub1_2.aByteArray27, Static62.anInt1454);
			Static114.anInt2742 = Static19.anInt613;
			Static19.anInt613 = Static101.anInt2258;
			Static101.anInt2258 = Static54.anInt2055;
			Static72.anInt1641 = 0;
			@Pc(120) int local120;
			if (Static54.anInt2055 == 193) {
				Static9.aBoolean21 = false;
				for (local120 = 0; local120 < 5; local120++) {
					Static22.aBooleanArray4[local120] = false;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(339) long local339;
			@Pc(141) long local141;
			@Pc(157) int local157;
			if (Static54.anInt2055 == 71) {
				local141 = Static64.aClass1_Sub6_Sub1_2.method1865();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1842();
				local149 = Static64.aClass1_Sub6_Sub1_2.method1837();
				@Pc(155) Class64 local155 = Static34.method565(local141).method1478();
				for (local157 = 0; local157 < Static106.anInt2498; local157++) {
					if (local141 == Static14.aLongArray1[local157]) {
						if (Static27.anIntArray139[local157] != local145) {
							Static27.anIntArray139[local157] = local145;
							Static19.aBoolean41 = true;
							if (local145 > 0) {
								Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { local155, Static73.aClass64_1040 }), 5);
							}
							if (local145 == 0) {
								Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { local155, Static89.aClass64_1283 }), 5);
							}
						}
						Static55.anIntArray447[local157] = local149;
						local155 = null;
						break;
					}
				}
				if (local155 != null && Static106.anInt2498 < 200) {
					Static14.aLongArray1[Static106.anInt2498] = local141;
					Static3.aClass64Array1[Static106.anInt2498] = local155;
					Static27.anIntArray139[Static106.anInt2498] = local145;
					Static55.anIntArray447[Static106.anInt2498] = local149;
					Static26.anInt762 = Static15.anInt471;
					Static19.aBoolean41 = true;
					Static106.anInt2498++;
				}
				@Pc(256) boolean local256 = false;
				while (!local256) {
					local256 = true;
					for (@Pc(262) int local262 = 0; local262 < Static106.anInt2498 - 1; local262++) {
						if (Static27.anIntArray139[local262] != Static95.anInt2172 && Static27.anIntArray139[local262 + 1] == Static95.anInt2172 || Static27.anIntArray139[local262] == 0 && Static27.anIntArray139[local262 + 1] != 0) {
							local256 = false;
							@Pc(303) int local303 = Static27.anIntArray139[local262];
							Static27.anIntArray139[local262] = Static27.anIntArray139[local262 + 1];
							Static27.anIntArray139[local262 + 1] = local303;
							@Pc(321) Class64 local321 = Static3.aClass64Array1[local262];
							Static3.aClass64Array1[local262] = Static3.aClass64Array1[local262 + 1];
							Static3.aClass64Array1[local262 + 1] = local321;
							local339 = Static14.aLongArray1[local262];
							Static14.aLongArray1[local262] = Static14.aLongArray1[local262 + 1];
							Static14.aLongArray1[local262 + 1] = local339;
							@Pc(357) int local357 = Static55.anIntArray447[local262];
							Static55.anIntArray447[local262] = Static55.anIntArray447[local262 + 1];
							Static55.anIntArray447[local262 + 1] = local357;
							Static19.aBoolean41 = true;
						}
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 106) {
				for (local120 = 0; local120 < Static101.anIntArray333.length; local120++) {
					if (Static103.anIntArray345[local120] != Static101.anIntArray333[local120]) {
						Static101.anIntArray333[local120] = Static103.anIntArray345[local120];
						Static60.method1020(local120);
						Static19.aBoolean41 = true;
					}
				}
				Static54.anInt2055 = -1;
				Static26.anInt762 = Static15.anInt471;
				return true;
			}
			if (Static54.anInt2055 == 191) {
				Static38.anInt907 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static15.anInt473 = Static64.aClass1_Sub6_Sub1_2.method1857();
				for (local120 = Static38.anInt907; local120 < Static38.anInt907 + 8; local120++) {
					for (local448 = Static15.anInt473; local448 < Static15.anInt473 + 8; local448++) {
						if (Static64.aClass50ArrayArrayArray1[Static15.anInt463][local120][local448] != null) {
							Static64.aClass50ArrayArrayArray1[Static15.anInt463][local120][local448] = null;
							Static26.method517(local120, local448);
						}
					}
				}
				for (@Pc(487) Class1_Sub9 local487 = (Class1_Sub9) Static60.aClass50_8.method1151(); local487 != null; local487 = (Class1_Sub9) Static60.aClass50_8.method1141()) {
					if (local487.anInt1890 >= Static38.anInt907 && local487.anInt1890 < Static38.anInt907 + 8 && local487.anInt1882 >= Static15.anInt473 && local487.anInt1882 < Static15.anInt473 + 8 && local487.anInt1887 == Static15.anInt463) {
						local487.anInt1885 = 0;
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 59) {
				Static96.anInt2744 = Static64.aClass1_Sub6_Sub1_2.method1837();
				if (Static96.anInt2744 == 1) {
					Static42.anInt936 = Static64.aClass1_Sub6_Sub1_2.method1842();
				}
				if (Static96.anInt2744 >= 2 && Static96.anInt2744 <= 6) {
					if (Static96.anInt2744 == 2) {
						Static101.anInt2270 = 64;
						Static9.anInt353 = 64;
					}
					if (Static96.anInt2744 == 3) {
						Static101.anInt2270 = 64;
						Static9.anInt353 = 0;
					}
					if (Static96.anInt2744 == 4) {
						Static101.anInt2270 = 64;
						Static9.anInt353 = 128;
					}
					if (Static96.anInt2744 == 5) {
						Static9.anInt353 = 64;
						Static101.anInt2270 = 0;
					}
					if (Static96.anInt2744 == 6) {
						Static9.anInt353 = 64;
						Static101.anInt2270 = 128;
					}
					Static96.anInt2744 = 2;
					Static37.anInt882 = Static64.aClass1_Sub6_Sub1_2.method1842();
					Static101.anInt2271 = Static64.aClass1_Sub6_Sub1_2.method1842();
					Static67.anInt1528 = Static64.aClass1_Sub6_Sub1_2.method1837();
				}
				if (Static96.anInt2744 == 10) {
					Static89.anInt2028 = Static64.aClass1_Sub6_Sub1_2.method1842();
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 13) {
				Static10.anInt406 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static108.anInt2556 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static80.anInt1901 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static116.aBoolean166 = true;
				Static19.aBoolean42 = true;
				Static54.anInt2055 = -1;
				return true;
			}
			@Pc(679) int local679;
			@Pc(663) Class1_Sub1_Sub11 local663;
			if (Static54.anInt2055 == 43) {
				Static19.aBoolean41 = true;
				local120 = Static64.aClass1_Sub6_Sub1_2.method1817();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1842();
				if (local120 < -70000) {
					local448 += 32768;
				}
				if (local120 < 0) {
					local663 = null;
				} else {
					local663 = Static12.method1397(local120);
				}
				while (Static62.anInt1454 > Static64.aClass1_Sub6_Sub1_2.anInt2574) {
					local149 = Static64.aClass1_Sub6_Sub1_2.method1844();
					local679 = Static64.aClass1_Sub6_Sub1_2.method1842();
					local157 = 0;
					if (local679 != 0) {
						local157 = Static64.aClass1_Sub6_Sub1_2.method1837();
						if (local157 == 255) {
							local157 = Static64.aClass1_Sub6_Sub1_2.method1817();
						}
					}
					if (local663 != null && local149 >= 0 && local149 < local663.anIntArray245.length) {
						local663.anIntArray245[local149] = local679;
						local663.anIntArray248[local149] = local157;
					}
					Static40.method694(local448, local157, local679 - 1, local149);
				}
				Static82.anInt1904 = Static15.anInt471;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 97) {
				if (Static101.anInt2274 != -1) {
					Static85.method2013(Static101.anInt2274);
					Static101.anInt2274 = -1;
					Static19.aBoolean41 = true;
					Static84.aBoolean118 = true;
				}
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
					Static116.aBoolean166 = true;
				}
				if (Static27.anInt889 != -1) {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = -1;
					Static10.method258(30);
				}
				if (Static45.anInt1077 != -1) {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = -1;
				}
				if (Static95.anInt2177 != -1) {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = -1;
				}
				Static54.anInt2055 = -1;
				Static15.anInt468 = -1;
				if (Static118.anInt2834 != 0) {
					Static116.aBoolean166 = true;
					Static118.anInt2834 = 0;
				}
				return true;
			}
			@Pc(822) Class64 local822;
			if (Static54.anInt2055 == 84) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local822 = Static64.aClass1_Sub6_Sub1_2.method1831();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1841();
				if (local120 >= 1 && local120 <= 5) {
					if (local822.method1501(Static121.aClass64_1850)) {
						local822 = null;
					}
					Static94.aClass64Array15[local120 - 1] = local822;
					Static102.aBooleanArray10[local120 - 1] = local145 == 0;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 184) {
				Static86.method1419();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 180) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1842();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1842();
				Static10.method251(local448, local145, local120);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 7) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1861();
				if (Static6.anInt322 != local120) {
					Static85.method2013(Static6.anInt322);
					Static6.anInt322 = local120;
				}
				Static116.aBoolean166 = true;
				Static64.method1101(Static6.anInt322);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 210) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1850();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1845();
				local663 = Static12.method1397(local448);
				Static54.anInt2055 = -1;
				local663.anInt1721 = local120;
				local663.anInt1749 = 2;
				return true;
			}
			if (Static54.anInt2055 == 176) {
				for (local120 = 0; local120 < Static100.anInt2222; local120++) {
					@Pc(967) Class1_Sub1_Sub10 local967 = Static117.method2063(local120);
					if (local967 != null && local967.anInt1615 == 0) {
						Static103.anIntArray345[local120] = 0;
						Static101.anIntArray333[local120] = 0;
					}
				}
				if (Static6.anInt322 != -1) {
					Static116.aBoolean166 = true;
				}
				Static26.anInt762 = Static15.anInt471;
				Static19.aBoolean41 = true;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 41) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1832();
				Static68.method1135(local120);
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static116.aBoolean166 = true;
					Static101.anInt2272 = -1;
				}
				if (Static27.anInt889 != -1) {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = -1;
					Static10.method258(30);
				}
				if (Static45.anInt1077 != -1) {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = -1;
				}
				if (Static95.anInt2177 != -1) {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = -1;
				}
				if (local120 == Static101.anInt2274) {
					Static3.method125(Static101.anInt2274);
				} else {
					Static85.method2013(Static101.anInt2274);
					Static101.anInt2274 = local120;
				}
				Static84.aBoolean118 = true;
				Static15.anInt468 = -1;
				Static19.aBoolean41 = true;
				if (Static118.anInt2834 != 0) {
					Static116.aBoolean166 = true;
					Static118.anInt2834 = 0;
				}
				Static64.method1101(Static101.anInt2274);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 60) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1855();
				Static54.method1460(local120);
				Static54.anInt2055 = -1;
				Static82.anInt1904 = Static15.anInt471;
				return true;
			}
			@Pc(1117) Class1_Sub1_Sub11 local1117;
			if (Static54.anInt2055 == 167) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1822();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1821();
				local1117 = Static12.method1397(local448);
				Static54.anInt2055 = -1;
				local1117.anInt1702 = local1117.anInt1735 + local145;
				local1117.anInt1690 = local1117.anInt1711 + local120;
				return true;
			}
			@Pc(1144) Class1_Sub1_Sub11 local1144;
			if (Static54.anInt2055 == 66) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1867();
				local1144 = Static12.method1397(local120);
				for (local145 = 0; local145 < local1144.anIntArray245.length; local145++) {
					local1144.anIntArray245[local145] = -1;
					local1144.anIntArray245[local145] = 0;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 21) {
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
				}
				Static118.anInt2834 = 1;
				Static60.aClass64_863 = Static60.aClass64_862;
				Static3.aBoolean9 = false;
				Static54.anInt2055 = -1;
				Static116.aBoolean166 = true;
				return true;
			}
			if (Static54.anInt2055 == 57) {
				if (Static83.anInt1922 == 12) {
					Static19.aBoolean41 = true;
				}
				Static109.anInt2637 = Static64.aClass1_Sub6_Sub1_2.method1861();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 194) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1817();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1821();
				local663 = Static12.method1397(local120);
				if (local448 != local663.anInt1695 || local448 == -1) {
					local663.anInt1705 = 0;
					local663.anInt1695 = local448;
					local663.anInt1685 = 0;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 254) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1842();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1850();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local149 = Static64.aClass1_Sub6_Sub1_2.method1832();
				@Pc(1268) Class1_Sub1_Sub11 local1268 = Static12.method1397(local145);
				local1268.anInt1686 = local149;
				local1268.anInt1752 = local120;
				local1268.anInt1747 = local448;
				Static54.anInt2055 = -1;
				return true;
			}
			@Pc(1365) int local1365;
			if (Static54.anInt2055 == 248) {
				Static19.aBoolean41 = true;
				local120 = Static64.aClass1_Sub6_Sub1_2.method1817();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1842();
				if (local120 < -70000) {
					local448 += 32768;
				}
				if (local120 >= 0) {
					local663 = Static12.method1397(local120);
				} else {
					local663 = null;
				}
				if (local663 != null) {
					for (local149 = 0; local149 < local663.anIntArray245.length; local149++) {
						local663.anIntArray245[local149] = 0;
						local663.anIntArray248[local149] = 0;
					}
				}
				Static83.method1389(local448);
				local149 = Static64.aClass1_Sub6_Sub1_2.method1842();
				for (local679 = 0; local679 < local149; local679++) {
					local157 = Static64.aClass1_Sub6_Sub1_2.method1857();
					if (local157 == 255) {
						local157 = Static64.aClass1_Sub6_Sub1_2.method1867();
					}
					local1365 = Static64.aClass1_Sub6_Sub1_2.method1850();
					if (local663 != null && local663.anIntArray245.length > local679) {
						local663.anIntArray245[local679] = local1365;
						local663.anIntArray248[local679] = local157;
					}
					Static40.method694(local448, local157, local1365 - 1, local679);
				}
				Static54.anInt2055 = -1;
				Static82.anInt1904 = Static15.anInt471;
				return true;
			}
			if (Static54.anInt2055 == 214) {
				Static66.anInt1526 = Static64.aClass1_Sub6_Sub1_2.method1832() * 30;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 91 || Static54.anInt2055 == 80 || Static54.anInt2055 == 178 || Static54.anInt2055 == 8 || Static54.anInt2055 == 190 || Static54.anInt2055 == 65 || Static54.anInt2055 == 244 || Static54.anInt2055 == 39 || Static54.anInt2055 == 152 || Static54.anInt2055 == 207 || Static54.anInt2055 == 17) {
				Static93.method1466();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 230) {
				Static9.aBoolean21 = true;
				Static26.anInt763 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static120.anInt2855 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static119.anInt2851 = Static64.aClass1_Sub6_Sub1_2.method1842();
				Static64.anInt1481 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static116.anInt2776 = Static64.aClass1_Sub6_Sub1_2.method1837();
				if (Static116.anInt2776 >= 100) {
					local448 = Static120.anInt2855 * 128 + 64;
					local120 = Static26.anInt763 * 128 + 64;
					local145 = Static114.method1996(Static15.anInt463, local120, local448) - Static119.anInt2851;
					local149 = local120 - Static119.anInt2846;
					local679 = local145 - Static106.anInt2503;
					local157 = local448 - Static80.anInt1899;
					local1365 = (int) Math.sqrt((double) (local149 * local149 + local157 * local157));
					Static72.anInt1642 = (int) (Math.atan2((double) local679, (double) local1365) * 325.949D) & 0x7FF;
					Static116.anInt2779 = (int) (Math.atan2((double) local149, (double) local157) * -325.949D) & 0x7FF;
					if (Static72.anInt1642 < 128) {
						Static72.anInt1642 = 128;
					}
					if (Static72.anInt1642 > 383) {
						Static72.anInt1642 = 383;
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 37) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1857();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1826();
				Static15.anInt463 = local120 >> 1;
				Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1689((local120 & 0x1) == 1, local448, local145);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 145) {
				Static14.method293();
				Static54.anInt2055 = -1;
				return false;
			}
			if (Static54.anInt2055 == 173) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1832();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1845();
				Static103.anIntArray345[local120] = local448;
				if (local448 != Static101.anIntArray333[local120]) {
					Static101.anIntArray333[local120] = local448;
					Static60.method1020(local120);
					if (Static6.anInt322 != -1) {
						Static116.aBoolean166 = true;
					}
					Static19.aBoolean41 = true;
				}
				Static26.anInt762 = Static15.anInt471;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 255) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				@Pc(1698) boolean local1698 = Static64.aClass1_Sub6_Sub1_2.method1841() == 1;
				local663 = Static12.method1397(local120);
				Static54.anInt2055 = -1;
				local663.aBoolean104 = local1698;
				return true;
			}
			if (Static54.anInt2055 == 112) {
				Static106.anInt2497 = Static64.aClass1_Sub6_Sub1_2.method1855();
				Static54.anInt2055 = -1;
				return true;
			}
			@Pc(1752) long local1752;
			if (Static54.anInt2055 == 15) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1867();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1832();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1867();
				if (local448 == 65535) {
					local448 = -1;
				}
				local1752 = (long) local448 + ((long) local120 << 32);
				@Pc(1757) Class1 local1757 = Static10.aClass58_1.method1380(local1752);
				if (local1757 != null) {
					local1757.method2076();
				}
				Static10.aClass58_1.method1378(local1752, new Class1_Sub13(local145));
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 129) {
				Static61.anInt1422 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static19.aBoolean41 = true;
				Static26.anInt762 = Static15.anInt471;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 19) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1832();
				if (local120 == 65535) {
					local120 = -1;
				}
				Static104.method1694(local120);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 34) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1832();
				if (local120 == 65535) {
					local120 = -1;
				}
				local448 = Static64.aClass1_Sub6_Sub1_2.method1833();
				Static37.method669(local120, local448);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 220) {
				Static42.method698();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 211) {
				Static81.anInt1387 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static54.anInt2055 = -1;
				return true;
			}
			@Pc(1888) long local1888;
			@Pc(1872) long local1872;
			if (Static54.anInt2055 == 16) {
				local141 = Static64.aClass1_Sub6_Sub1_2.method1865();
				local1872 = Static64.aClass1_Sub6_Sub1_2.method1842();
				@Pc(1877) long local1877 = (long) Static64.aClass1_Sub6_Sub1_2.method1868();
				local1365 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local1888 = (local1872 << 32) + local1877;
				@Pc(1890) boolean local1890 = false;
				for (@Pc(1892) int local1892 = 0; local1892 < 100; local1892++) {
					if (local1888 == Static118.aLongArray6[local1892]) {
						local1890 = true;
						break;
					}
				}
				if (local1365 <= 1) {
					for (@Pc(1919) int local1919 = 0; local1919 < Static73.anInt1656; local1919++) {
						if (local141 == Static69.aLongArray5[local1919]) {
							local1890 = true;
							break;
						}
					}
				}
				if (!local1890 && Static17.anInt574 == 0) {
					Static118.aLongArray6[Static8.anInt332] = local1888;
					Static8.anInt332 = (Static8.anInt332 + 1) % 100;
					@Pc(1958) Class64 local1958 = Static49.method888(Static64.aClass1_Sub6_Sub1_2).method1480();
					if (local1365 == 2 || local1365 == 3) {
						Static71.method1178(Static82.method1383(new Class64[] { Static66.aClass64_949, Static34.method565(local141).method1478() }), local1958, 7);
					} else if (local1365 == 1) {
						Static71.method1178(Static82.method1383(new Class64[] { Static41.aClass64_1692, Static34.method565(local141).method1478() }), local1958, 7);
					} else {
						Static71.method1178(Static34.method565(local141).method1478(), local1958, 3);
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 98) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				Static37.aClass48_5 = Static28.aClass28_6.method570(local120);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 246) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1855();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1832();
				local1117 = Static12.method1397(local120);
				Static54.anInt2055 = -1;
				local1117.anInt1734 = local145 + (local448 << 16);
				return true;
			}
			if (Static54.anInt2055 == 156) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1850();
				if (local120 == 65535) {
					local120 = -1;
				}
				local448 = Static64.aClass1_Sub6_Sub1_2.method1857();
				if (Static101.anIntArray334[local448] == local120) {
					Static3.method125(Static101.anIntArray334[local448]);
				} else {
					Static85.method2013(Static101.anIntArray334[local448]);
					Static101.anIntArray334[local448] = local120;
				}
				Static84.aBoolean118 = true;
				Static19.aBoolean41 = true;
				Static64.method1101(Static101.anIntArray334[local448]);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 48) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1850();
				Static68.method1135(local120);
				if (Static101.anInt2274 != -1) {
					Static85.method2013(Static101.anInt2274);
					Static19.aBoolean41 = true;
					Static84.aBoolean118 = true;
					Static101.anInt2274 = -1;
				}
				if (Static27.anInt889 != -1) {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = -1;
					Static10.method258(30);
				}
				if (Static45.anInt1077 != -1) {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = -1;
				}
				if (Static95.anInt2177 != -1) {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = -1;
				}
				if (local120 == Static101.anInt2272) {
					Static3.method125(Static101.anInt2272);
				} else {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = local120;
				}
				Static15.anInt468 = -1;
				Static64.method1101(Static101.anInt2272);
				Static54.anInt2055 = -1;
				Static116.aBoolean166 = true;
				return true;
			}
			@Pc(2219) Class64 local2219;
			if (Static54.anInt2055 == 53) {
				local2219 = Static64.aClass1_Sub6_Sub1_2.method1831();
				@Pc(2244) boolean local2244;
				if (local2219.method1474(Static51.aClass64_765)) {
					local822 = local2219.method1475(local2219.method1473(Static82.aClass64_1178), 0);
					local2244 = false;
					local1872 = local822.method1492();
					for (local157 = 0; local157 < Static73.anInt1656; local157++) {
						if (Static69.aLongArray5[local157] == local1872) {
							local2244 = true;
							break;
						}
					}
					if (!local2244 && Static17.anInt574 == 0) {
						Static71.method1178(local822, Static69.aClass64_973, 4);
					}
				} else if (local2219.method1474(Static2.aClass64_85)) {
					local822 = local2219.method1475(local2219.method1473(Static82.aClass64_1178), 0);
					local1872 = local822.method1492();
					local2244 = false;
					for (local157 = 0; local157 < Static73.anInt1656; local157++) {
						if (local1872 == Static69.aLongArray5[local157]) {
							local2244 = true;
							break;
						}
					}
					if (!local2244 && Static17.anInt574 == 0) {
						Static71.method1178(local822, Static80.aClass64_1171, 8);
					}
				} else if (local2219.method1474(Static51.aClass64_761)) {
					local822 = local2219.method1475(local2219.method1473(Static82.aClass64_1178), 0);
					local1872 = local822.method1492();
					local2244 = false;
					for (local157 = 0; local157 < Static73.anInt1656; local157++) {
						if (local1872 == Static69.aLongArray5[local157]) {
							local2244 = true;
							break;
						}
					}
					if (!local2244 && Static17.anInt574 == 0) {
						@Pc(2345) Class64 local2345 = local2219.method1475(local2219.method1469() - 9, local2219.method1473(Static82.aClass64_1178) + 1);
						Static71.method1178(local822, local2345, 8);
					}
				} else {
					Static71.method1178(Static60.aClass64_862, local2219, 0);
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 89) {
				local141 = Static64.aClass1_Sub6_Sub1_2.method1865();
				@Pc(2431) Class64 local2431 = Static49.method888(Static64.aClass1_Sub6_Sub1_2).method1480();
				Static71.method1178(Static34.method565(local141).method1478(), local2431, 6);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 162) {
				Static34.method564(false);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 217) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1842();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1855();
				Static68.method1135(local448);
				if (local120 != -1) {
					Static68.method1135(local120);
				}
				if (Static95.anInt2177 != -1) {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = -1;
				}
				if (Static101.anInt2274 != -1) {
					Static85.method2013(Static101.anInt2274);
					Static101.anInt2274 = -1;
				}
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
				}
				if (local448 == Static27.anInt889) {
					Static3.method125(Static27.anInt889);
				} else {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = local448;
					Static10.method258(35);
				}
				if (local448 == Static45.anInt1077) {
					Static3.method125(Static45.anInt1077);
				} else {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = local120;
				}
				Static15.anInt468 = -1;
				Static118.anInt2834 = 0;
				Static64.method1101(Static27.anInt889);
				Static64.method1101(Static45.anInt1077);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 92) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1855();
				if (local448 == 65535) {
					local448 = -1;
				}
				local145 = Static64.aClass1_Sub6_Sub1_2.method1845();
				local1117 = Static12.method1397(local145);
				@Pc(2603) Class1_Sub1_Sub6 local2603;
				if (local1117.aBoolean95) {
					local1117.anInt1736 = local448;
					local1117.anInt1719 = local120;
					local2603 = Static106.method1739(local448);
					local1117.anInt1715 = local2603.anInt972;
					local1117.anInt1686 = local2603.anInt984;
					local1117.anInt1745 = local2603.anInt994;
					local1117.anInt1696 = local2603.anInt979;
					local1117.anInt1747 = local2603.anInt995;
					local1117.anInt1752 = local2603.anInt971;
					if (local1117.anInt1700 > 0) {
						local1117.anInt1686 = local1117.anInt1686 * 32 / local1117.anInt1700;
					}
					Static90.method346(local1117);
				} else if (local448 == -1) {
					Static54.anInt2055 = -1;
					local1117.anInt1749 = 0;
					return true;
				} else {
					local2603 = Static106.method1739(local448);
					local1117.anInt1747 = local2603.anInt995;
					local1117.anInt1686 = local2603.anInt984 * 100 / local120;
					local1117.anInt1749 = 4;
					local1117.anInt1721 = local448;
					local1117.anInt1752 = local2603.anInt971;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 10) {
				if (Static83.anInt1922 == 12) {
					Static19.aBoolean41 = true;
				}
				Static87.anInt1995 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 177) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1842();
				Static68.method1135(local120);
				if (Static101.anInt2274 != -1) {
					Static85.method2013(Static101.anInt2274);
					Static101.anInt2274 = -1;
					Static84.aBoolean118 = true;
					Static19.aBoolean41 = true;
				}
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
					Static116.aBoolean166 = true;
				}
				if (Static27.anInt889 != -1) {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = -1;
					Static10.method258(30);
				}
				if (Static45.anInt1077 != -1) {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = -1;
				}
				if (local120 == Static95.anInt2177) {
					Static3.method125(Static95.anInt2177);
				} else {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = local120;
				}
				Static15.anInt468 = -1;
				if (Static118.anInt2834 != 0) {
					Static118.anInt2834 = 0;
					Static116.aBoolean166 = true;
				}
				Static64.method1101(Static95.anInt2177);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 90) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1818();
				if (local120 >= 0) {
					Static68.method1135(local120);
				}
				if (Static60.anInt1349 != local120) {
					Static85.method2013(Static60.anInt1349);
					Static60.anInt1349 = local120;
				}
				Static64.method1101(Static60.anInt1349);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 245) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local822 = Static64.aClass1_Sub6_Sub1_2.method1831();
				local663 = Static12.method1397(local120);
				local663.aClass64_1064 = local822;
				if (local120 >> 16 == Static101.anIntArray334[Static83.anInt1922]) {
					Static19.aBoolean41 = true;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 132) {
				Static34.method564(true);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 26) {
				for (local120 = 0; local120 < Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3.length; local120++) {
					if (Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local120] != null) {
						Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local120].anInt2407 = -1;
					}
				}
				for (local448 = 0; local448 < Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local448++) {
					if (Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local448] != null) {
						Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local448].anInt2407 = -1;
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 117) {
				Static109.anInt2628 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 3) {
				local141 = Static64.aClass1_Sub6_Sub1_2.method1865();
				@Pc(2939) byte local2939 = Static64.aClass1_Sub6_Sub1_2.method1824();
				local1752 = Static64.aClass1_Sub6_Sub1_2.method1865();
				@Pc(2948) long local2948 = (long) Static64.aClass1_Sub6_Sub1_2.method1842();
				@Pc(2950) boolean local2950 = false;
				local1888 = Static64.aClass1_Sub6_Sub1_2.method1868();
				local339 = (local2948 << 32) + local1888;
				@Pc(2966) int local2966 = Static64.aClass1_Sub6_Sub1_2.method1837();
				for (@Pc(2968) int local2968 = 0; local2968 < 100; local2968++) {
					if (Static118.aLongArray6[local2968] == local339) {
						local2950 = true;
						break;
					}
				}
				if (local2966 <= 1) {
					for (@Pc(2997) int local2997 = 0; local2997 < Static73.anInt1656; local2997++) {
						if (Static69.aLongArray5[local2997] == local141) {
							local2950 = true;
							break;
						}
					}
				}
				if (!local2950 && Static17.anInt574 == 0) {
					Static118.aLongArray6[Static8.anInt332] = local339;
					Static8.anInt332 = (Static8.anInt332 + 1) % 100;
					@Pc(3041) Class64 local3041 = Static49.method888(Static64.aClass1_Sub6_Sub1_2).method1480();
					@Pc(3070) Class64 local3070 = Static82.method1383(new Class64[] { Static30.aClass64_482, Static34.method565(local1752), Static86.aClass64_1257, Static12.method1395(local2939), Static113.aClass64_1108 });
					if (local2966 == 2 || local2966 == 3) {
						Static71.method1178(Static82.method1383(new Class64[] { local3070, Static66.aClass64_949, Static34.method565(local141).method1478() }), local3041, 7);
					} else if (local2966 == 1) {
						Static71.method1178(Static82.method1383(new Class64[] { local3070, Static41.aClass64_1692, Static34.method565(local141).method1478() }), local3041, 7);
					} else {
						Static71.method1178(Static82.method1383(new Class64[] { local3070, Static34.method565(local141).method1478() }), local3041, 3);
					}
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 137) {
				Static60.aClass64_866 = Static64.aClass1_Sub6_Sub1_2.method1831();
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
				}
				Static116.aBoolean166 = true;
				Static54.anInt2055 = -1;
				Static3.aBoolean9 = false;
				Static60.aClass64_863 = Static60.aClass64_862;
				Static118.anInt2834 = 4;
				return true;
			}
			if (Static54.anInt2055 == 163) {
				Static38.anInt907 = Static64.aClass1_Sub6_Sub1_2.method1826();
				Static15.anInt473 = Static64.aClass1_Sub6_Sub1_2.method1857();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 166) {
				Static83.anInt1922 = Static64.aClass1_Sub6_Sub1_2.method1826();
				Static84.aBoolean118 = true;
				Static19.aBoolean41 = true;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 141) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1817();
				local1144 = Static12.method1397(local120);
				local1144.anInt1749 = 3;
				local1144.anInt1721 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass54_2.method1252();
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 83) {
				Static31.anInt802 = Static64.aClass1_Sub6_Sub1_2.method1826();
				if (Static31.anInt802 == Static83.anInt1922) {
					if (Static31.anInt802 == 3) {
						Static83.anInt1922 = 1;
					} else {
						Static83.anInt1922 = 3;
					}
					Static19.aBoolean41 = true;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 63) {
				Static19.aBoolean41 = true;
				local120 = Static64.aClass1_Sub6_Sub1_2.method1826();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1826();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1847();
				Static79.anIntArray285[local120] = local145;
				Static61.anIntArray221[local120] = local448;
				Static25.anIntArray438[local120] = 1;
				for (local149 = 0; local149 < 98; local149++) {
					if (local145 >= Class1_Sub1_Sub1.anIntArray8[local149]) {
						Static25.anIntArray438[local120] = local149 + 2;
					}
				}
				Static61.anInt1435 = Static15.anInt471;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 155) {
				Static9.aBoolean21 = true;
				Static119.anInt2848 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static44.anInt1053 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static81.anInt1396 = Static64.aClass1_Sub6_Sub1_2.method1842();
				Static53.anInt1227 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static70.anInt1574 = Static64.aClass1_Sub6_Sub1_2.method1837();
				if (Static70.anInt1574 >= 100) {
					Static119.anInt2846 = Static119.anInt2848 * 128 + 64;
					Static80.anInt1899 = Static44.anInt1053 * 128 + 64;
					Static106.anInt2503 = Static114.method1996(Static15.anInt463, Static119.anInt2846, Static80.anInt1899) - Static81.anInt1396;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 189) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1842();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1832();
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
					Static116.aBoolean166 = true;
				}
				if (Static27.anInt889 != -1) {
					Static85.method2013(Static27.anInt889);
					Static27.anInt889 = -1;
					Static10.method258(30);
				}
				if (Static45.anInt1077 != -1) {
					Static85.method2013(Static45.anInt1077);
					Static45.anInt1077 = -1;
				}
				if (Static95.anInt2177 == local120) {
					Static3.method125(Static95.anInt2177);
				} else {
					Static85.method2013(Static95.anInt2177);
					Static95.anInt2177 = local120;
				}
				if (Static101.anInt2274 == local448) {
					Static3.method125(Static101.anInt2274);
				} else {
					Static85.method2013(Static101.anInt2274);
					Static101.anInt2274 = local448;
				}
				Static84.aBoolean118 = true;
				if (Static118.anInt2834 != 0) {
					Static116.aBoolean166 = true;
					Static118.anInt2834 = 0;
				}
				Static19.aBoolean41 = true;
				Static15.anInt468 = -1;
				Static64.method1101(Static95.anInt2177);
				Static64.method1101(Static101.anInt2274);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 218) {
				local2219 = Static64.aClass1_Sub6_Sub1_2.method1831();
				@Pc(3490) Object[] local3490 = new Object[local2219.method1469() + 1];
				for (local145 = local2219.method1469() - 1; local145 >= 0; local145--) {
					if (local2219.method1476(local145) == 115) {
						local3490[local145 + 1] = Static64.aClass1_Sub6_Sub1_2.method1831();
					} else {
						local3490[local145 + 1] = Integer.valueOf(Static64.aClass1_Sub6_Sub1_2.method1817());
					}
				}
				local3490[0] = Integer.valueOf(Static64.aClass1_Sub6_Sub1_2.method1817());
				Static67.method1134(local3490, 0, 0, 0, null, null);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 133) {
				Static63.method1095(Static62.anInt1454, Static28.aClass28_6, Static64.aClass1_Sub6_Sub1_2);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 2) {
				Static73.anInt1656 = Static62.anInt1454 / 8;
				for (local120 = 0; local120 < Static73.anInt1656; local120++) {
					Static69.aLongArray5[local120] = Static64.aClass1_Sub6_Sub1_2.method1865();
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 138) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1855();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1817();
				local663 = Static12.method1397(local448);
				local663.anInt1721 = local120;
				local663.anInt1749 = 1;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 161) {
				if (Static101.anInt2272 != -1) {
					Static85.method2013(Static101.anInt2272);
					Static101.anInt2272 = -1;
				}
				Static3.aBoolean9 = false;
				Static116.aBoolean166 = true;
				Static54.anInt2055 = -1;
				Static118.anInt2834 = 2;
				Static60.aClass64_863 = Static60.aClass64_862;
				return true;
			}
			if (Static54.anInt2055 == 72) {
				Static54.anInt2055 = -1;
				Static52.anInt2832 = 0;
				return true;
			}
			if (Static54.anInt2055 == 100) {
				Static38.anInt907 = Static64.aClass1_Sub6_Sub1_2.method1841();
				Static15.anInt473 = Static64.aClass1_Sub6_Sub1_2.method1857();
				while (Static62.anInt1454 > Static64.aClass1_Sub6_Sub1_2.anInt2574) {
					Static54.anInt2055 = Static64.aClass1_Sub6_Sub1_2.method1837();
					Static93.method1466();
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 74) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1845();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1855();
				local145 = local448 >> 10 & 0x1F;
				local149 = local448 >> 5 & 0x1F;
				local679 = local448 & 0x1F;
				@Pc(3715) Class1_Sub1_Sub11 local3715 = Static12.method1397(local120);
				local3715.anInt1682 = (local679 << 3) + (local149 << 11) + (local145 << 19);
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 108) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1855();
				@Pc(3743) byte local3743 = Static64.aClass1_Sub6_Sub1_2.method1860();
				Static103.anIntArray345[local120] = local3743;
				if (Static101.anIntArray333[local120] != local3743) {
					Static101.anIntArray333[local120] = local3743;
					Static60.method1020(local120);
					if (Static6.anInt322 != -1) {
						Static116.aBoolean166 = true;
					}
					Static19.aBoolean41 = true;
				}
				Static26.anInt762 = Static15.anInt471;
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 67) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1847();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1850();
				local663 = Static12.method1397(local120);
				if (local663 != null && local663.anInt1697 == 0) {
					if (local448 > local663.anInt1692 - local663.anInt1707) {
						local448 = local663.anInt1692 - local663.anInt1707;
					}
					if (local448 < 0) {
						local448 = 0;
					}
					local663.anInt1689 = local448;
				}
				Static54.anInt2055 = -1;
				return true;
			}
			if (Static54.anInt2055 == 241) {
				local120 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local448 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local145 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local149 = Static64.aClass1_Sub6_Sub1_2.method1837();
				Static22.aBooleanArray4[local120] = true;
				Static45.anIntArray157[local120] = local448;
				Static65.anIntArray230[local120] = local145;
				Static109.anIntArray382[local120] = local149;
				Static22.anIntArray84[local120] = 0;
				Static54.anInt2055 = -1;
				return true;
			}
			Static99.method1601(null, "T1 - " + Static54.anInt2055 + "," + Static19.anInt613 + "," + Static114.anInt2742 + " - " + Static62.anInt1454);
			Static14.method293();
		} catch (@Pc(3894) IOException local3894) {
			Static71.method1181();
		} catch (@Pc(3898) Exception local3898) {
			@Pc(3938) String local3938 = "T2 - " + Static54.anInt2055 + "," + Static19.anInt613 + "," + Static114.anInt2742 + " - " + Static62.anInt1454 + "," + (Static60.anInt1350 + Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0]) + "," + (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0] + Static53.anInt1236) + " - ";
			for (local448 = 0; Static62.anInt1454 > local448 && local448 < 50; local448++) {
				local3938 = local3938 + Static64.aClass1_Sub6_Sub1_2.aByteArray27[local448] + ",";
			}
			Static99.method1601(local3898, local3938);
			Static14.method293();
		}
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!pb;III)Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 method823(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static100.method1613(arg2, arg1, arg0) ? Static63.method1093() : null;
	}
}
