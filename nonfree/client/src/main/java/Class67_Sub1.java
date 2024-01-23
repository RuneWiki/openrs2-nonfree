import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "[I")
	public static int[] anIntArray362 = new int[99];

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 99; local14++) {
			@Pc(23) int local23 = local14 + 1;
			@Pc(36) int local36 = (int) (Math.pow(2.0D, (double) local23 / 7.0D) * 300.0D + (double) local23);
			local12 += local36;
			anIntArray362[local14] = local12 / 4;
		}
	}
}
