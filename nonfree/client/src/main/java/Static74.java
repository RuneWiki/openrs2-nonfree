import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "Lclient!kb;")
	public static Class9 aClass9_36;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_863 = Static45.method753("Fps:");

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!v;")
	private static Class62 aClass62_864 = Static45.method753("m\u001c1chte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!od", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_865 = Static45.method753("Untersuchen");

	@OriginalMember(owner = "client!od", name = "w", descriptor = "Lclient!v;")
	private static Class62 aClass62_868 = Static45.method753("Loaded update list");

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_866 = aClass62_868;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_874 = Static45.method753("");

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!v;")
	public static Class62 aClass62_867 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "Lclient!v;")
	public static Class62 aClass62_869 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "y", descriptor = "Lclient!v;")
	public static Class62 aClass62_870 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "[I")
	public static int[] anIntArray226 = new int[500];

	@OriginalMember(owner = "client!od", name = "A", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!od", name = "D", descriptor = "Lclient!v;")
	private static Class62 aClass62_873 = Static45.method753("Friends");

	@OriginalMember(owner = "client!od", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_871 = aClass62_873;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_872 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_875 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_876 = aClass62_874;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "I")
	public static int anInt1985 = 0;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "Lclient!v;")
	private static Class62 aClass62_877 = Static45.method753("To");

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Lclient!v;")
	private static Class62 aClass62_878 = Static45.method753("Moderator)2Option: Spieler f\u001c1r 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!v;")
	public static Class62 aClass62_879 = aClass62_877;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BILclient!mb;)Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 method1194(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1) {
		return Static44.method718(arg0, arg1) ? Static7.method176() : null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1195() {
		@Pc(10) int local10 = Static10.aClass3_Sub8_Sub1_5.method1822(8);
		@Pc(15) int local15;
		if (local10 < Static91.anInt2431) {
			for (local15 = local10; local15 < Static91.anInt2431; local15++) {
				Static105.anIntArray309[Static68.anInt1897++] = Static6.anIntArray21[local15];
			}
		}
		if (Static91.anInt2431 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static91.anInt2431 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(62) int local62 = Static6.anIntArray21[local15];
			@Pc(66) Class3_Sub1_Sub3_Sub1_Sub1 local66 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local62];
			@Pc(71) int local71 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			if (local71 == 0) {
				Static6.anIntArray21[Static91.anInt2431++] = local62;
				local66.anInt1875 = Static12.anInt451;
			} else {
				@Pc(94) int local94 = Static10.aClass3_Sub8_Sub1_5.method1822(2);
				if (local94 == 0) {
					Static6.anIntArray21[Static91.anInt2431++] = local62;
					local66.anInt1875 = Static12.anInt451;
					Static98.anIntArray283[Static90.anInt2427++] = local62;
				} else {
					@Pc(141) int local141;
					@Pc(151) int local151;
					if (local94 == 1) {
						Static6.anIntArray21[Static91.anInt2431++] = local62;
						local66.anInt1875 = Static12.anInt451;
						local141 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local141, false);
						local151 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
						if (local151 == 1) {
							Static98.anIntArray283[Static90.anInt2427++] = local62;
						}
					} else if (local94 == 2) {
						Static6.anIntArray21[Static91.anInt2431++] = local62;
						local66.anInt1875 = Static12.anInt451;
						local141 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local141, true);
						local151 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local151, true);
						@Pc(207) int local207 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
						if (local207 == 1) {
							Static98.anIntArray283[Static90.anInt2427++] = local62;
						}
					} else if (local94 == 3) {
						Static105.anIntArray309[Static68.anInt1897++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!vb;I)V")
	public static void method1196(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static99.anInt2602 + Static53.anInt1432 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg2 * arg2;
		if (local20 > 6400) {
			return;
		}
		@Pc(30) int local30 = Static57.anIntArray156[local12];
		@Pc(34) int local34 = Static57.anIntArray161[local12];
		@Pc(42) int local42 = local30 * 256 / (Static42.anInt1215 + 256);
		@Pc(50) int local50 = local34 * 256 / (Static42.anInt1215 + 256);
		@Pc(61) int local61 = local50 * arg2 - local42 * arg0 >> 16;
		@Pc(71) int local71 = local50 * arg0 + arg2 * local42 >> 16;
		if (local20 > 2500) {
			arg1.method1744(Static46.aClass3_Sub1_Sub1_Sub1_13, local71 + 94 + 4 - arg1.anInt2687 / 2, -(arg1.anInt2688 / 2) + (-local61 + 83 - 4));
		} else {
			arg1.method1751(local71 + 94 + 4 - arg1.anInt2687 / 2, -local61 + -4 + 83 + -(arg1.anInt2688 / 2));
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1197() {
		Static26.aClass34_11.method762();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4 method1198() {
		@Pc(3) Class3_Sub1_Sub1_Sub4 local3 = new Class3_Sub1_Sub1_Sub4();
		local3.anInt2687 = Static39.anInt1163;
		local3.anInt2688 = Static14.anInt551;
		local3.anInt2683 = Static98.anIntArray281[0];
		local3.anInt2684 = Static36.anIntArray78[0];
		local3.anInt2686 = Static75.anIntArray228[0];
		local3.anInt2685 = Static50.anIntArray310[0];
		@Pc(37) byte[] local37 = Static98.aByteArrayArray9[0];
		@Pc(43) int local43 = local3.anInt2686 * local3.anInt2685;
		local3.anIntArray306 = new int[local43];
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			local3.anIntArray306[local49] = Static70.anIntArray201[local37[local49] & 0xFF];
		}
		Static51.method1440();
		return local3;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1199() {
		if (Static27.anInt813 != 0 || Static79.anInt2109 != 1) {
			return;
		}
		@Pc(15) int local15 = Static104.anInt2769 - 575;
		@Pc(21) int local21 = Static27.anInt825 - 5 - 4;
		if (local15 < 0 || local21 < 0 || local15 >= 146 || local21 >= 151) {
			return;
		}
		@Pc(39) int local39 = Static99.anInt2602 + Static53.anInt1432 & 0x7FF;
		local15 -= 73;
		local21 -= 75;
		@Pc(45) int local45 = Class3_Sub1_Sub1_Sub2.anIntArray189[local39];
		@Pc(49) int local49 = Class3_Sub1_Sub1_Sub2.anIntArray186[local39];
		@Pc(57) int local57 = (Static42.anInt1215 + 256) * local45 >> 8;
		@Pc(65) int local65 = local49 * (Static42.anInt1215 + 256) >> 8;
		@Pc(76) int local76 = local21 * local57 - local15 * local65 >> 11;
		@Pc(86) int local86 = local15 * local57 + local65 * local21 >> 11;
		@Pc(93) int local93 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 - local76 >> 7;
		@Pc(100) int local100 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 + local86 >> 7;
		@Pc(122) boolean local122 = Static81.method1319(0, true, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local100, 0, local93, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 1);
		if (!local122) {
			return;
		}
		Static63.aClass3_Sub8_Sub1_6.method1806(local15);
		Static63.aClass3_Sub8_Sub1_6.method1806(local21);
		Static63.aClass3_Sub8_Sub1_6.method1762(Static53.anInt1432);
		Static63.aClass3_Sub8_Sub1_6.method1806(57);
		Static63.aClass3_Sub8_Sub1_6.method1806(Static99.anInt2602);
		Static63.aClass3_Sub8_Sub1_6.method1806(Static42.anInt1215);
		Static63.aClass3_Sub8_Sub1_6.method1806(89);
		Static63.aClass3_Sub8_Sub1_6.method1762(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882);
		Static63.aClass3_Sub8_Sub1_6.method1762(Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887);
		Static63.aClass3_Sub8_Sub1_6.method1806(Static40.anInt1177);
		Static63.aClass3_Sub8_Sub1_6.method1806(63);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	public static void method1200() {
		Static44.aClass9_24.method682();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method1201() {
		Static109.aClass62_1309 = Static64.aClass62_770;
		Static70.aClass62_837 = Static3.aClass62_66;
		Static42.aClass62_536 = Static106.aClass62_1281;
		Static59.aClass62_710 = Static71.aClass62_851;
		Static109.aClass62_1320 = Static83.aClass62_210;
		Static96.aClass62_1174 = Static9.aClass62_814;
		Static56.aClass62_683 = Static13.aClass62_177;
		Static72.aClass62_862 = Static44.aClass62_540;
		Static105.aClass62_1258 = Static99.aClass62_1196;
		Static109.aClass62_1314 = Static79.aClass62_935;
		Static30.aClass62_416 = Static62.aClass62_743;
		Static109.aClass62_1319 = Static64.aClass62_770;
		Static9.aClass62_811 = Static72.aClass62_860;
		Static93.aClass62_1137 = Static83.aClass62_208;
		Static100.aClass62_1113 = Static6.aClass62_85;
		Static17.aClass62_1298 = Static106.aClass62_1279;
		Static13.aClass62_180 = Static86.aClass62_1023;
		Static61.aClass62_729 = Static104.aClass62_1250;
		Static109.aClass62_1321 = Static64.aClass62_770;
		Static92.aClass62_1100 = Static15.aClass62_219;
		Static109.aClass62_1326 = Static9.aClass62_815;
		Static10.aClass62_970 = aClass62_864;
		Static34.aClass62_471 = Static6.aClass62_89;
		Static91.aClass62_1093 = Static13.aClass62_174;
		Static37.aClass62_485 = Static27.aClass62_343;
		Static41.aClass62_532 = Static54.aClass62_1242;
		Static8.aClass62_120 = Static32.aClass62_443;
		Static109.aClass62_1304 = Static64.aClass62_774;
		Static37.aClass62_479 = Static26.aClass62_338;
		Static62.aClass62_742 = Static3.aClass62_61;
		Static99.aClass62_1207 = Static17.aClass62_1293;
		Static65.aClass62_777 = Static65.aClass62_781;
		Static109.aClass62_1322 = Static64.aClass62_770;
		Static104.aClass62_1256 = Static28.aClass62_383;
		Static8.aClass62_114 = Static26.aClass62_339;
		Static96.aClass62_1172 = Static28.aClass62_387;
		Static41.aClass62_526 = Static102.aClass62_1218;
		Static18.aClass62_285 = Static31.aClass62_419;
		Static33.aClass62_461 = Static94.aClass62_1141;
		Static12.aClass62_167 = Static41.aClass62_517;
		Static45.aClass62_567 = Static70.aClass62_841;
		Static34.aClass62_468 = Static33.aClass62_458;
		Static99.aClass62_1195 = Static17.aClass62_1293;
		Static56.aClass62_669 = Static34.aClass62_463;
		Static61.aClass62_730 = Static54.aClass62_1244;
		Static16.aClass62_263 = Static105.aClass62_1262;
		Static23.aClass62_314 = Static18.aClass62_279;
		Static63.aClass62_1080 = Static59.aClass62_705;
		Static6.aClass62_86 = Static36.aClass62_473;
		Static42.aClass62_538 = Static25.aClass62_334;
		Static99.aClass62_1210 = Static83.aClass62_200;
		Static16.aClass62_265 = Static96.aClass62_1176;
		Static19.aClass62_1289 = Static27.aClass62_352;
		Static12.aClass62_165 = Static25.aClass62_333;
		Static80.aClass62_951 = Static71.aClass62_845;
		Static13.aClass62_173 = Static16.aClass62_270;
		Static41.aClass62_518 = Static15.aClass62_229;
		Static83.aClass62_204 = Static23.aClass62_316;
		Static28.aClass62_391 = Static93.aClass62_1121;
		Static2.aClass62_13 = Static13.aClass62_179;
		Static109.aClass62_1307 = Static64.aClass62_770;
		Static63.aClass62_1072 = Static8.aClass62_119;
		Static63.aClass62_1071 = Static59.aClass62_708;
		Static109.aClass62_1334 = Static64.aClass62_770;
		Static65.aClass62_778 = Static5.aClass62_83;
		Static39.aClass62_497 = Static65.aClass62_782;
		Static13.aClass62_175 = Static28.aClass62_382;
		Static54.aClass62_1239 = aClass62_878;
		Static56.aClass62_684 = Static13.aClass62_177;
		Static50.aClass62_1276 = Static51.aClass62_1034;
		Static4.aClass62_77 = Static83.aClass62_207;
		Static109.aClass62_1323 = Static64.aClass62_770;
		Static53.aClass62_615 = Static86.aClass62_1024;
		Static109.aClass62_1300 = Static64.aClass62_770;
		Static27.aClass62_351 = Static24.aClass62_325;
		Static71.aClass62_846 = Static2.aClass62_15;
		Static56.aClass62_673 = Static10.aClass62_972;
		Static109.aClass62_1305 = Static64.aClass62_770;
		Static81.aClass62_968 = Static54.aClass62_1240;
		Static63.aClass62_1067 = Static8.aClass62_113;
		Static86.aClass62_1025 = Static70.aClass62_836;
		Static15.aClass62_232 = Static80.aClass62_955;
		Static56.aClass62_672 = Static13.aClass62_177;
		Static68.aClass62_821 = Static38.aClass62_486;
		Static99.aClass62_1198 = Static8.aClass62_121;
		Static34.aClass62_467 = Static75.aClass62_892;
		Static54.aClass62_1247 = Static76.aClass62_905;
		Static83.aClass62_198 = Static4.aClass62_79;
		Static62.aClass62_748 = Static41.aClass62_520;
		Static56.aClass62_681 = Static99.aClass62_1213;
		Static98.aClass62_1191 = Static93.aClass62_1132;
		Static18.aClass62_282 = Static3.aClass62_62;
		Static27.aClass62_349 = Static45.aClass62_564;
		Static22.aClass62_310 = Static56.aClass62_679;
		Static20.aClass62_292 = Static44.aClass62_541;
		Static5.aClass62_81 = Static28.aClass62_389;
		Static104.aClass62_1254 = Static64.aClass62_771;
		Static78.aClass62_917 = Static81.aClass62_967;
		Static90.aClass62_1091 = Static102.aClass62_1216;
		Static46.aClass62_572 = Static61.aClass62_723;
		Static98.aClass62_1192 = Static25.aClass62_330;
		Static93.aClass62_1129 = Static86.aClass62_1020;
		Static24.aClass62_318 = Static105.aClass62_1260;
		Static77.aClass62_910 = Static12.aClass62_169;
		Static2.aClass62_14 = Static34.aClass62_464;
		aClass62_879 = Static50.aClass62_1275;
		Static27.aClass62_350 = Static96.aClass62_1175;
		Static99.aClass62_1208 = Static90.aClass62_1092;
		Static49.aClass62_584 = Static19.aClass62_1286;
		Static10.aClass62_969 = Static104.aClass62_1249;
		aClass62_871 = Static21.aClass62_304;
		Static25.aClass62_329 = Static38.aClass62_492;
		Static90.aClass62_1088 = Static35.aClass62_472;
		Static45.aClass62_569 = Static89.aClass62_1083;
		Static27.aClass62_342 = Static85.aClass62_1007;
		Static15.aClass62_226 = Static39.aClass62_496;
		Static79.aClass62_931 = Static38.aClass62_491;
		Static109.aClass62_1312 = Static78.aClass62_914;
		Static56.aClass62_676 = Static10.aClass62_972;
		Static106.aClass62_1278 = Static85.aClass62_1008;
		Static15.aClass62_224 = Static93.aClass62_1123;
		Static109.aClass62_1306 = Static79.aClass62_929;
		Static83.aClass62_209 = Static95.aClass62_1157;
		Static26.aClass62_336 = Static32.aClass62_446;
		Static109.aClass62_1318 = Static64.aClass62_774;
		Static17.aClass62_1296 = Static58.aClass62_703;
		Static63.aClass62_1066 = Static86.aClass62_1022;
		Static54.aClass62_1241 = Static30.aClass62_415;
		Static93.aClass62_1131 = Static36.aClass62_476;
		Static3.aClass62_67 = Static95.aClass62_1155;
		Static30.aClass62_413 = Static55.aClass62_655;
		Static79.aClass62_932 = Static34.aClass62_469;
		Static95.aClass62_1153 = Static25.aClass62_331;
		Static37.aClass62_480 = Static15.aClass62_225;
		Static54.aClass62_1246 = Static78.aClass62_918;
		Static109.aClass62_1301 = Static64.aClass62_770;
		Static109.aClass62_1299 = Static10.aClass62_972;
		Static109.aClass62_1302 = Static64.aClass62_770;
		Static56.aClass62_680 = Static25.aClass62_332;
		Static78.aClass62_916 = Static22.aClass62_308;
		Static55.aClass62_653 = Static25.aClass62_328;
		Static70.aClass62_840 = Static21.aClass62_303;
		Static109.aClass62_1313 = Static64.aClass62_770;
		Static99.aClass62_1214 = aClass62_865;
		Static63.aClass62_1081 = Static53.aClass62_613;
		Static56.aClass62_675 = Static10.aClass62_972;
		Static22.aClass62_307 = Static26.aClass62_341;
		Static109.aClass62_1317 = Static64.aClass62_770;
		Static96.aClass62_1168 = Static7.aClass62_93;
		Static109.aClass62_1328 = Static23.aClass62_313;
		Static99.aClass62_1209 = Static72.aClass62_858;
		Static33.aClass62_460 = Static86.aClass62_1021;
		Static8.aClass62_123 = Static102.aClass62_1217;
		Static100.aClass62_1115 = Static27.aClass62_347;
		Static99.aClass62_1203 = Static59.aClass62_709;
		Static29.aClass62_395 = Static18.aClass62_283;
		Static62.aClass62_747 = Static95.aClass62_1156;
		Static104.aClass62_1252 = Static14.aClass62_212;
		Static16.aClass62_264 = Static46.aClass62_577;
		Static31.aClass62_417 = Static58.aClass62_702;
		Static32.aClass62_445 = Static58.aClass62_700;
		Static109.aClass62_1315 = Static64.aClass62_770;
		Static71.aClass62_848 = Static61.aClass62_725;
		Static94.aClass62_1139 = Static65.aClass62_779;
		Static77.aClass62_906 = Static98.aClass62_1188;
		Static55.aClass62_654 = Static63.aClass62_1069;
		Static40.aClass62_500 = Static77.aClass62_908;
		Static32.aClass62_440 = Static45.aClass62_566;
		Static68.aClass62_823 = Static46.aClass62_578;
		Static16.aClass62_269 = Static14.aClass62_213;
		Static62.aClass62_746 = Static2.aClass62_19;
		Static93.aClass62_1133 = Static38.aClass62_489;
		Static78.aClass62_912 = Static81.aClass62_967;
		Static56.aClass62_677 = Static34.aClass62_463;
		Static32.aClass62_435 = Static72.aClass62_856;
		Static32.aClass62_439 = Static83.aClass62_206;
		Static109.aClass62_1303 = Static64.aClass62_770;
		Static109.aClass62_1311 = Static32.aClass62_438;
		Static32.aClass62_436 = Static2.aClass62_18;
		Static109.aClass62_1331 = Static65.aClass62_784;
		Static109.aClass62_1324 = Static15.aClass62_228;
		Static30.aClass62_410 = Static94.aClass62_1138;
		Static109.aClass62_1330 = Static79.aClass62_935;
		Static15.aClass62_220 = Static48.aClass62_579;
		Static91.aClass62_1099 = Static3.aClass62_60;
		Static109.aClass62_1308 = Static64.aClass62_770;
		Static109.aClass62_1325 = Static64.aClass62_770;
		Static56.aClass62_668 = Static44.aClass62_539;
		Static24.aClass62_319 = Static15.aClass62_223;
		Static41.aClass62_531 = Static18.aClass62_280;
		Static71.aClass62_849 = Static100.aClass62_1116;
		Static7.aClass62_90 = Static109.aClass62_1316;
		Static99.aClass62_1200 = Static59.aClass62_709;
		Static109.aClass62_1329 = Static79.aClass62_935;
		Static89.aClass62_1084 = Static70.aClass62_839;
		aClass62_866 = Static46.aClass62_575;
		Static20.aClass62_289 = Static61.aClass62_728;
		Static24.aClass62_321 = Static77.aClass62_909;
		Static98.aClass62_1193 = Static32.aClass62_442;
		Static109.aClass62_1310 = Static64.aClass62_770;
		Static42.aClass62_534 = Static65.aClass62_783;
		Static50.aClass62_1274 = Static3.aClass62_63;
		Static72.aClass62_861 = Static63.aClass62_1069;
		Static19.aClass62_1290 = Static45.aClass62_568;
		Static91.aClass62_1094 = Static64.aClass62_772;
		Static93.aClass62_1134 = Static5.aClass62_80;
		Static109.aClass62_1333 = Static64.aClass62_770;
		Static99.aClass62_1211 = Static39.aClass62_498;
		Static37.aClass62_484 = Static29.aClass62_396;
		Static62.aClass62_740 = Static80.aClass62_954;
		Static19.aClass62_1285 = Static41.aClass62_530;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public static void method1202() {
		aClass62_864 = null;
		anIntArray227 = null;
		aClass62_878 = null;
		anIntArray225 = null;
		aClass62_877 = null;
		aClass62_871 = null;
		aClass62_868 = null;
		aClass62_876 = null;
		aClass62_866 = null;
		aClass62_870 = null;
		aClass62_869 = null;
		aClass62_867 = null;
		aClass62_872 = null;
		aClass62_873 = null;
		anIntArray226 = null;
		aClass62_874 = null;
		aClass62_875 = null;
		aClass62_879 = null;
		aClass9_36 = null;
		aClass62_863 = null;
		aClass62_865 = null;
		Class51.anIntArray224 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!v;ILclient!v;Z)V")
	public static void method1203(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(1) short local1 = 151;
		if (Static69.aBoolean112) {
			Static69.aBoolean112 = false;
			Static93.method1589();
			Static38.method681();
			Static89.method1527();
			Static45.method749();
			Static35.method662(Static72.anInt1948, Static50.aClass3_Sub1_Sub1_Sub3_12, Static15.anInt574, Static28.anInt898);
			Static49.method785(Static72.anIntArray205, Static34.anInt1097, -1, Static92.anInt2448 == -1);
			Static59.aBoolean88 = true;
			Static8.aBoolean13 = true;
			Static40.aBoolean65 = true;
		}
		Static102.method1706();
		@Pc(43) int local43 = local1 - 3;
		Static50.aClass3_Sub1_Sub1_Sub3_12.method1486(arg1, 257, 148, 0);
		Static50.aClass3_Sub1_Sub1_Sub3_12.method1486(arg1, 256, 147, 16777215);
		if (arg0 != null) {
			local43 += 15;
			if (arg2) {
				@Pc(73) int local73 = Static50.aClass3_Sub1_Sub1_Sub3_12.method1484(arg0) + 4;
				Static97.method1733(257 - local73 / 2, 152, local73, 11, 0);
			}
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1486(arg0, 257, 163, 0);
			Static50.aClass3_Sub1_Sub1_Sub3_12.method1486(arg0, 256, 162, 16777215);
		}
		Static79.method1286();
	}
}
