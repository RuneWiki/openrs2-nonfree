import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3731(@OriginalArg(0) String arg0) {
		@Pc(17) String local17 = Static136.method2356(Static282.method4276(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}
}
