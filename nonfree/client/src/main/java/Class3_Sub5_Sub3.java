import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class3_Sub5_Sub3 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!ch", name = "W", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(30) int[] local30 = this.method3167(Static23.anInt543 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3167(arg0, 0);
			@Pc(46) int[] local46 = this.method3167(Static23.anInt543 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local12[0];
			@Pc(54) int[] local54 = local12[1];
			@Pc(58) int[] local58 = local12[2];
			for (@Pc(60) int local60 = 0; local60 < Static104.anInt2195; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt610;
				@Pc(78) int local78 = local74 >> 12;
				@Pc(98) int local98 = this.anInt610 * (local36[local60 + 1 & Static112.anInt2517] - local36[local60 - 1 & Static112.anInt2517]);
				@Pc(102) int local102 = local98 >> 12;
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(114) int local114 = local78 * local78 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(134) int local134;
				@Pc(132) int local132;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local134 = local74 / local128;
					local136 = local98 / local128;
					local132 = 16777216 / local128;
				}
				if (this.aBoolean33) {
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local50[local60] = local136;
				local54[local60] = local134;
				local58[local60] = local132;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt610 = arg1.method2111();
		} else if (arg0 == 1) {
			this.aBoolean33 = arg1.method2107() == 1;
		}
	}
}
