import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ck", name = "bb", descriptor = "Lclient!fm;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!ck", name = "fb", descriptor = "[Lclient!uj;")
	public static Class4_Sub3_Sub14[] aClass4_Sub3_Sub14Array3;

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZC)Z")
	public static boolean method636(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIILclient!vc;IJZ)Z")
	public static boolean method637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class53 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static152.method2431(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)V")
	public static void method638() {
		if (Static153.anInt3020 != Static281.anInt5335 && Static61.method1009(Static281.anInt5335)) {
			Static153.anInt3020 = Static281.anInt5335;
		}
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z")
	public static boolean method639() {
		try {
			if (Static227.anInt4358 == 2) {
				if (Static287.aClass4_Sub31_2 == null) {
					Static287.aClass4_Sub31_2 = Static324.method4202(Static85.aClass58_42, Static310.anInt6026, Static63.anInt1244);
					if (Static287.aClass4_Sub31_2 == null) {
						return false;
					}
				}
				if (Static38.aClass99_1 == null) {
					Static38.aClass99_1 = new Class99(Static262.aClass58_93, Static85.aClass58_41);
				}
				if (Static46.aClass4_Sub6_Sub2_3.method2518(Static287.aClass4_Sub31_2, Static93.aClass58_59, Static38.aClass99_1)) {
					Static46.aClass4_Sub6_Sub2_3.method2516();
					Static46.aClass4_Sub6_Sub2_3.method2486(Static287.anInt5392);
					Static46.aClass4_Sub6_Sub2_3.method2511(Static242.aBoolean322, Static287.aClass4_Sub31_2);
					Static38.aClass99_1 = null;
					Static287.aClass4_Sub31_2 = null;
					Static85.aClass58_42 = null;
					Static227.anInt4358 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static46.aClass4_Sub6_Sub2_3.method2508();
			Static38.aClass99_1 = null;
			Static227.anInt4358 = 0;
			Static85.aClass58_42 = null;
			Static287.aClass4_Sub31_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IJ)V")
	public static void method641(@OriginalArg(1) long arg0) {
		if (!Static212.aBoolean293) {
			Static198.aFloat147 += (float) arg0 * Static35.aFloat20 / 40.0F;
			Static202.aFloat97 += (float) arg0 * Static168.aFloat79 / 40.0F;
		}
		@Pc(37) int local37 = Static154.aClass53_Sub1_Sub1_2.anInt4002 + Static45.anInt837;
		@Pc(42) int local42 = Static34.anInt548 + Static154.aClass53_Sub1_Sub1_2.anInt3974;
		if (Static289.anInt5413 - local42 < -500 || Static289.anInt5413 - local42 > 500 || Static127.anInt2496 - local37 < -500 || Static127.anInt2496 - local37 > 500) {
			Static127.anInt2496 = local37;
			Static289.anInt5413 = local42;
		}
		@Pc(81) int local81;
		@Pc(89) int local89;
		if (Static289.anInt5413 != local42) {
			local81 = local42 - Static289.anInt5413;
			local89 = (int) (arg0 * (long) local81 / 320L);
			if (local81 <= 0) {
				if (local89 == 0) {
					local89 = -1;
				} else if (local89 < local81) {
					local89 = local81;
				}
			} else if (local89 == 0) {
				local89 = 1;
			} else if (local89 > local81) {
				local89 = local81;
			}
			Static289.anInt5413 += local89;
		}
		if (Static127.anInt2496 != local37) {
			local81 = local37 - Static127.anInt2496;
			local89 = (int) (arg0 * (long) local81 / 320L);
			if (local81 > 0) {
				if (local89 == 0) {
					local89 = 1;
				} else if (local89 > local81) {
					local89 = local81;
				}
			} else if (local89 == 0) {
				local89 = -1;
			} else if (local81 > local89) {
				local89 = local81;
			}
			Static127.anInt2496 += local89;
		}
		Static204.method3265();
	}
}
