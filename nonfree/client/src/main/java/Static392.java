import jagex3.jagmisc.jagmisc;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!lw", name = "T", descriptor = "Lclient!kw;")
	public static Class178 aClass178_12;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIZI)V")
	public static void method5315(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static221.method3276(arg0)) {
			Static62.method1416(Static172.aClass270ArrayArray2[arg0], arg2, arg3, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)I")
	public static int method5316() {
		@Pc(8) int local8;
		if (Static580.aClass3_Sub22_24.aClass21_Sub20_1.method5715() == 0) {
			for (local8 = 0; local8 < Static303.anInt4880; local8++) {
				if (Static708.anInterface26Array2[local8].method5026() == 's' || Static708.anInterface26Array2[local8].method5026() == 'S') {
					Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub20_1);
					Static533.aBoolean558 = true;
					break;
				}
			}
		}
		@Pc(68) int local68;
		if (Static572.aClass331_3 == Static351.aClass331_1) {
			@Pc(59) Runtime local59 = Runtime.getRuntime();
			local68 = (int) ((local59.totalMemory() - local59.freeMemory()) / 1024L);
			@Pc(71) long local71 = Static517.method6965();
			if (Static304.aLong161 == 0L) {
				Static304.aLong161 = local71;
			}
			if (local68 > 16384 && local71 - Static304.aLong161 < 5000L) {
				if (local71 - Static611.aLong304 > 1000L) {
					System.gc();
					Static611.aLong304 = local71;
				}
				return 0;
			}
		}
		if (Static572.aClass331_4 == Static351.aClass331_1) {
			if (Static100.aClass33_1 == null) {
				Static100.aClass33_1 = new Class33(Static294.aClass349_3, Static717.aClass176_3, Static553.aBigInteger6, Static396.aBigInteger4);
			}
			if (!Static100.aClass33_1.method1148()) {
				return 0;
			}
			Static170.method2738((String) null, true, 0);
			Static185.aBoolean202 = !Static280.method3951();
			Static216.aClass182_58 = Static134.method2375(Static185.aBoolean202 ? 34 : 32, 1, false);
			Static423.aClass182_87 = Static134.method2375(33, 1, false);
			Static652.aClass182_33 = Static134.method2375(13, 1, false);
		}
		@Pc(175) boolean local175;
		if (Static351.aClass331_1 == Static572.aClass331_5) {
			local175 = Static423.aClass182_87.method3959();
			local68 = Static384.aClass102_Sub1Array2[33].method2521();
			local68 += Static384.aClass102_Sub1Array2[Static185.aBoolean202 ? 34 : 32].method2521();
			local68 += Static384.aClass102_Sub1Array2[13].method2521();
			local68 += local175 ? 100 : Static423.aClass182_87.method3983();
			if (local68 != 400) {
				return local68 / 4;
			}
			Static606.anInt9197 = Static216.aClass182_58.method3980();
			Static206.anInt3921 = Static423.aClass182_87.method3980();
			Static669.method8761(Static216.aClass182_58);
			@Pc(239) int local239 = Static580.aClass3_Sub22_24.aClass21_Sub17_1.method5418();
			Static173.aClass366_2 = new Class366(Static346.aClass309_6, Static456.anInt7118, Static423.aClass182_87);
			@Pc(251) int[] local251 = Static173.aClass366_2.method8421(local239);
			if (local251.length == 0) {
				local251 = Static173.aClass366_2.method8421(0);
			}
			@Pc(268) Class119 local268 = new Class119(Static216.aClass182_58, Static652.aClass182_33);
			if (local251.length > 0) {
				Static653.anInterface24Array1 = new Interface24[local251.length];
				for (@Pc(277) int local277 = 0; local277 < Static653.anInterface24Array1.length; local277++) {
					Static653.anInterface24Array1[local277] = new Class255(Static173.aClass366_2.method8422(local251[local277]), local268);
				}
			}
		}
		if (Static351.aClass331_1 == Static572.aClass331_6) {
			Static592.method7645(Static700.method9281(), Static652.aClass182_33, Static216.aClass182_58);
		}
		if (Static351.aClass331_1 == Static572.aClass331_7) {
			local8 = Static458.method5834();
			local68 = Static35.method1114();
			if (local8 < local68) {
				return local8 * 100 / local68;
			}
		}
		if (Static572.aClass331_8 == Static351.aClass331_1) {
			if (Static653.anInterface24Array1 != null && Static653.anInterface24Array1.length > 0) {
				if (Static653.anInterface24Array1[0].method7124() < 100) {
					return 0;
				}
				if (Static653.anInterface24Array1.length > 1 && Static173.aClass366_2.method8417() && Static653.anInterface24Array1[1].method7124() < 100) {
					return 0;
				}
			}
			Static385.method5210(Static153.aClass22_4);
			Static43.method1172(Static153.aClass22_4);
			Static336.method4832(1);
		}
		if (Static351.aClass331_1 == Static572.aClass331_9) {
			for (local8 = 0; local8 < 4; local8++) {
				Static455.aClass109Array1[local8] = Static390.method5301(Static497.anInt7926, Static646.anInt9979);
			}
		}
		if (Static351.aClass331_1 == Static572.aClass331_10) {
			Static218.aClass182_59 = Static134.method2375(8, 1, false);
			Static198.aClass182_52 = Static134.method2375(0, 1, false);
			Static210.aClass182_57 = Static134.method2375(1, 1, false);
			Static546.aClass182_105 = Static134.method2375(2, 1, false);
			Static253.aClass182_67 = Static134.method2375(3, 1, false);
			Static692.aClass182_126 = Static134.method2375(4, 1, false);
			Static699.aClass182_127 = Static134.method2375(5, 1, true);
			Static185.aClass182_50 = Static134.method2375(6, 1, true);
			Static299.aClass182_75 = Static134.method2375(7, 1, false);
			Static675.aClass182_124 = Static134.method2375(9, 1, false);
			Static115.aClass182_34 = Static134.method2375(10, 1, false);
			Static372.aClass182_80 = Static134.method2375(11, 1, false);
			Static259.aClass182_68 = Static134.method2375(12, 1, false);
			Static388.aClass182_81 = Static134.method2375(14, 1, false);
			Static5.aClass182_1 = Static134.method2375(15, 1, false);
			Static153.aClass182_40 = Static134.method2375(16, 1, false);
			Static677.aClass182_125 = Static134.method2375(17, 1, false);
			Static120.aClass182_35 = Static134.method2375(18, 1, false);
			Static137.aClass182_36 = Static134.method2375(19, 1, false);
			Static236.aClass182_63 = Static134.method2375(20, 1, false);
			Static210.aClass182_56 = Static134.method2375(21, 1, false);
			Static555.aClass182_97 = Static134.method2375(22, 1, false);
			Static196.aClass182_65 = Static134.method2375(23, 1, true);
			Static62.aClass182_13 = Static134.method2375(24, 1, false);
			Static425.aClass182_88 = Static134.method2375(25, 1, false);
			Static433.aClass182_89 = Static134.method2375(26, 1, true);
			Static141.aClass182_37 = Static134.method2375(27, 1, false);
			Static86.aClass182_20 = Static134.method2375(28, 1, true);
			Static259.aClass182_69 = Static134.method2375(29, 1, false);
			Static160.aClass182_41 = Static134.method2375(35, 1, true);
			Static654.aClass182_121 = Static134.method2375(30, 1, true);
			Static58.aClass182_12 = Static134.method2375(31, 1, true);
			Static57.aClass182_11 = Static134.method2375(36, 2, true);
		}
		if (Static572.aClass331_11 == Static351.aClass331_1) {
			local8 = 0;
			for (local68 = 0; local68 < 37; local68++) {
				if (Static384.aClass102_Sub1Array2[local68] != null) {
					local8 += Static384.aClass102_Sub1Array2[local68].method2521() * Static667.anIntArray750[local68] / 100;
				}
			}
			if (local8 != 100) {
				if (Static468.anInt7365 < 0) {
					Static468.anInt7365 = local8;
				}
				return (local8 - Static468.anInt7365) * 100 / (100 - Static468.anInt7365);
			}
			Static461.method6258(Static218.aClass182_59);
			Static592.method7645(Static700.method9281(), Static652.aClass182_33, Static218.aClass182_59);
		}
		if (Static572.aClass331_12 == Static351.aClass331_1) {
			@Pc(699) byte[] local699 = Static86.aClass182_20.method3961(4);
			if (local699 == null) {
				return 0;
			}
			Static203.method3090(local699);
			Static303.method4484();
			Static336.method4832(2);
		}
		if (Static351.aClass331_1 == Static572.aClass331_13) {
			Static526.method7027(Static122.aClass47_1, Static654.aClass182_121);
		}
		if (Static572.aClass331_14 == Static351.aClass331_1) {
			local8 = Static491.method6649();
			if (local8 < 100) {
				return local8;
			}
			Static122.method2276(Static86.aClass182_20.method3961(1));
			Static29.aClass378_1 = new Class378(Static86.aClass182_20);
			Static304.aShortArrayArray1 = Static29.aClass378_1.aShortArrayArray5;
			Static596.aShortArrayArrayArray1 = Static29.aClass378_1.aShortArrayArrayArray2;
			Static257.aClass124_2 = new Class124(Static86.aClass182_20);
		}
		if (Static572.aClass331_15 == Static351.aClass331_1) {
			if (Static29.aClass378_1.anInt10088 != -1 && !Static299.aClass182_75.method3986(Static29.aClass378_1.anInt10088, 0)) {
				return 99;
			}
			Static240.anInterface4_11 = new Class260(Static433.aClass182_89, Static675.aClass182_124, Static218.aClass182_59);
			Static583.aClass150_2 = new Class150(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static288.aClass97_1 = new Class97(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static257.aClass124_2);
			Static608.aClass370_1 = new Class370(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static218.aClass182_59);
			Static298.aClass322_1 = new Class322(Static346.aClass309_6, Static456.anInt7118, Static677.aClass182_125);
			Static87.aClass286_3 = new Class286(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static461.aClass143_4 = new Class143(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static346.aClass295_1 = new Class295(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static218.aClass182_59);
			Static661.aClass73_1 = new Class73(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static299.aClass182_75);
			Static614.aClass51_1 = new Class51(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static242.aClass205_1 = new Class205(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static216.aClass53_3 = new Class53(Static346.aClass309_6, Static456.anInt7118, true, Static153.aClass182_40, Static299.aClass182_75);
			Static47.aClass111_3 = new Class111(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static218.aClass182_59);
			Static139.aClass68_3 = new Class68(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105, Static218.aClass182_59);
			Static255.aClass14_1 = new Class14(Static346.aClass309_6, Static456.anInt7118, true, Static120.aClass182_35, Static299.aClass182_75);
			Static606.aClass62_2 = new Class62(Static346.aClass309_6, Static456.anInt7118, true, Static583.aClass150_2, Static137.aClass182_36, Static299.aClass182_75);
			Static642.aClass358_1 = new Class358(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static592.aClass155_2 = new Class155(Static346.aClass309_6, Static456.anInt7118, Static236.aClass182_63, Static198.aClass182_52, Static210.aClass182_57);
			Class3_Sub33_Sub3.lb = new Class302(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static499.aClass297_1 = new Class297(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static381.aClass106_2 = new Class106(Static346.aClass309_6, Static456.anInt7118, Static210.aClass182_56, Static299.aClass182_75);
			Static291.aClass251_1 = new Class251(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static711.aClass326_2 = new Class326(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static95.aClass282_1 = new Class282(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static90.aClass98_3 = new Class98(Static346.aClass309_6, Static456.anInt7118, Static555.aClass182_97);
			Static266.aClass161_1 = new Class161(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static118.aClass17_1 = new Class17(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static368.aClass67_1 = new Class67(Static346.aClass309_6, Static456.anInt7118, Static546.aClass182_105);
			Static474.method6450(Static299.aClass182_75, Static218.aClass182_59, Static652.aClass182_33, Static253.aClass182_67);
			Static65.method7396(Static259.aClass182_69);
			Static521.aClass249_1 = new Class249(Static456.anInt7118, Static62.aClass182_13, Static425.aClass182_88);
			Static134.aClass246_1 = new Class246(Static456.anInt7118, Static62.aClass182_13, Static425.aClass182_88, new Class128());
			Static171.method7423();
			Static216.aClass53_3.method1521(Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 0);
			Static380.aClass127_1 = new Class127();
			Static585.method7560();
			Static117.method2218(Static592.aClass155_2);
			Static338.method4845(32, Static141.aClass182_37);
			Static48.method1240(Static299.aClass182_75, Static240.anInterface4_11);
			@Pc(1059) Class403 local1059 = new Class403(Static115.aClass182_34.method3958("", "huffman"));
			Static604.method7760(local1059);
			try {
				jagmisc.init();
			} catch (@Pc(1066) Throwable local1066) {
			}
			Static477.aClass87_1 = Static9.method256();
			Static12.aClass3_Sub39_12 = new Class3_Sub39(true, Static122.aClass47_1);
		}
		if (Static351.aClass331_1 == Static572.aClass331_17) {
			local8 = Static33.method1090(Static218.aClass182_59) + Static231.method3374(true);
			local68 = Static170.method2737() + Static35.method1114();
			if (local8 < local68) {
				return local8 * 100 / local68;
			}
		}
		if (Static572.aClass331_18 == Static351.aClass331_1) {
			Static327.method1013(Static196.aClass182_65, Static87.aClass286_3, Static461.aClass143_4, Static216.aClass53_3, Static47.aClass111_3, Static139.aClass68_3, Static380.aClass127_1);
		}
		if (Static351.aClass331_1 == Static572.aClass331_19) {
			Static115.aStringArray8 = new String[Static711.aClass326_2.anInt8593];
			Static317.aBooleanArray10 = new boolean[Static95.aClass282_1.anInt7535];
			Static227.anIntArray269 = new int[Static95.aClass282_1.anInt7535];
			for (local8 = 0; local8 < Static95.aClass282_1.anInt7535; local8++) {
				if (Static95.aClass282_1.method6510(local8).anInt9702 == 0) {
					Static317.aBooleanArray10[local8] = true;
					Static209.anInt3450++;
				}
				Static227.anIntArray269[local8] = -1;
			}
			Static468.method6367();
			Static699.aClass182_127.method3965(false);
			Static185.aClass182_50.method3965(true);
			Static218.aClass182_59.method3965(true);
			Static652.aClass182_33.method3965(true);
			Static115.aClass182_34.method3965(true);
			Static546.aClass182_105.anInt4310 = 2;
			Static484.aBoolean511 = true;
			Static677.aClass182_125.anInt4310 = 2;
			Static153.aClass182_40.anInt4310 = 2;
			Static120.aClass182_35.anInt4310 = 2;
			Static137.aClass182_36.anInt4310 = 2;
			Static236.aClass182_63.anInt4310 = 2;
			Static210.aClass182_56.anInt4310 = 2;
		}
		if (Static572.aClass331_20 == Static351.aClass331_1) {
			if (!Static221.method3276(Static29.aClass378_1.anInt10093)) {
				return 0;
			}
			local175 = true;
			for (local68 = 0; local68 < Static172.aClass270ArrayArray2[Static29.aClass378_1.anInt10093].length; local68++) {
				@Pc(1260) Class270 local1260 = Static172.aClass270ArrayArray2[Static29.aClass378_1.anInt10093][local68];
				if (local1260.anInt7008 == 5 && local1260.anInt7040 != -1 && !Static218.aClass182_59.method3986(local1260.anInt7040, 0)) {
					local175 = false;
				}
			}
			if (!local175) {
				return 0;
			}
		}
		if (Static572.aClass331_21 == Static351.aClass331_1) {
			Static724.method9566(true);
		}
		if (Static572.aClass331_22 == Static351.aClass331_1) {
			Static397.aClass325_1.method7278();
			try {
				Static503.aThread6.join();
			} catch (@Pc(1315) InterruptedException local1315) {
				return 0;
			}
			Static423.aClass182_87 = null;
			Static653.anInterface24Array1 = null;
			Static397.aClass325_1 = null;
			Static216.aClass182_58 = null;
			Static173.aClass366_2 = null;
			Static503.aThread6 = null;
			Static204.method3095();
			Static498.aBoolean532 = Static580.aClass3_Sub22_24.aClass21_Sub20_1.method5715() == 1;
			Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub20_1);
			if (Static498.aBoolean532) {
				Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
			} else if (Static580.aClass3_Sub22_24.aClass21_Sub28_1.aBoolean677 && Static12.aClass3_Sub39_12.anInt5861 < 512 && Static12.aClass3_Sub39_12.anInt5861 != 0) {
				Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
			}
			Static124.method2284();
			if (Static498.aBoolean532) {
				Static36.method1127(false, 0);
			} else {
				Static36.method1127(false, Static580.aClass3_Sub22_24.aClass21_Sub28_1.method8620());
			}
			Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
			Static385.method5210(Static153.aClass22_4);
			Static43.method1172(Static153.aClass22_4);
			Static431.method5716(Static153.aClass22_4, Static218.aClass182_59);
			Static54.method1301(Static212.aClass178Array8, -128);
		}
		return Static580.method5882();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!br;ILjava/awt/Frame;)V")
	public static void method5317(@OriginalArg(0) Class47 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class338 local6 = arg0.method1400(arg1);
			while (local6.anInt8934 == 0) {
				Static550.method7219(10L);
			}
			if (local6.anInt8934 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static550.method7219(100L);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!kt;B)V")
	public static void method5318(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0) {
		if (arg0.anIntArray640 == null && arg0.anIntArray642 == null) {
			return;
		}
		@Pc(22) boolean local22 = true;
		for (@Pc(24) int local24 = 0; local24 < arg0.anIntArray640.length; local24++) {
			@Pc(30) int local30 = -1;
			if (arg0.anIntArray640 != null) {
				local30 = arg0.anIntArray640[local24];
			}
			if (local30 != -1) {
				local22 = false;
				@Pc(85) int local85;
				@Pc(101) int local101;
				@Pc(69) int local69;
				if ((-1073741824 & local30) == -1073741824) {
					local69 = local30 & 0xFFFFFFF;
					@Pc(73) int local73 = local69 >> 14;
					local85 = arg0.anInt10694 - (local73 - Static291.anInt4448) * 512 - 256;
					@Pc(89) int local89 = local69 & 0x3FFF;
					local101 = arg0.anInt10695 - (local89 - Static189.anInt3243) * 512 - 256;
				} else if ((local30 & 0x8000) == 0) {
					@Pc(118) Class3_Sub52 local118 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local30);
					if (local118 == null) {
						arg0.method7496(-1, local24);
						continue;
					}
					@Pc(123) Class9_Sub1_Sub1_Sub2_Sub2 local123 = local118.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					local101 = arg0.anInt10695 - local123.anInt10695;
					local85 = arg0.anInt10694 - local123.anInt10694;
				} else {
					local69 = local30 & 0x7FFF;
					@Pc(157) Class9_Sub1_Sub1_Sub2_Sub1 local157 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local69];
					if (local157 == null) {
						arg0.method7496(-1, local24);
						continue;
					}
					local85 = arg0.anInt10694 - local157.anInt10694;
					local101 = arg0.anInt10695 - local157.anInt10695;
				}
				if (local85 != 0 || local101 != 0) {
					arg0.method7496((int) (Math.atan2((double) local85, (double) local101) * 2607.5945876176133D) & 0x3FFF, local24);
				}
			} else if (!arg0.method7496(-1, local24)) {
				local22 = false;
			}
		}
		if (local22) {
			arg0.anIntArray640 = null;
			arg0.anIntArray642 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZD)V")
	public static void method5321(@OriginalArg(1) double arg0) {
		if (arg0 == Static220.aDouble2) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(21) int local21 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static637.anIntArray647[local7] = local21 > 255 ? 255 : local21;
		}
		Static220.aDouble2 = arg0;
	}
}
