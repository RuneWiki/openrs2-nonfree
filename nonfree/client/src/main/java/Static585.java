import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
	public static int anInt9430;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
	public static int anInt9432;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString93 = null;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
	public static int method7829() {
		@Pc(6) int local6;
		if (!Static405.aClass3_Sub3_Sub1_1.aBoolean594) {
			for (local6 = 0; local6 < Static158.anInt3266; local6++) {
				if (Static11.anInterface7Array1[local6].method3370() == 's' || Static11.anInterface7Array1[local6].method3370() == 'S') {
					Static405.aClass3_Sub3_Sub1_1.aBoolean594 = true;
					break;
				}
			}
		}
		@Pc(51) int local51;
		if (Static215.aClass151_1 == Static233.aClass151_2) {
			@Pc(42) Runtime local42 = Runtime.getRuntime();
			local51 = (int) ((local42.totalMemory() - local42.freeMemory()) / 1024L);
			@Pc(54) long local54 = Static158.method2936();
			if (Static293.aLong130 == 0L) {
				Static293.aLong130 = local54;
			}
			if (local51 > 16384 && local54 - Static293.aLong130 < 5000L) {
				if (local54 - Static440.aLong209 > 1000L) {
					System.gc();
					Static440.aLong209 = local54;
				}
				return 0;
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_3) {
			if (Static370.aClass357_1 == null) {
				Static370.aClass357_1 = new Class357(Static391.aClass277_2, Static501.aClass217_2, Static405.aBigInteger3, Static549.aBigInteger4);
			}
			if (!Static370.aClass357_1.method7713()) {
				return 0;
			}
			Static5.method78(null, 0);
			Static214.aBoolean289 = !Static526.method7024();
			Static91.aClass322_30 = Static187.method3177(false, Static214.aBoolean289 ? 34 : 32);
			Static328.aClass322_101 = Static187.method3177(false, 33);
			Static154.aClass322_61 = Static187.method3177(false, 13);
		}
		if (Static233.aClass151_4 == Static215.aClass151_1) {
			Static328.aClass322_101.method6809();
			local6 = Static184.aClass30_Sub1Array1[33].method581();
			local6 += Static184.aClass30_Sub1Array1[Static214.aBoolean289 ? 34 : 32].method581();
			local6 += Static184.aClass30_Sub1Array1[13].method581();
			local6 += Static328.aClass322_101.method6826();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static514.anInt8329 = Static91.aClass322_30.method6799();
			Static16.anInt309 = Static328.aClass322_101.method6799();
			Static115.method5671(Static91.aClass322_30);
			local51 = Static405.aClass3_Sub3_Sub1_1.anInt7551;
			Static427.aClass88_1 = new Class88(Static121.aClass274_1, Static256.anInt4535, Static328.aClass322_101);
			@Pc(217) int[] local217 = Static427.aClass88_1.method2599(local51);
			@Pc(223) Class340 local223 = new Class340(Static91.aClass322_30, Static154.aClass322_61);
			if (local217.length > 0) {
				Static148.anInterface15Array1 = new Interface15[local217.length];
				for (@Pc(232) int local232 = 0; local232 < Static148.anInterface15Array1.length; local232++) {
					Static148.anInterface15Array1[local232] = new Class352(Static427.aClass88_1.method2600(local217[local232]), local223);
				}
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_5) {
			Static98.method1815(Static154.aClass322_61, Static259.method3986(), Static91.aClass322_30);
		}
		if (Static233.aClass151_6 == Static215.aClass151_1) {
			local6 = Static35.method565();
			local51 = Static154.method2919();
			if (local6 < local51) {
				return local6 * 100 / local51;
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_7) {
			if (Static148.anInterface15Array1 != null && Static148.anInterface15Array1.length > 0) {
				if (Static148.anInterface15Array1[0].method7603() < 100) {
					return 0;
				}
				if (Static148.anInterface15Array1.length > 1 && Static427.aClass88_1.method2598() && Static148.anInterface15Array1[1].method7603() < 100) {
					return 0;
				}
			}
			Static154.method2918(Static505.aClass45_11);
			Static3.method5705(Static505.aClass45_11);
			Static25.method439(1);
		}
		if (Static233.aClass151_8 == Static215.aClass151_1) {
			for (local6 = 0; local6 < 4; local6++) {
				Static460.aClass169Array3[local6] = Static100.method1848(Static54.anInt1038, Static140.anInt3026);
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_9) {
			Static552.aClass322_150 = Static187.method3177(false, 8);
			Static546.aClass322_149 = Static187.method3177(false, 0);
			Static181.aClass322_70 = Static187.method3177(false, 1);
			Static235.aClass322_82 = Static187.method3177(false, 2);
			Static181.aClass322_69 = Static187.method3177(false, 3);
			Static166.aClass322_66 = Static187.method3177(false, 4);
			Static99.aClass322_36 = Static187.method3177(true, 5);
			Static287.aClass322_120 = Static187.method3177(true, 6);
			Static521.aClass322_141 = Static187.method3177(false, 7);
			Static422.aClass322_148 = Static187.method3177(false, 9);
			Static131.aClass322_52 = Static187.method3177(false, 10);
			Static121.aClass322_45 = Static187.method3177(false, 11);
			Static241.aClass322_84 = Static187.method3177(false, 12);
			Static50.aClass322_19 = Static187.method3177(false, 14);
			Static167.aClass322_68 = Static187.method3177(false, 15);
			Static85.aClass322_29 = Static187.method3177(false, 16);
			Static429.aClass322_124 = Static187.method3177(false, 17);
			Static478.aClass322_132 = Static187.method3177(false, 18);
			Static259.aClass322_90 = Static187.method3177(false, 19);
			Static51.aClass322_20 = Static187.method3177(false, 20);
			Static345.aClass322_108 = Static187.method3177(false, 21);
			Static122.aClass322_46 = Static187.method3177(false, 22);
			Static69.aClass322_27 = Static187.method3177(true, 23);
			Static29.aClass322_144 = Static187.method3177(false, 24);
			Static566.aClass322_153 = Static187.method3177(false, 25);
			Static67.aClass322_26 = Static187.method3177(true, 26);
			Static250.aClass322_88 = Static187.method3177(false, 27);
			Static39.aClass322_14 = Static187.method3177(true, 28);
			Static493.aClass322_156 = Static187.method3177(false, 29);
			Static554.aClass322_152 = Static187.method3177(true, 30);
			Static128.aClass322_51 = Static187.method3177(true, 31);
		}
		if (Static233.aClass151_10 == Static215.aClass151_1) {
			local6 = 0;
			for (local51 = 0; local51 < 35; local51++) {
				if (Static184.aClass30_Sub1Array1[local51] != null) {
					local6 += Static184.aClass30_Sub1Array1[local51].method581() * Static440.anIntArray461[local51] / 100;
				}
			}
			if (local6 != 100) {
				if (Static189.anInt3613 < 0) {
					Static189.anInt3613 = local6;
				}
				return (local6 - Static189.anInt3613) * 100 / (100 - Static189.anInt3613);
			}
			Static462.method6424(Static552.aClass322_150);
			Static98.method1815(Static154.aClass322_61, Static259.method3986(), Static552.aClass322_150);
		}
		if (Static233.aClass151_11 == Static215.aClass151_1) {
			Static301.method4553();
			Static25.method439(2);
		}
		if (Static233.aClass151_12 == Static215.aClass151_1) {
			Static380.method5565(Static237.aClass258_3, Static554.aClass322_152);
		}
		if (Static233.aClass151_13 == Static215.aClass151_1) {
			local6 = Static321.method4674();
			if (local6 < 100) {
				return local6;
			}
			Static123.method2520(Static39.aClass322_14.method6807(1));
			Static354.method5254(Static39.aClass322_14.method6807(3));
		}
		if (Static233.aClass151_14 == Static215.aClass151_1) {
			if (Static359.anInt6489 != -1 && !Static521.aClass322_141.method6808(0, Static359.anInt6489)) {
				return 99;
			}
			Static173.anInterface3_6 = new Class210(Static67.aClass322_26, Static422.aClass322_148, Static552.aClass322_150);
			Static137.aClass124_1 = new Class124(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static401.aClass33_1 = new Class33(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static179.aClass366_1 = new Class366(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82, Static552.aClass322_150);
			Static584.aClass138_1 = new Class138(Static121.aClass274_1, Static256.anInt4535, Static429.aClass322_124);
			Static68.aClass98_3 = new Class98(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static154.aClass208_3 = new Class208(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static43.aClass23_1 = new Class23(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82, Static521.aClass322_141);
			Static112.aClass157_1 = new Class157(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static482.aClass177_1 = new Class177(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static478.aClass212_3 = new Class212(Static121.aClass274_1, Static256.anInt4535, true, Static85.aClass322_29, Static521.aClass322_141);
			Static39.aClass102_1 = new Class102(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82, Static552.aClass322_150);
			Static350.aClass87_3 = new Class87(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82, Static552.aClass322_150);
			Static361.aClass229_13 = new Class229(Static121.aClass274_1, Static256.anInt4535, true, Static478.aClass322_132, Static521.aClass322_141);
			Static6.aClass92_1 = new Class92(Static121.aClass274_1, Static256.anInt4535, true, Static137.aClass124_1, Static259.aClass322_90, Static521.aClass322_141);
			Static382.aClass268_1 = new Class268(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static545.aClass240_2 = new Class240(Static121.aClass274_1, Static256.anInt4535, Static51.aClass322_20, Static546.aClass322_149, Static181.aClass322_70);
			Static420.aClass356_1 = new Class356(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static508.aClass232_1 = new Class232(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static368.aClass278_1 = new Class278(Static121.aClass274_1, Static256.anInt4535, Static345.aClass322_108, Static521.aClass322_141);
			Static164.aClass239_1 = new Class239(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static352.aClass27_1 = new Class27(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static341.aClass32_1 = new Class32(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static284.aClass207_1 = new Class207(Static121.aClass274_1, Static256.anInt4535, Static122.aClass322_46);
			Static29.aClass130_2 = new Class130(Static121.aClass274_1, Static256.anInt4535, Static235.aClass322_82);
			Static405.method5860(Static181.aClass322_69, Static552.aClass322_150, Static521.aClass322_141, Static154.aClass322_61);
			Static330.method4729(Static493.aClass322_156);
			Static520.aClass69_5 = new Class69(Static256.anInt4535, Static29.aClass322_144, Static566.aClass322_153);
			Static111.aClass149_11 = new Class149(Static256.anInt4535, Static29.aClass322_144, Static566.aClass322_153, new Class18());
			Static347.method5128();
			Static478.aClass212_3.method4796(!Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312));
			Static491.aClass318_1 = new Class318();
			Static563.method7599();
			Static309.method4512(Static250.aClass322_88);
			Static51.method828(Static521.aClass322_141, Static173.anInterface3_6);
			@Pc(916) Class75 local916 = new Class75(Static131.aClass322_52.method6810("", "huffman"));
			Static559.method7531(local916);
			try {
				jagmisc.init();
			} catch (@Pc(923) Throwable local923) {
			}
			Static229.aClass228_1 = Static196.method7554();
		}
		if (Static215.aClass151_1 == Static233.aClass151_16) {
			local6 = Static504.method6790(Static552.aClass322_150) + Static335.method4783(true);
			local51 = Static584.method7820() + Static154.method2919();
			if (local6 < local51) {
				return local6 * 100 / local51;
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_17) {
			Static44.method7657(Static69.aClass322_27, Static68.aClass98_3, Static154.aClass208_3, Static478.aClass212_3, Static39.aClass102_1, Static350.aClass87_3, Static491.aClass318_1);
		}
		if (Static215.aClass151_1 == Static233.aClass151_18) {
			Static351.aBooleanArray21 = new boolean[Static341.aClass32_1.anInt756];
			Static137.aStringArray11 = new String[Static352.aClass27_1.anInt556];
			Static468.anIntArray497 = new int[Static341.aClass32_1.anInt756];
			for (local6 = 0; local6 < Static341.aClass32_1.anInt756; local6++) {
				if (Static341.aClass32_1.method655(local6).anInt4 == 0) {
					Static351.aBooleanArray21[local6] = true;
					Static440.anInt7368++;
				}
				Static468.anIntArray497[local6] = -1;
			}
			Static429.method6068();
			Static270.anInt4755 = Static181.aClass322_69.method6823("loginscreen");
			Static121.anInt2791 = Static181.aClass322_69.method6823("lobbyscreen");
			Static99.aClass322_36.method6798(false);
			Static287.aClass322_120.method6798(true);
			Static552.aClass322_150.method6798(true);
			Static154.aClass322_61.method6798(true);
			Static131.aClass322_52.method6798(true);
			Static181.aClass322_69.method6798(true);
			Static345.aBoolean450 = true;
			Static235.aClass322_82.anInt8219 = 2;
			Static429.aClass322_124.anInt8219 = 2;
			Static85.aClass322_29.anInt8219 = 2;
			Static478.aClass322_132.anInt8219 = 2;
			Static259.aClass322_90.anInt8219 = 2;
			Static51.aClass322_20.anInt8219 = 2;
			Static345.aClass322_108.anInt8219 = 2;
		}
		@Pc(1096) Class361 local1096;
		if (Static215.aClass151_1 == Static233.aClass151_19) {
			if (!Static293.method3974(Static270.anInt4755)) {
				return 0;
			}
			for (local6 = 0; local6 < Static380.aClass361ArrayArray2[Static270.anInt4755].length; local6++) {
				local1096 = Static380.aClass361ArrayArray2[Static270.anInt4755][local6];
				if (local1096.anInt9665 == 5 && local1096.anInt9635 != -1) {
					local1096.method7894(Static505.aClass45_11);
				}
			}
		}
		if (Static233.aClass151_20 == Static215.aClass151_1) {
			for (local6 = 0; local6 < Static380.aClass361ArrayArray2[Static270.anInt4755].length; local6++) {
				local1096 = Static380.aClass361ArrayArray2[Static270.anInt4755][local6];
				if (local1096.anInt9665 == 5 && local1096.anInt9635 != -1 && local1096.method7894(Static505.aClass45_11) == null && Static112.aBoolean171) {
					return 0;
				}
			}
		}
		if (Static215.aClass151_1 == Static233.aClass151_21) {
			Static206.method3371(true);
		}
		if (Static233.aClass151_22 == Static215.aClass151_1) {
			Static143.aClass275_1.method6104();
			try {
				Static396.aThread3.join();
			} catch (@Pc(1179) InterruptedException local1179) {
				return 0;
			}
			Static148.anInterface15Array1 = null;
			Static143.aClass275_1 = null;
			Static396.aThread3 = null;
			Static91.aClass322_30 = null;
			Static328.aClass322_101 = null;
			Static427.aClass88_1 = null;
			Static432.method6085();
			Static472.aBoolean612 = Static405.aClass3_Sub3_Sub1_1.aBoolean594;
			Static405.aClass3_Sub3_Sub1_1.aBoolean594 = true;
			Static405.aClass3_Sub3_Sub1_1.method6313(Static237.aClass258_3);
			if (Static472.aBoolean612) {
				Static486.method6610(0);
			} else {
				Static486.method6610(Static405.aClass3_Sub3_Sub1_1.anInt7562);
			}
			Static3.method5708(false, -1, -1, Static405.aClass3_Sub3_Sub1_1.anInt7570);
			Static154.method2918(Static505.aClass45_11);
			Static3.method5705(Static505.aClass45_11);
			Static476.method6555(Static552.aClass322_150, Static505.aClass45_11);
			Static405.method5859(Static494.aClass14Array14);
		}
		return Static126.method2596();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V")
	public static void method7830(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(16) Class41_Sub7 local16 = (Class41_Sub7) Static82.aClass178_21.method4168(); local16 != null; local16 = (Class41_Sub7) Static82.aClass178_21.method4165()) {
			if (Static506.anInt8251 >= local16.anInt8371) {
				local16.method7833();
			} else {
				Static186.method3169((local16.anInt8364 << 9) + 256, arg1 >> 1, local16.anInt8366 * 2, arg3 >> 1, local16.anInt8367, (local16.anInt8365 << 9) + 256);
				Static460.aClass54_10.method7803(local16.aString80, local16.anInt8372 | 0xFF000000, 0, Static22.anIntArray20[1] + arg2, Static22.anIntArray20[0] + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIB)V")
	public static void method7831(@OriginalArg(0) boolean arg0) {
		Static404.anInt6999 = 22050;
		Static305.aBoolean394 = arg0;
		Static54.anInt1036 = 2;
	}
}
