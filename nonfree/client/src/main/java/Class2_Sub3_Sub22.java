import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(22) int[] local22 = this.method3011(arg0, 0);
			@Pc(28) int[] local28 = this.method3011(arg0, 1);
			@Pc(34) int[] local34 = this.method3011(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static53.anInt1184; local36++) {
				@Pc(42) int local42 = local34[local36];
				if (local42 == 4096) {
					local12[local36] = local22[local36];
				} else if (local42 == 0) {
					local12[local36] = local28[local36];
				} else {
					local12[local36] = local22[local36] * local42 + (4096 - local42) * local28[local36] >> 12;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method3011(arg0, 2);
			@Pc(32) int[][] local32 = this.method3017(arg0, 0);
			@Pc(38) int[][] local38 = this.method3017(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local32[0];
			@Pc(54) int[] local54 = local32[2];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local16[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static53.anInt1184; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local50[local76];
					local46[local76] = local58[local76];
					local62[local76] = local54[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local62[local76] = local74[local76];
				} else {
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local82 * local50[local76] + local117 * local66[local76] >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local117 >> 12;
					local62[local76] = local117 * local74[local76] + local82 * local54[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
