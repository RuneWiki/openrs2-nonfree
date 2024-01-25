import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
	private int anInt5720;

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "Lclient!qd;")
	private final Class96_Sub2 aClass96_Sub2_3;

	@OriginalMember(owner = "client!lba", name = "D", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_26;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "Lclient!ta;")
	private final Class6_Sub10 aClass6_Sub10_2;

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "I")
	private final int anInt5725;

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
	private final int anInt5728;

	@OriginalMember(owner = "client!lba", name = "J", descriptor = "I")
	private final int anInt5723;

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
	private final int anInt5721;

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
	private int anInt5719;

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!jc;")
	private Class6_Sub15 aClass6_Sub15_95;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "Lclient!fca;")
	private Class6_Sub15_Sub2 aClass6_Sub15_Sub2_1;

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "Lclient!dfa;")
	private Class74 aClass74_39;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "Lclient!bda;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "Lclient!aj;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "Lclient!so;")
	private final Class332 aClass332_7;

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "Lclient!so;")
	private final Class332 aClass332_6;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lclient!ml;Lclient!qd;Lclient!ta;[I)V")
	public Class6_Sub31(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class96_Sub2 arg1, @OriginalArg(2) Class6_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass96_Sub2_3 = arg1;
		this.aClass75_Sub3_26 = arg0;
		this.aClass6_Sub10_2 = arg2;
		@Pc(23) int local23 = this.aClass6_Sub10_2.method8331() - (arg1.anInt9246 >> 1);
		this.anInt5725 = this.aClass6_Sub10_2.method8332() - local23 >> arg1.anInt9248;
		this.anInt5728 = this.aClass6_Sub10_2.method8332() + local23 >> arg1.anInt9248;
		this.anInt5723 = this.aClass6_Sub10_2.method8329() - local23 >> arg1.anInt9248;
		this.anInt5721 = local23 + this.aClass6_Sub10_2.method8329() >> arg1.anInt9248;
		@Pc(78) int local78 = this.anInt5728 + 1 - this.anInt5725;
		@Pc(87) int local87 = this.anInt5721 + 1 - this.anInt5723;
		this.aFloatArrayArray10 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray9 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(181) int local181;
		@Pc(198) int local198;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt5723;
			if (local123 > 0 && local123 < this.aClass96_Sub2_3.anInt9257 - 1) {
				for (local140 = 0; local140 <= local78; local140++) {
					local147 = this.anInt5725 + local140;
					if (local147 > 0 && local147 < this.aClass96_Sub2_3.anInt9255 - 1) {
						local181 = arg1.method8080(local147 + 1, local123) - arg1.method8080(local147 - 1, local123);
						local198 = arg1.method8080(local147, local123 + 1) - arg1.method8080(local147, local123 - 1);
						@Pc(213) float local213 = (float) (1.0D / Math.sqrt((double) (local198 * local198 + local181 * local181 + 65536)));
						this.aFloatArrayArray10[local140][local116] = (float) local181 * local213;
						this.aFloatArrayArray8[local140][local116] = local213 * -256.0F;
						this.aFloatArrayArray9[local140][local116] = local213 * (float) local198;
					}
				}
			}
		}
		local123 = 0;
		@Pc(340) int local340;
		for (local140 = this.anInt5723; local140 <= this.anInt5721; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt9257) {
				for (local147 = this.anInt5725; local147 <= this.anInt5728; local147++) {
					if (local147 >= 0 && arg1.anInt9255 > local147) {
						local181 = arg3[local123];
						@Pc(315) int[] local315 = arg1.anIntArrayArrayArray16[local147][local140];
						if (local315 != null && local181 != 0) {
							if (local181 == 1) {
								local340 = 0;
								while (local340 < local315.length) {
									if (local315[local340++] != -1 && local315[local340++] != -1 && local315[local340++] != -1) {
										this.anInt5719 += 3;
									}
								}
							} else {
								this.anInt5719 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt5728 - this.anInt5725;
			}
		}
		if (this.anInt5719 > 0) {
			this.aClass6_Sub15_95 = new Class6_Sub15(this.anInt5719 * 2);
			this.aClass6_Sub15_Sub2_1 = new Class6_Sub15_Sub2(this.anInt5719 * 16);
			this.aClass74_39 = new Class74(Static314.method4970(this.anInt5719));
			local147 = 0;
			local123 = 0;
			for (local181 = this.anInt5723; local181 <= this.anInt5721; local181++) {
				if (local181 >= 0 && arg1.anInt9257 > local181) {
					local198 = 0;
					for (local340 = this.anInt5725; local340 <= this.anInt5728; local340++) {
						if (local340 >= 0 && local340 < arg1.anInt9255) {
							@Pc(505) int local505 = arg3[local123];
							@Pc(512) int[] local512 = arg1.anIntArrayArrayArray16[local340][local181];
							if (local512 != null && local505 != 0) {
								if (local505 == 1) {
									@Pc(697) int[] local697 = arg1.anIntArrayArrayArray17[local340][local181];
									@Pc(704) int[] local704 = arg1.anIntArrayArrayArray18[local340][local181];
									@Pc(706) int local706 = 0;
									label105: while (true) {
										while (true) {
											if (local706 >= local512.length) {
												break label105;
											}
											if (local512[local706] == -1 || local512[local706 + 1] == -1 || local512[local706 + 2] == -1) {
												local706 += 3;
											} else {
												this.method5171(local704[local706], local697[local706], local147, local198, local181, local340);
												local706++;
												this.method5171(local704[local706], local697[local706], local147, local198, local181, local340);
												local706++;
												this.method5171(local704[local706], local697[local706], local147, local198, local181, local340);
												local706++;
											}
										}
									}
								} else if (local505 == 3) {
									this.method5171(0, 0, local147, local198, local181, local340);
									this.method5171(0, arg1.anInt9246, local147, local198, local181, local340);
									this.method5171(arg1.anInt9246, 0, local147, local198, local181, local340);
								} else if (local505 == 2) {
									this.method5171(0, arg1.anInt9246, local147, local198, local181, local340);
									this.method5171(arg1.anInt9246, arg1.anInt9246, local147, local198, local181, local340);
									this.method5171(0, 0, local147, local198, local181, local340);
								} else if (local505 == 5) {
									this.method5171(arg1.anInt9246, arg1.anInt9246, local147, local198, local181, local340);
									this.method5171(arg1.anInt9246, 0, local147, local198, local181, local340);
									this.method5171(0, arg1.anInt9246, local147, local198, local181, local340);
								} else if (local505 == 4) {
									this.method5171(arg1.anInt9246, 0, local147, local198, local181, local340);
									this.method5171(0, 0, local147, local198, local181, local340);
									this.method5171(arg1.anInt9246, arg1.anInt9246, local147, local198, local181, local340);
								}
							}
						}
						local198++;
						local123++;
					}
				} else {
					local123 += this.anInt5728 - this.anInt5725;
				}
				local147++;
			}
			this.anInterface4_4 = this.aClass75_Sub3_26.method5768(this.aClass6_Sub15_95.anInt3174, false, this.aClass6_Sub15_95.aByteArray20);
			this.anInterface2_2 = this.aClass75_Sub3_26.method5805(16, this.aClass6_Sub15_Sub2_1.anInt3174, false, this.aClass6_Sub15_Sub2_1.aByteArray20);
			this.aClass332_7 = new Class332(this.anInterface2_2, 5126, 3, 0);
			this.aClass332_6 = new Class332(this.anInterface2_2, 5121, 4, 12);
		} else {
			this.anInterface2_2 = null;
			this.aClass332_6 = null;
			this.anInterface4_4 = null;
			this.aClass332_7 = null;
		}
		this.aFloatArrayArray10 = this.aFloatArrayArray8 = this.aFloatArrayArray9 = null;
		this.aClass6_Sub15_Sub2_1 = null;
		this.aClass6_Sub15_95 = null;
		this.aClass74_39 = null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[[ZIII)V")
	public void method5169(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface4_4 == null || (arg2 + arg3 < this.anInt5725 || (this.anInt5728 < arg2 - arg3 || (arg1 + arg3 < this.anInt5723 || arg1 - arg3 > this.anInt5721)))) {
			return;
		}
		for (@Pc(60) int local60 = this.anInt5723; local60 <= this.anInt5721; local60++) {
			for (@Pc(65) int local65 = this.anInt5725; local65 <= this.anInt5728; local65++) {
				@Pc(72) int local72 = local65 - arg2;
				@Pc(76) int local76 = local60 - arg1;
				if (-arg3 < local72 && arg3 > local72 && local76 > -arg3 && local76 < arg3 && arg0[local72 + arg3][arg3 + local76]) {
					this.aClass75_Sub3_26.method5794((int) (this.aClass6_Sub10_2.method8334() * 255.0F) << 24);
					this.aClass75_Sub3_26.method5809(this.aClass332_6, (Class332) null, (Class332) null, this.aClass332_7);
					this.aClass75_Sub3_26.method5803(0, this.anInt5719, this.anInterface4_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIIIII)V")
	private void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg1 + (arg5 << this.aClass96_Sub2_3.anInt9248);
		@Pc(23) int local23 = (arg4 << this.aClass96_Sub2_3.anInt9248) + arg0;
		@Pc(30) int local30 = this.aClass96_Sub2_3.method8077(local15, local23);
		if ((arg1 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class6 local61 = this.aClass74_39.method1401(local7);
			if (local61 != null) {
				this.method5174(((Class6_Sub52) local61).aShort130);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt5720++;
		if (local7 != -1L) {
			this.aClass74_39.method1399(new Class6_Sub52(local80), local7);
		}
		@Pc(131) float local131;
		@Pc(140) float local140;
		@Pc(149) float local149;
		@Pc(227) float local227;
		@Pc(235) float local235;
		@Pc(242) float local242;
		@Pc(249) float local249;
		@Pc(256) float local256;
		@Pc(265) float local265;
		@Pc(274) float local274;
		@Pc(330) float local330;
		if (arg1 == 0 && arg0 == 0) {
			local140 = this.aFloatArrayArray8[arg3][arg2];
			local131 = this.aFloatArrayArray10[arg3][arg2];
			local149 = this.aFloatArrayArray9[arg3][arg2];
		} else if (arg1 == this.aClass96_Sub2_3.anInt9246 && arg0 == 0) {
			local131 = this.aFloatArrayArray10[arg3 + 1][arg2];
			local140 = this.aFloatArrayArray8[arg3 + 1][arg2];
			local149 = this.aFloatArrayArray9[arg3 + 1][arg2];
		} else if (this.aClass96_Sub2_3.anInt9246 == arg1 && arg0 == this.aClass96_Sub2_3.anInt9246) {
			local131 = this.aFloatArrayArray10[arg3 + 1][arg2 + 1];
			local140 = this.aFloatArrayArray8[arg3 + 1][arg2 + 1];
			local149 = this.aFloatArrayArray9[arg3 + 1][arg2 + 1];
		} else if (arg1 == 0 && this.aClass96_Sub2_3.anInt9246 == arg0) {
			local140 = this.aFloatArrayArray8[arg3][arg2 + 1];
			local131 = this.aFloatArrayArray10[arg3][arg2 + 1];
			local149 = this.aFloatArrayArray9[arg3][arg2 + 1];
		} else {
			local227 = (float) arg1 / (float) this.aClass96_Sub2_3.anInt9246;
			local235 = (float) arg0 / (float) this.aClass96_Sub2_3.anInt9246;
			local242 = this.aFloatArrayArray10[arg3][arg2];
			local249 = this.aFloatArrayArray8[arg3][arg2];
			local256 = this.aFloatArrayArray9[arg3][arg2];
			local265 = this.aFloatArrayArray10[arg3 + 1][arg2];
			local274 = this.aFloatArrayArray8[arg3 + 1][arg2];
			@Pc(289) float local289 = local242 + local227 * (this.aFloatArrayArray10[arg3][arg2 + 1] - local242);
			@Pc(306) float local306 = local274 + local227 * (this.aFloatArrayArray8[arg3 + 1][arg2 + 1] - local274);
			@Pc(321) float local321 = local256 + local227 * (this.aFloatArrayArray9[arg3][arg2 + 1] - local256);
			local330 = this.aFloatArrayArray9[arg3 + 1][arg2];
			@Pc(346) float local346 = local249 + local227 * (this.aFloatArrayArray8[arg3][arg2 + 1] - local249);
			@Pc(363) float local363 = local265 + (this.aFloatArrayArray10[arg3 + 1][arg2 + 1] - local265) * local227;
			local140 = local346 + (local306 - local346) * local235;
			@Pc(388) float local388 = local330 + (this.aFloatArrayArray9[arg3 + 1][arg2 + 1] - local330) * local227;
			local131 = local289 + local235 * (local363 - local289);
			local149 = (local388 - local321) * local235 + local321;
		}
		local227 = (float) (this.aClass6_Sub10_2.method8332() - local15);
		local235 = (float) (this.aClass6_Sub10_2.method8327() - local30);
		local242 = (float) (this.aClass6_Sub10_2.method8329() - local23);
		local249 = (float) Math.sqrt((double) (local242 * local242 + local235 * local235 + local227 * local227));
		local256 = 1.0F / local249;
		local242 *= local256;
		local235 *= local256;
		local227 *= local256;
		local265 = local249 / (float) this.aClass6_Sub10_2.method8331();
		local274 = 1.0F - local265 * local265;
		if (local274 < 0.0F) {
			local274 = 0.0F;
		}
		local330 = local149 * local242 + local235 * local140 + local131 * local227;
		if (local330 < 0.0F) {
			local330 = 0.0F;
		}
		@Pc(565) float local565 = local274 * local330 * 2.0F;
		if (local565 > 1.0F) {
			local565 = 1.0F;
		}
		@Pc(578) int local578 = this.aClass6_Sub10_2.method8328();
		@Pc(588) int local588 = (int) (local565 * (float) (local578 >> 16 & 0xFF));
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(605) int local605 = (int) ((float) (local578 >> 8 & 0xFF) * local565);
		if (local605 > 255) {
			local605 = 255;
		}
		@Pc(620) int local620 = (int) (local565 * (float) (local578 & 0xFF));
		if (this.aClass75_Sub3_26.aBoolean480) {
			this.aClass6_Sub15_Sub2_1.method3052((float) local15);
			this.aClass6_Sub15_Sub2_1.method3052((float) local30);
			this.aClass6_Sub15_Sub2_1.method3052((float) local23);
		} else {
			this.aClass6_Sub15_Sub2_1.method3055((float) local15);
			this.aClass6_Sub15_Sub2_1.method3055((float) local30);
			this.aClass6_Sub15_Sub2_1.method3055((float) local23);
		}
		if (local620 > 255) {
			local620 = 255;
		}
		this.aClass6_Sub15_Sub2_1.method3016(local588);
		this.aClass6_Sub15_Sub2_1.method3016(local605);
		this.aClass6_Sub15_Sub2_1.method3016(local620);
		this.aClass6_Sub15_Sub2_1.method3016(255);
		this.method5174(local80);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IS)V")
	private void method5174(@OriginalArg(1) short arg0) {
		if (this.aClass75_Sub3_26.aBoolean480) {
			this.aClass6_Sub15_95.method3040(arg0);
		} else {
			this.aClass6_Sub15_95.method3008(arg0);
		}
	}
}
