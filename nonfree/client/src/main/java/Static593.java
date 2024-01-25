import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "J")
	public static long aLong271;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_166 = new Class349(79, 8);

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public static int anInt9634 = 0;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Z")
	public static boolean aBoolean805 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I")
	public static int method7727() {
		@Pc(6) int local6;
		if (!Static257.aClass2_Sub35_Sub1_1.aBoolean635) {
			for (local6 = 0; local6 < Static69.anInt5062; local6++) {
				if (Static344.anInterface24Array2[local6].method7251() == 's' || Static344.anInterface24Array2[local6].method7251() == 'S') {
					Static257.aClass2_Sub35_Sub1_1.aBoolean635 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static400.aClass261_2 == Static394.aClass261_1) {
			@Pc(40) Runtime local40 = Runtime.getRuntime();
			local50 = (int) ((local40.totalMemory() - local40.freeMemory()) / 1024L);
			@Pc(57) long local57 = Static362.method5133();
			if (Static128.aLong50 == 0L) {
				Static128.aLong50 = local57;
			}
			if (local50 > 16384 && local57 - Static128.aLong50 < 5000L) {
				if (local57 - Static314.aLong221 > 1000L) {
					System.gc();
					Static314.aLong221 = local57;
				}
				return 0;
			}
		}
		if (Static400.aClass261_3 == Static394.aClass261_1) {
			if (Static517.aClass189_1 == null) {
				Static517.aClass189_1 = new Class189(Static335.aClass249_2, Static281.aClass181_2, Static362.aBigInteger4, Static131.aBigInteger1);
			}
			if (!Static517.aClass189_1.method3741()) {
				return 0;
			}
			Static483.method6232(0, null);
			Static368.aBoolean701 = !Static479.method6198();
			Static329.aClass229_79 = Static551.method7228(Static368.aBoolean701 ? 34 : 32, false);
			Static314.aClass229_117 = Static551.method7228(33, false);
			Static191.aClass229_45 = Static551.method7228(13, false);
		}
		if (Static394.aClass261_1 == Static400.aClass261_4) {
			Static314.aClass229_117.method4983();
			local6 = Static55.aClass102_Sub1Array1[33].method6637();
			local6 += Static55.aClass102_Sub1Array1[Static368.aBoolean701 ? 34 : 32].method6637();
			local6 += Static55.aClass102_Sub1Array1[13].method6637();
			local6 += Static314.aClass229_117.method4976();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static345.anInt5964 = Static329.aClass229_79.method4956();
			Static404.anInt6641 = Static314.aClass229_117.method4956();
			Static56.method955(Static329.aClass229_79);
			local50 = Static257.aClass2_Sub35_Sub1_1.anInt7509;
			Static359.aClass28_2 = new Class28(Static18.aClass308_7, Static261.anInt4297, Static314.aClass229_117);
			@Pc(211) int[] local211 = Static359.aClass28_2.method558(local50);
			@Pc(217) Class170 local217 = new Class170(Static329.aClass229_79, Static191.aClass229_45);
			if (local211.length > 0) {
				Static237.anInterface12Array1 = new Interface12[local211.length];
				for (@Pc(226) int local226 = 0; local226 < Static237.anInterface12Array1.length; local226++) {
					Static237.anInterface12Array1[local226] = new Class72(Static359.aClass28_2.method553(local211[local226]), local217);
				}
			}
		}
		if (Static394.aClass261_1 == Static400.aClass261_5) {
			Static393.method5409(Static329.aClass229_79, Static438.method5751(), Static191.aClass229_45);
		}
		if (Static400.aClass261_6 == Static394.aClass261_1) {
			local6 = Static166.method2190();
			local50 = Static248.method3529();
			if (local50 > local6) {
				return local6 * 100 / local50;
			}
		}
		if (Static394.aClass261_1 == Static400.aClass261_7) {
			if (Static237.anInterface12Array1 != null && Static237.anInterface12Array1.length > 0) {
				if (Static237.anInterface12Array1[0].method2482() < 100) {
					return 0;
				}
				if (Static237.anInterface12Array1.length > 1 && Static359.aClass28_2.method555() && Static237.anInterface12Array1[1].method2482() < 100) {
					return 0;
				}
			}
			Static323.method4695(Static417.aClass162_17);
			Static47.method842(Static417.aClass162_17);
			Static115.method1686(1);
		}
		if (Static394.aClass261_1 == Static400.aClass261_8) {
			for (local6 = 0; local6 < 4; local6++) {
				Static87.aClass362Array3[local6] = Static101.method1524(Static281.anInt4822, Static29.anInt491);
			}
		}
		if (Static394.aClass261_1 == Static400.aClass261_9) {
			Static241.aClass229_54 = Static551.method7228(8, false);
			Static277.aClass229_68 = Static551.method7228(0, false);
			Static33.aClass229_8 = Static551.method7228(1, false);
			Static248.aClass229_57 = Static551.method7228(2, false);
			Static331.aClass229_80 = Static551.method7228(3, false);
			Static48.aClass229_11 = Static551.method7228(4, false);
			Static372.aClass229_89 = Static551.method7228(5, true);
			Static106.aClass229_32 = Static551.method7228(6, true);
			Static463.aClass229_106 = Static551.method7228(7, false);
			Static300.aClass229_70 = Static551.method7228(9, false);
			Static16.aClass229_1 = Static551.method7228(10, false);
			Static403.aClass229_125 = Static551.method7228(11, false);
			Static399.aClass229_93 = Static551.method7228(12, false);
			Static391.aClass229_109 = Static551.method7228(14, false);
			Static447.aClass229_105 = Static551.method7228(15, false);
			Static72.aClass229_20 = Static551.method7228(16, false);
			Static378.aClass229_90 = Static551.method7228(17, false);
			Static187.aClass229_121 = Static551.method7228(18, false);
			Static255.aClass229_62 = Static551.method7228(19, false);
			Static309.aClass229_74 = Static551.method7228(20, false);
			Static427.aClass229_97 = Static551.method7228(21, false);
			Static402.aClass229_94 = Static551.method7228(22, false);
			Static237.aClass229_52 = Static551.method7228(23, true);
			Static579.aClass229_128 = Static551.method7228(24, false);
			Static418.aClass229_96 = Static551.method7228(25, false);
			Static572.aClass229_126 = Static551.method7228(26, true);
			Static367.aClass229_88 = Static551.method7228(27, false);
			Static466.aClass229_107 = Static551.method7228(28, true);
			Static340.aClass229_83 = Static551.method7228(29, false);
			Static248.aClass229_58 = Static551.method7228(30, true);
			Static49.aClass229_31 = Static551.method7228(31, true);
		}
		if (Static394.aClass261_1 == Static400.aClass261_10) {
			local6 = 0;
			for (local50 = 0; local50 < 35; local50++) {
				if (Static55.aClass102_Sub1Array1[local50] != null) {
					local6 += Static55.aClass102_Sub1Array1[local50].method6637() * Static283.anIntArray590[local50] / 100;
				}
			}
			if (local6 != 100) {
				if (Static97.anInt1735 < 0) {
					Static97.anInt1735 = local6;
				}
				return (local6 - Static97.anInt1735) * 100 / (100 - Static97.anInt1735);
			}
			Static386.method5339(Static241.aClass229_54);
			Static393.method5409(Static241.aClass229_54, Static438.method5751(), Static191.aClass229_45);
		}
		if (Static400.aClass261_11 == Static394.aClass261_1) {
			Static369.method7667();
			Static115.method1686(2);
		}
		if (Static400.aClass261_12 == Static394.aClass261_1) {
			Static185.method2362(Static248.aClass229_58, Static169.aClass99_2);
		}
		if (Static394.aClass261_1 == Static400.aClass261_13) {
			local6 = Static536.method7036();
			if (local6 < 100) {
				return local6;
			}
			Static543.method7106(Static466.aClass229_107.method4966(1));
			Static150.method2087(Static466.aClass229_107.method4966(3));
		}
		if (Static400.aClass261_14 == Static394.aClass261_1) {
			if (Static33.anInt657 != -1 && !Static463.aClass229_106.method4979(Static33.anInt657, 0)) {
				return 99;
			}
			Static45.anInterface9_1 = new Class51(Static572.aClass229_126, Static300.aClass229_70, Static241.aClass229_54);
			Static537.aClass191_2 = new Class191(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static380.aClass221_3 = new Class221(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static23.aClass110_1 = new Class110(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57, Static241.aClass229_54);
			Static407.aClass215_1 = new Class215(Static18.aClass308_7, Static261.anInt4297, Static378.aClass229_90);
			Static401.aClass309_4 = new Class309(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static380.aClass211_7 = new Class211(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static25.aClass286_1 = new Class286(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57, Static463.aClass229_106);
			Static569.aClass113_1 = new Class113(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static304.aClass304_1 = new Class304(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static362.aClass290_2 = new Class290(Static18.aClass308_7, Static261.anInt4297, true, Static72.aClass229_20, Static463.aClass229_106);
			Static8.aClass360_1 = new Class360(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57, Static241.aClass229_54);
			Static369.aClass212_6 = new Class212(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57, Static241.aClass229_54);
			Static76.aClass361_1 = new Class361(Static18.aClass308_7, Static261.anInt4297, true, Static187.aClass229_121, Static463.aClass229_106);
			Static466.aClass130_2 = new Class130(Static18.aClass308_7, Static261.anInt4297, true, Static537.aClass191_2, Static255.aClass229_62, Static463.aClass229_106);
			Static232.aClass176_1 = new Class176(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static117.aClass18_1 = new Class18(Static18.aClass308_7, Static261.anInt4297, Static309.aClass229_74, Static277.aClass229_68, Static33.aClass229_8);
			Static403.aClass123_2 = new Class123(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static496.aClass39_1 = new Class39(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static62.aClass49_1 = new Class49(Static18.aClass308_7, Static261.anInt4297, Static427.aClass229_97, Static463.aClass229_106);
			Static337.aClass26_1 = new Class26(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static583.aClass134_1 = new Class134(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static109.aClass355_1 = new Class355(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static31.aClass145_1 = new Class145(Static18.aClass308_7, Static261.anInt4297, Static402.aClass229_94);
			Static572.aClass55_1 = new Class55(Static18.aClass308_7, Static261.anInt4297, Static248.aClass229_57);
			Static348.method5030(Static463.aClass229_106, Static331.aClass229_80, Static191.aClass229_45, Static241.aClass229_54);
			Static74.method1205(Static340.aClass229_83);
			Static25.aClass23_1 = new Class23(Static261.anInt4297, Static579.aClass229_128, Static418.aClass229_96);
			Static330.aClass227_2 = new Class227(Static261.anInt4297, Static579.aClass229_128, Static418.aClass229_96, new Class199());
			Static148.method2023();
			Static362.aClass290_2.method5797(!Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318));
			Static426.aClass160_1 = new Class160();
			Static514.method6643();
			Static196.method2459(Static367.aClass229_88);
			Static281.method4046(Static45.anInterface9_1, Static463.aClass229_106);
			@Pc(908) Class320 local908 = new Class320(Static16.aClass229_1.method4953("huffman", ""));
			Static173.method2266(local908);
			try {
				jagmisc.init();
			} catch (@Pc(915) Throwable local915) {
			}
			Static190.aClass19_1 = Static565.method7385();
			Static236.aClass2_Sub49_1 = new Class2_Sub49(true, Static169.aClass99_2);
		}
		if (Static400.aClass261_16 == Static394.aClass261_1) {
			local6 = Static46.method824(Static241.aClass229_54) + Static319.method4642(true);
			local50 = Static430.method5687() + Static248.method3529();
			if (local50 > local6) {
				return local6 * 100 / local50;
			}
		}
		if (Static394.aClass261_1 == Static400.aClass261_17) {
			Static476.method6103(Static237.aClass229_52, Static401.aClass309_4, Static380.aClass211_7, Static362.aClass290_2, Static8.aClass360_1, Static369.aClass212_6, Static426.aClass160_1);
		}
		if (Static400.aClass261_18 == Static394.aClass261_1) {
			Static143.aBooleanArray26 = new boolean[Static109.aClass355_1.anInt9331];
			Static240.aStringArray45 = new String[Static583.aClass134_1.anInt2751];
			Static297.anIntArray342 = new int[Static109.aClass355_1.anInt9331];
			for (local6 = 0; local6 < Static109.aClass355_1.anInt9331; local6++) {
				if (Static109.aClass355_1.method7449(local6).anInt2991 == 0) {
					Static143.aBooleanArray26[local6] = true;
					Static40.anInt757++;
				}
				Static297.anIntArray342[local6] = -1;
			}
			Static571.method7441();
			Static579.anInt9400 = Static331.aClass229_80.method4955("loginscreen");
			Static360.anInt6110 = Static331.aClass229_80.method4955("lobbyscreen");
			Static372.aClass229_89.method4969(false);
			Static106.aClass229_32.method4969(true);
			Static241.aClass229_54.method4969(true);
			Static191.aClass229_45.method4969(true);
			Static16.aClass229_1.method4969(true);
			Static331.aClass229_80.method4969(true);
			Static248.aClass229_57.anInt5920 = 2;
			Static99.aBoolean115 = true;
			Static378.aClass229_90.anInt5920 = 2;
			Static72.aClass229_20.anInt5920 = 2;
			Static187.aClass229_121.anInt5920 = 2;
			Static255.aClass229_62.anInt5920 = 2;
			Static309.aClass229_74.anInt5920 = 2;
			Static427.aClass229_97.anInt5920 = 2;
		}
		@Pc(1092) Class273 local1092;
		if (Static394.aClass261_1 == Static400.aClass261_19) {
			if (!Static453.method5906(Static579.anInt9400)) {
				return 0;
			}
			for (local6 = 0; local6 < Static509.aClass273ArrayArray2[Static579.anInt9400].length; local6++) {
				local1092 = Static509.aClass273ArrayArray2[Static579.anInt9400][local6];
				if (local1092.anInt6868 == 5 && local1092.anInt6842 != -1) {
					local1092.method5640(Static417.aClass162_17);
				}
			}
		}
		if (Static394.aClass261_1 == Static400.aClass261_20) {
			for (local6 = 0; local6 < Static509.aClass273ArrayArray2[Static579.anInt9400].length; local6++) {
				local1092 = Static509.aClass273ArrayArray2[Static579.anInt9400][local6];
				if (local1092.anInt6868 == 5 && local1092.anInt6842 != -1 && local1092.method5640(Static417.aClass162_17) == null && Static332.aBoolean802) {
					return 0;
				}
			}
		}
		if (Static400.aClass261_21 == Static394.aClass261_1) {
			Static585.method7578(true);
		}
		if (Static400.aClass261_22 == Static394.aClass261_1) {
			Static573.aClass264_1.method5518();
			try {
				Static55.aThread1.join();
			} catch (@Pc(1172) InterruptedException local1172) {
				return 0;
			}
			Static55.aThread1 = null;
			Static573.aClass264_1 = null;
			Static329.aClass229_79 = null;
			Static314.aClass229_117 = null;
			Static359.aClass28_2 = null;
			Static237.anInterface12Array1 = null;
			Static123.method1659();
			Static336.aBoolean440 = Static257.aClass2_Sub35_Sub1_1.aBoolean635;
			Static257.aClass2_Sub35_Sub1_1.aBoolean635 = true;
			Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
			if (Static336.aBoolean440) {
				Static368.method6714(0);
			} else {
				Static368.method6714(Static257.aClass2_Sub35_Sub1_1.anInt7497);
			}
			Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
			Static323.method4695(Static417.aClass162_17);
			Static47.method842(Static417.aClass162_17);
			Static217.method2656(Static241.aClass229_54, Static417.aClass162_17);
			Static328.method4756(Static331.aClass38Array18);
		}
		return Static492.method6299();
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public static void method7729() {
		if (Static540.anInt8912 == 9) {
			Static115.method1686(5);
		} else if (Static540.anInt8912 == 5 || Static540.anInt8912 == 6) {
			Static115.method1686(3);
		} else if (Static540.anInt8912 == 12) {
			Static115.method1686(3);
			return;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)Lclient!oda;")
	public static Class2_Sub34 method7730() {
		@Pc(11) Class2_Sub34 local11 = Static134.method1816();
		local11.anInt6309 = 0;
		local11.aClass154_77 = null;
		local11.aClass2_Sub7_Sub2_2 = new Class2_Sub7_Sub2(5000);
		return local11;
	}
}
