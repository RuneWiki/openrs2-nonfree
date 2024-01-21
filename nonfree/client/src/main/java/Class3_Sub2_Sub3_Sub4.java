import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub2_Sub3_Sub4 extends Class3_Sub2_Sub3 {

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "[I")
	public static int[] anIntArray345 = new int[512];

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "[I")
	public static int[] anIntArray346 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "[I")
	public static int[] anIntArray347 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "Z", descriptor = "[I")
	public static int[] anIntArray350 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray345[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray350[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray347[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray346[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
