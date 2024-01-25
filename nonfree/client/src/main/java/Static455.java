import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Z")
	public static boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method6387(@OriginalArg(1) String arg0) {
		@Pc(15) long local15 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local15 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local15 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local15 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local15 += local30 + 27 - 48;
			}
			if (local15 >= 177917621779460413L) {
				break;
			}
		}
		while (local15 % 37L == 0L && local15 != 0L) {
			local15 /= 37L;
		}
		return local15;
	}
}
