import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class310 {

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "[I")
	public static final int[] anIntArray826 = new int[16384];

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "[I")
	public static final int[] anIntArray827 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray827[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray826[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}
}
