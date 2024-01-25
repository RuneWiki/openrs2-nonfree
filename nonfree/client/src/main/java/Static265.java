import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!re", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	public static int anInt5321 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4506(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static232.method3990(Static334.method5497(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}
}
