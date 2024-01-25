import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
	public static int anInt3410;

	@OriginalMember(owner = "client!ko", name = "X", descriptor = "Lclient!pn;")
	public static Class162 aClass162_2;

	@OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
	public static int anInt3415;

	@OriginalMember(owner = "client!ko", name = "db", descriptor = "Lclient!wn;")
	public static Class95 aClass95_9;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
	public static int anInt3407 = 0;

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41 = null;

	@OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
	public static int anInt3417 = -1;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	public static void method3097() {
		@Pc(1) Class109 local1 = Static331.aClass109_60;
		synchronized (Static331.aClass109_60) {
			Static331.aClass109_60.method2850();
		}
		local1 = Static128.aClass109_42;
		synchronized (Static128.aClass109_42) {
			Static128.aClass109_42.method2850();
		}
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V")
	public static void method3098() {
		Static333.anInt6433 = -3;
		Static150.anInt2940 = 1;
		Static148.anInt2911 = 0;
		Static224.anInt4432 = -1;
		Static76.aBoolean101 = false;
		Static255.anInt5063 = 0;
		Static315.anInt6162 = 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method3100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg4 < 1 || arg1 > Static22.anInt481 - 2 || Static269.anInt5281 - 2 < arg4) {
			return;
		}
		if (!Static288.method5007() && !Static64.method1603(arg5, arg1, Static322.anInt611, arg4)) {
			return;
		}
		if (Static178.aClass174ArrayArrayArray3 == null) {
			return;
		}
		@Pc(49) int local49 = arg5;
		if (arg5 < 3 && Static203.method4477(arg1, arg4)) {
			local49 = arg5 + 1;
		}
		Static25.method4628(Static152.aClass24Array3[arg5], local49, Static236.aClass55_9, arg5, arg3, arg4, arg1);
		if (arg0 < 0) {
			return;
		}
		@Pc(78) boolean local78 = Static323.aBoolean522;
		Static323.aBoolean522 = true;
		Static86.method1554(Static152.aClass24Array3[arg5], arg4, arg2, arg0, local49, false, arg6, arg5, arg7, arg1, Static236.aClass55_9, false);
		Static323.aBoolean522 = local78;
		return;
	}
}
