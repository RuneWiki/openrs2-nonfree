import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static149 {

	@OriginalMember(owner = "client!ff", name = "zd", descriptor = "I")
	public static int anInt3867;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static161.anInt7734 <= arg5 - arg1 && arg1 + arg5 <= Static38.anInt823 && Static380.anInt7421 <= arg3 - arg1 && arg3 + arg1 <= Static237.anInt5159) {
			Static627.method7090(arg1, arg5, arg2, arg3, arg4, arg0);
		} else {
			Static485.method7546(arg0, arg3, arg4, arg1, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(CB)Z")
	public static boolean method3404(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
