import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class2_Sub2_Sub2_Sub4 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "[I")
	public static int[] anIntArray217 = new int[2048];

	@OriginalMember(owner = "client!nc", name = "bb", descriptor = "[I")
	public static int[] anIntArray218 = new int[2048];

	@OriginalMember(owner = "client!nc", name = "cb", descriptor = "[I")
	public static int[] anIntArray219 = new int[2048];

	@OriginalMember(owner = "client!nc", name = "fb", descriptor = "[I")
	public static int[] anIntArray220 = new int[512];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray220[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray219[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray217[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray218[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
