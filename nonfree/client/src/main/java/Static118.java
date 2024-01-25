import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!hg", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
	public static boolean aBoolean189 = false;

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "Lclient!il;")
	public static final Class93 aClass93_11 = new Class93(4, 2);

	@OriginalMember(owner = "client!hg", name = "M", descriptor = "I")
	public static int anInt2586 = 0;

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "F")
	public static float aFloat22 = 0.0F;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg4) {
			Static306.method5307(arg6, arg3, arg5, arg2, arg0, arg1);
		} else if (arg0 - arg3 >= Static93.anInt5014 && Static122.anInt1360 >= arg3 + arg0 && arg6 - arg4 >= Static131.anInt2843 && arg4 + arg6 <= Static38.anInt945) {
			Static132.method2715(arg6, arg4, arg5, arg0, arg3, arg2, arg1);
		} else {
			Static163.method3099(arg3, arg2, arg6, arg0, arg4, arg1, arg5);
		}
	}
}
