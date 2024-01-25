import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class42 {

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray66 = new int[4096];

	static {
		for (@Pc(107) int local107 = 0; local107 < 4096; local107++) {
			anIntArray66[local107] = Static148.method3253(local107);
		}
	}
}
