import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class73 {

	@OriginalMember(owner = "client!dga", name = "h", descriptor = "[I")
	private final int[] anIntArray147 = new int[1600];

	@OriginalMember(owner = "client!dga", name = "j", descriptor = "[I")
	private final int[] anIntArray148 = new int[8191];

	@OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
	private int anInt1584 = 0;

	@OriginalMember(owner = "client!dga", name = "c", descriptor = "[[Lclient!cq;")
	private final Class60_Sub1_Sub1[][] aClass60_Sub1_Sub1ArrayArray1 = new Class60_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!dga", name = "n", descriptor = "[I")
	private final int[] anIntArray149 = new int[64];

	@OriginalMember(owner = "client!dga", name = "q", descriptor = "[[Lclient!cq;")
	private final Class60_Sub1_Sub1[][] aClass60_Sub1_Sub1ArrayArray2 = new Class60_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!dga", name = "s", descriptor = "Lclient!fl;")
	private final Class107 aClass107_1;

	@OriginalMember(owner = "client!dga", name = "d", descriptor = "Lclient!iq;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!dga", name = "k", descriptor = "Lclient!iq;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "Lclient!jn;")
	private final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class73(@OriginalArg(0) Class90_Sub3 arg0) {
		this.aClass107_1 = arg0.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_3, Static347.aClass217_5 }), new Class185(Static347.aClass217_2) });
		this.anInterface8_2 = arg0.method7562(true);
		this.anInterface8_3 = arg0.method7562(false);
		this.anInterface8_3.method6463(393168, 12);
		this.anInterface9_3 = arg0.method7545(false);
		this.anInterface9_3.method5935(49146);
		@Pc(98) Buffer local98 = this.anInterface9_3.method6462();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7595(local98);
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
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.b();
			this.anInterface9_3.method6460();
		}
		@Pc(200) Buffer local200 = this.anInterface8_3.method6462();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method7595(local200);
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
			local207.b();
			this.anInterface8_3.method6460();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!gj;Lclient!hfa;)V")
	public void method1434(@OriginalArg(1) Class90_Sub3 arg0, @OriginalArg(2) Class127 arg1) {
		if (arg0.aClass93_Sub3_16 == null) {
			return;
		}
		this.method1437(arg0);
		@Pc(17) float local17 = arg0.aClass93_Sub3_16.aFloat116;
		@Pc(21) float local21 = arg0.aClass93_Sub3_16.aFloat117;
		@Pc(25) float local25 = arg0.aClass93_Sub3_16.aFloat114;
		@Pc(29) float local29 = arg0.aClass93_Sub3_16.aFloat106;
		try {
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(49) Class60_Sub1 local49;
			@Pc(149) int local149;
			@Pc(160) int local160;
			@Pc(296) int local296;
			@Pc(298) int local298;
			@Pc(286) Class60_Sub1_Sub1[] local286;
			if (arg1.aBoolean299) {
				local41 = arg1.anInt3800 - arg1.anInt3801;
				if (local41 + 2 <= 1600) {
					local43 = 0;
					local41 += 2;
				} else {
					local43 = Static1.method54(local41) + 1 - Static194.anInt3798;
					local41 = (local41 >> local43) + 2;
				}
				@Pc(408) Class60_Sub1 local408 = arg1.aClass145_1.aClass60_Sub1_7;
				local49 = local408.aClass60_Sub1_10;
				@Pc(413) int local413 = -2;
				@Pc(415) boolean local415 = true;
				@Pc(417) boolean local417 = true;
				while (local49 != local408) {
					this.anInt1584 = 0;
					for (local149 = 0; local149 < local41; local149++) {
						this.anIntArray147[local149] = 0;
					}
					for (@Pc(437) int local437 = 0; local437 < 64; local437++) {
						this.anIntArray149[local437] = 0;
					}
					while (local49 != local408) {
						@Pc(455) Class60_Sub1_Sub1 local455 = (Class60_Sub1_Sub1) local49;
						if (local417) {
							local417 = false;
							local413 = local455.anInt2704;
							local415 = local455.aBoolean209;
						} else if (local413 != local455.anInt2704 || local415 != local455.aBoolean209) {
							local417 = true;
							break;
						}
						local160 = (int) (local29 + local17 * (float) (local455.anInt2705 >> 12) + (float) (local455.anInt2701 >> 12) * local21 + (float) (local455.anInt2709 >> 12) * local25) - arg1.anInt3801 >> local43;
						if (local160 < 1600) {
							if (this.anIntArray147[local160] >= 64) {
								label137: {
									if (this.anIntArray147[local160] == 64) {
										if (this.anInt1584 == 64) {
											break label137;
										}
										this.anIntArray147[local160] += this.anInt1584++ + 1;
									}
									local286 = this.aClass60_Sub1_Sub1ArrayArray2[this.anIntArray147[local160] - 65];
									local296 = this.anIntArray147[local160] - 64 - 1;
									local298 = this.anIntArray149[this.anIntArray147[local160] - 64 - 1];
									this.anIntArray149[local296] = this.anIntArray149[this.anIntArray147[local160] - 64 - 1] + 1;
									local286[local298] = local455;
								}
							} else {
								this.aClass60_Sub1_Sub1ArrayArray1[local160][this.anIntArray147[local160]++] = local455;
							}
						}
						local49 = local49.aClass60_Sub1_10;
					}
					arg0.method7548(false, local413 > 0 ? local413 : -1, false);
					if (local415 && arg0.aFloat201 != Static316.aFloat151) {
						arg0.ha(Static316.aFloat151);
					} else if (arg0.aFloat201 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method1439(local41, arg0);
				}
			} else {
				local41 = 0;
				local43 = Integer.MAX_VALUE;
				@Pc(45) int local45 = 0;
				local49 = arg1.aClass145_1.aClass60_Sub1_7;
				@Pc(52) Class60_Sub1 local52;
				@Pc(84) int local84;
				for (local52 = local49.aClass60_Sub1_10; local52 != local49; local52 = local52.aClass60_Sub1_10) {
					@Pc(57) Class60_Sub1_Sub1 local57 = (Class60_Sub1_Sub1) local52;
					local84 = (int) (local25 * (float) (local57.anInt2709 >> 12) + (float) (local57.anInt2705 >> 12) * local17 + local21 * (float) (local57.anInt2701 >> 12) + local29);
					this.anIntArray148[local41++] = local84;
					if (local45 < local84) {
						local45 = local84;
					}
					if (local43 > local84) {
						local43 = local84;
					}
				}
				@Pc(115) int local115 = local45 - local43;
				if (local115 + 2 <= 1600) {
					local84 = 0;
					local115 += 2;
				} else {
					local84 = Static1.method54(local115) + 1 - Static194.anInt3798;
					local115 = (local115 >> local84) + 2;
				}
				local52 = local49.aClass60_Sub1_10;
				local41 = 0;
				local149 = -2;
				@Pc(151) boolean local151 = true;
				@Pc(153) boolean local153 = true;
				while (local52 != local49) {
					this.anInt1584 = 0;
					for (local160 = 0; local160 < local115; local160++) {
						this.anIntArray147[local160] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray149[local173] = 0;
					}
					while (local49 != local52) {
						@Pc(189) Class60_Sub1_Sub1 local189 = (Class60_Sub1_Sub1) local52;
						if (local153) {
							local149 = local189.anInt2704;
							local153 = false;
							local151 = local189.aBoolean209;
						}
						if (local41 > 0 && (local189.anInt2704 != local149 || local151 != local189.aBoolean209)) {
							local153 = true;
							break;
						}
						@Pc(231) int local231 = this.anIntArray148[local41++] - local43 >> local84;
						if (local231 < 1600) {
							if (this.anIntArray147[local231] >= 64) {
								label182: {
									if (this.anIntArray147[local231] == 64) {
										if (this.anInt1584 == 64) {
											break label182;
										}
										this.anIntArray147[local231] += this.anInt1584++ + 1;
									}
									local286 = this.aClass60_Sub1_Sub1ArrayArray2[this.anIntArray147[local231] - 1 - 64];
									local296 = this.anIntArray147[local231] - 64 - 1;
									local298 = this.anIntArray149[this.anIntArray147[local231] - 64 - 1];
									this.anIntArray149[local296] = this.anIntArray149[this.anIntArray147[local231] - 64 - 1] + 1;
									local286[local298] = local189;
								}
							} else {
								this.aClass60_Sub1_Sub1ArrayArray1[local231][this.anIntArray147[local231]++] = local189;
							}
						}
						local52 = local52.aClass60_Sub1_10;
					}
					arg0.method7548(false, local149 >= 0 ? local149 : -1, false);
					if (local151 && Static316.aFloat151 != arg0.aFloat201) {
						arg0.ha(Static316.aFloat151);
					} else if (arg0.aFloat201 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method1439(local115, arg0);
				}
			}
		} catch (@Pc(650) Exception local650) {
		}
		this.method1438(arg0);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!gj;I)V")
	public void method1435(@OriginalArg(0) Class90_Sub3 arg0) {
		this.anInterface8_2.method6463(786336, 24);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V")
	public void method1436() {
		this.anInterface8_2.method6461();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLclient!gj;)V")
	private void method1437(@OriginalArg(1) Class90_Sub3 arg0) {
		Static316.aFloat151 = arg0.aFloat201;
		arg0.method7598();
		arg0.method7533(false);
		arg0.method7652(false);
		arg0.method7654();
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!gj;)V")
	private void method1438(@OriginalArg(1) Class90_Sub3 arg0) {
		arg0.method7652(true);
		arg0.method7533(true);
		if (Static316.aFloat151 != arg0.aFloat201) {
			arg0.ha(Static316.aFloat151);
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IILclient!gj;)V")
	private void method1439(@OriginalArg(0) int arg0, @OriginalArg(2) Class90_Sub3 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class93_Sub3 local11 = arg1.method7574();
		@Pc(14) float local14 = local11.aFloat112;
		@Pc(17) float local17 = local11.aFloat108;
		@Pc(20) float local20 = local11.aFloat109;
		@Pc(23) float local23 = local11.aFloat111;
		@Pc(26) float local26 = local11.aFloat115;
		@Pc(29) float local29 = local11.aFloat107;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(49) float local49 = local29 + local20;
		@Pc(54) float local54 = local14 - local23;
		@Pc(58) float local58 = local17 - local26;
		@Pc(63) float local63 = local20 - local29;
		@Pc(67) float local67 = local23 - local14;
		@Pc(71) float local71 = local26 - local17;
		@Pc(76) float local76 = local29 - local20;
		@Pc(82) Buffer local82 = this.anInterface8_2.method6462();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg1.method7595(local82);
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class60_Sub1_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(449) float local449;
		@Pc(454) int local454;
		@Pc(394) int local394;
		@Pc(410) Class60_Sub1_Sub1 local410;
		@Pc(413) int local413;
		@Pc(426) byte local426;
		@Pc(431) byte local431;
		@Pc(443) float local443;
		if (Stream.a()) {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray147[local96] > 64 ? 64 : this.anIntArray147[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass60_Sub1_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt2703;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2705 >> 12;
						local161 = local128.anInt2701 >> 12;
						local167 = local128.anInt2709 >> 12;
						local172 = local128.anInt2707 >> 12;
						local90.a(local155 + local33 * (float) -local172);
						local90.a(local161 + (float) -local172 * local37);
						local90.a(local49 * (float) -local172 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local155 + local54 * (float) local172);
						local90.a(local58 * (float) local172 + local161);
						local90.a(local63 * (float) local172 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a((float) local172 * local33 + local155);
						local90.a(local161 + (float) local172 * local37);
						local90.a(local49 * (float) local172 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a((float) local172 * local67 + local155);
						local90.a(local71 * (float) local172 + local161);
						local90.a((float) local172 * local76 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.a(0.0F);
						local90.a(1.0F);
						local7++;
					}
					if (this.anIntArray147[local96] > 64) {
						local394 = this.anIntArray147[local96] - 64 - 1;
						for (local131 = this.anIntArray149[local394] - 1; local131 >= 0; local131--) {
							local410 = this.aClass60_Sub1_Sub1ArrayArray2[local394][local131];
							local413 = local410.anInt2703;
							local144 = (byte) (local413 >> 16);
							local149 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local167 = local410.anInt2705 >> 12;
							local443 = local410.anInt2701 >> 12;
							local449 = local410.anInt2709 >> 12;
							local454 = local410.anInt2707 >> 12;
							local90.a(local167 + (float) -local454 * local33);
							local90.a((float) -local454 * local37 + local443);
							local90.a(local449 + local49 * (float) -local454);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a(local167 + (float) local454 * local54);
							local90.a(local58 * (float) local454 + local443);
							local90.a(local63 * (float) local454 + local449);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local167 + (float) local454 * local33);
							local90.a(local443 + (float) local454 * local37);
							local90.a((float) local454 * local49 + local449);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a(local167 + (float) local454 * local67);
							local90.a(local443 + local71 * (float) local454);
							local90.a(local449 + local76 * (float) local454);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.a(0.0F);
							local90.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local96 = arg0 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray147[local96] <= 64 ? this.anIntArray147[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass60_Sub1_Sub1ArrayArray1[local96][local119];
						local131 = local128.anInt2703;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt2705 >> 12;
						local161 = local128.anInt2701 >> 12;
						local167 = local128.anInt2709 >> 12;
						local172 = local128.anInt2707 >> 12;
						local90.b(local33 * (float) -local172 + local155);
						local90.b(local161 + local37 * (float) -local172);
						local90.b(local167 + local49 * (float) -local172);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local155 + local54 * (float) local172);
						local90.b(local161 + local58 * (float) local172);
						local90.b((float) local172 * local63 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b(local33 * (float) local172 + local155);
						local90.b(local161 + (float) local172 * local37);
						local90.b(local49 * (float) local172 + local167);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b(local155 + (float) local172 * local67);
						local90.b(local71 * (float) local172 + local161);
						local90.b(local167 + local76 * (float) local172);
						if (arg1.anInt9561 == 0) {
							local90.a(local136, local141, local144, local149);
						} else {
							local90.b(local136, local141, local144, local149);
						}
						local90.b(0.0F);
						local7++;
						local90.b(1.0F);
					}
					if (this.anIntArray147[local96] > 64) {
						local394 = this.anIntArray147[local96] - 64 - 1;
						for (local131 = this.anIntArray149[local394] - 1; local131 >= 0; local131--) {
							local410 = this.aClass60_Sub1_Sub1ArrayArray2[local394][local131];
							local413 = local410.anInt2703;
							local144 = (byte) (local413 >> 16);
							local149 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local167 = local410.anInt2705 >> 12;
							local443 = local410.anInt2701 >> 12;
							local449 = local410.anInt2709 >> 12;
							local454 = local410.anInt2707 >> 12;
							local90.b(local33 * (float) -local454 + local167);
							local90.b(local37 * (float) -local454 + local443);
							local90.b(local49 * (float) -local454 + local449);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local167 + (float) local454 * local54);
							local90.b(local443 + (float) local454 * local58);
							local90.b(local449 + (float) local454 * local63);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local167 + local33 * (float) local454);
							local90.b((float) local454 * local37 + local443);
							local90.b(local449 + (float) local454 * local49);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local167 + local67 * (float) local454);
							local90.b(local443 + (float) local454 * local71);
							local90.b(local449 + local76 * (float) local454);
							if (arg1.anInt9561 == 0) {
								local90.a(local144, local149, local426, local431);
							} else {
								local90.b(local144, local149, local426, local431);
							}
							local90.b(0.0F);
							local90.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local90.b();
		if (this.anInterface8_2.method6460()) {
			arg1.method7658(this.anInterface8_2, 0);
			arg1.method7658(this.anInterface8_3, 1);
			arg1.method7553(this.aClass107_1);
			arg1.method7560(local7 * 4, local7 * 2, 0, this.anInterface9_3, Static104.aClass321_1, 0);
		}
	}
}
