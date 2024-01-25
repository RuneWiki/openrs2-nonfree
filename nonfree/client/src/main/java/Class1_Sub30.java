import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
	private int anInt5179;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "Lclient!nm;")
	private final Class1_Sub27 aClass1_Sub27_1;

	@OriginalMember(owner = "client!laa", name = "w", descriptor = "Lclient!cb;")
	private final Class9_Sub1 aClass9_Sub1_7;

	@OriginalMember(owner = "client!laa", name = "D", descriptor = "Lclient!ih;")
	private final Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!laa", name = "t", descriptor = "I")
	private final int anInt5172;

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
	private final int anInt5174;

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
	private final int anInt5169;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
	private final int anInt5166;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!laa", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!laa", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!laa", name = "A", descriptor = "I")
	private int anInt5175;

	@OriginalMember(owner = "client!laa", name = "x", descriptor = "Lclient!ql;")
	private final Interface15 anInterface15_7;

	@OriginalMember(owner = "client!laa", name = "C", descriptor = "Lclient!af;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!laa", name = "F", descriptor = "Lclient!lb;")
	private Class174 aClass174_16;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!laa", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!cb;Lclient!ih;Lclient!nm;[I)V")
	public Class1_Sub30(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class10_Sub2 arg1, @OriginalArg(2) Class1_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub27_1 = arg2;
		this.aClass9_Sub1_7 = arg0;
		this.aClass10_Sub2_2 = arg1;
		@Pc(22) int local22 = this.aClass1_Sub27_1.method5496() - (arg1.anInt7410 >> 1);
		this.anInt5172 = this.aClass1_Sub27_1.method5493() - local22 >> arg1.anInt7411;
		this.anInt5174 = this.aClass1_Sub27_1.method5493() + local22 >> arg1.anInt7411;
		this.anInt5169 = this.aClass1_Sub27_1.method5495() - local22 >> arg1.anInt7411;
		this.anInt5166 = this.aClass1_Sub27_1.method5495() + local22 >> arg1.anInt7411;
		@Pc(78) int local78 = this.anInt5174 + 1 - this.anInt5172;
		@Pc(87) int local87 = this.anInt5166 + 1 - this.anInt5169;
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(172) int local172;
		@Pc(187) int local187;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt5169 + local116;
			if (local123 > 0 && this.aClass10_Sub2_2.anInt7409 - 1 > local123) {
				for (local138 = 0; local138 <= local78; local138++) {
					local145 = local138 + this.anInt5172;
					if (local145 > 0 && this.aClass10_Sub2_2.anInt7412 - 1 > local145) {
						local172 = arg1.ba(local145 + 1, local123) - arg1.ba(local145 - 1, local123);
						local187 = arg1.ba(local145, local123 + 1) - arg1.ba(local145, local123 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local172 * local172 + local187 * local187 + 65536)));
						this.aFloatArrayArray9[local138][local116] = local203 * (float) local172;
						this.aFloatArrayArray8[local138][local116] = local203 * -256.0F;
						this.aFloatArrayArray7[local138][local116] = (float) local187 * local203;
					}
				}
			}
		}
		local123 = 0;
		for (local138 = this.anInt5169; local138 <= this.anInt5166; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt7409) {
				for (local145 = this.anInt5172; local145 <= this.anInt5174; local145++) {
					if (local145 >= 0 && arg1.anInt7412 > local145) {
						local172 = arg3[local123];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray7[local145][local138];
						if (local300 != null && local172 != 0) {
							this.anInt5175 += local172 == 1 ? local300.length : 3;
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt5174 - this.anInt5172;
			}
		}
		if (this.anInt5175 <= 0) {
			this.anInterface15_7 = null;
			this.anInterface1_3 = null;
		} else {
			this.aClass174_16 = new Class174(Static117.method2662(this.anInt5175));
			this.anInterface1_3 = this.aClass9_Sub1_7.method7718(false);
			this.anInterface1_3.method7526(this.anInt5175);
			@Pc(386) NativeHeapBuffer local386 = this.aClass9_Sub1_7.method7714(false, this.anInt5175 * 16);
			this.aStream4 = new Stream(local386);
			while (true) {
				@Pc(398) Buffer local398;
				do {
					local398 = this.anInterface1_3.method7519();
				} while (local398 == null);
				this.aStream5 = new Stream(local398);
				local123 = 0;
				local187 = 0;
				for (@Pc(413) int local413 = this.anInt5169; local413 <= this.anInt5166; local413++) {
					if (local413 >= 0 && arg1.anInt7409 > local413) {
						@Pc(437) int local437 = 0;
						for (@Pc(440) int local440 = this.anInt5172; local440 <= this.anInt5174; local440++) {
							if (local440 >= 0 && local440 < arg1.anInt7412) {
								@Pc(459) int local459 = arg3[local123];
								@Pc(466) int[] local466 = arg1.anIntArrayArrayArray7[local440][local413];
								@Pc(473) int[] local473 = arg1.anIntArrayArrayArray12[local440][local413];
								if (local466 != null && local459 != 0) {
									if (local459 == 1) {
										for (@Pc(630) int local630 = 0; local630 < local466.length; local630++) {
											this.method4419(local440, local413, local466[local630], local473[local630], local437, local187);
										}
									} else if (local459 == 3) {
										this.method4419(local440, local413, 0, 0, local437, local187);
										this.method4419(local440, local413, arg1.anInt7410, 0, local437, local187);
										this.method4419(local440, local413, 0, arg1.anInt7410, local437, local187);
									} else if (local459 == 2) {
										this.method4419(local440, local413, arg1.anInt7410, 0, local437, local187);
										this.method4419(local440, local413, arg1.anInt7410, arg1.anInt7410, local437, local187);
										this.method4419(local440, local413, 0, 0, local437, local187);
									} else if (local459 == 5) {
										this.method4419(local440, local413, arg1.anInt7410, arg1.anInt7410, local437, local187);
										this.method4419(local440, local413, 0, arg1.anInt7410, local437, local187);
										this.method4419(local440, local413, arg1.anInt7410, 0, local437, local187);
									} else if (local459 == 4) {
										this.method4419(local440, local413, 0, arg1.anInt7410, local437, local187);
										this.method4419(local440, local413, 0, 0, local437, local187);
										this.method4419(local440, local413, arg1.anInt7410, arg1.anInt7410, local437, local187);
									}
								}
							}
							local123++;
							local437++;
						}
					} else {
						local123 += this.anInt5174 - this.anInt5172;
					}
					local187++;
				}
				this.aStream5.b();
				if (this.anInterface1_3.method7521()) {
					this.aStream4.b();
					this.anInterface15_7 = this.aClass9_Sub1_7.method7707(false);
					this.anInterface15_7.method6274(16, this.anInt5179 * 16, local386);
					break;
				}
				this.aStream4.d(0);
				this.aClass174_16.method4423();
			}
		}
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aClass174_16 = null;
		this.aStream4 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[[ZIBI)V")
	public void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface1_3 == null || (arg3 + arg2 < this.anInt5172 || (this.anInt5174 < arg3 - arg2 || (arg0 + arg2 < this.anInt5169 || this.anInt5166 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt5169; local55 <= this.anInt5166; local55++) {
			for (@Pc(60) int local60 = this.anInt5172; local60 <= this.anInt5174; local60++) {
				@Pc(67) int local67 = local60 - arg3;
				@Pc(72) int local72 = local55 - arg0;
				if (local67 > -arg2 && arg2 > local67 && local72 > -arg2 && arg2 > local72 && arg1[arg2 + local67][arg2 + local72]) {
					this.aClass9_Sub1_7.method7705((byte) (this.aClass1_Sub27_1.method5486() * 255.0F));
					this.aClass9_Sub1_7.method7664(this.aClass9_Sub1_7.aClass265_18);
					this.aClass9_Sub1_7.method7697(this.anInterface15_7, 0);
					this.aClass9_Sub1_7.method7658(Static29.aClass102_1, 0, 0, this.anInt5179, this.anInt5175 / 3, this.anInterface1_3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IS)V")
	private void method4416(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream5.c(arg0);
		} else {
			this.aStream5.f(arg0);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIBIII)V")
	private void method4419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg0 << this.aClass10_Sub2_2.anInt7411);
		@Pc(23) int local23 = arg3 + (arg1 << this.aClass10_Sub2_2.anInt7411);
		@Pc(29) int local29 = this.aClass10_Sub2_2.aa(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(58) Class1 local58 = this.aClass174_16.method4422(local7);
			if (local58 != null) {
				this.method4416(((Class1_Sub7) local58).aShort16);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt5179++;
		if (local7 != -1L) {
			this.aClass174_16.method4420(new Class1_Sub7(local78), local7);
		}
		@Pc(121) float local121;
		@Pc(107) float local107;
		@Pc(114) float local114;
		@Pc(190) float local190;
		@Pc(198) float local198;
		@Pc(205) float local205;
		@Pc(212) float local212;
		@Pc(219) float local219;
		@Pc(228) float local228;
		@Pc(237) float local237;
		@Pc(295) float local295;
		if (arg2 == 0 && arg3 == 0) {
			local107 = this.aFloatArrayArray8[arg4][arg5];
			local114 = this.aFloatArrayArray7[arg4][arg5];
			local121 = this.aFloatArrayArray9[arg4][arg5];
		} else if (this.aClass10_Sub2_2.anInt7410 == arg2 && arg3 == 0) {
			local121 = this.aFloatArrayArray9[arg4 + 1][arg5];
			local107 = this.aFloatArrayArray8[arg4 + 1][arg5];
			local114 = this.aFloatArrayArray7[arg4 + 1][arg5];
		} else if (this.aClass10_Sub2_2.anInt7410 == arg2 && this.aClass10_Sub2_2.anInt7410 == arg3) {
			local121 = this.aFloatArrayArray9[arg4 + 1][arg5 + 1];
			local114 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
			local107 = this.aFloatArrayArray8[arg4 + 1][arg5 + 1];
		} else if (arg2 == 0 && arg3 == this.aClass10_Sub2_2.anInt7410) {
			local114 = this.aFloatArrayArray7[arg4][arg5 + 1];
			local121 = this.aFloatArrayArray9[arg4][arg5 + 1];
			local107 = this.aFloatArrayArray8[arg4][arg5 + 1];
		} else {
			local190 = (float) arg2 / (float) this.aClass10_Sub2_2.anInt7410;
			local198 = (float) arg3 / (float) this.aClass10_Sub2_2.anInt7410;
			local205 = this.aFloatArrayArray9[arg4][arg5];
			local212 = this.aFloatArrayArray8[arg4][arg5];
			local219 = this.aFloatArrayArray7[arg4][arg5];
			local228 = this.aFloatArrayArray9[arg4 + 1][arg5];
			local237 = this.aFloatArrayArray8[arg4 + 1][arg5];
			@Pc(255) float local255 = local237 + (this.aFloatArrayArray8[arg4 + 1][arg5 + 1] - local237) * local190;
			@Pc(271) float local271 = local212 + (this.aFloatArrayArray8[arg4][arg5 + 1] - local212) * local190;
			@Pc(286) float local286 = local205 + local190 * (this.aFloatArrayArray9[arg4][arg5 + 1] - local205);
			local295 = this.aFloatArrayArray7[arg4 + 1][arg5];
			@Pc(312) float local312 = local228 + (this.aFloatArrayArray9[arg4 + 1][arg5 + 1] - local228) * local190;
			@Pc(327) float local327 = local219 + local190 * (this.aFloatArrayArray7[arg4][arg5 + 1] - local219);
			local107 = local271 + local198 * (local255 - local271);
			@Pc(353) float local353 = local295 + local190 * (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local295);
			local121 = local198 * (local312 - local286) + local286;
			local114 = local327 + local198 * (local353 - local327);
		}
		local190 = this.aClass1_Sub27_1.method5493() - local15;
		local198 = this.aClass1_Sub27_1.method5487() - local29;
		local205 = this.aClass1_Sub27_1.method5495() - local23;
		local212 = (float) Math.sqrt((double) (local198 * local198 + local190 * local190 + local205 * local205));
		local219 = 1.0F / local212;
		local205 *= local219;
		local198 *= local219;
		local190 *= local219;
		local228 = local212 / (float) this.aClass1_Sub27_1.method5496();
		local237 = 1.0F - local228 * local228;
		if (local237 < 0.0F) {
			local237 = 0.0F;
		}
		local295 = local107 * local198 + local190 * local121 + local205 * local114;
		if (local295 < 0.0F) {
			local295 = 0.0F;
		}
		@Pc(543) float local543 = local237 * local295 * 2.0F;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass1_Sub27_1.method5488();
		@Pc(564) int local564 = (int) ((float) (local554 >> 16 & 0xFF) * local543);
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(581) int local581 = (int) ((float) (local554 >> 8 & 0xFF) * local543);
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(598) int local598 = (int) (local543 * (float) (local554 & 0xFF));
		if (local598 > 255) {
			local598 = 255;
		}
		if (Stream.c()) {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local29);
			this.aStream4.a((float) local23);
		} else {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local29);
			this.aStream4.b((float) local23);
		}
		if (this.aClass9_Sub1_7.anInt9206 == 0) {
			this.aStream4.b(local598);
			this.aStream4.b(local581);
			this.aStream4.b(local564);
		} else {
			this.aStream4.b(local564);
			this.aStream4.b(local581);
			this.aStream4.b(local598);
		}
		this.aStream4.b(255);
		this.method4416(local78);
	}
}
