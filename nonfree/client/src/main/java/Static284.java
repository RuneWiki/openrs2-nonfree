import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray41 = new String[200];

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "[I")
	public static final int[] anIntArray464 = new int[25];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIZI[[[Lclient!e;I)Z")
	public static boolean method4847(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class57[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg0 ? 1 : (byte) (Static230.anInt4802 & 0xFF);
		if (local22 == Static173.aByteArrayArrayArray6[Static279.anInt5645][arg4][arg1]) {
			return false;
		} else if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][arg4][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			@Pc(56) int local56 = 0;
			Static219.anIntArray377[0] = arg4;
			@Pc(63) int local63 = local54 + 1;
			Static38.anIntArray104[0] = arg1;
			Static173.aByteArrayArrayArray6[Static279.anInt5645][arg4][arg1] = local22;
			while (local56 != local63) {
				@Pc(81) int local81 = Static219.anIntArray377[local56] & 0xFFFF;
				@Pc(89) int local89 = Static219.anIntArray377[local56] >> 16 & 0xFF;
				@Pc(97) int local97 = Static219.anIntArray377[local56] >> 24 & 0xFF;
				@Pc(103) int local103 = Static38.anIntArray104[local56] & 0xFFFF;
				@Pc(111) int local111 = Static38.anIntArray104[local56] >> 16 & 0xFF;
				local56 = local56 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static348.aByteArrayArrayArray11[Static279.anInt5645][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(175) int local175;
				@Pc(225) int local225;
				label231: for (@Pc(137) int local137 = Static279.anInt5645 + 1; local137 <= 3; local137++) {
					if ((Static348.aByteArrayArrayArray11[local137][local81][local103] & 0x8) == 0) {
						@Pc(335) Class2_Sub2 local335;
						@Pc(345) int local345;
						@Pc(324) Class57 local324;
						@Pc(330) Class95 local330;
						if (local119 && arg3[local137][local81][local103] != null) {
							if (arg3[local137][local81][local103].aClass2_Sub4_1 != null) {
								local175 = Static41.method773(local89);
								if (local175 == arg3[local137][local81][local103].aClass2_Sub4_1.anInt3996 || arg3[local137][local81][local103].aClass2_Sub4_2 != null && local175 == arg3[local137][local81][local103].aClass2_Sub4_2.anInt3996) {
									continue;
								}
								if (local97 != 0) {
									local225 = Static41.method773(local97);
									if (local225 == arg3[local137][local81][local103].aClass2_Sub4_1.anInt3996 || arg3[local137][local81][local103].aClass2_Sub4_2 != null && arg3[local137][local81][local103].aClass2_Sub4_2.anInt3996 == local225) {
										continue;
									}
								}
								if (local111 != 0) {
									local225 = Static41.method773(local111);
									if (local225 == arg3[local137][local81][local103].aClass2_Sub4_1.anInt3996 || arg3[local137][local81][local103].aClass2_Sub4_2 != null && arg3[local137][local81][local103].aClass2_Sub4_2.anInt3996 == local225) {
										continue;
									}
								}
							}
							local324 = arg3[local137][local81][local103];
							if (local324.aClass95_2 != null) {
								for (local330 = local324.aClass95_2; local330 != null; local330 = local330.aClass95_3) {
									local335 = local330.aClass2_Sub2_1;
									if (local335 instanceof Interface5) {
										@Pc(341) Interface5 local341 = (Interface5) local335;
										local345 = local341.method4733();
										if (local345 == 21) {
											local345 = 19;
										}
										@Pc(356) int local356 = local341.method4734();
										@Pc(362) int local362 = local345 | local356 << 6;
										if (local89 == local362 || local97 != 0 && local97 == local362 || local111 != 0 && local362 == local111) {
											continue label231;
										}
									}
								}
							}
						}
						local324 = arg3[local137][local81][local103];
						if (local324 != null && local324.aClass95_2 != null) {
							for (local330 = local324.aClass95_2; local330 != null; local330 = local330.aClass95_3) {
								local335 = local330.aClass2_Sub2_1;
								if (local335.aShort83 != local335.aShort85 || local335.aShort82 != local335.aShort84) {
									for (@Pc(435) int local435 = local335.aShort85; local435 <= local335.aShort83; local435++) {
										for (local345 = local335.aShort84; local345 <= local335.aShort82; local345++) {
											Static173.aByteArrayArrayArray6[local137][local435][local345] = local22;
										}
									}
								}
							}
						}
						local133 = true;
						Static173.aByteArrayArrayArray6[local137][local81][local103] = local22;
					}
				}
				if (local133) {
					local175 = Static307.aClass26Array3[Static279.anInt5645 + 1].method4996(local81, local103);
					if (Static238.anIntArray408[arg2] < local175) {
						Static238.anIntArray408[arg2] = local175;
					}
					local225 = local81 << 7;
					@Pc(515) int local515 = local103 << 7;
					if (Static8.anIntArray41[arg2] > local225) {
						Static8.anIntArray41[arg2] = local225;
					} else if (local225 > Static44.anIntArray119[arg2]) {
						Static44.anIntArray119[arg2] = local225;
					}
					if (Static211.anIntArray367[arg2] > local515) {
						Static211.anIntArray367[arg2] = local515;
					} else if (local515 > Static200.anIntArray364[arg2]) {
						Static200.anIntArray364[arg2] = local515;
					}
				}
				if (!local119) {
					if (local81 >= 1 && local22 != Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103]) {
						Static219.anIntArray377[local63] = 0xD3000000 | 0x120000 | local81 - 1;
						Static38.anIntArray104[local63] = local103 | 0x130000;
						Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103] = local22;
						local63 = local63 + 1 & 0xFFF;
					}
					local103++;
					if (Static290.anInt5893 > local103) {
						if (local81 - 1 >= 0 && local22 != Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103] && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81][local103] & 0x4) == 0 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static219.anIntArray377[local63] = local81 - 1 | 0x120000 | 0x52000000;
							Static38.anIntArray104[local63] = local103 | 0x130000;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static173.aByteArrayArrayArray6[Static279.anInt5645][local81][local103] != local22) {
							Static219.anIntArray377[local63] = local81 | 0x520000 | 0x13000000;
							Static38.anIntArray104[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81][local103] = local22;
						}
						if (local81 + 1 < Static92.anInt2048 && Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] != local22 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81][local103] & 0x4) == 0 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static219.anIntArray377[local63] = local81 + 1 | 0x92000000 | 0x520000;
							Static38.anIntArray104[local63] = local103 | 0x530000;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
					local103--;
					if (Static92.anInt2048 > local81 + 1 && Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] != local22) {
						Static219.anIntArray377[local63] = local81 + 1 | 0x920000 | 0x53000000;
						Static38.anIntArray104[local63] = local103 | 0x930000;
						local63 = local63 + 1 & 0xFFF;
						Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] = local22;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103] != local22 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81][local103] & 0x4) == 0 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static219.anIntArray377[local63] = local81 - 1 | 0x12000000 | 0xD20000;
							Static38.anIntArray104[local63] = local103 | 0xD30000;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static173.aByteArrayArrayArray6[Static279.anInt5645][local81][local103] != local22) {
							Static219.anIntArray377[local63] = 0x93000000 | 0xD20000 | local81;
							Static38.anIntArray104[local63] = local103 | 0xD30000;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local81 + 1 < Static92.anInt2048 && local22 != Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81][local103] & 0x4) == 0 && (Static348.aByteArrayArrayArray11[Static279.anInt5645][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static219.anIntArray377[local63] = local81 + 1 | 0x920000 | 0xD2000000;
							Static38.anIntArray104[local63] = local103 | 0x930000;
							local63 = local63 + 1 & 0xFFF;
							Static173.aByteArrayArrayArray6[Static279.anInt5645][local81 + 1][local103] = local22;
						}
					}
				}
			}
			if (Static238.anIntArray408[arg2] != -1000000) {
				Static238.anIntArray408[arg2] += 10;
				Static8.anIntArray41[arg2] -= 50;
				Static44.anIntArray119[arg2] += 50;
				Static200.anIntArray364[arg2] += 50;
				Static211.anIntArray367[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!fd;I)Lclient!fd;")
	public static Class72 method4848(@OriginalArg(0) Class72 arg0) {
		@Pc(11) Class72 local11 = Static46.method874(arg0);
		if (local11 == null) {
			local11 = arg0.aClass72_8;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z")
	public static boolean method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static244.anIntArrayArrayArray14[arg0][arg1][arg2];
		if (local7 == -Static189.anInt4086) {
			return false;
		} else if (local7 == Static189.anInt4086) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static75.method1392(local22 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg2), local26 + 1) && Static75.method1392(local22 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg2), local26 + 1) && Static75.method1392(local22 + 128 - 1, Static307.aClass26Array3[arg0].method4996(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static75.method1392(local22 + 1, Static307.aClass26Array3[arg0].method4996(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static244.anIntArrayArrayArray14[arg0][arg1][arg2] = Static189.anInt4086;
				return true;
			} else {
				Static244.anIntArrayArrayArray14[arg0][arg1][arg2] = -Static189.anInt4086;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBI)V")
	public static void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static126.method2525(local35, true);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4851(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
	public static void method4852(@OriginalArg(1) int arg0) {
		Static205.anInt4328 = arg0;
		@Pc(7) Class154 local7 = Static310.aClass154_95;
		synchronized (Static310.aClass154_95) {
			Static310.aClass154_95.method4219();
		}
		local7 = Static199.aClass154_102;
		synchronized (Static199.aClass154_102) {
			Static199.aClass154_102.method4219();
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public static void method4854() {
		Static158.aClass92_6.method4488(Static22.anInt409, Static131.aBoolean249 ? Static47.anInt1065 + 256 : -1);
	}
}
