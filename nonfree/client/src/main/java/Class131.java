import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class131 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
	public static int[] anIntArray350 = new int[512];

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[I")
	public static int[] anIntArray353 = new int[2048];

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "[I")
	public static int[] anIntArray351 = new int[2048];

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
	public static int[] anIntArray355 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray350[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray351[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray355[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray353[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
