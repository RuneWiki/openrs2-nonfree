import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!gda;")
	public static Class126 aClass126_115;

	@OriginalMember(owner = "client!hv", name = "v", descriptor = "Lclient!mj;")
	public static Class238 aClass238_4 = null;

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
	public static int anInt3962 = 0;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3630(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
