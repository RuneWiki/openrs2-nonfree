import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "[I")
	public static int[] anIntArray484;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1348 = Static63.method1251("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1349 = Static63.method1251("Please remove ");

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	public static int anInt3088 = 0;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	public static int anInt3089 = -1;

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1350 = Static63.method1251("Versteckt");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1351 = aClass45_1349;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1352 = Static63.method1251("Connecting to update server");

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array11 = new Class5_Sub2_Sub6_Sub3[1000];

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	public static int anInt3094 = 0;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1353 = aClass45_1352;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1354 = aClass45_1349;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1355 = Static63.method1251("rot:");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method2128(@OriginalArg(0) Class5_Sub2_Sub4_Sub3 arg0) {
		arg0.aBoolean109 = false;
		@Pc(13) Class5_Sub2_Sub9 local13;
		if (arg0.anInt2419 != -1) {
			local13 = Static63.method1252(arg0.anInt2419);
			if (local13 == null || local13.anIntArray249 == null) {
				arg0.anInt2419 = -1;
			} else {
				arg0.anInt2388++;
				if (arg0.anInt2425 < local13.anIntArray249.length && arg0.anInt2388 > local13.anIntArray252[arg0.anInt2425]) {
					arg0.anInt2388 = 1;
					arg0.anInt2425++;
					Static114.method2083(arg0.anInt2428, arg0.anInt2425, local13, arg0.anInt2417);
				}
				if (arg0.anInt2425 >= local13.anIntArray249.length) {
					arg0.anInt2425 = 0;
					arg0.anInt2388 = 0;
					Static114.method2083(arg0.anInt2428, arg0.anInt2425, local13, arg0.anInt2417);
				}
			}
		}
		if (arg0.anInt2434 != -1 && arg0.anInt2386 <= Static3.anInt94) {
			if (arg0.anInt2414 < 0) {
				arg0.anInt2414 = 0;
			}
			@Pc(109) int local109 = Static91.method1710(arg0.anInt2434).anInt2869;
			if (local109 == -1) {
				arg0.anInt2434 = -1;
			} else {
				@Pc(122) Class5_Sub2_Sub9 local122 = Static63.method1252(local109);
				if (local122 == null || local122.anIntArray249 == null) {
					arg0.anInt2434 = -1;
				} else {
					arg0.anInt2439++;
					if (arg0.anInt2414 < local122.anIntArray249.length && arg0.anInt2439 > local122.anIntArray252[arg0.anInt2414]) {
						arg0.anInt2414++;
						arg0.anInt2439 = 1;
						Static114.method2083(arg0.anInt2428, arg0.anInt2414, local122, arg0.anInt2417);
					}
					if (arg0.anInt2414 >= local122.anIntArray249.length && (arg0.anInt2414 < 0 || arg0.anInt2414 >= local122.anIntArray249.length)) {
						arg0.anInt2434 = -1;
					}
				}
			}
		}
		if (arg0.anInt2436 != -1 && arg0.anInt2387 <= 1) {
			local13 = Static63.method1252(arg0.anInt2436);
			if (local13.anInt1658 == 1 && arg0.anInt2405 > 0 && arg0.anInt2441 <= Static3.anInt94 && arg0.anInt2401 < Static3.anInt94) {
				arg0.anInt2387 = 1;
				return;
			}
		}
		if (arg0.anInt2436 != -1 && arg0.anInt2387 == 0) {
			local13 = Static63.method1252(arg0.anInt2436);
			if (local13 == null || local13.anIntArray249 == null) {
				arg0.anInt2436 = -1;
			} else {
				arg0.anInt2390++;
				if (local13.anIntArray249.length > arg0.anInt2420 && local13.anIntArray252[arg0.anInt2420] < arg0.anInt2390) {
					arg0.anInt2390 = 1;
					arg0.anInt2420++;
					Static114.method2083(arg0.anInt2428, arg0.anInt2420, local13, arg0.anInt2417);
				}
				if (local13.anIntArray249.length <= arg0.anInt2420) {
					arg0.anInt2420 -= local13.anInt1672;
					arg0.anInt2424++;
					if (arg0.anInt2424 >= local13.anInt1668) {
						arg0.anInt2436 = -1;
					} else if (arg0.anInt2420 >= 0 && local13.anIntArray249.length > arg0.anInt2420) {
						Static114.method2083(arg0.anInt2428, arg0.anInt2420, local13, arg0.anInt2417);
					} else {
						arg0.anInt2436 = -1;
					}
				}
				arg0.aBoolean109 = local13.aBoolean82;
			}
		}
		if (arg0.anInt2387 > 0) {
			arg0.anInt2387--;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII)I")
	public static int method2129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			arg1--;
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method2130() {
		while (true) {
			if (Static70.aClass5_Sub9_Sub1_3.method1459(Static69.anInt1989) >= 11) {
				@Pc(18) int local18 = Static70.aClass5_Sub9_Sub1_3.method1456(11);
				if (local18 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local18] == null) {
						Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local18] = new Class5_Sub2_Sub4_Sub3_Sub1();
						local23 = true;
						if (Static55.aClass5_Sub9Array1[local18] != null) {
							Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local18].method1102(Static55.aClass5_Sub9Array1[local18]);
						}
					}
					Static64.anIntArray283[Static56.anInt1694++] = local18;
					@Pc(59) Class5_Sub2_Sub4_Sub3_Sub1 local59 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local18];
					local59.anInt2406 = Static3.anInt94;
					@Pc(69) int local69 = Static3.anIntArray14[Static70.aClass5_Sub9_Sub1_3.method1456(3)];
					if (local23) {
						local59.anInt2407 = local69;
					}
					@Pc(79) int local79 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
					@Pc(84) int local84 = Static70.aClass5_Sub9_Sub1_3.method1456(5);
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(95) int local95 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
					if (local95 == 1) {
						Static104.anIntArray425[Static79.anInt2240++] = local18;
					}
					@Pc(111) int local111 = Static70.aClass5_Sub9_Sub1_3.method1456(5);
					if (local111 > 15) {
						local111 -= 32;
					}
					local59.method1622(local84 + Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], local111 + Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], local79 == 1);
					continue;
				}
			}
			Static70.aClass5_Sub9_Sub1_3.method1464();
			return;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
	public static int method2131() {
		@Pc(7) int local7 = 3;
		if (Static38.anInt1089 < 310) {
			@Pc(14) int local14 = Static46.anInt1334 >> 7;
			@Pc(18) int local18 = Static25.anInt791 >> 7;
			if ((Static48.aByteArrayArrayArray3[Static8.anInt262][local18][local14] & 0x4) != 0) {
				local7 = Static8.anInt262;
			}
			@Pc(38) int local38 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7;
			@Pc(43) int local43 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7;
			@Pc(55) int local55;
			if (local18 >= local38) {
				local55 = local18 - local38;
			} else {
				local55 = local38 - local18;
			}
			@Pc(70) int local70;
			if (local43 <= local14) {
				local70 = local14 - local43;
			} else {
				local70 = local43 - local14;
			}
			@Pc(86) int local86;
			@Pc(88) int local88;
			if (local70 >= local55) {
				local86 = local55 * 65536 / local70;
				local88 = 32768;
				while (local14 != local43) {
					if (local14 < local43) {
						local14++;
					} else if (local14 > local43) {
						local14--;
					}
					local88 += local86;
					if ((Static48.aByteArrayArrayArray3[Static8.anInt262][local18][local14] & 0x4) != 0) {
						local7 = Static8.anInt262;
					}
					if (local88 >= 65536) {
						if (local38 > local18) {
							local18++;
						} else if (local18 > local38) {
							local18--;
						}
						local88 -= 65536;
						if ((Static48.aByteArrayArrayArray3[Static8.anInt262][local18][local14] & 0x4) != 0) {
							local7 = Static8.anInt262;
						}
					}
				}
			} else {
				local86 = local70 * 65536 / local55;
				local88 = 32768;
				while (local38 != local18) {
					if (local18 < local38) {
						local18++;
					} else if (local38 < local18) {
						local18--;
					}
					if ((Static48.aByteArrayArrayArray3[Static8.anInt262][local18][local14] & 0x4) != 0) {
						local7 = Static8.anInt262;
					}
					local88 += local86;
					if (local88 >= 65536) {
						if (local14 < local43) {
							local14++;
						} else if (local43 < local14) {
							local14--;
						}
						local88 -= 65536;
						if ((Static48.aByteArrayArrayArray3[Static8.anInt262][local18][local14] & 0x4) != 0) {
							local7 = Static8.anInt262;
						}
					}
				}
			}
		}
		if ((Static48.aByteArrayArrayArray3[Static8.anInt262][Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7][Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7] & 0x4) != 0) {
			local7 = Static8.anInt262;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public static boolean method2132(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2133() {
		aClass45_1355 = null;
		aClass45_1352 = null;
		aClass45_1349 = null;
		anIntArray484 = null;
		aClass45_1353 = null;
		aClass45_1350 = null;
		aClass45_1354 = null;
		aClass45_1351 = null;
		aClass45_1348 = null;
		aClass5_Sub2_Sub6_Sub3Array11 = null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public static void method2134() {
		Static11.aClass67_3.method1819();
		Static120.aClass67_26.method1819();
		Static23.aClass67_7.method1819();
		Static38.aClass67_10.method1819();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!j;ZII)V")
	public static void method2135(@OriginalArg(0) Class5_Sub2_Sub4_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		if ((arg1 & 0x400) != 0) {
			arg0.anInt2434 = Static70.aClass5_Sub9_Sub1_3.method1435();
			local18 = Static70.aClass5_Sub9_Sub1_3.method1427();
			arg0.anInt2414 = 0;
			if (arg0.anInt2434 == 65535) {
				arg0.anInt2434 = -1;
			}
			arg0.anInt2386 = Static3.anInt94 + (local18 & 0xFFFF);
			if (arg0.anInt2386 > Static3.anInt94) {
				arg0.anInt2414 = -1;
			}
			arg0.anInt2439 = 0;
			arg0.anInt2432 = local18 >> 16;
		}
		@Pc(67) int local67;
		if ((arg1 & 0x10) != 0) {
			local18 = Static70.aClass5_Sub9_Sub1_3.method1435();
			local67 = Static70.aClass5_Sub9_Sub1_3.method1408();
			@Pc(71) int local71 = Static70.aClass5_Sub9_Sub1_3.method1400();
			@Pc(74) int local74 = Static70.aClass5_Sub9_Sub1_3.anInt2140;
			if (arg0.aClass45_629 != null && arg0.aClass32_2 != null) {
				@Pc(85) long local85 = arg0.aClass45_629.method1299();
				@Pc(87) boolean local87 = false;
				if (local67 <= 1) {
					for (@Pc(92) int local92 = 0; local92 < Static69.anInt1993; local92++) {
						if (local85 == Static56.aLongArray3[local92]) {
							local87 = true;
							break;
						}
					}
				}
				if (!local87 && Static55.anInt1659 == 0) {
					Static68.aClass5_Sub9_3.anInt2140 = 0;
					Static70.aClass5_Sub9_Sub1_3.method1433(Static68.aClass5_Sub9_3.aByteArray28, local71);
					Static68.aClass5_Sub9_3.anInt2140 = 0;
					@Pc(131) Class45 local131 = Static96.method1800(Static68.aClass5_Sub9_3).method1310();
					arg0.aClass45_1014 = local131.method1297();
					arg0.anInt2399 = local18 & 0xFF;
					arg0.anInt2395 = 150;
					arg0.anInt2396 = local18 >> 8;
					if (local67 == 2 || local67 == 3) {
						Static7.method138(local131, Static39.method1443(new Class45[] { Static19.aClass45_285, arg0.aClass45_629 }), 1);
					} else if (local67 == 1) {
						Static7.method138(local131, Static39.method1443(new Class45[] { Static60.aClass45_720, arg0.aClass45_629 }), 1);
					} else {
						Static7.method138(local131, arg0.aClass45_629, 2);
					}
				}
			}
			Static70.aClass5_Sub9_Sub1_3.anInt2140 = local74 + local71;
		}
		if ((arg1 & 0x20) != 0) {
			arg0.anInt2384 = Static70.aClass5_Sub9_Sub1_3.method1435();
			arg0.anInt2430 = Static70.aClass5_Sub9_Sub1_3.method1418();
		}
		if ((arg1 & 0x2) != 0) {
			local18 = Static70.aClass5_Sub9_Sub1_3.method1401();
			local67 = Static70.aClass5_Sub9_Sub1_3.method1408();
			arg0.method1621(local67, Static3.anInt94, local18);
			arg0.anInt2402 = Static3.anInt94 + 300;
			arg0.anInt2408 = Static70.aClass5_Sub9_Sub1_3.method1401();
			arg0.anInt2418 = Static70.aClass5_Sub9_Sub1_3.method1401();
		}
		if ((arg1 & 0x80) != 0) {
			local18 = Static70.aClass5_Sub9_Sub1_3.method1418();
			if (local18 == 65535) {
				local18 = -1;
			}
			local67 = Static70.aClass5_Sub9_Sub1_3.method1408();
			Static71.method1385(local67, arg0, local18);
		}
		if ((arg1 & 0x200) != 0) {
			local18 = Static70.aClass5_Sub9_Sub1_3.method1446();
			local67 = Static70.aClass5_Sub9_Sub1_3.method1446();
			arg0.method1621(local67, Static3.anInt94, local18);
			arg0.anInt2402 = Static3.anInt94 + 300;
			arg0.anInt2408 = Static70.aClass5_Sub9_Sub1_3.method1400();
			arg0.anInt2418 = Static70.aClass5_Sub9_Sub1_3.method1400();
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt2427 = Static70.aClass5_Sub9_Sub1_3.method1446();
			arg0.anInt2429 = Static70.aClass5_Sub9_Sub1_3.method1408();
			arg0.anInt2404 = Static70.aClass5_Sub9_Sub1_3.method1400();
			arg0.anInt2392 = Static70.aClass5_Sub9_Sub1_3.method1400();
			arg0.anInt2441 = Static70.aClass5_Sub9_Sub1_3.method1444() + Static3.anInt94;
			arg0.anInt2401 = Static70.aClass5_Sub9_Sub1_3.method1418() + Static3.anInt94;
			arg0.anInt2383 = Static70.aClass5_Sub9_Sub1_3.method1401();
			arg0.anInt2405 = 0;
			arg0.anInt2433 = 1;
		}
		if ((arg1 & 0x1) != 0) {
			local18 = Static70.aClass5_Sub9_Sub1_3.method1446();
			@Pc(387) byte[] local387 = new byte[local18];
			@Pc(392) Class5_Sub9 local392 = new Class5_Sub9(local387);
			Static70.aClass5_Sub9_Sub1_3.method1419(local387, local18);
			Static55.aClass5_Sub9Array1[arg2] = local392;
			arg0.method1102(local392);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt2411 = Static70.aClass5_Sub9_Sub1_3.method1452();
			if (arg0.anInt2411 == 65535) {
				arg0.anInt2411 = -1;
			}
		}
		if ((arg1 & 0x40) == 0) {
			return;
		}
		arg0.aClass45_1014 = Static70.aClass5_Sub9_Sub1_3.method1448();
		if (arg0.aClass45_1014.method1324(0) == 126) {
			arg0.aClass45_1014 = arg0.aClass45_1014.method1296(1);
			Static7.method138(arg0.aClass45_1014, arg0.aClass45_629, 2);
		} else if (arg0 == Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1) {
			Static7.method138(arg0.aClass45_1014, arg0.aClass45_629, 2);
		}
		arg0.anInt2396 = 0;
		arg0.anInt2399 = 0;
		arg0.anInt2395 = 150;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[Lclient!mb;)[Lclient!mb;")
	public static Class45[] method2136(@OriginalArg(1) Class45[] arg0) {
		@Pc(2) Class45[] local2 = new Class45[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local2[local8] = Static39.method1443(new Class45[] { Static76.method1476(local8), Static52.aClass45_1367 });
			if (arg0 != null && arg0[local8] != null) {
				local2[local8] = Static39.method1443(new Class45[] { local2[local8], arg0[local8] });
			}
		}
		return local2;
	}
}
