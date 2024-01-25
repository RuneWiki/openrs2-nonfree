import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Lclient!dv;")
	public static Class29_Sub1 aClass29_Sub1_5;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt6472 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZI)V")
	public static void method4942(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static165.anInt3454 = 3;
		Static39.anInt1015 = arg1;
		Static388.method5417(Static214.aClass35_16.anInt1006, Static214.aClass35_16.aString6);
		if (arg0) {
			Static24.method500("", "");
		} else {
			Static342.method4808();
			Static24.method500(Static413.aString63, Static323.aString56);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)I")
	public static int method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(17) int local17 = arg2;
			arg2 = arg0;
			arg0 = local17;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return 1 + 7 - arg2 - arg3;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg0;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V")
	public static void method4952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static377.anInt5031 / (float) Static377.anInt5032;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(43) int local43 = arg2 - (arg3 - local13) / 2;
		@Pc(51) int local51 = arg0 - (arg1 - local11) / 2;
		Static125.anInt2774 = Static377.anInt5031 - local43 * Static377.anInt5031 / local13;
		Static226.anInt4474 = Static377.anInt5032 * local51 / local11;
		Static332.anInt6412 = -1;
		Static135.anInt3020 = -1;
		Static376.method5225();
	}
}
