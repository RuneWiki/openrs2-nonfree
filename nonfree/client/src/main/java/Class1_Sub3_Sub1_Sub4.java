import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub3_Sub1_Sub4 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "[I")
	public static int[] anIntArray422 = new int[2048];

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "[I")
	public static int[] anIntArray425 = new int[2048];

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "[I")
	public static int[] anIntArray426 = new int[512];

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "[I")
	public static int[] anIntArray424 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray426[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray422[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray425[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray424[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
