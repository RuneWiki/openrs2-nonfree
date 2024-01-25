import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!ub;")
	public static Class362 aClass362_1;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method6596(@OriginalArg(1) String arg0) {
		@Pc(15) String local15 = Static341.method4741(Static500.method7129(arg0));
		if (local15 == null) {
			local15 = "";
		}
		return local15;
	}
}
