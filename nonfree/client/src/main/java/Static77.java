import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!qn;")
	public static Class211 aClass211_21;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
	public static int anInt1542 = -1;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "[I")
	public static final int[] anIntArray113 = new int[32];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method1253(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static66.anInt1316 >= 100) {
			Static392.method5198(Static85.aClass15_29.method180(Static429.anInt6999));
			return;
		}
		@Pc(22) String local22 = Static112.method1664(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static66.anInt1316; local27++) {
			@Pc(35) String local35 = Static112.method1664(Static93.aStringArray14[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static392.method5198(arg0 + Static102.aClass15_37.method180(Static429.anInt6999));
				return;
			}
			if (Static441.aStringArray46[local27] != null) {
				local65 = Static112.method1664(Static441.aStringArray46[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static392.method5198(arg0 + Static102.aClass15_37.method180(Static429.anInt6999));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static284.anInt4659; local95++) {
			local65 = Static112.method1664(Static322.aStringArray36[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static392.method5198(Static233.aClass15_63.method180(Static429.anInt6999) + arg0 + Static434.aClass15_130.method180(Static429.anInt6999));
				return;
			}
			if (Static161.aStringArray27[local95] != null) {
				@Pc(138) String local138 = Static112.method1664(Static161.aStringArray27[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static392.method5198(Static233.aClass15_63.method180(Static429.anInt6999) + arg0 + Static434.aClass15_130.method180(Static429.anInt6999));
					return;
				}
			}
		}
		if (Static112.method1664(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60).equals(local22)) {
			Static392.method5198(Static310.aClass15_90.method180(Static429.anInt6999));
		} else {
			Static448.method5935(Static62.aClass146_21);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0) + 1);
			Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
			Static247.aClass4_Sub9_Sub2_2.method4999(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V")
	public static void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static366.method4859(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (arg1 >= Static254.anInt4211 && arg1 <= Static275.anInt4594) {
			@Pc(48) int[] local48 = Static267.anIntArrayArray50[arg1];
			local56 = Static39.method544(arg2 - arg3, Static62.anInt1114, Static207.anInt3632);
			local64 = Static39.method544(arg3 + arg2, Static62.anInt1114, Static207.anInt3632);
			local73 = Static39.method544(arg2 - local15, Static62.anInt1114, Static207.anInt3632);
			local81 = Static39.method544(local15 + arg2, Static62.anInt1114, Static207.anInt3632);
			Static249.method6044(local48, arg4, local73, local56);
			Static249.method6044(local48, arg5, local81, local73);
			Static249.method6044(local48, arg4, local64, local81);
		}
		@Pc(103) int local103 = -1;
		while (local24 > local10) {
			local103 += 2;
			local34 += 2;
			local32 += local103;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static136.anIntArray209[local29] = local10;
			}
			local10++;
			@Pc(232) int local232;
			@Pc(241) int local241;
			@Pc(248) int[] local248;
			@Pc(146) int local146;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local146 = arg1 - local24;
				local56 = local24 + arg1;
				if (Static254.anInt4211 <= local56 && Static275.anInt4594 >= local146) {
					if (local24 >= local15) {
						local64 = Static39.method544(local10 + arg2, Static62.anInt1114, Static207.anInt3632);
						local73 = Static39.method544(arg2 - local10, Static62.anInt1114, Static207.anInt3632);
						if (local56 <= Static275.anInt4594) {
							Static249.method6044(Static267.anIntArrayArray50[local56], arg4, local64, local73);
						}
						if (Static254.anInt4211 <= local146) {
							Static249.method6044(Static267.anIntArrayArray50[local146], arg4, local64, local73);
						}
					} else {
						local64 = Static136.anIntArray209[local24];
						local73 = Static39.method544(local10 + arg2, Static62.anInt1114, Static207.anInt3632);
						local81 = Static39.method544(arg2 - local10, Static62.anInt1114, Static207.anInt3632);
						local232 = Static39.method544(local64 + arg2, Static62.anInt1114, Static207.anInt3632);
						local241 = Static39.method544(arg2 - local64, Static62.anInt1114, Static207.anInt3632);
						if (local56 <= Static275.anInt4594) {
							local248 = Static267.anIntArrayArray50[local56];
							Static249.method6044(local248, arg4, local241, local81);
							Static249.method6044(local248, arg5, local232, local241);
							Static249.method6044(local248, arg4, local73, local232);
						}
						if (Static254.anInt4211 <= local146) {
							local248 = Static267.anIntArrayArray50[local146];
							Static249.method6044(local248, arg4, local241, local81);
							Static249.method6044(local248, arg5, local232, local241);
							Static249.method6044(local248, arg4, local73, local232);
						}
					}
				}
			}
			local146 = arg1 - local10;
			local56 = local10 + arg1;
			if (local56 >= Static254.anInt4211 && local146 <= Static275.anInt4594) {
				local64 = local24 + arg2;
				local73 = arg2 - local24;
				if (Static62.anInt1114 <= local64 && local73 <= Static207.anInt3632) {
					local64 = Static39.method544(local64, Static62.anInt1114, Static207.anInt3632);
					local73 = Static39.method544(local73, Static62.anInt1114, Static207.anInt3632);
					if (local15 > local10) {
						local81 = local10 <= local29 ? local29 : Static136.anIntArray209[local10];
						local232 = Static39.method544(local81 + arg2, Static62.anInt1114, Static207.anInt3632);
						local241 = Static39.method544(arg2 - local81, Static62.anInt1114, Static207.anInt3632);
						if (Static275.anInt4594 >= local56) {
							local248 = Static267.anIntArrayArray50[local56];
							Static249.method6044(local248, arg4, local241, local73);
							Static249.method6044(local248, arg5, local232, local241);
							Static249.method6044(local248, arg4, local64, local232);
						}
						if (Static254.anInt4211 <= local146) {
							local248 = Static267.anIntArrayArray50[local146];
							Static249.method6044(local248, arg4, local241, local73);
							Static249.method6044(local248, arg5, local232, local241);
							Static249.method6044(local248, arg4, local64, local232);
						}
					} else {
						if (Static275.anInt4594 >= local56) {
							Static249.method6044(Static267.anIntArrayArray50[local56], arg4, local64, local73);
						}
						if (local146 >= Static254.anInt4211) {
							Static249.method6044(Static267.anIntArrayArray50[local146], arg4, local64, local73);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V")
	public static void method1257() {
		Static321.method4252();
		Static150.method2112();
	}
}
