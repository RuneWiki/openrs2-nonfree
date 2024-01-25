import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "D")
	public static double aDouble27;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "Lclient!gw;")
	public static Class127 aClass127_9;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "[Lclient!cj;")
	public static Class60[] aClass60Array10;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public static int anInt8266 = 0;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_174 = new Class180(13, -2);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7240(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
