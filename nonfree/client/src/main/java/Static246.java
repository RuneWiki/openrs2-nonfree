import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!la;")
	public static Class207 aClass207_55;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_74 = new Class337(61, 4);

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt4495 = 0;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_115 = new Class87(64);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IFII[FI[FIIFIFII)V")
	public static void method4088(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(10) int local10 = arg0 - arg11;
		@Pc(14) int local14 = arg4 - arg7;
		@Pc(18) int local18 = arg12 - arg9;
		@Pc(43) float local43 = (float) local14 * arg3[2] + (float) local10 * arg3[0] + (float) local18 * arg3[1];
		@Pc(64) float local64 = (float) local10 * arg3[3] + (float) local18 * arg3[4] + arg3[5] * (float) local14;
		@Pc(85) float local85 = (float) local10 * arg3[6] + arg3[7] * (float) local18 + arg3[8] * (float) local14;
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg6 == 0) {
			local96 = arg8 + local43 + 0.5F;
			local103 = arg10 + 0.5F - local85;
		} else if (arg6 == 1) {
			local96 = arg8 + local43 + 0.5F;
			local103 = arg10 + local85 + 0.5F;
		} else if (arg6 == 2) {
			local96 = arg8 + 0.5F - local43;
			local103 = arg1 + 0.5F - local64;
		} else if (arg6 == 3) {
			local103 = arg1 + 0.5F - local64;
			local96 = local43 + arg8 + 0.5F;
		} else if (arg6 == 4) {
			local103 = arg1 + 0.5F - local64;
			local96 = local85 + arg10 + 0.5F;
		} else {
			local96 = arg10 + 0.5F - local85;
			local103 = arg1 + 0.5F - local64;
		}
		@Pc(220) float local220;
		if (arg2 == 1) {
			local220 = local96;
			local96 = -local103;
			local103 = local220;
		} else if (arg2 == 2) {
			local103 = -local103;
			local96 = -local96;
		} else if (arg2 == 3) {
			local220 = local96;
			local96 = local103;
			local103 = -local220;
		}
		arg5[0] = local96;
		arg5[1] = local103;
	}
}
