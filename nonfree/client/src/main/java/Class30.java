import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public abstract class Class30 {

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	private int anInt4336 = 4;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	private int anInt4330 = 4;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	private int anInt4337 = 4;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	protected int anInt4338 = 4;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	private int anInt4340 = 0;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[S")
	private final short[] aShortArray67 = new short[512];

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIII)V")
	protected Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4340 = arg0;
		this.anInt4330 = arg3;
		this.anInt4338 = arg1;
		this.anInt4337 = arg2;
		this.anInt4336 = arg4;
		this.method4017();
		this.method4015();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	private void method4015() {
		@Pc(12) Random local12 = new Random((long) this.anInt4340);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray67[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static263.method4610(local12, local43);
			@Pc(53) short local53 = this.aShortArray67[local48];
			this.aShortArray67[local48] = this.aShortArray67[local43];
			this.aShortArray67[local43] = this.aShortArray67[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	private void method4017() {
		this.aShortArray66 = new short[this.anInt4338];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4338; local12++) {
			this.aShortArray66[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	protected abstract void method4019();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BII)V")
	protected abstract void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	protected abstract void method4021();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
	protected final void method4022() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local15[local36] = (local36 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local34[local56] = (local56 << 12) / 16;
		}
		this.method4019();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt4338; local91++) {
						@Pc(100) int local100 = this.aShortArray66[local91] << 12;
						@Pc(108) int local108 = local100 * local12[local87] >> 12;
						@Pc(116) int local116 = local34[local79] * local100 >> 12;
						@Pc(123) int local123 = this.anInt4330 * local100 >> 12;
						@Pc(131) int local131 = local100 * local15[local83] >> 12;
						@Pc(138) int local138 = this.anInt4336 * local100 >> 12;
						@Pc(145) int local145 = local100 * this.anInt4337 >> 12;
						@Pc(150) int local150 = local131 * this.anInt4330;
						@Pc(155) int local155 = local116 * this.anInt4336;
						@Pc(160) int local160 = local108 * this.anInt4337;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local150 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local155 >> 12;
						@Pc(188) int local188 = local176 & 0xFF;
						@Pc(192) int local192 = local184 + 1;
						@Pc(196) int local196 = local160 & 0xFFF;
						@Pc(200) int local200 = local150 & 0xFFF;
						if (local145 <= local168) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						local184 &= 0xFF;
						if (local180 >= local123) {
							local180 = 0;
						} else {
							local180 &= 0xFF;
						}
						local116 = local155 & 0xFFF;
						if (local138 <= local192) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						@Pc(257) int local257 = Class1_Sub2_Sub24.anIntArray462[local196];
						@Pc(262) short local262 = this.aShortArray67[local184];
						@Pc(266) int local266 = Class1_Sub2_Sub24.anIntArray462[local116];
						@Pc(271) short local271 = this.aShortArray67[local192];
						@Pc(275) int local275 = Class1_Sub2_Sub24.anIntArray462[local200];
						@Pc(279) int local279 = local200 - 4096;
						@Pc(283) int local283 = local116 - 4096;
						@Pc(287) int local287 = local196 - 4096;
						@Pc(295) short local295 = this.aShortArray67[local180 + local271];
						@Pc(302) short local302 = this.aShortArray67[local271 + local188];
						@Pc(309) short local309 = this.aShortArray67[local262 + local180];
						@Pc(316) short local316 = this.aShortArray67[local262 + local188];
						@Pc(330) int local330 = Static307.method5168(this.aShortArray67[local172 + local316], local196, local116, local200);
						@Pc(342) int local342 = Static307.method5168(this.aShortArray67[local316 + local168], local287, local116, local200);
						@Pc(353) int local353 = (local257 * (local342 - local330) >> 12) + local330;
						@Pc(366) int local366 = Static307.method5168(this.aShortArray67[local172 + local309], local196, local116, local279);
						@Pc(378) int local378 = Static307.method5168(this.aShortArray67[local168 + local309], local287, local116, local279);
						@Pc(389) int local389 = ((local378 - local366) * local257 >> 12) + local366;
						@Pc(401) int local401 = local353 + ((local389 - local353) * local275 >> 12);
						@Pc(415) int local415 = Static307.method5168(this.aShortArray67[local172 + local302], local196, local283, local200);
						@Pc(430) int local430 = Static307.method5168(this.aShortArray67[local168 + local302], local287, local283, local200);
						@Pc(441) int local441 = ((local430 - local415) * local257 >> 12) + local415;
						@Pc(453) int local453 = Static307.method5168(this.aShortArray67[local172 + local295], local196, local283, local279);
						@Pc(465) int local465 = Static307.method5168(this.aShortArray67[local295 + local168], local287, local283, local279);
						@Pc(477) int local477 = local453 + (local257 * (local465 - local453) >> 12);
						@Pc(487) int local487 = ((local477 - local441) * local275 >> 12) + local441;
						this.method4020(local91, local401 + ((local487 - local401) * local266 >> 12));
					}
					this.method4021();
				}
			}
		}
	}
}
