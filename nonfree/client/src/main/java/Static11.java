import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "Cb", descriptor = "Lclient!ek;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!ak", name = "Eb", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "Lclient!sf;")
	public static Class157 aClass157_5 = new Class157(32);

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(JJ)J")
	public static long method195(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	public static void method197() {
		if (Static253.aClass34_3 != null) {
			Static253.aClass34_3.method1077();
			Static253.aClass34_3 = null;
		}
		Static6.method116();
		Static110.method1876();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static89.aClass154Array1[local18].method3909();
		}
		Static65.method1194(false);
		System.gc();
		Static96.method1669();
		Static297.aBoolean384 = false;
		Static7.anInt116 = -1;
		Static153.method2804(true);
		Static180.anInt3907 = 0;
		Static234.anInt4705 = 0;
		Static160.anInt5159 = 0;
		Static166.aBoolean246 = false;
		Static261.anInt5142 = 0;
		for (local18 = 0; local18 < Static308.aClass47Array1.length; local18++) {
			Static308.aClass47Array1[local18] = null;
		}
		Static191.anInt4008 = 0;
		Static57.anInt1448 = 0;
		@Pc(82) int local82;
		for (local82 = 0; local82 < 2048; local82++) {
			Static188.aClass15_Sub2_Sub2Array41[local82] = null;
			Static59.aClass2_Sub16Array1[local82] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static35.aClass15_Sub2_Sub1Array2[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (local82 = 0; local82 < 104; local82++) {
				for (@Pc(124) int local124 = 0; local124 < 104; local124++) {
					Static121.aClass44ArrayArrayArray1[local18][local82][local124] = null;
				}
			}
		}
		Static65.method1195();
		Static281.anInt5563 = 0;
		Static13.method236();
		Static268.method4232(true);
		try {
			Static322.method2907(Static164.aClass102_2.anApplet1, "loggedout");
		} catch (@Pc(161) Throwable local161) {
		}
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
	public static void method200() {
		if (Static88.aClass142_1 != null) {
			@Pc(10) Class142 local10 = Static88.aClass142_1;
			synchronized (Static88.aClass142_1) {
				Static88.aClass142_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)[Lclient!bn;")
	public static Class2_Sub8_Sub1[] method219() {
		@Pc(13) Class2_Sub8_Sub1[] local13 = new Class2_Sub8_Sub1[Static236.anInt4770];
		for (@Pc(15) int local15 = 0; local15 < Static236.anInt4770; local15++) {
			@Pc(30) int local30 = Static299.anIntArray561[local15] * Static187.anIntArray397[local15];
			@Pc(34) byte[] local34 = Static165.aByteArrayArray9[local15];
			@Pc(37) int[] local37 = new int[local30];
			for (@Pc(39) int local39 = 0; local39 < local30; local39++) {
				local37[local39] = Static199.anIntArray438[local34[local39] & 0xFF];
			}
			if (Static116.aBoolean184) {
				local13[local15] = new Class2_Sub8_Sub1_Sub2(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local15], Static275.anIntArray522[local15], Static299.anIntArray561[local15], Static187.anIntArray397[local15], local37);
			} else {
				local13[local15] = new Class2_Sub8_Sub1_Sub1(Static222.anInt4526, Static2.anInt59, Static311.anIntArray591[local15], Static275.anIntArray522[local15], Static299.anIntArray561[local15], Static187.anIntArray397[local15], local37);
			}
		}
		Static293.method4502();
		return local13;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static53.anInt1319 && Static81.anInt1915 >= arg8 && arg3 >= Static53.anInt1319 && arg3 <= Static81.anInt1915 && Static53.anInt1319 <= arg7 && Static81.anInt1915 >= arg7 && arg5 >= Static53.anInt1319 && Static81.anInt1915 >= arg5 && arg0 >= Static148.anInt3245 && arg0 <= Static166.anInt3675 && arg2 >= Static148.anInt3245 && arg2 <= Static166.anInt3675 && arg4 >= Static148.anInt3245 && arg4 <= Static166.anInt3675 && arg6 >= Static148.anInt3245 && Static166.anInt3675 >= arg6) {
			Static303.method4611(arg2, arg4, arg1, arg6, arg3, arg7, arg8, arg5, arg0);
		} else {
			Static96.method1668(arg4, arg5, arg7, arg0, arg2, arg1, arg8, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
	public static void method228() {
		if (Static56.aClass177_1 != null) {
			@Pc(9) Class177 local9 = Static56.aClass177_1;
			synchronized (Static56.aClass177_1) {
				Static56.aClass177_1 = null;
			}
		}
	}
}
