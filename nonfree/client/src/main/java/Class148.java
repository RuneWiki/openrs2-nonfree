import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class148 {

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "[I")
	public static final int[] anIntArray221 = new int[120];

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 120; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) (Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D + (double) local21);
			local14 += local34;
			anIntArray221[local16] = local14 / 4;
		}
	}
}
