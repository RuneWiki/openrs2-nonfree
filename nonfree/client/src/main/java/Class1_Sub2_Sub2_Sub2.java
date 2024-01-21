import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "[I")
	public static int[] anIntArray187 = new int[512];

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "[I")
	public static int[] anIntArray189 = new int[2048];

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "[I")
	public static int[] anIntArray185 = new int[2048];

	@OriginalMember(owner = "client!fd", name = "lb", descriptor = "[I")
	public static int[] anIntArray190 = new int[2048];

	static {
		for (@Pc(29) int local29 = 1; local29 < 512; local29++) {
			anIntArray187[local29] = 32768 / local29;
		}
		for (@Pc(42) int local42 = 1; local42 < 2048; local42++) {
			anIntArray190[local42] = 65536 / local42;
		}
		for (@Pc(55) int local55 = 0; local55 < 2048; local55++) {
			anIntArray189[local55] = (int) (Math.sin((double) local55 * 0.0030679615D) * 65536.0D);
			anIntArray185[local55] = (int) (Math.cos((double) local55 * 0.0030679615D) * 65536.0D);
		}
	}
}
