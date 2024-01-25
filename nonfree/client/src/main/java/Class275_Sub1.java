import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class275_Sub1 extends Class275 {

	@OriginalMember(owner = "client!tp", name = "T", descriptor = "I")
	public int anInt9089 = 99;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IIIZ)V")
	public Class275_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static18.aClass96_1, Static244.aClass242_7);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[Lclient!nt;Lclient!ha;I[BI)V")
	public void method7622(@OriginalArg(1) Class240[] arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub22 local10 = new Class2_Sub22(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(23) int local23 = local10.method8533();
			if (local23 == 0) {
				return;
			}
			local17 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method8543();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local10.method8547();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg2 + local53;
				@Pc(77) int local77 = arg4 + local47;
				if (local73 > 0 && local77 > 0 && super.anInt9069 - 1 > local73 && local77 < super.anInt9067 - 1) {
					@Pc(105) Class240 local105 = null;
					if (!super.aBoolean674) {
						@Pc(110) int local110 = local57;
						if ((Static27.aByteArrayArrayArray1[1][local73][local77] & 0x2) == 2) {
							local110 = local57 - 1;
						}
						if (local110 >= 0) {
							local105 = arg0[local110];
						}
					}
					this.method7627(local105, -1, arg1, local69, local57, local17, local77, local65, local57, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([IIIIILclient!vj;IIILclient!ha;I)V")
	public void method7623(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub22 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class95 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean674) {
			return;
		}
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(29) Class350 local29 = null;
		@Pc(35) int local35 = (arg6 & 0x7) * 8;
		@Pc(41) int local41 = (arg5 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(46) int local46;
						@Pc(125) int local125;
						@Pc(433) int local433;
						@Pc(148) int local148;
						while (arg4.aByteArray115.length > arg4.anInt10247) {
							local46 = arg4.method8547();
							if (local46 == 0) {
								local29 = new Class350(arg4);
							} else {
								@Pc(154) int local154;
								@Pc(212) int local212;
								@Pc(302) int local302;
								@Pc(339) int local339;
								if (local46 == 1) {
									local125 = arg4.method8547();
									if (local125 > 0) {
										for (local433 = 0; local433 < local125; local433++) {
											@Pc(442) Class367 local442 = new Class367(arg8, arg4, 2);
											if (local442.anInt9854 == 31) {
												@Pc(453) Class282 local453 = Static516.aClass43_3.method887(arg4.method8546());
												local442.method8219(local453.anInt7389, local453.anInt7390, local453.anInt7392, local453.anInt7393);
											}
											if (arg8.method6994() > 0) {
												@Pc(473) Class2_Sub24 local473 = local442.aClass2_Sub24_3;
												local154 = local473.method6299() >> 9;
												local212 = local473.method6301() >> 9;
												if (local442.anInt9858 == arg1 && local154 >= local35 && local35 + 8 > local154 && local212 >= local41 && local41 + 8 > local212) {
													local302 = (arg3 << 9) + Static570.method7806(arg7, local473.method6301() & 0xFFF, local473.method6299() & 0xFFF);
													local154 = local302 >> 9;
													local339 = Static43.method702(arg7, local473.method6299() & 0xFFF, local473.method6301() & 0xFFF) + (arg2 << 9);
													local212 = local339 >> 9;
													if (local154 >= 0 && local212 >= 0 && super.anInt9069 > local154 && local212 < super.anInt9067) {
														local473.method6309(super.anIntArrayArrayArray20[arg1][local154][local212] - local473.method6308(), local339, local302);
														Static475.method6409(local442);
													}
												}
											}
										}
									}
								} else if (local46 == 2) {
									if (local29 == null) {
										local29 = new Class350();
									}
									local29.method7892(arg4);
								} else if (local46 != 128) {
									if (local46 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray17 == null) {
										super.aByteArrayArrayArray17 = new byte[4][][];
									}
									for (local125 = 0; local125 < 4; local125++) {
										@Pc(133) byte local133 = arg4.method8548();
										@Pc(152) int local152;
										if (local133 == 0 && super.aByteArrayArrayArray17[arg9] != null) {
											if (local125 <= arg1) {
												local148 = arg3;
												local152 = arg3 + 7;
												local154 = arg2;
												if (arg3 < 0) {
													local148 = 0;
												} else if (super.anInt9069 <= arg3) {
													local148 = super.anInt9069;
												}
												if (local152 < 0) {
													local152 = 0;
												} else if (super.anInt9069 <= local152) {
													local152 = super.anInt9069;
												}
												if (arg2 < 0) {
													local154 = 0;
												} else if (arg2 >= super.anInt9067) {
													local154 = super.anInt9067;
												}
												local212 = arg2 + 7;
												if (local212 < 0) {
													local212 = 0;
												} else if (super.anInt9067 <= local212) {
													local212 = super.anInt9067;
												}
												while (local148 < local152) {
													while (local212 > local154) {
														super.aByteArrayArrayArray17[arg9][local148][local154] = 0;
														local154++;
													}
													local148++;
												}
											}
										} else if (local133 == 1) {
											if (super.aByteArrayArrayArray17[arg9] == null) {
												super.aByteArrayArrayArray17[arg9] = new byte[super.anInt9069 + 1][super.anInt9067 + 1];
											}
											for (local148 = 0; local148 < 64; local148 += 4) {
												for (local152 = 0; local152 < 64; local152 += 4) {
													@Pc(289) byte local289 = arg4.method8548();
													if (local125 <= arg1) {
														for (local212 = local148; local212 < local148 + 4; local212++) {
															for (local302 = local152; local302 < local152 + 4; local302++) {
																if (local212 >= local35 && local35 + 8 > local212 && local302 >= local41 && local41 + 8 > local41) {
																	local339 = arg3 + Static15.method229(local212 & 0x7, local302 & 0x7, arg7);
																	@Pc(353) int local353 = Static454.method6225(local302 & 0x7, arg7, local212 & 0x7) + arg2;
																	if (local339 >= 0 && local339 < super.anInt9069 && local353 >= 0 && local353 < super.anInt9067) {
																		super.aByteArrayArrayArray17[arg9][local339][local353] = local289;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg0 == null) {
									arg4.anInt10247 += 10;
								} else {
									arg0[0] = arg4.method8546();
									arg0[1] = arg4.method8526();
									arg0[2] = arg4.method8526();
									arg0[3] = arg4.method8526();
									arg0[4] = arg4.method8546();
								}
							}
						}
						if (local29 != null) {
							Static58.method902(arg2 >> 3, local29, arg3 >> 3);
						}
						if (super.aByteArrayArrayArray17 != null && super.aByteArrayArrayArray17[arg9] != null) {
							local46 = arg3 + 7;
							local125 = arg2 + 7;
							for (local433 = arg3; local433 < local46; local433++) {
								for (local148 = arg2; local148 < local125; local148++) {
									super.aByteArrayArrayArray17[arg9][local433][local148] = 0;
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II[Lclient!nt;IILclient!ha;IZ[BII)V")
	public void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class95 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Class2_Sub22 local14 = new Class2_Sub22(arg7);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method8533();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method8543();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method8547();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (local57 == arg0 && arg4 <= local53 && local53 < arg4 + 8 && local47 >= arg1 && local47 < arg1 + 8) {
					@Pc(101) Class191 local101 = Static319.aClass141_4.method2971(local16);
					@Pc(118) int local118 = Static251.method3439(local101.anInt4814, local47 & 0x7, local101.anInt4817, local53 & 0x7, local69, arg8) + arg6;
					@Pc(135) int local135 = arg3 + Static606.method8164(arg8, local101.anInt4817, local47 & 0x7, local101.anInt4814, local69, local53 & 0x7);
					if (local118 > 0 && local135 > 0 && super.anInt9069 - 1 > local118 && super.anInt9067 - 1 > local135) {
						@Pc(164) Class240 local164 = null;
						if (!super.aBoolean674) {
							@Pc(169) int local169 = arg9;
							if ((Static27.aByteArrayArrayArray1[1][local118][local135] & 0x2) == 2) {
								local169 = arg9 - 1;
							}
							if (local169 >= 0) {
								local164 = arg2[local169];
							}
						}
						this.method7627(local164, -1, arg5, local69 + arg8 & 0x3, arg9, local16, local135, local65, arg9, local118);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!nt;ILclient!ha;IBIIIIII)V")
	public void method7627(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 0 && !Static76.method1081(arg8, arg9, arg6, Static130.anInt2239)) {
			return;
		}
		if (this.anInt9089 > arg4) {
			this.anInt9089 = arg4;
		}
		@Pc(30) Class191 local30 = Static319.aClass141_4.method2971(arg5);
		if (Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8110() == 0 && local30.aBoolean339) {
			return;
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		if (arg3 == 1 || arg3 == 3) {
			local50 = local30.anInt4817;
			local53 = local30.anInt4814;
		} else {
			local53 = local30.anInt4817;
			local50 = local30.anInt4814;
		}
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (super.anInt9069 >= arg9 + local50) {
			local79 = arg9 + (local50 >> 1);
			local87 = arg9 + (local50 + 1 >> 1);
		} else {
			local79 = arg9;
			local87 = arg9 + 1;
		}
		@Pc(116) int local116;
		@Pc(110) int local110;
		if (arg6 + local53 <= super.anInt9067) {
			local110 = (local53 + 1 >> 1) + arg6;
			local116 = (local53 >> 1) + arg6;
		} else {
			local116 = arg6;
			local110 = arg6 + 1;
		}
		@Pc(128) Class76 local128 = Static314.aClass76Array2[arg8];
		@Pc(156) int local156 = local128.method7396(local116, local79) + local128.method7396(local116, local87) + local128.method7396(local110, local79) + local128.method7396(local110, local87) >> 2;
		@Pc(164) int local164 = (local50 << 8) + (arg9 << 9);
		@Pc(172) int local172 = (local53 << 8) + (arg6 << 9);
		@Pc(184) boolean local184 = Static85.aBoolean498 && !super.aBoolean674 && local30.aBoolean338;
		if (local30.method4053()) {
			Static222.method3036(arg6, local30, arg4, null, arg9, arg3, null);
		}
		@Pc(219) boolean local219 = arg1 == -1 && local30.anInt4781 == -1 && local30.anIntArray325 == null && local30.anIntArray323 == null && !local30.aBoolean336;
		if (Static136.aBoolean732 && (Static384.method5150(arg7) && local30.anInt4801 != 1 || !(!Static12.method183(arg7) || local30.anInt4801 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(366) Class13_Sub1_Sub1 local366;
			@Pc(335) Class13_Sub1_Sub1_Sub5 local335;
			@Pc(368) int local368;
			@Pc(435) int local435;
			if (arg7 == 10 || arg7 == 11) {
				local335 = null;
				if (local219) {
					@Pc(399) Class13_Sub1_Sub1_Sub5 local399 = new Class13_Sub1_Sub1_Sub5(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, arg9 + local50 - 1, arg6, local53 + arg6 - 1, arg7, arg3, local184);
					local368 = local399.method7699();
					local335 = local399;
					local366 = local399;
				} else {
					local366 = new Class13_Sub1_Sub1_Sub4(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, local50 + arg9 - 1, arg6, arg6 + local53 - 1, arg7, arg3, arg1);
					local368 = 15;
				}
				if (Static545.method7521(local366, false)) {
					if (local335 != null && local335.method8426()) {
						local335.method8423(arg2);
					}
					if (local30.aBoolean335 && Static85.aBoolean498) {
						if (local368 > 30) {
							local368 = 30;
						}
						for (local435 = 0; local435 <= local50; local435++) {
							for (@Pc(439) int local439 = 0; local439 <= local53; local439++) {
								local128.ka(arg9 + local435, local439 + arg6, local368);
							}
						}
					}
				}
				if (local30.anInt4830 != 0 && arg0 != null) {
					arg0.method5176(local50, !local30.aBoolean345, arg9, local30.aBoolean341, local53, arg6);
				}
			} else if ((arg7 < 12 || arg7 > 17) && (arg7 < 18 || arg7 > 21)) {
				@Pc(672) Class13_Sub1_Sub4 local672;
				if (arg7 == 0) {
					@Pc(645) int local645 = local30.anInt4801;
					if (Static543.aBoolean668 && local30.anInt4801 == -1) {
						local645 = 1;
					}
					if (local219) {
						@Pc(690) Class13_Sub1_Sub4_Sub2 local690 = new Class13_Sub1_Sub4_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, local184);
						local672 = local690;
						if (local690.method8426()) {
							local690.method8423(arg2);
						}
					} else {
						local672 = new Class13_Sub1_Sub4_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, arg1);
					}
					Static330.method5562(arg4, arg9, arg6, local672, null);
					if (arg3 == 0) {
						if (Static85.aBoolean498 && local30.aBoolean335) {
							local128.ka(arg9, arg6, 50);
							local128.ka(arg9, arg6 + 1, 50);
						}
						if (local645 == 1 && !super.aBoolean674) {
							Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 1);
						}
					} else if (arg3 == 1) {
						if (Static85.aBoolean498 && local30.aBoolean335) {
							local128.ka(arg9, arg6 + 1, 50);
							local128.ka(arg9 + 1, arg6 + 1, 50);
						}
						if (local645 == 1 && !super.aBoolean674) {
							Static535.method7390(arg6 + 1, local30.anInt4789, arg9, arg4, -local30.anInt4827, 2);
						}
					} else if (arg3 == 2) {
						if (Static85.aBoolean498 && local30.aBoolean335) {
							local128.ka(arg9 + 1, arg6, 50);
							local128.ka(arg9 + 1, arg6 + 1, 50);
						}
						if (local645 == 1 && !super.aBoolean674) {
							Static535.method7390(arg6, local30.anInt4789, arg9 + 1, arg4, -local30.anInt4827, 1);
						}
					} else if (arg3 == 3) {
						if (Static85.aBoolean498 && local30.aBoolean335) {
							local128.ka(arg9, arg6, 50);
							local128.ka(arg9 + 1, arg6, 50);
						}
						if (local645 == 1 && !super.aBoolean674) {
							Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 2);
						}
					}
					if (local30.anInt4830 != 0 && arg0 != null) {
						arg0.method5180(arg7, arg6, arg9, local30.aBoolean341, !local30.aBoolean345, arg3);
					}
					if (local30.anInt4809 != 64) {
						Static217.method2987(arg4, arg9, arg6, local30.anInt4809);
					}
				} else {
					@Pc(934) Class13_Sub1_Sub4 local934;
					@Pc(952) Class13_Sub1_Sub4_Sub2 local952;
					if (arg7 == 1) {
						if (local219) {
							local952 = new Class13_Sub1_Sub4_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, local184);
							if (local952.method8426()) {
								local952.method8423(arg2);
							}
							local934 = local952;
						} else {
							local934 = new Class13_Sub1_Sub4_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, arg1);
						}
						Static330.method5562(arg4, arg9, arg6, local934, null);
						if (local30.aBoolean335 && Static85.aBoolean498) {
							if (arg3 == 0) {
								local128.ka(arg9, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local128.ka(arg9 + 1, arg6 - -1, 50);
							} else if (arg3 == 2) {
								local128.ka(arg9 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local128.ka(arg9, arg6, 50);
							}
						}
						if (local30.anInt4830 != 0 && arg0 != null) {
							arg0.method5180(arg7, arg6, arg9, local30.aBoolean341, !local30.aBoolean345, arg3);
						}
					} else if (arg7 == 2) {
						local368 = arg3 + 1 & 0x3;
						if (local219) {
							@Pc(1089) Class13_Sub1_Sub4_Sub2 local1089 = new Class13_Sub1_Sub4_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3 + 4, local184);
							@Pc(1105) Class13_Sub1_Sub4_Sub2 local1105 = new Class13_Sub1_Sub4_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, local368, local184);
							if (local1089.method8426()) {
								local1089.method8423(arg2);
							}
							local934 = local1089;
							if (local1105.method8426()) {
								local1105.method8423(arg2);
							}
							local672 = local1105;
						} else {
							local934 = new Class13_Sub1_Sub4_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3 + 4, arg1);
							local672 = new Class13_Sub1_Sub4_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, local368, arg1);
						}
						Static330.method5562(arg4, arg9, arg6, local934, local672);
						if ((local30.anInt4801 == 1 || Static543.aBoolean668 && local30.anInt4801 == -1) && !super.aBoolean674) {
							if (arg3 == 0) {
								Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 1);
								Static535.method7390(arg6 + 1, local30.anInt4789, arg9, arg4, local30.anInt4827, 2);
							} else if (arg3 == 1) {
								Static535.method7390(arg6, local30.anInt4789, arg9 + 1, arg4, local30.anInt4827, 1);
								Static535.method7390(arg6 + 1, local30.anInt4789, arg9, arg4, local30.anInt4827, 2);
							} else if (arg3 == 2) {
								Static535.method7390(arg6, local30.anInt4789, arg9 + 1, arg4, local30.anInt4827, 1);
								Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 2);
							} else if (arg3 == 3) {
								Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 1);
								Static535.method7390(arg6, local30.anInt4789, arg9, arg4, local30.anInt4827, 2);
							}
						}
						if (local30.anInt4830 != 0 && arg0 != null) {
							arg0.method5180(arg7, arg6, arg9, local30.aBoolean341, !local30.aBoolean345, arg3);
						}
						if (local30.anInt4809 != 64) {
							Static217.method2987(arg4, arg9, arg6, local30.anInt4809);
						}
					} else if (arg7 == 3) {
						if (local219) {
							local952 = new Class13_Sub1_Sub4_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, local184);
							if (local952.method8426()) {
								local952.method8423(arg2);
							}
							local934 = local952;
						} else {
							local934 = new Class13_Sub1_Sub4_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg7, arg3, arg1);
						}
						Static330.method5562(arg4, arg9, arg6, local934, null);
						if (local30.aBoolean335 && Static85.aBoolean498) {
							if (arg3 == 0) {
								local128.ka(arg9, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local128.ka(arg9 + 1, arg6 + 1, 50);
							} else if (arg3 == 2) {
								local128.ka(arg9 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local128.ka(arg9, arg6, 50);
							}
						}
						if (local30.anInt4830 != 0 && arg0 != null) {
							arg0.method5180(arg7, arg6, arg9, local30.aBoolean341, !local30.aBoolean345, arg3);
						}
					} else if (arg7 == 9) {
						if (local219) {
							local335 = new Class13_Sub1_Sub1_Sub5(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, arg9, arg6, arg6, arg7, arg3, local184);
							if (local335.method8426()) {
								local335.method8423(arg2);
							}
							local366 = local335;
						} else {
							local366 = new Class13_Sub1_Sub1_Sub4(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, arg9 + local50 - 1, arg6, arg6 + local53 - 1, arg7, arg3, arg1);
						}
						Static545.method7521(local366, false);
						if (local30.anInt4801 == 1 && !super.aBoolean674) {
							@Pc(1540) byte local1540;
							if ((arg3 & 0x1) == 0) {
								local1540 = 8;
							} else {
								local1540 = 16;
							}
							Static535.method7390(arg6, local30.anInt4789, arg9, arg4, 0, local1540);
						}
						if (local30.anInt4830 != 0 && arg0 != null) {
							arg0.method5176(local50, !local30.aBoolean345, arg9, local30.aBoolean341, local53, arg6);
						}
						if (local30.anInt4809 != 64) {
							Static217.method2987(arg4, arg9, arg6, local30.anInt4809);
						}
					} else {
						@Pc(1620) Class13_Sub1_Sub3 local1620;
						if (arg7 == 4) {
							if (local219) {
								@Pc(1610) Class13_Sub1_Sub3_Sub1 local1610 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, arg3);
								if (local1610.method8426()) {
									local1610.method8423(arg2);
								}
								local1620 = local1610;
							} else {
								local1620 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, arg3, arg1);
							}
							Static234.method8411(arg4, arg9, arg6, local1620, null);
						} else {
							@Pc(1652) int local1652;
							@Pc(1658) Interface25 local1658;
							@Pc(1725) Class13_Sub1_Sub3_Sub1 local1725;
							if (arg7 == 5) {
								local1652 = 65;
								local1658 = (Interface25) Static166.method1427(arg4, arg9, arg6);
								if (local1658 != null) {
									local1652 = Static319.aClass141_4.method2971(local1658.method8425()).anInt4809 + 1;
								}
								if (local219) {
									local1725 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, local1652 * Static436.anIntArray500[arg3], local1652 * Static599.anIntArray664[arg3], arg7, arg3);
									if (local1725.method8426()) {
										local1725.method8423(arg2);
									}
									local1620 = local1725;
								} else {
									local1620 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, local1652 * Static436.anIntArray500[arg3], local1652 * Static599.anIntArray664[arg3], arg7, arg3, arg1);
								}
								Static234.method8411(arg4, arg9, arg6, local1620, null);
							} else if (arg7 == 6) {
								local1652 = 33;
								local1658 = (Interface25) Static166.method1427(arg4, arg9, arg6);
								if (local1658 != null) {
									local1652 = Static319.aClass141_4.method2971(local1658.method8425()).anInt4809 / 2 + 1;
								}
								if (local219) {
									local1725 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, Static436.anIntArray500[arg3] * local1652, Static599.anIntArray664[arg3] * local1652, arg7, arg3 + 4);
									if (local1725.method8426()) {
										local1725.method8423(arg2);
									}
									local1620 = local1725;
								} else {
									local1620 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, Static81.anIntArray120[arg3] * local1652, local1652 * Static255.anIntArray278[arg3], arg7, arg3 + 4, arg1);
								}
								Static234.method8411(arg4, arg9, arg6, local1620, null);
							} else if (arg7 == 7) {
								local1652 = arg3 + 2 & 0x3;
								if (local219) {
									@Pc(1897) Class13_Sub1_Sub3_Sub1 local1897 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, local1652 + 4);
									if (local1897.method8426()) {
										local1897.method8423(arg2);
									}
									local1620 = local1897;
								} else {
									local1620 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, local1652 + 4, arg1);
								}
								Static234.method8411(arg4, arg9, arg6, local1620, null);
							} else if (arg7 == 8) {
								local368 = arg3 + 2 & 0x3;
								local435 = 33;
								@Pc(1931) Interface25 local1931 = (Interface25) Static166.method1427(arg4, arg9, arg6);
								if (local1931 != null) {
									local435 = Static319.aClass141_4.method2971(local1931.method8425()).anInt4809 / 2 + 1;
								}
								@Pc(1974) Class13_Sub1_Sub3 local1974;
								@Pc(1993) Class13_Sub1_Sub3 local1993;
								if (local219) {
									local1974 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, Static81.anIntArray120[arg3] * local435, Static255.anIntArray278[arg3] * local435, arg7, arg3 + 4);
									local1993 = new Class13_Sub1_Sub3_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, local368 + 4);
									if (local1974.method8426()) {
										local1974.method8423(arg2);
									}
									if (local1993.method8426()) {
										local1993.method8423(arg2);
									}
								} else {
									local1974 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, Static81.anIntArray120[arg3] * local435, Static255.anIntArray278[arg3] * local435, arg7, arg3 + 4, arg1);
									local1993 = new Class13_Sub1_Sub3_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, 0, 0, arg7, local368 + 4, arg1);
								}
								Static234.method8411(arg4, arg9, arg6, local1974, local1993);
							}
						}
					}
				}
			} else {
				if (local219) {
					local335 = new Class13_Sub1_Sub1_Sub5(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, arg9 + local50 - 1, arg6, local53 + arg6 - 1, arg7, arg3, local184);
					local366 = local335;
					if (local335.method8426()) {
						local335.method8423(arg2);
					}
				} else {
					local366 = new Class13_Sub1_Sub1_Sub4(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg9, local50 + arg9 - 1, arg6, arg6 + local53 - 1, arg7, arg3, arg1);
				}
				Static545.method7521(local366, false);
				if (Static85.aBoolean498 && !super.aBoolean674 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0 && local30.anInt4801 != 0) {
					super.aByteArrayArrayArray15[arg4][arg9][arg6] = (byte) (super.aByteArrayArrayArray15[arg4][arg9][arg6] | 0x4);
				}
				if (local30.anInt4830 != 0 && arg0 != null) {
					arg0.method5176(local50, !local30.aBoolean345, arg9, local30.aBoolean341, local53, arg6);
				}
			}
		} else if (Static234.aClass2_Sub5_48.aClass6_Sub4_1.method2457() != 0 || local30.anInt4828 != 0 || local30.anInt4830 == 1 || local30.aBoolean349) {
			@Pc(281) Class13_Sub1_Sub2 local281;
			if (local219) {
				@Pc(298) Class13_Sub1_Sub2_Sub2 local298 = new Class13_Sub1_Sub2_Sub2(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg3, local184);
				if (local298.method8426()) {
					local298.method8423(arg2);
				}
				local281 = local298;
			} else {
				local281 = new Class13_Sub1_Sub2_Sub1(arg2, local30, arg4, arg8, local164, local156, local172, super.aBoolean674, arg3, arg1);
			}
			Static176.method2594(arg4, arg9, arg6, local281);
			if (local30.anInt4830 == 1 && arg0 != null) {
				arg0.method5179(arg6, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZILclient!ha;Lclient!vj;I[I)V")
	public void method7628(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) Class2_Sub22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean674) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(19) Class350 local19 = null;
		while (true) {
			@Pc(24) int local24;
			@Pc(73) int local73;
			@Pc(112) int local112;
			@Pc(116) int local116;
			@Pc(495) int local495;
			while (arg2.aByteArray115.length > arg2.anInt10247) {
				local24 = arg2.method8547();
				if (local24 == 0) {
					local19 = new Class350(arg2);
				} else {
					@Pc(221) int local221;
					@Pc(127) int local127;
					@Pc(134) int local134;
					if (local24 == 1) {
						local73 = arg2.method8547();
						if (local73 > 0) {
							for (local495 = 0; local495 < local73; local495++) {
								@Pc(504) Class367 local504 = new Class367(arg1, arg2, 2);
								if (local504.anInt9854 == 31) {
									@Pc(515) Class282 local515 = Static516.aClass43_3.method887(arg2.method8546());
									local504.method8219(local515.anInt7389, local515.anInt7390, local515.anInt7392, local515.anInt7393);
								}
								if (arg1.method6994() > 0) {
									@Pc(535) Class2_Sub24 local535 = local504.aClass2_Sub24_3;
									local221 = (arg0 << 9) + local535.method6299();
									local127 = local535.method6301() + (arg3 << 9);
									local134 = local221 >> 9;
									@Pc(560) int local560 = local127 >> 9;
									if (local134 >= 0 && local560 >= 0 && local134 < super.anInt9069 && local560 < super.anInt9067) {
										local535.method6309(super.anIntArrayArrayArray20[local504.anInt9858][local134][local560] - local535.method6308(), local127, local221);
										Static475.method6409(local504);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local19 == null) {
							local19 = new Class350();
						}
						local19.method7892(arg2);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray17 == null) {
							super.aByteArrayArrayArray17 = new byte[4][][];
						}
						for (local73 = 0; local73 < 4; local73++) {
							@Pc(79) byte local79 = arg2.method8548();
							if (local79 == 0 && super.aByteArrayArrayArray17[local73] != null) {
								local112 = arg0;
								local116 = arg0 + 64;
								local221 = arg3;
								if (local116 < 0) {
									local116 = 0;
								} else if (local116 >= super.anInt9069) {
									local116 = super.anInt9069;
								}
								if (arg3 < 0) {
									local221 = 0;
								} else if (super.anInt9067 <= arg3) {
									local221 = super.anInt9067;
								}
								if (arg0 < 0) {
									local112 = 0;
								} else if (arg0 >= super.anInt9069) {
									local112 = super.anInt9069;
								}
								local127 = arg3 + 64;
								if (local127 < 0) {
									local127 = 0;
								} else if (super.anInt9067 <= local127) {
									local127 = super.anInt9067;
								}
								while (local112 < local116) {
									while (local127 > local221) {
										super.aByteArrayArrayArray17[local73][local112][local221] = 0;
										local221++;
									}
									local112++;
								}
							} else if (local79 == 1) {
								if (super.aByteArrayArrayArray17[local73] == null) {
									super.aByteArrayArrayArray17[local73] = new byte[super.anInt9069 + 1][super.anInt9067 + 1];
								}
								for (local112 = 0; local112 < 64; local112 += 4) {
									for (local116 = 0; local116 < 64; local116 += 4) {
										@Pc(122) byte local122 = arg2.method8548();
										for (local127 = local112 + arg0; local127 < arg0 + local112 + 4; local127++) {
											for (local134 = local116 + arg3; local134 < arg3 + local116 + 4; local134++) {
												if (local127 >= 0 && local127 < super.anInt9069 && local134 >= 0 && super.anInt9067 > local134) {
													super.aByteArrayArrayArray17[local73][local127][local134] = local122;
												}
											}
										}
									}
								}
							} else if (local79 == 2) {
								if (super.aByteArrayArrayArray17[local73] == null) {
									super.aByteArrayArrayArray17[local73] = new byte[super.anInt9069 + 1][super.anInt9067 + 1];
								}
								if (local73 > 0) {
									local112 = arg0;
									local116 = arg0 + 64;
									local221 = arg3;
									if (local116 < 0) {
										local116 = 0;
									} else if (local116 >= super.anInt9069) {
										local116 = super.anInt9069;
									}
									local127 = arg3 + 64;
									if (arg0 < 0) {
										local112 = 0;
									} else if (arg0 >= super.anInt9069) {
										local112 = super.anInt9069;
									}
									if (arg3 < 0) {
										local221 = 0;
									} else if (arg3 >= super.anInt9067) {
										local221 = super.anInt9067;
									}
									if (local127 < 0) {
										local127 = 0;
									} else if (super.anInt9067 <= local127) {
										local127 = super.anInt9067;
									}
									while (local116 > local112) {
										while (local127 > local221) {
											super.aByteArrayArrayArray17[local73][local112][local221] = super.aByteArrayArrayArray17[local73 - 1][local112][local221];
											local221++;
										}
										local112++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg4 == null) {
						arg2.anInt10247 += 10;
					} else {
						arg4[0] = arg2.method8546();
						arg4[1] = arg2.method8526();
						arg4[2] = arg2.method8526();
						arg4[3] = arg2.method8526();
						arg4[4] = arg2.method8546();
					}
				}
			}
			if (local19 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local73 = 0; local73 < 8; local73++) {
						local495 = (arg0 >> 3) + local24;
						local112 = local73 + (arg3 >> 3);
						if (local495 >= 0 && super.anInt9069 >> 3 > local495 && local112 >= 0 && super.anInt9067 >> 3 > local112) {
							Static58.method902(local112, local19, local495);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray17 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray17[local24] != null) {
						for (local73 = 0; local73 < 16; local73++) {
							for (local495 = 0; local495 < 16; local495++) {
								local112 = local73 + (arg0 >> 2);
								local116 = local495 + (arg3 >> 2);
								if (local112 >= 0 && local112 < 26 && local116 >= 0 && local116 < 26) {
									super.aByteArrayArrayArray17[local24][local112][local116] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!nt;ILclient!ha;IBII)V")
	public void method7629(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Interface25 local13 = this.method7631(arg3, arg5, arg4, arg1);
		if (local13 == null) {
			return;
		}
		@Pc(22) Class191 local22 = Static319.aClass141_4.method2971(local13.method8425());
		@Pc(26) int local26 = local13.method8421();
		@Pc(30) int local30 = local13.method8420();
		if (local22.method4053()) {
			Static408.method5483(local22, arg1, arg5, arg4);
		}
		if (local13.method8426()) {
			local13.method8422(arg2);
		}
		if (arg3 == 0) {
			Static32.method576(arg4, arg1, arg5);
			if (local22.anInt4830 != 0) {
				arg0.method5178(arg1, local30, local26, arg5, local22.aBoolean341, !local22.aBoolean345);
			}
			if (local22.anInt4801 == 1) {
				if (local30 == 0) {
					Static464.method6286(arg4, arg5, 1, arg1);
				} else if (local30 == 1) {
					Static464.method6286(arg4, arg5 + 1, 2, arg1);
				} else if (local30 == 2) {
					Static464.method6286(arg4, arg5, 1, arg1 + 1);
				} else if (local30 == 3) {
					Static464.method6286(arg4, arg5, 2, arg1);
				}
			}
		} else if (arg3 == 1) {
			Static618.method8290(arg4, arg1, arg5);
		} else if (arg3 == 2) {
			Static629.method8436(arg4, arg1, arg5, vea.class);
			if (local22.anInt4830 != 0 && super.anInt9069 > arg1 + local22.anInt4814 && arg5 + local22.anInt4814 < super.anInt9067 && local22.anInt4817 + arg1 < super.anInt9069 && arg5 + local22.anInt4817 < super.anInt9067) {
				arg0.method5192(!local22.aBoolean345, local30, local22.aBoolean341, local22.anInt4814, arg1, local22.anInt4817, arg5);
			}
			if (local26 == 9) {
				if ((local30 & 0x1) == 0) {
					Static464.method6286(arg4, arg5, 8, arg1);
				} else {
					Static464.method6286(arg4, arg5, 16, arg1);
				}
			}
		} else if (arg3 == 3) {
			Static7.method110(arg4, arg1, arg5);
			if (local22.anInt4830 == 1) {
				arg0.method5190(arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ha;ZZ)V")
	public void method7630(@OriginalArg(0) Class95 arg0, @OriginalArg(1) boolean arg1) {
		Static59.method904();
		if (!arg1) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt9071 > 1) {
				for (local14 = 0; super.anInt9069 > local14; local14++) {
					for (local18 = 0; local18 < super.anInt9067; local18++) {
						if ((Static27.aByteArrayArrayArray1[1][local14][local18] & 0x2) == 2) {
							Static43.method694(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; local14 < super.anInt9071; local14++) {
				for (local18 = 0; super.anInt9067 >= local18; local18++) {
					for (@Pc(62) int local62 = 0; super.anInt9069 >= local62; local62++) {
						if ((super.aByteArrayArrayArray15[local14][local62][local18] & 0x4) != 0) {
							@Pc(77) int local77 = local62;
							@Pc(79) int local79 = local62;
							@Pc(81) int local81 = local18;
							@Pc(83) int local83 = local18;
							while (local81 > 0 && (super.aByteArrayArrayArray15[local14][local62][local81 - 1] & 0x4) != 0 && local18 - local81 < 10) {
								local81--;
							}
							while (super.anInt9067 > local83 && (super.aByteArrayArrayArray15[local14][local62][local83 + 1] & 0x4) != 0 && local83 - local81 < 10) {
								local83++;
							}
							@Pc(142) int local142;
							label111: while (local77 > 0 && local62 - local77 < 10) {
								for (local142 = local81; local142 <= local83; local142++) {
									if ((super.aByteArrayArrayArray15[local14][local77 - 1][local142] & 0x4) == 0) {
										break label111;
									}
								}
								local77--;
							}
							label98: while (super.anInt9069 > local79 && local79 - local77 < 10) {
								for (local142 = local81; local142 <= local83; local142++) {
									if ((super.aByteArrayArrayArray15[local14][local79 + 1][local142] & 0x4) == 0) {
										break label98;
									}
								}
								local79++;
							}
							if ((local83 + 1 - local81) * (local79 + 1 - local77) >= 4) {
								local142 = super.anIntArrayArrayArray20[local14][local77][local81];
								Static230.method3179(local77 << 9, (local79 << 9) + 512, (local83 << 9) - -512, local14, local142, local81 << 9, local142);
								for (@Pc(269) int local269 = local77; local269 <= local79; local269++) {
									for (@Pc(273) int local273 = local81; local273 <= local83; local273++) {
										super.aByteArrayArrayArray15[local14][local269][local273] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static275.method3806();
		}
		super.aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBI)Lclient!vea;")
	private Interface25 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface25 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface25) Static166.method1427(arg2, arg3, arg1);
		}
		if (arg0 == 1) {
			local5 = (Interface25) Static330.method5563(arg2, arg3, arg1);
		}
		if (arg0 == 2) {
			local5 = (Interface25) Static245.method3380(arg2, arg3, arg1, vea.class);
		}
		if (arg0 == 3) {
			local5 = (Interface25) Static629.method8438(arg2, arg3, arg1);
		}
		return local5;
	}
}
