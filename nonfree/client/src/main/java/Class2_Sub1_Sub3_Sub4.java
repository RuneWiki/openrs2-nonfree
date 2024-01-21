import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub1_Sub3_Sub4 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!ub", name = "mb", descriptor = "[I")
	public static int[] anIntArray377 = new int[2048];

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "[I")
	public static int[] anIntArray376 = new int[2048];

	@OriginalMember(owner = "client!ub", name = "tb", descriptor = "[I")
	public static int[] anIntArray379 = new int[2048];

	@OriginalMember(owner = "client!ub", name = "fb", descriptor = "[I")
	public static int[] anIntArray375 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray375[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray377[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray379[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray376[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
