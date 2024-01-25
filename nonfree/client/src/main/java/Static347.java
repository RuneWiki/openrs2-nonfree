import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!kha;")
	public static Class181 aClass181_63;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5691(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, arg1.length() + local9)) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(arg0.length() + local9);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[B)I")
	public static int method5692(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static480.method7071(arg1, arg0, 0);
	}
}
