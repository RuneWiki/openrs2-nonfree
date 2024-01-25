import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class306 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "[I")
	public static final int[] anIntArray539 = new int[32];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray539[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
