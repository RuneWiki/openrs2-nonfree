import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!nq;")
	public static Class144 aClass144_99;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!om;")
	public static Class11_Sub10_Sub4 aClass11_Sub10_Sub4_3;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "J")
	public static long aLong183 = -1L;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "[I")
	public static final int[] anIntArray498 = new int[250];

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
	public static int anInt6128 = -50;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5230(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static264.anInt5400 >= 100) {
			Static17.method228(Static320.aClass117_107.method2684(Static230.anInt4634));
			return;
		}
		@Pc(22) String local22 = Static151.method2277(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static264.anInt5400; local27++) {
			@Pc(35) String local35 = Static151.method2277(Static110.aStringArray34[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static17.method228(arg1 + Static230.aClass117_80.method2684(Static230.anInt4634));
				return;
			}
			if (Static348.aStringArray52[local27] != null) {
				local65 = Static151.method2277(Static348.aStringArray52[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static17.method228(arg1 + Static230.aClass117_80.method2684(Static230.anInt4634));
					return;
				}
			}
		}
		for (@Pc(95) int local95 = 0; local95 < Static20.anInt374; local95++) {
			local65 = Static151.method2277(Static193.aStringArray30[local95]);
			if (local65 != null && local65.equals(local22)) {
				Static17.method228(Static299.aClass117_100.method2684(Static230.anInt4634) + arg1 + Static331.aClass117_112.method2684(Static230.anInt4634));
				return;
			}
			if (Static272.aStringArray40[local95] != null) {
				@Pc(138) String local138 = Static151.method2277(Static272.aStringArray40[local95]);
				if (local138 != null && local138.equals(local22)) {
					Static17.method228(Static299.aClass117_100.method2684(Static230.anInt4634) + arg1 + Static331.aClass117_112.method2684(Static230.anInt4634));
					return;
				}
			}
		}
		if (Static151.method2277(Static156.aClass67_Sub3_Sub3_Sub2_2.aString50).equals(local22)) {
			Static17.method228(Static10.aClass117_5.method2684(Static230.anInt4634));
		} else {
			Static313.aClass11_Sub25_Sub1_5.method2454(113);
			Static313.aClass11_Sub25_Sub1_5.method5186(Static350.method5658(arg1) + 1);
			Static313.aClass11_Sub25_Sub1_5.method5173(arg1);
			Static313.aClass11_Sub25_Sub1_5.method5186(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIII)V")
	public static void method5231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(20) int local20 = arg4 - arg3;
		@Pc(25) int local25 = arg0 - arg2;
		if (local20 == 0) {
			if (local25 != 0) {
				Static145.method2210(arg2, arg3, arg1, arg0);
			}
		} else if (local25 == 0) {
			Static16.method217(arg2, arg3, arg4, arg1);
		} else {
			@Pc(57) int local57 = (local25 << 12) / local20;
			@Pc(66) int local66 = arg2 - (local57 * arg3 >> 12);
			@Pc(83) int local83;
			@Pc(81) int local81;
			if (Static280.anInt212 > arg3) {
				local81 = local66 + (Static280.anInt212 * local57 >> 12);
				local83 = Static280.anInt212;
			} else if (arg3 <= Static346.anInt6607) {
				local81 = arg2;
				local83 = arg3;
			} else {
				local81 = local66 + (Static346.anInt6607 * local57 >> 12);
				local83 = Static346.anInt6607;
			}
			@Pc(121) int local121;
			@Pc(119) int local119;
			if (arg4 < Static280.anInt212) {
				local119 = local66 + (Static280.anInt212 * local57 >> 12);
				local121 = Static280.anInt212;
			} else if (Static346.anInt6607 < arg4) {
				local121 = Static346.anInt6607;
				local119 = (local57 * Static346.anInt6607 >> 12) + local66;
			} else {
				local119 = arg0;
				local121 = arg4;
			}
			if (local81 < Static240.anInt4829) {
				local83 = (Static240.anInt4829 - local66 << 12) / local57;
				local81 = Static240.anInt4829;
			} else if (local81 > Static166.anInt3315) {
				local81 = Static166.anInt3315;
				local83 = (Static166.anInt3315 - local66 << 12) / local57;
			}
			if (local119 < Static240.anInt4829) {
				local119 = Static240.anInt4829;
				local121 = (Static240.anInt4829 - local66 << 12) / local57;
			} else if (Static166.anInt3315 < local119) {
				local119 = Static166.anInt3315;
				local121 = (Static166.anInt3315 - local66 << 12) / local57;
			}
			Static315.method5281(local81, local121, local119, local83, arg1);
		}
	}
}
