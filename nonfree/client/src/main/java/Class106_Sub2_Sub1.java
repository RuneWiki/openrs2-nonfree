import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class106_Sub2_Sub1 extends Class106_Sub2 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
	public static final int[] anIntArray248 = new int[120];

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) ((double) local14 + Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D);
			local7 += local27;
			anIntArray248[local9] = local7 / 4;
		}
	}
}
