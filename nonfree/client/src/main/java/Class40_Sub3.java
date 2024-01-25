import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
	public static final int[] anIntArray499 = new int[32];

	static {
		@Pc(20) int local20 = 2;
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			anIntArray499[local22] = local20 - 1;
			local20 += local20;
		}
	}
}
