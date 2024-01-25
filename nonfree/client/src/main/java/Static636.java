import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "Lclient!nf;")
	public static Class102 aClass102_38;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	public static int anInt9817;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "Lclient!qs;")
	public static Class299 aClass299_1 = new Class299(8);

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	public static int anInt9818 = 1;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method8360(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + ((long) arg0.charAt(local17)) - local10;
		}
		return local10;
	}
}
