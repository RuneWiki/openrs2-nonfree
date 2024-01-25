import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "J")
	private static long aLong199;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "J")
	private static long aLong200;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)J")
	public static synchronized long method5293() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong200) {
			aLong199 += aLong200 - local1;
		}
		aLong200 = local1;
		return local1 + aLong199;
	}
}
