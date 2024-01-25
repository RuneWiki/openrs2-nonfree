import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static653 {

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "F")
	public static float aFloat266;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z")
	public static boolean method9075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
	public static void method9077() {
		Static46.aClass264_8.method6360();
		Static67.aClass264_13.method6360();
		Static411.aClass264_49.method6360();
		Static303.aClass264_36.method6360();
	}
}
