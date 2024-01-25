import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!paa", name = "M", descriptor = "I")
	public int anInt7605 = 99;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(IIIZ)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static130.aClass389_5, Static337.aClass50_4);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIII)Lclient!np;")
	public Interface16 method6724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface16 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface16) Static34.method575(arg3, arg1, arg0);
		}
		if (arg2 == 1) {
			local5 = (Interface16) Static161.method1396(arg3, arg1, arg0);
		}
		if (arg2 == 2) {
			local5 = (Interface16) Static492.method7403(arg3, arg1, arg0, Static456.aClass43 == null ? (Static456.aClass43 = a("np")) : Static456.aClass43);
		}
		if (arg2 == 3) {
			local5 = (Interface16) Static447.method6640(arg3, arg1, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!jc;IILclient!ha;I)V")
	public void method6727(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) int arg3) {
		if (super.aBoolean534) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(22) Class342 local22 = null;
		while (true) {
			@Pc(27) int local27;
			@Pc(60) int local60;
			@Pc(268) int local268;
			@Pc(272) int local272;
			@Pc(64) int local64;
			while (arg0.anInt8936 < arg0.aByteArray99.length) {
				local27 = arg0.method7695(115);
				if (local27 != 0) {
					@Pc(114) int local114;
					@Pc(122) int local122;
					@Pc(126) int local126;
					if (local27 == 1) {
						local60 = arg0.method7695(101);
						if (local60 > 0) {
							for (local64 = 0; local64 < local60; local64++) {
								@Pc(73) Class275 local73 = new Class275(arg2, arg0, 2);
								if (local73.anInt7476 == 31) {
									@Pc(86) Class188 local86 = Static607.aClass308_1.method7678(arg0.method7717(-1978450544));
									local73.method6617(local86.anInt5229, local86.anInt5227, local86.anInt5232, local86.anInt5234);
								}
								if (arg2.method6926() > 0) {
									@Pc(106) Class14_Sub18 local106 = local73.aClass14_Sub18_2;
									local114 = local106.method8342() + (arg1 << 9);
									local122 = (arg3 << 9) + local106.method8341();
									local126 = local114 >> 9;
									@Pc(130) int local130 = local122 >> 9;
									if (local126 >= 0 && local130 >= 0 && super.anInt7592 > local126 && super.anInt7585 > local130) {
										local106.method8346(local122, local114, super.anIntArrayArrayArray17[local73.anInt7473][local126][local130] - local106.method8344());
										Static15.method270(local73);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local22 == null) {
							local22 = new Class342();
						}
						local22.method8189(arg0);
					} else if (local27 == 128) {
						if (local22 == null) {
							local22 = new Class342();
						}
						local22.method8191(arg0);
					} else if (local27 == 129) {
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						local20 = true;
						for (local60 = 0; local60 < 4; local60++) {
							@Pc(230) byte local230 = arg0.method7720();
							if (local230 == 0 && super.aByteArrayArrayArray15[local60] != null) {
								local268 = arg1;
								local272 = arg1 + 64;
								local114 = arg3;
								local122 = arg3 + 64;
								if (arg3 < 0) {
									local114 = 0;
								} else if (super.anInt7585 <= arg3) {
									local114 = super.anInt7585;
								}
								if (local272 < 0) {
									local272 = 0;
								} else if (super.anInt7592 <= local272) {
									local272 = super.anInt7592;
								}
								if (arg1 < 0) {
									local268 = 0;
								} else if (arg1 >= super.anInt7592) {
									local268 = super.anInt7592;
								}
								if (local122 < 0) {
									local122 = 0;
								} else if (local122 >= super.anInt7585) {
									local122 = super.anInt7585;
								}
								while (local268 < local272) {
									while (local122 > local114) {
										super.aByteArrayArrayArray15[local60][local268][local114] = 0;
										local114++;
									}
									local268++;
								}
							} else if (local230 == 1) {
								if (super.aByteArrayArrayArray15[local60] == null) {
									super.aByteArrayArrayArray15[local60] = new byte[super.anInt7592 + 1][super.anInt7585 + 1];
								}
								for (local268 = 0; local268 < 64; local268 += 4) {
									for (local272 = 0; local272 < 64; local272 += 4) {
										@Pc(278) byte local278 = arg0.method7720();
										for (local122 = arg1 + local268; local122 < arg1 + local268 + 4; local122++) {
											for (local126 = arg3 + local272; local126 < arg3 + local272 + 4; local126++) {
												if (local122 >= 0 && local122 < super.anInt7592 && local126 >= 0 && super.anInt7585 > local126) {
													super.aByteArrayArrayArray15[local60][local122][local126] = local278;
												}
											}
										}
									}
								}
							} else if (local230 == 2) {
								if (super.aByteArrayArrayArray15[local60] == null) {
									super.aByteArrayArrayArray15[local60] = new byte[super.anInt7592 + 1][super.anInt7585 + 1];
								}
								if (local60 > 0) {
									local268 = arg1;
									local272 = arg1 + 64;
									local114 = arg3;
									if (local272 < 0) {
										local272 = 0;
									} else if (super.anInt7592 <= local272) {
										local272 = super.anInt7592;
									}
									local122 = arg3 + 64;
									if (arg1 < 0) {
										local268 = 0;
									} else if (arg1 >= super.anInt7592) {
										local268 = super.anInt7592;
									}
									if (arg3 < 0) {
										local114 = 0;
									} else if (arg3 >= super.anInt7585) {
										local114 = super.anInt7585;
									}
									if (local122 < 0) {
										local122 = 0;
									} else if (local122 >= super.anInt7585) {
										local122 = super.anInt7585;
									}
									while (local272 > local268) {
										while (local122 > local114) {
											super.aByteArrayArrayArray15[local60][local268][local114] = super.aByteArrayArrayArray15[local60 - 1][local268][local114];
											local114++;
										}
										local268++;
									}
								}
							}
						}
					} else {
						throw new IllegalStateException("");
					}
				} else if (local22 == null) {
					local22 = new Class342(arg0);
				} else {
					local22.method8193(arg0);
				}
			}
			if (local22 != null) {
				for (local27 = 0; local27 < 8; local27++) {
					for (local60 = 0; local60 < 8; local60++) {
						local64 = local27 + (arg1 >> 3);
						local268 = local60 + (arg3 >> 3);
						if (local64 >= 0 && super.anInt7592 >> 3 > local64 && local268 >= 0 && super.anInt7585 >> 3 > local268) {
							Static118.method1848(local268, local22, local64);
						}
					}
				}
			}
			if (!local20 && super.aByteArrayArrayArray15 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (super.aByteArrayArrayArray15[local27] != null) {
						for (local60 = 0; local60 < 16; local60++) {
							for (local64 = 0; local64 < 16; local64++) {
								local268 = local60 + (arg1 >> 2);
								local272 = (arg3 >> 2) + local64;
								if (local268 >= 0 && local268 < 26 && local272 >= 0 && local272 < 26) {
									super.aByteArrayArrayArray15[local27][local268][local272] = 0;
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

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ha;IIILclient!jc;IIII)V")
	public void method6728(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14_Sub21 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (super.aBoolean534) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) Class342 local12 = null;
		@Pc(18) int local18 = (arg6 & 0x7) * 8;
		@Pc(32) int local32 = (arg3 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(37) int local37;
					@Pc(103) int local103;
					@Pc(404) int local404;
					@Pc(127) int local127;
					while (arg5.aByteArray99.length > arg5.anInt8936) {
						local37 = arg5.method7695(109);
						if (local37 != 0) {
							@Pc(133) int local133;
							@Pc(170) int local170;
							@Pc(266) int local266;
							@Pc(309) int local309;
							if (local37 == 1) {
								local103 = arg5.method7695(125);
								if (local103 > 0) {
									for (local404 = 0; local404 < local103; local404++) {
										@Pc(412) Class275 local412 = new Class275(arg1, arg5, 2);
										if (local412.anInt7476 == 31) {
											@Pc(425) Class188 local425 = Static607.aClass308_1.method7678(arg5.method7717(-1978450544));
											local412.method6617(local425.anInt5229, local425.anInt5227, local425.anInt5232, local425.anInt5234);
										}
										if (arg1.method6926() > 0) {
											@Pc(442) Class14_Sub18 local442 = local412.aClass14_Sub18_2;
											local133 = local442.method8342() >> 9;
											local170 = local442.method8341() >> 9;
											if (local412.anInt7473 == arg0 && local18 <= local133 && local18 + 8 > local133 && local170 >= local32 && local170 < local32 + 8) {
												local266 = Static68.method1083(arg7, local442.method8342() & 0xFFF, local442.method8341() & 0xFFF) + (arg8 << 9);
												local309 = (arg2 << 9) + Static229.method3854(arg7, local442.method8341() & 0xFFF, local442.method8342() & 0xFFF);
												local133 = local266 >> 9;
												local170 = local309 >> 9;
												if (local133 >= 0 && local170 >= 0 && local133 < super.anInt7592 && local170 < super.anInt7585) {
													local442.method8346(local309, local266, super.anIntArrayArrayArray17[arg0][local133][local170] - local442.method8344());
													Static15.method270(local412);
												}
											}
										}
									}
								}
							} else if (local37 == 2) {
								if (local12 == null) {
									local12 = new Class342();
								}
								local12.method8189(arg5);
							} else if (local37 == 128) {
								if (local12 == null) {
									local12 = new Class342();
								}
								local12.method8191(arg5);
							} else if (local37 == 129) {
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								for (local103 = 0; local103 < 4; local103++) {
									@Pc(108) byte local108 = arg5.method7720();
									@Pc(131) int local131;
									if (local108 == 0 && super.aByteArrayArrayArray15[arg4] != null) {
										if (arg0 >= local103) {
											local127 = arg8;
											local131 = arg8 + 7;
											local133 = arg2;
											if (local131 < 0) {
												local131 = 0;
											} else if (local131 >= super.anInt7592) {
												local131 = super.anInt7592;
											}
											if (arg2 < 0) {
												local133 = 0;
											} else if (arg2 >= super.anInt7585) {
												local133 = super.anInt7585;
											}
											local170 = arg2 + 7;
											if (arg8 < 0) {
												local127 = 0;
											} else if (super.anInt7592 <= arg8) {
												local127 = super.anInt7592;
											}
											if (local170 < 0) {
												local170 = 0;
											} else if (local170 >= super.anInt7585) {
												local170 = super.anInt7585;
											}
											while (local127 < local131) {
												while (local133 < local170) {
													super.aByteArrayArrayArray15[arg4][local127][local133] = 0;
													local133++;
												}
												local127++;
											}
										}
									} else if (local108 == 1) {
										if (super.aByteArrayArrayArray15[arg4] == null) {
											super.aByteArrayArrayArray15[arg4] = new byte[super.anInt7592 + 1][super.anInt7585 + 1];
										}
										for (local127 = 0; local127 < 64; local127 += 4) {
											for (local131 = 0; local131 < 64; local131 += 4) {
												@Pc(254) byte local254 = arg5.method7720();
												if (arg0 >= local103) {
													for (local170 = local127; local170 < local127 + 4; local170++) {
														for (local266 = local131; local266 < local131 + 4; local266++) {
															if (local18 <= local170 && local18 + 8 > local170 && local266 >= local32 && local266 < local32 + 8) {
																local309 = Static204.method3038(local170 & 0x7, arg7, local266 & 0x7) + arg8;
																@Pc(321) int local321 = Static277.method4687(arg7, local170 & 0x7, local266 & 0x7) + arg2;
																if (local309 >= 0 && local309 < super.anInt7592 && local321 >= 0 && super.anInt7585 > local321) {
																	local10 = true;
																	super.aByteArrayArrayArray15[arg4][local309][local321] = local254;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else {
								throw new IllegalStateException("");
							}
						} else if (local12 == null) {
							local12 = new Class342(arg5);
						} else {
							local12.method8193(arg5);
						}
					}
					if (local12 != null) {
						Static118.method1848(arg2 >> 3, local12, arg8 >> 3);
					}
					if (!local10 && super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg4] != null) {
						local37 = arg8 + 7;
						local103 = arg2 + 7;
						for (local404 = arg8; local404 < local37; local404++) {
							for (local127 = arg2; local127 < local103; local127++) {
								super.aByteArrayArrayArray15[arg4][local404][local127] = 0;
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!pka;IIIIILclient!ha;IIII)V")
	public void method6729(@OriginalArg(0) Class289 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class144 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0 && !Static348.method5316(arg4, arg6, Static114.anInt1886, arg2)) {
			return;
		}
		if (arg3 < this.anInt7605) {
			this.anInt7605 = arg3;
		}
		@Pc(33) Class128 local33 = Static212.aClass249_4.method6119(arg9);
		if (Static181.aClass14_Sub26_9.aClass43_Sub5_1.method1872() == 0 && local33.aBoolean209) {
			return;
		}
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (arg7 == 1 || arg7 == 3) {
			local64 = local33.anInt2975;
			local61 = local33.anInt2959;
		} else {
			local61 = local33.anInt2975;
			local64 = local33.anInt2959;
		}
		@Pc(104) int local104;
		@Pc(98) int local98;
		if (super.anInt7592 >= arg2 + local64) {
			local98 = (local64 + 1 >> 1) + arg2;
			local104 = arg2 + (local64 >> 1);
		} else {
			local98 = arg2 + 1;
			local104 = arg2;
		}
		@Pc(131) int local131;
		@Pc(125) int local125;
		if (super.anInt7585 >= local61 + arg6) {
			local125 = (local61 + 1 >> 1) + arg6;
			local131 = (local61 >> 1) + arg6;
		} else {
			local131 = arg6;
			local125 = arg6 + 1;
		}
		@Pc(142) Class159 local142 = Static258.aClass159Array1[arg4];
		@Pc(170) int local170 = local142.method8207(local131, local104) + local142.method8207(local131, local98) + local142.method8207(local125, local104) + local142.method8207(local125, local98) >> 2;
		@Pc(179) int local179 = (arg2 << 9) + (local64 << 8);
		@Pc(188) int local188 = (arg6 << 9) + (local61 << 8);
		@Pc(205) boolean local205 = Static332.aBoolean410 && !super.aBoolean534 && local33.aBoolean214;
		if (local33.method2686()) {
			Static399.method6096(arg2, arg3, arg7, (Class4_Sub3_Sub3_Sub3_Sub2) null, (Class4_Sub3_Sub3_Sub3_Sub1) null, local33, arg6);
		}
		@Pc(249) boolean local249 = arg8 == -1 && !local33.method2682() && local33.anIntArray179 == null && !local33.aBoolean220 && !local33.aBoolean219;
		if (Static525.aBoolean630 && (Static30.method477(arg1) && local33.anInt2960 != 1 || !(!Static534.method7889(arg1) || local33.anInt2960 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(425) Class4_Sub3_Sub3 local425;
			@Pc(391) Class4_Sub3_Sub3_Sub5 local391;
			@Pc(429) int local429;
			@Pc(498) int local498;
			if (arg1 == 10 || arg1 == 11) {
				local391 = null;
				if (local249) {
					@Pc(421) Class4_Sub3_Sub3_Sub5 local421 = new Class4_Sub3_Sub3_Sub5(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, local64 + arg2 - 1, arg6, local61 + arg6 - 1, arg1, arg7, local205);
					local391 = local421;
					local425 = local421;
					local429 = local421.method8792();
				} else {
					local429 = 15;
					local425 = new Class4_Sub3_Sub3_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, local64 + arg2 - 1, arg6, arg6 + local61 - 1, arg1, arg7, arg8);
				}
				if (Static209.method9481(local425, false)) {
					if (local391 != null && local391.method9496()) {
						local391.method9499(arg5);
					}
					if (local33.aBoolean215 && Static332.aBoolean410) {
						if (local429 > 30) {
							local429 = 30;
						}
						for (local498 = 0; local498 <= local64; local498++) {
							for (@Pc(501) int local501 = 0; local501 <= local61; local501++) {
								local142.ka(arg2 + local498, arg6 + local501, local429);
							}
						}
					}
				}
				if (local33.anInt2943 != 0 && arg0 != null) {
					arg0.method7079(local61, local33.aBoolean211, local64, arg6, !local33.aBoolean212, arg2);
				}
			} else if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
				if (local249) {
					local391 = new Class4_Sub3_Sub3_Sub5(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, arg2 + local64 - 1, arg6, arg6 + local61 - 1, arg1, arg7, local205);
					if (local391.method9496()) {
						local391.method9499(arg5);
					}
					local425 = local391;
				} else {
					local425 = new Class4_Sub3_Sub3_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, arg2 + local64 - 1, arg6, local61 + arg6 - 1, arg1, arg7, arg8);
				}
				Static209.method9481(local425, false);
				if (Static332.aBoolean410 && !super.aBoolean534 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0 && local33.anInt2960 != 0) {
					super.aByteArrayArrayArray16[arg3][arg2][arg6] = (byte) (super.aByteArrayArrayArray16[arg3][arg2][arg6] | 0x4);
				}
				if (local33.anInt2943 != 0 && arg0 != null) {
					arg0.method7079(local61, local33.aBoolean211, local64, arg6, !local33.aBoolean212, arg2);
				}
			} else {
				@Pc(780) Class4_Sub3_Sub1 local780;
				if (arg1 == 0) {
					@Pc(749) int local749 = local33.anInt2960;
					if (Static26.aBoolean27 && local33.anInt2960 == -1) {
						local749 = 1;
					}
					if (local249) {
						@Pc(778) Class4_Sub3_Sub1_Sub1 local778 = new Class4_Sub3_Sub1_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, local205);
						local780 = local778;
						if (local778.method9496()) {
							local778.method9499(arg5);
						}
					} else {
						local780 = new Class4_Sub3_Sub1_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, arg8);
					}
					Static111.method1778(arg3, arg2, arg6, local780, (Class4_Sub3_Sub1) null);
					if (arg7 == 0) {
						if (Static332.aBoolean410 && local33.aBoolean215) {
							local142.ka(arg2, arg6, 50);
							local142.ka(arg2, arg6 + 1, 50);
						}
						if (local749 == 1 && !super.aBoolean534) {
							Static451.method6675(arg3, local33.anInt2976, arg6, 1, local33.anInt2998, arg2);
						}
					} else if (arg7 == 1) {
						if (Static332.aBoolean410 && local33.aBoolean215) {
							local142.ka(arg2, arg6 + 1, 50);
							local142.ka(arg2 + 1, arg6 + 1, 50);
						}
						if (local749 == 1 && !super.aBoolean534) {
							Static451.method6675(arg3, -local33.anInt2976, arg6 + 1, 2, local33.anInt2998, arg2);
						}
					} else if (arg7 == 2) {
						if (Static332.aBoolean410 && local33.aBoolean215) {
							local142.ka(arg2 + 1, arg6, 50);
							local142.ka(arg2 + 1, arg6 + 1, 50);
						}
						if (local749 == 1 && !super.aBoolean534) {
							Static451.method6675(arg3, -local33.anInt2976, arg6, 1, local33.anInt2998, arg2 + 1);
						}
					} else if (arg7 == 3) {
						if (Static332.aBoolean410 && local33.aBoolean215) {
							local142.ka(arg2, arg6, 50);
							local142.ka(arg2 + 1, arg6, 50);
						}
						if (local749 == 1 && !super.aBoolean534) {
							Static451.method6675(arg3, local33.anInt2976, arg6, 2, local33.anInt2998, arg2);
						}
					}
					if (local33.anInt2943 != 0 && arg0 != null) {
						arg0.method7075(arg2, local33.aBoolean211, arg6, arg7, arg1, !local33.aBoolean212);
					}
					if (local33.anInt2954 != 64) {
						Static421.method6292(arg3, arg2, arg6, local33.anInt2954);
					}
				} else {
					@Pc(1087) Class4_Sub3_Sub1 local1087;
					@Pc(1085) Class4_Sub3_Sub1_Sub1 local1085;
					if (arg1 == 1) {
						if (local249) {
							local1085 = new Class4_Sub3_Sub1_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, local205);
							local1087 = local1085;
							if (local1085.method9496()) {
								local1085.method9499(arg5);
							}
						} else {
							local1087 = new Class4_Sub3_Sub1_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, arg8);
						}
						Static111.method1778(arg3, arg2, arg6, local1087, (Class4_Sub3_Sub1) null);
						if (local33.aBoolean215 && Static332.aBoolean410) {
							if (arg7 == 0) {
								local142.ka(arg2, arg6 + 1, 50);
							} else if (arg7 == 1) {
								local142.ka(arg2 + 1, arg6 - -1, 50);
							} else if (arg7 == 2) {
								local142.ka(arg2 + 1, arg6, 50);
							} else if (arg7 == 3) {
								local142.ka(arg2, arg6, 50);
							}
						}
						if (local33.anInt2943 != 0 && arg0 != null) {
							arg0.method7075(arg2, local33.aBoolean211, arg6, arg7, arg1, !local33.aBoolean212);
						}
					} else if (arg1 == 2) {
						local429 = arg7 + 1 & 0x3;
						if (local249) {
							@Pc(1274) Class4_Sub3_Sub1_Sub1 local1274 = new Class4_Sub3_Sub1_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7 + 4, local205);
							@Pc(1290) Class4_Sub3_Sub1_Sub1 local1290 = new Class4_Sub3_Sub1_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, local429, local205);
							if (local1274.method9496()) {
								local1274.method9499(arg5);
							}
							local1087 = local1274;
							if (local1290.method9496()) {
								local1290.method9499(arg5);
							}
							local780 = local1290;
						} else {
							local1087 = new Class4_Sub3_Sub1_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7 + 4, arg8);
							local780 = new Class4_Sub3_Sub1_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, local429, arg8);
						}
						Static111.method1778(arg3, arg2, arg6, local1087, local780);
						if ((local33.anInt2960 == 1 || Static26.aBoolean27 && local33.anInt2960 == -1) && !super.aBoolean534) {
							if (arg7 == 0) {
								Static451.method6675(arg3, local33.anInt2976, arg6, 1, local33.anInt2998, arg2);
								Static451.method6675(arg3, local33.anInt2976, arg6 + 1, 2, local33.anInt2998, arg2);
							} else if (arg7 == 1) {
								Static451.method6675(arg3, local33.anInt2976, arg6, 1, local33.anInt2998, arg2 + 1);
								Static451.method6675(arg3, local33.anInt2976, arg6 + 1, 2, local33.anInt2998, arg2);
							} else if (arg7 == 2) {
								Static451.method6675(arg3, local33.anInt2976, arg6, 1, local33.anInt2998, arg2 + 1);
								Static451.method6675(arg3, local33.anInt2976, arg6, 2, local33.anInt2998, arg2);
							} else if (arg7 == 3) {
								Static451.method6675(arg3, local33.anInt2976, arg6, 1, local33.anInt2998, arg2);
								Static451.method6675(arg3, local33.anInt2976, arg6, 2, local33.anInt2998, arg2);
							}
						}
						if (local33.anInt2943 != 0 && arg0 != null) {
							arg0.method7075(arg2, local33.aBoolean211, arg6, arg7, arg1, !local33.aBoolean212);
						}
						if (local33.anInt2954 != 64) {
							Static421.method6292(arg3, arg2, arg6, local33.anInt2954);
						}
					} else if (arg1 == 3) {
						if (local249) {
							local1085 = new Class4_Sub3_Sub1_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, local205);
							local1087 = local1085;
							if (local1085.method9496()) {
								local1085.method9499(arg5);
							}
						} else {
							local1087 = new Class4_Sub3_Sub1_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg1, arg7, arg8);
						}
						Static111.method1778(arg3, arg2, arg6, local1087, (Class4_Sub3_Sub1) null);
						if (local33.aBoolean215 && Static332.aBoolean410) {
							if (arg7 == 0) {
								local142.ka(arg2, arg6 + 1, 50);
							} else if (arg7 == 1) {
								local142.ka(arg2 + 1, arg6 + 1, 50);
							} else if (arg7 == 2) {
								local142.ka(arg2 + 1, arg6, 50);
							} else if (arg7 == 3) {
								local142.ka(arg2, arg6, 50);
							}
						}
						if (local33.anInt2943 != 0 && arg0 != null) {
							arg0.method7075(arg2, local33.aBoolean211, arg6, arg7, arg1, !local33.aBoolean212);
						}
					} else if (arg1 == 9) {
						if (local249) {
							local391 = new Class4_Sub3_Sub3_Sub5(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, arg2, arg6, arg6, arg1, arg7, local205);
							if (local391.method9496()) {
								local391.method9499(arg5);
							}
							local425 = local391;
						} else {
							local425 = new Class4_Sub3_Sub3_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg2, arg2 + local64 - 1, arg6, local61 + arg6 - 1, arg1, arg7, arg8);
						}
						Static209.method9481(local425, false);
						if (local33.anInt2960 == 1 && !super.aBoolean534) {
							@Pc(1735) byte local1735;
							if ((arg7 & 0x1) == 0) {
								local1735 = 8;
							} else {
								local1735 = 16;
							}
							Static451.method6675(arg3, 0, arg6, local1735, local33.anInt2998, arg2);
						}
						if (local33.anInt2943 != 0 && arg0 != null) {
							arg0.method7079(local61, local33.aBoolean211, local64, arg6, !local33.aBoolean212, arg2);
						}
						if (local33.anInt2954 != 64) {
							Static421.method6292(arg3, arg2, arg6, local33.anInt2954);
						}
					} else {
						@Pc(1812) Class4_Sub3_Sub5 local1812;
						if (arg1 == 4) {
							if (local249) {
								@Pc(1830) Class4_Sub3_Sub5_Sub1 local1830 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, arg7);
								local1812 = local1830;
								if (local1830.method9496()) {
									local1830.method9499(arg5);
								}
							} else {
								local1812 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, arg7, arg8);
							}
							Static542.method7954(arg3, arg2, arg6, local1812, (Class4_Sub3_Sub5) null);
						} else {
							@Pc(1854) int local1854;
							@Pc(1860) Interface16 local1860;
							@Pc(1926) Class4_Sub3_Sub5_Sub1 local1926;
							if (arg1 == 5) {
								local1854 = 65;
								local1860 = (Interface16) Static34.method575(arg3, arg2, arg6);
								if (local1860 != null) {
									local1854 = Static212.aClass249_4.method6119(local1860.method9501()).anInt2954 + 1;
								}
								if (local249) {
									local1926 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, Static501.anIntArray453[arg7] * local1854, Static54.anIntArray58[arg7] * local1854, arg1, arg7);
									if (local1926.method9496()) {
										local1926.method9499(arg5);
									}
									local1812 = local1926;
								} else {
									local1812 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, local1854 * Static501.anIntArray453[arg7], local1854 * Static54.anIntArray58[arg7], arg1, arg7, arg8);
								}
								Static542.method7954(arg3, arg2, arg6, local1812, (Class4_Sub3_Sub5) null);
							} else if (arg1 == 6) {
								local1854 = 33;
								local1860 = (Interface16) Static34.method575(arg3, arg2, arg6);
								if (local1860 != null) {
									local1854 = Static212.aClass249_4.method6119(local1860.method9501()).anInt2954 / 2 + 1;
								}
								if (local249) {
									local1926 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, Static501.anIntArray453[arg7] * local1854, local1854 * Static54.anIntArray58[arg7], arg1, arg7 + 4);
									local1812 = local1926;
									if (local1926.method9496()) {
										local1926.method9499(arg5);
									}
								} else {
									local1812 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, local1854 * Static578.anIntArray498[arg7], local1854 * Static433.anIntArray387[arg7], arg1, arg7 + 4, arg8);
								}
								Static542.method7954(arg3, arg2, arg6, local1812, (Class4_Sub3_Sub5) null);
							} else if (arg1 == 7) {
								local1854 = arg7 + 2 & 0x3;
								if (local249) {
									@Pc(2098) Class4_Sub3_Sub5_Sub1 local2098 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, local1854 + 4);
									local1812 = local2098;
									if (local2098.method9496()) {
										local2098.method9499(arg5);
									}
								} else {
									local1812 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, local1854 + 4, arg8);
								}
								Static542.method7954(arg3, arg2, arg6, local1812, (Class4_Sub3_Sub5) null);
							} else if (arg1 == 8) {
								local429 = arg7 + 2 & 0x3;
								local498 = 33;
								@Pc(2134) Interface16 local2134 = (Interface16) Static34.method575(arg3, arg2, arg6);
								if (local2134 != null) {
									local498 = Static212.aClass249_4.method6119(local2134.method9501()).anInt2954 / 2 + 1;
								}
								@Pc(2178) Class4_Sub3_Sub5 local2178;
								@Pc(2200) Class4_Sub3_Sub5 local2200;
								if (local249) {
									local2178 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, local498 * Static578.anIntArray498[arg7], local498 * Static433.anIntArray387[arg7], arg1, arg7 + 4);
									local2200 = new Class4_Sub3_Sub5_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, local429 + 4);
									if (local2178.method9496()) {
										local2178.method9499(arg5);
									}
									if (local2200.method9496()) {
										local2200.method9499(arg5);
									}
								} else {
									local2178 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, local498 * Static578.anIntArray498[arg7], Static433.anIntArray387[arg7] * local498, arg1, arg7 + 4, arg8);
									local2200 = new Class4_Sub3_Sub5_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, 0, 0, arg1, local429 + 4, arg8);
								}
								Static542.method7954(arg3, arg2, arg6, local2178, local2200);
							}
						}
					}
				}
			}
		} else if (Static181.aClass14_Sub26_9.aClass43_Sub27_1.method7915() != 0 || local33.anInt2945 != 0 || local33.anInt2943 == 1 || local33.aBoolean206) {
			@Pc(340) Class4_Sub3_Sub2 local340;
			if (local249) {
				@Pc(328) Class4_Sub3_Sub2_Sub2 local328 = new Class4_Sub3_Sub2_Sub2(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg7, local205);
				if (local328.method9496()) {
					local328.method9499(arg5);
				}
				local340 = local328;
			} else {
				local340 = new Class4_Sub3_Sub2_Sub1(arg5, local33, arg3, arg4, local179, local170, local188, super.aBoolean534, arg7, arg8);
			}
			Static165.method2382(arg3, arg2, arg6, local340);
			if (local33.anInt2943 == 1 && arg0 != null) {
				arg0.method7076(arg6, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method6732(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class144 arg1) {
		Static373.method5790();
		if (!arg0) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt7594 > 1) {
				for (local16 = 0; local16 < super.anInt7592; local16++) {
					for (local20 = 0; super.anInt7585 > local20; local20++) {
						if ((Static446.aByteArrayArrayArray12[1][local16][local20] & 0x2) == 2) {
							Static688.method9470(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; local16 < super.anInt7594; local16++) {
				for (local20 = 0; local20 <= super.anInt7585; local20++) {
					for (@Pc(66) int local66 = 0; local66 <= super.anInt7592; local66++) {
						if ((super.aByteArrayArrayArray16[local16][local66][local20] & 0x4) != 0) {
							@Pc(83) int local83 = local66;
							@Pc(85) int local85 = local66;
							@Pc(87) int local87 = local20;
							@Pc(89) int local89 = local20;
							while (local87 > 0 && (super.aByteArrayArrayArray16[local16][local66][local87 - 1] & 0x4) != 0 && local20 - local87 < 10) {
								local87--;
							}
							while (super.anInt7585 > local89 && (super.aByteArrayArrayArray16[local16][local66][local89 + 1] & 0x4) != 0 && local89 - local87 < 10) {
								local89++;
							}
							@Pc(171) int local171;
							label111: while (local83 > 0 && local66 - local83 < 10) {
								for (local171 = local87; local171 <= local89; local171++) {
									if ((super.aByteArrayArrayArray16[local16][local83 - 1][local171] & 0x4) == 0) {
										break label111;
									}
								}
								local83--;
							}
							label98: while (super.anInt7592 > local85 && local85 - local83 < 10) {
								for (local171 = local87; local171 <= local89; local171++) {
									if ((super.aByteArrayArrayArray16[local16][local85 + 1][local171] & 0x4) == 0) {
										break label98;
									}
								}
								local85++;
							}
							if ((local89 + 1 - local87) * ((local85 + 1) - local83) >= 4) {
								local171 = super.anIntArrayArrayArray17[local16][local83][local87];
								Static542.method7950(local171, local171, local16, local87 << 9, (local85 << 9) + 512, local83 << 9, (local89 << 9) + 512);
								for (@Pc(324) int local324 = local83; local324 <= local85; local324++) {
									for (@Pc(328) int local328 = local87; local328 <= local89; local328++) {
										super.aByteArrayArrayArray16[local16][local324][local328] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static381.method5863();
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!ha;II[BIIII[Lclient!pka;)V")
	public void method6733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class289[] arg9) {
		@Pc(18) Class14_Sub21 local18 = new Class14_Sub21(arg5);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(26) int local26 = local18.method7691();
			if (local26 == 0) {
				return;
			}
			local20 += local26;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local18.method7728(-129);
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(50) int local50 = local34 & 0x3F;
				@Pc(56) int local56 = local34 >> 6 & 0x3F;
				@Pc(60) int local60 = local34 >> 12;
				@Pc(64) int local64 = local18.method7695(115);
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local60 == arg4 && arg8 <= local56 && local56 < arg8 + 8 && local50 >= arg0 && arg0 + 8 > local50) {
					@Pc(106) Class128 local106 = Static212.aClass249_4.method6119(local20);
					@Pc(123) int local123 = arg1 + Static54.method987(local50 & 0x7, local106.anInt2975, local56 & 0x7, local72, local106.anInt2959, arg6);
					@Pc(140) int local140 = Static105.method8319(arg6, local50 & 0x7, local56 & 0x7, local106.anInt2959, local106.anInt2975, local72) + arg3;
					if (local123 > 0 && local140 > 0 && local123 < super.anInt7592 - 1 && super.anInt7585 - 1 > local140) {
						@Pc(164) Class289 local164 = null;
						if (!super.aBoolean534) {
							@Pc(169) int local169 = arg7;
							if ((Static446.aByteArrayArrayArray12[1][local123][local140] & 0x2) == 2) {
								local169 = arg7 - 1;
							}
							if (local169 >= 0) {
								local164 = arg9[local169];
							}
						}
						this.method6729(local164, local68, local123, arg7, arg7, arg2, local140, local72 + arg6 & 0x3, -1, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I[BILclient!ha;[Lclient!pka;I)V")
	public void method6734(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) Class289[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class14_Sub21 local15 = new Class14_Sub21(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method7691();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method7728(-129);
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method7695(109);
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = local54 + arg4;
				@Pc(78) int local78 = arg0 + local48;
				if (local74 > 0 && local78 > 0 && local74 < super.anInt7592 - 1 && local78 < super.anInt7585 - 1) {
					@Pc(103) Class289 local103 = null;
					if (!super.aBoolean534) {
						@Pc(108) int local108 = local58;
						if ((Static446.aByteArrayArrayArray12[1][local74][local78] & 0x2) == 2) {
							local108 = local58 - 1;
						}
						if (local108 >= 0) {
							local103 = arg3[local108];
						}
					}
					this.method6729(local103, local66, local74, local58, local58, arg2, local78, local70, -1, local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!pka;IILclient!ha;III)V")
	public void method6735(@OriginalArg(0) Class289 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface16 local11 = this.method6724(arg5, arg4, arg3, arg1);
		if (local11 == null) {
			return;
		}
		@Pc(28) Class128 local28 = Static212.aClass249_4.method6119(local11.method9501());
		@Pc(32) int local32 = local11.method9498();
		@Pc(36) int local36 = local11.method9502();
		if (local28.method2686()) {
			Static322.method5060(local28, arg5, arg4, arg1);
		}
		if (local11.method9496()) {
			local11.method9497(arg2);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				Static5.method93(arg1, arg4, arg5);
				return;
			}
			if (arg3 == 2) {
				Static55.method1000(arg1, arg4, arg5, Static456.aClass43 == null ? (Static456.aClass43 = a("np")) : Static456.aClass43);
				if (local28.anInt2943 != 0 && super.anInt7592 > arg4 + local28.anInt2959 && local28.anInt2959 + arg5 < super.anInt7585 && super.anInt7592 > local28.anInt2975 + arg4 && super.anInt7585 > local28.anInt2975 + arg5) {
					arg0.method7081(arg4, arg5, local36, !local28.aBoolean212, local28.anInt2959, local28.anInt2975, local28.aBoolean211);
				}
				if (local32 != 9) {
					return;
				}
				if ((local36 & 0x1) != 0) {
					Static206.method3082(arg5, 16, arg1, arg4);
					return;
				}
				Static206.method3082(arg5, 8, arg1, arg4);
			} else if (arg3 == 3) {
				Static101.method1691(arg1, arg4, arg5);
				if (local28.anInt2943 == 1) {
					arg0.method7085(arg4, arg5);
					return;
				}
			}
			return;
		}
		Static19.method292(arg1, arg4, arg5);
		if (local28.anInt2943 != 0) {
			arg0.method7078(arg5, arg4, !local28.aBoolean212, local28.aBoolean211, local32, local36);
		}
		if (local28.anInt2960 != 1) {
			return;
		}
		if (local36 == 0) {
			Static206.method3082(arg5, 1, arg1, arg4);
			return;
		}
		if (local36 != 1) {
			if (local36 == 2) {
				Static206.method3082(arg5, 1, arg1, arg4 + 1);
			} else if (local36 == 3) {
				Static206.method3082(arg5, 2, arg1, arg4);
				return;
			}
			return;
		}
		Static206.method3082(arg5 + 1, 2, arg1, arg4);
		return;
	}
}
