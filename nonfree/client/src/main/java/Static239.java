import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!ak;")
	public static Class7 aClass7_196;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3766(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = Static45.method819(Static136.method2158(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
	public static int method3768(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local25 * arg0 >> 12) + 40960;
		return local19 * local33 >> 12;
	}
}
