import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "[I")
	public static int[] anIntArray262 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "[I")
	public static int[] anIntArray261 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "sb", descriptor = "[I")
	public static int[] anIntArray265 = new int[2048];

	@OriginalMember(owner = "client!qe", name = "tb", descriptor = "[I")
	public static int[] anIntArray266 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray266[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray262[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray265[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray261[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
