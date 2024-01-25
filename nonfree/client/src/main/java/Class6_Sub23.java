import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!go", name = "z", descriptor = "I")
	private int anInt3952;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!ow;")
	private final Class62_Sub3 aClass62_Sub3_1;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!od;")
	private final Class6_Sub29 aClass6_Sub29_1;

	@OriginalMember(owner = "client!go", name = "I", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_9;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "I")
	private final int anInt3953;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	private final int anInt3954;

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	private final int anInt3947;

	@OriginalMember(owner = "client!go", name = "w", descriptor = "I")
	private final int anInt3950;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!go", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!go", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!go", name = "B", descriptor = "Lclient!tj;")
	private final Interface21 anInterface21_4;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "Lclient!tfa;")
	private final Interface20 anInterface20_5;

	@OriginalMember(owner = "client!go", name = "F", descriptor = "Lclient!tq;")
	private Class305 aClass305_20;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!go", name = "J", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!fo;Lclient!ow;Lclient!od;[I)V")
	public Class6_Sub23(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class62_Sub3 arg1, @OriginalArg(2) Class6_Sub29 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass62_Sub3_1 = arg1;
		this.aClass6_Sub29_1 = arg2;
		this.aClass9_Sub3_9 = arg0;
		@Pc(22) int local22 = this.aClass6_Sub29_1.method6160() - (arg1.anInt9884 >> 1);
		this.anInt3953 = this.aClass6_Sub29_1.method6164() - local22 >> arg1.anInt9883;
		this.anInt3954 = this.aClass6_Sub29_1.method6164() + local22 >> arg1.anInt9883;
		this.anInt3947 = this.aClass6_Sub29_1.method6165() - local22 >> arg1.anInt9883;
		this.anInt3950 = local22 + this.aClass6_Sub29_1.method6165() >> arg1.anInt9883;
		@Pc(76) int local76 = this.anInt3954 + 1 - this.anInt3953;
		@Pc(85) int local85 = this.anInt3950 + 1 - this.anInt3947;
		this.aFloatArrayArray1 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(173) int local173;
		@Pc(188) int local188;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt3947;
			if (local122 > 0 && local122 < this.aClass62_Sub3_1.anInt9885 - 1) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = this.anInt3953 + local136;
					if (local143 > 0 && local143 < this.aClass62_Sub3_1.anInt9881 - 1) {
						local173 = arg1.JA(local143 + 1, local122) - arg1.JA(local143 - 1, local122);
						local188 = arg1.JA(local143, local122 + 1) - arg1.JA(local143, local122 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local173 * local173 + 65536)));
						this.aFloatArrayArray2[local136][local114] = (float) local173 * local203;
						this.aFloatArrayArray1[local136][local114] = local203 * -256.0F;
						this.aFloatArrayArray3[local136][local114] = local203 * (float) local188;
					}
				}
			}
		}
		local122 = 0;
		@Pc(307) int local307;
		for (local136 = this.anInt3947; local136 <= this.anInt3950; local136++) {
			if (local136 >= 0 && arg1.anInt9885 > local136) {
				for (local143 = this.anInt3953; local143 <= this.anInt3954; local143++) {
					if (local143 >= 0 && local143 < arg1.anInt9881) {
						local173 = arg3[local122];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray17[local143][local136];
						if (local290 != null && local173 != 0) {
							if (local173 == 1) {
								local307 = 0;
								while (local307 < local290.length) {
									if (local290[local307++] != -1 && local290[local307++] != -1 && local290[local307++] != -1) {
										this.anInt3951 += 3;
									}
								}
							} else {
								this.anInt3951 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt3954 - this.anInt3953;
			}
		}
		if (this.anInt3951 <= 0) {
			this.anInterface21_4 = null;
			this.anInterface20_5 = null;
		} else {
			this.aClass305_20 = new Class305(Static247.method4363(this.anInt3951));
			this.anInterface21_4 = this.aClass9_Sub3_9.method5550(false);
			this.anInterface21_4.method5022(this.anInt3951);
			@Pc(411) NativeHeapBuffer local411 = this.aClass9_Sub3_9.method5472(this.anInt3951 * 16, false);
			this.aStream3 = new Stream(local411);
			while (true) {
				@Pc(423) Buffer local423;
				do {
					local423 = this.anInterface21_4.method6521();
				} while (local423 == null);
				this.aStream4 = new Stream(local423);
				local122 = 0;
				local188 = 0;
				for (local307 = this.anInt3947; local307 <= this.anInt3950; local307++) {
					if (local307 >= 0 && local307 < arg1.anInt9885) {
						@Pc(451) int local451 = 0;
						for (@Pc(454) int local454 = this.anInt3953; local454 <= this.anInt3954; local454++) {
							if (local454 >= 0 && local454 < arg1.anInt9881) {
								@Pc(470) int local470 = arg3[local122];
								@Pc(477) int[] local477 = arg1.anIntArrayArrayArray17[local454][local307];
								if (local477 != null && local470 != 0) {
									if (local470 == 1) {
										@Pc(493) int[] local493 = arg1.anIntArrayArrayArray19[local454][local307];
										@Pc(500) int[] local500 = arg1.anIntArrayArrayArray16[local454][local307];
										@Pc(502) int local502 = 0;
										label120: while (true) {
											while (true) {
												if (local502 >= local477.length) {
													break label120;
												}
												if (local477[local502] == -1 || local477[local502 + 1] == -1 || local477[local502 + 2] == -1) {
													local502 += 3;
												} else {
													this.method3517(local451, local500[local502], local188, local454, local493[local502], local307);
													local502++;
													this.method3517(local451, local500[local502], local188, local454, local493[local502], local307);
													local502++;
													this.method3517(local451, local500[local502], local188, local454, local493[local502], local307);
													local502++;
												}
											}
										}
									} else if (local470 == 3) {
										this.method3517(local451, 0, local188, local454, 0, local307);
										this.method3517(local451, 0, local188, local454, arg1.anInt9884, local307);
										this.method3517(local451, arg1.anInt9884, local188, local454, 0, local307);
									} else if (local470 == 2) {
										this.method3517(local451, 0, local188, local454, arg1.anInt9884, local307);
										this.method3517(local451, arg1.anInt9884, local188, local454, arg1.anInt9884, local307);
										this.method3517(local451, 0, local188, local454, 0, local307);
									} else if (local470 == 5) {
										this.method3517(local451, arg1.anInt9884, local188, local454, arg1.anInt9884, local307);
										this.method3517(local451, arg1.anInt9884, local188, local454, 0, local307);
										this.method3517(local451, 0, local188, local454, arg1.anInt9884, local307);
									} else if (local470 == 4) {
										this.method3517(local451, arg1.anInt9884, local188, local454, 0, local307);
										this.method3517(local451, 0, local188, local454, 0, local307);
										this.method3517(local451, arg1.anInt9884, local188, local454, arg1.anInt9884, local307);
									}
								}
							}
							local451++;
							local122++;
						}
					} else {
						local122 += this.anInt3954 - this.anInt3953;
					}
					local188++;
				}
				this.aStream4.a();
				if (this.anInterface21_4.method6524()) {
					this.aStream3.a();
					this.anInterface20_5 = this.aClass9_Sub3_9.method5528(false);
					this.anInterface20_5.method6522(local411, 16, this.anInt3952 * 16);
					break;
				}
				this.aStream3.a(0);
				this.aClass305_20.method7440();
			}
		}
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
		this.aStream3 = null;
		this.aStream4 = null;
		this.aClass305_20 = null;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BS)V")
	private void method3514(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream4.c(arg0);
		} else {
			this.aStream4.d(arg0);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIZI[[Z)V")
	public void method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface21_4 == null || (this.anInt3953 > arg0 + arg2 || (arg0 - arg2 > this.anInt3954 || (arg1 + arg2 < this.anInt3947 || this.anInt3950 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(45) int local45 = this.anInt3947; local45 <= this.anInt3950; local45++) {
			for (@Pc(50) int local50 = this.anInt3953; local50 <= this.anInt3954; local50++) {
				@Pc(57) int local57 = local50 - arg0;
				@Pc(61) int local61 = local45 - arg1;
				if (local57 > -arg2 && local57 < arg2 && -arg2 < local61 && arg2 > local61 && arg3[arg2 + local57][local61 + arg2]) {
					this.aClass9_Sub3_9.method5574((byte) (this.aClass6_Sub29_1.method6158() * 255.0F));
					this.aClass9_Sub3_9.method5513(0, this.anInterface20_5);
					this.aClass9_Sub3_9.method5535(this.aClass9_Sub3_9.aClass88_15);
					this.aClass9_Sub3_9.method5539(0, 0, Static492.aClass328_6, this.anInterface21_4, this.anInt3951 / 3, this.anInt3952);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIII)V")
	private void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass62_Sub3_1.anInt9883) + arg4;
		@Pc(23) int local23 = (arg5 << this.aClass62_Sub3_1.anInt9883) + arg1;
		@Pc(29) int local29 = this.aClass62_Sub3_1.sa(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(57) Class6 local57 = this.aClass305_20.method7447(local7);
			if (local57 != null) {
				this.method3514(((Class6_Sub16) local57).aShort28);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt3952++;
		if (local7 != -1L) {
			this.aClass305_20.method7448(local7, new Class6_Sub16(local75));
		}
		@Pc(136) float local136;
		@Pc(127) float local127;
		@Pc(118) float local118;
		@Pc(201) float local201;
		@Pc(209) float local209;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(239) float local239;
		@Pc(248) float local248;
		@Pc(289) float local289;
		if (arg4 == 0 && arg1 == 0) {
			local136 = this.aFloatArrayArray2[arg0][arg2];
			local118 = this.aFloatArrayArray3[arg0][arg2];
			local127 = this.aFloatArrayArray1[arg0][arg2];
		} else if (this.aClass62_Sub3_1.anInt9884 == arg4 && arg1 == 0) {
			local118 = this.aFloatArrayArray3[arg0 + 1][arg2];
			local127 = this.aFloatArrayArray1[arg0 + 1][arg2];
			local136 = this.aFloatArrayArray2[arg0 + 1][arg2];
		} else if (arg4 == this.aClass62_Sub3_1.anInt9884 && this.aClass62_Sub3_1.anInt9884 == arg1) {
			local136 = this.aFloatArrayArray2[arg0 + 1][arg2 + 1];
			local127 = this.aFloatArrayArray1[arg0 + 1][arg2 + 1];
			local118 = this.aFloatArrayArray3[arg0 + 1][arg2 + 1];
		} else if (arg4 == 0 && this.aClass62_Sub3_1.anInt9884 == arg1) {
			local118 = this.aFloatArrayArray3[arg0][arg2 + 1];
			local136 = this.aFloatArrayArray2[arg0][arg2 + 1];
			local127 = this.aFloatArrayArray1[arg0][arg2 + 1];
		} else {
			local201 = (float) arg4 / (float) this.aClass62_Sub3_1.anInt9884;
			local209 = (float) arg1 / (float) this.aClass62_Sub3_1.anInt9884;
			local216 = this.aFloatArrayArray2[arg0][arg2];
			local223 = this.aFloatArrayArray1[arg0][arg2];
			local230 = this.aFloatArrayArray3[arg0][arg2];
			local239 = this.aFloatArrayArray2[arg0 + 1][arg2];
			local248 = this.aFloatArrayArray1[arg0 + 1][arg2];
			@Pc(263) float local263 = local230 + local201 * (this.aFloatArrayArray3[arg0][arg2 + 1] - local230);
			@Pc(280) float local280 = local239 + local201 * (this.aFloatArrayArray2[arg0 + 1][arg2 + 1] - local239);
			local289 = this.aFloatArrayArray3[arg0 + 1][arg2];
			@Pc(304) float local304 = local216 + local201 * (this.aFloatArrayArray2[arg0][arg2 + 1] - local216);
			@Pc(319) float local319 = local223 + local201 * (this.aFloatArrayArray1[arg0][arg2 + 1] - local223);
			@Pc(337) float local337 = local248 + (this.aFloatArrayArray1[arg0 + 1][arg2 + 1] - local248) * local201;
			local127 = local209 * (local337 - local319) + local319;
			@Pc(362) float local362 = local289 + (this.aFloatArrayArray3[arg0 + 1][arg2 + 1] - local289) * local201;
			local136 = local304 + (local280 - local304) * local209;
			local118 = local209 * (local362 - local263) + local263;
		}
		local201 = this.aClass6_Sub29_1.method6164() - local15;
		local209 = this.aClass6_Sub29_1.method6161() - local29;
		local216 = this.aClass6_Sub29_1.method6165() - local23;
		local223 = (float) Math.sqrt((double) (local201 * local201 + local209 * local209 + local216 * local216));
		local230 = 1.0F / local223;
		local201 *= local230;
		local209 *= local230;
		local216 *= local230;
		local239 = local223 / (float) this.aClass6_Sub29_1.method6160();
		local248 = 1.0F - local239 * local239;
		if (local248 < 0.0F) {
			local248 = 0.0F;
		}
		local289 = local118 * local216 + local136 * local201 + local209 * local127;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		@Pc(535) float local535 = local289 * 2.0F * local248;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(546) int local546 = this.aClass6_Sub29_1.method6157();
		@Pc(556) int local556 = (int) ((float) (local546 >> 16 & 0xFF) * local535);
		if (local556 > 255) {
			local556 = 255;
		}
		@Pc(571) int local571 = (int) (local535 * (float) (local546 >> 8 & 0xFF));
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local546 & 0xFF) * local535);
		if (Stream.c()) {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local29);
			this.aStream3.a((float) local23);
		} else {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local29);
			this.aStream3.b((float) local23);
		}
		if (local586 > 255) {
			local586 = 255;
		}
		if (this.aClass9_Sub3_9.anInt6542 == 0) {
			this.aStream3.f(local586);
			this.aStream3.f(local571);
			this.aStream3.f(local556);
		} else {
			this.aStream3.f(local556);
			this.aStream3.f(local571);
			this.aStream3.f(local586);
		}
		this.aStream3.f(255);
		this.method3514(local75);
	}
}
