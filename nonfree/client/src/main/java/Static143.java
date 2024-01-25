import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "J")
	private static long aLong76;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "J")
	private static long aLong77;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)J")
	public static synchronized long method2502() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong76) {
			aLong77 += aLong76 - local1;
		}
		aLong76 = local1;
		return aLong77 + local1;
	}
}
