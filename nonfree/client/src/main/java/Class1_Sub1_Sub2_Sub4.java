import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "[I")
	public static int[] anIntArray397 = new int[2048];

	@OriginalMember(owner = "client!qc", name = "rb", descriptor = "[I")
	public static int[] anIntArray400 = new int[2048];

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "[I")
	public static int[] anIntArray401 = new int[512];

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "[I")
	public static int[] anIntArray399 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray401[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray400[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray399[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray397[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
