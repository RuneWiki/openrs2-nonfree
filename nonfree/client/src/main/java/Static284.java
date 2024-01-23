import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[[Lclient!fn;")
	public static Class2_Sub12[][] aClass2_Sub12ArrayArray3;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	public static int anInt5879;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Z")
	public static boolean aBoolean475 = true;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	public static int anInt5880 = 500;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34 = null;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB[[[Lclient!vb;ZII)Z")
	public static boolean method4718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub31[][][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) byte local21 = arg2 ? 1 : (byte) (Static213.anInt4460 & 0xFF);
		if (local21 == Static104.aByteArrayArrayArray6[Static208.anInt4335][arg3][arg4]) {
			return false;
		} else if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static298.anIntArray474[0] = arg3;
			@Pc(57) int local57 = local48 + 1;
			Static182.anIntArray309[0] = arg4;
			Static104.aByteArrayArrayArray6[Static208.anInt4335][arg3][arg4] = local21;
			while (local57 != local50) {
				@Pc(78) int local78 = Static298.anIntArray474[local50] >> 16 & 0xFF;
				@Pc(86) int local86 = Static298.anIntArray474[local50] >> 24 & 0xFF;
				@Pc(92) int local92 = Static298.anIntArray474[local50] & 0xFFFF;
				@Pc(98) int local98 = Static182.anIntArray309[local50] & 0xFFFF;
				@Pc(100) boolean local100 = false;
				@Pc(108) int local108 = Static182.anIntArray309[local50] >> 16 & 0xFF;
				@Pc(110) boolean local110 = false;
				if ((Static134.aByteArrayArrayArray9[Static208.anInt4335][local92][local98] & 0x4) == 0) {
					local110 = true;
				}
				local50 = local50 + 1 & 0xFFF;
				@Pc(135) int local135;
				@Pc(179) int local179;
				label234: for (local135 = Static208.anInt4335 + 1; local135 <= 3; local135++) {
					if ((Static134.aByteArrayArrayArray9[local135][local92][local98] & 0x8) == 0) {
						@Pc(212) int local212;
						@Pc(345) int local345;
						if (local110 && arg1[local135][local92][local98] != null) {
							if (arg1[local135][local92][local98].aClass168_1 != null) {
								local179 = Static295.method4897(local78);
								if (local179 == arg1[local135][local92][local98].aClass168_1.anInt5425 || local179 == arg1[local135][local92][local98].aClass168_1.anInt5430) {
									continue;
								}
								if (local86 != 0) {
									local212 = Static295.method4897(local86);
									if (local212 == arg1[local135][local92][local98].aClass168_1.anInt5425 || arg1[local135][local92][local98].aClass168_1.anInt5430 == local212) {
										continue;
									}
								}
								if (local108 != 0) {
									local212 = Static295.method4897(local108);
									if (local212 == arg1[local135][local92][local98].aClass168_1.anInt5425 || local212 == arg1[local135][local92][local98].aClass168_1.anInt5430) {
										continue;
									}
								}
							}
							if (arg1[local135][local92][local98].aClass34Array2 != null) {
								for (local179 = 0; local179 < arg1[local135][local92][local98].anInt5708; local179++) {
									local212 = (int) (arg1[local135][local92][local98].aClass34Array2[local179].aLong49 >> 14 & 0x3FL);
									@Pc(333) int local333 = (int) (arg1[local135][local92][local98].aClass34Array2[local179].aLong49 >> 20 & 0x3L);
									if (local212 == 21) {
										local212 = 19;
									}
									local345 = local212 | local333 << 6;
									if (local345 == local78 || local86 != 0 && local86 == local345 || local108 != 0 && local108 == local345) {
										continue label234;
									}
								}
							}
						}
						local100 = true;
						@Pc(382) Class2_Sub31 local382 = arg1[local135][local92][local98];
						if (local382 != null && local382.anInt5708 > 0) {
							for (local212 = 0; local212 < local382.anInt5708; local212++) {
								@Pc(405) Class34 local405 = local382.aClass34Array2[local212];
								if (local405.anInt896 != local405.anInt894 || local405.anInt902 != local405.anInt897) {
									for (local345 = local405.anInt894; local345 <= local405.anInt896; local345++) {
										for (@Pc(433) int local433 = local405.anInt897; local433 <= local405.anInt902; local433++) {
											Static104.aByteArrayArrayArray6[local135][local345][local433] = local21;
										}
									}
								}
							}
						}
						Static104.aByteArrayArrayArray6[local135][local92][local98] = local21;
					}
				}
				if (local100) {
					if (Static162.anIntArray257[arg0] < Static141.anIntArrayArrayArray4[Static208.anInt4335 + 1][local92][local98]) {
						Static162.anIntArray257[arg0] = Static141.anIntArrayArrayArray4[Static208.anInt4335 + 1][local92][local98];
					}
					local135 = local92 << 7;
					if (local135 < Static40.anIntArray60[arg0]) {
						Static40.anIntArray60[arg0] = local135;
					} else if (Static212.anIntArray362[arg0] < local135) {
						Static212.anIntArray362[arg0] = local135;
					}
					local179 = local98 << 7;
					if (Static112.anIntArray165[arg0] > local179) {
						Static112.anIntArray165[arg0] = local179;
					} else if (Static170.anIntArray294[arg0] < local179) {
						Static170.anIntArray294[arg0] = local179;
					}
				}
				if (!local110) {
					if (local92 >= 1 && Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] != local21) {
						Static298.anIntArray474[local57] = 0xD3000000 | 0x120000 | local92 - 1;
						Static182.anIntArray309[local57] = local98 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] = local21;
					}
					local98++;
					if (local98 < 104) {
						if (local92 - 1 >= 0 && Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] != local21 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92][local98] & 0x4) == 0 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92 - 1][local98 - 1] & 0x4) == 0) {
							Static298.anIntArray474[local57] = local92 - 1 | 0x120000 | 0x52000000;
							Static182.anIntArray309[local57] = local98 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] = local21;
						}
						if (local21 != Static104.aByteArrayArrayArray6[Static208.anInt4335][local92][local98]) {
							Static298.anIntArray474[local57] = local92 | 0x13000000 | 0x520000;
							Static182.anIntArray309[local57] = local98 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92][local98] = local21;
						}
						if (local92 + 1 < 104 && local21 != Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98] && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92][local98] & 0x4) == 0 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92 + 1][local98 - 1] & 0x4) == 0) {
							Static298.anIntArray474[local57] = local92 + 1 | 0x92000000 | 0x520000;
							Static182.anIntArray309[local57] = local98 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98] = local21;
						}
					}
					local98--;
					if (local92 + 1 < 104 && local21 != Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98]) {
						Static298.anIntArray474[local57] = 0x53000000 | 0x920000 | local92 + 1;
						Static182.anIntArray309[local57] = local98 | 0x930000;
						Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98] = local21;
						local57 = local57 + 1 & 0xFFF;
					}
					local98--;
					if (local98 >= 0) {
						if (local92 - 1 >= 0 && Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] != local21 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92][local98] & 0x4) == 0 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92 - 1][local98 + 1] & 0x4) == 0) {
							Static298.anIntArray474[local57] = local92 - 1 | 0x12000000 | 0xD20000;
							Static182.anIntArray309[local57] = local98 | 0xD30000;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 - 1][local98] = local21;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static104.aByteArrayArrayArray6[Static208.anInt4335][local92][local98] != local21) {
							Static298.anIntArray474[local57] = local92 | 0xD20000 | 0x93000000;
							Static182.anIntArray309[local57] = local98 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92][local98] = local21;
						}
						if (local92 + 1 < 104 && Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98] != local21 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92][local98] & 0x4) == 0 && (Static134.aByteArrayArrayArray9[Static208.anInt4335][local92 + 1][local98 + 1] & 0x4) == 0) {
							Static298.anIntArray474[local57] = local92 + 1 | 0x920000 | 0xD2000000;
							Static182.anIntArray309[local57] = local98 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static104.aByteArrayArrayArray6[Static208.anInt4335][local92 + 1][local98] = local21;
						}
					}
				}
			}
			if (Static162.anIntArray257[arg0] != -1000000) {
				Static162.anIntArray257[arg0] += 10;
				Static40.anIntArray60[arg0] -= 50;
				Static212.anIntArray362[arg0] += 50;
				Static170.anIntArray294[arg0] += 50;
				Static112.anIntArray165[arg0] -= 50;
			}
			return true;
		}
	}
}
