import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
	public static int anInt3246;

	@OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1129 = Static200.method3116(" has logged out)3");

	@OriginalMember(owner = "client!oi", name = "W", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1127 = aClass60_1129;

	@OriginalMember(owner = "client!oi", name = "bb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1128 = Static200.method3116("scape main");

	@OriginalMember(owner = "client!oi", name = "cb", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
	public static void method2482() {
		@Pc(5) int local5 = Static141.anInt3154 * 128 + 64;
		@Pc(15) int local15 = Static172.anInt3710 * 128 + 64;
		@Pc(23) int local23 = Static165.method2268(local15, Static180.anInt3841, local5) - Static82.anInt1950;
		if (Static165.anInt2958 < local15) {
			Static165.anInt2958 += anInt3246 + (local15 - Static165.anInt2958) * Static161.anInt3563 / 1000;
			if (local15 < Static165.anInt2958) {
				Static165.anInt2958 = local15;
			}
		}
		if (local5 > Static17.anInt438) {
			Static17.anInt438 += anInt3246 + (local5 - Static17.anInt438) * Static161.anInt3563 / 1000;
			if (Static17.anInt438 > local5) {
				Static17.anInt438 = local5;
			}
		}
		if (local23 > Static28.anInt2840) {
			Static28.anInt2840 += Static161.anInt3563 * (local23 - Static28.anInt2840) / 1000 + anInt3246;
			if (Static28.anInt2840 > local23) {
				Static28.anInt2840 = local23;
			}
		}
		if (local5 < Static17.anInt438) {
			Static17.anInt438 -= anInt3246 + Static161.anInt3563 * (Static17.anInt438 - local5) / 1000;
			if (Static17.anInt438 < local5) {
				Static17.anInt438 = local5;
			}
		}
		local5 = Static75.anInt1838 * 128 + 64;
		if (local15 < Static165.anInt2958) {
			Static165.anInt2958 -= anInt3246 + Static161.anInt3563 * (Static165.anInt2958 - local15) / 1000;
			if (Static165.anInt2958 < local15) {
				Static165.anInt2958 = local15;
			}
		}
		local15 = Static49.anInt1245 * 128 + 64;
		if (Static28.anInt2840 > local23) {
			Static28.anInt2840 -= (Static28.anInt2840 - local23) * Static161.anInt3563 / 1000 + anInt3246;
			if (local23 > Static28.anInt2840) {
				Static28.anInt2840 = local23;
			}
		}
		local23 = Static165.method2268(local15, Static180.anInt3841, local5) - Static210.anInt3901;
		@Pc(187) int local187 = local23 - Static28.anInt2840;
		@Pc(200) int local200 = local5 - Static17.anInt438;
		@Pc(205) int local205 = local15 - Static165.anInt2958;
		@Pc(217) int local217 = (int) Math.sqrt((double) (local200 * local200 + local205 * local205));
		@Pc(228) int local228 = (int) (Math.atan2((double) local187, (double) local217) * 325.949D) & 0x7FF;
		if (local228 < 128) {
			local228 = 128;
		}
		@Pc(246) int local246 = (int) (Math.atan2((double) local200, (double) local205) * -325.949D) & 0x7FF;
		@Pc(251) int local251 = local246 - Static79.anInt1908;
		if (local228 > 383) {
			local228 = 383;
		}
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (Static134.anInt2897 < local228) {
			Static134.anInt2897 += Static188.anInt4008 + (local228 - Static134.anInt2897) * Static16.anInt435 / 1000;
			if (local228 < Static134.anInt2897) {
				Static134.anInt2897 = local228;
			}
		}
		if (local228 < Static134.anInt2897) {
			Static134.anInt2897 -= Static16.anInt435 * (Static134.anInt2897 - local228) / 1000 + Static188.anInt4008;
			if (local228 > Static134.anInt2897) {
				Static134.anInt2897 = local228;
			}
		}
		if (local251 > 0) {
			Static79.anInt1908 += Static188.anInt4008 + local251 * Static16.anInt435 / 1000;
			Static79.anInt1908 &= 0x7FF;
		}
		if (local251 < 0) {
			Static79.anInt1908 -= Static188.anInt4008 + -local251 * Static16.anInt435 / 1000;
			Static79.anInt1908 &= 0x7FF;
		}
		@Pc(359) int local359 = local246 - Static79.anInt1908;
		if (local359 > 1024) {
			local359 -= 2048;
		}
		if (local359 < -1024) {
			local359 += 2048;
		}
		if (local359 < 0 && local251 > 0 || local359 > 0 && local251 < 0) {
			Static79.anInt1908 = local246;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static49.anIntArrayArrayArray5[arg0][local16][local20] == -Static7.anInt189) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static138.anIntArrayArrayArray17[arg0][arg1][arg3] + arg5;
			if (!Static125.method2122(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static125.method2122(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static125.method2122(local20, local156, local182)) {
				return false;
			} else if (Static125.method2122(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static139.method2382(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static125.method2122(local16 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg3] + arg5, local20 + 1) && Static125.method2122(local16 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static125.method2122(local16 + 128 - 1, Static138.anIntArrayArrayArray17[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static125.method2122(local16 + 1, Static138.anIntArrayArrayArray17[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(JB)Lclient!kh;")
	public static Class60 method2484(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(55) byte[] local55 = new byte[local37];
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local37--;
				local55[local37] = Static205.aByteArray61[(int) (local59 - arg0 * 37L)];
			}
			@Pc(86) Class60 local86 = new Class60();
			local86.aByteArray34 = local55;
			local86.anInt2439 = local55.length;
			return local86;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLclient!k;III)V")
	public static void method2486(@OriginalArg(1) Class1_Sub1_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static91.anInt2134 >= 400) {
			return;
		}
		if (arg0.anIntArray295 != null) {
			arg0 = arg0.method1739();
		}
		if (arg0 == null || !arg0.aBoolean127) {
			return;
		}
		@Pc(32) Class60 local32 = arg0.aClass60_752;
		if (arg0.anInt2327 != 0) {
			local32 = Static34.method611(new Class60[] { local32, Static80.method1428(arg0.anInt2327, Static84.aClass9_Sub4_Sub1_2.anInt1412), Static37.aClass60_287, Static214.aClass60_1569, Static40.method681(arg0.anInt2327), Static102.aClass60_762 });
		}
		if (Static79.anInt1905 == 1) {
			Static56.method1061((long) arg3, Static9.aClass60_1510, arg2, (short) 50, arg1, Static34.method611(new Class60[] { Static108.aClass60_809, Static89.aClass60_679, local32 }));
		} else if (!Static75.aBoolean98) {
			@Pc(121) Class60[] local121 = arg0.aClass60Array15;
			if (Static141.aBoolean172) {
				local121 = Static133.method2216(local121);
			}
			@Pc(131) int local131;
			if (local121 != null) {
				for (local131 = 4; local131 >= 0; local131--) {
					if (local121[local131] != null && (Static156.anInt3468 != 0 || !local121[local131].method1805(Static3.aClass60_31))) {
						@Pc(152) byte local152 = 0;
						if (local131 == 0) {
							local152 = 34;
						}
						if (local131 == 1) {
							local152 = 19;
						}
						if (local131 == 2) {
							local152 = 39;
						}
						if (local131 == 3) {
							local152 = 43;
						}
						if (local131 == 4) {
							local152 = 17;
						}
						Static56.method1061((long) arg3, local121[local131], arg2, local152, arg1, Static34.method611(new Class60[] { Static193.aClass60_1393, local32 }));
					}
				}
			}
			if (Static156.anInt3468 == 0 && local121 != null) {
				for (local131 = 4; local131 >= 0; local131--) {
					if (local121[local131] != null && local121[local131].method1805(Static3.aClass60_31)) {
						@Pc(235) short local235 = 0;
						@Pc(237) short local237 = 0;
						if (local131 == 0) {
							local237 = 34;
						}
						if (Static84.aClass9_Sub4_Sub1_2.anInt1412 < arg0.anInt2327) {
							local235 = 2000;
						}
						if (local131 == 1) {
							local237 = 19;
						}
						if (local131 == 2) {
							local237 = 39;
						}
						if (local131 == 3) {
							local237 = 43;
						}
						if (local131 == 4) {
							local237 = 17;
						}
						if (local237 != 0) {
							local237 += local235;
						}
						Static56.method1061((long) arg3, local121[local131], arg2, local237, arg1, Static34.method611(new Class60[] { Static193.aClass60_1393, local32 }));
					}
				}
			}
			Static56.method1061((long) arg3, Static34.aClass60_271, arg2, (short) 1006, arg1, Static34.method611(new Class60[] { Static193.aClass60_1393, local32 }));
		} else if ((Static210.anInt3912 & 0x2) == 2) {
			Static56.method1061((long) arg3, Static36.aClass60_1324, arg2, (short) 41, arg1, Static34.method611(new Class60[] { Static73.aClass60_561, Static89.aClass60_679, local32 }));
			return;
		}
	}
}
