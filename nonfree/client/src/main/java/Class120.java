import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class120 {

	@OriginalMember(owner = "client!va", name = "f", descriptor = "[I")
	public static int[] anIntArray492 = new int[2048];

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
	public static int[] anIntArray493 = new int[2048];

	@OriginalMember(owner = "client!va", name = "p", descriptor = "[I")
	private static int[] anIntArray495 = new int[512];

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	public static int[] anIntArray491 = new int[2048];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray495[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray493[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray491[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray492[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
