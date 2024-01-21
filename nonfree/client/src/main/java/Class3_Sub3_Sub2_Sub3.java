import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class3_Sub3_Sub2_Sub3 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!jd", name = "ib", descriptor = "[I")
	public static int[] anIntArray224 = new int[512];

	@OriginalMember(owner = "client!jd", name = "nb", descriptor = "[I")
	public static int[] anIntArray227 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "jb", descriptor = "[I")
	public static int[] anIntArray225 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "kb", descriptor = "[I")
	public static int[] anIntArray226 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray224[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray227[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray226[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray225[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
