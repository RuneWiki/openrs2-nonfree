import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class29 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
	public static int[] anIntArray133 = new int[32];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray133[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
