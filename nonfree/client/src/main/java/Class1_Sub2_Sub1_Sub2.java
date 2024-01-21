import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!b", name = "S", descriptor = "[I")
	public static int[] anIntArray38 = new int[2048];

	@OriginalMember(owner = "client!b", name = "O", descriptor = "[I")
	public static int[] anIntArray37 = new int[2048];

	@OriginalMember(owner = "client!b", name = "db", descriptor = "[I")
	public static int[] anIntArray41 = new int[2048];

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "[I")
	public static int[] anIntArray42 = new int[512];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray42[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray37[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray41[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray38[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
