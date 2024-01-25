import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "J")
	private static long aLong58;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "J")
	private static long aLong59;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)J")
	public static synchronized long method1557() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong59) {
			aLong58 += aLong59 - local1;
		}
		aLong59 = local1;
		return local1 + aLong58;
	}
}
