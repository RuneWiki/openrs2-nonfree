import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[128][128];

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)V")
	public static void method8428() {
		if (Static40.anInterface13Array1 == null) {
			return;
		}
		@Pc(9) Interface13[] local9 = Static40.anInterface13Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface13 local17 = local9[local11];
			local17.method7042();
		}
	}
}
