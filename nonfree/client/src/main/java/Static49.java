import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ei", name = "fb", descriptor = "Lclient!s;")
	public static final Class87 aClass87_9 = new Class87();

	@OriginalMember(owner = "client!ei", name = "ib", descriptor = "Lclient!l;")
	public static Class57 aClass57_12 = new Class57(32);

	@OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
	public static int anInt1246 = 0;

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_309 = Static81.method1507("Angreifen");

	@OriginalMember(owner = "client!ei", name = "lb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_310 = Static81.method1507("p11_full");

	@OriginalMember(owner = "client!ei", name = "mb", descriptor = "I")
	public static int anInt1247 = -1;

	@OriginalMember(owner = "client!ei", name = "nb", descriptor = "[B")
	public static final byte[] aByteArray14 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ei", name = "ob", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_311 = Static81.method1507("Freie Welt");

	@OriginalMember(owner = "client!ei", name = "pb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_312 = Static81.method1507("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ei", name = "rb", descriptor = "I")
	public static int anInt1249 = 0;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	public static void method901() {
		Static176.aClass3_32.method3515();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static130.aLongArray23[local8] = 0L;
		}
		for (@Pc(19) int local19 = 0; local19 < 32; local19++) {
			Static15.aLongArray5[local19] = 0L;
		}
		Static106.anInt2403 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(15) int local15 = arg3 - arg5;
		@Pc(24) int local24 = (arg6 - arg0 << 16) / local10;
		if (Static189.anInt4212 > arg4) {
			local10++;
		}
		@Pc(41) int local41 = (arg1 - arg7 << 16) / local15;
		if (Static146.anInt3124 > arg3) {
			local15++;
		}
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(68) int local68;
		@Pc(79) int local79;
		@Pc(113) int local113;
		@Pc(121) int local121;
		for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
			local57 = local41 * (local47 + 1) >> 16;
			local63 = local47 * local41 >> 16;
			local68 = local57 - local63;
			if (local68 > 0) {
				local79 = local47 + arg5 >> 6;
				local63 += arg7;
				local57 += arg7;
				@Pc(91) byte[][] local91 = Static202.aByteArrayArrayArray14[local79];
				@Pc(95) int[][] local95 = Static86.anIntArrayArrayArray5[local79];
				@Pc(99) byte[][] local99 = Static148.aByteArrayArrayArray10[local79];
				@Pc(103) byte[][] local103 = Static27.aByteArrayArrayArray2[local79];
				@Pc(107) byte[][] local107 = Static199.aByteArrayArrayArray6[local79];
				@Pc(111) byte[][] local111 = Static72.aByteArrayArrayArray4[local79];
				for (local113 = 0; local113 < local10; local113++) {
					local121 = local24 * local113 >> 16;
					@Pc(129) int local129 = local24 * (local113 + 1) >> 16;
					@Pc(134) int local134 = local129 - local121;
					if (local134 > 0) {
						local129 += arg0;
						local121 += arg0;
						@Pc(151) int local151 = local113 + arg2 & 0x3F;
						@Pc(157) int local157 = arg5 + local47 & 0x3F;
						@Pc(163) int local163 = (local151 << 6) + local157;
						@Pc(170) int local170 = local113 + arg2 >> 6;
						@Pc(205) int local205;
						@Pc(181) int local181;
						@Pc(187) int local187;
						if (local95[local170] == null) {
							local181 = local47 + arg5 & 0x4;
							local187 = arg2 + local113 & 0x4;
							if ((local181 >= 2 || local187 <= 2) && (local181 <= 2 || local187 >= 2)) {
								local205 = Static28.anIntArray73[Static212.anInt4700 + 1];
							} else {
								local205 = 4936552;
							}
						} else {
							local205 = local95[local170][local163];
						}
						local181 = local91[local170] == null ? 0 : Static28.anIntArray73[local91[local170][local163] & 0xFF];
						local187 = local107[local170] == null ? 0 : Static28.anIntArray73[local107[local170][local163] & 0xFF];
						@Pc(297) int local297;
						if (local181 == 0 && local187 == 0) {
							Static90.method3482(local63, local121, local68, local134, local205);
						} else {
							@Pc(293) byte local293;
							if (local181 != 0) {
								if (local181 == -1) {
									local181 = 1;
								}
								local293 = local99[local170] == null ? 0 : local99[local170][local163];
								local297 = local293 & 0xFC;
								if (local297 == 0 || local68 <= 1 || local134 <= 1) {
									Static90.method3482(local63, local121, local68, local134, local181);
								} else {
									Static192.method3304(local68, local134, local293 & 0x3, Static90.anIntArray406, local205, local297 >> 2, local121, local181, true, local63);
								}
							}
							if (local187 != 0) {
								if (local187 == -1) {
									local187 = local205;
								}
								local293 = local103[local170][local163];
								local297 = local293 & 0xFC;
								if (local297 == 0 || local68 <= 1 || local134 <= 1) {
									Static90.method3482(local63, local121, local68, local134, local187);
								}
								Static192.method3304(local68, local134, local293 & 0x3, Static90.anIntArray406, 0, local297 >> 2, local121, local187, local181 == 0, local63);
							}
						}
						if (local111[local170] != null) {
							@Pc(408) int local408 = local111[local170][local163] & 0xFF;
							if (local408 != 0) {
								@Pc(418) int local418;
								if (local134 == 1) {
									local418 = local121;
								} else {
									local418 = local129 - 1;
								}
								@Pc(426) int local426 = 13421772;
								if (local408 >= 5 && local408 <= 8 || local408 >= 13 && local408 <= 16 || local408 >= 21 && local408 <= 24 || local408 == 27 || local408 == 28) {
									local408 -= 4;
									local426 = 13369344;
								}
								if (local68 == 1) {
									local297 = local63;
								} else {
									local297 = local57 - 1;
								}
								if (local408 == 1) {
									Static90.method3489(local63, local121, local134, local426);
								} else if (local408 == 2) {
									Static90.method3498(local63, local121, local68, local426);
								} else if (local408 == 3) {
									Static90.method3489(local297, local121, local134, local426);
								} else if (local408 == 4) {
									Static90.method3498(local63, local418, local68, local426);
								} else if (local408 == 9) {
									Static90.method3489(local63, local121, local134, 16777215);
									Static90.method3498(local63, local121, local68, local426);
								} else if (local408 == 10) {
									Static90.method3489(local297, local121, local134, 16777215);
									Static90.method3498(local63, local121, local68, local426);
								} else if (local408 == 11) {
									Static90.method3489(local297, local121, local134, 16777215);
									Static90.method3498(local63, local418, local68, local426);
								} else if (local408 == 12) {
									Static90.method3489(local63, local121, local134, 16777215);
									Static90.method3498(local63, local418, local68, local426);
								} else if (local408 == 17) {
									Static90.method3498(local63, local121, 1, local426);
								} else if (local408 == 18) {
									Static90.method3498(local297, local121, 1, local426);
								} else if (local408 == 19) {
									Static90.method3498(local297, local418, 1, local426);
								} else if (local408 == 20) {
									Static90.method3498(local63, local418, 1, local426);
								} else {
									@Pc(570) int local570;
									if (local408 == 25) {
										for (local570 = 0; local570 < local134; local570++) {
											Static90.method3498(local570 + local63, -local570 + local418, 1, local426);
										}
									} else if (local408 == 26) {
										for (local570 = 0; local570 < local134; local570++) {
											Static90.method3498(local63 + local570, local121 + local570, 1, local426);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local63 = 0; local63 < local15; local63++) {
			local57 = local41 * local63 >> 16;
			local68 = (local63 + 1) * local41 >> 16;
			local79 = local68 - local57;
			if (local79 > 0) {
				local57 += arg7;
				@Pc(740) byte[][] local740 = Static157.aByteArrayArrayArray11[local63 + arg5 >> 6];
				for (@Pc(742) int local742 = 0; local742 < local10; local742++) {
					@Pc(752) int local752 = (local742 + 1) * local24 >> 16;
					@Pc(758) int local758 = local742 * local24 >> 16;
					@Pc(763) int local763 = local752 - local758;
					if (local763 > 0) {
						@Pc(772) int local772 = local742 + arg2 >> 6;
						local758 += arg0;
						local113 = ((local742 + arg2 & 0x3F) << 6) + (local63 + arg5 & 0x3F);
						if (local740[local772] != null) {
							local121 = local740[local772][local113] & 0xFF;
							if (local121 != 0) {
								if (local121 == 47 || local121 == 53) {
									Static186.aClass1_Sub2_Sub8_Sub2Array2[local121 - 1].method1956(local57, local758, local79 * 2 + 1, local763 * 2 + 1);
								} else {
									Static186.aClass1_Sub2_Sub8_Sub2Array2[local121 - 1].method1956(local57 - local79 / 2, -(local763 / 2) + local758, local79 * 2, local763 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILclient!ve;)[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] method905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class69 arg2) {
		return Static149.method2564(arg0, arg1, arg2) ? Static91.method1651() : null;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!vc;B)Z")
	public static boolean method906(@OriginalArg(0) Class98 arg0) {
		if (Static134.aBoolean140) {
			if (Static105.method1831(arg0) != 0) {
				return false;
			}
			if (arg0.anInt4373 == 0) {
				return false;
			}
		}
		return arg0.aBoolean218;
	}
}
