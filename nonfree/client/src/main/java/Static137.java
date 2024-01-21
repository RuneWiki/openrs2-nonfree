import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
	public static int anInt3502;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
	public static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public static int anInt3499 = 0;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1309 = Static169.method2903("Loaded input handler");

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1310 = aClass23_1309;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1311 = Static169.method2903("<img=0>");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method2394() {
		aClass23_1310 = null;
		aClass23_1311 = null;
		aClass23_1309 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/util/Random;I)I")
	public static int method2402(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static73.method1338(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(44) int local44;
			do {
				local44 = arg0.nextInt();
			} while (local36 <= local44);
			return Static16.method283(arg1, local44);
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public static void method2409() {
		Static96.aClass23_954 = Static124.aClass23_1202;
		Static101.aClass23_996 = Static181.aClass23_1659;
		Static20.aClass23_242 = Static52.aClass23_717;
		Static171.aClass23_1589 = Static179.aClass23_1636;
		Static167.aClass23_1568 = Static67.aClass23_648;
		Static10.aClass23_136 = Static34.aClass23_376;
		Static68.aClass23_658 = Static115.aClass23_1137;
		Static169.aClass23_1573 = Static8.aClass23_120;
		Static13.aClass23_172 = Static101.aClass23_998;
		Static99.aClass23_977 = Static109.aClass23_1070;
		Static149.aClass23_1416 = Static38.aClass23_403;
		Static30.aClass23_1077 = Static12.aClass23_155;
		Static153.aClass23_1445 = Static68.aClass23_660;
		Static105.aClass23_1040 = Static119.aClass23_1165;
		Static33.aClass23_331 = Static55.aClass23_553;
		Static29.aClass23_303 = Static123.aClass23_1192;
		Static60.aClass23_1663 = Static133.aClass23_1274;
		Static36.aClass23_383 = Static171.aClass23_1587;
		Static80.aClass23_787 = Static43.aClass23_442;
		Static40.aClass23_415 = Static155.aClass23_1459;
		Static139.aClass23_1335 = Static70.aClass23_697;
		Static171.aClass23_1586 = Static182.aClass23_1679;
		Static88.aClass23_872 = Static98.aClass23_966;
		Static124.aClass23_1200 = Static158.aClass23_1483;
		Static171.aClass23_1584 = Static138.aClass23_1322;
		Static25.aClass23_273 = Static18.aClass23_218;
		Static54.aClass23_548 = Static29.aClass23_307;
		Static139.aClass23_1341 = Static71.aClass23_713;
		Static86.aClass23_855 = Static61.aClass23_607;
		Static132.aClass23_1515 = Static12.aClass23_158;
		Static99.aClass23_972 = Static46.aClass23_1656;
		Static33.aClass23_334 = Static55.aClass23_553;
		Static182.aClass23_1676 = Static43.aClass23_444;
		Static99.aClass23_974 = Static109.aClass23_1070;
		Static99.aClass23_973 = Static46.aClass23_1656;
		Static25.aClass23_278 = Static18.aClass23_218;
		Static127.aClass23_1251 = Static181.aClass23_1658;
		Static142.aClass23_1366 = Static8.aClass23_119;
		Static84.aClass23_1666 = Static88.aClass23_873;
		Static80.aClass23_789 = Static6.aClass23_111;
		Static99.aClass23_975 = Static46.aClass23_1656;
		Static135.aClass23_1278 = Static126.aClass23_1238;
		Static24.aClass23_261 = Static154.aClass23_1456;
		Static25.aClass23_280 = Static4.aClass23_104;
		Static77.aClass23_771 = Static182.aClass23_1678;
		Static162.aClass23_1528 = Static48.aClass23_493;
		Static65.aClass23_1385 = Static1.aClass23_69;
		Static38.aClass23_401 = Static66.aClass23_646;
		Static103.aClass23_1015 = Static55.aClass23_551;
		Static33.aClass23_355 = Static55.aClass23_553;
		Static33.aClass23_346 = Static55.aClass23_553;
		Static34.aClass23_373 = Static102.aClass23_1006;
		Static51.aClass23_534 = Static87.aClass23_371;
		Static33.aClass23_340 = Static55.aClass23_553;
		Static46.aClass23_1655 = Static182.aClass23_1675;
		Static13.aClass23_164 = Static34.aClass23_374;
		Static153.aClass23_1438 = Static84.aClass23_1671;
		Static13.aClass23_173 = Static36.aClass23_382;
		Static33.aClass23_358 = Static55.aClass23_553;
		Static1.aClass23_73 = Static41.aClass23_434;
		Static40.aClass23_412 = Static98.aClass23_965;
		Static7.aClass23_114 = Static47.aClass23_484;
		Static157.aClass23_1481 = Static86.aClass23_856;
		Static58.aClass23_601 = Static139.aClass23_1339;
		Static55.aClass23_554 = Static4.aClass23_106;
		Static36.aClass23_385 = Static13.aClass23_168;
		Static142.aClass23_1363 = Static22.aClass23_249;
		Static110.aClass23_1074 = Static67.aClass23_647;
		Static152.aClass23_1329 = Static84.aClass23_1670;
		Static33.aClass23_351 = Static155.aClass23_1461;
		Static33.aClass23_333 = Static57.aClass23_593;
		Static144.aClass23_1381 = Static133.aClass23_1275;
		Static147.aClass23_1409 = Static6.aClass23_110;
		Static2.aClass23_76 = Static71.aClass23_712;
		Static33.aClass23_344 = Static100.aClass23_991;
		Static111.aClass23_1080 = Static181.aClass23_1657;
		Static41.aClass23_433 = Static43.aClass23_447;
		Static33.aClass23_348 = Static132.aClass23_1517;
		Static66.aClass23_644 = Static46.aClass23_1654;
		Static47.aClass23_483 = Static144.aClass23_1380;
		Static90.aClass23_902 = Static38.aClass23_404;
		Static95.aClass23_932 = Static67.aClass23_649;
		Static44.aClass23_464 = Static36.aClass23_380;
		Static80.aClass23_793 = Static45.aClass23_481;
		Static33.aClass23_332 = Static37.aClass23_388;
		Static40.aClass23_411 = Static130.aClass23_1270;
		Static33.aClass23_357 = Static69.aClass23_682;
		Static158.aClass23_1485 = Static165.aClass23_1545;
		Static82.aClass23_810 = Static94.aClass23_922;
		Static154.aClass23_1457 = Static69.aClass23_683;
		Static157.aClass23_1475 = Static119.aClass23_1163;
		Static95.aClass23_936 = Static41.aClass23_432;
		Static171.aClass23_1583 = Static138.aClass23_1322;
		Static33.aClass23_343 = Static101.aClass23_993;
		Static112.aClass23_1105 = Static130.aClass23_1271;
		Static98.aClass23_963 = Static40.aClass23_418;
		Static76.aClass23_756 = Static128.aClass23_1262;
		Static22.aClass23_250 = Static81.aClass23_511;
		Static29.aClass23_305 = Static84.aClass23_1669;
		Static76.aClass23_752 = Static133.aClass23_1273;
		Static111.aClass23_1085 = Static62.aClass23_613;
		Static38.aClass23_405 = Static111.aClass23_1082;
		Static65.aClass23_1388 = Static92.aClass23_918;
		Static74.aClass23_734 = Static77.aClass23_773;
		Static84.aClass23_1674 = Static88.aClass23_873;
		Static68.aClass23_657 = Static31.aClass23_312;
		Static31.aClass23_315 = Static43.aClass23_440;
		Static33.aClass23_337 = Static55.aClass23_553;
		Static33.aClass23_338 = Static55.aClass23_553;
		Static116.aClass23_1145 = Static11.aClass23_138;
		Static33.aClass23_361 = Static55.aClass23_553;
		Static85.aClass23_842 = Static157.aClass23_1477;
		Static108.aClass23_681 = Static158.aClass23_1486;
		Static126.aClass23_1232 = Static65.aClass23_1392;
		Static33.aClass23_342 = Static55.aClass23_553;
		Static101.aClass23_995 = Static181.aClass23_1659;
		Static65.aClass23_1393 = Static171.aClass23_1581;
		Static99.aClass23_970 = Static110.aClass23_1073;
		Static139.aClass23_1334 = Static91.aClass23_908;
		Static74.aClass23_735 = Static169.aClass23_1572;
		Static24.aClass23_265 = Static93.aClass23_920;
		aClass23_1310 = Static146.aClass23_1396;
		Static25.aClass23_275 = Static171.aClass23_1580;
		Static140.aClass23_1359 = Static162.aClass23_1524;
		Static1.aClass23_70 = Static119.aClass23_1164;
		Static99.aClass23_969 = Static162.aClass23_1527;
		Static128.aClass23_1261 = Static21.aClass23_248;
		Static167.aClass23_1569 = Static67.aClass23_648;
		Static139.aClass23_1332 = Static32.aClass23_328;
		Static176.aClass23_1596 = Static39.aClass23_408;
		Static112.aClass23_1104 = Static160.aClass23_1510;
		Static42.aClass23_439 = Static149.aClass23_1422;
		Static61.aClass23_603 = Static71.aClass23_714;
		Static54.aClass23_547 = Static147.aClass23_1410;
		Static33.aClass23_360 = Static104.aClass23_1024;
		Static165.aClass23_1546 = Static44.aClass23_461;
		Static33.aClass23_339 = Static96.aClass23_951;
		Static10.aClass23_134 = Static154.aClass23_1453;
		Static33.aClass23_369 = Static55.aClass23_553;
		Static101.aClass23_999 = Static179.aClass23_1637;
		Static33.aClass23_356 = Static37.aClass23_388;
		Static91.aClass23_907 = Static163.aClass23_1529;
		Static153.aClass23_1444 = Static94.aClass23_924;
		Static177.aClass23_1604 = Static106.aClass23_1053;
		Static157.aClass23_1474 = Static21.aClass23_247;
		Static33.aClass23_359 = Static55.aClass23_553;
		Static33.aClass23_365 = Static55.aClass23_553;
		Static33.aClass23_352 = Static55.aClass23_553;
		Static14.aClass23_176 = Static35.aClass23_377;
		Static16.aClass23_191 = Static6.aClass23_109;
		Static171.aClass23_1582 = Static55.aClass23_553;
		Static130.aClass23_1272 = Static98.aClass23_968;
		Static128.aClass23_1263 = Static80.aClass23_795;
		Static33.aClass23_347 = Static53.aClass23_545;
		Static11.aClass23_139 = Static80.aClass23_788;
		Static33.aClass23_335 = Static55.aClass23_553;
		Static49.aClass23_515 = Static24.aClass23_259;
		Static125.aClass23_1218 = Static94.aClass23_923;
		Static108.aClass23_678 = Static178.aClass23_1628;
		Static112.aClass23_1107 = Static47.aClass23_486;
		Static33.aClass23_336 = Static96.aClass23_951;
		Static33.aClass23_354 = Static55.aClass23_553;
		Static58.aClass23_598 = Static75.aClass23_738;
		Static88.aClass23_875 = Static114.aClass23_1132;
		Static43.aClass23_441 = Static176.aClass23_1598;
		Static33.aClass23_368 = Static2.aClass23_75;
		Static33.aClass23_345 = Static55.aClass23_553;
		Static126.aClass23_1233 = Static106.aClass23_1054;
		Static46.aClass23_1651 = Static2.aClass23_78;
		Static65.aClass23_1389 = Static92.aClass23_918;
		Static70.aClass23_698 = Static91.aClass23_904;
		Static76.aClass23_755 = Static46.aClass23_1650;
		Static96.aClass23_959 = Static170.aClass23_286;
		Static106.aClass23_1057 = Static119.aClass23_1166;
		Static44.aClass23_460 = Static158.aClass23_1484;
		Static33.aClass23_364 = Static55.aClass23_553;
		Static16.aClass23_190 = Static72.aClass23_719;
		Static12.aClass23_157 = Static25.aClass23_272;
		Static33.aClass23_353 = Static55.aClass23_553;
		Static113.aClass23_1114 = Static162.aClass23_1522;
		Static152.aClass23_1327 = Static170.aClass23_285;
		Static33.aClass23_362 = Static46.aClass23_1656;
		Static33.aClass23_363 = Static81.aClass23_513;
		Static101.aClass23_1002 = Static13.aClass23_167;
		Static123.aClass23_1193 = Static50.aClass23_520;
		Static153.aClass23_1441 = Static165.aClass23_1547;
		Static64.aClass23_621 = Static97.aClass23_962;
		Static33.aClass23_366 = Static55.aClass23_553;
		Static81.aClass23_509 = Static101.aClass23_1000;
		Static156.aClass23_1467 = Static60.aClass23_1661;
		Static104.aClass23_1025 = Static82.aClass23_809;
		Static33.aClass23_329 = Static55.aClass23_553;
		Static57.aClass23_597 = Static155.aClass23_1458;
		Static139.aClass23_1340 = Static149.aClass23_1417;
		Static45.aClass23_479 = Static122.aClass23_1505;
	}
}
