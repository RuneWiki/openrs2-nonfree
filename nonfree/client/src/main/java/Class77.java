import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class77 {

	@OriginalMember(owner = "client!q", name = "i", descriptor = "[I")
	public static int[] anIntArray629 = new int[2048];

	@OriginalMember(owner = "client!q", name = "m", descriptor = "[I")
	public static int[] anIntArray631 = new int[2048];

	@OriginalMember(owner = "client!q", name = "q", descriptor = "[I")
	public static int[] anIntArray632 = new int[2048];

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
	private static int[] anIntArray628 = new int[512];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray628[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray629[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray631[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray632[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
