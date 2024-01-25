import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class4_Sub6_Sub13 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[I")
	private final int[] anIntArray245 = new int[3];

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
	private int anInt2858 = 3216;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	private int anInt2853 = 3216;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	private int anInt2855 = 4096;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2855 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt2853 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt2858 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.method2515();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(30) int local30 = Static226.anInt4577 * this.anInt2855 >> 12;
			@Pc(40) int[] local40 = this.method5702(arg0 - 1 & Static341.anInt266, 0);
			@Pc(46) int[] local46 = this.method5702(arg0, 0);
			@Pc(56) int[] local56 = this.method5702(Static341.anInt266 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static31.anInt797; local58++) {
				@Pc(72) int local72 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(93) int local93 = local30 * (local46[Static335.anInt6403 & local58 - 1] - local46[local58 + 1 & Static335.anInt6403]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(106) int local106 = local72 >> 4;
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(135) int local135 = Class4_Sub6_Sub12.aByteArray42[(local106 * (local106 + 1) >> 1) + local97] & 0xFF;
				@Pc(141) int local141 = local135 * 4096 >> 8;
				@Pc(147) int local147 = local93 * local135 >> 8;
				@Pc(153) int local153 = local72 * local135 >> 8;
				@Pc(162) int local162 = local153 * this.anIntArray245[1] >> 12;
				@Pc(171) int local171 = this.anIntArray245[2] * local141 >> 12;
				@Pc(180) int local180 = this.anIntArray245[0] * local147 >> 12;
				local19[local58] = local162 + local180 + local171;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(B)V")
	private void method2515() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2858 / 4096.0F));
		this.anIntArray245[0] = (int) (local11 * Math.sin((double) ((float) this.anInt2853 / 4096.0F)) * 4096.0D);
		this.anIntArray245[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2853 / 4096.0F)));
		this.anIntArray245[2] = (int) (Math.sin((double) ((float) this.anInt2858 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray245[0] * this.anIntArray245[0] >> 12;
		@Pc(87) int local87 = this.anIntArray245[1] * this.anIntArray245[1] >> 12;
		@Pc(99) int local99 = this.anIntArray245[2] * this.anIntArray245[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local87 + local75 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray245[0] = (this.anIntArray245[0] << 12) / local112;
			this.anIntArray245[2] = (this.anIntArray245[2] << 12) / local112;
			this.anIntArray245[1] = (this.anIntArray245[1] << 12) / local112;
		}
	}
}
