import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
	public static int anInt7226;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
	public static int anInt7217 = 0;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "Z")
	public static final boolean aBoolean626 = false;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)Z")
	public static boolean method5981(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 51 || arg0 == 48 || arg0 == 30 || arg0 == 20) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method5985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static476.method6822(arg3, arg1, arg5, arg2, arg0, 0, arg4);
	}
}
