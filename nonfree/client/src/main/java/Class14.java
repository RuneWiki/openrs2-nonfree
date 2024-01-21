import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class14 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[I")
	public static final int[] anIntArray58 = new int[32];

	static {
		@Pc(16) int local16 = 2;
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			anIntArray58[local18] = local16 - 1;
			local16 += local16;
		}
	}
}
