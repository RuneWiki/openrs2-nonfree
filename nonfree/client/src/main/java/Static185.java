import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "[Lclient!mn;")
	public static Class115[] aClass115Array2;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
	public static int anInt3922 = 2;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString196 = "Created gameworld";

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
	public static int anInt3925 = 0;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	public static volatile int anInt3926 = 0;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!kk;ILclient!th;IIILclient!qh;I)V")
	public static void method3168(@OriginalArg(0) Class36_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36_Sub3_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class143 arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class2_Sub23 local9 = new Class2_Sub23();
		local9.anInt4650 = arg1 * 128;
		local9.anInt4651 = arg6 * 128;
		local9.anInt4653 = arg4;
		if (arg5 != null) {
			local9.anInt4661 = arg5.anInt4528;
			local9.anInt4656 = arg5.anInt4535;
			local9.aClass143_1 = arg5;
			local9.anIntArray390 = arg5.anIntArray371;
			local9.anInt4660 = arg5.anInt4495;
			@Pc(161) int local161 = arg5.anInt4494;
			local9.anInt4657 = arg5.anInt4512;
			@Pc(168) int local168 = arg5.anInt4496;
			local9.anInt4658 = arg5.anInt4520 * 128;
			if (arg3 == 1 || arg3 == 3) {
				local168 = arg5.anInt4494;
				local161 = arg5.anInt4496;
			}
			local9.anInt4663 = (arg1 + local168) * 128;
			local9.anInt4662 = (local161 + arg6) * 128;
			if (arg5.anIntArray372 != null) {
				local9.aBoolean391 = true;
				local9.method3753();
			}
			if (local9.anIntArray390 != null) {
				local9.anInt4659 = (int) (Math.random() * (double) (local9.anInt4660 - local9.anInt4656)) + local9.anInt4656;
			}
			Static238.aClass1_24.method11(local9);
		} else if (arg0 != null) {
			local9.aClass36_Sub3_Sub1_1 = arg0;
			@Pc(40) Class33 local40 = arg0.aClass33_1;
			if (local40.anIntArray55 != null) {
				local9.aBoolean391 = true;
				local40 = local40.method719();
			}
			if (local40 != null) {
				local9.anInt4663 = (arg1 + local40.anInt888) * 128;
				local9.anInt4662 = (local40.anInt888 + arg6) * 128;
				local9.anInt4657 = Static34.method1663(arg0);
				local9.anInt4661 = local40.anInt877;
				local9.anInt4658 = local40.anInt863 * 128;
			}
			Static143.aClass1_12.method11(local9);
		} else if (arg2 != null) {
			local9.aClass36_Sub3_Sub2_2 = arg2;
			local9.anInt4663 = (arg2.method4097() + arg1) * 128;
			local9.anInt4662 = (arg6 + arg2.method4097()) * 128;
			local9.anInt4657 = Static247.method3967(arg2);
			local9.anInt4658 = arg2.anInt5149 * 128;
			local9.anInt4661 = arg2.anInt5178;
			Static259.aClass79_21.method1994(Static61.method2447(arg2.aString249), local9);
		}
	}
}
