import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "J")
	private static long aLong65;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "J")
	private static long aLong66;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)J")
	public static synchronized long method1119() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong66) {
			aLong65 += aLong66 - local7;
		}
		aLong66 = local7;
		return aLong65 + local7;
	}
}
