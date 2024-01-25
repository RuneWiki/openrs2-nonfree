import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIFFF)F")
	public static float method4746(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static468.aFloatArrayArray15[arg0];
		return local17[2] * arg3 + arg2 * local17[1] + arg1 * local17[0];
	}
}
