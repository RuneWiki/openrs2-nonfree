import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub2_Sub2_Sub1 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!b", name = "V", descriptor = "[I")
	public static int[] anIntArray58 = new int[2048];

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "[I")
	public static int[] anIntArray60 = new int[512];

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "[I")
	public static int[] anIntArray59 = new int[2048];

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "[I")
	public static int[] anIntArray61 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray60[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray61[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray59[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray58[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
