import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class79 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
	public static final int[] anIntArray189 = new int[32];

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray189[local16] = local14 - 1;
			local14 += local14;
		}
	}
}
