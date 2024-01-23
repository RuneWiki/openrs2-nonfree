import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public abstract class Class24 {

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
	private int anInt3986 = 4;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
	private int anInt3989 = 0;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
	private int anInt3985 = 4;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	private int anInt3991 = 4;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[S")
	private short[] aShortArray71 = new short[512];

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	protected int anInt3992 = 4;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIII)V")
	protected Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3985 = arg2;
		this.anInt3991 = arg3;
		this.anInt3992 = arg1;
		this.anInt3986 = arg4;
		this.anInt3989 = arg0;
		this.method3196();
		this.method3193();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	private void method3193() {
		@Pc(12) Random local12 = new Random((long) this.anInt3989);
		@Pc(18) int local18;
		for (local18 = 0; local18 < 255; local18++) {
			this.aShortArray71[local18] = (short) local18;
		}
		for (local18 = 0; local18 < 255; local18++) {
			@Pc(42) int local42 = 255 - local18;
			@Pc(47) int local47 = Static186.method3095(local12, local42);
			@Pc(52) short local52 = this.aShortArray71[local47];
			this.aShortArray71[local47] = this.aShortArray71[local42];
			this.aShortArray71[local42] = this.aShortArray71[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)V")
	protected abstract void method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	private void method3196() {
		this.aShortArray72 = new short[this.anInt3992];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3992; local20++) {
			this.aShortArray72[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
	protected abstract void method3197();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIII)V")
	protected final void method3198() {
		@Pc(16) int[] local16 = new int[64];
		@Pc(19) int[] local19 = new int[64];
		@Pc(21) int local21;
		for (local21 = 0; local21 < 64; local21++) {
			local19[local21] = (local21 << 12) / 64;
		}
		@Pc(38) int[] local38 = new int[64];
		for (local21 = 0; local21 < 64; local21++) {
			local38[local21] = (local21 << 12) / 64;
		}
		for (local21 = 0; local21 < 64; local21++) {
			local16[local21] = (local21 << 12) / 64;
		}
		this.method3197();
		for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					for (@Pc(102) int local102 = 0; local102 < this.anInt3992; local102++) {
						local21 = this.aShortArray72[local102] << 12;
						@Pc(120) int local120 = local21 * this.anInt3985 >> 12;
						@Pc(128) int local128 = local38[local88] * local21 >> 12;
						@Pc(135) int local135 = this.anInt3991 * local21 >> 12;
						@Pc(142) int local142 = local21 * this.anInt3986 >> 12;
						@Pc(150) int local150 = local21 * local16[local83] >> 12;
						@Pc(158) int local158 = local19[local97] * local21 >> 12;
						@Pc(163) int local163 = local158 * this.anInt3985;
						@Pc(168) int local168 = local150 * this.anInt3986;
						@Pc(172) int local172 = local168 >> 12;
						@Pc(176) int local176 = local172 + 1;
						@Pc(180) int local180 = local172 & 0xFF;
						if (local142 <= local176) {
							local176 = 0;
						} else {
							local176 &= 0xFF;
						}
						local150 = local168 & 0xFFF;
						@Pc(203) int local203 = local163 >> 12;
						@Pc(208) short local208 = this.aShortArray71[local176];
						@Pc(212) int local212 = local150 - 4096;
						@Pc(217) short local217 = this.aShortArray71[local180];
						@Pc(221) int local221 = local203 + 1;
						@Pc(225) int local225 = local203 & 0xFF;
						if (local221 >= local120) {
							local221 = 0;
						} else {
							local221 &= 0xFF;
						}
						local158 = local163 & 0xFFF;
						@Pc(248) int local248 = Class11.anIntArray37[local158];
						local128 *= this.anInt3991;
						@Pc(257) int local257 = Class11.anIntArray37[local150];
						@Pc(261) int local261 = local158 - 4096;
						@Pc(265) int local265 = local128 >> 12;
						@Pc(269) int local269 = local265 + 1;
						local128 &= 0xFFF;
						@Pc(277) int local277 = Class11.anIntArray37[local128];
						@Pc(281) int local281 = local128 - 4096;
						@Pc(285) int local285 = local265 & 0xFF;
						@Pc(292) short local292 = this.aShortArray71[local217 + local285];
						if (local269 >= local135) {
							local269 = 0;
						} else {
							local269 &= 0xFF;
						}
						@Pc(310) short local310 = this.aShortArray71[local217 + local269];
						@Pc(318) short local318 = this.aShortArray71[local269 + local208];
						@Pc(325) short local325 = this.aShortArray71[local208 + local285];
						@Pc(337) int local337 = Static219.method3467(local128, local150, local158, this.aShortArray71[local292 + local225]);
						@Pc(349) int local349 = Static219.method3467(local128, local150, local261, this.aShortArray71[local292 + local221]);
						@Pc(360) int local360 = local337 + (local248 * (local349 - local337) >> 12);
						@Pc(375) int local375 = Static219.method3467(local281, local150, local158, this.aShortArray71[local225 + local310]);
						@Pc(387) int local387 = Static219.method3467(local281, local150, local261, this.aShortArray71[local310 + local221]);
						@Pc(398) int local398 = (local248 * (local387 - local375) >> 12) + local375;
						@Pc(410) int local410 = Static219.method3467(local128, local212, local158, this.aShortArray71[local325 + local225]);
						@Pc(421) int local421 = (local277 * (local398 - local360) >> 12) + local360;
						@Pc(433) int local433 = Static219.method3467(local128, local212, local261, this.aShortArray71[local325 + local221]);
						@Pc(444) int local444 = ((local433 - local410) * local248 >> 12) + local410;
						@Pc(456) int local456 = Static219.method3467(local281, local212, local158, this.aShortArray71[local318 + local225]);
						@Pc(468) int local468 = Static219.method3467(local281, local212, local261, this.aShortArray71[local221 + local318]);
						@Pc(480) int local480 = local456 + (local248 * (local468 - local456) >> 12);
						@Pc(491) int local491 = local444 + (local277 * (local480 - local444) >> 12);
						this.method3194(((local491 - local421) * local257 >> 12) + local421, local102);
					}
					this.method3201();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	protected abstract void method3201();
}
