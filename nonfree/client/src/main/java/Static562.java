import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	public static int anInt9155 = 0;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZIILclient!ib;ZLclient!ib;)I")
	public static int method7684(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class160_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class160_Sub1 arg5) {
		@Pc(15) int local15 = Static132.method2019(arg5, arg3, arg0, arg1);
		if (local15 != 0) {
			return arg1 ? -local15 : local15;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static132.method2019(arg5, arg3, arg2, arg4);
			return arg4 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method7685(@OriginalArg(1) byte[] arg0) {
		return Static621.method8308(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method7686(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = Static72.anInt9084;
		@Pc(7) int[] local7 = Static388.anIntArray381;
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < local5; local11++) {
			@Pc(18) Class41_Sub1_Sub1_Sub3_Sub2 local18 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local7[local11]];
			if (local18 != null && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 != local18 && local18.aString100 != null && local18.aString100.equalsIgnoreCase(arg1)) {
				@Pc(46) Class5_Sub16 local46;
				if (arg0 == 1) {
					local46 = Static455.method6717(Static275.aClass187_55, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3656(local7[local11]);
					local46.aClass5_Sub15_Sub2_1.method3647(0);
					Static479.method7038(local46);
				} else if (arg0 == 4) {
					local46 = Static455.method6717(Static508.aClass187_80, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3647(0);
					local46.aClass5_Sub15_Sub2_1.method3660(local7[local11]);
					Static479.method7038(local46);
				} else if (arg0 == 5) {
					local46 = Static455.method6717(Static337.aClass187_61, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3660(local7[local11]);
					local46.aClass5_Sub15_Sub2_1.method3647(0);
					Static479.method7038(local46);
				} else if (arg0 == 6) {
					local46 = Static455.method6717(Static570.aClass187_90, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3636(0);
					local46.aClass5_Sub15_Sub2_1.method3632(local7[local11]);
					Static479.method7038(local46);
				} else if (arg0 == 7) {
					local46 = Static455.method6717(Static137.aClass187_36, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3640(0);
					local46.aClass5_Sub15_Sub2_1.method3660(local7[local11]);
					Static479.method7038(local46);
				} else if (arg0 == 9) {
					local46 = Static455.method6717(Static174.aClass187_40, Static16.aClass332_8);
					local46.aClass5_Sub15_Sub2_1.method3656(local7[local11]);
					local46.aClass5_Sub15_Sub2_1.method3651(0);
					Static479.method7038(local46);
				}
				local9 = true;
				break;
			}
		}
		if (!local9) {
			Static566.method7772(Static49.aClass42_21.method730(Static259.anInt4113) + arg1);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZBI)I")
	public static int method7687(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub48 local8 = Static386.method5663(arg1, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray495.length) {
			return local8.anIntArray495[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Z")
	public static boolean method7688() {
		return Static223.anInt3566 > 0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method7689(@OriginalArg(1) int arg0) {
		@Pc(6) String local6 = Integer.toString(arg0);
		for (@Pc(11) int local11 = local6.length() - 3; local11 > 0; local11 -= 3) {
			local6 = local6.substring(0, local11) + "," + local6.substring(local11);
		}
		if (local6.length() > 9) {
			return " <col=00ff80>" + local6.substring(0, local6.length() - 8) + Static49.aClass42_33.method730(Static259.anInt4113) + " (" + local6 + ")</col>";
		} else if (local6.length() > 6) {
			return " <col=ffffff>" + local6.substring(0, local6.length() - 4) + Static49.aClass42_35.method730(Static259.anInt4113) + " (" + local6 + ")</col>";
		} else {
			return " <col=ffff00>" + local6 + "</col>";
		}
	}
}
