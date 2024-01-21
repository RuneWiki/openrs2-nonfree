import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class3_Sub5_Sub33 extends Class3_Sub5 {

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	private int anInt3887;

	@OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
	private int anInt3890;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
	private int[] anIntArray470;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
	private int anInt3900;

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
	private int anInt3901;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3890 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt3887 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt3900 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt3901 = arg1.method2111();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method2136();
			this.anIntArray470[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray470[2] = local58 >> 12 & 0x0;
			this.anIntArray470[1] = local58 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(26) int[][] local26 = this.method3163(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local11[2];
			@Pc(46) int[] local46 = local26[2];
			@Pc(50) int[] local50 = local11[1];
			for (@Pc(52) int local52 = 0; local52 < Static104.anInt2195; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray470[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt3890 < local66) {
					local34[local52] = local58;
					local50[local52] = local38[local52];
					local42[local52] = local46[local52];
				} else {
					@Pc(101) int local101 = local38[local52];
					local66 = local101 - this.anIntArray470[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt3890) {
						local34[local52] = local58;
						local50[local52] = local101;
						local42[local52] = local46[local52];
					} else {
						@Pc(142) int local142 = local46[local52];
						local66 = local142 - this.anIntArray470[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt3890 < local66) {
							local34[local52] = local58;
							local50[local52] = local101;
							local42[local52] = local142;
						} else {
							local34[local52] = this.anInt3901 * local58 >> 12;
							local50[local52] = local101 * this.anInt3900 >> 12;
							local42[local52] = this.anInt3887 * local142 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
