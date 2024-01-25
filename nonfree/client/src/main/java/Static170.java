import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!la;Lclient!la;Lclient!la;Lclient!la;I)V")
	public static void method2974(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		Static332.aClass196_64 = arg3;
		Static442.aClass196_94 = arg1;
		Static583.aClass196_121 = arg2;
		Static92.aClass279ArrayArray1 = new Class279[Static583.aClass196_121.method5125()][];
		Static44.aBooleanArray5 = new boolean[Static583.aClass196_121.method5125()];
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZLclient!ha;III)V")
	public static void method2975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface2 local11 = (Interface2) Static126.method2496(arg5, arg3, arg0);
		@Pc(20) Class299 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static105.aClass302_1.method7466(local11.method7381());
			local26 = local11.method7379() & 0x3;
			local30 = local11.method7382();
			if (local20.anInt8626 == -1) {
				local36 = arg1;
				if (local20.anInt8641 > 0) {
					local36 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method7484(local36, arg6, 4, arg7);
					} else if (local26 == 1) {
						arg4.method7508(arg6, 4, arg7, local36);
					} else if (local26 == 2) {
						arg4.method7484(local36, arg6, 4, arg7 + 3);
					} else if (local26 == 3) {
						arg4.method7508(arg6 + 3, 4, arg7, local36);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method7528(arg7, 1, 1, arg6, local36);
					} else if (local26 == 1) {
						arg4.method7528(arg7 + 3, 1, 1, arg6, local36);
					} else if (local26 == 2) {
						arg4.method7528(arg7 + 3, 1, 1, arg6 + 3, local36);
					} else if (local26 == 3) {
						arg4.method7528(arg7, 1, 1, arg6 + 3, local36);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method7508(arg6, 4, arg7, local36);
					} else if (local26 == 1) {
						arg4.method7484(local36, arg6, 4, arg7 + 3);
					} else if (local26 == 2) {
						arg4.method7508(arg6 + 3, 4, arg7, local36);
					} else if (local26 == 3) {
						arg4.method7484(local36, arg6, 4, arg7);
					}
				}
			} else {
				Static105.method2172(local26, local20, arg4, arg6, arg7);
			}
		}
		local11 = (Interface2) Static572.method8142(arg5, arg3, arg0, as.class);
		if (local11 != null) {
			local20 = Static105.aClass302_1.method7466(local11.method7381());
			local26 = local11.method7379() & 0x3;
			local30 = local11.method7382();
			if (local20.anInt8626 != -1) {
				Static105.method2172(local26, local20, arg4, arg6, arg7);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt8641 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method7487(arg6, local36, arg7, arg7 + 3, arg6 + 3);
				} else {
					arg4.method7487(arg6 + 3, local36, arg7, arg7 + 3, arg6);
				}
			}
		}
		local11 = (Interface2) Static625.method8735(arg5, arg3, arg0);
		if (local11 == null) {
			return;
		}
		local20 = Static105.aClass302_1.method7466(local11.method7381());
		local26 = local11.method7379() & 0x3;
		if (local20.anInt8626 != -1) {
			Static105.method2172(local26, local20, arg4, arg6, arg7);
			return;
		}
	}
}
