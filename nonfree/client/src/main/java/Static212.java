import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public static int anInt4225 = 50;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString249 = "slide:";

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString250 = "cyan:";

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) Class80[] local3 = Static198.aClass80Array2;
		for (@Pc(16) int local16 = 0; local16 < local3.length; local16++) {
			@Pc(24) Class80 local24 = local3[local16];
			if (local24 != null && local24.anInt2843 == 2) {
				Static238.method3083(arg5, local24.anInt2853 * 2, arg2 >> 1, local24.anInt2854 + (local24.anInt2855 - Static83.anInt1875 << 7), (local24.anInt2847 + -Static53.anInt5288 << 7) - -local24.anInt2849, arg4 >> 1, arg1);
				if (Static171.anInt3648 > -1 && Static237.anInt4710 % 20 < 10) {
					Static135.aClass1_Sub2_Sub11Array3[local24.anInt2848].method3781(Static171.anInt3648 + arg3 - 12, Static176.anInt3730 + -28 + arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZI)V")
	public static void method3367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(15) int local15 = -1;
		@Pc(18) int local18 = -arg1;
		@Pc(26) int local26 = Static23.method431(arg2 + arg1, Static68.anInt1451, Static224.anInt4436);
		@Pc(35) int local35 = Static23.method431(arg2 - arg1, Static68.anInt1451, Static224.anInt4436);
		Static126.method1523(Static22.anIntArrayArray3[arg0], local26, arg3, local35);
		while (local7 < local9) {
			local15 += 2;
			local18 += local15;
			@Pc(64) int local64;
			@Pc(74) int local74;
			@Pc(93) int local93;
			@Pc(101) int local101;
			if (local18 > 0) {
				local9--;
				local64 = arg0 - local9;
				local18 -= local9 << 1;
				local74 = local9 + arg0;
				if (Static297.anInt5619 <= local74 && Static49.anInt1129 >= local64) {
					local93 = Static23.method431(local7 + arg2, Static68.anInt1451, Static224.anInt4436);
					local101 = Static23.method431(arg2 - local7, Static68.anInt1451, Static224.anInt4436);
					if (Static49.anInt1129 >= local74) {
						Static126.method1523(Static22.anIntArrayArray3[local74], local93, arg3, local101);
					}
					if (local64 >= Static297.anInt5619) {
						Static126.method1523(Static22.anIntArrayArray3[local64], local93, arg3, local101);
					}
				}
			}
			local7++;
			local64 = arg0 - local7;
			local74 = local7 + arg0;
			if (local74 >= Static297.anInt5619 && local64 <= Static49.anInt1129) {
				local93 = Static23.method431(local9 + arg2, Static68.anInt1451, Static224.anInt4436);
				local101 = Static23.method431(arg2 - local9, Static68.anInt1451, Static224.anInt4436);
				if (local74 <= Static49.anInt1129) {
					Static126.method1523(Static22.anIntArrayArray3[local74], local93, arg3, local101);
				}
				if (Static297.anInt5619 <= local64) {
					Static126.method1523(Static22.anIntArrayArray3[local64], local93, arg3, local101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	public static int method3368(@OriginalArg(0) int arg0) {
		if (Static87.aClass113_1 != null) {
			Static87.aClass113_1.method3019();
			Static87.aClass113_1 = null;
		}
		Static73.anInt1551++;
		if (Static73.anInt1551 > 4) {
			Static73.anInt1551 = 0;
			Static6.anInt191 = 0;
			return arg0;
		}
		if (Static13.anInt258 == Static293.anInt5140) {
			Static13.anInt258 = Static189.anInt3908;
		} else {
			Static13.anInt258 = Static293.anInt5140;
		}
		Static6.anInt191 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[S)[S")
	public static short[] method3369(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) short[] local12 = new short[arg0.length];
			Static304.method2604(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	public static void method3371() {
		Static279.aClass135_40.method3317();
	}
}
