import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array3;

	@OriginalMember(owner = "client!fa", name = "cc", descriptor = "I")
	public static int anInt1079;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
	public static int anInt1023 = 0;

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_502 = Static51.method932("l");

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_503 = Static51.method932("blinken3:");

	@OriginalMember(owner = "client!fa", name = "ub", descriptor = "Z")
	public static volatile boolean aBoolean44 = true;

	@OriginalMember(owner = "client!fa", name = "xb", descriptor = "I")
	public static int anInt1061 = 0;

	@OriginalMember(owner = "client!fa", name = "Ab", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!fa", name = "kc", descriptor = "Lclient!cd;")
	private static Class10 aClass10_506 = Static51.method932("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method840() {
		aClass2_Sub1_Sub4_Sub2Array3 = null;
		aClass10_506 = null;
		aClass10_502 = null;
		aClass10_503 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[BIB)Z")
	public static boolean method846(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = -1;
		@Pc(9) boolean local9 = true;
		@Pc(14) Class2_Sub11 local14 = new Class2_Sub11(arg1);
		label68: while (true) {
			@Pc(18) int local18 = local14.method1469();
			if (local18 == 0) {
				return local9;
			}
			local3 += local18;
			@Pc(26) boolean local26 = false;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(53) int local53;
				@Pc(92) Class2_Sub1_Sub10 local92;
				do {
					@Pc(68) int local68;
					@Pc(73) int local73;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local26) {
										local34 = local14.method1469();
										if (local34 == 0) {
											continue label68;
										}
										local14.method1461();
									}
									local34 = local14.method1469();
									if (local34 == 0) {
										continue label68;
									}
									local28 += local34 - 1;
									local53 = local14.method1461() >> 2;
									@Pc(59) int local59 = local28 >> 6 & 0x3F;
									@Pc(63) int local63 = local28 & 0x3F;
									local68 = local59 + arg0;
									local73 = local63 + arg2;
								} while (local68 <= 0);
							} while (local73 <= 0);
						} while (local68 >= 103);
					} while (local73 >= 103);
					local92 = Static62.method1106(local3);
				} while (local53 == 22 && Static170.aBoolean163 && local92.anInt2212 == 0 && local92.anInt2220 != 1 && !local92.aBoolean97);
				local26 = true;
				if (!local92.method1585()) {
					Static156.anInt3342++;
					local9 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method849() {
		Static48.aClass10_528 = Static69.aClass10_712;
		Static129.aClass10_1248 = Static51.aClass10_562;
		Static49.aClass10_547 = Static124.aClass10_1216;
		Static6.aClass10_97 = Static120.aClass10_1178;
		Static63.aClass10_686 = Static136.aClass10_1316;
		Static36.aClass10_460 = Static95.aClass10_946;
		Static155.aClass10_1456 = Static98.aClass10_983;
		Static101.aClass10_1016 = Static62.aClass10_668;
		Static139.aClass10_1356 = Static133.aClass10_1284;
		Static177.aClass10_1608 = Static59.aClass10_650;
		Static104.aClass10_1040 = Static5.aClass10_71;
		Static48.aClass10_529 = Static96.aClass10_1586;
		Static133.aClass10_1286 = Static21.aClass10_248;
		Static132.aClass10_1272 = Static32.aClass10_393;
		Static78.aClass10_339 = Static20.aClass10_247;
		Static91.aClass10_905 = Static49.aClass10_546;
		Static36.aClass10_425 = Static101.aClass10_1021;
		Static97.aClass10_968 = Static28.aClass10_361;
		Static92.aClass10_921 = Static177.aClass10_1610;
		Static63.aClass10_682 = Static136.aClass10_1316;
		Static20.aClass10_244 = Static132.aClass10_1271;
		Static141.aClass10_1377 = Static3.aClass10_34;
		Static13.aClass10_176 = aClass10_503;
		Static36.aClass10_445 = Static16.aClass10_197;
		Static20.aClass10_242 = Static1.aClass10_4;
		Static93.aClass10_923 = Static104.aClass10_1041;
		Static146.aClass10_1409 = Static61.aClass10_1558;
		Static37.aClass10_470 = Static159.aClass10_1480;
		Static70.aClass10_728 = Static74.aClass10_1267;
		Static36.aClass10_430 = Static101.aClass10_1021;
		Static5.aClass10_75 = Static150.aClass10_1550;
		Static93.aClass10_922 = Static58.aClass10_644;
		Static136.aClass10_1315 = Static96.aClass10_1585;
		Static36.aClass10_424 = Static74.aClass10_1268;
		Static36.aClass10_447 = Static177.aClass10_1603;
		Static36.aClass10_449 = Static101.aClass10_1021;
		Static13.aClass10_174 = Static55.aClass10_610;
		Static160.aClass10_1482 = Static8.aClass10_126;
		Static36.aClass10_443 = Static101.aClass10_1021;
		Static100.aClass10_1014 = Static149.aClass10_1418;
		Static130.aClass10_1255 = Static164.aClass10_1533;
		Static10.aClass10_136 = Static65.aClass10_694;
		Static36.aClass10_440 = Static157.aClass10_1463;
		Static57.aClass10_631 = Static51.aClass10_563;
		Static59.aClass10_646 = Static107.aClass10_1070;
		Static92.aClass10_919 = Static54.aClass10_597;
		Static149.aClass10_1417 = Static49.aClass10_545;
		Static7.aClass10_109 = Static73.aClass10_763;
		Static151.aClass10_1426 = Static71.aClass10_741;
		Static77.aClass10_782 = Static75.aClass10_774;
		Static7.aClass10_110 = Static74.aClass10_1270;
		Static130.aClass10_1252 = Static20.aClass10_245;
		Static10.aClass10_137 = Static137.aClass10_1332;
		Static19.aClass10_228 = Static22.aClass10_256;
		Static142.aClass10_1386 = Static105.aClass10_1054;
		Static61.aClass10_1557 = Static142.aClass10_1390;
		Static106.aClass10_1066 = Static89.aClass10_875;
		Static169.aClass10_1567 = Static134.aClass10_1298;
		Static119.aClass10_1168 = Static85.aClass10_845;
		Static145.aClass10_1134 = Static40.aClass10_482;
		Static37.aClass10_468 = aClass10_506;
		Static67.aClass10_1264 = Static90.aClass10_893;
		Static144.aClass10_1404 = Static103.aClass10_1033;
		Static29.aClass10_365 = Static4.aClass10_47;
		Static149.aClass10_1412 = Static170.aClass10_1580;
		Static30.aClass10_378 = Static116.aClass10_1138;
		Static36.aClass10_458 = Static86.aClass10_850;
		Static61.aClass10_1556 = Static88.aClass10_607;
		Static36.aClass10_441 = Static101.aClass10_1021;
		Static9.aClass10_130 = Static139.aClass10_1352;
		Static98.aClass10_986 = Static24.aClass10_261;
		Static36.aClass10_451 = Static101.aClass10_1021;
		Static36.aClass10_435 = Static94.aClass10_937;
		Static36.aClass10_431 = Static101.aClass10_1021;
		Static147.aClass10_1618 = Static145.aClass10_1135;
		Static57.aClass10_628 = Static16.aClass10_198;
		Static36.aClass10_439 = Static101.aClass10_1021;
		Static19.aClass10_232 = Static47.aClass10_526;
		Static21.aClass10_253 = Static108.aClass10_1077;
		Static143.aClass10_1397 = Static3.aClass10_37;
		Static22.aClass10_255 = Static9.aClass10_129;
		Static93.aClass10_927 = Static60.aClass10_661;
		Static56.aClass10_615 = Static149.aClass10_1414;
		Static36.aClass10_450 = Static107.aClass10_1075;
		Static7.aClass10_111 = Static164.aClass10_1534;
		Static25.aClass10_328 = Static106.aClass10_1067;
		Static119.aClass10_1169 = Static27.aClass10_349;
		Static143.aClass10_1395 = Static116.aClass10_1136;
		Static110.aClass10_1092 = Static89.aClass10_869;
		Static139.aClass10_1348 = Static134.aClass10_1297;
		Static139.aClass10_1350 = Static46.aClass10_523;
		Static62.aClass10_666 = Static151.aClass10_1425;
		Static58.aClass10_642 = Static168.aClass10_1561;
		Static142.aClass10_1392 = Static1.aClass10_6;
		Static138.aClass10_1333 = Static176.aClass10_1602;
		Static27.aClass10_346 = Static142.aClass10_1394;
		Static171.aClass10_1587 = Static178.aClass10_1613;
		Static36.aClass10_427 = Static101.aClass10_1021;
		Static126.aClass10_1238 = Static78.aClass10_336;
		Static16.aClass10_195 = Static9.aClass10_128;
		Static78.aClass10_337 = Static64.aClass10_691;
		Static178.aClass10_1615 = Static68.aClass10_711;
		Static36.aClass10_433 = Static101.aClass10_1021;
		Static20.aClass10_240 = Static1.aClass10_4;
		Static14.aClass10_178 = Static99.aClass10_999;
		Static32.aClass10_396 = Static135.aClass10_1304;
		Static22.aClass10_257 = Static142.aClass10_1389;
		Static36.aClass10_446 = Static101.aClass10_1021;
		Static139.aClass10_1349 = Static21.aClass10_250;
		Static46.aClass10_521 = Static48.aClass10_527;
		Static139.aClass10_1353 = Static134.aClass10_1297;
		Static157.aClass10_1462 = Static139.aClass10_1345;
		Static81.aClass10_824 = Static104.aClass10_1042;
		Static36.aClass10_438 = Static101.aClass10_1021;
		Static27.aClass10_342 = Static33.aClass10_401;
		Static36.aClass10_428 = Static90.aClass10_892;
		Static70.aClass10_723 = Static115.aClass10_1119;
		Static139.aClass10_1347 = Static133.aClass10_1284;
		Static36.aClass10_442 = Static111.aClass10_1095;
		Static70.aClass10_725 = Static146.aClass10_1405;
		Static39.aClass10_481 = Static107.aClass10_1071;
		Static143.aClass10_1396 = Static37.aClass10_467;
		Static71.aClass10_739 = Static62.aClass10_664;
		Static1.aClass10_1 = Static128.aClass10_1240;
		Static77.aClass10_783 = Static38.aClass10_477;
		Static36.aClass10_453 = Static101.aClass10_1021;
		Static62.aClass10_670 = Static120.aClass10_1176;
		Static24.aClass10_260 = Static13.aClass10_171;
		Static46.aClass10_524 = Static131.aClass10_1257;
		Static130.aClass10_1256 = Static100.aClass10_1010;
		Static32.aClass10_400 = Static143.aClass10_1398;
		Static83.aClass10_835 = Static19.aClass10_231;
		Static137.aClass10_1330 = Static48.aClass10_530;
		Static36.aClass10_444 = Static101.aClass10_1021;
		Static139.aClass10_1344 = Static133.aClass10_1284;
		Static135.aClass10_1305 = Static14.aClass10_179;
		Static11.aClass10_1510 = Static53.aClass10_577;
		Static27.aClass10_345 = Static131.aClass10_1261;
		Static36.aClass10_455 = Static101.aClass10_1021;
		Static85.aClass10_848 = Static176.aClass10_1599;
		Static64.aClass10_690 = Static124.aClass10_1217;
		Static169.aClass10_1571 = Static115.aClass10_1118;
		Static174.aClass10_1594 = Static41.aClass10_487;
		Static149.aClass10_1416 = Static11.aClass10_1512;
		Static86.aClass10_851 = Static120.aClass10_1177;
		Static65.aClass10_696 = Static137.aClass10_1331;
		Static95.aClass10_950 = Static68.aClass10_710;
		Static36.aClass10_422 = Static79.aClass10_797;
		Static108.aClass10_1079 = Static156.aClass10_1461;
		Static59.aClass10_649 = Static111.aClass10_1097;
		Static20.aClass10_246 = Static162.aClass10_1517;
		Static101.aClass10_1020 = Static121.aClass10_1191;
		Static36.aClass10_432 = Static90.aClass10_892;
		Static36.aClass10_437 = Static101.aClass10_1021;
		Static163.aClass10_1520 = Static139.aClass10_1351;
		Static178.aClass10_1614 = Static169.aClass10_1572;
		Static30.aClass10_380 = Static116.aClass10_1138;
		Static36.aClass10_436 = Static101.aClass10_1021;
		Static36.aClass10_452 = Static89.aClass10_874;
		Static52.aClass10_569 = Static13.aClass10_173;
		Static52.aClass10_570 = Static27.aClass10_350;
		Static56.aClass10_616 = Static167.aClass10_866;
		Static119.aClass10_1161 = Static58.aClass10_638;
		Static2.aClass10_32 = Static56.aClass10_613;
		Static156.aClass10_1460 = Static95.aClass10_942;
		Static3.aClass10_35 = Static114.aClass10_1104;
		Static131.aClass10_1258 = Static115.aClass10_1120;
		Static52.aClass10_565 = Static13.aClass10_173;
		Static14.aClass10_182 = Static85.aClass10_847;
		Static36.aClass10_448 = Static101.aClass10_1021;
		Static130.aClass10_1251 = Static20.aClass10_245;
		Static51.aClass10_560 = Static81.aClass10_819;
		Static36.aClass10_429 = Static133.aClass10_1284;
		Static95.aClass10_944 = Static101.aClass10_1021;
		Static36.aClass10_434 = Static101.aClass10_1021;
		Static161.aClass10_1497 = Static100.aClass10_1013;
		Static177.aClass10_1606 = Static114.aClass10_1108;
		Static88.aClass10_605 = Static28.aClass10_362;
		Static10.aClass10_132 = Static40.aClass10_484;
		Static146.aClass10_1408 = Static28.aClass10_360;
		Static36.aClass10_426 = Static101.aClass10_1021;
		Static97.aClass10_971 = Static30.aClass10_381;
		Static161.aClass10_1495 = Static34.aClass10_402;
		Static63.aClass10_688 = Static135.aClass10_1307;
		Static157.aClass10_1466 = Static114.aClass10_1107;
		Static77.aClass10_787 = Static165.aClass10_1539;
		Static32.aClass10_395 = Static101.aClass10_1022;
		Static36.aClass10_456 = Static101.aClass10_1021;
		Static41.aClass10_486 = Static169.aClass10_1568;
		Static36.aClass10_461 = Static111.aClass10_1095;
		Static89.aClass10_872 = Static154.aClass10_1449;
		Static89.aClass10_873 = Static74.aClass10_1269;
		Static65.aClass10_692 = Static137.aClass10_1331;
		Static119.aClass10_1164 = Static132.aClass10_1273;
		Static99.aClass10_1000 = Static121.aClass10_1192;
		Static107.aClass10_1074 = Static117.aClass10_1149;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BIIII[Lclient!fh;I)V")
	public static void method851(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class27[] arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg5 + local7 > 0 && arg5 + local7 < 103 && local11 + arg3 > 0 && arg3 + local11 < 103) {
						arg4[local3].anIntArrayArray16[arg5 + local7][arg3 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class2_Sub11 local91 = new Class2_Sub11(arg0);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static93.method1564(local11, arg5 + local101, local91, arg1, local105 + arg3, 0, arg2);
				}
			}
		}
	}
}
