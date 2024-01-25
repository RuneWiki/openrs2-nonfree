import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qfa", name = "K", descriptor = "S")
	public static short aShort71 = 205;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FIFFI)F")
	public static float method6415(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float[] local17 = Static38.aFloatArrayArray2[arg3];
		return local17[0] * arg1 + arg0 * local17[1] + local17[2] * arg2;
	}
}
