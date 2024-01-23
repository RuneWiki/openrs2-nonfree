import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class111 {

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
	private static int[] anIntArray296 = new int[512];

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "[I")
	public static int[] anIntArray298 = new int[2048];

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "[I")
	public static int[] anIntArray300 = new int[2048];

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
	public static int[] anIntArray299 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray296[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray300[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray299[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray298[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
