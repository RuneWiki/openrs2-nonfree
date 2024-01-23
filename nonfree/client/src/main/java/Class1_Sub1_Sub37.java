import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(26) int[] local26 = this.method3706(arg0, 0);
			@Pc(32) int[] local32 = this.method3706(arg0, 1);
			@Pc(38) int[] local38 = this.method3706(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static11.anInt294; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local46) + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(21) int[] local21 = this.method3706(arg0, 2);
			@Pc(27) int[][] local27 = this.method3713(arg0, 0);
			@Pc(33) int[][] local33 = this.method3713(arg0, 1);
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local27[0];
			@Pc(45) int[] local45 = local27[1];
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[2];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[1];
			@Pc(65) int[] local65 = local33[2];
			@Pc(69) int[] local69 = local33[0];
			for (@Pc(71) int local71 = 0; local71 < Static11.anInt294; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local49[local71] = local41[local71];
					local37[local71] = local45[local71];
					local53[local71] = local57[local71];
				} else if (local77 == 0) {
					local49[local71] = local69[local71];
					local37[local71] = local61[local71];
					local53[local71] = local65[local71];
				} else {
					@Pc(132) int local132 = 4096 - local77;
					local49[local71] = local41[local71] * local77 + local69[local71] * local132 >> 12;
					local37[local71] = local61[local71] * local132 + local77 * local45[local71] >> 12;
					local53[local71] = local77 * local57[local71] + local132 * local65[local71] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}
}
