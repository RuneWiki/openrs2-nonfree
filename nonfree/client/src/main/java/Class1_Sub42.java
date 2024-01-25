import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private int anInt7830;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!ww;")
	private final Class1_Sub2 aClass1_Sub2_3;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!uo;")
	private final Class205_Sub3 aClass205_Sub3_3;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_17;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	private final int anInt7836;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "I")
	private final int anInt7841;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	private final int anInt7834;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "I")
	private final int anInt7837;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	private int anInt7833;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!lca;")
	private final Interface5 anInterface5_13;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!bd;")
	private final Interface1 anInterface1_8;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!ba;")
	private Class17 aClass17_35;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream7;

	static {
		new Class306("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!re;Lclient!uo;Lclient!ww;[I)V")
	public Class1_Sub42(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class205_Sub3 arg1, @OriginalArg(2) Class1_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub2_3 = arg2;
		this.aClass205_Sub3_3 = arg1;
		this.aClass122_Sub2_17 = arg0;
		@Pc(23) int local23 = this.aClass1_Sub2_3.method2434() - (arg1.anInt8175 >> 1);
		this.anInt7836 = this.aClass1_Sub2_3.method2426() - local23 >> arg1.anInt8176;
		this.anInt7841 = local23 + this.aClass1_Sub2_3.method2426() >> arg1.anInt8176;
		this.anInt7834 = this.aClass1_Sub2_3.method2427() - local23 >> arg1.anInt8176;
		this.anInt7837 = this.aClass1_Sub2_3.method2427() + local23 >> arg1.anInt8176;
		@Pc(77) int local77 = this.anInt7841 + 1 - this.anInt7836;
		@Pc(86) int local86 = this.anInt7837 + 1 - this.anInt7834;
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(170) int local170;
		@Pc(184) int local184;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt7834 + local115;
			if (local122 > 0 && local122 < this.aClass205_Sub3_3.anInt8177 - 1) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = local133 + this.anInt7836;
					if (local140 > 0 && this.aClass205_Sub3_3.anInt8174 - 1 > local140) {
						local170 = arg1.ba(local140 + 1, local122) - arg1.ba(local140 - 1, local122);
						local184 = arg1.ba(local140, local122 + 1) - arg1.ba(local140, local122 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local184 * local184 + local170 * local170 + 65536)));
						this.aFloatArrayArray12[local133][local115] = local199 * (float) local170;
						this.aFloatArrayArray11[local133][local115] = local199 * -256.0F;
						this.aFloatArrayArray10[local133][local115] = local199 * (float) local184;
					}
				}
			}
		}
		local122 = 0;
		for (local133 = this.anInt7834; local133 <= this.anInt7837; local133++) {
			if (local133 >= 0 && arg1.anInt8177 > local133) {
				for (local140 = this.anInt7836; local140 <= this.anInt7841; local140++) {
					if (local140 >= 0 && arg1.anInt8174 > local140) {
						local170 = arg3[local122];
						@Pc(278) int[] local278 = arg1.anIntArrayArrayArray16[local140][local133];
						if (local278 != null && local170 != 0) {
							this.anInt7833 += local170 == 1 ? local278.length : 3;
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7841 - this.anInt7836;
			}
		}
		if (this.anInt7833 <= 0) {
			this.anInterface5_13 = null;
			this.anInterface1_8 = null;
		} else {
			this.aClass17_35 = new Class17(Static352.method5306(this.anInt7833));
			this.anInterface1_8 = this.aClass122_Sub2_17.method5660(false);
			this.anInterface1_8.method5227(this.anInt7833);
			@Pc(369) NativeHeapBuffer local369 = this.aClass122_Sub2_17.method5594(this.anInt7833 * 16, false);
			this.aStream6 = new Stream(local369);
			while (true) {
				@Pc(381) Buffer local381;
				do {
					local381 = this.anInterface1_8.method5729();
				} while (local381 == null);
				this.aStream7 = new Stream(local381);
				local122 = 0;
				local184 = 0;
				for (@Pc(396) int local396 = this.anInt7834; local396 <= this.anInt7837; local396++) {
					if (local396 >= 0 && arg1.anInt8177 > local396) {
						@Pc(409) int local409 = 0;
						for (@Pc(412) int local412 = this.anInt7836; local412 <= this.anInt7841; local412++) {
							if (local412 >= 0 && arg1.anInt8174 > local412) {
								@Pc(424) int local424 = arg3[local122];
								@Pc(431) int[] local431 = arg1.anIntArrayArrayArray16[local412][local396];
								@Pc(438) int[] local438 = arg1.anIntArrayArrayArray19[local412][local396];
								if (local431 != null && local424 != 0) {
									if (local424 == 1) {
										for (@Pc(447) int local447 = 0; local447 < local431.length; local447++) {
											this.method6522(local184, local431[local447], local396, local412, local409, local438[local447]);
										}
									} else if (local424 == 3) {
										this.method6522(local184, 0, local396, local412, local409, 0);
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, 0);
										this.method6522(local184, 0, local396, local412, local409, arg1.anInt8175);
									} else if (local424 == 2) {
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, 0);
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, arg1.anInt8175);
										this.method6522(local184, 0, local396, local412, local409, 0);
									} else if (local424 == 5) {
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, arg1.anInt8175);
										this.method6522(local184, 0, local396, local412, local409, arg1.anInt8175);
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, 0);
									} else if (local424 == 4) {
										this.method6522(local184, 0, local396, local412, local409, arg1.anInt8175);
										this.method6522(local184, 0, local396, local412, local409, 0);
										this.method6522(local184, arg1.anInt8175, local396, local412, local409, arg1.anInt8175);
									}
								}
							}
							local409++;
							local122++;
						}
					} else {
						local122 += this.anInt7841 - this.anInt7836;
					}
					local184++;
				}
				this.aStream7.b();
				if (this.anInterface1_8.method5730()) {
					this.aStream6.b();
					this.anInterface5_13 = this.aClass122_Sub2_17.method5671(false);
					this.anInterface5_13.method5731(local369, this.anInt7830 * 16, 16);
					break;
				}
				this.aStream6.e(0);
				this.aClass17_35.method734();
			}
		}
		this.aClass17_35 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray11 = this.aFloatArrayArray10 = null;
		this.aStream7 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII[[Z)V")
	public void method6519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface1_8 == null || (this.anInt7836 > arg1 + arg2 || (this.anInt7841 < arg1 - arg2 || (arg2 + arg0 < this.anInt7834 || this.anInt7837 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(61) int local61 = this.anInt7834; local61 <= this.anInt7837; local61++) {
			for (@Pc(66) int local66 = this.anInt7836; local66 <= this.anInt7841; local66++) {
				@Pc(73) int local73 = local66 - arg1;
				@Pc(78) int local78 = local61 - arg0;
				if (-arg2 < local73 && local73 < arg2 && local78 > -arg2 && arg2 > local78 && arg3[arg2 + local73][arg2 + local78]) {
					this.aClass122_Sub2_17.method5670((byte) (this.aClass1_Sub2_3.method2436() * 255.0F));
					this.aClass122_Sub2_17.method5573(this.aClass122_Sub2_17.aClass170_16);
					this.aClass122_Sub2_17.method5665(this.anInterface5_13, 0);
					this.aClass122_Sub2_17.method5669(Static354.aClass22_4, this.anInterface1_8, this.anInt7830, 0, this.anInt7833 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIB)V")
	private void method6522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(23) int local23 = arg1 + (arg3 << this.aClass205_Sub3_3.anInt8176);
		@Pc(32) int local32 = arg5 + (arg2 << this.aClass205_Sub3_3.anInt8176);
		@Pc(38) int local38 = this.aClass205_Sub3_3.aa(local23, local32);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local23 & 0xFFFFL | 0xFFFFL << 16 & (long) local32 << 16;
			@Pc(69) Class1 local69 = this.aClass17_35.method738(local7);
			if (local69 != null) {
				this.method6524(((Class1_Sub29) local69).aShort76);
				return;
			}
		}
		@Pc(87) short local87 = (short) this.anInt7830++;
		if (local7 != -1L) {
			this.aClass17_35.method737(new Class1_Sub29(local87), local7);
		}
		@Pc(123) float local123;
		@Pc(116) float local116;
		@Pc(130) float local130;
		@Pc(228) float local228;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(266) float local266;
		@Pc(275) float local275;
		@Pc(348) float local348;
		if (arg1 == 0 && arg5 == 0) {
			local116 = this.aFloatArrayArray11[arg4][arg0];
			local123 = this.aFloatArrayArray12[arg4][arg0];
			local130 = this.aFloatArrayArray10[arg4][arg0];
		} else if (arg1 == this.aClass205_Sub3_3.anInt8175 && arg5 == 0) {
			local123 = this.aFloatArrayArray12[arg4 + 1][arg0];
			local130 = this.aFloatArrayArray10[arg4 + 1][arg0];
			local116 = this.aFloatArrayArray11[arg4 + 1][arg0];
		} else if (this.aClass205_Sub3_3.anInt8175 == arg1 && arg5 == this.aClass205_Sub3_3.anInt8175) {
			local130 = this.aFloatArrayArray10[arg4 + 1][arg0 + 1];
			local116 = this.aFloatArrayArray11[arg4 + 1][arg0 + 1];
			local123 = this.aFloatArrayArray12[arg4 + 1][arg0 + 1];
		} else if (arg1 == 0 && this.aClass205_Sub3_3.anInt8175 == arg5) {
			local116 = this.aFloatArrayArray11[arg4][arg0 + 1];
			local123 = this.aFloatArrayArray12[arg4][arg0 + 1];
			local130 = this.aFloatArrayArray10[arg4][arg0 + 1];
		} else {
			local228 = (float) arg1 / (float) this.aClass205_Sub3_3.anInt8175;
			local236 = (float) arg5 / (float) this.aClass205_Sub3_3.anInt8175;
			local243 = this.aFloatArrayArray12[arg4][arg0];
			local250 = this.aFloatArrayArray11[arg4][arg0];
			local257 = this.aFloatArrayArray10[arg4][arg0];
			local266 = this.aFloatArrayArray12[arg4 + 1][arg0];
			local275 = this.aFloatArrayArray11[arg4 + 1][arg0];
			@Pc(291) float local291 = local257 + local228 * (this.aFloatArrayArray10[arg4][arg0 + 1] - local257);
			@Pc(306) float local306 = local243 + local228 * (this.aFloatArrayArray12[arg4][arg0 + 1] - local243);
			@Pc(324) float local324 = local266 + (this.aFloatArrayArray12[arg4 + 1][arg0 + 1] - local266) * local228;
			@Pc(339) float local339 = local250 + (this.aFloatArrayArray11[arg4][arg0 + 1] - local250) * local228;
			local348 = this.aFloatArrayArray10[arg4 + 1][arg0];
			@Pc(365) float local365 = local275 + (this.aFloatArrayArray11[arg4 + 1][arg0 + 1] - local275) * local228;
			local116 = (local365 - local339) * local236 + local339;
			@Pc(391) float local391 = local348 + (this.aFloatArrayArray10[arg4 + 1][arg0 + 1] - local348) * local228;
			local123 = (local324 - local306) * local236 + local306;
			local130 = local236 * (local391 - local291) + local291;
		}
		local228 = this.aClass1_Sub2_3.method2426() - local23;
		local236 = this.aClass1_Sub2_3.method2428() - local38;
		local243 = this.aClass1_Sub2_3.method2427() - local32;
		local250 = (float) Math.sqrt((double) (local243 * local243 + local236 * local236 + local228 * local228));
		local257 = 1.0F / local250;
		local243 *= local257;
		local228 *= local257;
		local236 *= local257;
		local266 = local250 / (float) this.aClass1_Sub2_3.method2434();
		local275 = 1.0F - local266 * local266;
		if (local275 < 0.0F) {
			local275 = 0.0F;
		}
		local348 = local236 * local116 + local228 * local123 + local243 * local130;
		if (local348 < 0.0F) {
			local348 = 0.0F;
		}
		@Pc(539) float local539 = local348 * local275 * 2.0F;
		if (local539 > 1.0F) {
			local539 = 1.0F;
		}
		@Pc(550) int local550 = this.aClass1_Sub2_3.method2432();
		@Pc(560) int local560 = (int) (local539 * (float) (local550 >> 16 & 0xFF));
		if (local560 > 255) {
			local560 = 255;
		}
		@Pc(577) int local577 = (int) ((float) (local550 >> 8 & 0xFF) * local539);
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(592) int local592 = (int) (local539 * (float) (local550 & 0xFF));
		if (Stream.c()) {
			this.aStream6.a((float) local23);
			this.aStream6.a((float) local38);
			this.aStream6.a((float) local32);
		} else {
			this.aStream6.b((float) local23);
			this.aStream6.b((float) local38);
			this.aStream6.b((float) local32);
		}
		if (local592 > 255) {
			local592 = 255;
		}
		if (this.aClass122_Sub2_17.anInt6720 == 0) {
			this.aStream6.f(local592);
			this.aStream6.f(local577);
			this.aStream6.f(local560);
		} else {
			this.aStream6.f(local560);
			this.aStream6.f(local577);
			this.aStream6.f(local592);
		}
		this.aStream6.f(255);
		this.method6524(local87);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(SI)V")
	private void method6524(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream7.a(arg0);
		} else {
			this.aStream7.d(arg0);
		}
	}
}
