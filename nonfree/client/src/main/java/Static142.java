import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "[Lclient!sp;")
	public static Class344[] aClass344Array1;

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "[I")
	public static final int[] anIntArray127 = new int[1];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2360(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(FFBF)F")
	public static float method2362(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg0 * (arg1 - arg2);
	}
}
