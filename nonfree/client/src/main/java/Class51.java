import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class51 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
	public static int[] anIntArray150 = new int[99];

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 99; local16++) {
			@Pc(21) int local21 = local16 + 1;
			@Pc(34) int local34 = (int) ((double) local21 + Math.pow(2.0D, (double) local21 / 7.0D) * 300.0D);
			local14 += local34;
			anIntArray150[local16] = local14 / 4;
		}
	}
}
