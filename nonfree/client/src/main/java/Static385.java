import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
	public static boolean aBoolean554 = true;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)I")
	public static int method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg3;
			arg3 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return arg5;
		} else if (local20 == 2) {
			return 1 + 7 - arg1 - arg2;
		} else {
			return 7 + 1 - arg5 - arg3;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[[[Lclient!iq;)V")
	public static void method5004(@OriginalArg(1) Class118[][][] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(10) Class118[][] local10 = arg0[local5];
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				for (@Pc(15) int local15 = 0; local15 < local10[local12].length; local15++) {
					@Pc(22) Class118 local22 = local10[local12][local15];
					if (local22 != null) {
						if (local22.aClass7_Sub1_1 instanceof Interface8) {
							((Interface8) local22.aClass7_Sub1_1).method4811();
						}
						if (local22.aClass7_Sub3_3 instanceof Interface8) {
							((Interface8) local22.aClass7_Sub3_3).method4811();
						}
						if (local22.aClass7_Sub3_2 instanceof Interface8) {
							((Interface8) local22.aClass7_Sub3_2).method4811();
						}
						if (local22.aClass7_Sub4_2 instanceof Interface8) {
							((Interface8) local22.aClass7_Sub4_2).method4811();
						}
						if (local22.aClass7_Sub4_1 instanceof Interface8) {
							((Interface8) local22.aClass7_Sub4_1).method4811();
						}
						for (@Pc(72) Class179 local72 = local22.aClass179_2; local72 != null; local72 = local72.aClass179_3) {
							@Pc(76) Class7_Sub2 local76 = local72.aClass7_Sub2_2;
							if (local76 instanceof Interface8) {
								((Interface8) local76).method4811();
							}
						}
					}
				}
			}
		}
	}
}
