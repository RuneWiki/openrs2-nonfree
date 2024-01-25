import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_22 = new Class397(108, -1);

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "[I")
	public static final int[] anIntArray87 = new int[50];

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "[I")
	public static final int[] anIntArray88 = new int[64];

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_5 = new Class320(70);

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1525(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += (long) (local29 - 64);
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += (long) (local29 + 1 - 97);
			} else if (local29 >= '0' && local29 <= '9') {
				local7 += (long) (local29 + 27 - 48);
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
