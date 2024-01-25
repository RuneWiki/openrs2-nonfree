import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "[I")
	public static int[] anIntArray205;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt3082 = 1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIBILclient!ha;III)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface9 local11 = (Interface9) Static518.method6967(arg0, arg2, arg3);
		@Pc(20) Class247 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(47) int local47;
		if (local11 != null) {
			local20 = Static216.aClass53_3.method1523(local11.method9107());
			local26 = local11.method9105() & 0x3;
			local30 = local11.method9102();
			if (local20.anInt6266 == -1) {
				local47 = arg7;
				if (local20.anInt6278 > 0) {
					local47 = arg5;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method9330(arg6, 4, local47, arg1);
					} else if (local26 == 1) {
						arg4.method9402(4, arg1, local47, arg6);
					} else if (local26 == 2) {
						arg4.method9330(arg6 + 3, 4, local47, arg1);
					} else if (local26 == 3) {
						arg4.method9402(4, arg1 + 3, local47, arg6);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method9378(arg1, arg6, local47, 1, 1);
					} else if (local26 == 1) {
						arg4.method9378(arg1, arg6 + 3, local47, 1, 1);
					} else if (local26 == 2) {
						arg4.method9378(arg1 + 3, arg6 + 3, local47, 1, 1);
					} else if (local26 == 3) {
						arg4.method9378(arg1 + 3, arg6, local47, 1, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method9402(4, arg1, local47, arg6);
					} else if (local26 == 1) {
						arg4.method9330(arg6 + 3, 4, local47, arg1);
					} else if (local26 == 2) {
						arg4.method9402(4, arg1 + 3, local47, arg6);
					} else if (local26 == 3) {
						arg4.method9330(arg6, 4, local47, arg1);
					}
				}
			} else {
				Static600.method7709(arg4, arg1, arg6, local26, local20);
			}
		}
		local11 = (Interface9) Static405.method5449(arg0, arg2, arg3, aClass14 == null ? (aClass14 = Class115.a("et")) : aClass14);
		if (local11 != null) {
			local20 = Static216.aClass53_3.method1523(local11.method9107());
			local26 = local11.method9105() & 0x3;
			local30 = local11.method9102();
			if (local20.anInt6266 != -1) {
				Static600.method7709(arg4, arg1, arg6, local26, local20);
			} else if (local30 == 9) {
				local47 = -1118482;
				if (local20.anInt6278 > 0) {
					local47 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method9327(local47, arg1, arg1 + 3, arg6 + 3, arg6);
				} else {
					arg4.method9327(local47, arg1 + 3, arg1, arg6 + 3, arg6);
				}
			}
		}
		local11 = (Interface9) Static198.method3049(arg0, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static216.aClass53_3.method1523(local11.method9107());
		local26 = local11.method9105() & 0x3;
		if (local20.anInt6266 != -1) {
			Static600.method7709(arg4, arg1, arg6, local26, local20);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method2803(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub7_Sub21 local17 = Static136.method2378((long) arg0, 11);
		local17.method9260();
	}
}
