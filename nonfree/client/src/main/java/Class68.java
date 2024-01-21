import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class68 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "[I")
	public static int[] anIntArray412 = new int[99];

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public int anInt2363;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public int anInt2364;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public int anInt2368;

	static {
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = 0; local38 < 99; local38++) {
			@Pc(43) int local43 = local38 + 1;
			@Pc(56) int local56 = (int) ((double) local43 + Math.pow(2.0D, (double) local43 / 7.0D) * 300.0D);
			local36 += local56;
			anIntArray412[local38] = local36 / 4;
		}
	}
}
