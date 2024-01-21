import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1244 = Static151.method2243("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
	public static int anInt3523 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public static void method2430() {
		@Pc(3) int local3 = Static123.anIntArray402[Static152.anInt3231];
		@Pc(7) Class84[] local7 = Static123.aClass84ArrayArray11[Static152.anInt3231];
		Static115.anInt2531 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class84 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3473 == 1) {
				local27 = local16.anInt3478 + Static182.anInt3830 - Static140.anInt3022;
				if (local27 >= 0 && local27 <= Static182.anInt3830 + Static182.anInt3830) {
					local42 = local16.anInt3475 + Static182.anInt3830 - Static2.anInt78;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3477 + Static182.anInt3830 - Static2.anInt78;
					if (local53 > Static182.anInt3830 + Static182.anInt3830) {
						local53 = Static182.anInt3830 + Static182.anInt3830;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static7.aBooleanArrayArray4[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static189.anInt3928 - local16.anInt3484;
						if (local85 > 32) {
							local16.anInt3481 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3481 = 2;
							local85 = -local85;
						}
						local16.anInt3472 = (local16.anInt3482 - Static172.anInt679 << 8) / local85;
						local16.anInt3480 = (local16.anInt3470 - Static172.anInt679 << 8) / local85;
						local16.anInt3485 = (local16.anInt3483 - Static52.anInt1112 << 8) / local85;
						local16.anInt3469 = (local16.anInt3479 - Static52.anInt1112 << 8) / local85;
						Static164.aClass84Array1[Static115.anInt2531++] = local16;
					}
				}
			} else if (local16.anInt3473 == 2) {
				local27 = local16.anInt3475 + Static182.anInt3830 - Static2.anInt78;
				if (local27 >= 0 && local27 <= Static182.anInt3830 + Static182.anInt3830) {
					local42 = local16.anInt3478 + Static182.anInt3830 - Static140.anInt3022;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3489 + Static182.anInt3830 - Static140.anInt3022;
					if (local53 > Static182.anInt3830 + Static182.anInt3830) {
						local53 = Static182.anInt3830 + Static182.anInt3830;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static7.aBooleanArrayArray4[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static172.anInt679 - local16.anInt3482;
						if (local85 > 32) {
							local16.anInt3481 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3481 = 4;
							local85 = -local85;
						}
						local16.anInt3487 = (local16.anInt3484 - Static189.anInt3928 << 8) / local85;
						local16.anInt3471 = (local16.anInt3474 - Static189.anInt3928 << 8) / local85;
						local16.anInt3485 = (local16.anInt3483 - Static52.anInt1112 << 8) / local85;
						local16.anInt3469 = (local16.anInt3479 - Static52.anInt1112 << 8) / local85;
						Static164.aClass84Array1[Static115.anInt2531++] = local16;
					}
				}
			} else if (local16.anInt3473 == 4) {
				local27 = local16.anInt3483 - Static52.anInt1112;
				if (local27 > 128) {
					local42 = local16.anInt3475 + Static182.anInt3830 - Static2.anInt78;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3477 + Static182.anInt3830 - Static2.anInt78;
					if (local53 > Static182.anInt3830 + Static182.anInt3830) {
						local53 = Static182.anInt3830 + Static182.anInt3830;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3478 + Static182.anInt3830 - Static140.anInt3022;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3489 + Static182.anInt3830 - Static140.anInt3022;
						if (local85 > Static182.anInt3830 + Static182.anInt3830) {
							local85 = Static182.anInt3830 + Static182.anInt3830;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static7.aBooleanArrayArray4[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3481 = 5;
							local16.anInt3487 = (local16.anInt3484 - Static189.anInt3928 << 8) / local27;
							local16.anInt3471 = (local16.anInt3474 - Static189.anInt3928 << 8) / local27;
							local16.anInt3472 = (local16.anInt3482 - Static172.anInt679 << 8) / local27;
							local16.anInt3480 = (local16.anInt3470 - Static172.anInt679 << 8) / local27;
							Static164.aClass84Array1[Static115.anInt2531++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)V")
	public static void method2431(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static125.anInt2769; local20++) {
			if (arg0 == Static161.aLongArray10[local20]) {
				Static125.anInt2769--;
				for (@Pc(38) int local38 = local20; local38 < Static125.anInt2769; local38++) {
					Static161.aLongArray10[local38] = Static161.aLongArray10[local38 + 1];
					Static86.aClass62Array104[local38] = Static86.aClass62Array104[local38 + 1];
				}
				Static104.anInt2337 = Static11.anInt305;
				Static58.aClass2_Sub11_Sub1_2.method1595(216);
				Static58.aClass2_Sub11_Sub1_2.method1527(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method2432(@OriginalArg(1) Class62 arg0) {
		try {
			Static203.anApplet_Sub1_1.getAppletContext().showDocument(arg0.method1879(Static203.anApplet_Sub1_1.getCodeBase()), "_blank");
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!pb;B)[Lclient!hh;")
	public static Class42[] method2433(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		return Static39.method3119(arg0, arg1) ? Static65.method900() : null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!og;BI)V")
	public static void method2435(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if ((arg2 & 0x20) != 0) {
			arg1.anInt3052 = Static108.aClass2_Sub11_Sub1_3.method1557();
			arg1.anInt3083 = Static108.aClass2_Sub11_Sub1_3.method1548();
		}
		@Pc(34) int local34;
		if ((arg2 & 0x4) != 0) {
			local34 = Static108.aClass2_Sub11_Sub1_3.method1581();
			@Pc(37) byte[] local37 = new byte[local34];
			@Pc(42) Class2_Sub11 local42 = new Class2_Sub11(local37);
			Static108.aClass2_Sub11_Sub1_3.method1567(local37, local34);
			Static169.aClass2_Sub11Array1[arg0] = local42;
			arg1.method2180(local42);
		}
		@Pc(73) int local73;
		if ((arg2 & 0x40) != 0) {
			local34 = Static108.aClass2_Sub11_Sub1_3.method1548();
			local73 = Static108.aClass2_Sub11_Sub1_3.method1529();
			@Pc(77) int local77 = Static108.aClass2_Sub11_Sub1_3.method1534();
			@Pc(80) int local80 = Static108.aClass2_Sub11_Sub1_3.anInt2235;
			if (arg1.aClass62_1072 != null && arg1.aClass28_2 != null) {
				@Pc(91) long local91 = arg1.aClass62_1072.method1843();
				@Pc(93) boolean local93 = false;
				if (local73 <= 1) {
					for (@Pc(100) int local100 = 0; local100 < Static125.anInt2769; local100++) {
						if (local91 == Static161.aLongArray10[local100]) {
							local93 = true;
							break;
						}
					}
				}
				if (!local93 && Static23.anInt556 == 0) {
					Static72.aClass2_Sub11_1.anInt2235 = 0;
					@Pc(136) int local136 = -1;
					Static108.aClass2_Sub11_Sub1_3.method1541(Static72.aClass2_Sub11_1.aByteArray26, local77);
					Static72.aClass2_Sub11_1.anInt2235 = 0;
					@Pc(156) boolean local156 = (local34 & 0x8000) != 0;
					@Pc(175) Class62 local175;
					if (local156) {
						local34 &= 0x7FFF;
						@Pc(166) Class102 local166 = Static111.method1703(Static72.aClass2_Sub11_1);
						local136 = local166.anInt4174;
						local175 = local166.aClass2_Sub1_Sub3_1.method334(Static72.aClass2_Sub11_1);
					} else {
						local175 = Static98.method1378(Static207.method3008(Static72.aClass2_Sub11_1).method1867());
					}
					arg1.aClass62_1066 = local175.method1846();
					arg1.anInt3090 = 150;
					arg1.anInt3063 = local34 & 0xFF;
					arg1.anInt3049 = local34 >> 8;
					if (local73 == 2) {
						Static38.method2178(local136, local175, local156 ? 17 : 1, Static169.method2460(new Class62[] { Static162.aClass62_1223, arg1.aClass62_1072 }), null);
					} else if (local73 == 1) {
						Static38.method2178(local136, local175, local156 ? 17 : 1, Static169.method2460(new Class62[] { Static143.aClass62_1060, arg1.aClass62_1072 }), null);
					} else {
						Static38.method2178(local136, local175, local156 ? 17 : 2, arg1.aClass62_1072, null);
					}
				}
			}
			Static108.aClass2_Sub11_Sub1_3.anInt2235 = local80 + local77;
		}
		if ((arg2 & 0x400) != 0) {
			arg1.anInt3076 = Static108.aClass2_Sub11_Sub1_3.method1529();
			arg1.anInt3047 = Static108.aClass2_Sub11_Sub1_3.method1581();
			arg1.anInt3059 = Static108.aClass2_Sub11_Sub1_3.method1550();
			arg1.anInt3058 = Static108.aClass2_Sub11_Sub1_3.method1581();
			arg1.anInt3069 = Static108.aClass2_Sub11_Sub1_3.method1562() + Static25.anInt581;
			arg1.anInt3100 = Static108.aClass2_Sub11_Sub1_3.method1562() + Static25.anInt581;
			arg1.anInt3061 = Static108.aClass2_Sub11_Sub1_3.method1534();
			arg1.anInt3086 = 0;
			arg1.anInt3064 = 1;
		}
		if ((arg2 & 0x8) != 0) {
			arg1.aClass62_1066 = Static108.aClass2_Sub11_Sub1_3.method1538();
			if (arg1.aClass62_1066.method1857(0) == 126) {
				arg1.aClass62_1066 = arg1.aClass62_1066.method1849(1);
				Static154.method2292(arg1.aClass62_1066, 2, arg1.aClass62_1072);
			} else if (arg1 == Static186.aClass7_Sub2_Sub2_1) {
				Static154.method2292(arg1.aClass62_1066, 2, arg1.aClass62_1072);
			}
			arg1.anInt3090 = 150;
			arg1.anInt3049 = 0;
			arg1.anInt3063 = 0;
		}
		if ((arg2 & 0x80) != 0) {
			arg1.anInt3067 = Static108.aClass2_Sub11_Sub1_3.method1548();
			if (arg1.anInt3067 == 65535) {
				arg1.anInt3067 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			local34 = Static108.aClass2_Sub11_Sub1_3.method1550();
			local73 = Static108.aClass2_Sub11_Sub1_3.method1550();
			arg1.method2171(local34, Static25.anInt581, local73);
		}
		if ((arg2 & 0x10) != 0) {
			local34 = Static108.aClass2_Sub11_Sub1_3.method1548();
			local73 = Static108.aClass2_Sub11_Sub1_3.method1529();
			if (local34 == 65535) {
				local34 = -1;
			}
			Static31.method537(local73, local34, arg1);
		}
		if ((arg2 & 0x2) != 0) {
			local34 = Static108.aClass2_Sub11_Sub1_3.method1581();
			local73 = Static108.aClass2_Sub11_Sub1_3.method1534();
			arg1.method2171(local34, Static25.anInt581, local73);
			arg1.anInt3045 = Static25.anInt581 + 300;
			arg1.anInt3065 = Static108.aClass2_Sub11_Sub1_3.method1534();
		}
		if ((arg2 & 0x200) == 0) {
			return;
		}
		arg1.anInt3091 = Static108.aClass2_Sub11_Sub1_3.method1548();
		local34 = Static108.aClass2_Sub11_Sub1_3.method1575();
		arg1.anInt3070 = (local34 & 0xFFFF) + Static25.anInt581;
		if (arg1.anInt3091 == 65535) {
			arg1.anInt3091 = -1;
		}
		arg1.anInt3079 = local34 >> 16;
		arg1.anInt3078 = 0;
		arg1.anInt3099 = 0;
		if (arg1.anInt3070 > Static25.anInt581) {
			arg1.anInt3099 = -1;
			return;
		}
	}
}
