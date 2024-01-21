import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class5_Sub2_Sub1_Sub2 extends Class5_Sub2_Sub1 {

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "[I")
	public static int[] anIntArray197 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
	public static int[] anIntArray195 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "kb", descriptor = "[I")
	public static int[] anIntArray198 = new int[2048];

	@OriginalMember(owner = "client!ib", name = "nb", descriptor = "[I")
	public static int[] anIntArray200 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray200[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray195[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray198[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray197[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
