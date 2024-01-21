import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub1_Sub4_Sub4 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "[I")
	public static int[] anIntArray357 = new int[2048];

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "[I")
	public static int[] anIntArray356 = new int[2048];

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "[I")
	public static int[] anIntArray358 = new int[2048];

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "[I")
	public static int[] anIntArray359 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray359[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray357[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray356[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray358[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
