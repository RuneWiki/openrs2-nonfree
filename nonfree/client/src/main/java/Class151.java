import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class151 {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[I")
	public static final int[] anIntArray245 = new int[16384];

	@OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
	public static final int[] anIntArray244 = new int[16384];

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray244[local17] = (int) (Math.sin((double) local17 * local15) * 16384.0D);
			anIntArray245[local17] = (int) (Math.cos((double) local17 * local15) * 16384.0D);
		}
	}
}
