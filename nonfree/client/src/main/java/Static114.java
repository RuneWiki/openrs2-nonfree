import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Z")
	public static boolean aBoolean125;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[S")
	public static short[] aShortArray32 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1604 = Static107.method1838("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static final int anInt2753 = 5063219;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method1900() {
		aClass28_1604 = null;
		aShortArray32 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static161.method2805(arg3, arg0, arg3 + arg2, arg0 - -arg1);
		Static25.method543();
		Static87.anInt2197++;
		Static127.method2068(true);
		Static136.method2139(true);
		Static127.method2068(false);
		Static136.method2139(false);
		Static74.method1352();
		Static1.method2038();
		@Pc(40) int local40;
		@Pc(76) int local76;
		if (!Static79.aBoolean99) {
			local40 = Static83.anInt2112;
			if (Static175.anInt3891 / 256 > local40) {
				local40 = Static175.anInt3891 / 256;
			}
			if (Static101.aBooleanArray5[4] && local40 < Static130.anIntArray275[4] + 128) {
				local40 = Static130.anIntArray275[4] + 128;
			}
			local76 = Static85.anInt2160 + Static66.anInt1789 & 0x7FF;
			Static158.method2417(Static135.anInt3105, Static179.anInt4040, local76, local40, Static103.method1808(Static103.anInt2568, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635) - 50, 600 - -(local40 * 3));
		}
		if (Static79.aBoolean99) {
			local40 = Static122.method2007();
		} else {
			local40 = Static55.method1003();
		}
		@Pc(111) int local111 = Static40.anInt1057;
		local76 = Static36.anInt977;
		@Pc(120) int local120 = Static21.anInt726;
		@Pc(122) int local122 = Static112.anInt2716;
		@Pc(124) int local124 = Static33.anInt943;
		@Pc(168) int local168;
		for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
			if (Static101.aBooleanArray5[local126]) {
				local168 = (int) ((double) -Static14.anIntArray39[local126] + Math.random() * (double) (Static14.anIntArray39[local126] * 2 + 1) + Math.sin((double) Static40.anIntArray85[local126] / 100.0D * (double) Static28.anIntArray69[local126]) * (double) Static130.anIntArray275[local126]);
				if (local126 == 3) {
					Static33.anInt943 = Static33.anInt943 + local168 & 0x7FF;
				}
				if (local126 == 2) {
					Static21.anInt726 += local168;
				}
				if (local126 == 4) {
					Static112.anInt2716 += local168;
					if (Static112.anInt2716 < 128) {
						Static112.anInt2716 = 128;
					}
					if (Static112.anInt2716 > 383) {
						Static112.anInt2716 = 383;
					}
				}
				if (local126 == 1) {
					Static40.anInt1057 += local168;
				}
				if (local126 == 0) {
					Static36.anInt977 += local168;
				}
			}
		}
		local168 = Static93.anInt2353;
		@Pc(233) int local233 = Static169.anInt3798;
		if (arg3 <= local168 && arg2 + arg3 > local168 && arg0 <= local233 && local233 < arg1 + arg0) {
			Static37.anInt1777 = 0;
			Static37.anInt1779 = Static93.anInt2353 - arg3;
			Static37.aBoolean89 = true;
			Static37.anInt1778 = Static169.anInt3798 - arg0;
		} else {
			Static37.aBoolean89 = false;
			Static37.anInt1777 = 0;
		}
		Static177.method2757();
		Static161.method2809(arg3, arg0, arg2, arg1, 0);
		Static177.method2757();
		Static120.method1977(Static36.anInt977, Static40.anInt1057, Static21.anInt726, Static112.anInt2716, Static33.anInt943, local40);
		Static177.method2757();
		Static109.method1857();
		Static28.method588(arg0, arg2, arg3, arg1);
		Static93.method1628(arg0, arg3);
		((Class84) Static25.anInterface2_1).method2666(Static119.anInt2853);
		Static179.method2882(arg3, arg1, arg0, arg2);
		Static40.anInt1057 = local111;
		Static33.anInt943 = local124;
		Static112.anInt2716 = local122;
		Static21.anInt726 = local120;
		Static36.anInt977 = local76;
		if (Static147.aBoolean150 && Static42.method742() == 0) {
			Static147.aBoolean150 = false;
		}
		if (Static147.aBoolean150) {
			Static161.method2809(arg3, arg0, arg2, arg1, 0);
			Static59.method1061(false, Static11.aClass28_367);
		}
		if (!Static147.aBoolean150 && !Static169.aBoolean165 && local168 >= arg3 && arg2 + arg3 > local168 && arg0 <= local233 && local233 < arg0 + arg1) {
			Static173.method2698(arg3, local168, local233, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method1902() {
		Static43.aClass28_710 = Static137.aClass28_1830;
		Static31.aClass28_2413 = Static153.aClass28_2008;
		Static140.aClass28_1896 = Static153.aClass28_2008;
		Static154.aClass28_2017 = aClass28_1604;
		Static19.aClass28_543 = Static29.aClass28_541;
		Static44.aClass28_718 = Static71.aClass28_1110;
		Static54.aClass28_819 = Static45.aClass28_747;
		Static69.aClass28_1086 = Static158.aClass28_2052;
		Static148.aClass28_1968 = Static117.aClass28_1661;
		Static174.aClass28_2309 = Static73.aClass28_1136;
		Static55.aClass28_831 = Static113.aClass28_1598;
		Static31.aClass28_2383 = Static73.aClass28_1142;
		Static162.aClass28_2113 = Static101.aClass28_312;
		Static176.aClass28_2325 = Static11.aClass28_364;
		Static31.aClass28_2397 = Static153.aClass28_2008;
		Static31.aClass28_2404 = Static153.aClass28_2008;
		Static72.aClass28_1112 = Static123.aClass28_1715;
		Static158.aClass28_2054 = Static176.aClass28_2330;
		Static38.aClass28_639 = Static91.aClass28_1390;
		Static113.aClass28_1600 = Static48.aClass28_767;
		Static31.aClass28_2391 = Static153.aClass28_2008;
		Static69.aClass28_1085 = Static158.aClass28_2051;
		Static132.aClass28_1821 = Static57.aClass28_856;
		Static4.aClass28_62 = Static176.aClass28_2328;
		Static67.aClass28_1050 = Static66.aClass28_1040;
		Static31.aClass28_2392 = Static153.aClass28_2008;
		Static12.aClass28_379 = Static51.aClass28_1145;
		Static1.aClass28_1741 = Static109.aClass28_1564;
		Static9.aClass28_331 = Static41.aClass28_699;
		Static168.aClass28_2244 = Static102.aClass28_1467;
		Static49.aClass28_792 = Static113.aClass28_1602;
		Static49.aClass28_794 = Static129.aClass28_1782;
		Static34.aClass28_566 = Static104.aClass28_1532;
		Static31.aClass28_2380 = Static153.aClass28_2008;
		Static31.aClass28_2389 = Static82.aClass28_1238;
		Static21.aClass28_484 = Static13.aClass28_405;
		Static31.aClass28_2420 = Static153.aClass28_2008;
		Static115.aClass28_1626 = Static179.aClass28_2427;
		Static17.aClass28_423 = Static111.aClass28_1584;
		Static96.aClass28_1420 = Static111.aClass28_1583;
		Static110.aClass28_1579 = Static155.aClass28_2039;
		Static66.aClass28_1042 = Static146.aClass28_1935;
		Static151.aClass28_1983 = Static142.aClass28_1909;
		Static31.aClass28_2395 = Static43.aClass28_714;
		Static31.aClass28_2396 = Static153.aClass28_2008;
		Static27.aClass28_1660 = Static107.aClass28_1542;
		Static31.aClass28_2409 = Static166.aClass28_2198;
		Static128.aClass28_1771 = Static88.aClass28_1352;
		Static107.aClass28_1543 = Static66.aClass28_1037;
		Static155.aClass28_2041 = Static172.aClass28_2276;
		Static120.aClass28_1679 = Static80.aClass28_1219;
		Static117.aClass28_1663 = Static78.aClass28_1185;
		Static14.aClass28_410 = Static156.aClass28_2045;
		Static23.aClass28_497 = Static109.aClass28_1568;
		Static31.aClass28_2406 = Static153.aClass28_2008;
		Static140.aClass28_1897 = Static51.aClass28_1144;
		Static155.aClass28_2044 = Static168.aClass28_2243;
		Static11.aClass28_367 = Static111.aClass28_1585;
		Static118.aClass28_2378 = Static103.aClass28_1480;
		Static31.aClass28_2414 = Static160.aClass28_2055;
		Static43.aClass28_712 = Static81.aClass28_1464;
		Static64.aClass28_984 = Static12.aClass28_380;
		Static122.aClass28_1714 = Static116.aClass28_1652;
		Static129.aClass28_1780 = Static159.aClass28_2431;
		Static130.aClass28_1786 = Static99.aClass28_1453;
		Static31.aClass28_2416 = Static153.aClass28_2008;
		Static31.aClass28_2394 = Static153.aClass28_2008;
		Static31.aClass28_2415 = Static153.aClass28_2008;
		Static10.aClass28_334 = Static43.aClass28_714;
		Static76.aClass28_1160 = Static108.aClass28_1557;
		Static139.aClass28_1867 = Static92.aClass28_1391;
		Static88.aClass28_1353 = Static108.aClass28_1556;
		Static120.aClass28_1678 = Static80.aClass28_1219;
		Static105.aClass28_1538 = Static12.aClass28_377;
		Static124.aClass28_1722 = Static171.aClass28_2246;
		Static116.aClass28_1656 = Static117.aClass28_1662;
		Static31.aClass28_2417 = Static66.aClass28_1038;
		Static80.aClass28_1218 = Static166.aClass28_2199;
		Static87.aClass28_1346 = Static128.aClass28_1773;
		Static10.aClass28_341 = Static148.aClass28_1970;
		Static83.aClass28_1246 = Static9.aClass28_326;
		Static129.aClass28_1783 = Static159.aClass28_2431;
		Static33.aClass28_551 = Static6.aClass28_266;
		Static28.aClass28_538 = Static28.aClass28_537;
		Static109.aClass28_1562 = Static125.aClass28_1740;
		Static69.aClass28_1089 = Static163.aClass28_2138;
		Static34.aClass28_567 = Static82.aClass28_1234;
		Static125.aClass28_1736 = Static154.aClass28_2015;
		Static109.aClass28_1563 = Static173.aClass28_2284;
		Static80.aClass28_1221 = Static73.aClass28_1138;
		Static96.aClass28_1421 = Static127.aClass28_1770;
		Static82.aClass28_1233 = Static82.aClass28_1239;
		Static71.aClass28_1109 = Static181.aClass28_2451;
		Static31.aClass28_2403 = Static153.aClass28_2008;
		Static81.aClass28_1465 = Static112.aClass28_1591;
		Static130.aClass28_1793 = Static174.aClass28_2307;
		Static30.aClass28_548 = Static14.aClass28_408;
		Static22.aClass28_487 = Static33.aClass28_554;
		Static115.aClass28_1628 = Static179.aClass28_2427;
		Static133.aClass28_1823 = Static47.aClass28_946;
		Static31.aClass28_2405 = Static153.aClass28_2008;
		Static98.aClass28_1422 = Static120.aClass28_1681;
		Static61.aClass28_956 = Static140.aClass28_1895;
		Static157.aClass28_2048 = Static104.aClass28_1535;
		Static122.aClass28_1713 = Static42.aClass28_700;
		Static71.aClass28_1107 = Static181.aClass28_2451;
		Static172.aClass28_2279 = Static15.aClass28_420;
		Static77.aClass28_1163 = Static52.aClass28_810;
		Static59.aClass28_884 = Static164.aClass28_2160;
		Static22.aClass28_491 = Static177.aClass28_2333;
		Static31.aClass28_2387 = Static49.aClass28_795;
		Static31.aClass28_2390 = Static96.aClass28_1416;
		Static40.aClass28_646 = Static51.aClass28_1147;
		Static31.aClass28_2388 = Static59.aClass28_889;
		Static75.aClass28_1157 = Static162.aClass28_2114;
		Static95.aClass28_1404 = Static108.aClass28_1554;
		Static31.aClass28_2410 = Static36.aClass28_578;
		Static122.aClass28_1706 = Static122.aClass28_1711;
		Static31.aClass28_2407 = Static165.aClass28_2186;
		Static79.aClass28_1214 = Static72.aClass28_1114;
		Static10.aClass28_340 = Static43.aClass28_714;
		Static31.aClass28_2386 = Static29.aClass28_540;
		Static63.aClass28_980 = Static84.aClass28_1253;
		Static150.aClass28_1982 = Static28.aClass28_536;
		Static31.aClass28_2401 = Static153.aClass28_2008;
		Static159.aClass28_2433 = Static14.aClass28_412;
		Static59.aClass28_888 = Static63.aClass28_981;
		Static81.aClass28_1461 = Static151.aClass28_1985;
		Static170.aClass28_2448 = Static38.aClass28_642;
		Static31.aClass28_2381 = Static153.aClass28_2008;
		Static55.aClass28_829 = Static113.aClass28_1597;
		Static180.aClass28_2424 = Static121.aClass28_1704;
		Static113.aClass28_1601 = Static47.aClass28_948;
		Static5.aClass28_90 = Static150.aClass28_1979;
		Static10.aClass28_332 = Static116.aClass28_1654;
		Static47.aClass28_949 = Static135.aClass28_1825;
		Static170.aClass28_2442 = Static128.aClass28_1772;
		Static73.aClass28_1143 = Static116.aClass28_1653;
		Static3.aClass28_1415 = Static172.aClass28_2281;
		Static31.aClass28_2384 = Static153.aClass28_2008;
		Static57.aClass28_859 = Static109.aClass28_1567;
		Static90.aClass28_1388 = Static178.aClass28_2356;
		Static140.aClass28_1893 = Static3.aClass28_1414;
		Static75.aClass28_1156 = Static150.aClass28_1978;
		Static172.aClass28_2278 = Static132.aClass28_1818;
		Static107.aClass28_1541 = Static66.aClass28_1037;
		Static140.aClass28_1889 = Static44.aClass28_721;
		Static31.aClass28_2402 = Static59.aClass28_889;
		Static13.aClass28_404 = Static36.aClass28_575;
		Static125.aClass28_1734 = Static9.aClass28_329;
		Static180.aClass28_2425 = Static152.aClass28_2007;
		Static22.aClass28_488 = Static58.aClass28_861;
		Static130.aClass28_1791 = Static44.aClass28_716;
		Static75.aClass28_1155 = Static112.aClass28_1590;
		Static126.aClass28_1745 = Static148.aClass28_1966;
		Static118.aClass28_2376 = Static176.aClass28_2327;
		Static145.aClass28_1933 = Static44.aClass28_717;
		Static31.aClass28_2418 = Static153.aClass28_2008;
		Static31.aClass28_2399 = Static153.aClass28_2008;
		Static66.aClass28_1044 = Static5.aClass28_89;
		Static36.aClass28_574 = Static19.aClass28_545;
		Static179.aClass28_2428 = Static30.aClass28_549;
		Static123.aClass28_1718 = Static92.aClass28_1392;
		Static150.aClass28_1980 = Static5.aClass28_87;
		Static119.aClass28_1671 = Static9.aClass28_330;
		Static10.aClass28_337 = Static116.aClass28_1654;
		Static164.aClass28_2164 = Static29.aClass28_542;
		Static10.aClass28_333 = Static43.aClass28_714;
		Static135.aClass28_1827 = Static1.aClass28_1742;
		Static84.aClass28_1256 = Static79.aClass28_1213;
		Static164.aClass28_2163 = Static130.aClass28_1789;
		Static23.aClass28_495 = Static38.aClass28_644;
		Static89.aClass28_1362 = Static22.aClass28_492;
		Static177.aClass28_2332 = Static126.aClass28_1746;
		Static171.aClass28_2249 = Static84.aClass28_1254;
		Static51.aClass28_1148 = Static173.aClass28_2285;
		Static84.aClass28_1252 = Static116.aClass28_1650;
		Static98.aClass28_1426 = Static31.aClass28_2393;
		Static85.aClass28_1280 = Static83.aClass28_1245;
		Static10.aClass28_338 = Static150.aClass28_1974;
		Static31.aClass28_2421 = Static54.aClass28_818;
		Static31.aClass28_2400 = Static29.aClass28_540;
		Static28.aClass28_533 = Static104.aClass28_1533;
		Static79.aClass28_1211 = Static171.aClass28_2251;
		Static89.aClass28_1364 = Static9.aClass28_327;
		Static12.aClass28_372 = Static171.aClass28_2252;
		Static14.aClass28_409 = Static23.aClass28_493;
		Static162.aClass28_2116 = Static138.aClass28_1853;
		Static31.aClass28_2408 = Static153.aClass28_2008;
		Static117.aClass28_1665 = Static78.aClass28_1185;
		Static171.aClass28_2247 = Static91.aClass28_1389;
		Static160.aClass28_2057 = Static73.aClass28_1140;
		Static95.aClass28_1403 = Static9.aClass28_324;
		Static31.aClass28_2385 = Static153.aClass28_2008;
		Static12.aClass28_373 = Static33.aClass28_553;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method1903() {
		for (@Pc(15) Class2_Sub6 local15 = (Class2_Sub6) Static80.aClass65_6.method2115(); local15 != null; local15 = (Class2_Sub6) Static80.aClass65_6.method2117()) {
			if (local15.aClass2_Sub8_Sub2_2 != null) {
				Static113.aClass2_Sub8_Sub3_1.method1737(local15.aClass2_Sub8_Sub2_2);
				local15.aClass2_Sub8_Sub2_2 = null;
			}
			if (local15.aClass2_Sub8_Sub2_1 != null) {
				Static113.aClass2_Sub8_Sub3_1.method1737(local15.aClass2_Sub8_Sub2_1);
				local15.aClass2_Sub8_Sub2_1 = null;
			}
		}
		Static80.aClass65_6.method2113();
	}
}
