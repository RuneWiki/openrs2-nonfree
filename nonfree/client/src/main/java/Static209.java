import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!gi;")
	public static Class39 aClass39_8;

	@OriginalMember(owner = "client!vg", name = "p", descriptor = "Lclient!nb;")
	public static Class15 aClass15_40;

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "Lclient!i;")
	private static Class41 aClass41_1248 = Static184.method2923(" ");

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_1245 = aClass41_1248;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!i;")
	private static Class41 aClass41_1247 = Static184.method2923("Invalid username or password)3");

	@OriginalMember(owner = "client!vg", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_1246 = aClass41_1247;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "Lclient!id;")
	public static Class43 aClass43_24 = new Class43(64);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method3231() {
		@Pc(5) Object local5 = Static30.anObject1;
		synchronized (Static30.anObject1) {
			if (Static199.anInt4469 != 0) {
				Static199.anInt4469 = 1;
				try {
					Static30.anObject1.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIB)V")
	public static void method3232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg0) {
			Static204.method3145(arg3, arg0, arg2, arg1);
		} else if (arg3 - arg0 >= Static60.anInt4779 && Static11.anInt385 >= arg0 + arg3 && arg2 - arg4 >= Static45.anInt1337 && Static17.anInt457 >= arg4 + arg2) {
			Static119.method2004(arg3, arg0, arg4, arg2, arg1);
		} else {
			Static186.method2948(arg3, arg4, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z")
	public static boolean method3233() throws IOException {
		if (Static30.aClass63_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static30.aClass63_1.method2035();
		if (local13 == 0) {
			return false;
		}
		if (Static211.anInt4701 == -1) {
			local13--;
			Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, 1);
			Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
			Static211.anInt4701 = Static204.aClass2_Sub3_Sub1_3.method224();
			Static202.anInt1733 = Static14.anIntArray23[Static211.anInt4701];
		}
		if (Static202.anInt1733 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, 1);
			local13--;
			Static202.anInt1733 = Static204.aClass2_Sub3_Sub1_3.aByteArray4[0] & 0xFF;
		}
		if (Static202.anInt1733 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, 2);
			Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
			Static202.anInt1733 = Static204.aClass2_Sub3_Sub1_3.method163();
		}
		if (Static202.anInt1733 > local13) {
			return false;
		}
		Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
		Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, Static202.anInt1733);
		Static170.anInt3984 = 0;
		Static77.anInt1991 = Static42.anInt229;
		Static42.anInt229 = Static88.anInt2197;
		Static88.anInt2197 = Static211.anInt4701;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(171) Class80 local171;
		@Pc(141) Class2_Sub21 local141;
		if (Static211.anInt4701 == 239) {
			local123 = Static204.aClass2_Sub3_Sub1_3.method185();
			local127 = Static204.aClass2_Sub3_Sub1_3.method185();
			@Pc(134) Class2_Sub21 local134 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local123);
			local141 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local127);
			if (local141 != null) {
				Static81.method1471(local141, local134 == null || local134.anInt3435 != local141.anInt3435);
			}
			if (local134 != null) {
				local134.method3314();
				Static113.aClass70_8.method2208((long) local127, local134);
			}
			local171 = Static212.method3256(local123);
			if (local171 != null) {
				Static176.method2833(local171);
			}
			local171 = Static212.method3256(local127);
			if (local171 != null) {
				Static176.method2833(local171);
				Static96.method1670(true, local171);
			}
			if (Static39.anInt1055 != -1) {
				Static122.method2038(Static39.anInt1055, 1);
			}
			Static211.anInt4701 = -1;
			return true;
		}
		@Pc(215) int local215;
		@Pc(219) Class80 local219;
		if (Static211.anInt4701 == 244) {
			local123 = Static204.aClass2_Sub3_Sub1_3.method182();
			local127 = Static204.aClass2_Sub3_Sub1_3.method201();
			local215 = Static204.aClass2_Sub3_Sub1_3.method174();
			local219 = Static212.method3256(local123);
			local219.aByte13 = 0;
			local219.anInt3671 = local219.anInt3702 = local215;
			local219.aByte11 = 0;
			local219.anInt3627 = local219.anInt3641 = local127;
			Static176.method2833(local219);
			Static211.anInt4701 = -1;
			return true;
		} else if (Static211.anInt4701 == 79) {
			Static39.method822(false);
			Static211.anInt4701 = -1;
			return true;
		} else {
			@Pc(288) int local288;
			@Pc(310) int local310;
			@Pc(314) int local314;
			@Pc(392) int local392;
			@Pc(398) int local398;
			@Pc(396) int local396;
			@Pc(408) long local408;
			if (Static211.anInt4701 == 12) {
				local123 = Static202.anInt1733 + Static204.aClass2_Sub3_Sub1_3.anInt239;
				local127 = Static204.aClass2_Sub3_Sub1_3.method163();
				local215 = Static204.aClass2_Sub3_Sub1_3.method163();
				if (local127 != Static39.anInt1055) {
					Static39.anInt1055 = local127;
					Static134.method2137(Static39.anInt1055);
					Static170.method2738();
					Static131.method2084(Static39.anInt1055);
					for (local288 = 0; local288 < 100; local288++) {
						Static199.aBooleanArray23[local288] = true;
					}
				}
				while (local215-- > 0) {
					local288 = Static204.aClass2_Sub3_Sub1_3.method185();
					local310 = Static204.aClass2_Sub3_Sub1_3.method163();
					local314 = Static204.aClass2_Sub3_Sub1_3.method209();
					@Pc(321) Class2_Sub21 local321 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local288);
					if (local321 != null && local310 != local321.anInt3435) {
						Static81.method1471(local321, true);
						local321 = null;
					}
					if (local321 == null) {
						local321 = Static91.method1602(local314, local288, local310);
					}
					local321.aBoolean197 = true;
				}
				for (local141 = (Class2_Sub21) Static113.aClass70_8.method2203(); local141 != null; local141 = (Class2_Sub21) Static113.aClass70_8.method2204()) {
					if (local141.aBoolean197) {
						local141.aBoolean197 = false;
					} else {
						Static81.method1471(local141, true);
					}
				}
				Static28.aClass70_1 = new Class70(512);
				while (Static204.aClass2_Sub3_Sub1_3.anInt239 < local123) {
					local310 = Static204.aClass2_Sub3_Sub1_3.method185();
					local314 = Static204.aClass2_Sub3_Sub1_3.method163();
					local392 = Static204.aClass2_Sub3_Sub1_3.method163();
					local396 = Static204.aClass2_Sub3_Sub1_3.method185();
					for (local398 = local314; local398 <= local392; local398++) {
						local408 = ((long) local310 << 32) + (long) local398;
						Static28.aClass70_1.method2208(local408, new Class2_Sub23(local396));
					}
				}
				Static211.anInt4701 = -1;
				return true;
			} else if (Static211.anInt4701 == 192) {
				Static160.aBoolean233 = true;
				Static120.anInt2898 = Static204.aClass2_Sub3_Sub1_3.method209();
				Static153.anInt3581 = Static204.aClass2_Sub3_Sub1_3.method209();
				Static62.anInt1673 = Static204.aClass2_Sub3_Sub1_3.method163();
				Static218.anInt4774 = Static204.aClass2_Sub3_Sub1_3.method209();
				Static145.anInt3309 = Static204.aClass2_Sub3_Sub1_3.method209();
				if (Static145.anInt3309 >= 100) {
					Static163.anInt3822 = Static153.anInt3581 * 128 + 64;
					Static69.anInt1817 = Static120.anInt2898 * 128 + 64;
					Static94.anInt2320 = Static212.method3261(Static69.anInt1817, Static163.anInt3822, Static134.anInt3147) - Static62.anInt1673;
				}
				Static211.anInt4701 = -1;
				return true;
			} else {
				@Pc(506) Class80 local506;
				if (Static211.anInt4701 == 186) {
					local123 = Static204.aClass2_Sub3_Sub1_3.method185();
					local127 = Static204.aClass2_Sub3_Sub1_3.method163();
					if (local123 < 0) {
						local506 = null;
					} else {
						local506 = Static212.method3256(local123);
					}
					if (local506 != null) {
						for (local288 = 0; local288 < local506.anIntArray380.length; local288++) {
							local506.anIntArray380[local288] = 0;
							local506.anIntArray390[local288] = 0;
						}
					}
					if (local123 < -70000) {
						local127 += 32768;
					}
					Static4.method81(local127);
					local288 = Static204.aClass2_Sub3_Sub1_3.method163();
					for (local310 = 0; local310 < local288; local310++) {
						local314 = Static204.aClass2_Sub3_Sub1_3.method211();
						local392 = Static204.aClass2_Sub3_Sub1_3.method214();
						if (local392 == 255) {
							local392 = Static204.aClass2_Sub3_Sub1_3.method161();
						}
						if (local506 != null && local506.anIntArray380.length > local310) {
							local506.anIntArray380[local310] = local314;
							local506.anIntArray390[local310] = local392;
						}
						Static159.method2580(local127, local392, local310, local314 - 1);
					}
					if (local506 != null) {
						Static176.method2833(local506);
					}
					Static112.method1912();
					Static205.anIntArray472[Static198.anInt4445++ & 0x1F] = local127 & 0x7FFF;
					Static211.anInt4701 = -1;
					return true;
				}
				@Pc(652) long local652;
				@Pc(632) Class41 local632;
				@Pc(639) boolean local639;
				@Pc(1059) Class41 local1059;
				@Pc(648) Class41 local648;
				if (Static211.anInt4701 == 117) {
					local632 = Static204.aClass2_Sub3_Sub1_3.method160();
					if (local632.method1420(Static141.aClass41_898)) {
						local639 = false;
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local652 = local648.method1419();
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (Static83.aLongArray6[local314] == local652) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							Static198.method3075(Static49.aClass41_417, 4, local648);
						}
					} else if (local632.method1420(Static183.aClass41_377)) {
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local639 = false;
						local652 = local648.method1419();
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (local652 == Static83.aLongArray6[local314]) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							local1059 = local632.method1412(local632.method1406(Static95.aClass41_692) + 1, local632.method1393() + -9);
							Static198.method3075(local1059, 8, local648);
						}
					} else if (local632.method1420(Static75.aClass41_1011)) {
						local639 = false;
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local652 = local648.method1419();
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (Static83.aLongArray6[local314] == local652) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							Static198.method3075(Static156.aClass41_981, 10, local648);
						}
					} else if (local632.method1420(Static154.aClass41_976)) {
						local648 = local632.method1412(0, local632.method1406(Static154.aClass41_976));
						Static198.method3075(local648, 11, Static156.aClass41_981);
					} else if (local632.method1420(Static39.aClass41_343)) {
						local648 = local632.method1412(0, local632.method1406(Static39.aClass41_343));
						if (Static31.anInt806 == 0) {
							Static198.method3075(local648, 12, Static156.aClass41_981);
						}
					} else if (local632.method1420(Static113.aClass41_783)) {
						local648 = local632.method1412(0, local632.method1406(Static113.aClass41_783));
						if (Static31.anInt806 == 0) {
							Static198.method3075(local648, 13, Static156.aClass41_981);
						}
					} else if (local632.method1420(Static142.aClass41_902)) {
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local652 = local648.method1419();
						local639 = false;
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (local652 == Static83.aLongArray6[local314]) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							Static198.method3075(Static156.aClass41_981, 14, local648);
						}
					} else if (local632.method1420(Static202.aClass41_548)) {
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local652 = local648.method1419();
						local639 = false;
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (Static83.aLongArray6[local314] == local652) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							Static198.method3075(Static156.aClass41_981, 15, local648);
						}
					} else if (local632.method1420(Static35.aClass41_260)) {
						local648 = local632.method1412(0, local632.method1406(Static95.aClass41_692));
						local652 = local648.method1419();
						local639 = false;
						for (local314 = 0; local314 < Static60.anInt4785; local314++) {
							if (Static83.aLongArray6[local314] == local652) {
								local639 = true;
								break;
							}
						}
						if (!local639 && Static31.anInt806 == 0) {
							Static198.method3075(Static156.aClass41_981, 16, local648);
						}
					} else {
						Static198.method3075(local632, 0, Static156.aClass41_981);
					}
					Static211.anInt4701 = -1;
					return true;
				} else if (Static211.anInt4701 == 108) {
					local123 = Static204.aClass2_Sub3_Sub1_3.method209();
					if (Static204.aClass2_Sub3_Sub1_3.method209() == 0) {
						Static8.aClass61Array1[local123] = new Class61();
					} else {
						Static204.aClass2_Sub3_Sub1_3.anInt239--;
						Static8.aClass61Array1[local123] = new Class61(Static204.aClass2_Sub3_Sub1_3);
					}
					Static211.anInt4701 = -1;
					Static103.anInt2517 = Static60.anInt4782;
					return true;
				} else if (Static211.anInt4701 == 213) {
					local123 = Static204.aClass2_Sub3_Sub1_3.method209();
					@Pc(1120) Class55 local1120 = new Class55();
					local127 = local123 >> 6;
					local1120.anInt2526 = local123 & 0x3F;
					local1120.anInt2524 = Static204.aClass2_Sub3_Sub1_3.method209();
					if (local1120.anInt2524 >= 0 && local1120.anInt2524 < Static158.aClass2_Sub2_Sub16Array16.length) {
						if (local1120.anInt2526 == 1 || local1120.anInt2526 == 10) {
							local1120.anInt2529 = Static204.aClass2_Sub3_Sub1_3.method163();
							Static204.aClass2_Sub3_Sub1_3.anInt239 += 3;
						} else if (local1120.anInt2526 >= 2 && local1120.anInt2526 <= 6) {
							if (local1120.anInt2526 == 2) {
								local1120.anInt2521 = 64;
								local1120.anInt2532 = 64;
							}
							if (local1120.anInt2526 == 3) {
								local1120.anInt2521 = 0;
								local1120.anInt2532 = 64;
							}
							if (local1120.anInt2526 == 4) {
								local1120.anInt2521 = 128;
								local1120.anInt2532 = 64;
							}
							if (local1120.anInt2526 == 5) {
								local1120.anInt2521 = 64;
								local1120.anInt2532 = 0;
							}
							if (local1120.anInt2526 == 6) {
								local1120.anInt2532 = 128;
								local1120.anInt2521 = 64;
							}
							local1120.anInt2526 = 2;
							local1120.anInt2525 = Static204.aClass2_Sub3_Sub1_3.method163();
							local1120.anInt2522 = Static204.aClass2_Sub3_Sub1_3.method163();
							local1120.anInt2533 = Static204.aClass2_Sub3_Sub1_3.method209();
						}
						local1120.anInt2523 = Static204.aClass2_Sub3_Sub1_3.method163();
						if (local1120.anInt2523 == 65535) {
							local1120.anInt2523 = -1;
						}
						Static57.aClass55Array1[local127] = local1120;
					}
					Static211.anInt4701 = -1;
					return true;
				} else if (Static211.anInt4701 == 146) {
					local123 = Static204.aClass2_Sub3_Sub1_3.method161();
					local127 = Static204.aClass2_Sub3_Sub1_3.method182();
					local215 = Static204.aClass2_Sub3_Sub1_3.method163();
					if (local215 == 65535) {
						local215 = -1;
					}
					local288 = Static204.aClass2_Sub3_Sub1_3.method164();
					if (local288 == 65535) {
						local288 = -1;
					}
					for (local310 = local215; local310 <= local288; local310++) {
						@Pc(1315) long local1315 = ((long) local127 << 32) + (long) local310;
						@Pc(1320) Class2 local1320 = Static28.aClass70_1.method2205(local1315);
						if (local1320 != null) {
							local1320.method3314();
						}
						Static28.aClass70_1.method2208(local1315, new Class2_Sub23(local123));
					}
					Static211.anInt4701 = -1;
					return true;
				} else if (Static211.anInt4701 == 253) {
					Static160.aBoolean233 = false;
					for (local123 = 0; local123 < 5; local123++) {
						Static207.aBooleanArray24[local123] = false;
					}
					Static211.anInt4701 = -1;
					return true;
				} else if (Static211.anInt4701 == 214) {
					local123 = Static204.aClass2_Sub3_Sub1_3.method175();
					local648 = Static204.aClass2_Sub3_Sub1_3.method160();
					local506 = Static212.method3256(local123);
					if (!local648.method1386(local506.aClass41_979)) {
						local506.aClass41_979 = local648;
						Static176.method2833(local506);
					}
					Static211.anInt4701 = -1;
					return true;
				} else if (Static211.anInt4701 == 19) {
					Static55.method1082();
					Static211.anInt4701 = -1;
					return true;
				} else {
					@Pc(1411) long local1411;
					@Pc(1511) Class41 local1511;
					if (Static211.anInt4701 == 205) {
						local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
						local215 = Static204.aClass2_Sub3_Sub1_3.method163();
						local639 = false;
						@Pc(1421) byte local1421 = Static204.aClass2_Sub3_Sub1_3.method186();
						if ((Long.MIN_VALUE & local1411) != 0L) {
							local639 = true;
						}
						if (local639) {
							if (Static43.anInt1296 == 0) {
								Static211.anInt4701 = -1;
								return true;
							}
							local1411 &= Long.MAX_VALUE;
							for (local314 = 0; Static43.anInt1296 > local314 && (local1411 != Static77.aClass2_Sub10Array1[local314].aLong150 || local215 != Static77.aClass2_Sub10Array1[local314].anInt1691); local314++) {
							}
							if (local314 < Static43.anInt1296) {
								while (local314 < Static43.anInt1296 - 1) {
									Static77.aClass2_Sub10Array1[local314] = Static77.aClass2_Sub10Array1[local314 + 1];
									local314++;
								}
								Static43.anInt1296--;
								Static77.aClass2_Sub10Array1[Static43.anInt1296] = null;
							}
						} else {
							local1511 = Static204.aClass2_Sub3_Sub1_3.method160();
							@Pc(1515) Class2_Sub10 local1515 = new Class2_Sub10();
							local1515.aLong150 = local1411;
							local1515.aClass41_532 = Static176.method2837(local1515.aLong150);
							local1515.aClass41_530 = local1511;
							local1515.anInt1691 = local215;
							local1515.aByte2 = local1421;
							for (local396 = Static43.anInt1296 - 1; local396 >= 0; local396--) {
								local398 = Static77.aClass2_Sub10Array1[local396].aClass41_532.method1414(local1515.aClass41_532);
								if (local398 == 0) {
									Static77.aClass2_Sub10Array1[local396].anInt1691 = local215;
									Static77.aClass2_Sub10Array1[local396].aByte2 = local1421;
									Static77.aClass2_Sub10Array1[local396].aClass41_530 = local1511;
									if (Static34.aLong23 == local1411) {
										Static128.aByte7 = local1421;
									}
									Static211.anInt4701 = -1;
									Static67.anInt1765 = Static60.anInt4782;
									return true;
								}
								if (local398 < 0) {
									break;
								}
							}
							if (Static77.aClass2_Sub10Array1.length <= Static43.anInt1296) {
								Static211.anInt4701 = -1;
								return true;
							}
							for (local398 = Static43.anInt1296 - 1; local398 > local396; local398--) {
								Static77.aClass2_Sub10Array1[local398 + 1] = Static77.aClass2_Sub10Array1[local398];
							}
							if (Static43.anInt1296 == 0) {
								Static77.aClass2_Sub10Array1 = new Class2_Sub10[100];
							}
							Static77.aClass2_Sub10Array1[local396 + 1] = local1515;
							Static43.anInt1296++;
							if (local1411 == Static34.aLong23) {
								Static128.aByte7 = local1421;
							}
						}
						Static211.anInt4701 = -1;
						Static67.anInt1765 = Static60.anInt4782;
						return true;
					} else if (Static211.anInt4701 == 235) {
						Static193.aClass41_1043 = Static204.aClass2_Sub3_Sub1_3.method160();
						Static148.method2316(Static193.aClass41_1043);
						Static211.anInt4701 = -1;
						return true;
					} else if (Static211.anInt4701 == 26) {
						local123 = Static204.aClass2_Sub3_Sub1_3.method182();
						local127 = Static204.aClass2_Sub3_Sub1_3.method164();
						if (local127 == 65535) {
							local127 = -1;
						}
						local506 = Static212.method3256(local123);
						if (local506.anInt3665 != 2 || local506.anInt3651 != local127) {
							local506.anInt3651 = local127;
							local506.anInt3665 = 2;
							Static176.method2833(local506);
						}
						Static211.anInt4701 = -1;
						return true;
					} else if (Static211.anInt4701 == 101) {
						if (Static202.anInt1733 == 0) {
							Static4.aClass41_36 = Static81.aClass41_614;
						} else {
							Static4.aClass41_36 = Static204.aClass2_Sub3_Sub1_3.method160();
						}
						Static211.anInt4701 = -1;
						return true;
					} else if (Static211.anInt4701 == 191) {
						@Pc(1738) boolean local1738 = Static204.aClass2_Sub3_Sub1_3.method157() == 1;
						local127 = Static204.aClass2_Sub3_Sub1_3.method175();
						local506 = Static212.method3256(local127);
						if (local1738 != local506.aBoolean212) {
							local506.aBoolean212 = local1738;
							Static176.method2833(local506);
						}
						Static211.anInt4701 = -1;
						return true;
					} else {
						@Pc(1777) Class80 local1777;
						if (Static211.anInt4701 == 200) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method175();
							local1777 = Static212.method3256(local123);
							for (local215 = 0; local215 < local1777.anIntArray380.length; local215++) {
								local1777.anIntArray380[local215] = -1;
								local1777.anIntArray380[local215] = 0;
							}
							Static176.method2833(local1777);
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 139) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method175();
							local127 = Static204.aClass2_Sub3_Sub1_3.method175();
							local215 = Static204.aClass2_Sub3_Sub1_3.method211();
							if (local215 == 65535) {
								local215 = -1;
							}
							local219 = Static212.method3256(local123);
							@Pc(1843) Class2_Sub2_Sub15 local1843;
							if (local219.aBoolean215) {
								local219.anInt3645 = local215;
								local219.anInt3685 = local127;
								local1843 = Static63.method1158(local215);
								local219.anInt3693 = local1843.anInt3119;
								local219.anInt3686 = local1843.anInt3136;
								local219.anInt3700 = local1843.anInt3121;
								local219.anInt3674 = local1843.anInt3122;
								local219.anInt3626 = local1843.anInt3125;
								local219.anInt3704 = local1843.anInt3102;
								if (local219.anInt3678 > 0) {
									local219.anInt3686 = local219.anInt3686 * 32 / local219.anInt3678;
								} else if (local219.anInt3696 > 0) {
									local219.anInt3686 = local219.anInt3686 * 32 / local219.anInt3696;
								}
								Static176.method2833(local219);
							} else if (local215 == -1) {
								Static211.anInt4701 = -1;
								local219.anInt3665 = 0;
								return true;
							} else {
								local1843 = Static63.method1158(local215);
								local219.anInt3686 = local1843.anInt3136 * 100 / local127;
								local219.anInt3700 = local1843.anInt3121;
								local219.anInt3665 = 4;
								local219.anInt3674 = local1843.anInt3122;
								local219.anInt3651 = local215;
								Static176.method2833(local219);
							}
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 230) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method157();
							local127 = local123 >> 2;
							local215 = local123 & 0x3;
							local288 = Static85.anIntArray211[local127];
							local310 = Static204.aClass2_Sub3_Sub1_3.method163();
							if (local310 == 65535) {
								local310 = -1;
							}
							local314 = Static204.aClass2_Sub3_Sub1_3.method182();
							local392 = local314 >> 28 & 0x3;
							local398 = local314 & 0x3FFF;
							local396 = local314 >> 14 & 0x3FFF;
							local396 -= Static198.anInt4451;
							local398 -= Static168.anInt3899;
							Static99.method1711(local127, local396, local288, local215, local392, local398, local310);
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 77) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method175();
							local127 = Static204.aClass2_Sub3_Sub1_3.method164();
							local215 = Static204.aClass2_Sub3_Sub1_3.method163();
							local288 = Static204.aClass2_Sub3_Sub1_3.method163();
							if (local123 >> 30 != 0) {
								local310 = local123 >> 28 & 0x3;
								local314 = (local123 >> 14 & 0x3FFF) - Static198.anInt4451;
								local392 = (local123 & 0x3FFF) - Static168.anInt3899;
								if (local314 >= 0 && local392 >= 0 && local314 < 104 && local392 < 104) {
									local392 = local392 * 128 + 64;
									local314 = local314 * 128 + 64;
									@Pc(2212) Class12_Sub1 local2212 = new Class12_Sub1(local127, local310, local314, local392, Static212.method3261(local314, local392, local310) - local288, local215, Static103.anInt2511);
									Static38.aClass108_2.method3334(new Class2_Sub2_Sub27(local2212));
								}
							} else if (local123 >> 29 != 0) {
								local310 = local123 & 0xFFFF;
								@Pc(2052) Class12_Sub3_Sub2 local2052 = Static199.aClass12_Sub3_Sub2Array1[local310];
								if (local2052 != null) {
									local2052.anInt3911 = local127;
									if (local2052.anInt3911 == 65535) {
										local2052.anInt3911 = -1;
									}
									local2052.anInt3908 = 0;
									local2052.anInt3913 = Static103.anInt2511 + local215;
									local2052.anInt3953 = local288;
									if (Static103.anInt2511 < local2052.anInt3913) {
										local2052.anInt3908 = -1;
									}
									local2052.anInt3948 = 0;
								}
							} else if (local123 >> 28 != 0) {
								local310 = local123 & 0xFFFF;
								@Pc(2103) Class12_Sub3_Sub1 local2103;
								if (Static195.anInt4428 == local310) {
									local2103 = Static213.aClass12_Sub3_Sub1_1;
								} else {
									local2103 = Static216.aClass12_Sub3_Sub1Array1[local310];
								}
								if (local2103 != null) {
									local2103.anInt3948 = 0;
									local2103.anInt3953 = local288;
									local2103.anInt3908 = 0;
									local2103.anInt3911 = local127;
									if (local2103.anInt3911 == 65535) {
										local2103.anInt3911 = -1;
									}
									local2103.anInt3913 = Static103.anInt2511 + local215;
									if (Static103.anInt2511 < local2103.anInt3913) {
										local2103.anInt3908 = -1;
									}
								}
							}
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 188) {
							Static60.anInt4785 = Static202.anInt1733 / 8;
							for (local123 = 0; local123 < Static60.anInt4785; local123++) {
								Static83.aLongArray6[local123] = Static204.aClass2_Sub3_Sub1_3.method183();
								Static131.aClass41Array44[local123] = Static176.method2837(Static83.aLongArray6[local123]);
							}
							Static18.anInt491 = Static60.anInt4782;
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 22) {
							Static92.method1619(Static204.aClass2_Sub3_Sub1_3);
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 221) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method209();
							local127 = Static204.aClass2_Sub3_Sub1_3.method209();
							local215 = Static204.aClass2_Sub3_Sub1_3.method209();
							local288 = Static204.aClass2_Sub3_Sub1_3.method209();
							local310 = Static204.aClass2_Sub3_Sub1_3.method163();
							Static207.aBooleanArray24[local123] = true;
							Static177.anIntArray430[local123] = local127;
							Static59.anIntArray160[local123] = local215;
							Static171.anIntArray420[local123] = local288;
							Static168.anIntArray408[local123] = local310;
							Static211.anInt4701 = -1;
							return true;
						} else if (Static211.anInt4701 == 86) {
							local123 = Static204.aClass2_Sub3_Sub1_3.method209();
							local127 = Static204.aClass2_Sub3_Sub1_3.method164();
							if (local123 == 1) {
								Static74.method1382();
								for (local215 = 0; local215 < 4; local215++) {
									Static149.aClass42Array1[local215].method1432();
								}
								System.gc();
							} else if (local123 == 2) {
								Static177.method2840();
								System.gc();
								Static116.method1955(25);
							}
							Static39.anInt1055 = local127;
							Static134.method2137(local127);
							Static170.method2738();
							Static131.method2084(Static39.anInt1055);
							for (local215 = 0; local215 < 100; local215++) {
								Static199.aBooleanArray23[local215] = true;
							}
							Static211.anInt4701 = -1;
							return true;
						} else {
							@Pc(2563) int local2563;
							@Pc(2610) int local2610;
							@Pc(2570) int local2570;
							@Pc(2646) Class41 local2646;
							@Pc(2628) Class41 local2628;
							if (Static211.anInt4701 == 16) {
								local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
								local639 = true;
								local215 = Static204.aClass2_Sub3_Sub1_3.method163();
								local288 = Static204.aClass2_Sub3_Sub1_3.method209();
								if (local1411 < 0L) {
									local639 = false;
									local1411 &= Long.MAX_VALUE;
								}
								local1511 = Static156.aClass41_981;
								if (local215 > 0) {
									local1511 = Static204.aClass2_Sub3_Sub1_3.method160();
								}
								local1059 = Static176.method2837(local1411).method1403();
								for (local396 = 0; local396 < Static131.anInt2996; local396++) {
									if (Static101.aLongArray7[local396] == local1411) {
										if (local215 != Static145.anIntArray341[local396]) {
											Static145.anIntArray341[local396] = local215;
											if (local215 > 0) {
												Static198.method3075(Static149.method2324(new Class41[] { local1059, Static153.aClass41_968 }), 5, Static156.aClass41_981);
											}
											if (local215 == 0) {
												Static198.method3075(Static149.method2324(new Class41[] { local1059, Static103.aClass41_747 }), 5, Static156.aClass41_981);
											}
										}
										local1059 = null;
										Static151.aClass41Array51[local396] = local1511;
										Static42.anIntArray11[local396] = local288;
										Static54.aBooleanArray5[local396] = local639;
										break;
									}
								}
								if (local1059 != null && Static131.anInt2996 < 200) {
									Static101.aLongArray7[Static131.anInt2996] = local1411;
									Static21.aClass41Array71[Static131.anInt2996] = local1059;
									Static145.anIntArray341[Static131.anInt2996] = local215;
									Static151.aClass41Array51[Static131.anInt2996] = local1511;
									Static42.anIntArray11[Static131.anInt2996] = local288;
									Static54.aBooleanArray5[Static131.anInt2996] = local639;
									Static131.anInt2996++;
								}
								Static18.anInt491 = Static60.anInt4782;
								local2563 = Static131.anInt2996;
								while (local2563 > 0) {
									@Pc(2567) boolean local2567 = true;
									local2563--;
									for (local2570 = 0; local2570 < local2563; local2570++) {
										if (Static26.anInt662 != Static145.anIntArray341[local2570] && Static26.anInt662 == Static145.anIntArray341[local2570 + 1] || Static145.anIntArray341[local2570] == 0 && Static145.anIntArray341[local2570 + 1] != 0) {
											local2567 = false;
											local2610 = Static145.anIntArray341[local2570];
											Static145.anIntArray341[local2570] = Static145.anIntArray341[local2570 + 1];
											Static145.anIntArray341[local2570 + 1] = local2610;
											local2628 = Static151.aClass41Array51[local2570];
											Static151.aClass41Array51[local2570] = Static151.aClass41Array51[local2570 + 1];
											Static151.aClass41Array51[local2570 + 1] = local2628;
											local2646 = Static21.aClass41Array71[local2570];
											Static21.aClass41Array71[local2570] = Static21.aClass41Array71[local2570 + 1];
											Static21.aClass41Array71[local2570 + 1] = local2646;
											@Pc(2664) long local2664 = Static101.aLongArray7[local2570];
											Static101.aLongArray7[local2570] = Static101.aLongArray7[local2570 + 1];
											Static101.aLongArray7[local2570 + 1] = local2664;
											@Pc(2682) int local2682 = Static42.anIntArray11[local2570];
											Static42.anIntArray11[local2570] = Static42.anIntArray11[local2570 + 1];
											Static42.anIntArray11[local2570 + 1] = local2682;
											@Pc(2700) boolean local2700 = Static54.aBooleanArray5[local2570];
											Static54.aBooleanArray5[local2570] = Static54.aBooleanArray5[local2570 + 1];
											Static54.aBooleanArray5[local2570 + 1] = local2700;
										}
									}
									if (local2567) {
										break;
									}
								}
								Static211.anInt4701 = -1;
								return true;
							} else if (Static211.anInt4701 == 249) {
								local123 = Static204.aClass2_Sub3_Sub1_3.method164();
								local127 = Static204.aClass2_Sub3_Sub1_3.method185();
								local215 = local123 >> 10 & 0x1F;
								local288 = local123 >> 5 & 0x1F;
								local310 = local123 & 0x1F;
								local314 = (local310 << 3) + (local215 << 19) + (local288 << 11);
								@Pc(2776) Class80 local2776 = Static212.method3256(local127);
								if (local314 != local2776.anInt3654) {
									local2776.anInt3654 = local314;
									Static176.method2833(local2776);
								}
								Static211.anInt4701 = -1;
								return true;
							} else if (Static211.anInt4701 == 68) {
								Static112.method1912();
								Static213.anInt4716 = Static204.aClass2_Sub3_Sub1_3.method209();
								Static211.anInt4701 = -1;
								Static184.anInt4240 = Static60.anInt4782;
								return true;
							} else if (Static211.anInt4701 == 24) {
								for (local123 = 0; local123 < Static99.anIntArray243.length; local123++) {
									if (Static99.anIntArray243[local123] != Static151.anIntArray351[local123]) {
										Static99.anIntArray243[local123] = Static151.anIntArray351[local123];
										Static143.method2234(local123);
										Static216.anIntArray492[Static200.anInt4494++ & 0x1F] = local123;
									}
								}
								Static211.anInt4701 = -1;
								return true;
							} else {
								@Pc(2936) int local2936;
								@Pc(2875) long local2875;
								@Pc(2880) long local2880;
								@Pc(2895) int local2895;
								if (Static211.anInt4701 == 74) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									Static204.aClass2_Sub3_Sub1_3.method186();
									local652 = Static204.aClass2_Sub3_Sub1_3.method183();
									local2875 = Static204.aClass2_Sub3_Sub1_3.method163();
									local2880 = Static204.aClass2_Sub3_Sub1_3.method166();
									local398 = Static204.aClass2_Sub3_Sub1_3.method209();
									local408 = (local2875 << 32) + local2880;
									@Pc(2893) boolean local2893 = false;
									local2895 = 0;
									label1332: while (true) {
										if (local2895 >= 100) {
											if (local398 <= 1) {
												if (Static211.anInt4700 == 1 || Static158.anInt3725 == 1) {
													local2893 = true;
												} else {
													for (local2936 = 0; local2936 < Static60.anInt4785; local2936++) {
														if (Static83.aLongArray6[local2936] == local1411) {
															local2893 = true;
															break label1332;
														}
													}
												}
											}
											break;
										}
										if (Static150.aLongArray9[local2895] == local408) {
											local2893 = true;
											break;
										}
										local2895++;
									}
									if (!local2893 && Static31.anInt806 == 0) {
										Static150.aLongArray9[Static56.anInt1607] = local408;
										Static56.anInt1607 = (Static56.anInt1607 + 1) % 100;
										local2628 = Static24.method792(Static19.method349(Static204.aClass2_Sub3_Sub1_3).method1411());
										if (local398 == 2 || local398 == 3) {
											Static55.method1078(Static149.method2324(new Class41[] { Static26.aClass41_175, Static176.method2837(local1411).method1403() }), local2628, Static176.method2837(local652).method1403());
										} else if (local398 == 1) {
											Static55.method1078(Static149.method2324(new Class41[] { Static149.aClass41_932, Static176.method2837(local1411).method1403() }), local2628, Static176.method2837(local652).method1403());
										} else {
											Static55.method1078(Static176.method2837(local1411).method1403(), local2628, Static176.method2837(local652).method1403());
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 134) {
									Static135.anInt3148 = Static204.aClass2_Sub3_Sub1_3.method181();
									Static107.anInt2598 = Static204.aClass2_Sub3_Sub1_3.method209();
									while (Static202.anInt1733 > Static204.aClass2_Sub3_Sub1_3.anInt239) {
										Static211.anInt4701 = Static204.aClass2_Sub3_Sub1_3.method209();
										Static216.method3290();
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 84) {
									Static101.anInt2450 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static211.anInt4701 = -1;
									Static18.anInt491 = Static60.anInt4782;
									return true;
								} else if (Static211.anInt4701 == 6) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									local652 = Static204.aClass2_Sub3_Sub1_3.method163();
									local2875 = Static204.aClass2_Sub3_Sub1_3.method166();
									local392 = Static204.aClass2_Sub3_Sub1_3.method209();
									@Pc(3137) long local3137 = (local652 << 32) + local2875;
									@Pc(3139) boolean local3139 = false;
									local2570 = 0;
									label1367: while (true) {
										if (local2570 >= 100) {
											if (local392 <= 1) {
												if (Static211.anInt4700 == 1 || Static158.anInt3725 == 1) {
													local3139 = true;
												} else {
													for (local2610 = 0; local2610 < Static60.anInt4785; local2610++) {
														if (local1411 == Static83.aLongArray6[local2610]) {
															local3139 = true;
															break label1367;
														}
													}
												}
											}
											break;
										}
										if (Static150.aLongArray9[local2570] == local3137) {
											local3139 = true;
											break;
										}
										local2570++;
									}
									if (!local3139 && Static31.anInt806 == 0) {
										Static150.aLongArray9[Static56.anInt1607] = local3137;
										Static56.anInt1607 = (Static56.anInt1607 + 1) % 100;
										@Pc(3222) Class41 local3222 = Static24.method792(Static19.method349(Static204.aClass2_Sub3_Sub1_3).method1411());
										if (local392 == 2 || local392 == 3) {
											Static198.method3075(local3222, 7, Static149.method2324(new Class41[] { Static26.aClass41_175, Static176.method2837(local1411).method1403() }));
										} else if (local392 == 1) {
											Static198.method3075(local3222, 7, Static149.method2324(new Class41[] { Static149.aClass41_932, Static176.method2837(local1411).method1403() }));
										} else {
											Static198.method3075(local3222, 3, Static176.method2837(local1411).method1403());
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 237) {
									Static60.anInt4778 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static9.anInt341 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static113.anInt2749 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 96) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method205();
									if (local123 == 65535) {
										local123 = -1;
									}
									local127 = Static204.aClass2_Sub3_Sub1_3.method161();
									local506 = Static212.method3256(local127);
									if (local506.anInt3665 != 1 || local123 != local506.anInt3651) {
										local506.anInt3665 = 1;
										local506.anInt3651 = local123;
										Static176.method2833(local506);
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 149) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method164();
									local127 = Static204.aClass2_Sub3_Sub1_3.method181();
									local215 = Static204.aClass2_Sub3_Sub1_3.method163();
									@Pc(3377) Class12_Sub3_Sub2 local3377 = Static199.aClass12_Sub3_Sub2Array1[local215];
									if (local3377 != null) {
										Static126.method2065(local123, local127, local3377);
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 248) {
									for (local123 = 0; local123 < Static216.aClass12_Sub3_Sub1Array1.length; local123++) {
										if (Static216.aClass12_Sub3_Sub1Array1[local123] != null) {
											Static216.aClass12_Sub3_Sub1Array1[local123].anInt3910 = -1;
										}
									}
									for (local127 = 0; local127 < Static199.aClass12_Sub3_Sub2Array1.length; local127++) {
										if (Static199.aClass12_Sub3_Sub2Array1[local127] != null) {
											Static199.aClass12_Sub3_Sub2Array1[local127].anInt3910 = -1;
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 187) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									local215 = Static204.aClass2_Sub3_Sub1_3.method163();
									@Pc(3459) Class41 local3459 = Static151.method2358(local215).method2894(Static204.aClass2_Sub3_Sub1_3);
									Static104.method1777(local3459, local215, Static176.method2837(local1411).method1403(), 19, null);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 177) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method182();
									Static45.aClass75_2 = Static111.aClass83_2.method2623(local123);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 88) {
									Static107.anInt2598 = Static204.aClass2_Sub3_Sub1_3.method181();
									Static135.anInt3148 = Static204.aClass2_Sub3_Sub1_3.method157();
									for (local123 = Static107.anInt2598; local123 < Static107.anInt2598 + 8; local123++) {
										for (local127 = Static135.anInt3148; local127 < Static135.anInt3148 + 8; local127++) {
											if (Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local123][local127] != null) {
												Static119.aClass108ArrayArrayArray1[Static134.anInt3147][local123][local127] = null;
												Static27.method1632(local123, local127);
											}
										}
									}
									for (@Pc(3550) Class2_Sub20 local3550 = (Class2_Sub20) Static56.aClass108_4.method3322(); local3550 != null; local3550 = (Class2_Sub20) Static56.aClass108_4.method3331()) {
										if (Static107.anInt2598 <= local3550.anInt3289 && local3550.anInt3289 < Static107.anInt2598 + 8 && Static135.anInt3148 <= local3550.anInt3282 && local3550.anInt3282 < Static135.anInt3148 + 8 && local3550.anInt3285 == Static134.anInt3147) {
											local3550.anInt3291 = 0;
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 203) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									local652 = Static204.aClass2_Sub3_Sub1_3.method163();
									local2875 = Static204.aClass2_Sub3_Sub1_3.method166();
									local392 = Static204.aClass2_Sub3_Sub1_3.method209();
									local396 = Static204.aClass2_Sub3_Sub1_3.method163();
									@Pc(3629) long local3629 = local2875 + (local652 << 32);
									@Pc(3631) boolean local3631 = false;
									local2610 = 0;
									label1401: while (true) {
										if (local2610 >= 100) {
											if (local392 <= 1) {
												for (local2895 = 0; local2895 < Static60.anInt4785; local2895++) {
													if (local1411 == Static83.aLongArray6[local2895]) {
														local3631 = true;
														break label1401;
													}
												}
											}
											break;
										}
										if (local3629 == Static150.aLongArray9[local2610]) {
											local3631 = true;
											break;
										}
										local2610++;
									}
									if (!local3631 && Static31.anInt806 == 0) {
										Static150.aLongArray9[Static56.anInt1607] = local3629;
										Static56.anInt1607 = (Static56.anInt1607 + 1) % 100;
										@Pc(3704) Class41 local3704 = Static151.method2358(local396).method2894(Static204.aClass2_Sub3_Sub1_3);
										if (local392 == 2) {
											Static104.method1777(local3704, local396, Static149.method2324(new Class41[] { Static26.aClass41_175, Static176.method2837(local1411).method1403() }), 18, null);
										} else if (local392 == 1) {
											Static104.method1777(local3704, local396, Static149.method2324(new Class41[] { Static149.aClass41_932, Static176.method2837(local1411).method1403() }), 18, null);
										} else {
											Static104.method1777(local3704, local396, Static176.method2837(local1411).method1403(), 18, null);
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 17) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method185();
									local127 = Static204.aClass2_Sub3_Sub1_3.method163();
									if (local123 < -70000) {
										local127 += 32768;
									}
									if (local123 < 0) {
										local506 = null;
									} else {
										local506 = Static212.method3256(local123);
									}
									while (Static204.aClass2_Sub3_Sub1_3.anInt239 < Static202.anInt1733) {
										local288 = Static204.aClass2_Sub3_Sub1_3.method212();
										local310 = Static204.aClass2_Sub3_Sub1_3.method163();
										local314 = 0;
										if (local310 != 0) {
											local314 = Static204.aClass2_Sub3_Sub1_3.method209();
											if (local314 == 255) {
												local314 = Static204.aClass2_Sub3_Sub1_3.method185();
											}
										}
										if (local506 != null && local288 >= 0 && local288 < local506.anIntArray380.length) {
											local506.anIntArray380[local288] = local310;
											local506.anIntArray390[local288] = local314;
										}
										Static159.method2580(local127, local314, local288, local310 - 1);
									}
									if (local506 != null) {
										Static176.method2833(local506);
									}
									Static112.method1912();
									Static205.anIntArray472[Static198.anInt4445++ & 0x1F] = local127 & 0x7FFF;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 11) {
									@Pc(3907) byte local3907 = Static204.aClass2_Sub3_Sub1_3.method197();
									local127 = Static204.aClass2_Sub3_Sub1_3.method164();
									Static151.anIntArray351[local127] = local3907;
									if (local3907 != Static99.anIntArray243[local127]) {
										Static99.anIntArray243[local127] = local3907;
										Static143.method2234(local127);
									}
									Static216.anIntArray492[Static200.anInt4494++ & 0x1F] = local127;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 100) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method185();
									local1777 = Static212.method3256(local123);
									local1777.anInt3665 = 3;
									local1777.anInt3651 = Static213.aClass12_Sub3_Sub1_1.aClass91_1.method2927();
									Static176.method2833(local1777);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 25) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method185();
									local127 = Static204.aClass2_Sub3_Sub1_3.method163();
									local215 = Static204.aClass2_Sub3_Sub1_3.method209();
									local141 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local123);
									if (local141 != null) {
										Static81.method1471(local141, local141.anInt3435 != local127);
									}
									Static91.method1602(local215, local123, local127);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 10) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method205();
									if (local123 == 65535) {
										local123 = -1;
									}
									Static102.method1754(local123);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 89) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method164();
									if (local123 == 65535) {
										local123 = -1;
									}
									local127 = Static204.aClass2_Sub3_Sub1_3.method202();
									Static4.method84(local123, local127);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 66) {
									@Pc(4071) byte[] local4071 = new byte[Static202.anInt1733];
									Static204.aClass2_Sub3_Sub1_3.method220(Static202.anInt1733, local4071);
									Static148.method2322(Static49.method967(0, local4071, Static202.anInt1733));
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 53) {
									local632 = Static204.aClass2_Sub3_Sub1_3.method160();
									@Pc(4104) Object[] local4104 = new Object[local632.method1393() + 1];
									for (local215 = local632.method1393() - 1; local215 >= 0; local215--) {
										if (local632.method1388(local215) == 115) {
											local4104[local215 + 1] = Static204.aClass2_Sub3_Sub1_3.method160();
										} else {
											local4104[local215 + 1] = Integer.valueOf(Static204.aClass2_Sub3_Sub1_3.method185());
										}
									}
									local4104[0] = Integer.valueOf(Static204.aClass2_Sub3_Sub1_3.method185());
									@Pc(4160) Class2_Sub5 local4160 = new Class2_Sub5();
									local4160.anObjectArray3 = local4104;
									Static176.method2835(local4160);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 229) {
									Static67.anInt1765 = Static60.anInt4782;
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									if (local1411 == 0L) {
										Static43.anInt1296 = 0;
										Static197.aClass41_1170 = null;
										Static199.aClass41_1186 = null;
										Static211.anInt4701 = -1;
										Static77.aClass2_Sub10Array1 = null;
										return true;
									}
									local652 = Static204.aClass2_Sub3_Sub1_3.method183();
									Static197.aClass41_1170 = Static176.method2837(local652);
									Static199.aClass41_1186 = Static176.method2837(local1411);
									Static152.aByte10 = Static204.aClass2_Sub3_Sub1_3.method186();
									local310 = Static204.aClass2_Sub3_Sub1_3.method209();
									if (local310 == 255) {
										Static211.anInt4701 = -1;
										return true;
									}
									Static43.anInt1296 = local310;
									@Pc(4227) Class2_Sub10[] local4227 = new Class2_Sub10[100];
									for (local392 = 0; local392 < Static43.anInt1296; local392++) {
										local4227[local392] = new Class2_Sub10();
										local4227[local392].aLong150 = Static204.aClass2_Sub3_Sub1_3.method183();
										local4227[local392].aClass41_532 = Static176.method2837(local4227[local392].aLong150);
										local4227[local392].anInt1691 = Static204.aClass2_Sub3_Sub1_3.method163();
										local4227[local392].aByte2 = Static204.aClass2_Sub3_Sub1_3.method186();
										local4227[local392].aClass41_530 = Static204.aClass2_Sub3_Sub1_3.method160();
										if (Static34.aLong23 == local4227[local392].aLong150) {
											Static128.aByte7 = local4227[local392].aByte2;
										}
									}
									local2563 = Static43.anInt1296;
									while (local2563 > 0) {
										local2563--;
										@Pc(4308) boolean local4308 = true;
										for (local2570 = 0; local2570 < local2563; local2570++) {
											if (local4227[local2570].aClass41_532.method1414(local4227[local2570 + 1].aClass41_532) > 0) {
												@Pc(4332) Class2_Sub10 local4332 = local4227[local2570];
												local4308 = false;
												local4227[local2570] = local4227[local2570 + 1];
												local4227[local2570 + 1] = local4332;
											}
										}
										if (local4308) {
											break;
										}
									}
									Static77.aClass2_Sub10Array1 = local4227;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 129) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									Static204.aClass2_Sub3_Sub1_3.method186();
									local652 = Static204.aClass2_Sub3_Sub1_3.method183();
									local2875 = Static204.aClass2_Sub3_Sub1_3.method163();
									local2880 = Static204.aClass2_Sub3_Sub1_3.method166();
									@Pc(4401) long local4401 = local2880 + (local2875 << 32);
									local398 = Static204.aClass2_Sub3_Sub1_3.method209();
									local2563 = Static204.aClass2_Sub3_Sub1_3.method163();
									@Pc(4411) boolean local4411 = false;
									local2936 = 0;
									label1447: while (true) {
										if (local2936 >= 100) {
											if (local398 <= 1) {
												for (@Pc(4438) int local4438 = 0; local4438 < Static60.anInt4785; local4438++) {
													if (local1411 == Static83.aLongArray6[local4438]) {
														local4411 = true;
														break label1447;
													}
												}
											}
											break;
										}
										if (local4401 == Static150.aLongArray9[local2936]) {
											local4411 = true;
											break;
										}
										local2936++;
									}
									if (!local4411 && Static31.anInt806 == 0) {
										Static150.aLongArray9[Static56.anInt1607] = local4401;
										Static56.anInt1607 = (Static56.anInt1607 + 1) % 100;
										local2646 = Static151.method2358(local2563).method2894(Static204.aClass2_Sub3_Sub1_3);
										if (local398 == 2 || local398 == 3) {
											Static104.method1777(local2646, local2563, Static149.method2324(new Class41[] { Static26.aClass41_175, Static176.method2837(local1411).method1403() }), 20, Static176.method2837(local652).method1403());
										} else if (local398 == 1) {
											Static104.method1777(local2646, local2563, Static149.method2324(new Class41[] { Static149.aClass41_932, Static176.method2837(local1411).method1403() }), 20, Static176.method2837(local652).method1403());
										} else {
											Static104.method1777(local2646, local2563, Static176.method2837(local1411).method1403(), 20, Static176.method2837(local652).method1403());
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 166) {
									if (Static39.anInt1055 != -1) {
										Static122.method2038(Static39.anInt1055, 0);
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 21) {
									Static39.method822(true);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 233) {
									local632 = Static204.aClass2_Sub3_Sub1_3.method160();
									local127 = Static204.aClass2_Sub3_Sub1_3.method209();
									local215 = Static204.aClass2_Sub3_Sub1_3.method209();
									if (local127 >= 1 && local127 <= 8) {
										if (local632.method1413(Static161.aClass41_1008)) {
											local632 = null;
										}
										Static115.aClass41Array60[local127 - 1] = local632;
										Static179.aBooleanArray21[local127 - 1] = local215 == 0;
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 70) {
									for (local123 = 0; local123 < Static26.anInt657; local123++) {
										@Pc(4664) Class2_Sub2_Sub24 local4664 = Static93.method1626(local123);
										if (local4664 != null && local4664.anInt4535 == 0) {
											Static151.anIntArray351[local123] = 0;
											Static99.anIntArray243[local123] = 0;
										}
									}
									Static112.method1912();
									Static200.anInt4494 += 32;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 123 || Static211.anInt4701 == 52 || Static211.anInt4701 == 232 || Static211.anInt4701 == 61 || Static211.anInt4701 == 135 || Static211.anInt4701 == 173 || Static211.anInt4701 == 150 || Static211.anInt4701 == 198 || Static211.anInt4701 == 99 || Static211.anInt4701 == 171 || Static211.anInt4701 == 75 || Static211.anInt4701 == 44) {
									Static216.method3290();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 120) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method211();
									local127 = Static204.aClass2_Sub3_Sub1_3.method211();
									local215 = Static204.aClass2_Sub3_Sub1_3.method175();
									local288 = Static204.aClass2_Sub3_Sub1_3.method205();
									local171 = Static212.method3256(local215);
									if (local288 != local171.anInt3674 || local171.anInt3700 != local127 || local123 != local171.anInt3686) {
										local171.anInt3700 = local127;
										local171.anInt3686 = local123;
										local171.anInt3674 = local288;
										Static176.method2833(local171);
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 54) {
									Static112.method1912();
									Static175.anInt4104 = Static204.aClass2_Sub3_Sub1_3.method196();
									Static184.anInt4240 = Static60.anInt4782;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 114) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method209();
									local127 = Static204.aClass2_Sub3_Sub1_3.method214();
									local215 = Static204.aClass2_Sub3_Sub1_3.method157();
									Static134.anInt3147 = local123 >> 1;
									Static213.aClass12_Sub3_Sub1_1.method2722((local123 & 0x1) == 1, local215, local127);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 162) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method161();
									local127 = Static204.aClass2_Sub3_Sub1_3.method201();
									local506 = Static212.method3256(local123);
									if (local127 != local506.anInt3647 || local127 == -1) {
										local506.anInt3647 = local127;
										local506.anInt3687 = 0;
										local506.anInt3634 = 0;
										Static176.method2833(local506);
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 163) {
									Static107.anInt2598 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static135.anInt3148 = Static204.aClass2_Sub3_Sub1_3.method181();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 116) {
									Static30.method566();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 223) {
									Static160.aBoolean233 = true;
									Static42.anInt254 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static21.anInt4633 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static59.anInt1641 = Static204.aClass2_Sub3_Sub1_3.method163();
									Static8.anInt336 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static131.anInt3004 = Static204.aClass2_Sub3_Sub1_3.method209();
									if (Static131.anInt3004 >= 100) {
										local123 = Static42.anInt254 * 128 + 64;
										local127 = Static21.anInt4633 * 128 + 64;
										local215 = Static212.method3261(local123, local127, Static134.anInt3147) - Static59.anInt1641;
										local288 = local123 - Static69.anInt1817;
										local314 = local127 - Static163.anInt3822;
										local310 = local215 - Static94.anInt2320;
										local392 = (int) Math.sqrt((double) (local288 * local288 + local314 * local314));
										Static183.anInt1325 = (int) (Math.atan2((double) local310, (double) local392) * 325.949D) & 0x7FF;
										Static152.anInt3512 = (int) (-325.949D * Math.atan2((double) local288, (double) local314)) & 0x7FF;
										if (Static183.anInt1325 < 128) {
											Static183.anInt1325 = 128;
										}
										if (Static183.anInt1325 > 383) {
											Static183.anInt1325 = 383;
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 241) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method163();
									Static133.method2118(local123);
									Static205.anIntArray472[Static198.anInt4445++ & 0x1F] = local123 & 0x7FFF;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 147) {
									Static219.anInt4791 = Static204.aClass2_Sub3_Sub1_3.method209();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 243) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method205();
									local127 = Static204.aClass2_Sub3_Sub1_3.method211();
									Static57.anInt1618 = local123;
									Static183.anInt1324 = local127;
									Static121.method3318();
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 189) {
									Static32.aShort9 = (short) Static204.aClass2_Sub3_Sub1_3.method163();
									if (Static32.aShort9 <= 0) {
										Static32.aShort9 = 256;
									}
									Static45.aShort15 = (short) Static204.aClass2_Sub3_Sub1_3.method211();
									Static211.anInt4701 = -1;
									if (Static45.aShort15 <= 0) {
										Static45.aShort15 = 205;
									}
									return true;
								} else if (Static211.anInt4701 == 220) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method175();
									local127 = Static204.aClass2_Sub3_Sub1_3.method211();
									local506 = Static212.method3256(local123);
									if (local506 != null && local506.anInt3640 == 0) {
										if (local506.anInt3632 - local506.anInt3660 < local127) {
											local127 = local506.anInt3632 - local506.anInt3660;
										}
										if (local127 < 0) {
											local127 = 0;
										}
										if (local506.anInt3655 != local127) {
											local506.anInt3655 = local127;
											Static176.method2833(local506);
										}
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 4) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method164();
									local127 = Static204.aClass2_Sub3_Sub1_3.method163();
									local215 = Static204.aClass2_Sub3_Sub1_3.method182();
									local219 = Static212.method3256(local215);
									Static211.anInt4701 = -1;
									local219.anInt3638 = (local127 << 16) + local123;
									return true;
								} else if (Static211.anInt4701 == 197) {
									Static145.aShort48 = (short) Static204.aClass2_Sub3_Sub1_3.method164();
									if (Static145.aShort48 <= 0) {
										Static145.aShort48 = 320;
									}
									Static196.aShort57 = (short) Static204.aClass2_Sub3_Sub1_3.method211();
									Static211.anInt4701 = -1;
									if (Static196.aShort57 <= 0) {
										Static196.aShort57 = 256;
									}
									return true;
								} else if (Static211.anInt4701 == 113) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method163();
									local127 = Static204.aClass2_Sub3_Sub1_3.method209();
									local215 = Static204.aClass2_Sub3_Sub1_3.method163();
									if (local123 == 65535) {
										local123 = -1;
									}
									Static80.method1467(local127, local215, local123);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 242) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method185();
									@Pc(5311) Class2_Sub21 local5311 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local123);
									if (local5311 != null) {
										Static81.method1471(local5311, true);
									}
									if (Static48.aClass80_5 != null) {
										Static176.method2833(Static48.aClass80_5);
										Static48.aClass80_5 = null;
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 72) {
									local123 = Static204.aClass2_Sub3_Sub1_3.method211();
									local127 = Static204.aClass2_Sub3_Sub1_3.method161();
									Static151.anIntArray351[local123] = local127;
									if (Static99.anIntArray243[local123] != local127) {
										Static99.anIntArray243[local123] = local127;
										Static143.method2234(local123);
									}
									Static216.anIntArray492[Static200.anInt4494++ & 0x1F] = local123;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 65) {
									Static46.aShort54 = (short) Static204.aClass2_Sub3_Sub1_3.method163();
									if (Static46.aShort54 <= 0) {
										Static46.aShort54 = 32767;
									} else if (Static46.aShort54 < Static121.aShort65) {
										Static46.aShort54 = Static121.aShort65;
									}
									Static76.aShort8 = (short) Static204.aClass2_Sub3_Sub1_3.method205();
									if (Static76.aShort8 <= 0) {
										Static76.aShort8 = 1;
									}
									Static197.aShort58 = (short) Static204.aClass2_Sub3_Sub1_3.method205();
									if (Static197.aShort58 <= 0) {
										Static197.aShort58 = 32767;
									} else if (Static197.aShort58 < Static76.aShort8) {
										Static197.aShort58 = Static76.aShort8;
									}
									Static121.aShort65 = (short) Static204.aClass2_Sub3_Sub1_3.method164();
									if (Static121.aShort65 <= 0) {
										Static121.aShort65 = 1;
									}
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 240) {
									Static101.method1732();
									Static211.anInt4701 = -1;
									return false;
								} else if (Static211.anInt4701 == 204) {
									Static112.method1912();
									local123 = Static204.aClass2_Sub3_Sub1_3.method157();
									local127 = Static204.aClass2_Sub3_Sub1_3.method181();
									local215 = Static204.aClass2_Sub3_Sub1_3.method175();
									Static160.anIntArray398[local123] = local215;
									Static92.anIntArray228[local123] = local127;
									Static192.anIntArray452[local123] = 1;
									for (local288 = 0; local288 < 98; local288++) {
										if (local215 >= Class2_Sub13.anIntArray199[local288]) {
											Static192.anIntArray452[local123] = local288 + 2;
										}
									}
									Static128.anIntArray318[Static104.anInt2519++ & 0x1F] = local123;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 255) {
									Static102.anInt2490 = 0;
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 172) {
									local1411 = Static204.aClass2_Sub3_Sub1_3.method183();
									@Pc(5535) Class41 local5535 = Static24.method792(Static19.method349(Static204.aClass2_Sub3_Sub1_3).method1411());
									Static198.method3075(local5535, 6, Static176.method2837(local1411).method1403());
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 110) {
									Static204.method3148(Static111.aClass83_2, Static202.anInt1733, Static204.aClass2_Sub3_Sub1_3);
									Static211.anInt4701 = -1;
									return true;
								} else if (Static211.anInt4701 == 184) {
									Static100.anInt2441 = Static204.aClass2_Sub3_Sub1_3.method205() * 30;
									Static211.anInt4701 = -1;
									Static184.anInt4240 = Static60.anInt4782;
									return true;
								} else {
									Static196.method3064("T1 - " + Static211.anInt4701 + "," + Static42.anInt229 + "," + Static77.anInt1991 + " - " + Static202.anInt1733, null);
									Static101.method1732();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}
}
