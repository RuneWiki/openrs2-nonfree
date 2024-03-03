import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	public static int anInt6754;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt6757;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qg;BI)V", line = 21)
	public static void method6055(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		Class2_Sub2_Sub7.aBoolean173 = false;
		Class218.anInt6067 = 0;
		Static1.method5(arg0);
		Static241.method6253(arg0);
		if (Class2_Sub2_Sub7.aBoolean173) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt5289 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5289 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wm;I)V", line = 47)
	public static void method6056(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = Static282.anInt5731;
		@Pc(9) int local9 = Static338.anInt6788;
		@Pc(11) int local11 = Static100.anInt2217;
		@Pc(13) int local13 = Static327.anInt6507;
		arg0.method2870(local13, local7, local9, -10660793, local11);
		arg0.method2870(16, local7 + 1, local9 + 1, -16777216, local11 - 2);
		arg0.method2839(local9 + 18, local7 - -1, local13 - 19, -16777216, -2 + local11);
		Static49.aClass130_1.method5898(local7 + 3, -1, local9 + 14, -10660793, Class124.aClass79_74.method2269(Class197.anInt5569));
		@Pc(72) int local72 = Static210.aClass119_1.method3305();
		@Pc(76) int local76 = Static210.aClass119_1.method3314();
		@Pc(78) int local78 = 0;
		for (@Pc(88) Class2_Sub5 local88 = (Class2_Sub5) Class92.aClass135_19.method3552(); local88 != null; local88 = (Class2_Sub5) Class92.aClass135_19.method3553()) {
			@Pc(102) int local102 = (Class2_Sub3_Sub24.anInt4949 - local78 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local72 > local7 && local7 + local11 > local72 && local76 > local102 - 13 && local76 < local102 + 3 && local88.aBoolean83) {
				local104 = -256;
			}
			@Pc(138) int[] local138 = null;
			if (Static275.method2427(local88.anInt1004)) {
				local138 = Static290.aClass107_2.method2761((int) local88.aLong30).anIntArray364;
			} else if (local88.anInt1007 != -1) {
				local138 = Static290.aClass107_2.method2761(local88.anInt1007).anIntArray364;
			} else if (Static274.method5112(local88.anInt1004)) {
				@Pc(166) Class11_Sub5_Sub2_Sub2 local166 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[(int) local88.aLong30];
				if (local166 != null) {
					@Pc(171) Class71 local171 = local166.aClass71_1;
					if (local171.anIntArray129 != null) {
						local171 = local171.method2095(Static199.aClass226_1);
					}
					if (local171 != null) {
						local138 = local171.anIntArray131;
					}
				}
			} else if (Static224.method4191(local88.anInt1004)) {
				@Pc(207) Class41 local207;
				if (local88.anInt1004 == 1010) {
					local207 = Static334.aClass202_4.method5164((int) local88.aLong30);
				} else {
					local207 = Static334.aClass202_4.method5164((int) (local88.aLong30 >>> 32 & 0x7FFFFFFFL));
				}
				if (local207.anIntArray94 != null) {
					local207 = local207.method1535(Static199.aClass226_1);
				}
				if (local207 != null) {
					local138 = local207.anIntArray96;
				}
			}
			@Pc(241) String local241 = Static295.method5422(local88);
			if (local138 != null) {
				local241 = local241 + Static149.method2940(local138);
			}
			Static49.aClass130_1.method5902(Static68.anIntArray114, Static125.aClass13Array12, local7 + 3, local241, local102, local104);
			if (local88.aBoolean82) {
				Static112.aClass13_7.method6386(local7 + Static106.aClass239_2.method6127(local241) + 5, local102 + -12);
			}
			local78++;
		}
		Static139.method2712(Static338.anInt6788, Static282.anInt5731, Static327.anInt6507, Static100.anInt2217);
	}
}
