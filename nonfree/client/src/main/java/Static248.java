import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_10 = new Class74(6, 8);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3515(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static100.method1665(Static566.method7774(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
