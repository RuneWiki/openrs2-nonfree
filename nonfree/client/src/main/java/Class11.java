import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class11 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "[I")
	public static int[] anIntArray37 = new int[4096];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray37[local8] = Static89.method1556(local8);
		}
	}
}
