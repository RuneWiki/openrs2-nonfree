import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "J")
	private static long aLong133;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
	private static long aLong134;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)J")
	public static synchronized long method3462() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong134) {
			aLong133 += aLong134 - local1;
		}
		aLong134 = local1;
		return local1 + aLong133;
	}
}
