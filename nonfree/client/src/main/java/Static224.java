import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "Lclient!kb;")
	public static Class83 aClass83_150;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!gd;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public static int anInt4944;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString153 = "Loaded world list data";

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "[I")
	public static int[] anIntArray514 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public static int anInt4947 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	public static void method3920(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub28 local10 = (Class1_Sub28) Static84.aClass117_6.method3438((long) arg0);
		if (local10 != null) {
			local10.method4742();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		Static89.method1538(Static57.anIntArrayArray9[arg2], arg3 + arg1, arg1 + -arg3, arg0);
		@Pc(26) int local26 = arg4 * arg4;
		@Pc(30) int local30 = arg3 * arg3;
		@Pc(34) int local34 = local26 << 1;
		@Pc(38) int local38 = local30 << 1;
		@Pc(45) int local45 = arg4 << 1;
		@Pc(49) int local49 = local26 << 2;
		@Pc(57) int local57 = local34 + local30 * (1 - local45);
		@Pc(61) int local61 = local30 << 2;
		@Pc(69) int local69 = local34 * 3;
		@Pc(75) int local75 = local49;
		@Pc(83) int local83 = local38 * ((arg4 << 1) - 3);
		@Pc(92) int local92 = local26 - local38 * (local45 - 1);
		@Pc(98) int local98 = local61 * (arg4 - 1);
		while (local9 > 0) {
			if (local57 < 0) {
				while (local57 < 0) {
					local7++;
					local57 += local69;
					local69 += local49;
					local92 += local75;
					local75 += local49;
				}
			}
			local9--;
			if (local92 < 0) {
				local92 += local75;
				local7++;
				local75 += local49;
				local57 += local69;
				local69 += local49;
			}
			local57 += -local98;
			@Pc(153) int local153 = arg2 - local9;
			local98 -= local61;
			@Pc(161) int local161 = arg1 - local7;
			local92 += -local83;
			@Pc(170) int local170 = arg1 + local7;
			local83 -= local61;
			@Pc(178) int local178 = local9 + arg2;
			Static89.method1538(Static57.anIntArrayArray9[local153], local170, local161, arg0);
			Static89.method1538(Static57.anIntArrayArray9[local178], local170, local161, arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3926(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
