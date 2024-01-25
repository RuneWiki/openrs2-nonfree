import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!el", name = "P", descriptor = "I")
	public int anInt2919 = 99;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIZ)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static99.aClass367_4, Static494.aClass314_5);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([Lclient!eo;IILclient!ha;I[B)V")
	public void method2592(@OriginalArg(0) Class106[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(18) Class5_Sub41 local18 = new Class5_Sub41(arg4);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method7817();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method7812();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local18.method7816();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg1 + local60;
				@Pc(84) int local84 = local54 + arg2;
				if (local80 > 0 && local84 > 0 && local80 < super.anInt2901 - 1 && super.anInt2909 - 1 > local84) {
					@Pc(113) Class106 local113 = null;
					if (!super.aBoolean248) {
						@Pc(118) int local118 = local64;
						if ((Static7.aByteArrayArrayArray1[1][local80][local84] & 0x2) == 2) {
							local118 = local64 - 1;
						}
						if (local118 >= 0) {
							local113 = arg0[local118];
						}
					}
					this.method2599(local64, local80, -1, local113, local84, local20, local72, arg3, local76, local64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)Lclient!aia;")
	public Interface1 method2593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface1 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface1) Static506.method7239(arg2, arg1, arg3);
		}
		if (arg0 == 1) {
			local5 = (Interface1) Static9.method8812(arg2, arg1, arg3);
		}
		if (arg0 == 2) {
			local5 = (Interface1) Static241.method3771(arg2, arg1, arg3, aia.class);
		}
		if (arg0 == 3) {
			local5 = (Interface1) Static570.method7867(arg2, arg1, arg3);
		}
		return local5;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I[IIILclient!ha;Lclient!mc;)V")
	public void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) Class5_Sub41 arg4) {
		if (super.aBoolean248) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class347 local19 = null;
		while (true) {
			@Pc(32) int local32;
			@Pc(123) int local123;
			@Pc(162) int local162;
			@Pc(166) int local166;
			@Pc(499) int local499;
			while (arg4.aByteArray93.length > arg4.anInt9230) {
				local32 = arg4.method7816();
				if (local32 == 0) {
					local19 = new Class347(arg4);
				} else {
					@Pc(270) int local270;
					@Pc(176) int local176;
					@Pc(182) int local182;
					if (local32 == 1) {
						local123 = arg4.method7816();
						if (local123 > 0) {
							for (local499 = 0; local499 < local123; local499++) {
								@Pc(508) Class199 local508 = new Class199(arg3, arg4, 2);
								if (local508.anInt5996 == 31) {
									@Pc(521) Class142 local521 = Static497.aClass182_4.method4675(arg4.method7860());
									local508.method4984(local521.anInt4045, local521.anInt4039, local521.anInt4040, local521.anInt4044);
								}
								if (arg3.method6892() > 0) {
									@Pc(538) Class5_Sub18 local538 = local508.aClass5_Sub18_2;
									local270 = local538.method8055() + (arg2 << 9);
									local176 = (arg0 << 9) + local538.method8057();
									local182 = local270 >> 9;
									@Pc(562) int local562 = local176 >> 9;
									if (local182 >= 0 && local562 >= 0 && super.anInt2901 > local182 && local562 < super.anInt2909) {
										local538.method8048(local270, super.anIntArrayArrayArray15[local508.anInt6000][local182][local562] - local538.method8051(), local176);
										Static10.method146(local508);
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local19 == null) {
							local19 = new Class347();
						}
						local19.method8092(arg4);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local123 = 0; local123 < 4; local123++) {
							@Pc(129) byte local129 = arg4.method7861();
							if (local129 == 0 && super.aByteArrayArrayArray16[local123] != null) {
								local162 = arg2;
								local166 = arg2 + 64;
								local270 = arg0;
								local176 = arg0 + 64;
								if (arg2 < 0) {
									local162 = 0;
								} else if (super.anInt2901 <= arg2) {
									local162 = super.anInt2901;
								}
								if (local166 < 0) {
									local166 = 0;
								} else if (local166 >= super.anInt2901) {
									local166 = super.anInt2901;
								}
								if (arg0 < 0) {
									local270 = 0;
								} else if (super.anInt2909 <= arg0) {
									local270 = super.anInt2909;
								}
								if (local176 < 0) {
									local176 = 0;
								} else if (local176 >= super.anInt2909) {
									local176 = super.anInt2909;
								}
								while (local162 < local166) {
									while (local270 < local176) {
										super.aByteArrayArrayArray16[local123][local162][local270] = 0;
										local270++;
									}
									local162++;
								}
							} else if (local129 == 1) {
								if (super.aByteArrayArrayArray16[local123] == null) {
									super.aByteArrayArrayArray16[local123] = new byte[super.anInt2901 + 1][super.anInt2909 + 1];
								}
								for (local162 = 0; local162 < 64; local162 += 4) {
									for (local166 = 0; local166 < 64; local166 += 4) {
										@Pc(172) byte local172 = arg4.method7861();
										for (local176 = local162 + arg2; local176 < local162 + arg2 + 4; local176++) {
											for (local182 = local166 + arg0; local182 < arg0 + local166 + 4; local182++) {
												if (local176 >= 0 && local176 < super.anInt2901 && local182 >= 0 && local182 < super.anInt2909) {
													super.aByteArrayArrayArray16[local123][local176][local182] = local172;
												}
											}
										}
									}
								}
							} else if (local129 == 2) {
								if (super.aByteArrayArrayArray16[local123] == null) {
									super.aByteArrayArrayArray16[local123] = new byte[super.anInt2901 + 1][super.anInt2909 + 1];
								}
								if (local123 > 0) {
									local162 = arg2;
									local166 = arg2 + 64;
									local270 = arg0;
									if (arg2 < 0) {
										local162 = 0;
									} else if (super.anInt2901 <= arg2) {
										local162 = super.anInt2901;
									}
									if (arg0 < 0) {
										local270 = 0;
									} else if (super.anInt2909 <= arg0) {
										local270 = super.anInt2909;
									}
									local176 = arg0 + 64;
									if (local166 < 0) {
										local166 = 0;
									} else if (local166 >= super.anInt2901) {
										local166 = super.anInt2901;
									}
									if (local176 < 0) {
										local176 = 0;
									} else if (local176 >= super.anInt2909) {
										local176 = super.anInt2909;
									}
									while (local166 > local162) {
										while (local176 > local270) {
											super.aByteArrayArrayArray16[local123][local162][local270] = super.aByteArrayArrayArray16[local123 - 1][local162][local270];
											local270++;
										}
										local162++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg1 == null) {
						arg4.anInt9230 += 10;
					} else {
						arg1[0] = arg4.method7860();
						arg1[1] = arg4.method7849();
						arg1[2] = arg4.method7849();
						arg1[3] = arg4.method7849();
						arg1[4] = arg4.method7860();
					}
				}
			}
			if (local19 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local123 = 0; local123 < 8; local123++) {
						local499 = local32 + (arg2 >> 3);
						local162 = local123 + (arg0 >> 3);
						if (local499 >= 0 && super.anInt2901 >> 3 > local499 && local162 >= 0 && super.anInt2909 >> 3 > local162) {
							Static674.method9014(local19, local162, local499);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray16 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray16[local32] != null) {
						for (local123 = 0; local123 < 16; local123++) {
							for (local499 = 0; local499 < 16; local499++) {
								local162 = (arg2 >> 2) + local123;
								local166 = (arg0 >> 2) + local499;
								if (local162 >= 0 && local162 < 26 && local166 >= 0 && local166 < 26) {
									super.aByteArrayArrayArray16[local32][local162][local166] = 0;
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

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!mc;ILclient!ha;[IIIIIIII)V")
	public void method2597(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean248) {
			return;
		}
		@Pc(22) Class347 local22 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(34) int local34 = (arg7 & 0x7) * 8;
		@Pc(40) int local40 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(45) int local45;
			@Pc(81) int local81;
			@Pc(116) int local116;
			@Pc(394) int local394;
			while (arg0.aByteArray93.length > arg0.anInt9230) {
				local45 = arg0.method7816();
				if (local45 == 0) {
					local22 = new Class347(arg0);
				} else {
					@Pc(133) int local133;
					@Pc(136) int local136;
					@Pc(173) int local173;
					@Pc(247) int local247;
					if (local45 == 1) {
						local81 = arg0.method7816();
						if (local81 > 0) {
							for (local394 = 0; local394 < local81; local394++) {
								@Pc(402) Class199 local402 = new Class199(arg2, arg0, 2);
								if (local402.anInt5996 == 31) {
									@Pc(415) Class142 local415 = Static497.aClass182_4.method4675(arg0.method7860());
									local402.method4984(local415.anInt4045, local415.anInt4039, local415.anInt4040, local415.anInt4044);
								}
								if (arg2.method6892() > 0) {
									@Pc(435) Class5_Sub18 local435 = local402.aClass5_Sub18_2;
									local247 = local435.method8055() >> 9;
									local133 = local435.method8057() >> 9;
									if (arg1 == local402.anInt6000 && local34 <= local247 && local34 + 8 > local247 && local40 <= local133 && local40 + 8 > local133) {
										local136 = Static624.method8455(arg5, local435.method8057() & 0xFFF, local435.method8055() & 0xFFF) + (arg8 << 9);
										local173 = Static50.method626(local435.method8055() & 0xFFF, local435.method8057() & 0xFFF, arg5) + (arg6 << 9);
										local247 = local136 >> 9;
										local133 = local173 >> 9;
										if (local247 >= 0 && local133 >= 0 && super.anInt2901 > local247 && super.anInt2909 > local133) {
											local435.method8048(local136, super.anIntArrayArrayArray15[arg1][local247][local133] - local435.method8051(), local173);
											Static10.method146(local402);
										}
									}
								}
							}
						}
					} else if (local45 == 2) {
						if (local22 == null) {
							local22 = new Class347();
						}
						local22.method8092(arg0);
					} else if (local45 != 128) {
						if (local45 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local81 = 0; local81 < 4; local81++) {
							@Pc(86) byte local86 = arg0.method7861();
							@Pc(119) int local119;
							if (local86 == 0 && super.aByteArrayArrayArray16[arg9] != null) {
								if (local81 <= arg1) {
									local116 = arg8;
									local119 = arg8 + 7;
									local247 = arg6;
									if (local119 < 0) {
										local119 = 0;
									} else if (local119 >= super.anInt2901) {
										local119 = super.anInt2901;
									}
									if (arg6 < 0) {
										local247 = 0;
									} else if (super.anInt2909 <= arg6) {
										local247 = super.anInt2909;
									}
									if (arg8 < 0) {
										local116 = 0;
									} else if (super.anInt2901 <= arg8) {
										local116 = super.anInt2901;
									}
									local133 = arg6 + 7;
									if (local133 < 0) {
										local133 = 0;
									} else if (local133 >= super.anInt2909) {
										local133 = super.anInt2909;
									}
									while (local119 > local116) {
										while (local133 > local247) {
											super.aByteArrayArrayArray16[arg9][local116][local247] = 0;
											local247++;
										}
										local116++;
									}
								}
							} else if (local86 == 1) {
								if (super.aByteArrayArrayArray16[arg9] == null) {
									super.aByteArrayArrayArray16[arg9] = new byte[super.anInt2901 + 1][super.anInt2909 + 1];
								}
								for (local116 = 0; local116 < 64; local116 += 4) {
									for (local119 = 0; local119 < 64; local119 += 4) {
										@Pc(124) byte local124 = arg0.method7861();
										if (local81 <= arg1) {
											for (local133 = local116; local133 < local116 + 4; local133++) {
												for (local136 = local119; local136 < local119 + 4; local136++) {
													if (local133 >= local34 && local34 + 8 > local133 && local40 <= local136 && local40 < local40 + 8) {
														local173 = arg8 + Static87.method5158(local136 & 0x7, arg5, local133 & 0x7);
														@Pc(186) int local186 = arg6 + Static369.method5565(arg5, local136 & 0x7, local133 & 0x7);
														if (local173 >= 0 && super.anInt2901 > local173 && local186 >= 0 && local186 < super.anInt2909) {
															super.aByteArrayArrayArray16[arg9][local173][local186] = local124;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg0.anInt9230 += 10;
					} else {
						arg3[0] = arg0.method7860();
						arg3[1] = arg0.method7849();
						arg3[2] = arg0.method7849();
						arg3[3] = arg0.method7849();
						arg3[4] = arg0.method7860();
					}
				}
			}
			if (local22 != null) {
				Static674.method9014(local22, arg6 >> 3, arg8 >> 3);
			}
			if (super.aByteArrayArrayArray16 != null && super.aByteArrayArrayArray16[arg9] != null) {
				local45 = arg8 + 7;
				local81 = arg6 + 7;
				for (local394 = arg8; local394 < local45; local394++) {
					for (local116 = arg6; local116 < local81; local116++) {
						super.aByteArrayArrayArray16[arg9][local394][local116] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILclient!eo;IIIILclient!ha;II)V")
	public void method2599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class65 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0 && !Static658.method8808(Static419.anInt7416, arg4, arg1, arg0)) {
			return;
		}
		if (arg9 < this.anInt2919) {
			this.anInt2919 = arg9;
		}
		@Pc(33) Class164 local33 = Static568.aClass315_5.method7511(arg5);
		if (Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6299() == 0 && local33.aBoolean377) {
			return;
		}
		@Pc(59) int local59;
		@Pc(56) int local56;
		if (arg8 == 1 || arg8 == 3) {
			local59 = local33.anInt4645;
			local56 = local33.anInt4634;
		} else {
			local56 = local33.anInt4645;
			local59 = local33.anInt4634;
		}
		@Pc(80) int local80;
		@Pc(78) int local78;
		if (super.anInt2901 < arg1 + local59) {
			local78 = arg1 + 1;
			local80 = arg1;
		} else {
			local80 = arg1 + (local59 >> 1);
			local78 = arg1 + (local59 + 1 >> 1);
		}
		@Pc(117) int local117;
		@Pc(111) int local111;
		if (super.anInt2909 >= local56 + arg4) {
			local111 = arg4 + (local56 + 1 >> 1);
			local117 = arg4 + (local56 >> 1);
		} else {
			local111 = arg4 + 1;
			local117 = arg4;
		}
		@Pc(129) Class109 local129 = Static495.aClass109Array4[arg0];
		@Pc(157) int local157 = local129.method7695(local117, local80) + local129.method7695(local117, local78) + local129.method7695(local111, local80) + local129.method7695(local111, local78) >> 2;
		@Pc(165) int local165 = (local59 << 8) + (arg1 << 9);
		@Pc(174) int local174 = (arg4 << 9) + (local56 << 8);
		@Pc(186) boolean local186 = Static576.aBoolean795 && !super.aBoolean248 && local33.aBoolean381;
		if (local33.method3915()) {
			Static331.method5106(arg8, arg4, arg1, (Class28_Sub1_Sub4_Sub2_Sub2) null, arg9, (Class28_Sub1_Sub4_Sub2_Sub1) null, local33);
		}
		@Pc(224) boolean local224 = arg2 == -1 && local33.anInt4678 == -1 && local33.anIntArray246 == null && local33.anIntArray247 == null && !local33.aBoolean376 && !local33.aBoolean386;
		if (Static547.aBoolean765 && (Static656.method8799(arg6) && local33.anInt4651 != 1 || !(!Static461.method6595(arg6) || local33.anInt4651 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(382) Class28_Sub1_Sub4 local382;
			@Pc(346) Class28_Sub1_Sub4_Sub5 local346;
			@Pc(380) int local380;
			@Pc(443) int local443;
			if (arg6 == 10 || arg6 == 11) {
				local346 = null;
				if (local224) {
					@Pc(376) Class28_Sub1_Sub4_Sub5 local376 = new Class28_Sub1_Sub4_Sub5(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, local59 + arg1 - 1, arg4, local56 + arg4 - 1, arg6, arg8, local186);
					local380 = local376.method8992();
					local382 = local376;
					local346 = local376;
				} else {
					local382 = new Class28_Sub1_Sub4_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, arg1 + local59 - 1, arg4, local56 + arg4 - 1, arg6, arg8, arg2);
					local380 = 15;
				}
				if (Static308.method4867(local382, false)) {
					if (local346 != null && local346.method8983()) {
						local346.method8985(arg7);
					}
					if (local33.aBoolean378 && Static576.aBoolean795) {
						if (local380 > 30) {
							local380 = 30;
						}
						for (local443 = 0; local443 <= local59; local443++) {
							for (@Pc(447) int local447 = 0; local447 <= local56; local447++) {
								local129.ka(local443 + arg1, arg4 - -local447, local380);
							}
						}
					}
				}
				if (local33.anInt4632 != 0 && arg3 != null) {
					arg3.method2664(local59, arg4, local33.aBoolean380, arg1, !local33.aBoolean384, local56);
				}
			} else if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
				if (local224) {
					local346 = new Class28_Sub1_Sub4_Sub5(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, arg1 + local59 - 1, arg4, arg4 + local56 - 1, arg6, arg8, local186);
					if (local346.method8983()) {
						local346.method8985(arg7);
					}
					local382 = local346;
				} else {
					local382 = new Class28_Sub1_Sub4_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, local59 + arg1 - 1, arg4, local56 + arg4 - 1, arg6, arg8, arg2);
				}
				Static308.method4867(local382, false);
				if (Static576.aBoolean795 && !super.aBoolean248 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg9 > 0 && local33.anInt4651 != 0) {
					super.aByteArrayArrayArray15[arg9][arg1][arg4] = (byte) (super.aByteArrayArrayArray15[arg9][arg1][arg4] | 0x4);
				}
				if (local33.anInt4632 != 0 && arg3 != null) {
					arg3.method2664(local59, arg4, local33.aBoolean380, arg1, !local33.aBoolean384, local56);
				}
			} else {
				@Pc(692) Class28_Sub1_Sub5 local692;
				if (arg6 == 0) {
					@Pc(664) int local664 = local33.anInt4651;
					if (Static408.aBoolean626 && local33.anInt4651 == -1) {
						local664 = 1;
					}
					if (local224) {
						@Pc(690) Class28_Sub1_Sub5_Sub2 local690 = new Class28_Sub1_Sub5_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, local186);
						local692 = local690;
						if (local690.method8983()) {
							local690.method8985(arg7);
						}
					} else {
						local692 = new Class28_Sub1_Sub5_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, arg2);
					}
					Static467.method6658(arg9, arg1, arg4, local692, (Class28_Sub1_Sub5) null);
					if (arg8 == 0) {
						if (Static576.aBoolean795 && local33.aBoolean378) {
							local129.ka(arg1, arg4, 50);
							local129.ka(arg1, arg4 + 1, 50);
						}
						if (local664 == 1 && !super.aBoolean248) {
							Static203.method3289(arg4, local33.lb, local33.anInt4624, 1, arg9, arg1);
						}
					} else if (arg8 == 1) {
						if (Static576.aBoolean795 && local33.aBoolean378) {
							local129.ka(arg1, arg4 + 1, 50);
							local129.ka(arg1 + 1, arg4 + 1, 50);
						}
						if (local664 == 1 && !super.aBoolean248) {
							Static203.method3289(arg4 + 1, local33.lb, -local33.anInt4624, 2, arg9, arg1);
						}
					} else if (arg8 == 2) {
						if (Static576.aBoolean795 && local33.aBoolean378) {
							local129.ka(arg1 + 1, arg4, 50);
							local129.ka(arg1 + 1, arg4 + 1, 50);
						}
						if (local664 == 1 && !super.aBoolean248) {
							Static203.method3289(arg4, local33.lb, -local33.anInt4624, 1, arg9, arg1 + 1);
						}
					} else if (arg8 == 3) {
						if (Static576.aBoolean795 && local33.aBoolean378) {
							local129.ka(arg1, arg4, 50);
							local129.ka(arg1 + 1, arg4, 50);
						}
						if (local664 == 1 && !super.aBoolean248) {
							Static203.method3289(arg4, local33.lb, local33.anInt4624, 2, arg9, arg1);
						}
					}
					if (local33.anInt4632 != 0 && arg3 != null) {
						arg3.method2672(local33.aBoolean380, arg8, arg6, !local33.aBoolean384, arg1, arg4);
					}
					if (local33.anInt4637 != 64) {
						Static272.method4242(arg9, arg1, arg4, local33.anInt4637);
					}
				} else {
					@Pc(955) Class28_Sub1_Sub5 local955;
					@Pc(973) Class28_Sub1_Sub5_Sub2 local973;
					if (arg6 == 1) {
						if (local224) {
							local973 = new Class28_Sub1_Sub5_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, local186);
							if (local973.method8983()) {
								local973.method8985(arg7);
							}
							local955 = local973;
						} else {
							local955 = new Class28_Sub1_Sub5_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, arg2);
						}
						Static467.method6658(arg9, arg1, arg4, local955, (Class28_Sub1_Sub5) null);
						if (local33.aBoolean378 && Static576.aBoolean795) {
							if (arg8 == 0) {
								local129.ka(arg1, arg4 + 1, 50);
							} else if (arg8 == 1) {
								local129.ka(arg1 + 1, arg4 + 1, 50);
							} else if (arg8 == 2) {
								local129.ka(arg1 + 1, arg4, 50);
							} else if (arg8 == 3) {
								local129.ka(arg1, arg4, 50);
							}
						}
						if (local33.anInt4632 != 0 && arg3 != null) {
							arg3.method2672(local33.aBoolean380, arg8, arg6, !local33.aBoolean384, arg1, arg4);
						}
					} else if (arg6 == 2) {
						local380 = arg8 + 1 & 0x3;
						if (local224) {
							@Pc(1129) Class28_Sub1_Sub5_Sub2 local1129 = new Class28_Sub1_Sub5_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8 + 4, local186);
							@Pc(1145) Class28_Sub1_Sub5_Sub2 local1145 = new Class28_Sub1_Sub5_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, local380, local186);
							if (local1129.method8983()) {
								local1129.method8985(arg7);
							}
							local692 = local1145;
							if (local1145.method8983()) {
								local1145.method8985(arg7);
							}
							local955 = local1129;
						} else {
							local955 = new Class28_Sub1_Sub5_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8 + 4, arg2);
							local692 = new Class28_Sub1_Sub5_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, local380, arg2);
						}
						Static467.method6658(arg9, arg1, arg4, local955, local692);
						if ((local33.anInt4651 == 1 || Static408.aBoolean626 && local33.anInt4651 == -1) && !super.aBoolean248) {
							if (arg8 == 0) {
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 1, arg9, arg1);
								Static203.method3289(arg4 + 1, local33.lb, local33.anInt4624, 2, arg9, arg1);
							} else if (arg8 == 1) {
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 1, arg9, arg1 + 1);
								Static203.method3289(arg4 + 1, local33.lb, local33.anInt4624, 2, arg9, arg1);
							} else if (arg8 == 2) {
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 1, arg9, arg1 + 1);
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 2, arg9, arg1);
							} else if (arg8 == 3) {
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 1, arg9, arg1);
								Static203.method3289(arg4, local33.lb, local33.anInt4624, 2, arg9, arg1);
							}
						}
						if (local33.anInt4632 != 0 && arg3 != null) {
							arg3.method2672(local33.aBoolean380, arg8, arg6, !local33.aBoolean384, arg1, arg4);
						}
						if (local33.anInt4637 != 64) {
							Static272.method4242(arg9, arg1, arg4, local33.anInt4637);
						}
					} else if (arg6 == 3) {
						if (local224) {
							local973 = new Class28_Sub1_Sub5_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, local186);
							if (local973.method8983()) {
								local973.method8985(arg7);
							}
							local955 = local973;
						} else {
							local955 = new Class28_Sub1_Sub5_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg6, arg8, arg2);
						}
						Static467.method6658(arg9, arg1, arg4, local955, (Class28_Sub1_Sub5) null);
						if (local33.aBoolean378 && Static576.aBoolean795) {
							if (arg8 == 0) {
								local129.ka(arg1, arg4 + 1, 50);
							} else if (arg8 == 1) {
								local129.ka(arg1 + 1, arg4 + 1, 50);
							} else if (arg8 == 2) {
								local129.ka(arg1 + 1, arg4, 50);
							} else if (arg8 == 3) {
								local129.ka(arg1, arg4, 50);
							}
						}
						if (local33.anInt4632 != 0 && arg3 != null) {
							arg3.method2672(local33.aBoolean380, arg8, arg6, !local33.aBoolean384, arg1, arg4);
						}
					} else if (arg6 == 9) {
						if (local224) {
							local346 = new Class28_Sub1_Sub4_Sub5(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, arg1, arg4, arg4, arg6, arg8, local186);
							if (local346.method8983()) {
								local346.method8985(arg7);
							}
							local382 = local346;
						} else {
							local382 = new Class28_Sub1_Sub4_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg1, local59 + arg1 - 1, arg4, local56 + arg4 - 1, arg6, arg8, arg2);
						}
						Static308.method4867(local382, false);
						if (local33.anInt4651 == 1 && !super.aBoolean248) {
							@Pc(1550) byte local1550;
							if ((arg8 & 0x1) == 0) {
								local1550 = 8;
							} else {
								local1550 = 16;
							}
							Static203.method3289(arg4, local33.lb, 0, local1550, arg9, arg1);
						}
						if (local33.anInt4632 != 0 && arg3 != null) {
							arg3.method2664(local59, arg4, local33.aBoolean380, arg1, !local33.aBoolean384, local56);
						}
						if (local33.anInt4637 != 64) {
							Static272.method4242(arg9, arg1, arg4, local33.anInt4637);
						}
					} else {
						@Pc(1617) Class28_Sub1_Sub3 local1617;
						if (arg6 == 4) {
							if (local224) {
								@Pc(1636) Class28_Sub1_Sub3_Sub2 local1636 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, arg8);
								local1617 = local1636;
								if (local1636.method8983()) {
									local1636.method8985(arg7);
								}
							} else {
								local1617 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, arg8, arg2);
							}
							Static228.method3555(arg9, arg1, arg4, local1617, (Class28_Sub1_Sub3) null);
						} else {
							@Pc(1660) int local1660;
							@Pc(1666) Interface1 local1666;
							@Pc(1733) Class28_Sub1_Sub3_Sub2 local1733;
							if (arg6 == 5) {
								local1660 = 65;
								local1666 = (Interface1) Static506.method7239(arg9, arg1, arg4);
								if (local1666 != null) {
									local1660 = Static568.aClass315_5.method7511(local1666.method8986()).anInt4637 + 1;
								}
								if (local224) {
									local1733 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, Static490.anIntArray459[arg8] * local1660, Static298.anIntArray323[arg8] * local1660, arg6, arg8);
									if (local1733.method8983()) {
										local1733.method8985(arg7);
									}
									local1617 = local1733;
								} else {
									local1617 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, Static490.anIntArray459[arg8] * local1660, Static298.anIntArray323[arg8] * local1660, arg6, arg8, arg2);
								}
								Static228.method3555(arg9, arg1, arg4, local1617, (Class28_Sub1_Sub3) null);
							} else if (arg6 == 6) {
								local1660 = 33;
								local1666 = (Interface1) Static506.method7239(arg9, arg1, arg4);
								if (local1666 != null) {
									local1660 = Static568.aClass315_5.method7511(local1666.method8986()).anInt4637 / 2 + 1;
								}
								if (local224) {
									local1733 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, Static490.anIntArray459[arg8] * local1660, local1660 * Static298.anIntArray323[arg8], arg6, arg8 + 4);
									if (local1733.method8983()) {
										local1733.method8985(arg7);
									}
									local1617 = local1733;
								} else {
									local1617 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, local1660 * Static564.anIntArray400[arg8], Static207.anIntArray196[arg8] * local1660, arg6, arg8 + 4, arg2);
								}
								Static228.method3555(arg9, arg1, arg4, local1617, (Class28_Sub1_Sub3) null);
							} else if (arg6 == 7) {
								local1660 = arg8 + 2 & 0x3;
								if (local224) {
									@Pc(1905) Class28_Sub1_Sub3_Sub2 local1905 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, local1660 + 4);
									local1617 = local1905;
									if (local1905.method8983()) {
										local1905.method8985(arg7);
									}
								} else {
									local1617 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, local1660 + 4, arg2);
								}
								Static228.method3555(arg9, arg1, arg4, local1617, (Class28_Sub1_Sub3) null);
							} else if (arg6 == 8) {
								local380 = arg8 + 2 & 0x3;
								local443 = 33;
								@Pc(1941) Interface1 local1941 = (Interface1) Static506.method7239(arg9, arg1, arg4);
								if (local1941 != null) {
									local443 = Static568.aClass315_5.method7511(local1941.method8986()).anInt4637 / 2 + 1;
								}
								@Pc(1984) Class28_Sub1_Sub3 local1984;
								@Pc(2003) Class28_Sub1_Sub3 local2003;
								if (local224) {
									local1984 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, local443 * Static564.anIntArray400[arg8], Static207.anIntArray196[arg8] * local443, arg6, arg8 + 4);
									local2003 = new Class28_Sub1_Sub3_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, local380 + 4);
									if (local1984.method8983()) {
										local1984.method8985(arg7);
									}
									if (local2003.method8983()) {
										local2003.method8985(arg7);
									}
								} else {
									local1984 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, Static564.anIntArray400[arg8] * local443, Static207.anIntArray196[arg8] * local443, arg6, arg8 + 4, arg2);
									local2003 = new Class28_Sub1_Sub3_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, 0, 0, arg6, local380 + 4, arg2);
								}
								Static228.method3555(arg9, arg1, arg4, local1984, local2003);
							}
						}
					}
				}
			}
		} else if (Static172.aClass5_Sub50_14.aClass12_Sub10_1.method2365() != 0 || local33.anInt4647 != 0 || local33.anInt4632 == 1 || local33.aBoolean379) {
			@Pc(288) Class28_Sub1_Sub2 local288;
			if (local224) {
				@Pc(305) Class28_Sub1_Sub2_Sub2 local305 = new Class28_Sub1_Sub2_Sub2(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg8, local186);
				if (local305.method8983()) {
					local305.method8985(arg7);
				}
				local288 = local305;
			} else {
				local288 = new Class28_Sub1_Sub2_Sub1(arg7, local33, arg9, arg0, local165, local157, local174, super.aBoolean248, arg8, arg2);
			}
			Static276.method8469(arg9, arg1, arg4, local288);
			if (local33.anInt4632 == 1 && arg3 != null) {
				arg3.method2676(arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!ha;[BIII[Lclient!eo;IIII)V")
	public void method2602(@OriginalArg(1) Class65 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class106[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class5_Sub41 local15 = new Class5_Sub41(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method7817();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method7812();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method7816();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg7 && local54 >= arg8 && local54 < arg8 + 8 && arg9 <= local48 && arg9 + 8 > local48) {
					@Pc(98) Class164 local98 = Static568.aClass315_5.method7511(local17);
					@Pc(116) int local116 = arg2 + Static23.method295(local98.anInt4645, arg4, local48 & 0x7, local98.anInt4634, local54 & 0x7, local70);
					@Pc(134) int local134 = arg3 + Static270.method4171(local98.anInt4645, local48 & 0x7, local54 & 0x7, local70, local98.anInt4634, arg4);
					if (local116 > 0 && local134 > 0 && super.anInt2901 - 1 > local116 && local134 < super.anInt2909 - 1) {
						@Pc(159) Class106 local159 = null;
						if (!super.aBoolean248) {
							@Pc(164) int local164 = arg6;
							if ((Static7.aByteArrayArrayArray1[1][local116][local134] & 0x2) == 2) {
								local164 = arg6 - 1;
							}
							if (local164 >= 0) {
								local159 = arg5[local164];
							}
						}
						this.method2599(arg6, local116, -1, local159, local134, local17, local66, arg0, local70 + arg4 & 0x3, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ha;ILclient!eo;III)V")
	public void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) Interface1 local15 = this.method2593(arg2, arg0, arg5, arg4);
		if (local15 == null) {
			return;
		}
		@Pc(26) Class164 local26 = Static568.aClass315_5.method7511(local15.method8986());
		@Pc(30) int local30 = local15.method8984();
		@Pc(34) int local34 = local15.method8987();
		if (local26.method3915()) {
			Static153.method2782(arg4, local26, arg0, arg5);
		}
		if (local15.method8983()) {
			local15.method8988(arg1);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static59.method813(arg5, arg0, arg4);
				return;
			}
			if (arg2 == 2) {
				Static472.method6779(arg5, arg0, arg4, aia.class);
				if (local26.anInt4632 != 0 && arg0 + local26.anInt4634 < super.anInt2901 && local26.anInt4634 + arg4 < super.anInt2909 && super.anInt2901 > arg0 + local26.anInt4645 && super.anInt2909 > local26.anInt4645 + arg4) {
					arg3.method2666(local26.anInt4645, arg4, local26.aBoolean380, local34, !local26.aBoolean384, arg0, local26.anInt4634);
				}
				if (local30 != 9) {
					return;
				}
				if ((local34 & 0x1) == 0) {
					Static573.method7907(8, arg4, arg0, arg5);
					return;
				}
				Static573.method7907(16, arg4, arg0, arg5);
			} else if (arg2 == 3) {
				Static84.method1811(arg5, arg0, arg4);
				if (local26.anInt4632 == 1) {
					arg3.method2675(arg4, arg0);
					return;
				}
			}
			return;
		}
		Static33.method488(arg5, arg0, arg4);
		if (local26.anInt4632 != 0) {
			arg3.method2660(local34, !local26.aBoolean384, arg4, arg0, local26.aBoolean380, local30);
		}
		if (local26.anInt4651 != 1) {
			return;
		}
		if (local34 == 0) {
			Static573.method7907(1, arg4, arg0, arg5);
			return;
		}
		if (local34 == 1) {
			Static573.method7907(2, arg4 + 1, arg0, arg5);
			return;
		}
		if (local34 == 2) {
			Static573.method7907(1, arg4, arg0 + 1, arg5);
		} else if (local34 == 3) {
			Static573.method7907(2, arg4, arg0, arg5);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public void method2604(@OriginalArg(0) Class65 arg0, @OriginalArg(2) boolean arg1) {
		Static379.method5644();
		if (!arg1) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			if (super.anInt2904 > 1) {
				for (local21 = 0; super.anInt2901 > local21; local21++) {
					for (local25 = 0; super.anInt2909 > local25; local25++) {
						if ((Static7.aByteArrayArrayArray1[1][local21][local25] & 0x2) == 2) {
							Static222.method3491(local21, local25);
						}
					}
				}
			}
			for (local21 = 0; local21 < super.anInt2904; local21++) {
				for (local25 = 0; super.anInt2909 >= local25; local25++) {
					for (@Pc(65) int local65 = 0; super.anInt2901 >= local65; local65++) {
						if ((super.aByteArrayArrayArray15[local21][local65][local25] & 0x4) != 0) {
							@Pc(83) int local83 = local65;
							@Pc(85) int local85 = local65;
							@Pc(87) int local87 = local25;
							@Pc(89) int local89 = local25;
							while (local87 > 0 && (super.aByteArrayArrayArray15[local21][local65][local87 - 1] & 0x4) != 0 && local25 - local87 < 10) {
								local87--;
							}
							while (local89 < super.anInt2909 && (super.aByteArrayArrayArray15[local21][local65][local89 + 1] & 0x4) != 0 && local89 - local87 < 10) {
								local89++;
							}
							@Pc(160) int local160;
							label111: while (local83 > 0 && local65 - local83 < 10) {
								for (local160 = local87; local160 <= local89; local160++) {
									if ((super.aByteArrayArrayArray15[local21][local83 - 1][local160] & 0x4) == 0) {
										break label111;
									}
								}
								local83--;
							}
							label98: while (super.anInt2901 > local85 && local85 - local83 < 10) {
								for (local160 = local87; local160 <= local89; local160++) {
									if ((super.aByteArrayArrayArray15[local21][local85 + 1][local160] & 0x4) == 0) {
										break label98;
									}
								}
								local85++;
							}
							if ((local85 + 1 - local83) * (local89 + 1 - local87) >= 4) {
								local160 = super.anIntArrayArrayArray15[local21][local83][local87];
								Static40.method581(local160, (local85 << 9) + 512, local83 << 9, local21, (local89 << 9) + 512, local160, local87 << 9);
								for (@Pc(286) int local286 = local83; local286 <= local85; local286++) {
									for (@Pc(290) int local290 = local87; local290 <= local89; local290++) {
										super.aByteArrayArrayArray15[local21][local286][local290] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static149.method2716();
		}
		super.aByteArrayArrayArray15 = null;
	}
}
