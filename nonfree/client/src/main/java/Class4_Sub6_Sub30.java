import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class4_Sub6_Sub30 extends Class4_Sub6 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int[] local29 = this.method5508(arg0, 0);
			@Pc(35) int[] local35 = this.method5508(arg0, 1);
			@Pc(41) int[] local41 = this.method5508(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static80.anInt1616; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local49 * local29[local43] + local35[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(26) int[] local26 = this.method5508(arg0, 2);
			@Pc(32) int[][] local32 = this.method5516(0, arg0);
			@Pc(38) int[][] local38 = this.method5516(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static80.anInt1616; local76++) {
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
					local42[local76] = local114 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local58[local76] * local82 + local114 * local70[local76] >> 12;
					local50[local76] = local114 * local74[local76] + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}
}
