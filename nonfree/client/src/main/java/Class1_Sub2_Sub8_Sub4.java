import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub2_Sub8_Sub4 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "[I")
	public static final int[] anIntArray350 = new int[2048];

	@OriginalMember(owner = "client!tf", name = "U", descriptor = "[I")
	private static final int[] anIntArray352 = new int[512];

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "[I")
	public static final int[] anIntArray353 = new int[2048];

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "[I")
	public static final int[] anIntArray355 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray352[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray353[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray350[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray355[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
