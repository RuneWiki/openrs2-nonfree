import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!nia", name = "j", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_42 = new Class112(50);

	@OriginalMember(owner = "client!nia", name = "k", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_43 = new Class112(64);

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
	public static final int[] anIntArray413 = new int[3];

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)[I")
	public static int[] method5967() {
		return new int[] { Static397.anInt7604, Static151.anInt3728, Static42.anInt765 };
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg5) {
			Static247.method4665(arg2, arg4, arg1, arg6, arg5, arg0);
		} else if (arg1 - arg5 >= Static472.anInt6105 && arg1 + arg5 <= Static202.anInt4720 && Static246.anInt5506 <= arg0 - arg3 && Static583.anInt9761 >= arg0 + arg3) {
			Static601.method8192(arg5, arg1, arg2, arg6, arg3, arg4, arg0);
		} else {
			Static104.method2562(arg1, arg4, arg3, arg5, arg0, arg6, arg2);
		}
	}
}
