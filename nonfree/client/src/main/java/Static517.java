import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sha", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString100 = null;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method7435(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local20) - local10;
		}
		return local10;
	}
}
