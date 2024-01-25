import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!n", name = "H", descriptor = "I")
	public int anInt6524 = 99;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IIIZ)V")
	public Class123_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static296.aClass324_3, Static432.aClass335_3);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!r;I[Lclient!nea;[BII)V")
	public void method5166(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class232[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(10) Class4_Sub13 local10 = new Class4_Sub13(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(23) int local23 = local10.method7022();
			if (local23 == 0) {
				return;
			}
			local12 += local23;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local10.method7019();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(53) int local53 = local34 & 0x3F;
				@Pc(59) int local59 = local34 >> 6 & 0x3F;
				@Pc(63) int local63 = local34 >> 12;
				@Pc(69) int local69 = local10.method7004();
				@Pc(73) int local73 = local69 >> 2;
				@Pc(77) int local77 = local69 & 0x3;
				@Pc(82) int local82 = local59 + arg1;
				@Pc(86) int local86 = arg4 + local53;
				if (local82 > 0 && local86 > 0 && local82 < super.anInt6521 - 1 && local86 < super.anInt6523 - 1) {
					@Pc(114) Class232 local114 = null;
					if (!super.aBoolean443) {
						@Pc(119) int local119 = local63;
						if ((Static266.aByteArrayArrayArray10[1][local82][local86] & 0x2) == 2) {
							local119 = local63 - 1;
						}
						if (local119 >= 0) {
							local114 = arg2[local119];
						}
					}
					this.method5170(local86, local63, local12, local77, local114, local63, -1, local82, arg0, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!r;IZ)V")
	public void method5168(@OriginalArg(0) Class7 arg0, @OriginalArg(2) boolean arg1) {
		Static7.method639();
		if (!arg1) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt6514 > 1) {
				for (local16 = 0; local16 < super.anInt6521; local16++) {
					for (local20 = 0; local20 < super.anInt6523; local20++) {
						if ((Static266.aByteArrayArrayArray10[1][local16][local20] & 0x2) == 2) {
							Static141.method8247(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; local16 < super.anInt6514; local16++) {
				for (local20 = 0; super.anInt6523 >= local20; local20++) {
					for (@Pc(62) int local62 = 0; super.anInt6521 >= local62; local62++) {
						if ((super.aByteArrayArrayArray15[local16][local62][local20] & 0x4) != 0) {
							@Pc(80) int local80 = local62;
							@Pc(82) int local82 = local62;
							@Pc(84) int local84 = local20;
							@Pc(86) int local86 = local20;
							while (local84 > 0 && (super.aByteArrayArrayArray15[local16][local62][local84 - 1] & 0x4) != 0 && local20 - local84 < 10) {
								local84--;
							}
							while (super.anInt6523 > local86 && (super.aByteArrayArrayArray15[local16][local62][local86 + 1] & 0x4) != 0 && local86 - local84 < 10) {
								local86++;
							}
							@Pc(147) int local147;
							label111: while (local80 > 0 && local62 - local80 < 10) {
								for (local147 = local84; local147 <= local86; local147++) {
									if ((super.aByteArrayArrayArray15[local16][local80 - 1][local147] & 0x4) == 0) {
										break label111;
									}
								}
								local80--;
							}
							label98: while (super.anInt6521 > local82 && local82 - local80 < 10) {
								for (local147 = local84; local147 <= local86; local147++) {
									if ((super.aByteArrayArrayArray15[local16][local82 + 1][local147] & 0x4) == 0) {
										break label98;
									}
								}
								local82++;
							}
							if ((local82 + 1 - local80) * (local86 + -local84 + 1) >= 4) {
								local147 = super.anIntArrayArrayArray14[local16][local80][local84];
								Static182.method3004(local147, local147, (local82 << 9) + 512, local16, local84 << 9, (local86 << 9) + 512, local80 << 9);
								for (@Pc(272) int local272 = local80; local272 <= local82; local272++) {
									for (@Pc(276) int local276 = local84; local276 <= local86; local276++) {
										super.aByteArrayArrayArray15[local16][local272][local276] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static225.method3648();
		}
		super.aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!nea;Lclient!r;IIII)V")
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface21 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface21) Static497.method7181(arg5, arg4, arg0);
		}
		if (arg3 == 1) {
			local5 = (Interface21) Static228.method3717(arg5, arg4, arg0);
		}
		if (arg3 == 2) {
			local5 = (Interface21) Static36.method1049(arg5, arg4, arg0, sw.class);
		}
		if (arg3 == 3) {
			local5 = (Interface21) Static570.method8016(arg5, arg4, arg0);
		}
		if (local5 == null) {
			return;
		}
		@Pc(80) Class233 local80 = Static103.aClass298_1.method6822(local5.method7281());
		@Pc(84) int local84 = local5.method7280();
		@Pc(88) int local88 = local5.method7283();
		if (local80.method5289()) {
			Static256.method4061(arg5, arg0, arg4, local80);
		}
		if (local5.method7282()) {
			local5.method7279(arg2);
		}
		if (arg3 == 0) {
			Static79.method1618(arg5, arg4, arg0);
			if (local80.anInt6692 != 0) {
				arg1.method5273(arg0, !local80.aBoolean465, local84, arg4, local80.aBoolean454, local88);
			}
			if (local80.anInt6672 == 1) {
				if (local88 == 0) {
					Static390.method6005(1, arg5, arg0, arg4);
					return;
				}
				if (local88 == 1) {
					Static390.method6005(2, arg5, arg0 + 1, arg4);
					return;
				}
				if (local88 == 2) {
					Static390.method6005(1, arg5, arg0, arg4 + 1);
					return;
				}
				if (local88 == 3) {
					Static390.method6005(2, arg5, arg0, arg4);
					return;
				}
			}
			return;
		}
		if (arg3 == 1) {
			Static409.method6227(arg5, arg4, arg0);
			return;
		}
		if (arg3 != 2) {
			if (arg3 == 3) {
				Static118.method2170(arg5, arg4, arg0);
				if (local80.anInt6692 == 1) {
					arg1.method5266(arg4, arg0);
					return;
				}
			}
			return;
		}
		Static231.method3754(arg5, arg4, arg0, sw.class);
		if (local80.anInt6692 != 0 && local80.anInt6718 + arg4 < super.anInt6521 && local80.anInt6718 + arg0 < super.anInt6523 && arg4 + local80.anInt6665 < super.anInt6521 && arg0 + local80.anInt6665 < super.anInt6523) {
			arg1.method5263(local80.anInt6665, arg0, !local80.aBoolean465, local80.aBoolean454, local80.anInt6718, local88, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILclient!nea;IIIILclient!r;I)V")
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class232 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class7 arg8, @OriginalArg(10) int arg9) {
		if (!Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614) && !Static592.method8254(arg7, arg0, Static550.anInt10029, arg5)) {
			return;
		}
		if (this.anInt6524 > arg1) {
			this.anInt6524 = arg1;
		}
		@Pc(30) Class233 local30 = Static103.aClass298_1.method6822(arg2);
		if (arg8.method7820() && Static455.aClass4_Sub35_Sub1_1.aBoolean675 && local30.aBoolean462) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg3 == 1 || arg3 == 3) {
			local52 = local30.anInt6665;
			local49 = local30.anInt6718;
		} else {
			local49 = local30.anInt6665;
			local52 = local30.anInt6718;
		}
		@Pc(74) int local74;
		@Pc(83) int local83;
		if (super.anInt6521 >= arg7 + local52) {
			local74 = arg7 + (local52 >> 1);
			local83 = arg7 + (local52 + 1 >> 1);
		} else {
			local83 = arg7 + 1;
			local74 = arg7;
		}
		@Pc(107) int local107;
		@Pc(105) int local105;
		if (super.anInt6523 < arg0 + local49) {
			local105 = arg0 + 1;
			local107 = arg0;
		} else {
			local107 = (local49 >> 1) + arg0;
			local105 = (local49 + 1 >> 1) + arg0;
		}
		@Pc(127) Class115 local127 = Static255.aClass115Array2[arg5];
		@Pc(153) int local153 = local127.method8055(local107, local74) + local127.method8055(local107, local83) + local127.method8055(local105, local74) + local127.method8055(local105, local83) >> 2;
		@Pc(162) int local162 = (arg7 << 9) + (local52 << 8);
		@Pc(171) int local171 = (arg0 << 9) + (local49 << 8);
		@Pc(183) boolean local183 = Static174.aBoolean269 && !super.aBoolean443 && local30.aBoolean460;
		if (local30.method5289()) {
			Static394.method6038(null, null, arg1, arg0, arg7, arg3, local30);
		}
		@Pc(216) boolean local216 = arg6 == -1 && local30.anInt6682 == -1 && local30.anIntArray377 == null && local30.anIntArray374 == null && !local30.aBoolean453;
		if (Static6.aBoolean65 && (Static504.method7255(arg9) && local30.anInt6672 != 1 || !(!Static402.method6125(arg9) || local30.anInt6672 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(364) Class21_Sub1_Sub1 local364;
			@Pc(331) Class21_Sub1_Sub1_Sub4 local331;
			@Pc(335) int local335;
			@Pc(430) int local430;
			if (arg9 == 10 || arg9 == 11) {
				local331 = null;
				if (local216) {
					@Pc(394) Class21_Sub1_Sub1_Sub4 local394 = new Class21_Sub1_Sub1_Sub4(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, arg7 + local52 - 1, arg0, local49 + arg0 - 1, arg9, arg3, local183);
					local364 = local394;
					local331 = local394;
					local335 = local394.method4400();
				} else {
					local335 = 15;
					local364 = new Class21_Sub1_Sub1_Sub3(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, arg7 + local52 - 1, arg0, arg0 + local49 - 1, arg9, arg3, arg6);
				}
				if (Static542.method7597(local364, false)) {
					if (local331 != null && local331.method7282()) {
						local331.method7278(arg8);
					}
					if (local30.aBoolean464 && Static174.aBoolean269) {
						if (local335 > 30) {
							local335 = 30;
						}
						for (local430 = 0; local430 <= local52; local430++) {
							for (@Pc(434) int local434 = 0; local434 <= local49; local434++) {
								local127.a(local430 + arg7, local434 + arg0, local335);
							}
						}
					}
				}
				if (local30.anInt6692 != 0 && arg4 != null) {
					arg4.method5268(local30.aBoolean454, !local30.aBoolean465, local52, local49, arg0, arg7);
				}
			} else if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
				if (local216) {
					local331 = new Class21_Sub1_Sub1_Sub4(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, local52 + arg7 - 1, arg0, arg0 + local49 - 1, arg9, arg3, local183);
					local364 = local331;
					if (local331.method7282()) {
						local331.method7278(arg8);
					}
				} else {
					local364 = new Class21_Sub1_Sub1_Sub3(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, arg7 + local52 - 1, arg0, local49 + arg0 - 1, arg9, arg3, arg6);
				}
				Static542.method7597(local364, false);
				if (Static174.aBoolean269 && !super.aBoolean443 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg1 > 0 && local30.anInt6672 != 0) {
					super.aByteArrayArrayArray15[arg1][arg7][arg0] = (byte) (super.aByteArrayArrayArray15[arg1][arg7][arg0] | 0x4);
				}
				if (local30.anInt6692 != 0 && arg4 != null) {
					arg4.method5268(local30.aBoolean454, !local30.aBoolean465, local52, local49, arg0, arg7);
				}
			} else {
				@Pc(672) Class21_Sub1_Sub2 local672;
				if (arg9 == 0) {
					@Pc(636) int local636 = local30.anInt6672;
					if (Static381.aBoolean551 && local30.anInt6672 == -1) {
						local636 = 1;
					}
					if (local216) {
						@Pc(662) Class21_Sub1_Sub2_Sub1 local662 = new Class21_Sub1_Sub2_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, local183);
						if (local662.method7282()) {
							local662.method7278(arg8);
						}
						local672 = local662;
					} else {
						local672 = new Class21_Sub1_Sub2_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, arg6);
					}
					Static383.method5935(arg1, arg7, arg0, local672, null);
					if (arg3 == 0) {
						if (Static174.aBoolean269 && local30.aBoolean464) {
							local127.a(arg7, arg0, 50);
							local127.a(arg7, arg0 + 1, 50);
						}
						if (local636 == 1 && !super.aBoolean443) {
							Static78.method1613(1, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
						}
					} else if (arg3 == 1) {
						if (Static174.aBoolean269 && local30.aBoolean464) {
							local127.a(arg7, arg0 + 1, 50);
							local127.a(arg7 + 1, arg0 + 1, 50);
						}
						if (local636 == 1 && !super.aBoolean443) {
							Static78.method1613(2, arg1, arg0 + 1, arg7, -local30.anInt6688, local30.anInt6704);
						}
					} else if (arg3 == 2) {
						if (Static174.aBoolean269 && local30.aBoolean464) {
							local127.a(arg7 + 1, arg0, 50);
							local127.a(arg7 + 1, arg0 + 1, 50);
						}
						if (local636 == 1 && !super.aBoolean443) {
							Static78.method1613(1, arg1, arg0, arg7 + 1, -local30.anInt6688, local30.anInt6704);
						}
					} else if (arg3 == 3) {
						if (Static174.aBoolean269 && local30.aBoolean464) {
							local127.a(arg7, arg0, 50);
							local127.a(arg7 + 1, arg0, 50);
						}
						if (local636 == 1 && !super.aBoolean443) {
							Static78.method1613(2, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
						}
					}
					if (local30.anInt6692 != 0 && arg4 != null) {
						arg4.method5278(arg7, !local30.aBoolean465, arg9, arg0, arg3, local30.aBoolean454);
					}
					if (local30.anInt6677 != 64) {
						Static9.method676(arg1, arg7, arg0, local30.anInt6677);
					}
				} else {
					@Pc(922) Class21_Sub1_Sub2_Sub1 local922;
					@Pc(932) Class21_Sub1_Sub2 local932;
					if (arg9 == 1) {
						if (local216) {
							local922 = new Class21_Sub1_Sub2_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, local183);
							if (local922.method7282()) {
								local922.method7278(arg8);
							}
							local932 = local922;
						} else {
							local932 = new Class21_Sub1_Sub2_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, arg6);
						}
						Static383.method5935(arg1, arg7, arg0, local932, null);
						if (local30.aBoolean464 && Static174.aBoolean269) {
							if (arg3 == 0) {
								local127.a(arg7, arg0 + 1, 50);
							} else if (arg3 == 1) {
								local127.a(arg7 + 1, arg0 - -1, 50);
							} else if (arg3 == 2) {
								local127.a(arg7 + 1, arg0, 50);
							} else if (arg3 == 3) {
								local127.a(arg7, arg0, 50);
							}
						}
						if (local30.anInt6692 != 0 && arg4 != null) {
							arg4.method5278(arg7, !local30.aBoolean465, arg9, arg0, arg3, local30.aBoolean454);
						}
					} else if (arg9 == 2) {
						local335 = arg3 + 1 & 0x3;
						if (local216) {
							@Pc(1102) Class21_Sub1_Sub2_Sub1 local1102 = new Class21_Sub1_Sub2_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3 + 4, local183);
							@Pc(1118) Class21_Sub1_Sub2_Sub1 local1118 = new Class21_Sub1_Sub2_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, local335, local183);
							if (local1102.method7282()) {
								local1102.method7278(arg8);
							}
							local672 = local1118;
							local932 = local1102;
							if (local1118.method7282()) {
								local1118.method7278(arg8);
							}
						} else {
							local932 = new Class21_Sub1_Sub2_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3 + 4, arg6);
							local672 = new Class21_Sub1_Sub2_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, local335, arg6);
						}
						Static383.method5935(arg1, arg7, arg0, local932, local672);
						if ((local30.anInt6672 == 1 || Static381.aBoolean551 && local30.anInt6672 == -1) && !super.aBoolean443) {
							if (arg3 == 0) {
								Static78.method1613(1, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
								Static78.method1613(2, arg1, arg0 + 1, arg7, local30.anInt6688, local30.anInt6704);
							} else if (arg3 == 1) {
								Static78.method1613(1, arg1, arg0, arg7 + 1, local30.anInt6688, local30.anInt6704);
								Static78.method1613(2, arg1, arg0 + 1, arg7, local30.anInt6688, local30.anInt6704);
							} else if (arg3 == 2) {
								Static78.method1613(1, arg1, arg0, arg7 + 1, local30.anInt6688, local30.anInt6704);
								Static78.method1613(2, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
							} else if (arg3 == 3) {
								Static78.method1613(1, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
								Static78.method1613(2, arg1, arg0, arg7, local30.anInt6688, local30.anInt6704);
							}
						}
						if (local30.anInt6692 != 0 && arg4 != null) {
							arg4.method5278(arg7, !local30.aBoolean465, arg9, arg0, arg3, local30.aBoolean454);
						}
						if (local30.anInt6677 != 64) {
							Static9.method676(arg1, arg7, arg0, local30.anInt6677);
						}
					} else if (arg9 == 3) {
						if (local216) {
							local922 = new Class21_Sub1_Sub2_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, local183);
							if (local922.method7282()) {
								local922.method7278(arg8);
							}
							local932 = local922;
						} else {
							local932 = new Class21_Sub1_Sub2_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg9, arg3, arg6);
						}
						Static383.method5935(arg1, arg7, arg0, local932, null);
						if (local30.aBoolean464 && Static174.aBoolean269) {
							if (arg3 == 0) {
								local127.a(arg7, arg0 + 1, 50);
							} else if (arg3 == 1) {
								local127.a(arg7 + 1, arg0 - -1, 50);
							} else if (arg3 == 2) {
								local127.a(arg7 + 1, arg0, 50);
							} else if (arg3 == 3) {
								local127.a(arg7, arg0, 50);
							}
						}
						if (local30.anInt6692 != 0 && arg4 != null) {
							arg4.method5278(arg7, !local30.aBoolean465, arg9, arg0, arg3, local30.aBoolean454);
						}
					} else if (arg9 == 9) {
						if (local216) {
							local331 = new Class21_Sub1_Sub1_Sub4(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, arg7, arg0, arg0, arg9, arg3, local183);
							local364 = local331;
							if (local331.method7282()) {
								local331.method7278(arg8);
							}
						} else {
							local364 = new Class21_Sub1_Sub1_Sub3(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg7, local52 + arg7 - 1, arg0, local49 + arg0 - 1, arg9, arg3, arg6);
						}
						Static542.method7597(local364, false);
						if (local30.anInt6692 != 0 && arg4 != null) {
							arg4.method5268(local30.aBoolean454, !local30.aBoolean465, local52, local49, arg0, arg7);
						}
						if (local30.anInt6677 != 64) {
							Static9.method676(arg1, arg7, arg0, local30.anInt6677);
						}
					} else {
						@Pc(1575) Class21_Sub1_Sub3 local1575;
						if (arg9 == 4) {
							if (local216) {
								@Pc(1594) Class21_Sub1_Sub3_Sub1 local1594 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, arg3);
								if (local1594.method7282()) {
									local1594.method7278(arg8);
								}
								local1575 = local1594;
							} else {
								local1575 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, arg3, arg6);
							}
							Static530.method3337(arg1, arg7, arg0, local1575, null);
						} else {
							@Pc(1618) int local1618;
							@Pc(1624) Interface21 local1624;
							@Pc(1691) Class21_Sub1_Sub3_Sub1 local1691;
							if (arg9 == 5) {
								local1618 = 65;
								local1624 = (Interface21) Static497.method7181(arg1, arg7, arg0);
								if (local1624 != null) {
									local1618 = Static103.aClass298_1.method6822(local1624.method7281()).anInt6677 + 1;
								}
								if (local216) {
									local1691 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, Static279.anIntArray300[arg3] * local1618, Static332.anIntArray352[arg3] * local1618, arg9, arg3);
									if (local1691.method7282()) {
										local1691.method7278(arg8);
									}
									local1575 = local1691;
								} else {
									local1575 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, local1618 * Static279.anIntArray300[arg3], Static332.anIntArray352[arg3] * local1618, arg9, arg3, arg6);
								}
								Static530.method3337(arg1, arg7, arg0, local1575, null);
							} else if (arg9 == 6) {
								local1618 = 33;
								local1624 = (Interface21) Static497.method7181(arg1, arg7, arg0);
								if (local1624 != null) {
									local1618 = Static103.aClass298_1.method6822(local1624.method7281()).anInt6677 / 2 + 1;
								}
								if (local216) {
									local1691 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, local1618 * Static279.anIntArray300[arg3], local1618 * Static332.anIntArray352[arg3], arg9, arg3 + 4);
									if (local1691.method7282()) {
										local1691.method7278(arg8);
									}
									local1575 = local1691;
								} else {
									local1575 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, Static518.anIntArray545[arg3] * local1618, local1618 * Static525.anIntArray547[arg3], arg9, arg3 + 4, arg6);
								}
								Static530.method3337(arg1, arg7, arg0, local1575, null);
							} else if (arg9 == 7) {
								local1618 = arg3 + 2 & 0x3;
								if (local216) {
									@Pc(1839) Class21_Sub1_Sub3_Sub1 local1839 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, local1618 + 4);
									if (local1839.method7282()) {
										local1839.method7278(arg8);
									}
									local1575 = local1839;
								} else {
									local1575 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, local1618 + 4, arg6);
								}
								Static530.method3337(arg1, arg7, arg0, local1575, null);
							} else if (arg9 == 8) {
								local335 = arg3 + 2 & 0x3;
								local430 = 33;
								@Pc(1895) Interface21 local1895 = (Interface21) Static497.method7181(arg1, arg7, arg0);
								if (local1895 != null) {
									local430 = Static103.aClass298_1.method6822(local1895.method7281()).anInt6677 / 2 + 1;
								}
								@Pc(1939) Class21_Sub1_Sub3 local1939;
								@Pc(1959) Class21_Sub1_Sub3 local1959;
								if (local216) {
									local1939 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, Static518.anIntArray545[arg3] * local430, local430 * Static525.anIntArray547[arg3], arg9, arg3 + 4);
									local1959 = new Class21_Sub1_Sub3_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, local335 + 4);
									if (local1939.method7282()) {
										local1939.method7278(arg8);
									}
									if (local1959.method7282()) {
										local1959.method7278(arg8);
									}
								} else {
									local1939 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, Static518.anIntArray545[arg3] * local430, local430 * Static525.anIntArray547[arg3], arg9, arg3 + 4, arg6);
									local1959 = new Class21_Sub1_Sub3_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, 0, 0, arg9, local335 + 4, arg6);
								}
								Static530.method3337(arg1, arg7, arg0, local1939, local1959);
							}
						}
					}
				}
			}
		} else if (Static455.aClass4_Sub35_Sub1_1.aBoolean667 || local30.anInt6681 != 0 || local30.anInt6692 == 1 || local30.aBoolean456) {
			@Pc(287) Class21_Sub1_Sub5 local287;
			if (local216) {
				@Pc(277) Class21_Sub1_Sub5_Sub1 local277 = new Class21_Sub1_Sub5_Sub1(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg3, local183);
				if (local277.method7282()) {
					local277.method7278(arg8);
				}
				local287 = local277;
			} else {
				local287 = new Class21_Sub1_Sub5_Sub2(arg8, local30, arg1, arg5, local162, local153, local171, super.aBoolean443, arg3, arg6);
			}
			Static120.method2178(arg1, arg7, arg0, local287);
			if (local30.anInt6692 == 1 && arg4 != null) {
				arg4.method5272(arg0, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([Lclient!nea;IILclient!r;III[BIII)V")
	public void method5171(@OriginalArg(0) Class232[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class4_Sub13 local10 = new Class4_Sub13(arg6);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method7022();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method7019();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local10.method7004();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg8 && local51 >= arg5 && arg5 + 8 > local51 && arg1 <= local45 && local45 < arg1 + 8) {
					@Pc(95) Class233 local95 = Static103.aClass298_1.method6822(local12);
					@Pc(112) int local112 = arg2 + Static37.method1063(local95.anInt6718, local95.anInt6665, local45 & 0x7, local51 & 0x7, local67, arg7);
					@Pc(129) int local129 = Static277.method4465(local95.anInt6718, arg7, local67, local95.anInt6665, local51 & 0x7, local45 & 0x7) + arg4;
					if (local112 > 0 && local129 > 0 && super.anInt6521 - 1 > local112 && super.anInt6523 - 1 > local129) {
						@Pc(157) Class232 local157 = null;
						if (!super.aBoolean443) {
							@Pc(162) int local162 = arg9;
							if ((Static266.aByteArrayArrayArray10[1][local112][local129] & 0x2) == 2) {
								local162 = arg9 - 1;
							}
							if (local162 >= 0) {
								local157 = arg0[local162];
							}
						}
						this.method5170(local129, arg9, local12, arg7 + local67 & 0x3, local157, arg9, -1, local112, arg3, local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILclient!ek;Lclient!r;B[IIII)V")
	public void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub13 arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean443) {
			return;
		}
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(27) Class116 local27 = null;
		@Pc(33) int local33 = (arg9 & 0x7) * 8;
		@Pc(39) int local39 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(58) int local58;
			@Pc(117) int local117;
			@Pc(164) int local164;
			@Pc(182) int local182;
			@Pc(65) int local65;
			@Pc(111) int local111;
			label233: do {
				while (true) {
					@Pc(44) int local44;
					@Pc(283) int local283;
					while (arg4.aByteArray88.length > arg4.anInt9170) {
						local44 = arg4.method7004();
						if (local44 == 0) {
							local27 = new Class116(arg4);
						} else {
							if (local44 == 1) {
								local58 = arg4.method7004();
								continue label233;
							}
							if (local44 == 2) {
								if (local27 == null) {
									local27 = new Class116();
								}
								local27.method2659(arg4);
							} else if (local44 != 128) {
								if (local44 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local58 = 0; local58 < 4; local58++) {
									@Pc(268) byte local268 = arg4.method7011();
									@Pc(287) int local287;
									if (local268 == 0 && super.aByteArrayArrayArray14[arg1] != null) {
										if (arg8 >= local58) {
											local283 = arg2;
											local287 = arg2 + 7;
											local111 = arg0;
											if (arg0 < 0) {
												local111 = 0;
											} else if (super.anInt6523 <= arg0) {
												local111 = super.anInt6523;
											}
											if (arg2 < 0) {
												local283 = 0;
											} else if (arg2 >= super.anInt6521) {
												local283 = super.anInt6521;
											}
											local117 = arg0 + 7;
											if (local287 < 0) {
												local287 = 0;
											} else if (super.anInt6521 <= local287) {
												local287 = super.anInt6521;
											}
											if (local117 < 0) {
												local117 = 0;
											} else if (super.anInt6523 <= local117) {
												local117 = super.anInt6523;
											}
											while (local283 < local287) {
												while (local117 > local111) {
													super.aByteArrayArrayArray14[arg1][local283][local111] = 0;
													local111++;
												}
												local283++;
											}
										}
									} else if (local268 == 1) {
										if (super.aByteArrayArrayArray14[arg1] == null) {
											super.aByteArrayArrayArray14[arg1] = new byte[super.anInt6521 + 1][super.anInt6523 + 1];
										}
										for (local283 = 0; local283 < 64; local283 += 4) {
											for (local287 = 0; local287 < 64; local287 += 4) {
												@Pc(420) byte local420 = arg4.method7011();
												if (arg8 >= local58) {
													for (local117 = local283; local117 < local283 + 4; local117++) {
														for (local164 = local287; local164 < local287 + 4; local164++) {
															if (local117 >= local33 && local117 < local33 + 8 && local164 >= local39 && local39 + 8 > local39) {
																local182 = arg2 + Static313.method4939(arg7, local117 & 0x7, local164 & 0x7);
																@Pc(483) int local483 = Static505.method7288(local164 & 0x7, local117 & 0x7, arg7) + arg0;
																if (local182 >= 0 && super.anInt6521 > local182 && local483 >= 0 && super.anInt6523 > local483) {
																	super.aByteArrayArrayArray14[arg1][local182][local483] = local420;
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
								arg4.anInt9170 += 10;
							} else {
								arg6[0] = arg4.method7054();
								arg6[1] = arg4.method7043();
								arg6[2] = arg4.method7043();
								arg6[3] = arg4.method7043();
								arg6[4] = arg4.method7054();
							}
						}
					}
					if (local27 != null) {
						Static327.method6518(arg2 >> 3, arg0 >> 3, local27);
					}
					if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg1] != null) {
						local44 = arg2 + 7;
						local58 = arg0 + 7;
						for (local65 = arg2; local65 < local44; local65++) {
							for (local283 = arg0; local283 < local58; local283++) {
								super.aByteArrayArrayArray14[arg1][local65][local283] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local58 <= 0);
			for (local65 = 0; local65 < local58; local65++) {
				@Pc(74) Class85 local74 = new Class85(arg5, arg4, 2);
				if (local74.anInt2564 == 31) {
					@Pc(85) Class146 local85 = Static207.aClass201_1.method4809(arg4.method7054());
					local74.method2037(local85.anInt4429, local85.anInt4426, local85.anInt4425, local85.anInt4430);
				}
				if (arg5.method7835() > 0) {
					@Pc(105) Class4_Sub3 local105 = local74.aClass4_Sub3_1;
					local111 = local105.method4954() >> 9;
					local117 = local105.method4949() >> 9;
					if (local74.anInt2551 == arg8 && local33 <= local111 && local111 < local33 + 8 && local39 <= local117 && local117 < local39 + 8) {
						local164 = (arg2 << 9) + Static555.method7884(local105.method4949() & 0xFFF, arg7, local105.method4954() & 0xFFF);
						local182 = Static130.method2382(arg7, local105.method4949() & 0xFFF, local105.method4954() & 0xFFF) + (arg0 << 9);
						local111 = local164 >> 9;
						local117 = local182 >> 9;
						if (local111 >= 0 && local117 >= 0 && super.anInt6521 > local111 && super.anInt6523 > local117) {
							local105.method4948(local164, super.anIntArrayArrayArray14[arg8][local111][local117] - local105.method4953(), local182);
							Static550.method7720(local74);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ek;[ILclient!r;II)V")
	public void method5173(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean443) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(19) Class116 local19 = null;
		while (true) {
			@Pc(40) int local40;
			@Pc(58) int local58;
			@Pc(305) int local305;
			@Pc(309) int local309;
			@Pc(62) int local62;
			while (arg1.anInt9170 < arg1.aByteArray88.length) {
				local40 = arg1.method7004();
				if (local40 == 0) {
					local19 = new Class116(arg1);
				} else {
					@Pc(119) int local119;
					@Pc(123) int local123;
					@Pc(111) int local111;
					if (local40 == 1) {
						local58 = arg1.method7004();
						if (local58 > 0) {
							for (local62 = 0; local62 < local58; local62++) {
								@Pc(71) Class85 local71 = new Class85(arg3, arg1, 2);
								if (local71.anInt2564 == 31) {
									@Pc(82) Class146 local82 = Static207.aClass201_1.method4809(arg1.method7054());
									local71.method2037(local82.anInt4429, local82.anInt4426, local82.anInt4425, local82.anInt4430);
								}
								if (arg3.method7835() > 0) {
									@Pc(102) Class4_Sub3 local102 = local71.aClass4_Sub3_1;
									local111 = local102.method4954() + (arg4 << 9);
									local119 = (arg0 << 9) + local102.method4949();
									local123 = local111 >> 9;
									@Pc(127) int local127 = local119 >> 9;
									if (local123 >= 0 && local127 >= 0 && local123 < super.anInt6521 && super.anInt6523 > local127) {
										local102.method4948(local111, super.anIntArrayArrayArray14[local71.anInt2551][local123][local127] - local102.method4953(), local119);
										Static550.method7720(local71);
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local19 == null) {
							local19 = new Class116();
						}
						local19.method2659(arg1);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						local11 = true;
						for (local58 = 0; local58 < 4; local58++) {
							@Pc(265) byte local265 = arg1.method7011();
							if (local265 == 0 && super.aByteArrayArrayArray14[local58] != null) {
								local305 = arg4;
								local309 = arg4 + 64;
								local111 = arg0;
								if (arg4 < 0) {
									local305 = 0;
								} else if (arg4 >= super.anInt6521) {
									local305 = super.anInt6521;
								}
								if (local309 < 0) {
									local309 = 0;
								} else if (local309 >= super.anInt6521) {
									local309 = super.anInt6521;
								}
								if (arg0 < 0) {
									local111 = 0;
								} else if (super.anInt6523 <= arg0) {
									local111 = super.anInt6523;
								}
								local119 = arg0 + 64;
								if (local119 < 0) {
									local119 = 0;
								} else if (super.anInt6523 <= local119) {
									local119 = super.anInt6523;
								}
								while (local305 < local309) {
									while (local119 > local111) {
										super.aByteArrayArrayArray14[local58][local305][local111] = 0;
										local111++;
									}
									local305++;
								}
							} else if (local265 == 1) {
								if (super.aByteArrayArrayArray14[local58] == null) {
									super.aByteArrayArrayArray14[local58] = new byte[super.anInt6521 + 1][super.anInt6523 + 1];
								}
								for (local305 = 0; local305 < 64; local305 += 4) {
									for (local309 = 0; local309 < 64; local309 += 4) {
										@Pc(441) byte local441 = arg1.method7011();
										for (local119 = arg4 + local305; local119 < arg4 + local305 + 4; local119++) {
											for (local123 = local309 + arg0; local123 < local309 + arg0 + 4; local123++) {
												if (local119 >= 0 && super.anInt6521 > local119 && local123 >= 0 && super.anInt6523 > local123) {
													super.aByteArrayArrayArray14[local58][local119][local123] = local441;
												}
											}
										}
									}
								}
							} else if (local265 == 2) {
								if (super.aByteArrayArrayArray14[local58] == null) {
									super.aByteArrayArrayArray14[local58] = new byte[super.anInt6521 + 1][super.anInt6523 + 1];
								}
								if (local58 > 0) {
									local305 = arg4;
									local309 = arg4 + 64;
									local111 = arg0;
									if (local309 < 0) {
										local309 = 0;
									} else if (local309 >= super.anInt6521) {
										local309 = super.anInt6521;
									}
									if (arg0 < 0) {
										local111 = 0;
									} else if (super.anInt6523 <= arg0) {
										local111 = super.anInt6523;
									}
									local119 = arg0 + 64;
									if (arg4 < 0) {
										local305 = 0;
									} else if (arg4 >= super.anInt6521) {
										local305 = super.anInt6521;
									}
									if (local119 < 0) {
										local119 = 0;
									} else if (super.anInt6523 <= local119) {
										local119 = super.anInt6523;
									}
									while (local305 < local309) {
										while (local119 > local111) {
											super.aByteArrayArrayArray14[local58][local305][local111] = super.aByteArrayArrayArray14[local58 - 1][local305][local111];
											local111++;
										}
										local305++;
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg1.anInt9170 += 10;
					} else {
						arg2[0] = arg1.method7054();
						arg2[1] = arg1.method7043();
						arg2[2] = arg1.method7043();
						arg2[3] = arg1.method7043();
						arg2[4] = arg1.method7054();
					}
				}
			}
			if (local19 != null) {
				for (local40 = 0; local40 < 8; local40++) {
					for (local58 = 0; local58 < 8; local58++) {
						local62 = (arg4 >> 3) + local40;
						local305 = local58 + (arg0 >> 3);
						if (local62 >= 0 && local62 < super.anInt6521 >> 3 && local305 >= 0 && super.anInt6523 >> 3 > local305) {
							Static327.method6518(local62, local305, local19);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray14 != null) {
				for (local40 = 0; local40 < 4; local40++) {
					if (super.aByteArrayArrayArray14[local40] != null) {
						for (local58 = 0; local58 < 16; local58++) {
							for (local62 = 0; local62 < 16; local62++) {
								local305 = (arg4 >> 2) + local58;
								local309 = local62 + (arg0 >> 2);
								if (local305 >= 0 && local305 < 26 && local309 >= 0 && local309 < 26) {
									super.aByteArrayArrayArray14[local40][local305][local309] = 0;
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
