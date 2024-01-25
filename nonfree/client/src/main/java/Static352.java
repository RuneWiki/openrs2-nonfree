import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_94 = new Class130(24, 0);

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_93 = new Class200(17, 0);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5817(@OriginalArg(1) String arg0) {
		return Static318.aHashtable4.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public static void method5818() {
		@Pc(9) int[] local9 = new int[Static320.aClass53_2.anInt1780];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static320.aClass53_2.anInt1780; local13++) {
			@Pc(20) Class38 local20 = Static320.aClass53_2.method1770(local13);
			if (local20.anInt1471 >= 0 || local20.anInt1470 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static466.anIntArray510 = new int[local11];
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			Static466.anIntArray510[local44] = local9[local44];
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
	public static void method5819() {
		if (Static101.aClass59_1 != null) {
			Static101.aClass59_1.method1959();
		}
		if (Static264.aThread3 == null) {
			return;
		}
		while (true) {
			try {
				Static264.aThread3.join();
				return;
			} catch (@Pc(22) InterruptedException local22) {
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)[Lclient!eda;")
	public static Class83[] method5820() {
		return new Class83[] { Static52.aClass83_4, Static533.aClass83_12, Static106.aClass83_7 };
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)V")
	public static void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub14 local12 = Static139.method2308(Static578.aClass130_130, Static24.aClass233_1);
		local12.aClass3_Sub3_Sub2_2.method4201(arg0);
		local12.aClass3_Sub3_Sub2_2.method4266(arg1);
		Static562.method8096(local12);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public static void method5823() {
		@Pc(14) int local14 = Static274.anInt4964;
		@Pc(16) int[] local16 = Static70.anIntArray392;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(26) Class4_Sub1_Sub2_Sub1_Sub2 local26 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local16[local18]];
			if (local26 != null) {
				Static561.method8090(local26.method5059(), local26);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg2 > arg7 && arg0 < arg7 + arg1) {
			return arg5 + arg4 > arg6 && arg6 + arg3 > arg4;
		} else {
			return false;
		}
	}
}
