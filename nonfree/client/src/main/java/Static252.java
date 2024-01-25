import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Lclient!qb;")
	public static Class280 aClass280_1;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "Lclient!daa;")
	public static final Class60 aClass60_2 = new Class60();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method3639() {
		Static334.aClass10_34.method380();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[JII[I)V")
	public static void method3640(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(25) int local25 = (arg1 + arg2) / 2;
		@Pc(27) int local27 = arg2;
		@Pc(31) long local31 = arg0[local25];
		arg0[local25] = arg0[arg1];
		arg0[arg1] = local31;
		@Pc(45) int local45 = arg3[local25];
		arg3[local25] = arg3[arg1];
		arg3[arg1] = local45;
		@Pc(63) int local63 = local31 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg2; local65 < arg1; local65++) {
			if (arg0[local65] < local31 + (long) (local63 & local65)) {
				@Pc(83) long local83 = arg0[local65];
				arg0[local65] = arg0[local27];
				arg0[local27] = local83;
				@Pc(97) int local97 = arg3[local65];
				arg3[local65] = arg3[local27];
				arg3[local27++] = local97;
			}
		}
		arg0[arg1] = arg0[local27];
		arg0[local27] = local31;
		arg3[arg1] = arg3[local27];
		arg3[local27] = local45;
		method3640(arg0, local27 - 1, arg2, arg3);
		method3640(arg0, arg1, local27 + 1, arg3);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z")
	public static boolean method3641(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[I")
	public static int[] method3642(@OriginalArg(0) int arg0) {
		Static351.method5106(Static232.method3401(arg0));
		return new int[] { Static43.aCalendar1.get(5), Static43.aCalendar1.get(2), Static43.aCalendar1.get(1) };
	}
}
