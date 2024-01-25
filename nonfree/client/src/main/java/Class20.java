import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public abstract class Class20 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	private int anInt6550 = 0;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	private int anInt6555 = 4;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	private int anInt6553 = 4;

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "[S")
	private final short[] aShortArray114 = new short[512];

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
	protected int anInt6549 = 4;

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
	private int anInt6557 = 4;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIII)V")
	protected Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6555 = arg4;
		this.anInt6549 = arg1;
		this.anInt6550 = arg0;
		this.anInt6557 = arg2;
		this.anInt6553 = arg3;
		this.method5503();
		this.method5506();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	protected abstract void method5498();

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	protected abstract void method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	protected abstract void method5502();

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V")
	private void method5503() {
		this.aShortArray113 = new short[this.anInt6549];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6549; local12++) {
			this.aShortArray113[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V")
	protected final void method5504() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local8[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local11[local40] = (local40 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local38[local60] = (local60 << 12) / 16;
		}
		this.method5502();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt6549; local91++) {
						@Pc(100) int local100 = this.aShortArray113[local91] << 12;
						@Pc(107) int local107 = this.anInt6557 * local100 >> 12;
						@Pc(115) int local115 = local38[local79] * local100 >> 12;
						@Pc(122) int local122 = this.anInt6553 * local100 >> 12;
						@Pc(130) int local130 = local8[local87] * local100 >> 12;
						@Pc(137) int local137 = local100 * this.anInt6555 >> 12;
						@Pc(145) int local145 = local100 * local11[local83] >> 12;
						@Pc(150) int local150 = local130 * this.anInt6557;
						@Pc(155) int local155 = local145 * this.anInt6553;
						@Pc(160) int local160 = local115 * this.anInt6555;
						@Pc(164) int local164 = local150 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local155 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local160 >> 12;
						@Pc(192) int local192 = local188 + 1;
						if (local122 > local180) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						if (local168 >= local107) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						local130 = local150 & 0xFFF;
						local188 &= 0xFF;
						if (local192 >= local137) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local145 = local155 & 0xFFF;
						local115 = local160 & 0xFFF;
						@Pc(253) int local253 = local145 - 4096;
						@Pc(257) int local257 = Class92.anIntArray263[local130];
						@Pc(262) short local262 = this.aShortArray114[local188];
						@Pc(266) int local266 = Class92.anIntArray263[local145];
						@Pc(271) short local271 = this.aShortArray114[local192];
						@Pc(275) int local275 = local130 - 4096;
						@Pc(279) int local279 = local115 - 4096;
						@Pc(283) int local283 = Class92.anIntArray263[local115];
						@Pc(290) short local290 = this.aShortArray114[local184 + local271];
						@Pc(297) short local297 = this.aShortArray114[local271 + local180];
						@Pc(304) short local304 = this.aShortArray114[local262 + local180];
						@Pc(312) short local312 = this.aShortArray114[local184 + local262];
						@Pc(324) int local324 = Static52.method1033(local115, this.aShortArray114[local312 + local176], local145, local130);
						@Pc(336) int local336 = Static52.method1033(local115, this.aShortArray114[local168 + local312], local145, local275);
						@Pc(347) int local347 = local324 + (local257 * (local336 - local324) >> 12);
						@Pc(359) int local359 = Static52.method1033(local115, this.aShortArray114[local176 + local304], local253, local130);
						@Pc(371) int local371 = Static52.method1033(local115, this.aShortArray114[local304 + local168], local253, local275);
						@Pc(383) int local383 = local359 + ((local371 - local359) * local257 >> 12);
						@Pc(394) int local394 = (local266 * (local383 - local347) >> 12) + local347;
						@Pc(406) int local406 = Static52.method1033(local279, this.aShortArray114[local290 + local176], local145, local130);
						@Pc(418) int local418 = Static52.method1033(local279, this.aShortArray114[local168 + local290], local145, local275);
						@Pc(429) int local429 = ((local418 - local406) * local257 >> 12) + local406;
						@Pc(441) int local441 = Static52.method1033(local279, this.aShortArray114[local297 + local176], local253, local130);
						@Pc(453) int local453 = Static52.method1033(local279, this.aShortArray114[local297 + local168], local253, local275);
						@Pc(464) int local464 = local441 + ((local453 - local441) * local257 >> 12);
						@Pc(474) int local474 = ((local464 - local429) * local266 >> 12) + local429;
						this.method5499(local394 + (local283 * (local474 - local394) >> 12), local91);
					}
					this.method5498();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V")
	private void method5506() {
		@Pc(12) Random local12 = new Random((long) this.anInt6550);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray114[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(42) int local42 = Static355.method5668(local12, local35);
			@Pc(47) short local47 = this.aShortArray114[local42];
			this.aShortArray114[local42] = this.aShortArray114[local35];
			this.aShortArray114[local35] = this.aShortArray114[local35 + 256] = local47;
		}
	}
}
