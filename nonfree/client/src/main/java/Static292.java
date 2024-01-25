import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "J")
	private static long aLong186;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "J")
	private static long aLong187;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)J")
	public static synchronized long method5114() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong186) {
			aLong187 += aLong186 - local1;
		}
		aLong186 = local1;
		return aLong187 + local1;
	}
}
