import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int[] local26 = this.method2787(arg0, 0);
			@Pc(32) int[] local32 = this.method2787(arg0, 1);
			@Pc(38) int[] local38 = this.method2787(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static86.anInt1942; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = (4096 - local46) * local32[local40] + local26[local40] * local46 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(29) int[] local29 = this.method2787(arg0, 2);
			@Pc(35) int[][] local35 = this.method2785(arg0, 0);
			@Pc(41) int[][] local41 = this.method2785(arg0, 1);
			@Pc(45) int[] local45 = local19[1];
			@Pc(49) int[] local49 = local19[0];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[1];
			@Pc(61) int[] local61 = local35[0];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[1];
			@Pc(73) int[] local73 = local41[2];
			@Pc(77) int[] local77 = local41[0];
			for (@Pc(79) int local79 = 0; local79 < Static86.anInt1942; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local49[local79] = local61[local79];
					local45[local79] = local57[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local49[local79] = local77[local79];
					local45[local79] = local69[local79];
					local53[local79] = local73[local79];
				} else {
					@Pc(120) int local120 = 4096 - local85;
					local49[local79] = local61[local79] * local85 + local77[local79] * local120 >> 12;
					local45[local79] = local69[local79] * local120 + local57[local79] * local85 >> 12;
					local53[local79] = local65[local79] * local85 + local73[local79] * local120 >> 12;
				}
			}
		}
		return local19;
	}
}
