import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!nf", name = "Y", descriptor = "[I")
	public static int[] anIntArray219 = new int[2048];

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "[I")
	public static int[] anIntArray221 = new int[2048];

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "[I")
	public static int[] anIntArray220 = new int[2048];

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "[I")
	public static int[] anIntArray223 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray223[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray220[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray219[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray221[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
