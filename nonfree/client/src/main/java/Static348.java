import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!za;")
	public static Class200 aClass200_7;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Z")
	public static boolean aBoolean388;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "Lclient!hv;")
	public static Class107 aClass107_11;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "Z")
	public static boolean aBoolean387 = false;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIILclient!fi;)V")
	public static void method4520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76 arg2) {
		Static6.anInt107 = arg1;
		Static8.aClass76_1 = arg2;
		Static236.anInt3872 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIZII)V")
	public static void method4522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static3.anInt45 && arg5 <= Static112.anInt1900 && Static356.anInt5817 <= arg2 && arg4 <= Static3.anInt46) {
			if (arg1 == 1) {
				Static346.method4499(arg3, arg0, arg4, arg5, arg2);
			} else {
				Static415.method5479(arg1, arg2, arg3, arg5, arg4, arg0);
			}
		} else if (arg1 == 1) {
			Static97.method1365(arg5, arg0, arg2, arg4, arg3);
		} else {
			Static224.method2951(arg2, arg1, arg0, arg4, arg5, arg3);
		}
	}
}
