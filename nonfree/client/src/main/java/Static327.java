import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!un", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
	public static int[] anIntArray509;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString241 = "M";

	@OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5371(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += local30 - 21;
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

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	public static void method5372() {
		@Pc(5) Class154 local5 = Static46.aClass154_13;
		synchronized (Static46.aClass154_13) {
			Static46.aClass154_13.method4212();
		}
	}
}
