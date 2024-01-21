import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "[I")
	public static int[] anIntArray241;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!nd;")
	public static Class44 aClass44_2 = new Class44();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt2155 = 0;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_856 = Static88.method1421("Your profile will be transferred in:");

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_857 = aClass61_856;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	public static int anInt2163 = 0;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!va;")
	private static Class61 aClass61_858 = Static88.method1421("Please try again)3");

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!va;")
	private static Class61 aClass61_859 = Static88.method1421(" has logged out)3");

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "Lclient!va;")
	private static Class61 aClass61_860 = Static88.method1421("System update in: ");

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!va;")
	private static Class61 aClass61_861 = Static88.method1421("scroll:");

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "Lclient!va;")
	public static Class61 aClass61_862 = aClass61_860;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!va;")
	public static Class61 aClass61_863 = aClass61_861;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!va;")
	public static Class61 aClass61_864 = Static88.method1421(" @whi@(X");

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!va;")
	public static Class61 aClass61_865 = aClass61_858;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[I")
	public static int[] anIntArray242 = new int[128];

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!va;")
	public static Class61 aClass61_866 = Static88.method1421("::clientdrop");

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Lclient!va;")
	public static Class61 aClass61_867 = aClass61_859;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1255() {
		aClass61_867 = null;
		aClass61_857 = null;
		aClass61_859 = null;
		aClass61_860 = null;
		anIntArray242 = null;
		anIntArray241 = null;
		aClass61_864 = null;
		aClass61_858 = null;
		aClass61_865 = null;
		aClass61_861 = null;
		aClass61_856 = null;
		aClass61_863 = null;
		aClass61_866 = null;
		aClass61_862 = null;
		aClass44_2 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1256() {
		Static105.method1646();
		Static18.method403();
		Static61.method904();
		Static60.method899();
		Static30.method555();
		Static69.method1011();
		Static37.method618();
		Static63.method378();
		Static33.method578();
		Static107.method1507();
		Static65.method950();
		Static99.method1585();
		((Class8) Static68.anInterface3_1).method67();
		Static50.aClass11_Sub1_9.method216();
		Static9.aClass11_Sub1_1.method216();
		Static35.aClass11_Sub1_7.method216();
		Static103.aClass11_Sub1_6.method216();
		Static57.aClass11_Sub1_10.method216();
		Static106.aClass11_Sub1_16.method216();
		Static104.aClass11_Sub1_14.method216();
		Static60.aClass11_Sub1_11.method216();
		Static22.aClass11_Sub1_4.method216();
		Static106.aClass11_Sub1_15.method216();
		Static99.aClass11_Sub1_13.method216();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V")
	public static void method1257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static31.aBoolean43) {
			arg0 = 0;
		}
		if (Static50.anInt1408 == arg1 && Static82.anInt2199 == arg3 && arg0 == Static61.anInt1599) {
			return;
		}
		Static82.anInt2199 = arg3;
		Static50.anInt1408 = arg1;
		Static61.anInt1599 = arg0;
		Static50.method780(25);
		Static58.method840(false, null, Static95.aClass61_975);
		@Pc(47) int local47 = Static7.anInt80;
		Static7.anInt80 = arg3 * 8 - 48;
		@Pc(55) int local55 = Static107.anInt2431;
		@Pc(60) int local60 = Static7.anInt80 - local47;
		Static107.anInt2431 = (arg1 - 6) * 8;
		@Pc(73) int local73 = Static107.anInt2431 - local55;
		for (@Pc(77) int local77 = 0; local77 < 16384; local77++) {
			@Pc(83) Class10_Sub1_Sub5_Sub2_Sub1 local83 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local77];
			if (local83 != null) {
				for (@Pc(87) int local87 = 0; local87 < 10; local87++) {
					local83.anIntArray189[local87] -= local73;
					local83.anIntArray186[local87] -= local60;
				}
				local83.anInt1654 -= local73 * 128;
				local83.anInt1649 -= local60 * 128;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < 2048; local135++) {
			@Pc(141) Class10_Sub1_Sub5_Sub2_Sub2 local141 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local135];
			if (local141 != null) {
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					local141.anIntArray189[local145] -= local73;
					local141.anIntArray186[local145] -= local60;
				}
				local141.anInt1654 -= local73 * 128;
				local141.anInt1649 -= local60 * 128;
			}
		}
		Static101.anInt2582 = arg0;
		@Pc(195) byte local195 = 0;
		@Pc(197) byte local197 = 104;
		Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.method928(arg4, false, arg2);
		@Pc(205) byte local205 = 1;
		@Pc(207) byte local207 = 0;
		if (local73 < 0) {
			local197 = -1;
			local195 = 103;
			local205 = -1;
		}
		@Pc(218) byte local218 = 104;
		@Pc(220) byte local220 = 1;
		if (local60 < 0) {
			local207 = 103;
			local218 = -1;
			local220 = -1;
		}
		for (@Pc(230) int local230 = local195; local230 != local197; local230 += local205) {
			for (@Pc(234) int local234 = local207; local234 != local218; local234 += local220) {
				@Pc(240) int local240 = local230 + local73;
				@Pc(244) int local244 = local60 + local234;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local240 >= 0 && local244 >= 0 && local240 < 104 && local244 < 104) {
						Static11.aClass9ArrayArrayArray1[local246][local230][local234] = Static11.aClass9ArrayArrayArray1[local246][local240][local244];
					} else {
						Static11.aClass9ArrayArrayArray1[local246][local230][local234] = null;
					}
				}
			}
		}
		for (@Pc(311) Class10_Sub3 local311 = (Class10_Sub3) Static56.aClass9_6.method72(); local311 != null; local311 = (Class10_Sub3) Static56.aClass9_6.method81()) {
			local311.anInt728 -= local73;
			local311.anInt731 -= local60;
			if (local311.anInt728 < 0 || local311.anInt731 < 0 || local311.anInt728 >= 104 || local311.anInt731 >= 104) {
				local311.method1654();
			}
		}
		Static19.anInt624 = -1;
		Static96.aBoolean112 = false;
		if (Static35.anInt1020 != 0) {
			Static50.anInt1406 -= local60;
			Static35.anInt1020 -= local73;
		}
		Static12.aClass9_3.method82();
		Static89.aClass9_9.method82();
	}
}
