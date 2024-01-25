import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!mba", name = "x", descriptor = "Lclient!pda;")
	public static Class51 aClass51_6;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5197(@OriginalArg(0) Class13 arg0) {
		Static591.aClass37_12 = Static10.method116(Static358.anInt6196, true, arg0);
		Static539.aClass183_11 = Static258.method4281(Static358.anInt6196, arg0);
		Static39.aClass37_1 = Static10.method116(Static574.anInt9375, true, arg0);
		Static266.aClass183_7 = Static258.method4281(Static574.anInt9375, arg0);
		Static544.aClass37_8 = Static10.method116(Static84.anInt2169, true, arg0);
		Static551.aClass183_13 = Static258.method4281(Static84.anInt2169, arg0);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIII)V")
	public static void method5198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static510.anInt8225 = arg2;
		Static79.anInt2092 = arg4;
		Static379.anInt6616 = arg1;
		Static439.anInt7210 = arg0;
		Static591.anInt9828 = arg3;
		if (Static79.anInt2092 >= 100) {
			@Pc(27) int local27 = Static510.anInt8225 * 512 + 256;
			@Pc(33) int local33 = Static379.anInt6616 * 512 + 256;
			@Pc(41) int local41 = Static392.method5799(Static531.anInt8550, local27, local33) - Static439.anInt7210;
			@Pc(46) int local46 = local27 - Static576.anInt9403;
			@Pc(51) int local51 = local41 - Static479.anInt7769;
			@Pc(56) int local56 = local33 - Static63.anInt1715;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local56 * local56 + local46 * local46));
			Static502.anInt9930 = (int) (Math.atan2((double) local51, (double) local67) * 2607.5945876176133D) & 0x3FFF;
			Static400.anInt7896 = (int) (Math.atan2((double) local46, (double) local56) * -2607.5945876176133D) & 0x3FFF;
			Static47.anInt1279 = 0;
			if (Static502.anInt9930 < 1024) {
				Static502.anInt9930 = 1024;
			}
			if (Static502.anInt9930 > 3072) {
				Static502.anInt9930 = 3072;
			}
		}
		Static648.anInt10476 = -1;
		Static644.anInt10415 = -1;
		Static407.anInt6909 = 2;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method5199(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static639.anInt10307 = 2;
		Static297.anInt5356 = arg2;
		Static171.method2966(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public static void method5202(@OriginalArg(1) int arg0) {
		if (Static31.method728(arg0)) {
			Static498.method6932(Static261.aClass303ArrayArray1[arg0], -1);
		}
	}
}
