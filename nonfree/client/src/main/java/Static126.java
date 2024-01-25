import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static126 {

	@OriginalMember(owner = "client!en", name = "S", descriptor = "[Lclient!f;")
	public static Class39[] aClass39Array14;

	@OriginalMember(owner = "client!en", name = "Sc", descriptor = "I")
	public static final int anInt5706 = 1407;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIIII)V")
	public static void method4753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg1 >= Static553.anInt9074 && Static249.anInt4668 >= arg4 + arg1 && Static326.anInt6028 <= arg2 - arg1 && arg2 + arg1 <= Static80.anInt1738) {
			Static494.method6901(arg0, arg4, arg3, arg2, arg5, arg1);
		} else {
			Static40.method696(arg2, arg4, arg1, arg3, arg0, arg5);
		}
	}
}
