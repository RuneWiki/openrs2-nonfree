import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public abstract class Class41 {

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	private int anInt3767 = 4;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	protected int anInt3772 = 4;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	private int anInt3771 = 0;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private int anInt3770 = 4;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
	private short[] aShortArray71 = new short[512];

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	private int anInt3775 = 4;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIII)V")
	protected Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3772 = arg1;
		this.anInt3775 = arg2;
		this.anInt3770 = arg3;
		this.anInt3771 = arg0;
		this.anInt3767 = arg4;
		this.method3158();
		this.method3156();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	protected abstract void method3154();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBII)V")
	protected final void method3155() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(13) int local13;
		for (local13 = 0; local13 < 64; local13++) {
			local8[local13] = (local13 << 12) / 64;
		}
		@Pc(30) int[] local30 = new int[64];
		for (local13 = 0; local13 < 64; local13++) {
			local30[local13] = (local13 << 12) / 64;
		}
		for (local13 = 0; local13 < 64; local13++) {
			local11[local13] = (local13 << 12) / 64;
		}
		this.method3157();
		for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
					for (@Pc(104) int local104 = 0; local104 < this.anInt3772; local104++) {
						local13 = this.aShortArray72[local104] << 12;
						@Pc(123) int local123 = local13 * local11[local81] >> 12;
						@Pc(130) int local130 = this.anInt3767 * local13 >> 12;
						@Pc(138) int local138 = local8[local99] * local13 >> 12;
						@Pc(143) int local143 = local123 * this.anInt3767;
						@Pc(148) int local148 = local138 * this.anInt3775;
						@Pc(155) int local155 = this.anInt3775 * local13 >> 12;
						@Pc(159) int local159 = local148 >> 12;
						@Pc(167) int local167 = local13 * local30[local90] >> 12;
						@Pc(171) int local171 = local148 & 0xFFF;
						@Pc(176) int local176 = local167 * this.anInt3770;
						@Pc(183) int local183 = this.anInt3770 * local13 >> 12;
						@Pc(187) int local187 = Class35.anIntArray61[local171];
						@Pc(191) int local191 = local159 + 1;
						@Pc(195) int local195 = local176 >> 12;
						@Pc(199) int local199 = local195 + 1;
						@Pc(203) int local203 = local171 - 4096;
						@Pc(207) int local207 = local176 & 0xFFF;
						if (local155 > local191) {
							local191 &= 0xFF;
						} else {
							local191 = 0;
						}
						local159 &= 0xFF;
						@Pc(226) int local226 = Class35.anIntArray61[local207];
						if (local183 > local199) {
							local199 &= 0xFF;
						} else {
							local199 = 0;
						}
						local195 &= 0xFF;
						@Pc(249) int local249 = local207 - 4096;
						@Pc(253) int local253 = local143 >> 12;
						local123 = local143 & 0xFFF;
						@Pc(261) int local261 = local123 - 4096;
						@Pc(265) int local265 = Class35.anIntArray61[local123];
						@Pc(269) int local269 = local253 + 1;
						if (local130 > local269) {
							local269 &= 0xFF;
						} else {
							local269 = 0;
						}
						local253 &= 0xFF;
						@Pc(289) short local289 = this.aShortArray71[local269];
						@Pc(296) short local296 = this.aShortArray71[local289 + local195];
						@Pc(304) short local304 = this.aShortArray71[local199 + local289];
						@Pc(309) short local309 = this.aShortArray71[local253];
						@Pc(317) short local317 = this.aShortArray71[local195 + local309];
						@Pc(325) short local325 = this.aShortArray71[local199 + local309];
						@Pc(337) int local337 = Static296.method4480(local207, local171, this.aShortArray71[local159 + local317], local123);
						@Pc(350) int local350 = Static296.method4480(local207, local203, this.aShortArray71[local191 + local317], local123);
						@Pc(360) int local360 = (local187 * (local350 - local337) >> 12) + local337;
						@Pc(372) int local372 = Static296.method4480(local249, local171, this.aShortArray71[local325 + local159], local123);
						@Pc(385) int local385 = Static296.method4480(local249, local203, this.aShortArray71[local191 + local325], local123);
						@Pc(397) int local397 = local372 + (local187 * (local385 - local372) >> 12);
						@Pc(407) int local407 = (local226 * (local397 - local360) >> 12) + local360;
						@Pc(420) int local420 = Static296.method4480(local207, local171, this.aShortArray71[local159 + local296], local261);
						@Pc(432) int local432 = Static296.method4480(local207, local203, this.aShortArray71[local191 + local296], local261);
						@Pc(444) int local444 = local420 + ((local432 - local420) * local187 >> 12);
						@Pc(456) int local456 = Static296.method4480(local249, local171, this.aShortArray71[local304 + local159], local261);
						@Pc(468) int local468 = Static296.method4480(local249, local203, this.aShortArray71[local304 + local191], local261);
						@Pc(478) int local478 = (local187 * (local468 - local456) >> 12) + local456;
						@Pc(490) int local490 = local444 + ((local478 - local444) * local226 >> 12);
						this.method3159(local104, local407 + ((local490 - local407) * local265 >> 12));
					}
					this.method3154();
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	private void method3156() {
		@Pc(15) Random local15 = new Random((long) this.anInt3771);
		@Pc(21) int local21;
		for (local21 = 0; local21 < 255; local21++) {
			this.aShortArray71[local21] = (short) local21;
		}
		for (local21 = 0; local21 < 255; local21++) {
			@Pc(45) int local45 = 255 - local21;
			@Pc(50) int local50 = Static44.method716(local15, local45);
			@Pc(55) short local55 = this.aShortArray71[local50];
			this.aShortArray71[local50] = this.aShortArray71[local45];
			this.aShortArray71[local45] = this.aShortArray71[local45 + 256] = local55;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	protected abstract void method3157();

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	private void method3158() {
		this.aShortArray72 = new short[this.anInt3772];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3772; local18++) {
			this.aShortArray72[local18] = (short) Math.pow(2.0D, (double) local18);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)V")
	protected abstract void method3159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
