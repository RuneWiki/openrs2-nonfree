import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class32 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "[I")
	public static final int[] anIntArray76 = new int[16384];

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "[I")
	public static final int[] anIntArray77 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray76[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray77[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}
}
