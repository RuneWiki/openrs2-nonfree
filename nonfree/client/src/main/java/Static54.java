import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public static int anInt860;

	@OriginalMember(owner = "client!cl", name = "k", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
	public static int[] anIntArray93 = new int[2];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method713(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + ((long) arg0.charAt(local17)) - local15;
		}
		return local15;
	}
}
