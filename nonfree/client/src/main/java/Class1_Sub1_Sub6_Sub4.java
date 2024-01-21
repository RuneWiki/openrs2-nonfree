import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub6_Sub4 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "[I")
	public static int[] anIntArray334 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "pb", descriptor = "[I")
	public static int[] anIntArray338 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "[I")
	public static int[] anIntArray337 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "[I")
	public static int[] anIntArray336 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray336[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray334[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray338[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray337[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
