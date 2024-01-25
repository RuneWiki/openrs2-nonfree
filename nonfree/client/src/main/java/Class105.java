import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public abstract class Class105 {

	@OriginalMember(owner = "client!nba", name = "h", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
	private int anInt9474 = 4;

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "[S")
	private final short[] aShortArray142 = new short[512];

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
	private int anInt9475 = 4;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	private int anInt9478 = 0;

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
	private int anInt9479 = 4;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	protected int anInt9482 = 4;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIIII)V")
	protected Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9478 = arg0;
		this.anInt9482 = arg1;
		this.anInt9475 = arg3;
		this.anInt9474 = arg4;
		this.anInt9479 = arg2;
		this.method8369();
		this.method8374();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BIII)V")
	protected final void method8368() {
		@Pc(13) int[] local13 = new int[128];
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[16];
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			local13[local21] = (local21 << 12) / 128;
		}
		for (@Pc(39) int local39 = 0; local39 < 128; local39++) {
			local16[local39] = (local39 << 12) / 128;
		}
		for (@Pc(59) int local59 = 0; local59 < 16; local59++) {
			local19[local59] = (local59 << 12) / 16;
		}
		this.method8371();
		for (@Pc(86) int local86 = 0; local86 < 16; local86++) {
			for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
				for (@Pc(96) int local96 = 0; local96 < 128; local96++) {
					for (@Pc(100) int local100 = 0; local100 < this.anInt9482; local100++) {
						@Pc(111) int local111 = this.aShortArray141[local100] << 12;
						@Pc(119) int local119 = local111 * local19[local86] >> 12;
						@Pc(126) int local126 = this.anInt9475 * local111 >> 12;
						@Pc(133) int local133 = this.anInt9479 * local111 >> 12;
						@Pc(141) int local141 = local111 * local16[local92] >> 12;
						@Pc(149) int local149 = local13[local96] * local111 >> 12;
						@Pc(156) int local156 = local111 * this.anInt9474 >> 12;
						@Pc(161) int local161 = local141 * this.anInt9475;
						@Pc(166) int local166 = local149 * this.anInt9479;
						@Pc(171) int local171 = local119 * this.anInt9474;
						@Pc(175) int local175 = local166 >> 12;
						@Pc(179) int local179 = local175 + 1;
						@Pc(183) int local183 = local175 & 0xFF;
						@Pc(187) int local187 = local161 >> 12;
						@Pc(191) int local191 = local187 + 1;
						@Pc(195) int local195 = local171 >> 12;
						@Pc(199) int local199 = local187 & 0xFF;
						@Pc(203) int local203 = local195 + 1;
						@Pc(207) int local207 = local166 & 0xFFF;
						@Pc(211) int local211 = local171 & 0xFFF;
						if (local126 <= local191) {
							local191 = 0;
						} else {
							local191 &= 0xFF;
						}
						local195 &= 0xFF;
						if (local156 > local203) {
							local203 &= 0xFF;
						} else {
							local203 = 0;
						}
						if (local179 < local133) {
							local179 &= 0xFF;
						} else {
							local179 = 0;
						}
						local141 = local161 & 0xFFF;
						@Pc(264) int local264 = Class281.anIntArray541[local141];
						@Pc(268) int local268 = local141 - 4096;
						@Pc(272) int local272 = local207 - 4096;
						@Pc(277) short local277 = this.aShortArray142[local203];
						@Pc(282) short local282 = this.aShortArray142[local195];
						@Pc(286) int local286 = Class281.anIntArray541[local211];
						@Pc(290) int local290 = Class281.anIntArray541[local207];
						@Pc(294) int local294 = local211 - 4096;
						@Pc(301) short local301 = this.aShortArray142[local282 + local199];
						@Pc(308) short local308 = this.aShortArray142[local199 + local277];
						@Pc(315) short local315 = this.aShortArray142[local282 + local191];
						@Pc(322) short local322 = this.aShortArray142[local191 + local277];
						@Pc(334) int local334 = Static693.method9339(local207, local211, this.aShortArray142[local183 + local301], local141);
						@Pc(346) int local346 = Static693.method9339(local272, local211, this.aShortArray142[local301 + local179], local141);
						@Pc(356) int local356 = (local290 * (local346 - local334) >> 12) + local334;
						@Pc(368) int local368 = Static693.method9339(local207, local211, this.aShortArray142[local315 + local183], local268);
						@Pc(380) int local380 = Static693.method9339(local272, local211, this.aShortArray142[local315 + local179], local268);
						@Pc(390) int local390 = (local290 * (local380 - local368) >> 12) + local368;
						@Pc(401) int local401 = local356 + (local264 * (local390 - local356) >> 12);
						@Pc(413) int local413 = Static693.method9339(local207, local294, this.aShortArray142[local308 + local183], local141);
						@Pc(425) int local425 = Static693.method9339(local272, local294, this.aShortArray142[local179 + local308], local141);
						@Pc(436) int local436 = (local290 * (local425 - local413) >> 12) + local413;
						@Pc(449) int local449 = Static693.method9339(local207, local294, this.aShortArray142[local183 + local322], local268);
						@Pc(461) int local461 = Static693.method9339(local272, local294, this.aShortArray142[local179 + local322], local268);
						@Pc(473) int local473 = local449 + ((local461 - local449) * local290 >> 12);
						@Pc(485) int local485 = local436 + (local264 * (local473 - local436) >> 12);
						this.method8370(local401 + ((local485 - local401) * local286 >> 12), local100);
					}
					this.method8372();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	private void method8369() {
		this.aShortArray141 = new short[this.anInt9482];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9482; local12++) {
			this.aShortArray141[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
	protected abstract void method8370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	protected abstract void method8371();

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)V")
	protected abstract void method8372();

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)V")
	private void method8374() {
		@Pc(12) Random local12 = new Random((long) this.anInt9478);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray142[local14] = (short) local14;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(42) int local42 = 255 - local33;
			@Pc(47) int local47 = Static289.method4068(local42, local12);
			@Pc(52) short local52 = this.aShortArray142[local47];
			this.aShortArray142[local47] = this.aShortArray142[local42];
			this.aShortArray142[local42] = this.aShortArray142[local42 + 256] = local52;
		}
	}
}
