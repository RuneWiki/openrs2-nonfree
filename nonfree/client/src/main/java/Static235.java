import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "[J")
	public static final long[] aLongArray12 = new long[100];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZFFF)F")
	public static float method3718(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + arg1 * (arg2 - arg0);
	}
}
