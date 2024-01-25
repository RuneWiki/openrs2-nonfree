import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_96 = new Class114("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method3989(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static102.method2274(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILclient!uj;Lclient!uj;)V")
	public static void method3993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub5 arg3, @OriginalArg(4) Class47_Sub5 arg4) {
		@Pc(4) Class206 local4 = Static64.method1808(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub5_1 = arg3;
			local4.aClass47_Sub5_2 = arg4;
		}
	}
}
