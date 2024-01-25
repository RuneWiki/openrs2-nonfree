import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class106 {

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
	public static final int[] anIntArray242 = new int[16384];

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
	public static final int[] anIntArray240 = new int[16384];

	static {
		@Pc(45) double local45 = 3.834951969714103E-4D;
		for (@Pc(47) int local47 = 0; local47 < 16384; local47++) {
			anIntArray240[local47] = (int) (Math.sin(local45 * (double) local47) * 32768.0D);
			anIntArray242[local47] = (int) (Math.cos(local45 * (double) local47) * 32768.0D);
		}
	}
}
