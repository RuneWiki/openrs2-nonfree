import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)I")
	public static int method4467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static108.method2106(arg0 + 91923, 4, arg1 + 45365) + (Static108.method2106(arg0 + 37821, 2, arg1 - -10294) + -128 >> 1) + (Static108.method2106(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method4469() {
		Static34.aClass107_1.method3012();
	}
}
