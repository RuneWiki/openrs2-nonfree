import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class242 {

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "[I")
	public static final int[] anIntArray503 = new int[4096];

	static {
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray503[local12] = Static388.method6098(local12);
		}
	}
}
