import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!er", name = "C", descriptor = "I")
	public int anInt2557 = 99;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIZ)V")
	public Class100_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static415.aClass217_6, Static14.aClass160_1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B[BIIII[Lclient!wj;ILclient!ha;II)V")
	public void method2464(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class389[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class33 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method8886();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method8823();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(42) int local42 = local26 & 0x3F;
				@Pc(48) int local48 = local26 >> 6 & 0x3F;
				@Pc(52) int local52 = local26 >> 12;
				@Pc(56) int local56 = local10.method8865();
				@Pc(60) int local60 = local56 >> 2;
				@Pc(64) int local64 = local56 & 0x3;
				if (arg9 == local52 && arg4 <= local48 && local48 < arg4 + 8 && arg3 <= local42 && local42 < arg3 + 8) {
					@Pc(104) Class342 local104 = Static441.aClass74_169.method2075(local12);
					@Pc(122) int local122 = arg1 + Static529.method2522(arg8, local104.anInt8728, local48 & 0x7, local42 & 0x7, local104.anInt8716, local64);
					@Pc(140) int local140 = arg6 + Static139.method8825(local104.anInt8716, local48 & 0x7, arg8, local42 & 0x7, local64, local104.anInt8728);
					if (local122 > 0 && local140 > 0 && local122 < super.anInt2556 - 1 && super.anInt2549 - 1 > local140) {
						@Pc(161) Class389 local161 = null;
						if (!super.aBoolean182) {
							@Pc(166) int local166 = arg2;
							if ((Static47.aByteArrayArrayArray3[1][local122][local140] & 0x2) == 2) {
								local166 = arg2 - 1;
							}
							if (local166 >= 0) {
								local161 = arg5[local166];
							}
						}
						this.method2471(arg8 + local64 & 0x3, local161, arg2, local12, local60, local122, -1, local140, arg2, arg7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!ha;I[Lclient!wj;[BI)V")
	public void method2465(@OriginalArg(1) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class389[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg3);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(22) int local22 = local14.method8886();
			if (local22 == 0) {
				return;
			}
			local16 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local14.method8823();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(49) int local49 = local33 & 0x3F;
				@Pc(55) int local55 = local33 >> 6 & 0x3F;
				@Pc(59) int local59 = local33 >> 12;
				@Pc(63) int local63 = local14.method8865();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				@Pc(76) int local76 = local55 + arg4;
				@Pc(81) int local81 = local49 + arg1;
				if (local76 > 0 && local81 > 0 && super.anInt2556 - 1 > local76 && local81 < super.anInt2549 - 1) {
					@Pc(105) Class389 local105 = null;
					if (!super.aBoolean182) {
						@Pc(110) int local110 = local59;
						if ((Static47.aByteArrayArrayArray3[1][local76][local81] & 0x2) == 2) {
							local110 = local59 - 1;
						}
						if (local110 >= 0) {
							local105 = arg2[local110];
						}
					}
					this.method2471(local71, local105, local59, local16, local67, local76, -1, local81, local59, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public void method2466(@OriginalArg(0) Class33 arg0, @OriginalArg(2) boolean arg1) {
		Static407.method2220();
		if (!arg1) {
			@Pc(22) int local22;
			@Pc(26) int local26;
			if (super.anInt2544 > 1) {
				for (local22 = 0; local22 < super.anInt2556; local22++) {
					for (local26 = 0; super.anInt2549 > local26; local26++) {
						if ((Static47.aByteArrayArrayArray3[1][local22][local26] & 0x2) == 2) {
							Static195.method3024(local22, local26);
						}
					}
				}
			}
			for (local22 = 0; local22 < super.anInt2544; local22++) {
				for (local26 = 0; local26 <= super.anInt2549; local26++) {
					for (@Pc(68) int local68 = 0; super.anInt2556 >= local68; local68++) {
						if ((super.aByteArrayArrayArray13[local22][local68][local26] & 0x4) != 0) {
							@Pc(83) int local83 = local68;
							@Pc(85) int local85 = local68;
							@Pc(87) int local87 = local26;
							@Pc(89) int local89 = local26;
							while (local87 > 0 && (super.aByteArrayArrayArray13[local22][local68][local87 - 1] & 0x4) != 0 && local26 - local87 < 10) {
								local87--;
							}
							while (super.anInt2549 > local89 && (super.aByteArrayArrayArray13[local22][local68][local89 + 1] & 0x4) != 0 && local89 - local87 < 10) {
								local89++;
							}
							@Pc(156) int local156;
							label111: while (local83 > 0 && local68 - local83 < 10) {
								for (local156 = local87; local156 <= local89; local156++) {
									if ((super.aByteArrayArrayArray13[local22][local83 - 1][local156] & 0x4) == 0) {
										break label111;
									}
								}
								local83--;
							}
							label98: while (local85 < super.anInt2556 && local85 - local83 < 10) {
								for (local156 = local87; local156 <= local89; local156++) {
									if ((super.aByteArrayArrayArray13[local22][local85 + 1][local156] & 0x4) == 0) {
										break label98;
									}
								}
								local85++;
							}
							if ((local89 + 1 - local87) * (-local83 + 1 + local85) >= 4) {
								local156 = super.anIntArrayArrayArray9[local22][local83][local87];
								Static551.method7327(local87 << 9, local83 << 9, local156, (local85 << 9) + 512, local156, (local89 << 9) + 512, local22);
								for (@Pc(276) int local276 = local83; local276 <= local85; local276++) {
									for (@Pc(280) int local280 = local87; local280 <= local89; local280++) {
										super.aByteArrayArrayArray13[local22][local276][local280] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static277.method4052();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;IIB[ILclient!es;)V")
	public void method2467(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class4_Sub11 arg4) {
		if (super.aBoolean182) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(18) Class113 local18 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(29) int local29;
			@Pc(50) int local50;
			@Pc(230) int local230;
			@Pc(234) int local234;
			@Pc(57) int local57;
			while (arg4.anInt10466 < arg4.aByteArray107.length) {
				local29 = arg4.method8865();
				if (local29 == 0) {
					local18 = new Class113(arg4);
				} else {
					@Pc(103) int local103;
					@Pc(111) int local111;
					@Pc(115) int local115;
					if (local29 == 1) {
						local50 = arg4.method8865();
						if (local50 > 0) {
							for (local57 = 0; local57 < local50; local57++) {
								@Pc(66) Class85 local66 = new Class85(arg0, arg4, 2);
								if (local66.anInt2272 == 31) {
									@Pc(77) Class212 local77 = Static270.aClass299_1.method6592(arg4.method8859());
									local66.method2167(local77.anInt5269, local77.anInt5263, local77.anInt5266, local77.anInt5261);
								}
								if (arg0.method8086() > 0) {
									@Pc(94) Class4_Sub29 local94 = local66.aClass4_Sub29_2;
									local103 = local94.method7627() + (arg1 << 9);
									local111 = local94.method7628() + (arg2 << 9);
									local115 = local103 >> 9;
									@Pc(119) int local119 = local111 >> 9;
									if (local115 >= 0 && local119 >= 0 && super.anInt2556 > local115 && local119 < super.anInt2549) {
										local94.method7629(local111, super.anIntArrayArrayArray9[local66.anInt2270][local115][local119] - local94.method7630(), local103);
										Static214.method3194(local66);
									}
								}
							}
						}
					} else if (local29 == 2) {
						if (local18 == null) {
							local18 = new Class113();
						}
						local18.method2708(arg4);
					} else if (local29 != 128) {
						if (local29 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						local11 = true;
						for (local50 = 0; local50 < 4; local50++) {
							@Pc(200) byte local200 = arg4.method8861();
							if (local200 == 0 && super.aByteArrayArrayArray15[local50] != null) {
								local230 = arg1;
								local234 = arg1 + 64;
								local103 = arg2;
								if (arg1 < 0) {
									local230 = 0;
								} else if (super.anInt2556 <= arg1) {
									local230 = super.anInt2556;
								}
								local111 = arg2 + 64;
								if (arg2 < 0) {
									local103 = 0;
								} else if (arg2 >= super.anInt2549) {
									local103 = super.anInt2549;
								}
								if (local234 < 0) {
									local234 = 0;
								} else if (super.anInt2556 <= local234) {
									local234 = super.anInt2556;
								}
								if (local111 < 0) {
									local111 = 0;
								} else if (local111 >= super.anInt2549) {
									local111 = super.anInt2549;
								}
								while (local234 > local230) {
									while (local103 < local111) {
										super.aByteArrayArrayArray15[local50][local230][local103] = 0;
										local103++;
									}
									local230++;
								}
							} else if (local200 == 1) {
								if (super.aByteArrayArrayArray15[local50] == null) {
									super.aByteArrayArrayArray15[local50] = new byte[super.anInt2556 + 1][super.anInt2549 + 1];
								}
								for (local230 = 0; local230 < 64; local230 += 4) {
									for (local234 = 0; local234 < 64; local234 += 4) {
										@Pc(240) byte local240 = arg4.method8861();
										for (local111 = arg1 + local230; local111 < arg1 + local230 + 4; local111++) {
											for (local115 = local234 + arg2; local115 < arg2 + local234 + 4; local115++) {
												if (local111 >= 0 && super.anInt2556 > local111 && local115 >= 0 && local115 < super.anInt2549) {
													super.aByteArrayArrayArray15[local50][local111][local115] = local240;
												}
											}
										}
									}
								}
							} else if (local200 == 2) {
								if (super.aByteArrayArrayArray15[local50] == null) {
									super.aByteArrayArrayArray15[local50] = new byte[super.anInt2556 + 1][super.anInt2549 + 1];
								}
								if (local50 > 0) {
									local230 = arg1;
									local234 = arg1 + 64;
									local103 = arg2;
									local111 = arg2 + 64;
									if (arg1 < 0) {
										local230 = 0;
									} else if (arg1 >= super.anInt2556) {
										local230 = super.anInt2556;
									}
									if (local234 < 0) {
										local234 = 0;
									} else if (super.anInt2556 <= local234) {
										local234 = super.anInt2556;
									}
									if (arg2 < 0) {
										local103 = 0;
									} else if (arg2 >= super.anInt2549) {
										local103 = super.anInt2549;
									}
									if (local111 < 0) {
										local111 = 0;
									} else if (super.anInt2549 <= local111) {
										local111 = super.anInt2549;
									}
									while (local234 > local230) {
										while (local111 > local103) {
											super.aByteArrayArrayArray15[local50][local230][local103] = super.aByteArrayArrayArray15[local50 - 1][local230][local103];
											local103++;
										}
										local230++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg4.anInt10466 += 10;
					} else {
						arg3[0] = arg4.method8859();
						arg3[1] = arg4.method8834();
						arg3[2] = arg4.method8834();
						arg3[3] = arg4.method8834();
						arg3[4] = arg4.method8859();
					}
				}
			}
			if (local18 != null) {
				for (local29 = 0; local29 < 8; local29++) {
					for (local50 = 0; local50 < 8; local50++) {
						local57 = (arg1 >> 3) + local29;
						local230 = (arg2 >> 3) + local50;
						if (local57 >= 0 && local57 < super.anInt2556 >> 3 && local230 >= 0 && super.anInt2549 >> 3 > local230) {
							Static214.method3193(local230, local57, local18);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray15 != null) {
				for (local29 = 0; local29 < 4; local29++) {
					if (super.aByteArrayArrayArray15[local29] != null) {
						for (local50 = 0; local50 < 16; local50++) {
							for (local57 = 0; local57 < 16; local57++) {
								local230 = (arg1 >> 2) + local50;
								local234 = local57 + (arg2 >> 2);
								if (local230 >= 0 && local230 < 26 && local234 >= 0 && local234 < 26) {
									super.aByteArrayArrayArray15[local29][local230][local234] = 0;
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

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;IIIIB[IIILclient!es;I)V")
	public void method2469(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4_Sub11 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean182) {
			return;
		}
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(31) Class113 local31 = null;
		@Pc(37) int local37 = (arg9 & 0x7) * 8;
		@Pc(43) int local43 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(62) int local62;
			@Pc(118) int local118;
			@Pc(164) int local164;
			@Pc(186) int local186;
			@Pc(69) int local69;
			@Pc(112) int local112;
			label233: do {
				while (true) {
					@Pc(48) int local48;
					@Pc(281) int local281;
					while (arg8.aByteArray107.length > arg8.anInt10466) {
						local48 = arg8.method8865();
						if (local48 == 0) {
							local31 = new Class113(arg8);
						} else {
							if (local48 == 1) {
								local62 = arg8.method8865();
								continue label233;
							}
							if (local48 == 2) {
								if (local31 == null) {
									local31 = new Class113();
								}
								local31.method2708(arg8);
							} else if (local48 != 128) {
								if (local48 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								for (local62 = 0; local62 < 4; local62++) {
									@Pc(269) byte local269 = arg8.method8861();
									@Pc(285) int local285;
									if (local269 == 0 && super.aByteArrayArrayArray15[arg4] != null) {
										if (local62 <= arg1) {
											local281 = arg2;
											local285 = arg2 + 7;
											local112 = arg6;
											local118 = arg6 + 7;
											if (local285 < 0) {
												local285 = 0;
											} else if (local285 >= super.anInt2556) {
												local285 = super.anInt2556;
											}
											if (arg6 < 0) {
												local112 = 0;
											} else if (arg6 >= super.anInt2549) {
												local112 = super.anInt2549;
											}
											if (arg2 < 0) {
												local281 = 0;
											} else if (arg2 >= super.anInt2556) {
												local281 = super.anInt2556;
											}
											if (local118 < 0) {
												local118 = 0;
											} else if (super.anInt2549 <= local118) {
												local118 = super.anInt2549;
											}
											while (local285 > local281) {
												while (local118 > local112) {
													super.aByteArrayArrayArray15[arg4][local281][local112] = 0;
													local112++;
												}
												local281++;
											}
										}
									} else if (local269 == 1) {
										if (super.aByteArrayArrayArray15[arg4] == null) {
											super.aByteArrayArrayArray15[arg4] = new byte[super.anInt2556 + 1][super.anInt2549 + 1];
										}
										for (local281 = 0; local281 < 64; local281 += 4) {
											for (local285 = 0; local285 < 64; local285 += 4) {
												@Pc(410) byte local410 = arg8.method8861();
												if (local62 <= arg1) {
													for (local118 = local281; local118 < local281 + 4; local118++) {
														for (local164 = local285; local164 < local285 + 4; local164++) {
															if (local37 <= local118 && local37 + 8 > local118 && local43 <= local164 && local43 + 8 > local43) {
																local186 = Static395.method2776(local164 & 0x7, local118 & 0x7, arg7) + arg2;
																@Pc(473) int local473 = arg6 + Static267.method3811(local118 & 0x7, local164 & 0x7, arg7);
																if (local186 >= 0 && local186 < super.anInt2556 && local473 >= 0 && local473 < super.anInt2549) {
																	super.aByteArrayArrayArray15[arg4][local186][local473] = local410;
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
								arg8.anInt10466 += 10;
							} else {
								arg5[0] = arg8.method8859();
								arg5[1] = arg8.method8834();
								arg5[2] = arg8.method8834();
								arg5[3] = arg8.method8834();
								arg5[4] = arg8.method8859();
							}
						}
					}
					if (local31 != null) {
						Static214.method3193(arg6 >> 3, arg2 >> 3, local31);
					}
					if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg4] != null) {
						local48 = arg2 + 7;
						local62 = arg6 + 7;
						for (local69 = arg2; local69 < local48; local69++) {
							for (local281 = arg6; local281 < local62; local281++) {
								super.aByteArrayArrayArray15[arg4][local69][local281] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local62 <= 0);
			for (local69 = 0; local69 < local62; local69++) {
				@Pc(78) Class85 local78 = new Class85(arg0, arg8, 2);
				if (local78.anInt2272 == 31) {
					@Pc(89) Class212 local89 = Static270.aClass299_1.method6592(arg8.method8859());
					local78.method2167(local89.anInt5269, local89.anInt5263, local89.anInt5266, local89.anInt5261);
				}
				if (arg0.method8086() > 0) {
					@Pc(106) Class4_Sub29 local106 = local78.aClass4_Sub29_2;
					local112 = local106.method7627() >> 9;
					local118 = local106.method7628() >> 9;
					if (arg1 == local78.anInt2270 && local37 <= local112 && local112 < local37 + 8 && local43 <= local118 && local43 + 8 > local118) {
						local164 = Static560.method7431(arg7, local106.method7628() & 0xFFF, local106.method7627() & 0xFFF) + (arg2 << 9);
						local112 = local164 >> 9;
						local186 = Static376.method4930(local106.method7628() & 0xFFF, local106.method7627() & 0xFFF, arg7) + (arg6 << 9);
						local118 = local186 >> 9;
						if (local112 >= 0 && local118 >= 0 && local112 < super.anInt2556 && super.anInt2549 > local118) {
							local106.method7629(local186, super.anIntArrayArrayArray9[arg1][local112][local118] - local106.method7630(), local164);
							Static214.method3194(local78);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!ha;IILclient!wj;I)V")
	public void method2470(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class389 arg4, @OriginalArg(6) int arg5) {
		@Pc(19) Interface20 local19 = this.method2472(arg3, arg0, arg5, arg2);
		if (local19 == null) {
			return;
		}
		@Pc(28) Class342 local28 = Static441.aClass74_169.method2075(local19.method7087());
		@Pc(32) int local32 = local19.method7086();
		@Pc(36) int local36 = local19.method7088();
		if (local28.method7500()) {
			Static497.method6720(local28, arg3, arg0, arg2);
		}
		if (local19.method7089()) {
			local19.method7085(arg1);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				Static263.method3787(arg3, arg0, arg2);
			} else if (arg5 == 2) {
				Static171.method2837(arg3, arg0, arg2, qb.class);
				if (local28.anInt8707 != 0 && arg0 + local28.anInt8716 < super.anInt2556 && arg2 + local28.anInt8716 < super.anInt2549 && local28.anInt8728 + arg0 < super.anInt2556 && super.anInt2549 > arg2 + local28.anInt8728) {
					arg4.method8807(local36, !local28.aBoolean684, arg0, local28.anInt8716, local28.aBoolean677, local28.anInt8728, arg2);
				}
				if (local32 == 9) {
					if ((local36 & 0x1) == 0) {
						Static142.method4309(arg0, arg3, arg2, 8);
						return;
					}
					Static142.method4309(arg0, arg3, arg2, 16);
					return;
				}
			} else {
				if (arg5 == 3) {
					Static538.method7209(arg3, arg0, arg2);
					if (local28.anInt8707 == 1) {
						arg4.method8814(arg2, arg0);
						return;
					}
				}
				return;
			}
			return;
		}
		Static512.method6970(arg3, arg0, arg2);
		if (local28.anInt8707 != 0) {
			arg4.method8810(!local28.aBoolean684, local28.aBoolean677, local36, local32, arg2, arg0);
		}
		if (local28.anInt8689 != 1) {
			return;
		}
		if (local36 == 0) {
			Static142.method4309(arg0, arg3, arg2, 1);
			return;
		}
		if (local36 == 1) {
			Static142.method4309(arg0, arg3, arg2 + 1, 2);
		} else if (local36 == 2) {
			Static142.method4309(arg0 + 1, arg3, arg2, 1);
			return;
		} else if (local36 == 3) {
			Static142.method4309(arg0, arg3, arg2, 2);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!wj;IIIIZIIILclient!ha;)V")
	public void method2471(@OriginalArg(0) int arg0, @OriginalArg(1) Class389 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class33 arg9) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0 && !Static260.method7101(arg7, arg8, Static431.anInt6799, arg5)) {
			return;
		}
		if (this.anInt2557 > arg2) {
			this.anInt2557 = arg2;
		}
		@Pc(37) Class342 local37 = Static441.aClass74_169.method2075(arg3);
		if (Static124.aClass4_Sub20_4.aClass8_Sub2_1.method1355() == 0 && local37.aBoolean680) {
			return;
		}
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg0 == 1 || arg0 == 3) {
			local62 = local37.anInt8728;
			local65 = local37.anInt8716;
		} else {
			local62 = local37.anInt8716;
			local65 = local37.anInt8728;
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (arg5 + local62 > super.anInt2556) {
			local90 = arg5;
			local94 = arg5 + 1;
		} else {
			local90 = arg5 + (local62 >> 1);
			local94 = arg5 + (local62 + 1 >> 1);
		}
		@Pc(136) int local136;
		@Pc(130) int local130;
		if (arg7 + local65 <= super.anInt2549) {
			local130 = arg7 + (local65 + 1 >> 1);
			local136 = (local65 >> 1) + arg7;
		} else {
			local130 = arg7 + 1;
			local136 = arg7;
		}
		@Pc(148) Class42 local148 = Static140.aClass42Array4[arg8];
		@Pc(176) int local176 = local148.method7450(local136, local90) + local148.method7450(local136, local94) + local148.method7450(local130, local90) + local148.method7450(local130, local94) >> 2;
		@Pc(184) int local184 = (arg5 << 9) + (local62 << 8);
		@Pc(193) int local193 = (arg7 << 9) + (local65 << 8);
		@Pc(205) boolean local205 = Static129.aBoolean168 && !super.aBoolean182 && local37.aBoolean679;
		if (local37.method7500()) {
			Static245.method6857((Class3_Sub1_Sub2_Sub2_Sub2) null, (Class3_Sub1_Sub2_Sub2_Sub1) null, arg2, arg7, local37, arg0, arg5);
		}
		@Pc(242) boolean local242 = arg6 == -1 && local37.anInt8727 == -1 && local37.anIntArray617 == null && local37.anIntArray620 == null && !local37.aBoolean682 && !local37.aBoolean685;
		if (Static620.aBoolean707 && (Static440.method6065(arg4) && local37.anInt8689 != 1 || !(!Static153.method2633(arg4) || local37.anInt8689 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(399) Class3_Sub1_Sub2 local399;
			@Pc(367) Class3_Sub1_Sub2_Sub3 local367;
			@Pc(371) int local371;
			@Pc(464) int local464;
			if (arg4 == 10 || arg4 == 11) {
				local367 = null;
				if (local242) {
					@Pc(430) Class3_Sub1_Sub2_Sub3 local430 = new Class3_Sub1_Sub2_Sub3(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, arg5 + local62 - 1, arg7, arg7 + local65 - 1, arg4, arg0, local205);
					local399 = local430;
					local371 = local430.method3928();
					local367 = local430;
				} else {
					local371 = 15;
					local399 = new Class3_Sub1_Sub2_Sub4(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, arg5 + local62 - 1, arg7, arg7 + local65 - 1, arg4, arg0, arg6);
				}
				if (Static573.method7594(local399, false)) {
					if (local367 != null && local367.method7089()) {
						local367.method7084(arg9);
					}
					if (local37.aBoolean683 && Static129.aBoolean168) {
						if (local371 > 30) {
							local371 = 30;
						}
						for (local464 = 0; local464 <= local62; local464++) {
							for (@Pc(468) int local468 = 0; local468 <= local65; local468++) {
								local148.ka(arg5 + local464, arg7 - -local468, local371);
							}
						}
					}
				}
				if (local37.anInt8707 != 0 && arg1 != null) {
					arg1.method8818(arg5, local37.aBoolean677, arg7, local62, local65, !local37.aBoolean684);
				}
			} else if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
				if (local242) {
					local367 = new Class3_Sub1_Sub2_Sub3(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, arg5 + local62 - 1, arg7, arg7 + local65 - 1, arg4, arg0, local205);
					local399 = local367;
					if (local367.method7089()) {
						local367.method7084(arg9);
					}
				} else {
					local399 = new Class3_Sub1_Sub2_Sub4(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, arg5 + local62 - 1, arg7, arg7 + local65 - 1, arg4, arg0, arg6);
				}
				Static573.method7594(local399, false);
				if (Static129.aBoolean168 && !super.aBoolean182 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg2 > 0 && local37.anInt8689 != 0) {
					super.aByteArrayArrayArray13[arg2][arg5][arg7] = (byte) (super.aByteArrayArrayArray13[arg2][arg5][arg7] | 0x4);
				}
				if (local37.anInt8707 != 0 && arg1 != null) {
					arg1.method8818(arg5, local37.aBoolean677, arg7, local62, local65, !local37.aBoolean684);
				}
			} else {
				@Pc(710) Class3_Sub1_Sub4 local710;
				if (arg4 == 0) {
					@Pc(682) int local682 = local37.anInt8689;
					if (Static362.aBoolean410 && local37.anInt8689 == -1) {
						local682 = 1;
					}
					if (local242) {
						@Pc(708) Class3_Sub1_Sub4_Sub2 local708 = new Class3_Sub1_Sub4_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, local205);
						local710 = local708;
						if (local708.method7089()) {
							local708.method7084(arg9);
						}
					} else {
						local710 = new Class3_Sub1_Sub4_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, arg6);
					}
					Static459.method6403(arg2, arg5, arg7, local710, (Class3_Sub1_Sub4) null);
					if (arg0 == 0) {
						if (Static129.aBoolean168 && local37.aBoolean683) {
							local148.ka(arg5, arg7, 50);
							local148.ka(arg5, arg7 + 1, 50);
						}
						if (local682 == 1 && !super.aBoolean182) {
							Static499.method6749(arg5, local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
						}
					} else if (arg0 == 1) {
						if (Static129.aBoolean168 && local37.aBoolean683) {
							local148.ka(arg5, arg7 + 1, 50);
							local148.ka(arg5 + 1, arg7 + 1, 50);
						}
						if (local682 == 1 && !super.aBoolean182) {
							Static499.method6749(arg5, -local37.anInt8722, 2, arg2, arg7 + 1, local37.anInt8719);
						}
					} else if (arg0 == 2) {
						if (Static129.aBoolean168 && local37.aBoolean683) {
							local148.ka(arg5 + 1, arg7, 50);
							local148.ka(arg5 + 1, arg7 + 1, 50);
						}
						if (local682 == 1 && !super.aBoolean182) {
							Static499.method6749(arg5 + 1, -local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
						}
					} else if (arg0 == 3) {
						if (Static129.aBoolean168 && local37.aBoolean683) {
							local148.ka(arg5, arg7, 50);
							local148.ka(arg5 + 1, arg7, 50);
						}
						if (local682 == 1 && !super.aBoolean182) {
							Static499.method6749(arg5, local37.anInt8722, 2, arg2, arg7, local37.anInt8719);
						}
					}
					if (local37.anInt8707 != 0 && arg1 != null) {
						arg1.method8801(local37.aBoolean677, arg0, arg5, !local37.aBoolean684, arg4, arg7);
					}
					if (local37.anInt8725 != 64) {
						Static426.method5913(arg2, arg5, arg7, local37.anInt8725);
					}
				} else {
					@Pc(981) Class3_Sub1_Sub4 local981;
					@Pc(971) Class3_Sub1_Sub4_Sub2 local971;
					if (arg4 == 1) {
						if (local242) {
							local971 = new Class3_Sub1_Sub4_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, local205);
							if (local971.method7089()) {
								local971.method7084(arg9);
							}
							local981 = local971;
						} else {
							local981 = new Class3_Sub1_Sub4_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, arg6);
						}
						Static459.method6403(arg2, arg5, arg7, local981, (Class3_Sub1_Sub4) null);
						if (local37.aBoolean683 && Static129.aBoolean168) {
							if (arg0 == 0) {
								local148.ka(arg5, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local148.ka(arg5 + 1, arg7 + 1, 50);
							} else if (arg0 == 2) {
								local148.ka(arg5 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local148.ka(arg5, arg7, 50);
							}
						}
						if (local37.anInt8707 != 0 && arg1 != null) {
							arg1.method8801(local37.aBoolean677, arg0, arg5, !local37.aBoolean684, arg4, arg7);
						}
					} else if (arg4 == 2) {
						local371 = arg0 + 1 & 0x3;
						if (local242) {
							@Pc(1114) Class3_Sub1_Sub4_Sub2 local1114 = new Class3_Sub1_Sub4_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0 + 4, local205);
							@Pc(1130) Class3_Sub1_Sub4_Sub2 local1130 = new Class3_Sub1_Sub4_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, local371, local205);
							if (local1114.method7089()) {
								local1114.method7084(arg9);
							}
							local981 = local1114;
							local710 = local1130;
							if (local1130.method7089()) {
								local1130.method7084(arg9);
							}
						} else {
							local981 = new Class3_Sub1_Sub4_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0 + 4, arg6);
							local710 = new Class3_Sub1_Sub4_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, local371, arg6);
						}
						Static459.method6403(arg2, arg5, arg7, local981, local710);
						if ((local37.anInt8689 == 1 || Static362.aBoolean410 && local37.anInt8689 == -1) && !super.aBoolean182) {
							if (arg0 == 0) {
								Static499.method6749(arg5, local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
								Static499.method6749(arg5, local37.anInt8722, 2, arg2, arg7 + 1, local37.anInt8719);
							} else if (arg0 == 1) {
								Static499.method6749(arg5 + 1, local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
								Static499.method6749(arg5, local37.anInt8722, 2, arg2, arg7 + 1, local37.anInt8719);
							} else if (arg0 == 2) {
								Static499.method6749(arg5 + 1, local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
								Static499.method6749(arg5, local37.anInt8722, 2, arg2, arg7, local37.anInt8719);
							} else if (arg0 == 3) {
								Static499.method6749(arg5, local37.anInt8722, 1, arg2, arg7, local37.anInt8719);
								Static499.method6749(arg5, local37.anInt8722, 2, arg2, arg7, local37.anInt8719);
							}
						}
						if (local37.anInt8707 != 0 && arg1 != null) {
							arg1.method8801(local37.aBoolean677, arg0, arg5, !local37.aBoolean684, arg4, arg7);
						}
						if (local37.anInt8725 != 64) {
							Static426.method5913(arg2, arg5, arg7, local37.anInt8725);
						}
					} else if (arg4 == 3) {
						if (local242) {
							local971 = new Class3_Sub1_Sub4_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, local205);
							if (local971.method7089()) {
								local971.method7084(arg9);
							}
							local981 = local971;
						} else {
							local981 = new Class3_Sub1_Sub4_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg4, arg0, arg6);
						}
						Static459.method6403(arg2, arg5, arg7, local981, (Class3_Sub1_Sub4) null);
						if (local37.aBoolean683 && Static129.aBoolean168) {
							if (arg0 == 0) {
								local148.ka(arg5, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local148.ka(arg5 + 1, arg7 + 1, 50);
							} else if (arg0 == 2) {
								local148.ka(arg5 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local148.ka(arg5, arg7, 50);
							}
						}
						if (local37.anInt8707 != 0 && arg1 != null) {
							arg1.method8801(local37.aBoolean677, arg0, arg5, !local37.aBoolean684, arg4, arg7);
						}
					} else if (arg4 == 9) {
						if (local242) {
							local367 = new Class3_Sub1_Sub2_Sub3(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, arg5, arg7, arg7, arg4, arg0, local205);
							local399 = local367;
							if (local367.method7089()) {
								local367.method7084(arg9);
							}
						} else {
							local399 = new Class3_Sub1_Sub2_Sub4(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg5, local62 + arg5 - 1, arg7, arg7 + local65 - 1, arg4, arg0, arg6);
						}
						Static573.method7594(local399, false);
						if (local37.anInt8689 == 1 && !super.aBoolean182) {
							@Pc(1571) byte local1571;
							if ((arg0 & 0x1) == 0) {
								local1571 = 8;
							} else {
								local1571 = 16;
							}
							Static499.method6749(arg5, 0, local1571, arg2, arg7, local37.anInt8719);
						}
						if (local37.anInt8707 != 0 && arg1 != null) {
							arg1.method8818(arg5, local37.aBoolean677, arg7, local62, local65, !local37.aBoolean684);
						}
						if (local37.anInt8725 != 64) {
							Static426.method5913(arg2, arg5, arg7, local37.anInt8725);
						}
					} else {
						@Pc(1645) Class3_Sub1_Sub3 local1645;
						if (arg4 == 4) {
							if (local242) {
								@Pc(1664) Class3_Sub1_Sub3_Sub1 local1664 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, arg0);
								if (local1664.method7089()) {
									local1664.method7084(arg9);
								}
								local1645 = local1664;
							} else {
								local1645 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, arg0, arg6);
							}
							Static417.method5292(arg2, arg5, arg7, local1645, (Class3_Sub1_Sub3) null);
						} else {
							@Pc(1686) int local1686;
							@Pc(1692) Interface20 local1692;
							@Pc(1731) Class3_Sub1_Sub3_Sub1 local1731;
							if (arg4 == 5) {
								local1686 = 65;
								local1692 = (Interface20) Static572.method7588(arg2, arg5, arg7);
								if (local1692 != null) {
									local1686 = Static441.aClass74_169.method2075(local1692.method7087()).anInt8725 + 1;
								}
								if (local242) {
									local1731 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, local1686 * Static324.anIntArray403[arg0], local1686 * Static277.anIntArray343[arg0], arg4, arg0);
									local1645 = local1731;
									if (local1731.method7089()) {
										local1731.method7084(arg9);
									}
								} else {
									local1645 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, Static324.anIntArray403[arg0] * local1686, Static277.anIntArray343[arg0] * local1686, arg4, arg0, arg6);
								}
								Static417.method5292(arg2, arg5, arg7, local1645, (Class3_Sub1_Sub3) null);
							} else if (arg4 == 6) {
								local1686 = 33;
								local1692 = (Interface20) Static572.method7588(arg2, arg5, arg7);
								if (local1692 != null) {
									local1686 = Static441.aClass74_169.method2075(local1692.method7087()).anInt8725 / 2 + 1;
								}
								if (local242) {
									local1731 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, local1686 * Static324.anIntArray403[arg0], Static277.anIntArray343[arg0] * local1686, arg4, arg0 + 4);
									if (local1731.method7089()) {
										local1731.method7084(arg9);
									}
									local1645 = local1731;
								} else {
									local1645 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, Static180.anIntArray681[arg0] * local1686, local1686 * Static91.anIntArray118[arg0], arg4, arg0 + 4, arg6);
								}
								Static417.method5292(arg2, arg5, arg7, local1645, (Class3_Sub1_Sub3) null);
							} else if (arg4 == 7) {
								local1686 = arg0 + 2 & 0x3;
								if (local242) {
									@Pc(1931) Class3_Sub1_Sub3_Sub1 local1931 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, local1686 + 4);
									if (local1931.method7089()) {
										local1931.method7084(arg9);
									}
									local1645 = local1931;
								} else {
									local1645 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, local1686 + 4, arg6);
								}
								Static417.method5292(arg2, arg5, arg7, local1645, (Class3_Sub1_Sub3) null);
							} else if (arg4 == 8) {
								local371 = arg0 + 2 & 0x3;
								local464 = 33;
								@Pc(1965) Interface20 local1965 = (Interface20) Static572.method7588(arg2, arg5, arg7);
								if (local1965 != null) {
									local464 = Static441.aClass74_169.method2075(local1965.method7087()).anInt8725 / 2 + 1;
								}
								@Pc(2008) Class3_Sub1_Sub3 local2008;
								@Pc(2027) Class3_Sub1_Sub3 local2027;
								if (local242) {
									local2008 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, local464 * Static180.anIntArray681[arg0], Static91.anIntArray118[arg0] * local464, arg4, arg0 + 4);
									local2027 = new Class3_Sub1_Sub3_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, local371 + 4);
									if (local2008.method7089()) {
										local2008.method7084(arg9);
									}
									if (local2027.method7089()) {
										local2027.method7084(arg9);
									}
								} else {
									local2008 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, local464 * Static180.anIntArray681[arg0], Static91.anIntArray118[arg0] * local464, arg4, arg0 + 4, arg6);
									local2027 = new Class3_Sub1_Sub3_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, 0, 0, arg4, local371 + 4, arg6);
								}
								Static417.method5292(arg2, arg5, arg7, local2008, local2027);
							}
						}
					}
				}
			}
		} else if (Static124.aClass4_Sub20_4.aClass8_Sub24_1.method7743() != 0 || local37.anInt8742 != 0 || local37.anInt8707 == 1 || local37.aBoolean691) {
			@Pc(307) Class3_Sub1_Sub5 local307;
			if (local242) {
				@Pc(324) Class3_Sub1_Sub5_Sub1 local324 = new Class3_Sub1_Sub5_Sub1(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg0, local205);
				local307 = local324;
				if (local324.method7089()) {
					local324.method7084(arg9);
				}
			} else {
				local307 = new Class3_Sub1_Sub5_Sub2(arg9, local37, arg2, arg8, local184, local176, local193, super.aBoolean182, arg0, arg6);
			}
			Static478.method6572(arg2, arg5, arg7, local307);
			if (local37.anInt8707 == 1 && arg1 != null) {
				arg1.method8815(arg7, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIII)Lclient!qb;")
	public Interface20 method2472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface20 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface20) Static572.method7588(arg0, arg1, arg3);
		}
		if (arg2 == 1) {
			local5 = (Interface20) Static273.method3954(arg0, arg1, arg3);
		}
		if (arg2 == 2) {
			local5 = (Interface20) Static130.method2321(arg0, arg1, arg3, qb.class);
		}
		if (arg2 == 3) {
			local5 = (Interface20) Static191.method2972(arg0, arg1, arg3);
		}
		return local5;
	}
}
