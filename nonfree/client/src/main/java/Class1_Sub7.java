import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "[I")
	public static int[] anIntArray163 = new int[99];

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "[I")
	public int[] anIntArray164 = new int[] { -1 };

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
	public int[] anIntArray165 = new int[] { 0 };

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(15) int local15 = local6 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local4 += local28;
			anIntArray163[local6] = local4 / 4;
		}
	}
}
