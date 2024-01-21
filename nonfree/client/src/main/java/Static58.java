import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!je", name = "E", descriptor = "Lclient!kb;")
	public static Class41 aClass41_7;

	@OriginalMember(owner = "client!je", name = "N", descriptor = "Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3 aClass1_Sub3_Sub1_Sub3_3;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!af;")
	public static Class5 aClass5_720 = Static45.method1937("::fpsoff");

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_721 = Static45.method1937("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!je", name = "J", descriptor = "Lclient!af;")
	public static Class5 aClass5_722 = Static45.method1937("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!je", name = "M", descriptor = "Lclient!rd;")
	public static Class1_Sub20 aClass1_Sub20_4 = new Class1_Sub20(8);

	@OriginalMember(owner = "client!je", name = "U", descriptor = "Lclient!af;")
	public static Class5 aClass5_723 = Static45.method1937("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static8.method244(arg4)) {
			Static127.aClass1_Sub17Array2 = null;
			Static73.method1251(arg5, arg6, arg0, Static49.aClass1_Sub17ArrayArray1[arg4], arg7, arg3, arg2, -1, arg1);
			if (Static127.aClass1_Sub17Array2 != null) {
				Static73.method1251(arg5, arg6, Static60.anInt1447, Static127.aClass1_Sub17Array2, Static95.anInt2356, arg3, arg2, -1412584499, arg1);
				Static127.aClass1_Sub17Array2 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static1.aBooleanArray1[local20] = true;
			}
		} else {
			Static1.aBooleanArray1[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILclient!fd;)V")
	private static void method1054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub3_Sub1_Sub2 arg4) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static109.method1890(arg0, arg1, arg2, arg3, arg4);
			return;
		}
		@Pc(40) int local40 = Static3.anInt58 + Static21.anInt748 & 0x7FF;
		@Pc(44) int local44 = Class1_Sub3_Sub1_Sub4.anIntArray425[local40];
		@Pc(48) int local48 = Class1_Sub3_Sub1_Sub4.anIntArray424[local40];
		@Pc(56) int local56 = local48 * 256 / (Static98.anInt2404 + 256);
		@Pc(64) int local64 = local44 * 256 / (Static98.anInt2404 + 256);
		@Pc(74) int local74 = local56 * arg3 + local64 * arg2 >> 16;
		@Pc(85) int local85 = arg2 * local56 - arg3 * local64 >> 16;
		@Pc(91) double local91 = Math.atan2((double) local74, (double) local85);
		@Pc(97) int local97 = (int) (Math.sin(local91) * 63.0D);
		@Pc(103) int local103 = (int) (Math.cos(local91) * 57.0D);
		Static56.aClass1_Sub3_Sub1_Sub2_4.method744(local97 + arg1 + 94 + 4 - 10, -local103 + -20 + arg0 - -83, local91);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILclient!kb;)Z")
	public static boolean method1055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(9) byte[] local9 = arg2.method1710(arg1, arg0);
		if (local9 == null) {
			return false;
		} else {
			Static39.method773(local9);
			return true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZII)V")
	public static void method1056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static101.method1733();
		Static33.method1981(arg1, arg2, Static81.aClass1_Sub3_Sub1_Sub3_4.anInt2443 + arg1, arg2 + Static81.aClass1_Sub3_Sub1_Sub3_4.anInt2442);
		if (Static115.anInt2885 == 2 || Static115.anInt2885 == 5) {
			Static33.method1974(arg1 + 25, arg2 - -5, Static90.anIntArray337, Static12.anIntArray462);
		} else {
			@Pc(46) int local46 = Static3.anInt58 + Static21.anInt748 & 0x7FF;
			@Pc(53) int local53 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32 + 48;
			@Pc(61) int local61 = 464 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
			Static8.aClass1_Sub3_Sub1_Sub2_1.method755(arg1 + 25, arg2 + 5, 146, 151, local53, local61, local46, Static98.anInt2404 + 256, Static90.anIntArray337, Static12.anIntArray462);
			@Pc(97) int local97;
			@Pc(110) int local110;
			for (@Pc(81) int local81 = 0; local81 < Static20.anInt652; local81++) {
				local97 = Static9.anIntArray38[local81] * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
				local110 = Static1.anIntArray12[local81] * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
				Static109.method1890(arg2, arg1, local110, local97, Static112.aClass1_Sub3_Sub1_Sub2Array9[local81]);
			}
			@Pc(152) int local152;
			@Pc(164) int local164;
			for (local97 = 0; local97 < 104; local97++) {
				for (local110 = 0; local110 < 104; local110++) {
					@Pc(139) Class53 local139 = Static8.aClass53ArrayArrayArray1[Static7.anInt213][local97][local110];
					if (local139 != null) {
						local152 = local97 * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
						local164 = local110 * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
						Static109.method1890(arg2, arg1, local164, local152, Static101.aClass1_Sub3_Sub1_Sub2Array8[0]);
					}
				}
			}
			@Pc(243) int local243;
			for (local110 = 0; local110 < Static93.anInt2338; local110++) {
				@Pc(195) Class1_Sub3_Sub4_Sub2_Sub2 local195 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[Static131.anIntArray468[local110]];
				if (local195 != null && local195.method2159()) {
					@Pc(204) Class1_Sub3_Sub12 local204 = local195.aClass1_Sub3_Sub12_1;
					if (local204 != null && local204.anIntArray324 != null) {
						local204 = local204.method1475();
					}
					if (local204 != null && local204.aBoolean74 && local204.aBoolean73) {
						local164 = local195.anInt3089 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
						local243 = local195.anInt3079 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
						Static109.method1890(arg2, arg1, local243, local164, Static101.aClass1_Sub3_Sub1_Sub2Array8[1]);
					}
				}
			}
			@Pc(266) Class1_Sub3_Sub4_Sub2_Sub1 local266;
			for (@Pc(258) int local258 = 0; local258 < Static111.anInt2739; local258++) {
				local266 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static77.anIntArray299[local258]];
				if (local266 != null && local266.method2159()) {
					local243 = local266.anInt3079 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
					local164 = local266.anInt3089 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
					@Pc(296) boolean local296 = false;
					@Pc(301) long local301 = local266.aClass5_985.method193();
					for (@Pc(303) int local303 = 0; local303 < Static20.anInt658; local303++) {
						if (local301 == Static86.aLongArray3[local303] && Static117.anIntArray458[local303] != 0) {
							local296 = true;
							break;
						}
					}
					@Pc(332) boolean local332 = false;
					if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2000 != 0 && local266.anInt2000 != 0 && Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt2000 == local266.anInt2000) {
						local332 = true;
					}
					if (local296) {
						Static109.method1890(arg2, arg1, local243, local164, Static101.aClass1_Sub3_Sub1_Sub2Array8[3]);
					} else if (local332) {
						Static109.method1890(arg2, arg1, local243, local164, Static101.aClass1_Sub3_Sub1_Sub2Array8[4]);
					} else {
						Static109.method1890(arg2, arg1, local243, local164, Static101.aClass1_Sub3_Sub1_Sub2Array8[2]);
					}
				}
			}
			if (Static23.anInt750 != 0 && Static131.anInt3270 % 20 < 10) {
				if (Static23.anInt750 == 1 && Static63.anInt1755 >= 0 && Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1.length > Static63.anInt1755) {
					@Pc(416) Class1_Sub3_Sub4_Sub2_Sub2 local416 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[Static63.anInt1755];
					if (local416 != null) {
						local243 = local416.anInt3079 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
						local164 = local416.anInt3089 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
						method1054(arg2, arg1, local243, local164, Static2.aClass1_Sub3_Sub1_Sub2Array1[1]);
					}
				}
				if (Static23.anInt750 == 2) {
					local164 = (Static115.anInt2845 - Static32.anInt927) * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
					local152 = (-Static129.anInt3262 + Static40.anInt1044) * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
					method1054(arg2, arg1, local164, local152, Static2.aClass1_Sub3_Sub1_Sub2Array1[1]);
				}
				if (Static23.anInt750 == 10 && Static127.anInt3248 >= 0 && Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1.length > Static127.anInt3248) {
					local266 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static127.anInt3248];
					if (local266 != null) {
						local164 = local266.anInt3089 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
						local243 = local266.anInt3079 / 32 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
						method1054(arg2, arg1, local243, local164, Static2.aClass1_Sub3_Sub1_Sub2Array1[1]);
					}
				}
			}
			if (Static39.anInt1037 != 0) {
				local152 = Static39.anInt1037 * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089 / 32;
				local164 = Static75.anInt1750 * 4 + 2 - Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079 / 32;
				Static109.method1890(arg2, arg1, local164, local152, Static2.aClass1_Sub3_Sub1_Sub2Array1[0]);
			}
			Static33.method1984(arg1 + 4 + 93, arg2 + 78, 3, 3, 16777215);
		}
		if (Static115.anInt2885 < 3) {
			Static55.aClass1_Sub3_Sub1_Sub2_3.method755(arg1, arg2, 33, 33, 25, 25, Static3.anInt58, 256, Static56.anIntArray220, Static44.anIntArray188);
		} else {
			Static33.method1974(arg1, arg2, Static56.anIntArray220, Static44.anIntArray188);
		}
		if (Static64.aBooleanArray18[arg0]) {
			Static81.aClass1_Sub3_Sub1_Sub3_4.method1687(arg1, arg2);
		}
		Static113.aBooleanArray25[arg0] = true;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method1057() {
		aClass5_723 = null;
		aClass5_720 = null;
		aClass5_722 = null;
		aClass1_Sub20_4 = null;
		aClass41_7 = null;
		aClass5_721 = null;
		aClass1_Sub3_Sub1_Sub3_3 = null;
	}
}
