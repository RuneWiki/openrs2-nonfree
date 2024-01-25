import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
	public int anInt6080 = 99;

	static {
		new Class96("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIZ)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static135.aClass123_2, Static121.aClass104_2);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!qa;IILclient!oe;III)V")
	public void method4804(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(12) Interface11 local12 = null;
		if (arg2 == 0) {
			local12 = (Interface11) Static208.method3165(arg5, arg4, arg1);
		}
		if (arg2 == 1) {
			local12 = (Interface11) Static170.method2638(arg5, arg4, arg1);
		}
		if (arg2 == 2) {
			local12 = (Interface11) Static286.method3918(arg5, arg4, arg1, rq.class);
		}
		if (arg2 == 3) {
			local12 = (Interface11) Static112.method1764(arg5, arg4, arg1);
		}
		if (local12 == null) {
			return;
		}
		@Pc(64) Class29 local64 = Static251.aClass207_2.method4977(local12.method5744());
		@Pc(68) int local68 = local12.method5747();
		@Pc(72) int local72 = local12.method5742();
		if (local64.method467()) {
			Static253.method851(arg5, local64, arg4, arg1);
		}
		if (local12.method5740()) {
			local12.method5741(arg0);
		}
		if (arg2 == 0) {
			@Pc(97) Class47_Sub2 local97 = Static208.method3165(arg5, arg4, arg1);
			if (local97 instanceof Class47_Sub2_Sub2) {
				((Class47_Sub2_Sub2) local97).aClass47_Sub2_3 = null;
			} else {
				Static284.method3907(arg5, arg4, arg1);
			}
			if (local64.anInt551 != 0) {
				arg3.method3875(local68, arg4, !local64.aBoolean43, local72, local64.aBoolean40, arg1);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			@Pc(137) Class47_Sub4 local137 = Static170.method2638(arg5, arg4, arg1);
			if (!(local137 instanceof Class47_Sub4_Sub2)) {
				Static91.method4796(arg5, arg4, arg1);
				return;
			}
			((Class47_Sub4_Sub2) local137).aClass47_Sub4_3 = null;
			return;
		}
		if (arg2 == 2) {
			@Pc(168) Class47_Sub1 local168 = Static286.method3918(arg5, arg4, arg1, rq.class);
			if (local168 instanceof Class47_Sub1_Sub4 && local168.aShort104 == arg4 && local168.aShort105 == arg1) {
				((Class47_Sub1_Sub4) local168).aClass47_Sub1_1 = null;
			} else {
				Static201.method3103(arg5, arg4, arg1, rq.class);
			}
			if (local64.anInt551 != 0 && super.anInt6066 > local64.anInt532 + arg4 && arg1 + local64.anInt532 < super.anInt6059 && super.anInt6066 > local64.anInt542 + arg4 && arg1 + local64.anInt542 < super.anInt6059) {
				arg3.method3876(local64.aBoolean40, local72, arg1, !local64.aBoolean43, local64.anInt542, local64.anInt532, arg4);
				return;
			}
			return;
		}
		if (arg2 != 3) {
			return;
		}
		@Pc(269) Class47_Sub5 local269 = Static112.method1764(arg5, arg4, arg1);
		if (local269 instanceof Class47_Sub5_Sub3) {
			((Class47_Sub5_Sub3) local269).aClass47_Sub5_2 = null;
		} else {
			Static58.method897(arg5, arg4, arg1);
		}
		if (local64.anInt551 == 1) {
			arg3.method3880(arg1, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!ti;BLclient!qa;[III)V")
	public void method4805(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean488) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(23) Class241 local23 = null;
		while (true) {
			while (true) {
				while (true) {
					@Pc(28) int local28;
					@Pc(71) int local71;
					@Pc(503) int local503;
					@Pc(89) int local89;
					@Pc(93) int local93;
					while (arg0.aByteArray65.length > arg0.anInt5695) {
						local28 = arg0.method4548();
						if (local28 == 0) {
							local23 = new Class241(arg0);
						} else {
							@Pc(95) int local95;
							@Pc(116) int local116;
							@Pc(376) int local376;
							if (local28 == 1) {
								local71 = arg0.method4548();
								if (local71 > 0) {
									for (local503 = 0; local503 < local71; local503++) {
										@Pc(512) Class253 local512 = new Class253(arg1, arg0, 0);
										if (local512.anInt7491 == 31) {
											@Pc(525) Class219 local525 = Static40.aClass165_1.method3595(arg0.method4498());
											local512.method5771(local525.anInt6610, local525.anInt6606, local525.anInt6611, local525.anInt6612);
										}
										if (arg1.method4572() > 0) {
											@Pc(545) Class1_Sub12 local545 = local512.aClass1_Sub12_2;
											local95 = (arg4 << 7) + local545.method3182();
											local116 = (arg3 << 7) + local545.method3181();
											local376 = local95 >> 7;
											@Pc(569) int local569 = local116 >> 7;
											if (local376 >= 0 && local569 >= 0 && local376 < super.anInt6066 && local569 < super.anInt6059) {
												local545.method3185(local95, super.anIntArrayArrayArray106[local512.anInt7485][local376][local569] - local545.method3186(), local116);
												if (arg1.method4572() > 0) {
													Static93.method1458(local512);
												}
											}
										}
									}
								}
							} else if (local28 == 2) {
								if (local23 == null) {
									local23 = new Class241();
								}
								local23.method5497(arg0);
							} else if (local28 != 128) {
								if (local28 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								local11 = true;
								for (local71 = 0; local71 < 4; local71++) {
									@Pc(77) byte local77 = arg0.method4529();
									if (local77 == 0 && super.aByteArrayArrayArray13[local71] != null) {
										local89 = arg4;
										local93 = arg4 + 64;
										local95 = arg3;
										if (arg4 < 0) {
											local89 = 0;
										} else if (arg4 >= super.anInt6066) {
											local89 = super.anInt6066;
										}
										local116 = arg3 + 64;
										if (arg3 < 0) {
											local95 = 0;
										} else if (arg3 >= super.anInt6059) {
											local95 = super.anInt6059;
										}
										if (local93 < 0) {
											local93 = 0;
										} else if (local93 >= super.anInt6066) {
											local93 = super.anInt6066;
										}
										if (local116 < 0) {
											local116 = 0;
										} else if (local116 >= super.anInt6059) {
											local116 = super.anInt6059;
										}
										while (local93 > local89) {
											while (local95 < local116) {
												super.aByteArrayArrayArray13[local71][local89][local95] = 0;
												local95++;
											}
											local89++;
										}
									} else if (local77 == 1) {
										if (super.aByteArrayArrayArray13[local71] == null) {
											super.aByteArrayArrayArray13[local71] = new byte[super.anInt6066 + 1][super.anInt6059 + 1];
										}
										for (local89 = 0; local89 < 64; local89 += 4) {
											for (local93 = 0; local93 < 64; local93 += 4) {
												@Pc(366) byte local366 = arg0.method4529();
												for (local116 = arg4 + local89; local116 < arg4 + local89 + 4; local116++) {
													for (local376 = arg3 + local93; local376 < arg3 + local93 + 4; local376++) {
														if (local116 >= 0 && local116 < super.anInt6066 && local376 >= 0 && super.anInt6059 > local376) {
															super.aByteArrayArrayArray13[local71][local116][local376] = local366;
														}
													}
												}
											}
										}
									} else if (local77 == 2) {
										if (super.aByteArrayArrayArray13[local71] == null) {
											super.aByteArrayArrayArray13[local71] = new byte[super.anInt6066 + 1][super.anInt6059 + 1];
										}
										if (local71 > 0) {
											local89 = arg4;
											local93 = arg4 + 64;
											local95 = arg3;
											local116 = arg3 + 64;
											if (arg4 < 0) {
												local89 = 0;
											} else if (arg4 >= super.anInt6066) {
												local89 = super.anInt6066;
											}
											if (arg3 < 0) {
												local95 = 0;
											} else if (super.anInt6059 <= arg3) {
												local95 = super.anInt6059;
											}
											if (local93 < 0) {
												local93 = 0;
											} else if (super.anInt6066 <= local93) {
												local93 = super.anInt6066;
											}
											if (local116 < 0) {
												local116 = 0;
											} else if (local116 >= super.anInt6059) {
												local116 = super.anInt6059;
											}
											while (local89 < local93) {
												while (local95 < local116) {
													super.aByteArrayArrayArray13[local71][local89][local95] = super.aByteArrayArrayArray13[local71 - 1][local89][local95];
													local95++;
												}
												local89++;
											}
										}
									}
								}
							} else if (arg2 == null) {
								arg0.anInt5695 += 10;
							} else {
								arg2[0] = arg0.method4498();
								arg2[1] = arg0.method4531();
								arg2[2] = arg0.method4531();
								arg2[3] = arg0.method4531();
								arg2[4] = arg0.method4498();
							}
						}
					}
					if (local23 != null) {
						for (local28 = 0; local28 < 8; local28++) {
							for (local71 = 0; local71 < 8; local71++) {
								local503 = (arg4 >> 3) + local28;
								local89 = local71 + (arg3 >> 3);
								if (local503 >= 0 && super.anInt6066 >> 3 > local503 && local89 >= 0 && super.anInt6059 >> 3 > local89) {
									Static175.method4316(local503, local23, local89);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray13 != null) {
						for (local28 = 0; local28 < 4; local28++) {
							if (super.aByteArrayArrayArray13[local28] != null) {
								for (local71 = 0; local71 < 16; local71++) {
									for (local503 = 0; local503 < 16; local503++) {
										local89 = (arg4 >> 2) + local71;
										local93 = local503 + (arg3 >> 2);
										if (local89 >= 0 && local89 < 26 && local93 >= 0 && local93 < 26) {
											super.aByteArrayArrayArray13[local28][local89][local93] = 0;
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
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIBI[Lclient!oe;Lclient!qa;[BIII)V")
	public void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class181[] arg4, @OriginalArg(6) Class121 arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg6);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method4507();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local10.method4521();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(59) int local59 = local40 & 0x3F;
				@Pc(65) int local65 = local40 >> 6 & 0x3F;
				@Pc(69) int local69 = local40 >> 12;
				@Pc(73) int local73 = local10.method4548();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (arg0 == local69 && local65 >= arg3 && arg3 + 8 > local65 && local59 >= arg9 && local59 < arg9 + 8) {
					@Pc(113) Class29 local113 = Static251.aClass207_2.method4977(local28);
					@Pc(130) int local130 = Static73.method1098(local113.anInt532, local65 & 0x7, local113.anInt542, arg8, local81, local59 & 0x7) + arg2;
					@Pc(147) int local147 = arg7 + Static3.method37(local113.anInt542, local59 & 0x7, arg8, local113.anInt532, local81, local65 & 0x7);
					if (local130 > 0 && local147 > 0 && local130 < super.anInt6066 - 1 && super.anInt6059 - 1 > local147) {
						@Pc(176) Class181 local176 = null;
						if (!super.aBoolean488) {
							@Pc(181) int local181 = arg1;
							if ((Static228.aByteArrayArrayArray8[1][local130][local147] & 0x2) == 2) {
								local181 = arg1 - 1;
							}
							if (local181 >= 0) {
								local176 = arg4[local181];
							}
						}
						this.method4812(arg8 + local81 & 0x3, local77, local176, local28, local130, local147, -1, arg1, arg1, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([Lclient!oe;BI[BLclient!qa;I)V")
	public void method4807(@OriginalArg(0) Class181[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) int arg4) {
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method4507();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method4521();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local18.method4548();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(78) int local78 = local57 + arg1;
				@Pc(83) int local83 = local51 + arg4;
				if (local78 > 0 && local83 > 0 && local78 < super.anInt6066 - 1 && local83 < super.anInt6059 - 1) {
					@Pc(104) Class181 local104 = null;
					if (!super.aBoolean488) {
						@Pc(109) int local109 = local61;
						if ((Static228.aByteArrayArrayArray8[1][local78][local83] & 0x2) == 2) {
							local109 = local61 - 1;
						}
						if (local109 >= 0) {
							local104 = arg0[local109];
						}
					}
					this.method4812(local73, local69, local104, local20, local78, local83, -1, local61, local61, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIBIIIILclient!ti;[ILclient!qa;I)V")
	public void method4808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub14 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class121 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean488) {
			return;
		}
		@Pc(13) Class241 local13 = null;
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(41) int local41 = (arg4 & 0x7) * 8;
		@Pc(47) int local47 = (arg2 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(52) int local52;
					@Pc(92) int local92;
					@Pc(435) int local435;
					@Pc(110) int local110;
					while (arg6.aByteArray65.length > arg6.anInt5695) {
						local52 = arg6.method4548();
						if (local52 == 0) {
							local13 = new Class241(arg6);
						} else {
							@Pc(116) int local116;
							@Pc(169) int local169;
							@Pc(262) int local262;
							@Pc(300) int local300;
							if (local52 == 1) {
								local92 = arg6.method4548();
								if (local92 > 0) {
									for (local435 = 0; local435 < local92; local435++) {
										@Pc(444) Class253 local444 = new Class253(arg8, arg6, 0);
										if (local444.anInt7491 == 31) {
											@Pc(461) Class219 local461 = Static40.aClass165_1.method3595(arg6.method4498());
											local444.method5771(local461.anInt6610, local461.anInt6606, local461.anInt6611, local461.anInt6612);
										}
										if (arg8.method4572() > 0) {
											@Pc(481) Class1_Sub12 local481 = local444.aClass1_Sub12_2;
											local116 = local481.method3182() >> 7;
											local169 = local481.method3181() >> 7;
											if (local444.anInt7485 == arg0 && local41 <= local116 && local116 < local41 + 8 && local47 <= local169 && local47 + 8 > local169) {
												local262 = Static430.method5802(arg3, local481.method3182() & 0x3FF, local481.method3181() & 0x3FF) + (arg9 << 7);
												local116 = local262 >> 7;
												local300 = Static153.method3785(local481.method3182() & 0x3FF, arg3, local481.method3181() & 0x3FF) + (arg5 << 7);
												local169 = local300 >> 7;
												if (local116 >= 0 && local169 >= 0 && local116 < super.anInt6066 && super.anInt6059 > local169) {
													local481.method3185(local262, super.anIntArrayArrayArray106[arg0][local116][local169] - local481.method3186(), local300);
													if (arg8.method4572() > 0) {
														Static93.method1458(local444);
													}
												}
											}
										}
									}
								}
							} else if (local52 == 2) {
								if (local13 == null) {
									local13 = new Class241();
								}
								local13.method5497(arg6);
							} else if (local52 != 128) {
								if (local52 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								for (local92 = 0; local92 < 4; local92++) {
									@Pc(98) byte local98 = arg6.method4529();
									@Pc(114) int local114;
									if (local98 == 0 && super.aByteArrayArrayArray13[arg1] != null) {
										if (local92 <= arg0) {
											local110 = arg9;
											local114 = arg9 + 7;
											local116 = arg5;
											if (arg9 < 0) {
												local110 = 0;
											} else if (arg9 >= super.anInt6066) {
												local110 = super.anInt6066;
											}
											if (local114 < 0) {
												local114 = 0;
											} else if (super.anInt6066 <= local114) {
												local114 = super.anInt6066;
											}
											if (arg5 < 0) {
												local116 = 0;
											} else if (arg5 >= super.anInt6059) {
												local116 = super.anInt6059;
											}
											local169 = arg5 + 7;
											if (local169 < 0) {
												local169 = 0;
											} else if (super.anInt6059 <= local169) {
												local169 = super.anInt6059;
											}
											while (local110 < local114) {
												while (local169 > local116) {
													super.aByteArrayArrayArray13[arg1][local110][local116] = 0;
													local116++;
												}
												local110++;
											}
										}
									} else if (local98 == 1) {
										if (super.aByteArrayArrayArray13[arg1] == null) {
											super.aByteArrayArrayArray13[arg1] = new byte[super.anInt6066 + 1][super.anInt6059 + 1];
										}
										for (local110 = 0; local110 < 64; local110 += 4) {
											for (local114 = 0; local114 < 64; local114 += 4) {
												@Pc(249) byte local249 = arg6.method4529();
												if (local92 <= arg0) {
													for (local169 = local110; local169 < local110 + 4; local169++) {
														for (local262 = local114; local262 < local114 + 4; local262++) {
															if (local41 <= local169 && local41 + 8 > local169 && local47 <= local262 && local47 + 8 > local47) {
																local300 = arg9 + Static73.method1099(arg3, local262 & 0x7, local169 & 0x7);
																@Pc(312) int local312 = arg5 + Static453.method2830(arg3, local169 & 0x7, local262 & 0x7);
																if (local300 >= 0 && super.anInt6066 > local300 && local312 >= 0 && local312 < super.anInt6059) {
																	super.aByteArrayArrayArray13[arg1][local300][local312] = local249;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg7 == null) {
								arg6.anInt5695 += 10;
							} else {
								arg7[0] = arg6.method4498();
								arg7[1] = arg6.method4531();
								arg7[2] = arg6.method4531();
								arg7[3] = arg6.method4531();
								arg7[4] = arg6.method4498();
							}
						}
					}
					if (local13 != null) {
						Static175.method4316(arg9 >> 3, local13, arg5 >> 3);
					}
					if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg1] != null) {
						local52 = arg9 + 7;
						local92 = arg5 + 7;
						for (local435 = arg9; local435 < local52; local435++) {
							for (local110 = arg5; local110 < local92; local110++) {
								super.aByteArrayArrayArray13[arg1][local435][local110] = 0;
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!oe;ZIIIIIILclient!qa;)V")
	public void method4812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class121 arg9) {
		if (!Static327.aClass230_Sub1_1.method5644(Static146.anInt2664) && !Static17.method239(arg4, Static29.anInt483, arg5, arg8)) {
			return;
		}
		if (arg7 < this.anInt6080) {
			this.anInt6080 = arg7;
		}
		@Pc(34) Class29 local34 = Static251.aClass207_2.method4977(arg3);
		if (arg9.method4645() && Static327.aClass230_Sub1_1.aBoolean617 && local34.aBoolean50) {
			return;
		}
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg0 == 1 || arg0 == 3) {
			local57 = local34.anInt532;
			local60 = local34.anInt542;
		} else {
			local57 = local34.anInt542;
			local60 = local34.anInt532;
		}
		@Pc(93) int local93;
		@Pc(87) int local87;
		if (super.anInt6066 >= local60 + arg4) {
			local87 = arg4 + (local60 + 1 >> 1);
			local93 = (local60 >> 1) + arg4;
		} else {
			local93 = arg4;
			local87 = arg4 + 1;
		}
		@Pc(118) int local118;
		@Pc(116) int local116;
		if (arg5 + local57 > super.anInt6059) {
			local116 = arg5 + 1;
			local118 = arg5;
		} else {
			local118 = (local57 >> 1) + arg5;
			local116 = (local57 + 1 >> 1) + arg5;
		}
		@Pc(138) Class70 local138 = Static256.aClass70Array2[arg8];
		@Pc(162) int local162 = local138.I(local93, local118) + local138.I(local87, local118) + local138.I(local93, local116) + local138.I(local87, local116) >> 2;
		@Pc(170) int local170 = (local60 << 6) + (arg4 << 7);
		@Pc(178) int local178 = (local57 << 6) + (arg5 << 7);
		@Pc(190) boolean local190 = Static425.aBoolean635 && !super.aBoolean488 && local34.aBoolean47;
		if (local34.method467()) {
			Static174.method2767(arg7, null, arg4, local34, arg0, null, arg5);
		}
		@Pc(225) boolean local225 = arg6 == -1 && local34.anInt556 == -1 && local34.anIntArray33 == null && local34.anIntArray36 == null && !local34.aBoolean51;
		if (Static61.aBoolean95 && (Static273.method3792(arg1) && local34.anInt570 != 1 || !(!Static309.method4243(arg1) || local34.anInt570 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(386) Class47_Sub1 local386;
			@Pc(348) Class47_Sub1_Sub2 local348;
			@Pc(382) int local382;
			if (arg1 == 10 || arg1 == 11) {
				local348 = null;
				if (local225) {
					@Pc(378) Class47_Sub1_Sub2 local378 = new Class47_Sub1_Sub2(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, arg4 + local60 - 1, arg5, local57 + arg5 - 1, arg1, arg0, local190);
					local382 = local378.method891();
					local348 = local378;
					local386 = local378;
				} else {
					local382 = 15;
					local386 = new Class47_Sub1_Sub6(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, local60 + arg4 - 1, arg5, arg5 + local57 - 1, arg1, arg0, arg6);
				}
				@Pc(431) Class47_Sub1 local431 = Static286.method3918(arg7, arg4, arg5, rq.class);
				@Pc(433) boolean local433 = false;
				if (local431 instanceof Class47_Sub1_Sub4 && local431.aShort104 == arg4 && arg5 == local431.aShort105) {
					((Class47_Sub1_Sub4) local431).aClass47_Sub1_1 = local386;
					local433 = true;
				}
				if (local433 || Static97.method1543(local386, false)) {
					if (local348 != null && local348.method5740()) {
						local348.method5743(arg9);
					}
					if (local34.aBoolean41 && Static425.aBoolean635) {
						if (local382 > 30) {
							local382 = 30;
						}
						for (@Pc(486) int local486 = 0; local486 <= local60; local486++) {
							for (@Pc(490) int local490 = 0; local490 <= local57; local490++) {
								local138.QA(arg4 + local486, local490 + arg5, local382);
							}
						}
					}
				}
				if (local34.anInt551 != 0 && arg2 != null) {
					arg2.method3873(local57, arg5, local60, !local34.aBoolean43, arg4, local34.aBoolean40);
				}
			} else {
				@Pc(637) Class47_Sub1 local637;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local225) {
						local348 = new Class47_Sub1_Sub2(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, local60 + arg4 - 1, arg5, arg5 + local57 - 1, arg1, arg0, local190);
						local386 = local348;
						if (local348.method5740()) {
							local348.method5743(arg9);
						}
					} else {
						local386 = new Class47_Sub1_Sub6(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, arg4 + local60 - 1, arg5, arg5 + local57 - 1, arg1, arg0, arg6);
					}
					local637 = Static286.method3918(arg7, arg4, arg5, rq.class);
					if (local637 instanceof Class47_Sub1_Sub4 && arg4 == local637.aShort104 && arg5 == local637.aShort105) {
						((Class47_Sub1_Sub4) local637).aClass47_Sub1_1 = local386;
					} else {
						Static97.method1543(local386, false);
					}
					if (Static425.aBoolean635 && !super.aBoolean488 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0 && local34.anInt570 != 0) {
						super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x4);
					}
					if (local34.anInt551 != 0 && arg2 != null) {
						arg2.method3873(local57, arg5, local60, !local34.aBoolean43, arg4, local34.aBoolean40);
					}
				} else {
					@Pc(762) Class47_Sub2 local762;
					if (arg1 == 0) {
						@Pc(736) int local736 = local34.anInt570;
						if (Static151.aBoolean220 && local34.anInt570 == -1) {
							local736 = 1;
						}
						if (local225) {
							@Pc(779) Class47_Sub2_Sub1 local779 = new Class47_Sub2_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, local190);
							if (local779.method5740()) {
								local779.method5743(arg9);
							}
							local762 = local779;
						} else {
							local762 = new Class47_Sub2_Sub3(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, arg6);
						}
						@Pc(794) Class47_Sub2 local794 = Static208.method3165(arg7, arg4, arg5);
						if (local794 instanceof Class47_Sub2_Sub2) {
							((Class47_Sub2_Sub2) local794).aClass47_Sub2_3 = local762;
						} else {
							Static302.method4112(arg7, arg4, arg5, local762, null);
						}
						if (Static425.aBoolean635) {
							if (arg0 == 0) {
								if (local34.aBoolean41) {
									local138.QA(arg4, arg5, 50);
									local138.QA(arg4, arg5 + 1, 50);
								}
								if (local736 == 1 && !super.aBoolean488) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local34.aBoolean41) {
									local138.QA(arg4, arg5 + 1, 50);
									local138.QA(arg4 + 1, arg5 + 1, 50);
								}
								if (local736 == 1 && !super.aBoolean488) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local34.aBoolean41) {
									local138.QA(arg4 + 1, arg5, 50);
									local138.QA(arg4 + 1, arg5 + 1, 50);
								}
								if (local736 == 1 && !super.aBoolean488) {
									super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local34.aBoolean41) {
									local138.QA(arg4, arg5, 50);
									local138.QA(arg4 + 1, arg5, 50);
								}
								if (local736 == 1 && !super.aBoolean488) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x2);
								}
							}
						}
						if (local34.anInt551 != 0 && arg2 != null) {
							arg2.method3868(arg0, arg1, local34.aBoolean40, arg4, arg5, !local34.aBoolean43);
						}
						if (local34.anInt528 != 16) {
							Static347.method4987(arg7, arg4, arg5, local34.anInt528);
						}
					} else {
						@Pc(1090) Class47_Sub2_Sub1 local1090;
						@Pc(1073) Class47_Sub2 local1073;
						if (arg1 == 1) {
							if (local225) {
								local1090 = new Class47_Sub2_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, local190);
								local1073 = local1090;
								if (local1090.method5740()) {
									local1090.method5743(arg9);
								}
							} else {
								local1073 = new Class47_Sub2_Sub3(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, arg6);
							}
							local762 = Static208.method3165(arg7, arg4, arg5);
							if (local762 instanceof Class47_Sub2_Sub2) {
								((Class47_Sub2_Sub2) local762).aClass47_Sub2_3 = local1073;
							} else {
								Static302.method4112(arg7, arg4, arg5, local1073, null);
							}
							if (local34.aBoolean41 && Static425.aBoolean635) {
								if (arg0 == 0) {
									local138.QA(arg4, arg5 + 1, 50);
								} else if (arg0 == 1) {
									local138.QA(arg4 + 1, arg5 + 1, 50);
								} else if (arg0 == 2) {
									local138.QA(arg4 + 1, arg5, 50);
								} else if (arg0 == 3) {
									local138.QA(arg4, arg5, 50);
								}
							}
							if (local34.anInt551 != 0 && arg2 != null) {
								arg2.method3868(arg0, arg1, local34.aBoolean40, arg4, arg5, !local34.aBoolean43);
							}
						} else if (arg1 == 2) {
							local382 = arg0 + 1 & 0x3;
							if (local225) {
								@Pc(1262) Class47_Sub2_Sub1 local1262 = new Class47_Sub2_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0 + 4, local190);
								@Pc(1277) Class47_Sub2_Sub1 local1277 = new Class47_Sub2_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg1, local382, local190);
								if (local1262.method5740()) {
									local1262.method5743(arg9);
								}
								local762 = local1277;
								local1073 = local1262;
								if (local1277.method5740()) {
									local1277.method5743(arg9);
								}
							} else {
								local1073 = new Class47_Sub2_Sub3(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0 + 4, arg6);
								local762 = new Class47_Sub2_Sub3(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg1, local382, arg6);
							}
							Static302.method4112(arg7, arg4, arg5, local1073, local762);
							if (local34.anInt570 == 1 && Static425.aBoolean635 && !super.aBoolean488) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x1);
									super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x2);
									super.aByteArrayArrayArray10[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray10[arg7][arg4][arg5] | 0x1);
								}
							}
							if (local34.anInt551 != 0 && arg2 != null) {
								arg2.method3868(arg0, arg1, local34.aBoolean40, arg4, arg5, !local34.aBoolean43);
							}
							if (local34.anInt528 != 16) {
								Static347.method4987(arg7, arg4, arg5, local34.anInt528);
							}
						} else if (arg1 == 3) {
							if (local225) {
								local1090 = new Class47_Sub2_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, local190);
								local1073 = local1090;
								if (local1090.method5740()) {
									local1090.method5743(arg9);
								}
							} else {
								local1073 = new Class47_Sub2_Sub3(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg1, arg0, arg6);
							}
							local762 = Static208.method3165(arg7, arg4, arg5);
							if (local762 instanceof Class47_Sub2_Sub2) {
								((Class47_Sub2_Sub2) local762).aClass47_Sub2_3 = local1073;
							} else {
								Static302.method4112(arg7, arg4, arg5, local1073, null);
							}
							if (local34.aBoolean41 && Static425.aBoolean635) {
								if (arg0 == 0) {
									local138.QA(arg4, arg5 + 1, 50);
								} else if (arg0 == 1) {
									local138.QA(arg4 + 1, arg5 + 1, 50);
								} else if (arg0 == 2) {
									local138.QA(arg4 + 1, arg5, 50);
								} else if (arg0 == 3) {
									local138.QA(arg4, arg5, 50);
								}
							}
							if (local34.anInt551 != 0 && arg2 != null) {
								arg2.method3868(arg0, arg1, local34.aBoolean40, arg4, arg5, !local34.aBoolean43);
							}
						} else if (arg1 == 9) {
							if (local225) {
								local348 = new Class47_Sub1_Sub2(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, arg4, arg5, arg5, arg1, arg0, local190);
								if (local348.method5740()) {
									local348.method5743(arg9);
								}
								local386 = local348;
							} else {
								local386 = new Class47_Sub1_Sub6(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg4, arg4 + local60 - 1, arg5, local57 + arg5 - 1, arg1, arg0, arg6);
							}
							local637 = Static286.method3918(arg7, arg4, arg5, rq.class);
							if (local637 instanceof Class47_Sub1_Sub4 && arg4 == local637.aShort104 && local637.aShort105 == arg5) {
								((Class47_Sub1_Sub4) local637).aClass47_Sub1_1 = local386;
							} else {
								Static97.method1543(local386, false);
							}
							if (local34.anInt551 != 0 && arg2 != null) {
								arg2.method3873(local57, arg5, local60, !local34.aBoolean43, arg4, local34.aBoolean40);
							}
							if (local34.anInt528 != 16) {
								Static347.method4987(arg7, arg4, arg5, local34.anInt528);
							}
						} else {
							@Pc(1850) Class47_Sub4 local1850;
							if (arg1 == 4) {
								if (local225) {
									@Pc(1840) Class47_Sub4_Sub3 local1840 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, 0, 0, 0, arg1, arg0);
									if (local1840.method5740()) {
										local1840.method5743(arg9);
									}
									local1850 = local1840;
								} else {
									local1850 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, 0, 0, 0, arg1, arg0, arg6);
								}
								@Pc(1876) Class47_Sub4 local1876 = Static170.method2638(arg7, arg4, arg5);
								if (local1876 instanceof Class47_Sub4_Sub2) {
									((Class47_Sub4_Sub2) local1876).aClass47_Sub4_3 = local1850;
								} else {
									Static375.method5902(arg7, arg4, arg5, local1850, null);
								}
							} else {
								@Pc(1896) int local1896;
								@Pc(1902) Interface11 local1902;
								@Pc(1970) Class47_Sub4_Sub3 local1970;
								@Pc(1985) Class47_Sub4 local1985;
								if (arg1 == 5) {
									local1896 = 17;
									local1902 = (Interface11) Static208.method3165(arg7, arg4, arg5);
									if (local1902 != null) {
										local1896 = Static251.aClass207_2.method4977(local1902.method5744()).anInt528 + 1;
									}
									if (local225) {
										local1970 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, 0, Static245.anIntArray334[arg0] * local1896, local1896 * Class196.lb[arg0], arg1, arg0);
										if (local1970.method5740()) {
											local1970.method5743(arg9);
										}
										local1850 = local1970;
									} else {
										local1850 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, 0, Static245.anIntArray334[arg0] * local1896, local1896 * Class196.lb[arg0], arg1, arg0, arg6);
									}
									local1985 = Static170.method2638(arg7, arg4, arg5);
									if (local1985 instanceof Class47_Sub4_Sub2) {
										((Class47_Sub4_Sub2) local1985).aClass47_Sub4_3 = local1850;
									} else {
										Static375.method5902(arg7, arg4, arg5, local1850, null);
									}
								} else if (arg1 == 6) {
									local1896 = 9;
									local1902 = (Interface11) Static208.method3165(arg7, arg4, arg5);
									if (local1902 != null) {
										local1896 = Static251.aClass207_2.method4977(local1902.method5744()).anInt528 / 2 + 1;
									}
									if (local225) {
										local1970 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg0, local1896 * Static245.anIntArray334[arg0], local1896 * Class196.lb[arg0], arg1, arg0 + 4);
										if (local1970.method5740()) {
											local1970.method5743(arg9);
										}
										local1850 = local1970;
									} else {
										local1850 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg0, local1896 * Static234.anIntArray322[arg0], local1896 * Static345.anIntArray458[arg0], arg1, arg0 + 4, arg6);
									}
									local1985 = Static170.method2638(arg7, arg4, arg5);
									if (local1985 instanceof Class47_Sub4_Sub2) {
										((Class47_Sub4_Sub2) local1985).aClass47_Sub4_3 = local1850;
									} else {
										Static375.method5902(arg7, arg4, arg5, local1850, null);
									}
								} else if (arg1 == 7) {
									local1896 = arg0 + 2 & 0x3;
									if (local225) {
										@Pc(2172) Class47_Sub4_Sub3 local2172 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, local1896, 0, 0, arg1, local1896 + 4);
										if (local2172.method5740()) {
											local2172.method5743(arg9);
										}
										local1850 = local2172;
									} else {
										local1850 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, local1896, 0, 0, arg1, local1896 + 4, arg6);
									}
									@Pc(2187) Class47_Sub4 local2187 = Static170.method2638(arg7, arg4, arg5);
									if (local2187 instanceof Class47_Sub4_Sub2) {
										((Class47_Sub4_Sub2) local2187).aClass47_Sub4_3 = local1850;
									} else {
										Static375.method5902(arg7, arg4, arg5, local1850, null);
									}
								} else if (arg1 == 8) {
									local382 = arg0 + 2 & 0x3;
									@Pc(2215) int local2215 = 9;
									@Pc(2221) Interface11 local2221 = (Interface11) Static208.method3165(arg7, arg4, arg5);
									if (local2221 != null) {
										local2215 = Static251.aClass207_2.method4977(local2221.method5744()).anInt528 / 2 + 1;
									}
									@Pc(2264) Class47_Sub4 local2264;
									@Pc(2283) Class47_Sub4 local2283;
									if (local225) {
										local2264 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg0, local2215 * Static234.anIntArray322[arg0], Static345.anIntArray458[arg0] * local2215, arg1, arg0 + 4);
										local2283 = new Class47_Sub4_Sub3(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg0, 0, 0, arg1, local382 + 4);
										if (local2264.method5740()) {
											local2264.method5743(arg9);
										}
										if (local2283.method5740()) {
											local2283.method5743(arg9);
										}
									} else {
										local2264 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg0, local2215 * Static234.anIntArray322[arg0], Static345.anIntArray458[arg0] * local2215, arg1, arg0 + 4, arg6);
										local2283 = new Class47_Sub4_Sub1(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg0, 0, 0, arg1, local382 + 4, arg6);
									}
									Static375.method5902(arg7, arg4, arg5, local2264, local2283);
								}
							}
						}
					}
				}
			}
		} else if (Static327.aClass230_Sub1_1.aBoolean609 || local34.anInt550 != 0 || local34.anInt551 == 1 || local34.aBoolean46) {
			@Pc(288) Class47_Sub5 local288;
			if (local225) {
				@Pc(278) Class47_Sub5_Sub1 local278 = new Class47_Sub5_Sub1(arg9, local34, arg8, local170, local162, local178, super.aBoolean488, arg0, local190);
				if (local278.method5740()) {
					local278.method5743(arg9);
				}
				local288 = local278;
			} else {
				local288 = new Class47_Sub5_Sub2(arg9, local34, arg7, arg8, local170, local162, local178, super.aBoolean488, arg0, arg6);
			}
			@Pc(310) Class47_Sub5 local310 = Static112.method1764(arg7, arg4, arg5);
			if (local310 instanceof Class47_Sub5_Sub3) {
				((Class47_Sub5_Sub3) local310).aClass47_Sub5_2 = local288;
			} else {
				Static55.method853(arg7, arg4, arg5, local288);
			}
			if (local34.anInt551 == 1 && arg2 != null) {
				arg2.method3882(arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lclient!qa;I)V")
	public void method4813(@OriginalArg(0) Class121 arg0) {
		Static393.method5333(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt6060 > 1) {
			for (local15 = 0; super.anInt6066 > local15; local15++) {
				for (local19 = 0; local19 < super.anInt6059; local19++) {
					if ((Static228.aByteArrayArrayArray8[1][local15][local19] & 0x2) == 2) {
						Static22.method256(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; local15 < super.anInt6060; local15++) {
			for (local19 = 0; local19 <= super.anInt6059; local19++) {
				for (@Pc(63) int local63 = 0; super.anInt6066 >= local63; local63++) {
					@Pc(78) int local78;
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(130) int local130;
					@Pc(221) int local221;
					@Pc(230) int local230;
					@Pc(250) int local250;
					@Pc(254) int local254;
					if ((super.aByteArrayArrayArray10[local15][local63][local19] & 0x1) != 0) {
						local78 = local19;
						local80 = local19;
						local82 = local15;
						local84 = local15;
						while (local78 > 0 && (super.aByteArrayArrayArray10[local15][local63][local78 - 1] & 0x1) != 0) {
							local78--;
						}
						while (local80 < super.anInt6059 && (super.aByteArrayArrayArray10[local15][local63][local80 + 1] & 0x1) != 0) {
							local80++;
						}
						label164: while (local82 > 0) {
							for (local130 = local78; local130 <= local80; local130++) {
								if ((super.aByteArrayArrayArray10[local82 - 1][local63][local130] & 0x1) == 0) {
									break label164;
								}
							}
							local82--;
						}
						label153: while (local84 < 3) {
							for (local130 = local78; local130 <= local80; local130++) {
								if ((super.aByteArrayArrayArray10[local84 + 1][local63][local130] & 0x1) == 0) {
									break label153;
								}
							}
							local84++;
						}
						local130 = (local80 + 1 - local78) * (local84 + 1 - local82);
						if (local130 >= 2) {
							local221 = super.anIntArrayArrayArray106[local84][local63][local78] - 240;
							local230 = super.anIntArrayArrayArray106[local82][local63][local78];
							Static414.method5615(1, local63 << 7, local63 << 7, local78 << 7, (local80 << 7) + 128, local221, local230);
							for (local250 = local82; local250 <= local84; local250++) {
								for (local254 = local78; local254 <= local80; local254++) {
									super.aByteArrayArrayArray10[local250][local63][local254] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local15][local63][local19] & 0x2) != 0) {
						local78 = local63;
						local80 = local63;
						local82 = local15;
						while (super.anInt6066 > local80 && (super.aByteArrayArrayArray10[local15][local80 + 1][local19] & 0x2) != 0) {
							local80++;
						}
						local84 = local15;
						while (local78 > 0 && (super.aByteArrayArrayArray10[local15][local78 - 1][local19] & 0x2) != 0) {
							local78--;
						}
						label217: while (local82 > 0) {
							for (local130 = local78; local130 <= local80; local130++) {
								if ((super.aByteArrayArrayArray10[local82 - 1][local130][local19] & 0x2) == 0) {
									break label217;
								}
							}
							local82--;
						}
						label206: while (local84 < 3) {
							for (local130 = local78; local130 <= local80; local130++) {
								if ((super.aByteArrayArrayArray10[local84 + 1][local130][local19] & 0x2) == 0) {
									break label206;
								}
							}
							local84++;
						}
						local130 = (local80 + 1 - local78) * (local84 + 1 - local82);
						if (local130 >= 2) {
							local221 = super.anIntArrayArrayArray106[local84][local78][local19] - 240;
							local230 = super.anIntArrayArrayArray106[local82][local78][local19];
							Static414.method5615(2, local78 << 7, (local80 << 7) + 128, local19 << 7, local19 << 7, local221, local230);
							for (local250 = local82; local250 <= local84; local250++) {
								for (local254 = local78; local254 <= local80; local254++) {
									super.aByteArrayArrayArray10[local250][local254][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local15][local63][local19] & 0x4) != 0) {
						local78 = local63;
						local80 = local63;
						local82 = local19;
						local84 = local19;
						while (local82 > 0 && (super.aByteArrayArrayArray10[local15][local63][local82 - 1] & 0x4) != 0) {
							local82--;
						}
						while (local84 < super.anInt6059 && (super.aByteArrayArrayArray10[local15][local63][local84 + 1] & 0x4) != 0) {
							local84++;
						}
						label271: while (local78 > 0) {
							for (local130 = local82; local130 <= local84; local130++) {
								if ((super.aByteArrayArrayArray10[local15][local78 - 1][local130] & 0x4) == 0) {
									break label271;
								}
							}
							local78--;
						}
						label260: while (local80 < super.anInt6066) {
							for (local130 = local82; local130 <= local84; local130++) {
								if ((super.aByteArrayArrayArray10[local15][local80 + 1][local130] & 0x4) == 0) {
									break label260;
								}
							}
							local80++;
						}
						if ((local80 + 1 - local78) * (local84 + 1 - local82) >= 4) {
							local130 = super.anIntArrayArrayArray106[local15][local78][local82];
							Static414.method5615(4, local78 << 7, (local80 << 7) + 128, local82 << 7, (local84 << 7) + 128, local130, local130);
							for (@Pc(702) int local702 = local78; local702 <= local80; local702++) {
								for (local221 = local82; local221 <= local84; local221++) {
									super.aByteArrayArrayArray10[local15][local702][local221] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray10 = null;
	}
}
