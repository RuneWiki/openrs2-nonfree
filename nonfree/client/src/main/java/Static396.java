import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_109 = new Class194(63, 15);

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
	public static final int[] anIntArray456 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_175 = new Class129(79, -1);

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public static final int anInt6463 = 1406;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIIII)V")
	public static void method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static51.method805(arg5);
		@Pc(18) int local18 = 0;
		@Pc(23) int local23 = arg5 - arg0;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(29) int local29 = arg5;
		@Pc(32) int local32 = -arg5;
		@Pc(34) int local34 = local23;
		@Pc(37) int local37 = -local23;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(79) int local79;
		@Pc(88) int local88;
		if (arg2 >= Static356.anInt5817 && arg2 <= Static3.anInt46) {
			@Pc(51) int[] local51 = Static133.anIntArrayArray15[arg2];
			local60 = Static391.method5106(Static3.anInt45, arg3 - arg5, Static112.anInt1900);
			local68 = Static391.method5106(Static3.anInt45, arg3 + arg5, Static112.anInt1900);
			local79 = Static391.method5106(Static3.anInt45, arg3 - local23, Static112.anInt1900);
			local88 = Static391.method5106(Static3.anInt45, arg3 + local23, Static112.anInt1900);
			Static291.method3606(local79, local51, arg1, local60);
			Static291.method3606(local88, local51, arg4, local79);
			Static291.method3606(local68, local51, arg1, local88);
		}
		while (local18 < local29) {
			local39 += 2;
			local41 += 2;
			local37 += local41;
			local32 += local39;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				Static426.anIntArray479[local34] = local18;
				local37 -= local34 << 1;
			}
			local18++;
			@Pc(201) int local201;
			@Pc(210) int local210;
			@Pc(217) int[] local217;
			@Pc(155) int local155;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local155 = arg2 - local29;
				local60 = local29 + arg2;
				if (Static356.anInt5817 <= local60 && Static3.anInt46 >= local155) {
					if (local23 > local29) {
						local68 = Static426.anIntArray479[local29];
						local79 = Static391.method5106(Static3.anInt45, local18 + arg3, Static112.anInt1900);
						local88 = Static391.method5106(Static3.anInt45, arg3 - local18, Static112.anInt1900);
						local201 = Static391.method5106(Static3.anInt45, local68 + arg3, Static112.anInt1900);
						local210 = Static391.method5106(Static3.anInt45, arg3 - local68, Static112.anInt1900);
						if (Static3.anInt46 >= local60) {
							local217 = Static133.anIntArrayArray15[local60];
							Static291.method3606(local210, local217, arg1, local88);
							Static291.method3606(local201, local217, arg4, local210);
							Static291.method3606(local79, local217, arg1, local201);
						}
						if (local155 >= Static356.anInt5817) {
							local217 = Static133.anIntArrayArray15[local155];
							Static291.method3606(local210, local217, arg1, local88);
							Static291.method3606(local201, local217, arg4, local210);
							Static291.method3606(local79, local217, arg1, local201);
						}
					} else {
						local68 = Static391.method5106(Static3.anInt45, arg3 + local18, Static112.anInt1900);
						local79 = Static391.method5106(Static3.anInt45, arg3 - local18, Static112.anInt1900);
						if (local60 <= Static3.anInt46) {
							Static291.method3606(local68, Static133.anIntArrayArray15[local60], arg1, local79);
						}
						if (local155 >= Static356.anInt5817) {
							Static291.method3606(local68, Static133.anIntArrayArray15[local155], arg1, local79);
						}
					}
				}
			}
			local155 = arg2 - local18;
			local60 = arg2 + local18;
			if (local60 >= Static356.anInt5817 && local155 <= Static3.anInt46) {
				local68 = local29 + arg3;
				local79 = arg3 - local29;
				if (Static3.anInt45 <= local68 && local79 <= Static112.anInt1900) {
					local68 = Static391.method5106(Static3.anInt45, local68, Static112.anInt1900);
					local79 = Static391.method5106(Static3.anInt45, local79, Static112.anInt1900);
					if (local18 >= local23) {
						if (local60 <= Static3.anInt46) {
							Static291.method3606(local68, Static133.anIntArrayArray15[local60], arg1, local79);
						}
						if (Static356.anInt5817 <= local155) {
							Static291.method3606(local68, Static133.anIntArrayArray15[local155], arg1, local79);
						}
					} else {
						local88 = local34 < local18 ? Static426.anIntArray479[local18] : local34;
						local201 = Static391.method5106(Static3.anInt45, local88 + arg3, Static112.anInt1900);
						local210 = Static391.method5106(Static3.anInt45, arg3 - local88, Static112.anInt1900);
						if (local60 <= Static3.anInt46) {
							local217 = Static133.anIntArrayArray15[local60];
							Static291.method3606(local210, local217, arg1, local79);
							Static291.method3606(local201, local217, arg4, local210);
							Static291.method3606(local68, local217, arg1, local201);
						}
						if (Static356.anInt5817 <= local155) {
							local217 = Static133.anIntArrayArray15[local155];
							Static291.method3606(local210, local217, arg1, local79);
							Static291.method3606(local201, local217, arg4, local210);
							Static291.method3606(local68, local217, arg1, local201);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLclient!ae;)Z")
	public static boolean method5142(@OriginalArg(1) Class6 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean25) {
			return false;
		} else if (!arg0.method92(Static98.anInterface9_2)) {
			return false;
		} else if (Static96.aClass252_11.method5659((long) arg0.anInt133) == null) {
			return Static49.aClass252_4.method5659((long) arg0.anInt129) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIB)I")
	public static int method5143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static232.anIntArray246[arg0 & 0x3] : Static401.anIntArray119[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ne;I)Z")
	public static boolean method5144(@OriginalArg(0) Class170 arg0) {
		return arg0 == Static381.aClass170_7 || Static23.aClass170_1 == arg0 || Static163.aClass170_6 == arg0 || Static153.aClass170_11 == arg0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method5145(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 < 128) {
				local16[local18++] = (char) local28;
			} else if (local28 >= 194) {
				@Pc(78) int local78;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local20 + 2 >= local13) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local78 = arg0[local20] & 0xFF;
					if (local78 >= 128 && local78 <= 191) {
						local20++;
						@Pc(96) int local96 = arg0[local20] & 0xFF;
						if (local96 >= 128 && local96 <= 191) {
							local16[local18++] = (char) ((local28 & 0xFFF1F) << 12 | local78 << 6 & 0xFFFFDFC0 | local96 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local13 > local20 + 1) {
					local20++;
					local78 = arg0[local20] & 0xFF;
					if (local78 < 128 || local78 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) (local78 & 0xFFFFFF7F | (local28 & 0xFFFFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
			}
		}
		return new String(local16, 0, local18);
	}
}
