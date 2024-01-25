import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!ija", name = "c", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!ija", name = "d", descriptor = "Lclient!gga;")
	public static Class124 aClass124_125;

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method9211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = true;
		@Pc(20) Class2_Sub8 local20 = new Class2_Sub8(arg3);
		@Pc(22) int local22 = -1;
		label70: while (true) {
			@Pc(26) int local26 = local20.method5168();
			if (local26 == 0) {
				return local15;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(110) Class331 local110;
				do {
					@Pc(73) int local73;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local20.method5173();
										if (local42 == 0) {
											continue label70;
										}
										local20.method5203();
									}
									local42 = local20.method5173();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local20.method5203() >> 2;
									local73 = local63 + arg2;
									local77 = arg1 + local57;
								} while (local73 <= 0);
							} while (local77 <= 0);
						} while (arg0 - 1 <= local73);
					} while (local77 >= arg4 - 1);
					local110 = Static251.aClass328_1.method8261(local22);
				} while (local69 == 22 && Static230.aClass2_Sub54_15.aClass4_Sub4_1.method925() == 0 && local110.lb == 0 && local110.anInt9403 != 1 && !local110.aBoolean700);
				if (!local110.method8290()) {
					local15 = false;
					Static524.anInt9259++;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)Z")
	public static boolean method9212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static530.method8539(arg0, arg1) & Static175.method3430(arg1, arg0);
	}
}
