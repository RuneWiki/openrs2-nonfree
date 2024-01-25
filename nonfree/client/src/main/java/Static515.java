import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	public static int anInt8982;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "Lclient!kr;")
	public static final Class3_Sub27_Sub1 aClass3_Sub27_Sub1_2 = new Class3_Sub27_Sub1(5000);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7365(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(20) int local20 = arg0.length();
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local28 == '%' && local20 > local22 + 2) {
				local28 = arg0.charAt(local22 + 1);
				@Pc(75) int local75;
				if (local28 >= '0' && local28 <= '9') {
					local75 = local28 - '0';
				} else if (local28 >= 'a' && local28 <= 'f') {
					local75 = local28 + '\n' - 97;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local75 = local28 - 55;
				}
				local28 = arg0.charAt(local22 + 2);
				local75 *= 16;
				if (local28 >= '0' && local28 <= '9') {
					local75 += local28 - 48;
				} else if (local28 >= 'a' && local28 <= 'f') {
					local75 += local28 - 87;
				} else {
					if (local28 < 'A' || local28 > 'F') {
						local9.append('%');
						continue;
					}
					local75 += local28 + 10 - 65;
				}
				local22 += 2;
				if (local75 != 0 && Static84.method1745((byte) local75)) {
					local9.append(Static473.method6742((byte) local75));
				}
			} else if (local28 == '+') {
				local9.append(' ');
			} else {
				local9.append(local28);
			}
		}
		return local9.toString();
	}
}
