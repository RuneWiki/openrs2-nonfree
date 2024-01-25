import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "(B)V")
	public static void method9024() {
		if (Static262.anInterface6Array1 == null) {
			return;
		}
		@Pc(5) Interface6[] local5 = Static262.anInterface6Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface6 local13 = local5[local7];
			local13.method7226();
		}
	}
}
