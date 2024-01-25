import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "I")
	private int anInt5639;

	@OriginalMember(owner = "client!kv", name = "E", descriptor = "Lclient!wba;")
	private final Class259_Sub3 aClass259_Sub3_2;

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_26;

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "Lclient!jw;")
	private final Class3_Sub5 aClass3_Sub5_3;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	private final int anInt5643;

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
	private final int anInt5641;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "I")
	private final int anInt5632;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	private final int anInt5633;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	private int anInt5645;

	@OriginalMember(owner = "client!kv", name = "I", descriptor = "Lclient!ika;")
	private Class3_Sub2 aClass3_Sub2_4;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!dda;")
	private Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!kv", name = "F", descriptor = "Lclient!qn;")
	private Class313 aClass313_27;

	@OriginalMember(owner = "client!kv", name = "m", descriptor = "Lclient!ww;")
	private final Interface27 anInterface27_4;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "Lclient!lm;")
	private final Interface13 anInterface13_3;

	@OriginalMember(owner = "client!kv", name = "H", descriptor = "Lclient!pe;")
	private final Class287 aClass287_3;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "Lclient!pe;")
	private final Class287 aClass287_4;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!aq;Lclient!wba;Lclient!jw;[I)V")
	public Class3_Sub36(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class259_Sub3 arg1, @OriginalArg(2) Class3_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass259_Sub3_2 = arg1;
		this.aClass22_Sub1_26 = arg0;
		this.aClass3_Sub5_3 = arg2;
		@Pc(23) int local23 = this.aClass3_Sub5_3.method7173() - (arg1.anInt10947 >> 1);
		this.anInt5643 = this.aClass3_Sub5_3.method7174() - local23 >> arg1.anInt10943;
		this.anInt5641 = local23 + this.aClass3_Sub5_3.method7174() >> arg1.anInt10943;
		this.anInt5632 = this.aClass3_Sub5_3.method7177() - local23 >> arg1.anInt10943;
		this.anInt5633 = this.aClass3_Sub5_3.method7177() + local23 >> arg1.anInt10943;
		@Pc(77) int local77 = this.anInt5641 + 1 - this.anInt5643;
		@Pc(86) int local86 = this.anInt5633 + 1 - this.anInt5632;
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(175) int local175;
		@Pc(191) int local191;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt5632;
			if (local122 > 0 && this.aClass259_Sub3_2.anInt10946 - 1 > local122) {
				for (local138 = 0; local138 <= local77; local138++) {
					local145 = this.anInt5643 + local138;
					if (local145 > 0 && this.aClass259_Sub3_2.anInt10949 - 1 > local145) {
						local175 = arg1.method9295(local122, local145 + 1) - arg1.method9295(local122, local145 - 1);
						local191 = arg1.method9295(local122 + 1, local145) - arg1.method9295(local122 - 1, local145);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local191 * local191 + local175 * local175 + 65536)));
						this.aFloatArrayArray10[local138][local115] = (float) local175 * local206;
						this.aFloatArrayArray8[local138][local115] = -256.0F * local206;
						this.aFloatArrayArray9[local138][local115] = local206 * (float) local191;
					}
				}
			}
		}
		local122 = 0;
		@Pc(322) int local322;
		for (local138 = this.anInt5632; local138 <= this.anInt5633; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt10946) {
				for (local145 = this.anInt5643; local145 <= this.anInt5641; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt10949) {
						local175 = arg3[local122];
						@Pc(297) int[] local297 = arg1.anIntArrayArrayArray19[local145][local138];
						if (local297 != null && local175 != 0) {
							if (local175 == 1) {
								local322 = 0;
								while (local322 < local297.length) {
									if (local297[local322++] != -1 && local297[local322++] != -1 && local297[local322++] != -1) {
										this.anInt5645 += 3;
									}
								}
							} else {
								this.anInt5645 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt5641 - this.anInt5643;
			}
		}
		if (this.anInt5645 > 0) {
			this.aClass3_Sub2_4 = new Class3_Sub2(this.anInt5645 * 2);
			this.aClass3_Sub2_Sub2_2 = new Class3_Sub2_Sub2(this.anInt5645 * 16);
			this.aClass313_27 = new Class313(Static92.method1941(this.anInt5645));
			local145 = 0;
			local122 = 0;
			for (local175 = this.anInt5632; local175 <= this.anInt5633; local175++) {
				if (local175 >= 0 && arg1.anInt10946 > local175) {
					local191 = 0;
					for (local322 = this.anInt5643; local322 <= this.anInt5641; local322++) {
						if (local322 >= 0 && local322 < arg1.anInt10949) {
							@Pc(491) int local491 = arg3[local122];
							@Pc(498) int[] local498 = arg1.anIntArrayArrayArray19[local322][local175];
							if (local498 != null && local491 != 0) {
								if (local491 == 1) {
									@Pc(519) int[] local519 = arg1.anIntArrayArrayArray18[local322][local175];
									@Pc(526) int[] local526 = arg1.anIntArrayArrayArray16[local322][local175];
									@Pc(528) int local528 = 0;
									label106: while (true) {
										while (true) {
											if (local498.length <= local528) {
												break label106;
											}
											if (local498[local528] == -1 || local498[local528 + 1] == -1 || local498[local528 + 2] == -1) {
												local528 += 3;
											} else {
												this.method4994(local526[local528], local322, local519[local528], local191, local175, local145);
												local528++;
												this.method4994(local526[local528], local322, local519[local528], local191, local175, local145);
												local528++;
												this.method4994(local526[local528], local322, local519[local528], local191, local175, local145);
												local528++;
											}
										}
									}
								} else if (local491 == 3) {
									this.method4994(0, local322, 0, local191, local175, local145);
									this.method4994(0, local322, arg1.anInt10947, local191, local175, local145);
									this.method4994(arg1.anInt10947, local322, 0, local191, local175, local145);
								} else if (local491 == 2) {
									this.method4994(0, local322, arg1.anInt10947, local191, local175, local145);
									this.method4994(arg1.anInt10947, local322, arg1.anInt10947, local191, local175, local145);
									this.method4994(0, local322, 0, local191, local175, local145);
								} else if (local491 == 5) {
									this.method4994(arg1.anInt10947, local322, arg1.anInt10947, local191, local175, local145);
									this.method4994(arg1.anInt10947, local322, 0, local191, local175, local145);
									this.method4994(0, local322, arg1.anInt10947, local191, local175, local145);
								} else if (local491 == 4) {
									this.method4994(arg1.anInt10947, local322, 0, local191, local175, local145);
									this.method4994(0, local322, 0, local191, local175, local145);
									this.method4994(arg1.anInt10947, local322, arg1.anInt10947, local191, local175, local145);
								}
							}
						}
						local191++;
						local122++;
					}
				} else {
					local122 += this.anInt5641 - this.anInt5643;
				}
				local145++;
			}
			this.anInterface27_4 = this.aClass22_Sub1_26.method896(false, this.aClass3_Sub2_4.aByteArray20, this.aClass3_Sub2_4.anInt2178);
			this.anInterface13_3 = this.aClass22_Sub1_26.method901(this.aClass3_Sub2_Sub2_2.aByteArray20, this.aClass3_Sub2_Sub2_2.anInt2178, false, 16);
			this.aClass287_3 = new Class287(this.anInterface13_3, 5126, 3, 0);
			this.aClass287_4 = new Class287(this.anInterface13_3, 5121, 4, 12);
		} else {
			this.anInterface13_3 = null;
			this.anInterface27_4 = null;
			this.aClass287_4 = null;
			this.aClass287_3 = null;
		}
		this.aClass3_Sub2_4 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray8 = this.aFloatArrayArray9 = null;
		this.aClass313_27 = null;
		this.aClass3_Sub2_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([[ZIIII)V")
	public void method4993(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface27_4 == null || (this.anInt5643 > arg1 + arg2 || (arg2 - arg1 > this.anInt5641 || (this.anInt5632 > arg3 + arg1 || this.anInt5633 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(63) int local63 = this.anInt5632; local63 <= this.anInt5633; local63++) {
			for (@Pc(68) int local68 = this.anInt5643; local68 <= this.anInt5641; local68++) {
				@Pc(75) int local75 = local68 - arg2;
				@Pc(79) int local79 = local63 - arg3;
				if (local75 > -arg1 && local75 < arg1 && local79 > -arg1 && local79 < arg1 && arg0[arg1 + local75][arg1 + local79]) {
					this.aClass22_Sub1_26.method934((int) (this.aClass3_Sub5_3.method7176() * 255.0F) << 24);
					this.aClass22_Sub1_26.method919(this.aClass287_3, (Class287) null, (Class287) null, this.aClass287_4);
					this.aClass22_Sub1_26.method957(0, this.anInterface27_4, this.anInt5645);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIZ)V")
	private void method4994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass259_Sub3_2.anInt10943) + arg2;
		@Pc(23) int local23 = arg0 + (arg4 << this.aClass259_Sub3_2.anInt10943);
		@Pc(30) int local30 = this.aClass259_Sub3_2.method9294(local23, local15);
		if ((arg2 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local23 << 16 | (long) local15 & 0xFFFFL;
			@Pc(63) Class3 local63 = this.aClass313_27.method7104(local7);
			if (local63 != null) {
				this.method4997(((Class3_Sub11) local63).aShort25);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt5639++;
		if (local7 != -1L) {
			this.aClass313_27.method7107(local7, new Class3_Sub11(local82));
		}
		@Pc(110) float local110;
		@Pc(124) float local124;
		@Pc(117) float local117;
		@Pc(245) float local245;
		@Pc(253) float local253;
		@Pc(260) float local260;
		@Pc(267) float local267;
		@Pc(274) float local274;
		@Pc(283) float local283;
		@Pc(292) float local292;
		@Pc(301) float local301;
		if (arg2 == 0 && arg0 == 0) {
			local110 = this.aFloatArrayArray10[arg3][arg5];
			local117 = this.aFloatArrayArray9[arg3][arg5];
			local124 = this.aFloatArrayArray8[arg3][arg5];
		} else if (arg2 == this.aClass259_Sub3_2.anInt10947 && arg0 == 0) {
			local124 = this.aFloatArrayArray8[arg3 + 1][arg5];
			local117 = this.aFloatArrayArray9[arg3 + 1][arg5];
			local110 = this.aFloatArrayArray10[arg3 + 1][arg5];
		} else if (this.aClass259_Sub3_2.anInt10947 == arg2 && arg0 == this.aClass259_Sub3_2.anInt10947) {
			local117 = this.aFloatArrayArray9[arg3 + 1][arg5 + 1];
			local110 = this.aFloatArrayArray10[arg3 + 1][arg5 + 1];
			local124 = this.aFloatArrayArray8[arg3 + 1][arg5 + 1];
		} else if (arg2 == 0 && this.aClass259_Sub3_2.anInt10947 == arg0) {
			local117 = this.aFloatArrayArray9[arg3][arg5 + 1];
			local124 = this.aFloatArrayArray8[arg3][arg5 + 1];
			local110 = this.aFloatArrayArray10[arg3][arg5 + 1];
		} else {
			local245 = (float) arg2 / (float) this.aClass259_Sub3_2.anInt10947;
			local253 = (float) arg0 / (float) this.aClass259_Sub3_2.anInt10947;
			local260 = this.aFloatArrayArray10[arg3][arg5];
			local267 = this.aFloatArrayArray8[arg3][arg5];
			local274 = this.aFloatArrayArray9[arg3][arg5];
			local283 = this.aFloatArrayArray10[arg3 + 1][arg5];
			local292 = this.aFloatArrayArray8[arg3 + 1][arg5];
			local301 = this.aFloatArrayArray9[arg3 + 1][arg5];
			@Pc(317) float local317 = local260 + (this.aFloatArrayArray10[arg3][arg5 + 1] - local260) * local245;
			@Pc(333) float local333 = local267 + local245 * (this.aFloatArrayArray8[arg3][arg5 + 1] - local267);
			@Pc(351) float local351 = local283 + local245 * (this.aFloatArrayArray10[arg3 + 1][arg5 + 1] - local283);
			@Pc(368) float local368 = local292 + local245 * (this.aFloatArrayArray8[arg3 + 1][arg5 + 1] - local292);
			@Pc(384) float local384 = local274 + (this.aFloatArrayArray9[arg3][arg5 + 1] - local274) * local245;
			local110 = (local351 - local317) * local253 + local317;
			local124 = local253 * (local368 - local333) + local333;
			@Pc(420) float local420 = local301 + local245 * (this.aFloatArrayArray9[arg3 + 1][arg5 + 1] - local301);
			local117 = (local420 - local384) * local253 + local384;
		}
		local245 = (float) (this.aClass3_Sub5_3.method7174() - local15);
		local253 = (float) (this.aClass3_Sub5_3.method7175() - local30);
		local260 = (float) (this.aClass3_Sub5_3.method7177() - local23);
		local267 = (float) Math.sqrt((double) (local253 * local253 + local245 * local245 + local260 * local260));
		local274 = 1.0F / local267;
		local253 *= local274;
		local245 *= local274;
		local260 *= local274;
		local283 = local267 / (float) this.aClass3_Sub5_3.method7173();
		local292 = 1.0F - local283 * local283;
		if (local292 < 0.0F) {
			local292 = 0.0F;
		}
		local301 = local253 * local124 + local110 * local245 + local117 * local260;
		if (local301 < 0.0F) {
			local301 = 0.0F;
		}
		@Pc(560) float local560 = local292 * local301 * 2.0F;
		if (local560 > 1.0F) {
			local560 = 1.0F;
		}
		@Pc(571) int local571 = this.aClass3_Sub5_3.method7172();
		@Pc(581) int local581 = (int) (local560 * (float) (local571 >> 16 & 0xFF));
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(598) int local598 = (int) (local560 * (float) (local571 >> 8 & 0xFF));
		if (local598 > 255) {
			local598 = 255;
		}
		@Pc(611) int local611 = (int) (local560 * (float) (local571 & 0xFF));
		if (local611 > 255) {
			local611 = 255;
		}
		if (this.aClass22_Sub1_26.aBoolean60) {
			this.aClass3_Sub2_Sub2_2.method2080((float) local15);
			this.aClass3_Sub2_Sub2_2.method2080((float) local30);
			this.aClass3_Sub2_Sub2_2.method2080((float) local23);
		} else {
			this.aClass3_Sub2_Sub2_2.method2079((float) local15);
			this.aClass3_Sub2_Sub2_2.method2079((float) local30);
			this.aClass3_Sub2_Sub2_2.method2079((float) local23);
		}
		this.aClass3_Sub2_Sub2_2.method2065(local581);
		this.aClass3_Sub2_Sub2_2.method2065(local598);
		this.aClass3_Sub2_Sub2_2.method2065(local611);
		this.aClass3_Sub2_Sub2_2.method2065(255);
		this.method4997(local82);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BS)V")
	private void method4997(@OriginalArg(1) short arg0) {
		if (this.aClass22_Sub1_26.aBoolean60) {
			this.aClass3_Sub2_4.method2032(arg0);
		} else {
			this.aClass3_Sub2_4.method2070(arg0);
		}
	}
}
