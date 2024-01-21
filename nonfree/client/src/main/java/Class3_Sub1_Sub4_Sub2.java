import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class3_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "[I")
	private static final int[] anIntArray189 = new int[512];

	@OriginalMember(owner = "client!hb", name = "T", descriptor = "[I")
	public static final int[] anIntArray185 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
	public static final int[] anIntArray188 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "[I")
	public static final int[] anIntArray190 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray189[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray185[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray188[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray190[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
