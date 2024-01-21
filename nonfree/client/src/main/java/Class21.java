import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class21 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "[I")
	public static final int[] anIntArray135 = new int[99];

	static {
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < 99; local18++) {
			@Pc(23) int local23 = local18 + 1;
			@Pc(36) int local36 = (int) (Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D + (double) local23);
			local16 += local36;
			anIntArray135[local18] = local16 / 4;
		}
	}
}
