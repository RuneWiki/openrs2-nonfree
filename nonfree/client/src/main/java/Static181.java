import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!lr", name = "ab", descriptor = "Ljava/lang/String;")
	public static final String aString216 = "flash1:";

	@OriginalMember(owner = "client!lr", name = "cb", descriptor = "Ljava/lang/String;")
	public static String aString217 = "Please remove ";

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIZIIIIII)V")
	public static void method3374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class5_Sub29 local7 = null;
		for (@Pc(12) Class5_Sub29 local12 = (Class5_Sub29) Static208.aClass211_18.method5608(); local12 != null; local12 = (Class5_Sub29) Static208.aClass211_18.method5603()) {
			if (local12.anInt3813 == arg1 && arg0 == local12.anInt3819 && local12.anInt3810 == arg4 && local12.anInt3815 == arg5) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub29();
			local7.anInt3813 = arg1;
			local7.anInt3819 = arg0;
			local7.anInt3810 = arg4;
			local7.anInt3815 = arg5;
			Static43.method972(local7);
			Static208.aClass211_18.method5609(local7);
		}
		local7.anInt3818 = arg2;
		local7.anInt3809 = arg6;
		local7.anInt3811 = arg7;
		local7.anInt3817 = arg3;
		local7.anInt3824 = arg8;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
	public static void method3376() {
		Static27.anInt5324 = 0;
		Static60.aClass211_4.method5600();
		Static60.aClass211_4.method5609(Static344.aClass5_Sub4_2);
		Static27.anInt5324++;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)V")
	public static void method3377(@OriginalArg(0) int arg0) {
		@Pc(5) Class98 local5 = Static46.aClass98_1;
		synchronized (Static46.aClass98_1) {
			Static241.anInt4679 = arg0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)V")
	public static void method3379() {
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			Static183.aBooleanArray16[local5] = false;
		}
		Static319.anInt6050 = Static347.anInt6471;
		Static111.anInt2403 = -1;
		Static328.anInt6217 = 0;
		Static90.anInt4331 = Static311.anInt6461;
		Static341.anInt6374 = 0;
		Static323.anInt6108 = Static180.anInt3606;
		Static135.anInt2753 = Static199.anInt3858;
		Static84.anInt2088 = Static347.anInt6472;
		Static179.anInt3574 = -1;
		Static215.anInt4279 = 5;
		Static83.anInt2053 = Static339.anInt6354;
	}
}
