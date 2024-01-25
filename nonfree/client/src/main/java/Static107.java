import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "J")
	private static long aLong61;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "J")
	private static long aLong62;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)J")
	public static synchronized long method1707() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong62 > local1) {
			aLong61 += aLong62 - local1;
		}
		aLong62 = local1;
		return aLong61 + local1;
	}
}
