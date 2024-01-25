import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "F")
	public static float aFloat73 = 0.0F;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "S")
	public static short aShort81 = 256;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_48 = new Class243(72, -1);

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3632(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + ((long) arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}
