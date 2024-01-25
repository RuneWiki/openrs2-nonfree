import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class151_Sub3_Sub1 extends Class151_Sub3 {

	@OriginalMember(owner = "client!uw", name = "k", descriptor = "[I")
	public static final int[] anIntArray670 = new int[4096];

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray670[local4] = Static382.method5670(local4);
		}
	}
}
