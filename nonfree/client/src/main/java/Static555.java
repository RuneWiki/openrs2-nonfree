import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt9652 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method7723(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static534.method7063(Static127.aClass316_31);
		Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0) + 1);
		Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
		Static340.aClass6_Sub12_Sub2_1.method6047(arg1);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Z")
	public static boolean method7724(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class6_Sub26 local15 = (Class6_Sub26) Static408.aClass298_154.method6809(); local15 != null; local15 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			if (Static543.method7377(local15.anInt5472) && (long) arg0 == local15.aLong126) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V")
	public static void method7725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2; local3++) {
			Static264.method4006(arg0, arg4, arg1, Static155.anIntArrayArray32[local3]);
		}
	}
}
