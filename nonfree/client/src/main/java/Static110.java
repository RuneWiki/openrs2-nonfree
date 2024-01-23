import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!im", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
	public static int anInt2380;

	@OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!im", name = "R", descriptor = "I")
	public static int anInt2372 = 0;

	@OriginalMember(owner = "client!im", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString123 = "rating: ";

	@OriginalMember(owner = "client!im", name = "V", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
	public static int anInt2379 = 0;

	@OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
	public static int anInt2381 = 1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V")
	public static void method2044() {
		Static159.aClass46_27.method1068(50);
		Static278.aClass46_39.method1068(50);
		Static8.aClass46_3.method1068(50);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(II)Lclient!jj;")
	public static Class87 method2045(@OriginalArg(0) int arg0) {
		@Pc(15) Class87 local15 = (Class87) Static269.aClass46_38.method1074((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = Static215.aClass84_97.method2127(arg0, 1);
		local15 = new Class87();
		if (local26 != null) {
			local15.method2220(new Class2_Sub26(local26), arg0);
		}
		Static269.aClass46_38.method1071(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBIII)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static180.method3131(arg4);
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = -arg4;
		@Pc(22) int local22 = arg4 - arg2;
		if (local22 < 0) {
			local22 = 0;
		}
		@Pc(29) int local29 = arg4;
		@Pc(31) int local31 = -1;
		@Pc(34) int local34 = -local22;
		@Pc(36) int local36 = local22;
		@Pc(40) int[] local40 = Static274.anIntArrayArray50[arg0];
		@Pc(42) int local42 = -1;
		@Pc(46) int local46 = local22 + arg1;
		@Pc(51) int local51 = arg1 - local22;
		Static133.method2321(local51, arg1 - arg4, local40, arg5);
		Static133.method2321(local46, local51, local40, arg3);
		Static133.method2321(arg1 + arg4, local46, local40, arg5);
		while (local29 > local14) {
			local42 += 2;
			local31 += 2;
			local17 += local42;
			local34 += local31;
			if (local34 >= 0 && local36 >= 1) {
				Static261.anIntArray476[local36] = local14;
				local36--;
				local34 -= local36 << 1;
			}
			local14++;
			@Pc(133) int[] local133;
			@Pc(126) int[] local126;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(179) int local179;
			@Pc(187) int local187;
			@Pc(192) int local192;
			if (local17 >= 0) {
				local29--;
				if (local29 >= local22) {
					local126 = Static274.anIntArrayArray50[arg0 - local29];
					local133 = Static274.anIntArrayArray50[arg0 + local29];
					local137 = local14 + arg1;
					local142 = arg1 - local14;
					Static133.method2321(local137, local142, local133, arg5);
					Static133.method2321(local137, local142, local126, arg5);
				} else {
					local133 = Static274.anIntArrayArray50[arg0 + local29];
					local137 = Static261.anIntArray476[local29];
					local126 = Static274.anIntArrayArray50[arg0 - local29];
					local179 = arg1 - local14;
					local142 = arg1 + local14;
					local187 = local137 + arg1;
					local192 = arg1 - local137;
					Static133.method2321(local192, local179, local133, arg5);
					Static133.method2321(local187, local192, local133, arg3);
					Static133.method2321(local142, local187, local133, arg5);
					Static133.method2321(local192, local179, local126, arg5);
					Static133.method2321(local187, local192, local126, arg3);
					Static133.method2321(local142, local187, local126, arg5);
				}
				local17 -= local29 << 1;
			}
			local133 = Static274.anIntArrayArray50[arg0 + local14];
			local126 = Static274.anIntArrayArray50[arg0 - local14];
			local137 = arg1 + local29;
			local142 = arg1 - local29;
			if (local22 <= local14) {
				Static133.method2321(local137, local142, local133, arg5);
				Static133.method2321(local137, local142, local126, arg5);
			} else {
				local179 = local36 >= local14 ? local36 : Static261.anIntArray476[local14];
				local192 = arg1 - local179;
				Static133.method2321(local192, local142, local133, arg5);
				local187 = local179 + arg1;
				Static133.method2321(local187, local192, local133, arg3);
				Static133.method2321(local137, local187, local133, arg5);
				Static133.method2321(local192, local142, local126, arg5);
				Static133.method2321(local187, local192, local126, arg3);
				Static133.method2321(local137, local187, local126, arg5);
			}
		}
	}
}
