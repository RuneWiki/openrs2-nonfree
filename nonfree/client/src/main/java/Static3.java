import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "[[Lclient!lo;")
	public static Class6_Sub1[][] aClass6_Sub1ArrayArray1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_4 = new Class363(73, -1);

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_5 = new Class363(32, 2);

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lclient!rca;")
	public static final Class280 aClass280_1 = new Class280();

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "[I")
	public static final int[] anIntArray1 = new int[14];

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method14(@OriginalArg(1) String arg0) {
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
				local7 += local22 + 27 - 48;
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
