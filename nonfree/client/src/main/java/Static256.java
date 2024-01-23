import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
	public static boolean aBoolean457;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public static int anInt4782 = -1;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	public static int anInt4783 = 0;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public static int anInt4784 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	public static void method4004() {
		Static116.aClass1_Sub13_Sub1_48.method1887(255);
		for (@Pc(18) Class1_Sub20 local18 = (Class1_Sub20) Static224.aClass86_27.method2134(); local18 != null; local18 = (Class1_Sub20) Static224.aClass86_27.method2141()) {
			if (local18.anInt3421 == 0) {
				Static296.method720(true, local18);
			}
		}
		if (Static26.aClass157_2 != null) {
			Static224.method3621(Static26.aClass157_2);
			Static26.aClass157_2 = null;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZI)V")
	public static void method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1009) {
			Static174.method4652(arg2, 10, arg0);
		} else if (arg1 == 1012) {
			Static174.method4652(arg2, 11, arg0);
		} else if (arg1 == 1005) {
			Static174.method4652(arg2, 12, arg0);
		} else if (arg1 == 1008) {
			Static174.method4652(arg2, 13, arg0);
		} else if (arg1 == 1001) {
			Static174.method4652(arg2, 14, arg0);
		}
	}
}
