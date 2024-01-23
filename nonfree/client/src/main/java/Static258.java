import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "J")
	private static long aLong199;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "J")
	private static long aLong200;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)J")
	public static synchronized long method3967() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (local9 < aLong200) {
			aLong199 += aLong200 - local9;
		}
		aLong200 = local9;
		return local9 + aLong199;
	}
}
