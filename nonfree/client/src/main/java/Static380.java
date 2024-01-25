import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public static int anInt5918;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public static int anInt5916 = 0;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public static int anInt5922 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5070(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg1.indexOf(arg0); local17 != -1; local17 = arg1.indexOf(arg0, arg2.length() + local17)) {
			arg1 = arg1.substring(0, local17) + arg2 + arg1.substring(local17 + arg0.length());
		}
		return arg1;
	}
}
