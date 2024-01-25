import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!sh;")
	public static Class64 aClass64_2;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	public static int anInt3950;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_153 = new Class179(18, 5);

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString40 = null;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	public static void method3391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1012) {
			Static295.method4225(Static206.aClass357_12, arg0, arg1);
		} else if (arg2 == 1002) {
			Static295.method4225(Static446.aClass357_27, arg0, arg1);
		} else if (arg2 == 1007) {
			Static295.method4225(Static117.aClass357_8, arg0, arg1);
		} else if (arg2 == 1009) {
			Static295.method4225(Static44.aClass357_4, arg0, arg1);
		} else if (arg2 == 1006) {
			Static295.method4225(Static126.aClass357_29, arg0, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBII)I")
	public static int method3392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
