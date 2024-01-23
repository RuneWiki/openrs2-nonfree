import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "J")
	private static long aLong176;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "J")
	private static long aLong177;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)J")
	public static synchronized long method3859() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong177) {
			aLong176 += aLong177 - local1;
		}
		aLong177 = local1;
		return aLong176 + local1;
	}
}
