import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	public static int anInt4558;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "Lclient!rv;")
	public static Class321 aClass321_2 = new Class321(8);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method4116(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (((long) arg0.charAt(local17)) - local15);
		}
		return local15;
	}
}
