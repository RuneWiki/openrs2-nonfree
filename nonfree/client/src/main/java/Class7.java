import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public abstract class Class7 {

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	private int anInt3368 = 4;

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	private int anInt3371 = 4;

	@OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
	private int anInt3373 = 4;

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	protected int anInt3376 = 4;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "[S")
	private final short[] aShortArray56 = new short[512];

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	private int anInt3369 = 0;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(IIIII)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3368 = arg4;
		this.anInt3369 = arg0;
		this.anInt3371 = arg3;
		this.anInt3376 = arg1;
		this.anInt3373 = arg2;
		this.method2922();
		this.method2925();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)V")
	protected abstract void method2920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	protected abstract void method2921();

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	private void method2922() {
		this.aShortArray55 = new short[this.anInt3376];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3376; local16++) {
			this.aShortArray55[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)V")
	protected final void method2924() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
			local11[local44] = (local44 << 12) / 128;
		}
		for (@Pc(64) int local64 = 0; local64 < 16; local64++) {
			local34[local64] = (local64 << 12) / 16;
		}
		this.method2926();
		for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
					for (@Pc(99) int local99 = 0; local99 < this.anInt3376; local99++) {
						@Pc(108) int local108 = this.aShortArray55[local99] << 12;
						@Pc(115) int local115 = this.anInt3373 * local108 >> 12;
						@Pc(123) int local123 = local34[local87] * local108 >> 12;
						@Pc(130) int local130 = local108 * this.anInt3368 >> 12;
						@Pc(137) int local137 = local108 * this.anInt3371 >> 12;
						@Pc(145) int local145 = local11[local91] * local108 >> 12;
						@Pc(153) int local153 = local8[local95] * local108 >> 12;
						@Pc(158) int local158 = local145 * this.anInt3371;
						@Pc(163) int local163 = local153 * this.anInt3373;
						@Pc(168) int local168 = local123 * this.anInt3368;
						@Pc(172) int local172 = local163 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local158 >> 12;
						@Pc(184) int local184 = local172 & 0xFF;
						@Pc(188) int local188 = local180 + 1;
						@Pc(192) int local192 = local180 & 0xFF;
						@Pc(196) int local196 = local168 >> 12;
						@Pc(200) int local200 = local196 + 1;
						if (local130 > local200) {
							local200 &= 0xFF;
						} else {
							local200 = 0;
						}
						local123 = local168 & 0xFFF;
						local153 = local163 & 0xFFF;
						local196 &= 0xFF;
						local145 = local158 & 0xFFF;
						if (local188 >= local137) {
							local188 = 0;
						} else {
							local188 &= 0xFF;
						}
						if (local176 < local115) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						@Pc(265) int local265 = Class4_Sub12.anIntArray497[local145];
						@Pc(269) int local269 = Class4_Sub12.anIntArray497[local153];
						@Pc(273) int local273 = local123 - 4096;
						@Pc(277) int local277 = Class4_Sub12.anIntArray497[local123];
						@Pc(281) int local281 = local153 - 4096;
						@Pc(285) int local285 = local145 - 4096;
						@Pc(290) short local290 = this.aShortArray56[local200];
						@Pc(295) short local295 = this.aShortArray56[local196];
						@Pc(303) short local303 = this.aShortArray56[local188 + local290];
						@Pc(310) short local310 = this.aShortArray56[local295 + local192];
						@Pc(317) short local317 = this.aShortArray56[local295 + local188];
						@Pc(324) short local324 = this.aShortArray56[local290 + local192];
						@Pc(336) int local336 = Static230.method3940(local123, this.aShortArray56[local310 + local184], local145, local153);
						@Pc(348) int local348 = Static230.method3940(local123, this.aShortArray56[local310 + local176], local145, local281);
						@Pc(358) int local358 = local336 + ((local348 - local336) * local269 >> 12);
						@Pc(371) int local371 = Static230.method3940(local123, this.aShortArray56[local184 + local317], local285, local153);
						@Pc(383) int local383 = Static230.method3940(local123, this.aShortArray56[local317 + local176], local285, local281);
						@Pc(394) int local394 = ((local383 - local371) * local269 >> 12) + local371;
						@Pc(406) int local406 = Static230.method3940(local273, this.aShortArray56[local184 + local324], local145, local153);
						@Pc(417) int local417 = ((local394 - local358) * local265 >> 12) + local358;
						@Pc(429) int local429 = Static230.method3940(local273, this.aShortArray56[local324 + local176], local145, local281);
						@Pc(440) int local440 = ((local429 - local406) * local269 >> 12) + local406;
						@Pc(452) int local452 = Static230.method3940(local273, this.aShortArray56[local303 + local184], local285, local153);
						@Pc(464) int local464 = Static230.method3940(local273, this.aShortArray56[local303 + local176], local285, local281);
						@Pc(475) int local475 = ((local464 - local452) * local269 >> 12) + local452;
						@Pc(486) int local486 = ((local475 - local440) * local265 >> 12) + local440;
						this.method2920(local99, ((local486 - local417) * local277 >> 12) + local417);
					}
					this.method2921();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	private void method2925() {
		@Pc(18) Random local18 = new Random((long) this.anInt3369);
		for (@Pc(20) int local20 = 0; local20 < 255; local20++) {
			this.aShortArray56[local20] = (short) local20;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static130.method2621(local18, local43);
			@Pc(53) short local53 = this.aShortArray56[local48];
			this.aShortArray56[local48] = this.aShortArray56[local43];
			this.aShortArray56[local43] = this.aShortArray56[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	protected abstract void method2926();
}
