import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(21) int[] local21 = this.method2796(2, arg0);
			@Pc(27) int[][] local27 = this.method2794(0, arg0);
			@Pc(33) int[][] local33 = this.method2794(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local27[0];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[2];
			@Pc(65) int[] local65 = local33[0];
			@Pc(69) int[] local69 = local33[1];
			for (@Pc(71) int local71 = 0; local71 < Static120.anInt2812; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local41[local71];
					local49[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local65[local71];
					local49[local71] = local69[local71];
					local45[local71] = local61[local71];
				} else {
					@Pc(112) int local112 = 4096 - local77;
					local37[local71] = local77 * local41[local71] + local65[local71] * local112 >> 12;
					local49[local71] = local53[local71] * local77 + local69[local71] * local112 >> 12;
					local45[local71] = local77 * local57[local71] + local61[local71] * local112 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(21) int[] local21 = this.method2796(0, arg0);
			@Pc(27) int[] local27 = this.method2796(1, arg0);
			@Pc(33) int[] local33 = this.method2796(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static120.anInt2812; local35++) {
				@Pc(41) int local41 = local33[local35];
				if (local41 == 4096) {
					local11[local35] = local21[local35];
				} else if (local41 == 0) {
					local11[local35] = local27[local35];
				} else {
					local11[local35] = (4096 - local41) * local27[local35] + local41 * local21[local35] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}
}
