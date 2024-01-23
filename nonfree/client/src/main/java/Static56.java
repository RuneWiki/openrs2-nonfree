import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
	public static volatile int anInt1205 = 0;

	@OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
	public static void method1011() {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < 104; local9++) {
			for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
				if (Static134.method2335(local14, Static254.aClass1_Sub16ArrayArrayArray3, true, local9, local3)) {
					local3++;
				}
				if (local3 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1012(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZIZ)V")
	public static void method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (Static71.aBoolean165) {
			@Pc(19) int local19 = arg0 - 334;
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 100) {
				local19 = 100;
			}
			@Pc(43) int local43 = (Static189.aShort42 - Static189.aShort41) * local19 / 100 + Static189.aShort41;
			if (local43 < Static28.aShort7) {
				local43 = Static28.aShort7;
			} else if (Static238.aShort43 < local43) {
				local43 = Static238.aShort43;
			}
			@Pc(69) int local69 = local43 * 512 * arg0 / (arg1 * 334);
			@Pc(99) int local99;
			@Pc(106) int local106;
			@Pc(74) short local74;
			if (local69 < Static143.aShort22) {
				local74 = Static143.aShort22;
				local43 = arg1 * local74 * 334 / (arg0 * 512);
				if (local43 > Static238.aShort43) {
					local43 = Static238.aShort43;
					local99 = arg0 * 512 * local43 / (local74 * 334);
					local106 = (arg1 - local99) / 2;
					if (arg3) {
						Static93.method1776();
						Static93.method1777(arg2, arg4, local106, arg0, 0);
						Static93.method1777(arg1 + arg2 - local106, arg4, local106, arg0, 0);
					}
					arg2 += local106;
					arg1 -= local106 * 2;
				}
			} else if (Static271.aShort48 < local69) {
				local74 = Static271.aShort48;
				local43 = arg1 * 334 * local74 / (arg0 * 512);
				if (local43 < Static28.aShort7) {
					local43 = Static28.aShort7;
					local99 = local74 * arg1 * 334 / (local43 * 512);
					local106 = (arg0 - local99) / 2;
					if (arg3) {
						Static93.method1776();
						Static93.method1777(arg2, arg4, arg1, local106, 0);
						Static93.method1777(arg2, arg4 + arg0 - local106, arg1, local106, 0);
					}
					arg0 -= local106 * 2;
					arg4 += local106;
				}
			}
			Static228.anInt4279 = arg0 * local43 / 334;
		}
		Static172.anInt3358 = (short) arg1;
		Static111.anInt2282 = arg4;
		Static214.anInt1383 = (short) arg0;
		Static128.anInt2548 = arg2;
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(B)V")
	public static void method1016() {
		if (Static290.aString207.toLowerCase().indexOf("microsoft") != -1) {
			Static43.anIntArray74[188] = 71;
			Static43.anIntArray74[220] = 74;
			Static43.anIntArray74[190] = 72;
			Static43.anIntArray74[219] = 42;
			Static43.anIntArray74[187] = 27;
			Static43.anIntArray74[186] = 57;
			Static43.anIntArray74[189] = 26;
			Static43.anIntArray74[192] = 58;
			Static43.anIntArray74[191] = 73;
			Static43.anIntArray74[221] = 43;
			Static43.anIntArray74[222] = 59;
			Static43.anIntArray74[223] = 28;
			return;
		}
		Static43.anIntArray74[91] = 42;
		Static43.anIntArray74[47] = 73;
		Static43.anIntArray74[59] = 57;
		Static43.anIntArray74[61] = 27;
		Static43.anIntArray74[46] = 72;
		Static43.anIntArray74[93] = 43;
		Static43.anIntArray74[45] = 26;
		if (Static290.aMethod1 == null) {
			Static43.anIntArray74[222] = 59;
			Static43.anIntArray74[192] = 58;
		} else {
			Static43.anIntArray74[192] = 28;
			Static43.anIntArray74[222] = 58;
			Static43.anIntArray74[520] = 59;
		}
		Static43.anIntArray74[44] = 71;
		Static43.anIntArray74[92] = 74;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([BB)V")
	public static void method1017(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub13 local10 = new Class1_Sub13(arg0);
		local10.anInt2018 = arg0.length - 2;
		Static48.anInt1075 = local10.method1879();
		Static25.aByteArrayArray19 = new byte[Static48.anInt1075][];
		Static154.aBooleanArray10 = new boolean[Static48.anInt1075];
		Static192.anIntArray398 = new int[Static48.anInt1075];
		Static194.aByteArrayArray15 = new byte[Static48.anInt1075][];
		Static173.anIntArray353 = new int[Static48.anInt1075];
		Static206.anIntArray419 = new int[Static48.anInt1075];
		Static69.anIntArray119 = new int[Static48.anInt1075];
		local10.anInt2018 = arg0.length - Static48.anInt1075 * 8 - 7;
		Static94.anInt1976 = local10.method1879();
		Static222.anInt4184 = local10.method1879();
		@Pc(68) int local68 = (local10.method1853() & 0xFF) + 1;
		@Pc(70) int local70;
		for (local70 = 0; local70 < Static48.anInt1075; local70++) {
			Static192.anIntArray398[local70] = local10.method1879();
		}
		for (local70 = 0; local70 < Static48.anInt1075; local70++) {
			Static173.anIntArray353[local70] = local10.method1879();
		}
		for (local70 = 0; local70 < Static48.anInt1075; local70++) {
			Static69.anIntArray119[local70] = local10.method1879();
		}
		for (local70 = 0; local70 < Static48.anInt1075; local70++) {
			Static206.anIntArray419[local70] = local10.method1879();
		}
		local10.anInt2018 = arg0.length + 3 - Static48.anInt1075 * 8 - local68 * 3 - 7;
		Static5.anIntArray17 = new int[local68];
		@Pc(163) int local163;
		for (local163 = 1; local163 < local68; local163++) {
			Static5.anIntArray17[local163] = local10.method1878();
			if (Static5.anIntArray17[local163] == 0) {
				Static5.anIntArray17[local163] = 1;
			}
		}
		local10.anInt2018 = 0;
		for (local163 = 0; local163 < Static48.anInt1075; local163++) {
			@Pc(200) int local200 = Static69.anIntArray119[local163];
			@Pc(204) int local204 = Static206.anIntArray419[local163];
			@Pc(208) int local208 = local204 * local200;
			@Pc(210) boolean local210 = false;
			@Pc(213) byte[] local213 = new byte[local208];
			@Pc(216) byte[] local216 = new byte[local208];
			Static25.aByteArrayArray19[local163] = local213;
			Static194.aByteArrayArray15[local163] = local216;
			@Pc(228) int local228 = local10.method1853();
			@Pc(237) int local237;
			if ((local228 & 0x1) == 0) {
				for (local237 = 0; local237 < local208; local237++) {
					local213[local237] = local10.method1829();
				}
				if ((local228 & 0x2) != 0) {
					for (local237 = 0; local237 < local208; local237++) {
						@Pc(359) byte local359 = local216[local237] = local10.method1829();
						local210 |= local359 != -1;
					}
				}
			} else {
				local237 = 0;
				label89: while (true) {
					@Pc(246) int local246;
					if (local237 >= local200) {
						if ((local228 & 0x2) == 0) {
							break;
						}
						local237 = 0;
						while (true) {
							if (local200 <= local237) {
								break label89;
							}
							for (local246 = 0; local246 < local204; local246++) {
								@Pc(300) byte local300 = local216[local200 * local246 + local237] = local10.method1829();
								local210 |= local300 != -1;
							}
							local237++;
						}
					}
					for (local246 = 0; local246 < local204; local246++) {
						local213[local237 + local246 * local200] = local10.method1829();
					}
					local237++;
				}
			}
			Static154.aBooleanArray10[local163] = local210;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IC)B")
	public static byte method1018(@OriginalArg(1) char arg0) {
		@Pc(24) byte local24;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local24 = (byte) arg0;
		} else if (arg0 == '€') {
			local24 = -128;
		} else if (arg0 == '‚') {
			local24 = -126;
		} else if (arg0 == 'ƒ') {
			local24 = -125;
		} else if (arg0 == '„') {
			local24 = -124;
		} else if (arg0 == '…') {
			local24 = -123;
		} else if (arg0 == '†') {
			local24 = -122;
		} else if (arg0 == '‡') {
			local24 = -121;
		} else if (arg0 == 'ˆ') {
			local24 = -120;
		} else if (arg0 == '‰') {
			local24 = -119;
		} else if (arg0 == 'Š') {
			local24 = -118;
		} else if (arg0 == '‹') {
			local24 = -117;
		} else if (arg0 == 'Œ') {
			local24 = -116;
		} else if (arg0 == 'Ž') {
			local24 = -114;
		} else if (arg0 == '‘') {
			local24 = -111;
		} else if (arg0 == '’') {
			local24 = -110;
		} else if (arg0 == '“') {
			local24 = -109;
		} else if (arg0 == '”') {
			local24 = -108;
		} else if (arg0 == '•') {
			local24 = -107;
		} else if (arg0 == '–') {
			local24 = -106;
		} else if (arg0 == '—') {
			local24 = -105;
		} else if (arg0 == '˜') {
			local24 = -104;
		} else if (arg0 == '™') {
			local24 = -103;
		} else if (arg0 == 'š') {
			local24 = -102;
		} else if (arg0 == '›') {
			local24 = -101;
		} else if (arg0 == 'œ') {
			local24 = -100;
		} else if (arg0 == 'ž') {
			local24 = -98;
		} else if (arg0 == 'Ÿ') {
			local24 = -97;
		} else {
			local24 = 63;
		}
		return local24;
	}
}
