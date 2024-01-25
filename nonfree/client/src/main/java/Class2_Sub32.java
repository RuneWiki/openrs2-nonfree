import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	private int anInt5218;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	private int anInt5219;

	@OriginalMember(owner = "client!or", name = "o", descriptor = "Lclient!jd;")
	private final Class2_Sub20 aClass2_Sub20_2;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "Lclient!eg;")
	private final Class64_Sub1 aClass64_Sub1_3;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_30;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "I")
	private final int anInt5221;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	private final int anInt5214;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	private final int anInt5224;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	private final int anInt5220;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "Lclient!si;")
	private Class2_Sub23 aClass2_Sub23_7;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "Lclient!ki;")
	private Class2_Sub23_Sub1 aClass2_Sub23_Sub1_4;

	@OriginalMember(owner = "client!or", name = "B", descriptor = "Lclient!mn;")
	private Class163 aClass163_33;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "Lclient!rt;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "Lclient!ap;")
	private final Interface1 anInterface1_6;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "Lclient!wc;")
	private final Class260 aClass260_16;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "Lclient!wc;")
	private final Class260 aClass260_15;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ef;Lclient!eg;Lclient!jd;[I)V")
	public Class2_Sub32(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class64_Sub1 arg1, @OriginalArg(2) Class2_Sub20 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub20_2 = arg2;
		this.aClass64_Sub1_3 = arg1;
		this.aClass49_Sub2_30 = arg0;
		@Pc(22) int local22 = this.aClass2_Sub20_2.method5743() - (arg1.anInt2927 >> 1);
		this.anInt5221 = this.aClass2_Sub20_2.method5740() - local22 >> arg1.anInt2932;
		this.anInt5214 = local22 + this.aClass2_Sub20_2.method5740() >> arg1.anInt2932;
		this.anInt5224 = this.aClass2_Sub20_2.method5741() - local22 >> arg1.anInt2932;
		this.anInt5220 = this.aClass2_Sub20_2.method5741() + local22 >> arg1.anInt2932;
		@Pc(78) int local78 = this.anInt5214 + 1 - this.anInt5221;
		@Pc(87) int local87 = this.anInt5220 + 1 - this.anInt5224;
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(176) int local176;
		@Pc(191) int local191;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt5224;
			if (local123 > 0 && local123 < this.aClass64_Sub1_3.anInt2928 - 1) {
				for (local141 = 0; local141 <= local78; local141++) {
					local148 = this.anInt5221 + local141;
					if (local148 > 0 && this.aClass64_Sub1_3.anInt2934 - 1 > local148) {
						local176 = arg1.l(local148 + 1, local123) - arg1.l(local148 - 1, local123);
						local191 = arg1.l(local148, local123 + 1) - arg1.l(local148, local123 - 1);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local191 * local191 + local176 * local176 + 65536)));
						this.aFloatArrayArray6[local141][local116] = local206 * (float) local176;
						this.aFloatArrayArray7[local141][local116] = local206 * -256.0F;
						this.aFloatArrayArray8[local141][local116] = local206 * (float) local191;
					}
				}
			}
		}
		local123 = 0;
		local141 = 0;
		for (local148 = this.anInt5224; local148 <= this.anInt5220; local148++) {
			if (local148 >= 0 && local148 < arg1.anInt2928) {
				for (local176 = this.anInt5221; local176 <= this.anInt5214; local176++) {
					if (local176 >= 0 && local176 < arg1.anInt2934) {
						local191 = arg3[local141];
						@Pc(293) int[] local293 = arg1.anIntArrayArrayArray7[local176][local148];
						if (local293 != null && local191 != 0) {
							if (local191 == 1) {
								local123 += local293.length;
							} else {
								local123 += 3;
							}
						}
					}
					local141++;
				}
			} else {
				local141 += this.anInt5214 - this.anInt5221;
			}
		}
		if (local123 > 0) {
			this.aClass2_Sub23_7 = new Class2_Sub23(local123 * 2);
			this.aClass2_Sub23_Sub1_4 = new Class2_Sub23_Sub1(local123 * 16);
			this.aClass163_33 = new Class163(Static51.method863(local123));
			local176 = 0;
			local141 = 0;
			for (local191 = this.anInt5224; local191 <= this.anInt5220; local191++) {
				if (local191 >= 0 && arg1.anInt2928 > local191) {
					@Pc(378) int local378 = 0;
					for (@Pc(381) int local381 = this.anInt5221; local381 <= this.anInt5214; local381++) {
						if (local381 >= 0 && arg1.anInt2934 > local381) {
							@Pc(400) int local400 = arg3[local141];
							@Pc(407) int[] local407 = arg1.anIntArrayArrayArray7[local381][local191];
							@Pc(414) int[] local414 = arg1.anIntArrayArrayArray4[local381][local191];
							if (local407 != null && local400 != 0) {
								if (local400 == 1) {
									for (@Pc(423) int local423 = 0; local423 < local407.length; local423++) {
										this.method4186(local378, local414[local423], local176, local191, local381, local407[local423]);
									}
								} else if (local400 == 3) {
									this.method4186(local378, 0, local176, local191, local381, 0);
									this.method4186(local378, 0, local176, local191, local381, arg1.anInt2927);
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, 0);
								} else if (local400 == 2) {
									this.method4186(local378, 0, local176, local191, local381, arg1.anInt2927);
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, arg1.anInt2927);
									this.method4186(local378, 0, local176, local191, local381, 0);
								} else if (local400 == 5) {
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, arg1.anInt2927);
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, 0);
									this.method4186(local378, 0, local176, local191, local381, arg1.anInt2927);
								} else if (local400 == 4) {
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, 0);
									this.method4186(local378, 0, local176, local191, local381, 0);
									this.method4186(local378, arg1.anInt2927, local176, local191, local381, arg1.anInt2927);
								}
							}
						}
						local141++;
						local378++;
					}
				} else {
					local141 += this.anInt5214 - this.anInt5221;
				}
				local176++;
			}
			this.anInterface10_5 = this.aClass49_Sub2_30.method1591(this.aClass2_Sub23_7.anInt6952, false, this.aClass2_Sub23_7.aByteArray130);
			this.anInterface1_6 = this.aClass49_Sub2_30.method1593(this.aClass2_Sub23_Sub1_4.anInt6952, 16, this.aClass2_Sub23_Sub1_4.aByteArray130, false);
			this.aClass260_16 = new Class260(this.anInterface1_6, 5126, 3, 0);
			this.aClass260_15 = new Class260(this.anInterface1_6, 5121, 4, 12);
		} else {
			this.anInterface10_5 = null;
			this.anInterface1_6 = null;
			this.aClass260_16 = null;
			this.aClass260_15 = null;
		}
		this.aClass163_33 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.aClass2_Sub23_7 = null;
		this.aClass2_Sub23_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIII)V")
	private void method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg4 << this.aClass64_Sub1_3.anInt2932) + arg5;
		@Pc(23) int local23 = arg1 + (arg3 << this.aClass64_Sub1_3.anInt2932);
		@Pc(29) int local29 = this.aClass64_Sub1_3.a(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local23 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(57) Class2 local57 = this.aClass163_33.method3769(local7);
			if (local57 != null) {
				this.method4188(((Class2_Sub6) local57).aShort1);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt5218++;
		if (local7 != -1L) {
			this.aClass163_33.method3764(local7, new Class2_Sub6(local75));
		}
		@Pc(133) float local133;
		@Pc(142) float local142;
		@Pc(151) float local151;
		@Pc(161) float local161;
		@Pc(169) float local169;
		@Pc(176) float local176;
		@Pc(183) float local183;
		@Pc(190) float local190;
		@Pc(199) float local199;
		@Pc(208) float local208;
		@Pc(248) float local248;
		if (arg5 == 0 && arg1 == 0) {
			local142 = this.aFloatArrayArray7[arg0][arg2];
			local151 = this.aFloatArrayArray8[arg0][arg2];
			local133 = this.aFloatArrayArray6[arg0][arg2];
		} else if (arg5 == this.aClass64_Sub1_3.anInt2927 && arg1 == 0) {
			local142 = this.aFloatArrayArray7[arg0 + 1][arg2];
			local133 = this.aFloatArrayArray6[arg0 + 1][arg2];
			local151 = this.aFloatArrayArray8[arg0 + 1][arg2];
		} else if (this.aClass64_Sub1_3.anInt2927 == arg5 && arg1 == this.aClass64_Sub1_3.anInt2927) {
			local133 = this.aFloatArrayArray6[arg0 + 1][arg2 + 1];
			local142 = this.aFloatArrayArray7[arg0 + 1][arg2 + 1];
			local151 = this.aFloatArrayArray8[arg0 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass64_Sub1_3.anInt2927 == arg1) {
			local133 = this.aFloatArrayArray6[arg0][arg2 + 1];
			local142 = this.aFloatArrayArray7[arg0][arg2 + 1];
			local151 = this.aFloatArrayArray8[arg0][arg2 + 1];
		} else {
			local161 = (float) arg5 / (float) this.aClass64_Sub1_3.anInt2927;
			local169 = (float) arg1 / (float) this.aClass64_Sub1_3.anInt2927;
			local176 = this.aFloatArrayArray6[arg0][arg2];
			local183 = this.aFloatArrayArray7[arg0][arg2];
			local190 = this.aFloatArrayArray8[arg0][arg2];
			local199 = this.aFloatArrayArray6[arg0 + 1][arg2];
			local208 = this.aFloatArrayArray7[arg0 + 1][arg2];
			@Pc(224) float local224 = local176 + local161 * (this.aFloatArrayArray6[arg0][arg2 + 1] - local176);
			@Pc(239) float local239 = local183 + (this.aFloatArrayArray7[arg0][arg2 + 1] - local183) * local161;
			local248 = this.aFloatArrayArray8[arg0 + 1][arg2];
			@Pc(265) float local265 = local208 + local161 * (this.aFloatArrayArray7[arg0 + 1][arg2 + 1] - local208);
			@Pc(281) float local281 = local190 + local161 * (this.aFloatArrayArray8[arg0][arg2 + 1] - local190);
			@Pc(299) float local299 = local199 + (this.aFloatArrayArray6[arg0 + 1][arg2 + 1] - local199) * local161;
			local142 = (local265 - local239) * local169 + local239;
			@Pc(324) float local324 = local248 + (this.aFloatArrayArray8[arg0 + 1][arg2 + 1] - local248) * local161;
			local133 = local224 + (local299 - local224) * local169;
			local151 = local281 + local169 * (local324 - local281);
		}
		local161 = this.aClass2_Sub20_2.method5740() - local15;
		local169 = this.aClass2_Sub20_2.method5739() - local29;
		local176 = this.aClass2_Sub20_2.method5741() - local23;
		local183 = (float) Math.sqrt((double) (local176 * local176 + local169 * local169 + local161 * local161));
		local190 = 1.0F / local183;
		local176 *= local190;
		local161 *= local190;
		local169 *= local190;
		local199 = local183 / (float) this.aClass2_Sub20_2.method5743();
		local208 = 1.0F - local199 * local199;
		if (local208 < (float) 0) {
			local208 = 0.0F;
		}
		local248 = local151 * local176 + local161 * local133 + local169 * local142;
		if (local248 < 0.0F) {
			local248 = 0.0F;
		}
		@Pc(533) float local533 = local208 * 2.0F * local248;
		if (local533 > 1.0F) {
			local533 = 1.0F;
		}
		@Pc(544) int local544 = this.aClass2_Sub20_2.method5735();
		@Pc(554) int local554 = (int) ((float) (local544 >> 16 & 0xFF) * local533);
		if (local554 > 255) {
			local554 = 255;
		}
		@Pc(571) int local571 = (int) (local533 * (float) (local544 >> 8 & 0xFF));
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local544 & 0xFF) * local533);
		if (this.aClass49_Sub2_30.aBoolean111) {
			this.aClass2_Sub23_Sub1_4.method3246((float) local15);
			this.aClass2_Sub23_Sub1_4.method3246((float) local29);
			this.aClass2_Sub23_Sub1_4.method3246((float) local23);
		} else {
			this.aClass2_Sub23_Sub1_4.method3249((float) local15);
			this.aClass2_Sub23_Sub1_4.method3249((float) local29);
			this.aClass2_Sub23_Sub1_4.method3249((float) local23);
		}
		if (local586 > 255) {
			local586 = 255;
		}
		this.aClass2_Sub23_Sub1_4.method5449(local554);
		this.aClass2_Sub23_Sub1_4.method5449(local571);
		this.aClass2_Sub23_Sub1_4.method5449(local586);
		this.aClass2_Sub23_Sub1_4.method5449(255);
		this.method4188(local75);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BS)V")
	private void method4188(@OriginalArg(1) short arg0) {
		if (this.aClass49_Sub2_30.aBoolean111) {
			this.aClass2_Sub23_7.method5502(arg0);
		} else {
			this.aClass2_Sub23_7.method5457(arg0);
		}
		this.anInt5219++;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I[[ZIII)V")
	public void method4189(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface10_5 == null || (arg2 + arg3 < this.anInt5221 || (this.anInt5214 < arg2 - arg3 || (arg1 + arg3 < this.anInt5224 || this.anInt5220 < arg1 - arg3)))) {
			return;
		}
		for (@Pc(56) int local56 = this.anInt5224; local56 <= this.anInt5220; local56++) {
			for (@Pc(68) int local68 = this.anInt5221; local68 <= this.anInt5214; local68++) {
				@Pc(75) int local75 = local68 - arg2;
				@Pc(79) int local79 = local56 - arg1;
				if (-arg3 < local75 && local75 < arg3 && local79 > -arg3 && local79 < arg3 && arg0[arg3 + local75][arg3 + local79]) {
					this.aClass49_Sub2_30.method1642((int) (this.aClass2_Sub20_2.method5737() * 255.0F) << 24);
					this.aClass49_Sub2_30.method1618(this.aClass260_16, this.aClass260_15, null, null);
					this.aClass49_Sub2_30.method1631(this.anInt5219, 0, this.anInterface10_5);
					return;
				}
			}
		}
	}
}
