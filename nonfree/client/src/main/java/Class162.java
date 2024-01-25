import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class162 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
	public static final int[] anIntArray387 = new int[16384];

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
	public static final int[] anIntArray388 = new int[16384];

	static {
		@Pc(46) double local46 = 3.834951969714103E-4D;
		for (@Pc(48) int local48 = 0; local48 < 16384; local48++) {
			anIntArray388[local48] = (int) (Math.sin(local46 * (double) local48) * 32768.0D);
			anIntArray387[local48] = (int) (Math.cos((double) local48 * local46) * 32768.0D);
		}
	}
}
