import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public static void method5733() {
		Static566.method4438();
		Static312.method4827();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
	public static int method5735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg1 > arg2) {
			return arg2;
		} else {
			return arg1;
		}
	}
}
