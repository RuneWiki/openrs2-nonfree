import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class117 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
	public static int[] anIntArray471 = new int[4096];

	static {
		for (@Pc(11) int local11 = 0; local11 < 4096; local11++) {
			anIntArray471[local11] = Static160.method2682(local11);
		}
	}
}
