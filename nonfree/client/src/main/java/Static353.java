import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "[I")
	public static final int[] anIntArray465 = new int[5];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ho;IILclient!rd;BIILclient!wg;)V")
	public static void method4676(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub3_Sub1_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class8_Sub3_Sub1_Sub2 arg6) {
		@Pc(11) Class4_Sub22 local11 = new Class4_Sub22();
		local11.anInt3852 = arg4 << 7;
		local11.anInt3855 = arg5;
		local11.anInt3854 = arg1 << 7;
		if (arg0 != null) {
			local11.aClass114_1 = arg0;
			@Pc(137) int local137 = arg0.anInt2851;
			@Pc(140) int local140 = arg0.anInt2857;
			if (arg2 == 1 || arg2 == 3) {
				local140 = arg0.anInt2851;
				local137 = arg0.anInt2857;
			}
			local11.anIntArray280 = arg0.anIntArray231;
			local11.anInt3853 = arg0.anInt2850 << 7;
			local11.anInt3850 = arg0.anInt2874;
			local11.anInt3859 = arg1 + local140 << 7;
			local11.anInt3860 = arg4 + local137 << 7;
			local11.anInt3851 = arg0.anInt2864;
			local11.anInt3857 = arg0.anInt2846;
			local11.anInt3856 = arg0.anInt2829;
			if (arg0.anIntArray235 != null) {
				local11.aBoolean283 = true;
				local11.method3049();
			}
			if (local11.anIntArray280 != null) {
				local11.anInt3845 = local11.anInt3856 + (int) ((double) (local11.anInt3857 - local11.anInt3856) * Math.random());
			}
			Static125.aClass244_10.method5273(local11);
		} else if (arg6 != null) {
			local11.aClass8_Sub3_Sub1_Sub2_1 = arg6;
			@Pc(80) Class78 local80 = arg6.aClass78_1;
			if (local80.anIntArray145 != null) {
				local11.aBoolean283 = true;
				local80 = local80.method1547(Static52.aClass81_1);
			}
			if (local80 != null) {
				local11.anInt3860 = local80.anInt1885 + arg4 << 7;
				local11.anInt3859 = local80.anInt1885 + arg1 << 7;
				local11.anInt3851 = Static332.method4391(arg6);
				local11.anInt3850 = local80.anInt1886;
				local11.anInt3853 = local80.anInt1910 << 7;
			}
			Static273.aClass244_23.method5273(local11);
		} else if (arg3 != null) {
			local11.aClass8_Sub3_Sub1_Sub1_1 = arg3;
			local11.anInt3860 = arg3.method5894() + arg4 << 7;
			local11.anInt3859 = arg3.method5894() + arg1 << 7;
			local11.anInt3851 = Static407.method5531(arg3);
			local11.anInt3853 = arg3.anInt5667 << 7;
			local11.anInt3850 = arg3.anInt5655;
			Static381.aClass67_4.method1426(local11, (long) arg3.anInt7391);
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIII)V")
	public static void method4677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg2;
		@Pc(10) int local10 = -arg2;
		@Pc(12) int local12 = -1;
		@Pc(20) int local20 = Static39.method544(arg2 + arg1, Static62.anInt1114, Static207.anInt3632);
		@Pc(29) int local29 = Static39.method544(arg1 - arg2, Static62.anInt1114, Static207.anInt3632);
		Static249.method6044(Static267.anIntArrayArray50[arg3], arg0, local20, local29);
		while (local7 > local5) {
			local12 += 2;
			local10 += local12;
			@Pc(59) int local59;
			@Pc(63) int local63;
			@Pc(82) int local82;
			@Pc(91) int local91;
			if (local10 > 0) {
				local7--;
				local10 -= local7 << 1;
				local59 = arg3 - local7;
				local63 = arg3 + local7;
				if (Static254.anInt4211 <= local63 && local59 <= Static275.anInt4594) {
					local82 = Static39.method544(arg1 + local5, Static62.anInt1114, Static207.anInt3632);
					local91 = Static39.method544(arg1 - local5, Static62.anInt1114, Static207.anInt3632);
					if (Static275.anInt4594 >= local63) {
						Static249.method6044(Static267.anIntArrayArray50[local63], arg0, local82, local91);
					}
					if (Static254.anInt4211 <= local59) {
						Static249.method6044(Static267.anIntArrayArray50[local59], arg0, local82, local91);
					}
				}
			}
			local5++;
			local59 = arg3 - local5;
			local63 = arg3 + local5;
			if (Static254.anInt4211 <= local63 && local59 <= Static275.anInt4594) {
				local82 = Static39.method544(local7 + arg1, Static62.anInt1114, Static207.anInt3632);
				local91 = Static39.method544(arg1 - local7, Static62.anInt1114, Static207.anInt3632);
				if (Static275.anInt4594 >= local63) {
					Static249.method6044(Static267.anIntArrayArray50[local63], arg0, local82, local91);
				}
				if (local59 >= Static254.anInt4211) {
					Static249.method6044(Static267.anIntArrayArray50[local59], arg0, local82, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public static void method4678() {
		if (Static311.anInt5076 < 0) {
			return;
		}
		@Pc(7) long local7 = Static266.method3498();
		Static311.anInt5076 = (int) ((long) Static311.anInt5076 + Static179.aLong89 - local7);
		if (Static311.anInt5076 <= 0) {
			Static56.anInt965 = Static417.aClass206_2.anInt5196;
			Static34.anInt2152 = Static417.aClass206_2.anInt5201;
			Static4.aFloat5 = Static417.aClass206_2.aFloat64;
			Static427.aFloat28 = Static417.aClass206_2.aFloat61;
			Static311.anInt5076 = -1;
			Static450.anInt7528 = Static417.aClass206_2.anInt5199;
			Static131.aFloat25 = Static417.aClass206_2.aFloat62;
			Static309.aFloat57 = Static417.aClass206_2.aFloat60;
			Static363.aFloat68 = Static417.aClass206_2.aFloat63;
			Static374.aClass3_5 = Static417.aClass206_2.aClass3_3;
			Static214.aFloat44 = Static417.aClass206_2.aFloat59;
		} else {
			@Pc(61) int local61 = (Static311.anInt5076 << 8) / Static364.anInt6037;
			@Pc(66) int local66 = 255 - local61;
			@Pc(71) float local71 = (float) local61 / 255.0F;
			@Pc(75) float local75 = 1.0F - local71;
			Static34.anInt2152 = ((Static24.anInt373 & 0xFF00FF) * local61 + local66 * (Static417.aClass206_2.anInt5201 & 0xFF00FF) & 0xFF00FF00) + ((Static417.aClass206_2.anInt5201 & 0xFF00) * local66 + local61 * (Static24.anInt373 & 0xFF00) & 0xFF0000) >>> 8;
			Static363.aFloat68 = (Static417.aClass206_2.aFloat63 - Static375.aFloat72) * local75 + Static375.aFloat72;
			Static309.aFloat57 = (Static417.aClass206_2.aFloat60 - Static284.aFloat52) * local75 + Static284.aFloat52;
			Static450.anInt7528 = ((Static417.aClass206_2.anInt5199 & 0xFF00) * local66 + local61 * (Static117.anInt2122 & 0xFF00) & 0xFF0000) + (local66 * (Static417.aClass206_2.anInt5199 & 0xFF00FF) + (Static117.anInt2122 & 0xFF00FF) * local61 & 0xFF00FF00) >>> 8;
			Static214.aFloat44 = Static101.aFloat22 + local75 * (Static417.aClass206_2.aFloat59 - Static101.aFloat22);
			Static56.anInt965 = Static397.anInt6471 * local61 + local66 * Static417.aClass206_2.anInt5196 >> 8;
			Static427.aFloat28 = Static440.aFloat101 + local75 * (Static417.aClass206_2.aFloat61 - Static440.aFloat101);
			Static4.aFloat5 = Static54.aFloat16 + (Static417.aClass206_2.aFloat64 - Static54.aFloat16) * local75;
			Static131.aFloat25 = Static252.aFloat47 + (Static417.aClass206_2.aFloat62 - Static252.aFloat47) * local75;
			if (Static417.aClass206_2.aClass3_3 != Static398.aClass3_6) {
				Static374.aClass3_5 = Static172.aClass135_4.method5331(Static398.aClass3_6, Static417.aClass206_2.aClass3_3, local75, Static374.aClass3_5);
			}
		}
		Static179.aLong89 = local7;
	}
}
