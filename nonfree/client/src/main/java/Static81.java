import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray186 = new int[2000];

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!sd;")
	private static Class73 aClass73_967 = Static122.method531("Loaded interfaces");

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_968 = aClass73_967;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_969 = Static122.method531("Standort");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)Lclient!sd;")
	public static Class73 method1408(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static154.method2485(arg0) : Static139.aClass73_1302;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method1409() {
		Static181.anInt3975 = 0;
		Static2.anInt13 = 0;
		Static119.method2070();
		Static59.method2028();
		Static156.method2511();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static2.anInt13; local22++) {
			local28 = Static149.anIntArray364[local22];
			if (Static44.anInt1024 != Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local28].anInt3177) {
				Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local28].aClass3_Sub1_Sub10_1 = null;
				Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local28] = null;
			}
		}
		if (Static17.anInt3783 != Static159.aClass3_Sub12_Sub1_4.anInt1793) {
			throw new RuntimeException("gnp1 pos:" + Static159.aClass3_Sub12_Sub1_4.anInt1793 + " psize:" + Static17.anInt3783);
		}
		for (local28 = 0; local28 < Static86.anInt1943; local28++) {
			if (Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static86.anInt1943);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method1410() {
		Static153.aBoolean226 = true;
		Static99.aBoolean146 = true;
		Static87.aClass54_1.anInt2296 = 0;
		Static132.aLong142 = 0L;
		Static170.anInt3710 = 0;
		Static148.method2414();
		Static160.anInt3497 = 0;
		Static100.anInt2226 = 0;
		Static169.aBoolean245 = false;
		Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
		Static58.anInt1360 = -1;
		Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
		Static94.anInt2079 = 0;
		Static142.anInt3262 = 0;
		Static132.anInt3019 = -1;
		Static101.anInt2290 = -1;
		Static43.anInt1007 = 0;
		Static144.anInt3454 = -1;
		Static46.method811(0);
		for (@Pc(2273) int local2273 = 0; local2273 < 100; local2273++) {
			Static102.aClass73Array14[local2273] = null;
		}
		Static59.anInt2722 = 0;
		Static29.anInt764 = 0;
		Static123.anInt2855 = (int) (Math.random() * 110.0D) - 55;
		Static34.anInt835 = 0;
		Static120.anInt2841 = (int) (Math.random() * 120.0D) - 60;
		Static25.anInt716 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static6.anInt158 = 0;
		Static4.anInt71 = 0;
		Static159.aBoolean233 = false;
		Static90.anInt2027 = -1;
		Static79.anInt1740 = (int) (Math.random() * 80.0D) - 40;
		Static50.anInt1147 = 0;
		Static14.anInt354 = 0;
		Static86.anInt1943 = 0;
		Static170.anInt3687 = (int) (Math.random() * 30.0D) - 20;
		Static150.anInt3587 = (int) (Math.random() * 100.0D) - 50;
		for (@Pc(2354) int local2354 = 0; local2354 < 2048; local2354++) {
			Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local2354] = null;
			Static79.aClass3_Sub12Array1[local2354] = null;
		}
		for (@Pc(2372) int local2372 = 0; local2372 < 32768; local2372++) {
			Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local2372] = null;
		}
		Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[2047] = new Class3_Sub1_Sub4_Sub7_Sub1();
		Static94.aClass72_29.method2396();
		Static121.aClass72_38.method2396();
		@Pc(2404) int local2404;
		@Pc(2408) int local2408;
		for (@Pc(2400) int local2400 = 0; local2400 < 4; local2400++) {
			for (local2404 = 0; local2404 < 104; local2404++) {
				for (local2408 = 0; local2408 < 104; local2408++) {
					Static99.aClass72ArrayArrayArray1[local2400][local2404][local2408] = null;
				}
			}
		}
		Static29.aClass72_11 = new Class72();
		Static166.anInt3619 = 0;
		Static150.anInt3582 = 0;
		for (local2404 = 0; local2404 < Static152.anInt3403; local2404++) {
			@Pc(2448) Class3_Sub1_Sub12 local2448 = Static62.method1120(local2404);
			if (local2448 != null && local2448.anInt1934 == 0) {
				Static20.anIntArray49[local2404] = 0;
				anIntArray186[local2404] = 0;
			}
		}
		for (local2408 = 0; local2408 < Static61.anIntArray156.length; local2408++) {
			Static61.anIntArray156[local2408] = -1;
		}
		if (Static133.anInt3052 != -1) {
			Static31.method595(Static133.anInt3052);
		}
		for (@Pc(2499) Class3_Sub13 local2499 = (Class3_Sub13) Static91.aClass16_9.method551(); local2499 != null; local2499 = (Class3_Sub13) Static91.aClass16_9.method552()) {
			Static8.method155(local2499, true);
		}
		Static133.anInt3052 = -1;
		Static91.aClass16_9 = new Class16(8);
		Static11.aClass83_3 = null;
		Static142.anInt3262 = 0;
		Static169.aBoolean245 = false;
		Static30.aClass52_1.method1698(null, false, new int[5], -1);
		for (@Pc(2535) int local2535 = 0; local2535 < 8; local2535++) {
			Static173.aClass73Array28[local2535] = null;
			Static101.aBooleanArray10[local2535] = false;
		}
		Static26.method553();
		Static109.aBoolean175 = true;
		for (@Pc(2559) int local2559 = 0; local2559 < 100; local2559++) {
			Static27.aBooleanArray3[local2559] = true;
		}
		Static13.aClass73_191 = null;
		Static52.anInt1279 = 0;
		Static139.aClass3_Sub5Array2 = null;
		for (@Pc(2579) int local2579 = 0; local2579 < 6; local2579++) {
			Static169.aClass63Array1[local2579] = new Class63();
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public static void method1411() {
		aClass73_968 = null;
		anIntArray186 = null;
		aClass73_967 = null;
		aClass73_969 = null;
	}
}
