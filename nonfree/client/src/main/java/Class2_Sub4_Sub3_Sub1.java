import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub4_Sub3_Sub1 extends Class2_Sub4_Sub3 {

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "[I")
	public static int[] anIntArray56 = new int[512];

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "[I")
	public static int[] anIntArray57 = new int[2048];

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "[I")
	public static int[] anIntArray60 = new int[2048];

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "[I")
	public static int[] anIntArray58 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray56[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray57[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray58[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray60[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
