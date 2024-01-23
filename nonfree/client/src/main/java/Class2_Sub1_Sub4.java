import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(3, false);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(21) int[] local21 = this.method3203(arg0, 0);
			@Pc(27) int[] local27 = this.method3203(arg0, 1);
			@Pc(33) int[] local33 = this.method3203(arg0, 2);
			for (@Pc(35) int local35 = 0; local35 < Static62.anInt1675; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = local21[local35] * local41 + (4096 - local41) * local27[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(26) int[] local26 = this.method3203(arg0, 2);
			@Pc(32) int[][] local32 = this.method3205(0, arg0);
			@Pc(38) int[][] local38 = this.method3205(1, arg0);
			@Pc(42) int[] local42 = local32[2];
			@Pc(46) int[] local46 = local38[0];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local32[0];
			@Pc(70) int[] local70 = local16[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static62.anInt1675; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local50[local76] = local66[local76];
					local70[local76] = local58[local76];
					local54[local76] = local42[local76];
				} else if (local82 == 0) {
					local50[local76] = local46[local76];
					local70[local76] = local62[local76];
					local54[local76] = local74[local76];
				} else {
					@Pc(115) int local115 = 4096 - local82;
					local50[local76] = local82 * local66[local76] + local115 * local46[local76] >> 12;
					local70[local76] = local82 * local58[local76] + local62[local76] * local115 >> 12;
					local54[local76] = local42[local76] * local82 + local74[local76] * local115 >> 12;
				}
			}
		}
		return local16;
	}
}
