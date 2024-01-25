import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class6 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[S")
	private final short[] aShortArray110 = new short[512];

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	private int anInt8208 = 4;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	protected int anInt8207 = 4;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	private int anInt8203 = 0;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	private int anInt8205 = 4;

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	private int anInt8201 = 4;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIII)V")
	protected Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8203 = arg0;
		this.anInt8201 = arg3;
		this.anInt8207 = arg1;
		this.anInt8208 = arg4;
		this.anInt8205 = arg2;
		this.method6634();
		this.method6631();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	private void method6631() {
		@Pc(17) Random local17 = new Random((long) this.anInt8203);
		for (@Pc(19) int local19 = 0; local19 < 255; local19++) {
			this.aShortArray110[local19] = (short) local19;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(42) int local42 = 255 - local35;
			@Pc(47) int local47 = Static46.method765(local42, local17);
			@Pc(52) short local52 = this.aShortArray110[local47];
			this.aShortArray110[local47] = this.aShortArray110[local42];
			this.aShortArray110[local42] = this.aShortArray110[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	protected abstract void method6632();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
	private void method6634() {
		this.aShortArray111 = new short[this.anInt8207];
		for (@Pc(18) int local18 = 0; local18 < this.anInt8207; local18++) {
			this.aShortArray111[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBII)V")
	protected final void method6635() {
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
		this.method6632();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt8207; local91++) {
						@Pc(100) int local100 = this.aShortArray111[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt8201 >> 12;
						@Pc(115) int local115 = local20[local79] * local100 >> 12;
						@Pc(123) int local123 = local100 * local14[local87] >> 12;
						@Pc(131) int local131 = local100 * local17[local83] >> 12;
						@Pc(138) int local138 = local100 * this.anInt8205 >> 12;
						@Pc(145) int local145 = this.anInt8208 * local100 >> 12;
						@Pc(150) int local150 = local123 * this.anInt8205;
						@Pc(155) int local155 = local131 * this.anInt8201;
						@Pc(160) int local160 = local115 * this.anInt8208;
						@Pc(164) int local164 = local150 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local155 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local160 >> 12;
						@Pc(188) int local188 = local172 & 0xFF;
						@Pc(192) int local192 = local184 + 1;
						if (local180 >= local107) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						local131 = local155 & 0xFFF;
						local123 = local150 & 0xFFF;
						local184 &= 0xFF;
						if (local168 >= local138) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						if (local192 < local145) {
							local192 &= 0xFF;
						} else {
							local192 = 0;
						}
						local115 = local160 & 0xFFF;
						@Pc(253) int local253 = Class1_Sub30.anIntArray363[local115];
						@Pc(258) short local258 = this.aShortArray110[local184];
						@Pc(262) int local262 = local131 - 4096;
						@Pc(266) int local266 = local115 - 4096;
						@Pc(270) int local270 = Class1_Sub30.anIntArray363[local131];
						@Pc(274) int local274 = local123 - 4096;
						@Pc(279) short local279 = this.aShortArray110[local192];
						@Pc(283) int local283 = Class1_Sub30.anIntArray363[local123];
						@Pc(290) short local290 = this.aShortArray110[local279 + local188];
						@Pc(297) short local297 = this.aShortArray110[local188 + local258];
						@Pc(304) short local304 = this.aShortArray110[local180 + local279];
						@Pc(311) short local311 = this.aShortArray110[local180 + local258];
						@Pc(323) int local323 = Static269.method3929(local123, this.aShortArray110[local176 + local297], local115, local131);
						@Pc(335) int local335 = Static269.method3929(local274, this.aShortArray110[local297 + local168], local115, local131);
						@Pc(345) int local345 = ((local335 - local323) * local283 >> 12) + local323;
						@Pc(357) int local357 = Static269.method3929(local123, this.aShortArray110[local176 + local311], local115, local262);
						@Pc(370) int local370 = Static269.method3929(local274, this.aShortArray110[local168 + local311], local115, local262);
						@Pc(382) int local382 = local357 + ((local370 - local357) * local283 >> 12);
						@Pc(392) int local392 = local345 + (local270 * (local382 - local345) >> 12);
						@Pc(404) int local404 = Static269.method3929(local123, this.aShortArray110[local290 + local176], local266, local131);
						@Pc(416) int local416 = Static269.method3929(local274, this.aShortArray110[local168 + local290], local266, local131);
						@Pc(426) int local426 = ((local416 - local404) * local283 >> 12) + local404;
						@Pc(438) int local438 = Static269.method3929(local123, this.aShortArray110[local304 + local176], local266, local262);
						@Pc(450) int local450 = Static269.method3929(local274, this.aShortArray110[local304 + local168], local266, local262);
						@Pc(460) int local460 = ((local450 - local438) * local283 >> 12) + local438;
						@Pc(472) int local472 = local426 + ((local460 - local426) * local270 >> 12);
						this.method6636(((local472 - local392) * local253 >> 12) + local392, local91);
					}
					this.method6637();
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)V")
	protected abstract void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	protected abstract void method6637();
}
