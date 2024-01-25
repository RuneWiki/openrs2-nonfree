import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
	private int anInt4154;

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "Lclient!hm;")
	private final Class127_Sub1 aClass127_Sub1_2;

	@OriginalMember(owner = "client!hea", name = "A", descriptor = "Lclient!cp;")
	private final Class3_Sub9 aClass3_Sub9_1;

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_6;

	@OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
	private final int anInt4158;

	@OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
	private final int anInt4156;

	@OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
	private final int anInt4153;

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
	private final int anInt4150;

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hea", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!hea", name = "M", descriptor = "Lclient!sba;")
	private Class297 aClass297_14;

	@OriginalMember(owner = "client!hea", name = "r", descriptor = "Lclient!bo;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!hea", name = "L", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!hea", name = "H", descriptor = "Lclient!og;")
	private final Interface15 anInterface15_6;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!rr;Lclient!hm;Lclient!cp;[I)V")
	public Class3_Sub25(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class127_Sub1 arg1, @OriginalArg(2) Class3_Sub9 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass127_Sub1_2 = arg1;
		this.aClass3_Sub9_1 = arg2;
		this.aClass31_Sub1_6 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub9_1.method6000() - (arg1.anInt10009 >> 1);
		this.anInt4158 = this.aClass3_Sub9_1.method5997() - local23 >> arg1.anInt10008;
		this.anInt4156 = local23 + this.aClass3_Sub9_1.method5997() >> arg1.anInt10008;
		this.anInt4153 = this.aClass3_Sub9_1.method5999() - local23 >> arg1.anInt10008;
		this.anInt4150 = local23 + this.aClass3_Sub9_1.method5999() >> arg1.anInt10008;
		@Pc(77) int local77 = this.anInt4156 + 1 - this.anInt4158;
		@Pc(86) int local86 = this.anInt4150 + 1 - this.anInt4153;
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray5 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(172) int local172;
		@Pc(188) int local188;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt4153 + local115;
			if (local122 > 0 && local122 < this.aClass127_Sub1_2.anInt10007 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local147 = this.anInt4158 + local140;
					if (local147 > 0 && local147 < this.aClass127_Sub1_2.anInt10004 - 1) {
						local172 = arg1.method7862(local122, local147 + 1) - arg1.method7862(local122, local147 - 1);
						local188 = arg1.method7862(local122 + 1, local147) - arg1.method7862(local122 - 1, local147);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local172 * local172 + 65536)));
						this.aFloatArrayArray4[local140][local115] = local203 * (float) local172;
						this.aFloatArrayArray5[local140][local115] = local203 * -256.0F;
						this.aFloatArrayArray3[local140][local115] = local203 * (float) local188;
					}
				}
			}
		}
		local122 = 0;
		@Pc(304) int local304;
		for (local140 = this.anInt4153; local140 <= this.anInt4150; local140++) {
			if (local140 >= 0 && arg1.anInt10007 > local140) {
				for (local147 = this.anInt4158; local147 <= this.anInt4156; local147++) {
					if (local147 >= 0 && arg1.anInt10004 > local147) {
						local172 = arg3[local122];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray4[local147][local140];
						if (local290 != null && local172 != 0) {
							if (local172 == 1) {
								local304 = 0;
								while (local304 < local290.length) {
									if (local290[local304++] != -1 && local290[local304++] != -1 && local290[local304++] != -1) {
										this.anInt4152 += 3;
									}
								}
							} else {
								this.anInt4152 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt4156 - this.anInt4158;
			}
		}
		if (this.anInt4152 > 0) {
			this.aClass297_14 = new Class297(Static538.method7366(this.anInt4152));
			this.anInterface2_3 = this.aClass31_Sub1_6.method7158(false);
			this.anInterface2_3.method7282(this.anInt4152);
			@Pc(404) NativeHeapBuffer local404 = this.aClass31_Sub1_6.method7150(false, this.anInt4152 * 16);
			this.aStream5 = new Stream(local404);
			while (true) {
				@Pc(416) Buffer local416;
				do {
					local416 = this.anInterface2_3.method7292();
				} while (local416 == null);
				this.aStream4 = new Stream(local416);
				local188 = 0;
				local122 = 0;
				for (local304 = this.anInt4153; local304 <= this.anInt4150; local304++) {
					if (local304 >= 0 && local304 < arg1.anInt10007) {
						@Pc(448) int local448 = 0;
						for (@Pc(451) int local451 = this.anInt4158; local451 <= this.anInt4156; local451++) {
							if (local451 >= 0 && arg1.anInt10004 > local451) {
								@Pc(463) int local463 = arg3[local122];
								@Pc(470) int[] local470 = arg1.anIntArrayArrayArray4[local451][local304];
								if (local470 != null && local463 != 0) {
									if (local463 == 1) {
										@Pc(484) int[] local484 = arg1.anIntArrayArrayArray6[local451][local304];
										@Pc(491) int[] local491 = arg1.anIntArrayArrayArray7[local451][local304];
										@Pc(493) int local493 = 0;
										label120: while (true) {
											while (true) {
												if (local470.length <= local493) {
													break label120;
												}
												if (local470[local493] == -1 || local470[local493 + 1] == -1 || local470[local493 + 2] == -1) {
													local493 += 3;
												} else {
													this.method3361(local451, local188, local448, local491[local493], local304, local484[local493]);
													local493++;
													this.method3361(local451, local188, local448, local491[local493], local304, local484[local493]);
													local493++;
													this.method3361(local451, local188, local448, local491[local493], local304, local484[local493]);
													local493++;
												}
											}
										}
									} else if (local463 == 3) {
										this.method3361(local451, local188, local448, 0, local304, 0);
										this.method3361(local451, local188, local448, 0, local304, arg1.anInt10009);
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, 0);
									} else if (local463 == 2) {
										this.method3361(local451, local188, local448, 0, local304, arg1.anInt10009);
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, arg1.anInt10009);
										this.method3361(local451, local188, local448, 0, local304, 0);
									} else if (local463 == 5) {
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, arg1.anInt10009);
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, 0);
										this.method3361(local451, local188, local448, 0, local304, arg1.anInt10009);
									} else if (local463 == 4) {
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, 0);
										this.method3361(local451, local188, local448, 0, local304, 0);
										this.method3361(local451, local188, local448, arg1.anInt10009, local304, arg1.anInt10009);
									}
								}
							}
							local448++;
							local122++;
						}
					} else {
						local122 += this.anInt4156 - this.anInt4158;
					}
					local188++;
				}
				this.aStream4.c();
				if (this.anInterface2_3.method7291()) {
					this.aStream5.c();
					this.anInterface15_6 = this.aClass31_Sub1_6.method7132(false);
					this.anInterface15_6.method5278(local404, 16, this.anInt4154 * 16);
					break;
				}
				this.aStream5.a(0);
				this.aClass297_14.method6535();
			}
		} else {
			this.anInterface15_6 = null;
			this.anInterface2_3 = null;
		}
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray3 = null;
		this.aClass297_14 = null;
		this.aStream5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIII)V")
	private void method3361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass127_Sub1_2.anInt10008);
		@Pc(36) int local36 = arg3 + (arg4 << this.aClass127_Sub1_2.anInt10008);
		@Pc(43) int local43 = this.aClass127_Sub1_2.method7860(local36, local15);
		if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local36 << 16 & 0xFFFFL << 16;
			@Pc(74) Class3 local74 = this.aClass297_14.method6531(local7);
			if (local74 != null) {
				this.method3365(((Class3_Sub38) local74).aShort82);
				return;
			}
		}
		@Pc(92) short local92 = (short) this.anInt4154++;
		if (local7 != -1L) {
			this.aClass297_14.method6537(local7, new Class3_Sub38(local92));
		}
		@Pc(122) float local122;
		@Pc(129) float local129;
		@Pc(136) float local136;
		@Pc(211) float local211;
		@Pc(219) float local219;
		@Pc(226) float local226;
		@Pc(233) float local233;
		@Pc(240) float local240;
		@Pc(249) float local249;
		@Pc(258) float local258;
		@Pc(283) float local283;
		if (arg5 == 0 && arg3 == 0) {
			local122 = this.aFloatArrayArray4[arg2][arg1];
			local129 = this.aFloatArrayArray5[arg2][arg1];
			local136 = this.aFloatArrayArray3[arg2][arg1];
		} else if (arg5 == this.aClass127_Sub1_2.anInt10009 && arg3 == 0) {
			local136 = this.aFloatArrayArray3[arg2 + 1][arg1];
			local129 = this.aFloatArrayArray5[arg2 + 1][arg1];
			local122 = this.aFloatArrayArray4[arg2 + 1][arg1];
		} else if (arg5 == this.aClass127_Sub1_2.anInt10009 && arg3 == this.aClass127_Sub1_2.anInt10009) {
			local129 = this.aFloatArrayArray5[arg2 + 1][arg1 + 1];
			local136 = this.aFloatArrayArray3[arg2 + 1][arg1 + 1];
			local122 = this.aFloatArrayArray4[arg2 + 1][arg1 + 1];
		} else if (arg5 == 0 && this.aClass127_Sub1_2.anInt10009 == arg3) {
			local122 = this.aFloatArrayArray4[arg2][arg1 + 1];
			local136 = this.aFloatArrayArray3[arg2][arg1 + 1];
			local129 = this.aFloatArrayArray5[arg2][arg1 + 1];
		} else {
			local211 = (float) arg5 / (float) this.aClass127_Sub1_2.anInt10009;
			local219 = (float) arg3 / (float) this.aClass127_Sub1_2.anInt10009;
			local226 = this.aFloatArrayArray4[arg2][arg1];
			local233 = this.aFloatArrayArray5[arg2][arg1];
			local240 = this.aFloatArrayArray3[arg2][arg1];
			local249 = this.aFloatArrayArray4[arg2 + 1][arg1];
			local258 = this.aFloatArrayArray5[arg2 + 1][arg1];
			@Pc(274) float local274 = local226 + local211 * (this.aFloatArrayArray4[arg2][arg1 + 1] - local226);
			local283 = this.aFloatArrayArray3[arg2 + 1][arg1];
			@Pc(301) float local301 = local249 + local211 * (this.aFloatArrayArray4[arg2 + 1][arg1 + 1] - local249);
			@Pc(319) float local319 = local258 + local211 * (this.aFloatArrayArray5[arg2 + 1][arg1 + 1] - local258);
			@Pc(335) float local335 = local240 + (this.aFloatArrayArray3[arg2][arg1 + 1] - local240) * local211;
			@Pc(351) float local351 = local233 + local211 * (this.aFloatArrayArray5[arg2][arg1 + 1] - local233);
			@Pc(368) float local368 = local283 + (this.aFloatArrayArray3[arg2 + 1][arg1 + 1] - local283) * local211;
			local122 = local274 + local219 * (local301 - local274);
			local129 = local219 * (local319 - local351) + local351;
			local136 = local335 + (local368 - local335) * local219;
		}
		local211 = this.aClass3_Sub9_1.method5997() - local15;
		local219 = this.aClass3_Sub9_1.method5990() - local43;
		local226 = this.aClass3_Sub9_1.method5999() - local36;
		local233 = (float) Math.sqrt((double) (local211 * local211 + local219 * local219 + local226 * local226));
		local240 = 1.0F / local233;
		local211 *= local240;
		local219 *= local240;
		local226 *= local240;
		local249 = local233 / (float) this.aClass3_Sub9_1.method6000();
		local258 = 1.0F - local249 * local249;
		if (local258 < 0.0F) {
			local258 = 0.0F;
		}
		local283 = local122 * local211 + local129 * local219 + local226 * local136;
		if (local283 < 0.0F) {
			local283 = 0.0F;
		}
		@Pc(559) float local559 = local258 * local283 * 2.0F;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass3_Sub9_1.method5994();
		@Pc(580) int local580 = (int) ((float) (local570 >> 16 & 0xFF) * local559);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local570 >> 8 & 0xFF) * local559);
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(608) int local608 = (int) (local559 * (float) (local570 & 0xFF));
		if (Stream.a()) {
			this.aStream5.a((float) local15);
			this.aStream5.a((float) local43);
			this.aStream5.a((float) local36);
		} else {
			this.aStream5.b((float) local15);
			this.aStream5.b((float) local43);
			this.aStream5.b((float) local36);
		}
		if (local608 > 255) {
			local608 = 255;
		}
		if (this.aClass31_Sub1_6.anInt9122 == 0) {
			this.aStream5.f(local608);
			this.aStream5.f(local595);
			this.aStream5.f(local580);
		} else {
			this.aStream5.f(local580);
			this.aStream5.f(local595);
			this.aStream5.f(local608);
		}
		this.aStream5.f(255);
		this.method3365(local92);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIII[[Z)V")
	public void method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface2_3 == null || (arg0 + arg1 < this.anInt4158 || (this.anInt4156 < arg0 - arg1 || (arg2 + arg1 < this.anInt4153 || this.anInt4150 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt4153; local57 <= this.anInt4150; local57++) {
			for (@Pc(62) int local62 = this.anInt4158; local62 <= this.anInt4156; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local57 - arg2;
				if (local69 > -arg1 && local69 < arg1 && local74 > -arg1 && local74 < arg1 && arg3[arg1 + local69][local74 + arg1]) {
					this.aClass31_Sub1_6.method7077((byte) (this.aClass3_Sub9_1.method5996() * 255.0F));
					this.aClass31_Sub1_6.method7113(this.anInterface15_6, 0);
					this.aClass31_Sub1_6.method7149(this.aClass31_Sub1_6.aClass1_18);
					this.aClass31_Sub1_6.method7174(Static486.aClass265_10, this.anInt4154, this.anInterface2_3, 0, this.anInt4152 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BS)V")
	private void method3365(@OriginalArg(1) short arg0) {
		if (Stream.a()) {
			this.aStream4.e(arg0);
		} else {
			this.aStream4.c(arg0);
		}
	}
}
