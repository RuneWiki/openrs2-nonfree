import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public abstract class Class75 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	private int anInt2347 = 4;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	private int anInt2350 = 0;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	protected int anInt2355 = 4;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[S")
	private short[] aShortArray50 = new short[512];

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
	private int anInt2357 = 4;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	private int anInt2361 = 4;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIII)V")
	protected Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2347 = arg4;
		this.anInt2361 = arg2;
		this.anInt2357 = arg3;
		this.anInt2355 = arg1;
		this.anInt2350 = arg0;
		this.method1885();
		this.method1887();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	private void method1885() {
		this.aShortArray49 = new short[this.anInt2355];
		for (@Pc(20) int local20 = 0; local20 < this.anInt2355; local20++) {
			this.aShortArray49[local20] = (short) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	protected abstract void method1886();

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	private void method1887() {
		@Pc(12) Random local12 = new Random((long) this.anInt2350);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray50[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(42) int local42 = 255 - local14;
			@Pc(47) int local47 = Static165.method2794(local12, local42);
			@Pc(52) short local52 = this.aShortArray50[local47];
			this.aShortArray50[local47] = this.aShortArray50[local42];
			this.aShortArray50[local42] = this.aShortArray50[local42 + 256] = local52;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
	protected abstract void method1888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BIII)V")
	protected final void method1889() {
		@Pc(15) int[] local15 = new int[64];
		@Pc(18) int[] local18 = new int[64];
		@Pc(21) int[] local21 = new int[64];
		@Pc(23) int local23;
		for (local23 = 0; local23 < 64; local23++) {
			local21[local23] = (local23 << 12) / 64;
		}
		for (local23 = 0; local23 < 64; local23++) {
			local15[local23] = (local23 << 12) / 64;
		}
		for (local23 = 0; local23 < 64; local23++) {
			local18[local23] = (local23 << 12) / 64;
		}
		this.method1892();
		for (@Pc(78) int local78 = 0; local78 < 64; local78++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					for (@Pc(101) int local101 = 0; local101 < this.anInt2355; local101++) {
						local23 = this.aShortArray49[local101] << 12;
						@Pc(120) int local120 = local21[local96] * local23 >> 12;
						@Pc(125) int local125 = local120 * this.anInt2361;
						@Pc(132) int local132 = this.anInt2361 * local23 >> 12;
						@Pc(136) int local136 = local125 >> 12;
						@Pc(143) int local143 = this.anInt2357 * local23 >> 12;
						@Pc(151) int local151 = local23 * local15[local87] >> 12;
						@Pc(156) int local156 = local151 * this.anInt2357;
						@Pc(160) int local160 = local125 & 0xFFF;
						@Pc(164) int local164 = local160 - 4096;
						@Pc(171) int local171 = local23 * this.anInt2347 >> 12;
						@Pc(175) int local175 = Class56.anIntArray119[local160];
						@Pc(183) int local183 = local18[local78] * local23 >> 12;
						@Pc(187) int local187 = local156 >> 12;
						@Pc(191) int local191 = local187 + 1;
						@Pc(195) int local195 = local156 & 0xFFF;
						@Pc(199) int local199 = local187 & 0xFF;
						@Pc(203) int local203 = local136 + 1;
						@Pc(208) int local208 = local183 * this.anInt2347;
						@Pc(212) int local212 = local195 - 4096;
						@Pc(216) int local216 = local208 >> 12;
						@Pc(220) int local220 = Class56.anIntArray119[local195];
						@Pc(224) int local224 = local208 & 0xFFF;
						@Pc(228) int local228 = local136 & 0xFF;
						@Pc(232) int local232 = local216 + 1;
						@Pc(236) int local236 = Class56.anIntArray119[local224];
						if (local191 >= local143) {
							local191 = 0;
						} else {
							local191 &= 0xFF;
						}
						local216 &= 0xFF;
						if (local203 < local132) {
							local203 &= 0xFF;
						} else {
							local203 = 0;
						}
						if (local232 >= local171) {
							local232 = 0;
						} else {
							local232 &= 0xFF;
						}
						@Pc(290) short local290 = this.aShortArray50[local232];
						@Pc(297) short local297 = this.aShortArray50[local191 + local290];
						@Pc(304) short local304 = this.aShortArray50[local290 + local199];
						@Pc(309) short local309 = this.aShortArray50[local216];
						@Pc(317) short local317 = this.aShortArray50[local191 + local309];
						@Pc(324) short local324 = this.aShortArray50[local199 + local309];
						@Pc(336) int local336 = Static208.method3304(local195, local160, local224, this.aShortArray50[local324 + local228]);
						@Pc(348) int local348 = Static208.method3304(local195, local164, local224, this.aShortArray50[local324 + local203]);
						@Pc(352) int local352 = local224 - 4096;
						@Pc(363) int local363 = (local175 * (local348 - local336) >> 12) + local336;
						@Pc(375) int local375 = Static208.method3304(local212, local160, local224, this.aShortArray50[local317 + local228]);
						@Pc(388) int local388 = Static208.method3304(local212, local164, local224, this.aShortArray50[local203 + local317]);
						@Pc(399) int local399 = local375 + ((local388 - local375) * local175 >> 12);
						@Pc(411) int local411 = Static208.method3304(local195, local160, local352, this.aShortArray50[local228 + local304]);
						@Pc(423) int local423 = Static208.method3304(local195, local164, local352, this.aShortArray50[local304 + local203]);
						@Pc(434) int local434 = (local220 * (local399 - local363) >> 12) + local363;
						@Pc(445) int local445 = (local175 * (local423 - local411) >> 12) + local411;
						@Pc(457) int local457 = Static208.method3304(local212, local160, local352, this.aShortArray50[local228 + local297]);
						@Pc(469) int local469 = Static208.method3304(local212, local164, local352, this.aShortArray50[local203 + local297]);
						@Pc(481) int local481 = local457 + (local175 * (local469 - local457) >> 12);
						@Pc(493) int local493 = local445 + ((local481 - local445) * local220 >> 12);
						this.method1888(local434 + ((local493 - local434) * local236 >> 12), local101);
					}
					this.method1886();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)V")
	protected abstract void method1892();
}
