import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public abstract class Class48 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[S")
	private short[] aShortArray193;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "[S")
	private final short[] aShortArray194 = new short[512];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	private int anInt5643 = 4;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	protected int anInt5645 = 4;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	private int anInt5644 = 0;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	private int anInt5647 = 4;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	private int anInt5650 = 4;

	static {
		new Class83("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIII)V")
	protected Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5645 = arg1;
		this.anInt5643 = arg4;
		this.anInt5650 = arg3;
		this.anInt5644 = arg0;
		this.anInt5647 = arg2;
		this.method4401();
		this.method4404();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BIII)V")
	protected final void method4400() {
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[128];
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			local13[local18] = (local18 << 12) / 128;
		}
		@Pc(39) int[] local39 = new int[16];
		for (@Pc(41) int local41 = 0; local41 < 128; local41++) {
			local16[local41] = (local41 << 12) / 128;
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			local39[local57] = (local57 << 12) / 16;
		}
		this.method4407();
		for (@Pc(80) int local80 = 0; local80 < 16; local80++) {
			for (@Pc(84) int local84 = 0; local84 < 128; local84++) {
				for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
					for (@Pc(92) int local92 = 0; local92 < this.anInt5645; local92++) {
						@Pc(101) int local101 = this.aShortArray193[local92] << 12;
						@Pc(109) int local109 = local101 * local13[local88] >> 12;
						@Pc(116) int local116 = local101 * this.anInt5643 >> 12;
						@Pc(123) int local123 = local101 * this.anInt5650 >> 12;
						@Pc(131) int local131 = local39[local80] * local101 >> 12;
						@Pc(139) int local139 = local101 * local16[local84] >> 12;
						@Pc(146) int local146 = this.anInt5647 * local101 >> 12;
						@Pc(151) int local151 = local109 * this.anInt5647;
						@Pc(156) int local156 = local139 * this.anInt5650;
						@Pc(161) int local161 = local131 * this.anInt5643;
						@Pc(165) int local165 = local151 >> 12;
						@Pc(169) int local169 = local165 + 1;
						@Pc(173) int local173 = local156 >> 12;
						@Pc(177) int local177 = local165 & 0xFF;
						@Pc(181) int local181 = local173 + 1;
						@Pc(185) int local185 = local173 & 0xFF;
						@Pc(189) int local189 = local161 >> 12;
						@Pc(193) int local193 = local189 + 1;
						@Pc(197) int local197 = local156 & 0xFFF;
						@Pc(201) int local201 = local189 & 0xFF;
						@Pc(205) int local205 = local151 & 0xFFF;
						@Pc(209) int local209 = local161 & 0xFFF;
						if (local116 <= local193) {
							local193 = 0;
						} else {
							local193 &= 0xFF;
						}
						if (local169 < local146) {
							local169 &= 0xFF;
						} else {
							local169 = 0;
						}
						if (local123 > local181) {
							local181 &= 0xFF;
						} else {
							local181 = 0;
						}
						@Pc(250) int local250 = Class75.anIntArray163[local205];
						@Pc(255) short local255 = this.aShortArray194[local193];
						@Pc(259) int local259 = local209 - 4096;
						@Pc(263) int local263 = local205 - 4096;
						@Pc(267) int local267 = local197 - 4096;
						@Pc(272) short local272 = this.aShortArray194[local201];
						@Pc(276) int local276 = Class75.anIntArray163[local197];
						@Pc(280) int local280 = Class75.anIntArray163[local209];
						@Pc(288) short local288 = this.aShortArray194[local185 + local255];
						@Pc(295) short local295 = this.aShortArray194[local255 + local181];
						@Pc(302) short local302 = this.aShortArray194[local181 + local272];
						@Pc(309) short local309 = this.aShortArray194[local272 + local185];
						@Pc(322) int local322 = Static341.method5180(local197, local205, local209, this.aShortArray194[local177 + local309]);
						@Pc(335) int local335 = Static341.method5180(local197, local263, local209, this.aShortArray194[local169 + local309]);
						@Pc(346) int local346 = local322 + (local250 * (local335 - local322) >> 12);
						@Pc(358) int local358 = Static341.method5180(local267, local205, local209, this.aShortArray194[local302 + local177]);
						@Pc(370) int local370 = Static341.method5180(local267, local263, local209, this.aShortArray194[local169 + local302]);
						@Pc(381) int local381 = local358 + (local250 * (local370 - local358) >> 12);
						@Pc(393) int local393 = local346 + (local276 * (local381 - local346) >> 12);
						@Pc(405) int local405 = Static341.method5180(local197, local205, local259, this.aShortArray194[local288 + local177]);
						@Pc(417) int local417 = Static341.method5180(local197, local263, local259, this.aShortArray194[local288 + local169]);
						@Pc(428) int local428 = ((local417 - local405) * local250 >> 12) + local405;
						@Pc(440) int local440 = Static341.method5180(local267, local205, local259, this.aShortArray194[local295 + local177]);
						@Pc(452) int local452 = Static341.method5180(local267, local263, local259, this.aShortArray194[local295 + local169]);
						@Pc(462) int local462 = ((local452 - local440) * local250 >> 12) + local440;
						@Pc(474) int local474 = local428 + (local276 * (local462 - local428) >> 12);
						this.method4405(local92, local393 + (local280 * (local474 - local393) >> 12));
					}
					this.method4402();
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	private void method4401() {
		this.aShortArray193 = new short[this.anInt5645];
		for (@Pc(21) int local21 = 0; local21 < this.anInt5645; local21++) {
			this.aShortArray193[local21] = (short) Math.pow(2.0D, (double) local21);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	protected abstract void method4402();

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	private void method4404() {
		@Pc(17) Random local17 = new Random((long) this.anInt5644);
		for (@Pc(19) int local19 = 0; local19 < 255; local19++) {
			this.aShortArray194[local19] = (short) local19;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42 = 255 - local35;
			@Pc(47) int local47 = Static226.method3443(local17, local42);
			@Pc(52) short local52 = this.aShortArray194[local47];
			this.aShortArray194[local47] = this.aShortArray194[local42];
			this.aShortArray194[local42] = this.aShortArray194[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIZ)V")
	protected abstract void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	protected abstract void method4407();
}
