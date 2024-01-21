import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!hd;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "J")
	public static long aLong12;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt363 = 0;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_193 = Static75.method1216("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[I")
	public static int[] anIntArray33 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_194 = Static75.method1216("Registrierter Benutzer");

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_195 = Static75.method1216("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!ad;")
	private static Class4 aClass4_196 = Static75.method1216("Please try again)3");

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_197 = aClass4_196;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method228() {
		Static29.aClass25_43.method1157();
		Static81.aClass3_Sub1_Sub4_Sub3_29.method1771(0, 0);
		Static74.anIntArray236 = Static99.method1592(Static74.anIntArray236);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public static boolean method229(@OriginalArg(1) int arg0) {
		if (!Static100.method1650(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class3_Sub1_Sub14[] local22 = Static104.aClass3_Sub1_Sub14ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class3_Sub1_Sub14 local30 = local22[local24];
			if (local30 != null && local30.anInt2128 == 6) {
				@Pc(59) int local59;
				if (local30.anInt2126 != -1 || local30.anInt2086 != -1) {
					@Pc(54) boolean local54 = Static5.method154(local30);
					if (local54) {
						local59 = local30.anInt2086;
					} else {
						local59 = local30.anInt2126;
					}
					if (local59 != -1) {
						@Pc(72) Class3_Sub1_Sub6 local72 = Static67.method1107(local59);
						local30.anInt2122 += Static85.anInt1995;
						label50: while (true) {
							do {
								do {
									if (local30.anInt2122 <= local72.anIntArray224[local30.anInt2088]) {
										break label50;
									}
									local30.anInt2122 -= local72.anIntArray224[local30.anInt2088];
									local30.anInt2088++;
									local18 = true;
								} while (local72.anIntArray220.length > local30.anInt2088);
								local30.anInt2088 -= local72.anInt1593;
							} while (local30.anInt2088 >= 0 && local72.anIntArray220.length > local30.anInt2088);
							local30.anInt2088 = 0;
						}
					}
				}
				if (local30.anInt2084 != 0) {
					@Pc(150) int local150 = local30.anInt2084 >> 16;
					@Pc(154) int local154 = local150 * Static85.anInt1995;
					local18 = true;
					local59 = local30.anInt2084 << 16 >> 16;
					local30.anInt2123 = local154 + local30.anInt2123 & 0x7FF;
					local59 *= Static85.anInt1995;
					local30.anInt2124 = local59 + local30.anInt2124 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method230() {
		Static29.anInt911 = 0;
		Static95.anInt2230 = 0;
		Static78.method275();
		Static76.method1222();
		Static11.method1932();
		Static15.method225();
		for (@Pc(19) int local19 = 0; local19 < Static29.anInt911; local19++) {
			@Pc(25) int local25 = Static1.anIntArray1[local19];
			if (Static60.anInt1489 != Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local25].anInt2343) {
				Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local25] = null;
			}
		}
		if (Static32.aClass3_Sub4_Sub1_2.anInt627 != Static65.anInt1630) {
			throw new RuntimeException("gpp1 pos:" + Static32.aClass3_Sub4_Sub1_2.anInt627 + " psize:" + Static65.anInt1630);
		}
		for (@Pc(69) int local69 = 0; local69 < Static11.anInt2841; local69++) {
			if (Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local69]] == null) {
				throw new RuntimeException("gpp2 pos:" + local69 + " size:" + Static11.anInt2841);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public static void method231() {
		if (Static12.anInt343 != 0) {
			return;
		}
		@Pc(18) int local18 = Static77.anInt1842;
		if (Static101.anInt2512 == 1 && Static4.anInt194 >= 516 && Static91.anInt2055 >= 160 && Static4.anInt194 <= 765 && Static91.anInt2055 <= 205) {
			local18 = 0;
		}
		@Pc(54) int local54;
		@Pc(116) int local116;
		@Pc(110) int local110;
		if (!Static106.aBoolean231) {
			if (local18 == 1 && Static4.anInt204 > 0) {
				local54 = Static22.anIntArray38[Static4.anInt204 - 1];
				if (local54 == 60 || local54 == 25 || local54 == 40 || local54 == 26 || local54 == 3 || local54 == 27 || local54 == 32 || local54 == 7 || local54 == 42 || local54 == 55 || local54 == 14 || local54 == 1003) {
					local110 = Static107.anIntArray331[Static4.anInt204 - 1];
					local116 = Static63.anIntArray225[Static4.anInt204 - 1];
					@Pc(120) Class3_Sub1_Sub14 local120 = Static47.method828(local110);
					if (local120.aBoolean166 || local120.aBoolean169) {
						Static39.anInt1065 = 0;
						Static7.anInt278 = Static4.anInt194;
						Static78.anInt441 = Static91.anInt2055;
						Static107.aBoolean238 = false;
						Static76.anInt1818 = local110;
						Static12.anInt343 = 2;
						if (Static48.anInt1201 == local110 >> 16) {
							Static12.anInt343 = 1;
						}
						if (local110 >> 16 == Static6.anInt259) {
							Static12.anInt343 = 3;
						}
						Static53.anInt2474 = local116;
						return;
					}
				}
			}
			if (local18 == 1 && (Static30.anInt941 == 1 || Static65.method1095(Static4.anInt204 - 1)) && Static4.anInt204 > 2) {
				local18 = 2;
			}
			if (local18 == 1 && Static4.anInt204 > 0) {
				Static60.method1011(Static4.anInt204 - 1);
			}
			if (local18 == 2 && Static4.anInt204 > 0) {
				Static19.method285();
				return;
			}
			return;
		}
		if (local18 != 1) {
			local54 = Static22.anInt496;
			local116 = Static78.anInt420;
			if (Static76.anInt1815 == 0) {
				local54 -= 4;
				local116 -= 4;
			}
			if (Static76.anInt1815 == 1) {
				local54 -= 553;
				local116 -= 205;
			}
			if (Static76.anInt1815 == 2) {
				local54 -= 17;
				local116 -= 357;
			}
			if (Static39.anInt1072 - 10 > local54 || local54 > Static39.anInt1072 + Static85.anInt1989 + 10 || Static75.anInt1788 - 10 > local116 || local116 > Static9.anInt315 + Static75.anInt1788 + 10) {
				Static106.aBoolean231 = false;
				if (Static76.anInt1815 == 1) {
					Static39.aBoolean74 = true;
				}
				if (Static76.anInt1815 == 2) {
					Static86.aBoolean153 = true;
				}
			}
		}
		if (local18 != 1) {
			return;
		}
		local116 = Static75.anInt1788;
		local54 = Static39.anInt1072;
		local110 = Static85.anInt1989;
		@Pc(277) int local277 = Static91.anInt2055;
		@Pc(279) int local279 = -1;
		@Pc(281) int local281 = Static4.anInt194;
		if (Static76.anInt1815 == 0) {
			local277 -= 4;
			local281 -= 4;
		}
		if (Static76.anInt1815 == 1) {
			local277 -= 205;
			local281 -= 553;
		}
		if (Static76.anInt1815 == 2) {
			local281 -= 17;
			local277 -= 357;
		}
		for (@Pc(304) int local304 = 0; local304 < Static4.anInt204; local304++) {
			@Pc(319) int local319 = (Static4.anInt204 - local304 - 1) * 15 + local116 + 31;
			if (local281 > local54 && local110 + local54 > local281 && local319 - 13 < local277 && local277 < local319 + 3) {
				local279 = local304;
			}
		}
		if (local279 != -1) {
			Static60.method1011(local279);
		}
		if (Static76.anInt1815 == 2) {
			Static86.aBoolean153 = true;
		}
		if (Static76.anInt1815 == 1) {
			Static39.aBoolean74 = true;
		}
		Static106.aBoolean231 = false;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)I")
	public static int method232() {
		return 19;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public static void method233() {
		Static75.method1219();
		if (Static20.anInt479 != 10) {
			return;
		}
		@Pc(15) int local15 = Static4.anInt194 - 202;
		@Pc(19) int local19 = Static91.anInt2055 - 171;
		@Pc(21) int local21 = Static77.anInt1842;
		if (Static73.anInt1759 == 0) {
			if (local21 == 1 && local15 >= 25 && local15 <= 175 && local19 >= 100 && local19 <= 140) {
				Static8.anInt304 = 0;
				Static73.anInt1759 = 3;
			}
			if (local21 == 1 && local15 >= 185 && local15 <= 335 && local19 >= 100 && local19 <= 140) {
				Static8.anInt304 = 0;
				Static73.anInt1759 = 2;
				Static95.aClass4_1257 = Static74.aClass4_941;
				Static95.aClass4_1252 = Static74.aClass4_954;
				Static95.aClass4_1255 = Static5.aClass4_114;
				return;
			}
			return;
		}
		if (Static73.anInt1759 == 2) {
			@Pc(116) byte local116 = 60;
			@Pc(121) int local121 = local116 + 30;
			if (local21 == 1 && local19 >= 75 && local19 < 90) {
				Static8.anInt304 = 0;
			}
			local121 += 15;
			if (local21 == 1 && local19 >= 90 && local19 < 105) {
				Static8.anInt304 = 1;
			}
			local121 += 15;
			if (local21 == 1 && local15 >= 25 && local15 <= 175 && local19 >= 130 && local19 <= 170) {
				Static95.aClass4_1260 = Static95.aClass4_1260.method159().method130();
				Static103.method1696(Static9.aClass4_164, Static74.aClass4_946, Static74.aClass4_955);
				Static60.method1007(20);
				return;
			}
			if (local21 == 1 && local15 >= 185 && local15 <= 335 && local19 >= 130 && local19 <= 170) {
				Static95.aClass4_1260 = Static95.aClass4_1258;
				Static73.anInt1759 = 0;
				Static95.aClass4_1256 = Static95.aClass4_1258;
			}
			while (true) {
				@Pc(256) boolean local256;
				label138: do {
					while (Static95.method1502()) {
						local256 = false;
						for (@Pc(258) int local258 = 0; local258 < Static82.aClass4_1090.method118(); local258++) {
							if (Static47.anInt1180 == Static82.aClass4_1090.method140(local258)) {
								local256 = true;
								break;
							}
						}
						if (Static8.anInt304 != 0) {
							continue label138;
						}
						if (Static109.anInt2752 == 85 && Static95.aClass4_1260.method118() > 0) {
							Static95.aClass4_1260 = Static95.aClass4_1260.method136(0, Static95.aClass4_1260.method118() - 1);
						}
						if (Static109.anInt2752 == 84 || Static109.anInt2752 == 80) {
							Static8.anInt304 = 1;
						}
						if (local256 && Static95.aClass4_1260.method118() < 12) {
							Static95.aClass4_1260 = Static95.aClass4_1260.method121(Static47.anInt1180);
						}
					}
					return;
				} while (Static8.anInt304 != 1);
				if (Static109.anInt2752 == 85 && Static95.aClass4_1256.method118() > 0) {
					Static95.aClass4_1256 = Static95.aClass4_1256.method136(0, Static95.aClass4_1256.method118() - 1);
				}
				if (Static109.anInt2752 == 84 || Static109.anInt2752 == 80) {
					Static8.anInt304 = 0;
				}
				if (local256 && Static95.aClass4_1256.method118() < 20) {
					Static95.aClass4_1256 = Static95.aClass4_1256.method121(Static47.anInt1180);
				}
			}
		}
		if (Static73.anInt1759 != 3 || local21 != 1 || local15 < 105 || local15 > 255 || local19 < 130 || local19 > 170) {
			return;
		}
		Static73.anInt1759 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method234() {
		anIntArray33 = null;
		aClass4_196 = null;
		aClass4_194 = null;
		aByteArrayArray2 = null;
		aClass4_195 = null;
		aClass34_2 = null;
		aClass4_193 = null;
		aClass4_197 = null;
		anIntArray34 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!rc;)Z")
	public static boolean method235(@OriginalArg(1) Class3_Sub1_Sub14 arg0) {
		@Pc(6) int local6 = arg0.anInt2087;
		if (Static56.anInt1397 == 2) {
			if (local6 == 201) {
				Static113.aClass4_1601 = Static82.aClass4_1076;
				Static86.aBoolean153 = true;
				Static113.aClass4_1605 = Static113.aClass4_1604;
				Static91.anInt2058 = 1;
				Static58.aBoolean103 = true;
				Static85.anInt1991 = 0;
			}
			if (local6 == 202) {
				Static85.anInt1991 = 0;
				Static113.aClass4_1605 = Static113.aClass4_1604;
				Static58.aBoolean103 = true;
				Static113.aClass4_1601 = Static10.aClass4_183;
				Static86.aBoolean153 = true;
				Static91.anInt2058 = 2;
			}
		}
		if (local6 == 205) {
			Static112.anInt2839 = 250;
			return true;
		}
		if (local6 == 501) {
			Static91.anInt2058 = 4;
			Static113.aClass4_1601 = Static82.aClass4_1084;
			Static85.anInt1991 = 0;
			Static86.aBoolean153 = true;
			Static113.aClass4_1605 = Static113.aClass4_1604;
			Static58.aBoolean103 = true;
		}
		if (local6 == 502) {
			Static58.aBoolean103 = true;
			Static91.anInt2058 = 5;
			Static113.aClass4_1605 = Static113.aClass4_1604;
			Static113.aClass4_1601 = Static79.aClass4_1050;
			Static85.anInt1991 = 0;
			Static86.aBoolean153 = true;
		}
		@Pc(103) int local103;
		@Pc(97) int local97;
		if (local6 >= 300 && local6 <= 313) {
			local97 = local6 & 0x1;
			local103 = (local6 - 300) / 2;
			Static30.aClass41_1.method906(local103, local97 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local103 = (local6 - 314) / 2;
			local97 = local6 & 0x1;
			Static30.aClass41_1.method894(local103, local97 == 1);
		}
		if (local6 == 324) {
			Static30.aClass41_1.method896(false);
		}
		if (local6 == 325) {
			Static30.aClass41_1.method896(true);
		}
		if (local6 == 326) {
			Static5.aClass3_Sub4_Sub1_1.method464(44);
			Static30.aClass41_1.method904(Static5.aClass3_Sub4_Sub1_1);
			return true;
		}
		if (local6 == 620) {
			Static70.aBoolean130 = !Static70.aBoolean130;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static42.method795();
			if (Static113.aClass4_1602.method118() > 0) {
				Static5.aClass3_Sub4_Sub1_1.method464(6);
				Static5.aClass3_Sub4_Sub1_1.method456(Static113.aClass4_1602.method149());
				Static5.aClass3_Sub4_Sub1_1.method423(local6 - 601);
				Static5.aClass3_Sub4_Sub1_1.method423(Static70.aBoolean130 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
	public static void method236() {
		Static61.aClass7_1.method1655();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static38.aLongArray35[local14] = 0L;
		}
		for (@Pc(28) int local28 = 0; local28 < 32; local28++) {
			Static82.aLongArray22[local28] = 0L;
		}
		Static61.anInt1514 = 0;
	}
}
