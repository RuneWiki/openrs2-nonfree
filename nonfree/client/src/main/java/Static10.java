import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!jk;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "[I")
	public static final int[] anIntArray14 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_3 = new Class212(27, 11);

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public static int anInt197 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method162(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, local14 + arg0.length())) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(arg2.length() + local14);
		}
		return arg1;
	}
}
