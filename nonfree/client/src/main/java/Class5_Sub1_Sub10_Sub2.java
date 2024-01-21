import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class5_Sub1_Sub10_Sub2 extends Class5_Sub1_Sub10 {

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "[I")
	public static int[] anIntArray240 = new int[2048];

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "[I")
	public static int[] anIntArray241 = new int[2048];

	@OriginalMember(owner = "client!oe", name = "lb", descriptor = "[I")
	public static int[] anIntArray243 = new int[512];

	@OriginalMember(owner = "client!oe", name = "ob", descriptor = "[I")
	public static int[] anIntArray245 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray243[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray245[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray241[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray240[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
