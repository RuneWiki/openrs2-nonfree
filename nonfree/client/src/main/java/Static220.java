import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "[Lclient!vf;")
	public static Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array11;

	@OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
	public static int anInt4302;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_9 = new Class4(128);

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1351 = Static186.method3527("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
	public static int anInt4304 = 0;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZZI)V")
	public static void method3389(@OriginalArg(1) boolean arg0) {
		Static130.aBoolean114 = arg0;
		Static190.anInt3922 = 2;
		Static50.anInt1044 = 22050;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method3393() {
		Static97.aClass1_Sub17_Sub1_2.method2189();
		@Pc(13) int local13 = Static97.aClass1_Sub17_Sub1_2.method2181(8);
		@Pc(18) int local18;
		if (Static103.anInt2065 > local13) {
			for (local18 = local13; local18 < Static103.anInt2065; local18++) {
				Static101.anIntArray190[Static13.anInt249++] = Static21.anIntArray44[local18];
			}
		}
		if (local13 > Static103.anInt2065) {
			throw new RuntimeException("gnpov1");
		}
		Static103.anInt2065 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(64) int local64 = Static21.anIntArray44[local18];
			@Pc(68) Class20_Sub3_Sub2 local68 = Static78.aClass20_Sub3_Sub2Array1[local64];
			@Pc(73) int local73 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
			if (local73 == 0) {
				Static21.anIntArray44[Static103.anInt2065++] = local64;
				local68.anInt3018 = Static107.anInt2132;
			} else {
				@Pc(96) int local96 = Static97.aClass1_Sub17_Sub1_2.method2181(2);
				if (local96 == 0) {
					Static21.anIntArray44[Static103.anInt2065++] = local64;
					local68.anInt3018 = Static107.anInt2132;
					Static164.anIntArray360[Static80.anInt1584++] = local64;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local96 == 1) {
						Static21.anIntArray44[Static103.anInt2065++] = local64;
						local68.anInt3018 = Static107.anInt2132;
						local138 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local68.method2472(false, local138);
						local148 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
						if (local148 == 1) {
							Static164.anIntArray360[Static80.anInt1584++] = local64;
						}
					} else if (local96 == 2) {
						Static21.anIntArray44[Static103.anInt2065++] = local64;
						local68.anInt3018 = Static107.anInt2132;
						local138 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local68.method2472(true, local138);
						local148 = Static97.aClass1_Sub17_Sub1_2.method2181(3);
						local68.method2472(true, local148);
						@Pc(202) int local202 = Static97.aClass1_Sub17_Sub1_2.method2181(1);
						if (local202 == 1) {
							Static164.anIntArray360[Static80.anInt1584++] = local64;
						}
					} else if (local96 == 3) {
						Static101.anIntArray190[Static13.anInt249++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public static void method3394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static6.anInt110 < 100) {
			Static199.method3186();
		}
		Static29.method406(arg3, arg1, arg3 + arg0, arg1 - -arg2);
		@Pc(29) int local29;
		@Pc(42) int local42;
		if (Static6.anInt110 < 100) {
			local29 = arg0 / 2 + arg3;
			local42 = arg2 / 2 + arg1 - 18 - 20;
			Static29.method423(arg3, arg1, arg0, arg2, 0);
			Static29.method411(local29 - 152, local42, 304, 34, 9179409);
			Static29.method411(local29 - 151, local42 - -1, 302, 32, 0);
			Static29.method423(local29 - 150, local42 + 2, Static6.anInt110 * 3, 30, 9179409);
			Static29.method423(Static6.anInt110 * 3 + local29 - 150, local42 + 2, 300 - Static6.anInt110 * 3, 30, 0);
			Static187.aClass1_Sub1_Sub10_3.method1826(Static33.aClass50_248, local29, local42 + 20, 16777215, -1);
			return;
		}
		Static97.anInt1979 = Static177.anInt3717 - (int) ((float) arg2 / Static198.aFloat6);
		Static85.anInt1756 = (int) ((float) (arg2 * 2) / Static198.aFloat6);
		Static112.anInt2217 = (int) ((float) (arg0 * 2) / Static198.aFloat6);
		Static65.anInt4125 = Static4.anInt87 - (int) ((float) arg0 / Static198.aFloat6);
		local29 = Static177.anInt3717 - (int) ((float) arg2 / Static198.aFloat6);
		local42 = Static4.anInt87 + (int) ((float) arg0 / Static198.aFloat6);
		@Pc(164) int local164 = Static4.anInt87 - (int) ((float) arg0 / Static198.aFloat6);
		@Pc(172) int local172 = (int) ((float) arg2 / Static198.aFloat6) + Static177.anInt3717;
		Static1.method29(local29, arg1, local172, arg1 + arg2, arg3, local42, arg0 + arg3, local164);
		Static55.method809(local42, arg0 + arg3, local164, local172, arg1 + arg2, arg3, local29, arg1);
		Static160.method2683(arg1, local29, local164, arg0 + arg3, local42, arg2 + arg1, arg3, local172);
		if (Static192.anInt3939 > 0) {
			Static192.anInt3939--;
		}
		if (!Static229.aBoolean214) {
			return;
		}
		@Pc(238) int local238 = arg3 + arg0 - 5;
		@Pc(245) int local245 = arg1 + arg2 - 8;
		Static130.aClass1_Sub1_Sub10_2.method1820(Static17.method257(new Class50[] { Static28.aClass50_204, Static160.method2684(Static42.anInt923) }), local238, local245, 16776960, -1);
		@Pc(266) int local266 = local245 - 15;
		@Pc(268) Runtime local268 = Runtime.getRuntime();
		@Pc(270) int local270 = 16776960;
		@Pc(280) int local280 = (int) ((local268.totalMemory() - local268.freeMemory()) / 1024L);
		if (local280 > 65536) {
			local270 = 16711680;
		}
		Static130.aClass1_Sub1_Sub10_2.method1820(Static17.method257(new Class50[] { Static170.aClass50_1145, Static160.method2684(local280), Static227.aClass50_1383 }), local238, local266, local270, -1);
		local245 = local266 - 15;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method3395(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static207.method3275(local18) : local18;
		} else if (arg0 instanceof Class99) {
			@Pc(32) Class99 local32 = (Class99) arg0;
			return local32.method2993();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 method3397() {
		@Pc(13) int local13 = Static8.anIntArray20[0] * Static101.anIntArray191[0];
		@Pc(17) byte[] local17 = Static191.aByteArrayArray11[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static78.anIntArray127[local17[local22] & 0xFF];
		}
		@Pc(57) Class1_Sub1_Sub8_Sub1 local57 = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], local20);
		Static216.method3375();
		return local57;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method3398() {
		@Pc(9) int local9 = Static82.aClass75_10.method2237();
		if (local9 == 0) {
			return;
		}
		Static32.aClass1_Sub17_Sub1_1.method2182(92);
		Static32.aClass1_Sub17_Sub1_1.method2175(0);
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = Static32.aClass1_Sub17_Sub1_1.anInt2656;
		@Pc(42) Class1_Sub5 local42 = (Class1_Sub5) Static82.aClass75_10.method2241();
		Static32.aClass1_Sub17_Sub1_1.method2151(local42.anInt409);
		@Pc(50) int local50 = local42.anInt409;
		@Pc(90) Class1_Sub5 local90;
		while ((local90 = (Class1_Sub5) Static82.aClass75_10.method2241()) != null) {
			if (local34 < 255 && local50 + 1 == local90.anInt409) {
				local34++;
			} else {
				Static32.aClass1_Sub17_Sub1_1.method2175(local34);
				local34 = 0;
				Static32.aClass1_Sub17_Sub1_1.method2151(local90.anInt409);
			}
			local50 = local90.anInt409;
		}
		Static32.aClass1_Sub17_Sub1_1.method2175(local34);
		Static32.aClass1_Sub17_Sub1_1.method2179(Static32.aClass1_Sub17_Sub1_1.anInt2656 - local37);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIZ)I")
	public static int method3399() {
		return Static65.anInt4133 + Static118.anInt2316;
	}
}
