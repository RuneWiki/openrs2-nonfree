import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!t", name = "tb", descriptor = "[I")
	public static int[] anIntArray295 = new int[2048];

	@OriginalMember(owner = "client!t", name = "jb", descriptor = "[I")
	public static int[] anIntArray293 = new int[2048];

	@OriginalMember(owner = "client!t", name = "xb", descriptor = "[I")
	public static int[] anIntArray298 = new int[2048];

	@OriginalMember(owner = "client!t", name = "ub", descriptor = "[I")
	public static int[] anIntArray296 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray296[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray293[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray295[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray298[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
