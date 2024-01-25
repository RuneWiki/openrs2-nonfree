import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class205_Sub2_Sub2 extends Class205_Sub2 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!jba;IIII[[I[[II)V")
	public Class205_Sub2_Sub2(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[I[II[[ZIBILclient!rt;)V")
	private void method6307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean[][] arg5, @OriginalArg(8) int arg6, @OriginalArg(11) Class261 arg7) {
		@Pc(14) int local14 = (arg1 - arg0) * 1024 / 256;
		arg7.aBoolean531 = false;
		arg7.aBoolean534 = false;
		@Pc(32) int local32 = 0;
		@Pc(37) int local37 = local14;
		for (@Pc(39) int local39 = arg4; local39 < arg6; local39++) {
			for (@Pc(43) int local43 = arg0; local43 < arg1; local43++) {
				if (arg5[local39 - arg4][local43 - arg0]) {
					@Pc(80) int local80;
					if (super.aClass112ArrayArray3[local39][local43] != null) {
						@Pc(306) Class112 local306 = super.aClass112ArrayArray3[local39][local43];
						if (local306.aShort46 != -1 && (local306.aByte47 & 0x2) == 0 && local306.anInt3029 == -1) {
							local80 = super.aClass122_Sub1_16.method7287(local306.aShort46);
							arg7.method6232(local37 - 4, local37 + -4, local37, local32 + 4, local32, local32 + 4, Static244.method4186(local80, local306.aShort50 & 0xFFFF), Static244.method4186(local80, local306.aShort48 & 0xFFFF), Static244.method4186(local80, local306.aShort49 & 0xFFFF));
							arg7.method6232(local37, local37, local37 - 4, local32, local32 + 4, local32, Static244.method4186(local80, local306.aShort47 & 0xFFFF), Static244.method4186(local80, local306.aShort49 & 0xFFFF), Static244.method4186(local80, local306.aShort48 & 0xFFFF));
						} else if (local306.anInt3029 == -1) {
							arg7.method6232(local37 - 4, local37 + -4, local37, local32 + 4, local32, local32 + 4, local306.aShort50 & 0xFFFF, local306.aShort48 & 0xFFFF, local306.aShort49 & 0xFFFF);
							arg7.method6232(local37, local37, local37 - 4, local32, local32 + 4, local32, local306.aShort47 & 0xFFFF, local306.aShort49 & 0xFFFF, local306.aShort48 & 0xFFFF);
						} else {
							local80 = local306.anInt3029;
							arg7.method6232(local37 - 4, local37 + -4, local37, local32 + 4, local32, local32 + 4, local80, local80, local80);
							arg7.method6232(local37, local37, local37 - 4, local32, local32 + 4, local32, local80, local80, local80);
						}
					} else if (super.aClass298ArrayArray3[local39][local43] != null) {
						@Pc(78) Class298 local78 = super.aClass298ArrayArray3[local39][local43];
						for (local80 = 0; local80 < local78.aShort133; local80++) {
							arg3[local80] = local32 + local78.aShortArray149[local80] * 4 / super.anInt8175;
							arg2[local80] = local37 - local78.aShortArray151[local80] * 4 / super.anInt8175;
						}
						for (@Pc(118) int local118 = 0; local118 < local78.aShort132; local118++) {
							@Pc(125) short local125 = local78.aShortArray152[local118];
							@Pc(130) short local130 = local78.aShortArray153[local118];
							@Pc(135) short local135 = local78.aShortArray147[local118];
							@Pc(139) int local139 = arg3[local125];
							@Pc(143) int local143 = arg3[local130];
							@Pc(147) int local147 = arg3[local135];
							@Pc(151) int local151 = arg2[local125];
							@Pc(155) int local155 = arg2[local130];
							@Pc(159) int local159 = arg2[local135];
							@Pc(187) int local187;
							if (local78.anIntArray773 != null && local78.anIntArray773[local118] != -1) {
								local187 = local78.anIntArray773[local118];
								arg7.method6232(local151, local155, local159, local139, local143, local147, Static244.method4186(local187, local78.aShortArray148[local125]), Static244.method4186(local187, local78.aShortArray148[local130]), Static244.method4186(local187, local78.aShortArray148[local135]));
							} else if (local78.aShortArray150 == null || local78.aShortArray150[local118] == -1) {
								local187 = local78.anIntArray774[local118];
								arg7.method6232(local151, local155, local159, local139, local143, local147, Static244.method4186(local187, local78.aShortArray148[local125]), Static244.method4186(local187, local78.aShortArray148[local130]), Static244.method4186(local187, local78.aShortArray148[local135]));
							} else {
								local187 = super.aClass122_Sub1_16.method7287(local78.aShortArray150[local118]);
								arg7.method6232(local151, local155, local159, local139, local143, local147, Static244.method4186(local187, local78.aShortArray148[local125]), Static244.method4186(local187, local78.aShortArray148[local130]), Static244.method4186(local187, local78.aShortArray148[local135]));
							}
						}
					}
				}
				local37 -= 4;
			}
			local37 = local14;
			local32 += 4;
		}
		arg7.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!rt;II[II[[ZIII[III)V")
	private void method6308(@OriginalArg(0) Class261 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int[] arg7) {
		@Pc(14) int local14 = (arg6 - arg1) * 1024 / 256;
		arg0.aBoolean531 = false;
		arg0.aBoolean534 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(36) int local36 = arg4; local36 < arg5; local36++) {
			for (@Pc(40) int local40 = arg1; local40 < arg6; local40++) {
				if (arg3[local36 - arg4][local40 - arg1]) {
					@Pc(89) int local89;
					if (super.aClass121ArrayArray3[local36][local40] != null) {
						@Pc(67) Class121 local67 = super.aClass121ArrayArray3[local36][local40];
						if (local67.aShort52 != -1 && (local67.aByte49 & 0x2) == 0 && local67.anInt3184 == 0) {
							local89 = super.aClass122_Sub1_16.method7287(local67.aShort52);
							arg0.method6232(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static244.method4186(local89, local67.anInt3188), Static244.method4186(local89, local67.anInt3186), Static244.method4186(local89, local67.anInt3185));
							arg0.method6232(local30, local30, local30 - 4, local26, local26 + 4, local26, Static244.method4186(local89, local67.anInt3187), Static244.method4186(local89, local67.anInt3185), Static244.method4186(local89, local67.anInt3186));
						} else if (local67.anInt3184 == 0) {
							arg0.method6225(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local67.anInt3188, local67.anInt3186, local67.anInt3185);
							arg0.method6225(local30, local30, local30 - 4, local26, local26 + 4, local26, local67.anInt3187, local67.anInt3185, local67.anInt3186);
						} else {
							local89 = local67.anInt3184;
							arg0.method6225(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, Static162.method2505(local67.anInt3188 & 0xFF000000, local89), Static162.method2505(local67.anInt3186 & 0xFF000000, local89), Static162.method2505(local67.anInt3185 & 0xFF000000, local89));
							arg0.method6225(local30, local30, local30 - 4, local26, local26 + 4, local26, Static162.method2505(local67.anInt3187 & 0xFF000000, local89), Static162.method2505(local67.anInt3185 & 0xFF000000, local89), Static162.method2505(local67.anInt3186 & 0xFF000000, local89));
						}
					} else if (super.aClass57ArrayArray3[local36][local40] != null) {
						@Pc(293) Class57 local293 = super.aClass57ArrayArray3[local36][local40];
						for (local89 = 0; local89 < local293.aShort6; local89++) {
							arg2[local89] = local293.aShortArray30[local89] * 4 / super.anInt8175 + local26;
							arg7[local89] = local30 - local293.aShortArray27[local89] * 4 / super.anInt8175;
						}
						for (@Pc(337) int local337 = 0; local337 < local293.aShort5; local337++) {
							@Pc(343) int local343 = local337 * 3;
							@Pc(347) int local347 = local343 + 1;
							@Pc(351) int local351 = local347 + 1;
							@Pc(355) int local355 = arg2[local343];
							@Pc(359) int local359 = arg2[local347];
							@Pc(363) int local363 = arg2[local351];
							@Pc(367) int local367 = arg7[local343];
							@Pc(371) int local371 = arg7[local347];
							@Pc(375) int local375 = arg7[local351];
							@Pc(417) int local417;
							if (local293.anIntArray159 != null && local293.anIntArray159[local337] != 0 && (local293.aShortArray29 == null || local293.aShortArray29 != null && local293.aShortArray29[local337] == -1)) {
								local417 = local293.anIntArray159[local337];
								arg0.method6225(local367, local371, local375, local355, local359, local363, Static162.method2505(-(local293.anIntArray160[local343] & -16777216) - 16777216, local417), Static162.method2505(-(local293.anIntArray160[local347] & 0xFF000000) - 16777216, local417), Static162.method2505(-(-16777216 & local293.anIntArray160[local351]) - 16777216, local417));
							} else if (local293.aShortArray29 == null || local293.aShortArray29[local337] == -1) {
								arg0.method6225(local367, local371, local375, local355, local359, local363, local293.anIntArray160[local343], local293.anIntArray160[local347], local293.anIntArray160[local351]);
							} else {
								local417 = super.aClass122_Sub1_16.method7287(local293.aShortArray29[local337]);
								arg0.method6232(local367, local371, local375, local355, local359, local363, local417, local417, local417);
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg0.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLclient!rt;[I[I[IZ)V")
	private void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class261 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(24) Class121 local24 = super.aClass121ArrayArray3[arg0][arg1];
		@Pc(43) int local43;
		@Pc(48) int local48;
		@Pc(53) int local53;
		@Pc(308) int local308;
		@Pc(383) int local383;
		@Pc(439) int local439;
		@Pc(479) int local479;
		@Pc(353) int local353;
		@Pc(411) int local411;
		@Pc(451) int local451;
		@Pc(508) int local508;
		@Pc(297) int local297;
		@Pc(342) int local342;
		@Pc(400) int local400;
		@Pc(468) int local468;
		@Pc(325) int local325;
		@Pc(371) int local371;
		@Pc(428) int local428;
		@Pc(496) int local496;
		@Pc(88) int local88;
		@Pc(87) int local87;
		@Pc(85) int local85;
		@Pc(83) int local83;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(201) int local201;
		@Pc(75) int local75;
		@Pc(95) int local95;
		@Pc(278) int local278;
		@Pc(546) int local546;
		@Pc(780) int local780;
		if (local24 == null) {
			@Pc(1586) Class57 local1586 = super.aClass57ArrayArray3[arg0][arg1];
			if (local1586 != null) {
				if (super.anInt7543 == -1) {
					for (local479 = 0; local479 < local1586.aShort6; local479++) {
						local43 = local1586.aShortArray30[local479] + (arg0 << super.anInt8176);
						local48 = local1586.aShortArray26[local479];
						local53 = local1586.aShortArray27[local479] + (arg1 << super.anInt8176);
						local439 = (local48 * super.anInt7547 + super.anInt7545 * local43 + super.anInt7554 * local53 >> 14) + super.anInt7546;
						if (super.aClass122_Sub1_16.anInt8841 >= local439) {
							return;
						}
						arg4[local479] = 0;
						if (arg2) {
							local353 = local439 - super.aClass122_Sub1_16.lb;
							if (local353 > 255) {
								local353 = 255;
							}
							if (local353 > 0) {
								arg4[local479] = local353;
								local411 = local1586.aShortArray28[local479] * local353 / 255;
								if (local411 > 0) {
									local48 -= local411;
								}
							}
						} else if (super.aClass122_Sub1_16.aBoolean622) {
							local353 = local439 - super.aClass122_Sub1_16.lb;
							if (local353 > 0) {
								arg4[local479] = local353;
								if (arg4[local479] > 255) {
									arg4[local479] = 255;
								}
							}
						}
						local308 = super.anInt7549 + (local53 * super.anInt7550 + local48 * super.anInt7551 + local43 * super.anInt7552 >> 14);
						local383 = (super.anInt7544 * local53 + local48 * super.anInt7553 + super.anInt7556 * local43 >> 14) + super.anInt7555;
						arg5[local479] = arg3.anInt7457 + super.aClass122_Sub1_16.anInt8837 * local308 / local439;
						arg6[local479] = super.aClass122_Sub1_16.anInt8855 * local383 / local439 + arg3.anInt7458;
					}
				} else {
					for (local479 = 0; local479 < local1586.aShort6; local479++) {
						local43 = local1586.aShortArray30[local479] + (arg0 << super.anInt8176);
						local48 = local1586.aShortArray26[local479];
						local53 = local1586.aShortArray27[local479] + (arg1 << super.anInt8176);
						arg4[local479] = 0;
						if (arg2) {
							local353 = super.anInt7543 - super.aClass122_Sub1_16.lb;
							if (local353 > 255) {
								local353 = 255;
							}
							if (local353 > 0) {
								arg4[local479] = local353;
								local411 = local353 * local1586.aShortArray28[local479] / 255;
								if (local411 > 0) {
									local48 -= local411;
								}
							}
						} else if (super.aClass122_Sub1_16.aBoolean622) {
							local353 = super.anInt7543 - super.aClass122_Sub1_16.lb;
							if (local353 > 0) {
								arg4[local479] = local353;
								if (arg4[local479] > 255) {
									arg4[local479] = 255;
								}
							}
						}
						local308 = super.anInt7549 + (local43 * super.anInt7552 + super.anInt7551 * local48 + super.anInt7550 * local53 >> 14);
						local383 = (local53 * super.anInt7544 + local48 * super.anInt7553 + local43 * super.anInt7556 >> 14) + super.anInt7555;
						arg5[local479] = super.aClass122_Sub1_16.anInt8837 * local308 / super.anInt7543 + arg3.anInt7457;
						arg6[local479] = local383 * super.aClass122_Sub1_16.anInt8855 / super.anInt7543 + arg3.anInt7458;
					}
				}
				if (local1586.aShortArray29 == null) {
					for (local479 = 0; local479 < local1586.aShort5; local479++) {
						local353 = local479 * 3;
						local411 = local353 + 1;
						local451 = local411 + 1;
						local508 = arg5[local353];
						local297 = arg5[local411];
						local342 = arg5[local451];
						local400 = arg6[local353];
						local468 = arg6[local411];
						local325 = arg6[local451];
						local371 = arg4[local411] + arg4[local353] + arg4[local451];
						if (-((local400 - local468) * (-local297 + local342)) + (local325 - local468) * (local508 + -local297) > 0) {
							arg3.aBoolean533 = local508 < 0 || local297 < 0 || local342 < 0 || arg3.anInt7459 < local508 || arg3.anInt7459 < local297 || arg3.anInt7459 < local342;
							if (local371 >= 765) {
								arg3.method6226(local400, local468, local325, local508, local297, local342, super.aClass122_Sub1_16.anInt8846);
							} else if (local371 > 0) {
								if ((local1586.anIntArray160[local353] & 0xFFFFFF) != 0) {
									arg3.method6225(local400, local468, local325, local508, local297, local342, Static133.method2241(arg4[local353], local1586.anIntArray160[local353], super.aClass122_Sub1_16.anInt8846), Static133.method2241(arg4[local411], local1586.anIntArray160[local411], super.aClass122_Sub1_16.anInt8846), Static133.method2241(arg4[local451], local1586.anIntArray160[local451], super.aClass122_Sub1_16.anInt8846));
								}
							} else if ((local1586.anIntArray160[local353] & 0xFFFFFF) != 0) {
								arg3.method6225(local400, local468, local325, local508, local297, local342, local1586.anIntArray160[local353], local1586.anIntArray160[local411], local1586.anIntArray160[local451]);
							}
						}
					}
				} else {
					local479 = super.anIntArrayArray98[arg0][arg1];
					local353 = super.anIntArrayArray98[arg0 + 1][arg1];
					local411 = super.anIntArrayArray98[arg0][arg1 + 1];
					local451 = arg0 * super.anInt8175;
					local508 = local451 + super.anInt8175;
					local297 = arg1 * super.anInt8175;
					local342 = super.anInt8175 + local297;
					local400 = (local297 * super.anInt7550 + super.anInt7552 * local451 + local479 * super.anInt7551 >> 14) + super.anInt7549;
					local468 = super.anInt7555 + (local297 * super.anInt7544 + local451 * super.anInt7556 + super.anInt7553 * local479 >> 14);
					local325 = (local479 * super.anInt7547 + super.anInt7545 * local451 + local297 * super.anInt7554 >> 14) + super.anInt7546;
					local371 = super.anInt7549 + (local297 * super.anInt7550 + local508 * super.anInt7552 + super.anInt7551 * local353 >> 14);
					local428 = super.anInt7555 + (local508 * super.anInt7556 + local353 * super.anInt7553 + super.anInt7544 * local297 >> 14);
					local496 = (local508 * super.anInt7545 + super.anInt7547 * local353 + local297 * super.anInt7554 >> 14) + super.anInt7546;
					local88 = (local411 * super.anInt7551 + local451 * super.anInt7552 + super.anInt7550 * local342 >> 14) + super.anInt7549;
					local87 = super.anInt7555 + (local342 * super.anInt7544 + super.anInt7553 * local411 + local451 * super.anInt7556 >> 14);
					local85 = super.anInt7546 + (super.anInt7547 * local411 + local451 * super.anInt7545 + super.anInt7554 * local342 >> 14);
					for (local83 = 0; local83 < local1586.aShort5; local83++) {
						local55 = local83 * 3;
						local57 = local55 + 1;
						local59 = local57 + 1;
						local61 = arg5[local55];
						local201 = arg5[local57];
						local75 = arg5[local59];
						local95 = arg6[local55];
						local278 = arg6[local57];
						local546 = arg6[local59];
						local780 = arg4[local59] + arg4[local57] + arg4[local55];
						if (-((local75 - local201) * (-local278 + local95)) + (local61 - local201) * (-local278 + local546) > 0) {
							arg3.aBoolean533 = local61 < 0 || local201 < 0 || local75 < 0 || arg3.anInt7459 < local61 || local201 > arg3.anInt7459 || arg3.anInt7459 < local75;
							@Pc(2332) short local2332 = local1586.aShortArray29[local83];
							if (local780 >= 765) {
								arg3.method6226(local95, local278, local546, local61, local201, local75, super.aClass122_Sub1_16.anInt8846);
							} else {
								if (local2332 != -1 && this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local2332).aByte87)) {
									arg3.anInt7460 = 100;
								}
								if (local780 > 0) {
									if (local2332 != -1) {
										arg3.method6237(local95, local278, local546, local61, local201, local75, super.aClass122_Sub1_16.anInt8846, arg4[local55], arg4[local57], arg4[local59], local1586.anIntArray160[local55], local1586.anIntArray160[local57], local1586.anIntArray160[local59], local400, local371, local88, local468, local428, local87, local325, local496, local85, local2332);
									} else if ((local1586.anIntArray160[local55] & 0xFFFFFF) != 0) {
										arg3.method6225(local95, local278, local546, local61, local201, local75, Static162.method2505(arg4[local55] << 24 | super.aClass122_Sub1_16.anInt8846, local1586.anIntArray160[local55]), Static162.method2505(arg4[local57] << 24 | super.aClass122_Sub1_16.anInt8846, local1586.anIntArray160[local57]), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | arg4[local59] << 24, local1586.anIntArray160[local59]));
									}
								} else if (local2332 != -1) {
									arg3.method6229(local95, local278, local546, local61, local201, local75, local1586.anIntArray160[local55], local1586.anIntArray160[local57], local1586.anIntArray160[local59], local400, local371, local88, local468, local428, local87, local325, local496, local85, local2332);
								} else if ((local1586.anIntArray160[local55] & 0xFFFFFF) != 0) {
									arg3.method6225(local95, local278, local546, local61, local201, local75, local1586.anIntArray160[local55], local1586.anIntArray160[local57], local1586.anIntArray160[local59]);
								}
								arg3.anInt7460 = 0;
							}
						}
					}
				}
			}
		} else if ((local24.aByte49 & 0x2) == 0) {
			@Pc(37) int local37 = arg0 * super.anInt8175;
			local43 = local37 + super.anInt8175;
			local48 = super.anInt8175 * arg1;
			local53 = local48 + super.anInt8175;
			local55 = 0;
			local57 = 0;
			local59 = 0;
			local61 = 0;
			if ((local24.aByte49 & 0x1) == 0 || arg2) {
				local75 = super.anIntArrayArray98[arg0][arg1];
				local95 = super.anIntArrayArray98[arg0 + 1][arg1];
				local278 = super.anIntArrayArray98[arg0 + 1][arg1 + 1];
				local546 = super.anIntArrayArray98[arg0][arg1 + 1];
				if (super.anInt7543 == -1) {
					local88 = super.anInt7546 + (super.anInt7547 * local75 + local37 * super.anInt7545 + super.anInt7554 * local48 >> 14);
					if (local88 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local87 = super.anInt7546 + (super.anInt7554 * local48 + local43 * super.anInt7545 + super.anInt7547 * local95 >> 14);
					if (local87 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local85 = (super.anInt7545 * local43 + local278 * super.anInt7547 + local53 * super.anInt7554 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local85) {
						return;
					}
					local83 = super.anInt7546 + (super.anInt7545 * local37 + super.anInt7547 * local546 + super.anInt7554 * local53 >> 14);
					if (local83 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
				} else {
					local83 = super.anInt7543;
					local85 = super.anInt7543;
					local87 = super.anInt7543;
					local88 = super.anInt7543;
				}
				if (arg2) {
					local201 = local88 - super.aClass122_Sub1_16.lb;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local55 = local201;
						local780 = local24.aShort53 * local201 / 255;
						if (local780 > 0) {
							local75 -= local780;
						}
					}
					local201 = local87 - super.aClass122_Sub1_16.lb;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local57 = local201;
						local780 = local24.aShort51 * local201 / 255;
						if (local780 > 0) {
							local95 -= local780;
						}
					}
					local201 = local85 - super.aClass122_Sub1_16.lb;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local59 = local201;
						local780 = local24.aShort55 * local201 / 255;
						if (local780 > 0) {
							local278 -= local780;
						}
					}
					local201 = local83 - super.aClass122_Sub1_16.lb;
					if (local201 > 255) {
						local201 = 255;
					}
					if (local201 > 0) {
						local61 = local201;
						local780 = local201 * local24.aShort54 / 255;
						if (local780 > 0) {
							local546 -= local780;
						}
					}
				} else if (super.aClass122_Sub1_16.aBoolean622) {
					local201 = local88 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local55 = local201;
						if (local201 > 255) {
							local55 = 255;
						}
					}
					local201 = local87 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local57 = local201;
						if (local201 > 255) {
							local57 = 255;
						}
					}
					local201 = local85 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local59 = local201;
						if (local201 > 255) {
							local59 = 255;
						}
					}
					local201 = local83 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local61 = local201;
						if (local201 > 255) {
							local61 = 255;
						}
					}
				}
				local297 = super.anInt7549 + (super.anInt7551 * local75 + super.anInt7552 * local37 + local48 * super.anInt7550 >> 14);
				local325 = (super.anInt7556 * local37 + super.anInt7553 * local75 + local48 * super.anInt7544 >> 14) + super.anInt7555;
				local308 = arg3.anInt7457 + local297 * super.aClass122_Sub1_16.anInt8837 / local88;
				local353 = super.aClass122_Sub1_16.anInt8855 * local325 / local88 + arg3.anInt7458;
				local342 = (super.anInt7552 * local43 + local95 * super.anInt7551 + super.anInt7550 * local48 >> 14) + super.anInt7549;
				local371 = super.anInt7555 + (super.anInt7544 * local48 + super.anInt7553 * local95 + local43 * super.anInt7556 >> 14);
				local383 = local342 * super.aClass122_Sub1_16.anInt8837 / local87 + arg3.anInt7457;
				local411 = arg3.anInt7458 + local371 * super.aClass122_Sub1_16.anInt8855 / local87;
				local400 = super.anInt7549 + (local53 * super.anInt7550 + super.anInt7551 * local278 + super.anInt7552 * local43 >> 14);
				local428 = (local278 * super.anInt7553 + local43 * super.anInt7556 + super.anInt7544 * local53 >> 14) + super.anInt7555;
				local439 = local400 * super.aClass122_Sub1_16.anInt8837 / local85 + arg3.anInt7457;
				local468 = (local546 * super.anInt7551 + local37 * super.anInt7552 + local53 * super.anInt7550 >> 14) + super.anInt7549;
				local451 = arg3.anInt7458 + super.aClass122_Sub1_16.anInt8855 * local428 / local85;
				local479 = local468 * super.aClass122_Sub1_16.anInt8837 / local83 + arg3.anInt7457;
				local496 = super.anInt7555 + (local37 * super.anInt7556 + super.anInt7553 * local546 + local53 * super.anInt7544 >> 14);
				local508 = super.aClass122_Sub1_16.anInt8855 * local496 / local83 + arg3.anInt7458;
			} else {
				local75 = super.anIntArrayArray98[arg0][arg1];
				if (super.anInt7543 == -1) {
					local95 = local75 * super.anInt7547;
					local88 = super.anInt7546 + (super.anInt7554 * local48 + super.anInt7545 * local37 + local95 >> 14);
					if (super.aClass122_Sub1_16.anInt8841 >= local88) {
						return;
					}
					local87 = (local43 * super.anInt7545 + local95 + super.anInt7554 * local48 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local87) {
						return;
					}
					local85 = (local53 * super.anInt7554 + local95 + local43 * super.anInt7545 >> 14) + super.anInt7546;
					if (local85 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local83 = (super.anInt7554 * local53 + super.anInt7545 * local37 + local95 >> 14) + super.anInt7546;
					if (local83 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
				} else {
					local83 = super.anInt7543;
					local85 = super.anInt7543;
					local87 = super.anInt7543;
					local88 = super.anInt7543;
				}
				if (super.aClass122_Sub1_16.aBoolean622) {
					local201 = local88 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local55 = local201;
						if (local201 > 255) {
							local55 = 255;
						}
					}
					local201 = local87 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local57 = local201;
						if (local201 > 255) {
							local57 = 255;
						}
					}
					local201 = local85 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local59 = local201;
						if (local201 > 255) {
							local59 = 255;
						}
					}
					local201 = local83 - super.aClass122_Sub1_16.lb;
					if (local201 > 0) {
						local61 = local201;
						if (local201 > 255) {
							local61 = 255;
						}
					}
				}
				local95 = super.anInt7551 * local75;
				local278 = local75 * super.anInt7553;
				local297 = super.anInt7549 + (super.anInt7552 * local37 + local95 + local48 * super.anInt7550 >> 14);
				local308 = arg3.anInt7457 + local297 * super.aClass122_Sub1_16.anInt8837 / local88;
				local325 = super.anInt7555 + (local48 * super.anInt7544 + local278 + local37 * super.anInt7556 >> 14);
				local342 = (super.anInt7550 * local48 + local95 + local43 * super.anInt7552 >> 14) + super.anInt7549;
				local353 = super.aClass122_Sub1_16.anInt8855 * local325 / local88 + arg3.anInt7458;
				local371 = (super.anInt7556 * local43 + local278 + local48 * super.anInt7544 >> 14) + super.anInt7555;
				local383 = arg3.anInt7457 + local342 * super.aClass122_Sub1_16.anInt8837 / local87;
				local400 = (local53 * super.anInt7550 + local95 + local43 * super.anInt7552 >> 14) + super.anInt7549;
				local411 = arg3.anInt7458 + local371 * super.aClass122_Sub1_16.anInt8855 / local87;
				local428 = (local53 * super.anInt7544 + local43 * super.anInt7556 + local278 >> 14) + super.anInt7555;
				local439 = local400 * super.aClass122_Sub1_16.anInt8837 / local85 + arg3.anInt7457;
				local451 = arg3.anInt7458 + super.aClass122_Sub1_16.anInt8855 * local428 / local85;
				local468 = super.anInt7549 + (super.anInt7550 * local53 + local95 + super.anInt7552 * local37 >> 14);
				local479 = super.aClass122_Sub1_16.anInt8837 * local468 / local83 + arg3.anInt7457;
				local496 = (local53 * super.anInt7544 + local278 + super.anInt7556 * local37 >> 14) + super.anInt7555;
				local508 = arg3.anInt7458 + local496 * super.aClass122_Sub1_16.anInt8855 / local83;
			}
			@Pc(1150) boolean local1150 = local24.aShort52 != -1 && this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local24.aShort52).aByte87);
			local95 = local61 + local57 + local59;
			if (-((local383 - local479) * (local451 + -local508)) + (local411 - local508) * (-local479 + local439) > 0) {
				arg3.aBoolean533 = local439 < 0 || local479 < 0 || local383 < 0 || local439 > arg3.anInt7459 || arg3.anInt7459 < local479 || arg3.anInt7459 < local383;
				if (local95 < 765) {
					if (local1150) {
						arg3.anInt7460 = 100;
					}
					if (local95 > 0) {
						if (local24.aShort52 < 0) {
							arg3.method6225(local451, local508, local411, local439, local479, local383, Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local59 << 24, local24.anInt3188), Static162.method2505(local61 << 24 | super.aClass122_Sub1_16.anInt8846, local24.anInt3186), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local57 << 24, local24.anInt3185));
						} else {
							arg3.method6237(local451, local508, local411, local439, local479, local383, super.aClass122_Sub1_16.anInt8846, local59, local61, local57, local24.anInt3188, local24.anInt3186, local24.anInt3185, local400, local468, local342, local428, local496, local371, local85, local83, local87, local24.aShort52);
						}
					} else if (local24.aShort52 >= 0) {
						arg3.method6229(local451, local508, local411, local439, local479, local383, local24.anInt3188, local24.anInt3186, local24.anInt3185, local400, local468, local342, local428, local496, local371, local85, local83, local87, local24.aShort52);
					} else {
						arg3.method6225(local451, local508, local411, local439, local479, local383, local24.anInt3188, local24.anInt3186, local24.anInt3185);
					}
					arg3.anInt7460 = 0;
				} else {
					arg3.method6226(local451, local508, local411, local439, local479, local383, super.aClass122_Sub1_16.anInt8846);
				}
			}
			local95 = local55 + local57 + local61;
			if (-((local479 - local383) * (-local411 + local353)) + (local308 - local383) * (local508 + -local411) > 0) {
				arg3.aBoolean533 = local308 < 0 || local383 < 0 || local479 < 0 || arg3.anInt7459 < local308 || local383 > arg3.anInt7459 || local479 > arg3.anInt7459;
				if (local95 < 765) {
					if (local1150) {
						arg3.anInt7460 = 100;
					}
					if (local95 <= 0) {
						if (local24.aShort52 >= 0) {
							arg3.method6229(local353, local411, local508, local308, local383, local479, local24.anInt3187, local24.anInt3185, local24.anInt3186, local297, local342, local468, local325, local371, local496, local88, local87, local83, local24.aShort52);
						} else {
							arg3.method6225(local353, local411, local508, local308, local383, local479, local24.anInt3187, local24.anInt3185, local24.anInt3186);
						}
					} else if (local24.aShort52 >= 0) {
						arg3.method6237(local353, local411, local508, local308, local383, local479, super.aClass122_Sub1_16.anInt8846, local55, local57, local61, local24.anInt3187, local24.anInt3185, local24.anInt3186, local297, local342, local468, local325, local371, local496, local88, local87, local83, local24.aShort52);
					} else {
						arg3.method6225(local353, local411, local508, local308, local383, local479, Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local55 << 24, local24.anInt3187), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local57 << 24, local24.anInt3185), Static162.method2505(super.aClass122_Sub1_16.anInt8846 | local61 << 24, local24.anInt3186));
					}
					arg3.anInt7460 = 0;
					return;
				}
				arg3.method6226(local353, local411, local508, local308, local383, local479, super.aClass122_Sub1_16.anInt8846);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6751(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class16_Sub2 local9 = (Class16_Sub2) super.aClass122_Sub1_16.method7289(Thread.currentThread());
		@Pc(12) Class261 local12 = local9.aClass261_2;
		local12.anInt7460 = 0;
		local12.aBoolean533 = false;
		if (super.aClass121ArrayArray3 != null) {
			this.method6308(local12, arg1, local9.anIntArray805, arg4, arg0, arg2, arg3, local9.anIntArray818);
		} else if (super.aClass112ArrayArray3 != null) {
			this.method6307(arg1, arg3, local9.anIntArray818, local9.anIntArray805, arg0, arg4, arg2, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([II[IILclient!rt;[II)V")
	private void method6312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class261 arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(12) Class112 local12 = super.aClass112ArrayArray3[arg5][arg1];
		@Pc(33) int local33;
		@Pc(43) int local43;
		@Pc(238) int local238;
		@Pc(321) int local321;
		@Pc(385) int local385;
		@Pc(448) int local448;
		@Pc(459) int local459;
		@Pc(227) int local227;
		@Pc(278) int local278;
		@Pc(342) int local342;
		@Pc(416) int local416;
		@Pc(258) int local258;
		@Pc(310) int local310;
		@Pc(373) int local373;
		@Pc(437) int local437;
		@Pc(109) int local109;
		@Pc(139) int local139;
		@Pc(165) int local165;
		@Pc(191) int local191;
		@Pc(84) int local84;
		@Pc(289) int local289;
		@Pc(353) int local353;
		@Pc(396) int local396;
		if (local12 == null) {
			@Pc(1112) Class298 local1112 = super.aClass298ArrayArray3[arg5][arg1];
			if (local1112 != null) {
				@Pc(1139) short local1139;
				if (super.anInt7543 == -1) {
					for (local448 = 0; local448 < local1112.aShort133; local448++) {
						local33 = local1112.aShortArray149[local448] + (arg5 << super.anInt8176);
						local1139 = local1112.aShortArray146[local448];
						local43 = local1112.aShortArray151[local448] + (arg1 << super.anInt8176);
						local385 = (local1139 * super.anInt7547 + super.anInt7545 * local33 + super.anInt7554 * local43 >> 14) + super.anInt7546;
						if (super.aClass122_Sub1_16.anInt8841 >= local385) {
							return;
						}
						local321 = (super.anInt7553 * local1139 + local33 * super.anInt7556 + local43 * super.anInt7544 >> 14) + super.anInt7555;
						local238 = super.anInt7549 + (super.anInt7551 * local1139 + super.anInt7552 * local33 + local43 * super.anInt7550 >> 14);
						arg0[local448] = arg3.anInt7457 + super.aClass122_Sub1_16.anInt8837 * local238 / local385;
						arg2[local448] = arg3.anInt7458 + local321 * super.aClass122_Sub1_16.anInt8855 / local385;
					}
				} else {
					for (local448 = 0; local448 < local1112.aShort133; local448++) {
						local33 = local1112.aShortArray149[local448] + (arg5 << super.anInt8176);
						local1139 = local1112.aShortArray146[local448];
						local43 = local1112.aShortArray151[local448] + (arg1 << super.anInt8176);
						local238 = super.anInt7549 + (local43 * super.anInt7550 + super.anInt7552 * local33 + local1139 * super.anInt7551 >> 14);
						local321 = (super.anInt7553 * local1139 + super.anInt7556 * local33 + super.anInt7544 * local43 >> 14) + super.anInt7555;
						arg0[local448] = arg3.anInt7457 + super.aClass122_Sub1_16.anInt8837 * local238 / super.anInt7543;
						arg2[local448] = arg3.anInt7458 + local321 * super.aClass122_Sub1_16.anInt8855 / super.anInt7543;
					}
				}
				if (local1112.aShortArray150 == null) {
					for (local448 = 0; local448 < local1112.aShort132; local448++) {
						@Pc(1804) short local1804 = local1112.aShortArray152[local448];
						@Pc(1809) short local1809 = local1112.aShortArray153[local448];
						@Pc(1814) short local1814 = local1112.aShortArray147[local448];
						local459 = arg0[local1804];
						local227 = arg0[local1809];
						local278 = arg0[local1814];
						local342 = arg2[local1804];
						local416 = arg2[local1809];
						local258 = arg2[local1814];
						if (-((local342 - local416) * (local278 + -local227)) + (local459 - local227) * (-local416 + local258) > 0) {
							local310 = local1112.anIntArray774[local448];
							if (local310 != -1) {
								arg3.aBoolean533 = local459 < 0 || local227 < 0 || local278 < 0 || arg3.anInt7459 < local459 || local227 > arg3.anInt7459 || local278 > arg3.anInt7459;
								arg3.method6232(local342, local416, local258, local459, local227, local278, Static244.method4186(local310, local1112.aShortArray148[local1804]), Static244.method4186(local310, local1112.aShortArray148[local1809]), Static244.method4186(local310, local1112.aShortArray148[local1814]));
							}
						}
					}
				} else {
					local448 = super.anIntArrayArray98[arg5][arg1];
					local289 = super.anIntArrayArray98[arg5 + 1][arg1];
					local353 = super.anIntArrayArray98[arg5][arg1 + 1];
					local396 = arg5 * super.anInt8175;
					local459 = super.anInt8175 + local396;
					local227 = super.anInt8175 * arg1;
					local278 = super.anInt8175 + local227;
					local342 = super.anInt7549 + (local227 * super.anInt7550 + local448 * super.anInt7551 + local396 * super.anInt7552 >> 14);
					local416 = (super.anInt7556 * local396 + local448 * super.anInt7553 + local227 * super.anInt7544 >> 14) + super.anInt7555;
					local258 = (super.anInt7545 * local396 + super.anInt7547 * local448 + local227 * super.anInt7554 >> 14) + super.anInt7546;
					local310 = super.anInt7549 + (super.anInt7552 * local459 + local289 * super.anInt7551 + super.anInt7550 * local227 >> 14);
					local373 = (super.anInt7556 * local459 + super.anInt7553 * local289 + super.anInt7544 * local227 >> 14) + super.anInt7555;
					local437 = super.anInt7546 + (super.anInt7545 * local459 + super.anInt7547 * local289 + local227 * super.anInt7554 >> 14);
					local109 = (local353 * super.anInt7551 + super.anInt7552 * local396 + local278 * super.anInt7550 >> 14) + super.anInt7549;
					local139 = super.anInt7555 + (local396 * super.anInt7556 + super.anInt7553 * local353 + super.anInt7544 * local278 >> 14);
					local165 = (super.anInt7554 * local278 + local396 * super.anInt7545 + local353 * super.anInt7547 >> 14) + super.anInt7546;
					for (local191 = 0; local191 < local1112.aShort132; local191++) {
						@Pc(1611) short local1611 = local1112.aShortArray152[local191];
						@Pc(1616) short local1616 = local1112.aShortArray153[local191];
						@Pc(1621) short local1621 = local1112.aShortArray147[local191];
						local84 = arg0[local1611];
						@Pc(1629) int local1629 = arg0[local1616];
						@Pc(1633) int local1633 = arg0[local1621];
						@Pc(1637) int local1637 = arg2[local1611];
						@Pc(1641) int local1641 = arg2[local1616];
						@Pc(1645) int local1645 = arg2[local1621];
						if ((local1645 - local1641) * (local84 + -local1629) - (local1633 - local1629) * (-local1641 + local1637) > 0) {
							arg3.aBoolean533 = local84 < 0 || local1629 < 0 || local1633 < 0 || arg3.anInt7459 < local84 || local1629 > arg3.anInt7459 || local1633 > arg3.anInt7459;
							@Pc(1700) short local1700 = local1112.aShortArray150[local191];
							if (local1700 == -1) {
								@Pc(1709) int local1709 = local1112.anIntArray774[local191];
								if (local1709 != -1) {
									arg3.method6232(local1637, local1641, local1645, local84, local1629, local1633, Static244.method4186(local1709, local1112.aShortArray148[local1611]), Static244.method4186(local1709, local1112.aShortArray148[local1616]), Static244.method4186(local1709, local1112.aShortArray148[local1621]));
								}
							} else {
								if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local1700).aByte87)) {
									arg3.anInt7460 = 100;
								}
								arg3.method6229(local1637, local1641, local1645, local84, local1629, local1633, local1112.aShortArray148[local1611], local1112.aShortArray148[local1616], local1112.aShortArray148[local1621], local342, local310, local109, local416, local373, local139, local258, local437, local165, local1700);
								arg3.anInt7460 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte47 & 0x2) == 0) {
			@Pc(28) int local28 = super.anInt8175 * arg5;
			local33 = super.anInt8175 + local28;
			@Pc(38) int local38 = super.anInt8175 * arg1;
			local43 = super.anInt8175 + local38;
			@Pc(55) int local55;
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local12.aByte47 & 0x1) == 0) {
				local55 = super.anIntArrayArray98[arg5][arg1];
				local64 = super.anIntArrayArray98[arg5 + 1][arg1];
				local75 = super.anIntArrayArray98[arg5 + 1][arg1 + 1];
				local84 = super.anIntArrayArray98[arg5][arg1 + 1];
				if (super.anInt7543 == -1) {
					local109 = (local38 * super.anInt7554 + super.anInt7545 * local28 + super.anInt7547 * local55 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local109) {
						return;
					}
					local139 = super.anInt7546 + (super.anInt7554 * local38 + super.anInt7545 * local33 + local64 * super.anInt7547 >> 14);
					if (local139 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local165 = super.anInt7546 + (super.anInt7554 * local43 + local75 * super.anInt7547 + local33 * super.anInt7545 >> 14);
					if (super.aClass122_Sub1_16.anInt8841 >= local165) {
						return;
					}
					local191 = (local43 * super.anInt7554 + super.anInt7545 * local28 + super.anInt7547 * local84 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local191) {
						return;
					}
				} else {
					local191 = super.anInt7543;
					local165 = super.anInt7543;
					local139 = super.anInt7543;
					local109 = super.anInt7543;
				}
				local227 = super.anInt7549 + (local38 * super.anInt7550 + super.anInt7551 * local55 + super.anInt7552 * local28 >> 14);
				local238 = local227 * super.aClass122_Sub1_16.anInt8837 / local109 + arg3.anInt7457;
				local258 = (local55 * super.anInt7553 + super.anInt7556 * local28 + super.anInt7544 * local38 >> 14) + super.anInt7555;
				local278 = (super.anInt7550 * local38 + super.anInt7551 * local64 + local33 * super.anInt7552 >> 14) + super.anInt7549;
				local289 = local258 * super.aClass122_Sub1_16.anInt8855 / local109 + arg3.anInt7458;
				local310 = super.anInt7555 + (super.anInt7544 * local38 + local64 * super.anInt7553 + super.anInt7556 * local33 >> 14);
				local321 = super.aClass122_Sub1_16.anInt8837 * local278 / local139 + arg3.anInt7457;
				local342 = (local43 * super.anInt7550 + super.anInt7552 * local33 + local75 * super.anInt7551 >> 14) + super.anInt7549;
				local353 = local310 * super.aClass122_Sub1_16.anInt8855 / local139 + arg3.anInt7458;
				local373 = (super.anInt7544 * local43 + local75 * super.anInt7553 + super.anInt7556 * local33 >> 14) + super.anInt7555;
				local385 = arg3.anInt7457 + super.aClass122_Sub1_16.anInt8837 * local342 / local165;
				local396 = local373 * super.aClass122_Sub1_16.anInt8855 / local165 + arg3.anInt7458;
				local416 = (local43 * super.anInt7550 + super.anInt7552 * local28 + local84 * super.anInt7551 >> 14) + super.anInt7549;
				local437 = (super.anInt7544 * local43 + super.anInt7556 * local28 + local84 * super.anInt7553 >> 14) + super.anInt7555;
				local448 = arg3.anInt7457 + local416 * super.aClass122_Sub1_16.anInt8837 / local191;
				local459 = arg3.anInt7458 + super.aClass122_Sub1_16.anInt8855 * local437 / local191;
			} else {
				local55 = super.anIntArrayArray98[arg5][arg1];
				if (super.anInt7543 == -1) {
					local64 = local55 * super.anInt7547;
					local109 = super.anInt7546 + (local64 + super.anInt7545 * local28 + local38 * super.anInt7554 >> 14);
					if (local109 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
					local139 = (local38 * super.anInt7554 + local64 + super.anInt7545 * local33 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local139) {
						return;
					}
					local165 = (super.anInt7545 * local33 + local64 + super.anInt7554 * local43 >> 14) + super.anInt7546;
					if (super.aClass122_Sub1_16.anInt8841 >= local165) {
						return;
					}
					local191 = super.anInt7546 + (super.anInt7545 * local28 + local64 + local43 * super.anInt7554 >> 14);
					if (local191 <= super.aClass122_Sub1_16.anInt8841) {
						return;
					}
				} else {
					local191 = super.anInt7543;
					local165 = super.anInt7543;
					local139 = super.anInt7543;
					local109 = super.anInt7543;
				}
				local64 = local55 * super.anInt7551;
				local75 = local55 * super.anInt7553;
				local227 = (local28 * super.anInt7552 + local64 + super.anInt7550 * local38 >> 14) + super.anInt7549;
				local258 = super.anInt7555 + (local75 + super.anInt7556 * local28 + local38 * super.anInt7544 >> 14);
				local238 = arg3.anInt7457 + super.aClass122_Sub1_16.anInt8837 * local227 / local109;
				local289 = arg3.anInt7458 + local258 * super.aClass122_Sub1_16.anInt8855 / local109;
				local278 = super.anInt7549 + (super.anInt7550 * local38 + local33 * super.anInt7552 + local64 >> 14);
				local310 = super.anInt7555 + (local38 * super.anInt7544 + local75 + super.anInt7556 * local33 >> 14);
				local321 = arg3.anInt7457 + local278 * super.aClass122_Sub1_16.anInt8837 / local139;
				local342 = (super.anInt7550 * local43 + local64 + super.anInt7552 * local33 >> 14) + super.anInt7549;
				local353 = arg3.anInt7458 + local310 * super.aClass122_Sub1_16.anInt8855 / local139;
				local373 = super.anInt7555 + (local33 * super.anInt7556 + local75 + super.anInt7544 * local43 >> 14);
				local385 = local342 * super.aClass122_Sub1_16.anInt8837 / local165 + arg3.anInt7457;
				local396 = super.aClass122_Sub1_16.anInt8855 * local373 / local165 + arg3.anInt7458;
				local416 = super.anInt7549 + (super.anInt7552 * local28 + local64 + local43 * super.anInt7550 >> 14);
				local437 = super.anInt7555 + (super.anInt7556 * local28 + local75 + local43 * super.anInt7544 >> 14);
				local448 = arg3.anInt7457 + local416 * super.aClass122_Sub1_16.anInt8837 / local191;
				local459 = arg3.anInt7458 + local437 * super.aClass122_Sub1_16.anInt8855 / local191;
			}
			if (-((local321 - local448) * (-local459 + local396)) + (local353 - local459) * (local385 - local448) > 0) {
				arg3.aBoolean533 = local385 < 0 || local448 < 0 || local321 < 0 || local385 > arg3.anInt7459 || local448 > arg3.anInt7459 || local321 > arg3.anInt7459;
				if (local12.aShort46 >= 0) {
					if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local12.aShort46).aByte87)) {
						arg3.anInt7460 = 100;
					}
					arg3.method6229(local396, local459, local353, local385, local448, local321, local12.aShort50 & 0xFFFF, local12.aShort48 & 0xFFFF, local12.aShort49 & 0xFFFF, local227, local278, local416, local258, local310, local437, local109, local139, local191, local12.aShort46);
					arg3.anInt7460 = 0;
				} else {
					arg3.method6232(local396, local459, local353, local385, local448, local321, local12.aShort50 & 0xFFFF, local12.aShort48 & 0xFFFF, local12.aShort49 & 0xFFFF);
				}
			}
			if (-((local448 - local321) * (local289 + -local353)) + (local459 - local353) * (local238 - local321) > 0) {
				arg3.aBoolean533 = local238 < 0 || local321 < 0 || local448 < 0 || arg3.anInt7459 < local238 || arg3.anInt7459 < local321 || local448 > arg3.anInt7459;
				if (local12.aShort46 >= 0) {
					if (this.method6306(super.aClass122_Sub1_16.anInterface8_14.method878(local12.aShort46).aByte87)) {
						arg3.anInt7460 = 100;
					}
					arg3.method6229(local289, local353, local459, local238, local321, local448, local12.aShort47 & 0xFFFF, local12.aShort49 & 0xFFFF, local12.aShort48 & 0xFFFF, local227, local278, local416, local258, local310, local437, local109, local139, local191, local12.aShort46);
					arg3.anInt7460 = 0;
					return;
				}
				arg3.method6232(local289, local353, local459, local238, local321, local448, local12.aShort47 & 0xFFFF, local12.aShort49 & 0xFFFF, local12.aShort48 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	@Override
	public void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class16_Sub2 local9 = (Class16_Sub2) super.aClass122_Sub1_16.method7289(Thread.currentThread());
		local9.aClass261_2.anInt7460 = 0;
		if (super.aClass121ArrayArray3 != null) {
			this.method6309(arg0, arg1, super.aClass122_Sub1_16.aBoolean620, local9.aClass261_2, local9.anIntArray811, local9.anIntArray805, local9.anIntArray818);
		} else if (super.aClass112ArrayArray3 != null) {
			this.method6312(local9.anIntArray805, arg1, local9.anIntArray818, local9.aClass261_2, local9.anIntArray811, arg0);
			return;
		}
	}
}
