import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "Lclient!sm;")
	public static Class269 aClass269_1;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
	public static int anInt1270 = 2;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_51 = new Class305(43, 10);

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_21 = new Class252(1, -1);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!et;II)Ljava/lang/String;")
	public static String method1332(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1) {
		if (!Static63.method1580(arg0).method1748(arg1) && arg0.anObjectArray30 == null) {
			return null;
		} else if (arg0.aStringArray13 == null || arg0.aStringArray13.length <= arg1 || arg0.aStringArray13[arg1] == null || arg0.aStringArray13[arg1].trim().length() == 0) {
			return Static428.aBoolean561 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray13[arg1];
		}
	}
}
