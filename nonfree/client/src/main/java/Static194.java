import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static194 {

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_91 = new Class25(37, -1);

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_92 = new Class25(72, -1);

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!qi;")
	public static final Class207 aClass207_8 = new Class207("LIVE", 0);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)I")
	public static int method4773(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBIIII)V")
	public static void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= Static81.anInt1574 && Static99.anInt1808 >= arg4 && arg3 >= Static97.anInt1796 && arg2 <= Static85.anInt1636) {
			if (arg5 == 1) {
				Static417.method5674(arg2, arg1, arg0, arg3, arg4);
			} else {
				Static346.method4857(arg1, arg4, arg5, arg2, arg3, arg0);
			}
		} else if (arg5 == 1) {
			Static243.method3759(arg2, arg1, arg4, arg3, arg0);
		} else {
			Static269.method4105(arg5, arg0, arg1, arg3, arg2, arg4);
		}
	}
}
