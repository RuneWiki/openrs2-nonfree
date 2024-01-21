import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class40 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
	public static int[] anIntArray276 = new int[32];

	static {
		@Pc(91) int local91 = 2;
		for (@Pc(93) int local93 = 0; local93 < 32; local93++) {
			anIntArray276[local93] = local91 - 1;
			local91 += local91;
		}
	}
}
