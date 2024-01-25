import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!ct", name = "R", descriptor = "I")
	public int anInt1981 = 99;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIZ)V")
	public Class67_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static369.aClass352_5, Static272.aClass32_3);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIILclient!jo;ILclient!ha;)V")
	public void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class198 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class16 arg5) {
		@Pc(19) Interface2 local19 = this.method1835(arg4, arg2, arg1, arg0);
		if (local19 == null) {
			return;
		}
		@Pc(28) Class178 local28 = Static349.aClass374_2.method8357(local19.method7823());
		@Pc(32) int local32 = local19.method7824();
		@Pc(36) int local36 = local19.method7827();
		if (local28.method4023()) {
			Static340.method5162(arg1, arg4, local28, arg2);
		}
		if (local19.method7828()) {
			local19.method7825(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static360.method5391(arg4, arg1, arg2);
			} else if (arg0 == 2) {
				Static626.method8267(arg4, arg1, arg2, bea.class);
				if (local28.anInt4737 != 0 && super.anInt1965 > local28.anInt4774 + arg1 && super.anInt1967 > local28.anInt4774 + arg2 && super.anInt1965 > arg1 + local28.anInt4746 && super.anInt1967 > local28.anInt4746 + arg2) {
					arg3.method4530(local28.aBoolean385, arg1, !local28.aBoolean392, arg2, local36, local28.anInt4746, local28.anInt4774);
				}
				if (local32 == 9) {
					if ((local36 & 0x1) != 0) {
						Static330.method5106(16, arg2, arg1, arg4);
						return;
					}
					Static330.method5106(8, arg2, arg1, arg4);
					return;
				}
			} else {
				if (arg0 == 3) {
					Static489.method7017(arg4, arg1, arg2);
					if (local28.anInt4737 == 1) {
						arg3.method4533(arg2, arg1);
						return;
					}
				}
				return;
			}
			return;
		}
		Static573.method7742(arg4, arg1, arg2);
		if (local28.anInt4737 != 0) {
			arg3.method4535(local36, local32, arg1, arg2, !local28.aBoolean392, local28.aBoolean385);
		}
		if (local28.anInt4747 != 1) {
			return;
		}
		if (local36 == 0) {
			Static330.method5106(1, arg2, arg1, arg4);
			return;
		}
		if (local36 == 1) {
			Static330.method5106(2, arg2 + 1, arg1, arg4);
		} else if (local36 == 2) {
			Static330.method5106(1, arg2, arg1 + 1, arg4);
			return;
		} else if (local36 == 3) {
			Static330.method5106(2, arg2, arg1, arg4);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[B[Lclient!jo;IIIIIILclient!ha;)V")
	public void method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class198[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class16 arg9) {
		@Pc(26) Class3_Sub17 local26 = new Class3_Sub17(arg2);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local26.method4856();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local26.method4841();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(59) int local59 = local43 & 0x3F;
				@Pc(65) int local65 = local43 >> 6 & 0x3F;
				@Pc(69) int local69 = local43 >> 12;
				@Pc(73) int local73 = local26.method4888();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				if (arg6 == local69 && local65 >= arg5 && arg5 + 8 > local65 && local59 >= arg0 && arg0 + 8 > local59) {
					@Pc(113) Class178 local113 = Static349.aClass374_2.method8357(local28);
					@Pc(130) int local130 = Static544.method7532(local81, local59 & 0x7, local65 & 0x7, arg7, local113.anInt4774, local113.anInt4746) + arg8;
					@Pc(147) int local147 = Static324.method5053(local59 & 0x7, arg7, local81, local113.anInt4774, local113.anInt4746, local65 & 0x7) + arg1;
					if (local130 > 0 && local147 > 0 && super.anInt1965 - 1 > local130 && local147 < super.anInt1967 - 1) {
						@Pc(168) Class198 local168 = null;
						if (!super.aBoolean179) {
							@Pc(173) int local173 = arg4;
							if ((Static338.aByteArrayArrayArray13[1][local130][local147] & 0x2) == 2) {
								local173 = arg4 - 1;
							}
							if (local173 >= 0) {
								local168 = arg3[local173];
							}
						}
						this.method1836(arg7 + local81 & 0x3, -1, arg4, local147, arg9, local28, local168, local77, local130, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!fca;II[ILclient!ha;I)V")
	public void method1833(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class16 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean179) {
			return;
		}
		@Pc(22) boolean local22 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(30) Class182 local30 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(53) int local53;
			@Pc(243) int local243;
			@Pc(247) int local247;
			@Pc(60) int local60;
			while (arg0.lb < arg0.aByteArray59.length) {
				local35 = arg0.method4888();
				if (local35 == 0) {
					local30 = new Class182(arg0);
				} else {
					@Pc(110) int local110;
					@Pc(118) int local118;
					@Pc(122) int local122;
					if (local35 == 1) {
						local53 = arg0.method4888();
						if (local53 > 0) {
							for (local60 = 0; local60 < local53; local60++) {
								@Pc(69) Class119 local69 = new Class119(arg3, arg0, 2);
								if (local69.anInt2992 == 31) {
									@Pc(82) Class179 local82 = Static47.aClass216_1.method5048(arg0.method4858());
									local69.method2740(local82.anInt4813, local82.anInt4819, local82.anInt4815, local82.anInt4809);
								}
								if (arg3.method8130() > 0) {
									@Pc(102) Class3_Sub7 local102 = local69.aClass3_Sub7_1;
									local110 = local102.method6348() + (arg1 << 9);
									local118 = (arg4 << 9) + local102.method6343();
									local122 = local110 >> 9;
									@Pc(126) int local126 = local118 >> 9;
									if (local122 >= 0 && local126 >= 0 && local122 < super.anInt1965 && super.anInt1967 > local126) {
										local102.method6342(super.anIntArrayArrayArray2[local69.anInt2998][local122][local126] - local102.method6346(), local110, local118);
										Static571.method7726(local69);
									}
								}
							}
						}
					} else if (local35 == 2) {
						if (local30 == null) {
							local30 = new Class182();
						}
						local30.method4138(arg0);
					} else if (local35 != 128) {
						if (local35 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray7 == null) {
							super.aByteArrayArrayArray7 = new byte[4][][];
						}
						local22 = true;
						for (local53 = 0; local53 < 4; local53++) {
							@Pc(208) byte local208 = arg0.method4861();
							if (local208 == 0 && super.aByteArrayArrayArray7[local53] != null) {
								local243 = arg1;
								local247 = arg1 + 64;
								local110 = arg4;
								if (arg4 < 0) {
									local110 = 0;
								} else if (super.anInt1967 <= arg4) {
									local110 = super.anInt1967;
								}
								if (local247 < 0) {
									local247 = 0;
								} else if (local247 >= super.anInt1965) {
									local247 = super.anInt1965;
								}
								if (arg1 < 0) {
									local243 = 0;
								} else if (super.anInt1965 <= arg1) {
									local243 = super.anInt1965;
								}
								local118 = arg4 + 64;
								if (local118 < 0) {
									local118 = 0;
								} else if (super.anInt1967 <= local118) {
									local118 = super.anInt1967;
								}
								while (local247 > local243) {
									while (local118 > local110) {
										super.aByteArrayArrayArray7[local53][local243][local110] = 0;
										local110++;
									}
									local243++;
								}
							} else if (local208 == 1) {
								if (super.aByteArrayArrayArray7[local53] == null) {
									super.aByteArrayArrayArray7[local53] = new byte[super.anInt1965 + 1][super.anInt1967 + 1];
								}
								for (local243 = 0; local243 < 64; local243 += 4) {
									for (local247 = 0; local247 < 64; local247 += 4) {
										@Pc(253) byte local253 = arg0.method4861();
										for (local118 = arg1 + local243; local118 < arg1 + local243 + 4; local118++) {
											for (local122 = arg4 + local247; local122 < arg4 + local247 + 4; local122++) {
												if (local118 >= 0 && local118 < super.anInt1965 && local122 >= 0 && local122 < super.anInt1967) {
													super.aByteArrayArrayArray7[local53][local118][local122] = local253;
												}
											}
										}
									}
								}
							} else if (local208 == 2) {
								if (super.aByteArrayArrayArray7[local53] == null) {
									super.aByteArrayArrayArray7[local53] = new byte[super.anInt1965 + 1][super.anInt1967 + 1];
								}
								if (local53 > 0) {
									local243 = arg1;
									local247 = arg1 + 64;
									local110 = arg4;
									if (local247 < 0) {
										local247 = 0;
									} else if (super.anInt1965 <= local247) {
										local247 = super.anInt1965;
									}
									local118 = arg4 + 64;
									if (arg1 < 0) {
										local243 = 0;
									} else if (super.anInt1965 <= arg1) {
										local243 = super.anInt1965;
									}
									if (arg4 < 0) {
										local110 = 0;
									} else if (arg4 >= super.anInt1967) {
										local110 = super.anInt1967;
									}
									if (local118 < 0) {
										local118 = 0;
									} else if (local118 >= super.anInt1967) {
										local118 = super.anInt1967;
									}
									while (local247 > local243) {
										while (local118 > local110) {
											super.aByteArrayArrayArray7[local53][local243][local110] = super.aByteArrayArrayArray7[local53 - 1][local243][local110];
											local110++;
										}
										local243++;
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg0.lb += 10;
					} else {
						arg2[0] = arg0.method4858();
						arg2[1] = arg0.method4869();
						arg2[2] = arg0.method4869();
						arg2[3] = arg0.method4869();
						arg2[4] = arg0.method4858();
					}
				}
			}
			if (local30 != null) {
				for (local35 = 0; local35 < 8; local35++) {
					for (local53 = 0; local53 < 8; local53++) {
						local60 = (arg1 >> 3) + local35;
						local243 = local53 + (arg4 >> 3);
						if (local60 >= 0 && local60 < super.anInt1965 >> 3 && local243 >= 0 && super.anInt1967 >> 3 > local243) {
							Static228.method2112(local30, local60, local243);
						}
					}
				}
			}
			if (!local22 && super.aByteArrayArrayArray7 != null) {
				for (local35 = 0; local35 < 4; local35++) {
					if (super.aByteArrayArrayArray7[local35] != null) {
						for (local53 = 0; local53 < 16; local53++) {
							for (local60 = 0; local60 < 16; local60++) {
								local243 = local53 + (arg1 >> 2);
								local247 = local60 + (arg4 >> 2);
								if (local243 >= 0 && local243 < 26 && local247 >= 0 && local247 < 26) {
									super.aByteArrayArrayArray7[local35][local243][local247] = 0;
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

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;[BIII[Lclient!jo;)V")
	public void method1834(@OriginalArg(0) Class16 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class198[] arg4) {
		@Pc(15) Class3_Sub17 local15 = new Class3_Sub17(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4856();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method4841();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method4888();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(75) int local75 = local54 + arg2;
				@Pc(80) int local80 = local48 + arg3;
				if (local75 > 0 && local80 > 0 && super.anInt1965 - 1 > local75 && super.anInt1967 - 1 > local80) {
					@Pc(108) Class198 local108 = null;
					if (!super.aBoolean179) {
						@Pc(113) int local113 = local58;
						if ((Static338.aByteArrayArrayArray13[1][local75][local80] & 0x2) == 2) {
							local113 = local58 - 1;
						}
						if (local113 >= 0) {
							local108 = arg4[local113];
						}
					}
					this.method1836(local70, -1, local58, local80, arg0, local17, local108, local66, local75, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)Lclient!bea;")
	public Interface2 method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Interface2 local10 = null;
		if (arg3 == 0) {
			local10 = (Interface2) Static363.method5416(arg0, arg2, arg1);
		}
		if (arg3 == 1) {
			local10 = (Interface2) Static244.method3912(arg0, arg2, arg1);
		}
		if (arg3 == 2) {
			local10 = (Interface2) Static344.method5203(arg0, arg2, arg1, bea.class);
		}
		if (arg3 == 3) {
			local10 = (Interface2) Static306.method4709(arg0, arg2, arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIILclient!ha;ILclient!jo;IIIZ)V")
	public void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class198 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0 && !Static339.method5151(arg8, arg3, arg2, Static407.anInt6944)) {
			return;
		}
		if (arg9 < this.anInt1981) {
			this.anInt1981 = arg9;
		}
		@Pc(34) Class178 local34 = Static349.aClass374_2.method8357(arg5);
		if (Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4577() == 0 && local34.aBoolean386) {
			return;
		}
		@Pc(73) int local73;
		@Pc(70) int local70;
		if (arg0 == 1 || arg0 == 3) {
			local70 = local34.anInt4774;
			local73 = local34.anInt4746;
		} else {
			local70 = local34.anInt4746;
			local73 = local34.anInt4774;
		}
		@Pc(105) int local105;
		@Pc(99) int local99;
		if (arg8 + local73 <= super.anInt1965) {
			local99 = (local73 + 1 >> 1) + arg8;
			local105 = arg8 + (local73 >> 1);
		} else {
			local105 = arg8;
			local99 = arg8 + 1;
		}
		@Pc(126) int local126;
		@Pc(130) int local130;
		if (arg3 + local70 > super.anInt1967) {
			local126 = arg3;
			local130 = arg3 + 1;
		} else {
			local126 = (local70 >> 1) + arg3;
			local130 = arg3 + (local70 + 1 >> 1);
		}
		@Pc(151) Class104 local151 = Static343.aClass104Array2[arg2];
		@Pc(178) int local178 = local151.method8279(local126, local105) + local151.method8279(local126, local99) + local151.method8279(local130, local105) + local151.method8279(local130, local99) >> 2;
		@Pc(186) int local186 = (local73 << 8) + (arg8 << 9);
		@Pc(194) int local194 = (arg3 << 9) + (local70 << 8);
		@Pc(206) boolean local206 = Static318.aBoolean461 && !super.aBoolean179 && local34.aBoolean388;
		if (local34.method4023()) {
			Static420.method5992(arg3, arg9, local34, arg0, arg8, (Class23_Sub2_Sub1_Sub2_Sub1) null, (Class23_Sub2_Sub1_Sub2_Sub2) null);
		}
		@Pc(243) boolean local243 = arg1 == -1 && local34.lb == -1 && local34.anIntArray315 == null && local34.anIntArray313 == null && !local34.aBoolean380 && !local34.aBoolean390;
		if (Static139.aBoolean210 && (Static446.method6450(arg7) && local34.anInt4747 != 1 || !(!Static226.method5412(arg7) || local34.anInt4747 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(385) Class23_Sub2_Sub1 local385;
			@Pc(353) Class23_Sub2_Sub1_Sub3 local353;
			@Pc(357) int local357;
			@Pc(451) int local451;
			if (arg7 == 10 || arg7 == 11) {
				local353 = null;
				if (local243) {
					@Pc(415) Class23_Sub2_Sub1_Sub3 local415 = new Class23_Sub2_Sub1_Sub3(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, local73 + arg8 - 1, arg3, local70 + arg3 - 1, arg7, arg0, local206);
					local353 = local415;
					local385 = local415;
					local357 = local415.method3855();
				} else {
					local357 = 15;
					local385 = new Class23_Sub2_Sub1_Sub4(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, arg8 + local73 - 1, arg3, arg3 + local70 - 1, arg7, arg0, arg1);
				}
				if (Static309.method4748(local385, false)) {
					if (local353 != null && local353.method7828()) {
						local353.method7829(arg4);
					}
					if (local34.aBoolean391 && Static318.aBoolean461) {
						if (local357 > 30) {
							local357 = 30;
						}
						for (local451 = 0; local451 <= local73; local451++) {
							for (@Pc(455) int local455 = 0; local455 <= local70; local455++) {
								local151.ka(local451 + arg8, arg3 - -local455, local357);
							}
						}
					}
				}
				if (local34.anInt4737 != 0 && arg6 != null) {
					arg6.method4528(!local34.aBoolean392, local73, arg3, local70, arg8, local34.aBoolean385);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local243) {
					local353 = new Class23_Sub2_Sub1_Sub3(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, local73 + arg8 - 1, arg3, local70 + arg3 - 1, arg7, arg0, local206);
					if (local353.method7828()) {
						local353.method7829(arg4);
					}
					local385 = local353;
				} else {
					local385 = new Class23_Sub2_Sub1_Sub4(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, arg8 + local73 - 1, arg3, local70 + arg3 - 1, arg7, arg0, arg1);
				}
				Static309.method4748(local385, false);
				if (Static318.aBoolean461 && !super.aBoolean179 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg9 > 0 && local34.anInt4747 != 0) {
					super.aByteArrayArrayArray10[arg9][arg8][arg3] = (byte) (super.aByteArrayArrayArray10[arg9][arg8][arg3] | 0x4);
				}
				if (local34.anInt4737 != 0 && arg6 != null) {
					arg6.method4528(!local34.aBoolean392, local73, arg3, local70, arg8, local34.aBoolean385);
				}
			} else {
				@Pc(695) Class23_Sub2_Sub5 local695;
				if (arg7 == 0) {
					@Pc(666) int local666 = local34.anInt4747;
					if (Static110.aBoolean193 && local34.anInt4747 == -1) {
						local666 = 1;
					}
					if (local243) {
						@Pc(693) Class23_Sub2_Sub5_Sub2 local693 = new Class23_Sub2_Sub5_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, local206);
						local695 = local693;
						if (local693.method7828()) {
							local693.method7829(arg4);
						}
					} else {
						local695 = new Class23_Sub2_Sub5_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, arg1);
					}
					Static623.method7323(arg9, arg8, arg3, local695, (Class23_Sub2_Sub5) null);
					if (arg0 == 0) {
						if (Static318.aBoolean461 && local34.aBoolean391) {
							local151.ka(arg8, arg3, 50);
							local151.ka(arg8, arg3 + 1, 50);
						}
						if (local666 == 1 && !super.aBoolean179) {
							Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 1, local34.anInt4782);
						}
					} else if (arg0 == 1) {
						if (Static318.aBoolean461 && local34.aBoolean391) {
							local151.ka(arg8, arg3 + 1, 50);
							local151.ka(arg8 + 1, arg3 - -1, 50);
						}
						if (local666 == 1 && !super.aBoolean179) {
							Static368.method5463(arg9, -local34.anInt4758, arg8, arg3 + 1, 2, local34.anInt4782);
						}
					} else if (arg0 == 2) {
						if (Static318.aBoolean461 && local34.aBoolean391) {
							local151.ka(arg8 + 1, arg3, 50);
							local151.ka(arg8 + 1, arg3 + 1, 50);
						}
						if (local666 == 1 && !super.aBoolean179) {
							Static368.method5463(arg9, -local34.anInt4758, arg8 + 1, arg3, 1, local34.anInt4782);
						}
					} else if (arg0 == 3) {
						if (Static318.aBoolean461 && local34.aBoolean391) {
							local151.ka(arg8, arg3, 50);
							local151.ka(arg8 + 1, arg3, 50);
						}
						if (local666 == 1 && !super.aBoolean179) {
							Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 2, local34.anInt4782);
						}
					}
					if (local34.anInt4737 != 0 && arg6 != null) {
						arg6.method4539(arg0, arg3, !local34.aBoolean392, arg7, local34.aBoolean385, arg8);
					}
					if (local34.anInt4733 != 64) {
						Static329.method1742(arg9, arg8, arg3, local34.anInt4733);
					}
				} else {
					@Pc(947) Class23_Sub2_Sub5 local947;
					@Pc(965) Class23_Sub2_Sub5_Sub2 local965;
					if (arg7 == 1) {
						if (local243) {
							local965 = new Class23_Sub2_Sub5_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, local206);
							local947 = local965;
							if (local965.method7828()) {
								local965.method7829(arg4);
							}
						} else {
							local947 = new Class23_Sub2_Sub5_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, arg1);
						}
						Static623.method7323(arg9, arg8, arg3, local947, (Class23_Sub2_Sub5) null);
						if (local34.aBoolean391 && Static318.aBoolean461) {
							if (arg0 == 0) {
								local151.ka(arg8, arg3 + 1, 50);
							} else if (arg0 == 1) {
								local151.ka(arg8 + 1, arg3 + 1, 50);
							} else if (arg0 == 2) {
								local151.ka(arg8 + 1, arg3, 50);
							} else if (arg0 == 3) {
								local151.ka(arg8, arg3, 50);
							}
						}
						if (local34.anInt4737 != 0 && arg6 != null) {
							arg6.method4539(arg0, arg3, !local34.aBoolean392, arg7, local34.aBoolean385, arg8);
						}
					} else if (arg7 == 2) {
						local357 = arg0 + 1 & 0x3;
						if (local243) {
							@Pc(1122) Class23_Sub2_Sub5_Sub2 local1122 = new Class23_Sub2_Sub5_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0 + 4, local206);
							@Pc(1138) Class23_Sub2_Sub5_Sub2 local1138 = new Class23_Sub2_Sub5_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, local357, local206);
							if (local1122.method7828()) {
								local1122.method7829(arg4);
							}
							local947 = local1122;
							if (local1138.method7828()) {
								local1138.method7829(arg4);
							}
							local695 = local1138;
						} else {
							local947 = new Class23_Sub2_Sub5_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0 + 4, arg1);
							local695 = new Class23_Sub2_Sub5_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, local357, arg1);
						}
						Static623.method7323(arg9, arg8, arg3, local947, local695);
						if ((local34.anInt4747 == 1 || Static110.aBoolean193 && local34.anInt4747 == -1) && !super.aBoolean179) {
							if (arg0 == 0) {
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 1, local34.anInt4782);
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3 + 1, 2, local34.anInt4782);
							} else if (arg0 == 1) {
								Static368.method5463(arg9, local34.anInt4758, arg8 + 1, arg3, 1, local34.anInt4782);
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3 + 1, 2, local34.anInt4782);
							} else if (arg0 == 2) {
								Static368.method5463(arg9, local34.anInt4758, arg8 + 1, arg3, 1, local34.anInt4782);
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 2, local34.anInt4782);
							} else if (arg0 == 3) {
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 1, local34.anInt4782);
								Static368.method5463(arg9, local34.anInt4758, arg8, arg3, 2, local34.anInt4782);
							}
						}
						if (local34.anInt4737 != 0 && arg6 != null) {
							arg6.method4539(arg0, arg3, !local34.aBoolean392, arg7, local34.aBoolean385, arg8);
						}
						if (local34.anInt4733 != 64) {
							Static329.method1742(arg9, arg8, arg3, local34.anInt4733);
						}
					} else if (arg7 == 3) {
						if (local243) {
							local965 = new Class23_Sub2_Sub5_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, local206);
							local947 = local965;
							if (local965.method7828()) {
								local965.method7829(arg4);
							}
						} else {
							local947 = new Class23_Sub2_Sub5_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg7, arg0, arg1);
						}
						Static623.method7323(arg9, arg8, arg3, local947, (Class23_Sub2_Sub5) null);
						if (local34.aBoolean391 && Static318.aBoolean461) {
							if (arg0 == 0) {
								local151.ka(arg8, arg3 + 1, 50);
							} else if (arg0 == 1) {
								local151.ka(arg8 + 1, arg3 + 1, 50);
							} else if (arg0 == 2) {
								local151.ka(arg8 + 1, arg3, 50);
							} else if (arg0 == 3) {
								local151.ka(arg8, arg3, 50);
							}
						}
						if (local34.anInt4737 != 0 && arg6 != null) {
							arg6.method4539(arg0, arg3, !local34.aBoolean392, arg7, local34.aBoolean385, arg8);
						}
					} else if (arg7 == 9) {
						if (local243) {
							local353 = new Class23_Sub2_Sub1_Sub3(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, arg8, arg3, arg3, arg7, arg0, local206);
							local385 = local353;
							if (local353.method7828()) {
								local353.method7829(arg4);
							}
						} else {
							local385 = new Class23_Sub2_Sub1_Sub4(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg8, local73 + arg8 - 1, arg3, local70 + arg3 - 1, arg7, arg0, arg1);
						}
						Static309.method4748(local385, false);
						if (local34.anInt4747 == 1 && !super.aBoolean179) {
							@Pc(1538) byte local1538;
							if ((arg0 & 0x1) == 0) {
								local1538 = 8;
							} else {
								local1538 = 16;
							}
							Static368.method5463(arg9, 0, arg8, arg3, local1538, local34.anInt4782);
						}
						if (local34.anInt4737 != 0 && arg6 != null) {
							arg6.method4528(!local34.aBoolean392, local73, arg3, local70, arg8, local34.aBoolean385);
						}
						if (local34.anInt4733 != 64) {
							Static329.method1742(arg9, arg8, arg3, local34.anInt4733);
						}
					} else {
						@Pc(1607) Class23_Sub2_Sub2 local1607;
						if (arg7 == 4) {
							if (local243) {
								@Pc(1626) Class23_Sub2_Sub2_Sub2 local1626 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, arg0);
								local1607 = local1626;
								if (local1626.method7828()) {
									local1626.method7829(arg4);
								}
							} else {
								local1607 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, arg0, arg1);
							}
							Static203.method3209(arg9, arg8, arg3, local1607, (Class23_Sub2_Sub2) null);
						} else {
							@Pc(1648) int local1648;
							@Pc(1654) Interface2 local1654;
							@Pc(1721) Class23_Sub2_Sub2_Sub2 local1721;
							if (arg7 == 5) {
								local1648 = 65;
								local1654 = (Interface2) Static363.method5416(arg9, arg8, arg3);
								if (local1654 != null) {
									local1648 = Static349.aClass374_2.method8357(local1654.method7823()).anInt4733 + 1;
								}
								if (local243) {
									local1721 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, Static197.anIntArray248[arg0] * local1648, local1648 * Static223.anIntArray278[arg0], arg7, arg0);
									if (local1721.method7828()) {
										local1721.method7829(arg4);
									}
									local1607 = local1721;
								} else {
									local1607 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, Static197.anIntArray248[arg0] * local1648, local1648 * Static223.anIntArray278[arg0], arg7, arg0, arg1);
								}
								Static203.method3209(arg9, arg8, arg3, local1607, (Class23_Sub2_Sub2) null);
							} else if (arg7 == 6) {
								local1648 = 33;
								local1654 = (Interface2) Static363.method5416(arg9, arg8, arg3);
								if (local1654 != null) {
									local1648 = Static349.aClass374_2.method8357(local1654.method7823()).anInt4733 / 2 + 1;
								}
								if (local243) {
									local1721 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, Static197.anIntArray248[arg0] * local1648, Static223.anIntArray278[arg0] * local1648, arg7, arg0 + 4);
									local1607 = local1721;
									if (local1721.method7828()) {
										local1721.method7829(arg4);
									}
								} else {
									local1607 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, Static53.anIntArray61[arg0] * local1648, local1648 * Static244.anIntArray295[arg0], arg7, arg0 + 4, arg1);
								}
								Static203.method3209(arg9, arg8, arg3, local1607, (Class23_Sub2_Sub2) null);
							} else if (arg7 == 7) {
								local1648 = arg0 + 2 & 0x3;
								if (local243) {
									@Pc(1893) Class23_Sub2_Sub2_Sub2 local1893 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, local1648 + 4);
									local1607 = local1893;
									if (local1893.method7828()) {
										local1893.method7829(arg4);
									}
								} else {
									local1607 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, local1648 + 4, arg1);
								}
								Static203.method3209(arg9, arg8, arg3, local1607, (Class23_Sub2_Sub2) null);
							} else if (arg7 == 8) {
								local357 = arg0 + 2 & 0x3;
								local451 = 33;
								@Pc(1929) Interface2 local1929 = (Interface2) Static363.method5416(arg9, arg8, arg3);
								if (local1929 != null) {
									local451 = Static349.aClass374_2.method8357(local1929.method7823()).anInt4733 / 2 + 1;
								}
								@Pc(1972) Class23_Sub2_Sub2 local1972;
								@Pc(1991) Class23_Sub2_Sub2 local1991;
								if (local243) {
									local1972 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, local451 * Static53.anIntArray61[arg0], Static244.anIntArray295[arg0] * local451, arg7, arg0 + 4);
									local1991 = new Class23_Sub2_Sub2_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, local357 + 4);
									if (local1972.method7828()) {
										local1972.method7829(arg4);
									}
									if (local1991.method7828()) {
										local1991.method7829(arg4);
									}
								} else {
									local1972 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, local451 * Static53.anIntArray61[arg0], Static244.anIntArray295[arg0] * local451, arg7, arg0 + 4, arg1);
									local1991 = new Class23_Sub2_Sub2_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, 0, 0, arg7, local357 + 4, arg1);
								}
								Static203.method3209(arg9, arg8, arg3, local1972, local1991);
							}
						}
					}
				}
			}
		} else if (Static227.aClass3_Sub15_11.aClass17_Sub23_1.method7173() != 0 || local34.anInt4743 != 0 || local34.anInt4737 == 1 || local34.aBoolean384) {
			@Pc(301) Class23_Sub2_Sub3 local301;
			if (local243) {
				@Pc(299) Class23_Sub2_Sub3_Sub1 local299 = new Class23_Sub2_Sub3_Sub1(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg0, local206);
				local301 = local299;
				if (local299.method7828()) {
					local299.method7829(arg4);
				}
			} else {
				local301 = new Class23_Sub2_Sub3_Sub2(arg4, local34, arg9, arg2, local186, local178, local194, super.aBoolean179, arg0, arg1);
			}
			Static42.method1219(arg9, arg8, arg3, local301);
			if (local34.anInt4737 == 1 && arg6 != null) {
				arg6.method4532(arg8, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[IILclient!fca;Lclient!ha;IIII)V")
	public void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub17 arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean179) {
			return;
		}
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(19) Class182 local19 = null;
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(128) int local128;
			@Pc(146) int local146;
			@Pc(418) int local418;
			while (arg5.lb < arg5.aByteArray59.length) {
				local36 = arg5.method4888();
				if (local36 == 0) {
					local19 = new Class182(arg5);
				} else {
					@Pc(186) int local186;
					@Pc(291) int local291;
					@Pc(329) int local329;
					@Pc(152) int local152;
					if (local36 == 1) {
						local128 = arg5.method4888();
						if (local128 > 0) {
							for (local418 = 0; local418 < local128; local418++) {
								@Pc(427) Class119 local427 = new Class119(arg6, arg5, 2);
								if (local427.anInt2992 == 31) {
									@Pc(440) Class179 local440 = Static47.aClass216_1.method5048(arg5.method4858());
									local427.method2740(local440.anInt4813, local440.anInt4819, local440.anInt4815, local440.anInt4809);
								}
								if (arg6.method8130() > 0) {
									@Pc(457) Class3_Sub7 local457 = local427.aClass3_Sub7_1;
									local152 = local457.method6348() >> 9;
									local186 = local457.method6343() >> 9;
									if (local427.anInt2998 == arg0 && local152 >= local25 && local25 + 8 > local152 && local31 <= local186 && local186 < local31 + 8) {
										local291 = (arg7 << 9) + Static226.method5413(local457.method6348() & 0xFFF, arg1, local457.method6343() & 0xFFF);
										local152 = local291 >> 9;
										local329 = Static367.method5450(local457.method6343() & 0xFFF, arg1, local457.method6348() & 0xFFF) + (arg9 << 9);
										local186 = local329 >> 9;
										if (local152 >= 0 && local186 >= 0 && local152 < super.anInt1965 && super.anInt1967 > local186) {
											local457.method6342(super.anIntArrayArrayArray2[arg0][local152][local186] - local457.method6346(), local291, local329);
											Static571.method7726(local427);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local19 == null) {
							local19 = new Class182();
						}
						local19.method4138(arg5);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray7 == null) {
							super.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local128 = 0; local128 < 4; local128++) {
							@Pc(134) byte local134 = arg5.method4861();
							@Pc(150) int local150;
							if (local134 == 0 && super.aByteArrayArrayArray7[arg8] != null) {
								if (arg0 >= local128) {
									local146 = arg7;
									local150 = arg7 + 7;
									local152 = arg9;
									if (arg7 < 0) {
										local146 = 0;
									} else if (super.anInt1965 <= arg7) {
										local146 = super.anInt1965;
									}
									if (local150 < 0) {
										local150 = 0;
									} else if (local150 >= super.anInt1965) {
										local150 = super.anInt1965;
									}
									local186 = arg9 + 7;
									if (arg9 < 0) {
										local152 = 0;
									} else if (super.anInt1967 <= arg9) {
										local152 = super.anInt1967;
									}
									if (local186 < 0) {
										local186 = 0;
									} else if (local186 >= super.anInt1967) {
										local186 = super.anInt1967;
									}
									while (local150 > local146) {
										while (local152 < local186) {
											super.aByteArrayArrayArray7[arg8][local146][local152] = 0;
											local152++;
										}
										local146++;
									}
								}
							} else if (local134 == 1) {
								if (super.aByteArrayArrayArray7[arg8] == null) {
									super.aByteArrayArrayArray7[arg8] = new byte[super.anInt1965 + 1][super.anInt1967 + 1];
								}
								for (local146 = 0; local146 < 64; local146 += 4) {
									for (local150 = 0; local150 < 64; local150 += 4) {
										@Pc(278) byte local278 = arg5.method4861();
										if (local128 <= arg0) {
											for (local186 = local146; local186 < local146 + 4; local186++) {
												for (local291 = local150; local291 < local150 + 4; local291++) {
													if (local25 <= local186 && local25 + 8 > local186 && local31 <= local291 && local31 + 8 > local31) {
														local329 = Static674.method8719(arg1, local186 & 0x7, local291 & 0x7) + arg7;
														@Pc(341) int local341 = Static141.method2439(arg1, local186 & 0x7, local291 & 0x7) + arg9;
														if (local329 >= 0 && local329 < super.anInt1965 && local341 >= 0 && local341 < super.anInt1967) {
															super.aByteArrayArrayArray7[arg8][local329][local341] = local278;
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
						arg5.lb += 10;
					} else {
						arg3[0] = arg5.method4858();
						arg3[1] = arg5.method4869();
						arg3[2] = arg5.method4869();
						arg3[3] = arg5.method4869();
						arg3[4] = arg5.method4858();
					}
				}
			}
			if (local19 != null) {
				Static228.method2112(local19, arg7 >> 3, arg9 >> 3);
			}
			if (super.aByteArrayArrayArray7 != null && super.aByteArrayArrayArray7[arg8] != null) {
				local36 = arg7 + 7;
				local128 = arg9 + 7;
				for (local418 = arg7; local418 < local36; local418++) {
					for (local146 = arg9; local146 < local128; local146++) {
						super.aByteArrayArrayArray7[arg8][local418][local146] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ha;IZ)V")
	public void method1839(@OriginalArg(0) Class16 arg0, @OriginalArg(2) boolean arg1) {
		Static10.method99();
		if (!arg1) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt1959 > 1) {
				for (local18 = 0; local18 < super.anInt1965; local18++) {
					for (local22 = 0; super.anInt1967 > local22; local22++) {
						if ((Static338.aByteArrayArrayArray13[1][local18][local22] & 0x2) == 2) {
							Static551.method7572(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; local18 < super.anInt1959; local18++) {
				for (local22 = 0; super.anInt1967 >= local22; local22++) {
					for (@Pc(64) int local64 = 0; local64 <= super.anInt1965; local64++) {
						if ((super.aByteArrayArrayArray10[local18][local64][local22] & 0x4) != 0) {
							@Pc(82) int local82 = local64;
							@Pc(84) int local84 = local64;
							@Pc(86) int local86 = local22;
							@Pc(88) int local88 = local22;
							while (local86 > 0 && (super.aByteArrayArrayArray10[local18][local64][local86 - 1] & 0x4) != 0 && local22 - local86 < 10) {
								local86--;
							}
							while (local88 < super.anInt1967 && (super.aByteArrayArrayArray10[local18][local64][local88 + 1] & 0x4) != 0 && local88 - local86 < 10) {
								local88++;
							}
							@Pc(148) int local148;
							label111: while (local82 > 0 && local64 - local82 < 10) {
								for (local148 = local86; local148 <= local88; local148++) {
									if ((super.aByteArrayArrayArray10[local18][local82 - 1][local148] & 0x4) == 0) {
										break label111;
									}
								}
								local82--;
							}
							label98: while (super.anInt1965 > local84 && local84 - local82 < 10) {
								for (local148 = local86; local148 <= local88; local148++) {
									if ((super.aByteArrayArrayArray10[local18][local84 + 1][local148] & 0x4) == 0) {
										break label98;
									}
								}
								local84++;
							}
							if ((local84 + 1 - local82) * (-local86 + 1 + local88) >= 4) {
								local148 = super.anIntArrayArrayArray2[local18][local82][local86];
								Static148.method2561(local18, local148, local82 << 9, local86 << 9, (local84 << 9) + 512, local148, (local88 << 9) + 512);
								for (@Pc(275) int local275 = local82; local275 <= local84; local275++) {
									for (@Pc(279) int local279 = local86; local279 <= local88; local279++) {
										super.aByteArrayArrayArray10[local18][local275][local279] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static563.method7676();
		}
		super.aByteArrayArrayArray10 = null;
	}
}
