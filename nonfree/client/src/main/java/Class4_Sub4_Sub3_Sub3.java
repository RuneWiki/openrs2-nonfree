import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class4_Sub4_Sub3_Sub3 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "[I")
	public static int[] anIntArray217 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "[I")
	public static int[] anIntArray214 = new int[2048];

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "[I")
	public static int[] anIntArray213 = new int[512];

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "[I")
	public static int[] anIntArray215 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray213[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray215[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray214[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray217[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
