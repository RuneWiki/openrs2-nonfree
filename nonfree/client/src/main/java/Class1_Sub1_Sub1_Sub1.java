import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "R", descriptor = "[I")
	public static int[] anIntArray7 = new int[512];

	@OriginalMember(owner = "client!a", name = "V", descriptor = "[I")
	public static int[] anIntArray8 = new int[2048];

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "[I")
	public static int[] anIntArray6 = new int[2048];

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "[I")
	public static int[] anIntArray11 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray7[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray6[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray11[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray8[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
