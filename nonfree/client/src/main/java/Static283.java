import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static283 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array15;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= Static115.anInt2362 && arg4 <= Static146.anInt3034 && arg5 >= Static319.anInt5496 && arg2 <= Static160.anInt3220) {
			if (arg1 == 1) {
				Static425.method5649(arg4, arg0, arg3, arg2, arg5);
			} else {
				Static415.method5448(arg4, arg2, arg3, arg5, arg0, arg1);
			}
		} else if (arg1 == 1) {
			Static221.method3316(arg3, arg4, arg2, arg5, arg0);
		} else {
			Static24.method327(arg3, arg0, arg5, arg1, arg4, arg2);
		}
	}
}
