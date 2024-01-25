import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class56 {

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "[I")
	public static final int[] anIntArray173 = new int[32];

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray173[local8] = local6 - 1;
			local6 += local6;
		}
	}
}
