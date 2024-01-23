import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class91 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
	public static int[] anIntArray319 = new int[2048];

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "[I")
	private static int[] anIntArray323 = new int[512];

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
	public static int[] anIntArray320 = new int[2048];

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "[I")
	public static int[] anIntArray321 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray323[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray321[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray319[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray320[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
