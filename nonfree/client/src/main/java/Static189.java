import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array12;

	@OriginalMember(owner = "client!uh", name = "Q", descriptor = "Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3 aClass1_Sub2_Sub5_Sub3_8;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_72 = new Class87(64);

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2467 = Static118.method2249("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!uh", name = "S", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2468 = Static118.method2249(":assist:");

	@OriginalMember(owner = "client!uh", name = "T", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_9 = new Class67(5);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static148.method2651(arg3);
		@Pc(13) int local13 = arg3 - arg0;
		@Pc(15) int local15 = 0;
		if (local13 < 0) {
			local13 = 0;
		}
		@Pc(22) int local22 = -arg3;
		@Pc(24) int local24 = arg3;
		@Pc(26) int local26 = local13;
		@Pc(29) int local29 = -local13;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static40.anIntArrayArray11[arg1];
		@Pc(41) int local41 = local13 + arg4;
		@Pc(46) int local46 = arg4 - local13;
		Static51.method893(arg5, local37, local46, arg4 - arg3);
		Static51.method893(arg2, local37, local41, local46);
		Static51.method893(arg5, local37, arg3 + arg4, local41);
		while (local15 < local24) {
			local33 += 2;
			local31 += 2;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static90.anIntArray518[local26] = local15;
				local26--;
				local29 -= local26 << 1;
			}
			local15++;
			local22 += local31;
			@Pc(134) int[] local134;
			@Pc(140) int[] local140;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(188) int local188;
			@Pc(192) int local192;
			@Pc(197) int local197;
			if (local22 >= 0) {
				local24--;
				local22 -= local24 << 1;
				if (local13 <= local24) {
					local134 = Static40.anIntArrayArray11[local24 + arg1];
					local140 = Static40.anIntArrayArray11[arg1 - local24];
					local144 = arg4 + local15;
					local148 = arg4 - local15;
					Static51.method893(arg5, local134, local144, local148);
					Static51.method893(arg5, local140, local144, local148);
				} else {
					local144 = Static90.anIntArray518[local24];
					local134 = Static40.anIntArrayArray11[local24 + arg1];
					local140 = Static40.anIntArrayArray11[arg1 - local24];
					local148 = arg4 + local15;
					local188 = arg4 - local15;
					local192 = arg4 + local144;
					local197 = arg4 - local144;
					Static51.method893(arg5, local134, local197, local188);
					Static51.method893(arg2, local134, local192, local197);
					Static51.method893(arg5, local134, local148, local192);
					Static51.method893(arg5, local140, local197, local188);
					Static51.method893(arg2, local140, local192, local197);
					Static51.method893(arg5, local140, local148, local192);
				}
			}
			local140 = Static40.anIntArrayArray11[arg1 - local15];
			local134 = Static40.anIntArrayArray11[arg1 + local15];
			local144 = arg4 + local24;
			local148 = arg4 - local24;
			if (local15 < local13) {
				local188 = local15 > local26 ? Static90.anIntArray518[local15] : local26;
				local192 = local188 + arg4;
				local197 = arg4 - local188;
				Static51.method893(arg5, local134, local197, local148);
				Static51.method893(arg2, local134, local192, local197);
				Static51.method893(arg5, local134, local144, local192);
				Static51.method893(arg5, local140, local197, local148);
				Static51.method893(arg2, local140, local192, local197);
				Static51.method893(arg5, local140, local144, local192);
			} else {
				Static51.method893(arg5, local134, local144, local148);
				Static51.method893(arg5, local140, local144, local148);
			}
		}
	}
}
