import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class11_Sub18 extends Class11 {

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[I")
	public static final int[] anIntArray163 = new int[99];

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "S")
	public short aShort18;

	static {
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 99; local11++) {
			@Pc(16) int local16 = local11 + 1;
			@Pc(29) int local29 = (int) (Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D + (double) local16);
			local9 += local29;
			anIntArray163[local11] = local9 / 4;
		}
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	private Class11_Sub18() {
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(S)V")
	public Class11_Sub18(@OriginalArg(0) short arg0) {
		this.aShort18 = arg0;
	}
}
