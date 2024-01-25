import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
	public int anInt1886 = 99;

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(IIIZ)V")
	public Class73_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static300.aClass63_4, Static468.aClass306_5);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!oga;ILclient!ha;IBII)V")
	public void method1808(@OriginalArg(0) Class252 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface11 local11 = this.method1817(arg4, arg5, arg1, arg3);
		if (local11 == null) {
			return;
		}
		@Pc(25) Class277 local25 = Static652.aClass267_4.method6682(local11.method9221());
		@Pc(29) int local29 = local11.method9216();
		@Pc(33) int local33 = local11.method9217();
		if (local25.method6809()) {
			Static268.method4384(arg5, arg1, local25, arg3);
		}
		if (local11.method9220()) {
			local11.method9218(arg2);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				Static324.method4962(arg5, arg1, arg3);
			} else if (arg4 == 2) {
				Static561.method7969(arg5, arg1, arg3, he.class);
				if (local25.anInt7718 != 0 && super.anInt1878 > local25.anInt7764 + arg1 && local25.anInt7764 + arg3 < super.anInt1882 && arg1 + local25.anInt7765 < super.anInt1878 && super.anInt1882 > arg3 + local25.anInt7765) {
					arg0.method6167(local25.anInt7764, local25.anInt7765, arg3, !local25.aBoolean576, local33, local25.aBoolean581, arg1);
				}
				if (local29 == 9) {
					if ((local33 & 0x1) != 0) {
						Static449.method6561(arg1, 16, arg5, arg3);
						return;
					}
					Static449.method6561(arg1, 8, arg5, arg3);
					return;
				}
				return;
			} else if (arg4 == 3) {
				Static309.method4730(arg5, arg1, arg3);
				if (local25.anInt7718 == 1) {
					arg0.method6165(arg1, arg3);
					return;
				}
			}
			return;
		}
		Static187.method3459(arg5, arg1, arg3);
		if (local25.anInt7718 != 0) {
			arg0.method6175(local33, local29, arg1, !local25.aBoolean576, arg3, local25.aBoolean581);
		}
		if (local25.anInt7762 != 1) {
			return;
		}
		if (local33 == 0) {
			Static449.method6561(arg1, 1, arg5, arg3);
			return;
		}
		if (local33 != 1) {
			if (local33 == 2) {
				Static449.method6561(arg1 + 1, 1, arg5, arg3);
			} else if (local33 == 3) {
				Static449.method6561(arg1, 2, arg5, arg3);
				return;
			}
			return;
		}
		Static449.method6561(arg1, 2, arg5, arg3 + 1);
		return;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLclient!ha;B)V")
	public void method1809(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13 arg1) {
		Static540.method7761();
		if (!arg0) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt1875 > 1) {
				for (local14 = 0; super.anInt1878 > local14; local14++) {
					for (local18 = 0; local18 < super.anInt1882; local18++) {
						if ((Static90.aByteArrayArrayArray25[1][local14][local18] & 0x2) == 2) {
							Static361.method5308(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; super.anInt1875 > local14; local14++) {
				for (local18 = 0; super.anInt1882 >= local18; local18++) {
					for (@Pc(60) int local60 = 0; local60 <= super.anInt1878; local60++) {
						if ((super.aByteArrayArrayArray11[local14][local60][local18] & 0x4) != 0) {
							@Pc(75) int local75 = local60;
							@Pc(77) int local77 = local60;
							@Pc(79) int local79 = local18;
							@Pc(81) int local81 = local18;
							while (local79 > 0 && (super.aByteArrayArrayArray11[local14][local60][local79 - 1] & 0x4) != 0 && local18 - local79 < 10) {
								local79--;
							}
							while (super.anInt1882 > local81 && (super.aByteArrayArrayArray11[local14][local60][local81 + 1] & 0x4) != 0 && local81 - local79 < 10) {
								local81++;
							}
							@Pc(142) int local142;
							label111: while (local75 > 0 && local60 - local75 < 10) {
								for (local142 = local79; local142 <= local81; local142++) {
									if ((super.aByteArrayArrayArray11[local14][local75 - 1][local142] & 0x4) == 0) {
										break label111;
									}
								}
								local75--;
							}
							label98: while (local77 < super.anInt1878 && local77 - local75 < 10) {
								for (local142 = local79; local142 <= local81; local142++) {
									if ((super.aByteArrayArrayArray11[local14][local77 + 1][local142] & 0x4) == 0) {
										break label98;
									}
								}
								local77++;
							}
							if ((local81 + 1 - local79) * (-local75 + 1 + local77) >= 4) {
								local142 = super.anIntArrayArrayArray8[local14][local75][local79];
								Static413.method5901(local142, local142, (local77 << 9) + 512, (local81 << 9) - -512, local79 << 9, local14, local75 << 9);
								for (@Pc(271) int local271 = local75; local271 <= local77; local271++) {
									for (@Pc(275) int local275 = local79; local275 <= local81; local275++) {
										super.aByteArrayArrayArray11[local14][local271][local275] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static471.method6825();
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!jp;Lclient!ha;BI[I)V")
	public void method1810(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean147) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(19) Class312 local19 = null;
		while (true) {
			while (true) {
				while (true) {
					@Pc(24) int local24;
					@Pc(69) int local69;
					@Pc(495) int local495;
					@Pc(113) int local113;
					@Pc(117) int local117;
					while (arg1.aByteArray106.length > arg1.anInt9765) {
						local24 = arg1.method8632();
						if (local24 == 0) {
							local19 = new Class312(arg1);
						} else {
							@Pc(119) int local119;
							@Pc(171) int local171;
							@Pc(269) int local269;
							if (local24 == 1) {
								local69 = arg1.method8632();
								if (local69 > 0) {
									for (local495 = 0; local495 < local69; local495++) {
										@Pc(504) Class265 local504 = new Class265(arg2, arg1, 2);
										if (local504.anInt7432 == 31) {
											@Pc(517) Class234 local517 = Static74.aClass86_1.method2440(arg1.method8593());
											local504.method6565(local517.anInt6129, local517.anInt6132, local517.anInt6131, local517.anInt6134);
										}
										if (arg2.method8448() > 0) {
											@Pc(537) Class3_Sub15 local537 = local504.aClass3_Sub15_2;
											local119 = (arg3 << 9) + local537.method8384();
											local171 = local537.method8383() + (arg0 << 9);
											local269 = local119 >> 9;
											@Pc(562) int local562 = local171 >> 9;
											if (local269 >= 0 && local562 >= 0 && super.anInt1878 > local269 && local562 < super.anInt1882) {
												local537.method8379(local119, local171, super.anIntArrayArrayArray8[local504.anInt7434][local269][local562] - local537.method8380());
												Static263.method4291(local504);
											}
										}
									}
								}
							} else if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class312();
								}
								local19.method7737(arg1);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray8 == null) {
									super.aByteArrayArrayArray8 = new byte[4][][];
								}
								for (local69 = 0; local69 < 4; local69++) {
									@Pc(75) byte local75 = arg1.method8621();
									if (local75 == 0 && super.aByteArrayArrayArray8[local69] != null) {
										local113 = arg3;
										local117 = arg3 + 64;
										local119 = arg0;
										if (arg3 < 0) {
											local113 = 0;
										} else if (super.anInt1878 <= arg3) {
											local113 = super.anInt1878;
										}
										if (local117 < 0) {
											local117 = 0;
										} else if (super.anInt1878 <= local117) {
											local117 = super.anInt1878;
										}
										local171 = arg0 + 64;
										if (arg0 < 0) {
											local119 = 0;
										} else if (arg0 >= super.anInt1882) {
											local119 = super.anInt1882;
										}
										if (local171 < 0) {
											local171 = 0;
										} else if (super.anInt1882 <= local171) {
											local171 = super.anInt1882;
										}
										while (local117 > local113) {
											while (local119 < local171) {
												super.aByteArrayArrayArray8[local69][local113][local119] = 0;
												local119++;
											}
											local113++;
										}
									} else if (local75 == 1) {
										if (super.aByteArrayArrayArray8[local69] == null) {
											super.aByteArrayArrayArray8[local69] = new byte[super.anInt1878 + 1][super.anInt1882 + 1];
										}
										for (local113 = 0; local113 < 64; local113 += 4) {
											for (local117 = 0; local117 < 64; local117 += 4) {
												@Pc(259) byte local259 = arg1.method8621();
												for (local171 = arg3 + local113; local171 < arg3 + local113 + 4; local171++) {
													for (local269 = arg0 + local117; local269 < local117 + arg0 + 4; local269++) {
														if (local171 >= 0 && super.anInt1878 > local171 && local269 >= 0 && super.anInt1882 > local269) {
															super.aByteArrayArrayArray8[local69][local171][local269] = local259;
														}
													}
												}
											}
										}
									} else if (local75 == 2) {
										if (super.aByteArrayArrayArray8[local69] == null) {
											super.aByteArrayArrayArray8[local69] = new byte[super.anInt1878 + 1][super.anInt1882 + 1];
										}
										if (local69 > 0) {
											local113 = arg3;
											local117 = arg3 + 64;
											local119 = arg0;
											if (arg0 < 0) {
												local119 = 0;
											} else if (arg0 >= super.anInt1882) {
												local119 = super.anInt1882;
											}
											if (arg3 < 0) {
												local113 = 0;
											} else if (super.anInt1878 <= arg3) {
												local113 = super.anInt1878;
											}
											if (local117 < 0) {
												local117 = 0;
											} else if (local117 >= super.anInt1878) {
												local117 = super.anInt1878;
											}
											local171 = arg0 + 64;
											if (local171 < 0) {
												local171 = 0;
											} else if (super.anInt1882 <= local171) {
												local171 = super.anInt1882;
											}
											while (local113 < local117) {
												while (local171 > local119) {
													super.aByteArrayArrayArray8[local69][local113][local119] = super.aByteArrayArrayArray8[local69 - 1][local113][local119];
													local119++;
												}
												local113++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg1.anInt9765 += 10;
							} else {
								arg4[0] = arg1.method8593();
								arg4[1] = arg1.method8589();
								arg4[2] = arg1.method8589();
								arg4[3] = arg1.method8589();
								arg4[4] = arg1.method8593();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local69 = 0; local69 < 8; local69++) {
								local495 = local24 + (arg3 >> 3);
								local113 = local69 + (arg0 >> 3);
								if (local495 >= 0 && super.anInt1878 >> 3 > local495 && local113 >= 0 && super.anInt1882 >> 3 > local113) {
									Static410.method5858(local19, local495, local113);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray8 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray8[local24] != null) {
								for (local69 = 0; local69 < 16; local69++) {
									for (local495 = 0; local495 < 16; local495++) {
										local113 = (arg3 >> 2) + local69;
										local117 = (arg0 >> 2) + local495;
										if (local113 >= 0 && local113 < 26 && local117 >= 0 && local117 < 26) {
											super.aByteArrayArrayArray8[local24][local113][local117] = 0;
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

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[Lclient!oga;IIILclient!ha;IIII[B)V")
	public void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) Class252[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class13 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg9);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method8619();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method8604();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(45) int local45 = local26 & 0x3F;
				@Pc(51) int local51 = local26 >> 6 & 0x3F;
				@Pc(55) int local55 = local26 >> 12;
				@Pc(61) int local61 = local10.method8632();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (arg0 == local55 && local51 >= arg6 && local51 < arg6 + 8 && arg7 <= local45 && local45 < arg7 + 8) {
					@Pc(109) Class277 local109 = Static652.aClass267_4.method6682(local12);
					@Pc(129) int local129 = arg2 + Static618.method8718(local69, arg8, local109.anInt7765, local109.anInt7764, local51 & 0x7, local45 & 0x7);
					@Pc(148) int local148 = Static479.method6973(local109.anInt7765, local69, arg8, local51 & 0x7, local109.anInt7764, local45 & 0x7) + arg3;
					if (local129 > 0 && local148 > 0 && local129 < super.anInt1878 - 1 && super.anInt1882 - 1 > local148) {
						@Pc(166) Class252 local166 = null;
						if (!super.aBoolean147) {
							@Pc(171) int local171 = arg5;
							if ((Static90.aByteArrayArrayArray25[1][local129][local148] & 0x2) == 2) {
								local171 = arg5 - 1;
							}
							if (local171 >= 0) {
								local166 = arg1[local171];
							}
						}
						this.method1815(arg4, local12, arg5, local65, local148, -1, local69 + arg8 & 0x3, arg5, local129, local166);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;IB[Lclient!oga;[BI)V")
	public void method1814(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class252[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(28) int local28 = local10.method8619();
			if (local28 == 0) {
				return;
			}
			local12 += local28;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(42) int local42 = local10.method8604();
				if (local42 == 0) {
					break;
				}
				local36 += local42 - 1;
				@Pc(54) int local54 = local36 & 0x3F;
				@Pc(60) int local60 = local36 >> 6 & 0x3F;
				@Pc(64) int local64 = local36 >> 12;
				@Pc(70) int local70 = local10.method8632();
				@Pc(74) int local74 = local70 >> 2;
				@Pc(78) int local78 = local70 & 0x3;
				@Pc(83) int local83 = local60 + arg1;
				@Pc(87) int local87 = arg4 + local54;
				if (local83 > 0 && local87 > 0 && local83 < super.anInt1878 - 1 && local87 < super.anInt1882 - 1) {
					@Pc(112) Class252 local112 = null;
					if (!super.aBoolean147) {
						@Pc(117) int local117 = local64;
						if ((Static90.aByteArrayArrayArray25[1][local83][local87] & 0x2) == 2) {
							local117 = local64 - 1;
						}
						if (local117 >= 0) {
							local112 = arg2[local117];
						}
					}
					this.method1815(arg0, local12, local64, local74, local87, -1, local78, local64, local83, local112);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;IIIZIIIIILclient!oga;)V")
	public void method1815(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class252 arg9) {
		if (Static24.aClass3_Sub22_4.lb.method7116() == 0 && !Static426.method6149(arg4, arg8, Static34.anInt808, arg2)) {
			return;
		}
		if (this.anInt1886 > arg7) {
			this.anInt1886 = arg7;
		}
		@Pc(37) Class277 local37 = Static652.aClass267_4.method6682(arg1);
		if (Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4448() == 0 && local37.aBoolean577) {
			return;
		}
		@Pc(61) int local61;
		@Pc(58) int local58;
		if (arg6 == 1 || arg6 == 3) {
			local61 = local37.anInt7765;
			local58 = local37.anInt7764;
		} else {
			local58 = local37.anInt7765;
			local61 = local37.anInt7764;
		}
		@Pc(95) int local95;
		@Pc(88) int local88;
		if (local61 + arg8 <= super.anInt1878) {
			local88 = arg8 + (local61 + 1 >> 1);
			local95 = arg8 + (local61 >> 1);
		} else {
			local95 = arg8;
			local88 = arg8 + 1;
		}
		@Pc(120) int local120;
		@Pc(128) int local128;
		if (super.anInt1882 >= local58 + arg4) {
			local120 = arg4 + (local58 >> 1);
			local128 = (local58 + 1 >> 1) + arg4;
		} else {
			local120 = arg4;
			local128 = arg4 + 1;
		}
		@Pc(140) Class21 local140 = Static121.aClass21Array2[arg2];
		@Pc(174) int local174 = local140.method7973(local95, local120) + local140.method7973(local88, local120) + local140.method7973(local95, local128) + local140.method7973(local88, local128) >> 2;
		@Pc(182) int local182 = (arg8 << 9) + (local61 << 8);
		@Pc(190) int local190 = (local58 << 8) + (arg4 << 9);
		@Pc(202) boolean local202 = Static394.aBoolean445 && !super.aBoolean147 && local37.aBoolean588;
		if (local37.method6809()) {
			Static581.method7253(arg8, arg4, (Class28_Sub1_Sub1_Sub1_Sub2) null, local37, (Class28_Sub1_Sub1_Sub1_Sub1) null, arg6, arg7);
		}
		@Pc(239) boolean local239 = arg5 == -1 && local37.anInt7710 == -1 && local37.anIntArray659 == null && local37.anIntArray660 == null && !local37.aBoolean582 && !local37.aBoolean580;
		if (Static176.aBoolean263 && (Static383.method5493(arg3) && local37.anInt7762 != 1 || !(!Static484.method7018(arg3) || local37.anInt7762 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(399) Class28_Sub1_Sub1 local399;
			@Pc(363) Class28_Sub1_Sub1_Sub2 local363;
			@Pc(397) int local397;
			@Pc(461) int local461;
			if (arg3 == 10 || arg3 == 11) {
				local363 = null;
				if (local239) {
					@Pc(393) Class28_Sub1_Sub1_Sub2 local393 = new Class28_Sub1_Sub1_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, arg8 + local61 - 1, arg4, local58 + arg4 - 1, arg3, arg6, local202);
					local397 = local393.method2495();
					local399 = local393;
					local363 = local393;
				} else {
					local399 = new Class28_Sub1_Sub1_Sub5(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, arg8 + local61 - 1, arg4, local58 + arg4 - 1, arg3, arg6, arg5);
					local397 = 15;
				}
				if (Static436.method6231(local399, false)) {
					if (local363 != null && local363.method9220()) {
						local363.method9222(arg0);
					}
					if (local37.aBoolean579 && Static394.aBoolean445) {
						if (local397 > 30) {
							local397 = 30;
						}
						for (local461 = 0; local461 <= local61; local461++) {
							for (@Pc(465) int local465 = 0; local465 <= local58; local465++) {
								local140.ka(local461 + arg8, arg4 - -local465, local397);
							}
						}
					}
				}
				if (local37.anInt7718 != 0 && arg9 != null) {
					arg9.method6166(!local37.aBoolean576, arg4, local58, arg8, local61, local37.aBoolean581);
				}
			} else if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
				if (local239) {
					local363 = new Class28_Sub1_Sub1_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, local61 + arg8 - 1, arg4, arg4 + local58 - 1, arg3, arg6, local202);
					if (local363.method9220()) {
						local363.method9222(arg0);
					}
					local399 = local363;
				} else {
					local399 = new Class28_Sub1_Sub1_Sub5(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, arg8 + local61 - 1, arg4, arg4 + local58 - 1, arg3, arg6, arg5);
				}
				Static436.method6231(local399, false);
				if (Static394.aBoolean445 && !super.aBoolean147 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg7 > 0 && local37.anInt7762 != 0) {
					super.aByteArrayArrayArray11[arg7][arg8][arg4] = (byte) (super.aByteArrayArrayArray11[arg7][arg8][arg4] | 0x4);
				}
				if (local37.anInt7718 != 0 && arg9 != null) {
					arg9.method6166(!local37.aBoolean576, arg4, local58, arg8, local61, local37.aBoolean581);
				}
			} else {
				@Pc(707) Class28_Sub1_Sub4 local707;
				if (arg3 == 0) {
					@Pc(680) int local680 = local37.anInt7762;
					if (Static561.aBoolean713 && local37.anInt7762 == -1) {
						local680 = 1;
					}
					if (local239) {
						@Pc(725) Class28_Sub1_Sub4_Sub2 local725 = new Class28_Sub1_Sub4_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, local202);
						if (local725.method9220()) {
							local725.method9222(arg0);
						}
						local707 = local725;
					} else {
						local707 = new Class28_Sub1_Sub4_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, arg5);
					}
					Static443.method6284(arg7, arg8, arg4, local707, (Class28_Sub1_Sub4) null);
					if (arg6 == 0) {
						if (Static394.aBoolean445 && local37.aBoolean579) {
							local140.ka(arg8, arg4, 50);
							local140.ka(arg8, arg4 + 1, 50);
						}
						if (local680 == 1 && !super.aBoolean147) {
							Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 1, arg8);
						}
					} else if (arg6 == 1) {
						if (Static394.aBoolean445 && local37.aBoolean579) {
							local140.ka(arg8, arg4 + 1, 50);
							local140.ka(arg8 + 1, arg4 + 1, 50);
						}
						if (local680 == 1 && !super.aBoolean147) {
							Static337.method5085(local37.anInt7732, arg7, arg4 + 1, -local37.anInt7725, 2, arg8);
						}
					} else if (arg6 == 2) {
						if (Static394.aBoolean445 && local37.aBoolean579) {
							local140.ka(arg8 + 1, arg4, 50);
							local140.ka(arg8 + 1, arg4 + 1, 50);
						}
						if (local680 == 1 && !super.aBoolean147) {
							Static337.method5085(local37.anInt7732, arg7, arg4, -local37.anInt7725, 1, arg8 + 1);
						}
					} else if (arg6 == 3) {
						if (Static394.aBoolean445 && local37.aBoolean579) {
							local140.ka(arg8, arg4, 50);
							local140.ka(arg8 + 1, arg4, 50);
						}
						if (local680 == 1 && !super.aBoolean147) {
							Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 2, arg8);
						}
					}
					if (local37.anInt7718 != 0 && arg9 != null) {
						arg9.method6164(arg4, local37.aBoolean581, arg3, !local37.aBoolean576, arg6, arg8);
					}
					if (local37.anInt7737 != 64) {
						Static578.method8152(arg7, arg8, arg4, local37.anInt7737);
					}
				} else {
					@Pc(969) Class28_Sub1_Sub4 local969;
					@Pc(967) Class28_Sub1_Sub4_Sub2 local967;
					if (arg3 == 1) {
						if (local239) {
							local967 = new Class28_Sub1_Sub4_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, local202);
							local969 = local967;
							if (local967.method9220()) {
								local967.method9222(arg0);
							}
						} else {
							local969 = new Class28_Sub1_Sub4_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, arg5);
						}
						Static443.method6284(arg7, arg8, arg4, local969, (Class28_Sub1_Sub4) null);
						if (local37.aBoolean579 && Static394.aBoolean445) {
							if (arg6 == 0) {
								local140.ka(arg8, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local140.ka(arg8 + 1, arg4 - -1, 50);
							} else if (arg6 == 2) {
								local140.ka(arg8 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local140.ka(arg8, arg4, 50);
							}
						}
						if (local37.anInt7718 != 0 && arg9 != null) {
							arg9.method6164(arg4, local37.aBoolean581, arg3, !local37.aBoolean576, arg6, arg8);
						}
					} else if (arg3 == 2) {
						local397 = arg6 + 1 & 0x3;
						if (local239) {
							@Pc(1141) Class28_Sub1_Sub4_Sub2 local1141 = new Class28_Sub1_Sub4_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6 + 4, local202);
							@Pc(1157) Class28_Sub1_Sub4_Sub2 local1157 = new Class28_Sub1_Sub4_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, local397, local202);
							if (local1141.method9220()) {
								local1141.method9222(arg0);
							}
							local969 = local1141;
							if (local1157.method9220()) {
								local1157.method9222(arg0);
							}
							local707 = local1157;
						} else {
							local969 = new Class28_Sub1_Sub4_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6 + 4, arg5);
							local707 = new Class28_Sub1_Sub4_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, local397, arg5);
						}
						Static443.method6284(arg7, arg8, arg4, local969, local707);
						if ((local37.anInt7762 == 1 || Static561.aBoolean713 && local37.anInt7762 == -1) && !super.aBoolean147) {
							if (arg6 == 0) {
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 1, arg8);
								Static337.method5085(local37.anInt7732, arg7, arg4 + 1, local37.anInt7725, 2, arg8);
							} else if (arg6 == 1) {
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 1, arg8 + 1);
								Static337.method5085(local37.anInt7732, arg7, arg4 + 1, local37.anInt7725, 2, arg8);
							} else if (arg6 == 2) {
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 1, arg8 + 1);
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 2, arg8);
							} else if (arg6 == 3) {
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 1, arg8);
								Static337.method5085(local37.anInt7732, arg7, arg4, local37.anInt7725, 2, arg8);
							}
						}
						if (local37.anInt7718 != 0 && arg9 != null) {
							arg9.method6164(arg4, local37.aBoolean581, arg3, !local37.aBoolean576, arg6, arg8);
						}
						if (local37.anInt7737 != 64) {
							Static578.method8152(arg7, arg8, arg4, local37.anInt7737);
						}
					} else if (arg3 == 3) {
						if (local239) {
							local967 = new Class28_Sub1_Sub4_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, local202);
							local969 = local967;
							if (local967.method9220()) {
								local967.method9222(arg0);
							}
						} else {
							local969 = new Class28_Sub1_Sub4_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg3, arg6, arg5);
						}
						Static443.method6284(arg7, arg8, arg4, local969, (Class28_Sub1_Sub4) null);
						if (local37.aBoolean579 && Static394.aBoolean445) {
							if (arg6 == 0) {
								local140.ka(arg8, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local140.ka(arg8 + 1, arg4 + 1, 50);
							} else if (arg6 == 2) {
								local140.ka(arg8 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local140.ka(arg8, arg4, 50);
							}
						}
						if (local37.anInt7718 != 0 && arg9 != null) {
							arg9.method6164(arg4, local37.aBoolean581, arg3, !local37.aBoolean576, arg6, arg8);
						}
					} else if (arg3 == 9) {
						if (local239) {
							local363 = new Class28_Sub1_Sub1_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, arg8, arg4, arg4, arg3, arg6, local202);
							if (local363.method9220()) {
								local363.method9222(arg0);
							}
							local399 = local363;
						} else {
							local399 = new Class28_Sub1_Sub1_Sub5(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg8, arg8 + local61 - 1, arg4, local58 + arg4 - 1, arg3, arg6, arg5);
						}
						Static436.method6231(local399, false);
						if (local37.anInt7762 == 1 && !super.aBoolean147) {
							@Pc(1558) byte local1558;
							if ((arg6 & 0x1) == 0) {
								local1558 = 8;
							} else {
								local1558 = 16;
							}
							Static337.method5085(local37.anInt7732, arg7, arg4, 0, local1558, arg8);
						}
						if (local37.anInt7718 != 0 && arg9 != null) {
							arg9.method6166(!local37.aBoolean576, arg4, local58, arg8, local61, local37.aBoolean581);
						}
						if (local37.anInt7737 != 64) {
							Static578.method8152(arg7, arg8, arg4, local37.anInt7737);
						}
					} else {
						@Pc(1632) Class28_Sub1_Sub2 local1632;
						if (arg3 == 4) {
							if (local239) {
								@Pc(1630) Class28_Sub1_Sub2_Sub2 local1630 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, arg6);
								local1632 = local1630;
								if (local1630.method9220()) {
									local1630.method9222(arg0);
								}
							} else {
								local1632 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, arg6, arg5);
							}
							Static163.method2959(arg7, arg8, arg4, local1632, (Class28_Sub1_Sub2) null);
						} else {
							@Pc(1674) int local1674;
							@Pc(1680) Interface11 local1680;
							@Pc(1747) Class28_Sub1_Sub2_Sub2 local1747;
							if (arg3 == 5) {
								local1674 = 65;
								local1680 = (Interface11) Static583.method8200(arg7, arg8, arg4);
								if (local1680 != null) {
									local1674 = Static652.aClass267_4.method6682(local1680.method9221()).anInt7737 + 1;
								}
								if (local239) {
									local1747 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, local1674 * Static278.anIntArray285[arg6], local1674 * Static488.anIntArray681[arg6], arg3, arg6);
									if (local1747.method9220()) {
										local1747.method9222(arg0);
									}
									local1632 = local1747;
								} else {
									local1632 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, Static278.anIntArray285[arg6] * local1674, Static488.anIntArray681[arg6] * local1674, arg3, arg6, arg5);
								}
								Static163.method2959(arg7, arg8, arg4, local1632, (Class28_Sub1_Sub2) null);
							} else if (arg3 == 6) {
								local1674 = 33;
								local1680 = (Interface11) Static583.method8200(arg7, arg8, arg4);
								if (local1680 != null) {
									local1674 = Static652.aClass267_4.method6682(local1680.method9221()).anInt7737 / 2 + 1;
								}
								if (local239) {
									local1747 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, local1674 * Static278.anIntArray285[arg6], Static488.anIntArray681[arg6] * local1674, arg3, arg6 + 4);
									if (local1747.method9220()) {
										local1747.method9222(arg0);
									}
									local1632 = local1747;
								} else {
									local1632 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, local1674 * Static463.anIntArray649[arg6], Static63.anIntArray113[arg6] * local1674, arg3, arg6 + 4, arg5);
								}
								Static163.method2959(arg7, arg8, arg4, local1632, (Class28_Sub1_Sub2) null);
							} else if (arg3 == 7) {
								local1674 = arg6 + 2 & 0x3;
								if (local239) {
									@Pc(1897) Class28_Sub1_Sub2_Sub2 local1897 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, local1674 + 4);
									local1632 = local1897;
									if (local1897.method9220()) {
										local1897.method9222(arg0);
									}
								} else {
									local1632 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, local1674 + 4, arg5);
								}
								Static163.method2959(arg7, arg8, arg4, local1632, (Class28_Sub1_Sub2) null);
							} else if (arg3 == 8) {
								local397 = arg6 + 2 & 0x3;
								local461 = 33;
								@Pc(1955) Interface11 local1955 = (Interface11) Static583.method8200(arg7, arg8, arg4);
								if (local1955 != null) {
									local461 = Static652.aClass267_4.method6682(local1955.method9221()).anInt7737 / 2 + 1;
								}
								@Pc(1999) Class28_Sub1_Sub2 local1999;
								@Pc(2021) Class28_Sub1_Sub2 local2021;
								if (local239) {
									local1999 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, local461 * Static463.anIntArray649[arg6], local461 * Static63.anIntArray113[arg6], arg3, arg6 + 4);
									local2021 = new Class28_Sub1_Sub2_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, local397 + 4);
									if (local1999.method9220()) {
										local1999.method9222(arg0);
									}
									if (local2021.method9220()) {
										local2021.method9222(arg0);
									}
								} else {
									local1999 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, local461 * Static463.anIntArray649[arg6], Static63.anIntArray113[arg6] * local461, arg3, arg6 + 4, arg5);
									local2021 = new Class28_Sub1_Sub2_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, 0, 0, arg3, local397 + 4, arg5);
								}
								Static163.method2959(arg7, arg8, arg4, local1999, local2021);
							}
						}
					}
				}
			}
		} else if (Static24.aClass3_Sub22_4.aClass6_Sub4_1.method2638() != 0 || local37.anInt7757 != 0 || local37.anInt7718 == 1 || local37.lb) {
			@Pc(315) Class28_Sub1_Sub3 local315;
			if (local239) {
				@Pc(305) Class28_Sub1_Sub3_Sub2 local305 = new Class28_Sub1_Sub3_Sub2(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg6, local202);
				if (local305.method9220()) {
					local305.method9222(arg0);
				}
				local315 = local305;
			} else {
				local315 = new Class28_Sub1_Sub3_Sub1(arg0, local37, arg7, arg2, local182, local174, local190, super.aBoolean147, arg6, arg5);
			}
			Static187.method3461(arg7, arg8, arg4, local315);
			if (local37.anInt7718 == 1 && arg9 != null) {
				arg9.method6160(arg4, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZI[IIILclient!jp;IIILclient!ha;)V")
	public void method1816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub25 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class13 arg9) {
		if (super.aBoolean147) {
			return;
		}
		@Pc(13) Class312 local13 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(25) int local25 = (arg6 & 0x7) * 8;
		@Pc(31) int local31 = (arg8 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(36) int local36;
						@Pc(68) int local68;
						@Pc(418) int local418;
						@Pc(109) int local109;
						while (arg5.aByteArray106.length > arg5.anInt9765) {
							local36 = arg5.method8632();
							if (local36 == 0) {
								local13 = new Class312(arg5);
							} else {
								@Pc(255) int local255;
								@Pc(128) int local128;
								@Pc(132) int local132;
								@Pc(170) int local170;
								if (local36 == 1) {
									local68 = arg5.method8632();
									if (local68 > 0) {
										for (local418 = 0; local418 < local68; local418++) {
											@Pc(427) Class265 local427 = new Class265(arg9, arg5, 2);
											if (local427.anInt7432 == 31) {
												@Pc(440) Class234 local440 = Static74.aClass86_1.method2440(arg5.method8593());
												local427.method6565(local440.anInt6129, local440.anInt6132, local440.anInt6131, local440.anInt6134);
											}
											if (arg9.method8448() > 0) {
												@Pc(460) Class3_Sub15 local460 = local427.aClass3_Sub15_2;
												local255 = local460.method8384() >> 9;
												local128 = local460.method8383() >> 9;
												if (arg3 == local427.anInt7434 && local255 >= local25 && local255 < local25 + 8 && local128 >= local31 && local31 + 8 > local128) {
													local132 = (arg4 << 9) + Static169.method3085(local460.method8384() & 0xFFF, arg7, local460.method8383() & 0xFFF);
													local255 = local132 >> 9;
													local170 = (arg0 << 9) + Static327.method4982(local460.method8384() & 0xFFF, arg7, local460.method8383() & 0xFFF);
													local128 = local170 >> 9;
													if (local255 >= 0 && local128 >= 0 && super.anInt1878 > local255 && local128 < super.anInt1882) {
														local460.method8379(local132, local170, super.anIntArrayArrayArray8[arg3][local255][local128] - local460.method8380());
														Static263.method4291(local427);
													}
												}
											}
										}
									}
								} else if (local36 == 2) {
									if (local13 == null) {
										local13 = new Class312();
									}
									local13.method7737(arg5);
								} else if (local36 != 128) {
									if (local36 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray8 == null) {
										super.aByteArrayArrayArray8 = new byte[4][][];
									}
									for (local68 = 0; local68 < 4; local68++) {
										@Pc(74) byte local74 = arg5.method8621();
										@Pc(113) int local113;
										if (local74 == 0 && super.aByteArrayArrayArray8[arg1] != null) {
											if (arg3 >= local68) {
												local109 = arg4;
												local113 = arg4 + 7;
												local255 = arg0;
												if (arg4 < 0) {
													local109 = 0;
												} else if (arg4 >= super.anInt1878) {
													local109 = super.anInt1878;
												}
												local128 = arg0 + 7;
												if (arg0 < 0) {
													local255 = 0;
												} else if (arg0 >= super.anInt1882) {
													local255 = super.anInt1882;
												}
												if (local113 < 0) {
													local113 = 0;
												} else if (local113 >= super.anInt1878) {
													local113 = super.anInt1878;
												}
												if (local128 < 0) {
													local128 = 0;
												} else if (local128 >= super.anInt1882) {
													local128 = super.anInt1882;
												}
												while (local113 > local109) {
													while (local255 < local128) {
														super.aByteArrayArrayArray8[arg1][local109][local255] = 0;
														local255++;
													}
													local109++;
												}
											}
										} else if (local74 == 1) {
											if (super.aByteArrayArrayArray8[arg1] == null) {
												super.aByteArrayArrayArray8[arg1] = new byte[super.anInt1878 + 1][super.anInt1882 + 1];
											}
											for (local109 = 0; local109 < 64; local109 += 4) {
												for (local113 = 0; local113 < 64; local113 += 4) {
													@Pc(119) byte local119 = arg5.method8621();
													if (local68 <= arg3) {
														for (local128 = local109; local128 < local109 + 4; local128++) {
															for (local132 = local113; local132 < local113 + 4; local132++) {
																if (local128 >= local25 && local128 < local25 + 8 && local132 >= local31 && local31 < local31 + 8) {
																	local170 = Static5.method132(local132 & 0x7, local128 & 0x7, arg7) + arg4;
																	@Pc(182) int local182 = Static595.method8368(arg7, local132 & 0x7, local128 & 0x7) + arg0;
																	if (local170 >= 0 && local170 < super.anInt1878 && local182 >= 0 && super.anInt1882 > local182) {
																		super.aByteArrayArrayArray8[arg1][local170][local182] = local119;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg2 == null) {
									arg5.anInt9765 += 10;
								} else {
									arg2[0] = arg5.method8593();
									arg2[1] = arg5.method8589();
									arg2[2] = arg5.method8589();
									arg2[3] = arg5.method8589();
									arg2[4] = arg5.method8593();
								}
							}
						}
						if (local13 != null) {
							Static410.method5858(local13, arg4 >> 3, arg0 >> 3);
						}
						if (super.aByteArrayArrayArray8 != null && super.aByteArrayArrayArray8[arg1] != null) {
							local36 = arg4 + 7;
							local68 = arg0 + 7;
							for (local418 = arg4; local418 < local36; local418++) {
								for (local109 = arg0; local109 < local68; local109++) {
									super.aByteArrayArrayArray8[arg1][local418][local109] = 0;
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

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IIBII)Lclient!he;")
	public Interface11 method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface11 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface11) Static583.method8200(arg1, arg2, arg3);
		}
		if (arg0 == 1) {
			local5 = (Interface11) Static358.method5269(arg1, arg2, arg3);
		}
		if (arg0 == 2) {
			local5 = (Interface11) Static318.method4861(arg1, arg2, arg3, he.class);
		}
		if (arg0 == 3) {
			local5 = (Interface11) Static280.method4469(arg1, arg2, arg3);
		}
		return local5;
	}
}
