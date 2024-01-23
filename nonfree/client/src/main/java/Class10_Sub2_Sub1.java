import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "[I")
	public static int[] anIntArray213 = new int[4096];

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray213[local7] = Static246.method4223(local7);
		}
	}
}
