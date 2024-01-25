import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class118_Sub1 extends Class118 {

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	public int anInt3867 = 99;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIZ)V")
	public Class118_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static441.aClass81_6, Static88.aClass40_1);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZI[Lclient!vba;IILclient!qa;II[B)V")
	public void method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class299[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(13) Class1_Sub13 local13 = new Class1_Sub13(arg9);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local13.method3062();
			if (local19 == 0) {
				return;
			}
			local15 += local19;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local13.method3066();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local13.method3043();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg7 == local53 && local49 >= arg5 && arg5 + 8 > local49 && local43 >= arg1 && arg1 + 8 > local43) {
					@Pc(101) Class288 local101 = Static365.aClass194_6.method5084(local15);
					@Pc(119) int local119 = arg2 + Static347.method5550(local65, local101.anInt8365, local101.anInt8343, local49 & 0x7, local43 & 0x7, arg4);
					@Pc(136) int local136 = arg0 + Static520.method7423(local43 & 0x7, arg4, local65, local101.anInt8365, local49 & 0x7, local101.anInt8343);
					if (local119 > 0 && local136 > 0 && local119 < super.anInt3842 - 1 && local136 < super.anInt3847 - 1) {
						@Pc(157) Class299 local157 = null;
						if (!super.aBoolean242) {
							@Pc(162) int local162 = arg8;
							if ((Static542.aByteArrayArrayArray17[1][local119][local136] & 0x2) == 2) {
								local162 = arg8 - 1;
							}
							if (local162 >= 0) {
								local157 = arg3[local162];
							}
						}
						this.method3450(local119, arg6, local61, local136, local15, local157, -1, local65 + arg4 & 0x3, arg8, arg8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qa;I[Lclient!vba;I[BI)V")
	public void method3447(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class299[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg4);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local8.method3062();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local8.method3066();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local8.method3043();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				@Pc(83) int local83 = local63 + arg1;
				@Pc(87) int local87 = local57 + arg3;
				if (local83 > 0 && local87 > 0 && local83 < super.anInt3842 - 1 && local87 < super.anInt3847 - 1) {
					@Pc(116) Class299 local116 = null;
					if (!super.aBoolean242) {
						@Pc(121) int local121 = local67;
						if ((Static542.aByteArrayArrayArray17[1][local83][local87] & 0x2) == 2) {
							local121 = local67 - 1;
						}
						if (local121 >= 0) {
							local116 = arg2[local121];
						}
					}
					this.method3450(local83, arg0, local75, local87, local23, local116, -1, local79, local67, local67);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method3448(@OriginalArg(0) Class9 arg0) {
		Static449.method6458(arg0);
		@Pc(11) int local11;
		if (super.anInt3843 > 1) {
			for (local11 = 0; local11 < super.anInt3842; local11++) {
				for (@Pc(14) int local14 = 0; super.anInt3847 > local14; local14++) {
					if ((Static542.aByteArrayArrayArray17[1][local11][local14] & 0x2) == 2) {
						Static370.method4021(local11, local14);
					}
				}
			}
		}
		for (local11 = 0; local11 < super.anInt3843; local11++) {
			for (@Pc(56) int local56 = 0; super.anInt3847 >= local56; local56++) {
				for (@Pc(59) int local59 = 0; super.anInt3842 >= local59; local59++) {
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(80) int local80;
					@Pc(101) int local101;
					@Pc(127) int local127;
					@Pc(215) int local215;
					@Pc(224) int local224;
					@Pc(244) int local244;
					@Pc(247) int local247;
					if ((super.aByteArrayArrayArray11[local11][local59][local56] & 0x1) != 0) {
						local76 = local56;
						local78 = local56;
						local80 = local11;
						while (local78 < super.anInt3847 && (super.aByteArrayArrayArray11[local11][local59][local78 + 1] & 0x1) != 0) {
							local78++;
						}
						local101 = local11;
						while (local76 > 0 && (super.aByteArrayArrayArray11[local11][local59][local76 - 1] & 0x1) != 0) {
							local76--;
						}
						label164: while (local80 > 0) {
							for (local127 = local76; local127 <= local78; local127++) {
								if ((super.aByteArrayArrayArray11[local80 - 1][local59][local127] & 0x1) == 0) {
									break label164;
								}
							}
							local80--;
						}
						label153: while (local101 < 3) {
							for (local127 = local76; local127 <= local78; local127++) {
								if ((super.aByteArrayArrayArray11[local101 + 1][local59][local127] & 0x1) == 0) {
									break label153;
								}
							}
							local101++;
						}
						local127 = (local101 + 1 - local80) * (local78 + 1 - local76);
						if (local127 >= 2) {
							local215 = super.anIntArrayArrayArray6[local101][local59][local76] - 240;
							local224 = super.anIntArrayArrayArray6[local80][local59][local76];
							Static207.method7961(1, local59 << 7, local59 << 7, local76 << 7, (local78 << 7) + 128, local215, local224);
							for (local244 = local80; local244 <= local101; local244++) {
								for (local247 = local76; local247 <= local78; local247++) {
									super.aByteArrayArrayArray11[local244][local59][local247] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local11][local59][local56] & 0x2) != 0) {
						local76 = local59;
						local78 = local59;
						local80 = local11;
						local101 = local11;
						while (local76 > 0 && (super.aByteArrayArrayArray11[local11][local76 - 1][local56] & 0x2) != 0) {
							local76--;
						}
						while (local78 < super.anInt3842 && (super.aByteArrayArrayArray11[local11][local78 + 1][local56] & 0x2) != 0) {
							local78++;
						}
						label218: while (local80 > 0) {
							for (local127 = local76; local127 <= local78; local127++) {
								if ((super.aByteArrayArrayArray11[local80 - 1][local127][local56] & 0x2) == 0) {
									break label218;
								}
							}
							local80--;
						}
						label207: while (local101 < 3) {
							for (local127 = local76; local127 <= local78; local127++) {
								if ((super.aByteArrayArrayArray11[local101 + 1][local127][local56] & 0x2) == 0) {
									break label207;
								}
							}
							local101++;
						}
						local127 = (local101 + 1 - local80) * (local78 + 1 - local76);
						if (local127 >= 2) {
							local215 = super.anIntArrayArrayArray6[local101][local76][local56] - 240;
							local224 = super.anIntArrayArrayArray6[local80][local76][local56];
							Static207.method7961(2, local76 << 7, (local78 << 7) + 128, local56 << 7, local56 << 7, local215, local224);
							for (local244 = local80; local244 <= local101; local244++) {
								for (local247 = local76; local247 <= local78; local247++) {
									super.aByteArrayArrayArray11[local244][local247][local56] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local11][local59][local56] & 0x4) != 0) {
						local76 = local59;
						local78 = local59;
						local80 = local56;
						local101 = local56;
						while (local80 > 0 && (super.aByteArrayArrayArray11[local11][local59][local80 - 1] & 0x4) != 0) {
							local80--;
						}
						while (local101 < super.anInt3847 && (super.aByteArrayArrayArray11[local11][local59][local101 + 1] & 0x4) != 0) {
							local101++;
						}
						label271: while (local76 > 0) {
							for (local127 = local80; local127 <= local101; local127++) {
								if ((super.aByteArrayArrayArray11[local11][local76 - 1][local127] & 0x4) == 0) {
									break label271;
								}
							}
							local76--;
						}
						label260: while (local78 < super.anInt3842) {
							for (local127 = local80; local127 <= local101; local127++) {
								if ((super.aByteArrayArrayArray11[local11][local78 + 1][local127] & 0x4) == 0) {
									break label260;
								}
							}
							local78++;
						}
						if ((local78 + 1 - local76) * (local101 + 1 - local80) >= 4) {
							local127 = super.anIntArrayArrayArray6[local11][local76][local80];
							Static207.method7961(4, local76 << 7, (local78 << 7) + 128, local80 << 7, (local101 << 7) + 128, local127, local127);
							for (@Pc(667) int local667 = local76; local667 <= local78; local667++) {
								for (local215 = local80; local215 <= local101; local215++) {
									super.aByteArrayArrayArray11[local11][local667][local215] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBLclient!vba;Lclient!qa;II)V")
	public void method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class299 arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface17 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface17) Static503.method7224(arg4, arg5, arg1);
		}
		if (arg0 == 1) {
			local5 = (Interface17) Static313.method5162(arg4, arg5, arg1);
		}
		if (arg0 == 2) {
			local5 = (Interface17) Static52.method1507(arg4, arg5, arg1, up.class);
		}
		if (arg0 == 3) {
			local5 = (Interface17) Static167.method3276(arg4, arg5, arg1);
		}
		if (local5 == null) {
			return;
		}
		@Pc(79) Class288 local79 = Static365.aClass194_6.method5084(local5.method7172());
		@Pc(83) int local83 = local5.method7176();
		@Pc(87) int local87 = local5.method7173();
		if (local79.method7055()) {
			Static295.method4963(arg4, arg1, local79, arg5);
		}
		if (local5.method7175()) {
			local5.method7177(arg3);
		}
		if (arg0 == 0) {
			@Pc(112) Class47_Sub4 local112 = Static503.method7224(arg4, arg5, arg1);
			if (local112 instanceof Class47_Sub4_Sub3) {
				((Class47_Sub4_Sub3) local112).aClass47_Sub4_3 = null;
			} else {
				Static105.method2287(arg4, arg5, arg1);
			}
			if (local79.anInt8363 != 0) {
				arg2.method7235(!local79.aBoolean577, local87, arg1, local79.aBoolean575, arg5, local83);
				return;
			}
		} else if (arg0 == 1) {
			@Pc(298) Class47_Sub5 local298 = Static313.method5162(arg4, arg5, arg1);
			if (local298 instanceof Class47_Sub5_Sub1) {
				((Class47_Sub5_Sub1) local298).aClass47_Sub5_3 = null;
				return;
			}
			Static307.method5100(arg4, arg5, arg1);
		} else {
			if (arg0 == 2) {
				@Pc(200) Class47_Sub2 local200 = Static52.method1507(arg4, arg5, arg1, up.class);
				if (local200 instanceof Class47_Sub2_Sub1 && arg5 == local200.aShort115 && local200.aShort117 == arg1) {
					((Class47_Sub2_Sub1) local200).aClass47_Sub2_1 = null;
				} else {
					Static119.method2670(arg4, arg5, arg1, up.class);
				}
				if (local79.anInt8363 == 0 || local79.anInt8365 + arg5 >= super.anInt3842 || super.anInt3847 <= local79.anInt8365 + arg1 || super.anInt3842 <= local79.anInt8343 + arg5 || super.anInt3847 <= arg1 + local79.anInt8343) {
					return;
				}
				arg2.method7243(arg1, local87, local79.anInt8365, local79.anInt8343, local79.aBoolean575, !local79.aBoolean577, arg5);
			} else if (arg0 == 3) {
				@Pc(163) Class47_Sub3 local163 = Static167.method3276(arg4, arg5, arg1);
				if (local163 instanceof Class47_Sub3_Sub2) {
					((Class47_Sub3_Sub2) local163).aClass47_Sub3_2 = null;
				} else {
					Static196.method3648(arg4, arg5, arg1);
				}
				if (local79.anInt8363 == 1) {
					arg2.method7233(arg1, arg5);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!qa;IIIILclient!vba;IIII)V")
	public void method3450(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class299 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static89.aClass1_Sub28_Sub1_1.method4266(Static526.anInt8926) && !Static94.method2176(Static435.anInt7457, arg3, arg0, arg8)) {
			return;
		}
		if (arg9 < this.anInt3867) {
			this.anInt3867 = arg9;
		}
		@Pc(28) Class288 local28 = Static365.aClass194_6.method5084(arg4);
		if (arg1.method7575() && Static89.aClass1_Sub28_Sub1_1.aBoolean323 && local28.aBoolean569) {
			return;
		}
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg7 == 1 || arg7 == 3) {
			local65 = local28.anInt8365;
			local62 = local28.anInt8343;
		} else {
			local62 = local28.anInt8365;
			local65 = local28.anInt8343;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (local62 + arg0 <= super.anInt3842) {
			local85 = arg0 + (local62 >> 1);
			local94 = arg0 + (local62 + 1 >> 1);
		} else {
			local85 = arg0;
			local94 = arg0 + 1;
		}
		@Pc(127) int local127;
		@Pc(120) int local120;
		if (local65 + arg3 <= super.anInt3847) {
			local120 = arg3 + (local65 + 1 >> 1);
			local127 = arg3 + (local65 >> 1);
		} else {
			local127 = arg3;
			local120 = arg3 + 1;
		}
		@Pc(138) Class10 local138 = Static290.aClass10Array7[arg8];
		@Pc(160) int local160 = local138.ba(local85, local127) + local138.ba(local94, local127) + local138.ba(local85, local120) + local138.ba(local94, local120) >> 2;
		@Pc(168) int local168 = (local62 << 6) + (arg0 << 7);
		@Pc(176) int local176 = (arg3 << 7) + (local65 << 6);
		@Pc(188) boolean local188 = Static393.aBoolean458 && !super.aBoolean242 && local28.aBoolean573;
		if (local28.method7055()) {
			Static96.method2188(null, local28, arg9, null, arg0, arg3, arg7);
		}
		@Pc(222) boolean local222 = arg6 == -1 && local28.anInt8320 == -1 && local28.anIntArray653 == null && local28.anIntArray650 == null && !local28.aBoolean578;
		if (Static280.aBoolean381 && (Static287.method4850(arg2) && local28.anInt8339 != 1 || !(!Static442.method6765(arg2) || local28.anInt8339 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(377) Class47_Sub2 local377;
			@Pc(343) Class47_Sub2_Sub6 local343;
			@Pc(381) int local381;
			if (arg2 == 10 || arg2 == 11) {
				local343 = null;
				if (local222) {
					@Pc(373) Class47_Sub2_Sub6 local373 = new Class47_Sub2_Sub6(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, local62 + arg0 - 1, arg3, local65 + arg3 - 1, arg2, arg7, local188);
					local343 = local373;
					local377 = local373;
					local381 = local373.method6969();
				} else {
					local381 = 15;
					local377 = new Class47_Sub2_Sub4(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, arg0 + local62 - 1, arg3, local65 + arg3 - 1, arg2, arg7, arg6);
				}
				@Pc(425) Class47_Sub2 local425 = Static52.method1507(arg9, arg0, arg3, up.class);
				@Pc(427) boolean local427 = false;
				if (local425 instanceof Class47_Sub2_Sub1 && local425.aShort115 == arg0 && local425.aShort117 == arg3) {
					((Class47_Sub2_Sub1) local425).aClass47_Sub2_1 = local377;
					local427 = true;
				}
				if (local427 || Static346.method5547(local377, false)) {
					if (local343 != null && local343.method7175()) {
						local343.method7174(arg1);
					}
					if (local28.aBoolean574 && Static393.aBoolean458) {
						if (local381 > 30) {
							local381 = 30;
						}
						for (@Pc(476) int local476 = 0; local476 <= local62; local476++) {
							for (@Pc(479) int local479 = 0; local479 <= local65; local479++) {
								local138.Q(arg0 + local476, local479 + arg3, local381);
							}
						}
					}
				}
				if (local28.anInt8363 != 0 && arg5 != null) {
					arg5.method7239(arg0, local28.aBoolean575, local62, !local28.aBoolean577, local65, arg3);
				}
			} else {
				@Pc(621) Class47_Sub2 local621;
				if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
					if (local222) {
						local343 = new Class47_Sub2_Sub6(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, arg0 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, local188);
						local377 = local343;
						if (local343.method7175()) {
							local343.method7174(arg1);
						}
					} else {
						local377 = new Class47_Sub2_Sub4(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, local62 + arg0 - 1, arg3, local65 + arg3 - 1, arg2, arg7, arg6);
					}
					local621 = Static52.method1507(arg9, arg0, arg3, up.class);
					if (local621 instanceof Class47_Sub2_Sub1 && local621.aShort115 == arg0 && local621.aShort117 == arg3) {
						((Class47_Sub2_Sub1) local621).aClass47_Sub2_1 = local377;
					} else {
						Static346.method5547(local377, false);
					}
					if (Static393.aBoolean458 && !super.aBoolean242 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg9 > 0 && local28.anInt8339 != 0) {
						super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x4);
					}
					if (local28.anInt8363 != 0 && arg5 != null) {
						arg5.method7239(arg0, local28.aBoolean575, local62, !local28.aBoolean577, local65, arg3);
					}
				} else {
					@Pc(743) Class47_Sub4 local743;
					if (arg2 == 0) {
						@Pc(716) int local716 = local28.anInt8339;
						if (Static505.aBoolean590 && local28.anInt8339 == -1) {
							local716 = 1;
						}
						if (local222) {
							@Pc(741) Class47_Sub4_Sub1 local741 = new Class47_Sub4_Sub1(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, local188);
							local743 = local741;
							if (local741.method7175()) {
								local741.method7174(arg1);
							}
						} else {
							local743 = new Class47_Sub4_Sub2(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, arg6);
						}
						@Pc(773) Class47_Sub4 local773 = Static503.method7224(arg9, arg0, arg3);
						if (local773 instanceof Class47_Sub4_Sub3) {
							((Class47_Sub4_Sub3) local773).aClass47_Sub4_3 = local743;
						} else {
							Static535.method7846(arg9, arg0, arg3, local743, null);
						}
						if (Static393.aBoolean458) {
							if (arg7 == 0) {
								if (local28.aBoolean574) {
									local138.Q(arg0, arg3, 50);
									local138.Q(arg0, arg3 + 1, 50);
								}
								if (local716 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x1);
								}
							} else if (arg7 == 1) {
								if (local28.aBoolean574) {
									local138.Q(arg0, arg3 + 1, 50);
									local138.Q(arg0 + 1, arg3 + 1, 50);
								}
								if (local716 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] | 0x2);
								}
							} else if (arg7 == 2) {
								if (local28.aBoolean574) {
									local138.Q(arg0 + 1, arg3, 50);
									local138.Q(arg0 + 1, arg3 + 1, 50);
								}
								if (local716 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] | 0x1);
								}
							} else if (arg7 == 3) {
								if (local28.aBoolean574) {
									local138.Q(arg0, arg3, 50);
									local138.Q(arg0 + 1, arg3, 50);
								}
								if (local716 == 1 && !super.aBoolean242) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x2);
								}
							}
						}
						if (local28.anInt8363 != 0 && arg5 != null) {
							arg5.method7238(arg7, arg0, !local28.aBoolean577, arg2, local28.aBoolean575, arg3);
						}
						if (local28.anInt8331 != 16) {
							Static209.method3802(arg9, arg0, arg3, local28.anInt8331);
						}
					} else {
						@Pc(1038) Class47_Sub4_Sub1 local1038;
						@Pc(1048) Class47_Sub4 local1048;
						if (arg2 == 1) {
							if (local222) {
								local1038 = new Class47_Sub4_Sub1(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, local188);
								if (local1038.method7175()) {
									local1038.method7174(arg1);
								}
								local1048 = local1038;
							} else {
								local1048 = new Class47_Sub4_Sub2(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, arg6);
							}
							local743 = Static503.method7224(arg9, arg0, arg3);
							if (local743 instanceof Class47_Sub4_Sub3) {
								((Class47_Sub4_Sub3) local743).aClass47_Sub4_3 = local1048;
							} else {
								Static535.method7846(arg9, arg0, arg3, local1048, null);
							}
							if (local28.aBoolean574 && Static393.aBoolean458) {
								if (arg7 == 0) {
									local138.Q(arg0, arg3 + 1, 50);
								} else if (arg7 == 1) {
									local138.Q(arg0 + 1, arg3 + 1, 50);
								} else if (arg7 == 2) {
									local138.Q(arg0 + 1, arg3, 50);
								} else if (arg7 == 3) {
									local138.Q(arg0, arg3, 50);
								}
							}
							if (local28.anInt8363 != 0 && arg5 != null) {
								arg5.method7238(arg7, arg0, !local28.aBoolean577, arg2, local28.aBoolean575, arg3);
							}
						} else if (arg2 == 2) {
							local381 = arg7 + 1 & 0x3;
							if (local222) {
								@Pc(1222) Class47_Sub4_Sub1 local1222 = new Class47_Sub4_Sub1(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7 + 4, local188);
								@Pc(1237) Class47_Sub4_Sub1 local1237 = new Class47_Sub4_Sub1(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg2, local381, local188);
								if (local1222.method7175()) {
									local1222.method7174(arg1);
								}
								local1048 = local1222;
								local743 = local1237;
								if (local1237.method7175()) {
									local1237.method7174(arg1);
								}
							} else {
								local1048 = new Class47_Sub4_Sub2(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7 + 4, arg6);
								local743 = new Class47_Sub4_Sub2(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg2, local381, arg6);
							}
							Static535.method7846(arg9, arg0, arg3, local1048, local743);
							if (local28.anInt8339 == 1 && Static393.aBoolean458 && !super.aBoolean242) {
								if (arg7 == 0) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x1);
									super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] | 0x2);
								} else if (arg7 == 1) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3 + 1] | 0x2);
									super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] | 0x1);
								} else if (arg7 == 2) {
									super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0 + 1][arg3] | 0x1);
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x2);
								} else if (arg7 == 3) {
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x2);
									super.aByteArrayArrayArray11[arg9][arg0][arg3] = (byte) (super.aByteArrayArrayArray11[arg9][arg0][arg3] | 0x1);
								}
							}
							if (local28.anInt8363 != 0 && arg5 != null) {
								arg5.method7238(arg7, arg0, !local28.aBoolean577, arg2, local28.aBoolean575, arg3);
							}
							if (local28.anInt8331 != 16) {
								Static209.method3802(arg9, arg0, arg3, local28.anInt8331);
							}
						} else if (arg2 == 3) {
							if (local222) {
								local1038 = new Class47_Sub4_Sub1(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, local188);
								if (local1038.method7175()) {
									local1038.method7174(arg1);
								}
								local1048 = local1038;
							} else {
								local1048 = new Class47_Sub4_Sub2(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg2, arg7, arg6);
							}
							local743 = Static503.method7224(arg9, arg0, arg3);
							if (local743 instanceof Class47_Sub4_Sub3) {
								((Class47_Sub4_Sub3) local743).aClass47_Sub4_3 = local1048;
							} else {
								Static535.method7846(arg9, arg0, arg3, local1048, null);
							}
							if (local28.aBoolean574 && Static393.aBoolean458) {
								if (arg7 == 0) {
									local138.Q(arg0, arg3 + 1, 50);
								} else if (arg7 == 1) {
									local138.Q(arg0 + 1, arg3 + 1, 50);
								} else if (arg7 == 2) {
									local138.Q(arg0 + 1, arg3, 50);
								} else if (arg7 == 3) {
									local138.Q(arg0, arg3, 50);
								}
							}
							if (local28.anInt8363 != 0 && arg5 != null) {
								arg5.method7238(arg7, arg0, !local28.aBoolean577, arg2, local28.aBoolean575, arg3);
							}
						} else if (arg2 == 9) {
							if (local222) {
								local343 = new Class47_Sub2_Sub6(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, arg0, arg3, arg3, arg2, arg7, local188);
								local377 = local343;
								if (local343.method7175()) {
									local343.method7174(arg1);
								}
							} else {
								local377 = new Class47_Sub2_Sub4(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg0, arg0 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, arg6);
							}
							local621 = Static52.method1507(arg9, arg0, arg3, up.class);
							if (local621 instanceof Class47_Sub2_Sub1 && arg0 == local621.aShort115 && local621.aShort117 == arg3) {
								((Class47_Sub2_Sub1) local621).aClass47_Sub2_1 = local377;
							} else {
								Static346.method5547(local377, false);
							}
							if (local28.anInt8363 != 0 && arg5 != null) {
								arg5.method7239(arg0, local28.aBoolean575, local62, !local28.aBoolean577, local65, arg3);
							}
							if (local28.anInt8331 != 16) {
								Static209.method3802(arg9, arg0, arg3, local28.anInt8331);
							}
						} else {
							@Pc(1795) Class47_Sub5 local1795;
							if (arg2 == 4) {
								if (local222) {
									@Pc(1813) Class47_Sub5_Sub2 local1813 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, 0, 0, 0, arg2, arg7);
									local1795 = local1813;
									if (local1813.method7175()) {
										local1813.method7174(arg1);
									}
								} else {
									local1795 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, 0, 0, 0, arg2, arg7, arg6);
								}
								@Pc(1828) Class47_Sub5 local1828 = Static313.method5162(arg9, arg0, arg3);
								if (local1828 instanceof Class47_Sub5_Sub1) {
									((Class47_Sub5_Sub1) local1828).aClass47_Sub5_3 = local1795;
								} else {
									Static232.method3993(arg9, arg0, arg3, local1795, null);
								}
							} else {
								@Pc(1848) int local1848;
								@Pc(1854) Interface17 local1854;
								@Pc(1893) Class47_Sub5_Sub2 local1893;
								@Pc(1936) Class47_Sub5 local1936;
								if (arg2 == 5) {
									local1848 = 17;
									local1854 = (Interface17) Static503.method7224(arg9, arg0, arg3);
									if (local1854 != null) {
										local1848 = Static365.aClass194_6.method5084(local1854.method7172()).anInt8331 + 1;
									}
									if (local222) {
										local1893 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, 0, local1848 * Static417.anIntArray443[arg7], Static499.anIntArray694[arg7] * local1848, arg2, arg7);
										if (local1893.method7175()) {
											local1893.method7174(arg1);
										}
										local1795 = local1893;
									} else {
										local1795 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, 0, local1848 * Static417.anIntArray443[arg7], Static499.anIntArray694[arg7] * local1848, arg2, arg7, arg6);
									}
									local1936 = Static313.method5162(arg9, arg0, arg3);
									if (local1936 instanceof Class47_Sub5_Sub1) {
										((Class47_Sub5_Sub1) local1936).aClass47_Sub5_3 = local1795;
									} else {
										Static232.method3993(arg9, arg0, arg3, local1795, null);
									}
								} else if (arg2 == 6) {
									local1848 = 9;
									local1854 = (Interface17) Static503.method7224(arg9, arg0, arg3);
									if (local1854 != null) {
										local1848 = Static365.aClass194_6.method5084(local1854.method7172()).anInt8331 / 2 + 1;
									}
									if (local222) {
										local1893 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg7, Static417.anIntArray443[arg7] * local1848, local1848 * Static499.anIntArray694[arg7], arg2, arg7 + 4);
										local1795 = local1893;
										if (local1893.method7175()) {
											local1893.method7174(arg1);
										}
									} else {
										local1795 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg7, local1848 * Static365.anIntArray768[arg7], Static369.anIntArray492[arg7] * local1848, arg2, arg7 + 4, arg6);
									}
									local1936 = Static313.method5162(arg9, arg0, arg3);
									if (local1936 instanceof Class47_Sub5_Sub1) {
										((Class47_Sub5_Sub1) local1936).aClass47_Sub5_3 = local1795;
									} else {
										Static232.method3993(arg9, arg0, arg3, local1795, null);
									}
								} else if (arg2 == 7) {
									local1848 = arg7 + 2 & 0x3;
									if (local222) {
										@Pc(2119) Class47_Sub5_Sub2 local2119 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, local1848, 0, 0, arg2, local1848 + 4);
										if (local2119.method7175()) {
											local2119.method7174(arg1);
										}
										local1795 = local2119;
									} else {
										local1795 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, local1848, 0, 0, arg2, local1848 + 4, arg6);
									}
									@Pc(2134) Class47_Sub5 local2134 = Static313.method5162(arg9, arg0, arg3);
									if (local2134 instanceof Class47_Sub5_Sub1) {
										((Class47_Sub5_Sub1) local2134).aClass47_Sub5_3 = local1795;
									} else {
										Static232.method3993(arg9, arg0, arg3, local1795, null);
									}
								} else if (arg2 == 8) {
									local381 = arg7 + 2 & 0x3;
									@Pc(2160) int local2160 = 9;
									@Pc(2166) Interface17 local2166 = (Interface17) Static503.method7224(arg9, arg0, arg3);
									if (local2166 != null) {
										local2160 = Static365.aClass194_6.method5084(local2166.method7172()).anInt8331 / 2 + 1;
									}
									@Pc(2211) Class47_Sub5 local2211;
									@Pc(2234) Class47_Sub5 local2234;
									if (local222) {
										local2211 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg7, Static365.anIntArray768[arg7] * local2160, Static369.anIntArray492[arg7] * local2160, arg2, arg7 + 4);
										local2234 = new Class47_Sub5_Sub2(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg7, 0, 0, arg2, local381 + 4);
										if (local2211.method7175()) {
											local2211.method7174(arg1);
										}
										if (local2234.method7175()) {
											local2234.method7174(arg1);
										}
									} else {
										local2211 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg7, local2160 * Static365.anIntArray768[arg7], local2160 * Static369.anIntArray492[arg7], arg2, arg7 + 4, arg6);
										local2234 = new Class47_Sub5_Sub3(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg7, 0, 0, arg2, local381 + 4, arg6);
									}
									Static232.method3993(arg9, arg0, arg3, local2211, local2234);
								}
							}
						}
					}
				}
			}
		} else if (Static89.aClass1_Sub28_Sub1_1.aBoolean319 || local28.anInt8338 != 0 || local28.anInt8363 == 1 || local28.aBoolean568) {
			@Pc(279) Class47_Sub3 local279;
			if (local222) {
				@Pc(277) Class47_Sub3_Sub3 local277 = new Class47_Sub3_Sub3(arg1, local28, arg8, local168, local160, local176, super.aBoolean242, arg7, local188);
				local279 = local277;
				if (local277.method7175()) {
					local277.method7174(arg1);
				}
			} else {
				local279 = new Class47_Sub3_Sub1(arg1, local28, arg9, arg8, local168, local160, local176, super.aBoolean242, arg7, arg6);
			}
			@Pc(308) Class47_Sub3 local308 = Static167.method3276(arg9, arg0, arg3);
			if (local308 instanceof Class47_Sub3_Sub2) {
				((Class47_Sub3_Sub2) local308).aClass47_Sub3_2 = local279;
			} else {
				Static248.method4217(arg9, arg0, arg3, local279);
			}
			if (local28.anInt8363 == 1 && arg5 != null) {
				arg5.method7232(arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!qa;[IIILclient!gw;)V")
	public void method3454(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub13 arg4) {
		if (super.aBoolean242) {
			return;
		}
		@Pc(9) boolean local9 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(22) Class308 local22 = null;
		while (true) {
			@Pc(27) int local27;
			@Pc(47) int local47;
			@Pc(258) int local258;
			@Pc(262) int local262;
			@Pc(54) int local54;
			while (arg4.anInt3400 < arg4.aByteArray45.length) {
				local27 = arg4.method3043();
				if (local27 == 0) {
					local22 = new Class308(arg4);
				} else {
					@Pc(118) int local118;
					@Pc(122) int local122;
					@Pc(108) int local108;
					if (local27 == 1) {
						local47 = arg4.method3043();
						if (local47 > 0) {
							for (local54 = 0; local54 < local47; local54++) {
								@Pc(62) Class201 local62 = new Class201(arg0, arg4, 0);
								if (local62.anInt5986 == 31) {
									@Pc(77) Class48 local77 = Static294.aClass119_1.method3462(arg4.method3056());
									local62.method5163(local77.anInt1878, local77.anInt1877, local77.anInt1875, local77.anInt1880);
								}
								if (arg0.method7582() > 0) {
									@Pc(99) Class1_Sub27 local99 = local62.aClass1_Sub27_2;
									local108 = local99.method5493() + (arg2 << 7);
									local118 = (arg3 << 7) + local99.method5495();
									local122 = local108 >> 7;
									@Pc(126) int local126 = local118 >> 7;
									if (local122 >= 0 && local126 >= 0 && super.anInt3842 > local122 && super.anInt3847 > local126) {
										local99.method5491(local118, super.anIntArrayArrayArray6[local62.anInt5980][local122][local126] - local99.method5487(), local108);
										Static239.method4058(local62);
									}
								}
							}
						}
					} else if (local27 == 2) {
						if (local22 == null) {
							local22 = new Class308();
						}
						local22.method7361(arg4);
					} else if (local27 != 128) {
						if (local27 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local47 = 0; local47 < 4; local47++) {
							@Pc(215) byte local215 = arg4.method3073();
							if (local215 == 0 && super.aByteArrayArrayArray13[local47] != null) {
								local258 = arg2;
								local262 = arg2 + 64;
								local108 = arg3;
								if (local262 < 0) {
									local262 = 0;
								} else if (local262 >= super.anInt3842) {
									local262 = super.anInt3842;
								}
								local118 = arg3 + 64;
								if (arg3 < 0) {
									local108 = 0;
								} else if (super.anInt3847 <= arg3) {
									local108 = super.anInt3847;
								}
								if (arg2 < 0) {
									local258 = 0;
								} else if (super.anInt3842 <= arg2) {
									local258 = super.anInt3842;
								}
								if (local118 < 0) {
									local118 = 0;
								} else if (super.anInt3847 <= local118) {
									local118 = super.anInt3847;
								}
								while (local258 < local262) {
									while (local108 < local118) {
										super.aByteArrayArrayArray13[local47][local258][local108] = 0;
										local108++;
									}
									local258++;
								}
							} else if (local215 == 1) {
								if (super.aByteArrayArrayArray13[local47] == null) {
									super.aByteArrayArrayArray13[local47] = new byte[super.anInt3842 + 1][super.anInt3847 + 1];
								}
								for (local258 = 0; local258 < 64; local258 += 4) {
									for (local262 = 0; local262 < 64; local262 += 4) {
										@Pc(387) byte local387 = arg4.method3073();
										for (local118 = local258 + arg2; local118 < local258 + arg2 + 4; local118++) {
											for (local122 = local262 + arg3; local122 < local262 + arg3 + 4; local122++) {
												if (local118 >= 0 && local118 < super.anInt3842 && local122 >= 0 && super.anInt3847 > local122) {
													super.aByteArrayArrayArray13[local47][local118][local122] = local387;
												}
											}
										}
									}
								}
							} else if (local215 == 2) {
								if (super.aByteArrayArrayArray13[local47] == null) {
									super.aByteArrayArrayArray13[local47] = new byte[super.anInt3842 + 1][super.anInt3847 + 1];
								}
								if (local47 > 0) {
									local258 = arg2;
									local262 = arg2 + 64;
									local108 = arg3;
									if (arg2 < 0) {
										local258 = 0;
									} else if (arg2 >= super.anInt3842) {
										local258 = super.anInt3842;
									}
									if (arg3 < 0) {
										local108 = 0;
									} else if (super.anInt3847 <= arg3) {
										local108 = super.anInt3847;
									}
									local118 = arg3 + 64;
									if (local262 < 0) {
										local262 = 0;
									} else if (super.anInt3842 <= local262) {
										local262 = super.anInt3842;
									}
									if (local118 < 0) {
										local118 = 0;
									} else if (local118 >= super.anInt3847) {
										local118 = super.anInt3847;
									}
									while (local258 < local262) {
										while (local108 < local118) {
											super.aByteArrayArrayArray13[local47][local258][local108] = super.aByteArrayArrayArray13[local47 - 1][local258][local108];
											local108++;
										}
										local258++;
									}
								}
							}
						}
						local9 = true;
					} else if (arg1 == null) {
						arg4.anInt3400 += 10;
					} else {
						arg1[0] = arg4.method3056();
						arg1[1] = arg4.method3058();
						arg1[2] = arg4.method3058();
						arg1[3] = arg4.method3058();
						arg1[4] = arg4.method3056();
					}
				}
			}
			if (local22 != null) {
				for (local27 = 0; local27 < 8; local27++) {
					for (local47 = 0; local47 < 8; local47++) {
						local54 = (arg2 >> 3) + local27;
						local258 = (arg3 >> 3) + local47;
						if (local54 >= 0 && local54 < super.anInt3842 >> 3 && local258 >= 0 && local258 < super.anInt3847 >> 3) {
							Static402.method7869(local22, local258, local54);
						}
					}
				}
			}
			if (!local9 && super.aByteArrayArrayArray13 != null) {
				for (local27 = 0; local27 < 4; local27++) {
					if (super.aByteArrayArrayArray13[local27] != null) {
						for (local47 = 0; local47 < 16; local47++) {
							for (local54 = 0; local54 < 16; local54++) {
								local258 = (arg2 >> 2) + local47;
								local262 = local54 + (arg3 >> 2);
								if (local258 >= 0 && local258 < 26 && local262 >= 0 && local262 < 26) {
									super.aByteArrayArrayArray13[local27][local258][local262] = 0;
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

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[IIIIILclient!qa;ILclient!gw;II)V")
	public void method3456(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub13 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean242) {
			return;
		}
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(24) Class308 local24 = null;
		@Pc(30) int local30 = (arg0 & 0x7) * 8;
		@Pc(36) int local36 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(72) int local72;
			@Pc(96) int local96;
			@Pc(404) int local404;
			while (arg8.aByteArray45.length > arg8.anInt3400) {
				local41 = arg8.method3043();
				if (local41 == 0) {
					local24 = new Class308(arg8);
				} else {
					@Pc(133) int local133;
					@Pc(226) int local226;
					@Pc(267) int local267;
					@Pc(102) int local102;
					if (local41 == 1) {
						local72 = arg8.method3043();
						if (local72 > 0) {
							for (local404 = 0; local404 < local72; local404++) {
								@Pc(412) Class201 local412 = new Class201(arg6, arg8, 0);
								if (local412.anInt5986 == 31) {
									@Pc(425) Class48 local425 = Static294.aClass119_1.method3462(arg8.method3056());
									local412.method5163(local425.anInt1878, local425.anInt1877, local425.anInt1875, local425.anInt1880);
								}
								if (arg6.method7582() > 0) {
									@Pc(442) Class1_Sub27 local442 = local412.aClass1_Sub27_2;
									local102 = local442.method5493() >> 7;
									local133 = local442.method5495() >> 7;
									if (arg2 == local412.anInt5980 && local102 >= local30 && local30 + 8 > local102 && local36 <= local133 && local133 < local36 + 8) {
										local226 = (arg7 << 7) + Static266.method4403(local442.method5493() & 0x3FF, arg9, local442.method5495() & 0x3FF);
										local267 = (arg5 << 7) + Static198.method3661(local442.method5495() & 0x3FF, local442.method5493() & 0x3FF, arg9);
										local102 = local226 >> 7;
										local133 = local267 >> 7;
										if (local102 >= 0 && local133 >= 0 && super.anInt3842 > local102 && super.anInt3847 > local133) {
											local442.method5491(local267, super.anIntArrayArrayArray6[arg2][local102][local133] - local442.method5487(), local226);
											Static239.method4058(local412);
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local24 == null) {
							local24 = new Class308();
						}
						local24.method7361(arg8);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local72 = 0; local72 < 4; local72++) {
							@Pc(77) byte local77 = arg8.method3073();
							@Pc(100) int local100;
							if (local77 == 0 && super.aByteArrayArrayArray13[arg3] != null) {
								if (arg2 >= local72) {
									local96 = arg7;
									local100 = arg7 + 7;
									local102 = arg5;
									if (local100 < 0) {
										local100 = 0;
									} else if (local100 >= super.anInt3842) {
										local100 = super.anInt3842;
									}
									if (arg7 < 0) {
										local96 = 0;
									} else if (arg7 >= super.anInt3842) {
										local96 = super.anInt3842;
									}
									local133 = arg5 + 7;
									if (arg5 < 0) {
										local102 = 0;
									} else if (super.anInt3847 <= arg5) {
										local102 = super.anInt3847;
									}
									if (local133 < 0) {
										local133 = 0;
									} else if (super.anInt3847 <= local133) {
										local133 = super.anInt3847;
									}
									while (local96 < local100) {
										while (local133 > local102) {
											super.aByteArrayArrayArray13[arg3][local96][local102] = 0;
											local102++;
										}
										local96++;
									}
								}
							} else if (local77 == 1) {
								if (super.aByteArrayArrayArray13[arg3] == null) {
									super.aByteArrayArrayArray13[arg3] = new byte[super.anInt3842 + 1][super.anInt3847 + 1];
								}
								for (local96 = 0; local96 < 64; local96 += 4) {
									for (local100 = 0; local100 < 64; local100 += 4) {
										@Pc(218) byte local218 = arg8.method3073();
										if (local72 <= arg2) {
											for (local133 = local96; local133 < local96 + 4; local133++) {
												for (local226 = local100; local226 < local100 + 4; local226++) {
													if (local30 <= local133 && local30 + 8 > local133 && local36 <= local226 && local36 < local36 + 8) {
														local267 = Static439.method5139(arg9, local226 & 0x7, local133 & 0x7) + arg7;
														@Pc(280) int local280 = arg5 + Static65.method7168(local133 & 0x7, arg9, local226 & 0x7);
														if (local267 >= 0 && local267 < super.anInt3842 && local280 >= 0 && super.anInt3847 > local280) {
															super.aByteArrayArrayArray13[arg3][local267][local280] = local218;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg1 == null) {
						arg8.anInt3400 += 10;
					} else {
						arg1[0] = arg8.method3056();
						arg1[1] = arg8.method3058();
						arg1[2] = arg8.method3058();
						arg1[3] = arg8.method3058();
						arg1[4] = arg8.method3056();
					}
				}
			}
			if (local24 != null) {
				Static402.method7869(local24, arg5 >> 3, arg7 >> 3);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg3] != null) {
				local41 = arg7 + 7;
				local72 = arg5 + 7;
				for (local404 = arg7; local404 < local41; local404++) {
					for (local96 = arg5; local96 < local72; local96++) {
						super.aByteArrayArrayArray13[arg3][local404][local96] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
