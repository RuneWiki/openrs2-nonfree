import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class260 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public static final int[] anIntArray408 = new int[32];

	static {
		@Pc(19) int local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			anIntArray408[local21] = local19 - 1;
			local19 += local19;
		}
	}
}
