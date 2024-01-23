import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class11 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
	public static int[] anIntArray27 = new int[2048];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	public static int[] anIntArray26 = new int[2048];

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
	public static int[] anIntArray28 = new int[2048];

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[I")
	private static int[] anIntArray30 = new int[512];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray30[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray28[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray26[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray27[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
