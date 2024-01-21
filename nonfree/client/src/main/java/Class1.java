import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	public static int[] anIntArray1 = new int[32];

	static {
		@Pc(424) int local424 = 2;
		for (@Pc(426) int local426 = 0; local426 < 32; local426++) {
			anIntArray1[local426] = local424 - 1;
			local424 += local424;
		}
	}
}
