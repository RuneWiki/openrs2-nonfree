import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class3_Sub54 extends Class3 {

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "I")
	private int anInt10195;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!ct;")
	private final Class21_Sub2 aClass21_Sub2_3;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "Lclient!uca;")
	private final Class3_Sub15 aClass3_Sub15_3;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_43;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	private final int anInt10199;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "I")
	private final int anInt10193;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	private final int anInt10194;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	private final int anInt10192;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
	private int anInt10198;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "Lclient!jp;")
	private Class3_Sub25 aClass3_Sub25_10;

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "Lclient!uj;")
	private Class3_Sub25_Sub2 aClass3_Sub25_Sub2_3;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "Lclient!ee;")
	private Class83 aClass83_45;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "Lclient!m;")
	private final Interface17 anInterface17_5;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "Lclient!fha;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "Lclient!we;")
	private final Class381 aClass381_16;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!we;")
	private final Class381 aClass381_15;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!dia;Lclient!ct;Lclient!uca;[I)V")
	public Class3_Sub54(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class21_Sub2 arg1, @OriginalArg(2) Class3_Sub15 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass21_Sub2_3 = arg1;
		this.aClass3_Sub15_3 = arg2;
		this.aClass13_Sub2_43 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub15_3.method8378() - (arg1.anInt9123 >> 1);
		this.anInt10199 = this.aClass3_Sub15_3.method8384() - local22 >> arg1.anInt9125;
		this.anInt10193 = this.aClass3_Sub15_3.method8384() + local22 >> arg1.anInt9125;
		this.anInt10194 = this.aClass3_Sub15_3.method8383() - local22 >> arg1.anInt9125;
		this.anInt10192 = local22 + this.aClass3_Sub15_3.method8383() >> arg1.anInt9125;
		@Pc(78) int local78 = this.anInt10193 + 1 - this.anInt10199;
		@Pc(87) int local87 = this.anInt10192 + 1 - this.anInt10194;
		this.aFloatArrayArray16 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray14 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray15 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(177) int local177;
		@Pc(193) int local193;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt10194 + local116;
			if (local123 > 0 && this.aClass21_Sub2_3.anInt9128 - 1 > local123) {
				for (local141 = 0; local141 <= local78; local141++) {
					local148 = this.anInt10199 + local141;
					if (local148 > 0 && this.aClass21_Sub2_3.anInt9129 - 1 > local148) {
						local177 = arg1.method7973(local148 + 1, local123) - arg1.method7973(local148 - 1, local123);
						local193 = arg1.method7973(local148, local123 + 1) - arg1.method7973(local148, local123 - 1);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local193 * local193 + local177 * local177 + 65536)));
						this.aFloatArrayArray15[local141][local116] = local208 * (float) local177;
						this.aFloatArrayArray16[local141][local116] = -256.0F * local208;
						this.aFloatArrayArray14[local141][local116] = local208 * (float) local193;
					}
				}
			}
		}
		local123 = 0;
		@Pc(306) int local306;
		for (local141 = this.anInt10194; local141 <= this.anInt10192; local141++) {
			if (local141 >= 0 && arg1.anInt9128 > local141) {
				for (local148 = this.anInt10199; local148 <= this.anInt10193; local148++) {
					if (local148 >= 0 && local148 < arg1.anInt9129) {
						local177 = arg3[local123];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray5[local148][local141];
						if (local295 != null && local177 != 0) {
							if (local177 == 1) {
								local306 = 0;
								while (local306 < local295.length) {
									if (local295[local306++] != -1 && local295[local306++] != -1 && local295[local306++] != -1) {
										this.anInt10198 += 3;
									}
								}
							} else {
								this.anInt10198 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt10193 - this.anInt10199;
			}
		}
		if (this.anInt10198 > 0) {
			this.aClass3_Sub25_10 = new Class3_Sub25(this.anInt10198 * 2);
			this.aClass3_Sub25_Sub2_3 = new Class3_Sub25_Sub2(this.anInt10198 * 16);
			this.aClass83_45 = new Class83(Static282.method4521(this.anInt10198));
			local148 = 0;
			local123 = 0;
			for (local177 = this.anInt10194; local177 <= this.anInt10192; local177++) {
				if (local177 >= 0 && local177 < arg1.anInt9128) {
					local193 = 0;
					for (local306 = this.anInt10199; local306 <= this.anInt10193; local306++) {
						if (local306 >= 0 && arg1.anInt9129 > local306) {
							@Pc(457) int local457 = arg3[local123];
							@Pc(464) int[] local464 = arg1.anIntArrayArrayArray5[local306][local177];
							if (local464 != null && local457 != 0) {
								if (local457 == 1) {
									@Pc(480) int[] local480 = arg1.anIntArrayArrayArray2[local306][local177];
									@Pc(487) int[] local487 = arg1.anIntArrayArrayArray1[local306][local177];
									@Pc(489) int local489 = 0;
									label107: while (true) {
										while (true) {
											if (local464.length <= local489) {
												break label107;
											}
											if (local464[local489] == -1 || local464[local489 + 1] == -1 || local464[local489 + 2] == -1) {
												local489 += 3;
											} else {
												this.method8933(local480[local489], local148, local306, local177, local193, local487[local489]);
												local489++;
												this.method8933(local480[local489], local148, local306, local177, local193, local487[local489]);
												local489++;
												this.method8933(local480[local489], local148, local306, local177, local193, local487[local489]);
												local489++;
											}
										}
									}
								} else if (local457 == 3) {
									this.method8933(0, local148, local306, local177, local193, 0);
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, 0);
									this.method8933(0, local148, local306, local177, local193, arg1.anInt9123);
								} else if (local457 == 2) {
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, 0);
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, arg1.anInt9123);
									this.method8933(0, local148, local306, local177, local193, 0);
								} else if (local457 == 5) {
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, arg1.anInt9123);
									this.method8933(0, local148, local306, local177, local193, arg1.anInt9123);
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, 0);
								} else if (local457 == 4) {
									this.method8933(0, local148, local306, local177, local193, arg1.anInt9123);
									this.method8933(0, local148, local306, local177, local193, 0);
									this.method8933(arg1.anInt9123, local148, local306, local177, local193, arg1.anInt9123);
								}
							}
						}
						local193++;
						local123++;
					}
				} else {
					local123 += this.anInt10193 - this.anInt10199;
				}
				local148++;
			}
			this.anInterface17_5 = this.aClass13_Sub2_43.method1968(this.aClass3_Sub25_10.anInt9765, false, this.aClass3_Sub25_10.aByteArray106);
			this.anInterface9_6 = this.aClass13_Sub2_43.method1967(this.aClass3_Sub25_Sub2_3.anInt9765, this.aClass3_Sub25_Sub2_3.aByteArray106, false, 16);
			this.aClass381_16 = new Class381(this.anInterface9_6, 5126, 3, 0);
			this.aClass381_15 = new Class381(this.anInterface9_6, 5121, 4, 12);
		} else {
			this.anInterface9_6 = null;
			this.anInterface17_5 = null;
			this.aClass381_16 = null;
			this.aClass381_15 = null;
		}
		this.aFloatArrayArray15 = this.aFloatArrayArray16 = this.aFloatArrayArray14 = null;
		this.aClass83_45 = null;
		this.aClass3_Sub25_10 = null;
		this.aClass3_Sub25_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IS)V")
	private void method8929(@OriginalArg(1) short arg0) {
		if (this.aClass13_Sub2_43.aBoolean166) {
			this.aClass3_Sub25_10.method8649(arg0);
		} else {
			this.aClass3_Sub25_10.method8602(arg0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II[[ZII)V")
	public void method8931(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface17_5 == null || (arg2 + arg0 < this.anInt10199 || (this.anInt10193 < arg2 - arg0 || (this.anInt10194 > arg0 + arg3 || this.anInt10192 < arg3 - arg0)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt10194; local55 <= this.anInt10192; local55++) {
			for (@Pc(60) int local60 = this.anInt10199; local60 <= this.anInt10193; local60++) {
				@Pc(67) int local67 = local60 - arg2;
				@Pc(71) int local71 = local55 - arg3;
				if (local67 > -arg0 && local67 < arg0 && local71 > -arg0 && local71 < arg0 && arg1[local67 + arg0][local71 + arg0]) {
					this.aClass13_Sub2_43.method1962((int) (this.aClass3_Sub15_3.method8381() * 255.0F) << 24);
					this.aClass13_Sub2_43.method1971((Class381) null, this.aClass381_15, this.aClass381_16, (Class381) null);
					this.aClass13_Sub2_43.method1957(this.anInterface17_5, this.anInt10198, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V")
	private void method8933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = -1L;
		@Pc(19) int local19 = (arg2 << this.aClass21_Sub2_3.anInt9125) + arg0;
		@Pc(28) int local28 = arg5 + (arg3 << this.aClass21_Sub2_3.anInt9125);
		@Pc(35) int local35 = this.aClass21_Sub2_3.method7980(local28, local19);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local11 = (long) local28 << 16 & 0xFFFFL << 16 | (long) local19 & 0xFFFFL;
			@Pc(63) Class3 local63 = this.aClass83_45.method2368(local11);
			if (local63 != null) {
				this.method8929(((Class3_Sub53) local63).aShort112);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt10195++;
		if (local11 != -1L) {
			this.aClass83_45.method2377(local11, new Class3_Sub53(local81));
		}
		@Pc(121) float local121;
		@Pc(130) float local130;
		@Pc(139) float local139;
		@Pc(242) float local242;
		@Pc(250) float local250;
		@Pc(257) float local257;
		@Pc(264) float local264;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(289) float local289;
		@Pc(315) float local315;
		if (arg0 == 0 && arg5 == 0) {
			local130 = this.aFloatArrayArray16[arg4][arg1];
			local139 = this.aFloatArrayArray14[arg4][arg1];
			local121 = this.aFloatArrayArray15[arg4][arg1];
		} else if (this.aClass21_Sub2_3.anInt9123 == arg0 && arg5 == 0) {
			local121 = this.aFloatArrayArray15[arg4 + 1][arg1];
			local130 = this.aFloatArrayArray16[arg4 + 1][arg1];
			local139 = this.aFloatArrayArray14[arg4 + 1][arg1];
		} else if (arg0 == this.aClass21_Sub2_3.anInt9123 && this.aClass21_Sub2_3.anInt9123 == arg5) {
			local130 = this.aFloatArrayArray16[arg4 + 1][arg1 + 1];
			local139 = this.aFloatArrayArray14[arg4 + 1][arg1 + 1];
			local121 = this.aFloatArrayArray15[arg4 + 1][arg1 + 1];
		} else if (arg0 == 0 && this.aClass21_Sub2_3.anInt9123 == arg5) {
			local121 = this.aFloatArrayArray15[arg4][arg1 + 1];
			local139 = this.aFloatArrayArray14[arg4][arg1 + 1];
			local130 = this.aFloatArrayArray16[arg4][arg1 + 1];
		} else {
			local242 = (float) arg0 / (float) this.aClass21_Sub2_3.anInt9123;
			local250 = (float) arg5 / (float) this.aClass21_Sub2_3.anInt9123;
			local257 = this.aFloatArrayArray15[arg4][arg1];
			local264 = this.aFloatArrayArray16[arg4][arg1];
			local271 = this.aFloatArrayArray14[arg4][arg1];
			local280 = this.aFloatArrayArray15[arg4 + 1][arg1];
			local289 = this.aFloatArrayArray16[arg4 + 1][arg1];
			@Pc(306) float local306 = local280 + local242 * (this.aFloatArrayArray15[arg4 + 1][arg1 + 1] - local280);
			local315 = this.aFloatArrayArray14[arg4 + 1][arg1];
			@Pc(331) float local331 = local264 + local242 * (this.aFloatArrayArray16[arg4][arg1 + 1] - local264);
			@Pc(347) float local347 = local271 + local242 * (this.aFloatArrayArray14[arg4][arg1 + 1] - local271);
			@Pc(363) float local363 = local257 + local242 * (this.aFloatArrayArray15[arg4][arg1 + 1] - local257);
			@Pc(380) float local380 = local289 + (this.aFloatArrayArray16[arg4 + 1][arg1 + 1] - local289) * local242;
			local130 = local250 * (local380 - local331) + local331;
			local121 = local250 * (local306 - local363) + local363;
			@Pc(413) float local413 = local315 + (this.aFloatArrayArray14[arg4 + 1][arg1 + 1] - local315) * local242;
			local139 = local347 + local250 * (local413 - local347);
		}
		local242 = (float) (this.aClass3_Sub15_3.method8384() - local19);
		local250 = (float) (this.aClass3_Sub15_3.method8380() - local35);
		local257 = (float) (this.aClass3_Sub15_3.method8383() - local28);
		local264 = (float) Math.sqrt((double) (local257 * local257 + local242 * local242 + local250 * local250));
		local271 = 1.0F / local264;
		local250 *= local271;
		local242 *= local271;
		local257 *= local271;
		local280 = local264 / (float) this.aClass3_Sub15_3.method8378();
		local289 = 1.0F - local280 * local280;
		if (local289 < 0.0F) {
			local289 = 0.0F;
		}
		local315 = local257 * local139 + local121 * local242 + local130 * local250;
		if (local315 < 0.0F) {
			local315 = 0.0F;
		}
		@Pc(551) float local551 = local289 * local315 * 2.0F;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass3_Sub15_3.method8377();
		@Pc(572) int local572 = (int) ((float) (local562 >> 16 & 0xFF) * local551);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) ((float) (local562 >> 8 & 0xFF) * local551);
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(604) int local604 = (int) ((float) (local562 & 0xFF) * local551);
		if (this.aClass13_Sub2_43.aBoolean166) {
			this.aClass3_Sub25_Sub2_3.method8652((float) local19);
			this.aClass3_Sub25_Sub2_3.method8652((float) local35);
			this.aClass3_Sub25_Sub2_3.method8652((float) local28);
		} else {
			this.aClass3_Sub25_Sub2_3.method8653((float) local19);
			this.aClass3_Sub25_Sub2_3.method8653((float) local35);
			this.aClass3_Sub25_Sub2_3.method8653((float) local28);
		}
		if (local604 > 255) {
			local604 = 255;
		}
		this.aClass3_Sub25_Sub2_3.method8614(local572);
		this.aClass3_Sub25_Sub2_3.method8614(local589);
		this.aClass3_Sub25_Sub2_3.method8614(local604);
		this.aClass3_Sub25_Sub2_3.method8614(255);
		this.method8929(local81);
	}
}
