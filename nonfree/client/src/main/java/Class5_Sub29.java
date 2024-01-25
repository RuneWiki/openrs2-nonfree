import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public abstract class Class5_Sub29 extends Class5 {

	@OriginalMember(owner = "client!u", name = "l", descriptor = "[I")
	public static final int[] anIntArray684 = new int[120];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray684[local6] = local4 / 4;
		}
		new Class40(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	protected Class5_Sub29() {
	}
}
