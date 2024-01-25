import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public abstract class Class58 {

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	private int anInt4446 = 4;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	protected int anInt4451 = 4;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[S")
	private final short[] aShortArray98 = new short[512];

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	private int anInt4449 = 4;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	private int anInt4448 = 0;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	private int anInt4453 = 4;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIII)V")
	protected Class58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4451 = arg1;
		this.anInt4453 = arg3;
		this.anInt4448 = arg0;
		this.anInt4446 = arg2;
		this.anInt4449 = arg4;
		this.method3997();
		this.method3999();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BII)V")
	protected abstract void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
	private void method3997() {
		this.aShortArray99 = new short[this.anInt4451];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4451; local18++) {
			this.aShortArray99[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)V")
	protected final void method3998() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local11[local40] = (local40 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local34[local60] = (local60 << 12) / 16;
		}
		this.method4002();
		for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
					for (@Pc(95) int local95 = 0; local95 < this.anInt4451; local95++) {
						@Pc(104) int local104 = this.aShortArray99[local95] << 12;
						@Pc(111) int local111 = local104 * this.anInt4446 >> 12;
						@Pc(118) int local118 = this.anInt4453 * local104 >> 12;
						@Pc(126) int local126 = local104 * local34[local83] >> 12;
						@Pc(133) int local133 = local104 * this.anInt4449 >> 12;
						@Pc(141) int local141 = local104 * local8[local91] >> 12;
						@Pc(149) int local149 = local104 * local11[local87] >> 12;
						@Pc(154) int local154 = local141 * this.anInt4446;
						@Pc(159) int local159 = local149 * this.anInt4453;
						@Pc(164) int local164 = local126 * this.anInt4449;
						@Pc(168) int local168 = local154 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local159 >> 12;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						@Pc(188) int local188 = local164 >> 12;
						@Pc(192) int local192 = local176 & 0xFF;
						@Pc(196) int local196 = local188 + 1;
						if (local172 >= local111) {
							local172 = 0;
						} else {
							local172 &= 0xFF;
						}
						local149 = local159 & 0xFFF;
						local126 = local164 & 0xFFF;
						if (local184 >= local118) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						if (local196 < local133) {
							local196 &= 0xFF;
						} else {
							local196 = 0;
						}
						local141 = local154 & 0xFFF;
						local188 &= 0xFF;
						@Pc(257) int local257 = local126 - 4096;
						@Pc(262) short local262 = this.aShortArray98[local188];
						@Pc(266) int local266 = local149 - 4096;
						@Pc(270) int local270 = local141 - 4096;
						@Pc(274) int local274 = Class17_Sub1_Sub1.anIntArray433[local141];
						@Pc(278) int local278 = Class17_Sub1_Sub1.anIntArray433[local126];
						@Pc(283) short local283 = this.aShortArray98[local196];
						@Pc(287) int local287 = Class17_Sub1_Sub1.anIntArray433[local149];
						@Pc(294) short local294 = this.aShortArray98[local262 + local184];
						@Pc(301) short local301 = this.aShortArray98[local283 + local184];
						@Pc(309) short local309 = this.aShortArray98[local192 + local262];
						@Pc(317) short local317 = this.aShortArray98[local192 + local283];
						@Pc(329) int local329 = Static180.method3551(this.aShortArray98[local309 + local180], local126, local149, local141);
						@Pc(342) int local342 = Static180.method3551(this.aShortArray98[local172 + local309], local126, local149, local270);
						@Pc(353) int local353 = (local274 * (local342 - local329) >> 12) + local329;
						@Pc(365) int local365 = Static180.method3551(this.aShortArray98[local294 + local180], local126, local266, local141);
						@Pc(377) int local377 = Static180.method3551(this.aShortArray98[local294 + local172], local126, local266, local270);
						@Pc(387) int local387 = local365 + (local274 * (local377 - local365) >> 12);
						@Pc(398) int local398 = ((local387 - local353) * local287 >> 12) + local353;
						@Pc(410) int local410 = Static180.method3551(this.aShortArray98[local317 + local180], local257, local149, local141);
						@Pc(423) int local423 = Static180.method3551(this.aShortArray98[local172 + local317], local257, local149, local270);
						@Pc(434) int local434 = (local274 * (local423 - local410) >> 12) + local410;
						@Pc(446) int local446 = Static180.method3551(this.aShortArray98[local180 + local301], local257, local266, local141);
						@Pc(458) int local458 = Static180.method3551(this.aShortArray98[local301 + local172], local257, local266, local270);
						@Pc(468) int local468 = (local274 * (local458 - local446) >> 12) + local446;
						@Pc(479) int local479 = ((local468 - local434) * local287 >> 12) + local434;
						this.method3995(((local479 - local398) * local278 >> 12) + local398, local95);
					}
					this.method4000();
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	private void method3999() {
		@Pc(12) Random local12 = new Random((long) this.anInt4448);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray98[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(35) int local35 = 255 - local28;
			@Pc(40) int local40 = Static295.method4970(local12, local35);
			@Pc(45) short local45 = this.aShortArray98[local40];
			this.aShortArray98[local40] = this.aShortArray98[local35];
			this.aShortArray98[local35] = this.aShortArray98[local35 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
	protected abstract void method4000();

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)V")
	protected abstract void method4002();
}
