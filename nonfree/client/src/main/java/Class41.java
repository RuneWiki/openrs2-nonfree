import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class41 {

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
	public static final int[] anIntArray146 = new int[99];

	static {
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 99; local21++) {
			@Pc(26) int local26 = local21 + 1;
			@Pc(39) int local39 = (int) (Math.pow(2.0D, (double) local26 / 7.0D) * 300.0D + (double) local26);
			local19 += local39;
			anIntArray146[local21] = local19 / 4;
		}
	}
}
