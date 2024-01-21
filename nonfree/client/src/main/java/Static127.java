import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "Lclient!lc;")
	public static Class40 aClass40_89;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lclient!fd;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
	public static int anInt2975;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1194 = Static121.method2047("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1193 = aClass60_1194;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "Lclient!tb;")
	public static Class70 aClass70_18 = new Class70();

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
	public static int anInt2974 = -2;

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1196 = Static121.method2047("Checking for updates )2 ");

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1195 = aClass60_1196;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1197 = Static121.method2047("leuchten1:");

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	public static int anInt2976 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!lc;BLclient!qc;Lclient!qc;)Lclient!qf;")
	public static Class4_Sub4_Sub3_Sub4 method2100(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(13) int local13 = arg0.method1107(arg1);
		@Pc(19) int local19 = arg0.method1100(local13, arg2);
		return Static55.method1025(arg0, local19, local13);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method2101() {
		aClass70_18 = null;
		aClass60_1196 = null;
		aClass60_1195 = null;
		aClass60_1193 = null;
		aClass40_89 = null;
		aClass60_1197 = null;
		aClass60_1194 = null;
		aClass23_1 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)Lclient!t;")
	public static Class4_Sub4_Sub14 method2102(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub14 local10 = (Class4_Sub4_Sub14) Static59.aClass48_37.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static76.aClass40_56.method1110(arg0, 12);
		local10 = new Class4_Sub4_Sub14();
		if (local20 != null) {
			local10.method1923(new Class4_Sub13(local20));
		}
		local10.method1921();
		Static59.aClass48_37.method1392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)V")
	public static void method2104() {
		@Pc(3) Class64 local3 = Static102.aClass64_1;
		synchronized (Static102.aClass64_1) {
			Static104.anInt2501 = Static110.anInt2676;
			@Pc(23) int local23;
			if (Static10.anInt234 >= 0) {
				while (Static10.anInt234 != Static131.anInt3028) {
					local23 = Static114.anIntArray300[Static131.anInt3028];
					Static131.anInt3028 = Static131.anInt3028 + 1 & 0x7F;
					if (local23 >= 0) {
						Static10.aBooleanArray1[local23] = true;
					} else {
						Static10.aBooleanArray1[~local23] = false;
					}
				}
			} else {
				for (local23 = 0; local23 < 112; local23++) {
					Static10.aBooleanArray1[local23] = false;
				}
				Static10.anInt234 = Static131.anInt3028;
			}
			Static110.anInt2676 = Static32.anInt886;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BZZ)I")
	public static int method2105() {
		return Static114.anInt2749 + Static83.anInt1975;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[B)V")
	public static void method2106(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub13 local10 = new Class4_Sub13(arg0);
		local10.anInt1643 = arg0.length - 2;
		Static37.anInt929 = local10.method1244();
		Static113.anIntArray299 = new int[Static37.anInt929];
		Static76.anIntArray193 = new int[Static37.anInt929];
		Static61.anIntArray166 = new int[Static37.anInt929];
		Static102.anIntArray279 = new int[Static37.anInt929];
		Static105.aByteArrayArray8 = new byte[Static37.anInt929][];
		local10.anInt1643 = arg0.length - Static37.anInt929 * 8 - 7;
		Static46.anInt1202 = local10.method1244();
		Static31.anInt850 = local10.method1244();
		@Pc(62) int local62 = (local10.method1223() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static37.anInt929; local64++) {
			Static61.anIntArray166[local64] = local10.method1244();
		}
		for (@Pc(82) int local82 = 0; local82 < Static37.anInt929; local82++) {
			Static113.anIntArray299[local82] = local10.method1244();
		}
		for (@Pc(100) int local100 = 0; local100 < Static37.anInt929; local100++) {
			Static102.anIntArray279[local100] = local10.method1244();
		}
		for (@Pc(114) int local114 = 0; local114 < Static37.anInt929; local114++) {
			Static76.anIntArray193[local114] = local10.method1244();
		}
		local10.anInt1643 = arg0.length - (local62 - 1) * 3 - Static37.anInt929 * 8 - 7;
		Static56.anIntArray146 = new int[local62];
		for (@Pc(157) int local157 = 1; local157 < local62; local157++) {
			Static56.anIntArray146[local157] = local10.method1241();
			if (Static56.anIntArray146[local157] == 0) {
				Static56.anIntArray146[local157] = 1;
			}
		}
		local10.anInt1643 = 0;
		for (@Pc(185) int local185 = 0; local185 < Static37.anInt929; local185++) {
			@Pc(191) int local191 = Static102.anIntArray279[local185];
			@Pc(195) int local195 = Static76.anIntArray193[local185];
			@Pc(199) int local199 = local195 * local191;
			@Pc(202) byte[] local202 = new byte[local199];
			Static105.aByteArrayArray8[local185] = local202;
			@Pc(210) int local210 = local10.method1223();
			@Pc(217) int local217;
			if (local210 == 0) {
				for (local217 = 0; local217 < local199; local217++) {
					local202[local217] = local10.method1224();
				}
			} else if (local210 == 1) {
				for (local217 = 0; local217 < local191; local217++) {
					for (@Pc(240) int local240 = 0; local240 < local195; local240++) {
						local202[local240 * local191 + local217] = local10.method1224();
					}
				}
			}
		}
	}
}
