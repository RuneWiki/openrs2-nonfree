import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class174_Sub3_Sub1 extends Class174_Sub3 {

	@OriginalMember(owner = "client!li", name = "s", descriptor = "[I")
	public static final int[] anIntArray400 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray400[local4] = Static333.method5192(local4);
		}
	}
}
