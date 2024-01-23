import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class66 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
	private static int[] anIntArray150 = new int[512];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
	public static int[] anIntArray148 = new int[2048];

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	public static int[] anIntArray149 = new int[2048];

	@OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
	public static int[] anIntArray153 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray150[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray149[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray148[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray153[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
