import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Lclient!oc;")
	public static Class34 aClass34_85;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_19;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!oe;")
	public static Class45 aClass45_10 = new Class45();

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1727 = Static15.method178("wave2:");

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1726 = aClass23_1727;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1729 = Static15.method178("Remove");

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1728 = aClass23_1729;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
	public static int[] anIntArray411 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
	public static int anInt2951 = -1;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!he;Lclient!he;)V")
	public static void method1925(@OriginalArg(1) Class1_Sub1_Sub6_Sub2 arg0, @OriginalArg(2) Class1_Sub1_Sub6_Sub2 arg1) {
		Static17.aClass34_12.method1138();
		if (Static98.anInt2537 == 0 || Static98.anInt2537 == 5) {
			arg0.method832(Static11.aClass23_175, 180, 54, 16777215);
			Static24.method1582(28, 62, 304, 34, 9179409);
			Static24.method1582(29, 63, 302, 32, 0);
			Static24.method1578(30, 64, Static14.anInt273 * 3, 30, 9179409);
			Static24.method1578(Static14.anInt273 * 3 + 30, 64, 300 - Static14.anInt273 * 3, 30, 0);
			arg0.method832(Static76.aClass23_1217, 180, 85, 16777215);
		}
		@Pc(93) byte local93;
		@Pc(101) int local101;
		if (Static98.anInt2537 == 20) {
			Static110.aClass1_Sub1_Sub6_Sub3_24.method1194(0, 0);
			local93 = 40;
			arg0.method847(Static76.aClass23_1211, 180, 40, 16776960, true);
			local101 = local93 + 15;
			arg0.method847(Static76.aClass23_1216, 180, 55, 16776960, true);
			@Pc(109) int local109 = local101 + 15;
			arg0.method847(Static76.aClass23_1214, 180, 70, 16776960, true);
			@Pc(117) int local117 = local109 + 15;
			@Pc(118) int local118 = local117 + 10;
			arg0.method841(Static17.method233(new Class23[] { Static40.aClass23_724, Static76.aClass23_1212 }), 90, 95, 16777215, true);
			@Pc(137) int local137 = local118 + 15;
			arg0.method841(Static17.method233(new Class23[] { Static80.aClass23_1262, Static76.aClass23_1218.method526() }), 92, 110, 16777215, true);
			@Pc(158) int local158 = local137 + 15;
		}
		if (Static98.anInt2537 == 10) {
			Static110.aClass1_Sub1_Sub6_Sub3_24.method1194(0, 0);
			if (Static64.anInt1940 == 0) {
				local93 = 80;
				arg0.method847(Static70.aClass23_1013, 180, 80, 16776960, true);
				local101 = local93 + 30;
				Static18.aClass1_Sub1_Sub6_Sub3_5.method1194(27, 100);
				arg0.method849(Static39.aClass23_714, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static18.aClass1_Sub1_Sub6_Sub3_5.method1194(187, 100);
				arg0.method849(Static66.aClass23_1127, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static64.anInt1940 == 2) {
				local93 = 40;
				arg0.method847(Static76.aClass23_1211, 180, 40, 16776960, true);
				local101 = local93 + 15;
				arg0.method847(Static76.aClass23_1216, 180, 55, 16776960, true);
				local101 += 15;
				arg0.method847(Static76.aClass23_1214, 180, 70, 16776960, true);
				local101 += 15;
				local101 += 10;
				arg0.method841(Static17.method233(new Class23[] { Static40.aClass23_724, Static76.aClass23_1212, Static7.anInt176 % 40 < 20 & Static27.anInt852 == 0 ? Static69.aClass23_1169 : Static76.aClass23_1213 }), 90, 95, 16777215, true);
				local101 += 15;
				arg0.method841(Static17.method233(new Class23[] { Static80.aClass23_1262, Static76.aClass23_1218.method526(), Static27.anInt852 == 1 & Static7.anInt176 % 40 < 20 ? Static69.aClass23_1169 : Static76.aClass23_1213 }), 92, 110, 16777215, true);
				local101 += 15;
				Static18.aClass1_Sub1_Sub6_Sub3_5.method1194(27, 130);
				arg0.method847(Static98.aClass23_1442, 100, 155, 16777215, true);
				Static18.aClass1_Sub1_Sub6_Sub3_5.method1194(187, 130);
				arg0.method847(Static98.aClass23_1436, 260, 155, 16777215, true);
			} else if (Static64.anInt1940 == 3) {
				arg0.method847(Static89.aClass23_1343, 180, 40, 16776960, true);
				local93 = 65;
				arg0.method847(Static43.aClass23_768, 180, 65, 16777215, true);
				local101 = local93 + 15;
				arg0.method847(Static106.aClass23_1554, 180, 80, 16777215, true);
				local101 += 15;
				arg0.method847(Static54.aClass23_901, 180, 95, 16777215, true);
				local101 += 15;
				arg0.method847(Static107.aClass23_1593, 180, 110, 16777215, true);
				local101 += 15;
				Static18.aClass1_Sub1_Sub6_Sub3_5.method1194(107, 130);
				arg0.method847(Static98.aClass23_1436, 180, 155, 16777215, true);
			}
		}
		Static35.method597();
		try {
			@Pc(467) Graphics local467 = Static26.aCanvas1.getGraphics();
			Static17.aClass34_12.method1144(171, local467, 202);
			Static98.aClass34_71.method1144(0, local467, 0);
			Static2.aClass34_63.method1144(0, local467, 637);
			if (Static54.aBoolean86) {
				Static54.aBoolean86 = false;
				Static18.aClass34_14.method1144(0, local467, 128);
				Static99.aClass34_72.method1144(371, local467, 202);
				Static45.aClass34_40.method1144(265, local467, 0);
				Static109.aClass34_82.method1144(265, local467, 562);
				Static76.aClass34_57.method1144(171, local467, 128);
				Static95.aClass34_69.method1144(171, local467, 562);
			}
		} catch (@Pc(535) Exception local535) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public static void method1926() {
		anIntArray411 = null;
		aClass55_Sub1_19 = null;
		aClass23_1729 = null;
		aClass23_1726 = null;
		aClass34_85 = null;
		aClass23_1728 = null;
		aClass23_1727 = null;
		aClass45_10 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public static void method1927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static13.anInt232 != 0 && arg1 != -1) {
			Static77.method1350(Static13.anInt232, arg1, 1, Static82.aClass55_Sub1_14);
			Static77.anInt2108 = arg0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!oc;")
	public static Class34 method1928(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class34_Sub2");
			@Pc(10) Class34 local10 = (Class34) local6.getDeclaredConstructor().newInstance();
			local10.method1140(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class34_Sub1 local28 = new Class34_Sub1();
			local28.method1140(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method1929() {
		try {
			@Pc(2) Graphics local2 = Static26.aCanvas1.getGraphics();
			Static84.aClass34_66.method1144(4, local2, 0);
			Static7.aClass34_9.method1144(357, local2, 0);
			Static88.aClass34_32.method1144(4, local2, 722);
			Static110.aClass34_83.method1144(205, local2, 743);
			Static107.aClass34_78.method1144(0, local2, 0);
			Static70.aClass34_50.method1144(4, local2, 516);
			aClass34_85.method1144(205, local2, 516);
			Static16.aClass34_11.method1144(357, local2, 496);
			Static55.aClass34_45.method1144(338, local2, 0);
		} catch (@Pc(60) Exception local60) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public static void method1930() {
		if (!Static80.aBoolean106) {
			return;
		}
		Static28.anIntArray261 = null;
		Static9.aClass1_Sub1_Sub6_Sub1_1 = null;
		Static9.anIntArray40 = null;
		Static12.aClass1_Sub1_Sub6_Sub3Array9 = null;
		Static98.aClass34_71 = null;
		Static109.aClass34_82 = null;
		Static97.anIntArray344 = null;
		Static44.anIntArray176 = null;
		Static95.aClass34_69 = null;
		Static18.aClass34_14 = null;
		Static46.anIntArray183 = null;
		Static76.aClass34_57 = null;
		Static50.anIntArray186 = null;
		Static99.aClass34_72 = null;
		Static45.aClass34_40 = null;
		Static1.anIntArray9 = null;
		Static110.aClass1_Sub1_Sub6_Sub3_24 = null;
		Static18.aClass1_Sub1_Sub6_Sub3_5 = null;
		Static2.aClass34_63 = null;
		Static17.aClass34_12 = null;
		Static50.aClass1_Sub1_Sub6_Sub1_5 = null;
		Static64.anIntArray227 = null;
		Static77.method1342();
		Static94.method1611(true);
		Static80.aBoolean106 = false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 method1931() {
		@Pc(3) Class1_Sub1_Sub6_Sub1 local3 = new Class1_Sub1_Sub6_Sub1();
		local3.anInt1331 = Static13.anInt236;
		local3.anInt1333 = Static79.anInt2132;
		local3.anInt1329 = Static102.anIntArray355[0];
		local3.anInt1332 = Static100.anIntArray348[0];
		local3.anInt1334 = Static113.anIntArray410[0];
		local3.anInt1330 = Static26.anIntArray119[0];
		@Pc(42) byte[] local42 = Static105.aByteArrayArray7[0];
		@Pc(48) int local48 = local3.anInt1330 * local3.anInt1334;
		local3.anIntArray155 = new int[local48];
		for (@Pc(54) int local54 = 0; local54 < local48; local54++) {
			local3.anIntArray155[local54] = Static80.anIntArray268[local42[local54] & 0xFF];
		}
		Static90.method1538();
		return local3;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public static void method1932() {
		Static61.aClass23_1043 = Static99.aClass23_1446;
		Static104.aClass23_1532 = Static20.aClass23_380;
		Static69.aClass23_1171 = Static115.aClass23_1735;
		Static21.aClass23_387 = Static74.aClass23_980;
		Static56.aClass23_935 = Static87.aClass23_1687;
		aClass23_1728 = Static106.aClass23_1558;
		Static10.aClass23_167 = Static62.aClass23_1064;
		Static8.aClass23_158 = Static18.aClass23_284;
		Static82.aClass23_1298 = Static5.aClass23_99;
		Static108.aClass23_1641 = Static35.aClass23_605;
		Static45.aClass23_813 = Static95.aClass23_1405;
		Static107.aClass23_1592 = Static40.aClass23_731;
		Static70.aClass23_1013 = Static60.aClass23_995;
		Static9.aClass23_165 = Static109.aClass23_1684;
		Static108.aClass23_1623 = Static35.aClass23_605;
		Static67.aClass23_1137 = Static9.aClass23_163;
		Static56.aClass23_934 = Static10.aClass23_171;
		Static70.aClass23_1009 = Static67.aClass23_1133;
		Static75.aClass23_1210 = Static115.aClass23_1734;
		Static108.aClass23_1644 = Static21.aClass23_385;
		Static71.aClass23_1178 = Static12.aClass23_1373;
		Static108.aClass23_1661 = Static35.aClass23_605;
		Static106.aClass23_1559 = Static10.aClass23_170;
		Static11.aClass23_177 = Static39.aClass23_718;
		Static13.aClass23_189 = Static33.aClass23_565;
		Static108.aClass23_1647 = Static35.aClass23_605;
		Static65.aClass23_1125 = Static107.aClass23_1585;
		Static100.aClass23_1460 = Static109.aClass23_1686;
		Static79.aClass23_1227 = Static82.aClass23_1299;
		Static76.aClass23_1220 = Static55.aClass23_927;
		Static106.aClass23_1554 = Static32.aClass23_532;
		Static18.aClass23_285 = Static11.aClass23_176;
		Static51.aClass23_866 = Static108.aClass23_1634;
		Static100.aClass23_1463 = Static79.aClass23_1226;
		Static46.aClass23_853 = Static20.aClass23_377;
		Static18.aClass23_282 = Static1.aClass23_61;
		Static70.aClass23_1008 = Static21.aClass23_382;
		Static41.aClass23_759 = Static20.aClass23_376;
		Static80.aClass23_1264 = Static33.aClass23_571;
		Static12.aClass23_1370 = Static97.aClass23_1430;
		Static47.aClass23_860 = Static84.aClass23_1327;
		Static34.aClass23_600 = Static27.aClass23_471;
		Static83.aClass23_1309 = Static68.aClass23_253;
		Static34.aClass23_599 = Static1.aClass23_64;
		Static43.aClass23_768 = Static37.aClass23_640;
		Static98.aClass23_1436 = Static95.aClass23_1403;
		Static29.aClass23_477 = Static87.aClass23_1689;
		Static33.aClass23_567 = Static47.aClass23_859;
		Static68.aClass23_248 = Static14.aClass23_210;
		Static92.aClass23_1710 = Static94.aClass23_1399;
		Static100.aClass23_1462 = Static25.aClass23_431;
		Static92.aClass23_1711 = Static61.aClass23_1049;
		Static7.aClass23_149 = Static79.aClass23_1224;
		Static98.aClass23_1440 = Static104.aClass23_1521;
		Static40.aClass23_732 = Static32.aClass23_534;
		Static97.aClass23_1428 = Static108.aClass23_1642;
		Static73.aClass23_1201 = Static26.aClass23_465;
		Static43.aClass23_773 = Static102.aClass23_1493;
		Static65.aClass23_1122 = Static15.aClass23_235;
		Static58.aClass23_1682 = Static57.aClass23_970;
		Static88.aClass23_635 = Static27.aClass23_468;
		Static55.aClass23_924 = Static43.aClass23_771;
		Static14.aClass23_204 = Static21.aClass23_386;
		Static83.aClass23_1307 = Static84.aClass23_1323;
		Static96.aClass23_971 = Static3.aClass23_95;
		Static39.aClass23_722 = Static32.aClass23_531;
		Static14.aClass23_209 = Static106.aClass23_1549;
		Static47.aClass23_858 = Static70.aClass23_1011;
		Static45.aClass23_817 = Static47.aClass23_854;
		Static108.aClass23_1645 = Static52.aClass23_868;
		Static108.aClass23_1654 = Static74.aClass23_981;
		Static112.aClass23_1722 = Static49.aClass23_766;
		Static92.aClass23_1708 = Static50.aClass23_863;
		Static15.aClass23_234 = Static1.aClass23_60;
		Static82.aClass23_1302 = Static49.aClass23_765;
		Static60.aClass23_987 = Static84.aClass23_1322;
		Static1.aClass23_56 = Static35.aClass23_606;
		Static75.aClass23_1207 = Static112.aClass23_1721;
		Static105.aClass23_1536 = Static70.aClass23_1010;
		Static108.aClass23_1658 = Static98.aClass23_1433;
		Static11.aClass23_175 = Static60.aClass23_991;
		Static55.aClass23_926 = Static105.aClass23_1538;
		Static27.aClass23_469 = Static43.aClass23_769;
		Static64.aClass23_1105 = Static72.aClass23_1189;
		Static98.aClass23_1442 = Static84.aClass23_1324;
		Static108.aClass23_1660 = Static35.aClass23_605;
		Static87.aClass23_1691 = Static84.aClass23_1328;
		Static64.aClass23_1108 = Static50.aClass23_864;
		Static108.aClass23_1643 = Static64.aClass23_1104;
		Static72.aClass23_1188 = Static64.aClass23_1100;
		Static108.aClass23_1627 = Static74.aClass23_981;
		Static74.aClass23_976 = Static11.aClass23_174;
		Static72.aClass23_1190 = Static108.aClass23_1657;
		Static8.aClass23_156 = Static95.aClass23_1404;
		Static108.aClass23_1646 = Static110.aClass23_1698;
		Static110.aClass23_1696 = Static75.aClass23_1209;
		Static61.aClass23_1046 = Static99.aClass23_1446;
		Static47.aClass23_856 = Static111.aClass23_1704;
		Static40.aClass23_724 = Static9.aClass23_162;
		Static14.aClass23_206 = Static41.aClass23_761;
		Static44.aClass23_789 = Static74.aClass23_977;
		Static13.aClass23_187 = Static105.aClass23_1537;
		Static67.aClass23_1139 = Static94.aClass23_1396;
		Static108.aClass23_1621 = Static21.aClass23_389;
		Static39.aClass23_714 = Static9.aClass23_160;
		Static107.aClass23_1593 = Static99.aClass23_1445;
		Static64.aClass23_1099 = Static108.aClass23_1633;
		Static2.aClass23_1286 = Static94.aClass23_1398;
		Static34.aClass23_602 = Static96.aClass23_974;
		Static111.aClass23_1702 = Static25.aClass23_436;
		Static54.aClass23_901 = Static106.aClass23_1557;
		Static56.aClass23_933 = Static39.aClass23_717;
		Static107.aClass23_1583 = Static110.aClass23_1701;
		Static60.aClass23_989 = Static84.aClass23_1329;
		Static108.aClass23_1620 = Static35.aClass23_605;
		Static100.aClass23_1464 = Static67.aClass23_1134;
		Static108.aClass23_1652 = Static35.aClass23_605;
		Static108.aClass23_1650 = Static35.aClass23_605;
		Static60.aClass23_986 = Static110.aClass23_1697;
		Static69.aClass23_1173 = Static54.aClass23_903;
		Static108.aClass23_1631 = Static35.aClass23_605;
		Static16.aClass23_239 = Static39.aClass23_721;
		Static100.aClass23_1468 = Static25.aClass23_431;
		Static71.aClass23_1175 = Static64.aClass23_1102;
		Static104.aClass23_1517 = Static7.aClass23_144;
		Static100.aClass23_1467 = Static67.aClass23_1134;
		Static31.aClass23_524 = Static57.aClass23_968;
		Static82.aClass23_1296 = Static40.aClass23_733;
		Static40.aClass23_734 = Static69.aClass23_1164;
		Static108.aClass23_1624 = Static110.aClass23_1698;
		Static49.aClass23_764 = Static3.aClass23_94;
		Static108.aClass23_1632 = Static35.aClass23_605;
		Static108.aClass23_1618 = Static1.aClass23_54;
		Static5.aClass23_101 = Static65.aClass23_1121;
		Static64.aClass23_1094 = Static55.aClass23_927;
		Static108.aClass23_1637 = Static96.aClass23_973;
		Static67.aClass23_1135 = Static9.aClass23_163;
		Static108.aClass23_1635 = Static35.aClass23_605;
		Static107.aClass23_1586 = Static61.aClass23_1048;
		Static26.aClass23_466 = Static2.aClass23_1289;
		Static40.aClass23_727 = Static102.aClass23_1491;
		Static108.aClass23_1655 = Static35.aClass23_605;
		Static80.aClass23_1262 = Static76.aClass23_1215;
		Static84.aClass23_1325 = Static68.aClass23_251;
		Static106.aClass23_1553 = Static84.aClass23_1326;
		Static74.aClass23_983 = Static112.aClass23_1717;
		Static7.aClass23_135 = Static115.aClass23_1736;
		Static98.aClass23_1443 = Static64.aClass23_1107;
		Static89.aClass23_1338 = Static55.aClass23_923;
		Static33.aClass23_569 = Static15.aClass23_236;
		Static108.aClass23_1659 = Static82.aClass23_1294;
		Static60.aClass23_988 = Static100.aClass23_1458;
		Static108.aClass23_1629 = Static58.aClass23_1674;
		Static67.aClass23_1138 = Static9.aClass23_163;
		Static2.aClass23_1292 = Static52.aClass23_867;
		Static8.aClass23_152 = Static107.aClass23_1588;
		Static66.aClass23_1127 = Static83.aClass23_1303;
		Static1.aClass23_55 = Static7.aClass23_144;
		Static108.aClass23_1639 = Static35.aClass23_605;
		Static104.aClass23_1531 = Static31.aClass23_527;
		Static60.aClass23_997 = Static100.aClass23_1461;
		Static45.aClass23_818 = Static62.aClass23_1061;
		Static92.aClass23_1716 = Static14.aClass23_207;
		Static108.aClass23_1630 = Static35.aClass23_605;
		Static87.aClass23_1692 = Static61.aClass23_1044;
		Static108.aClass23_1625 = Static35.aClass23_605;
		Static113.aClass23_1724 = Static73.aClass23_1205;
		Static77.aClass23_1221 = Static77.aClass23_1222;
		Static28.aClass23_1258 = Static2.aClass23_1287;
		Static17.aClass23_258 = Static102.aClass23_1495;
		Static58.aClass23_1672 = Static56.aClass23_932;
		Static29.aClass23_476 = Static2.aClass23_1290;
		Static32.aClass23_530 = Static1.aClass23_62;
		Static63.aClass23_1092 = Static89.aClass23_1344;
		Static69.aClass23_1161 = Static71.aClass23_1181;
		Static5.aClass23_102 = Static104.aClass23_1530;
		Static62.aClass23_1057 = Static31.aClass23_529;
		Static11.aClass23_180 = Static57.aClass23_967;
		Static83.aClass23_1304 = Static112.aClass23_1723;
		Static58.aClass23_1678 = Static64.aClass23_1106;
		Static108.aClass23_1638 = Static112.aClass23_1718;
		Static69.aClass23_1167 = Static71.aClass23_1181;
		Static8.aClass23_155 = Static33.aClass23_574;
		Static12.aClass23_1369 = Static74.aClass23_984;
		Static108.aClass23_1640 = Static9.aClass23_163;
		Static67.aClass23_1131 = Static36.aClass23_636;
		Static67.aClass23_1129 = Static36.aClass23_636;
		Static108.aClass23_1616 = Static39.aClass23_720;
		Static7.aClass23_142 = Static92.aClass23_1709;
		Static108.aClass23_1628 = Static35.aClass23_605;
		Static69.aClass23_1170 = Static95.aClass23_1402;
		Static89.aClass23_1343 = Static5.aClass23_103;
		Static54.aClass23_904 = Static25.aClass23_432;
		Static90.aClass23_1367 = Static19.aClass23_310;
		Static89.aClass23_1342 = Static71.aClass23_1179;
		Static33.aClass23_575 = Static68.aClass23_252;
		Static18.aClass23_283 = Static73.aClass23_1204;
		aClass23_1726 = Static69.aClass23_1163;
		Static115.aClass23_1738 = Static67.aClass23_1132;
		Static64.aClass23_1095 = Static104.aClass23_1528;
		Static7.aClass23_138 = Static112.aClass23_1719;
		Static17.aClass23_256 = Static11.aClass23_179;
		Static13.aClass23_191 = Static7.aClass23_141;
		Static88.aClass23_633 = Static65.aClass23_1123;
		Static106.aClass23_1552 = Static99.aClass23_1444;
		Static20.aClass23_378 = Static63.aClass23_1093;
		Static108.aClass23_1651 = Static40.aClass23_726;
		Static108.aClass23_1649 = Static35.aClass23_605;
		Static27.aClass23_472 = Static9.aClass23_161;
		Static19.aClass23_308 = Static35.aClass23_607;
		Static36.aClass23_638 = Static43.aClass23_776;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public static void method1933() {
		if (Static13.aClass68_1 != null) {
			Static13.aClass68_1.method1935();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!gd;)V")
	public static void method1934(@OriginalArg(1) Class23 arg0) {
		if (arg0 == null || arg0.method525() == 0) {
			Static77.anInt2104 = 0;
			return;
		}
		@Pc(20) Class23[] local20 = new Class23[100];
		@Pc(22) Class23 local22 = arg0;
		@Pc(31) int local31 = 0;
		while (true) {
			@Pc(36) int local36 = local22.method541();
			if (local36 == -1) {
				local22 = local22.method529();
				if (local22.method525() > 0) {
					local20[local31++] = local22.method537();
				}
				Static77.anInt2104 = 0;
				label46: for (local36 = 0; local36 < Static5.anInt142; local36++) {
					@Pc(102) Class1_Sub1_Sub1 local102 = Static111.method1907(local36);
					if (local102.anInt53 == -1 && local102.aClass23_58 != null) {
						@Pc(115) Class23 local115 = local102.aClass23_58.method537();
						for (@Pc(117) int local117 = 0; local117 < local31; local117++) {
							if (local115.method528(local20[local117]) == -1) {
								continue label46;
							}
						}
						Static10.aClass23Array5[Static77.anInt2104] = local115;
						Static41.anIntArray167[Static77.anInt2104] = local36;
						Static77.anInt2104++;
						if (Static10.aClass23Array5.length <= Static77.anInt2104) {
							return;
						}
					}
				}
				return;
			}
			@Pc(48) Class23 local48 = local22.method512(0, local36).method529();
			if (local48.method525() > 0) {
				local20[local31++] = local48.method537();
			}
			local22 = local22.method510(local36 + 1);
		}
	}
}
