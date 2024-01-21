import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class10_Sub1_Sub1_Sub3 extends Class10_Sub1_Sub1 {

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "[I")
	public static int[] anIntArray200 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "[I")
	public static int[] anIntArray201 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
	public static int[] anIntArray203 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
	public static int[] anIntArray204 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray204[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray200[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray201[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray203[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
