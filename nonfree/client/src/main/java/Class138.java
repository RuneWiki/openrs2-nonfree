import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class138 {

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "[I")
	public static final int[] anIntArray393 = new int[16384];

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "[I")
	public static final int[] anIntArray392 = new int[16384];

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			anIntArray392[local15] = (int) (Math.sin((double) local15 * local13) * 16384.0D);
			anIntArray393[local15] = (int) (Math.cos((double) local15 * local13) * 16384.0D);
		}
	}
}
