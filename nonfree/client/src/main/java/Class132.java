import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class132 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "[I")
	public static int[] anIntArray440 = new int[2048];

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	public static int[] anIntArray442 = new int[2048];

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
	public static int[] anIntArray439 = new int[2048];

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[I")
	private static int[] anIntArray441 = new int[512];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray441[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray442[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray440[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray439[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
