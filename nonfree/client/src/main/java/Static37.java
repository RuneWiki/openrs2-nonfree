import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
	public static int anInt932 = 255;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_467 = Static51.method932("sch-Utteln:");

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Lclient!cd;")
	private static Class10 aClass10_471 = Static51.method932("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_468 = aClass10_471;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Lclient!cd;")
	private static Class10 aClass10_469 = Static51.method932("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_470 = aClass10_469;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lclient!fa;II)V")
	public static void method769(@OriginalArg(0) Class23[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class23 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt1090 == 0) {
					if (local13.aClass23Array1 != null) {
						method769(local13.aClass23Array1, arg1);
					}
					@Pc(34) Class2_Sub15 local34 = (Class2_Sub15) Static30.aClass18_2.method683((long) local13.anInt1057);
					if (local34 != null) {
						Static144.method2255(local34.anInt2387, arg1);
					}
				}
				@Pc(53) Class2_Sub18 local53;
				if (arg1 == 0 && local13.anObjectArray26 != null) {
					local53 = new Class2_Sub18();
					local53.aClass23_9 = local13;
					local53.anObjectArray29 = local13.anObjectArray26;
					Static47.method881(local53);
				}
				if (arg1 == 1 && local13.anObjectArray20 != null) {
					if (local13.anInt1056 >= 0) {
						@Pc(82) Class23 local82 = Static102.method2541(local13.anInt1057);
						if (local82 == null || local82.aClass23Array1 == null || local82.aClass23Array1.length <= local13.anInt1056 || local13 != local82.aClass23Array1[local13.anInt1056]) {
							continue;
						}
					}
					local53 = new Class2_Sub18();
					local53.anObjectArray29 = local13.anObjectArray20;
					local53.aClass23_9 = local13;
					Static47.method881(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public static void method770() {
		if (Static170.aBoolean163 && Static27.anInt760 != Static56.anInt1432) {
			Static40.method790(Static77.anInt1800, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0], Static56.anInt1432, Static55.anInt1413, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0]);
		} else if (Static107.anInt2445 != Static56.anInt1432) {
			Static107.anInt2445 = Static56.anInt1432;
			Static168.method2589(Static56.anInt1432);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIB)I")
	public static int method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!od;")
	public static Class2_Sub1_Sub12 method772(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) Static27.aClass72_7.method2259((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static86.aClass29_37.method1030(arg0, 8);
		local10 = new Class2_Sub1_Sub12();
		if (local20 != null) {
			local10.method1844(new Class2_Sub11(local20));
		}
		Static27.aClass72_7.method2254(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method773() {
		aClass10_467 = null;
		anIntArrayArrayArray3 = null;
		aClass10_468 = null;
		aClass10_469 = null;
		aClass10_470 = null;
		aClass10_471 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!va;Lclient!cd;B)I")
	public static int method774(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) Class10 arg1) {
		@Pc(11) int local11 = arg0.anInt2077;
		arg0.method1451(arg1.anInt513);
		arg0.anInt2077 += Static4.aClass37_1.method1164(arg1.anInt513, arg0.aByteArray24, 0, arg1.aByteArray7, arg0.anInt2077);
		return arg0.anInt2077 - local11;
	}
}
