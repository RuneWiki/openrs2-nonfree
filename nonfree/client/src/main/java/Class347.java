import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class347 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
	public static final int[] anIntArray566 = new int[32];

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray566[local12] = local10 - 1;
			local10 += local10;
		}
	}
}
