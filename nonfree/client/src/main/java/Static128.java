import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!th;")
	public static Class168 aClass168_95;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString171 = "cyan:";

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "[I")
	public static int[] anIntArray278 = new int[100];

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!wf;IB)Ljava/lang/String;")
	public static String method2053(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1) {
		if (!Static35.method737(arg0).method4554(arg1) && arg0.anObjectArray23 == null) {
			return null;
		} else if (arg0.aStringArray50 == null || arg1 >= arg0.aStringArray50.length || arg0.aStringArray50[arg1] == null || arg0.aStringArray50[arg1].trim().length() == 0) {
			return Static303.aBoolean389 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray50[arg1];
		}
	}
}
