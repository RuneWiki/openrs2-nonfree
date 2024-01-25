import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class18 {

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
	private final int[] anIntArray19 = new int[8191];

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "[[Lclient!dg;")
	private final Class21_Sub3_Sub1[][] aClass21_Sub3_Sub1ArrayArray1 = new Class21_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "[I")
	private final int[] anIntArray20 = new int[1600];

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	private int anInt948 = 0;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "[[Lclient!dg;")
	private final Class21_Sub3_Sub1[][] aClass21_Sub3_Sub1ArrayArray2 = new Class21_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "[I")
	private final int[] anIntArray21 = new int[64];

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "Lclient!dt;")
	private final Class82 aClass82_13;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!wf;")
	private final Interface24 anInterface24_6;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Lclient!wf;")
	private final Interface24 anInterface24_5;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!eu;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class18(@OriginalArg(0) Class7_Sub1 arg0) {
		this.aClass82_13 = arg0.method5736(new Class204[] { new Class204(new Class91[] { Static117.aClass91_1, Static117.aClass91_3, Static117.aClass91_5 }), new Class204(Static117.aClass91_2) });
		this.anInterface24_6 = arg0.method5704(true);
		this.anInterface24_5 = arg0.method5704(false);
		this.anInterface24_5.method6549(393168, 12);
		this.anInterface6_3 = arg0.method5726(false);
		this.anInterface6_3.method7932(49146);
		@Pc(98) Buffer local98 = this.anInterface6_3.method7935();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5675(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
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
			local105.a();
			this.anInterface6_3.method7936();
		}
		@Pc(200) Buffer local200 = this.anInterface24_5.method6550();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method5675(local200);
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
			this.anInterface24_5.method6551();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public void method818() {
		this.anInterface24_6.method7925();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nh;BI)V")
	private void method819(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static139.aFloat70 = arg0.aFloat171;
		arg0.method5711((float) arg1);
		arg0.method5667();
		arg0.method5724(false);
		arg0.method5702(false);
		arg0.method5767();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!nh;)V")
	private void method820(@OriginalArg(1) Class7_Sub1 arg0) {
		Static139.aFloat70 = arg0.aFloat171;
		arg0.method5720();
		arg0.method5724(false);
		arg0.method5702(false);
		arg0.method5767();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!nh;II)V")
	private void method821(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class81_Sub1 local11 = arg0.method5776();
		@Pc(14) float local14 = local11.aFloat59;
		@Pc(21) float local21 = local11.aFloat57;
		@Pc(24) float local24 = local11.aFloat62;
		@Pc(27) float local27 = local11.aFloat63;
		@Pc(30) float local30 = local11.aFloat55;
		@Pc(33) float local33 = local11.aFloat61;
		@Pc(37) float local37 = local27 + local14;
		@Pc(41) float local41 = local21 + local30;
		@Pc(45) float local45 = local24 + local33;
		@Pc(49) float local49 = local14 - local27;
		@Pc(53) float local53 = local21 - local30;
		@Pc(57) float local57 = local24 - local33;
		@Pc(61) float local61 = local27 - local14;
		@Pc(65) float local65 = local30 - local21;
		@Pc(69) float local69 = local33 - local24;
		@Pc(75) Buffer local75 = this.anInterface24_6.method6550();
		if (local75 == null) {
			return;
		}
		@Pc(83) Stream local83 = arg0.method5675(local75);
		@Pc(89) int local89;
		@Pc(104) int local104;
		@Pc(110) int local110;
		@Pc(119) Class21_Sub3_Sub1 local119;
		@Pc(122) int local122;
		@Pc(127) byte local127;
		@Pc(132) byte local132;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(146) float local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(163) int local163;
		@Pc(437) float local437;
		@Pc(442) int local442;
		@Pc(382) int local382;
		@Pc(398) Class21_Sub3_Sub1 local398;
		@Pc(401) int local401;
		@Pc(414) byte local414;
		@Pc(419) byte local419;
		@Pc(431) float local431;
		if (Stream.c()) {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local104 = this.anIntArray20[local89] <= 64 ? this.anIntArray20[local89] : 64;
				if (local104 > 0) {
					for (local110 = local104 - 1; local110 >= 0; local110--) {
						local119 = this.aClass21_Sub3_Sub1ArrayArray1[local89][local110];
						local122 = local119.anInt8631;
						local127 = (byte) (local122 >> 16);
						local132 = (byte) (local122 >> 8);
						local135 = (byte) local122;
						local140 = (byte) (local122 >>> 24);
						local146 = local119.anInt8632 >> 12;
						local152 = local119.anInt8629 >> 12;
						local158 = local119.anInt8627 >> 12;
						local163 = local119.anInt8623 >> 12;
						local83.b(local37 * (float) -local163 + local146);
						local83.b(local152 + (float) -local163 * local41);
						local83.b(local45 * (float) -local163 + local158);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.b(0.0F);
						local83.b(0.0F);
						local83.b(local49 * (float) local163 + local146);
						local83.b(local152 + (float) local163 * local53);
						local83.b(local57 * (float) local163 + local158);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.b(1.0F);
						local83.b(0.0F);
						local83.b((float) local163 * local37 + local146);
						local83.b(local152 + local41 * (float) local163);
						local83.b(local158 + (float) local163 * local45);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.b(1.0F);
						local83.b(1.0F);
						local83.b((float) local163 * local61 + local146);
						local83.b(local152 + (float) local163 * local65);
						local83.b(local69 * (float) local163 + local158);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.b(0.0F);
						local7++;
						local83.b(1.0F);
					}
					if (this.anIntArray20[local89] > 64) {
						local382 = this.anIntArray20[local89] - 1 - 64;
						for (local122 = this.anIntArray21[local382] - 1; local122 >= 0; local122--) {
							local398 = this.aClass21_Sub3_Sub1ArrayArray2[local382][local122];
							local401 = local398.anInt8631;
							local135 = (byte) (local401 >> 16);
							local140 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local158 = local398.anInt8632 >> 12;
							local431 = local398.anInt8629 >> 12;
							local437 = local398.anInt8627 >> 12;
							local442 = local398.anInt8623 >> 12;
							local83.b(local37 * (float) -local442 + local158);
							local83.b(local431 + local41 * (float) -local442);
							local83.b(local437 + (float) -local442 * local45);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.b(0.0F);
							local83.b(0.0F);
							local83.b(local49 * (float) local442 + local158);
							local83.b(local53 * (float) local442 + local431);
							local83.b((float) local442 * local57 + local437);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.b(1.0F);
							local83.b(0.0F);
							local83.b((float) local442 * local37 + local158);
							local83.b(local431 + local41 * (float) local442);
							local83.b((float) local442 * local45 + local437);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.b(1.0F);
							local83.b(1.0F);
							local83.b(local158 + local61 * (float) local442);
							local83.b(local65 * (float) local442 + local431);
							local83.b((float) local442 * local69 + local437);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.b(0.0F);
							local7++;
							local83.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local104 = this.anIntArray20[local89] <= 64 ? this.anIntArray20[local89] : 64;
				if (local104 > 0) {
					for (local110 = local104 - 1; local110 >= 0; local110--) {
						local119 = this.aClass21_Sub3_Sub1ArrayArray1[local89][local110];
						local122 = local119.anInt8631;
						local127 = (byte) (local122 >> 16);
						local132 = (byte) (local122 >> 8);
						local135 = (byte) local122;
						local140 = (byte) (local122 >>> 24);
						local146 = local119.anInt8632 >> 12;
						local152 = local119.anInt8629 >> 12;
						local158 = local119.anInt8627 >> 12;
						local163 = local119.anInt8623 >> 12;
						local83.a(local37 * (float) -local163 + local146);
						local83.a(local41 * (float) -local163 + local152);
						local83.a(local158 + local45 * (float) -local163);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.a(0.0F);
						local83.a(0.0F);
						local83.a(local146 + (float) local163 * local49);
						local83.a(local152 + local53 * (float) local163);
						local83.a((float) local163 * local57 + local158);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.a(1.0F);
						local83.a(0.0F);
						local83.a(local146 + (float) local163 * local37);
						local83.a((float) local163 * local41 + local152);
						local83.a((float) local163 * local45 + local158);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.a(1.0F);
						local83.a(1.0F);
						local83.a(local146 + (float) local163 * local61);
						local83.a(local65 * (float) local163 + local152);
						local83.a(local158 + (float) local163 * local69);
						if (arg0.anInt7351 == 0) {
							local83.b(local127, local132, local135, local140);
						} else {
							local83.a(local127, local132, local135, local140);
						}
						local83.a(0.0F);
						local7++;
						local83.a(1.0F);
					}
					if (this.anIntArray20[local89] > 64) {
						local382 = this.anIntArray20[local89] - 64 - 1;
						for (local122 = this.anIntArray21[local382] - 1; local122 >= 0; local122--) {
							local398 = this.aClass21_Sub3_Sub1ArrayArray2[local382][local122];
							local401 = local398.anInt8631;
							local135 = (byte) (local401 >> 16);
							local140 = (byte) (local401 >> 8);
							local414 = (byte) local401;
							local419 = (byte) (local401 >>> 24);
							local158 = local398.anInt8632 >> 12;
							local431 = local398.anInt8629 >> 12;
							local437 = local398.anInt8627 >> 12;
							local442 = local398.anInt8623 >> 12;
							local83.a(local158 + local37 * (float) -local442);
							local83.a((float) -local442 * local41 + local431);
							local83.a(local437 + local45 * (float) -local442);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.a(0.0F);
							local83.a(0.0F);
							local83.a((float) local442 * local49 + local158);
							local83.a(local53 * (float) local442 + local431);
							local83.a(local437 + (float) local442 * local57);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.a(1.0F);
							local83.a(0.0F);
							local83.a(local158 + (float) local442 * local37);
							local83.a(local431 + (float) local442 * local41);
							local83.a(local45 * (float) local442 + local437);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.a(1.0F);
							local83.a(1.0F);
							local83.a(local61 * (float) local442 + local158);
							local83.a(local431 + local65 * (float) local442);
							local83.a(local69 * (float) local442 + local437);
							if (arg0.anInt7351 == 0) {
								local83.b(local135, local140, local414, local419);
							} else {
								local83.a(local135, local140, local414, local419);
							}
							local83.a(0.0F);
							local83.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local83.a();
		if (this.anInterface24_6.method6551()) {
			arg0.method5721(this.anInterface24_6, 0);
			arg0.method5721(this.anInterface24_5, 1);
			arg0.method5754(this.aClass82_13);
			arg0.method5680(local7 * 2, 0, local7 * 4, this.anInterface6_3, Static409.aClass119_6, 0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBLclient!nh;Lclient!qg;)V")
	public void method822(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub1 arg1, @OriginalArg(3) Class276 arg2) {
		if (arg1.aClass81_Sub1_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method819(arg1, arg0);
		} else {
			this.method820(arg1);
		}
		@Pc(29) float local29 = arg1.aClass81_Sub1_16.aFloat54;
		@Pc(33) float local33 = arg1.aClass81_Sub1_16.aFloat58;
		@Pc(37) float local37 = arg1.aClass81_Sub1_16.aFloat65;
		@Pc(41) float local41 = arg1.aClass81_Sub1_16.aFloat56;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class21_Sub3 local51 = arg2.aClass39_1.aClass21_Sub3_1;
			@Pc(60) Class21_Sub3 local60;
			@Pc(92) int local92;
			for (local60 = local51.aClass21_Sub3_9; local60 != local51; local60 = local60.aClass21_Sub3_9) {
				@Pc(65) Class21_Sub3_Sub1 local65 = (Class21_Sub3_Sub1) local60;
				local92 = (int) (local41 + (float) (local65.anInt8629 >> 12) * local33 + local29 * (float) (local65.anInt8632 >> 12) + local37 * (float) (local65.anInt8627 >> 12));
				if (local92 > local47) {
					local47 = local92;
				}
				if (local45 > local92) {
					local45 = local92;
				}
				this.anIntArray19[local43++] = local92;
			}
			@Pc(127) int local127 = local47 - local45;
			if (local127 + 2 <= 1600) {
				local127 += 2;
				local92 = 0;
			} else {
				local92 = Static507.method7317(local127) + 1 - Static23.anInt997;
				local127 = (local127 >> local92) + 2;
			}
			local43 = 0;
			local60 = local51.aClass21_Sub3_9;
			@Pc(162) int local162 = -2;
			@Pc(164) boolean local164 = true;
			@Pc(166) boolean local166 = true;
			while (local60 != local51) {
				this.anInt948 = 0;
				for (@Pc(173) int local173 = 0; local173 < local127; local173++) {
					this.anIntArray20[local173] = 0;
				}
				for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
					this.anIntArray21[local186] = 0;
				}
				while (local51 != local60) {
					@Pc(202) Class21_Sub3_Sub1 local202 = (Class21_Sub3_Sub1) local60;
					if (local166) {
						local162 = local202.anInt8630;
						local164 = local202.aBoolean610;
						local166 = false;
					}
					if (local43 > 0 && (local162 != local202.anInt8630 || local202.aBoolean610 != local164)) {
						local166 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray19[local43++] - local45 >> local92;
					if (local237 < 1600) {
						if (this.anIntArray20[local237] >= 64) {
							label97: {
								if (this.anIntArray20[local237] == 64) {
									if (this.anInt948 == 64) {
										break label97;
									}
									this.anIntArray20[local237] += this.anInt948++ + 1;
								}
								this.aClass21_Sub3_Sub1ArrayArray2[this.anIntArray20[local237] - 64 - 1][this.anIntArray21[this.anIntArray20[local237] - 64 - 1]++] = local202;
							}
						} else {
							this.aClass21_Sub3_Sub1ArrayArray1[local237][this.anIntArray20[local237]++] = local202;
						}
					}
					local60 = local60.aClass21_Sub3_9;
				}
				arg1.method5692(local162 < 0 ? -1 : local162, false, false);
				if (local164 && Static139.aFloat70 != arg1.aFloat171) {
					arg1.ra(Static139.aFloat70);
				} else if (arg1.aFloat171 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method821(arg1, local127);
			}
		} catch (@Pc(371) Exception local371) {
		}
		this.method824(arg1);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!nh;)V")
	private void method824(@OriginalArg(1) Class7_Sub1 arg0) {
		arg0.method5702(true);
		arg0.method5724(true);
		if (arg0.aFloat171 != Static139.aFloat70) {
			arg0.ra(Static139.aFloat70);
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(ILclient!nh;)V")
	public void method826(@OriginalArg(1) Class7_Sub1 arg0) {
		this.anInterface24_6.method6549(786336, 24);
	}
}
