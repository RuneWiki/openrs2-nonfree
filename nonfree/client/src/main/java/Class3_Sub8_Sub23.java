import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class3_Sub8_Sub23 extends Class3_Sub8 {

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			super.aBoolean737 = arg1.method7954() == 1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(26) int[] local26 = this.method8776(arg0, 2);
			@Pc(32) int[][] local32 = this.method8779(0, arg0);
			@Pc(38) int[][] local38 = this.method8779(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static91.anInt1849; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(114) int local114 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local66[local76] * local114 >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local114 >> 12;
					local50[local76] = local82 * local62[local76] + local74[local76] * local114 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(26) int[] local26 = this.method8776(arg0, 0);
			@Pc(32) int[] local32 = this.method8776(arg0, 1);
			@Pc(38) int[] local38 = this.method8776(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static91.anInt1849; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local11;
	}
}
