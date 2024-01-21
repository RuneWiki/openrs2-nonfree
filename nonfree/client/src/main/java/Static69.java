import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ca;")
	public static Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!rc;")
	private static Class55 aClass55_809 = Static34.method846("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_807 = aClass55_809;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_808 = Static34.method846("Lade Texturen )2 ");

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!rc;")
	public static Class55 aClass55_810 = Static34.method846("backbase1");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	public static int[] anIntArray191 = new int[128];

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	public static int anInt2034 = 0;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!rc;")
	private static Class55 aClass55_811 = Static34.method846(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method1380() {
		Static86.method1675();
		@Pc(20) int local20;
		@Pc(22) int local22;
		if (Static92.anInt2560 == 2) {
			@Pc(14) int[] local14 = Static53.anIntArray180;
			@Pc(17) byte[] local17 = Static67.aClass6_Sub2_Sub2_Sub1_15.aByteArray4;
			local20 = local17.length;
			for (local22 = 0; local22 < local20; local22++) {
				if (local17[local22] == 0) {
					local14[local22] = 0;
				}
			}
			Static26.aClass6_Sub2_Sub2_Sub2_13.method628(0, 0, 33, 33, 25, 25, Static14.anInt811, 256, Static85.anIntArray237, Static41.anIntArray97);
			Static61.method1313();
			return;
		}
		@Pc(61) int local61 = Static14.anInt811 + Static8.anInt383 & 0x7FF;
		local20 = 464 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
		@Pc(76) int local76 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32 + 48;
		Static67.aClass6_Sub2_Sub2_Sub2_12.method628(25, 5, 146, 151, local76, local20, local61, Static27.anInt1352 + 256, Static3.anIntArray5, Static44.anIntArray258);
		for (local22 = 0; local22 < Static6.anInt270; local22++) {
			local76 = Static65.anIntArray186[local22] * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
			local20 = Static41.anIntArray96[local22] * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
			Static50.method2082(local20, local76, Static67.aClass6_Sub2_Sub2_Sub2Array11[local22]);
		}
		@Pc(148) int local148;
		for (@Pc(144) int local144 = 0; local144 < 104; local144++) {
			for (local148 = 0; local148 < 104; local148++) {
				@Pc(158) Class3 local158 = Static105.aClass3ArrayArrayArray1[Static56.anInt1718][local144][local148];
				if (local158 != null) {
					local76 = local144 * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
					local20 = local148 * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
					Static50.method2082(local20, local76, Static12.aClass6_Sub2_Sub2_Sub2Array2[0]);
				}
			}
		}
		for (local148 = 0; local148 < Static111.anInt3173; local148++) {
			@Pc(211) Class6_Sub2_Sub3_Sub1_Sub2 local211 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static19.anIntArray60[local148]];
			if (local211 != null && local211.method1826()) {
				@Pc(220) Class6_Sub2_Sub4 local220 = local211.aClass6_Sub2_Sub4_1;
				if (local220.anIntArray48 != null) {
					local220 = local220.method542();
				}
				if (local220 != null && local220.aBoolean37 && local220.aBoolean39) {
					local76 = local211.anInt2710 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
					local20 = local211.anInt2744 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
					Static50.method2082(local20, local76, Static12.aClass6_Sub2_Sub2_Sub2Array2[1]);
				}
			}
		}
		@Pc(278) Class6_Sub2_Sub3_Sub1_Sub1 local278;
		for (@Pc(270) int local270 = 0; local270 < Static78.anInt2246; local270++) {
			local278 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static101.anIntArray283[local270]];
			if (local278 != null && local278.method1826()) {
				@Pc(286) boolean local286 = false;
				local76 = local278.anInt2710 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
				local20 = local278.anInt2744 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
				@Pc(313) long local313 = local278.aClass55_245.method1639();
				for (@Pc(315) int local315 = 0; local315 < Static64.anInt1912; local315++) {
					if (local313 == Static8.aLongArray1[local315] && Static102.anIntArray286[local315] != 0) {
						local286 = true;
						break;
					}
				}
				@Pc(341) boolean local341 = false;
				if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt677 != 0 && local278.anInt677 != 0 && Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt677 == local278.anInt677) {
					local341 = true;
				}
				if (local286) {
					Static50.method2082(local20, local76, Static12.aClass6_Sub2_Sub2_Sub2Array2[3]);
				} else if (local341) {
					Static50.method2082(local20, local76, Static12.aClass6_Sub2_Sub2_Sub2Array2[4]);
				} else {
					Static50.method2082(local20, local76, Static12.aClass6_Sub2_Sub2_Sub2Array2[2]);
				}
			}
		}
		if (Static110.anInt3147 != 0 && Static85.anInt2389 % 20 < 10) {
			if (Static110.anInt3147 == 1 && Static65.anInt1945 >= 0 && Static65.anInt1945 < Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1.length) {
				@Pc(421) Class6_Sub2_Sub3_Sub1_Sub2 local421 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static65.anInt1945];
				if (local421 != null) {
					local20 = local421.anInt2744 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
					local76 = local421.anInt2710 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
					Static64.method1340(Static39.aClass6_Sub2_Sub2_Sub2Array8[1], local20, local76);
				}
			}
			if (Static110.anInt3147 == 2) {
				local76 = (Static51.anInt1586 - Static18.anInt938) * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
				local20 = (Static35.anInt1333 - Static88.anInt3276) * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
				Static64.method1340(Static39.aClass6_Sub2_Sub2_Sub2Array8[1], local20, local76);
			}
			if (Static110.anInt3147 == 10 && Static110.anInt3152 >= 0 && Static110.anInt3152 < Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3.length) {
				local278 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[Static110.anInt3152];
				if (local278 != null) {
					local20 = local278.anInt2744 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
					local76 = local278.anInt2710 / 32 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
					Static64.method1340(Static39.aClass6_Sub2_Sub2_Sub2Array8[1], local20, local76);
				}
			}
		}
		if (Static8.anInt378 != 0) {
			local20 = Static41.anInt1398 * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744 / 32;
			local76 = Static8.anInt378 * 4 + 2 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710 / 32;
			Static50.method2082(local20, local76, Static39.aClass6_Sub2_Sub2_Sub2Array8[0]);
		}
		Static53.method1276(97, 78, 3, 3, 16777215);
		Static26.aClass6_Sub2_Sub2_Sub2_13.method628(0, 0, 33, 33, 25, 25, Static14.anInt811, 256, Static85.anIntArray237, Static41.anIntArray97);
		Static61.method1313();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
	public static void method1381() {
		Static97.aClass55_1195 = Static87.aClass55_1003;
		Static92.aClass55_1100 = Static1.aClass55_6;
		Static92.aClass55_1091 = Static54.aClass55_651;
		Static70.aClass55_834 = aClass55_811;
		Static79.aClass55_919 = Static9.aClass55_159;
		Static41.aClass55_542 = Static111.aClass55_1327;
		Static55.aClass55_662 = Static94.aClass55_1132;
		Static10.aClass55_249 = Static50.aClass55_1367;
		Static52.aClass55_632 = Static91.aClass55_1058;
		Static90.aClass55_1043 = Static97.aClass55_1184;
		Static51.aClass55_612 = Static74.aClass55_700;
		Static85.aClass55_997 = Static63.aClass55_751;
		Static28.aClass55_423 = Static41.aClass55_543;
		Static39.aClass55_660 = Static1.aClass55_1;
		Static92.aClass55_1084 = Static8.aClass55_151;
		Static89.aClass55_1020 = Static102.aClass55_1272;
		Static15.aClass55_283 = Static74.aClass55_691;
		Static90.aClass55_1042 = Static44.aClass55_1149;
		Static92.aClass55_1075 = Static43.aClass55_561;
		Static67.aClass55_792 = Static49.aClass55_600;
		Static47.aClass55_585 = Static39.aClass55_654;
		Static103.aClass55_1275 = Static112.aClass55_1352;
		Static18.aClass55_326 = Static101.aClass55_1251;
		Static92.aClass55_1064 = Static58.aClass55_677;
		Static100.aClass55_1236 = Static51.aClass55_613;
		Static6.aClass55_120 = Static3.aClass55_14;
		Static92.aClass55_1069 = Static1.aClass55_6;
		Static44.aClass55_1165 = Static96.aClass55_1180;
		Static99.aClass55_1219 = Static19.aClass55_336;
		Static90.aClass55_1047 = Static98.aClass55_1197;
		Static110.aClass55_1324 = Static91.aClass55_1061;
		Static72.aClass55_864 = Static96.aClass55_1183;
		Static101.aClass55_1262 = Static29.aClass55_426;
		Static92.aClass55_1068 = Static33.aClass55_480;
		Static92.aClass55_1077 = Static1.aClass55_6;
		Static67.aClass55_791 = Static19.aClass55_330;
		Static98.aClass55_1200 = Static94.aClass55_1130;
		Static92.aClass55_1089 = Static64.aClass55_764;
		Static17.aClass55_319 = Static52.aClass55_635;
		Static92.aClass55_1086 = Static1.aClass55_6;
		Static85.aClass55_998 = Static88.aClass55_1372;
		Static11.aClass55_256 = Static54.aClass55_650;
		Static75.aClass55_869 = Static11.aClass55_255;
		Static21.aClass55_367 = Static83.aClass55_959;
		Static83.aClass55_956 = Static49.aClass55_603;
		Static112.aClass55_1356 = Static52.aClass55_641;
		Static68.aClass55_803 = Static50.aClass55_1366;
		Static39.aClass55_655 = Static106.aClass55_971;
		Static92.aClass55_1072 = Static49.aClass55_600;
		Static100.aClass55_1235 = Static51.aClass55_613;
		Static92.aClass55_1088 = Static100.aClass55_1239;
		Static97.aClass55_1193 = Static108.aClass55_1307;
		Static10.aClass55_246 = Static101.aClass55_1252;
		Static67.aClass55_786 = Static19.aClass55_330;
		Static33.aClass55_483 = Static51.aClass55_608;
		Static92.aClass55_1066 = Static1.aClass55_6;
		Static98.aClass55_1202 = Static32.aClass55_462;
		Static92.aClass55_1099 = Static1.aClass55_6;
		Static33.aClass55_486 = Static22.aClass55_368;
		Static74.aClass55_690 = Static112.aClass55_1361;
		Static10.aClass55_243 = Static61.aClass55_736;
		Static52.aClass55_637 = Static52.aClass55_631;
		aClass55_807 = Static87.aClass55_1007;
		Static61.aClass55_746 = Static51.aClass55_615;
		Static17.aClass55_310 = Static114.aClass55_1376;
		Static31.aClass55_455 = Static54.aClass55_649;
		Static64.aClass55_761 = Static105.aClass55_1292;
		Static110.aClass55_1325 = Static1.aClass55_3;
		Static21.aClass55_365 = Static33.aClass55_487;
		Static90.aClass55_1053 = Static17.aClass55_318;
		Static15.aClass55_282 = Static88.aClass55_1373;
		Static35.aClass55_523 = Static70.aClass55_836;
		Static43.aClass55_559 = Static87.aClass55_1008;
		Static17.aClass55_309 = Static50.aClass55_1363;
		Static78.aClass55_898 = Static5.aClass55_884;
		Static61.aClass55_745 = Static74.aClass55_698;
		Static92.aClass55_1097 = Static1.aClass55_6;
		Static17.aClass55_316 = Static17.aClass55_308;
		Static32.aClass55_460 = Static64.aClass55_767;
		Static61.aClass55_739 = Static61.aClass55_742;
		Static3.aClass55_9 = Static78.aClass55_903;
		Static78.aClass55_899 = Static5.aClass55_881;
		Static51.aClass55_610 = Static3.aClass55_11;
		Static100.aClass55_1238 = Static112.aClass55_1349;
		Static39.aClass55_657 = Static97.aClass55_1186;
		Static20.aClass55_348 = Static3.aClass55_13;
		Static3.aClass55_10 = Static65.aClass55_772;
		Static107.aClass55_1302 = Static19.aClass55_332;
		Static44.aClass55_1151 = Static75.aClass55_868;
		Static83.aClass55_950 = Static63.aClass55_747;
		Static67.aClass55_785 = Static49.aClass55_600;
		Static31.aClass55_456 = Static26.aClass55_870;
		Static19.aClass55_333 = Static90.aClass55_1049;
		Static114.aClass55_1377 = Static97.aClass55_1185;
		Static87.aClass55_1005 = Static83.aClass55_957;
		Static52.aClass55_633 = aClass55_808;
		Static92.aClass55_1071 = Static33.aClass55_480;
		Static57.aClass55_676 = Static77.aClass55_894;
		Static85.aClass55_996 = Static93.aClass55_1115;
		Static63.aClass55_748 = Static86.aClass55_999;
		Static34.aClass55_513 = Static14.aClass55_266;
		Static112.aClass55_1351 = Static23.aClass55_380;
		Static92.aClass55_1080 = Static1.aClass55_6;
		Static101.aClass55_1257 = Static64.aClass55_763;
		Static92.aClass55_1095 = Static1.aClass55_6;
		Static23.aClass55_379 = Static3.aClass55_12;
		Static71.aClass55_860 = Static7.aClass55_128;
		Static67.aClass55_788 = Static29.aClass55_432;
		Static94.aClass55_1133 = Static64.aClass55_768;
		Static41.aClass55_541 = Static78.aClass55_900;
		Static47.aClass55_582 = Static17.aClass55_314;
		Static70.aClass55_825 = Static65.aClass55_771;
		Static68.aClass55_805 = Static64.aClass55_765;
		Static7.aClass55_121 = Static89.aClass55_1028;
		Static21.aClass55_364 = Static33.aClass55_487;
		Static112.aClass55_1347 = Static101.aClass55_1260;
		Static44.aClass55_1157 = Static75.aClass55_866;
		Static44.aClass55_1154 = Static15.aClass55_281;
		Static70.aClass55_832 = Static11.aClass55_251;
		Static20.aClass55_344 = Static70.aClass55_827;
		Static92.aClass55_1085 = Static1.aClass55_6;
		Static72.aClass55_861 = Static32.aClass55_461;
		Static98.aClass55_1206 = Static112.aClass55_1355;
		Static91.aClass55_1055 = Static114.aClass55_1382;
		Static112.aClass55_1359 = Static101.aClass55_1260;
		Static24.aClass55_395 = Static39.aClass55_652;
		Static101.aClass55_1261 = Static101.aClass55_1259;
		Static23.aClass55_376 = Static32.aClass55_465;
		Static45.aClass55_569 = Static65.aClass55_770;
		Static33.aClass55_482 = Static100.aClass55_1234;
		Static24.aClass55_396 = Static76.aClass55_892;
		Static70.aClass55_835 = Static70.aClass55_833;
		Static57.aClass55_671 = Static4.aClass55_984;
		Static18.aClass55_327 = Static98.aClass55_1198;
		Static49.aClass55_602 = Static52.aClass55_640;
		Static44.aClass55_1164 = Static9.aClass55_162;
		Static92.aClass55_1092 = Static1.aClass55_6;
		Static20.aClass55_340 = Static31.aClass55_449;
		Static92.aClass55_1081 = Static1.aClass55_6;
		Static92.aClass55_1065 = Static56.aClass55_668;
		Static83.aClass55_958 = Static18.aClass55_328;
		Static59.aClass55_703 = Static112.aClass55_1348;
		Static50.aClass55_1368 = Static19.aClass55_334;
		Static102.aClass55_1270 = Static78.aClass55_905;
		Static7.aClass55_126 = Static12.aClass55_261;
		Static12.aClass55_260 = Static44.aClass55_1158;
		Static92.aClass55_1102 = Static1.aClass55_6;
		Static83.aClass55_962 = Static1.aClass55_2;
		Static38.aClass55_537 = Static56.aClass55_667;
		Static74.aClass55_696 = Static114.aClass55_1379;
		Static112.aClass55_1360 = Static96.aClass55_1182;
		Static104.aClass55_1288 = Static101.aClass55_1255;
		Static18.aClass55_324 = Static97.aClass55_1190;
		Static11.aClass55_250 = Static54.aClass55_650;
		Static52.aClass55_636 = Static5.aClass55_880;
		Static43.aClass55_558 = Static102.aClass55_1268;
		Static78.aClass55_904 = Static76.aClass55_888;
		Static102.aClass55_1273 = Static70.aClass55_826;
		Static101.aClass55_1258 = Static85.aClass55_992;
		Static66.aClass55_781 = Static17.aClass55_312;
		Static92.aClass55_1073 = Static45.aClass55_568;
		Static29.aClass55_427 = Static99.aClass55_1221;
		Static89.aClass55_1026 = Static49.aClass55_601;
		Static35.aClass55_522 = Static39.aClass55_656;
		Static90.aClass55_1046 = Static108.aClass55_1304;
		Static20.aClass55_339 = Static34.aClass55_499;
		Static74.aClass55_695 = Static44.aClass55_1161;
		Static22.aClass55_373 = Static46.aClass55_1343;
		Static92.aClass55_1079 = Static1.aClass55_6;
		Static92.aClass55_1093 = Static8.aClass55_151;
		Static81.aClass55_924 = Static87.aClass55_1006;
		Static92.aClass55_1083 = Static91.aClass55_1062;
		Static7.aClass55_124 = Static52.aClass55_640;
		Static108.aClass55_1303 = Static19.aClass55_331;
		Static92.aClass55_1067 = Static1.aClass55_6;
		Static5.aClass55_885 = Static110.aClass55_1322;
		Static52.aClass55_630 = Static93.aClass55_1116;
		Static67.aClass55_793 = Static49.aClass55_600;
		Static31.aClass55_448 = Static1.aClass55_4;
		Static89.aClass55_1022 = Static112.aClass55_1354;
		Static26.aClass55_873 = Static114.aClass55_1374;
		Static105.aClass55_1290 = Static56.aClass55_669;
		Static92.aClass55_1070 = Static101.aClass55_1256;
		Static92.aClass55_1078 = Static14.aClass55_267;
		Static92.aClass55_1103 = Static45.aClass55_567;
		Static55.aClass55_661 = Static51.aClass55_614;
		Static31.aClass55_447 = Static97.aClass55_1191;
		Static78.aClass55_895 = Static18.aClass55_328;
		Static44.aClass55_1167 = Static34.aClass55_508;
		Static49.aClass55_595 = Static33.aClass55_484;
		Static5.aClass55_887 = Static21.aClass55_366;
		Static83.aClass55_955 = Static94.aClass55_1134;
		Static81.aClass55_926 = Static89.aClass55_1027;
		Static34.aClass55_512 = Static91.aClass55_1060;
		Static103.aClass55_1280 = Static112.aClass55_1346;
		Static106.aClass55_966 = Static20.aClass55_341;
		Static70.aClass55_829 = Static97.aClass55_1188;
		Static27.aClass55_528 = Static101.aClass55_1264;
		Static98.aClass55_1196 = Static47.aClass55_586;
		Static91.aClass55_1057 = Static27.aClass55_530;
		Static24.aClass55_393 = Static85.aClass55_993;
		Static79.aClass55_921 = Static88.aClass55_1369;
		Static92.aClass55_1096 = Static1.aClass55_6;
		Static106.aClass55_973 = Static66.aClass55_782;
		Static76.aClass55_889 = Static15.aClass55_285;
		Static67.aClass55_790 = Static34.aClass55_500;
		Static31.aClass55_457 = Static47.aClass55_584;
		Static64.aClass55_762 = Static15.aClass55_284;
		Static11.aClass55_258 = Static22.aClass55_375;
		Static49.aClass55_598 = Static102.aClass55_1274;
		Static92.aClass55_1082 = Static1.aClass55_6;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1382() {
		aClass55_811 = null;
		aClass55_807 = null;
		anIntArray191 = null;
		aClass55_810 = null;
		aClass55_808 = null;
		aClass9_1 = null;
		aClass55_809 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1383(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		return Static22.method654(arg0) ? Static61.method1314(arg3, 0, -1, arg1, 0, 0, arg2, Static9.aClass6_Sub2_Sub14ArrayArray1[arg0], 0) : false;
	}
}
