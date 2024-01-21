import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "[I")
	public static int[] anIntArray53 = new int[512];

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "[I")
	public static int[] anIntArray52 = new int[2048];

	@OriginalMember(owner = "client!be", name = "ub", descriptor = "[I")
	public static int[] anIntArray56 = new int[2048];

	@OriginalMember(owner = "client!be", name = "mb", descriptor = "[I")
	public static int[] anIntArray55 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray53[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray52[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray55[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray56[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
