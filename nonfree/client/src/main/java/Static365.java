import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	public static int anInt7203;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!r;")
	public static Class197 aClass197_95;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "Lclient!r;")
	public static Class197 aClass197_96;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 16)
	public static boolean method6452(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Class2_Sub43.anInt7165; local11++) {
			if (arg0.equalsIgnoreCase(Class12_Sub1_Sub1.aStringArray43[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static17.aClass11_Sub5_Sub2_Sub1_3.aString41);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBIIIII)V", line = 44)
	public static void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Class241.anInt7020 - 1 <= arg5 || OutputStream_Sub1.anInt4442 - 1 <= arg2) {
			return;
		}
		if (Static307.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) Interface6 local43;
		if (arg3 == 0) {
			local43 = (Interface6) Static12.method283(arg6, arg5, arg2);
			@Pc(49) Interface6 local49 = (Interface6) Static92.method2145(arg6, arg5, arg2);
			if (local43 != null && arg0 != 2) {
				if (local43 instanceof Class11_Sub1_Sub2) {
					((Class11_Sub1_Sub2) local43).aClass192_1.method4935(arg1);
				} else {
					Static75.method1873(arg6, arg5, local43.method6086(), arg4, arg3, arg1, arg0, arg2);
				}
			}
			if (local49 != null) {
				if (!(local49 instanceof Class11_Sub1_Sub2)) {
					Static75.method1873(arg6, arg5, local49.method6086(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
				((Class11_Sub1_Sub2) local49).aClass192_1.method4935(arg1);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local43 = (Interface6) Static98.method2209(arg6, arg5, arg2, id.class);
				if (local43 != null) {
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local43 instanceof Class11_Sub5_Sub5) {
						((Class11_Sub5_Sub5) local43).aClass192_4.method4935(arg1);
						return;
					}
					Static75.method1873(arg6, arg5, local43.method6086(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
			} else if (arg3 == 3) {
				local43 = (Interface6) Static25.method865(arg6, arg5, arg2);
				if (local43 == null) {
					return;
				}
				if (!(local43 instanceof Class11_Sub2_Sub3)) {
					Static75.method1873(arg6, arg5, local43.method6086(), arg4, arg3, arg1, arg0, arg2);
					return;
				}
				((Class11_Sub2_Sub3) local43).aClass192_2.method4935(arg1);
			} else {
				return;
			}
			return;
		}
		local43 = (Interface6) Static27.method893(arg6, arg5, arg2);
		if (local43 == null) {
			return;
		}
		if (local43 instanceof Class11_Sub3_Sub3) {
			((Class11_Sub3_Sub3) local43).aClass192_3.method4935(arg1);
		} else {
			@Pc(207) int local207 = local43.method6086();
			if (arg0 == 4 || arg0 == 5) {
				Static75.method1873(arg6, arg5, local207, arg4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 6) {
				Static75.method1873(arg6, arg5, local207, arg4 + 4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 7) {
				Static75.method1873(arg6, arg5, local207, (arg4 + 2 & 0x3) + 4, arg3, arg1, 4, arg2);
				return;
			}
			if (arg0 == 8) {
				Static75.method1873(arg6, arg5, local207, arg4 + 4, arg3, arg1, 4, arg2);
				Static75.method1873(arg6, arg5, local207, (arg4 + 2 & 0x3) + 4, arg3, arg1, 4, arg2);
				return;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!cf;B)V", line = 180)
	public static void method6455(@OriginalArg(0) Class2_Sub5 arg0) {
		if (!Class243.aBoolean477) {
			arg0.method6469();
			Class2_Sub3_Sub24.anInt4949--;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(CI)C", line = 196)
	public static char method6456(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIB)V", line = 230)
	public static void method6457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg3; local7++) {
			Static94.method2165(arg0, Static332.anIntArrayArray58[local7], arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[[[BIBII)V", line = 399)
	public static void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static180.anInt3552++;
		Class236.anInt6724 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Class2_Sub3_Sub9.anInt1622; local7 < Static86.anInt1912; local7++) {
			@Pc(12) Class67[][] local12 = Static307.aClass67ArrayArrayArray3[local7];
			for (local14 = Static152.anInt2957; local14 < Static206.anInt4628; local14++) {
				for (@Pc(17) int local17 = Static207.anInt3944; local17 < Static28.anInt722; local17++) {
					@Pc(24) Class67 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static6.aBooleanArrayArray1[local14 + Static198.anInt3784 - Static229.anInt4641][local17 + Static198.anInt3784 - Static197.anInt3776] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean138 = true;
							local24.aBoolean136 = true;
							if (local24.aClass22_2 == null) {
								local24.aBoolean137 = false;
							} else {
								local24.aBoolean137 = true;
							}
							Class236.anInt6724++;
						} else {
							local24.aBoolean138 = false;
							local24.aBoolean136 = false;
							local24.aByte9 = 0;
							if (local14 >= Static229.anInt4641 - 16 && local14 <= Static229.anInt4641 + 16 && local17 >= Static197.anInt3776 - 16 && local17 <= Static197.anInt3776 + 16 && (local24.aClass11_Sub1_3 != null || local24.aClass11_Sub1_2 != null || local24.aClass11_Sub3_2 != null || local24.aClass11_Sub3_3 != null || local24.aClass11_Sub2_2 != null || local24.aClass22_2 != null)) {
								Static153.aClass15_1.method1581(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static174.aClass6Array2 == Static340.aClass6Array4;
		for (local14 = Class2_Sub3_Sub9.anInt1622; local14 < Static86.anInt1912; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static16.aClass19_10.method2873() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static6.aBooleanArrayArray1.length;
				if (Static152.anInt2957 + Static6.aBooleanArrayArray1.length > Static68.anInt1682) {
					local172 -= Static152.anInt2957 + Static6.aBooleanArrayArray1.length - Static68.anInt1682;
				}
				@Pc(192) int local192 = Static6.aBooleanArrayArray1[0].length;
				if (Static207.anInt3944 + Static6.aBooleanArrayArray1[0].length > Static196.anInt3769) {
					local192 -= Static207.anInt3944 + Static6.aBooleanArrayArray1[0].length - Static196.anInt3769;
				}
				@Pc(213) int local213 = Static73.anInt1754;
				while (true) {
					if (local213 >= local172) {
						Static153.aClass15_1.method1579(Static340.aClass6Array4[local14], true, local161, local14);
						break;
					}
					@Pc(220) int local220 = local213 + Static152.anInt2957 - Static73.anInt1754;
					for (@Pc(222) int local222 = Static306.anInt6155; local222 < local192; local222++) {
						Static339.aBooleanArrayArray5[local213][local222] = false;
						if (Static6.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static207.anInt3944 - Static306.anInt6155;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static307.aClass67ArrayArrayArray3[local243][local220][local241] != null && Static307.aClass67ArrayArrayArray3[local243][local220][local241].aByte7 == local14) {
									Static339.aBooleanArrayArray5[local213][local222] = Static307.aClass67ArrayArrayArray3[local243][local220][local241].aBoolean138;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static153.aClass15_1.method1579(Static340.aClass6Array4[local14], false, local161, local14);
			}
			Static153.aClass15_1.method1588();
		}
		if (!Static150.method2954(true)) {
			Static150.method2954(false);
		}
	}
}
