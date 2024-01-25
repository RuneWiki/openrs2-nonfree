import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!am", name = "n", descriptor = "I")
	public static int anInt373 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method341(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += (long) (local30 + 1 - 65);
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += (long) (local30 - 96);
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += (long) (local30 - 21);
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
