import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "[I")
	public static final int[] anIntArray264 = new int[1];

	@OriginalMember(owner = "client!jh", name = "S", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_4 = new Class179("", 13);

	@OriginalMember(owner = "client!jh", name = "Z", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
	public static void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == arg3) {
			Static269.method3761(arg4, arg3, arg1, arg0);
		} else if (Static47.anInt762 <= arg4 - arg3 && Static60.anInt1086 >= arg3 + arg4 && arg1 - arg2 >= Static357.anInt6537 && arg2 + arg1 <= Static85.anInt1517) {
			Static257.method3644(arg0, arg3, arg4, arg1, arg2);
		} else {
			Static296.method4060(arg4, arg3, arg1, arg2, arg0);
		}
	}
}
