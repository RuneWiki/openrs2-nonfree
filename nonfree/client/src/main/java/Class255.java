import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class255 {

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "[I")
	public static final int[] anIntArray684 = new int[99];

	static {
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < 99; local29++) {
			@Pc(34) int local34 = local29 + 1;
			@Pc(47) int local47 = (int) ((double) local34 + Math.pow(2.0D, (double) local34 / 7.0D) * 300.0D);
			local27 += local47;
			anIntArray684[local29] = local27 / 4;
		}
	}
}
