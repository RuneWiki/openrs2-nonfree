import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!iha;)[Lclient!wba;")
	public static Class386[] method3887(@OriginalArg(1) Class173 arg0) {
		if (!arg0.method4235()) {
			return new Class386[0];
		}
		@Pc(15) Class230 local15 = arg0.method4240();
		while (local15.anInt6256 == 0) {
			Static548.method7968(10L);
		}
		if (local15.anInt6256 == 2) {
			return new Class386[0];
		}
		@Pc(40) int[] local40 = (int[]) local15.anObject12;
		@Pc(46) Class386[] local46 = new Class386[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(58) Class386 local58 = new Class386();
			local46[local48] = local58;
			local58.anInt10886 = local40[local48 << 2];
			local58.anInt10883 = local40[(local48 << 2) + 1];
			local58.anInt10885 = local40[(local48 << 2) + 2];
			local58.anInt10881 = local40[(local48 << 2) + 3];
		}
		return local46;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3888(@OriginalArg(1) int arg0) {
		@Pc(17) Class14_Sub27 local17 = (Class14_Sub27) Static445.aClass125_30.method2630((long) arg0);
		if (local17 != null) {
			@Pc(24) Class14_Sub4_Sub3 local24 = local17.aClass147_Sub1_1.method5249();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass147_Sub1_1.method5240();
				if ((double) local24.method3902() <= local31 && local31 <= (double) local24.method3906()) {
					return local24.method3901();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBIBLclient!gg;)V")
	public static void method3889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class4_Sub3_Sub3_Sub3_Sub2 arg2) {
		@Pc(8) int local8 = arg2.anIntArray200[0];
		@Pc(13) int local13 = arg2.anIntArray201[0];
		if (local8 < 0 || Static380.anInt6689 <= local8 || local13 < 0 || Static542.anInt9214 <= local13 || (arg0 < 0 || Static380.anInt6689 <= arg0 || arg1 < 0 || Static542.anInt9214 <= arg1)) {
			return;
		}
		@Pc(78) int local78 = Static686.method9454(0, Static40.aClass289Array1[arg2.aByte146], Static310.anIntArray306, 0, local8, -4, Static684.anIntArray600, local13, true, 0, arg0, 0, arg2.method2870(0), arg1);
		if (local78 >= 1 && local78 <= 3) {
			for (@Pc(94) int local94 = 0; local94 < local78 - 1; local94++) {
				arg2.method2892(Static310.anIntArray306[local94], Static684.anIntArray600[local94], (byte) 2);
			}
		}
	}
}
