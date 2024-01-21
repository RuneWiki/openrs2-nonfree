import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub2_Sub2_Sub2 extends Class3_Sub2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "[I")
	public static int[] anIntArray126 = new int[512];

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "[I")
	public static int[] anIntArray127 = new int[2048];

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "[I")
	public static int[] anIntArray131 = new int[2048];

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "[I")
	public static int[] anIntArray129 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray126[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray131[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray127[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray129[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
