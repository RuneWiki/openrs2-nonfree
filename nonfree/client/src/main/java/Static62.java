import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public static int anInt1506;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Lclient!ct;")
	public static Class30 aClass30_14;

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "Lclient!il;")
	public static final Class93 aClass93_8 = new Class93(3, 3);

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "[I")
	public static final int[] anIntArray123 = new int[256];

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)V")
	public static void method1471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg1, 5);
		local13.method3480();
		local13.anInt3727 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	public static void method1473() {
		for (@Pc(6) Class1_Sub41 local6 = (Class1_Sub41) Static117.aClass42_14.method1543(); local6 != null; local6 = (Class1_Sub41) Static117.aClass42_14.method1551()) {
			if (Static105.aClass155ArrayArrayArray3 == null) {
				local6.method6045();
			} else {
				@Pc(28) int local28;
				@Pc(41) Class11_Sub5 local41;
				@Pc(77) Class11_Sub5_Sub2 local77;
				@Pc(255) Class11_Sub4 local255;
				@Pc(218) Class11_Sub1 local218;
				@Pc(112) Class11_Sub2 local112;
				@Pc(291) Class11_Sub4_Sub1 local291;
				@Pc(237) Class11_Sub1_Sub1 local237;
				if (Static51.anInt1301 >= local6.anInt6214) {
					local28 = Static253.anIntArray397[local6.anInt6215];
					if (local28 == 0) {
						local41 = Static342.method5727(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local41 instanceof Class11_Sub5_Sub2) {
							Static149.method2882(local6.anInt6231, local6.anInt6227, local6.anInt6233);
							local77 = (Class11_Sub5_Sub2) local41;
							if (local77.aClass11_Sub5_3 != null) {
								Static92.method1931(local6.anInt6231, local6.anInt6227, local6.anInt6233, local77.aClass11_Sub5_3, null);
							}
						}
					} else if (local28 == 1) {
						local255 = Static74.method1619(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local255 instanceof Class11_Sub4_Sub1) {
							Static136.method4751(local6.anInt6231, local6.anInt6227, local6.anInt6233);
							local291 = (Class11_Sub4_Sub1) local255;
							if (local291.aClass11_Sub4_3 != null) {
								Static279.method4982(local6.anInt6231, local6.anInt6227, local6.anInt6233, local291.aClass11_Sub4_3, null);
							}
						}
					} else if (local28 == 2) {
						local112 = Static138.method2791(local6.anInt6231, local6.anInt6227, local6.anInt6233, jb.class);
						if (local112 instanceof Class11_Sub2_Sub1) {
							Static69.method1568(local6.anInt6231, local6.anInt6227, local6.anInt6233, jb.class);
							@Pc(467) Class11_Sub2_Sub1 local467 = (Class11_Sub2_Sub1) local112;
							if (local467.aClass11_Sub2_1 != null) {
								Static152.method2920(local467.aClass11_Sub2_1, false);
							}
						}
					} else if (local28 == 3) {
						local218 = Static109.method2324(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local218 instanceof Class11_Sub1_Sub1) {
							Static194.method3630(local6.anInt6231, local6.anInt6227, local6.anInt6233);
							local237 = (Class11_Sub1_Sub1) local218;
							if (local237.aClass11_Sub1_1 != null) {
								Static275.method4904(local6.anInt6231, local6.anInt6227, local6.anInt6233, local237.aClass11_Sub1_1);
							}
						}
					}
					local6.method6045();
				} else if (local6.anInt6226 == Static51.anInt1301) {
					local28 = Static253.anIntArray397[local6.anInt6215];
					if (local28 == 0) {
						local41 = Static342.method5727(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local41 instanceof Class11_Sub5_Sub2) {
							local6.method6045();
						} else if (Static150.method4955(local6.anInt6231, local6.anInt6227, local6.anInt6233) == null) {
							local77 = new Class11_Sub5_Sub2(local6.anInt6215, local6.anInt6232, local6.anInt6230, local6.anInt6211, local6.anInt6210, local41);
							Static92.method1931(local6.anInt6231, local6.anInt6227, local6.anInt6233, local77, null);
						} else {
							local6.method6045();
						}
					} else if (local28 == 1) {
						local255 = Static74.method1619(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local255 instanceof Class11_Sub4_Sub1) {
							local6.method6045();
						} else if (Static242.method4518(local6.anInt6231, local6.anInt6227, local6.anInt6233) == null) {
							local291 = new Class11_Sub4_Sub1(local6.anInt6215, local6.anInt6232, local6.anInt6230, local6.anInt6211, local6.anInt6210, local255);
							Static279.method4982(local6.anInt6231, local6.anInt6227, local6.anInt6233, local291, null);
						} else {
							local6.method6045();
						}
					} else if (local28 == 2) {
						local112 = Static138.method2791(local6.anInt6231, local6.anInt6227, local6.anInt6233, jb.class);
						if (local112 instanceof Class11_Sub2_Sub1) {
							local6.method6045();
						} else {
							Static69.method1568(local6.anInt6231, local6.anInt6227, local6.anInt6233, jb.class);
							@Pc(140) Class71 local140 = Static219.method4081(local6.anInt6223);
							@Pc(158) int local158;
							@Pc(155) int local155;
							if (local6.anInt6232 == 1 || local6.anInt6232 == 3) {
								local155 = local140.anInt2411;
								local158 = local140.anInt2376;
							} else {
								local158 = local140.anInt2411;
								local155 = local140.anInt2376;
							}
							@Pc(201) Class11_Sub2_Sub1 local201 = new Class11_Sub2_Sub1(local6.anInt6215, local6.anInt6232, local6.anInt6231, local6.anInt6230, local6.anInt6211, local6.anInt6210, local6.anInt6227, local6.anInt6227 + local158 - 1, local6.anInt6233, local6.anInt6233 + local155 - 1, local112);
							Static152.method2920(local201, false);
						}
					} else if (local28 == 3) {
						local218 = Static109.method2324(local6.anInt6231, local6.anInt6227, local6.anInt6233);
						if (local218 instanceof Class11_Sub1_Sub1) {
							local6.method6045();
						} else {
							local237 = new Class11_Sub1_Sub1(local6.anInt6230, local6.anInt6211, local6.anInt6210, local218);
							Static275.method4904(local6.anInt6231, local6.anInt6227, local6.anInt6233, local237);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	public static void method1476() {
		Static236.method4375(Static72.anInt1645);
		@Pc(17) int local17 = (Static14.anInt4971 >> 10) + (Static50.anInt1271 >> 3);
		@Pc(26) int local26 = (Static260.anInt5192 >> 10) + (Static299.anInt4036 >> 3);
		Static284.anInt6477 = Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 = 0;
		Static191.aClass11_Sub2_Sub6_Sub1_4.method5860(8, 8);
		Static290.anIntArray446 = new int[18];
		Static180.anIntArray280 = new int[18];
		Static359.aByteArrayArray20 = new byte[18][];
		Static232.anIntArrayArray47 = new int[18][4];
		Static42.aByteArrayArray2 = new byte[18][];
		Static112.anIntArray187 = new int[18];
		Static37.anIntArray60 = new int[18];
		Static200.anIntArray311 = new int[18];
		Static3.anIntArray7 = new int[18];
		Static258.aByteArrayArray4 = new byte[18][];
		Static355.aByteArrayArray19 = new byte[18][];
		Static349.aByteArrayArray18 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(97) int local97;
		for (@Pc(86) int local86 = (local17 - (Static311.anInt5653 >> 4)) / 8; local86 <= ((Static311.anInt5653 >> 4) + local17) / 8; local86++) {
			for (local97 = (local26 - (Static189.anInt3820 >> 4)) / 8; local97 <= ((Static189.anInt3820 >> 4) + local26) / 8; local97++) {
				@Pc(105) int local105 = local97 + (local86 << 8);
				Static37.anIntArray60[local77] = local105;
				Static200.anIntArray311[local77] = Static166.aClass30_53.method1153("m" + local86 + "_" + local97);
				Static290.anIntArray446[local77] = Static166.aClass30_53.method1153("l" + local86 + "_" + local97);
				Static3.anIntArray7[local77] = Static166.aClass30_53.method1153("n" + local86 + "_" + local97);
				Static180.anIntArray280[local77] = Static166.aClass30_53.method1153("um" + local86 + "_" + local97);
				Static112.anIntArray187[local77] = Static166.aClass30_53.method1153("ul" + local86 + "_" + local97);
				if (Static3.anIntArray7[local77] == -1) {
					Static200.anIntArray311[local77] = -1;
					Static290.anIntArray446[local77] = -1;
					Static180.anIntArray280[local77] = -1;
					Static112.anIntArray187[local77] = -1;
				}
				local77++;
			}
		}
		for (local97 = local77; local97 < Static3.anIntArray7.length; local97++) {
			Static3.anIntArray7[local97] = -1;
			Static200.anIntArray311[local97] = -1;
			Static290.anIntArray446[local97] = -1;
			Static180.anIntArray280[local97] = -1;
			Static112.anIntArray187[local97] = -1;
		}
		Static231.method4294(false, true, local17, local26);
	}
}
