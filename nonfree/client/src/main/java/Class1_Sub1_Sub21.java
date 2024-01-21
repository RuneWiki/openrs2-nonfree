import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[] local26 = this.method3012(2, arg0);
			@Pc(32) int[][] local32 = this.method3013(arg0, 0);
			@Pc(38) int[][] local38 = this.method3013(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local32[1];
			@Pc(54) int[] local54 = local32[2];
			@Pc(58) int[] local58 = local16[2];
			@Pc(62) int[] local62 = local32[0];
			@Pc(66) int[] local66 = local38[1];
			@Pc(70) int[] local70 = local38[2];
			@Pc(74) int[] local74 = local38[0];
			for (@Pc(76) int local76 = 0; local76 < Static65.anInt1933; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local62[local76];
					local46[local76] = local50[local76];
					local58[local76] = local54[local76];
				} else if (local82 == 0) {
					local42[local76] = local74[local76];
					local46[local76] = local66[local76];
					local58[local76] = local70[local76];
				} else {
					@Pc(91) int local91 = 4096 - local82;
					local42[local76] = local62[local76] * local82 + local74[local76] * local91 >> 12;
					local46[local76] = local66[local76] * local91 + local50[local76] * local82 >> 12;
					local58[local76] = local70[local76] * local91 + local82 * local54[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(26) int[] local26 = this.method3012(0, arg0);
			@Pc(32) int[] local32 = this.method3012(1, arg0);
			@Pc(38) int[] local38 = this.method3012(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static65.anInt1933; local40++) {
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
}
