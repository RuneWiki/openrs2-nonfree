import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class3_Sub2_Sub3 extends Class3_Sub2 {

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub3() {
		super(3, false);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			@Pc(29) int[] local29 = this.method8603(arg0, 0);
			@Pc(35) int[] local35 = this.method8603(arg0, 1);
			@Pc(41) int[] local41 = this.method8603(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static491.anInt8519; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = (4096 - local49) * local35[local43] + local29[local43] * local49 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(26) int[] local26 = this.method8603(arg0, 2);
			@Pc(32) int[][] local32 = this.method8595(arg0, 0);
			@Pc(38) int[][] local38 = this.method8595(arg0, 1);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static491.anInt8519; local76++) {
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
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local117 * local66[local76] >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local117 >> 12;
					local50[local76] = local117 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean720 = arg0.method4225() == 1;
		}
	}
}
