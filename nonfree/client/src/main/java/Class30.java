import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class30 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	public static final int[] anIntArray37 = new int[16384];

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
	public static final int[] anIntArray38 = new int[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray38[local11] = (int) (Math.sin((double) local11 * local9) * 32768.0D);
			anIntArray37[local11] = (int) (Math.cos(local9 * (double) local11) * 32768.0D);
		}
	}
}
