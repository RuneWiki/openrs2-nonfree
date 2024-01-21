import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
	public static int anInt2678;

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_15;

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lclient!w;")
	public static Class15 aClass15_39;

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "Lclient!be;")
	public static Class11_Sub1 aClass11_Sub1_16;

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
	public static int anInt2693;

	@OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lclient!va;")
	private static Class61 aClass61_1085 = Static88.method1421("Connection lost");

	@OriginalMember(owner = "client!wc", name = "sb", descriptor = "Z")
	public static boolean aBoolean121 = false;

	@OriginalMember(owner = "client!wc", name = "xb", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!wc", name = "Db", descriptor = "Lclient!va;")
	public static Class61 aClass61_1086 = aClass61_1085;

	@OriginalMember(owner = "client!wc", name = "Eb", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array15 = new Class61[200];

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
	public static void method1666() {
		aClass11_Sub1_16 = null;
		aClass61_1085 = null;
		aClass15_39 = null;
		aClass61Array15 = null;
		aClass11_Sub1_15 = null;
		aClass61_1086 = null;
		anIntArray342 = null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V")
	public static void method1667() {
		@Pc(9) int local9 = anInt2678 * 128 + 64;
		@Pc(15) int local15 = Static23.anInt762 * 128 + 64;
		@Pc(24) int local24 = Static39.method230(local9, Static101.anInt2582, local15) - Static18.anInt612;
		if (Static12.anInt349 < local9) {
			Static12.anInt349 += Static21.anInt699 + (local9 - Static12.anInt349) * Static57.anInt1512 / 1000;
			if (Static12.anInt349 > local9) {
				Static12.anInt349 = local9;
			}
		}
		if (local15 > Static30.anInt918) {
			Static30.anInt918 += Static21.anInt699 + (local15 - Static30.anInt918) * Static57.anInt1512 / 1000;
			if (Static30.anInt918 > local15) {
				Static30.anInt918 = local15;
			}
		}
		if (local24 > Static96.anInt2449) {
			Static96.anInt2449 += Static21.anInt699 + Static57.anInt1512 * (local24 - Static96.anInt2449) / 1000;
			if (local24 < Static96.anInt2449) {
				Static96.anInt2449 = local24;
			}
		}
		if (local24 < Static96.anInt2449) {
			Static96.anInt2449 -= Static21.anInt699 + Static57.anInt1512 * (Static96.anInt2449 - local24) / 1000;
			if (Static96.anInt2449 < local24) {
				Static96.anInt2449 = local24;
			}
		}
		if (Static30.anInt918 > local15) {
			Static30.anInt918 -= Static21.anInt699 + (Static30.anInt918 - local15) * Static57.anInt1512 / 1000;
			if (Static30.anInt918 < local15) {
				Static30.anInt918 = local15;
			}
		}
		if (local9 < Static12.anInt349) {
			Static12.anInt349 -= Static57.anInt1512 * (Static12.anInt349 - local9) / 1000 + Static21.anInt699;
			if (Static12.anInt349 < local9) {
				Static12.anInt349 = local9;
			}
		}
		local9 = Static67.anInt1769 * 128 + 64;
		local15 = Static50.anInt1399 * 128 + 64;
		local24 = Static39.method230(local9, Static101.anInt2582, local15) - Static74.anInt1866;
		@Pc(200) int local200 = local9 - Static12.anInt349;
		@Pc(204) int local204 = local15 - Static30.anInt918;
		@Pc(209) int local209 = local24 - Static96.anInt2449;
		@Pc(220) int local220 = (int) Math.sqrt((double) (local200 * local200 + local204 * local204));
		@Pc(231) int local231 = (int) (Math.atan2((double) local209, (double) local220) * 325.949D) & 0x7FF;
		if (local231 < 128) {
			local231 = 128;
		}
		if (local231 > 383) {
			local231 = 383;
		}
		@Pc(254) int local254 = (int) (-325.949D * Math.atan2((double) local200, (double) local204)) & 0x7FF;
		@Pc(259) int local259 = local254 - Static40.anInt1090;
		if (Static75.anInt2015 < local231) {
			Static75.anInt2015 += Static42.anInt2377 * (local231 - Static75.anInt2015) / 1000 + Static82.anInt2204;
			if (Static75.anInt2015 > local231) {
				Static75.anInt2015 = local231;
			}
		}
		if (Static75.anInt2015 > local231) {
			Static75.anInt2015 -= Static82.anInt2204 + Static42.anInt2377 * (Static75.anInt2015 - local231) / 1000;
			if (Static75.anInt2015 < local231) {
				Static75.anInt2015 = local231;
			}
		}
		if (local259 > 1024) {
			local259 -= 2048;
		}
		if (local259 < -1024) {
			local259 += 2048;
		}
		if (local259 > 0) {
			Static40.anInt1090 += Static42.anInt2377 * local259 / 1000 + Static82.anInt2204;
			Static40.anInt1090 &= 0x7FF;
		}
		if (local259 < 0) {
			Static40.anInt1090 -= Static82.anInt2204 + Static42.anInt2377 * -local259 / 1000;
			Static40.anInt1090 &= 0x7FF;
		}
		@Pc(348) int local348 = local254 - Static40.anInt1090;
		if (local348 > 1024) {
			local348 -= 2048;
		}
		if (local348 < -1024) {
			local348 += 2048;
		}
		if (local348 < 0 && local259 > 0 || local348 > 0 && local259 < 0) {
			Static40.anInt1090 = local254;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[BIZI[Lclient!cb;ILclient!rc;I)V")
	public static void method1668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class12[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class54 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = -1;
		@Pc(19) Class10_Sub10 local19 = new Class10_Sub10(arg3);
		while (true) {
			@Pc(23) int local23 = local19.method1136();
			if (local23 == 0) {
				return;
			}
			local7 += local23;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local19.method1136();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(50) int local50 = local34 & 0x3F;
				@Pc(56) int local56 = local34 >> 6 & 0x3F;
				@Pc(60) int local60 = local34 >> 12;
				@Pc(64) int local64 = local19.method1111();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local60 == arg0 && arg7 <= local56 && arg7 + 8 > local56 && arg1 <= local50 && local50 < arg1 + 8) {
					@Pc(107) Class10_Sub1_Sub10 local107 = Static18.method405(local7);
					@Pc(125) int local125 = arg9 + Static33.method584(local107.anInt1369, local50 & 0x7, arg4, local72, local107.anInt1378, local56 & 0x7);
					@Pc(142) int local142 = Static42.method1470(arg4, local50 & 0x7, local72, local56 & 0x7, local107.anInt1378, local107.anInt1369) + arg5;
					if (local125 > 0 && local142 > 0 && local125 < 103 && local142 < 103) {
						@Pc(159) int local159 = arg2;
						@Pc(161) Class12 local161 = null;
						if ((Static21.aByteArrayArrayArray4[1][local125][local142] & 0x2) == 2) {
							local159 = arg2 - 1;
						}
						if (local159 >= 0) {
							local161 = arg6[local159];
						}
						Static56.method823(local125, local161, local72 + arg4 & 0x3, local7, arg2, arg8, local68, local142);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLclient!be;IBII)V")
	public static void method1669(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) ((arg4 << 2119418128) + arg5);
		@Pc(16) Class10_Sub1_Sub9 local16 = (Class10_Sub1_Sub9) Static19.aClass50_3.method1250(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class10_Sub1_Sub9) Static48.aClass50_7.method1250(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class10_Sub1_Sub9) Static18.aClass50_2.method1250(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class10_Sub1_Sub9) Static9.aClass50_1.method1250(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class10_Sub1_Sub9();
			local16.anInt1336 = arg2;
			local16.aClass11_Sub1_8 = arg1;
			local16.aByte2 = arg3;
			if (arg0) {
				Static19.aClass50_3.method1252(local16, local10);
				Static81.anInt2196++;
			} else {
				Static94.aClass40_2.method900(local16);
				Static18.aClass50_2.method1252(local16, local10);
				Static16.anInt524++;
			}
		} else if (arg0) {
			local16.method1655();
			Static19.aClass50_3.method1252(local16, local10);
			Static16.anInt524--;
			Static81.anInt2196++;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BBII)Z")
	public static boolean method1670(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(17) int local17 = -1;
		@Pc(22) Class10_Sub10 local22 = new Class10_Sub10(arg0);
		label65: while (true) {
			@Pc(26) int local26 = local22.method1136();
			if (local26 == 0) {
				return local15;
			}
			@Pc(30) int local30 = 0;
			local17 += local26;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(96) Class10_Sub1_Sub10 local96;
				do {
					@Pc(73) int local73;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local22.method1136();
										if (local42 == 0) {
											continue label65;
										}
										local22.method1111();
									}
									local42 = local22.method1136();
									if (local42 == 0) {
										continue label65;
									}
									local30 += local42 - 1;
									@Pc(57) int local57 = local30 & 0x3F;
									local63 = local22.method1111() >> 2;
									@Pc(69) int local69 = local30 >> 6 & 0x3F;
									local73 = arg2 + local69;
									local77 = local57 + arg1;
								} while (local73 <= 0);
							} while (local77 <= 0);
						} while (local73 >= 103);
					} while (local77 >= 103);
					local96 = Static18.method405(local17);
				} while (local63 == 22 && Static31.aBoolean43 && local96.anInt1371 == 0 && !local96.aBoolean60);
				local36 = true;
				if (!local96.method778()) {
					Static58.anInt1533++;
					local15 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
	public static boolean method1671(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(Z)V")
	public static void method1672() {
		Static55.aClass10_Sub10_Sub1_4.method1162();
		@Pc(13) int local13 = Static55.aClass10_Sub10_Sub1_4.method1171(8);
		@Pc(18) int local18;
		if (Static34.anInt1005 > local13) {
			for (local18 = local13; local18 < Static34.anInt1005; local18++) {
				Static93.anIntArray232[Static15.anInt449++] = Static1.anIntArray3[local18];
			}
		}
		if (Static34.anInt1005 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static34.anInt1005 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(61) int local61 = Static1.anIntArray3[local18];
			@Pc(65) Class10_Sub1_Sub5_Sub2_Sub1 local65 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local61];
			@Pc(70) int local70 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
			if (local70 == 0) {
				Static1.anIntArray3[Static34.anInt1005++] = local61;
				local65.anInt1631 = Static95.anInt2442;
			} else {
				@Pc(90) int local90 = Static55.aClass10_Sub10_Sub1_4.method1171(2);
				if (local90 == 0) {
					Static1.anIntArray3[Static34.anInt1005++] = local61;
					local65.anInt1631 = Static95.anInt2442;
					Static12.anIntArray46[Static76.anInt2030++] = local61;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local90 == 1) {
						Static1.anIntArray3[Static34.anInt1005++] = local61;
						local65.anInt1631 = Static95.anInt2442;
						local137 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local65.method920(local137, false);
						local147 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
						if (local147 == 1) {
							Static12.anIntArray46[Static76.anInt2030++] = local61;
						}
					} else if (local90 == 2) {
						Static1.anIntArray3[Static34.anInt1005++] = local61;
						local65.anInt1631 = Static95.anInt2442;
						local137 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local65.method920(local137, true);
						local147 = Static55.aClass10_Sub10_Sub1_4.method1171(3);
						local65.method920(local147, true);
						@Pc(199) int local199 = Static55.aClass10_Sub10_Sub1_4.method1171(1);
						if (local199 == 1) {
							Static12.anIntArray46[Static76.anInt2030++] = local61;
						}
					} else if (local90 == 3) {
						Static93.anIntArray232[Static15.anInt449++] = local61;
					}
				}
			}
		}
	}
}
