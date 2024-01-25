import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public abstract class Class27 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
	public static final int[] anIntArray424 = new int[32];

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray424[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!uk;B)Lclient!uk;")
	public abstract Class3_Sub3_Sub1 method4808(@OriginalArg(0) Class3_Sub3_Sub1 arg0);
}
