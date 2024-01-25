import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBIIII)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg3 >= Static514.anInt8603 && Static487.anInt8320 >= arg2 + arg3 && Static304.anInt4824 <= arg1 - arg3 && arg1 + arg3 <= Static231.anInt3977) {
			Static327.method5100(arg3, arg5, arg2, arg1, arg4, arg0);
		} else {
			Static312.method4947(arg0, arg3, arg1, arg4, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(III)Z")
	public static boolean method2192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)I")
	public static int method2193(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
