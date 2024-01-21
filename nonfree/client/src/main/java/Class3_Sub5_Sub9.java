import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class3_Sub5_Sub9 extends Class3_Sub5 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(26) int[] local26 = this.method3167(arg0, 2);
			@Pc(32) int[][] local32 = this.method3163(0, arg0);
			@Pc(38) int[][] local38 = this.method3163(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static104.anInt2195; local76++) {
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
					@Pc(116) int local116 = 4096 - local82;
					local42[local76] = local66[local76] * local116 + local54[local76] * local82 >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local116 >> 12;
					local50[local76] = local82 * local62[local76] + local74[local76] * local116 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 0);
			@Pc(35) int[] local35 = this.method3167(arg0, 1);
			@Pc(41) int[] local41 = this.method3167(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static104.anInt2195; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local35[local43] * (4096 - local49) + local29[local43] * local49 >> 12;
				}
			}
		}
		return local19;
	}
}
