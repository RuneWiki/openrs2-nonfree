import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class164 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
	public static final int[] anIntArray386 = new int[32];

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray386[local10] = local8 - 1;
			local8 += local8;
		}
	}
}
