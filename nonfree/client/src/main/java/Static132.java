import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_16;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
	public static int anInt2821 = 0;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "Lclient!v;")
	public static Class76 aClass76_1317 = Static134.method2017("Spieler");

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	public static int anInt2824 = 99;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	public static int anInt2825 = 0;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!ua;")
	public static Class72 aClass72_28 = new Class72(64);

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!v;")
	public static Class76 aClass76_1318 = Static134.method2017(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1319 = Static134.method2017("au");

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1320 = Static134.method2017("_");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public static void method2007() {
		aClass4_Sub8_16 = null;
		aClass76_1317 = null;
		aClass76_1318 = null;
		aClass72_28 = null;
		aBooleanArray18 = null;
		aClass76_1319 = null;
		aClass76_1320 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!la;Lclient!la;BLjava/awt/Component;)V")
	public static void method2008(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(3) Component arg2) {
		if (Static6.aBoolean5) {
			return;
		}
		Static46.method1815();
		@Pc(15) byte[] local15 = arg0.method288(Static43.aClass76_141, Static111.aClass76_1153);
		Static73.aClass4_Sub4_Sub5_Sub2_2 = new Class4_Sub4_Sub5_Sub2(local15, arg2);
		Static68.aClass4_Sub4_Sub5_Sub2_1 = Static73.aClass4_Sub4_Sub5_Sub2_2.method929();
		Static85.aClass4_Sub4_Sub5_Sub4_5 = Static24.method353(Static111.aClass76_1153, Static125.aClass76_1280, arg1);
		Static120.aClass4_Sub4_Sub5_Sub4_6 = Static24.method353(Static111.aClass76_1153, Static130.aClass76_1305, arg1);
		Static42.aClass4_Sub4_Sub5_Sub4_4 = Static24.method353(Static111.aClass76_1153, Static1.aClass76_5, arg1);
		Static73.aClass4_Sub4_Sub5_Sub4Array9 = Static84.method1429(arg1, Static111.aClass76_1153, Static7.aClass76_60);
		Static66.aClass4_Sub4_Sub5_Sub4Array6 = Static84.method1429(arg1, Static111.aClass76_1153, Static63.aClass76_684);
		Static65.anIntArray64 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static65.anIntArray64[local59] = local59 * 262144;
		}
		for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
			Static65.anIntArray64[local73 + 64] = local73 * 1024 + 16711680;
		}
		for (@Pc(91) int local91 = 0; local91 < 64; local91++) {
			Static65.anIntArray64[local91 + 128] = local91 * 4 + 16776960;
		}
		for (@Pc(112) int local112 = 0; local112 < 64; local112++) {
			Static65.anIntArray64[local112 + 192] = 16777215;
		}
		Static64.anIntArray222 = new int[256];
		for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
			Static64.anIntArray222[local131] = local131 * 1024;
		}
		for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
			Static64.anIntArray222[local145 + 64] = local145 * 4 + 65280;
		}
		for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
			Static64.anIntArray222[local163 + 128] = local163 * 262144 + 65535;
		}
		for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
			Static64.anIntArray222[local183 + 192] = 16777215;
		}
		Static105.anIntArray327 = new int[256];
		for (@Pc(202) int local202 = 0; local202 < 64; local202++) {
			Static105.anIntArray327[local202] = local202 * 4;
		}
		for (@Pc(218) int local218 = 0; local218 < 64; local218++) {
			Static105.anIntArray327[local218 + 64] = local218 * 262144 + 255;
		}
		for (@Pc(246) int local246 = 0; local246 < 64; local246++) {
			Static105.anIntArray327[local246 + 128] = local246 * 1024 + 16711935;
		}
		for (@Pc(267) int local267 = 0; local267 < 64; local267++) {
			Static105.anIntArray327[local267 + 192] = 16777215;
		}
		Static81.anIntArray278 = new int[256];
		Static56.anIntArray187 = new int[32768];
		Static8.anIntArray22 = new int[32768];
		Static18.method239(null);
		if (Static32.anInt808 == 0) {
			Static85.aBoolean124 = true;
		} else {
			Static85.aBoolean124 = false;
		}
		Static41.anIntArray129 = new int[32768];
		Static63.anIntArray221 = new int[32768];
		Static111.aClass76_1145 = Static111.aClass76_1153;
		Static60.anInt1571 = 0;
		Static111.aClass76_1146 = Static111.aClass76_1153;
		Static103.aBoolean137 = false;
		if (Static85.aBoolean124) {
			Static121.method1838();
		} else {
			Static76.method1385(Static111.aClass76_1153, Static106.aClass76_1109, Static50.aClass17_Sub1_12);
		}
		Static25.method367(false);
		Static6.aBoolean5 = true;
		Static73.aClass4_Sub4_Sub5_Sub2_2.method910(0, 0);
		Static68.aClass4_Sub4_Sub5_Sub2_1.method910(382, 0);
		Static85.aClass4_Sub4_Sub5_Sub4_5.method1836(382 - Static85.aClass4_Sub4_Sub5_Sub4_5.anInt2607 / 2, 18);
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public static void method2009() {
		Static63.method1095(Static17.aClass4_Sub8_1);
		Static47.anInt1222++;
		if (Static87.aBoolean120 && Static43.aBoolean17) {
			@Pc(24) int local24 = Static2.anInt31;
			local24 -= Static98.anInt2275;
			if (local24 < Static54.anInt2513) {
				local24 = Static54.anInt2513;
			}
			if (local24 + Static17.aClass4_Sub8_1.anInt513 > Static54.anInt2513 + Static55.aClass4_Sub8_11.anInt513) {
				local24 = Static55.aClass4_Sub8_11.anInt513 + Static54.anInt2513 - Static17.aClass4_Sub8_1.anInt513;
			}
			@Pc(56) int local56 = local24 - Static63.anInt1641;
			@Pc(58) int local58 = Static126.anInt2734;
			@Pc(61) int local61 = Static17.aClass4_Sub8_1.anInt495;
			local58 -= Static105.anInt2347;
			if (local58 < Static28.anInt586) {
				local58 = Static28.anInt586;
			}
			if (Static28.anInt586 + Static55.aClass4_Sub8_11.anInt498 < Static17.aClass4_Sub8_1.anInt498 + local58) {
				local58 = Static55.aClass4_Sub8_11.anInt498 + Static28.anInt586 - Static17.aClass4_Sub8_1.anInt498;
			}
			@Pc(104) int local104 = local58 + Static55.aClass4_Sub8_11.anInt494 - Static28.anInt586;
			@Pc(109) int local109 = local58 - Static63.anInt1642;
			if (Static47.anInt1222 > Static17.aClass4_Sub8_1.anInt475 && (local61 < local56 || local56 < -local61 || local109 > local61 || -local61 > local109)) {
				Static7.aBoolean6 = true;
			}
			@Pc(152) int local152 = Static55.aClass4_Sub8_11.anInt492 + local24 - Static54.anInt2513;
			@Pc(161) Class4_Sub20 local161;
			if (Static17.aClass4_Sub8_1.anObjectArray13 != null && Static7.aBoolean6) {
				local161 = new Class4_Sub20();
				local161.anInt2295 = local104;
				local161.anInt2288 = local152;
				local161.aClass4_Sub8_14 = Static17.aClass4_Sub8_1;
				local161.anObjectArray28 = Static17.aClass4_Sub8_1.anObjectArray13;
				Static20.method307(local161);
			}
			if (Static122.anInt2680 == 0) {
				if (Static7.aBoolean6) {
					if (Static17.aClass4_Sub8_1.anObjectArray15 != null) {
						local161 = new Class4_Sub20();
						local161.aClass4_Sub8_13 = Static77.aClass4_Sub8_12;
						local161.anObjectArray28 = Static17.aClass4_Sub8_1.anObjectArray15;
						local161.anInt2288 = local152;
						local161.aClass4_Sub8_14 = Static17.aClass4_Sub8_1;
						local161.anInt2295 = local104;
						Static20.method307(local161);
					}
					if (Static77.aClass4_Sub8_12 != null && Static84.method1426(Static17.aClass4_Sub8_1) != null) {
						Static69.aClass4_Sub10_Sub1_2.method611(68);
						Static69.aClass4_Sub10_Sub1_2.method565(Static17.aClass4_Sub8_1.anInt466);
						Static69.aClass4_Sub10_Sub1_2.method597(Static77.aClass4_Sub8_12.anInt514);
						Static69.aClass4_Sub10_Sub1_2.method566(Static77.aClass4_Sub8_12.anInt466);
						Static69.aClass4_Sub10_Sub1_2.method597(Static17.aClass4_Sub8_1.anInt514);
					}
				} else if ((Static8.anInt167 == 1 || Static5.method79(Static10.anInt206 - 1)) && Static10.anInt206 > 2) {
					Static105.method1614();
				} else if (Static10.anInt206 > 0) {
					Static129.method1936(Static10.anInt206 - 1);
				}
				Static17.aClass4_Sub8_1 = null;
			}
		} else if (Static47.anInt1222 > 1) {
			Static17.aClass4_Sub8_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ef;B)V")
	public static void method2011(@OriginalArg(0) Class4_Sub4_Sub3_Sub1 arg0) {
		arg0.anInt1432 = arg0.anInt1389;
		if (arg0.anInt1434 == 0) {
			arg0.anInt1421 = 0;
			return;
		}
		if (arg0.anInt1390 != -1 && arg0.anInt1417 == 0) {
			@Pc(35) Class4_Sub4_Sub9 local35 = Static118.method1796(arg0.anInt1390);
			if (arg0.anInt1404 > 0 && local35.anInt1560 == 0) {
				arg0.anInt1421++;
				return;
			}
			if (arg0.anInt1404 <= 0 && local35.anInt1570 == 0) {
				arg0.anInt1421++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt1393;
		@Pc(67) int local67 = arg0.anInt1416;
		@Pc(82) int local82 = arg0.anInt1382 * 64 + arg0.anIntArray180[arg0.anInt1434 - 1] * 128;
		@Pc(97) int local97 = arg0.anIntArray184[arg0.anInt1434 - 1] * 128 + arg0.anInt1382 * 64;
		if (local97 - local64 > 256 || local97 - local64 < -256 || local82 - local67 > 256 || local82 - local67 < -256) {
			arg0.anInt1416 = local82;
			arg0.anInt1393 = local97;
			return;
		}
		if (local97 <= local64) {
			if (local64 > local97) {
				if (local67 < local82) {
					arg0.anInt1409 = 768;
				} else if (local67 > local82) {
					arg0.anInt1409 = 256;
				} else {
					arg0.anInt1409 = 512;
				}
			} else if (local82 > local67) {
				arg0.anInt1409 = 1024;
			} else if (local82 < local67) {
				arg0.anInt1409 = 0;
			}
		} else if (local82 > local67) {
			arg0.anInt1409 = 1280;
		} else if (local67 > local82) {
			arg0.anInt1409 = 1792;
		} else {
			arg0.anInt1409 = 1536;
		}
		@Pc(211) int local211 = arg0.anInt1412;
		@Pc(219) int local219 = arg0.anInt1409 - arg0.anInt1395 & 0x7FF;
		@Pc(226) int local226 = 4;
		@Pc(228) boolean local228 = true;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		if (local219 >= -256 && local219 <= 256) {
			local211 = arg0.anInt1435;
		} else if (local219 >= 256 && local219 < 768) {
			local211 = arg0.anInt1388;
		} else if (local219 >= -768 && local219 <= -256) {
			local211 = arg0.anInt1426;
		}
		if (local211 == -1) {
			local211 = arg0.anInt1435;
		}
		arg0.anInt1432 = local211;
		if (arg0 instanceof Class4_Sub4_Sub3_Sub1_Sub1) {
			local228 = ((Class4_Sub4_Sub3_Sub1_Sub1) arg0).aClass4_Sub4_Sub10_1.aBoolean107;
		}
		if (local228) {
			if (arg0.anInt1395 != arg0.anInt1409 && arg0.anInt1405 == -1 && arg0.anInt1431 != 0) {
				local226 = 2;
			}
			if (arg0.anInt1434 > 2) {
				local226 = 6;
			}
			if (arg0.anInt1434 > 3) {
				local226 = 8;
			}
			if (arg0.anInt1421 > 0 && arg0.anInt1434 > 1) {
				local226 = 8;
				arg0.anInt1421--;
			}
		} else {
			if (arg0.anInt1434 > 1) {
				local226 = 6;
			}
			if (arg0.anInt1434 > 2) {
				local226 = 8;
			}
			if (arg0.anInt1421 > 0 && arg0.anInt1434 > 1) {
				local226 = 8;
				arg0.anInt1421--;
			}
		}
		if (arg0.aBooleanArray8[arg0.anInt1434 - 1]) {
			local226 <<= 0x1;
		}
		if (local64 < local97) {
			arg0.anInt1393 += local226;
			if (local97 < arg0.anInt1393) {
				arg0.anInt1393 = local97;
			}
		} else if (local97 < local64) {
			arg0.anInt1393 -= local226;
			if (local97 > arg0.anInt1393) {
				arg0.anInt1393 = local97;
			}
		}
		if (local226 >= 8 && arg0.anInt1435 == arg0.anInt1432 && arg0.anInt1424 != -1) {
			arg0.anInt1432 = arg0.anInt1424;
		}
		if (local67 < local82) {
			arg0.anInt1416 += local226;
			if (local82 < arg0.anInt1416) {
				arg0.anInt1416 = local82;
			}
		} else if (local82 < local67) {
			arg0.anInt1416 -= local226;
			if (local82 > arg0.anInt1416) {
				arg0.anInt1416 = local82;
			}
		}
		if (local97 == arg0.anInt1393 && arg0.anInt1416 == local82) {
			if (arg0.anInt1404 > 0) {
				arg0.anInt1404--;
			}
			arg0.anInt1434--;
		}
	}
}
