import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class377 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[I")
	public static final int[] anIntArray600 = new int[16384];

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "[I")
	public static final int[] anIntArray601 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray600[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray601[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}
}
