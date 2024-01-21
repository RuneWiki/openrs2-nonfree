import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 aClass2_Sub1_Sub2_Sub1_8;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	public static int anInt4285;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public static int anInt4286;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1480 = Static151.method2243("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1481 = Static151.method2243("Sprites geladen)3");

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1482 = Static151.method2243("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public static int anInt4281 = -1;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1483 = aClass62_1482;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1484 = Static151.method2243("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1485 = Static151.method2243("::fps ");

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1486 = aClass62_1480;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		@Pc(19) int local19 = arg5 - arg2;
		@Pc(27) int local27 = arg1 * arg1;
		@Pc(31) int local31 = arg5 * arg5;
		@Pc(35) int local35 = local15 * local15;
		@Pc(39) int local39 = local19 * local19;
		@Pc(43) int local43 = local31 << 1;
		@Pc(47) int local47 = local27 << 1;
		@Pc(51) int local51 = local35 << 1;
		@Pc(55) int local55 = local39 << 1;
		@Pc(59) int local59 = arg5 << 1;
		@Pc(63) int local63 = local19 << 1;
		@Pc(72) int local72 = local55 + local35 * (1 - local63);
		@Pc(81) int local81 = local31 - (local59 - 1) * local47;
		@Pc(89) int local89 = (1 - local59) * local27 + local43;
		@Pc(98) int local98 = local39 - local51 * (local63 - 1);
		@Pc(102) int local102 = local27 << 2;
		@Pc(106) int local106 = local35 << 2;
		@Pc(110) int local110 = local31 << 2;
		@Pc(114) int local114 = local43 * 3;
		@Pc(118) int local118 = local39 << 2;
		@Pc(124) int local124 = local47 * (local59 - 3);
		@Pc(128) int local128 = local55 * 3;
		@Pc(134) int local134 = local51 * (local63 - 3);
		@Pc(136) int local136 = local110;
		@Pc(142) int local142 = (arg5 - 1) * local102;
		@Pc(144) int local144 = local118;
		@Pc(150) int local150 = local106 * (local19 - 1);
		@Pc(154) int[] local154 = Static55.anIntArrayArray8[arg6];
		Static19.method345(arg3, local154, arg0 - arg1, arg0 - local15);
		Static19.method345(arg4, local154, arg0 - local15, arg0 - -local15);
		Static19.method345(arg3, local154, local15 + arg0, arg1 + arg0);
		while (local9 > 0) {
			if (local89 < 0) {
				while (local89 < 0) {
					local7++;
					local81 += local136;
					local136 += local110;
					local89 += local114;
					local114 += local110;
				}
			}
			if (local81 < 0) {
				local89 += local114;
				local7++;
				local114 += local110;
				local81 += local136;
				local136 += local110;
			}
			local89 += -local142;
			local142 -= local102;
			local81 += -local124;
			local124 -= local102;
			@Pc(269) boolean local269 = local19 >= local9;
			if (local269) {
				if (local72 < 0) {
					while (local72 < 0) {
						local11++;
						local72 += local128;
						local98 += local144;
						local144 += local118;
						local128 += local118;
					}
				}
				if (local98 < 0) {
					local11++;
					local98 += local144;
					local72 += local128;
					local144 += local118;
					local128 += local118;
				}
				local98 += -local134;
				local72 += -local150;
				local150 -= local106;
				local134 -= local106;
			}
			local9--;
			@Pc(339) int local339 = arg6 - local9;
			@Pc(344) int local344 = arg0 + local7;
			@Pc(348) int local348 = arg6 + local9;
			@Pc(353) int local353 = arg0 - local7;
			if (local269) {
				@Pc(360) int local360 = arg0 + local11;
				@Pc(365) int local365 = arg0 - local11;
				Static19.method345(arg3, Static55.anIntArrayArray8[local339], local353, local365);
				Static19.method345(arg4, Static55.anIntArrayArray8[local339], local365, local360);
				Static19.method345(arg3, Static55.anIntArrayArray8[local339], local360, local344);
				Static19.method345(arg3, Static55.anIntArrayArray8[local348], local353, local365);
				Static19.method345(arg4, Static55.anIntArrayArray8[local348], local365, local360);
				Static19.method345(arg3, Static55.anIntArrayArray8[local348], local360, local344);
			} else {
				Static19.method345(arg3, Static55.anIntArrayArray8[local339], local353, local344);
				Static19.method345(arg3, Static55.anIntArrayArray8[local348], local353, local344);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIII)V")
	public static void method3001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static144.method2183(arg4, Static154.anInt3307, Static15.anInt353);
		@Pc(17) int local17 = Static144.method2183(arg2, Static154.anInt3307, Static15.anInt353);
		@Pc(23) int local23 = Static144.method2183(arg3, Static122.anInt2718, Static153.anInt3279);
		@Pc(29) int local29 = Static144.method2183(arg1, Static122.anInt2718, Static153.anInt3279);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static19.method345(arg0, Static55.anIntArrayArray8[local35], local23, local29);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static154.anInt3305 = -1;
			Static22.anInt515 = -1;
			return;
		}
		@Pc(37) int local37 = Static175.method2548(arg0, Static126.anInt2806, arg2) - arg3;
		@Pc(41) int local41 = arg0 - Static29.anInt721;
		@Pc(45) int local45 = local37 - Static127.anInt2813;
		@Pc(49) int local49 = Class26.anIntArray77[Static58.anInt1153];
		@Pc(53) int local53 = Class26.anIntArray76[Static58.anInt1153];
		@Pc(57) int local57 = Class26.anIntArray77[Static207.anInt4292];
		@Pc(61) int local61 = Class26.anIntArray76[Static207.anInt4292];
		@Pc(65) int local65 = arg2 - anInt4286;
		@Pc(76) int local76 = local41 * local57 + local61 * local65 >> 16;
		@Pc(92) int local92 = local41 * local61 - local57 * local65 >> 16;
		@Pc(94) int local94 = local76;
		@Pc(105) int local105 = local53 * local45 - local92 * local49 >> 16;
		@Pc(115) int local115 = local92 * local53 + local45 * local49 >> 16;
		if (local115 >= 50) {
			Static22.anInt515 = (local105 << 9) / local115 + arg4;
			Static154.anInt3305 = (local94 << 9) / local115 + arg1;
		} else {
			Static22.anInt515 = -1;
			Static154.anInt3305 = -1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Z")
	public static boolean method3004() {
		@Pc(8) long local8 = Static104.method1634();
		@Pc(14) int local14 = (int) (local8 - Static31.aLong37);
		if (local14 > 200) {
			local14 = 200;
		}
		Static199.anInt4167 += local14;
		Static31.aLong37 = local8;
		if (Static49.anInt1065 == 0 && Static179.anInt3757 == 0 && Static30.anInt735 == 0 && Static96.anInt2150 == 0) {
			return true;
		} else if (Static117.aClass36_2 == null) {
			return false;
		} else {
			try {
				if (Static199.anInt4167 > 30000) {
					throw new IOException();
				}
				@Pc(65) Class2_Sub1_Sub21 local65;
				@Pc(70) Class2_Sub11 local70;
				while (Static179.anInt3757 < 20 && Static96.anInt2150 > 0) {
					local65 = (Class2_Sub1_Sub21) Static87.aClass58_9.method1709();
					local70 = new Class2_Sub11(4);
					local70.method1565(1);
					local70.method1554((int) local65.aLong148);
					Static117.aClass36_2.method858(local70.aByteArray26, 4);
					Static137.aClass58_13.method1708(local65, local65.aLong148);
					Static96.anInt2150--;
					Static179.anInt3757++;
				}
				while (Static49.anInt1065 < 20 && Static30.anInt735 > 0) {
					local65 = (Class2_Sub1_Sub21) Static95.aClass61_1.method1786();
					local70 = new Class2_Sub11(4);
					local70.method1565(0);
					local70.method1554((int) local65.aLong148);
					Static117.aClass36_2.method858(local70.aByteArray26, 4);
					local65.method3186();
					Static92.aClass58_10.method1708(local65, local65.aLong148);
					Static49.anInt1065++;
					Static30.anInt735--;
				}
				for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
					@Pc(178) int local178 = Static117.aClass36_2.method863();
					if (local178 < 0) {
						throw new IOException();
					}
					if (local178 == 0) {
						break;
					}
					Static199.anInt4167 = 0;
					@Pc(190) byte local190 = 0;
					if (Static33.aClass2_Sub1_Sub21_1 == null) {
						local190 = 8;
					} else if (Static174.anInt3690 == 0) {
						local190 = 1;
					}
					@Pc(215) int local215;
					@Pc(220) int local220;
					@Pc(257) int local257;
					@Pc(335) int local335;
					if (local190 <= 0) {
						local215 = Static203.aClass2_Sub11_5.aByteArray26.length - Static33.aClass2_Sub1_Sub21_1.aByte9;
						local220 = 512 - Static174.anInt3690;
						if (local215 - Static203.aClass2_Sub11_5.anInt2235 < local220) {
							local220 = local215 - Static203.aClass2_Sub11_5.anInt2235;
						}
						if (local178 < local220) {
							local220 = local178;
						}
						Static117.aClass36_2.method857(Static203.aClass2_Sub11_5.aByteArray26, Static203.aClass2_Sub11_5.anInt2235, local220);
						if (Static83.aByte2 != 0) {
							for (local257 = 0; local257 < local220; local257++) {
								Static203.aClass2_Sub11_5.aByteArray26[local257 + Static203.aClass2_Sub11_5.anInt2235] ^= Static83.aByte2;
							}
						}
						Static203.aClass2_Sub11_5.anInt2235 += local220;
						Static174.anInt3690 += local220;
						if (Static203.aClass2_Sub11_5.anInt2235 == local215) {
							if (Static33.aClass2_Sub1_Sub21_1.aLong148 == 16711935L) {
								Static165.aClass2_Sub11_3 = Static203.aClass2_Sub11_5;
								for (local257 = 0; local257 < 256; local257++) {
									@Pc(322) Class71_Sub1 local322 = Static97.aClass71_Sub1Array1[local257];
									if (local322 != null) {
										Static165.aClass2_Sub11_3.anInt2235 = local257 * 8 + 5;
										local335 = Static165.aClass2_Sub11_3.method1577();
										@Pc(339) int local339 = Static165.aClass2_Sub11_3.method1577();
										local322.method2150(local339, local335);
									}
								}
							} else {
								Static158.aCRC32_2.reset();
								Static158.aCRC32_2.update(Static203.aClass2_Sub11_5.aByteArray26, 0, local215);
								local257 = (int) Static158.aCRC32_2.getValue();
								if (local257 != Static33.aClass2_Sub1_Sub21_1.anInt3747) {
									try {
										Static117.aClass36_2.method862();
									} catch (@Pc(373) Exception local373) {
									}
									Static117.aClass36_2 = null;
									Static83.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
									Static143.anInt3032++;
									return false;
								}
								Static143.anInt3032 = 0;
								Static69.anInt1430 = 0;
								Static33.aClass2_Sub1_Sub21_1.aClass71_Sub1_22.method2148(Static203.aClass2_Sub11_5.aByteArray26, (int) (Static33.aClass2_Sub1_Sub21_1.aLong148 & 0xFFFFL), (Static33.aClass2_Sub1_Sub21_1.aLong148 & 0xFF0000L) == 16711680L, Static102.aBoolean109);
							}
							Static33.aClass2_Sub1_Sub21_1.method3183();
							Static174.anInt3690 = 0;
							Static203.aClass2_Sub11_5 = null;
							Static33.aClass2_Sub1_Sub21_1 = null;
							if (Static102.aBoolean109) {
								Static179.anInt3757--;
							} else {
								Static49.anInt1065--;
							}
						} else {
							if (Static174.anInt3690 != 512) {
								break;
							}
							Static174.anInt3690 = 0;
						}
					} else {
						local215 = local190 - Static147.aClass2_Sub11_2.anInt2235;
						if (local215 > local178) {
							local215 = local178;
						}
						Static117.aClass36_2.method857(Static147.aClass2_Sub11_2.aByteArray26, Static147.aClass2_Sub11_2.anInt2235, local215);
						if (Static83.aByte2 != 0) {
							for (local220 = 0; local220 < local215; local220++) {
								Static147.aClass2_Sub11_2.aByteArray26[Static147.aClass2_Sub11_2.anInt2235 + local220] = (byte) (Static147.aClass2_Sub11_2.aByteArray26[Static147.aClass2_Sub11_2.anInt2235 + local220] ^ Static83.aByte2);
							}
						}
						Static147.aClass2_Sub11_2.anInt2235 += local215;
						if (Static147.aClass2_Sub11_2.anInt2235 < local190) {
							break;
						}
						if (Static33.aClass2_Sub1_Sub21_1 == null) {
							Static147.aClass2_Sub11_2.anInt2235 = 0;
							local220 = Static147.aClass2_Sub11_2.method1534();
							local257 = Static147.aClass2_Sub11_2.method1557();
							@Pc(526) long local526 = (long) ((local220 << 16) + local257);
							@Pc(530) int local530 = Static147.aClass2_Sub11_2.method1534();
							local335 = Static147.aClass2_Sub11_2.method1577();
							@Pc(540) Class2_Sub1_Sub21 local540 = (Class2_Sub1_Sub21) Static137.aClass58_13.method1704(local526);
							Static102.aBoolean109 = true;
							if (local540 == null) {
								local540 = (Class2_Sub1_Sub21) Static92.aClass58_10.method1704(local526);
								Static102.aBoolean109 = false;
							}
							if (local540 == null) {
								throw new IOException();
							}
							@Pc(567) int local567 = local530 == 0 ? 5 : 9;
							Static33.aClass2_Sub1_Sub21_1 = local540;
							Static203.aClass2_Sub11_5 = new Class2_Sub11(local567 + local335 + Static33.aClass2_Sub1_Sub21_1.aByte9);
							Static203.aClass2_Sub11_5.method1565(local530);
							Static203.aClass2_Sub11_5.method1544(local335);
							Static147.aClass2_Sub11_2.anInt2235 = 0;
							Static174.anInt3690 = 8;
						} else if (Static174.anInt3690 == 0) {
							if (Static147.aClass2_Sub11_2.aByteArray26[0] == -1) {
								Static147.aClass2_Sub11_2.anInt2235 = 0;
								Static174.anInt3690 = 1;
							} else {
								Static33.aClass2_Sub1_Sub21_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(622) IOException local622) {
				try {
					Static117.aClass36_2.method862();
				} catch (@Pc(627) Exception local627) {
				}
				Static69.anInt1430++;
				Static117.aClass36_2 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!pb;Lclient!pb;Lclient!pb;)V")
	public static void method3006(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		Static59.anInt1227 = arg0.method2114(Static170.aClass62_1274);
		Static211.anInt4416 = arg1.method2114(Static101.aClass62_791);
		Static213.anInt4434 = arg1.method2114(Static169.aClass62_1259);
		Static56.anInt1143 = arg1.method2114(Static125.aClass62_973);
		Static9.anInt245 = arg1.method2114(Static156.aClass62_1190);
		Static190.anInt3936 = arg1.method2114(Static197.aClass62_1424);
		Static92.anInt2047 = arg1.method2114(Static138.aClass62_1034);
		Static66.anInt1402 = arg1.method2114(Static120.aClass62_923);
		Static94.anInt2095 = arg1.method2114(Static118.aClass62_908);
		Static164.anInt3465 = arg1.method2114(Static137.aClass62_1022);
		Static1.anInt34 = arg1.method2114(Static30.aClass62_227);
		Static131.anInt1518 = arg2.method2114(Static168.aClass62_1253);
	}
}
