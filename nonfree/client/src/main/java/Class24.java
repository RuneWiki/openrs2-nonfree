import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class24 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
	public static int[] anIntArray111 = new int[99];

	static {
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 99; local23++) {
			@Pc(28) int local28 = local23 + 1;
			@Pc(41) int local41 = (int) ((double) local28 + Math.pow(2.0D, (double) local28 / 7.0D) * 300.0D);
			local21 += local41;
			anIntArray111[local23] = local21 / 4;
		}
	}
}
