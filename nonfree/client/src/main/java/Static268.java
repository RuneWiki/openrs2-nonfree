import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public static void method3787(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub5_Sub11 local12 = Static188.method2688(arg0, 9);
		local12.method2667();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lclient!uj;")
	public static Class25_Sub4 method3788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class169 local7 = Static359.aClass169ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub4_1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
	public static void method3789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg3) {
			Static129.method2033(arg1, arg2, arg3, arg0);
		} else if (Static427.anInt7214 <= arg2 - arg3 && arg3 + arg2 <= Static434.anInt7302 && arg0 - arg4 >= Static289.anInt5053 && Static93.anInt1676 >= arg4 + arg0) {
			Static140.method2134(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static326.method4382(arg4, arg0, arg3, arg1, arg2);
		}
	}
}
