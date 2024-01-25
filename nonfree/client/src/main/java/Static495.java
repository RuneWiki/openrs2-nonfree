import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)Lclient!dk;")
	public static Class14_Sub14 method7455(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) long local13 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class14_Sub14) Static391.aClass125_27.method2630(local13);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIB)V")
	public static void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg3) {
			Static55.method999(arg2, arg3, arg0, arg1);
		} else if (Static468.anInt7895 <= arg1 - arg3 && Static382.anInt6719 >= arg1 + arg3 && Static410.anInt7068 <= arg2 - arg4 && arg2 + arg4 <= Static281.anInt5188) {
			Static156.method2238(arg0, arg2, arg3, arg1, arg4);
		} else {
			Static603.method8513(arg4, arg0, arg3, arg1, arg2);
		}
	}
}
