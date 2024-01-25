import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	public static int anInt8951;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "[I")
	public static final int[] anIntArray601 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)V")
	public static void method7386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static487.anInt8210 <= arg1 && Static278.anInt5111 >= arg5 && arg3 >= Static126.anInt6658 && Static494.anInt8295 >= arg0) {
			if (arg4 == 1) {
				Static86.method1720(arg2, arg0, arg1, arg5, arg3);
			} else {
				Static447.method6409(arg3, arg1, arg5, arg0, arg2, arg4);
			}
		} else if (arg4 == 1) {
			Static402.method5682(arg3, arg0, arg5, arg2, arg1);
		} else {
			Static114.method1986(arg3, arg0, arg5, arg4, arg2, arg1);
		}
	}
}
