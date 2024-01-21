import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class2_Sub2_Sub3_Sub1 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!ba", name = "eb", descriptor = "[I")
	public static int[] anIntArray52 = new int[2048];

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "[I")
	public static int[] anIntArray50 = new int[2048];

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "[I")
	public static int[] anIntArray54 = new int[2048];

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "[I")
	public static int[] anIntArray55 = new int[512];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray55[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray54[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray50[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray52[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
