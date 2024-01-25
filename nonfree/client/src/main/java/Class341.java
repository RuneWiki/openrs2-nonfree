import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class341 {

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
	public static final int[] anIntArray649 = new int[4096];

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray649[local6] = Static190.method3262(local6);
		}
	}
}
