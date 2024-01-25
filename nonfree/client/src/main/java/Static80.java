import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!el", name = "R", descriptor = "Lclient!om;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!el", name = "O", descriptor = "Lclient!du;")
	public static final Class56 aClass56_3 = new Class56();

	@OriginalMember(owner = "client!el", name = "P", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!el", name = "S", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1433(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static21.aStringArray3.length; local7++) {
			if (Static21.aStringArray3[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIZIII)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg3 < 0 || Static392.anInt6751 - 1 <= arg6 || arg3 >= Static307.anInt5484 - 1) {
			return;
		}
		if (Static297.aClass227ArrayArrayArray7 == null) {
			return;
		}
		@Pc(37) Interface11 local37;
		if (arg4 == 0) {
			local37 = (Interface11) Static252.method4000(arg5, arg6, arg3);
			@Pc(43) Interface11 local43 = (Interface11) Static68.method1245(arg5, arg6, arg3);
			if (local37 != null && arg0 != 2) {
				if (local37 instanceof Class12_Sub2_Sub1) {
					((Class12_Sub2_Sub1) local37).aClass120_1.method2680(arg1);
				} else {
					Static165.method2698(arg6, arg4, arg0, local37.method5025(), arg2, arg3, arg1, arg5);
				}
			}
			if (local43 != null) {
				if (local43 instanceof Class12_Sub2_Sub1) {
					((Class12_Sub2_Sub1) local43).aClass120_1.method2680(arg1);
				} else {
					Static165.method2698(arg6, arg4, arg0, local43.method5025(), arg2, arg3, arg1, arg5);
				}
			}
		} else if (arg4 == 1) {
			local37 = (Interface11) Static221.method3733(arg5, arg6, arg3);
			if (local37 != null) {
				if (local37 instanceof Class12_Sub4_Sub2) {
					((Class12_Sub4_Sub2) local37).aClass120_3.method2680(arg1);
				} else {
					@Pc(116) int local116 = local37.method5025();
					if (arg0 == 4 || arg0 == 5) {
						Static165.method2698(arg6, arg4, 4, local116, arg2, arg3, arg1, arg5);
					} else if (arg0 == 6) {
						Static165.method2698(arg6, arg4, 4, local116, arg2 + 4, arg3, arg1, arg5);
					} else if (arg0 == 7) {
						Static165.method2698(arg6, arg4, 4, local116, (arg2 + 2 & 0x3) + 4, arg3, arg1, arg5);
					} else if (arg0 == 8) {
						Static165.method2698(arg6, arg4, 4, local116, arg2 + 4, arg3, arg1, arg5);
						Static165.method2698(arg6, arg4, 4, local116, (arg2 + 2 & 0x3) + 4, arg3, arg1, arg5);
					}
				}
			}
		} else if (arg4 == 2) {
			local37 = (Interface11) Static86.method4712(arg5, arg6, arg3, wk.class);
			if (local37 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (local37 instanceof Class12_Sub1_Sub5) {
					((Class12_Sub1_Sub5) local37).aClass120_4.method2680(arg1);
				} else {
					Static165.method2698(arg6, arg4, arg0, local37.method5025(), arg2, arg3, arg1, arg5);
				}
			}
		} else if (arg4 == 3) {
			local37 = (Interface11) Static240.method3889(arg5, arg6, arg3);
			if (local37 != null) {
				if (local37 instanceof Class12_Sub5_Sub1) {
					((Class12_Sub5_Sub1) local37).aClass120_2.method2680(arg1);
				} else {
					Static165.method2698(arg6, arg4, arg0, local37.method5025(), arg2, arg3, arg1, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
	public static void method1436() {
		@Pc(13) int[] local13 = new int[Static106.aClass250_1.anInt6708];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static106.aClass250_1.anInt6708; local17++) {
			@Pc(24) Class117 local24 = Static106.aClass250_1.method5735(local17);
			if (local24.anInt2830 >= 0 || local24.anInt2860 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static372.anIntArray784 = new int[local15];
		for (@Pc(52) int local52 = 0; local52 < local15; local52++) {
			Static372.anIntArray784[local52] = local13[local52];
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(Z)Lclient!ji;")
	public static Class2_Sub20 method1437() {
		if (Static302.aClass210_4 == null || Static252.aClass150_1 == null) {
			return null;
		}
		Static252.aClass150_1.method3699(Static302.aClass210_4);
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static252.aClass150_1.method3700();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class80 local28 = Static302.aClass211_2.method5049(local18.anInt3000);
			return local28 != null && local28.aBoolean156 && local28.method1849(Static302.anInterface2_2) ? local18 : Static219.method3707();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!ms;)Ljava/lang/String;")
	public static String method1438(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		if (!Static41.method878(arg1).method5119(arg0) && arg1.anObjectArray34 == null) {
			return null;
		} else if (arg1.aStringArray26 == null || arg0 >= arg1.aStringArray26.length || arg1.aStringArray26[arg0] == null || arg1.aStringArray26[arg0].trim().length() == 0) {
			return Static218.aBoolean304 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray26[arg0];
		}
	}
}
