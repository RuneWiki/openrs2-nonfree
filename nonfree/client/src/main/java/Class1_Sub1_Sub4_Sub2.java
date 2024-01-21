import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "[I")
	public static int[] anIntArray138 = new int[2048];

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "[I")
	public static int[] anIntArray137 = new int[2048];

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "[I")
	public static int[] anIntArray140 = new int[512];

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "[I")
	public static int[] anIntArray142 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray140[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray137[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray138[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray142[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
