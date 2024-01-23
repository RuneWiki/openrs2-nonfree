import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class45 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
	public static int[] anIntArray155 = new int[2048];

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
	public static int[] anIntArray156 = new int[2048];

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
	public static int[] anIntArray159 = new int[2048];

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
	private static int[] anIntArray160 = new int[512];

	static {
		for (@Pc(33) int local33 = 1; local33 < 512; local33++) {
			anIntArray160[local33] = 32768 / local33;
		}
		for (@Pc(46) int local46 = 1; local46 < 2048; local46++) {
			anIntArray155[local46] = 65536 / local46;
		}
		for (@Pc(59) int local59 = 0; local59 < 2048; local59++) {
			anIntArray159[local59] = (int) (Math.sin((double) local59 * 0.0030679615D) * 65536.0D);
			anIntArray156[local59] = (int) (Math.cos((double) local59 * 0.0030679615D) * 65536.0D);
		}
	}
}
