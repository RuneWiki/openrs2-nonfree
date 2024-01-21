import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!nd;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!he;")
	private static Class26 aClass26_1061 = Static6.method100("Jul");

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!he;")
	private static Class26 aClass26_1062 = Static6.method100("Mar");

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!he;")
	private static Class26 aClass26_1063 = Static6.method100("Jan");

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_1064 = Static6.method100("Nov");

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_1065 = Static6.method100("May");

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!he;")
	private static Class26 aClass26_1073 = Static6.method100("Feb");

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!he;")
	private static Class26 aClass26_1069 = Static6.method100("Apr");

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!he;")
	private static Class26 aClass26_1071 = Static6.method100("Jun");

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!he;")
	private static Class26 aClass26_1072 = Static6.method100("Aug");

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_1066 = Static6.method100("Sep");

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!he;")
	private static Class26 aClass26_1074 = Static6.method100("Oct");

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!he;")
	private static Class26 aClass26_1070 = Static6.method100("Dec");

	@OriginalMember(owner = "client!me", name = "i", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array17 = new Class26[] { aClass26_1063, aClass26_1073, aClass26_1062, aClass26_1069, aClass26_1065, aClass26_1071, aClass26_1061, aClass26_1072, aClass26_1066, aClass26_1074, aClass26_1064, aClass26_1070 };

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1067 = Static6.method100("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1068 = Static6.method100(":duelreq:");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method1348() {
		Static93.aClass66_21.method1971();
		Static16.aClass66_6.method1971();
		Static130.aClass66_28.method1971();
		Static41.aClass66_13.method1971();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1349() {
		anIntArray205 = null;
		aClass26Array17 = null;
		aClass26_1071 = null;
		aClass26_1062 = null;
		aClass26_1068 = null;
		aClass50_1 = null;
		aClass26_1064 = null;
		aClass26_1061 = null;
		aClass26_1066 = null;
		aClass26_1074 = null;
		aClass26_1073 = null;
		aClass26_1065 = null;
		aClass26_1069 = null;
		aClass26_1067 = null;
		aClass26_1072 = null;
		aClass26_1063 = null;
		aClass26_1070 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZIII)V")
	public static void method1350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static88.anInt2447 == arg0 && Static95.anInt2596 == arg4 && (arg2 == Static80.anInt2211 || !Static98.aBoolean151)) {
			return;
		}
		Static95.anInt2596 = arg4;
		Static88.anInt2447 = arg0;
		Static80.anInt2211 = arg2;
		if (!Static98.aBoolean151) {
			Static80.anInt2211 = 0;
		}
		Static4.method62(25);
		Static30.method555(true, Static11.aClass26_167);
		@Pc(44) int local44 = Static10.anInt286;
		@Pc(46) int local46 = Static56.anInt1700;
		Static56.anInt1700 = (arg4 - 6) * 8;
		Static10.anInt286 = (arg0 - 6) * 8;
		@Pc(63) int local63 = Static56.anInt1700 - local46;
		@Pc(69) int local69 = Static10.anInt286 - local44;
		for (@Pc(73) int local73 = 0; local73 < 32768; local73++) {
			@Pc(79) Class3_Sub1_Sub5_Sub1_Sub2 local79 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.anIntArray326[local83] -= local69;
					local79.anIntArray325[local83] -= local63;
				}
				local79.anInt2731 -= local63 * 128;
				local79.anInt2733 -= local69 * 128;
			}
		}
		for (@Pc(127) int local127 = 0; local127 < 2048; local127++) {
			@Pc(133) Class3_Sub1_Sub5_Sub1_Sub1 local133 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local127];
			if (local133 != null) {
				for (@Pc(137) int local137 = 0; local137 < 10; local137++) {
					local133.anIntArray326[local137] -= local69;
					local133.anIntArray325[local137] -= local63;
				}
				local133.anInt2733 -= local69 * 128;
				local133.anInt2731 -= local63 * 128;
			}
		}
		Static132.anInt3270 = arg2;
		@Pc(185) byte local185 = 104;
		@Pc(187) byte local187 = 0;
		Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1881(arg1, false, arg3);
		@Pc(195) byte local195 = 0;
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 1;
		if (local63 < 0) {
			local199 = -1;
			local197 = -1;
			local195 = 103;
		}
		@Pc(209) byte local209 = 1;
		if (local69 < 0) {
			local187 = 103;
			local209 = -1;
			local185 = -1;
		}
		for (@Pc(222) int local222 = local187; local222 != local185; local222 += local209) {
			for (@Pc(226) int local226 = local195; local226 != local197; local226 += local199) {
				@Pc(232) int local232 = local69 + local222;
				@Pc(237) int local237 = local226 + local63;
				for (@Pc(239) int local239 = 0; local239 < 4; local239++) {
					if (local232 >= 0 && local237 >= 0 && local232 < 104 && local237 < 104) {
						Static64.aClass65ArrayArrayArray1[local239][local222][local226] = Static64.aClass65ArrayArrayArray1[local239][local232][local237];
					} else {
						Static64.aClass65ArrayArrayArray1[local239][local222][local226] = null;
					}
				}
			}
		}
		for (@Pc(306) Class3_Sub8 local306 = (Class3_Sub8) Static99.aClass65_70.method1958(); local306 != null; local306 = (Class3_Sub8) Static99.aClass65_70.method1962()) {
			local306.anInt1141 -= local69;
			local306.anInt1138 -= local63;
			if (local306.anInt1141 < 0 || local306.anInt1138 < 0 || local306.anInt1141 >= 104 || local306.anInt1138 >= 104) {
				local306.method2201();
			}
		}
		Static8.anInt195 = 0;
		Static29.anInt1010 = -1;
		Static40.aBoolean67 = false;
		if (Static1.anInt8 != 0) {
			Static110.anInt2946 -= local63;
			Static1.anInt8 -= local69;
		}
		Static81.aClass65_56.method1957();
		Static72.aClass65_51.method1957();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method1353() {
		Static22.aClass66_10.method1971();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1354(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static135.method733(arg0, 0, local14, 0, local11);
		return local14;
	}
}
