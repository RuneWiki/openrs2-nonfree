import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "Lclient!pa;")
	public static Class86 aClass86_72;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
	public static int anInt3868 = 0;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1254 = Static186.method3527("<col=80ff00>");

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray21 = new boolean[112];

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "[I")
	public static int[] anIntArray439 = new int[32];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public static void method3103(@OriginalArg(0) int arg0) {
		@Pc(1) Class22 local1 = Static158.aClass22_1;
		synchronized (Static158.aClass22_1) {
			Static175.anInt3594 = arg0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qh;III)V")
	public static void method3104(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte9 == 0) {
			arg0.anInt3631 = arg0.anInt3657;
		} else if (arg0.aByte9 == 1) {
			arg0.anInt3631 = arg0.anInt3657 + (arg2 - arg0.anInt3600) / 2;
		} else if (arg0.aByte9 == 2) {
			arg0.anInt3631 = arg2 - arg0.anInt3600 - arg0.anInt3657;
		} else if (arg0.aByte9 == 3) {
			arg0.anInt3631 = arg2 * arg0.anInt3657 >> 14;
		} else if (arg0.aByte9 == 4) {
			arg0.anInt3631 = (arg2 * arg0.anInt3657 >> 14) + (arg2 - arg0.anInt3600) / 2;
		} else {
			arg0.anInt3631 = arg2 - arg0.anInt3600 - (arg2 * arg0.anInt3657 >> 14);
		}
		if (arg0.aByte11 == 0) {
			arg0.anInt3619 = arg0.anInt3590;
		} else if (arg0.aByte11 == 1) {
			arg0.anInt3619 = (arg1 - arg0.anInt3620) / 2 + arg0.anInt3590;
		} else if (arg0.aByte11 == 2) {
			arg0.anInt3619 = arg1 - arg0.anInt3590 - arg0.anInt3620;
		} else if (arg0.aByte11 == 3) {
			arg0.anInt3619 = arg0.anInt3590 * arg1 >> 14;
		} else if (arg0.aByte11 == 4) {
			arg0.anInt3619 = (arg1 - arg0.anInt3620) / 2 + (arg0.anInt3590 * arg1 >> 14);
		} else {
			arg0.anInt3619 = arg1 - arg0.anInt3620 - (arg0.anInt3590 * arg1 >> 14);
		}
		if (!Static131.aBoolean115 || Static35.method552(arg0) == 0 && arg0.anInt3656 != 0) {
			return;
		}
		if (arg0.anInt3619 < 0) {
			arg0.anInt3619 = 0;
		} else if (arg1 < arg0.anInt3619 + arg0.anInt3620) {
			arg0.anInt3619 = arg1 - arg0.anInt3620;
		}
		if (arg0.anInt3631 < 0) {
			arg0.anInt3631 = 0;
		} else if (arg0.anInt3631 + arg0.anInt3600 > arg2) {
			arg0.anInt3631 = arg2 - arg0.anInt3600;
			return;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method3106() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static98.aBooleanArray5[local8] = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public static void method3110() {
		@Pc(7) int local7 = Static143.anInt2913;
		@Pc(17) int local17 = Static126.anInt2534;
		@Pc(21) int local21 = Static233.anInt4463;
		@Pc(23) int local23 = Static15.anInt284;
		Static29.method423(local7, local23, local17, local21, 6116423);
		Static29.method423(local7 + 1, local23 + 1, local17 - 2, 16, 0);
		Static29.method411(local7 + 1, local23 - -18, local17 - 2, local21 + -19, 0);
		Static187.aClass1_Sub1_Sub10_3.method1834(Static163.aClass50_1099, local7 + 3, local23 + 14, 6116423, -1);
		@Pc(68) int local68 = Static110.anInt2205;
		@Pc(70) int local70 = Static117.anInt2301;
		for (@Pc(72) int local72 = 0; local72 < Static193.anInt3035; local72++) {
			@Pc(87) int local87 = local23 + (-local72 + (Static193.anInt3035 - 1)) * 15 + 31;
			@Pc(89) int local89 = 16777215;
			if (local7 < local70 && local70 < local17 + local7 && local68 > local87 - 13 && local68 < local87 + 3) {
				local89 = 16776960;
			}
			Static187.aClass1_Sub1_Sub10_3.method1834(Static98.method1549(local72), local7 + 3, local87, local89, 0);
		}
		Static109.method1729(Static15.anInt284, Static126.anInt2534, Static143.anInt2913, Static233.anInt4463);
	}
}
