import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub3_Sub2_Sub2 extends Class2_Sub3_Sub2 {

	@OriginalMember(owner = "client!md", name = "H", descriptor = "[I")
	public static int[] anIntArray206 = new int[2048];

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "[I")
	public static int[] anIntArray207 = new int[2048];

	@OriginalMember(owner = "client!md", name = "U", descriptor = "[I")
	public static int[] anIntArray208 = new int[2048];

	@OriginalMember(owner = "client!md", name = "Y", descriptor = "[I")
	public static int[] anIntArray210 = new int[512];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray210[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray206[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray208[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray207[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
