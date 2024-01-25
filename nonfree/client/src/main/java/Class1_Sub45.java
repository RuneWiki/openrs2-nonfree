import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "I")
	private int anInt8045;

	@OriginalMember(owner = "client!sfa", name = "x", descriptor = "Lclient!vfa;")
	private final Class47_Sub3 aClass47_Sub3_3;

	@OriginalMember(owner = "client!sfa", name = "q", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_35;

	@OriginalMember(owner = "client!sfa", name = "n", descriptor = "Lclient!rc;")
	private final Class1_Sub18 aClass1_Sub18_3;

	@OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
	private final int anInt8053;

	@OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
	private final int anInt8048;

	@OriginalMember(owner = "client!sfa", name = "D", descriptor = "I")
	private final int anInt8052;

	@OriginalMember(owner = "client!sfa", name = "A", descriptor = "I")
	private final int anInt8050;

	@OriginalMember(owner = "client!sfa", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!sfa", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!sfa", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
	private int anInt8049;

	@OriginalMember(owner = "client!sfa", name = "r", descriptor = "Lclient!mo;")
	private Class1_Sub35 aClass1_Sub35_6;

	@OriginalMember(owner = "client!sfa", name = "t", descriptor = "Lclient!pd;")
	private Class1_Sub35_Sub1 aClass1_Sub35_Sub1_3;

	@OriginalMember(owner = "client!sfa", name = "G", descriptor = "Lclient!kea;")
	private Class187 aClass187_33;

	@OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lclient!vu;")
	private final Interface23 anInterface23_4;

	@OriginalMember(owner = "client!sfa", name = "C", descriptor = "Lclient!cd;")
	private final Interface5 anInterface5_6;

	@OriginalMember(owner = "client!sfa", name = "l", descriptor = "Lclient!lq;")
	private final Class213 aClass213_11;

	@OriginalMember(owner = "client!sfa", name = "v", descriptor = "Lclient!lq;")
	private final Class213 aClass213_12;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ok;Lclient!vfa;Lclient!rc;[I)V")
	public Class1_Sub45(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class47_Sub3 arg1, @OriginalArg(2) Class1_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass47_Sub3_3 = arg1;
		this.aClass134_Sub2_35 = arg0;
		this.aClass1_Sub18_3 = arg2;
		@Pc(22) int local22 = this.aClass1_Sub18_3.method4104() - (arg1.anInt9208 >> 1);
		this.anInt8053 = this.aClass1_Sub18_3.method4107() - local22 >> arg1.anInt9205;
		this.anInt8048 = this.aClass1_Sub18_3.method4107() + local22 >> arg1.anInt9205;
		this.anInt8052 = this.aClass1_Sub18_3.method4098() - local22 >> arg1.anInt9205;
		this.anInt8050 = local22 + this.aClass1_Sub18_3.method4098() >> arg1.anInt9205;
		@Pc(77) int local77 = this.anInt8048 + 1 - this.anInt8053;
		@Pc(86) int local86 = this.anInt8050 + 1 - this.anInt8052;
		this.aFloatArrayArray10 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(173) int local173;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt8052;
			if (local123 > 0 && local123 < this.aClass47_Sub3_3.anInt9210 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = this.anInt8053 + local137;
					if (local144 > 0 && local144 < this.aClass47_Sub3_3.anInt9209 - 1) {
						local173 = arg1.method7545(local144 + 1, local123) - arg1.method7545(local144 - 1, local123);
						local189 = arg1.method7545(local144, local123 + 1) - arg1.method7545(local144, local123 - 1);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local173 * local173 + 65536)));
						this.aFloatArrayArray11[local137][local115] = local204 * (float) local173;
						this.aFloatArrayArray10[local137][local115] = -256.0F * local204;
						this.aFloatArrayArray9[local137][local115] = local204 * (float) local189;
					}
				}
			}
		}
		local123 = 0;
		@Pc(307) int local307;
		for (local137 = this.anInt8052; local137 <= this.anInt8050; local137++) {
			if (local137 >= 0 && arg1.anInt9210 > local137) {
				for (local144 = this.anInt8053; local144 <= this.anInt8048; local144++) {
					if (local144 >= 0 && arg1.anInt9209 > local144) {
						local173 = arg3[local123];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray20[local144][local137];
						if (local295 != null && local173 != 0) {
							if (local173 == 1) {
								local307 = 0;
								while (local307 < local295.length) {
									if (local295[local307++] != -1 && local295[local307++] != -1 && local295[local307++] != -1) {
										this.anInt8049 += 3;
									}
								}
							} else {
								this.anInt8049 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt8048 - this.anInt8053;
			}
		}
		if (this.anInt8049 > 0) {
			this.aClass1_Sub35_6 = new Class1_Sub35(this.anInt8049 * 2);
			this.aClass1_Sub35_Sub1_3 = new Class1_Sub35_Sub1(this.anInt8049 * 16);
			this.aClass187_33 = new Class187(Static457.method6299(this.anInt8049));
			local123 = 0;
			local144 = 0;
			for (local173 = this.anInt8052; local173 <= this.anInt8050; local173++) {
				if (local173 >= 0 && arg1.anInt9210 > local173) {
					local189 = 0;
					for (local307 = this.anInt8053; local307 <= this.anInt8048; local307++) {
						if (local307 >= 0 && local307 < arg1.anInt9209) {
							@Pc(441) int local441 = arg3[local123];
							@Pc(448) int[] local448 = arg1.anIntArrayArrayArray20[local307][local173];
							if (local448 != null && local441 != 0) {
								if (local441 == 1) {
									@Pc(464) int[] local464 = arg1.anIntArrayArrayArray19[local307][local173];
									@Pc(471) int[] local471 = arg1.anIntArrayArrayArray17[local307][local173];
									@Pc(473) int local473 = 0;
									label107: while (true) {
										while (true) {
											if (local448.length <= local473) {
												break label107;
											}
											if (local448[local473] == -1 || local448[local473 + 1] == -1 || local448[local473 + 2] == -1) {
												local473 += 3;
											} else {
												this.method6480(local173, local189, local307, local144, local464[local473], local471[local473]);
												local473++;
												this.method6480(local173, local189, local307, local144, local464[local473], local471[local473]);
												local473++;
												this.method6480(local173, local189, local307, local144, local464[local473], local471[local473]);
												local473++;
											}
										}
									}
								} else if (local441 == 3) {
									this.method6480(local173, local189, local307, local144, 0, 0);
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, 0);
									this.method6480(local173, local189, local307, local144, 0, arg1.anInt9208);
								} else if (local441 == 2) {
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, 0);
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, arg1.anInt9208);
									this.method6480(local173, local189, local307, local144, 0, 0);
								} else if (local441 == 5) {
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, arg1.anInt9208);
									this.method6480(local173, local189, local307, local144, 0, arg1.anInt9208);
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, 0);
								} else if (local441 == 4) {
									this.method6480(local173, local189, local307, local144, 0, arg1.anInt9208);
									this.method6480(local173, local189, local307, local144, 0, 0);
									this.method6480(local173, local189, local307, local144, arg1.anInt9208, arg1.anInt9208);
								}
							}
						}
						local123++;
						local189++;
					}
				} else {
					local123 += this.anInt8048 - this.anInt8053;
				}
				local144++;
			}
			this.anInterface23_4 = this.aClass134_Sub2_35.method5223(this.aClass1_Sub35_6.aByteArray85, false, this.aClass1_Sub35_6.anInt7214);
			this.anInterface5_6 = this.aClass134_Sub2_35.method5270(false, this.aClass1_Sub35_Sub1_3.anInt7214, 16, this.aClass1_Sub35_Sub1_3.aByteArray85);
			this.aClass213_11 = new Class213(this.anInterface5_6, 5126, 3, 0);
			this.aClass213_12 = new Class213(this.anInterface5_6, 5121, 4, 12);
		} else {
			this.anInterface23_4 = null;
			this.aClass213_12 = null;
			this.aClass213_11 = null;
			this.anInterface5_6 = null;
		}
		this.aClass1_Sub35_Sub1_3 = null;
		this.aClass187_33 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray10 = this.aFloatArrayArray9 = null;
		this.aClass1_Sub35_6 = null;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIII[[Z)V")
	public void method6478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface23_4 == null || (arg0 + arg1 < this.anInt8053 || (arg0 - arg1 > this.anInt8048 || (arg2 + arg1 < this.anInt8052 || arg2 - arg1 > this.anInt8050)))) {
			return;
		}
		for (@Pc(62) int local62 = this.anInt8052; local62 <= this.anInt8050; local62++) {
			for (@Pc(67) int local67 = this.anInt8053; local67 <= this.anInt8048; local67++) {
				@Pc(73) int local73 = local67 - arg0;
				@Pc(78) int local78 = local62 - arg2;
				if (local73 > -arg1 && local73 < arg1 && local78 > -arg1 && arg1 > local78 && arg3[local73 + arg1][local78 + arg1]) {
					this.aClass134_Sub2_35.method5217((int) (this.aClass1_Sub18_3.method4099() * 255.0F) << 24);
					this.aClass134_Sub2_35.method5259(null, null, this.aClass213_12, this.aClass213_11);
					this.aClass134_Sub2_35.method5219(0, this.anInterface23_4, this.anInt8049);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IS)V")
	private void method6479(@OriginalArg(1) short arg0) {
		if (this.aClass134_Sub2_35.aBoolean517) {
			this.aClass1_Sub35_6.method5776(arg0);
		} else {
			this.aClass1_Sub35_6.method5767(arg0);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIII)V")
	private void method6480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass47_Sub3_3.anInt9205) + arg4;
		@Pc(23) int local23 = arg5 + (arg0 << this.aClass47_Sub3_3.anInt9205);
		@Pc(30) int local30 = this.aClass47_Sub3_3.method7550(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(61) Class1 local61 = this.aClass187_33.method3797(local7);
			if (local61 != null) {
				this.method6479(((Class1_Sub24) local61).aShort48);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt8045++;
		if (local7 != -1L) {
			this.aClass187_33.method3795(new Class1_Sub24(local79), local7);
		}
		@Pc(288) float local288;
		@Pc(297) float local297;
		@Pc(323) float local323;
		@Pc(143) float local143;
		@Pc(151) float local151;
		@Pc(158) float local158;
		@Pc(165) float local165;
		@Pc(172) float local172;
		@Pc(181) float local181;
		@Pc(190) float local190;
		@Pc(232) float local232;
		if (arg4 == 0 && arg5 == 0) {
			local297 = this.aFloatArrayArray10[arg1][arg3];
			local323 = this.aFloatArrayArray9[arg1][arg3];
			local288 = this.aFloatArrayArray11[arg1][arg3];
		} else if (arg4 == this.aClass47_Sub3_3.anInt9208 && arg5 == 0) {
			local323 = this.aFloatArrayArray9[arg1 + 1][arg3];
			local288 = this.aFloatArrayArray11[arg1 + 1][arg3];
			local297 = this.aFloatArrayArray10[arg1 + 1][arg3];
		} else if (arg4 == this.aClass47_Sub3_3.anInt9208 && arg5 == this.aClass47_Sub3_3.anInt9208) {
			local297 = this.aFloatArrayArray10[arg1 + 1][arg3 + 1];
			local323 = this.aFloatArrayArray9[arg1 + 1][arg3 + 1];
			local288 = this.aFloatArrayArray11[arg1 + 1][arg3 + 1];
		} else if (arg4 == 0 && this.aClass47_Sub3_3.anInt9208 == arg5) {
			local288 = this.aFloatArrayArray11[arg1][arg3 + 1];
			local297 = this.aFloatArrayArray10[arg1][arg3 + 1];
			local323 = this.aFloatArrayArray9[arg1][arg3 + 1];
		} else {
			local143 = (float) arg4 / (float) this.aClass47_Sub3_3.anInt9208;
			local151 = (float) arg5 / (float) this.aClass47_Sub3_3.anInt9208;
			local158 = this.aFloatArrayArray11[arg1][arg3];
			local165 = this.aFloatArrayArray10[arg1][arg3];
			local172 = this.aFloatArrayArray9[arg1][arg3];
			local181 = this.aFloatArrayArray11[arg1 + 1][arg3];
			local190 = this.aFloatArrayArray10[arg1 + 1][arg3];
			@Pc(208) float local208 = local190 + local143 * (this.aFloatArrayArray10[arg1 + 1][arg3 + 1] - local190);
			@Pc(223) float local223 = local158 + local143 * (this.aFloatArrayArray11[arg1][arg3 + 1] - local158);
			local232 = this.aFloatArrayArray9[arg1 + 1][arg3];
			@Pc(247) float local247 = local172 + (this.aFloatArrayArray9[arg1][arg3 + 1] - local172) * local143;
			@Pc(265) float local265 = local181 + local143 * (this.aFloatArrayArray11[arg1 + 1][arg3 + 1] - local181);
			@Pc(280) float local280 = local165 + (this.aFloatArrayArray10[arg1][arg3 + 1] - local165) * local143;
			local288 = local223 + local151 * (local265 - local223);
			local297 = (local208 - local280) * local151 + local280;
			@Pc(314) float local314 = local232 + (this.aFloatArrayArray9[arg1 + 1][arg3 + 1] - local232) * local143;
			local323 = local247 + local151 * (local314 - local247);
		}
		local143 = this.aClass1_Sub18_3.method4107() - local15;
		local151 = this.aClass1_Sub18_3.method4101() - local30;
		local158 = this.aClass1_Sub18_3.method4098() - local23;
		local165 = (float) Math.sqrt((double) (local158 * local158 + local151 * local151 + local143 * local143));
		local172 = 1.0F / local165;
		local143 *= local172;
		local151 *= local172;
		local158 *= local172;
		local181 = local165 / (float) this.aClass1_Sub18_3.method4104();
		local190 = 1.0F - local181 * local181;
		if (local190 < 0.0F) {
			local190 = 0.0F;
		}
		local232 = local297 * local151 + local143 * local288 + local323 * local158;
		if (local232 < 0.0F) {
			local232 = 0.0F;
		}
		@Pc(542) float local542 = local190 * 2.0F * local232;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass1_Sub18_3.method4102();
		@Pc(563) int local563 = (int) ((float) (local553 >> 16 & 0xFF) * local542);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(578) int local578 = (int) (local542 * (float) (local553 >> 8 & 0xFF));
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local553 & 0xFF) * local542);
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass134_Sub2_35.aBoolean517) {
			this.aClass1_Sub35_Sub1_3.method5571((float) local15);
			this.aClass1_Sub35_Sub1_3.method5571((float) local30);
			this.aClass1_Sub35_Sub1_3.method5571((float) local23);
		} else {
			this.aClass1_Sub35_Sub1_3.method5572((float) local15);
			this.aClass1_Sub35_Sub1_3.method5572((float) local30);
			this.aClass1_Sub35_Sub1_3.method5572((float) local23);
		}
		this.aClass1_Sub35_Sub1_3.method5777(local563);
		this.aClass1_Sub35_Sub1_3.method5777(local578);
		this.aClass1_Sub35_Sub1_3.method5777(local591);
		this.aClass1_Sub35_Sub1_3.method5777(255);
		this.method6479(local79);
	}
}
