import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
	public static void method4656() {
		if (!Static509.aBoolean545) {
			Static317.aFloat130 += (12.0F - Static317.aFloat130) / 2.0F;
			Static669.aBoolean763 = true;
			Static509.aBoolean545 = true;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(FFFIB)F")
	public static float method4657(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(7) float[] local7 = Static579.aFloatArrayArray16[arg3];
		return arg0 * local7[2] + local7[0] * arg1 + arg2 * local7[1];
	}
}
