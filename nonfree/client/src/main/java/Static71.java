import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "J")
	private static long aLong57;

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "J")
	private static long aLong58;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)J")
	public static synchronized long method1143() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong58) {
			aLong57 += aLong58 - local7;
		}
		aLong58 = local7;
		return local7 + aLong57;
	}
}
