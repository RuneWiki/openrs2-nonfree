import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class296 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
	public static final int[] anIntArray586 = new int[32];

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray586[local10] = local8 - 1;
			local8 += local8;
		}
	}
}
