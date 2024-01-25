import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!as;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "Lclient!ui;")
	public static Class230 aClass230_11;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_19 = new Class48(15, 2);

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!o;")
	public static final Class169 aClass169_24 = new Class169(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static342.method4855(arg4, arg3, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static194.method2811(arg1, arg2, arg3, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(59) boolean local59 = local10 > local15;
			@Pc(63) int local63;
			@Pc(67) int local67;
			if (local59) {
				local63 = arg4;
				arg4 = arg2;
				local67 = arg1;
				arg2 = local63;
				arg1 = arg0;
				arg0 = local67;
			}
			if (arg1 < arg4) {
				local63 = arg4;
				arg4 = arg1;
				local67 = arg2;
				arg2 = arg0;
				arg1 = local63;
				arg0 = local67;
			}
			local63 = arg2;
			local67 = arg1 - arg4;
			@Pc(104) int local104 = arg0 - arg2;
			@Pc(113) int local113 = -(local67 >> 1);
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(129) int local129 = arg0 <= arg2 ? -1 : 1;
			@Pc(133) int local133;
			if (local59) {
				for (local133 = arg4; local133 <= arg1; local133++) {
					Static369.anIntArrayArray35[local133][local63] = arg3;
					local113 += local104;
					if (local113 > 0) {
						local113 -= local67;
						local63 += local129;
					}
				}
			} else {
				for (local133 = arg4; local133 <= arg1; local133++) {
					local113 += local104;
					Static369.anIntArrayArray35[local63][local133] = arg3;
					if (local113 > 0) {
						local63 += local129;
						local113 -= local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V")
	public static void method524() {
		Static330.aClass164_8.method5399(Static123.aFloat62, Static344.aFloat64, Static251.aFloat55);
	}
}
