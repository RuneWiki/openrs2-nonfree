import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class135 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public static int[] anIntArray335 = new int[2048];

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
	private static int[] anIntArray336 = new int[512];

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[I")
	public static int[] anIntArray338 = new int[2048];

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
	public static int[] anIntArray339 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray336[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray339[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray335[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray338[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
