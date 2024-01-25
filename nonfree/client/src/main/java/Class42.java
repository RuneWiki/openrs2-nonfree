import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class42 {

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "[I")
	public static final int[] anIntArray51 = new int[16384];

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "[I")
	public static final int[] anIntArray52 = new int[16384];

	static {
		@Pc(42) double local42 = 3.834951969714103E-4D;
		for (@Pc(44) int local44 = 0; local44 < 16384; local44++) {
			anIntArray51[local44] = (int) (Math.sin(local42 * (double) local44) * 16384.0D);
			anIntArray52[local44] = (int) (Math.cos(local42 * (double) local44) * 16384.0D);
		}
	}
}
