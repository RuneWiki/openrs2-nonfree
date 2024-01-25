import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	public static int anInt2169;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_18 = new Class26(32);

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_19 = new Class26(64);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method1765(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
