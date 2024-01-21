import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!jc;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_184 = Static38.method685("Benutzername: ");

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!ai;")
	private static Class6 aClass6_186 = Static38.method685("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_185 = aClass6_186;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg2 - 32) * arg2 / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		Static163.aClass2_Sub3_Sub2_Sub3Array10[0].method2398(arg1, arg0);
		Static163.aClass2_Sub3_Sub2_Sub3Array10[1].method2398(arg1, arg0 + arg2 - 16);
		@Pc(47) int local47 = arg3 * (arg2 - local11 - 32) / (arg4 - arg2);
		Static53.method2496(arg1, arg0 + 16, 16, arg2 - 32, Static132.anInt3079);
		Static53.method2496(arg1, local47 + arg0 + 16, 16, local11, Static18.anInt474);
		Static53.method2488(arg1, local47 + arg0 + 16, local11, Static169.anInt3978);
		Static53.method2488(arg1 + 1, local47 + 16 + arg0, local11, Static169.anInt3978);
		Static53.method2499(arg1, local47 + arg0 + 16, 16, Static169.anInt3978);
		Static53.method2499(arg1, local47 + arg0 + 17, 16, Static169.anInt3978);
		Static53.method2488(arg1 + 15, local47 + 16 + arg0, local11, Static156.anInt3636);
		Static53.method2488(arg1 + 14, local47 + arg0 - -17, local11 - 1, Static156.anInt3636);
		Static53.method2499(arg1, local47 + arg0 + local11 + 15, 16, Static156.anInt3636);
		Static53.method2499(arg1 + 1, local11 + 14 + arg0 + local47, 15, Static156.anInt3636);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method477() {
		aClass6_186 = null;
		aClass6_184 = null;
		aClass6_185 = null;
		aClass38_1 = null;
	}
}
