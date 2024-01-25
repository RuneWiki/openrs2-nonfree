import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lclient!vi;")
	public static Class206[] aClass206Array20;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!lm;")
	public static Class134 aClass134_152;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
	public static int anInt6717 = 0;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt6720 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method5818(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(6, arg0);
		local12.method4782();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public static void method5820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(15, 0);
		local12.method4783();
		local12.anInt5467 = arg1;
		local12.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method5823(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(18) int local18 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 - 64;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 + 1 - 97;
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
