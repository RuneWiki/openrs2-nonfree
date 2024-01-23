import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean78 = arg0.method209() == 1;
		} else if (arg1 == 1) {
			this.aBoolean77 = arg0.method209() == 1;
		} else if (arg1 == 2) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(34) int[][] local34 = this.method3205(0, this.aBoolean77 ? Static195.anInt4423 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[2];
			@Pc(46) int[] local46 = local34[1];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean78) {
				for (local63 = 0; local63 < Static62.anInt1675; local63++) {
					local50[local63] = local38[Static41.anInt1259 - local63];
					local54[local63] = local46[Static41.anInt1259 - local63];
					local58[local63] = local42[Static41.anInt1259 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static62.anInt1675; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local46[local63];
					local58[local63] = local42[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(29) int[] local29 = this.method3203(this.aBoolean77 ? Static195.anInt4423 - arg0 : arg0, 0);
			if (this.aBoolean78) {
				for (@Pc(34) int local34 = 0; local34 < Static62.anInt1675; local34++) {
					local11[local34] = local29[Static41.anInt1259 - local34];
				}
			} else {
				Static225.method1841(local29, 0, local11, 0, Static62.anInt1675);
			}
		}
		return local11;
	}
}
