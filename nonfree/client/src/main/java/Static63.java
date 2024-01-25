import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "Lclient!bk;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZII)Z")
	public static boolean method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static22.method343(arg0, arg1) & Static135.method2158(arg0, arg1);
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(II)V")
	public static void method1260(@OriginalArg(0) int arg0) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 3);
		local9.method2822();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(BI)V")
	public static void method1261() {
		Static46.aClass264_8.method6366(50);
		Static67.aClass264_13.method6366(50);
		Static411.aClass264_49.method6366(50);
		Static303.aClass264_36.method6366(50);
	}
}
