import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class146 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
	private static int[] anIntArray460 = new int[512];

	@OriginalMember(owner = "client!re", name = "f", descriptor = "[I")
	public static int[] anIntArray461 = new int[2048];

	@OriginalMember(owner = "client!re", name = "m", descriptor = "[I")
	public static int[] anIntArray463 = new int[2048];

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
	public static int[] anIntArray459 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray460[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray459[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray461[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray463[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
