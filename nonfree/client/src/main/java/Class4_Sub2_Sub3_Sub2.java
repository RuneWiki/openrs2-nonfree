import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class4_Sub2_Sub3_Sub2 extends Class4_Sub2_Sub3 {

	@OriginalMember(owner = "client!jd", name = "mb", descriptor = "[I")
	public static int[] anIntArray154 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "eb", descriptor = "[I")
	public static int[] anIntArray152 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "pb", descriptor = "[I")
	public static int[] anIntArray155 = new int[2048];

	@OriginalMember(owner = "client!jd", name = "tb", descriptor = "[I")
	public static int[] anIntArray156 = new int[512];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray156[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray154[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray152[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray155[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
