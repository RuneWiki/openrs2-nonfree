import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class168 {

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[I")
	private final int[] anIntArray207 = new int[8191];

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	private int anInt4213 = 0;

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "[[Lclient!mca;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray3 = new Class1_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "[I")
	private final int[] anIntArray208 = new int[1600];

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "[[Lclient!mca;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray4 = new Class1_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "[I")
	private final int[] anIntArray209 = new int[64];

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "Lclient!fj;")
	private final Class3 aClass3_13;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "Lclient!el;")
	private final Interface9 anInterface9_7;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!el;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "Lclient!cda;")
	private final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class168(@OriginalArg(0) Class44_Sub2 arg0) {
		this.aClass3_13 = arg0.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_3, Static525.aClass326_5 }), new Class220(Static525.aClass326_2) });
		this.anInterface9_7 = arg0.method4286(true);
		this.anInterface9_6 = arg0.method4286(false);
		this.anInterface9_6.method5102(12, 393168);
		this.anInterface3_3 = arg0.method4245(false);
		this.anInterface3_3.method5228(49146);
		@Pc(98) Buffer local98 = this.anInterface3_3.method5235();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4315(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
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
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			}
			local105.a();
			this.anInterface3_3.method5237();
		}
		@Pc(202) Buffer local202 = this.anInterface9_6.method5100();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method4315(local202);
			if (Stream.b()) {
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
			local209.a();
			this.anInterface9_6.method5101();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IILclient!ifa;Lclient!so;)V")
	public void method3742(@OriginalArg(1) int arg0, @OriginalArg(2) Class44_Sub2 arg1, @OriginalArg(3) Class305 arg2) {
		if (arg1.aClass8_Sub3_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method3743(arg0, arg1);
		} else {
			this.method3748(arg1);
		}
		@Pc(33) float local33 = arg1.aClass8_Sub3_16.aFloat38;
		@Pc(37) float local37 = arg1.aClass8_Sub3_16.aFloat43;
		@Pc(41) float local41 = arg1.aClass8_Sub3_16.aFloat39;
		@Pc(45) float local45 = arg1.aClass8_Sub3_16.aFloat42;
		try {
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = Integer.MAX_VALUE;
			@Pc(51) int local51 = 0;
			@Pc(55) Class1_Sub1 local55 = arg2.aClass224_1.aClass1_Sub1_7;
			@Pc(58) Class1_Sub1 local58;
			@Pc(90) int local90;
			for (local58 = local55.aClass1_Sub1_10; local58 != local55; local58 = local58.aClass1_Sub1_10) {
				@Pc(63) Class1_Sub1_Sub1 local63 = (Class1_Sub1_Sub1) local58;
				local90 = (int) (local45 + local37 * (float) (local63.anInt71 >> 12) + (float) (local63.anInt72 >> 12) * local33 + (float) (local63.anInt73 >> 12) * local41);
				if (local49 > local90) {
					local49 = local90;
				}
				if (local51 < local90) {
					local51 = local90;
				}
				this.anIntArray207[local47++] = local90;
			}
			@Pc(117) int local117 = local51 - local49;
			if (local117 + 2 <= 1600) {
				local117 += 2;
				local90 = 0;
			} else {
				local90 = Static244.method3930(local117) + 1 - Static484.anInt8860;
				local117 = (local117 >> local90) + 2;
			}
			local58 = local55.aClass1_Sub1_10;
			local47 = 0;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local55 != local58) {
				this.anInt4213 = 0;
				for (@Pc(162) int local162 = 0; local162 < local117; local162++) {
					this.anIntArray208[local162] = 0;
				}
				for (@Pc(175) int local175 = 0; local175 < 64; local175++) {
					this.anIntArray209[local175] = 0;
				}
				while (local55 != local58) {
					@Pc(191) Class1_Sub1_Sub1 local191 = (Class1_Sub1_Sub1) local58;
					if (local155) {
						local153 = local191.aBoolean2;
						local151 = local191.anInt74;
						local155 = false;
					}
					if (local47 > 0 && (local151 != local191.anInt74 || local191.aBoolean2 != local153)) {
						local155 = true;
						break;
					}
					@Pc(234) int local234 = this.anIntArray207[local47++] - local49 >> local90;
					if (local234 < 1600) {
						if (this.anIntArray208[local234] < 64) {
							this.aClass1_Sub1_Sub1ArrayArray3[local234][this.anIntArray208[local234]++] = local191;
						} else {
							label106: {
								if (this.anIntArray208[local234] == 64) {
									if (this.anInt4213 == 64) {
										break label106;
									}
									this.anIntArray208[local234] += this.anInt4213++ + 1;
								}
								@Pc(304) Class1_Sub1_Sub1[] local304 = this.aClass1_Sub1_Sub1ArrayArray4[this.anIntArray208[local234] - 64 - 1];
								@Pc(314) int local314 = this.anIntArray208[local234] - 1 - 64;
								@Pc(316) int local316 = this.anIntArray209[this.anIntArray208[local234] - 1 - 64];
								this.anIntArray209[local314] = this.anIntArray209[this.anIntArray208[local234] - 1 - 64] + 1;
								local304[local316] = local191;
							}
						}
					}
					local58 = local58.aClass1_Sub1_10;
				}
				arg1.method4272(local151 >= 0 ? local151 : -1, false, false);
				if (local153 && arg1.aFloat153 != Static445.aFloat212) {
					arg1.ra(Static445.aFloat212);
				} else if (arg1.aFloat153 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method3749(local117, arg1);
			}
		} catch (@Pc(373) Exception local373) {
		}
		this.method3747(arg1);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IILclient!ifa;)V")
	private void method3743(@OriginalArg(0) int arg0, @OriginalArg(2) Class44_Sub2 arg1) {
		Static445.aFloat212 = arg1.aFloat153;
		arg1.method4372((float) arg0);
		arg1.method4251();
		arg1.method4255(false);
		arg1.method4248(false);
		arg1.method4273();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ifa;B)V")
	public void method3744(@OriginalArg(0) Class44_Sub2 arg0) {
		this.anInterface9_7.method5102(24, 786336);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	public void method3746() {
		this.anInterface9_7.method5230();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ifa;)V")
	private void method3747(@OriginalArg(1) Class44_Sub2 arg0) {
		arg0.method4248(true);
		arg0.method4255(true);
		if (Static445.aFloat212 != arg0.aFloat153) {
			arg0.ra(Static445.aFloat212);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ifa;I)V")
	private void method3748(@OriginalArg(0) Class44_Sub2 arg0) {
		Static445.aFloat212 = arg0.aFloat153;
		arg0.method4278();
		arg0.method4255(false);
		arg0.method4248(false);
		arg0.method4273();
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ifa;B)V")
	private void method3749(@OriginalArg(0) int arg0, @OriginalArg(1) Class44_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class8_Sub3 local11 = arg1.method4322();
		@Pc(14) float local14 = local11.aFloat45;
		@Pc(17) float local17 = local11.aFloat46;
		@Pc(20) float local20 = local11.aFloat41;
		@Pc(23) float local23 = local11.aFloat44;
		@Pc(26) float local26 = local11.aFloat37;
		@Pc(29) float local29 = local11.aFloat48;
		@Pc(33) float local33 = local23 + local14;
		@Pc(43) float local43 = local17 + local26;
		@Pc(47) float local47 = local29 + local20;
		@Pc(51) float local51 = local14 - local23;
		@Pc(55) float local55 = local17 - local26;
		@Pc(60) float local60 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(69) float local69 = local26 - local17;
		@Pc(73) float local73 = local29 - local20;
		@Pc(79) Buffer local79 = this.anInterface9_7.method5100();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg1.method4315(local79);
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class1_Sub1_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(441) float local441;
		@Pc(446) int local446;
		@Pc(386) int local386;
		@Pc(402) Class1_Sub1_Sub1 local402;
		@Pc(405) int local405;
		@Pc(418) byte local418;
		@Pc(423) byte local423;
		@Pc(435) float local435;
		if (Stream.b()) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray208[local93] <= 64 ? this.anIntArray208[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass1_Sub1_Sub1ArrayArray3[local93][local116];
						local128 = local125.anInt69;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt72 >> 12;
						local158 = local125.anInt71 >> 12;
						local164 = local125.anInt73 >> 12;
						local169 = local125.anInt70 >> 12;
						local87.b(local152 + (float) -local169 * local33);
						local87.b(local158 + (float) -local169 * local43);
						local87.b(local164 + (float) -local169 * local47);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local152 + (float) local169 * local51);
						local87.b(local55 * (float) local169 + local158);
						local87.b(local164 + (float) local169 * local60);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b(local33 * (float) local169 + local152);
						local87.b(local158 + local43 * (float) local169);
						local87.b((float) local169 * local47 + local164);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b(local152 + local64 * (float) local169);
						local87.b((float) local169 * local69 + local158);
						local87.b(local164 + (float) local169 * local73);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.b(0.0F);
						local87.b(1.0F);
						local7++;
					}
					if (this.anIntArray208[local93] > 64) {
						local386 = this.anIntArray208[local93] - 65;
						for (local128 = this.anIntArray209[local386] - 1; local128 >= 0; local128--) {
							local402 = this.aClass1_Sub1_Sub1ArrayArray4[local386][local128];
							local405 = local402.anInt69;
							local141 = (byte) (local405 >> 16);
							local146 = (byte) (local405 >> 8);
							local418 = (byte) local405;
							local423 = (byte) (local405 >>> 24);
							local164 = local402.anInt72 >> 12;
							local435 = local402.anInt71 >> 12;
							local441 = local402.anInt73 >> 12;
							local446 = local402.anInt70 >> 12;
							local87.b(local33 * (float) -local446 + local164);
							local87.b((float) -local446 * local43 + local435);
							local87.b(local441 + (float) -local446 * local47);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local164 + local51 * (float) local446);
							local87.b((float) local446 * local55 + local435);
							local87.b((float) local446 * local60 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b(local164 + (float) local446 * local33);
							local87.b(local435 + local43 * (float) local446);
							local87.b(local441 + local47 * (float) local446);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b((float) local446 * local64 + local164);
							local87.b((float) local446 * local69 + local435);
							local87.b(local73 * (float) local446 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.b(0.0F);
							local7++;
							local87.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray208[local93] <= 64 ? this.anIntArray208[local93] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass1_Sub1_Sub1ArrayArray3[local93][local116];
						local128 = local125.anInt69;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt72 >> 12;
						local158 = local125.anInt71 >> 12;
						local164 = local125.anInt73 >> 12;
						local169 = local125.anInt70 >> 12;
						local87.a(local152 + (float) -local169 * local33);
						local87.a(local158 + local43 * (float) -local169);
						local87.a(local47 * (float) -local169 + local164);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local152 + local51 * (float) local169);
						local87.a((float) local169 * local55 + local158);
						local87.a(local164 + (float) local169 * local60);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local152 + (float) local169 * local33);
						local87.a(local43 * (float) local169 + local158);
						local87.a((float) local169 * local47 + local164);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local64 * (float) local169 + local152);
						local87.a(local69 * (float) local169 + local158);
						local87.a(local73 * (float) local169 + local164);
						if (arg1.anInt4940 == 0) {
							local87.b(local133, local138, local141, local146);
						} else {
							local87.a(local133, local138, local141, local146);
						}
						local87.a(0.0F);
						local87.a(1.0F);
						local7++;
					}
					if (this.anIntArray208[local93] > 64) {
						local386 = this.anIntArray208[local93] - 65;
						for (local128 = this.anIntArray209[local386] - 1; local128 >= 0; local128--) {
							local402 = this.aClass1_Sub1_Sub1ArrayArray4[local386][local128];
							local405 = local402.anInt69;
							local141 = (byte) (local405 >> 16);
							local146 = (byte) (local405 >> 8);
							local418 = (byte) local405;
							local423 = (byte) (local405 >>> 24);
							local164 = local402.anInt72 >> 12;
							local435 = local402.anInt71 >> 12;
							local441 = local402.anInt73 >> 12;
							local446 = local402.anInt70 >> 12;
							local87.a(local164 + local33 * (float) -local446);
							local87.a((float) -local446 * local43 + local435);
							local87.a(local47 * (float) -local446 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a((float) local446 * local51 + local164);
							local87.a(local435 + (float) local446 * local55);
							local87.a((float) local446 * local60 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a((float) local446 * local33 + local164);
							local87.a(local435 + (float) local446 * local43);
							local87.a((float) local446 * local47 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a((float) local446 * local64 + local164);
							local87.a(local435 + (float) local446 * local69);
							local87.a((float) local446 * local73 + local441);
							if (arg1.anInt4940 == 0) {
								local87.b(local141, local146, local418, local423);
							} else {
								local87.a(local141, local146, local418, local423);
							}
							local87.a(0.0F);
							local87.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local87.a();
		if (this.anInterface9_7.method5101()) {
			arg1.method4358(0, this.anInterface9_7);
			arg1.method4358(1, this.anInterface9_6);
			arg1.method4374(this.aClass3_13);
			arg1.method4361(0, Static262.aClass271_5, local7 * 2, 0, local7 * 4, this.anInterface3_3);
		}
	}
}
