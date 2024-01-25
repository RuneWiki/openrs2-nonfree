import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class4_Sub4_Sub38 extends Class4_Sub4 {

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "Z")
	private boolean aBoolean560 = true;

	@OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
	private int anInt6385 = 4096;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6385 = arg1.method2404();
		} else if (arg0 == 1) {
			this.aBoolean560 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(30) int[] local30 = this.method5386(0, arg0 - 1 & Static59.anInt1278);
			@Pc(36) int[] local36 = this.method5386(0, arg0);
			@Pc(46) int[] local46 = this.method5386(0, Static59.anInt1278 & arg0 + 1);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static124.anInt3576; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt6385;
				@Pc(93) int local93 = this.anInt6385 * (local36[local60 + 1 & Static350.anInt6802] - local36[Static350.anInt6802 & local60 - 1]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133;
				@Pc(137) int local137;
				@Pc(141) int local141;
				if (local127 == 0) {
					local133 = 0;
					local141 = 0;
					local137 = 0;
				} else {
					local133 = local93 / local127;
					local137 = local73 / local127;
					local141 = 16777216 / local127;
				}
				if (this.aBoolean560) {
					local133 = (local133 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local50[local60] = local133;
				local54[local60] = local137;
				local58[local60] = local141;
			}
		}
		return local11;
	}
}
