import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class94 {

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "[I")
	private static int[] anIntArray275 = new int[512];

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
	public static int[] anIntArray276 = new int[2048];

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "[I")
	public static int[] anIntArray278 = new int[2048];

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
	public static int[] anIntArray277 = new int[2048];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray275[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray276[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray278[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray277[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
