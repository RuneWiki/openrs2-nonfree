import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class123 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[I")
	public static final int[] anIntArray166 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray166[local4] = Static369.method3954(local4);
		}
	}
}
