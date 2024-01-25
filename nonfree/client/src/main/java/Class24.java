import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class24 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
	public static final int[] anIntArray36 = new int[16384];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "[I")
	public static final int[] anIntArray35 = new int[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray35[local11] = (int) (Math.sin(local9 * (double) local11) * 32768.0D);
			anIntArray36[local11] = (int) (Math.cos((double) local11 * local9) * 32768.0D);
		}
	}
}
