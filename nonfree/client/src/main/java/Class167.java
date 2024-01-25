import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class167 {

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "[I")
	public static final int[] anIntArray251 = new int[120];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public int anInt4593;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray251[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!np;I)V")
	public void method3997(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5175();
			if (local14 == 0) {
				return;
			}
			this.method4001(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!np;IB)V")
	private void method4001(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4593 = arg0.method5198();
			this.anInt4587 = arg0.method5175();
			this.anInt4590 = arg0.method5175();
		}
	}
}
