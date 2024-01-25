import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static327 {

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Z")
	public static boolean aBoolean400;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I")
	public static int method4552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static381.anIntArray534[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZIII)I")
	public static int method4554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg0 <= arg1) {
			return arg0;
		} else {
			return arg1;
		}
	}
}
