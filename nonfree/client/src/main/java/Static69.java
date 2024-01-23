import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public static int anInt1314;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!hh;")
	public static Class50 aClass50_479 = Static186.method3527(" loggt sich ein)3");

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public static int anInt1317 = 0;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_480 = Static186.method3527("::gc");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIJILclient!hh;)V")
	public static void method1010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class50 arg5) {
		@Pc(8) Class1_Sub17 local8 = new Class1_Sub17(128);
		local8.method2175(10);
		local8.method2151((int) (Math.random() * 99999.0D));
		local8.method2151(506);
		local8.method2171(arg3);
		local8.method2124((int) (Math.random() * 9.9999999E7D));
		local8.method2174(arg5);
		local8.method2124((int) (Math.random() * 9.9999999E7D));
		local8.method2151(Static107.anInt2137);
		local8.method2175(arg4);
		local8.method2175(arg1);
		local8.method2124((int) (Math.random() * 9.9999999E7D));
		local8.method2151(arg2);
		local8.method2151(arg0);
		local8.method2124((int) (Math.random() * 9.9999999E7D));
		local8.method2170(Static34.aBigInteger1, Static201.aBigInteger4);
		Static32.aClass1_Sub17_Sub1_1.anInt2656 = 0;
		Static32.aClass1_Sub17_Sub1_1.method2175(67);
		Static32.aClass1_Sub17_Sub1_1.method2175(local8.anInt2656);
		Static32.aClass1_Sub17_Sub1_1.method2158(local8.aByteArray40, local8.anInt2656);
		Static109.anInt2170 = 0;
		Static151.anInt3156 = -3;
		Static2.anInt52 = 1;
		Static12.anInt241 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3 * arg3;
		@Pc(13) int local13 = arg1;
		@Pc(17) int local17 = local11 << 1;
		@Pc(21) int local21 = arg1 << 1;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = local11 << 2;
		@Pc(38) int local38 = local25 - local17 * (local21 - 1);
		@Pc(42) int local42 = local25 << 1;
		@Pc(52) int local52 = local11 * (1 - local21) + local42;
		@Pc(56) int local56 = local25 << 2;
		@Pc(64) int local64 = local42 * 3;
		@Pc(72) int local72 = ((arg1 << 1) - 3) * local17;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (arg2 >= Static49.anInt1030 && Static177.anInt3701 >= arg2) {
			local90 = Static92.method1433(Static131.anInt2713, arg3 + arg0, Static135.anInt2790);
			local99 = Static92.method1433(Static131.anInt2713, arg0 - arg3, Static135.anInt2790);
			Static107.method1641(local99, arg4, Static139.anIntArrayArray21[arg2], local90);
		}
		@Pc(124) int local124 = local56;
		@Pc(130) int local130 = (arg1 - 1) * local29;
		while (local13 > 0) {
			local13--;
			if (local52 < 0) {
				while (local52 < 0) {
					local38 += local124;
					local7++;
					local52 += local64;
					local64 += local56;
					local124 += local56;
				}
			}
			if (local38 < 0) {
				local7++;
				local38 += local124;
				local124 += local56;
				local52 += local64;
				local64 += local56;
			}
			local38 += -local72;
			local72 -= local29;
			local90 = arg2 - local13;
			local52 += -local130;
			local99 = arg2 + local13;
			if (Static49.anInt1030 <= local99 && local90 <= Static177.anInt3701) {
				@Pc(225) int local225 = Static92.method1433(Static131.anInt2713, local7 + arg0, Static135.anInt2790);
				@Pc(233) int local233 = Static92.method1433(Static131.anInt2713, arg0 - local7, Static135.anInt2790);
				if (Static49.anInt1030 <= local90) {
					Static107.method1641(local233, arg4, Static139.anIntArrayArray21[local90], local225);
				}
				if (Static177.anInt3701 >= local99) {
					Static107.method1641(local233, arg4, Static139.anIntArrayArray21[local99], local225);
				}
			}
			local130 -= local29;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	public static boolean method1012() {
		@Pc(8) long local8 = Static179.method2941();
		@Pc(14) int local14 = (int) (local8 - Static52.aLong131);
		if (local14 > 200) {
			local14 = 200;
		}
		Static52.aLong131 = local8;
		Static28.anInt546 += local14;
		if (Static152.anInt3164 == 0 && Static118.anInt2316 == 0 && Static212.anInt4194 == 0 && Static65.anInt4133 == 0) {
			return true;
		} else if (Static9.aClass26_1 == null) {
			return false;
		} else {
			try {
				if (Static28.anInt546 > 30000) {
					throw new IOException();
				}
				@Pc(71) Class1_Sub1_Sub14 local71;
				@Pc(76) Class1_Sub17 local76;
				while (Static118.anInt2316 < 20 && Static65.anInt4133 > 0) {
					local71 = (Class1_Sub1_Sub14) Static112.aClass90_9.method2823();
					local76 = new Class1_Sub17(4);
					local76.method2175(1);
					local76.method2133((int) local71.aLong173);
					Static9.aClass26_1.method781(local76.aByteArray40, 4);
					Static23.aClass90_5.method2817(local71, local71.aLong173);
					Static118.anInt2316++;
					Static65.anInt4133--;
				}
				while (Static152.anInt3164 < 20 && Static212.anInt4194 > 0) {
					local71 = (Class1_Sub1_Sub14) Static212.aClass121_5.method3380();
					local76 = new Class1_Sub17(4);
					local76.method2175(0);
					local76.method2133((int) local71.aLong173);
					Static9.aClass26_1.method781(local76.aByteArray40, 4);
					local71.method3531();
					Static144.aClass90_15.method2817(local71, local71.aLong173);
					Static152.anInt3164++;
					Static212.anInt4194--;
				}
				for (@Pc(178) int local178 = 0; local178 < 100; local178++) {
					@Pc(184) int local184 = Static9.aClass26_1.method777();
					if (local184 < 0) {
						throw new IOException();
					}
					if (local184 == 0) {
						break;
					}
					Static28.anInt546 = 0;
					@Pc(199) byte local199 = 0;
					if (Static152.aClass1_Sub1_Sub14_1 == null) {
						local199 = 8;
					} else if (Static49.anInt1027 == 0) {
						local199 = 1;
					}
					@Pc(227) int local227;
					@Pc(219) int local219;
					@Pc(267) int local267;
					@Pc(418) int local418;
					if (local199 <= 0) {
						local219 = 512 - Static49.anInt1027;
						local227 = Static139.aClass1_Sub17_3.aByteArray40.length - Static152.aClass1_Sub1_Sub14_1.aByte7;
						if (local219 > local227 - Static139.aClass1_Sub17_3.anInt2656) {
							local219 = local227 - Static139.aClass1_Sub17_3.anInt2656;
						}
						if (local219 > local184) {
							local219 = local184;
						}
						Static9.aClass26_1.method779(Static139.aClass1_Sub17_3.aByteArray40, local219, Static139.aClass1_Sub17_3.anInt2656);
						if (Static34.aByte1 != 0) {
							for (local267 = 0; local267 < local219; local267++) {
								Static139.aClass1_Sub17_3.aByteArray40[local267 + Static139.aClass1_Sub17_3.anInt2656] ^= Static34.aByte1;
							}
						}
						Static49.anInt1027 += local219;
						Static139.aClass1_Sub17_3.anInt2656 += local219;
						if (Static139.aClass1_Sub17_3.anInt2656 == local227) {
							if (Static152.aClass1_Sub1_Sub14_1.aLong173 == 16711935L) {
								Static95.aClass1_Sub17_1 = Static139.aClass1_Sub17_3;
								for (local267 = 0; local267 < 256; local267++) {
									@Pc(405) Class86_Sub1 local405 = Static216.aClass86_Sub1Array1[local267];
									if (local405 != null) {
										Static95.aClass1_Sub17_1.anInt2656 = local267 * 8 + 5;
										local418 = Static95.aClass1_Sub17_1.method2140();
										@Pc(422) int local422 = Static95.aClass1_Sub17_1.method2140();
										local405.method3350(local422, local418);
									}
								}
							} else {
								Static234.aCRC32_2.reset();
								Static234.aCRC32_2.update(Static139.aClass1_Sub17_3.aByteArray40, 0, local227);
								local267 = (int) Static234.aCRC32_2.getValue();
								if (Static152.aClass1_Sub1_Sub14_1.anInt3107 != local267) {
									try {
										Static9.aClass26_1.method776();
									} catch (@Pc(351) Exception local351) {
									}
									Static156.anInt3211++;
									Static9.aClass26_1 = null;
									Static34.aByte1 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static165.anInt2647 = 0;
								Static156.anInt3211 = 0;
								Static152.aClass1_Sub1_Sub14_1.aClass86_Sub1_30.method3346((int) (Static152.aClass1_Sub1_Sub14_1.aLong173 & 0xFFFFL), Static105.aBoolean92, Static139.aClass1_Sub17_3.aByteArray40, (Static152.aClass1_Sub1_Sub14_1.aLong173 & 0xFF0000L) == 16711680L);
							}
							Static152.aClass1_Sub1_Sub14_1.method3525();
							if (Static105.aBoolean92) {
								Static118.anInt2316--;
							} else {
								Static152.anInt3164--;
							}
							Static152.aClass1_Sub1_Sub14_1 = null;
							Static49.anInt1027 = 0;
							Static139.aClass1_Sub17_3 = null;
						} else {
							if (Static49.anInt1027 != 512) {
								break;
							}
							Static49.anInt1027 = 0;
						}
					} else {
						local227 = local199 - Static100.aClass1_Sub17_2.anInt2656;
						if (local227 > local184) {
							local227 = local184;
						}
						Static9.aClass26_1.method779(Static100.aClass1_Sub17_2.aByteArray40, local227, Static100.aClass1_Sub17_2.anInt2656);
						if (Static34.aByte1 != 0) {
							for (local219 = 0; local219 < local227; local219++) {
								Static100.aClass1_Sub17_2.aByteArray40[Static100.aClass1_Sub17_2.anInt2656 + local219] ^= Static34.aByte1;
							}
						}
						Static100.aClass1_Sub17_2.anInt2656 += local227;
						if (Static100.aClass1_Sub17_2.anInt2656 < local199) {
							break;
						}
						if (Static152.aClass1_Sub1_Sub14_1 == null) {
							Static100.aClass1_Sub17_2.anInt2656 = 0;
							local219 = Static100.aClass1_Sub17_2.method2142();
							local267 = Static100.aClass1_Sub17_2.method2178();
							@Pc(542) int local542 = Static100.aClass1_Sub17_2.method2142();
							local418 = Static100.aClass1_Sub17_2.method2140();
							@Pc(553) long local553 = (long) (local267 + (local219 << 16));
							@Pc(563) Class1_Sub1_Sub14 local563 = (Class1_Sub1_Sub14) Static23.aClass90_5.method2819(local553);
							Static105.aBoolean92 = true;
							if (local563 == null) {
								local563 = (Class1_Sub1_Sub14) Static144.aClass90_15.method2819(local553);
								Static105.aBoolean92 = false;
							}
							if (local563 == null) {
								throw new IOException();
							}
							Static152.aClass1_Sub1_Sub14_1 = local563;
							@Pc(589) int local589 = local542 == 0 ? 5 : 9;
							Static139.aClass1_Sub17_3 = new Class1_Sub17(local589 + local418 + Static152.aClass1_Sub1_Sub14_1.aByte7);
							Static139.aClass1_Sub17_3.method2175(local542);
							Static139.aClass1_Sub17_3.method2124(local418);
							Static49.anInt1027 = 8;
							Static100.aClass1_Sub17_2.anInt2656 = 0;
						} else if (Static49.anInt1027 == 0) {
							if (Static100.aClass1_Sub17_2.aByteArray40[0] == -1) {
								Static49.anInt1027 = 1;
								Static100.aClass1_Sub17_2.anInt2656 = 0;
							} else {
								Static152.aClass1_Sub1_Sub14_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(646) IOException local646) {
				try {
					Static9.aClass26_1.method776();
				} catch (@Pc(651) Exception local651) {
				}
				Static165.anInt2647++;
				Static9.aClass26_1 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
	public static int method1013(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCF) >>> 2);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}
}
