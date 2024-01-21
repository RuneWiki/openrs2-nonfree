import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public static int anInt2937;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt2939;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1329 = Static32.method683("flash2:");

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1327 = aClass49_1329;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1328 = Static32.method683("Benutzername: ");

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1330 = aClass49_1329;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIZI)V")
	public static void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static10.method1856(arg3, arg0, arg1 + arg3, arg2 + arg0);
		Static109.method1865();
		Static51.anInt1164++;
		Static58.method981(true);
		Static157.method2664(true);
		Static58.method981(false);
		Static157.method2664(false);
		Static37.method759();
		Static17.method2074();
		@Pc(39) int local39;
		@Pc(71) int local71;
		if (!Static96.aBoolean84) {
			local39 = Static126.anInt2750;
			if (local39 < Static8.anInt2210 / 256) {
				local39 = Static8.anInt2210 / 256;
			}
			if (Static124.aBooleanArray15[4] && local39 < Static29.anIntArray59[4] + 128) {
				local39 = Static29.anIntArray59[4] + 128;
			}
			local71 = Static70.anInt1445 + Static63.anInt1356 & 0x7FF;
			Static123.method2142(local71, Static1.anInt1, local39 * 3 + 600, Static18.method346(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578, Static66.anInt1396, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529) + -50, Static11.anInt194, local39);
		}
		if (Static96.aBoolean84) {
			local39 = Static139.method2312();
		} else {
			local39 = Static51.method908();
		}
		@Pc(103) int local103 = Static110.anInt2302;
		local71 = Static35.anInt894;
		@Pc(107) int local107 = Static101.anInt2150;
		@Pc(109) int local109 = Static66.anInt1389;
		@Pc(111) int local111 = Static127.anInt2754;
		@Pc(155) int local155;
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			if (Static124.aBooleanArray15[local113]) {
				local155 = (int) ((double) -Static95.anIntArray202[local113] + Math.random() * (double) (Static95.anIntArray202[local113] * 2 + 1) + Math.sin((double) Static62.anIntArray163[local113] * ((double) Static160.anIntArray314[local113] / 100.0D)) * (double) Static29.anIntArray59[local113]);
				if (local113 == 0) {
					Static35.anInt894 += local155;
				}
				if (local113 == 3) {
					Static127.anInt2754 = Static127.anInt2754 + local155 & 0x7FF;
				}
				if (local113 == 2) {
					Static101.anInt2150 += local155;
				}
				if (local113 == 1) {
					Static110.anInt2302 += local155;
				}
				if (local113 == 4) {
					Static66.anInt1389 += local155;
					if (Static66.anInt1389 < 128) {
						Static66.anInt1389 = 128;
					}
					if (Static66.anInt1389 > 383) {
						Static66.anInt1389 = 383;
					}
				}
			}
		}
		local155 = Static20.anInt449;
		@Pc(223) int local223 = Static96.anInt2022;
		if (arg3 <= local155 && local155 < arg3 + arg1 && arg0 <= local223 && local223 < arg0 + arg2) {
			Static166.anInt1308 = Static20.anInt449 - arg3;
			Static166.aBoolean53 = true;
			Static166.anInt1304 = 0;
			Static166.anInt1307 = Static96.anInt2022 - arg0;
		} else {
			Static166.aBoolean53 = false;
			Static166.anInt1304 = 0;
		}
		Static167.method2773();
		Static10.method1861(arg3, arg0, arg1, arg2, 0);
		Static167.method2773();
		Static69.method1159(Static35.anInt894, Static110.anInt2302, Static101.anInt2150, Static66.anInt1389, Static127.anInt2754, local39);
		Static167.method2773();
		Static143.method2364();
		Static82.method1418(arg2, arg0, arg3, arg1);
		Static59.method990(arg0, arg3);
		((Class8) Static109.anInterface1_2).method196(Static170.anInt3724);
		Static112.method1897(arg3, arg0, arg1, arg2);
		Static110.anInt2302 = local103;
		Static35.anInt894 = local71;
		Static127.anInt2754 = local111;
		Static66.anInt1389 = local109;
		Static101.anInt2150 = local107;
		if (Static44.aBoolean90 && Static144.method2367() == 0) {
			Static44.aBoolean90 = false;
		}
		if (Static44.aBoolean90) {
			Static10.method1861(arg3, arg0, arg1, arg2, 0);
			Static91.method1580(Static104.aClass49_1038, false);
		}
		if (!Static44.aBoolean90 && !Static47.aBoolean40 && local155 >= arg3 && arg3 + arg1 > local155 && arg0 <= local223 && local223 < arg0 + arg2) {
			Static118.method1992(arg3, local223, local155, arg0);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Lclient!ei;")
	public static Class26 method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass26_1 == null ? null : local7.aClass26_1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method2290() {
		Static124.aClass49_1233 = Static114.aClass49_1107;
		Static156.aClass49_1518 = Static12.aClass49_118;
		Static13.aClass49_159 = Static135.aClass49_1316;
		Static13.aClass49_142 = Static114.aClass49_1107;
		Static156.aClass49_1525 = Static72.aClass49_795;
		Static13.aClass49_120 = Static114.aClass49_1107;
		Static22.aClass49_277 = Static148.aClass49_1420;
		Static76.aClass49_815 = Static83.aClass49_886;
		Static131.aClass49_1667 = Static159.aClass49_1568;
		Static121.aClass49_1165 = Static160.aClass49_1578;
		Static84.aClass49_898 = Static103.aClass49_1027;
		Static71.aClass49_778 = Static81.aClass49_870;
		Static131.aClass49_1671 = Static159.aClass49_1568;
		Static13.aClass49_155 = Static114.aClass49_1107;
		Static104.aClass49_1036 = Static124.aClass49_1231;
		Static87.aClass49_1326 = Static108.aClass49_1052;
		Static13.aClass49_127 = Static114.aClass49_1107;
		Static83.aClass49_885 = Static57.aClass49_609;
		Static145.aClass49_1400 = Static127.aClass49_1249;
		Static4.aClass49_51 = Static151.aClass49_1464;
		Static62.aClass49_683 = Static162.aClass49_1612;
		Static162.aClass49_1614 = Static143.aClass49_1380;
		Static181.aClass49_1742 = Static69.aClass49_759;
		Static86.aClass49_1600 = Static155.aClass49_1506;
		Static49.aClass49_561 = Static127.aClass49_1250;
		Static27.aClass49_337 = Static90.aClass49_945;
		Static177.aClass49_1718 = Static170.aClass49_1662;
		Static152.aClass49_1479 = Static98.aClass49_998;
		Static171.aClass49_1677 = Static7.aClass49_82;
		Static47.aClass49_542 = Static100.aClass49_1015;
		Static34.aClass49_463 = Static87.aClass49_1323;
		Static184.aClass49_1753 = Static112.aClass49_1075;
		Static156.aClass49_1523 = Static19.aClass49_254;
		Static33.aClass49_446 = Static4.aClass49_52;
		Static100.aClass49_1014 = Static121.aClass49_1168;
		Static104.aClass49_1038 = Static185.aClass49_1755;
		Static13.aClass49_158 = Static114.aClass49_1107;
		Static125.aClass49_1240 = Static148.aClass49_1419;
		Static100.aClass49_1016 = Static24.aClass49_310;
		Static30.aClass49_380 = Static176.aClass49_1711;
		Static120.aClass49_1162 = Static86.aClass49_1598;
		Static22.aClass49_284 = Static116.aClass49_1121;
		Static125.aClass49_1239 = Static141.aClass49_1357;
		Static95.aClass49_973 = Static171.aClass49_1680;
		Static111.aClass49_1069 = Static1.aClass49_1;
		Static65.aClass49_1746 = Static1.aClass49_2;
		Static80.aClass49_1726 = Static15.aClass49_163;
		Static158.aClass49_1565 = Static38.aClass49_485;
		Static74.aClass49_801 = Static142.aClass49_1365;
		Static13.aClass49_125 = Static114.aClass49_1107;
		Static13.aClass49_152 = Static114.aClass49_1107;
		Static125.aClass49_1247 = Static63.aClass49_688;
		Static164.aClass49_1629 = Static112.aClass49_1080;
		Static123.aClass49_1228 = Static148.aClass49_1421;
		Static13.aClass49_141 = Static114.aClass49_1107;
		Static49.aClass49_557 = Static127.aClass49_1250;
		Static144.aClass49_1387 = Static1.aClass49_3;
		Static175.aClass49_1705 = Static36.aClass49_481;
		Static152.aClass49_1480 = Static68.aClass49_756;
		Static13.aClass49_140 = Static132.aClass49_1292;
		Static120.aClass49_1158 = Static44.aClass49_1023;
		Static131.aClass49_1673 = Static76.aClass49_818;
		Static19.aClass49_256 = Static180.aClass49_1729;
		Static94.aClass49_961 = Static164.aClass49_1628;
		Static139.aClass49_1343 = Static180.aClass49_1731;
		Static13.aClass49_135 = Static114.aClass49_1107;
		Static155.aClass49_1505 = Static49.aClass49_556;
		Static76.aClass49_814 = Static76.aClass49_816;
		Static122.aClass49_1177 = Static19.aClass49_257;
		Static13.aClass49_134 = Static114.aClass49_1107;
		Static13.aClass49_146 = Static8.aClass49_1044;
		Static128.aClass49_1254 = Static136.aClass49_1320;
		Static13.aClass49_145 = Static24.aClass49_311;
		Static46.aClass49_528 = Static79.aClass49_1748;
		Static113.aClass49_1094 = Static51.aClass49_588;
		Static131.aClass49_1670 = Static67.aClass49_741;
		Static185.aClass49_1760 = Static103.aClass49_1025;
		Static13.aClass49_151 = Static114.aClass49_1107;
		Static13.aClass49_124 = Static18.aClass49_239;
		Static22.aClass49_282 = Static78.aClass49_845;
		Static40.aClass49_500 = Static142.aClass49_1362;
		Static13.aClass49_130 = Static115.aClass49_1109;
		Static116.aClass49_1120 = Static82.aClass49_877;
		Static145.aClass49_1401 = Static163.aClass49_367;
		Static171.aClass49_1682 = Static47.aClass49_540;
		Static175.aClass49_1704 = Static131.aClass49_1675;
		Static13.aClass49_148 = Static115.aClass49_1108;
		Static135.aClass49_1317 = Static161.aClass49_1580;
		Static41.aClass49_507 = Static77.aClass49_836;
		Static125.aClass49_1242 = Static135.aClass49_1316;
		Static12.aClass49_116 = Static63.aClass49_691;
		Static84.aClass49_894 = Static159.aClass49_1567;
		Static13.aClass49_126 = Static96.aClass49_980;
		Static81.aClass49_868 = Static99.aClass49_1009;
		Static124.aClass49_1238 = Static41.aClass49_508;
		Static124.aClass49_1237 = Static150.aClass49_1451;
		Static13.aClass49_150 = Static114.aClass49_1107;
		Static9.aClass49_88 = Static185.aClass49_1763;
		Static64.aClass49_709 = Static78.aClass49_839;
		Static13.aClass49_119 = Static114.aClass49_1107;
		Static13.aClass49_136 = Static114.aClass49_1107;
		Static68.aClass49_755 = Static43.aClass49_520;
		Static163.aClass49_366 = Static73.aClass49_798;
		Static165.aClass49_1601 = Static150.aClass49_1453;
		Static122.aClass49_1183 = Static48.aClass49_553;
		Static79.aClass49_1750 = Static151.aClass49_1466;
		Static93.aClass49_950 = Static74.aClass49_804;
		Static125.aClass49_1241 = Static148.aClass49_1419;
		Static108.aClass49_1050 = Static3.aClass49_44;
		Static14.aClass49_160 = Static144.aClass49_1383;
		Static13.aClass49_123 = Static96.aClass49_980;
		Static13.aClass49_138 = Static36.aClass49_480;
		Static67.aClass49_740 = Static158.aClass49_1563;
		Static121.aClass49_1167 = Static72.aClass49_794;
		Static103.aClass49_1028 = Static28.aClass49_358;
		Static93.aClass49_949 = Static129.aClass49_1269;
		Static62.aClass49_687 = Static111.aClass49_1072;
		Static13.aClass49_122 = Static114.aClass49_1107;
		Static122.aClass49_1180 = Static94.aClass49_960;
		Static83.aClass49_883 = Static122.aClass49_1179;
		Static61.aClass49_666 = Static124.aClass49_1232;
		Static31.aClass49_427 = Static128.aClass49_1251;
		Static112.aClass49_1078 = Static114.aClass49_1106;
		Static156.aClass49_1520 = Static27.aClass49_333;
		Static25.aClass49_314 = Static68.aClass49_758;
		Static22.aClass49_286 = Static37.aClass49_482;
		Static21.aClass49_274 = Static20.aClass49_272;
		Static129.aClass49_1277 = Static33.aClass49_445;
		Static45.aClass49_525 = Static28.aClass49_359;
		Static35.aClass49_469 = Static50.aClass49_583;
		Static13.aClass49_149 = Static107.aClass49_1049;
		Static13.aClass49_133 = Static160.aClass49_1579;
		aClass49_1327 = Static156.aClass49_1527;
		Static30.aClass49_379 = Static176.aClass49_1711;
		Static185.aClass49_1758 = Static11.aClass49_102;
		Static51.aClass49_589 = Static176.aClass49_1712;
		Static168.aClass49_1643 = Static83.aClass49_887;
		Static111.aClass49_1071 = Static3.aClass49_45;
		Static64.aClass49_705 = Static141.aClass49_1358;
		Static12.aClass49_113 = Static82.aClass49_876;
		Static98.aClass49_996 = Static61.aClass49_669;
		Static129.aClass49_1265 = Static164.aClass49_1625;
		Static13.aClass49_137 = Static132.aClass49_1292;
		Static30.aClass49_377 = Static27.aClass49_336;
		Static112.aClass49_1077 = Static45.aClass49_527;
		Static53.aClass49_595 = Static144.aClass49_1385;
		Static13.aClass49_143 = Static114.aClass49_1107;
		Static155.aClass49_1507 = Static73.aClass49_800;
		Static13.aClass49_131 = Static88.aClass49_918;
		Static93.aClass49_952 = Static131.aClass49_1674;
		Static171.aClass49_1681 = Static49.aClass49_567;
		Static162.aClass49_1613 = Static143.aClass49_1379;
		Static13.aClass49_128 = Static114.aClass49_1107;
		Static125.aClass49_1248 = Static135.aClass49_1316;
		Static13.aClass49_153 = Static157.aClass49_1543;
		Static82.aClass49_875 = Static93.aClass49_955;
		Static13.aClass49_129 = Static114.aClass49_1107;
		Static40.aClass49_504 = Static45.aClass49_524;
		Static145.aClass49_1403 = Static177.aClass49_1719;
		Static144.aClass49_1388 = Static38.aClass49_483;
		Static125.aClass49_1246 = Static135.aClass49_1316;
		Static55.aClass49_607 = Static15.aClass49_162;
		Static13.aClass49_132 = Static160.aClass49_1579;
		Static174.aClass49_1695 = Static7.aClass49_83;
		Static64.aClass49_696 = Static12.aClass49_114;
		Static157.aClass49_1544 = Static85.aClass49_899;
		Static53.aClass49_598 = Static129.aClass49_1272;
		Static121.aClass49_1173 = Static78.aClass49_844;
		Static48.aClass49_552 = Static111.aClass49_1074;
		Static38.aClass49_486 = Static34.aClass49_465;
		Static62.aClass49_685 = Static50.aClass49_582;
		Static84.aClass49_896 = Static5.aClass49_74;
		Static129.aClass49_1266 = Static113.aClass49_1096;
		Static49.aClass49_568 = Static35.aClass49_466;
		Static17.aClass49_1174 = Static151.aClass49_1465;
		Static13.aClass49_139 = Static114.aClass49_1107;
		Static71.aClass49_775 = Static168.aClass49_1641;
		Static78.aClass49_841 = Static67.aClass49_738;
		Static99.aClass49_1008 = Static162.aClass49_1611;
		Static77.aClass49_835 = Static135.aClass49_1315;
		Static13.aClass49_157 = Static114.aClass49_1107;
		Static157.aClass49_1545 = aClass49_1328;
		Static4.aClass49_53 = Static35.aClass49_468;
		Static4.aClass49_55 = Static151.aClass49_1464;
		Static134.aClass49_1313 = Static159.aClass49_1566;
		Static167.aClass49_1631 = Static6.aClass49_80;
		Static49.aClass49_559 = Static44.aClass49_1022;
		Static19.aClass49_259 = Static75.aClass49_809;
		Static3.aClass49_48 = Static28.aClass49_357;
		Static118.aClass49_1134 = Static132.aClass49_1291;
		Static162.aClass49_1610 = Static25.aClass49_312;
		Static13.aClass49_154 = Static114.aClass49_1107;
		Static185.aClass49_1759 = Static11.aClass49_102;
		Static141.aClass49_1360 = Static125.aClass49_1245;
		Static81.aClass49_869 = Static1.aClass49_4;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	public static void method2291() {
		aClass49_1329 = null;
		aClass49_1327 = null;
		aClass49_1330 = null;
		aClass49_1328 = null;
	}
}
