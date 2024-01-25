import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public abstract class Class113 {

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
	private int anInt5663 = 4;

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
	private int anInt5662 = 4;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
	private int anInt5657 = 4;

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
	private int anInt5660 = 0;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	protected int anInt5661 = 4;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "[S")
	private final short[] aShortArray91 = new short[512];

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIII)V")
	protected Class113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5660 = arg0;
		this.anInt5663 = arg3;
		this.anInt5661 = arg1;
		this.anInt5657 = arg4;
		this.anInt5662 = arg2;
		this.method4565();
		this.method4571();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	private void method4565() {
		this.aShortArray92 = new short[this.anInt5661];
		for (@Pc(18) int local18 = 0; local18 < this.anInt5661; local18++) {
			this.aShortArray92[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
	protected abstract void method4566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIB)V")
	protected final void method4567() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local16[local24] = (local24 << 12) / 128;
		}
		for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
			local19[local44] = (local44 << 12) / 128;
		}
		for (@Pc(64) int local64 = 0; local64 < 16; local64++) {
			local22[local64] = (local64 << 12) / 16;
		}
		this.method4569();
		for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
					for (@Pc(95) int local95 = 0; local95 < this.anInt5661; local95++) {
						@Pc(104) int local104 = this.aShortArray92[local95] << 12;
						@Pc(111) int local111 = this.anInt5663 * local104 >> 12;
						@Pc(119) int local119 = local104 * local22[local83] >> 12;
						@Pc(127) int local127 = local104 * local16[local91] >> 12;
						@Pc(134) int local134 = this.anInt5657 * local104 >> 12;
						@Pc(142) int local142 = local19[local87] * local104 >> 12;
						@Pc(149) int local149 = local104 * this.anInt5662 >> 12;
						@Pc(154) int local154 = local119 * this.anInt5657;
						@Pc(159) int local159 = local127 * this.anInt5662;
						@Pc(164) int local164 = local142 * this.anInt5663;
						@Pc(168) int local168 = local159 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local168 & 0xFF;
						@Pc(180) int local180 = local164 >> 12;
						@Pc(184) int local184 = local180 + 1;
						@Pc(188) int local188 = local154 >> 12;
						@Pc(192) int local192 = local180 & 0xFF;
						@Pc(196) int local196 = local188 + 1;
						@Pc(200) int local200 = local164 & 0xFFF;
						@Pc(204) int local204 = local188 & 0xFF;
						if (local111 <= local184) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						local119 = local154 & 0xFFF;
						local127 = local159 & 0xFFF;
						if (local172 < local149) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						if (local196 < local134) {
							local196 &= 0xFF;
						} else {
							local196 = 0;
						}
						@Pc(257) int local257 = Class217.anIntArray415[local200];
						@Pc(261) int local261 = local119 - 4096;
						@Pc(266) short local266 = this.aShortArray91[local196];
						@Pc(270) int local270 = Class217.anIntArray415[local119];
						@Pc(274) int local274 = Class217.anIntArray415[local127];
						@Pc(279) short local279 = this.aShortArray91[local204];
						@Pc(283) int local283 = local200 - 4096;
						@Pc(287) int local287 = local127 - 4096;
						@Pc(294) short local294 = this.aShortArray91[local279 + local192];
						@Pc(301) short local301 = this.aShortArray91[local266 + local184];
						@Pc(308) short local308 = this.aShortArray91[local184 + local279];
						@Pc(315) short local315 = this.aShortArray91[local192 + local266];
						@Pc(327) int local327 = Static463.method5976(local119, local127, local200, this.aShortArray91[local294 + local176]);
						@Pc(339) int local339 = Static463.method5976(local119, local287, local200, this.aShortArray91[local294 + local172]);
						@Pc(350) int local350 = ((local339 - local327) * local274 >> 12) + local327;
						@Pc(362) int local362 = Static463.method5976(local119, local127, local283, this.aShortArray91[local176 + local308]);
						@Pc(374) int local374 = Static463.method5976(local119, local287, local283, this.aShortArray91[local308 + local172]);
						@Pc(384) int local384 = ((local374 - local362) * local274 >> 12) + local362;
						@Pc(396) int local396 = Static463.method5976(local261, local127, local200, this.aShortArray91[local315 + local176]);
						@Pc(408) int local408 = local350 + (local257 * (local384 - local350) >> 12);
						@Pc(420) int local420 = Static463.method5976(local261, local287, local200, this.aShortArray91[local315 + local172]);
						@Pc(432) int local432 = local396 + (local274 * (local420 - local396) >> 12);
						@Pc(444) int local444 = Static463.method5976(local261, local127, local283, this.aShortArray91[local176 + local301]);
						@Pc(456) int local456 = Static463.method5976(local261, local287, local283, this.aShortArray91[local301 + local172]);
						@Pc(466) int local466 = local444 + ((local456 - local444) * local274 >> 12);
						@Pc(477) int local477 = ((local466 - local432) * local257 >> 12) + local432;
						this.method4566(((local477 - local408) * local270 >> 12) + local408, local95);
					}
					this.method4568();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	protected abstract void method4568();

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
	protected abstract void method4569();

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Z)V")
	private void method4571() {
		@Pc(12) Random local12 = new Random((long) this.anInt5660);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray91[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static133.method1697(local43, local12);
			@Pc(53) short local53 = this.aShortArray91[local48];
			this.aShortArray91[local48] = this.aShortArray91[local43];
			this.aShortArray91[local43] = this.aShortArray91[local43 + 256] = local53;
		}
	}
}
