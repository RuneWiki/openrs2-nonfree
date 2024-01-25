import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class285 {

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "[I")
	private final int[] anIntArray594 = new int[64];

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "[I")
	private final int[] anIntArray595 = new int[8191];

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "[I")
	private final int[] anIntArray593 = new int[1600];

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "[[Lclient!ag;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray3 = new Class8_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
	private int anInt7723 = 0;

	@OriginalMember(owner = "client!rea", name = "x", descriptor = "[[Lclient!ag;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray4 = new Class8_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "Lclient!rd;")
	private final Class284 aClass284_14;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "Lclient!bca;")
	private final Interface4 anInterface4_12;

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "Lclient!bca;")
	private final Interface4 anInterface4_11;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "Lclient!rn;")
	private final Interface20 anInterface20_7;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!hea;)V")
	public Class285(@OriginalArg(0) Class134_Sub1 arg0) {
		this.aClass284_14 = arg0.method6855(new Class7[] { new Class7(new Class198[] { Static282.aClass198_1, Static282.aClass198_3, Static282.aClass198_5 }), new Class7(Static282.aClass198_2) });
		this.anInterface4_12 = arg0.method6805(true);
		this.anInterface4_11 = arg0.method6805(false);
		this.anInterface4_11.method2468(393168, 12);
		this.anInterface20_7 = arg0.method6804(false);
		this.anInterface20_7.method7376(49146);
		@Pc(98) Buffer local98 = this.anInterface20_7.method7387();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6846(local98);
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
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.a();
			this.anInterface20_7.method7389();
		}
		@Pc(200) Buffer local200 = this.anInterface4_11.method2465();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6846(local200);
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
			local207.a();
			this.anInterface4_11.method2466();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!hea;I)V")
	private void method6180(@OriginalArg(1) Class134_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class113_Sub3 local11 = arg0.method6786();
		@Pc(14) float local14 = local11.aFloat173;
		@Pc(17) float local17 = local11.aFloat170;
		@Pc(20) float local20 = local11.aFloat171;
		@Pc(23) float local23 = local11.aFloat174;
		@Pc(33) float local33 = local11.aFloat177;
		@Pc(36) float local36 = local11.aFloat176;
		@Pc(40) float local40 = local23 + local14;
		@Pc(44) float local44 = local17 + local33;
		@Pc(48) float local48 = local20 + local36;
		@Pc(52) float local52 = local14 - local23;
		@Pc(57) float local57 = local17 - local33;
		@Pc(62) float local62 = local20 - local36;
		@Pc(67) float local67 = local23 - local14;
		@Pc(72) float local72 = local33 - local17;
		@Pc(77) float local77 = local36 - local20;
		@Pc(83) Buffer local83 = this.anInterface4_12.method2465();
		if (local83 == null) {
			return;
		}
		@Pc(91) Stream local91 = arg0.method6846(local83);
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class8_Sub2_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(449) float local449;
		@Pc(454) int local454;
		@Pc(394) int local394;
		@Pc(410) Class8_Sub2_Sub1 local410;
		@Pc(413) int local413;
		@Pc(426) byte local426;
		@Pc(431) byte local431;
		@Pc(443) float local443;
		if (Stream.c()) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray593[local97] <= 64 ? this.anIntArray593[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass8_Sub2_Sub1ArrayArray4[local97][local123];
						local135 = local132.anInt5209;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt5208 >> 12;
						local165 = local132.anInt5211 >> 12;
						local171 = local132.anInt5210 >> 12;
						local176 = local132.anInt5212 >> 12;
						local91.a(local40 * (float) -local176 + local159);
						local91.a((float) -local176 * local44 + local165);
						local91.a((float) -local176 * local48 + local171);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.a(0.0F);
						local91.a(0.0F);
						local91.a((float) local176 * local52 + local159);
						local91.a((float) local176 * local57 + local165);
						local91.a(local171 + (float) local176 * local62);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.a(1.0F);
						local91.a(0.0F);
						local91.a(local159 + local40 * (float) local176);
						local91.a(local165 + local44 * (float) local176);
						local91.a(local171 + local48 * (float) local176);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.a(1.0F);
						local91.a(1.0F);
						local91.a((float) local176 * local67 + local159);
						local91.a(local165 + local72 * (float) local176);
						local91.a(local77 * (float) local176 + local171);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.a(0.0F);
						local7++;
						local91.a(1.0F);
					}
					if (this.anIntArray593[local97] > 64) {
						local394 = this.anIntArray593[local97] - 1 - 64;
						for (local135 = this.anIntArray594[local394] - 1; local135 >= 0; local135--) {
							local410 = this.aClass8_Sub2_Sub1ArrayArray3[local394][local135];
							local413 = local410.anInt5209;
							local148 = (byte) (local413 >> 16);
							local153 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local171 = local410.anInt5208 >> 12;
							local443 = local410.anInt5211 >> 12;
							local449 = local410.anInt5210 >> 12;
							local454 = local410.anInt5212 >> 12;
							local91.a((float) -local454 * local40 + local171);
							local91.a(local443 + (float) -local454 * local44);
							local91.a(local48 * (float) -local454 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.a(0.0F);
							local91.a(0.0F);
							local91.a(local171 + (float) local454 * local52);
							local91.a(local57 * (float) local454 + local443);
							local91.a((float) local454 * local62 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.a(1.0F);
							local91.a(0.0F);
							local91.a(local171 + local40 * (float) local454);
							local91.a(local44 * (float) local454 + local443);
							local91.a(local48 * (float) local454 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.a(1.0F);
							local91.a(1.0F);
							local91.a(local171 + (float) local454 * local67);
							local91.a((float) local454 * local72 + local443);
							local91.a(local449 + local77 * (float) local454);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.a(0.0F);
							local7++;
							local91.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray593[local97] > 64 ? 64 : this.anIntArray593[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass8_Sub2_Sub1ArrayArray4[local97][local123];
						local135 = local132.anInt5209;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt5208 >> 12;
						local165 = local132.anInt5211 >> 12;
						local171 = local132.anInt5210 >> 12;
						local176 = local132.anInt5212 >> 12;
						local91.b(local159 + local40 * (float) -local176);
						local91.b((float) -local176 * local44 + local165);
						local91.b(local48 * (float) -local176 + local171);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.b(0.0F);
						local91.b(0.0F);
						local91.b(local159 + local52 * (float) local176);
						local91.b((float) local176 * local57 + local165);
						local91.b(local171 + (float) local176 * local62);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.b(1.0F);
						local91.b(0.0F);
						local91.b(local40 * (float) local176 + local159);
						local91.b((float) local176 * local44 + local165);
						local91.b(local171 + (float) local176 * local48);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.b(1.0F);
						local91.b(1.0F);
						local91.b(local159 + (float) local176 * local67);
						local91.b(local165 + local72 * (float) local176);
						local91.b(local171 + local77 * (float) local176);
						if (arg0.anInt8438 == 0) {
							local91.b(local140, local145, local148, local153);
						} else {
							local91.a(local140, local145, local148, local153);
						}
						local91.b(0.0F);
						local7++;
						local91.b(1.0F);
					}
					if (this.anIntArray593[local97] > 64) {
						local394 = this.anIntArray593[local97] - 1 - 64;
						for (local135 = this.anIntArray594[local394] - 1; local135 >= 0; local135--) {
							local410 = this.aClass8_Sub2_Sub1ArrayArray3[local394][local135];
							local413 = local410.anInt5209;
							local148 = (byte) (local413 >> 16);
							local153 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local171 = local410.anInt5208 >> 12;
							local443 = local410.anInt5211 >> 12;
							local449 = local410.anInt5210 >> 12;
							local454 = local410.anInt5212 >> 12;
							local91.b(local171 + local40 * (float) -local454);
							local91.b((float) -local454 * local44 + local443);
							local91.b(local449 + local48 * (float) -local454);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.b(0.0F);
							local91.b(0.0F);
							local91.b((float) local454 * local52 + local171);
							local91.b((float) local454 * local57 + local443);
							local91.b((float) local454 * local62 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.b(1.0F);
							local91.b(0.0F);
							local91.b(local171 + (float) local454 * local40);
							local91.b(local443 + (float) local454 * local44);
							local91.b((float) local454 * local48 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.b(1.0F);
							local91.b(1.0F);
							local91.b(local171 + (float) local454 * local67);
							local91.b(local72 * (float) local454 + local443);
							local91.b(local77 * (float) local454 + local449);
							if (arg0.anInt8438 == 0) {
								local91.b(local148, local153, local426, local431);
							} else {
								local91.a(local148, local153, local426, local431);
							}
							local91.b(0.0F);
							local7++;
							local91.b(1.0F);
						}
					}
				}
			}
		}
		local91.a();
		if (this.anInterface4_12.method2466()) {
			arg0.method6829(0, this.anInterface4_12);
			arg0.method6829(1, this.anInterface4_11);
			arg0.method6743(this.aClass284_14);
			arg0.method6765(Static470.aClass185_5, local7 * 2, 0, this.anInterface20_7, local7 * 4, 0);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZLclient!hea;)V")
	private void method6182(@OriginalArg(1) Class134_Sub1 arg0) {
		arg0.method6827(true);
		arg0.method6729(true);
		if (arg0.aFloat196 != Static311.aFloat121) {
			arg0.ra(Static311.aFloat121);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!hea;)V")
	private void method6184(@OriginalArg(1) Class134_Sub1 arg0) {
		Static311.aFloat121 = arg0.aFloat196;
		arg0.method6775();
		arg0.method6729(false);
		arg0.method6827(false);
		arg0.method6839();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBLclient!vi;Lclient!hea;)V")
	public void method6185(@OriginalArg(0) int arg0, @OriginalArg(2) Class343 arg1, @OriginalArg(3) Class134_Sub1 arg2) {
		if (arg2.aClass113_Sub3_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method6184(arg2);
		} else {
			this.method6186(arg0, arg2);
		}
		@Pc(26) float local26 = arg2.aClass113_Sub3_16.aFloat169;
		@Pc(30) float local30 = arg2.aClass113_Sub3_16.aFloat167;
		@Pc(34) float local34 = arg2.aClass113_Sub3_16.aFloat175;
		@Pc(38) float local38 = arg2.aClass113_Sub3_16.aFloat172;
		try {
			@Pc(40) int local40 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class8_Sub2 local56 = arg1.aClass355_1.aClass8_Sub2_9;
			@Pc(59) Class8_Sub2 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass8_Sub2_8; local59 != local56; local59 = local59.aClass8_Sub2_8) {
				@Pc(64) Class8_Sub2_Sub1 local64 = (Class8_Sub2_Sub1) local59;
				local91 = (int) ((float) (local64.anInt5210 >> 12) * local34 + (float) (local64.anInt5211 >> 12) * local30 + (float) (local64.anInt5208 >> 12) * local26 + local38);
				if (local91 > local52) {
					local52 = local91;
				}
				this.anIntArray595[local40++] = local91;
				if (local91 < local50) {
					local50 = local91;
				}
			}
			@Pc(118) int local118 = local52 - local50;
			if (local118 + 2 <= 1600) {
				local118 += 2;
				local91 = 0;
			} else {
				local91 = Static139.method2103(local118) + 1 - Static399.anInt7024;
				local118 = (local118 >> local91) + 2;
			}
			local59 = local56.aClass8_Sub2_8;
			local40 = 0;
			@Pc(150) int local150 = -2;
			@Pc(152) boolean local152 = true;
			@Pc(154) boolean local154 = true;
			while (local59 != local56) {
				this.anInt7723 = 0;
				for (@Pc(161) int local161 = 0; local161 < local118; local161++) {
					this.anIntArray593[local161] = 0;
				}
				for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
					this.anIntArray594[local174] = 0;
				}
				while (local56 != local59) {
					@Pc(192) Class8_Sub2_Sub1 local192 = (Class8_Sub2_Sub1) local59;
					if (local154) {
						local150 = local192.anInt5213;
						local152 = local192.aBoolean421;
						local154 = false;
					}
					if (local40 > 0 && (local150 != local192.anInt5213 || local192.aBoolean421 != local152)) {
						local154 = true;
						break;
					}
					@Pc(235) int local235 = this.anIntArray595[local40++] - local50 >> local91;
					if (local235 < 1600) {
						if (this.anIntArray593[local235] >= 64) {
							label101: {
								if (this.anIntArray593[local235] == 64) {
									if (this.anInt7723 == 64) {
										break label101;
									}
									this.anIntArray593[local235] += this.anInt7723++ + 1;
								}
								@Pc(286) Class8_Sub2_Sub1[] local286 = this.aClass8_Sub2_Sub1ArrayArray3[this.anIntArray593[local235] - 65];
								@Pc(296) int local296 = this.anIntArray593[local235] - 64 - 1;
								@Pc(298) int local298 = this.anIntArray594[this.anIntArray593[local235] - 64 - 1];
								this.anIntArray594[local296] = this.anIntArray594[this.anIntArray593[local235] - 64 - 1] + 1;
								local286[local298] = local192;
							}
						} else {
							this.aClass8_Sub2_Sub1ArrayArray4[local235][this.anIntArray593[local235]++] = local192;
						}
					}
					local59 = local59.aClass8_Sub2_8;
				}
				arg2.method6857(false, false, local150 < 0 ? -1 : local150);
				if (local152 && Static311.aFloat121 != arg2.aFloat196) {
					arg2.ra(Static311.aFloat121);
				} else if (arg2.aFloat196 != 1.0F) {
					arg2.ra(1.0F);
				}
				this.method6180(arg2, local118);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method6182(arg2);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!hea;)V")
	private void method6186(@OriginalArg(0) int arg0, @OriginalArg(2) Class134_Sub1 arg1) {
		Static311.aFloat121 = arg1.aFloat196;
		arg1.method6760((float) arg0);
		arg1.method6726();
		arg1.method6729(false);
		arg1.method6827(false);
		arg1.method6839();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLclient!hea;)V")
	public void method6187(@OriginalArg(1) Class134_Sub1 arg0) {
		this.anInterface4_12.method2468(786336, 24);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
	public void method6188() {
		this.anInterface4_12.method7384();
	}
}
