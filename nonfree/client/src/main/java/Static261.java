import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
	public static int anInt4524 = 0;

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
	public static int anInt4529 = 0;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method3799(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = null;
		@Pc(18) int local18 = arg0.indexOf("--> ");
		if (local18 >= 0) {
			local14 = arg0.substring(0, local18 + 4);
			arg0 = arg0.substring(local18 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(43) int local43 = arg0.indexOf(" ", "directlogin ".length());
			if (local43 >= 0) {
				@Pc(51) int local51 = arg0.length();
				arg0 = arg0.substring(0, local43) + " ";
				for (@Pc(67) int local67 = local43 + 1; local67 < local51; local67++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local14 == null ? arg0 : local14 + arg0;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BI)Z")
	public static boolean method3800(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
