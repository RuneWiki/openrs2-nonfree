import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub2_Sub5_Sub2 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "[I")
	private static final int[] anIntArray137 = new int[512];

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "[I")
	public static final int[] anIntArray138 = new int[2048];

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "[I")
	public static final int[] anIntArray140 = new int[2048];

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "[I")
	public static final int[] anIntArray142 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray137[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray140[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray138[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray142[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
