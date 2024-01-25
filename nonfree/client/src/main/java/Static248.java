import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
	public static int anInt4083;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_75 = new Class216(68, 8);

	@OriginalMember(owner = "client!ifa", name = "s", descriptor = "Lclient!ko;")
	public static final Class198 aClass198_7 = new Class198();

	@OriginalMember(owner = "client!ifa", name = "t", descriptor = "[I")
	public static int[] anIntArray296 = new int[2];

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method3642(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			local7 *= 37L;
			@Pc(29) char local29 = arg0.charAt(local19);
			if (local29 >= 'A' && local29 <= 'Z') {
				local7 += (long) (local29 + 1 - 65);
			} else if (local29 >= 'a' && local29 <= 'z') {
				local7 += (long) (local29 - 96);
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

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!es;I)Lclient!ks;")
	public static Class201 method3649(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(12) int local12 = arg0.method8850();
		return new Class201(local12);
	}
}
