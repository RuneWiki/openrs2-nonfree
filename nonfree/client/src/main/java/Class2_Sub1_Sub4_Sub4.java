import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub1_Sub4_Sub4 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!pa", name = "S", descriptor = "[I")
	public static int[] anIntArray248 = new int[2048];

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "[I")
	public static int[] anIntArray251 = new int[2048];

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "[I")
	public static int[] anIntArray249 = new int[512];

	@OriginalMember(owner = "client!pa", name = "kb", descriptor = "[I")
	public static int[] anIntArray253 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray249[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray253[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray251[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray248[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
