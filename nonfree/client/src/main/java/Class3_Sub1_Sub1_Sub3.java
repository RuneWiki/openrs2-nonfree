import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "[I")
	public static int[] anIntArray111 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "hb", descriptor = "[I")
	public static int[] anIntArray112 = new int[512];

	@OriginalMember(owner = "client!jd", name = "ub", descriptor = "[I")
	public static int[] anIntArray115 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "wb", descriptor = "[I")
	public static int[] anIntArray116 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray112[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray111[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray116[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray115[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
