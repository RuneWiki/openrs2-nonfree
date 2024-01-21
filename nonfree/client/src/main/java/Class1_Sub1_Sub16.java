import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Z")
	private boolean aBoolean144;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(30) int[] local30 = this.method3012(0, arg0 - 1 & Static93.anInt2716);
			@Pc(36) int[] local36 = this.method3012(0, arg0);
			@Pc(46) int[] local46 = this.method3012(0, arg0 + 1 & Static93.anInt2716);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static65.anInt1933; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt1834;
				@Pc(94) int local94 = this.anInt1834 * (local36[Static64.anInt1922 & local60 + 1] - local36[local60 - 1 & Static64.anInt1922]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local102 * local102 >> 12;
				@Pc(114) int local114 = local98 * local98 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((local114 + local108 + 4096) / 4096)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(131) int local131;
				@Pc(133) int local133;
				if (local127 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local133 = 16777216 / local127;
					local135 = local94 / local127;
					local131 = local74 / local127;
				}
				if (this.aBoolean144) {
					local131 = (local131 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local50[local60] = local135;
				local54[local60] = local131;
				local58[local60] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1834 = arg1.method1642();
		} else if (arg0 == 1) {
			this.aBoolean144 = arg1.method1607() == 1;
		}
	}
}
