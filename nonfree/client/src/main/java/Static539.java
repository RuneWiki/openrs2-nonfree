import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static539 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray37;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "F")
	public static float aFloat165;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
	public static String method7407(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 && arg1 >= 0 ? Static407.method5957(arg1, arg0) : Integer.toString(arg1);
	}
}
