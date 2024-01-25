import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class3_Sub6_Sub29 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "Z")
	private boolean aBoolean610 = true;

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
	private int anInt7783 = 4096;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7783 = arg0.method5198();
		} else if (arg1 == 1) {
			this.aBoolean610 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(30) int[] local30 = this.method7769(Static68.anInt1579 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method7769(arg0, 0);
			@Pc(46) int[] local46 = this.method7769(Static68.anInt1579 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static521.anInt8383; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt7783;
				@Pc(93) int local93 = (local36[local60 + 1 & Static296.anInt5049] - local36[Static296.anInt5049 & local60 - 1]) * this.anInt7783;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(133) int local133;
				@Pc(131) int local131;
				if (local127 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local135 = local93 / local127;
					local131 = 16777216 / local127;
					local133 = local73 / local127;
				}
				if (this.aBoolean610) {
					local131 = (local131 >> 1) + 2048;
					local133 = (local133 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local50[local60] = local135;
				local54[local60] = local133;
				local58[local60] = local131;
			}
		}
		return local16;
	}
}
