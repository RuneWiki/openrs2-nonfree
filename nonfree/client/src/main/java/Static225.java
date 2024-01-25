import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public static int anInt4353;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	public static int anInt4357;

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "[I")
	public static final int[] anIntArray342 = new int[14];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method4055(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) - (local15 - ((long) arg0.charAt(local17)));
		}
		return local15;
	}
}
