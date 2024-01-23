import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class174 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[I")
	public static int[] anIntArray440 = new int[2048];

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[I")
	private static int[] anIntArray442 = new int[512];

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	public static int[] anIntArray444 = new int[2048];

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[I")
	public static int[] anIntArray443 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray442[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray440[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray444[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray443[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
