import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "Lclient!ef;")
	public static Class59 aClass59_1;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString20 = "";

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_34 = new Class21("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!go", name = "S", descriptor = "J")
	public static long aLong82 = 0L;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(II)I")
	public static int method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static231.aShortArrayArray6 == null ? 0 : Static231.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public static void method2459() {
		for (@Pc(14) Class4_Sub1_Sub2 local14 = (Class4_Sub1_Sub2) Static325.aClass91_36.method2584(); local14 != null; local14 = (Class4_Sub1_Sub2) Static325.aClass91_36.method2586()) {
			@Pc(19) Class11_Sub5_Sub3 local19 = local14.aClass11_Sub5_Sub3_1;
			if (local19.aBoolean337) {
				local14.method6330();
				local19.method4139();
			} else if (Static277.anInt2834 >= local19.anInt4868) {
				local19.method4141(Static75.anInt1854);
				if (local19.aBoolean337) {
					local14.method6330();
				} else {
					Static72.method1589(local19, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)Z")
	public static boolean method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static112.method2196(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static391.anInt6797;
			@Pc(14) int local14 = arg2 << Static391.anInt6797;
			return Static254.method4160(local10 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg2) + arg3, local14 + 1) && Static254.method4160(local10 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg2) + arg3, local14 + 1) && Static254.method4160(local10 + Static223.anInt4452 - 1, Static389.aClass14Array3[arg0].oa(arg1 + 1, arg2 + 1) + arg3, local14 + Static223.anInt4452 - 1) && Static254.method4160(local10 + 1, Static389.aClass14Array3[arg0].oa(arg1, arg2 + 1) + arg3, local14 + Static223.anInt4452 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!ul;II)I")
	public static int method2461(@OriginalArg(0) Class255 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!iu;B)V")
	public static void method2462(@OriginalArg(0) Class4_Sub20_Sub1 arg0) {
		arg0.method3235();
		@Pc(10) int local10 = Static147.anInt3062;
		@Pc(20) Class11_Sub5_Sub2_Sub1 local20 = Static52.aClass11_Sub5_Sub2_Sub1_2 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local10] = new Class11_Sub5_Sub2_Sub1();
		local20.anInt6518 = local10;
		@Pc(28) int local28 = arg0.method3245(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local28 & 0x3FFF;
		local20.anIntArray523[0] = local39 - Static426.anInt7325;
		local20.anInt7514 = (local20.anIntArray523[0] << 7) + (local20.method5302() << 6);
		local20.anIntArray524[0] = local48 - Static72.anInt1776;
		local20.anInt7515 = (local20.anIntArray524[0] << 7) + (local20.method5302() << 6);
		Static59.anInt1472 = local20.aByte100 = local33;
		if (Static116.aClass4_Sub20Array1[local10] != null) {
			local20.method3619(Static116.aClass4_Sub20Array1[local10]);
		}
		Static402.anInt7091 = 0;
		Static144.anIntArray244[Static402.anInt7091++] = local10;
		Static260.aByteArray65[local10] = 0;
		Static321.anInt5399 = 0;
		for (@Pc(127) int local127 = 1; local127 < 2048; local127++) {
			if (local10 != local127) {
				@Pc(141) int local141 = arg0.method3245(18);
				@Pc(145) int local145 = local141 >> 16;
				@Pc(151) int local151 = local141 >> 8 & 0xFF;
				@Pc(155) int local155 = local141 & 0xFF;
				@Pc(163) Class112 local163 = Static228.aClass112Array1[local127] = new Class112();
				local163.anInt3433 = -1;
				local163.anInt3431 = (local151 << 14) + (local145 << 28) + local155;
				local163.aBoolean229 = false;
				local163.anInt3432 = 0;
				Static62.anIntArray114[Static321.anInt5399++] = local127;
				Static260.aByteArray65[local127] = 0;
			}
		}
		arg0.method3240();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V")
	public static void method2463(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static196.aClass4_Sub20_Sub1_4.method3239(Static136.anInt2819) >= 15) {
				@Pc(22) int local22 = Static196.aClass4_Sub20_Sub1_4.method3245(15);
				if (local22 != 32767) {
					@Pc(27) boolean local27 = false;
					@Pc(34) Class4_Sub44 local34 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local22);
					@Pc(40) Class11_Sub5_Sub2_Sub2 local40;
					if (local34 == null) {
						local40 = new Class11_Sub5_Sub2_Sub2();
						local40.anInt6518 = local22;
						local34 = new Class4_Sub44(local40);
						Static80.aClass96_8.method2805((long) local22, local34);
						local27 = true;
						Static154.aClass4_Sub44Array1[Static328.anInt5871++] = local34;
					}
					local40 = local34.aClass11_Sub5_Sub2_Sub2_2;
					Static2.anIntArray1[Static77.anInt1870++] = local22;
					local40.anInt6475 = Static277.anInt2834;
					if (local40.aClass241_1 != null && local40.aClass241_1.method5597()) {
						Static371.method5250(local40);
					}
					local40.method5311(Static220.aClass247_1.method5660(Static196.aClass4_Sub20_Sub1_4.method3245(14)));
					@Pc(106) int local106;
					if (arg0) {
						local106 = Static196.aClass4_Sub20_Sub1_4.method3245(8);
						if (local106 > 127) {
							local106 -= 256;
						}
					} else {
						local106 = Static196.aClass4_Sub20_Sub1_4.method3245(5);
						if (local106 > 15) {
							local106 -= 32;
						}
					}
					@Pc(130) int local130;
					if (arg0) {
						local130 = Static196.aClass4_Sub20_Sub1_4.method3245(8);
						if (local130 > 127) {
							local130 -= 256;
						}
					} else {
						local130 = Static196.aClass4_Sub20_Sub1_4.method3245(5);
						if (local130 > 15) {
							local130 -= 32;
						}
					}
					@Pc(160) int local160 = Static196.aClass4_Sub20_Sub1_4.method3245(3) + 4 << 11 & 0x3CB6;
					@Pc(165) int local165 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
					@Pc(170) int local170 = Static196.aClass4_Sub20_Sub1_4.method3245(1);
					if (local170 == 1) {
						Static206.anIntArray321[Static222.anInt4450++] = local22;
					}
					@Pc(188) int local188 = Static196.aClass4_Sub20_Sub1_4.method3245(2);
					local40.method5304(local40.aClass241_1.anInt7007);
					local40.anInt6530 = local40.aClass241_1.anInt6998 << 3;
					if (local27) {
						local40.method5297(local160, true);
					}
					local40.method5313(local40.method5302(), local165 == 1, Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray523[0] + local106, local188, Static52.aClass11_Sub5_Sub2_Sub1_2.anIntArray524[0] + local130);
					if (local40.aClass241_1.method5597()) {
						Static456.method6201(local40.anIntArray523[0], local40.aByte100, local40, 0, local40.anIntArray524[0], null, null);
					}
					continue;
				}
			}
			Static196.aClass4_Sub20_Sub1_4.method3240();
			return;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(15) Class51[] local15 = Static209.aClass51Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class51 local23 = local15[local17];
			if (local23 != null && local23.anInt1749 == 2) {
				Static4.method55(arg1 >> 1, local23.anInt1745 * 2, arg3 >> 1, local23.anInt1742, local23.anInt1746, local23.anInt1748);
				if (Static402.anIntArray573[0] > -1 && Static277.anInt2834 % 20 < 10) {
					Static355.aClass2Array37[local23.anInt1744].method5921(arg0 + Static402.anIntArray573[0] - 12, Static402.anIntArray573[1] + -28 + arg2);
				}
			}
		}
	}
}
