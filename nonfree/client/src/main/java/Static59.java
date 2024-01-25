import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_8 = new Class139(32);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLclient!oa;)V")
	public static void method1065(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class28_Sub1_Sub1_Sub2 arg1) {
		if (Static105.anInt2076 >= 400 || Static226.aClass28_Sub1_Sub1_Sub2_2 == arg1) {
			return;
		}
		@Pc(136) String local136;
		@Pc(66) int local66;
		if (arg1.anInt4412 == 0) {
			@Pc(22) boolean local22 = true;
			if (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4419 != -1 && arg1.anInt4419 != -1) {
				@Pc(45) int local45 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381 <= arg1.anInt4381 ? arg1.anInt4381 : Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381;
				@Pc(56) int local56 = arg1.anInt4419 > Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4419 ? Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4419 : arg1.anInt4419;
				local66 = local56 + local45 * 10 / 100 + 5;
				@Pc(73) int local73 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381 - arg1.anInt4381;
				if (local73 < 0) {
					local73 = -local73;
				}
				if (local73 > local66) {
					local22 = false;
				}
			}
			@Pc(99) String local99 = Static340.aClass63_3 == Static121.aClass63_2 ? Static163.aClass57_48.method1122(Static66.anInt1307) : Static81.aClass57_30.method1122(Static66.anInt1307);
			if (arg1.anInt4381 >= arg1.anInt4398) {
				local136 = arg1.method4031() + (local22 ? Static142.method2268(arg1.anInt4381, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381) : "<col=ffffff>") + " (" + local99 + arg1.anInt4381 + ")";
			} else {
				local136 = arg1.method4031() + (local22 ? Static142.method2268(arg1.anInt4381, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381) : "<col=ffffff>") + " (" + local99 + arg1.anInt4381 + "+" + (arg1.anInt4398 - arg1.anInt4381) + ")";
			}
		} else {
			local136 = arg1.method4031() + " (" + Static69.aClass57_25.method1122(Static66.anInt1307) + arg1.anInt4412 + ")";
		}
		if (Static68.aBoolean81) {
			if (!arg0 && (Static122.anInt2309 & 0x8) != 0) {
				Static90.method1499(20, -1, 0, 0, (long) arg1.anInt4373, Static356.aString8 + " -> <col=ffffff>" + local136, true, Static208.aString38, false, Static158.anInt2845);
			}
		} else if (arg0) {
			Static90.method1499(-1, 0, 0, 0, 0L, "", false, "<col=cccccc>" + local136, true, -1);
		} else {
			for (@Pc(248) int local248 = 7; local248 >= 0; local248--) {
				if (Static289.aStringArray35[local248] != null) {
					@Pc(256) short local256 = 0;
					if (Static121.aClass63_2 == Static17.aClass63_1 && Static289.aStringArray35[local248].equalsIgnoreCase(Static33.aClass57_16.method1122(Static66.anInt1307))) {
						if (arg1.anInt4381 > Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381) {
							local256 = 2000;
						}
						if (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4401 != 0 && arg1.anInt4401 != 0) {
							if (arg1.anInt4401 == Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4401) {
								local256 = 2000;
							} else {
								local256 = 0;
							}
						}
					} else if (Static383.aBooleanArray147[local248]) {
						local256 = 2000;
					}
					@Pc(311) short local311 = (short) (local256 + Static105.aShortArray41[local248]);
					local66 = Static200.anIntArray390[local248] == -1 ? Static30.anInt546 : Static200.anIntArray390[local248];
					Static90.method1499(local311, -1, 0, 0, (long) arg1.anInt4373, "<col=ffffff>" + local136, true, Static289.aStringArray35[local248], false, local66);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(383) Class3_Sub4 local383 = (Class3_Sub4) Static47.aClass138_7.method3051(); local383 != null; local383 = (Class3_Sub4) Static47.aClass138_7.method3050()) {
			if (local383.anInt808 == 47) {
				local383.aString12 = "<col=ffffff>" + local136;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
	public static void method1067(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub8 local14 = Static275.method4307(11, arg0);
		local14.method3217();
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!ug;")
	public static Class175 method1068() {
		try {
			return (Class175) Class.forName("Class175_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method1069() {
		if (Static389.aBoolean501) {
			return;
		}
		if (Static164.aClass154_Sub1_1.aBoolean466) {
			Static352.aFloat68 = (int) Static352.aFloat68 - 65 & 0xFFFFFF80;
		} else {
			Static37.aFloat7 += (-24.0F - Static37.aFloat7) / 2.0F;
		}
		Static55.aBoolean64 = true;
		Static389.aBoolean501 = true;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!b;II)Lclient!qb;")
	public static Class190 method1070(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method224(arg1);
		return local8 == null ? null : new Class190(local8);
	}
}
