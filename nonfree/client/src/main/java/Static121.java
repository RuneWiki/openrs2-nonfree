import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
	public static int anInt2393;

	@OriginalMember(owner = "client!lf", name = "W", descriptor = "Lclient!pa;")
	public static Class86 aClass86_43;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	public static int anInt2387 = 2301979;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method1932(@OriginalArg(0) Class20_Sub3_Sub2 arg0) {
		for (@Pc(16) Class1_Sub16 local16 = (Class1_Sub16) Static158.aClass75_17.method2239(); local16 != null; local16 = (Class1_Sub16) Static158.aClass75_17.method2238()) {
			if (local16.aClass20_Sub3_Sub2_1 == arg0) {
				if (local16.aClass1_Sub12_Sub4_2 != null) {
					Static226.aClass1_Sub12_Sub1_2.method894(local16.aClass1_Sub12_Sub4_2);
					local16.aClass1_Sub12_Sub4_2 = null;
				}
				local16.method3525();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBIZ)V")
	public static void method1933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		Static1.anInt41++;
		if (!arg4) {
			Static18.method265(true);
			Static102.method1589(true);
			Static18.method265(false);
		}
		Static102.method1589(false);
		if (!arg4) {
			Static54.method808();
		}
		Static135.method2280();
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (Static28.anInt544 == 1) {
			local36 = Static176.anInt3690;
			local42 = Static74.anInt1501 + Static104.anInt2068 & 0x7FF;
			if (Static17.anInt335 / 256 > local36) {
				local36 = Static17.anInt335 / 256;
			}
			if (Static116.aBooleanArray8[4] && local36 < Static185.anIntArray431[4] + 128) {
				local36 = Static185.anIntArray431[4] + 128;
			}
			Static76.method1099(local36, Static131.method2213(Static230.aClass20_Sub3_Sub1_3.anInt3008, Static230.aClass20_Sub3_Sub1_3.anInt3022, Static212.anInt4195) - 50, Static31.anInt598, local42, local36 * 3 + 600, Static201.anInt4057, arg3);
		}
		@Pc(95) int local95 = Static137.anInt2804;
		@Pc(97) int local97 = Static218.anInt3563;
		@Pc(99) int local99 = Static166.anInt3404;
		local36 = Static159.anInt4227;
		local42 = Static32.anInt601;
		@Pc(146) int local146;
		for (@Pc(105) int local105 = 0; local105 < 5; local105++) {
			if (Static116.aBooleanArray8[local105]) {
				local146 = (int) ((double) (Static153.anIntArray329[local105] * 2 + 1) * Math.random() - (double) Static153.anIntArray329[local105] + Math.sin((double) Static194.anIntArray445[local105] / 100.0D * (double) Static1.anIntArray10[local105]) * (double) Static185.anIntArray431[local105]);
				if (local105 == 3) {
					Static166.anInt3404 = Static166.anInt3404 + local146 & 0x7FF;
				}
				if (local105 == 2) {
					Static137.anInt2804 += local146;
				}
				if (local105 == 1) {
					Static32.anInt601 += local146;
				}
				if (local105 == 0) {
					Static159.anInt4227 += local146;
				}
				if (local105 == 4) {
					Static218.anInt3563 += local146;
					if (Static218.anInt3563 < 128) {
						Static218.anInt3563 = 128;
					}
					if (Static218.anInt3563 > 383) {
						Static218.anInt3563 = 383;
					}
				}
			}
		}
		Static163.method2721();
		Static29.method406(arg1, arg2, arg1 + arg0, arg2 - -arg3);
		Static215.method3355();
		@Pc(229) int local229 = Static110.anInt2205;
		local146 = Static117.anInt2301;
		if (local146 >= arg1 && local146 < arg0 + arg1 && local229 >= arg2 && local229 < arg3 + arg2) {
			@Pc(259) int local259 = Static16.anInt304;
			Static63.aBoolean64 = true;
			@Pc(263) int local263 = Static73.anInt3193;
			@Pc(265) int local265 = Static138.anInt2807;
			Static230.anInt3194 = (local263 - local259) * (Static117.anInt2301 - arg1) / arg0 + local259;
			@Pc(281) int local281 = Static62.anInt1230;
			Static194.anInt3947 = local281 + (local265 - local281) * (Static110.anInt2205 - arg2) / arg3;
			Static76.anInt1533 = 0;
		} else {
			Static63.aBoolean64 = false;
			Static76.anInt1533 = 0;
		}
		Static192.method3138();
		@Pc(310) byte local310 = Static48.method758() == 2 ? (byte) Static1.anInt41 : 1;
		Static29.method423(arg1, arg2, arg0, arg3, 0);
		Static80.method1141(Static159.anInt4227, Static32.anInt601, Static137.anInt2804, Static218.anInt3563, Static166.anInt3404, Static217.aByteArrayArrayArray14, Static172.anIntArray376, Static232.anIntArray509, Static230.anIntArray331, Static171.anIntArray375, Static85.anIntArray138, Static212.anInt4195 + 1, local310, Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7, Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7);
		Static192.method3138();
		Static40.method646();
		Static131.method2205(arg0, arg2, arg3, arg1);
		Static224.method70(arg3, arg0, arg2, arg1);
		((Class82) Static215.anInterface4_3).method2518(Static42.anInt921);
		Static131.method2211(arg3, arg2, arg1, arg0);
		Static137.anInt2804 = local95;
		Static32.anInt601 = local42;
		Static159.anInt4227 = local36;
		Static166.anInt3404 = local99;
		Static218.anInt3563 = local97;
		if (Static146.aBoolean129 && Static220.method3399() == 0) {
			Static146.aBoolean129 = false;
		}
		if (Static146.aBoolean129) {
			Static29.method423(arg1, arg2, arg0, arg3, 0);
			Static77.method1123(false, Static32.aClass50_226);
		}
		if (!arg4 && !Static146.aBoolean129 && !Static40.aBoolean44 && local146 >= arg1 && arg1 + arg0 > local146 && arg2 <= local229 && arg3 + arg2 > local229) {
			Static104.method1600(arg1, local229, arg0, local146, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method1934(@OriginalArg(0) Class20_Sub3 arg0) {
		if (arg0.anInt3036 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt3010 != -1 && arg0.anInt3010 < 32768) {
			@Pc(26) Class20_Sub3_Sub2 local26 = Static78.aClass20_Sub3_Sub2Array1[arg0.anInt3010];
			if (local26 != null) {
				local34 = arg0.anInt3022 - local26.anInt3022;
				local41 = arg0.anInt3008 - local26.anInt3008;
				if (local34 != 0 || local41 != 0) {
					arg0.anInt3042 = (int) (Math.atan2((double) local34, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt3010 >= 32768) {
			local71 = arg0.anInt3010 - 32768;
			if (local71 == Static20.anInt417) {
				local71 = 2047;
			}
			@Pc(80) Class20_Sub3_Sub1 local80 = Static232.aClass20_Sub3_Sub1Array1[local71];
			if (local80 != null) {
				local41 = arg0.anInt3022 - local80.anInt3022;
				@Pc(94) int local94 = arg0.anInt3008 - local80.anInt3008;
				if (local41 != 0 || local94 != 0) {
					arg0.anInt3042 = (int) (Math.atan2((double) local41, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3023 != 0 || arg0.anInt3065 != 0) && (arg0.anInt3041 == 0 || arg0.anInt3029 > 0)) {
			local71 = arg0.anInt3034 * 64 + arg0.anInt3022 - (arg0.anInt3023 - Static91.anInt4078 - Static91.anInt4078) * 64 - 64;
			local34 = arg0.anInt3008 + arg0.anInt3034 * 64 - (arg0.anInt3065 - Static101.anInt2041 - Static101.anInt2041) * 64 - 64;
			if (local71 != 0 || local34 != 0) {
				arg0.anInt3042 = (int) (Math.atan2((double) local71, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt3065 = 0;
			arg0.anInt3023 = 0;
		}
		local71 = arg0.anInt3042 - arg0.anInt3054 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt3016 = 0;
			return;
		}
		arg0.anInt3016++;
		@Pc(238) boolean local238;
		if (local71 > 1024) {
			arg0.anInt3054 -= arg0.anInt3036;
			local238 = true;
			if (local71 < arg0.anInt3036 || local71 > 2048 - arg0.anInt3036) {
				arg0.anInt3054 = arg0.anInt3042;
				local238 = false;
			}
			if (arg0.anInt3057 == arg0.anInt3051 && (arg0.anInt3016 > 25 || local238)) {
				if (arg0.anInt3024 == -1) {
					arg0.anInt3051 = arg0.anInt3040;
				} else {
					arg0.anInt3051 = arg0.anInt3024;
				}
			}
		} else {
			local238 = true;
			arg0.anInt3054 += arg0.anInt3036;
			if (local71 < arg0.anInt3036 || 2048 - arg0.anInt3036 < local71) {
				local238 = false;
				arg0.anInt3054 = arg0.anInt3042;
			}
			if (arg0.anInt3051 == arg0.anInt3057 && (arg0.anInt3016 > 25 || local238)) {
				if (arg0.anInt3064 == -1) {
					arg0.anInt3051 = arg0.anInt3040;
				} else {
					arg0.anInt3051 = arg0.anInt3064;
				}
			}
		}
		arg0.anInt3054 &= 0x7FF;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!sh;I)V")
	public static void method1935(@OriginalArg(0) Class20_Sub3 arg0) {
		if (Static107.anInt2132 == arg0.anInt3030 || arg0.anInt3060 == -1 || arg0.anInt3014 != 0 || arg0.anInt3052 + 1 > Static200.method3204(arg0.anInt3060).anIntArray460[arg0.anInt3046]) {
			@Pc(50) int local50 = arg0.anInt3030 - arg0.anInt3028;
			@Pc(56) int local56 = Static107.anInt2132 - arg0.anInt3028;
			@Pc(66) int local66 = arg0.anInt3034 * 64 + arg0.anInt3049 * 128;
			@Pc(76) int local76 = arg0.anInt3034 * 64 + arg0.anInt3059 * 128;
			@Pc(86) int local86 = arg0.anInt3034 * 64 + arg0.anInt3063 * 128;
			@Pc(96) int local96 = arg0.anInt3034 * 64 + arg0.anInt3017 * 128;
			arg0.anInt3008 = (local76 * (local50 - local56) + local56 * local86) / local50;
			arg0.anInt3022 = (local66 * (local50 - local56) + local56 * local96) / local50;
		}
		if (arg0.anInt3031 == 0) {
			arg0.anInt3042 = 1024;
		}
		if (arg0.anInt3031 == 1) {
			arg0.anInt3042 = 1536;
		}
		arg0.anInt3029 = 0;
		if (arg0.anInt3031 == 2) {
			arg0.anInt3042 = 0;
		}
		if (arg0.anInt3031 == 3) {
			arg0.anInt3042 = 512;
		}
		arg0.anInt3054 = arg0.anInt3042;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!hh;I)I")
	public static int method1936(@OriginalArg(0) Class50 arg0) {
		return arg0.method1249() + 1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I")
	public static int method1938(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
	public static void method1939() {
		Static165.aClass50_901 = Static151.aClass50_1046;
		Static189.aClass50_1255 = Static218.aClass50_1181;
		Static150.aClass50_1030 = Static208.aClass50_1233;
		Static186.aClass50_1430 = Static160.aClass50_1081;
		Static76.aClass50_498 = Static59.aClass50_420;
		Static173.aClass50_1183 = Static30.aClass50_207;
		Static24.aClass50_193 = Static191.aClass50_1264;
		Static117.aClass50_793 = Static175.aClass50_1195;
		Static34.aClass50_266 = Static217.aClass50_1350;
		Static211.aClass50_1330 = Static166.aClass50_1111;
		Static176.aClass50_1202 = Static106.aClass50_694;
		Static112.aClass50_717 = Static56.aClass50_387;
		Static120.aClass50_821 = Static65.aClass50_1321;
		Static44.aClass50_333 = Static71.aClass50_485;
		Static93.aClass50_598 = Static110.aClass50_713;
		Static163.aClass50_1099 = Static100.aClass50_650;
		Static157.aClass50_1075 = Static227.aClass50_1382;
		Static99.aClass50_1434 = Static214.aClass50_1344;
		Static176.aClass50_1200 = Static116.aClass50_789;
		Static149.aClass50_1026 = Static175.aClass50_1187;
		Static194.aClass50_1268 = Static16.aClass50_131;
		Static130.aClass50_905 = Static47.aClass50_360;
		Static114.aClass50_787 = Static38.aClass50_300;
		Static33.aClass50_246 = Static191.aClass50_1265;
		Static21.aClass50_164 = Static132.aClass50_926;
		Static111.aClass50_714 = Static225.aClass50_1372;
		Static43.aClass50_328 = Static53.aClass50_381;
		Static32.aClass50_226 = Static42.aClass50_323;
		Static233.aClass50_1427 = Static199.aClass50_1295;
		Static79.aClass50_1055 = Static98.aClass50_645;
		Static175.aClass50_1196 = Static226.aClass50_1376;
		Static24.aClass50_192 = Static191.aClass50_1264;
		Static97.aClass50_629 = Static116.aClass50_790;
		Static117.aClass50_796 = Static7.aClass50_64;
		Static163.aClass50_1098 = Static7.aClass50_66;
		Static28.aClass50_206 = Static217.aClass50_1349;
		Static32.aClass50_229 = Static5.aClass50_35;
		Static132.aClass50_924 = Static219.aClass50_1011;
		Static22.aClass50_170 = Static158.aClass50_1076;
		Static113.aClass50_782 = Static146.aClass50_1014;
		Static54.aClass50_383 = Static59.aClass50_421;
		Static79.aClass50_1061 = Static105.aClass50_679;
		Static33.aClass50_248 = Static184.aClass50_1240;
		Static152.aClass50_1051 = Static87.aClass50_578;
		Static153.aClass50_1064 = Static138.aClass50_947;
		Static80.aClass50_530 = Static69.aClass50_479;
		Static66.aClass50_473 = Static9.aClass50_89;
		Static37.aClass50_299 = Static24.aClass50_188;
		Static206.aClass50_1317 = Static152.aClass50_1053;
		Static222.aClass50_1369 = Static4.aClass50_33;
		Static76.aClass50_501 = Static128.aClass50_890;
		Static196.aClass50_1285 = Static113.aClass50_785;
		Static70.aClass50_481 = Static220.aClass50_1351;
		Static171.aClass50_1147 = Static120.aClass50_822;
		Static162.aClass50_1087 = Static181.aClass50_1221;
		Static160.aClass50_1082 = Static227.aClass50_1381;
		Static198.aClass50_1292 = Static190.aClass50_1257;
		Static2.aClass50_21 = Static213.aClass50_1340;
		Static187.aClass50_1245 = Static9.aClass50_88;
		Static101.aClass50_666 = Static196.aClass50_1288;
		Static62.aClass50_445 = Static227.aClass50_1378;
		Static201.aClass50_1313 = Static55.aClass50_385;
		Static45.aClass50_338 = Static58.aClass50_413;
		Static175.aClass50_1191 = Static208.aClass50_1234;
		Static211.aClass50_1329 = Static230.aClass50_1068;
		Static233.aClass50_1424 = Static75.aClass50_496;
		Static163.aClass50_1092 = Static222.aClass50_1367;
		Static98.aClass50_649 = Static91.aClass50_1316;
		Static151.aClass50_1047 = Static191.aClass50_1260;
		Static150.aClass50_1029 = Static92.aClass50_591;
		Static128.aClass50_889 = Static109.aClass50_697;
		Static185.aClass50_1241 = Static194.aClass50_1266;
		Static58.aClass50_414 = Static61.aClass50_428;
		Static233.aClass50_1428 = Static41.aClass50_307;
		Static153.aClass50_1062 = Static138.aClass50_947;
		Static199.aClass50_1297 = Static79.aClass50_1059;
		Static78.aClass50_518 = Static224.aClass50_30;
		Static140.aClass50_967 = Static11.aClass50_106;
		Static203.aClass50_275 = Static181.aClass50_1222;
		Static166.aClass50_1112 = Static224.aClass50_28;
		Static191.aClass50_1259 = Static100.aClass50_651;
		Static133.aClass50_927 = Static194.aClass50_1267;
		Static37.aClass50_297 = Static203.aClass50_277;
		Static79.aClass50_1056 = Static105.aClass50_679;
		Static19.aClass50_158 = Static71.aClass50_484;
		Static60.aClass50_425 = Static119.aClass50_811;
		Static125.aClass50_864 = Static135.aClass50_942;
		Static234.aClass50_1439 = Static86.aClass50_559;
		Static64.aClass50_468 = Static14.aClass50_111;
		Static138.aClass50_946 = Static56.aClass50_388;
		Static68.aClass50_478 = Static14.aClass50_109;
		Static102.aClass50_670 = Static48.aClass50_376;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
	public static void method1940(@OriginalArg(1) boolean arg0) {
		Static192.method3138();
		if (Static220.anInt4304 != 30 && Static220.anInt4304 != 25) {
			return;
		}
		Static86.anInt1771++;
		if (Static86.anInt1771 < 50 && !arg0) {
			return;
		}
		Static86.anInt1771 = 0;
		if (!Static36.aBoolean29 && Static33.aClass26_2 != null) {
			Static32.aClass1_Sub17_Sub1_1.method2182(171);
			try {
				Static33.aClass26_2.method781(Static32.aClass1_Sub17_Sub1_1.aByteArray40, Static32.aClass1_Sub17_Sub1_1.anInt2656);
				Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
			} catch (@Pc(56) IOException local56) {
				Static36.aBoolean29 = true;
			}
		}
		Static192.method3138();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method1941(@OriginalArg(0) Class86 arg0) {
		Static58.aClass86_20 = arg0;
	}
}
