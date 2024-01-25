import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
	private int anInt2302;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_10;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!be;")
	private final Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Lclient!e;")
	private final Class55_Sub1 aClass55_Sub1_2;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	private final int anInt2292;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	private final int anInt2300;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	private final int anInt2298;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!nj;")
	private Class3_Sub25 aClass3_Sub25_1;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!ns;")
	private Class3_Sub25_Sub2 aClass3_Sub25_Sub2_2;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!lp;")
	private Class140 aClass140_20;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!vf;")
	private final Interface13 anInterface13_3;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!ms;")
	private final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "Lclient!m;")
	private final Class145 aClass145_9;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!m;")
	private final Class145 aClass145_8;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!nq;Lclient!e;Lclient!be;[I)V")
	public Class3_Sub19(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class55_Sub1 arg1, @OriginalArg(2) Class3_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass167_Sub1_10 = arg0;
		this.aClass3_Sub7_1 = arg2;
		this.aClass55_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass3_Sub7_1.method2478() - (arg1.anInt4610 >> 1);
		this.anInt2292 = this.aClass3_Sub7_1.method2483() - local22 >> arg1.anInt4615;
		this.anInt2300 = local22 + this.aClass3_Sub7_1.method2483() >> arg1.anInt4615;
		this.anInt2304 = this.aClass3_Sub7_1.method2481() - local22 >> arg1.anInt4615;
		this.anInt2298 = this.aClass3_Sub7_1.method2481() + local22 >> arg1.anInt4615;
		@Pc(77) int local77 = this.anInt2300 + 1 - this.anInt2292;
		@Pc(86) int local86 = this.anInt2298 + 1 - this.anInt2304;
		this.aFloatArrayArray5 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(185) int local185;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt2304;
			if (local122 > 0 && this.aClass55_Sub1_2.anInt4611 - 1 > local122) {
				for (local136 = 0; local136 <= local77; local136++) {
					local143 = local136 + this.anInt2292;
					if (local143 > 0 && local143 < this.aClass55_Sub1_2.anInt4614 - 1) {
						local170 = arg1.oa(local143 + 1, local122) - arg1.oa(local143 - 1, local122);
						local185 = arg1.oa(local143, local122 + 1) - arg1.oa(local143, local122 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local170 * local170 + 65536)));
						this.aFloatArrayArray6[local136][local115] = local200 * (float) local170;
						this.aFloatArrayArray7[local136][local115] = -256.0F * local200;
						this.aFloatArrayArray5[local136][local115] = (float) local185 * local200;
					}
				}
			}
		}
		local122 = 0;
		local136 = 0;
		for (local143 = this.anInt2304; local143 <= this.anInt2298; local143++) {
			if (local143 >= 0 && local143 < arg1.anInt4611) {
				for (local170 = this.anInt2292; local170 <= this.anInt2300; local170++) {
					if (local170 >= 0 && arg1.anInt4614 > local170) {
						local185 = arg3[local136];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray5[local170][local143];
						if (local295 != null && local185 != 0) {
							if (local185 == 1) {
								local122 += local295.length;
							} else {
								local122 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt2300 - this.anInt2292;
			}
		}
		if (local122 > 0) {
			this.aClass3_Sub25_1 = new Class3_Sub25(local122 * 2);
			this.aClass3_Sub25_Sub2_2 = new Class3_Sub25_Sub2(local122 * 16);
			this.aClass140_20 = new Class140(Static342.method4774(local122));
			local136 = 0;
			local170 = 0;
			for (local185 = this.anInt2304; local185 <= this.anInt2298; local185++) {
				if (local185 >= 0 && arg1.anInt4611 > local185) {
					@Pc(388) int local388 = 0;
					for (@Pc(391) int local391 = this.anInt2292; local391 <= this.anInt2300; local391++) {
						if (local391 >= 0 && local391 < arg1.anInt4614) {
							@Pc(406) int local406 = arg3[local136];
							@Pc(413) int[] local413 = arg1.anIntArrayArrayArray5[local391][local185];
							@Pc(420) int[] local420 = arg1.anIntArrayArrayArray3[local391][local185];
							if (local413 != null && local406 != 0) {
								if (local406 == 1) {
									for (@Pc(578) int local578 = 0; local578 < local413.length; local578++) {
										this.method1991(local185, local170, local391, local388, local413[local578], local420[local578]);
									}
								} else if (local406 == 3) {
									this.method1991(local185, local170, local391, local388, 0, 0);
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, 0);
									this.method1991(local185, local170, local391, local388, 0, arg1.anInt4610);
								} else if (local406 == 2) {
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, 0);
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, arg1.anInt4610);
									this.method1991(local185, local170, local391, local388, 0, 0);
								} else if (local406 == 5) {
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, arg1.anInt4610);
									this.method1991(local185, local170, local391, local388, 0, arg1.anInt4610);
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, 0);
								} else if (local406 == 4) {
									this.method1991(local185, local170, local391, local388, 0, arg1.anInt4610);
									this.method1991(local185, local170, local391, local388, 0, 0);
									this.method1991(local185, local170, local391, local388, arg1.anInt4610, arg1.anInt4610);
								}
							}
						}
						local136++;
						local388++;
					}
				} else {
					local136 += this.anInt2300 - this.anInt2292;
				}
				local170++;
			}
			this.anInterface13_3 = this.aClass167_Sub1_10.method4047(false, this.aClass3_Sub25_1.anInt4974, this.aClass3_Sub25_1.aByteArray88);
			this.anInterface9_3 = this.aClass167_Sub1_10.method4001(this.aClass3_Sub25_Sub2_2.aByteArray88, this.aClass3_Sub25_Sub2_2.anInt4974, false, 16);
			this.aClass145_9 = new Class145(this.anInterface9_3, 5126, 3, 0);
			this.aClass145_8 = new Class145(this.anInterface9_3, 5121, 4, 12);
		} else {
			this.anInterface13_3 = null;
			this.anInterface9_3 = null;
			this.aClass145_9 = null;
			this.aClass145_8 = null;
		}
		this.aClass3_Sub25_1 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray5 = null;
		this.aClass140_20 = null;
		this.aClass3_Sub25_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([[ZIIII)V")
	public void method1986(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface13_3 == null || (this.anInt2292 > arg2 + arg1 || (this.anInt2300 < arg1 - arg2 || (this.anInt2304 > arg2 + arg3 || arg3 - arg2 > this.anInt2298)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt2304; local50 <= this.anInt2298; local50++) {
			for (@Pc(55) int local55 = this.anInt2292; local55 <= this.anInt2300; local55++) {
				@Pc(62) int local62 = local55 - arg1;
				@Pc(67) int local67 = local50 - arg3;
				if (-arg2 < local62 && arg2 > local62 && local67 > -arg2 && local67 < arg2 && arg0[arg2 + local62][local67 + arg2]) {
					this.aClass167_Sub1_10.method4026((int) (this.aClass3_Sub7_1.method2479() * 255.0F) << 24);
					this.aClass167_Sub1_10.method4045(this.aClass145_9, null, null, this.aClass145_8);
					this.aClass167_Sub1_10.method4018(0, this.anInt2293, this.anInterface13_3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BS)V")
	private void method1989(@OriginalArg(1) short arg0) {
		if (this.aClass167_Sub1_10.aBoolean349) {
			this.aClass3_Sub25_1.method4123(arg0);
		} else {
			this.aClass3_Sub25_1.method4120(arg0);
		}
		this.anInt2293++;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
	private void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass55_Sub1_2.anInt4615) + arg4;
		@Pc(23) int local23 = (arg0 << this.aClass55_Sub1_2.anInt4615) + arg5;
		@Pc(29) int local29 = this.aClass55_Sub1_2.R(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local23 << 16 | (long) local15 & 0xFFFFL;
			@Pc(57) Class3 local57 = this.aClass140_20.method3490(local7);
			if (local57 != null) {
				this.method1989(((Class3_Sub20) local57).aShort27);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt2302++;
		if (local7 != -1L) {
			this.aClass140_20.method3494(local7, new Class3_Sub20(local75));
		}
		@Pc(127) float local127;
		@Pc(136) float local136;
		@Pc(118) float local118;
		@Pc(234) float local234;
		@Pc(242) float local242;
		@Pc(249) float local249;
		@Pc(256) float local256;
		@Pc(263) float local263;
		@Pc(272) float local272;
		@Pc(281) float local281;
		@Pc(321) float local321;
		if (arg4 == 0 && arg5 == 0) {
			local136 = this.aFloatArrayArray7[arg3][arg1];
			local118 = this.aFloatArrayArray5[arg3][arg1];
			local127 = this.aFloatArrayArray6[arg3][arg1];
		} else if (arg4 == this.aClass55_Sub1_2.anInt4610 && arg5 == 0) {
			local118 = this.aFloatArrayArray5[arg3 + 1][arg1];
			local127 = this.aFloatArrayArray6[arg3 + 1][arg1];
			local136 = this.aFloatArrayArray7[arg3 + 1][arg1];
		} else if (arg4 == this.aClass55_Sub1_2.anInt4610 && this.aClass55_Sub1_2.anInt4610 == arg5) {
			local136 = this.aFloatArrayArray7[arg3 + 1][arg1 + 1];
			local127 = this.aFloatArrayArray6[arg3 + 1][arg1 + 1];
			local118 = this.aFloatArrayArray5[arg3 + 1][arg1 + 1];
		} else if (arg4 == 0 && arg5 == this.aClass55_Sub1_2.anInt4610) {
			local118 = this.aFloatArrayArray5[arg3][arg1 + 1];
			local136 = this.aFloatArrayArray7[arg3][arg1 + 1];
			local127 = this.aFloatArrayArray6[arg3][arg1 + 1];
		} else {
			local234 = (float) arg4 / (float) this.aClass55_Sub1_2.anInt4610;
			local242 = (float) arg5 / (float) this.aClass55_Sub1_2.anInt4610;
			local249 = this.aFloatArrayArray6[arg3][arg1];
			local256 = this.aFloatArrayArray7[arg3][arg1];
			local263 = this.aFloatArrayArray5[arg3][arg1];
			local272 = this.aFloatArrayArray6[arg3 + 1][arg1];
			local281 = this.aFloatArrayArray7[arg3 + 1][arg1];
			@Pc(297) float local297 = local249 + (this.aFloatArrayArray6[arg3][arg1 + 1] - local249) * local234;
			@Pc(312) float local312 = local263 + local234 * (this.aFloatArrayArray5[arg3][arg1 + 1] - local263);
			local321 = this.aFloatArrayArray5[arg3 + 1][arg1];
			@Pc(339) float local339 = local272 + (this.aFloatArrayArray6[arg3 + 1][arg1 + 1] - local272) * local234;
			@Pc(355) float local355 = local256 + (this.aFloatArrayArray7[arg3][arg1 + 1] - local256) * local234;
			@Pc(372) float local372 = local281 + (this.aFloatArrayArray7[arg3 + 1][arg1 + 1] - local281) * local234;
			local127 = local297 + local242 * (local339 - local297);
			local136 = (local372 - local355) * local242 + local355;
			@Pc(408) float local408 = local321 + local234 * (this.aFloatArrayArray5[arg3 + 1][arg1 + 1] - local321);
			local118 = (local408 - local312) * local242 + local312;
		}
		local234 = this.aClass3_Sub7_1.method2483() - local15;
		local242 = this.aClass3_Sub7_1.method2476() - local29;
		local249 = this.aClass3_Sub7_1.method2481() - local23;
		local256 = (float) Math.sqrt((double) (local234 * local234 + local242 * local242 + local249 * local249));
		local263 = 1.0F / local256;
		local249 *= local263;
		local234 *= local263;
		local242 *= local263;
		local272 = local256 / (float) this.aClass3_Sub7_1.method2478();
		local281 = 1.0F - local272 * local272;
		if (local281 < 0.0F) {
			local281 = 0.0F;
		}
		local321 = local249 * local118 + local136 * local242 + local127 * local234;
		if (local321 < 0.0F) {
			local321 = 0.0F;
		}
		@Pc(541) float local541 = local281 * local321 * 2.0F;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass3_Sub7_1.method2480();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(579) int local579 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(592) int local592 = (int) (local541 * (float) (local552 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		if (this.aClass167_Sub1_10.aBoolean349) {
			this.aClass3_Sub25_Sub2_2.method4128((float) local15);
			this.aClass3_Sub25_Sub2_2.method4128((float) local29);
			this.aClass3_Sub25_Sub2_2.method4128((float) local23);
		} else {
			this.aClass3_Sub25_Sub2_2.method4130((float) local15);
			this.aClass3_Sub25_Sub2_2.method4130((float) local29);
			this.aClass3_Sub25_Sub2_2.method4130((float) local23);
		}
		this.aClass3_Sub25_Sub2_2.method4081(local562);
		this.aClass3_Sub25_Sub2_2.method4081(local579);
		this.aClass3_Sub25_Sub2_2.method4081(local592);
		this.aClass3_Sub25_Sub2_2.method4081(255);
		this.method1989(local75);
	}
}
