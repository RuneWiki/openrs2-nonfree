import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	public static int anInt5859;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "Lclient!af;")
	public static final Class10 aClass10_36 = new Class10(4);

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
	public static int anInt5857 = 0;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
	public static void method4970() {
		if (Static556.anInt9319 == 7) {
			Static483.method7043(false);
		} else {
			Static263.aClass170_2 = Static163.aClass170_1;
			Static163.aClass170_1 = null;
			Static143.method2106(13);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)I")
	public static int method4971() {
		@Pc(8) int local8;
		if (Static96.aClass6_Sub22_7.aClass29_Sub19_1.method6423() == 0) {
			for (local8 = 0; local8 < Static473.anInt8160; local8++) {
				if (Static649.anInterface20Array2[local8].method1557() == 's' || Static649.anInterface20Array2[local8].method1557() == 'S') {
					Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub19_1, 1);
					Static511.aBoolean403 = true;
					break;
				}
			}
		}
		@Pc(60) int local60;
		if (Static483.aClass46_23 == Static62.aClass46_1) {
			@Pc(51) Runtime local51 = Runtime.getRuntime();
			local60 = (int) ((local51.totalMemory() - local51.freeMemory()) / 1024L);
			@Pc(63) long local63 = Static566.method7936();
			if (Static176.aLong99 == 0L) {
				Static176.aLong99 = local63;
			}
			if (local60 > 16384 && local63 - Static176.aLong99 < 5000L) {
				if (local63 - Static406.aLong202 > 1000L) {
					System.gc();
					Static406.aLong202 = local63;
				}
				return 0;
			}
		}
		if (Static483.aClass46_23 == Static62.aClass46_2) {
			if (Static126.aClass306_10 == null) {
				Static126.aClass306_10 = new Class306(Static424.aClass73_2, Static626.aClass80_3, Static549.aBigInteger6, Static462.aBigInteger3);
			}
			if (!Static126.aClass306_10.method7244()) {
				return 0;
			}
			Static524.method7851((String) null, true, 0);
			Static222.aBoolean223 = !Static385.method5486();
			Static162.aClass8_51 = Static247.method3621(Static222.aBoolean223 ? 34 : 32, false, 1);
			Static302.aClass8_82 = Static247.method3621(33, false, 1);
			Static466.aClass8_114 = Static247.method3621(13, false, 1);
		}
		@Pc(157) boolean local157;
		if (Static483.aClass46_23 == Static62.aClass46_3) {
			local157 = Static302.aClass8_82.method264();
			local60 = Static483.aClass222_Sub1Array1[33].method5296();
			local60 += Static483.aClass222_Sub1Array1[Static222.aBoolean223 ? 34 : 32].method5296();
			local60 += Static483.aClass222_Sub1Array1[13].method5296();
			local60 += local157 ? 100 : Static302.aClass8_82.method266();
			if (local60 != 400) {
				return local60 / 4;
			}
			Static644.anInt10398 = Static162.aClass8_51.method265();
			Static379.anInt6350 = Static302.aClass8_82.method265();
			Static156.method2211(Static162.aClass8_51);
			@Pc(218) int local218 = Static96.aClass6_Sub22_7.aClass29_Sub20_1.method6932();
			Static194.aClass344_1 = new Class344(Static457.aClass176_6, Static616.anInt10077, Static302.aClass8_82);
			@Pc(230) int[] local230 = Static194.aClass344_1.method8077(local218);
			if (local230.length == 0) {
				local230 = Static194.aClass344_1.method8077(0);
			}
			@Pc(247) Class33 local247 = new Class33(Static162.aClass8_51, Static466.aClass8_114);
			if (local230.length > 0) {
				Static642.anInterface5Array1 = new Interface5[local230.length];
				for (@Pc(259) int local259 = 0; local259 < Static642.anInterface5Array1.length; local259++) {
					Static642.anInterface5Array1[local259] = new Class152(Static194.aClass344_1.method8080(local230[local259]), local247);
				}
			}
		}
		if (Static483.aClass46_23 == Static62.aClass46_4) {
			Static465.method6880(Static658.method8968(), Static466.aClass8_114, Static162.aClass8_51);
		}
		if (Static483.aClass46_23 == Static62.aClass46_5) {
			local8 = Static343.method5016();
			local60 = Static630.method5248();
			if (local60 > local8) {
				return local8 * 100 / local60;
			}
		}
		if (Static483.aClass46_23 == Static62.aClass46_6) {
			if (Static642.anInterface5Array1 != null && Static642.anInterface5Array1.length > 0) {
				if (Static642.anInterface5Array1[0].method7071() < 100) {
					return 0;
				}
				if (Static642.anInterface5Array1.length > 1 && Static194.aClass344_1.method8082() && Static642.anInterface5Array1[1].method7071() < 100) {
					return 0;
				}
			}
			Static306.method4401(Static546.aClass132_13);
			Static84.method1470(Static546.aClass132_13);
			Static143.method2106(1);
		}
		if (Static62.aClass46_7 == Static483.aClass46_23) {
			for (local8 = 0; local8 < 4; local8++) {
				Static83.aClass324Array1[local8] = Static611.method8416(Static491.anInt9856, Static393.anInt6574);
			}
		}
		if (Static483.aClass46_23 == Static62.aClass46_8) {
			Static624.aClass8_139 = Static247.method3621(8, false, 1);
			Static29.aClass8_102 = Static247.method3621(0, false, 1);
			Static445.aClass8_107 = Static247.method3621(1, false, 1);
			Static307.aClass8_83 = Static247.method3621(2, false, 1);
			Static656.aClass8_146 = Static247.method3621(3, false, 1);
			Static98.aClass8_123 = Static247.method3621(4, false, 1);
			Static187.aClass8_56 = Static247.method3621(5, true, 1);
			Static365.aClass8_98 = Static247.method3621(6, true, 1);
			Static286.aClass8_76 = Static247.method3621(7, false, 1);
			Static539.aClass8_125 = Static247.method3621(9, false, 1);
			Static390.aClass8_101 = Static247.method3621(10, false, 1);
			Static365.aClass8_99 = Static247.method3621(11, false, 1);
			Static146.aClass8_75 = Static247.method3621(12, false, 1);
			Static465.aClass8_112 = Static247.method3621(14, false, 1);
			Static86.aClass8_25 = Static247.method3621(15, false, 1);
			Static593.aClass8_131 = Static247.method3621(16, false, 1);
			Static49.aClass8_13 = Static247.method3621(17, false, 1);
			Static5.aClass8_1 = Static247.method3621(18, false, 1);
			Static169.aClass8_53 = Static247.method3621(19, false, 1);
			Static112.aClass8_30 = Static247.method3621(20, false, 1);
			Static43.aClass8_12 = Static247.method3621(21, false, 1);
			Static563.aClass8_126 = Static247.method3621(22, false, 1);
			Static663.aClass8_136 = Static247.method3621(23, true, 1);
			Static309.aClass8_41 = Static247.method3621(24, false, 1);
			Static613.aClass8_137 = Static247.method3621(25, false, 1);
			Static340.aClass8_93 = Static247.method3621(26, true, 1);
			Static163.aClass8_52 = Static247.method3621(27, false, 1);
			Static312.aClass8_122 = Static247.method3621(28, true, 1);
			Static488.aClass8_119 = Static247.method3621(29, false, 1);
			Static121.aClass8_35 = Static247.method3621(30, true, 1);
			Static630.aClass8_97 = Static247.method3621(31, true, 1);
			Static262.aClass8_96 = Static247.method3621(36, true, 2);
		}
		if (Static483.aClass46_23 == Static62.aClass46_9) {
			local8 = 0;
			for (local60 = 0; local60 < 37; local60++) {
				if (Static483.aClass222_Sub1Array1[local60] != null) {
					local8 += Static483.aClass222_Sub1Array1[local60].method5296() * Static541.anIntArray370[local60] / 100;
				}
			}
			if (local8 != 100) {
				if (Static496.anInt9637 < 0) {
					Static496.anInt9637 = local8;
				}
				return (local8 - Static496.anInt9637) * 100 / (100 - Static496.anInt9637);
			}
			Static378.method6992(Static624.aClass8_139);
			Static465.method6880(Static658.method8968(), Static466.aClass8_114, Static624.aClass8_139);
		}
		if (Static62.aClass46_10 == Static483.aClass46_23) {
			if (Static93.anInt7373 == -1) {
				Static93.anInt7373 = Static365.aClass8_98.method252("scape main");
			}
			Static596.method8238();
			Static143.method2106(2);
		}
		if (Static483.aClass46_23 == Static62.aClass46_11) {
			Static401.method5787(Static121.aClass8_35, Static569.aClass380_6);
		}
		if (Static483.aClass46_23 == Static62.aClass46_12) {
			local8 = Static142.method2094();
			if (local8 < 100) {
				return local8;
			}
			Static280.method4103(Static312.aClass8_122.method267(1));
			Static407.method5840(Static312.aClass8_122.method267(3));
			Static312.aClass212_2 = new Class212(Static312.aClass8_122);
		}
		if (Static62.aClass46_13 == Static483.aClass46_23) {
			if (Static114.anInt2059 != -1 && !Static286.aClass8_76.method275(0, Static114.anInt2059)) {
				return 99;
			}
			Static251.anInterface6_5 = new Class293(Static340.aClass8_93, Static539.aClass8_125, Static624.aClass8_139);
			Static280.aClass349_2 = new Class349(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static12.aClass368_1 = new Class368(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static312.aClass212_2);
			Static204.aClass350_1 = new Class350(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static624.aClass8_139);
			Static28.aClass190_1 = new Class190(Static457.aClass176_6, Static616.anInt10077, Static49.aClass8_13);
			Static294.aClass375_10 = new Class375(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static89.aClass391_9 = new Class391(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static118.aClass55_1 = new Class55(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static624.aClass8_139);
			Static416.aClass107_1 = new Class107(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static286.aClass8_76);
			Static646.aClass388_1 = new Class388(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static534.aClass162_1 = new Class162(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static411.aClass88_3 = new Class88(Static457.aClass176_6, Static616.anInt10077, true, Static593.aClass8_131, Static286.aClass8_76);
			Static252.aClass280_1 = new Class280(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static624.aClass8_139);
			Static340.aClass186_3 = new Class186(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83, Static624.aClass8_139);
			Static95.aClass188_1 = new Class188(Static457.aClass176_6, Static616.anInt10077, true, Static5.aClass8_1, Static286.aClass8_76);
			Static340.aClass121_1 = new Class121(Static457.aClass176_6, Static616.anInt10077, true, Static280.aClass349_2, Static169.aClass8_53, Static286.aClass8_76);
			Static611.aClass233_1 = new Class233(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static334.aClass268_2 = new Class268(Static457.aClass176_6, Static616.anInt10077, Static112.aClass8_30, Static29.aClass8_102, Static445.aClass8_107);
			Static399.aClass194_1 = new Class194(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static186.aClass147_1 = new Class147(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static111.aClass279_4 = new Class279(Static457.aClass176_6, Static616.anInt10077, Static43.aClass8_12, Static286.aClass8_76);
			Static604.aClass76_3 = new Class76(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static54.aClass177_1 = new Class177(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static289.aClass275_1 = new Class275(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static439.aClass372_1 = new Class372(Static457.aClass176_6, Static616.anInt10077, Static563.aClass8_126);
			Static313.aClass200_1 = new Class200(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static672.aClass198_3 = new Class198(Static457.aClass176_6, Static616.anInt10077, Static307.aClass8_83);
			Static423.method6278(Static656.aClass8_146, Static624.aClass8_139, Static286.aClass8_76, Static466.aClass8_114);
			Static99.method1638(Static488.aClass8_119);
			Static474.aClass75_2 = new Class75(Static616.anInt10077, Static309.aClass8_41, Static613.aClass8_137);
			Static418.aClass377_1 = new Class377(Static616.anInt10077, Static309.aClass8_41, Static613.aClass8_137, new Class182());
			Static671.method9090();
			Static411.aClass88_3.method2017(Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0);
			Static659.aClass363_3 = new Class363();
			Static180.method8370();
			Static430.method8453(Static163.aClass8_52);
			Static146.method4126(Static251.anInterface6_5, Static286.aClass8_76);
			@Pc(984) Class312 local984 = new Class312(Static390.aClass8_101.method274("huffman", ""));
			Static242.method3603(local984);
			try {
				jagmisc.init();
			} catch (@Pc(991) Throwable local991) {
			}
			Static678.aClass3_4 = Static26.method608();
			Static296.aClass6_Sub33_1 = new Class6_Sub33(true, Static569.aClass380_6);
		}
		if (Static483.aClass46_23 == Static62.aClass46_15) {
			local8 = Static151.method2162(Static624.aClass8_139) + Static344.method5030(true);
			local60 = Static543.method9173() + Static630.method5248();
			if (local8 < local60) {
				return local8 * 100 / local60;
			}
		}
		if (Static62.aClass46_16 == Static483.aClass46_23) {
			Static528.method4553(Static663.aClass8_136, Static294.aClass375_10, Static89.aClass391_9, Static411.aClass88_3, Static252.aClass280_1, Static340.aClass186_3, Static659.aClass363_3);
		}
		if (Static62.aClass46_17 == Static483.aClass46_23) {
			Static466.anIntArray529 = new int[Static289.aClass275_1.anInt8007];
			Static604.aStringArray31 = new String[Static54.aClass177_1.anInt4833];
			Static620.aBooleanArray33 = new boolean[Static289.aClass275_1.anInt8007];
			for (local8 = 0; local8 < Static289.aClass275_1.anInt8007; local8++) {
				if (Static289.aClass275_1.method6856(local8).anInt5221 == 0) {
					Static620.aBooleanArray33[local8] = true;
					Static667.anInt10662++;
				}
				Static466.anIntArray529[local8] = -1;
			}
			Static59.method1102();
			Static474.anInt7340 = Static656.aClass8_146.method252("loginscreen");
			Static609.anInt9947 = Static656.aClass8_146.method252("lobbyscreen");
			Static187.aClass8_56.method277(false);
			Static365.aClass8_98.method277(true);
			Static624.aClass8_139.method277(true);
			Static466.aClass8_114.method277(true);
			Static390.aClass8_101.method277(true);
			Static656.aClass8_146.method277(true);
			Static307.aClass8_83.anInt268 = 2;
			Static4.aBoolean6 = true;
			Static49.aClass8_13.anInt268 = 2;
			Static593.aClass8_131.anInt268 = 2;
			Static5.aClass8_1.anInt268 = 2;
			Static169.aClass8_53.anInt268 = 2;
			Static112.aClass8_30.anInt268 = 2;
			Static43.aClass8_12.anInt268 = 2;
		}
		if (Static483.aClass46_23 == Static62.aClass46_18) {
			if (!Static506.method7223(Static474.anInt7340)) {
				return 0;
			}
			local157 = true;
			for (local60 = 0; local60 < Static109.aClass321ArrayArray1[Static474.anInt7340].length; local60++) {
				@Pc(1172) Class321 local1172 = Static109.aClass321ArrayArray1[Static474.anInt7340][local60];
				if (local1172.anInt9105 == 5 && local1172.anInt9017 != -1 && !Static624.aClass8_139.method275(0, local1172.anInt9017)) {
					local157 = false;
				}
			}
			if (!local157) {
				return 0;
			}
		}
		if (Static483.aClass46_23 == Static62.aClass46_19) {
			Static412.method6205(true);
		}
		if (Static62.aClass46_20 == Static483.aClass46_23) {
			Static42.aClass252_1.method6252();
			try {
				Static152.aThread3.join();
			} catch (@Pc(1220) InterruptedException local1220) {
				return 0;
			}
			Static42.aClass252_1 = null;
			Static642.anInterface5Array1 = null;
			Static194.aClass344_1 = null;
			Static152.aThread3 = null;
			Static302.aClass8_82 = null;
			Static162.aClass8_51 = null;
			Static147.method2134();
			Static532.aBoolean620 = Static96.aClass6_Sub22_7.aClass29_Sub19_1.method6423() == 1;
			Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub19_1, 1);
			if (Static532.aBoolean620) {
				Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 0);
			} else if (Static96.aClass6_Sub22_7.aClass29_Sub16_1.aBoolean438 && Static296.aClass6_Sub33_1.anInt4998 < 512 && Static296.aClass6_Sub33_1.anInt4998 != 0) {
				Static96.aClass6_Sub22_7.method2358(Static96.aClass6_Sub22_7.aClass29_Sub16_1, 0);
			}
			Static633.method8698();
			if (Static532.aBoolean620) {
				Static646.method8805(0, false);
			} else {
				Static646.method8805(Static96.aClass6_Sub22_7.aClass29_Sub16_1.method5742(), false);
			}
			Static138.method2063(Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277(), false, -1, -1);
			Static306.method4401(Static546.aClass132_13);
			Static84.method1470(Static546.aClass132_13);
			Static373.method5338(Static546.aClass132_13, Static624.aClass8_139);
			Static424.method6292(Static418.aClass9Array125);
		}
		return Static217.method3159();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
	public static void method4973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static292.anInt4921 < arg1 || Static55.anInt4238 > arg0) {
			return;
		}
		@Pc(32) boolean local32;
		if (Static502.anInt8456 > arg3) {
			arg3 = Static502.anInt8456;
			local32 = false;
		} else if (arg3 <= Static153.anInt2554) {
			local32 = true;
		} else {
			arg3 = Static153.anInt2554;
			local32 = false;
		}
		@Pc(57) boolean local57;
		if (arg2 < Static502.anInt8456) {
			arg2 = Static502.anInt8456;
			local57 = false;
		} else if (arg2 <= Static153.anInt2554) {
			local57 = true;
		} else {
			arg2 = Static153.anInt2554;
			local57 = false;
		}
		if (Static55.anInt4238 <= arg1) {
			Static270.method3998(arg4, arg3, arg2, Static173.anIntArrayArray15[arg1++]);
		} else {
			arg1 = Static55.anInt4238;
		}
		if (Static292.anInt4921 < arg0) {
			arg0 = Static292.anInt4921;
		} else {
			Static270.method3998(arg4, arg3, arg2, Static173.anIntArrayArray15[arg0--]);
		}
		@Pc(119) int local119;
		if (local32 && local57) {
			for (local119 = arg1; local119 <= arg0; local119++) {
				@Pc(155) int[] local155 = Static173.anIntArrayArray15[local119];
				local155[arg3] = local155[arg2] = arg4;
			}
		} else if (local32) {
			for (local119 = arg1; local119 <= arg0; local119++) {
				Static173.anIntArrayArray15[local119][arg3] = arg4;
			}
		} else if (local57) {
			for (local119 = arg1; local119 <= arg0; local119++) {
				Static173.anIntArrayArray15[local119][arg2] = arg4;
			}
			return;
		}
	}
}
