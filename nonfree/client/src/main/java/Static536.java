import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!lt;")
	public static Class206 aClass206_5;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIIII)V")
	public static void method7971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg1;
		@Pc(14) int local14 = arg3 - arg4;
		if (local14 == 0) {
			if (local10 != 0) {
				Static655.method9118(arg2, arg0, arg4, arg1);
			}
		} else if (local10 == 0) {
			Static342.method5136(arg4, arg3, arg0, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(67) boolean local67 = local10 > local14;
			@Pc(75) int local75;
			@Pc(79) int local79;
			if (local67) {
				local75 = arg4;
				arg4 = arg1;
				local79 = arg3;
				arg3 = arg2;
				arg1 = local75;
				arg2 = local79;
			}
			if (arg4 > arg3) {
				local75 = arg4;
				local79 = arg1;
				arg4 = arg3;
				arg3 = local75;
				arg1 = arg2;
				arg2 = local79;
			}
			local75 = arg1;
			local79 = arg3 - arg4;
			@Pc(115) int local115 = arg2 - arg1;
			@Pc(120) int local120 = -(local79 >> 1);
			@Pc(127) int local127 = arg1 < arg2 ? 1 : -1;
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(136) int local136;
			if (local67) {
				for (local136 = arg4; local136 <= arg3; local136++) {
					local120 += local115;
					Static392.anIntArrayArray39[local136][local75] = arg0;
					if (local120 > 0) {
						local120 -= local79;
						local75 += local127;
					}
				}
			} else {
				for (local136 = arg4; local136 <= arg3; local136++) {
					local120 += local115;
					Static392.anIntArrayArray39[local75][local136] = arg0;
					if (local120 > 0) {
						local75 += local127;
						local120 -= local79;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!jp;Z)V")
	public static void method7982(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub25 arg1) {
		if (Static10.aClass344_1 == null) {
			return;
		}
		try {
			Static10.aClass344_1.method8361(0L);
			Static10.aClass344_1.method8365(arg1.aByteArray106, arg0, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!nu;)V")
	public static void method7983(@OriginalArg(1) Class245 arg0) {
		Static404.aClass245_1 = arg0;
	}
}
