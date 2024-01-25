import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!sga", name = "y", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_96 = new Class240(25, 2);

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7044(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local12; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local12 > local19 + 2) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(82) int local82;
				if (local25 >= '0' && local25 <= '9') {
					local82 = local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local82 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local82 = local25 + '\n' - 65;
				}
				local25 = arg0.charAt(local19 + 2);
				local82 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local82 += local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local82 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local9.append('%');
						continue;
					}
					local82 += local25 + 10 - 65;
				}
				local19 += 2;
				if (local82 != 0 && Static607.method8259((byte) local82)) {
					local9.append(Static363.method8911((byte) local82));
				}
			} else if (local25 == '+') {
				local9.append(' ');
			} else {
				local9.append(local25);
			}
		}
		return local9.toString();
	}
}
