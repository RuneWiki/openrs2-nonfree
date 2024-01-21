import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class3_Sub1_Sub4_Sub4 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!vf", name = "kb", descriptor = "[I")
	public static int[] anIntArray392 = new int[2048];

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "[I")
	public static int[] anIntArray391 = new int[2048];

	@OriginalMember(owner = "client!vf", name = "vb", descriptor = "[I")
	public static int[] anIntArray394 = new int[2048];

	@OriginalMember(owner = "client!vf", name = "wb", descriptor = "[I")
	public static int[] anIntArray395 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray395[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray394[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray391[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray392[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
