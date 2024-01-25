import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public static int anInt3747;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!mq;I)I")
	public static int method2987(@OriginalArg(1) Class156 arg0, @OriginalArg(2) int arg1) {
		if (!Static53.method1118(arg0).method5982(arg1) && arg0.anObjectArray31 == null) {
			return -1;
		} else if (arg0.anIntArray313 == null || arg0.anIntArray313.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray313[arg1];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[[I)V")
	public static void method2988(@OriginalArg(1) int[][] arg0) {
		Static262.anIntArrayArray31 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method2989(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(19) Class3_Sub17 local19 = null;
		for (@Pc(24) Class3_Sub17 local24 = (Class3_Sub17) Static301.aClass243_16.method5208(); local24 != null; local24 = (Class3_Sub17) Static301.aClass243_16.method5203()) {
			if (local24.anInt2915 == arg6 && local24.anInt2917 == arg4 && local24.anInt2910 == arg5 && arg0 == local24.anInt2906) {
				local19 = local24;
				break;
			}
		}
		if (local19 == null) {
			local19 = new Class3_Sub17();
			local19.anInt2915 = arg6;
			local19.anInt2917 = arg4;
			local19.anInt2910 = arg5;
			local19.anInt2906 = arg0;
			if (arg4 >= 0 && arg5 >= 0 && arg4 < Static40.anInt1089 && arg5 < Static44.anInt7276) {
				Static443.method3578(local19);
			}
			Static301.aClass243_16.method5198(local19);
		}
		local19.anInt2912 = arg1;
		local19.anInt2911 = -1;
		local19.anInt2916 = 0;
		local19.anInt2914 = arg3;
		local19.anInt2909 = arg2;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
	public static void method2990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static144.anInt5411 / (float) Static144.anInt5421;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg0 - local13) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local11) / 2;
		Static339.anInt5767 = -1;
		Static411.anInt6760 = local49 * Static144.anInt5421 / local11;
		Static405.anInt6683 = -1;
		Static76.anInt1937 = Static144.anInt5411 - Static144.anInt5411 * local40 / local13;
		Static197.method3120();
	}
}
