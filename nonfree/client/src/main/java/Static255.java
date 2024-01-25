import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!hu", name = "T", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!hu", name = "Q", descriptor = "I")
	public static int anInt4025;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!hu", name = "V", descriptor = "Ljava/lang/Class;")
	private static Class aClass25;

	@OriginalMember(owner = "client!hu", name = "L", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_73 = new Class225(106, 6);

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "[B")
	public static final byte[] aByteArray54 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZILclient!ola;)V")
	public static void method3618(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub46 arg1) {
		if (arg1.aBoolean652) {
			if (arg1.anInt7503 < 0 || Static346.method4802(arg1.anInt7503, arg1.anInt7502)) {
				if (arg0) {
					Static296.method4166(arg1.anInt7501, arg1.anInt7506, arg1.anInt7508, (Class202) null, arg1.anInt7498);
				} else {
					Static118.method1731(arg1.anInt7501, arg1.anInt7498, arg1.anInt7508, -1, arg1.anInt7502, arg1.anInt7506, arg1.anInt7499, arg1.anInt7503);
				}
				arg1.method9872();
			}
		} else if (arg1.aBoolean653 && arg1.anInt7501 >= 1 && arg1.anInt7498 >= 1 && arg1.anInt7501 <= Static426.anInt6942 - 2 && Static280.anInt6752 - 2 >= arg1.anInt7498) {
			if (arg1.anInt7505 >= 0 && !Static346.method4802(arg1.anInt7505, arg1.anInt7510)) {
				return;
			}
			if (arg0) {
				Static296.method4166(arg1.anInt7501, arg1.anInt7506, arg1.anInt7508, arg1.aClass202_1, arg1.anInt7498);
			} else {
				Static118.method1731(arg1.anInt7501, arg1.anInt7498, arg1.anInt7508, -1, arg1.anInt7510, arg1.anInt7506, arg1.anInt7507, arg1.anInt7505);
			}
			arg1.aBoolean653 = false;
			if (!arg0 && arg1.anInt7505 == arg1.anInt7503 && arg1.anInt7503 == -1) {
				arg1.method9872();
				return;
			}
			if (!arg0 && arg1.anInt7505 == arg1.anInt7503 && arg1.anInt7499 == arg1.anInt7507 && arg1.anInt7510 == arg1.anInt7502) {
				arg1.method9872();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method3619(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static48.aHashtable1.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(24) File local24 = null;
		if (local24 == null) {
			local24 = (File) Static406.aHashtable5.get(arg1);
		}
		if (local24 != null) {
			try {
				local24 = new File(local24.getCanonicalPath());
				@Pc(51) Class local51 = Class.forName("java.lang.Runtime");
				@Pc(56) Class local56 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(68) Method local68 = local56.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(90) Method local90 = local51.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local68.invoke(local90, Boolean.TRUE);
				local90.invoke(Runtime.getRuntime(), arg0, local24.getPath());
				local68.invoke(local90, Boolean.FALSE);
				Static48.aHashtable1.put(arg1, arg0);
				return true;
			} catch (@Pc(133) NoSuchMethodException local133) {
				System.load(local24.getPath());
				Static48.aHashtable1.put(arg1, aClass25 == null ? (aClass25 = Class2_Sub11_Sub9.a("vb")) : aClass25);
				return true;
			} catch (@Pc(154) Throwable local154) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)V")
	public static void method3620() {
		@Pc(12) int local12 = 0;
		if (Static650.aClass2_Sub30_29 != null) {
			local12 = Static650.aClass2_Sub30_29.aClass11_Sub14_1.method2893();
		}
		@Pc(34) int local34;
		@Pc(46) int local46;
		if (local12 == 2) {
			local34 = Static34.anInt8577 > 800 ? 800 : Static34.anInt8577;
			Static151.anInt7983 = local34;
			local46 = Static121.anInt2049 <= 600 ? Static121.anInt2049 : 600;
			Static251.anInt3953 = (Static34.anInt8577 - local34) / 2;
			Static477.anInt7668 = 0;
			Static295.anInt4558 = local46;
		} else if (local12 == 1) {
			local34 = Static34.anInt8577 > 1024 ? 1024 : Static34.anInt8577;
			local46 = Static121.anInt2049 <= 768 ? Static121.anInt2049 : 768;
			Static251.anInt3953 = (Static34.anInt8577 - local34) / 2;
			Static151.anInt7983 = local34;
			Static295.anInt4558 = local46;
			Static477.anInt7668 = 0;
		} else {
			Static477.anInt7668 = 0;
			Static295.anInt4558 = Static121.anInt2049;
			Static251.anInt3953 = 0;
			Static151.anInt7983 = Static34.anInt8577;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[Lclient!ug;)V")
	public static void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1) {
		Static453.anInt7382 = arg1.length;
		Static464.anIntArray538 = new int[Static453.anInt7382 + 10];
		Static467.aClass43Array17 = new Class43[Static453.anInt7382 + 10];
		Static728.method269(arg1, 0, Static467.aClass43Array17, 0, Static453.anInt7382);
		for (@Pc(26) int local26 = 0; local26 < Static453.anInt7382; local26++) {
			Static464.anIntArray538[local26] = Static467.aClass43Array17[local26].method9600();
		}
		if (arg0 < -23) {
			for (@Pc(52) int local52 = Static453.anInt7382; local52 < Static467.aClass43Array17.length; local52++) {
				Static464.anIntArray538[local52] = 12;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method3623(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static194.anInt3157; local19++) {
			if (arg0.equalsIgnoreCase(Static451.aStringArray31[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static490.aStringArray35[local19])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!bi;ILclient!efa;Lclient!dga;III)V")
	public static void method3624(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub1_Sub2_Sub2 arg3, @OriginalArg(4) Class81 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(16) Class2_Sub38 local16 = new Class2_Sub38();
		local16.anInt6455 = arg6;
		local16.anInt6462 = arg5 << 9;
		local16.anInt6467 = arg0 << 9;
		if (arg4 != null) {
			local16.aClass81_1 = arg4;
			@Pc(37) int local37 = arg4.anInt1902;
			@Pc(40) int local40 = arg4.anInt1881;
			if (arg2 == 1 || arg2 == 3) {
				local37 = arg4.anInt1881;
				local40 = arg4.anInt1902;
			}
			local16.anInt6458 = arg4.anInt1856;
			local16.anInt6466 = arg4.anInt1898;
			local16.anIntArray446 = arg4.anIntArray141;
			local16.anInt6453 = arg4.anInt1905;
			local16.anInt6456 = arg4.anInt1876;
			local16.anInt6454 = arg5 + local37 << 9;
			local16.anInt6457 = arg4.anInt1858;
			local16.aBoolean545 = arg4.aBoolean225;
			local16.aBoolean546 = arg4.aBoolean219;
			local16.anInt6459 = arg4.anInt1872 << 9;
			local16.anInt6461 = arg4.anInt1857;
			local16.anInt6465 = local40 + arg0 << 9;
			local16.anInt6464 = arg4.anInt1883 << 9;
			if (arg4.anIntArray143 != null) {
				local16.aBoolean544 = true;
				local16.method5816();
			}
			if (local16.anIntArray446 != null) {
				local16.anInt6460 = local16.anInt6466 + (int) (Math.random() * (double) (local16.anInt6456 - local16.anInt6466));
			}
			Static594.aClass60_191.method1233(local16);
		} else if (arg3 != null) {
			local16.aClass4_Sub2_Sub1_Sub2_Sub2_2 = arg3;
			@Pc(162) Class261 local162 = arg3.aClass261_1;
			if (local162.anIntArray499 != null) {
				local16.aBoolean544 = true;
				local162 = local162.method6272(Static396.aClass107_1);
			}
			if (local162 != null) {
				local16.anInt6454 = local162.anInt7010 + arg5 << 9;
				local16.anInt6465 = arg0 + local162.anInt7010 << 9;
				local16.anInt6458 = Static461.method6669(arg3);
				local16.anInt6464 = local162.anInt7009 << 9;
				local16.anInt6459 = local162.anInt7028 << 9;
				local16.aBoolean546 = local162.aBoolean591;
				local16.anInt6457 = local162.anInt7014;
				local16.anInt6461 = local162.anInt7027;
				local16.anInt6453 = local162.anInt7036;
			}
			Static171.aClass60_56.method1233(local16);
		} else if (arg1 != null) {
			local16.aClass4_Sub2_Sub1_Sub2_Sub1_3 = arg1;
			local16.anInt6454 = arg1.method2046() + arg5 << 9;
			local16.anInt6465 = arg0 + arg1.method2046() << 9;
			local16.anInt6458 = Static564.method7853(arg1);
			local16.aBoolean546 = arg1.aBoolean100;
			local16.anInt6453 = 256;
			local16.anInt6459 = 0;
			local16.anInt6457 = 256;
			local16.anInt6464 = arg1.anInt842 << 9;
			local16.anInt6461 = arg1.anInt818;
			Static307.aClass218_22.method5099(local16, (long) arg1.anInt2320);
		}
	}
}
