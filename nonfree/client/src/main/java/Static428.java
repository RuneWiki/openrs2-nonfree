import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!of;")
	public static final Class174 aClass174_202 = new Class174("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!gh;")
	public static final Class84 aClass84_1 = new Class84();

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5838(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(25) char local25 = arg0.charAt(local12);
			if (local25 >= 'A' && local25 <= 'Z') {
				local7 += local25 + 1 - 65;
			} else if (local25 >= 'a' && local25 <= 'z') {
				local7 += local25 - 96;
			} else if (local25 >= '0' && local25 <= '9') {
				local7 += local25 + 27 - 48;
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
