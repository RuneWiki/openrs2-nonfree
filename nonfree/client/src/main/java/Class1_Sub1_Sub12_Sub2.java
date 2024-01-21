import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class1_Sub1_Sub12_Sub2 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "[I")
	public static int[] anIntArray418 = new int[512];

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "[I")
	public static int[] anIntArray417 = new int[2048];

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "[I")
	public static int[] anIntArray420 = new int[2048];

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "[I")
	public static int[] anIntArray416 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray418[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray420[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray416[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray417[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
