import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class62 {

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "[I")
	public static final int[] anIntArray198 = new int[32];

	static {
		@Pc(22) int local22 = 2;
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			anIntArray198[local24] = local22 - 1;
			local22 += local22;
		}
	}
}
