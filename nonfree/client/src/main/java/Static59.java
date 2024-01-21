import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kc", name = "Wb", descriptor = "Lclient!jb;")
	public static Class25 aClass25_15;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "[Lclient!ib;")
	public static Class3_Sub1_Sub1_Sub3_Sub2[] aClass3_Sub1_Sub1_Sub3_Sub2Array1 = new Class3_Sub1_Sub1_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_817 = method1195("auf der Hautpseite)3");

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "[I")
	public static int[] anIntArray204 = new int[5];

	@OriginalMember(owner = "client!kc", name = "Bb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_818 = method1195("Existing User");

	@OriginalMember(owner = "client!kc", name = "Ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_819 = aClass60_818;

	@OriginalMember(owner = "client!kc", name = "Ub", descriptor = "I")
	public static int anInt1874 = -1;

	@OriginalMember(owner = "client!kc", name = "ac", descriptor = "Lclient!qf;")
	public static Class60 aClass60_820 = method1195("compass");

	@OriginalMember(owner = "client!kc", name = "bc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_821 = method1195("Side panel redrawn");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIII)V")
	public static void method1192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub15 local8 = Static68.method1390(arg2, arg1);
		if (local8 != null && local8.anObjectArray18 != null) {
			Static12.method335(local8.anObjectArray18, local8, 0, 0, null, 0);
		}
		Static11.anInt335 = arg0;
		Static45.anInt1433 = arg2;
		Static103.anInt2999 = arg1;
		Static72.aBoolean85 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!qf;")
	public static Class60 method1195(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(9) int local9 = local2.length;
		@Pc(18) Class60 local18 = new Class60();
		@Pc(20) int local20 = 0;
		local18.aByteArray73 = new byte[local9];
		while (local20 < local9) {
			@Pc(32) int local32 = local2[local20++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local20 >= local9) {
					break;
				}
				@Pc(56) int local56 = local2[local20++] & 0xFF;
				local18.aByteArray73[local18.anInt2817++] = (byte) ((local32 - 40) * 43 + local56 - 48);
			} else if (local32 != 0) {
				local18.aByteArray73[local18.anInt2817++] = (byte) local32;
			}
		}
		local18.method1849();
		return local18.method1858();
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)I")
	public static int method1196() {
		@Pc(9) int local9 = Static66.method1353(Static71.anInt1493, Static119.anInt3243, Static98.anInt2824);
		return local9 - Static115.anInt3199 >= 800 || (Static60.aByteArrayArrayArray4[Static119.anInt3243][Static71.anInt1493 >> 7][Static98.anInt2824 >> 7] & 0x4) == 0 ? 3 : Static119.anInt3243;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	public static int method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "(I)V")
	public static void method1200() {
		Static108.aClass60_1298 = Static108.aClass60_1296;
		Static11.aClass60_140 = Static19.aClass60_1415;
		Static39.aClass60_523 = Static22.aClass60_332;
		Static33.aClass60_445 = Static78.aClass60_1038;
		Static96.aClass60_1189 = Static126.aClass60_1424;
		Static30.aClass60_400 = Static55.aClass60_779;
		Static42.aClass60_613 = Static27.aClass60_380;
		Static19.aClass60_1414 = Static23.aClass60_1120;
		Static39.aClass60_519 = Static19.aClass60_1416;
		Static39.aClass60_522 = Static16.aClass60_263;
		Static81.aClass60_1084 = Static23.aClass60_1123;
		Static62.aClass60_857 = Static21.aClass60_330;
		Static129.aClass60_1442 = Static108.aClass60_1291;
		Static67.aClass60_927 = Static17.aClass60_276;
		Static24.aClass60_352 = Static61.aClass60_852;
		Static36.aClass60_481 = Static41.aClass60_599;
		Static117.aClass60_1343 = Static23.aClass60_1125;
		Static68.aClass60_932 = Static64.aClass60_891;
		Static104.aClass60_1267 = Static80.aClass60_1066;
		Static130.aClass60_1446 = Static71.aClass60_659;
		Static2.aClass60_66 = Static63.aClass60_1227;
		Static56.aClass60_790 = Static85.aClass60_1129;
		Static39.aClass60_549 = Static23.aClass60_1122;
		Static16.aClass60_267 = Static57.aClass60_1409;
		Static17.aClass60_281 = Static52.aClass60_761;
		Static36.aClass60_479 = Static18.aClass60_298;
		Static105.aClass60_1269 = Static105.aClass60_1283;
		Static79.aClass60_1050 = Static48.aClass60_669;
		Static39.aClass60_531 = Static127.aClass60_1157;
		Static114.aClass60_1331 = Static118.aClass60_1355;
		Static100.aClass60_1241 = Static64.aClass60_889;
		Static77.aClass60_1028 = Static83.aClass60_1099;
		Static118.aClass60_1349 = Static104.aClass60_1268;
		Static56.aClass60_795 = Static16.aClass60_269;
		Static56.aClass60_789 = Static50.aClass60_729;
		Static41.aClass60_598 = Static11.aClass60_144;
		Static32.aClass60_429 = Static46.aClass60_632;
		Static91.aClass60_1149 = Static56.aClass60_796;
		Static76.aClass60_1025 = Static75.aClass60_1018;
		Static72.aClass60_966 = Static87.aClass60_678;
		Static128.aClass60_1432 = Static81.aClass60_1080;
		Static18.aClass60_295 = Static57.aClass60_1412;
		Static89.aClass60_1143 = Static8.aClass60_128;
		Static18.aClass60_292 = Static28.aClass60_1391;
		Static20.aClass60_313 = Static93.aClass60_1162;
		Static72.aClass60_962 = Static57.aClass60_1408;
		Static23.aClass60_1127 = Static29.aClass60_391;
		Static39.aClass60_552 = Static127.aClass60_1153;
		Static39.aClass60_539 = Static127.aClass60_1153;
		Static14.aClass60_184 = Static53.aClass60_768;
		Static102.aClass60_1249 = Static103.aClass60_1259;
		Static2.aClass60_56 = Static113.aClass60_1324;
		Static73.aClass60_994 = Static129.aClass60_1436;
		Static83.aClass60_1105 = Static54.aClass60_772;
		Static114.aClass60_1333 = Static21.aClass60_325;
		Static39.aClass60_540 = Static127.aClass60_1153;
		Static96.aClass60_1187 = Static23.aClass60_1118;
		Static2.aClass60_57 = Static35.aClass60_464;
		Static98.aClass60_1204 = Static18.aClass60_297;
		Static39.aClass60_558 = Static127.aClass60_1153;
		Static105.aClass60_1274 = Static50.aClass60_730;
		Static74.aClass60_1015 = Static126.aClass60_1423;
		Static18.aClass60_296 = Static57.aClass60_1410;
		Static62.aClass60_861 = Static126.aClass60_1421;
		Static39.aClass60_553 = Static127.aClass60_1153;
		aClass60_819 = Static101.aClass60_1242;
		Static26.aClass60_375 = Static35.aClass60_462;
		Static62.aClass60_862 = Static51.aClass60_589;
		Static82.aClass60_1093 = Static87.aClass60_677;
		Static108.aClass60_1289 = Static122.aClass60_260;
		Static64.aClass60_892 = Static4.aClass60_75;
		Static61.aClass60_850 = Static108.aClass60_1295;
		Static39.aClass60_544 = Static127.aClass60_1153;
		Static104.aClass60_1264 = Static80.aClass60_1067;
		Static58.aClass60_798 = Static51.aClass60_588;
		Static2.aClass60_54 = Static17.aClass60_282;
		Static98.aClass60_1208 = Static117.aClass60_1339;
		Static77.aClass60_1031 = Static67.aClass60_925;
		Static12.aClass60_161 = Static130.aClass60_1448;
		Static95.aClass60_1165 = Static130.aClass60_1450;
		Static39.aClass60_550 = Static127.aClass60_1153;
		Static15.aClass60_250 = Static63.aClass60_1229;
		Static55.aClass60_777 = Static14.aClass60_193;
		Static102.aClass60_1250 = Static38.aClass60_515;
		Static98.aClass60_1200 = Static21.aClass60_327;
		Static6.aClass60_96 = Static108.aClass60_1294;
		Static129.aClass60_1445 = Static86.aClass60_720;
		Static74.aClass60_1011 = Static126.aClass60_1423;
		Static51.aClass60_587 = Static113.aClass60_1325;
		Static118.aClass60_1345 = Static117.aClass60_1338;
		Static50.aClass60_726 = Static64.aClass60_887;
		Static39.aClass60_527 = Static127.aClass60_1153;
		Static13.aClass60_175 = Static11.aClass60_141;
		Static115.aClass60_1335 = Static12.aClass60_166;
		Static51.aClass60_592 = Static72.aClass60_963;
		Static63.aClass60_1225 = Static29.aClass60_386;
		Static85.aClass60_1132 = Static39.aClass60_560;
		Static39.aClass60_557 = Static127.aClass60_1153;
		Static39.aClass60_545 = Static12.aClass60_158;
		Static39.aClass60_538 = Static127.aClass60_1153;
		Static8.aClass60_131 = Static126.aClass60_1426;
		Static52.aClass60_760 = Static127.aClass60_1154;
		Static39.aClass60_525 = Static127.aClass60_1153;
		Static102.aClass60_1251 = Static105.aClass60_1271;
		Static24.aClass60_354 = Static66.aClass60_901;
		Static50.aClass60_727 = Static56.aClass60_792;
		Static28.aClass60_1392 = Static12.aClass60_163;
		Static8.aClass60_129 = Static2.aClass60_60;
		Static12.aClass60_159 = Static124.aClass60_1358;
		Static48.aClass60_665 = Static71.aClass60_655;
		Static39.aClass60_537 = Static43.aClass60_619;
		Static64.aClass60_886 = Static4.aClass60_75;
		Static62.aClass60_864 = Static85.aClass60_1128;
		Static39.aClass60_526 = Static48.aClass60_673;
		Static86.aClass60_717 = Static51.aClass60_585;
		Static71.aClass60_660 = Static58.aClass60_805;
		Static85.aClass60_1133 = Static39.aClass60_560;
		Static128.aClass60_1428 = Static42.aClass60_616;
		Static36.aClass60_474 = Static99.aClass60_1230;
		Static96.aClass60_1185 = Static74.aClass60_1013;
		Static48.aClass60_664 = Static66.aClass60_898;
		Static53.aClass60_771 = Static108.aClass60_1288;
		Static30.aClass60_405 = Static123.aClass60_1399;
		Static2.aClass60_65 = Static58.aClass60_804;
		Static69.aClass60_937 = Static83.aClass60_1111;
		Static111.aClass60_1310 = Static33.aClass60_447;
		Static39.aClass60_546 = Static11.aClass60_151;
		Static39.aClass60_532 = Static127.aClass60_1153;
		Static15.aClass60_246 = Static84.aClass60_1114;
		Static127.aClass60_1159 = Static115.aClass60_1334;
		Static11.aClass60_148 = Static82.aClass60_1094;
		Static43.aClass60_621 = Static62.aClass60_865;
		Static67.aClass60_922 = Static130.aClass60_1451;
		Static86.aClass60_719 = Static45.aClass60_627;
		Static71.aClass60_661 = Static58.aClass60_806;
		Static14.aClass60_183 = Static118.aClass60_1351;
		Static111.aClass60_1308 = Static3.aClass60_70;
		Static95.aClass60_1169 = Static125.aClass60_1406;
		Static11.aClass60_142 = Static129.aClass60_1441;
		Static39.aClass60_559 = Static127.aClass60_1153;
		Static48.aClass60_667 = Static127.aClass60_1155;
		Static124.aClass60_1359 = Static71.aClass60_657;
		Static43.aClass60_625 = Static28.aClass60_1393;
		Static85.aClass60_1130 = Static95.aClass60_1168;
		Static83.aClass60_1110 = Static74.aClass60_1016;
		Static39.aClass60_547 = Static127.aClass60_1153;
		Static39.aClass60_534 = Static11.aClass60_151;
		Static103.aClass60_1260 = Static42.aClass60_615;
		Static52.aClass60_765 = Static83.aClass60_1102;
		Static39.aClass60_518 = Static127.aClass60_1153;
		Static20.aClass60_312 = Static123.aClass60_1398;
		Static2.aClass60_51 = Static125.aClass60_1407;
		Static39.aClass60_554 = Static127.aClass60_1153;
		Static33.aClass60_444 = Static126.aClass60_1422;
		Static30.aClass60_406 = Static117.aClass60_1341;
		Static13.aClass60_174 = Static22.aClass60_331;
		Static113.aClass60_1328 = Static87.aClass60_679;
		Static29.aClass60_387 = Static96.aClass60_1178;
		Static39.aClass60_555 = Static127.aClass60_1153;
		Static39.aClass60_543 = Static127.aClass60_1153;
		Static17.aClass60_275 = Static52.aClass60_761;
		Static39.aClass60_563 = Static72.aClass60_972;
		Static105.aClass60_1272 = Static96.aClass60_1183;
		Static45.aClass60_629 = Static98.aClass60_1201;
		Static78.aClass60_1036 = Static28.aClass60_1390;
		Static39.aClass60_536 = Static127.aClass60_1153;
		Static73.aClass60_996 = Static78.aClass60_1039;
		Static2.aClass60_63 = Static15.aClass60_244;
		Static3.aClass60_68 = Static98.aClass60_1207;
		Static28.aClass60_1396 = Static70.aClass60_949;
		Static39.aClass60_564 = Static35.aClass60_464;
		Static2.aClass60_49 = Static125.aClass60_1407;
		Static83.aClass60_1109 = Static55.aClass60_781;
		Static42.aClass60_612 = Static72.aClass60_974;
		Static124.aClass60_1360 = Static49.aClass60_693;
		Static30.aClass60_398 = Static123.aClass60_1399;
		Static98.aClass60_1209 = Static45.aClass60_630;
		Static39.aClass60_520 = Static127.aClass60_1153;
		Static100.aClass60_1238 = Static82.aClass60_1095;
		Static17.aClass60_283 = Static80.aClass60_1064;
		Static27.aClass60_383 = Static118.aClass60_1355;
		Static102.aClass60_1244 = Static60.aClass60_823;
		Static20.aClass60_308 = Static111.aClass60_1307;
		Static58.aClass60_800 = Static129.aClass60_1437;
		Static2.aClass60_58 = Static35.aClass60_464;
		Static78.aClass60_1037 = Static8.aClass60_132;
		Static50.aClass60_731 = Static99.aClass60_1231;
		Static34.aClass60_461 = Static123.aClass60_1397;
		Static51.aClass60_590 = Static21.aClass60_323;
		Static39.aClass60_521 = Static79.aClass60_1053;
		Static49.aClass60_690 = Static67.aClass60_924;
		Static14.aClass60_185 = Static66.aClass60_900;
		Static70.aClass60_951 = Static43.aClass60_617;
		Static81.aClass60_1081 = Static6.aClass60_95;
		Static128.aClass60_1433 = Static51.aClass60_584;
		Static81.aClass60_1083 = Static14.aClass60_188;
		Static39.aClass60_530 = Static23.aClass60_1122;
		Static36.aClass60_471 = Static17.aClass60_284;
		Static46.aClass60_636 = Static70.aClass60_950;
		Static49.aClass60_699 = Static75.aClass60_1023;
		Static66.aClass60_895 = Static33.aClass60_443;
		Static39.aClass60_542 = Static130.aClass60_1452;
		Static125.aClass60_1403 = Static101.aClass60_1243;
		Static93.aClass60_1163 = Static52.aClass60_759;
		Static107.aClass60_1287 = Static68.aClass60_935;
		Static39.aClass60_524 = Static127.aClass60_1153;
		Static98.aClass60_1197 = Static21.aClass60_327;
		Static68.aClass60_931 = Static43.aClass60_618;
		Static51.aClass60_594 = Static89.aClass60_1142;
		Static126.aClass60_1419 = Static54.aClass60_774;
		Static89.aClass60_1141 = Static54.aClass60_773;
		Static21.aClass60_328 = Static16.aClass60_266;
		Static82.aClass60_1097 = Static74.aClass60_1017;
		Static2.aClass60_61 = Static11.aClass60_152;
		Static2.aClass60_52 = Static35.aClass60_464;
		Static2.aClass60_50 = Static74.aClass60_1010;
		Static86.aClass60_722 = Static130.aClass60_1449;
		Static60.aClass60_825 = Static14.aClass60_191;
		Static125.aClass60_1402 = Static29.aClass60_385;
		Static109.aClass60_1304 = Static118.aClass60_1354;
		Static39.aClass60_556 = Static129.aClass60_1443;
		Static39.aClass60_562 = aClass60_817;
		Static83.aClass60_1098 = Static126.aClass60_1420;
		Static96.aClass60_1191 = Static127.aClass60_1153;
		Static11.aClass60_147 = Static64.aClass60_893;
		Static39.aClass60_529 = Static63.aClass60_1227;
		Static33.aClass60_450 = Static119.aClass60_1363;
		Static84.aClass60_1113 = Static77.aClass60_1027;
		Static56.aClass60_793 = Static100.aClass60_1235;
		Static32.aClass60_432 = Static10.aClass60_136;
		Static83.aClass60_1103 = Static61.aClass60_854;
		Static12.aClass60_160 = Static6.aClass60_99;
		Static64.aClass60_885 = Static74.aClass60_1014;
		Static67.aClass60_929 = Static24.aClass60_353;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
	public static void method1203() {
		aClass60_818 = null;
		anIntArray204 = null;
		aClass60_819 = null;
		aClass60_820 = null;
		aClass60_817 = null;
		aClass25_15 = null;
		aClass3_Sub1_Sub1_Sub3_Sub2Array1 = null;
		aClass60_821 = null;
	}
}
