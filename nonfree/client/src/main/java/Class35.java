import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public abstract class Class35 {

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	private int anInt6550 = 4;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
	private int anInt6551 = 0;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	private int anInt6552 = 4;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
	private int anInt6556 = 4;

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
	protected int anInt6557 = 4;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "[S")
	private final short[] aShortArray106 = new short[512];

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIII)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6551 = arg0;
		this.anInt6557 = arg1;
		this.anInt6550 = arg2;
		this.anInt6552 = arg3;
		this.anInt6556 = arg4;
		this.method5901();
		this.method5903();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)V")
	protected abstract void method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	protected abstract void method5900();

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	private void method5901() {
		this.aShortArray107 = new short[this.anInt6557];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6557; local12++) {
			this.aShortArray107[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
	protected abstract void method5902();

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	private void method5903() {
		@Pc(12) Random local12 = new Random((long) this.anInt6551);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray106[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static438.method6797(local37, local12);
			@Pc(47) short local47 = this.aShortArray106[local42];
			this.aShortArray106[local42] = this.aShortArray106[local37];
			this.aShortArray106[local37] = this.aShortArray106[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
	protected final void method5904() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(30) int[] local30 = new int[16];
		for (@Pc(32) int local32 = 0; local32 < 128; local32++) {
			local11[local32] = (local32 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local30[local52] = (local52 << 12) / 16;
		}
		this.method5902();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt6557; local89++) {
						@Pc(98) int local98 = this.aShortArray107[local89] << 12;
						@Pc(106) int local106 = local8[local85] * local98 >> 12;
						@Pc(114) int local114 = local30[local77] * local98 >> 12;
						@Pc(121) int local121 = local98 * this.anInt6556 >> 12;
						@Pc(128) int local128 = local98 * this.anInt6550 >> 12;
						@Pc(136) int local136 = local11[local81] * local98 >> 12;
						@Pc(143) int local143 = this.anInt6552 * local98 >> 12;
						@Pc(148) int local148 = local136 * this.anInt6552;
						@Pc(153) int local153 = local106 * this.anInt6550;
						@Pc(158) int local158 = local114 * this.anInt6556;
						@Pc(162) int local162 = local153 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local148 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local174 & 0xFF;
						@Pc(186) int local186 = local158 >> 12;
						@Pc(190) int local190 = local186 + 1;
						@Pc(194) int local194 = local158 & 0xFFF;
						@Pc(198) int local198 = local186 & 0xFF;
						if (local166 < local128) {
							local166 &= 0xFF;
						} else {
							local166 = 0;
						}
						local106 = local153 & 0xFFF;
						local136 = local148 & 0xFFF;
						if (local190 >= local121) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						if (local143 <= local178) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						@Pc(255) int local255 = local106 - 4096;
						@Pc(259) int local259 = local136 - 4096;
						@Pc(263) int local263 = local194 - 4096;
						@Pc(267) int local267 = Class313.anIntArray811[local136];
						@Pc(272) short local272 = this.aShortArray106[local198];
						@Pc(276) int local276 = Class313.anIntArray811[local106];
						@Pc(280) int local280 = Class313.anIntArray811[local194];
						@Pc(285) short local285 = this.aShortArray106[local190];
						@Pc(292) short local292 = this.aShortArray106[local178 + local285];
						@Pc(300) short local300 = this.aShortArray106[local178 + local272];
						@Pc(307) short local307 = this.aShortArray106[local272 + local182];
						@Pc(315) short local315 = this.aShortArray106[local182 + local285];
						@Pc(327) int local327 = Static530.method8093(this.aShortArray106[local307 + local170], local194, local106, local136);
						@Pc(339) int local339 = Static530.method8093(this.aShortArray106[local307 + local166], local194, local255, local136);
						@Pc(351) int local351 = local327 + ((local339 - local327) * local276 >> 12);
						@Pc(363) int local363 = Static530.method8093(this.aShortArray106[local170 + local300], local194, local106, local259);
						@Pc(376) int local376 = Static530.method8093(this.aShortArray106[local166 + local300], local194, local255, local259);
						@Pc(386) int local386 = (local276 * (local376 - local363) >> 12) + local363;
						@Pc(397) int local397 = local351 + ((local386 - local351) * local267 >> 12);
						@Pc(409) int local409 = Static530.method8093(this.aShortArray106[local315 + local170], local263, local106, local136);
						@Pc(422) int local422 = Static530.method8093(this.aShortArray106[local166 + local315], local263, local255, local136);
						@Pc(434) int local434 = local409 + ((local422 - local409) * local276 >> 12);
						@Pc(446) int local446 = Static530.method8093(this.aShortArray106[local170 + local292], local263, local106, local259);
						@Pc(458) int local458 = Static530.method8093(this.aShortArray106[local292 + local166], local263, local255, local259);
						@Pc(470) int local470 = local446 + ((local458 - local446) * local276 >> 12);
						@Pc(481) int local481 = ((local470 - local434) * local267 >> 12) + local434;
						this.method5899((local280 * (local481 - local397) >> 12) + local397, local89);
					}
					this.method5900();
				}
			}
		}
	}
}
