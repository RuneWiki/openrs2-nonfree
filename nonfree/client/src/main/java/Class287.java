import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class287 {

	@OriginalMember(owner = "client!qia", name = "e", descriptor = "[I")
	private final int[] anIntArray538 = new int[8191];

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "[[Lclient!sm;")
	private final Class13_Sub3_Sub2[][] aClass13_Sub3_Sub2ArrayArray1 = new Class13_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
	private int anInt7439 = 0;

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "[[Lclient!sm;")
	private final Class13_Sub3_Sub2[][] aClass13_Sub3_Sub2ArrayArray2 = new Class13_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!qia", name = "o", descriptor = "[I")
	private final int[] anIntArray539 = new int[1600];

	@OriginalMember(owner = "client!qia", name = "q", descriptor = "[I")
	private final int[] anIntArray540 = new int[64];

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "Lclient!dha;")
	private final Class72 aClass72_8;

	@OriginalMember(owner = "client!qia", name = "l", descriptor = "Lclient!lk;")
	private final Interface16 anInterface16_8;

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "Lclient!lk;")
	private final Interface16 anInterface16_9;

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "Lclient!ho;")
	private final Interface10 anInterface10_6;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class287(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass72_8 = arg0.method7056(new Class258[] { new Class258(new Class202[] { Static312.aClass202_1, Static312.aClass202_3, Static312.aClass202_5 }), new Class258(Static312.aClass202_2) });
		this.anInterface16_8 = arg0.method7122(true);
		this.anInterface16_9 = arg0.method7122(false);
		this.anInterface16_9.method7457(393168, 12);
		this.anInterface10_6 = arg0.method7119(false);
		this.anInterface10_6.method7382(49146);
		@Pc(98) Buffer local98 = this.anInterface10_6.method7385();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7086(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			}
			local105.c();
			this.anInterface10_6.method7384();
		}
		@Pc(202) Buffer local202 = this.anInterface16_9.method7456();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method7086(local202);
			if (Stream.a()) {
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
			} else {
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
			}
			local209.c();
			this.anInterface16_9.method7458();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!pga;Lclient!ev;II)V")
	public void method6287(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2) {
		if (arg0.aClass177_Sub1_16 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method6294(arg0, arg2);
		} else {
			this.method6290(arg0);
		}
		@Pc(29) float local29 = arg0.aClass177_Sub1_16.aFloat75;
		@Pc(33) float local33 = arg0.aClass177_Sub1_16.aFloat77;
		@Pc(37) float local37 = arg0.aClass177_Sub1_16.aFloat74;
		@Pc(41) float local41 = arg0.aClass177_Sub1_16.aFloat73;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class13_Sub3 local51 = arg1.aClass220_1.aClass13_Sub3_5;
			@Pc(54) Class13_Sub3 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass13_Sub3_9; local54 != local51; local54 = local54.aClass13_Sub3_9) {
				@Pc(59) Class13_Sub3_Sub2 local59 = (Class13_Sub3_Sub2) local54;
				local86 = (int) ((float) (local59.anInt5953 >> 12) * local29 + (float) (local59.anInt5959 >> 12) * local33 + (float) (local59.anInt5954 >> 12) * local37 + local41);
				if (local86 < local45) {
					local45 = local86;
				}
				if (local86 > local47) {
					local47 = local86;
				}
				this.anIntArray538[local43++] = local86;
			}
			@Pc(117) int local117 = local47 - local45;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local86 = 0;
			} else {
				local86 = Static418.method5598(local117) + 1 - Static184.anInt3169;
				local117 = (local117 >> local86) + 2;
			}
			local54 = local51.aClass13_Sub3_9;
			local43 = 0;
			@Pc(149) int local149 = -2;
			@Pc(151) boolean local151 = true;
			@Pc(153) boolean local153 = true;
			while (local51 != local54) {
				this.anInt7439 = 0;
				for (@Pc(160) int local160 = 0; local160 < local117; local160++) {
					this.anIntArray539[local160] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray540[local177] = 0;
				}
				while (local51 != local54) {
					@Pc(193) Class13_Sub3_Sub2 local193 = (Class13_Sub3_Sub2) local54;
					if (local153) {
						local149 = local193.anInt5952;
						local151 = local193.aBoolean432;
						local153 = false;
					}
					if (local43 > 0 && (local149 != local193.anInt5952 || local151 != local193.aBoolean432)) {
						local153 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray538[local43++] - local45 >> local86;
					if (local238 < 1600) {
						if (this.anIntArray539[local238] >= 64) {
							label102: {
								if (this.anIntArray539[local238] == 64) {
									if (this.anInt7439 == 64) {
										break label102;
									}
									this.anIntArray539[local238] += this.anInt7439++ + 1;
								}
								@Pc(294) Class13_Sub3_Sub2[] local294 = this.aClass13_Sub3_Sub2ArrayArray2[this.anIntArray539[local238] - 64 - 1];
								@Pc(304) int local304 = this.anIntArray539[local238] - 1 - 64;
								@Pc(306) int local306 = this.anIntArray540[this.anIntArray539[local238] - 1 - 64];
								this.anIntArray540[local304] = this.anIntArray540[this.anIntArray539[local238] - 1 - 64] + 1;
								local294[local306] = local193;
							}
						} else {
							this.aClass13_Sub3_Sub2ArrayArray1[local238][this.anIntArray539[local238]++] = local193;
						}
					}
					local54 = local54.aClass13_Sub3_9;
				}
				arg0.method7148(false, false, local149 >= 0 ? local149 : -1);
				if (local151 && Static241.aFloat68 != arg0.aFloat178) {
					arg0.xa(Static241.aFloat68);
				} else if (arg0.aFloat178 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method6293(arg0, local117);
			}
		} catch (@Pc(375) Exception local375) {
		}
		this.method6289(arg0);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!pga;B)V")
	private void method6289(@OriginalArg(0) Class95_Sub3 arg0) {
		arg0.method7033(true);
		arg0.method7131(true);
		if (Static241.aFloat68 != arg0.aFloat178) {
			arg0.xa(Static241.aFloat68);
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lclient!pga;B)V")
	private void method6290(@OriginalArg(0) Class95_Sub3 arg0) {
		Static241.aFloat68 = arg0.aFloat178;
		arg0.method7083();
		arg0.method7131(false);
		arg0.method7033(false);
		arg0.method7034();
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public void method6291() {
		this.anInterface16_8.method7459();
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLclient!pga;)V")
	public void method6292(@OriginalArg(1) Class95_Sub3 arg0) {
		this.anInterface16_8.method7457(786336, 24);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!pga;II)V")
	private void method6293(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class177_Sub1 local13 = arg0.method7113();
		@Pc(16) float local16 = local13.aFloat83;
		@Pc(19) float local19 = local13.aFloat80;
		@Pc(22) float local22 = local13.aFloat82;
		@Pc(25) float local25 = local13.aFloat84;
		@Pc(28) float local28 = local13.aFloat81;
		@Pc(31) float local31 = local13.aFloat76;
		@Pc(35) float local35 = local16 + local25;
		@Pc(39) float local39 = local19 + local28;
		@Pc(47) float local47 = local31 + local22;
		@Pc(52) float local52 = local16 - local25;
		@Pc(57) float local57 = local19 - local28;
		@Pc(61) float local61 = local22 - local31;
		@Pc(66) float local66 = local25 - local16;
		@Pc(70) float local70 = local28 - local19;
		@Pc(75) float local75 = local31 - local22;
		@Pc(81) Buffer local81 = this.anInterface16_8.method7456();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg0.method7086(local81);
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class13_Sub3_Sub2 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class13_Sub3_Sub2 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.a()) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray539[local95] > 64 ? 64 : this.anIntArray539[local95];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass13_Sub3_Sub2ArrayArray1[local95][local116];
						local128 = local125.anInt5957;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt5953 >> 12;
						local158 = local125.anInt5959 >> 12;
						local164 = local125.anInt5954 >> 12;
						local169 = local125.anInt5956 >> 12;
						local89.b(local152 + local35 * (float) -local169);
						local89.b((float) -local169 * local39 + local158);
						local89.b(local164 + (float) -local169 * local47);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local152 + local52 * (float) local169);
						local89.b(local57 * (float) local169 + local158);
						local89.b((float) local169 * local61 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b(local152 + (float) local169 * local35);
						local89.b(local158 + local39 * (float) local169);
						local89.b(local47 * (float) local169 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b((float) local169 * local66 + local152);
						local89.b(local70 * (float) local169 + local158);
						local89.b((float) local169 * local75 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.b(0.0F);
						local7++;
						local89.b(1.0F);
					}
					if (this.anIntArray539[local95] > 64) {
						local391 = this.anIntArray539[local95] - 64 - 1;
						for (local128 = this.anIntArray540[local391] - 1; local128 >= 0; local128--) {
							local407 = this.aClass13_Sub3_Sub2ArrayArray2[local391][local128];
							local410 = local407.anInt5957;
							local141 = (byte) (local410 >> 16);
							local146 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local164 = local407.anInt5953 >> 12;
							local440 = local407.anInt5959 >> 12;
							local446 = local407.anInt5954 >> 12;
							local451 = local407.anInt5956 >> 12;
							local89.b((float) -local451 * local35 + local164);
							local89.b((float) -local451 * local39 + local440);
							local89.b((float) -local451 * local47 + local446);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local164 + local52 * (float) local451);
							local89.b(local57 * (float) local451 + local440);
							local89.b((float) local451 * local61 + local446);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local35 * (float) local451 + local164);
							local89.b(local39 * (float) local451 + local440);
							local89.b(local47 * (float) local451 + local446);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local164 + local66 * (float) local451);
							local89.b(local440 + local70 * (float) local451);
							local89.b(local446 + (float) local451 * local75);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.b(0.0F);
							local89.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray539[local95] <= 64 ? this.anIntArray539[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass13_Sub3_Sub2ArrayArray1[local95][local116];
						local128 = local125.anInt5957;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt5953 >> 12;
						local158 = local125.anInt5959 >> 12;
						local164 = local125.anInt5954 >> 12;
						local169 = local125.anInt5956 >> 12;
						local89.a(local152 + local35 * (float) -local169);
						local89.a(local158 + local39 * (float) -local169);
						local89.a((float) -local169 * local47 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local152 + local52 * (float) local169);
						local89.a((float) local169 * local57 + local158);
						local89.a(local164 + (float) local169 * local61);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local152 + (float) local169 * local35);
						local89.a(local158 + (float) local169 * local39);
						local89.a((float) local169 * local47 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a((float) local169 * local66 + local152);
						local89.a(local158 + local70 * (float) local169);
						local89.a(local75 * (float) local169 + local164);
						if (arg0.anInt8380 == 0) {
							local89.b(local133, local138, local141, local146);
						} else {
							local89.a(local133, local138, local141, local146);
						}
						local89.a(0.0F);
						local89.a(1.0F);
						local7++;
					}
					if (this.anIntArray539[local95] > 64) {
						local391 = this.anIntArray539[local95] - 64 - 1;
						for (local128 = this.anIntArray540[local391] - 1; local128 >= 0; local128--) {
							local407 = this.aClass13_Sub3_Sub2ArrayArray2[local391][local128];
							local410 = local407.anInt5957;
							local141 = (byte) (local410 >> 16);
							local146 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local164 = local407.anInt5953 >> 12;
							local440 = local407.anInt5959 >> 12;
							local446 = local407.anInt5954 >> 12;
							local451 = local407.anInt5956 >> 12;
							local89.a((float) -local451 * local35 + local164);
							local89.a(local39 * (float) -local451 + local440);
							local89.a(local47 * (float) -local451 + local446);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a((float) local451 * local52 + local164);
							local89.a((float) local451 * local57 + local440);
							local89.a(local446 + local61 * (float) local451);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a((float) local451 * local35 + local164);
							local89.a((float) local451 * local39 + local440);
							local89.a(local446 + local47 * (float) local451);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local66 * (float) local451 + local164);
							local89.a((float) local451 * local70 + local440);
							local89.a(local446 + (float) local451 * local75);
							if (arg0.anInt8380 == 0) {
								local89.b(local141, local146, local423, local428);
							} else {
								local89.a(local141, local146, local423, local428);
							}
							local89.a(0.0F);
							local89.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local89.c();
		if (this.anInterface16_8.method7458()) {
			arg0.method7054(0, this.anInterface16_8);
			arg0.method7054(1, this.anInterface16_9);
			arg0.method7059(this.aClass72_8);
			arg0.method7060(Static286.aClass30_3, 0, 0, local7 * 4, this.anInterface10_6, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lclient!pga;II)V")
	private void method6294(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static241.aFloat68 = arg0.aFloat178;
		arg0.method7111((float) arg1);
		arg0.method7149();
		arg0.method7131(false);
		arg0.method7033(false);
		arg0.method7034();
	}
}
