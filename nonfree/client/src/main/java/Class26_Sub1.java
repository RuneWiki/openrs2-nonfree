import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	public int anInt8553 = 99;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(IIIZ)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static68.aClass98_3, Static154.aClass208_3);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBLclient!np;Lclient!r;[I)V")
	public void method7117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub11 arg2, @OriginalArg(4) Class45 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean662) {
			return;
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) Class344 local21 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(32) int local32;
			@Pc(72) int local72;
			@Pc(121) int local121;
			@Pc(125) int local125;
			@Pc(512) int local512;
			while (arg2.anInt6128 < arg2.aByteArray62.length) {
				local32 = arg2.method5175();
				if (local32 == 0) {
					local21 = new Class344(arg2);
				} else {
					@Pc(164) int local164;
					@Pc(267) int local267;
					@Pc(127) int local127;
					if (local32 == 1) {
						local72 = arg2.method5175();
						if (local72 > 0) {
							for (local512 = 0; local512 < local72; local512++) {
								@Pc(521) Class129 local521 = new Class129(arg3, arg2, 2);
								if (local521.anInt3705 == 31) {
									@Pc(534) Class291 local534 = Static482.aClass177_1.method4145(arg2.method5198());
									local521.method3313(local534.anInt7709, local534.anInt7712, local534.anInt7710, local534.anInt7714);
								}
								if (arg3.method7374() > 0) {
									@Pc(554) Class3_Sub10 local554 = local521.aClass3_Sub10_2;
									local127 = local554.method6021() + (arg1 << 9);
									local164 = (arg0 << 9) + local554.method6015();
									local267 = local127 >> 9;
									@Pc(579) int local579 = local164 >> 9;
									if (local267 >= 0 && local579 >= 0 && super.anInt8542 > local267 && local579 < super.anInt8538) {
										local554.method6016(local164, local127, super.anIntArrayArrayArray19[local521.anInt3699][local267][local579] - local554.method6011());
										Static159.method2950(local521);
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local21 == null) {
							local21 = new Class344();
						}
						local21.method7282(arg2);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local72 = 0; local72 < 4; local72++) {
							@Pc(78) byte local78 = arg2.method5212();
							if (local78 == 0 && super.aByteArrayArrayArray15[local72] != null) {
								local121 = arg1;
								local125 = arg1 + 64;
								local127 = arg0;
								if (arg1 < 0) {
									local121 = 0;
								} else if (super.anInt8542 <= arg1) {
									local121 = super.anInt8542;
								}
								if (arg0 < 0) {
									local127 = 0;
								} else if (super.anInt8538 <= arg0) {
									local127 = super.anInt8538;
								}
								if (local125 < 0) {
									local125 = 0;
								} else if (super.anInt8542 <= local125) {
									local125 = super.anInt8542;
								}
								local164 = arg0 + 64;
								if (local164 < 0) {
									local164 = 0;
								} else if (super.anInt8538 <= local164) {
									local164 = super.anInt8538;
								}
								while (local125 > local121) {
									while (local127 < local164) {
										super.aByteArrayArrayArray15[local72][local121][local127] = 0;
										local127++;
									}
									local121++;
								}
							} else if (local78 == 1) {
								if (super.aByteArrayArrayArray15[local72] == null) {
									super.aByteArrayArrayArray15[local72] = new byte[super.anInt8542 + 1][super.anInt8538 + 1];
								}
								for (local121 = 0; local121 < 64; local121 += 4) {
									for (local125 = 0; local125 < 64; local125 += 4) {
										@Pc(257) byte local257 = arg2.method5212();
										for (local164 = local121 + arg1; local164 < local121 + arg1 + 4; local164++) {
											for (local267 = arg0 + local125; local267 < local125 + arg0 + 4; local267++) {
												if (local164 >= 0 && super.anInt8542 > local164 && local267 >= 0 && local267 < super.anInt8538) {
													super.aByteArrayArrayArray15[local72][local164][local267] = local257;
												}
											}
										}
									}
								}
							} else if (local78 == 2) {
								if (super.aByteArrayArrayArray15[local72] == null) {
									super.aByteArrayArrayArray15[local72] = new byte[super.anInt8542 + 1][super.anInt8538 + 1];
								}
								if (local72 > 0) {
									local121 = arg1;
									local125 = arg1 + 64;
									local127 = arg0;
									if (arg0 < 0) {
										local127 = 0;
									} else if (arg0 >= super.anInt8538) {
										local127 = super.anInt8538;
									}
									if (local125 < 0) {
										local125 = 0;
									} else if (super.anInt8542 <= local125) {
										local125 = super.anInt8542;
									}
									local164 = arg0 + 64;
									if (arg1 < 0) {
										local121 = 0;
									} else if (super.anInt8542 <= arg1) {
										local121 = super.anInt8542;
									}
									if (local164 < 0) {
										local164 = 0;
									} else if (super.anInt8538 <= local164) {
										local164 = super.anInt8538;
									}
									while (local125 > local121) {
										while (local127 < local164) {
											super.aByteArrayArrayArray15[local72][local121][local127] = super.aByteArrayArrayArray15[local72 - 1][local121][local127];
											local127++;
										}
										local121++;
									}
								}
							}
						}
						local19 = true;
					} else if (arg4 == null) {
						arg2.anInt6128 += 10;
					} else {
						arg4[0] = arg2.method5198();
						arg4[1] = arg2.method5231();
						arg4[2] = arg2.method5231();
						arg4[3] = arg2.method5231();
						arg4[4] = arg2.method5198();
					}
				}
			}
			if (local21 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local72 = 0; local72 < 8; local72++) {
						local512 = (arg1 >> 3) + local32;
						local121 = local72 + (arg0 >> 3);
						if (local512 >= 0 && super.anInt8542 >> 3 > local512 && local121 >= 0 && local121 < super.anInt8538 >> 3) {
							Static31.method498(local512, local121, local21);
						}
					}
				}
			}
			if (!local19 && super.aByteArrayArrayArray15 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray15[local32] != null) {
						for (local72 = 0; local72 < 16; local72++) {
							for (local512 = 0; local512 < 16; local512++) {
								local121 = (arg1 >> 2) + local72;
								local125 = (arg0 >> 2) + local512;
								if (local121 >= 0 && local121 < 26 && local125 >= 0 && local125 < 26) {
									super.aByteArrayArrayArray15[local32][local121][local125] = 0;
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

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III[BLclient!r;[Lclient!jw;IIIII)V")
	public void method7118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class45 arg3, @OriginalArg(5) Class169[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5218();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method5217();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local10.method5175();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				if (local50 == arg1 && arg7 <= local46 && arg7 + 8 > local46 && arg6 <= local40 && arg6 + 8 > local40) {
					@Pc(98) Class280 local98 = Static478.aClass212_3.method4793(local12);
					@Pc(116) int local116 = arg5 + Static63.method1399(local62, local98.anInt7391, local46 & 0x7, local98.anInt7396, local40 & 0x7, arg8);
					@Pc(133) int local133 = Static210.method3400(local98.anInt7391, local40 & 0x7, local46 & 0x7, local98.anInt7396, arg8, local62) + arg0;
					if (local116 > 0 && local133 > 0 && super.anInt8542 - 1 > local116 && super.anInt8538 - 1 > local133) {
						@Pc(161) Class169 local161 = null;
						if (!super.aBoolean662) {
							@Pc(166) int local166 = arg9;
							if ((Static503.aByteArrayArrayArray11[1][local116][local133] & 0x2) == 2) {
								local166 = arg9 - 1;
							}
							if (local166 >= 0) {
								local161 = arg4[local166];
							}
						}
						this.method7119(local12, arg9, arg8 + local62 & 0x3, -1, local58, arg3, local116, arg9, local161, local133);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIILclient!r;IILclient!jw;I)V")
	public void method7119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class45 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class169 arg8, @OriginalArg(10) int arg9) {
		if (!Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) && !Static161.method2957(arg6, arg1, Static364.anInt645, arg9)) {
			return;
		}
		if (this.anInt8553 > arg7) {
			this.anInt8553 = arg7;
		}
		@Pc(34) Class280 local34 = Static478.aClass212_3.method4793(arg0);
		if (arg5.method7429() && Static405.aClass3_Sub3_Sub1_1.aBoolean579 && local34.aBoolean548) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg2 == 1 || arg2 == 3) {
			local53 = local34.anInt7396;
			local56 = local34.anInt7391;
		} else {
			local53 = local34.anInt7391;
			local56 = local34.anInt7396;
		}
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (local53 + arg6 <= super.anInt8542) {
			local76 = (local53 >> 1) + arg6;
			local84 = (local53 + 1 >> 1) + arg6;
		} else {
			local76 = arg6;
			local84 = arg6 + 1;
		}
		@Pc(118) int local118;
		@Pc(111) int local111;
		if (super.anInt8538 >= local56 + arg9) {
			local111 = arg9 + (local56 + 1 >> 1);
			local118 = arg9 + (local56 >> 1);
		} else {
			local111 = arg9 + 1;
			local118 = arg9;
		}
		@Pc(130) Class34 local130 = Static68.aClass34Array1[arg1];
		@Pc(158) int local158 = local130.method6525(local118, local76) + local130.method6525(local118, local84) + local130.method6525(local111, local76) + local130.method6525(local111, local84) >> 2;
		@Pc(166) int local166 = (local53 << 8) + (arg6 << 9);
		@Pc(175) int local175 = (arg9 << 9) + (local56 << 8);
		@Pc(187) boolean local187 = Static59.aBoolean114 && !super.aBoolean662 && local34.aBoolean547;
		if (local34.method6171()) {
			Static145.method2803(null, local34, arg2, arg6, arg7, null, arg9);
		}
		@Pc(220) boolean local220 = arg3 == -1 && local34.anInt7348 == -1 && local34.anIntArray462 == null && local34.anIntArray457 == null && !local34.aBoolean554;
		if (Static451.aBoolean568 && (Static486.method6608(arg4) && local34.anInt7373 != 1 || !(!Static417.method5937(arg4) || local34.anInt7373 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(362) Class41_Sub2_Sub1 local362;
			@Pc(331) Class41_Sub2_Sub1_Sub2 local331;
			@Pc(364) int local364;
			@Pc(431) int local431;
			if (arg4 == 10 || arg4 == 11) {
				local331 = null;
				if (local220) {
					@Pc(395) Class41_Sub2_Sub1_Sub2 local395 = new Class41_Sub2_Sub1_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, arg6 + local53 - 1, arg9, local56 + arg9 - 1, arg4, arg2, local187);
					local362 = local395;
					local364 = local395.method1483();
					local331 = local395;
				} else {
					local362 = new Class41_Sub2_Sub1_Sub3(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, arg6 + local53 - 1, arg9, arg9 + local56 - 1, arg4, arg2, arg3);
					local364 = 15;
				}
				if (Static586.method1886(local362, false)) {
					if (local331 != null && local331.method7558()) {
						local331.method7560(arg5);
					}
					if (local34.aBoolean555 && Static59.aBoolean114) {
						if (local364 > 30) {
							local364 = 30;
						}
						for (local431 = 0; local431 <= local53; local431++) {
							for (@Pc(435) int local435 = 0; local435 <= local56; local435++) {
								local130.a(local431 + arg6, local435 + arg9, local364);
							}
						}
					}
				}
				if (local34.anInt7359 != 0 && arg8 != null) {
					arg8.method4027(local53, local56, !local34.aBoolean556, arg6, arg9, local34.aBoolean558);
				}
			} else if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
				if (local220) {
					local331 = new Class41_Sub2_Sub1_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, local53 + arg6 - 1, arg9, local56 + arg9 - 1, arg4, arg2, local187);
					if (local331.method7558()) {
						local331.method7560(arg5);
					}
					local362 = local331;
				} else {
					local362 = new Class41_Sub2_Sub1_Sub3(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, local53 + arg6 - 1, arg9, local56 + arg9 - 1, arg4, arg2, arg3);
				}
				Static586.method1886(local362, false);
				if (Static59.aBoolean114 && !super.aBoolean662 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0 && local34.anInt7373 != 0) {
					super.aByteArrayArrayArray13[arg7][arg6][arg9] = (byte) (super.aByteArrayArrayArray13[arg7][arg6][arg9] | 0x4);
				}
				if (local34.anInt7359 != 0 && arg8 != null) {
					arg8.method4027(local53, local56, !local34.aBoolean556, arg6, arg9, local34.aBoolean558);
				}
			} else {
				@Pc(680) Class41_Sub2_Sub3 local680;
				if (arg4 == 0) {
					@Pc(643) int local643 = local34.anInt7373;
					if (Static384.aBoolean506 && local34.anInt7373 == -1) {
						local643 = 1;
					}
					if (local220) {
						@Pc(670) Class41_Sub2_Sub3_Sub2 local670 = new Class41_Sub2_Sub3_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, local187);
						if (local670.method7558()) {
							local670.method7560(arg5);
						}
						local680 = local670;
					} else {
						local680 = new Class41_Sub2_Sub3_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, arg3);
					}
					Static260.method3994(arg7, arg6, arg9, local680, null);
					if (arg2 == 0) {
						if (Static59.aBoolean114 && local34.aBoolean555) {
							local130.a(arg6, arg9, 50);
							local130.a(arg6, arg9 + 1, 50);
						}
						if (local643 == 1 && !super.aBoolean662) {
							Static192.method3252(arg9, local34.anInt7347, arg7, 1, arg6, local34.anInt7352);
						}
					} else if (arg2 == 1) {
						if (Static59.aBoolean114 && local34.aBoolean555) {
							local130.a(arg6, arg9 + 1, 50);
							local130.a(arg6 + 1, arg9 - -1, 50);
						}
						if (local643 == 1 && !super.aBoolean662) {
							Static192.method3252(arg9 + 1, -local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
						}
					} else if (arg2 == 2) {
						if (Static59.aBoolean114 && local34.aBoolean555) {
							local130.a(arg6 + 1, arg9, 50);
							local130.a(arg6 + 1, arg9 + 1, 50);
						}
						if (local643 == 1 && !super.aBoolean662) {
							Static192.method3252(arg9, -local34.anInt7347, arg7, 1, arg6 + 1, local34.anInt7352);
						}
					} else if (arg2 == 3) {
						if (Static59.aBoolean114 && local34.aBoolean555) {
							local130.a(arg6, arg9, 50);
							local130.a(arg6 + 1, arg9, 50);
						}
						if (local643 == 1 && !super.aBoolean662) {
							Static192.method3252(arg9, local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
						}
					}
					if (local34.anInt7359 != 0 && arg8 != null) {
						arg8.method4030(arg2, arg6, arg9, arg4, local34.aBoolean558, !local34.aBoolean556);
					}
					if (local34.anInt7367 != 64) {
						Static593.method7938(arg7, arg6, arg9, local34.anInt7367);
					}
				} else {
					@Pc(948) Class41_Sub2_Sub3_Sub2 local948;
					@Pc(930) Class41_Sub2_Sub3 local930;
					if (arg4 == 1) {
						if (local220) {
							local948 = new Class41_Sub2_Sub3_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, local187);
							local930 = local948;
							if (local948.method7558()) {
								local948.method7560(arg5);
							}
						} else {
							local930 = new Class41_Sub2_Sub3_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, arg3);
						}
						Static260.method3994(arg7, arg6, arg9, local930, null);
						if (local34.aBoolean555 && Static59.aBoolean114) {
							if (arg2 == 0) {
								local130.a(arg6, arg9 + 1, 50);
							} else if (arg2 == 1) {
								local130.a(arg6 + 1, arg9 + 1, 50);
							} else if (arg2 == 2) {
								local130.a(arg6 + 1, arg9, 50);
							} else if (arg2 == 3) {
								local130.a(arg6, arg9, 50);
							}
						}
						if (local34.anInt7359 != 0 && arg8 != null) {
							arg8.method4030(arg2, arg6, arg9, arg4, local34.aBoolean558, !local34.aBoolean556);
						}
					} else if (arg4 == 2) {
						local364 = arg2 + 1 & 0x3;
						if (local220) {
							@Pc(1104) Class41_Sub2_Sub3_Sub2 local1104 = new Class41_Sub2_Sub3_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2 + 4, local187);
							@Pc(1120) Class41_Sub2_Sub3_Sub2 local1120 = new Class41_Sub2_Sub3_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, local364, local187);
							if (local1104.method7558()) {
								local1104.method7560(arg5);
							}
							local680 = local1120;
							if (local1120.method7558()) {
								local1120.method7560(arg5);
							}
							local930 = local1104;
						} else {
							local930 = new Class41_Sub2_Sub3_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2 + 4, arg3);
							local680 = new Class41_Sub2_Sub3_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, local364, arg3);
						}
						Static260.method3994(arg7, arg6, arg9, local930, local680);
						if ((local34.anInt7373 == 1 || Static384.aBoolean506 && local34.anInt7373 == -1) && !super.aBoolean662) {
							if (arg2 == 0) {
								Static192.method3252(arg9, local34.anInt7347, arg7, 1, arg6, local34.anInt7352);
								Static192.method3252(arg9 + 1, local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
							} else if (arg2 == 1) {
								Static192.method3252(arg9, local34.anInt7347, arg7, 1, arg6 + 1, local34.anInt7352);
								Static192.method3252(arg9 + 1, local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
							} else if (arg2 == 2) {
								Static192.method3252(arg9, local34.anInt7347, arg7, 1, arg6 + 1, local34.anInt7352);
								Static192.method3252(arg9, local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
							} else if (arg2 == 3) {
								Static192.method3252(arg9, local34.anInt7347, arg7, 1, arg6, local34.anInt7352);
								Static192.method3252(arg9, local34.anInt7347, arg7, 2, arg6, local34.anInt7352);
							}
						}
						if (local34.anInt7359 != 0 && arg8 != null) {
							arg8.method4030(arg2, arg6, arg9, arg4, local34.aBoolean558, !local34.aBoolean556);
						}
						if (local34.anInt7367 != 64) {
							Static593.method7938(arg7, arg6, arg9, local34.anInt7367);
						}
					} else if (arg4 == 3) {
						if (local220) {
							local948 = new Class41_Sub2_Sub3_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, local187);
							if (local948.method7558()) {
								local948.method7560(arg5);
							}
							local930 = local948;
						} else {
							local930 = new Class41_Sub2_Sub3_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg4, arg2, arg3);
						}
						Static260.method3994(arg7, arg6, arg9, local930, null);
						if (local34.aBoolean555 && Static59.aBoolean114) {
							if (arg2 == 0) {
								local130.a(arg6, arg9 + 1, 50);
							} else if (arg2 == 1) {
								local130.a(arg6 + 1, arg9 - -1, 50);
							} else if (arg2 == 2) {
								local130.a(arg6 + 1, arg9, 50);
							} else if (arg2 == 3) {
								local130.a(arg6, arg9, 50);
							}
						}
						if (local34.anInt7359 != 0 && arg8 != null) {
							arg8.method4030(arg2, arg6, arg9, arg4, local34.aBoolean558, !local34.aBoolean556);
						}
					} else if (arg4 == 9) {
						if (local220) {
							local331 = new Class41_Sub2_Sub1_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, arg6, arg9, arg9, arg4, arg2, local187);
							if (local331.method7558()) {
								local331.method7560(arg5);
							}
							local362 = local331;
						} else {
							local362 = new Class41_Sub2_Sub1_Sub3(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg6, arg6 + local53 - 1, arg9, arg9 + local56 - 1, arg4, arg2, arg3);
						}
						Static586.method1886(local362, false);
						if (local34.anInt7359 != 0 && arg8 != null) {
							arg8.method4027(local53, local56, !local34.aBoolean556, arg6, arg9, local34.aBoolean558);
						}
						if (local34.anInt7367 != 64) {
							Static593.method7938(arg7, arg6, arg9, local34.anInt7367);
						}
					} else {
						@Pc(1567) Class41_Sub2_Sub2 local1567;
						if (arg4 == 4) {
							if (local220) {
								@Pc(1586) Class41_Sub2_Sub2_Sub2 local1586 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, arg2);
								if (local1586.method7558()) {
									local1586.method7560(arg5);
								}
								local1567 = local1586;
							} else {
								local1567 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, arg2, arg3);
							}
							Static467.method6470(arg7, arg6, arg9, local1567, null);
						} else {
							@Pc(1608) int local1608;
							@Pc(1614) Interface4 local1614;
							@Pc(1681) Class41_Sub2_Sub2_Sub2 local1681;
							if (arg4 == 5) {
								local1608 = 65;
								local1614 = (Interface4) Static184.method3149(arg7, arg6, arg9);
								if (local1614 != null) {
									local1608 = Static478.aClass212_3.method4793(local1614.method7561()).anInt7367 + 1;
								}
								if (local220) {
									local1681 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, local1608 * Static360.anIntArray340[arg2], local1608 * Static371.anIntArray364[arg2], arg4, arg2);
									local1567 = local1681;
									if (local1681.method7558()) {
										local1681.method7560(arg5);
									}
								} else {
									local1567 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, local1608 * Static360.anIntArray340[arg2], local1608 * Static371.anIntArray364[arg2], arg4, arg2, arg3);
								}
								Static467.method6470(arg7, arg6, arg9, local1567, null);
							} else if (arg4 == 6) {
								local1608 = 33;
								local1614 = (Interface4) Static184.method3149(arg7, arg6, arg9);
								if (local1614 != null) {
									local1608 = Static478.aClass212_3.method4793(local1614.method7561()).anInt7367 / 2 + 1;
								}
								if (local220) {
									local1681 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, Static360.anIntArray340[arg2] * local1608, local1608 * Static371.anIntArray364[arg2], arg4, arg2 + 4);
									local1567 = local1681;
									if (local1681.method7558()) {
										local1681.method7560(arg5);
									}
								} else {
									local1567 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, Static99.anIntArray92[arg2] * local1608, Static376.anIntArray392[arg2] * local1608, arg4, arg2 + 4, arg3);
								}
								Static467.method6470(arg7, arg6, arg9, local1567, null);
							} else if (arg4 == 7) {
								local1608 = arg2 + 2 & 0x3;
								if (local220) {
									@Pc(1831) Class41_Sub2_Sub2_Sub2 local1831 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, local1608 + 4);
									local1567 = local1831;
									if (local1831.method7558()) {
										local1831.method7560(arg5);
									}
								} else {
									local1567 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, local1608 + 4, arg3);
								}
								Static467.method6470(arg7, arg6, arg9, local1567, null);
							} else if (arg4 == 8) {
								local364 = arg2 + 2 & 0x3;
								local431 = 33;
								@Pc(1889) Interface4 local1889 = (Interface4) Static184.method3149(arg7, arg6, arg9);
								if (local1889 != null) {
									local431 = Static478.aClass212_3.method4793(local1889.method7561()).anInt7367 / 2 + 1;
								}
								@Pc(1932) Class41_Sub2_Sub2 local1932;
								@Pc(1951) Class41_Sub2_Sub2 local1951;
								if (local220) {
									local1932 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, Static99.anIntArray92[arg2] * local431, Static376.anIntArray392[arg2] * local431, arg4, arg2 + 4);
									local1951 = new Class41_Sub2_Sub2_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, local364 + 4);
									if (local1932.method7558()) {
										local1932.method7560(arg5);
									}
									if (local1951.method7558()) {
										local1951.method7560(arg5);
									}
								} else {
									local1932 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, local431 * Static99.anIntArray92[arg2], local431 * Static376.anIntArray392[arg2], arg4, arg2 + 4, arg3);
									local1951 = new Class41_Sub2_Sub2_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, 0, 0, arg4, local364 + 4, arg3);
								}
								Static467.method6470(arg7, arg6, arg9, local1932, local1951);
							}
						}
					}
				}
			}
		} else if (Static405.aClass3_Sub3_Sub1_1.aBoolean591 || local34.anInt7380 != 0 || local34.anInt7359 == 1 || local34.aBoolean549) {
			@Pc(287) Class41_Sub2_Sub5 local287;
			if (local220) {
				@Pc(277) Class41_Sub2_Sub5_Sub2 local277 = new Class41_Sub2_Sub5_Sub2(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg2, local187);
				if (local277.method7558()) {
					local277.method7560(arg5);
				}
				local287 = local277;
			} else {
				local287 = new Class41_Sub2_Sub5_Sub1(arg5, local34, arg7, arg1, local166, local158, local175, super.aBoolean662, arg2, arg3);
			}
			Static117.method2417(arg7, arg6, arg9, local287);
			if (local34.anInt7359 == 1 && arg8 != null) {
				arg8.method4029(arg6, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLclient!r;B)V")
	public void method7120(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class45 arg1) {
		Static245.method3786();
		if (!arg0) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt8536 > 1) {
				for (local20 = 0; local20 < super.anInt8542; local20++) {
					for (local24 = 0; local24 < super.anInt8538; local24++) {
						if ((Static503.aByteArrayArrayArray11[1][local20][local24] & 0x2) == 2) {
							Static505.method6817(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; local20 < super.anInt8536; local20++) {
				for (local24 = 0; local24 <= super.anInt8538; local24++) {
					for (@Pc(64) int local64 = 0; super.anInt8542 >= local64; local64++) {
						if ((super.aByteArrayArrayArray13[local20][local64][local24] & 0x4) != 0) {
							@Pc(79) int local79 = local64;
							@Pc(81) int local81 = local64;
							@Pc(83) int local83 = local24;
							@Pc(85) int local85 = local24;
							while (local83 > 0 && (super.aByteArrayArrayArray13[local20][local64][local83 - 1] & 0x4) != 0 && local24 - local83 < 10) {
								local83--;
							}
							while (super.anInt8538 > local85 && (super.aByteArrayArrayArray13[local20][local64][local85 + 1] & 0x4) != 0 && local85 - local83 < 10) {
								local85++;
							}
							@Pc(146) int local146;
							label111: while (local79 > 0 && local64 - local79 < 10) {
								for (local146 = local83; local146 <= local85; local146++) {
									if ((super.aByteArrayArrayArray13[local20][local79 - 1][local146] & 0x4) == 0) {
										break label111;
									}
								}
								local79--;
							}
							label98: while (local81 < super.anInt8542 && local81 - local79 < 10) {
								for (local146 = local83; local146 <= local85; local146++) {
									if ((super.aByteArrayArrayArray13[local20][local81 + 1][local146] & 0x4) == 0) {
										break label98;
									}
								}
								local81++;
							}
							if ((local81 + 1 - local79) * (local85 + 1 - local83) >= 4) {
								local146 = super.anIntArrayArrayArray19[local20][local79][local83];
								Static537.method7175(local20, (local85 << 9) + 512, local146, local79 << 9, local83 << 9, (local81 << 9) + 512, local146);
								for (@Pc(271) int local271 = local79; local271 <= local81; local271++) {
									for (@Pc(275) int local275 = local83; local275 <= local85; local275++) {
										super.aByteArrayArrayArray13[local20][local271][local275] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static529.method7062();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!jw;ILclient!r;II)V")
	public void method7121(@OriginalArg(0) int arg0, @OriginalArg(2) Class169 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class45 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface4 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface4) Static184.method3149(arg4, arg0, arg5);
		}
		if (arg2 == 1) {
			local7 = (Interface4) Static418.method5942(arg4, arg0, arg5);
		}
		if (arg2 == 2) {
			local7 = (Interface4) Static480.method6569(arg4, arg0, arg5, gda.class);
		}
		if (arg2 == 3) {
			local7 = (Interface4) Static508.method6867(arg4, arg0, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(63) Class280 local63 = Static478.aClass212_3.method4793(local7.method7561());
		@Pc(67) int local67 = local7.method7556();
		@Pc(71) int local71 = local7.method7562();
		if (local63.method6171()) {
			Static309.method4508(arg0, arg4, arg5, local63);
		}
		if (local7.method7558()) {
			local7.method7557(arg3);
		}
		if (arg2 == 0) {
			Static232.method3629(arg4, arg0, arg5);
			if (local63.anInt7359 != 0) {
				arg1.method4031(local71, !local63.aBoolean556, arg5, local63.aBoolean558, arg0, local67);
			}
			if (local63.anInt7373 == 1) {
				if (local71 == 0) {
					Static122.method2504(arg5, arg0, arg4, 1);
				} else if (local71 == 1) {
					Static122.method2504(arg5 + 1, arg0, arg4, 2);
				} else if (local71 == 2) {
					Static122.method2504(arg5, arg0 + 1, arg4, 1);
				} else if (local71 == 3) {
					Static122.method2504(arg5, arg0, arg4, 2);
				}
			}
		} else if (arg2 == 1) {
			Static404.method5857(arg4, arg0, arg5);
		} else if (arg2 == 2) {
			Static550.method7296(arg4, arg0, arg5, gda.class);
			if (local63.anInt7359 != 0 && arg0 + local63.anInt7391 < super.anInt8542 && super.anInt8538 > local63.anInt7391 + arg5 && super.anInt8542 > local63.anInt7396 + arg0 && local63.anInt7396 + arg5 < super.anInt8538) {
				arg1.method4028(local63.anInt7391, !local63.aBoolean556, local63.aBoolean558, arg0, arg5, local63.anInt7396, local71);
			}
		} else if (arg2 == 3) {
			Static485.method6600(arg4, arg0, arg5);
			if (local63.anInt7359 == 1) {
				arg1.method4025(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIBILclient!np;Lclient!r;III[I)V")
	public void method7122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub11 arg4, @OriginalArg(6) Class45 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean662) {
			return;
		}
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(24) Class344 local24 = null;
		@Pc(30) int local30 = (arg6 & 0x7) * 8;
		@Pc(36) int local36 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(137) int local137;
			@Pc(178) int local178;
			@Pc(443) int local443;
			while (arg4.anInt6128 < arg4.aByteArray62.length) {
				local41 = arg4.method5175();
				if (local41 == 0) {
					local24 = new Class344(arg4);
				} else {
					@Pc(197) int local197;
					@Pc(201) int local201;
					@Pc(243) int local243;
					@Pc(335) int local335;
					if (local41 == 1) {
						local137 = arg4.method5175();
						if (local137 > 0) {
							for (local443 = 0; local443 < local137; local443++) {
								@Pc(452) Class129 local452 = new Class129(arg5, arg4, 2);
								if (local452.anInt3705 == 31) {
									@Pc(463) Class291 local463 = Static482.aClass177_1.method4145(arg4.method5198());
									local452.method3313(local463.anInt7709, local463.anInt7712, local463.anInt7710, local463.anInt7714);
								}
								if (arg5.method7374() > 0) {
									@Pc(480) Class3_Sub10 local480 = local452.aClass3_Sub10_2;
									local335 = local480.method6021() >> 9;
									local197 = local480.method6015() >> 9;
									if (local452.anInt3699 == arg1 && local30 <= local335 && local30 + 8 > local335 && local36 <= local197 && local197 < local36 + 8) {
										local201 = Static251.method3877(local480.method6021() & 0xFFF, local480.method6015() & 0xFFF, arg7) + (arg2 << 9);
										local243 = (arg3 << 9) + Static269.method4104(local480.method6015() & 0xFFF, local480.method6021() & 0xFFF, arg7);
										local335 = local201 >> 9;
										local197 = local243 >> 9;
										if (local335 >= 0 && local197 >= 0 && super.anInt8542 > local335 && local197 < super.anInt8538) {
											local480.method6016(local243, local201, super.anIntArrayArrayArray19[arg1][local335][local197] - local480.method6011());
											Static159.method2950(local452);
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local24 == null) {
							local24 = new Class344();
						}
						local24.method7282(arg4);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local137 = 0; local137 < 4; local137++) {
							@Pc(143) byte local143 = arg4.method5212();
							@Pc(182) int local182;
							if (local143 == 0 && super.aByteArrayArrayArray15[arg8] != null) {
								if (local137 <= arg1) {
									local178 = arg2;
									local182 = arg2 + 7;
									local335 = arg3;
									if (local182 < 0) {
										local182 = 0;
									} else if (super.anInt8542 <= local182) {
										local182 = super.anInt8542;
									}
									if (arg2 < 0) {
										local178 = 0;
									} else if (arg2 >= super.anInt8542) {
										local178 = super.anInt8542;
									}
									if (arg3 < 0) {
										local335 = 0;
									} else if (super.anInt8538 <= arg3) {
										local335 = super.anInt8538;
									}
									local197 = arg3 + 7;
									if (local197 < 0) {
										local197 = 0;
									} else if (super.anInt8538 <= local197) {
										local197 = super.anInt8538;
									}
									while (local178 < local182) {
										while (local197 > local335) {
											super.aByteArrayArrayArray15[arg8][local178][local335] = 0;
											local335++;
										}
										local178++;
									}
								}
							} else if (local143 == 1) {
								if (super.aByteArrayArrayArray15[arg8] == null) {
									super.aByteArrayArrayArray15[arg8] = new byte[super.anInt8542 + 1][super.anInt8538 + 1];
								}
								for (local178 = 0; local178 < 64; local178 += 4) {
									for (local182 = 0; local182 < 64; local182 += 4) {
										@Pc(188) byte local188 = arg4.method5212();
										if (arg1 >= local137) {
											for (local197 = local178; local197 < local178 + 4; local197++) {
												for (local201 = local182; local201 < local182 + 4; local201++) {
													if (local197 >= local30 && local30 + 8 > local197 && local36 <= local201 && local36 < local36 + 8) {
														local243 = arg2 + Static273.method4142(local197 & 0x7, local201 & 0x7, arg7);
														@Pc(256) int local256 = arg3 + Static376.method5513(arg7, local197 & 0x7, local201 & 0x7);
														if (local243 >= 0 && local243 < super.anInt8542 && local256 >= 0 && super.anInt8538 > local256) {
															super.aByteArrayArrayArray15[arg8][local243][local256] = local188;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg9 == null) {
						arg4.anInt6128 += 10;
					} else {
						arg9[0] = arg4.method5198();
						arg9[1] = arg4.method5231();
						arg9[2] = arg4.method5231();
						arg9[3] = arg4.method5231();
						arg9[4] = arg4.method5198();
					}
				}
			}
			if (local24 != null) {
				Static31.method498(arg2 >> 3, arg3 >> 3, local24);
			}
			if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg8] != null) {
				local41 = arg2 + 7;
				local137 = arg3 + 7;
				for (local443 = arg2; local443 < local41; local443++) {
					for (local178 = arg3; local178 < local137; local178++) {
						super.aByteArrayArrayArray15[arg8][local443][local178] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([Lclient!jw;ILclient!r;I[BI)V")
	public void method7124(@OriginalArg(0) Class169[] arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5218();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method5217();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method5175();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				@Pc(70) int local70 = local49 + arg4;
				@Pc(74) int local74 = local43 + arg2;
				if (local70 > 0 && local74 > 0 && super.anInt8542 - 1 > local70 && local74 < super.anInt8538 - 1) {
					@Pc(96) Class169 local96 = null;
					if (!super.aBoolean662) {
						@Pc(101) int local101 = local53;
						if ((Static503.aByteArrayArrayArray11[1][local70][local74] & 0x2) == 2) {
							local101 = local53 - 1;
						}
						if (local101 >= 0) {
							local96 = arg0[local101];
						}
					}
					this.method7119(local12, local53, local65, -1, local61, arg1, local70, local53, local96, local74);
				}
			}
		}
	}
}
