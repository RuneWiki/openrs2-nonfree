import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(30) int[] local30 = this.method3215(arg0 - 1 & Static125.anInt3628, 0);
			@Pc(36) int[] local36 = this.method3215(arg0, 0);
			@Pc(46) int[] local46 = this.method3215(Static125.anInt3628 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[2];
			@Pc(58) int[] local58 = local16[1];
			for (@Pc(60) int local60 = 0; local60 < Static73.anInt1888; local60++) {
				@Pc(82) int local82 = this.anInt388 * (local36[Static35.anInt672 & local60 + 1] - local36[Static35.anInt672 & local60 - 1]);
				@Pc(94) int local94 = (local46[local60] - local30[local60]) * this.anInt388;
				@Pc(98) int local98 = local82 >> 12;
				@Pc(102) int local102 = local94 >> 12;
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(114) int local114 = local98 * local98 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((local108 + local114 + 4096) / 4096)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(136) int local136;
				@Pc(138) int local138;
				if (local127 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local134 = local82 / local127;
					local138 = 16777216 / local127;
					local136 = local94 / local127;
				}
				if (this.aBoolean15) {
					local138 = (local138 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local50[local60] = local134;
				local58[local60] = local136;
				local54[local60] = local138;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt388 = arg0.method546();
		} else if (arg1 == 1) {
			this.aBoolean15 = arg0.method544() == 1;
		}
	}
}
