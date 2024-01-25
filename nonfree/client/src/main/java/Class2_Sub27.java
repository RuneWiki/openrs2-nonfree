import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub27 extends Class2 {

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	private int anInt2778;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Lclient!sl;")
	private final Class18_Sub3 aClass18_Sub3_2;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_5;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!mfa;")
	private final Class2_Sub13 aClass2_Sub13_3;

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
	private final int anInt2779;

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	private final int anInt2783;

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
	private final int anInt2777;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
	private final int anInt2775;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	private int anInt2774;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!si;")
	private Class335 aClass335_11;

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!vv;")
	private final Interface24 anInterface24_1;

	@OriginalMember(owner = "client!fa", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!fa", name = "K", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "Lclient!wba;")
	private final Interface25 anInterface25_2;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!mj;Lclient!sl;Lclient!mfa;[I)V")
	public Class2_Sub27(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class18_Sub3 arg1, @OriginalArg(2) Class2_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass18_Sub3_2 = arg1;
		this.aClass101_Sub1_5 = arg0;
		this.aClass2_Sub13_3 = arg2;
		@Pc(22) int local22 = this.aClass2_Sub13_3.method9407() - (arg1.anInt9739 >> 1);
		this.anInt2779 = this.aClass2_Sub13_3.method9411() - local22 >> arg1.anInt9740;
		this.anInt2783 = local22 + this.aClass2_Sub13_3.method9411() >> arg1.anInt9740;
		this.anInt2777 = this.aClass2_Sub13_3.method9406() - local22 >> arg1.anInt9740;
		this.anInt2775 = local22 + this.aClass2_Sub13_3.method9406() >> arg1.anInt9740;
		@Pc(77) int local77 = this.anInt2783 + 1 - this.anInt2779;
		@Pc(86) int local86 = this.anInt2775 + 1 - this.anInt2777;
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(177) int local177;
		@Pc(193) int local193;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt2777;
			if (local123 > 0 && local123 < this.aClass18_Sub3_2.anInt9742 - 1) {
				for (local138 = 0; local138 <= local77; local138++) {
					local145 = this.anInt2779 + local138;
					if (local145 > 0 && this.aClass18_Sub3_2.anInt9741 - 1 > local145) {
						local177 = arg1.method8537(local123, local145 + 1) - arg1.method8537(local123, local145 - 1);
						local193 = arg1.method8537(local123 + 1, local145) - arg1.method8537(local123 - 1, local145);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local193 * local193 + local177 * local177 + 65536)));
						this.aFloatArrayArray10[local138][local115] = (float) local177 * local208;
						this.aFloatArrayArray11[local138][local115] = -256.0F * local208;
						this.aFloatArrayArray9[local138][local115] = (float) local193 * local208;
					}
				}
			}
		}
		local123 = 0;
		@Pc(323) int local323;
		for (local138 = this.anInt2777; local138 <= this.anInt2775; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt9742) {
				for (local145 = this.anInt2779; local145 <= this.anInt2783; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt9741) {
						local177 = arg3[local123];
						@Pc(301) int[] local301 = arg1.anIntArrayArrayArray20[local145][local138];
						if (local301 != null && local177 != 0) {
							if (local177 == 1) {
								local323 = 0;
								while (local301.length > local323) {
									if (local301[local323++] != -1 && local301[local323++] != -1 && local301[local323++] != -1) {
										this.anInt2774 += 3;
									}
								}
							} else {
								this.anInt2774 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt2783 - this.anInt2779;
			}
		}
		if (this.anInt2774 > 0) {
			this.aClass335_11 = new Class335(Static432.method7064(this.anInt2774));
			this.anInterface24_1 = this.aClass101_Sub1_5.method5941(false);
			this.anInterface24_1.method9031(this.anInt2774);
			@Pc(410) NativeHeapBuffer local410 = this.aClass101_Sub1_5.method5928(false, this.anInt2774 * 16);
			this.aStream3 = new Stream(local410);
			while (true) {
				@Pc(422) Buffer local422;
				do {
					local422 = this.anInterface24_1.method6460();
				} while (local422 == null);
				this.aStream4 = new Stream(local422);
				local123 = 0;
				local193 = 0;
				for (local323 = this.anInt2777; local323 <= this.anInt2775; local323++) {
					if (local323 >= 0 && arg1.anInt9742 > local323) {
						@Pc(451) int local451 = 0;
						for (@Pc(454) int local454 = this.anInt2779; local454 <= this.anInt2783; local454++) {
							if (local454 >= 0 && local454 < arg1.anInt9741) {
								@Pc(469) int local469 = arg3[local123];
								@Pc(476) int[] local476 = arg1.anIntArrayArrayArray20[local454][local323];
								if (local476 != null && local469 != 0) {
									if (local469 == 1) {
										@Pc(493) int[] local493 = arg1.anIntArrayArrayArray18[local454][local323];
										@Pc(500) int[] local500 = arg1.anIntArrayArrayArray17[local454][local323];
										@Pc(502) int local502 = 0;
										label119: while (true) {
											while (true) {
												if (local476.length <= local502) {
													break label119;
												}
												if (local476[local502] == -1 || local476[local502 + 1] == -1 || local476[local502 + 2] == -1) {
													local502 += 3;
												} else {
													this.method2587(local323, local451, local493[local502], local193, local500[local502], local454);
													local502++;
													this.method2587(local323, local451, local493[local502], local193, local500[local502], local454);
													local502++;
													this.method2587(local323, local451, local493[local502], local193, local500[local502], local454);
													local502++;
												}
											}
										}
									} else if (local469 == 3) {
										this.method2587(local323, local451, 0, local193, 0, local454);
										this.method2587(local323, local451, arg1.anInt9739, local193, 0, local454);
										this.method2587(local323, local451, 0, local193, arg1.anInt9739, local454);
									} else if (local469 == 2) {
										this.method2587(local323, local451, arg1.anInt9739, local193, 0, local454);
										this.method2587(local323, local451, arg1.anInt9739, local193, arg1.anInt9739, local454);
										this.method2587(local323, local451, 0, local193, 0, local454);
									} else if (local469 == 5) {
										this.method2587(local323, local451, arg1.anInt9739, local193, arg1.anInt9739, local454);
										this.method2587(local323, local451, 0, local193, arg1.anInt9739, local454);
										this.method2587(local323, local451, arg1.anInt9739, local193, 0, local454);
									} else if (local469 == 4) {
										this.method2587(local323, local451, 0, local193, arg1.anInt9739, local454);
										this.method2587(local323, local451, 0, local193, 0, local454);
										this.method2587(local323, local451, arg1.anInt9739, local193, arg1.anInt9739, local454);
									}
								}
							}
							local451++;
							local123++;
						}
					} else {
						local123 += this.anInt2783 - this.anInt2779;
					}
					local193++;
				}
				this.aStream4.a();
				if (this.anInterface24_1.method6459()) {
					this.aStream3.a();
					this.anInterface25_2 = this.aClass101_Sub1_5.method5856(false);
					this.anInterface25_2.method9042(16, local410, this.anInt2778 * 16);
					break;
				}
				this.aStream3.e(0);
				this.aClass335_11.method8353();
			}
		} else {
			this.anInterface25_2 = null;
			this.anInterface24_1 = null;
		}
		this.aClass335_11 = null;
		this.aStream3 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray11 = this.aFloatArrayArray9 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(SB)V")
	private void method2584(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream4.c(arg0);
		} else {
			this.aStream4.a(arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIII[[Z)V")
	public void method2586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface24_1 == null || (arg0 + arg2 < this.anInt2779 || (arg0 - arg2 > this.anInt2783 || (this.anInt2777 > arg2 + arg1 || arg1 - arg2 > this.anInt2775)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt2777; local50 <= this.anInt2775; local50++) {
			for (@Pc(55) int local55 = this.anInt2779; local55 <= this.anInt2783; local55++) {
				@Pc(62) int local62 = local55 - arg0;
				@Pc(66) int local66 = local50 - arg1;
				if (local62 > -arg2 && arg2 > local62 && local66 > -arg2 && local66 < arg2 && arg3[arg2 + local62][local66 + arg2]) {
					this.aClass101_Sub1_5.method5839((byte) (int) (this.aClass2_Sub13_3.method9404() * 255.0F));
					this.aClass101_Sub1_5.method5953(0, this.anInterface25_2);
					this.aClass101_Sub1_5.method5938(this.aClass101_Sub1_5.aClass167_18);
					this.aClass101_Sub1_5.method5947(0, this.anInt2778, this.anInterface24_1, Static627.aClass320_6, 0, this.anInt2774 / 3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(IIIIIII)V")
	private void method2587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg2 + (arg5 << this.aClass18_Sub3_2.anInt9740);
		@Pc(24) int local24 = (arg0 << this.aClass18_Sub3_2.anInt9740) + arg4;
		@Pc(31) int local31 = this.aClass18_Sub3_2.method8542(local24, local16);
		if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(60) Class2 local60 = this.aClass335_11.method8357(local7);
			if (local60 != null) {
				this.method2584(((Class2_Sub32) local60).aShort54);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt2778++;
		if (local7 != -1L) {
			this.aClass335_11.method8356(new Class2_Sub32(local78), local7);
		}
		@Pc(102) float local102;
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(190) float local190;
		@Pc(198) float local198;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(228) float local228;
		@Pc(237) float local237;
		@Pc(328) float local328;
		if (arg2 == 0 && arg4 == 0) {
			local102 = this.aFloatArrayArray10[arg1][arg3];
			local109 = this.aFloatArrayArray9[arg1][arg3];
			local116 = this.aFloatArrayArray11[arg1][arg3];
		} else if (arg2 == this.aClass18_Sub3_2.anInt9739 && arg4 == 0) {
			local109 = this.aFloatArrayArray9[arg1 + 1][arg3];
			local102 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local116 = this.aFloatArrayArray11[arg1 + 1][arg3];
		} else if (arg2 == this.aClass18_Sub3_2.anInt9739 && this.aClass18_Sub3_2.anInt9739 == arg4) {
			local116 = this.aFloatArrayArray11[arg1 + 1][arg3 + 1];
			local102 = this.aFloatArrayArray10[arg1 + 1][arg3 + 1];
			local109 = this.aFloatArrayArray9[arg1 + 1][arg3 + 1];
		} else if (arg2 == 0 && this.aClass18_Sub3_2.anInt9739 == arg4) {
			local109 = this.aFloatArrayArray9[arg1][arg3 + 1];
			local116 = this.aFloatArrayArray11[arg1][arg3 + 1];
			local102 = this.aFloatArrayArray10[arg1][arg3 + 1];
		} else {
			local190 = (float) arg2 / (float) this.aClass18_Sub3_2.anInt9739;
			local198 = (float) arg4 / (float) this.aClass18_Sub3_2.anInt9739;
			local205 = this.aFloatArrayArray10[arg1][arg3];
			local212 = this.aFloatArrayArray11[arg1][arg3];
			local219 = this.aFloatArrayArray9[arg1][arg3];
			local228 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local237 = this.aFloatArrayArray11[arg1 + 1][arg3];
			@Pc(253) float local253 = local212 + (this.aFloatArrayArray11[arg1][arg3 + 1] - local212) * local190;
			@Pc(270) float local270 = local237 + local190 * (this.aFloatArrayArray11[arg1 + 1][arg3 + 1] - local237);
			@Pc(286) float local286 = local219 + local190 * (this.aFloatArrayArray9[arg1][arg3 + 1] - local219);
			@Pc(301) float local301 = local205 + (this.aFloatArrayArray10[arg1][arg3 + 1] - local205) * local190;
			@Pc(319) float local319 = local228 + (this.aFloatArrayArray10[arg1 + 1][arg3 + 1] - local228) * local190;
			local328 = this.aFloatArrayArray9[arg1 + 1][arg3];
			@Pc(345) float local345 = local328 + local190 * (this.aFloatArrayArray9[arg1 + 1][arg3 + 1] - local328);
			local102 = (local319 - local301) * local198 + local301;
			local116 = (local270 - local253) * local198 + local253;
			local109 = (local345 - local286) * local198 + local286;
		}
		local190 = (float) (this.aClass2_Sub13_3.method9411() - local16);
		local198 = (float) (this.aClass2_Sub13_3.method9410() - local31);
		local205 = (float) (this.aClass2_Sub13_3.method9406() - local24);
		local212 = (float) Math.sqrt((double) (local198 * local198 + local190 * local190 + local205 * local205));
		local219 = 1.0F / local212;
		local205 *= local219;
		local190 *= local219;
		local198 *= local219;
		local228 = local212 / (float) this.aClass2_Sub13_3.method9407();
		local237 = 1.0F - local228 * local228;
		if (local237 < 0.0F) {
			local237 = 0.0F;
		}
		local328 = local205 * local109 + local190 * local102 + local198 * local116;
		if (local328 < 0.0F) {
			local328 = 0.0F;
		}
		@Pc(542) float local542 = local237 * local328 * 2.0F;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass2_Sub13_3.method9405();
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(593) int local593 = (int) ((float) (local553 & 0xFF) * local542);
		if (local593 > 255) {
			local593 = 255;
		}
		if (Stream.c()) {
			this.aStream3.a((float) local16);
			this.aStream3.a((float) local31);
			this.aStream3.a((float) local24);
		} else {
			this.aStream3.b((float) local16);
			this.aStream3.b((float) local31);
			this.aStream3.b((float) local24);
		}
		if (this.aClass101_Sub1_5.anInt6641 == 0) {
			this.aStream3.b(local593);
			this.aStream3.b(local580);
			this.aStream3.b(local563);
		} else {
			this.aStream3.b(local563);
			this.aStream3.b(local580);
			this.aStream3.b(local593);
		}
		this.aStream3.b(255);
		this.method2584(local78);
	}
}
