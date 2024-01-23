import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class68 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
	public static int[] anIntArray134 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "[I")
	private static int[] anIntArray138 = new int[512];

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "[I")
	public static int[] anIntArray139 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static int[] anIntArray137 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray138[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray134[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray137[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray139[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
