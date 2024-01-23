import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class79 {

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
	public static int[] anIntArray375 = new int[2048];

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "[I")
	public static int[] anIntArray374 = new int[2048];

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	private static int[] anIntArray376 = new int[512];

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[I")
	public static int[] anIntArray377 = new int[2048];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray376[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray374[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray377[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray375[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
