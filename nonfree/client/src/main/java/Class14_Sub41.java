import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class14_Sub41 extends Class14 {

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	private int anInt9236;

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "Lclient!he;")
	private final Class144_Sub1 aClass144_Sub1_22;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!rfa;")
	private final Class14_Sub18 aClass14_Sub18_3;

	@OriginalMember(owner = "client!sc", name = "G", descriptor = "Lclient!hn;")
	private final Class159_Sub1 aClass159_Sub1_3;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	private final int anInt9237;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	private final int anInt9240;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
	private final int anInt9235;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	private final int anInt9232;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
	private int anInt9239;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "Lclient!fm;")
	private final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!fea;")
	private final Interface7 anInterface7_16;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!fw;")
	private Class125 aClass125_37;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!he;Lclient!hn;Lclient!rfa;[I)V")
	public Class14_Sub41(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class159_Sub1 arg1, @OriginalArg(2) Class14_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass144_Sub1_22 = arg0;
		this.aClass14_Sub18_3 = arg2;
		this.aClass159_Sub1_3 = arg1;
		@Pc(23) int local23 = this.aClass14_Sub18_3.method8343() - (arg1.anInt9502 >> 1);
		this.anInt9237 = this.aClass14_Sub18_3.method8342() - local23 >> arg1.anInt9501;
		this.anInt9240 = this.aClass14_Sub18_3.method8342() + local23 >> arg1.anInt9501;
		this.anInt9235 = this.aClass14_Sub18_3.method8341() - local23 >> arg1.anInt9501;
		this.anInt9232 = this.aClass14_Sub18_3.method8341() + local23 >> arg1.anInt9501;
		@Pc(79) int local79 = this.anInt9240 + 1 - this.anInt9237;
		@Pc(88) int local88 = this.anInt9232 + 1 - this.anInt9235;
		this.aFloatArrayArray16 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray15 = new float[local79 + 1][local88 + 1];
		this.aFloatArrayArray17 = new float[local79 + 1][local88 + 1];
		@Pc(124) int local124;
		@Pc(144) int local144;
		@Pc(151) int local151;
		@Pc(181) int local181;
		@Pc(197) int local197;
		for (@Pc(117) int local117 = 0; local117 <= local88; local117++) {
			local124 = this.anInt9235 + local117;
			if (local124 > 0 && local124 < this.aClass159_Sub1_3.anInt9506 - 1) {
				for (local144 = 0; local144 <= local79; local144++) {
					local151 = this.anInt9237 + local144;
					if (local151 > 0 && local151 < this.aClass159_Sub1_3.anInt9504 - 1) {
						local181 = arg1.method8207(local124, local151 + 1) - arg1.method8207(local124, local151 - 1);
						local197 = arg1.method8207(local124 + 1, local151) - arg1.method8207(local124 - 1, local151);
						@Pc(212) float local212 = (float) (1.0D / Math.sqrt((double) (local197 * local197 + local181 * local181 + 65536)));
						this.aFloatArrayArray15[local144][local117] = (float) local181 * local212;
						this.aFloatArrayArray16[local144][local117] = local212 * -256.0F;
						this.aFloatArrayArray17[local144][local117] = local212 * (float) local197;
					}
				}
			}
		}
		local124 = 0;
		@Pc(330) int local330;
		for (local144 = this.anInt9235; local144 <= this.anInt9232; local144++) {
			if (local144 >= 0 && arg1.anInt9506 > local144) {
				for (local151 = this.anInt9237; local151 <= this.anInt9240; local151++) {
					if (local151 >= 0 && local151 < arg1.anInt9504) {
						local181 = arg3[local124];
						@Pc(304) int[] local304 = arg1.anIntArrayArrayArray4[local151][local144];
						if (local304 != null && local181 != 0) {
							if (local181 == 1) {
								local330 = 0;
								while (local330 < local304.length) {
									if (local304[local330++] != -1 && local304[local330++] != -1 && local304[local330++] != -1) {
										this.anInt9239 += 3;
									}
								}
							} else {
								this.anInt9239 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt9240 - this.anInt9237;
			}
		}
		if (this.anInt9239 <= 0) {
			this.anInterface8_5 = null;
			this.anInterface7_16 = null;
		} else {
			this.aClass125_37 = new Class125(Static255.method4294(this.anInt9239));
			this.anInterface8_5 = this.aClass144_Sub1_22.method5736(false);
			this.anInterface8_5.method5084(this.anInt9239);
			@Pc(451) NativeHeapBuffer local451 = this.aClass144_Sub1_22.method5647(false, this.anInt9239 * 16);
			this.aStream5 = new Stream(local451);
			while (true) {
				@Pc(463) Buffer local463;
				do {
					local463 = this.anInterface8_5.method5085();
				} while (local463 == null);
				this.aStream6 = new Stream(local463);
				local197 = 0;
				local124 = 0;
				for (local330 = this.anInt9235; local330 <= this.anInt9232; local330++) {
					if (local330 >= 0 && local330 < arg1.anInt9506) {
						@Pc(499) int local499 = 0;
						for (@Pc(502) int local502 = this.anInt9237; local502 <= this.anInt9240; local502++) {
							if (local502 >= 0 && arg1.anInt9504 > local502) {
								@Pc(521) int local521 = arg3[local124];
								@Pc(528) int[] local528 = arg1.anIntArrayArrayArray4[local502][local330];
								if (local528 != null && local521 != 0) {
									if (local521 == 1) {
										@Pc(707) int[] local707 = arg1.anIntArrayArrayArray5[local502][local330];
										@Pc(714) int[] local714 = arg1.anIntArrayArrayArray6[local502][local330];
										@Pc(716) int local716 = 0;
										label119: while (true) {
											while (true) {
												if (local528.length <= local716) {
													break label119;
												}
												if (local528[local716] == -1 || local528[local716 + 1] == -1 || local528[local716 + 2] == -1) {
													local716 += 3;
												} else {
													this.method7969(local499, local502, local714[local716], local330, local197, local707[local716]);
													local716++;
													this.method7969(local499, local502, local714[local716], local330, local197, local707[local716]);
													local716++;
													this.method7969(local499, local502, local714[local716], local330, local197, local707[local716]);
													local716++;
												}
											}
										}
									} else if (local521 == 3) {
										this.method7969(local499, local502, 0, local330, local197, 0);
										this.method7969(local499, local502, 0, local330, local197, arg1.anInt9502);
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, 0);
									} else if (local521 == 2) {
										this.method7969(local499, local502, 0, local330, local197, arg1.anInt9502);
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, arg1.anInt9502);
										this.method7969(local499, local502, 0, local330, local197, 0);
									} else if (local521 == 5) {
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, arg1.anInt9502);
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, 0);
										this.method7969(local499, local502, 0, local330, local197, arg1.anInt9502);
									} else if (local521 == 4) {
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, 0);
										this.method7969(local499, local502, 0, local330, local197, 0);
										this.method7969(local499, local502, arg1.anInt9502, local330, local197, arg1.anInt9502);
									}
								}
							}
							local124++;
							local499++;
						}
					} else {
						local124 += this.anInt9240 - this.anInt9237;
					}
					local197++;
				}
				this.aStream6.b();
				if (this.anInterface8_5.method5081()) {
					this.aStream5.b();
					this.anInterface7_16 = this.aClass144_Sub1_22.method5780(false);
					this.anInterface7_16.method5844(local451, this.anInt9236 * 16, 16);
					break;
				}
				this.aStream5.e(0);
				this.aClass125_37.method2628();
			}
		}
		this.aStream6 = null;
		this.aClass125_37 = null;
		this.aStream5 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray16 = this.aFloatArrayArray17 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([[ZBIII)V")
	public void method7967(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface8_5 == null || (arg3 + arg1 < this.anInt9237 || (arg1 - arg3 > this.anInt9240 || (this.anInt9235 > arg3 + arg2 || arg2 - arg3 > this.anInt9232)))) {
			return;
		}
		for (@Pc(69) int local69 = this.anInt9235; local69 <= this.anInt9232; local69++) {
			for (@Pc(74) int local74 = this.anInt9237; local74 <= this.anInt9240; local74++) {
				@Pc(80) int local80 = local74 - arg1;
				@Pc(84) int local84 = local69 - arg2;
				if (-arg3 < local80 && arg3 > local80 && -arg3 < local84 && local84 < arg3 && arg0[local80 + arg3][local84 + arg3]) {
					this.aClass144_Sub1_22.method5661((byte) (int) (this.aClass14_Sub18_3.method8339() * 255.0F));
					this.aClass144_Sub1_22.method5696(0, this.anInterface7_16);
					this.aClass144_Sub1_22.method5707(this.aClass144_Sub1_22.aClass119_19);
					this.aClass144_Sub1_22.method5746(this.anInt9239 / 3, 0, this.anInterface8_5, this.anInt9236, Static469.aClass213_46, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIIIII)V")
	private void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg1 << this.aClass159_Sub1_3.anInt9501);
		@Pc(24) int local24 = (arg3 << this.aClass159_Sub1_3.anInt9501) + arg2;
		@Pc(31) int local31 = this.aClass159_Sub1_3.method8209(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local16 & 0xFFFFL;
			@Pc(64) Class14 local64 = this.aClass125_37.method2630(local7);
			if (local64 != null) {
				this.method7971(((Class14_Sub33) local64).aShort72);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt9236++;
		if (local7 != -1L) {
			this.aClass125_37.method2626(new Class14_Sub33(local83), local7);
		}
		@Pc(130) float local130;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(244) float local244;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(266) float local266;
		@Pc(273) float local273;
		@Pc(282) float local282;
		@Pc(291) float local291;
		@Pc(317) float local317;
		if (arg5 == 0 && arg2 == 0) {
			local116 = this.aFloatArrayArray16[arg0][arg4];
			local123 = this.aFloatArrayArray17[arg0][arg4];
			local130 = this.aFloatArrayArray15[arg0][arg4];
		} else if (this.aClass159_Sub1_3.anInt9502 == arg5 && arg2 == 0) {
			local123 = this.aFloatArrayArray17[arg0 + 1][arg4];
			local130 = this.aFloatArrayArray15[arg0 + 1][arg4];
			local116 = this.aFloatArrayArray16[arg0 + 1][arg4];
		} else if (this.aClass159_Sub1_3.anInt9502 == arg5 && arg2 == this.aClass159_Sub1_3.anInt9502) {
			local123 = this.aFloatArrayArray17[arg0 + 1][arg4 + 1];
			local116 = this.aFloatArrayArray16[arg0 + 1][arg4 + 1];
			local130 = this.aFloatArrayArray15[arg0 + 1][arg4 + 1];
		} else if (arg5 == 0 && this.aClass159_Sub1_3.anInt9502 == arg2) {
			local130 = this.aFloatArrayArray15[arg0][arg4 + 1];
			local116 = this.aFloatArrayArray16[arg0][arg4 + 1];
			local123 = this.aFloatArrayArray17[arg0][arg4 + 1];
		} else {
			local244 = (float) arg5 / (float) this.aClass159_Sub1_3.anInt9502;
			local252 = (float) arg2 / (float) this.aClass159_Sub1_3.anInt9502;
			local259 = this.aFloatArrayArray15[arg0][arg4];
			local266 = this.aFloatArrayArray16[arg0][arg4];
			local273 = this.aFloatArrayArray17[arg0][arg4];
			local282 = this.aFloatArrayArray15[arg0 + 1][arg4];
			local291 = this.aFloatArrayArray16[arg0 + 1][arg4];
			@Pc(308) float local308 = local282 + local244 * (this.aFloatArrayArray15[arg0 + 1][arg4 + 1] - local282);
			local317 = this.aFloatArrayArray17[arg0 + 1][arg4];
			@Pc(333) float local333 = local266 + (this.aFloatArrayArray16[arg0][arg4 + 1] - local266) * local244;
			@Pc(348) float local348 = local259 + (this.aFloatArrayArray15[arg0][arg4 + 1] - local259) * local244;
			@Pc(365) float local365 = local291 + local244 * (this.aFloatArrayArray16[arg0 + 1][arg4 + 1] - local291);
			@Pc(380) float local380 = local273 + local244 * (this.aFloatArrayArray17[arg0][arg4 + 1] - local273);
			@Pc(397) float local397 = local317 + (this.aFloatArrayArray17[arg0 + 1][arg4 + 1] - local317) * local244;
			local116 = local252 * (local365 - local333) + local333;
			local130 = local252 * (local308 - local348) + local348;
			local123 = local252 * (local397 - local380) + local380;
		}
		local244 = (float) (this.aClass14_Sub18_3.method8342() - local16);
		local252 = (float) (this.aClass14_Sub18_3.method8344() - local31);
		local259 = (float) (this.aClass14_Sub18_3.method8341() - local24);
		local266 = (float) Math.sqrt((double) (local244 * local244 + local252 * local252 + local259 * local259));
		local273 = 1.0F / local266;
		local252 *= local273;
		local244 *= local273;
		local259 *= local273;
		local282 = local266 / (float) this.aClass14_Sub18_3.method8343();
		local291 = 1.0F - local282 * local282;
		if (local291 < 0.0F) {
			local291 = 0.0F;
		}
		local317 = local244 * local130 + local116 * local252 + local123 * local259;
		if (local317 < 0.0F) {
			local317 = 0.0F;
		}
		@Pc(559) float local559 = local291 * 2.0F * local317;
		if (local559 > 1.0F) {
			local559 = 1.0F;
		}
		@Pc(570) int local570 = this.aClass14_Sub18_3.method8345();
		@Pc(580) int local580 = (int) ((float) (local570 >> 16 & 0xFF) * local559);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) (local559 * (float) (local570 >> 8 & 0xFF));
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(608) int local608 = (int) (local559 * (float) (local570 & 0xFF));
		if (local608 > 255) {
			local608 = 255;
		}
		if (Stream.c()) {
			this.aStream5.b((float) local16);
			this.aStream5.b((float) local31);
			this.aStream5.b((float) local24);
		} else {
			this.aStream5.a((float) local16);
			this.aStream5.a((float) local31);
			this.aStream5.a((float) local24);
		}
		if (this.aClass144_Sub1_22.anInt6500 == 0) {
			this.aStream5.f(local608);
			this.aStream5.f(local595);
			this.aStream5.f(local580);
		} else {
			this.aStream5.f(local580);
			this.aStream5.f(local595);
			this.aStream5.f(local608);
		}
		this.aStream5.f(255);
		this.method7971(local83);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(SI)V")
	private void method7971(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream6.a(arg0);
		} else {
			this.aStream6.d(arg0);
		}
	}
}
