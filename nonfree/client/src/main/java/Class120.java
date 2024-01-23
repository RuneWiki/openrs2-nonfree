import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class120 {

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[S")
	private short[] aShortArray91;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private int anInt5364 = 4;

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
	private int anInt5369 = 4;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	private int anInt5372 = 0;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	protected int anInt5365 = 4;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[S")
	private short[] aShortArray92 = new short[512];

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	private int anInt5371 = 4;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIII)V")
	protected Class120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5371 = arg3;
		this.anInt5364 = arg2;
		this.anInt5365 = arg1;
		this.anInt5369 = arg4;
		this.anInt5372 = arg0;
		this.method4265();
		this.method4258();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	protected abstract void method4256();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIII)V")
	protected final void method4257() {
		@Pc(8) int[] local8 = new int[64];
		@Pc(11) int[] local11 = new int[64];
		@Pc(14) int[] local14 = new int[64];
		@Pc(16) int local16;
		for (local16 = 0; local16 < 64; local16++) {
			local8[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local11[local16] = (local16 << 12) / 64;
		}
		for (local16 = 0; local16 < 64; local16++) {
			local14[local16] = (local16 << 12) / 64;
		}
		this.method4263();
		for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
			for (@Pc(81) int local81 = 0; local81 < 64; local81++) {
				for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
					for (@Pc(99) int local99 = 0; local99 < this.anInt5365; local99++) {
						local16 = this.aShortArray91[local99] << 12;
						@Pc(117) int local117 = local16 * this.anInt5364 >> 12;
						@Pc(125) int local125 = local16 * local8[local90] >> 12;
						@Pc(130) int local130 = local125 * this.anInt5364;
						@Pc(134) int local134 = local130 >> 12;
						@Pc(142) int local142 = local14[local72] * local16 >> 12;
						@Pc(146) int local146 = local134 + 1;
						if (local146 >= local117) {
							local146 = 0;
						} else {
							local146 &= 0xFF;
						}
						@Pc(164) int local164 = this.anInt5369 * local16 >> 12;
						@Pc(171) int local171 = local16 * this.anInt5371 >> 12;
						local134 &= 0xFF;
						local125 = local130 & 0xFFF;
						@Pc(183) int local183 = local125 - 4096;
						@Pc(187) int local187 = Class32_Sub1_Sub1.anIntArray119[local125];
						local142 *= this.anInt5369;
						@Pc(200) int local200 = local16 * local11[local81] >> 12;
						@Pc(205) int local205 = local200 * this.anInt5371;
						@Pc(209) int local209 = local205 >> 12;
						@Pc(213) int local213 = local142 >> 12;
						@Pc(217) int local217 = local205 & 0xFFF;
						local142 &= 0xFFF;
						@Pc(225) int local225 = local209 + 1;
						@Pc(229) int local229 = local213 + 1;
						@Pc(233) int local233 = Class32_Sub1_Sub1.anIntArray119[local217];
						@Pc(237) int local237 = local217 - 4096;
						@Pc(241) int local241 = Class32_Sub1_Sub1.anIntArray119[local142];
						if (local171 > local225) {
							local225 &= 0xFF;
						} else {
							local225 = 0;
						}
						local213 &= 0xFF;
						if (local164 <= local229) {
							local229 = 0;
						} else {
							local229 &= 0xFF;
						}
						@Pc(276) short local276 = this.aShortArray92[local229];
						@Pc(280) int local280 = local142 - 4096;
						local209 &= 0xFF;
						@Pc(291) short local291 = this.aShortArray92[local225 + local276];
						@Pc(298) short local298 = this.aShortArray92[local276 + local209];
						@Pc(303) short local303 = this.aShortArray92[local213];
						@Pc(310) short local310 = this.aShortArray92[local225 + local303];
						@Pc(317) short local317 = this.aShortArray92[local209 + local303];
						@Pc(331) int local331 = Static122.method2058(this.aShortArray92[local317 + local134], local142, local125, local217);
						@Pc(343) int local343 = Static122.method2058(this.aShortArray92[local146 + local317], local142, local183, local217);
						@Pc(354) int local354 = (local187 * (local343 - local331) >> 12) + local331;
						@Pc(368) int local368 = Static122.method2058(this.aShortArray92[local134 + local310], local142, local125, local237);
						@Pc(380) int local380 = Static122.method2058(this.aShortArray92[local310 + local146], local142, local183, local237);
						@Pc(391) int local391 = ((local380 - local368) * local187 >> 12) + local368;
						@Pc(403) int local403 = Static122.method2058(this.aShortArray92[local298 + local134], local280, local125, local217);
						@Pc(414) int local414 = local354 + ((local391 - local354) * local233 >> 12);
						@Pc(426) int local426 = Static122.method2058(this.aShortArray92[local146 + local298], local280, local183, local217);
						@Pc(438) int local438 = local403 + (local187 * (local426 - local403) >> 12);
						@Pc(453) int local453 = Static122.method2058(this.aShortArray92[local134 + local291], local280, local125, local237);
						@Pc(465) int local465 = Static122.method2058(this.aShortArray92[local291 + local146], local280, local183, local237);
						@Pc(477) int local477 = local453 + (local187 * (local465 - local453) >> 12);
						@Pc(488) int local488 = local438 + ((local477 - local438) * local233 >> 12);
						this.method4264(local414 + (local241 * (local488 - local414) >> 12), local99);
					}
					this.method4256();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	private void method4258() {
		@Pc(12) Random local12 = new Random((long) this.anInt5372);
		@Pc(14) int local14;
		for (local14 = 0; local14 < 255; local14++) {
			this.aShortArray92[local14] = (short) local14;
		}
		for (local14 = 0; local14 < 255; local14++) {
			@Pc(39) int local39 = 255 - local14;
			@Pc(44) int local44 = Static241.method3695(local39, local12);
			@Pc(49) short local49 = this.aShortArray92[local44];
			this.aShortArray92[local44] = this.aShortArray92[local39];
			this.aShortArray92[local39] = this.aShortArray92[local39 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	protected abstract void method4263();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	protected abstract void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	private void method4265() {
		this.aShortArray91 = new short[this.anInt5365];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5365; local16++) {
			this.aShortArray91[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}
}
