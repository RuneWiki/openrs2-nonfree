import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class114 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
	public static int[] anIntArray338 = new int[32];

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray338[local10] = local8 - 1;
			local8 += local8;
		}
	}
}
