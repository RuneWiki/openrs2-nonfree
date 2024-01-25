import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class2_Sub4_Sub13 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(26) int[] local26 = this.method5600(arg0, 2);
			@Pc(32) int[][] local32 = this.method5591(arg0, 0);
			@Pc(38) int[][] local38 = this.method5591(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static76.anInt1458; local76++) {
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
					@Pc(92) int local92 = 4096 - local82;
					local42[local76] = local92 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local58[local76] * local82 + local70[local76] * local92 >> 12;
					local50[local76] = local62[local76] * local82 + local92 * local74[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(29) int[] local29 = this.method5600(arg0, 0);
			@Pc(35) int[] local35 = this.method5600(arg0, 1);
			@Pc(41) int[] local41 = this.method5600(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static76.anInt1458; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local29[local43] * local49 + (4096 - local49) * local35[local43] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}
}
