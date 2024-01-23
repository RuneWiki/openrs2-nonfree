import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class46 {

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	public static int[] anIntArray224 = new int[2048];

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	public static int[] anIntArray225 = new int[2048];

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
	public static int[] anIntArray226 = new int[2048];

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "[I")
	private static int[] anIntArray223 = new int[512];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray223[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray224[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray226[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray225[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
