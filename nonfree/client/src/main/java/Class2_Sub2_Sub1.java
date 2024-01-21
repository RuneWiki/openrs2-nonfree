import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(26) int[] local26 = this.method2573(arg0, 0);
			@Pc(32) int[] local32 = this.method2573(arg0, 1);
			@Pc(38) int[] local38 = this.method2573(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static149.anInt3233; local40++) {
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

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(22) int[] local22 = this.method2573(arg0, 2);
			@Pc(28) int[][] local28 = this.method2582(0, arg0);
			@Pc(34) int[][] local34 = this.method2582(1, arg0);
			@Pc(38) int[] local38 = local12[0];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local28[0];
			@Pc(50) int[] local50 = local28[1];
			@Pc(54) int[] local54 = local12[2];
			@Pc(58) int[] local58 = local34[0];
			@Pc(62) int[] local62 = local34[2];
			@Pc(66) int[] local66 = local28[2];
			@Pc(70) int[] local70 = local34[1];
			for (@Pc(72) int local72 = 0; local72 < Static149.anInt3233; local72++) {
				@Pc(78) int local78 = local22[local72];
				if (local78 == 4096) {
					local38[local72] = local46[local72];
					local42[local72] = local50[local72];
					local54[local72] = local66[local72];
				} else if (local78 == 0) {
					local38[local72] = local58[local72];
					local42[local72] = local70[local72];
					local54[local72] = local62[local72];
				} else {
					@Pc(110) int local110 = 4096 - local78;
					local38[local72] = local46[local72] * local78 + local110 * local58[local72] >> 12;
					local42[local72] = local70[local72] * local110 + local78 * local50[local72] >> 12;
					local54[local72] = local62[local72] * local110 + local78 * local66[local72] >> 12;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean160 = arg1.method1461() == 1;
		}
	}
}
