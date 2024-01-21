import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub3_Sub1_Sub4 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!ta", name = "cb", descriptor = "[I")
	private static final int[] anIntArray318 = new int[512];

	@OriginalMember(owner = "client!ta", name = "V", descriptor = "[I")
	public static final int[] anIntArray317 = new int[2048];

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "[I")
	public static final int[] anIntArray320 = new int[2048];

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "[I")
	public static final int[] anIntArray321 = new int[2048];

	static {
		for (@Pc(31) int local31 = 1; local31 < 512; local31++) {
			anIntArray318[local31] = 32768 / local31;
		}
		for (@Pc(44) int local44 = 1; local44 < 2048; local44++) {
			anIntArray321[local44] = 65536 / local44;
		}
		for (@Pc(57) int local57 = 0; local57 < 2048; local57++) {
			anIntArray320[local57] = (int) (Math.sin((double) local57 * 0.0030679615D) * 65536.0D);
			anIntArray317[local57] = (int) (Math.cos((double) local57 * 0.0030679615D) * 65536.0D);
		}
	}
}
