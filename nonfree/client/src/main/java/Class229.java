import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class229 {

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "[I")
	public static final int[] anIntArray536 = new int[16384];

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
	public static final int[] anIntArray537 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray537[local9] = (int) (Math.sin(local7 * (double) local9) * 32768.0D);
			anIntArray536[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}
}
