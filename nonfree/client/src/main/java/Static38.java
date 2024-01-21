import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ha", name = "mb", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!ha", name = "rb", descriptor = "Lclient!td;")
	public static Class54 aClass54_17;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_465 = Static87.method1648("Maximale Anmelde)2Versuche -Uberschritten)3");

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!ha", name = "Vb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_471 = Static87.method1648("Loaded interfaces");

	@OriginalMember(owner = "client!ha", name = "tb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_466 = aClass27_471;

	@OriginalMember(owner = "client!ha", name = "yb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_467 = Static87.method1648("Loaded textures");

	@OriginalMember(owner = "client!ha", name = "zb", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!ha", name = "Hb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_469 = Static87.method1648("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ha", name = "Tb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_470 = aClass27_467;

	@OriginalMember(owner = "client!ha", name = "Ub", descriptor = "Z")
	public static volatile boolean aBoolean51 = true;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(JZ)Lclient!hb;")
	public static Class27 method712(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) long local27 = arg0;
			@Pc(34) int local34 = 0;
			while (local27 != 0L) {
				local34++;
				local27 /= 37L;
			}
			@Pc(48) byte[] local48 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local34--;
				local48[local34] = Static75.aByteArray18[(int) (local52 - arg0 * 37L)];
			}
			@Pc(77) Class27 local77 = new Class27();
			local77.aByteArray9 = local48;
			local77.anInt963 = local48.length;
			return local77;
		}
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public static void method713() {
		aClass27_469 = null;
		aClass27_466 = null;
		aClass27_470 = null;
		aClass27_467 = null;
		aClass27_465 = null;
		aClass27_471 = null;
		anIntArray164 = null;
		aClass54_17 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hb;ZLclient!td;Lclient!hb;)[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] method716(@OriginalArg(0) Class27 arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) Class27 arg2) {
		@Pc(15) int local15 = arg1.method1620(arg0);
		@Pc(21) int local21 = arg1.method1613(arg2, local15);
		return Static57.method1100(local21, local15, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public static void method717() {
		@Pc(10) int local10 = Static47.aClass3_Sub11_Sub1_1.method1476(8);
		@Pc(19) int local19;
		if (Static104.anInt2718 > local10) {
			for (local19 = local10; local19 < Static104.anInt2718; local19++) {
				Static55.anIntArray240[Static18.anInt427++] = Static99.anIntArray387[local19];
			}
		}
		if (Static104.anInt2718 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static104.anInt2718 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static99.anIntArray387[local19];
			@Pc(61) Class3_Sub3_Sub1_Sub4_Sub2 local61 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local57];
			@Pc(68) int local68 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
			if (local68 == 0) {
				Static99.anIntArray387[Static104.anInt2718++] = local57;
				local61.anInt2382 = Static2.anInt38;
			} else {
				@Pc(88) int local88 = Static47.aClass3_Sub11_Sub1_1.method1476(2);
				if (local88 == 0) {
					Static99.anIntArray387[Static104.anInt2718++] = local57;
					local61.anInt2382 = Static2.anInt38;
					Static82.anIntArray335[Static70.anInt1829++] = local57;
				} else {
					@Pc(132) int local132;
					@Pc(144) int local144;
					if (local88 == 1) {
						Static99.anIntArray387[Static104.anInt2718++] = local57;
						local61.anInt2382 = Static2.anInt38;
						local132 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local61.method1674(false, local132);
						local144 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
						if (local144 == 1) {
							Static82.anIntArray335[Static70.anInt1829++] = local57;
						}
					} else if (local88 == 2) {
						Static99.anIntArray387[Static104.anInt2718++] = local57;
						local61.anInt2382 = Static2.anInt38;
						local132 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local61.method1674(true, local132);
						local144 = Static47.aClass3_Sub11_Sub1_1.method1476(3);
						local61.method1674(true, local144);
						@Pc(200) int local200 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
						if (local200 == 1) {
							Static82.anIntArray335[Static70.anInt1829++] = local57;
						}
					} else if (local88 == 3) {
						Static55.anIntArray240[Static18.anInt427++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jb;ZZ)Z")
	public static boolean method718(@OriginalArg(0) Class32 arg0, @OriginalArg(2) boolean arg1) {
		Static15.anInt297 = 20;
		try {
			Static88.aClass5_1 = (Class5) Class.forName("Class5_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface3 local17 = arg0.method943();
			if (local17 != null) {
				Static88.aClass5_1 = new Class5_Sub1_Sub2(arg0, local17);
				return true;
			} else if (arg1) {
				Static88.aClass5_1 = new Class5_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!wd;)Lclient!hb;")
	public static Class27 method721(@OriginalArg(1) Class3_Sub11 arg0) {
		return Static42.method894(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
	public static void method723() {
		while (true) {
			@Pc(13) Class28 local13 = Static106.aClass28_7;
			@Pc(20) Class3_Sub12 local20;
			synchronized (Static106.aClass28_7) {
				local20 = (Class3_Sub12) Static99.aClass28_12.method882();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass54_Sub1_45.method1624(false, local20.aByteArray21, local20.aClass55_4, (int) local20.aLong83);
		}
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(I)V")
	public static void method726() {
		Static61.aClass12_46.method674();
	}
}
