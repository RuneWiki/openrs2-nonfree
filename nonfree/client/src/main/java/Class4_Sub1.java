import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	public int anInt822 = 99;

	static {
		new Class175(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIZ)V")
	public Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static149.aClass71_4, Static89.aClass252_3);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!qa;)V")
	public void method753(@OriginalArg(1) Class75 arg0) {
		Static260.method5439(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt808 > 1) {
			for (local15 = 0; super.anInt804 > local15; local15++) {
				for (local19 = 0; super.anInt798 > local19; local19++) {
					if ((Static325.aByteArrayArrayArray15[1][local15][local19] & 0x2) == 2) {
						Static200.method3251(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; local15 < super.anInt808; local15++) {
			for (local19 = 0; local19 <= super.anInt798; local19++) {
				for (@Pc(61) int local61 = 0; local61 <= super.anInt804; local61++) {
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(83) int local83;
					@Pc(85) int local85;
					@Pc(131) int local131;
					@Pc(223) int local223;
					@Pc(232) int local232;
					@Pc(252) int local252;
					@Pc(256) int local256;
					if ((super.aByteArrayArrayArray11[local15][local61][local19] & 0x1) != 0) {
						local79 = local19;
						local81 = local19;
						local83 = local15;
						local85 = local15;
						while (super.anInt798 > local81 && (super.aByteArrayArrayArray11[local15][local61][local81 + 1] & 0x1) != 0) {
							local81++;
						}
						while (local79 > 0 && (super.aByteArrayArrayArray11[local15][local61][local79 - 1] & 0x1) != 0) {
							local79--;
						}
						label164: while (local83 > 0) {
							for (local131 = local79; local131 <= local81; local131++) {
								if ((super.aByteArrayArrayArray11[local83 - 1][local61][local131] & 0x1) == 0) {
									break label164;
								}
							}
							local83--;
						}
						label153: while (local85 < 3) {
							for (local131 = local79; local131 <= local81; local131++) {
								if ((super.aByteArrayArrayArray11[local85 + 1][local61][local131] & 0x1) == 0) {
									break label153;
								}
							}
							local85++;
						}
						local131 = (local81 + 1 - local79) * ((local85 + 1) - local83);
						if (local131 >= 2) {
							local223 = super.anIntArrayArrayArray2[local85][local61][local79] - 240;
							local232 = super.anIntArrayArrayArray2[local83][local61][local79];
							Static154.method2723(1, local61 << 7, local61 << 7, local79 << 7, (local81 << 7) + 128, local223, local232);
							for (local252 = local83; local252 <= local85; local252++) {
								for (local256 = local79; local256 <= local81; local256++) {
									super.aByteArrayArrayArray11[local252][local61][local256] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local15][local61][local19] & 0x2) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local15;
						while (local79 > 0 && (super.aByteArrayArrayArray11[local15][local79 - 1][local19] & 0x2) != 0) {
							local79--;
						}
						while (local81 < super.anInt804 && (super.aByteArrayArrayArray11[local15][local81 + 1][local19] & 0x2) != 0) {
							local81++;
						}
						local85 = local15;
						label217: while (local83 > 0) {
							for (local131 = local79; local131 <= local81; local131++) {
								if ((super.aByteArrayArrayArray11[local83 - 1][local131][local19] & 0x2) == 0) {
									break label217;
								}
							}
							local83--;
						}
						label206: while (local85 < 3) {
							for (local131 = local79; local131 <= local81; local131++) {
								if ((super.aByteArrayArrayArray11[local85 + 1][local131][local19] & 0x2) == 0) {
									break label206;
								}
							}
							local85++;
						}
						local131 = (local85 + 1 - local83) * ((local81 + 1) - local79);
						if (local131 >= 2) {
							local223 = super.anIntArrayArrayArray2[local85][local79][local19] - 240;
							local232 = super.anIntArrayArrayArray2[local83][local79][local19];
							Static154.method2723(2, local79 << 7, (local81 << 7) + 128, local19 << 7, local19 << 7, local223, local232);
							for (local252 = local83; local252 <= local85; local252++) {
								for (local256 = local79; local256 <= local81; local256++) {
									super.aByteArrayArrayArray11[local252][local256][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local15][local61][local19] & 0x4) != 0) {
						local79 = local61;
						local81 = local61;
						local83 = local19;
						local85 = local19;
						while (local83 > 0 && (super.aByteArrayArrayArray11[local15][local61][local83 - 1] & 0x4) != 0) {
							local83--;
						}
						while (local85 < super.anInt798 && (super.aByteArrayArrayArray11[local15][local61][local85 + 1] & 0x4) != 0) {
							local85++;
						}
						label271: while (local79 > 0) {
							for (local131 = local83; local131 <= local85; local131++) {
								if ((super.aByteArrayArrayArray11[local15][local79 - 1][local131] & 0x4) == 0) {
									break label271;
								}
							}
							local79--;
						}
						label260: while (super.anInt804 > local81) {
							for (local131 = local83; local131 <= local85; local131++) {
								if ((super.aByteArrayArrayArray11[local15][local81 + 1][local131] & 0x4) == 0) {
									break label260;
								}
							}
							local81++;
						}
						if ((local85 + 1 - local83) * (-local79 + (local81 - -1)) >= 4) {
							local131 = super.anIntArrayArrayArray2[local15][local79][local83];
							Static154.method2723(4, local79 << 7, (local81 << 7) + 128, local83 << 7, (local85 << 7) + 128, local131, local131);
							for (@Pc(699) int local699 = local79; local699 <= local81; local699++) {
								for (local223 = local83; local223 <= local85; local223++) {
									super.aByteArrayArrayArray11[local15][local699][local223] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([IILclient!bt;ILclient!qa;I)V")
	public void method754(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean46) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class14 local19 = null;
		while (true) {
			@Pc(27) int local27;
			@Pc(78) int local78;
			@Pc(117) int local117;
			@Pc(121) int local121;
			@Pc(498) int local498;
			while (arg1.aByteArray95.length > arg1.anInt7620) {
				local27 = arg1.method6053();
				if (local27 == 0) {
					local19 = new Class14(arg1);
				} else {
					@Pc(243) int local243;
					@Pc(131) int local131;
					@Pc(138) int local138;
					if (local27 == 1) {
						local78 = arg1.method6053();
						if (local78 > 0) {
							for (local498 = 0; local498 < local78; local498++) {
								@Pc(507) Class54 local507 = new Class54(arg3, arg1, 0);
								if (local507.anInt1653 == 31) {
									@Pc(518) Class228 local518 = Static85.aClass246_41.method5631(arg1.method6004());
									local507.method1357(local518.anInt6777, local518.anInt6778, local518.anInt6782, local518.anInt6780);
								}
								if (arg3.method2584() > 0) {
									@Pc(538) Class3_Sub23 local538 = local507.aClass3_Sub23_1;
									local243 = (arg2 << 7) + local538.method3679();
									local131 = (arg4 << 7) + local538.method3678();
									local138 = local243 >> 7;
									@Pc(562) int local562 = local131 >> 7;
									if (local138 >= 0 && local562 >= 0 && local138 < super.anInt804 && super.anInt798 > local562) {
										local538.method3681(local243, local131, super.anIntArrayArrayArray2[local507.anInt1656][local138][local562] - local538.method3675());
										if (arg3.method2584() > 0) {
											Static37.method887(local507);
										}
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local19 == null) {
							local19 = new Class14();
						}
						local19.method541(arg1);
					} else if (local27 != 128) {
						if (local27 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray8 == null) {
							super.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local78 = 0; local78 < 4; local78++) {
							@Pc(84) byte local84 = arg1.method6011();
							if (local84 == 0 && super.aByteArrayArrayArray8[local78] != null) {
								local117 = arg2;
								local121 = arg2 + 64;
								local243 = arg4;
								local131 = arg4 + 64;
								if (arg2 < 0) {
									local117 = 0;
								} else if (super.anInt804 <= arg2) {
									local117 = super.anInt804;
								}
								if (local121 < 0) {
									local121 = 0;
								} else if (local121 >= super.anInt804) {
									local121 = super.anInt804;
								}
								if (arg4 < 0) {
									local243 = 0;
								} else if (super.anInt798 <= arg4) {
									local243 = super.anInt798;
								}
								if (local131 < 0) {
									local131 = 0;
								} else if (local131 >= super.anInt798) {
									local131 = super.anInt798;
								}
								while (local117 < local121) {
									while (local243 < local131) {
										super.aByteArrayArrayArray8[local78][local117][local243] = 0;
										local243++;
									}
									local117++;
								}
							} else if (local84 == 1) {
								if (super.aByteArrayArrayArray8[local78] == null) {
									super.aByteArrayArrayArray8[local78] = new byte[super.anInt804 + 1][super.anInt798 + 1];
								}
								for (local117 = 0; local117 < 64; local117 += 4) {
									for (local121 = 0; local121 < 64; local121 += 4) {
										@Pc(127) byte local127 = arg1.method6011();
										for (local131 = arg2 + local117; local131 < arg2 + local117 + 4; local131++) {
											for (local138 = local121 + arg4; local138 < local121 + arg4 + 4; local138++) {
												if (local131 >= 0 && local131 < super.anInt804 && local138 >= 0 && super.anInt798 > local138) {
													super.aByteArrayArrayArray8[local78][local131][local138] = local127;
												}
											}
										}
									}
								}
							} else if (local84 == 2) {
								if (super.aByteArrayArrayArray8[local78] == null) {
									super.aByteArrayArrayArray8[local78] = new byte[super.anInt804 + 1][super.anInt798 + 1];
								}
								if (local78 > 0) {
									local117 = arg2;
									local121 = arg2 + 64;
									local243 = arg4;
									if (arg4 < 0) {
										local243 = 0;
									} else if (super.anInt798 <= arg4) {
										local243 = super.anInt798;
									}
									if (local121 < 0) {
										local121 = 0;
									} else if (super.anInt804 <= local121) {
										local121 = super.anInt804;
									}
									if (arg2 < 0) {
										local117 = 0;
									} else if (arg2 >= super.anInt804) {
										local117 = super.anInt804;
									}
									local131 = arg4 + 64;
									if (local131 < 0) {
										local131 = 0;
									} else if (local131 >= super.anInt798) {
										local131 = super.anInt798;
									}
									while (local117 < local121) {
										while (local131 > local243) {
											super.aByteArrayArrayArray8[local78][local117][local243] = super.aByteArrayArrayArray8[local78 - 1][local117][local243];
											local243++;
										}
										local117++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg0 == null) {
						arg1.anInt7620 += 10;
					} else {
						arg0[0] = arg1.method6004();
						arg0[1] = arg1.method6039();
						arg0[2] = arg1.method6039();
						arg0[3] = arg1.method6039();
						arg0[4] = arg1.method6004();
					}
				}
			}
			if (local19 != null) {
				for (local27 = 0; local27 < 8; local27++) {
					for (local78 = 0; local78 < 8; local78++) {
						local498 = local27 + (arg2 >> 3);
						local117 = (arg4 >> 3) + local78;
						if (local498 >= 0 && local498 < super.anInt804 >> 3 && local117 >= 0 && local117 < super.anInt798 >> 3) {
							Static435.method5758(local117, local19, local498);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray8 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (super.aByteArrayArrayArray8[local27] != null) {
						for (local78 = 0; local78 < 16; local78++) {
							for (local498 = 0; local498 < 16; local498++) {
								local117 = local78 + (arg2 >> 2);
								local121 = (arg4 >> 2) + local498;
								if (local117 >= 0 && local117 < 26 && local121 >= 0 && local121 < 26) {
									super.aByteArrayArrayArray8[local27][local117][local121] = 0;
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

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!qa;[BB[Lclient!bm;)V")
	public void method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) Class23[] arg4) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg3);
		@Pc(19) int local19 = -1;
		while (true) {
			@Pc(23) int local23 = local10.method6037();
			if (local23 == 0) {
				return;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local10.method6040();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local10.method6053();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg1 + local53;
				@Pc(77) int local77 = arg0 + local47;
				if (local73 > 0 && local77 > 0 && local73 < super.anInt804 - 1 && local77 < super.anInt798 - 1) {
					@Pc(95) Class23 local95 = null;
					if (!super.aBoolean46) {
						@Pc(100) int local100 = local57;
						if ((Static325.aByteArrayArrayArray15[1][local73][local77] & 0x2) == 2) {
							local100 = local57 - 1;
						}
						if (local100 >= 0) {
							local95 = arg4[local100];
						}
					}
					this.method756(local57, local57, local65, local19, arg2, local77, local69, -1, local95, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILclient!qa;IIILclient!bm;BI)V")
	public void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class75 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class23 arg8, @OriginalArg(10) int arg9) {
		if (!Static123.aClass21_Sub1_1.method787(Static347.anInt6318) && !Static352.method4307(arg5, Static367.anInt6555, arg9, arg1)) {
			return;
		}
		if (arg0 < this.anInt822) {
			this.anInt822 = arg0;
		}
		@Pc(30) Class128 local30 = Static55.aClass25_1.method855(arg3);
		if (arg4.method2635() && Static123.aClass21_Sub1_1.aBoolean67 && local30.aBoolean312) {
			return;
		}
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg6 == 1 || arg6 == 3) {
			local63 = local30.anInt4036;
			local66 = local30.anInt4004;
		} else {
			local63 = local30.anInt4004;
			local66 = local30.anInt4036;
		}
		@Pc(90) int local90;
		@Pc(98) int local98;
		if (arg9 + local63 <= super.anInt804) {
			local90 = (local63 >> 1) + arg9;
			local98 = (local63 + 1 >> 1) + arg9;
		} else {
			local90 = arg9;
			local98 = arg9 + 1;
		}
		@Pc(113) int local113;
		@Pc(117) int local117;
		if (super.anInt798 < local66 + arg5) {
			local113 = arg5;
			local117 = arg5 + 1;
		} else {
			local117 = (local66 + 1 >> 1) + arg5;
			local113 = (local66 >> 1) + arg5;
		}
		@Pc(136) Class64 local136 = Static120.aClass64Array1[arg1];
		@Pc(158) int local158 = local136.I(local90, local113) + local136.I(local98, local113) + local136.I(local90, local117) + local136.I(local98, local117) >> 2;
		@Pc(167) int local167 = (arg9 << 7) + (local63 << 6);
		@Pc(175) int local175 = (local66 << 6) + (arg5 << 7);
		@Pc(187) boolean local187 = Static158.aBoolean260 && !super.aBoolean46 && local30.aBoolean311;
		if (local30.method3299()) {
			Static301.method4446(local30, null, null, arg9, arg6, arg0, arg5);
		}
		@Pc(224) boolean local224 = arg7 == -1 && local30.anInt4033 == -1 && local30.anIntArray306 == null && local30.anIntArray307 == null && !local30.aBoolean319;
		if (Static10.aBoolean16 && (Static70.method1311(arg2) && local30.anInt4021 != 1 || !(!Static436.method5785(arg2) || local30.anInt4021 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(379) Class1_Sub3 local379;
			@Pc(349) Class1_Sub3_Sub2 local349;
			@Pc(381) int local381;
			if (arg2 == 10 || arg2 == 11) {
				local349 = null;
				if (local224) {
					@Pc(411) Class1_Sub3_Sub2 local411 = new Class1_Sub3_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, arg9 + local63 - 1, arg5, arg5 + local66 - 1, arg2, arg6, local187);
					local379 = local411;
					local381 = local411.method1521();
					local349 = local411;
				} else {
					local379 = new Class1_Sub3_Sub6(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, local63 + arg9 - 1, arg5, local66 + arg5 - 1, arg2, arg6, arg7);
					local381 = 15;
				}
				@Pc(432) Class1_Sub3 local432 = Static372.method1267(arg0, arg9, arg5, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
				@Pc(434) boolean local434 = false;
				if (local432 instanceof Class1_Sub3_Sub1 && arg9 == local432.aShort181 && arg5 == local432.aShort179) {
					local434 = true;
					((Class1_Sub3_Sub1) local432).aClass1_Sub3_1 = local379;
				}
				if (local434 || Static199.method3242(local379, false)) {
					if (local349 != null && local349.method5852()) {
						local349.method5853(arg4);
					}
					if (local30.aBoolean310 && Static158.aBoolean260) {
						if (local381 > 30) {
							local381 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local63; local483++) {
							for (@Pc(486) int local486 = 0; local486 <= local66; local486++) {
								local136.QA(local483 + arg9, arg5 - -local486, local381);
							}
						}
					}
				}
				if (local30.anInt4039 != 0 && arg8 != null) {
					arg8.method829(arg5, !local30.aBoolean318, arg9, local30.aBoolean316, local63, local66);
				}
			} else {
				@Pc(635) Class1_Sub3 local635;
				if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
					if (local224) {
						local349 = new Class1_Sub3_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, arg9 + local63 - 1, arg5, local66 + arg5 - 1, arg2, arg6, local187);
						if (local349.method5852()) {
							local349.method5853(arg4);
						}
						local379 = local349;
					} else {
						local379 = new Class1_Sub3_Sub6(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, local63 + arg9 - 1, arg5, arg5 + local66 - 1, arg2, arg6, arg7);
					}
					local635 = Static372.method1267(arg0, arg9, arg5, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
					if (local635 instanceof Class1_Sub3_Sub1 && local635.aShort181 == arg9 && local635.aShort179 == arg5) {
						((Class1_Sub3_Sub1) local635).aClass1_Sub3_1 = local379;
					} else {
						Static199.method3242(local379, false);
					}
					if (Static158.aBoolean260 && !super.aBoolean46 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0 && local30.anInt4021 != 0) {
						super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x4);
					}
					if (local30.anInt4039 != 0 && arg8 != null) {
						arg8.method829(arg5, !local30.aBoolean318, arg9, local30.aBoolean316, local63, local66);
					}
				} else {
					@Pc(771) Class1_Sub5 local771;
					if (arg2 == 0) {
						@Pc(733) int local733 = local30.anInt4021;
						if (Static163.aBoolean271 && local30.anInt4021 == -1) {
							local733 = 1;
						}
						if (local224) {
							@Pc(759) Class1_Sub5_Sub3 local759 = new Class1_Sub5_Sub3(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, local187);
							if (local759.method5852()) {
								local759.method5853(arg4);
							}
							local771 = local759;
						} else {
							local771 = new Class1_Sub5_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, arg7);
						}
						@Pc(793) Class1_Sub5 local793 = Static391.method5292(arg0, arg9, arg5);
						if (local793 instanceof Class1_Sub5_Sub1) {
							((Class1_Sub5_Sub1) local793).aClass1_Sub5_1 = local771;
						} else {
							Static224.method3531(arg0, arg9, arg5, local771, null);
						}
						if (Static158.aBoolean260) {
							if (arg6 == 0) {
								if (local30.aBoolean310) {
									local136.QA(arg9, arg5, 50);
									local136.QA(arg9, arg5 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean46) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x1);
								}
							} else if (arg6 == 1) {
								if (local30.aBoolean310) {
									local136.QA(arg9, arg5 + 1, 50);
									local136.QA(arg9 + 1, arg5 - -1, 50);
								}
								if (local733 == 1 && !super.aBoolean46) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] | 0x2);
								}
							} else if (arg6 == 2) {
								if (local30.aBoolean310) {
									local136.QA(arg9 + 1, arg5, 50);
									local136.QA(arg9 + 1, arg5 - -1, 50);
								}
								if (local733 == 1 && !super.aBoolean46) {
									super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] | 0x1);
								}
							} else if (arg6 == 3) {
								if (local30.aBoolean310) {
									local136.QA(arg9, arg5, 50);
									local136.QA(arg9 + 1, arg5, 50);
								}
								if (local733 == 1 && !super.aBoolean46) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x2);
								}
							}
						}
						if (local30.anInt4039 != 0 && arg8 != null) {
							arg8.method834(!local30.aBoolean318, arg9, arg6, local30.aBoolean316, arg5, arg2);
						}
						if (local30.anInt4042 != 16) {
							Static330.method4791(arg0, arg9, arg5, local30.anInt4042);
						}
					} else {
						@Pc(1077) Class1_Sub5_Sub3 local1077;
						@Pc(1061) Class1_Sub5 local1061;
						if (arg2 == 1) {
							if (local224) {
								local1077 = new Class1_Sub5_Sub3(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, local187);
								if (local1077.method5852()) {
									local1077.method5853(arg4);
								}
								local1061 = local1077;
							} else {
								local1061 = new Class1_Sub5_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, arg7);
							}
							local771 = Static391.method5292(arg0, arg9, arg5);
							if (local771 instanceof Class1_Sub5_Sub1) {
								((Class1_Sub5_Sub1) local771).aClass1_Sub5_1 = local1061;
							} else {
								Static224.method3531(arg0, arg9, arg5, local1061, null);
							}
							if (local30.aBoolean310 && Static158.aBoolean260) {
								if (arg6 == 0) {
									local136.QA(arg9, arg5 + 1, 50);
								} else if (arg6 == 1) {
									local136.QA(arg9 + 1, arg5 + 1, 50);
								} else if (arg6 == 2) {
									local136.QA(arg9 + 1, arg5, 50);
								} else if (arg6 == 3) {
									local136.QA(arg9, arg5, 50);
								}
							}
							if (local30.anInt4039 != 0 && arg8 != null) {
								arg8.method834(!local30.aBoolean318, arg9, arg6, local30.aBoolean316, arg5, arg2);
							}
						} else if (arg2 == 2) {
							local381 = arg6 + 1 & 0x3;
							if (local224) {
								@Pc(1213) Class1_Sub5_Sub3 local1213 = new Class1_Sub5_Sub3(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6 + 4, local187);
								@Pc(1228) Class1_Sub5_Sub3 local1228 = new Class1_Sub5_Sub3(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg2, local381, local187);
								if (local1213.method5852()) {
									local1213.method5853(arg4);
								}
								local1061 = local1213;
								local771 = local1228;
								if (local1228.method5852()) {
									local1228.method5853(arg4);
								}
							} else {
								local1061 = new Class1_Sub5_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6 + 4, arg7);
								local771 = new Class1_Sub5_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg2, local381, arg7);
							}
							Static224.method3531(arg0, arg9, arg5, local1061, local771);
							if (local30.anInt4021 == 1 && Static158.aBoolean260 && !super.aBoolean46) {
								if (arg6 == 0) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x1);
									super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] | 0x2);
								} else if (arg6 == 1) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] | 0x1);
								} else if (arg6 == 2) {
									super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x2);
								} else if (arg6 == 3) {
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x2);
									super.aByteArrayArrayArray11[arg0][arg9][arg5] = (byte) (super.aByteArrayArrayArray11[arg0][arg9][arg5] | 0x1);
								}
							}
							if (local30.anInt4039 != 0 && arg8 != null) {
								arg8.method834(!local30.aBoolean318, arg9, arg6, local30.aBoolean316, arg5, arg2);
							}
							if (local30.anInt4042 != 16) {
								Static330.method4791(arg0, arg9, arg5, local30.anInt4042);
							}
						} else if (arg2 == 3) {
							if (local224) {
								local1077 = new Class1_Sub5_Sub3(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, local187);
								if (local1077.method5852()) {
									local1077.method5853(arg4);
								}
								local1061 = local1077;
							} else {
								local1061 = new Class1_Sub5_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg2, arg6, arg7);
							}
							local771 = Static391.method5292(arg0, arg9, arg5);
							if (local771 instanceof Class1_Sub5_Sub1) {
								((Class1_Sub5_Sub1) local771).aClass1_Sub5_1 = local1061;
							} else {
								Static224.method3531(arg0, arg9, arg5, local1061, null);
							}
							if (local30.aBoolean310 && Static158.aBoolean260) {
								if (arg6 == 0) {
									local136.QA(arg9, arg5 + 1, 50);
								} else if (arg6 == 1) {
									local136.QA(arg9 + 1, arg5 + 1, 50);
								} else if (arg6 == 2) {
									local136.QA(arg9 + 1, arg5, 50);
								} else if (arg6 == 3) {
									local136.QA(arg9, arg5, 50);
								}
							}
							if (local30.anInt4039 != 0 && arg8 != null) {
								arg8.method834(!local30.aBoolean318, arg9, arg6, local30.aBoolean316, arg5, arg2);
							}
						} else if (arg2 == 9) {
							if (local224) {
								local349 = new Class1_Sub3_Sub2(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, arg9, arg5, arg5, arg2, arg6, local187);
								local379 = local349;
								if (local349.method5852()) {
									local349.method5853(arg4);
								}
							} else {
								local379 = new Class1_Sub3_Sub6(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg9, arg9 + local63 - 1, arg5, arg5 + local66 - 1, arg2, arg6, arg7);
							}
							local635 = Static372.method1267(arg0, arg9, arg5, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
							if (local635 instanceof Class1_Sub3_Sub1 && arg9 == local635.aShort181 && local635.aShort179 == arg5) {
								((Class1_Sub3_Sub1) local635).aClass1_Sub3_1 = local379;
							} else {
								Static199.method3242(local379, false);
							}
							if (local30.anInt4039 != 0 && arg8 != null) {
								arg8.method829(arg5, !local30.aBoolean318, arg9, local30.aBoolean316, local63, local66);
							}
							if (local30.anInt4042 != 16) {
								Static330.method4791(arg0, arg9, arg5, local30.anInt4042);
							}
						} else {
							@Pc(1816) Class1_Sub1 local1816;
							if (arg2 == 4) {
								if (local224) {
									@Pc(1834) Class1_Sub1_Sub1 local1834 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, 0, 0, 0, arg2, arg6);
									if (local1834.method5852()) {
										local1834.method5853(arg4);
									}
									local1816 = local1834;
								} else {
									local1816 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, 0, 0, 0, arg2, arg6, arg7);
								}
								@Pc(1849) Class1_Sub1 local1849 = Static35.method4618(arg0, arg9, arg5);
								if (local1849 instanceof Class1_Sub1_Sub2) {
									((Class1_Sub1_Sub2) local1849).aClass1_Sub1_1 = local1816;
								} else {
									Static265.method3995(arg0, arg9, arg5, local1816, null);
								}
							} else {
								@Pc(1871) int local1871;
								@Pc(1877) Interface12 local1877;
								@Pc(1944) Class1_Sub1_Sub1 local1944;
								@Pc(1959) Class1_Sub1 local1959;
								if (arg2 == 5) {
									local1871 = 17;
									local1877 = (Interface12) Static391.method5292(arg0, arg9, arg5);
									if (local1877 != null) {
										local1871 = Static55.aClass25_1.method855(local1877.method5847()).anInt4042 + 1;
									}
									if (local224) {
										local1944 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, 0, local1871 * Static120.anIntArray218[arg6], Static131.anIntArray231[arg6] * local1871, arg2, arg6);
										local1816 = local1944;
										if (local1944.method5852()) {
											local1944.method5853(arg4);
										}
									} else {
										local1816 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, 0, Static120.anIntArray218[arg6] * local1871, Static131.anIntArray231[arg6] * local1871, arg2, arg6, arg7);
									}
									local1959 = Static35.method4618(arg0, arg9, arg5);
									if (local1959 instanceof Class1_Sub1_Sub2) {
										((Class1_Sub1_Sub2) local1959).aClass1_Sub1_1 = local1816;
									} else {
										Static265.method3995(arg0, arg9, arg5, local1816, null);
									}
								} else if (arg2 == 6) {
									local1871 = 9;
									local1877 = (Interface12) Static391.method5292(arg0, arg9, arg5);
									if (local1877 != null) {
										local1871 = Static55.aClass25_1.method855(local1877.method5847()).anInt4042 / 2 + 1;
									}
									if (local224) {
										local1944 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg6, Static120.anIntArray218[arg6] * local1871, Static131.anIntArray231[arg6] * local1871, arg2, arg6 + 4);
										local1816 = local1944;
										if (local1944.method5852()) {
											local1944.method5853(arg4);
										}
									} else {
										local1816 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg6, Static206.anIntArray312[arg6] * local1871, local1871 * Static199.anIntArray302[arg6], arg2, arg6 + 4, arg7);
									}
									local1959 = Static35.method4618(arg0, arg9, arg5);
									if (local1959 instanceof Class1_Sub1_Sub2) {
										((Class1_Sub1_Sub2) local1959).aClass1_Sub1_1 = local1816;
									} else {
										Static265.method3995(arg0, arg9, arg5, local1816, null);
									}
								} else if (arg2 == 7) {
									local1871 = arg6 + 2 & 0x3;
									if (local224) {
										@Pc(2146) Class1_Sub1_Sub1 local2146 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, local1871, 0, 0, arg2, local1871 + 4);
										local1816 = local2146;
										if (local2146.method5852()) {
											local2146.method5853(arg4);
										}
									} else {
										local1816 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, local1871, 0, 0, arg2, local1871 + 4, arg7);
									}
									@Pc(2161) Class1_Sub1 local2161 = Static35.method4618(arg0, arg9, arg5);
									if (local2161 instanceof Class1_Sub1_Sub2) {
										((Class1_Sub1_Sub2) local2161).aClass1_Sub1_1 = local1816;
									} else {
										Static265.method3995(arg0, arg9, arg5, local1816, null);
									}
								} else if (arg2 == 8) {
									local381 = arg6 + 2 & 0x3;
									@Pc(2189) int local2189 = 9;
									@Pc(2195) Interface12 local2195 = (Interface12) Static391.method5292(arg0, arg9, arg5);
									if (local2195 != null) {
										local2189 = Static55.aClass25_1.method855(local2195.method5847()).anInt4042 / 2 + 1;
									}
									@Pc(2244) Class1_Sub1 local2244;
									@Pc(2265) Class1_Sub1 local2265;
									if (local224) {
										local2244 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg6, local2189 * Static206.anIntArray312[arg6], local2189 * Static199.anIntArray302[arg6], arg2, arg6 + 4);
										local2265 = new Class1_Sub1_Sub1(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg6, 0, 0, arg2, local381 + 4);
										if (local2244.method5852()) {
											local2244.method5853(arg4);
										}
										if (local2265.method5852()) {
											local2265.method5853(arg4);
										}
									} else {
										local2244 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg6, Static206.anIntArray312[arg6] * local2189, Static199.anIntArray302[arg6] * local2189, arg2, arg6 + 4, arg7);
										local2265 = new Class1_Sub1_Sub3(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg6, 0, 0, arg2, local381 + 4, arg7);
									}
									Static265.method3995(arg0, arg9, arg5, local2244, local2265);
								}
							}
						}
					}
				}
			}
		} else if (Static123.aClass21_Sub1_1.aBoolean65 || local30.anInt4009 != 0 || local30.anInt4039 == 1 || local30.aBoolean322) {
			@Pc(284) Class1_Sub2 local284;
			if (local224) {
				@Pc(299) Class1_Sub2_Sub2 local299 = new Class1_Sub2_Sub2(arg4, local30, arg1, local167, local158, local175, super.aBoolean46, arg6, local187);
				if (local299.method5852()) {
					local299.method5853(arg4);
				}
				local284 = local299;
			} else {
				local284 = new Class1_Sub2_Sub1(arg4, local30, arg0, arg1, local167, local158, local175, super.aBoolean46, arg6, arg7);
			}
			@Pc(314) Class1_Sub2 local314 = Static11.method399(arg0, arg9, arg5);
			if (local314 instanceof Class1_Sub2_Sub3) {
				((Class1_Sub2_Sub3) local314).aClass1_Sub2_2 = local284;
			} else {
				Static205.method3371(arg0, arg9, arg5, local284);
			}
			if (local30.anInt4039 == 1 && arg8 != null) {
				arg8.method828(arg5, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!bt;Lclient!qa;IIIIIII[I)V")
	public void method757(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean46) {
			return;
		}
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(19) Class14 local19 = null;
		@Pc(25) int local25 = (arg6 & 0x7) * 8;
		@Pc(31) int local31 = (arg8 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(61) int local61;
			@Pc(300) int local300;
			@Pc(68) int local68;
			while (arg0.aByteArray95.length > arg0.anInt7620) {
				local41 = arg0.method6053();
				if (local41 == 0) {
					local19 = new Class14(arg0);
				} else {
					@Pc(122) int local122;
					@Pc(173) int local173;
					@Pc(191) int local191;
					@Pc(116) int local116;
					if (local41 == 1) {
						local61 = arg0.method6053();
						if (local61 > 0) {
							for (local68 = 0; local68 < local61; local68++) {
								@Pc(77) Class54 local77 = new Class54(arg1, arg0, 0);
								if (local77.anInt1653 == 31) {
									@Pc(90) Class228 local90 = Static85.aClass246_41.method5631(arg0.method6004());
									local77.method1357(local90.anInt6777, local90.anInt6778, local90.anInt6782, local90.anInt6780);
								}
								if (arg1.method2584() > 0) {
									@Pc(110) Class3_Sub23 local110 = local77.aClass3_Sub23_1;
									local116 = local110.method3679() >> 7;
									local122 = local110.method3678() >> 7;
									if (local77.anInt1656 == arg4 && local116 >= local25 && local116 < local25 + 8 && local31 <= local122 && local122 < local31 + 8) {
										local173 = (arg7 << 7) + Static65.method5203(arg2, local110.method3678() & 0x3FF, local110.method3679() & 0x3FF);
										local191 = Static393.method5309(local110.method3678() & 0x3FF, arg2, local110.method3679() & 0x3FF) + (arg5 << 7);
										local116 = local173 >> 7;
										local122 = local191 >> 7;
										if (local116 >= 0 && local122 >= 0 && super.anInt804 > local116 && super.anInt798 > local122) {
											local110.method3681(local173, local191, super.anIntArrayArrayArray2[arg4][local116][local122] - local110.method3675());
											if (arg1.method2584() > 0) {
												Static37.method887(local77);
											}
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local19 == null) {
							local19 = new Class14();
						}
						local19.method541(arg0);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray8 == null) {
							super.aByteArrayArrayArray8 = new byte[4][][];
						}
						for (local61 = 0; local61 < 4; local61++) {
							@Pc(284) byte local284 = arg0.method6011();
							@Pc(304) int local304;
							if (local284 == 0 && super.aByteArrayArrayArray8[arg3] != null) {
								if (arg4 >= local61) {
									local300 = arg7;
									local304 = arg7 + 7;
									local116 = arg5;
									if (local304 < 0) {
										local304 = 0;
									} else if (super.anInt804 <= local304) {
										local304 = super.anInt804;
									}
									if (arg5 < 0) {
										local116 = 0;
									} else if (super.anInt798 <= arg5) {
										local116 = super.anInt798;
									}
									local122 = arg5 + 7;
									if (arg7 < 0) {
										local300 = 0;
									} else if (arg7 >= super.anInt804) {
										local300 = super.anInt804;
									}
									if (local122 < 0) {
										local122 = 0;
									} else if (super.anInt798 <= local122) {
										local122 = super.anInt798;
									}
									while (local300 < local304) {
										while (local116 < local122) {
											super.aByteArrayArrayArray8[arg3][local300][local116] = 0;
											local116++;
										}
										local300++;
									}
								}
							} else if (local284 == 1) {
								if (super.aByteArrayArrayArray8[arg3] == null) {
									super.aByteArrayArrayArray8[arg3] = new byte[super.anInt804 + 1][super.anInt798 + 1];
								}
								for (local300 = 0; local300 < 64; local300 += 4) {
									for (local304 = 0; local304 < 64; local304 += 4) {
										@Pc(435) byte local435 = arg0.method6011();
										if (local61 <= arg4) {
											for (local122 = local300; local122 < local300 + 4; local122++) {
												for (local173 = local304; local173 < local304 + 4; local173++) {
													if (local25 <= local122 && local122 < local25 + 8 && local31 <= local173 && local31 < local31 + 8) {
														local191 = arg7 + Static201.method3293(local122 & 0x7, arg2, local173 & 0x7);
														@Pc(500) int local500 = arg5 + Static421.method3673(arg2, local122 & 0x7, local173 & 0x7);
														if (local191 >= 0 && super.anInt804 > local191 && local500 >= 0 && local500 < super.anInt798) {
															super.aByteArrayArrayArray8[arg3][local191][local500] = local435;
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
						arg0.anInt7620 += 10;
					} else {
						arg9[0] = arg0.method6004();
						arg9[1] = arg0.method6039();
						arg9[2] = arg0.method6039();
						arg9[3] = arg0.method6039();
						arg9[4] = arg0.method6004();
					}
				}
			}
			if (local19 != null) {
				Static435.method5758(arg5 >> 3, local19, arg7 >> 3);
			}
			if (super.aByteArrayArrayArray8 != null && super.aByteArrayArrayArray8[arg3] != null) {
				local41 = arg7 + 7;
				local61 = arg5 + 7;
				for (local68 = arg7; local68 < local41; local68++) {
					for (local300 = arg5; local300 < local61; local300++) {
						super.aByteArrayArrayArray8[arg3][local68][local300] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[BLclient!qa;III[Lclient!bm;III)V")
	public void method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class23[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method6037();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method6040();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method6053();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg0 == local54 && local50 >= arg4 && local50 < arg4 + 8 && local44 >= arg5 && local44 < arg5 + 8) {
					@Pc(98) Class128 local98 = Static55.aClass25_1.method855(local16);
					@Pc(117) int local117 = Static248.method3801(local66, local44 & 0x7, arg8, local50 & 0x7, local98.anInt4036, local98.anInt4004) + arg9;
					@Pc(135) int local135 = arg1 + Static233.method3661(local44 & 0x7, local98.anInt4004, local50 & 0x7, local98.anInt4036, local66, arg8);
					if (local117 > 0 && local135 > 0 && local117 < super.anInt804 - 1 && super.anInt798 - 1 > local135) {
						@Pc(157) Class23 local157 = null;
						if (!super.aBoolean46) {
							@Pc(162) int local162 = arg7;
							if ((Static325.aByteArrayArrayArray15[1][local117][local135] & 0x2) == 2) {
								local162 = arg7 - 1;
							}
							if (local162 >= 0) {
								local157 = arg6[local162];
							}
						}
						this.method756(arg7, arg7, local62, local16, arg3, local135, local66 + arg8 & 0x3, -1, local157, local117);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!qa;IIIILclient!bm;I)V")
	public void method759(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class23 arg5) {
		@Pc(5) Interface12 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface12) Static391.method5292(arg4, arg2, arg3);
		}
		if (arg1 == 1) {
			local5 = (Interface12) Static35.method4618(arg4, arg2, arg3);
		}
		if (arg1 == 2) {
			local5 = (Interface12) Static372.method1267(arg4, arg2, arg3, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
		}
		if (arg1 == 3) {
			local5 = (Interface12) Static11.method399(arg4, arg2, arg3);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) Class128 local64 = Static55.aClass25_1.method855(local5.method5847());
		@Pc(68) int local68 = local5.method5848();
		@Pc(72) int local72 = local5.method5851();
		if (local64.method3299()) {
			Static163.method2867(local64, arg4, arg3, arg2);
		}
		if (local5.method5852()) {
			local5.method5854(arg0);
		}
		if (arg1 == 0) {
			@Pc(100) Class1_Sub5 local100 = Static391.method5292(arg4, arg2, arg3);
			if (local100 instanceof Class1_Sub5_Sub1) {
				((Class1_Sub5_Sub1) local100).aClass1_Sub5_1 = null;
			} else {
				Static413.method3225(arg4, arg2, arg3);
			}
			if (local64.anInt4039 != 0) {
				arg5.method822(local68, local72, arg2, arg3, local64.aBoolean316, !local64.aBoolean318);
				return;
			}
			return;
		}
		if (arg1 == 1) {
			@Pc(141) Class1_Sub1 local141 = Static35.method4618(arg4, arg2, arg3);
			if (local141 instanceof Class1_Sub1_Sub2) {
				((Class1_Sub1_Sub2) local141).aClass1_Sub1_1 = null;
				return;
			}
			Static19.method563(arg4, arg2, arg3);
			return;
		}
		if (arg1 != 2) {
			if (arg1 == 3) {
				@Pc(167) Class1_Sub2 local167 = Static11.method399(arg4, arg2, arg3);
				if (local167 instanceof Class1_Sub2_Sub3) {
					((Class1_Sub2_Sub3) local167).aClass1_Sub2_2 = null;
				} else {
					Static347.method4972(arg4, arg2, arg3);
				}
				if (local64.anInt4039 == 1) {
					arg5.method821(arg2, arg3);
					return;
				}
			}
			return;
		}
		@Pc(204) Class1_Sub3 local204 = Static372.method1267(arg4, arg2, arg3, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
		if (local204 instanceof Class1_Sub3_Sub1 && arg2 == local204.aShort181 && local204.aShort179 == arg3) {
			((Class1_Sub3_Sub1) local204).aClass1_Sub3_1 = null;
		} else {
			Static182.method3086(arg4, arg2, arg3, Static30.aClass1 == null ? (Static30.aClass1 = Class4.a("wk")) : Static30.aClass1);
		}
		if (local64.anInt4039 != 0 && super.anInt804 > local64.anInt4004 + arg2 && super.anInt798 > local64.anInt4004 + arg3 && super.anInt804 > local64.anInt4036 + arg2 && super.anInt798 > local64.anInt4036 + arg3) {
			arg5.method836(local64.anInt4004, arg2, local64.anInt4036, arg3, local64.aBoolean316, !local64.aBoolean318, local72);
			return;
		}
	}
}
