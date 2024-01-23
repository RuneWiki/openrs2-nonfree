import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class8_Sub3_Sub9 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "[I")
	public static int[] anIntArray102 = new int[32];

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
	private int anInt1468 = 4096;

	@OriginalMember(owner = "client!ej", name = "O", descriptor = "Z")
	private boolean aBoolean106 = true;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray102[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1468 = arg1.method2375();
		} else if (arg0 == 1) {
			this.aBoolean106 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(30) int[] local30 = this.method4230(Static51.anInt1120 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method4230(arg0, 0);
			@Pc(46) int[] local46 = this.method4230(Static51.anInt1120 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[0];
			for (@Pc(60) int local60 = 0; local60 < Static239.anInt4789; local60++) {
				@Pc(78) int local78 = this.anInt1468 * (local46[local60] - local30[local60]);
				@Pc(98) int local98 = (local36[local60 + 1 & Static214.anInt4402] - local36[local60 - 1 & Static214.anInt4402]) * this.anInt1468;
				@Pc(102) int local102 = local78 >> 12;
				@Pc(106) int local106 = local98 >> 12;
				@Pc(112) int local112 = local102 * local102 >> 12;
				@Pc(118) int local118 = local106 * local106 >> 12;
				@Pc(132) int local132 = (int) (Math.sqrt((double) ((float) (local112 + local118 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(145) int local145;
				@Pc(149) int local149;
				@Pc(141) int local141;
				if (local132 == 0) {
					local149 = 0;
					local145 = 0;
					local141 = 0;
				} else {
					local141 = 16777216 / local132;
					local145 = local98 / local132;
					local149 = local78 / local132;
				}
				if (this.aBoolean106) {
					local141 = (local141 >> 1) + 2048;
					local149 = (local149 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
				}
				local58[local60] = local145;
				local54[local60] = local149;
				local50[local60] = local141;
			}
		}
		return local16;
	}
}
