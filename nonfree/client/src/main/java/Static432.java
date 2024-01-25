import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)I")
	public static int method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFIIF)F")
	public static float method5497(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(15) float[] local15 = Static215.aFloatArrayArray5[arg2];
		return arg3 * local15[2] + local15[1] * arg1 + local15[0] * arg0;
	}
}
