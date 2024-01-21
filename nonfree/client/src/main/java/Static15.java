import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt376;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_4;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!wf;")
	public static Class8_Sub24 aClass8_Sub24_3 = null;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public static int anInt370 = 1;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!lf;")
	public static Class48 aClass48_11 = new Class48(64);

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_208 = Static56.method816("ams");

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_209 = Static56.method816("logo");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public static void method237(@OriginalArg(0) int arg0) {
		Static79.method1138();
		Static68.method1038();
		@Pc(16) int local16 = Static60.method932(arg0).anInt1956;
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static78.anIntArray238[arg0];
		if (local16 == 1) {
			if (local24 == 1) {
				Static11.method186(0.9D);
				((Class26) Static11.anInterface3_1).method623(0.9D);
			}
			if (local24 == 2) {
				Static11.method186(0.8D);
				((Class26) Static11.anInterface3_1).method623(0.8D);
			}
			if (local24 == 3) {
				Static11.method186(0.7D);
				((Class26) Static11.anInterface3_1).method623(0.7D);
			}
			if (local24 == 4) {
				Static11.method186(0.6D);
				((Class26) Static11.anInterface3_1).method623(0.6D);
			}
			Static23.method424();
		}
		if (local16 == 3) {
			@Pc(78) short local78 = 0;
			if (local24 == 0) {
				local78 = 255;
			}
			if (local24 == 1) {
				local78 = 192;
			}
			if (local24 == 2) {
				local78 = 128;
			}
			if (local24 == 3) {
				local78 = 64;
			}
			if (local24 == 4) {
				local78 = 0;
			}
			if (local78 != Static47.anInt1277) {
				if (Static47.anInt1277 == 0 && Static74.anInt1780 != -1) {
					Static86.method1302(0, local78, Static67.aClass14_Sub1_9, Static74.anInt1780);
					Static60.aBoolean63 = false;
				} else if (local78 == 0) {
					Static92.method1327();
					Static60.aBoolean63 = false;
				} else {
					Static133.method2006(local78);
				}
				Static47.anInt1277 = local78;
			}
		}
		if (local16 == 5) {
			Static113.anInt2574 = local24;
		}
		if (local16 == 4) {
			if (local24 == 0) {
				Static53.anInt1363 = 127;
			}
			if (local24 == 1) {
				Static53.anInt1363 = 96;
			}
			if (local24 == 2) {
				Static53.anInt1363 = 64;
			}
			if (local24 == 3) {
				Static53.anInt1363 = 32;
			}
			if (local24 == 4) {
				Static53.anInt1363 = 0;
			}
		}
		if (local16 == 6) {
			Static54.anInt1368 = local24;
		}
		if (local16 == 9) {
			Static30.anInt846 = local24;
		}
		if (local16 != 10) {
			return;
		}
		if (local24 == 0) {
			Static67.anInt1640 = 127;
		}
		if (local24 == 1) {
			Static67.anInt1640 = 96;
		}
		if (local24 == 2) {
			Static67.anInt1640 = 64;
		}
		if (local24 == 3) {
			Static67.anInt1640 = 32;
		}
		if (local24 == 4) {
			Static67.anInt1640 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method238() {
		aClass34_208 = null;
		aClass8_Sub24_4 = null;
		aClass8_Sub24_3 = null;
		aClass34_209 = null;
		aClass48_11 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method239() {
		Static29.aClass34_442 = Static54.aClass34_694;
		Static29.aClass34_425 = Static54.aClass34_694;
		Static29.aClass34_434 = Static54.aClass34_694;
		Static31.aClass34_452 = Static38.aClass34_507;
		Static92.aClass34_1020 = Static116.aClass34_1226;
		Static56.aClass34_705 = Static3.aClass34_22;
		Static73.aClass34_821 = Static78.aClass34_847;
		Static24.aClass34_859 = Static21.aClass34_327;
		Static32.aClass34_461 = Static130.aClass34_1410;
		Static128.aClass34_1386 = Static40.aClass34_520;
		Static16.aClass34_216 = Static77.aClass34_841;
		Static92.aClass34_1019 = Static73.aClass34_828;
		Static115.aClass34_1221 = Static60.aClass34_750;
		Static95.aClass34_1047 = Static48.aClass34_1348;
		Static33.aClass34_481 = Static75.aClass34_836;
		Static28.aClass34_392 = Static113.aClass34_1210;
		Static100.aClass34_1102 = Static133.aClass34_1428;
		Static62.aClass34_759 = Static41.aClass34_525;
		Static69.aClass34_787 = Static5.aClass34_38;
		Static29.aClass34_429 = Static73.aClass34_830;
		Static36.aClass34_499 = Static53.aClass34_689;
		Static97.aClass34_1054 = Static79.aClass34_854;
		Static29.aClass34_446 = Static54.aClass34_694;
		Static81.aClass34_883 = Static68.aClass34_779;
		Static52.aClass34_683 = Static19.aClass34_291;
		Static62.aClass34_763 = Static79.aClass34_853;
		Static19.aClass34_295 = Static134.aClass34_1441;
		Static48.aClass34_1352 = Static3.aClass34_19;
		Static29.aClass34_431 = Static19.aClass34_290;
		Static130.aClass34_1414 = Static50.aClass34_658;
		Static25.aClass34_361 = Static78.aClass34_846;
		Static60.aClass34_749 = Static69.aClass34_780;
		Static29.aClass34_414 = Static54.aClass34_694;
		Static104.aClass34_1117 = Static100.aClass34_1104;
		Static104.aClass34_1118 = Static123.aClass34_1340;
		Static29.aClass34_428 = Static54.aClass34_694;
		Static2.aClass34_6 = Static60.aClass34_752;
		Static83.aClass34_938 = Static116.aClass34_1229;
		Static20.aClass34_308 = Static18.aClass34_268;
		Static17.aClass34_247 = Static73.aClass34_823;
		Static96.aClass34_278 = Static30.aClass34_448;
		Static107.aClass34_1151 = Static120.aClass34_1324;
		Static64.aClass34_918 = Static8.aClass34_106;
		Static29.aClass34_417 = Static54.aClass34_694;
		Static45.aClass34_574 = Static54.aClass34_695;
		Static29.aClass34_430 = Static13.aClass34_199;
		Static29.aClass34_438 = Static57.aClass34_720;
		Static16.aClass34_230 = Static113.aClass34_1205;
		Static91.aClass34_1016 = Static31.aClass34_455;
		Static73.aClass34_819 = Static13.aClass34_198;
		Static77.aClass34_843 = Static48.aClass34_1353;
		Static132.aClass34_1320 = Static27.aClass34_385;
		Static29.aClass34_441 = Static97.aClass34_1058;
		Static64.aClass34_924 = Static53.aClass34_691;
		Static7.aClass34_44 = Static102.aClass34_1429;
		Static124.aClass34_1367 = Static81.aClass34_887;
		Static28.aClass34_390 = Static81.aClass34_890;
		Static97.aClass34_1059 = Static41.aClass34_529;
		Static83.aClass34_944 = Static116.aClass34_1229;
		Static29.aClass34_416 = Static57.aClass34_722;
		Static22.aClass34_1204 = Static16.aClass34_232;
		Static132.aClass34_1319 = Static121.aClass34_1333;
		Static27.aClass34_383 = Static111.aClass34_1394;
		Static29.aClass34_411 = Static54.aClass34_694;
		Static29.aClass34_413 = Static113.aClass34_1213;
		Static113.aClass34_1209 = Static112.aClass34_1181;
		Static59.aClass34_743 = Static124.aClass34_1364;
		Static115.aClass34_1219 = Static103.aClass34_1114;
		Static41.aClass34_524 = Static66.aClass34_1362;
		Static107.aClass34_1148 = Static123.aClass34_1342;
		Static80.aClass34_866 = Static54.aClass34_696;
		Static61.aClass34_757 = Static19.aClass34_289;
		Static125.aClass34_1377 = Static121.aClass34_1332;
		Static29.aClass34_424 = Static54.aClass34_694;
		Static36.aClass34_501 = Static113.aClass34_1211;
		Static50.aClass34_656 = Static123.aClass34_1341;
		Static73.aClass34_829 = Static88.aClass34_1098;
		Static118.aClass34_1241 = Static83.aClass34_927;
		Static7.aClass34_41 = Static125.aClass34_1372;
		Static19.aClass34_292 = Static67.aClass34_775;
		Static48.aClass34_1355 = Static53.aClass34_693;
		Static24.aClass34_860 = Static91.aClass34_1013;
		Static44.aClass34_566 = Static118.aClass34_1239;
		Static29.aClass34_433 = Static52.aClass34_684;
		Static83.aClass34_939 = Static77.aClass34_842;
		Static1.aClass34_1 = Static49.aClass34_654;
		Static128.aClass34_1382 = Static123.aClass34_1343;
		Static106.aClass34_1145 = Static2.aClass34_3;
		Static10.aClass34_133 = Static10.aClass34_135;
		Static108.aClass34_1169 = Static34.aClass34_484;
		Static4.aClass34_26 = Static70.aClass34_794;
		Static29.aClass34_419 = Static57.aClass34_719;
		Static29.aClass34_418 = Static14.aClass34_206;
		Static29.aClass34_415 = Static54.aClass34_694;
		Static99.aClass34_1094 = Static72.aClass34_816;
		Static95.aClass34_1048 = Static25.aClass34_359;
		Static128.aClass34_1387 = Static60.aClass34_747;
		Static29.aClass34_426 = Static54.aClass34_694;
		Static73.aClass34_822 = Static119.aClass34_1301;
		Static29.aClass34_437 = Static54.aClass34_694;
		Static83.aClass34_928 = Static50.aClass34_659;
		Static29.aClass34_412 = Static54.aClass34_694;
		Static29.aClass34_421 = Static54.aClass34_694;
		Static81.aClass34_886 = Static48.aClass34_1349;
		Static95.aClass34_1043 = Static125.aClass34_1375;
		Static90.aClass34_170 = Static94.aClass34_1030;
		Static34.aClass34_490 = Static47.aClass34_639;
		Static29.aClass34_435 = Static86.aClass34_999;
		Static101.aClass34_1108 = Static9.aClass34_117;
		Static29.aClass34_440 = Static54.aClass34_694;
		Static83.aClass34_946 = Static77.aClass34_842;
		Static29.aClass34_444 = Static116.aClass34_1229;
		Static29.aClass34_408 = Static52.aClass34_684;
		Static72.aClass34_817 = Static42.aClass34_545;
		Static9.aClass34_116 = Static73.aClass34_826;
		Static79.aClass34_856 = Static49.aClass34_650;
		Static59.aClass34_739 = Static120.aClass34_1327;
		Static18.aClass34_269 = Static100.aClass34_1105;
		Static116.aClass34_1228 = Static108.aClass34_1167;
		Static133.aClass34_1421 = Static94.aClass34_1037;
		Static56.aClass34_704 = Static13.aClass34_197;
		Static7.aClass34_46 = Static117.aClass34_1230;
		Static88.aClass34_1099 = Static23.aClass34_348;
		Static18.aClass34_264 = Static32.aClass34_462;
		Static5.aClass34_36 = Static90.aClass34_169;
		Static20.aClass34_309 = Static126.aClass34_1123;
		Static124.aClass34_1365 = Static81.aClass34_887;
		Static2.aClass34_8 = Static54.aClass34_697;
		Static112.aClass34_1182 = Static30.aClass34_450;
		Static86.aClass34_998 = Static10.aClass34_137;
		Static133.aClass34_1424 = Static32.aClass34_457;
		Static47.aClass34_641 = Static86.aClass34_1002;
		Static36.aClass34_494 = Static78.aClass34_845;
		Static83.aClass34_945 = Static93.aClass34_1023;
		Static31.aClass34_453 = Static54.aClass34_694;
		Static29.aClass34_447 = Static86.aClass34_999;
		Static120.aClass34_1322 = Static46.aClass34_578;
		Static57.aClass34_718 = Static28.aClass34_388;
		Static59.aClass34_738 = Static47.aClass34_635;
		Static82.aClass34_894 = Static112.aClass34_1177;
		Static133.aClass34_1426 = Static62.aClass34_762;
		Static25.aClass34_357 = Static102.aClass34_1430;
		Static87.aClass34_1004 = Static66.aClass34_1363;
		Static74.aClass34_831 = Static95.aClass34_1049;
		Static125.aClass34_1374 = Static106.aClass34_1144;
		Static80.aClass34_868 = Static61.aClass34_758;
		Static96.aClass34_283 = Static94.aClass34_1034;
		Static3.aClass34_18 = Static9.aClass34_115;
		Static92.aClass34_1017 = Static116.aClass34_1226;
		Static50.aClass34_657 = Static88.aClass34_1096;
		Static29.aClass34_445 = Static54.aClass34_694;
		Static111.aClass34_1397 = Static95.aClass34_1052;
		Static83.aClass34_947 = Static116.aClass34_1229;
		Static53.aClass34_690 = Static4.aClass34_28;
		Static20.aClass34_300 = Static66.aClass34_1358;
		Static21.aClass34_324 = Static48.aClass34_1350;
		Static82.aClass34_891 = Static70.aClass34_795;
		Static51.aClass34_680 = Static92.aClass34_1018;
		Static8.aClass34_108 = Static128.aClass34_1389;
		Static67.aClass34_773 = Static73.aClass34_824;
		Static49.aClass34_653 = Static19.aClass34_286;
		Static29.aClass34_432 = Static54.aClass34_694;
		Static94.aClass34_1031 = Static44.aClass34_564;
		Static109.aClass34_1176 = Static51.aClass34_681;
		Static29.aClass34_423 = Static54.aClass34_694;
		Static29.aClass34_422 = Static54.aClass34_694;
		Static41.aClass34_530 = Static94.aClass34_1033;
		Static74.aClass34_834 = Static95.aClass34_1049;
		Static45.aClass34_573 = Static6.aClass34_39;
		Static29.aClass34_410 = Static19.aClass34_288;
		Static29.aClass34_443 = Static54.aClass34_694;
		Static32.aClass34_459 = Static39.aClass34_512;
		Static70.aClass34_797 = Static20.aClass34_303;
		Static134.aClass34_1438 = Static101.aClass34_1109;
		Static33.aClass34_482 = Static129.aClass34_1402;
		Static111.aClass34_1395 = Static66.aClass34_1361;
		Static29.aClass34_436 = Static54.aClass34_694;
		Static130.aClass34_1412 = Static19.aClass34_287;
		Static69.aClass34_785 = Static38.aClass34_506;
		Static56.aClass34_709 = Static59.aClass34_745;
		Static20.aClass34_307 = Static127.aClass34_1381;
		Static33.aClass34_483 = Static41.aClass34_528;
		Static128.aClass34_1390 = Static25.aClass34_355;
		Static115.aClass34_1223 = Static74.aClass34_832;
		Static86.aClass34_1003 = Static77.aClass34_844;
		Static64.aClass34_921 = Static130.aClass34_1408;
		Static111.aClass34_1393 = Static105.aClass34_1122;
		Static111.aClass34_1400 = Static95.aClass34_1052;
		Static126.aClass34_1125 = Static52.aClass34_682;
		Static113.aClass34_1206 = Static126.aClass34_1124;
		Static82.aClass34_897 = Static70.aClass34_795;
		Static39.aClass34_515 = Static80.aClass34_865;
		Static83.aClass34_932 = Static39.aClass34_513;
		Static88.aClass34_1101 = Static23.aClass34_348;
		Static5.aClass34_34 = Static7.aClass34_43;
		Static34.aClass34_492 = Static60.aClass34_751;
	}
}
