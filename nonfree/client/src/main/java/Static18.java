import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt222;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public static int anInt221 = -50;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method168(@OriginalArg(0) String arg0) {
		@Pc(7) boolean local7 = false;
		if (arg0.startsWith("--> ")) {
			local7 = true;
			arg0 = arg0.substring(4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(32) int local32 = arg0.indexOf(" ", "directlogin ".length());
			if (local32 >= 0) {
				@Pc(40) int local40 = arg0.length();
				arg0 = arg0.substring(0, local32) + " ";
				for (@Pc(56) int local56 = local32 + 1; local56 < local40; local56++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 ? "--> " + arg0 : arg0;
	}
}
