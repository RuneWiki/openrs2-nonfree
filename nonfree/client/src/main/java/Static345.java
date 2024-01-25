import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	public static int anInt6515;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_56 = new Class208(28, 3);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method5595(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += (long) (local22 + 1 - 65);
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += (long) (local22 + 1 - 97);
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += (long) (local22 - 21);
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
