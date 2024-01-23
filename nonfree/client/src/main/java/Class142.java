import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class142 {

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
	public static int[] anIntArray460 = new int[32];

	static {
		@Pc(162) int local162 = 2;
		for (@Pc(164) int local164 = 0; local164 < 32; local164++) {
			anIntArray460[local164] = local162 - 1;
			local162 += local162;
		}
	}
}
