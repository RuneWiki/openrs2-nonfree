import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "[I")
	public static int[] anIntArray28 = new int[512];

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "[I")
	public static int[] anIntArray30 = new int[2048];

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "[I")
	public static int[] anIntArray33 = new int[2048];

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "[I")
	public static int[] anIntArray31 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray28[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray31[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray30[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray33[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
