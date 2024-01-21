import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt2507;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	public static int anInt2509;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_5;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1136 = Static56.method972("Error loading your profile)3");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1131 = aClass5_1136;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1137 = Static56.method972("wishes to duel with you)3");

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1132 = aClass5_1137;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1133 = Static56.method972("(U4");

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1134 = Static56.method972("backhmid2");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	public static int anInt2512 = 0;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1135 = Static56.method972("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
	public static int anInt2515 = -1;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1139 = Static56.method972("Enter object name");

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1138 = aClass5_1139;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1140 = Static56.method972("backleft1");

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "[Lclient!m;")
	public static Class3_Sub6[] aClass3_Sub6Array1 = new Class3_Sub6[2048];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII[Lclient!te;IIIII)V")
	public static void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub17[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class3_Sub1_Sub17 local13 = arg3[local7];
			if (local13 != null && (local13.anInt2658 == 0 || local13.aBoolean131) && local13 != null && arg0 == local13.anInt2621 && !local13.method1713(Static23.aBoolean33)) {
				@Pc(44) int local44 = arg1 + local13.anInt2655 - arg6;
				@Pc(52) int local52 = local13.anInt2603 + arg8 - arg2;
				@Pc(57) int local57 = local44 + local13.anInt2667;
				@Pc(63) int local63 = local52 + local13.anInt2600;
				@Pc(74) int local74 = local52 <= arg8 ? arg8 : local52;
				@Pc(81) int local81 = arg5 > local57 ? local57 : arg5;
				@Pc(88) int local88 = arg1 < local44 ? local44 : arg1;
				@Pc(99) int local99 = local63 < arg4 ? local63 : arg4;
				if (local13.anInt2658 == 0) {
					method1665(local13.anInt2651, local88, local13.anInt2583, arg3, local99, local81, local13.anInt2636, arg7, local74);
					if (local13.aClass3_Sub1_Sub17Array1 != null) {
						method1665(local13.anInt2651, local88, local13.anInt2583, local13.aClass3_Sub1_Sub17Array1, local99, local81, local13.anInt2636, arg7, local74);
					}
				}
				if (local13.aBoolean131) {
					@Pc(139) boolean local139 = false;
					@Pc(157) boolean local157;
					if (anInt2512 >= local88 && Static49.anInt1325 >= local74 && local81 > anInt2512 && local99 > Static49.anInt1325) {
						local157 = true;
					} else {
						local157 = false;
					}
					@Pc(163) boolean local163 = false;
					if (Static46.anInt1282 == 1 && local157) {
						local139 = true;
					}
					if (Static76.anInt2563 == 1 && Static45.anInt1269 >= local88 && Static99.anInt2491 >= local74 && local81 > Static45.anInt1269 && Static99.anInt2491 < local99) {
						local163 = true;
					}
					if (local163 && Static87.aClass3_Sub1_Sub17_3 == null && (arg7 & 0x200) != 0 && !Static103.aBoolean142 && Static73.method1217(local13) != null) {
						Static108.anInt2861 = Static49.anInt1325;
						Static94.anInt594 = 0;
						Static19.anInt694 = anInt2512;
						Static87.aClass3_Sub1_Sub17_3 = local13;
						Static58.aBoolean74 = false;
					}
					if (Static87.aClass3_Sub1_Sub17_3 != null || Static103.aBoolean142) {
						local157 = false;
						local163 = false;
						local139 = false;
					}
					if (!local13.aBoolean136 && local163 && (arg7 & 0x1) != 0) {
						local13.aBoolean136 = true;
						if (local13.anObjectArray6 != null) {
							Static68.method997(0, local13.anObjectArray6, null, Static45.anInt1269 - local44, local13, Static99.anInt2491 - local52);
						}
					}
					if (local13.aBoolean136 && local139 && (arg7 & 0x4) != 0 && local13.anObjectArray8 != null) {
						Static68.method997(0, local13.anObjectArray8, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
					}
					if (local13.aBoolean136 && !local139 && (arg7 & 0x2) != 0) {
						local13.aBoolean136 = false;
						if (local13.anObjectArray14 != null) {
							Static68.method997(0, local13.anObjectArray14, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
						}
					}
					if (local139 && (arg7 & 0x8) != 0 && local13.anObjectArray13 != null) {
						Static68.method997(0, local13.anObjectArray13, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
					}
					if (!local13.aBoolean130 && local157 && (arg7 & 0x10) != 0) {
						local13.aBoolean130 = true;
						if (local13.anObjectArray4 != null) {
							Static68.method997(0, local13.anObjectArray4, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
						}
					}
					if (local13.aBoolean130 && local157 && (arg7 & 0x40) != 0 && local13.anObjectArray12 != null) {
						Static68.method997(0, local13.anObjectArray12, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
					}
					if (local13.aBoolean130 && !local157 && (arg7 & 0x20) != 0) {
						local13.aBoolean130 = false;
						if (local13.anObjectArray18 != null) {
							Static68.method997(0, local13.anObjectArray18, null, anInt2512 - local44, local13, Static49.anInt1325 - local52);
						}
					}
					if (local13.anObjectArray2 != null && (arg7 & 0x80) != 0) {
						Static68.method997(0, local13.anObjectArray2, null, 0, local13, 0);
					}
					if (local157 && Static104.anInt1773 != 0 && local13.anObjectArray7 != null && (arg7 & 0x400) != 0) {
						Static68.method997(0, local13.anObjectArray7, null, 0, local13, Static104.anInt1773);
					}
					if ((arg7 & 0x100) != 0) {
						if (local13.anInt2599 < Static110.anInt2891 && local13.anObjectArray19 != null) {
							Static68.method997(0, local13.anObjectArray19, null, 0, local13, 0);
						}
						if (Static65.anInt2441 > local13.anInt2599 && local13.anObjectArray10 != null) {
							Static68.method997(0, local13.anObjectArray10, null, 0, local13, 0);
						}
						if (local13.anInt2599 < Static16.anInt602 && local13.anObjectArray11 != null) {
							Static68.method997(0, local13.anObjectArray11, null, 0, local13, 0);
						}
						local13.anInt2599 = Static3.anInt289;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1668() {
		aClass5_1137 = null;
		aClass5_1134 = null;
		aClass3_Sub6Array1 = null;
		aClass5_1133 = null;
		aByteArrayArrayArray6 = null;
		aClass5_1135 = null;
		aClass5_1138 = null;
		aClass5_1131 = null;
		aClass5_1132 = null;
		aClass3_Sub1_Sub2_Sub3_5 = null;
		aClass5_1140 = null;
		aClass5_1139 = null;
		aClass5_1136 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
	public static void method1670() {
		Static38.aClass2_7.method1318();
		Static22.aClass3_Sub1_Sub2_Sub4_3.method1857(0, 0);
		Static91.anIntArray268 = Static25.method507(Static91.anIntArray268);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method1671() {
		if (Static58.aClass18_1 != null) {
			Static58.aClass18_1.method405();
			Static58.aClass18_1 = null;
		}
		Static104.method1148();
		Static73.aClass42_1.method1034();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static80.aClass30Array1[local18].method708();
		}
		System.gc();
		Static62.method1082();
		Static115.anInt2976 = -1;
		Static18.anInt633 = 0;
		Static87.method1482();
		Static116.method1971(10);
	}
}
