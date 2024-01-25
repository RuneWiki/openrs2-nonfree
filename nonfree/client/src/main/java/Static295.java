import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt8551;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean657 = true;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!tda;")
	public static final Class315 aClass315_12 = new Class315(2);

	@OriginalMember(owner = "client!la", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[100];

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt8557 = 0;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Z")
	public static boolean aBoolean658 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JJ)J")
	public static long method7106(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
	public static void method7108(@OriginalArg(1) boolean arg0) {
		if (Static57.aClass116_1 != null) {
			Static57.aClass116_1.method2483();
			Static57.aClass116_1 = null;
		}
		Static199.anInt3950 = 0;
		Static542.method7382();
		Static309.method4629();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static495.aClass355Array1[local19].method7806();
		}
		Static298.method4515(false);
		System.gc();
		Static332.method5089();
		Static242.aBoolean363 = false;
		Static593.anInt9611 = -1;
		Static272.method4132(true);
		Static274.anInt4959 = 0;
		Static35.anInt906 = 0;
		Static565.anInt9249 = 0;
		Static469.anInt8016 = 0;
		Static130.anInt5246 = 0;
		Static584.anInt9529 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static134.aClass246Array1.length; local66++) {
			Static134.aClass246Array1[local66] = null;
		}
		Static168.method2919();
		for (@Pc(85) int local85 = 0; local85 < 2048; local85++) {
			Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local85] = null;
		}
		Static416.anInt7186 = 0;
		Static544.aClass162_40.method3518();
		Static31.anInt820 = 0;
		Static261.aClass162_35.method3518();
		Static74.method1179();
		Static444.anInt7770 = 0;
		Static70.aClass78_1.method1465();
		Static369.method5496();
		Static453.method6460();
		Static36.aClass2_Sub47_1 = null;
		Static407.aLong197 = 0L;
		if (arg0) {
			Static121.method1780(12);
			return;
		}
		Static121.method1780(3);
		try {
			Static602.method6577("loggedout", Static562.anApplet2);
		} catch (@Pc(134) Throwable local134) {
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!es;)Lclient!iea;")
	public static Class9 method7119(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(10) Class62 local10 = Static92.method1451()[arg0.method4325()];
		@Pc(17) Class279 local17 = Static90.method1419()[arg0.method4325()];
		@Pc(21) int local21 = arg0.method4334();
		@Pc(25) int local25 = arg0.method4334();
		@Pc(29) int local29 = arg0.method4294();
		@Pc(33) int local33 = arg0.method4294();
		@Pc(37) int local37 = arg0.method4334();
		@Pc(49) int local49 = arg0.method4307();
		@Pc(53) int local53 = arg0.method4307();
		return new Class9(local10, local17, local21, local25, local29, local33, local37, local49, local53);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZIII)Z")
	public static boolean method7121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0];
		@Pc(13) int local13 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0];
		if (local8 < 0 || Static188.anInt3850 <= local8 || local13 < 0 || Static49.anInt1174 <= local13) {
			return false;
		} else if (arg5 >= 0 && Static188.anInt3850 > arg5 && arg6 >= 0 && Static49.anInt1174 > arg6) {
			@Pc(69) int local69 = Static101.method1504(Static44.anIntArray59, arg2, local8, arg0, arg6, arg4, arg7, Static495.aClass355Array1[Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112], local13, arg5, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165(), Static287.anIntArray362, arg1, arg3);
			if (local69 < 1) {
				return false;
			}
			Static29.anInt761 = Static287.anIntArray362[local69 - 1];
			Static526.anInt8657 = Static44.anIntArray59[local69 - 1];
			Static413.aBoolean554 = false;
			Static203.method3300();
			return true;
		} else {
			return false;
		}
	}
}
