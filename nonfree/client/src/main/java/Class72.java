import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class72 {

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
	public static int[] anIntArray307 = new int[99];

	static {
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < 99; local116++) {
			@Pc(121) int local121 = local116 + 1;
			@Pc(134) int local134 = (int) ((double) local121 + Math.pow(2.0D, (double) local121 / 7.0D) * 300.0D);
			local114 += local134;
			anIntArray307[local116] = local114 / 4;
		}
	}
}
