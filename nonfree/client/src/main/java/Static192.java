import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public static int anInt4177 = 0;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2476 = Static118.method2249("Loaded interfaces");

	@OriginalMember(owner = "client!va", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2475 = aClass65_2476;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2477 = Static118.method2249("mapscene");

	@OriginalMember(owner = "client!va", name = "i", descriptor = "[Lclient!lf;")
	public static final Class54[] aClass54Array3 = new Class54[5000];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method3155() {
		for (@Pc(5) int local5 = 0; local5 < Static22.anInt659; local5++) {
			@Pc(13) int local13 = Static72.anIntArray197[local5];
			@Pc(17) Class6_Sub4_Sub2 local17 = Static106.aClass6_Sub4_Sub2Array1[local13];
			if (local17 != null) {
				Static148.method2649(local17, local17.aClass1_Sub2_Sub11_1.anInt1595);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIB)V")
	public static void method3156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static206.anInt4385 = 0;
		Static23.anInt685 = arg1;
		Static71.anInt1744 = 0;
		Static133.anInt3309 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBLclient!ga;)V")
	public static void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub2_Sub11 arg3) {
		if (Static101.anInt2533 >= 400) {
			return;
		}
		if (arg3.anIntArray151 != null) {
			arg3 = arg3.method1076();
		}
		if (arg3 == null || !arg3.aBoolean68) {
			return;
		}
		@Pc(32) Class65 local32 = arg3.aClass65_970;
		if (arg3.anInt1598 != 0) {
			local32 = Static109.method2004(new Class65[] { local32, Static59.method1055(arg3.anInt1598, Static201.aClass6_Sub4_Sub1_3.anInt606), Static201.aClass65_2374, Static166.aClass65_2237, Static118.method2250(arg3.anInt1598), Static154.aClass65_2039 });
		}
		if (Static145.anInt3438 == 1) {
			Static123.method2348(arg1, Static109.method2004(new Class65[] { Static27.aClass65_569, Static16.aClass65_321, local32 }), (short) 12, (long) arg0, Static14.aClass65_253, arg2);
		} else if (!Static138.aBoolean138) {
			@Pc(84) Class65[] local84 = arg3.aClass65Array21;
			if (Static48.aBoolean53) {
				local84 = Static35.method667(local84);
			}
			@Pc(94) int local94;
			if (local84 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local84[local94] != null && (Static64.anInt1666 != 0 || !local84[local94].method2489(Static181.aClass65_2429))) {
						@Pc(115) byte local115 = 0;
						if (local94 == 0) {
							local115 = 1;
						}
						if (local94 == 1) {
							local115 = 2;
						}
						if (local94 == 2) {
							local115 = 26;
						}
						if (local94 == 3) {
							local115 = 45;
						}
						if (local94 == 4) {
							local115 = 19;
						}
						Static123.method2348(arg1, Static109.method2004(new Class65[] { Static188.aClass65_2454, local32 }), local115, (long) arg0, local84[local94], arg2);
					}
				}
			}
			if (Static64.anInt1666 == 0 && local84 != null) {
				for (local94 = 4; local94 >= 0; local94--) {
					if (local84[local94] != null && local84[local94].method2489(Static181.aClass65_2429)) {
						@Pc(192) short local192 = 0;
						@Pc(198) short local198 = 0;
						if (local94 == 0) {
							local198 = 1;
						}
						if (Static201.aClass6_Sub4_Sub1_3.anInt606 < arg3.anInt1598) {
							local192 = 2000;
						}
						if (local94 == 1) {
							local198 = 2;
						}
						if (local94 == 2) {
							local198 = 26;
						}
						if (local94 == 3) {
							local198 = 45;
						}
						if (local94 == 4) {
							local198 = 19;
						}
						if (local198 != 0) {
							local198 += local192;
						}
						Static123.method2348(arg1, Static109.method2004(new Class65[] { Static188.aClass65_2454, local32 }), local198, (long) arg0, local84[local94], arg2);
					}
				}
			}
			Static123.method2348(arg1, Static109.method2004(new Class65[] { Static188.aClass65_2454, local32 }), (short) 1005, (long) arg0, Static205.aClass65_2570, arg2);
			return;
		} else if ((Static50.anInt1407 & 0x2) == 2) {
			Static123.method2348(arg1, Static109.method2004(new Class65[] { Static19.aClass65_481, Static16.aClass65_321, local32 }), (short) 15, (long) arg0, Static83.aClass65_1223, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!wd;)Z")
	public static boolean method3158(@OriginalArg(1) Class97 arg0) {
		if (arg0.anIntArray509 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray509.length; local12++) {
			@Pc(21) int local21 = Static185.method3076(local12, arg0);
			@Pc(26) int local26 = arg0.anIntArray511[local12];
			if (arg0.anIntArray509[local12] == 2) {
				if (local26 <= local21) {
					return false;
				}
			} else if (arg0.anIntArray509[local12] == 3) {
				if (local21 <= local26) {
					return false;
				}
			} else if (arg0.anIntArray509[local12] == 4) {
				if (local26 == local21) {
					return false;
				}
			} else if (local26 != local21) {
				return false;
			}
		}
		return true;
	}
}
