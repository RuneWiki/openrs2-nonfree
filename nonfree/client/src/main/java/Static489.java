import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qp", name = "G", descriptor = "[[Lclient!cn;")
	public static Class73[][] aClass73ArrayArray2;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
	public static int anInt8202;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "J")
	public static long aLong249 = -1L;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BII)Z")
	public static boolean method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZI)V")
	public static void method7067(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static134.aClass291_12.method6993((long) arg0, 1) != null) {
			return;
		}
		if (Static522.aBoolean666) {
			@Pc(30) Class5_Sub9 local30 = new Class5_Sub9(arg0, new Class272_Sub1(4096, Static338.aClass208_74, arg0), arg2, arg1);
			local30.aClass272_Sub1_1.method6466(Static444.aStringArray55[Static323.anInt5795]);
			Static134.aClass291_12.method6984((long) arg0, local30);
		} else {
			Static42.method1537(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	public static void method7069(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((Static334.aClass134_29 == null || Static476.aClass134_31 == null || Static241.aClass134_36 == null) && Static345.aClass208_78.method4977(Static66.anInt1082) && Static345.aClass208_78.method4977(Static557.anInt9396) && Static345.aClass208_78.method4977(Static201.anInt3255)) {
			@Pc(51) Class173 local51 = Static684.method3655(Static345.aClass208_78, Static557.anInt9396, 0);
			Static476.aClass134_31 = arg1.method7654(local51, true);
			local51.method3652();
			Static306.aClass134_27 = arg1.method7654(local51, true);
			Static334.aClass134_29 = arg1.method7654(Static684.method3655(Static345.aClass208_78, Static66.anInt1082, 0), true);
			@Pc(76) Class173 local76 = Static684.method3655(Static345.aClass208_78, Static201.anInt3255, 0);
			Static241.aClass134_36 = arg1.method7654(local76, true);
			local76.method3652();
			Static533.aClass134_33 = arg1.method7654(local76, true);
		}
		if (Static334.aClass134_29 == null || Static476.aClass134_31 == null || Static241.aClass134_36 == null) {
			return;
		}
		@Pc(113) int local113 = (arg4 - Static241.aClass134_36.method9236() * 2) / Static334.aClass134_29.method9236();
		for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
			Static334.aClass134_29.method9235(Static241.aClass134_36.method9236() + arg2 + Static334.aClass134_29.method9236() * local115, arg3 - (-arg0 - -Static334.aClass134_29.method9219()));
		}
		@Pc(159) int local159 = (arg0 - Static241.aClass134_36.method9219() - 20) / Static476.aClass134_31.method9219();
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static476.aClass134_31.method9235(arg2, arg3 + local161 * Static476.aClass134_31.method9219() + 20);
			Static306.aClass134_27.method9235(arg2 + arg4 - Static306.aClass134_27.method9236(), local161 * Static476.aClass134_31.method9219() + arg3 + 20);
		}
		Static241.aClass134_36.method9235(arg2, arg3 + arg0 - Static241.aClass134_36.method9219());
		Static533.aClass134_33.method9235(arg4 + arg2 - Static241.aClass134_36.method9236(), arg3 + arg0 - Static241.aClass134_36.method9219());
	}
}
