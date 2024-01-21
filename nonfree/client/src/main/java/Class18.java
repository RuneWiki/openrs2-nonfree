import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public class Class18 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
	public static final int[] anIntArray447 = new int[99];

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 99; local18++) {
			@Pc(23) int local23 = local18 + 1;
			@Pc(36) int local36 = (int) (Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D + (double) local23);
			local16 += local36;
			anIntArray447[local18] = local16 / 4;
		}
	}
}
