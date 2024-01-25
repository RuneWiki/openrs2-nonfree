import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class6_Sub1_Sub29 extends Class6_Sub1 {

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[] local25 = this.method8963(2, arg0);
			@Pc(31) int[][] local31 = this.method8959(arg0, 0);
			@Pc(39) int[][] local39 = this.method8959(arg0, 1);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(55) int[] local55 = local31[0];
			@Pc(59) int[] local59 = local31[1];
			@Pc(63) int[] local63 = local31[2];
			@Pc(67) int[] local67 = local39[0];
			@Pc(71) int[] local71 = local39[1];
			@Pc(75) int[] local75 = local39[2];
			for (@Pc(77) int local77 = 0; local77 < Static479.anInt8231; local77++) {
				@Pc(83) int local83 = local25[local77];
				if (local83 == 4096) {
					local43[local77] = local55[local77];
					local47[local77] = local59[local77];
					local51[local77] = local63[local77];
				} else if (local83 == 0) {
					local43[local77] = local67[local77];
					local47[local77] = local71[local77];
					local51[local77] = local75[local77];
				} else {
					@Pc(132) int local132 = 4096 - local83;
					local43[local77] = local67[local77] * local132 + local83 * local55[local77] >> 12;
					local47[local77] = local59[local77] * local83 + local132 * local71[local77] >> 12;
					local51[local77] = local63[local77] * local83 + local75[local77] * local132 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method8963(0, arg0);
			@Pc(32) int[] local32 = this.method8963(1, arg0);
			@Pc(38) int[] local38 = this.method8963(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static479.anInt8231; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local46) + local46 * local26[local40] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}
}
