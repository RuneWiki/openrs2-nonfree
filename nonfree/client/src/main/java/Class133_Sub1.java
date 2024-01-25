import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
	public int anInt3978 = 99;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIZ)V")
	public Class133_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static313.aClass126_5, Static14.aClass233_1);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZLclient!pe;IILclient!oj;I)V")
	public void method3473(@OriginalArg(0) int arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class48 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface8 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface8) Static94.method1598(arg2, arg5, arg3);
		}
		if (arg0 == 1) {
			local7 = (Interface8) Static204.method3744(arg2, arg5, arg3);
		}
		if (arg0 == 2) {
			local7 = (Interface8) Static278.method4615(arg2, arg5, arg3, td.class);
		}
		if (arg0 == 3) {
			local7 = (Interface8) Static266.method4518(arg2, arg5, arg3);
		}
		if (local7 == null) {
			return;
		}
		@Pc(73) Class47 local73 = Static230.aClass96_4.method2303(local7.method6034());
		@Pc(77) int local77 = local7.method6027();
		@Pc(81) int local81 = local7.method6031();
		if (local73.method904()) {
			Static335.method5404(arg3, local73, arg5, arg2);
		}
		if (local7.method6033()) {
			local7.method6032(arg4);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(114) Class1_Sub3 local114 = Static204.method3744(arg2, arg5, arg3);
				if (!(local114 instanceof Class1_Sub3_Sub2)) {
					Static288.method4746(arg2, arg5, arg3);
					return;
				}
				((Class1_Sub3_Sub2) local114).aClass1_Sub3_1 = null;
				return;
			}
			if (arg0 == 2) {
				@Pc(143) Class1_Sub2 local143 = Static278.method4615(arg2, arg5, arg3, td.class);
				if (local143 instanceof Class1_Sub2_Sub3 && arg5 == local143.aShort95 && arg3 == local143.aShort96) {
					((Class1_Sub2_Sub3) local143).aClass1_Sub2_2 = null;
				} else {
					Static135.method2359(arg2, arg5, arg3, td.class);
				}
				if (local73.anInt1263 != 0 && super.anInt3952 > arg5 + local73.anInt1247 && arg3 + local73.anInt1247 < super.anInt3969 && super.anInt3952 > arg5 + local73.anInt1241 && local73.anInt1241 + arg3 < super.anInt3969) {
					arg1.method4479(!local73.aBoolean104, local81, arg5, local73.anInt1241, local73.anInt1247, arg3, local73.aBoolean95);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(253) Class1_Sub1 local253 = Static266.method4518(arg2, arg5, arg3);
				if (local253 instanceof Class1_Sub1_Sub3) {
					((Class1_Sub1_Sub3) local253).aClass1_Sub1_1 = null;
				} else {
					Static319.method5150(arg2, arg5, arg3);
				}
				if (local73.anInt1263 != 1) {
					return;
				}
				arg1.method4486(arg3, arg5);
			} else {
				return;
			}
			return;
		}
		@Pc(283) Class1_Sub5 local283 = Static94.method1598(arg2, arg5, arg3);
		if (local283 instanceof Class1_Sub5_Sub2) {
			((Class1_Sub5_Sub2) local283).aClass1_Sub5_3 = null;
		} else {
			Static306.method5014(arg2, arg5, arg3);
		}
		if (local73.anInt1263 != 0) {
			arg1.method4480(local81, local73.aBoolean95, arg3, arg5, local77, !local73.aBoolean104);
			return;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLclient!oj;)V")
	public void method3475(@OriginalArg(1) Class48 arg0) {
		Static370.method4291(arg0);
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (super.anInt3960 > 1) {
			for (local29 = 0; local29 < super.anInt3952; local29++) {
				for (local33 = 0; local33 < super.anInt3969; local33++) {
					if ((Static329.aByteArrayArrayArray17[1][local29][local33] & 0x2) == 2) {
						Static18.method211(local29, local33);
					}
				}
			}
		}
		for (local29 = 0; local29 < super.anInt3960; local29++) {
			for (local33 = 0; super.anInt3969 >= local33; local33++) {
				for (@Pc(69) int local69 = 0; local69 <= super.anInt3952; local69++) {
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(90) int local90;
					@Pc(135) int local135;
					@Pc(224) int local224;
					@Pc(233) int local233;
					@Pc(253) int local253;
					@Pc(257) int local257;
					if ((super.aByteArrayArrayArray14[local29][local69][local33] & 0x1) != 0) {
						local84 = local33;
						local86 = local33;
						local88 = local29;
						local90 = local29;
						while (super.anInt3969 > local86 && (super.aByteArrayArrayArray14[local29][local69][local86 + 1] & 0x1) != 0) {
							local86++;
						}
						while (local84 > 0 && (super.aByteArrayArrayArray14[local29][local69][local84 - 1] & 0x1) != 0) {
							local84--;
						}
						label164: while (local88 > 0) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray14[local88 - 1][local69][local135] & 0x1) == 0) {
									break label164;
								}
							}
							local88--;
						}
						label153: while (local90 < 3) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray14[local90 + 1][local69][local135] & 0x1) == 0) {
									break label153;
								}
							}
							local90++;
						}
						local135 = (local90 + 1 - local88) * (local86 + 1 - local84);
						if (local135 >= 2) {
							local224 = super.anIntArrayArrayArray7[local90][local69][local84] - 240;
							local233 = super.anIntArrayArrayArray7[local88][local69][local84];
							Static364.method5788(1, local69 * 128, local69 * 128, local84 * 128, local86 * 128 + 128, local224, local233);
							for (local253 = local88; local253 <= local90; local253++) {
								for (local257 = local84; local257 <= local86; local257++) {
									super.aByteArrayArrayArray14[local253][local69][local257] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local29][local69][local33] & 0x2) != 0) {
						local84 = local69;
						local86 = local69;
						local88 = local29;
						while (local84 > 0 && (super.aByteArrayArrayArray14[local29][local84 - 1][local33] & 0x2) != 0) {
							local84--;
						}
						local90 = local29;
						while (local86 < super.anInt3952 && (super.aByteArrayArrayArray14[local29][local86 + 1][local33] & 0x2) != 0) {
							local86++;
						}
						label217: while (local88 > 0) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray14[local88 - 1][local135][local33] & 0x2) == 0) {
									break label217;
								}
							}
							local88--;
						}
						label206: while (local90 < 3) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray14[local90 + 1][local135][local33] & 0x2) == 0) {
									break label206;
								}
							}
							local90++;
						}
						local135 = (local86 + 1 - local84) * (local90 + 1 - local88);
						if (local135 >= 2) {
							local224 = super.anIntArrayArrayArray7[local90][local84][local33] - 240;
							local233 = super.anIntArrayArrayArray7[local88][local84][local33];
							Static364.method5788(2, local84 * 128, local86 * 128 + 128, local33 * 128, local33 * 128, local224, local233);
							for (local253 = local88; local253 <= local90; local253++) {
								for (local257 = local84; local257 <= local86; local257++) {
									super.aByteArrayArrayArray14[local253][local257][local33] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local29][local69][local33] & 0x4) != 0) {
						local84 = local69;
						local86 = local69;
						local88 = local33;
						local90 = local33;
						while (local88 > 0 && (super.aByteArrayArrayArray14[local29][local69][local88 - 1] & 0x4) != 0) {
							local88--;
						}
						while (local90 < super.anInt3969 && (super.aByteArrayArrayArray14[local29][local69][local90 + 1] & 0x4) != 0) {
							local90++;
						}
						label271: while (local84 > 0) {
							for (local135 = local88; local135 <= local90; local135++) {
								if ((super.aByteArrayArrayArray14[local29][local84 - 1][local135] & 0x4) == 0) {
									break label271;
								}
							}
							local84--;
						}
						label260: while (super.anInt3952 > local86) {
							for (local135 = local88; local135 <= local90; local135++) {
								if ((super.aByteArrayArrayArray14[local29][local86 + 1][local135] & 0x4) == 0) {
									break label260;
								}
							}
							local86++;
						}
						if ((local86 + 1 - local84) * (-local88 + 1 + local90) >= 4) {
							local135 = super.anIntArrayArrayArray7[local29][local84][local88];
							Static364.method5788(4, local84 * 128, local86 * 128 + 128, local88 * 128, local90 * 128 + 128, local135, local135);
							for (@Pc(695) int local695 = local84; local695 <= local86; local695++) {
								for (local224 = local88; local224 <= local90; local224++) {
									super.aByteArrayArrayArray14[local29][local695][local224] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([ILclient!vt;Lclient!oj;BII)V")
	public void method3477(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub24 arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean282) {
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(25) Class189 local25 = null;
		while (true) {
			@Pc(30) int local30;
			@Pc(46) int local46;
			@Pc(210) int local210;
			@Pc(102) int local102;
			@Pc(50) int local50;
			while (arg1.aByteArray100.length > arg1.anInt6669) {
				local30 = arg1.method5732();
				if (local30 == 0) {
					local25 = new Class189(arg1);
				} else {
					@Pc(107) int local107;
					if (local30 == 1) {
						local46 = arg1.method5732();
						if (local46 > 0) {
							for (local50 = 0; local50 < local46; local50++) {
								@Pc(57) Class2_Sub8_Sub1 local57 = new Class2_Sub8_Sub1(arg1);
								if (local57.anInt1389 == 31) {
									@Pc(70) Class39 local70 = Static15.aClass36_1.method603(arg1.method5753());
									local57.method1148(local70.anInt1015, local70.anInt1013, local70.anInt1019, local70.anInt1018);
								}
								local57.anInt1377 += arg4 << 7;
								local57.anInt1379 += arg3 << 7;
								local102 = local57.anInt1379 >> 7;
								local107 = local57.anInt1377 >> 7;
								if (local102 >= 0 && local107 >= 0 && super.anInt3952 > local102 && super.anInt3969 > local107) {
									local57.anInt1375 = super.anIntArrayArrayArray7[local57.anInt1381][local102][local107] - local57.anInt1375;
									if (arg2.method2446() > 0) {
										Static292.method4814(local57);
									}
								}
							}
						}
					} else if (local30 == 2) {
						if (local25 == null) {
							local25 = new Class189();
						}
						local25.method4695(arg1);
					} else if (local30 != 128) {
						if (local30 != 129) {
							throw new IllegalStateException((String) null);
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						local17 = true;
						for (local46 = 0; local46 < 4; local46++) {
							@Pc(201) byte local201 = arg1.method5759();
							@Pc(237) int local237;
							if (local201 == 0 && super.aByteArrayArrayArray13[local46] != null) {
								local210 = arg3;
								local102 = arg3 + 64;
								local107 = arg4;
								if (arg3 < 0) {
									local210 = 0;
								} else if (arg3 >= super.anInt3952) {
									local210 = super.anInt3952;
								}
								local237 = arg4 + 64;
								if (local102 < 0) {
									local102 = 0;
								} else if (local102 >= super.anInt3952) {
									local102 = super.anInt3952;
								}
								if (arg4 < 0) {
									local107 = 0;
								} else if (arg4 >= super.anInt3969) {
									local107 = super.anInt3969;
								}
								if (local237 < 0) {
									local237 = 0;
								} else if (super.anInt3969 <= local237) {
									local237 = super.anInt3969;
								}
								while (local102 > local210) {
									while (local237 > local107) {
										super.aByteArrayArrayArray13[local46][local210][local107] = 0;
										local107++;
									}
									local210++;
								}
							} else if (local201 == 1) {
								if (super.aByteArrayArrayArray13[local46] == null) {
									super.aByteArrayArrayArray13[local46] = new byte[super.anInt3952 + 1][super.anInt3969 + 1];
								}
								for (local210 = 0; local210 < 64; local210 += 4) {
									for (local102 = 0; local102 < 64; local102 += 4) {
										@Pc(353) byte local353 = arg1.method5759();
										for (local237 = local210 + arg3; local237 < arg3 + local210 + 4; local237++) {
											for (@Pc(364) int local364 = arg4 + local102; local364 < local102 + arg4 + 4; local364++) {
												if (local237 >= 0 && super.anInt3952 > local237 && local364 >= 0 && local364 < super.anInt3969) {
													super.aByteArrayArrayArray13[local46][local237][local364] = local353;
												}
											}
										}
									}
								}
							} else if (local201 == 2) {
								if (super.aByteArrayArrayArray13[local46] == null) {
									super.aByteArrayArrayArray13[local46] = new byte[super.anInt3952 + 1][super.anInt3969 + 1];
								}
								if (local46 > 0) {
									local210 = arg3;
									local102 = arg3 + 64;
									local107 = arg4;
									if (local102 < 0) {
										local102 = 0;
									} else if (local102 >= super.anInt3952) {
										local102 = super.anInt3952;
									}
									if (arg3 < 0) {
										local210 = 0;
									} else if (super.anInt3952 <= arg3) {
										local210 = super.anInt3952;
									}
									if (arg4 < 0) {
										local107 = 0;
									} else if (super.anInt3969 <= arg4) {
										local107 = super.anInt3969;
									}
									local237 = arg4 + 64;
									if (local237 < 0) {
										local237 = 0;
									} else if (super.anInt3969 <= local237) {
										local237 = super.anInt3969;
									}
									while (local210 < local102) {
										while (local107 < local237) {
											super.aByteArrayArrayArray13[local46][local210][local107] = super.aByteArrayArrayArray13[local46 - 1][local210][local107];
											local107++;
										}
										local210++;
									}
								}
							}
						}
					} else if (arg0 == null) {
						arg1.anInt6669 += 10;
					} else {
						arg0[0] = arg1.method5753();
						arg0[1] = arg1.method5743();
						arg0[2] = arg1.method5743();
						arg0[3] = arg1.method5743();
						arg0[4] = arg1.method5753();
					}
				}
			}
			if (local25 != null) {
				for (local30 = 0; local30 < 8; local30++) {
					for (local46 = 0; local46 < 8; local46++) {
						local50 = (arg3 >> 3) + local30;
						local210 = local46 + (arg4 >> 3);
						if (local50 >= 0 && local50 < super.anInt3952 >> 3 && local210 >= 0 && local210 < super.anInt3969 >> 3) {
							Static317.method5131(local25, local210, local50);
						}
					}
				}
			}
			if (!local17 && super.aByteArrayArrayArray13 != null) {
				for (local30 = 0; local30 < 4; local30++) {
					if (super.aByteArrayArrayArray13[local30] != null) {
						for (local46 = 0; local46 < 16; local46++) {
							for (local50 = 0; local50 < 16; local50++) {
								local210 = local46 + (arg3 >> 2);
								local102 = local50 + (arg4 >> 2);
								if (local210 >= 0 && local210 < 26 && local102 >= 0 && local102 < 26) {
									super.aByteArrayArrayArray13[local30][local210][local102] = 0;
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

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!oj;II[B[Lclient!pe;)V")
	public void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class178[] arg4) {
		@Pc(10) Class2_Sub24 local10 = new Class2_Sub24(arg3);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local10.method5752();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method5722();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local10.method5732();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg0 + local60;
				@Pc(84) int local84 = arg2 + local54;
				if (local80 > 0 && local84 > 0 && super.anInt3952 - 1 > local80 && super.anInt3969 - 1 > local84) {
					@Pc(112) Class178 local112 = null;
					if (!super.aBoolean282) {
						@Pc(117) int local117 = local64;
						if ((Static329.aByteArrayArrayArray17[1][local80][local84] & 0x2) == 2) {
							local117 = local64 - 1;
						}
						if (local117 >= 0) {
							local112 = arg4[local117];
						}
					}
					this.method3479(local23, local72, local80, arg1, local64, local84, local76, local64, -1, local112);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIIILclient!oj;IIIIILclient!pe;)V")
	public void method3479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class48 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class178 arg9) {
		if (!Static40.method575() && !Static310.method5037(arg5, arg2, arg7, Static73.anInt1627)) {
			return;
		}
		if (arg7 < this.anInt3978) {
			this.anInt3978 = arg7;
		}
		@Pc(28) Class47 local28 = Static230.aClass96_4.method2303(arg0);
		if (Static36.anInt2910 == 1 && local28.aBoolean98) {
			return;
		}
		@Pc(49) int local49;
		@Pc(46) int local46;
		if (arg6 == 1 || arg6 == 3) {
			local46 = local28.anInt1247;
			local49 = local28.anInt1241;
		} else {
			local49 = local28.anInt1247;
			local46 = local28.anInt1241;
		}
		@Pc(95) int local95;
		@Pc(88) int local88;
		if (arg2 + local49 <= super.anInt3952) {
			local88 = arg2 + (local49 + 1 >> 1);
			local95 = arg2 + (local49 >> 1);
		} else {
			local88 = arg2 + 1;
			local95 = arg2;
		}
		@Pc(111) int local111;
		@Pc(115) int local115;
		if (super.anInt3969 < local46 + arg5) {
			local111 = arg5;
			local115 = arg5 + 1;
		} else {
			local111 = (local46 >> 1) + arg5;
			local115 = arg5 + (local46 + 1 >> 1);
		}
		@Pc(135) Class149 local135 = Static128.aClass149Array1[arg4];
		@Pc(158) int local158 = local135.method5837(local95, local111) + local135.method5837(local88, local111) + local135.method5837(local95, local115) + local135.method5837(local88, local115) >> 2;
		@Pc(166) int local166 = (local49 << 6) + (arg2 << 7);
		@Pc(175) int local175 = (arg5 << 7) + (local46 << 6);
		@Pc(187) boolean local187 = Static14.aBoolean33 && !super.aBoolean282 && local28.aBoolean103;
		if (local28.method904()) {
			Static168.method2962(arg6, arg7, arg5, null, null, local28, arg2);
		}
		@Pc(221) boolean local221 = arg8 == -1 && local28.anInt1250 == -1 && local28.anIntArray98 == null && local28.anIntArray95 == null && !local28.aBoolean93;
		if (Static116.aBoolean184 && local28.anInt1235 != 1) {
			return;
		}
		if (arg1 != 22) {
			@Pc(368) Class1_Sub2 local368;
			@Pc(335) Class1_Sub2_Sub2 local335;
			@Pc(339) int local339;
			if (arg1 == 10 || arg1 == 11) {
				local335 = null;
				if (local221) {
					@Pc(398) Class1_Sub2_Sub2 local398 = new Class1_Sub2_Sub2(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, local49 + arg2 - 1, arg5, arg5 + local46 - 1, arg1, arg6, local187);
					local339 = local398.method3072();
					local368 = local398;
					local335 = local398;
				} else {
					local339 = 15;
					local368 = new Class1_Sub2_Sub4(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, arg2 + local49 - 1, arg5, local46 + arg5 - 1, arg1, arg6, arg8);
				}
				@Pc(419) Class1_Sub2 local419 = Static278.method4615(arg7, arg2, arg5, td.class);
				@Pc(421) boolean local421 = false;
				if (local419 instanceof Class1_Sub2_Sub3 && local419.aShort95 == arg2 && local419.aShort96 == arg5) {
					((Class1_Sub2_Sub3) local419).aClass1_Sub2_2 = local368;
					local421 = true;
				}
				if (local421 || Static233.method4185(local368, false)) {
					if (local335 != null && local335.method6033()) {
						local335.method6028(arg3);
					}
					if (local28.aBoolean94 && Static14.aBoolean33) {
						if (local339 > 30) {
							local339 = 30;
						}
						for (@Pc(470) int local470 = 0; local470 <= local49; local470++) {
							for (@Pc(474) int local474 = 0; local474 <= local46; local474++) {
								local135.method5838(local470 + arg2, arg5 + local474, local339);
							}
						}
					}
				}
				if (local28.anInt1263 != 0 && arg9 != null) {
					arg9.method4470(arg5, arg2, !local28.aBoolean104, local46, local49, local28.aBoolean95);
				}
			} else {
				@Pc(622) Class1_Sub2 local622;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local221) {
						local335 = new Class1_Sub2_Sub2(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, arg2 + local49 - 1, arg5, local46 + arg5 - 1, arg1, arg6, local187);
						if (local335.method6033()) {
							local335.method6028(arg3);
						}
						local368 = local335;
					} else {
						local368 = new Class1_Sub2_Sub4(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, local49 + arg2 - 1, arg5, local46 + arg5 - 1, arg1, arg6, arg8);
					}
					local622 = Static278.method4615(arg7, arg2, arg5, td.class);
					if (local622 instanceof Class1_Sub2_Sub3 && local622.aShort95 == arg2 && arg5 == local622.aShort96) {
						((Class1_Sub2_Sub3) local622).aClass1_Sub2_2 = local368;
					} else {
						Static233.method4185(local368, false);
					}
					if (Static14.aBoolean33 && !super.aBoolean282 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg7 > 0 && local28.anInt1235 != 0) {
						super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x4);
					}
					if (local28.anInt1263 != 0 && arg9 != null) {
						arg9.method4470(arg5, arg2, !local28.aBoolean104, local46, local49, local28.aBoolean95);
					}
				} else {
					@Pc(756) Class1_Sub5 local756;
					if (arg1 == 0) {
						@Pc(721) int local721 = local28.anInt1235;
						if (Static182.aBoolean278 && local28.anInt1235 == -1) {
							local721 = 1;
						}
						if (local221) {
							@Pc(746) Class1_Sub5_Sub3 local746 = new Class1_Sub5_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, local187);
							if (local746.method6033()) {
								local746.method6028(arg3);
							}
							local756 = local746;
						} else {
							local756 = new Class1_Sub5_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, arg8);
						}
						@Pc(779) Class1_Sub5 local779 = Static94.method1598(arg7, arg2, arg5);
						if (local779 instanceof Class1_Sub5_Sub2) {
							((Class1_Sub5_Sub2) local779).aClass1_Sub5_3 = local756;
						} else {
							Static210.method5843(arg7, arg2, arg5, local756, null);
						}
						if (Static14.aBoolean33) {
							if (arg6 == 0) {
								if (local28.aBoolean94) {
									local135.method5838(arg2, arg5, 50);
									local135.method5838(arg2, arg5 + 1, 50);
								}
								if (local721 == 1 && !super.aBoolean282) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x1);
								}
							} else if (arg6 == 1) {
								if (local28.aBoolean94) {
									local135.method5838(arg2, arg5 + 1, 50);
									local135.method5838(arg2 + 1, arg5 + 1, 50);
								}
								if (local721 == 1 && !super.aBoolean282) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] | 0x2);
								}
							} else if (arg6 == 2) {
								if (local28.aBoolean94) {
									local135.method5838(arg2 + 1, arg5, 50);
									local135.method5838(arg2 + 1, arg5 + 1, 50);
								}
								if (local721 == 1 && !super.aBoolean282) {
									super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] | 0x1);
								}
							} else if (arg6 == 3) {
								if (local28.aBoolean94) {
									local135.method5838(arg2, arg5, 50);
									local135.method5838(arg2 + 1, arg5, 50);
								}
								if (local721 == 1 && !super.aBoolean282) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x2);
								}
							}
						}
						if (local28.anInt1263 != 0 && arg9 != null) {
							arg9.method4485(arg6, arg5, arg2, local28.aBoolean95, !local28.aBoolean104, arg1);
						}
						if (local28.anInt1277 != 16) {
							Static24.method275(arg7, arg2, arg5, local28.anInt1277);
						}
					} else {
						@Pc(1069) Class1_Sub5_Sub3 local1069;
						@Pc(1052) Class1_Sub5 local1052;
						if (arg1 == 1) {
							if (local221) {
								local1069 = new Class1_Sub5_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, local187);
								local1052 = local1069;
								if (local1069.method6033()) {
									local1069.method6028(arg3);
								}
							} else {
								local1052 = new Class1_Sub5_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, arg8);
							}
							local756 = Static94.method1598(arg7, arg2, arg5);
							if (local756 instanceof Class1_Sub5_Sub2) {
								((Class1_Sub5_Sub2) local756).aClass1_Sub5_3 = local1052;
							} else {
								Static210.method5843(arg7, arg2, arg5, local1052, null);
							}
							if (local28.aBoolean94 && Static14.aBoolean33) {
								if (arg6 == 0) {
									local135.method5838(arg2, arg5 + 1, 50);
								} else if (arg6 == 1) {
									local135.method5838(arg2 + 1, arg5 + 1, 50);
								} else if (arg6 == 2) {
									local135.method5838(arg2 + 1, arg5, 50);
								} else if (arg6 == 3) {
									local135.method5838(arg2, arg5, 50);
								}
							}
							if (local28.anInt1263 != 0 && arg9 != null) {
								arg9.method4485(arg6, arg5, arg2, local28.aBoolean95, !local28.aBoolean104, arg1);
							}
						} else if (arg1 == 2) {
							local339 = arg6 + 1 & 0x3;
							if (local221) {
								@Pc(1207) Class1_Sub5_Sub3 local1207 = new Class1_Sub5_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6 + 4, local187);
								@Pc(1222) Class1_Sub5_Sub3 local1222 = new Class1_Sub5_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg1, local339, local187);
								if (local1207.method6033()) {
									local1207.method6028(arg3);
								}
								if (local1222.method6033()) {
									local1222.method6028(arg3);
								}
								local1052 = local1207;
								local756 = local1222;
							} else {
								local1052 = new Class1_Sub5_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6 + 4, arg8);
								local756 = new Class1_Sub5_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg1, local339, arg8);
							}
							Static210.method5843(arg7, arg2, arg5, local1052, local756);
							if (local28.anInt1235 == 1 && Static14.aBoolean33 && !super.aBoolean282) {
								if (arg6 == 0) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x1);
									super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] | 0x2);
								} else if (arg6 == 1) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] | 0x1);
								} else if (arg6 == 2) {
									super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x2);
								} else if (arg6 == 3) {
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x2);
									super.aByteArrayArrayArray14[arg7][arg2][arg5] = (byte) (super.aByteArrayArrayArray14[arg7][arg2][arg5] | 0x1);
								}
							}
							if (local28.anInt1263 != 0 && arg9 != null) {
								arg9.method4485(arg6, arg5, arg2, local28.aBoolean95, !local28.aBoolean104, arg1);
							}
							if (local28.anInt1277 != 16) {
								Static24.method275(arg7, arg2, arg5, local28.anInt1277);
							}
						} else if (arg1 == 3) {
							if (local221) {
								local1069 = new Class1_Sub5_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, local187);
								local1052 = local1069;
								if (local1069.method6033()) {
									local1069.method6028(arg3);
								}
							} else {
								local1052 = new Class1_Sub5_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg1, arg6, arg8);
							}
							local756 = Static94.method1598(arg7, arg2, arg5);
							if (local756 instanceof Class1_Sub5_Sub2) {
								((Class1_Sub5_Sub2) local756).aClass1_Sub5_3 = local1052;
							} else {
								Static210.method5843(arg7, arg2, arg5, local1052, null);
							}
							if (local28.aBoolean94 && Static14.aBoolean33) {
								if (arg6 == 0) {
									local135.method5838(arg2, arg5 + 1, 50);
								} else if (arg6 == 1) {
									local135.method5838(arg2 + 1, arg5 + 1, 50);
								} else if (arg6 == 2) {
									local135.method5838(arg2 + 1, arg5, 50);
								} else if (arg6 == 3) {
									local135.method5838(arg2, arg5, 50);
								}
							}
							if (local28.anInt1263 != 0 && arg9 != null) {
								arg9.method4485(arg6, arg5, arg2, local28.aBoolean95, !local28.aBoolean104, arg1);
							}
						} else if (arg1 == 9) {
							if (local221) {
								local335 = new Class1_Sub2_Sub2(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, arg2, arg5, arg5, arg1, arg6, local187);
								local368 = local335;
								if (local335.method6033()) {
									local335.method6028(arg3);
								}
							} else {
								local368 = new Class1_Sub2_Sub4(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg2, arg2 + local49 - 1, arg5, arg5 + local46 - 1, arg1, arg6, arg8);
							}
							local622 = Static278.method4615(arg7, arg2, arg5, td.class);
							if (local622 instanceof Class1_Sub2_Sub3 && arg2 == local622.aShort95 && local622.aShort96 == arg5) {
								((Class1_Sub2_Sub3) local622).aClass1_Sub2_2 = local368;
							} else {
								Static233.method4185(local368, false);
							}
							if (local28.anInt1263 != 0 && arg9 != null) {
								arg9.method4470(arg5, arg2, !local28.aBoolean104, local46, local49, local28.aBoolean95);
							}
							if (local28.anInt1277 != 16) {
								Static24.method275(arg7, arg2, arg5, local28.anInt1277);
							}
						} else {
							@Pc(1825) Class1_Sub3 local1825;
							if (arg1 == 4) {
								if (local221) {
									@Pc(1844) Class1_Sub3_Sub3 local1844 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, 0, 0, 0, arg1, arg6);
									if (local1844.method6033()) {
										local1844.method6028(arg3);
									}
									local1825 = local1844;
								} else {
									local1825 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, 0, 0, 0, arg1, arg6, arg8);
								}
								@Pc(1859) Class1_Sub3 local1859 = Static204.method3744(arg7, arg2, arg5);
								if (local1859 instanceof Class1_Sub3_Sub2) {
									((Class1_Sub3_Sub2) local1859).aClass1_Sub3_1 = local1825;
								} else {
									Static29.method337(arg7, arg2, arg5, local1825, null);
								}
							} else {
								@Pc(1879) int local1879;
								@Pc(1885) Interface8 local1885;
								@Pc(1951) Class1_Sub3_Sub3 local1951;
								@Pc(1966) Class1_Sub3 local1966;
								if (arg1 == 5) {
									local1879 = 16;
									local1885 = (Interface8) Static94.method1598(arg7, arg2, arg5);
									if (local1885 != null) {
										local1879 = Static230.aClass96_4.method2303(local1885.method6034()).anInt1277;
									}
									if (local221) {
										local1951 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, 0, Static266.anIntArray409[arg6] * local1879, local1879 * Static302.anIntArray476[arg6], arg1, arg6);
										if (local1951.method6033()) {
											local1951.method6028(arg3);
										}
										local1825 = local1951;
									} else {
										local1825 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, 0, local1879 * Static266.anIntArray409[arg6], Static302.anIntArray476[arg6] * local1879, arg1, arg6, arg8);
									}
									local1966 = Static204.method3744(arg7, arg2, arg5);
									if (local1966 instanceof Class1_Sub3_Sub2) {
										((Class1_Sub3_Sub2) local1966).aClass1_Sub3_1 = local1825;
									} else {
										Static29.method337(arg7, arg2, arg5, local1825, null);
									}
								} else if (arg1 == 6) {
									local1879 = 8;
									local1885 = (Interface8) Static94.method1598(arg7, arg2, arg5);
									if (local1885 != null) {
										local1879 = Static230.aClass96_4.method2303(local1885.method6034()).anInt1277 / 2;
									}
									if (local221) {
										local1951 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg6, Static266.anIntArray409[arg6] * local1879, local1879 * Static302.anIntArray476[arg6], arg1, arg6 + 4);
										if (local1951.method6033()) {
											local1951.method6028(arg3);
										}
										local1825 = local1951;
									} else {
										local1825 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg6, local1879 * Static79.anIntArray131[arg6], Static12.anIntArray22[arg6] * local1879, arg1, arg6 + 4, arg8);
									}
									local1966 = Static204.method3744(arg7, arg2, arg5);
									if (local1966 instanceof Class1_Sub3_Sub2) {
										((Class1_Sub3_Sub2) local1966).aClass1_Sub3_1 = local1825;
									} else {
										Static29.method337(arg7, arg2, arg5, local1825, null);
									}
								} else if (arg1 == 7) {
									local1879 = arg6 + 2 & 0x3;
									if (local221) {
										@Pc(2147) Class1_Sub3_Sub3 local2147 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, local1879, 0, 0, arg1, local1879 + 4);
										if (local2147.method6033()) {
											local2147.method6028(arg3);
										}
										local1825 = local2147;
									} else {
										local1825 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, local1879, 0, 0, arg1, local1879 + 4, arg8);
									}
									@Pc(2162) Class1_Sub3 local2162 = Static204.method3744(arg7, arg2, arg5);
									if (local2162 instanceof Class1_Sub3_Sub2) {
										((Class1_Sub3_Sub2) local2162).aClass1_Sub3_1 = local1825;
									} else {
										Static29.method337(arg7, arg2, arg5, local1825, null);
									}
								} else if (arg1 == 8) {
									local339 = arg6 + 2 & 0x3;
									@Pc(2188) int local2188 = 8;
									@Pc(2194) Interface8 local2194 = (Interface8) Static94.method1598(arg7, arg2, arg5);
									if (local2194 != null) {
										local2188 = Static230.aClass96_4.method2303(local2194.method6034()).anInt1277 / 2;
									}
									@Pc(2235) Class1_Sub3 local2235;
									@Pc(2254) Class1_Sub3 local2254;
									if (local221) {
										local2235 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg6, Static79.anIntArray131[arg6] * local2188, Static12.anIntArray22[arg6] * local2188, arg1, arg6 + 4);
										local2254 = new Class1_Sub3_Sub3(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg6, 0, 0, arg1, local339 + 4);
										if (local2235.method6033()) {
											local2235.method6028(arg3);
										}
										if (local2254.method6033()) {
											local2254.method6028(arg3);
										}
									} else {
										local2235 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg6, local2188 * Static79.anIntArray131[arg6], Static12.anIntArray22[arg6] * local2188, arg1, arg6 + 4, arg8);
										local2254 = new Class1_Sub3_Sub1(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg6, 0, 0, arg1, local339 + 4, arg8);
									}
									Static29.method337(arg7, arg2, arg5, local2235, local2254);
								}
							}
						}
					}
				}
			}
		} else if (Static72.aBoolean125 || local28.anInt1274 != 0 || local28.anInt1263 == 1 || local28.aBoolean92) {
			@Pc(275) Class1_Sub1 local275;
			if (local221) {
				@Pc(265) Class1_Sub1_Sub1 local265 = new Class1_Sub1_Sub1(arg3, local28, arg4, local166, local158, local175, super.aBoolean282, arg6, local187);
				if (local265.method6033()) {
					local265.method6028(arg3);
				}
				local275 = local265;
			} else {
				local275 = new Class1_Sub1_Sub2(arg3, local28, arg7, arg4, local166, local158, local175, super.aBoolean282, arg6, arg8);
			}
			@Pc(297) Class1_Sub1 local297 = Static266.method4518(arg7, arg2, arg5);
			if (local297 instanceof Class1_Sub1_Sub3) {
				((Class1_Sub1_Sub3) local297).aClass1_Sub1_1 = local275;
			} else {
				Static339.method5453(arg7, arg2, arg5, local275);
			}
			if (local28.anInt1263 == 1 && arg9 != null) {
				arg9.method4472(arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!oj;II[IIIILclient!vt;)V")
	public void method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class48 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class2_Sub24 arg9) {
		if (super.aBoolean282) {
			return;
		}
		@Pc(13) Class189 local13 = null;
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(25) int local25 = (arg8 & 0x7) * 8;
		@Pc(37) int local37 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(42) int local42;
			@Pc(93) int local93;
			@Pc(118) int local118;
			@Pc(428) int local428;
			while (arg9.anInt6669 < arg9.aByteArray100.length) {
				local42 = arg9.method5732();
				if (local42 == 0) {
					local13 = new Class189(arg9);
				} else {
					@Pc(122) int local122;
					@Pc(164) int local164;
					@Pc(268) int local268;
					@Pc(124) int local124;
					if (local42 == 1) {
						local93 = arg9.method5732();
						if (local93 > 0) {
							for (local428 = 0; local428 < local93; local428++) {
								@Pc(435) Class2_Sub8_Sub1 local435 = new Class2_Sub8_Sub1(arg9);
								if (local435.anInt1389 == 31) {
									@Pc(446) Class39 local446 = Static15.aClass36_1.method603(arg9.method5753());
									local435.method1148(local446.anInt1015, local446.anInt1013, local446.anInt1019, local446.anInt1018);
								}
								local122 = local435.anInt1379 >> 7;
								local124 = local435.anInt1377 >> 7;
								if (arg0 == local435.anInt1381 && local122 >= local25 && local122 < local25 + 8 && local124 >= local37 && local124 < local37 + 8) {
									local164 = Static350.method5581(local435.anInt1379 & 0x3FF, arg2, local435.anInt1377 & 0x3FF) + (arg4 << 7);
									local268 = (arg5 << 7) + Static100.method1780(local435.anInt1377 & 0x3FF, local435.anInt1379 & 0x3FF, arg2);
									local435.anInt1377 = local268;
									local435.anInt1379 = local164;
									local122 = local435.anInt1379 >> 7;
									local124 = local435.anInt1377 >> 7;
									if (local122 >= 0 && local124 >= 0 && super.anInt3952 > local122 && super.anInt3969 > local124) {
										local435.anInt1375 = super.anIntArrayArrayArray7[arg0][local122][local124] - local435.anInt1375;
										if (arg3.method2446() > 0) {
											Static292.method4814(local435);
										}
									}
								}
							}
						}
					} else if (local42 == 2) {
						if (local13 == null) {
							local13 = new Class189();
						}
						local13.method4695(arg9);
					} else if (local42 != 128) {
						if (local42 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local93 = 0; local93 < 4; local93++) {
							@Pc(99) byte local99 = arg9.method5759();
							if (local99 == 0 && super.aByteArrayArrayArray13[arg7] != null) {
								if (local93 <= arg0) {
									local118 = arg4;
									local122 = arg4 + 7;
									local124 = arg5;
									if (arg5 < 0) {
										local124 = 0;
									} else if (arg5 >= super.anInt3969) {
										local124 = super.anInt3969;
									}
									if (local122 < 0) {
										local122 = 0;
									} else if (super.anInt3952 <= local122) {
										local122 = super.anInt3952;
									}
									local164 = arg5 + 7;
									if (arg4 < 0) {
										local118 = 0;
									} else if (super.anInt3952 <= arg4) {
										local118 = super.anInt3952;
									}
									if (local164 < 0) {
										local164 = 0;
									} else if (local164 >= super.anInt3969) {
										local164 = super.anInt3969;
									}
									while (local118 < local122) {
										while (local124 < local164) {
											super.aByteArrayArrayArray13[arg7][local118][local124] = 0;
											local124++;
										}
										local118++;
									}
								}
							} else if (local99 == 1) {
								if (super.aByteArrayArrayArray13[arg7] == null) {
									super.aByteArrayArrayArray13[arg7] = new byte[super.anInt3952 + 1][super.anInt3969 + 1];
								}
								for (local118 = 0; local118 < 64; local118 += 4) {
									for (local122 = 0; local122 < 64; local122 += 4) {
										@Pc(259) byte local259 = arg9.method5759();
										if (local93 <= arg0) {
											for (local164 = local118; local164 < local118 + 4; local164++) {
												for (local268 = local122; local268 < local122 + 4; local268++) {
													if (local25 <= local164 && local164 < local25 + 8 && local37 <= local268 && local37 + 8 > local37) {
														@Pc(310) int local310 = Static130.method5369(arg2, local268 & 0x7, local164 & 0x7) + arg4;
														@Pc(322) int local322 = arg5 + Static344.method5499(arg2, local268 & 0x7, local164 & 0x7);
														if (local310 >= 0 && super.anInt3952 > local310 && local322 >= 0 && super.anInt3969 > local322) {
															super.aByteArrayArrayArray13[arg7][local310][local322] = local259;
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
						arg9.anInt6669 += 10;
					} else {
						arg6[0] = arg9.method5753();
						arg6[1] = arg9.method5743();
						arg6[2] = arg9.method5743();
						arg6[3] = arg9.method5743();
						arg6[4] = arg9.method5753();
					}
				}
			}
			if (local13 != null) {
				Static317.method5131(local13, arg5 >> 3, arg4 >> 3);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg7] != null) {
				local42 = arg4 + 7;
				local93 = arg5 + 7;
				for (local428 = arg4; local428 < local42; local428++) {
					for (local118 = arg5; local118 < local93; local118++) {
						super.aByteArrayArrayArray13[arg7][local428][local118] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[Lclient!pe;I[BILclient!oj;IBII)V")
	public void method3481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class48 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Class2_Sub24 local14 = new Class2_Sub24(arg4);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method5752();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method5722();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local14.method5732();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (arg1 == local60 && local56 >= arg9 && local56 < arg9 + 8 && local50 >= arg8 && arg8 + 8 > local50) {
					@Pc(106) Class47 local106 = Static230.aClass96_4.method2303(local16);
					@Pc(123) int local123 = Static195.method3547(local56 & 0x7, local106.anInt1241, local106.anInt1247, local72, local50 & 0x7, arg3) + arg7;
					@Pc(141) int local141 = arg0 + Static119.method2122(arg3, local56 & 0x7, local72, local106.anInt1247, local50 & 0x7, local106.anInt1241);
					if (local123 > 0 && local141 > 0 && super.anInt3952 - 1 > local123 && super.anInt3969 - 1 > local141) {
						@Pc(166) Class178 local166 = null;
						if (!super.aBoolean282) {
							@Pc(171) int local171 = arg5;
							if ((Static329.aByteArrayArrayArray17[1][local123][local141] & 0x2) == 2) {
								local171 = arg5 - 1;
							}
							if (local171 >= 0) {
								local166 = arg2[local171];
							}
						}
						this.method3479(local16, local68, local123, arg6, arg5, local141, arg3 + local72 & 0x3, arg5, -1, local166);
					}
				}
			}
		}
	}
}
