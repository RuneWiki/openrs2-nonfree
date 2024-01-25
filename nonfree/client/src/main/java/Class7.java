import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public abstract class Class7 {

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	private int anInt5890 = 0;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	private int anInt5892 = 4;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
	protected int anInt5891 = 4;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
	private int anInt5894 = 4;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	private int anInt5896 = 4;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "[S")
	private final short[] aShortArray86 = new short[512];

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIII)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5890 = arg0;
		this.anInt5896 = arg3;
		this.anInt5892 = arg4;
		this.anInt5894 = arg2;
		this.anInt5891 = arg1;
		this.method4957();
		this.method4952();
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	protected abstract void method4951();

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	private void method4952() {
		@Pc(12) Random local12 = new Random((long) this.anInt5890);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray86[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static235.method3704(local37, local12);
			@Pc(47) short local47 = this.aShortArray86[local42];
			this.aShortArray86[local42] = this.aShortArray86[local37];
			this.aShortArray86[local37] = this.aShortArray86[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	protected abstract void method4953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
	protected abstract void method4955();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIII)V")
	protected final void method4956() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		@Pc(22) int[] local22 = new int[16];
		for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
			local8[local24] = (local24 << 12) / 128;
		}
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local19[local40] = (local40 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local22[local60] = (local60 << 12) / 16;
		}
		this.method4951();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt5891; local91++) {
						@Pc(100) int local100 = this.aShortArray87[local91] << 12;
						@Pc(107) int local107 = this.anInt5894 * local100 >> 12;
						@Pc(115) int local115 = local19[local83] * local100 >> 12;
						@Pc(123) int local123 = local8[local87] * local100 >> 12;
						@Pc(130) int local130 = this.anInt5892 * local100 >> 12;
						@Pc(137) int local137 = local100 * this.anInt5896 >> 12;
						@Pc(145) int local145 = local22[local79] * local100 >> 12;
						@Pc(150) int local150 = local123 * this.anInt5894;
						@Pc(155) int local155 = local145 * this.anInt5892;
						@Pc(160) int local160 = local115 * this.anInt5896;
						@Pc(164) int local164 = local150 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local160 >> 12;
						@Pc(176) int local176 = local164 & 0xFF;
						@Pc(180) int local180 = local172 + 1;
						@Pc(184) int local184 = local155 >> 12;
						@Pc(188) int local188 = local172 & 0xFF;
						@Pc(192) int local192 = local184 + 1;
						@Pc(196) int local196 = local184 & 0xFF;
						if (local130 <= local192) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local123 = local150 & 0xFFF;
						if (local137 > local180) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						local115 = local160 & 0xFFF;
						local145 = local155 & 0xFFF;
						if (local107 > local168) {
							local168 &= 0xFF;
						} else {
							local168 = 0;
						}
						@Pc(257) int local257 = Class6_Sub2_Sub8.anIntArray113[local123];
						@Pc(261) int local261 = local123 - 4096;
						@Pc(265) int local265 = local115 - 4096;
						@Pc(269) int local269 = Class6_Sub2_Sub8.anIntArray113[local145];
						@Pc(273) int local273 = local145 - 4096;
						@Pc(277) int local277 = Class6_Sub2_Sub8.anIntArray113[local115];
						@Pc(282) short local282 = this.aShortArray86[local192];
						@Pc(287) short local287 = this.aShortArray86[local196];
						@Pc(294) short local294 = this.aShortArray86[local180 + local282];
						@Pc(301) short local301 = this.aShortArray86[local287 + local188];
						@Pc(308) short local308 = this.aShortArray86[local287 + local180];
						@Pc(315) short local315 = this.aShortArray86[local282 + local188];
						@Pc(327) int local327 = Static125.method2034(this.aShortArray86[local176 + local301], local123, local115, local145);
						@Pc(339) int local339 = Static125.method2034(this.aShortArray86[local301 + local168], local261, local115, local145);
						@Pc(350) int local350 = (local257 * (local339 - local327) >> 12) + local327;
						@Pc(362) int local362 = Static125.method2034(this.aShortArray86[local308 + local176], local123, local265, local145);
						@Pc(374) int local374 = Static125.method2034(this.aShortArray86[local308 + local168], local261, local265, local145);
						@Pc(385) int local385 = local362 + (local257 * (local374 - local362) >> 12);
						@Pc(396) int local396 = local350 + ((local385 - local350) * local277 >> 12);
						@Pc(408) int local408 = Static125.method2034(this.aShortArray86[local315 + local176], local123, local115, local273);
						@Pc(420) int local420 = Static125.method2034(this.aShortArray86[local315 + local168], local261, local115, local273);
						@Pc(430) int local430 = local408 + ((local420 - local408) * local257 >> 12);
						@Pc(442) int local442 = Static125.method2034(this.aShortArray86[local294 + local176], local123, local265, local273);
						@Pc(454) int local454 = Static125.method2034(this.aShortArray86[local168 + local294], local261, local265, local273);
						@Pc(466) int local466 = local442 + ((local454 - local442) * local257 >> 12);
						@Pc(477) int local477 = local430 + (local277 * (local466 - local430) >> 12);
						this.method4953(((local477 - local396) * local269 >> 12) + local396, local91);
					}
					this.method4955();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
	private void method4957() {
		this.aShortArray87 = new short[this.anInt5891];
		for (@Pc(18) int local18 = 0; local18 < this.anInt5891; local18++) {
			this.aShortArray87[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}
}
