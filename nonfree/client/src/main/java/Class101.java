import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public abstract class Class101 {

	@OriginalMember(owner = "client!fda", name = "f", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	private int anInt9139 = 4;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	protected int anInt9145 = 4;

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
	private int anInt9140 = 4;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "[S")
	private final short[] aShortArray145 = new short[512];

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
	private int anInt9146 = 4;

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
	private int anInt9143 = 0;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIII)V")
	protected Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9146 = arg3;
		this.anInt9143 = arg0;
		this.anInt9139 = arg4;
		this.anInt9145 = arg1;
		this.anInt9140 = arg2;
		this.method7246();
		this.method7248();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIII)V")
	protected final void method7243() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local14[local22] = (local22 << 12) / 128;
		}
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local17[local38] = (local38 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local20[local58] = (local58 << 12) / 16;
		}
		this.method7244();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt9145; local89++) {
						@Pc(98) int local98 = this.aShortArray144[local89] << 12;
						@Pc(106) int local106 = local14[local85] * local98 >> 12;
						@Pc(114) int local114 = local20[local77] * local98 >> 12;
						@Pc(121) int local121 = this.anInt9140 * local98 >> 12;
						@Pc(128) int local128 = this.anInt9139 * local98 >> 12;
						@Pc(135) int local135 = this.anInt9146 * local98 >> 12;
						@Pc(143) int local143 = local17[local81] * local98 >> 12;
						@Pc(148) int local148 = local106 * this.anInt9140;
						@Pc(153) int local153 = local143 * this.anInt9146;
						@Pc(158) int local158 = local114 * this.anInt9139;
						@Pc(162) int local162 = local148 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local153 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local158 >> 12;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local182 + 1;
						@Pc(194) int local194 = local182 & 0xFF;
						if (local166 >= local121) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						local114 = local158 & 0xFFF;
						if (local190 < local128) {
							local190 &= 0xFF;
						} else {
							local190 = 0;
						}
						if (local178 < local135) {
							local178 &= 0xFF;
						} else {
							local178 = 0;
						}
						local106 = local148 & 0xFFF;
						local143 = local153 & 0xFFF;
						@Pc(251) int local251 = Class6_Sub5_Sub13.anIntArray455[local143];
						@Pc(255) int local255 = Class6_Sub5_Sub13.anIntArray455[local106];
						@Pc(260) short local260 = this.aShortArray145[local194];
						@Pc(264) int local264 = local106 - 4096;
						@Pc(268) int local268 = Class6_Sub5_Sub13.anIntArray455[local114];
						@Pc(272) int local272 = local114 - 4096;
						@Pc(276) int local276 = local143 - 4096;
						@Pc(281) short local281 = this.aShortArray145[local190];
						@Pc(288) short local288 = this.aShortArray145[local260 + local186];
						@Pc(295) short local295 = this.aShortArray145[local178 + local260];
						@Pc(302) short local302 = this.aShortArray145[local186 + local281];
						@Pc(309) short local309 = this.aShortArray145[local281 + local178];
						@Pc(321) int local321 = Static532.method7257(local114, local106, local143, this.aShortArray145[local288 + local170]);
						@Pc(334) int local334 = Static532.method7257(local114, local264, local143, this.aShortArray145[local166 + local288]);
						@Pc(345) int local345 = ((local334 - local321) * local255 >> 12) + local321;
						@Pc(357) int local357 = Static532.method7257(local114, local106, local276, this.aShortArray145[local295 + local170]);
						@Pc(369) int local369 = Static532.method7257(local114, local264, local276, this.aShortArray145[local295 + local166]);
						@Pc(379) int local379 = local357 + ((local369 - local357) * local255 >> 12);
						@Pc(391) int local391 = Static532.method7257(local272, local106, local143, this.aShortArray145[local302 + local170]);
						@Pc(402) int local402 = ((local379 - local345) * local251 >> 12) + local345;
						@Pc(415) int local415 = Static532.method7257(local272, local264, local143, this.aShortArray145[local166 + local302]);
						@Pc(426) int local426 = local391 + ((local415 - local391) * local255 >> 12);
						@Pc(438) int local438 = Static532.method7257(local272, local106, local276, this.aShortArray145[local309 + local170]);
						@Pc(450) int local450 = Static532.method7257(local272, local264, local276, this.aShortArray145[local166 + local309]);
						@Pc(461) int local461 = local438 + (local255 * (local450 - local438) >> 12);
						@Pc(472) int local472 = ((local461 - local426) * local251 >> 12) + local426;
						this.method7245(local402 + ((local472 - local402) * local268 >> 12), local89);
					}
					this.method7247();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V")
	protected abstract void method7244();

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
	protected abstract void method7245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(B)V")
	private void method7246() {
		this.aShortArray144 = new short[this.anInt9145];
		for (@Pc(17) int local17 = 0; local17 < this.anInt9145; local17++) {
			this.aShortArray144[local17] = (short) Math.pow(2.0D, (double) local17);
		}
	}

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "(B)V")
	protected abstract void method7247();

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)V")
	private void method7248() {
		@Pc(18) Random local18 = new Random((long) this.anInt9143);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray145[local20] = (short) local20;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(42) int local42 = 255 - local36;
			@Pc(47) int local47 = Static309.method4643(local18, local42);
			@Pc(52) short local52 = this.aShortArray145[local47];
			this.aShortArray145[local47] = this.aShortArray145[local42];
			this.aShortArray145[local42] = this.aShortArray145[local42 + 256] = local52;
		}
	}
}
