import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!tca", name = "q", descriptor = "Lclient!hia;")
	public static Class144 aClass144_8;

	@OriginalMember(owner = "client!tca", name = "A", descriptor = "[[S")
	public static short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!tca", name = "o", descriptor = "Lclient!in;")
	public static final Class169 aClass169_238 = new Class169(118, -1);

	@OriginalMember(owner = "client!tca", name = "s", descriptor = "[I")
	public static final int[] anIntArray494 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
	public static int anInt9782 = -1;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8571(@OriginalArg(0) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(12) int local12 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local12; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local12 > local21 + 2) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(82) int local82;
				if (local27 >= '0' && local27 <= '9') {
					local82 = local27 - '0';
				} else if (local27 >= 'a' && local27 <= 'f') {
					local82 = local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local82 = local27 + 10 - 65;
				}
				local27 = arg0.charAt(local21 + 2);
				local82 *= 16;
				if (local27 >= '0' && local27 <= '9') {
					local82 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local82 += local27 - 87;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local82 += local27 - 55;
				}
				local21 += 2;
				if (local82 != 0 && Static455.method7299((byte) local82)) {
					local9.append(Static386.method6507((byte) local82));
				}
			} else if (local27 == '+') {
				local9.append(' ');
			} else {
				local9.append(local27);
			}
		}
		return local9.toString();
	}
}
