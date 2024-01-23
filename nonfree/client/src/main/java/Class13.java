import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public abstract class Class13 {

	@OriginalMember(owner = "client!an", name = "i", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "[S")
	private short[] aShortArray48 = new short[512];

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	private int anInt2929 = 4;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "I")
	private int anInt2930 = 4;

	@OriginalMember(owner = "client!an", name = "l", descriptor = "I")
	protected int anInt2932 = 4;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	private int anInt2934 = 0;

	@OriginalMember(owner = "client!an", name = "o", descriptor = "I")
	private int anInt2935 = 4;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIII)V")
	protected Class13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2929 = arg2;
		this.anInt2932 = arg1;
		this.anInt2934 = arg0;
		this.anInt2930 = arg4;
		this.anInt2935 = arg3;
		this.method2228();
		this.method2229();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IBII)V")
	protected final void method2226() {
		@Pc(16) int[] local16 = new int[64];
		@Pc(19) int[] local19 = new int[64];
		@Pc(22) int[] local22 = new int[64];
		@Pc(24) int local24;
		for (local24 = 0; local24 < 64; local24++) {
			local22[local24] = (local24 << 12) / 64;
		}
		for (local24 = 0; local24 < 64; local24++) {
			local19[local24] = (local24 << 12) / 64;
		}
		for (local24 = 0; local24 < 64; local24++) {
			local16[local24] = (local24 << 12) / 64;
		}
		this.method2230();
		for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
			for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					for (@Pc(106) int local106 = 0; local106 < this.anInt2932; local106++) {
						local24 = this.aShortArray49[local106] << 12;
						@Pc(125) int local125 = local19[local92] * local24 >> 12;
						@Pc(130) int local130 = local125 * this.anInt2935;
						@Pc(137) int local137 = this.anInt2935 * local24 >> 12;
						@Pc(145) int local145 = local24 * local16[local83] >> 12;
						@Pc(153) int local153 = local22[local97] * local24 >> 12;
						@Pc(157) int local157 = local130 >> 12;
						@Pc(162) int local162 = local145 * this.anInt2930;
						@Pc(166) int local166 = local157 + 1;
						@Pc(170) int local170 = local157 & 0xFF;
						if (local166 >= local137) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						@Pc(192) int local192 = this.anInt2929 * local24 >> 12;
						local125 = local130 & 0xFFF;
						@Pc(200) int local200 = local125 - 4096;
						@Pc(204) int local204 = Class10_Sub2_Sub1.anIntArray213[local125];
						@Pc(211) int local211 = this.anInt2930 * local24 >> 12;
						local153 *= this.anInt2929;
						@Pc(220) int local220 = local153 >> 12;
						@Pc(224) int local224 = local220 + 1;
						local153 &= 0xFFF;
						if (local224 >= local192) {
							local224 = 0;
						} else {
							local224 &= 0xFF;
						}
						@Pc(243) int local243 = local153 - 4096;
						@Pc(247) int local247 = local162 >> 12;
						@Pc(251) int local251 = local247 + 1;
						@Pc(255) int local255 = Class10_Sub2_Sub1.anIntArray213[local153];
						local145 = local162 & 0xFFF;
						local220 &= 0xFF;
						@Pc(267) int local267 = local247 & 0xFF;
						@Pc(272) short local272 = this.aShortArray48[local267];
						@Pc(279) short local279 = this.aShortArray48[local272 + local166];
						@Pc(283) int local283 = Class10_Sub2_Sub1.anIntArray213[local145];
						@Pc(290) short local290 = this.aShortArray48[local272 + local170];
						@Pc(294) int local294 = local145 - 4096;
						if (local211 <= local251) {
							local251 = 0;
						} else {
							local251 &= 0xFF;
						}
						@Pc(310) short local310 = this.aShortArray48[local251];
						@Pc(317) short local317 = this.aShortArray48[local310 + local166];
						@Pc(324) short local324 = this.aShortArray48[local310 + local170];
						@Pc(336) int local336 = Static206.method3661(local153, local145, local125, this.aShortArray48[local220 + local290]);
						@Pc(349) int local349 = Static206.method3661(local243, local145, local125, this.aShortArray48[local224 + local290]);
						@Pc(359) int local359 = ((local349 - local336) * local255 >> 12) + local336;
						@Pc(371) int local371 = Static206.method3661(local153, local145, local200, this.aShortArray48[local279 + local220]);
						@Pc(383) int local383 = Static206.method3661(local243, local145, local200, this.aShortArray48[local279 + local224]);
						@Pc(394) int local394 = local371 + (local255 * (local383 - local371) >> 12);
						@Pc(405) int local405 = local359 + ((local394 - local359) * local204 >> 12);
						@Pc(418) int local418 = Static206.method3661(local153, local294, local125, this.aShortArray48[local220 + local324]);
						@Pc(430) int local430 = Static206.method3661(local243, local294, local125, this.aShortArray48[local224 + local324]);
						@Pc(440) int local440 = (local255 * (local430 - local418) >> 12) + local418;
						@Pc(452) int local452 = Static206.method3661(local153, local294, local200, this.aShortArray48[local317 + local220]);
						@Pc(464) int local464 = Static206.method3661(local243, local294, local200, this.aShortArray48[local317 + local224]);
						@Pc(475) int local475 = (local255 * (local464 - local452) >> 12) + local452;
						@Pc(486) int local486 = local440 + ((local475 - local440) * local204 >> 12);
						this.method2234(local405 + (local283 * (local486 - local405) >> 12), local106);
					}
					this.method2233();
				}
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	private void method2228() {
		this.aShortArray49 = new short[this.anInt2932];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2932; local18++) {
			this.aShortArray49[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	private void method2229() {
		@Pc(8) Random local8 = new Random((long) this.anInt2934);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray48[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(44) int local44 = 255 - local14;
			@Pc(49) int local49 = Static13.method291(local44, local8);
			@Pc(54) short local54 = this.aShortArray48[local49];
			this.aShortArray48[local49] = this.aShortArray48[local44];
			this.aShortArray48[local44] = this.aShortArray48[local44 + 256] = local54;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	protected abstract void method2230();

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	protected abstract void method2233();

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZI)V")
	protected abstract void method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
