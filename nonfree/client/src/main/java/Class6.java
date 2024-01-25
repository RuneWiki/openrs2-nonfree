import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public abstract class Class6 {

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "[S")
	private short[] aShortArray118;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	private int anInt7212 = 4;

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	private int anInt7218 = 0;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
	protected int anInt7216 = 4;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	private int anInt7219 = 4;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "[S")
	private final short[] aShortArray119 = new short[512];

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	private int anInt7220 = 4;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIII)V")
	protected Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt7220 = arg3;
		this.anInt7219 = arg4;
		this.anInt7218 = arg0;
		this.anInt7216 = arg1;
		this.anInt7212 = arg2;
		this.method6046();
		this.method6048();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	private void method6046() {
		this.aShortArray118 = new short[this.anInt7216];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7216; local12++) {
			this.aShortArray118[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIII)V")
	protected final void method6047() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local15[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local38[local56] = (local56 << 12) / 16;
		}
		this.method6049();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt7216; local91++) {
						@Pc(100) int local100 = this.aShortArray118[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt7212 >> 12;
						@Pc(114) int local114 = this.anInt7219 * local100 >> 12;
						@Pc(121) int local121 = this.anInt7220 * local100 >> 12;
						@Pc(129) int local129 = local100 * local12[local87] >> 12;
						@Pc(137) int local137 = local38[local79] * local100 >> 12;
						@Pc(145) int local145 = local100 * local15[local83] >> 12;
						@Pc(150) int local150 = local137 * this.anInt7219;
						@Pc(155) int local155 = local129 * this.anInt7212;
						@Pc(160) int local160 = local145 * this.anInt7220;
						@Pc(164) int local164 = local155 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local160 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local150 >> 12;
						@Pc(192) int local192 = local188 + 1;
						if (local107 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						local188 &= 0xFF;
						if (local180 < local121) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						local137 = local150 & 0xFFF;
						local129 = local155 & 0xFFF;
						if (local114 <= local192) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local145 = local160 & 0xFFF;
						@Pc(257) int local257 = local137 - 4096;
						@Pc(261) int local261 = Class42.anIntArray724[local145];
						@Pc(265) int local265 = Class42.anIntArray724[local129];
						@Pc(269) int local269 = local145 - 4096;
						@Pc(274) short local274 = this.aShortArray119[local188];
						@Pc(279) short local279 = this.aShortArray119[local192];
						@Pc(283) int local283 = local129 - 4096;
						@Pc(287) int local287 = Class42.anIntArray724[local137];
						@Pc(294) short local294 = this.aShortArray119[local279 + local180];
						@Pc(301) short local301 = this.aShortArray119[local274 + local180];
						@Pc(308) short local308 = this.aShortArray119[local184 + local279];
						@Pc(315) short local315 = this.aShortArray119[local184 + local274];
						@Pc(327) int local327 = Static47.method947(local129, local145, this.aShortArray119[local315 + local176], local137);
						@Pc(339) int local339 = Static47.method947(local283, local145, this.aShortArray119[local315 + local168], local137);
						@Pc(350) int local350 = local327 + ((local339 - local327) * local265 >> 12);
						@Pc(363) int local363 = Static47.method947(local129, local269, this.aShortArray119[local176 + local301], local137);
						@Pc(375) int local375 = Static47.method947(local283, local269, this.aShortArray119[local168 + local301], local137);
						@Pc(385) int local385 = ((local375 - local363) * local265 >> 12) + local363;
						@Pc(396) int local396 = local350 + ((local385 - local350) * local261 >> 12);
						@Pc(409) int local409 = Static47.method947(local129, local145, this.aShortArray119[local176 + local308], local257);
						@Pc(421) int local421 = Static47.method947(local283, local145, this.aShortArray119[local308 + local168], local257);
						@Pc(433) int local433 = local409 + (local265 * (local421 - local409) >> 12);
						@Pc(445) int local445 = Static47.method947(local129, local269, this.aShortArray119[local294 + local176], local257);
						@Pc(457) int local457 = Static47.method947(local283, local269, this.aShortArray119[local294 + local168], local257);
						@Pc(468) int local468 = (local265 * (local457 - local445) >> 12) + local445;
						@Pc(479) int local479 = local433 + (local261 * (local468 - local433) >> 12);
						this.method6052(local396 + (local287 * (local479 - local396) >> 12), local91);
					}
					this.method6051();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	private void method6048() {
		@Pc(12) Random local12 = new Random((long) this.anInt7218);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray119[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static220.method3801(local12, local37);
			@Pc(47) short local47 = this.aShortArray119[local42];
			this.aShortArray119[local42] = this.aShortArray119[local37];
			this.aShortArray119[local37] = this.aShortArray119[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
	protected abstract void method6049();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	protected abstract void method6051();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
	protected abstract void method6052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
