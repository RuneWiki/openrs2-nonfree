import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class35 {

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
	public static int[] anIntArray120 = new int[32];

	static {
		@Pc(21) int local21 = 2;
		for (@Pc(23) int local23 = 0; local23 < 32; local23++) {
			anIntArray120[local23] = local21 - 1;
			local21 += local21;
		}
	}
}
