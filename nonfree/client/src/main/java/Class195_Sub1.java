import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class195_Sub1 extends Class195 {

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
	public int anInt6375 = 99;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIZ)V")
	public Class195_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static277.aClass241_12, Static382.aClass245_8);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!as;IIILclient!za;II)V")
	public void method5006(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface8 local7 = null;
		if (arg3 == 0) {
			local7 = (Interface8) Static337.method4524(arg1, arg2, arg5);
		}
		if (arg3 == 1) {
			local7 = (Interface8) Static165.method2380(arg1, arg2, arg5);
		}
		if (arg3 == 2) {
			local7 = (Interface8) Static364.method2862(arg1, arg2, arg5, mh.class);
		}
		if (arg3 == 3) {
			local7 = (Interface8) Static231.method3312(arg1, arg2, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(67) Class68 local67 = Static341.aClass75_4.method1616(local7.method4623());
		@Pc(71) int local71 = local7.method4617();
		@Pc(75) int local75 = local7.method4620();
		if (local67.method1537()) {
			Static307.method4191(arg5, arg2, arg1, local67);
		}
		if (local7.method4619()) {
			local7.method4621(arg4);
		}
		if (arg3 == 0) {
			@Pc(102) Class25_Sub4 local102 = Static337.method4524(arg1, arg2, arg5);
			if (local102 instanceof Class25_Sub4_Sub3) {
				((Class25_Sub4_Sub3) local102).aClass25_Sub4_3 = null;
			} else {
				Static84.method913(arg1, arg2, arg5);
			}
			if (local67.anInt1831 != 0) {
				arg0.method282(!local67.aBoolean213, local67.aBoolean212, arg5, arg2, local71, local75);
				return;
			}
		} else if (arg3 == 1) {
			@Pc(292) Class25_Sub1 local292 = Static165.method2380(arg1, arg2, arg5);
			if (local292 instanceof Class25_Sub1_Sub1) {
				((Class25_Sub1_Sub1) local292).aClass25_Sub1_1 = null;
				return;
			}
			Static280.method3891(arg1, arg2, arg5);
		} else {
			if (arg3 == 2) {
				@Pc(157) Class25_Sub5 local157 = Static364.method2862(arg1, arg2, arg5, mh.class);
				if (local157 instanceof Class25_Sub5_Sub6 && local157.aShort97 == arg2 && arg5 == local157.aShort94) {
					((Class25_Sub5_Sub6) local157).aClass25_Sub5_2 = null;
				} else {
					Static309.method4217(arg1, arg2, arg5, mh.class);
				}
				if (local67.anInt1831 != 0 && super.anInt6370 > arg2 + local67.anInt1810 && super.anInt6371 > arg5 + local67.anInt1810 && super.anInt6370 > arg2 + local67.anInt1803 && arg5 + local67.anInt1803 < super.anInt6371) {
					arg0.method287(local67.anInt1810, local67.anInt1803, local67.aBoolean212, arg5, !local67.aBoolean213, arg2, local75);
					return;
				}
			} else if (arg3 == 3) {
				@Pc(264) Class25_Sub2 local264 = Static231.method3312(arg1, arg2, arg5);
				if (local264 instanceof Class25_Sub2_Sub3) {
					((Class25_Sub2_Sub3) local264).aClass25_Sub2_1 = null;
				} else {
					Static270.method3797(arg1, arg2, arg5);
				}
				if (local67.anInt1831 != 1) {
					return;
				}
				arg0.method286(arg2, arg5);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!za;)V")
	public void method5007(@OriginalArg(1) Class34 arg0) {
		Static147.method5931(arg0);
		@Pc(15) int local15;
		if (super.anInt6368 > 1) {
			for (local15 = 0; super.anInt6370 > local15; local15++) {
				for (@Pc(19) int local19 = 0; super.anInt6371 > local19; local19++) {
					if ((Static147.aByteArrayArrayArray22[1][local15][local19] & 0x2) == 2) {
						Static256.method3676(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; super.anInt6368 > local15; local15++) {
			for (@Pc(65) int local65 = 0; super.anInt6371 >= local65; local65++) {
				for (@Pc(69) int local69 = 0; local69 <= super.anInt6370; local69++) {
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(91) int local91;
					@Pc(137) int local137;
					@Pc(141) int local141;
					@Pc(237) int local237;
					@Pc(246) int local246;
					@Pc(266) int local266;
					@Pc(270) int local270;
					if ((super.aByteArrayArrayArray17[local15][local69][local65] & 0x1) != 0) {
						local87 = local65;
						local89 = local65;
						local91 = local15;
						while (super.anInt6371 > local89 && (super.aByteArrayArrayArray17[local15][local69][local89 + 1] & 0x1) != 0) {
							local89++;
						}
						while (local87 > 0 && (super.aByteArrayArrayArray17[local15][local69][local87 - 1] & 0x1) != 0) {
							local87--;
						}
						local137 = local15;
						label164: while (local91 > 0) {
							for (local141 = local87; local141 <= local89; local141++) {
								if ((super.aByteArrayArrayArray17[local91 - 1][local69][local141] & 0x1) == 0) {
									break label164;
								}
							}
							local91--;
						}
						label153: while (local137 < 3) {
							for (local141 = local87; local141 <= local89; local141++) {
								if ((super.aByteArrayArrayArray17[local137 + 1][local69][local141] & 0x1) == 0) {
									break label153;
								}
							}
							local137++;
						}
						local141 = (local89 + 1 - local87) * (local137 + 1 - local91);
						if (local141 >= 2) {
							local237 = super.anIntArrayArrayArray12[local137][local69][local87] - 240;
							local246 = super.anIntArrayArrayArray12[local91][local69][local87];
							Static143.method2021(1, local69 << 7, local69 << 7, local87 << 7, (local89 << 7) + 128, local237, local246);
							for (local266 = local91; local266 <= local137; local266++) {
								for (local270 = local87; local270 <= local89; local270++) {
									super.aByteArrayArrayArray17[local266][local69][local270] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray17[local15][local69][local65] & 0x2) != 0) {
						local87 = local69;
						local89 = local69;
						local91 = local15;
						while (local89 < super.anInt6370 && (super.aByteArrayArrayArray17[local15][local89 + 1][local65] & 0x2) != 0) {
							local89++;
						}
						while (local87 > 0 && (super.aByteArrayArrayArray17[local15][local87 - 1][local65] & 0x2) != 0) {
							local87--;
						}
						local137 = local15;
						label218: while (local91 > 0) {
							for (local141 = local87; local141 <= local89; local141++) {
								if ((super.aByteArrayArrayArray17[local91 - 1][local141][local65] & 0x2) == 0) {
									break label218;
								}
							}
							local91--;
						}
						label207: while (local137 < 3) {
							for (local141 = local87; local141 <= local89; local141++) {
								if ((super.aByteArrayArrayArray17[local137 + 1][local141][local65] & 0x2) == 0) {
									break label207;
								}
							}
							local137++;
						}
						local141 = (local137 + 1 - local91) * (local89 + 1 - local87);
						if (local141 >= 2) {
							local237 = super.anIntArrayArrayArray12[local137][local87][local65] - 240;
							local246 = super.anIntArrayArrayArray12[local91][local87][local65];
							Static143.method2021(2, local87 << 7, (local89 << 7) + 128, local65 << 7, local65 << 7, local237, local246);
							for (local266 = local91; local266 <= local137; local266++) {
								for (local270 = local87; local270 <= local89; local270++) {
									super.aByteArrayArrayArray17[local266][local270][local65] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray17[local15][local69][local65] & 0x4) != 0) {
						local87 = local69;
						local89 = local69;
						local91 = local65;
						local137 = local65;
						while (local91 > 0 && (super.aByteArrayArrayArray17[local15][local69][local91 - 1] & 0x4) != 0) {
							local91--;
						}
						while (super.anInt6371 > local137 && (super.aByteArrayArrayArray17[local15][local69][local137 + 1] & 0x4) != 0) {
							local137++;
						}
						label272: while (local87 > 0) {
							for (local141 = local91; local141 <= local137; local141++) {
								if ((super.aByteArrayArrayArray17[local15][local87 - 1][local141] & 0x4) == 0) {
									break label272;
								}
							}
							local87--;
						}
						label261: while (local89 < super.anInt6370) {
							for (local141 = local91; local141 <= local137; local141++) {
								if ((super.aByteArrayArrayArray17[local15][local89 + 1][local141] & 0x4) == 0) {
									break label261;
								}
							}
							local89++;
						}
						if ((local137 + 1 - local91) * (-local87 + local89 + 1) >= 4) {
							local141 = super.anIntArrayArrayArray12[local15][local87][local91];
							Static143.method2021(4, local87 << 7, (local89 << 7) + 128, local91 << 7, (local137 << 7) + 128, local141, local141);
							for (@Pc(726) int local726 = local87; local726 <= local89; local726++) {
								for (local237 = local91; local237 <= local137; local237++) {
									super.aByteArrayArrayArray17[local15][local726][local237] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZILclient!za;[B[Lclient!as;)V")
	public void method5009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class14[] arg4) {
		@Pc(10) Class1_Sub28 local10 = new Class1_Sub28(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(25) int local25 = local10.method5354();
			if (local25 == 0) {
				return;
			}
			local12 += local25;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(40) int local40 = local10.method5392();
				if (local40 == 0) {
					break;
				}
				local36 += local40 - 1;
				@Pc(52) int local52 = local36 & 0x3F;
				@Pc(58) int local58 = local36 >> 6 & 0x3F;
				@Pc(62) int local62 = local36 >> 12;
				@Pc(66) int local66 = local10.method5337();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(79) int local79 = local58 + arg0;
				@Pc(84) int local84 = local52 + arg1;
				if (local79 > 0 && local84 > 0 && super.anInt6370 - 1 > local79 && super.anInt6371 - 1 > local84) {
					@Pc(105) Class14 local105 = null;
					if (!super.aBoolean703) {
						@Pc(110) int local110 = local62;
						if ((Static147.aByteArrayArrayArray22[1][local79][local84] & 0x2) == 2) {
							local110 = local62 - 1;
						}
						if (local110 >= 0) {
							local105 = arg4[local110];
						}
					}
					this.method5013(local84, local105, local62, -1, local74, local62, local70, local79, arg2, local12);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "([IIIILclient!ug;ILclient!za;IIZI)V")
	public void method5010(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub28 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean703) {
			return;
		}
		@Pc(13) Class109 local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(25) int local25 = (arg8 & 0x7) * 8;
		@Pc(31) int local31 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(48) int local48;
			@Pc(109) int local109;
			@Pc(163) int local163;
			@Pc(185) int local185;
			@Pc(55) int local55;
			@Pc(103) int local103;
			label233: do {
				while (true) {
					@Pc(36) int local36;
					@Pc(328) int local328;
					while (arg4.anInt6812 < arg4.aByteArray86.length) {
						local36 = arg4.method5337();
						if (local36 == 0) {
							local13 = new Class109(arg4);
						} else {
							if (local36 == 1) {
								local48 = arg4.method5337();
								continue label233;
							}
							if (local36 == 2) {
								if (local13 == null) {
									local13 = new Class109();
								}
								local13.method2386(arg4);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray19 == null) {
									super.aByteArrayArrayArray19 = new byte[4][][];
								}
								for (local48 = 0; local48 < 4; local48++) {
									@Pc(316) byte local316 = arg4.method5367();
									@Pc(332) int local332;
									if (local316 == 0 && super.aByteArrayArrayArray19[arg2] != null) {
										if (local48 <= arg1) {
											local328 = arg5;
											local332 = arg5 + 7;
											local103 = arg9;
											local109 = arg9 + 7;
											if (arg9 < 0) {
												local103 = 0;
											} else if (super.anInt6371 <= arg9) {
												local103 = super.anInt6371;
											}
											if (arg5 < 0) {
												local328 = 0;
											} else if (super.anInt6370 <= arg5) {
												local328 = super.anInt6370;
											}
											if (local332 < 0) {
												local332 = 0;
											} else if (super.anInt6370 <= local332) {
												local332 = super.anInt6370;
											}
											if (local109 < 0) {
												local109 = 0;
											} else if (local109 >= super.anInt6371) {
												local109 = super.anInt6371;
											}
											while (local328 < local332) {
												while (local103 < local109) {
													super.aByteArrayArrayArray19[arg2][local328][local103] = 0;
													local103++;
												}
												local328++;
											}
										}
									} else if (local316 == 1) {
										if (super.aByteArrayArrayArray19[arg2] == null) {
											super.aByteArrayArrayArray19[arg2] = new byte[super.anInt6370 + 1][super.anInt6371 + 1];
										}
										for (local328 = 0; local328 < 64; local328 += 4) {
											for (local332 = 0; local332 < 64; local332 += 4) {
												@Pc(460) byte local460 = arg4.method5367();
												if (arg1 >= local48) {
													for (local109 = local328; local109 < local328 + 4; local109++) {
														for (local163 = local332; local163 < local332 + 4; local163++) {
															if (local25 <= local109 && local25 + 8 > local109 && local31 <= local163 && local31 + 8 > local31) {
																local185 = arg5 + Static226.method3260(local163 & 0x7, arg3, local109 & 0x7);
																@Pc(516) int local516 = arg9 + Static294.method4029(arg3, local163 & 0x7, local109 & 0x7);
																if (local185 >= 0 && super.anInt6370 > local185 && local516 >= 0 && local516 < super.anInt6371) {
																	super.aByteArrayArrayArray19[arg2][local185][local516] = local460;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg0 == null) {
								arg4.anInt6812 += 10;
							} else {
								arg0[0] = arg4.method5335();
								arg0[1] = arg4.method5382();
								arg0[2] = arg4.method5382();
								arg0[3] = arg4.method5382();
								arg0[4] = arg4.method5335();
							}
						}
					}
					if (local13 != null) {
						Static340.method4543(arg9 >> 3, local13, arg5 >> 3);
					}
					if (super.aByteArrayArrayArray19 != null && super.aByteArrayArrayArray19[arg2] != null) {
						local36 = arg5 + 7;
						local48 = arg9 + 7;
						for (local55 = arg5; local55 < local36; local55++) {
							for (local328 = arg9; local328 < local48; local328++) {
								super.aByteArrayArrayArray19[arg2][local55][local328] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local48 <= 0);
			for (local55 = 0; local55 < local48; local55++) {
				@Pc(64) Class137 local64 = new Class137(arg6, arg4, 0);
				if (local64.anInt3853 == 31) {
					@Pc(77) Class176 local77 = Static95.aClass26_1.method569(arg4.method5335());
					local64.method3148(local77.anInt5020, local77.anInt5019, local77.anInt5017, local77.anInt5016);
				}
				if (arg6.method5800() > 0) {
					@Pc(97) Class1_Sub7 local97 = local64.aClass1_Sub7_2;
					local103 = local97.method5113() >> 7;
					local109 = local97.method5117() >> 7;
					if (local64.anInt3864 == arg1 && local103 >= local25 && local25 + 8 > local103 && local31 <= local109 && local31 + 8 > local109) {
						local163 = Static175.method2471(local97.method5113() & 0x3FF, local97.method5117() & 0x3FF, arg3) + (arg5 << 7);
						local103 = local163 >> 7;
						local185 = (arg9 << 7) + Static29.method386(local97.method5113() & 0x3FF, local97.method5117() & 0x3FF, arg3);
						local109 = local185 >> 7;
						if (local103 >= 0 && local109 >= 0 && super.anInt6370 > local103 && local109 < super.anInt6371) {
							local97.method5115(local163, super.anIntArrayArrayArray12[arg1][local103][local109] - local97.method5114(), local185);
							Static99.method1542(local64);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIB[Lclient!as;IILclient!za;III[B)V")
	public void method5011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class14[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(14) Class1_Sub28 local14 = new Class1_Sub28(arg9);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method5354();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method5392();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local14.method5337();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (arg7 == local57 && arg0 <= local53 && arg0 + 8 > local53 && local47 >= arg1 && local47 < arg1 + 8) {
					@Pc(105) Class68 local105 = Static341.aClass75_4.method1616(local16);
					@Pc(122) int local122 = Static351.method4744(local53 & 0x7, local69, arg8, local105.anInt1810, local47 & 0x7, local105.anInt1803) + arg6;
					@Pc(139) int local139 = Static110.method1727(local105.anInt1803, local105.anInt1810, local69, local53 & 0x7, arg8, local47 & 0x7) + arg3;
					if (local122 > 0 && local139 > 0 && local122 < super.anInt6370 - 1 && super.anInt6371 - 1 > local139) {
						@Pc(161) Class14 local161 = null;
						if (!super.aBoolean703) {
							@Pc(166) int local166 = arg4;
							if ((Static147.aByteArrayArrayArray22[1][local122][local139] & 0x2) == 2) {
								local166 = arg4 - 1;
							}
							if (local166 >= 0) {
								local161 = arg2[local166];
							}
						}
						this.method5013(local139, local161, arg4, -1, local69 + arg8 & 0x3, arg4, local65, local122, arg5, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!as;IIBIIIILclient!za;I)V")
	public void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) int arg9) {
		if (!Static453.aClass136_Sub1_1.method3522(Static14.anInt293) && !Static444.method5830(arg7, arg0, arg2, Static456.anInt7534)) {
			return;
		}
		if (arg5 < this.anInt6375) {
			this.anInt6375 = arg5;
		}
		@Pc(30) Class68 local30 = Static341.aClass75_4.method1616(arg9);
		if (arg8.method5796() && Static453.aClass136_Sub1_1.aBoolean505 && local30.aBoolean204) {
			return;
		}
		@Pc(56) int local56;
		@Pc(53) int local53;
		if (arg4 == 1 || arg4 == 3) {
			local53 = local30.anInt1810;
			local56 = local30.anInt1803;
		} else {
			local56 = local30.anInt1810;
			local53 = local30.anInt1803;
		}
		@Pc(76) int local76;
		@Pc(74) int local74;
		if (local56 + arg7 > super.anInt6370) {
			local74 = arg7 + 1;
			local76 = arg7;
		} else {
			local74 = (local56 + 1 >> 1) + arg7;
			local76 = (local56 >> 1) + arg7;
		}
		@Pc(108) int local108;
		@Pc(106) int local106;
		if (super.anInt6371 < local53 + arg0) {
			local106 = arg0 + 1;
			local108 = arg0;
		} else {
			local106 = (local53 + 1 >> 1) + arg0;
			local108 = arg0 + (local53 >> 1);
		}
		@Pc(128) Class157 local128 = Static94.aClass157Array1[arg2];
		@Pc(150) int local150 = local128.ua(local76, local108) + local128.ua(local74, local108) + local128.ua(local76, local106) + local128.ua(local74, local106) >> 2;
		@Pc(164) int local164 = (arg7 << 7) + (local56 << 6);
		@Pc(172) int local172 = (local53 << 6) + (arg0 << 7);
		@Pc(184) boolean local184 = Static311.aBoolean612 && !super.aBoolean703 && local30.aBoolean216;
		if (local30.method1537()) {
			Static81.method1356(arg5, arg4, arg0, local30, null, arg7, null);
		}
		@Pc(219) boolean local219 = arg3 == -1 && local30.anInt1830 == -1 && local30.anIntArray124 == null && local30.anIntArray125 == null && !local30.aBoolean214;
		if (Static59.aBoolean121 && (Static128.method2023(arg6) && local30.anInt1786 != 1 || !(!Static432.method5707(arg6) || local30.anInt1786 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(377) Class25_Sub5 local377;
			@Pc(347) Class25_Sub5_Sub2 local347;
			@Pc(379) int local379;
			if (arg6 == 10 || arg6 == 11) {
				local347 = null;
				if (local219) {
					@Pc(409) Class25_Sub5_Sub2 local409 = new Class25_Sub5_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, arg7 + local56 - 1, arg0, local53 + arg0 - 1, arg6, arg4, local184);
					local347 = local409;
					local379 = local409.method3179();
					local377 = local409;
				} else {
					local377 = new Class25_Sub5_Sub4(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, local56 + arg7 - 1, arg0, local53 + arg0 - 1, arg6, arg4, arg3);
					local379 = 15;
				}
				@Pc(430) Class25_Sub5 local430 = Static364.method2862(arg5, arg7, arg0, mh.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class25_Sub5_Sub6 && arg7 == local430.aShort97 && local430.aShort94 == arg0) {
					((Class25_Sub5_Sub6) local430).aClass25_Sub5_2 = local377;
					local432 = true;
				}
				if (local432 || Static277.method4344(local377, false)) {
					if (local347 != null && local347.method4619()) {
						local347.method4622(arg8);
					}
					if (local30.aBoolean203 && Static311.aBoolean612) {
						if (local379 > 30) {
							local379 = 30;
						}
						for (@Pc(485) int local485 = 0; local485 <= local56; local485++) {
							for (@Pc(489) int local489 = 0; local489 <= local53; local489++) {
								local128.qa(local485 + arg7, local489 + arg0, local379);
							}
						}
					}
				}
				if (local30.anInt1831 != 0 && arg1 != null) {
					arg1.method283(local53, !local30.aBoolean213, local56, arg7, arg0, local30.aBoolean212);
				}
			} else {
				@Pc(632) Class25_Sub5 local632;
				if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
					if (local219) {
						local347 = new Class25_Sub5_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, local56 + arg7 - 1, arg0, local53 + arg0 - 1, arg6, arg4, local184);
						if (local347.method4619()) {
							local347.method4622(arg8);
						}
						local377 = local347;
					} else {
						local377 = new Class25_Sub5_Sub4(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, local56 + arg7 - 1, arg0, arg0 + local53 - 1, arg6, arg4, arg3);
					}
					local632 = Static364.method2862(arg5, arg7, arg0, mh.class);
					if (local632 instanceof Class25_Sub5_Sub6 && arg7 == local632.aShort97 && local632.aShort94 == arg0) {
						((Class25_Sub5_Sub6) local632).aClass25_Sub5_2 = local377;
					} else {
						Static277.method4344(local377, false);
					}
					if (Static311.aBoolean612 && !super.aBoolean703 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg5 > 0 && local30.anInt1786 != 0) {
						super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x4);
					}
					if (local30.anInt1831 != 0 && arg1 != null) {
						arg1.method283(local53, !local30.aBoolean213, local56, arg7, arg0, local30.aBoolean212);
					}
				} else {
					@Pc(755) Class25_Sub4 local755;
					if (arg6 == 0) {
						@Pc(728) int local728 = local30.anInt1786;
						if (Static335.aBoolean651 && local30.anInt1786 == -1) {
							local728 = 1;
						}
						if (local219) {
							@Pc(772) Class25_Sub4_Sub2 local772 = new Class25_Sub4_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, local184);
							local755 = local772;
							if (local772.method4619()) {
								local772.method4622(arg8);
							}
						} else {
							local755 = new Class25_Sub4_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, arg3);
						}
						@Pc(787) Class25_Sub4 local787 = Static337.method4524(arg5, arg7, arg0);
						if (local787 instanceof Class25_Sub4_Sub3) {
							((Class25_Sub4_Sub3) local787).aClass25_Sub4_3 = local755;
						} else {
							Static230.method3286(arg5, arg7, arg0, local755, null);
						}
						if (Static311.aBoolean612) {
							if (arg4 == 0) {
								if (local30.aBoolean203) {
									local128.qa(arg7, arg0, 50);
									local128.qa(arg7, arg0 + 1, 50);
								}
								if (local728 == 1 && !super.aBoolean703) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x1);
								}
							} else if (arg4 == 1) {
								if (local30.aBoolean203) {
									local128.qa(arg7, arg0 + 1, 50);
									local128.qa(arg7 + 1, arg0 + 1, 50);
								}
								if (local728 == 1 && !super.aBoolean703) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] | 0x2);
								}
							} else if (arg4 == 2) {
								if (local30.aBoolean203) {
									local128.qa(arg7 + 1, arg0, 50);
									local128.qa(arg7 + 1, arg0 - -1, 50);
								}
								if (local728 == 1 && !super.aBoolean703) {
									super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] | 0x1);
								}
							} else if (arg4 == 3) {
								if (local30.aBoolean203) {
									local128.qa(arg7, arg0, 50);
									local128.qa(arg7 + 1, arg0, 50);
								}
								if (local728 == 1 && !super.aBoolean703) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x2);
								}
							}
						}
						if (local30.anInt1831 != 0 && arg1 != null) {
							arg1.method273(arg7, arg0, local30.aBoolean212, arg6, arg4, !local30.aBoolean213);
						}
						if (local30.lb != 16) {
							Static136.method5271(arg5, arg7, arg0, local30.lb);
						}
					} else {
						@Pc(1057) Class25_Sub4_Sub2 local1057;
						@Pc(1059) Class25_Sub4 local1059;
						if (arg6 == 1) {
							if (local219) {
								local1057 = new Class25_Sub4_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, local184);
								local1059 = local1057;
								if (local1057.method4619()) {
									local1057.method4622(arg8);
								}
							} else {
								local1059 = new Class25_Sub4_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, arg3);
							}
							local755 = Static337.method4524(arg5, arg7, arg0);
							if (local755 instanceof Class25_Sub4_Sub3) {
								((Class25_Sub4_Sub3) local755).aClass25_Sub4_3 = local1059;
							} else {
								Static230.method3286(arg5, arg7, arg0, local1059, null);
							}
							if (local30.aBoolean203 && Static311.aBoolean612) {
								if (arg4 == 0) {
									local128.qa(arg7, arg0 + 1, 50);
								} else if (arg4 == 1) {
									local128.qa(arg7 + 1, arg0 + 1, 50);
								} else if (arg4 == 2) {
									local128.qa(arg7 + 1, arg0, 50);
								} else if (arg4 == 3) {
									local128.qa(arg7, arg0, 50);
								}
							}
							if (local30.anInt1831 != 0 && arg1 != null) {
								arg1.method273(arg7, arg0, local30.aBoolean212, arg6, arg4, !local30.aBoolean213);
							}
						} else if (arg6 == 2) {
							local379 = arg4 + 1 & 0x3;
							if (local219) {
								@Pc(1211) Class25_Sub4_Sub2 local1211 = new Class25_Sub4_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4 + 4, local184);
								@Pc(1226) Class25_Sub4_Sub2 local1226 = new Class25_Sub4_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg6, local379, local184);
								if (local1211.method4619()) {
									local1211.method4622(arg8);
								}
								if (local1226.method4619()) {
									local1226.method4622(arg8);
								}
								local755 = local1226;
								local1059 = local1211;
							} else {
								local1059 = new Class25_Sub4_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4 + 4, arg3);
								local755 = new Class25_Sub4_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg6, local379, arg3);
							}
							Static230.method3286(arg5, arg7, arg0, local1059, local755);
							if (local30.anInt1786 == 1 && Static311.aBoolean612 && !super.aBoolean703) {
								if (arg4 == 0) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x1);
									super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] | 0x2);
								} else if (arg4 == 1) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0 + 1] | 0x2);
									super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] | 0x1);
								} else if (arg4 == 2) {
									super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7 + 1][arg0] | 0x1);
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x2);
								} else if (arg4 == 3) {
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x2);
									super.aByteArrayArrayArray17[arg5][arg7][arg0] = (byte) (super.aByteArrayArrayArray17[arg5][arg7][arg0] | 0x1);
								}
							}
							if (local30.anInt1831 != 0 && arg1 != null) {
								arg1.method273(arg7, arg0, local30.aBoolean212, arg6, arg4, !local30.aBoolean213);
							}
							if (local30.lb != 16) {
								Static136.method5271(arg5, arg7, arg0, local30.lb);
							}
						} else if (arg6 == 3) {
							if (local219) {
								local1057 = new Class25_Sub4_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, local184);
								local1059 = local1057;
								if (local1057.method4619()) {
									local1057.method4622(arg8);
								}
							} else {
								local1059 = new Class25_Sub4_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg6, arg4, arg3);
							}
							local755 = Static337.method4524(arg5, arg7, arg0);
							if (local755 instanceof Class25_Sub4_Sub3) {
								((Class25_Sub4_Sub3) local755).aClass25_Sub4_3 = local1059;
							} else {
								Static230.method3286(arg5, arg7, arg0, local1059, null);
							}
							if (local30.aBoolean203 && Static311.aBoolean612) {
								if (arg4 == 0) {
									local128.qa(arg7, arg0 + 1, 50);
								} else if (arg4 == 1) {
									local128.qa(arg7 + 1, arg0 - -1, 50);
								} else if (arg4 == 2) {
									local128.qa(arg7 + 1, arg0, 50);
								} else if (arg4 == 3) {
									local128.qa(arg7, arg0, 50);
								}
							}
							if (local30.anInt1831 != 0 && arg1 != null) {
								arg1.method273(arg7, arg0, local30.aBoolean212, arg6, arg4, !local30.aBoolean213);
							}
						} else if (arg6 == 9) {
							if (local219) {
								local347 = new Class25_Sub5_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, arg7, arg0, arg0, arg6, arg4, local184);
								if (local347.method4619()) {
									local347.method4622(arg8);
								}
								local377 = local347;
							} else {
								local377 = new Class25_Sub5_Sub4(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg7, local56 + arg7 - 1, arg0, arg0 + local53 - 1, arg6, arg4, arg3);
							}
							local632 = Static364.method2862(arg5, arg7, arg0, mh.class);
							if (local632 instanceof Class25_Sub5_Sub6 && arg7 == local632.aShort97 && arg0 == local632.aShort94) {
								((Class25_Sub5_Sub6) local632).aClass25_Sub5_2 = local377;
							} else {
								Static277.method4344(local377, false);
							}
							if (local30.anInt1831 != 0 && arg1 != null) {
								arg1.method283(local53, !local30.aBoolean213, local56, arg7, arg0, local30.aBoolean212);
							}
							if (local30.lb != 16) {
								Static136.method5271(arg5, arg7, arg0, local30.lb);
							}
						} else {
							@Pc(1820) Class25_Sub1 local1820;
							if (arg6 == 4) {
								if (local219) {
									@Pc(1839) Class25_Sub1_Sub3 local1839 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, 0, 0, 0, arg6, arg4);
									if (local1839.method4619()) {
										local1839.method4622(arg8);
									}
									local1820 = local1839;
								} else {
									local1820 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, 0, 0, 0, arg6, arg4, arg3);
								}
								@Pc(1854) Class25_Sub1 local1854 = Static165.method2380(arg5, arg7, arg0);
								if (local1854 instanceof Class25_Sub1_Sub1) {
									((Class25_Sub1_Sub1) local1854).aClass25_Sub1_1 = local1820;
								} else {
									Static394.method5148(arg5, arg7, arg0, local1820, null);
								}
							} else {
								@Pc(1874) int local1874;
								@Pc(1880) Interface8 local1880;
								@Pc(1919) Class25_Sub1_Sub3 local1919;
								@Pc(1963) Class25_Sub1 local1963;
								if (arg6 == 5) {
									local1874 = 17;
									local1880 = (Interface8) Static337.method4524(arg5, arg7, arg0);
									if (local1880 != null) {
										local1874 = Static341.aClass75_4.method1616(local1880.method4623()).lb + 1;
									}
									if (local219) {
										local1919 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, 0, local1874 * Static295.anIntArray337[arg4], Static22.anIntArray20[arg4] * local1874, arg6, arg4);
										local1820 = local1919;
										if (local1919.method4619()) {
											local1919.method4622(arg8);
										}
									} else {
										local1820 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, 0, local1874 * Static295.anIntArray337[arg4], local1874 * Static22.anIntArray20[arg4], arg6, arg4, arg3);
									}
									local1963 = Static165.method2380(arg5, arg7, arg0);
									if (local1963 instanceof Class25_Sub1_Sub1) {
										((Class25_Sub1_Sub1) local1963).aClass25_Sub1_1 = local1820;
									} else {
										Static394.method5148(arg5, arg7, arg0, local1820, null);
									}
								} else if (arg6 == 6) {
									local1874 = 9;
									local1880 = (Interface8) Static337.method4524(arg5, arg7, arg0);
									if (local1880 != null) {
										local1874 = Static341.aClass75_4.method1616(local1880.method4623()).lb / 2 + 1;
									}
									if (local219) {
										local1919 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg4, local1874 * Static295.anIntArray337[arg4], local1874 * Static22.anIntArray20[arg4], arg6, arg4 + 4);
										local1820 = local1919;
										if (local1919.method4619()) {
											local1919.method4622(arg8);
										}
									} else {
										local1820 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg4, local1874 * Static12.anIntArray12[arg4], Static11.anIntArray11[arg4] * local1874, arg6, arg4 + 4, arg3);
									}
									local1963 = Static165.method2380(arg5, arg7, arg0);
									if (local1963 instanceof Class25_Sub1_Sub1) {
										((Class25_Sub1_Sub1) local1963).aClass25_Sub1_1 = local1820;
									} else {
										Static394.method5148(arg5, arg7, arg0, local1820, null);
									}
								} else if (arg6 == 7) {
									local1874 = arg4 + 2 & 0x3;
									if (local219) {
										@Pc(2148) Class25_Sub1_Sub3 local2148 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, local1874, 0, 0, arg6, local1874 + 4);
										local1820 = local2148;
										if (local2148.method4619()) {
											local2148.method4622(arg8);
										}
									} else {
										local1820 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, local1874, 0, 0, arg6, local1874 + 4, arg3);
									}
									@Pc(2163) Class25_Sub1 local2163 = Static165.method2380(arg5, arg7, arg0);
									if (local2163 instanceof Class25_Sub1_Sub1) {
										((Class25_Sub1_Sub1) local2163).aClass25_Sub1_1 = local1820;
									} else {
										Static394.method5148(arg5, arg7, arg0, local1820, null);
									}
								} else if (arg6 == 8) {
									local379 = arg4 + 2 & 0x3;
									@Pc(2189) int local2189 = 9;
									@Pc(2195) Interface8 local2195 = (Interface8) Static337.method4524(arg5, arg7, arg0);
									if (local2195 != null) {
										local2189 = Static341.aClass75_4.method1616(local2195.method4623()).lb / 2 + 1;
									}
									@Pc(2238) Class25_Sub1 local2238;
									@Pc(2257) Class25_Sub1 local2257;
									if (local219) {
										local2238 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg4, Static12.anIntArray12[arg4] * local2189, local2189 * Static11.anIntArray11[arg4], arg6, arg4 + 4);
										local2257 = new Class25_Sub1_Sub3(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg4, 0, 0, arg6, local379 + 4);
										if (local2238.method4619()) {
											local2238.method4622(arg8);
										}
										if (local2257.method4619()) {
											local2257.method4622(arg8);
										}
									} else {
										local2238 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg4, Static12.anIntArray12[arg4] * local2189, Static11.anIntArray11[arg4] * local2189, arg6, arg4 + 4, arg3);
										local2257 = new Class25_Sub1_Sub2(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg4, 0, 0, arg6, local379 + 4, arg3);
									}
									Static394.method5148(arg5, arg7, arg0, local2238, local2257);
								}
							}
						}
					}
				}
			}
		} else if (Static453.aClass136_Sub1_1.aBoolean512 || local30.anInt1821 != 0 || local30.anInt1831 == 1 || local30.aBoolean210) {
			@Pc(278) Class25_Sub2 local278;
			if (local219) {
				@Pc(294) Class25_Sub2_Sub2 local294 = new Class25_Sub2_Sub2(arg8, local30, arg2, local164, local150, local172, super.aBoolean703, arg4, local184);
				local278 = local294;
				if (local294.method4619()) {
					local294.method4622(arg8);
				}
			} else {
				local278 = new Class25_Sub2_Sub1(arg8, local30, arg5, arg2, local164, local150, local172, super.aBoolean703, arg4, arg3);
			}
			@Pc(309) Class25_Sub2 local309 = Static231.method3312(arg5, arg7, arg0);
			if (local309 instanceof Class25_Sub2_Sub3) {
				((Class25_Sub2_Sub3) local309).aClass25_Sub2_1 = local278;
			} else {
				Static136.method5270(arg5, arg7, arg0, local278);
			}
			if (local30.anInt1831 == 1 && arg1 != null) {
				arg1.method274(arg0, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!za;Lclient!ug;III[I)V")
	public void method5014(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean703) {
			return;
		}
		@Pc(15) boolean local15 = false;
		@Pc(17) Class109 local17 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(28) int local28;
			@Pc(46) int local46;
			@Pc(251) int local251;
			@Pc(255) int local255;
			@Pc(53) int local53;
			while (arg1.anInt6812 < arg1.aByteArray86.length) {
				local28 = arg1.method5337();
				if (local28 == 0) {
					local17 = new Class109(arg1);
				} else {
					@Pc(98) int local98;
					@Pc(106) int local106;
					@Pc(110) int local110;
					if (local28 == 1) {
						local46 = arg1.method5337();
						if (local46 > 0) {
							for (local53 = 0; local53 < local46; local53++) {
								@Pc(62) Class137 local62 = new Class137(arg0, arg1, 0);
								if (local62.anInt3853 == 31) {
									@Pc(73) Class176 local73 = Static95.aClass26_1.method569(arg1.method5335());
									local62.method3148(local73.anInt5020, local73.anInt5019, local73.anInt5017, local73.anInt5016);
								}
								if (arg0.method5800() > 0) {
									@Pc(90) Class1_Sub7 local90 = local62.aClass1_Sub7_2;
									local98 = (arg2 << 7) + local90.method5113();
									local106 = local90.method5117() + (arg3 << 7);
									local110 = local98 >> 7;
									@Pc(114) int local114 = local106 >> 7;
									if (local110 >= 0 && local114 >= 0 && super.anInt6370 > local110 && super.anInt6371 > local114) {
										local90.method5115(local98, super.anIntArrayArrayArray12[local62.anInt3864][local110][local114] - local90.method5114(), local106);
										Static99.method1542(local62);
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local17 == null) {
							local17 = new Class109();
						}
						local17.method2386(arg1);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray19 == null) {
							super.aByteArrayArrayArray19 = new byte[4][][];
						}
						for (local46 = 0; local46 < 4; local46++) {
							@Pc(239) byte local239 = arg1.method5367();
							if (local239 == 0 && super.aByteArrayArrayArray19[local46] != null) {
								local251 = arg2;
								local255 = arg2 + 64;
								local98 = arg3;
								if (arg3 < 0) {
									local98 = 0;
								} else if (arg3 >= super.anInt6371) {
									local98 = super.anInt6371;
								}
								if (local255 < 0) {
									local255 = 0;
								} else if (local255 >= super.anInt6370) {
									local255 = super.anInt6370;
								}
								local106 = arg3 + 64;
								if (arg2 < 0) {
									local251 = 0;
								} else if (arg2 >= super.anInt6370) {
									local251 = super.anInt6370;
								}
								if (local106 < 0) {
									local106 = 0;
								} else if (local106 >= super.anInt6371) {
									local106 = super.anInt6371;
								}
								while (local255 > local251) {
									while (local106 > local98) {
										super.aByteArrayArrayArray19[local46][local251][local98] = 0;
										local98++;
									}
									local251++;
								}
							} else if (local239 == 1) {
								if (super.aByteArrayArrayArray19[local46] == null) {
									super.aByteArrayArrayArray19[local46] = new byte[super.anInt6370 + 1][super.anInt6371 + 1];
								}
								for (local251 = 0; local251 < 64; local251 += 4) {
									for (local255 = 0; local255 < 64; local255 += 4) {
										@Pc(394) byte local394 = arg1.method5367();
										for (local106 = arg2 + local251; local106 < local251 + arg2 + 4; local106++) {
											for (local110 = arg3 + local255; local110 < arg3 + local255 + 4; local110++) {
												if (local106 >= 0 && super.anInt6370 > local106 && local110 >= 0 && local110 < super.anInt6371) {
													super.aByteArrayArrayArray19[local46][local106][local110] = local394;
												}
											}
										}
									}
								}
							} else if (local239 == 2) {
								if (super.aByteArrayArrayArray19[local46] == null) {
									super.aByteArrayArrayArray19[local46] = new byte[super.anInt6370 + 1][super.anInt6371 + 1];
								}
								if (local46 > 0) {
									local251 = arg2;
									local255 = arg2 + 64;
									local98 = arg3;
									if (arg3 < 0) {
										local98 = 0;
									} else if (arg3 >= super.anInt6371) {
										local98 = super.anInt6371;
									}
									if (arg2 < 0) {
										local251 = 0;
									} else if (super.anInt6370 <= arg2) {
										local251 = super.anInt6370;
									}
									local106 = arg3 + 64;
									if (local255 < 0) {
										local255 = 0;
									} else if (super.anInt6370 <= local255) {
										local255 = super.anInt6370;
									}
									if (local106 < 0) {
										local106 = 0;
									} else if (super.anInt6371 <= local106) {
										local106 = super.anInt6371;
									}
									while (local251 < local255) {
										while (local98 < local106) {
											super.aByteArrayArrayArray19[local46][local251][local98] = super.aByteArrayArrayArray19[local46 - 1][local251][local98];
											local98++;
										}
										local251++;
									}
								}
							}
						}
						local15 = true;
					} else if (arg4 == null) {
						arg1.anInt6812 += 10;
					} else {
						arg4[0] = arg1.method5335();
						arg4[1] = arg1.method5382();
						arg4[2] = arg1.method5382();
						arg4[3] = arg1.method5382();
						arg4[4] = arg1.method5335();
					}
				}
			}
			if (local17 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local46 = 0; local46 < 8; local46++) {
						local53 = local28 + (arg2 >> 3);
						local251 = local46 + (arg3 >> 3);
						if (local53 >= 0 && super.anInt6370 >> 3 > local53 && local251 >= 0 && super.anInt6371 >> 3 > local251) {
							Static340.method4543(local251, local17, local53);
						}
					}
				}
			}
			if (!local15 && super.aByteArrayArrayArray19 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray19[local28] != null) {
						for (local46 = 0; local46 < 16; local46++) {
							for (local53 = 0; local53 < 16; local53++) {
								local251 = local46 + (arg2 >> 2);
								local255 = local53 + (arg3 >> 2);
								if (local251 >= 0 && local251 < 26 && local255 >= 0 && local255 < 26) {
									super.aByteArrayArrayArray19[local28][local251][local255] = 0;
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
