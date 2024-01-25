import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!pp;")
	public static Class276 aClass276_3;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BIIIII)V")
	public static void method8604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg1) {
			Static481.method6810(arg1, arg3, arg2, arg0);
		} else if (Static566.anInt9279 <= arg0 - arg1 && Static392.anInt6753 >= arg1 + arg0 && Static346.anInt5494 <= arg3 - arg4 && Static640.anInt10333 >= arg3 + arg4) {
			Static103.method1957(arg4, arg1, arg0, arg3, arg2);
		} else {
			Static416.method6096(arg3, arg2, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([[F[[SB)[[S")
	public static short[][] method8605(@OriginalArg(0) float[][] arg0, @OriginalArg(1) short[][] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg1[local3].length; local7++) {
				arg1[local3][local7] = (short) (int) (arg0[local3][local7] * 16383.0F);
			}
		}
		return arg1;
	}
}
