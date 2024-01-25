import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "J")
	private static long aLong32;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
	private static long aLong33;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)J")
	public static synchronized long method1679() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong32 > local6) {
			aLong33 += aLong32 - local6;
		}
		aLong32 = local6;
		return local6 + aLong33;
	}
}
