import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class6_Sub3_Sub3_Sub4 extends Class6_Sub3_Sub3 {

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "[I")
	public static int[] anIntArray341 = new int[2048];

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "[I")
	public static int[] anIntArray342 = new int[2048];

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "[I")
	public static int[] anIntArray343 = new int[2048];

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "[I")
	public static int[] anIntArray340 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray340[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray341[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray343[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray342[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
