import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static580 {

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!wq;")
	public static Class45_Sub1 aClass45_Sub1_2;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_163 = new Class274(90, -1);

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[I")
	public static final int[] anIntArray663 = new int[14];

	@OriginalMember(owner = "client!up", name = "g", descriptor = "I")
	public static int anInt9544 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg5) {
			Static285.method4490(arg1, arg3, arg6, arg4, arg5, arg2);
		} else if (arg6 - arg5 >= Static306.anInt5020 && Static252.anInt4988 >= arg5 + arg6 && Static570.anInt9385 <= arg4 - arg0 && Static177.anInt3963 >= arg4 + arg0) {
			Static395.method2907(arg0, arg3, arg2, arg1, arg5, arg4, arg6);
		} else {
			Static447.method6626(arg4, arg0, arg6, arg2, arg3, arg1, arg5);
		}
	}
}
