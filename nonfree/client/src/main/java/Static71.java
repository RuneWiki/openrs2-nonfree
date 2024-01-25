import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!in;")
	public static final Class157 aClass157_1 = new Class157(16);

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public static int anInt1682 = 0;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V")
	public static void method1508(@OriginalArg(1) int arg0) {
		Static326.aLong252 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
	public static void method1509(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(4, arg0);
		local8.method488();
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	public static int method1512() {
		@Pc(6) int local6;
		if (!Static479.aClass1_Sub7_Sub1_1.aBoolean222) {
			for (local6 = 0; local6 < Static207.anInt7989; local6++) {
				if (Static304.anInterface21Array2[local6].method6536() == 's' || Static304.anInterface21Array2[local6].method6536() == 'S') {
					Static479.aClass1_Sub7_Sub1_1.aBoolean222 = true;
					break;
				}
			}
		}
		@Pc(58) int local58;
		if (Static382.aClass350_1 == Static569.aClass350_3) {
			@Pc(48) Runtime local48 = Runtime.getRuntime();
			local58 = (int) ((local48.totalMemory() - local48.freeMemory()) / 1024L);
			@Pc(61) long local61 = Static255.method4035();
			if (Static288.aLong221 == 0L) {
				Static288.aLong221 = local61;
			}
			if (local58 > 16384 && local61 - Static288.aLong221 < 5000L) {
				if (local61 - Static535.aLong389 > 1000L) {
					System.gc();
					Static535.aLong389 = local61;
				}
				return 0;
			}
		}
		if (Static382.aClass350_1 == Static569.aClass350_4) {
			if (Static226.aClass168_3 == null) {
				Static226.aClass168_3 = new Class168(Static543.aClass113_2, Static79.aClass274_1, Static536.aBigInteger5, Static398.aBigInteger3);
			}
			if (!Static226.aClass168_3.method3977()) {
				return 0;
			}
			Static440.method6264(0, null);
			Static402.aBoolean498 = !Static180.method2752();
			Static538.aClass111_115 = Static489.method6877(Static402.aBoolean498 ? 34 : 32, false);
			Static296.aClass111_69 = Static489.method6877(33, false);
			Static530.aClass111_114 = Static489.method6877(13, false);
		}
		if (Static569.aClass350_5 == Static382.aClass350_1) {
			Static296.aClass111_69.method2456();
			local6 = Static553.aClass252_Sub1Array2[33].method7931();
			local6 += Static553.aClass252_Sub1Array2[Static402.aBoolean498 ? 34 : 32].method7931();
			local6 += Static553.aClass252_Sub1Array2[13].method7931();
			local6 += Static296.aClass111_69.method2438();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static327.anInt5869 = Static538.aClass111_115.method2459();
			Static443.anInt7711 = Static296.aClass111_69.method2459();
			Static191.method3384(Static538.aClass111_115);
			local58 = Static479.aClass1_Sub7_Sub1_1.anInt3114;
			Static3.aClass192_1 = new Class192(Static275.aClass230_2, Static562.anInt9127, Static296.aClass111_69);
			@Pc(220) int[] local220 = Static3.aClass192_1.method4284(local58);
			@Pc(226) Class185 local226 = new Class185(Static538.aClass111_115, Static530.aClass111_114);
			if (local220.length > 0) {
				Static509.anInterface22Array1 = new Interface22[local220.length];
				for (@Pc(238) int local238 = 0; local238 < Static509.anInterface22Array1.length; local238++) {
					Static509.anInterface22Array1[local238] = new Class71(Static3.aClass192_1.method4286(local220[local238]), local226);
				}
			}
		}
		if (Static382.aClass350_1 == Static569.aClass350_6) {
			Static227.method3760(Static530.aClass111_114, Static333.method5001(), Static538.aClass111_115);
		}
		if (Static382.aClass350_1 == Static569.aClass350_7) {
			local6 = Static152.method2403();
			local58 = Static201.method5525();
			if (local6 < local58) {
				return local6 * 100 / local58;
			}
		}
		if (Static569.aClass350_8 == Static382.aClass350_1) {
			if (Static509.anInterface22Array1 != null && Static509.anInterface22Array1.length > 0) {
				if (Static509.anInterface22Array1[0].method1808() < 100) {
					return 0;
				}
				if (Static509.anInterface22Array1.length > 1 && Static3.aClass192_1.method4287() && Static509.anInterface22Array1[1].method1808() < 100) {
					return 0;
				}
			}
			Static81.method1664(Static136.aClass12_8);
			Static338.method5051(Static136.aClass12_8);
			Static243.method3970(1);
		}
		if (Static569.aClass350_9 == Static382.aClass350_1) {
			for (local6 = 0; local6 < 4; local6++) {
				Static28.aClass94Array2[local6] = Static49.method1136(Static500.anInt6888, Static573.anInt9325);
			}
		}
		if (Static569.aClass350_10 == Static382.aClass350_1) {
			Static141.aClass111_32 = Static489.method6877(8, false);
			Static543.aClass111_116 = Static489.method6877(0, false);
			Static351.aClass111_83 = Static489.method6877(1, false);
			Static333.aClass111_77 = Static489.method6877(2, false);
			Static85.aClass111_18 = Static489.method6877(3, false);
			Static546.aClass111_117 = Static489.method6877(4, false);
			Static373.aClass111_90 = Static489.method6877(5, true);
			Static153.aClass111_34 = Static489.method6877(6, true);
			Static454.aClass111_107 = Static489.method6877(7, false);
			Static446.aClass111_106 = Static489.method6877(9, false);
			Static551.aClass111_119 = Static489.method6877(10, false);
			Static116.aClass111_25 = Static489.method6877(11, false);
			Static221.aClass111_49 = Static489.method6877(12, false);
			Static144.aClass111_33 = Static489.method6877(14, false);
			Static239.aClass111_50 = Static489.method6877(15, false);
			Static331.aClass111_76 = Static489.method6877(16, false);
			Static59.aClass111_109 = Static489.method6877(17, false);
			Static440.aClass111_102 = Static489.method6877(18, false);
			Static356.aClass111_99 = Static489.method6877(19, false);
			Static351.aClass111_82 = Static489.method6877(20, false);
			Static587.aClass111_127 = Static489.method6877(21, false);
			Static60.aClass111_10 = Static489.method6877(22, false);
			Static460.aClass111_108 = Static489.method6877(23, true);
			Static571.aClass111_123 = Static489.method6877(24, false);
			Static363.aClass111_111 = Static489.method6877(25, false);
			Static292.aClass111_68 = Static489.method6877(26, true);
			Static2.aClass111_1 = Static489.method6877(27, false);
			Static32.aClass111_5 = Static489.method6877(28, true);
			Static585.aClass111_126 = Static489.method6877(29, false);
			Static255.aClass111_53 = Static489.method6877(30, true);
			Static446.aClass111_105 = Static489.method6877(31, true);
		}
		if (Static569.aClass350_11 == Static382.aClass350_1) {
			local6 = 0;
			for (local58 = 0; local58 < 35; local58++) {
				if (Static553.aClass252_Sub1Array2[local58] != null) {
					local6 += Static553.aClass252_Sub1Array2[local58].method7931() * Static413.anIntArray479[local58] / 100;
				}
			}
			if (local6 != 100) {
				if (Static337.anInt5996 < 0) {
					Static337.anInt5996 = local6;
				}
				return (local6 - Static337.anInt5996) * 100 / (100 - Static337.anInt5996);
			}
			Static443.method6342(Static141.aClass111_32);
			Static227.method3760(Static530.aClass111_114, Static333.method5001(), Static141.aClass111_32);
		}
		if (Static569.aClass350_12 == Static382.aClass350_1) {
			Static136.method2289();
			Static243.method3970(2);
		}
		if (Static569.aClass350_13 == Static382.aClass350_1) {
			Static374.method5441(Static246.aClass114_10, Static255.aClass111_53);
		}
		if (Static569.aClass350_14 == Static382.aClass350_1) {
			local6 = Static219.method3649();
			if (local6 < 100) {
				return local6;
			}
			Static403.method5687(Static32.aClass111_5.method2449(1));
			Static553.method7505(Static32.aClass111_5.method2449(3));
		}
		if (Static569.aClass350_15 == Static382.aClass350_1) {
			if (Static214.anInt4163 != -1 && !Static454.aClass111_107.method2465(0, Static214.anInt4163)) {
				return 99;
			}
			Static478.anInterface5_11 = new Class180(Static292.aClass111_68, Static446.aClass111_106, Static141.aClass111_32);
			Static88.aClass183_1 = new Class183(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static161.aClass291_1 = new Class291(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static470.aClass352_2 = new Class352(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77, Static141.aClass111_32);
			Static327.aClass266_1 = new Class266(Static275.aClass230_2, Static562.anInt9127, Static59.aClass111_109);
			Static349.aClass206_3 = new Class206(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static396.aClass56_4 = new Class56(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static412.aClass93_1 = new Class93(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77, Static454.aClass111_107);
			Static413.aClass76_1 = new Class76(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static395.aClass335_1 = new Class335(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static146.aClass214_1 = new Class214(Static275.aClass230_2, Static562.anInt9127, true, Static331.aClass111_76, Static454.aClass111_107);
			Static299.aClass46_4 = new Class46(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77, Static141.aClass111_32);
			Static74.aClass184_1 = new Class184(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77, Static141.aClass111_32);
			Static183.aClass182_1 = new Class182(Static275.aClass230_2, Static562.anInt9127, true, Static440.aClass111_102, Static454.aClass111_107);
			Static46.aClass234_1 = new Class234(Static275.aClass230_2, Static562.anInt9127, true, Static88.aClass183_1, Static356.aClass111_99, Static454.aClass111_107);
			Static83.aClass255_1 = new Class255(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static594.aClass311_2 = new Class311(Static275.aClass230_2, Static562.anInt9127, Static351.aClass111_82, Static543.aClass111_116, Static351.aClass111_83);
			Static117.aClass345_1 = new Class345(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static395.aClass263_1 = new Class263(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static592.aClass98_2 = new Class98(Static275.aClass230_2, Static562.anInt9127, Static587.aClass111_127, Static454.aClass111_107);
			Static545.aClass194_1 = new Class194(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static372.aClass59_1 = new Class59(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static359.aClass245_1 = new Class245(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static558.aClass32_1 = new Class32(Static275.aClass230_2, Static562.anInt9127, Static60.aClass111_10);
			Static189.aClass39_1 = new Class39(Static275.aClass230_2, Static562.anInt9127, Static333.aClass111_77);
			Static469.method6623(Static141.aClass111_32, Static454.aClass111_107, Static530.aClass111_114, Static85.aClass111_18);
			Static368.method5388(Static585.aClass111_126);
			Static273.aClass49_1 = new Class49(Static562.anInt9127, Static571.aClass111_123, Static363.aClass111_111);
			Static296.aClass362_2 = new Class362(Static562.anInt9127, Static571.aClass111_123, Static363.aClass111_111, new Class79());
			Static429.method6008();
			Static146.aClass214_1.method4901(!Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609));
			Static121.aClass148_1 = new Class148();
			Static89.method1753();
			Static459.method6511(Static2.aClass111_1);
			Static41.method999(Static478.anInterface5_11, Static454.aClass111_107);
			@Pc(914) Class67 local914 = new Class67(Static551.aClass111_119.method2450("", "huffman"));
			Static595.method7941(local914);
			try {
				jagmisc.init();
			} catch (@Pc(921) Throwable local921) {
			}
			Static375.aClass92_1 = Static132.method2238();
		}
		if (Static569.aClass350_17 == Static382.aClass350_1) {
			local6 = Static167.method2567(Static141.aClass111_32) + Static477.method6710(true);
			local58 = Static564.method7621() + Static201.method5525();
			if (local6 < local58) {
				return local6 * 100 / local58;
			}
		}
		if (Static382.aClass350_1 == Static569.aClass350_18) {
			Static313.method3491(Static460.aClass111_108, Static349.aClass206_3, Static396.aClass56_4, Static146.aClass214_1, Static299.aClass46_4, Static74.aClass184_1, Static121.aClass148_1);
		}
		if (Static382.aClass350_1 == Static569.aClass350_19) {
			Static111.aStringArray11 = new String[Static372.aClass59_1.anInt1870];
			Static412.aBooleanArray23 = new boolean[Static359.aClass245_1.anInt6779];
			Static475.anIntArray530 = new int[Static359.aClass245_1.anInt6779];
			for (local6 = 0; local6 < Static359.aClass245_1.anInt6779; local6++) {
				if (Static359.aClass245_1.method5572(local6).anInt7688 == 0) {
					Static412.aBooleanArray23[local6] = true;
					Static296.anInt5480++;
				}
				Static475.anIntArray530[local6] = -1;
			}
			Static487.method6815();
			Static390.anInt6785 = Static85.aClass111_18.method2462("loginscreen");
			Static573.anInt9329 = Static85.aClass111_18.method2462("lobbyscreen");
			Static373.aClass111_90.method2447(false);
			Static153.aClass111_34.method2447(true);
			Static141.aClass111_32.method2447(true);
			Static530.aClass111_114.method2447(true);
			Static551.aClass111_119.method2447(true);
			Static85.aClass111_18.method2447(true);
			Static333.aClass111_77.anInt2898 = 2;
			Static574.aBoolean682 = true;
			Static59.aClass111_109.anInt2898 = 2;
			Static331.aClass111_76.anInt2898 = 2;
			Static440.aClass111_102.anInt2898 = 2;
			Static356.aClass111_99.anInt2898 = 2;
			Static351.aClass111_82.anInt2898 = 2;
			Static587.aClass111_127.anInt2898 = 2;
		}
		@Pc(1094) Class365 local1094;
		if (Static382.aClass350_1 == Static569.aClass350_20) {
			if (!Static300.method4703(Static390.anInt6785)) {
				return 0;
			}
			for (local6 = 0; local6 < Static249.aClass365ArrayArray3[Static390.anInt6785].length; local6++) {
				local1094 = Static249.aClass365ArrayArray3[Static390.anInt6785][local6];
				if (local1094.anInt9595 == 5 && local1094.anInt9602 != -1) {
					local1094.method7906(Static136.aClass12_8);
				}
			}
		}
		if (Static569.aClass350_21 == Static382.aClass350_1) {
			for (local6 = 0; local6 < Static249.aClass365ArrayArray3[Static390.anInt6785].length; local6++) {
				local1094 = Static249.aClass365ArrayArray3[Static390.anInt6785][local6];
				if (local1094.anInt9595 == 5 && local1094.anInt9602 != -1 && local1094.method7906(Static136.aClass12_8) == null && Static285.aBoolean683) {
					return 0;
				}
			}
		}
		if (Static569.aClass350_22 == Static382.aClass350_1) {
			Static218.method3611(true);
		}
		if (Static382.aClass350_1 == Static569.aClass350_23) {
			Static137.aClass260_1.method5790();
			try {
				Static202.aThread4.join();
			} catch (@Pc(1172) InterruptedException local1172) {
				return 0;
			}
			Static538.aClass111_115 = null;
			Static137.aClass260_1 = null;
			Static296.aClass111_69 = null;
			Static202.aThread4 = null;
			Static3.aClass192_1 = null;
			Static509.anInterface22Array1 = null;
			Static213.method3553();
			Static307.aBoolean415 = Static479.aClass1_Sub7_Sub1_1.aBoolean222;
			Static479.aClass1_Sub7_Sub1_1.aBoolean222 = true;
			Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
			if (Static307.aBoolean415) {
				Static69.method1449(0);
			} else {
				Static69.method1449(Static479.aClass1_Sub7_Sub1_1.anInt3115);
			}
			Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
			Static81.method1664(Static136.aClass12_8);
			Static338.method5051(Static136.aClass12_8);
			Static338.method5054(Static136.aClass12_8, Static141.aClass111_32);
			Static113.method1977(Static39.aClass10Array5);
		}
		return Static578.method7767();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)[Lclient!eba;")
	public static Class81[] method1515() {
		return new Class81[] { Static230.aClass81_142, Static205.aClass81_105, Static143.aClass81_73, Static89.aClass81_52, Static317.aClass81_132, Static444.aClass81_129, Static282.aClass81_121, Static577.aClass81_225, Static517.aClass81_202, Static510.aClass81_220, Static231.aClass81_110, Static456.aClass81_185, Static110.aClass81_59, Static173.aClass81_84, Static366.aClass81_152, Static111.aClass81_62, Static554.aClass81_218, Static518.aClass81_203, Static482.aClass81_192, Static236.aClass81_111, Static337.aClass81_141, Static199.aClass81_104, Static418.aClass81_169, Static325.aClass81_227, Static508.aClass81_36, Static178.aClass81_87, Static217.aClass81_107, Static279.aClass81_120, Static441.aClass81_181, Static586.aClass81_228, Static357.aClass81_145, Static404.aClass81_164, Static199.aClass81_103, Static172.aClass81_83, Static518.aClass81_204, Static190.aClass81_97, Static431.aClass81_178, Static114.aClass81_63, Static23.aClass81_149, Static454.aClass81_184, Static387.aClass81_157, Static332.aClass81_139, Static265.aClass81_118, Static522.aClass81_205, Static59.aClass81_188, Static391.aClass81_159, Static548.aClass81_217, Static456.aClass81_186, Static297.aClass81_197, Static546.aClass81_216, Static102.aClass81_56, Static474.aClass81_21, Static137.aClass81_71, Static170.aClass81_81, Static227.aClass81_109, Static403.aClass81_162, Static323.aClass81_136, Static94.aClass81_54, Static152.aClass81_77, Static63.aClass81_42, Static86.aClass81_49, Static327.aClass81_137, Static116.aClass81_65, Static87.aClass81_50, Static89.aClass81_53, Static110.aClass81_61, Static188.aClass81_96, Static427.aClass81_176, Static166.aClass81_78, Static53.aClass81_34, Static74.aClass81_46, Static126.aClass81_156, Static23.aClass81_148, Static423.aClass81_173, Static50.aClass81_29, Static171.aClass81_82, Static499.aClass81_199, Static416.aClass81_168, Static295.aClass81_126, Static110.aClass81_60, Static229.aClass81_210, Static144.aClass81_74, Static176.aClass81_86, Static542.aClass81_212, Static475.aClass81_190, Static589.aClass81_230, Static170.aClass81_80, Static303.aClass81_231, Static206.aClass81_106, Static84.aClass81_47, Static415.aClass81_167, Static491.aClass81_45, Static582.aClass81_226, Static390.aClass81_158, Static453.aClass81_183, Static197.aClass81_102, Static331.aClass81_138, Static21.aClass81_7, Static4.aClass81_3, Static476.aClass81_191, Static147.aClass81_76, Static284.aClass81_122, Static567.aClass81_222, Static502.aClass81_200, Static222.aClass81_27, Static99.aClass81_55, Static493.aClass81_198, Static394.aClass81_160, Static12.aClass81_6, Static483.aClass81_194, Static557.aClass81_219, Static87.aClass81_51, Static229.aClass81_211, Static179.aClass81_88, Static86.aClass81_48, Static446.aClass81_182, Static179.aClass81_89 };
	}
}
