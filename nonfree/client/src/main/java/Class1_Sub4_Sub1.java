import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int[] local26 = this.method3215(arg0, 2);
			@Pc(32) int[][] local32 = this.method3217(0, arg0);
			@Pc(38) int[][] local38 = this.method3217(1, arg0);
			@Pc(42) int[] local42 = local16[2];
			@Pc(46) int[] local46 = local32[0];
			@Pc(50) int[] local50 = local32[1];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local32[2];
			@Pc(62) int[] local62 = local16[0];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static73.anInt1888; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local62[local76] = local46[local76];
					local54[local76] = local50[local76];
					local42[local76] = local58[local76];
				} else if (local82 == 0) {
					local62[local76] = local66[local76];
					local54[local76] = local70[local76];
					local42[local76] = local74[local76];
				} else {
					@Pc(93) int local93 = 4096 - local82;
					local62[local76] = local66[local76] * local93 + local82 * local46[local76] >> 12;
					local54[local76] = local82 * local50[local76] + local93 * local70[local76] >> 12;
					local42[local76] = local93 * local74[local76] + local82 * local58[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(arg0, 0);
			@Pc(32) int[] local32 = this.method3215(arg0, 1);
			@Pc(38) int[] local38 = this.method3215(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static73.anInt1888; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}
}
