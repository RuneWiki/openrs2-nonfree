import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class318 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "[I")
	private final int[] anIntArray601 = new int[64];

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
	private int anInt8469 = 0;

	@OriginalMember(owner = "client!tfa", name = "o", descriptor = "[[Lclient!mm;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray4 = new Class6_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "[[Lclient!mm;")
	private final Class6_Sub3_Sub1[][] aClass6_Sub3_Sub1ArrayArray3 = new Class6_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!tfa", name = "r", descriptor = "[I")
	private final int[] anIntArray602 = new int[1600];

	@OriginalMember(owner = "client!tfa", name = "s", descriptor = "[I")
	private final int[] anIntArray603 = new int[8191];

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lclient!mq;")
	private final Class199 aClass199_20;

	@OriginalMember(owner = "client!tfa", name = "v", descriptor = "Lclient!nba;")
	private final Interface16 anInterface16_15;

	@OriginalMember(owner = "client!tfa", name = "l", descriptor = "Lclient!nba;")
	private final Interface16 anInterface16_14;

	@OriginalMember(owner = "client!tfa", name = "t", descriptor = "Lclient!hh;")
	private final Interface11 anInterface11_8;

	static {
		new Class269("", 76);
	}

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class318(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass199_20 = arg0.method4853(new Class89[] { new Class89(new Class181[] { Static263.aClass181_1, Static263.aClass181_3, Static263.aClass181_5 }), new Class89(Static263.aClass181_2) });
		this.anInterface16_15 = arg0.method4837(true);
		this.anInterface16_14 = arg0.method4837(false);
		this.anInterface16_14.method5776(12, 393168);
		this.anInterface11_8 = arg0.method4777(false);
		this.anInterface11_8.method4117(49146);
		@Pc(98) Buffer local98 = this.anInterface11_8.method4114();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4834(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.c();
			this.anInterface11_8.method4118();
		}
		@Pc(200) Buffer local200 = this.anInterface16_14.method5775();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method4834(local200);
			if (Stream.a()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
				}
			}
			local207.c();
			this.anInterface16_14.method5774();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BLclient!en;)V")
	private void method7039(@OriginalArg(1) Class100_Sub1 arg0) {
		Static224.aFloat128 = arg0.aFloat166;
		arg0.method4828();
		arg0.method4835(false);
		arg0.method4871(false);
		arg0.method4799();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!en;)V")
	private void method7041(@OriginalArg(1) int arg0, @OriginalArg(2) Class100_Sub1 arg1) {
		Static224.aFloat128 = arg1.aFloat166;
		arg1.method4844((float) arg0);
		arg1.method4833();
		arg1.method4835(false);
		arg1.method4871(false);
		arg1.method4799();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!en;)V")
	private void method7042(@OriginalArg(1) Class100_Sub1 arg0) {
		arg0.method4871(true);
		arg0.method4835(true);
		if (arg0.aFloat166 != Static224.aFloat128) {
			arg0.ra(Static224.aFloat128);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(BLclient!en;)V")
	public void method7044(@OriginalArg(1) Class100_Sub1 arg0) {
		this.anInterface16_15.method5776(24, 786336);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!en;Lclient!ir;)V")
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(2) Class100_Sub1 arg1, @OriginalArg(3) Class164 arg2) {
		if (arg1.aClass68_Sub2_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method7041(arg0, arg1);
		} else {
			this.method7039(arg1);
		}
		@Pc(26) float local26 = arg1.aClass68_Sub2_16.aFloat185;
		@Pc(30) float local30 = arg1.aClass68_Sub2_16.aFloat190;
		@Pc(34) float local34 = arg1.aClass68_Sub2_16.aFloat186;
		@Pc(38) float local38 = arg1.aClass68_Sub2_16.aFloat183;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class6_Sub3 local48 = arg2.aClass234_1.aClass6_Sub3_7;
			@Pc(51) Class6_Sub3 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass6_Sub3_10; local51 != local48; local51 = local51.aClass6_Sub3_10) {
				@Pc(56) Class6_Sub3_Sub1 local56 = (Class6_Sub3_Sub1) local51;
				local83 = (int) (local38 + (float) (local56.anInt2917 >> 12) * local34 + (float) (local56.anInt2921 >> 12) * local26 + (float) (local56.anInt2919 >> 12) * local30);
				if (local44 < local83) {
					local44 = local83;
				}
				if (local42 > local83) {
					local42 = local83;
				}
				this.anIntArray603[local40++] = local83;
			}
			@Pc(114) int local114 = local44 - local42;
			if (local114 + 2 <= 1600) {
				local83 = 0;
				local114 += 2;
			} else {
				local83 = Static233.method3626(local114) + 1 - Static66.anInt8594;
				local114 = (local114 >> local83) + 2;
			}
			local40 = 0;
			local51 = local48.aClass6_Sub3_10;
			@Pc(146) int local146 = -2;
			@Pc(148) boolean local148 = true;
			@Pc(150) boolean local150 = true;
			while (local51 != local48) {
				this.anInt8469 = 0;
				for (@Pc(157) int local157 = 0; local157 < local114; local157++) {
					this.anIntArray602[local157] = 0;
				}
				for (@Pc(170) int local170 = 0; local170 < 64; local170++) {
					this.anIntArray601[local170] = 0;
				}
				while (local51 != local48) {
					@Pc(186) Class6_Sub3_Sub1 local186 = (Class6_Sub3_Sub1) local51;
					if (local150) {
						local146 = local186.anInt2924;
						local148 = local186.aBoolean238;
						local150 = false;
					}
					if (local40 > 0 && (local146 != local186.anInt2924 || local186.aBoolean238 != local148)) {
						local150 = true;
						break;
					}
					@Pc(225) int local225 = this.anIntArray603[local40++] - local42 >> local83;
					if (local225 < 1600) {
						if (this.anIntArray602[local225] >= 64) {
							label102: {
								if (this.anIntArray602[local225] == 64) {
									if (this.anInt8469 == 64) {
										break label102;
									}
									this.anIntArray602[local225] += this.anInt8469++ + 1;
								}
								@Pc(275) Class6_Sub3_Sub1[] local275 = this.aClass6_Sub3_Sub1ArrayArray4[this.anIntArray602[local225] - 64 - 1];
								@Pc(285) int local285 = this.anIntArray602[local225] - 1 - 64;
								@Pc(287) int local287 = this.anIntArray601[this.anIntArray602[local225] - 1 - 64];
								this.anIntArray601[local285] = this.anIntArray601[this.anIntArray602[local225] - 1 - 64] + 1;
								local275[local287] = local186;
							}
						} else {
							this.aClass6_Sub3_Sub1ArrayArray3[local225][this.anIntArray602[local225]++] = local186;
						}
					}
					local51 = local51.aClass6_Sub3_10;
				}
				arg1.method4761(local146 < 0 ? -1 : local146, false, false);
				if (local148 && arg1.aFloat166 != Static224.aFloat128) {
					arg1.ra(Static224.aFloat128);
				} else if (arg1.aFloat166 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method7046(arg1, local114);
			}
		} catch (@Pc(359) Exception local359) {
		}
		this.method7042(arg1);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!en;IB)V")
	private void method7046(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		@Pc(19) Class68_Sub2 local19 = arg0.method4842();
		@Pc(22) float local22 = local19.aFloat187;
		@Pc(25) float local25 = local19.aFloat181;
		@Pc(28) float local28 = local19.aFloat191;
		@Pc(31) float local31 = local19.aFloat189;
		@Pc(34) float local34 = local19.aFloat188;
		@Pc(37) float local37 = local19.aFloat184;
		@Pc(41) float local41 = local31 + local22;
		@Pc(45) float local45 = local34 + local25;
		@Pc(49) float local49 = local37 + local28;
		@Pc(54) float local54 = local22 - local31;
		@Pc(58) float local58 = local25 - local34;
		@Pc(63) float local63 = local28 - local37;
		@Pc(68) float local68 = local31 - local22;
		@Pc(73) float local73 = local34 - local25;
		@Pc(78) float local78 = local37 - local28;
		@Pc(84) Buffer local84 = this.anInterface16_15.method5775();
		if (local84 == null) {
			return;
		}
		@Pc(92) Stream local92 = arg0.method4834(local84);
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(130) Class6_Sub3_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(443) float local443;
		@Pc(448) int local448;
		@Pc(388) int local388;
		@Pc(404) Class6_Sub3_Sub1 local404;
		@Pc(407) int local407;
		@Pc(420) byte local420;
		@Pc(425) byte local425;
		@Pc(437) float local437;
		if (Stream.a()) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray602[local98] <= 64 ? this.anIntArray602[local98] : 64;
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local130 = this.aClass6_Sub3_Sub1ArrayArray3[local98][local121];
						local133 = local130.anInt2915;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt2921 >> 12;
						local163 = local130.anInt2919 >> 12;
						local169 = local130.anInt2917 >> 12;
						local174 = local130.anInt2914 >> 12;
						local92.a(local157 + (float) -local174 * local41);
						local92.a(local163 + local45 * (float) -local174);
						local92.a(local169 + local49 * (float) -local174);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.a(0.0F);
						local92.a(0.0F);
						local92.a((float) local174 * local54 + local157);
						local92.a(local163 + (float) local174 * local58);
						local92.a(local169 + (float) local174 * local63);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.a(1.0F);
						local92.a(0.0F);
						local92.a(local41 * (float) local174 + local157);
						local92.a((float) local174 * local45 + local163);
						local92.a((float) local174 * local49 + local169);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.a(1.0F);
						local92.a(1.0F);
						local92.a(local68 * (float) local174 + local157);
						local92.a(local163 + local73 * (float) local174);
						local92.a(local169 + (float) local174 * local78);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.a(0.0F);
						local15++;
						local92.a(1.0F);
					}
					if (this.anIntArray602[local98] > 64) {
						local388 = this.anIntArray602[local98] - 65;
						for (local133 = this.anIntArray601[local388] - 1; local133 >= 0; local133--) {
							local404 = this.aClass6_Sub3_Sub1ArrayArray4[local388][local133];
							local407 = local404.anInt2915;
							local146 = (byte) (local407 >> 16);
							local151 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local169 = local404.anInt2921 >> 12;
							local437 = local404.anInt2919 >> 12;
							local443 = local404.anInt2917 >> 12;
							local448 = local404.anInt2914 >> 12;
							local92.a(local169 + local41 * (float) -local448);
							local92.a(local437 + (float) -local448 * local45);
							local92.a(local443 + (float) -local448 * local49);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.a(0.0F);
							local92.a(0.0F);
							local92.a((float) local448 * local54 + local169);
							local92.a(local437 + (float) local448 * local58);
							local92.a(local443 + local63 * (float) local448);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.a(1.0F);
							local92.a(0.0F);
							local92.a(local41 * (float) local448 + local169);
							local92.a(local45 * (float) local448 + local437);
							local92.a(local49 * (float) local448 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.a(1.0F);
							local92.a(1.0F);
							local92.a(local169 + local68 * (float) local448);
							local92.a(local437 + (float) local448 * local73);
							local92.a((float) local448 * local78 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.a(0.0F);
							local92.a(1.0F);
							local15++;
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray602[local98] > 64 ? 64 : this.anIntArray602[local98];
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local130 = this.aClass6_Sub3_Sub1ArrayArray3[local98][local121];
						local133 = local130.anInt2915;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt2921 >> 12;
						local163 = local130.anInt2919 >> 12;
						local169 = local130.anInt2917 >> 12;
						local174 = local130.anInt2914 >> 12;
						local92.b((float) -local174 * local41 + local157);
						local92.b((float) -local174 * local45 + local163);
						local92.b(local49 * (float) -local174 + local169);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.b(0.0F);
						local92.b(0.0F);
						local92.b(local157 + local54 * (float) local174);
						local92.b(local163 + local58 * (float) local174);
						local92.b(local63 * (float) local174 + local169);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.b(1.0F);
						local92.b(0.0F);
						local92.b((float) local174 * local41 + local157);
						local92.b(local45 * (float) local174 + local163);
						local92.b(local169 + (float) local174 * local49);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.b(1.0F);
						local92.b(1.0F);
						local92.b(local157 + local68 * (float) local174);
						local92.b(local163 + local73 * (float) local174);
						local92.b((float) local174 * local78 + local169);
						if (arg0.anInt5791 == 0) {
							local92.b(local138, local143, local146, local151);
						} else {
							local92.a(local138, local143, local146, local151);
						}
						local92.b(0.0F);
						local92.b(1.0F);
						local15++;
					}
					if (this.anIntArray602[local98] > 64) {
						local388 = this.anIntArray602[local98] - 65;
						for (local133 = this.anIntArray601[local388] - 1; local133 >= 0; local133--) {
							local404 = this.aClass6_Sub3_Sub1ArrayArray4[local388][local133];
							local407 = local404.anInt2915;
							local146 = (byte) (local407 >> 16);
							local151 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local169 = local404.anInt2921 >> 12;
							local437 = local404.anInt2919 >> 12;
							local443 = local404.anInt2917 >> 12;
							local448 = local404.anInt2914 >> 12;
							local92.b(local169 + local41 * (float) -local448);
							local92.b(local437 + local45 * (float) -local448);
							local92.b((float) -local448 * local49 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.b(0.0F);
							local92.b(0.0F);
							local92.b(local54 * (float) local448 + local169);
							local92.b((float) local448 * local58 + local437);
							local92.b((float) local448 * local63 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.b(1.0F);
							local92.b(0.0F);
							local92.b((float) local448 * local41 + local169);
							local92.b((float) local448 * local45 + local437);
							local92.b((float) local448 * local49 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.b(1.0F);
							local92.b(1.0F);
							local92.b((float) local448 * local68 + local169);
							local92.b(local437 + local73 * (float) local448);
							local92.b(local78 * (float) local448 + local443);
							if (arg0.anInt5791 == 0) {
								local92.b(local146, local151, local420, local425);
							} else {
								local92.a(local146, local151, local420, local425);
							}
							local92.b(0.0F);
							local92.b(1.0F);
							local15++;
						}
					}
				}
			}
		}
		local92.c();
		if (this.anInterface16_15.method5774()) {
			arg0.method4863(this.anInterface16_15, 0);
			arg0.method4863(this.anInterface16_14, 1);
			arg0.method4757(this.aClass199_20);
			arg0.method4764(local15 * 4, Static341.aClass213_5, 0, local15 * 2, 0, this.anInterface11_8);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(Z)V")
	public void method7048() {
		this.anInterface16_15.method5772();
	}
}
