import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
	public int anInt6948 = 99;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIZ)V")
	public Class210_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static365.aClass46_4, Static153.aClass167_1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILclient!ha;Lclient!ji;[I)V")
	public void method5806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) Class6_Sub8 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean553) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(19) Class40 local19 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(30) int local30;
					@Pc(74) int local74;
					@Pc(523) int local523;
					@Pc(115) int local115;
					@Pc(119) int local119;
					while (arg3.aByteArray102.length > arg3.anInt10061) {
						local30 = arg3.method8246();
						if (local30 == 0) {
							local19 = new Class40(arg3);
						} else {
							@Pc(241) int local241;
							@Pc(129) int local129;
							@Pc(136) int local136;
							if (local30 == 1) {
								local74 = arg3.method8246();
								if (local74 > 0) {
									for (local523 = 0; local523 < local74; local523++) {
										@Pc(532) Class3 local532 = new Class3(arg2, arg3, 2);
										if (local532.anInt61 == 31) {
											@Pc(547) Class382 local547 = Static37.aClass282_1.method7027(arg3.method8220());
											local532.method56(local547.anInt10777, local547.anInt10773, local547.anInt10771, local547.anInt10775);
										}
										if (arg2.method6185() > 0) {
											@Pc(567) Class6_Sub10 local567 = local532.aClass6_Sub10_1;
											local241 = (arg1 << 9) + local567.method5312();
											local129 = local567.method5320() + (arg0 << 9);
											local136 = local241 >> 9;
											@Pc(592) int local592 = local129 >> 9;
											if (local136 >= 0 && local592 >= 0 && local136 < super.anInt6934 && local592 < super.anInt6933) {
												local567.method5313(local129, local241, super.anIntArrayArrayArray6[local532.anInt57][local136][local592] - local567.method5321());
												Static379.method6001(local532);
											}
										}
									}
								}
							} else if (local30 == 2) {
								if (local19 == null) {
									local19 = new Class40();
								}
								local19.method1716(arg3);
							} else if (local30 != 128) {
								if (local30 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								local11 = true;
								for (local74 = 0; local74 < 4; local74++) {
									@Pc(80) byte local80 = arg3.method8208();
									if (local80 == 0 && super.aByteArrayArrayArray12[local74] != null) {
										local115 = arg1;
										local119 = arg1 + 64;
										local241 = arg0;
										if (arg1 < 0) {
											local115 = 0;
										} else if (super.anInt6934 <= arg1) {
											local115 = super.anInt6934;
										}
										if (arg0 < 0) {
											local241 = 0;
										} else if (super.anInt6933 <= arg0) {
											local241 = super.anInt6933;
										}
										local129 = arg0 + 64;
										if (local119 < 0) {
											local119 = 0;
										} else if (super.anInt6934 <= local119) {
											local119 = super.anInt6934;
										}
										if (local129 < 0) {
											local129 = 0;
										} else if (local129 >= super.anInt6933) {
											local129 = super.anInt6933;
										}
										while (local119 > local115) {
											while (local129 > local241) {
												super.aByteArrayArrayArray12[local74][local115][local241] = 0;
												local241++;
											}
											local115++;
										}
									} else if (local80 == 1) {
										if (super.aByteArrayArrayArray12[local74] == null) {
											super.aByteArrayArrayArray12[local74] = new byte[super.anInt6934 + 1][super.anInt6933 + 1];
										}
										for (local115 = 0; local115 < 64; local115 += 4) {
											for (local119 = 0; local119 < 64; local119 += 4) {
												@Pc(125) byte local125 = arg3.method8208();
												for (local129 = local115 + arg1; local129 < local115 + arg1 + 4; local129++) {
													for (local136 = local119 + arg0; local136 < arg0 + local119 + 4; local136++) {
														if (local129 >= 0 && local129 < super.anInt6934 && local136 >= 0 && local136 < super.anInt6933) {
															super.aByteArrayArrayArray12[local74][local129][local136] = local125;
														}
													}
												}
											}
										}
									} else if (local80 == 2) {
										if (super.aByteArrayArrayArray12[local74] == null) {
											super.aByteArrayArrayArray12[local74] = new byte[super.anInt6934 + 1][super.anInt6933 + 1];
										}
										if (local74 > 0) {
											local115 = arg1;
											local119 = arg1 + 64;
											local241 = arg0;
											if (arg0 < 0) {
												local241 = 0;
											} else if (arg0 >= super.anInt6933) {
												local241 = super.anInt6933;
											}
											if (local119 < 0) {
												local119 = 0;
											} else if (super.anInt6934 <= local119) {
												local119 = super.anInt6934;
											}
											local129 = arg0 + 64;
											if (arg1 < 0) {
												local115 = 0;
											} else if (arg1 >= super.anInt6934) {
												local115 = super.anInt6934;
											}
											if (local129 < 0) {
												local129 = 0;
											} else if (local129 >= super.anInt6933) {
												local129 = super.anInt6933;
											}
											while (local115 < local119) {
												while (local129 > local241) {
													super.aByteArrayArrayArray12[local74][local115][local241] = super.aByteArrayArrayArray12[local74 - 1][local115][local241];
													local241++;
												}
												local115++;
											}
										}
									}
								}
							} else if (arg4 == null) {
								arg3.anInt10061 += 10;
							} else {
								arg4[0] = arg3.method8220();
								arg4[1] = arg3.method8231();
								arg4[2] = arg3.method8231();
								arg4[3] = arg3.method8231();
								arg4[4] = arg3.method8220();
							}
						}
					}
					if (local19 != null) {
						for (local30 = 0; local30 < 8; local30++) {
							for (local74 = 0; local74 < 8; local74++) {
								local523 = (arg1 >> 3) + local30;
								local115 = (arg0 >> 3) + local74;
								if (local523 >= 0 && super.anInt6934 >> 3 > local523 && local115 >= 0 && local115 < super.anInt6933 >> 3) {
									Static275.method8432(local115, local523, local19);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray12 != null) {
						for (local30 = 0; local30 < 4; local30++) {
							if (super.aByteArrayArrayArray12[local30] != null) {
								for (local74 = 0; local74 < 16; local74++) {
									for (local523 = 0; local523 < 16; local523++) {
										local115 = (arg1 >> 2) + local74;
										local119 = (arg0 >> 2) + local523;
										if (local115 >= 0 && local115 < 26 && local119 >= 0 && local119 < 26) {
											super.aByteArrayArrayArray12[local30][local115][local119] = 0;
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

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIII)Lclient!rl;")
	public Interface22 method5807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface22 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface22) Static37.method1328(arg2, arg3, arg0);
		}
		if (arg1 == 1) {
			local5 = (Interface22) Static181.method3396(arg2, arg3, arg0);
		}
		if (arg1 == 2) {
			local5 = (Interface22) Static173.method3262(arg2, arg3, arg0, rl.class);
		}
		if (arg1 == 3) {
			local5 = (Interface22) Static446.method6808(arg2, arg3, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!pfa;II[BIIIIILclient!ha;I)V")
	public void method5808(@OriginalArg(0) Class258[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class5 arg9) {
		@Pc(10) Class6_Sub8 local10 = new Class6_Sub8(arg3);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method8225();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method8214();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local10.method8246();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg2 && local57 >= arg6 && local57 < arg6 + 8 && local51 >= arg7 && local51 < arg7 + 8) {
					@Pc(109) Class356 local109 = Static249.aClass310_1.method7474(local20);
					@Pc(126) int local126 = Static510.method7307(local57 & 0x7, local73, local51 & 0x7, arg8, local109.anInt10250, local109.anInt10238) + arg5;
					@Pc(143) int local143 = Static72.method2069(local109.anInt10238, arg8, local73, local57 & 0x7, local51 & 0x7, local109.anInt10250) + arg4;
					if (local126 > 0 && local143 > 0 && super.anInt6934 - 1 > local126 && local143 < super.anInt6933 - 1) {
						@Pc(168) Class258 local168 = null;
						if (!super.aBoolean553) {
							@Pc(173) int local173 = arg1;
							if ((Static495.aByteArrayArrayArray17[1][local126][local143] & 0x2) == 2) {
								local173 = arg1 - 1;
							}
							if (local173 >= 0) {
								local168 = arg0[local173];
							}
						}
						this.method5812(local20, local143, -1, arg1, local126, arg9, arg8 + local73 & 0x3, local69, arg1, local168);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[IIILclient!ji;Lclient!ha;IZII)V")
	public void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub8 arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean553) {
			return;
		}
		@Pc(19) Class40 local19 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(31) int local31 = (arg0 & 0x7) * 8;
		@Pc(37) int local37 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(42) int local42;
			@Pc(60) int local60;
			@Pc(343) int local343;
			@Pc(67) int local67;
			while (arg5.anInt10061 < arg5.aByteArray102.length) {
				local42 = arg5.method8246();
				if (local42 == 0) {
					local19 = new Class40(arg5);
				} else {
					@Pc(116) int local116;
					@Pc(162) int local162;
					@Pc(185) int local185;
					@Pc(110) int local110;
					if (local42 == 1) {
						local60 = arg5.method8246();
						if (local60 > 0) {
							for (local67 = 0; local67 < local60; local67++) {
								@Pc(76) Class3 local76 = new Class3(arg6, arg5, 2);
								if (local76.anInt61 == 31) {
									@Pc(87) Class382 local87 = Static37.aClass282_1.method7027(arg5.method8220());
									local76.method56(local87.anInt10777, local87.anInt10773, local87.anInt10771, local87.anInt10775);
								}
								if (arg6.method6185() > 0) {
									@Pc(104) Class6_Sub10 local104 = local76.aClass6_Sub10_1;
									local110 = local104.method5312() >> 9;
									local116 = local104.method5320() >> 9;
									if (local76.anInt57 == arg8 && local110 >= local31 && local110 < local31 + 8 && local116 >= local37 && local37 + 8 > local116) {
										local162 = (arg3 << 9) + Static367.method7651(local104.method5320() & 0xFFF, arg7, local104.method5312() & 0xFFF);
										local110 = local162 >> 9;
										local185 = (arg4 << 9) + Static194.method3525(arg7, local104.method5320() & 0xFFF, local104.method5312() & 0xFFF);
										local116 = local185 >> 9;
										if (local110 >= 0 && local116 >= 0 && super.anInt6934 > local110 && super.anInt6933 > local116) {
											local104.method5313(local185, local162, super.anIntArrayArrayArray6[arg8][local110][local116] - local104.method5321());
											Static379.method6001(local76);
										}
									}
								}
							}
						}
					} else if (local42 == 2) {
						if (local19 == null) {
							local19 = new Class40();
						}
						local19.method1716(arg5);
					} else if (local42 != 128) {
						if (local42 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray12 == null) {
							super.aByteArrayArrayArray12 = new byte[4][][];
						}
						for (local60 = 0; local60 < 4; local60++) {
							@Pc(310) byte local310 = arg5.method8208();
							@Pc(347) int local347;
							if (local310 == 0 && super.aByteArrayArrayArray12[arg9] != null) {
								if (local60 <= arg8) {
									local343 = arg3;
									local347 = arg3 + 7;
									local110 = arg4;
									if (arg4 < 0) {
										local110 = 0;
									} else if (arg4 >= super.anInt6933) {
										local110 = super.anInt6933;
									}
									local116 = arg4 + 7;
									if (arg3 < 0) {
										local343 = 0;
									} else if (arg3 >= super.anInt6934) {
										local343 = super.anInt6934;
									}
									if (local347 < 0) {
										local347 = 0;
									} else if (super.anInt6934 <= local347) {
										local347 = super.anInt6934;
									}
									if (local116 < 0) {
										local116 = 0;
									} else if (local116 >= super.anInt6933) {
										local116 = super.anInt6933;
									}
									while (local347 > local343) {
										while (local110 < local116) {
											super.aByteArrayArrayArray12[arg9][local343][local110] = 0;
											local110++;
										}
										local343++;
									}
								}
							} else if (local310 == 1) {
								if (super.aByteArrayArrayArray12[arg9] == null) {
									super.aByteArrayArrayArray12[arg9] = new byte[super.anInt6934 + 1][super.anInt6933 + 1];
								}
								for (local343 = 0; local343 < 64; local343 += 4) {
									for (local347 = 0; local347 < 64; local347 += 4) {
										@Pc(353) byte local353 = arg5.method8208();
										if (arg8 >= local60) {
											for (local116 = local343; local116 < local343 + 4; local116++) {
												for (local162 = local347; local162 < local347 + 4; local162++) {
													if (local31 <= local116 && local31 + 8 > local116 && local37 <= local162 && local37 < local37 + 8) {
														local185 = arg3 + Static194.method3521(local116 & 0x7, local162 & 0x7, arg7);
														@Pc(421) int local421 = Static439.method6718(local116 & 0x7, local162 & 0x7, arg7) + arg4;
														if (local185 >= 0 && super.anInt6934 > local185 && local421 >= 0 && super.anInt6933 > local421) {
															super.aByteArrayArrayArray12[arg9][local185][local421] = local353;
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
						arg5.anInt10061 += 10;
					} else {
						arg2[0] = arg5.method8220();
						arg2[1] = arg5.method8231();
						arg2[2] = arg5.method8231();
						arg2[3] = arg5.method8231();
						arg2[4] = arg5.method8220();
					}
				}
			}
			if (local19 != null) {
				Static275.method8432(arg4 >> 3, arg3 >> 3, local19);
			}
			if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg9] != null) {
				local42 = arg3 + 7;
				local60 = arg4 + 7;
				for (local67 = arg3; local67 < local42; local67++) {
					for (local343 = arg4; local343 < local60; local343++) {
						super.aByteArrayArrayArray12[arg9][local67][local343] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIZILclient!ha;IIILclient!pfa;)V")
	public void method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class258 arg9) {
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0 && !Static514.method7364(arg1, arg3, arg4, Static213.anInt4581)) {
			return;
		}
		if (this.anInt6948 > arg8) {
			this.anInt6948 = arg8;
		}
		@Pc(34) Class356 local34 = Static249.aClass310_1.method7474(arg0);
		if (Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7110() == 0 && local34.aBoolean800) {
			return;
		}
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (arg6 == 1 || arg6 == 3) {
			local56 = local34.anInt10238;
			local59 = local34.anInt10250;
		} else {
			local56 = local34.anInt10250;
			local59 = local34.anInt10238;
		}
		@Pc(84) int local84;
		@Pc(82) int local82;
		if (arg4 + local56 > super.anInt6934) {
			local82 = arg4 + 1;
			local84 = arg4;
		} else {
			local84 = (local56 >> 1) + arg4;
			local82 = arg4 + (local56 + 1 >> 1);
		}
		@Pc(117) int local117;
		@Pc(126) int local126;
		if (super.anInt6933 >= arg1 + local59) {
			local117 = (local59 >> 1) + arg1;
			local126 = arg1 + (local59 + 1 >> 1);
		} else {
			local126 = arg1 + 1;
			local117 = arg1;
		}
		@Pc(138) Class245 local138 = Static148.aClass245Array1[arg3];
		@Pc(165) int local165 = local138.method7583(local117, local84) + local138.method7583(local117, local82) + local138.method7583(local126, local84) + local138.method7583(local126, local82) >> 2;
		@Pc(173) int local173 = (local56 << 8) + (arg4 << 9);
		@Pc(192) int local192 = (arg1 << 9) + (local59 << 8);
		@Pc(204) boolean local204 = Static87.aBoolean208 && !super.aBoolean553 && local34.aBoolean805;
		if (local34.method8328()) {
			Static621.method8510((Class9_Sub4_Sub2_Sub1_Sub2) null, local34, arg4, arg6, arg1, arg8, (Class9_Sub4_Sub2_Sub1_Sub1) null);
		}
		@Pc(242) boolean local242 = arg2 == -1 && local34.anInt10215 == -1 && local34.anIntArray548 == null && local34.anIntArray545 == null && !local34.aBoolean804 && !local34.aBoolean801;
		if (Static179.aBoolean322 && (Static613.method8400(arg7) && local34.anInt10225 != 1 || !(!Static225.method4382(arg7) || local34.anInt10225 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(394) Class9_Sub4_Sub2 local394;
			@Pc(358) Class9_Sub4_Sub2_Sub2 local358;
			@Pc(392) int local392;
			@Pc(456) int local456;
			if (arg7 == 10 || arg7 == 11) {
				local358 = null;
				if (local242) {
					@Pc(388) Class9_Sub4_Sub2_Sub2 local388 = new Class9_Sub4_Sub2_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, local56 + arg4 - 1, arg1, local59 + arg1 - 1, arg7, arg6, local204);
					local392 = local388.method5646();
					local394 = local388;
					local358 = local388;
				} else {
					local394 = new Class9_Sub4_Sub2_Sub5(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, arg4 + local56 - 1, arg1, local59 + arg1 - 1, arg7, arg6, arg2);
					local392 = 15;
				}
				if (Static397.method6261(local394, false)) {
					if (local358 != null && local358.method8437()) {
						local358.method8434(arg5);
					}
					if (local34.aBoolean794 && Static87.aBoolean208) {
						if (local392 > 30) {
							local392 = 30;
						}
						for (local456 = 0; local456 <= local56; local456++) {
							for (@Pc(460) int local460 = 0; local460 <= local59; local460++) {
								local138.ka(arg4 + local456, arg1 + local460, local392);
							}
						}
					}
				}
				if (local34.anInt10254 != 0 && arg9 != null) {
					arg9.method6644(!local34.aBoolean796, arg4, local59, local56, local34.aBoolean797, arg1);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local242) {
					local358 = new Class9_Sub4_Sub2_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, arg4 + local56 - 1, arg1, arg1 + local59 - 1, arg7, arg6, local204);
					if (local358.method8437()) {
						local358.method8434(arg5);
					}
					local394 = local358;
				} else {
					local394 = new Class9_Sub4_Sub2_Sub5(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, local56 + arg4 - 1, arg1, local59 + arg1 - 1, arg7, arg6, arg2);
				}
				Static397.method6261(local394, false);
				if (Static87.aBoolean208 && !super.aBoolean553 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg8 > 0 && local34.anInt10225 != 0) {
					super.aByteArrayArrayArray11[arg8][arg4][arg1] = (byte) (super.aByteArrayArrayArray11[arg8][arg4][arg1] | 0x4);
				}
				if (local34.anInt10254 != 0 && arg9 != null) {
					arg9.method6644(!local34.aBoolean796, arg4, local59, local56, local34.aBoolean797, arg1);
				}
			} else {
				@Pc(692) Class9_Sub4_Sub5 local692;
				if (arg7 == 0) {
					@Pc(666) int local666 = local34.anInt10225;
					if (Static462.aBoolean662 && local34.anInt10225 == -1) {
						local666 = 1;
					}
					if (local242) {
						@Pc(710) Class9_Sub4_Sub5_Sub2 local710 = new Class9_Sub4_Sub5_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, local204);
						local692 = local710;
						if (local710.method8437()) {
							local710.method8434(arg5);
						}
					} else {
						local692 = new Class9_Sub4_Sub5_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, arg2);
					}
					Static148.method2948(arg8, arg4, arg1, local692, (Class9_Sub4_Sub5) null);
					if (arg6 == 0) {
						if (Static87.aBoolean208 && local34.aBoolean794) {
							local138.ka(arg4, arg1, 50);
							local138.ka(arg4, arg1 + 1, 50);
						}
						if (local666 == 1 && !super.aBoolean553) {
							Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 1);
						}
					} else if (arg6 == 1) {
						if (Static87.aBoolean208 && local34.aBoolean794) {
							local138.ka(arg4, arg1 + 1, 50);
							local138.ka(arg4 + 1, arg1 - -1, 50);
						}
						if (local666 == 1 && !super.aBoolean553) {
							Static423.method6595(arg4, arg8, arg1 + 1, -local34.anInt10222, local34.anInt10245, 2);
						}
					} else if (arg6 == 2) {
						if (Static87.aBoolean208 && local34.aBoolean794) {
							local138.ka(arg4 + 1, arg1, 50);
							local138.ka(arg4 + 1, arg1 - -1, 50);
						}
						if (local666 == 1 && !super.aBoolean553) {
							Static423.method6595(arg4 + 1, arg8, arg1, -local34.anInt10222, local34.anInt10245, 1);
						}
					} else if (arg6 == 3) {
						if (Static87.aBoolean208 && local34.aBoolean794) {
							local138.ka(arg4, arg1, 50);
							local138.ka(arg4 + 1, arg1, 50);
						}
						if (local666 == 1 && !super.aBoolean553) {
							Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 2);
						}
					}
					if (local34.anInt10254 != 0 && arg9 != null) {
						arg9.method6640(arg1, local34.aBoolean797, !local34.aBoolean796, arg6, arg4, arg7);
					}
					if (local34.anInt10230 != 64) {
						Static367.method7657(arg8, arg4, arg1, local34.anInt10230);
					}
				} else {
					@Pc(950) Class9_Sub4_Sub5 local950;
					@Pc(968) Class9_Sub4_Sub5_Sub2 local968;
					if (arg7 == 1) {
						if (local242) {
							local968 = new Class9_Sub4_Sub5_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, local204);
							if (local968.method8437()) {
								local968.method8434(arg5);
							}
							local950 = local968;
						} else {
							local950 = new Class9_Sub4_Sub5_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, arg2);
						}
						Static148.method2948(arg8, arg4, arg1, local950, (Class9_Sub4_Sub5) null);
						if (local34.aBoolean794 && Static87.aBoolean208) {
							if (arg6 == 0) {
								local138.ka(arg4, arg1 + 1, 50);
							} else if (arg6 == 1) {
								local138.ka(arg4 + 1, arg1 - -1, 50);
							} else if (arg6 == 2) {
								local138.ka(arg4 + 1, arg1, 50);
							} else if (arg6 == 3) {
								local138.ka(arg4, arg1, 50);
							}
						}
						if (local34.anInt10254 != 0 && arg9 != null) {
							arg9.method6640(arg1, local34.aBoolean797, !local34.aBoolean796, arg6, arg4, arg7);
						}
					} else if (arg7 == 2) {
						local392 = arg6 + 1 & 0x3;
						if (local242) {
							@Pc(1102) Class9_Sub4_Sub5_Sub2 local1102 = new Class9_Sub4_Sub5_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6 + 4, local204);
							@Pc(1118) Class9_Sub4_Sub5_Sub2 local1118 = new Class9_Sub4_Sub5_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, local392, local204);
							if (local1102.method8437()) {
								local1102.method8434(arg5);
							}
							local950 = local1102;
							if (local1118.method8437()) {
								local1118.method8434(arg5);
							}
							local692 = local1118;
						} else {
							local950 = new Class9_Sub4_Sub5_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6 + 4, arg2);
							local692 = new Class9_Sub4_Sub5_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, local392, arg2);
						}
						Static148.method2948(arg8, arg4, arg1, local950, local692);
						if ((local34.anInt10225 == 1 || Static462.aBoolean662 && local34.anInt10225 == -1) && !super.aBoolean553) {
							if (arg6 == 0) {
								Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 1);
								Static423.method6595(arg4, arg8, arg1 + 1, local34.anInt10222, local34.anInt10245, 2);
							} else if (arg6 == 1) {
								Static423.method6595(arg4 + 1, arg8, arg1, local34.anInt10222, local34.anInt10245, 1);
								Static423.method6595(arg4, arg8, arg1 + 1, local34.anInt10222, local34.anInt10245, 2);
							} else if (arg6 == 2) {
								Static423.method6595(arg4 + 1, arg8, arg1, local34.anInt10222, local34.anInt10245, 1);
								Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 2);
							} else if (arg6 == 3) {
								Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 1);
								Static423.method6595(arg4, arg8, arg1, local34.anInt10222, local34.anInt10245, 2);
							}
						}
						if (local34.anInt10254 != 0 && arg9 != null) {
							arg9.method6640(arg1, local34.aBoolean797, !local34.aBoolean796, arg6, arg4, arg7);
						}
						if (local34.anInt10230 != 64) {
							Static367.method7657(arg8, arg4, arg1, local34.anInt10230);
						}
					} else if (arg7 == 3) {
						if (local242) {
							local968 = new Class9_Sub4_Sub5_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, local204);
							local950 = local968;
							if (local968.method8437()) {
								local968.method8434(arg5);
							}
						} else {
							local950 = new Class9_Sub4_Sub5_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg7, arg6, arg2);
						}
						Static148.method2948(arg8, arg4, arg1, local950, (Class9_Sub4_Sub5) null);
						if (local34.aBoolean794 && Static87.aBoolean208) {
							if (arg6 == 0) {
								local138.ka(arg4, arg1 + 1, 50);
							} else if (arg6 == 1) {
								local138.ka(arg4 + 1, arg1 + 1, 50);
							} else if (arg6 == 2) {
								local138.ka(arg4 + 1, arg1, 50);
							} else if (arg6 == 3) {
								local138.ka(arg4, arg1, 50);
							}
						}
						if (local34.anInt10254 != 0 && arg9 != null) {
							arg9.method6640(arg1, local34.aBoolean797, !local34.aBoolean796, arg6, arg4, arg7);
						}
					} else if (arg7 == 9) {
						if (local242) {
							local358 = new Class9_Sub4_Sub2_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, arg4, arg1, arg1, arg7, arg6, local204);
							local394 = local358;
							if (local358.method8437()) {
								local358.method8434(arg5);
							}
						} else {
							local394 = new Class9_Sub4_Sub2_Sub5(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg4, local56 + arg4 - 1, arg1, local59 + arg1 - 1, arg7, arg6, arg2);
						}
						Static397.method6261(local394, false);
						if (local34.anInt10225 == 1 && !super.aBoolean553) {
							@Pc(1557) byte local1557;
							if ((arg6 & 0x1) == 0) {
								local1557 = 8;
							} else {
								local1557 = 16;
							}
							Static423.method6595(arg4, arg8, arg1, 0, local34.anInt10245, local1557);
						}
						if (local34.anInt10254 != 0 && arg9 != null) {
							arg9.method6644(!local34.aBoolean796, arg4, local59, local56, local34.aBoolean797, arg1);
						}
						if (local34.anInt10230 != 64) {
							Static367.method7657(arg8, arg4, arg1, local34.anInt10230);
						}
					} else {
						@Pc(1629) Class9_Sub4_Sub1 local1629;
						if (arg7 == 4) {
							if (local242) {
								@Pc(1648) Class9_Sub4_Sub1_Sub2 local1648 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, arg6);
								if (local1648.method8437()) {
									local1648.method8434(arg5);
								}
								local1629 = local1648;
							} else {
								local1629 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, arg6, arg2);
							}
							Static205.method6796(arg8, arg4, arg1, local1629, (Class9_Sub4_Sub1) null);
						} else {
							@Pc(1676) int local1676;
							@Pc(1682) Interface22 local1682;
							@Pc(1749) Class9_Sub4_Sub1_Sub2 local1749;
							if (arg7 == 5) {
								local1676 = 65;
								local1682 = (Interface22) Static37.method1328(arg8, arg4, arg1);
								if (local1682 != null) {
									local1676 = Static249.aClass310_1.method7474(local1682.method8436()).anInt10230 + 1;
								}
								if (local242) {
									local1749 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, Static602.anIntArray543[arg6] * local1676, local1676 * Static208.anIntArray200[arg6], arg7, arg6);
									if (local1749.method8437()) {
										local1749.method8434(arg5);
									}
									local1629 = local1749;
								} else {
									local1629 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, local1676 * Static602.anIntArray543[arg6], local1676 * Static208.anIntArray200[arg6], arg7, arg6, arg2);
								}
								Static205.method6796(arg8, arg4, arg1, local1629, (Class9_Sub4_Sub1) null);
							} else if (arg7 == 6) {
								local1676 = 33;
								local1682 = (Interface22) Static37.method1328(arg8, arg4, arg1);
								if (local1682 != null) {
									local1676 = Static249.aClass310_1.method7474(local1682.method8436()).anInt10230 / 2 + 1;
								}
								if (local242) {
									local1749 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, Static602.anIntArray543[arg6] * local1676, Static208.anIntArray200[arg6] * local1676, arg7, arg6 + 4);
									local1629 = local1749;
									if (local1749.method8437()) {
										local1749.method8434(arg5);
									}
								} else {
									local1629 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, Static393.anIntArray368[arg6] * local1676, local1676 * Static148.anIntArray154[arg6], arg7, arg6 + 4, arg2);
								}
								Static205.method6796(arg8, arg4, arg1, local1629, (Class9_Sub4_Sub1) null);
							} else if (arg7 == 7) {
								local1676 = arg6 + 2 & 0x3;
								if (local242) {
									@Pc(1919) Class9_Sub4_Sub1_Sub2 local1919 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, local1676 + 4);
									local1629 = local1919;
									if (local1919.method8437()) {
										local1919.method8434(arg5);
									}
								} else {
									local1629 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, local1676 + 4, arg2);
								}
								Static205.method6796(arg8, arg4, arg1, local1629, (Class9_Sub4_Sub1) null);
							} else if (arg7 == 8) {
								local392 = arg6 + 2 & 0x3;
								local456 = 33;
								@Pc(1955) Interface22 local1955 = (Interface22) Static37.method1328(arg8, arg4, arg1);
								if (local1955 != null) {
									local456 = Static249.aClass310_1.method7474(local1955.method8436()).anInt10230 / 2 + 1;
								}
								@Pc(1999) Class9_Sub4_Sub1 local1999;
								@Pc(2019) Class9_Sub4_Sub1 local2019;
								if (local242) {
									local1999 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, local456 * Static393.anIntArray368[arg6], local456 * Static148.anIntArray154[arg6], arg7, arg6 + 4);
									local2019 = new Class9_Sub4_Sub1_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, local392 + 4);
									if (local1999.method8437()) {
										local1999.method8434(arg5);
									}
									if (local2019.method8437()) {
										local2019.method8434(arg5);
									}
								} else {
									local1999 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, Static393.anIntArray368[arg6] * local456, Static148.anIntArray154[arg6] * local456, arg7, arg6 + 4, arg2);
									local2019 = new Class9_Sub4_Sub1_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, 0, 0, arg7, local392 + 4, arg2);
								}
								Static205.method6796(arg8, arg4, arg1, local1999, local2019);
							}
						}
					}
				}
			}
		} else if (Static87.aClass6_Sub33_6.aClass14_Sub11_1.method4084() != 0 || local34.anInt10253 != 0 || local34.anInt10254 == 1 || local34.aBoolean799) {
			@Pc(302) Class9_Sub4_Sub3 local302;
			if (local242) {
				@Pc(300) Class9_Sub4_Sub3_Sub1 local300 = new Class9_Sub4_Sub3_Sub1(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg6, local204);
				local302 = local300;
				if (local300.method8437()) {
					local300.method8434(arg5);
				}
			} else {
				local302 = new Class9_Sub4_Sub3_Sub2(arg5, local34, arg8, arg3, local173, local165, local192, super.aBoolean553, arg6, arg2);
			}
			Static556.method7796(arg8, arg4, arg1, local302);
			if (local34.anInt10254 == 1 && arg9 != null) {
				arg9.method6641(arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZBLclient!ha;)V")
	public void method5813(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5 arg1) {
		Static464.method6951();
		if (!arg0) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt6938 > 1) {
				for (local18 = 0; local18 < super.anInt6934; local18++) {
					for (local22 = 0; super.anInt6933 > local22; local22++) {
						if ((Static495.aByteArrayArrayArray17[1][local18][local22] & 0x2) == 2) {
							Static374.method7973(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; super.anInt6938 > local18; local18++) {
				for (local22 = 0; local22 <= super.anInt6933; local22++) {
					for (@Pc(64) int local64 = 0; local64 <= super.anInt6934; local64++) {
						if ((super.aByteArrayArrayArray11[local18][local64][local22] & 0x4) != 0) {
							@Pc(79) int local79 = local64;
							@Pc(81) int local81 = local64;
							@Pc(83) int local83 = local22;
							@Pc(85) int local85 = local22;
							while (local83 > 0 && (super.aByteArrayArrayArray11[local18][local64][local83 - 1] & 0x4) != 0 && local22 - local83 < 10) {
								local83--;
							}
							while (local85 < super.anInt6933 && (super.aByteArrayArrayArray11[local18][local64][local85 + 1] & 0x4) != 0 && local85 - local83 < 10) {
								local85++;
							}
							@Pc(149) int local149;
							label111: while (local79 > 0 && local64 - local79 < 10) {
								for (local149 = local83; local149 <= local85; local149++) {
									if ((super.aByteArrayArrayArray11[local18][local79 - 1][local149] & 0x4) == 0) {
										break label111;
									}
								}
								local79--;
							}
							label98: while (local81 < super.anInt6934 && local81 - local79 < 10) {
								for (local149 = local83; local149 <= local85; local149++) {
									if ((super.aByteArrayArrayArray11[local18][local81 + 1][local149] & 0x4) == 0) {
										break label98;
									}
								}
								local81++;
							}
							if ((local81 + 1 - local79) * (local85 + -local83 + 1) >= 4) {
								local149 = super.anIntArrayArrayArray6[local18][local79][local83];
								Static184.method3436(local79 << 9, (local85 << 9) + 512, local18, (local81 << 9) + 512, local149, local83 << 9, local149);
								for (@Pc(276) int local276 = local79; local276 <= local81; local276++) {
									for (@Pc(280) int local280 = local83; local280 <= local85; local280++) {
										super.aByteArrayArrayArray11[local18][local276][local280] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static539.method7625();
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILclient!ha;Lclient!pfa;III)V")
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class258 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Interface22 local13 = this.method5807(arg0, arg4, arg1, arg5);
		if (local13 == null) {
			return;
		}
		@Pc(22) Class356 local22 = Static249.aClass310_1.method7474(local13.method8436());
		@Pc(26) int local26 = local13.method8435();
		@Pc(30) int local30 = local13.method8438();
		if (local22.method8328()) {
			Static542.method7642(local22, arg0, arg1, arg5);
		}
		if (local13.method8437()) {
			local13.method8439(arg2);
		}
		if (arg4 == 0) {
			Static460.method6926(arg1, arg5, arg0);
			if (local22.anInt10254 != 0) {
				arg3.method6632(local26, local22.aBoolean797, !local22.aBoolean796, arg5, local30, arg0);
			}
			if (local22.anInt10225 == 1) {
				if (local30 == 0) {
					Static180.method3387(1, arg1, arg5, arg0);
				} else if (local30 == 1) {
					Static180.method3387(2, arg1, arg5, arg0 + 1);
				} else if (local30 == 2) {
					Static180.method3387(1, arg1, arg5 + 1, arg0);
				} else if (local30 == 3) {
					Static180.method3387(2, arg1, arg5, arg0);
				}
			}
		} else if (arg4 == 1) {
			Static389.method6096(arg1, arg5, arg0);
		} else if (arg4 == 2) {
			Static224.method4123(arg1, arg5, arg0, rl.class);
			if (local22.anInt10254 != 0 && super.anInt6934 > arg5 + local22.anInt10250 && arg0 + local22.anInt10250 < super.anInt6933 && local22.anInt10238 + arg5 < super.anInt6934 && super.anInt6933 > arg0 + local22.anInt10238) {
				arg3.method6646(local22.anInt10250, local22.aBoolean797, local30, local22.anInt10238, arg0, !local22.aBoolean796, arg5);
			}
			if (local26 == 9) {
				if ((local30 & 0x1) == 0) {
					Static180.method3387(8, arg1, arg5, arg0);
				} else {
					Static180.method3387(16, arg1, arg5, arg0);
				}
			}
		} else if (arg4 == 3) {
			Static252.method4478(arg1, arg5, arg0);
			if (local22.anInt10254 == 1) {
				arg3.method6643(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!pfa;IB[BLclient!ha;I)V")
	public void method5815(@OriginalArg(0) Class258[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4) {
		@Pc(21) Class6_Sub8 local21 = new Class6_Sub8(arg2);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local21.method8225();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local21.method8214();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(54) int local54 = local38 & 0x3F;
				@Pc(60) int local60 = local38 >> 6 & 0x3F;
				@Pc(64) int local64 = local38 >> 12;
				@Pc(68) int local68 = local21.method8246();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg4 + local60;
				@Pc(84) int local84 = local54 + arg1;
				if (local80 > 0 && local84 > 0 && local80 < super.anInt6934 - 1 && super.anInt6933 - 1 > local84) {
					@Pc(112) Class258 local112 = null;
					if (!super.aBoolean553) {
						@Pc(117) int local117 = local64;
						if ((Static495.aByteArrayArrayArray17[1][local80][local84] & 0x2) == 2) {
							local117 = local64 - 1;
						}
						if (local117 >= 0) {
							local112 = arg0[local117];
						}
					}
					this.method5812(local23, local84, -1, local64, local80, arg3, local76, local72, local64, local112);
				}
			}
		}
	}
}
