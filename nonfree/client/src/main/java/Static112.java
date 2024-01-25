import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_66 = new Class77(63, 8);

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	public static int anInt2244 = -1;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method2148(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
