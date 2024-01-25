import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public abstract class Class112 {

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "[S")
	private final short[] aShortArray140 = new short[512];

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
	protected int anInt10140 = 4;

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
	private int anInt10142 = 4;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
	private int anInt10144 = 4;

	@OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
	private int anInt10143 = 0;

	@OriginalMember(owner = "client!oea", name = "m", descriptor = "I")
	private int anInt10137 = 4;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(IIIII)V")
	protected Class112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10137 = arg2;
		this.anInt10143 = arg0;
		this.anInt10144 = arg4;
		this.anInt10140 = arg1;
		this.anInt10142 = arg3;
		this.method8627();
		this.method8624();
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
	private void method8624() {
		@Pc(12) Random local12 = new Random((long) this.anInt10143);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray140[local22] = (short) local22;
		}
		for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
			@Pc(49) int local49 = 255 - local40;
			@Pc(54) int local54 = Static19.method614(local12, local49);
			@Pc(59) short local59 = this.aShortArray140[local54];
			this.aShortArray140[local54] = this.aShortArray140[local49];
			this.aShortArray140[local49] = this.aShortArray140[local49 + 256] = local59;
		}
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V")
	protected abstract void method8625();

	@OriginalMember(owner = "client!oea", name = "c", descriptor = "(Z)V")
	private void method8627() {
		this.aShortArray141 = new short[this.anInt10140];
		for (@Pc(17) int local17 = 0; local17 < this.anInt10140; local17++) {
			this.aShortArray141[local17] = (short) (int) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIII)V")
	protected final void method8629() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local16[local24] = (local24 << 12) / 128;
		}
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local19[local42] = (local42 << 12) / 128;
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			local22[local62] = (local62 << 12) / 16;
		}
		this.method8632();
		for (@Pc(89) int local89 = 0; local89 < 16; local89++) {
			for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
				for (@Pc(99) int local99 = 0; local99 < 128; local99++) {
					for (@Pc(103) int local103 = 0; local103 < this.anInt10140; local103++) {
						@Pc(114) int local114 = this.aShortArray141[local103] << 12;
						@Pc(121) int local121 = this.anInt10137 * local114 >> 12;
						@Pc(129) int local129 = local114 * local16[local99] >> 12;
						@Pc(137) int local137 = local22[local89] * local114 >> 12;
						@Pc(144) int local144 = this.anInt10144 * local114 >> 12;
						@Pc(152) int local152 = local19[local95] * local114 >> 12;
						@Pc(159) int local159 = this.anInt10142 * local114 >> 12;
						@Pc(164) int local164 = local137 * this.anInt10144;
						@Pc(169) int local169 = local129 * this.anInt10137;
						@Pc(174) int local174 = local152 * this.anInt10142;
						@Pc(178) int local178 = local169 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local174 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local164 >> 12;
						@Pc(202) int local202 = local186 & 0xFF;
						@Pc(206) int local206 = local198 + 1;
						@Pc(210) int local210 = local164 & 0xFFF;
						if (local159 > local194) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local198 &= 0xFF;
						local129 = local169 & 0xFFF;
						if (local144 <= local206) {
							local206 = 0;
						} else {
							local206 &= 0xFF;
						}
						if (local182 >= local121) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local152 = local174 & 0xFFF;
						@Pc(267) int local267 = Class21_Sub15.anIntArray413[local129];
						@Pc(271) int local271 = local210 - 4096;
						@Pc(276) short local276 = this.aShortArray140[local206];
						@Pc(280) int local280 = Class21_Sub15.anIntArray413[local210];
						@Pc(284) int local284 = local152 - 4096;
						@Pc(288) int local288 = Class21_Sub15.anIntArray413[local152];
						@Pc(293) short local293 = this.aShortArray140[local198];
						@Pc(297) int local297 = local129 - 4096;
						@Pc(304) short local304 = this.aShortArray140[local293 + local202];
						@Pc(311) short local311 = this.aShortArray140[local293 + local194];
						@Pc(318) short local318 = this.aShortArray140[local194 + local276];
						@Pc(325) short local325 = this.aShortArray140[local276 + local202];
						@Pc(337) int local337 = Static203.method3086(local129, local210, this.aShortArray140[local304 + local190], local152);
						@Pc(349) int local349 = Static203.method3086(local297, local210, this.aShortArray140[local304 + local182], local152);
						@Pc(360) int local360 = ((local349 - local337) * local267 >> 12) + local337;
						@Pc(372) int local372 = Static203.method3086(local129, local210, this.aShortArray140[local311 + local190], local284);
						@Pc(385) int local385 = Static203.method3086(local297, local210, this.aShortArray140[local182 + local311], local284);
						@Pc(396) int local396 = (local267 * (local385 - local372) >> 12) + local372;
						@Pc(406) int local406 = (local288 * (local396 - local360) >> 12) + local360;
						@Pc(418) int local418 = Static203.method3086(local129, local271, this.aShortArray140[local190 + local325], local152);
						@Pc(430) int local430 = Static203.method3086(local297, local271, this.aShortArray140[local325 + local182], local152);
						@Pc(440) int local440 = local418 + ((local430 - local418) * local267 >> 12);
						@Pc(452) int local452 = Static203.method3086(local129, local271, this.aShortArray140[local190 + local318], local284);
						@Pc(464) int local464 = Static203.method3086(local297, local271, this.aShortArray140[local182 + local318], local284);
						@Pc(475) int local475 = ((local464 - local452) * local267 >> 12) + local452;
						@Pc(487) int local487 = local440 + (local288 * (local475 - local440) >> 12);
						this.method8630(local406 + (local280 * (local487 - local406) >> 12), local103);
					}
					this.method8625();
				}
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)V")
	protected abstract void method8630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
	protected abstract void method8632();
}
