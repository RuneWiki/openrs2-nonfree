import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!od", name = "K", descriptor = "I")
	public int anInt5085 = 99;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIZ)V")
	public Class23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static31.aClass148_3, Static44.aClass47_2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[BI[Lclient!eq;IIILclient!ya;IZ)V")
	public void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class70[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class49 arg8, @OriginalArg(9) int arg9) {
		@Pc(21) Class2_Sub23 local21 = new Class2_Sub23(arg2);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local21.method5469();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local21.method5479();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local21.method5495();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg1 && local57 >= arg7 && local57 < arg7 + 8 && arg9 <= local51 && arg9 + 8 > local51) {
					@Pc(117) Class134 local117 = Static118.aClass165_2.method3799(local23);
					@Pc(134) int local134 = Static284.method4118(local57 & 0x7, local117.anInt3652, arg5, local51 & 0x7, local117.anInt3670, local73) + arg0;
					@Pc(151) int local151 = arg3 + Static17.method367(local73, local117.anInt3652, local57 & 0x7, arg5, local117.anInt3670, local51 & 0x7);
					if (local134 > 0 && local151 > 0 && local134 < super.anInt5078 - 1 && local151 < super.anInt5073 - 1) {
						@Pc(179) Class70 local179 = null;
						if (!super.aBoolean378) {
							@Pc(184) int local184 = arg6;
							if ((Static227.aByteArrayArrayArray8[1][local134][local151] & 0x2) == 2) {
								local184 = arg6 - 1;
							}
							if (local184 >= 0) {
								local179 = arg4[local184];
							}
						}
						this.method4086(local23, arg8, local151, local179, arg6, -1, local134, arg6, arg5 + local73 & 0x3, local69);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ya;Lclient!si;III[I)V")
	public void method4085(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean378) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(21) Class22 local21 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(32) int local32;
			@Pc(83) int local83;
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(532) int local532;
			while (arg1.anInt6952 < arg1.aByteArray130.length) {
				local32 = arg1.method5495();
				if (local32 == 0) {
					local21 = new Class22(arg1);
				} else {
					@Pc(111) int local111;
					@Pc(398) int local398;
					@Pc(107) int local107;
					if (local32 == 1) {
						local83 = arg1.method5495();
						if (local83 > 0) {
							for (local532 = 0; local532 < local83; local532++) {
								@Pc(541) Class170 local541 = new Class170(arg0, arg1, 0);
								if (local541.anInt4839 == 31) {
									@Pc(554) Class50 local554 = Static418.aClass86_1.method2082(arg1.method5500());
									local541.method3903(local554.anInt1292, local554.anInt1293, local554.anInt1291, local554.anInt1294);
								}
								if (arg0.method4433() > 0) {
									@Pc(574) Class2_Sub20 local574 = local541.aClass2_Sub20_1;
									local107 = (arg2 << 7) + local574.method5740();
									local111 = local574.method5741() + (arg3 << 7);
									local398 = local107 >> 7;
									@Pc(598) int local598 = local111 >> 7;
									if (local398 >= 0 && local598 >= 0 && local398 < super.anInt5078 && local598 < super.anInt5073) {
										local574.method5742(local111, local107, super.anIntArrayArrayArray9[local541.anInt4842][local398][local598] - local574.method5739());
										if (arg0.method4433() > 0) {
											Static257.method3883(local541);
										}
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local21 == null) {
							local21 = new Class22();
						}
						local21.method482(arg1);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local83 = 0; local83 < 4; local83++) {
							@Pc(89) byte local89 = arg1.method5484();
							if (local89 == 0 && super.aByteArrayArrayArray16[local83] != null) {
								local101 = arg2;
								local105 = arg2 + 64;
								local107 = arg3;
								local111 = arg3 + 64;
								if (arg2 < 0) {
									local101 = 0;
								} else if (super.anInt5078 <= arg2) {
									local101 = super.anInt5078;
								}
								if (arg3 < 0) {
									local107 = 0;
								} else if (arg3 >= super.anInt5073) {
									local107 = super.anInt5073;
								}
								if (local105 < 0) {
									local105 = 0;
								} else if (local105 >= super.anInt5078) {
									local105 = super.anInt5078;
								}
								if (local111 < 0) {
									local111 = 0;
								} else if (local111 >= super.anInt5073) {
									local111 = super.anInt5073;
								}
								while (local105 > local101) {
									while (local111 > local107) {
										super.aByteArrayArrayArray16[local83][local101][local107] = 0;
										local107++;
									}
									local101++;
								}
							} else if (local89 == 1) {
								if (super.aByteArrayArrayArray16[local83] == null) {
									super.aByteArrayArrayArray16[local83] = new byte[super.anInt5078 + 1][super.anInt5073 + 1];
								}
								for (local101 = 0; local101 < 64; local101 += 4) {
									for (local105 = 0; local105 < 64; local105 += 4) {
										@Pc(388) byte local388 = arg1.method5484();
										for (local111 = local101 + arg2; local111 < arg2 + local101 + 4; local111++) {
											for (local398 = local105 + arg3; local398 < local105 + arg3 + 4; local398++) {
												if (local111 >= 0 && local111 < super.anInt5078 && local398 >= 0 && local398 < super.anInt5073) {
													super.aByteArrayArrayArray16[local83][local111][local398] = local388;
												}
											}
										}
									}
								}
							} else if (local89 == 2) {
								if (super.aByteArrayArrayArray16[local83] == null) {
									super.aByteArrayArrayArray16[local83] = new byte[super.anInt5078 + 1][super.anInt5073 + 1];
								}
								if (local83 > 0) {
									local101 = arg2;
									local105 = arg2 + 64;
									local107 = arg3;
									if (arg3 < 0) {
										local107 = 0;
									} else if (arg3 >= super.anInt5073) {
										local107 = super.anInt5073;
									}
									local111 = arg3 + 64;
									if (arg2 < 0) {
										local101 = 0;
									} else if (arg2 >= super.anInt5078) {
										local101 = super.anInt5078;
									}
									if (local105 < 0) {
										local105 = 0;
									} else if (super.anInt5078 <= local105) {
										local105 = super.anInt5078;
									}
									if (local111 < 0) {
										local111 = 0;
									} else if (super.anInt5073 <= local111) {
										local111 = super.anInt5073;
									}
									while (local105 > local101) {
										while (local107 < local111) {
											super.aByteArrayArrayArray16[local83][local101][local107] = super.aByteArrayArrayArray16[local83 - 1][local101][local107];
											local107++;
										}
										local101++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg4 == null) {
						arg1.anInt6952 += 10;
					} else {
						arg4[0] = arg1.method5500();
						arg4[1] = arg1.method5458();
						arg4[2] = arg1.method5458();
						arg4[3] = arg1.method5458();
						arg4[4] = arg1.method5500();
					}
				}
			}
			if (local21 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local83 = 0; local83 < 8; local83++) {
						local532 = (arg2 >> 3) + local32;
						local101 = local83 + (arg3 >> 3);
						if (local532 >= 0 && local532 < super.anInt5078 >> 3 && local101 >= 0 && local101 < super.anInt5073 >> 3) {
							Static151.method2524(local532, local101, local21);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray16 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray16[local32] != null) {
						for (local83 = 0; local83 < 16; local83++) {
							for (local532 = 0; local532 < 16; local532++) {
								local101 = local83 + (arg2 >> 2);
								local105 = local532 + (arg3 >> 2);
								if (local101 >= 0 && local101 < 26 && local105 >= 0 && local105 < 26) {
									super.aByteArrayArrayArray16[local32][local101][local105] = 0;
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

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ya;ILclient!eq;IIIIBII)V")
	public void method4086(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static12.aClass79_Sub1_1.method3966(Static399.anInt6653) && !Static161.method5537(Static427.anInt7117, arg4, arg2, arg6)) {
			return;
		}
		if (arg7 < this.anInt5085) {
			this.anInt5085 = arg7;
		}
		@Pc(30) Class134 local30 = Static118.aClass165_2.method3799(arg0);
		if (arg1.method4425() && Static12.aClass79_Sub1_1.aBoolean352 && local30.aBoolean273) {
			return;
		}
		@Pc(54) int local54;
		@Pc(51) int local51;
		if (arg8 == 1 || arg8 == 3) {
			local51 = local30.anInt3670;
			local54 = local30.anInt3652;
		} else {
			local51 = local30.anInt3652;
			local54 = local30.anInt3670;
		}
		@Pc(82) int local82;
		@Pc(76) int local76;
		if (super.anInt5078 >= local54 + arg6) {
			local76 = (local54 + 1 >> 1) + arg6;
			local82 = (local54 >> 1) + arg6;
		} else {
			local82 = arg6;
			local76 = arg6 + 1;
		}
		@Pc(102) int local102;
		@Pc(100) int local100;
		if (super.anInt5073 < local51 + arg2) {
			local100 = arg2 + 1;
			local102 = arg2;
		} else {
			local102 = (local51 >> 1) + arg2;
			local100 = (local51 + 1 >> 1) + arg2;
		}
		@Pc(122) Class64 local122 = Static58.aClass64Array1[arg4];
		@Pc(146) int local146 = local122.l(local82, local102) + local122.l(local76, local102) + local122.l(local82, local100) + local122.l(local76, local100) >> 2;
		@Pc(154) int local154 = (local54 << 6) + (arg6 << 7);
		@Pc(162) int local162 = (arg2 << 7) + (local51 << 6);
		@Pc(174) boolean local174 = Static405.aBoolean457 && !super.aBoolean378 && local30.aBoolean272;
		if (local30.method2979()) {
			Static54.method894(arg6, local30, arg2, arg8, null, arg7, null);
		}
		@Pc(208) boolean local208 = arg5 == -1 && local30.anInt3663 == -1 && local30.anIntArray319 == null && local30.anIntArray322 == null && !local30.aBoolean277;
		if (Static70.aBoolean97 && (Static192.method3008(arg9) && local30.anInt3643 != 1 || !(!Static360.method5466(arg9) || local30.anInt3643 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(370) Class3_Sub2 local370;
			@Pc(331) Class3_Sub2_Sub6 local331;
			@Pc(368) int local368;
			if (arg9 == 10 || arg9 == 11) {
				local331 = null;
				if (local208) {
					@Pc(362) Class3_Sub2_Sub6 local362 = new Class3_Sub2_Sub6(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, local54 + arg6 - 1, arg2, arg2 + local51 - 1, arg9, arg8, local174);
					local331 = local362;
					local368 = local362.method4235();
					local370 = local362;
				} else {
					local368 = 15;
					local370 = new Class3_Sub2_Sub4(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, arg6 + local54 - 1, arg2, local51 + arg2 - 1, arg9, arg8, arg5);
				}
				@Pc(415) Class3_Sub2 local415 = Static455.method4456(arg7, arg6, arg2, jn.class);
				@Pc(417) boolean local417 = false;
				if (local415 instanceof Class3_Sub2_Sub5 && local415.aShort85 == arg6 && arg2 == local415.aShort86) {
					local417 = true;
					((Class3_Sub2_Sub5) local415).aClass3_Sub2_2 = local370;
				}
				if (local417 || Static313.method4402(local370, false)) {
					if (local331 != null && local331.method5152()) {
						local331.method5156(arg1);
					}
					if (local30.aBoolean271 && Static405.aBoolean457) {
						if (local368 > 30) {
							local368 = 30;
						}
						for (@Pc(464) int local464 = 0; local464 <= local54; local464++) {
							for (@Pc(468) int local468 = 0; local468 <= local51; local468++) {
								local122.i(arg6 + local464, arg2 + local468, local368);
							}
						}
					}
				}
				if (local30.anInt3672 != 0 && arg3 != null) {
					arg3.method1798(local30.aBoolean279, arg6, arg2, local51, local54, !local30.lb);
				}
			} else {
				@Pc(612) Class3_Sub2 local612;
				if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
					if (local208) {
						local331 = new Class3_Sub2_Sub6(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, arg6 + local54 - 1, arg2, local51 + arg2 - 1, arg9, arg8, local174);
						local370 = local331;
						if (local331.method5152()) {
							local331.method5156(arg1);
						}
					} else {
						local370 = new Class3_Sub2_Sub4(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, local54 + arg6 - 1, arg2, arg2 + local51 - 1, arg9, arg8, arg5);
					}
					local612 = Static455.method4456(arg7, arg6, arg2, jn.class);
					if (local612 instanceof Class3_Sub2_Sub5 && arg6 == local612.aShort85 && arg2 == local612.aShort86) {
						((Class3_Sub2_Sub5) local612).aClass3_Sub2_2 = local370;
					} else {
						Static313.method4402(local370, false);
					}
					if (Static405.aBoolean457 && !super.aBoolean378 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg7 > 0 && local30.anInt3643 != 0) {
						super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x4);
					}
					if (local30.anInt3672 != 0 && arg3 != null) {
						arg3.method1798(local30.aBoolean279, arg6, arg2, local51, local54, !local30.lb);
					}
				} else {
					@Pc(739) Class3_Sub5 local739;
					if (arg9 == 0) {
						@Pc(712) int local712 = local30.anInt3643;
						if (Static450.aBoolean484 && local30.anInt3643 == -1) {
							local712 = 1;
						}
						if (local208) {
							@Pc(756) Class3_Sub5_Sub1 local756 = new Class3_Sub5_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, local174);
							local739 = local756;
							if (local756.method5152()) {
								local756.method5156(arg1);
							}
						} else {
							local739 = new Class3_Sub5_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, arg5);
						}
						@Pc(771) Class3_Sub5 local771 = Static215.method3376(arg7, arg6, arg2);
						if (local771 instanceof Class3_Sub5_Sub3) {
							((Class3_Sub5_Sub3) local771).aClass3_Sub5_3 = local739;
						} else {
							Static173.method2817(arg7, arg6, arg2, local739, null);
						}
						if (Static405.aBoolean457) {
							if (arg8 == 0) {
								if (local30.aBoolean271) {
									local122.i(arg6, arg2, 50);
									local122.i(arg6, arg2 + 1, 50);
								}
								if (local712 == 1 && !super.aBoolean378) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
								}
							} else if (arg8 == 1) {
								if (local30.aBoolean271) {
									local122.i(arg6, arg2 + 1, 50);
									local122.i(arg6 + 1, arg2 + 1, 50);
								}
								if (local712 == 1 && !super.aBoolean378) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
								}
							} else if (arg8 == 2) {
								if (local30.aBoolean271) {
									local122.i(arg6 + 1, arg2, 50);
									local122.i(arg6 + 1, arg2 + 1, 50);
								}
								if (local712 == 1 && !super.aBoolean378) {
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
								}
							} else if (arg8 == 3) {
								if (local30.aBoolean271) {
									local122.i(arg6, arg2, 50);
									local122.i(arg6 + 1, arg2, 50);
								}
								if (local712 == 1 && !super.aBoolean378) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
								}
							}
						}
						if (local30.anInt3672 != 0 && arg3 != null) {
							arg3.method1799(arg9, local30.aBoolean279, arg8, arg2, !local30.lb, arg6);
						}
						if (local30.anInt3656 != 16) {
							Static50.method4931(arg7, arg6, arg2, local30.anInt3656);
						}
					} else {
						@Pc(1058) Class3_Sub5 local1058;
						@Pc(1048) Class3_Sub5_Sub1 local1048;
						if (arg9 == 1) {
							if (local208) {
								local1048 = new Class3_Sub5_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, local174);
								if (local1048.method5152()) {
									local1048.method5156(arg1);
								}
								local1058 = local1048;
							} else {
								local1058 = new Class3_Sub5_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, arg5);
							}
							local739 = Static215.method3376(arg7, arg6, arg2);
							if (local739 instanceof Class3_Sub5_Sub3) {
								((Class3_Sub5_Sub3) local739).aClass3_Sub5_3 = local1058;
							} else {
								Static173.method2817(arg7, arg6, arg2, local1058, null);
							}
							if (local30.aBoolean271 && Static405.aBoolean457) {
								if (arg8 == 0) {
									local122.i(arg6, arg2 + 1, 50);
								} else if (arg8 == 1) {
									local122.i(arg6 + 1, arg2 + 1, 50);
								} else if (arg8 == 2) {
									local122.i(arg6 + 1, arg2, 50);
								} else if (arg8 == 3) {
									local122.i(arg6, arg2, 50);
								}
							}
							if (local30.anInt3672 != 0 && arg3 != null) {
								arg3.method1799(arg9, local30.aBoolean279, arg8, arg2, !local30.lb, arg6);
							}
						} else if (arg9 == 2) {
							local368 = arg8 + 1 & 0x3;
							if (local208) {
								@Pc(1240) Class3_Sub5_Sub1 local1240 = new Class3_Sub5_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8 + 4, local174);
								@Pc(1255) Class3_Sub5_Sub1 local1255 = new Class3_Sub5_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg9, local368, local174);
								if (local1240.method5152()) {
									local1240.method5156(arg1);
								}
								local1058 = local1240;
								if (local1255.method5152()) {
									local1255.method5156(arg1);
								}
								local739 = local1255;
							} else {
								local1058 = new Class3_Sub5_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8 + 4, arg5);
								local739 = new Class3_Sub5_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg9, local368, arg5);
							}
							Static173.method2817(arg7, arg6, arg2, local1058, local739);
							if (local30.anInt3643 == 1 && Static405.aBoolean457 && !super.aBoolean378) {
								if (arg8 == 0) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
								} else if (arg8 == 1) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
								} else if (arg8 == 2) {
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
								} else if (arg8 == 3) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
								}
							}
							if (local30.anInt3672 != 0 && arg3 != null) {
								arg3.method1799(arg9, local30.aBoolean279, arg8, arg2, !local30.lb, arg6);
							}
							if (local30.anInt3656 != 16) {
								Static50.method4931(arg7, arg6, arg2, local30.anInt3656);
							}
						} else if (arg9 == 3) {
							if (local208) {
								local1048 = new Class3_Sub5_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, local174);
								local1058 = local1048;
								if (local1048.method5152()) {
									local1048.method5156(arg1);
								}
							} else {
								local1058 = new Class3_Sub5_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg9, arg8, arg5);
							}
							local739 = Static215.method3376(arg7, arg6, arg2);
							if (local739 instanceof Class3_Sub5_Sub3) {
								((Class3_Sub5_Sub3) local739).aClass3_Sub5_3 = local1058;
							} else {
								Static173.method2817(arg7, arg6, arg2, local1058, null);
							}
							if (local30.aBoolean271 && Static405.aBoolean457) {
								if (arg8 == 0) {
									local122.i(arg6, arg2 + 1, 50);
								} else if (arg8 == 1) {
									local122.i(arg6 + 1, arg2 + 1, 50);
								} else if (arg8 == 2) {
									local122.i(arg6 + 1, arg2, 50);
								} else if (arg8 == 3) {
									local122.i(arg6, arg2, 50);
								}
							}
							if (local30.anInt3672 != 0 && arg3 != null) {
								arg3.method1799(arg9, local30.aBoolean279, arg8, arg2, !local30.lb, arg6);
							}
						} else if (arg9 == 9) {
							if (local208) {
								local331 = new Class3_Sub2_Sub6(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, arg6, arg2, arg2, arg9, arg8, local174);
								local370 = local331;
								if (local331.method5152()) {
									local331.method5156(arg1);
								}
							} else {
								local370 = new Class3_Sub2_Sub4(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg6, arg6 + local54 - 1, arg2, local51 + arg2 - 1, arg9, arg8, arg5);
							}
							local612 = Static455.method4456(arg7, arg6, arg2, jn.class);
							if (local612 instanceof Class3_Sub2_Sub5 && local612.aShort85 == arg6 && arg2 == local612.aShort86) {
								((Class3_Sub2_Sub5) local612).aClass3_Sub2_2 = local370;
							} else {
								Static313.method4402(local370, false);
							}
							if (local30.anInt3672 != 0 && arg3 != null) {
								arg3.method1798(local30.aBoolean279, arg6, arg2, local51, local54, !local30.lb);
							}
							if (local30.anInt3656 != 16) {
								Static50.method4931(arg7, arg6, arg2, local30.anInt3656);
							}
						} else {
							@Pc(1842) Class3_Sub3 local1842;
							if (arg9 == 4) {
								if (local208) {
									@Pc(1832) Class3_Sub3_Sub1 local1832 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, 0, 0, 0, arg9, arg8);
									if (local1832.method5152()) {
										local1832.method5156(arg1);
									}
									local1842 = local1832;
								} else {
									local1842 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, 0, 0, 0, arg9, arg8, arg5);
								}
								@Pc(1868) Class3_Sub3 local1868 = Static414.method5443(arg7, arg6, arg2);
								if (local1868 instanceof Class3_Sub3_Sub3) {
									((Class3_Sub3_Sub3) local1868).aClass3_Sub3_3 = local1842;
								} else {
									Static87.method1703(arg7, arg6, arg2, local1842, null);
								}
							} else {
								@Pc(1894) Interface6 local1894;
								@Pc(1933) Class3_Sub3_Sub1 local1933;
								@Pc(1977) Class3_Sub3 local1977;
								if (arg9 == 5) {
									local368 = 17;
									local1894 = (Interface6) Static215.method3376(arg7, arg6, arg2);
									if (local1894 != null) {
										local368 = Static118.aClass165_2.method3799(local1894.method5153()).anInt3656 + 1;
									}
									if (local208) {
										local1933 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, 0, Static195.anIntArray331[arg8] * local368, local368 * Static268.anIntArray406[arg8], arg9, arg8);
										if (local1933.method5152()) {
											local1933.method5156(arg1);
										}
										local1842 = local1933;
									} else {
										local1842 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, 0, Static195.anIntArray331[arg8] * local368, Static268.anIntArray406[arg8] * local368, arg9, arg8, arg5);
									}
									local1977 = Static414.method5443(arg7, arg6, arg2);
									if (local1977 instanceof Class3_Sub3_Sub3) {
										((Class3_Sub3_Sub3) local1977).aClass3_Sub3_3 = local1842;
									} else {
										Static87.method1703(arg7, arg6, arg2, local1842, null);
									}
								} else if (arg9 == 6) {
									local368 = 9;
									local1894 = (Interface6) Static215.method3376(arg7, arg6, arg2);
									if (local1894 != null) {
										local368 = Static118.aClass165_2.method3799(local1894.method5153()).anInt3656 / 2 + 1;
									}
									if (local208) {
										local1933 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg8, local368 * Static195.anIntArray331[arg8], Static268.anIntArray406[arg8] * local368, arg9, arg8 + 4);
										if (local1933.method5152()) {
											local1933.method5156(arg1);
										}
										local1842 = local1933;
									} else {
										local1842 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg8, local368 * Static313.anIntArray451[arg8], Static450.anIntArray633[arg8] * local368, arg9, arg8 + 4, arg5);
									}
									local1977 = Static414.method5443(arg7, arg6, arg2);
									if (local1977 instanceof Class3_Sub3_Sub3) {
										((Class3_Sub3_Sub3) local1977).aClass3_Sub3_3 = local1842;
									} else {
										Static87.method1703(arg7, arg6, arg2, local1842, null);
									}
								} else if (arg9 == 7) {
									local368 = arg8 + 2 & 0x3;
									if (local208) {
										@Pc(2139) Class3_Sub3_Sub1 local2139 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, local368, 0, 0, arg9, local368 + 4);
										if (local2139.method5152()) {
											local2139.method5156(arg1);
										}
										local1842 = local2139;
									} else {
										local1842 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, local368, 0, 0, arg9, local368 + 4, arg5);
									}
									@Pc(2177) Class3_Sub3 local2177 = Static414.method5443(arg7, arg6, arg2);
									if (local2177 instanceof Class3_Sub3_Sub3) {
										((Class3_Sub3_Sub3) local2177).aClass3_Sub3_3 = local1842;
									} else {
										Static87.method1703(arg7, arg6, arg2, local1842, null);
									}
								} else if (arg9 == 8) {
									@Pc(2203) int local2203 = arg8 + 2 & 0x3;
									@Pc(2205) int local2205 = 9;
									@Pc(2211) Interface6 local2211 = (Interface6) Static215.method3376(arg7, arg6, arg2);
									if (local2211 != null) {
										local2205 = Static118.aClass165_2.method3799(local2211.method5153()).anInt3656 / 2 + 1;
									}
									@Pc(2273) Class3_Sub3 local2273;
									@Pc(2254) Class3_Sub3 local2254;
									if (local208) {
										local2254 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg8, Static313.anIntArray451[arg8] * local2205, Static450.anIntArray633[arg8] * local2205, arg9, arg8 + 4);
										local2273 = new Class3_Sub3_Sub1(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg8, 0, 0, arg9, local2203 + 4);
										if (local2254.method5152()) {
											local2254.method5156(arg1);
										}
										if (local2273.method5152()) {
											local2273.method5156(arg1);
										}
									} else {
										local2254 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg8, local2205 * Static313.anIntArray451[arg8], Static450.anIntArray633[arg8] * local2205, arg9, arg8 + 4, arg5);
										local2273 = new Class3_Sub3_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg8, 0, 0, arg9, local2203 + 4, arg5);
									}
									Static87.method1703(arg7, arg6, arg2, local2254, local2273);
								}
							}
						}
					}
				}
			}
		} else if (Static12.aClass79_Sub1_1.aBoolean360 || local30.anInt3653 != 0 || local30.anInt3672 == 1 || local30.aBoolean278) {
			@Pc(265) Class3_Sub1 local265;
			if (local208) {
				@Pc(263) Class3_Sub1_Sub3 local263 = new Class3_Sub1_Sub3(arg1, local30, arg4, local154, local146, local162, super.aBoolean378, arg8, local174);
				local265 = local263;
				if (local263.method5152()) {
					local263.method5156(arg1);
				}
			} else {
				local265 = new Class3_Sub1_Sub2(arg1, local30, arg7, arg4, local154, local146, local162, super.aBoolean378, arg8, arg5);
			}
			@Pc(295) Class3_Sub1 local295 = Static139.method2376(arg7, arg6, arg2);
			if (local295 instanceof Class3_Sub1_Sub1) {
				((Class3_Sub1_Sub1) local295).aClass3_Sub1_1 = local265;
			} else {
				Static80.method5638(arg7, arg6, arg2, local265);
			}
			if (local30.anInt3672 == 1 && arg3 != null) {
				arg3.method1801(arg2, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!eq;IIIZLclient!ya;)V")
	public void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class49 arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface6) Static215.method3376(arg4, arg3, arg0);
		}
		if (arg2 == 1) {
			local7 = (Interface6) Static414.method5443(arg4, arg3, arg0);
		}
		if (arg2 == 2) {
			local7 = (Interface6) Static455.method4456(arg4, arg3, arg0, jn.class);
		}
		if (arg2 == 3) {
			local7 = (Interface6) Static139.method2376(arg4, arg3, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(75) Class134 local75 = Static118.aClass165_2.method3799(local7.method5153());
		@Pc(79) int local79 = local7.method5149();
		@Pc(83) int local83 = local7.method5155();
		if (local75.method2979()) {
			Static257.method3888(arg0, arg4, arg3, local75);
		}
		if (local7.method5152()) {
			local7.method5151(arg5);
		}
		if (arg2 == 0) {
			@Pc(111) Class3_Sub5 local111 = Static215.method3376(arg4, arg3, arg0);
			if (local111 instanceof Class3_Sub5_Sub3) {
				((Class3_Sub5_Sub3) local111).aClass3_Sub5_3 = null;
			} else {
				Static195.method3066(arg4, arg3, arg0);
			}
			if (local75.anInt3672 != 0) {
				arg1.method1802(arg3, local75.aBoolean279, local83, local79, arg0, !local75.lb);
				return;
			}
		} else if (arg2 == 1) {
			@Pc(305) Class3_Sub3 local305 = Static414.method5443(arg4, arg3, arg0);
			if (!(local305 instanceof Class3_Sub3_Sub3)) {
				Static8.method204(arg4, arg3, arg0);
				return;
			}
			((Class3_Sub3_Sub3) local305).aClass3_Sub3_3 = null;
		} else {
			if (arg2 == 2) {
				@Pc(200) Class3_Sub2 local200 = Static455.method4456(arg4, arg3, arg0, jn.class);
				if (local200 instanceof Class3_Sub2_Sub5 && local200.aShort85 == arg3 && arg0 == local200.aShort86) {
					((Class3_Sub2_Sub5) local200).aClass3_Sub2_2 = null;
				} else {
					Static181.method2905(arg4, arg3, arg0, jn.class);
				}
				if (local75.anInt3672 == 0 || super.anInt5078 <= local75.anInt3670 + arg3 || arg0 + local75.anInt3670 >= super.anInt5073 || super.anInt5078 <= local75.anInt3652 + arg3 || super.anInt5073 <= arg0 + local75.anInt3652) {
					return;
				}
				arg1.method1810(local75.anInt3652, local75.aBoolean279, arg3, local75.anInt3670, local83, arg0, !local75.lb);
			} else if (arg2 == 3) {
				@Pc(164) Class3_Sub1 local164 = Static139.method2376(arg4, arg3, arg0);
				if (local164 instanceof Class3_Sub1_Sub1) {
					((Class3_Sub1_Sub1) local164).aClass3_Sub1_1 = null;
				} else {
					Static124.method4917(arg4, arg3, arg0);
				}
				if (local75.anInt3672 == 1) {
					arg1.method1800(arg3, arg0);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILclient!ya;[ILclient!si;II)V")
	public void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class2_Sub23 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean378) {
			return;
		}
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(19) Class22 local19 = null;
		@Pc(40) int local40 = (arg2 & 0x7) * 8;
		@Pc(46) int local46 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(51) int local51;
			@Pc(67) int local67;
			@Pc(367) int local367;
			@Pc(74) int local74;
			while (arg7.anInt6952 < arg7.aByteArray130.length) {
				local51 = arg7.method5495();
				if (local51 == 0) {
					local19 = new Class22(arg7);
				} else {
					@Pc(125) int local125;
					@Pc(175) int local175;
					@Pc(198) int local198;
					@Pc(119) int local119;
					if (local51 == 1) {
						local67 = arg7.method5495();
						if (local67 > 0) {
							for (local74 = 0; local74 < local67; local74++) {
								@Pc(83) Class170 local83 = new Class170(arg5, arg7, 0);
								if (local83.anInt4839 == 31) {
									@Pc(96) Class50 local96 = Static418.aClass86_1.method2082(arg7.method5500());
									local83.method3903(local96.anInt1292, local96.anInt1293, local96.anInt1291, local96.anInt1294);
								}
								if (arg5.method4433() > 0) {
									@Pc(113) Class2_Sub20 local113 = local83.aClass2_Sub20_1;
									local119 = local113.method5740() >> 7;
									local125 = local113.method5741() >> 7;
									if (local83.anInt4842 == arg8 && local119 >= local40 && local119 < local40 + 8 && local46 <= local125 && local125 < local46 + 8) {
										local175 = Static209.method3312(local113.method5741() & 0x3FF, local113.method5740() & 0x3FF, arg4) + (arg0 << 7);
										local119 = local175 >> 7;
										local198 = (arg3 << 7) + Static254.method3856(arg4, local113.method5740() & 0x3FF, local113.method5741() & 0x3FF);
										local125 = local198 >> 7;
										if (local119 >= 0 && local125 >= 0 && local119 < super.anInt5078 && local125 < super.anInt5073) {
											local113.method5742(local198, local175, super.anIntArrayArrayArray9[arg8][local119][local125] - local113.method5739());
											if (arg5.method4433() > 0) {
												Static257.method3883(local83);
											}
										}
									}
								}
							}
						}
					} else if (local51 == 2) {
						if (local19 == null) {
							local19 = new Class22();
						}
						local19.method482(arg7);
					} else if (local51 != 128) {
						if (local51 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local67 = 0; local67 < 4; local67++) {
							@Pc(332) byte local332 = arg7.method5484();
							@Pc(371) int local371;
							if (local332 == 0 && super.aByteArrayArrayArray16[arg1] != null) {
								if (arg8 >= local67) {
									local367 = arg0;
									local371 = arg0 + 7;
									local119 = arg3;
									if (local371 < 0) {
										local371 = 0;
									} else if (local371 >= super.anInt5078) {
										local371 = super.anInt5078;
									}
									local125 = arg3 + 7;
									if (arg3 < 0) {
										local119 = 0;
									} else if (super.anInt5073 <= arg3) {
										local119 = super.anInt5073;
									}
									if (arg0 < 0) {
										local367 = 0;
									} else if (arg0 >= super.anInt5078) {
										local367 = super.anInt5078;
									}
									if (local125 < 0) {
										local125 = 0;
									} else if (local125 >= super.anInt5073) {
										local125 = super.anInt5073;
									}
									while (local367 < local371) {
										while (local125 > local119) {
											super.aByteArrayArrayArray16[arg1][local367][local119] = 0;
											local119++;
										}
										local367++;
									}
								}
							} else if (local332 == 1) {
								if (super.aByteArrayArrayArray16[arg1] == null) {
									super.aByteArrayArrayArray16[arg1] = new byte[super.anInt5078 + 1][super.anInt5073 + 1];
								}
								for (local367 = 0; local367 < 64; local367 += 4) {
									for (local371 = 0; local371 < 64; local371 += 4) {
										@Pc(377) byte local377 = arg7.method5484();
										if (local67 <= arg8) {
											for (local125 = local367; local125 < local367 + 4; local125++) {
												for (local175 = local371; local175 < local371 + 4; local175++) {
													if (local125 >= local40 && local40 + 8 > local125 && local175 >= local46 && local46 + 8 > local46) {
														local198 = Static362.method4940(local125 & 0x7, local175 & 0x7, arg4) + arg0;
														@Pc(433) int local433 = arg3 + Static375.method4700(arg4, local175 & 0x7, local125 & 0x7);
														if (local198 >= 0 && super.anInt5078 > local198 && local433 >= 0 && local433 < super.anInt5073) {
															super.aByteArrayArrayArray16[arg1][local198][local433] = local377;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg6 == null) {
						arg7.anInt6952 += 10;
					} else {
						arg6[0] = arg7.method5500();
						arg6[1] = arg7.method5458();
						arg6[2] = arg7.method5458();
						arg6[3] = arg7.method5458();
						arg6[4] = arg7.method5500();
					}
				}
			}
			if (local19 != null) {
				Static151.method2524(arg0 >> 3, arg3 >> 3, local19);
			}
			if (super.aByteArrayArrayArray16 != null && super.aByteArrayArrayArray16[arg1] != null) {
				local51 = arg0 + 7;
				local67 = arg3 + 7;
				for (local74 = arg0; local74 < local51; local74++) {
					for (local367 = arg3; local367 < local67; local367++) {
						super.aByteArrayArrayArray16[arg1][local74][local367] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ya;)V")
	public void method4090(@OriginalArg(1) Class49 arg0) {
		Static195.method3069(arg0);
		@Pc(27) int local27;
		@Pc(31) int local31;
		if (super.anInt5076 > 1) {
			for (local27 = 0; super.anInt5078 > local27; local27++) {
				for (local31 = 0; super.anInt5073 > local31; local31++) {
					if ((Static227.aByteArrayArrayArray8[1][local27][local31] & 0x2) == 2) {
						Static364.method4969(local27, local31);
					}
				}
			}
		}
		for (local27 = 0; super.anInt5076 > local27; local27++) {
			for (local31 = 0; local31 <= super.anInt5073; local31++) {
				for (@Pc(73) int local73 = 0; local73 <= super.anInt5078; local73++) {
					@Pc(91) int local91;
					@Pc(93) int local93;
					@Pc(95) int local95;
					@Pc(118) int local118;
					@Pc(145) int local145;
					@Pc(238) int local238;
					@Pc(247) int local247;
					@Pc(267) int local267;
					@Pc(271) int local271;
					if ((super.aByteArrayArrayArray12[local27][local73][local31] & 0x1) != 0) {
						local91 = local31;
						local93 = local31;
						local95 = local27;
						while (local91 > 0 && (super.aByteArrayArrayArray12[local27][local73][local91 - 1] & 0x1) != 0) {
							local91--;
						}
						local118 = local27;
						while (super.anInt5073 > local93 && (super.aByteArrayArrayArray12[local27][local73][local93 + 1] & 0x1) != 0) {
							local93++;
						}
						label164: while (local95 > 0) {
							for (local145 = local91; local145 <= local93; local145++) {
								if ((super.aByteArrayArrayArray12[local95 - 1][local73][local145] & 0x1) == 0) {
									break label164;
								}
							}
							local95--;
						}
						label153: while (local118 < 3) {
							for (local145 = local91; local145 <= local93; local145++) {
								if ((super.aByteArrayArrayArray12[local118 + 1][local73][local145] & 0x1) == 0) {
									break label153;
								}
							}
							local118++;
						}
						local145 = (local93 + 1 - local91) * (local118 + 1 - local95);
						if (local145 >= 2) {
							local238 = super.anIntArrayArrayArray9[local118][local73][local91] - 240;
							local247 = super.anIntArrayArrayArray9[local95][local73][local91];
							Static5.method154(1, local73 << 7, local73 << 7, local91 << 7, (local93 << 7) + 128, local238, local247);
							for (local267 = local95; local267 <= local118; local267++) {
								for (local271 = local91; local271 <= local93; local271++) {
									super.aByteArrayArrayArray12[local267][local73][local271] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local27][local73][local31] & 0x2) != 0) {
						local91 = local73;
						local93 = local73;
						local95 = local27;
						while (local91 > 0 && (super.aByteArrayArrayArray12[local27][local91 - 1][local31] & 0x2) != 0) {
							local91--;
						}
						while (super.anInt5078 > local93 && (super.aByteArrayArrayArray12[local27][local93 + 1][local31] & 0x2) != 0) {
							local93++;
						}
						local118 = local27;
						label218: while (local95 > 0) {
							for (local145 = local91; local145 <= local93; local145++) {
								if ((super.aByteArrayArrayArray12[local95 - 1][local145][local31] & 0x2) == 0) {
									break label218;
								}
							}
							local95--;
						}
						label207: while (local118 < 3) {
							for (local145 = local91; local145 <= local93; local145++) {
								if ((super.aByteArrayArrayArray12[local118 + 1][local145][local31] & 0x2) == 0) {
									break label207;
								}
							}
							local118++;
						}
						local145 = (local93 + 1 - local91) * (local118 + 1 - local95);
						if (local145 >= 2) {
							local238 = super.anIntArrayArrayArray9[local118][local91][local31] - 240;
							local247 = super.anIntArrayArrayArray9[local95][local91][local31];
							Static5.method154(2, local91 << 7, (local93 << 7) + 128, local31 << 7, local31 << 7, local238, local247);
							for (local267 = local95; local267 <= local118; local267++) {
								for (local271 = local91; local271 <= local93; local271++) {
									super.aByteArrayArrayArray12[local267][local271][local31] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local27][local73][local31] & 0x4) != 0) {
						local91 = local73;
						local93 = local73;
						local95 = local31;
						local118 = local31;
						while (local95 > 0 && (super.aByteArrayArrayArray12[local27][local73][local95 - 1] & 0x4) != 0) {
							local95--;
						}
						while (super.anInt5073 > local118 && (super.aByteArrayArrayArray12[local27][local73][local118 + 1] & 0x4) != 0) {
							local118++;
						}
						label272: while (local91 > 0) {
							for (local145 = local95; local145 <= local118; local145++) {
								if ((super.aByteArrayArrayArray12[local27][local91 - 1][local145] & 0x4) == 0) {
									break label272;
								}
							}
							local91--;
						}
						label261: while (super.anInt5078 > local93) {
							for (local145 = local95; local145 <= local118; local145++) {
								if ((super.aByteArrayArrayArray12[local27][local93 + 1][local145] & 0x4) == 0) {
									break label261;
								}
							}
							local93++;
						}
						if ((local93 + 1 - local91) * (local118 + 1 - local95) >= 4) {
							local145 = super.anIntArrayArrayArray9[local27][local91][local95];
							Static5.method154(4, local91 << 7, (local93 << 7) + 128, local95 << 7, (local118 << 7) + 128, local145, local145);
							for (@Pc(712) int local712 = local91; local712 <= local93; local712++) {
								for (local238 = local95; local238 <= local118; local238++) {
									super.aByteArrayArrayArray12[local27][local712][local238] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ya;[Lclient!eq;[BIZI)V")
	public void method4091(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class70[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub23 local10 = new Class2_Sub23(arg2);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local10.method5469();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local10.method5479();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local10.method5495();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(84) int local84 = local63 + arg4;
				@Pc(88) int local88 = arg3 + local57;
				if (local84 > 0 && local88 > 0 && super.anInt5078 - 1 > local84 && super.anInt5073 - 1 > local88) {
					@Pc(120) Class70 local120 = null;
					if (!super.aBoolean378) {
						@Pc(125) int local125 = local67;
						if ((Static227.aByteArrayArrayArray8[1][local84][local88] & 0x2) == 2) {
							local125 = local67 - 1;
						}
						if (local125 >= 0) {
							local120 = arg1[local125];
						}
					}
					this.method4086(local23, arg0, local88, local120, local67, -1, local84, local67, local79, local75);
				}
			}
		}
	}
}
