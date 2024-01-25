import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Lclient!pp;")
	public static final Class198 aClass198_3 = new Class198("", 11);

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
	public static int anInt2704 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method2263(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (long) arg0.charAt(local10) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZIIIII)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg0);
		@Pc(17) int local17 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg4);
		@Pc(28) int local28 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1);
		@Pc(34) int local34 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3);
		@Pc(42) int local42 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg0 + arg2);
		@Pc(51) int local51 = Static120.method2814(Static172.anInt3442, Static324.anInt5590, arg4 - arg2);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static298.method4405(Static62.anIntArrayArray7[local53], arg5, local34, local28);
		}
		for (@Pc(73) int local73 = local17; local73 > local51; local73--) {
			Static298.method4405(Static62.anIntArrayArray7[local73], arg5, local34, local28);
		}
		@Pc(95) int local95 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + arg2);
		@Pc(104) int local104 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg3 - arg2);
		for (@Pc(106) int local106 = local42; local106 <= local51; local106++) {
			@Pc(112) int[] local112 = Static62.anIntArrayArray7[local106];
			Static298.method4405(local112, arg5, local95, local28);
			Static298.method4405(local112, arg5, local34, local104);
		}
	}
}
