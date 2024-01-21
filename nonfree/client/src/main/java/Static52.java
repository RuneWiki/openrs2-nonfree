import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array4;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!v;")
	public static Class76 aClass76_587 = Static134.method2017("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[Lclient!na;")
	public static Class50[] aClass50Array1 = new Class50[4];

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[I")
	public static int[] anIntArray167 = new int[25];

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt1352 = 0;

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_588 = Static134.method2017("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	public static int anInt1354 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Z")
	public static boolean method941(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!v;")
	public static Class76 method942(@OriginalArg(0) int arg0) {
		@Pc(7) Class76 local7 = new Class76();
		local7.anInt2668 = 0;
		local7.aByteArray71 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method943() {
		aClass76_587 = null;
		aClass4_Sub4_Sub5_Sub4Array4 = null;
		aClass50Array1 = null;
		anIntArray167 = null;
		aClass76_588 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
	public static void method944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static72.anInt1877 && arg4 == Static122.anInt2656 && (Static8.anInt164 == arg2 || !Static76.aBoolean119)) {
			return;
		}
		Static122.anInt2656 = arg4;
		Static72.anInt1877 = arg0;
		Static8.anInt164 = arg2;
		if (!Static76.aBoolean119) {
			Static8.anInt164 = 0;
		}
		Static73.method1363(25);
		Static9.method113(true, Static127.aClass76_1288);
		@Pc(40) int local40 = Static64.anInt1649;
		@Pc(42) int local42 = Static51.anInt2080;
		Static64.anInt1649 = (arg4 - 6) * 8;
		Static51.anInt2080 = arg0 * 8 - 48;
		@Pc(59) int local59 = Static51.anInt2080 - local42;
		@Pc(63) int local63 = Static64.anInt1649 - local40;
		for (@Pc(69) int local69 = 0; local69 < 32768; local69++) {
			@Pc(75) Class4_Sub4_Sub3_Sub1_Sub1 local75 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local69];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < 10; local79++) {
					local75.anIntArray184[local79] -= local59;
					local75.anIntArray180[local79] -= local63;
				}
				local75.anInt1416 -= local63 * 128;
				local75.anInt1393 -= local59 * 128;
			}
		}
		for (@Pc(123) int local123 = 0; local123 < 2048; local123++) {
			@Pc(129) Class4_Sub4_Sub3_Sub1_Sub2 local129 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local123];
			if (local129 != null) {
				for (@Pc(133) int local133 = 0; local133 < 10; local133++) {
					local129.anIntArray184[local133] -= local59;
					local129.anIntArray180[local133] -= local63;
				}
				local129.anInt1393 -= local59 * 128;
				local129.anInt1416 -= local63 * 128;
			}
		}
		Static124.anInt2712 = arg2;
		Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.method967(false, arg3, arg1);
		@Pc(189) byte local189 = 0;
		@Pc(191) byte local191 = 1;
		@Pc(193) byte local193 = 104;
		if (local59 < 0) {
			local193 = -1;
			local191 = -1;
			local189 = 103;
		}
		@Pc(206) byte local206 = 0;
		@Pc(208) byte local208 = 104;
		@Pc(210) byte local210 = 1;
		if (local63 < 0) {
			local208 = -1;
			local210 = -1;
			local206 = 103;
		}
		for (@Pc(223) int local223 = local189; local223 != local193; local223 += local191) {
			for (@Pc(227) int local227 = local206; local227 != local208; local227 += local210) {
				@Pc(233) int local233 = local63 + local227;
				@Pc(238) int local238 = local223 + local59;
				for (@Pc(240) int local240 = 0; local240 < 4; local240++) {
					if (local238 >= 0 && local233 >= 0 && local238 < 104 && local233 < 104) {
						Static124.aClass78ArrayArrayArray1[local240][local223][local227] = Static124.aClass78ArrayArrayArray1[local240][local238][local233];
					} else {
						Static124.aClass78ArrayArrayArray1[local240][local223][local227] = null;
					}
				}
			}
		}
		for (@Pc(305) Class4_Sub15 local305 = (Class4_Sub15) Static9.aClass78_2.method1916(); local305 != null; local305 = (Class4_Sub15) Static9.aClass78_2.method1920()) {
			local305.anInt2048 -= local63;
			local305.anInt2044 -= local59;
			if (local305.anInt2044 < 0 || local305.anInt2048 < 0 || local305.anInt2044 >= 104 || local305.anInt2048 >= 104) {
				local305.method2004();
			}
		}
		if (Static51.anInt2078 != 0) {
			Static92.anInt2151 -= local63;
			Static51.anInt2078 -= local59;
		}
		Static64.anInt1644 = 0;
		Static42.anInt1167 = -1;
		Static125.aBoolean155 = false;
		Static91.aClass78_9.method1923();
		Static67.aClass78_7.method1923();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method945() {
		for (@Pc(14) Class4_Sub4_Sub3_Sub2 local14 = (Class4_Sub4_Sub3_Sub2) Static67.aClass78_7.method1916(); local14 != null; local14 = (Class4_Sub4_Sub3_Sub2) Static67.aClass78_7.method1920()) {
			if (Static124.anInt2712 != local14.anInt1034 || Static78.anInt1981 > local14.anInt1020) {
				local14.method2004();
			} else if (Static78.anInt1981 >= local14.anInt1012) {
				if (local14.anInt1026 > 0) {
					@Pc(45) Class4_Sub4_Sub3_Sub1_Sub1 local45 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local14.anInt1026 - 1];
					if (local45 != null && local45.anInt1393 >= 0 && local45.anInt1393 < 13312 && local45.anInt1416 >= 0 && local45.anInt1416 < 13312) {
						local14.method656(local45.anInt1416, Static78.anInt1981, local45.anInt1393, Static67.method1133(local14.anInt1034, local45.anInt1393, local45.anInt1416) - local14.anInt1036);
					}
				}
				if (local14.anInt1026 < 0) {
					@Pc(95) int local95 = -local14.anInt1026 - 1;
					@Pc(100) Class4_Sub4_Sub3_Sub1_Sub2 local100;
					if (Static41.anInt1148 == local95) {
						local100 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1;
					} else {
						local100 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local95];
					}
					if (local100 != null && local100.anInt1393 >= 0 && local100.anInt1393 < 13312 && local100.anInt1416 >= 0 && local100.anInt1416 < 13312) {
						local14.method656(local100.anInt1416, Static78.anInt1981, local100.anInt1393, Static67.method1133(local14.anInt1034, local100.anInt1393, local100.anInt1416) - local14.anInt1036);
					}
				}
				local14.method655(Static1.anInt5);
				Static54.aClass81_10.method1975(Static124.anInt2712, (int) local14.aDouble2, (int) local14.aDouble7, (int) local14.aDouble4, 60, local14, local14.anInt1027, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lclient!dd;")
	public static Class4_Sub8 method946(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		if (Static29.aClass4_Sub8ArrayArray1[local3] == null || Static29.aClass4_Sub8ArrayArray1[local3][local7] == null) {
			@Pc(27) boolean local27 = Static45.method816(local3);
			if (!local27) {
				return null;
			}
		}
		return Static29.aClass4_Sub8ArrayArray1[local3][local7];
	}
}
