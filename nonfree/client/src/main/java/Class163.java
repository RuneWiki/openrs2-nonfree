import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class163 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "[I")
	public static final int[] anIntArray277 = new int[120];

	static {
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < 120; local25++) {
			@Pc(30) int local30 = local25 + 1;
			@Pc(43) int local43 = (int) ((double) local30 + Math.pow(2.0D, (double) local30 / 7.0D) * 300.0D);
			local23 += local43;
			anIntArray277[local25] = local23 / 4;
		}
	}
}
