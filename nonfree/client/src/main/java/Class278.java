import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class278 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[I")
	private final int[] anIntArray625 = new int[64];

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
	private final int[] anIntArray626 = new int[8191];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	private int anInt8021 = 0;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "[[Lclient!si;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray3 = new Class2_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!to", name = "o", descriptor = "[I")
	private final int[] anIntArray627 = new int[1600];

	@OriginalMember(owner = "client!to", name = "m", descriptor = "[[Lclient!si;")
	private final Class2_Sub4_Sub1[][] aClass2_Sub4_Sub1ArrayArray4 = new Class2_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!to", name = "q", descriptor = "Lclient!ql;")
	private final Interface15 anInterface15_10;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!sk;")
	private final Class265 aClass265_14;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "Lclient!af;")
	private final Interface1 anInterface1_6;

	static {
		new Class114("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
		new Class114("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class278(@OriginalArg(0) Class9_Sub1 arg0) {
		this.anInterface15_10 = arg0.method7707(true);
		this.aClass265_14 = arg0.method7729(new Class317[] { new Class317(new Class245[] { Static397.aClass245_1, Static397.aClass245_3, Static397.aClass245_5 }) });
		this.anInterface1_6 = arg0.method7718(false);
		this.anInterface1_6.method7526(49146);
		@Pc(76) Buffer local76 = this.anInterface1_6.method7519();
		if (local76 != null) {
			@Pc(83) Stream local83 = arg0.method7677(local76);
			@Pc(87) int local87;
			@Pc(92) int local92;
			if (Stream.c()) {
				for (local87 = 0; local87 < 8191; local87++) {
					local92 = local87 * 4;
					local83.c(local92);
					local83.c(local92 + 1);
					local83.c(local92 + 2);
					local83.c(local92 + 2);
					local83.c(local92 + 3);
					local83.c(local92);
				}
			} else {
				for (local87 = 0; local87 < 8191; local87++) {
					local92 = local87 * 4;
					local83.f(local92);
					local83.f(local92 + 1);
					local83.f(local92 + 2);
					local83.f(local92 + 2);
					local83.f(local92 + 3);
					local83.f(local92);
				}
			}
			local83.b();
			this.anInterface1_6.method7521();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	public void method6820() {
		this.anInterface15_10.method7527();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cb;Z)V")
	private void method6821(@OriginalArg(0) Class9_Sub1 arg0) {
		Static323.aFloat117 = arg0.aFloat202;
		arg0.method7649();
		arg0.method7751(false);
		arg0.method7724(false);
		arg0.method7693();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!rd;Lclient!cb;)V")
	public void method6824(@OriginalArg(1) Class249 arg0, @OriginalArg(2) Class9_Sub1 arg1) {
		if (arg1.aClass22_Sub3_16 == null) {
			return;
		}
		this.method6821(arg1);
		@Pc(21) float local21 = arg1.aClass22_Sub3_16.aFloat133;
		@Pc(25) float local25 = arg1.aClass22_Sub3_16.aFloat144;
		@Pc(29) float local29 = arg1.aClass22_Sub3_16.aFloat143;
		@Pc(33) float local33 = arg1.aClass22_Sub3_16.aFloat142;
		try {
			@Pc(43) int local43;
			@Pc(51) int local51;
			@Pc(74) Class2_Sub4 local74;
			@Pc(87) int local87;
			@Pc(227) Class2_Sub4_Sub1[] local227;
			@Pc(177) int local177;
			@Pc(235) int local235;
			@Pc(237) int local237;
			if (arg0.aBoolean474) {
				local43 = arg0.anInt7170 - arg0.anInt7171;
				if (local43 + 2 <= 1600) {
					local43 += 2;
					local51 = 0;
				} else {
					local51 = Static124.method4359(local43) + 1 - Static239.anInt4640;
					local43 = (local43 >> local51) + 2;
				}
				@Pc(71) Class2_Sub4 local71 = arg0.aClass120_1.aClass2_Sub4_7;
				local74 = local71.aClass2_Sub4_9;
				@Pc(76) int local76 = -2;
				@Pc(78) boolean local78 = true;
				@Pc(80) boolean local80 = true;
				while (local74 != local71) {
					this.anInt8021 = 0;
					for (local87 = 0; local87 < local43; local87++) {
						this.anIntArray627[local87] = 0;
					}
					for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
						this.anIntArray625[local104] = 0;
					}
					while (local74 != local71) {
						@Pc(120) Class2_Sub4_Sub1 local120 = (Class2_Sub4_Sub1) local74;
						if (local80) {
							local80 = false;
							local76 = local120.anInt2552;
							local78 = local120.aBoolean179;
						} else if (local120.anInt2552 != local76 || local78 != local120.aBoolean179) {
							local80 = true;
							break;
						}
						local177 = (int) ((float) (local120.anInt2549 >> 12) * local25 + local21 * (float) (local120.anInt2551 >> 12) + (float) (local120.anInt2546 >> 12) * local29 + local33) - arg0.anInt7171 >> local51;
						if (local177 < 1600) {
							if (this.anIntArray627[local177] >= 64) {
								label188: {
									if (this.anIntArray627[local177] == 64) {
										if (this.anInt8021 == 64) {
											break label188;
										}
										this.anIntArray627[local177] += this.anInt8021++ + 1;
									}
									local227 = this.aClass2_Sub4_Sub1ArrayArray4[this.anIntArray627[local177] - 64 - 1];
									local235 = this.anIntArray627[local177] - 65;
									local237 = this.anIntArray625[this.anIntArray627[local177] - 65];
									this.anIntArray625[local235] = this.anIntArray625[this.anIntArray627[local177] - 65] + 1;
									local227[local237] = local120;
								}
							} else {
								this.aClass2_Sub4_Sub1ArrayArray3[local177][this.anIntArray627[local177]++] = local120;
							}
						}
						local74 = local74.aClass2_Sub4_9;
					}
					arg1.method7732(false, local76, false);
					if (local78 && arg1.aFloat202 != Static323.aFloat117) {
						arg1.M(Static323.aFloat117);
					} else if (arg1.aFloat202 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method6827(local43, arg1);
				}
			} else {
				local43 = 0;
				local51 = Integer.MAX_VALUE;
				@Pc(308) int local308 = 0;
				local74 = arg0.aClass120_1.aClass2_Sub4_7;
				@Pc(315) Class2_Sub4 local315;
				@Pc(347) int local347;
				for (local315 = local74.aClass2_Sub4_9; local315 != local74; local315 = local315.aClass2_Sub4_9) {
					@Pc(320) Class2_Sub4_Sub1 local320 = (Class2_Sub4_Sub1) local315;
					local347 = (int) (local33 + (float) (local320.anInt2546 >> 12) * local29 + (float) (local320.anInt2551 >> 12) * local21 + (float) (local320.anInt2549 >> 12) * local25);
					if (local347 > local308) {
						local308 = local347;
					}
					this.anIntArray626[local43++] = local347;
					if (local51 > local347) {
						local51 = local347;
					}
				}
				@Pc(373) int local373 = local308 - local51;
				if (local373 + 2 <= 1600) {
					local373 += 2;
					local347 = 0;
				} else {
					local347 = Static124.method4359(local373) + 1 - Static239.anInt4640;
					local373 = (local373 >> local347) + 2;
				}
				local43 = 0;
				local315 = local74.aClass2_Sub4_9;
				local87 = -2;
				@Pc(406) boolean local406 = true;
				@Pc(408) boolean local408 = true;
				while (local74 != local315) {
					this.anInt8021 = 0;
					for (local177 = 0; local177 < local373; local177++) {
						this.anIntArray627[local177] = 0;
					}
					for (@Pc(428) int local428 = 0; local428 < 64; local428++) {
						this.anIntArray625[local428] = 0;
					}
					while (local315 != local74) {
						@Pc(446) Class2_Sub4_Sub1 local446 = (Class2_Sub4_Sub1) local315;
						if (local408) {
							local406 = local446.aBoolean179;
							local408 = false;
							local87 = local446.anInt2552;
						}
						if (local43 > 0 && (local87 != local446.anInt2552 || local406 != local446.aBoolean179)) {
							local408 = true;
							break;
						}
						@Pc(492) int local492 = this.anIntArray626[local43++] - local51 >> local347;
						if (local492 < 1600) {
							if (this.anIntArray627[local492] < 64) {
								this.aClass2_Sub4_Sub1ArrayArray3[local492][this.anIntArray627[local492]++] = local446;
							} else {
								label139: {
									if (this.anIntArray627[local492] == 64) {
										if (this.anInt8021 == 64) {
											break label139;
										}
										this.anIntArray627[local492] += this.anInt8021++ + 1;
									}
									local227 = this.aClass2_Sub4_Sub1ArrayArray4[this.anIntArray627[local492] - 65];
									local235 = this.anIntArray627[local492] - 64 - 1;
									local237 = this.anIntArray625[this.anIntArray627[local492] - 64 - 1];
									this.anIntArray625[local235] = this.anIntArray625[this.anIntArray627[local492] - 64 - 1] + 1;
									local227[local237] = local446;
								}
							}
						}
						local315 = local315.aClass2_Sub4_9;
					}
					arg1.method7732(false, local87 >= 0 ? local87 : -1, false);
					if (local406 && Static323.aFloat117 != arg1.aFloat202) {
						arg1.M(Static323.aFloat117);
					} else if (arg1.aFloat202 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method6827(local373, arg1);
				}
			}
		} catch (@Pc(622) Exception local622) {
		}
		this.method6825(arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!cb;B)V")
	private void method6825(@OriginalArg(0) Class9_Sub1 arg0) {
		arg0.method7724(true);
		arg0.method7751(true);
		if (Static323.aFloat117 != arg0.aFloat202) {
			arg0.M(Static323.aFloat117);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!cb;)V")
	public void method6826(@OriginalArg(1) Class9_Sub1 arg0) {
		this.anInterface15_10.method6277(196584, 24);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!cb;Z)V")
	private void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class22_Sub3 local11 = arg1.method7659();
		@Pc(14) float local14 = local11.aFloat140;
		@Pc(17) float local17 = local11.aFloat136;
		@Pc(20) float local20 = local11.aFloat141;
		@Pc(23) float local23 = local11.aFloat139;
		@Pc(26) float local26 = local11.aFloat135;
		@Pc(29) float local29 = local11.aFloat137;
		@Pc(33) float local33 = local14 + local23;
		@Pc(45) float local45 = local17 + local26;
		@Pc(49) float local49 = local20 + local29;
		@Pc(53) float local53 = local14 - local23;
		@Pc(57) float local57 = local17 - local26;
		@Pc(61) float local61 = local20 - local29;
		@Pc(66) float local66 = local23 - local14;
		@Pc(71) float local71 = local26 - local17;
		@Pc(75) float local75 = local29 - local20;
		@Pc(81) Buffer local81 = this.anInterface15_10.method7519();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg1.method7677(local81);
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(121) int local121;
		@Pc(130) Class2_Sub4_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(417) float local417;
		@Pc(422) int local422;
		@Pc(362) int local362;
		@Pc(378) Class2_Sub4_Sub1 local378;
		@Pc(381) int local381;
		@Pc(394) byte local394;
		@Pc(399) byte local399;
		@Pc(411) float local411;
		if (Stream.c()) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray627[local95] > 64 ? 64 : this.anIntArray627[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass2_Sub4_Sub1ArrayArray3[local95][local121];
						local133 = local130.anInt2550;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt2551 >> 12;
						local163 = local130.anInt2549 >> 12;
						local169 = local130.anInt2546 >> 12;
						local174 = local130.anInt2553 >> 12;
						local89.a(local33 * (float) -local174 + local157);
						local89.a(local45 * (float) -local174 + local163);
						local89.a(local169 + (float) -local174 * local49);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local157 + local53 * (float) local174);
						local89.a((float) local174 * local57 + local163);
						local89.a(local169 + local61 * (float) local174);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local157 + (float) local174 * local33);
						local89.a((float) local174 * local45 + local163);
						local89.a((float) local174 * local49 + local169);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local66 * (float) local174 + local157);
						local89.a(local163 + local71 * (float) local174);
						local89.a(local169 + (float) local174 * local75);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.a(0.0F);
						local7++;
						local89.a(1.0F);
					}
					if (this.anIntArray627[local95] > 64) {
						local362 = this.anIntArray627[local95] - 64 - 1;
						for (local133 = this.anIntArray625[local362] - 1; local133 >= 0; local133--) {
							local378 = this.aClass2_Sub4_Sub1ArrayArray4[local362][local133];
							local381 = local378.anInt2550;
							local146 = (byte) (local381 >> 16);
							local151 = (byte) (local381 >> 8);
							local394 = (byte) local381;
							local399 = (byte) (local381 >>> 24);
							local169 = local378.anInt2551 >> 12;
							local411 = local378.anInt2549 >> 12;
							local417 = local378.anInt2546 >> 12;
							local422 = local378.anInt2553 >> 12;
							local89.a(local169 + local33 * (float) -local422);
							local89.a(local45 * (float) -local422 + local411);
							local89.a(local417 + local49 * (float) -local422);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a(local169 + (float) local422 * local53);
							local89.a(local411 + (float) local422 * local57);
							local89.a(local417 + (float) local422 * local61);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a((float) local422 * local33 + local169);
							local89.a((float) local422 * local45 + local411);
							local89.a(local417 + (float) local422 * local49);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local169 + (float) local422 * local66);
							local89.a((float) local422 * local71 + local411);
							local89.a(local417 + local75 * (float) local422);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.a(0.0F);
							local89.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray627[local95] > 64 ? 64 : this.anIntArray627[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass2_Sub4_Sub1ArrayArray3[local95][local121];
						local133 = local130.anInt2550;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt2551 >> 12;
						local163 = local130.anInt2549 >> 12;
						local169 = local130.anInt2546 >> 12;
						local174 = local130.anInt2553 >> 12;
						local89.b(local157 + (float) -local174 * local33);
						local89.b(local163 + (float) -local174 * local45);
						local89.b(local169 + (float) -local174 * local49);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local157 + (float) local174 * local53);
						local89.b((float) local174 * local57 + local163);
						local89.b(local169 + local61 * (float) local174);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b(local157 + local33 * (float) local174);
						local89.b(local163 + (float) local174 * local45);
						local89.b(local169 + (float) local174 * local49);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b(local157 + (float) local174 * local66);
						local89.b((float) local174 * local71 + local163);
						local89.b(local169 + local75 * (float) local174);
						local89.b(local146);
						local89.b(local143);
						local89.b(local138);
						local89.b(local151);
						local89.b(0.0F);
						local89.b(1.0F);
						local7++;
					}
					if (this.anIntArray627[local95] > 64) {
						local362 = this.anIntArray627[local95] - 65;
						for (local133 = this.anIntArray625[local362] - 1; local133 >= 0; local133--) {
							local378 = this.aClass2_Sub4_Sub1ArrayArray4[local362][local133];
							local381 = local378.anInt2550;
							local146 = (byte) (local381 >> 16);
							local151 = (byte) (local381 >> 8);
							local394 = (byte) local381;
							local399 = (byte) (local381 >>> 24);
							local169 = local378.anInt2551 >> 12;
							local411 = local378.anInt2549 >> 12;
							local417 = local378.anInt2546 >> 12;
							local422 = local378.anInt2553 >> 12;
							local89.b((float) -local422 * local33 + local169);
							local89.b(local411 + local45 * (float) -local422);
							local89.b(local49 * (float) -local422 + local417);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local169 + local53 * (float) local422);
							local89.b(local411 + local57 * (float) local422);
							local89.b(local61 * (float) local422 + local417);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local169 + (float) local422 * local33);
							local89.b((float) local422 * local45 + local411);
							local89.b(local417 + (float) local422 * local49);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local169 + local66 * (float) local422);
							local89.b(local411 + local71 * (float) local422);
							local89.b(local75 * (float) local422 + local417);
							local89.b(local394);
							local89.b(local151);
							local89.b(local146);
							local89.b(local399);
							local89.b(0.0F);
							local7++;
							local89.b(1.0F);
						}
					}
				}
			}
		}
		local89.b();
		if (this.anInterface15_10.method7521()) {
			arg1.method7664(this.aClass265_14);
			arg1.method7697(this.anInterface15_10, 0);
			arg1.method7658(Static29.aClass102_1, 0, 0, local7 * 4, local7 * 2, this.anInterface1_6);
		}
	}
}
