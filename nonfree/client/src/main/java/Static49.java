import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)I")
	public static int method990(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(38) int local38 = (arg0 & 0x7F) * 96 >> 7;
			if (local38 < 2) {
				local38 = 2;
			} else if (local38 > 126) {
				local38 = 126;
			}
			return local38 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method991(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += (long) (local27 + 1 - 65);
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += (long) (local27 + 1 - 97);
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += (long) (local27 + 27 - 48);
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
