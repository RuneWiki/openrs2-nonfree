import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "Lclient!ke;")
	public static Class196 aClass196_263;

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_262 = new Class196(59, 2);

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "[I")
	public static final int[] anIntArray480 = new int[8];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method7366(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg0.indexOf(arg2); local7 != -1; local7 = arg0.indexOf(arg2, arg1.length() + local7)) {
			arg0 = arg0.substring(0, local7) + arg1 + arg0.substring(local7 + arg2.length());
		}
		return arg0;
	}
}
