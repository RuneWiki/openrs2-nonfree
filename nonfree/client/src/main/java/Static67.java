import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "I")
	public static int anInt1550;

	@OriginalMember(owner = "client!cea", name = "I", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_13 = new Class264(50);

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)Lclient!ru;")
	public static Class217_Sub1 method1342() {
		Static118.anInt2444 = 0;
		return Static349.method5326();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILclient!mi;II)V")
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class232 arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class14_Sub9 local7 = null;
		for (@Pc(17) Class14_Sub9 local17 = (Class14_Sub9) Static659.aClass262_74.method6318(); local17 != null; local17 = (Class14_Sub9) Static659.aClass262_74.method6311()) {
			if (local17.anInt1592 == arg2 && arg4 == local17.anInt1584 && arg1 == local17.anInt1586 && arg0 == local17.anInt1591) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class14_Sub9();
			local7.anInt1586 = arg1;
			local7.anInt1592 = arg2;
			local7.anInt1591 = arg0;
			local7.anInt1584 = arg4;
			Static659.aClass262_74.method6314(local7);
		}
		local7.aClass232_1 = arg3;
		local7.aBoolean122 = false;
		local7.aBoolean123 = true;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZI)V")
	public static void method1345(@OriginalArg(1) int arg0) {
		if (Static430.anInt7691 == arg0) {
			return;
		}
		if (arg0 == 13) {
			Static352.method5345();
		}
		if (arg0 != 13 && Static524.aClass97_3 != null) {
			Static524.aClass97_3.method2286();
			Static524.aClass97_3 = null;
		}
		if (arg0 == 3) {
			Static616.method8659(Static563.anInt9769 != Static666.anInt11087);
		}
		if (arg0 == 7) {
			Static26.method486(Static563.anInt9769 != Static546.anInt9319);
		}
		if (arg0 == 5 || arg0 == 12) {
			Static262.method3786();
		} else if (arg0 == 6 || arg0 == 9) {
			Static352.method5345();
		}
		if (Static570.method8182(Static430.anInt7691)) {
			Static634.aClass386_134.anInt11070 = 2;
			Static345.aClass386_83.anInt11070 = 2;
			Static52.aClass386_15.anInt11070 = 2;
			Static598.aClass386_124.anInt11070 = 2;
			Static134.aClass386_56.anInt11070 = 2;
			Static29.aClass386_6.anInt11070 = 2;
			Static76.aClass386_18.anInt11070 = 2;
		}
		if (Static570.method8182(arg0)) {
			Static55.anInt1383 = 0;
			Static536.anInt9243 = 0;
			Static101.anInt2153 = 0;
			Static314.anInt5979 = 1;
			Static193.anInt3595 = 1;
			Static631.method8821(true);
			Static634.aClass386_134.anInt11070 = 1;
			Static345.aClass386_83.anInt11070 = 1;
			Static52.aClass386_15.anInt11070 = 1;
			Static598.aClass386_124.anInt11070 = 1;
			Static134.aClass386_56.anInt11070 = 1;
			Static29.aClass386_6.anInt11070 = 1;
			Static76.aClass386_18.anInt11070 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static268.method3929();
		}
		@Pc(173) boolean local173 = arg0 == 2 || Static469.method9286(arg0) || Static25.method478(arg0);
		@Pc(188) boolean local188 = Static430.anInt7691 == 2 || Static469.method9286(Static430.anInt7691) || Static25.method478(Static430.anInt7691);
		if (local173 != local188) {
			if (local173) {
				Static344.anInt11217 = Static203.anInt3760;
				if (Static56.aClass14_Sub22_5.aClass21_Sub20_3.method7115() == 0) {
					Static282.method4060();
				} else {
					Static126.method2101(Static203.anInt3760, Static56.aClass14_Sub22_5.aClass21_Sub20_3.method7115(), Static40.aClass386_19);
					Static669.method9260();
				}
				Static204.aClass135_8.method3070(false);
			} else {
				Static282.method4060();
				Static204.aClass135_8.method3070(true);
			}
		}
		if (Static570.method8182(arg0) || arg0 == 13) {
			Static677.aClass137_47.method7948();
		}
		Static430.anInt7691 = arg0;
	}
}
