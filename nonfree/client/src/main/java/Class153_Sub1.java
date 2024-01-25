import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class153_Sub1 extends Class153 {

	@OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
	public int anInt3431 = 99;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(IIIZ)V")
	public Class153_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static63.aClass290_2, Static557.aClass218_3);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[BIILclient!ha;[Lclient!dja;BIIII)V")
	public void method3026(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) Class88[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(20) Class5_Sub23 local20 = new Class5_Sub23(arg1);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local20.method8542();
			if (local26 == 0) {
				return;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local20.method8499();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(53) int local53 = local34 & 0x3F;
				@Pc(59) int local59 = local34 >> 6 & 0x3F;
				@Pc(63) int local63 = local34 >> 12;
				@Pc(67) int local67 = local20.method8529();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				if (local63 == arg6 && arg9 <= local59 && arg9 + 8 > local59 && arg8 <= local53 && arg8 + 8 > local53) {
					@Pc(109) Class55 local109 = Static536.aClass392_2.method9293(0, local22);
					@Pc(126) int local126 = arg3 + Static522.method7563(local109.anInt958, local109.anInt954, arg2, local59 & 0x7, local75, local53 & 0x7);
					@Pc(143) int local143 = arg0 + Static228.method3236(local53 & 0x7, arg2, local109.anInt954, local109.anInt958, local75, local59 & 0x7);
					if (local126 > 0 && local143 > 0 && super.anInt3410 - 1 > local126 && super.anInt3416 - 1 > local143) {
						@Pc(165) Class88 local165 = null;
						if (!super.aBoolean274) {
							@Pc(170) int local170 = arg7;
							if ((Static220.aByteArrayArrayArray14[1][local126][local143] & 0x2) == 2) {
								local170 = arg7 - 1;
							}
							if (local170 >= 0) {
								local165 = arg5[local170];
							}
						}
						this.method3028(arg4, local165, local71, local143, -1, local126, arg7, local75 + arg2 & 0x3, local22, arg7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IILclient!dja;Lclient!ha;III)V")
	public void method3027(@OriginalArg(0) int arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(3) Class57 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface16 local11 = this.method3035(arg0, arg4, arg5, arg3);
		if (local11 == null) {
			return;
		}
		@Pc(29) Class55 local29 = Static536.aClass392_2.method9293(0, local11.method8089());
		@Pc(33) int local33 = local11.method8092(18636);
		@Pc(37) int local37 = local11.method8091(false);
		if (local29.method855((byte) 87)) {
			Static607.method8682(arg5, arg3, arg0, local29);
		}
		if (local11.method8088(-9842)) {
			local11.method8087(-82, arg2);
		}
		if (arg4 == 0) {
			Static227.method3223(arg0, arg3, arg5);
			if (local29.anInt948 != 0) {
				arg1.method1577(!local29.aBoolean79, local29.aBoolean86, arg3, local33, arg5, local37);
			}
			if (local29.anInt916 == 1) {
				if (local37 == 0) {
					Static554.method8006(arg3, arg5, arg0, 1);
					return;
				}
				if (local37 != 1) {
					if (local37 == 2) {
						Static554.method8006(arg3 + 1, arg5, arg0, 1);
					} else if (local37 == 3) {
						Static554.method8006(arg3, arg5, arg0, 2);
						return;
					}
					return;
				}
				Static554.method8006(arg3, arg5 + 1, arg0, 2);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			Static442.method6550(arg0, arg3, arg5);
			return;
		}
		if (arg4 == 2) {
			Static416.method8825(arg0, arg3, arg5, Static209.aClass10 == null ? (Static209.aClass10 = a("nda")) : Static209.aClass10);
			if (local29.anInt948 != 0 && arg3 + local29.anInt958 < super.anInt3410 && arg5 + local29.anInt958 < super.anInt3416 && arg3 + local29.anInt954 < super.anInt3410 && super.anInt3416 > arg5 + local29.anInt954) {
				arg1.method1594(arg5, local29.aBoolean86, !local29.aBoolean79, local29.anInt954, arg3, local29.anInt958, local37);
			}
			if (local33 == 9) {
				if ((local37 & 0x1) != 0) {
					Static554.method8006(arg3, arg5, arg0, 16);
					return;
				}
				Static554.method8006(arg3, arg5, arg0, 8);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		Static365.method5397(arg0, arg3, arg5);
		if (local29.anInt948 == 1) {
			arg1.method1578(arg5, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;Lclient!dja;IIIIIIIII)V")
	public void method3028(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub25_2.method7146() == 0 && !Static602.method8660(arg6, arg3, Static559.anInt9430, arg5)) {
			return;
		}
		if (arg9 < this.anInt3431) {
			this.anInt3431 = arg9;
		}
		@Pc(35) Class55 local35 = Static536.aClass392_2.method9293(0, arg8);
		if (Static637.aClass5_Sub20_31.aClass24_Sub3_1.method1558() == 0 && local35.aBoolean76) {
			return;
		}
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg7 == 1 || arg7 == 3) {
			local62 = local35.anInt954;
			local65 = local35.anInt958;
		} else {
			local62 = local35.anInt958;
			local65 = local35.anInt954;
		}
		@Pc(89) int local89;
		@Pc(97) int local97;
		if (local62 + arg5 <= super.anInt3410) {
			local89 = (local62 >> 1) + arg5;
			local97 = (local62 + 1 >> 1) + arg5;
		} else {
			local97 = arg5 + 1;
			local89 = arg5;
		}
		@Pc(123) int local123;
		@Pc(131) int local131;
		if (super.anInt3416 >= arg3 + local65) {
			local123 = arg3 + (local65 >> 1);
			local131 = (local65 + 1 >> 1) + arg3;
		} else {
			local131 = arg3 + 1;
			local123 = arg3;
		}
		@Pc(143) Class22 local143 = Static242.aClass22Array3[arg6];
		@Pc(171) int local171 = local143.method8038(local123, local89) + local143.method8038(local123, local97) + local143.method8038(local131, local89) + local143.method8038(local131, local97) >> 2;
		@Pc(179) int local179 = (local62 << 8) + (arg5 << 9);
		@Pc(188) int local188 = (arg3 << 9) + (local65 << 8);
		@Pc(205) boolean local205 = Static10.aBoolean18 && !super.aBoolean274 && local35.aBoolean89;
		if (local35.method855((byte) 81)) {
			Static545.method7956(arg5, arg7, (Class8_Sub1_Sub3_Sub2_Sub2) null, arg9, (Class8_Sub1_Sub3_Sub2_Sub1) null, arg3, local35);
		}
		@Pc(262) boolean local262 = arg4 == -1 && local35.anInt934 == -1 && local35.lb == null && local35.anIntArray46 == null && !local35.aBoolean81 && !local35.aBoolean85;
		if (Static48.aBoolean65 && (Static8.method97(arg2) && local35.anInt916 != 1 || !(!Static316.method4803(arg2) || local35.anInt916 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(435) Class8_Sub1_Sub3 local435;
			@Pc(401) Class8_Sub1_Sub3_Sub4 local401;
			@Pc(439) int local439;
			@Pc(509) int local509;
			if (arg2 == 10 || arg2 == 11) {
				local401 = null;
				if (local262) {
					@Pc(431) Class8_Sub1_Sub3_Sub4 local431 = new Class8_Sub1_Sub3_Sub4(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, local205);
					local401 = local431;
					local435 = local431;
					local439 = local431.method5702(15144);
				} else {
					local435 = new Class8_Sub1_Sub3_Sub3(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, arg4);
					local439 = 15;
				}
				if (Static270.method4024(local435, false)) {
					if (local401 != null && local401.method8088(-9842)) {
						local401.method8090(arg0);
					}
					if (local35.aBoolean87 && Static10.aBoolean18) {
						if (local439 > 30) {
							local439 = 30;
						}
						for (local509 = 0; local509 <= local62; local509++) {
							for (@Pc(513) int local513 = 0; local513 <= local65; local513++) {
								local143.ka(local509 + arg5, arg3 + local513, local439);
							}
						}
					}
				}
				if (local35.anInt948 != 0 && arg1 != null) {
					arg1.method1591(arg5, !local35.aBoolean79, local65, local62, arg3, local35.aBoolean86);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local262) {
					local401 = new Class8_Sub1_Sub3_Sub4(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, local205);
					if (local401.method8088(-9842)) {
						local401.method8090(arg0);
					}
					local435 = local401;
				} else {
					local435 = new Class8_Sub1_Sub3_Sub3(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5 + local62 - 1, arg3, local65 + arg3 - 1, arg2, arg7, arg4);
				}
				Static270.method4024(local435, false);
				if (Static10.aBoolean18 && !super.aBoolean274 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg9 > 0 && local35.anInt916 != 0) {
					super.aByteArrayArrayArray12[arg9][arg5][arg3] = (byte) (super.aByteArrayArrayArray12[arg9][arg5][arg3] | 0x4);
				}
				if (local35.anInt948 != 0 && arg1 != null) {
					arg1.method1591(arg5, !local35.aBoolean79, local65, local62, arg3, local35.aBoolean86);
				}
			} else {
				@Pc(797) Class8_Sub1_Sub4 local797;
				if (arg2 == 0) {
					@Pc(769) int local769 = local35.anInt916;
					if (Static413.aBoolean551 && local35.anInt916 == -1) {
						local769 = 1;
					}
					if (local262) {
						@Pc(815) Class8_Sub1_Sub4_Sub2 local815 = new Class8_Sub1_Sub4_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, local205);
						local797 = local815;
						if (local815.method8088(-9842)) {
							local815.method8090(arg0);
						}
					} else {
						local797 = new Class8_Sub1_Sub4_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, arg4);
					}
					Static396.method5795(arg9, arg5, arg3, local797, (Class8_Sub1_Sub4) null);
					if (arg7 == 0) {
						if (Static10.aBoolean18 && local35.aBoolean87) {
							local143.ka(arg5, arg3, 50);
							local143.ka(arg5, arg3 + 1, 50);
						}
						if (local769 == 1 && !super.aBoolean274) {
							Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 1);
						}
					} else if (arg7 == 1) {
						if (Static10.aBoolean18 && local35.aBoolean87) {
							local143.ka(arg5, arg3 + 1, 50);
							local143.ka(arg5 + 1, arg3 + 1, 50);
						}
						if (local769 == 1 && !super.aBoolean274) {
							Static509.method7453(arg9, arg5, arg3 + 1, local35.anInt953, -local35.anInt906, 2);
						}
					} else if (arg7 == 2) {
						if (Static10.aBoolean18 && local35.aBoolean87) {
							local143.ka(arg5 + 1, arg3, 50);
							local143.ka(arg5 + 1, arg3 + 1, 50);
						}
						if (local769 == 1 && !super.aBoolean274) {
							Static509.method7453(arg9, arg5 + 1, arg3, local35.anInt953, -local35.anInt906, 1);
						}
					} else if (arg7 == 3) {
						if (Static10.aBoolean18 && local35.aBoolean87) {
							local143.ka(arg5, arg3, 50);
							local143.ka(arg5 + 1, arg3, 50);
						}
						if (local769 == 1 && !super.aBoolean274) {
							Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 2);
						}
					}
					if (local35.anInt948 != 0 && arg1 != null) {
						arg1.method1586(arg2, arg3, !local35.aBoolean79, local35.aBoolean86, arg5, arg7);
					}
					if (local35.anInt918 != 64) {
						Static332.method5052(arg9, arg5, arg3, local35.anInt918);
					}
				} else {
					@Pc(1117) Class8_Sub1_Sub4 local1117;
					@Pc(1135) Class8_Sub1_Sub4_Sub2 local1135;
					if (arg2 == 1) {
						if (local262) {
							local1135 = new Class8_Sub1_Sub4_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, local205);
							local1117 = local1135;
							if (local1135.method8088(-9842)) {
								local1135.method8090(arg0);
							}
						} else {
							local1117 = new Class8_Sub1_Sub4_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, arg4);
						}
						Static396.method5795(arg9, arg5, arg3, local1117, (Class8_Sub1_Sub4) null);
						if (local35.aBoolean87 && Static10.aBoolean18) {
							if (arg7 == 0) {
								local143.ka(arg5, arg3 + 1, 50);
							} else if (arg7 == 1) {
								local143.ka(arg5 + 1, arg3 + 1, 50);
							} else if (arg7 == 2) {
								local143.ka(arg5 + 1, arg3, 50);
							} else if (arg7 == 3) {
								local143.ka(arg5, arg3, 50);
							}
						}
						if (local35.anInt948 != 0 && arg1 != null) {
							arg1.method1586(arg2, arg3, !local35.aBoolean79, local35.aBoolean86, arg5, arg7);
						}
					} else if (arg2 == 2) {
						local439 = arg7 + 1 & 0x3;
						if (local262) {
							@Pc(1282) Class8_Sub1_Sub4_Sub2 local1282 = new Class8_Sub1_Sub4_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7 + 4, local205);
							@Pc(1298) Class8_Sub1_Sub4_Sub2 local1298 = new Class8_Sub1_Sub4_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, local439, local205);
							if (local1282.method8088(-9842)) {
								local1282.method8090(arg0);
							}
							local797 = local1298;
							local1117 = local1282;
							if (local1298.method8088(-9842)) {
								local1298.method8090(arg0);
							}
						} else {
							local1117 = new Class8_Sub1_Sub4_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7 + 4, arg4);
							local797 = new Class8_Sub1_Sub4_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, local439, arg4);
						}
						Static396.method5795(arg9, arg5, arg3, local1117, local797);
						if ((local35.anInt916 == 1 || Static413.aBoolean551 && local35.anInt916 == -1) && !super.aBoolean274) {
							if (arg7 == 0) {
								Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 1);
								Static509.method7453(arg9, arg5, arg3 + 1, local35.anInt953, local35.anInt906, 2);
							} else if (arg7 == 1) {
								Static509.method7453(arg9, arg5 + 1, arg3, local35.anInt953, local35.anInt906, 1);
								Static509.method7453(arg9, arg5, arg3 + 1, local35.anInt953, local35.anInt906, 2);
							} else if (arg7 == 2) {
								Static509.method7453(arg9, arg5 + 1, arg3, local35.anInt953, local35.anInt906, 1);
								Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 2);
							} else if (arg7 == 3) {
								Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 1);
								Static509.method7453(arg9, arg5, arg3, local35.anInt953, local35.anInt906, 2);
							}
						}
						if (local35.anInt948 != 0 && arg1 != null) {
							arg1.method1586(arg2, arg3, !local35.aBoolean79, local35.aBoolean86, arg5, arg7);
						}
						if (local35.anInt918 != 64) {
							Static332.method5052(arg9, arg5, arg3, local35.anInt918);
						}
					} else if (arg2 == 3) {
						if (local262) {
							local1135 = new Class8_Sub1_Sub4_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, local205);
							if (local1135.method8088(-9842)) {
								local1135.method8090(arg0);
							}
							local1117 = local1135;
						} else {
							local1117 = new Class8_Sub1_Sub4_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg2, arg7, arg4);
						}
						Static396.method5795(arg9, arg5, arg3, local1117, (Class8_Sub1_Sub4) null);
						if (local35.aBoolean87 && Static10.aBoolean18) {
							if (arg7 == 0) {
								local143.ka(arg5, arg3 + 1, 50);
							} else if (arg7 == 1) {
								local143.ka(arg5 + 1, arg3 + 1, 50);
							} else if (arg7 == 2) {
								local143.ka(arg5 + 1, arg3, 50);
							} else if (arg7 == 3) {
								local143.ka(arg5, arg3, 50);
							}
						}
						if (local35.anInt948 != 0 && arg1 != null) {
							arg1.method1586(arg2, arg3, !local35.aBoolean79, local35.aBoolean86, arg5, arg7);
						}
					} else if (arg2 == 9) {
						if (local262) {
							local401 = new Class8_Sub1_Sub3_Sub4(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5, arg3, arg3, arg2, arg7, local205);
							local435 = local401;
							if (local401.method8088(-9842)) {
								local401.method8090(arg0);
							}
						} else {
							local435 = new Class8_Sub1_Sub3_Sub3(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg5, arg5 + local62 - 1, arg3, arg3 + local65 - 1, arg2, arg7, arg4);
						}
						Static270.method4024(local435, false);
						if (local35.anInt916 == 1 && !super.aBoolean274) {
							@Pc(1805) byte local1805;
							if ((arg7 & 0x1) == 0) {
								local1805 = 8;
							} else {
								local1805 = 16;
							}
							Static509.method7453(arg9, arg5, arg3, local35.anInt953, 0, local1805);
						}
						if (local35.anInt948 != 0 && arg1 != null) {
							arg1.method1591(arg5, !local35.aBoolean79, local65, local62, arg3, local35.aBoolean86);
						}
						if (local35.anInt918 != 64) {
							Static332.method5052(arg9, arg5, arg3, local35.anInt918);
						}
					} else {
						@Pc(1885) Class8_Sub1_Sub2 local1885;
						if (arg2 == 4) {
							if (local262) {
								@Pc(1904) Class8_Sub1_Sub2_Sub2 local1904 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, arg7);
								if (local1904.method8088(-9842)) {
									local1904.method8090(arg0);
								}
								local1885 = local1904;
							} else {
								local1885 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, arg7, arg4);
							}
							Static573.method8236(arg9, arg5, arg3, local1885, (Class8_Sub1_Sub2) null);
						} else {
							@Pc(1930) int local1930;
							@Pc(1936) Interface16 local1936;
							@Pc(2003) Class8_Sub1_Sub2_Sub2 local2003;
							if (arg2 == 5) {
								local1930 = 65;
								local1936 = (Interface16) Static87.method1318(arg9, arg5, arg3);
								if (local1936 != null) {
									local1930 = Static536.aClass392_2.method9293(0, local1936.method8089()).anInt918 + 1;
								}
								if (local262) {
									local2003 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, Static196.anIntArray183[arg7] * local1930, local1930 * Static19.anIntArray21[arg7], arg2, arg7);
									if (local2003.method8088(-9842)) {
										local2003.method8090(arg0);
									}
									local1885 = local2003;
								} else {
									local1885 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, local1930 * Static196.anIntArray183[arg7], local1930 * Static19.anIntArray21[arg7], arg2, arg7, arg4);
								}
								Static573.method8236(arg9, arg5, arg3, local1885, (Class8_Sub1_Sub2) null);
							} else if (arg2 == 6) {
								local1930 = 33;
								local1936 = (Interface16) Static87.method1318(arg9, arg5, arg3);
								if (local1936 != null) {
									local1930 = Static536.aClass392_2.method9293(0, local1936.method8089()).anInt918 / 2 + 1;
								}
								if (local262) {
									local2003 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, local1930 * Static196.anIntArray183[arg7], local1930 * Static19.anIntArray21[arg7], arg2, arg7 + 4);
									if (local2003.method8088(-9842)) {
										local2003.method8090(arg0);
									}
									local1885 = local2003;
								} else {
									local1885 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, Static110.anIntArray99[arg7] * local1930, Static502.anIntArray492[arg7] * local1930, arg2, arg7 + 4, arg4);
								}
								Static573.method8236(arg9, arg5, arg3, local1885, (Class8_Sub1_Sub2) null);
							} else if (arg2 == 7) {
								local1930 = arg7 + 2 & 0x3;
								if (local262) {
									@Pc(2157) Class8_Sub1_Sub2_Sub2 local2157 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, local1930 + 4);
									if (local2157.method8088(-9842)) {
										local2157.method8090(arg0);
									}
									local1885 = local2157;
								} else {
									local1885 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, local1930 + 4, arg4);
								}
								Static573.method8236(arg9, arg5, arg3, local1885, (Class8_Sub1_Sub2) null);
							} else if (arg2 == 8) {
								local439 = arg7 + 2 & 0x3;
								local509 = 33;
								@Pc(2217) Interface16 local2217 = (Interface16) Static87.method1318(arg9, arg5, arg3);
								if (local2217 != null) {
									local509 = Static536.aClass392_2.method9293(0, local2217.method8089()).anInt918 / 2 + 1;
								}
								@Pc(2260) Class8_Sub1_Sub2 local2260;
								@Pc(2279) Class8_Sub1_Sub2 local2279;
								if (local262) {
									local2260 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, Static110.anIntArray99[arg7] * local509, local509 * Static502.anIntArray492[arg7], arg2, arg7 + 4);
									local2279 = new Class8_Sub1_Sub2_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, local439 + 4);
									if (local2260.method8088(-9842)) {
										local2260.method8090(arg0);
									}
									if (local2279.method8088(-9842)) {
										local2279.method8090(arg0);
									}
								} else {
									local2260 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, local509 * Static110.anIntArray99[arg7], local509 * Static502.anIntArray492[arg7], arg2, arg7 + 4, arg4);
									local2279 = new Class8_Sub1_Sub2_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, 0, 0, arg2, local439 + 4, arg4);
								}
								Static573.method8236(arg9, arg5, arg3, local2260, local2279);
							}
						}
					}
				}
			}
		} else if (Static637.aClass5_Sub20_31.aClass24_Sub18_1.method6492() != 0 || local35.anInt951 != 0 || local35.anInt948 == 1 || local35.aBoolean91) {
			@Pc(351) Class8_Sub1_Sub1 local351;
			if (local262) {
				@Pc(339) Class8_Sub1_Sub1_Sub1 local339 = new Class8_Sub1_Sub1_Sub1(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg7, local205);
				if (local339.method8088(-9842)) {
					local339.method8090(arg0);
				}
				local351 = local339;
			} else {
				local351 = new Class8_Sub1_Sub1_Sub2(arg0, local35, arg9, arg6, local179, local171, local188, super.aBoolean274, arg7, arg4);
			}
			Static149.method2105(arg9, arg5, arg3, local351);
			if (local35.anInt948 == 1 && arg1 != null) {
				arg1.method1573(arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IBLclient!ha;[Lclient!dja;I[B)V")
	public void method3029(@OriginalArg(0) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) Class88[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) Class5_Sub23 local15 = new Class5_Sub23(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method8542();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method8499();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method8529();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg3 + local54;
				@Pc(79) int local79 = local48 + arg0;
				if (local74 > 0 && local79 > 0 && super.anInt3410 - 1 > local74 && local79 < super.anInt3416 - 1) {
					@Pc(109) Class88 local109 = null;
					if (!super.aBoolean274) {
						@Pc(114) int local114 = local58;
						if ((Static220.aByteArrayArrayArray14[1][local74][local79] & 0x2) == 2) {
							local114 = local58 - 1;
						}
						if (local114 >= 0) {
							local109 = arg2[local114];
						}
					}
					this.method3028(arg1, local109, local66, local79, -1, local74, local58, local70, local17, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!ib;Lclient!ha;II[I)V")
	public void method3030(@OriginalArg(1) Class5_Sub23 arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean274) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(19) Class120 local19 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(31) int local31;
					@Pc(146) int local146;
					@Pc(595) int local595;
					@Pc(163) int local163;
					@Pc(167) int local167;
					while (arg0.aByteArray102.length > arg0.anInt9869) {
						local31 = arg0.method8529();
						if (local31 == 0) {
							local19 = new Class120(arg0);
						} else {
							@Pc(169) int local169;
							@Pc(207) int local207;
							@Pc(490) int local490;
							if (local31 == 1) {
								local146 = arg0.method8529();
								if (local146 > 0) {
									for (local595 = 0; local595 < local146; local595++) {
										@Pc(604) Class2 local604 = new Class2(arg1, arg0, 2);
										if (local604.anInt13 == 31) {
											@Pc(615) Class386 local615 = Static565.aClass363_33.method8765(arg0.method8519());
											local604.method22(local615.anInt10651, local615.anInt10654, local615.anInt10652, local615.anInt10655);
										}
										if (arg1.method7721() > 0) {
											@Pc(632) Class5_Sub43 local632 = local604.aClass5_Sub43_1;
											local169 = (arg3 << 9) + local632.method8251();
											local207 = local632.method8255() + (arg2 << 9);
											local490 = local169 >> 9;
											@Pc(657) int local657 = local207 >> 9;
											if (local490 >= 0 && local657 >= 0 && local490 < super.anInt3410 && local657 < super.anInt3416) {
												local632.method8252(super.anIntArrayArrayArray9[local604.anInt14][local490][local657] - local632.method8257(), local169, local207);
												Static529.method7632(local604);
											}
										}
									}
								}
							} else if (local31 == 2) {
								if (local19 == null) {
									local19 = new Class120();
								}
								local19.method2197(arg0);
							} else if (local31 != 128) {
								if (local31 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								local12 = true;
								for (local146 = 0; local146 < 4; local146++) {
									@Pc(152) byte local152 = arg0.method8488();
									if (local152 == 0 && super.aByteArrayArrayArray11[local146] != null) {
										local163 = arg3;
										local167 = arg3 + 64;
										local169 = arg2;
										if (arg3 < 0) {
											local163 = 0;
										} else if (super.anInt3410 <= arg3) {
											local163 = super.anInt3410;
										}
										if (arg2 < 0) {
											local169 = 0;
										} else if (super.anInt3416 <= arg2) {
											local169 = super.anInt3416;
										}
										local207 = arg2 + 64;
										if (local167 < 0) {
											local167 = 0;
										} else if (super.anInt3410 <= local167) {
											local167 = super.anInt3410;
										}
										if (local207 < 0) {
											local207 = 0;
										} else if (local207 >= super.anInt3416) {
											local207 = super.anInt3416;
										}
										while (local167 > local163) {
											while (local207 > local169) {
												super.aByteArrayArrayArray11[local146][local163][local169] = 0;
												local169++;
											}
											local163++;
										}
									} else if (local152 == 1) {
										if (super.aByteArrayArrayArray11[local146] == null) {
											super.aByteArrayArrayArray11[local146] = new byte[super.anInt3410 + 1][super.anInt3416 + 1];
										}
										for (local163 = 0; local163 < 64; local163 += 4) {
											for (local167 = 0; local167 < 64; local167 += 4) {
												@Pc(479) byte local479 = arg0.method8488();
												for (local207 = arg3 + local163; local207 < arg3 + local163 + 4; local207++) {
													for (local490 = local167 + arg2; local490 < arg2 + local167 + 4; local490++) {
														if (local207 >= 0 && local207 < super.anInt3410 && local490 >= 0 && local490 < super.anInt3416) {
															super.aByteArrayArrayArray11[local146][local207][local490] = local479;
														}
													}
												}
											}
										}
									} else if (local152 == 2) {
										if (super.aByteArrayArrayArray11[local146] == null) {
											super.aByteArrayArrayArray11[local146] = new byte[super.anInt3410 + 1][super.anInt3416 + 1];
										}
										if (local146 > 0) {
											local163 = arg3;
											local167 = arg3 + 64;
											local169 = arg2;
											if (arg2 < 0) {
												local169 = 0;
											} else if (super.anInt3416 <= arg2) {
												local169 = super.anInt3416;
											}
											if (local167 < 0) {
												local167 = 0;
											} else if (super.anInt3410 <= local167) {
												local167 = super.anInt3410;
											}
											if (arg3 < 0) {
												local163 = 0;
											} else if (super.anInt3410 <= arg3) {
												local163 = super.anInt3410;
											}
											local207 = arg2 + 64;
											if (local207 < 0) {
												local207 = 0;
											} else if (super.anInt3416 <= local207) {
												local207 = super.anInt3416;
											}
											while (local167 > local163) {
												while (local169 < local207) {
													super.aByteArrayArrayArray11[local146][local163][local169] = super.aByteArrayArrayArray11[local146 - 1][local163][local169];
													local169++;
												}
												local163++;
											}
										}
									}
								}
							} else if (arg4 == null) {
								arg0.anInt9869 += 10;
							} else {
								arg4[0] = arg0.method8519();
								arg4[1] = arg0.method8516();
								arg4[2] = arg0.method8516();
								arg4[3] = arg0.method8516();
								arg4[4] = arg0.method8519();
							}
						}
					}
					if (local19 != null) {
						for (local31 = 0; local31 < 8; local31++) {
							for (local146 = 0; local146 < 8; local146++) {
								local595 = local31 + (arg3 >> 3);
								local163 = (arg2 >> 3) + local146;
								if (local595 >= 0 && super.anInt3410 >> 3 > local595 && local163 >= 0 && local163 < super.anInt3416 >> 3) {
									Static554.method8008(local595, local163, local19);
								}
							}
						}
					}
					if (!local12 && super.aByteArrayArrayArray11 != null) {
						for (local31 = 0; local31 < 4; local31++) {
							if (super.aByteArrayArrayArray11[local31] != null) {
								for (local146 = 0; local146 < 16; local146++) {
									for (local595 = 0; local595 < 16; local595++) {
										local163 = local146 + (arg3 >> 2);
										local167 = local595 + (arg2 >> 2);
										if (local163 >= 0 && local163 < 26 && local167 >= 0 && local167 < 26) {
											super.aByteArrayArrayArray11[local31][local163][local167] = 0;
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
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLclient!ha;Z)V")
	public void method3031(@OriginalArg(1) Class57 arg0, @OriginalArg(2) boolean arg1) {
		Static630.method8821();
		if (!arg1) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt3423 > 1) {
				for (local18 = 0; local18 < super.anInt3410; local18++) {
					for (local22 = 0; super.anInt3416 > local22; local22++) {
						if ((Static220.aByteArrayArrayArray14[1][local18][local22] & 0x2) == 2) {
							Static651.method9034(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; super.anInt3423 > local18; local18++) {
				for (local22 = 0; super.anInt3416 >= local22; local22++) {
					for (@Pc(70) int local70 = 0; super.anInt3410 >= local70; local70++) {
						if ((super.aByteArrayArrayArray12[local18][local70][local22] & 0x4) != 0) {
							@Pc(87) int local87 = local70;
							@Pc(89) int local89 = local70;
							@Pc(91) int local91 = local22;
							@Pc(93) int local93 = local22;
							while (local91 > 0 && (super.aByteArrayArrayArray12[local18][local70][local91 - 1] & 0x4) != 0 && local22 - local91 < 10) {
								local91--;
							}
							while (local93 < super.anInt3416 && (super.aByteArrayArrayArray12[local18][local70][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(175) int local175;
							label111: while (local87 > 0 && local70 - local87 < 10) {
								for (local175 = local91; local175 <= local93; local175++) {
									if ((super.aByteArrayArrayArray12[local18][local87 - 1][local175] & 0x4) == 0) {
										break label111;
									}
								}
								local87--;
							}
							label98: while (super.anInt3410 > local89 && local89 - local87 < 10) {
								for (local175 = local91; local175 <= local93; local175++) {
									if ((super.aByteArrayArrayArray12[local18][local89 + 1][local175] & 0x4) == 0) {
										break label98;
									}
								}
								local89++;
							}
							if ((local93 + 1 - local91) * (-local87 + 1 + local89) >= 4) {
								local175 = super.anIntArrayArrayArray9[local18][local87][local91];
								Static332.method5055(local91 << 9, local175, local18, (local93 << 9) + 512, local87 << 9, local175, (local89 << 9) + 512);
								for (@Pc(337) int local337 = local87; local337 <= local89; local337++) {
									for (@Pc(341) int local341 = local91; local341 <= local93; local341++) {
										super.aByteArrayArrayArray12[local18][local337][local341] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static414.method6218();
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIIIILclient!ha;IILclient!ib;[I)V")
	public void method3032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5_Sub23 arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean274) {
			return;
		}
		@Pc(14) Class120 local14 = null;
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(28) int local28 = (arg7 & 0x7) * 8;
		@Pc(39) int local39 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(57) int local57;
			@Pc(113) int local113;
			@Pc(163) int local163;
			@Pc(181) int local181;
			@Pc(61) int local61;
			@Pc(107) int local107;
			label233: do {
				while (true) {
					@Pc(44) int local44;
					@Pc(317) int local317;
					while (arg8.anInt9869 < arg8.aByteArray102.length) {
						local44 = arg8.method8529();
						if (local44 == 0) {
							local14 = new Class120(arg8);
						} else {
							if (local44 == 1) {
								local57 = arg8.method8529();
								continue label233;
							}
							if (local44 == 2) {
								if (local14 == null) {
									local14 = new Class120();
								}
								local14.method2197(arg8);
							} else if (local44 != 128) {
								if (local44 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local57 = 0; local57 < 4; local57++) {
									@Pc(277) byte local277 = arg8.method8488();
									@Pc(321) int local321;
									if (local277 == 0 && super.aByteArrayArrayArray11[arg4] != null) {
										if (arg3 >= local57) {
											local317 = arg1;
											local321 = arg1 + 7;
											local107 = arg2;
											local113 = arg2 + 7;
											if (local321 < 0) {
												local321 = 0;
											} else if (local321 >= super.anInt3410) {
												local321 = super.anInt3410;
											}
											if (arg2 < 0) {
												local107 = 0;
											} else if (super.anInt3416 <= arg2) {
												local107 = super.anInt3416;
											}
											if (arg1 < 0) {
												local317 = 0;
											} else if (super.anInt3410 <= arg1) {
												local317 = super.anInt3410;
											}
											if (local113 < 0) {
												local113 = 0;
											} else if (local113 >= super.anInt3416) {
												local113 = super.anInt3416;
											}
											while (local321 > local317) {
												while (local107 < local113) {
													super.aByteArrayArrayArray11[arg4][local317][local107] = 0;
													local107++;
												}
												local317++;
											}
										}
									} else if (local277 == 1) {
										if (super.aByteArrayArrayArray11[arg4] == null) {
											super.aByteArrayArrayArray11[arg4] = new byte[super.anInt3410 + 1][super.anInt3416 + 1];
										}
										for (local317 = 0; local317 < 64; local317 += 4) {
											for (local321 = 0; local321 < 64; local321 += 4) {
												@Pc(327) byte local327 = arg8.method8488();
												if (local57 <= arg3) {
													for (local113 = local317; local113 < local317 + 4; local113++) {
														for (local163 = local321; local163 < local321 + 4; local163++) {
															if (local28 <= local113 && local28 + 8 > local113 && local39 <= local163 && local39 < local39 + 8) {
																local181 = arg1 + Static289.method9259(local113 & 0x7, arg6, local163 & 0x7);
																@Pc(396) int local396 = arg2 + Static345.method5214(arg6, local113 & 0x7, local163 & 0x7);
																if (local181 >= 0 && super.anInt3410 > local181 && local396 >= 0 && local396 < super.anInt3416) {
																	super.aByteArrayArrayArray11[arg4][local181][local396] = local327;
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
								arg8.anInt9869 += 10;
							} else {
								arg9[0] = arg8.method8519();
								arg9[1] = arg8.method8516();
								arg9[2] = arg8.method8516();
								arg9[3] = arg8.method8516();
								arg9[4] = arg8.method8519();
							}
						}
					}
					if (local14 != null) {
						Static554.method8008(arg1 >> 3, arg2 >> 3, local14);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg4] != null) {
						local44 = arg1 + 7;
						local57 = arg2 + 7;
						for (local61 = arg1; local61 < local44; local61++) {
							for (local317 = arg2; local317 < local57; local317++) {
								super.aByteArrayArrayArray11[arg4][local61][local317] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local57 <= 0);
			for (local61 = 0; local61 < local57; local61++) {
				@Pc(70) Class2 local70 = new Class2(arg5, arg8, 2);
				if (local70.anInt13 == 31) {
					@Pc(81) Class386 local81 = Static565.aClass363_33.method8765(arg8.method8519());
					local70.method22(local81.anInt10651, local81.anInt10654, local81.anInt10652, local81.anInt10655);
				}
				if (arg5.method7721() > 0) {
					@Pc(101) Class5_Sub43 local101 = local70.aClass5_Sub43_1;
					local107 = local101.method8251() >> 9;
					local113 = local101.method8255() >> 9;
					if (arg3 == local70.anInt14 && local107 >= local28 && local28 + 8 > local107 && local113 >= local39 && local113 < local39 + 8) {
						local163 = Static496.method7145(local101.method8251() & 0xFFF, local101.method8255() & 0xFFF, arg6) + (arg1 << 9);
						local181 = Static368.method5414(local101.method8255() & 0xFFF, arg6, local101.method8251() & 0xFFF) + (arg2 << 9);
						local107 = local163 >> 9;
						local113 = local181 >> 9;
						if (local107 >= 0 && local113 >= 0 && local107 < super.anInt3410 && local113 < super.anInt3416) {
							local101.method8252(super.anIntArrayArrayArray9[arg3][local107][local113] - local101.method8257(), local163, local181);
							Static529.method7632(local70);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IIIII)Lclient!nda;")
	public Interface16 method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface16 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface16) Static87.method1318(arg0, arg3, arg2);
		}
		if (arg1 == 1) {
			local5 = (Interface16) Static532.method7888(arg0, arg3, arg2);
		}
		if (arg1 == 2) {
			local5 = (Interface16) Static465.method5496(arg0, arg3, arg2, Static209.aClass10 == null ? (Static209.aClass10 = a("nda")) : Static209.aClass10);
		}
		if (arg1 == 3) {
			local5 = (Interface16) Static209.method3036(arg0, arg3, arg2);
		}
		return local5;
	}
}
