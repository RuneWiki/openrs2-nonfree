import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_138 = new Class56(34, -2);

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Z")
	public static boolean aBoolean295 = false;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BFFFI)F")
	public static float method3183(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(12) float[] local12 = Static18.aFloatArrayArray1[arg3];
		return local12[0] * arg2 + arg1 * local12[1] + local12[2] * arg0;
	}
}
