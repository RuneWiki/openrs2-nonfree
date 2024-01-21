import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub5_Sub20 extends Class1_Sub5 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[] local29 = this.method3145(2, arg0);
			@Pc(35) int[][] local35 = this.method3144(arg0, 0);
			@Pc(41) int[][] local41 = this.method3144(arg0, 1);
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			@Pc(53) int[] local53 = local35[0];
			@Pc(57) int[] local57 = local35[1];
			@Pc(61) int[] local61 = local15[0];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static177.anInt4018; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local61[local79] = local53[local79];
					local45[local79] = local57[local79];
					local49[local79] = local65[local79];
				} else if (local85 == 0) {
					local61[local79] = local69[local79];
					local45[local79] = local73[local79];
					local49[local79] = local77[local79];
				} else {
					@Pc(97) int local97 = 4096 - local85;
					local61[local79] = local85 * local53[local79] + local97 * local69[local79] >> 12;
					local45[local79] = local73[local79] * local97 + local57[local79] * local85 >> 12;
					local49[local79] = local77[local79] * local97 + local85 * local65[local79] >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean173 = arg0.method336() == 1;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(26) int[] local26 = this.method3145(0, arg0);
			@Pc(32) int[] local32 = this.method3145(1, arg0);
			@Pc(38) int[] local38 = this.method3145(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static177.anInt4018; local40++) {
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
}
