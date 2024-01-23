import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int anInt4867;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public static int anInt4868;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	public static int anInt4864 = -1;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Z")
	public static boolean aBoolean336 = true;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "J")
	public static long aLong174 = 0L;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString305 = "cyan:";

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= Static48.anInt902 && Static131.anInt2553 >= arg5 && arg2 >= Static156.anInt3086 && Static218.anInt4231 >= arg4) {
			if (arg3 == 1) {
				Static198.method4743(arg1, arg0, arg5, arg2, arg4);
			} else {
				Static73.method1200(arg1, arg0, arg4, arg5, arg3, arg2);
			}
		} else if (arg3 == 1) {
			Static194.method4278(arg5, arg4, arg2, arg1, arg0);
		} else {
			Static244.method3818(arg5, arg1, arg3, arg0, arg2, arg4);
		}
	}
}
