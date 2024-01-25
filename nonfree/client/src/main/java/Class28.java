import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public abstract class Class28 {

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	protected int anInt6019 = 4;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	private int anInt6022 = 0;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	private int anInt6021 = 4;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	private int anInt6023 = 4;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "[S")
	private final short[] aShortArray100 = new short[512];

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	private int anInt6027 = 4;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIII)V")
	protected Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6022 = arg0;
		this.anInt6023 = arg2;
		this.anInt6019 = arg1;
		this.anInt6021 = arg4;
		this.anInt6027 = arg3;
		this.method5037();
		this.method5040();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	private void method5037() {
		this.aShortArray99 = new short[this.anInt6019];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6019; local18++) {
			this.aShortArray99[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	protected abstract void method5038();

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	private void method5040() {
		@Pc(10) Random local10 = new Random((long) this.anInt6022);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray100[local12] = (short) local12;
		}
		for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
			@Pc(31) int local31 = 255 - local25;
			@Pc(36) int local36 = Static300.method5748(local10, local31);
			@Pc(41) short local41 = this.aShortArray100[local36];
			this.aShortArray100[local36] = this.aShortArray100[local31];
			this.aShortArray100[local31] = this.aShortArray100[local31 + 256] = local41;
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
	protected abstract void method5041();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V")
	protected final void method5042() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			local6[local11] = (local11 << 12) / 128;
		}
		@Pc(27) int[] local27 = new int[16];
		for (@Pc(35) int local35 = 0; local35 < 128; local35++) {
			local9[local35] = (local35 << 12) / 128;
		}
		for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
			local27[local50] = (local50 << 12) / 16;
		}
		this.method5038();
		for (@Pc(72) int local72 = 0; local72 < 16; local72++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(78) int local78 = 0; local78 < 128; local78++) {
					for (@Pc(81) int local81 = 0; local81 < this.anInt6019; local81++) {
						@Pc(89) int local89 = this.aShortArray99[local81] << 12;
						@Pc(96) int local96 = local89 * this.anInt6027 >> 12;
						@Pc(104) int local104 = local6[local78] * local89 >> 12;
						@Pc(112) int local112 = local89 * local9[local75] >> 12;
						@Pc(120) int local120 = local27[local72] * local89 >> 12;
						@Pc(127) int local127 = local89 * this.anInt6023 >> 12;
						@Pc(134) int local134 = this.anInt6021 * local89 >> 12;
						@Pc(139) int local139 = local112 * this.anInt6027;
						@Pc(144) int local144 = local120 * this.anInt6021;
						@Pc(149) int local149 = local104 * this.anInt6023;
						@Pc(153) int local153 = local149 >> 12;
						@Pc(157) int local157 = local153 + 1;
						@Pc(161) int local161 = local139 >> 12;
						@Pc(165) int local165 = local153 & 0xFF;
						@Pc(169) int local169 = local161 + 1;
						@Pc(173) int local173 = local144 >> 12;
						@Pc(177) int local177 = local161 & 0xFF;
						@Pc(181) int local181 = local173 + 1;
						if (local127 > local157) {
							local157 &= 0xFF;
						} else {
							local157 = 0;
						}
						local120 = local144 & 0xFFF;
						local112 = local139 & 0xFFF;
						local104 = local149 & 0xFFF;
						local173 &= 0xFF;
						if (local96 <= local169) {
							local169 = 0;
						} else {
							local169 &= 0xFF;
						}
						if (local134 <= local181) {
							local181 = 0;
						} else {
							local181 &= 0xFF;
						}
						@Pc(240) short local240 = this.aShortArray100[local173];
						@Pc(244) int local244 = local120 - 4096;
						@Pc(249) short local249 = this.aShortArray100[local181];
						@Pc(253) int local253 = Class59.anIntArray151[local104];
						@Pc(257) int local257 = Class59.anIntArray151[local112];
						@Pc(261) int local261 = local112 - 4096;
						@Pc(265) int local265 = local104 - 4096;
						@Pc(269) int local269 = Class59.anIntArray151[local120];
						@Pc(276) short local276 = this.aShortArray100[local249 + local169];
						@Pc(283) short local283 = this.aShortArray100[local240 + local177];
						@Pc(290) short local290 = this.aShortArray100[local249 + local177];
						@Pc(298) short local298 = this.aShortArray100[local169 + local240];
						@Pc(312) int local312 = Static264.method3900(local104, local120, local112, this.aShortArray100[local283 + local165]);
						@Pc(326) int local326 = Static264.method3900(local265, local120, local112, this.aShortArray100[local283 + local157]);
						@Pc(338) int local338 = local312 + ((local326 - local312) * local253 >> 12);
						@Pc(352) int local352 = Static264.method3900(local104, local120, local261, this.aShortArray100[local165 + local298]);
						@Pc(364) int local364 = Static264.method3900(local265, local120, local261, this.aShortArray100[local157 + local298]);
						@Pc(375) int local375 = (local253 * (local364 - local352) >> 12) + local352;
						@Pc(386) int local386 = (local257 * (local375 - local338) >> 12) + local338;
						@Pc(398) int local398 = Static264.method3900(local104, local244, local112, this.aShortArray100[local290 + local165]);
						@Pc(410) int local410 = Static264.method3900(local265, local244, local112, this.aShortArray100[local290 + local157]);
						@Pc(420) int local420 = (local253 * (local410 - local398) >> 12) + local398;
						@Pc(434) int local434 = Static264.method3900(local104, local244, local261, this.aShortArray100[local165 + local276]);
						@Pc(448) int local448 = Static264.method3900(local265, local244, local261, this.aShortArray100[local276 + local157]);
						@Pc(460) int local460 = local434 + (local253 * (local448 - local434) >> 12);
						@Pc(472) int local472 = local420 + ((local460 - local420) * local257 >> 12);
						this.method5043(local386 + (local269 * (local472 - local386) >> 12), local81);
					}
					this.method5041();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZII)V")
	protected abstract void method5043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
