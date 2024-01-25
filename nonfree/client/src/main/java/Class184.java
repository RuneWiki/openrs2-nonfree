import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class184 {

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "[I")
	public static final int[] anIntArray298 = new int[4096];

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray298[local10] = Static500.method7269(local10);
		}
	}
}
