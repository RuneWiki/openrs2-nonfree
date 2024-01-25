import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!mu;")
	public static Class127 aClass127_3;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	public static int anInt1969;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_67 = new Class48(21, -1);

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_46 = new Class211(91, -2);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZIIFII)[I")
	public static int[] method1630(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub2_Sub6 local10 = new Class1_Sub2_Sub6();
		local10.aBoolean77 = true;
		local10.anInt895 = 8;
		local10.anInt905 = 4;
		local10.anInt906 = 8;
		local10.anInt898 = (int) (arg0 * 4096.0F);
		local10.anInt897 = 35;
		local10.method5505();
		Static105.method1498(1, 2048);
		local10.method706(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static252.anInt4374++;
		Static280.anInt4876 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static365.anInt5878; local7 < Static337.anInt5599; local7++) {
			@Pc(12) Class132[][] local12 = Static25.aClass132ArrayArrayArray1[local7];
			for (local14 = Static39.anInt751; local14 < Static60.anInt1201; local14++) {
				for (@Pc(17) int local17 = Static35.anInt679; local17 < Static255.anInt4404; local17++) {
					@Pc(24) Class132 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static54.aBooleanArrayArray1[local14 + Static32.anInt647 - Static266.anInt4625][local17 + Static32.anInt647 - Static249.anInt4358] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean294 = true;
							local24.aBoolean295 = true;
							if (local24.aClass116_3 == null) {
								local24.aBoolean293 = false;
							} else {
								local24.aBoolean293 = true;
							}
							Static280.anInt4876++;
						} else {
							local24.aBoolean294 = false;
							local24.aBoolean295 = false;
							local24.aByte46 = 0;
							if (local14 >= Static266.anInt4625 - 16 && local14 <= Static266.anInt4625 + 16 && local17 >= Static249.anInt4358 - 16 && local17 <= Static249.anInt4358 + 16 && (local24.aClass25_Sub5_1 != null || local24.aClass25_Sub5_2 != null || local24.aClass25_Sub3_2 != null || local24.aClass25_Sub3_1 != null || local24.aClass25_Sub4_2 != null || local24.aClass116_3 != null)) {
								Static273.aClass54_1.method1120(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static77.aClass42Array2 == Static229.aClass42Array3;
		for (local14 = Static365.anInt5878; local14 < Static337.anInt5599; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static90.aClass164_3.method5369() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static54.aBooleanArrayArray1.length;
				if (Static39.anInt751 + Static54.aBooleanArrayArray1.length > Static19.anInt329) {
					local172 -= Static39.anInt751 + Static54.aBooleanArrayArray1.length - Static19.anInt329;
				}
				@Pc(192) int local192 = Static54.aBooleanArrayArray1[0].length;
				if (Static35.anInt679 + Static54.aBooleanArrayArray1[0].length > Static230.anInt6113) {
					local192 -= Static35.anInt679 + Static54.aBooleanArrayArray1[0].length - Static230.anInt6113;
				}
				@Pc(213) int local213 = Static223.anInt3796;
				while (true) {
					if (local213 >= local172) {
						Static273.aClass54_1.method1114(local14, Static229.aClass42Array3[local14], true, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static39.anInt751 - Static223.anInt3796;
					for (@Pc(222) int local222 = Static6.anInt93; local222 < local192; local222++) {
						Static63.aBooleanArrayArray5[local213][local222] = false;
						if (Static54.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static35.anInt679 - Static6.anInt93;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static25.aClass132ArrayArrayArray1[local243][local220][local241] != null && Static25.aClass132ArrayArrayArray1[local243][local220][local241].aByte47 == local14) {
									Static63.aBooleanArrayArray5[local213][local222] = Static25.aClass132ArrayArrayArray1[local243][local220][local241].aBoolean294;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static273.aClass54_1.method1114(local14, Static229.aClass42Array3[local14], false, local161);
			}
			Static273.aClass54_1.method1109();
		}
		if (!Static196.method2845(true)) {
			Static196.method2845(false);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)[Lclient!rt;")
	public static Class205[] method1633() {
		return new Class205[] { Static341.aClass205_2, Static173.aClass205_1, Static384.aClass205_4 };
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(CB)C")
	public static char method1634(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)Z")
	public static boolean method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static83.method1224(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static365.anInt5876;
			@Pc(14) int local14 = arg2 << Static365.anInt5876;
			return Static251.method3878(local10 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg2) + arg3, local14 + 1) && Static251.method3878(local10 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg2) + arg3, local14 + 1) && Static251.method3878(local10 + Static53.anInt1116 - 1, Static229.aClass42Array3[arg0].method3060(arg1 + 1, arg2 + 1) + arg3, local14 + Static53.anInt1116 - 1) && Static251.method3878(local10 + 1, Static229.aClass42Array3[arg0].method3060(arg1, arg2 + 1) + arg3, local14 + Static53.anInt1116 - 1);
		} else {
			return false;
		}
	}
}
