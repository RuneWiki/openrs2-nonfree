import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class87 {

	@OriginalMember(owner = "client!im", name = "l", descriptor = "[I")
	private static int[] anIntArray175 = new int[512];

	@OriginalMember(owner = "client!im", name = "g", descriptor = "[I")
	public static int[] anIntArray173 = new int[2048];

	@OriginalMember(owner = "client!im", name = "o", descriptor = "[I")
	public static int[] anIntArray176 = new int[2048];

	@OriginalMember(owner = "client!im", name = "q", descriptor = "[I")
	public static int[] anIntArray177 = new int[2048];

	static {
		@Pc(33) int local33;
		for (local33 = 1; local33 < 512; local33++) {
			anIntArray175[local33] = 32768 / local33;
		}
		for (local33 = 1; local33 < 2048; local33++) {
			anIntArray176[local33] = 65536 / local33;
		}
		for (local33 = 0; local33 < 2048; local33++) {
			anIntArray173[local33] = (int) (Math.sin((double) local33 * 0.0030679615D) * 65536.0D);
			anIntArray177[local33] = (int) (Math.cos((double) local33 * 0.0030679615D) * 65536.0D);
		}
	}
}
