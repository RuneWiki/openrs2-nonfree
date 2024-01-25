import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt1974;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "F")
	public static float aFloat33 = 0.0F;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	public static void method1651(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static273.anInt4878 != -1) {
				Static271.method3946(Static273.anInt4878);
			}
			for (@Pc(14) Class1_Sub36 local14 = (Class1_Sub36) Static445.aClass27_42.method555(); local14 != null; local14 = (Class1_Sub36) Static445.aClass27_42.method563()) {
				if (!local14.method6069()) {
					local14 = (Class1_Sub36) Static445.aClass27_42.method555();
					if (local14 == null) {
						break;
					}
				}
				Static225.method3382(true, local14, false);
			}
			Static273.anInt4878 = -1;
			Static445.aClass27_42 = new Class27(8);
			Static14.method304();
			Static273.anInt4878 = Static299.anInt5301;
			Static189.method2894(false);
			Static353.method4882();
			Static104.method1597(Static273.anInt4878);
		}
		Static245.method3607();
		Static246.anInt4394 = -1;
		Static234.method3458(Static154.anInt2645);
		Static196.aClass26_Sub2_Sub2_Sub1_1 = new Class26_Sub2_Sub2_Sub1();
		Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] = Static135.anInt2314 / 2;
		Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 = Static352.anInt6022 * 128 / 2;
		Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 = Static135.anInt2314 * 128 / 2;
		Static402.anInt6941 = 0;
		Static306.anInt5497 = 0;
		Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0] = Static352.anInt6022 / 2;
		if (Static310.anInt5540 == 2) {
			Static402.anInt6941 = Static139.anInt2356 << 7;
			Static306.anInt5497 = Static91.anInt1741 << 7;
		} else {
			Static64.method1126();
		}
		Static215.method3267();
		if (Static306.anInt5497 == 0 || Static402.anInt6941 == 0) {
			Static455.method4431(10);
		} else {
			Static18.method362();
			Static455.method4431(28);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)I")
	public static int method1652(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lclient!of;")
	public static Class176 method1653(@OriginalArg(1) int arg0) {
		@Pc(8) Class176[] local8 = Static285.method6082();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class176 local16 = local8[local10];
			if (arg0 == local16.anInt4982) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method1654() {
		Static173.aClass1_Sub1_Sub1_1.method144();
		@Pc(18) int local18 = Static173.aClass1_Sub1_Sub1_1.method146(8);
		@Pc(27) int local27;
		if (Static288.anInt5039 > local18) {
			for (local27 = local18; local27 < Static288.anInt5039; local27++) {
				Static400.anIntArray576[Static41.anInt7067++] = Static212.anIntArray28[local27];
			}
		}
		if (local18 > Static288.anInt5039) {
			throw new RuntimeException("gnpov1");
		}
		Static288.anInt5039 = 0;
		for (local27 = 0; local27 < local18; local27++) {
			@Pc(69) int local69 = Static212.anIntArray28[local27];
			@Pc(73) Class26_Sub2_Sub2_Sub2 local73 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local69];
			@Pc(78) int local78 = Static173.aClass1_Sub1_Sub1_1.method146(1);
			if (local78 == 0) {
				Static212.anIntArray28[Static288.anInt5039++] = local69;
				local73.anInt7098 = Static403.anInt6978;
			} else {
				@Pc(101) int local101 = Static173.aClass1_Sub1_Sub1_1.method146(2);
				if (local101 == 0) {
					Static212.anIntArray28[Static288.anInt5039++] = local69;
					local73.anInt7098 = Static403.anInt6978;
					Static178.anIntArray272[Static74.anInt1467++] = local69;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local101 == 1) {
						Static212.anIntArray28[Static288.anInt5039++] = local69;
						local73.anInt7098 = Static403.anInt6978;
						local148 = Static173.aClass1_Sub1_Sub1_1.method146(3);
						local73.method5548(local148, 1);
						local158 = Static173.aClass1_Sub1_Sub1_1.method146(1);
						if (local158 == 1) {
							Static178.anIntArray272[Static74.anInt1467++] = local69;
						}
					} else if (local101 == 2) {
						Static212.anIntArray28[Static288.anInt5039++] = local69;
						local73.anInt7098 = Static403.anInt6978;
						if (Static173.aClass1_Sub1_Sub1_1.method146(1) == 1) {
							local148 = Static173.aClass1_Sub1_Sub1_1.method146(3);
							local73.method5548(local148, 2);
							local158 = Static173.aClass1_Sub1_Sub1_1.method146(3);
							local73.method5548(local158, 2);
						} else {
							local148 = Static173.aClass1_Sub1_Sub1_1.method146(3);
							local73.method5548(local148, 0);
						}
						local148 = Static173.aClass1_Sub1_Sub1_1.method146(1);
						if (local148 == 1) {
							Static178.anIntArray272[Static74.anInt1467++] = local69;
						}
					} else if (local101 == 3) {
						Static400.anIntArray576[Static41.anInt7067++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Lclient!lh;I)V")
	public static void method1656(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aByteArray66.length - arg0.anInt5056 < 1) {
			return;
		}
		@Pc(28) int local28 = arg0.method4130();
		if (local28 < 0 || local28 > 1 || arg0.aByteArray66.length - arg0.anInt5056 < 2) {
			return;
		}
		@Pc(53) int local53 = arg0.method4093();
		if (local53 * 6 != arg0.aByteArray66.length - arg0.anInt5056) {
			return;
		}
		while (true) {
			@Pc(69) int local69;
			@Pc(73) int local73;
			do {
				do {
					do {
						if (arg0.anInt5056 >= arg0.aByteArray66.length) {
							return;
						}
						local69 = arg0.method4093();
						local73 = arg0.method4087();
					} while (Static77.anIntArray142.length <= local69);
				} while (!Static318.aBooleanArray18[local69]);
			} while (Static60.aClass113_1.method2700(local69).aChar4 == '1' && (local73 < -1 || local73 > 1));
			Static77.anIntArray142[local69] = local73;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1657(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static315.aClass84_77.method1678(Static167.anInt3118) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static145.aClass84_39.method1678(Static167.anInt3118) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
