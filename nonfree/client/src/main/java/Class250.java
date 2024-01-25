import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class250 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
	public static final int[] anIntArray674 = new int[16384];

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[I")
	public static final int[] anIntArray675 = new int[16384];

	static {
		@Pc(38) double local38 = 3.834951969714103E-4D;
		for (@Pc(40) int local40 = 0; local40 < 16384; local40++) {
			anIntArray675[local40] = (int) (Math.sin((double) local40 * local38) * 32768.0D);
			anIntArray674[local40] = (int) (Math.cos(local38 * (double) local40) * 32768.0D);
		}
	}
}
