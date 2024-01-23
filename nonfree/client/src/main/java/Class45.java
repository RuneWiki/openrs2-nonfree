import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class45 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "[I")
	public static int[] anIntArray97 = new int[32];

	static {
		@Pc(20) int local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			anIntArray97[local22] = local20 - 1;
			local20 += local20;
		}
	}
}
