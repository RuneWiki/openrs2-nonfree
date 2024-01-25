import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "Lclient!br;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array8;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "I")
	public static int anInt4097 = 0;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "I")
	public static int anInt4098 = 1;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIII)V")
	public static void method3534(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static151.anInt2683 = arg1;
		Static60.anInt971 = arg0;
		Static235.anInt3970 = 0;
		Static134.anInt2364 = 0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)V")
	public static void method3536() {
		Static136.method2051(Static319.aClass160_76);
		Static218.aClass6_Sub14_Sub2_1.method5999(Static138.anInt2445);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IC)I")
	public static int method3537(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class29_Sub4_Sub1.anIntArray531.length ? Class29_Sub4_Sub1.anIntArray531[arg0] : -1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZ)I")
	public static int method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static539.method7482(arg0 - 1, arg1 + -1) + Static539.method7482(arg0 - 1, arg1 - -1) + Static539.method7482(arg0 + 1, arg1 - 1) + Static539.method7482(arg0 - -1, arg1 + 1);
		@Pc(79) int local79 = Static539.method7482(arg0, arg1 - 1) + Static539.method7482(arg0, arg1 + 1) + Static539.method7482(arg0 + -1, arg1) + Static539.method7482(arg0 + 1, arg1);
		@Pc(84) int local84 = Static539.method7482(arg0, arg1);
		return local84 / 4 + local49 / 16 + local79 / 8;
	}
}
