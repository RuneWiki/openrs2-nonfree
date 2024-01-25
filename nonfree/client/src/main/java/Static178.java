import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "Lclient!k;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILjava/lang/String;Z)I")
	public static int method3299(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(40) char local40 = arg1.charAt(local35);
			if (local35 == 0) {
				if (local40 == '-') {
					local26 = true;
					continue;
				}
				if (local40 == '+') {
					continue;
				}
			}
			@Pc(86) int local86;
			if (local40 >= '0' && local40 <= '9') {
				local86 = local40 - '0';
			} else if (local40 >= 'A' && local40 <= 'Z') {
				local86 = local40 - '7';
			} else if (local40 >= 'a' && local40 <= 'z') {
				local86 = local40 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local86) {
				throw new NumberFormatException();
			}
			if (local26) {
				local86 = -local86;
			}
			@Pc(108) int local108 = arg0 * local30 + local86;
			if (local108 / arg0 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local108;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
