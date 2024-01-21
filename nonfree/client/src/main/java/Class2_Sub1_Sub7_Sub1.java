import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub1_Sub7_Sub1 extends Class2_Sub1_Sub7 {

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "[I")
	public static final int[] anIntArray129 = new int[2048];

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "[I")
	public static final int[] anIntArray133 = new int[2048];

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "[I")
	private static final int[] anIntArray134 = new int[512];

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "[I")
	public static final int[] anIntArray130 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray134[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray130[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray133[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray129[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
