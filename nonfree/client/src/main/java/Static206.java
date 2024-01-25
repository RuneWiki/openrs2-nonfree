import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public static int anInt4136;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!qj;")
	public static Class165 aClass165_64;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString167 = "Examine";

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBLclient!rg;I)V")
	public static void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte54 == 0) {
			arg1.anInt5177 = arg1.anInt5257;
		} else if (arg1.aByte54 == 1) {
			arg1.anInt5177 = (arg2 - arg1.anInt5209) / 2 + arg1.anInt5257;
		} else if (arg1.aByte54 == 2) {
			arg1.anInt5177 = arg2 - arg1.anInt5209 - arg1.anInt5257;
		} else if (arg1.aByte54 == 3) {
			arg1.anInt5177 = arg1.anInt5257 * arg2 >> 14;
		} else if (arg1.aByte54 == 4) {
			arg1.anInt5177 = (arg1.anInt5257 * arg2 >> 14) + (arg2 - arg1.anInt5209) / 2;
		} else {
			arg1.anInt5177 = arg2 - arg1.anInt5209 - (arg2 * arg1.anInt5257 >> 14);
		}
		if (arg1.aByte56 == 0) {
			arg1.anInt5201 = arg1.anInt5185;
		} else if (arg1.aByte56 == 1) {
			arg1.anInt5201 = (arg0 - arg1.anInt5179) / 2 + arg1.anInt5185;
		} else if (arg1.aByte56 == 2) {
			arg1.anInt5201 = arg0 - arg1.anInt5179 - arg1.anInt5185;
		} else if (arg1.aByte56 == 3) {
			arg1.anInt5201 = arg0 * arg1.anInt5185 >> 14;
		} else if (arg1.aByte56 == 4) {
			arg1.anInt5201 = (arg0 - arg1.anInt5179) / 2 + (arg1.anInt5185 * arg0 >> 14);
		} else {
			arg1.anInt5201 = arg0 - (arg0 * arg1.anInt5185 >> 14) - arg1.anInt5179;
		}
		if (!Static25.aBoolean62 || Static47.method1096(arg1).anInt5507 == 0 && arg1.anInt5208 != 0) {
			return;
		}
		if (arg1.anInt5201 < 0) {
			arg1.anInt5201 = 0;
		} else if (arg0 < arg1.anInt5179 + arg1.anInt5201) {
			arg1.anInt5201 = arg0 - arg1.anInt5179;
		}
		if (arg1.anInt5177 < 0) {
			arg1.anInt5177 = 0;
		} else if (arg1.anInt5209 + arg1.anInt5177 > arg2) {
			arg1.anInt5177 = arg2 - arg1.anInt5209;
			return;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)I")
	public static int method3822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local9 ^ local9 << 13;
		@Pc(37) int local37 = Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg3 < 1 || Static48.anInt1107 - 2 < arg0 || arg3 > Static337.anInt6402 - 2) {
			return;
		}
		if (!Static123.method2195() && !Static350.method5668(Static47.anInt1095, arg0, arg7, arg3)) {
			return;
		}
		if (Static138.aClass204ArrayArrayArray1 == null) {
			return;
		}
		@Pc(37) int local37 = arg7;
		if (arg7 < 3 && Static153.method2918(arg3, arg0)) {
			local37 = arg7 + 1;
		}
		Static50.method1130(local37, arg0, arg3, arg5, Static24.aClass91Array1[arg7], arg7, Static34.aClass2_6);
		if (arg1 >= 0) {
			@Pc(64) boolean local64 = Static217.aBoolean365;
			Static217.aBoolean365 = true;
			Static293.method5028(Static24.aClass91Array1[arg7], arg4, arg2, false, Static34.aClass2_6, arg3, local37, arg0, false, arg6, arg7, arg1);
			Static217.aBoolean365 = local64;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!cn;I)V")
	private static void method3828(@OriginalArg(0) Class15_Sub3 arg0) {
		arg0.aClass5_1 = null;
		@Pc(16) int local16 = arg0.aClass15_Sub2Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass15_Sub2Array1[local18].aBoolean51 = false;
		}
		@Pc(36) Class175[] local36 = Class123.aClass175Array1;
		synchronized (Class123.aClass175Array1) {
			if (Class123.aClass175Array1.length > local16 && Static341.anIntArray281[local16] < 200) {
				Class123.aClass175Array1[local16].method4672(arg0);
				@Pc(57) int local57 = Static341.anIntArray281[local16]++;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIB)Z")
	public static boolean method3829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface8 local9 = (Interface8) Static264.method4812(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static169.method4147(local9) & true;
		}
		local9 = (Interface8) Static66.method1372(arg0, arg2, arg1, tr.class);
		if (local9 != null) {
			local11 &= Static169.method4147(local9);
		}
		local9 = (Interface8) Static331.method5551(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static169.method4147(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!aa;IILclient!ci;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3830(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static271.aClass2_12 = arg0;
		Static164.anInt3423 = arg1;
		Static245.aClass21_7 = arg3;
		Static244.aBoolean397 = Static271.aClass2_12.method3312() > 0;
		Static199.anInt4061 = arg4 >> 7;
		Static268.anInt5167 = arg6 >> 7;
		Static175.anInt3627 = arg4;
		Static341.anInt2253 = arg6;
		Static35.anInt877 = arg5;
		Static285.anInt5515 = Static199.anInt4061 - Static346.anInt6451;
		if (Static285.anInt5515 < 0) {
			Static186.anInt3868 = -Static285.anInt5515;
			Static285.anInt5515 = 0;
		} else {
			Static186.anInt3868 = 0;
		}
		Static129.anInt2513 = Static268.anInt5167 - Static346.anInt6451;
		if (Static129.anInt2513 < 0) {
			Static112.anInt4018 = -Static129.anInt2513;
			Static129.anInt2513 = 0;
		} else {
			Static112.anInt4018 = 0;
		}
		Static132.anInt2570 = Static199.anInt4061 + Static346.anInt6451;
		if (Static132.anInt2570 > Static222.anInt4391) {
			Static132.anInt2570 = Static222.anInt4391;
		}
		Static70.anInt1449 = Static268.anInt5167 + Static346.anInt6451;
		if (Static70.anInt1449 > Static74.anInt3404) {
			Static70.anInt1449 = Static74.anInt3404;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static346.anInt6451 + Static346.anInt6451 + 2; local74++) {
			for (local77 = 0; local77 < Static346.anInt6451 + Static346.anInt6451 + 2; local77++) {
				local84 = Static199.anInt4061 + local74 - Static346.anInt6451;
				local90 = Static268.anInt5167 + local77 - Static346.anInt6451;
				if (local84 >= 0 && local90 >= 0 && local84 < Static222.anInt4391 && local90 < Static74.anInt3404) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static288.aClass41Array5[3].method5434(local84, local90) - 1000;
					@Pc(137) int local137 = Static236.aClass41Array4 == null ? Static288.aClass41Array5[0].method5434(local84, local90) + 128 : Static236.aClass41Array4[0].method5434(local84, local90) + 128;
					Static134.aBooleanArrayArray13[local74][local77] = Static271.aClass2_12.method3258(local104, local117, local108, local104, local137, local108);
				} else {
					Static134.aBooleanArrayArray13[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static346.anInt6451 + Static346.anInt6451 + 1; local77++) {
			for (local84 = 0; local84 < Static346.anInt6451 + Static346.anInt6451 + 1; local84++) {
				Static57.aBooleanArrayArray7[local77][local84] = Static134.aBooleanArrayArray13[local77][local84] || Static134.aBooleanArrayArray13[local77 + 1][local84] || Static134.aBooleanArrayArray13[local77][local84 + 1] || Static134.aBooleanArrayArray13[local77 + 1][local84 + 1];
			}
		}
		Static69.anIntArray163 = arg8;
		Static179.anIntArray431 = arg9;
		Static194.anIntArray473 = arg10;
		Static317.anIntArray764 = arg11;
		Static183.anIntArray448 = arg12;
		Static291.method4959();
		Static23.method586();
		for (@Pc(253) Class15_Sub3 local253 = (Class15_Sub3) Static46.aClass175_1.method4669(); local253 != null; local253 = (Class15_Sub3) Static46.aClass175_1.method4673()) {
			local253.method5441();
			method3828(local253);
		}
		if (Static244.aBoolean397) {
			for (local90 = 0; local90 < Static160.anInt3182; local90++) {
				Static327.aClass1_Sub31_Sub1Array3[local90].method4291(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static271.aClass2_12.method3272(0);
			if (Static202.aClass28_1 == null || Static202.aClass28_1 instanceof Class28_Sub1) {
				Static202.aClass28_1 = new Class28_Sub2();
			}
		} else if (Static202.aClass28_1 == null || Static202.aClass28_1 instanceof Class28_Sub2) {
			Static202.aClass28_1 = new Class28_Sub1();
		}
		Static202.aClass28_1.method3469(arg2);
		Static202.aClass28_1.method3464();
		if (Static198.aClass204ArrayArrayArray2 != null) {
			Static47.method1089(true);
			Static202.aClass28_1.method3473(22);
			Static236.method4242(arg2, null, 0, (byte) 0, arg15, arg16);
			Static202.aClass28_1.method3464();
			Static202.aClass28_1.method3473(23);
			Static47.method1089(false);
		}
		Static236.method4242(arg2, arg7, arg13, arg14, arg15, arg16);
		Static202.aClass28_1.method3464();
		Static202.aClass28_1.method3465();
		Static202.aClass28_1.method3464();
		if (arg2 > 1) {
			Static271.aClass2_12.method3313(0);
		}
		Static271.aClass2_12.method3260(0, null);
	}
}
