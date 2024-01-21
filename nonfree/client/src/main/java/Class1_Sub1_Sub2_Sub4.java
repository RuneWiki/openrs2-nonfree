import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "[I")
	public static int[] anIntArray335 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "[I")
	public static int[] anIntArray338 = new int[512];

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "[I")
	public static int[] anIntArray334 = new int[2048];

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "[I")
	public static int[] anIntArray336 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray338[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray336[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray335[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray334[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
