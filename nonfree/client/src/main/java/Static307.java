import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static307 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII)V")
	public static void method4547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1001) {
			Static540.method7162(Static219.aClass78_6, arg0, arg2);
		} else if (arg1 == 1009) {
			Static540.method7162(Static467.aClass78_10, arg0, arg2);
		} else if (arg1 == 1012) {
			Static540.method7162(Static341.aClass78_8, arg0, arg2);
		} else if (arg1 == 1008) {
			Static540.method7162(Static650.aClass78_13, arg0, arg2);
		} else if (arg1 == 1003) {
			Static540.method7162(Static542.aClass78_11, arg0, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)Z")
	public static boolean method4548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static183.method2902(arg0, arg1) | (arg0 & 0x70000) != 0 || Static401.method5419(arg1, arg0);
	}
}
