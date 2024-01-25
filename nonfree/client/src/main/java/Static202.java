import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	public static int anInt3985;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_178 = new Class296(33, 7);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(FBFF)I")
	public static int method3485(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFIF)F")
	public static float method3486(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static25.aFloatArrayArray1[arg2];
		return local12[2] * arg1 + arg0 * local12[1] + arg3 * local12[0];
	}
}
