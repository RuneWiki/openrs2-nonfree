import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!tj;")
	public static Class328 aClass328_7;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFIBF)F")
	public static float method7822(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static328.aFloatArrayArray5[arg2];
		return local12[1] * arg1 + local12[0] * arg0 + local12[2] * arg3;
	}
}
