import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public static int anInt6180;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Lclient!mv;")
	public static Class229 aClass229_88;

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Lclient!ida;")
	public static Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5177(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(22) char local22 = arg0.charAt(local12);
			if (local22 >= 'A' && local22 <= 'Z') {
				local7 += local22 - 64;
			} else if (local22 >= 'a' && local22 <= 'z') {
				local7 += local22 + 1 - 97;
			} else if (local22 >= '0' && local22 <= '9') {
				local7 += local22 - 21;
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
