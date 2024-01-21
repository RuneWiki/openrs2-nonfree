import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class45 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	public static final int[] anIntArray167 = new int[4096];

	static {
		for (@Pc(10) int local10 = 0; local10 < 4096; local10++) {
			anIntArray167[local10] = Static18.method2994(local10);
		}
	}
}
