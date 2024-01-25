import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public abstract class Class65 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	private int anInt4938 = 4;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	private int anInt4937 = 4;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "[S")
	private final short[] aShortArray88 = new short[512];

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	protected int anInt4940 = 4;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt4935 = 0;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	private int anInt4939 = 4;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIII)V")
	protected Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4940 = arg1;
		this.anInt4939 = arg2;
		this.anInt4935 = arg0;
		this.anInt4938 = arg3;
		this.anInt4937 = arg4;
		this.method3915();
		this.method3914();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	protected final void method3912() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local8[local19] = (local19 << 12) / 128;
		}
		@Pc(36) int[] local36 = new int[16];
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local17[local38] = (local38 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local36[local58] = (local58 << 12) / 16;
		}
		this.method3918();
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
				for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
					for (@Pc(93) int local93 = 0; local93 < this.anInt4940; local93++) {
						@Pc(102) int local102 = this.aShortArray87[local93] << 12;
						@Pc(109) int local109 = this.anInt4937 * local102 >> 12;
						@Pc(116) int local116 = this.anInt4938 * local102 >> 12;
						@Pc(124) int local124 = local36[local81] * local102 >> 12;
						@Pc(132) int local132 = local8[local89] * local102 >> 12;
						@Pc(139) int local139 = this.anInt4939 * local102 >> 12;
						@Pc(147) int local147 = local17[local85] * local102 >> 12;
						@Pc(152) int local152 = local132 * this.anInt4939;
						@Pc(157) int local157 = local124 * this.anInt4937;
						@Pc(162) int local162 = local147 * this.anInt4938;
						@Pc(166) int local166 = local152 >> 12;
						@Pc(170) int local170 = local166 + 1;
						@Pc(174) int local174 = local166 & 0xFF;
						@Pc(178) int local178 = local162 >> 12;
						@Pc(182) int local182 = local178 + 1;
						@Pc(186) int local186 = local157 >> 12;
						@Pc(190) int local190 = local178 & 0xFF;
						@Pc(194) int local194 = local186 + 1;
						@Pc(198) int local198 = local152 & 0xFFF;
						if (local116 <= local182) {
							local182 = 0;
						} else {
							local182 &= 0xFF;
						}
						local186 &= 0xFF;
						if (local139 > local170) {
							local170 &= 0xFF;
						} else {
							local170 = 0;
						}
						local124 = local157 & 0xFFF;
						if (local194 < local109) {
							local194 &= 0xFF;
						} else {
							local194 = 0;
						}
						local147 = local162 & 0xFFF;
						@Pc(251) int local251 = local147 - 4096;
						@Pc(255) int local255 = local124 - 4096;
						@Pc(259) int local259 = local198 - 4096;
						@Pc(263) int local263 = Class26_Sub3.anIntArray532[local147];
						@Pc(267) int local267 = Class26_Sub3.anIntArray532[local198];
						@Pc(271) int local271 = Class26_Sub3.anIntArray532[local124];
						@Pc(276) short local276 = this.aShortArray88[local194];
						@Pc(281) short local281 = this.aShortArray88[local186];
						@Pc(288) short local288 = this.aShortArray88[local281 + local182];
						@Pc(295) short local295 = this.aShortArray88[local281 + local190];
						@Pc(302) short local302 = this.aShortArray88[local182 + local276];
						@Pc(309) short local309 = this.aShortArray88[local276 + local190];
						@Pc(321) int local321 = Static266.method3589(this.aShortArray88[local295 + local174], local147, local124, local198);
						@Pc(333) int local333 = Static266.method3589(this.aShortArray88[local170 + local295], local147, local124, local259);
						@Pc(345) int local345 = local321 + ((local333 - local321) * local267 >> 12);
						@Pc(357) int local357 = Static266.method3589(this.aShortArray88[local288 + local174], local251, local124, local198);
						@Pc(369) int local369 = Static266.method3589(this.aShortArray88[local288 + local170], local251, local124, local259);
						@Pc(380) int local380 = (local267 * (local369 - local357) >> 12) + local357;
						@Pc(392) int local392 = Static266.method3589(this.aShortArray88[local309 + local174], local147, local255, local198);
						@Pc(403) int local403 = (local263 * (local380 - local345) >> 12) + local345;
						@Pc(415) int local415 = Static266.method3589(this.aShortArray88[local170 + local309], local147, local255, local259);
						@Pc(426) int local426 = (local267 * (local415 - local392) >> 12) + local392;
						@Pc(438) int local438 = Static266.method3589(this.aShortArray88[local174 + local302], local251, local255, local198);
						@Pc(451) int local451 = Static266.method3589(this.aShortArray88[local170 + local302], local251, local255, local259);
						@Pc(462) int local462 = local438 + ((local451 - local438) * local267 >> 12);
						@Pc(472) int local472 = local426 + ((local462 - local426) * local263 >> 12);
						this.method3913(local93, local403 + (local271 * (local472 - local403) >> 12));
					}
					this.method3916();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	protected abstract void method3913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	private void method3914() {
		@Pc(12) Random local12 = new Random((long) this.anInt4935);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray88[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(39) int local39 = 255 - local30;
			@Pc(44) int local44 = Static304.method4043(local39, local12);
			@Pc(49) short local49 = this.aShortArray88[local44];
			this.aShortArray88[local44] = this.aShortArray88[local39];
			this.aShortArray88[local39] = this.aShortArray88[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	private void method3915() {
		this.aShortArray87 = new short[this.anInt4940];
		for (@Pc(20) int local20 = 0; local20 < this.anInt4940; local20++) {
			this.aShortArray87[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	protected abstract void method3916();

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	protected abstract void method3918();
}
