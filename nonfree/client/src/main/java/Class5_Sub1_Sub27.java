import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class5_Sub1_Sub27 extends Class5_Sub1 {

	@OriginalMember(owner = "client!mv", name = "F", descriptor = "I")
	private int anInt4263 = 3216;

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
	private int anInt4264 = 3216;

	@OriginalMember(owner = "client!mv", name = "E", descriptor = "[I")
	private final int[] anIntArray336 = new int[3];

	@OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
	private int anInt4269 = 4096;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub27() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(B)V")
	private void method3401() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt4263 / 4096.0F));
		this.anIntArray336[0] = (int) (local19 * Math.sin((double) ((float) this.anInt4264 / 4096.0F)) * 4096.0D);
		this.anIntArray336[1] = (int) (local19 * 4096.0D * Math.cos((double) ((float) this.anInt4264 / 4096.0F)));
		this.anIntArray336[2] = (int) (Math.sin((double) ((float) this.anInt4263 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray336[0] * this.anIntArray336[0] >> 12;
		@Pc(89) int local89 = this.anIntArray336[1] * this.anIntArray336[1] >> 12;
		@Pc(101) int local101 = this.anIntArray336[2] * this.anIntArray336[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray336[0] = (this.anIntArray336[0] << 12) / local114;
			this.anIntArray336[1] = (this.anIntArray336[1] << 12) / local114;
			this.anIntArray336[2] = (this.anIntArray336[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(28) int local28 = Static331.anInt5292 * this.anInt4269 >> 12;
			@Pc(40) int[] local40 = this.method5772(0, Static157.anInt2733 & arg0 - 1);
			@Pc(46) int[] local46 = this.method5772(0, arg0);
			@Pc(56) int[] local56 = this.method5772(0, arg0 + 1 & Static157.anInt2733);
			for (@Pc(58) int local58 = 0; local58 < Static148.anInt2666; local58++) {
				@Pc(73) int local73 = local28 * (local56[local58] - local40[local58]) >> 12;
				@Pc(93) int local93 = (local46[Static273.anInt4299 & local58 - 1] - local46[Static273.anInt4299 & local58 + 1]) * local28 >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(106) int local106 = local73 >> 4;
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(140) int local140 = Class204.aByteArray72[((local106 + 1) * local106 >> 1) + local97] & 0xFF;
				@Pc(146) int local146 = local73 * local140 >> 8;
				@Pc(152) int local152 = local140 * 4096 >> 8;
				@Pc(158) int local158 = local93 * local140 >> 8;
				@Pc(167) int local167 = local146 * this.anIntArray336[1] >> 12;
				@Pc(176) int local176 = local158 * this.anIntArray336[0] >> 12;
				@Pc(185) int local185 = local152 * this.anIntArray336[2] >> 12;
				local17[local58] = local167 + local176 + local185;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4269 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt4264 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt4263 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		this.method3401();
	}
}
