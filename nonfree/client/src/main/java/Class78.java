import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public abstract class Class78 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[S")
	private short[] aShortArray160;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	private int anInt9326 = 4;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "[S")
	private final short[] aShortArray159 = new short[512];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	protected int anInt9325 = 4;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	private int anInt9332 = 4;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	private int anInt9330 = 0;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	private int anInt9333 = 4;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIII)V")
	protected Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9326 = arg3;
		this.anInt9333 = arg4;
		this.anInt9332 = arg2;
		this.anInt9325 = arg1;
		this.anInt9330 = arg0;
		this.method7618();
		this.method7615();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	protected abstract void method7612();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
	protected abstract void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
	private void method7615() {
		@Pc(12) Random local12 = new Random((long) this.anInt9330);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray159[local14] = (short) local14;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(40) int local40 = 255 - local28;
			@Pc(45) int local45 = Static123.method2611(local40, local12);
			@Pc(50) short local50 = this.aShortArray159[local45];
			this.aShortArray159[local45] = this.aShortArray159[local40];
			this.aShortArray159[local40] = this.aShortArray159[local40 + 256] = local50;
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
	protected abstract void method7616();

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	private void method7618() {
		this.aShortArray160 = new short[this.anInt9325];
		for (@Pc(16) int local16 = 0; local16 < this.anInt9325; local16++) {
			this.aShortArray160[local16] = (short) (int) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BIII)V")
	protected final void method7619() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(34) int[] local34 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local11[local40] = (local40 << 12) / 128;
		}
		for (@Pc(56) int local56 = 0; local56 < 16; local56++) {
			local34[local56] = (local56 << 12) / 16;
		}
		this.method7612();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt9325; local91++) {
						@Pc(100) int local100 = this.aShortArray160[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt9332 >> 12;
						@Pc(114) int local114 = local100 * this.anInt9326 >> 12;
						@Pc(121) int local121 = this.anInt9333 * local100 >> 12;
						@Pc(129) int local129 = local100 * local34[local79] >> 12;
						@Pc(137) int local137 = local11[local83] * local100 >> 12;
						@Pc(145) int local145 = local8[local87] * local100 >> 12;
						@Pc(150) int local150 = local129 * this.anInt9333;
						@Pc(155) int local155 = local145 * this.anInt9332;
						@Pc(160) int local160 = local137 * this.anInt9326;
						@Pc(164) int local164 = local155 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local160 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local176 & 0xFF;
						@Pc(188) int local188 = local150 >> 12;
						@Pc(192) int local192 = local188 + 1;
						@Pc(196) int local196 = local188 & 0xFF;
						@Pc(200) int local200 = local155 & 0xFFF;
						if (local180 < local114) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						if (local121 <= local192) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local129 = local150 & 0xFFF;
						local137 = local160 & 0xFFF;
						if (local107 <= local168) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						@Pc(258) short local258 = this.aShortArray159[local192];
						@Pc(263) short local263 = this.aShortArray159[local196];
						@Pc(267) int local267 = Class16_Sub8.anIntArray550[local129];
						@Pc(271) int local271 = Class16_Sub8.anIntArray550[local137];
						@Pc(275) int local275 = local200 - 4096;
						@Pc(279) int local279 = local137 - 4096;
						@Pc(283) int local283 = local129 - 4096;
						@Pc(287) int local287 = Class16_Sub8.anIntArray550[local200];
						@Pc(294) short local294 = this.aShortArray159[local258 + local184];
						@Pc(301) short local301 = this.aShortArray159[local184 + local263];
						@Pc(308) short local308 = this.aShortArray159[local263 + local180];
						@Pc(315) short local315 = this.aShortArray159[local258 + local180];
						@Pc(327) int local327 = Static191.method3518(local129, local137, local200, this.aShortArray159[local301 + local172]);
						@Pc(340) int local340 = Static191.method3518(local129, local137, local275, this.aShortArray159[local168 + local301]);
						@Pc(350) int local350 = (local287 * (local340 - local327) >> 12) + local327;
						@Pc(363) int local363 = Static191.method3518(local129, local279, local200, this.aShortArray159[local172 + local308]);
						@Pc(375) int local375 = Static191.method3518(local129, local279, local275, this.aShortArray159[local168 + local308]);
						@Pc(386) int local386 = ((local375 - local363) * local287 >> 12) + local363;
						@Pc(398) int local398 = Static191.method3518(local283, local137, local200, this.aShortArray159[local294 + local172]);
						@Pc(409) int local409 = local350 + (local271 * (local386 - local350) >> 12);
						@Pc(421) int local421 = Static191.method3518(local283, local137, local275, this.aShortArray159[local294 + local168]);
						@Pc(432) int local432 = ((local421 - local398) * local287 >> 12) + local398;
						@Pc(444) int local444 = Static191.method3518(local283, local279, local200, this.aShortArray159[local315 + local172]);
						@Pc(457) int local457 = Static191.method3518(local283, local279, local275, this.aShortArray159[local168 + local315]);
						@Pc(468) int local468 = local444 + (local287 * (local457 - local444) >> 12);
						@Pc(479) int local479 = (local271 * (local468 - local432) >> 12) + local432;
						this.method7614(local91, local409 + ((local479 - local409) * local267 >> 12));
					}
					this.method7616();
				}
			}
		}
	}
}
