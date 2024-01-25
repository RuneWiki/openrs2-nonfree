import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_20 = new Class198(8);

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
	public static final int anInt3246 = 50;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
	public static final int[] anIntArray289 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "[I")
	public static final int[] anIntArray290 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "[I")
	public static final int[] anIntArray291 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "[I")
	public static final int[] anIntArray292 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "[I")
	public static final int[] anIntArray293 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "[I")
	public static final int[] anIntArray294 = new int[anInt3246];

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[anInt3246];

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "[I")
	public static final int[] anIntArray295 = new int[2500];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vm;Lclient!al;B)V")
	public static void method2834(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Interface1 arg1) {
		if (Static42.aClass4_Sub1_Sub11_2 == null) {
			return;
		}
		if (Static38.anInt833 < 10) {
			if (!Static42.aClass11_50.method291(Static42.aClass4_Sub1_Sub11_2.aString102)) {
				Static38.anInt833 = Static150.aClass11_147.method304(Static42.aClass4_Sub1_Sub11_2.aString102) / 10;
				return;
			}
			Static313.method5252();
			Static38.anInt833 = 10;
		}
		if (Static38.anInt833 == 10) {
			Static42.anInt2441 = Static42.aClass4_Sub1_Sub11_2.anInt3051 >> 6 << 6;
			Static42.anInt2446 = Static42.aClass4_Sub1_Sub11_2.anInt3048 >> 6 << 6;
			Static42.anInt2439 = (Static42.aClass4_Sub1_Sub11_2.anInt3053 >> 6 << 6) + 64 - Static42.anInt2441;
			Static42.anInt2443 = (Static42.aClass4_Sub1_Sub11_2.anInt3047 >> 6 << 6) + 64 - Static42.anInt2446;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static42.aClass4_Sub1_Sub11_2.method2691(local74, (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465 >> 7) + Static10.anInt231, Static81.anInt1732 - -(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466 >> 7), Static279.anInt5645)) {
				local76 = local74[1] - Static42.anInt2446;
				local78 = local74[2] - Static42.anInt2441;
			}
			if (!Static294.aBoolean330 && local76 >= 0 && local76 < Static42.anInt2443 && local78 >= 0 && local78 < Static42.anInt2439) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static307.anInt3771 = local76;
				Static35.anInt732 = local78;
			} else if (Static270.anInt6617 == -1 || Static307.anInt3766 == -1) {
				Static42.aClass4_Sub1_Sub11_2.method2692(local74, Static42.aClass4_Sub1_Sub11_2.anInt3045 & 0x3FFF, Static42.aClass4_Sub1_Sub11_2.anInt3045 >> 14 & 0x3FFF);
				Static35.anInt732 = local74[2] - Static42.anInt2441;
				Static307.anInt3771 = local74[1] - Static42.anInt2446;
			} else {
				Static42.aClass4_Sub1_Sub11_2.method2692(local74, Static307.anInt3766, Static270.anInt6617);
				if (local74 != null) {
					Static307.anInt3771 = local74[1] - Static42.anInt2446;
					Static35.anInt732 = local74[2] - Static42.anInt2441;
				}
				Static307.anInt3766 = -1;
				Static270.anInt6617 = -1;
				Static294.aBoolean330 = false;
			}
			if (Static42.aClass4_Sub1_Sub11_2.anInt3043 == 37) {
				Static42.aFloat26 = 3.0F;
				Static42.aFloat25 = 3.0F;
			} else if (Static42.aClass4_Sub1_Sub11_2.anInt3043 == 50) {
				Static42.aFloat26 = 4.0F;
				Static42.aFloat25 = 4.0F;
			} else if (Static42.aClass4_Sub1_Sub11_2.anInt3043 == 75) {
				Static42.aFloat26 = 6.0F;
				Static42.aFloat25 = 6.0F;
			} else if (Static42.aClass4_Sub1_Sub11_2.anInt3043 == 100) {
				Static42.aFloat26 = 8.0F;
				Static42.aFloat25 = 8.0F;
			} else if (Static42.aClass4_Sub1_Sub11_2.anInt3043 == 200) {
				Static42.aFloat26 = 16.0F;
				Static42.aFloat25 = 16.0F;
			} else {
				Static42.aFloat26 = 8.0F;
				Static42.aFloat25 = 8.0F;
			}
			Static42.anInt2432 = (int) Static42.aFloat26 >> 1;
			Static42.aByteArrayArrayArray3 = Static316.method4686(Static42.anInt2432);
			Static18.method358();
			Static42.method2063();
			Static104.aClass130_159 = new Class130();
			Static179.aClass140_1 = new Class140();
			Static42.anInt2434 += (int) (Math.random() * 5.0D) - 2;
			if (Static42.anInt2434 < -8) {
				Static42.anInt2434 = -8;
			}
			Static42.anInt2433 += (int) (Math.random() * 5.0D) - 2;
			if (Static42.anInt2434 > 8) {
				Static42.anInt2434 = 8;
			}
			if (Static42.anInt2433 < -16) {
				Static42.anInt2433 = -16;
			}
			if (Static42.anInt2433 > 16) {
				Static42.anInt2433 = 16;
			}
			Static42.method2061(arg1, Static42.anInt2434 >> 2 << 10, Static42.anInt2433 >> 1);
			Static167.method3168(1024, 256);
			Static325.method5349(256, 256);
			Static316.method4685(4096);
			Static330.method5404(256);
			Static38.anInt833 = 20;
		} else if (Static38.anInt833 == 20) {
			Static59.method1049(true);
			Static42.method2046(arg0, Static42.anInt2434, Static42.anInt2433);
			Static38.anInt833 = 60;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 60) {
			if (Static42.aClass11_50.method282(Static42.aClass4_Sub1_Sub11_2.aString102 + "_staticelements")) {
				if (!Static42.aClass11_50.method291(Static42.aClass4_Sub1_Sub11_2.aString102 + "_staticelements")) {
					return;
				}
				Static42.aClass158_2 = Static123.method2468(Static42.aClass4_Sub1_Sub11_2.aString102 + "_staticelements", Static42.aClass11_50, Static197.aBoolean352);
			} else {
				Static42.aClass158_2 = new Class158(0);
			}
			Static42.method2053();
			Static38.anInt833 = 70;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 70) {
			Static170.aClass147_5 = new Class147(arg0, 11, true, Static101.aCanvas8);
			Static38.anInt833 = 73;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 73) {
			Static292.aClass147_8 = new Class147(arg0, 12, true, Static101.aCanvas8);
			Static38.anInt833 = 76;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 76) {
			Static135.aClass147_4 = new Class147(arg0, 14, true, Static101.aCanvas8);
			Static38.anInt833 = 79;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 79) {
			Static120.aClass147_2 = new Class147(arg0, 17, true, Static101.aCanvas8);
			Static38.anInt833 = 82;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 82) {
			Static127.aClass147_3 = new Class147(arg0, 19, true, Static101.aCanvas8);
			Static38.anInt833 = 85;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 85) {
			Static84.aClass147_1 = new Class147(arg0, 22, true, Static101.aCanvas8);
			Static38.anInt833 = 88;
			Static59.method1049(true);
			Static304.method5144();
		} else if (Static38.anInt833 == 88) {
			Static270.aClass147_9 = new Class147(arg0, 26, true, Static101.aCanvas8);
			Static38.anInt833 = 91;
			Static59.method1049(true);
			Static304.method5144();
		} else {
			Static282.aClass147_7 = new Class147(arg0, 30, true, Static101.aCanvas8);
			Static38.anInt833 = 100;
			Static59.method1049(true);
			Static304.method5144();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLclient!io;)J")
	public static long method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface5 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(14) long local14 = Long.MIN_VALUE;
		@Pc(20) Class56 local20 = Static320.method5290(arg2.method4729());
		@Pc(41) long local41 = (long) (arg0 | 0x40000000 | arg1 << 7 | arg2.method4733() << 14 | arg2.method4734() << 20);
		if (local20.anInt1336 == 0) {
			local41 |= local14;
		}
		if (local20.anInt1354 == 1) {
			local41 |= local5;
		}
		if (local20.aBoolean108) {
			local41 |= local7;
		}
		return local41 | (long) arg2.method4729() << 32;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vm;IILclient!ib;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2839(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static84.aClass92_1 = arg0;
		Static207.anInt4343 = arg1;
		Static241.aClass23_3 = arg3;
		Static147.aBoolean277 = Static84.aClass92_1.method4499() > 0;
		Static307.anInt3770 = arg4 >> 7;
		Static178.anInt6542 = arg6 >> 7;
		Static269.anInt5510 = arg4;
		Static241.anInt5032 = arg6;
		Static224.anInt4687 = arg5;
		Static151.anInt3337 = Static307.anInt3770 - Static226.anInt4752;
		if (Static151.anInt3337 < 0) {
			Static139.anInt3136 = -Static151.anInt3337;
			Static151.anInt3337 = 0;
		} else {
			Static139.anInt3136 = 0;
		}
		Static349.anInt6795 = Static178.anInt6542 - Static226.anInt4752;
		if (Static349.anInt6795 < 0) {
			Static28.anInt5939 = -Static349.anInt6795;
			Static349.anInt6795 = 0;
		} else {
			Static28.anInt5939 = 0;
		}
		Static118.anInt2543 = Static307.anInt3770 + Static226.anInt4752;
		if (Static118.anInt2543 > Static151.anInt3338) {
			Static118.anInt2543 = Static151.anInt3338;
		}
		Static259.anInt5346 = Static178.anInt6542 + Static226.anInt4752;
		if (Static259.anInt5346 > Static220.anInt4569) {
			Static259.anInt5346 = Static220.anInt4569;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static226.anInt4752 + Static226.anInt4752 + 2; local74++) {
			for (local77 = 0; local77 < Static226.anInt4752 + Static226.anInt4752 + 2; local77++) {
				local84 = Static307.anInt3770 + local74 - Static226.anInt4752;
				local90 = Static178.anInt6542 + local77 - Static226.anInt4752;
				if (local84 >= 0 && local90 >= 0 && local84 < Static151.anInt3338 && local90 < Static220.anInt4569) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static310.aClass26Array4[3].method4996(local84, local90) - 1000;
					@Pc(137) int local137 = Static5.aClass26Array1 == null ? Static310.aClass26Array4[0].method4996(local84, local90) + 128 : Static5.aClass26Array1[0].method4996(local84, local90) + 128;
					Static47.aBooleanArrayArray2[local74][local77] = Static84.aClass92_1.method4449(local104, local117, local108, local104, local137, local108);
				} else {
					Static47.aBooleanArrayArray2[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static226.anInt4752 + Static226.anInt4752 + 1; local77++) {
			for (local84 = 0; local84 < Static226.anInt4752 + Static226.anInt4752 + 1; local84++) {
				Static248.aBooleanArrayArray4[local77][local84] = Static47.aBooleanArrayArray2[local77][local84] || Static47.aBooleanArrayArray2[local77 + 1][local84] || Static47.aBooleanArrayArray2[local77][local84 + 1] || Static47.aBooleanArrayArray2[local77 + 1][local84 + 1];
			}
		}
		Static192.anIntArray354 = arg8;
		Static219.anIntArray378 = arg9;
		Static254.anIntArray432 = arg10;
		Static173.anIntArray333 = arg11;
		Static272.anIntArray452 = arg12;
		Static144.method2827();
		Static171.method3207();
		for (@Pc(253) Class17_Sub2 local253 = (Class17_Sub2) Static315.aClass204_4.method5359(); local253 != null; local253 = (Class17_Sub2) Static315.aClass204_4.method5357()) {
			local253.method5473();
			Static295.method5019(local253);
		}
		if (Static147.aBoolean277) {
			for (local90 = 0; local90 < Static161.anInt3632; local90++) {
				Static126.aClass4_Sub12_Sub1Array1[local90].method5112(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static84.aClass92_1.method4511(0);
			if (Static54.aClass80_1 == null || Static54.aClass80_1 instanceof Class80_Sub1) {
				Static54.aClass80_1 = new Class80_Sub2();
			}
		} else if (Static54.aClass80_1 == null || Static54.aClass80_1 instanceof Class80_Sub2) {
			Static54.aClass80_1 = new Class80_Sub1();
		}
		Static54.aClass80_1.method5711(arg2);
		Static54.aClass80_1.method5703();
		if (Static237.aClass57ArrayArrayArray2 != null) {
			Static229.method3925(true);
			Static54.aClass80_1.method5702(22);
			Static348.method5639(arg2, null, 0, (byte) 0, arg15, arg16);
			Static54.aClass80_1.method5703();
			Static54.aClass80_1.method5702(23);
			Static229.method3925(false);
		}
		Static348.method5639(arg2, arg7, arg13, arg14, arg15, arg16);
		Static54.aClass80_1.method5703();
		Static54.aClass80_1.method5701();
		Static54.aClass80_1.method5703();
		if (arg2 > 1) {
			Static84.aClass92_1.method4514(0);
		}
		Static84.aClass92_1.method4445(0, null);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method2840(@OriginalArg(1) Class4_Sub7 arg0) {
		@Pc(11) int local11 = arg0.method2413();
		Static38.aClass197Array1 = new Class197[local11];
		for (@Pc(23) int local23 = 0; local23 < local11; local23++) {
			Static38.aClass197Array1[local23] = new Class197();
			Static38.aClass197Array1[local23].anInt6216 = arg0.method2413();
			Static38.aClass197Array1[local23].aString233 = arg0.method2391();
		}
		Static94.anInt2089 = arg0.method2413();
		Static165.anInt3375 = arg0.method2413();
		Static21.anInt401 = arg0.method2413();
		Static340.aClass83_Sub1Array2 = new Class83_Sub1[Static165.anInt3375 + 1 - Static94.anInt2089];
		for (@Pc(75) int local75 = 0; local75 < Static21.anInt401; local75++) {
			@Pc(83) int local83 = arg0.method2413();
			@Pc(91) Class83_Sub1 local91 = Static340.aClass83_Sub1Array2[local83] = new Class83_Sub1();
			local91.anInt3237 = arg0.method2380();
			local91.anInt3245 = arg0.method2389();
			local91.anInt3250 = local83 + Static94.anInt2089;
			local91.aString111 = arg0.method2391();
			local91.aString112 = arg0.method2391();
		}
		Static90.anInt2016 = arg0.method2389();
		Static258.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method2841(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static225.method3869(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static248.method4308(local7);
			local7 = Static323.method5319(":", "%3a", local7);
			local7 = Static323.method5319("@", "%40", local7);
			local7 = Static323.method5319("&", "%26", local7);
			local7 = Static323.method5319("#", "%23", local7);
			if (Static81.aClass120_1.anApplet1 != null) {
				@Pc(110) Class51 local110 = Static81.aClass120_1.method3218(new URL(Static81.aClass120_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static161.anInt3637 + "&u=" + Static324.aLong237 + "&v1=" + Static172.aString127 + "&v2=" + Static172.aString131 + "&e=" + local7));
				while (local110.anInt1229 == 0) {
					Static270.method5481(1L);
				}
				if (local110.anInt1229 == 1) {
					@Pc(126) DataInputStream local126 = (DataInputStream) local110.anObject1;
					local126.read();
					local126.close();
				}
			}
		} catch (@Pc(133) Exception local133) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method2842() {
		Static233.method3965(25);
		Static155.method2995();
		System.gc();
	}
}
