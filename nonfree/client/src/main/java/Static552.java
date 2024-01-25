import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static552 {

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIIII)V")
	public static void method8464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg0 >= Static457.anInt8209 && Static407.anInt7583 >= arg3 + arg0 && Static427.anInt7845 <= arg2 - arg0 && arg2 + arg0 <= Static631.anInt10922) {
			Static111.method1970(arg3, arg1, arg4, arg0, arg5, arg2);
		} else {
			Static267.method9819(arg5, arg3, arg4, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([J[IB)V")
	public static void method8466(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static301.method4962(arg0, arg0.length - 1, 0, arg1);
	}
}
