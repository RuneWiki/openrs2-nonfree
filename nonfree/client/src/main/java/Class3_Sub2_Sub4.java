import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(3, false);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean855 = arg1.method8401() == 1;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 0);
			@Pc(35) int[] local35 = this.method8340(arg0, 1);
			@Pc(41) int[] local41 = this.method8340(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static164.anInt8839; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local29[local43] * local49 + local35[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(26) int[] local26 = this.method8340(arg0, 2);
			@Pc(34) int[][] local34 = this.method8337(0, arg0);
			@Pc(42) int[][] local42 = this.method8337(1, arg0);
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			@Pc(58) int[] local58 = local34[0];
			@Pc(62) int[] local62 = local34[1];
			@Pc(66) int[] local66 = local34[2];
			@Pc(70) int[] local70 = local42[0];
			@Pc(74) int[] local74 = local42[1];
			@Pc(78) int[] local78 = local42[2];
			for (@Pc(80) int local80 = 0; local80 < Static164.anInt8839; local80++) {
				@Pc(86) int local86 = local26[local80];
				if (local86 == 4096) {
					local46[local80] = local58[local80];
					local50[local80] = local62[local80];
					local54[local80] = local66[local80];
				} else if (local86 == 0) {
					local46[local80] = local70[local80];
					local50[local80] = local74[local80];
					local54[local80] = local78[local80];
				} else {
					@Pc(118) int local118 = 4096 - local86;
					local46[local80] = local70[local80] * local118 + local86 * local58[local80] >> 12;
					local50[local80] = local86 * local62[local80] + local74[local80] * local118 >> 12;
					local54[local80] = local86 * local66[local80] + local118 * local78[local80] >> 12;
				}
			}
		}
		return local11;
	}
}
