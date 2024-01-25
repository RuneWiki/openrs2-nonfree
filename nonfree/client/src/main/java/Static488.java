import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public static int anInt8419;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "[I")
	public static final int[] anIntArray501 = new int[2048];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method6601(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg1); local9 != -1; local9 = arg2.indexOf(arg1, local9 + arg0.length())) {
			arg2 = arg2.substring(0, local9) + arg0 + arg2.substring(arg1.length() + local9);
		}
		return arg2;
	}
}
