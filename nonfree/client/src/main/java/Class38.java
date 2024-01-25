import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public abstract class Class38 {

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	private int anInt6442 = 0;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[S")
	private final short[] aShortArray90 = new short[512];

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	protected int anInt6443 = 4;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	private int anInt6450 = 4;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	private int anInt6449 = 4;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	private int anInt6448 = 4;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(IIIII)V")
	protected Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6450 = arg4;
		this.anInt6443 = arg1;
		this.anInt6448 = arg3;
		this.anInt6449 = arg2;
		this.anInt6442 = arg0;
		this.method5559();
		this.method5553();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	private void method5553() {
		@Pc(12) Random local12 = new Random((long) this.anInt6442);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray90[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static239.method3351(local43, local12);
			@Pc(53) short local53 = this.aShortArray90[local48];
			this.aShortArray90[local48] = this.aShortArray90[local43];
			this.aShortArray90[local43] = this.aShortArray90[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)V")
	protected abstract void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	protected abstract void method5555();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
	protected final void method5557() {
		@Pc(16) int[] local16 = new int[128];
		@Pc(19) int[] local19 = new int[128];
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			local16[local21] = (local21 << 12) / 128;
		}
		@Pc(42) int[] local42 = new int[16];
		for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
			local19[local44] = (local44 << 12) / 128;
		}
		for (@Pc(64) int local64 = 0; local64 < 16; local64++) {
			local42[local64] = (local64 << 12) / 16;
		}
		this.method5560();
		for (@Pc(87) int local87 = 0; local87 < 16; local87++) {
			for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
				for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
					for (@Pc(99) int local99 = 0; local99 < this.anInt6443; local99++) {
						@Pc(108) int local108 = this.aShortArray91[local99] << 12;
						@Pc(116) int local116 = local42[local87] * local108 >> 12;
						@Pc(123) int local123 = local108 * this.anInt6450 >> 12;
						@Pc(131) int local131 = local108 * local16[local95] >> 12;
						@Pc(138) int local138 = this.anInt6448 * local108 >> 12;
						@Pc(146) int local146 = local108 * local19[local91] >> 12;
						@Pc(153) int local153 = local108 * this.anInt6449 >> 12;
						@Pc(158) int local158 = local131 * this.anInt6449;
						@Pc(163) int local163 = local146 * this.anInt6448;
						@Pc(168) int local168 = local116 * this.anInt6450;
						@Pc(172) int local172 = local158 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local172 & 0xFF;
						@Pc(184) int local184 = local163 >> 12;
						@Pc(188) int local188 = local184 + 1;
						@Pc(192) int local192 = local184 & 0xFF;
						@Pc(196) int local196 = local168 >> 12;
						@Pc(200) int local200 = local196 + 1;
						@Pc(204) int local204 = local158 & 0xFFF;
						@Pc(208) int local208 = local168 & 0xFFF;
						if (local200 >= local123) {
							local200 = 0;
						} else {
							local200 &= 0xFF;
						}
						local146 = local163 & 0xFFF;
						if (local153 > local176) {
							local176 &= 0xFF;
						} else {
							local176 = 0;
						}
						local196 &= 0xFF;
						if (local138 > local188) {
							local188 &= 0xFF;
						} else {
							local188 = 0;
						}
						@Pc(257) int local257 = Class2_Sub16.anIntArray217[local208];
						@Pc(261) int local261 = local146 - 4096;
						@Pc(265) int local265 = Class2_Sub16.anIntArray217[local204];
						@Pc(269) int local269 = local204 - 4096;
						@Pc(273) int local273 = local208 - 4096;
						@Pc(277) int local277 = Class2_Sub16.anIntArray217[local146];
						@Pc(282) short local282 = this.aShortArray90[local196];
						@Pc(287) short local287 = this.aShortArray90[local200];
						@Pc(295) short local295 = this.aShortArray90[local188 + local287];
						@Pc(302) short local302 = this.aShortArray90[local282 + local188];
						@Pc(309) short local309 = this.aShortArray90[local287 + local192];
						@Pc(317) short local317 = this.aShortArray90[local192 + local282];
						@Pc(330) int local330 = Static554.method7605(local204, local146, local208, this.aShortArray90[local180 + local317]);
						@Pc(342) int local342 = Static554.method7605(local269, local146, local208, this.aShortArray90[local317 + local176]);
						@Pc(353) int local353 = local330 + ((local342 - local330) * local265 >> 12);
						@Pc(365) int local365 = Static554.method7605(local204, local261, local208, this.aShortArray90[local302 + local180]);
						@Pc(377) int local377 = Static554.method7605(local269, local261, local208, this.aShortArray90[local302 + local176]);
						@Pc(388) int local388 = local365 + ((local377 - local365) * local265 >> 12);
						@Pc(398) int local398 = local353 + (local277 * (local388 - local353) >> 12);
						@Pc(411) int local411 = Static554.method7605(local204, local146, local273, this.aShortArray90[local180 + local309]);
						@Pc(423) int local423 = Static554.method7605(local269, local146, local273, this.aShortArray90[local309 + local176]);
						@Pc(433) int local433 = local411 + ((local423 - local411) * local265 >> 12);
						@Pc(445) int local445 = Static554.method7605(local204, local261, local273, this.aShortArray90[local295 + local180]);
						@Pc(457) int local457 = Static554.method7605(local269, local261, local273, this.aShortArray90[local295 + local176]);
						@Pc(467) int local467 = local445 + ((local457 - local445) * local265 >> 12);
						@Pc(478) int local478 = ((local467 - local433) * local277 >> 12) + local433;
						this.method5554(((local478 - local398) * local257 >> 12) + local398, local99);
					}
					this.method5555();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	private void method5559() {
		this.aShortArray91 = new short[this.anInt6443];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6443; local18++) {
			this.aShortArray91[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	protected abstract void method5560();
}
