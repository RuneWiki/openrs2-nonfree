import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "[I")
	public static final int[] anIntArray302 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([[SB[[F)[[S")
	public static short[][] method3683(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < arg0[local14].length; local18++) {
				arg0[local14][local18] = (short) (int) (arg1[local14][local18] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "([[[Lclient!qj;I)V")
	public static void method3684(@OriginalArg(0) Class311[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class311[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class311 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass4_Sub2_Sub2_1 instanceof Interface25) {
							((Interface25) local32.aClass4_Sub2_Sub2_1).method8988();
						}
						if (local32.aClass4_Sub2_Sub4_1 instanceof Interface25) {
							((Interface25) local32.aClass4_Sub2_Sub4_1).method8988();
						}
						if (local32.aClass4_Sub2_Sub4_2 instanceof Interface25) {
							((Interface25) local32.aClass4_Sub2_Sub4_2).method8988();
						}
						if (local32.aClass4_Sub2_Sub3_2 instanceof Interface25) {
							((Interface25) local32.aClass4_Sub2_Sub3_2).method8988();
						}
						if (local32.aClass4_Sub2_Sub3_1 instanceof Interface25) {
							((Interface25) local32.aClass4_Sub2_Sub3_1).method8988();
						}
						for (@Pc(96) Class142 local96 = local32.aClass142_2; local96 != null; local96 = local96.aClass142_1) {
							@Pc(101) Class4_Sub2_Sub1 local101 = local96.aClass4_Sub2_Sub1_1;
							if (local101 instanceof Interface25) {
								((Interface25) local101).method8988();
							}
						}
					}
				}
			}
		}
	}
}
