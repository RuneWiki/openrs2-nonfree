import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_106;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt7847;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_10 = new Class153(7, 2);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V")
	public static void method6424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static126.method7332(arg3, arg0, arg2, arg1);
		} else if (Static13.anInt7634 <= arg2 - arg0 && Static461.anInt7899 >= arg0 + arg2 && arg1 - arg4 >= Static583.anInt9478 && Static415.anInt9494 >= arg4 + arg1) {
			Static74.method1452(arg4, arg3, arg1, arg2, arg0);
		} else {
			Static438.method6235(arg2, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!ji;)Lclient!fga;")
	public static Class79_Sub2 method6425(@OriginalArg(1) Class6_Sub21 arg0) {
		return new Class79_Sub2(arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6031(), arg0.method6069());
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public static void method6426() {
		Static100.aClass136_22.method3470();
	}
}
