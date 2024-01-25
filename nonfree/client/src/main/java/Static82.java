import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!wf;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
	public static final int[] anIntArray72 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
	public static final int[] anIntArray73 = new int[25];

	@OriginalMember(owner = "client!e", name = "c", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "I")
	public static int anInt1487 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1180(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
