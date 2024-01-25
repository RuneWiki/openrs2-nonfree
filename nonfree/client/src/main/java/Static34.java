import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!fg;")
	public static Class108 aClass108_2;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString8 = "";

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method591(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (long) arg0.charAt(local10) + (local8 << 5) - local8;
		}
		return local8;
	}
}
