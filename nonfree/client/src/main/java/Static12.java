import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "Lclient!jga;")
	public static Class14_Sub3_Sub11 aClass14_Sub3_Sub11_1;

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "I")
	public static int anInt95;

	@OriginalMember(owner = "client!aga", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!aga", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_3 = new Class44(26, -2);

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
	public static int anInt94 = -1;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "[I")
	public static final int[] anIntArray10 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_2 = new Class264(64);

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_4 = new Class44(21, 6);

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	public static int anInt96 = 0;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_1 = new Class240("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!aga", name = "C", descriptor = "Z")
	public static boolean aBoolean9 = true;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I")
	public static int method80() {
		@Pc(15) int local15;
		if (Static56.aClass14_Sub22_5.aClass21_Sub7_1.method1947() == 0) {
			for (local15 = 0; local15 < Static569.anInt9812; local15++) {
				if (Static433.anInterface7Array3[local15].method3428() == 's' || Static433.anInterface7Array3[local15].method3428() == 'S') {
					Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub7_1, 1);
					Static290.aBoolean345 = true;
					break;
				}
			}
		}
		@Pc(66) int local66;
		if (Static330.aClass131_22 == Static196.aClass131_1) {
			@Pc(56) Runtime local56 = Runtime.getRuntime();
			local66 = (int) ((local56.totalMemory() - local56.freeMemory()) / 1024L);
			@Pc(69) long local69 = Static521.method7499();
			if (Static194.aLong109 == 0L) {
				Static194.aLong109 = local69;
			}
			if (local66 > 16384 && local69 - Static194.aLong109 < 5000L) {
				if (local69 - Static493.aLong239 > 1000L) {
					System.gc();
					Static493.aLong239 = local69;
				}
				return 0;
			}
		}
		if (Static196.aClass131_2 == Static330.aClass131_22) {
			if (Static567.aClass347_1 == null) {
				Static567.aClass347_1 = new Class347(Static204.aClass135_8, Static386.aClass298_2, Static550.aBigInteger8, Static131.aBigInteger7);
			}
			if (!Static567.aClass347_1.method8435()) {
				return 0;
			}
			Static58.method1206(true, (String) null, 0);
			Static530.aBoolean649 = !Static7.method49();
			Static251.aClass386_63 = Static542.method7657(false, Static530.aBoolean649 ? 34 : 32, 1);
			Static272.aClass386_69 = Static542.method7657(false, 33, 1);
			Static329.aClass386_78 = Static542.method7657(false, 13, 1);
		}
		@Pc(162) boolean local162;
		if (Static196.aClass131_3 == Static330.aClass131_22) {
			local162 = Static272.aClass386_69.method9207();
			local66 = Static177.aClass167_Sub1Array1[33].method3705();
			local66 += Static177.aClass167_Sub1Array1[Static530.aBoolean649 ? 34 : 32].method3705();
			local66 += Static177.aClass167_Sub1Array1[13].method3705();
			local66 += local162 ? 100 : Static272.aClass386_69.method9204();
			if (local66 != 400) {
				return local66 / 4;
			}
			Static379.anInt11206 = Static251.aClass386_63.method9218();
			Static233.anInt4276 = Static272.aClass386_69.method9218();
			Static240.method3597(Static251.aClass386_63);
			@Pc(223) int local223 = Static56.aClass14_Sub22_5.aClass21_Sub24_1.method8185();
			Static76.aClass120_1 = new Class120(Static630.aClass77_8, Static232.anInt4258, Static272.aClass386_69);
			@Pc(235) int[] local235 = Static76.aClass120_1.method2841(local223);
			if (local235.length == 0) {
				local235 = Static76.aClass120_1.method2841(0);
			}
			@Pc(249) Class311 local249 = new Class311(Static251.aClass386_63, Static329.aClass386_78);
			if (local235.length > 0) {
				Static191.anInterface17Array1 = new Interface17[local235.length];
				for (@Pc(261) int local261 = 0; local261 < Static191.anInterface17Array1.length; local261++) {
					Static191.anInterface17Array1[local261] = new Class300(Static76.aClass120_1.method2843(local235[local261]), local249);
				}
			}
		}
		if (Static330.aClass131_22 == Static196.aClass131_4) {
			Static124.method2085(Static631.method8822(), Static251.aClass386_63, Static329.aClass386_78);
		}
		if (Static196.aClass131_5 == Static330.aClass131_22) {
			local15 = Static95.method1752();
			local66 = Static644.method9002();
			if (local66 > local15) {
				return local15 * 100 / local66;
			}
		}
		if (Static196.aClass131_6 == Static330.aClass131_22) {
			if (Static191.anInterface17Array1 != null && Static191.anInterface17Array1.length > 0) {
				if (Static191.anInterface17Array1[0].method9115() < 100) {
					return 0;
				}
				if (Static191.anInterface17Array1.length > 1 && Static76.aClass120_1.method2846() && Static191.anInterface17Array1[1].method9115() < 100) {
					return 0;
				}
			}
			Static500.method7345(Static677.aClass137_47);
			Static178.method2840(Static677.aClass137_47);
			Static67.method1345(1);
		}
		if (Static196.aClass131_7 == Static330.aClass131_22) {
			for (local15 = 0; local15 < 4; local15++) {
				Static226.aClass226Array3[local15] = Static465.method6817(Static26.anInt462, Static445.anInt6140);
			}
		}
		if (Static196.aClass131_8 == Static330.aClass131_22) {
			Static666.aClass386_141 = Static542.method7657(false, 8, 1);
			Static592.aClass386_21 = Static542.method7657(false, 0, 1);
			Static118.aClass386_28 = Static542.method7657(false, 1, 1);
			Static634.aClass386_134 = Static542.method7657(false, 2, 1);
			Static635.aClass386_136 = Static542.method7657(false, 3, 1);
			Static391.aClass386_88 = Static542.method7657(false, 4, 1);
			Static227.aClass386_126 = Static542.method7657(true, 5, 1);
			Static40.aClass386_19 = Static542.method7657(true, 6, 1);
			Static577.aClass386_122 = Static542.method7657(false, 7, 1);
			Static665.aClass386_61 = Static542.method7657(false, 9, 1);
			Static339.aClass386_81 = Static542.method7657(false, 10, 1);
			Static204.aClass386_118 = Static542.method7657(false, 11, 1);
			Static366.aClass386_85 = Static542.method7657(false, 12, 1);
			Static479.aClass386_106 = Static542.method7657(false, 14, 1);
			Static570.aClass386_121 = Static542.method7657(false, 15, 1);
			Static52.aClass386_15 = Static542.method7657(false, 16, 1);
			Static345.aClass386_83 = Static542.method7657(false, 17, 1);
			Static598.aClass386_124 = Static542.method7657(false, 18, 1);
			Static134.aClass386_56 = Static542.method7657(false, 19, 1);
			Static29.aClass386_6 = Static542.method7657(false, 20, 1);
			Static76.aClass386_18 = Static542.method7657(false, 21, 1);
			Static14.aClass386_3 = Static542.method7657(false, 22, 1);
			Static298.aClass386_71 = Static542.method7657(true, 23, 1);
			Static376.aClass386_87 = Static542.method7657(false, 24, 1);
			Static172.aClass386_40 = Static542.method7657(false, 25, 1);
			Static224.aClass386_52 = Static542.method7657(true, 26, 1);
			Static475.aClass386_103 = Static542.method7657(false, 27, 1);
			Static510.aClass386_111 = Static542.method7657(true, 28, 1);
			Static624.aClass386_132 = Static542.method7657(false, 29, 1);
			Static92.aClass386_23 = Static542.method7657(true, 30, 1);
			Static55.aClass386_16 = Static542.method7657(true, 31, 1);
			Static497.aClass386_129 = Static542.method7657(true, 36, 2);
		}
		if (Static196.aClass131_9 == Static330.aClass131_22) {
			local15 = 0;
			for (local66 = 0; local66 < 37; local66++) {
				if (Static177.aClass167_Sub1Array1[local66] != null) {
					local15 += Static177.aClass167_Sub1Array1[local66].method3705() * Static481.anIntArray636[local66] / 100;
				}
			}
			if (local15 != 100) {
				if (Static458.anInt9666 < 0) {
					Static458.anInt9666 = local15;
				}
				return (local15 - Static458.anInt9666) * 100 / (100 - Static458.anInt9666);
			}
			Static11.method434(Static666.aClass386_141);
			Static124.method2085(Static631.method8822(), Static666.aClass386_141, Static329.aClass386_78);
		}
		if (Static330.aClass131_22 == Static196.aClass131_10) {
			if (Static203.anInt3760 == -1) {
				Static203.anInt3760 = Static40.aClass386_19.method9213("scape main");
			}
			Static317.method5018();
			Static67.method1345(2);
		}
		if (Static330.aClass131_22 == Static196.aClass131_11) {
			Static556.method7803(Static234.aClass333_5, Static92.aClass386_23);
		}
		if (Static196.aClass131_12 == Static330.aClass131_22) {
			local15 = Static152.method2445();
			if (local15 < 100) {
				return local15;
			}
			Static577.method8245(Static510.aClass386_111.method9192(1));
			Static389.method5810(Static510.aClass386_111.method9192(3));
			Static431.aClass180_2 = new Class180(Static510.aClass386_111);
		}
		if (Static330.aClass131_22 == Static196.aClass131_13) {
			if (Static213.anInt4055 != -1 && !Static577.aClass386_122.method9216(Static213.anInt4055, 0)) {
				return 99;
			}
			Static526.anInterface3_10 = new Class255(Static224.aClass386_52, Static665.aClass386_61, Static666.aClass386_141);
			Static217.aClass90_1 = new Class90(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static110.aClass197_1 = new Class197(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static431.aClass180_2);
			Static184.aClass151_1 = new Class151(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static666.aClass386_141);
			Static202.aClass172_1 = new Class172(Static630.aClass77_8, Static232.anInt4258, Static345.aClass386_83);
			Static92.aClass350_2 = new Class350(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static620.aClass119_5 = new Class119(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static137.aClass299_1 = new Class299(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static666.aClass386_141);
			Static372.aClass154_2 = new Class154(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static577.aClass386_122);
			Static548.aClass41_1 = new Class41(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static264.aClass68_1 = new Class68(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static511.aClass13_2 = new Class13(Static630.aClass77_8, Static232.anInt4258, true, Static52.aClass386_15, Static577.aClass386_122);
			Static196.aClass116_2 = new Class116(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static666.aClass386_141);
			Static313.aClass83_6 = new Class83(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134, Static666.aClass386_141);
			Static63.aClass37_1 = new Class37(Static630.aClass77_8, Static232.anInt4258, true, Static598.aClass386_124, Static577.aClass386_122);
			Static175.aClass247_2 = new Class247(Static630.aClass77_8, Static232.anInt4258, true, Static217.aClass90_1, Static134.aClass386_56, Static577.aClass386_122);
			Static605.aClass370_1 = new Class370(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static501.aClass191_2 = new Class191(Static630.aClass77_8, Static232.anInt4258, Static29.aClass386_6, Static592.aClass386_21, Static118.aClass386_28);
			Static20.aClass385_31 = new Class385(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static379.aClass250_13 = new Class250(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static556.aClass216_2 = new Class216(Static630.aClass77_8, Static232.anInt4258, Static76.aClass386_18, Static577.aClass386_122);
			Static296.aClass205_3 = new Class205(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static494.aClass16_1 = new Class16(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static470.aClass236_6 = new Class236(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static427.aClass225_1 = new Class225(Static630.aClass77_8, Static232.anInt4258, Static14.aClass386_3);
			Static195.aClass76_1 = new Class76(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static634.aClass15_1 = new Class15(Static630.aClass77_8, Static232.anInt4258, Static634.aClass386_134);
			Static344.method9316(Static635.aClass386_136, Static666.aClass386_141, Static577.aClass386_122, Static329.aClass386_78);
			Static583.method8332(Static624.aClass386_132);
			Static180.aClass122_1 = new Class122(Static232.anInt4258, Static376.aClass386_87, Static172.aClass386_40);
			Static526.aClass266_1 = new Class266(Static232.anInt4258, Static376.aClass386_87, Static172.aClass386_40, new Class253());
			Static563.method8115();
			Static511.aClass13_2.method77(Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0);
			Static595.aClass241_1 = new Class241();
			Static221.method6306();
			Static29.method651(Static475.aClass386_103);
			Static556.method7812(Static577.aClass386_122, Static526.anInterface3_10);
			@Pc(978) Class335 local978 = new Class335(Static339.aClass386_81.method9219("", "huffman"));
			Static447.method8530(local978);
			try {
				jagmisc.init();
			} catch (@Pc(985) Throwable local985) {
			}
			Static8.aClass96_1 = Static581.method8290();
			Static58.aClass14_Sub11_1 = new Class14_Sub11(true, Static234.aClass333_5);
		}
		if (Static330.aClass131_22 == Static196.aClass131_15) {
			local15 = Static354.method5363(Static666.aClass386_141) + Static173.method2784(true);
			local66 = Static532.method7620() + Static644.method9002();
			if (local15 < local66) {
				return local15 * 100 / local66;
			}
		}
		if (Static330.aClass131_22 == Static196.aClass131_16) {
			Static498.method7291(Static298.aClass386_71, Static92.aClass350_2, Static620.aClass119_5, Static511.aClass13_2, Static196.aClass116_2, Static313.aClass83_6, Static595.aClass241_1);
		}
		if (Static330.aClass131_22 == Static196.aClass131_17) {
			Static259.anIntArray800 = new int[Static470.aClass236_6.anInt6845];
			Static330.aBooleanArray15 = new boolean[Static470.aClass236_6.anInt6845];
			Static277.aStringArray13 = new String[Static494.aClass16_1.anInt162];
			for (local15 = 0; local15 < Static470.aClass236_6.anInt6845; local15++) {
				if (Static470.aClass236_6.method5550(local15).anInt5231 == 0) {
					Static330.aBooleanArray15[local15] = true;
					Static306.anInt5350++;
				}
				Static259.anIntArray800[local15] = -1;
			}
			Static615.method8632();
			Static666.anInt11087 = Static635.aClass386_136.method9213("loginscreen");
			Static546.anInt9319 = Static635.aClass386_136.method9213("lobbyscreen");
			Static227.aClass386_126.method9200(false);
			Static40.aClass386_19.method9200(true);
			Static666.aClass386_141.method9200(true);
			Static329.aClass386_78.method9200(true);
			Static339.aClass386_81.method9200(true);
			Static635.aClass386_136.method9200(true);
			Static225.aBoolean296 = true;
			Static634.aClass386_134.anInt11070 = 2;
			Static345.aClass386_83.anInt11070 = 2;
			Static52.aClass386_15.anInt11070 = 2;
			Static598.aClass386_124.anInt11070 = 2;
			Static134.aClass386_56.anInt11070 = 2;
			Static29.aClass386_6.anInt11070 = 2;
			Static76.aClass386_18.anInt11070 = 2;
		}
		if (Static196.aClass131_18 == Static330.aClass131_22) {
			if (!Static220.method3432(Static666.anInt11087)) {
				return 0;
			}
			local162 = true;
			for (local66 = 0; local66 < Static559.aClass230ArrayArray2[Static666.anInt11087].length; local66++) {
				@Pc(1164) Class230 local1164 = Static559.aClass230ArrayArray2[Static666.anInt11087][local66];
				if (local1164.anInt6660 == 5 && local1164.anInt6688 != -1 && !Static666.aClass386_141.method9216(local1164.anInt6688, 0)) {
					local162 = false;
				}
			}
			if (!local162) {
				return 0;
			}
		}
		if (Static330.aClass131_22 == Static196.aClass131_19) {
			Static616.method8659(true);
		}
		if (Static196.aClass131_20 == Static330.aClass131_22) {
			Static292.aClass360_1.method8666();
			try {
				Static278.aThread1.join();
			} catch (@Pc(1209) InterruptedException local1209) {
				return 0;
			}
			Static278.aThread1 = null;
			Static191.anInterface17Array1 = null;
			Static292.aClass360_1 = null;
			Static76.aClass120_1 = null;
			Static272.aClass386_69 = null;
			Static251.aClass386_63 = null;
			Static261.method3781();
			Static328.aBoolean431 = Static56.aClass14_Sub22_5.aClass21_Sub7_1.method1947() == 1;
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub7_1, 1);
			if (Static328.aBoolean431) {
				Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 0);
			} else if (Static56.aClass14_Sub22_5.aClass21_Sub21_1.aBoolean640 && Static58.aClass14_Sub11_1.anInt1980 < 512 && Static58.aClass14_Sub11_1.anInt1980 != 0) {
				Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 0);
			}
			Static169.method2762();
			if (Static328.aBoolean431) {
				Static155.method2506(0, false);
			} else {
				Static155.method2506(Static56.aClass14_Sub22_5.aClass21_Sub21_1.method7541(), false);
			}
			Static437.method6438(-1, -1, false, Static56.aClass14_Sub22_5.aClass21_Sub15_2.method5081());
			Static500.method7345(Static677.aClass137_47);
			Static178.method2840(Static677.aClass137_47);
			Static493.method7317(Static666.aClass386_141, Static677.aClass137_47);
			Static226.method5381(Static521.aClass20Array13);
		}
		return Static679.method9325();
	}
}
