import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
	public static int anInt3922 = -1;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
	public static void method3381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass29_Sub1_2 != null) {
			local7.aClass29_Sub1_2 = null;
		}
		if (local7.aClass29_Sub1_1 != null) {
			local7.aClass29_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3382(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
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
