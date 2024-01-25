import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gn", name = "R", descriptor = "Lclient!dn;")
	public static Class56 aClass56_34;

	@OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
	public static int anInt3152;

	@OriginalMember(owner = "client!gn", name = "U", descriptor = "Lclient!wv;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "Lclient!tu;")
	public static Class229 aClass229_23 = new Class229();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method2515(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(7) int local7 = arg1.indexOf(arg2); local7 != -1; local7 = arg1.indexOf(arg2, local7 + arg0.length())) {
			arg1 = arg1.substring(0, local7) + arg0 + arg1.substring(arg2.length() + local7);
		}
		return arg1;
	}
}
