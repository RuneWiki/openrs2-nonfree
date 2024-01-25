import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class64 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public static final int[] anIntArray204 = new int[99];

	static {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 99; local9++) {
			@Pc(14) int local14 = local9 + 1;
			@Pc(27) int local27 = (int) ((double) local14 + Math.pow(2.0D, (double) local14 / 7.0D) * 300.0D);
			local7 += local27;
			anIntArray204[local9] = local7 / 4;
		}
	}
}
