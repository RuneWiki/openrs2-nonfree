import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static401 {

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "Lclient!ga;")
	public static Class111 aClass111_96;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
	public static int anInt6896 = 0;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "[I")
	public static final int[] anIntArray475 = new int[8];

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "I")
	public static int anInt6897 = 0;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZIIII)V")
	public static void method5668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static487.anInt8210 <= arg2 && Static278.anInt5111 >= arg1 && arg4 >= Static126.anInt6658 && Static494.anInt8295 >= arg0) {
			Static183.method3225(arg1, arg2, arg3, arg0, arg4);
		} else {
			Static80.method7705(arg2, arg1, arg0, arg4, arg3);
		}
	}
}
