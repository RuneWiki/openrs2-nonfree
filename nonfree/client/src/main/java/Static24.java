import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_309 = Static146.method2172("(U(Y");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt724 = 0;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!ua;")
	public static Class82 aClass82_14 = new Class82(64);

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_310 = Static146.method2172("Ausw-=hlen");

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public static int anInt730 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method517() {
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(39) int local39;
		@Pc(14) int local14;
		@Pc(58) Class2_Sub2_Sub1_Sub4 local58;
		if (Static75.anInt1978 == 248) {
			local14 = Static74.aClass2_Sub18_Sub1_1.method2395();
			local20 = Static74.aClass2_Sub18_Sub1_1.method2379();
			local24 = Static74.aClass2_Sub18_Sub1_1.method2377();
			local32 = Static16.anInt525 + (local24 >> 4 & 0x7);
			local39 = Static83.anInt2156 + (local24 & 0x7);
			if (local32 >= 0 && local39 >= 0 && local32 < 104 && local39 < 104) {
				local58 = new Class2_Sub2_Sub1_Sub4();
				local58.anInt3107 = local20;
				local58.anInt3104 = local14;
				if (Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local32][local39] == null) {
					Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local32][local39] = new Class10();
				}
				Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local32][local39].method448(local58);
				Static181.method3022(local32, local39);
			}
			return;
		}
		@Pc(128) int local128;
		@Pc(134) int local134;
		if (Static75.anInt1978 == 225) {
			local14 = Static74.aClass2_Sub18_Sub1_1.method2377();
			local24 = local14 & 0x3;
			local20 = local14 >> 2;
			local32 = Static169.anIntArray598[local20];
			local39 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local128 = (local39 >> 4 & 0x7) + Static16.anInt525;
			local134 = Static83.anInt2156 + (local39 & 0x7);
			if (local128 >= 0 && local134 >= 0 && local128 < 104 && local134 < 104) {
				Static160.method3002(local134, Static54.anInt1472, 0, -1, -1, local128, local20, local24, local32);
			}
			return;
		}
		@Pc(210) int local210;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(232) int local232;
		if (Static75.anInt1978 == 151) {
			local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local24 = (local14 & 0x7) + Static83.anInt2156;
			local20 = (local14 >> 4 & 0x7) + Static16.anInt525;
			local32 = Static74.aClass2_Sub18_Sub1_1.method2392() + local20;
			local39 = Static74.aClass2_Sub18_Sub1_1.method2392() + local24;
			local128 = Static74.aClass2_Sub18_Sub1_1.method2386();
			local134 = Static74.aClass2_Sub18_Sub1_1.method2353();
			local210 = Static74.aClass2_Sub18_Sub1_1.method2387() * 4;
			local216 = Static74.aClass2_Sub18_Sub1_1.method2387() * 4;
			local220 = Static74.aClass2_Sub18_Sub1_1.method2353();
			@Pc(224) int local224 = Static74.aClass2_Sub18_Sub1_1.method2353();
			@Pc(228) int local228 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local232 = Static74.aClass2_Sub18_Sub1_1.method2387();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104 && local32 >= 0 && local39 >= 0 && local32 < 104 && local39 < 104 && local134 != 65535) {
				local32 = local32 * 128 + 64;
				local39 = local39 * 128 + 64;
				local20 = local20 * 128 + 64;
				local24 = local24 * 128 + 64;
				@Pc(317) Class2_Sub2_Sub1_Sub1 local317 = new Class2_Sub2_Sub1_Sub1(local134, Static54.anInt1472, local20, local24, Static161.method2725(local20, Static54.anInt1472, local24) - local210, local220 - -Static143.anInt3513, local224 + Static143.anInt3513, local228, local232, local128, local216);
				local317.method124(local32, local39, Static161.method2725(local32, Static54.anInt1472, local39) - local216, Static143.anInt3513 + local220);
				Static144.aClass10_93.method448(local317);
			}
		} else if (Static75.anInt1978 == 43) {
			local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local24 = (local14 & 0x7) + Static83.anInt2156;
			local20 = (local14 >> 4 & 0x7) + Static16.anInt525;
			local32 = Static74.aClass2_Sub18_Sub1_1.method2363();
			local39 = Static74.aClass2_Sub18_Sub1_1.method2374();
			local128 = local39 >> 2;
			local210 = Static169.anIntArray598[local128];
			local134 = local39 & 0x3;
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				Static160.method3002(local24, Static54.anInt1472, 0, -1, local32, local20, local128, local134, local210);
			}
		} else if (Static75.anInt1978 == 148) {
			local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
			local20 = Static16.anInt525 + (local14 >> 4 & 0x7);
			local24 = Static83.anInt2156 + (local14 & 0x7);
			local32 = Static74.aClass2_Sub18_Sub1_1.method2353();
			local39 = Static74.aClass2_Sub18_Sub1_1.method2353();
			local128 = Static74.aClass2_Sub18_Sub1_1.method2353();
			if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
				@Pc(473) Class10 local473 = Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local20][local24];
				if (local473 != null) {
					for (@Pc(480) Class2_Sub2_Sub1_Sub4 local480 = (Class2_Sub2_Sub1_Sub4) local473.method444(); local480 != null; local480 = (Class2_Sub2_Sub1_Sub4) local473.method451()) {
						if (local480.anInt3104 == (local32 & 0x7FFF) && local480.anInt3107 == local39) {
							local480.anInt3107 = local128;
							break;
						}
					}
					Static181.method3022(local20, local24);
				}
			}
		} else {
			if (Static75.anInt1978 == 39) {
				@Pc(529) byte local529 = Static74.aClass2_Sub18_Sub1_1.method2345();
				local20 = Static74.aClass2_Sub18_Sub1_1.method2377();
				local32 = local20 & 0x3;
				local24 = local20 >> 2;
				local39 = Static169.anIntArray598[local24];
				local128 = Static74.aClass2_Sub18_Sub1_1.method2379();
				local134 = Static74.aClass2_Sub18_Sub1_1.method2379();
				local210 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local220 = Static83.anInt2156 + (local210 & 0x7);
				local216 = (local210 >> 4 & 0x7) + Static16.anInt525;
				@Pc(578) byte local578 = Static74.aClass2_Sub18_Sub1_1.method2356();
				@Pc(584) byte local584 = Static74.aClass2_Sub18_Sub1_1.method2345();
				local232 = Static74.aClass2_Sub18_Sub1_1.method2379();
				@Pc(592) int local592 = Static74.aClass2_Sub18_Sub1_1.method2395();
				@Pc(596) byte local596 = Static74.aClass2_Sub18_Sub1_1.method2350();
				@Pc(607) Class2_Sub2_Sub1_Sub6_Sub1 local607;
				if (local134 == Static181.anInt4599) {
					local607 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11;
				} else {
					local607 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local134];
				}
				if (local607 != null) {
					@Pc(617) Class2_Sub2_Sub5 local617 = Static121.method2129(local232);
					@Pc(621) int[][] local621 = Static122.anIntArrayArrayArray2[Static54.anInt1472];
					@Pc(637) int local637;
					@Pc(634) int local634;
					if (local32 == 1 || local32 == 3) {
						local634 = local617.anInt520;
						local637 = local617.anInt538;
					} else {
						local637 = local617.anInt520;
						local634 = local617.anInt538;
					}
					@Pc(651) int local651 = (local637 >> 1) + local216;
					@Pc(657) int local657 = local220 + (local634 >> 1);
					@Pc(666) int local666 = local220 + (local634 + 1 >> 1);
					@Pc(674) int local674 = (local637 + 1 >> 1) + local216;
					@Pc(682) int local682 = (local637 << 6) + (local216 << 7);
					@Pc(708) int local708 = local621[local674][local666] + local621[local651][local666] + local621[local674][local657] + local621[local651][local657] >> 2;
					@Pc(716) int local716 = (local220 << 7) + (local634 << 6);
					@Pc(726) Class2_Sub2_Sub1_Sub2 local726 = local617.method348(local621, local708, local24, local32, local716, local682);
					if (local726 != null) {
						Static160.method3002(local220, Static54.anInt1472, local128 + 1, local592 + 1, -1, local216, 0, 0, local39);
						local607.anInt4336 = Static143.anInt3513 + local128;
						@Pc(753) byte local753;
						if (local596 < local584) {
							local753 = local584;
							local584 = local596;
							local596 = local753;
						}
						local607.aClass2_Sub2_Sub1_Sub2_1 = local726;
						local607.anInt4343 = local708;
						local607.anInt4332 = local592 + Static143.anInt3513;
						local607.anInt4340 = local216 + local596;
						local607.anInt4341 = local216 * 128 + local637 * 64;
						if (local578 < local529) {
							local753 = local529;
							local529 = local578;
							local578 = local753;
						}
						local607.anInt4333 = local220 + local529;
						local607.anInt4338 = local220 + local578;
						local607.anInt4337 = local220 * 128 + local634 * 64;
						local607.anInt4334 = local584 + local216;
					}
				}
			}
			if (Static75.anInt1978 == 108) {
				local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local24 = Static83.anInt2156 + (local14 & 0x7);
				local20 = (local14 >> 4 & 0x7) + Static16.anInt525;
				local32 = Static74.aClass2_Sub18_Sub1_1.method2353();
				local39 = Static74.aClass2_Sub18_Sub1_1.method2387();
				local128 = Static74.aClass2_Sub18_Sub1_1.method2353();
				if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
					local24 = local24 * 128 + 64;
					local20 = local20 * 128 + 64;
					@Pc(891) Class2_Sub2_Sub1_Sub7 local891 = new Class2_Sub2_Sub1_Sub7(local32, Static54.anInt1472, local20, local24, Static161.method2725(local20, Static54.anInt1472, local24) - local39, local128, Static143.anInt3513);
					Static160.aClass10_120.method448(local891);
				}
			} else {
				if (Static75.anInt1978 == 31) {
					local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
					local20 = (local14 >> 4 & 0x7) + Static16.anInt525;
					local24 = Static83.anInt2156 + (local14 & 0x7);
					local32 = Static74.aClass2_Sub18_Sub1_1.method2353();
					local39 = Static74.aClass2_Sub18_Sub1_1.method2387();
					local128 = local39 >> 4 & 0xF;
					local210 = Static74.aClass2_Sub18_Sub1_1.method2387();
					local134 = local39 & 0x7;
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						local216 = local128 + 1;
						if (local20 - local216 <= Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0] && Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0] <= local216 + local20 && local24 - local216 <= Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0] && local216 + local24 >= Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0] && Static18.anInt617 != 0 && local134 > 0 && Static90.anInt2345 < 50) {
							Static103.anIntArray402[Static90.anInt2345] = local32;
							Static59.anIntArray239[Static90.anInt2345] = local134;
							Static139.anIntArray504[Static90.anInt2345] = local210;
							Static46.aClass76Array1[Static90.anInt2345] = null;
							Static79.anIntArray351[Static90.anInt2345] = local128 + (local24 << 8) + (local20 << 16);
							Static90.anInt2345++;
						}
					}
				}
				if (Static75.anInt1978 == 124) {
					local14 = Static74.aClass2_Sub18_Sub1_1.method2377();
					local20 = (local14 >> 4 & 0x7) + Static16.anInt525;
					local24 = (local14 & 0x7) + Static83.anInt2156;
					local32 = Static74.aClass2_Sub18_Sub1_1.method2387();
					local128 = local32 & 0x3;
					local39 = local32 >> 2;
					local134 = Static169.anIntArray598[local39];
					local210 = Static74.aClass2_Sub18_Sub1_1.method2379();
					if (local20 >= 0 && local24 >= 0 && local20 < 103 && local24 < 103) {
						if (local134 == 0) {
							@Pc(1114) Class4 local1114 = Static172.aClass60_1.method2078(Static54.anInt1472, local20, local24);
							if (local1114 != null) {
								local220 = local1114.anInt164 >> 14 & 0x7FFF;
								if (local39 == 2) {
									local1114.aClass2_Sub2_Sub1_2 = new Class2_Sub2_Sub1_Sub5(local220, 2, local128 + 4, Static54.anInt1472, local20, local24, local210, false, local1114.aClass2_Sub2_Sub1_2);
									local1114.aClass2_Sub2_Sub1_1 = new Class2_Sub2_Sub1_Sub5(local220, 2, local128 + 1 & 0x3, Static54.anInt1472, local20, local24, local210, false, local1114.aClass2_Sub2_Sub1_1);
								} else {
									local1114.aClass2_Sub2_Sub1_2 = new Class2_Sub2_Sub1_Sub5(local220, local39, local128, Static54.anInt1472, local20, local24, local210, false, local1114.aClass2_Sub2_Sub1_2);
								}
							}
						}
						if (local134 == 1) {
							@Pc(1192) Class59 local1192 = Static172.aClass60_1.method2074(Static54.anInt1472, local20, local24);
							if (local1192 != null) {
								local220 = local1192.anInt2799 >> 14 & 0x7FFF;
								if (local39 == 4 || local39 == 5) {
									local1192.aClass2_Sub2_Sub1_6 = new Class2_Sub2_Sub1_Sub5(local220, 4, local128, Static54.anInt1472, local20, local24, local210, false, local1192.aClass2_Sub2_Sub1_6);
								} else if (local39 == 6) {
									local1192.aClass2_Sub2_Sub1_6 = new Class2_Sub2_Sub1_Sub5(local220, 4, local128 + 4, Static54.anInt1472, local20, local24, local210, false, local1192.aClass2_Sub2_Sub1_6);
								} else if (local39 == 7) {
									local1192.aClass2_Sub2_Sub1_6 = new Class2_Sub2_Sub1_Sub5(local220, 4, (local128 + 2 & 0x3) + 4, Static54.anInt1472, local20, local24, local210, false, local1192.aClass2_Sub2_Sub1_6);
								} else if (local39 == 8) {
									local1192.aClass2_Sub2_Sub1_6 = new Class2_Sub2_Sub1_Sub5(local220, 4, local128 + 4, Static54.anInt1472, local20, local24, local210, false, local1192.aClass2_Sub2_Sub1_6);
									local1192.aClass2_Sub2_Sub1_7 = new Class2_Sub2_Sub1_Sub5(local220, 4, (local128 + 2 & 0x3) + 4, Static54.anInt1472, local20, local24, local210, false, local1192.aClass2_Sub2_Sub1_7);
								}
							}
						}
						if (local134 == 2) {
							@Pc(1328) Class63 local1328 = Static172.aClass60_1.method2073(Static54.anInt1472, local20, local24);
							if (local39 == 11) {
								local39 = 10;
							}
							if (local1328 != null) {
								local1328.aClass2_Sub2_Sub1_8 = new Class2_Sub2_Sub1_Sub5(local1328.anInt3037 >> 14 & 0x7FFF, local39, local128, Static54.anInt1472, local20, local24, local210, false, local1328.aClass2_Sub2_Sub1_8);
							}
						}
						if (local134 == 3) {
							@Pc(1366) Class69 local1366 = Static172.aClass60_1.method2049(Static54.anInt1472, local20, local24);
							if (local1366 != null) {
								local1366.aClass2_Sub2_Sub1_9 = new Class2_Sub2_Sub1_Sub5(local1366.anInt3292 >> 14 & 0x7FFF, 22, local128, Static54.anInt1472, local20, local24, local210, false, local1366.aClass2_Sub2_Sub1_9);
							}
						}
					}
				} else if (Static75.anInt1978 == 15) {
					local14 = Static74.aClass2_Sub18_Sub1_1.method2387();
					local20 = Static16.anInt525 + (local14 >> 4 & 0x7);
					local24 = Static83.anInt2156 + (local14 & 0x7);
					local32 = Static74.aClass2_Sub18_Sub1_1.method2363();
					if (local20 >= 0 && local24 >= 0 && local20 < 104 && local24 < 104) {
						@Pc(1437) Class10 local1437 = Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local20][local24];
						if (local1437 != null) {
							for (local58 = (Class2_Sub2_Sub1_Sub4) local1437.method444(); local58 != null; local58 = (Class2_Sub2_Sub1_Sub4) local1437.method451()) {
								if ((local32 & 0x7FFF) == local58.anInt3104) {
									local58.method3004();
									break;
								}
							}
							if (local1437.method444() == null) {
								Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local20][local24] = null;
							}
							Static181.method3022(local20, local24);
						}
					}
				} else if (Static75.anInt1978 == 67) {
					local14 = Static74.aClass2_Sub18_Sub1_1.method2363();
					local20 = Static74.aClass2_Sub18_Sub1_1.method2395();
					local24 = Static74.aClass2_Sub18_Sub1_1.method2379();
					local32 = Static74.aClass2_Sub18_Sub1_1.method2352();
					local128 = (local32 & 0x7) + Static83.anInt2156;
					local39 = (local32 >> 4 & 0x7) + Static16.anInt525;
					if (local39 >= 0 && local128 >= 0 && local39 < 104 && local128 < 104 && Static181.anInt4599 != local24) {
						@Pc(1547) Class2_Sub2_Sub1_Sub4 local1547 = new Class2_Sub2_Sub1_Sub4();
						local1547.anInt3104 = local14;
						local1547.anInt3107 = local20;
						if (Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local39][local128] == null) {
							Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local39][local128] = new Class10();
						}
						Static53.aClass10ArrayArrayArray1[Static54.anInt1472][local39][local128].method448(local1547);
						Static181.method3022(local39, local128);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method518() {
		aLongArray1 = null;
		aLongArray2 = null;
		aClass82_14 = null;
		aClass77_309 = null;
		aClass77_310 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)I")
	public static int method519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(21) int local21 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local21;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[Lclient!qf;IIIIIII)V")
	public static void method520(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class66 local13 = arg0[local7];
			if (local13 != null && (!local13.aBoolean131 || local13.anInt3230 == 0 || local13.aBoolean133 || Static63.method1160(local13) != 0 || local13 == Static158.aClass66_13) && arg3 == local13.anInt3237 && (!local13.aBoolean131 || !Static164.method2754(local13))) {
				@Pc(57) int local57 = local13.anInt3184 + arg2;
				@Pc(62) int local62 = arg4 + local13.anInt3242;
				if (Static34.aClass66_5 == local13) {
					Static137.anInt3307 = local57;
					Static52.anInt1424 = local62;
					Static56.aBoolean77 = true;
				}
				@Pc(81) int local81;
				@Pc(77) int local77;
				@Pc(79) int local79;
				@Pc(83) int local83;
				@Pc(117) int local117;
				if (local13.anInt3230 == 2) {
					local77 = arg7;
					local79 = arg5;
					local81 = arg6;
					local83 = arg1;
				} else {
					@Pc(91) int local91;
					@Pc(93) int local93;
					if (local13.anInt3230 == 9) {
						local91 = local57;
						local93 = local62;
						@Pc(98) int local98 = local13.anInt3227 + local57;
						if (local57 > local98) {
							local91 = local98;
							local98 = local57;
						}
						local117 = local62 + local13.anInt3168;
						if (local62 > local117) {
							local93 = local117;
							local117 = local62;
						}
						local98++;
						local117++;
						local79 = arg5 > local98 ? local98 : arg5;
						local81 = local91 <= arg6 ? arg6 : local91;
						local83 = local117 < arg1 ? local117 : arg1;
						local77 = local93 <= arg7 ? arg7 : local93;
					} else {
						local81 = local57 <= arg6 ? arg6 : local57;
						local77 = arg7 < local62 ? local62 : arg7;
						local91 = local13.anInt3227 + local57;
						local79 = arg5 > local91 ? local91 : arg5;
						local93 = local13.anInt3168 + local62;
						local83 = arg1 <= local93 ? arg1 : local93;
					}
				}
				if (!local13.aBoolean131 || local81 < local79 && local77 < local83) {
					if (local13.anInt3224 == 1337) {
						Static57.method2994(local13);
					} else if (local13.anInt3224 == 1338) {
						Static78.method1460(local62, local57);
					} else {
						if (local13.anInt3230 == 0) {
							if (!local13.aBoolean131 && Static164.method2754(local13) && local13 != Static112.aClass66_9) {
								continue;
							}
							method520(arg0, local83, local57 - local13.anInt3218, local13.anInt3229, local62 - local13.anInt3189, local79, local81, local77);
							if (local13.aClass66Array2 != null) {
								method520(local13.aClass66Array2, local83, local57 - local13.anInt3218, local13.anInt3229, local62 - local13.anInt3189, local79, local81, local77);
							}
							@Pc(317) Class2_Sub10 local317 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local13.anInt3229);
							if (local317 != null) {
								Static108.method1924(local77, local57, local83, local317.anInt1896, local81, local62, local79);
							}
						}
						if (local13.aBoolean131) {
							@Pc(358) boolean local358;
							if (Static20.anInt631 >= local81 && Static132.anInt3185 >= local77 && Static20.anInt631 < local79 && local83 > Static132.anInt3185) {
								local358 = true;
							} else {
								local358 = false;
							}
							@Pc(364) boolean local364 = false;
							if (Static31.anInt887 == 1 && local358) {
								local364 = true;
							}
							@Pc(375) boolean local375 = false;
							if (Static50.anInt1384 == 1 && Static156.anInt3884 >= local81 && local77 <= Static38.anInt1113 && local79 > Static156.anInt3884 && local83 > Static38.anInt1113) {
								local375 = true;
							}
							if (local375) {
								Static114.method2018(Static38.anInt1113 - local62, Static156.anInt3884 + -local57, local13);
							}
							if (Static34.aClass66_5 != null && Static34.aClass66_5 != local13 && local358 && Static79.method1465(Static63.method1160(local13))) {
								Static109.aClass66_4 = local13;
							}
							if (local13 == Static158.aClass66_13) {
								Static50.aBoolean70 = true;
								Static57.anInt4549 = local62;
								Static62.anInt1660 = local57;
							}
							if (local13.aBoolean133) {
								@Pc(456) Class2_Sub21 local456;
								if (local358 && Static100.anInt800 != 0 && local13.anObjectArray25 != null) {
									local456 = new Class2_Sub21();
									local456.anObjectArray29 = local13.anObjectArray25;
									local456.anInt4461 = Static100.anInt800;
									local456.aClass66_14 = local13;
									Static167.aClass10_106.method448(local456);
								}
								if (Static34.aClass66_5 != null || Static149.aClass66_12 != null || Static166.aBoolean181) {
									local364 = false;
									local358 = false;
									local375 = false;
								}
								if (!local13.aBoolean130 && local375) {
									local13.aBoolean130 = true;
									if (local13.anObjectArray21 != null) {
										local456 = new Class2_Sub21();
										local456.anInt4466 = Static156.anInt3884 - local57;
										local456.anObjectArray29 = local13.anObjectArray21;
										local456.aClass66_14 = local13;
										local456.anInt4461 = Static38.anInt1113 - local62;
										Static167.aClass10_106.method448(local456);
									}
								}
								if (local13.aBoolean130 && local364 && local13.anObjectArray19 != null) {
									local456 = new Class2_Sub21();
									local456.anObjectArray29 = local13.anObjectArray19;
									local456.aClass66_14 = local13;
									local456.anInt4461 = Static132.anInt3185 - local62;
									local456.anInt4466 = Static20.anInt631 - local57;
									Static167.aClass10_106.method448(local456);
								}
								if (local13.aBoolean130 && !local364) {
									local13.aBoolean130 = false;
									if (local13.anObjectArray27 != null) {
										local456 = new Class2_Sub21();
										local456.aClass66_14 = local13;
										local456.anInt4461 = Static132.anInt3185 - local62;
										local456.anInt4466 = Static20.anInt631 - local57;
										local456.anObjectArray29 = local13.anObjectArray27;
										Static174.aClass10_114.method448(local456);
									}
								}
								if (local364 && local13.anObjectArray18 != null) {
									local456 = new Class2_Sub21();
									local456.anInt4461 = Static132.anInt3185 - local62;
									local456.aClass66_14 = local13;
									local456.anInt4466 = Static20.anInt631 - local57;
									local456.anObjectArray29 = local13.anObjectArray18;
									Static167.aClass10_106.method448(local456);
								}
								if (!local13.aBoolean132 && local358) {
									local13.aBoolean132 = true;
									if (local13.anObjectArray5 != null) {
										local456 = new Class2_Sub21();
										local456.aClass66_14 = local13;
										local456.anInt4461 = Static132.anInt3185 - local62;
										local456.anInt4466 = Static20.anInt631 - local57;
										local456.anObjectArray29 = local13.anObjectArray5;
										Static167.aClass10_106.method448(local456);
									}
								}
								if (local13.aBoolean132 && local358 && local13.anObjectArray26 != null) {
									local456 = new Class2_Sub21();
									local456.anInt4461 = Static132.anInt3185 - local62;
									local456.aClass66_14 = local13;
									local456.anObjectArray29 = local13.anObjectArray26;
									local456.anInt4466 = Static20.anInt631 - local57;
									Static167.aClass10_106.method448(local456);
								}
								if (local13.aBoolean132 && !local358) {
									local13.aBoolean132 = false;
									if (local13.anObjectArray7 != null) {
										local456 = new Class2_Sub21();
										local456.aClass66_14 = local13;
										local456.anObjectArray29 = local13.anObjectArray7;
										local456.anInt4461 = Static132.anInt3185 - local62;
										local456.anInt4466 = Static20.anInt631 - local57;
										Static174.aClass10_114.method448(local456);
									}
								}
								if (local13.anObjectArray4 != null) {
									local456 = new Class2_Sub21();
									local456.aClass66_14 = local13;
									local456.anObjectArray29 = local13.anObjectArray4;
									Static76.aClass10_58.method448(local456);
								}
								@Pc(799) int local799;
								@Pc(801) int local801;
								@Pc(813) Class2_Sub21 local813;
								if (local13.anObjectArray3 != null && Static103.anInt2518 > local13.anInt3219) {
									if (local13.anIntArray473 == null || Static103.anInt2518 - local13.anInt3219 > 32) {
										local456 = new Class2_Sub21();
										local456.aClass66_14 = local13;
										local456.anObjectArray29 = local13.anObjectArray3;
										Static167.aClass10_106.method448(local456);
									} else {
										label374: for (local117 = local13.anInt3219; local117 < Static103.anInt2518; local117++) {
											local799 = Static61.anIntArray256[local117 & 0x1F];
											for (local801 = 0; local801 < local13.anIntArray473.length; local801++) {
												if (local13.anIntArray473[local801] == local799) {
													local813 = new Class2_Sub21();
													local813.aClass66_14 = local13;
													local813.anObjectArray29 = local13.anObjectArray3;
													Static167.aClass10_106.method448(local813);
													break label374;
												}
											}
										}
									}
									local13.anInt3219 = Static103.anInt2518;
								}
								if (local13.anObjectArray9 != null && local13.anInt3173 < Static166.anInt4383) {
									if (local13.anIntArray475 == null || Static166.anInt4383 - local13.anInt3173 > 32) {
										local456 = new Class2_Sub21();
										local456.anObjectArray29 = local13.anObjectArray9;
										local456.aClass66_14 = local13;
										Static167.aClass10_106.method448(local456);
									} else {
										label354: for (local117 = local13.anInt3173; local117 < Static166.anInt4383; local117++) {
											local799 = Static120.anIntArray160[local117 & 0x1F];
											for (local801 = 0; local801 < local13.anIntArray475.length; local801++) {
												if (local13.anIntArray475[local801] == local799) {
													local813 = new Class2_Sub21();
													local813.anObjectArray29 = local13.anObjectArray9;
													local813.aClass66_14 = local13;
													Static167.aClass10_106.method448(local813);
													break label354;
												}
											}
										}
									}
									local13.anInt3173 = Static166.anInt4383;
								}
								if (local13.anObjectArray13 != null && Static59.anInt1574 > local13.anInt3171) {
									if (local13.anIntArray469 == null || Static59.anInt1574 - local13.anInt3171 > 32) {
										local456 = new Class2_Sub21();
										local456.aClass66_14 = local13;
										local456.anObjectArray29 = local13.anObjectArray13;
										Static167.aClass10_106.method448(local456);
									} else {
										label334: for (local117 = local13.anInt3171; local117 < Static59.anInt1574; local117++) {
											local799 = Static2.anIntArray14[local117 & 0x1F];
											for (local801 = 0; local801 < local13.anIntArray469.length; local801++) {
												if (local13.anIntArray469[local801] == local799) {
													local813 = new Class2_Sub21();
													local813.anObjectArray29 = local13.anObjectArray13;
													local813.aClass66_14 = local13;
													Static167.aClass10_106.method448(local813);
													break label334;
												}
											}
										}
									}
									local13.anInt3171 = Static59.anInt1574;
								}
								if (Static8.anInt232 > local13.anInt3201 && local13.anObjectArray20 != null) {
									local456 = new Class2_Sub21();
									local456.anObjectArray29 = local13.anObjectArray20;
									local456.aClass66_14 = local13;
									Static167.aClass10_106.method448(local456);
								}
								if (Static8.anInt229 > local13.anInt3201 && local13.anObjectArray23 != null) {
									local456 = new Class2_Sub21();
									local456.aClass66_14 = local13;
									local456.anObjectArray29 = local13.anObjectArray23;
									Static167.aClass10_106.method448(local456);
								}
								if (Static11.anInt308 > local13.anInt3201 && local13.anObjectArray17 != null) {
									local456 = new Class2_Sub21();
									local456.anObjectArray29 = local13.anObjectArray17;
									local456.aClass66_14 = local13;
									Static167.aClass10_106.method448(local456);
								}
								if (local13.anInt3201 < Static126.anInt2297 && local13.anObjectArray16 != null) {
									local456 = new Class2_Sub21();
									local456.anObjectArray29 = local13.anObjectArray16;
									local456.aClass66_14 = local13;
									Static167.aClass10_106.method448(local456);
								}
								if (local13.anInt3201 < Static62.anInt1664 && local13.anObjectArray14 != null) {
									local456 = new Class2_Sub21();
									local456.aClass66_14 = local13;
									local456.anObjectArray29 = local13.anObjectArray14;
									Static167.aClass10_106.method448(local456);
								}
								local13.anInt3201 = Static52.anInt1417;
								if (local13.anObjectArray10 != null) {
									for (local117 = 0; local117 < Static31.anInt885; local117++) {
										@Pc(1165) Class2_Sub21 local1165 = new Class2_Sub21();
										local1165.aClass66_14 = local13;
										local1165.anInt4463 = Static48.anIntArray211[local117];
										local1165.anInt4459 = Static94.anIntArray388[local117];
										local1165.anObjectArray29 = local13.anObjectArray10;
										Static167.aClass10_106.method448(local1165);
									}
								}
							}
						}
						if (!local13.aBoolean131) {
							if (Static34.aClass66_5 != null || Static149.aClass66_12 != null || Static166.aBoolean181) {
								return;
							}
							if ((local13.anInt3194 >= 0 || local13.anInt3214 != 0) && local81 <= Static20.anInt631 && Static132.anInt3185 >= local77 && local79 > Static20.anInt631 && local83 > Static132.anInt3185) {
								if (local13.anInt3194 >= 0) {
									Static112.aClass66_9 = arg0[local13.anInt3194];
								} else {
									Static112.aClass66_9 = local13;
								}
							}
							if (local13.anInt3230 == 8 && local81 <= Static20.anInt631 && local77 <= Static132.anInt3185 && Static20.anInt631 < local79 && local83 > Static132.anInt3185) {
								Static9.aClass66_1 = local13;
							}
							if (local13.anInt3168 < local13.anInt3207) {
								Static37.method744(local13, local13.anInt3227 + local57, Static20.anInt631, local62, local13.anInt3207, Static132.anInt3185, local13.anInt3168);
							}
						}
					}
				}
			}
		}
	}
}
