import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!kga", name = "l", descriptor = "I")
	private int anInt5577;

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "Lclient!ek;")
	private final Class104_Sub1 aClass104_Sub1_3;

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "Lclient!bq;")
	private final Class3_Sub7 aClass3_Sub7_3;

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "Lclient!sf;")
	private final Class16_Sub1 aClass16_Sub1_14;

	@OriginalMember(owner = "client!kga", name = "n", descriptor = "I")
	private final int anInt5579;

	@OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
	private final int anInt5583;

	@OriginalMember(owner = "client!kga", name = "m", descriptor = "I")
	private final int anInt5578;

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
	private final int anInt5586;

	@OriginalMember(owner = "client!kga", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!kga", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
	private int anInt5587;

	@OriginalMember(owner = "client!kga", name = "k", descriptor = "Lclient!cja;")
	private Class62 aClass62_27;

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "Lclient!ta;")
	private final Interface22 anInterface22_4;

	@OriginalMember(owner = "client!kga", name = "q", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!kga", name = "j", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!kga", name = "A", descriptor = "Lclient!mha;")
	private final Interface16 anInterface16_13;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!sf;Lclient!ek;Lclient!bq;[I)V")
	public Class3_Sub30(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class104_Sub1 arg1, @OriginalArg(2) Class3_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_Sub1_3 = arg1;
		this.aClass3_Sub7_3 = arg2;
		this.aClass16_Sub1_14 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub7_3.method6349() - (arg1.anInt9716 >> 1);
		this.anInt5579 = this.aClass3_Sub7_3.method6348() - local22 >> arg1.anInt9717;
		this.anInt5583 = local22 + this.aClass3_Sub7_3.method6348() >> arg1.anInt9717;
		this.anInt5578 = this.aClass3_Sub7_3.method6343() - local22 >> arg1.anInt9717;
		this.anInt5586 = this.aClass3_Sub7_3.method6343() + local22 >> arg1.anInt9717;
		@Pc(77) int local77 = this.anInt5583 + 1 - this.anInt5579;
		@Pc(86) int local86 = this.anInt5586 + 1 - this.anInt5578;
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt5578 + local115;
			if (local122 > 0 && local122 < this.aClass104_Sub1_3.anInt9715 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local147 = this.anInt5579 + local140;
					if (local147 > 0 && local147 < this.aClass104_Sub1_3.anInt9718 - 1) {
						local172 = arg1.method8279(local122, local147 + 1) - arg1.method8279(local122, local147 - 1);
						local189 = arg1.method8279(local122 + 1, local147) - arg1.method8279(local122 - 1, local147);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local189 * local189 + 65536)));
						this.aFloatArrayArray9[local140][local115] = local205 * (float) local172;
						this.aFloatArrayArray8[local140][local115] = -256.0F * local205;
						this.aFloatArrayArray10[local140][local115] = (float) local189 * local205;
					}
				}
			}
		}
		local122 = 0;
		@Pc(311) int local311;
		for (local140 = this.anInt5578; local140 <= this.anInt5586; local140++) {
			if (local140 >= 0 && arg1.anInt9715 > local140) {
				for (local147 = this.anInt5579; local147 <= this.anInt5583; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt9718) {
						local172 = arg3[local122];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray6[local147][local140];
						if (local289 != null && local172 != 0) {
							if (local172 == 1) {
								local311 = 0;
								while (local311 < local289.length) {
									if (local289[local311++] != -1 && local289[local311++] != -1 && local289[local311++] != -1) {
										this.anInt5587 += 3;
									}
								}
							} else {
								this.anInt5587 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt5583 - this.anInt5579;
			}
		}
		if (this.anInt5587 > 0) {
			this.aClass62_27 = new Class62(Static527.method7377(this.anInt5587));
			this.anInterface22_4 = this.aClass16_Sub1_14.method6262(false);
			this.anInterface22_4.method7734(this.anInt5587);
			@Pc(404) NativeHeapBuffer local404 = this.aClass16_Sub1_14.method6315(this.anInt5587 * 16, false);
			this.aStream6 = new Stream(local404);
			while (true) {
				@Pc(416) Buffer local416;
				do {
					local416 = this.anInterface22_4.method7739();
				} while (local416 == null);
				this.aStream5 = new Stream(local416);
				local189 = 0;
				local122 = 0;
				for (local311 = this.anInt5578; local311 <= this.anInt5586; local311++) {
					if (local311 >= 0 && arg1.anInt9715 > local311) {
						@Pc(452) int local452 = 0;
						for (@Pc(455) int local455 = this.anInt5579; local455 <= this.anInt5583; local455++) {
							if (local455 >= 0 && local455 < arg1.anInt9718) {
								@Pc(467) int local467 = arg3[local122];
								@Pc(474) int[] local474 = arg1.anIntArrayArrayArray6[local455][local311];
								if (local474 != null && local467 != 0) {
									if (local467 == 1) {
										@Pc(637) int[] local637 = arg1.anIntArrayArrayArray9[local455][local311];
										@Pc(644) int[] local644 = arg1.anIntArrayArrayArray7[local455][local311];
										@Pc(646) int local646 = 0;
										label117: while (true) {
											while (true) {
												if (local474.length <= local646) {
													break label117;
												}
												if (local474[local646] == -1 || local474[local646 + 1] == -1 || local474[local646 + 2] == -1) {
													local646 += 3;
												} else {
													this.method4711(local311, local644[local646], local452, local189, local637[local646], local455);
													local646++;
													this.method4711(local311, local644[local646], local452, local189, local637[local646], local455);
													local646++;
													this.method4711(local311, local644[local646], local452, local189, local637[local646], local455);
													local646++;
												}
											}
										}
									} else if (local467 == 3) {
										this.method4711(local311, 0, local452, local189, 0, local455);
										this.method4711(local311, 0, local452, local189, arg1.anInt9716, local455);
										this.method4711(local311, arg1.anInt9716, local452, local189, 0, local455);
									} else if (local467 == 2) {
										this.method4711(local311, 0, local452, local189, arg1.anInt9716, local455);
										this.method4711(local311, arg1.anInt9716, local452, local189, arg1.anInt9716, local455);
										this.method4711(local311, 0, local452, local189, 0, local455);
									} else if (local467 == 5) {
										this.method4711(local311, arg1.anInt9716, local452, local189, arg1.anInt9716, local455);
										this.method4711(local311, arg1.anInt9716, local452, local189, 0, local455);
										this.method4711(local311, 0, local452, local189, arg1.anInt9716, local455);
									} else if (local467 == 4) {
										this.method4711(local311, arg1.anInt9716, local452, local189, 0, local455);
										this.method4711(local311, 0, local452, local189, 0, local455);
										this.method4711(local311, arg1.anInt9716, local452, local189, arg1.anInt9716, local455);
									}
								}
							}
							local452++;
							local122++;
						}
					} else {
						local122 += this.anInt5583 - this.anInt5579;
					}
					local189++;
				}
				this.aStream5.b();
				if (this.anInterface22_4.method7738()) {
					this.aStream6.b();
					this.anInterface16_13 = this.aClass16_Sub1_14.method6244(false);
					this.anInterface16_13.method6038(local404, 16, this.anInt5577 * 16);
					break;
				}
				this.aStream6.b(0);
				this.aClass62_27.method1683();
			}
		} else {
			this.anInterface16_13 = null;
			this.anInterface22_4 = null;
		}
		this.aStream5 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray10 = null;
		this.aClass62_27 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(SI)V")
	private void method4708(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream5.e(arg0);
		} else {
			this.aStream5.a(arg0);
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "([[ZBIII)V")
	public void method4710(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface22_4 == null || (this.anInt5579 > arg3 + arg2 || (this.anInt5583 < arg2 - arg3 || (arg1 + arg3 < this.anInt5578 || arg1 - arg3 > this.anInt5586)))) {
			return;
		}
		for (@Pc(41) int local41 = this.anInt5578; local41 <= this.anInt5586; local41++) {
			for (@Pc(54) int local54 = this.anInt5579; local54 <= this.anInt5583; local54++) {
				@Pc(61) int local61 = local54 - arg2;
				@Pc(66) int local66 = local41 - arg1;
				if (local61 > -arg3 && local61 < arg3 && -arg3 < local66 && arg3 > local66 && arg0[local61 + arg3][arg3 + local66]) {
					this.aClass16_Sub1_14.method6324((byte) (int) (this.aClass3_Sub7_3.method6352() * 255.0F));
					this.aClass16_Sub1_14.method6257(0, this.anInterface16_13);
					this.aClass16_Sub1_14.method6287(this.aClass16_Sub1_14.aClass277_17);
					this.aClass16_Sub1_14.method6306(this.anInt5577, this.anInterface22_4, Static425.aClass44_5, this.anInt5587 / 3, 0, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IBIIIII)V")
	private void method4711(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass104_Sub1_3.anInt9717) + arg4;
		@Pc(23) int local23 = (arg0 << this.aClass104_Sub1_3.anInt9717) + arg1;
		@Pc(30) int local30 = this.aClass104_Sub1_3.method8286(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local23 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(58) Class3 local58 = this.aClass62_27.method1682(local7);
			if (local58 != null) {
				this.method4708(((Class3_Sub33) local58).aShort76);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt5577++;
		if (local7 != -1L) {
			this.aClass62_27.method1686(local7, new Class3_Sub33(local76));
		}
		@Pc(115) float local115;
		@Pc(122) float local122;
		@Pc(108) float local108;
		@Pc(200) float local200;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(290) float local290;
		if (arg4 == 0 && arg1 == 0) {
			local108 = this.aFloatArrayArray10[arg2][arg3];
			local115 = this.aFloatArrayArray9[arg2][arg3];
			local122 = this.aFloatArrayArray8[arg2][arg3];
		} else if (arg4 == this.aClass104_Sub1_3.anInt9716 && arg1 == 0) {
			local122 = this.aFloatArrayArray8[arg2 + 1][arg3];
			local108 = this.aFloatArrayArray10[arg2 + 1][arg3];
			local115 = this.aFloatArrayArray9[arg2 + 1][arg3];
		} else if (arg4 == this.aClass104_Sub1_3.anInt9716 && arg1 == this.aClass104_Sub1_3.anInt9716) {
			local122 = this.aFloatArrayArray8[arg2 + 1][arg3 + 1];
			local108 = this.aFloatArrayArray10[arg2 + 1][arg3 + 1];
			local115 = this.aFloatArrayArray9[arg2 + 1][arg3 + 1];
		} else if (arg4 == 0 && this.aClass104_Sub1_3.anInt9716 == arg1) {
			local108 = this.aFloatArrayArray10[arg2][arg3 + 1];
			local122 = this.aFloatArrayArray8[arg2][arg3 + 1];
			local115 = this.aFloatArrayArray9[arg2][arg3 + 1];
		} else {
			local200 = (float) arg4 / (float) this.aClass104_Sub1_3.anInt9716;
			local208 = (float) arg1 / (float) this.aClass104_Sub1_3.anInt9716;
			local215 = this.aFloatArrayArray9[arg2][arg3];
			local222 = this.aFloatArrayArray8[arg2][arg3];
			local229 = this.aFloatArrayArray10[arg2][arg3];
			local238 = this.aFloatArrayArray9[arg2 + 1][arg3];
			local247 = this.aFloatArrayArray8[arg2 + 1][arg3];
			@Pc(265) float local265 = local238 + local200 * (this.aFloatArrayArray9[arg2 + 1][arg3 + 1] - local238);
			@Pc(281) float local281 = local229 + (this.aFloatArrayArray10[arg2][arg3 + 1] - local229) * local200;
			local290 = this.aFloatArrayArray10[arg2 + 1][arg3];
			@Pc(307) float local307 = local247 + (this.aFloatArrayArray8[arg2 + 1][arg3 + 1] - local247) * local200;
			@Pc(322) float local322 = local222 + (this.aFloatArrayArray8[arg2][arg3 + 1] - local222) * local200;
			@Pc(338) float local338 = local215 + (this.aFloatArrayArray9[arg2][arg3 + 1] - local215) * local200;
			@Pc(356) float local356 = local290 + local200 * (this.aFloatArrayArray10[arg2 + 1][arg3 + 1] - local290);
			local115 = local208 * (local265 - local338) + local338;
			local122 = local208 * (local307 - local322) + local322;
			local108 = local208 * (local356 - local281) + local281;
		}
		local200 = (float) (this.aClass3_Sub7_3.method6348() - local15);
		local208 = (float) (this.aClass3_Sub7_3.method6346() - local30);
		local215 = (float) (this.aClass3_Sub7_3.method6343() - local23);
		local222 = (float) Math.sqrt((double) (local215 * local215 + local200 * local200 + local208 * local208));
		local229 = 1.0F / local222;
		local215 *= local229;
		local200 *= local229;
		local208 *= local229;
		local238 = local222 / (float) this.aClass3_Sub7_3.method6349();
		local247 = 1.0F - local238 * local238;
		if (local247 < 0.0F) {
			local247 = 0.0F;
		}
		local290 = local215 * local108 + local200 * local115 + local208 * local122;
		if (local290 < 0.0F) {
			local290 = 0.0F;
		}
		@Pc(552) float local552 = local247 * local290 * 2.0F;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass3_Sub7_3.method6351();
		@Pc(573) int local573 = (int) (local552 * (float) (local563 >> 16 & 0xFF));
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local563 >> 8 & 0xFF) * local552);
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(601) int local601 = (int) (local552 * (float) (local563 & 0xFF));
		if (Stream.c()) {
			this.aStream6.b((float) local15);
			this.aStream6.b((float) local30);
			this.aStream6.b((float) local23);
		} else {
			this.aStream6.a((float) local15);
			this.aStream6.a((float) local30);
			this.aStream6.a((float) local23);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		if (this.aClass16_Sub1_14.anInt7441 == 0) {
			this.aStream6.d(local601);
			this.aStream6.d(local588);
			this.aStream6.d(local573);
		} else {
			this.aStream6.d(local573);
			this.aStream6.d(local588);
			this.aStream6.d(local601);
		}
		this.aStream6.d(255);
		this.method4708(local76);
	}
}
