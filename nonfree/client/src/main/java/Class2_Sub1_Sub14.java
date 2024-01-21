import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Z")
	private boolean aBoolean54;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(30) int[] local30 = this.method2796(0, Static180.anInt4192 & arg0 - 1);
			@Pc(36) int[] local36 = this.method2796(0, arg0);
			@Pc(46) int[] local46 = this.method2796(0, Static180.anInt4192 & arg0 + 1);
			@Pc(50) int[] local50 = local12[0];
			@Pc(54) int[] local54 = local12[1];
			@Pc(58) int[] local58 = local12[2];
			for (@Pc(60) int local60 = 0; local60 < Static120.anInt2812; local60++) {
				@Pc(73) int local73 = this.anInt1360 * (local46[local60] - local30[local60]);
				@Pc(92) int local92 = (local36[local60 + 1 & Static49.anInt1370] - local36[local60 - 1 & Static49.anInt1370]) * this.anInt1360;
				@Pc(96) int local96 = local92 >> 12;
				@Pc(100) int local100 = local73 >> 12;
				@Pc(106) int local106 = local96 * local96 >> 12;
				@Pc(112) int local112 = local100 * local100 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((local106 + local112 + 4096) / 4096)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(136) int local136;
				@Pc(140) int local140;
				if (local126 == 0) {
					local136 = 0;
					local140 = 0;
					local132 = 0;
				} else {
					local132 = local92 / local126;
					local136 = local73 / local126;
					local140 = 16777216 / local126;
				}
				if (this.aBoolean54) {
					local132 = (local132 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local50[local60] = local132;
				local54[local60] = local136;
				local58[local60] = local140;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1360 = arg0.method1397();
		} else if (arg1 == 1) {
			this.aBoolean54 = arg0.method1402() == 1;
		}
	}
}
