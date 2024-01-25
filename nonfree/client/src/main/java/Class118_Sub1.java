import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
	public int anInt5450 = 99;

	static {
		new Class134("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIZ)V")
	public Class118_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static323.aClass218_2, Static246.aClass153_4);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([ILclient!za;Lclient!sv;IIZ)V")
	public void method4312(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) Class2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (super.aBoolean408) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class159 local19 = null;
		while (true) {
			@Pc(24) int local24;
			@Pc(43) int local43;
			@Pc(240) int local240;
			@Pc(244) int local244;
			@Pc(47) int local47;
			while (arg2.aByteArray52.length > arg2.anInt4347) {
				local24 = arg2.method3580();
				if (local24 == 0) {
					local19 = new Class159(arg2);
				} else {
					@Pc(105) int local105;
					@Pc(109) int local109;
					@Pc(97) int local97;
					if (local24 == 1) {
						local43 = arg2.method3580();
						if (local43 > 0) {
							for (local47 = 0; local47 < local43; local47++) {
								@Pc(56) Class250 local56 = new Class250(arg1, arg2, 0);
								if (local56.anInt6807 == 31) {
									@Pc(69) Class116 local69 = Static206.aClass176_1.method3752(arg2.method3555());
									local56.method5257(local69.anInt3029, local69.anInt3035, local69.anInt3030, local69.anInt3034);
								}
								if (arg1.method5553() > 0) {
									@Pc(89) Class2_Sub29 local89 = local56.aClass2_Sub29_2;
									local97 = local89.method5687() + (arg3 << 7);
									local105 = (arg4 << 7) + local89.method5693();
									local109 = local97 >> 7;
									@Pc(113) int local113 = local105 >> 7;
									if (local109 >= 0 && local113 >= 0 && local109 < super.anInt5448 && local113 < super.anInt5434) {
										local89.method5686(local97, local105, super.anIntArrayArrayArray11[local56.anInt6796][local109][local113] - local89.method5695());
										Static416.method5255(local56);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local19 == null) {
							local19 = new Class159();
						}
						local19.method3201(arg2);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local43 = 0; local43 < 4; local43++) {
							@Pc(200) byte local200 = arg2.method3605();
							if (local200 == 0 && super.aByteArrayArrayArray13[local43] != null) {
								local240 = arg3;
								local244 = arg3 + 64;
								local97 = arg4;
								if (arg4 < 0) {
									local97 = 0;
								} else if (super.anInt5434 <= arg4) {
									local97 = super.anInt5434;
								}
								local105 = arg4 + 64;
								if (local244 < 0) {
									local244 = 0;
								} else if (local244 >= super.anInt5448) {
									local244 = super.anInt5448;
								}
								if (arg3 < 0) {
									local240 = 0;
								} else if (super.anInt5448 <= arg3) {
									local240 = super.anInt5448;
								}
								if (local105 < 0) {
									local105 = 0;
								} else if (super.anInt5434 <= local105) {
									local105 = super.anInt5434;
								}
								while (local244 > local240) {
									while (local105 > local97) {
										super.aByteArrayArrayArray13[local43][local240][local97] = 0;
										local97++;
									}
									local240++;
								}
							} else if (local200 == 1) {
								if (super.aByteArrayArrayArray13[local43] == null) {
									super.aByteArrayArrayArray13[local43] = new byte[super.anInt5448 + 1][super.anInt5434 + 1];
								}
								for (local240 = 0; local240 < 64; local240 += 4) {
									for (local244 = 0; local244 < 64; local244 += 4) {
										@Pc(382) byte local382 = arg2.method3605();
										for (local105 = arg3 + local240; local105 < local240 + arg3 + 4; local105++) {
											for (local109 = arg4 + local244; local109 < arg4 + local244 + 4; local109++) {
												if (local105 >= 0 && local105 < super.anInt5448 && local109 >= 0 && super.anInt5434 > local109) {
													super.aByteArrayArrayArray13[local43][local105][local109] = local382;
												}
											}
										}
									}
								}
							} else if (local200 == 2) {
								if (super.aByteArrayArrayArray13[local43] == null) {
									super.aByteArrayArrayArray13[local43] = new byte[super.anInt5448 + 1][super.anInt5434 + 1];
								}
								if (local43 > 0) {
									local240 = arg3;
									local244 = arg3 + 64;
									local97 = arg4;
									if (arg4 < 0) {
										local97 = 0;
									} else if (arg4 >= super.anInt5434) {
										local97 = super.anInt5434;
									}
									if (local244 < 0) {
										local244 = 0;
									} else if (local244 >= super.anInt5448) {
										local244 = super.anInt5448;
									}
									if (arg3 < 0) {
										local240 = 0;
									} else if (super.anInt5448 <= arg3) {
										local240 = super.anInt5448;
									}
									local105 = arg4 + 64;
									if (local105 < 0) {
										local105 = 0;
									} else if (super.anInt5434 <= local105) {
										local105 = super.anInt5434;
									}
									while (local240 < local244) {
										while (local97 < local105) {
											super.aByteArrayArrayArray13[local43][local240][local97] = super.aByteArrayArrayArray13[local43 - 1][local240][local97];
											local97++;
										}
										local240++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg0 == null) {
						arg2.anInt4347 += 10;
					} else {
						arg0[0] = arg2.method3555();
						arg0[1] = arg2.method3558();
						arg0[2] = arg2.method3558();
						arg0[3] = arg2.method3558();
						arg0[4] = arg2.method3555();
					}
				}
			}
			if (local19 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local43 = 0; local43 < 8; local43++) {
						local47 = local24 + (arg3 >> 3);
						local240 = (arg4 >> 3) + local43;
						if (local47 >= 0 && super.anInt5448 >> 3 > local47 && local240 >= 0 && super.anInt5434 >> 3 > local240) {
							Static362.method4759(local240, local19, local47);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray13 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray13[local24] != null) {
						for (local43 = 0; local43 < 16; local43++) {
							for (local47 = 0; local47 < 16; local47++) {
								local240 = (arg3 >> 2) + local43;
								local244 = (arg4 >> 2) + local47;
								if (local240 >= 0 && local240 < 26 && local244 >= 0 && local244 < 26) {
									super.aByteArrayArrayArray13[local24][local240][local244] = 0;
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

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BIILclient!et;IILclient!za;)V")
	public void method4313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		@Pc(14) Interface2 local14 = null;
		if (arg0 == 0) {
			local14 = (Interface2) Static113.method1718(arg3, arg4, arg1);
		}
		if (arg0 == 1) {
			local14 = (Interface2) Static333.method4460(arg3, arg4, arg1);
		}
		if (arg0 == 2) {
			local14 = (Interface2) Static144.method2120(arg3, arg4, arg1, bn.class);
		}
		if (arg0 == 3) {
			local14 = (Interface2) Static350.method4653(arg3, arg4, arg1);
		}
		if (local14 == null) {
			return;
		}
		@Pc(70) Class192 local70 = Static50.aClass190_1.method4218(local14.method5292());
		@Pc(76) int local76 = local14.method5296();
		@Pc(80) int local80 = local14.method5298();
		if (local70.method4236()) {
			Static93.method1470(arg3, arg1, arg4, local70);
		}
		if (local14.method5295()) {
			local14.method5293(arg5);
		}
		if (arg0 == 0) {
			@Pc(108) Class3_Sub2 local108 = Static113.method1718(arg3, arg4, arg1);
			if (local108 instanceof Class3_Sub2_Sub1) {
				((Class3_Sub2_Sub1) local108).aClass3_Sub2_1 = null;
			} else {
				Static415.method5248(arg3, arg4, arg1);
			}
			if (local70.anInt5337 != 0) {
				arg2.method1611(local80, arg1, arg4, local70.aBoolean404, !local70.aBoolean405, local76);
				return;
			}
		} else if (arg0 == 1) {
			@Pc(286) Class3_Sub3 local286 = Static333.method4460(arg3, arg4, arg1);
			if (local286 instanceof Class3_Sub3_Sub1) {
				((Class3_Sub3_Sub1) local286).aClass3_Sub3_1 = null;
				return;
			}
			Static170.method2388(arg3, arg4, arg1);
		} else {
			if (arg0 == 2) {
				@Pc(161) Class3_Sub4 local161 = Static144.method2120(arg3, arg4, arg1, bn.class);
				if (local161 instanceof Class3_Sub4_Sub2 && arg4 == local161.aShort92 && local161.aShort89 == arg1) {
					((Class3_Sub4_Sub2) local161).aClass3_Sub4_1 = null;
				} else {
					Static152.method2186(arg3, arg4, arg1, bn.class);
				}
				if (local70.anInt5337 != 0 && local70.anInt5321 + arg4 < super.anInt5448 && super.anInt5434 > local70.anInt5321 + arg1 && arg4 + local70.anInt5355 < super.anInt5448 && local70.anInt5355 + arg1 < super.anInt5434) {
					arg2.method1610(local70.anInt5355, local80, arg1, !local70.aBoolean405, arg4, local70.aBoolean404, local70.anInt5321);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(258) Class3_Sub5 local258 = Static350.method4653(arg3, arg4, arg1);
				if (local258 instanceof Class3_Sub5_Sub3) {
					((Class3_Sub5_Sub3) local258).aClass3_Sub5_1 = null;
				} else {
					Static22.method265(arg3, arg4, arg1);
				}
				if (local70.anInt5337 != 1) {
					return;
				}
				arg2.method1618(arg1, arg4);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILclient!sv;ILclient!za;[IIIIII)V")
	public void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean408) {
			return;
		}
		@Pc(13) Class159 local13 = null;
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(25) int local25 = (arg0 & 0x7) * 8;
		@Pc(31) int local31 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(52) int local52;
			@Pc(87) int local87;
			@Pc(108) int local108;
			@Pc(426) int local426;
			while (arg2.anInt4347 < arg2.aByteArray52.length) {
				local52 = arg2.method3580();
				if (local52 == 0) {
					local13 = new Class159(arg2);
				} else {
					@Pc(138) int local138;
					@Pc(255) int local255;
					@Pc(289) int local289;
					@Pc(114) int local114;
					if (local52 == 1) {
						local87 = arg2.method3580();
						if (local87 > 0) {
							for (local426 = 0; local426 < local87; local426++) {
								@Pc(435) Class250 local435 = new Class250(arg4, arg2, 0);
								if (local435.anInt6807 == 31) {
									@Pc(448) Class116 local448 = Static206.aClass176_1.method3752(arg2.method3555());
									local435.method5257(local448.anInt3029, local448.anInt3035, local448.anInt3030, local448.anInt3034);
								}
								if (arg4.method5553() > 0) {
									@Pc(468) Class2_Sub29 local468 = local435.aClass2_Sub29_2;
									local114 = local468.method5687() >> 7;
									local138 = local468.method5693() >> 7;
									if (arg1 == local435.anInt6796 && local25 <= local114 && local25 + 8 > local114 && local138 >= local31 && local31 + 8 > local138) {
										local255 = Static26.method369(local468.method5687() & 0x3FF, arg7, local468.method5693() & 0x3FF) + (arg6 << 7);
										local289 = Static125.method1833(local468.method5693() & 0x3FF, arg7, local468.method5687() & 0x3FF) + (arg9 << 7);
										local114 = local255 >> 7;
										local138 = local289 >> 7;
										if (local114 >= 0 && local138 >= 0 && local114 < super.anInt5448 && super.anInt5434 > local138) {
											local468.method5686(local255, local289, super.anIntArrayArrayArray11[arg1][local114][local138] - local468.method5695());
											Static416.method5255(local435);
										}
									}
								}
							}
						}
					} else if (local52 == 2) {
						if (local13 == null) {
							local13 = new Class159();
						}
						local13.method3201(arg2);
					} else if (local52 != 128) {
						if (local52 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local87 = 0; local87 < 4; local87++) {
							@Pc(93) byte local93 = arg2.method3605();
							@Pc(112) int local112;
							if (local93 == 0 && super.aByteArrayArrayArray13[arg8] != null) {
								if (arg1 >= local87) {
									local108 = arg6;
									local112 = arg6 + 7;
									local114 = arg9;
									if (arg6 < 0) {
										local108 = 0;
									} else if (arg6 >= super.anInt5448) {
										local108 = super.anInt5448;
									}
									local138 = arg9 + 7;
									if (local112 < 0) {
										local112 = 0;
									} else if (local112 >= super.anInt5448) {
										local112 = super.anInt5448;
									}
									if (arg9 < 0) {
										local114 = 0;
									} else if (super.anInt5434 <= arg9) {
										local114 = super.anInt5434;
									}
									if (local138 < 0) {
										local138 = 0;
									} else if (local138 >= super.anInt5434) {
										local138 = super.anInt5434;
									}
									while (local112 > local108) {
										while (local138 > local114) {
											super.aByteArrayArrayArray13[arg8][local108][local114] = 0;
											local114++;
										}
										local108++;
									}
								}
							} else if (local93 == 1) {
								if (super.aByteArrayArrayArray13[arg8] == null) {
									super.aByteArrayArrayArray13[arg8] = new byte[super.anInt5448 + 1][super.anInt5434 + 1];
								}
								for (local108 = 0; local108 < 64; local108 += 4) {
									for (local112 = 0; local112 < 64; local112 += 4) {
										@Pc(242) byte local242 = arg2.method3605();
										if (arg1 >= local87) {
											for (local138 = local108; local138 < local108 + 4; local138++) {
												for (local255 = local112; local255 < local112 + 4; local255++) {
													if (local25 <= local138 && local138 < local25 + 8 && local255 >= local31 && local31 + 8 > local31) {
														local289 = arg6 + Static289.method3845(local255 & 0x7, local138 & 0x7, arg7);
														@Pc(301) int local301 = arg9 + Static248.method3156(local255 & 0x7, local138 & 0x7, arg7);
														if (local289 >= 0 && local289 < super.anInt5448 && local301 >= 0 && local301 < super.anInt5434) {
															super.aByteArrayArrayArray13[arg8][local289][local301] = local242;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg5 == null) {
						arg2.anInt4347 += 10;
					} else {
						arg5[0] = arg2.method3555();
						arg5[1] = arg2.method3558();
						arg5[2] = arg2.method3558();
						arg5[3] = arg2.method3558();
						arg5[4] = arg2.method3555();
					}
				}
			}
			if (local13 != null) {
				Static362.method4759(arg9 >> 3, local13, arg6 >> 3);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg8] != null) {
				local52 = arg6 + 7;
				local87 = arg9 + 7;
				for (local426 = arg6; local426 < local52; local426++) {
					for (local108 = arg9; local108 < local87; local108++) {
						super.aByteArrayArrayArray13[arg8][local426][local108] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIIIILclient!za;ILclient!et;)V")
	public void method4315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class163 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class71 arg9) {
		if (!Static2.aClass148_Sub1_1.method3047(Static288.anInt4743) && !Static375.method4874(arg3, Static280.anInt4592, arg8, arg4)) {
			return;
		}
		if (arg2 < this.anInt5450) {
			this.anInt5450 = arg2;
		}
		@Pc(36) Class192 local36 = Static50.aClass190_1.method4218(arg6);
		if (arg7.method5548() && Static2.aClass148_Sub1_1.aBoolean260 && local36.aBoolean397) {
			return;
		}
		@Pc(59) int local59;
		@Pc(62) int local62;
		if (arg1 == 1 || arg1 == 3) {
			local59 = local36.anInt5355;
			local62 = local36.anInt5321;
		} else {
			local59 = local36.anInt5321;
			local62 = local36.anInt5355;
		}
		@Pc(95) int local95;
		@Pc(88) int local88;
		if (super.anInt5448 >= arg4 + local59) {
			local88 = arg4 + (local59 + 1 >> 1);
			local95 = arg4 + (local59 >> 1);
		} else {
			local95 = arg4;
			local88 = arg4 + 1;
		}
		@Pc(120) int local120;
		@Pc(118) int local118;
		if (arg8 + local62 > super.anInt5434) {
			local118 = arg8 + 1;
			local120 = arg8;
		} else {
			local118 = arg8 + (local62 + 1 >> 1);
			local120 = (local62 >> 1) + arg8;
		}
		@Pc(140) Class162 local140 = Static345.aClass162Array3[arg3];
		@Pc(163) int local163 = local140.ua(local95, local120) + local140.ua(local88, local120) + local140.ua(local95, local118) + local140.ua(local88, local118) >> 2;
		@Pc(171) int local171 = (local59 << 6) + (arg4 << 7);
		@Pc(179) int local179 = (local62 << 6) + (arg8 << 7);
		@Pc(191) boolean local191 = Static260.aBoolean306 && !super.aBoolean408 && local36.aBoolean403;
		if (local36.method4236()) {
			Static160.method2246(arg8, arg4, local36, arg1, null, null, arg2);
		}
		@Pc(232) boolean local232 = arg0 == -1 && local36.anInt5327 == -1 && local36.anIntArray437 == null && local36.anIntArray434 == null && !local36.aBoolean400;
		if (Static30.aBoolean56 && (Static289.method3848(arg5) && local36.anInt5336 != 1 || !(!Static447.method5637(arg5) || local36.anInt5336 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(397) Class3_Sub4 local397;
			@Pc(363) Class3_Sub4_Sub6 local363;
			@Pc(367) int local367;
			if (arg5 == 10 || arg5 == 11) {
				local363 = null;
				if (local232) {
					@Pc(427) Class3_Sub4_Sub6 local427 = new Class3_Sub4_Sub6(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, local59 + arg4 - 1, arg8, local62 + arg8 - 1, arg5, arg1, local191);
					local367 = local427.method5302();
					local363 = local427;
					local397 = local427;
				} else {
					local367 = 15;
					local397 = new Class3_Sub4_Sub5(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, arg4 + local59 - 1, arg8, arg8 + local62 - 1, arg5, arg1, arg0);
				}
				@Pc(448) Class3_Sub4 local448 = Static144.method2120(arg2, arg4, arg8, bn.class);
				@Pc(450) boolean local450 = false;
				if (local448 instanceof Class3_Sub4_Sub2 && arg4 == local448.aShort92 && local448.aShort89 == arg8) {
					((Class3_Sub4_Sub2) local448).aClass3_Sub4_1 = local397;
					local450 = true;
				}
				if (local450 || Static249.method3169(local397, false)) {
					if (local363 != null && local363.method5295()) {
						local363.method5294(arg7);
					}
					if (local36.aBoolean401 && Static260.aBoolean306) {
						if (local367 > 30) {
							local367 = 30;
						}
						for (@Pc(503) int local503 = 0; local503 <= local59; local503++) {
							for (@Pc(507) int local507 = 0; local507 <= local62; local507++) {
								local140.qa(local503 + arg4, arg8 + local507, local367);
							}
						}
					}
				}
				if (local36.anInt5337 != 0 && arg9 != null) {
					arg9.method1609(local62, arg4, local36.aBoolean404, local59, arg8, !local36.aBoolean405);
				}
			} else {
				@Pc(651) Class3_Sub4 local651;
				if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
					if (local232) {
						local363 = new Class3_Sub4_Sub6(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, local59 + arg4 - 1, arg8, local62 + arg8 - 1, arg5, arg1, local191);
						if (local363.method5295()) {
							local363.method5294(arg7);
						}
						local397 = local363;
					} else {
						local397 = new Class3_Sub4_Sub5(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, arg4 + local59 - 1, arg8, arg8 + local62 - 1, arg5, arg1, arg0);
					}
					local651 = Static144.method2120(arg2, arg4, arg8, bn.class);
					if (local651 instanceof Class3_Sub4_Sub2 && local651.aShort92 == arg4 && local651.aShort89 == arg8) {
						((Class3_Sub4_Sub2) local651).aClass3_Sub4_1 = local397;
					} else {
						Static249.method3169(local397, false);
					}
					if (Static260.aBoolean306 && !super.aBoolean408 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0 && local36.anInt5336 != 0) {
						super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x4);
					}
					if (local36.anInt5337 != 0 && arg9 != null) {
						arg9.method1609(local62, arg4, local36.aBoolean404, local59, arg8, !local36.aBoolean405);
					}
				} else {
					@Pc(773) Class3_Sub2 local773;
					if (arg5 == 0) {
						@Pc(747) int local747 = local36.anInt5336;
						if (Static443.aBoolean516 && local36.anInt5336 == -1) {
							local747 = 1;
						}
						if (local232) {
							@Pc(790) Class3_Sub2_Sub2 local790 = new Class3_Sub2_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, local191);
							if (local790.method5295()) {
								local790.method5294(arg7);
							}
							local773 = local790;
						} else {
							local773 = new Class3_Sub2_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, arg0);
						}
						@Pc(805) Class3_Sub2 local805 = Static113.method1718(arg2, arg4, arg8);
						if (local805 instanceof Class3_Sub2_Sub1) {
							((Class3_Sub2_Sub1) local805).aClass3_Sub2_1 = local773;
						} else {
							Static53.method741(arg2, arg4, arg8, local773, null);
						}
						if (Static260.aBoolean306) {
							if (arg1 == 0) {
								if (local36.aBoolean401) {
									local140.qa(arg4, arg8, 50);
									local140.qa(arg4, arg8 + 1, 50);
								}
								if (local747 == 1 && !super.aBoolean408) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x1);
								}
							} else if (arg1 == 1) {
								if (local36.aBoolean401) {
									local140.qa(arg4, arg8 + 1, 50);
									local140.qa(arg4 + 1, arg8 - -1, 50);
								}
								if (local747 == 1 && !super.aBoolean408) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] | 0x2);
								}
							} else if (arg1 == 2) {
								if (local36.aBoolean401) {
									local140.qa(arg4 + 1, arg8, 50);
									local140.qa(arg4 + 1, arg8 + 1, 50);
								}
								if (local747 == 1 && !super.aBoolean408) {
									super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] | 0x1);
								}
							} else if (arg1 == 3) {
								if (local36.aBoolean401) {
									local140.qa(arg4, arg8, 50);
									local140.qa(arg4 + 1, arg8, 50);
								}
								if (local747 == 1 && !super.aBoolean408) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x2);
								}
							}
						}
						if (local36.anInt5337 != 0 && arg9 != null) {
							arg9.method1614(arg5, arg1, !local36.aBoolean405, local36.aBoolean404, arg8, arg4);
						}
						if (local36.anInt5324 != 16) {
							Static26.method367(arg2, arg4, arg8, local36.anInt5324);
						}
					} else {
						@Pc(1098) Class3_Sub2_Sub2 local1098;
						@Pc(1081) Class3_Sub2 local1081;
						if (arg5 == 1) {
							if (local232) {
								local1098 = new Class3_Sub2_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, local191);
								local1081 = local1098;
								if (local1098.method5295()) {
									local1098.method5294(arg7);
								}
							} else {
								local1081 = new Class3_Sub2_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, arg0);
							}
							local773 = Static113.method1718(arg2, arg4, arg8);
							if (local773 instanceof Class3_Sub2_Sub1) {
								((Class3_Sub2_Sub1) local773).aClass3_Sub2_1 = local1081;
							} else {
								Static53.method741(arg2, arg4, arg8, local1081, null);
							}
							if (local36.aBoolean401 && Static260.aBoolean306) {
								if (arg1 == 0) {
									local140.qa(arg4, arg8 + 1, 50);
								} else if (arg1 == 1) {
									local140.qa(arg4 + 1, arg8 + 1, 50);
								} else if (arg1 == 2) {
									local140.qa(arg4 + 1, arg8, 50);
								} else if (arg1 == 3) {
									local140.qa(arg4, arg8, 50);
								}
							}
							if (local36.anInt5337 != 0 && arg9 != null) {
								arg9.method1614(arg5, arg1, !local36.aBoolean405, local36.aBoolean404, arg8, arg4);
							}
						} else if (arg5 == 2) {
							local367 = arg1 + 1 & 0x3;
							if (local232) {
								@Pc(1236) Class3_Sub2_Sub2 local1236 = new Class3_Sub2_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1 + 4, local191);
								@Pc(1251) Class3_Sub2_Sub2 local1251 = new Class3_Sub2_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg5, local367, local191);
								if (local1236.method5295()) {
									local1236.method5294(arg7);
								}
								local1081 = local1236;
								if (local1251.method5295()) {
									local1251.method5294(arg7);
								}
								local773 = local1251;
							} else {
								local1081 = new Class3_Sub2_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1 + 4, arg0);
								local773 = new Class3_Sub2_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg5, local367, arg0);
							}
							Static53.method741(arg2, arg4, arg8, local1081, local773);
							if (local36.anInt5336 == 1 && Static260.aBoolean306 && !super.aBoolean408) {
								if (arg1 == 0) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x1);
									super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] | 0x2);
								} else if (arg1 == 1) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] | 0x1);
								} else if (arg1 == 2) {
									super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4 + 1][arg8] | 0x1);
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x2);
								} else if (arg1 == 3) {
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x2);
									super.aByteArrayArrayArray14[arg2][arg4][arg8] = (byte) (super.aByteArrayArrayArray14[arg2][arg4][arg8] | 0x1);
								}
							}
							if (local36.anInt5337 != 0 && arg9 != null) {
								arg9.method1614(arg5, arg1, !local36.aBoolean405, local36.aBoolean404, arg8, arg4);
							}
							if (local36.anInt5324 != 16) {
								Static26.method367(arg2, arg4, arg8, local36.anInt5324);
							}
						} else if (arg5 == 3) {
							if (local232) {
								local1098 = new Class3_Sub2_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, local191);
								if (local1098.method5295()) {
									local1098.method5294(arg7);
								}
								local1081 = local1098;
							} else {
								local1081 = new Class3_Sub2_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg5, arg1, arg0);
							}
							local773 = Static113.method1718(arg2, arg4, arg8);
							if (local773 instanceof Class3_Sub2_Sub1) {
								((Class3_Sub2_Sub1) local773).aClass3_Sub2_1 = local1081;
							} else {
								Static53.method741(arg2, arg4, arg8, local1081, null);
							}
							if (local36.aBoolean401 && Static260.aBoolean306) {
								if (arg1 == 0) {
									local140.qa(arg4, arg8 + 1, 50);
								} else if (arg1 == 1) {
									local140.qa(arg4 + 1, arg8 - -1, 50);
								} else if (arg1 == 2) {
									local140.qa(arg4 + 1, arg8, 50);
								} else if (arg1 == 3) {
									local140.qa(arg4, arg8, 50);
								}
							}
							if (local36.anInt5337 != 0 && arg9 != null) {
								arg9.method1614(arg5, arg1, !local36.aBoolean405, local36.aBoolean404, arg8, arg4);
							}
						} else if (arg5 == 9) {
							if (local232) {
								local363 = new Class3_Sub4_Sub6(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, arg4, arg8, arg8, arg5, arg1, local191);
								local397 = local363;
								if (local363.method5295()) {
									local363.method5294(arg7);
								}
							} else {
								local397 = new Class3_Sub4_Sub5(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg4, arg4 + local59 - 1, arg8, arg8 + local62 - 1, arg5, arg1, arg0);
							}
							local651 = Static144.method2120(arg2, arg4, arg8, bn.class);
							if (local651 instanceof Class3_Sub4_Sub2 && arg4 == local651.aShort92 && local651.aShort89 == arg8) {
								((Class3_Sub4_Sub2) local651).aClass3_Sub4_1 = local397;
							} else {
								Static249.method3169(local397, false);
							}
							if (local36.anInt5337 != 0 && arg9 != null) {
								arg9.method1609(local62, arg4, local36.aBoolean404, local59, arg8, !local36.aBoolean405);
							}
							if (local36.anInt5324 != 16) {
								Static26.method367(arg2, arg4, arg8, local36.anInt5324);
							}
						} else {
							@Pc(1871) Class3_Sub3 local1871;
							if (arg5 == 4) {
								if (local232) {
									@Pc(1890) Class3_Sub3_Sub2 local1890 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, 0, 0, 0, arg5, arg1);
									local1871 = local1890;
									if (local1890.method5295()) {
										local1890.method5294(arg7);
									}
								} else {
									local1871 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, 0, 0, 0, arg5, arg1, arg0);
								}
								@Pc(1905) Class3_Sub3 local1905 = Static333.method4460(arg2, arg4, arg8);
								if (local1905 instanceof Class3_Sub3_Sub1) {
									((Class3_Sub3_Sub1) local1905).aClass3_Sub3_1 = local1871;
								} else {
									Static277.method3723(arg2, arg4, arg8, local1871, null);
								}
							} else {
								@Pc(1927) int local1927;
								@Pc(1933) Interface2 local1933;
								@Pc(2001) Class3_Sub3_Sub2 local2001;
								@Pc(2018) Class3_Sub3 local2018;
								if (arg5 == 5) {
									local1927 = 17;
									local1933 = (Interface2) Static113.method1718(arg2, arg4, arg8);
									if (local1933 != null) {
										local1927 = Static50.aClass190_1.method4218(local1933.method5292()).anInt5324 + 1;
									}
									if (local232) {
										local2001 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, 0, Static431.anIntArray579[arg1] * local1927, Static431.anIntArray578[arg1] * local1927, arg5, arg1);
										if (local2001.method5295()) {
											local2001.method5294(arg7);
										}
										local1871 = local2001;
									} else {
										local1871 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, 0, Static431.anIntArray579[arg1] * local1927, local1927 * Static431.anIntArray578[arg1], arg5, arg1, arg0);
									}
									local2018 = Static333.method4460(arg2, arg4, arg8);
									if (local2018 instanceof Class3_Sub3_Sub1) {
										((Class3_Sub3_Sub1) local2018).aClass3_Sub3_1 = local1871;
									} else {
										Static277.method3723(arg2, arg4, arg8, local1871, null);
									}
								} else if (arg5 == 6) {
									local1927 = 9;
									local1933 = (Interface2) Static113.method1718(arg2, arg4, arg8);
									if (local1933 != null) {
										local1927 = Static50.aClass190_1.method4218(local1933.method5292()).anInt5324 / 2 + 1;
									}
									if (local232) {
										local2001 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg1, Static431.anIntArray579[arg1] * local1927, local1927 * Static431.anIntArray578[arg1], arg5, arg1 + 4);
										if (local2001.method5295()) {
											local2001.method5294(arg7);
										}
										local1871 = local2001;
									} else {
										local1871 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg1, local1927 * Static29.anIntArray51[arg1], Static89.anIntArray135[arg1] * local1927, arg5, arg1 + 4, arg0);
									}
									local2018 = Static333.method4460(arg2, arg4, arg8);
									if (local2018 instanceof Class3_Sub3_Sub1) {
										((Class3_Sub3_Sub1) local2018).aClass3_Sub3_1 = local1871;
									} else {
										Static277.method3723(arg2, arg4, arg8, local1871, null);
									}
								} else if (arg5 == 7) {
									local1927 = arg1 + 2 & 0x3;
									if (local232) {
										@Pc(2180) Class3_Sub3_Sub2 local2180 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, local1927, 0, 0, arg5, local1927 + 4);
										if (local2180.method5295()) {
											local2180.method5294(arg7);
										}
										local1871 = local2180;
									} else {
										local1871 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, local1927, 0, 0, arg5, local1927 + 4, arg0);
									}
									@Pc(2218) Class3_Sub3 local2218 = Static333.method4460(arg2, arg4, arg8);
									if (local2218 instanceof Class3_Sub3_Sub1) {
										((Class3_Sub3_Sub1) local2218).aClass3_Sub3_1 = local1871;
									} else {
										Static277.method3723(arg2, arg4, arg8, local1871, null);
									}
								} else if (arg5 == 8) {
									local367 = arg1 + 2 & 0x3;
									@Pc(2244) int local2244 = 9;
									@Pc(2250) Interface2 local2250 = (Interface2) Static113.method1718(arg2, arg4, arg8);
									if (local2250 != null) {
										local2244 = Static50.aClass190_1.method4218(local2250.method5292()).anInt5324 / 2 + 1;
									}
									@Pc(2293) Class3_Sub3 local2293;
									@Pc(2312) Class3_Sub3 local2312;
									if (local232) {
										local2293 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg1, Static29.anIntArray51[arg1] * local2244, local2244 * Static89.anIntArray135[arg1], arg5, arg1 + 4);
										local2312 = new Class3_Sub3_Sub2(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg1, 0, 0, arg5, local367 + 4);
										if (local2293.method5295()) {
											local2293.method5294(arg7);
										}
										if (local2312.method5295()) {
											local2312.method5294(arg7);
										}
									} else {
										local2293 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg1, Static29.anIntArray51[arg1] * local2244, Static89.anIntArray135[arg1] * local2244, arg5, arg1 + 4, arg0);
										local2312 = new Class3_Sub3_Sub3(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg1, 0, 0, arg5, local367 + 4, arg0);
									}
									Static277.method3723(arg2, arg4, arg8, local2293, local2312);
								}
							}
						}
					}
				}
			}
		} else if (Static2.aClass148_Sub1_1.aBoolean254 || local36.anInt5357 != 0 || local36.anInt5337 == 1 || local36.aBoolean395) {
			@Pc(305) Class3_Sub5 local305;
			if (local232) {
				@Pc(295) Class3_Sub5_Sub1 local295 = new Class3_Sub5_Sub1(arg7, local36, arg3, local171, local163, local179, super.aBoolean408, arg1, local191);
				if (local295.method5295()) {
					local295.method5294(arg7);
				}
				local305 = local295;
			} else {
				local305 = new Class3_Sub5_Sub2(arg7, local36, arg2, arg3, local171, local163, local179, super.aBoolean408, arg1, arg0);
			}
			@Pc(327) Class3_Sub5 local327 = Static350.method4653(arg2, arg4, arg8);
			if (local327 instanceof Class3_Sub5_Sub3) {
				((Class3_Sub5_Sub3) local327).aClass3_Sub5_1 = local305;
			} else {
				Static392.method5009(arg2, arg4, arg8, local305);
			}
			if (local36.anInt5337 == 1 && arg9 != null) {
				arg9.method1623(arg4, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB[BILclient!za;[Lclient!et;)V")
	public void method4317(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class163 arg3, @OriginalArg(5) Class71[] arg4) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method3594();
			if (local24 == 0) {
				return;
			}
			local12 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method3588();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local10.method3580();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = local57 + arg2;
				@Pc(81) int local81 = local51 + arg0;
				if (local77 > 0 && local81 > 0 && local77 < super.anInt5448 - 1 && local81 < super.anInt5434 - 1) {
					@Pc(113) Class71 local113 = null;
					if (!super.aBoolean408) {
						@Pc(118) int local118 = local61;
						if ((Static253.aByteArrayArrayArray11[1][local77][local81] & 0x2) == 2) {
							local118 = local61 - 1;
						}
						if (local118 >= 0) {
							local113 = arg4[local118];
						}
					}
					this.method4315(-1, local73, local61, local61, local77, local69, local12, arg3, local81, local113);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!za;)V")
	public void method4318(@OriginalArg(1) Class163 arg0) {
		Static87.method5740(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt5443 > 1) {
			for (local13 = 0; local13 < super.anInt5448; local13++) {
				for (local17 = 0; super.anInt5434 > local17; local17++) {
					if ((Static253.aByteArrayArrayArray11[1][local13][local17] & 0x2) == 2) {
						Static252.method3197(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt5443 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt5434; local17++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt5448; local59++) {
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(131) int local131;
					@Pc(222) int local222;
					@Pc(231) int local231;
					@Pc(251) int local251;
					@Pc(255) int local255;
					if ((super.aByteArrayArrayArray14[local13][local59][local17] & 0x1) != 0) {
						local77 = local17;
						local79 = local17;
						local81 = local13;
						local83 = local13;
						while (local79 < super.anInt5434 && (super.aByteArrayArrayArray14[local13][local59][local79 + 1] & 0x1) != 0) {
							local79++;
						}
						while (local77 > 0 && (super.aByteArrayArrayArray14[local13][local59][local77 - 1] & 0x1) != 0) {
							local77--;
						}
						label164: while (local81 > 0) {
							for (local131 = local77; local131 <= local79; local131++) {
								if ((super.aByteArrayArrayArray14[local81 - 1][local59][local131] & 0x1) == 0) {
									break label164;
								}
							}
							local81--;
						}
						label153: while (local83 < 3) {
							for (local131 = local77; local131 <= local79; local131++) {
								if ((super.aByteArrayArrayArray14[local83 + 1][local59][local131] & 0x1) == 0) {
									break label153;
								}
							}
							local83++;
						}
						local131 = (local83 + 1 - local81) * (local79 - (local77 - 1));
						if (local131 >= 2) {
							local222 = super.anIntArrayArrayArray11[local83][local59][local77] - 240;
							local231 = super.anIntArrayArrayArray11[local81][local59][local77];
							Static168.method2368(1, local59 << 7, local59 << 7, local77 << 7, (local79 << 7) + 128, local222, local231);
							for (local251 = local81; local251 <= local83; local251++) {
								for (local255 = local77; local255 <= local79; local255++) {
									super.aByteArrayArrayArray14[local251][local59][local255] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local13][local59][local17] & 0x2) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local13;
						while (local77 > 0 && (super.aByteArrayArrayArray14[local13][local77 - 1][local17] & 0x2) != 0) {
							local77--;
						}
						local83 = local13;
						while (super.anInt5448 > local79 && (super.aByteArrayArrayArray14[local13][local79 + 1][local17] & 0x2) != 0) {
							local79++;
						}
						label217: while (local81 > 0) {
							for (local131 = local77; local131 <= local79; local131++) {
								if ((super.aByteArrayArrayArray14[local81 - 1][local131][local17] & 0x2) == 0) {
									break label217;
								}
							}
							local81--;
						}
						label206: while (local83 < 3) {
							for (local131 = local77; local131 <= local79; local131++) {
								if ((super.aByteArrayArrayArray14[local83 + 1][local131][local17] & 0x2) == 0) {
									break label206;
								}
							}
							local83++;
						}
						local131 = (local83 + 1 - local81) * (local79 + 1 - local77);
						if (local131 >= 2) {
							local222 = super.anIntArrayArrayArray11[local83][local77][local17] - 240;
							local231 = super.anIntArrayArrayArray11[local81][local77][local17];
							Static168.method2368(2, local77 << 7, (local79 << 7) + 128, local17 << 7, local17 << 7, local222, local231);
							for (local251 = local81; local251 <= local83; local251++) {
								for (local255 = local77; local255 <= local79; local255++) {
									super.aByteArrayArrayArray14[local251][local255][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local13][local59][local17] & 0x4) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local17;
						local83 = local17;
						while (local81 > 0 && (super.aByteArrayArrayArray14[local13][local59][local81 - 1] & 0x4) != 0) {
							local81--;
						}
						while (super.anInt5434 > local83 && (super.aByteArrayArrayArray14[local13][local59][local83 + 1] & 0x4) != 0) {
							local83++;
						}
						label271: while (local77 > 0) {
							for (local131 = local81; local131 <= local83; local131++) {
								if ((super.aByteArrayArrayArray14[local13][local77 - 1][local131] & 0x4) == 0) {
									break label271;
								}
							}
							local77--;
						}
						label260: while (local79 < super.anInt5448) {
							for (local131 = local81; local131 <= local83; local131++) {
								if ((super.aByteArrayArrayArray14[local13][local79 + 1][local131] & 0x4) == 0) {
									break label260;
								}
							}
							local79++;
						}
						if ((local83 + 1 - local81) * (local79 + 1 - local77) >= 4) {
							local131 = super.anIntArrayArrayArray11[local13][local77][local81];
							Static168.method2368(4, local77 << 7, (local79 << 7) + 128, local81 << 7, (local83 << 7) + 128, local131, local131);
							for (@Pc(691) int local691 = local77; local691 <= local79; local691++) {
								for (local222 = local81; local222 <= local83; local222++) {
									super.aByteArrayArrayArray14[local13][local691][local222] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([BIIIIIILclient!za;IZ[Lclient!et;)V")
	public void method4319(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class163 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class71[] arg9) {
		@Pc(16) Class2_Sub13 local16 = new Class2_Sub13(arg0);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method3594();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local16.method3588();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local16.method3580();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (arg4 == local56 && local52 >= arg3 && local52 < arg3 + 8 && arg6 <= local46 && local46 < arg6 + 8) {
					@Pc(108) Class192 local108 = Static50.aClass190_1.method4218(local18);
					@Pc(125) int local125 = Static276.method3717(local68, local46 & 0x7, local108.anInt5355, local108.anInt5321, arg2, local52 & 0x7) + arg1;
					@Pc(143) int local143 = arg5 + Static51.method706(local68, arg2, local46 & 0x7, local108.anInt5355, local52 & 0x7, local108.anInt5321);
					if (local125 > 0 && local143 > 0 && super.anInt5448 - 1 > local125 && super.anInt5434 - 1 > local143) {
						@Pc(168) Class71 local168 = null;
						if (!super.aBoolean408) {
							@Pc(173) int local173 = arg8;
							if ((Static253.aByteArrayArrayArray11[1][local125][local143] & 0x2) == 2) {
								local173 = arg8 - 1;
							}
							if (local173 >= 0) {
								local168 = arg9[local173];
							}
						}
						this.method4315(-1, arg2 + local68 & 0x3, arg8, arg8, local125, local64, local18, arg7, local143, local168);
					}
				}
			}
		}
	}
}
