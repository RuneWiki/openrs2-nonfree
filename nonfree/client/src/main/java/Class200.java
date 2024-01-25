import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class200 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
	public static final int[] anIntArray338 = new int[16384];

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
	public static final int[] anIntArray337 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray337[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray338[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}
}
