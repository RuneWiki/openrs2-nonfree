import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "Lclient!wu;")
	public static Class384 aClass384_83;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public static int anInt5768;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!ha;BZ)Lclient!da;")
	public static Class6 method5145(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) Class195 local9 = Static626.method8672(arg1, arg2, arg0);
		return local9 == null ? null : local9.aClass6_9;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg1 == arg3) {
			Static149.method2189(arg0, arg2, arg5, arg1, arg4, arg6);
		} else if (arg5 - arg1 >= Static514.anInt8603 && arg5 + arg1 <= Static487.anInt8320 && arg2 - arg3 >= Static304.anInt4824 && Static231.anInt3977 >= arg2 + arg3) {
			Static545.method7735(arg1, arg3, arg0, arg4, arg6, arg5, arg2);
		} else {
			Static452.method7475(arg6, arg2, arg0, arg1, arg4, arg5, arg3);
		}
	}
}
