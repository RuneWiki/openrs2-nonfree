import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class325 {

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "[I")
	private final int[] anIntArray572 = new int[64];

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
	private final int[] anIntArray573 = new int[1600];

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	private int anInt8352 = 0;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
	private final int[] anIntArray571 = new int[8191];

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "[[Lclient!qg;")
	private final Class3_Sub3_Sub1[][] aClass3_Sub3_Sub1ArrayArray4 = new Class3_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[[Lclient!qg;")
	private final Class3_Sub3_Sub1[][] aClass3_Sub3_Sub1ArrayArray3 = new Class3_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!nca;")
	private final Class247 aClass247_16;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!oda;")
	private final Interface19 anInterface19_15;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!oda;")
	private final Interface19 anInterface19_14;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!je;")
	private final Interface16 anInterface16_7;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class325(@OriginalArg(0) Class33_Sub2 arg0) {
		this.aClass247_16 = arg0.method8237(new Class289[] { new Class289(new Class214[] { Static345.aClass214_1, Static345.aClass214_3, Static345.aClass214_5 }), new Class289(Static345.aClass214_2) });
		this.anInterface19_15 = arg0.method8157(true);
		this.anInterface19_14 = arg0.method8157(false);
		this.anInterface19_14.method6567(393168, 12);
		this.anInterface16_7 = arg0.method8265(false);
		this.anInterface16_7.method8360(49146);
		@Pc(98) Buffer local98 = this.anInterface16_7.method8364();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method8168(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
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
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			}
			local105.c();
			this.anInterface16_7.method8363();
		}
		@Pc(200) Buffer local200 = this.anInterface19_14.method6566();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method8168(local200);
			if (Stream.b()) {
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
			this.anInterface19_14.method6568();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!wg;B)V")
	private void method7211(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub2 arg1) {
		Static513.aFloat193 = arg1.aFloat212;
		arg1.method8164((float) arg0);
		arg1.method8188();
		arg1.method8219(false);
		arg1.method8194(false);
		arg1.method8266();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!wg;)V")
	public void method7212(@OriginalArg(1) Class33_Sub2 arg0) {
		this.anInterface19_15.method6567(786336, 24);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wg;I)V")
	private void method7213(@OriginalArg(0) Class33_Sub2 arg0) {
		arg0.method8194(true);
		arg0.method8219(true);
		if (arg0.aFloat212 != Static513.aFloat193) {
			arg0.xa(Static513.aFloat193);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!wg;)V")
	private void method7214(@OriginalArg(1) Class33_Sub2 arg0) {
		Static513.aFloat193 = arg0.aFloat212;
		arg0.method8243();
		arg0.method8219(false);
		arg0.method8194(false);
		arg0.method8266();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!wg;B)V")
	private void method7215(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class92_Sub1 local11 = arg1.method8216();
		@Pc(14) float local14 = local11.aFloat49;
		@Pc(17) float local17 = local11.aFloat51;
		@Pc(20) float local20 = local11.aFloat45;
		@Pc(29) float local29 = local11.aFloat47;
		@Pc(32) float local32 = local11.aFloat40;
		@Pc(35) float local35 = local11.aFloat43;
		@Pc(39) float local39 = local14 + local29;
		@Pc(43) float local43 = local32 + local17;
		@Pc(47) float local47 = local35 + local20;
		@Pc(52) float local52 = local14 - local29;
		@Pc(56) float local56 = local17 - local32;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local29 - local14;
		@Pc(70) float local70 = local32 - local17;
		@Pc(74) float local74 = local35 - local20;
		@Pc(80) Buffer local80 = this.anInterface19_15.method6566();
		if (local80 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg1.method8168(local80);
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class3_Sub3_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class3_Sub3_Sub1 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.b()) {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray573[local94] > 64 ? 64 : this.anIntArray573[local94];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass3_Sub3_Sub1ArrayArray4[local94][local117];
						local129 = local126.anInt1695;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt1692 >> 12);
						local159 = (float) (local126.anInt1696 >> 12);
						local165 = (float) (local126.anInt1699 >> 12);
						local170 = local126.anInt1698 >> 12;
						local88.a(local153 + local39 * (float) -local170);
						local88.a(local159 + local43 * (float) -local170);
						local88.a(local165 + local47 * (float) -local170);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a(local153 + (float) local170 * local52);
						local88.a((float) local170 * local56 + local159);
						local88.a((float) local170 * local61 + local165);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a(local153 + (float) local170 * local39);
						local88.a(local159 + (float) local170 * local43);
						local88.a((float) local170 * local47 + local165);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a((float) local170 * local66 + local153);
						local88.a((float) local170 * local70 + local159);
						local88.a((float) local170 * local74 + local165);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.a(0.0F);
						local7++;
						local88.a(1.0F);
					}
					if (this.anIntArray573[local94] > 64) {
						local391 = this.anIntArray573[local94] - 64 - 1;
						for (local129 = this.anIntArray572[local391] - 1; local129 >= 0; local129--) {
							local407 = this.aClass3_Sub3_Sub1ArrayArray3[local391][local129];
							local410 = local407.anInt1695;
							local142 = (byte) (local410 >> 16);
							local147 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local165 = (float) (local407.anInt1692 >> 12);
							local440 = (float) (local407.anInt1696 >> 12);
							local446 = (float) (local407.anInt1699 >> 12);
							local451 = local407.anInt1698 >> 12;
							local88.a((float) -local451 * local39 + local165);
							local88.a(local43 * (float) -local451 + local440);
							local88.a(local446 + local47 * (float) -local451);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a((float) local451 * local52 + local165);
							local88.a((float) local451 * local56 + local440);
							local88.a(local446 + (float) local451 * local61);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a(local39 * (float) local451 + local165);
							local88.a((float) local451 * local43 + local440);
							local88.a((float) local451 * local47 + local446);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a((float) local451 * local66 + local165);
							local88.a(local70 * (float) local451 + local440);
							local88.a(local446 + (float) local451 * local74);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.a(0.0F);
							local88.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray573[local94] > 64 ? 64 : this.anIntArray573[local94];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass3_Sub3_Sub1ArrayArray4[local94][local117];
						local129 = local126.anInt1695;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt1692 >> 12);
						local159 = (float) (local126.anInt1696 >> 12);
						local165 = (float) (local126.anInt1699 >> 12);
						local170 = local126.anInt1698 >> 12;
						local88.b(local153 + local39 * (float) -local170);
						local88.b(local43 * (float) -local170 + local159);
						local88.b(local165 + local47 * (float) -local170);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b(local153 + local52 * (float) local170);
						local88.b(local159 + local56 * (float) local170);
						local88.b(local165 + local61 * (float) local170);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b(local153 + (float) local170 * local39);
						local88.b(local159 + (float) local170 * local43);
						local88.b(local47 * (float) local170 + local165);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local66 * (float) local170 + local153);
						local88.b(local159 + local70 * (float) local170);
						local88.b(local74 * (float) local170 + local165);
						if (arg1.anInt9650 == 0) {
							local88.a(local134, local139, local142, local147);
						} else {
							local88.b(local134, local139, local142, local147);
						}
						local88.b(0.0F);
						local88.b(1.0F);
						local7++;
					}
					if (this.anIntArray573[local94] > 64) {
						local391 = this.anIntArray573[local94] - 64 - 1;
						for (local129 = this.anIntArray572[local391] - 1; local129 >= 0; local129--) {
							local407 = this.aClass3_Sub3_Sub1ArrayArray3[local391][local129];
							local410 = local407.anInt1695;
							local142 = (byte) (local410 >> 16);
							local147 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local165 = (float) (local407.anInt1692 >> 12);
							local440 = (float) (local407.anInt1696 >> 12);
							local446 = (float) (local407.anInt1699 >> 12);
							local451 = local407.anInt1698 >> 12;
							local88.b(local39 * (float) -local451 + local165);
							local88.b(local43 * (float) -local451 + local440);
							local88.b(local446 + (float) -local451 * local47);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b(local165 + (float) local451 * local52);
							local88.b(local56 * (float) local451 + local440);
							local88.b(local446 + (float) local451 * local61);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local39 * (float) local451 + local165);
							local88.b(local43 * (float) local451 + local440);
							local88.b(local47 * (float) local451 + local446);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b((float) local451 * local66 + local165);
							local88.b((float) local451 * local70 + local440);
							local88.b(local446 + (float) local451 * local74);
							if (arg1.anInt9650 == 0) {
								local88.a(local142, local147, local423, local428);
							} else {
								local88.b(local142, local147, local423, local428);
							}
							local88.b(0.0F);
							local88.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local88.c();
		if (this.anInterface19_15.method6568()) {
			arg1.method8175(this.anInterface19_15, 0);
			arg1.method8175(this.anInterface19_14, 1);
			arg1.method8179(this.aClass247_16);
			arg1.method8279(this.anInterface16_7, local7 * 4, Static83.aClass194_13, 0, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!af;ILclient!wg;)V")
	public void method7216(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33_Sub2 arg2) {
		if (arg2.aClass92_Sub1_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method7214(arg2);
		} else {
			this.method7211(arg1, arg2);
		}
		@Pc(26) float local26 = arg2.aClass92_Sub1_16.aFloat48;
		@Pc(30) float local30 = arg2.aClass92_Sub1_16.aFloat41;
		@Pc(34) float local34 = arg2.aClass92_Sub1_16.aFloat46;
		@Pc(38) float local38 = arg2.aClass92_Sub1_16.aFloat44;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class3_Sub3 local48 = arg0.aClass87_1.aClass3_Sub3_7;
			@Pc(51) Class3_Sub3 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass3_Sub3_9; local51 != local48; local51 = local51.aClass3_Sub3_9) {
				@Pc(56) Class3_Sub3_Sub1 local56 = (Class3_Sub3_Sub1) local51;
				local83 = (int) (local38 + local30 * (float) (local56.anInt1696 >> 12) + local26 * (float) (local56.anInt1692 >> 12) + local34 * (float) (local56.anInt1699 >> 12));
				this.anIntArray571[local40++] = local83;
				if (local83 < local42) {
					local42 = local83;
				}
				if (local83 > local44) {
					local44 = local83;
				}
			}
			@Pc(109) int local109 = local44 - local42;
			if (local109 + 2 > 1600) {
				local83 = Static214.method3192(local109) + 1 - Static131.anInt2422;
				local109 = (local109 >> local83) + 2;
			} else {
				local83 = 0;
				local109 += 2;
			}
			local40 = 0;
			local51 = local48.aClass3_Sub3_9;
			@Pc(140) int local140 = -2;
			@Pc(142) boolean local142 = true;
			@Pc(144) boolean local144 = true;
			while (local48 != local51) {
				this.anInt8352 = 0;
				for (@Pc(151) int local151 = 0; local151 < local109; local151++) {
					this.anIntArray573[local151] = 0;
				}
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					this.anIntArray572[local164] = 0;
				}
				while (local51 != local48) {
					@Pc(182) Class3_Sub3_Sub1 local182 = (Class3_Sub3_Sub1) local51;
					if (local144) {
						local144 = false;
						local140 = local182.anInt1694;
						local142 = local182.aBoolean113;
					}
					if (local40 > 0 && (local182.anInt1694 != local140 || local142 != local182.aBoolean113)) {
						local144 = true;
						break;
					}
					@Pc(223) int local223 = this.anIntArray571[local40++] - local42 >> local83;
					if (local223 < 1600) {
						if (this.anIntArray573[local223] < 64) {
							this.aClass3_Sub3_Sub1ArrayArray4[local223][this.anIntArray573[local223]++] = local182;
						} else {
							label102: {
								if (this.anIntArray573[local223] == 64) {
									if (this.anInt8352 == 64) {
										break label102;
									}
									this.anIntArray573[local223] += this.anInt8352++ + 1;
								}
								@Pc(290) Class3_Sub3_Sub1[] local290 = this.aClass3_Sub3_Sub1ArrayArray3[this.anIntArray573[local223] - 64 - 1];
								@Pc(298) int local298 = this.anIntArray573[local223] - 65;
								@Pc(300) int local300 = this.anIntArray572[this.anIntArray573[local223] - 65];
								this.anIntArray572[local298] = this.anIntArray572[this.anIntArray573[local223] - 65] + 1;
								local290[local300] = local182;
							}
						}
					}
					local51 = local51.aClass3_Sub3_9;
				}
				arg2.method8272(false, local140 >= 0 ? local140 : -1, false);
				if (local142 && arg2.aFloat212 != Static513.aFloat193) {
					arg2.xa(Static513.aFloat193);
				} else if (arg2.aFloat212 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7215(local109, arg2);
			}
		} catch (@Pc(352) Exception local352) {
		}
		this.method7213(arg2);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public void method7218() {
		this.anInterface19_15.method8358();
	}
}
