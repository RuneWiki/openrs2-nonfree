import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public abstract class Class127 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	protected int anInt9588 = 4;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	private int anInt9595 = 4;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
	private int anInt9593 = 4;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	private int anInt9589 = 4;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "[S")
	private final short[] aShortArray141 = new short[512];

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	private int anInt9594 = 0;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIII)V")
	protected Class127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9588 = arg1;
		this.anInt9593 = arg4;
		this.anInt9594 = arg0;
		this.anInt9589 = arg2;
		this.anInt9595 = arg3;
		this.method7973();
		this.method7971();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	private void method7971() {
		@Pc(20) Random local20 = new Random((long) this.anInt9594);
		for (@Pc(22) int local22 = 0; local22 < 255; local22++) {
			this.aShortArray141[local22] = (short) local22;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static233.method3629(local20, local43);
			@Pc(53) short local53 = this.aShortArray141[local48];
			this.aShortArray141[local48] = this.aShortArray141[local43];
			this.aShortArray141[local43] = this.aShortArray141[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIII)V")
	protected final void method7972() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		@Pc(20) int[] local20 = new int[16];
		for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
			local14[local22] = (local22 << 12) / 128;
		}
		for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
			local17[local38] = (local38 << 12) / 128;
		}
		for (@Pc(54) int local54 = 0; local54 < 16; local54++) {
			local20[local54] = (local54 << 12) / 16;
		}
		this.method7977();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt9588; local89++) {
						@Pc(98) int local98 = this.aShortArray140[local89] << 12;
						@Pc(106) int local106 = local98 * local14[local85] >> 12;
						@Pc(114) int local114 = local98 * local17[local81] >> 12;
						@Pc(121) int local121 = local98 * this.anInt9595 >> 12;
						@Pc(128) int local128 = this.anInt9593 * local98 >> 12;
						@Pc(135) int local135 = local98 * this.anInt9589 >> 12;
						@Pc(143) int local143 = local98 * local20[local77] >> 12;
						@Pc(148) int local148 = local114 * this.anInt9595;
						@Pc(153) int local153 = local143 * this.anInt9593;
						@Pc(158) int local158 = local106 * this.anInt9589;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local148 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local174 & 0xFF;
						@Pc(186) int local186 = local153 >> 12;
						@Pc(190) int local190 = local186 + 1;
						if (local166 < local135) {
							local166 &= 0xFF;
						} else {
							local166 = 0;
						}
						local106 = local158 & 0xFFF;
						if (local178 >= local121) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						local186 &= 0xFF;
						if (local128 > local190) {
							local190 &= 0xFF;
						} else {
							local190 = 0;
						}
						local114 = local148 & 0xFFF;
						local143 = local153 & 0xFFF;
						@Pc(251) int local251 = Class2_Sub13_Sub1.anIntArray451[local114];
						@Pc(255) int local255 = local114 - 4096;
						@Pc(259) int local259 = local143 - 4096;
						@Pc(263) int local263 = Class2_Sub13_Sub1.anIntArray451[local106];
						@Pc(267) int local267 = local106 - 4096;
						@Pc(272) short local272 = this.aShortArray141[local186];
						@Pc(276) int local276 = Class2_Sub13_Sub1.anIntArray451[local143];
						@Pc(281) short local281 = this.aShortArray141[local190];
						@Pc(288) short local288 = this.aShortArray141[local272 + local182];
						@Pc(296) short local296 = this.aShortArray141[local182 + local281];
						@Pc(303) short local303 = this.aShortArray141[local272 + local178];
						@Pc(310) short local310 = this.aShortArray141[local178 + local281];
						@Pc(323) int local323 = Static336.method5148(this.aShortArray141[local170 + local288], local114, local143, local106);
						@Pc(335) int local335 = Static336.method5148(this.aShortArray141[local288 + local166], local114, local143, local267);
						@Pc(345) int local345 = (local263 * (local335 - local323) >> 12) + local323;
						@Pc(358) int local358 = Static336.method5148(this.aShortArray141[local170 + local303], local255, local143, local106);
						@Pc(370) int local370 = Static336.method5148(this.aShortArray141[local303 + local166], local255, local143, local267);
						@Pc(381) int local381 = local358 + ((local370 - local358) * local263 >> 12);
						@Pc(392) int local392 = local345 + (local251 * (local381 - local345) >> 12);
						@Pc(404) int local404 = Static336.method5148(this.aShortArray141[local170 + local296], local114, local259, local106);
						@Pc(417) int local417 = Static336.method5148(this.aShortArray141[local166 + local296], local114, local259, local267);
						@Pc(429) int local429 = local404 + ((local417 - local404) * local263 >> 12);
						@Pc(441) int local441 = Static336.method5148(this.aShortArray141[local170 + local310], local255, local259, local106);
						@Pc(454) int local454 = Static336.method5148(this.aShortArray141[local166 + local310], local255, local259, local267);
						@Pc(466) int local466 = local441 + (local263 * (local454 - local441) >> 12);
						@Pc(477) int local477 = local429 + ((local466 - local429) * local251 >> 12);
						this.method7979(local89, local392 + ((local477 - local392) * local276 >> 12));
					}
					this.method7976();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
	private void method7973() {
		this.aShortArray140 = new short[this.anInt9588];
		for (@Pc(20) int local20 = 0; local20 < this.anInt9588; local20++) {
			this.aShortArray140[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	protected abstract void method7976();

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
	protected abstract void method7977();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	protected abstract void method7979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
