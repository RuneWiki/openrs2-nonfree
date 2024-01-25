import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!c;")
	public static Class33 aClass33_8;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)Z")
	public static boolean method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static194.method2806(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static168.anInt3026;
			@Pc(14) int local14 = arg2 << Static168.anInt3026;
			return Static302.method4020(local10 + 1, Static244.aClass165Array8[arg0].l(arg1, arg2) + arg3, local14 + 1) && Static302.method4020(local10 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg2) + arg3, local14 + 1) && Static302.method4020(local10 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg2 + 1) + arg3, local14 + Static363.anInt5820 - 1) && Static302.method4020(local10 + 1, Static244.aClass165Array8[arg0].l(arg1, arg2 + 1) + arg3, local14 + Static363.anInt5820 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method4655() {
		Static294.aBoolean305 = true;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static252.method3355(arg1)) {
			Static355.method2949(arg0, Static294.aClass95ArrayArray3[arg1]);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;BI)V")
	public static void method4665(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static36.anInt647;
		@Pc(9) int[] local9 = Static362.anIntArray533;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class26_Sub2_Sub4_Sub2 local21 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static104.aClass26_Sub2_Sub4_Sub2_2 && local21.aString69 != null && local21.aString69.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static81.method1414(Static341.aClass2_90);
					Static255.aClass7_Sub14_Sub1_2.method3969(0);
					Static255.aClass7_Sub14_Sub1_2.method3989(local9[local13]);
				} else if (arg1 == 4) {
					Static81.method1414(Static247.aClass2_86);
					Static255.aClass7_Sub14_Sub1_2.method3993(local9[local13]);
					Static255.aClass7_Sub14_Sub1_2.method3942(0);
				} else if (arg1 == 5) {
					Static81.method1414(Static164.aClass2_53);
					Static255.aClass7_Sub14_Sub1_2.method3989(local9[local13]);
					Static255.aClass7_Sub14_Sub1_2.method3991(0);
				} else if (arg1 == 6) {
					Static81.method1414(Static2.aClass2_2);
					Static255.aClass7_Sub14_Sub1_2.method3942(0);
					Static255.aClass7_Sub14_Sub1_2.method3993(local9[local13]);
				} else if (arg1 == 7) {
					Static81.method1414(Static105.aClass2_40);
					Static255.aClass7_Sub14_Sub1_2.method3970(0);
					Static255.aClass7_Sub14_Sub1_2.method3955(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static90.method1616(Static109.aClass55_51.method1205(Static5.anInt20) + arg0);
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Lclient!gv;")
	public static Class99 method4670() {
		try {
			return new Class99_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class99) Class.forName("Class99_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class99_Sub1();
			}
		}
	}
}
