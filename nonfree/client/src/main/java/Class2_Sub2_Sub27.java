import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(26) int[] local26 = this.method3955(2, arg0);
			@Pc(32) int[][] local32 = this.method3952(0, arg0);
			@Pc(38) int[][] local38 = this.method3952(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local32[0];
			@Pc(54) int[] local54 = local11[2];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static54.anInt953; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local50[local76];
					local46[local76] = local58[local76];
					local54[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local54[local76] = local74[local76];
				} else {
					@Pc(93) int local93 = 4096 - local82;
					local42[local76] = local66[local76] * local93 + local50[local76] * local82 >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local93 >> 12;
					local54[local76] = local82 * local62[local76] + local93 * local74[local76] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(0, arg0);
			@Pc(32) int[] local32 = this.method3955(1, arg0);
			@Pc(38) int[] local38 = this.method3955(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static54.anInt953; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local7[local40] = local26[local40];
				} else if (local46 == 0) {
					local7[local40] = local32[local40];
				} else {
					local7[local40] = local46 * local26[local40] + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local7;
	}
}
