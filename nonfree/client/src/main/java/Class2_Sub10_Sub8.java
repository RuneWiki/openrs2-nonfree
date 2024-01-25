import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class2_Sub10_Sub8 extends Class2_Sub10 {

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub8() {
		super(3, false);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(26) int[] local26 = this.method8402(arg0, 0);
			@Pc(32) int[] local32 = this.method8402(arg0, 1);
			@Pc(38) int[] local38 = this.method8402(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static93.anInt1862; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(21) int[] local21 = this.method8402(arg0, 2);
			@Pc(27) int[][] local27 = this.method8408(arg0, 0);
			@Pc(33) int[][] local33 = this.method8408(arg0, 1);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static93.anInt1862; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(88) int local88 = 4096 - local77;
					local37[local71] = local77 * local49[local71] + local61[local71] * local88 >> 12;
					local41[local71] = local88 * local65[local71] + local77 * local53[local71] >> 12;
					local45[local71] = local77 * local57[local71] + local69[local71] * local88 >> 12;
				}
			}
		}
		return local11;
	}
}
