import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class126 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public static int[] anIntArray360 = new int[99];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(13) int local13 = local6 + 1;
			@Pc(26) int local26 = (int) ((double) local13 + Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D);
			local4 += local26;
			anIntArray360[local6] = local4 / 4;
		}
	}
}
