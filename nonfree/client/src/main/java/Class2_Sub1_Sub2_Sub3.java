import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class2_Sub1_Sub2_Sub3 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "[I")
	public static int[] anIntArray102 = new int[2048];

	@OriginalMember(owner = "client!eb", name = "Nb", descriptor = "[I")
	public static int[] anIntArray106 = new int[2048];

	@OriginalMember(owner = "client!eb", name = "Kb", descriptor = "[I")
	public static int[] anIntArray105 = new int[512];

	@OriginalMember(owner = "client!eb", name = "Qb", descriptor = "[I")
	public static int[] anIntArray107 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray105[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray102[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray106[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray107[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
