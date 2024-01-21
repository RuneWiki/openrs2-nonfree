import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
	public static final int[] anIntArray382 = new int[99];

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	public final int anInt4339;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 99; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) (Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D + (double) local25);
			local18 += local38;
			anIntArray382[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub24(@OriginalArg(0) int arg0) {
		this.anInt4339 = arg0;
	}
}
