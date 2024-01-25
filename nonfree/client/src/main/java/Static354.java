import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_5 = new Class308("WTWIP", 3);

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray136 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!gf;IZ)V")
	public static void method4841(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1) {
		if (Static153.aBoolean209) {
			arg1 = 0;
			Static153.aBoolean209 = false;
		}
		if (Static362.aClass119_2 != null && Static362.aClass119_2.method2374(arg0)) {
			return;
		}
		Static362.aClass119_2 = arg0;
		Static172.aLong97 = Static413.method5668();
		Static594.anInt9653 = arg1;
		Static115.anInt2241 = arg1;
		if (Static115.anInt2241 == 0) {
			Static408.method5643();
			return;
		}
		Static216.aFloat107 = Static2.aFloat1;
		Static524.anInt2123 = Static125.anInt2496;
		Static347.anInt5777 = Static590.anInt9619;
		Static496.aFloat202 = Static130.aFloat36;
		Static266.anInt4704 = Static561.anInt9348;
		Static67.aFloat15 = Static322.aFloat124;
		Static473.aFloat183 = Static306.aFloat112;
		Static56.aClass83_1 = Static236.aClass83_3;
		Static259.aFloat115 = Static154.aFloat51;
		Static290.aFloat118 = Static262.aFloat116;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
	public static int method4846() {
		@Pc(6) int local6;
		if (!Static348.aClass1_Sub30_Sub1_1.aBoolean385) {
			for (local6 = 0; local6 < Static594.anInt9654; local6++) {
				if (Static398.anInterface22Array1[local6].method4453() == 's' || Static398.anInterface22Array1[local6].method4453() == 'S') {
					Static348.aClass1_Sub30_Sub1_1.aBoolean385 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static136.aClass103_2 == Static2.aClass103_1) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static413.method5668();
			if (Static493.aLong256 == 0L) {
				Static493.aLong256 = local59;
			}
			if (local56 > 16384 && local59 - Static493.aLong256 < 5000L) {
				if (local59 - Static79.aLong55 > 1000L) {
					System.gc();
					Static79.aLong55 = local59;
				}
				return 0;
			}
		}
		if (Static136.aClass103_3 == Static2.aClass103_1) {
			if (Static371.aClass298_1 == null) {
				Static371.aClass298_1 = new Class298(Static396.aClass9_1, Static314.aClass229_1, Static23.aBigInteger1, Static270.aBigInteger4);
			}
			if (!Static371.aClass298_1.method6398()) {
				return 0;
			}
			Static238.method3606(null, 0);
			Static521.aBoolean684 = !Static46.method714();
			Static156.aClass270_34 = Static377.method5051(Static521.aBoolean684 ? 34 : 32, false);
			Static393.aClass270_76 = Static377.method5051(33, false);
			Static412.aClass270_85 = Static377.method5051(13, false);
		}
		if (Static136.aClass103_4 == Static2.aClass103_1) {
			Static393.aClass270_76.method5701();
			local6 = Static273.aClass29_Sub1Array1[33].method7186();
			local6 += Static273.aClass29_Sub1Array1[Static521.aBoolean684 ? 34 : 32].method7186();
			local6 += Static273.aClass29_Sub1Array1[13].method7186();
			local6 += Static393.aClass270_76.method5687();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static8.anInt123 = Static156.aClass270_34.method5676();
			Static165.anInt2959 = Static393.aClass270_76.method5676();
			Static446.method6517(Static156.aClass270_34);
			local56 = Static348.aClass1_Sub30_Sub1_1.anInt4867;
			Static535.aClass32_1 = new Class32(Static246.aClass195_2, Static307.anInt5279, Static393.aClass270_76);
			@Pc(226) int[] local226 = Static535.aClass32_1.method544(local56);
			@Pc(232) Class228 local232 = new Class228(Static156.aClass270_34, Static412.aClass270_85);
			if (local226.length > 0) {
				Static243.anInterface10Array1 = new Interface10[local226.length];
				for (@Pc(244) int local244 = 0; local244 < Static243.anInterface10Array1.length; local244++) {
					Static243.anInterface10Array1[local244] = new Class291(Static535.aClass32_1.method539(local226[local244]), local232);
				}
			}
		}
		if (Static136.aClass103_5 == Static2.aClass103_1) {
			Static293.method4118(Static449.method6210(), Static412.aClass270_85, Static156.aClass270_34);
		}
		if (Static136.aClass103_6 == Static2.aClass103_1) {
			local6 = Static406.method5637();
			local56 = Static526.method7247();
			if (local6 < local56) {
				return local6 * 100 / local56;
			}
		}
		if (Static2.aClass103_1 == Static136.aClass103_7) {
			if (Static243.anInterface10Array1 != null && Static243.anInterface10Array1.length > 0) {
				if (Static243.anInterface10Array1[0].method6289() < 100) {
					return 0;
				}
				if (Static243.anInterface10Array1.length > 1 && Static535.aClass32_1.method543() && Static243.anInterface10Array1[1].method6289() < 100) {
					return 0;
				}
			}
			Static553.method7541(Static16.aClass134_1);
			Static271.method3861(Static16.aClass134_1);
			Static426.method5887(1);
		}
		if (Static136.aClass103_8 == Static2.aClass103_1) {
			for (local6 = 0; local6 < 4; local6++) {
				Static478.aClass59Array2[local6] = Static533.method7308(Static471.anInt8012, Static71.anInt1410);
			}
		}
		if (Static136.aClass103_9 == Static2.aClass103_1) {
			Static463.aClass270_98 = Static377.method5051(8, false);
			Static588.aClass270_122 = Static377.method5051(0, false);
			Static181.aClass270_39 = Static377.method5051(1, false);
			Static462.aClass270_97 = Static377.method5051(2, false);
			Static332.aClass270_88 = Static377.method5051(3, false);
			Static71.aClass270_14 = Static377.method5051(4, false);
			Static559.aClass270_116 = Static377.method5051(5, true);
			Static358.aClass270_69 = Static377.method5051(6, true);
			Static412.aClass270_84 = Static377.method5051(7, false);
			Static69.aClass270_13 = Static377.method5051(9, false);
			Static172.aClass270_38 = Static377.method5051(10, false);
			Static408.aClass270_81 = Static377.method5051(11, false);
			Static410.aClass270_83 = Static377.method5051(12, false);
			Static360.aClass270_68 = Static377.method5051(14, false);
			Static374.aClass270_72 = Static377.method5051(15, false);
			Static416.aClass270_86 = Static377.method5051(16, false);
			Static530.aClass270_111 = Static377.method5051(17, false);
			Static82.aClass270_15 = Static377.method5051(18, false);
			Static535.aClass270_112 = Static377.method5051(19, false);
			Static513.aClass270_106 = Static377.method5051(20, false);
			Static498.aClass270_102 = Static377.method5051(21, false);
			Static521.aClass270_108 = Static377.method5051(22, false);
			Static129.aClass270_30 = Static377.method5051(23, true);
			Static171.aClass270_37 = Static377.method5051(24, false);
			Static101.aClass270_22 = Static377.method5051(25, false);
			Static103.aClass270_23 = Static377.method5051(26, true);
			Static344.aClass270_66 = Static377.method5051(27, false);
			Static416.aClass270_87 = Static377.method5051(28, true);
			Static6.aClass270_1 = Static377.method5051(29, false);
			Static442.aClass270_96 = Static377.method5051(30, true);
			Static398.aClass270_78 = Static377.method5051(31, true);
		}
		if (Static136.aClass103_10 == Static2.aClass103_1) {
			local6 = 0;
			for (local56 = 0; local56 < 35; local56++) {
				if (Static273.aClass29_Sub1Array1[local56] != null) {
					local6 += Static273.aClass29_Sub1Array1[local56].method7186() * Static349.anIntArray475[local56] / 100;
				}
			}
			if (local6 != 100) {
				if (Static205.anInt9206 < 0) {
					Static205.anInt9206 = local6;
				}
				return (local6 - Static205.anInt9206) * 100 / (100 - Static205.anInt9206);
			}
			Static437.method6089(Static463.aClass270_98);
			Static293.method4118(Static449.method6210(), Static412.aClass270_85, Static463.aClass270_98);
		}
		if (Static136.aClass103_11 == Static2.aClass103_1) {
			Static5.method59();
			Static426.method5887(2);
		}
		if (Static2.aClass103_1 == Static136.aClass103_12) {
			Static104.method1716(Static442.aClass270_96, Static362.aClass109_5);
		}
		if (Static2.aClass103_1 == Static136.aClass103_13) {
			local6 = Static417.method6105();
			if (local6 < 100) {
				return local6;
			}
			Static401.method5589(Static416.aClass270_87.method5691(1));
			Static450.method7621(Static416.aClass270_87.method5691(3));
		}
		if (Static2.aClass103_1 == Static136.aClass103_14) {
			if (Static130.anInt2565 != -1 && !Static412.aClass270_84.method5688(Static130.anInt2565, 0)) {
				return 99;
			}
			Static584.anInterface7_12 = new Class194(Static103.aClass270_23, Static69.aClass270_13, Static463.aClass270_98);
			Static459.aClass38_2 = new Class38(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static384.aClass305_1 = new Class305(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static348.aClass141_2 = new Class141(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97, Static463.aClass270_98);
			Static243.aClass118_1 = new Class118(Static246.aClass195_2, Static307.anInt5279, Static530.aClass270_111);
			Static151.aClass181_3 = new Class181(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static474.aClass322_7 = new Class322(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static22.aClass71_1 = new Class71(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97, Static412.aClass270_84);
			Static512.aClass357_1 = new Class357(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static252.aClass205_3 = new Class205(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static518.aClass96_4 = new Class96(Static246.aClass195_2, Static307.anInt5279, true, Static416.aClass270_86, Static412.aClass270_84);
			Static383.aClass273_3 = new Class273(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97, Static463.aClass270_98);
			Static521.aClass257_4 = new Class257(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97, Static463.aClass270_98);
			Static322.aClass326_2 = new Class326(Static246.aClass195_2, Static307.anInt5279, true, Static82.aClass270_15, Static412.aClass270_84);
			Static175.aClass114_4 = new Class114(Static246.aClass195_2, Static307.anInt5279, true, Static459.aClass38_2, Static535.aClass270_112, Static412.aClass270_84);
			Static591.aClass274_1 = new Class274(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static192.aClass211_1 = new Class211(Static246.aClass195_2, Static307.anInt5279, Static513.aClass270_106, Static588.aClass270_122, Static181.aClass270_39);
			Static485.aClass318_1 = new Class318(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static321.aClass279_1 = new Class279(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static107.aClass200_3 = new Class200(Static246.aClass195_2, Static307.anInt5279, Static498.aClass270_102, Static412.aClass270_84);
			Static430.aClass265_1 = new Class265(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static213.aClass247_1 = new Class247(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static53.aClass277_1 = new Class277(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static499.aClass241_5 = new Class241(Static246.aClass195_2, Static307.anInt5279, Static521.aClass270_108);
			Static409.aClass246_1 = new Class246(Static246.aClass195_2, Static307.anInt5279, Static462.aClass270_97);
			Static471.method6445(Static463.aClass270_98, Static412.aClass270_84, Static412.aClass270_85, Static332.aClass270_88);
			Static171.method2431(Static6.aClass270_1);
			Static378.aClass19_1 = new Class19(Static307.anInt5279, Static171.aClass270_37, Static101.aClass270_22);
			Static183.aClass366_1 = new Class366(Static307.anInt5279, Static171.aClass270_37, Static101.aClass270_22, new Class157());
			Static281.method3941();
			Static518.aClass96_4.method1931(!Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222));
			Static430.aClass321_1 = new Class321();
			Static34.method7180();
			Static531.method7296(Static344.aClass270_66);
			Static179.method7293(Static412.aClass270_84, Static584.anInterface7_12);
			@Pc(941) Class356 local941 = new Class356(Static172.aClass270_38.method5706("", "huffman"));
			Static237.method3603(local941);
			try {
				jagmisc.init();
			} catch (@Pc(950) Throwable local950) {
			}
			Static327.aClass45_1 = Static519.method7215();
		}
		if (Static136.aClass103_16 == Static2.aClass103_1) {
			local6 = Static417.method6108(Static463.aClass270_98) + Static341.method2573(true);
			local56 = Static546.method7463() + Static526.method7247();
			if (local56 > local6) {
				return local6 * 100 / local56;
			}
		}
		if (Static2.aClass103_1 == Static136.aClass103_17) {
			Static226.method5070(Static129.aClass270_30, Static151.aClass181_3, Static474.aClass322_7, Static518.aClass96_4, Static383.aClass273_3, Static521.aClass257_4, Static430.aClass321_1);
		}
		if (Static136.aClass103_18 == Static2.aClass103_1) {
			Static317.aStringArray25 = new String[Static213.aClass247_1.anInt6283];
			Static257.anIntArray365 = new int[Static53.aClass277_1.anInt7657];
			Static574.aBooleanArray27 = new boolean[Static53.aClass277_1.anInt7657];
			for (local6 = 0; local6 < Static53.aClass277_1.anInt7657; local6++) {
				if (Static53.aClass277_1.method6091(local6).anInt2165 == 0) {
					Static574.aBooleanArray27[local6] = true;
					Static214.anInt4111++;
				}
				Static257.anIntArray365[local6] = -1;
			}
			Static109.method2410();
			Static69.anInt1393 = Static332.aClass270_88.method5677("loginscreen");
			Static493.anInt8492 = Static332.aClass270_88.method5677("lobbyscreen");
			Static559.aClass270_116.method5697(false);
			Static358.aClass270_69.method5697(true);
			Static463.aClass270_98.method5697(true);
			Static412.aClass270_85.method5697(true);
			Static172.aClass270_38.method5697(true);
			Static332.aClass270_88.method5697(true);
			Static256.aBoolean347 = true;
			Static462.aClass270_97.anInt7161 = 2;
			Static530.aClass270_111.anInt7161 = 2;
			Static416.aClass270_86.anInt7161 = 2;
			Static82.aClass270_15.anInt7161 = 2;
			Static535.aClass270_112.anInt7161 = 2;
			Static513.aClass270_106.anInt7161 = 2;
			Static498.aClass270_102.anInt7161 = 2;
		}
		@Pc(1125) Class341 local1125;
		if (Static2.aClass103_1 == Static136.aClass103_19) {
			if (!Static504.method4690(Static69.anInt1393)) {
				return 0;
			}
			for (local6 = 0; local6 < Static578.aClass341ArrayArray2[Static69.anInt1393].length; local6++) {
				local1125 = Static578.aClass341ArrayArray2[Static69.anInt1393][local6];
				if (local1125.anInt9309 == 5 && local1125.anInt9266 != -1) {
					local1125.method7566(Static16.aClass134_1);
				}
			}
		}
		if (Static136.aClass103_20 == Static2.aClass103_1) {
			for (local6 = 0; local6 < Static578.aClass341ArrayArray2[Static69.anInt1393].length; local6++) {
				local1125 = Static578.aClass341ArrayArray2[Static69.anInt1393][local6];
				if (local1125.anInt9309 == 5 && local1125.anInt9266 != -1 && local1125.method7566(Static16.aClass134_1) == null && Static559.aBoolean727) {
					return 0;
				}
			}
		}
		if (Static136.aClass103_21 == Static2.aClass103_1) {
			Static395.method5460(true);
		}
		if (Static2.aClass103_1 == Static136.aClass103_22) {
			Static521.aClass163_1.method3468();
			try {
				Static484.aThread7.join();
			} catch (@Pc(1210) InterruptedException local1210) {
				return 0;
			}
			Static484.aThread7 = null;
			Static521.aClass163_1 = null;
			Static156.aClass270_34 = null;
			Static243.anInterface10Array1 = null;
			Static535.aClass32_1 = null;
			Static393.aClass270_76 = null;
			Static594.method7871();
			Static424.aBoolean575 = Static348.aClass1_Sub30_Sub1_1.aBoolean385;
			Static348.aClass1_Sub30_Sub1_1.aBoolean385 = true;
			Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
			if (Static424.aBoolean575) {
				Static523.method7235(0);
			} else {
				Static523.method7235(Static348.aClass1_Sub30_Sub1_1.anInt4881);
			}
			Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
			Static553.method7541(Static16.aClass134_1);
			Static271.method3861(Static16.aClass134_1);
			Static345.method4710(Static463.aClass270_98, Static16.aClass134_1);
			Static154.method2221(Static369.aClass22Array18);
		}
		return Static14.method146();
	}
}
