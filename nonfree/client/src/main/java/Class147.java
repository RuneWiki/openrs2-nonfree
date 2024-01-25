import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class147 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
	private int anInt4428 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[[Lclient!gia;")
	private final Class9_Sub3_Sub2[][] aClass9_Sub3_Sub2ArrayArray3 = new Class9_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
	private final int[] anIntArray238 = new int[8191];

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[[Lclient!gia;")
	private final Class9_Sub3_Sub2[][] aClass9_Sub3_Sub2ArrayArray4 = new Class9_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
	private final int[] anIntArray240 = new int[64];

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[I")
	private final int[] anIntArray239 = new int[1600];

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!cc;")
	private final Class43 aClass43_16;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Lclient!rv;")
	private final Interface22 anInterface22_10;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "Lclient!rv;")
	private final Interface22 anInterface22_11;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!js;")
	private final Interface12 anInterface12_4;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class147(@OriginalArg(0) Class82_Sub3 arg0) {
		this.aClass43_16 = arg0.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_3, Static458.aClass279_5 }), new Class268(Static458.aClass279_2) });
		this.anInterface22_10 = arg0.method4925(true);
		this.anInterface22_11 = arg0.method4925(false);
		this.anInterface22_11.method1387(12, 393168);
		this.anInterface12_4 = arg0.method4985(false);
		this.anInterface12_4.method7563(49146);
		@Pc(98) Buffer local98 = this.anInterface12_4.method7573();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4986(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
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
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			}
			local105.b();
			this.anInterface12_4.method7574();
		}
		@Pc(200) Buffer local200 = this.anInterface22_11.method1389();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method4986(local200);
			if (Stream.c()) {
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
			local207.b();
			this.anInterface22_11.method1390();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!rl;)V")
	private void method3771(@OriginalArg(0) int arg0, @OriginalArg(2) Class82_Sub3 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class31_Sub2 local11 = arg1.method4924();
		@Pc(14) float local14 = local11.aFloat174;
		@Pc(17) float local17 = local11.aFloat171;
		@Pc(20) float local20 = local11.aFloat175;
		@Pc(29) float local29 = local11.aFloat169;
		@Pc(32) float local32 = local11.aFloat167;
		@Pc(35) float local35 = local11.aFloat178;
		@Pc(39) float local39 = local14 + local29;
		@Pc(43) float local43 = local32 + local17;
		@Pc(47) float local47 = local35 + local20;
		@Pc(51) float local51 = local14 - local29;
		@Pc(56) float local56 = local17 - local32;
		@Pc(60) float local60 = local20 - local35;
		@Pc(65) float local65 = local29 - local14;
		@Pc(69) float local69 = local32 - local17;
		@Pc(73) float local73 = local35 - local20;
		@Pc(79) Buffer local79 = this.anInterface22_10.method1389();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg1.method4986(local79);
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class9_Sub3_Sub2 local125;
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
		@Pc(407) Class9_Sub3_Sub2 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.c()) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray239[local93] <= 64 ? this.anIntArray239[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass9_Sub3_Sub2ArrayArray4[local93][local116];
						local128 = local125.anInt6756;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = (float) (local125.anInt6754 >> 12);
						local158 = (float) (local125.anInt6759 >> 12);
						local164 = (float) (local125.anInt6757 >> 12);
						local169 = local125.anInt6755 >> 12;
						local87.a(local152 + (float) -local169 * local39);
						local87.a(local158 + (float) -local169 * local43);
						local87.a(local164 + (float) -local169 * local47);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local152 + (float) local169 * local51);
						local87.a(local158 + local56 * (float) local169);
						local87.a((float) local169 * local60 + local164);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local39 * (float) local169 + local152);
						local87.a(local158 + (float) local169 * local43);
						local87.a(local164 + (float) local169 * local47);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local152 + (float) local169 * local65);
						local87.a((float) local169 * local69 + local158);
						local87.a(local164 + local73 * (float) local169);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(1.0F);
						local7++;
					}
					if (this.anIntArray239[local93] > 64) {
						local391 = this.anIntArray239[local93] - 1 - 64;
						for (local128 = this.anIntArray240[local391] - 1; local128 >= 0; local128--) {
							local407 = this.aClass9_Sub3_Sub2ArrayArray3[local391][local128];
							local410 = local407.anInt6756;
							local141 = (byte) (local410 >> 16);
							local146 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local164 = (float) (local407.anInt6754 >> 12);
							local440 = (float) (local407.anInt6759 >> 12);
							local446 = (float) (local407.anInt6757 >> 12);
							local451 = local407.anInt6755 >> 12;
							local87.a(local164 + (float) -local451 * local39);
							local87.a(local440 + local43 * (float) -local451);
							local87.a(local446 + local47 * (float) -local451);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local51 * (float) local451 + local164);
							local87.a(local56 * (float) local451 + local440);
							local87.a(local446 + local60 * (float) local451);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a((float) local451 * local39 + local164);
							local87.a(local440 + local43 * (float) local451);
							local87.a((float) local451 * local47 + local446);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a(local65 * (float) local451 + local164);
							local87.a((float) local451 * local69 + local440);
							local87.a(local73 * (float) local451 + local446);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.a(0.0F);
							local7++;
							local87.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray239[local93] <= 64 ? this.anIntArray239[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass9_Sub3_Sub2ArrayArray4[local93][local116];
						local128 = local125.anInt6756;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = (float) (local125.anInt6754 >> 12);
						local158 = (float) (local125.anInt6759 >> 12);
						local164 = (float) (local125.anInt6757 >> 12);
						local169 = local125.anInt6755 >> 12;
						local87.b(local152 + (float) -local169 * local39);
						local87.b(local158 + (float) -local169 * local43);
						local87.b(local164 + local47 * (float) -local169);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local152 + local51 * (float) local169);
						local87.b(local158 + local56 * (float) local169);
						local87.b(local60 * (float) local169 + local164);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b(local39 * (float) local169 + local152);
						local87.b(local158 + (float) local169 * local43);
						local87.b(local164 + local47 * (float) local169);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b(local65 * (float) local169 + local152);
						local87.b(local69 * (float) local169 + local158);
						local87.b(local73 * (float) local169 + local164);
						if (arg1.anInt5858 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray239[local93] > 64) {
						local391 = this.anIntArray239[local93] - 64 - 1;
						for (local128 = this.anIntArray240[local391] - 1; local128 >= 0; local128--) {
							local407 = this.aClass9_Sub3_Sub2ArrayArray3[local391][local128];
							local410 = local407.anInt6756;
							local141 = (byte) (local410 >> 16);
							local146 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local164 = (float) (local407.anInt6754 >> 12);
							local440 = (float) (local407.anInt6759 >> 12);
							local446 = (float) (local407.anInt6757 >> 12);
							local451 = local407.anInt6755 >> 12;
							local87.b(local164 + (float) -local451 * local39);
							local87.b(local440 + (float) -local451 * local43);
							local87.b(local47 * (float) -local451 + local446);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local164 + local51 * (float) local451);
							local87.b((float) local451 * local56 + local440);
							local87.b(local446 + (float) local451 * local60);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b(local39 * (float) local451 + local164);
							local87.b(local440 + (float) local451 * local43);
							local87.b(local446 + local47 * (float) local451);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local164 + local65 * (float) local451);
							local87.b(local440 + (float) local451 * local69);
							local87.b(local446 + (float) local451 * local73);
							if (arg1.anInt5858 == 0) {
								local87.b(local141, local146, local423, local428);
							} else {
								local87.a(local141, local146, local423, local428);
							}
							local87.b(0.0F);
							local87.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local87.b();
		if (this.anInterface22_10.method1390()) {
			arg1.method4995(0, this.anInterface22_10);
			arg1.method4995(1, this.anInterface22_11);
			arg1.method4960(this.aClass43_16);
			arg1.method4993(local7 * 4, this.anInterface12_4, Static525.aClass376_6, local7 * 2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!rl;Z)V")
	private void method3772(@OriginalArg(0) Class82_Sub3 arg0) {
		arg0.method4968(true);
		arg0.method4991(true);
		if (Static586.aFloat192 != arg0.aFloat123) {
			arg0.xa(Static586.aFloat192);
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(Lclient!rl;Z)V")
	public void method3774(@OriginalArg(0) Class82_Sub3 arg0) {
		this.anInterface22_10.method1387(24, 786336);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLclient!rl;)V")
	private void method3775(@OriginalArg(1) Class82_Sub3 arg0) {
		Static586.aFloat192 = arg0.aFloat123;
		arg0.method5002();
		arg0.method4991(false);
		arg0.method4968(false);
		arg0.method4941();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!rl;B)V")
	private void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) Class82_Sub3 arg1) {
		Static586.aFloat192 = arg1.aFloat123;
		arg1.method5019((float) arg0);
		arg1.method5020();
		arg1.method4991(false);
		arg1.method4968(false);
		arg1.method4941();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method3777() {
		this.anInterface22_10.method7572();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!ik;IBLclient!rl;)V")
	public void method3778(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class82_Sub3 arg2) {
		if (arg2.aClass31_Sub2_16 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3776(arg1, arg2);
		} else {
			this.method3775(arg2);
		}
		@Pc(29) float local29 = arg2.aClass31_Sub2_16.aFloat173;
		@Pc(33) float local33 = arg2.aClass31_Sub2_16.aFloat176;
		@Pc(37) float local37 = arg2.aClass31_Sub2_16.aFloat168;
		@Pc(41) float local41 = arg2.aClass31_Sub2_16.aFloat172;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class9_Sub3 local51 = arg0.aClass347_1.aClass9_Sub3_9;
			@Pc(54) Class9_Sub3 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass9_Sub3_8; local54 != local51; local54 = local54.aClass9_Sub3_8) {
				@Pc(59) Class9_Sub3_Sub2 local59 = (Class9_Sub3_Sub2) local54;
				local86 = (int) (local41 + local37 * (float) (local59.anInt6757 >> 12) + local29 * (float) (local59.anInt6754 >> 12) + (float) (local59.anInt6759 >> 12) * local33);
				if (local86 < local45) {
					local45 = local86;
				}
				this.anIntArray238[local43++] = local86;
				if (local47 < local86) {
					local47 = local86;
				}
			}
			@Pc(112) int local112 = local47 - local45;
			if (local112 + 2 <= 1600) {
				local86 = 0;
				local112 += 2;
			} else {
				local86 = Static613.method8376(local112) + 1 - Static449.anInt7749;
				local112 = (local112 >> local86) + 2;
			}
			local54 = local51.aClass9_Sub3_8;
			local43 = 0;
			@Pc(153) int local153 = -2;
			@Pc(155) boolean local155 = true;
			@Pc(157) boolean local157 = true;
			while (local54 != local51) {
				this.anInt4428 = 0;
				for (@Pc(164) int local164 = 0; local164 < local112; local164++) {
					this.anIntArray239[local164] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray240[local177] = 0;
				}
				while (local51 != local54) {
					@Pc(195) Class9_Sub3_Sub2 local195 = (Class9_Sub3_Sub2) local54;
					if (local157) {
						local153 = local195.anInt6758;
						local155 = local195.aBoolean490;
						local157 = false;
					}
					if (local43 > 0 && (local195.anInt6758 != local153 || local195.aBoolean490 != local155)) {
						local157 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray238[local43++] - local45 >> local86;
					if (local237 < 1600) {
						if (this.anIntArray239[local237] >= 64) {
							label102: {
								if (this.anIntArray239[local237] == 64) {
									if (this.anInt4428 == 64) {
										break label102;
									}
									this.anIntArray239[local237] += this.anInt4428++ + 1;
								}
								this.aClass9_Sub3_Sub2ArrayArray3[this.anIntArray239[local237] - 64 - 1][this.anIntArray240[this.anIntArray239[local237] - 64 - 1]++] = local195;
							}
						} else {
							this.aClass9_Sub3_Sub2ArrayArray4[local237][this.anIntArray239[local237]++] = local195;
						}
					}
					local54 = local54.aClass9_Sub3_8;
				}
				arg2.method4988(false, false, local153 >= 0 ? local153 : -1);
				if (local155 && Static586.aFloat192 != arg2.aFloat123) {
					arg2.xa(Static586.aFloat192);
				} else if (arg2.aFloat123 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method3771(local112, arg2);
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.method3772(arg2);
	}
}
