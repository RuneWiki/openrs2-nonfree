import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "Lclient!mo;")
	public static Class143 aClass143_74;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Loading...";

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z")
	public static boolean method3533() {
		return Static322.anInt6208 != 0 || Static40.anInt979 >= 2;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!ne;)Ljava/lang/String;")
	public static String method3537(@OriginalArg(1) int arg0, @OriginalArg(2) Class146 arg1) {
		if (!Static42.method1040(arg1).method2583(arg0) && arg1.anObjectArray20 == null) {
			return null;
		} else if (arg1.aStringArray53 == null || arg1.aStringArray53.length <= arg0 || arg1.aStringArray53[arg0] == null || arg1.aStringArray53[arg0].trim().length() == 0) {
			return Static195.aBoolean248 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray53[arg0];
		}
	}
}
