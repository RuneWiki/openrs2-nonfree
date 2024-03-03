import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qg", name = "Ub", descriptor = "I")
	public static int anInt5335;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIILclient!wm;IIBII)V", line = 185)
	public static void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface6 local11 = (Interface6) Static12.method283(arg6, arg4, arg7);
		@Pc(25) Class41 local25;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (local11 != null) {
			local25 = Static334.aClass202_4.method5164(local11.method6086());
			local33 = local11.method6085() & 0x3;
			local37 = local11.method6082();
			if (local25.anInt1315 == -1) {
				local43 = arg1;
				if (local25.anInt1334 > 0) {
					local43 = arg0;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg3.method2812(local43, arg2, arg5, 4);
					} else if (local33 == 1) {
						arg3.method2892(arg2, 4, arg5, local43);
					} else if (local33 == 2) {
						arg3.method2812(local43, arg2 + 3, arg5, 4);
					} else if (local33 == 3) {
						arg3.method2892(arg2, 4, arg5 + 3, local43);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg3.method2870(1, arg2, arg5, local43, 1);
					} else if (local33 == 1) {
						arg3.method2870(1, arg2 + 3, arg5, local43, 1);
					} else if (local33 == 2) {
						arg3.method2870(1, arg2 + 3, arg5 - -3, local43, 1);
					} else if (local33 == 3) {
						arg3.method2870(1, arg2, arg5 + 3, local43, 1);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg3.method2892(arg2, 4, arg5, local43);
					} else if (local33 == 1) {
						arg3.method2812(local43, arg2 + 3, arg5, 4);
					} else if (local33 == 2) {
						arg3.method2892(arg2, 4, arg5 + 3, local43);
					} else if (local33 == 3) {
						arg3.method2812(local43, arg2, arg5, 4);
					}
				}
			} else {
				Static15.method395(local33, local25, arg5, arg2, arg3);
			}
		}
		local11 = (Interface6) Static98.method2209(arg6, arg4, arg7, id.class);
		if (local11 != null) {
			local25 = Static334.aClass202_4.method5164(local11.method6086());
			local33 = local11.method6085() & 0x3;
			local37 = local11.method6082();
			if (local25.anInt1315 != -1) {
				Static15.method395(local33, local25, arg5, arg2, arg3);
			} else if (local37 == 9) {
				local43 = -1118482;
				if (local25.anInt1334 > 0) {
					local43 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg3.method2846(arg5 + 3, arg2 + 3, arg2, local43, arg5);
				} else {
					arg3.method2846(arg5, arg2 + 3, arg2, local43, arg5 + 3);
				}
			}
		}
		local11 = (Interface6) Static25.method865(arg6, arg4, arg7);
		if (local11 == null) {
			return;
		}
		local25 = Static334.aClass202_4.method5164(local11.method6086());
		local33 = local11.method6085() & 0x3;
		if (local25.anInt1315 != -1) {
			Static15.method395(local33, local25, arg5, arg2, arg3);
			return;
		}
	}
}
