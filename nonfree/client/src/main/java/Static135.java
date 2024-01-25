import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "[Lclient!ffa;")
	public static Class119[] aClass119Array1;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
	public static boolean method2284(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local46 >= '0' && local46 <= '9') {
				local75 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local75 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local75 = local46 - 'W';
			} else {
				return false;
			}
			if (local75 >= 10) {
				return false;
			}
			if (local26) {
				local75 = -local75;
			}
			@Pc(117) int local117 = local75 + local30 * 10;
			if (local117 / 10 != local30) {
				return false;
			}
			local28 = true;
			local30 = local117;
		}
		return local28;
	}
}
