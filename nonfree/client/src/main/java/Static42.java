import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "Lclient!bi;")
	public static final Class33 aClass33_1 = new Class33(1);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method845(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}
}
