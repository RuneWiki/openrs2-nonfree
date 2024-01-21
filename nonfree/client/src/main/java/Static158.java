import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	public static int anInt4007;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!bh;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Lclient!ja;")
	public static Class40 aClass40_5;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1085 = method3034("sl_back");

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1086 = method3034("settings");

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1090 = method3034("Could not complete login)3");

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1087 = aClass60_1090;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1088 = method3034("blinken1:");

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	public static int anInt4006 = -1;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	public static int anInt4008 = -1;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1089 = method3034("Schlie-8en");

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
	public static int method3033() {
		@Pc(16) int local16 = Static182.method3393(Static62.anInt1923, Static161.anInt4013, Static166.anInt4103);
		return local16 - Static172.anInt4190 >= 800 || (Static147.aByteArrayArrayArray36[Static62.anInt1923][Static161.anInt4013 >> 7][Static166.anInt4103 >> 7] & 0x4) == 0 ? 3 : Static62.anInt1923;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ob;")
	public static Class60 method3034(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(11) int local11 = 0;
		@Pc(20) Class60 local20 = new Class60();
		local20.aByteArray39 = new byte[local9];
		while (local11 < local9) {
			@Pc(32) int local32 = local6[local11++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local11 >= local9) {
					break;
				}
				@Pc(50) int local50 = local6[local11++] & 0xFF;
				local20.aByteArray39[local20.anInt3466++] = (byte) ((local32 - 40) * 43 + local50 - 48);
			} else if (local32 != 0) {
				local20.aByteArray39[local20.anInt3466++] = (byte) local32;
			}
		}
		local20.method2701();
		return local20.method2668();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method3035() {
		Static183.aClass60_1264 = Static44.aClass60_318;
		Static181.aClass60_1217 = Static122.aClass60_929;
		Static165.aClass60_1125 = Static48.aClass60_343;
		Static111.aClass60_870 = Static111.aClass60_871;
		Static22.aClass60_167 = Static178.aClass60_1193;
		Static143.aClass60_1019 = Static123.aClass60_945;
		Static37.aClass60_258 = Static86.aClass60_686;
		Static183.aClass60_1230 = Static49.aClass60_355;
		Static181.aClass60_1214 = Static74.aClass60_606;
		Static164.aClass60_1117 = Static82.aClass60_653;
		Static168.aClass60_1136 = Static61.aClass60_452;
		Static56.aClass60_408 = Static166.aClass60_1127;
		Static22.aClass60_163 = Static186.aClass60_1279;
		Static165.aClass60_1119 = Static189.aClass60_1286;
		Static73.aClass60_542 = Static46.aClass60_329;
		Static73.aClass60_537 = Static76.aClass60_624;
		Static197.aClass60_1329 = Static153.aClass60_1060;
		Static151.aClass60_741 = Static73.aClass60_539;
		Static76.aClass60_625 = Static83.aClass60_668;
		Static83.aClass60_670 = Static155.aClass60_1066;
		Static196.aClass60_1316 = Static48.aClass60_342;
		Static65.aClass60_493 = Static177.aClass60_1189;
		Static7.aClass60_1326 = Static179.aClass60_1202;
		Static56.aClass60_405 = Static55.aClass60_403;
		Static183.aClass60_1239 = Static140.aClass60_1004;
		Static86.aClass60_693 = Static46.aClass60_328;
		Static1.aClass60_6 = Static176.aClass60_1183;
		aClass60_1087 = Static127.aClass60_966;
		Static113.aClass60_888 = Static104.aClass60_847;
		Static36.aClass60_248 = Static142.aClass60_1015;
		Static177.aClass60_1187 = Static77.aClass60_632;
		Static157.aClass60_1080 = Static98.aClass60_790;
		Static183.aClass60_1257 = Static49.aClass60_355;
		Static3.aClass60_26 = Static90.aClass60_722;
		Static74.aClass60_605 = Static159.aClass60_1229;
		Static98.aClass60_792 = Static184.aClass60_1272;
		Static76.aClass60_619 = Static149.aClass60_1049;
		Static147.aClass60_1039 = Static113.aClass60_891;
		Static183.aClass60_1248 = Static49.aClass60_355;
		Static3.aClass60_24 = Static177.aClass60_1191;
		Static90.aClass60_716 = Static160.aClass60_491;
		Static70.aClass60_526 = Static193.aClass60_1311;
		Static22.aClass60_160 = Static53.aClass60_383;
		Static183.aClass60_1260 = Static185.aClass60_1274;
		Static181.aClass60_1211 = Static149.aClass60_1048;
		Static183.aClass60_1231 = Static49.aClass60_355;
		Static58.aClass60_425 = aClass60_1089;
		Static80.aClass60_644 = Static76.aClass60_622;
		Static70.aClass60_529 = Static30.aClass60_216;
		Static183.aClass60_1249 = Static49.aClass60_355;
		Static172.aClass60_1157 = Static155.aClass60_1063;
		Static49.aClass60_353 = Static20.aClass60_137;
		Static136.aClass60_991 = Static91.aClass60_747;
		Static18.aClass60_1219 = Static196.aClass60_1321;
		Static144.aClass60_1025 = Static112.aClass60_880;
		Static114.aClass60_898 = Static95.aClass60_779;
		Static103.aClass60_842 = Static177.aClass60_1190;
		Static35.aClass60_858 = Static1.aClass60_4;
		Static123.aClass60_942 = Static174.aClass60_1172;
		Static12.aClass60_104 = Static64.aClass60_482;
		Static103.aClass60_837 = Static108.aClass60_861;
		Static25.aClass60_183 = Static123.aClass60_943;
		Static197.aClass60_1331 = Static163.aClass60_1109;
		Static183.aClass60_1266 = Static49.aClass60_355;
		Static8.aClass60_72 = Static183.aClass60_1268;
		Static1.aClass60_8 = Static153.aClass60_1054;
		Static182.aClass60_1221 = Static96.aClass60_868;
		Static79.aClass60_640 = Static159.aClass60_1228;
		Static179.aClass60_1204 = Static84.aClass60_677;
		Static183.aClass60_1247 = Static65.aClass60_492;
		Static103.aClass60_838 = Static49.aClass60_355;
		Static43.aClass60_311 = Static126.aClass60_959;
		Static172.aClass60_1158 = Static155.aClass60_1063;
		Static76.aClass60_617 = Static83.aClass60_668;
		Static114.aClass60_895 = Static180.aClass60_920;
		Static155.aClass60_1062 = Static117.aClass60_220;
		Static138.aClass60_157 = Static165.aClass60_1122;
		Static31.aClass60_229 = Static37.aClass60_262;
		Static183.aClass60_1232 = Static49.aClass60_355;
		Static41.aClass60_296 = Static122.aClass60_933;
		Static90.aClass60_717 = Static112.aClass60_878;
		Static183.aClass60_1269 = Static49.aClass60_355;
		Static102.aClass60_828 = Static114.aClass60_899;
		Static155.aClass60_1064 = Static161.aClass60_1095;
		Static169.aClass60_1145 = Static32.aClass60_235;
		Static4.aClass60_34 = Static167.aClass60_1133;
		Static171.aClass60_1153 = Static3.aClass60_21;
		Static54.aClass60_397 = Static49.aClass60_352;
		Static156.aClass60_1073 = Static87.aClass60_700;
		Static88.aClass60_704 = Static64.aClass60_475;
		Static185.aClass60_1277 = Static61.aClass60_451;
		Static122.aClass60_931 = Static185.aClass60_1275;
		Static183.aClass60_1270 = Static119.aClass60_922;
		Static64.aClass60_476 = Static136.aClass60_990;
		Static131.aClass60_58 = Static138.aClass60_155;
		Static66.aClass60_501 = Static50.aClass60_362;
		Static183.aClass60_1255 = Static49.aClass60_355;
		Static6.aClass60_69 = Static90.aClass60_719;
		Static183.aClass60_1253 = Static49.aClass60_355;
		Static183.aClass60_1243 = Static49.aClass60_355;
		Static125.aClass60_952 = Static100.aClass60_796;
		Static31.aClass60_223 = aClass60_1088;
		Static57.aClass60_413 = Static162.aClass60_1104;
		Static57.aClass60_415 = Static78.aClass60_639;
		Static6.aClass60_64 = Static132.aClass60_988;
		Static193.aClass60_1310 = Static127.aClass60_965;
		Static79.aClass60_643 = Static159.aClass60_1228;
		Static183.aClass60_1242 = Static161.aClass60_1091;
		Static58.aClass60_424 = Static125.aClass60_957;
		Static183.aClass60_1263 = Static185.aClass60_1274;
		Static183.aClass60_1237 = Static49.aClass60_355;
		Static161.aClass60_1093 = Static60.aClass60_444;
		Static21.aClass60_146 = Static171.aClass60_1156;
		Static70.aClass60_528 = Static33.aClass60_246;
		Static166.aClass60_1126 = Static194.aClass60_1314;
		Static183.aClass60_1244 = Static161.aClass60_1091;
		Static113.aClass60_890 = Static57.aClass60_412;
		Static89.aClass60_708 = Static101.aClass60_815;
		Static58.aClass60_422 = Static37.aClass60_254;
		Static49.aClass60_357 = Static88.aClass60_706;
		Static70.aClass60_518 = Static162.aClass60_1105;
		Static31.aClass60_228 = Static62.aClass60_455;
		Static67.aClass60_507 = Static33.aClass60_243;
		Static83.aClass60_665 = Static73.aClass60_544;
		Static141.aClass60_1008 = Static175.aClass60_1176;
		Static22.aClass60_159 = Static53.aClass60_383;
		Static60.aClass60_445 = Static188.aClass60_1280;
		Static30.aClass60_214 = Static100.aClass60_798;
		Static183.aClass60_1235 = Static49.aClass60_355;
		Static77.aClass60_636 = Static108.aClass60_862;
		Static47.aClass60_822 = Static115.aClass60_906;
		Static183.aClass60_1233 = Static49.aClass60_355;
		Static8.aClass60_77 = Static125.aClass60_958;
		Static59.aClass60_433 = Static64.aClass60_485;
		Static150.aClass60_1052 = Static22.aClass60_166;
		Static183.aClass60_1262 = Static60.aClass60_443;
		Static116.aClass60_910 = Static37.aClass60_260;
		Static183.aClass60_1246 = Static49.aClass60_355;
		Static149.aClass60_1046 = Static179.aClass60_1201;
		Static183.aClass60_1241 = Static49.aClass60_355;
		Static22.aClass60_161 = Static186.aClass60_1279;
		Static55.aClass60_399 = Static71.aClass60_1169;
		Static95.aClass60_780 = Static156.aClass60_1075;
		Static77.aClass60_634 = Static59.aClass60_436;
		Static96.aClass60_867 = Static8.aClass60_83;
		Static52.aClass60_375 = Static4.aClass60_39;
		Static75.aClass60_610 = Static80.aClass60_648;
		Static183.aClass60_1259 = Static98.aClass60_791;
		Static183.aClass60_1265 = Static186.aClass60_1279;
		Static125.aClass60_955 = Static9.aClass60_87;
		Static11.aClass60_101 = Static115.aClass60_908;
		Static163.aClass60_1108 = Static167.aClass60_1134;
		Static42.aClass60_299 = Static17.aClass60_130;
		Static183.aClass60_1236 = Static95.aClass60_783;
		Static8.aClass60_78 = Static129.aClass60_975;
		Static64.aClass60_478 = Static148.aClass60_1045;
		Static193.aClass60_1306 = Static178.aClass60_1192;
		Static22.aClass60_158 = Static186.aClass60_1279;
		Static86.aClass60_690 = Static15.aClass60_119;
		Static183.aClass60_1245 = Static49.aClass60_355;
		Static175.aClass60_1175 = Static166.aClass60_1130;
		Static40.aClass60_295 = Static188.aClass60_1281;
		Static36.aClass60_251 = Static21.aClass60_144;
		Static86.aClass60_687 = Static111.aClass60_873;
		Static143.aClass60_1017 = Static175.aClass60_1174;
		Static130.aClass60_982 = Static144.aClass60_1024;
		Static29.aClass60_210 = Static129.aClass60_977;
		Static36.aClass60_250 = Static142.aClass60_1015;
		Static183.aClass60_1234 = Static49.aClass60_355;
		Static57.aClass60_411 = Static78.aClass60_639;
		Static183.aClass60_1251 = Static49.aClass60_355;
		Static48.aClass60_344 = Static165.aClass60_1121;
		Static183.aClass60_1258 = Static91.aClass60_744;
		Static1.aClass60_7 = Static17.aClass60_129;
		Static182.aClass60_1223 = Static15.aClass60_120;
		Static145.aClass60_1030 = Static90.aClass60_721;
		Static183.aClass60_1252 = Static49.aClass60_355;
		Static73.aClass60_538 = Static40.aClass60_294;
		Static83.aClass60_662 = Static76.aClass60_618;
		Static130.aClass60_979 = Static25.aClass60_185;
		Static22.aClass60_164 = Static178.aClass60_1193;
		Static112.aClass60_879 = Static91.aClass60_746;
		Static100.aClass60_797 = Static42.aClass60_300;
		Static6.aClass60_65 = Static83.aClass60_661;
		Static183.aClass60_1240 = Static14.aClass60_113;
		Static123.aClass60_941 = Static38.aClass60_267;
		Static93.aClass60_761 = Static27.aClass60_199;
		Static22.aClass60_169 = Static31.aClass60_230;
		Static180.aClass60_917 = Static198.aClass60_1335;
		Static77.aClass60_629 = Static171.aClass60_1155;
		Static190.aClass60_1294 = Static77.aClass60_630;
		Static183.aClass60_1267 = Static93.aClass60_760;
		Static83.aClass60_667 = Static36.aClass60_249;
		Static196.aClass60_1320 = Static68.aClass60_509;
		Static146.aClass60_1036 = Static134.aClass60_989;
		Static183.aClass60_1254 = Static49.aClass60_355;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Lclient!fc;")
	public static Class2_Sub1_Sub9 method3037(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub9 local10 = (Class2_Sub1_Sub9) Static183.aClass89_67.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static71.aClass13_37.method521(Static2.method3174(arg0), Static58.method1360(arg0));
		local10 = new Class2_Sub1_Sub9();
		local10.anInt1653 = arg0;
		if (local29 != null) {
			local10.method1253(new Class2_Sub3(local29));
		}
		local10.method1252();
		if (local10.aBoolean64) {
			local10.anInt1674 = 0;
			local10.aBoolean63 = false;
		}
		Static183.aClass89_67.method3432(local10, (long) arg0);
		return local10;
	}
}
