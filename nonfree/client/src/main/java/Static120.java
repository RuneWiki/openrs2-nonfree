import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	public static int anInt2636;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public static int[] anIntArray238 = new int[2];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBZI)I")
	public static int method2042(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class4_Sub32 local20 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg2);
		if (local20 == null) {
			return 0;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local20.anIntArray480.length; local28++) {
			if (local20.anIntArray480[local28] >= 0 && local20.anIntArray480[local28] < Static225.anInt4475) {
				@Pc(60) Class163 local60 = Static277.method4117(local20.anIntArray480[local28]);
				if (local60.aClass97_19 != null) {
					@Pc(73) Class4_Sub19 local73 = (Class4_Sub19) local60.aClass97_19.method2360((long) arg0);
					if (local73 != null) {
						if (arg1) {
							local26 += local20.anIntArray482[local28] * local73.anInt2869;
						} else {
							local26 += local73.anInt2869;
						}
					}
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
	public static void method2043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = arg2;
		@Pc(22) int local22 = Static142.method2311(arg1 + arg2, Static154.anInt3126, Static211.anInt4200);
		@Pc(31) int local31 = Static142.method2311(arg1 - arg2, Static154.anInt3126, Static211.anInt4200);
		Static129.method2127(local22, local31, arg3, Static234.anIntArrayArray40[arg0]);
		while (local9 < local14) {
			local7 += 2;
			local12 += local7;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(84) int local84;
			@Pc(93) int local93;
			if (local12 > 0) {
				local14--;
				local12 -= local14 << 1;
				local62 = arg0 - local14;
				local66 = local14 + arg0;
				if (local66 >= Static171.anInt3392 && local62 <= Static141.anInt2889) {
					local84 = Static142.method2311(local9 + arg1, Static154.anInt3126, Static211.anInt4200);
					local93 = Static142.method2311(arg1 - local9, Static154.anInt3126, Static211.anInt4200);
					if (local66 <= Static141.anInt2889) {
						Static129.method2127(local84, local93, arg3, Static234.anIntArrayArray40[local66]);
					}
					if (Static171.anInt3392 <= local62) {
						Static129.method2127(local84, local93, arg3, Static234.anIntArrayArray40[local62]);
					}
				}
			}
			local9++;
			local66 = arg0 + local9;
			local62 = arg0 - local9;
			if (local66 >= Static171.anInt3392 && local62 <= Static141.anInt2889) {
				local84 = Static142.method2311(arg1 + local14, Static154.anInt3126, Static211.anInt4200);
				local93 = Static142.method2311(arg1 - local14, Static154.anInt3126, Static211.anInt4200);
				if (Static141.anInt2889 >= local66) {
					Static129.method2127(local84, local93, arg3, Static234.anIntArrayArray40[local66]);
				}
				if (local62 >= Static171.anInt3392) {
					Static129.method2127(local84, local93, arg3, Static234.anIntArrayArray40[local62]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method2044() {
		Static158.aClass33_27.method839();
		Static215.aClass33_31.method839();
		Static6.aClass33_2.method839();
		Static40.aClass33_5.method839();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method2045() {
		if (Static209.anInt5551 == 2) {
			if (Static273.anInt1118 == Static24.anInt440 && Static105.anInt2256 == Static53.anInt1061) {
				Static209.anInt5551 = 0;
				if (Static86.aBoolean133 && Static96.aBooleanArray15[81] && Static60.anInt1152 > 2) {
					Static15.method265(Static60.anInt1152 - 2);
				} else {
					Static15.method265(Static60.anInt1152 - 1);
				}
			}
		} else if (Static35.anInt708 == Static273.anInt1118 && Static147.anInt2993 == Static105.anInt2256) {
			Static209.anInt5551 = 0;
			if (Static86.aBoolean133 && Static96.aBooleanArray15[81] && Static60.anInt1152 > 2) {
				Static15.method265(Static60.anInt1152 - 2);
			} else {
				Static15.method265(Static60.anInt1152 - 1);
			}
		} else {
			Static209.anInt5551 = 2;
			Static24.anInt440 = Static35.anInt708;
			Static53.anInt1061 = Static147.anInt2993;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	public static void method2046() {
		anIntArray238 = null;
		anIntArrayArray23 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!lc;I)V")
	public static void method2048(@OriginalArg(0) Class98 arg0) {
		Static240.aClass4_Sub2_Sub1_Sub1Array7 = Static248.method3757(Static148.anInt2996, arg0);
		Static104.aClass4_Sub2_Sub1Array7 = Static275.method4101(arg0, Static223.anInt4439);
		Static278.aClass4_Sub2_Sub1Array13 = Static275.method4101(arg0, Static65.anInt1224);
		Static124.aClass4_Sub2_Sub1Array8 = Static275.method4101(arg0, Static219.anInt4341);
		Static34.aClass4_Sub2_Sub1Array2 = Static275.method4101(arg0, Static298.anInt5541);
		Static39.aClass4_Sub2_Sub1Array12 = Static275.method4101(arg0, Static205.anInt4001);
		Static81.aClass4_Sub2_Sub1Array10 = Static275.method4101(arg0, Static21.anInt4304);
		Static251.aClass4_Sub2_Sub1_9 = Static112.method1923(arg0, Static24.anInt438);
		Static55.aClass4_Sub2_Sub1Array4 = Static99.method1614(Static46.anInt911, arg0);
		Static1.aClass4_Sub2_Sub1Array1 = Static99.method1614(Static46.anInt916, arg0);
		Static10.aClass59Array1 = Static51.method852(Static2.anInt17, arg0);
		Static88.aClass59Array2 = Static51.method852(Static174.anInt3436, arg0);
		Static79.aClass4_Sub2_Sub12_2.method4199(Static88.aClass59Array2, null);
		Static49.aClass4_Sub2_Sub12_1.method4199(Static88.aClass59Array2, null);
		Static289.aClass4_Sub2_Sub12_3.method4199(Static88.aClass59Array2, null);
		if (Static178.aBoolean216) {
			Static64.aClass59_Sub2Array1 = Static264.method3979(Static149.anInt3031, arg0);
			for (@Pc(99) int local99 = 0; local99 < Static64.aClass59_Sub2Array1.length; local99++) {
				Static64.aClass59_Sub2Array1[local99].method3796();
			}
		}
		@Pc(120) Class4_Sub2_Sub1_Sub1 local120 = Static165.method2603(Static53.anInt1064, 0, arg0);
		local120.method3470();
		if (Static178.aBoolean216) {
			Static111.aClass4_Sub2_Sub1_3 = new Class4_Sub2_Sub1_Sub2(local120);
		} else {
			Static111.aClass4_Sub2_Sub1_3 = local120;
		}
		@Pc(139) Class4_Sub2_Sub1_Sub1[] local139 = Static248.method3757(Static152.anInt3087, arg0);
		@Pc(141) int local141;
		for (local141 = 0; local141 < local139.length; local141++) {
			local139[local141].method3470();
		}
		if (Static178.aBoolean216) {
			Static254.aClass4_Sub2_Sub1Array11 = new Class4_Sub2_Sub1[local139.length];
			for (local141 = 0; local141 < local139.length; local141++) {
				Static254.aClass4_Sub2_Sub1Array11[local141] = new Class4_Sub2_Sub1_Sub2(local139[local141]);
			}
		} else {
			Static254.aClass4_Sub2_Sub1Array11 = local139;
		}
		local141 = (int) (Math.random() * 21.0D) - 10;
		@Pc(202) int local202 = (int) (Math.random() * 21.0D) - 10;
		@Pc(209) int local209 = (int) (Math.random() * 21.0D) - 10;
		@Pc(216) int local216 = (int) (Math.random() * 41.0D) - 20;
		@Pc(218) int local218;
		for (local218 = 0; local218 < Static240.aClass4_Sub2_Sub1_Sub1Array7.length; local218++) {
			Static240.aClass4_Sub2_Sub1_Sub1Array7[local218].method3477(local141 + local216, local216 + local202, local216 + local209);
		}
		if (Static178.aBoolean216) {
			Static61.aClass4_Sub2_Sub1Array5 = new Class4_Sub2_Sub1[Static240.aClass4_Sub2_Sub1_Sub1Array7.length];
			for (local218 = 0; local218 < Static240.aClass4_Sub2_Sub1_Sub1Array7.length; local218++) {
				Static61.aClass4_Sub2_Sub1Array5[local218] = new Class4_Sub2_Sub1_Sub2(Static240.aClass4_Sub2_Sub1_Sub1Array7[local218]);
			}
		} else {
			Static61.aClass4_Sub2_Sub1Array5 = Static240.aClass4_Sub2_Sub1_Sub1Array7;
		}
	}
}
