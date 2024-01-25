import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!cp;")
	public static Interface2 anInterface2_6;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "[S")
	public static short[] aShortArray97 = new short[256];

	@OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
	public static final int[] anIntArray633 = new int[256];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 < arg2 + arg0 && arg4 + arg3 > arg2) {
			return arg5 < arg6 + arg7 && arg1 + arg5 > arg6;
		} else {
			return false;
		}
	}
}
