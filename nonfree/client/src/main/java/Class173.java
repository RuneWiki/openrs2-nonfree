import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class173 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	public static final int[] anIntArray449 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray449[local4] = Static126.method2484(local4);
		}
	}
}
