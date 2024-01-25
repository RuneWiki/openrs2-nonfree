import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cn", name = "K", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!cn", name = "L", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!cn", name = "O", descriptor = "[I")
	public static final int[] anIntArray113 = new int[4096];

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V")
	public static void method1050() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static223.aBooleanArray28[local3] = true;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1053(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local10 = (long) arg0.charAt(local20) + (local10 << 5) - local10;
		}
		return local10;
	}
}
