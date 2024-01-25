import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt5659 = 500;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4771(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg2); local14 != -1; local14 = arg1.indexOf(arg2, arg0.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg0 + arg1.substring(arg2.length() + local14);
		}
		return arg1;
	}
}
