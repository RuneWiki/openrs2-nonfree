import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class8_Sub12 extends Class8 {

	@OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
	private int anInt2028;

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_4;

	@OriginalMember(owner = "client!cfa", name = "l", descriptor = "Lclient!ada;")
	private final Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!cfa", name = "k", descriptor = "Lclient!um;")
	private final Class86_Sub3 aClass86_Sub3_1;

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
	private final int anInt2035;

	@OriginalMember(owner = "client!cfa", name = "A", descriptor = "I")
	private final int anInt2033;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!cfa", name = "x", descriptor = "I")
	private final int anInt2031;

	@OriginalMember(owner = "client!cfa", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!cfa", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
	private int anInt2032;

	@OriginalMember(owner = "client!cfa", name = "r", descriptor = "Lclient!kga;")
	private final Interface13 anInterface13_3;

	@OriginalMember(owner = "client!cfa", name = "t", descriptor = "Lclient!el;")
	private final Interface4 anInterface4_7;

	@OriginalMember(owner = "client!cfa", name = "q", descriptor = "Lclient!pfa;")
	private Class253 aClass253_4;

	@OriginalMember(owner = "client!cfa", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!cfa", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!ln;Lclient!um;Lclient!ada;[I)V")
	public Class8_Sub12(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class86_Sub3 arg1, @OriginalArg(2) Class8_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass16_Sub1_4 = arg0;
		this.aClass8_Sub1_1 = arg2;
		this.aClass86_Sub3_1 = arg1;
		@Pc(23) int local23 = this.aClass8_Sub1_1.method5200() - (arg1.anInt9958 >> 1);
		this.anInt2035 = this.aClass8_Sub1_1.method5206() - local23 >> arg1.anInt9954;
		this.anInt2033 = local23 + this.aClass8_Sub1_1.method5206() >> arg1.anInt9954;
		this.anInt2027 = this.aClass8_Sub1_1.method5207() - local23 >> arg1.anInt9954;
		this.anInt2031 = local23 + this.aClass8_Sub1_1.method5207() >> arg1.anInt9954;
		@Pc(78) int local78 = this.anInt2033 + 1 - this.anInt2035;
		@Pc(87) int local87 = this.anInt2031 + 1 - this.anInt2027;
		this.aFloatArrayArray4 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(174) int local174;
		@Pc(190) int local190;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt2027 + local116;
			if (local123 > 0 && local123 < this.aClass86_Sub3_1.anInt9953 - 1) {
				for (local138 = 0; local138 <= local78; local138++) {
					local145 = this.anInt2035 + local138;
					if (local145 > 0 && this.aClass86_Sub3_1.anInt9955 - 1 > local145) {
						local174 = arg1.method8086(local123, local145 + 1) - arg1.method8086(local123, local145 - 1);
						local190 = arg1.method8086(local123 + 1, local145) - arg1.method8086(local123 - 1, local145);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local174 * local174 + 65536)));
						this.aFloatArrayArray2[local138][local116] = local205 * (float) local174;
						this.aFloatArrayArray3[local138][local116] = local205 * -256.0F;
						this.aFloatArrayArray4[local138][local116] = local205 * (float) local190;
					}
				}
			}
		}
		local123 = 0;
		@Pc(321) int local321;
		for (local138 = this.anInt2027; local138 <= this.anInt2031; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt9953) {
				for (local145 = this.anInt2035; local145 <= this.anInt2033; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9955) {
						local174 = arg3[local123];
						@Pc(301) int[] local301 = arg1.anIntArrayArrayArray13[local145][local138];
						if (local301 != null && local174 != 0) {
							if (local174 == 1) {
								local321 = 0;
								while (local321 < local301.length) {
									if (local301[local321++] != -1 && local301[local321++] != -1 && local301[local321++] != -1) {
										this.anInt2032 += 3;
									}
								}
							} else {
								this.anInt2032 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt2033 - this.anInt2035;
			}
		}
		if (this.anInt2032 <= 0) {
			this.anInterface13_3 = null;
			this.anInterface4_7 = null;
		} else {
			this.aClass253_4 = new Class253(Static629.method8469(this.anInt2032));
			this.anInterface13_3 = this.aClass16_Sub1_4.method3917(false);
			this.anInterface13_3.method6500(this.anInt2032);
			@Pc(412) NativeHeapBuffer local412 = this.aClass16_Sub1_4.method3996(this.anInt2032 * 16, false);
			this.aStream3 = new Stream(local412);
			while (true) {
				@Pc(424) Buffer local424;
				do {
					local424 = this.anInterface13_3.method4654();
				} while (local424 == null);
				this.aStream4 = new Stream(local424);
				local190 = 0;
				local123 = 0;
				for (local321 = this.anInt2027; local321 <= this.anInt2031; local321++) {
					if (local321 >= 0 && arg1.anInt9953 > local321) {
						@Pc(449) int local449 = 0;
						for (@Pc(452) int local452 = this.anInt2035; local452 <= this.anInt2033; local452++) {
							if (local452 >= 0 && arg1.anInt9955 > local452) {
								@Pc(464) int local464 = arg3[local123];
								@Pc(471) int[] local471 = arg1.anIntArrayArrayArray13[local452][local321];
								if (local471 != null && local464 != 0) {
									if (local464 == 1) {
										@Pc(629) int[] local629 = arg1.anIntArrayArrayArray18[local452][local321];
										@Pc(636) int[] local636 = arg1.anIntArrayArrayArray14[local452][local321];
										@Pc(638) int local638 = 0;
										label117: while (true) {
											while (true) {
												if (local471.length <= local638) {
													break label117;
												}
												if (local471[local638] == -1 || local471[local638 + 1] == -1 || local471[local638 + 2] == -1) {
													local638 += 3;
												} else {
													this.method1735(local629[local638], local190, local449, local321, local636[local638], local452);
													local638++;
													this.method1735(local629[local638], local190, local449, local321, local636[local638], local452);
													local638++;
													this.method1735(local629[local638], local190, local449, local321, local636[local638], local452);
													local638++;
												}
											}
										}
									} else if (local464 == 3) {
										this.method1735(0, local190, local449, local321, 0, local452);
										this.method1735(arg1.anInt9958, local190, local449, local321, 0, local452);
										this.method1735(0, local190, local449, local321, arg1.anInt9958, local452);
									} else if (local464 == 2) {
										this.method1735(arg1.anInt9958, local190, local449, local321, 0, local452);
										this.method1735(arg1.anInt9958, local190, local449, local321, arg1.anInt9958, local452);
										this.method1735(0, local190, local449, local321, 0, local452);
									} else if (local464 == 5) {
										this.method1735(arg1.anInt9958, local190, local449, local321, arg1.anInt9958, local452);
										this.method1735(0, local190, local449, local321, arg1.anInt9958, local452);
										this.method1735(arg1.anInt9958, local190, local449, local321, 0, local452);
									} else if (local464 == 4) {
										this.method1735(0, local190, local449, local321, arg1.anInt9958, local452);
										this.method1735(0, local190, local449, local321, 0, local452);
										this.method1735(arg1.anInt9958, local190, local449, local321, arg1.anInt9958, local452);
									}
								}
							}
							local449++;
							local123++;
						}
					} else {
						local123 += this.anInt2033 - this.anInt2035;
					}
					local190++;
				}
				this.aStream4.b();
				if (this.anInterface13_3.method4655()) {
					this.aStream3.b();
					this.anInterface4_7 = this.aClass16_Sub1_4.method3988(false);
					this.anInterface4_7.method6504(local412, 16, this.anInt2028 * 16);
					break;
				}
				this.aStream3.a(0);
				this.aClass253_4.method6598();
			}
		}
		this.aStream4 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass253_4 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "([[ZIIII)V")
	public void method1732(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface13_3 == null || (arg2 + arg1 < this.anInt2035 || (arg1 - arg2 > this.anInt2033 || (arg2 + arg3 < this.anInt2027 || arg3 - arg2 > this.anInt2031)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt2027; local54 <= this.anInt2031; local54++) {
			for (@Pc(59) int local59 = this.anInt2035; local59 <= this.anInt2033; local59++) {
				@Pc(66) int local66 = local59 - arg1;
				@Pc(71) int local71 = local54 - arg3;
				if (-arg2 < local66 && local66 < arg2 && -arg2 < local71 && local71 < arg2 && arg0[arg2 + local66][arg2 + local71]) {
					this.aClass16_Sub1_4.method3949((byte) (this.aClass8_Sub1_1.method5205() * 255.0F));
					this.aClass16_Sub1_4.method3983(this.anInterface4_7, 0);
					this.aClass16_Sub1_4.method3967(this.aClass16_Sub1_4.aClass94_22);
					this.aClass16_Sub1_4.method3977(Static525.aClass342_3, this.anInterface13_3, 0, this.anInt2032 / 3, 0, this.anInt2028);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(SB)V")
	private void method1734(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.f(arg0);
		} else {
			this.aStream4.c(arg0);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIII)V")
	private void method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass86_Sub3_1.anInt9954) + arg0;
		@Pc(23) int local23 = (arg3 << this.aClass86_Sub3_1.anInt9954) + arg4;
		@Pc(30) int local30 = this.aClass86_Sub3_1.method8088(local23, local15);
		if ((arg0 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(59) Class8 local59 = this.aClass253_4.method6594(local7);
			if (local59 != null) {
				this.method1734(((Class8_Sub38) local59).aShort79);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt2028++;
		if (local7 != -1L) {
			this.aClass253_4.method6591(new Class8_Sub38(local77), local7);
		}
		@Pc(123) float local123;
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(203) float local203;
		@Pc(211) float local211;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(232) float local232;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(259) float local259;
		if (arg0 == 0 && arg4 == 0) {
			local109 = this.aFloatArrayArray4[arg2][arg1];
			local116 = this.aFloatArrayArray3[arg2][arg1];
			local123 = this.aFloatArrayArray2[arg2][arg1];
		} else if (this.aClass86_Sub3_1.anInt9958 == arg0 && arg4 == 0) {
			local116 = this.aFloatArrayArray3[arg2 + 1][arg1];
			local109 = this.aFloatArrayArray4[arg2 + 1][arg1];
			local123 = this.aFloatArrayArray2[arg2 + 1][arg1];
		} else if (arg0 == this.aClass86_Sub3_1.anInt9958 && arg4 == this.aClass86_Sub3_1.anInt9958) {
			local109 = this.aFloatArrayArray4[arg2 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray2[arg2 + 1][arg1 + 1];
			local116 = this.aFloatArrayArray3[arg2 + 1][arg1 + 1];
		} else if (arg0 == 0 && this.aClass86_Sub3_1.anInt9958 == arg4) {
			local116 = this.aFloatArrayArray3[arg2][arg1 + 1];
			local109 = this.aFloatArrayArray4[arg2][arg1 + 1];
			local123 = this.aFloatArrayArray2[arg2][arg1 + 1];
		} else {
			local203 = (float) arg0 / (float) this.aClass86_Sub3_1.anInt9958;
			local211 = (float) arg4 / (float) this.aClass86_Sub3_1.anInt9958;
			local218 = this.aFloatArrayArray2[arg2][arg1];
			local225 = this.aFloatArrayArray3[arg2][arg1];
			local232 = this.aFloatArrayArray4[arg2][arg1];
			local241 = this.aFloatArrayArray2[arg2 + 1][arg1];
			local250 = this.aFloatArrayArray3[arg2 + 1][arg1];
			local259 = this.aFloatArrayArray4[arg2 + 1][arg1];
			@Pc(275) float local275 = local232 + local203 * (this.aFloatArrayArray4[arg2][arg1 + 1] - local232);
			@Pc(292) float local292 = local250 + local203 * (this.aFloatArrayArray3[arg2 + 1][arg1 + 1] - local250);
			@Pc(309) float local309 = local241 + local203 * (this.aFloatArrayArray2[arg2 + 1][arg1 + 1] - local241);
			@Pc(325) float local325 = local218 + (this.aFloatArrayArray2[arg2][arg1 + 1] - local218) * local203;
			@Pc(341) float local341 = local225 + local203 * (this.aFloatArrayArray3[arg2][arg1 + 1] - local225);
			@Pc(359) float local359 = local259 + local203 * (this.aFloatArrayArray4[arg2 + 1][arg1 + 1] - local259);
			local116 = local341 + (local292 - local341) * local211;
			local123 = (local309 - local325) * local211 + local325;
			local109 = local211 * (local359 - local275) + local275;
		}
		local203 = this.aClass8_Sub1_1.method5206() - local15;
		local211 = this.aClass8_Sub1_1.method5198() - local30;
		local218 = this.aClass8_Sub1_1.method5207() - local23;
		local225 = (float) Math.sqrt((double) (local203 * local203 + local211 * local211 + local218 * local218));
		local232 = 1.0F / local225;
		local211 *= local232;
		local218 *= local232;
		local203 *= local232;
		local241 = local225 / (float) this.aClass8_Sub1_1.method5200();
		local250 = 1.0F - local241 * local241;
		if (local250 < 0.0F) {
			local250 = 0.0F;
		}
		local259 = local123 * local203 + local211 * local116 + local218 * local109;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		@Pc(550) float local550 = local250 * local259 * 2.0F;
		if (local550 > 1.0F) {
			local550 = 1.0F;
		}
		@Pc(561) int local561 = this.aClass8_Sub1_1.method5203();
		@Pc(571) int local571 = (int) (local550 * (float) (local561 >> 16 & 0xFF));
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local561 >> 8 & 0xFF) * local550);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) ((float) (local561 & 0xFF) * local550);
		if (Stream.c()) {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local30);
			this.aStream3.a((float) local23);
		} else {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local30);
			this.aStream3.b((float) local23);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		if (this.aClass16_Sub1_4.anInt4898 == 0) {
			this.aStream3.b(local601);
			this.aStream3.b(local586);
			this.aStream3.b(local571);
		} else {
			this.aStream3.b(local571);
			this.aStream3.b(local586);
			this.aStream3.b(local601);
		}
		this.aStream3.b(255);
		this.method1734(local77);
	}
}
