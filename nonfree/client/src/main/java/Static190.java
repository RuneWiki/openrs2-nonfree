import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1104 = Static231.method3737("scrollbar");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZII)I")
	public static int method3082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static232.method3232(local17, local7);
		@Pc(40) int local40 = Static232.method3232(local17, local7 + 1);
		@Pc(47) int local47 = Static232.method3232(local17 + 1, local7);
		@Pc(56) int local56 = Static232.method3232(local17 + 1, local7 - -1);
		@Pc(63) int local63 = Static24.method428(local28, local13, local40, arg2);
		@Pc(70) int local70 = Static24.method428(local47, local13, local56, arg2);
		return Static24.method428(local63, local23, local70, arg2);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(JZ)V")
	public static void method3097(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static193.aClass1_Sub26_Sub1_2.method3000(63);
			Static193.aClass1_Sub26_Sub1_2.method2940(arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!mj;I)V")
	public static void method3100(@OriginalArg(0) Class5_Sub5_Sub2 arg0) {
		for (@Pc(10) Class1_Sub21 local10 = (Class1_Sub21) Static82.aClass120_9.method3564(); local10 != null; local10 = (Class1_Sub21) Static82.aClass120_9.method3561()) {
			if (arg0 == local10.aClass5_Sub5_Sub2_1) {
				if (local10.aClass1_Sub6_Sub3_3 != null) {
					Static42.aClass1_Sub6_Sub1_1.method966(local10.aClass1_Sub6_Sub3_3);
					local10.aClass1_Sub6_Sub3_3 = null;
				}
				local10.method3735();
				return;
			}
		}
	}
}
