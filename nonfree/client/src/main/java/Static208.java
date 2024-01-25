import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "J")
	private static long aLong133;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "J")
	private static long aLong134;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)J")
	public static synchronized long method3879() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong133 > local6) {
			aLong134 += aLong133 - local6;
		}
		aLong133 = local6;
		return aLong134 + local6;
	}
}
