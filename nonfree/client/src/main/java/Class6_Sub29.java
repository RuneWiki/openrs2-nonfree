import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class6_Sub29 extends Class6 {

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "I")
	private int anInt6206;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Lclient!ld;")
	private final Class6_Sub25 aClass6_Sub25_2;

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "Lclient!gj;")
	private final Class90_Sub3 aClass90_Sub3_8;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!kb;")
	private final Class46_Sub2 aClass46_Sub2_2;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "I")
	private final int anInt6214;

	@OriginalMember(owner = "client!mt", name = "y", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
	private final int anInt6212;

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
	private final int anInt6207;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
	private int anInt6204;

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "Lclient!oj;")
	private Class234 aClass234_38;

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!jn;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!mt", name = "A", descriptor = "Lclient!iq;")
	private final Interface8 anInterface8_10;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!gj;Lclient!kb;Lclient!ld;[I)V")
	public Class6_Sub29(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) Class46_Sub2 arg1, @OriginalArg(2) Class6_Sub25 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub25_2 = arg2;
		this.aClass90_Sub3_8 = arg0;
		this.aClass46_Sub2_2 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub25_2.method6398() - (arg1.anInt9998 >> 1);
		this.anInt6214 = this.aClass6_Sub25_2.method6405() - local22 >> arg1.anInt10000;
		this.anInt6208 = this.aClass6_Sub25_2.method6405() + local22 >> arg1.anInt10000;
		this.anInt6212 = this.aClass6_Sub25_2.method6400() - local22 >> arg1.anInt10000;
		this.anInt6207 = local22 + this.aClass6_Sub25_2.method6400() >> arg1.anInt10000;
		@Pc(76) int local76 = this.anInt6208 + 1 - this.anInt6214;
		@Pc(85) int local85 = this.anInt6207 + 1 - this.anInt6212;
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt6212;
			if (local122 > 0 && this.aClass46_Sub2_2.anInt9995 - 1 > local122) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = local136 + this.anInt6214;
					if (local143 > 0 && local143 < this.aClass46_Sub2_2.anInt9997 - 1) {
						local170 = arg1.JA(local143 + 1, local122) - arg1.JA(local143 - 1, local122);
						local185 = arg1.JA(local143, local122 + 1) - arg1.JA(local143, local122 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local185 * local185 + 65536)));
						this.aFloatArrayArray8[local136][local114] = (float) local170 * local200;
						this.aFloatArrayArray10[local136][local114] = -256.0F * local200;
						this.aFloatArrayArray9[local136][local114] = local200 * (float) local185;
					}
				}
			}
		}
		local122 = 0;
		@Pc(294) int local294;
		for (local136 = this.anInt6212; local136 <= this.anInt6207; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt9995) {
				for (local143 = this.anInt6214; local143 <= this.anInt6208; local143++) {
					if (local143 >= 0 && arg1.anInt9997 > local143) {
						local170 = arg3[local122];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray4[local143][local136];
						if (local283 != null && local170 != 0) {
							if (local170 == 1) {
								local294 = 0;
								while (local294 < local283.length) {
									if (local283[local294++] != -1 && local283[local294++] != -1 && local283[local294++] != -1) {
										this.anInt6204 += 3;
									}
								}
							} else {
								this.anInt6204 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt6208 - this.anInt6214;
			}
		}
		if (this.anInt6204 > 0) {
			this.aClass234_38 = new Class234(Static14.method5936(this.anInt6204));
			this.anInterface9_6 = this.aClass90_Sub3_8.method7545(false);
			this.anInterface9_6.method5935(this.anInt6204);
			@Pc(396) NativeHeapBuffer local396 = this.aClass90_Sub3_8.method7651(this.anInt6204 * 16, false);
			this.aStream4 = new Stream(local396);
			while (true) {
				@Pc(408) Buffer local408;
				do {
					local408 = this.anInterface9_6.method6462();
				} while (local408 == null);
				this.aStream5 = new Stream(local408);
				local185 = 0;
				local122 = 0;
				for (local294 = this.anInt6212; local294 <= this.anInt6207; local294++) {
					if (local294 >= 0 && local294 < arg1.anInt9995) {
						@Pc(437) int local437 = 0;
						for (@Pc(440) int local440 = this.anInt6214; local440 <= this.anInt6208; local440++) {
							if (local440 >= 0 && local440 < arg1.anInt9997) {
								@Pc(455) int local455 = arg3[local122];
								@Pc(462) int[] local462 = arg1.anIntArrayArrayArray4[local440][local294];
								if (local462 != null && local455 != 0) {
									if (local455 == 1) {
										@Pc(476) int[] local476 = arg1.anIntArrayArrayArray3[local440][local294];
										@Pc(483) int[] local483 = arg1.anIntArrayArrayArray2[local440][local294];
										@Pc(485) int local485 = 0;
										label120: while (true) {
											while (true) {
												if (local485 >= local462.length) {
													break label120;
												}
												if (local462[local485] == -1 || local462[local485 + 1] == -1 || local462[local485 + 2] == -1) {
													local485 += 3;
												} else {
													this.method5037(local294, local185, local476[local485], local483[local485], local440, local437);
													local485++;
													this.method5037(local294, local185, local476[local485], local483[local485], local440, local437);
													local485++;
													this.method5037(local294, local185, local476[local485], local483[local485], local440, local437);
													local485++;
												}
											}
										}
									} else if (local455 == 3) {
										this.method5037(local294, local185, 0, 0, local440, local437);
										this.method5037(local294, local185, arg1.anInt9998, 0, local440, local437);
										this.method5037(local294, local185, 0, arg1.anInt9998, local440, local437);
									} else if (local455 == 2) {
										this.method5037(local294, local185, arg1.anInt9998, 0, local440, local437);
										this.method5037(local294, local185, arg1.anInt9998, arg1.anInt9998, local440, local437);
										this.method5037(local294, local185, 0, 0, local440, local437);
									} else if (local455 == 5) {
										this.method5037(local294, local185, arg1.anInt9998, arg1.anInt9998, local440, local437);
										this.method5037(local294, local185, 0, arg1.anInt9998, local440, local437);
										this.method5037(local294, local185, arg1.anInt9998, 0, local440, local437);
									} else if (local455 == 4) {
										this.method5037(local294, local185, 0, arg1.anInt9998, local440, local437);
										this.method5037(local294, local185, 0, 0, local440, local437);
										this.method5037(local294, local185, arg1.anInt9998, arg1.anInt9998, local440, local437);
									}
								}
							}
							local122++;
							local437++;
						}
					} else {
						local122 += this.anInt6208 - this.anInt6214;
					}
					local185++;
				}
				this.aStream5.b();
				if (this.anInterface9_6.method6460()) {
					this.aStream4.b();
					this.anInterface8_10 = this.aClass90_Sub3_8.method7562(false);
					this.anInterface8_10.method6459(this.anInt6206 * 16, 16, local396);
					break;
				}
				this.aStream4.b(0);
				this.aClass234_38.method5463();
			}
		} else {
			this.anInterface8_10 = null;
			this.anInterface9_6 = null;
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray10 = this.aFloatArrayArray9 = null;
		this.aStream4 = null;
		this.aStream5 = null;
		this.aClass234_38 = null;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IS)V")
	private void method5032(@OriginalArg(1) short arg0) {
		if (Stream.a()) {
			this.aStream5.e(arg0);
		} else {
			this.aStream5.a(arg0);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB[[ZII)V")
	public void method5034(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface9_6 == null || (this.anInt6214 > arg3 + arg2 || (arg2 - arg3 > this.anInt6208 || (this.anInt6212 > arg0 + arg3 || this.anInt6207 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt6212; local57 <= this.anInt6207; local57++) {
			for (@Pc(62) int local62 = this.anInt6214; local62 <= this.anInt6208; local62++) {
				@Pc(69) int local69 = local62 - arg2;
				@Pc(74) int local74 = local57 - arg0;
				if (local69 > -arg3 && arg3 > local69 && local74 > -arg3 && local74 < arg3 && arg1[local69 + arg3][arg3 + local74]) {
					this.aClass90_Sub3_8.method7566((byte) (this.aClass6_Sub25_2.method6407() * 255.0F));
					this.aClass90_Sub3_8.method7658(this.anInterface8_10, 0);
					this.aClass90_Sub3_8.method7553(this.aClass90_Sub3_8.aClass107_16);
					this.aClass90_Sub3_8.method7560(this.anInt6206, this.anInt6204 / 3, 0, this.anInterface9_6, Static104.aClass321_1, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII)V")
	private void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg4 << this.aClass46_Sub2_2.anInt10000);
		@Pc(23) int local23 = (arg0 << this.aClass46_Sub2_2.anInt10000) + arg3;
		@Pc(29) int local29 = this.aClass46_Sub2_2.sa(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(63) Class6 local63 = this.aClass234_38.method5464(local7);
			if (local63 != null) {
				this.method5032(((Class6_Sub31) local63).aShort85);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt6206++;
		if (local7 != -1L) {
			this.aClass234_38.method5466(local7, new Class6_Sub31(local81));
		}
		@Pc(111) float local111;
		@Pc(125) float local125;
		@Pc(118) float local118;
		@Pc(213) float local213;
		@Pc(221) float local221;
		@Pc(228) float local228;
		@Pc(235) float local235;
		@Pc(242) float local242;
		@Pc(251) float local251;
		@Pc(260) float local260;
		@Pc(335) float local335;
		if (arg2 == 0 && arg3 == 0) {
			local111 = this.aFloatArrayArray8[arg5][arg1];
			local118 = this.aFloatArrayArray9[arg5][arg1];
			local125 = this.aFloatArrayArray10[arg5][arg1];
		} else if (arg2 == this.aClass46_Sub2_2.anInt9998 && arg3 == 0) {
			local111 = this.aFloatArrayArray8[arg5 + 1][arg1];
			local118 = this.aFloatArrayArray9[arg5 + 1][arg1];
			local125 = this.aFloatArrayArray10[arg5 + 1][arg1];
		} else if (this.aClass46_Sub2_2.anInt9998 == arg2 && this.aClass46_Sub2_2.anInt9998 == arg3) {
			local111 = this.aFloatArrayArray8[arg5 + 1][arg1 + 1];
			local125 = this.aFloatArrayArray10[arg5 + 1][arg1 + 1];
			local118 = this.aFloatArrayArray9[arg5 + 1][arg1 + 1];
		} else if (arg2 == 0 && this.aClass46_Sub2_2.anInt9998 == arg3) {
			local118 = this.aFloatArrayArray9[arg5][arg1 + 1];
			local111 = this.aFloatArrayArray8[arg5][arg1 + 1];
			local125 = this.aFloatArrayArray10[arg5][arg1 + 1];
		} else {
			local213 = (float) arg2 / (float) this.aClass46_Sub2_2.anInt9998;
			local221 = (float) arg3 / (float) this.aClass46_Sub2_2.anInt9998;
			local228 = this.aFloatArrayArray8[arg5][arg1];
			local235 = this.aFloatArrayArray10[arg5][arg1];
			local242 = this.aFloatArrayArray9[arg5][arg1];
			local251 = this.aFloatArrayArray8[arg5 + 1][arg1];
			local260 = this.aFloatArrayArray10[arg5 + 1][arg1];
			@Pc(275) float local275 = local242 + local213 * (this.aFloatArrayArray9[arg5][arg1 + 1] - local242);
			@Pc(293) float local293 = local260 + local213 * (this.aFloatArrayArray10[arg5 + 1][arg1 + 1] - local260);
			@Pc(311) float local311 = local251 + local213 * (this.aFloatArrayArray8[arg5 + 1][arg1 + 1] - local251);
			@Pc(326) float local326 = local228 + local213 * (this.aFloatArrayArray8[arg5][arg1 + 1] - local228);
			local335 = this.aFloatArrayArray9[arg5 + 1][arg1];
			@Pc(350) float local350 = local235 + local213 * (this.aFloatArrayArray10[arg5][arg1 + 1] - local235);
			@Pc(368) float local368 = local335 + local213 * (this.aFloatArrayArray9[arg5 + 1][arg1 + 1] - local335);
			local125 = local221 * (local293 - local350) + local350;
			local111 = local221 * (local311 - local326) + local326;
			local118 = local221 * (local368 - local275) + local275;
		}
		local213 = this.aClass6_Sub25_2.method6405() - local15;
		local221 = this.aClass6_Sub25_2.method6402() - local29;
		local228 = this.aClass6_Sub25_2.method6400() - local23;
		local235 = (float) Math.sqrt((double) (local228 * local228 + local221 * local221 + local213 * local213));
		local242 = 1.0F / local235;
		local228 *= local242;
		local221 *= local242;
		local213 *= local242;
		local251 = local235 / (float) this.aClass6_Sub25_2.method6398();
		local260 = 1.0F - local251 * local251;
		if (local260 < 0.0F) {
			local260 = 0.0F;
		}
		local335 = local118 * local228 + local111 * local213 + local221 * local125;
		if (local335 < 0.0F) {
			local335 = 0.0F;
		}
		@Pc(559) float local559 = local335 * local260 * 2.0F;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass6_Sub25_2.method6409(true);
		@Pc(580) int local580 = (int) ((float) (local570 >> 16 & 0xFF) * local559);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(597) int local597 = (int) ((float) (local570 >> 8 & 0xFF) * local559);
		if (local597 > 255) {
			local597 = 255;
		}
		@Pc(610) int local610 = (int) ((float) (local570 & 0xFF) * local559);
		if (Stream.a()) {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local29);
			this.aStream4.a((float) local23);
		} else {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local29);
			this.aStream4.b((float) local23);
		}
		if (local610 > 255) {
			local610 = 255;
		}
		if (this.aClass90_Sub3_8.anInt9561 == 0) {
			this.aStream4.c(local610);
			this.aStream4.c(local597);
			this.aStream4.c(local580);
		} else {
			this.aStream4.c(local580);
			this.aStream4.c(local597);
			this.aStream4.c(local610);
		}
		this.aStream4.c(255);
		this.method5032(local81);
	}
}
