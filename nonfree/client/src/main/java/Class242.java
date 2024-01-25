import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class242 {

	@OriginalMember(owner = "client!no", name = "h", descriptor = "[I")
	private final int[] anIntArray578 = new int[8191];

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[I")
	private final int[] anIntArray577 = new int[1600];

	@OriginalMember(owner = "client!no", name = "s", descriptor = "[[Lclient!vj;")
	private final Class28_Sub4_Sub2[][] aClass28_Sub4_Sub2ArrayArray4 = new Class28_Sub4_Sub2[1600][64];

	@OriginalMember(owner = "client!no", name = "t", descriptor = "[I")
	private final int[] anIntArray579 = new int[64];

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	private int anInt6508 = 0;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "[[Lclient!vj;")
	private final Class28_Sub4_Sub2[][] aClass28_Sub4_Sub2ArrayArray3 = new Class28_Sub4_Sub2[64][768];

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Lclient!nc;")
	private final Class233 aClass233_9;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Lclient!id;")
	private final Interface15 anInterface15_8;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "Lclient!id;")
	private final Interface15 anInterface15_9;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Lclient!oh;")
	private final Interface20 anInterface20_6;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class242(@OriginalArg(0) Class13_Sub1 arg0) {
		this.aClass233_9 = arg0.method7427(new Class298[] { new Class298(new Class124[] { Static205.aClass124_1, Static205.aClass124_3, Static205.aClass124_5 }), new Class298(Static205.aClass124_2) });
		this.anInterface15_8 = arg0.method7541(true);
		this.anInterface15_9 = arg0.method7541(false);
		this.anInterface15_9.method8746(393168, 12);
		this.anInterface20_6 = arg0.method7435(false);
		this.anInterface20_6.method8740(49146);
		@Pc(98) Buffer local98 = this.anInterface20_6.method7828();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7409(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
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
			local105.a();
			this.anInterface20_6.method7826();
		}
		@Pc(200) Buffer local200 = this.anInterface15_9.method8744();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method7409(local200);
			if (Stream.c()) {
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
			} else {
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
			}
			local207.a();
			this.anInterface15_9.method8747();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public void method5811() {
		this.anInterface15_8.method8737();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ai;I)V")
	private void method5812(@OriginalArg(1) Class13_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static196.aFloat89 = arg0.aFloat172;
		arg0.method7417((float) arg1);
		arg0.method7519();
		arg0.method7487(false);
		arg0.method7505(false);
		arg0.method7459();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ef;Lclient!ai;B)V")
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class13_Sub1 arg2) {
		if (arg2.aClass239_Sub3_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method5812(arg2, arg0);
		} else {
			this.method5817(arg2);
		}
		@Pc(26) float local26 = arg2.aClass239_Sub3_16.aFloat222;
		@Pc(30) float local30 = arg2.aClass239_Sub3_16.aFloat224;
		@Pc(34) float local34 = arg2.aClass239_Sub3_16.aFloat221;
		@Pc(38) float local38 = arg2.aClass239_Sub3_16.aFloat220;
		try {
			@Pc(40) int local40 = 0;
			@Pc(46) int local46 = Integer.MAX_VALUE;
			@Pc(48) int local48 = 0;
			@Pc(52) Class28_Sub4 local52 = arg1.aClass137_1.aClass28_Sub4_1;
			@Pc(55) Class28_Sub4 local55;
			@Pc(87) int local87;
			for (local55 = local52.aClass28_Sub4_9; local55 != local52; local55 = local55.aClass28_Sub4_9) {
				@Pc(60) Class28_Sub4_Sub2 local60 = (Class28_Sub4_Sub2) local55;
				local87 = (int) (local30 * (float) (local60.anInt9650 >> 12) + (float) (local60.anInt9656 >> 12) * local26 + local34 * (float) (local60.anInt9652 >> 12) + local38);
				this.anIntArray578[local40++] = local87;
				if (local87 > local48) {
					local48 = local87;
				}
				if (local87 < local46) {
					local46 = local87;
				}
			}
			@Pc(118) int local118 = local48 - local46;
			if (local118 + 2 > 1600) {
				local87 = Static673.method9349(local118) + 1 - Static596.anInt9584;
				local118 = (local118 >> local87) + 2;
			} else {
				local87 = 0;
				local118 += 2;
			}
			local55 = local52.aClass28_Sub4_9;
			local40 = 0;
			@Pc(149) int local149 = -2;
			@Pc(151) boolean local151 = true;
			@Pc(153) boolean local153 = true;
			while (local52 != local55) {
				this.anInt6508 = 0;
				for (@Pc(160) int local160 = 0; local160 < local118; local160++) {
					this.anIntArray577[local160] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray579[local177] = 0;
				}
				while (local52 != local55) {
					@Pc(195) Class28_Sub4_Sub2 local195 = (Class28_Sub4_Sub2) local55;
					if (local153) {
						local151 = local195.aBoolean743;
						local149 = local195.anInt9657;
						local153 = false;
					}
					if (local40 > 0 && (local195.anInt9657 != local149 || local195.aBoolean743 != local151)) {
						local153 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray578[local40++] - local46 >> local87;
					if (local237 < 1600) {
						if (this.anIntArray577[local237] >= 64) {
							label102: {
								if (this.anIntArray577[local237] == 64) {
									if (this.anInt6508 == 64) {
										break label102;
									}
									this.anIntArray577[local237] += this.anInt6508++ + 1;
								}
								@Pc(285) Class28_Sub4_Sub2[] local285 = this.aClass28_Sub4_Sub2ArrayArray3[this.anIntArray577[local237] - 64 - 1];
								@Pc(293) int local293 = this.anIntArray577[local237] - 65;
								@Pc(295) int local295 = this.anIntArray579[this.anIntArray577[local237] - 65];
								this.anIntArray579[local293] = this.anIntArray579[this.anIntArray577[local237] - 65] + 1;
								local285[local295] = local195;
							}
						} else {
							this.aClass28_Sub4_Sub2ArrayArray4[local237][this.anIntArray577[local237]++] = local195;
						}
					}
					local55 = local55.aClass28_Sub4_9;
				}
				arg2.method7508(false, local149 >= 0 ? local149 : -1, false);
				if (local151 && Static196.aFloat89 != arg2.aFloat172) {
					arg2.xa(Static196.aFloat89);
				} else if (arg2.aFloat172 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method5816(arg2, local118);
			}
		} catch (@Pc(364) Exception local364) {
		}
		this.method5818(arg2);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ai;I)V")
	public void method5815(@OriginalArg(0) Class13_Sub1 arg0) {
		this.anInterface15_8.method8746(786336, 24);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!ai;I)V")
	private void method5816(@OriginalArg(1) Class13_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class239_Sub3 local11 = arg0.method7431();
		@Pc(14) float local14 = local11.aFloat219;
		@Pc(17) float local17 = local11.aFloat216;
		@Pc(20) float local20 = local11.aFloat225;
		@Pc(23) float local23 = local11.aFloat223;
		@Pc(26) float local26 = local11.aFloat214;
		@Pc(29) float local29 = local11.aFloat215;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(56) float local56 = local20 - local29;
		@Pc(61) float local61 = local23 - local14;
		@Pc(66) float local66 = local26 - local17;
		@Pc(70) float local70 = local29 - local20;
		@Pc(76) Buffer local76 = this.anInterface15_8.method8744();
		if (local76 == null) {
			return;
		}
		@Pc(84) Stream local84 = arg0.method7409(local76);
		@Pc(90) int local90;
		@Pc(105) int local105;
		@Pc(114) int local114;
		@Pc(123) Class28_Sub4_Sub2 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class28_Sub4_Sub2 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.c()) {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local105 = this.anIntArray577[local90] > 64 ? 64 : this.anIntArray577[local90];
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass28_Sub4_Sub2ArrayArray4[local90][local114];
						local126 = local123.anInt9658;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt9656 >> 12);
						local156 = (float) (local123.anInt9650 >> 12);
						local162 = (float) (local123.anInt9652 >> 12);
						local167 = local123.anInt9651 >> 12;
						local84.b(local150 + (float) -local167 * local33);
						local84.b(local156 + (float) -local167 * local37);
						local84.b(local162 + local41 * (float) -local167);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(0.0F);
						local84.b(0.0F);
						local84.b(local46 * (float) local167 + local150);
						local84.b(local156 + local51 * (float) local167);
						local84.b(local162 + (float) local167 * local56);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(1.0F);
						local84.b(0.0F);
						local84.b((float) local167 * local33 + local150);
						local84.b(local156 + local37 * (float) local167);
						local84.b(local162 + (float) local167 * local41);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(1.0F);
						local84.b(1.0F);
						local84.b(local150 + (float) local167 * local61);
						local84.b(local156 + local66 * (float) local167);
						local84.b((float) local167 * local70 + local162);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(0.0F);
						local84.b(1.0F);
						local7++;
					}
					if (this.anIntArray577[local90] > 64) {
						local391 = this.anIntArray577[local90] - 64 - 1;
						for (local126 = this.anIntArray579[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass28_Sub4_Sub2ArrayArray3[local391][local126];
							local410 = local407.anInt9658;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = (float) (local407.anInt9656 >> 12);
							local440 = (float) (local407.anInt9650 >> 12);
							local446 = (float) (local407.anInt9652 >> 12);
							local451 = local407.anInt9651 >> 12;
							local84.b(local162 + local33 * (float) -local451);
							local84.b(local37 * (float) -local451 + local440);
							local84.b((float) -local451 * local41 + local446);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(0.0F);
							local84.b(0.0F);
							local84.b(local162 + local46 * (float) local451);
							local84.b(local51 * (float) local451 + local440);
							local84.b(local446 + local56 * (float) local451);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(1.0F);
							local84.b(0.0F);
							local84.b(local162 + (float) local451 * local33);
							local84.b(local37 * (float) local451 + local440);
							local84.b(local446 + (float) local451 * local41);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(1.0F);
							local84.b(1.0F);
							local84.b(local162 + local61 * (float) local451);
							local84.b(local440 + local66 * (float) local451);
							local84.b(local446 + local70 * (float) local451);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(0.0F);
							local7++;
							local84.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local105 = this.anIntArray577[local90] <= 64 ? this.anIntArray577[local90] : 64;
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass28_Sub4_Sub2ArrayArray4[local90][local114];
						local126 = local123.anInt9658;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt9656 >> 12);
						local156 = (float) (local123.anInt9650 >> 12);
						local162 = (float) (local123.anInt9652 >> 12);
						local167 = local123.anInt9651 >> 12;
						local84.a(local33 * (float) -local167 + local150);
						local84.a((float) -local167 * local37 + local156);
						local84.a(local41 * (float) -local167 + local162);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(0.0F);
						local84.a(0.0F);
						local84.a(local150 + local46 * (float) local167);
						local84.a(local156 + (float) local167 * local51);
						local84.a((float) local167 * local56 + local162);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(1.0F);
						local84.a(0.0F);
						local84.a(local33 * (float) local167 + local150);
						local84.a(local156 + (float) local167 * local37);
						local84.a((float) local167 * local41 + local162);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(1.0F);
						local84.a(1.0F);
						local84.a((float) local167 * local61 + local150);
						local84.a(local156 + (float) local167 * local66);
						local84.a(local162 + local70 * (float) local167);
						if (arg0.anInt8623 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(0.0F);
						local7++;
						local84.a(1.0F);
					}
					if (this.anIntArray577[local90] > 64) {
						local391 = this.anIntArray577[local90] - 65;
						for (local126 = this.anIntArray579[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass28_Sub4_Sub2ArrayArray3[local391][local126];
							local410 = local407.anInt9658;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = (float) (local407.anInt9656 >> 12);
							local440 = (float) (local407.anInt9650 >> 12);
							local446 = (float) (local407.anInt9652 >> 12);
							local451 = local407.anInt9651 >> 12;
							local84.a((float) -local451 * local33 + local162);
							local84.a((float) -local451 * local37 + local440);
							local84.a((float) -local451 * local41 + local446);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(0.0F);
							local84.a(0.0F);
							local84.a(local162 + (float) local451 * local46);
							local84.a(local440 + local51 * (float) local451);
							local84.a(local446 + local56 * (float) local451);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(1.0F);
							local84.a(0.0F);
							local84.a(local162 + (float) local451 * local33);
							local84.a(local440 + (float) local451 * local37);
							local84.a(local446 + (float) local451 * local41);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(1.0F);
							local84.a(1.0F);
							local84.a(local162 + (float) local451 * local61);
							local84.a(local440 + local66 * (float) local451);
							local84.a(local446 + local70 * (float) local451);
							if (arg0.anInt8623 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(0.0F);
							local84.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local84.a();
		if (this.anInterface15_8.method8747()) {
			arg0.method7423(this.anInterface15_8, 0);
			arg0.method7423(this.anInterface15_9, 1);
			arg0.method7472(this.aClass233_9);
			arg0.method7424(local7 * 2, 0, this.anInterface20_6, 0, local7 * 4, Static413.aClass393_4);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLclient!ai;)V")
	private void method5817(@OriginalArg(1) Class13_Sub1 arg0) {
		Static196.aFloat89 = arg0.aFloat172;
		arg0.method7493();
		arg0.method7487(false);
		arg0.method7505(false);
		arg0.method7459();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!ai;B)V")
	private void method5818(@OriginalArg(0) Class13_Sub1 arg0) {
		arg0.method7505(true);
		arg0.method7487(true);
		if (Static196.aFloat89 != arg0.aFloat172) {
			arg0.xa(Static196.aFloat89);
		}
	}
}
