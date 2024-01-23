import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class135 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "[I")
	public static int[] anIntArray473 = new int[2048];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public static int[] anIntArray472 = new int[2048];

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "[I")
	private static int[] anIntArray477 = new int[512];

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "[I")
	public static int[] anIntArray474 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray477[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray473[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray472[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray474[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
