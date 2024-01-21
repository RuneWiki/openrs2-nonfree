import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ig", name = "Xb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_19;

	@OriginalMember(owner = "client!ig", name = "Yb", descriptor = "I")
	public static int anInt2021;

	@OriginalMember(owner = "client!ig", name = "Bb", descriptor = "Lclient!wh;")
	public static Class99 aClass99_5 = new Class99(512);

	@OriginalMember(owner = "client!ig", name = "Jb", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!ig", name = "Nb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1215 = Static118.method2249("Sorry invited players only)3");

	@OriginalMember(owner = "client!ig", name = "Ob", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1216 = Static118.method2249("");

	@OriginalMember(owner = "client!ig", name = "Rb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[128];

	@OriginalMember(owner = "client!ig", name = "Tb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1217 = aClass65_1215;

	@OriginalMember(owner = "client!ig", name = "Wb", descriptor = "Lclient!pa;")
	public static final Class1_Sub2_Sub19 aClass1_Sub2_Sub19_1 = new Class1_Sub2_Sub19();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III[[[I)V")
	public static void method1424(@OriginalArg(3) int[][][] arg0) {
		Static100.anInt2522 = 4;
		Static201.anInt3978 = 104;
		Static198.anInt4264 = 104;
		Static83.aClass1_Sub7ArrayArrayArray1 = new Class1_Sub7[4][104][104];
		Static191.anIntArrayArrayArray8 = new int[4][105][105];
		Static206.anIntArrayArrayArray10 = arg0;
		Static197.method3215();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!oc;)V")
	public static void method1429(@OriginalArg(1) Class65 arg0) {
		if (Static129.anInt3184 >= 2) {
			@Pc(15) int local15;
			@Pc(34) int local34;
			if (arg0.method2489(Static74.aClass65_1117)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(25) Runtime local25 = Runtime.getRuntime();
				local34 = (int) ((local25.totalMemory() - local25.freeMemory()) / 1024L);
				Static31.method603(0, null, Static109.method2004(new Class65[] { Static58.aClass65_950, Static118.method2250(local34), Static45.aClass65_725 }));
			}
			if (arg0.method2489(Static156.aClass65_2076)) {
				Static16.method304();
			}
			if (arg0.method2489(Static121.aClass65_1715)) {
				Static172.aBoolean154 = true;
			}
			if (arg0.method2489(Static122.aClass65_1993)) {
				Static172.aBoolean154 = false;
			}
			arg0.method2489(Static180.aClass65_2318);
			arg0.method2489(Static23.aClass65_508);
			if (arg0.method2489(Static12.aClass65_230)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(97) int local97 = 1; local97 < 103; local97++) {
						for (local34 = 1; local34 < 103; local34++) {
							Static83.aClass57Array1[local15].anIntArrayArray23[local97][local34] = 0;
						}
					}
				}
			}
			if (arg0.method2472(Static4.aClass65_53) && Static99.anInt2495 != 0) {
				Static84.method1456(arg0.method2483(6).method2454());
			}
			if (arg0.method2489(Static58.aClass65_951) && Static99.anInt2495 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method2472(Static162.aClass65_2176)) {
				Static148.anInt3489 = arg0.method2483(12).method2466().method2454();
				Static31.method603(0, null, Static109.method2004(new Class65[] { Static120.aClass65_1713, Static118.method2250(Static148.anInt3489) }));
			}
			if (arg0.method2489(Static90.aClass65_2588)) {
				Static8.aBoolean9 = true;
			}
		}
		Static45.aClass1_Sub14_Sub1_8.method1761(93);
		Static45.aClass1_Sub14_Sub1_8.method1710(arg0.method2482() - 1);
		Static45.aClass1_Sub14_Sub1_8.method1742(arg0.method2483(2));
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg3 - arg0;
		@Pc(12) int local12 = arg5 - arg4;
		@Pc(21) int local21 = (arg7 - arg6 << 16) / local7;
		@Pc(37) boolean local37;
		if (Static148.anInt3490 > 0 && Static148.anInt3490 % 10 < 5) {
			local37 = true;
		} else {
			local37 = false;
		}
		@Pc(49) int local49 = (arg1 - arg2 << 16) / local12;
		@Pc(60) int local60;
		@Pc(71) int local71;
		@Pc(94) int local94;
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(149) int local149;
		@Pc(155) int local155;
		for (@Pc(51) int local51 = 0; local51 < local7; local51++) {
			local60 = (local51 + 1) * local21 >> 16;
			@Pc(66) int local66 = local21 * local51 >> 16;
			local71 = local60 - local66;
			if (local71 > 0) {
				@Pc(88) int[][] local88 = Static154.anIntArrayArrayArray6[arg0 + local51 >> 6];
				local66 += arg6;
				for (local94 = 0; local94 < local12; local94++) {
					local101 = local94 * local49 >> 16;
					local109 = (local94 + 1) * local49 >> 16;
					@Pc(114) int local114 = local109 - local101;
					if (local114 > 0) {
						@Pc(122) int local122 = arg4 + local94 >> 6;
						local101 += arg2;
						if (local88[local122] != null) {
							local149 = (local51 + arg0 & 0x3F) + ((local94 + arg4 & 0x3F) << 6);
							local155 = local88[local122][local149];
							if (local155 != 0) {
								@Pc(166) Class1_Sub2_Sub13 local166 = Static5.method65(local155 - 1);
								if (local37 && local166.anInt1997 == Static39.anInt1069) {
									@Pc(180) Class1_Sub16 local180 = new Class1_Sub16();
									local180.anInt2531 = local66;
									local180.anInt2528 = local101;
									local180.anInt2532 = local166.anInt1997;
									Static64.aClass91_2.method3151(local180);
								}
								Static168.aClass1_Sub2_Sub5_Sub3Array9[local166.anInt1997].method1315(local66 - 7, local101 - 7);
							}
						}
					}
				}
			}
		}
		if (Static164.aDouble11 == Static119.aDouble9) {
			for (@Pc(230) Class1_Sub10 local230 = (Class1_Sub10) Static182.aClass91_21.method3148(); local230 != null; local230 = (Class1_Sub10) Static182.aClass91_21.method3150()) {
				local71 = local230.anInt1862;
				local71 = Static25.anInt737 + Static33.anInt974 - local71;
				local94 = arg2 + (arg1 - arg2) * (local71 - arg4) / (arg5 - arg4);
				local101 = local230.anInt1867;
				@Pc(263) Class1_Sub2_Sub5_Sub5 local263 = null;
				if (local101 == 0) {
					if (Static164.aDouble11 == 3.0D) {
						local263 = Static77.aClass1_Sub2_Sub5_Sub5_6;
					}
					if (Static164.aDouble11 == 4.0D) {
						local263 = Static204.aClass1_Sub2_Sub5_Sub5_9;
					}
					if (Static164.aDouble11 == 6.0D) {
						local263 = Static105.aClass1_Sub2_Sub5_Sub5_7;
					}
					if (Static164.aDouble11 == 8.0D) {
						local263 = Static39.aClass1_Sub2_Sub5_Sub5_2;
					}
				}
				local109 = 16777215;
				local60 = local230.anInt1865;
				if (local101 == 1) {
					if (Static164.aDouble11 == 3.0D) {
						local263 = Static105.aClass1_Sub2_Sub5_Sub5_7;
					}
					if (Static164.aDouble11 == 4.0D) {
						local263 = Static39.aClass1_Sub2_Sub5_Sub5_2;
					}
					if (Static164.aDouble11 == 6.0D) {
						local263 = Static50.aClass1_Sub2_Sub5_Sub5_4;
					}
					if (Static164.aDouble11 == 8.0D) {
						local263 = Static133.aClass1_Sub2_Sub5_Sub5_8;
					}
				}
				local60 -= Static57.anInt1532;
				@Pc(343) int local343 = (arg7 - arg6) * (local60 - arg0) / (arg3 - arg0) + arg6;
				if (local101 == 2) {
					if (Static164.aDouble11 == 3.0D) {
						local263 = Static50.aClass1_Sub2_Sub5_Sub5_4;
					}
					if (Static164.aDouble11 == 4.0D) {
						local263 = Static133.aClass1_Sub2_Sub5_Sub5_8;
					}
					if (Static164.aDouble11 == 6.0D) {
						local263 = Static60.aClass1_Sub2_Sub5_Sub5_5;
					}
					if (Static164.aDouble11 == 8.0D) {
						local263 = Static20.aClass1_Sub2_Sub5_Sub5_1;
					}
					local109 = 16755200;
				}
				if (local263 != null) {
					@Pc(377) Class65[] local377 = local230.aClass65Array24;
					local149 = local377.length;
					local94 -= local263.method3119() * (local149 - 1) / 2;
					local94 += local263.method3122() / 2;
					for (local155 = 0; local155 < local149; local155++) {
						local263.method3123(local377[local155], local343, local94, local109);
						local94 += local263.method3119();
					}
				}
			}
		}
		for (@Pc(435) Class1_Sub16 local435 = (Class1_Sub16) Static64.aClass91_2.method3148(); local435 != null; local435 = (Class1_Sub16) Static64.aClass91_2.method3150()) {
			Static168.aClass1_Sub2_Sub5_Sub3Array9[local435.anInt2532].method1315(local435.anInt2531 - 7, local435.anInt2528 - 7);
			Static194.method3112(local435.anInt2531, local435.anInt2528, 15, 16776960, 128);
			Static194.method3112(local435.anInt2531, local435.anInt2528, 7, 16777215, 256);
		}
		Static64.aClass91_2.method3147();
	}
}
