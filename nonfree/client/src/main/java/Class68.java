import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class68 {

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "[I")
	public static int[] anIntArray228 = new int[2048];

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
	public static int[] anIntArray226 = new int[2048];

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	private static int[] anIntArray225 = new int[512];

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
	public static int[] anIntArray229 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray225[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray228[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray229[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray226[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
