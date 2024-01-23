import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class17 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	public static int[] anIntArray22 = new int[2048];

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
	public static int[] anIntArray23 = new int[2048];

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "[I")
	private static int[] anIntArray27 = new int[512];

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
	public static int[] anIntArray24 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray27[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray23[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray22[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray24[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
