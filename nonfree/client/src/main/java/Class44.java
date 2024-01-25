import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public abstract class Class44 {

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "[S")
	private final short[] aShortArray75 = new short[512];

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	private int anInt5627 = 4;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
	private int anInt5626 = 0;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
	private int anInt5628 = 4;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	protected int anInt5632 = 4;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	private int anInt5631 = 4;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIII)V")
	protected Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5632 = arg1;
		this.anInt5631 = arg3;
		this.anInt5626 = arg0;
		this.anInt5627 = arg2;
		this.anInt5628 = arg4;
		this.method4572();
		this.method4570();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	protected abstract void method4568();

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)V")
	private void method4570() {
		@Pc(12) Random local12 = new Random((long) this.anInt5626);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray75[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(40) int local40 = Static120.method2330(local12, local35);
			@Pc(45) short local45 = this.aShortArray75[local40];
			this.aShortArray75[local40] = this.aShortArray75[local35];
			this.aShortArray75[local35] = this.aShortArray75[local35 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
	protected abstract void method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
	private void method4572() {
		this.aShortArray76 = new short[this.anInt5632];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5632; local12++) {
			this.aShortArray76[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII)V")
	protected final void method4573() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
			local14[local61] = (local61 << 12) / 16;
		}
		this.method4574();
		for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
					for (@Pc(96) int local96 = 0; local96 < this.anInt5632; local96++) {
						@Pc(105) int local105 = this.aShortArray76[local96] << 12;
						@Pc(113) int local113 = local105 * local11[local88] >> 12;
						@Pc(120) int local120 = local105 * this.anInt5628 >> 12;
						@Pc(127) int local127 = local105 * this.anInt5631 >> 12;
						@Pc(135) int local135 = local105 * local14[local84] >> 12;
						@Pc(143) int local143 = local105 * local8[local92] >> 12;
						@Pc(150) int local150 = local105 * this.anInt5627 >> 12;
						@Pc(155) int local155 = local135 * this.anInt5628;
						@Pc(160) int local160 = local143 * this.anInt5627;
						@Pc(165) int local165 = local113 * this.anInt5631;
						@Pc(169) int local169 = local160 >> 12;
						@Pc(173) int local173 = local169 + 1;
						@Pc(177) int local177 = local165 >> 12;
						@Pc(181) int local181 = local169 & 0xFF;
						@Pc(185) int local185 = local177 + 1;
						@Pc(189) int local189 = local177 & 0xFF;
						@Pc(193) int local193 = local155 >> 12;
						@Pc(197) int local197 = local193 + 1;
						if (local185 < local127) {
							local185 &= 0xFF;
						} else {
							local185 = 0;
						}
						if (local197 < local120) {
							local197 &= 0xFF;
						} else {
							local197 = 0;
						}
						if (local150 <= local173) {
							local173 = 0;
						} else {
							local173 &= 0xFF;
						}
						local193 &= 0xFF;
						local143 = local160 & 0xFFF;
						local113 = local165 & 0xFFF;
						local135 = local155 & 0xFFF;
						@Pc(262) int local262 = local135 - 4096;
						@Pc(266) int local266 = local143 - 4096;
						@Pc(270) int local270 = Class32_Sub5.anIntArray375[local135];
						@Pc(275) short local275 = this.aShortArray75[local193];
						@Pc(280) short local280 = this.aShortArray75[local197];
						@Pc(284) int local284 = Class32_Sub5.anIntArray375[local143];
						@Pc(288) int local288 = Class32_Sub5.anIntArray375[local113];
						@Pc(292) int local292 = local113 - 4096;
						@Pc(299) short local299 = this.aShortArray75[local275 + local185];
						@Pc(306) short local306 = this.aShortArray75[local280 + local189];
						@Pc(313) short local313 = this.aShortArray75[local280 + local185];
						@Pc(321) short local321 = this.aShortArray75[local189 + local275];
						@Pc(335) int local335 = Static573.method7734(local113, this.aShortArray75[local321 + local181], local143, local135);
						@Pc(347) int local347 = Static573.method7734(local113, this.aShortArray75[local321 + local173], local266, local135);
						@Pc(357) int local357 = (local284 * (local347 - local335) >> 12) + local335;
						@Pc(370) int local370 = Static573.method7734(local292, this.aShortArray75[local181 + local299], local143, local135);
						@Pc(382) int local382 = Static573.method7734(local292, this.aShortArray75[local173 + local299], local266, local135);
						@Pc(392) int local392 = ((local382 - local370) * local284 >> 12) + local370;
						@Pc(404) int local404 = Static573.method7734(local113, this.aShortArray75[local306 + local181], local143, local262);
						@Pc(415) int local415 = ((local392 - local357) * local288 >> 12) + local357;
						@Pc(428) int local428 = Static573.method7734(local113, this.aShortArray75[local173 + local306], local266, local262);
						@Pc(439) int local439 = local404 + (local284 * (local428 - local404) >> 12);
						@Pc(451) int local451 = Static573.method7734(local292, this.aShortArray75[local313 + local181], local143, local262);
						@Pc(464) int local464 = Static573.method7734(local292, this.aShortArray75[local173 + local313], local266, local262);
						@Pc(475) int local475 = local451 + ((local464 - local451) * local284 >> 12);
						@Pc(486) int local486 = ((local475 - local439) * local288 >> 12) + local439;
						this.method4571(local415 + ((local486 - local415) * local270 >> 12), local96);
					}
					this.method4568();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
	protected abstract void method4574();
}
