import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
	public static int anInt1408;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "[Lclient!hg;")
	public static Class3_Sub4_Sub11[] aClass3_Sub4_Sub11Array1 = new Class3_Sub4_Sub11[14];

	@OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString58 = "Walk here";

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!vb;ILclient!cn;)Lclient!mi;")
	public static Class3_Sub21 method1160(@OriginalArg(0) Class183 arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(26) long local26 = ((long) arg0.anInt5782 << 32) + ((long) arg0.anInt5775 << 56) + (long) (arg0.anInt5786 + (arg0.anInt5780 + 1 << 16));
		@Pc(32) Class3_Sub21 local32 = (Class3_Sub21) arg1.method663(local26);
		if (local32 == null) {
			local32 = new Class3_Sub21(arg0.anInt5780, (float) arg0.anInt5786, true, false, arg0.anInt5782);
			arg1.method668(local32, local26);
		}
		return local32;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg3 + arg5 && arg5 < arg6 + arg1) {
			return arg4 + arg2 > arg0 && arg4 < arg0 + arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method1162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(21) int local21 = Static167.method2786(arg0 + arg1, Static204.anInt4020, Static175.anInt3267);
		@Pc(23) int local23 = -1;
		@Pc(32) int local32 = Static167.method2786(arg0 - arg1, Static204.anInt4020, Static175.anInt3267);
		Static235.method3988(arg2, Static129.anIntArrayArray40[arg3], local21, local32);
		while (local9 > local7) {
			local23 += 2;
			local12 += local23;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local68 = arg3 - local9;
				local72 = arg3 + local9;
				if (Static245.anInt6027 <= local72 && Static111.anInt2039 >= local68) {
					local94 = Static167.method2786(local7 + arg0, Static204.anInt4020, Static175.anInt3267);
					local103 = Static167.method2786(arg0 - local7, Static204.anInt4020, Static175.anInt3267);
					if (Static111.anInt2039 >= local72) {
						Static235.method3988(arg2, Static129.anIntArrayArray40[local72], local94, local103);
					}
					if (local68 >= Static245.anInt6027) {
						Static235.method3988(arg2, Static129.anIntArrayArray40[local68], local94, local103);
					}
				}
			}
			local7++;
			local72 = local7 + arg3;
			local68 = arg3 - local7;
			if (local72 >= Static245.anInt6027 && local68 <= Static111.anInt2039) {
				local94 = Static167.method2786(arg0 + local9, Static204.anInt4020, Static175.anInt3267);
				local103 = Static167.method2786(arg0 - local9, Static204.anInt4020, Static175.anInt3267);
				if (Static111.anInt2039 >= local72) {
					Static235.method3988(arg2, Static129.anIntArrayArray40[local72], local94, local103);
				}
				if (Static245.anInt6027 <= local68) {
					Static235.method3988(arg2, Static129.anIntArrayArray40[local68], local94, local103);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(III)J")
	public static long method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4483; local13++) {
			@Pc(22) Class85 local22 = local7.aClass85Array3[local13];
			if ((local22.aLong107 >> 29 & 0x3L) == 2L && local22.anInt2482 == arg1 && local22.anInt2480 == arg2) {
				return local22.aLong107;
			}
		}
		return 0L;
	}
}
