import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class154 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
	public static int[] anIntArray428 = new int[32];

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!en;")
	public Class12 aClass12_9;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!tb;")
	public Class59_Sub2 aClass59_Sub2_4;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray428[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
