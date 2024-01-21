import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!kc;")
	private static Class36 aClass36_204 = Static14.method2017("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!kc;")
	public static Class36 aClass36_205 = Static14.method2017("@or3@");

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public static int anInt348 = 0;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "Lclient!kc;")
	private static Class36 aClass36_206 = Static14.method2017("Members object");

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Lclient!kc;")
	private static Class36 aClass36_207 = Static14.method2017("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
	public static int anInt349 = 0;

	@OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
	public static int anInt351 = -1;

	@OriginalMember(owner = "client!cf", name = "O", descriptor = "[I")
	public static int[] anIntArray26 = new int[5];

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "Lclient!kc;")
	private static Class36 aClass36_208 = Static14.method2017("Nehmen");

	@OriginalMember(owner = "client!cf", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3 = new byte[4][104][104];

	@OriginalMember(owner = "client!cf", name = "T", descriptor = "Lclient!kc;")
	public static Class36 aClass36_209 = aClass36_206;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!hd;B)V")
	public static void method291(@OriginalArg(0) Class2_Sub1_Sub4_Sub2 arg0) {
		if (arg0.anInt2195 == 0) {
			return;
		}
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (arg0.anInt2157 != -1 && arg0.anInt2157 < 32768) {
			@Pc(28) Class2_Sub1_Sub4_Sub2_Sub1 local28 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[arg0.anInt2157];
			if (local28 != null) {
				local36 = arg0.anInt2204 - local28.anInt2204;
				local42 = arg0.anInt2149 - local28.anInt2149;
				if (local36 != 0 || local42 != 0) {
					arg0.anInt2170 = (int) (Math.atan2((double) local36, (double) local42) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt2157 >= 32768) {
			local73 = arg0.anInt2157 - 32768;
			if (Static18.anInt455 == local73) {
				local73 = 2047;
			}
			@Pc(86) Class2_Sub1_Sub4_Sub2_Sub2 local86 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local73];
			if (local86 != null) {
				local42 = arg0.anInt2204 - local86.anInt2204;
				@Pc(102) int local102 = arg0.anInt2149 - local86.anInt2149;
				if (local42 != 0 || local102 != 0) {
					arg0.anInt2170 = (int) (Math.atan2((double) local42, (double) local102) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2194 != 0 || arg0.anInt2175 != 0) && (arg0.anInt2158 == 0 || arg0.anInt2148 > 0)) {
			local73 = arg0.anInt2204 - (arg0.anInt2194 - Static25.anInt632 - Static25.anInt632) * 64;
			local36 = arg0.anInt2149 - (arg0.anInt2175 - Static23.anInt592 - Static23.anInt592) * 64;
			if (local73 != 0 || local36 != 0) {
				arg0.anInt2170 = (int) (Math.atan2((double) local73, (double) local36) * 325.949D) & 0x7FF;
			}
			arg0.anInt2194 = 0;
			arg0.anInt2175 = 0;
		}
		local73 = arg0.anInt2170 - arg0.anInt2156 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt2164 = 0;
			return;
		}
		arg0.anInt2164++;
		@Pc(235) boolean local235;
		if (local73 > 1024) {
			arg0.anInt2156 -= arg0.anInt2195;
			local235 = true;
			if (arg0.anInt2195 > local73 || local73 > 2048 - arg0.anInt2195) {
				local235 = false;
				arg0.anInt2156 = arg0.anInt2170;
			}
			if (arg0.anInt2200 == arg0.anInt2181 && (arg0.anInt2164 > 25 || local235)) {
				if (arg0.anInt2171 == -1) {
					arg0.anInt2181 = arg0.anInt2185;
				} else {
					arg0.anInt2181 = arg0.anInt2171;
				}
			}
		} else {
			arg0.anInt2156 += arg0.anInt2195;
			local235 = true;
			if (arg0.anInt2195 > local73 || local73 > 2048 - arg0.anInt2195) {
				arg0.anInt2156 = arg0.anInt2170;
				local235 = false;
			}
			if (arg0.anInt2181 == arg0.anInt2200 && (arg0.anInt2164 > 25 || local235)) {
				if (arg0.anInt2155 == -1) {
					arg0.anInt2181 = arg0.anInt2185;
				} else {
					arg0.anInt2181 = arg0.anInt2155;
				}
			}
		}
		arg0.anInt2156 &= 0x7FF;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)V")
	public static void method293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == Static22.anInt578 && arg3 == Static71.anInt1804 && (arg4 == Static14.anInt2900 || !Static35.aBoolean51)) {
			return;
		}
		Static14.anInt2900 = arg4;
		Static71.anInt1804 = arg3;
		Static22.anInt578 = arg2;
		if (!Static35.aBoolean51) {
			Static14.anInt2900 = 0;
		}
		Static104.method1914(25);
		Static89.method1643(false, null, Static14.aClass36_1421);
		@Pc(41) int local41 = Static25.anInt632;
		Static25.anInt632 = arg2 * 8 - 48;
		@Pc(52) int local52 = Static25.anInt632 - local41;
		@Pc(54) int local54 = Static23.anInt592;
		Static23.anInt592 = arg3 * 8 - 48;
		@Pc(67) int local67 = Static23.anInt592 - local54;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class2_Sub1_Sub4_Sub2_Sub1 local85 = Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray252[local89] -= local52;
					local85.anIntArray258[local89] -= local67;
				}
				local85.anInt2149 -= local67 * 128;
				local85.anInt2204 -= local52 * 128;
			}
		}
		for (@Pc(133) int local133 = 0; local133 < 2048; local133++) {
			@Pc(139) Class2_Sub1_Sub4_Sub2_Sub2 local139 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local133];
			if (local139 != null) {
				for (@Pc(143) int local143 = 0; local143 < 10; local143++) {
					local139.anIntArray252[local143] -= local52;
					local139.anIntArray258[local143] -= local67;
				}
				local139.anInt2204 -= local52 * 128;
				local139.anInt2149 -= local67 * 128;
			}
		}
		Static92.anInt2412 = arg4;
		@Pc(189) byte local189 = 0;
		@Pc(191) byte local191 = 104;
		Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1549(arg0, arg1, false);
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 1;
		@Pc(205) byte local205 = 1;
		if (local67 < 0) {
			local199 = 103;
			local201 = -1;
			local205 = -1;
		}
		if (local52 < 0) {
			local203 = -1;
			local189 = 103;
			local191 = -1;
		}
		for (@Pc(226) int local226 = local189; local226 != local191; local226 += local203) {
			for (@Pc(230) int local230 = local199; local230 != local201; local230 += local205) {
				@Pc(236) int local236 = local52 + local226;
				@Pc(240) int local240 = local67 + local230;
				for (@Pc(242) int local242 = 0; local242 < 4; local242++) {
					if (local236 >= 0 && local240 >= 0 && local236 < 104 && local240 < 104) {
						Static3.aClass8ArrayArrayArray2[local242][local226][local230] = Static3.aClass8ArrayArrayArray2[local242][local236][local240];
					} else {
						Static3.aClass8ArrayArrayArray2[local242][local226][local230] = null;
					}
				}
			}
		}
		for (@Pc(312) Class2_Sub8 local312 = (Class2_Sub8) Static39.aClass8_2.method175(); local312 != null; local312 = (Class2_Sub8) Static39.aClass8_2.method173()) {
			local312.anInt1109 -= local52;
			local312.anInt1114 -= local67;
			if (local312.anInt1109 < 0 || local312.anInt1114 < 0 || local312.anInt1109 >= 104 || local312.anInt1114 >= 104) {
				local312.method2073();
			}
		}
		Static115.anInt1793 = 0;
		Static88.aBoolean100 = false;
		if (Static22.anInt576 != 0) {
			Static78.anInt2040 -= local67;
			Static22.anInt576 -= local52;
		}
		Static47.anInt1242 = -1;
		Static71.aClass8_5.method179();
		Static59.aClass8_4.method179();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method294() {
		aClass36_209 = null;
		aClass36_205 = null;
		aClass36_207 = null;
		aClass36_208 = null;
		aClass36_206 = null;
		aClass36_204 = null;
		aByteArrayArrayArray3 = null;
		anIntArray26 = null;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
	public static void method295() {
		Static96.aClass36_1238 = Static68.aClass36_829;
		Static14.aClass36_1413 = aClass36_204;
		Static56.aClass36_704 = Static83.aClass36_984;
		Static62.aClass36_773 = Static26.aClass36_374;
		Static43.aClass36_564 = Static85.aClass36_1026;
		Static90.aClass36_1090 = Static109.aClass36_1396;
		Static77.aClass36_945 = Static11.aClass36_161;
		Static118.aClass36_1455 = Static86.aClass36_1034;
		Static58.aClass36_732 = Static117.aClass36_906;
		Static69.aClass36_857 = Static76.aClass36_940;
		Static10.aClass36_149 = Static73.aClass36_894;
		Static6.aClass36_87 = Static76.aClass36_937;
		Static115.aClass36_879 = Static7.aClass36_110;
		Static59.aClass36_763 = Static38.aClass36_491;
		Static94.aClass36_1182 = Static45.aClass36_617;
		Static71.aClass36_884 = Static4.aClass36_71;
		Static90.aClass36_1118 = Static101.aClass36_1304;
		Static97.aClass36_1245 = Static94.aClass36_1180;
		Static94.aClass36_1176 = Static39.aClass36_503;
		Static90.aClass36_1115 = Static109.aClass36_1396;
		Static23.aClass36_321 = Static73.aClass36_888;
		Static34.aClass36_477 = Static1.aClass36_1;
		aClass36_209 = Static22.aClass36_314;
		Static13.aClass36_173 = Static82.aClass36_978;
		Static32.aClass36_475 = Static45.aClass36_613;
		Static23.aClass36_320 = Static69.aClass36_860;
		Static82.aClass36_981 = Static69.aClass36_859;
		Static41.aClass36_539 = Static112.aClass36_1436;
		Static111.aClass36_1410 = Static89.aClass36_1079;
		Static57.aClass36_710 = Static40.aClass36_1024;
		Static90.aClass36_1091 = Static101.aClass36_1306;
		Static34.aClass36_482 = Static36.aClass36_488;
		Static20.aClass36_267 = Static10.aClass36_156;
		Static11.aClass36_159 = Static20.aClass36_262;
		Static90.aClass36_1116 = Static109.aClass36_1396;
		Static90.aClass36_1119 = Static109.aClass36_1396;
		Static52.aClass36_696 = Static15.aClass36_187;
		Static62.aClass36_777 = Static81.aClass36_972;
		Static89.aClass36_1084 = Static74.aClass36_917;
		Static27.aClass36_397 = Static6.aClass36_78;
		Static23.aClass36_324 = Static109.aClass36_1401;
		Static29.aClass36_422 = Static29.aClass36_423;
		Static90.aClass36_1100 = Static68.aClass36_830;
		Static4.aClass36_67 = Static39.aClass36_499;
		Static90.aClass36_1123 = Static109.aClass36_1396;
		Static100.aClass36_1278 = Static59.aClass36_764;
		Static57.aClass36_709 = Static94.aClass36_1173;
		Static96.aClass36_1233 = Static84.aClass36_994;
		Static90.aClass36_1120 = Static84.aClass36_994;
		Static90.aClass36_1117 = Static109.aClass36_1396;
		Static90.aClass36_1096 = Static43.aClass36_565;
		Static90.aClass36_1122 = Static109.aClass36_1396;
		Static79.aClass36_967 = Static19.aClass36_1433;
		Static77.aClass36_948 = Static97.aClass36_1257;
		Static90.aClass36_1109 = Static92.aClass36_1150;
		Static90.aClass36_1101 = Static77.aClass36_950;
		Static60.aClass36_766 = Static73.aClass36_891;
		Static10.aClass36_155 = Static48.aClass36_633;
		Static106.aClass36_1331 = Static53.aClass36_701;
		Static90.aClass36_1105 = Static84.aClass36_993;
		Static4.aClass36_61 = Static9.aClass36_142;
		Static4.aClass36_74 = Static107.aClass36_1355;
		Static22.aClass36_310 = Static64.aClass36_796;
		Static81.aClass36_975 = Static24.aClass36_345;
		Static103.aClass36_1313 = Static58.aClass36_734;
		Static55.aClass36_1323 = Static82.aClass36_980;
		Static48.aClass36_637 = Static92.aClass36_1149;
		Static39.aClass36_502 = Static10.aClass36_150;
		Static10.aClass36_153 = aClass36_207;
		Static86.aClass36_1032 = Static63.aClass36_791;
		Static90.aClass36_1098 = Static109.aClass36_1396;
		Static6.aClass36_84 = Static46.aClass36_620;
		Static17.aClass36_225 = Static80.aClass36_971;
		Static65.aClass36_819 = Static11.aClass36_162;
		Static105.aClass36_1349 = Static29.aClass36_429;
		Static22.aClass36_309 = Static114.aClass36_1450;
		Static90.aClass36_1126 = Static43.aClass36_559;
		Static96.aClass36_1243 = Static84.aClass36_994;
		Static69.aClass36_855 = Static92.aClass36_1148;
		Static39.aClass36_498 = Static32.aClass36_471;
		Static118.aClass36_1458 = Static36.aClass36_490;
		Static77.aClass36_941 = Static15.aClass36_184;
		Static49.aClass36_650 = Static26.aClass36_367;
		Static52.aClass36_697 = Static3.aClass36_643;
		Static38.aClass36_496 = Static99.aClass36_956;
		Static117.aClass36_909 = Static46.aClass36_621;
		Static25.aClass36_347 = Static47.aClass36_629;
		Static46.aClass36_622 = Static62.aClass36_782;
		Static9.aClass36_145 = Static20.aClass36_263;
		Static99.aClass36_955 = Static113.aClass36_1446;
		Static8.aClass36_120 = Static112.aClass36_1439;
		Static6.aClass36_88 = Static41.aClass36_535;
		Static90.aClass36_1099 = Static109.aClass36_1396;
		Static27.aClass36_400 = Static90.aClass36_1111;
		Static112.aClass36_1442 = Static8.aClass36_114;
		Static83.aClass36_989 = aClass36_208;
		Static9.aClass36_140 = Static100.aClass36_1279;
		Static104.aClass36_1318 = Static94.aClass36_1172;
		Static18.aClass36_232 = Static48.aClass36_630;
		Static74.aClass36_912 = Static92.aClass36_1151;
		Static20.aClass36_269 = Static109.aClass36_1393;
		Static117.aClass36_903 = Static7.aClass36_113;
		Static104.aClass36_1315 = Static17.aClass36_230;
		Static48.aClass36_631 = Static45.aClass36_611;
		Static14.aClass36_1421 = Static51.aClass36_1272;
		Static48.aClass36_632 = Static7.aClass36_111;
		Static49.aClass36_655 = Static78.aClass36_959;
		Static90.aClass36_1125 = Static109.aClass36_1396;
		Static43.aClass36_566 = Static109.aClass36_1396;
		Static49.aClass36_651 = Static62.aClass36_775;
		Static90.aClass36_1095 = Static99.aClass36_953;
		Static110.aClass36_1406 = Static9.aClass36_139;
		Static90.aClass36_1106 = Static109.aClass36_1396;
		Static63.aClass36_788 = Static109.aClass36_1398;
		Static90.aClass36_1107 = Static109.aClass36_1396;
		Static90.aClass36_1124 = Static109.aClass36_1396;
		Static86.aClass36_1031 = Static63.aClass36_791;
		Static3.aClass36_645 = Static42.aClass36_558;
		Static89.aClass36_1085 = Static64.aClass36_794;
		Static88.aClass36_1075 = Static78.aClass36_957;
		Static63.aClass36_789 = Static4.aClass36_76;
		Static97.aClass36_1252 = Static66.aClass36_823;
		Static45.aClass36_614 = Static35.aClass36_486;
		Static74.aClass36_915 = Static22.aClass36_311;
		Static96.aClass36_1231 = Static101.aClass36_1305;
		Static84.aClass36_991 = Static113.aClass36_1443;
		Static4.aClass36_72 = Static18.aClass36_235;
		Static52.aClass36_692 = Static103.aClass36_1309;
		Static47.aClass36_627 = Static106.aClass36_1333;
		Static64.aClass36_797 = Static76.aClass36_938;
		Static6.aClass36_91 = Static64.aClass36_795;
		Static96.aClass36_1232 = Static94.aClass36_1183;
		Static71.aClass36_886 = Static42.aClass36_557;
		Static40.aClass36_1025 = Static26.aClass36_371;
		Static105.aClass36_1339 = Static26.aClass36_375;
		Static96.aClass36_1237 = Static68.aClass36_831;
		Static105.aClass36_1340 = Static8.aClass36_121;
		Static57.aClass36_714 = Static88.aClass36_1074;
		Static97.aClass36_1253 = Static94.aClass36_1179;
		Static29.aClass36_427 = Static85.aClass36_1028;
		Static63.aClass36_787 = Static52.aClass36_691;
		Static113.aClass36_1444 = Static109.aClass36_1392;
		Static106.aClass36_1338 = Static84.aClass36_992;
		Static86.aClass36_1037 = Static73.aClass36_887;
		Static33.aClass36_217 = Static64.aClass36_799;
		Static90.aClass36_1088 = Static110.aClass36_1404;
		Static13.aClass36_178 = Static36.aClass36_487;
		Static96.aClass36_1234 = Static68.aClass36_829;
		Static38.aClass36_492 = Static97.aClass36_1246;
		Static109.aClass36_1394 = Static23.aClass36_319;
		Static6.aClass36_90 = Static39.aClass36_497;
		Static97.aClass36_1250 = Static103.aClass36_1311;
		Static27.aClass36_395 = Static114.aClass36_1452;
		Static83.aClass36_988 = Static48.aClass36_641;
		Static108.aClass36_1374 = Static109.aClass36_1400;
		Static90.aClass36_1097 = Static109.aClass36_1396;
		Static96.aClass36_1241 = Static112.aClass36_1435;
		Static77.aClass36_946 = Static8.aClass36_119;
		Static22.aClass36_312 = Static110.aClass36_1403;
		Static90.aClass36_1089 = Static43.aClass36_565;
		Static52.aClass36_690 = Static6.aClass36_89;
		Static35.aClass36_484 = Static33.aClass36_221;
		Static17.aClass36_228 = Static117.aClass36_905;
		Static48.aClass36_638 = Static47.aClass36_626;
		Static74.aClass36_918 = Static40.aClass36_1021;
		Static29.aClass36_425 = Static114.aClass36_1449;
		Static3.aClass36_642 = Static10.aClass36_150;
		Static90.aClass36_1104 = Static110.aClass36_1404;
		Static90.aClass36_1114 = Static109.aClass36_1396;
		Static29.aClass36_419 = Static114.aClass36_1449;
		Static59.aClass36_760 = Static56.aClass36_706;
		Static55.aClass36_1322 = Static95.aClass36_1212;
		Static114.aClass36_1454 = Static43.aClass36_561;
		Static41.aClass36_534 = Static66.aClass36_824;
		Static112.aClass36_1440 = Static94.aClass36_1174;
		Static17.aClass36_223 = Static15.aClass36_191;
		Static73.aClass36_892 = Static52.aClass36_695;
		Static90.aClass36_1112 = Static4.aClass36_62;
		Static59.aClass36_761 = Static106.aClass36_1333;
		Static111.aClass36_1408 = Static101.aClass36_1304;
		Static90.aClass36_1103 = Static109.aClass36_1396;
		Static13.aClass36_176 = Static76.aClass36_936;
		Static20.aClass36_268 = Static56.aClass36_707;
		Static85.aClass36_1030 = Static73.aClass36_889;
		Static83.aClass36_982 = Static47.aClass36_625;
		Static106.aClass36_1334 = Static32.aClass36_473;
		Static43.aClass36_563 = Static117.aClass36_908;
		Static53.aClass36_700 = Static3.aClass36_648;
		Static88.aClass36_1076 = Static67.aClass36_825;
		Static118.aClass36_1460 = Static19.aClass36_1430;
		Static62.aClass36_778 = Static40.aClass36_1022;
		Static95.aClass36_1210 = Static79.aClass36_964;
		Static58.aClass36_737 = Static32.aClass36_474;
		Static11.aClass36_160 = Static76.aClass36_939;
		Static15.aClass36_182 = Static19.aClass36_1434;
		Static27.aClass36_393 = Static32.aClass36_476;
		Static61.aClass36_771 = Static106.aClass36_1330;
		Static90.aClass36_1093 = Static53.aClass36_702;
		Static62.aClass36_772 = Static33.aClass36_219;
		Static100.aClass36_1280 = Static94.aClass36_1181;
		Static97.aClass36_1247 = Static65.aClass36_818;
		Static90.aClass36_1121 = Static29.aClass36_418;
		Static118.aClass36_1457 = Static20.aClass36_260;
		Static96.aClass36_1240 = Static84.aClass36_994;
		Static78.aClass36_960 = Static58.aClass36_739;
		Static80.aClass36_969 = Static104.aClass36_1319;
		Static63.aClass36_792 = Static40.aClass36_1020;
		Static48.aClass36_634 = Static92.aClass36_1149;
		Static24.aClass36_343 = Static89.aClass36_1082;
		Static41.aClass36_537 = Static20.aClass36_271;
		Static95.aClass36_1211 = Static92.aClass36_1153;
		Static118.aClass36_1459 = Static110.aClass36_1407;
		Static90.aClass36_1108 = Static109.aClass36_1396;
		Static25.aClass36_348 = Static47.aClass36_629;
		Static97.aClass36_1256 = Static114.aClass36_1451;
		Static19.aClass36_1429 = Static94.aClass36_1177;
	}
}
