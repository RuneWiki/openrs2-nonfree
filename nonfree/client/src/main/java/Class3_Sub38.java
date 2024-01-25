import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	private int anInt5712;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "Lclient!ew;")
	private final Class21_Sub3 aClass21_Sub3_2;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_15;

	@OriginalMember(owner = "client!lo", name = "E", descriptor = "Lclient!uca;")
	private final Class3_Sub15 aClass3_Sub15_1;

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
	private final int anInt5715;

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
	private final int anInt5717;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	private final int anInt5718;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	private final int anInt5710;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	private int anInt5711;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Lclient!ee;")
	private Class83 aClass83_23;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!oh;")
	private final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!id;")
	private final Interface15 anInterface15_7;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ai;Lclient!ew;Lclient!uca;[I)V")
	public Class3_Sub38(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class21_Sub3 arg1, @OriginalArg(2) Class3_Sub15 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass21_Sub3_2 = arg1;
		this.aClass13_Sub1_15 = arg0;
		this.aClass3_Sub15_1 = arg2;
		@Pc(23) int local23 = this.aClass3_Sub15_1.method8378() - (arg1.anInt9123 >> 1);
		this.anInt5715 = this.aClass3_Sub15_1.method8384() - local23 >> arg1.anInt9125;
		this.anInt5717 = this.aClass3_Sub15_1.method8384() + local23 >> arg1.anInt9125;
		this.anInt5718 = this.aClass3_Sub15_1.method8383() - local23 >> arg1.anInt9125;
		this.anInt5710 = this.aClass3_Sub15_1.method8383() + local23 >> arg1.anInt9125;
		@Pc(78) int local78 = this.anInt5717 + 1 - this.anInt5715;
		@Pc(87) int local87 = this.anInt5710 + 1 - this.anInt5718;
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray10 = new float[local78 + 1][local87 + 1];
		@Pc(124) int local124;
		@Pc(142) int local142;
		@Pc(149) int local149;
		@Pc(178) int local178;
		@Pc(195) int local195;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local124 = local116 + this.anInt5718;
			if (local124 > 0 && this.aClass21_Sub3_2.anInt9128 - 1 > local124) {
				for (local142 = 0; local142 <= local78; local142++) {
					local149 = local142 + this.anInt5715;
					if (local149 > 0 && local149 < this.aClass21_Sub3_2.anInt9129 - 1) {
						local178 = arg1.method7973(local149 + 1, local124) - arg1.method7973(local149 - 1, local124);
						local195 = arg1.method7973(local149, local124 + 1) - arg1.method7973(local149, local124 - 1);
						@Pc(211) float local211 = (float) (1.0D / Math.sqrt((double) (local178 * local178 + local195 * local195 + 65536)));
						this.aFloatArrayArray8[local142][local116] = local211 * (float) local178;
						this.aFloatArrayArray10[local142][local116] = -256.0F * local211;
						this.aFloatArrayArray9[local142][local116] = (float) local195 * local211;
					}
				}
			}
		}
		local124 = 0;
		@Pc(309) int local309;
		for (local142 = this.anInt5718; local142 <= this.anInt5710; local142++) {
			if (local142 >= 0 && arg1.anInt9128 > local142) {
				for (local149 = this.anInt5715; local149 <= this.anInt5717; local149++) {
					if (local149 >= 0 && arg1.anInt9129 > local149) {
						local178 = arg3[local124];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray14[local149][local142];
						if (local298 != null && local178 != 0) {
							if (local178 == 1) {
								local309 = 0;
								while (local309 < local298.length) {
									if (local298[local309++] != -1 && local298[local309++] != -1 && local298[local309++] != -1) {
										this.anInt5711 += 3;
									}
								}
							} else {
								this.anInt5711 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt5717 - this.anInt5715;
			}
		}
		if (this.anInt5711 > 0) {
			this.aClass83_23 = new Class83(Static282.method4521(this.anInt5711));
			this.anInterface20_3 = this.aClass13_Sub1_15.method7435(false);
			this.anInterface20_3.method8740(this.anInt5711);
			@Pc(408) NativeHeapBuffer local408 = this.aClass13_Sub1_15.method7466(false, this.anInt5711 * 16);
			this.aStream3 = new Stream(local408);
			while (true) {
				@Pc(420) Buffer local420;
				do {
					local420 = this.anInterface20_3.method7828();
				} while (local420 == null);
				this.aStream4 = new Stream(local420);
				local195 = 0;
				local124 = 0;
				for (local309 = this.anInt5718; local309 <= this.anInt5710; local309++) {
					if (local309 >= 0 && arg1.anInt9128 > local309) {
						@Pc(456) int local456 = 0;
						for (@Pc(459) int local459 = this.anInt5715; local459 <= this.anInt5717; local459++) {
							if (local459 >= 0 && arg1.anInt9129 > local459) {
								@Pc(475) int local475 = arg3[local124];
								@Pc(482) int[] local482 = arg1.anIntArrayArrayArray14[local459][local309];
								if (local482 != null && local475 != 0) {
									if (local475 == 1) {
										@Pc(640) int[] local640 = arg1.anIntArrayArrayArray9[local459][local309];
										@Pc(647) int[] local647 = arg1.anIntArrayArrayArray13[local459][local309];
										@Pc(649) int local649 = 0;
										label119: while (true) {
											while (true) {
												if (local649 >= local482.length) {
													break label119;
												}
												if (local482[local649] == -1 || local482[local649 + 1] == -1 || local482[local649 + 2] == -1) {
													local649 += 3;
												} else {
													this.method5214(local456, local459, local195, local647[local649], local640[local649], local309);
													local649++;
													this.method5214(local456, local459, local195, local647[local649], local640[local649], local309);
													local649++;
													this.method5214(local456, local459, local195, local647[local649], local640[local649], local309);
													local649++;
												}
											}
										}
									} else if (local475 == 3) {
										this.method5214(local456, local459, local195, 0, 0, local309);
										this.method5214(local456, local459, local195, 0, arg1.anInt9123, local309);
										this.method5214(local456, local459, local195, arg1.anInt9123, 0, local309);
									} else if (local475 == 2) {
										this.method5214(local456, local459, local195, 0, arg1.anInt9123, local309);
										this.method5214(local456, local459, local195, arg1.anInt9123, arg1.anInt9123, local309);
										this.method5214(local456, local459, local195, 0, 0, local309);
									} else if (local475 == 5) {
										this.method5214(local456, local459, local195, arg1.anInt9123, arg1.anInt9123, local309);
										this.method5214(local456, local459, local195, arg1.anInt9123, 0, local309);
										this.method5214(local456, local459, local195, 0, arg1.anInt9123, local309);
									} else if (local475 == 4) {
										this.method5214(local456, local459, local195, arg1.anInt9123, 0, local309);
										this.method5214(local456, local459, local195, 0, 0, local309);
										this.method5214(local456, local459, local195, arg1.anInt9123, arg1.anInt9123, local309);
									}
								}
							}
							local456++;
							local124++;
						}
					} else {
						local124 += this.anInt5717 - this.anInt5715;
					}
					local195++;
				}
				this.aStream4.a();
				if (this.anInterface20_3.method7826()) {
					this.aStream3.a();
					this.anInterface15_7 = this.aClass13_Sub1_15.method7541(false);
					this.anInterface15_7.method8745(this.anInt5712 * 16, 16, local408);
					break;
				}
				this.aStream3.e(0);
				this.aClass83_23.method2374();
			}
		} else {
			this.anInterface15_7 = null;
			this.anInterface20_3 = null;
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray10 = this.aFloatArrayArray9 = null;
		this.aClass83_23 = null;
		this.aStream4 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([[ZIIII)V")
	public void method5212(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface20_3 == null || (arg1 + arg2 < this.anInt5715 || (arg2 - arg1 > this.anInt5717 || (this.anInt5718 > arg3 + arg1 || this.anInt5710 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt5718; local55 <= this.anInt5710; local55++) {
			for (@Pc(60) int local60 = this.anInt5715; local60 <= this.anInt5717; local60++) {
				@Pc(66) int local66 = local60 - arg2;
				@Pc(71) int local71 = local55 - arg3;
				if (-arg1 < local66 && arg1 > local66 && local71 > -arg1 && local71 < arg1 && arg0[local66 + arg1][local71 + arg1]) {
					this.aClass13_Sub1_15.method7483((byte) (int) (this.aClass3_Sub15_1.method8381() * 255.0F));
					this.aClass13_Sub1_15.method7423(this.anInterface15_7, 0);
					this.aClass13_Sub1_15.method7472(this.aClass13_Sub1_15.aClass233_22);
					this.aClass13_Sub1_15.method7424(this.anInt5711 / 3, 0, this.anInterface20_3, 0, this.anInt5712, Static413.aClass393_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIBI)V")
	private void method5214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg4 + (arg1 << this.aClass21_Sub3_2.anInt9125);
		@Pc(23) int local23 = (arg5 << this.aClass21_Sub3_2.anInt9125) + arg3;
		@Pc(30) int local30 = this.aClass21_Sub3_2.method7980(local23, local15);
		if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class3 local59 = this.aClass83_23.method2368(local7);
			if (local59 != null) {
				this.method5215(((Class3_Sub53) local59).aShort112);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt5712++;
		if (local7 != -1L) {
			this.aClass83_23.method2377(local7, new Class3_Sub53(local77));
		}
		@Pc(122) float local122;
		@Pc(108) float local108;
		@Pc(115) float local115;
		@Pc(263) float local263;
		@Pc(271) float local271;
		@Pc(278) float local278;
		@Pc(285) float local285;
		@Pc(292) float local292;
		@Pc(301) float local301;
		@Pc(310) float local310;
		@Pc(402) float local402;
		if (arg4 == 0 && arg3 == 0) {
			local108 = this.aFloatArrayArray10[arg0][arg2];
			local115 = this.aFloatArrayArray9[arg0][arg2];
			local122 = this.aFloatArrayArray8[arg0][arg2];
		} else if (arg4 == this.aClass21_Sub3_2.anInt9123 && arg3 == 0) {
			local122 = this.aFloatArrayArray8[arg0 + 1][arg2];
			local108 = this.aFloatArrayArray10[arg0 + 1][arg2];
			local115 = this.aFloatArrayArray9[arg0 + 1][arg2];
		} else if (arg4 == this.aClass21_Sub3_2.anInt9123 && arg3 == this.aClass21_Sub3_2.anInt9123) {
			local108 = this.aFloatArrayArray10[arg0 + 1][arg2 + 1];
			local122 = this.aFloatArrayArray8[arg0 + 1][arg2 + 1];
			local115 = this.aFloatArrayArray9[arg0 + 1][arg2 + 1];
		} else if (arg4 == 0 && arg3 == this.aClass21_Sub3_2.anInt9123) {
			local122 = this.aFloatArrayArray8[arg0][arg2 + 1];
			local108 = this.aFloatArrayArray10[arg0][arg2 + 1];
			local115 = this.aFloatArrayArray9[arg0][arg2 + 1];
		} else {
			local263 = (float) arg4 / (float) this.aClass21_Sub3_2.anInt9123;
			local271 = (float) arg3 / (float) this.aClass21_Sub3_2.anInt9123;
			local278 = this.aFloatArrayArray8[arg0][arg2];
			local285 = this.aFloatArrayArray10[arg0][arg2];
			local292 = this.aFloatArrayArray9[arg0][arg2];
			local301 = this.aFloatArrayArray8[arg0 + 1][arg2];
			local310 = this.aFloatArrayArray10[arg0 + 1][arg2];
			@Pc(326) float local326 = local292 + local263 * (this.aFloatArrayArray9[arg0][arg2 + 1] - local292);
			@Pc(341) float local341 = local285 + (this.aFloatArrayArray10[arg0][arg2 + 1] - local285) * local263;
			@Pc(359) float local359 = local310 + (this.aFloatArrayArray10[arg0 + 1][arg2 + 1] - local310) * local263;
			@Pc(377) float local377 = local301 + (this.aFloatArrayArray8[arg0 + 1][arg2 + 1] - local301) * local263;
			@Pc(393) float local393 = local278 + (this.aFloatArrayArray8[arg0][arg2 + 1] - local278) * local263;
			local402 = this.aFloatArrayArray9[arg0 + 1][arg2];
			local108 = (local359 - local341) * local271 + local341;
			local122 = local393 + local271 * (local377 - local393);
			@Pc(438) float local438 = local402 + local263 * (this.aFloatArrayArray9[arg0 + 1][arg2 + 1] - local402);
			local115 = local271 * (local438 - local326) + local326;
		}
		local263 = (float) (this.aClass3_Sub15_1.method8384() - local15);
		local271 = (float) (this.aClass3_Sub15_1.method8380() - local30);
		local278 = (float) (this.aClass3_Sub15_1.method8383() - local23);
		local285 = (float) Math.sqrt((double) (local278 * local278 + local263 * local263 + local271 * local271));
		local292 = 1.0F / local285;
		local263 *= local292;
		local271 *= local292;
		local278 *= local292;
		local301 = local285 / (float) this.aClass3_Sub15_1.method8378();
		local310 = 1.0F - local301 * local301;
		if (local310 < 0.0F) {
			local310 = 0.0F;
		}
		local402 = local271 * local108 + local122 * local263 + local115 * local278;
		if (local402 < 0.0F) {
			local402 = 0.0F;
		}
		@Pc(551) float local551 = local402 * 2.0F * local310;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass3_Sub15_1.method8377();
		@Pc(572) int local572 = (int) ((float) (local562 >> 16 & 0xFF) * local551);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(606) int local606 = (int) (local551 * (float) (local562 & 0xFF));
		if (Stream.c()) {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local30);
			this.aStream3.b((float) local23);
		} else {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local30);
			this.aStream3.a((float) local23);
		}
		if (local606 > 255) {
			local606 = 255;
		}
		if (this.aClass13_Sub1_15.anInt8623 == 0) {
			this.aStream3.a(local606);
			this.aStream3.a(local589);
			this.aStream3.a(local572);
		} else {
			this.aStream3.a(local572);
			this.aStream3.a(local589);
			this.aStream3.a(local606);
		}
		this.aStream3.a(255);
		this.method5215(local77);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(SI)V")
	private void method5215(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.b(arg0);
		} else {
			this.aStream4.c(arg0);
		}
	}
}
