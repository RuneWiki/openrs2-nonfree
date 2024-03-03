import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static289 {

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
	public static int anInt5831;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V", line = 5)
	public static void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg4) {
			Static90.method2098(arg4, arg2, arg6, arg1, arg3, arg0);
		} else if (arg0 - arg4 >= Class25_Sub1.anInt675 && Class61.anInt1835 >= arg0 + arg4 && Class2_Sub40.anInt6819 <= arg3 - arg5 && arg3 + arg5 <= Class2_Sub20.anInt2951) {
			Static220.method4119(arg1, arg6, arg5, arg2, arg3, arg4, arg0);
		} else {
			Static116.method2414(arg3, arg1, arg2, arg6, arg0, arg5, arg4);
		}
	}
}
