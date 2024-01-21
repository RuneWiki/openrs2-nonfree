import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class36 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
	public static int[] anIntArray159 = new int[32];

	static {
		@Pc(19) int local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			anIntArray159[local21] = local19 - 1;
			local19 += local19;
		}
	}
}
