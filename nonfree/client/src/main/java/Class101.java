import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class101 {

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
	public static final int[] anIntArray234 = new int[16384];

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public static final int[] anIntArray235 = new int[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray234[local11] = (int) (Math.sin((double) local11 * local9) * 32768.0D);
			anIntArray235[local11] = (int) (Math.cos(local9 * (double) local11) * 32768.0D);
		}
	}
}
