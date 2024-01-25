import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
	private static long aLong134;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "J")
	private static long aLong135;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)J")
	public static synchronized long method3737() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong135 > local1) {
			aLong134 += aLong135 - local1;
		}
		aLong135 = local1;
		return aLong134 + local1;
	}
}
