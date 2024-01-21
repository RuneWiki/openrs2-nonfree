import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(26) int[] local26 = this.method3130(2, arg0);
			@Pc(34) int[][] local34 = this.method3118(arg0, 0);
			@Pc(40) int[][] local40 = this.method3118(arg0, 1);
			@Pc(44) int[] local44 = local12[0];
			@Pc(48) int[] local48 = local12[1];
			@Pc(52) int[] local52 = local34[0];
			@Pc(56) int[] local56 = local34[1];
			@Pc(60) int[] local60 = local12[2];
			@Pc(64) int[] local64 = local34[2];
			@Pc(68) int[] local68 = local40[1];
			@Pc(72) int[] local72 = local40[0];
			@Pc(76) int[] local76 = local40[2];
			for (@Pc(78) int local78 = 0; local78 < Static110.anInt2825; local78++) {
				@Pc(84) int local84 = local26[local78];
				if (local84 == 4096) {
					local44[local78] = local52[local78];
					local48[local78] = local56[local78];
					local60[local78] = local64[local78];
				} else if (local84 == 0) {
					local44[local78] = local72[local78];
					local48[local78] = local68[local78];
					local60[local78] = local76[local78];
				} else {
					@Pc(114) int local114 = 4096 - local84;
					local44[local78] = local52[local78] * local84 + local114 * local72[local78] >> 12;
					local48[local78] = local68[local78] * local114 + local56[local78] * local84 >> 12;
					local60[local78] = local84 * local64[local78] + local114 * local76[local78] >> 12;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(26) int[] local26 = this.method3130(0, arg0);
			@Pc(32) int[] local32 = this.method3130(1, arg0);
			@Pc(38) int[] local38 = this.method3130(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static110.anInt2825; local40++) {
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

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}
}
