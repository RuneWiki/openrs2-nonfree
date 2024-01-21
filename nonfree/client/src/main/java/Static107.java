import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_5;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_43;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array8;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ob;")
	public static Class5_Sub2_Sub11 aClass5_Sub2_Sub11_1;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "Lclient!jd;")
	public static Class11 aClass11_117;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1222 = Static63.method1251(" from your ignore list first");

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1223 = Static63.method1251("Loading interfaces )2 ");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1224 = aClass45_1222;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1225 = Static63.method1251("Entfernen");

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	public static int anInt2801 = -1;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1228 = Static63.method1251("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1226 = aClass45_1228;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1227 = aClass45_1223;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public static int anInt2807 = 255;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1229 = Static63.method1251("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	public static void method1922(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub6 local12 = (Class5_Sub6) Static87.aClass66_8.method1812((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray149.length; local21++) {
				local12.anIntArray149[local21] = -1;
				local12.anIntArray147[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!df;Lclient!df;B)V")
	public static void method1923(@OriginalArg(0) Class5_Sub2_Sub6_Sub1 arg0, @OriginalArg(1) Class5_Sub2_Sub6_Sub1 arg1) {
		Static64.aClass11_79.method2152();
		if (Static121.anInt2385 == 0 || Static121.anInt2385 == 5) {
			arg1.method514(Static98.aClass45_1133, 180, 54, 16777215);
			Static118.method1867(28, 62, 304, 34, 9179409);
			Static118.method1867(29, 63, 302, 32, 0);
			Static118.method1858(30, 64, Static31.anInt926 * 3, 30, 9179409);
			Static118.method1858(Static31.anInt926 * 3 + 30, 64, 300 - Static31.anInt926 * 3, 30, 0);
			arg1.method514(Static40.aClass45_517, 180, 85, 16777215);
		}
		@Pc(98) byte local98;
		@Pc(106) int local106;
		if (Static121.anInt2385 == 20) {
			Static44.aClass5_Sub2_Sub6_Sub4_21.method1874(0, 0);
			local98 = 40;
			arg1.method503(Static40.aClass45_529, 180, 40, 16776960, true);
			local106 = local98 + 15;
			arg1.method503(Static40.aClass45_515, 180, 55, 16776960, true);
			@Pc(114) int local114 = local106 + 15;
			arg1.method503(Static40.aClass45_524, 180, 70, 16776960, true);
			@Pc(122) int local122 = local114 + 15;
			@Pc(123) int local123 = local122 + 10;
			arg1.method524(Static39.method1443(new Class45[] { Static52.aClass45_1370, Static40.aClass45_518 }), 90, 95, 16777215, true);
			@Pc(144) int local144 = local123 + 15;
			arg1.method524(Static39.method1443(new Class45[] { Static79.aClass45_951, Static40.aClass45_525.method1309() }), 92, 110, 16777215, true);
			@Pc(165) int local165 = local144 + 15;
		}
		if (Static121.anInt2385 == 10) {
			Static44.aClass5_Sub2_Sub6_Sub4_21.method1874(0, 0);
			if (Static92.anInt3054 == 0) {
				local98 = 80;
				arg1.method503(Static7.aClass45_92, 180, 80, 16776960, true);
				Static19.aClass5_Sub2_Sub6_Sub4_12.method1874(27, 100);
				arg1.method521(Static57.aClass45_685, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				local106 = local98 + 30;
				Static19.aClass5_Sub2_Sub6_Sub4_12.method1874(187, 100);
				arg1.method521(Static91.aClass45_1064, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static92.anInt3054 == 2) {
				local98 = 40;
				arg1.method503(Static40.aClass45_529, 180, 40, 16776960, true);
				local106 = local98 + 15;
				arg1.method503(Static40.aClass45_515, 180, 55, 16776960, true);
				local106 += 15;
				arg1.method503(Static40.aClass45_524, 180, 70, 16776960, true);
				local106 += 15;
				local106 += 10;
				arg1.method524(Static39.method1443(new Class45[] { Static52.aClass45_1370, Static40.aClass45_518, Static3.anInt94 % 40 < 20 & Static75.anInt2185 == 0 ? Static42.aClass45_399 : Static40.aClass45_520 }), 90, 95, 16777215, true);
				local106 += 15;
				arg1.method524(Static39.method1443(new Class45[] { Static79.aClass45_951, Static40.aClass45_525.method1309(), Static75.anInt2185 == 1 & Static3.anInt94 % 40 < 20 ? Static42.aClass45_399 : Static40.aClass45_520 }), 92, 110, 16777215, true);
				local106 += 15;
				Static19.aClass5_Sub2_Sub6_Sub4_12.method1874(27, 130);
				arg1.method503(Static72.aClass45_889, 100, 155, 16777215, true);
				Static19.aClass5_Sub2_Sub6_Sub4_12.method1874(187, 130);
				arg1.method503(Static16.aClass45_226, 260, 155, 16777215, true);
			} else if (Static92.anInt3054 == 3) {
				arg1.method503(Static114.aClass45_1311, 180, 40, 16776960, true);
				local98 = 65;
				arg1.method503(Static112.aClass45_1292, 180, 65, 16777215, true);
				local106 = local98 + 15;
				arg1.method503(Static48.aClass45_632, 180, 80, 16777215, true);
				local106 += 15;
				arg1.method503(Static40.aClass45_526, 180, 95, 16777215, true);
				local106 += 15;
				arg1.method503(Static122.aClass45_1380, 180, 110, 16777215, true);
				local106 += 15;
				Static19.aClass5_Sub2_Sub6_Sub4_12.method1874(107, 130);
				arg1.method503(Static16.aClass45_226, 180, 155, 16777215, true);
			}
		}
		Static12.method2138();
		try {
			@Pc(472) Graphics local472 = Static75.aCanvas1.getGraphics();
			Static64.aClass11_79.method2148(local472, 202, 171);
			Static120.aClass11_138.method2148(local472, 0, 0);
			aClass11_117.method2148(local472, 637, 0);
			if (Static19.aBoolean26) {
				Static19.aBoolean26 = false;
				Static73.aClass11_90.method2148(local472, 128, 0);
				Static11.aClass11_18.method2148(local472, 202, 371);
				Static87.aClass11_100.method2148(local472, 0, 265);
				Static75.aClass11_91.method2148(local472, 562, 265);
				Static56.aClass11_72.method2148(local472, 128, 171);
				Static36.aClass11_48.method2148(local472, 562, 171);
			}
		} catch (@Pc(536) Exception local536) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1924() {
		aClass11_117 = null;
		aClass45_1222 = null;
		aClass5_Sub2_Sub6_Sub4_43 = null;
		aClass45_1226 = null;
		aClass45_1224 = null;
		aClass45_1223 = null;
		aClass45_1227 = null;
		aClass5_Sub2_Sub6_Sub3_5 = null;
		aClass45_1229 = null;
		aClass45_1225 = null;
		aClass45_1228 = null;
		aClass5_Sub2_Sub6_Sub3Array8 = null;
		aClass5_Sub2_Sub11_1 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method1926() {
		Static103.aClass10_12 = new Class10();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public static void method1929() {
		Static119.aClass45_1354 = Static112.aClass45_1288;
		Static61.aClass45_742 = Static71.aClass45_875;
		Static71.aClass45_878 = Static11.aClass45_175;
		Static6.aClass45_77 = Static17.aClass45_240;
		Static61.aClass45_746 = Static116.aClass45_1327;
		Static61.aClass45_750 = Static71.aClass45_875;
		Static48.aClass45_632 = Static93.aClass45_1087;
		Static98.aClass45_1133 = Static56.aClass45_682;
		Static72.aClass45_890 = Static53.aClass45_1010;
		Static120.aClass45_1366 = Static19.aClass45_286;
		Static61.aClass45_725 = Static71.aClass45_875;
		Static108.aClass45_1246 = Static75.aClass45_907;
		Static122.aClass45_1378 = Static5.aClass45_41;
		Static13.aClass45_200 = Static69.aClass45_845;
		Static17.aClass45_241 = Static38.aClass45_506;
		Static11.aClass45_177 = Static37.aClass45_499;
		Static1.aClass45_2 = Static25.aClass45_385;
		Static46.aClass45_564 = Static50.aClass45_643;
		Static51.aClass45_649 = Static73.aClass45_893;
		Static9.aClass45_159 = Static80.aClass45_955;
		Static74.aClass45_1047 = Static49.aClass45_639;
		Static6.aClass45_71 = Static21.aClass45_316;
		Static61.aClass45_736 = Static71.aClass45_875;
		Static104.aClass45_1195 = Static122.aClass45_1390;
		Static28.aClass45_428 = Static76.aClass45_914;
		Static23.aClass45_377 = Static55.aClass45_671;
		Static102.aClass45_1181 = Static54.aClass45_652;
		Static19.aClass45_282 = Static10.aClass45_163;
		Static117.aClass45_1345 = Static99.aClass45_1143;
		Static102.aClass45_1179 = Static122.aClass45_1386;
		Static16.aClass45_233 = Static119.aClass45_1350;
		Static11.aClass45_170 = Static36.aClass45_489;
		Static27.aClass45_415 = Static109.aClass45_1260;
		Static61.aClass45_758 = Static71.aClass45_875;
		Static67.aClass45_824 = Static91.aClass45_1066;
		Static103.aClass45_1190 = Static75.aClass45_905;
		Static1.aClass45_3 = Static61.aClass45_760;
		Static16.aClass45_226 = Static64.aClass45_785;
		Static25.aClass45_384 = Static80.aClass45_954;
		Static41.aClass45_963 = Static29.aClass45_433;
		Static33.aClass45_469 = Static9.aClass45_157;
		Static17.aClass45_246 = Static109.aClass45_1259;
		Static10.aClass45_168 = Static92.aClass45_1332;
		Static79.aClass45_951 = Static109.aClass45_1263;
		Static33.aClass45_467 = Static27.aClass45_416;
		Static119.aClass45_1351 = Static112.aClass45_1288;
		Static50.aClass45_647 = Static71.aClass45_876;
		Static38.aClass45_504 = Static16.aClass45_229;
		Static17.aClass45_250 = Static36.aClass45_492;
		Static61.aClass45_732 = Static116.aClass45_1327;
		Static122.aClass45_1385 = Static96.aClass45_1101;
		Static60.aClass45_717 = Static40.aClass45_531;
		Static99.aClass45_1139 = Static90.aClass45_1052;
		Static4.aClass45_36 = Static92.aClass45_1338;
		Static61.aClass45_765 = Static121.aClass45_1013;
		Static27.aClass45_414 = Static115.aClass45_1316;
		Static122.aClass45_1380 = Static1.aClass45_6;
		Static73.aClass45_900 = Static48.aClass45_630;
		Static120.aClass45_1360 = Static84.aClass45_987;
		Static4.aClass45_37 = Static68.aClass45_827;
		Static61.aClass45_722 = Static71.aClass45_875;
		Static55.aClass45_675 = Static103.aClass45_1191;
		Static61.aClass45_744 = Static71.aClass45_875;
		Static10.aClass45_160 = Static12.aClass45_1359;
		Static61.aClass45_751 = Static71.aClass45_875;
		Static103.aClass45_1184 = Static45.aClass45_557;
		Static62.aClass45_773 = Static66.aClass45_814;
		Static16.aClass45_223 = Static75.aClass45_910;
		Static16.aClass45_222 = Static16.aClass45_228;
		Static112.aClass45_1289 = Static32.aClass45_463;
		Static115.aClass45_1318 = Static111.aClass45_1278;
		Static33.aClass45_471 = Static44.aClass45_549;
		Static27.aClass45_420 = Static115.aClass45_1316;
		Static101.aClass45_486 = Static14.aClass45_207;
		Static13.aClass45_202 = Static122.aClass45_1382;
		Static3.aClass45_34 = Static14.aClass45_206;
		Static34.aClass45_476 = Static32.aClass45_460;
		Static98.aClass45_1125 = Static40.aClass45_523;
		Static73.aClass45_895 = Static117.aClass45_1343;
		Static7.aClass45_93 = Static75.aClass45_912;
		Static66.aClass45_813 = Static77.aClass45_920;
		Static73.aClass45_894 = Static33.aClass45_470;
		Static98.aClass45_1136 = Static120.aClass45_1364;
		Static98.aClass45_1126 = Static105.aClass45_1205;
		Static96.aClass45_1111 = Static72.aClass45_888;
		Static111.aClass45_1277 = Static106.aClass45_1217;
		Static61.aClass45_753 = Static36.aClass45_490;
		Static122.aClass45_1388 = Static37.aClass45_497;
		Static98.aClass45_1138 = Static7.aClass45_95;
		Static75.aClass45_911 = Static66.aClass45_811;
		Static40.aClass45_527 = Static119.aClass45_1355;
		Static97.aClass45_1117 = Static17.aClass45_238;
		Static98.aClass45_1122 = Static40.aClass45_523;
		Static2.aClass45_13 = Static25.aClass45_378;
		Static61.aClass45_737 = Static105.aClass45_1205;
		Static104.aClass45_1197 = Static97.aClass45_1118;
		aClass45_1226 = Static14.aClass45_208;
		Static109.aClass45_1262 = Static90.aClass45_1057;
		Static17.aClass45_247 = Static29.aClass45_431;
		Static114.aClass45_1312 = Static89.aClass45_1051;
		Static52.aClass45_1370 = Static77.aClass45_918;
		Static61.aClass45_749 = aClass45_1229;
		Static61.aClass45_743 = Static71.aClass45_875;
		Static88.aClass45_1040 = Static55.aClass45_676;
		Static61.aClass45_759 = Static29.aClass45_429;
		Static98.aClass45_1135 = Static105.aClass45_1205;
		Static105.aClass45_1210 = Static85.aClass45_1023;
		Static96.aClass45_1106 = Static106.aClass45_1221;
		Static98.aClass45_1137 = Static34.aClass45_475;
		Static74.aClass45_1045 = Static3.aClass45_33;
		Static64.aClass45_786 = Static5.aClass45_46;
		Static61.aClass45_739 = Static79.aClass45_945;
		Static53.aClass45_1002 = Static114.aClass45_1313;
		Static17.aClass45_260 = Static36.aClass45_492;
		Static62.aClass45_766 = Static71.aClass45_875;
		Static62.aClass45_771 = Static111.aClass45_1274;
		aClass45_1224 = Static120.aClass45_1363;
		Static80.aClass45_957 = Static33.aClass45_465;
		Static75.aClass45_906 = Static108.aClass45_1245;
		Static121.aClass45_1011 = Static119.aClass45_1348;
		Static67.aClass45_815 = Static104.aClass45_1193;
		Static91.aClass45_1064 = Static42.aClass45_400;
		Static112.aClass45_1292 = Static108.aClass45_1243;
		Static87.aClass45_1036 = Static93.aClass45_1082;
		Static84.aClass45_986 = Static29.aClass45_432;
		Static96.aClass45_1110 = Static36.aClass45_490;
		Static10.aClass45_169 = Static16.aClass45_232;
		Static33.aClass45_468 = Static16.aClass45_235;
		Static25.aClass45_387 = Static79.aClass45_950;
		Static61.aClass45_728 = Static55.aClass45_672;
		Static61.aClass45_748 = Static70.aClass45_850;
		Static54.aClass45_655 = aClass45_1225;
		Static99.aClass45_1142 = Static117.aClass45_1344;
		Static52.aClass45_1372 = Static16.aClass45_227;
		Static122.aClass45_1389 = Static116.aClass45_1324;
		Static61.aClass45_754 = Static5.aClass45_44;
		Static42.aClass45_398 = Static32.aClass45_462;
		Static111.aClass45_1273 = Static37.aClass45_498;
		Static122.aClass45_1375 = Static50.aClass45_646;
		Static103.aClass45_1185 = Static25.aClass45_382;
		Static61.aClass45_755 = Static98.aClass45_1128;
		Static98.aClass45_1134 = Static105.aClass45_1205;
		Static40.aClass45_526 = Static74.aClass45_1044;
		Static77.aClass45_916 = Static81.aClass45_959;
		Static103.aClass45_1188 = Static68.aClass45_828;
		Static53.aClass45_1009 = Static21.aClass45_314;
		Static61.aClass45_735 = Static29.aClass45_429;
		Static61.aClass45_752 = Static71.aClass45_875;
		Static53.aClass45_1001 = Static5.aClass45_45;
		Static119.aClass45_1353 = Static91.aClass45_1065;
		Static50.aClass45_642 = Static119.aClass45_1350;
		Static91.aClass45_1063 = Static6.aClass45_76;
		Static61.aClass45_729 = Static71.aClass45_875;
		Static42.aClass45_395 = Static13.aClass45_196;
		Static57.aClass45_685 = Static111.aClass45_1279;
		Static62.aClass45_775 = Static121.aClass45_1016;
		Static98.aClass45_1130 = Static116.aClass45_1325;
		Static61.aClass45_740 = Static71.aClass45_875;
		Static61.aClass45_731 = Static71.aClass45_875;
		Static31.aClass45_446 = Static5.aClass45_43;
		Static49.aClass45_636 = Static90.aClass45_1053;
		Static97.aClass45_1114 = Static39.aClass45_883;
		Static100.aClass45_1159 = Static46.aClass45_565;
		Static69.aClass45_847 = Static117.aClass45_1346;
		Static68.aClass45_825 = Static61.aClass45_756;
		Static61.aClass45_730 = Static71.aClass45_875;
		Static112.aClass45_1290 = Static60.aClass45_721;
		Static69.aClass45_848 = Static97.aClass45_1116;
		Static61.aClass45_734 = Static9.aClass45_155;
		Static85.aClass45_1022 = Static16.aClass45_224;
		Static92.aClass45_1335 = Static13.aClass45_201;
		Static14.aClass45_204 = Static92.aClass45_1337;
		Static92.aClass45_1339 = Static13.aClass45_201;
		Static49.aClass45_638 = Static73.aClass45_893;
		Static63.aClass45_784 = Static2.aClass45_11;
		Static89.aClass45_1049 = Static29.aClass45_435;
		Static37.aClass45_500 = Static87.aClass45_1038;
		Static62.aClass45_767 = Static105.aClass45_1209;
		Static21.aClass45_315 = Static32.aClass45_457;
		Static16.aClass45_237 = Static47.aClass45_568;
		Static96.aClass45_1102 = Static10.aClass45_167;
		aClass45_1227 = Static37.aClass45_503;
		Static30.aClass45_215 = Static114.aClass45_1310;
		Static67.aClass45_820 = Static61.aClass45_763;
		Static61.aClass45_726 = Static71.aClass45_875;
		Static36.aClass45_491 = Static93.aClass45_1085;
		Static61.aClass45_738 = Static59.aClass45_714;
		Static7.aClass45_92 = Static21.aClass45_318;
		Static50.aClass45_645 = Static10.aClass45_162;
		Static72.aClass45_889 = Static97.aClass45_1115;
		Static110.aClass45_1269 = Static96.aClass45_1105;
		Static104.aClass45_1194 = Static114.aClass45_1309;
		Static56.aClass45_681 = Static114.aClass45_1314;
		Static32.aClass45_461 = Static77.aClass45_917;
		Static44.aClass45_546 = Static72.aClass45_887;
		Static2.aClass45_8 = Static19.aClass45_287;
		Static114.aClass45_1311 = Static76.aClass45_913;
		Static61.aClass45_757 = Static30.aClass45_217;
		Static117.aClass45_1340 = Static46.aClass45_562;
		Static61.aClass45_745 = Static71.aClass45_875;
		Static105.aClass45_1208 = Static52.aClass45_1368;
		Static60.aClass45_716 = Static105.aClass45_1200;
		Static68.aClass45_829 = Static63.aClass45_783;
		Static30.aClass45_218 = Static90.aClass45_1058;
		Static55.aClass45_673 = Static105.aClass45_1206;
		Static85.aClass45_1020 = Static25.aClass45_381;
		Static28.aClass45_426 = Static106.aClass45_1216;
		Static70.aClass45_851 = Static105.aClass45_1203;
		Static61.aClass45_724 = Static71.aClass45_875;
		Static40.aClass45_530 = Static106.aClass45_1218;
		Static79.aClass45_944 = Static31.aClass45_444;
		Static61.aClass45_733 = Static78.aClass45_927;
		Static105.aClass45_1202 = Static9.aClass45_156;
		Static31.aClass45_448 = Static11.aClass45_171;
		Static67.aClass45_819 = Static48.aClass45_631;
		Static17.aClass45_257 = Static47.aClass45_567;
		Static19.aClass45_284 = Static111.aClass45_1272;
	}
}
