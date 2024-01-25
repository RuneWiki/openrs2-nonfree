import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!jda", name = "X", descriptor = "I")
	public int anInt4463 = 99;

	static {
		new Class306("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIZ)V")
	public Class149_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static458.aClass279_6, Static11.aClass61_1);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ge;Lclient!qa;[IIIIIIIII)V")
	public void method3875(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean310) {
			return;
		}
		@Pc(18) Class283 local18 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(30) int local30 = (arg9 & 0x7) * 8;
		@Pc(36) int local36 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(62) int local62;
			@Pc(311) int local311;
			@Pc(66) int local66;
			while (arg0.anInt4555 < arg0.aByteArray66.length) {
				local41 = arg0.method3922();
				if (local41 == 0) {
					local18 = new Class283(arg0);
				} else {
					@Pc(119) int local119;
					@Pc(166) int local166;
					@Pc(188) int local188;
					@Pc(113) int local113;
					if (local41 == 1) {
						local62 = arg0.method3922();
						if (local62 > 0) {
							for (local66 = 0; local66 < local62; local66++) {
								@Pc(75) Class62 local75 = new Class62(arg1, arg0, 2);
								if (local75.anInt1600 == 31) {
									@Pc(90) Class231 local90 = Static270.aClass195_1.method4840(arg0.method3967());
									local75.method1460(local90.anInt6448, local90.anInt6450, local90.anInt6446, local90.anInt6451);
								}
								if (arg1.method7217() > 0) {
									@Pc(107) Class1_Sub2 local107 = local75.aClass1_Sub2_1;
									local113 = local107.method2426() >> 9;
									local119 = local107.method2427() >> 9;
									if (local75.anInt1596 == arg5 && local30 <= local113 && local30 + 8 > local113 && local119 >= local36 && local119 < local36 + 8) {
										local166 = (arg6 << 9) + Static272.method4466(local107.method2426() & 0xFFF, local107.method2427() & 0xFFF, arg4);
										local113 = local166 >> 9;
										local188 = (arg8 << 9) + Static69.method1251(local107.method2426() & 0xFFF, arg4, local107.method2427() & 0xFFF);
										local119 = local188 >> 9;
										if (local113 >= 0 && local119 >= 0 && local113 < super.anInt4435 && local119 < super.anInt4448) {
											local107.method2433(local188, super.anIntArrayArrayArray5[arg5][local113][local119] - local107.method2428(), local166);
											Static361.method5389(local75);
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local18 == null) {
							local18 = new Class283();
						}
						local18.method6531(arg0);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						for (local62 = 0; local62 < 4; local62++) {
							@Pc(278) byte local278 = arg0.method3928();
							@Pc(315) int local315;
							if (local278 == 0 && super.aByteArrayArrayArray14[arg7] != null) {
								if (local62 <= arg5) {
									local311 = arg6;
									local315 = arg6 + 7;
									local113 = arg8;
									if (local315 < 0) {
										local315 = 0;
									} else if (local315 >= super.anInt4435) {
										local315 = super.anInt4435;
									}
									if (arg6 < 0) {
										local311 = 0;
									} else if (super.anInt4435 <= arg6) {
										local311 = super.anInt4435;
									}
									local119 = arg8 + 7;
									if (arg8 < 0) {
										local113 = 0;
									} else if (super.anInt4448 <= arg8) {
										local113 = super.anInt4448;
									}
									if (local119 < 0) {
										local119 = 0;
									} else if (super.anInt4448 <= local119) {
										local119 = super.anInt4448;
									}
									while (local311 < local315) {
										while (local119 > local113) {
											super.aByteArrayArrayArray14[arg7][local311][local113] = 0;
											local113++;
										}
										local311++;
									}
								}
							} else if (local278 == 1) {
								if (super.aByteArrayArrayArray14[arg7] == null) {
									super.aByteArrayArrayArray14[arg7] = new byte[super.anInt4435 + 1][super.anInt4448 + 1];
								}
								for (local311 = 0; local311 < 64; local311 += 4) {
									for (local315 = 0; local315 < 64; local315 += 4) {
										@Pc(321) byte local321 = arg0.method3928();
										if (arg5 >= local62) {
											for (local119 = local311; local119 < local311 + 4; local119++) {
												for (local166 = local315; local166 < local315 + 4; local166++) {
													if (local30 <= local119 && local30 + 8 > local119 && local166 >= local36 && local36 < local36 + 8) {
														local188 = Static181.method2703(arg4, local166 & 0x7, local119 & 0x7) + arg6;
														@Pc(373) int local373 = arg8 + Static535.method7412(local166 & 0x7, local119 & 0x7, arg4);
														if (local188 >= 0 && super.anInt4435 > local188 && local373 >= 0 && super.anInt4448 > local373) {
															super.aByteArrayArrayArray14[arg7][local188][local373] = local321;
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
						arg0.anInt4555 += 10;
					} else {
						arg2[0] = arg0.method3967();
						arg2[1] = arg0.method3964();
						arg2[2] = arg0.method3964();
						arg2[3] = arg0.method3964();
						arg2[4] = arg0.method3967();
					}
				}
			}
			if (local18 != null) {
				Static126.method2139(arg8 >> 3, local18, arg6 >> 3);
			}
			if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg7] != null) {
				local41 = arg6 + 7;
				local62 = arg8 + 7;
				for (local66 = arg6; local66 < local41; local66++) {
					for (local311 = arg8; local311 < local62; local311++) {
						super.aByteArrayArrayArray14[arg7][local66][local311] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[ILclient!qa;Lclient!ge;II)V")
	public void method3877(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class122 arg1, @OriginalArg(3) Class1_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean310) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class283 local19 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(88) int local88;
			@Pc(97) int local97;
			@Pc(101) int local101;
			@Pc(42) int local42;
			label308: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(241) int local241;
					@Pc(245) int local245;
					while (arg2.anInt4555 < arg2.aByteArray66.length) {
						local24 = arg2.method3922();
						if (local24 == 0) {
							local19 = new Class283(arg2);
						} else {
							if (local24 == 1) {
								local35 = arg2.method3922();
								continue label308;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class283();
								}
								local19.method6531(arg2);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(229) byte local229 = arg2.method3928();
									if (local229 == 0 && super.aByteArrayArrayArray14[local35] != null) {
										local241 = arg3;
										local245 = arg3 + 64;
										local88 = arg4;
										if (arg3 < 0) {
											local241 = 0;
										} else if (super.anInt4435 <= arg3) {
											local241 = super.anInt4435;
										}
										local97 = arg4 + 64;
										if (local245 < 0) {
											local245 = 0;
										} else if (super.anInt4435 <= local245) {
											local245 = super.anInt4435;
										}
										if (arg4 < 0) {
											local88 = 0;
										} else if (arg4 >= super.anInt4448) {
											local88 = super.anInt4448;
										}
										if (local97 < 0) {
											local97 = 0;
										} else if (local97 >= super.anInt4448) {
											local97 = super.anInt4448;
										}
										while (local245 > local241) {
											while (local97 > local88) {
												super.aByteArrayArrayArray14[local35][local241][local88] = 0;
												local88++;
											}
											local241++;
										}
									} else if (local229 == 1) {
										if (super.aByteArrayArrayArray14[local35] == null) {
											super.aByteArrayArrayArray14[local35] = new byte[super.anInt4435 + 1][super.anInt4448 + 1];
										}
										for (local241 = 0; local241 < 64; local241 += 4) {
											for (local245 = 0; local245 < 64; local245 += 4) {
												@Pc(382) byte local382 = arg2.method3928();
												for (local97 = local241 + arg3; local97 < local241 + arg3 + 4; local97++) {
													for (local101 = arg4 + local245; local101 < arg4 + local245 + 4; local101++) {
														if (local97 >= 0 && local97 < super.anInt4435 && local101 >= 0 && local101 < super.anInt4448) {
															super.aByteArrayArrayArray14[local35][local97][local101] = local382;
														}
													}
												}
											}
										}
									} else if (local229 == 2) {
										if (super.aByteArrayArrayArray14[local35] == null) {
											super.aByteArrayArrayArray14[local35] = new byte[super.anInt4435 + 1][super.anInt4448 + 1];
										}
										if (local35 > 0) {
											local241 = arg3;
											local245 = arg3 + 64;
											local88 = arg4;
											if (arg3 < 0) {
												local241 = 0;
											} else if (super.anInt4435 <= arg3) {
												local241 = super.anInt4435;
											}
											local97 = arg4 + 64;
											if (arg4 < 0) {
												local88 = 0;
											} else if (super.anInt4448 <= arg4) {
												local88 = super.anInt4448;
											}
											if (local245 < 0) {
												local245 = 0;
											} else if (local245 >= super.anInt4435) {
												local245 = super.anInt4435;
											}
											if (local97 < 0) {
												local97 = 0;
											} else if (super.anInt4448 <= local97) {
												local97 = super.anInt4448;
											}
											while (local245 > local241) {
												while (local88 < local97) {
													super.aByteArrayArrayArray14[local35][local241][local88] = super.aByteArrayArrayArray14[local35 - 1][local241][local88];
													local88++;
												}
												local241++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg0 == null) {
								arg2.anInt4555 += 10;
							} else {
								arg0[0] = arg2.method3967();
								arg0[1] = arg2.method3964();
								arg0[2] = arg2.method3964();
								arg0[3] = arg2.method3964();
								arg0[4] = arg2.method3967();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local35 = 0; local35 < 8; local35++) {
								local42 = local24 + (arg3 >> 3);
								local241 = local35 + (arg4 >> 3);
								if (local42 >= 0 && local42 < super.anInt4435 >> 3 && local241 >= 0 && super.anInt4448 >> 3 > local241) {
									Static126.method2139(local241, local19, local42);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray14 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray14[local24] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local42 = 0; local42 < 16; local42++) {
										local241 = (arg3 >> 2) + local35;
										local245 = local42 + (arg4 >> 2);
										if (local241 >= 0 && local241 < 26 && local245 >= 0 && local245 < 26) {
											super.aByteArrayArrayArray14[local24][local241][local245] = 0;
										}
									}
								}
							}
						}
					}
					return;
				}
			} while (local35 <= 0);
			for (local42 = 0; local42 < local35; local42++) {
				@Pc(51) Class62 local51 = new Class62(arg1, arg2, 2);
				if (local51.anInt1600 == 31) {
					@Pc(62) Class231 local62 = Static270.aClass195_1.method4840(arg2.method3967());
					local51.method1460(local62.anInt6448, local62.anInt6450, local62.anInt6446, local62.anInt6451);
				}
				if (arg1.method7217() > 0) {
					@Pc(79) Class1_Sub2 local79 = local51.aClass1_Sub2_1;
					local88 = local79.method2426() + (arg3 << 9);
					local97 = local79.method2427() + (arg4 << 9);
					local101 = local88 >> 9;
					@Pc(105) int local105 = local97 >> 9;
					if (local101 >= 0 && local105 >= 0 && local101 < super.anInt4435 && super.anInt4448 > local105) {
						local79.method2433(local97, super.anIntArrayArrayArray5[local51.anInt1596][local101][local105] - local79.method2428(), local88);
						Static361.method5389(local51);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method3878(@OriginalArg(0) Class122 arg0) {
		Static409.method6079(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt4443 > 1) {
			for (local13 = 0; local13 < super.anInt4435; local13++) {
				for (local17 = 0; local17 < super.anInt4448; local17++) {
					if ((Static530.aByteArrayArrayArray17[1][local13][local17] & 0x2) == 2) {
						Static74.method1289(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt4443 > local13; local13++) {
			for (local17 = 0; super.anInt4448 >= local17; local17++) {
				for (@Pc(59) int local59 = 0; super.anInt4435 >= local59; local59++) {
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(132) int local132;
					@Pc(228) int local228;
					@Pc(237) int local237;
					@Pc(257) int local257;
					@Pc(261) int local261;
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x1) != 0) {
						local77 = local17;
						local79 = local17;
						local81 = local13;
						local83 = local13;
						while (local77 > 0 && (super.aByteArrayArrayArray12[local13][local59][local77 - 1] & 0x1) != 0) {
							local77--;
						}
						while (local79 < super.anInt4448 && (super.aByteArrayArrayArray12[local13][local59][local79 + 1] & 0x1) != 0) {
							local79++;
						}
						label164: while (local81 > 0) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray12[local81 - 1][local59][local132] & 0x1) == 0) {
									break label164;
								}
							}
							local81--;
						}
						label153: while (local83 < 3) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray12[local83 + 1][local59][local132] & 0x1) == 0) {
									break label153;
								}
							}
							local83++;
						}
						local132 = (local79 + 1 - local77) * (local83 + 1 - local81);
						if (local132 >= 2) {
							local228 = super.anIntArrayArrayArray5[local83][local59][local77] - 960;
							local237 = super.anIntArrayArrayArray5[local81][local59][local77];
							Static146.method2337(1, local59 << 9, local59 << 9, local77 << 9, (local79 << 9) + 512, local228, local237);
							for (local257 = local81; local257 <= local83; local257++) {
								for (local261 = local77; local261 <= local79; local261++) {
									super.aByteArrayArrayArray12[local257][local59][local261] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x2) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local13;
						while (local77 > 0 && (super.aByteArrayArrayArray12[local13][local77 - 1][local17] & 0x2) != 0) {
							local77--;
						}
						while (local79 < super.anInt4435 && (super.aByteArrayArrayArray12[local13][local79 + 1][local17] & 0x2) != 0) {
							local79++;
						}
						local83 = local13;
						label217: while (local81 > 0) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray12[local81 - 1][local132][local17] & 0x2) == 0) {
									break label217;
								}
							}
							local81--;
						}
						label206: while (local83 < 3) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray12[local83 + 1][local132][local17] & 0x2) == 0) {
									break label206;
								}
							}
							local83++;
						}
						local132 = (local79 + 1 - local77) * ((local83 + 1) - local81);
						if (local132 >= 2) {
							local228 = super.anIntArrayArrayArray5[local83][local77][local17] - 960;
							local237 = super.anIntArrayArrayArray5[local81][local77][local17];
							Static146.method2337(2, local77 << 9, (local79 << 9) + 512, local17 << 9, local17 << 9, local228, local237);
							for (local257 = local81; local257 <= local83; local257++) {
								for (local261 = local77; local261 <= local79; local261++) {
									super.aByteArrayArrayArray12[local257][local261][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local13][local59][local17] & 0x4) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local17;
						local83 = local17;
						while (local81 > 0 && (super.aByteArrayArrayArray12[local13][local59][local81 - 1] & 0x4) != 0) {
							local81--;
						}
						while (local83 < super.anInt4448 && (super.aByteArrayArrayArray12[local13][local59][local83 + 1] & 0x4) != 0) {
							local83++;
						}
						label271: while (local77 > 0) {
							for (local132 = local81; local132 <= local83; local132++) {
								if ((super.aByteArrayArrayArray12[local13][local77 - 1][local132] & 0x4) == 0) {
									break label271;
								}
							}
							local77--;
						}
						label260: while (super.anInt4435 > local79) {
							for (local132 = local81; local132 <= local83; local132++) {
								if ((super.aByteArrayArrayArray12[local13][local79 + 1][local132] & 0x4) == 0) {
									break label260;
								}
							}
							local79++;
						}
						if ((local83 + 1 - local81) * (local79 + 1 - local77) >= 4) {
							local132 = super.anIntArrayArrayArray5[local13][local77][local81];
							Static146.method2337(4, local77 << 9, (local79 << 9) + 512, local81 << 9, (local83 << 9) + 512, local132, local132);
							for (@Pc(695) int local695 = local77; local695 <= local79; local695++) {
								for (local228 = local81; local228 <= local83; local228++) {
									super.aByteArrayArrayArray12[local13][local695][local228] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!fd;Lclient!qa;IIII)V")
	public void method3879(@OriginalArg(0) int arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(23) Interface18 local23 = null;
		if (arg5 == 0) {
			local23 = (Interface18) Static453.method6441(arg4, arg0, arg3);
		}
		if (arg5 == 1) {
			local23 = (Interface18) Static53.method1029(arg4, arg0, arg3);
		}
		if (arg5 == 2) {
			local23 = (Interface18) Static156.method2467(arg4, arg0, arg3, vaa.class);
		}
		if (arg5 == 3) {
			local23 = (Interface18) Static117.method1983(arg4, arg0, arg3);
		}
		if (local23 == null) {
			return;
		}
		@Pc(82) Class36 local82 = Static308.aClass96_4.method2274(local23.method7467());
		@Pc(86) int local86 = local23.method7465();
		@Pc(90) int local90 = local23.method7469();
		if (local82.method951()) {
			Static342.method5181(arg3, arg4, local82, arg0);
		}
		if (local23.method7471()) {
			local23.method7470(arg2);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				@Pc(121) Class49_Sub3 local121 = Static53.method1029(arg4, arg0, arg3);
				if (!(local121 instanceof Class49_Sub3_Sub3)) {
					Static531.method7353(arg4, arg0, arg3);
					return;
				}
				((Class49_Sub3_Sub3) local121).aClass49_Sub3_3 = null;
				return;
			}
			if (arg5 == 2) {
				@Pc(185) Class49_Sub2 local185 = Static156.method2467(arg4, arg0, arg3, vaa.class);
				if (local185 instanceof Class49_Sub2_Sub3 && local185.aShort117 == arg0 && arg3 == local185.aShort116) {
					((Class49_Sub2_Sub3) local185).aClass49_Sub2_2 = null;
				} else {
					Static273.method4469(arg4, arg0, arg3, vaa.class);
				}
				if (local82.anInt969 == 0 || super.anInt4435 <= local82.anInt975 + arg0 || arg3 + local82.anInt975 >= super.anInt4448 || super.anInt4435 <= local82.anInt947 + arg0 || super.anInt4448 <= arg3 + local82.anInt947) {
					return;
				}
				arg1.method2182(local82.aBoolean63, arg0, !local82.aBoolean57, local82.anInt975, local90, local82.anInt947, arg3);
			} else if (arg5 == 3) {
				@Pc(149) Class49_Sub5 local149 = Static117.method1983(arg4, arg0, arg3);
				if (local149 instanceof Class49_Sub5_Sub2) {
					((Class49_Sub5_Sub2) local149).aClass49_Sub5_1 = null;
				} else {
					Static494.method6739(arg4, arg0, arg3);
				}
				if (local82.anInt969 == 1) {
					arg1.method2165(arg3, arg0);
					return;
				}
			}
			return;
		}
		@Pc(287) Class49_Sub1 local287 = Static453.method6441(arg4, arg0, arg3);
		if (local287 instanceof Class49_Sub1_Sub2) {
			((Class49_Sub1_Sub2) local287).aClass49_Sub1_1 = null;
		} else {
			Static459.method6491(arg4, arg0, arg3);
		}
		if (local82.anInt969 != 0) {
			arg1.method2172(local90, !local82.aBoolean57, local86, local82.aBoolean63, arg0, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IBI[BILclient!qa;II[Lclient!fd;II)V")
	public void method3880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class91[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class1_Sub6 local15 = new Class1_Sub6(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method3913();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method3936();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local15.method3922();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg6 && arg5 <= local57 && local57 < arg5 + 8 && arg0 <= local51 && local51 < arg0 + 8) {
					@Pc(109) Class36 local109 = Static308.aClass96_4.method2274(local17);
					@Pc(126) int local126 = Static401.method6043(local73, local51 & 0x7, local109.anInt975, local109.anInt947, local57 & 0x7, arg3) + arg9;
					@Pc(143) int local143 = Static367.method5690(arg3, local73, local57 & 0x7, local109.anInt947, local109.anInt975, local51 & 0x7) + arg1;
					if (local126 > 0 && local143 > 0 && local126 < super.anInt4435 - 1 && super.anInt4448 - 1 > local143) {
						@Pc(168) Class91 local168 = null;
						if (!super.aBoolean310) {
							@Pc(173) int local173 = arg8;
							if ((Static530.aByteArrayArrayArray17[1][local126][local143] & 0x2) == 2) {
								local173 = arg8 - 1;
							}
							if (local173 >= 0) {
								local168 = arg7[local173];
							}
						}
						this.method3884(arg3 + local73 & 0x3, local69, local168, arg4, local17, arg8, -1, local143, arg8, local126);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIB[BLclient!qa;[Lclient!fd;)V")
	public void method3881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) Class91[] arg4) {
		@Pc(10) Class1_Sub6 local10 = new Class1_Sub6(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3913();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method3936();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local10.method3922();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				@Pc(66) int local66 = arg1 + local46;
				@Pc(71) int local71 = local40 + arg0;
				if (local66 > 0 && local71 > 0 && super.anInt4435 - 1 > local66 && local71 < super.anInt4448 - 1) {
					@Pc(92) Class91 local92 = null;
					if (!super.aBoolean310) {
						@Pc(97) int local97 = local50;
						if ((Static530.aByteArrayArrayArray17[1][local66][local71] & 0x2) == 2) {
							local97 = local50 - 1;
						}
						if (local97 >= 0) {
							local92 = arg4[local97];
						}
					}
					this.method3884(local62, local58, local92, arg3, local12, local50, -1, local71, local50, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IILclient!fd;Lclient!qa;IIIIIII)V")
	public void method3884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (!Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861) && !Static371.method5719(arg5, arg7, arg9, Static206.anInt4061)) {
			return;
		}
		if (arg8 < this.anInt4463) {
			this.anInt4463 = arg8;
		}
		@Pc(30) Class36 local30 = Static308.aClass96_4.method2274(arg4);
		if (arg3.method7228() && Static544.aClass1_Sub22_Sub1_1.aBoolean396 && local30.aBoolean66) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg0 == 1 || arg0 == 3) {
			local49 = local30.anInt975;
			local52 = local30.anInt947;
		} else {
			local49 = local30.anInt947;
			local52 = local30.anInt975;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (super.anInt4435 < local52 + arg9) {
			local72 = arg9;
			local76 = arg9 + 1;
		} else {
			local76 = arg9 + (local52 + 1 >> 1);
			local72 = arg9 + (local52 >> 1);
		}
		@Pc(109) int local109;
		@Pc(107) int local107;
		if (super.anInt4448 < local49 + arg7) {
			local107 = arg7 + 1;
			local109 = arg7;
		} else {
			local109 = (local49 >> 1) + arg7;
			local107 = (local49 + 1 >> 1) + arg7;
		}
		@Pc(129) Class205 local129 = Static544.aClass205Array3[arg5];
		@Pc(152) int local152 = local129.ba(local72, local109) + local129.ba(local76, local109) + local129.ba(local72, local107) + local129.ba(local76, local107) >> 2;
		@Pc(160) int local160 = (arg9 << 9) + (local52 << 8);
		@Pc(169) int local169 = (arg7 << 9) + (local49 << 8);
		@Pc(181) boolean local181 = Static74.aBoolean85 && !super.aBoolean310 && local30.aBoolean53;
		if (local30.method951()) {
			Static174.method2614(arg8, arg0, null, arg7, local30, null, arg9);
		}
		@Pc(216) boolean local216 = arg6 == -1 && local30.anInt956 == -1 && local30.anIntArray124 == null && local30.anIntArray127 == null && !local30.aBoolean56;
		if (Static544.aBoolean641 && (Static438.method6426(arg1) && local30.anInt974 != 1 || !(!Static280.method4538(arg1) || local30.anInt974 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(379) Class49_Sub2 local379;
			@Pc(346) Class49_Sub2_Sub4 local346;
			@Pc(350) int local350;
			if (arg1 == 10 || arg1 == 11) {
				local346 = null;
				if (local216) {
					@Pc(409) Class49_Sub2_Sub4 local409 = new Class49_Sub2_Sub4(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, arg9 + local52 - 1, arg7, local49 + arg7 - 1, arg1, arg0, local181);
					local379 = local409;
					local346 = local409;
					local350 = local409.method5371();
				} else {
					local350 = 15;
					local379 = new Class49_Sub2_Sub6(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, arg9 + local52 - 1, arg7, arg7 + local49 - 1, arg1, arg0, arg6);
				}
				@Pc(430) Class49_Sub2 local430 = Static156.method2467(arg8, arg9, arg7, vaa.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class49_Sub2_Sub3 && arg9 == local430.aShort117 && arg7 == local430.aShort116) {
					local432 = true;
					((Class49_Sub2_Sub3) local430).aClass49_Sub2_2 = local379;
				}
				if (local432 || Static468.method6558(local379, false)) {
					if (local346 != null && local346.method7471()) {
						local346.method7466(arg3);
					}
					if (local30.aBoolean58 && Static74.aBoolean85) {
						if (local350 > 30) {
							local350 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local52; local483++) {
							for (@Pc(487) int local487 = 0; local487 <= local49; local487++) {
								local129.Q(arg9 + local483, arg7 - -local487, local350);
							}
						}
					}
				}
				if (local30.anInt969 != 0 && arg2 != null) {
					arg2.method2174(local52, !local30.aBoolean57, arg7, arg9, local49, local30.aBoolean63);
				}
			} else {
				@Pc(629) Class49_Sub2 local629;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local216) {
						local346 = new Class49_Sub2_Sub4(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, local52 + arg9 - 1, arg7, arg7 + local49 - 1, arg1, arg0, local181);
						local379 = local346;
						if (local346.method7471()) {
							local346.method7466(arg3);
						}
					} else {
						local379 = new Class49_Sub2_Sub6(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, local52 + arg9 - 1, arg7, arg7 + local49 - 1, arg1, arg0, arg6);
					}
					local629 = Static156.method2467(arg8, arg9, arg7, vaa.class);
					if (local629 instanceof Class49_Sub2_Sub3 && arg9 == local629.aShort117 && local629.aShort116 == arg7) {
						((Class49_Sub2_Sub3) local629).aClass49_Sub2_2 = local379;
					} else {
						Static468.method6558(local379, false);
					}
					if (Static74.aBoolean85 && !super.aBoolean310 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg8 > 0 && local30.anInt974 != 0) {
						super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x4);
					}
					if (local30.anInt969 != 0 && arg2 != null) {
						arg2.method2174(local52, !local30.aBoolean57, arg7, arg9, local49, local30.aBoolean63);
					}
				} else {
					@Pc(757) Class49_Sub1 local757;
					if (arg1 == 0) {
						@Pc(721) int local721 = local30.anInt974;
						if (Static43.aBoolean47 && local30.anInt974 == -1) {
							local721 = 1;
						}
						if (local216) {
							@Pc(747) Class49_Sub1_Sub1 local747 = new Class49_Sub1_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, local181);
							if (local747.method7471()) {
								local747.method7466(arg3);
							}
							local757 = local747;
						} else {
							local757 = new Class49_Sub1_Sub3(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, arg6);
						}
						@Pc(780) Class49_Sub1 local780 = Static453.method6441(arg8, arg9, arg7);
						if (local780 instanceof Class49_Sub1_Sub2) {
							((Class49_Sub1_Sub2) local780).aClass49_Sub1_1 = local757;
						} else {
							Static533.method7380(arg8, arg9, arg7, local757, null);
						}
						if (Static74.aBoolean85) {
							if (arg0 == 0) {
								if (local30.aBoolean58) {
									local129.Q(arg9, arg7, 50);
									local129.Q(arg9, arg7 + 1, 50);
								}
								if (local721 == 1 && !super.aBoolean310) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local30.aBoolean58) {
									local129.Q(arg9, arg7 + 1, 50);
									local129.Q(arg9 + 1, arg7 - -1, 50);
								}
								if (local721 == 1 && !super.aBoolean310) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local30.aBoolean58) {
									local129.Q(arg9 + 1, arg7, 50);
									local129.Q(arg9 + 1, arg7 + 1, 50);
								}
								if (local721 == 1 && !super.aBoolean310) {
									super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local30.aBoolean58) {
									local129.Q(arg9, arg7, 50);
									local129.Q(arg9 + 1, arg7, 50);
								}
								if (local721 == 1 && !super.aBoolean310) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x2);
								}
							}
						}
						if (local30.anInt969 != 0 && arg2 != null) {
							arg2.method2177(arg0, !local30.aBoolean57, arg1, arg9, local30.aBoolean63, arg7);
						}
						if (local30.anInt997 != 64) {
							Static70.method5294(arg8, arg9, arg7, local30.anInt997);
						}
					} else {
						@Pc(1052) Class49_Sub1_Sub1 local1052;
						@Pc(1062) Class49_Sub1 local1062;
						if (arg1 == 1) {
							if (local216) {
								local1052 = new Class49_Sub1_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, local181);
								if (local1052.method7471()) {
									local1052.method7466(arg3);
								}
								local1062 = local1052;
							} else {
								local1062 = new Class49_Sub1_Sub3(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, arg6);
							}
							local757 = Static453.method6441(arg8, arg9, arg7);
							if (local757 instanceof Class49_Sub1_Sub2) {
								((Class49_Sub1_Sub2) local757).aClass49_Sub1_1 = local1062;
							} else {
								Static533.method7380(arg8, arg9, arg7, local1062, null);
							}
							if (local30.aBoolean58 && Static74.aBoolean85) {
								if (arg0 == 0) {
									local129.Q(arg9, arg7 + 1, 50);
								} else if (arg0 == 1) {
									local129.Q(arg9 + 1, arg7 - -1, 50);
								} else if (arg0 == 2) {
									local129.Q(arg9 + 1, arg7, 50);
								} else if (arg0 == 3) {
									local129.Q(arg9, arg7, 50);
								}
							}
							if (local30.anInt969 != 0 && arg2 != null) {
								arg2.method2177(arg0, !local30.aBoolean57, arg1, arg9, local30.aBoolean63, arg7);
							}
						} else if (arg1 == 2) {
							local350 = arg0 + 1 & 0x3;
							if (local216) {
								@Pc(1209) Class49_Sub1_Sub1 local1209 = new Class49_Sub1_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0 + 4, local181);
								@Pc(1224) Class49_Sub1_Sub1 local1224 = new Class49_Sub1_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg1, local350, local181);
								if (local1209.method7471()) {
									local1209.method7466(arg3);
								}
								if (local1224.method7471()) {
									local1224.method7466(arg3);
								}
								local1062 = local1209;
								local757 = local1224;
							} else {
								local1062 = new Class49_Sub1_Sub3(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0 + 4, arg6);
								local757 = new Class49_Sub1_Sub3(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg1, local350, arg6);
							}
							Static533.method7380(arg8, arg9, arg7, local1062, local757);
							if (local30.anInt974 == 1 && Static74.aBoolean85 && !super.aBoolean310) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x1);
									super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9 + 1][arg7] | 0x1);
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x2);
									super.aByteArrayArrayArray12[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray12[arg8][arg9][arg7] | 0x1);
								}
							}
							if (local30.anInt969 != 0 && arg2 != null) {
								arg2.method2177(arg0, !local30.aBoolean57, arg1, arg9, local30.aBoolean63, arg7);
							}
							if (local30.anInt997 != 64) {
								Static70.method5294(arg8, arg9, arg7, local30.anInt997);
							}
						} else if (arg1 == 3) {
							if (local216) {
								local1052 = new Class49_Sub1_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, local181);
								local1062 = local1052;
								if (local1052.method7471()) {
									local1052.method7466(arg3);
								}
							} else {
								local1062 = new Class49_Sub1_Sub3(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg1, arg0, arg6);
							}
							local757 = Static453.method6441(arg8, arg9, arg7);
							if (local757 instanceof Class49_Sub1_Sub2) {
								((Class49_Sub1_Sub2) local757).aClass49_Sub1_1 = local1062;
							} else {
								Static533.method7380(arg8, arg9, arg7, local1062, null);
							}
							if (local30.aBoolean58 && Static74.aBoolean85) {
								if (arg0 == 0) {
									local129.Q(arg9, arg7 + 1, 50);
								} else if (arg0 == 1) {
									local129.Q(arg9 + 1, arg7 + 1, 50);
								} else if (arg0 == 2) {
									local129.Q(arg9 + 1, arg7, 50);
								} else if (arg0 == 3) {
									local129.Q(arg9, arg7, 50);
								}
							}
							if (local30.anInt969 != 0 && arg2 != null) {
								arg2.method2177(arg0, !local30.aBoolean57, arg1, arg9, local30.aBoolean63, arg7);
							}
						} else if (arg1 == 9) {
							if (local216) {
								local346 = new Class49_Sub2_Sub4(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, arg9, arg7, arg7, arg1, arg0, local181);
								local379 = local346;
								if (local346.method7471()) {
									local346.method7466(arg3);
								}
							} else {
								local379 = new Class49_Sub2_Sub6(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg9, local52 + arg9 - 1, arg7, local49 + arg7 - 1, arg1, arg0, arg6);
							}
							local629 = Static156.method2467(arg8, arg9, arg7, vaa.class);
							if (local629 instanceof Class49_Sub2_Sub3 && arg9 == local629.aShort117 && local629.aShort116 == arg7) {
								((Class49_Sub2_Sub3) local629).aClass49_Sub2_2 = local379;
							} else {
								Static468.method6558(local379, false);
							}
							if (local30.anInt969 != 0 && arg2 != null) {
								arg2.method2174(local52, !local30.aBoolean57, arg7, arg9, local49, local30.aBoolean63);
							}
							if (local30.anInt997 != 64) {
								Static70.method5294(arg8, arg9, arg7, local30.anInt997);
							}
						} else {
							@Pc(1839) Class49_Sub3 local1839;
							if (arg1 == 4) {
								if (local216) {
									@Pc(1837) Class49_Sub3_Sub1 local1837 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, 0, 0, 0, arg1, arg0);
									local1839 = local1837;
									if (local1837.method7471()) {
										local1837.method7466(arg3);
									}
								} else {
									local1839 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, 0, 0, 0, arg1, arg0, arg6);
								}
								@Pc(1873) Class49_Sub3 local1873 = Static53.method1029(arg8, arg9, arg7);
								if (local1873 instanceof Class49_Sub3_Sub3) {
									((Class49_Sub3_Sub3) local1873).aClass49_Sub3_3 = local1839;
								} else {
									Static256.method4325(arg8, arg9, arg7, local1839, null);
								}
							} else {
								@Pc(1895) int local1895;
								@Pc(1901) Interface18 local1901;
								@Pc(1942) Class49_Sub3_Sub1 local1942;
								@Pc(1986) Class49_Sub3 local1986;
								if (arg1 == 5) {
									local1895 = 65;
									local1901 = (Interface18) Static453.method6441(arg8, arg9, arg7);
									if (local1901 != null) {
										local1895 = Static308.aClass96_4.method2274(local1901.method7467()).anInt997 + 1;
									}
									if (local216) {
										local1942 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, 0, Static317.anIntArray582[arg0] * local1895, Static224.anIntArray439[arg0] * local1895, arg1, arg0);
										local1839 = local1942;
										if (local1942.method7471()) {
											local1942.method7466(arg3);
										}
									} else {
										local1839 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, 0, local1895 * Static317.anIntArray582[arg0], local1895 * Static224.anIntArray439[arg0], arg1, arg0, arg6);
									}
									local1986 = Static53.method1029(arg8, arg9, arg7);
									if (local1986 instanceof Class49_Sub3_Sub3) {
										((Class49_Sub3_Sub3) local1986).aClass49_Sub3_3 = local1839;
									} else {
										Static256.method4325(arg8, arg9, arg7, local1839, null);
									}
								} else if (arg1 == 6) {
									local1895 = 33;
									local1901 = (Interface18) Static453.method6441(arg8, arg9, arg7);
									if (local1901 != null) {
										local1895 = Static308.aClass96_4.method2274(local1901.method7467()).anInt997 / 2 + 1;
									}
									if (local216) {
										local1942 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg0, local1895 * Static317.anIntArray582[arg0], local1895 * Static224.anIntArray439[arg0], arg1, arg0 + 4);
										if (local1942.method7471()) {
											local1942.method7466(arg3);
										}
										local1839 = local1942;
									} else {
										local1839 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg0, local1895 * Static368.anIntArray662[arg0], local1895 * Static111.anIntArray219[arg0], arg1, arg0 + 4, arg6);
									}
									local1986 = Static53.method1029(arg8, arg9, arg7);
									if (local1986 instanceof Class49_Sub3_Sub3) {
										((Class49_Sub3_Sub3) local1986).aClass49_Sub3_3 = local1839;
									} else {
										Static256.method4325(arg8, arg9, arg7, local1839, null);
									}
								} else if (arg1 == 7) {
									local1895 = arg0 + 2 & 0x3;
									if (local216) {
										@Pc(2150) Class49_Sub3_Sub1 local2150 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, local1895, 0, 0, arg1, local1895 + 4);
										local1839 = local2150;
										if (local2150.method7471()) {
											local2150.method7466(arg3);
										}
									} else {
										local1839 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, local1895, 0, 0, arg1, local1895 + 4, arg6);
									}
									@Pc(2188) Class49_Sub3 local2188 = Static53.method1029(arg8, arg9, arg7);
									if (local2188 instanceof Class49_Sub3_Sub3) {
										((Class49_Sub3_Sub3) local2188).aClass49_Sub3_3 = local1839;
									} else {
										Static256.method4325(arg8, arg9, arg7, local1839, null);
									}
								} else if (arg1 == 8) {
									local350 = arg0 + 2 & 0x3;
									@Pc(2216) int local2216 = 33;
									@Pc(2222) Interface18 local2222 = (Interface18) Static453.method6441(arg8, arg9, arg7);
									if (local2222 != null) {
										local2216 = Static308.aClass96_4.method2274(local2222.method7467()).anInt997 / 2 + 1;
									}
									@Pc(2269) Class49_Sub3 local2269;
									@Pc(2292) Class49_Sub3 local2292;
									if (local216) {
										local2269 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg0, local2216 * Static368.anIntArray662[arg0], local2216 * Static111.anIntArray219[arg0], arg1, arg0 + 4);
										local2292 = new Class49_Sub3_Sub1(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg0, 0, 0, arg1, local350 + 4);
										if (local2269.method7471()) {
											local2269.method7466(arg3);
										}
										if (local2292.method7471()) {
											local2292.method7466(arg3);
										}
									} else {
										local2269 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg0, Static368.anIntArray662[arg0] * local2216, local2216 * Static111.anIntArray219[arg0], arg1, arg0 + 4, arg6);
										local2292 = new Class49_Sub3_Sub2(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg0, 0, 0, arg1, local350 + 4, arg6);
									}
									Static256.method4325(arg8, arg9, arg7, local2269, local2292);
								}
							}
						}
					}
				}
			}
		} else if (Static544.aClass1_Sub22_Sub1_1.aBoolean380 || local30.anInt992 != 0 || local30.anInt969 == 1 || local30.aBoolean65) {
			@Pc(277) Class49_Sub5 local277;
			if (local216) {
				@Pc(293) Class49_Sub5_Sub3 local293 = new Class49_Sub5_Sub3(arg3, local30, arg5, local160, local152, local169, super.aBoolean310, arg0, local181);
				if (local293.method7471()) {
					local293.method7466(arg3);
				}
				local277 = local293;
			} else {
				local277 = new Class49_Sub5_Sub1(arg3, local30, arg8, arg5, local160, local152, local169, super.aBoolean310, arg0, arg6);
			}
			@Pc(310) Class49_Sub5 local310 = Static117.method1983(arg8, arg9, arg7);
			if (local310 instanceof Class49_Sub5_Sub2) {
				((Class49_Sub5_Sub2) local310).aClass49_Sub5_1 = local277;
			} else {
				Static140.method2292(arg8, arg9, arg7, local277);
			}
			if (local30.anInt969 == 1 && arg2 != null) {
				arg2.method2168(arg7, arg9);
			}
		}
	}
}
