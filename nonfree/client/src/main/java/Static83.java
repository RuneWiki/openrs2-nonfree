import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_39 = new Class129(89, -1);

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
	public static final int[] anIntArray73 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1230(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 - 96;
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += local30 + 27 - 48;
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
