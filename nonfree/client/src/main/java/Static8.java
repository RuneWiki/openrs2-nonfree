import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!ib;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!sb;")
	public static Class25 aClass25_19;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "J")
	public static long aLong9;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
	public static int anInt299 = 0;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!ad;")
	private static Class4 aClass4_154 = Static75.method1216("Welcome to RuneScape");

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!ba", name = "H", descriptor = "Lclient!ad;")
	private static Class4 aClass4_155 = Static75.method1216("Attack");

	@OriginalMember(owner = "client!ba", name = "J", descriptor = "Lclient!ad;")
	public static Class4 aClass4_156 = aClass4_155;

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "Lclient!ad;")
	public static Class4 aClass4_157 = aClass4_154;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V")
	public static void method189() {
		if (Static11.anInt2850 > 1) {
			Static11.anInt2850--;
		}
		if (Static112.anInt2839 > 0) {
			Static112.anInt2839--;
		}
		if (Static11.aBoolean251) {
			Static11.aBoolean251 = false;
			Static112.method1925();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static54.method902(); local27++) {
		}
		if (Static20.anInt479 != 30 && Static20.anInt479 != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Static100.aBoolean209 && Static20.anInt479 == 30) {
			Static77.anInt1842 = 0;
			Static49.anInt1204 = 0;
			while (Static95.method1502()) {
			}
			for (local66 = 0; local66 < Static39.aBooleanArray8.length; local66++) {
				Static39.aBooleanArray8[local66] = false;
			}
		}
		Static74.method1188(Static5.aClass3_Sub4_Sub1_1);
		@Pc(88) Object local88 = Static28.aClass37_1.anObject1;
		@Pc(125) int local125;
		@Pc(114) int local114;
		@Pc(127) int local127;
		@Pc(148) int local148;
		synchronized (Static28.aClass37_1.anObject1) {
			if (!Static11.aBoolean252) {
				Static28.aClass37_1.anInt1165 = 0;
			} else if (Static77.anInt1842 != 0 || Static28.aClass37_1.anInt1165 >= 40) {
				local114 = 0;
				Static5.aClass3_Sub4_Sub1_1.method464(236);
				Static5.aClass3_Sub4_Sub1_1.method423(0);
				local125 = Static5.aClass3_Sub4_Sub1_1.anInt627;
				@Pc(143) int local143;
				for (local127 = 0; local127 < Static28.aClass37_1.anInt1165 && Static5.aClass3_Sub4_Sub1_1.anInt627 - local125 < 240; local127++) {
					local143 = Static28.aClass37_1.anIntArray161[local127];
					local148 = Static28.aClass37_1.anIntArray160[local127];
					local114++;
					if (local143 < 0) {
						local143 = 0;
					} else if (local143 > 502) {
						local143 = 502;
					}
					if (local148 < 0) {
						local148 = 0;
					} else if (local148 > 764) {
						local148 = 764;
					}
					@Pc(183) int local183 = local143 * 765 + local148;
					if (Static28.aClass37_1.anIntArray161[local127] == -1 && Static28.aClass37_1.anIntArray160[local127] == -1) {
						local183 = 524287;
						local143 = -1;
						local148 = -1;
					}
					if (local148 != Static6.anInt258 || Static65.anInt1629 != local143) {
						@Pc(226) int local226 = local148 - Static6.anInt258;
						Static6.anInt258 = local148;
						@Pc(233) int local233 = local143 - Static65.anInt1629;
						Static65.anInt1629 = local143;
						if (Static31.anInt951 < 8 && local226 >= -32 && local226 <= 31 && local233 >= -32 && local233 <= 31) {
							local233 += 32;
							local226 += 32;
							Static5.aClass3_Sub4_Sub1_1.method455(local233 + (Static31.anInt951 << 12) + (local226 << 6));
							Static31.anInt951 = 0;
						} else if (Static31.anInt951 < 8) {
							Static5.aClass3_Sub4_Sub1_1.method441((Static31.anInt951 << 19) + local183 + 8388608);
							Static31.anInt951 = 0;
						} else {
							Static5.aClass3_Sub4_Sub1_1.method424((Static31.anInt951 << 19) + local183 - 1073741824);
							Static31.anInt951 = 0;
						}
					} else if (Static31.anInt951 < 2047) {
						Static31.anInt951++;
					}
				}
				Static5.aClass3_Sub4_Sub1_1.method437(Static5.aClass3_Sub4_Sub1_1.anInt627 - local125);
				if (local114 >= Static28.aClass37_1.anInt1165) {
					Static28.aClass37_1.anInt1165 = 0;
				} else {
					Static28.aClass37_1.anInt1165 -= local114;
					for (local143 = 0; local143 < Static28.aClass37_1.anInt1165; local143++) {
						Static28.aClass37_1.anIntArray160[local143] = Static28.aClass37_1.anIntArray160[local114 + local143];
						Static28.aClass37_1.anIntArray161[local143] = Static28.aClass37_1.anIntArray161[local143 + local114];
					}
				}
			}
		}
		if (Static77.anInt1842 != 0) {
			local125 = Static91.anInt2055;
			local114 = Static4.anInt194;
			@Pc(384) byte local384 = 0;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 764) {
				local114 = 764;
			}
			if (Static77.anInt1842 == 2) {
				local384 = 1;
			}
			@Pc(406) long local406 = (Static95.aLong73 - Static89.aLong67) / 50L;
			if (local406 > 4095L) {
				local406 = 4095L;
			}
			local148 = (int) local406;
			if (local125 < 0) {
				local125 = 0;
			} else if (local125 > 502) {
				local125 = 502;
			}
			local127 = local114 + local125 * 765;
			Static89.aLong67 = Static95.aLong73;
			Static5.aClass3_Sub4_Sub1_1.method464(62);
			Static5.aClass3_Sub4_Sub1_1.method433((local148 << 20) + (local384 << 19) + local127);
		}
		if (Static39.anInt1062 > 0) {
			Static39.anInt1062--;
		}
		if (Static39.aBooleanArray8[96] || Static39.aBooleanArray8[97] || Static39.aBooleanArray8[98] || Static39.aBooleanArray8[99]) {
			Static48.aBoolean86 = true;
		}
		if (Static48.aBoolean86 && Static39.anInt1062 <= 0) {
			Static39.anInt1062 = 20;
			Static48.aBoolean86 = false;
			Static5.aClass3_Sub4_Sub1_1.method464(118);
			Static5.aClass3_Sub4_Sub1_1.method455(Static109.anInt2749);
			Static5.aClass3_Sub4_Sub1_1.method425(Static60.anInt1493);
		}
		if (Static66.aBoolean126 && !Static98.aBoolean195) {
			Static98.aBoolean195 = true;
			Static5.aClass3_Sub4_Sub1_1.method464(4);
			Static5.aClass3_Sub4_Sub1_1.method423(1);
		}
		if (!Static66.aBoolean126 && Static98.aBoolean195) {
			Static98.aBoolean195 = false;
			Static5.aClass3_Sub4_Sub1_1.method464(4);
			Static5.aClass3_Sub4_Sub1_1.method423(0);
		}
		Static104.method1697();
		if (Static20.anInt479 != 30 && Static20.anInt479 != 35) {
			return;
		}
		Static94.method1483();
		Static20.method289();
		Static1.anInt2++;
		if (Static1.anInt2 > 750) {
			Static112.method1925();
			return;
		}
		Static28.method591();
		Static73.method1185();
		Static53.method1659();
		Static85.anInt1995++;
		if (Static19.anInt476 != 0) {
			Static60.anInt1491 += 20;
			if (Static60.anInt1491 >= 400) {
				Static19.anInt476 = 0;
			}
		}
		if (Static22.anInt500 != 0) {
			Static71.anInt1710++;
			if (Static71.anInt1710 >= 15) {
				if (Static22.anInt500 == 3) {
					Static86.aBoolean153 = true;
				}
				if (Static22.anInt500 == 2) {
					Static39.aBoolean74 = true;
				}
				Static22.anInt500 = 0;
			}
		}
		if (Static12.anInt343 != 0) {
			Static39.anInt1065++;
			if (Static7.anInt278 + 5 < Static22.anInt496 || Static7.anInt278 - 5 > Static22.anInt496 || Static78.anInt420 > Static78.anInt441 + 5 || Static78.anInt441 - 5 > Static78.anInt420) {
				Static107.aBoolean238 = true;
			}
			if (Static49.anInt1204 == 0) {
				if (Static12.anInt343 == 2) {
					Static39.aBoolean74 = true;
				}
				if (Static12.anInt343 == 3) {
					Static86.aBoolean153 = true;
				}
				Static12.anInt343 = 0;
				if (Static107.aBoolean238 && Static39.anInt1065 >= 5) {
					Static60.anInt1463 = -1;
					Static68.method1120();
					if (Static60.anInt1463 == Static76.anInt1818 && Static30.anInt943 != Static53.anInt2474) {
						@Pc(710) byte local710 = 0;
						@Pc(714) Class3_Sub1_Sub14 local714 = Static47.method828(Static76.anInt1818);
						if (Static96.anInt1729 == 1 && local714.anInt2087 == 206) {
							local710 = 1;
						}
						if (local714.anIntArray274[Static30.anInt943] <= 0) {
							local710 = 0;
						}
						if (local714.aBoolean169) {
							local114 = Static30.anInt943;
							local125 = Static53.anInt2474;
							local714.anIntArray274[local114] = local714.anIntArray274[local125];
							local714.anIntArray272[local114] = local714.anIntArray272[local125];
							local714.anIntArray274[local125] = -1;
							local714.anIntArray272[local125] = 0;
						} else if (local710 == 1) {
							local125 = Static53.anInt2474;
							local114 = Static30.anInt943;
							while (local114 != local125) {
								if (local125 > local114) {
									local714.method1421(local125 - 1, local125);
									local125--;
								} else if (local114 > local125) {
									local714.method1421(local125 + 1, local125);
									local125++;
								}
							}
						} else {
							local714.method1421(Static30.anInt943, Static53.anInt2474);
						}
						Static5.aClass3_Sub4_Sub1_1.method464(152);
						Static5.aClass3_Sub4_Sub1_1.method435(local710);
						Static5.aClass3_Sub4_Sub1_1.method450(Static76.anInt1818);
						Static5.aClass3_Sub4_Sub1_1.method455(Static53.anInt2474);
						Static5.aClass3_Sub4_Sub1_1.method457(Static30.anInt943);
					}
				} else if ((Static30.anInt941 == 1 || Static65.method1095(Static4.anInt204 - 1)) && Static4.anInt204 > 2) {
					Static19.method285();
				} else if (Static4.anInt204 > 0) {
					Static60.method1011(Static4.anInt204 - 1);
				}
				Static71.anInt1710 = 10;
				Static77.anInt1842 = 0;
			}
		}
		@Pc(878) int local878;
		if (Static84.anInt1949 != -1) {
			local878 = Static84.anInt1941;
			local66 = Static84.anInt1949;
			@Pc(900) boolean local900 = Static107.method1822(local878, 0, true, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], 0, 0, 0, local66, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0], 0, 0);
			if (local900) {
				Static60.anInt1491 = 0;
				Static19.anInt476 = 1;
				Static49.anInt1217 = Static91.anInt2055;
				Static55.anInt1393 = Static4.anInt194;
			}
			Static84.anInt1949 = -1;
		}
		if (Static77.anInt1842 == 1 && Static29.aClass4_444 != null) {
			Static86.aBoolean153 = true;
			Static29.aClass4_444 = null;
			Static77.anInt1842 = 0;
		}
		Static16.method231();
		if (Static60.anInt1484 == -1) {
			Static6.method165();
			Static25.method496();
			Static67.method1104();
		}
		if (Static49.anInt1204 == 1 || Static77.anInt1842 == 1) {
			anInt299++;
		}
		if (Static48.anInt1201 != -1) {
			Static64.method1092(Static48.anInt1201, 338, 4, 34, 516, 4);
		}
		if (Static10.anInt336 != -1) {
			Static64.method1092(Static10.anInt336, 466, 553, 34, 743, 205);
		} else if (Static13.anIntArray15[Static70.anInt1686] != -1) {
			Static64.method1092(Static13.anIntArray15[Static70.anInt1686], 466, 553, 34, 743, 205);
		}
		if (Static6.anInt259 != -1) {
			Static64.method1092(Static6.anInt259, 453, 17, 34, 496, 357);
		} else if (Static77.anInt1841 != -1) {
			Static64.method1092(Static77.anInt1841, 453, 17, 34, 496, 357);
		}
		if (Static48.anInt1201 != -1) {
			Static64.method1092(Static48.anInt1201, 338, 4, -35, 516, 4);
		}
		if (Static10.anInt336 != -1) {
			Static64.method1092(Static10.anInt336, 466, 553, -35, 743, 205);
		} else if (Static13.anIntArray15[Static70.anInt1686] != -1) {
			Static64.method1092(Static13.anIntArray15[Static70.anInt1686], 466, 553, -35, 743, 205);
		}
		if (Static6.anInt259 != -1) {
			Static64.method1092(Static6.anInt259, 453, 17, -35, 496, 357);
		} else if (Static77.anInt1841 != -1) {
			Static64.method1092(Static77.anInt1841, 453, 17, -35, 496, 357);
		}
		if (Static106.anInt2663 == -1 && Static107.anInt2705 == -1 && Static12.anInt340 == -1) {
			if (Static82.anInt1919 > 0) {
				Static82.anInt1919--;
			}
		} else if (Static95.anInt2235 > Static82.anInt1919) {
			Static82.anInt1919++;
			if (Static82.anInt1919 == Static95.anInt2235) {
				if (Static106.anInt2663 != -1) {
					Static86.aBoolean153 = true;
				}
				if (Static107.anInt2705 != -1) {
					Static39.aBoolean74 = true;
				}
			}
		}
		Static85.method1367();
		if (Static103.aBoolean217) {
			Static107.method1820();
		}
		for (local878 = 0; local878 < 5; local878++) {
			@Pc(1158) int local1158 = Static60.anIntArray211[local878]++;
		}
		Static60.method1006();
		local125 = Static88.method1394();
		local114 = Static73.method1179();
		if (local125 > 4500 && local114 > 4500) {
			Static112.anInt2839 = 250;
			Static79.method1257(4000);
			Static5.aClass3_Sub4_Sub1_1.method464(20);
		}
		Static42.anInt1133++;
		Static79.anInt1872++;
		if (Static79.anInt1872 > 500) {
			local127 = (int) (Math.random() * 8.0D);
			if ((local127 & 0x4) == 4) {
				Static65.anInt1627 += Static85.anInt1990;
			}
			Static79.anInt1872 = 0;
			if ((local127 & 0x1) == 1) {
				Static19.anInt477 += Static86.anInt2000;
			}
			if ((local127 & 0x2) == 2) {
				Static17.anInt378 += Static36.anInt1044;
			}
		}
		Static43.anInt1145++;
		if (Static17.anInt378 < -55) {
			Static36.anInt1044 = 2;
		}
		if (Static43.anInt1145 > 500) {
			Static43.anInt1145 = 0;
			local127 = (int) (Math.random() * 8.0D);
			if ((local127 & 0x2) == 2) {
				Static89.anInt2041 += Static20.anInt487;
			}
			if ((local127 & 0x1) == 1) {
				Static111.anInt2786 += Static96.anInt1722;
			}
		}
		if (Static19.anInt477 < -50) {
			Static86.anInt2000 = 2;
		}
		if (Static111.anInt2786 < -60) {
			Static96.anInt1722 = 2;
		}
		if (Static65.anInt1627 < -40) {
			Static85.anInt1990 = 1;
		}
		if (Static17.anInt378 > 55) {
			Static36.anInt1044 = -2;
		}
		if (Static111.anInt2786 > 60) {
			Static96.anInt1722 = -2;
		}
		if (Static19.anInt477 > 50) {
			Static86.anInt2000 = -2;
		}
		if (Static89.anInt2041 < -20) {
			Static20.anInt487 = 1;
		}
		if (Static65.anInt1627 > 40) {
			Static85.anInt1990 = -1;
		}
		if (Static89.anInt2041 > 10) {
			Static20.anInt487 = -1;
		}
		if (Static42.anInt1133 > 50) {
			Static5.aClass3_Sub4_Sub1_1.method464(102);
		}
		try {
			if (Static53.aClass31_6 != null && Static5.aClass3_Sub4_Sub1_1.anInt627 > 0) {
				Static53.aClass31_6.method716(Static5.aClass3_Sub4_Sub1_1.anInt627, Static5.aClass3_Sub4_Sub1_1.aByteArray4);
				Static42.anInt1133 = 0;
				Static5.aClass3_Sub4_Sub1_1.anInt627 = 0;
			}
		} catch (@Pc(1378) IOException local1378) {
			Static112.method1925();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB[BIII[Lclient!jd;I)V")
	public static void method190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class40[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg6 > 0 && arg6 + local3 < 103 && arg2 + local7 > 0 && arg2 + local7 < 103) {
					arg7[arg4].anIntArrayArray16[local3 + arg6][arg2 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(76) Class3_Sub4 local76 = new Class3_Sub4(arg3);
		for (@Pc(82) int local82 = 0; local82 < 4; local82++) {
			for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
				for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
					if (local82 == arg1 && local86 >= arg8 && local86 < arg8 + 8 && arg0 <= local90 && local90 < arg0 + 8) {
						Static28.method589(0, arg4, arg5, local76, Static38.method1908(local86 & 0x7, local90 & 0x7, arg5) + arg2, Static32.method632(arg5, local90 & 0x7, local86 & 0x7) + arg6, 0);
					} else {
						Static28.method589(0, 0, 0, local76, -1, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
	public static void method191() {
		aClass30_1 = null;
		aClass4_154 = null;
		aClass4_156 = null;
		aClass4_155 = null;
		aClass4_157 = null;
		aClass25_19 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLclient!aa;)Z")
	public static boolean method192(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2 arg1) {
		Static9.anInt310 = 20;
		try {
			aClass30_1 = (Class30) Class.forName("Class30_Sub1_Sub2").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(19) Interface1 local19 = arg1.method7();
			if (local19 != null) {
				aClass30_1 = new Class30_Sub1_Sub1(arg1, local19);
				return true;
			} else if (arg0) {
				aClass30_1 = new Class30_Sub2(arg1);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)I")
	public static int method193() {
		@Pc(3) int local3 = 3;
		if (Static106.anInt2666 < 310) {
			@Pc(15) int local15 = Static113.anInt2853 >> 7;
			@Pc(19) int local19 = Static9.anInt314 >> 7;
			if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][local15][local19] & 0x4) != 0) {
				local3 = Static49.anInt1203;
			}
			@Pc(39) int local39 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 >> 7;
			@Pc(44) int local44 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 >> 7;
			@Pc(52) int local52;
			if (local39 > local15) {
				local52 = local39 - local15;
			} else {
				local52 = local15 - local39;
			}
			@Pc(70) int local70;
			if (local19 < local44) {
				local70 = local44 - local19;
			} else {
				local70 = local19 - local44;
			}
			@Pc(88) int local88;
			@Pc(82) int local82;
			if (local70 >= local52) {
				local82 = 32768;
				local88 = local52 * 65536 / local70;
				while (local44 != local19) {
					local82 += local88;
					if (local44 > local19) {
						local19++;
					} else if (local44 < local19) {
						local19--;
					}
					if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][local15][local19] & 0x4) != 0) {
						local3 = Static49.anInt1203;
					}
					if (local82 >= 65536) {
						local82 -= 65536;
						if (local15 < local39) {
							local15++;
						} else if (local39 < local15) {
							local15--;
						}
						if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][local15][local19] & 0x4) != 0) {
							local3 = Static49.anInt1203;
						}
					}
				}
			} else {
				local88 = local70 * 65536 / local52;
				local82 = 32768;
				while (local39 != local15) {
					local82 += local88;
					if (local15 < local39) {
						local15++;
					} else if (local39 < local15) {
						local15--;
					}
					if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][local15][local19] & 0x4) != 0) {
						local3 = Static49.anInt1203;
					}
					if (local82 >= 65536) {
						if (local44 > local19) {
							local19++;
						} else if (local44 < local19) {
							local19--;
						}
						if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][local15][local19] & 0x4) != 0) {
							local3 = Static49.anInt1203;
						}
						local82 -= 65536;
					}
				}
			}
		}
		if ((Static11.aByteArrayArrayArray55[Static49.anInt1203][Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342 >> 7][Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348 >> 7] & 0x4) != 0) {
			local3 = Static49.anInt1203;
		}
		return local3;
	}
}
