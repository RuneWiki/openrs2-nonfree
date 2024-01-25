import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public static int anInt2062;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public static int anInt2065 = 64;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(FFFZ)F")
	public static float method1692(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg1 + (arg2 - arg1) * arg0;
	}
}
