import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
	public static int[] anIntArray1 = new int[2048];

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray3 = new int[2048];

	@OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
	public static int[] anIntArray4 = new int[2048];

	@OriginalMember(owner = "client!a", name = "k", descriptor = "[I")
	private static int[] anIntArray5 = new int[512];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray5[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray1[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray4[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray3[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
