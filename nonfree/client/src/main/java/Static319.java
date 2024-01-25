import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_100 = new Class337(36, 0);

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method4866(@OriginalArg(2) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local44 >= '0' && local44 <= '9') {
				local74 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local74 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local74 = local44 - 'W';
			} else {
				return false;
			}
			if (local74 >= 10) {
				return false;
			}
			if (local24) {
				local74 = -local74;
			}
			@Pc(116) int local116 = local74 + local33 * 10;
			if (local116 / 10 != local33) {
				return false;
			}
			local33 = local116;
			local31 = true;
		}
		return local31;
	}
}
