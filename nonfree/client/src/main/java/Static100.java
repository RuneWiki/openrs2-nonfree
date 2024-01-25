import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_26 = new Class21("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static383.anIntArrayArray47 != null) {
			Static383.anIntArrayArray47[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static231.aShortArrayArray6 != null) {
			Static231.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static410.aByteArrayArray20 != null) {
			Static410.aByteArrayArray20[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)Z")
	public static boolean method1890() {
		try {
			if (Static445.anInt7575 == 2) {
				if (Static130.aClass4_Sub5_2 == null) {
					Static130.aClass4_Sub5_2 = Static469.method374(Static236.aClass38_50, Static410.anInt7145, Static395.anInt6972);
					if (Static130.aClass4_Sub5_2 == null) {
						return false;
					}
				}
				if (Static273.aClass243_1 == null) {
					Static273.aClass243_1 = new Class243(Static89.aClass38_19, Static58.aClass38_13);
				}
				if (Static196.aClass4_Sub7_Sub2_6.method1417(Static130.aClass4_Sub5_2, Static273.aClass243_1, Static459.aClass38_90)) {
					Static196.aClass4_Sub7_Sub2_6.method1412();
					Static196.aClass4_Sub7_Sub2_6.method1425(Static263.anInt5010);
					Static196.aClass4_Sub7_Sub2_6.method1413(Static130.aClass4_Sub5_2, Static242.aBoolean314);
					Static273.aClass243_1 = null;
					Static130.aClass4_Sub5_2 = null;
					Static445.anInt7575 = 0;
					Static236.aClass38_50 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static196.aClass4_Sub7_Sub2_6.method1400();
			Static273.aClass243_1 = null;
			Static236.aClass38_50 = null;
			Static130.aClass4_Sub5_2 = null;
			Static445.anInt7575 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1891(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static402.anInt7091;
		@Pc(9) int[] local9 = Static144.anIntArray244;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class11_Sub5_Sub2_Sub1 local21 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && Static52.aClass11_Sub5_Sub2_Sub1_2 != local21 && local21.aString31 != null && local21.aString31.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static448.method6134(Static295.aClass212_72);
					Static457.aClass4_Sub20_Sub1_5.method4558(local9[local13]);
					Static457.aClass4_Sub20_Sub1_5.method4590(0);
				} else if (arg1 == 4) {
					Static448.method6134(Static331.aClass212_79);
					Static457.aClass4_Sub20_Sub1_5.method4587(local9[local13]);
					Static457.aClass4_Sub20_Sub1_5.method4565(0);
				} else if (arg1 == 5) {
					Static448.method6134(Static368.aClass212_84);
					Static457.aClass4_Sub20_Sub1_5.method4571(local9[local13]);
					Static457.aClass4_Sub20_Sub1_5.method4579(0);
				} else if (arg1 == 6) {
					Static448.method6134(Static227.aClass212_63);
					Static457.aClass4_Sub20_Sub1_5.method4558(local9[local13]);
					Static457.aClass4_Sub20_Sub1_5.method4565(0);
				} else if (arg1 == 7) {
					Static448.method6134(Static157.aClass212_47);
					Static457.aClass4_Sub20_Sub1_5.method4581(0);
					Static457.aClass4_Sub20_Sub1_5.method4587(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static200.method3529(Static56.aClass21_12.method362(Static168.anInt3290) + arg0);
		}
	}
}
