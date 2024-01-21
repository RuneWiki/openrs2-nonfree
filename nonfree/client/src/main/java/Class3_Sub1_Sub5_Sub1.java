import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class3_Sub1_Sub5_Sub1 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
	public static int[] anIntArray81 = new int[512];

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "[I")
	public static int[] anIntArray84 = new int[2048];

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "[I")
	public static int[] anIntArray85 = new int[2048];

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "[I")
	public static int[] anIntArray86 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray81[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray85[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray86[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray84[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
