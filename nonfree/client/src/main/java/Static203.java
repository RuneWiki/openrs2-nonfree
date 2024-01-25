import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "Lclient!wp;")
	public static Class376 aClass376_15;

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "Lclient!sg;")
	public static Class306 aClass306_1;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static472.anInt6105 <= arg5 && Static202.anInt4720 >= arg2 && Static246.anInt5506 <= arg4 && arg0 <= Static583.anInt9761) {
			Static647.method8668(arg3, arg2, arg4, arg6, arg0, arg1, arg5);
		} else {
			Static292.method5021(arg6, arg3, arg4, arg0, arg5, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3963(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static409.anInt6024; local11++) {
			if (arg0.equalsIgnoreCase(Static573.aStringArray40[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aString68);
	}
}
