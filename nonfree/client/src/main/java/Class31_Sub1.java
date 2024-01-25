import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public abstract class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[I")
	public static final int[] anIntArray84 = new int[120];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray84[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	protected Class31_Sub1() {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)Lclient!hw;")
	public abstract Class2_Sub2 method2212();
}
