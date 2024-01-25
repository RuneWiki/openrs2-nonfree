import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!si", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString103 = "";

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method7186(@OriginalArg(0) int arg0) {
		if (Static457.method7117(arg0)) {
			Static401.method6298(Static336.aClass93ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIII)I")
	public static int method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
