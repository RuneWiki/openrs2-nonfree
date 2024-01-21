import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "J")
	public static long aLong152;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "Lclient!pd;")
	public static Class74 aClass74_5;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1719 = Static120.method1824(")4l");

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1720 = Static120.method1824("Mem:");

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1721 = Static120.method1824("Invalid username or password)3");

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "[Lclient!sa;")
	public static final Class3_Sub1_Sub4_Sub4[] aClass3_Sub1_Sub4_Sub4Array17 = new Class3_Sub1_Sub4_Sub4[1000];

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1722 = Static120.method1824("::noclip");

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1723 = aClass80_1721;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Lclient!w;")
	public static Class92 method3133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass92_1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJII)Z")
	public static boolean method3134(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 20 & 0x3;
		@Pc(19) int local19 = (int) arg0 >> 14 & 0x1F;
		@Pc(26) int local26 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local19 == 10 || local19 == 11 || local19 == 22) {
			@Pc(41) Class3_Sub1_Sub1 local41 = Static162.method2627(local26);
			@Pc(57) int local57;
			@Pc(54) int local54;
			if (local12 == 0 || local12 == 2) {
				local54 = local41.anInt150;
				local57 = local41.anInt145;
			} else {
				local54 = local41.anInt145;
				local57 = local41.anInt150;
			}
			@Pc(68) int local68 = local41.anInt144;
			if (local12 != 0) {
				local68 = (local68 << local12 & 0xF) + (local68 >> 4 - local12);
			}
			Static27.method3147(local54, arg2, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], arg1, true, 2, 0, local68, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], local57, 0);
		} else {
			Static27.method3147(0, arg2, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], arg1, true, 2, local19 + 1, 0, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], 0, local12);
		}
		Static29.anInt730 = Static20.anInt497;
		Static143.anInt3080 = 0;
		Static138.anInt2981 = 2;
		Static17.anInt442 = Static37.anInt855;
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(II)Lclient!md;")
	public static Class3_Sub1_Sub12 method3135(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub12 local15 = (Class3_Sub1_Sub12) Static82.aClass5_23.method139((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static168.aClass1_31.method60(Static168.method2711(arg0), Static137.method2071(arg0));
		local15 = new Class3_Sub1_Sub12();
		local15.anInt2474 = arg0;
		if (local29 != null) {
			local15.method1716(new Class3_Sub17(local29));
		}
		Static82.aClass5_23.method145(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!qf;III)V")
	public static void method3136(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static174.method2812();
		Static24.method2569(arg2, arg3, arg1.anInt3251 + arg2, arg3 + arg1.anInt3221);
		if (Static58.anInt1284 == 2 || Static58.anInt1284 == 5) {
			Static24.method2565(arg2, arg3, arg1.anIntArray412, arg1.anIntArray415);
		} else {
			@Pc(38) int local38 = Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32 + 48;
			@Pc(44) int local44 = Static126.anInt2704 + Static126.anInt2707 & 0x7FF;
			@Pc(52) int local52 = 464 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
			Static27.aClass3_Sub1_Sub4_Sub4_41.method2606(arg2, arg3, arg1.anInt3251, arg1.anInt3221, local38, local52, local44, Static148.anInt3314 + 256, arg1.anIntArray412, arg1.anIntArray415);
			@Pc(88) int local88;
			@Pc(102) int local102;
			for (@Pc(72) int local72 = 0; local72 < Static150.anInt3386; local72++) {
				local88 = Static84.anIntArray501[local72] * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
				local102 = Static98.anIntArray286[local72] * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
				Static182.method2910(local88, arg1, arg3, aClass3_Sub1_Sub4_Sub4Array17[local72], arg2, local102);
			}
			@Pc(158) int local158;
			for (local88 = 0; local88 < 104; local88++) {
				for (local102 = 0; local102 < 104; local102++) {
					@Pc(132) Class70 local132 = Static142.aClass70ArrayArrayArray1[Static153.anInt673][local88][local102];
					if (local132 != null) {
						@Pc(146) int local146 = local88 * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
						local158 = local102 * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
						Static182.method2910(local146, arg1, arg3, Static75.aClass3_Sub1_Sub4_Sub4Array10[0], arg2, local158);
					}
				}
			}
			@Pc(236) int local236;
			for (local102 = 0; local102 < Static59.anInt1317; local102++) {
				@Pc(188) Class3_Sub1_Sub5_Sub4_Sub1 local188 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[Static125.anIntArray359[local102]];
				if (local188 != null && local188.method3064()) {
					@Pc(197) Class3_Sub1_Sub7 local197 = local188.aClass3_Sub1_Sub7_1;
					if (local197 != null && local197.anIntArray133 != null) {
						local197 = local197.method623();
					}
					if (local197 != null && local197.aBoolean43 && local197.aBoolean41) {
						local158 = local188.anInt4329 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
						local236 = local188.anInt4315 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
						Static182.method2910(local158, arg1, arg3, Static75.aClass3_Sub1_Sub4_Sub4Array10[1], arg2, local236);
					}
				}
			}
			for (@Pc(252) int local252 = 0; local252 < Static15.anInt327; local252++) {
				@Pc(260) Class3_Sub1_Sub5_Sub4_Sub2 local260 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[Static168.anIntArray460[local252]];
				if (local260 != null && local260.method3064()) {
					local158 = local260.anInt4329 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
					local236 = local260.anInt4315 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
					@Pc(290) boolean local290 = false;
					@Pc(295) long local295 = local260.aClass80_1689.method2441();
					for (@Pc(297) int local297 = 0; local297 < Static116.anInt4479; local297++) {
						if (local295 == Static186.aLongArray10[local297] && Static161.anIntArray450[local297] != 0) {
							local290 = true;
							break;
						}
					}
					@Pc(319) boolean local319 = false;
					if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4346 != 0 && local260.anInt4346 != 0 && local260.anInt4346 == Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4346) {
						local319 = true;
					}
					if (local290) {
						Static182.method2910(local158, arg1, arg3, Static75.aClass3_Sub1_Sub4_Sub4Array10[3], arg2, local236);
					} else if (local319) {
						Static182.method2910(local158, arg1, arg3, Static75.aClass3_Sub1_Sub4_Sub4Array10[4], arg2, local236);
					} else {
						Static182.method2910(local158, arg1, arg3, Static75.aClass3_Sub1_Sub4_Sub4Array10[2], arg2, local236);
					}
				}
			}
			@Pc(380) Class34[] local380 = Static94.aClass34Array1;
			@Pc(474) int local474;
			for (local158 = 0; local158 < local380.length; local158++) {
				@Pc(388) Class34 local388 = local380[local158];
				if (local388 != null && local388.anInt1330 != 0 && Static193.anInt4411 % 20 < 10) {
					@Pc(445) int local445;
					@Pc(434) int local434;
					if (local388.anInt1330 == 1 && local388.anInt1331 >= 0 && local388.anInt1331 < Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1.length) {
						@Pc(421) Class3_Sub1_Sub5_Sub4_Sub1 local421 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local388.anInt1331];
						if (local421 != null) {
							local434 = local421.anInt4329 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
							local445 = local421.anInt4315 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
							Static88.method1281(arg2, local388.anInt1329, local434, arg3, arg1, local445);
						}
					}
					if (local388.anInt1330 == 2) {
						local474 = (local388.anInt1323 - Static97.anInt2062) * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
						local434 = (local388.anInt1325 + -Static39.anInt875) * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
						Static88.method1281(arg2, local388.anInt1329, local474, arg3, arg1, local434);
					}
					if (local388.anInt1330 == 10 && local388.anInt1331 >= 0 && Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1.length > local388.anInt1331) {
						@Pc(523) Class3_Sub1_Sub5_Sub4_Sub2 local523 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local388.anInt1331];
						if (local523 != null) {
							local434 = local523.anInt4329 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
							local445 = local523.anInt4315 / 32 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
							Static88.method1281(arg2, local388.anInt1329, local434, arg3, arg1, local445);
						}
					}
				}
			}
			if (Static49.anInt1087 != 0) {
				local474 = Static171.anInt3847 * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 / 32;
				local236 = Static49.anInt1087 * 4 + 2 - Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 / 32;
				Static182.method2910(local236, arg1, arg3, Static29.aClass3_Sub1_Sub4_Sub4_7, arg2, local474);
			}
			Static24.method2576(arg2 + arg1.anInt3251 / 2 - 1, arg1.anInt3221 / 2 + -1 + arg3, 3, 3, 16777215);
		}
		Static158.aBooleanArray18[arg0] = true;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I")
	public static int method3138() {
		return Static121.anInt2653++;
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	public static void method3139() {
		Static147.aClass80_1284 = Static106.aClass80_895;
		Static11.aClass80_87 = Static46.aClass80_396;
		Static39.aClass80_318 = Static87.aClass80_711;
		Static118.aClass80_1031 = Static7.aClass80_51;
		Static162.aClass80_1404 = Static16.aClass80_115;
		Static171.aClass80_1478 = Static195.aClass80_1736;
		Static57.aClass80_491 = Static146.aClass80_1263;
		Static171.aClass80_1475 = Static114.aClass80_1009;
		Static102.aClass80_865 = Static158.aClass80_1360;
		Static181.aClass80_1569 = Static84.aClass80_1652;
		Static104.aClass80_890 = Static148.aClass80_1299;
		Static166.aClass80_1432 = Static54.aClass80_463;
		Static150.aClass80_1320 = Static57.aClass80_496;
		Static182.aClass80_1594 = Static31.aClass80_231;
		Static150.aClass80_1324 = Static172.aClass80_1488;
		Static181.aClass80_1550 = Static180.aClass80_1542;
		Static120.aClass80_1038 = Static167.aClass80_1443;
		Static181.aClass80_1591 = Static180.aClass80_1542;
		Static64.aClass80_541 = Static109.aClass80_957;
		Static181.aClass80_1560 = Static14.aClass80_99;
		Static67.aClass80_571 = Static66.aClass80_561;
		Static37.aClass80_301 = Static136.aClass80_1139;
		Static149.aClass80_1311 = Static68.aClass80_589;
		Static163.aClass80_1408 = Static105.aClass80_893;
		Static180.aClass80_1543 = Static130.aClass80_1105;
		Static68.aClass80_585 = Static106.aClass80_900;
		Static27.aClass80_1731 = Static61.aClass80_525;
		Static181.aClass80_1585 = Static180.aClass80_1542;
		Static181.aClass80_1592 = Static58.aClass80_503;
		Static166.aClass80_1435 = Static29.aClass80_229;
		Static34.aClass80_263 = Static37.aClass80_302;
		Static59.aClass80_520 = Static155.aClass80_1346;
		Static181.aClass80_1572 = Static180.aClass80_1542;
		Static6.aClass80_47 = Static190.aClass80_1701;
		Static58.aClass80_504 = Static56.aClass80_482;
		Static48.aClass80_401 = Static175.aClass80_1523;
		Static120.aClass80_1047 = Static165.aClass80_1419;
		Static181.aClass80_1576 = Static180.aClass80_1542;
		Static150.aClass80_1327 = Static90.aClass80_747;
		Static181.aClass80_1581 = Static180.aClass80_1542;
		Static42.aClass80_356 = Static20.aClass80_155;
		Static66.aClass80_563 = Static160.aClass80_1378;
		Static109.aClass80_963 = Static89.aClass80_741;
		Static28.aClass80_215 = Static3.aClass80_38;
		Static68.aClass80_586 = Static152.aClass80_1329;
		Static192.aClass80_1702 = Static64.aClass80_542;
		Static35.aClass80_694 = Static52.aClass80_442;
		Static88.aClass80_719 = Static163.aClass80_1406;
		Static130.aClass80_1106 = Static17.aClass80_134;
		Static139.aClass80_1164 = Static37.aClass80_303;
		Static25.aClass80_197 = Static3.aClass80_37;
		Static11.aClass80_90 = Static168.aClass80_1454;
		Static181.aClass80_1551 = Static180.aClass80_1542;
		Static181.aClass80_1567 = Static77.aClass80_714;
		Static103.aClass80_876 = Static83.aClass80_682;
		Static181.aClass80_1587 = Static98.aClass80_837;
		Static14.aClass80_96 = Static97.aClass80_832;
		Static153.aClass80_210 = Static108.aClass80_1150;
		Static96.aClass80_820 = Static167.aClass80_1442;
		Static10.aClass80_60 = Static68.aClass80_587;
		Static181.aClass80_1577 = Static180.aClass80_1542;
		aClass80_1723 = Static186.aClass80_1647;
		Static48.aClass80_408 = Static62.aClass80_535;
		Static71.aClass80_611 = Static72.aClass80_1617;
		Static29.aClass80_227 = Static77.aClass80_713;
		Static181.aClass80_1575 = Static98.aClass80_837;
		Static23.aClass80_174 = Static7.aClass80_49;
		Static120.aClass80_1044 = Static169.aClass80_384;
		Static54.aClass80_468 = Static150.aClass80_1323;
		Static195.aClass80_1734 = Static52.aClass80_441;
		Static130.aClass80_1107 = Static188.aClass80_1691;
		Static163.aClass80_1407 = Static78.aClass80_675;
		Static148.aClass80_1303 = Static113.aClass80_999;
		Static172.aClass80_1486 = Static129.aClass80_1099;
		Static98.aClass80_839 = Static109.aClass80_960;
		Static109.aClass80_962 = Static73.aClass80_623;
		Static181.aClass80_1574 = Static136.aClass80_1137;
		Static169.aClass80_388 = Static134.aClass80_1288;
		Static157.aClass80_1359 = Static195.aClass80_1739;
		Static180.aClass80_1541 = Static143.aClass80_1204;
		Static19.aClass80_142 = Static62.aClass80_536;
		Static166.aClass80_1434 = Static29.aClass80_229;
		Static144.aClass80_1245 = Static87.aClass80_712;
		Static181.aClass80_1573 = Static38.aClass80_308;
		Static166.aClass80_1433 = Static31.aClass80_232;
		Static53.aClass80_454 = Static169.aClass80_385;
		Static168.aClass80_1453 = Static32.aClass80_1680;
		Static75.aClass80_624 = Static100.aClass80_852;
		Static188.aClass80_1690 = Static10.aClass80_64;
		Static47.aClass80_400 = Static183.aClass80_1615;
		Static181.aClass80_1558 = Static180.aClass80_1542;
		Static135.aClass80_1132 = Static143.aClass80_1198;
		Static181.aClass80_1565 = Static180.aClass80_1542;
		Static195.aClass80_1738 = Static32.aClass80_1685;
		Static147.aClass80_1286 = Static185.aClass80_1639;
		Static166.aClass80_1431 = Static29.aClass80_229;
		Static152.aClass80_1332 = Static90.aClass80_744;
		Static29.aClass80_230 = Static78.aClass80_674;
		Static52.aClass80_437 = Static36.aClass80_285;
		Static181.aClass80_1571 = Static58.aClass80_508;
		Static181.aClass80_1552 = Static180.aClass80_1542;
		Static181.aClass80_1553 = Static96.aClass80_818;
		Static44.aClass80_375 = Static94.aClass80_810;
		Static116.aClass80_1743 = Static37.aClass80_306;
		Static165.aClass80_1420 = Static130.aClass80_1108;
		Static48.aClass80_406 = Static135.aClass80_1135;
		Static181.aClass80_1557 = Static180.aClass80_1542;
		Static99.aClass80_849 = Static42.aClass80_352;
		Static181.aClass80_1586 = Static180.aClass80_1542;
		Static12.aClass80_5 = Static48.aClass80_407;
		Static181.aClass80_1584 = Static180.aClass80_1542;
		Static32.aClass80_1684 = Static109.aClass80_959;
		Static150.aClass80_1322 = Static57.aClass80_496;
		Static20.aClass80_159 = Static21.aClass80_162;
		Static142.aClass80_1195 = Static197.aClass80_1747;
		Static25.aClass80_194 = Static86.aClass80_704;
		Static17.aClass80_131 = Static156.aClass80_1354;
		Static88.aClass80_718 = Static39.aClass80_317;
		Static56.aClass80_484 = Static155.aClass80_1344;
		Static82.aClass80_681 = Static169.aClass80_389;
		Static181.aClass80_1583 = Static29.aClass80_229;
		Static58.aClass80_509 = Static92.aClass80_1190;
		Static167.aClass80_1445 = Static7.aClass80_50;
		Static168.aClass80_1460 = Static143.aClass80_1199;
		Static139.aClass80_1165 = Static195.aClass80_1735;
		Static58.aClass80_507 = Static56.aClass80_482;
		Static155.aClass80_1343 = Static136.aClass80_1138;
		Static120.aClass80_1048 = Static35.aClass80_692;
		Static114.aClass80_1010 = Static142.aClass80_1197;
		Static77.aClass80_717 = Static41.aClass80_332;
		Static181.aClass80_1559 = Static180.aClass80_1542;
		Static68.aClass80_590 = Static113.aClass80_1000;
		Static25.aClass80_189 = Static153.aClass80_212;
		Static52.aClass80_438 = Static146.aClass80_1264;
		Static95.aClass80_1415 = Static107.aClass80_942;
		Static23.aClass80_176 = Static36.aClass80_288;
		Static181.aClass80_1555 = Static180.aClass80_1542;
		Static181.aClass80_1566 = Static180.aClass80_1542;
		Static98.aClass80_840 = Static22.aClass80_173;
		Static33.aClass80_252 = Static162.aClass80_1405;
		Static187.aClass80_1665 = Static174.aClass80_1508;
		Static175.aClass80_1522 = Static183.aClass80_1613;
		Static49.aClass80_418 = Static181.aClass80_1578;
		Static48.aClass80_404 = Static35.aClass80_696;
		Static101.aClass80_853 = Static12.aClass80_4;
		Static92.aClass80_1194 = Static14.aClass80_97;
		Static130.aClass80_1109 = Static188.aClass80_1691;
		Static90.aClass80_748 = Static110.aClass80_975;
		Static42.aClass80_355 = Static9.aClass80_58;
		Static152.aClass80_1334 = Static33.aClass80_254;
		Static181.aClass80_1562 = Static181.aClass80_1590;
		Static161.aClass80_1395 = Static16.aClass80_117;
		Static61.aClass80_528 = Static25.aClass80_192;
		Static196.aClass80_1514 = Static188.aClass80_1693;
		Static174.aClass80_1510 = Static63.aClass80_537;
		Static163.aClass80_1409 = Static105.aClass80_893;
		Static50.aClass80_422 = Static122.aClass80_1049;
		Static120.aClass80_1040 = Static167.aClass80_1443;
		Static181.aClass80_1564 = Static21.aClass80_160;
		Static181.aClass80_1563 = Static180.aClass80_1542;
		Static168.aClass80_1455 = Static170.aClass80_1467;
		Static129.aClass80_1100 = Static141.aClass80_1180;
		Static131.aClass80_1688 = Static78.aClass80_673;
		Static126.aClass80_1062 = Static74.aClass80_1412;
		Static28.aClass80_218 = Static137.aClass80_1141;
		Static92.aClass80_1187 = Static38.aClass80_307;
		Static15.aClass80_103 = Static183.aClass80_1614;
		Static13.aClass80_95 = Static106.aClass80_898;
		Static57.aClass80_493 = Static184.aClass80_1628;
		Static181.aClass80_1570 = Static180.aClass80_1542;
		Static54.aClass80_465 = Static180.aClass80_1537;
		Static130.aClass80_1104 = Static63.aClass80_538;
		Static181.aClass80_1593 = Static180.aClass80_1542;
		Static92.aClass80_1193 = Static112.aClass80_996;
		Static181.aClass80_1579 = Static116.aClass80_1745;
		Static196.aClass80_1517 = Static61.aClass80_527;
		Static19.aClass80_144 = Static172.aClass80_1487;
		Static36.aClass80_287 = Static32.aClass80_1683;
		Static139.aClass80_1171 = Static180.aClass80_1542;
		Static181.aClass80_1582 = Static180.aClass80_1542;
		Static130.aClass80_1113 = Static161.aClass80_1391;
		Static4.aClass80_40 = Static94.aClass80_812;
		Static111.aClass80_986 = Static28.aClass80_214;
		Static143.aClass80_1205 = Static106.aClass80_897;
		Static166.aClass80_1429 = Static54.aClass80_463;
		Static175.aClass80_1521 = Static126.aClass80_1061;
		Static54.aClass80_469 = Static75.aClass80_625;
		Static105.aClass80_892 = Static135.aClass80_1136;
		Static184.aClass80_1629 = Static161.aClass80_1390;
		Static89.aClass80_743 = Static52.aClass80_435;
		Static43.aClass80_366 = Static181.aClass80_1568;
		Static67.aClass80_574 = Static20.aClass80_157;
		Static60.aClass80_523 = Static173.aClass80_1497;
		Static181.aClass80_1588 = Static21.aClass80_160;
		Static196.aClass80_1513 = Static110.aClass80_978;
		Static92.aClass80_1191 = Static14.aClass80_97;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Z")
	public static boolean method3140(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
