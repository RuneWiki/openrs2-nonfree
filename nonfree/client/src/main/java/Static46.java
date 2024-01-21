import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "I")
	public static int anInt1259;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt1251 = 0;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!hb;")
	private static Class27 aClass27_606 = Static87.method1648("Unable to find ");

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!hb;")
	private static Class27 aClass27_607 = Static87.method1648("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Lclient!hb;")
	private static Class27 aClass27_608 = Static87.method1648("Freunde");

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!hb;")
	private static Class27 aClass27_609 = Static87.method1648("gelb:");

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_610 = aClass27_606;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!hb;")
	private static Class27 aClass27_611 = Static87.method1648("Entfernen");

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[Lclient!hb;")
	public static Class27[] aClass27Array5 = new Class27[200];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method922() {
		Static90.aClass21_29.method663();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method923(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static35.anInt851 > 0) {
			local21 = Static75.aByteArrayArray11[--Static35.anInt851];
			Static75.aByteArrayArray11[Static35.anInt851] = null;
			return local21;
		} else if (arg0 == 5000 && Static85.anInt2308 > 0) {
			local21 = Static11.aByteArrayArray14[--Static85.anInt2308];
			Static11.aByteArrayArray14[Static85.anInt2308] = null;
			return local21;
		} else if (arg0 == 30000 && Static86.anInt2323 > 0) {
			local21 = Static64.aByteArrayArray6[--Static86.anInt2323];
			Static64.aByteArrayArray6[Static86.anInt2323] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)I")
	public static int method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIILclient!hb;Lclient!hb;)V")
	public static void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class27 arg4, @OriginalArg(6) Class27 arg5) {
		if (Static61.anInt1553 >= 500) {
			return;
		}
		if (arg4.method765() <= 0) {
			Static55.aClass27Array9[Static61.anInt1553] = arg5;
		} else {
			Static55.aClass27Array9[Static61.anInt1553] = Static98.method1779(new Class27[] { arg5, Static13.aClass27_380, arg4 });
		}
		Static53.anIntArray234[Static61.anInt1553] = arg1;
		Static82.anIntArray336[Static61.anInt1553] = arg3;
		Static101.anIntArray390[Static61.anInt1553] = arg0;
		Static32.anIntArray151[Static61.anInt1553] = arg2;
		Static61.anInt1553++;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public static void method926() {
		Static7.aClass27_93 = Static92.aClass27_1212;
		Static17.aClass27_226 = Static74.aClass27_969;
		Static52.aClass27_675 = Static7.aClass27_87;
		Static75.aClass27_992 = Static93.aClass27_1215;
		Static91.aClass27_1178 = Static84.aClass27_1062;
		Static86.aClass27_1093 = Static69.aClass27_873;
		Static12.aClass27_151 = Static18.aClass27_229;
		Static30.aClass27_382 = Static67.aClass27_849;
		Static39.aClass27_505 = Static96.aClass27_842;
		Static2.aClass27_9 = Static38.aClass27_469;
		Static39.aClass27_508 = Static16.aClass27_192;
		Static39.aClass27_500 = Static89.aClass27_1155;
		Static65.aClass27_810 = Static80.aClass27_1030;
		Static30.aClass27_383 = Static101.aClass27_1266;
		Static42.aClass27_601 = Static105.aClass27_1327;
		Static74.aClass27_968 = Static69.aClass27_870;
		Static106.aClass27_416 = Static71.aClass27_910;
		Static55.aClass27_706 = Static19.aClass27_240;
		Static91.aClass27_1182 = Static40.aClass27_588;
		Static47.aClass27_617 = Static67.aClass27_851;
		Static65.aClass27_809 = Static94.aClass27_1224;
		Static53.aClass27_685 = Static102.aClass27_1288;
		Static80.aClass27_1037 = Static91.aClass27_1186;
		Static85.aClass27_1089 = Static10.aClass27_132;
		Static73.aClass27_935 = Static87.aClass27_1111;
		Static39.aClass27_506 = Static89.aClass27_1157;
		Static38.aClass27_466 = Static36.aClass27_436;
		Static66.aClass27_837 = Static85.aClass27_1084;
		Static53.aClass27_694 = Static42.aClass27_599;
		Static71.aClass27_905 = Static24.aClass27_324;
		Static52.aClass27_680 = Static7.aClass27_91;
		Static37.aClass27_441 = Static101.aClass27_1265;
		Static37.aClass27_446 = Static13.aClass27_381;
		Static91.aClass27_1189 = Static83.aClass27_1130;
		Static59.aClass27_740 = Static54.aClass27_700;
		Static99.aClass27_1261 = Static87.aClass27_1108;
		Static65.aClass27_813 = Static80.aClass27_1030;
		Static90.aClass27_1172 = Static91.aClass27_1188;
		Static71.aClass27_903 = Static82.aClass27_1056;
		Static67.aClass27_848 = Static81.aClass27_1049;
		Static39.aClass27_477 = Static16.aClass27_192;
		Static39.aClass27_485 = Static89.aClass27_1157;
		Static38.aClass27_470 = Static80.aClass27_1039;
		Static91.aClass27_1187 = Static73.aClass27_937;
		Static12.aClass27_153 = Static22.aClass27_295;
		Static37.aClass27_443 = Static76.aClass27_1006;
		Static25.aClass27_327 = Static59.aClass27_744;
		Static8.aClass27_115 = Static15.aClass27_156;
		Static107.aClass27_1337 = Static39.aClass27_502;
		Static99.aClass27_1258 = Static109.aClass27_961;
		Static84.aClass27_1064 = Static53.aClass27_692;
		Static39.aClass27_497 = Static16.aClass27_192;
		Static74.aClass27_971 = Static54.aClass27_703;
		Static39.aClass27_501 = Static12.aClass27_142;
		Static96.aClass27_841 = Static40.aClass27_589;
		Static80.aClass27_1031 = Static2.aClass27_10;
		Static39.aClass27_491 = Static102.aClass27_1289;
		Static87.aClass27_1110 = Static104.aClass27_1316;
		Static87.aClass27_1107 = Static25.aClass27_325;
		Static86.aClass27_1092 = Static8.aClass27_117;
		Static10.aClass27_129 = Static103.aClass27_1301;
		Static80.aClass27_1036 = Static76.aClass27_1015;
		Static50.aClass27_643 = Static97.aClass27_1077;
		Static99.aClass27_1256 = Static82.aClass27_1052;
		Static81.aClass27_1047 = Static52.aClass27_684;
		Static39.aClass27_493 = Static92.aClass27_1208;
		Static78.aClass27_1029 = Static99.aClass27_1255;
		Static62.aClass27_780 = Static88.aClass27_1146;
		Static41.aClass27_595 = Static47.aClass27_623;
		Static39.aClass27_489 = Static52.aClass27_674;
		Static13.aClass27_380 = Static77.aClass27_1019;
		Static64.aClass27_806 = Static4.aClass27_1336;
		Static7.aClass27_86 = aClass27_609;
		Static39.aClass27_494 = Static102.aClass27_1289;
		Static101.aClass27_1269 = Static19.aClass27_239;
		Static94.aClass27_1221 = Static48.aClass27_1139;
		Static93.aClass27_1217 = Static18.aClass27_228;
		Static71.aClass27_898 = Static24.aClass27_320;
		Static37.aClass27_451 = Static98.aClass27_1241;
		Static17.aClass27_221 = Static45.aClass27_185;
		Static102.aClass27_1286 = Static61.aClass27_763;
		Static107.aClass27_1338 = Static104.aClass27_1319;
		Static53.aClass27_688 = Static3.aClass27_34;
		Static3.aClass27_35 = Static107.aClass27_1344;
		Static10.aClass27_124 = Static52.aClass27_683;
		Static39.aClass27_480 = Static16.aClass27_192;
		Static1.aClass27_1 = Static108.aClass27_1348;
		Static39.aClass27_503 = Static16.aClass27_192;
		Static48.aClass27_1141 = Static85.aClass27_1087;
		Static107.aClass27_1339 = Static96.aClass27_839;
		Static8.aClass27_113 = aClass27_608;
		Static102.aClass27_1295 = Static17.aClass27_224;
		Static39.aClass27_478 = Static16.aClass27_192;
		Static1.aClass27_3 = Static81.aClass27_1050;
		Static77.aClass27_1018 = Static83.aClass27_1131;
		Static7.aClass27_90 = Static47.aClass27_618;
		Static84.aClass27_1061 = Static2.aClass27_8;
		Static92.aClass27_1213 = Static4.aClass27_1331;
		Static39.aClass27_483 = Static16.aClass27_192;
		Static54.aClass27_704 = Static69.aClass27_868;
		Static89.aClass27_1153 = Static88.aClass27_1149;
		Static8.aClass27_112 = Static72.aClass27_928;
		Static39.aClass27_486 = Static16.aClass27_192;
		Static41.aClass27_596 = Static70.aClass27_875;
		Static75.aClass27_995 = Static78.aClass27_1025;
		Static18.aClass27_227 = Static61.aClass27_764;
		Static33.aClass27_396 = Static108.aClass27_1347;
		Static89.aClass27_1154 = Static22.aClass27_297;
		Static56.aClass27_717 = Static62.aClass27_785;
		Static53.aClass27_696 = Static88.aClass27_1148;
		Static86.aClass27_1101 = Static99.aClass27_1263;
		Static76.aClass27_1007 = Static105.aClass27_1325;
		Static54.aClass27_697 = Static87.aClass27_1105;
		Static12.aClass27_146 = Static57.aClass27_738;
		Static98.aClass27_1240 = Static70.aClass27_874;
		Static31.aClass27_390 = Static38.aClass27_465;
		Static33.aClass27_400 = Static104.aClass27_1313;
		Static74.aClass27_972 = aClass27_607;
		Static39.aClass27_484 = Static16.aClass27_192;
		Static79.aClass27_408 = Static102.aClass27_1294;
		Static73.aClass27_933 = Static7.aClass27_88;
		Static66.aClass27_835 = Static93.aClass27_1216;
		Static24.aClass27_323 = Static41.aClass27_593;
		Static36.aClass27_435 = Static67.aClass27_844;
		Static39.aClass27_479 = Static102.aClass27_1289;
		Static7.aClass27_94 = Static97.aClass27_1081;
		Static35.aClass27_427 = Static28.aClass27_373;
		Static103.aClass27_1297 = Static96.aClass27_839;
		Static81.aClass27_1045 = Static10.aClass27_131;
		Static76.aClass27_1001 = Static103.aClass27_1299;
		Static39.aClass27_487 = Static56.aClass27_718;
		Static45.aClass27_186 = Static104.aClass27_1318;
		Static87.aClass27_1109 = Static109.aClass27_967;
		Static53.aClass27_693 = Static88.aClass27_1148;
		Static22.aClass27_299 = Static104.aClass27_1315;
		Static86.aClass27_1094 = Static99.aClass27_1263;
		Static108.aClass27_1345 = Static45.aClass27_184;
		Static79.aClass27_405 = Static16.aClass27_187;
		Static39.aClass27_504 = Static16.aClass27_192;
		Static10.aClass27_127 = Static68.aClass27_853;
		Static39.aClass27_476 = Static16.aClass27_192;
		Static3.aClass27_37 = Static10.aClass27_126;
		Static55.aClass27_709 = Static10.aClass27_128;
		Static105.aClass27_1326 = Static48.aClass27_1133;
		Static2.aClass27_12 = Static57.aClass27_739;
		Static37.aClass27_450 = Static48.aClass27_1143;
		Static53.aClass27_687 = Static3.aClass27_34;
		Static39.aClass27_474 = Static16.aClass27_192;
		Static4.aClass27_1334 = Static55.aClass27_710;
		Static86.aClass27_1090 = Static99.aClass27_1263;
		Static70.aClass27_879 = Static36.aClass27_434;
		Static17.aClass27_222 = Static62.aClass27_783;
		Static3.aClass27_39 = Static43.aClass27_605;
		Static39.aClass27_498 = Static52.aClass27_678;
		Static59.aClass27_742 = Static98.aClass27_1238;
		Static16.aClass27_188 = Static56.aClass27_714;
		Static54.aClass27_701 = Static106.aClass27_423;
		Static84.aClass27_1060 = Static93.aClass27_1218;
		Static72.aClass27_929 = Static41.aClass27_597;
		Static47.aClass27_620 = Static76.aClass27_1005;
		Static104.aClass27_1321 = Static65.aClass27_811;
		Static39.aClass27_482 = Static88.aClass27_1148;
		Static62.aClass27_784 = Static47.aClass27_627;
		Static71.aClass27_908 = Static74.aClass27_974;
		Static39.aClass27_507 = Static16.aClass27_192;
		Static39.aClass27_475 = Static16.aClass27_192;
		Static109.aClass27_964 = Static64.aClass27_807;
		Static72.aClass27_931 = Static85.aClass27_1085;
		Static36.aClass27_429 = Static70.aClass27_876;
		Static101.aClass27_1264 = Static78.aClass27_1021;
		Static48.aClass27_1142 = Static10.aClass27_134;
		Static91.aClass27_1192 = Static79.aClass27_404;
		Static65.aClass27_816 = Static7.aClass27_92;
		Static102.aClass27_1296 = Static47.aClass27_621;
		Static36.aClass27_430 = Static76.aClass27_1004;
		Static36.aClass27_433 = Static66.aClass27_834;
		Static71.aClass27_906 = Static69.aClass27_872;
		Static75.aClass27_994 = Static12.aClass27_141;
		Static106.aClass27_418 = Static72.aClass27_932;
		Static39.aClass27_496 = Static31.aClass27_387;
		Static56.aClass27_716 = Static91.aClass27_1193;
		Static17.aClass27_220 = Static15.aClass27_155;
		Static106.aClass27_419 = Static40.aClass27_590;
		Static68.aClass27_852 = Static97.aClass27_1083;
		Static34.aClass27_413 = Static94.aClass27_1223;
		Static56.aClass27_711 = Static103.aClass27_1298;
		Static17.aClass27_217 = Static48.aClass27_1137;
		Static39.aClass27_488 = Static16.aClass27_192;
		Static7.aClass27_85 = Static75.aClass27_993;
		Static39.aClass27_495 = Static16.aClass27_192;
		Static72.aClass27_930 = Static34.aClass27_414;
		Static45.aClass27_177 = Static81.aClass27_1051;
		Static86.aClass27_1091 = Static62.aClass27_782;
		Static12.aClass27_147 = Static77.aClass27_1016;
		Static31.aClass27_389 = Static75.aClass27_991;
		Static104.aClass27_1314 = Static52.aClass27_679;
		aClass27_610 = Static82.aClass27_1053;
		Static1.aClass27_5 = Static82.aClass27_1057;
		Static40.aClass27_586 = Static82.aClass27_1055;
		Static80.aClass27_1035 = Static91.aClass27_1186;
		Static19.aClass27_237 = Static42.aClass27_603;
		Static3.aClass27_36 = Static12.aClass27_154;
		Static79.aClass27_412 = Static88.aClass27_1147;
		Static39.aClass27_473 = Static16.aClass27_192;
		Static87.aClass27_1112 = Static25.aClass27_325;
		Static32.aClass27_392 = Static55.aClass27_705;
		Static78.aClass27_1027 = Static30.aClass27_385;
		Static73.aClass27_941 = Static84.aClass27_1063;
		Static39.aClass27_472 = Static67.aClass27_846;
		Static53.aClass27_686 = Static88.aClass27_1148;
		Static78.aClass27_1023 = aClass27_611;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Lclient!ee;")
	public static Class3_Sub3_Sub2_Sub1 method927() {
		@Pc(17) Class3_Sub3_Sub2_Sub1 local17 = new Class3_Sub3_Sub2_Sub1(Static72.anIntArray316, Static36.anIntArray160, Static54.anIntArray239, Static98.anIntArray378, Static72.aByteArrayArray10);
		Static96.method1232();
		return local17;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method928() {
		aClass27_606 = null;
		aClass27_609 = null;
		aClass27_611 = null;
		aClass27_608 = null;
		aClass27Array5 = null;
		aClass27_607 = null;
		aClass27_610 = null;
	}
}
