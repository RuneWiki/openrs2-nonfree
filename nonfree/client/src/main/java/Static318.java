import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!mo", name = "oc", descriptor = "Z")
	public static boolean aBoolean406 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method4947(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static491.method6716(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V")
	public static void method4952(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static135.method2645(arg0 - 1L);
			Static135.method2645(1L);
		} else {
			Static135.method2645(arg0);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method4955(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static474.method7118(arg1, arg0) & Static31.method4023(arg1, arg0);
	}
}
