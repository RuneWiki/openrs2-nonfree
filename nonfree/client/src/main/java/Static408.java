import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!hn;")
	public static Class2_Sub15 aClass2_Sub15_2;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!za;)V")
	public static void method1353(@OriginalArg(1) Class75 arg0) {
		if (Static45.aBoolean34) {
			Static121.method1959(arg0);
		} else {
			Static41.method623(arg0);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(16) int local16 = -arg1;
		Static215.method3035(arg3 - arg1, arg3 + arg1, Static46.anIntArrayArray24[arg0], arg2);
		@Pc(30) int local30 = -1;
		while (local9 > local7) {
			local30 += 2;
			local16 += local30;
			local7++;
			if (local16 >= 0) {
				local9--;
				local16 -= local9 << 1;
				@Pc(53) int[] local53 = Static46.anIntArrayArray24[local9 + arg0];
				@Pc(60) int[] local60 = Static46.anIntArrayArray24[arg0 - local9];
				@Pc(64) int local64 = local7 + arg3;
				@Pc(69) int local69 = arg3 - local7;
				Static215.method3035(local69, local64, local53, arg2);
				Static215.method3035(local69, local64, local60, arg2);
			}
			@Pc(85) int local85 = arg3 + local9;
			@Pc(89) int local89 = arg3 - local9;
			@Pc(96) int[] local96 = Static46.anIntArrayArray24[arg0 + local7];
			@Pc(103) int[] local103 = Static46.anIntArrayArray24[arg0 - local7];
			Static215.method3035(local89, local85, local96, arg2);
			Static215.method3035(local89, local85, local103, arg2);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
	public static boolean method1355(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method1356(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static409.method687(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(42) int local42;
			do {
				local42 = arg0.nextInt();
			} while (local39 <= local42);
			return Static110.method1808(local42, arg1);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)C")
	public static char method1357(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static205.aCharArray3[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!za;Lclient!bm;III)V")
	public static void method1361(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class36 local12;
		if (arg3 < Static212.anInt3636) {
			local12 = Static175.aClass36ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass11_Sub3_1 != null && local12.aClass11_Sub3_1.method6211()) {
				arg1.method6207(0, arg0, 0, true, Static327.anInt5862, local12.aClass11_Sub3_1);
			}
		}
		if (arg4 < Static212.anInt3636) {
			local12 = Static175.aClass36ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub3_1 != null && local12.aClass11_Sub3_1.method6211()) {
				arg1.method6207(0, arg0, Static327.anInt5862, true, 0, local12.aClass11_Sub3_1);
			}
		}
		if (arg3 < Static212.anInt3636 && arg4 < Static104.anInt1675) {
			local12 = Static175.aClass36ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass11_Sub3_1 != null && local12.aClass11_Sub3_1.method6211()) {
				arg1.method6207(0, arg0, Static327.anInt5862, true, Static327.anInt5862, local12.aClass11_Sub3_1);
			}
		}
		if (arg3 < Static212.anInt3636 && arg4 > 0) {
			local12 = Static175.aClass36ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass11_Sub3_1 != null && local12.aClass11_Sub3_1.method6211()) {
				arg1.method6207(0, arg0, -Static327.anInt5862, true, Static327.anInt5862, local12.aClass11_Sub3_1);
			}
		}
	}
}
