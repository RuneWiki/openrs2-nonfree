import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_261 = new Class288(41, 3);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IFFFI)F")
	public static float method6495(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static426.aFloatArrayArray15[arg0];
		return arg2 * local12[2] + local12[1] * arg1 + local12[0] * arg3;
	}
}
