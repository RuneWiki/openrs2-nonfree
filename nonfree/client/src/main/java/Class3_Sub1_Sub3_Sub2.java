import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "[I")
	public static int[] anIntArray83 = new int[2048];

	@OriginalMember(owner = "client!eb", name = "ab", descriptor = "[I")
	public static int[] anIntArray84 = new int[512];

	@OriginalMember(owner = "client!eb", name = "ib", descriptor = "[I")
	public static int[] anIntArray87 = new int[2048];

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "[I")
	public static int[] anIntArray88 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray84[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray83[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray87[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray88[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
