import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "I")
	public static int anInt6900;

	@OriginalMember(owner = "client!nja", name = "v", descriptor = "[[Lclient!qp;")
	public static Class304[][] aClass304ArrayArray1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!nja", name = "t", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!nja", name = "u", descriptor = "[I")
	public static final int[] anIntArray429 = new int[5];

	@OriginalMember(owner = "client!nja", name = "p", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_88 = new Class241(14, 8);

	@OriginalMember(owner = "client!nja", name = "w", descriptor = "I")
	public static int anInt6904 = 0;

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(IILclient!ha;IIIIIB)V")
	public static void method6128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) Interface23 local11 = (Interface23) Static593.method8225(arg3, arg5, arg1);
		@Pc(20) Class125 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(48) int local48;
		if (local11 != null) {
			local20 = Static290.aClass163_5.method4124(124, local11.method7934());
			local26 = local11.method7932() & 0x3;
			local30 = local11.method7929(115);
			if (local20.anInt3589 == -1) {
				local48 = arg7;
				if (local20.anInt3587 > 0) {
					local48 = arg6;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg2.method6691(arg0, 4, arg4, local48);
					} else if (local26 == 1) {
						arg2.method6661(arg0, 4, arg4, local48);
					} else if (local26 == 2) {
						arg2.method6691(arg0, 4, arg4 + 3, local48);
					} else if (local26 == 3) {
						arg2.method6661(arg0 + 3, 4, arg4, local48);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg2.method6631(1, arg4, 1, local48, arg0);
					} else if (local26 == 1) {
						arg2.method6631(1, arg4 + 3, 1, local48, arg0);
					} else if (local26 == 2) {
						arg2.method6631(1, arg4 + 3, 1, local48, arg0 + 3);
					} else if (local26 == 3) {
						arg2.method6631(1, arg4, 1, local48, arg0 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg2.method6661(arg0, 4, arg4, local48);
					} else if (local26 == 1) {
						arg2.method6691(arg0, 4, arg4 + 3, local48);
					} else if (local26 == 2) {
						arg2.method6661(arg0 + 3, 4, arg4, local48);
					} else if (local26 == 3) {
						arg2.method6691(arg0, 4, arg4, local48);
					}
				}
			} else {
				Static221.method4016(arg4, arg2, local20, arg0, local26);
			}
		}
		local11 = (Interface23) Static122.method2204(arg3, arg5, arg1, aClass15 == null ? (aClass15 = Class6_Sub7_Sub3.a("rt")) : aClass15);
		if (local11 != null) {
			local20 = Static290.aClass163_5.method4124(123, local11.method7934());
			local26 = local11.method7932() & 0x3;
			local30 = local11.method7929(103);
			if (local20.anInt3589 != -1) {
				Static221.method4016(arg4, arg2, local20, arg0, local26);
			} else if (local30 == 9) {
				local48 = -1118482;
				if (local20.anInt3587 > 0) {
					local48 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg2.method6719(arg0 + 3, arg4 + 3, local48, arg4, arg0);
				} else {
					arg2.method6719(arg0, arg4 + 3, local48, arg4, arg0 + 3);
				}
			}
		}
		local11 = (Interface23) Static64.method787(arg3, arg5, arg1);
		if (local11 == null) {
			return;
		}
		local20 = Static290.aClass163_5.method4124(125, local11.method7934());
		local26 = local11.method7932() & 0x3;
		if (local20.anInt3589 != -1) {
			Static221.method4016(arg4, arg2, local20, arg0, local26);
			return;
		}
	}
}
