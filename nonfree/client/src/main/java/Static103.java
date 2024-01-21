import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Z")
	public static boolean aBoolean143;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1198 = Static56.method972("scrollbar");

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1199 = Static56.method972("Untersuchen");

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1200 = Static56.method972("Sprites geladen)3");

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1205 = Static56.method972("red:");

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1201 = aClass5_1205;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1202 = Static56.method972("Enter name of player to add to list");

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "[I")
	public static int[] anIntArray313 = new int[25];

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1203 = Static56.method972("");

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1204 = aClass5_1202;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method1743() {
		if (Static37.anInt1023 == 0) {
			Static73.aClass42_1 = new Class42(4, 104, 104, Static111.anIntArrayArrayArray7);
			for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
				Static80.aClass30Array1[local17] = new Class30(104, 104);
			}
			Static40.aClass3_Sub1_Sub2_Sub3_3 = new Class3_Sub1_Sub2_Sub3(512, 512);
			Static69.anInt1825 = 5;
			Static88.aClass5_1025 = Static104.aClass5_818;
			Static37.anInt1023 = 20;
			return;
		}
		@Pc(54) int local54;
		@Pc(64) int local64;
		@Pc(74) int local74;
		@Pc(68) int local68;
		if (Static37.anInt1023 == 20) {
			@Pc(52) int[] local52 = new int[9];
			for (local54 = 0; local54 < 9; local54++) {
				local64 = local54 * 32 + 128 + 15;
				local68 = Class3_Sub1_Sub2_Sub2.anIntArray101[local64];
				local74 = local64 * 3 + 600;
				local52[local54] = local68 * local74 >> 16;
			}
			Static59.method1059(local52);
			Static69.anInt1825 = 10;
			Static37.anInt1023 = 30;
			Static88.aClass5_1025 = Static43.aClass5_563;
		} else if (Static37.anInt1023 == 30) {
			Static65.aClass11_Sub1_92 = Static69.method1188(0, true, true, false);
			Static17.aClass11_Sub1_19 = Static69.method1188(1, true, true, false);
			Static111.aClass11_Sub1_107 = Static69.method1188(2, false, true, true);
			Static60.aClass11_Sub1_113 = Static69.method1188(3, true, true, false);
			Static60.aClass11_Sub1_112 = Static69.method1188(4, true, true, false);
			Static18.aClass11_Sub1_20 = Static69.method1188(5, true, true, true);
			Static34.aClass11_Sub1_34 = Static69.method1188(6, true, false, true);
			Static74.aClass11_Sub1_67 = Static69.method1188(7, true, true, false);
			Static38.aClass11_Sub1_37 = Static69.method1188(8, true, true, false);
			Static102.aClass11_Sub1_97 = Static69.method1188(9, true, true, false);
			Static110.aClass11_Sub1_106 = Static69.method1188(10, true, true, false);
			Static54.aClass11_Sub1_53 = Static69.method1188(11, true, true, false);
			Static49.aClass11_Sub1_50 = Static69.method1188(12, true, true, false);
			Static93.aClass11_Sub1_89 = Static69.method1188(13, false, true, true);
			Static69.anInt1825 = 20;
			Static88.aClass5_1025 = Static79.aClass5_905;
			Static37.anInt1023 = 40;
		} else if (Static37.anInt1023 == 40) {
			local54 = Static65.aClass11_Sub1_92.method1894() * 5 / 100;
			local54 += Static17.aClass11_Sub1_19.method1894() * 5 / 100;
			local54 += Static111.aClass11_Sub1_107.method1894() * 5 / 100;
			local54 += Static60.aClass11_Sub1_113.method1894() * 5 / 100;
			local54 += Static60.aClass11_Sub1_112.method1894() * 5 / 100;
			local54 += Static18.aClass11_Sub1_20.method1894() * 5 / 100;
			local54 += Static34.aClass11_Sub1_34.method1894() * 5 / 100;
			local54 += Static74.aClass11_Sub1_67.method1894() * 40 / 100;
			local54 += Static38.aClass11_Sub1_37.method1894() * 5 / 100;
			local54 += Static102.aClass11_Sub1_97.method1894() * 3 / 100;
			local54 += Static110.aClass11_Sub1_106.method1894() * 5 / 100;
			local54 += Static54.aClass11_Sub1_53.method1894() * 5 / 100;
			local54 += Static49.aClass11_Sub1_50.method1894() * 5 / 100;
			local54 += Static93.aClass11_Sub1_89.method1894() * 2 / 100;
			if (local54 == 100) {
				Static69.anInt1825 = 30;
				Static88.aClass5_1025 = Static114.aClass5_1346;
				Static37.anInt1023 = 45;
			} else {
				if (local54 != 0) {
					Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static52.aClass5_682, Static96.method1319(local54), Static112.aClass5_1331 });
				}
				Static69.anInt1825 = 30;
			}
		} else if (Static37.anInt1023 == 45) {
			Static110.method1913(Static56.aClass23_3, !Static74.aBoolean91);
			Static1.aClass3_Sub2_Sub1_1 = Static109.method1900(Static56.aClass23_3, Static62.aCanvas1);
			Static27.aClass46_1 = new Class46(22050, Static17.anInt610);
			Static69.anInt1825 = 35;
			Static37.anInt1023 = 50;
			Static88.aClass5_1025 = Static44.aClass5_579;
		} else if (Static37.anInt1023 == 50) {
			local54 = 0;
			if (Static2.aClass3_Sub1_Sub2_Sub1_1 == null) {
				Static2.aClass3_Sub1_Sub2_Sub1_1 = Static50.method900(Static88.aClass5_1013, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static88.aClass3_Sub1_Sub2_Sub1_3 == null) {
				Static88.aClass3_Sub1_Sub2_Sub1_3 = Static50.method900(Static85.aClass5_965, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static48.aClass3_Sub1_Sub2_Sub1_2 == null) {
				Static48.aClass3_Sub1_Sub2_Sub1_2 = Static50.method900(Static95.aClass5_1124, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (local54 < 3) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static82.aClass5_933, Static96.method1319(local54 * 100 / 3), Static112.aClass5_1331 });
				Static69.anInt1825 = 40;
			} else {
				Static69.anInt1825 = 40;
				Static37.anInt1023 = 60;
				Static88.aClass5_1025 = Static53.aClass5_700;
			}
		} else if (Static37.anInt1023 == 60) {
			local54 = Static22.method444(Static110.aClass11_Sub1_106, Static38.aClass11_Sub1_37);
			local64 = Static52.method916();
			if (local64 > local54) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static94.aClass5_267, Static96.method1319(local54 * 100 / local64), Static112.aClass5_1331 });
				Static69.anInt1825 = 50;
			} else {
				Static69.anInt1825 = 50;
				Static88.aClass5_1025 = Static115.aClass5_1351;
				Static116.method1971(5);
				Static37.anInt1023 = 70;
			}
		} else if (Static37.anInt1023 == 70) {
			if (Static111.aClass11_Sub1_107.method1876()) {
				Static109.method1903(Static111.aClass11_Sub1_107);
				Static67.method1166(Static111.aClass11_Sub1_107);
				Static51.method1570(Static74.aClass11_Sub1_67, Static111.aClass11_Sub1_107);
				Static33.method649(Static74.aBoolean91, Static74.aClass11_Sub1_67, Static111.aClass11_Sub1_107);
				Static79.method1279(Static111.aClass11_Sub1_107, Static74.aClass11_Sub1_67);
				Static99.method1659(Static74.aClass11_Sub1_67, Static111.aClass11_Sub1_107, Static2.aClass3_Sub1_Sub2_Sub1_1, Static23.aBoolean34);
				Static111.method1922(Static17.aClass11_Sub1_19, Static111.aClass11_Sub1_107, Static65.aClass11_Sub1_92);
				Static87.method1474(Static111.aClass11_Sub1_107, Static74.aClass11_Sub1_67);
				Static49.method876(Static111.aClass11_Sub1_107);
				Static76.method1694(Static111.aClass11_Sub1_107);
				Static87.method1473(Static74.aClass11_Sub1_67, Static38.aClass11_Sub1_37, Static60.aClass11_Sub1_113);
				Static88.aClass5_1025 = Static89.aClass5_1041;
				Static37.anInt1023 = 80;
				Static69.anInt1825 = 60;
			} else {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static16.aClass5_275, Static96.method1319(Static111.aClass11_Sub1_107.method1886()), Static112.aClass5_1331 });
				Static69.anInt1825 = 60;
			}
		} else if (Static37.anInt1023 == 80) {
			local54 = 0;
			if (Static10.aClass3_Sub1_Sub2_Sub3_7 == null) {
				Static10.aClass3_Sub1_Sub2_Sub3_7 = Static56.method965(Static62.aClass5_791, Static110.aClass5_1307, Static38.aClass11_Sub1_37);
			} else {
				local54++;
			}
			if (Static27.aClass3_Sub1_Sub2_Sub3_2 == null) {
				Static27.aClass3_Sub1_Sub2_Sub3_2 = Static56.method965(Static115.aClass5_1355, Static110.aClass5_1307, Static38.aClass11_Sub1_37);
			} else {
				local54++;
			}
			if (Static108.aClass3_Sub1_Sub2_Sub4Array7 == null) {
				Static108.aClass3_Sub1_Sub2_Sub4Array7 = Static80.method1296(Static38.aClass11_Sub1_37, Static110.aClass5_1307, Static49.aClass5_641);
			} else {
				local54++;
			}
			if (Static34.aClass3_Sub1_Sub2_Sub3Array4 == null) {
				Static34.aClass3_Sub1_Sub2_Sub3Array4 = Static69.method1190(Static69.aClass5_835, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static101.aClass3_Sub1_Sub2_Sub3Array13 == null) {
				Static101.aClass3_Sub1_Sub2_Sub3Array13 = Static69.method1190(Static89.aClass5_1043, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static47.aClass3_Sub1_Sub2_Sub3Array8 == null) {
				Static47.aClass3_Sub1_Sub2_Sub3Array8 = Static69.method1190(Static89.aClass5_1044, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static104.aClass3_Sub1_Sub2_Sub3Array10 == null) {
				Static104.aClass3_Sub1_Sub2_Sub3Array10 = Static69.method1190(Static85.aClass5_963, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static24.aClass3_Sub1_Sub2_Sub3Array1 == null) {
				Static24.aClass3_Sub1_Sub2_Sub3Array1 = Static69.method1190(Static9.aClass5_167, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static102.aClass3_Sub1_Sub2_Sub3_6 == null) {
				Static102.aClass3_Sub1_Sub2_Sub3_6 = Static56.method965(Static69.aClass5_834, Static110.aClass5_1307, Static38.aClass11_Sub1_37);
			} else {
				local54++;
			}
			if (Static54.aClass3_Sub1_Sub2_Sub3Array9 == null) {
				Static54.aClass3_Sub1_Sub2_Sub3Array9 = Static69.method1190(Static49.aClass5_640, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static79.aClass3_Sub1_Sub2_Sub3Array11 == null) {
				Static79.aClass3_Sub1_Sub2_Sub3Array11 = Static69.method1190(Static33.aClass5_433, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static101.aClass3_Sub1_Sub2_Sub3Array12 == null) {
				Static101.aClass3_Sub1_Sub2_Sub3Array12 = Static69.method1190(Static82.aClass5_934, Static38.aClass11_Sub1_37, Static110.aClass5_1307);
			} else {
				local54++;
			}
			if (Static67.aClass3_Sub1_Sub2_Sub4Array3 == null) {
				Static67.aClass3_Sub1_Sub2_Sub4Array3 = Static80.method1296(Static38.aClass11_Sub1_37, Static110.aClass5_1307, aClass5_1198);
			} else {
				local54++;
			}
			if (Static93.aClass3_Sub1_Sub2_Sub4Array6 == null) {
				Static93.aClass3_Sub1_Sub2_Sub4Array6 = Static80.method1296(Static38.aClass11_Sub1_37, Static110.aClass5_1307, Static40.aClass5_514);
			} else {
				local54++;
			}
			if (local54 < 14) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static37.aClass5_477, Static96.method1319(local54 * 100 / 14), Static112.aClass5_1331 });
				Static69.anInt1825 = 70;
			} else {
				local64 = (int) (Math.random() * 21.0D) - 10;
				Static27.aClass3_Sub1_Sub2_Sub3_2.method1456();
				local68 = (int) (Math.random() * 21.0D) - 10;
				local74 = (int) (Math.random() * 21.0D) - 10;
				@Pc(864) int local864 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(866) int local866 = 0; local866 < Static34.aClass3_Sub1_Sub2_Sub3Array4.length; local866++) {
					Static34.aClass3_Sub1_Sub2_Sub3Array4[local866].method1434(local64 + local864, local864 + local74, local864 + local68);
				}
				Static108.aClass3_Sub1_Sub2_Sub4Array7[0].method1855(local864 + local64, local74 + local864, local68 + local864);
				Static37.anInt1023 = 85;
				Static88.aClass5_1025 = Static10.aClass5_1275;
				Static69.anInt1825 = 70;
			}
		} else if (Static37.anInt1023 == 85) {
			local54 = Static78.method1274(Static38.aClass11_Sub1_37);
			local64 = Static22.method450();
			if (local54 < local64) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static52.aClass5_681, Static96.method1319(local54 * 100 / local64), Static112.aClass5_1331 });
				Static69.anInt1825 = 80;
			} else {
				Static69.anInt1825 = 80;
				Static88.aClass5_1025 = Static16.aClass5_276;
				Static37.anInt1023 = 90;
			}
		} else if (Static37.anInt1023 == 90) {
			if (Static102.aClass11_Sub1_97.method1876()) {
				@Pc(1003) Class57 local1003 = new Class57(Static102.aClass11_Sub1_97, Static38.aClass11_Sub1_37, 20, 0.8D, Static74.aBoolean91 ? 64 : 128);
				Static25.method505(local1003);
				Static25.method500(0.8D);
				Static37.anInt1023 = 110;
				Static69.anInt1825 = 90;
				Static88.aClass5_1025 = Static23.aClass5_327;
			} else {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static27.aClass5_360, Static96.method1319(Static102.aClass11_Sub1_97.method1886()), Static112.aClass5_1331 });
				Static69.anInt1825 = 90;
			}
		} else if (Static37.anInt1023 == 110) {
			Static9.aClass34_1 = new Class34();
			Static56.aClass23_3.method520(Static9.aClass34_1, 10);
			Static88.aClass5_1025 = Static3.aClass5_100;
			Static37.anInt1023 = 120;
			Static69.anInt1825 = 94;
		} else if (Static37.anInt1023 == 120) {
			if (Static110.aClass11_Sub1_106.method1869(Static110.aClass5_1307, Static9.aClass5_165)) {
				@Pc(1072) Class43 local1072 = new Class43(Static110.aClass11_Sub1_106.method1884(Static9.aClass5_165, Static110.aClass5_1307));
				Static31.method777(local1072);
				Static69.anInt1825 = 96;
				Static88.aClass5_1025 = Static57.aClass5_767;
				Static37.anInt1023 = 130;
			} else {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static15.aClass5_212, Static65.aClass5_1114 });
				Static69.anInt1825 = 96;
			}
		} else if (Static37.anInt1023 == 130) {
			if (!Static60.aClass11_Sub1_113.method1876()) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static90.aClass5_1064, Static96.method1319(Static60.aClass11_Sub1_113.method1886() * 4 / 5), Static112.aClass5_1331 });
				Static69.anInt1825 = 100;
			} else if (!Static49.aClass11_Sub1_50.method1876()) {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static90.aClass5_1064, Static96.method1319(Static49.aClass11_Sub1_50.method1886() / 6 + 80), Static112.aClass5_1331 });
				Static69.anInt1825 = 100;
			} else if (Static93.aClass11_Sub1_89.method1876()) {
				Static69.anInt1825 = 100;
				Static37.anInt1023 = 140;
				Static88.aClass5_1025 = Static54.aClass5_705;
			} else {
				Static88.aClass5_1025 = Static75.method1261(new Class5[] { Static90.aClass5_1064, Static96.method1319(Static93.aClass11_Sub1_89.method1886() / 20 + 96), Static112.aClass5_1331 });
				Static69.anInt1825 = 100;
			}
		} else if (Static37.anInt1023 == 140) {
			Static116.method1971(10);
		}
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static void method1744() {
		anIntArray313 = null;
		aClass5_1205 = null;
		aClass5_1200 = null;
		aClass5_1204 = null;
		aClass3_Sub1_Sub2_Sub4_15 = null;
		aClass5_1199 = null;
		aClass5_1203 = null;
		aClass5_1201 = null;
		aClass5_1202 = null;
		aClass5_1198 = null;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	public static void method1745() {
		if (Static53.anInt1403 != 0 || Static76.anInt2563 != 1) {
			return;
		}
		@Pc(25) int local25 = Static45.anInt1269 - 25 - 550;
		@Pc(31) int local31 = Static99.anInt2491 - 4 - 5;
		if (local25 < 0 || local31 < 0 || local25 >= 146 || local31 >= 151) {
			return;
		}
		local25 -= 73;
		@Pc(59) int local59 = Static51.anInt2380 + Static78.anInt1951 & 0x7FF;
		@Pc(63) int local63 = Class3_Sub1_Sub2_Sub2.anIntArray101[local59];
		@Pc(71) int local71 = (Static69.anInt1824 + 256) * local63 >> 8;
		local31 -= 75;
		@Pc(76) int local76 = Class3_Sub1_Sub2_Sub2.anIntArray98[local59];
		@Pc(84) int local84 = local76 * (Static69.anInt1824 + 256) >> 8;
		@Pc(94) int local94 = local25 * local84 + local31 * local71 >> 11;
		@Pc(101) int local101 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 + local94 >> 7;
		@Pc(112) int local112 = local84 * local31 - local71 * local25 >> 11;
		@Pc(120) int local120 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 - local112 >> 7;
		@Pc(140) boolean local140 = Static37.method696(0, local120, 0, 1, 0, 0, true, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local101);
		if (!local140) {
			return;
		}
		Static95.aClass3_Sub6_Sub1_3.method1608(local25);
		Static95.aClass3_Sub6_Sub1_3.method1608(local31);
		Static95.aClass3_Sub6_Sub1_3.method1634(Static51.anInt2380);
		Static95.aClass3_Sub6_Sub1_3.method1608(57);
		Static95.aClass3_Sub6_Sub1_3.method1608(Static78.anInt1951);
		Static95.aClass3_Sub6_Sub1_3.method1608(Static69.anInt1824);
		Static95.aClass3_Sub6_Sub1_3.method1608(89);
		Static95.aClass3_Sub6_Sub1_3.method1634(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567);
		Static95.aClass3_Sub6_Sub1_3.method1634(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543);
		Static95.aClass3_Sub6_Sub1_3.method1608(Static7.anInt367);
		Static95.aClass3_Sub6_Sub1_3.method1608(63);
		return;
	}
}
