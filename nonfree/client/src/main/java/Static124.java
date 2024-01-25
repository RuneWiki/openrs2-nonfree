import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "B")
	public static byte aByte38;

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "Lclient!dd;")
	public static Class52 aClass52_6;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_58 = new Class239(50, 2);

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBLclient!wca;)Ljava/lang/String;")
	public static String method2363(@OriginalArg(0) int arg0, @OriginalArg(2) Class310 arg1) {
		if (!Static67.method1257(arg1).method6277(arg0) && arg1.anObjectArray27 == null) {
			return null;
		} else if (arg1.aStringArray45 == null || arg0 >= arg1.aStringArray45.length || arg1.aStringArray45[arg0] == null || arg1.aStringArray45[arg0].trim().length() == 0) {
			return Static372.aBoolean522 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray45[arg0];
		}
	}
}
