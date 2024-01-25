import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_252 = new Class22(70, 4);

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_69 = new Class215(44, -1);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZBIIZ)V")
	public static void method4167(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static169.anInt3265 == arg2 && arg1 == Static453.anInt7373 && (Static317.anInt5523 == Static263.anInt4963 || Static323.aClass50_Sub1_1.method2861(Static177.anInt2973))) {
			return;
		}
		Static169.anInt3265 = arg2;
		Static453.anInt7373 = arg1;
		Static317.anInt5523 = Static263.anInt4963;
		if (Static323.aClass50_Sub1_1.method2861(Static177.anInt2973)) {
			Static317.anInt5523 = 0;
		}
		if (arg0) {
			Static187.method2932(28);
		} else {
			Static187.method2932(25);
		}
		Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423), Static207.aClass46_9);
		@Pc(59) int local59 = Static180.anInt3453;
		Static180.anInt3453 = (Static169.anInt3265 - (Static326.anInt5666 >> 4)) * 8;
		@Pc(70) int local70 = Static86.anInt1771;
		Static86.anInt1771 = (Static453.anInt7373 - (Static283.anInt5187 >> 4)) * 8;
		Static197.aClass4_Sub1_Sub5_2 = Static148.method4494(Static169.anInt3265 * 8, Static453.anInt7373 * 8);
		Static292.aClass195_2 = null;
		@Pc(92) int local92 = Static180.anInt3453 - local59;
		@Pc(97) int local97 = Static86.anInt1771 - local70;
		@Pc(107) int local107;
		@Pc(115) int local115;
		if (arg0) {
			Static12.anInt163 = 0;
			local107 = (Static326.anInt5666 - 1) * 128;
			@Pc(113) int local113 = Static283.anInt5187 * 128 - 128;
			for (local115 = 0; local115 < 32768; local115++) {
				@Pc(121) Class16_Sub1_Sub5_Sub2 local121 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local115];
				if (local121 != null) {
					local121.anInt6892 -= local97 * 128;
					local121.anInt6893 -= local92 * 128;
					if (local121.anInt6893 >= 0 && local107 >= local121.anInt6893 && local121.anInt6892 >= 0 && local113 >= local121.anInt6892) {
						@Pc(162) boolean local162 = true;
						for (@Pc(164) int local164 = 0; local164 < 10; local164++) {
							local121.anIntArray426[local164] -= local92;
							local121.anIntArray427[local164] -= local97;
							if (local121.anIntArray426[local164] < 0 || Static326.anInt5666 <= local121.anIntArray426[local164] || local121.anIntArray427[local164] < 0 || Static283.anInt5187 <= local121.anIntArray427[local164]) {
								local162 = false;
							}
						}
						if (local162) {
							Static342.anIntArray412[Static12.anInt163++] = local115;
						} else {
							Static143.aClass16_Sub1_Sub5_Sub2Array1[local115].method4766(null);
							Static143.aClass16_Sub1_Sub5_Sub2Array1[local115] = null;
						}
					} else {
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local115].method4766(null);
						Static143.aClass16_Sub1_Sub5_Sub2Array1[local115] = null;
					}
				}
			}
		} else {
			for (local107 = 0; local107 < 32768; local107++) {
				@Pc(270) Class16_Sub1_Sub5_Sub2 local270 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local107];
				if (local270 != null) {
					for (local115 = 0; local115 < 10; local115++) {
						local270.anIntArray426[local115] -= local92;
						local270.anIntArray427[local115] -= local97;
					}
					local270.anInt6892 -= local97 * 128;
					local270.anInt6893 -= local92 * 128;
				}
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(326) Class16_Sub1_Sub5_Sub1 local326 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local107];
			if (local326 != null) {
				for (local115 = 0; local115 < 10; local115++) {
					local326.anIntArray426[local115] -= local92;
					local326.anIntArray427[local115] -= local97;
				}
				local326.anInt6892 -= local97 * 128;
				local326.anInt6893 -= local92 * 128;
			}
		}
		@Pc(378) Class38[] local378 = Static306.aClass38Array1;
		for (local115 = 0; local115 < local378.length; local115++) {
			@Pc(386) Class38 local386 = local378[local115];
			if (local386 != null) {
				local386.anInt894 -= local97 * 128;
				local386.anInt892 -= local92 * 128;
			}
		}
		Static203.method3177(local92, local97);
		for (@Pc(418) Class4_Sub9 local418 = (Class4_Sub9) Static115.aClass183_15.method4140(); local418 != null; local418 = (Class4_Sub9) Static115.aClass183_15.method4144()) {
			local418.anInt790 -= local97;
			local418.anInt793 -= local92;
			if (Static448.anInt7307 != 3 && (local418.anInt793 < 0 || local418.anInt790 < 0 || local418.anInt793 >= Static326.anInt5666 || local418.anInt790 >= Static283.anInt5187)) {
				local418.method5684();
			}
		}
		if (Static343.anInt771 != 0) {
			Static343.anInt771 -= local92;
			Static60.anInt1094 -= local97;
		}
		Static147.method2462();
		if (arg0) {
			Static188.anInt5355 -= local97;
			Static163.anInt3197 -= local92 * 128;
			Static111.anInt2379 -= local92;
			Static419.anInt6924 -= local97;
			Static145.anInt2906 -= local97 * 128;
			Static146.anInt266 -= local92;
			if (Math.abs(local92) > Static326.anInt5666 || Math.abs(local97) > Static283.anInt5187) {
				Static222.method3355();
			}
		} else if (Static111.anInt2386 == 4) {
			Static325.anInt5636 -= local97 * 128;
			Static428.anInt7059 -= local92 * 128;
			Static452.anInt7360 -= local97 * 128;
			Static394.anInt6578 -= local92 * 128;
		} else {
			Static111.anInt2386 = 1;
		}
		Static103.method1816();
		Static277.method3932();
		Static292.aClass183_36.method4138();
		Static27.aClass183_2.method4138();
		Static276.aClass84_4.method2310();
		Static9.method90();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
	public static void method4169(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static148.aFloat179 = 3.0F;
		} else if (arg0 == 50) {
			Static148.aFloat179 = 4.0F;
		} else if (arg0 == 75) {
			Static148.aFloat179 = 6.0F;
		} else if (arg0 == 100) {
			Static148.aFloat179 = 8.0F;
		} else if (arg0 == 200) {
			Static148.aFloat179 = 16.0F;
		}
		Static71.anInt6920 = -1;
		Static71.anInt6920 = -1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public static void method4170() {
		if (Static308.aBoolean487) {
			return;
		}
		Static308.aBoolean487 = true;
		Static251.aBoolean429 = true;
		if (Static323.aClass50_Sub1_1.aBoolean303) {
			Static368.aFloat192 = (int) Static368.aFloat192 - 65 & 0xFFFFFF80;
		} else {
			Static380.aFloat195 += (-24.0F - Static380.aFloat195) / 2.0F;
		}
	}
}
