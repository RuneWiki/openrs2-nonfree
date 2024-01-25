import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!is", name = "t", descriptor = "I")
	public static final int anInt4285 = 1401;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(FFFB)F")
	public static float method3796(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 + (arg2 - arg0) * arg1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)Z")
	public static boolean method3797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
