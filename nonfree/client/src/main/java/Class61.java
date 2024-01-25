import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class61 {

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "[[Lclient!gi;")
	private final Class15_Sub5_Sub1[][] aClass15_Sub5_Sub1ArrayArray1 = new Class15_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "[[Lclient!gi;")
	private final Class15_Sub5_Sub1[][] aClass15_Sub5_Sub1ArrayArray2 = new Class15_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	private int anInt2476 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "[I")
	private final int[] anIntArray102 = new int[64];

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "[I")
	private final int[] anIntArray103 = new int[8191];

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "[I")
	private final int[] anIntArray104 = new int[1600];

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!f;")
	private final Class94 aClass94_15;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!el;")
	private final Interface4 anInterface4_9;

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "Lclient!el;")
	private final Interface4 anInterface4_10;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "Lclient!kga;")
	private final Interface13 anInterface13_4;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!ln;)V")
	public Class61(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass94_15 = arg0.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_3, Static589.aClass349_5 }), new Class325(Static589.aClass349_2) });
		this.anInterface4_9 = arg0.method3988(true);
		this.anInterface4_10 = arg0.method3988(false);
		this.anInterface4_10.method6507(12, 393168);
		this.anInterface13_4 = arg0.method3917(false);
		this.anInterface13_4.method6500(49146);
		@Pc(98) Buffer local98 = this.anInterface13_4.method4654();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method3981(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			}
			local105.b();
			this.anInterface13_4.method4655();
		}
		@Pc(202) Buffer local202 = this.anInterface4_10.method6506();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method3981(local202);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
				}
			}
			local209.b();
			this.anInterface4_10.method6505();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public void method2093() {
		this.anInterface4_9.method6496();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!ln;I)V")
	private void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class54_Sub3 local11 = arg1.method3885();
		@Pc(14) float local14 = local11.aFloat117;
		@Pc(17) float local17 = local11.aFloat115;
		@Pc(25) float local25 = local11.aFloat114;
		@Pc(28) float local28 = local11.aFloat113;
		@Pc(31) float local31 = local11.aFloat116;
		@Pc(34) float local34 = local11.aFloat119;
		@Pc(38) float local38 = local28 + local14;
		@Pc(42) float local42 = local17 + local31;
		@Pc(46) float local46 = local34 + local25;
		@Pc(51) float local51 = local14 - local28;
		@Pc(55) float local55 = local17 - local31;
		@Pc(59) float local59 = local25 - local34;
		@Pc(63) float local63 = local28 - local14;
		@Pc(67) float local67 = local31 - local17;
		@Pc(72) float local72 = local34 - local25;
		@Pc(78) Buffer local78 = this.anInterface4_9.method6506();
		if (local78 == null) {
			return;
		}
		@Pc(86) Stream local86 = arg1.method3981(local78);
		@Pc(92) int local92;
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(124) Class15_Sub5_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(434) float local434;
		@Pc(439) int local439;
		@Pc(379) int local379;
		@Pc(395) Class15_Sub5_Sub1 local395;
		@Pc(398) int local398;
		@Pc(411) byte local411;
		@Pc(416) byte local416;
		@Pc(428) float local428;
		if (Stream.c()) {
			for (local92 = arg0 - 1; local92 >= 0; local92--) {
				local109 = this.anIntArray104[local92] <= 64 ? this.anIntArray104[local92] : 64;
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass15_Sub5_Sub1ArrayArray1[local92][local115];
						local127 = local124.anInt3828;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt3827 >> 12;
						local157 = local124.anInt3830 >> 12;
						local163 = local124.anInt3826 >> 12;
						local168 = local124.anInt3822 >> 12;
						local86.a(local151 + local38 * (float) -local168);
						local86.a(local42 * (float) -local168 + local157);
						local86.a((float) -local168 * local46 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.a(0.0F);
						local86.a(0.0F);
						local86.a(local51 * (float) local168 + local151);
						local86.a(local157 + (float) local168 * local55);
						local86.a(local163 + (float) local168 * local59);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.a(1.0F);
						local86.a(0.0F);
						local86.a((float) local168 * local38 + local151);
						local86.a(local157 + local42 * (float) local168);
						local86.a((float) local168 * local46 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.a(1.0F);
						local86.a(1.0F);
						local86.a(local63 * (float) local168 + local151);
						local86.a(local67 * (float) local168 + local157);
						local86.a(local72 * (float) local168 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.a(0.0F);
						local7++;
						local86.a(1.0F);
					}
					if (this.anIntArray104[local92] > 64) {
						local379 = this.anIntArray104[local92] - 65;
						for (local127 = this.anIntArray102[local379] - 1; local127 >= 0; local127--) {
							local395 = this.aClass15_Sub5_Sub1ArrayArray2[local379][local127];
							local398 = local395.anInt3828;
							local140 = (byte) (local398 >> 16);
							local145 = (byte) (local398 >> 8);
							local411 = (byte) local398;
							local416 = (byte) (local398 >>> 24);
							local163 = local395.anInt3827 >> 12;
							local428 = local395.anInt3830 >> 12;
							local434 = local395.anInt3826 >> 12;
							local439 = local395.anInt3822 >> 12;
							local86.a(local163 + local38 * (float) -local439);
							local86.a((float) -local439 * local42 + local428);
							local86.a((float) -local439 * local46 + local434);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.a(0.0F);
							local86.a(0.0F);
							local86.a(local163 + local51 * (float) local439);
							local86.a(local55 * (float) local439 + local428);
							local86.a(local434 + (float) local439 * local59);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.a(1.0F);
							local86.a(0.0F);
							local86.a(local38 * (float) local439 + local163);
							local86.a(local428 + (float) local439 * local42);
							local86.a(local434 + (float) local439 * local46);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.a(1.0F);
							local86.a(1.0F);
							local86.a(local163 + (float) local439 * local63);
							local86.a(local428 + (float) local439 * local67);
							local86.a(local434 + local72 * (float) local439);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.a(0.0F);
							local86.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local92 = arg0 - 1; local92 >= 0; local92--) {
				local109 = this.anIntArray104[local92] <= 64 ? this.anIntArray104[local92] : 64;
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass15_Sub5_Sub1ArrayArray1[local92][local115];
						local127 = local124.anInt3828;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt3827 >> 12;
						local157 = local124.anInt3830 >> 12;
						local163 = local124.anInt3826 >> 12;
						local168 = local124.anInt3822 >> 12;
						local86.b(local38 * (float) -local168 + local151);
						local86.b((float) -local168 * local42 + local157);
						local86.b(local163 + local46 * (float) -local168);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.b(0.0F);
						local86.b(0.0F);
						local86.b((float) local168 * local51 + local151);
						local86.b(local157 + local55 * (float) local168);
						local86.b((float) local168 * local59 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.b(1.0F);
						local86.b(0.0F);
						local86.b(local151 + (float) local168 * local38);
						local86.b(local42 * (float) local168 + local157);
						local86.b(local46 * (float) local168 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.b(1.0F);
						local86.b(1.0F);
						local86.b(local151 + (float) local168 * local63);
						local86.b(local157 + local67 * (float) local168);
						local86.b((float) local168 * local72 + local163);
						if (arg1.anInt4898 == 0) {
							local86.a(local132, local137, local140, local145);
						} else {
							local86.b(local132, local137, local140, local145);
						}
						local86.b(0.0F);
						local86.b(1.0F);
						local7++;
					}
					if (this.anIntArray104[local92] > 64) {
						local379 = this.anIntArray104[local92] - 64 - 1;
						for (local127 = this.anIntArray102[local379] - 1; local127 >= 0; local127--) {
							local395 = this.aClass15_Sub5_Sub1ArrayArray2[local379][local127];
							local398 = local395.anInt3828;
							local140 = (byte) (local398 >> 16);
							local145 = (byte) (local398 >> 8);
							local411 = (byte) local398;
							local416 = (byte) (local398 >>> 24);
							local163 = local395.anInt3827 >> 12;
							local428 = local395.anInt3830 >> 12;
							local434 = local395.anInt3826 >> 12;
							local439 = local395.anInt3822 >> 12;
							local86.b((float) -local439 * local38 + local163);
							local86.b(local42 * (float) -local439 + local428);
							local86.b(local434 + (float) -local439 * local46);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.b(0.0F);
							local86.b(0.0F);
							local86.b((float) local439 * local51 + local163);
							local86.b(local428 + local55 * (float) local439);
							local86.b((float) local439 * local59 + local434);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.b(1.0F);
							local86.b(0.0F);
							local86.b(local163 + local38 * (float) local439);
							local86.b(local42 * (float) local439 + local428);
							local86.b(local434 + local46 * (float) local439);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.b(1.0F);
							local86.b(1.0F);
							local86.b(local163 + (float) local439 * local63);
							local86.b(local428 + (float) local439 * local67);
							local86.b(local72 * (float) local439 + local434);
							if (arg1.anInt4898 == 0) {
								local86.a(local140, local145, local411, local416);
							} else {
								local86.b(local140, local145, local411, local416);
							}
							local86.b(0.0F);
							local86.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local86.b();
		if (this.anInterface4_9.method6505()) {
			arg1.method3983(this.anInterface4_9, 0);
			arg1.method3983(this.anInterface4_10, 1);
			arg1.method3967(this.aClass94_15);
			arg1.method3977(Static525.aClass342_3, this.anInterface13_4, 0, local7 * 2, 0, local7 * 4);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!ln;II)V")
	private void method2095(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static472.aFloat186 = arg0.aFloat93;
		arg0.method3894((float) arg1);
		arg0.method3900();
		arg0.method3927(false);
		arg0.method3916(false);
		arg0.method3976();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!pca;ZILclient!ln;)V")
	public void method2097(@OriginalArg(0) Class250 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16_Sub1 arg2) {
		if (arg2.aClass54_Sub3_16 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method2095(arg2, arg1);
		} else {
			this.method2099(arg2);
		}
		@Pc(26) float local26 = arg2.aClass54_Sub3_16.aFloat120;
		@Pc(30) float local30 = arg2.aClass54_Sub3_16.aFloat124;
		@Pc(34) float local34 = arg2.aClass54_Sub3_16.aFloat118;
		@Pc(38) float local38 = arg2.aClass54_Sub3_16.aFloat121;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class15_Sub5 local48 = arg0.aClass131_1.aClass15_Sub5_7;
			@Pc(51) Class15_Sub5 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass15_Sub5_9; local51 != local48; local51 = local51.aClass15_Sub5_9) {
				@Pc(56) Class15_Sub5_Sub1 local56 = (Class15_Sub5_Sub1) local51;
				local83 = (int) (local30 * (float) (local56.anInt3830 >> 12) + (float) (local56.anInt3827 >> 12) * local26 + local34 * (float) (local56.anInt3826 >> 12) + local38);
				this.anIntArray103[local40++] = local83;
				if (local42 > local83) {
					local42 = local83;
				}
				if (local83 > local44) {
					local44 = local83;
				}
			}
			@Pc(117) int local117 = local44 - local42;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local83 = 0;
			} else {
				local83 = Static112.method2537(local117) + 1 - Static541.anInt9399;
				local117 = (local117 >> local83) + 2;
			}
			local51 = local48.aClass15_Sub5_9;
			local40 = 0;
			@Pc(148) int local148 = -2;
			@Pc(150) boolean local150 = true;
			@Pc(152) boolean local152 = true;
			while (local51 != local48) {
				this.anInt2476 = 0;
				for (@Pc(159) int local159 = 0; local159 < local117; local159++) {
					this.anIntArray104[local159] = 0;
				}
				for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
					this.anIntArray102[local172] = 0;
				}
				while (local51 != local48) {
					@Pc(188) Class15_Sub5_Sub1 local188 = (Class15_Sub5_Sub1) local51;
					if (local152) {
						local150 = local188.aBoolean281;
						local148 = local188.anInt3824;
						local152 = false;
					}
					if (local40 > 0 && (local188.anInt3824 != local148 || local188.aBoolean281 != local150)) {
						local152 = true;
						break;
					}
					@Pc(230) int local230 = this.anIntArray103[local40++] - local42 >> local83;
					if (local230 < 1600) {
						if (this.anIntArray104[local230] < 64) {
							this.aClass15_Sub5_Sub1ArrayArray1[local230][this.anIntArray104[local230]++] = local188;
						} else {
							label102: {
								if (this.anIntArray104[local230] == 64) {
									if (this.anInt2476 == 64) {
										break label102;
									}
									this.anIntArray104[local230] += this.anInt2476++ + 1;
								}
								@Pc(297) Class15_Sub5_Sub1[] local297 = this.aClass15_Sub5_Sub1ArrayArray2[this.anIntArray104[local230] - 64 - 1];
								@Pc(307) int local307 = this.anIntArray104[local230] - 64 - 1;
								@Pc(309) int local309 = this.anIntArray102[this.anIntArray104[local230] - 64 - 1];
								this.anIntArray102[local307] = this.anIntArray102[this.anIntArray104[local230] - 64 - 1] + 1;
								local297[local309] = local188;
							}
						}
					}
					local51 = local51.aClass15_Sub5_9;
				}
				arg2.method3957(false, false, local148 >= 0 ? local148 : -1);
				if (local150 && arg2.aFloat93 != Static472.aFloat186) {
					arg2.xa(Static472.aFloat186);
				} else if (arg2.aFloat93 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method2094(local117, arg2);
			}
		} catch (@Pc(361) Exception local361) {
		}
		this.method2100(arg2);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLclient!ln;)V")
	private void method2099(@OriginalArg(1) Class16_Sub1 arg0) {
		Static472.aFloat186 = arg0.aFloat93;
		arg0.method3938();
		arg0.method3927(false);
		arg0.method3916(false);
		arg0.method3976();
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!ln;B)V")
	private void method2100(@OriginalArg(0) Class16_Sub1 arg0) {
		arg0.method3916(true);
		arg0.method3927(true);
		if (arg0.aFloat93 != Static472.aFloat186) {
			arg0.xa(Static472.aFloat186);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BLclient!ln;)V")
	public void method2101(@OriginalArg(1) Class16_Sub1 arg0) {
		this.anInterface4_9.method6507(24, 786336);
	}
}
