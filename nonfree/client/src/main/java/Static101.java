import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "J")
	private static long aLong70;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "J")
	private static long aLong71;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)J")
	public static synchronized long method1677() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong71 > local1) {
			aLong70 += aLong71 - local1;
		}
		aLong71 = local1;
		return local1 + aLong70;
	}
}
