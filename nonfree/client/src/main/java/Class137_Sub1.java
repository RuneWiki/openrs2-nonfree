import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
	public int anInt7418 = 99;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIZ)V")
	public Class137_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static240.aClass141_4, Static292.aClass152_4);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIILclient!wq;[IIILclient!ha;)V")
	public void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub36 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class100 arg9) {
		if (super.aBoolean505) {
			return;
		}
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(27) Class283 local27 = null;
		@Pc(33) int local33 = (arg0 & 0x7) * 8;
		@Pc(39) int local39 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(44) int local44;
			@Pc(145) int local145;
			@Pc(171) int local171;
			@Pc(509) int local509;
			while (arg5.aByteArray89.length > arg5.anInt8456) {
				local44 = arg5.method7291();
				if (local44 == 0) {
					local27 = new Class283(arg5);
				} else {
					@Pc(218) int local218;
					@Pc(347) int local347;
					@Pc(393) int local393;
					@Pc(177) int local177;
					if (local44 == 1) {
						local145 = arg5.method7291();
						if (local145 > 0) {
							for (local509 = 0; local509 < local145; local509++) {
								@Pc(520) Class204 local520 = new Class204(arg9, arg5, 2);
								if (local520.anInt5214 == 31) {
									@Pc(533) Class56 local533 = Static433.aClass104_1.method2584(arg5.method7333());
									local520.method4699(local533.anInt1074, local533.anInt1076, local533.anInt1072, local533.anInt1069);
								}
								if (arg9.method8635() > 0) {
									@Pc(550) Class5_Sub12 local550 = local520.aClass5_Sub12_2;
									local177 = local550.method4537() >> 9;
									local218 = local550.method4534() >> 9;
									if (local520.anInt5222 == arg2 && local177 >= local33 && local33 + 8 > local177 && local218 >= local39 && local218 < local39 + 8) {
										local347 = Static214.method8568(local550.method4534() & 0xFFF, arg1, local550.method4537() & 0xFFF) + (arg4 << 9);
										local177 = local347 >> 9;
										local393 = Static661.method9075(local550.method4534() & 0xFFF, local550.method4537() & 0xFFF, arg1) + (arg8 << 9);
										local218 = local393 >> 9;
										if (local177 >= 0 && local218 >= 0 && local177 < super.anInt7403 && super.anInt7404 > local218) {
											local550.method4529(local347, super.anIntArrayArrayArray16[arg2][local177][local218] - local550.method4533(), local393);
											Static75.method1250(local520);
										}
									}
								}
							}
						}
					} else if (local44 == 2) {
						if (local27 == null) {
							local27 = new Class283();
						}
						local27.method6391(arg5);
					} else if (local44 != 128) {
						if (local44 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local145 = 0; local145 < 4; local145++) {
							@Pc(151) byte local151 = arg5.method7318();
							@Pc(175) int local175;
							if (local151 == 0 && super.aByteArrayArrayArray18[arg7] != null) {
								if (arg2 >= local145) {
									local171 = arg4;
									local175 = arg4 + 7;
									local177 = arg8;
									if (arg8 < 0) {
										local177 = 0;
									} else if (arg8 >= super.anInt7404) {
										local177 = super.anInt7404;
									}
									if (local175 < 0) {
										local175 = 0;
									} else if (super.anInt7403 <= local175) {
										local175 = super.anInt7403;
									}
									local218 = arg8 + 7;
									if (arg4 < 0) {
										local171 = 0;
									} else if (super.anInt7403 <= arg4) {
										local171 = super.anInt7403;
									}
									if (local218 < 0) {
										local218 = 0;
									} else if (super.anInt7404 <= local218) {
										local218 = super.anInt7404;
									}
									while (local171 < local175) {
										while (local177 < local218) {
											super.aByteArrayArrayArray18[arg7][local171][local177] = 0;
											local177++;
										}
										local171++;
									}
								}
							} else if (local151 == 1) {
								if (super.aByteArrayArrayArray18[arg7] == null) {
									super.aByteArrayArrayArray18[arg7] = new byte[super.anInt7403 + 1][super.anInt7404 + 1];
								}
								for (local171 = 0; local171 < 64; local171 += 4) {
									for (local175 = 0; local175 < 64; local175 += 4) {
										@Pc(338) byte local338 = arg5.method7318();
										if (arg2 >= local145) {
											for (local218 = local171; local218 < local171 + 4; local218++) {
												for (local347 = local175; local347 < local175 + 4; local347++) {
													if (local218 >= local33 && local33 + 8 > local218 && local39 <= local347 && local39 < local39 + 8) {
														local393 = Static83.method1334(local218 & 0x7, arg1, local347 & 0x7) + arg4;
														@Pc(405) int local405 = Static128.method1922(arg1, local218 & 0x7, local347 & 0x7) + arg8;
														if (local393 >= 0 && local393 < super.anInt7403 && local405 >= 0 && local405 < super.anInt7404) {
															super.aByteArrayArrayArray18[arg7][local393][local405] = local338;
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
						arg5.anInt8456 += 10;
					} else {
						arg6[0] = arg5.method7333();
						arg6[1] = arg5.method7303();
						arg6[2] = arg5.method7303();
						arg6[3] = arg5.method7303();
						arg6[4] = arg5.method7333();
					}
				}
			}
			if (local27 != null) {
				Static144.method2625(local27, arg8 >> 3, arg4 >> 3);
			}
			if (super.aByteArrayArrayArray18 != null && super.aByteArrayArrayArray18[arg7] != null) {
				local44 = arg4 + 7;
				local145 = arg8 + 7;
				for (local509 = arg4; local509 < local44; local509++) {
					for (local171 = arg8; local171 < local145; local171++) {
						super.aByteArrayArrayArray18[arg7][local509][local171] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ha;[Lclient!ii;IIIII[BIII)V")
	public void method6463(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class169[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class5_Sub36 local15 = new Class5_Sub36(arg6);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method7295((byte) 73);
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method7306();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local15.method7291();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (arg5 == local61 && arg9 <= local57 && arg9 + 8 > local57 && local51 >= arg4 && local51 < arg4 + 8) {
					@Pc(115) Class354 local115 = Static528.aClass243_3.method5556(local17);
					@Pc(132) int local132 = Static178.method3117(arg8, local73, local57 & 0x7, local51 & 0x7, local115.anInt9385, local115.anInt9410) + arg3;
					@Pc(149) int local149 = arg7 + Static93.method1471(local73, local51 & 0x7, local115.anInt9410, local57 & 0x7, local115.anInt9385, arg8);
					if (local132 > 0 && local149 > 0 && local132 < super.anInt7403 - 1 && local149 < super.anInt7404 - 1) {
						@Pc(174) Class169 local174 = null;
						if (!super.aBoolean505) {
							@Pc(179) int local179 = arg2;
							if ((Static172.aByteArrayArrayArray23[1][local132][local149] & 0x2) == 2) {
								local179 = arg2 - 1;
							}
							if (local179 >= 0) {
								local174 = arg1[local179];
							}
						}
						this.method6468(arg0, local17, local69, local73 + arg8 & 0x3, -1, arg2, arg2, local149, local132, local174);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ha;Z)V")
	public void method6464(@OriginalArg(1) Class100 arg0, @OriginalArg(2) boolean arg1) {
		Static681.method9216();
		if (!arg1) {
			@Pc(34) int local34;
			@Pc(38) int local38;
			if (super.anInt7399 > 1) {
				for (local34 = 0; super.anInt7403 > local34; local34++) {
					for (local38 = 0; super.anInt7404 > local38; local38++) {
						if ((Static172.aByteArrayArrayArray23[1][local34][local38] & 0x2) == 2) {
							Static443.method6360(local34, local38);
						}
					}
				}
			}
			for (local34 = 0; local34 < super.anInt7399; local34++) {
				for (local38 = 0; local38 <= super.anInt7404; local38++) {
					for (@Pc(84) int local84 = 0; super.anInt7403 >= local84; local84++) {
						if ((super.aByteArrayArrayArray20[local34][local84][local38] & 0x4) != 0) {
							@Pc(101) int local101 = local84;
							@Pc(103) int local103 = local84;
							@Pc(105) int local105 = local38;
							@Pc(107) int local107 = local38;
							while (local105 > 0 && (super.aByteArrayArrayArray20[local34][local84][local105 - 1] & 0x4) != 0 && local38 - local105 < 10) {
								local105--;
							}
							while (local107 < super.anInt7404 && (super.aByteArrayArrayArray20[local34][local84][local107 + 1] & 0x4) != 0 && local107 - local105 < 10) {
								local107++;
							}
							@Pc(193) int local193;
							label111: while (local101 > 0 && local84 - local101 < 10) {
								for (local193 = local105; local193 <= local107; local193++) {
									if ((super.aByteArrayArrayArray20[local34][local101 - 1][local193] & 0x4) == 0) {
										break label111;
									}
								}
								local101--;
							}
							label98: while (super.anInt7403 > local103 && local103 - local101 < 10) {
								for (local193 = local105; local193 <= local107; local193++) {
									if ((super.aByteArrayArrayArray20[local34][local103 + 1][local193] & 0x4) == 0) {
										break label98;
									}
								}
								local103++;
							}
							if ((local107 + 1 - local105) * (local103 + 1 - local101) >= 4) {
								local193 = super.anIntArrayArrayArray16[local34][local101][local105];
								Static200.method3313((local107 << 9) + 512, local193, local105 << 9, local193, local101 << 9, (local103 << 9) + 512, local34);
								for (@Pc(352) int local352 = local101; local352 <= local103; local352++) {
									for (@Pc(356) int local356 = local105; local356 <= local107; local356++) {
										super.aByteArrayArrayArray20[local34][local352][local356] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static602.method8257();
		}
		super.aByteArrayArrayArray20 = null;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ha;[Lclient!ii;BII[B)V")
	public void method6466(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class169[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(10) Class5_Sub36 local10 = new Class5_Sub36(arg4);
		@Pc(26) int local26 = -1;
		while (true) {
			@Pc(30) int local30 = local10.method7295((byte) 112);
			if (local30 == 0) {
				return;
			}
			local26 += local30;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local10.method7306();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local10.method7291();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(83) int local83 = arg3 + local63;
				@Pc(87) int local87 = local57 + arg2;
				if (local83 > 0 && local87 > 0 && local83 < super.anInt7403 - 1 && local87 < super.anInt7404 - 1) {
					@Pc(111) Class169 local111 = null;
					if (!super.aBoolean505) {
						@Pc(116) int local116 = local67;
						if ((Static172.aByteArrayArrayArray23[1][local83][local87] & 0x2) == 2) {
							local116 = local67 - 1;
						}
						if (local116 >= 0) {
							local111 = arg1[local116];
						}
					}
					this.method6468(arg0, local26, local75, local79, -1, local67, local67, local87, local83, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!ha;Lclient!ii;I)V")
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) Class169 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface9 local11 = this.method6470(arg5, arg1, arg0, arg2);
		if (local11 == null) {
			return;
		}
		@Pc(27) Class354 local27 = Static528.aClass243_3.method5556(local11.method8364());
		@Pc(31) int local31 = local11.method8366();
		@Pc(35) int local35 = local11.method8367();
		if (local27.method8015()) {
			Static398.method5826(arg0, arg2, local27, arg1);
		}
		if (local11.method8365()) {
			local11.method8363(arg3);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				Static133.method1959(arg1, arg2, arg0);
				return;
			}
			if (arg5 == 2) {
				Static99.method1534(arg1, arg2, arg0, Static459.aClass20 == null ? (Static459.aClass20 = a("dp")) : Static459.aClass20);
				if (local27.anInt9424 != 0 && super.anInt7403 > arg2 + local27.anInt9385 && super.anInt7404 > arg0 + local27.anInt9385 && arg2 + local27.anInt9410 < super.anInt7403 && super.anInt7404 > local27.anInt9410 + arg0) {
					arg4.method3878(arg0, local27.aBoolean651, local27.anInt9410, local27.anInt9385, local35, arg2, !local27.aBoolean641);
				}
				if (local31 == 9) {
					if ((local35 & 0x1) != 0) {
						Static166.method3019(arg1, arg0, arg2, 16);
						return;
					}
					Static166.method3019(arg1, arg0, arg2, 8);
					return;
				}
			} else if (arg5 == 3) {
				Static433.method6240(arg1, arg2, arg0);
				if (local27.anInt9424 != 1) {
					return;
				}
				arg4.method3864(arg0, arg2);
			} else {
				return;
			}
			return;
		}
		Static214.method8569(arg1, arg2, arg0);
		if (local27.anInt9424 != 0) {
			arg4.method3867(arg2, local27.aBoolean651, local31, arg0, local35, !local27.aBoolean641);
		}
		if (local27.anInt9403 != 1) {
			return;
		}
		if (local35 != 0) {
			if (local35 != 1) {
				if (local35 == 2) {
					Static166.method3019(arg1, arg0, arg2 + 1, 1);
				} else if (local35 == 3) {
					Static166.method3019(arg1, arg0, arg2, 2);
					return;
				}
				return;
			}
			Static166.method3019(arg1, arg0 + 1, arg2, 2);
			return;
		}
		Static166.method3019(arg1, arg0, arg2, 1);
		return;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLclient!ha;IIIIIIIILclient!ii;)V")
	public void method6468(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class169 arg9) {
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0 && !Static62.method1063(arg6, Static8.anInt112, arg7, arg8)) {
			return;
		}
		if (arg5 < this.anInt7418) {
			this.anInt7418 = arg5;
		}
		@Pc(45) Class354 local45 = Static528.aClass243_3.method5556(arg1);
		if (Static577.aClass5_Sub19_25.aClass17_Sub21_1.method6983() == 0 && local45.aBoolean642) {
			return;
		}
		@Pc(73) int local73;
		@Pc(76) int local76;
		if (arg3 == 1 || arg3 == 3) {
			local73 = local45.anInt9410;
			local76 = local45.anInt9385;
		} else {
			local73 = local45.anInt9385;
			local76 = local45.anInt9410;
		}
		@Pc(96) int local96;
		@Pc(94) int local94;
		if (local73 + arg8 > super.anInt7403) {
			local94 = arg8 + 1;
			local96 = arg8;
		} else {
			local96 = arg8 + (local73 >> 1);
			local94 = arg8 + (local73 + 1 >> 1);
		}
		@Pc(137) int local137;
		@Pc(131) int local131;
		if (local76 + arg7 <= super.anInt7404) {
			local131 = (local76 + 1 >> 1) + arg7;
			local137 = arg7 + (local76 >> 1);
		} else {
			local131 = arg7 + 1;
			local137 = arg7;
		}
		@Pc(149) Class84 local149 = Static177.aClass84Array2[arg6];
		@Pc(176) int local176 = local149.method7620(local137, local96) + local149.method7620(local137, local94) + local149.method7620(local131, local96) + local149.method7620(local131, local94) >> 2;
		@Pc(184) int local184 = (local73 << 8) + (arg8 << 9);
		@Pc(192) int local192 = (local76 << 8) + (arg7 << 9);
		@Pc(209) boolean local209 = Static587.aBoolean666 && !super.aBoolean505 && local45.aBoolean652;
		if (local45.method8015()) {
			Static114.method1694((Class4_Sub1_Sub1_Sub2_Sub2) null, local45, arg3, arg5, arg8, (Class4_Sub1_Sub1_Sub2_Sub1) null, arg7);
		}
		@Pc(260) boolean local260 = arg4 == -1 && local45.anInt9422 == -1 && local45.anIntArray523 == null && local45.anIntArray526 == null && !local45.aBoolean646 && !local45.aBoolean653;
		if (Static623.aBoolean698 && (Static670.method5525(arg2) && local45.anInt9403 != 1 || !(!Static612.method8397(arg2) || local45.anInt9403 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(437) Class4_Sub1_Sub1 local437;
			@Pc(406) Class4_Sub1_Sub1_Sub1 local406;
			@Pc(439) int local439;
			@Pc(516) int local516;
			if (arg2 == 10 || arg2 == 11) {
				local406 = null;
				if (local260) {
					@Pc(470) Class4_Sub1_Sub1_Sub1 local470 = new Class4_Sub1_Sub1_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, arg8 + local73 - 1, arg7, local76 + arg7 - 1, arg2, arg3, local209);
					local437 = local470;
					local406 = local470;
					local439 = local470.method3472();
				} else {
					local437 = new Class4_Sub1_Sub1_Sub3(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, local73 + arg8 - 1, arg7, arg7 + local76 - 1, arg2, arg3, arg4);
					local439 = 15;
				}
				if (Static686.method2955(local437, false)) {
					if (local406 != null && local406.method8365()) {
						local406.method8361(arg0);
					}
					if (local45.aBoolean644 && Static587.aBoolean666) {
						if (local439 > 30) {
							local439 = 30;
						}
						for (local516 = 0; local516 <= local73; local516++) {
							for (@Pc(520) int local520 = 0; local520 <= local76; local520++) {
								local149.ka(arg8 + local516, local520 + arg7, local439);
							}
						}
					}
				}
				if (local45.anInt9424 != 0 && arg9 != null) {
					arg9.method3871(arg8, local76, !local45.aBoolean641, arg7, local45.aBoolean651, local73);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local260) {
					local406 = new Class4_Sub1_Sub1_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, arg8 + local73 - 1, arg7, arg7 + local76 - 1, arg2, arg3, local209);
					local437 = local406;
					if (local406.method8365()) {
						local406.method8361(arg0);
					}
				} else {
					local437 = new Class4_Sub1_Sub1_Sub3(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, local73 + arg8 - 1, arg7, arg7 + local76 - 1, arg2, arg3, arg4);
				}
				Static686.method2955(local437, false);
				if (Static587.aBoolean666 && !super.aBoolean505 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg5 > 0 && local45.anInt9403 != 0) {
					super.aByteArrayArrayArray20[arg5][arg8][arg7] = (byte) (super.aByteArrayArrayArray20[arg5][arg8][arg7] | 0x4);
				}
				if (local45.anInt9424 != 0 && arg9 != null) {
					arg9.method3871(arg8, local76, !local45.aBoolean641, arg7, local45.aBoolean651, local73);
				}
			} else {
				@Pc(800) Class4_Sub1_Sub2 local800;
				if (arg2 == 0) {
					@Pc(772) int local772 = local45.anInt9403;
					if (Static619.aBoolean699 && local45.anInt9403 == -1) {
						local772 = 1;
					}
					if (local260) {
						@Pc(818) Class4_Sub1_Sub2_Sub1 local818 = new Class4_Sub1_Sub2_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, local209);
						local800 = local818;
						if (local818.method8365()) {
							local818.method8361(arg0);
						}
					} else {
						local800 = new Class4_Sub1_Sub2_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, arg4);
					}
					Static319.method4899(arg5, arg8, arg7, local800, (Class4_Sub1_Sub2) null);
					if (arg3 == 0) {
						if (Static587.aBoolean666 && local45.aBoolean644) {
							local149.ka(arg8, arg7, 50);
							local149.ka(arg8, arg7 + 1, 50);
						}
						if (local772 == 1 && !super.aBoolean505) {
							Static296.method4672(arg7, local45.anInt9376, 1, arg8, arg5, local45.anInt9373);
						}
					} else if (arg3 == 1) {
						if (Static587.aBoolean666 && local45.aBoolean644) {
							local149.ka(arg8, arg7 + 1, 50);
							local149.ka(arg8 + 1, arg7 + 1, 50);
						}
						if (local772 == 1 && !super.aBoolean505) {
							Static296.method4672(arg7 + 1, -local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
						}
					} else if (arg3 == 2) {
						if (Static587.aBoolean666 && local45.aBoolean644) {
							local149.ka(arg8 + 1, arg7, 50);
							local149.ka(arg8 + 1, arg7 + 1, 50);
						}
						if (local772 == 1 && !super.aBoolean505) {
							Static296.method4672(arg7, -local45.anInt9376, 1, arg8 + 1, arg5, local45.anInt9373);
						}
					} else if (arg3 == 3) {
						if (Static587.aBoolean666 && local45.aBoolean644) {
							local149.ka(arg8, arg7, 50);
							local149.ka(arg8 + 1, arg7, 50);
						}
						if (local772 == 1 && !super.aBoolean505) {
							Static296.method4672(arg7, local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
						}
					}
					if (local45.anInt9424 != 0 && arg9 != null) {
						arg9.method3876(arg3, local45.aBoolean651, !local45.aBoolean641, arg2, arg7, arg8);
					}
					if (local45.anInt9381 != 64) {
						Static409.method5963(arg5, arg8, arg7, local45.anInt9381);
					}
				} else {
					@Pc(1122) Class4_Sub1_Sub2 local1122;
					@Pc(1140) Class4_Sub1_Sub2_Sub1 local1140;
					if (arg2 == 1) {
						if (local260) {
							local1140 = new Class4_Sub1_Sub2_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, local209);
							local1122 = local1140;
							if (local1140.method8365()) {
								local1140.method8361(arg0);
							}
						} else {
							local1122 = new Class4_Sub1_Sub2_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, arg4);
						}
						Static319.method4899(arg5, arg8, arg7, local1122, (Class4_Sub1_Sub2) null);
						if (local45.aBoolean644 && Static587.aBoolean666) {
							if (arg3 == 0) {
								local149.ka(arg8, arg7 + 1, 50);
							} else if (arg3 == 1) {
								local149.ka(arg8 + 1, arg7 + 1, 50);
							} else if (arg3 == 2) {
								local149.ka(arg8 + 1, arg7, 50);
							} else if (arg3 == 3) {
								local149.ka(arg8, arg7, 50);
							}
						}
						if (local45.anInt9424 != 0 && arg9 != null) {
							arg9.method3876(arg3, local45.aBoolean651, !local45.aBoolean641, arg2, arg7, arg8);
						}
					} else if (arg2 == 2) {
						local439 = arg3 + 1 & 0x3;
						if (local260) {
							@Pc(1326) Class4_Sub1_Sub2_Sub1 local1326 = new Class4_Sub1_Sub2_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3 + 4, local209);
							@Pc(1342) Class4_Sub1_Sub2_Sub1 local1342 = new Class4_Sub1_Sub2_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, local439, local209);
							if (local1326.method8365()) {
								local1326.method8361(arg0);
							}
							local1122 = local1326;
							if (local1342.method8365()) {
								local1342.method8361(arg0);
							}
							local800 = local1342;
						} else {
							local1122 = new Class4_Sub1_Sub2_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3 + 4, arg4);
							local800 = new Class4_Sub1_Sub2_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, local439, arg4);
						}
						Static319.method4899(arg5, arg8, arg7, local1122, local800);
						if ((local45.anInt9403 == 1 || Static619.aBoolean699 && local45.anInt9403 == -1) && !super.aBoolean505) {
							if (arg3 == 0) {
								Static296.method4672(arg7, local45.anInt9376, 1, arg8, arg5, local45.anInt9373);
								Static296.method4672(arg7 + 1, local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
							} else if (arg3 == 1) {
								Static296.method4672(arg7, local45.anInt9376, 1, arg8 + 1, arg5, local45.anInt9373);
								Static296.method4672(arg7 + 1, local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
							} else if (arg3 == 2) {
								Static296.method4672(arg7, local45.anInt9376, 1, arg8 + 1, arg5, local45.anInt9373);
								Static296.method4672(arg7, local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
							} else if (arg3 == 3) {
								Static296.method4672(arg7, local45.anInt9376, 1, arg8, arg5, local45.anInt9373);
								Static296.method4672(arg7, local45.anInt9376, 2, arg8, arg5, local45.anInt9373);
							}
						}
						if (local45.anInt9424 != 0 && arg9 != null) {
							arg9.method3876(arg3, local45.aBoolean651, !local45.aBoolean641, arg2, arg7, arg8);
						}
						if (local45.anInt9381 != 64) {
							Static409.method5963(arg5, arg8, arg7, local45.anInt9381);
						}
					} else if (arg2 == 3) {
						if (local260) {
							local1140 = new Class4_Sub1_Sub2_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, local209);
							local1122 = local1140;
							if (local1140.method8365()) {
								local1140.method8361(arg0);
							}
						} else {
							local1122 = new Class4_Sub1_Sub2_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg2, arg3, arg4);
						}
						Static319.method4899(arg5, arg8, arg7, local1122, (Class4_Sub1_Sub2) null);
						if (local45.aBoolean644 && Static587.aBoolean666) {
							if (arg3 == 0) {
								local149.ka(arg8, arg7 + 1, 50);
							} else if (arg3 == 1) {
								local149.ka(arg8 + 1, arg7 - -1, 50);
							} else if (arg3 == 2) {
								local149.ka(arg8 + 1, arg7, 50);
							} else if (arg3 == 3) {
								local149.ka(arg8, arg7, 50);
							}
						}
						if (local45.anInt9424 != 0 && arg9 != null) {
							arg9.method3876(arg3, local45.aBoolean651, !local45.aBoolean641, arg2, arg7, arg8);
						}
					} else if (arg2 == 9) {
						if (local260) {
							local406 = new Class4_Sub1_Sub1_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, arg8, arg7, arg7, arg2, arg3, local209);
							if (local406.method8365()) {
								local406.method8361(arg0);
							}
							local437 = local406;
						} else {
							local437 = new Class4_Sub1_Sub1_Sub3(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg8, arg8 + local73 - 1, arg7, local76 + arg7 - 1, arg2, arg3, arg4);
						}
						Static686.method2955(local437, false);
						if (local45.anInt9403 == 1 && !super.aBoolean505) {
							@Pc(1812) byte local1812;
							if ((arg3 & 0x1) == 0) {
								local1812 = 8;
							} else {
								local1812 = 16;
							}
							Static296.method4672(arg7, 0, local1812, arg8, arg5, local45.anInt9373);
						}
						if (local45.anInt9424 != 0 && arg9 != null) {
							arg9.method3871(arg8, local76, !local45.aBoolean641, arg7, local45.aBoolean651, local73);
						}
						if (local45.anInt9381 != 64) {
							Static409.method5963(arg5, arg8, arg7, local45.anInt9381);
						}
					} else {
						@Pc(1891) Class4_Sub1_Sub5 local1891;
						if (arg2 == 4) {
							if (local260) {
								@Pc(1910) Class4_Sub1_Sub5_Sub1 local1910 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, arg3);
								if (local1910.method8365()) {
									local1910.method8361(arg0);
								}
								local1891 = local1910;
							} else {
								local1891 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, arg3, arg4);
							}
							Static65.method1083(arg5, arg8, arg7, local1891, (Class4_Sub1_Sub5) null);
						} else {
							@Pc(1936) int local1936;
							@Pc(1942) Interface9 local1942;
							@Pc(1981) Class4_Sub1_Sub5_Sub1 local1981;
							if (arg2 == 5) {
								local1936 = 65;
								local1942 = (Interface9) Static142.method6599(arg5, arg8, arg7);
								if (local1942 != null) {
									local1936 = Static528.aClass243_3.method5556(local1942.method8364()).anInt9381 + 1;
								}
								if (local260) {
									local1981 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, Static203.anIntArray174[arg3] * local1936, local1936 * Static632.anIntArray585[arg3], arg2, arg3);
									if (local1981.method8365()) {
										local1981.method8361(arg0);
									}
									local1891 = local1981;
								} else {
									local1891 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, Static203.anIntArray174[arg3] * local1936, local1936 * Static632.anIntArray585[arg3], arg2, arg3, arg4);
								}
								Static65.method1083(arg5, arg8, arg7, local1891, (Class4_Sub1_Sub5) null);
							} else if (arg2 == 6) {
								local1936 = 33;
								local1942 = (Interface9) Static142.method6599(arg5, arg8, arg7);
								if (local1942 != null) {
									local1936 = Static528.aClass243_3.method5556(local1942.method8364()).anInt9381 / 2 + 1;
								}
								if (local260) {
									local1981 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, local1936 * Static203.anIntArray174[arg3], Static632.anIntArray585[arg3] * local1936, arg2, arg3 + 4);
									local1891 = local1981;
									if (local1981.method8365()) {
										local1981.method8361(arg0);
									}
								} else {
									local1891 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, local1936 * Static19.anIntArray28[arg3], local1936 * Static228.anIntArray194[arg3], arg2, arg3 + 4, arg4);
								}
								Static65.method1083(arg5, arg8, arg7, local1891, (Class4_Sub1_Sub5) null);
							} else if (arg2 == 7) {
								local1936 = arg3 + 2 & 0x3;
								if (local260) {
									@Pc(2165) Class4_Sub1_Sub5_Sub1 local2165 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, local1936 + 4);
									if (local2165.method8365()) {
										local2165.method8361(arg0);
									}
									local1891 = local2165;
								} else {
									local1891 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, local1936 + 4, arg4);
								}
								Static65.method1083(arg5, arg8, arg7, local1891, (Class4_Sub1_Sub5) null);
							} else if (arg2 == 8) {
								local439 = arg3 + 2 & 0x3;
								local516 = 33;
								@Pc(2225) Interface9 local2225 = (Interface9) Static142.method6599(arg5, arg8, arg7);
								if (local2225 != null) {
									local516 = Static528.aClass243_3.method5556(local2225.method8364()).anInt9381 / 2 + 1;
								}
								@Pc(2268) Class4_Sub1_Sub5 local2268;
								@Pc(2287) Class4_Sub1_Sub5 local2287;
								if (local260) {
									local2268 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, Static19.anIntArray28[arg3] * local516, Static228.anIntArray194[arg3] * local516, arg2, arg3 + 4);
									local2287 = new Class4_Sub1_Sub5_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, local439 + 4);
									if (local2268.method8365()) {
										local2268.method8361(arg0);
									}
									if (local2287.method8365()) {
										local2287.method8361(arg0);
									}
								} else {
									local2268 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, Static19.anIntArray28[arg3] * local516, local516 * Static228.anIntArray194[arg3], arg2, arg3 + 4, arg4);
									local2287 = new Class4_Sub1_Sub5_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, 0, 0, arg2, local439 + 4, arg4);
								}
								Static65.method1083(arg5, arg8, arg7, local2268, local2287);
							}
						}
					}
				}
			}
		} else if (Static577.aClass5_Sub19_25.aClass17_Sub16_1.method5290() != 0 || local45.anInt9386 != 0 || local45.anInt9424 == 1 || local45.aBoolean650) {
			@Pc(354) Class4_Sub1_Sub3 local354;
			if (local260) {
				@Pc(342) Class4_Sub1_Sub3_Sub2 local342 = new Class4_Sub1_Sub3_Sub2(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg3, local209);
				if (local342.method8365()) {
					local342.method8361(arg0);
				}
				local354 = local342;
			} else {
				local354 = new Class4_Sub1_Sub3_Sub1(arg0, local45, arg5, arg6, local184, local176, local192, super.aBoolean505, arg3, arg4);
			}
			Static641.method8834(arg5, arg8, arg7, local354);
			if (local45.anInt9424 == 1 && arg9 != null) {
				arg9.method3880(arg7, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!wq;[ILclient!ha;BI)V")
	public void method6469(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean505) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) Class283 local14 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		while (true) {
			@Pc(49) int local49;
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(56) int local56;
			@Pc(105) int local105;
			label307: do {
				while (true) {
					@Pc(35) int local35;
					@Pc(277) int local277;
					@Pc(281) int local281;
					while (arg1.anInt8456 < arg1.aByteArray89.length) {
						local35 = arg1.method7291();
						if (local35 == 0) {
							local14 = new Class283(arg1);
						} else {
							if (local35 == 1) {
								local49 = arg1.method7291();
								continue label307;
							}
							if (local35 == 2) {
								if (local14 == null) {
									local14 = new Class283();
								}
								local14.method6391(arg1);
							} else if (local35 != 128) {
								if (local35 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray18 == null) {
									super.aByteArrayArrayArray18 = new byte[4][][];
								}
								for (local49 = 0; local49 < 4; local49++) {
									@Pc(230) byte local230 = arg1.method7318();
									if (local230 == 0 && super.aByteArrayArrayArray18[local49] != null) {
										local277 = arg0;
										local281 = arg0 + 64;
										local105 = arg4;
										if (arg4 < 0) {
											local105 = 0;
										} else if (arg4 >= super.anInt7404) {
											local105 = super.anInt7404;
										}
										local113 = arg4 + 64;
										if (arg0 < 0) {
											local277 = 0;
										} else if (arg0 >= super.anInt7403) {
											local277 = super.anInt7403;
										}
										if (local281 < 0) {
											local281 = 0;
										} else if (local281 >= super.anInt7403) {
											local281 = super.anInt7403;
										}
										if (local113 < 0) {
											local113 = 0;
										} else if (local113 >= super.anInt7404) {
											local113 = super.anInt7404;
										}
										while (local277 < local281) {
											while (local113 > local105) {
												super.aByteArrayArrayArray18[local49][local277][local105] = 0;
												local105++;
											}
											local277++;
										}
									} else if (local230 == 1) {
										if (super.aByteArrayArrayArray18[local49] == null) {
											super.aByteArrayArrayArray18[local49] = new byte[super.anInt7403 + 1][super.anInt7404 + 1];
										}
										for (local277 = 0; local277 < 64; local277 += 4) {
											for (local281 = 0; local281 < 64; local281 += 4) {
												@Pc(439) byte local439 = arg1.method7318();
												for (local113 = local277 + arg0; local113 < local277 + arg0 + 4; local113++) {
													for (local117 = arg4 + local281; local117 < local281 + arg4 + 4; local117++) {
														if (local113 >= 0 && super.anInt7403 > local113 && local117 >= 0 && local117 < super.anInt7404) {
															super.aByteArrayArrayArray18[local49][local113][local117] = local439;
														}
													}
												}
											}
										}
									} else if (local230 == 2) {
										if (super.aByteArrayArrayArray18[local49] == null) {
											super.aByteArrayArrayArray18[local49] = new byte[super.anInt7403 + 1][super.anInt7404 + 1];
										}
										if (local49 > 0) {
											local277 = arg0;
											local281 = arg0 + 64;
											local105 = arg4;
											local113 = arg4 + 64;
											if (arg0 < 0) {
												local277 = 0;
											} else if (super.anInt7403 <= arg0) {
												local277 = super.anInt7403;
											}
											if (local281 < 0) {
												local281 = 0;
											} else if (super.anInt7403 <= local281) {
												local281 = super.anInt7403;
											}
											if (arg4 < 0) {
												local105 = 0;
											} else if (arg4 >= super.anInt7404) {
												local105 = super.anInt7404;
											}
											if (local113 < 0) {
												local113 = 0;
											} else if (local113 >= super.anInt7404) {
												local113 = super.anInt7404;
											}
											while (local281 > local277) {
												while (local105 < local113) {
													super.aByteArrayArrayArray18[local49][local277][local105] = super.aByteArrayArrayArray18[local49 - 1][local277][local105];
													local105++;
												}
												local277++;
											}
										}
									}
								}
								local12 = true;
							} else if (arg2 == null) {
								arg1.anInt8456 += 10;
							} else {
								arg2[0] = arg1.method7333();
								arg2[1] = arg1.method7303();
								arg2[2] = arg1.method7303();
								arg2[3] = arg1.method7303();
								arg2[4] = arg1.method7333();
							}
						}
					}
					if (local14 != null) {
						for (local35 = 0; local35 < 8; local35++) {
							for (local49 = 0; local49 < 8; local49++) {
								local56 = local35 + (arg0 >> 3);
								local277 = local49 + (arg4 >> 3);
								if (local56 >= 0 && local56 < super.anInt7403 >> 3 && local277 >= 0 && super.anInt7404 >> 3 > local277) {
									Static144.method2625(local14, local277, local56);
								}
							}
						}
					}
					if (!local12 && super.aByteArrayArrayArray18 != null) {
						for (local35 = 0; local35 < 4; local35++) {
							if (super.aByteArrayArrayArray18[local35] != null) {
								for (local49 = 0; local49 < 16; local49++) {
									for (local56 = 0; local56 < 16; local56++) {
										local277 = (arg0 >> 2) + local49;
										local281 = local56 + (arg4 >> 2);
										if (local277 >= 0 && local277 < 26 && local281 >= 0 && local281 < 26) {
											super.aByteArrayArrayArray18[local35][local277][local281] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local49 <= 0);
			for (local56 = 0; local56 < local49; local56++) {
				@Pc(65) Class204 local65 = new Class204(arg3, arg1, 2);
				if (local65.anInt5214 == 31) {
					@Pc(76) Class56 local76 = Static433.aClass104_1.method2584(arg1.method7333());
					local65.method4699(local76.anInt1074, local76.anInt1076, local76.anInt1072, local76.anInt1069);
				}
				if (arg3.method8635() > 0) {
					@Pc(96) Class5_Sub12 local96 = local65.aClass5_Sub12_2;
					local105 = local96.method4537() + (arg0 << 9);
					local113 = (arg4 << 9) + local96.method4534();
					local117 = local105 >> 9;
					@Pc(121) int local121 = local113 >> 9;
					if (local117 >= 0 && local121 >= 0 && super.anInt7403 > local117 && local121 < super.anInt7404) {
						local96.method4529(local105, super.anIntArrayArrayArray16[local65.anInt5222][local117][local121] - local96.method4533(), local113);
						Static75.method1250(local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIII)Lclient!dp;")
	public Interface9 method6470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface9 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface9) Static142.method6599(arg1, arg3, arg2);
		}
		if (arg0 == 1) {
			local5 = (Interface9) Static427.method6188(arg1, arg3, arg2);
		}
		if (arg0 == 2) {
			local5 = (Interface9) Static367.method5340(arg1, arg3, arg2, Static459.aClass20 == null ? (Static459.aClass20 = a("dp")) : Static459.aClass20);
		}
		if (arg0 == 3) {
			local5 = (Interface9) Static254.method4181(arg1, arg3, arg2);
		}
		return local5;
	}
}
