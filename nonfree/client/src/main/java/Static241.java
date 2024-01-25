import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "Lclient!sfa;")
	public static Class338 aClass338_4;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[200];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)I")
	public static int method3444(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)I")
	public static int method3446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = ((arg1 & 0xFF00) * arg0 & 0xFF0000 | (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
		@Pc(34) int local34 = 255 - arg0;
		return local29 + ((local34 * (arg2 & 0xFF00FF) & 0xFF00FF00 | (arg2 & 0xFF00) * local34 & 0xFF0000) >>> 8);
	}
}
