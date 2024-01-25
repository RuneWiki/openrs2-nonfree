import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!fa;")
	public static Class94 aClass94_5;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_33 = new Class288(5);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([[II)V")
	public static void method3770(@OriginalArg(0) int[][] arg0) {
		Static352.anIntArrayArray51 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZIZI[Lclient!oh;I)V")
	public static void method3772(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class220[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(17) int local17 = 0; local17 < arg3.length; local17++) {
			@Pc(23) Class220 local23 = arg3[local17];
			if (local23 != null && local23.anInt6605 == arg0) {
				Static309.method5041(local23, arg1, arg2, arg4);
				Static178.method3063(local23, arg2, arg4);
				if (local23.anInt6626 > local23.anInt6635 - local23.anInt6627) {
					local23.anInt6626 = local23.anInt6635 - local23.anInt6627;
				}
				if (local23.anInt6670 - local23.anInt6681 < local23.anInt6609) {
					local23.anInt6609 = local23.anInt6670 - local23.anInt6681;
				}
				if (local23.anInt6626 < 0) {
					local23.anInt6626 = 0;
				}
				if (local23.anInt6609 < 0) {
					local23.anInt6609 = 0;
				}
				if (local23.anInt6669 == 0) {
					Static428.method6119(local23, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIZ)Lclient!gp;")
	public static Class117 method3776(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(14) Class112 local14 = null;
		if (Static513.aClass149_5 != null) {
			local14 = new Class112(arg1, Static513.aClass149_5, Static69.aClass149Array1[arg1], 1000000);
		}
		Static345.aClass79_Sub1Array2[arg1] = Static227.aClass91_1.method2318(arg1, local14, Static167.aClass112_4);
		if (arg2) {
			Static345.aClass79_Sub1Array2[arg1].method2220();
		}
		return new Class117(Static345.aClass79_Sub1Array2[arg1], arg0, 1);
	}
}
