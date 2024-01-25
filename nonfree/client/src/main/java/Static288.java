import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "J")
	private static long aLong190;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "J")
	private static long aLong191;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)J")
	public static synchronized long method4512() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong190 > local1) {
			aLong191 += aLong190 - local1;
		}
		aLong190 = local1;
		return aLong191 + local1;
	}
}
