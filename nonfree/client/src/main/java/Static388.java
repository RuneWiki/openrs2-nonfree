import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[S")
	public static short[] aShortArray83;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "[I")
	public static final int[] anIntArray510 = new int[250];

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public static int anInt7269 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBIIII)V")
	public static void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static434.method6629(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(60) int local60;
		@Pc(68) int local68;
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (Static96.anInt2302 <= arg5 && Static289.anInt5545 >= arg5) {
			@Pc(51) int[] local51 = Static183.anIntArrayArray26[arg5];
			local60 = Static501.method4264(arg4 - arg1, Class179_Sub2.lb, Static376.anInt7071);
			local68 = Static501.method4264(arg1 + arg4, Class179_Sub2.lb, Static376.anInt7071);
			local76 = Static501.method4264(arg4 - local15, Class179_Sub2.lb, Static376.anInt7071);
			local84 = Static501.method4264(local15 + arg4, Class179_Sub2.lb, Static376.anInt7071);
			Static115.method2332(local60, local76, arg2, local51);
			Static115.method2332(local76, local84, arg3, local51);
			Static115.method2332(local84, local68, arg2, local51);
		}
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local29 += local33;
			local24 += local31;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				Static158.anIntArray236[local26] = local10;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(252) int local252;
			@Pc(260) int local260;
			@Pc(267) int[] local267;
			@Pc(154) int local154;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local154 = arg5 - local21;
				local60 = local21 + arg5;
				if (Static96.anInt2302 <= local60 && Static289.anInt5545 >= local154) {
					if (local21 >= local15) {
						local68 = Static501.method4264(local10 + arg4, Class179_Sub2.lb, Static376.anInt7071);
						local76 = Static501.method4264(arg4 - local10, Class179_Sub2.lb, Static376.anInt7071);
						if (Static289.anInt5545 >= local60) {
							Static115.method2332(local76, local68, arg2, Static183.anIntArrayArray26[local60]);
						}
						if (local154 >= Static96.anInt2302) {
							Static115.method2332(local76, local68, arg2, Static183.anIntArrayArray26[local154]);
						}
					} else {
						local68 = Static158.anIntArray236[local21];
						local76 = Static501.method4264(arg4 + local10, Class179_Sub2.lb, Static376.anInt7071);
						local84 = Static501.method4264(arg4 - local10, Class179_Sub2.lb, Static376.anInt7071);
						local252 = Static501.method4264(arg4 + local68, Class179_Sub2.lb, Static376.anInt7071);
						local260 = Static501.method4264(arg4 - local68, Class179_Sub2.lb, Static376.anInt7071);
						if (local60 <= Static289.anInt5545) {
							local267 = Static183.anIntArrayArray26[local60];
							Static115.method2332(local84, local260, arg2, local267);
							Static115.method2332(local260, local252, arg3, local267);
							Static115.method2332(local252, local76, arg2, local267);
						}
						if (local154 >= Static96.anInt2302) {
							local267 = Static183.anIntArrayArray26[local154];
							Static115.method2332(local84, local260, arg2, local267);
							Static115.method2332(local260, local252, arg3, local267);
							Static115.method2332(local252, local76, arg2, local267);
						}
					}
				}
			}
			local154 = arg5 - local10;
			local60 = arg5 + local10;
			if (local60 >= Static96.anInt2302 && Static289.anInt5545 >= local154) {
				local68 = arg4 + local21;
				local76 = arg4 - local21;
				if (Static376.anInt7071 <= local68 && local76 <= Class179_Sub2.lb) {
					local68 = Static501.method4264(local68, Class179_Sub2.lb, Static376.anInt7071);
					local76 = Static501.method4264(local76, Class179_Sub2.lb, Static376.anInt7071);
					if (local15 <= local10) {
						if (Static289.anInt5545 >= local60) {
							Static115.method2332(local76, local68, arg2, Static183.anIntArrayArray26[local60]);
						}
						if (Static96.anInt2302 <= local154) {
							Static115.method2332(local76, local68, arg2, Static183.anIntArrayArray26[local154]);
						}
					} else {
						local84 = local10 > local26 ? Static158.anIntArray236[local10] : local26;
						local252 = Static501.method4264(arg4 + local84, Class179_Sub2.lb, Static376.anInt7071);
						local260 = Static501.method4264(arg4 - local84, Class179_Sub2.lb, Static376.anInt7071);
						if (local60 <= Static289.anInt5545) {
							local267 = Static183.anIntArrayArray26[local60];
							Static115.method2332(local76, local260, arg2, local267);
							Static115.method2332(local260, local252, arg3, local267);
							Static115.method2332(local252, local68, arg2, local267);
						}
						if (local154 >= Static96.anInt2302) {
							local267 = Static183.anIntArrayArray26[local154];
							Static115.method2332(local76, local260, arg2, local267);
							Static115.method2332(local260, local252, arg3, local267);
							Static115.method2332(local252, local68, arg2, local267);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method6097() {
		for (@Pc(8) int local8 = 0; local8 < Static208.anInt4409; local8++) {
			@Pc(14) int local14 = Static70.anIntArray111[local8];
			@Pc(21) Class6_Sub33 local21 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local14);
			if (local21 != null) {
				@Pc(26) Class11_Sub1_Sub1_Sub1 local26 = local21.aClass11_Sub1_Sub1_Sub1_2;
				Static370.method5897(local26, local26.aClass222_1.anInt6248);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
	public static int method6098(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	public static void method6099() {
		Static418.aClass211_20.method5179();
		Static177.aClass211_26.method5179();
		@Pc(21) int local21;
		for (@Pc(16) Class6_Sub42 local16 = (Class6_Sub42) Static207.aClass211_29.method5183(); local16 != null; local16 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			local21 = local16.anInt8285;
			if (local21 < 1000) {
				local16.method8151();
				if (local21 == 18 || local21 == 30 || local21 == 23 || local21 == 44 || local21 == 4 || local21 == 49 || local21 == 20) {
					Static177.aClass211_26.method5173(local16);
				} else {
					Static418.aClass211_20.method5173(local16);
				}
			}
		}
		Static418.aClass211_20.method5171(Static207.aClass211_29);
		Static177.aClass211_26.method5171(Static207.aClass211_29);
		if (Static205.anInt4369 <= 1) {
			Static567.aClass6_Sub42_4 = null;
		} else if (Static478.aBoolean650 && Static387.aClass273_1.method6617(81) && Static205.anInt4369 > 2) {
			Static567.aClass6_Sub42_4 = (Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284.aClass6_284;
		} else {
			Static567.aClass6_Sub42_4 = (Class6_Sub42) Static207.aClass211_29.aClass6_154.aClass6_284;
		}
		local21 = -1;
		@Pc(122) Class6_Sub39 local122 = (Class6_Sub39) Static512.aClass211_67.method5183();
		if (local122 != null) {
			local21 = local122.method8017();
		}
		if (!Static218.aBoolean366) {
			if (local21 == 0 && (Static37.anInt1211 == 1 && Static205.anInt4369 > 2 || Static11.method625())) {
				local21 = 2;
			}
			if (local21 == 2 && Static205.anInt4369 > 0 && local122 != null) {
				if (Static122.aClass93_7 == null && Static119.anInt2418 == 0) {
					Static529.method7713(local122.method8012(), local122.method8018());
				} else {
					Static31.anInt1033 = 2;
				}
			}
			if (local21 == 0 && Static205.anInt4369 > 0) {
				Static468.method7217();
			}
			if (Static122.aClass93_7 == null && Static119.anInt2418 == 0) {
				Static410.aClass6_Sub42_3 = null;
				Static31.anInt1033 = 0;
				return;
			}
			return;
		}
		@Pc(210) int local210;
		@Pc(214) int local214;
		if (local21 == -1) {
			local210 = Static401.aClass4_1.method1216();
			local214 = Static401.aClass4_1.method1215();
			if (local210 < Static69.anInt1684 - 10 || Static24.anInt8441 + Static69.anInt1684 + 10 < local210 || Static230.anInt4775 - 10 > local214 || local214 > Static430.anInt868 + Static230.anInt4775 + 10) {
				Static581.method8173();
			}
		}
		if (local21 != 0) {
			return;
		}
		local210 = Static69.anInt1684;
		local214 = Static230.anInt4775;
		@Pc(260) int local260 = Static24.anInt8441;
		@Pc(264) int local264 = local122.method8012();
		@Pc(268) int local268 = local122.method8018();
		@Pc(270) int local270 = -1;
		@Pc(288) int local288;
		for (@Pc(272) int local272 = 0; local272 < Static205.anInt4369; local272++) {
			if (Static28.aBoolean82) {
				local288 = local214 + (Static205.anInt4369 - local272 - 1) * 16 + 33;
				if (local210 < local264 && local260 + local210 > local264 && local288 - 13 < local268 && local268 < local288 + 4) {
					local270 = local272;
				}
			} else {
				local288 = (Static205.anInt4369 - local272 - 1) * 16 + local214 + 31;
				if (local264 > local210 && local264 < local260 + local210 && local288 - 13 < local268 && local288 + 3 > local268) {
					local270 = local272;
				}
			}
		}
		if (local270 != -1) {
			local288 = 0;
			@Pc(379) Class97 local379 = new Class97(Static207.aClass211_29);
			for (@Pc(384) Class6_Sub42 local384 = (Class6_Sub42) local379.method2517(); local384 != null; local384 = (Class6_Sub42) local379.method2512()) {
				if (local288 == local270) {
					Static204.method3798(local384, local268, local264);
				}
				local288++;
			}
		}
		Static581.method8173();
	}
}
