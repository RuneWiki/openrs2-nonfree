import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "J")
	private static long aLong27;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "J")
	private static long aLong28;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)J")
	public static synchronized long method591() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (local9 < aLong28) {
			aLong27 += aLong28 - local9;
		}
		aLong28 = local9;
		return aLong27 + local9;
	}
}
