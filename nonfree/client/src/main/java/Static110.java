import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 aClass4_Sub2_Sub3_Sub1_7;

	@OriginalMember(owner = "client!t", name = "qb", descriptor = "Lclient!qe;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1450 = Static28.method504("<col=ffff00>");

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Lclient!ae;I)V")
	public static void method1947(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		if (Static71.anInt1738 == arg0.anInt2687 || arg0.anInt2678 == -1 || arg0.anInt2659 != 0 || arg0.anInt2646 + 1 > Static116.method2017(arg0.anInt2678).anIntArray35[arg0.anInt2671]) {
			@Pc(45) int local45 = arg0.anInt2653 * 64 + arg0.anInt2668 * 128;
			@Pc(52) int local52 = arg0.anInt2687 - arg0.anInt2654;
			@Pc(58) int local58 = Static71.anInt1738 - arg0.anInt2654;
			@Pc(68) int local68 = arg0.anInt2653 * 64 + arg0.anInt2675 * 128;
			arg0.anInt2643 = ((local52 - local58) * local45 + local58 * local68) / local52;
			@Pc(92) int local92 = arg0.anInt2653 * 64 + arg0.anInt2650 * 128;
			@Pc(103) int local103 = arg0.anInt2652 * 128 + arg0.anInt2653 * 64;
			arg0.anInt2641 = (local58 * local103 + local92 * (local52 - local58)) / local52;
		}
		if (arg0.anInt2666 == 0) {
			arg0.anInt2644 = 1024;
		}
		if (arg0.anInt2666 == 1) {
			arg0.anInt2644 = 1536;
		}
		arg0.anInt2648 = 0;
		if (arg0.anInt2666 == 2) {
			arg0.anInt2644 = 0;
		}
		if (arg0.anInt2666 == 3) {
			arg0.anInt2644 = 512;
		}
		arg0.anInt2670 = arg0.anInt2644;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III[B)I")
	public static int method1948(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg1; local7 < arg0; local7++) {
			local5 = local5 >>> 8 ^ Class20.anIntArray79[(local5 ^ arg2[local7]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public static void method1949() {
		aClass39_1450 = null;
		aClass30_1 = null;
		aClass4_Sub2_Sub3_Sub1_7 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!ja;Lclient!ja;IIII)V")
	public static void method1950(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static101.aBoolean122 || Static105.anInt2033 >= 500) {
			return;
		}
		Static47.aClass39Array8[Static105.anInt2033] = arg1;
		Static52.aClass39Array11[Static105.anInt2033] = arg0;
		Static125.anIntArray358[Static105.anInt2033] = arg5;
		Static104.anIntArray287[Static105.anInt2033] = arg3;
		Static10.anIntArray36[Static105.anInt2033] = arg4;
		Static49.anIntArray136[Static105.anInt2033] = arg2;
		Static105.anInt2033++;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)V")
	public static void method1952() {
		@Pc(1) Class66 local1 = Static62.aClass66_1;
		synchronized (Static62.aClass66_1) {
			Static62.anInt1639 = Static71.anInt1739;
			Static88.anInt2198 = Static128.anInt3141;
			Static73.anInt1769 = Static9.anInt290;
			Static62.anInt1637 = Static27.anInt738;
			Static27.anInt741 = Static63.anInt1642;
			Static1.anInt9 = Static13.anInt356;
			Static38.aLong40 = Static131.aLong158;
			Static27.anInt738 = 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static105.anInt2033 < 2 && Static59.anInt1555 == 0 && !Static78.aBoolean101) {
			return;
		}
		@Pc(30) Class39 local30;
		if (Static59.anInt1555 == 1 && Static105.anInt2033 < 2) {
			local30 = Static62.method1123(new Class39[] { Static31.aClass39_428, Static123.aClass39_1633, Static52.aClass39_764, Static26.aClass39_377 });
		} else if (Static78.aBoolean101 && Static105.anInt2033 < 2) {
			local30 = Static62.method1123(new Class39[] { Static104.aClass39_1338, Static123.aClass39_1633, Static24.aClass39_299, Static26.aClass39_377 });
		} else {
			local30 = Static84.method1519(Static105.anInt2033 - 1);
		}
		if (Static105.anInt2033 > 2) {
			local30 = Static62.method1123(new Class39[] { local30, Static60.aClass39_854, Static29.method510(Static105.anInt2033 - 2), Static75.aClass39_943 });
		}
		Static62.aClass4_Sub2_Sub3_Sub3_3.method1273(local30, arg1 + 4, arg0 + 15, Static71.anInt1738 / 1000);
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(I)V")
	public static void method1956() {
		Static10.aClass39_234 = Static67.aClass39_894;
		Static80.aClass39_1014 = Static127.aClass39_1755;
		Static23.aClass39_364 = Static116.aClass39_1513;
		Static119.aClass39_1749 = Static13.aClass39_244;
		Static75.aClass39_946 = Static87.aClass39_1121;
		Static106.aClass39_1349 = Static68.aClass39_896;
		Static38.aClass39_502 = Static28.aClass39_397;
		Static19.aClass39_307 = Static44.aClass39_670;
		Static46.aClass39_707 = Static23.aClass39_370;
		Static48.aClass39_728 = Static91.aClass39_1119;
		Static93.aClass39_1797 = Static43.aClass39_662;
		Static23.aClass39_362 = Static114.aClass39_1485;
		Static25.aClass39_1787 = Static80.aClass39_1012;
		Static119.aClass39_1728 = Static54.aClass39_793;
		Static102.aClass39_1325 = Static36.aClass39_463;
		Static8.aClass39_205 = Static2.aClass39_10;
		Static97.aClass39_1280 = Static50.aClass39_748;
		Static99.aClass39_1288 = Static109.aClass39_1432;
		Static109.aClass39_1431 = Static22.aClass39_354;
		Static119.aClass39_1748 = Static65.aClass39_882;
		Static47.aClass39_710 = Static5.aClass39_1412;
		Static23.aClass39_363 = Static114.aClass39_1488;
		Static109.aClass39_1433 = Static32.aClass39_434;
		Static18.aClass39_285 = Static126.aClass39_1780;
		Static38.aClass39_486 = Static91.aClass39_1116;
		Static114.aClass39_1489 = Static126.aClass39_1778;
		Static119.aClass39_1743 = Static33.aClass39_450;
		Static119.aClass39_1729 = Static65.aClass39_882;
		Static15.aClass39_257 = Static43.aClass39_664;
		Static129.aClass39_1771 = Static94.aClass39_1140;
		Static113.aClass39_1479 = Static99.aClass39_1287;
		Static119.aClass39_1711 = Static72.aClass39_422;
		Static58.aClass39_829 = Static121.aClass39_1607;
		Static101.aClass39_1299 = Static88.aClass39_1113;
		Static19.aClass39_306 = Static35.aClass39_461;
		Static63.aClass39_870 = Static2.aClass39_12;
		Static102.aClass39_1327 = Static29.aClass39_405;
		Static73.aClass39_930 = Static7.aClass39_204;
		Static119.aClass39_1738 = Static65.aClass39_882;
		Static115.aClass39_1508 = Static53.aClass39_788;
		Static32.aClass39_443 = Static88.aClass39_1112;
		Static29.aClass39_409 = Static29.aClass39_408;
		Static119.aClass39_1736 = Static35.aClass39_461;
		Static119.aClass39_1708 = Static65.aClass39_882;
		Static32.aClass39_436 = Static103.aClass39_1333;
		Static126.aClass39_1776 = Static53.aClass39_789;
		Static119.aClass39_1739 = Static60.aClass39_852;
		Static119.aClass39_1744 = Static65.aClass39_882;
		Static19.aClass39_310 = Static59.aClass39_839;
		Static80.aClass39_1016 = Static30.aClass39_418;
		Static19.aClass39_305 = Static35.aClass39_461;
		Static119.aClass39_1707 = Static65.aClass39_882;
		Static33.aClass39_445 = Static26.aClass39_375;
		Static131.aClass39_1802 = Static63.aClass39_865;
		Static45.aClass39_697 = Static26.aClass39_379;
		Static19.aClass39_304 = Static35.aClass39_461;
		Static54.aClass39_791 = Static101.aClass39_1304;
		Static27.aClass39_394 = Static22.aClass39_356;
		Static14.aClass39_249 = Static46.aClass39_705;
		Static119.aClass39_1730 = Static22.aClass39_357;
		Static11.aClass39_241 = Static91.aClass39_1115;
		Static119.aClass39_1747 = Static65.aClass39_882;
		Static121.aClass39_1610 = Static129.aClass39_1769;
		Static69.aClass39_908 = Static45.aClass39_691;
		Static10.aClass39_235 = Static3.aClass39_14;
		Static26.aClass39_373 = Static38.aClass39_500;
		Static92.aClass39_389 = Static131.aClass39_1801;
		Static73.aClass39_927 = Static101.aClass39_1303;
		Static1.aClass39_2 = Static114.aClass39_1487;
		Static106.aClass39_1346 = Static58.aClass39_834;
		Static24.aClass39_296 = Static46.aClass39_701;
		Static45.aClass39_689 = Static88.aClass39_1111;
		Static75.aClass39_947 = Static33.aClass39_449;
		Static23.aClass39_366 = Static114.aClass39_1488;
		Static40.aClass39_578 = Static64.aClass39_880;
		Static31.aClass39_431 = Static25.aClass39_1783;
		Static98.aClass39_584 = Static68.aClass39_900;
		Static77.aClass39_990 = Static67.aClass39_892;
		Static62.aClass39_862 = Static129.aClass39_1770;
		Static117.aClass39_1541 = Static26.aClass39_380;
		Static10.aClass39_227 = Static48.aClass39_729;
		Static119.aClass39_1715 = Static65.aClass39_882;
		Static1.aClass39_3 = Static96.aClass39_1209;
		Static126.aClass39_1779 = Static53.aClass39_789;
		Static119.aClass39_1733 = Static108.aClass39_1417;
		Static80.aClass39_1023 = Static30.aClass39_418;
		Static119.aClass39_1745 = Static65.aClass39_882;
		Static93.aClass39_1799 = Static127.aClass39_1756;
		Static94.aClass39_1138 = Static82.aClass39_1042;
		Static117.aClass39_1537 = Static106.aClass39_1347;
		Static35.aClass39_459 = Static23.aClass39_361;
		Static123.aClass39_1632 = Static88.aClass39_1114;
		Static55.aClass39_806 = Static60.aClass39_856;
		Static131.aClass39_1805 = Static101.aClass39_1302;
		Static106.aClass39_1351 = Static67.aClass39_895;
		Static117.aClass39_1543 = Static26.aClass39_380;
		Static63.aClass39_866 = Static14.aClass39_247;
		Static11.aClass39_243 = Static53.aClass39_786;
		Static28.aClass39_400 = Static120.aClass39_1546;
		Static64.aClass39_881 = Static102.aClass39_1324;
		Static44.aClass39_674 = Static6.aClass39_178;
		Static123.aClass39_1633 = Static21.aClass39_353;
		Static38.aClass39_499 = Static35.aClass39_460;
		Static93.aClass39_1793 = Static96.aClass39_1210;
		Static119.aClass39_1722 = Static41.aClass39_588;
		Static72.aClass39_425 = Static80.aClass39_1017;
		Static119.aClass39_1725 = Static113.aClass39_1478;
		Static69.aClass39_914 = Static35.aClass39_455;
		Static31.aClass39_428 = Static45.aClass39_694;
		Static28.aClass39_401 = Static119.aClass39_1723;
		Static55.aClass39_813 = Static46.aClass39_702;
		Static19.aClass39_311 = Static7.aClass39_200;
		Static36.aClass39_462 = Static2.aClass39_7;
		Static4.aClass39_42 = Static128.aClass39_1762;
		Static9.aClass39_210 = Static52.aClass39_763;
		Static103.aClass39_1329 = Static119.aClass39_1741;
		Static39.aClass39_511 = Static46.aClass39_703;
		Static40.aClass39_574 = Static91.aClass39_1117;
		Static113.aClass39_1480 = Static97.aClass39_1275;
		Static46.aClass39_708 = Static9.aClass39_211;
		Static78.aClass39_996 = Static35.aClass39_457;
		Static119.aClass39_1716 = Static65.aClass39_882;
		Static119.aClass39_1712 = Static114.aClass39_1491;
		Static58.aClass39_835 = Static73.aClass39_928;
		Static116.aClass39_1519 = Static82.aClass39_1040;
		Static93.aClass39_1794 = Static30.aClass39_420;
		Static103.aClass39_1334 = Static32.aClass39_442;
		Static23.aClass39_369 = Static54.aClass39_792;
		Static92.aClass39_388 = Static14.aClass39_253;
		Static119.aClass39_1737 = Static33.aClass39_450;
		Static5.aClass39_1414 = Static28.aClass39_398;
		Static31.aClass39_430 = Static20.aClass39_334;
		Static103.aClass39_1336 = Static36.aClass39_464;
		Static55.aClass39_804 = Static97.aClass39_1274;
		Static22.aClass39_355 = Static100.aClass39_1298;
		Static41.aClass39_586 = Static26.aClass39_378;
		Static19.aClass39_308 = Static1.aClass39_6;
		Static119.aClass39_1720 = Static65.aClass39_882;
		Static111.aClass39_1462 = Static80.aClass39_1020;
		Static85.aClass39_1085 = Static68.aClass39_899;
		Static119.aClass39_1709 = Static65.aClass39_882;
		Static32.aClass39_438 = Static39.aClass39_516;
		Static122.aClass39_1619 = Static105.aClass39_1063;
		Static80.aClass39_1024 = Static128.aClass39_1764;
		Static128.aClass39_1759 = Static2.aClass39_13;
		Static32.aClass39_441 = Static11.aClass39_240;
		Static116.aClass39_1518 = Static73.aClass39_931;
		Static128.aClass39_1761 = Static91.aClass39_1118;
		Static39.aClass39_515 = Static115.aClass39_1507;
		Static51.aClass39_1282 = Static25.aClass39_1784;
		Static99.aClass39_1286 = Static44.aClass39_671;
		Static50.aClass39_746 = Static55.aClass39_805;
		Static28.aClass39_396 = Static1.aClass39_4;
		Static36.aClass39_467 = Static101.aClass39_1306;
		Static119.aClass39_1742 = Static65.aClass39_882;
		Static113.aClass39_1475 = Static20.aClass39_336;
		Static111.aClass39_1458 = Static108.aClass39_1416;
		Static122.aClass39_1622 = Static23.aClass39_367;
		Static18.aClass39_287 = Static116.aClass39_1517;
		Static125.aClass39_1751 = Static77.aClass39_989;
		Static94.aClass39_1139 = Static126.aClass39_1774;
		Static119.aClass39_1727 = Static65.aClass39_882;
		Static119.aClass39_1717 = Static65.aClass39_882;
		Static15.aClass39_256 = Static41.aClass39_589;
		Static108.aClass39_1421 = Static2.aClass39_8;
		Static122.aClass39_1623 = Static99.aClass39_1292;
		Static111.aClass39_1460 = Static65.aClass39_882;
		Static3.aClass39_15 = Static83.aClass39_1065;
		Static119.aClass39_1731 = Static72.aClass39_422;
		Static60.aClass39_851 = Static105.aClass39_1062;
		Static119.aClass39_1724 = Static65.aClass39_882;
		Static32.aClass39_437 = Static88.aClass39_1112;
		Static25.aClass39_1786 = Static80.aClass39_1012;
		Static19.aClass39_302 = Static7.aClass39_200;
		Static119.aClass39_1746 = Static65.aClass39_882;
		Static119.aClass39_1721 = Static65.aClass39_882;
		Static45.aClass39_690 = Static9.aClass39_207;
		Static75.aClass39_943 = Static6.aClass39_181;
		Static45.aClass39_693 = Static97.aClass39_1277;
		Static58.aClass39_837 = Static3.aClass39_18;
		Static119.aClass39_1719 = Static65.aClass39_882;
		Static62.aClass39_858 = Static84.aClass39_1082;
		Static10.aClass39_233 = Static75.aClass39_942;
		Static68.aClass39_897 = Static82.aClass39_1039;
		Static120.aClass39_1548 = Static9.aClass39_208;
		Static119.aClass39_1714 = Static65.aClass39_882;
		Static13.aClass39_245 = Static64.aClass39_878;
		Static43.aClass39_663 = Static113.aClass39_1481;
		Static119.aClass39_1726 = Static2.aClass39_9;
		Static130.aClass39_1792 = Static130.aClass39_1791;
		Static7.aClass39_202 = Static24.aClass39_297;
		Static100.aClass39_1295 = Static21.aClass39_351;
		Static119.aClass39_1734 = Static65.aClass39_882;
		Static60.aClass39_853 = Static83.aClass39_1064;
		Static119.aClass39_1732 = Static128.aClass39_1765;
		Static108.aClass39_1419 = Static127.aClass39_1753;
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "(I)V")
	public static void method1957() {
		Static5.aClass12_72.method233();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1959(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
