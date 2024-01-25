import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class171 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
	public static final int[] anIntArray394 = new int[99];

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray394[local24] = local22 / 4;
		}
	}
}
