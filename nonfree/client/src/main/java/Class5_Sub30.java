import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!km", name = "F", descriptor = "I")
	private int anInt5100;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!vt;")
	private final Class5_Sub11 aClass5_Sub11_3;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "Lclient!ru;")
	private final Class61_Sub2 aClass61_Sub2_1;

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_19;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "I")
	private final int anInt5095;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "I")
	private final int anInt5092;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "I")
	private final int anInt5093;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	private final int anInt5091;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!km", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!km", name = "u", descriptor = "Lclient!sda;")
	private final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Lclient!ak;")
	private final Class18 aClass18_4;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "Lclient!ak;")
	private final Class18 aClass18_5;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Lclient!js;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "Lclient!ofa;")
	private Class5_Sub22 aClass5_Sub22_4;

	@OriginalMember(owner = "client!km", name = "G", descriptor = "Lclient!og;")
	private Class5_Sub22_Sub2 aClass5_Sub22_Sub2_2;

	@OriginalMember(owner = "client!km", name = "w", descriptor = "Lclient!pl;")
	private Class273 aClass273_12;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!rs;Lclient!ru;Lclient!vt;[I)V")
	public Class5_Sub30(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class61_Sub2 arg1, @OriginalArg(2) Class5_Sub11 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub11_3 = arg2;
		this.aClass61_Sub2_1 = arg1;
		this.aClass133_Sub3_19 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub11_3.method8099() - (arg1.anInt10027 >> 1);
		this.anInt5095 = this.aClass5_Sub11_3.method8103() - local22 >> arg1.anInt10031;
		this.anInt5092 = this.aClass5_Sub11_3.method8103() + local22 >> arg1.anInt10031;
		this.anInt5093 = this.aClass5_Sub11_3.method8098() - local22 >> arg1.anInt10031;
		this.anInt5091 = local22 + this.aClass5_Sub11_3.method8098() >> arg1.anInt10031;
		@Pc(76) int local76 = this.anInt5092 + 1 - this.anInt5095;
		@Pc(85) int local85 = this.anInt5091 + 1 - this.anInt5093;
		this.aFloatArrayArray11 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(171) int local171;
		@Pc(188) int local188;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt5093;
			if (local121 > 0 && local121 < this.aClass61_Sub2_1.anInt10029 - 1) {
				for (local135 = 0; local135 <= local76; local135++) {
					local142 = local135 + this.anInt5095;
					if (local142 > 0 && this.aClass61_Sub2_1.anInt10026 - 1 > local142) {
						local171 = arg1.method8580(local121, local142 + 1) - arg1.method8580(local121, local142 - 1);
						local188 = arg1.method8580(local121 + 1, local142) - arg1.method8580(local121 - 1, local142);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local171 * local171 + 65536)));
						this.aFloatArrayArray9[local135][local114] = local203 * (float) local171;
						this.aFloatArrayArray11[local135][local114] = -256.0F * local203;
						this.aFloatArrayArray10[local135][local114] = (float) local188 * local203;
					}
				}
			}
		}
		local121 = 0;
		@Pc(311) int local311;
		for (local135 = this.anInt5093; local135 <= this.anInt5091; local135++) {
			if (local135 >= 0 && local135 < arg1.anInt10029) {
				for (local142 = this.anInt5095; local142 <= this.anInt5092; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt10026) {
						local171 = arg3[local121];
						@Pc(297) int[] local297 = arg1.anIntArrayArrayArray7[local142][local135];
						if (local297 != null && local171 != 0) {
							if (local171 == 1) {
								local311 = 0;
								while (local311 < local297.length) {
									if (local297[local311++] != -1 && local297[local311++] != -1 && local297[local311++] != -1) {
										this.anInt5097 += 3;
									}
								}
							} else {
								this.anInt5097 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt5092 - this.anInt5095;
			}
		}
		if (this.anInt5097 <= 0) {
			this.anInterface21_3 = null;
			this.aClass18_4 = null;
			this.aClass18_5 = null;
			this.anInterface10_3 = null;
		} else {
			this.aClass5_Sub22_4 = new Class5_Sub22(this.anInt5097 * 2);
			this.aClass5_Sub22_Sub2_2 = new Class5_Sub22_Sub2(this.anInt5097 * 16);
			this.aClass273_12 = new Class273(Static613.method8740(this.anInt5097));
			local142 = 0;
			local121 = 0;
			for (local171 = this.anInt5093; local171 <= this.anInt5091; local171++) {
				if (local171 >= 0 && local171 < arg1.anInt10029) {
					local188 = 0;
					for (local311 = this.anInt5095; local311 <= this.anInt5092; local311++) {
						if (local311 >= 0 && arg1.anInt10026 > local311) {
							@Pc(445) int local445 = arg3[local121];
							@Pc(452) int[] local452 = arg1.anIntArrayArrayArray7[local311][local171];
							if (local452 != null && local445 != 0) {
								if (local445 == 1) {
									@Pc(619) int[] local619 = arg1.anIntArrayArrayArray11[local311][local171];
									@Pc(626) int[] local626 = arg1.anIntArrayArrayArray8[local311][local171];
									@Pc(628) int local628 = 0;
									label106: while (true) {
										while (true) {
											if (local628 >= local452.length) {
												break label106;
											}
											if (local452[local628] == -1 || local452[local628 + 1] == -1 || local452[local628 + 2] == -1) {
												local628 += 3;
											} else {
												this.method4580(local311, local188, local626[local628], local142, local619[local628], local171);
												local628++;
												this.method4580(local311, local188, local626[local628], local142, local619[local628], local171);
												local628++;
												this.method4580(local311, local188, local626[local628], local142, local619[local628], local171);
												local628++;
											}
										}
									}
								} else if (local445 == 3) {
									this.method4580(local311, local188, 0, local142, 0, local171);
									this.method4580(local311, local188, 0, local142, arg1.anInt10027, local171);
									this.method4580(local311, local188, arg1.anInt10027, local142, 0, local171);
								} else if (local445 == 2) {
									this.method4580(local311, local188, 0, local142, arg1.anInt10027, local171);
									this.method4580(local311, local188, arg1.anInt10027, local142, arg1.anInt10027, local171);
									this.method4580(local311, local188, 0, local142, 0, local171);
								} else if (local445 == 5) {
									this.method4580(local311, local188, arg1.anInt10027, local142, arg1.anInt10027, local171);
									this.method4580(local311, local188, arg1.anInt10027, local142, 0, local171);
									this.method4580(local311, local188, 0, local142, arg1.anInt10027, local171);
								} else if (local445 == 4) {
									this.method4580(local311, local188, arg1.anInt10027, local142, 0, local171);
									this.method4580(local311, local188, 0, local142, 0, local171);
									this.method4580(local311, local188, arg1.anInt10027, local142, arg1.anInt10027, local171);
								}
							}
						}
						local121++;
						local188++;
					}
				} else {
					local121 += this.anInt5092 - this.anInt5095;
				}
				local142++;
			}
			this.anInterface21_3 = this.aClass133_Sub3_19.method7371(this.aClass5_Sub22_4.aByteArray71, false, this.aClass5_Sub22_4.anInt6629);
			this.anInterface10_3 = this.aClass133_Sub3_19.method7341(false, this.aClass5_Sub22_Sub2_2.anInt6629, this.aClass5_Sub22_Sub2_2.aByteArray71, 16);
			this.aClass18_5 = new Class18(this.anInterface10_3, 5126, 3, 0);
			this.aClass18_4 = new Class18(this.anInterface10_3, 5121, 4, 12);
		}
		this.aClass5_Sub22_Sub2_2 = null;
		this.aClass5_Sub22_4 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray11 = this.aFloatArrayArray10 = null;
		this.aClass273_12 = null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[[ZZ)V")
	public void method4579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface21_3 == null || (arg0 + arg1 < this.anInt5095 || (this.anInt5092 < arg0 - arg1 || (this.anInt5093 > arg1 + arg2 || this.anInt5091 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(48) int local48 = this.anInt5093; local48 <= this.anInt5091; local48++) {
			for (@Pc(53) int local53 = this.anInt5095; local53 <= this.anInt5092; local53++) {
				@Pc(60) int local60 = local53 - arg0;
				@Pc(65) int local65 = local48 - arg2;
				if (-arg1 < local60 && arg1 > local60 && local65 > -arg1 && local65 < arg1 && arg3[local60 + arg1][local65 + arg1]) {
					this.aClass133_Sub3_19.method7344((int) (this.aClass5_Sub11_3.method8101() * 255.0F) << 24);
					this.aClass133_Sub3_19.method7396(null, this.aClass18_4, null, this.aClass18_5);
					this.aClass133_Sub3_19.method7383(0, this.anInt5097, this.anInterface21_3);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
	private void method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg4 + (arg0 << this.aClass61_Sub2_1.anInt10031);
		@Pc(24) int local24 = arg2 + (arg5 << this.aClass61_Sub2_1.anInt10031);
		@Pc(33) int local33 = this.aClass61_Sub2_1.method8584(local24, local16);
		if ((arg4 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(65) Class5 local65 = this.aClass273_12.method6581(local7);
			if (local65 != null) {
				this.method4581(((Class5_Sub12) local65).aShort32);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt5100++;
		if (local7 != -1L) {
			this.aClass273_12.method6585(local7, new Class5_Sub12(local83));
		}
		@Pc(122) float local122;
		@Pc(115) float local115;
		@Pc(129) float local129;
		@Pc(260) float local260;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(289) float local289;
		@Pc(298) float local298;
		@Pc(307) float local307;
		@Pc(397) float local397;
		if (arg4 == 0 && arg2 == 0) {
			local115 = this.aFloatArrayArray11[arg1][arg3];
			local122 = this.aFloatArrayArray9[arg1][arg3];
			local129 = this.aFloatArrayArray10[arg1][arg3];
		} else if (arg4 == this.aClass61_Sub2_1.anInt10027 && arg2 == 0) {
			local115 = this.aFloatArrayArray11[arg1 + 1][arg3];
			local129 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local122 = this.aFloatArrayArray9[arg1 + 1][arg3];
		} else if (this.aClass61_Sub2_1.anInt10027 == arg4 && this.aClass61_Sub2_1.anInt10027 == arg2) {
			local122 = this.aFloatArrayArray9[arg1 + 1][arg3 + 1];
			local129 = this.aFloatArrayArray10[arg1 + 1][arg3 + 1];
			local115 = this.aFloatArrayArray11[arg1 + 1][arg3 + 1];
		} else if (arg4 == 0 && this.aClass61_Sub2_1.anInt10027 == arg2) {
			local129 = this.aFloatArrayArray10[arg1][arg3 + 1];
			local115 = this.aFloatArrayArray11[arg1][arg3 + 1];
			local122 = this.aFloatArrayArray9[arg1][arg3 + 1];
		} else {
			local260 = (float) arg4 / (float) this.aClass61_Sub2_1.anInt10027;
			local268 = (float) arg2 / (float) this.aClass61_Sub2_1.anInt10027;
			local275 = this.aFloatArrayArray9[arg1][arg3];
			local282 = this.aFloatArrayArray11[arg1][arg3];
			local289 = this.aFloatArrayArray10[arg1][arg3];
			local298 = this.aFloatArrayArray9[arg1 + 1][arg3];
			local307 = this.aFloatArrayArray11[arg1 + 1][arg3];
			@Pc(323) float local323 = local289 + (this.aFloatArrayArray10[arg1][arg3 + 1] - local289) * local260;
			@Pc(338) float local338 = local275 + (this.aFloatArrayArray9[arg1][arg3 + 1] - local275) * local260;
			@Pc(353) float local353 = local282 + local260 * (this.aFloatArrayArray11[arg1][arg3 + 1] - local282);
			@Pc(371) float local371 = local307 + local260 * (this.aFloatArrayArray11[arg1 + 1][arg3 + 1] - local307);
			@Pc(388) float local388 = local298 + local260 * (this.aFloatArrayArray9[arg1 + 1][arg3 + 1] - local298);
			local397 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local122 = local268 * (local388 - local338) + local338;
			local115 = local353 + (local371 - local353) * local268;
			@Pc(432) float local432 = local397 + (this.aFloatArrayArray10[arg1 + 1][arg3 + 1] - local397) * local260;
			local129 = local268 * (local432 - local323) + local323;
		}
		local260 = this.aClass5_Sub11_3.method8103() - local16;
		local268 = this.aClass5_Sub11_3.method8096() - local33;
		local275 = this.aClass5_Sub11_3.method8098() - local24;
		local282 = (float) Math.sqrt((double) (local275 * local275 + local260 * local260 + local268 * local268));
		local289 = 1.0F / local282;
		local260 *= local289;
		local268 *= local289;
		local275 *= local289;
		local298 = local282 / (float) this.aClass5_Sub11_3.method8099();
		local307 = 1.0F - local298 * local298;
		if (local307 < 0.0F) {
			local307 = 0.0F;
		}
		local397 = local268 * local115 + local260 * local122 + local275 * local129;
		if (local397 < 0.0F) {
			local397 = 0.0F;
		}
		@Pc(543) float local543 = local307 * 2.0F * local397;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass5_Sub11_3.method8102();
		@Pc(564) int local564 = (int) (local543 * (float) (local554 >> 16 & 0xFF));
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(579) int local579 = (int) ((float) (local554 >> 8 & 0xFF) * local543);
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(594) int local594 = (int) ((float) (local554 & 0xFF) * local543);
		if (local594 > 255) {
			local594 = 255;
		}
		if (this.aClass133_Sub3_19.aBoolean611) {
			this.aClass5_Sub22_Sub2_2.method5969((float) local16);
			this.aClass5_Sub22_Sub2_2.method5969((float) local33);
			this.aClass5_Sub22_Sub2_2.method5969((float) local24);
		} else {
			this.aClass5_Sub22_Sub2_2.method5970((float) local16);
			this.aClass5_Sub22_Sub2_2.method5970((float) local33);
			this.aClass5_Sub22_Sub2_2.method5970((float) local24);
		}
		this.aClass5_Sub22_Sub2_2.method5905(local564);
		this.aClass5_Sub22_Sub2_2.method5905(local579);
		this.aClass5_Sub22_Sub2_2.method5905(local594);
		this.aClass5_Sub22_Sub2_2.method5905(255);
		this.method4581(local83);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(SZ)V")
	private void method4581(@OriginalArg(0) short arg0) {
		if (this.aClass133_Sub3_19.aBoolean611) {
			this.aClass5_Sub22_4.method5918(arg0);
		} else {
			this.aClass5_Sub22_4.method5948(arg0);
		}
	}
}
