import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public abstract class Class20 {

	@OriginalMember(owner = "client!at", name = "a", descriptor = "[I")
	public static final int[] anIntArray313 = new int[120];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray313[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)I")
	public abstract int method3401(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
	public abstract void method3403();

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)J")
	public abstract long method3404();
}
