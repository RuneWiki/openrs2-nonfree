import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class80 {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
	private static final int[] anIntArray323 = new int[512];

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "[I")
	public static final int[] anIntArray326 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
	public static final int[] anIntArray327 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "[I")
	public static final int[] anIntArray324 = new int[2048];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray323[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray326[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray324[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray327[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
