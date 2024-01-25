import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "J")
	private static long aLong227;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "J")
	private static long aLong228;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)J")
	public static synchronized long method5863() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong227) {
			aLong228 += aLong227 - local6;
		}
		aLong227 = local6;
		return local6 + aLong228;
	}
}
