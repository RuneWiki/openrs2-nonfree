import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "Lclient!jb;")
	public static Class35 aClass35_3;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
	public static int anInt3003;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1202 = Static121.method2047("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1203 = Static121.method2047(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public static int anInt2996 = 0;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1204 = Static121.method2047("<col=ffff00>");

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1205 = Static121.method2047("titlebox");

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "Lclient!tb;")
	public static Class70 aClass70_19 = new Class70();

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1207 = Static121.method2047("slide:");

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1206 = aClass60_1207;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1208 = aClass60_1207;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	public static int anInt3002 = 0;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1211 = Static121.method2047("Too many connections from your address)3");

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1209 = aClass60_1211;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1210 = Static121.method2047("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
	public static void method2119(@OriginalArg(0) int arg0) {
		if (Static30.anInt836 == 0) {
			Static59.aClass4_Sub2_Sub2_2.method552(arg0);
		} else {
			Static3.anInt31 = arg0;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBII)V")
	public static void method2120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static58.anIntArrayArrayArray5[arg1][arg2 + local3][arg0 + local7] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static58.anIntArrayArrayArray5[arg1][arg2][local7 + arg0] = Static58.anIntArrayArrayArray5[arg1][arg2 - 1][local7 + arg0];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static58.anIntArrayArrayArray5[arg1][arg2 + local7][arg0] = Static58.anIntArrayArrayArray5[arg1][local7 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static58.anIntArrayArrayArray5[arg1][arg2 - 1][arg0] != 0) {
			Static58.anIntArrayArrayArray5[arg1][arg2][arg0] = Static58.anIntArrayArrayArray5[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static58.anIntArrayArrayArray5[arg1][arg2][arg0 - 1] != 0) {
			Static58.anIntArrayArrayArray5[arg1][arg2][arg0] = Static58.anIntArrayArrayArray5[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static58.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static58.anIntArrayArrayArray5[arg1][arg2][arg0] = Static58.anIntArrayArrayArray5[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public static void method2121() {
		Class8_Sub2.anIntArray335 = null;
		aClass60_1205 = null;
		aClass70_19 = null;
		aClass60_1207 = null;
		aClass60_1209 = null;
		aClass60_1211 = null;
		aClass60_1204 = null;
		aClass60_1208 = null;
		aClass60_1206 = null;
		aClass35_3 = null;
		aClass60_1202 = null;
		aClass60_1210 = null;
		aClass60_1203 = null;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public static void method2122() {
		Static52.aClass60_515 = Static6.aClass60_36;
		Static34.aClass60_377 = Static120.aClass60_787;
		Static19.aClass60_190 = Static28.aClass60_319;
		Static66.aClass60_581 = Static32.aClass60_356;
		Static71.aClass60_687 = Static112.aClass60_1094;
		Static82.aClass60_805 = Static71.aClass60_700;
		Static35.aClass60_379 = Static32.aClass60_358;
		Static18.aClass60_167 = Static121.aClass60_1158;
		Static37.aClass60_394 = Static24.aClass60_282;
		Static94.aClass60_918 = Static30.aClass60_338;
		Static103.aClass60_596 = Static11.aClass60_106;
		Static95.aClass60_928 = Static60.aClass60_940;
		Static71.aClass60_702 = Static131.aClass60_1220;
		Static70.aClass60_647 = Static86.aClass60_274;
		Static3.aClass60_12 = Static85.aClass60_835;
		Static71.aClass60_698 = Static112.aClass60_1094;
		Static99.aClass60_986 = Static63.aClass60_601;
		Static71.aClass60_689 = Static123.aClass60_1168;
		Static71.aClass60_673 = Static56.aClass60_538;
		Static71.aClass60_697 = Static120.aClass60_778;
		Static108.aClass60_1032 = Static57.aClass60_180;
		Static112.aClass60_1096 = Static105.aClass60_1013;
		Static71.aClass60_706 = Static112.aClass60_1094;
		Static82.aClass60_803 = Static107.aClass60_1025;
		Static71.aClass60_664 = Static112.aClass60_1094;
		Static70.aClass60_646 = Static25.aClass60_287;
		Static71.aClass60_663 = Static32.aClass60_359;
		Static71.aClass60_685 = Static112.aClass60_1094;
		Static104.aClass60_1006 = Static75.aClass60_732;
		Static98.aClass60_982 = Static86.aClass60_275;
		Static102.aClass60_999 = Static88.aClass60_851;
		Static92.aClass60_890 = Static78.aClass60_756;
		Static71.aClass60_682 = Static112.aClass60_1094;
		Static71.aClass60_684 = Static112.aClass60_1094;
		Static131.aClass60_1225 = Static83.aClass60_819;
		Static108.aClass60_1043 = Static74.aClass60_726;
		Static18.aClass60_166 = Static119.aClass60_1141;
		Static127.aClass60_1193 = Static72.aClass60_711;
		Static75.aClass60_733 = Static32.aClass60_352;
		Static36.aClass60_385 = Static115.aClass60_1111;
		Static74.aClass60_721 = Static30.aClass60_337;
		Static17.aClass60_162 = Static128.aClass60_1065;
		Static115.aClass60_1109 = Static36.aClass60_387;
		Static71.aClass60_704 = Static57.aClass60_183;
		Static58.aClass60_545 = Static19.aClass60_193;
		Static41.aClass60_436 = aClass60_1202;
		Static110.aClass60_1073 = Static20.aClass60_210;
		Static116.aClass60_1114 = Static28.aClass60_317;
		Static94.aClass60_910 = Static30.aClass60_338;
		Static73.aClass60_715 = Static112.aClass60_1092;
		Static39.aClass60_420 = Static24.aClass60_280;
		Static105.aClass60_1012 = Static95.aClass60_922;
		Static46.aClass60_471 = Static77.aClass60_750;
		Static95.aClass60_924 = Static2.aClass60_522;
		Static71.aClass60_679 = Static30.aClass60_339;
		Static107.aClass60_1022 = Static126.aClass60_1179;
		Static94.aClass60_915 = Static74.aClass60_722;
		Static20.aClass60_208 = Static82.aClass60_802;
		Static4.aClass60_20 = aClass60_1210;
		Static25.aClass60_288 = Static121.aClass60_1157;
		Static90.aClass60_872 = Static122.aClass60_1165;
		Static71.aClass60_674 = Static131.aClass60_1220;
		Static75.aClass60_734 = Static83.aClass60_814;
		Static10.aClass60_96 = Static112.aClass60_1094;
		Static120.aClass60_779 = Static7.aClass60_1199;
		Static8.aClass60_48 = Static72.aClass60_709;
		Static37.aClass60_396 = Static109.aClass60_1067;
		Static15.aClass60_1188 = Static16.aClass60_155;
		Static2.aClass60_521 = Static51.aClass60_512;
		Static24.aClass60_283 = Static56.aClass60_540;
		Static60.aClass60_947 = Static14.aClass60_1214;
		Static89.aClass60_855 = Static58.aClass60_546;
		Static106.aClass60_1014 = Static108.aClass60_1038;
		Static67.aClass60_1130 = Static111.aClass60_1078;
		Static107.aClass60_1027 = Static120.aClass60_776;
		Static11.aClass60_103 = Static90.aClass60_868;
		Static71.aClass60_708 = Static112.aClass60_1094;
		Static70.aClass60_648 = Static31.aClass60_343;
		Static76.aClass60_743 = Static22.aClass60_239;
		Static81.aClass60_796 = Static83.aClass60_818;
		Static69.aClass60_628 = Static65.aClass60_608;
		Static70.aClass60_644 = Static86.aClass60_274;
		Static108.aClass60_1046 = Static66.aClass60_579;
		Static106.aClass60_1015 = Static109.aClass60_1068;
		Static120.aClass60_777 = Static38.aClass60_404;
		Static126.aClass60_1183 = Static62.aClass60_597;
		Static5.aClass60_24 = Static31.aClass60_345;
		Static71.aClass60_676 = Static112.aClass60_1094;
		Static83.aClass60_816 = Static73.aClass60_718;
		Static16.aClass60_158 = Static128.aClass60_1058;
		Static105.aClass60_1011 = Static95.aClass60_922;
		Static119.aClass60_1142 = Static82.aClass60_804;
		Static71.aClass60_690 = Static112.aClass60_1094;
		Static25.aClass60_286 = Static116.aClass60_1115;
		Static20.aClass60_211 = Static56.aClass60_539;
		Static83.aClass60_817 = Static14.aClass60_1212;
		Static120.aClass60_784 = Static128.aClass60_1063;
		Static90.aClass60_871 = Static102.aClass60_1002;
		Static71.aClass60_692 = Static112.aClass60_1094;
		Static2.aClass60_519 = Static51.aClass60_512;
		Static95.aClass60_921 = Static84.aClass60_831;
		Static117.aClass60_1120 = Static72.aClass60_710;
		Static76.aClass60_745 = Static101.aClass60_998;
		Static57.aClass60_182 = Static120.aClass60_774;
		Static114.aClass60_1101 = Static29.aClass60_326;
		Static110.aClass60_1076 = Static20.aClass60_210;
		Static38.aClass60_400 = Static64.aClass60_605;
		Static41.aClass60_430 = Static5.aClass60_32;
		Static31.aClass60_344 = Static27.aClass60_308;
		Static60.aClass60_934 = Static82.aClass60_808;
		Static31.aClass60_340 = Static28.aClass60_320;
		Static122.aClass60_1164 = Static35.aClass60_381;
		Static71.aClass60_675 = Static112.aClass60_1094;
		Static32.aClass60_360 = Static48.aClass60_505;
		Static23.aClass60_257 = Static82.aClass60_810;
		Static71.aClass60_678 = Static112.aClass60_1094;
		Static71.aClass60_668 = Static112.aClass60_1094;
		Static78.aClass60_753 = Static46.aClass60_473;
		Static59.aClass60_549 = Static26.aClass60_303;
		Static88.aClass60_850 = Static48.aClass60_504;
		Static29.aClass60_328 = Static19.aClass60_195;
		Static108.aClass60_1034 = Static130.aClass60_1215;
		Static125.aClass60_1175 = Static24.aClass60_284;
		Static86.aClass60_272 = Static71.aClass60_683;
		Static84.aClass60_833 = Static77.aClass60_747;
		Static93.aClass60_909 = Static58.aClass60_548;
		Static86.aClass60_267 = Static69.aClass60_632;
		Static71.aClass60_691 = Static112.aClass60_1094;
		Static69.aClass60_629 = Static95.aClass60_927;
		Static15.aClass60_1187 = Static16.aClass60_154;
		Static71.aClass60_681 = Static112.aClass60_1094;
		Static120.aClass60_785 = Static81.aClass60_795;
		Static125.aClass60_1174 = Static15.aClass60_1192;
		Static112.aClass60_1088 = Static89.aClass60_852;
		Static121.aClass60_1155 = Static85.aClass60_836;
		Static71.aClass60_686 = Static112.aClass60_1094;
		Static63.aClass60_599 = Static95.aClass60_923;
		Static71.aClass60_672 = Static39.aClass60_418;
		Static71.aClass60_705 = Static19.aClass60_197;
		Static92.aClass60_900 = Static1.aClass60_1;
		Static71.aClass60_688 = Static31.aClass60_342;
		Static71.aClass60_696 = Static112.aClass60_1094;
		Static9.aClass60_62 = Static85.aClass60_834;
		Static112.aClass60_1091 = Static33.aClass60_367;
		Static71.aClass60_680 = Static23.aClass60_252;
		Static5.aClass60_25 = Static39.aClass60_417;
		Static120.aClass60_780 = Static81.aClass60_795;
		Static110.aClass60_1070 = Static92.aClass60_901;
		Static29.aClass60_325 = Static5.aClass60_31;
		Static120.aClass60_789 = Static128.aClass60_1063;
		Static71.aClass60_665 = Static10.aClass60_98;
		Static19.aClass60_188 = Static74.aClass60_723;
		Static71.aClass60_666 = Static112.aClass60_1094;
		Static37.aClass60_392 = Static70.aClass60_643;
		Static19.aClass60_189 = Static73.aClass60_716;
		Static106.aClass60_1018 = Static19.aClass60_187;
		Static125.aClass60_1170 = Static9.aClass60_59;
		Static23.aClass60_251 = Static104.aClass60_1008;
		aClass60_1206 = Static77.aClass60_749;
		Static71.aClass60_670 = Static110.aClass60_1069;
		Static5.aClass60_28 = Static31.aClass60_347;
		Static16.aClass60_149 = Static57.aClass60_179;
		Static71.aClass60_707 = Static73.aClass60_714;
		Static114.aClass60_1097 = Static45.aClass60_459;
		Static5.aClass60_27 = Static126.aClass60_1181;
		Static23.aClass60_245 = Static57.aClass60_184;
		Static127.aClass60_1195 = Static24.aClass60_281;
		Static38.aClass60_401 = Static131.aClass60_1224;
		Static114.aClass60_1098 = Static128.aClass60_1062;
		Static120.aClass60_790 = Static23.aClass60_252;
		Static41.aClass60_435 = Static95.aClass60_929;
		Static77.aClass60_751 = Static19.aClass60_194;
		Static71.aClass60_695 = Static31.aClass60_342;
		Static41.aClass60_432 = Static17.aClass60_164;
		Static17.aClass60_160 = Static2.aClass60_524;
		Static11.aClass60_105 = Static114.aClass60_1104;
		Static110.aClass60_1075 = Static17.aClass60_159;
		Static131.aClass60_1226 = Static90.aClass60_877;
		Static16.aClass60_152 = Static57.aClass60_181;
		Static34.aClass60_372 = Static60.aClass60_941;
		Static71.aClass60_694 = Static112.aClass60_1094;
		Static74.aClass60_727 = Static123.aClass60_1169;
		Static10.aClass60_97 = Static81.aClass60_798;
		Static10.aClass60_101 = Static89.aClass60_857;
		Static120.aClass60_781 = Static23.aClass60_252;
		aClass60_1209 = Static81.aClass60_799;
		Static28.aClass60_316 = Static115.aClass60_1112;
		Static76.aClass60_740 = Static3.aClass60_10;
		Static108.aClass60_1037 = Static108.aClass60_1040;
		Static86.aClass60_273 = Static25.aClass60_290;
		Static23.aClass60_250 = Static102.aClass60_1000;
		Static94.aClass60_911 = Static47.aClass60_483;
		Static120.aClass60_783 = Static23.aClass60_252;
		Static34.aClass60_375 = Static32.aClass60_357;
		Static29.aClass60_324 = Static127.aClass60_1197;
		Static71.aClass60_662 = Static112.aClass60_1094;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IB)Z")
	public static boolean method2123(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}
}
