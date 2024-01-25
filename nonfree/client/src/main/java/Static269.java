import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public static int anInt4744;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt4734 = 0;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3820(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += local29 + 1 - 65;
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += local29 + 1 - 97;
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += local29 - 21;
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
