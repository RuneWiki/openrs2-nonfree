import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static251 {

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_22 = new Class111();

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString51 = "";

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public static int anInt4599 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static330.anInt6025 <= arg0 && Static194.anInt3788 >= arg1 && arg6 >= Static120.anInt2491 && arg3 <= Static71.anInt1350) {
			Static99.method1467(arg5, arg0, arg1, arg4, arg6, arg2, arg3);
		} else {
			Static78.method1327(arg4, arg0, arg6, arg5, arg2, arg1, arg3);
		}
	}
}
