import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "J")
	private static long aLong382;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
	private static long aLong383;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)J")
	public static synchronized long method5870() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong383) {
			aLong382 += aLong383 - local7;
		}
		aLong383 = local7;
		return aLong382 + local7;
	}
}
