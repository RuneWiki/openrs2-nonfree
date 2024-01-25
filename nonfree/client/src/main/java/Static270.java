import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "Lclient!gj;")
	public static Class143 aClass143_63;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIB)I")
	public static int method4304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		if (arg0 < arg1) {
			local6 = arg0;
			arg0 = arg1;
			arg1 = local6;
		}
		while (arg1 != 0) {
			local6 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4308(@OriginalArg(1) Class16 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 0;
		if (Static649.aBoolean735) {
			local7 = Static359.method5380();
			local14 = Static265.method7952();
		}
		@Pc(26) int local26 = local7 + Static567.anInt9059;
		@Pc(30) int local30 = Static467.anInt7972 + local14;
		@Pc(32) int local32 = Static108.anInt2244;
		@Pc(36) int local36 = Static464.anInt7952 - 3;
		Static449.method6472(Static567.anInt9059 + local7, Static464.anInt7952, Static569.aClass335_25.method7694(Static319.anInt5939), local14 + Static467.anInt7972, arg0, Static108.anInt2244);
		@Pc(60) int local60 = local7 + Static542.aClass75_1.method8412();
		@Pc(66) int local66 = local14 + Static542.aClass75_1.method8405();
		@Pc(70) int local70;
		@Pc(75) Class3_Sub6_Sub16 local75;
		@Pc(91) int local91;
		@Pc(271) int local271;
		@Pc(155) Class3_Sub6_Sub20 local155;
		@Pc(257) Class3_Sub6_Sub16 local257;
		if (Static548.aBoolean662) {
			local70 = 0;
			for (local155 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local155 != null; local155 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
				local91 = local30 + local70 * 16 + 20 + 13;
				if (Static567.anInt9059 + local7 < local60 && local60 < Static108.anInt2244 + Static567.anInt9059 + local7 && local66 > local91 - 13 && local91 + 4 > local66 && (local155.anInt9677 > 1 || ((Class3_Sub6_Sub16) local155.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67).aBoolean537)) {
					arg0.aa(Static567.anInt9059 + local7, local91 + -12, Static108.anInt2244, 16, 255 - Static613.anInt9546 << 24 | Static196.anInt3547, 1);
				}
				local70++;
			}
			if (Static407.aClass3_Sub6_Sub20_1 != null) {
				local70 = 0;
				Static449.method6472(Static382.anInt6708, Static274.anInt5127, Static407.aClass3_Sub6_Sub20_1.aString123, Static226.anInt6457, arg0, Static505.anInt8464);
				for (local257 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5934(); local257 != null; local257 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5929()) {
					local271 = Static226.anInt6457 + local70 * 16 + 13 + 20;
					local70++;
					if (Static382.anInt6708 < local60 && local60 < Static382.anInt6708 + Static505.anInt8464 && local66 > local271 - 13 && local271 + 4 > local66 && local257.aBoolean537) {
						arg0.aa(Static382.anInt6708, local271 - 12, Static505.anInt8464, 16, 255 - Static613.anInt9546 << 24 | Static196.anInt3547, 1);
					}
				}
				Static272.method4339(Static382.anInt6708, Static274.anInt5127, arg0, Static226.anInt6457, Static505.anInt8464);
			}
		} else {
			local70 = 0;
			for (local75 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local75 != null; local75 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				local91 = (Static37.anInt1104 - local70 - 1) * 16 + local30 + 13 + 20;
				if (local60 > Static567.anInt9059 + local7 && local60 < local7 + Static567.anInt9059 + Static108.anInt2244 && local66 > local91 - 13 && local66 < local91 + 4 && local75.aBoolean537) {
					arg0.aa(local7 + Static567.anInt9059, local91 + -12, Static108.anInt2244, 16, Static196.anInt3547 | 255 - Static613.anInt9546 << 24, 1);
				}
				local70++;
			}
		}
		Static272.method4339(local7 + Static567.anInt9059, Static464.anInt7952, arg0, Static467.anInt7972 + local14, Static108.anInt2244);
		if (Static548.aBoolean662) {
			local70 = 0;
			for (local155 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5934(); local155 != null; local155 = (Class3_Sub6_Sub20) Static239.aClass258_3.method5929()) {
				local91 = local70 * 16 + local14 + Static467.anInt7972 + 13 + 20;
				if (local155.anInt9677 == 1) {
					Static344.method5201((Class3_Sub6_Sub16) local155.aClass258_13.aClass3_Sub6_44.aClass3_Sub6_67, Static108.anInt2244, Static464.anInt7952, Static467.anInt7972 + local14, Static419.anInt7065 | 0xFF000000, local7 + Static567.anInt9059, Static417.anInt7046 | 0xFF000000, local60, local66, arg0, local91);
				} else {
					Static432.method6366(local66, local14 + Static467.anInt7972, local91, local60, local155, Static419.anInt7065 | 0xFF000000, Static464.anInt7952, Static108.anInt2244, arg0, local7 + Static567.anInt9059, Static417.anInt7046 | 0xFF000000);
				}
				local70++;
			}
			if (Static407.aClass3_Sub6_Sub20_1 != null) {
				local70 = 0;
				for (local257 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5934(); local257 != null; local257 = (Class3_Sub6_Sub16) Static407.aClass3_Sub6_Sub20_1.aClass258_13.method5929()) {
					local271 = Static226.anInt6457 + local70 * 16 + 13 + 20;
					Static344.method5201(local257, Static505.anInt8464, Static274.anInt5127, Static226.anInt6457, Static419.anInt7065 | 0xFF000000, Static382.anInt6708, Static417.anInt7046 | 0xFF000000, local60, local66, arg0, local271);
					local70++;
				}
				Static48.method1275(Static505.anInt8464, Static382.anInt6708, Static226.anInt6457, Static274.anInt5127);
			}
		} else {
			local70 = 0;
			for (local75 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4457(); local75 != null; local75 = (Class3_Sub6_Sub16) Static362.aClass193_32.method4459()) {
				local91 = (Static37.anInt1104 - local70 - 1) * 16 + local30 + 33;
				local70++;
				Static344.method5201(local75, local32, local36, local30, Static419.anInt7065 | 0xFF000000, local26, Static417.anInt7046 | 0xFF000000, local60, local66, arg0, local91);
			}
		}
		Static48.method1275(Static108.anInt2244, Static567.anInt9059 + local7, Static467.anInt7972 - -local14, Static464.anInt7952);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V")
	public static void method4313() {
		if (Static636.anInt9818 <= 1) {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub6_1, 2);
		} else {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub6_1, 4);
		}
	}
}
