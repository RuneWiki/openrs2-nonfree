import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FF[FIIIIZIIIFF)V")
	public static void method8637(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11, @OriginalArg(13) float arg12) {
		@Pc(5) int local5 = arg7 - arg10;
		@Pc(13) int local13 = arg0 - arg4;
		@Pc(17) int local17 = arg9 - arg5;
		@Pc(43) float local43 = (float) local17 * arg3[2] + (float) local13 * arg3[0] + (float) local5 * arg3[1];
		@Pc(64) float local64 = (float) local17 * arg3[5] + (float) local13 * arg3[3] + arg3[4] * (float) local5;
		@Pc(85) float local85 = (float) local17 * arg3[8] + arg3[7] * (float) local5 + (float) local13 * arg3[6];
		@Pc(100) float local100;
		@Pc(94) float local94;
		if (arg6 == 0) {
			local94 = arg11 + 0.5F - local85;
			local100 = arg12 + local43 + 0.5F;
		} else if (arg6 == 1) {
			local100 = arg12 + local43 + 0.5F;
			local94 = local85 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local94 = arg2 + 0.5F - local64;
			local100 = arg12 + 0.5F - local43;
		} else if (arg6 == 3) {
			local94 = arg2 + 0.5F - local64;
			local100 = arg12 + local43 + 0.5F;
		} else if (arg6 == 4) {
			local94 = arg2 + 0.5F - local64;
			local100 = arg11 + local85 + 0.5F;
		} else {
			local94 = arg2 + 0.5F - local64;
			local100 = arg11 + 0.5F - local85;
		}
		@Pc(199) float local199;
		if (arg8 == 1) {
			local199 = local100;
			local100 = -local94;
			local94 = local199;
		} else if (arg8 == 2) {
			local94 = -local94;
			local100 = -local100;
		} else if (arg8 == 3) {
			local199 = local100;
			local100 = local94;
			local94 = -local199;
		}
		arg1[1] = local94;
		arg1[0] = local100;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public static void method8638() {
		if (Static485.anInt8420 == 7) {
			Static439.method6845(false);
		} else {
			Static528.aClass230_2 = Static413.aClass230_1;
			Static413.aClass230_1 = null;
			Static256.method4279(13);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Z")
	public static boolean method8640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
