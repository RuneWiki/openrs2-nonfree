import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	private int anInt3771;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(30) int[] local30 = this.method2787(arg0 - 1 & Static124.anInt2869, 0);
			@Pc(36) int[] local36 = this.method2787(arg0, 0);
			@Pc(46) int[] local46 = this.method2787(arg0 + 1 & Static124.anInt2869, 0);
			@Pc(50) int[] local50 = local16[1];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local16[0];
			for (@Pc(60) int local60 = 0; local60 < Static86.anInt1942; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt3771;
				@Pc(78) int local78 = local74 >> 12;
				@Pc(97) int local97 = (local36[Static165.anInt321 & local60 + 1] - local36[Static165.anInt321 & local60 - 1]) * this.anInt3771;
				@Pc(101) int local101 = local97 >> 12;
				@Pc(107) int local107 = local101 * local101 >> 12;
				@Pc(113) int local113 = local78 * local78 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((local113 + local107 + 4096) / 4096)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(135) int local135;
				@Pc(143) int local143;
				if (local126 == 0) {
					local135 = 0;
					local143 = 0;
					local139 = 0;
				} else {
					local135 = local74 / local126;
					local139 = local97 / local126;
					local143 = 16777216 / local126;
				}
				if (this.aBoolean260) {
					local143 = (local143 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local58[local60] = local139;
				local50[local60] = local135;
				local54[local60] = local143;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3771 = arg0.method1359();
		} else if (arg1 == 1) {
			this.aBoolean260 = arg0.method1354() == 1;
		}
	}
}
