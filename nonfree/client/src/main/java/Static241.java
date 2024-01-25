import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!ao;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	public static int anInt4754;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString301 = "white:";

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "J")
	public static long aLong158 = 0L;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBIIIII)Z")
	public static boolean method4148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 + arg2 > arg1 && arg2 < arg3 + arg1) {
			return arg4 < arg5 + arg6 && arg7 + arg4 > arg6;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)V")
	public static void method4149(@OriginalArg(0) int arg0) {
		Static313.anInt5990 = arg0;
		@Pc(7) Class103 local7 = Static251.aClass103_66;
		synchronized (Static251.aClass103_66) {
			Static251.aClass103_66.method2678();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
	public static void method4151(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static92.aByteArrayArrayArray3 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJBI)V")
	public static void method4152(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static104.method2059(true, 0, arg0, local22, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], 0, local10, 0, arg2);
			return;
		}
		@Pc(46) Class122 local46 = Static245.method4227(local29);
		@Pc(59) int local59;
		@Pc(62) int local62;
		if (local22 == 0 || local22 == 2) {
			local59 = local46.anInt3562;
			local62 = local46.anInt3527;
		} else {
			local62 = local46.anInt3562;
			local59 = local46.anInt3527;
		}
		@Pc(72) int local72 = local46.anInt3525;
		if (local22 != 0) {
			local72 = (local72 << local22 & 0xF) + (local72 >> 4 - local22);
		}
		Static104.method2059(true, local72, arg0, 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0], Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], local59, 0, local62, arg2);
	}
}
