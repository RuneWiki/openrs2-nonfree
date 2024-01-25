import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	public int anInt8834 = 99;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIZ)V")
	public Class200_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static117.aClass286_4, Static16.aClass16_3);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[B[Lclient!gea;IILclient!qa;IIIII)V")
	public void method7409(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class99[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) Class2_Sub29 local10 = new Class2_Sub29(arg1);
		@Pc(24) int local24 = -1;
		while (true) {
			@Pc(28) int local28 = local10.method5211();
			if (local28 == 0) {
				return;
			}
			local24 += local28;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(40) int local40 = local10.method5182();
				if (local40 == 0) {
					break;
				}
				local36 += local40 - 1;
				@Pc(55) int local55 = local36 & 0x3F;
				@Pc(61) int local61 = local36 >> 6 & 0x3F;
				@Pc(65) int local65 = local36 >> 12;
				@Pc(69) int local69 = local10.method5170();
				@Pc(73) int local73 = local69 >> 2;
				@Pc(77) int local77 = local69 & 0x3;
				if (arg0 == local65 && arg3 <= local61 && local61 < arg3 + 8 && local55 >= arg8 && local55 < arg8 + 8) {
					@Pc(109) Class129 local109 = Static505.aClass206_4.method5326(local24);
					@Pc(127) int local127 = arg9 + Static284.method7821(arg6, local109.anInt3650, local61 & 0x7, local55 & 0x7, local77, local109.anInt3653);
					@Pc(144) int local144 = arg7 + Static337.method5336(local77, local55 & 0x7, local109.anInt3653, local109.anInt3650, arg6, local61 & 0x7);
					if (local127 > 0 && local144 > 0 && local127 < super.anInt8828 - 1 && local144 < super.anInt8820 - 1) {
						@Pc(166) Class99 local166 = null;
						if (!super.aBoolean639) {
							@Pc(171) int local171 = arg4;
							if ((Static267.aByteArrayArrayArray19[1][local127][local144] & 0x2) == 2) {
								local171 = arg4 - 1;
							}
							if (local171 >= 0) {
								local166 = arg2[local171];
							}
						}
						this.method7415(arg5, local144, local77 + arg6 & 0x3, local73, local127, arg4, arg4, local24, local166, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BIILclient!qa;[Lclient!gea;)V")
	public void method7411(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) Class99[] arg4) {
		@Pc(18) Class2_Sub29 local18 = new Class2_Sub29(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method5211();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method5182();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local18.method5170();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = local60 + arg2;
				@Pc(84) int local84 = arg0 + local54;
				if (local80 > 0 && local84 > 0 && super.anInt8828 - 1 > local80 && local84 < super.anInt8820 - 1) {
					@Pc(109) Class99 local109 = null;
					if (!super.aBoolean639) {
						@Pc(114) int local114 = local64;
						if ((Static267.aByteArrayArrayArray19[1][local80][local84] & 0x2) == 2) {
							local114 = local64 - 1;
						}
						if (local114 >= 0) {
							local109 = arg4[local114];
						}
					}
					this.method7415(arg3, local84, local76, local72, local80, local64, local64, local20, local109, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!qa;IIII[IILclient!ps;IZ)V")
	public void method7412(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub29 arg8, @OriginalArg(9) int arg9) {
		if (super.aBoolean639) {
			return;
		}
		@Pc(13) Class142 local13 = null;
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(25) int local25 = (arg9 & 0x7) * 8;
		@Pc(31) int local31 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(68) int local68;
			@Pc(89) int local89;
			@Pc(418) int local418;
			while (arg8.anInt6132 < arg8.aByteArray96.length) {
				local36 = arg8.method5170();
				if (local36 == 0) {
					local13 = new Class142(arg8);
				} else {
					@Pc(119) int local119;
					@Pc(241) int local241;
					@Pc(279) int local279;
					@Pc(95) int local95;
					if (local36 == 1) {
						local68 = arg8.method5170();
						if (local68 > 0) {
							for (local418 = 0; local418 < local68; local418++) {
								@Pc(427) Class83 local427 = new Class83(arg1, arg8, 0);
								if (local427.anInt2483 == 31) {
									@Pc(440) Class33 local440 = Static129.aClass100_1.method2658(arg8.method5229());
									local427.method2370(local440.anInt1110, local440.anInt1115, local440.anInt1109, local440.anInt1118);
								}
								if (arg1.method6053() > 0) {
									@Pc(460) Class2_Sub5 local460 = local427.aClass2_Sub5_1;
									local95 = local460.method1672() >> 7;
									local119 = local460.method1662() >> 7;
									if (arg2 == local427.anInt2484 && local25 <= local95 && local25 + 8 > local95 && local31 <= local119 && local119 < local31 + 8) {
										local241 = Static196.method3170(arg5, local460.method1672() & 0x3FF, local460.method1662() & 0x3FF) + (arg7 << 7);
										local95 = local241 >> 7;
										local279 = (arg4 << 7) + Static480.method7151(arg5, local460.method1662() & 0x3FF, local460.method1672() & 0x3FF);
										local119 = local279 >> 7;
										if (local95 >= 0 && local119 >= 0 && super.anInt8828 > local95 && super.anInt8820 > local119) {
											local460.method1667(local241, local279, super.anIntArrayArrayArray22[arg2][local95][local119] - local460.method1671());
											Static477.method7129(local427);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class142();
						}
						local13.method3486(arg8);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray23 == null) {
							super.aByteArrayArrayArray23 = new byte[4][][];
						}
						for (local68 = 0; local68 < 4; local68++) {
							@Pc(74) byte local74 = arg8.method5179();
							@Pc(93) int local93;
							if (local74 == 0 && super.aByteArrayArrayArray23[arg0] != null) {
								if (arg2 >= local68) {
									local89 = arg7;
									local93 = arg7 + 7;
									local95 = arg4;
									if (arg4 < 0) {
										local95 = 0;
									} else if (arg4 >= super.anInt8820) {
										local95 = super.anInt8820;
									}
									local119 = arg4 + 7;
									if (arg7 < 0) {
										local89 = 0;
									} else if (super.anInt8828 <= arg7) {
										local89 = super.anInt8828;
									}
									if (local93 < 0) {
										local93 = 0;
									} else if (super.anInt8828 <= local93) {
										local93 = super.anInt8828;
									}
									if (local119 < 0) {
										local119 = 0;
									} else if (local119 >= super.anInt8820) {
										local119 = super.anInt8820;
									}
									while (local89 < local93) {
										while (local119 > local95) {
											super.aByteArrayArrayArray23[arg0][local89][local95] = 0;
											local95++;
										}
										local89++;
									}
								}
							} else if (local74 == 1) {
								if (super.aByteArrayArrayArray23[arg0] == null) {
									super.aByteArrayArrayArray23[arg0] = new byte[super.anInt8828 + 1][super.anInt8820 + 1];
								}
								for (local89 = 0; local89 < 64; local89 += 4) {
									for (local93 = 0; local93 < 64; local93 += 4) {
										@Pc(228) byte local228 = arg8.method5179();
										if (arg2 >= local68) {
											for (local119 = local89; local119 < local89 + 4; local119++) {
												for (local241 = local93; local241 < local93 + 4; local241++) {
													if (local25 <= local119 && local119 < local25 + 8 && local241 >= local31 && local31 + 8 > local31) {
														local279 = Static216.method3435(arg5, local119 & 0x7, local241 & 0x7) + arg7;
														@Pc(291) int local291 = Static172.method5413(arg5, local241 & 0x7, local119 & 0x7) + arg4;
														if (local279 >= 0 && super.anInt8828 > local279 && local291 >= 0 && local291 < super.anInt8820) {
															super.aByteArrayArrayArray23[arg0][local279][local291] = local228;
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
						arg8.anInt6132 += 10;
					} else {
						arg6[0] = arg8.method5229();
						arg6[1] = arg8.method5231();
						arg6[2] = arg8.method5231();
						arg6[3] = arg8.method5231();
						arg6[4] = arg8.method5229();
					}
				}
			}
			if (local13 != null) {
				Static52.method961(local13, arg7 >> 3, arg4 >> 3);
			}
			if (super.aByteArrayArrayArray23 != null && super.aByteArrayArrayArray23[arg0] != null) {
				local36 = arg7 + 7;
				local68 = arg4 + 7;
				for (local418 = arg7; local418 < local36; local418++) {
					for (local89 = arg4; local89 < local68; local89++) {
						super.aByteArrayArrayArray23[arg0][local418][local89] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!gea;IIILclient!qa;)V")
	public void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class39 arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface6) Static524.method7595(arg3, arg1, arg4);
		}
		if (arg0 == 1) {
			local7 = (Interface6) Static55.method1029(arg3, arg1, arg4);
		}
		if (arg0 == 2) {
			local7 = (Interface6) Static214.method3907(arg3, arg1, arg4, ej.class);
		}
		if (arg0 == 3) {
			local7 = (Interface6) Static427.method6584(arg3, arg1, arg4);
		}
		if (local7 == null) {
			return;
		}
		@Pc(62) Class129 local62 = Static505.aClass206_4.method5326(local7.method7688());
		@Pc(66) int local66 = local7.method7685();
		@Pc(70) int local70 = local7.method7687();
		if (local62.method3280()) {
			Static436.method6683(local62, arg3, arg4, arg1);
		}
		if (local7.method7684()) {
			local7.method7686(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(103) Class1_Sub3 local103 = Static55.method1029(arg3, arg1, arg4);
				if (!(local103 instanceof Class1_Sub3_Sub1)) {
					Static181.method2999(arg3, arg1, arg4);
					return;
				}
				((Class1_Sub3_Sub1) local103).aClass1_Sub3_1 = null;
				return;
			}
			if (arg0 == 2) {
				@Pc(163) Class1_Sub1 local163 = Static214.method3907(arg3, arg1, arg4, ej.class);
				if (local163 instanceof Class1_Sub1_Sub6 && arg1 == local163.aShort127 && arg4 == local163.aShort128) {
					((Class1_Sub1_Sub6) local163).aClass1_Sub1_2 = null;
				} else {
					Static529.method7633(arg3, arg1, arg4, ej.class);
				}
				if (local62.anInt3678 == 0 || super.anInt8828 <= arg1 + local62.anInt3653 || super.anInt8820 <= local62.anInt3653 + arg4 || local62.anInt3650 + arg1 >= super.anInt8828 || super.anInt8820 <= local62.anInt3650 + arg4) {
					return;
				}
				arg2.method2642(local70, arg4, arg1, local62.anInt3650, local62.anInt3653, local62.aBoolean289, !local62.aBoolean285);
			} else if (arg0 == 3) {
				@Pc(127) Class1_Sub4 local127 = Static427.method6584(arg3, arg1, arg4);
				if (local127 instanceof Class1_Sub4_Sub3) {
					((Class1_Sub4_Sub3) local127).aClass1_Sub4_2 = null;
				} else {
					Static108.method2071(arg3, arg1, arg4);
				}
				if (local62.anInt3678 == 1) {
					arg2.method2633(arg4, arg1);
					return;
				}
			}
			return;
		}
		@Pc(263) Class1_Sub2 local263 = Static524.method7595(arg3, arg1, arg4);
		if (local263 instanceof Class1_Sub2_Sub1) {
			((Class1_Sub2_Sub1) local263).aClass1_Sub2_1 = null;
		} else {
			Static262.method6148(arg3, arg1, arg4);
		}
		if (local62.anInt3678 != 0) {
			arg2.method2634(arg4, !local62.aBoolean285, local66, arg1, local62.aBoolean289, local70);
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method7414(@OriginalArg(0) Class39 arg0) {
		Static166.method2820(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt8825 > 1) {
			for (local15 = 0; local15 < super.anInt8828; local15++) {
				for (local19 = 0; super.anInt8820 > local19; local19++) {
					if ((Static267.aByteArrayArrayArray19[1][local15][local19] & 0x2) == 2) {
						Static404.method6385(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; super.anInt8825 > local15; local15++) {
			for (local19 = 0; super.anInt8820 >= local19; local19++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt8828; local59++) {
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(128) int local128;
					@Pc(132) int local132;
					@Pc(218) int local218;
					@Pc(227) int local227;
					@Pc(247) int local247;
					@Pc(251) int local251;
					if ((super.aByteArrayArrayArray21[local15][local59][local19] & 0x1) != 0) {
						local77 = local19;
						local79 = local19;
						local81 = local15;
						while (local79 < super.anInt8820 && (super.aByteArrayArrayArray21[local15][local59][local79 + 1] & 0x1) != 0) {
							local79++;
						}
						while (local77 > 0 && (super.aByteArrayArrayArray21[local15][local59][local77 - 1] & 0x1) != 0) {
							local77--;
						}
						local128 = local15;
						label164: while (local81 > 0) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray21[local81 - 1][local59][local132] & 0x1) == 0) {
									break label164;
								}
							}
							local81--;
						}
						label153: while (local128 < 3) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray21[local128 + 1][local59][local132] & 0x1) == 0) {
									break label153;
								}
							}
							local128++;
						}
						local132 = (local128 + 1 - local81) * (local79 + 1 - local77);
						if (local132 >= 2) {
							local218 = super.anIntArrayArrayArray22[local128][local59][local77] - 240;
							local227 = super.anIntArrayArrayArray22[local81][local59][local77];
							Static129.method2390(1, local59 << 7, local59 << 7, local77 << 7, (local79 << 7) + 128, local218, local227);
							for (local247 = local81; local247 <= local128; local247++) {
								for (local251 = local77; local251 <= local79; local251++) {
									super.aByteArrayArrayArray21[local247][local59][local251] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray21[local15][local59][local19] & 0x2) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local15;
						while (super.anInt8828 > local79 && (super.aByteArrayArrayArray21[local15][local79 + 1][local19] & 0x2) != 0) {
							local79++;
						}
						local128 = local15;
						while (local77 > 0 && (super.aByteArrayArrayArray21[local15][local77 - 1][local19] & 0x2) != 0) {
							local77--;
						}
						label218: while (local81 > 0) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray21[local81 - 1][local132][local19] & 0x2) == 0) {
									break label218;
								}
							}
							local81--;
						}
						label207: while (local128 < 3) {
							for (local132 = local77; local132 <= local79; local132++) {
								if ((super.aByteArrayArrayArray21[local128 + 1][local132][local19] & 0x2) == 0) {
									break label207;
								}
							}
							local128++;
						}
						local132 = (local128 + 1 - local81) * (local79 + 1 - local77);
						if (local132 >= 2) {
							local218 = super.anIntArrayArrayArray22[local128][local77][local19] - 240;
							local227 = super.anIntArrayArrayArray22[local81][local77][local19];
							Static129.method2390(2, local77 << 7, (local79 << 7) + 128, local19 << 7, local19 << 7, local218, local227);
							for (local247 = local81; local247 <= local128; local247++) {
								for (local251 = local77; local251 <= local79; local251++) {
									super.aByteArrayArrayArray21[local247][local251][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray21[local15][local59][local19] & 0x4) != 0) {
						local77 = local59;
						local79 = local59;
						for (local81 = local19; local81 > 0 && (super.aByteArrayArrayArray21[local15][local59][local81 - 1] & 0x4) != 0; local81--) {
						}
						for (local128 = local19; super.anInt8820 > local128 && (super.aByteArrayArrayArray21[local15][local59][local128 + 1] & 0x4) != 0; local128++) {
						}
						label272: while (local77 > 0) {
							for (local132 = local81; local132 <= local128; local132++) {
								if ((super.aByteArrayArrayArray21[local15][local77 - 1][local132] & 0x4) == 0) {
									break label272;
								}
							}
							local77--;
						}
						label261: while (local79 < super.anInt8828) {
							for (local132 = local81; local132 <= local128; local132++) {
								if ((super.aByteArrayArrayArray21[local15][local79 + 1][local132] & 0x4) == 0) {
									break label261;
								}
							}
							local79++;
						}
						if ((local128 + 1 - local81) * (-local77 + local79 + 1) >= 4) {
							local132 = super.anIntArrayArrayArray22[local15][local77][local81];
							Static129.method2390(4, local77 << 7, (local79 << 7) + 128, local81 << 7, (local128 << 7) + 128, local132, local132);
							for (@Pc(710) int local710 = local77; local710 <= local79; local710++) {
								for (local218 = local81; local218 <= local128; local218++) {
									super.aByteArrayArrayArray21[local15][local710][local218] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray21 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;IIIIIIIILclient!gea;I)V")
	public void method7415(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class99 arg8, @OriginalArg(10) int arg9) {
		if (!Static281.aClass2_Sub19_Sub1_1.method2159(Static266.anInt4923) && !Static426.method6572(arg4, arg5, arg1, Static348.anInt6407)) {
			return;
		}
		if (this.anInt8834 > arg6) {
			this.anInt8834 = arg6;
		}
		@Pc(36) Class129 local36 = Static505.aClass206_4.method5326(arg7);
		if (arg0.method6024() && Static281.aClass2_Sub19_Sub1_1.aBoolean179 && local36.aBoolean295) {
			return;
		}
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (arg2 == 1 || arg2 == 3) {
			local60 = local36.anInt3653;
			local57 = local36.anInt3650;
		} else {
			local57 = local36.anInt3653;
			local60 = local36.anInt3650;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (arg4 + local57 <= super.anInt8828) {
			local85 = arg4 + (local57 >> 1);
			local94 = arg4 + (local57 + 1 >> 1);
		} else {
			local85 = arg4;
			local94 = arg4 + 1;
		}
		@Pc(119) int local119;
		@Pc(128) int local128;
		if (arg1 + local60 <= super.anInt8820) {
			local119 = (local60 >> 1) + arg1;
			local128 = arg1 + (local60 + 1 >> 1);
		} else {
			local119 = arg1;
			local128 = arg1 + 1;
		}
		@Pc(140) Class75 local140 = Static532.aClass75Array3[arg5];
		@Pc(164) int local164 = local140.ba(local85, local119) + local140.ba(local94, local119) + local140.ba(local85, local128) + local140.ba(local94, local128) >> 2;
		@Pc(172) int local172 = (local57 << 6) + (arg4 << 7);
		@Pc(180) int local180 = (local60 << 6) + (arg1 << 7);
		@Pc(192) boolean local192 = Static304.aBoolean414 && !super.aBoolean639 && local36.aBoolean283;
		if (local36.method3280()) {
			Static141.method7492(arg1, null, arg2, local36, arg6, arg4, null);
		}
		@Pc(225) boolean local225 = arg9 == -1 && local36.anInt3686 == -1 && local36.anIntArray394 == null && local36.anIntArray392 == null && !local36.aBoolean292;
		if (Static136.aBoolean216 && (Static399.method1229(arg3) && local36.anInt3651 != 1 || !(!Static133.method2417(arg3) || local36.anInt3651 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(382) Class1_Sub1 local382;
			@Pc(347) Class1_Sub1_Sub5 local347;
			@Pc(386) int local386;
			if (arg3 == 10 || arg3 == 11) {
				local347 = null;
				if (local225) {
					@Pc(378) Class1_Sub1_Sub5 local378 = new Class1_Sub1_Sub5(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, local57 + arg4 - 1, arg1, arg1 + local60 - 1, arg3, arg2, local192);
					local347 = local378;
					local382 = local378;
					local386 = local378.method4692();
				} else {
					local382 = new Class1_Sub1_Sub1(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, arg4 + local57 - 1, arg1, local60 + arg1 - 1, arg3, arg2, arg9);
					local386 = 15;
				}
				@Pc(430) Class1_Sub1 local430 = Static214.method3907(arg6, arg4, arg1, ej.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class1_Sub1_Sub6 && arg4 == local430.aShort127 && arg1 == local430.aShort128) {
					((Class1_Sub1_Sub6) local430).aClass1_Sub1_2 = local382;
					local432 = true;
				}
				if (local432 || Static58.method1076(local382, false)) {
					if (local347 != null && local347.method7684()) {
						local347.method7682(arg0);
					}
					if (local36.aBoolean287 && Static304.aBoolean414) {
						if (local386 > 30) {
							local386 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local57; local483++) {
							for (@Pc(487) int local487 = 0; local487 <= local60; local487++) {
								local140.Q(arg4 + local483, arg1 + local487, local386);
							}
						}
					}
				}
				if (local36.anInt3678 != 0 && arg8 != null) {
					arg8.method2651(local57, local36.aBoolean289, local60, !local36.aBoolean285, arg1, arg4);
				}
			} else {
				@Pc(636) Class1_Sub1 local636;
				if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
					if (local225) {
						local347 = new Class1_Sub1_Sub5(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, local57 + arg4 - 1, arg1, local60 + arg1 - 1, arg3, arg2, local192);
						local382 = local347;
						if (local347.method7684()) {
							local347.method7682(arg0);
						}
					} else {
						local382 = new Class1_Sub1_Sub1(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, arg4 + local57 - 1, arg1, arg1 + local60 - 1, arg3, arg2, arg9);
					}
					local636 = Static214.method3907(arg6, arg4, arg1, ej.class);
					if (local636 instanceof Class1_Sub1_Sub6 && local636.aShort127 == arg4 && arg1 == local636.aShort128) {
						((Class1_Sub1_Sub6) local636).aClass1_Sub1_2 = local382;
					} else {
						Static58.method1076(local382, false);
					}
					if (Static304.aBoolean414 && !super.aBoolean639 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg6 > 0 && local36.anInt3651 != 0) {
						super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x4);
					}
					if (local36.anInt3678 != 0 && arg8 != null) {
						arg8.method2651(local57, local36.aBoolean289, local60, !local36.aBoolean285, arg1, arg4);
					}
				} else {
					@Pc(765) Class1_Sub2 local765;
					if (arg3 == 0) {
						@Pc(739) int local739 = local36.anInt3651;
						if (Static532.aBoolean666 && local36.anInt3651 == -1) {
							local739 = 1;
						}
						if (local225) {
							@Pc(782) Class1_Sub2_Sub2 local782 = new Class1_Sub2_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, local192);
							if (local782.method7684()) {
								local782.method7682(arg0);
							}
							local765 = local782;
						} else {
							local765 = new Class1_Sub2_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, arg9);
						}
						@Pc(797) Class1_Sub2 local797 = Static524.method7595(arg6, arg4, arg1);
						if (local797 instanceof Class1_Sub2_Sub1) {
							((Class1_Sub2_Sub1) local797).aClass1_Sub2_1 = local765;
						} else {
							Static272.method4333(arg6, arg4, arg1, local765, null);
						}
						if (Static304.aBoolean414) {
							if (arg2 == 0) {
								if (local36.aBoolean287) {
									local140.Q(arg4, arg1, 50);
									local140.Q(arg4, arg1 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean639) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x1);
								}
							} else if (arg2 == 1) {
								if (local36.aBoolean287) {
									local140.Q(arg4, arg1 + 1, 50);
									local140.Q(arg4 + 1, arg1 - -1, 50);
								}
								if (local739 == 1 && !super.aBoolean639) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] | 0x2);
								}
							} else if (arg2 == 2) {
								if (local36.aBoolean287) {
									local140.Q(arg4 + 1, arg1, 50);
									local140.Q(arg4 + 1, arg1 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean639) {
									super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] | 0x1);
								}
							} else if (arg2 == 3) {
								if (local36.aBoolean287) {
									local140.Q(arg4, arg1, 50);
									local140.Q(arg4 + 1, arg1, 50);
								}
								if (local739 == 1 && !super.aBoolean639) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x2);
								}
							}
						}
						if (local36.anInt3678 != 0 && arg8 != null) {
							arg8.method2644(!local36.aBoolean285, arg4, arg1, local36.aBoolean289, arg3, arg2);
						}
						if (local36.anInt3687 != 16) {
							Static85.method1674(arg6, arg4, arg1, local36.anInt3687);
						}
					} else {
						@Pc(1090) Class1_Sub2_Sub2 local1090;
						@Pc(1073) Class1_Sub2 local1073;
						if (arg3 == 1) {
							if (local225) {
								local1090 = new Class1_Sub2_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, local192);
								local1073 = local1090;
								if (local1090.method7684()) {
									local1090.method7682(arg0);
								}
							} else {
								local1073 = new Class1_Sub2_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, arg9);
							}
							local765 = Static524.method7595(arg6, arg4, arg1);
							if (local765 instanceof Class1_Sub2_Sub1) {
								((Class1_Sub2_Sub1) local765).aClass1_Sub2_1 = local1073;
							} else {
								Static272.method4333(arg6, arg4, arg1, local1073, null);
							}
							if (local36.aBoolean287 && Static304.aBoolean414) {
								if (arg2 == 0) {
									local140.Q(arg4, arg1 + 1, 50);
								} else if (arg2 == 1) {
									local140.Q(arg4 + 1, arg1 - -1, 50);
								} else if (arg2 == 2) {
									local140.Q(arg4 + 1, arg1, 50);
								} else if (arg2 == 3) {
									local140.Q(arg4, arg1, 50);
								}
							}
							if (local36.anInt3678 != 0 && arg8 != null) {
								arg8.method2644(!local36.aBoolean285, arg4, arg1, local36.aBoolean289, arg3, arg2);
							}
						} else if (arg3 == 2) {
							local386 = arg2 + 1 & 0x3;
							if (local225) {
								@Pc(1263) Class1_Sub2_Sub2 local1263 = new Class1_Sub2_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2 + 4, local192);
								@Pc(1278) Class1_Sub2_Sub2 local1278 = new Class1_Sub2_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg3, local386, local192);
								if (local1263.method7684()) {
									local1263.method7682(arg0);
								}
								local1073 = local1263;
								if (local1278.method7684()) {
									local1278.method7682(arg0);
								}
								local765 = local1278;
							} else {
								local1073 = new Class1_Sub2_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2 + 4, arg9);
								local765 = new Class1_Sub2_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg3, local386, arg9);
							}
							Static272.method4333(arg6, arg4, arg1, local1073, local765);
							if (local36.anInt3651 == 1 && Static304.aBoolean414 && !super.aBoolean639) {
								if (arg2 == 0) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x1);
									super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] | 0x2);
								} else if (arg2 == 1) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1 + 1] | 0x2);
									super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] | 0x1);
								} else if (arg2 == 2) {
									super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4 + 1][arg1] | 0x1);
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x2);
								} else if (arg2 == 3) {
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x2);
									super.aByteArrayArrayArray21[arg6][arg4][arg1] = (byte) (super.aByteArrayArrayArray21[arg6][arg4][arg1] | 0x1);
								}
							}
							if (local36.anInt3678 != 0 && arg8 != null) {
								arg8.method2644(!local36.aBoolean285, arg4, arg1, local36.aBoolean289, arg3, arg2);
							}
							if (local36.anInt3687 != 16) {
								Static85.method1674(arg6, arg4, arg1, local36.anInt3687);
							}
						} else if (arg3 == 3) {
							if (local225) {
								local1090 = new Class1_Sub2_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, local192);
								if (local1090.method7684()) {
									local1090.method7682(arg0);
								}
								local1073 = local1090;
							} else {
								local1073 = new Class1_Sub2_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg3, arg2, arg9);
							}
							local765 = Static524.method7595(arg6, arg4, arg1);
							if (local765 instanceof Class1_Sub2_Sub1) {
								((Class1_Sub2_Sub1) local765).aClass1_Sub2_1 = local1073;
							} else {
								Static272.method4333(arg6, arg4, arg1, local1073, null);
							}
							if (local36.aBoolean287 && Static304.aBoolean414) {
								if (arg2 == 0) {
									local140.Q(arg4, arg1 + 1, 50);
								} else if (arg2 == 1) {
									local140.Q(arg4 + 1, arg1 - -1, 50);
								} else if (arg2 == 2) {
									local140.Q(arg4 + 1, arg1, 50);
								} else if (arg2 == 3) {
									local140.Q(arg4, arg1, 50);
								}
							}
							if (local36.anInt3678 != 0 && arg8 != null) {
								arg8.method2644(!local36.aBoolean285, arg4, arg1, local36.aBoolean289, arg3, arg2);
							}
						} else if (arg3 == 9) {
							if (local225) {
								local347 = new Class1_Sub1_Sub5(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, arg4, arg1, arg1, arg3, arg2, local192);
								if (local347.method7684()) {
									local347.method7682(arg0);
								}
								local382 = local347;
							} else {
								local382 = new Class1_Sub1_Sub1(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg4, arg4 + local57 - 1, arg1, arg1 + local60 - 1, arg3, arg2, arg9);
							}
							local636 = Static214.method3907(arg6, arg4, arg1, ej.class);
							if (local636 instanceof Class1_Sub1_Sub6 && arg4 == local636.aShort127 && local636.aShort128 == arg1) {
								((Class1_Sub1_Sub6) local636).aClass1_Sub1_2 = local382;
							} else {
								Static58.method1076(local382, false);
							}
							if (local36.anInt3678 != 0 && arg8 != null) {
								arg8.method2651(local57, local36.aBoolean289, local60, !local36.aBoolean285, arg1, arg4);
							}
							if (local36.anInt3687 != 16) {
								Static85.method1674(arg6, arg4, arg1, local36.anInt3687);
							}
						} else {
							@Pc(1840) Class1_Sub3 local1840;
							if (arg3 == 4) {
								if (local225) {
									@Pc(1859) Class1_Sub3_Sub2 local1859 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, 0, 0, 0, arg3, arg2);
									if (local1859.method7684()) {
										local1859.method7682(arg0);
									}
									local1840 = local1859;
								} else {
									local1840 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, 0, 0, 0, arg3, arg2, arg9);
								}
								@Pc(1874) Class1_Sub3 local1874 = Static55.method1029(arg6, arg4, arg1);
								if (local1874 instanceof Class1_Sub3_Sub1) {
									((Class1_Sub3_Sub1) local1874).aClass1_Sub3_1 = local1840;
								} else {
									Static255.method4007(arg6, arg4, arg1, local1840, null);
								}
							} else {
								@Pc(1896) int local1896;
								@Pc(1902) Interface6 local1902;
								@Pc(1970) Class1_Sub3_Sub2 local1970;
								@Pc(1985) Class1_Sub3 local1985;
								if (arg3 == 5) {
									local1896 = 17;
									local1902 = (Interface6) Static524.method7595(arg6, arg4, arg1);
									if (local1902 != null) {
										local1896 = Static505.aClass206_4.method5326(local1902.method7688()).anInt3687 + 1;
									}
									if (local225) {
										local1970 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, 0, local1896 * Static107.anIntArray222[arg2], local1896 * Static142.anIntArray333[arg2], arg3, arg2);
										local1840 = local1970;
										if (local1970.method7684()) {
											local1970.method7682(arg0);
										}
									} else {
										local1840 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, 0, local1896 * Static107.anIntArray222[arg2], local1896 * Static142.anIntArray333[arg2], arg3, arg2, arg9);
									}
									local1985 = Static55.method1029(arg6, arg4, arg1);
									if (local1985 instanceof Class1_Sub3_Sub1) {
										((Class1_Sub3_Sub1) local1985).aClass1_Sub3_1 = local1840;
									} else {
										Static255.method4007(arg6, arg4, arg1, local1840, null);
									}
								} else if (arg3 == 6) {
									local1896 = 9;
									local1902 = (Interface6) Static524.method7595(arg6, arg4, arg1);
									if (local1902 != null) {
										local1896 = Static505.aClass206_4.method5326(local1902.method7688()).anInt3687 / 2 + 1;
									}
									if (local225) {
										local1970 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg2, local1896 * Static107.anIntArray222[arg2], local1896 * Static142.anIntArray333[arg2], arg3, arg2 + 4);
										if (local1970.method7684()) {
											local1970.method7682(arg0);
										}
										local1840 = local1970;
									} else {
										local1840 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg2, Static25.anIntArray133[arg2] * local1896, Static460.anIntArray697[arg2] * local1896, arg3, arg2 + 4, arg9);
									}
									local1985 = Static55.method1029(arg6, arg4, arg1);
									if (local1985 instanceof Class1_Sub3_Sub1) {
										((Class1_Sub3_Sub1) local1985).aClass1_Sub3_1 = local1840;
									} else {
										Static255.method4007(arg6, arg4, arg1, local1840, null);
									}
								} else if (arg3 == 7) {
									local1896 = arg2 + 2 & 0x3;
									if (local225) {
										@Pc(2147) Class1_Sub3_Sub2 local2147 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, local1896, 0, 0, arg3, local1896 + 4);
										if (local2147.method7684()) {
											local2147.method7682(arg0);
										}
										local1840 = local2147;
									} else {
										local1840 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, local1896, 0, 0, arg3, local1896 + 4, arg9);
									}
									@Pc(2185) Class1_Sub3 local2185 = Static55.method1029(arg6, arg4, arg1);
									if (local2185 instanceof Class1_Sub3_Sub1) {
										((Class1_Sub3_Sub1) local2185).aClass1_Sub3_1 = local1840;
									} else {
										Static255.method4007(arg6, arg4, arg1, local1840, null);
									}
								} else if (arg3 == 8) {
									local386 = arg2 + 2 & 0x3;
									@Pc(2213) int local2213 = 9;
									@Pc(2219) Interface6 local2219 = (Interface6) Static524.method7595(arg6, arg4, arg1);
									if (local2219 != null) {
										local2213 = Static505.aClass206_4.method5326(local2219.method7688()).anInt3687 / 2 + 1;
									}
									@Pc(2264) Class1_Sub3 local2264;
									@Pc(2287) Class1_Sub3 local2287;
									if (local225) {
										local2264 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg2, local2213 * Static25.anIntArray133[arg2], local2213 * Static460.anIntArray697[arg2], arg3, arg2 + 4);
										local2287 = new Class1_Sub3_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg2, 0, 0, arg3, local386 + 4);
										if (local2264.method7684()) {
											local2264.method7682(arg0);
										}
										if (local2287.method7684()) {
											local2287.method7682(arg0);
										}
									} else {
										local2264 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg2, Static25.anIntArray133[arg2] * local2213, Static460.anIntArray697[arg2] * local2213, arg3, arg2 + 4, arg9);
										local2287 = new Class1_Sub3_Sub3(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg2, 0, 0, arg3, local386 + 4, arg9);
									}
									Static255.method4007(arg6, arg4, arg1, local2264, local2287);
								}
							}
						}
					}
				}
			}
		} else if (Static281.aClass2_Sub19_Sub1_1.aBoolean183 || local36.anInt3660 != 0 || local36.anInt3678 == 1 || local36.aBoolean284) {
			@Pc(281) Class1_Sub4 local281;
			if (local225) {
				@Pc(279) Class1_Sub4_Sub2 local279 = new Class1_Sub4_Sub2(arg0, local36, arg5, local172, local164, local180, super.aBoolean639, arg2, local192);
				local281 = local279;
				if (local279.method7684()) {
					local279.method7682(arg0);
				}
			} else {
				local281 = new Class1_Sub4_Sub1(arg0, local36, arg6, arg5, local172, local164, local180, super.aBoolean639, arg2, arg9);
			}
			@Pc(311) Class1_Sub4 local311 = Static427.method6584(arg6, arg4, arg1);
			if (local311 instanceof Class1_Sub4_Sub3) {
				((Class1_Sub4_Sub3) local311).aClass1_Sub4_2 = local281;
			} else {
				Static156.method2702(arg6, arg4, arg1, local281);
			}
			if (local36.anInt3678 == 1 && arg8 != null) {
				arg8.method2645(arg4, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qa;Lclient!ps;II[II)V")
	public void method7416(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class2_Sub29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (super.aBoolean639) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(24) Class142 local24 = null;
		while (true) {
			@Pc(40) int local40;
			@Pc(102) int local102;
			@Pc(106) int local106;
			@Pc(47) int local47;
			@Pc(94) int local94;
			label308: do {
				while (true) {
					@Pc(29) int local29;
					@Pc(244) int local244;
					@Pc(248) int local248;
					while (arg1.aByteArray96.length > arg1.anInt6132) {
						local29 = arg1.method5170();
						if (local29 == 0) {
							local24 = new Class142(arg1);
						} else {
							if (local29 == 1) {
								local40 = arg1.method5170();
								continue label308;
							}
							if (local29 == 2) {
								if (local24 == null) {
									local24 = new Class142();
								}
								local24.method3486(arg1);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray23 == null) {
									super.aByteArrayArrayArray23 = new byte[4][][];
								}
								for (local40 = 0; local40 < 4; local40++) {
									@Pc(201) byte local201 = arg1.method5179();
									if (local201 == 0 && super.aByteArrayArrayArray23[local40] != null) {
										local244 = arg2;
										local248 = arg2 + 64;
										local94 = arg3;
										if (arg2 < 0) {
											local244 = 0;
										} else if (super.anInt8828 <= arg2) {
											local244 = super.anInt8828;
										}
										local102 = arg3 + 64;
										if (local248 < 0) {
											local248 = 0;
										} else if (super.anInt8828 <= local248) {
											local248 = super.anInt8828;
										}
										if (arg3 < 0) {
											local94 = 0;
										} else if (super.anInt8820 <= arg3) {
											local94 = super.anInt8820;
										}
										if (local102 < 0) {
											local102 = 0;
										} else if (local102 >= super.anInt8820) {
											local102 = super.anInt8820;
										}
										while (local244 < local248) {
											while (local102 > local94) {
												super.aByteArrayArrayArray23[local40][local244][local94] = 0;
												local94++;
											}
											local244++;
										}
									} else if (local201 == 1) {
										if (super.aByteArrayArrayArray23[local40] == null) {
											super.aByteArrayArrayArray23[local40] = new byte[super.anInt8828 + 1][super.anInt8820 + 1];
										}
										for (local244 = 0; local244 < 64; local244 += 4) {
											for (local248 = 0; local248 < 64; local248 += 4) {
												@Pc(392) byte local392 = arg1.method5179();
												for (local102 = arg2 + local244; local102 < arg2 + local244 + 4; local102++) {
													for (local106 = local248 + arg3; local106 < local248 + arg3 + 4; local106++) {
														if (local102 >= 0 && local102 < super.anInt8828 && local106 >= 0 && super.anInt8820 > local106) {
															super.aByteArrayArrayArray23[local40][local102][local106] = local392;
														}
													}
												}
											}
										}
									} else if (local201 == 2) {
										if (super.aByteArrayArrayArray23[local40] == null) {
											super.aByteArrayArrayArray23[local40] = new byte[super.anInt8828 + 1][super.anInt8820 + 1];
										}
										if (local40 > 0) {
											local244 = arg2;
											local248 = arg2 + 64;
											local94 = arg3;
											local102 = arg3 + 64;
											if (arg2 < 0) {
												local244 = 0;
											} else if (super.anInt8828 <= arg2) {
												local244 = super.anInt8828;
											}
											if (arg3 < 0) {
												local94 = 0;
											} else if (super.anInt8820 <= arg3) {
												local94 = super.anInt8820;
											}
											if (local248 < 0) {
												local248 = 0;
											} else if (local248 >= super.anInt8828) {
												local248 = super.anInt8828;
											}
											if (local102 < 0) {
												local102 = 0;
											} else if (super.anInt8820 <= local102) {
												local102 = super.anInt8820;
											}
											while (local244 < local248) {
												while (local94 < local102) {
													super.aByteArrayArrayArray23[local40][local244][local94] = super.aByteArrayArrayArray23[local40 - 1][local244][local94];
													local94++;
												}
												local244++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg1.anInt6132 += 10;
							} else {
								arg4[0] = arg1.method5229();
								arg4[1] = arg1.method5231();
								arg4[2] = arg1.method5231();
								arg4[3] = arg1.method5231();
								arg4[4] = arg1.method5229();
							}
						}
					}
					if (local24 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local40 = 0; local40 < 8; local40++) {
								local47 = (arg2 >> 3) + local29;
								local244 = (arg3 >> 3) + local40;
								if (local47 >= 0 && super.anInt8828 >> 3 > local47 && local244 >= 0 && super.anInt8820 >> 3 > local244) {
									Static52.method961(local24, local47, local244);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray23 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray23[local29] != null) {
								for (local40 = 0; local40 < 16; local40++) {
									for (local47 = 0; local47 < 16; local47++) {
										local244 = local40 + (arg2 >> 2);
										local248 = (arg3 >> 2) + local47;
										if (local244 >= 0 && local244 < 26 && local248 >= 0 && local248 < 26) {
											super.aByteArrayArrayArray23[local29][local244][local248] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local40 <= 0);
			for (local47 = 0; local47 < local40; local47++) {
				@Pc(56) Class83 local56 = new Class83(arg0, arg1, 0);
				if (local56.anInt2483 == 31) {
					@Pc(69) Class33 local69 = Static129.aClass100_1.method2658(arg1.method5229());
					local56.method2370(local69.anInt1110, local69.anInt1115, local69.anInt1109, local69.anInt1118);
				}
				if (arg0.method6053() > 0) {
					@Pc(86) Class2_Sub5 local86 = local56.aClass2_Sub5_1;
					local94 = local86.method1672() + (arg2 << 7);
					local102 = local86.method1662() + (arg3 << 7);
					local106 = local94 >> 7;
					@Pc(110) int local110 = local102 >> 7;
					if (local106 >= 0 && local110 >= 0 && local106 < super.anInt8828 && local110 < super.anInt8820) {
						local86.method1667(local94, local102, super.anIntArrayArrayArray22[local56.anInt2484][local106][local110] - local86.method1671());
						Static477.method7129(local56);
					}
				}
			}
		}
	}
}
