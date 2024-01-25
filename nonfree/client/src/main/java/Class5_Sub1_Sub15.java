import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	private int anInt2691 = 4096;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt2691 = arg1.method5598();
		} else if (arg0 == 1) {
			this.aBoolean174 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(30) int[] local30 = this.method5772(0, arg0 - 1 & Static157.anInt2733);
			@Pc(36) int[] local36 = this.method5772(0, arg0);
			@Pc(46) int[] local46 = this.method5772(0, Static157.anInt2733 & arg0 + 1);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static148.anInt2666; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt2691;
				@Pc(93) int local93 = this.anInt2691 * (local36[local60 + 1 & Static273.anInt4299] - local36[Static273.anInt4299 & local60 - 1]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local74 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(144) int local144;
				@Pc(136) int local136;
				@Pc(140) int local140;
				if (local127 == 0) {
					local140 = 0;
					local136 = 0;
					local144 = 0;
				} else {
					local136 = local74 / local127;
					local140 = 16777216 / local127;
					local144 = local93 / local127;
				}
				if (this.aBoolean174) {
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
				}
				local50[local60] = local144;
				local54[local60] = local136;
				local58[local60] = local140;
			}
		}
		return local16;
	}
}
