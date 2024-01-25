import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class268 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
	public static final int[] anIntArray386 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray386[local4] = Static618.method8342(local4);
		}
	}
}
