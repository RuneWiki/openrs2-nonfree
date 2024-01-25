import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
	private int anInt4767;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "Lclient!hj;")
	private final Class6_Sub7 aClass6_Sub7_3;

	@OriginalMember(owner = "client!lo", name = "B", descriptor = "Lclient!sv;")
	private final Class121_Sub2 aClass121_Sub2_11;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "Lclient!ua;")
	private final Class60_Sub3 aClass60_Sub3_2;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	private final int anInt4757;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	private final int anInt4759;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
	private final int anInt4765;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	private final int anInt4760;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private int anInt4763;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Lclient!nj;")
	private Class212 aClass212_21;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "Lclient!go;")
	private final Interface11 anInterface11_5;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!vp;")
	private final Interface23 anInterface23_6;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!sv;Lclient!ua;Lclient!hj;[I)V")
	public Class6_Sub33(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class60_Sub3 arg1, @OriginalArg(2) Class6_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass6_Sub7_3 = arg2;
		this.aClass121_Sub2_11 = arg0;
		this.aClass60_Sub3_2 = arg1;
		@Pc(23) int local23 = this.aClass6_Sub7_3.method3487() - (arg1.anInt9652 >> 1);
		this.anInt4757 = this.aClass6_Sub7_3.method3490() - local23 >> arg1.anInt9654;
		this.anInt4759 = local23 + this.aClass6_Sub7_3.method3490() >> arg1.anInt9654;
		this.anInt4765 = this.aClass6_Sub7_3.method3492() - local23 >> arg1.anInt9654;
		this.anInt4760 = local23 + this.aClass6_Sub7_3.method3492() >> arg1.anInt9654;
		@Pc(78) int local78 = this.anInt4759 + 1 - this.anInt4757;
		@Pc(87) int local87 = this.anInt4760 + 1 - this.anInt4765;
		this.aFloatArrayArray10 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(193) int local193;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt4765 + local116;
			if (local123 > 0 && local123 < this.aClass60_Sub3_2.anInt9657 - 1) {
				for (local141 = 0; local141 <= local78; local141++) {
					local148 = this.anInt4757 + local141;
					if (local148 > 0 && this.aClass60_Sub3_2.anInt9656 - 1 > local148) {
						local178 = arg1.JA(local148 + 1, local123) - arg1.JA(local148 - 1, local123);
						local193 = arg1.JA(local148, local123 + 1) - arg1.JA(local148, local123 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local178 * local178 + local193 * local193 + 65536)));
						this.aFloatArrayArray11[local141][local116] = local209 * (float) local178;
						this.aFloatArrayArray9[local141][local116] = -256.0F * local209;
						this.aFloatArrayArray10[local141][local116] = (float) local193 * local209;
					}
				}
			}
		}
		local123 = 0;
		@Pc(295) int local295;
		for (local141 = this.anInt4765; local141 <= this.anInt4760; local141++) {
			if (local141 >= 0 && local141 < arg1.anInt9657) {
				for (local148 = this.anInt4757; local148 <= this.anInt4759; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt9656) {
						local178 = arg3[local123];
						@Pc(284) int[] local284 = arg1.anIntArrayArrayArray24[local148][local141];
						if (local284 != null && local178 != 0) {
							if (local178 == 1) {
								local295 = 0;
								while (local284.length > local295) {
									if (local284[local295++] != -1 && local284[local295++] != -1 && local284[local295++] != -1) {
										this.anInt4763 += 3;
									}
								}
							} else {
								this.anInt4763 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt4759 - this.anInt4757;
			}
		}
		if (this.anInt4763 > 0) {
			this.aClass212_21 = new Class212(Static516.method7313(this.anInt4763));
			this.anInterface11_5 = this.aClass121_Sub2_11.method7204(false);
			this.anInterface11_5.method7560(this.anInt4763);
			@Pc(404) NativeHeapBuffer local404 = this.aClass121_Sub2_11.method7205(false, this.anInt4763 * 16);
			this.aStream3 = new Stream(local404);
			while (true) {
				@Pc(416) Buffer local416;
				do {
					local416 = this.anInterface11_5.method7569();
				} while (local416 == null);
				this.aStream2 = new Stream(local416);
				local193 = 0;
				local123 = 0;
				for (local295 = this.anInt4765; local295 <= this.anInt4760; local295++) {
					if (local295 >= 0 && local295 < arg1.anInt9657) {
						@Pc(441) int local441 = 0;
						for (@Pc(444) int local444 = this.anInt4757; local444 <= this.anInt4759; local444++) {
							if (local444 >= 0 && arg1.anInt9656 > local444) {
								@Pc(459) int local459 = arg3[local123];
								@Pc(466) int[] local466 = arg1.anIntArrayArrayArray24[local444][local295];
								if (local466 != null && local459 != 0) {
									if (local459 == 1) {
										@Pc(483) int[] local483 = arg1.anIntArrayArrayArray23[local444][local295];
										@Pc(490) int[] local490 = arg1.anIntArrayArrayArray21[local444][local295];
										@Pc(492) int local492 = 0;
										label120: while (true) {
											while (true) {
												if (local492 >= local466.length) {
													break label120;
												}
												if (local466[local492] == -1 || local466[local492 + 1] == -1 || local466[local492 + 2] == -1) {
													local492 += 3;
												} else {
													this.method4102(local441, local444, local490[local492], local483[local492], local193, local295);
													local492++;
													this.method4102(local441, local444, local490[local492], local483[local492], local193, local295);
													local492++;
													this.method4102(local441, local444, local490[local492], local483[local492], local193, local295);
													local492++;
												}
											}
										}
									} else if (local459 == 3) {
										this.method4102(local441, local444, 0, 0, local193, local295);
										this.method4102(local441, local444, 0, arg1.anInt9652, local193, local295);
										this.method4102(local441, local444, arg1.anInt9652, 0, local193, local295);
									} else if (local459 == 2) {
										this.method4102(local441, local444, 0, arg1.anInt9652, local193, local295);
										this.method4102(local441, local444, arg1.anInt9652, arg1.anInt9652, local193, local295);
										this.method4102(local441, local444, 0, 0, local193, local295);
									} else if (local459 == 5) {
										this.method4102(local441, local444, arg1.anInt9652, arg1.anInt9652, local193, local295);
										this.method4102(local441, local444, arg1.anInt9652, 0, local193, local295);
										this.method4102(local441, local444, 0, arg1.anInt9652, local193, local295);
									} else if (local459 == 4) {
										this.method4102(local441, local444, arg1.anInt9652, 0, local193, local295);
										this.method4102(local441, local444, 0, 0, local193, local295);
										this.method4102(local441, local444, arg1.anInt9652, arg1.anInt9652, local193, local295);
									}
								}
							}
							local441++;
							local123++;
						}
					} else {
						local123 += this.anInt4759 - this.anInt4757;
					}
					local193++;
				}
				this.aStream2.c();
				if (this.anInterface11_5.method7563()) {
					this.aStream3.c();
					this.anInterface23_6 = this.aClass121_Sub2_11.method7201(false);
					this.anInterface23_6.method7570(local404, 16, this.anInt4767 * 16);
					break;
				}
				this.aStream3.e(0);
				this.aClass212_21.method5110();
			}
		} else {
			this.anInterface11_5 = null;
			this.anInterface23_6 = null;
		}
		this.aFloatArrayArray11 = this.aFloatArrayArray9 = this.aFloatArrayArray10 = null;
		this.aStream2 = null;
		this.aClass212_21 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IS)V")
	private void method4098(@OriginalArg(1) short arg0) {
		if (Stream.a()) {
			this.aStream2.f(arg0);
		} else {
			this.aStream2.b(arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIII)V")
	private void method4102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass60_Sub3_2.anInt9654) + arg3;
		@Pc(23) int local23 = (arg5 << this.aClass60_Sub3_2.anInt9654) + arg2;
		@Pc(29) int local29 = this.aClass60_Sub3_2.sa(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(61) Class6 local61 = this.aClass212_21.method5106(local7);
			if (local61 != null) {
				this.method4098(((Class6_Sub26) local61).aShort73);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt4767++;
		if (local7 != -1L) {
			this.aClass212_21.method5104(local7, new Class6_Sub26(local79));
		}
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(125) float local125;
		@Pc(196) float local196;
		@Pc(204) float local204;
		@Pc(211) float local211;
		@Pc(218) float local218;
		@Pc(225) float local225;
		@Pc(234) float local234;
		@Pc(243) float local243;
		@Pc(267) float local267;
		if (arg3 == 0 && arg2 == 0) {
			local111 = this.aFloatArrayArray11[arg0][arg4];
			local118 = this.aFloatArrayArray9[arg0][arg4];
			local125 = this.aFloatArrayArray10[arg0][arg4];
		} else if (this.aClass60_Sub3_2.anInt9652 == arg3 && arg2 == 0) {
			local118 = this.aFloatArrayArray9[arg0 + 1][arg4];
			local125 = this.aFloatArrayArray10[arg0 + 1][arg4];
			local111 = this.aFloatArrayArray11[arg0 + 1][arg4];
		} else if (this.aClass60_Sub3_2.anInt9652 == arg3 && arg2 == this.aClass60_Sub3_2.anInt9652) {
			local118 = this.aFloatArrayArray9[arg0 + 1][arg4 + 1];
			local125 = this.aFloatArrayArray10[arg0 + 1][arg4 + 1];
			local111 = this.aFloatArrayArray11[arg0 + 1][arg4 + 1];
		} else if (arg3 == 0 && this.aClass60_Sub3_2.anInt9652 == arg2) {
			local111 = this.aFloatArrayArray11[arg0][arg4 + 1];
			local118 = this.aFloatArrayArray9[arg0][arg4 + 1];
			local125 = this.aFloatArrayArray10[arg0][arg4 + 1];
		} else {
			local196 = (float) arg3 / (float) this.aClass60_Sub3_2.anInt9652;
			local204 = (float) arg2 / (float) this.aClass60_Sub3_2.anInt9652;
			local211 = this.aFloatArrayArray11[arg0][arg4];
			local218 = this.aFloatArrayArray9[arg0][arg4];
			local225 = this.aFloatArrayArray10[arg0][arg4];
			local234 = this.aFloatArrayArray11[arg0 + 1][arg4];
			local243 = this.aFloatArrayArray9[arg0 + 1][arg4];
			@Pc(258) float local258 = local218 + (this.aFloatArrayArray9[arg0][arg4 + 1] - local218) * local196;
			local267 = this.aFloatArrayArray10[arg0 + 1][arg4];
			@Pc(282) float local282 = local225 + (this.aFloatArrayArray10[arg0][arg4 + 1] - local225) * local196;
			@Pc(300) float local300 = local243 + (this.aFloatArrayArray9[arg0 + 1][arg4 + 1] - local243) * local196;
			@Pc(316) float local316 = local211 + (this.aFloatArrayArray11[arg0][arg4 + 1] - local211) * local196;
			@Pc(334) float local334 = local234 + (this.aFloatArrayArray11[arg0 + 1][arg4 + 1] - local234) * local196;
			local111 = (local334 - local316) * local204 + local316;
			local118 = local204 * (local300 - local258) + local258;
			@Pc(368) float local368 = local267 + (this.aFloatArrayArray10[arg0 + 1][arg4 + 1] - local267) * local196;
			local125 = local282 + local204 * (local368 - local282);
		}
		local196 = this.aClass6_Sub7_3.method3490() - local15;
		local204 = this.aClass6_Sub7_3.method3493() - local29;
		local211 = this.aClass6_Sub7_3.method3492() - local23;
		local218 = (float) Math.sqrt((double) (local211 * local211 + local204 * local204 + local196 * local196));
		local225 = 1.0F / local218;
		local196 *= local225;
		local211 *= local225;
		local204 *= local225;
		local234 = local218 / (float) this.aClass6_Sub7_3.method3487();
		local243 = 1.0F - local234 * local234;
		if (local243 < 0.0F) {
			local243 = 0.0F;
		}
		local267 = local125 * local211 + local118 * local204 + local111 * local196;
		if (local267 < 0.0F) {
			local267 = 0.0F;
		}
		@Pc(542) float local542 = local243 * local267 * 2.0F;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass6_Sub7_3.method3486();
		@Pc(563) int local563 = (int) ((float) (local553 >> 16 & 0xFF) * local542);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local553 & 0xFF) * local542);
		if (Stream.a()) {
			this.aStream3.b((float) local15);
			this.aStream3.b((float) local29);
			this.aStream3.b((float) local23);
		} else {
			this.aStream3.a((float) local15);
			this.aStream3.a((float) local29);
			this.aStream3.a((float) local23);
		}
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass121_Sub2_11.anInt8923 == 0) {
			this.aStream3.c(local595);
			this.aStream3.c(local580);
			this.aStream3.c(local563);
		} else {
			this.aStream3.c(local563);
			this.aStream3.c(local580);
			this.aStream3.c(local595);
		}
		this.aStream3.c(255);
		this.method4098(local79);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III[[ZI)V")
	public void method4103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface11_5 == null || (arg1 + arg0 < this.anInt4757 || (this.anInt4759 < arg0 - arg1 || (this.anInt4765 > arg1 + arg3 || arg3 - arg1 > this.anInt4760)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt4765; local50 <= this.anInt4760; local50++) {
			for (@Pc(60) int local60 = this.anInt4757; local60 <= this.anInt4759; local60++) {
				@Pc(66) int local66 = local60 - arg0;
				@Pc(71) int local71 = local50 - arg3;
				if (-arg1 < local66 && local66 < arg1 && local71 > -arg1 && local71 < arg1 && arg2[arg1 + local66][arg1 + local71]) {
					this.aClass121_Sub2_11.method7244((byte) (this.aClass6_Sub7_3.method3491() * 255.0F));
					this.aClass121_Sub2_11.method7297(0, this.anInterface23_6);
					this.aClass121_Sub2_11.method7263(this.aClass121_Sub2_11.aClass258_18);
					this.aClass121_Sub2_11.method7239(0, this.anInt4767, this.anInterface11_5, this.anInt4763 / 3, Static503.aClass107_2, 0);
					return;
				}
			}
		}
	}
}
