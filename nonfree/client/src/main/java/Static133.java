import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "Lclient!nb;")
	public static Class15 aClass15_26;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public static int anInt3047 = 0;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "I")
	public static int anInt3056 = 0;

	@OriginalMember(owner = "client!nf", name = "Mb", descriptor = "Lclient!i;")
	public static Class41 aClass41_853 = Static184.method2923(" <col=00ff80>");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ia;IIIIII)V")
	public static void method2111(@OriginalArg(0) Class42 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = 0L;
		if (arg3 == 0) {
			local1 = Static142.method2228(arg4, arg1, arg5);
		}
		if (arg3 == 1) {
			local1 = Static146.method2253(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			local1 = Static98.method1688(arg4, arg1, arg5);
		}
		if (arg3 == 3) {
			local1 = Static65.method1200(arg4, arg1, arg5);
		}
		if ((long) 0 == local1) {
			return;
		}
		@Pc(61) int local61 = (int) local1 >> 14 & 0x1F;
		@Pc(68) int local68 = (int) local1 >> 20 & 0x3;
		@Pc(75) int local75 = (int) (local1 >>> 32) & Integer.MAX_VALUE;
		@Pc(79) Class2_Sub2_Sub14 local79 = Static168.method2705(local75);
		if (arg3 == 0) {
			Static10.method280(arg4, arg1, arg5);
			if (local79.anInt3067 != 0) {
				arg0.method1444(local79.aBoolean171, local61, local68, arg5, arg1);
			}
		}
		if (arg3 == 1) {
			Static6.method243(arg4, arg1, arg5);
		}
		if (arg3 == 2) {
			Static131.method2086(arg4, arg1, arg5);
			if (local79.anInt3067 != 0 && local79.anInt3040 + arg1 < 104 && local79.anInt3040 + arg5 < 104 && local79.anInt3050 + arg1 < 104 && arg5 + local79.anInt3050 < 104) {
				arg0.method1431(arg1, local79.aBoolean171, local68, arg5, local79.anInt3050, local79.anInt3040);
			}
		}
		if (arg3 != 3) {
			return;
		}
		Static183.method923(arg4, arg1, arg5);
		if (local79.anInt3067 == 1) {
			arg0.method1443(arg1, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class55[] local7 = Static57.aClass55Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(17) Class55 local17 = local7[local9];
			if (local17 != null && local17.anInt2526 == 2) {
				Static84.method1526(arg2 >> 1, local17.anInt2533 * 2, (local17.anInt2525 - Static198.anInt4451 << 7) + local17.anInt2521, arg3 >> 1, local17.anInt2532 + (local17.anInt2522 - Static168.anInt3899 << 7));
				if (Static23.anInt595 > -1 && Static103.anInt2511 % 20 < 10) {
					Static158.aClass2_Sub2_Sub16Array16[local17.anInt2524].method2407(arg0 + Static23.anInt595 - 12, Static30.anInt726 + (arg1 - 28));
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
	public static void method2118(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub22 local11 = (Class2_Sub22) Static57.aClass70_3.method2205((long) arg0);
		if (local11 != null) {
			local11.method3314();
		}
	}
}
