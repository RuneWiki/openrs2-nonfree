import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class4_Sub1_Sub7_Sub4 extends Class4_Sub1_Sub7 {

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "[I")
	public static final int[] anIntArray412 = new int[2048];

	@OriginalMember(owner = "client!uf", name = "V", descriptor = "[I")
	public static final int[] anIntArray415 = new int[2048];

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "[I")
	private static final int[] anIntArray417 = new int[512];

	@OriginalMember(owner = "client!uf", name = "Z", descriptor = "[I")
	public static final int[] anIntArray416 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray417[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray415[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray412[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray416[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
