import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub1_Sub4_Sub4 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[I")
	public static int[] anIntArray299 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[I")
	public static int[] anIntArray302 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "[I")
	public static int[] anIntArray300 = new int[512];

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[I")
	public static int[] anIntArray304 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray300[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray302[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray299[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray304[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
