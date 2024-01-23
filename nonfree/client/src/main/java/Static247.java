import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
	public static int[] anIntArray467 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZIIIIIIIZLclient!ic;)V")
	public static void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class75 arg9) {
		if (arg8 && !Static241.method3782() && (Static303.aByteArrayArrayArray19[0][arg7][arg6] & 0x2) == 0) {
			if ((Static303.aByteArrayArrayArray19[arg2][arg7][arg6] & 0x10) != 0) {
				return;
			}
			if (Static183.method2976(arg6, arg7, arg2) != Static204.anInt4430) {
				return;
			}
		}
		if (arg2 < Static75.anInt1755) {
			Static75.anInt1755 = arg2;
		}
		@Pc(65) Class92 local65 = Static166.method2725(arg0);
		if (Static294.aBoolean367 && local65.aBoolean203) {
			return;
		}
		@Pc(82) int local82;
		@Pc(85) int local85;
		if (arg4 == 1 || arg4 == 3) {
			local85 = local65.anInt3227;
			local82 = local65.anInt3182;
		} else {
			local82 = local65.anInt3227;
			local85 = local65.anInt3182;
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if (local82 + arg7 > 104) {
			local100 = arg7;
			local104 = arg7 + 1;
		} else {
			local104 = arg7 + (local82 + 1 >> 1);
			local100 = (local82 >> 1) + arg7;
		}
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (arg6 + local85 > 104) {
			local129 = arg6;
			local133 = arg6 + 1;
		} else {
			local129 = arg6 + (local85 >> 1);
			local133 = arg6 + (local85 + 1 >> 1);
		}
		@Pc(155) int[][] local155 = Static46.anIntArrayArrayArray1[arg5];
		@Pc(163) int local163 = (local82 << 6) + (arg7 << 7);
		@Pc(171) int local171 = (arg6 << 7) + (local85 << 6);
		@Pc(199) int local199 = local155[local100][local129] + local155[local104][local129] + local155[local100][local133] + local155[local104][local133] >> 2;
		@Pc(201) int local201 = 0;
		@Pc(211) int[][] local211;
		if (Static294.aBoolean367 && arg5 != 0) {
			local211 = Static46.anIntArrayArrayArray1[0];
			local201 = local199 - (local211[local104][local133] + local211[local100][local133] + local211[local100][local129] + local211[local104][local129] >> 2);
		}
		@Pc(257) long local257 = (long) (arg4 << 20 | arg3 << 14 | arg7 | arg6 << 7 | 0x40000000);
		local211 = null;
		if (local65.anInt3210 == 0 || arg1) {
			local257 |= Long.MIN_VALUE;
		}
		if (arg1) {
			local211 = Static299.anIntArrayArrayArray14[0];
		} else if (arg5 < 3) {
			local211 = Static46.anIntArrayArrayArray1[arg5 + 1];
		}
		if (local65.anInt3226 == 1) {
			local257 |= 0x400000L;
		}
		if (local65.aBoolean200) {
			local257 |= 0x80000000L;
		}
		local257 |= (long) arg0 << 32;
		if (local65.method2327()) {
			Static124.method2029(arg4, null, 0, arg2, arg7, local65, null, arg6);
		}
		@Pc(337) boolean local337 = local65.aBoolean204 & !arg1;
		@Pc(388) Class2 local388;
		@Pc(404) Class128 local404;
		if (arg3 == 22) {
			if (Static293.aBoolean364 || local65.anInt3210 != 0 || local65.anInt3202 == 1 || local65.aBoolean197) {
				if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
					local404 = local65.method2325(null, local155, arg8, local211, 22, local337, local163, arg4, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
					}
					local388 = local404.aClass2_8;
				} else {
					local388 = new Class2_Sub5(arg0, 22, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
				}
				Static275.method4160(arg2, arg7, arg6, local199, local388, local257, local65.aBoolean209);
				if (local65.anInt3202 == 1 && arg9 != null) {
					arg9.method1812(arg7, arg6);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
				local404 = local65.method2325(null, local155, arg8, local211, 10, local337, local163, arg3 == 11 ? arg4 + 4 : arg4, local171, local199);
				if (Static294.aBoolean367 && local337) {
					Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
				}
				local388 = local404.aClass2_8;
			} else {
				local388 = new Class2_Sub5(arg0, 10, arg3 == 11 ? arg4 + 4 : arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
			}
			if (local388 != null) {
				@Pc(540) boolean local540 = Static214.method3428(arg2, arg7, arg6, local199, local82, local85, local388, local257);
				if (local65.aBoolean205 && local540 && arg8) {
					@Pc(550) int local550 = 15;
					if (local388 instanceof Class2_Sub1) {
						local550 = ((Class2_Sub1) local388).method561() / 4;
						if (local550 > 30) {
							local550 = 30;
						}
					}
					for (@Pc(567) int local567 = 0; local567 <= local82; local567++) {
						for (@Pc(572) int local572 = 0; local572 <= local85; local572++) {
							if (local550 > Static170.aByteArrayArrayArray14[arg2][local567 + arg7][local572 + arg6]) {
								Static170.aByteArrayArrayArray14[arg2][arg7 + local567][local572 + arg6] = (byte) local550;
							}
						}
					}
				}
			}
			if (local65.anInt3202 != 0 && arg9 != null) {
				arg9.method1815(arg6, local65.aBoolean210, arg7, local82, local85, !local65.aBoolean202);
			}
		} else if (arg3 >= 12) {
			if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
				local404 = local65.method2325(null, local155, arg8, local211, arg3, local337, local163, arg4, local171, local199);
				if (Static294.aBoolean367 && local337) {
					Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
				}
				local388 = local404.aClass2_8;
			} else {
				local388 = new Class2_Sub5(arg0, arg3, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
			}
			Static214.method3428(arg2, arg7, arg6, local199, 1, 1, local388, local257);
			if (arg8 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg2 > 0 && local65.anInt3205 != 0) {
				Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x4;
			}
			if (local65.anInt3202 != 0 && arg9 != null) {
				arg9.method1815(arg6, local65.aBoolean210, arg7, local82, local85, !local65.aBoolean202);
			}
		} else if (arg3 == 0) {
			if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
				local404 = local65.method2325(null, local155, arg8, local211, 0, local337, local163, arg4, local171, local199);
				if (Static294.aBoolean367 && local337) {
					Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
				}
				local388 = local404.aClass2_8;
			} else {
				local388 = new Class2_Sub5(arg0, 0, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
			}
			Static301.method3614(arg2, arg7, arg6, local199, local388, null, Static81.anIntArray193[arg4], 0, local257);
			if (arg8) {
				if (arg4 == 0) {
					if (local65.aBoolean205) {
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6] = 50;
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6 + 1] = 50;
					}
					if (local65.anInt3205 == 1) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x1;
					}
				} else if (arg4 == 1) {
					if (local65.aBoolean205) {
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6 + 1] = 50;
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6 + 1] = 50;
					}
					if (local65.anInt3205 == 1) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6 + 1] |= 0x2;
					}
				} else if (arg4 == 2) {
					if (local65.aBoolean205) {
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6] = 50;
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6 + 1] = 50;
					}
					if (local65.anInt3205 == 1) {
						Static211.anIntArrayArrayArray9[arg2][arg7 + 1][arg6] |= 0x1;
					}
				} else if (arg4 == 3) {
					if (local65.aBoolean205) {
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6] = 50;
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6] = 50;
					}
					if (local65.anInt3205 == 1) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x2;
					}
				}
			}
			if (local65.anInt3202 != 0 && arg9 != null) {
				arg9.method1809(local65.aBoolean210, arg4, arg6, arg3, arg7, !local65.aBoolean202);
			}
			if (local65.anInt3225 != 16) {
				Static59.method1078(arg2, arg7, arg6, local65.anInt3225);
			}
		} else if (arg3 == 1) {
			if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
				local404 = local65.method2325(null, local155, arg8, local211, 1, local337, local163, arg4, local171, local199);
				if (Static294.aBoolean367 && local337) {
					Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
				}
				local388 = local404.aClass2_8;
			} else {
				local388 = new Class2_Sub5(arg0, 1, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
			}
			Static301.method3614(arg2, arg7, arg6, local199, local388, null, Static65.anIntArray167[arg4], 0, local257);
			if (local65.aBoolean205 && arg8) {
				if (arg4 == 0) {
					Static170.aByteArrayArrayArray14[arg2][arg7][arg6 + 1] = 50;
				} else if (arg4 == 1) {
					Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6 + 1] = 50;
				} else if (arg4 == 2) {
					Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6] = 50;
				} else if (arg4 == 3) {
					Static170.aByteArrayArrayArray14[arg2][arg7][arg6] = 50;
				}
			}
			if (local65.anInt3202 != 0 && arg9 != null) {
				arg9.method1809(local65.aBoolean210, arg4, arg6, arg3, arg7, !local65.aBoolean202);
			}
		} else {
			@Pc(1269) int local1269;
			if (arg3 == 2) {
				local1269 = arg4 + 1 & 0x3;
				@Pc(1300) Class2 local1300;
				@Pc(1314) Class2 local1314;
				if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
					@Pc(1332) Class128 local1332 = local65.method2325(null, local155, arg8, local211, 2, local337, local163, arg4 + 4, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local1332.aClass46_Sub1_4, local163, local201, local171);
					}
					local1300 = local1332.aClass2_8;
					local1332 = local65.method2325(null, local155, arg8, local211, 2, local337, local163, local1269, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local1332.aClass46_Sub1_4, local163, local201, local171);
					}
					local1314 = local1332.aClass2_8;
				} else {
					local1300 = new Class2_Sub5(arg0, 2, arg4 + 4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
					local1314 = new Class2_Sub5(arg0, 2, local1269, arg5, arg7, arg6, -1, local65.aBoolean198, null);
				}
				Static301.method3614(arg2, arg7, arg6, local199, local1300, local1314, Static81.anIntArray193[arg4], Static81.anIntArray193[local1269], local257);
				if (local65.anInt3205 == 1 && arg8) {
					if (arg4 == 0) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x1;
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6 + 1] |= 0x2;
					} else if (arg4 == 1) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6 + 1] |= 0x2;
						Static211.anIntArrayArrayArray9[arg2][arg7 + 1][arg6] |= 0x1;
					} else if (arg4 == 2) {
						Static211.anIntArrayArrayArray9[arg2][arg7 + 1][arg6] |= 0x1;
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x2;
					} else if (arg4 == 3) {
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x2;
						Static211.anIntArrayArrayArray9[arg2][arg7][arg6] |= 0x1;
					}
				}
				if (local65.anInt3202 != 0 && arg9 != null) {
					arg9.method1809(local65.aBoolean210, arg4, arg6, arg3, arg7, !local65.aBoolean202);
				}
				if (local65.anInt3225 != 16) {
					Static59.method1078(arg2, arg7, arg6, local65.anInt3225);
				}
			} else if (arg3 == 3) {
				if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
					local404 = local65.method2325(null, local155, arg8, local211, 3, local337, local163, arg4, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
					}
					local388 = local404.aClass2_8;
				} else {
					local388 = new Class2_Sub5(arg0, 3, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
				}
				Static301.method3614(arg2, arg7, arg6, local199, local388, null, Static65.anIntArray167[arg4], 0, local257);
				if (local65.aBoolean205 && arg8) {
					if (arg4 == 0) {
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6 + 1] = 50;
					} else if (arg4 == 1) {
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6 + 1] = 50;
					} else if (arg4 == 2) {
						Static170.aByteArrayArrayArray14[arg2][arg7 + 1][arg6] = 50;
					} else if (arg4 == 3) {
						Static170.aByteArrayArrayArray14[arg2][arg7][arg6] = 50;
					}
				}
				if (local65.anInt3202 != 0 && arg9 != null) {
					arg9.method1809(local65.aBoolean210, arg4, arg6, arg3, arg7, !local65.aBoolean202);
				}
			} else if (arg3 == 9) {
				if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
					local404 = local65.method2325(null, local155, arg8, local211, arg3, local337, local163, arg4, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
					}
					local388 = local404.aClass2_8;
				} else {
					local388 = new Class2_Sub5(arg0, arg3, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
				}
				Static214.method3428(arg2, arg7, arg6, local199, 1, 1, local388, local257);
				if (local65.anInt3202 != 0 && arg9 != null) {
					arg9.method1815(arg6, local65.aBoolean210, arg7, local82, local85, !local65.aBoolean202);
				}
				if (local65.anInt3225 != 16) {
					Static59.method1078(arg2, arg7, arg6, local65.anInt3225);
				}
			} else if (arg3 == 4) {
				if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
					local404 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, arg4, local171, local199);
					if (Static294.aBoolean367 && local337) {
						Static177.method2849(local404.aClass46_Sub1_4, local163, local201, local171);
					}
					local388 = local404.aClass2_8;
				} else {
					local388 = new Class2_Sub5(arg0, 4, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
				}
				Static47.method951(arg2, arg7, arg6, local199, local388, null, Static81.anIntArray193[arg4], 0, 0, 0, local257);
			} else {
				@Pc(1967) long local1967;
				@Pc(2010) Class2 local2010;
				@Pc(2026) Class128 local2026;
				if (arg3 == 5) {
					local1269 = 16;
					local1967 = Static270.method4100(arg2, arg7, arg6);
					if (local1967 != 0L) {
						local1269 = Static166.method2725((int) (local1967 >>> 32) & Integer.MAX_VALUE).anInt3225;
					}
					if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
						local2026 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, arg4, local171, local199);
						if (Static294.aBoolean367 && local337) {
							Static177.method2849(local2026.aClass46_Sub1_4, local163 - Static79.anIntArray191[arg4] * 8, local201, local171 - Static161.anIntArray322[arg4] * 8);
						}
						local2010 = local2026.aClass2_8;
					} else {
						local2010 = new Class2_Sub5(arg0, 4, arg4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
					}
					Static47.method951(arg2, arg7, arg6, local199, local2010, null, Static81.anIntArray193[arg4], 0, Static79.anIntArray191[arg4] * local1269, local1269 * Static161.anIntArray322[arg4], local257);
				} else if (arg3 == 6) {
					local1967 = Static270.method4100(arg2, arg7, arg6);
					local1269 = 8;
					if (local1967 != 0L) {
						local1269 = Static166.method2725((int) (local1967 >>> 32) & Integer.MAX_VALUE).anInt3225 / 2;
					}
					if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
						local2026 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, arg4 + 4, local171, local199);
						if (Static294.aBoolean367 && local337) {
							Static177.method2849(local2026.aClass46_Sub1_4, local163 - Static146.anIntArray394[arg4] * 8, local201, local171 - Static111.anIntArray257[arg4] * 8);
						}
						local2010 = local2026.aClass2_8;
					} else {
						local2010 = new Class2_Sub5(arg0, 4, arg4 + 4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
					}
					Static47.method951(arg2, arg7, arg6, local199, local2010, null, 256, arg4, Static146.anIntArray394[arg4] * local1269, local1269 * Static111.anIntArray257[arg4], local257);
				} else if (arg3 == 7) {
					@Pc(2215) int local2215 = arg4 + 2 & 0x3;
					if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
						@Pc(2244) Class128 local2244 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, local2215 + 4, local171, local199);
						if (Static294.aBoolean367 && local337) {
							Static177.method2849(local2244.aClass46_Sub1_4, local163, local201, local171);
						}
						local388 = local2244.aClass2_8;
					} else {
						local388 = new Class2_Sub5(arg0, 4, local2215 + 4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
					}
					Static47.method951(arg2, arg7, arg6, local199, local388, null, 256, local2215, 0, 0, local257);
				} else if (arg3 == 8) {
					local1269 = 8;
					local1967 = Static270.method4100(arg2, arg7, arg6);
					if (local1967 != 0L) {
						local1269 = Static166.method2725(Integer.MAX_VALUE & (int) (local1967 >>> 32)).anInt3225 / 2;
					}
					@Pc(2326) int local2326 = arg4 + 2 & 0x3;
					@Pc(2422) Class2 local2422;
					if (local65.anInt3180 == -1 && local65.anIntArray295 == null && local65.anIntArray300 == null && !local65.aBoolean199) {
						@Pc(2345) int local2345 = Static146.anIntArray394[arg4] * 8;
						@Pc(2351) int local2351 = Static111.anIntArray257[arg4] * 8;
						@Pc(2369) Class128 local2369 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, arg4 + 4, local171, local199);
						if (Static294.aBoolean367 && local337) {
							Static177.method2849(local2369.aClass46_Sub1_4, local163 - local2345, local201, local171 - local2351);
						}
						local2010 = local2369.aClass2_8;
						local2369 = local65.method2325(null, local155, arg8, local211, 4, local337, local163, local2326 + 4, local171, local199);
						if (Static294.aBoolean367 && local337) {
							Static177.method2849(local2369.aClass46_Sub1_4, local163 - local2345, local201, local171 - local2351);
						}
						local2422 = local2369.aClass2_8;
					} else {
						local2010 = new Class2_Sub5(arg0, 4, arg4 + 4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
						local2422 = new Class2_Sub5(arg0, 4, local2326 + 4, arg5, arg7, arg6, -1, local65.aBoolean198, null);
					}
					Static47.method951(arg2, arg7, arg6, local199, local2010, local2422, 256, arg4, local1269 * Static146.anIntArray394[arg4], local1269 * Static111.anIntArray257[arg4], local257);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method3809(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local12);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 + 1 - 65;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 + 1 - 97;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method3810(@OriginalArg(1) Class2_Sub4 arg0) {
		arg0.aBoolean178 = false;
		@Pc(14) Class32 local14;
		if (arg0.anInt2820 != -1) {
			local14 = Static202.method3231(arg0.anInt2820);
			if (local14 == null || local14.anIntArray123 == null) {
				arg0.anInt2820 = -1;
			} else {
				arg0.anInt2776++;
				if (arg0.anInt2826 < local14.anIntArray123.length && arg0.anInt2776 > local14.anIntArray121[arg0.anInt2826]) {
					arg0.anInt2776 = 1;
					arg0.anInt2812++;
					arg0.anInt2826++;
					Static154.method2507(arg0 == Static56.aClass2_Sub4_Sub2_1, arg0.anInt2846, arg0.anInt2794, arg0.anInt2826, local14);
				}
				if (local14.anIntArray123.length <= arg0.anInt2826) {
					arg0.anInt2826 = 0;
					arg0.anInt2776 = 0;
					Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, arg0.anInt2826, local14);
				}
				arg0.anInt2812 = arg0.anInt2826 + 1;
				if (arg0.anInt2812 >= local14.anIntArray123.length) {
					arg0.anInt2812 = 0;
				}
			}
		}
		@Pc(152) Class32 local152;
		if (arg0.anInt2825 != -1 && Static133.anInt3061 >= arg0.anInt2786) {
			@Pc(141) Class94 local141 = Static28.method611(arg0.anInt2825);
			@Pc(144) int local144 = local141.anInt3368;
			if (local144 == -1) {
				arg0.anInt2825 = -1;
			} else {
				label305: {
					local152 = Static202.method3231(local144);
					if (local141.aBoolean220) {
						if (local152.anInt963 == 3) {
							if (arg0.anInt2778 > 0 && arg0.anInt2798 <= Static133.anInt3061 && arg0.anInt2767 < Static133.anInt3061) {
								arg0.anInt2825 = -1;
								break label305;
							}
						} else if (local152.anInt963 == 1 && arg0.anInt2778 > 0 && arg0.anInt2798 <= Static133.anInt3061 && Static133.anInt3061 > arg0.anInt2767) {
							arg0.anInt2786 = Static133.anInt3061 + 1;
							break label305;
						}
					}
					if (local152 == null || local152.anIntArray123 == null) {
						arg0.anInt2825 = -1;
					} else {
						if (arg0.anInt2837 < 0) {
							arg0.anInt2837 = 0;
							Static154.method2507(arg0 == Static56.aClass2_Sub4_Sub2_1, arg0.anInt2846, arg0.anInt2794, 0, local152);
						}
						arg0.anInt2808++;
						if (local152.anIntArray123.length > arg0.anInt2837 && local152.anIntArray121[arg0.anInt2837] < arg0.anInt2808) {
							arg0.anInt2837++;
							arg0.anInt2808 = 1;
							Static154.method2507(arg0 == Static56.aClass2_Sub4_Sub2_1, arg0.anInt2846, arg0.anInt2794, arg0.anInt2837, local152);
						}
						if (local152.anIntArray123.length <= arg0.anInt2837) {
							if (local141.aBoolean220) {
								arg0.anInt2815++;
								arg0.anInt2837 -= local152.anInt968;
								if (local152.anInt971 <= arg0.anInt2815) {
									arg0.anInt2825 = -1;
								} else if (arg0.anInt2837 >= 0 && arg0.anInt2837 < local152.anIntArray123.length) {
									Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, arg0.anInt2837, local152);
								} else {
									arg0.anInt2825 = -1;
								}
							} else {
								arg0.anInt2825 = -1;
							}
						}
						arg0.anInt2785 = arg0.anInt2837 + 1;
						if (local152.anIntArray123.length <= arg0.anInt2785) {
							if (local141.aBoolean220) {
								arg0.anInt2785 -= local152.anInt968;
								if (arg0.anInt2815 + 1 >= local152.anInt971) {
									arg0.anInt2785 = -1;
								} else if (arg0.anInt2785 < 0 || arg0.anInt2785 >= local152.anIntArray123.length) {
									arg0.anInt2785 = -1;
								}
							} else {
								arg0.anInt2785 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt2822 != -1 && arg0.anInt2830 <= 1) {
			local14 = Static202.method3231(arg0.anInt2822);
			if (local14.anInt963 == 3) {
				if (arg0.anInt2778 > 0 && Static133.anInt3061 >= arg0.anInt2798 && arg0.anInt2767 < Static133.anInt3061) {
					arg0.anInt2822 = -1;
				}
			} else if (local14.anInt963 == 1 && arg0.anInt2778 > 0 && Static133.anInt3061 >= arg0.anInt2798 && arg0.anInt2767 < Static133.anInt3061) {
				arg0.anInt2830 = 2;
			}
		}
		if (arg0.anInt2822 != -1 && arg0.anInt2830 == 0) {
			local14 = Static202.method3231(arg0.anInt2822);
			if (local14 == null || local14.anIntArray123 == null) {
				arg0.anInt2822 = -1;
			} else {
				arg0.anInt2829++;
				if (local14.anIntArray123.length > arg0.anInt2800 && local14.anIntArray121[arg0.anInt2800] < arg0.anInt2829) {
					arg0.anInt2829 = 1;
					arg0.anInt2800++;
					Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, arg0.anInt2800, local14);
				}
				if (local14.anIntArray123.length <= arg0.anInt2800) {
					arg0.anInt2800 -= local14.anInt968;
					arg0.anInt2811++;
					if (local14.anInt971 <= arg0.anInt2811) {
						arg0.anInt2822 = -1;
					} else if (arg0.anInt2800 >= 0 && local14.anIntArray123.length > arg0.anInt2800) {
						Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, arg0.anInt2800, local14);
					} else {
						arg0.anInt2822 = -1;
					}
				}
				arg0.anInt2845 = arg0.anInt2800 + 1;
				if (arg0.anInt2845 >= local14.anIntArray123.length) {
					arg0.anInt2845 -= local14.anInt968;
					if (local14.anInt971 <= arg0.anInt2811 + 1) {
						arg0.anInt2845 = -1;
					} else if (arg0.anInt2845 < 0 || arg0.anInt2845 >= local14.anIntArray123.length) {
						arg0.anInt2845 = -1;
					}
				}
				arg0.aBoolean178 = local14.aBoolean68;
			}
		}
		if (arg0.anInt2830 > 0) {
			arg0.anInt2830--;
		}
		for (@Pc(716) int local716 = 0; local716 < arg0.aClass36Array3.length; local716++) {
			@Pc(730) Class36 local730 = arg0.aClass36Array3[local716];
			if (local730 != null) {
				if (local730.anInt1067 > 0) {
					local730.anInt1067--;
				} else {
					local152 = Static202.method3231(local730.anInt1069);
					if (local152 == null || local152.anIntArray123 == null) {
						arg0.aClass36Array3[local716] = null;
					} else {
						local730.anInt1068++;
						if (local730.anInt1066 < local152.anIntArray123.length && local152.anIntArray121[local730.anInt1066] < local730.anInt1068) {
							local730.anInt1068 = 1;
							local730.anInt1066++;
							Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, local730.anInt1066, local152);
						}
						if (local152.anIntArray123.length <= local730.anInt1066) {
							local730.anInt1066 -= local152.anInt968;
							local730.anInt1065++;
							if (local730.anInt1065 >= local152.anInt971) {
								arg0.aClass36Array3[local716] = null;
							} else if (local730.anInt1066 >= 0 && local730.anInt1066 < local152.anIntArray123.length) {
								Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, local730.anInt1066, local152);
							} else {
								arg0.aClass36Array3[local716] = null;
							}
						}
						local730.anInt1064 = local730.anInt1066 + 1;
						if (local730.anInt1064 >= local152.anIntArray123.length) {
							local730.anInt1064 -= local152.anInt968;
							if (local730.anInt1065 + 1 >= local152.anInt971) {
								local730.anInt1064 = -1;
							} else if (local730.anInt1064 < 0 || local730.anInt1064 >= local152.anIntArray123.length) {
								local730.anInt1064 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([SBII[Ljava/lang/String;)V")
	public static void method3812(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg2 + arg1) / 2;
		@Pc(23) int local23 = arg2;
		@Pc(27) String local27 = arg3[local21];
		arg3[local21] = arg3[arg1];
		arg3[arg1] = local27;
		@Pc(41) short local41 = arg0[local21];
		arg0[local21] = arg0[arg1];
		arg0[arg1] = local41;
		for (@Pc(53) int local53 = arg2; local53 < arg1; local53++) {
			if (local27 == null || arg3[local53] != null && arg3[local53].compareTo(local27) < (local53 & 0x1)) {
				@Pc(80) String local80 = arg3[local53];
				arg3[local53] = arg3[local23];
				arg3[local23] = local80;
				@Pc(94) short local94 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23++] = local94;
			}
		}
		arg3[arg1] = arg3[local23];
		arg3[local23] = local27;
		arg0[arg1] = arg0[local23];
		arg0[local23] = local41;
		method3812(arg0, local23 - 1, arg2, arg3);
		method3812(arg0, arg1, local23 + 1, arg3);
	}
}
