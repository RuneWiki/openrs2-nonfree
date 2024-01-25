import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
	public static final int[] anIntArray20 = new int[16384];

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "[I")
	public static final int[] anIntArray21 = new int[16384];

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			anIntArray20[local17] = (int) (Math.sin(local15 * (double) local17) * 32768.0D);
			anIntArray21[local17] = (int) (Math.cos((double) local17 * local15) * 32768.0D);
		}
	}
}
