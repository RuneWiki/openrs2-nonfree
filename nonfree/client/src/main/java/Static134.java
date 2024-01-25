import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public static int anInt3070;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Lclient!wm;")
	public static Class78 aClass78_4;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZZII)Lclient!am;")
	public static Class11 method2702(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class169 local10 = null;
		if (Static7.aClass149_1 != null) {
			local10 = new Class169(arg2, Static7.aClass149_1, Static355.aClass149Array1[arg2], 1000000);
		}
		Static67.aClass18_Sub1Array1[arg2] = Static176.aClass111_1.method3029(local10, Static38.aClass169_1, arg2);
		if (arg0) {
			Static67.aClass18_Sub1Array1[arg2].method5614();
		}
		return new Class11(Static67.aClass18_Sub1Array1[arg2], arg1, 1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ii;I)V")
	public static void method2703(@OriginalArg(0) Class4_Sub18 arg0) {
		if (!Static173.aBoolean319) {
			arg0.method5667();
			Static282.anInt5713--;
		}
	}
}
