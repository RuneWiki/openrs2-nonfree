import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array105;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public static int anInt6014 = 0;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "[Lclient!oj;")
	public static final Interface20[] anInterface20Array1 = new Interface20[75];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIILclient!ha;)V")
	public static void method5113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class132 arg7) {
		@Pc(15) Interface18 local15 = (Interface18) Static401.method5788(arg5, arg6, arg1);
		@Pc(24) Class308 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local15 != null) {
			local24 = Static411.aClass88_3.method2024(local15.method8469());
			local30 = local15.method8472() & 0x3;
			local34 = local15.method8473();
			if (local24.anInt8614 == -1) {
				local50 = arg2;
				if (local24.anInt8580 > 0) {
					local50 = arg4;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg7.method7432(arg0, arg3, 4, local50);
					} else if (local30 == 1) {
						arg7.method7449(4, arg0, arg3, local50);
					} else if (local30 == 2) {
						arg7.method7432(arg0 + 3, arg3, 4, local50);
					} else if (local30 == 3) {
						arg7.method7449(4, arg0, arg3 + 3, local50);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg7.method7512(1, 1, arg0, arg3, local50);
					} else if (local30 == 1) {
						arg7.method7512(1, 1, arg0 + 3, arg3, local50);
					} else if (local30 == 2) {
						arg7.method7512(1, 1, arg0 + 3, arg3 + 3, local50);
					} else if (local30 == 3) {
						arg7.method7512(1, 1, arg0, arg3 + 3, local50);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg7.method7449(4, arg0, arg3, local50);
					} else if (local30 == 1) {
						arg7.method7432(arg0 + 3, arg3, 4, local50);
					} else if (local30 == 2) {
						arg7.method7449(4, arg0, arg3 + 3, local50);
					} else if (local30 == 3) {
						arg7.method7432(arg0, arg3, 4, local50);
					}
				}
			} else {
				Static579.method8048(arg0, arg7, local24, local30, arg3);
			}
		}
		local15 = (Interface18) Static486.method7064(arg5, arg6, arg1, oc.class);
		if (local15 != null) {
			local24 = Static411.aClass88_3.method2024(local15.method8469());
			local30 = local15.method8472() & 0x3;
			local34 = local15.method8473();
			if (local24.anInt8614 != -1) {
				Static579.method8048(arg0, arg7, local24, local30, arg3);
			} else if (local34 == 9) {
				local50 = -1118482;
				if (local24.anInt8580 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg7.method7435(arg0 + 3, arg0, local50, arg3, arg3 + 3);
				} else {
					arg7.method7435(arg0 + 3, arg0, local50, arg3 + 3, arg3);
				}
			}
		}
		local15 = (Interface18) Static82.method1398(arg5, arg6, arg1);
		if (local15 == null) {
			return;
		}
		local24 = Static411.aClass88_3.method2024(local15.method8469());
		local30 = local15.method8472() & 0x3;
		if (local24.anInt8614 != -1) {
			Static579.method8048(arg0, arg7, local24, local30, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
	public static void method5116(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub4_Sub18 local11 = Static565.method7924((long) arg0, 17);
		local11.method7979();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z")
	public static boolean method5121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
